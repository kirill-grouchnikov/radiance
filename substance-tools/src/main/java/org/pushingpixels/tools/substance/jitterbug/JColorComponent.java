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
package org.pushingpixels.tools.substance.jitterbug;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;

public class JColorComponent extends JComponent {
    private JRadioButton radio;

    private Color selectedColor;

    private ColorVisualizer visualizer;

    private class ColorVisualizer extends JComponent {
        boolean isRollover;

        public ColorVisualizer() {
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (!isEnabled())
                        return;

                    SwingUtilities.invokeLater(() -> {
                        radio.setSelected(true);
                        Color selected = JColorChooser.showDialog(ColorVisualizer.this,
                                "Color chooser", selectedColor);
                        if (selected != null) {
                            Color old = selectedColor;
                            selectedColor = selected;
                            JColorComponent.this.firePropertyChange("selectedColor", old,
                                    selectedColor);
                        }
                    });
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    if (!isEnabled())
                        return;

                    isRollover = true;
                    repaint();
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (!isEnabled())
                        return;

                    isRollover = false;
                    repaint();
                }
            });
            this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            this.setToolTipText("Open color chooser and change the color");
            this.isRollover = false;
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            RenderingUtils.installDesktopHints(g2d, this);
            g2d.setFont(UIManager.getFont("Label.font"));

            if (selectedColor != null) {
                g2d.setColor(selectedColor);
                g2d.fillRect(2, 2, 100, getHeight() - 4);
                g2d.setStroke(new BasicStroke(isRollover ? 2.5f : 1.0f));
                g2d.setColor(selectedColor.darker());
                g2d.drawRect(2, 2, 99, getHeight() - 5);

                g2d.setColor(Color.black);
                g2d.drawString(getEncodedColor(), 108,
                        (getHeight() + g2d.getFontMetrics().getHeight()) / 2
                                - g2d.getFontMetrics().getDescent());
            } else {
                g2d.setColor(isEnabled() ? Color.gray : Color.lightGray);
                g2d.drawString("click to choose", 5,
                        (getHeight() + g2d.getFontMetrics().getHeight()) / 2
                                - g2d.getFontMetrics().getDescent());
            }

            g2d.dispose();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 25);
        }
    }

    public JColorComponent(String name, Color color) {
        this.radio = new JRadioButton(name);
        this.radio.setFocusable(false);
        this.selectedColor = color;
        this.visualizer = new ColorVisualizer();
        this.setLayout(new ColorComponentLayout());

        this.add(this.radio);
        this.add(this.visualizer);
    }

    private class ColorComponentLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void layoutContainer(Container parent) {
            JColorComponent cc = (JColorComponent) parent;
            int width = cc.getWidth();
            int height = cc.getHeight();

            ColorVisualizer cv = cc.visualizer;
            Dimension cvPref = cv.getPreferredSize();
            cv.setBounds(width - cvPref.width, 0, cvPref.width, height);
            cc.radio.setBounds(0, 0, width - cvPref.width, height);
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return preferredLayoutSize(parent);
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            JColorComponent cc = (JColorComponent) parent;
            ColorVisualizer cv = cc.visualizer;
            Dimension cvPref = cv.getPreferredSize();
            return new Dimension(100 + cvPref.width, cvPref.height);
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }
    }

    public String getEncodedColor() {
        return "#" + encodeColorComponent(selectedColor.getRed())
                + encodeColorComponent(selectedColor.getGreen())
                + encodeColorComponent(selectedColor.getBlue());
    }

    private static String encodeColorComponent(int colorComp) {
        String hex = "0123456789ABCDEF";
        return "" + hex.charAt(colorComp / 16) + hex.charAt(colorComp % 16);
    }

    public JRadioButton getRadio() {
        return radio;
    }

    public void setColor(Color color, boolean firePropertyChange) {
        Color old = this.selectedColor;
        this.selectedColor = color;
        this.repaint();
        if (firePropertyChange) {
            this.firePropertyChange("selectedColor", old, selectedColor);
        }
    }

    public Color getColor() {
        return this.selectedColor;
    }

    public boolean isDefined() {
        return (this.selectedColor != null);
    }
}
