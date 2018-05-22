/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.substance.internal.widget.animation.effects;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Window;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ButtonModel;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;
import org.pushingpixels.trident.Timeline;
import org.pushingpixels.trident.Timeline.TimelineState;
import org.pushingpixels.trident.callback.TimelineCallback;
import org.pushingpixels.trident.callback.TimelineCallbackAdapter;
import org.pushingpixels.trident.callback.UIThreadTimelineCallbackAdapter;
import org.pushingpixels.trident.swing.SwingRepaintCallback;

/**
 * Listener for the "ghosting image" effects on buttons.
 * 
 * @author Kirill Grouchnikov
 * @see AnimationFacet#GHOSTING_BUTTON_PRESS
 * @see AnimationFacet#GHOSTING_ICON_ROLLOVER
 */
public class GhostingListener {
    /**
     * Listener on the model changes.
     */
    protected ChangeListener modelListener;

    /**
     * The associated component.
     */
    protected JComponent comp;

    /**
     * The associated model.
     */
    protected ButtonModel buttonModel;

    static final String GHOST_LISTENER_KEY = "lafwidget.internal.ghostListenerKey";

    /**
     * Key - {@link AnimationFacet}, value - {@link Boolean}
     */
    protected Map<AnimationFacet, Boolean> prevStateMap;

    private Timeline ghostIconRolloverTimeline;

    private Timeline ghostComponentPressedTimeline;

    private static Map<JComponent, Timeline> runningGhostRolloverTimelines = new HashMap<JComponent, Timeline>();

    private static Map<JComponent, Timeline> runningGhostPressTimelines = new HashMap<JComponent, Timeline>();

    /**
     * Creates a new listener on model changes that can cause ghost animation transitions.
     * 
     * @param comp
     *            Component.
     * @param buttonModel
     *            Model for the component.
     */
    public GhostingListener(final JComponent comp, ButtonModel buttonModel) {
        this.comp = comp;
        this.buttonModel = buttonModel;

        this.prevStateMap = new HashMap<AnimationFacet, Boolean>();
        this.prevStateMap.put(AnimationFacet.GHOSTING_ICON_ROLLOVER, buttonModel.isRollover());
        this.prevStateMap.put(AnimationFacet.GHOSTING_BUTTON_PRESS, buttonModel.isPressed());

        this.ghostIconRolloverTimeline = new Timeline(comp);
        AnimationConfigurationManager.getInstance()
                .configureTimeline(this.ghostIconRolloverTimeline);
        this.ghostIconRolloverTimeline.addCallback(new SwingRepaintCallback(comp));

        this.ghostComponentPressedTimeline = new Timeline(comp);
        AnimationConfigurationManager.getInstance()
                .configureTimeline(this.ghostComponentPressedTimeline);
        this.ghostComponentPressedTimeline.addCallback(new SwingRepaintCallback(comp));

        TimelineCallback ghostCallback = new UIThreadTimelineCallbackAdapter() {
            private boolean wasShowing = true;

            protected void repaintTopLevelWindows(float timelinePosition) {
                if (comp == null)
                    return;

                boolean isShowing = comp.isShowing();
                if (isShowing) {
                    Window compWindow = SwingUtilities.getWindowAncestor(comp);
                    if (!compWindow.isDisplayable() || !compWindow.isShowing()
                            || !compWindow.isVisible()) {
                        isShowing = false;
                    }
                }

                if (!isShowing) {
                    if (wasShowing) {
                        // need to repaint all other windows
                        // once - otherwise we will see
                        // painting artifacts from
                        // a pressed button that was made
                        // invisible
                        for (Window w : Window.getWindows()) {
                            if (w.isDisplayable() && w.isVisible() && w.isShowing()) {
                                w.repaint();
                            }
                        }
                    }
                    wasShowing = false;
                    return;
                }
                Component root = SwingUtilities.getRoot(comp);
                Rectangle compRect = comp.getBounds();
                compRect.setLocation(comp.getLocationOnScreen());
                compRect.x -= compRect.width / 2;
                compRect.y -= compRect.height / 2;
                compRect.width *= 2;
                compRect.height *= 2;
                int rootRepaintX = compRect.x - root.getLocationOnScreen().x;
                int rootRepaintY = compRect.y - root.getLocationOnScreen().y;

                root.repaint(rootRepaintX, rootRepaintY, compRect.width, compRect.height);

                // fix for issue 363 on Substance - repaint
                // all top-level windows that intersect
                // with this rectangle
                for (Window w : Window.getWindows()) {
                    if (w == root)
                        continue;
                    if (w.isDisplayable() && w.isVisible() && w.isShowing()) {
                        if (w.getBounds().intersects(compRect)) {
                            int winRepaintX = compRect.x - w.getLocationOnScreen().x;
                            int winRepaintY = compRect.y - w.getLocationOnScreen().y;
                            w.repaint(winRepaintX, winRepaintY, compRect.width, compRect.height);
                        }
                    }
                }
            }

            @Override
            public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                    float durationFraction, float timelinePosition) {
                if ((oldState == TimelineState.DONE) && (newState == TimelineState.IDLE)) {
                    this.repaintTopLevelWindows(1.0f);
                }
            }

            @Override
            public void onTimelinePulse(float durationFraction, float timelinePosition) {
                this.repaintTopLevelWindows(timelinePosition);
            }
        };

        this.ghostIconRolloverTimeline.addCallback(ghostCallback);
        this.ghostComponentPressedTimeline.addCallback(ghostCallback);

        this.ghostIconRolloverTimeline.addCallback(new TimelineCallbackAdapter() {
            @Override
            public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                    float durationFraction, float timelinePosition) {
                if ((oldState == TimelineState.DONE) && (newState == TimelineState.IDLE)) {
                    synchronized (GhostingListener.class) {
                        runningGhostRolloverTimelines.values().remove(ghostIconRolloverTimeline);
                    }
                }
            }
        });

        this.ghostComponentPressedTimeline.addCallback(new TimelineCallbackAdapter() {
            @Override
            public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                    float durationFraction, float timelinePosition) {
                if ((oldState == TimelineState.DONE) && (newState == TimelineState.IDLE)) {
                    synchronized (GhostingListener.class) {
                        runningGhostPressTimelines.values().remove(ghostComponentPressedTimeline);
                    }
                }
            }
        });
    }

    /**
     * Tracks a single change to the model.
     * 
     * @param animationFacet
     *            Animation facet.
     * @param newState
     *            New value of the relevant attribute of the model.
     */
    protected void trackModelChange(AnimationFacet animationFacet, boolean newState) {
        if (WidgetUtilities.toIgnoreAnimations(this.comp))
            return;
        try {
            if (this.prevStateMap.containsKey(animationFacet)) {
                boolean prevState = this.prevStateMap.get(animationFacet);
                if (!prevState && newState) {
                    if (animationFacet == AnimationFacet.GHOSTING_ICON_ROLLOVER) {
                        synchronized (GhostingListener.class) {
                            runningGhostRolloverTimelines.put(comp, ghostIconRolloverTimeline);
                        }
                        ghostIconRolloverTimeline.play();
                    }
                    if (animationFacet == AnimationFacet.GHOSTING_BUTTON_PRESS) {
                        synchronized (GhostingListener.class) {
                            runningGhostPressTimelines.put(comp, ghostComponentPressedTimeline);
                        }
                        ghostComponentPressedTimeline.play();
                    }
                }
            }
        } finally {
            this.prevStateMap.put(animationFacet, Boolean.valueOf(newState));
        }
    }

    /**
     * Registers listeners on the relevant model changes.
     */
    public void registerListeners() {
        this.modelListener = (ChangeEvent e) -> {
            if (AnimationConfigurationManager.getInstance()
                    .isAnimationAllowed(AnimationFacet.GHOSTING_ICON_ROLLOVER, comp)) {
                trackModelChange(AnimationFacet.GHOSTING_ICON_ROLLOVER, buttonModel.isRollover());
            }
            if (AnimationConfigurationManager.getInstance()
                    .isAnimationAllowed(AnimationFacet.GHOSTING_BUTTON_PRESS, comp)) {
                trackModelChange(AnimationFacet.GHOSTING_BUTTON_PRESS, buttonModel.isPressed());
            }
        };
        this.buttonModel.addChangeListener(this.modelListener);
        this.comp.putClientProperty(GHOST_LISTENER_KEY, this);
    }

    /**
     * Unregisters all listeners on model changes.
     */
    public void unregisterListeners() {
        this.buttonModel.removeChangeListener(this.modelListener);
        this.comp.putClientProperty(GHOST_LISTENER_KEY, null);
    }

    public static synchronized Map<JComponent, Timeline> getRunningGhostRolloverTimelines() {
        return Collections.unmodifiableMap(runningGhostRolloverTimelines);
    }

    public static synchronized Map<JComponent, Timeline> getRunningGhostPressTimelines() {
        return Collections.unmodifiableMap(runningGhostPressTimelines);
    }

    public Timeline getGhostComponentPressedTimeline() {
        return ghostComponentPressedTimeline;
    }

    public Timeline getGhostIconRolloverTimeline() {
        return ghostIconRolloverTimeline;
    }
}
