/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.decorator.tab;

import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.painter.decoration.RadianceDecorationPainter;
import org.pushingpixels.radiance.theming.api.shaper.RadianceComponentShaper;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.CoreColorTokenUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class DefaultTabDecorator implements RadianceTabDecorator {
    private static final int DELTA_Y = 3;

    @Override
    public Insets getTabInsets() {
        return new Insets(0, 4, 1, 4);
    }

    @Override
    public Color getTabContentColor(JTabbedPane tabbedPane, int tabIndex) {
        // See the logic in paintTabSurfaceAt1X - tab backgrounds are "partial". Only the top
        // part of the tab is drawn, and the rest of the tab is transparent, showing the visuals drawn by
        // its parent. As such, we do not account for the tab state here to compute the tab text color, but
        // only for its enabled bit.
        ComponentState currState = tabbedPane.isEnabledAt(tabIndex) ? ComponentState.ENABLED
            : ComponentState.DISABLED_UNSELECTED;

        ContainerColorTokens colorTokens = CoreColorTokenUtils.getContainerTokens(tabbedPane,
            tabIndex, RadianceThemingSlices.ContainerColorTokensAssociationKind.TAB, currState);

        Color contentColor = colorTokens.getOnContainer();
        float alpha = tabbedPane.isEnabledAt(tabIndex) ? colorTokens.getOnContainerEnabledAlpha()
            : colorTokens.getOnContainerDisabledAlpha();
        if (alpha < 1.0f) {
            contentColor = RadianceColorUtilities.getAlphaColor(contentColor,
                (int) (contentColor.getAlpha() * alpha));
        }
        return contentColor;
    }

    @Override
    public Color getDecoratedTabContentColor(JComponent tabComponent, ComponentState currState,
        Map<ComponentState, Float> activeStates) {

        // The final color is a composition of two contributions:
        // 1. On container color that corresponds to the enabled state / neutral container type that
        //    matches the overall surface fill of the non-active button
        // 2. On container color that corresponds to the enabled state / neutral container type that
        //    matches the overall surface fill of the parent

        ContainerColorTokens parentSurfaceTokens = CoreColorTokenUtils.getContainerTokens(
            tabComponent.getParent(),
            ComponentState.ENABLED,
            CoreColorTokenUtils.ContainerType.NEUTRAL);

        float activeStateTotalContribution = currState.isActive() ? 1.0f : 0.0f;
        if (activeStates.size() > 1) {
            for (Map.Entry<ComponentState, Float> activeEntry : activeStates.entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState != currState) {
                    float alpha = activeEntry.getValue();
                    if (activeState != ComponentState.ENABLED) {
                        activeStateTotalContribution += alpha;
                    }
                }
            }
        }
        activeStateTotalContribution = Math.min(1.0f, activeStateTotalContribution);

        if (activeStateTotalContribution == 0.0f) {
            return parentSurfaceTokens.getOnContainer();
        }

        ContainerColorTokens surfaceTokens = CoreColorTokenUtils.getContainerTokens(
            tabComponent,
            ComponentState.ENABLED,
            CoreColorTokenUtils.ContainerType.NEUTRAL);

        Color contentColor = RadianceColorUtilities.getInterpolatedColor(
            parentSurfaceTokens.getOnContainer(),
            surfaceTokens.getOnContainer(),
            1.0f - activeStateTotalContribution);

        float alpha = currState.isDisabled()
            ? (1.0f - activeStateTotalContribution) * parentSurfaceTokens.getOnContainerDisabledAlpha()
              + activeStateTotalContribution * surfaceTokens.getOnContainerDisabledAlpha()
            : (1.0f - activeStateTotalContribution) * parentSurfaceTokens.getOnContainerEnabledAlpha()
              + activeStateTotalContribution * surfaceTokens.getOnContainerEnabledAlpha();
        contentColor = RadianceColorUtilities.getAlphaColor(contentColor,
            (int) (contentColor.getAlpha() * alpha));
        return contentColor;
    }

    @Override
    public Color getTabOutlineColor(Component tabComponent) {
        return CoreColorTokenUtils.getContainerTokens(
            tabComponent,
            ComponentState.ENABLED,
            CoreColorTokenUtils.ContainerType.NEUTRAL).getMarkerOnContainer();
    }

    @Override
    public boolean shouldDrawUnbrokenContentEdge() {
        return false;
    }

    @Override
    public void paintTabSurfaceAt1X(Graphics2D graphics1X, JComponent tabComponent, double scaleFactor,
        int originalScaledOffsetX, int originalScaledOffsetY, int width, int height,
        ContainerColorTokens surfaceColorTokens) {

        RadianceSkin skin = RadianceCoreUtilities.getSkin(tabComponent);
        RadianceThemingSlices.DecorationAreaType decorationAreaType =
            RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(tabComponent);
        if (skin.isRegisteredAsDecorationArea(decorationAreaType)) {
            RadianceDecorationPainter decorationPainter = skin.getDecorationPainter();
            Graphics2D clipped = (Graphics2D) graphics1X.create();
            DecorationPainterUtils.paintDecorationBackground(clipped, tabComponent,
                width, height, scaleFactor, decorationPainter,
                decorationAreaType, surfaceColorTokens, false);

            DecorationPainterUtils.paintInlay(graphics1X, tabComponent,
                originalScaledOffsetX, originalScaledOffsetY, width, height, scaleFactor,
                skin, decorationAreaType);
            clipped.dispose();
        } else {
            graphics1X.setColor(surfaceColorTokens.getContainerSurface());
            graphics1X.fillRect(0, 0, width, height);

            DecorationPainterUtils.paintInlay(graphics1X, tabComponent,
                originalScaledOffsetX, originalScaledOffsetY, width, height, scaleFactor,
                skin, decorationAreaType);
        }
    }

    @Override
    public void paintTabSurfaceHighlightAt1X(Graphics2D graphics1X, JComponent tabComponent,
        double scaleFactor, int width, int height, ContainerColorTokens surfaceHighlightColorTokens) {

        RadianceComponentShaper componentShaper = RadianceCoreUtilities.getComponentShaper(tabComponent);
        Shape outline = componentShaper.getTabShapeSupplier().getShape(tabComponent,
            width, height + DELTA_Y, 0.0f, 0.0f, scaleFactor);

        Graphics2D clipped = (Graphics2D) graphics1X.create();
        clipped.clipRect(0, 0, width, (int) (0.2f * height));
        clipped.setColor(surfaceHighlightColorTokens.isDark()
            ? surfaceHighlightColorTokens.getContainerSurfaceHigh()
            : surfaceHighlightColorTokens.getContainerSurfaceLow());
        clipped.fill(outline);
        clipped.dispose();
    }

    @Override
    public void paintTabOutlineAt1X(Graphics2D graphics1X, JComponent tabComponent, double scaleFactor,
        int width, int height, Color outlineColor) {

        RadianceComponentShaper componentShaper = RadianceCoreUtilities.getComponentShaper(tabComponent);
        Shape outline = componentShaper.getTabShapeSupplier().getShape(tabComponent,
            width, height + DELTA_Y, 0.0f, 0.0f, scaleFactor);

        graphics1X.setColor(outlineColor);
        graphics1X.draw(outline);
    }
}
