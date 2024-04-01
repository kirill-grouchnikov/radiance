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
import org.pushingpixels.radiance.animation.api.ease.Spline;
import org.pushingpixels.radiance.component.api.common.JDeterminateCircularProgress;
import org.pushingpixels.radiance.theming.internal.AnimationConfigurationManager;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeListener;

/**
 * Basic UI for determinate circular progress {@link JDeterminateCircularProgress}.
 *
 * @author Kirill Grouchnikov
 */
public abstract class BasicDeterminateCircularProgressUI extends CircularProgressUI {
    protected JDeterminateCircularProgress determinateCircularProgress;

    private float displayedProgress;

    private Timeline displayTimeline;

    /**
     * Property change listener.
     */
    private PropertyChangeListener propertyChangeListener;

    public BasicDeterminateCircularProgressUI() {
    }

    @Override
    public void installUI(JComponent c) {
        this.determinateCircularProgress = (JDeterminateCircularProgress) c;
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
        this.determinateCircularProgress = null;
    }

    /**
     * Installs default settings for the associated circular progress.
     */
    protected void installDefaults() {
        this.displayedProgress =
                this.determinateCircularProgress.getProjection().getContentModel().getProgress();
    }

    /**
     * Installs listeners on the associated circular progress.
     */
    protected void installListeners() {
        this.propertyChangeListener = propertyChangeEvent -> {
            if ("progress".equals(propertyChangeEvent.getPropertyName())) {
                if (displayTimeline != null) {
                    displayTimeline.abort();
                }

                float currProgress = determinateCircularProgress.getProjection().getContentModel().getProgress();
                displayTimeline =
                        AnimationConfigurationManager.getInstance().timelineBuilder(determinateCircularProgress)
                                .addPropertyToInterpolate(Timeline.<Float>property("displayedProgress")
                                        .from(displayedProgress)
                                        .to(currProgress)
                                        .setWith((obj, fieldName, value) -> {
                                            displayedProgress = value;
                                            if (determinateCircularProgress != null) {
                                                determinateCircularProgress.repaint();
                                            }
                                        }))
                                .setEase(new Spline(0.4f))
                                .build();
                displayTimeline.play();
            }
        };
        this.determinateCircularProgress.getProjection().getContentModel()
                .addPropertyChangeListener(this.propertyChangeListener);
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
        this.determinateCircularProgress.getProjection().getContentModel()
                .removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;
    }

    /**
     * Uninstalls subcomponents from the associated circular progress.
     */
    protected void uninstallComponents() {
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        JDeterminateCircularProgress circularProgress = (JDeterminateCircularProgress) c;
        int radius = circularProgress.getProjection().getPresentationModel().getRadius();
        return new Dimension(2 * radius, 2 * radius);
    }

    @Override
    public void update(Graphics g, JComponent c) {
        this.paint(g, c);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Insets insets = this.determinateCircularProgress.getInsets();
        int width = this.determinateCircularProgress.getWidth() - insets.left - insets.right;
        int height = this.determinateCircularProgress.getHeight() - insets.top - insets.bottom;

        float strokeWidth = this.determinateCircularProgress.getProjection().getPresentationModel().getStrokeWidth();
        int diameter = Math.min(width, height) - (int) Math.ceil(strokeWidth);
        int dx = (width - diameter) / 2 + insets.left;
        int dy = (height - diameter) / 2 + insets.top;

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                RenderingHints.VALUE_STROKE_PURE);
        graphics.setStroke(new BasicStroke(
                this.determinateCircularProgress.getProjection().getPresentationModel().getStrokeWidth(),
                BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        Color arcColor = getArcColor();
        graphics.setColor(arcColor);

        graphics.drawArc(dx, dy, diameter, diameter, 90, -(int) (360.0f * this.displayedProgress));
        graphics.dispose();
    }

    protected abstract Color getArcColor();
}
