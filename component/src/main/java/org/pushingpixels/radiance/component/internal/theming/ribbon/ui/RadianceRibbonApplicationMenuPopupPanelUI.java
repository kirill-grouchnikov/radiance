/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.theming.ribbon.ui;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.component.internal.ui.ribbon.appmenu.BasicRibbonApplicationMenuPopupPanelUI;
import org.pushingpixels.radiance.component.internal.ui.ribbon.appmenu.JRibbonApplicationMenuPopupPanel;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.border.RadianceBorder;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

/**
 * UI for {@link JRibbonApplicationMenuPopupPanel} components in
 * <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceRibbonApplicationMenuPopupPanelUI
        extends BasicRibbonApplicationMenuPopupPanelUI {
    public static ComponentUI createUI(JComponent c) {
        return new RadianceRibbonApplicationMenuPopupPanelUI();
    }

    private RadianceRibbonApplicationMenuPopupPanelUI() {
    }

    @Override
    protected void installComponents() {
        super.installComponents();
        Border newBorder = new BorderUIResource.CompoundBorderUIResource(
                new RadianceBorder(0, new Insets(2, 2, 2, 2)),
                new Border() {
                    @Override
                    public boolean isBorderOpaque() {
                        return true;
                    }

                    @Override
                    public Insets getBorderInsets(Component c) {
                        return new Insets(18, 0, 0, 0);
                    }

                    @Override
                    public void paintBorder(Component c, Graphics g, int x, int y, int width,
                            int height) {
                        RadianceSkin skin = RadianceCoreUtilities.getSkin(c);
                        RadianceColorScheme scheme = skin.getBackgroundColorScheme(
                                DecorationPainterUtils.getDecorationType(c));
                        Color backgroundFill = scheme.getAccentedBackgroundFillColor();

                        Graphics2D g2d = (Graphics2D) g.create(x, y, width, height);
                        g2d.setColor(backgroundFill);
                        g2d.fillRect(0, 0, width, height);
                        g2d.dispose();
                    }
                });
        this.applicationMenuPopupPanel.setBorder(newBorder);

        this.panelScrollerLevel2.setBorder(new BorderUIResource(new Border() {
            @Override
            public Insets getBorderInsets(Component c) {
                boolean ltr = c.getComponentOrientation().isLeftToRight();
                return new Insets(0, ltr ? 1 : 0, 0, ltr ? 0 : 1);
            }

            @Override
            public boolean isBorderOpaque() {
                return true;
            }

            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D graphics = (Graphics2D) g.create();
                // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
                // to not normalize coordinates to paint at full pixels, and will result in blurry
                // outlines.
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, c.getWidth(), c.getHeight(),
                        (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
                            RadianceColorScheme scheme = RadianceColorSchemeUtilities.getColorScheme(
                                    applicationMenuPopupPanel, ColorSchemeAssociationKind.BORDER,
                                    ComponentState.ENABLED);
                            graphics1X.setColor(scheme.getMidColor());
                            boolean ltr = applicationMenuPopupPanel.getComponentOrientation().isLeftToRight();
                            int lineX = ltr ? 1 : scaledWidth - 2;
                            graphics1X.drawLine(lineX, 1, lineX, scaledHeight - 2);
                        });
                graphics.dispose();
            }
        }));
        this.panelLevel2.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.mainPanel.setBorder(new RadianceBorder());
    }

    @Override
    public void update(Graphics g, JComponent c) {
        if (!RadianceCoreUtilities.isCurrentLookAndFeel()) {
            return;
        }

        BackgroundPaintingUtils.update(g, c, false);
        super.paint(g, c);
    }
}
