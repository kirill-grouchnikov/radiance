/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.animation;

import org.pushingpixels.radiance.common.api.UiThreadingViolationException;
import org.pushingpixels.radiance.common.api.model.TriStateButtonModel;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.renderer.RadianceRenderer;
import org.pushingpixels.radiance.theming.internal.AnimationConfigurationManager;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.animation.api.Timeline.RepeatBehavior;
import org.pushingpixels.radiance.animation.api.Timeline.TimelineState;
import org.pushingpixels.radiance.animation.api.callback.TimelineCallback;
import org.pushingpixels.radiance.animation.api.callback.TimelineCallbackAdapter;
import org.pushingpixels.radiance.animation.api.swing.SwingComponentTimeline;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintCallback;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;
import javax.swing.table.TableCellRenderer;
import javax.swing.tree.TreeCellRenderer;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.HashMap;
import java.util.Map;

public class StateTransitionTracker {
    public interface RepaintCallback {
        TimelineCallback getRepaintCallback();
    }

    private JComponent component;

    private ButtonModel model;
    private TriStateButtonModel triStateModel;

    private ChangeListener modelChangeListener;

    private Timeline transitionTimeline;

    private float transitionPosition;

    /**
     * Listener on the focus gain and loss.
     */
    private FocusListener focusListener;

    private Timeline focusTimeline;

    private Timeline focusLoopTimeline;

    private IconGlowTracker iconGlowTracker;

    private StateTransitionTracker.RepaintCallback repaintCallback;

    private boolean isAutoTrackingModelChanges;

    private EventListenerList eventListenerList;

    private String name;

    private ModelStateInfo modelStateInfo;

    public static class StateContributionInfo {
        float start;

        float end;

        float curr;

        public StateContributionInfo(float start, float end) {
            this.start = start;
            this.end = end;
            this.curr = start;
        }

        public float getContribution() {
            return curr;
        }

        void updateContribution(float timelinePosition) {
            this.curr = this.start + timelinePosition * (this.end - this.start);
        }
    }

    public static class ModelStateInfo {
        private Map<ComponentState, StateContributionInfo> stateContributionMap;

        private Map<ComponentState, StateContributionInfo> stateNoSelectionContributionMap;

        private ComponentState currState;

        private ComponentState currStateNoSelection;

        float activeStrength;

        public ModelStateInfo() {
            this.stateContributionMap = new HashMap<>();
            this.stateNoSelectionContributionMap = new HashMap<>();
            this.activeStrength = 0.0f;
        }

        public ComponentState getCurrModelState() {
            return currState;
        }

        public ComponentState getCurrModelStateNoSelection() {
            return currStateNoSelection;
        }

        public Map<ComponentState, StateContributionInfo> getStateContributionMap() {
            return this.stateContributionMap;
        }

        public Map<ComponentState, StateContributionInfo> getStateNoSelectionContributionMap() {
            return this.stateNoSelectionContributionMap;
        }

        void sync() {
            this.activeStrength = 0.0f;
            for (Map.Entry<ComponentState, StateContributionInfo> activeEntry : this
                    .stateContributionMap.entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState.isActive()) {
                    this.activeStrength += activeEntry.getValue().getContribution();
                }
            }
        }

        float getActiveStrength() {
            return this.activeStrength;
        }

        void clear() {
            if (!SwingUtilities.isEventDispatchThread()) {
                UiThreadingViolationException uiThreadingViolationError = new
                        UiThreadingViolationException(
                        "State tracking must be done on Event Dispatch Thread");
                uiThreadingViolationError.printStackTrace(System.err);
                throw uiThreadingViolationError;
            }
            this.stateContributionMap.clear();
            this.stateContributionMap.put(this.currState, new StateContributionInfo(1.0f, 1.0f));
            this.stateNoSelectionContributionMap.clear();
            this.stateNoSelectionContributionMap.put(this.currStateNoSelection,
                    new StateContributionInfo(1.0f, 1.0f));
            this.sync();
        }
    }

    public StateTransitionTracker(final JComponent component, ButtonModel model) {
        this.component = component;
        this.model = model;

        this.modelStateInfo = new ModelStateInfo();
        this.modelStateInfo.currState = ComponentState.getState(model, component, false);
        this.modelStateInfo.currStateNoSelection = ComponentState.getState(model, component, true);
        this.modelStateInfo.clear();

        this.repaintCallback = () -> new SwingRepaintCallback(component);
        this.isAutoTrackingModelChanges = true;
        this.eventListenerList = new EventListenerList();

        this.focusTimeline =
                AnimationConfigurationManager.getInstance().timelineBuilder(this.component)
                        .addCallback(this.repaintCallback.getRepaintCallback())
                        .addCallback(new TimelineCallbackAdapter() {
                            @Override
                            public void onTimelineStateChanged(TimelineState oldState,
                                    TimelineState newState, float durationFraction,
                                    float timelinePosition) {
                                // notify listeners on focus state transition
                                SwingUtilities.invokeLater(
                                        () -> fireFocusStateTransitionEvent(oldState, newState));
                            }
                        })
                        .build();

        this.focusLoopTimeline =
                AnimationConfigurationManager.getInstance().timelineBuilder(this.component)
                        .addCallback(this.repaintCallback.getRepaintCallback())
                        .build();

        this.iconGlowTracker = new IconGlowTracker(this.component);

        this.name = "";
    }

    public StateTransitionTracker(final JComponent component, TriStateButtonModel model) {
        this.component = component;
        this.triStateModel = model;

        this.modelStateInfo = new ModelStateInfo();
        this.modelStateInfo.currState = ComponentState.getState(model, false);
        this.modelStateInfo.currStateNoSelection = ComponentState.getState(model, true);
        this.modelStateInfo.clear();

        this.repaintCallback = () -> new SwingRepaintCallback(component);
        this.isAutoTrackingModelChanges = true;
        this.eventListenerList = new EventListenerList();

        this.focusTimeline =
                AnimationConfigurationManager.getInstance().timelineBuilder(this.component)
                        .addCallback(this.repaintCallback.getRepaintCallback())
                        .addCallback(new TimelineCallbackAdapter() {
                            @Override
                            public void onTimelineStateChanged(TimelineState oldState,
                                    TimelineState newState, float durationFraction,
                                    float timelinePosition) {
                                // notify listeners on focus state transition
                                SwingUtilities.invokeLater(
                                        () -> fireFocusStateTransitionEvent(oldState, newState));
                            }
                        })
                        .build();

        this.focusLoopTimeline =
                AnimationConfigurationManager.getInstance().timelineBuilder(this.component)
                        .addCallback(this.repaintCallback.getRepaintCallback())
                        .build();

        this.iconGlowTracker = new IconGlowTracker(this.component);

        this.name = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRepaintCallback(StateTransitionTracker.RepaintCallback repaintCallback) {
        this.repaintCallback = repaintCallback;
    }

    public void registerFocusListeners() {
        this.focusListener = new FocusListener() {
            public void focusGained(FocusEvent e) {
                setFocusState(true);
            }

            public void focusLost(FocusEvent e) {
                setFocusState(false);
            }
        };
        this.component.addFocusListener(this.focusListener);
    }

    public void registerModelListeners() {
        this.modelChangeListener = changeEvent -> {
            if (isAutoTrackingModelChanges) {
                onModelStateChanged();
            }
        };
        if (this.model != null) {
            this.model.addChangeListener(this.modelChangeListener);
        } else {
            this.triStateModel.addChangeListener(this.modelChangeListener);
        }
    }

    public void unregisterFocusListeners() {
        this.component.removeFocusListener(this.focusListener);
        this.focusListener = null;
    }

    public void unregisterModelListeners() {
        if (this.model != null) {
            this.model.removeChangeListener(this.modelChangeListener);
        } else {
            this.triStateModel.removeChangeListener(this.modelChangeListener);
        }
        this.modelChangeListener = null;
    }

    public void setModel(ButtonModel model) {
        this.model.removeChangeListener(this.modelChangeListener);
        if (this.transitionTimeline != null) {
            this.transitionTimeline.abort();
            this.transitionPosition = 0.0f;
        }

        this.modelStateInfo.currState = ComponentState.getState(model, component, false);
        this.modelStateInfo.currStateNoSelection = ComponentState.getState(model, component, true);
        this.modelStateInfo.clear();

        this.model = model;
        this.model.addChangeListener(this.modelChangeListener);

        this.component.repaint();
    }

    public void setTriStateModel(TriStateButtonModel model) {
        this.triStateModel.removeChangeListener(this.modelChangeListener);
        if (this.transitionTimeline != null) {
            this.transitionTimeline.abort();
            this.transitionPosition = 0.0f;
        }

        this.modelStateInfo.currState = ComponentState.getState(model, false);
        this.modelStateInfo.currStateNoSelection = ComponentState.getState(model, true);
        this.modelStateInfo.clear();

        this.triStateModel = model;
        this.triStateModel.addChangeListener(this.modelChangeListener);

        this.component.repaint();
    }

    public ButtonModel getModel() {
        return this.model;
    }

    public TriStateButtonModel getTriStateModel() {
        return this.triStateModel;
    }

    public void turnOffModelChangeTracking() {
        this.isAutoTrackingModelChanges = false;
    }

    public void onModelStateChanged() {
        this.isAutoTrackingModelChanges = true;

        ComponentState newState;
        ComponentState newStateNoSelection;
        if (this.model != null) {
            newState = ComponentState.getState(this.model, this.component, false);
            newStateNoSelection = ComponentState.getState(this.model, this.component, true);
        } else {
            newState = ComponentState.getState(this.triStateModel, false);
            newStateNoSelection = ComponentState.getState(this.triStateModel, true);
        }

        boolean isInRenderer = this.component.getClass().isAnnotationPresent(
                RadianceRenderer.class);
        if (!isInRenderer) {
            Container parent = this.component.getParent();
            while (parent != null) {
                if (CellRendererPane.class.isInstance(parent)
                        || ListCellRenderer.class.isInstance(parent)
                        || TreeCellRenderer.class.isInstance(parent)
                        || TableCellRenderer.class.isInstance(parent)) {
                    isInRenderer = true;
                    break;
                }
                parent = parent.getParent();
            }
        }

        if (isInRenderer || (this.component.getParent() == null)) {
            // no animations on renderers and parentless components
            this.modelStateInfo.currState = newState;
            this.modelStateInfo.currStateNoSelection = newStateNoSelection;
            this.modelStateInfo.clear();
            return;
        }

        // System.out.println("State changed from " + currState + " to "
        // + newState);

        // if (this.component instanceof JMenuItem) {
        // System.out.println(((JMenuItem) this.component).getText());
        // System.out.println("\tCURR:" + this.modelStateInfo.currState
        // + ", NEW:" + newState);
        // }

        if (this.modelStateInfo.currState == newState) {
            return;
        }

        if (this.transitionTimeline != null) {
            this.transitionTimeline.abort();
        }

        SwingComponentTimeline.Builder transitionTimelineBuilder =
                AnimationConfigurationManager.getInstance().timelineBuilder(this.component)
                        .setForceUiUpdate(true)
                        .setName("Model transitions")
                        .addCallback(this.repaintCallback.getRepaintCallback());
        if (!this.modelStateInfo.currState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION)
                && newState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION)) {
            // special handling for transition from non-selected to
            // selected state - make it twice faster
            transitionTimelineBuilder.setDuration(transitionTimelineBuilder.getDuration() / 2);
        }
        long fullDuration = transitionTimelineBuilder.getDuration();
        if (this.modelStateInfo.stateContributionMap.containsKey(newState)) {
            // Going to a state that is already partially active. The
            // new timeline is going to be shorter. The new state will go to
            // 1.0f, hence the transition position begins from its current
            // contribution.
            this.transitionPosition = this.modelStateInfo.stateContributionMap
                    .get(newState).getContribution();
            transitionTimelineBuilder.addPropertyToInterpolate(
                    Timeline.<Float>property("transitionPosition")
                            .getWith((obj, fieldName) -> transitionPosition)
                            .setWith((obj, fieldName, value) -> transitionPosition = value)
                            .from(this.transitionPosition)
                            .to(1.0f));
            transitionTimelineBuilder
                    .setDuration((long) (fullDuration * (1.0f - this.transitionPosition)));
            // if ((this.component instanceof JMenuItem)
            // && "Check enabled unselected"
            // .equals(((JMenuItem) this.component).getText())) {
            // System.out.println("*******************************");
            // System.out.println("Timeline will run from "
            // + this.transitionPosition + " with state " + newState);
            // for (Map.Entry<ComponentState, StateContributionInfo> existing :
            // this.modelStateInfo.stateContributionMap
            // .entrySet()) {
            // System.out.println("\t" + existing.getKey() + " in ["
            // + existing.getValue().start + ":"
            // + existing.getValue().end + "]:"
            // + existing.getValue().curr);
            // }
            // System.out.println("*******************************");
            // }
        } else {
            this.transitionPosition = 0.0f;
            transitionTimelineBuilder.addPropertyToInterpolate(
                    Timeline.<Float>property("transitionPosition")
                            .getWith((obj, fieldName) -> transitionPosition)
                            .setWith((obj, fieldName, value) -> transitionPosition = value)
                            .from(0.0f).to(1.0f));
            // if ((this.component instanceof JMenuItem)
            // && "Check enabled unselected"
            // .equals(((JMenuItem) this.component).getText())) {
            // System.out.println("Timeline will run fully");
            // }
        }

        Map<ComponentState, StateContributionInfo> newContributionMap = new HashMap<>();
        if (this.modelStateInfo.stateContributionMap.containsKey(newState)) {
            // 1. the new state goes from current value to 1.0
            // 2. the rest go from current value to 0.0
            for (Map.Entry<ComponentState, StateContributionInfo> existing : this.modelStateInfo
                    .stateContributionMap.entrySet()) {
                StateContributionInfo currRange = existing.getValue();
                ComponentState state = existing.getKey();
                float newEnd = (state == newState) ? 1.0f : 0.0f;
                newContributionMap.put(state, new StateContributionInfo(
                        currRange.curr, newEnd));
            }
        } else {
            // 1. all existing states go from current value to 0.0
            // 2. the new state goes from 0.0 to 1.0
            for (Map.Entry<ComponentState, StateContributionInfo> existing : this.modelStateInfo
                    .stateContributionMap.entrySet()) {
                StateContributionInfo currRange = existing.getValue();
                ComponentState state = existing.getKey();
                newContributionMap.put(state, new StateContributionInfo(
                        currRange.curr, 0.0f));
            }
            newContributionMap.put(newState, new StateContributionInfo(0.0f, 1.0f));
        }
        this.modelStateInfo.stateContributionMap = newContributionMap;

        Map<ComponentState, StateContributionInfo> newNoSelectionContributionMap = new HashMap<>();
        if (this.modelStateInfo.stateNoSelectionContributionMap
                .containsKey(newStateNoSelection)) {
            // 1. the new state goes from current value to 1.0
            // 2. the rest go from current value to 0.0
            for (Map.Entry<ComponentState, StateContributionInfo> existing :
                    this.modelStateInfo.stateNoSelectionContributionMap.entrySet()) {
                StateContributionInfo currRange = existing.getValue();
                ComponentState state = existing.getKey();
                float newEnd = (state == newStateNoSelection) ? 1.0f : 0.0f;
                newNoSelectionContributionMap.put(state,
                        new StateContributionInfo(currRange.curr, newEnd));
            }
        } else {
            // 1. all existing states go from current value to 0.0
            // 2. the new state goes from 0.0 to 1.0
            for (Map.Entry<ComponentState, StateContributionInfo> existing :
                    this.modelStateInfo.stateNoSelectionContributionMap.entrySet()) {
                StateContributionInfo currRange = existing.getValue();
                ComponentState state = existing.getKey();
                newNoSelectionContributionMap.put(state,
                        new StateContributionInfo(currRange.curr, 0.0f));
            }
            newNoSelectionContributionMap.put(newStateNoSelection,
                    new StateContributionInfo(0.0f, 1.0f));
        }
        this.modelStateInfo.stateNoSelectionContributionMap = newNoSelectionContributionMap;

        this.modelStateInfo.sync();

        transitionTimelineBuilder.addCallback(new TimelineCallbackAdapter() {
            @Override
            public void onTimelineStateChanged(final TimelineState oldState,
                    final TimelineState newState, final float durationFraction,
                    final float timelinePosition) {
                if (newState == TimelineState.DONE) {
                    SwingUtilities.invokeLater(() -> {
                        modelStateInfo.clear();
                        // repaint after the model state info has
                        // been cleared
                        repaintCallback.getRepaintCallback()
                                .onTimelineStateChanged(oldState, newState,
                                        durationFraction, timelinePosition);
                    });
                }
            }
        });
        // notify listeners on model state transition
        transitionTimelineBuilder.addCallback(new TimelineCallbackAdapter() {
            @Override
            public void onTimelineStateChanged(final TimelineState oldState,
                    final TimelineState newState, float durationFraction,
                    float timelinePosition) {
                SwingUtilities.invokeLater(() -> fireModelStateTransitionEvent(oldState, newState));
            }
        });
        // Add fix for issue 297 - menu items partially covered by lightweight
        // popups (such as tooltips).
        transitionTimelineBuilder.addCallback(new TimelineCallbackAdapter() {
            @Override
            public void onTimelineStateChanged(TimelineState oldState,
                    TimelineState newState, float durationFraction,
                    float timelinePosition) {
                SwingUtilities.invokeLater(() -> {
                    if (component instanceof JMenuItem) {
                        if (RadianceCoreUtilities.isCoveredByLightweightPopups(component)) {
                            component.putClientProperty(
                                    RadianceCoreUtilities.IS_COVERED_BY_LIGHTWEIGHT_POPUPS,
                                    Boolean.TRUE);
                        } else {
                            component.putClientProperty(
                                    RadianceCoreUtilities.IS_COVERED_BY_LIGHTWEIGHT_POPUPS,
                                    null);
                        }
                    }
                });
            }

            @Override
            public void onTimelinePulse(float durationFraction,
                    float timelinePosition) {
                SwingUtilities.invokeLater(() -> {
                    if (component instanceof JMenuItem) {
                        if (RadianceCoreUtilities.isCoveredByLightweightPopups(component)) {
                            component.putClientProperty(
                                    RadianceCoreUtilities.IS_COVERED_BY_LIGHTWEIGHT_POPUPS,
                                    Boolean.TRUE);
                        } else {
                            component.putClientProperty(
                                    RadianceCoreUtilities.IS_COVERED_BY_LIGHTWEIGHT_POPUPS,
                                    null);
                        }
                    }
                });
            }
        });

        transitionTimelineBuilder.addCallback(new TimelineCallbackAdapter() {
            @Override
            public void onTimelineStateChanged(TimelineState oldState,
                    TimelineState newState, float durationFraction,
                    float timelinePosition) {
                updateActiveStates(timelinePosition);
            }

            @Override
            public void onTimelinePulse(float durationFraction,
                    float timelinePosition) {
                updateActiveStates(timelinePosition);
            }

            private void updateActiveStates(final float timelinePosition) {
                SwingUtilities.invokeLater(() -> {
                    for (StateContributionInfo pair :
                            modelStateInfo.stateContributionMap.values()) {
                        pair.updateContribution(timelinePosition);
                    }
                    for (StateContributionInfo pair :
                            modelStateInfo.stateNoSelectionContributionMap.values()) {
                        pair.updateContribution(timelinePosition);
                    }
                    modelStateInfo.sync();
                });
            }

        });

        this.modelStateInfo.currState = newState;
        this.modelStateInfo.currStateNoSelection = newStateNoSelection;

        // if (this.component instanceof JMenuItem) {
        // System.out.println("Running timeline on "
        // + ((JMenuItem) this.component).getText() + " for "
        // + this.transitionTimeline.getDuration());
        // }
        this.transitionTimeline = transitionTimelineBuilder.build();
        this.transitionTimeline.play();

        // track icon glowing
        if (AnimationConfigurationManager.getInstance().isAnimationAllowed(
                RadianceThemingSlices.AnimationFacet.ICON_GLOW, this.component)) {
            boolean wasRollover = false;
            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo>
                    activeEntry : this.modelStateInfo.stateContributionMap.entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == this.modelStateInfo.currState)
                    continue;

                if (activeState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER)) {
                    wasRollover = true;
                    break;
                }
            }
            boolean isRollover = this.modelStateInfo.currState
                    .isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER);
            if (wasRollover && !isRollover) {
                this.iconGlowTracker.cancel();
            }
            if (!wasRollover && isRollover) {
                this.iconGlowTracker.play();
            }
        }
    }

    public float getFocusStrength(boolean hasFocus) {
        if (this.focusTimeline == null) {
            return 0.0f;
        }

        TimelineState focusTimelineState = this.focusTimeline.getState();
        if ((focusTimelineState == TimelineState.READY)
                || (focusTimelineState == TimelineState.PLAYING_FORWARD)
                || (focusTimelineState == TimelineState.PLAYING_REVERSE)) {
            return this.focusTimeline.getTimelinePosition();
        }
        return hasFocus ? 1.0f : 0.0f;
    }

    public float getFocusLoopPosition() {
        if (this.focusLoopTimeline == null) {
            return 0.0f;
        }

        return this.focusLoopTimeline.getTimelinePosition();
    }

    public float getIconGlowPosition() {
        return this.iconGlowTracker.getIconGlowPosition();
    }

    public float getFacetStrength(RadianceThemingSlices.ComponentStateFacet stateFacet) {
        float result = 0.0f;
        for (Map.Entry<ComponentState, StateContributionInfo> activeEntry :
                this.modelStateInfo.stateContributionMap.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            if (activeState.isFacetActive(stateFacet)) {
                result += activeEntry.getValue().getContribution();
            }
        }
        return result;
    }

    public float getFacetStrength(RadianceThemingSlices.ComponentStateFacet stateFacet1,
            RadianceThemingSlices.ComponentStateFacet stateFacet2) {
        float result = 0.0f;
        for (Map.Entry<ComponentState, StateContributionInfo> activeEntry :
                this.modelStateInfo.stateContributionMap.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            if (activeState.isFacetActive(stateFacet1) || activeState.isFacetActive(stateFacet2)) {
                result += activeEntry.getValue().getContribution();
            }
        }
        return result;
    }

    public float getActiveStrength() {
        return this.modelStateInfo.getActiveStrength();
    }

    public void addStateTransitionListener(StateTransitionListener stateTransitionListener) {
        // System.out.println("Adding state listener to @" + this.hashCode());
        this.eventListenerList.add(StateTransitionListener.class,
                stateTransitionListener);
    }

    public void removeStateTransitionListener(StateTransitionListener stateTransitionListener) {
        // System.out.println("Removing state listener from @" +
        // this.hashCode());
        this.eventListenerList.remove(StateTransitionListener.class,
                stateTransitionListener);
    }

    private void fireModelStateTransitionEvent(TimelineState oldState, TimelineState newState) {
        // System.out.println("Fired state event from " + oldState + " to "
        // + newState + " on @" + this.hashCode());
        if (this.eventListenerList.getListenerCount() == 0) {
            return;
        }

        StateTransitionListener[] listeners = this.eventListenerList
                .getListeners(StateTransitionListener.class);
        if ((listeners == null) || (listeners.length == 0)) {
            return;
        }

        StateTransitionEvent event = new StateTransitionEvent(this, oldState, newState);
        for (StateTransitionListener listener : listeners) {
            listener.onModelStateTransition(event);
        }
    }

    private void fireFocusStateTransitionEvent(TimelineState oldState,
            TimelineState newState) {
        if (this.eventListenerList.getListenerCount() == 0) {
            return;
        }

        StateTransitionListener[] listeners = this.eventListenerList
                .getListeners(StateTransitionListener.class);
        if ((listeners == null) || (listeners.length == 0)) {
            return;
        }

        StateTransitionEvent event = new StateTransitionEvent(this, oldState,
                newState);
        for (StateTransitionListener listener : listeners) {
            listener.onFocusStateTransition(event);
        }
    }

    public void endTransition() {
        if (this.transitionTimeline != null) {
            this.transitionTimeline.end();
        }
    }

    public void setFocusState(boolean hasFocus) {
        if (hasFocus) {
            this.focusTimeline.play();
            if (AnimationConfigurationManager.getInstance().isAnimationAllowed(
                    RadianceThemingSlices.AnimationFacet.FOCUS_LOOP_ANIMATION, this.component)) {
                this.focusLoopTimeline.playLoop(RepeatBehavior.LOOP);
            }
        } else {
            this.focusTimeline.playReverse();
            if (AnimationConfigurationManager.getInstance().isAnimationAllowed(
                    RadianceThemingSlices.AnimationFacet.FOCUS_LOOP_ANIMATION, this.component)) {
                this.focusLoopTimeline.cancel();
            }
        }
    }

    public boolean hasRunningTimelines() {
        if (this.focusTimeline != null) {
            TimelineState focusTimelineState = this.focusTimeline.getState();
            if (focusTimelineState != TimelineState.IDLE) {
                return true;
            }
        }
        if (this.focusLoopTimeline != null) {
            TimelineState focusLoopTimelineState = this.focusLoopTimeline
                    .getState();
            if (focusLoopTimelineState != TimelineState.IDLE) {
                return true;
            }
        }
        if (this.iconGlowTracker.isPlaying()) {
            return true;
        }
        if (this.transitionTimeline != null) {
            TimelineState modelTransitionTimelineState = this.transitionTimeline
                    .getState();
            if (modelTransitionTimelineState != TimelineState.IDLE) {
                return true;
            }
        }

        return false;
    }

    public IconGlowTracker getIconGlowTracker() {
        return iconGlowTracker;
    }

    public ModelStateInfo getModelStateInfo() {
        return modelStateInfo;
    }
}
