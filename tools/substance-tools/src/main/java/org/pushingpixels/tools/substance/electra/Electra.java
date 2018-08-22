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
package org.pushingpixels.tools.substance.electra;

import org.pushingpixels.demo.substance.main.RadianceLogo;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.skin.GeminiSkin;
import org.pushingpixels.tools.substance.common.JImageComponent;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class Electra extends JFrame {
    public Electra() {
        super("Electra");
        this.setIconImage(RadianceLogo
                .getLogoImage(SubstanceCortex.ComponentScope.getCurrentSkin(this.getRootPane())
                        .getColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE,
                                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)));

        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(1, 2));

        final JImageComponent jic = new JImageComponent(false);
        jic.setLegend(new String[] { "\tDrag and drop an image file from local disk" });
        jic.setBorder(new Border() {
            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setColor(
                        SubstanceCortex.ComponentScope
                                .getCurrentSkin(c).getColorScheme(c,
                                        ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED)
                                .getMidColor());
                g2d.drawLine(x + width - 2, y, x + width - 2, y + height - 1);
                g2d.setComposite(AlphaComposite.SrcOver.derive(0.8f));
                g2d.setColor(
                        SubstanceCortex.ComponentScope
                                .getCurrentSkin(c).getColorScheme(c,
                                        ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED)
                                .getExtraLightColor().brighter());
                g2d.drawLine(x + width - 1, y, x + width - 1, y + height - 1);
                g2d.dispose();
            }

            @Override
            public boolean isBorderOpaque() {
                return false;
            }

            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(0, 0, 0, 2);
            }
        });
        this.add(jic);

        final JElectrifiedImageComponent jeic = new JElectrifiedImageComponent(jic);

        JPanel electrifiedContainer = new JPanel(new BorderLayout());
        JScrollPane scroller = new JScrollPane(jeic, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroller.setBorder(new EmptyBorder(0, 0, 0, 0));
        electrifiedContainer.add(scroller, BorderLayout.CENTER);

        JButton saveElectrified = new JButton("save");
        saveElectrified.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            File originalFile = jic.getOriginalFile();
            if (originalFile != null) {
                jeic.save(originalFile);
            }
        }));
        JPanel controls = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        controls.add(saveElectrified);
        electrifiedContainer.add(controls, BorderLayout.SOUTH);

        this.add(electrifiedContainer);

        jic.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    Point absPoint = jic.toOriginalImageCoords(e.getX(), e.getY());
                    jeic.addZoomBubble(absPoint.x, absPoint.y, 80);
                }
            }
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new GeminiSkin());

            new Electra().setVisible(true);
        });
    }

}
