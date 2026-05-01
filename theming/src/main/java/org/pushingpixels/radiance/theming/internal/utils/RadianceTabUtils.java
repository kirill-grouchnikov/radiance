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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.shaper.RadianceComponentShaper;

import javax.swing.*;
import java.awt.*;

public class RadianceTabUtils {
    private static final int DELTA_Y = 3;

    public static ContainerColorTokens getTabTextColorTokens(JTabbedPane tabbedPane, int tabIndex) {
        // See the logic in paintTabSurfaceAt1X - tab backgrounds are "partial". Only the top
        // part of the tab is drawn, and the rest of the tab is transparent, showing the visuals drawn by
        // its parent. As such, we do not account for the tab state here to compute the tab text color, but
        // only for its enabled bit.
        ComponentState currState = tabbedPane.isEnabledAt(tabIndex) ? ComponentState.ENABLED
            : ComponentState.DISABLED_UNSELECTED;

        return CoreColorTokenUtils.getContainerTokens(tabbedPane,
            tabIndex, RadianceThemingSlices.ContainerColorTokensAssociationKind.TAB, currState);
    }

    public static ContainerColorTokens getTabOutlineColorTokens(JComponent component) {
        return CoreColorTokenUtils.getContainerTokens(
            component,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.SEPARATOR,
            ComponentState.ENABLED,
            CoreColorTokenUtils.ContainerType.NEUTRAL);
    }

    public static Color getTabOutlineColor(ContainerColorTokens colorTokens) {
        return colorTokens.isDark()
            ? colorTokens.getComplementaryContainerOutline()
            : colorTokens.getContainerOutline();
    }

    public static void paintTabSurfaceAt1X(Graphics2D graphics1X,
        JComponent component, double scaleFactor,
        int originalScaledOffsetX, int originalScaledOffsetY, int width, int height,
        ContainerColorTokens surfaceColorTokens) {

        RadianceComponentShaper componentShaper = RadianceCoreUtilities.getComponentShaper(component);
        Shape outline = componentShaper.getTabShapeSupplier().getShape(component, width, height + DELTA_Y,
            0.0f, 0.0f, scaleFactor);

        Graphics2D clipped = (Graphics2D) graphics1X.create();
        clipped.clipRect(0, 0, width, (int) (0.2f * height));
        clipped.setColor(surfaceColorTokens.isDark()
            ? surfaceColorTokens.getContainerSurfaceHigh()
            : surfaceColorTokens.getContainerSurfaceLow());
        clipped.fill(outline);
        clipped.dispose();
    }

    public static void paintTabOutlineAt1X(Graphics2D graphics1X,
        JComponent component, double scaleFactor, int width, int height,
        ContainerColorTokens outlineColorTokens) {

        RadianceComponentShaper componentShaper = RadianceCoreUtilities.getComponentShaper(component);
        Shape outline = componentShaper.getTabShapeSupplier().getShape(component, width, height + DELTA_Y,
            0.0f, 0.0f, scaleFactor);

        graphics1X.setColor(getTabOutlineColor(outlineColorTokens));
        graphics1X.draw(outline);
    }
}
