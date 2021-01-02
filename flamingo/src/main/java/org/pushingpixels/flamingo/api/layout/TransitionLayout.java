/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.api.layout;

import org.pushingpixels.trident.api.Timeline;
import org.pushingpixels.trident.api.Timeline.TimelineState;
import org.pushingpixels.trident.api.swing.EventDispatchThreadTimelineCallbackAdapter;
import org.pushingpixels.trident.api.swing.SwingComponentTimeline;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Transition layout.
 *
 * @author Kirill Grouchnikov.
 */
public class TransitionLayout implements LayoutManager {
    /**
     * The original layout manager. Handles the layout-related tasks.
     */
    private LayoutManager delegate;

    private java.util.List<TransitionLayoutListener> eventListeners;

    /**
     * Client property to store the current visibility of components. Since we
     * are playing with calls to {@link Component#setVisible(boolean)}, this
     * property tracks the "real" visibility.
     */
    private static final String SHOWING = "flamingo.layout.showing";

    /**
     * Client property for storing the current bounds of a component. This is
     * used to perform animations on components that stay visible but change
     * location.
     */
    private static final String BOUNDS = "flamingo.layout.bounds";

    private WeakHashMap<Component, Timeline> boundsMap = new WeakHashMap<>();

    /**
     * The associated container.
     */
    private Container container;

    private boolean doImmediateRepaint;

    private boolean hasPendingLayoutRequests;

    private int pendingAnimationCount;

    public TransitionLayout(Container container, LayoutManager delegate) {
        super();
        this.container = container;
        this.delegate = delegate;
        this.doImmediateRepaint = false;

        this.hasPendingLayoutRequests = false;
        this.pendingAnimationCount = 0;

        this.eventListeners = new ArrayList<>();
    }

    public void addLayoutComponent(String name, Component comp) {
        delegate.addLayoutComponent(name, comp);
    }

    public void layoutContainer(Container parent) {
        if (this.getPendingAnimationCount() > 0) {
            this.requestLayout();
            return;
        }

        fireEvent(null, TransitionLayoutEvent.TRANSITION_STARTED);

        final Map<JComponent, Rectangle> oldLocations = new HashMap<>();
        for (int i = 0; i < parent.getComponentCount(); i++) {
            Component c = parent.getComponent(i);
            JComponent jc = (JComponent) c;
            oldLocations.put(jc, new Rectangle(jc.getBounds()));
        }
        delegate.layoutContainer(parent);
        parent.repaint();
        for (int i = 0; i < parent.getComponentCount(); i++) {
            final Component comp = parent.getComponent(i);
            final JComponent jc = (JComponent) comp;
            final Rectangle newBounds = new Rectangle(jc.getBounds());
            final Rectangle oldBounds = (jc.getClientProperty(BOUNDS) instanceof Rectangle) ?
                    (Rectangle) jc.getClientProperty(BOUNDS) : oldLocations.get(jc);
            boolean wasShowing = Boolean.TRUE.equals(jc.getClientProperty(SHOWING));
            boolean isShowing = jc.isVisible();

            if (jc.isVisible()) {
                jc.putClientProperty(SHOWING, Boolean.TRUE);
            } else {
                jc.putClientProperty(SHOWING, null);
            }

            jc.putClientProperty(BOUNDS, new Rectangle(newBounds));

            if (isShowing && wasShowing) {
                if (!oldBounds.equals(newBounds)) {
                    jc.setBounds(oldBounds);
                    this.animationStarted();

                    Timeline boundsTimeline = boundsMap.get(jc);
                    if (boundsTimeline != null) {
                        boundsTimeline.abort();
                    }
                    boundsTimeline = SwingComponentTimeline.componentBuilder(jc)
                            .addCallback(new EventDispatchThreadTimelineCallbackAdapter() {
                                @Override
                                public void onTimelineStateChanged(
                                        TimelineState oldState,
                                        TimelineState newState,
                                        float durationFraction,
                                        float timelinePosition) {
                                    onPulse(timelinePosition);
                                    if (oldState == TimelineState.PLAYING_FORWARD
                                            && newState == TimelineState.DONE) {
                                        animationEnded();
                                        boundsMap.remove(jc);
                                    }
                                }

                                @Override
                                public void onTimelinePulse(float durationFraction,
                                        float timelinePosition) {
                                    onPulse(timelinePosition);
                                }

                                void onPulse(float timelinePosition) {
                                    Rectangle currBounds = new Rectangle(
                                            (int) (oldBounds.x + timelinePosition
                                                    * (newBounds.x - oldBounds.x)),
                                            (int) (oldBounds.y + timelinePosition
                                                    * (newBounds.y - oldBounds.y)),
                                            (int) (oldBounds.width + timelinePosition
                                                    * (newBounds.width - oldBounds.width)),
                                            (int) (oldBounds.height + timelinePosition
                                                    * (newBounds.height - oldBounds.height)));
                                    jc.setBounds(currBounds);
                                    fireEvent(jc,
                                            TransitionLayoutEvent.CHILD_MOVING);
                                    jc.doLayout();
                                    repaint(jc);
                                }
                            })
                            .build();
                    boundsMap.put(jc, boundsTimeline);
                    boundsTimeline.play();
                }
            }
        }
        if (this.getPendingAnimationCount() == 0) {
            this.fireEvent(null, TransitionLayoutEvent.TRANSITION_ENDED);
        }
    }

    public Dimension minimumLayoutSize(Container parent) {
        return delegate.minimumLayoutSize(parent);
    }

    public Dimension preferredLayoutSize(Container parent) {
        return delegate.preferredLayoutSize(parent);
    }

    public void removeLayoutComponent(Component comp) {
        delegate.removeLayoutComponent(comp);
    }

    private synchronized void requestLayout() {
        this.hasPendingLayoutRequests = true;
    }

    private synchronized void layoutFinished() {
        this.hasPendingLayoutRequests = false;
        if (this.getPendingAnimationCount() == 0) {
            fireEvent(null, TransitionLayoutEvent.TRANSITION_ENDED);
        }
    }

    private synchronized boolean hasPendingLayoutRequests() {
        return this.hasPendingLayoutRequests;
    }

    private synchronized int getPendingAnimationCount() {
        return this.pendingAnimationCount;
    }

    private synchronized void animationStarted() {
        this.pendingAnimationCount++;
    }

    private synchronized void animationEnded() {
        this.pendingAnimationCount--;
        if (this.pendingAnimationCount == 0) {
            if (this.hasPendingLayoutRequests()) {
                SwingUtilities.invokeLater(() -> {
                    layoutContainer(container);
                    layoutFinished();
                    container.repaint();
                });
            } else {
                fireEvent(null, TransitionLayoutEvent.TRANSITION_ENDED);
            }
        }
    }

    public LayoutManager getDelegate() {
        return delegate;
    }

    void setDoImmediateRepaint(boolean doImmediateRepaint) {
        this.doImmediateRepaint = doImmediateRepaint;
    }

    protected void repaint(Component comp) {
        if (this.doImmediateRepaint && (comp instanceof JComponent)) {
            final JComponent jc = (JComponent) comp;
            SwingUtilities.invokeLater(() ->
                    jc.paintImmediately(0, 0, jc.getWidth(), jc.getHeight()));

            return;
        }
        comp.repaint();
    }

    public synchronized void addTransitionLayoutListener(TransitionLayoutListener listener) {
        this.eventListeners.add(listener);
    }

    public synchronized void removeTransitionLayoutListener(TransitionLayoutListener listener) {
        this.eventListeners.remove(listener);
    }

    private void fireEvent(Component child, int id) {
        TransitionLayoutEvent event = new TransitionLayoutEvent(this.container, child, id);
        for (TransitionLayoutListener listener : this.eventListeners) {
            listener.onTransitionLayoutEvent(event);
        }
    }
}
