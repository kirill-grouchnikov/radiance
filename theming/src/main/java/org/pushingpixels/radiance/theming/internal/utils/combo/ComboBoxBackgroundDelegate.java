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
package org.pushingpixels.radiance.theming.internal.utils.combo;

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
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Map;

/**
 * Delegate class for painting backgrounds of buttons in <b>Radiance</b> look and feel. This class
 * is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class ComboBoxBackgroundDelegate {
    /**
     * Cache for background images.
     */
    private static LazyResettableHashMap<BufferedImage> regularBackgrounds = new LazyResettableHashMap<>(
            "ComboBoxBackgroundDelegate");

    public static BufferedImage getFullAlphaBackground(JComboBox combo,
            RadianceFillPainter fillPainter, RadianceBorderPainter borderPainter, int width,
            int height) {
        double scale = RadianceCommonCortex.getScaleFactor(combo);

        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) combo.getUI();
        StateTransitionTracker.ModelStateInfo modelStateInfo = transitionAwareUI
                .getTransitionTracker().getModelStateInfo();
        ComponentState currState = modelStateInfo.getCurrModelState();

        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();

        int comboFontSize = RadianceSizeUtils.getComponentFontSize(combo);
        float radius = RadianceSizeUtils.getClassicButtonCornerRadius(comboFontSize);

        RadianceColorScheme baseFillScheme = RadianceColorSchemeUtilities.getColorScheme(combo,
                currState);
        RadianceColorScheme baseBorderScheme = RadianceColorSchemeUtilities.getColorScheme(combo,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, currState);

        ImageHashMapKey keyBase = RadianceCoreUtilities.getScaleAwareHashKey(
                scale, width, height,
                baseFillScheme.getDisplayName(), baseBorderScheme.getDisplayName(),
                fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                combo.getClass().getName(), radius, comboFontSize);
        BufferedImage layerBase = regularBackgrounds.get(keyBase);
        if (layerBase == null) {
            layerBase = createBackgroundImage(combo, fillPainter, borderPainter, width,
                    height, baseFillScheme, baseBorderScheme, radius);
            regularBackgrounds.put(keyBase, layerBase);
        }
        if (currState.isDisabled() || (activeStates.size() == 1)) {
            return layerBase;
        }

        BufferedImage result = RadianceCoreUtilities.getBlankUnscaledImage(layerBase);
        Graphics2D g2d = result.createGraphics();
        // draw the base layer
        g2d.drawImage(layerBase, 0, 0, layerBase.getWidth(), layerBase.getHeight(), null);
        // System.out.println("\nPainting base state " + currState);

        // draw the other active layers
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

                RadianceColorScheme fillScheme = RadianceColorSchemeUtilities
                        .getColorScheme(combo, activeState);
                RadianceColorScheme borderScheme = RadianceColorSchemeUtilities
                        .getColorScheme(combo, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, activeState);
                ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                        scale, width, height,
                        fillScheme.getDisplayName(), borderScheme.getDisplayName(),
                        fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                        combo.getClass().getName(), radius, comboFontSize);
                BufferedImage layer = regularBackgrounds.get(key);
                if (layer == null) {
                    layer = createBackgroundImage(combo, fillPainter, borderPainter, width,
                            height, fillScheme, borderScheme, radius);
                    regularBackgrounds.put(key, layer);
                }
                g2d.drawImage(layer, 0, 0, layer.getWidth(), layer.getHeight(), null);
            }
        }
        g2d.dispose();
        return result;
    }

    private static BufferedImage createBackgroundImage(JComboBox combo,
            RadianceFillPainter fillPainter,
            RadianceBorderPainter borderPainter, int width, int height,
            RadianceColorScheme fillScheme, RadianceColorScheme borderScheme, float radius) {
        double scale = RadianceCommonCortex.getScaleFactor(combo);
        float borderDelta = RadianceSizeUtils.getBorderStrokeWidth(combo) / 2.0f;
        Shape contour = RadianceOutlineUtilities.getBaseOutline(width, height, radius, null,
                borderDelta);

        BufferedImage newBackground = RadianceCoreUtilities.getBlankImage(scale, width, height);
        Graphics2D finalGraphics = (Graphics2D) newBackground.getGraphics();
        fillPainter.paintContourBackground(finalGraphics, combo, width, height, contour, false,
                fillScheme, true);
        float borderThickness = RadianceSizeUtils.getBorderStrokeWidth(combo);
        Shape contourInner = borderPainter.isPaintingInnerContour()
                ? RadianceOutlineUtilities.getBaseOutline(width, height, radius - borderThickness,
                        null, borderDelta + borderThickness)
                : null;
        borderPainter.paintBorder(finalGraphics, combo, width, height, contour, contourInner,
                borderScheme);
        return newBackground;
    }

    /**
     * Simple constructor.
     */
    public ComboBoxBackgroundDelegate() {
        super();
    }

    public void updateBackground(Graphics g, JComboBox combo) {
        // failsafe for LAF change
        if (!RadianceCoreUtilities.isCurrentLookAndFeel())
            return;

        int width = combo.getWidth();
        int height = combo.getHeight();
        int y = 0;

        RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(combo);
        RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(combo);

        BufferedImage bgImage = getFullAlphaBackground(combo, fillPainter, borderPainter, width, height);

        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) combo.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                .getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();

        // Two special cases here:
        // 1. Combobox has flat appearance.
        // 2. Combobox is disabled.
        // For both cases, we need to set custom translucency.
        boolean isFlat = RadianceCoreUtilities.hasFlatAppearance(combo, false);
        boolean isSpecial = isFlat || !combo.isEnabled();
        float extraAlpha = 1.0f;
        if (isSpecial) {
            if (isFlat) {
                // Special handling of flat combos
                extraAlpha = 0.0f;
                for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                        .entrySet()) {
                    ComponentState activeState = activeEntry.getKey();
                    if (activeState.isDisabled())
                        continue;
                    if (activeState == ComponentState.ENABLED)
                        continue;
                    extraAlpha += activeEntry.getValue().getContribution();
                }
            } else {
                if (!combo.isEnabled()) {
                    extraAlpha = RadianceColorSchemeUtilities.getAlpha(combo,
                            modelStateInfo.getCurrModelState());
                }
            }
        }
        if (extraAlpha > 0.0f) {
            Graphics2D graphics = (Graphics2D) g.create();
            graphics.setComposite(WidgetUtilities.getAlphaComposite(combo, extraAlpha, g));
            graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            RadianceCommonCortex.drawImageWithScale(graphics, RadianceCommonCortex.getScaleFactor(combo),
                    bgImage, 0, y);
            graphics.dispose();
        }
    }
}
