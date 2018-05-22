/*
 * Copyright (c) 2005-2017 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.flamingo.internal.ui.common;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ComponentUI;

import org.pushingpixels.trident.Timeline;
import org.pushingpixels.trident.Timeline.RepeatBehavior;
import org.pushingpixels.trident.Timeline.TimelineState;
import org.pushingpixels.trident.callback.UIThreadTimelineCallbackAdapter;
import org.pushingpixels.trident.ease.Spline;
import org.pushingpixels.trident.swing.SwingRepaintCallback;

/**
 * Basic UI for circular progress {@link JCircularProgress}.
 * 
 * @author Kirill Grouchnikov
 */
public class BasicCircularProgressUI extends CircularProgressUI {
    protected JCircularProgress circularProgress;

    protected double arcStart;

    protected double arcEnd;

    protected double arcSpan;

    protected Timeline arcTimeline;

    protected Timeline alphaTimeline;

    protected boolean goFromStart = true;

    protected float alpha = 0.0f;

    private PropertyChangeListener propertyChangeListener;

    public static ComponentUI createUI(JComponent c) {
        return new BasicCircularProgressUI();
    }

    public BasicCircularProgressUI() {
    }

    @Override
    public void installUI(JComponent c) {
        this.circularProgress = (JCircularProgress) c;
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
        this.circularProgress = null;
    }

    /**
     * Installs default settings for the associated circular progress.
     */
    protected void installDefaults() {
    }

    /**
     * Installs listeners on the associated circular progress.
     */
    protected void installListeners() {
        // Configure the timeline for the moving arc. The single property we're animating
        // is the arc span - going in a loop from 30 degrees to 300 degrees. When the span
        // is growing, on every pulse we advance the "end" of the arc by 8 degrees. When
        // the span is shrinking, on every pulse we advance the "start" of the arc by 8
        // degrees. The constant pace of advancing one of the ends creates a continuous
        // motion around the circle. The expanding / shrinking arc span creates the second
        // dimension of the overall indeterminate progress.
        this.arcTimeline = new Timeline(this.circularProgress);
        this.arcTimeline.addPropertyToInterpolate(Timeline.<Double>property("arcSpan")
                .getWith((Object obj, String fieldName) -> arcSpan)
                .setWith((Object obj, String fieldName, Double value) -> arcSpan = value).from(30.0)
                .to(300.0));
        this.arcTimeline.setEase(new Spline(0.5f));
        this.arcTimeline.setDuration(600);
        this.arcTimeline.addCallback(new UIThreadTimelineCallbackAdapter() {
            private void update() {
                if (goFromStart) {
                    arcStart -= 8;
                    arcEnd = arcStart - arcSpan;
                } else {
                    arcEnd -= 8;
                    arcStart = arcEnd + arcSpan;
                }

                arcStart = arcStart % 360;
                arcEnd = arcEnd % 360;
                circularProgress.repaint();
            }

            @Override
            public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                    float durationFraction, float timelinePosition) {
                if (oldState == TimelineState.PLAYING_FORWARD
                        && newState == TimelineState.PLAYING_REVERSE) {
                    goFromStart = false;
                }
                if (oldState == TimelineState.PLAYING_REVERSE
                        && newState == TimelineState.PLAYING_FORWARD) {
                    goFromStart = true;
                }
                update();
            }

            @Override
            public void onTimelinePulse(float durationFraction, float timelinePosition) {
                update();
            }
        });

        this.propertyChangeListener = (PropertyChangeEvent evt) -> {
            if (evt.getPropertyName().equals("visible")) {
                if (((Boolean) evt.getNewValue()).booleanValue()) {
                    if ((alphaTimeline != null) && !alphaTimeline.isDone()) {
                        // is already fading in
                        return;
                    }
                    
                    // The fade-in timeline
                    alphaTimeline = new Timeline(this.circularProgress);
                    alphaTimeline.addPropertyToInterpolate(Timeline.<Float>property("alpha")
                            .getWith((Object obj, String fieldName) -> alpha)
                            .setWith((Object obj, String fieldName, Float value) -> alpha = value)
                            .fromCurrent().to(1.0f));
                    alphaTimeline.setEase(new Spline(0.5f));
                    alphaTimeline.setDuration(100);
                    alphaTimeline
                            .addCallback(new SwingRepaintCallback(this.circularProgress, null));

                    // Start playing the timelines in a separate event to make sure that our
                    // progress indicator has passed the layout pass
                    SwingUtilities.invokeLater(() -> {
                        arcTimeline.playLoop(RepeatBehavior.REVERSE);
                        alphaTimeline.play();
                    });
                }
            }
        };
        this.circularProgress.addPropertyChangeListener(this.propertyChangeListener);
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
        this.circularProgress.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;

        this.alphaTimeline.abort();
        this.arcTimeline.abort();
    }

    /**
     * Uninstalls subcomponents from the associated circular progress.
     */
    protected void uninstallComponents() {
    }

    @Override
    public void update(Graphics g, JComponent c) {
        this.paint(g, c);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Insets insets = this.circularProgress.getInsets();
        int width = this.circularProgress.getWidth() - insets.left - insets.right;
        int height = this.circularProgress.getHeight() - insets.top - insets.bottom;

        int diameter = Math.min(width, height) - 2;
        int dx = (width - diameter) / 2 + insets.left;
        int dy = (height - diameter) / 2 + insets.top;

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                RenderingHints.VALUE_STROKE_PURE);
        graphics.setStroke(new BasicStroke(1.2f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));

        Color baseColor = getColor();
        Color alphaColor = new Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(),
                (int) (baseColor.getAlpha() * this.alpha));
        graphics.setColor(alphaColor);

        graphics.drawArc(dx, dy, diameter, diameter, (int) arcStart, -(int) arcSpan);
        graphics.dispose();
    }

    protected Color getColor() {
        return Color.black;
    }
}
