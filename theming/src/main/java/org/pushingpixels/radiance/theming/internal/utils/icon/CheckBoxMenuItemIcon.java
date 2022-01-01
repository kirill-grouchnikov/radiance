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

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Map;

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
    private static LazyResettableHashMap<ScaleAwareImageWrapperIcon> iconMap =
            new LazyResettableHashMap<>("CheckBoxMenuItemIcon");

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
    private ScaleAwareImageWrapperIcon getIconToPaint() {
        if (this.menuItem == null) {
            return null;
        }

        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) this.menuItem.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();

        StateTransitionTracker.ModelStateInfo modelStateInfo =
                stateTransitionTracker.getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                modelStateInfo.getStateContributionMap();

        RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(this.menuItem);
        RadianceBorderPainter borderPainter =
                RadianceCoreUtilities.getBorderPainter(this.menuItem);
        ComponentState currState = modelStateInfo.getCurrModelState();

        RadianceColorScheme baseFillColorScheme = RadianceColorSchemeUtilities
                .getColorScheme(this.menuItem, RadianceThemingSlices.ColorSchemeAssociationKind.MARK_BOX, currState);
        RadianceColorScheme baseMarkColorScheme = RadianceColorSchemeUtilities
                .getColorScheme(this.menuItem, RadianceThemingSlices.ColorSchemeAssociationKind.MARK, currState);
        RadianceColorScheme baseBorderColorScheme = RadianceColorSchemeUtilities
                .getColorScheme(this.menuItem, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, currState);
        float visibility = stateTransitionTracker.getFacetStrength(RadianceThemingSlices.ComponentStateFacet.SELECTION);
        boolean isCheckMarkFadingOut = !currState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION);
        float alpha = RadianceColorSchemeUtilities.getAlpha(this.menuItem, currState);

        double scale = RadianceCommonCortex.getScaleFactor(this.menuItem);
        int fontSize = RadianceSizeUtils.getComponentFontSize(this.menuItem);
        int checkMarkSize = this.size + 3;

        ImageHashMapKey keyBase = RadianceCoreUtilities.getScaleAwareHashKey(
                scale, fontSize, checkMarkSize,
                fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                baseFillColorScheme.getDisplayName(), baseMarkColorScheme.getDisplayName(),
                baseBorderColorScheme.getDisplayName(), visibility, isCheckMarkFadingOut,
                alpha);
        ScaleAwareImageWrapperIcon iconBase = iconMap.get(keyBase);
        if (iconBase == null) {
            iconBase = new ScaleAwareImageWrapperIcon(
                    RadianceImageCreator.getCheckBox(this.menuItem, fillPainter, borderPainter,
                            checkMarkSize, currState, baseFillColorScheme, baseMarkColorScheme,
                            baseBorderColorScheme, visibility, isCheckMarkFadingOut, alpha),
                    scale);
            iconMap.put(keyBase, iconBase);
        }
        if (currState.isDisabled() || (activeStates.size() == 1)) {
            return iconBase;
        }

        BufferedImage result = RadianceCoreUtilities.getBlankImage(scale,
                iconBase.getIconWidth(), iconBase.getIconHeight());
        Graphics2D g2d = result.createGraphics();
        // draw the base layer
        iconBase.paintIcon(this.menuItem, g2d, 0, 0);

        // draw other active layers
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                activeStates.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            // System.out.println("Painting state " + activeState + "[curr is "
            // + currState + "] with " + activeEntry.getValue());
            if (activeState == currState) {
                continue;
            }

            float stateContribution = activeEntry.getValue().getContribution();
            if (stateContribution > 0.0f) {
                g2d.setComposite(AlphaComposite.SrcOver.derive(stateContribution));
                RadianceColorScheme fillColorScheme = RadianceColorSchemeUtilities.getColorScheme(
                        this.menuItem, RadianceThemingSlices.ColorSchemeAssociationKind.MARK_BOX, activeState);
                RadianceColorScheme markColorScheme = RadianceColorSchemeUtilities.getColorScheme(
                        this.menuItem, RadianceThemingSlices.ColorSchemeAssociationKind.MARK, activeState);
                RadianceColorScheme borderColorScheme = RadianceColorSchemeUtilities
                        .getColorScheme(this.menuItem, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                                activeState);

                ImageHashMapKey keyLayer = RadianceCoreUtilities.getScaleAwareHashKey(
                        scale, fontSize, checkMarkSize,
                        fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                        fillColorScheme.getDisplayName(), markColorScheme.getDisplayName(),
                        borderColorScheme.getDisplayName(), visibility, alpha);
                ScaleAwareImageWrapperIcon iconLayer = iconMap.get(keyLayer);
                if (iconLayer == null) {
                    iconLayer = new ScaleAwareImageWrapperIcon(RadianceImageCreator.getCheckBox(
                            this.menuItem, fillPainter, borderPainter, checkMarkSize, currState,
                            fillColorScheme, markColorScheme, borderColorScheme, visibility,
                            isCheckMarkFadingOut, alpha), scale);
                    iconMap.put(keyLayer, iconLayer);
                }

                iconLayer.paintIcon(this.menuItem, g2d, 0, 0);
            }
        }

        g2d.dispose();
        return new ScaleAwareImageWrapperIcon(result, scale);
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
