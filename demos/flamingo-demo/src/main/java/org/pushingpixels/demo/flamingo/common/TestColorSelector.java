/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
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
package org.pushingpixels.demo.flamingo.common;

import org.pushingpixels.demo.flamingo.LocaleSwitcher;
import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu;
import org.pushingpixels.neon.NeonCortex;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.geom.Rectangle2D;
import java.util.*;

public class TestColorSelector extends JFrame {
    private Color bColor;

    private ResourceBundle resourceBundle;

    private Locale currLocale;

    private JPanel centerPanel;

    private TestColorSelector() {
        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        JPanel top = new JPanel(new FlowLayout());

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle.getBundle(
                "org.pushingpixels.demo.flamingo.resource.Resources", currLocale);

        centerPanel = new JPanel();
        SubstanceCortex.ComponentOrParentChainScope.setColorizationFactor(centerPanel, 1.0);
        bColor = centerPanel.getBackground();

        this.add(top, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);

        final JCheckBox hasTheme = new JCheckBox("theme");
        hasTheme.setSelected(true);
        final JCheckBox hasStandard = new JCheckBox("standard");
        hasStandard.setSelected(true);
        final JCheckBox hasRecent = new JCheckBox("recent");
        hasRecent.setSelected(true);

        final ColorIcon colorIcon = new ColorIcon(bColor);

        JCommandButton jcb = new JCommandButton(colorIcon);
        jcb.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
        jcb.setDisplayState(CommandButtonDisplayState.SMALL);
        jcb.setFlat(false);

        final JColorSelectorPopupMenu.ColorSelectorCallback callback = new
                JColorSelectorPopupMenu.ColorSelectorCallback() {
                    @Override
                    public void onColorSelected(Color color) {
                        bColor = color;
                        centerPanel.setBackground(bColor);
                        colorIcon.setColor(bColor);
                    }

                    @Override
                    public void onColorRollover(Color color) {
                        if (color != null) {
                            centerPanel.setBackground(color);
                        } else {
                            centerPanel.setBackground(bColor);
                            colorIcon.setColor(bColor);
                        }
                    }
                };

        final Color defaultPanelColor = centerPanel.getBackground();
        jcb.setPopupCallback((JCommandButton commandButton) -> {
            JColorSelectorPopupMenu result = new JColorSelectorPopupMenu(callback);
            final JCommandMenuButton automaticColor = new JCommandMenuButton(
                    resourceBundle.getString("ColorSelector.textAutomatic"),
                    new ColorIcon(defaultPanelColor));
            automaticColor.getActionModel().addActionListener((ActionEvent e) -> {
                callback.onColorSelected(defaultPanelColor);
                JColorSelectorPopupMenu.addColorToRecentlyUsed(defaultPanelColor);
            });
            automaticColor.getActionModel().addChangeListener(new ChangeListener() {
                boolean wasRollover = automaticColor.getActionModel().isRollover();

                @Override
                public void stateChanged(ChangeEvent e) {
                    boolean isRollover = automaticColor.getActionModel().isRollover();
                    if (wasRollover && !isRollover) {
                        callback.onColorRollover(null);
                    }
                    if (!wasRollover && isRollover) {
                        callback.onColorRollover(Color.black);
                    }
                    wasRollover = isRollover;
                }
            });
            result.addMenuButton(automaticColor);

            if (hasTheme.isSelected()) {
                result.addColorSectionWithDerived(
                        resourceBundle.getString("ColorSelector.textThemeCaption"),
                        new Color[] { new Color(255, 255, 255), new Color(0, 0, 0),
                                new Color(160, 160, 160), new Color(16, 64, 128),
                                new Color(80, 128, 192), new Color(180, 80, 80),
                                new Color(160, 192, 80), new Color(128, 92, 160),
                                new Color(80, 160, 208), new Color(255, 144, 64) });
            }
            if (hasStandard.isSelected()) {
                result.addColorSection(
                        resourceBundle.getString("ColorSelector.textStandardCaption"),
                        new Color[] { new Color(140, 0, 0), new Color(253, 0, 0),
                                new Color(255, 160, 0), new Color(255, 255, 0),
                                new Color(144, 240, 144), new Color(0, 128, 0),
                                new Color(160, 224, 224), new Color(0, 0, 255),
                                new Color(0, 0, 128), new Color(128, 0, 128) });
            }
            if (hasRecent.isSelected()) {
                result.addRecentSection(
                        resourceBundle.getString("ColorSelector.textRecentCaption"));
            }

            JCommandMenuButton moreButton = new JCommandMenuButton(
                    resourceBundle.getString("ColorSelector.textMoreColor"), null);
            moreButton.getActionModel()
                    .addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
                        Color color = JColorChooser.showDialog(TestColorSelector.this,
                                "Color chooser", bColor);
                        if (color != null) {
                            callback.onColorSelected(color);
                            JColorSelectorPopupMenu.addColorToRecentlyUsed(color);
                        }
                    }));
            result.addMenuButton(moreButton);
            return result;
        });

        top.add(jcb);
        top.add(hasTheme);
        top.add(hasStandard);
        top.add(hasRecent);

        JComboBox localeSwitcher = LocaleSwitcher.getLocaleSwitcher((Locale selected) -> {
            currLocale = selected;
            resourceBundle = ResourceBundle.getBundle(
                    "org.pushingpixels.demo.flamingo.resource.Resources", currLocale);

            TestColorSelector.this
                    .applyComponentOrientation(ComponentOrientation.getOrientation(selected));
            SwingUtilities.updateComponentTreeUI(TestColorSelector.this);
        });
        top.add(localeSwitcher);

        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private class ColorIcon implements ResizableIcon {
        private int w;
        private int h;
        private Color color;

        private ColorIcon(Color color) {
            this.color = color;
        }

        private void setColor(Color color) {
            this.color = color;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(color);
            g2d.fillRect(x, y, w, h);
            float borderThickness = 1.0f / (float) NeonCortex.getScaleFactor();
            g2d.setColor(color.darker());
            g2d.setStroke(new BasicStroke(borderThickness, BasicStroke.CAP_ROUND,
                    BasicStroke.JOIN_ROUND));
            g2d.draw(new Rectangle2D.Double(x, y, w - borderThickness, h - borderThickness));
            g2d.dispose();
        }

        @Override
        public int getIconWidth() {
            return w;
        }

        @Override
        public int getIconHeight() {
            return h;
        }

        @Override
        public void setDimension(Dimension newDimension) {
            w = newDimension.width;
            h = newDimension.height;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());
            new TestColorSelector().setVisible(true);
        });
    }

}
