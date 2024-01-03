/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.animation.api.callback.TimelineScenarioCallback;

import java.util.*;

public class TimelineScenario {
    private Set<TimelineScenarioActor> waitingActors;

    private Set<TimelineScenarioActor> runningActors;

    private Set<TimelineScenarioActor> doneActors;

    private Map<TimelineScenarioActor, Set<TimelineScenarioActor>> dependencies;

    Chain callback;

    TimelineScenarioState state;

    TimelineScenarioState statePriorToSuspension;

    boolean isLooping;

    public enum TimelineScenarioState {
        DONE, PLAYING, IDLE, SUSPENDED
    }

    static class Chain implements TimelineScenarioCallback {
        private List<TimelineScenarioCallback> callbacks;

        public Chain(TimelineScenarioCallback... callbacks) {
            this.callbacks = new ArrayList<>();
            Collections.addAll(this.callbacks, callbacks);
        }

        public void addCallback(TimelineScenarioCallback callback) {
            this.callbacks.add(callback);
        }

        @Override
        public void onTimelineScenarioDone() {
            for (TimelineScenarioCallback callback : this.callbacks)
                callback.onTimelineScenarioDone();
        }
    }

    public interface TimelineScenarioActor {
        boolean isDone();

        boolean supportsReplay();

        void resetDoneFlag();

        void play();
    }

    public TimelineScenario() {
        this.waitingActors = new HashSet<>();
        this.runningActors = new HashSet<>();
        this.doneActors = new HashSet<>();

        this.dependencies = new HashMap<>();
        this.callback = new Chain();
        this.state = TimelineScenarioState.IDLE;
    }

    public void addScenarioActor(TimelineScenarioActor actor) {
        if (actor.isDone()) {
            throw new IllegalArgumentException("Already finished");
        }
        this.waitingActors.add(actor);
    }

    public void addCallback(TimelineScenarioCallback callback) {
        if (!this.doneActors.isEmpty()) {
            throw new IllegalArgumentException("Cannot change state of non-idle timeline scenario");
        }
        this.callback.addCallback(callback);
    }

    private void checkDependencyParam(TimelineScenarioActor actor) {
        if (!waitingActors.contains(actor)) {
            throw new IllegalArgumentException("Must be first added with addScenarioActor() API");
        }
    }

    public void addDependency(TimelineScenarioActor actor, TimelineScenarioActor... waitFor) {
        // check params
        this.checkDependencyParam(actor);
        for (TimelineScenarioActor wait : waitFor) {
            this.checkDependencyParam(wait);
        }

        if (!this.dependencies.containsKey(actor)) {
            this.dependencies.put(actor, new HashSet<>());
        }
        this.dependencies.get(actor).addAll(Arrays.asList(waitFor));
    }

    private void checkDoneActors() {
        synchronized (TimelineEngine.LOCK) {
            for (Iterator<TimelineScenarioActor> itRunning = this.runningActors
                    .iterator(); itRunning.hasNext(); ) {
                TimelineScenarioActor stillRunning = itRunning.next();
                if (stillRunning.isDone()) {
                    itRunning.remove();
                    this.doneActors.add(stillRunning);
                }
            }
        }
    }

    Set<TimelineScenarioActor> getReadyActors() {
        synchronized (TimelineEngine.LOCK) {
            if (this.state == TimelineScenarioState.SUSPENDED)
                return new HashSet<>();

            this.checkDoneActors();

            Set<TimelineScenarioActor> result = new HashSet<>();
            for (Iterator<TimelineScenarioActor> itWaiting = this.waitingActors
                    .iterator(); itWaiting.hasNext(); ) {
                TimelineScenarioActor waitingActor = itWaiting.next();
                boolean canRun = true;
                Set<TimelineScenarioActor> toWaitFor = this.dependencies.get(waitingActor);
                if (toWaitFor != null) {
                    for (TimelineScenarioActor actorToWaitFor : toWaitFor) {
                        if (!doneActors.contains(actorToWaitFor)) {
                            canRun = false;
                            break;
                        }
                    }
                }
                if (canRun) {
                    runningActors.add(waitingActor);
                    itWaiting.remove();
                    result.add(waitingActor);
                }
            }

            if (this.waitingActors.isEmpty() && this.runningActors.isEmpty()) {
                if (!this.isLooping) {
                    this.state = TimelineScenarioState.DONE;
                } else {
                    for (TimelineScenarioActor done : this.doneActors) {
                        done.resetDoneFlag();
                    }
                    this.waitingActors.addAll(this.doneActors);
                    this.doneActors.clear();
                }
            }

            return result;
        }
    }

    public void cancel() {
        synchronized (TimelineEngine.LOCK) {
            TimelineScenarioState oldState = this.state;
            if (oldState != TimelineScenarioState.PLAYING)
                return;
            this.state = TimelineScenarioState.DONE;

            for (TimelineScenarioActor waiting : this.waitingActors) {
                if (waiting instanceof Timeline) {
                    ((Timeline) waiting).cancel();
                }
            }
            for (TimelineScenarioActor running : this.runningActors) {
                if (running instanceof Timeline) {
                    ((Timeline) running).cancel();
                }
            }
        }
    }

    public void suspend() {
        synchronized (TimelineEngine.LOCK) {
            TimelineScenarioState oldState = this.state;
            if (oldState != TimelineScenarioState.PLAYING)
                return;
            this.statePriorToSuspension = oldState;
            this.state = TimelineScenarioState.SUSPENDED;

            for (TimelineScenarioActor running : this.runningActors) {
                if (running instanceof Timeline) {
                    ((Timeline) running).suspend();
                }
            }
        }
    }

    public void resume() {
        synchronized (TimelineEngine.LOCK) {
            TimelineScenarioState oldState = this.state;
            if (oldState != TimelineScenarioState.SUSPENDED)
                return;
            this.state = this.statePriorToSuspension;

            for (TimelineScenarioActor running : this.runningActors) {
                if (running instanceof Timeline) {
                    ((Timeline) running).resume();
                }
            }
        }
    }

    public void play() {
        this.isLooping = false;
        this.state = TimelineScenarioState.PLAYING;

        TimelineEngine.getInstance().runTimelineScenario(
                () -> TimelineEngine.getInstance().playScenario(TimelineScenario.this));
    }

    public void playLoop() {
        for (TimelineScenarioActor actor : this.waitingActors) {
            if (!actor.supportsReplay())
                throw new UnsupportedOperationException(
                        "Can't loop scenario with actor(s) that don't support replay");
        }
        this.isLooping = true;
        this.state = TimelineScenarioState.PLAYING;
        TimelineEngine.getInstance().runTimelineScenario(
                () -> TimelineEngine.getInstance().playScenario(TimelineScenario.this));
    }

    public static class Parallel extends TimelineScenario {
        @Override
        public void addDependency(TimelineScenarioActor actor, TimelineScenarioActor... waitFor) {
            throw new UnsupportedOperationException("Explicit dependencies not supported");
        }
    }

    public static class Sequence extends TimelineScenario {
        private TimelineScenarioActor lastActor;

        @Override
        public void addDependency(TimelineScenarioActor actor, TimelineScenarioActor... waitFor) {
            throw new UnsupportedOperationException("Explicit dependencies not supported");
        }

        @Override
        public void addScenarioActor(TimelineScenarioActor actor) {
            super.addScenarioActor(actor);
            if (this.lastActor != null) {
                super.addDependency(actor, this.lastActor);
            }
            this.lastActor = actor;
        }
    }

    public static class RendezvousSequence extends TimelineScenario {
        private Set<TimelineScenarioActor> addedSinceLastRendezvous;

        private Set<TimelineScenarioActor> addedPriorToLastRendezvous;

        public RendezvousSequence() {
            this.addedSinceLastRendezvous = new HashSet<>();
            this.addedPriorToLastRendezvous = new HashSet<>();
        }

        @Override
        public void addDependency(TimelineScenarioActor actor, TimelineScenarioActor... waitFor) {
            throw new UnsupportedOperationException("Explicit dependencies not supported");
        }

        @Override
        public void addScenarioActor(TimelineScenarioActor actor) {
            super.addScenarioActor(actor);
            this.addedSinceLastRendezvous.add(actor);
        }

        public void rendezvous() {
            // make all actors added since last rendezvous to wait for
            // all actors added prior to last rendezvous
            if (!this.addedPriorToLastRendezvous.isEmpty()) {
                for (TimelineScenarioActor sinceLast : this.addedSinceLastRendezvous) {
                    for (TimelineScenarioActor beforeLast : this.addedPriorToLastRendezvous) {
                        super.addDependency(sinceLast, beforeLast);
                    }
                }
            }

            this.addedPriorToLastRendezvous.clear();
            this.addedPriorToLastRendezvous.addAll(this.addedSinceLastRendezvous);
            this.addedSinceLastRendezvous.clear();
        }

        @Override
        public void play() {
            // add last implicit rendezvous
            this.rendezvous();
            super.play();
        }

        @Override
        public void playLoop() {
            // add last implicit rendezvous
            this.rendezvous();
            super.playLoop();
        }
    }

    public final TimelineScenarioState getState() {
        return this.state;
    }
}
