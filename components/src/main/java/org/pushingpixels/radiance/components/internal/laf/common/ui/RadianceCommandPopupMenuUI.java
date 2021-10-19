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
package org.pushingpixels.radiance.components.internal.laf.common.ui;

import org.pushingpixels.radiance.components.api.common.JCommandButton;
import org.pushingpixels.radiance.components.api.common.popup.AbstractPopupMenu;
import org.pushingpixels.radiance.components.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.radiance.components.internal.ui.common.CommandButtonLayoutManagerMedium;
import org.pushingpixels.radiance.components.internal.ui.common.popup.BasicCommandPopupMenuUI;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadiancePopupContainer;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

/**
 * UI for {@link JCommandPopupMenu} components in <b>Radiance</b> look and
 * feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceCommandPopupMenuUI extends BasicCommandPopupMenuUI {
    public static ComponentUI createUI(JComponent c) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(c);
        return new RadianceCommandPopupMenuUI();
    }

    private RadianceCommandPopupMenuUI() {
    }

    private DecorationPainterUtils.PopupInvokerLink popupInvokerLink;

    @Override
    public void installUI(JComponent c) {
        this.popupInvokerLink = ((AbstractPopupMenu) c)::getInvoker;
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
        JPanel result = new RadianceMenuPanel();
        result.putClientProperty(DecorationPainterUtils.POPUP_INVOKER_LINK, this.popupInvokerLink);
        return result;
    }

    @RadiancePopupContainer
    protected class RadianceMenuPanel extends MenuPanel {
        @Override
        protected void paintIconGutterBackground(Graphics g) {
            // Only paint the gutter background when the layout manager for the menu command
            // buttons is CommandButtonLayoutManagerMedium. Otherwise there's no guarantee where
            // the icons are, and what the overall layout is
            java.util.List<Component> menuComponents = popupMenu.getMenuComponents();
            if (menuComponents != null) {
                for (Component menuComponent : menuComponents) {
                    if (menuComponent instanceof JCommandButton) {
                        JCommandButton menuButton = (JCommandButton) menuComponent;
                        if (!(menuButton.getUI().getLayoutManager() instanceof
                                CommandButtonLayoutManagerMedium)) {
                            return;
                        }
                    }
                }
            }

            Graphics2D g2d = (Graphics2D) g.create();
            float fillAlpha = RadianceCoreUtilities.getMenuGutterFillAlpha();
            if (fillAlpha > 0.0f) {
                RadianceColorScheme scheme = RadianceColorSchemeUtilities.getColorScheme(this,
                        ComponentState.ENABLED);
                g2d.setComposite(WidgetUtilities.getAlphaComposite(this, fillAlpha, g));
                g2d.setColor(scheme.getAccentedBackgroundFillColor());

                int sepX = this.getSeparatorX();
                if (this.getComponentOrientation().isLeftToRight()) {
                    g2d.fillRect(0, 0, sepX, this.getHeight());
                } else {
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
}
