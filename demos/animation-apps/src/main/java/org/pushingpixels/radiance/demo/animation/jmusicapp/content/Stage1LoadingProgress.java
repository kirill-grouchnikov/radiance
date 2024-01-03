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
package org.pushingpixels.radiance.demo.animation.jmusicapp.content;

import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.animation.api.Timeline.RepeatBehavior;
import org.pushingpixels.radiance.animation.api.Timeline.TimelineState;
import org.pushingpixels.radiance.animation.api.callback.TimelineCallbackAdapter;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 * Adds the following functionality to the album scroller container:
 *
 * <ul>
 * <li>Overlaying an indefinite load progress indicator on top of the container
 * children</li>
 * <li>Changes in load progress indicator visibility are animated to fade in and
 * fade out</li>
 * </ul>
 *
 * @author Kirill Grouchnikov
 */
public class Stage1LoadingProgress extends Stage0Base {
    /**
     * The pixel width of the load progress visuals.
     */
    private static final int PROGRESS_WIDTH = 300;
    /**
     * The pixel height of the load progress visuals.
     */
    private static final int PROGRESS_HEIGHT = 32;
    /**
     * The looping timeline to animate the indefinite load progress. When
     * {@link #setLoading(boolean)} is called with <code>true</code>, this
     * timeline is started. When {@link #setLoading(boolean)} is called with
     * <code>false</code>, this timeline is cancelled at the end of the
     * {@link #loadingBarFadeTimeline}.
     */
    Timeline loadingBarLoopTimeline;
    /**
     * The current position of the {@link #loadingBarLoopTimeline}.
     */
    float loadingBarLoopPosition;
    /**
     * The timeline for showing and hiding the loading progress bar. When
     * {@link #setLoading(boolean)} is called with <code>true</code>, this
     * timeline is started. When {@link #setLoading(boolean)} is called with
     * <code>false</code>, this timeline is started in reverse.
     */
    Timeline loadingBarFadeTimeline;
    /**
     * The current alpha value of the loading progress bar. Is updated by the
     * {@link #loadingBarFadeTimeline}.
     */
    float loadingBarAlpha;

    /**
     * Creates a container with support for showing load progress.
     */
    public Stage1LoadingProgress() {
        super();
        this.loadingBarAlpha = 0.0f;

        // create the looping timeline
        this.loadingBarLoopTimeline = Timeline.builder(this)
                .addPropertyToInterpolate("loadingBarLoopPosition", 0.0f, 1.0f)
                .addCallback(new TimelineCallbackAdapter() {
                    @Override
                    public void onTimelinePulse(float durationFraction,
                            float timelinePosition) {
                        // don't repaint the whole window
                        int x = (getWidth() - PROGRESS_WIDTH) / 2;
                        int y = (getHeight() - PROGRESS_HEIGHT) / 2;
                        Stage1LoadingProgress.this.repaint(x - 5, y - 5,
                                PROGRESS_WIDTH + 10, PROGRESS_HEIGHT + 10);
                    }
                })
                .setDuration(750)
                .build();

        // create the fade timeline
        this.loadingBarFadeTimeline = Timeline.builder(this)
                .addPropertyToInterpolate("loadingBarAlpha", 0.0f, 1.0f)
                .addCallback(new TimelineCallbackAdapter() {
                    @Override
                    public void onTimelineStateChanged(TimelineState oldState,
                            TimelineState newState, float durationFraction,
                            float timelinePosition) {
                        if (oldState == TimelineState.PLAYING_REVERSE
                                && newState == TimelineState.DONE) {
                            // after the loading progress is faded out, stop the loading
                            // animation
                            loadingBarLoopTimeline.cancel();
                        }
                    }
                })
                .setDuration(500)
                .build();
    }

    @Override
    protected void paintChildren(Graphics g) {
        super.paintChildren(g);

        if (this.loadingBarAlpha > 0.0f) {
            // paint the load progress over the children
            int x = (getWidth() - PROGRESS_WIDTH) / 2;
            int y = (getHeight() - PROGRESS_HEIGHT) / 2;

            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.SrcOver.derive(this.loadingBarAlpha));

            Shape currClip = g2d.getClip();
            g2d.clip(new RoundRectangle2D.Double(x, y, PROGRESS_WIDTH,
                    PROGRESS_HEIGHT, 8, 8));
            g2d.setPaint(new LinearGradientPaint(x, y, x, y + PROGRESS_HEIGHT,
                    new float[] { 0.0f, 0.49999f, 0.5f, 1.0f },
                    new Color[] {
                            new Color(156, 208, 221), new Color(101, 183, 243),
                            new Color(67, 169, 241), new Color(138, 201, 247) }));
            g2d.fillRect(x, y, PROGRESS_WIDTH, PROGRESS_HEIGHT);

            int stripeCellWidth = 25;
            g2d.setPaint(new LinearGradientPaint(x, y, x, y + PROGRESS_HEIGHT,
                    new float[] { 0.0f, 0.49999f, 0.5f, 1.0f },
                    new Color[] {
                            new Color(36, 155, 239), new Color(17, 145, 238),
                            new Color(15, 56, 200), new Color(3, 133, 219) }));
            g2d.setStroke(new BasicStroke(9.0f));
            for (int stripeX = x + (int) (this.loadingBarLoopPosition * stripeCellWidth);
                 stripeX < x + PROGRESS_WIDTH + PROGRESS_HEIGHT; stripeX += stripeCellWidth) {
                g2d.drawLine(stripeX, y, stripeX - stripeCellWidth, y
                        + PROGRESS_HEIGHT);
            }

            g2d.setClip(currClip);

            g2d.setColor(Color.lightGray);
            g2d.setStroke(new BasicStroke(1.3f));
            g2d.drawRoundRect(x, y, PROGRESS_WIDTH, PROGRESS_HEIGHT, 8, 8);

            g2d.dispose();
        }
    }

    /**
     * Starts or stops the loading progress animation.
     *
     * @param isLoading if <code>true</code>, this container will display a loading
     *                  progress animation, if <code>false</code>, the loading
     *                  progress animation will be stopped.
     */
    public void setLoading(boolean isLoading) {
        if (isLoading) {
            this.loadingBarFadeTimeline.play();
            this.loadingBarLoopTimeline.playLoop(RepeatBehavior.LOOP);
        } else {
            this.loadingBarFadeTimeline.playReverse();
        }
    }

    /**
     * Sets the new alpha value of the loading progress bar. Is called by the
     * {@link #loadingBarFadeTimeline}.
     *
     * @param loadingBarAlpha The new alpha value of the loading progress bar.
     */
    public void setLoadingBarAlpha(float loadingBarAlpha) {
        this.loadingBarAlpha = loadingBarAlpha;
    }

    /**
     * Sets the new loop position of the loading progress bar. Is called by the
     * {@link #loadingBarLoopTimeline}.
     *
     * @param loadingBarLoopPosition The new loop position of the loading progress bar.
     */
    public void setLoadingBarLoopPosition(float loadingBarLoopPosition) {
        this.loadingBarLoopPosition = loadingBarLoopPosition;
    }
}
