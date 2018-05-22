/*
 * Copyright (c) 2005-2018 Trident Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.trident.swing.tracker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

import org.pushingpixels.trident.Timeline;
import org.pushingpixels.trident.Timeline.TimelineState;
import org.pushingpixels.trident.callback.TimelineCallbackAdapter;

public class TimelineVisualizer extends JComponent {
    private List<TimelineVisualizerDot> dots;

    public TimelineVisualizer() {
        this.dots = new ArrayList<TimelineVisualizerDot>();
    }

    public void addDot(float absoluteTimelinePosition, float perceivedTimelinePosition) {
        synchronized (this.dots) {
            final TimelineVisualizerDot dot = new TimelineVisualizerDot();
            dot.setLocation(new Point((int) (absoluteTimelinePosition * getWidth()),
                    (int) (perceivedTimelinePosition * getHeight())));
            this.dots.add(dot);

            Timeline dotTimeline = new Timeline(dot);
            dotTimeline.addPropertyToInterpolate("opacity", 1.0f, 0.0f);
            dotTimeline.addCallback(new TimelineCallbackAdapter() {
                @Override
                public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                        float durationFraction, float timelinePosition) {
                    if (newState == TimelineState.DONE) {
                        synchronized (dots) {
                            dots.remove(dot);
                        }
                    }
                }
            });
            dotTimeline.setDuration(10000);
            dotTimeline.play();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        synchronized (this.dots) {
            for (TimelineVisualizerDot dot : this.dots) {
                dot.paint(g2d);
            }
        }

        g2d.dispose();
    }

}
