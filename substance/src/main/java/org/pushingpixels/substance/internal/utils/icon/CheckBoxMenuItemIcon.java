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
package org.pushingpixels.substance.internal.utils.icon;

import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

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

    /**
     * Icon cache to speed up the painting.
     */
    private static LazyResettableHashMap<SubstanceIconUIResource> iconMap = new LazyResettableHashMap<SubstanceIconUIResource>(
            "CheckBoxMenuItemIcon");

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

    /**
     * Returns the current icon to paint.
     * 
     * @return Icon to paint.
     */
    private SubstanceIconUIResource getIconToPaint() {
        if (this.menuItem == null)
            return null;

        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) this.menuItem.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();

        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                .getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();

        SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(this.menuItem);
        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities
                .getBorderPainter(this.menuItem);
        ComponentState currState = modelStateInfo.getCurrModelState();

        SubstanceColorScheme baseFillColorScheme = SubstanceColorSchemeUtilities
                .getColorScheme(this.menuItem, ColorSchemeAssociationKind.FILL, currState);
        SubstanceColorScheme baseMarkColorScheme = SubstanceColorSchemeUtilities
                .getColorScheme(this.menuItem, ColorSchemeAssociationKind.MARK, currState);
        SubstanceColorScheme baseBorderColorScheme = SubstanceColorSchemeUtilities
                .getColorScheme(this.menuItem, ColorSchemeAssociationKind.BORDER, currState);
        float visibility = stateTransitionTracker.getFacetStrength(ComponentStateFacet.SELECTION);
        boolean isCheckMarkFadingOut = !currState.isFacetActive(ComponentStateFacet.SELECTION);
        float alpha = SubstanceColorSchemeUtilities.getAlpha(this.menuItem, currState);

        int fontSize = SubstanceSizeUtils.getComponentFontSize(this.menuItem);
        int checkMarkSize = this.size + 3;

        HashMapKey keyBase = SubstanceCoreUtilities.getHashKey(fontSize, checkMarkSize,
                fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                baseFillColorScheme.getDisplayName(), baseMarkColorScheme.getDisplayName(),
                baseBorderColorScheme.getDisplayName(), visibility, isCheckMarkFadingOut, alpha);
        SubstanceIconUIResource iconBase = iconMap.get(keyBase);
        if (iconBase == null) {
            iconBase = new SubstanceIconUIResource(
                    SubstanceImageCreator.getCheckBox(this.menuItem, fillPainter, borderPainter,
                            checkMarkSize, currState, baseFillColorScheme, baseMarkColorScheme,
                            baseBorderColorScheme, visibility, isCheckMarkFadingOut, alpha));
            iconMap.put(keyBase, iconBase);
        }
        if (currState.isDisabled() || (activeStates.size() == 1)) {
            return iconBase;
        }

        BufferedImage result = SubstanceCoreUtilities.getBlankImage(iconBase.getIconWidth(),
                iconBase.getIconHeight());
        Graphics2D g2d = result.createGraphics();
        // draw the base layer
        iconBase.paintIcon(this.menuItem, g2d, 0, 0);

        // draw other active layers
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                .entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            // System.out.println("Painting state " + activeState + "[curr is "
            // + currState + "] with " + activeEntry.getValue());
            if (activeState == currState)
                continue;

            float stateContribution = activeEntry.getValue().getContribution();
            if (stateContribution > 0.0f) {
                g2d.setComposite(AlphaComposite.SrcOver.derive(stateContribution));
                SubstanceColorScheme fillColorScheme = SubstanceColorSchemeUtilities.getColorScheme(
                        this.menuItem, ColorSchemeAssociationKind.FILL, activeState);
                SubstanceColorScheme markColorScheme = SubstanceColorSchemeUtilities.getColorScheme(
                        this.menuItem, ColorSchemeAssociationKind.MARK, activeState);
                SubstanceColorScheme borderColorScheme = SubstanceColorSchemeUtilities
                        .getColorScheme(this.menuItem, ColorSchemeAssociationKind.BORDER,
                                activeState);

                HashMapKey keyLayer = SubstanceCoreUtilities.getHashKey(fontSize, checkMarkSize,
                        fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                        fillColorScheme.getDisplayName(), markColorScheme.getDisplayName(),
                        borderColorScheme.getDisplayName(), visibility, alpha);
                SubstanceIconUIResource iconLayer = iconMap.get(keyLayer);
                if (iconLayer == null) {
                    iconLayer = new SubstanceIconUIResource(SubstanceImageCreator.getCheckBox(
                            this.menuItem, fillPainter, borderPainter, checkMarkSize, currState,
                            fillColorScheme, markColorScheme, borderColorScheme, visibility,
                            isCheckMarkFadingOut, alpha));
                    iconMap.put(keyLayer, iconLayer);
                }

                iconLayer.paintIcon(this.menuItem, g2d, 0, 0);
            }
        }

        g2d.dispose();
        return new SubstanceIconUIResource(result);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Icon iconToDraw = this.getIconToPaint();
        if (iconToDraw != null)
            iconToDraw.paintIcon(c, g, x, y);
    }

    @Override
    public int getIconWidth() {
        Icon iconToDraw = this.getIconToPaint();
        return (iconToDraw == null) ? 0 : iconToDraw.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        Icon iconToDraw = this.getIconToPaint();
        return (iconToDraw == null) ? 0 : iconToDraw.getIconHeight();
    }
}
