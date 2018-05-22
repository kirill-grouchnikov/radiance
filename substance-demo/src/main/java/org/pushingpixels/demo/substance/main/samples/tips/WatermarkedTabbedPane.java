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
package org.pushingpixels.demo.substance.main.samples.tips;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.ImageWatermarkKind;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;
import org.pushingpixels.substance.api.watermark.SubstanceImageWatermark;

public class WatermarkedTabbedPane extends JFrame {
    private static class TabControl extends JPanel {
        public TabControl(String topLabel, String bottomLabel) {
            this.setOpaque(false);

            this.setLayout(new GridLayout(2, 1));
            JLabel top = new JLabel(topLabel);
            top.setFont(top.getFont().deriveFont(15.0f).deriveFont(Font.BOLD));

            JLabel bottom = new JLabel(bottomLabel);

            this.add(top);
            this.add(bottom);
        }
    }

    public WatermarkedTabbedPane() {
        super("Transparent tabs");

        final JTabbedPane jtp = new JTabbedPane();
        SubstanceCortex.ComponentScope.setTabContentPaneBorderKind(jtp,
                SubstanceSlices.TabContentPaneBorderKind.SINGLE_PLACEMENT);

        jtp.addTab("Tab 1", new JPanel());
        jtp.setTabComponentAt(0, new TabControl("System", "Description"));
        jtp.addTab("Tab 2", new JPanel());
        jtp.setTabComponentAt(1, new TabControl("Monitors", "Description"));

        this.setLayout(new BorderLayout(10, 10));
        this.add(jtp);

        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private static class MySkin extends BusinessBlackSteelSkin {
        public MySkin() {
            super();
            try {
                SubstanceImageWatermark imageWatermark = new SubstanceImageWatermark(new URL(
                        "http://www.wallpaperpimper.com/wallpaper/Art_&_3D/Abstract/Lime-Green-Abstract-1-F8T4BX57YH-800x600.jpg")
                                .openStream());
                imageWatermark.setOpacity(1.0f);
                imageWatermark.setKind(ImageWatermarkKind.APP_ANCHOR);
                this.watermark = imageWatermark;
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }

        @Override
        public String getDisplayName() {
            return "My";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new MySkin());
            new WatermarkedTabbedPane().setVisible(true);
        });
    }

}
