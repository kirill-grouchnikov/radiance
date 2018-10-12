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
package org.pushingpixels.flamingo.internal.ui.ribbon;

import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager.PopupEvent;
import org.pushingpixels.flamingo.api.ribbon.JRibbon;
import org.pushingpixels.flamingo.internal.ui.common.BasicCommandToggleButtonUI;
import org.pushingpixels.substance.api.SubstanceCortex;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.*;
import java.awt.*;

/**
 * Basic UI for toggle button of ribbon tasks {@link JRibbonTaskToggleButton}.
 *
 * @author Kirill Grouchnikov
 */
public abstract class BasicRibbonTaskToggleButtonUI extends BasicCommandToggleButtonUI {
    protected PopupPanelManager.PopupListener popupListener;

    @Override
    protected void installDefaults() {
        super.installDefaults();
        Font f = this.commandButton.getFont();
        if (f == null || f instanceof UIResource) {
            this.commandButton.setFont(SubstanceCortex.GlobalScope.getFontPolicy().getFontSet(null).getControlFont());
        }

        Border border = this.commandButton.getBorder();
        if (border == null || border instanceof UIResource) {
            Border toInstall = new BorderUIResource.EmptyBorderUIResource(1, 12, 1, 12);
            this.commandButton.setBorder(toInstall);
        }

        this.commandButton.setFlat(true);
        this.commandButton.setOpaque(false);
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        this.popupListener = new PopupPanelManager.PopupListener() {
            @Override
            public void popupShown(PopupEvent event) {
                if (event.getSource() == commandButton) {
                    commandButton.getActionModel().setSelected(isTaskSelected());
                }
            }

            @Override
            public void popupHidden(PopupEvent event) {
                if (event.getSource() == commandButton) {
                    commandButton.getActionModel().setSelected(isTaskSelected());
                }
            }

            private boolean isTaskSelected() {
                JRibbon ribbon = (JRibbon) SwingUtilities.getAncestorOfClass(
                        JRibbon.class, commandButton);
                if (ribbon == null) {
                    return false;
                }

                return ribbon.getSelectedTask() ==
                        ((JRibbonTaskToggleButton) commandButton).getRibbonTask();
            }
        };
        PopupPanelManager.defaultManager().addPopupListener(this.popupListener);
    }

    @Override
    protected void uninstallListeners() {
        PopupPanelManager.defaultManager().removePopupListener(
                this.popupListener);
        this.popupListener = null;

        super.uninstallListeners();
    }

    @Override
    public Dimension getMinimumSize(JComponent c) {
        JRibbonTaskToggleButton b = (JRibbonTaskToggleButton) c;

        Icon icon = b.getIcon();
        String text = "Www";

        Font font = b.getFont();
        FontMetrics fm = b.getFontMetrics(font);

        Rectangle iconR = new Rectangle();
        Rectangle textR = new Rectangle();
        Rectangle viewR = new Rectangle(Short.MAX_VALUE, Short.MAX_VALUE);

        SwingUtilities.layoutCompoundLabel(b, fm, text, icon,
                SwingUtilities.CENTER, b.getHorizontalAlignment(),
                SwingUtilities.CENTER, SwingUtilities.CENTER, viewR, iconR,
                textR, (text == null ? 0 : 6));

        Rectangle r = iconR.union(textR);

        Insets insets = b.getInsets();
        r.width += 4;
        r.height += insets.top + insets.bottom;

        return r.getSize();
    }
}
