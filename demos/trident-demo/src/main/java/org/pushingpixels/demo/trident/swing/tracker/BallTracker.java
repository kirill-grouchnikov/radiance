/*
 * Copyright (c) 2005-2019 Trident Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.trident.Timeline;
import org.pushingpixels.trident.Timeline.*;
import org.pushingpixels.trident.callback.TimelineCallbackAdapter;
import org.pushingpixels.trident.ease.*;
import org.pushingpixels.trident.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BallTracker extends JFrame {
    Timeline timelineBallFalling;

    private class Options {
        private String description;
        private TimelineEase ease;

        private Options(String description, TimelineEase ease) {
            this.description = description;
            this.ease = ease;
        }
    }

    public BallTracker() {
        super("Ball tracker");

        this.setLayout(new GridLayout(2, 1));
        JPanel main = new JPanel(new GridLayout(1, 2));
        final TimelineVisualizer visualizer = new TimelineVisualizer();

        this.add(main);
        this.add(visualizer);

        JPanel controls = new JPanel(new FlowLayout());
        main.add(controls);

        final BallPanel ballPanel = new BallPanel();
        main.add(ballPanel);

        Options[] eases = new Options[] {
                new Options("1. Linear", new Linear()),
                new Options("2. Sine", new Sine()),
                new Options("3. Spline (0.1, 0.0)-(0.9,1.0)", new Spline(0.1f, 0.0f, 0.9f, 1.0f)),
                new Options("4. Spline (0.2, 0.0)-(0.8,1.0)", new Spline(0.2f, 0.0f, 0.8f, 1.0f)),
                new Options("5. Spline (0.5, 0.0)-(0.5,1.0)", new Spline(0.5f, 0.0f, 0.5f, 1.0f)),
                new Options("6. Spline (0.8, 0.0)-(0.2,1.0)", new Spline(0.8f, 0.0f, 0.2f, 1.0f)),
                new Options("7. Spline (0.9, 0.0)-(0.1,1.0)", new Spline(0.9f, 0.0f, 0.1f, 1.0f)),
                new Options("8. Spline (1.0, 0.0)-(0.9,1.0)", new Spline(1.0f, 0.0f, 0.9f, 1.0f))
        };
        ComboBoxModel<Options> easeModel = new DefaultComboBoxModel<>(eases);
        final JComboBox<Options> easeCombo = new JComboBox<>(easeModel);
        easeCombo.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                return super.getListCellRendererComponent(list,
                        ((Options) value).description, index, isSelected,
                        cellHasFocus);
            }
        });
        easeCombo.setSelectedIndex(0);
        controls.add(easeCombo);

        final JTextField msToSkip = new JTextField("0", 6);
        controls.add(new JLabel("to skip"));
        controls.add(msToSkip);

        final JTextField msInitialDelay = new JTextField("500", 6);
        controls.add(new JLabel("initial delay"));
        controls.add(msInitialDelay);

        final JTextField msCycleDelay = new JTextField("0", 6);
        controls.add(new JLabel("cycle delay"));
        controls.add(msCycleDelay);

        JButton runTimeline = new JButton("run");
        runTimeline.addActionListener((ActionEvent e) -> {
            if (timelineBallFalling != null)
                timelineBallFalling.cancel();
            timelineBallFalling = new SwingComponentTimeline(ballPanel);
            timelineBallFalling.addPropertyToInterpolate("ballY", BallPanel.RADIUS,
                    ballPanel.getHeight() - BallPanel.RADIUS);
            timelineBallFalling.setDuration(2000);
            timelineBallFalling.setInitialDelay(Integer.parseInt(msInitialDelay.getText()));
            timelineBallFalling.setCycleDelay(Integer.parseInt(msCycleDelay.getText()));
            timelineBallFalling.setEase(
                    ((Options) easeCombo.getSelectedItem()).ease);

            timelineBallFalling.addCallback(new TimelineCallbackAdapter() {
                @Override
                public void onTimelinePulse(float durationFraction, float timelinePosition) {
                    // add a fading dot to visualize the timeline
                    // interpolation behavior
                    visualizer.addDot(durationFraction, timelinePosition);
                }

                @Override
                public void onTimelineStateChanged(TimelineState oldState, TimelineState newState,
                        float durationFraction, float timelinePosition) {
                    System.out
                            .println("State change: " + oldState.name() + " -> " + newState.name());
                }
            });

            long toSkip = Long.parseLong(msToSkip.getText());
            if (toSkip > 0) {
                timelineBallFalling.playLoopSkipping(RepeatBehavior.REVERSE, toSkip);
            } else {
                timelineBallFalling.playLoop(RepeatBehavior.REVERSE);
            }
        });

        JButton cancelTimeline = new JButton("cancel");
        cancelTimeline.addActionListener((ActionEvent e) -> {
            if (timelineBallFalling != null)
                timelineBallFalling.cancelAtCycleBreak();
        });

        JButton suspendTimeline = new JButton("suspend");
        suspendTimeline.addActionListener((ActionEvent e) -> {
            if (timelineBallFalling != null)
                timelineBallFalling.suspend();
        });

        JButton resumeTimeline = new JButton("resume");
        resumeTimeline.addActionListener((ActionEvent e) -> {
            if (timelineBallFalling != null)
                timelineBallFalling.resume();
        });

        controls.add(runTimeline);
        controls.add(cancelTimeline);
        controls.add(suspendTimeline);
        controls.add(resumeTimeline);

        Timeline paintTimeline = new SwingRepaintTimeline(this);
        paintTimeline.playLoop(RepeatBehavior.LOOP);

        this.setSize(500, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BallTracker().setVisible(true));
    }
}
