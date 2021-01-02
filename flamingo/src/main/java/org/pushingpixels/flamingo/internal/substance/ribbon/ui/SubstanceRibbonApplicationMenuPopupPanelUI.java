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
package org.pushingpixels.flamingo.internal.substance.ribbon.ui;

import org.pushingpixels.flamingo.internal.ui.ribbon.appmenu.BasicRibbonApplicationMenuPopupPanelUI;
import org.pushingpixels.flamingo.internal.ui.ribbon.appmenu.JRibbonApplicationMenuPopupPanel;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.DecorationPainterUtils;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.border.SubstanceBorder;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 * UI for {@link JRibbonApplicationMenuPopupPanel} components in
 * <b>Substance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceRibbonApplicationMenuPopupPanelUI
        extends BasicRibbonApplicationMenuPopupPanelUI {
    public static ComponentUI createUI(JComponent c) {
        return new SubstanceRibbonApplicationMenuPopupPanelUI();
    }

    private SubstanceRibbonApplicationMenuPopupPanelUI() {
    }

    @Override
    protected void installComponents() {
        super.installComponents();
        Border newBorder = new BorderUIResource.CompoundBorderUIResource(
                new SubstanceBorder(0, new Insets(2, 2, 2, 2)),
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
                        SubstanceSkin skin = SubstanceCoreUtilities.getSkin(c);
                        SubstanceColorScheme scheme = skin.getBackgroundColorScheme(
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
                float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;
                float borderThickness = SubstanceSizeUtils.getBorderStrokeWidth();

                Graphics2D g2d = (Graphics2D) g.create();
                SubstanceColorScheme scheme = SubstanceColorSchemeUtilities.getColorScheme(
                        applicationMenuPopupPanel, ColorSchemeAssociationKind.BORDER,
                        ComponentState.ENABLED);
                g2d.setColor(scheme.getMidColor());
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                        RenderingHints.VALUE_STROKE_NORMALIZE);
                g2d.setStroke(new BasicStroke(borderThickness, BasicStroke.CAP_BUTT,
                        BasicStroke.JOIN_ROUND));

                boolean ltr = applicationMenuPopupPanel.getComponentOrientation().isLeftToRight();
                float lineX = ltr ? borderDelta : c.getWidth() - borderDelta - borderThickness;
                g2d.draw(new Line2D.Float(lineX, borderDelta, lineX,
                        height - borderThickness - 2 * borderDelta));

                g2d.dispose();
            }
        }));
        this.panelLevel2.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.mainPanel.setBorder(new SubstanceBorder());
    }

    @Override
    public void update(Graphics g, JComponent c) {
        if (!SubstanceCoreUtilities.isCurrentLookAndFeel()) {
            return;
        }

        BackgroundPaintingUtils.update(g, c, false);
        super.paint(g, c);
    }
}
