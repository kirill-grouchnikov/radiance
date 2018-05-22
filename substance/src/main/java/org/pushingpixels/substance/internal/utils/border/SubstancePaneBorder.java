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
package org.pushingpixels.substance.internal.utils.border;

import java.awt.BasicStroke;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;

import javax.swing.SwingUtilities;
import javax.swing.border.AbstractBorder;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Root pane and internal frame border in <b>Substance</b> look and feel. This class is <b>for
 * internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstancePaneBorder extends AbstractBorder implements UIResource {
    /**
     * Default border thickness.
     */
    private static final int BORDER_THICKNESS = 4;

    /**
     * Default insets.
     */
    private static final Insets INSETS = new Insets(SubstancePaneBorder.BORDER_THICKNESS,
            SubstancePaneBorder.BORDER_THICKNESS, SubstancePaneBorder.BORDER_THICKNESS,
            SubstancePaneBorder.BORDER_THICKNESS);

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.border.Border#paintBorder(java.awt.Component, java.awt.Graphics, int, int,
     * int, int)
     */
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int w, int h) {
        SubstanceSkin skin = SubstanceCoreUtilities.getSkin(c);
        if (skin == null)
            return;

        SubstanceColorScheme scheme = skin
                .getBackgroundColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE);
        Component titlePaneComp = SubstanceCoreUtilities
                .getTitlePaneComponent(SwingUtilities.windowForComponent(c));
        SubstanceColorScheme borderScheme = skin.getColorScheme(titlePaneComp,
                ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);

        Graphics2D graphics = (Graphics2D) g.create();

        double scaleFactor = UIUtil.getScaleFactor();
        float strokeWidth = (scaleFactor <= 2.0f) ? 0.5f + (float) scaleFactor / 2.0f
                : (float) scaleFactor;
        graphics.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_SQUARE,
                BasicStroke.JOIN_MITER));

        // bottom and right in ultra dark
        graphics.setColor(borderScheme.getUltraDarkColor());
        graphics.drawLine(x, y + h - 1, x + w - 1, y + h - 1);
        graphics.drawLine(x + w - 1, y, x + w - 1, y + h - 1);
        // top and left
        graphics.setColor(borderScheme.getDarkColor());
        graphics.drawLine(x, y, x + w - 2, y);
        graphics.drawLine(x, y, x, y + h - 2);
        // inner bottom and right
        graphics.setColor(scheme.getMidColor());
        graphics.drawLine(x + 1, y + h - 2, x + w - 2, y + h - 2);
        graphics.drawLine(x + w - 2, y + 1, x + w - 2, y + h - 2);
        // inner top and left
        graphics.setColor(scheme.getMidColor());
        graphics.drawLine(x + 1, y + 1, x + w - 3, y + 1);
        graphics.drawLine(x + 1, y + 1, x + 1, y + h - 3);
        // inner 2 and 3
        graphics.setColor(scheme.getLightColor());
        graphics.drawRect(x + 2, y + 2, w - 5, h - 5);
        graphics.drawRect(x + 3, y + 3, w - 7, h - 7);

        graphics.dispose();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.border.Border#getBorderInsets(java.awt.Component)
     */
    @Override
    public Insets getBorderInsets(Component c) {
        return SubstancePaneBorder.INSETS;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.border.AbstractBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
     */
    @Override
    public Insets getBorderInsets(Component c, Insets newInsets) {
        newInsets.top = SubstancePaneBorder.INSETS.top;
        newInsets.left = SubstancePaneBorder.INSETS.left;
        newInsets.bottom = SubstancePaneBorder.INSETS.bottom;
        newInsets.right = SubstancePaneBorder.INSETS.right;
        return newInsets;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.border.Border#isBorderOpaque()
     */
    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
