/*
 * Copyright (c) 2005-2018 Flamingo / Substance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.flamingo.common.ui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.plaf.ComponentUI;

import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.flamingo.internal.ui.common.popup.BasicColorSelectorPopupMenuUI;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.MenuGutterFillKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.DecorationPainterUtils;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;
import org.pushingpixels.substance.internal.utils.menu.SubstanceMenuBackgroundDelegate;

/**
 * UI for {@link JCommandPopupMenu} components in <b>Substance</b> look and
 * feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceCommandPopupMenuUI extends BasicColorSelectorPopupMenuUI {
    public static ComponentUI createUI(JComponent c) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(c);
        return new SubstanceCommandPopupMenuUI();
    }

    private DecorationPainterUtils.PopupInvokerLink popupInvokerLink;

    @Override
    public void installUI(JComponent c) {
        this.popupInvokerLink = () -> ((JCommandPopupMenu) c).getInvoker();
        super.installUI(c);
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        this.popupMenu.putClientProperty(DecorationPainterUtils.POPUP_INVOKER_LINK,
                this.popupInvokerLink);
    }

    @Override
    protected void uninstallDefaults() {
        this.popupMenu.putClientProperty(DecorationPainterUtils.POPUP_INVOKER_LINK, null);
        super.uninstallDefaults();
    }

    @Override
    protected JPanel createMenuPanel() {
        JPanel result = new SubstanceMenuPanel();
        result.putClientProperty(DecorationPainterUtils.POPUP_INVOKER_LINK, this.popupInvokerLink);
        return result;
    }

    protected static class SubstanceMenuPanel extends MenuPanel {
        @Override
        protected void paintIconGutterSeparator(Graphics g) {
        }

        @Override
        protected void paintIconGutterBackground(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            MenuGutterFillKind fillKind = SubstanceCoreUtilities.getMenuGutterFillKind();
            if (fillKind != MenuGutterFillKind.NONE) {
                SubstanceColorScheme scheme = SubstanceColorSchemeUtilities.getColorScheme(this,
                        ComponentState.ENABLED);
                Color extraLight = SubstanceMenuBackgroundDelegate.getGutterHardFillColor(scheme);
                Color ultraLight = SubstanceMenuBackgroundDelegate.getGutterSoftFillColor(scheme);
                Color leftColor = ((fillKind == MenuGutterFillKind.SOFT_FILL)
                        || (fillKind == MenuGutterFillKind.HARD)) ? ultraLight : extraLight;
                Color rightColor = ((fillKind == MenuGutterFillKind.SOFT_FILL)
                        || (fillKind == MenuGutterFillKind.SOFT)) ? ultraLight : extraLight;
                g2d.setComposite(WidgetUtilities.getAlphaComposite(this, 0.7f, g));

                int sepX = this.getSeparatorX();
                if (this.getComponentOrientation().isLeftToRight()) {
                    GradientPaint gp = new GradientPaint(0, 0, leftColor, sepX + 2, 0, rightColor);
                    g2d.setPaint(gp);
                    g2d.fillRect(0, 0, sepX, this.getHeight());
                } else {
                    GradientPaint gp = new GradientPaint(sepX, 0, leftColor, this.getWidth(), 0,
                            rightColor);
                    g2d.setPaint(gp);
                    g2d.fillRect(sepX + 2, 0, this.getWidth() - sepX, this.getHeight());
                }
            }
            g2d.dispose();
        }
    }

    @Override
    public void update(Graphics g, JComponent c) {
        BackgroundPaintingUtils.update(g, c, false);
    }

    @Override
    public int getColorSelectorCellSize() {
        return SubstanceSizeUtils.getComponentFontSize(popupPanel);
    }

    @Override
    public int getColorSelectorCellGap() {
        return (int) SubstanceSizeUtils.getAdjustedSize(
                SubstanceSizeUtils.getComponentFontSize(popupPanel), 4, 1, 0.25f);
    }
}
