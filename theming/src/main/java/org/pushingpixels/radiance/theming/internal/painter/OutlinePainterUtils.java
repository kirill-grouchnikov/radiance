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
package org.pushingpixels.radiance.theming.internal.painter;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.painter.outline.RadianceOutlinePainter;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;

import java.awt.*;

public class OutlinePainterUtils {
    public static void paintOutline(Graphics2D graphics1X, Component component,
        ComponentState componentState, float scaledWidth, float scaledHeight, double scaleFactor,
        float alpha, RadianceOutlinePainter.ShapeSupplier shapeSupplier, ContainerColorTokens colorTokens) {

        paintOutline(graphics1X, component, componentState,
            RadianceCoreUtilities.getOutlinePainter(component),
            scaledWidth, scaledHeight, scaleFactor,
            alpha, shapeSupplier, colorTokens);
    }

    public static void paintOutline(Graphics2D graphics1X, Component component,
        ComponentState componentState, RadianceOutlinePainter outlinePainter,
        float scaledWidth, float scaledHeight, double scaleFactor,
        float alpha, RadianceOutlinePainter.ShapeSupplier shapeSupplier, ContainerColorTokens colorTokens) {

        float containerOutlineAlpha = alpha *
            (componentState.isDisabled() ? colorTokens.getContainerOutlineDisabledAlpha() : 1.0f);
        Graphics2D graphics = (Graphics2D) graphics1X.create();
        graphics.setComposite(WidgetUtilities.getAlphaComposite(component, containerOutlineAlpha, graphics1X));

        // Ask the outline painter to paint the outline
        outlinePainter.paintOutline(graphics, component, scaledWidth, scaledHeight, scaleFactor,
            shapeSupplier, colorTokens);

        // If we have an outline painter overlay, ask it to paint the outline
        RadianceOutlinePainter.Overlay overlay = RadianceCoreUtilities.getOutlinePainterOverlay(component);
        if (overlay != null) {
            overlay.paintOutlineOverlay(graphics, component, scaledWidth, scaledHeight,
                scaleFactor, shapeSupplier, colorTokens);
        }

        graphics.dispose();
    }
}
