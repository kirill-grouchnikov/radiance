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
package org.pushingpixels.substance.internal.utils.icon;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Map;

/**
 * Transition aware implementation of highlightable icons.
 *
 * @author Kirill Grouchnikov
 */
@TransitionAware
public class HighlightableTransitionAwareIcon implements Icon {
    /**
     * Icon cache to speed up the subsequent icon painting. The basic assumption is that the
     * {@link #delegate} returns an icon that paints the same for the same parameters.
     */
    private static LazyResettableHashMap<RadianceIcon> iconMap =
            new LazyResettableHashMap<>("HighlightableTransitionAwareIcon");

    /**
     * Icon width.
     */
    private int iconWidth;

    /**
     * Icon height.
     */
    private int iconHeight;

    /**
     * Delegate to compute the actual icons.
     */
    private TransitionAwareIcon.Delegate delegate;

    private JComponent component;

    private ComponentStateFacet facetForHighlights;

    private TransitionAwareIcon.TransitionAwareUIDelegate transitionAwareUIDelegate;

    private String uniqueIconTypeId;

    public HighlightableTransitionAwareIcon(final JComponent component,
            TransitionAwareIcon.TransitionAwareUIDelegate transitionAwareUIDelegate,
            TransitionAwareIcon.Delegate delegate, ComponentStateFacet facetForHighlights,
            String uniqueIconTypeId) {
        this.component = component;
        this.facetForHighlights = facetForHighlights;
        this.transitionAwareUIDelegate = transitionAwareUIDelegate;
        this.delegate = delegate;
        this.uniqueIconTypeId = uniqueIconTypeId;

        Icon enabledIcon = this.delegate.getColorSchemeIcon(
                SubstanceColorSchemeUtilities.getColorScheme(component, ComponentState.ENABLED));
        this.iconWidth = enabledIcon.getIconWidth();
        this.iconHeight = enabledIcon.getIconHeight();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        this.getIconToPaint().paintIcon(c, g, x, y);
    }

    private RadianceIcon getIconToPaint() {
        double scale = RadianceCommonCortex.getScaleFactor(this.component);

        StateTransitionTracker stateTransitionTracker = this.transitionAwareUIDelegate
                .getTransitionAwareUI().getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo =
                stateTransitionTracker.getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                modelStateInfo.getStateNoSelectionContributionMap();
        ComponentState currState = modelStateInfo.getCurrModelStateNoSelection();

        // Use HIGHLIGHT when necessary and MARK for the rest
        ColorSchemeAssociationKind baseAssociationKind = currState.isFacetActive(this.facetForHighlights)
                ? ColorSchemeAssociationKind.HIGHLIGHT
                : ColorSchemeAssociationKind.MARK;
        SubstanceColorScheme baseScheme = SubstanceColorSchemeUtilities.getColorScheme(
                this.component, baseAssociationKind, currState);
        float baseAlpha = SubstanceColorSchemeUtilities.getAlpha(this.component, currState);

        ImageHashMapKey keyBase = SubstanceCoreUtilities.getScaleAwareHashKey(
                scale, this.component.getClass().getName(),
                this.uniqueIconTypeId, SubstanceSizeUtils.getComponentFontSize(this.component),
                baseScheme.getDisplayName(), baseAlpha);
        RadianceIcon layerBase = iconMap.get(keyBase);
        if (layerBase == null) {
            RadianceIcon baseFullOpacity = this.delegate.getColorSchemeIcon(baseScheme);
            if (baseAlpha == 1.0f) {
                layerBase = baseFullOpacity;
                iconMap.put(keyBase, layerBase);
            } else {
                BufferedImage baseImage = SubstanceCoreUtilities.getBlankImage(scale,
                        baseFullOpacity.getIconWidth(), baseFullOpacity.getIconHeight());
                Graphics2D g2base = baseImage.createGraphics();
                g2base.setComposite(AlphaComposite.SrcOver.derive(baseAlpha));
                baseFullOpacity.paintIcon(this.component, g2base, 0, 0);
                g2base.dispose();
                layerBase = new ScaleAwareImageWrapperIcon(baseImage, scale);
                iconMap.put(keyBase, layerBase);
            }
        }

        if (currState.isDisabled() || (activeStates.size() == 1)) {
            return layerBase;
        }

        BufferedImage result = SubstanceCoreUtilities.getBlankImage(scale,
                layerBase.getIconWidth(), layerBase.getIconHeight());
        Graphics2D g2d = result.createGraphics();
        // draw the base layer
        layerBase.paintIcon(this.component, g2d, 0, 0);

        // draw the other active layers
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                activeStates.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            if (activeState == currState) {
                continue;
            }

            float stateContribution = activeEntry.getValue().getContribution();
            if (stateContribution > 0.0f) {
                g2d.setComposite(AlphaComposite.SrcOver.derive(stateContribution));

                // Use HIGHLIGHT when necessary and MARK for the rest
                ColorSchemeAssociationKind associationKind = activeState.isFacetActive(this.facetForHighlights)
                        ? ColorSchemeAssociationKind.HIGHLIGHT
                        : ColorSchemeAssociationKind.MARK;
                SubstanceColorScheme scheme = SubstanceColorSchemeUtilities.getColorScheme(
                        this.component, associationKind, activeState);
                float alpha = SubstanceColorSchemeUtilities.getAlpha(this.component, activeState);

                ImageHashMapKey key = SubstanceCoreUtilities.getScaleAwareHashKey(
                        scale, this.component.getClass().getName(), this.uniqueIconTypeId,
                        SubstanceSizeUtils.getComponentFontSize(this.component),
                        scheme.getDisplayName(), alpha);
                RadianceIcon layer = iconMap.get(key);
                if (layer == null) {
                    RadianceIcon fullOpacity = this.delegate.getColorSchemeIcon(scheme);
                    if (alpha == 1.0f) {
                        layer = fullOpacity;
                        iconMap.put(key, layer);
                    } else {
                        BufferedImage image = SubstanceCoreUtilities.getBlankImage(scale,
                                fullOpacity.getIconWidth(), fullOpacity.getIconHeight());
                        Graphics2D g2layer = image.createGraphics();
                        g2layer.setComposite(AlphaComposite.SrcOver.derive(alpha));
                        fullOpacity.paintIcon(this.component, g2layer, 0, 0);
                        g2layer.dispose();
                        layer = new ScaleAwareImageWrapperIcon(image, scale);
                        iconMap.put(key, layer);
                    }
                }
                layer.paintIcon(this.component, g2d, 0, 0);
            }
        }
        g2d.dispose();
        return new ScaleAwareImageWrapperIcon(result, scale);
    }

    @Override
    public int getIconHeight() {
        return this.iconHeight;
    }

    @Override
    public int getIconWidth() {
        return this.iconWidth;
    }
}
