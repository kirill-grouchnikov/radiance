/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of the copyright holder nor the names of
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
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.model.ColorSelectorCommand;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu;
import org.pushingpixels.flamingo.api.common.popup.model.ColorSelectorPopupMenuContentModel;
import org.pushingpixels.flamingo.api.common.popup.model.ColorSelectorPopupMenuGroupModel;
import org.pushingpixels.flamingo.api.common.projection.ColorSelectorCommandButtonProjection;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Collections;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestColorSelector extends JFrame {
    private ResourceBundle resourceBundle;

    private Locale currLocale;

    private ColorSelectorCommand colorSelectorCommand;

    private Color backgroundColor;

    private TestColorSelector() {
        this.setIconImage(RadianceLogo.getLogoImage(this,
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        JPanel top = new JPanel(new FlowLayout());

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle.getBundle(
                "org.pushingpixels.demo.flamingo.resource.Resources", currLocale);

        final JPanel centerPanel = new JPanel();
        SubstanceCortex.ComponentOrParentChainScope.setColorizationFactor(centerPanel, 1.0);
        backgroundColor = centerPanel.getBackground();

        this.add(top, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);

        final JCheckBox hasTheme = new JCheckBox("theme");
        hasTheme.setSelected(true);
        final JCheckBox hasStandard = new JCheckBox("standard");
        hasStandard.setSelected(true);
        final JCheckBox hasRecent = new JCheckBox("recent");
        hasRecent.setSelected(true);

        final ColorSelectorPopupMenuContentModel.ColorActivationListener colorActivationListener =
                (Color color) -> {
                    backgroundColor = color;
                    centerPanel.setBackground(backgroundColor);
                    colorSelectorCommand.setIconFactory(ColorIcon.factory(backgroundColor));
                };
        final ColorSelectorPopupMenuContentModel.ColorPreviewListener colorPreviewListener =
                new ColorSelectorPopupMenuContentModel.ColorPreviewListener() {
                    @Override
                    public void onColorPreviewActivated(Color color) {
                        centerPanel.setBackground(color);
                    }

                    @Override
                    public void onColorPreviewCanceled() {
                        centerPanel.setBackground(backgroundColor);
                    }
                };

        final Color defaultPanelColor = centerPanel.getBackground();
        ColorSelectorPopupMenuGroupModel.Builder selectorBuilder =
                ColorSelectorPopupMenuGroupModel.builder();

        selectorBuilder.addCommand(Command.builder()
                .setText(resourceBundle.getString("ColorSelector.textAutomatic"))
                .setIconFactory(ColorIcon.factory(defaultPanelColor))
                .setAction(commandActionEvent -> {
                    colorActivationListener.onColorActivated(defaultPanelColor);
                    JColorSelectorPopupMenu.addColorToRecentlyUsed(defaultPanelColor);
                })
                .setActionPreview(new Command.CommandActionPreview() {
                    @Override
                    public void onCommandPreviewActivated(Command command) {
                        colorPreviewListener.onColorPreviewActivated(defaultPanelColor);
                    }

                    @Override
                    public void onCommandPreviewCanceled(Command command) {
                        colorPreviewListener.onColorPreviewCanceled();
                    }
                })
                .build());

        if (hasTheme.isSelected()) {
            selectorBuilder.addColorSectionWithDerived(
                    new ColorSelectorPopupMenuGroupModel.ColorSectionModel(
                            resourceBundle.getString("ColorSelector.textThemeCaption"),
                            new Color[] { new Color(255, 255, 255), new Color(0, 0, 0),
                                    new Color(160, 160, 160), new Color(16, 64, 128),
                                    new Color(80, 128, 192), new Color(180, 80, 80),
                                    new Color(160, 192, 80), new Color(128, 92, 160),
                                    new Color(80, 160, 208), new Color(255, 144, 64) }));
        }
        if (hasStandard.isSelected()) {
            selectorBuilder.addColorSection(
                    new ColorSelectorPopupMenuGroupModel.ColorSectionModel(
                            resourceBundle.getString("ColorSelector.textStandardCaption"),
                            new Color[] { new Color(140, 0, 0), new Color(253, 0, 0),
                                    new Color(255, 160, 0), new Color(255, 255, 0),
                                    new Color(144, 240, 144), new Color(0, 128, 0),
                                    new Color(160, 224, 224), new Color(0, 0, 255),
                                    new Color(0, 0, 128), new Color(128, 0, 128) }));
        }
        if (hasRecent.isSelected()) {
            selectorBuilder.addRecentsSection(
                    new ColorSelectorPopupMenuGroupModel.ColorSectionModel(
                            resourceBundle.getString("ColorSelector.textRecentCaption")));
        }

        selectorBuilder.addCommand(Command.builder()
                .setText(resourceBundle.getString("ColorSelector.textMoreColor"))
                .setAction(commandActionEvent -> SwingUtilities.invokeLater(() -> {
                    Color color = JColorChooser.showDialog(TestColorSelector.this,
                            "Color chooser", backgroundColor);
                    if (color != null) {
                        colorActivationListener.onColorActivated(color);
                        JColorSelectorPopupMenu.addColorToRecentlyUsed(color);
                    }
                }))
                .build());

        ColorSelectorPopupMenuContentModel selectorModel =
                new ColorSelectorPopupMenuContentModel(
                        Collections.singletonList(selectorBuilder.build()));
        selectorModel.setColorActivationListener(colorActivationListener);
        selectorModel.setColorPreviewListener(colorPreviewListener);

        this.colorSelectorCommand = ColorSelectorCommand.colorSelectorBuilder()
                .setIconFactory(ColorIcon.factory(backgroundColor))
                .setColorSelectorPopupMenuContentModel(selectorModel)
                .build();
        JCommandButton colorButton = new ColorSelectorCommandButtonProjection(
                this.colorSelectorCommand,
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.SMALL)
                        .setFlat(false)
                        .build())
                .buildComponent();

        top.add(colorButton);
        top.add(hasTheme);
        top.add(hasStandard);
        top.add(hasRecent);

        JComboBox<LocaleSwitcher.LocaleInfo> localeSwitcher = LocaleSwitcher.getLocaleSwitcher((Locale selected) -> {
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

    private static class ColorIcon implements NeonIcon {
        private int w;
        private int h;
        private Color color;

        private ColorIcon(Color color) {
            this.color = color;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(color);
            g2d.fillRect(x, y, w, h);
            float borderThickness = 1.0f / (float) NeonCortex.getScaleFactor(c);
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

        public static Factory factory(Color color) {
            return () -> new ColorIcon(color);
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
