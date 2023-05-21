/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.ui;

import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.painter.SeparatorPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;
import org.pushingpixels.radiance.theming.internal.utils.menu.MenuUtilities;
import org.pushingpixels.radiance.theming.internal.utils.menu.RadianceMenuBackgroundDelegate;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSeparatorUI;
import java.awt.*;

/**
 * UI for separators in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceSeparatorUI extends BasicSeparatorUI {
    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceSeparatorUI();
    }

    protected RadianceSeparatorUI() {
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        JSeparator separator = (JSeparator) c;
        Component parent = separator.getParent();

        if (!(parent instanceof JPopupMenu)) {
            SeparatorPainterUtils.paintSeparator(separator, g,
                    separator.getWidth(), separator.getHeight(),
                    separator.getOrientation());
            return;
        }

        Graphics2D graphics = (Graphics2D) g.create();

        int xOffset = MenuUtilities.getTextOffset(c, parent);
        RadianceMenuBackgroundDelegate.paintBackground(graphics, c, xOffset);
        Dimension s = c.getSize();

        int fadeLength = (RadianceCoreUtilities.getSeparatorAppearance(separator) ==
                RadianceThemingSlices.SeparatorAppearance.SOFT) ? 2 : 0;

        int startX;
        int width;
        if (parent.getComponentOrientation().isLeftToRight()) {
            startX = xOffset - fadeLength;
            width = s.width - startX;
        } else {
            startX = 0;
            width = xOffset - 2 * fadeLength;
        }
        graphics.translate(startX, 0);
        graphics.setComposite(WidgetUtilities.getAlphaComposite(parent));
        SeparatorPainterUtils.paintSeparator(separator, graphics, width, s.height,
                separator.getOrientation(), true, fadeLength);

        graphics.dispose();
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        float borderStrokeWidth = RadianceSizeUtils.getBorderStrokeWidth(c);
        int prefSize = (int) (Math.ceil(2.0 * borderStrokeWidth));
        if (((JSeparator) c).getOrientation() == SwingConstants.VERTICAL)
            return new Dimension(prefSize, 0);
        else
            return new Dimension(0, prefSize);
    }
}
