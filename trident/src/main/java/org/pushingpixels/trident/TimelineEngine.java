/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.trident;

import org.pushingpixels.trident.Timeline.TimelineState;
import org.pushingpixels.trident.TimelineScenario.TimelineScenarioState;
import org.pushingpixels.trident.callback.RunOnUIThread;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * The Trident timeline engine. This is the main entry point to play {@link Timeline}s and
 * {@link TimelineScenario}s. Use the {@link #getInstance()} method to get the timeline engine.
 * 
 * @author Kirill Grouchnikov
 */
class TimelineEngine {
    /**
     * Debug mode indicator. Set to <code>true</code> to print trace messages to console
     * during development.
     */
    public static boolean DEBUG_MODE = false;

    /**
     * Single instance of <code>this</code> class.
     */
    private static TimelineEngine instance;

    /**
     * All currently running timelines.
     */
    private Set<Timeline> runningTimelines;

    enum TimelineOperationKind {
        PLAY, CANCEL, RESUME, SUSPEND, ABORT, END
    }

    class TimelineOperation {
        public TimelineOperationKind operationKind;

        Runnable operationRunnable;

        public TimelineOperation(TimelineOperationKind operationKind, Runnable operationRunnable) {
            this.operationKind = operationKind;
            this.operationRunnable = operationRunnable;
        }
    }

    private Set<TimelineScenario> runningScenarios;

    long lastIterationTimeStamp;

    /**
     * Identifies a main object and an optional secondary ID.
     * 
     * @author Kirill Grouchnikov
     */
    static class FullObjectID {
        /**
         * Main object for the timeline.
         */
        public Object mainObj;

        /**
         * ID to distinguish between different sub-components of {@link #mainObj}. For example, the
         * tabbed pane uses this field to make tab-specific animations.
         */
        @SuppressWarnings("unchecked")
        public Comparable subID;

        /**
         * Creates a new object ID.
         * 
         * @param mainObj
         *            The main object.
         * @param subID
         *            ID to distinguish between different sub-components of <code>mainObj</code>.
         *            Can be <code>null</code>.
         */
        @SuppressWarnings("unchecked")
        public FullObjectID(Object mainObj, Comparable subID) {
            this.mainObj = mainObj;
            this.subID = subID;
        }

        @Override
        public int hashCode() {
            int result = this.mainObj.hashCode();
            if (this.subID != null)
                result &= (this.subID.hashCode());
            return result;
        }

        @Override
        @SuppressWarnings("unchecked")
        public boolean equals(Object obj) {
            if (obj instanceof FullObjectID) {
                FullObjectID cid = (FullObjectID) obj;
                try {
                    boolean result = (this.mainObj == cid.mainObj);
                    if (this.subID == null) {
                        result = result && (cid.subID == null);
                    } else {
                        result = result && (this.subID.compareTo(cid.subID) == 0);
                    }
                    return result;
                } catch (Exception exc) {
                    return false;
                }
            }
            return false;
        }

        @Override
        public String toString() {
            return this.mainObj.getClass().getSimpleName() + ":" + this.subID;
        }
    }

    /**
     * The timeline thread.
     */
    TridentAnimationThread animatorThread;

    private BlockingQueue<Runnable> callbackQueue;

    private TimelineCallbackThread callbackThread;

    class TridentAnimationThread extends Thread {
        public TridentAnimationThread() {
            super();
            this.setName("Trident pulse source thread");
            this.setDaemon(true);
        }

        @Override
        public final void run() {
            TridentConfig.PulseSource pulseSource = TridentConfig.getInstance().getPulseSource();
            lastIterationTimeStamp = System.currentTimeMillis();
            while (true) {
                pulseSource.waitUntilNextPulse();
                updateTimelines();
                // engine.currLoopId++;
            }
        }

        @Override
        public void interrupt() {
            System.err.println("Interrupted");
            super.interrupt();
        }
    }

    private class TimelineCallbackThread extends Thread {
        public TimelineCallbackThread() {
            super();
            this.setName("Trident callback thread");
            this.setDaemon(true);
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Runnable runnable = callbackQueue.take();
                    runnable.run();
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }
        }
    }

    /**
     * Simple constructor. Defined private for singleton.
     * 
     * @see #getInstance()
     */
    private TimelineEngine() {
        this.runningTimelines = new HashSet<Timeline>();
        this.runningScenarios = new HashSet<TimelineScenario>();

        this.callbackQueue = new LinkedBlockingQueue<Runnable>();
        this.callbackThread = this.getCallbackThread();
    }

    /**
     * Gets singleton instance.
     * 
     * @return Singleton instance.
     */
    public synchronized static TimelineEngine getInstance() {
        if (TimelineEngine.instance == null) {
            TimelineEngine.instance = new TimelineEngine();
        }
        return TimelineEngine.instance;
    }

    /**
     * Updates all timelines that are currently registered with <code>this</code> tracker.
     */
    void updateTimelines() {
        synchronized (LOCK) {
            if ((this.runningTimelines.size() == 0) && (this.runningScenarios.size() == 0)) {
                this.lastIterationTimeStamp = System.currentTimeMillis();
                return;
            }

            long passedSinceLastIteration = (System.currentTimeMillis()
                    - this.lastIterationTimeStamp);
            if (passedSinceLastIteration < 0) {
                // ???
                passedSinceLastIteration = 0;
            }
            if (DEBUG_MODE) {
                System.out.println(
                        "Elapsed since last iteration: " + passedSinceLastIteration + "ms");
            }

            // System.err.println("Periodic update on "
            // + this.runningTimelines.size() + " timelines; "
            // + passedSinceLastIteration + " ms passed since last");
            // for (Timeline t : runningTimelines) {
            // if (t.mainObject != null
            // && t.mainObject.getClass().getName().indexOf(
            // "ProgressBar") >= 0) {
            // continue;
            // }
            // System.err.println("\tTimeline @"
            // + t.hashCode()
            // + " ["
            // + t.getName()
            // + "] on "
            // + (t.mainObject == null ? "null" : t.mainObject
            // .getClass().getName()));
            // }
            for (Iterator<Timeline> itTimeline = this.runningTimelines.iterator(); itTimeline
                    .hasNext();) {
                Timeline timeline = itTimeline.next();
                if (timeline.getState() == TimelineState.SUSPENDED)
                    continue;

                boolean timelineWasInReadyState = false;
                if (timeline.getState() == TimelineState.READY) {
                    if ((timeline.timeUntilPlay - passedSinceLastIteration) > 0) {
                        // still needs to wait in the READY state
                        timeline.timeUntilPlay -= passedSinceLastIteration;
                        continue;
                    }

                    // can go from READY to PLAYING
                    timelineWasInReadyState = true;
                    timeline.popState();
                    if (DEBUG_MODE) {
                        System.out.println("Moving " + timeline.id + " to READY");
                    }
                    this.callbackCallTimelineStateChanged(timeline, TimelineState.READY);
                }

                boolean hasEnded = false;
                if (DEBUG_MODE) {
                    System.out.println("Processing " + timeline.id + "["
                            + timeline.getMainObject().getClass().getSimpleName() + "] from "
                            + timeline.durationFraction + ". Callback - "
                            + (timeline.callbackChain == null ? "no" : "yes"));
                }
                // Component comp = entry.getKey();

                // at this point, the timeline must be playing
                switch (timeline.getState()) {
                case PLAYING_FORWARD:
                    if (!timelineWasInReadyState) {
                        timeline.durationFraction = timeline.durationFraction
                                + (float) passedSinceLastIteration / (float) timeline.getDuration();
                    }
                    timeline.timelinePosition = timeline.getEase().map(timeline.durationFraction);
                    if (DEBUG_MODE) {
                        System.out.println("Timeline " + timeline.id + " position: "
                                + ((long) (timeline.durationFraction * timeline.getDuration()))
                                + "/" + timeline.getDuration() + " = " + timeline.durationFraction);
                    }
                    if (timeline.durationFraction > 1.0f) {
                        timeline.durationFraction = 1.0f;
                        timeline.timelinePosition = 1.0f;
                        if (timeline.isLooping) {
                            boolean stopLoopingAnimation = timeline.toCancelAtCycleBreak;
                            int loopsToLive = timeline.repeatCount;
                            if (loopsToLive > 0) {
                                loopsToLive--;
                                stopLoopingAnimation = stopLoopingAnimation || (loopsToLive == 0);
                                timeline.repeatCount = loopsToLive;
                            }
                            if (stopLoopingAnimation) {
                                // end looping animation
                                hasEnded = true;
                                itTimeline.remove();
                            } else {
                                if (timeline.getRepeatBehavior() ==
                                        Timeline.RepeatBehavior.REVERSE) {
                                    timeline.replaceState(TimelineState.PLAYING_REVERSE);
                                    if (timeline.getCycleDelay() > 0) {
                                        timeline.pushState(TimelineState.READY);
                                        timeline.timeUntilPlay = timeline.getCycleDelay();
                                    }
                                    this.callbackCallTimelineStateChanged(timeline,
                                            TimelineState.PLAYING_FORWARD);
                                } else {
                                    timeline.durationFraction = 0.0f;
                                    timeline.timelinePosition = 0.0f;
                                    if (timeline.getCycleDelay() > 0) {
                                        timeline.pushState(TimelineState.READY);
                                        timeline.timeUntilPlay = timeline.getCycleDelay();
                                        this.callbackCallTimelineStateChanged(timeline,
                                                TimelineState.PLAYING_FORWARD);
                                    } else {
                                        // it's still playing forward, but lets
                                        // the app code know
                                        // that the new loop has begun
                                        this.callbackCallTimelineStateChanged(timeline,
                                                TimelineState.PLAYING_FORWARD);
                                    }
                                }
                            }
                        } else {
                            hasEnded = true;
                            itTimeline.remove();
                        }
                    }
                    break;
                case PLAYING_REVERSE:
                    if (!timelineWasInReadyState) {
                        timeline.durationFraction = timeline.durationFraction
                                - (float) passedSinceLastIteration / (float) timeline.getDuration();
                    }
                    timeline.timelinePosition = timeline.getEase().map(timeline.durationFraction);
                    // state.timelinePosition = state.timelinePosition
                    // - stepFactor
                    // * state.fadeStep.getNextStep(state.timelineKind,
                    // state.timelinePosition,
                    // state.isPlayingForward, state.isLooping);
                    if (DEBUG_MODE) {
                        System.out.println("Timeline position: "
                                + ((long) (timeline.durationFraction * timeline.getDuration()))
                                + "/" + timeline.getDuration() + " = " + timeline.durationFraction);
                    }
                    if (timeline.durationFraction < 0) {
                        timeline.durationFraction = 0.0f;
                        timeline.timelinePosition = 0.0f;
                        if (timeline.isLooping) {
                            boolean stopLoopingAnimation = timeline.toCancelAtCycleBreak;
                            int loopsToLive = timeline.repeatCount;
                            if (loopsToLive > 0) {
                                loopsToLive--;
                                stopLoopingAnimation = stopLoopingAnimation || (loopsToLive == 0);
                                timeline.repeatCount = loopsToLive;
                            }
                            if (stopLoopingAnimation) {
                                // end looping animation
                                hasEnded = true;
                                itTimeline.remove();
                            } else {
                                timeline.replaceState(TimelineState.PLAYING_FORWARD);
                                if (timeline.getCycleDelay() > 0) {
                                    timeline.pushState(TimelineState.READY);
                                    timeline.timeUntilPlay = timeline.getCycleDelay();
                                }
                                this.callbackCallTimelineStateChanged(timeline,
                                        TimelineState.PLAYING_REVERSE);
                            }
                        } else {
                            hasEnded = true;
                            itTimeline.remove();
                        }
                    }
                    break;
                default:
                    throw new IllegalStateException(
                            "Timeline cannot be in " + timeline.getState() + " state");
                }
                if (hasEnded) {
                    if (DEBUG_MODE) {
                        System.out.println("Ending " + timeline.id + " on "
                        // + timeline.timelineKind.toString()
                                + " in state " + timeline.getState().name() + " at position "
                                + timeline.durationFraction);
                    }
                    TimelineState oldState = timeline.getState();
                    timeline.replaceState(TimelineState.DONE);
                    this.callbackCallTimelineStateChanged(timeline, oldState);
                    timeline.popState();
                    if (timeline.getState() != TimelineState.IDLE) {
                        throw new IllegalStateException("Timeline should be IDLE at this point");
                    }
                    this.callbackCallTimelineStateChanged(timeline, TimelineState.DONE);
                } else {
                    if (DEBUG_MODE) {
                        System.out.println("Calling " + timeline.id + " on "
                        // + timeline.timelineKind.toString() + " at "
                                + timeline.durationFraction);
                    }
                    this.callbackCallTimelinePulse(timeline);
                }
            }

            if (this.runningScenarios.size() > 0) {
                // System.err.println(Thread.currentThread().getName()
                // + " : updating");
                for (Iterator<TimelineScenario> it = this.runningScenarios.iterator(); it
                        .hasNext();) {
                    TimelineScenario scenario = it.next();
                    if (scenario.state == TimelineScenarioState.DONE) {
                        it.remove();
                        this.callbackCallTimelineScenarioEnded(scenario);
                        continue;
                    }
                    Set<TimelineScenario.TimelineScenarioActor> readyActors = scenario
                            .getReadyActors();
                    if (readyActors != null) {
                        // if (readyActors.size() > 0)
                        // System.out.println("Scenario : " + scenario.state +
                        // ":"
                        // + readyActors.size());
                        for (TimelineScenario.TimelineScenarioActor readyActor : readyActors) {
                            readyActor.play();
                        }
                    }
                }
            }
            // System.err.println("Periodic update done");

            // this.nothingTracked = (this.runningTimelines.size() == 0);
            this.lastIterationTimeStamp = System.currentTimeMillis();
        }
    }

    private void callbackCallTimelineStateChanged(final Timeline timeline,
            final TimelineState oldState) {
        final TimelineState newState = timeline.getState();
        final float durationFraction = timeline.durationFraction;
        final float timelinePosition = timeline.timelinePosition;
        Runnable callbackRunnable = () -> {
            boolean shouldRunOnUIThread = false;
            Class<?> clazz = timeline.callbackChain.getClass();
            while ((clazz != null) && !shouldRunOnUIThread) {
                shouldRunOnUIThread = clazz.isAnnotationPresent(RunOnUIThread.class);
                clazz = clazz.getSuperclass();
            }
            if (shouldRunOnUIThread && (timeline.uiToolkitHandler != null)) {
                if (DEBUG_MODE) {
                    System.out.println("Scheduling callback state change from " + oldState.name()
                            + " to " + newState.name() + " on timeline " + timeline.id);
                }
                // System.out.println("Will update from " + oldState + " to " + newState);
                timeline.uiToolkitHandler.runOnUIThread(timeline.getMainObject(),
                        () -> timeline.callbackChain.onTimelineStateChanged(oldState, newState,
                                durationFraction, timelinePosition));
            } else {
                if (DEBUG_MODE) {
                    System.out.println("Calling callback state change from " + oldState.name()
                            + " to " + newState.name() + " on timeline " + timeline.id);
                }
                // System.out.println("Updating from " + oldState + " to " + newState);
                timeline.callbackChain.onTimelineStateChanged(oldState, newState, durationFraction,
                        timelinePosition);
            }
        };
        if (DEBUG_MODE) {
            System.out.println("Scheduling callback runnable for " + oldState.name() + " to "
                    + newState.name() + " on timeline " + timeline.id);
        }
        this.callbackQueue.add(callbackRunnable);
    }

    private void callbackCallTimelinePulse(final Timeline timeline) {
        final float durationFraction = timeline.durationFraction;
        final float timelinePosition = timeline.timelinePosition;
        Runnable callbackRunnable = () -> {
            boolean shouldRunOnUIThread = false;
            Class<?> clazz = timeline.callbackChain.getClass();
            while ((clazz != null) && !shouldRunOnUIThread) {
                shouldRunOnUIThread = clazz.isAnnotationPresent(RunOnUIThread.class);
                clazz = clazz.getSuperclass();
            }
            if (shouldRunOnUIThread && (timeline.uiToolkitHandler != null)) {
                timeline.uiToolkitHandler.runOnUIThread(timeline.getMainObject(),
                        () -> timeline.callbackChain.onTimelinePulse(durationFraction,
                                timelinePosition));
            } else {
                timeline.callbackChain.onTimelinePulse(durationFraction, timelinePosition);
            }
        };
        this.callbackQueue.add(callbackRunnable);
    }

    private void callbackCallTimelineScenarioEnded(final TimelineScenario timelineScenario) {
        Runnable callbackRunnable = () -> timelineScenario.callback.onTimelineScenarioDone();
        this.callbackQueue.offer(callbackRunnable);
    }

    /**
     * Returns an existing running timeline that matches the specified parameters.
     * 
     * @param timeline
     *            Timeline.
     * @return An existing running timeline that matches the specified parameters.
     */
    private Timeline getRunningTimeline(Timeline timeline) {
        synchronized (LOCK) {
            if (this.runningTimelines.contains(timeline))
                return timeline;
            return null;
        }
    }

    /**
     * Adds the specified timeline.
     * 
     * @param timeline
     *            Timeline to add.
     */
    private void addTimeline(Timeline timeline) {
        synchronized (LOCK) {
            FullObjectID cid = new FullObjectID(timeline.getMainObject(),
                    timeline.getSecondaryId());
            timeline.fullObjectID = cid;
            this.runningTimelines.add(timeline);
            // this.nothingTracked = false;
            if (DEBUG_MODE) {
                System.out.println(
                        "Added (" + timeline.id + ") on [" + timeline.fullObjectID + "]. State - "
                        // + timeline.timelineKind.toString() + " with state "
                                + timeline.getState().name() + ". Callback - "
                                + (timeline.callbackChain == null ? "no" : "yes"));
            }
        }
    }

    void play(Timeline timeline, boolean reset, long msToSkip) {
        synchronized (LOCK) {
            getAnimatorThread();

            // see if it's already tracked
            Timeline existing = this.getRunningTimeline(timeline);
            if (existing == null) {
                TimelineState oldState = timeline.getState();
                timeline.timeUntilPlay = timeline.getInitialDelay() - msToSkip;
                if (timeline.timeUntilPlay < 0) {
                    timeline.durationFraction = (float) -timeline.timeUntilPlay
                            / (float) timeline.getDuration();
                    timeline.timelinePosition = timeline.getEase().map(timeline.durationFraction);
                    timeline.timeUntilPlay = 0;
                } else {
                    timeline.durationFraction = 0.0f;
                    timeline.timelinePosition = 0.0f;
                }
                timeline.pushState(TimelineState.PLAYING_FORWARD);
                timeline.pushState(TimelineState.READY);
                this.addTimeline(timeline);

                this.callbackCallTimelineStateChanged(timeline, oldState);
            } else {
                TimelineState oldState = existing.getState();
                if (oldState == TimelineState.READY) {
                    // the timeline remains READY, but after that it will be
                    // PLAYING_FORWARD
                    existing.popState();
                    existing.replaceState(TimelineState.PLAYING_FORWARD);
                    existing.pushState(TimelineState.READY);
                } else {
                    // change the timeline state
                    existing.replaceState(TimelineState.PLAYING_FORWARD);
                    if (oldState != existing.getState()) {
                        this.callbackCallTimelineStateChanged(timeline, oldState);
                    }
                }
                if (reset) {
                    existing.durationFraction = 0.0f;
                    existing.timelinePosition = 0.0f;
                    this.callbackCallTimelinePulse(existing);
                }
            }
        }
    }

    void playScenario(TimelineScenario scenario) {
        synchronized (LOCK) {
            getAnimatorThread();
            Set<TimelineScenario.TimelineScenarioActor> readyActors = scenario.getReadyActors();

            // System.err.println(Thread.currentThread().getName() +
            // " : adding");
            this.runningScenarios.add(scenario);
            for (TimelineScenario.TimelineScenarioActor readyActor : readyActors) {
                readyActor.play();
            }
        }
    }

    void playReverse(Timeline timeline, boolean reset, long msToSkip) {
        synchronized (LOCK) {
            getAnimatorThread();
            if (timeline.isLooping) {
                throw new IllegalArgumentException("Timeline must not be marked as looping");
            }

            // see if it's already tracked
            Timeline existing = this.getRunningTimeline(timeline);
            if (existing == null) {
                TimelineState oldState = timeline.getState();
                timeline.timeUntilPlay = timeline.getInitialDelay() - msToSkip;
                if (timeline.timeUntilPlay < 0) {
                    timeline.durationFraction = 1.0f
                            - (float) -timeline.timeUntilPlay / (float) timeline.getDuration();
                    timeline.timelinePosition = timeline.getEase().map(timeline.durationFraction);
                    timeline.timeUntilPlay = 0;
                } else {
                    timeline.durationFraction = 1.0f;
                    timeline.timelinePosition = 1.0f;
                }
                timeline.pushState(TimelineState.PLAYING_REVERSE);
                timeline.pushState(TimelineState.READY);

                this.addTimeline(timeline);
                this.callbackCallTimelineStateChanged(timeline, oldState);
            } else {
                TimelineState oldState = existing.getState();
                if (oldState == TimelineState.READY) {
                    // the timeline remains READY, but after that it will be
                    // PLAYING_REVERSE
                    existing.popState();
                    existing.replaceState(TimelineState.PLAYING_REVERSE);
                    existing.pushState(TimelineState.READY);
                } else {
                    // change the timeline state
                    existing.replaceState(TimelineState.PLAYING_REVERSE);
                    if (oldState != existing.getState()) {
                        this.callbackCallTimelineStateChanged(timeline, oldState);
                    }
                }
                if (reset) {
                    existing.durationFraction = 1.0f;
                    existing.timelinePosition = 1.0f;
                    this.callbackCallTimelinePulse(existing);
                }
            }
        }
    }

    void playLoop(Timeline timeline, long msToSkip) {
        synchronized (LOCK) {
            getAnimatorThread();
            if (!timeline.isLooping) {
                throw new IllegalArgumentException("Timeline must be marked as looping");
            }

            // see if it's already tracked
            Timeline existing = this.getRunningTimeline(timeline);
            if (existing == null) {
                TimelineState oldState = timeline.getState();
                timeline.timeUntilPlay = timeline.getInitialDelay() - msToSkip;
                if (timeline.timeUntilPlay < 0) {
                    timeline.durationFraction = (float) -timeline.timeUntilPlay
                            / (float) timeline.getDuration();
                    timeline.timelinePosition = timeline.getEase().map(timeline.durationFraction);
                    timeline.timeUntilPlay = 0;
                } else {
                    timeline.durationFraction = 0.0f;
                    timeline.timelinePosition = 0.0f;
                }
                timeline.pushState(TimelineState.PLAYING_FORWARD);
                timeline.pushState(TimelineState.READY);
                timeline.toCancelAtCycleBreak = false;

                this.addTimeline(timeline);
                this.callbackCallTimelineStateChanged(timeline, oldState);
            } else {
                existing.toCancelAtCycleBreak = false;
                existing.repeatCount = timeline.repeatCount;
            }
        }
    }

    /**
     * Stops tracking of all timelines. Note that this function <b>does not</b> stop the timeline
     * engine thread ({@link #animatorThread}) and the timeline callback thread
     * ({@link #callbackThread}).
     */
    public void cancelAllTimelines() {
        synchronized (LOCK) {
            getAnimatorThread();
            for (Timeline timeline : this.runningTimelines) {
                TimelineState oldState = timeline.getState();
                while (timeline.getState() != TimelineState.IDLE)
                    timeline.popState();
                timeline.pushState(TimelineState.CANCELLED);
                this.callbackCallTimelineStateChanged(timeline, oldState);
                timeline.popState();
                this.callbackCallTimelineStateChanged(timeline, TimelineState.CANCELLED);
            }
            this.runningTimelines.clear();
            this.runningScenarios.clear();
        }
    }

    /**
     * Returns an instance of the animator thread.
     * 
     * @return The animator thread.
     */
    private TridentAnimationThread getAnimatorThread() {
        if (this.animatorThread == null) {
            this.animatorThread = new TridentAnimationThread();
            this.animatorThread.start();
        }
        return this.animatorThread;
    }

    /**
     * Returns an instance of the callback thread.
     * 
     * @return The animator thread.
     */
    private TimelineCallbackThread getCallbackThread() {
        if (this.callbackThread == null) {
            this.callbackThread = new TimelineCallbackThread();
            this.callbackThread.start();
        }
        return this.callbackThread;
    }

    /**
     * Cancels the specified timeline instance.
     * 
     * @param timeline
     *            Timeline to cancel.
     */
    private void cancelTimeline(Timeline timeline) {
        getAnimatorThread();
        if (this.runningTimelines.contains(timeline)) {
            this.runningTimelines.remove(timeline);
            TimelineState oldState = timeline.getState();
            while (timeline.getState() != TimelineState.IDLE)
                timeline.popState();
            timeline.pushState(TimelineState.CANCELLED);
            this.callbackCallTimelineStateChanged(timeline, oldState);
            timeline.popState();
            this.callbackCallTimelineStateChanged(timeline, TimelineState.CANCELLED);
        }
    }

    /**
     * Ends the specified timeline instance.
     * 
     * @param timeline
     *            Timeline to end.
     */
    private void endTimeline(Timeline timeline) {
        getAnimatorThread();
        if (this.runningTimelines.contains(timeline)) {
            this.runningTimelines.remove(timeline);
            TimelineState oldState = timeline.getState();
            float endPosition = timeline.timelinePosition;
            while (timeline.getState() != TimelineState.IDLE) {
                TimelineState state = timeline.popState();
                if (state == TimelineState.PLAYING_FORWARD)
                    endPosition = 1.0f;
                if (state == TimelineState.PLAYING_REVERSE)
                    endPosition = 0.0f;
            }
            timeline.durationFraction = endPosition;
            timeline.timelinePosition = endPosition;
            timeline.pushState(TimelineState.DONE);
            this.callbackCallTimelineStateChanged(timeline, oldState);
            timeline.popState();
            this.callbackCallTimelineStateChanged(timeline, TimelineState.DONE);
        }
    }

    /**
     * Cancels the specified timeline instance.
     * 
     * @param timeline
     *            Timeline to cancel.
     */
    private void abortTimeline(Timeline timeline) {
        getAnimatorThread();
        if (this.runningTimelines.contains(timeline)) {
            this.runningTimelines.remove(timeline);
            while (timeline.getState() != TimelineState.IDLE)
                timeline.popState();
        }
    }

    /**
     * Suspends the specified timeline instance.
     * 
     * @param timeline
     *            Timeline to suspend.
     */
    private void suspendTimeline(Timeline timeline) {
        getAnimatorThread();
        if (this.runningTimelines.contains(timeline)) {
            TimelineState oldState = timeline.getState();
            if ((oldState != TimelineState.PLAYING_FORWARD)
                    && (oldState != TimelineState.PLAYING_REVERSE)
                    && (oldState != TimelineState.READY)) {
                return;
            }
            timeline.pushState(TimelineState.SUSPENDED);
            this.callbackCallTimelineStateChanged(timeline, oldState);
        }
    }

    /**
     * Resume the specified timeline instance.
     * 
     * @param timeline
     *            Timeline to resume.
     */
    private void resumeTimeline(Timeline timeline) {
        getAnimatorThread();
        if (this.runningTimelines.contains(timeline)) {
            TimelineState oldState = timeline.getState();
            if (oldState != TimelineState.SUSPENDED)
                return;
            timeline.popState();
            this.callbackCallTimelineStateChanged(timeline, oldState);
        }
    }

    @SuppressWarnings("incomplete-switch")
    void runTimelineOperation(Timeline timeline, TimelineOperationKind operationKind,
            Runnable operationRunnable) {
        synchronized (LOCK) {
            this.getAnimatorThread();
            switch (operationKind) {
            case CANCEL:
                this.cancelTimeline(timeline);
                return;
            case END:
                this.endTimeline(timeline);
                return;
            case RESUME:
                this.resumeTimeline(timeline);
                return;
            case SUSPEND:
                this.suspendTimeline(timeline);
                return;
            case ABORT:
                this.abortTimeline(timeline);
                return;
            }
            operationRunnable.run();
        }
    }

    void runTimelineScenario(TimelineScenario timelineScenario, Runnable timelineScenarioRunnable) {
        synchronized (LOCK) {
            this.getAnimatorThread();
            timelineScenarioRunnable.run();
        }
    }

    static final Object LOCK = new Object();
}
