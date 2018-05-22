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
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;
import javax.swing.JSplitPane;

import org.pushingpixels.substance.api.SubstanceCortex;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Test application panel for testing {@link JSplitPane} component.
 * 
 * @author Kirill Grouchnikov
 */
public class SplitPanel extends ControllablePanel {
    /**
     * Split pane.
     */
    private JSplitPane splitPane;

    /**
     * Creates a test panel with split pane.
     */
    public SplitPanel() {
        this.setLayout(new BorderLayout());
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new NumberedPanel(1),
                new NumberedPanel(2));
        splitPane.setDividerLocation(100);
        this.add(splitPane, BorderLayout.CENTER);

        FormLayout lm = new FormLayout("fill:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm, new ScrollablePanel());

        final JCheckBox isOneTouch = new JCheckBox("is one-touch");
        isOneTouch.setSelected(true);
        splitPane.setOneTouchExpandable(true);
        isOneTouch.addActionListener(
                (ActionEvent e) -> splitPane.setOneTouchExpandable(isOneTouch.isSelected()));

        final JCheckBox isFlat = new JCheckBox("is flat");
        isFlat.setSelected(true);
        isFlat.addActionListener((ActionEvent e) -> {
            SubstanceCortex.ComponentOrParentScope.setFlatBackground(splitPane,
                    isFlat.isSelected() ? Boolean.TRUE : Boolean.FALSE);
            splitPane.repaint();
        });

        final JCheckBox isVertical = new JCheckBox("is vertical");
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        isVertical.setSelected(true);
        isVertical.addActionListener((ActionEvent e) -> splitPane.setOrientation(
                isVertical.isSelected() ? JSplitPane.VERTICAL_SPLIT : JSplitPane.HORIZONTAL_SPLIT));

        final JCheckBox isEnabled = new JCheckBox("is enabled");
        isEnabled.setSelected(true);
        isEnabled
                .addActionListener((ActionEvent e) -> splitPane.setEnabled(isEnabled.isSelected()));

        builder.append(isEnabled);
        builder.append(isOneTouch);
        builder.append(isFlat);
        builder.append(isVertical);

        this.controlPanel = builder.getPanel();

        this.setPreferredSize(new Dimension(400, 400));
        this.setSize(this.getPreferredSize());
        this.setMinimumSize(this.getPreferredSize());
    }
}