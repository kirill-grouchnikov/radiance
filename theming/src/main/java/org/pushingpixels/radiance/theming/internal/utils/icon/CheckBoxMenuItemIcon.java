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
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeIconUtils;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;

/**
 * Icon for the {@link JCheckBoxMenuItem}s.
 * 
 * @author Kirill Grouchnikov
 */
public class CheckBoxMenuItemIcon implements Icon, UIResource {
    /**
     * The size of <code>this</code> icon.
     */
    private int size;

    /**
     * The associated menu item.
     */
    private JMenuItem menuItem;

    private BladeColorScheme mutableFillColorScheme = new BladeColorScheme();
    private BladeColorScheme mutableBorderColorScheme = new BladeColorScheme();
    private BladeColorScheme mutableMarkColorScheme = new BladeColorScheme();

    /**
     * Creates a new icon.
     * 
     * @param menuItem
     *            The corresponding menu item.
     * @param size
     *            The size of <code>this</code> icon.
     */
    public CheckBoxMenuItemIcon(JMenuItem menuItem, int size) {
        this.menuItem = menuItem;
        this.size = size;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) this.menuItem.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo =
                stateTransitionTracker.getModelStateInfo();

        RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(this.menuItem);
        RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(this.menuItem);
        ComponentState currState = modelStateInfo.getCurrModelState();

        float visibility = stateTransitionTracker.getFacetStrength(RadianceThemingSlices.ComponentStateFacet.SELECTION);
        boolean isCheckMarkFadingOut = !currState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION);
        float alpha = RadianceColorSchemeUtilities.getAlpha(this.menuItem, currState);

        // Populate color schemes based on the current transition state of the menu item.
        BladeUtils.populateColorScheme(mutableFillColorScheme, this.menuItem,
                modelStateInfo, currState,
                RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                false);
        BladeUtils.populateColorScheme(mutableBorderColorScheme, this.menuItem,
                modelStateInfo, currState,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                false);
        BladeUtils.populateColorScheme(mutableMarkColorScheme, this.menuItem,
                modelStateInfo, currState,
                RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                false);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);
        BladeIconUtils.drawCheckBox(
                graphics, this.menuItem, fillPainter, borderPainter,
                this.size, currState,
                mutableFillColorScheme, mutableMarkColorScheme, mutableBorderColorScheme,
                visibility, 0.0f, isCheckMarkFadingOut, alpha);
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
