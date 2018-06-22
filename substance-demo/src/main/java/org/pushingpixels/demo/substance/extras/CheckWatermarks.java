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
package org.pushingpixels.demo.substance.extras;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.colorscheme.LightGrayColorScheme;
import org.pushingpixels.substance.api.colorscheme.SunfireRedColorScheme;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultComboBoxRenderer;
import org.pushingpixels.substance.api.skin.ModerateSkin;
import org.pushingpixels.substance.api.watermark.SubstanceNullWatermark;
import org.pushingpixels.substance.api.watermark.SubstanceStripeWatermark;
import org.pushingpixels.substance.api.watermark.SubstanceWatermark;
import org.pushingpixels.substance.extras.api.watermarkpack.*;
import org.pushingpixels.substance.extras.api.watermarkpack.flamefractal
        .SubstanceKaleidoscopeWatermark;
import org.pushingpixels.substance.extras.api.watermarkpack.flamefractal
        .SubstanceScripturesWatermark;
import org.pushingpixels.substance.extras.api.watermarkpack.flamefractal
        .SubstanceSingularityWatermark;
import org.pushingpixels.substance.extras.api.watermarkpack.flamefractal.SubstanceVortexWatermark;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;

public class CheckWatermarks extends JFrame {
    public static class CustomSkin extends ModerateSkin {
        public CustomSkin(SubstanceWatermark watermark) {
            super();
            this.watermark = watermark;
            this.watermarkScheme = new LightGrayColorScheme().shade(0.3f);
        }

        @Override
        public String getDisplayName() {
            return "Custom " + this.watermark.getDisplayName();
        }
    }

    public static JComboBox getWatermarkSwitcher(final JFrame frame) {
        List<SubstanceWatermark> watermarks = new ArrayList<>();
        watermarks.add(new SubstanceNullWatermark());
        watermarks.add(new SubstanceBinaryWatermark());
        watermarks.add(new SubstanceBrushedMetalWatermark());
        watermarks.add(new SubstanceBubblesWatermark());
        watermarks.add(new SubstanceCrosshatchWatermark());
        watermarks.add(new SubstanceExceedWatermark());
        watermarks.add(new SubstanceKatakanaWatermark());
        watermarks.add(new SubstanceLatchWatermark());
        watermarks.add(new SubstanceMetalWallWatermark());
        watermarks.add(new SubstanceMosaicWatermark());
        watermarks.add(new SubstanceStripeWatermark());
        watermarks.add(new SubstanceCopperplateEngravingWatermark());
        watermarks.add(new SubstanceFabricWatermark());
        watermarks.add(new SubstanceGenericNoiseWatermark());
        watermarks.add(new SubstanceMagneticFieldWatermark());
        watermarks.add(new SubstanceMarbleVeinWatermark());
        watermarks.add(new SubstanceMazeWatermark());
        watermarks.add(new SubstancePlanktonWatermark());
        watermarks.add(new SubstanceWoodWatermark());
        watermarks.add(new SubstanceKaleidoscopeWatermark());
        watermarks.add(new SubstanceScripturesWatermark());
        watermarks.add(new SubstanceSingularityWatermark());
        watermarks.add(new SubstanceVortexWatermark());

        final JComboBox result = new JComboBox(watermarks.toArray());
        result.setRenderer(new SubstanceDefaultComboBoxRenderer(result) {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                SubstanceWatermark sw = (SubstanceWatermark) value;
                return super.getListCellRendererComponent(list, sw.getDisplayName(), index,
                        isSelected, cellHasFocus);
            }
        });

        result.addItemListener((ItemEvent e) -> SwingUtilities.invokeLater(() -> {
            SubstanceWatermark selected = (SubstanceWatermark) result.getSelectedItem();
            SubstanceCortex.GlobalScope.setSkin(new CustomSkin(selected));
            SwingUtilities.updateComponentTreeUI(frame);
        }));

        return result;
    }


    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public CheckWatermarks() {
        super("Check watermarks");

        setLayout(new BorderLayout());

        final JPanel panel = new JPanel(new FlowLayout());

        panel.add(new JLabel("Watermarks"));
        panel.add(getWatermarkSwitcher(this));

        this.add(panel, BorderLayout.CENTER);

        this.setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            SubstanceCortex.GlobalScope.setSkin(new ModerateSkin());
            new CheckWatermarks().setVisible(true);
        });
    }
}
