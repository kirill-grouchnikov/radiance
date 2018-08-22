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
package org.pushingpixels.demo.substance.main.samples.substance.api;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;
import org.pushingpixels.substance.api.watermark.SubstanceStripeWatermark;

/**
 * Test application that shows the use of the
 * {@link SubstanceCortex.ComponentOrParentChainScope#setWatermarkVisible(javax.swing.JComponent, Boolean)}
 * API.
 * 
 * @author Kirill Grouchnikov
 * @see SubstanceCortex.ComponentOrParentChainScope#setWatermarkVisible(javax.swing.JComponent,
 *      Boolean)
 */
public class WatermarkVisible extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public WatermarkVisible() {
        super("Watermark visibility");

        this.setLayout(new GridLayout(1, 2));

        JPanel listPanel = new JPanel(new BorderLayout());
        JPanel coloredPanel = new JPanel(new BorderLayout());
        this.add(listPanel);
        this.add(coloredPanel);

        // create list with a few values
        final JList jlist = new JList(new Object[] { "value1", "value2", "value3", "value4" });
        listPanel.add(jlist, BorderLayout.CENTER);

        JPanel listControls = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        final JCheckBox isListWatermarkVisible = new JCheckBox("watermark visible");
        isListWatermarkVisible
                .addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
                    // based on checkbox selection, mark the list to
                    // show the watermark
                    SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jlist,
                            isListWatermarkVisible.isSelected());
                    repaint();
                }));
        listControls.add(isListWatermarkVisible);
        listPanel.add(listControls, BorderLayout.SOUTH);

        final JPanel colorPanel = new JPanel();
        colorPanel.setBackground(new Color(0, 0, 64));
        coloredPanel.add(colorPanel, BorderLayout.CENTER);

        JPanel panelControls = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        final JCheckBox isPanelWatermarkVisible = new JCheckBox("watermark visible");
        isPanelWatermarkVisible.setSelected(true);
        isPanelWatermarkVisible
                .addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
                    // based on checkbox selection, mark the panel to
                    // show the watermark
                    SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(colorPanel,
                            isPanelWatermarkVisible.isSelected());
                    repaint();
                }));
        panelControls.add(isPanelWatermarkVisible);
        coloredPanel.add(panelControls, BorderLayout.SOUTH);

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static class MySkin extends BusinessBlackSteelSkin {
        @Override
        public String getDisplayName() {
            return "My";
        }

        /**
         * Creates a custom skin.
         */
        public MySkin() {
            super();
            this.watermark = new SubstanceStripeWatermark();
        }
    }

    /**
     * The main method for <code>this</code> sample. The arguments are ignored.
     * 
     * @param args
     *            Ignored.
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new MySkin());
            new WatermarkVisible().setVisible(true);
        });
    }
}
