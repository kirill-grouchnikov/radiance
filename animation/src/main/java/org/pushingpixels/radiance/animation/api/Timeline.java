/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.animation.api;

import org.pushingpixels.radiance.animation.api.callback.TimelineCallback;
import org.pushingpixels.radiance.animation.api.callback.TimelineCallbackAdapter;
import org.pushingpixels.radiance.animation.api.ease.Linear;
import org.pushingpixels.radiance.animation.api.ease.TimelineEase;
import org.pushingpixels.radiance.animation.api.interpolator.KeyFrames;
import org.pushingpixels.radiance.animation.api.swing.RunOnEventDispatchThread;
import org.pushingpixels.radiance.animation.internal.swing.SwingUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.Supplier;

/**
 * The main entry point into Animation. Use {@link #builder()} or {@link #builder(Object)}
 * and methods on the {@link Timeline.BaseBuilder} to configure one or more properties to
 * be interpolated over a period of time. In the simplest case, a timeline operates on
 * a single object passed to {@link #builder(Object)}, and one or more properties that have
 * matching public setters. In that case, use the
 * {@link Timeline.BaseBuilder#addPropertyToInterpolate(String, Object, Object)} API to configure
 * which properties should be interpolated.
 * <p>
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
    /**
     * Default animation duration in milliseconds.
     */
    public static final long DEFAULT_DURATION = 500;

    /**
     * Default easing function.
     */
    public static final TimelineEase DEFAULT_EASE = new Linear();

    private Object mainObject;

    private Comparable<?> secondaryId;

    TimelineEngine.FullObjectID fullObjectID;

    private long duration;

    private long initialDelay;

    private long cycleDelay;

    boolean isLooping;

    int repeatCount;

    private RepeatBehavior repeatBehavior;

    private boolean allowsOvershoot;

    private boolean mainObjectIsUiComponent;

    Chain callbackChain;

    private String name;

    private List<TimelinePropertyBuilder.AbstractFieldInfo<?>> propertiesToInterpolate;

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

    /**
     * Defines how a looping timeline should behave at cycle boundaries.
     */
    public enum RepeatBehavior {
        /** Loop forward continuously. */
        LOOP,
        /** Reverse direction at each cycle boundary. */
        REVERSE
    }

    /**
     * Represents the current state of a timeline.
     */
    public enum TimelineState {
        /** Timeline is idle and not running. */
        IDLE(false),
        /** Timeline is ready to start. */
        READY(false),
        /** Timeline is playing forward. */
        PLAYING_FORWARD(true),
        /** Timeline is playing in reverse. */
        PLAYING_REVERSE(true),
        /** Timeline is suspended. */
        SUSPENDED(false),
        /** Timeline has been cancelled. */
        CANCELLED(false),
        /** Timeline has finished. */
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
                for (TimelinePropertyBuilder.AbstractFieldInfo<?> fInfo : propertiesToInterpolate) {
                    // check whether the object is in the ready state
                    if (mainObjectIsUiComponent && !SwingUtils.isComponentInReadyState(fInfo.object)) {
                        continue;
                    }
                    fInfo.onStart();
                }
            }

            if (newState == TimelineState.PLAYING_FORWARD) {
                for (TimelinePropertyBuilder.AbstractFieldInfo<?> fInfo : propertiesToInterpolate) {
                    // check whether the object is in the ready state
                    if (mainObjectIsUiComponent && !SwingUtils.isComponentInReadyState(fInfo.object)) {
                        continue;
                    }
                    fInfo.updateTo();
                }
            }

            if (newState == TimelineState.PLAYING_REVERSE) {
                for (TimelinePropertyBuilder.AbstractFieldInfo<?> fInfo : propertiesToInterpolate) {
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
                for (TimelinePropertyBuilder.AbstractFieldInfo<?> fInfo : propertiesToInterpolate) {
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
            for (TimelinePropertyBuilder.AbstractFieldInfo<?> fInfo : propertiesToInterpolate) {
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

    /**
     * Creates a builder for a timeline without a main object.
     *
     * @return A new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Creates a builder for a timeline with the specified main object.
     *
     * @param mainTimelineObject The main object whose properties will be animated.
     * @return A new builder.
     */
    public static Builder builder(Object mainTimelineObject) {
        return new Builder(mainTimelineObject);
    }

    /**
     * Constructs a new timeline for the specified main object.
     *
     * @param mainTimelineObject The main object whose properties will be animated.
     */
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

    /**
     * Adds a callback to this timeline. Only valid when the timeline is in the IDLE state.
     *
     * @param callback The callback to add.
     * @throws IllegalArgumentException if the timeline is not in the IDLE state.
     */
    protected final void addCallback(TimelineCallback callback) {
        if (this.getState() != TimelineState.IDLE) {
            throw new IllegalArgumentException(
                    "Cannot change state of non-idle timeline [" + this.toString() + "]");
        }
        this.callbackChain.addCallback(callback);
    }

    /**
     * Creates a property builder for the specified property name.
     *
     * @param <T> The type of the property value.
     * @param propertyName The name of the property.
     * @return A new property builder.
     */
    public static <T> TimelinePropertyBuilder<T> property(String propertyName) {
        return new TimelinePropertyBuilder<>(propertyName);
    }

    /**
     * Returns whether UI updates should be forced even when the component is not in a ready state.
     *
     * @return {@code true} if UI updates should be forced.
     */
    protected boolean shouldForceUiUpdate() {
        return false;
    }

    /**
     * Starts playing this timeline from the beginning.
     */
    public void play() {
        this.playSkipping(0);
    }

    /**
     * Starts playing this timeline, skipping the specified number of milliseconds.
     *
     * @param msToSkip The number of milliseconds to skip from the beginning.
     * @throws IllegalArgumentException if the skip amount exceeds initial delay + duration.
     */
    public void playSkipping(final long msToSkip) {
        if ((this.initialDelay + this.duration) < msToSkip) {
            throw new IllegalArgumentException(
                    "Required skip longer than initial delay + duration");
        }
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineEngine.TimelineOperationKind.PLAY, () -> {
            Timeline.this.isLooping = false;
            TimelineEngine.getInstance().play(Timeline.this, false, msToSkip);
        });
    }

    /**
     * Starts playing this timeline in reverse from the end.
     */
    public void playReverse() {
        playReverseSkipping(0);
    }

    /**
     * Starts playing this timeline in reverse, skipping the specified number of milliseconds.
     *
     * @param msToSkip The number of milliseconds to skip from the end.
     * @throws IllegalArgumentException if the skip amount exceeds initial delay + duration.
     */
    public void playReverseSkipping(final long msToSkip) {
        if ((this.initialDelay + this.duration) < msToSkip) {
            throw new IllegalArgumentException(
                    "Required skip longer than initial delay + duration");
        }
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineEngine.TimelineOperationKind.PLAY, () -> {
            Timeline.this.isLooping = false;
            TimelineEngine.getInstance().playReverse(Timeline.this, false, msToSkip);
        });
    }

    /**
     * Replays this timeline from the beginning, resetting to the initial state first.
     */
    public void replay() {
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineEngine.TimelineOperationKind.PLAY, () -> {
            Timeline.this.isLooping = false;
            TimelineEngine.getInstance().play(Timeline.this, true, 0);
        });
    }

    /**
     * Replays this timeline in reverse from the end, resetting to the initial state first.
     */
    public void replayReverse() {
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineEngine.TimelineOperationKind.PLAY, () -> {
            Timeline.this.isLooping = false;
            TimelineEngine.getInstance().playReverse(Timeline.this, true, 0);
        });
    }

    /**
     * Starts playing this timeline in a loop with the specified repeat behavior.
     * The loop runs indefinitely.
     *
     * @param repeatBehavior The behavior at cycle boundaries (LOOP or REVERSE).
     */
    public void playLoop(RepeatBehavior repeatBehavior) {
        this.playLoop(-1, repeatBehavior);
    }

    /**
     * Starts playing this timeline in a loop, skipping the specified number of milliseconds.
     * The loop runs indefinitely.
     *
     * @param repeatBehavior The behavior at cycle boundaries (LOOP or REVERSE).
     * @param msToSkip The number of milliseconds to skip from the beginning.
     */
    public void playLoopSkipping(RepeatBehavior repeatBehavior, final long msToSkip) {
        this.playLoopSkipping(-1, repeatBehavior, msToSkip);
    }

    /**
     * Starts playing this timeline in a loop with the specified repeat behavior and loop count.
     *
     * @param loopCount The number of loops (-1 for infinite).
     * @param repeatBehavior The behavior at cycle boundaries (LOOP or REVERSE).
     */
    public void playLoop(int loopCount, RepeatBehavior repeatBehavior) {
        this.playLoopSkipping(loopCount, repeatBehavior, 0);
    }

    /**
     * Starts playing this timeline in a loop with the specified repeat behavior, loop count, and skip amount.
     *
     * @param loopCount The number of loops (-1 for infinite).
     * @param repeatBehavior The behavior at cycle boundaries (LOOP or REVERSE).
     * @param msToSkip The number of milliseconds to skip from the beginning.
     * @throws IllegalArgumentException if the skip amount exceeds initial delay + duration.
     * @throws IllegalArgumentException if any property uses {@code fromCurrent()}.
     */
    public void playLoopSkipping(final int loopCount, final RepeatBehavior repeatBehavior,
            final long msToSkip) {
        if ((this.initialDelay + this.duration) < msToSkip) {
            throw new IllegalArgumentException(
                    "Required skip longer than initial delay + duration");
        }
        for (TimelinePropertyBuilder.AbstractFieldInfo<?> fieldInfo : this.propertiesToInterpolate) {
            if (fieldInfo.isFromCurrent()) {
                throw new IllegalArgumentException(
                        "Can't loop a timeline that has at least one property with .fromCurrent()");
            }
        }
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineEngine.TimelineOperationKind.PLAY, () -> {
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
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineEngine.TimelineOperationKind.CANCEL, null);
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
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineEngine.TimelineOperationKind.END, null);
    }

    /**
     * Aborts this timeline. The timeline transitions to the {@link TimelineState#IDLE} state. No
     * application callbacks or field interpolations are done.
     *
     * @see #cancel()
     * @see #end()
     */
    public void abort() {
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineEngine.TimelineOperationKind.ABORT, null);
    }

    /**
     * Suspends this timeline, pausing execution while preserving its current state.
     */
    public void suspend() {
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineEngine.TimelineOperationKind.SUSPEND,
                null);
    }

    /**
     * Resumes a previously suspended timeline.
     */
    public void resume() {
        TimelineEngine.getInstance().runTimelineOperation(this, TimelineEngine.TimelineOperationKind.RESUME, null);
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

    /**
     * Returns the current timeline position as a value between 0.0 and 1.0.
     *
     * @return The current timeline position.
     */
    public final float getTimelinePosition() {
        return this.timelinePosition;
    }

    /**
     * Returns the current duration fraction as a value between 0.0 and 1.0.
     *
     * @return The current duration fraction.
     */
    public final float getDurationFraction() {
        return this.durationFraction;
    }

    /**
     * Returns the current state of this timeline.
     *
     * @return The current timeline state.
     */
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
        for (TimelinePropertyBuilder.AbstractFieldInfo<?> afi : this.propertiesToInterpolate) {
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

    /**
     * Returns the duration of this timeline in milliseconds.
     *
     * @return The duration in milliseconds.
     */
    public final long getDuration() {
        return this.duration;
    }

    /**
     * Returns the initial delay before the timeline starts in milliseconds.
     *
     * @return The initial delay in milliseconds.
     */
    public long getInitialDelay() {
        return this.initialDelay;
    }

    /**
     * Returns the delay between cycles for looping timelines in milliseconds.
     *
     * @return The cycle delay in milliseconds.
     */
    public long getCycleDelay() {
        return this.cycleDelay;
    }

    /**
     * Returns the repeat behavior for looping timelines.
     *
     * @return The repeat behavior, or {@code null} if not set.
     */
    public RepeatBehavior getRepeatBehavior() {
        return this.repeatBehavior;
    }

    /**
     * Returns whether this timeline allows overshoot in easing functions.
     *
     * @return {@code true} if overshoot is allowed.
     */
    public boolean allowsOvershoot() {
        return this.allowsOvershoot;
    }

    /**
     * Returns the name of this timeline.
     *
     * @return The timeline name, or {@code null} if not set.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the easing function for this timeline.
     *
     * @return The easing function.
     */
    public TimelineEase getEase() {
        return this.ease;
    }

    /**
     * Returns the main object being animated by this timeline.
     *
     * @return The main object.
     */
    public Object getMainObject() {
        return this.mainObject;
    }

    /**
     * Returns the secondary identifier for this timeline.
     *
     * @return The secondary ID, or {@code null} if not set.
     */
    public Comparable<?> getSecondaryId() {
        return this.secondaryId;
    }

    /**
     * Abstract builder for configuring and building timeline instances.
     *
     * @param <T> The type of the timeline being built.
     * @param <B> The type of the builder.
     * @param <M> The type of the main object.
     */
    public abstract static class BaseBuilder<T extends Timeline, B extends BaseBuilder<?, ?, ?>, M> {
        /** The main object being animated. */
        protected M mainObject;
        /** Secondary identifier for the timeline. */
        protected Comparable<?> secondaryId;
        /** Duration in milliseconds. */
        protected long duration = Timeline.DEFAULT_DURATION;
        /** Initial delay in milliseconds. */
        protected long initialDelay;
        /** Delay between cycles in milliseconds. */
        protected long cycleDelay;
        /** Number of repeats. */
        protected int repeatCount;
        /** Repeat behavior for looping. */
        protected RepeatBehavior repeatBehavior;
        /** Whether overshoot is allowed. */
        protected boolean allowsOvershoot;
        /** Callbacks registered with the timeline. */
        protected List<TimelineCallback> callbacks = new ArrayList<>();
        /** Timeline name. */
        protected String name;
        /** Properties to interpolate. */
        protected List<TimelinePropertyBuilder.AbstractFieldInfo<?>> propertiesToInterpolate = new ArrayList<>();
        /** Easing function. */
        protected TimelineEase ease = Timeline.DEFAULT_EASE;

        /**
         * Default constructor.
         */
        public BaseBuilder() {
            this(null);
        }

        /**
         * Constructs a builder with the specified main object.
         *
         * @param mainObject The main object.
         */
        public BaseBuilder(M mainObject) {
            this.mainObject = mainObject;
        }

        /**
         * Configures the base timeline with the builder's settings.
         *
         * @param timeline The timeline to configure.
         */
        protected void configureBaseTimeline(Timeline timeline) {
            timeline.secondaryId = this.secondaryId;
            timeline.duration = this.duration;
            timeline.initialDelay = this.initialDelay;
            timeline.cycleDelay = this.cycleDelay;
            timeline.repeatCount = this.repeatCount;
            timeline.repeatBehavior = this.repeatBehavior;
            timeline.allowsOvershoot = this.allowsOvershoot;
            timeline.name = this.name;
            timeline.ease = this.ease;

            for (TimelineCallback callback : this.callbacks) {
                timeline.callbackChain.addCallback(callback);
            }

            timeline.propertiesToInterpolate.addAll(this.propertiesToInterpolate);
        }

        /**
         * Sets the secondary identifier.
         *
         * @param secondaryId The secondary ID.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setSecondaryId(Comparable<?> secondaryId) {
            this.secondaryId = secondaryId;
            return (B) this;
        }

        /**
         * Sets the duration in milliseconds.
         *
         * @param duration The duration.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setDuration(long duration) {
            this.duration = duration;
            return (B) this;
        }

        /**
         * Returns the duration in milliseconds.
         *
         * @return The duration.
         */
        public long getDuration() {
            return this.duration;
        }

        /**
         * Sets the initial delay in milliseconds.
         *
         * @param initialDelay The initial delay.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setInitialDelay(long initialDelay) {
            this.initialDelay = initialDelay;
            return (B) this;
        }

        /**
         * Sets the cycle delay in milliseconds.
         *
         * @param cycleDelay The cycle delay.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setCycleDelay(long cycleDelay) {
            this.cycleDelay = cycleDelay;
            return (B) this;
        }

        /**
         * Sets the repeat count.
         *
         * @param repeatCount The repeat count.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setRepeatCount(int repeatCount) {
            this.repeatCount = repeatCount;
            return (B) this;
        }

        /**
         * Sets the repeat behavior.
         *
         * @param repeatBehavior The repeat behavior.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setRepeatBehavior(RepeatBehavior repeatBehavior) {
            this.repeatBehavior = repeatBehavior;
            return (B) this;
        }

        /**
         * Sets whether overshoot is allowed.
         *
         * @param allowsOvershoot Whether overshoot is allowed.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setAllowsOvershoot(boolean allowsOvershoot) {
            this.allowsOvershoot = allowsOvershoot;
            return (B) this;
        }

        /**
         * Sets the timeline name.
         *
         * @param name The name.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setName(String name) {
            this.name = name;
            return (B) this;
        }

        /**
         * Sets the easing function.
         *
         * @param ease The easing function.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setEase(TimelineEase ease) {
            this.ease = ease;
            return (B) this;
        }

        /**
         * Adds a property to interpolate using the given property builder.
         *
         * @param <P> The property type.
         * @param propertyBuilder The property builder.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public <P> B addPropertyToInterpolate(TimelinePropertyBuilder<P> propertyBuilder) {
            this.propertiesToInterpolate.add(propertyBuilder.getFieldInfo(this.mainObject));
            return (B) this;
        }

        /**
         * Adds a property to interpolate using the given key frames.
         *
         * @param <P> The property type.
         * @param propName The property name.
         * @param keyFrames The key frames.
         * @return This builder.
         */
        public <P> B addPropertyToInterpolate(String propName, KeyFrames<P> keyFrames) {
            return this.addPropertyToInterpolate(
                    Timeline.<P>property(propName).goingThrough(keyFrames));
        }

        /**
         * Adds a property to interpolate from one value to another.
         *
         * @param <P> The property type.
         * @param propName The property name.
         * @param from The start value.
         * @param to The end value.
         * @return This builder.
         */
        public <P> B addPropertyToInterpolate(String propName, P from, P to) {
            return this.addPropertyToInterpolate(Timeline.<P>property(propName).from(from).to(to));
        }

        /**
         * Adds a property to interpolate using supplier functions for start and end values.
         *
         * @param <P> The property type.
         * @param propName The property name.
         * @param fromSupplier The supplier for the start value.
         * @param toSupplier The supplier for the end value.
         * @return This builder.
         */
        public <P> B addPropertyToInterpolate(String propName, Supplier<P> fromSupplier, Supplier<P> toSupplier) {
            return this.addPropertyToInterpolate(Timeline.<P>property(propName).fromSupplier(fromSupplier).
                    toSupplier(toSupplier));
        }

        /**
         * Adds a callback to the timeline.
         *
         * @param callback The callback to add.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B addCallback(TimelineCallback callback) {
            this.callbacks.add(callback);
            return (B) this;
        }

        /**
         * Builds and returns the configured timeline instance.
         *
         * @return The built timeline.
         */
        public abstract T build();

        /**
         * A shortcut for {@link #build()} chained with {@link Timeline#play()}
         */
        public void play() {
            build().play();
        }

        /**
         * A shortcut for {@link #build()} chained with {@link Timeline#playSkipping(long)}
         *
         * @param msToSkip The number of milliseconds to skip from the beginning.
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
         *
         * @param msToSkip The number of milliseconds to skip from the end.
         */
        public void playReverseSkipping(final long msToSkip) {
            build().playReverseSkipping(msToSkip);
        }

        /**
         * A shortcut for {@link #build()} chained with {@link Timeline#playLoop(RepeatBehavior)}
         *
         * @param repeatBehavior The behavior at cycle boundaries (LOOP or REVERSE).
         */
        public void playLoop(RepeatBehavior repeatBehavior) {
            build().playLoop(repeatBehavior);
        }

        /**
         * A shortcut for {@link #build()} chained with
         * {@link Timeline#playLoopSkipping(RepeatBehavior, long)}
         *
         * @param repeatBehavior The behavior at cycle boundaries (LOOP or REVERSE).
         * @param msToSkip The number of milliseconds to skip from the beginning.
         */
        public void playLoopSkipping(RepeatBehavior repeatBehavior, final long msToSkip) {
            build().playLoopSkipping(repeatBehavior, msToSkip);
        }

        /**
         * A shortcut for {@link #build()} chained with
         * {@link Timeline#playLoop(int, RepeatBehavior)}
         *
         * @param loopCount The number of loops (-1 for infinite).
         * @param repeatBehavior The behavior at cycle boundaries (LOOP or REVERSE).
         */
        public void playLoop(int loopCount, RepeatBehavior repeatBehavior) {
            build().playLoop(loopCount, repeatBehavior);
        }

        /**
         * A shortcut for {@link #build()} chained with
         * {@link Timeline#playLoopSkipping(int, RepeatBehavior, long)}
         *
         * @param loopCount The number of loops (-1 for infinite).
         * @param repeatBehavior The behavior at cycle boundaries (LOOP or REVERSE).
         * @param msToSkip The number of milliseconds to skip from the beginning.
         */
        public void playLoopSkipping(final int loopCount, final RepeatBehavior repeatBehavior,
                final long msToSkip) {
            build().playLoopSkipping(loopCount, repeatBehavior, msToSkip);
        }
    }

    /**
     * Builder for creating {@link Timeline} instances.
     */
    public static class Builder extends BaseBuilder<Timeline, Builder, Object> {
        /**
         * Default constructor.
         */
        public Builder() {
        }

        /**
         * Constructs a builder with the specified main object.
         *
         * @param mainObject The main object.
         */
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
