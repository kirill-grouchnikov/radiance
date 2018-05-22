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
package org.pushingpixels.demo.substance.main.check;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;

import org.pushingpixels.trident.Timeline;
import org.pushingpixels.trident.Timeline.RepeatBehavior;
import org.pushingpixels.trident.callback.RunOnUIThread;
import org.pushingpixels.trident.callback.TimelineCallbackAdapter;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Test application panel for testing {@link JProgressBar} component.
 * 
 * @author Kirill Grouchnikov
 */
public class ProgressBarPanel extends JPanel {
    /**
     * Button that starts the update of progress bars.
     */
    private JButton startButton;

    /**
     * Button that stops the update of progress bars.
     */
    private JButton stopButton;

    /**
     * Creates a new panel with progress bars.
     */
    public ProgressBarPanel() {
        this.setLayout(new BorderLayout());

        JPanel bars = new ScrollablePanel();
        GridLayout gLayout = new GridLayout(1, 2);
        bars.setLayout(gLayout);

        FormLayout horizontalLm = new FormLayout("left:pref:grow", "");
        DefaultFormBuilder horizontalBuilder = new DefaultFormBuilder(horizontalLm)
                .border(Borders.DIALOG);

        JProgressBar determinateEnHor = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
        determinateEnHor.setIndeterminate(false);
        horizontalBuilder.appendSeparator("Determinate enabled");
        horizontalBuilder.append(determinateEnHor);

        JProgressBar determinateEnHorStr = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
        determinateEnHorStr.setIndeterminate(false);
        determinateEnHorStr.setStringPainted(true);
        horizontalBuilder.appendSeparator("Determinate enabled + string");
        horizontalBuilder.append(determinateEnHorStr);

        JProgressBar indeterminateEnHor = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
        indeterminateEnHor.setIndeterminate(true);
        indeterminateEnHor.setStringPainted(true);
        indeterminateEnHor.setString("In progress");
        horizontalBuilder.appendSeparator("Indeterminate enabled + string");
        horizontalBuilder.append(indeterminateEnHor);

        JProgressBar determinateDisHor = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
        determinateDisHor.setIndeterminate(false);
        determinateDisHor.setEnabled(false);
        horizontalBuilder.appendSeparator("Determinate disabled");
        horizontalBuilder.append(determinateDisHor);

        JProgressBar determinateDisHorStr = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
        determinateDisHorStr.setIndeterminate(false);
        determinateDisHorStr.setEnabled(false);
        determinateDisHorStr.setStringPainted(true);
        horizontalBuilder.appendSeparator("Determinate disabled + string");
        horizontalBuilder.append(determinateDisHorStr);

        JProgressBar indeterminateDisHor = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
        indeterminateDisHor.setIndeterminate(true);
        indeterminateDisHor.setEnabled(false);
        horizontalBuilder.appendSeparator("Indeterminate disabled");
        horizontalBuilder.append(indeterminateDisHor);

        bars.add(horizontalBuilder.getPanel());

        FormLayout verticalLm = new FormLayout("center:pref:grow, 4dlu, center:pref:grow, 4dlu, "
                + "center:pref:grow, 4dlu, center:pref:grow, 4dlu, center:pref:grow", "");
        DefaultFormBuilder verticalBuilder = new DefaultFormBuilder(verticalLm)
                .border(Borders.DIALOG);
        verticalBuilder.append("Enabled");
        verticalBuilder.append("RTL");
        verticalBuilder.append("Indeterm");
        verticalBuilder.append("Disabled");
        verticalBuilder.append("Dis indet");

        JProgressBar determinateEnVer = new JProgressBar(JProgressBar.VERTICAL, 0, 100);
        determinateEnVer.setIndeterminate(false);
        determinateEnVer.setStringPainted(true);
        verticalBuilder.append(determinateEnVer);

        JProgressBar determinateEnVerRTL = new JProgressBar(JProgressBar.VERTICAL, 0, 100);
        determinateEnVerRTL.setIndeterminate(false);
        determinateEnVerRTL.setStringPainted(true);
        determinateEnVerRTL.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        verticalBuilder.append(determinateEnVerRTL);

        JProgressBar indeterminateEnVer = new JProgressBar(JProgressBar.VERTICAL, 0, 100);
        indeterminateEnVer.setIndeterminate(true);
        indeterminateEnVer.setStringPainted(true);
        indeterminateEnVer.setString("In progress");
        verticalBuilder.append(indeterminateEnVer);

        JProgressBar determinateDisVer = new JProgressBar(JProgressBar.VERTICAL, 0, 100);
        determinateDisVer.setIndeterminate(false);
        determinateDisVer.setEnabled(false);
        verticalBuilder.append(determinateDisVer);

        JProgressBar indeterminateDisVer = new JProgressBar(JProgressBar.VERTICAL, 0, 100);
        indeterminateDisVer.setIndeterminate(true);
        indeterminateDisVer.setEnabled(false);
        verticalBuilder.append(indeterminateDisVer);

        bars.add(verticalBuilder.getPanel());

        this.add(new JScrollPane(bars), BorderLayout.CENTER);

        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout(FlowLayout.CENTER));

        final Timeline progressTimeline = new Timeline(this);
        @RunOnUIThread
        class ProgressCallback extends TimelineCallbackAdapter {
            @Override
            public void onTimelinePulse(float durationFraction, float timelinePosition) {
                delta(ProgressBarPanel.this, 1);
            }
        }
        progressTimeline.addCallback(new ProgressCallback());
        progressTimeline.setDuration(2000);

        this.startButton = new JButton("start");
        this.startButton.addActionListener((ActionEvent e) -> {
            progressTimeline.playLoop(RepeatBehavior.LOOP);
            startButton.setEnabled(false);
            stopButton.setEnabled(true);
        });

        this.stopButton = new JButton("stop");
        this.stopButton.setEnabled(false);
        this.stopButton.addActionListener((ActionEvent e) -> {
            progressTimeline.cancel();
            stopButton.setEnabled(false);
            startButton.setEnabled(true);
        });

        JButton plus10Button = new JButton("plus 10");
        plus10Button.addActionListener((ActionEvent e) -> delta(ProgressBarPanel.this, 10));
        buttons.add(plus10Button);

        JButton minus10Button = new JButton("minus 10");
        minus10Button.addActionListener((ActionEvent e) -> delta(ProgressBarPanel.this, -10));
        buttons.add(minus10Button);

        JButton plus1Button = new JButton("plus 1");
        plus1Button.addActionListener((ActionEvent e) -> delta(ProgressBarPanel.this, 1));
        buttons.add(plus1Button);

        JButton minus1Button = new JButton("minus 1");
        minus1Button.addActionListener((ActionEvent e) -> delta(ProgressBarPanel.this, -1));
        buttons.add(minus1Button);

        JButton resetButton = new JButton("reset");
        resetButton.addActionListener((ActionEvent e) -> {
            progressTimeline.cancel();
            reset(ProgressBarPanel.this);
            stopButton.setEnabled(false);
            startButton.setEnabled(true);
        });

        buttons.add(this.startButton);
        buttons.add(this.stopButton);
        buttons.add(resetButton);

        this.add(buttons, BorderLayout.SOUTH);
    }

    protected static void delta(Component c, int delta) {
        if (c instanceof JProgressBar) {
            JProgressBar pb = (JProgressBar) c;
            if (!pb.isIndeterminate()) {
                int newValue = pb.getValue() + delta;
                if (newValue < pb.getMinimum())
                    newValue = pb.getMinimum();
                if (newValue > pb.getMaximum())
                    newValue = pb.getMaximum();
                pb.setValue(newValue);
            }
        }
        if (c instanceof Container) {
            Container cont = (Container) c;
            for (int i = 0; i < cont.getComponentCount(); i++) {
                delta(cont.getComponent(i), delta);
            }
        }
    }

    protected static void reset(Component c) {
        if (c instanceof JProgressBar) {
            JProgressBar pb = (JProgressBar) c;
            if (!pb.isIndeterminate()) {
                pb.setValue(pb.getMinimum());
            }
        }
        if (c instanceof Container) {
            Container cont = (Container) c;
            for (int i = 0; i < cont.getComponentCount(); i++) {
                reset(cont.getComponent(i));
            }
        }
    }
}