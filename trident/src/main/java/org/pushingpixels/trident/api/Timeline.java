/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.trident.api;

import org.pushingpixels.trident.api.TimelineEngine.FullObjectID;
import org.pushingpixels.trident.api.TimelineEngine.TimelineOperationKind;
import org.pushingpixels.trident.api.TimelinePropertyBuilder.AbstractFieldInfo;
import org.pushingpixels.trident.api.callback.TimelineCallback;
import org.pushingpixels.trident.api.callback.TimelineCallbackAdapter;
import org.pushingpixels.trident.api.ease.Linear;
import org.pushingpixels.trident.api.ease.TimelineEase;
import org.pushingpixels.trident.api.interpolator.KeyFrames;
import org.pushingpixels.trident.api.swing.RunOnEventDispatchThread;
import org.pushingpixels.trident.internal.swing.SwingUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.Supplier;

/**
 * The main entry point into Trident. Use {@link #builder()} or {@link #builder(Object)}
 * and methods on the {@link Timeline.BaseBuilder} to configure one or more properties to
 * be interpolated over a period of time. In the simplest case, a timeline operates on
 * a single object passed to {@link #builder(Object)}, and one or more properties that have
 * matching public setters. In that case, use the
 * {@link Timeline.BaseBuilder#addPropertyToInterpolate(String, Object, Object)} API to configure
 * which properties should be interpolated.
 *
 * In a more complex case, use
 * {@link Timeline.BaseBuilder#addPropertyToInterpolate(TimelinePropertyBuilder)} together with
 * {@link Timeline#property(String)} and {@link TimelinePropertyBuilder#on(Object)} to interpolate
 * properties of multiple objects.
 * {@link TimelinePropertyBuilder#setWith(TimelinePropertyBuilder.PropertySetter)},
 * {@link TimelinePropertyBuilder#getWith(TimelinePropertyBuilder.PropertyGetter)} and
 * {@link TimelinePropertyBuilder#accessWith(TimelinePropertyBuilder.PropertyAccessor)}
 * can be used to work with properties that are not exposed via public setters or getters.
 */
public class Timeline implements TimelineScenario.TimelineScenarioActor {
    public static final long DEFAULT_DURATION = 500;
    public static final TimelineEase DEFAULT_EASE = new Linear();

    private Object mainObject;

    private Comparable<?> secondaryId;

    FullObjectID fullObjectID;

    private long duration;

    private long initialDelay;

    private long cycleDelay;

    boolean isLooping;

    int repeatCount;

    private RepeatBehavior repeatBehavior;

    private boolean mainObjectIsUiComponent;

    Chain callbackChain;

    private String name;

    private List<AbstractFieldInfo<?>> propertiesToInterpolate;

    /**
     * Is used to create unique value for the {@link #id} field.
     */
    private static long counter;

    /**
     * Unique ID.
     */
    long id;

    /**
     * Timeline position.
     */
    float durationFraction;

    /**
     * Timeline position.
     */
    float timelinePosition;

    long timeUntilPlay;

    /**
     * Indication whether the looping timeline should stop at reaching the end of the cycle.
     * Relevant only when {@link #isLooping} is <code>true</code>.
     */
    boolean toCancelAtCycleBreak;

    private Stack<TimelineState> stateStack;

    private TimelineEase ease;

    private int doneCount;

    public enum RepeatBehavior {
        LOOP, REVERSE
    }

    public enum TimelineState {
        IDLE(false),
        READY(false),
        PLAYING_FORWARD(true),
        PLAYING_REVERSE(true),
        SUSPENDED(false),
        CANCELLED(false),
        DONE(false);

        private boolean isActive;

        TimelineState(boolean isActive) {
            this.isActive = isActive;
        }
    }

    private class Setter extends TimelineCallbackAdapter {
        @Override
        public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                float durationFraction, float timelinePosition) {
            if (newState == TimelineState.READY) {
                for (AbstractFieldInfo<?> fInfo : propertiesToInterpolate) {
                    // check whether the object is in the ready state
                    if (mainObjectIsUiComponent && !SwingUtils.isComponentInReadyState(fInfo.object)) {
                        continue;
                    }
                    fInfo.onStart();
                }
            }

            if (newState == TimelineState.PLAYING_FORWARD) {
                for (AbstractFieldInfo<?> fInfo : propertiesToInterpolate) {
                    // check whether the object is in the ready state
                    if (mainObjectIsUiComponent && !SwingUtils.isComponentInReadyState(fInfo.object)) {
                        continue;
                    }
                    fInfo.updateTo();
                }
            }

            if (newState == TimelineState.PLAYING_REVERSE) {
                for (AbstractFieldInfo<?> fInfo : propertiesToInterpolate) {
                    // check whether the object is in the ready state
                    if (mainObjectIsUiComponent && !SwingUtils.isComponentInReadyState(fInfo.object)) {
                        continue;
                    }
                    fInfo.updateFrom();
                }
            }

            // Fix for issue 5 - update field values only when
            // either old or new state (or both) are active. Otherwise
            // it's a transition between inactive states (such as from
            // DONE to IDLE) that shouldn't trigger the property changes
            if (oldState.isActive || newState.isActive) {
                for (AbstractFieldInfo<?> fInfo : propertiesToInterpolate) {
                    // check whether the object is in the ready state
                    if (mainObjectIsUiComponent
                            && !SwingUtils.isComponentInReadyState(fInfo.object)) {
                        continue;
                    }
                    fInfo.updateFieldValue(timelinePosition);
                }
            }
        }

        @Override
        public void onTimelinePulse(float durationFraction, float timelinePosition) {
            for (AbstractFieldInfo<?> fInfo : propertiesToInterpolate) {
                // check whether the object is in the ready state
                if (mainObjectIsUiComponent && !SwingUtils.isComponentInReadyState(fInfo.object)) {
                    continue;
                }
                // System.err.println("Timeline @" + Timeline.this.hashCode()
                // + " at position " + timelinePosition);
                fInfo.updateFieldValue(timelinePosition);
            }
        }
    }

    @RunOnEventDispatchThread
    private class UISetter extends Setter {
    }

    class Chain implements TimelineCallback {
        private TimelineCallback setterCallback;
        private List<TimelineCallback> callbacks;

        public Chain(Setter setterCallback) {
            this.setterCallback = setterCallback;
            this.callbacks = new ArrayList<>();
        }

        public void addCallback(TimelineCallback callback) {
            this.callbacks.add(callback);
        }

        public void removeCallback(TimelineCallback callback) {
            this.callbacks.remove(callback);
        }

        private void handleStateChange(final TimelineCallback callback,
                final TimelineState oldState, final TimelineState newState,
                final float durationFraction, final float timelinePosition) {
            // special handling for chained callbacks not running on UI
            // thread
            boolean shouldRunOnUIThread = false;
            Class<?> clazz = callback.getClass();
            while ((clazz != null) && !shouldRunOnUIThread) {
                shouldRunOnUIThread = clazz.isAnnotationPresent(RunOnEventDispatchThread.class);
                clazz = clazz.getSuperclass();
            }
            if (shouldRunOnUIThread && Timeline.this.mainObjectIsUiComponent) {
                SwingUtils.runOnEventDispatchThread(
                        () -> callback.onTimelineStateChanged(oldState, newState, durationFraction,
                                timelinePosition));
            } else {
                callback.onTimelineStateChanged(oldState, newState, durationFraction,
                        timelinePosition);
            }
        }

        @Override
        public void onTimelineStateChanged(final TimelineState oldState,
                final TimelineState newState, final float durationFraction,
                final float timelinePosition) {
            if (mainObjectIsUiComponent && !shouldForceUiUpdate() &&
                    !SwingUtils.isComponentInReadyState(mainObject)) {
                if (TimelineEngine.DEBUG_MODE) {
                    System.out.println("Main object [" + mainObject.getClass().getSimpleName()
                            + "@" + mainObject.hashCode()
                            + "] is not in ready state for " + oldState.name()
                            + " to " + newState.name());
                }
                return;
            }

            handleStateChange(this.setterCallback, oldState, newState, durationFraction,
                    timelinePosition);
            for (int i = this.callbacks.size() - 1; i >= 0; i--) {
                handleStateChange(this.callbacks.get(i), oldState, newState, durationFraction,
                        timelinePosition);
            }
        }

        private void handlePulse(final TimelineCallback callback, final float durationFraction,
                final float timelinePosition) {
            // special handling for chained callbacks not running on UI
            // thread
            boolean shouldRunOnUIThread = false;
            Class<?> clazz = callback.getClass();
            while ((clazz != null) && !shouldRunOnUIThread) {
                shouldRunOnUIThread = clazz.isAnnotationPresent(RunOnEventDispatchThread.class);
                clazz = clazz.getSuperclass();
            }
            if (shouldRunOnUIThread && Timeline.this.mainObjectIsUiComponent) {
                SwingUtils.runOnEventDispatchThread(() -> {
                    if (Timeline.this.getState() == TimelineState.CANCELLED) {
                        return;
                    }
                    // System.err.println("Timeline @"
                    // + Timeline.this.hashCode());
                    callback.onTimelinePulse(durationFraction, timelinePosition);
                });
            } else {
                // System.err.println("Timeline @" +
                // Timeline.this.hashCode());
                callback.onTimelinePulse(durationFraction, timelinePosition);
            }
        }

        @Override
        public void onTimelinePulse(final float durationFraction, final float timelinePosition) {
            if (mainObjectIsUiComponent && !shouldForceUiUpdate() &&
                    !SwingUtils.isComponentInReadyState(mainObject)) {
                if (TimelineEngine.DEBUG_MODE) {
                    System.out.println(
                            "Main object is not in ready state for pulse " + durationFraction);
                }
                return;
            }

            handlePulse(this.setterCallback, durationFraction, timelinePosition);
            for (int i = this.callbacks.size() - 1; i >= 0; i--) {
                handlePulse(this.callbacks.get(i), durationFraction, timelinePosition);
            }
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Object mainTimelineObject) {
        return new Builder(mainTimelineObject);
    }

    protected Timeline(Object mainTimelineObject) {
        this.mainObject = mainTimelineObject;
        this.mainObjectIsUiComponent = SwingUtils.isUiComponent(this.mainObject);

        // if the main timeline object is handled by a UI toolkit handler,
        // the setters registered with the different addProperty
        // APIs need to run with the matching threading policy
        Setter setterCallback = this.mainObjectIsUiComponent ? new UISetter() : new Setter();
        this.callbackChain = new Chain(setterCallback);

        this.duration = DEFAULT_DURATION;
        this.propertiesToInterpolate = new ArrayList<>();
        this.id = Timeline.getId();
        // this.loopsToLive = -1;

        this.stateStack = new Stack<>();
        this.stateStack.push(TimelineState.IDLE);
        this.doneCount = 0;

        this.ease = DEFAULT_EASE;
    }

    protected final void addCallback(TimelineCallback callback) {
        if (this.getState() != TimelineState.IDLE) {
            throw new IllegalArgumentException(
                    "Cannot change state of non-idle timeline [" + this.toString() + "]");
        }
        this.callbackChain.addCallback(callback);
    }

    public static <T> TimelinePropertyBuilder<T> property(String propertyName) {
        return new TimelinePropertyBuilder<>(propertyName);
    }

    protected boolean shouldForceUiUpdate() {
        return false;
    }

    public void play() {
        this.playSkipping(0);
    }

    public void playSkipping(final long msToSkip) {
        if ((this.initialDelay + this.duration) < msToSkip) {
            throw new IllegalArgumentException(
                    "Required skip longer than initial delay + duration");
        }
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineOperationKind.PLAY, () -> {
            Timeline.this.isLooping = false;
            TimelineEngine.getInstance().play(Timeline.this, false, msToSkip);
        });
    }

    public void playReverse() {
        playReverseSkipping(0);
    }

    public void playReverseSkipping(final long msToSkip) {
        if ((this.initialDelay + this.duration) < msToSkip) {
            throw new IllegalArgumentException(
                    "Required skip longer than initial delay + duration");
        }
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineOperationKind.PLAY, () -> {
            Timeline.this.isLooping = false;
            TimelineEngine.getInstance().playReverse(Timeline.this, false, msToSkip);
        });
    }

    public void replay() {
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineOperationKind.PLAY, () -> {
            Timeline.this.isLooping = false;
            TimelineEngine.getInstance().play(Timeline.this, true, 0);
        });
    }

    public void replayReverse() {
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineOperationKind.PLAY, () -> {
            Timeline.this.isLooping = false;
            TimelineEngine.getInstance().playReverse(Timeline.this, true, 0);
        });
    }

    public void playLoop(RepeatBehavior repeatBehavior) {
        this.playLoop(-1, repeatBehavior);
    }

    public void playLoopSkipping(RepeatBehavior repeatBehavior, final long msToSkip) {
        this.playLoopSkipping(-1, repeatBehavior, msToSkip);
    }

    public void playLoop(int loopCount, RepeatBehavior repeatBehavior) {
        this.playLoopSkipping(loopCount, repeatBehavior, 0);
    }

    public void playLoopSkipping(final int loopCount, final RepeatBehavior repeatBehavior,
            final long msToSkip) {
        if ((this.initialDelay + this.duration) < msToSkip) {
            throw new IllegalArgumentException(
                    "Required skip longer than initial delay + duration");
        }
        for (AbstractFieldInfo<?> fieldInfo : this.propertiesToInterpolate) {
            if (fieldInfo.isFromCurrent()) {
                throw new IllegalArgumentException(
                        "Can't loop a timeline that has at least one property with .fromCurrent()");
            }
        }
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineOperationKind.PLAY, () -> {
            Timeline.this.isLooping = true;
            Timeline.this.repeatCount = loopCount;
            Timeline.this.repeatBehavior = repeatBehavior;
            TimelineEngine.getInstance().playLoop(Timeline.this, msToSkip);
        });
    }

    /**
     * Cancels this timeline. The timeline transitions to the {@link TimelineState#CANCELLED} state,
     * preserving its current timeline position. After application callbacks and field
     * interpolations are done on the {@link TimelineState#CANCELLED} state, the timeline
     * transitions to the {@link TimelineState#IDLE} state. Application callbacks and field
     * interpolations are done on this state as well.
     *
     * @see #end()
     * @see #abort()
     */
    public void cancel() {
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineOperationKind.CANCEL, null);
    }

    /**
     * Ends this timeline. The timeline transitions to the {@link TimelineState#DONE} state, with
     * the timeline position set to 0.0 or 1.0 - based on the direction of the timeline. After
     * application callbacks and field interpolations are done on the {@link TimelineState#DONE}
     * state, the timeline transitions to the {@link TimelineState#IDLE} state. Application
     * callbacks and field interpolations are done on this state as well.
     *
     * @see #cancel()
     * @see #abort()
     */
    public void end() {
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineOperationKind.END, null);
    }

    /**
     * Aborts this timeline. The timeline transitions to the {@link TimelineState#IDLE} state. No
     * application callbacks or field interpolations are done.
     *
     * @see #cancel()
     * @see #end()
     */
    public void abort() {
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineOperationKind.ABORT, null);
    }

    public void suspend() {
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineOperationKind.SUSPEND,
                null);
    }

    public void resume() {
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineOperationKind.RESUME, null);
    }

    /**
     * Requests that the specified timeline should stop at the end of the cycle. This method should
     * be called only on looping timelines.
     */
    public void cancelAtCycleBreak() {
        if (!this.isLooping) {
            throw new IllegalArgumentException("Can only be called on looping timelines");
        }
        this.toCancelAtCycleBreak = true;
    }

    /**
     * Returns a unique ID.
     *
     * @return Unique ID.
     */
    protected static synchronized long getId() {
        return counter++;
    }

    public final float getTimelinePosition() {
        return this.timelinePosition;
    }

    public final float getDurationFraction() {
        return this.durationFraction;
    }

    public final TimelineState getState() {
        return this.stateStack.peek();
    }

    @Override
    public boolean isDone() {
        return (this.doneCount > 0);
    }

    @Override
    public boolean supportsReplay() {
        return true;
    }

    @Override
    public void resetDoneFlag() {
        this.doneCount = 0;
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append("[" + this.id + "] ");
        if (this.name != null) {
            res.append(this.name);
        }
        if (this.mainObject != null) {
            res.append(":" + this.mainObject.getClass().getName());
        }
        if (this.secondaryId != null) {
            res.append(":" + this.secondaryId.toString());
        }

        res.append(" " + this.getState().name());
        res.append(":" + this.timelinePosition);

        res.append(" [ ");
        for (AbstractFieldInfo<?> afi : this.propertiesToInterpolate) {
            res.append(afi.fieldName + " ");
        }
        res.append("]");

        return res.toString();
    }

    void replaceState(TimelineState state) {
        this.stateStack.pop();
        this.pushState(state);
    }

    void pushState(TimelineState state) {
        if (state == TimelineState.DONE) {
            this.doneCount++;
        }
        this.stateStack.add(state);
    }

    TimelineState popState() {
        return this.stateStack.pop();
    }

    public final long getDuration() {
        return this.duration;
    }

    public long getInitialDelay() {
        return this.initialDelay;
    }

    public long getCycleDelay() {
        return this.cycleDelay;
    }

    public RepeatBehavior getRepeatBehavior() {
        return this.repeatBehavior;
    }

    public String getName() {
        return this.name;
    }

    public TimelineEase getEase() {
        return this.ease;
    }

    public Object getMainObject() {
        return this.mainObject;
    }

    public Comparable<?> getSecondaryId() {
        return this.secondaryId;
    }

    public abstract static class BaseBuilder<T extends Timeline, B extends BaseBuilder<?, ?, ?>, M> {
        protected M mainObject;
        protected Comparable<?> secondaryId;
        protected long duration = Timeline.DEFAULT_DURATION;
        protected long initialDelay;
        protected long cycleDelay;
        protected int repeatCount;
        protected RepeatBehavior repeatBehavior;
        protected List<TimelineCallback> callbacks = new ArrayList<>();
        protected String name;
        protected List<AbstractFieldInfo<?>> propertiesToInterpolate = new ArrayList<>();
        protected TimelineEase ease = Timeline.DEFAULT_EASE;

        public BaseBuilder() {
            this(null);
        }

        public BaseBuilder(M mainObject) {
            this.mainObject = mainObject;
        }

        protected void configureBaseTimeline(Timeline timeline) {
            timeline.secondaryId = this.secondaryId;
            timeline.duration = this.duration;
            timeline.initialDelay = this.initialDelay;
            timeline.cycleDelay = this.cycleDelay;
            timeline.repeatCount = this.repeatCount;
            timeline.repeatBehavior = this.repeatBehavior;
            timeline.name = this.name;
            timeline.ease = this.ease;

            for (TimelineCallback callback : this.callbacks) {
                timeline.callbackChain.addCallback(callback);
            }

            timeline.propertiesToInterpolate.addAll(this.propertiesToInterpolate);
        }

        @SuppressWarnings("unchecked")
        public B setSecondaryId(Comparable<?> secondaryId) {
            this.secondaryId = secondaryId;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setDuration(long duration) {
            this.duration = duration;
            return (B) this;
        }

        public long getDuration() {
            return this.duration;
        }

        @SuppressWarnings("unchecked")
        public B setInitialDelay(long initialDelay) {
            this.initialDelay = initialDelay;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setCycleDelay(long cycleDelay) {
            this.cycleDelay = cycleDelay;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setRepeatCount(int repeatCount) {
            this.repeatCount = repeatCount;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setRepeatBehavior(RepeatBehavior repeatBehavior) {
            this.repeatBehavior = repeatBehavior;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setName(String name) {
            this.name = name;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setEase(TimelineEase ease) {
            this.ease = ease;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public <P> B addPropertyToInterpolate(TimelinePropertyBuilder<P> propertyBuilder) {
            this.propertiesToInterpolate.add(propertyBuilder.getFieldInfo(this.mainObject));
            return (B) this;
        }

        public <P> B addPropertyToInterpolate(String propName, KeyFrames<P> keyFrames) {
            return this.addPropertyToInterpolate(
                    Timeline.<P>property(propName).goingThrough(keyFrames));
        }

        public <P> B addPropertyToInterpolate(String propName, P from, P to) {
            return this.addPropertyToInterpolate(Timeline.<P>property(propName).from(from).to(to));
        }

        public <P> B addPropertyToInterpolate(String propName, Supplier<P> fromSupplier, Supplier<P> toSupplier) {
            return this.addPropertyToInterpolate(Timeline.<P>property(propName).fromSupplier(fromSupplier).
                    toSupplier(toSupplier));
        }

        @SuppressWarnings("unchecked")
        public B addCallback(TimelineCallback callback) {
            this.callbacks.add(callback);
            return (B) this;
        }

        public abstract T build();

        /**
         * A shortcut for {@link #build()} chained with {@link Timeline#play()}
         */
        public void play() {
            build().play();
        }

        /**
         * A shortcut for {@link #build()} chained with {@link Timeline#playSkipping(long)}
         */
        public void playSkipping(final long msToSkip) {
            build().playSkipping(msToSkip);
        }

        /**
         * A shortcut for {@link #build()} chained with {@link Timeline#playReverse()}
         */
        public void playReverse() {
            build().playReverse();
        }

        /**
         * A shortcut for {@link #build()} chained with {@link Timeline#playReverseSkipping(long)}
         */
        public void playReverseSkipping(final long msToSkip) {
            build().playReverseSkipping(msToSkip);
        }

        /**
         * A shortcut for {@link #build()} chained with {@link Timeline#playLoop(RepeatBehavior)}
         */
        public void playLoop(RepeatBehavior repeatBehavior) {
            build().playLoop(repeatBehavior);
        }

        /**
         * A shortcut for {@link #build()} chained with
         * {@link Timeline#playLoopSkipping(RepeatBehavior, long)}
         */
        public void playLoopSkipping(RepeatBehavior repeatBehavior, final long msToSkip) {
            build().playLoopSkipping(repeatBehavior, msToSkip);
        }

        /**
         * A shortcut for {@link #build()} chained with
         * {@link Timeline#playLoop(int, RepeatBehavior)}
         */
        public void playLoop(int loopCount, RepeatBehavior repeatBehavior) {
            build().playLoop(loopCount, repeatBehavior);
        }

        /**
         * A shortcut for {@link #build()} chained with
         * {@link Timeline#playLoopSkipping(int, RepeatBehavior, long)}
         */
        public void playLoopSkipping(final int loopCount, final RepeatBehavior repeatBehavior,
                final long msToSkip) {
            build().playLoopSkipping(loopCount, repeatBehavior, msToSkip);
        }
    }

    public static class Builder extends BaseBuilder<Timeline, Builder, Object> {
        public Builder() {
        }

        public Builder(Object mainObject) {
            super(mainObject);
        }

        @Override
        public Timeline build() {
            Timeline timeline = new Timeline(this.mainObject);
            this.configureBaseTimeline(timeline);
            return timeline;
        }
    }
}