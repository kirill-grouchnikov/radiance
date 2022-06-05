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
package org.pushingpixels.radiance.theming.internal.utils.icon;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeIconUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;

/**
 * Expand / collapse icon for {@link JTree} rows.
 * 
 * @author Kirill Grouchnikov
 */
public class TreeIcon implements Icon, UIResource {
    /** The size of <code>this</code> icon. */
    private int size;

    /** The associated tree. */
    private JTree tree;

    private boolean isCollapsed;

    public TreeIcon(JTree tree, int size, boolean isCollapsed) {
        this.tree = tree;
        this.size = size;
        this.isCollapsed = isCollapsed;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        ComponentState state = ((tree == null) || tree.isEnabled()) ? ComponentState.ENABLED
                : ComponentState.DISABLED_UNSELECTED;
        RadianceColorScheme fillScheme = RadianceColorSchemeUtilities.getColorScheme(tree,
                state);
        RadianceColorScheme borderScheme = RadianceColorSchemeUtilities.getColorScheme(tree,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, state);
        RadianceColorScheme markScheme = RadianceColorSchemeUtilities.getColorScheme(tree,
                RadianceThemingSlices.ColorSchemeAssociationKind.MARK, state);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);
        BladeIconUtils.drawTreeIcon(graphics, this.tree, this.size,
                fillScheme, borderScheme, markScheme,
                this.isCollapsed);
        graphics.dispose();
    }

    @Override
    public int getIconWidth() {
        return this.size;
    }

    @Override
    public int getIconHeight() {
        return this.size;
    }
}
