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
package org.pushingpixels.radiance.theming.internal.blade;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.api.shaper.RadianceButtonShaper;
import org.pushingpixels.radiance.theming.api.shaper.RectangularButtonShaper;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/**
 * Delegate class for painting backgrounds of buttons in <b>Radiance</b> look and feel. This class
 * is <b>for internal use only</b>.
 *
 * @author Kirill Grouchnikov
 */
public class BladePairwiseButtonBackgroundDelegate {
    /**
     * Cache for background images for pairwise backgrounds. Each time
     * {@link #getPairwiseFullAlphaBackground(AbstractButton, RadianceFillPainter, RadianceButtonShaper, int, int, RadianceColorScheme, RadianceColorScheme, boolean, boolean)}
     * is called, it checks <code>this</code> map to see if it already contains such background.
     * If so, the background from the map is returned.
     */
    private static LazyResettableHashMap<BufferedImage> pairwiseBackgrounds =
            new LazyResettableHashMap<>("PairwiseButtonBackgroundDelegate");

    /**
     * Paints background image for the specified button in button pair (such as scrollbar arrows,
     * for example).
     *
     * @param g                 Graphics context.
     * @param button            Button.
     * @param width             Button width.
     * @param height            Button height.
     * @param toIgnoreOpenSides If <code>true</code>, the open side setting (controlled by the
     *                          {@link RadianceSynapse#BUTTON_OPEN_SIDE} is ignored.
     */
    static void updatePairwiseBackground(Graphics g, AbstractButton button, int width,
            int height, boolean toIgnoreOpenSides) {
        if (RadianceCoreUtilities.isButtonNeverPainted(button)) {
            return;
        }

        RadianceButtonShaper shaper = RadianceCoreUtilities.getButtonShaper(button);

        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) button.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                .getModelStateInfo();

        ComponentState currState = modelStateInfo.getCurrModelState();
        RadianceColorScheme baseFillScheme = RadianceColorSchemeUtilities.getColorScheme(button,
                currState);
        RadianceColorScheme baseBorderScheme = RadianceColorSchemeUtilities.getColorScheme(button,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, currState);

        RadianceFillPainter fillPainter = RadianceCoreUtilities.isSpinnerButton(button)
                ? MatteFillPainter.INSTANCE
                : RadianceImageCreator.SimplisticSoftBorderReverseFillPainter.INSTANCE;

        Set<RadianceThemingSlices.Side> openSides = toIgnoreOpenSides ? EnumSet.noneOf(RadianceThemingSlices.Side.class)
                : RadianceCoreUtilities.getSides(button, RadianceSynapse.BUTTON_OPEN_SIDE);
        boolean needsRotation = (openSides != null)
                && (openSides.contains(RadianceThemingSlices.Side.BOTTOM) || openSides.contains(RadianceThemingSlices.Side.TOP));

        BufferedImage baseLayer = getPairwiseFullAlphaBackground(button, fillPainter, shaper, width,
                height, baseFillScheme, baseBorderScheme, toIgnoreOpenSides, needsRotation);
        BufferedImage fullOpacity = null;

        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                modelStateInfo.getStateContributionMap();

        if (currState.isDisabled() || (activeStates.size() == 1)) {
            fullOpacity = baseLayer;
        } else {
            fullOpacity = RadianceCoreUtilities.getBlankUnscaledImage(baseLayer);
            Graphics2D g2fullOpacity = fullOpacity.createGraphics();

            // draw the base layer
            g2fullOpacity.drawImage(baseLayer, 0, 0, baseLayer.getWidth(), baseLayer.getHeight(),
                    null);

            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                    activeStates.entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == currState) {
                    continue;
                }

                float contribution = activeEntry.getValue().getContribution();
                if (contribution == 0.0f) {
                    continue;
                }

                RadianceColorScheme fillScheme = RadianceColorSchemeUtilities
                        .getColorScheme(button, activeState);
                RadianceColorScheme borderScheme = RadianceColorSchemeUtilities
                        .getColorScheme(button, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, activeState);
                BufferedImage layer = getPairwiseFullAlphaBackground(button, fillPainter, shaper,
                        width, height, fillScheme, borderScheme, toIgnoreOpenSides, needsRotation);

                g2fullOpacity.setComposite(AlphaComposite.SrcOver.derive(contribution));
                g2fullOpacity.drawImage(layer, 0, 0, layer.getWidth(), layer.getHeight(), null);
            }

            g2fullOpacity.dispose();
        }

        boolean isFlat = RadianceCoreUtilities.hasFlatAppearance(button);
        boolean isSpecial = isFlat || !button.isEnabled();
        float extraAlpha = 1.0f;

        if (isSpecial) {
            if (isFlat) {
                // Special handling of flat buttons
                extraAlpha = 0.0f;
                for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                        activeStates.entrySet()) {
                    ComponentState activeState = activeEntry.getKey();
                    if (activeState.isDisabled()) {
                        continue;
                    }
                    if (activeState == ComponentState.ENABLED) {
                        continue;
                    }
                    extraAlpha += activeEntry.getValue().getContribution();
                }
            } else {
                if (!button.isEnabled()) {
                    extraAlpha = RadianceColorSchemeUtilities.getAlpha(button, currState);
                }
            }
        }
        if (extraAlpha > 0.0f) {
            Graphics2D graphics = (Graphics2D) g.create();
            graphics.setComposite(WidgetUtilities.getAlphaComposite(button, extraAlpha, g));
            RadianceCommonCortex.drawImageWithScale(graphics, RadianceCommonCortex.getScaleFactor(button),
                    fullOpacity, 0, 0);
            graphics.dispose();
        }
    }

    /**
     * Retrieves background image for the specified button in button pair (such as scrollbar arrows,
     * for example).
     *
     * @param button            Button.
     * @param fillPainter       Gradient painter.
     * @param width             Button width.
     * @param height            Button height.
     * @param colorScheme       The fill color scheme.
     * @param borderScheme      The border color scheme.
     * @param toIgnoreOpenSides If <code>true</code>, the open side setting (controlled by the
     *                          {@link RadianceSynapse#BUTTON_OPEN_SIDE} is ignored.
     * @return Button background image.
     */
    private static BufferedImage getPairwiseFullAlphaBackground(AbstractButton button,
            RadianceFillPainter fillPainter, RadianceButtonShaper shaper, int width, int height,
            RadianceColorScheme colorScheme, RadianceColorScheme borderScheme,
            boolean toIgnoreOpenSides, boolean needsRotation) {
        if (RadianceCoreUtilities.isButtonNeverPainted(button)) {
            return null;
        }
        double scale = RadianceCommonCortex.getScaleFactor(button);

        Set<RadianceThemingSlices.Side> openSides = toIgnoreOpenSides ? EnumSet.noneOf(RadianceThemingSlices.Side.class)
                : RadianceCoreUtilities.getSides(button, RadianceSynapse.BUTTON_OPEN_SIDE);
        Set<RadianceThemingSlices.Side> straightSides = RadianceCoreUtilities.getSides(button,
                RadianceSynapse.BUTTON_STRAIGHT_SIDE);
        boolean isBorderPainted = button.isBorderPainted();
        boolean isContentAreaFilled = button.isContentAreaFilled();

        float radius = 0.0f;
        if (RadianceCoreUtilities.isSpinnerButton(button)
                && shaper instanceof RectangularButtonShaper) {
            radius = ((RectangularButtonShaper) shaper).getCornerRadius(button, 0.0f);
        }
        ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                scale, width, height, straightSides, openSides,
                colorScheme.getDisplayName(), borderScheme.getDisplayName(),
                button.getClass().getName(), fillPainter.getDisplayName(), shaper.getDisplayName(),
                isBorderPainted, isContentAreaFilled, radius);
        // System.out.println("\tKey " + key);
        BufferedImage finalBackground = pairwiseBackgrounds.get(key);
        if (finalBackground == null) {
            // System.out.println("\tNot found");

            int deltaLeft = (openSides != null) && openSides.contains(RadianceThemingSlices.Side.LEFT) ? 3 : 0;
            int deltaRight = (openSides != null) && openSides.contains(RadianceThemingSlices.Side.RIGHT) ? 3 : 0;
            int deltaTop = (openSides != null) && openSides.contains(RadianceThemingSlices.Side.TOP) ? 3 : 0;
            int deltaBottom = (openSides != null) && openSides.contains(RadianceThemingSlices.Side.BOTTOM) ? 3 : 0;

            Shape contour = null;

            RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(button);

            float borderDelta = RadianceSizeUtils.getBorderStrokeWidth(button) / 2.0f;
            finalBackground = RadianceCoreUtilities.getBlankImage(scale, width, height);
            Graphics2D finalGraphics = (Graphics2D) finalBackground.getGraphics();
            finalGraphics.translate(-deltaLeft, -deltaTop);
            if (needsRotation) {
                // rotate by 90% for better visuals
                contour = RadianceOutlineUtilities.getBaseOutline(height + deltaTop + deltaBottom,
                        width + deltaLeft + deltaRight, radius, null, borderDelta);

                int translateY = finalBackground.getHeight();
                if (RadianceCoreUtilities.isScrollButton(button)) {
                    if ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.BOTTOM)) {
                        translateY += 4;
                    }
                }
                AffineTransform at = AffineTransform.getTranslateInstance(0, translateY);
                at.rotate(-Math.PI / 2);

                finalGraphics.scale(1, 1);
                finalGraphics.setTransform(at);
                finalGraphics.scale(scale, scale);

                if (isContentAreaFilled) {
                    fillPainter.paintContourBackground(finalGraphics, button,
                            height + deltaTop + deltaBottom, width + deltaLeft + deltaRight,
                            contour, false, colorScheme, true);
                }
                if (isBorderPainted) {
                    borderPainter.paintBorder(finalGraphics, button,
                            height + deltaTop + deltaBottom, width + deltaLeft + deltaRight,
                            contour, null, borderScheme);
                }
            } else {
                contour = RadianceOutlineUtilities.getBaseOutline(width + deltaLeft + deltaRight,
                        height + deltaTop + deltaBottom, radius, straightSides, borderDelta);
                if (RadianceCoreUtilities.isScrollButton(button)) {
                    if ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.LEFT))
                        finalGraphics.translate(1, 0);
                }

                if (isContentAreaFilled) {
                    fillPainter.paintContourBackground(finalGraphics, button,
                            width + deltaLeft + deltaRight, height + deltaTop + deltaBottom,
                            contour, false, colorScheme, true);
                }
                if (isBorderPainted) {
                    borderPainter.paintBorder(finalGraphics, button, width + deltaLeft + deltaRight,
                            height + deltaTop + deltaBottom, contour, null, borderScheme);
                }
            }

            pairwiseBackgrounds.put(key, finalBackground);
        }
        return finalBackground;
    }
}
