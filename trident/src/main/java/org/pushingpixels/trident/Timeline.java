/*
 * Copyright (c) 2005-2019 Trident Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Trident Kirill Grouchnikov nor the names of
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
package org.pushingpixels.trident;

import org.pushingpixels.trident.TimelineEngine.*;
import org.pushingpixels.trident.TimelinePropertyBuilder.AbstractFieldInfo;
import org.pushingpixels.trident.callback.*;
import org.pushingpixels.trident.ease.*;
import org.pushingpixels.trident.interpolator.KeyFrames;

import java.util.*;

public class Timeline implements TimelineScenario.TimelineScenarioActor {
    Object mainObject;

    Comparable<?> secondaryId;

    FullObjectID fullObjectID;

    long duration;

    long initialDelay;

    long cycleDelay;

    boolean isLooping;

    int repeatCount;

    RepeatBehavior repeatBehavior;

    UIToolkitHandler uiToolkitHandler;

    Chain callbackChain;

    String name;

    List<AbstractFieldInfo> propertiesToInterpolate;

    /**
     * Is used to create unique value for the {@link #id} field.
     */
    static long counter;

    /**
     * Unique ID.
     */
    protected long id;

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

    Stack<TimelineState> stateStack;

    TimelineEase ease;

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

        private TimelineState(boolean isActive) {
            this.isActive = isActive;
        }
    }

    private class Setter extends TimelineCallbackAdapter {
        @Override
        public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                float durationFraction, float timelinePosition) {
            if (newState == TimelineState.READY) {
                for (AbstractFieldInfo fInfo : propertiesToInterpolate) {
                    // check whether the object is in the ready state
                    if ((uiToolkitHandler != null)
                            && !uiToolkitHandler.isInReadyState(fInfo.object)) {
                        continue;
                    }
                    fInfo.onStart();
                }
            }

            // Fix for issue 5 - update field values only when
            // either old or new state (or both) are active. Otherwise
            // it's a transition between inactive states (such as from
            // DONE to IDLE) that shouldn't trigger the property changes
            if (oldState.isActive || newState.isActive) {
                for (AbstractFieldInfo fInfo : propertiesToInterpolate) {
                    // check whether the object is in the ready state
                    if ((uiToolkitHandler != null)
                            && !uiToolkitHandler.isInReadyState(fInfo.object)) {
                        continue;
                    }
                    fInfo.updateFieldValue(timelinePosition);
                }
            }
        }

        @Override
        public void onTimelinePulse(float durationFraction, float timelinePosition) {
            for (AbstractFieldInfo fInfo : propertiesToInterpolate) {
                // check whether the object is in the ready state
                if ((uiToolkitHandler != null) && !uiToolkitHandler.isInReadyState(fInfo.object)) {
                    continue;
                }
                // System.err.println("Timeline @" + Timeline.this.hashCode()
                // + " at position " + timelinePosition);
                fInfo.updateFieldValue(timelinePosition);
            }
        }
    }

    @RunOnUIThread
    private class UISetter extends Setter {
    }

    class Chain implements TimelineCallback {
        private TimelineCallback setterCallback;
        private List<TimelineCallback> callbacks;

        public Chain(Setter setterCallback) {
            this.setterCallback = setterCallback;
            this.callbacks = new ArrayList<TimelineCallback>();
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
                shouldRunOnUIThread = clazz.isAnnotationPresent(RunOnUIThread.class);
                clazz = clazz.getSuperclass();
            }
            if (shouldRunOnUIThread && (Timeline.this.uiToolkitHandler != null)) {
                Timeline.this.uiToolkitHandler.runOnUIThread(mainObject,
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
            if ((uiToolkitHandler != null) && !shouldForceUiUpdate() &&
                    !uiToolkitHandler.isInReadyState(mainObject)) {
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
                shouldRunOnUIThread = clazz.isAnnotationPresent(RunOnUIThread.class);
                clazz = clazz.getSuperclass();
            }
            if (shouldRunOnUIThread && (Timeline.this.uiToolkitHandler != null)) {
                Timeline.this.uiToolkitHandler.runOnUIThread(mainObject, () -> {
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
            if ((uiToolkitHandler != null) && !shouldForceUiUpdate() &&
                    !uiToolkitHandler.isInReadyState(mainObject)) {
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

    public Timeline() {
        this(null);
    }

    public Timeline(Object mainTimelineObject) {
        this.mainObject = mainTimelineObject;

        for (UIToolkitHandler uiToolkitHandler : TridentConfig.getInstance()
                .getUIToolkitHandlers()) {
            if (uiToolkitHandler.isHandlerFor(mainTimelineObject)) {
                this.uiToolkitHandler = uiToolkitHandler;
                break;
            }
        }

        // if the main timeline object is handled by a UI toolkit handler,
        // the setters registered with the different addProperty
        // APIs need to run with the matching threading policy
        Setter setterCallback = (this.uiToolkitHandler != null) ? new UISetter() : new Setter();
        this.callbackChain = new Chain(setterCallback);

        this.duration = 500;
        this.propertiesToInterpolate = new ArrayList<AbstractFieldInfo>();
        this.id = Timeline.getId();
        // this.loopsToLive = -1;

        this.stateStack = new Stack<TimelineState>();
        this.stateStack.push(TimelineState.IDLE);
        this.doneCount = 0;

        this.ease = new Linear();
    }

    public final void setSecondaryID(Comparable<?> secondaryId) {
        if (this.getState() != TimelineState.IDLE) {
            throw new IllegalArgumentException(
                    "Cannot change state of non-idle timeline [" + this.toString() + "]");
        }
        this.secondaryId = secondaryId;
    }

    public final void setDuration(long durationMs) {
        if (this.getState() != TimelineState.IDLE) {
            throw new IllegalArgumentException(
                    "Cannot change state of non-idle timeline [" + this.toString() + "]");
        }
        this.duration = durationMs;
    }

    public final void setInitialDelay(long initialDelay) {
        if (this.getState() != TimelineState.IDLE) {
            throw new IllegalArgumentException(
                    "Cannot change state of non-idle timeline [" + this.toString() + "]");
        }
        this.initialDelay = initialDelay;
    }

    public final void setCycleDelay(long cycleDelay) {
        if (this.getState() != TimelineState.IDLE) {
            throw new IllegalArgumentException(
                    "Cannot change state of non-idle timeline [" + this.toString() + "]");
        }
        this.cycleDelay = cycleDelay;
    }

    public final void addCallback(TimelineCallback callback) {
        if (this.getState() != TimelineState.IDLE) {
            throw new IllegalArgumentException(
                    "Cannot change state of non-idle timeline [" + this.toString() + "]");
        }
        this.callbackChain.addCallback(callback);
    }

    public final void removeCallback(TimelineCallback callback) {
        if (this.getState() != TimelineState.IDLE) {
            throw new IllegalArgumentException(
                    "Cannot change state of non-idle timeline [" + this.toString() + "]");
        }
        this.callbackChain.removeCallback(callback);
    }

    public static <T> TimelinePropertyBuilder<T> property(String propertyName) {
        return new TimelinePropertyBuilder<T>(propertyName);
    }

    public final <T> void addPropertyToInterpolate(TimelinePropertyBuilder<T> propertyBuilder) {
        if (this.getState() != TimelineState.IDLE) {
            throw new IllegalArgumentException(
                    "Cannot add properties to non-idle timeline [" + this.toString() + "]");
        }
        this.propertiesToInterpolate.add(propertyBuilder.getFieldInfo(this));
    }

    public final <T> void addPropertyToInterpolate(String propName, KeyFrames<T> keyFrames) {
        this.addPropertyToInterpolate(Timeline.<T>property(propName).goingThrough(keyFrames));
    }

    public final <T> void addPropertyToInterpolate(String propName, T from, T to) {
        this.addPropertyToInterpolate(Timeline.<T>property(propName).from(from).to(to));
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

    public final void setEase(TimelineEase ease) {
        if (this.getState() != TimelineState.IDLE) {
            throw new IllegalArgumentException("Cannot change state of non-idle timeline");
        }
        this.ease = ease;
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
        for (AbstractFieldInfo afi : this.propertiesToInterpolate) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getMainObject() {
        return this.mainObject;
    }
}