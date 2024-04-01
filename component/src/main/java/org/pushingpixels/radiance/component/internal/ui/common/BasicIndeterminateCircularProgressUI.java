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
package org.pushingpixels.radiance.component.internal.ui.common;

import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.animation.api.Timeline.RepeatBehavior;
import org.pushingpixels.radiance.animation.api.Timeline.TimelineState;
import org.pushingpixels.radiance.animation.api.ease.Spline;
import org.pushingpixels.radiance.animation.api.swing.EventDispatchThreadTimelineCallbackAdapter;
import org.pushingpixels.radiance.animation.api.swing.SwingComponentTimeline;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintCallback;
import org.pushingpixels.radiance.component.api.common.JIndeterminateCircularProgress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.HierarchyListener;
import java.beans.PropertyChangeListener;

/**
 * Basic UI for indeterminate circular progress {@link JIndeterminateCircularProgress}.
 *
 * @author Kirill Grouchnikov
 */
public abstract class BasicIndeterminateCircularProgressUI extends CircularProgressUI {
    protected JIndeterminateCircularProgress indeterminateCircularProgress;

    protected double arcStart;

    protected double arcEnd;

    protected double arcSpan;

    protected Timeline arcTimeline;

    protected Timeline alphaTimeline;

    protected boolean goFromStart = true;

    protected float alpha = 0.0f;

    private PropertyChangeListener propertyChangeListener;

    private HierarchyListener hierarchyListener;

    public BasicIndeterminateCircularProgressUI() {
    }

    @Override
    public void installUI(JComponent c) {
        this.indeterminateCircularProgress = (JIndeterminateCircularProgress) c;
        super.installUI(c);
        installDefaults();
        installComponents();
        installListeners();
    }

    @Override
    public void uninstallUI(JComponent c) {
        uninstallListeners();
        uninstallComponents();
        uninstallDefaults();
        super.uninstallUI(c);
        this.indeterminateCircularProgress = null;
    }

    /**
     * Installs default settings for the associated circular progress.
     */
    protected void installDefaults() {
        if (this.indeterminateCircularProgress.isVisible()) {
            startAnimations();
        }
    }

    /**
     * Installs listeners on the associated circular progress.
     */
    protected void installListeners() {
        this.propertyChangeListener = propertyChangeEvent -> {
            if (propertyChangeEvent.getPropertyName().equals("visible")) {
                if ((Boolean) propertyChangeEvent.getNewValue()) {
                    startAnimations();
                } else {
                    stopAnimations();
                }
            }
        };
        this.indeterminateCircularProgress.addPropertyChangeListener(this.propertyChangeListener);

        this.hierarchyListener = e -> {
            boolean isVisible = indeterminateCircularProgress.isVisible();
            if (isVisible) {
                startAnimations();
            } else {
                stopAnimations();
            }
        };
        this.indeterminateCircularProgress.addHierarchyListener(this.hierarchyListener);
    }

    /**
     * Installs components on the associated circular progress.
     */
    protected void installComponents() {
    }

    /**
     * Uninstalls default settings from the associated circular progress.
     */
    protected void uninstallDefaults() {
    }

    /**
     * Uninstalls listeners from the associated circular progress.
     */
    protected void uninstallListeners() {
        this.indeterminateCircularProgress.removeHierarchyListener(this.hierarchyListener);
        this.hierarchyListener = null;

        this.indeterminateCircularProgress.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;

        this.alphaTimeline.abort();
        this.arcTimeline.abort();

        this.alphaTimeline = null;
        this.arcTimeline = null;
    }

    /**
     * Uninstalls subcomponents from the associated circular progress.
     */
    protected void uninstallComponents() {
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        JIndeterminateCircularProgress circularProgress = (JIndeterminateCircularProgress) c;
        int radius = circularProgress.getProjection().getPresentationModel().getRadius();
        return new Dimension(2 * radius, 2 * radius);
    }

    private void startAnimations() {
        if ((this.alphaTimeline != null) && !this.alphaTimeline.isDone()) {
            // is already fading in
            return;
        }

        // The fade-in timeline
        this.alphaTimeline = SwingComponentTimeline.componentBuilder(indeterminateCircularProgress)
                .addPropertyToInterpolate(Timeline.<Float>property("alpha")
                        .getWith((obj, fieldName) -> alpha)
                        .setWith((obj, fieldName, value) -> alpha = value)
                        .fromCurrent().to(1.0f))
                .setEase(new Spline(0.5f))
                .setDuration(100)
                .addCallback(new SwingRepaintCallback(indeterminateCircularProgress, null))
                .build();

        // Configure the timeline for the moving arc. The single property we're animating
        // is the arc span - going in a loop from 30 degrees to 300 degrees. When the span
        // is growing, on every pulse we advance the "end" of the arc based on the elapsed
        // duration. When the span is shrinking, on every pulse we advance the "start" of
        // the arc based on the elapsed duration. The constant pace of advancing one of the
        // ends creates a continuous motion around the circle. The expanding / shrinking arc
        // span creates the second dimension of the overall indeterminate progress.
        this.arcTimeline = SwingComponentTimeline.componentBuilder(this.indeterminateCircularProgress)
                .addPropertyToInterpolate(Timeline.<Double>property("arcSpan")
                        .getWith((obj, fieldName) -> arcSpan)
                        .setWith((obj, fieldName, value) -> arcSpan = value)
                        .from(30.0)
                        .to(300.0))
                .setEase(new Spline(0.5f))
                .setDuration(1000)
                .addCallback(new EventDispatchThreadTimelineCallbackAdapter() {
                    private float previousDurationFraction = 0.0f;
                    private void update(float durationFraction) {
                        float durationFractionDelta =
                                (durationFraction - this.previousDurationFraction);
                        if (goFromStart) {
                            arcStart -= (300 * durationFractionDelta);
                            arcEnd = arcStart - arcSpan;
                        } else {
                            arcEnd += (300 * durationFractionDelta);
                            arcStart = arcEnd + arcSpan;
                        }

                        arcStart = arcStart % 360;
                        arcEnd = arcEnd % 360;
                        if (indeterminateCircularProgress != null) {
                            indeterminateCircularProgress.repaint();
                        }
                        this.previousDurationFraction = durationFraction;
                    }

                    @Override
                    public void onTimelineStateChanged(TimelineState oldState,
                            TimelineState newState,
                            float durationFraction, float timelinePosition) {
                        if (oldState == TimelineState.PLAYING_FORWARD
                                && newState == TimelineState.PLAYING_REVERSE) {
                            goFromStart = false;
                        }
                        if (oldState == TimelineState.PLAYING_REVERSE
                                && newState == TimelineState.PLAYING_FORWARD) {
                            goFromStart = true;
                        }
                        update(durationFraction);
                    }

                    @Override
                    public void onTimelinePulse(float durationFraction, float timelinePosition) {
                        update(durationFraction);
                    }
                }).build();

        // Start playing the timelines in a separate event to make sure that our
        // progress indicator has passed the layout pass
        SwingUtilities.invokeLater(() -> {
            arcTimeline.playLoop(RepeatBehavior.REVERSE);
            alphaTimeline.play();
        });
    }

    private void stopAnimations() {
        if (this.alphaTimeline != null) {
            this.alphaTimeline.abort();
            this.alphaTimeline = null;
        }
        if (this.arcTimeline != null) {
            this.arcTimeline.abort();
            this.arcTimeline = null;
        }
    }

    @Override
    public void update(Graphics g, JComponent c) {
        this.paint(g, c);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Insets insets = this.indeterminateCircularProgress.getInsets();
        int width = this.indeterminateCircularProgress.getWidth() - insets.left - insets.right;
        int height = this.indeterminateCircularProgress.getHeight() - insets.top - insets.bottom;

        float strokeWidth = this.indeterminateCircularProgress.getProjection().getPresentationModel().getStrokeWidth();
        int diameter = Math.min(width, height) - (int) Math.ceil(strokeWidth);
        int dx = (width - diameter) / 2 + insets.left;
        int dy = (height - diameter) / 2 + insets.top;

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                RenderingHints.VALUE_STROKE_PURE);
        graphics.setStroke(new BasicStroke(
                this.indeterminateCircularProgress.getProjection().getPresentationModel().getStrokeWidth(),
                BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        Color arcColor = getArcColor();
        Color alphaColor = new Color(arcColor.getRed(), arcColor.getGreen(), arcColor.getBlue(),
                (int) (arcColor.getAlpha() * this.alpha));
        graphics.setColor(alphaColor);

        graphics.drawArc(dx, dy, diameter, diameter, (int) arcStart, -(int) arcSpan);
        graphics.dispose();
    }

    protected abstract Color getArcColor();
}
