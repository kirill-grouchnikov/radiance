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
package org.pushingpixels.radiance.theming.api.painter.outline;

import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.painter.surface.RadianceSurfacePainter;
import org.pushingpixels.radiance.theming.api.trait.RadianceTrait;

import javax.swing.*;
import java.awt.*;

/**
 * Outline painter interface for <b>Radiance</b> look and feel. This class is
 * part of officially supported API.<br>
 * <br>
 *
 * An outline painter is responsible for painting outlines (borders) of controls such as
 * buttons, checkboxes, tabs, scroll bars, etc.
 *
 * @author Kirill Grouchnikov
 */
public interface RadianceOutlinePainter extends RadianceTrait {
    interface ShapeSupplier {
        Shape getShape(Component c, float width, float height, float insets,
            float radiusAdjustment, double scaleFactor);
    }

    enum InsetKind {
        SURFACE, CONTENT
    }

    /**
     * Paints the outline.
     *
     * @param g
     *     Graphics.
     * @param c
     *     Component.
     * @param width
     *     Width of a UI component.
     * @param height
     *     Height of a UI component.
     * @param scaleFactor
     *     Scale factor.
     * @param shapeSupplier
     *     To compute the shape(s) painted by this painter.
     * @param colorTokens
     *     The color tokens.
     */
    void paintOutline(Graphics g, Component c, float width, float height, double scaleFactor,
        ShapeSupplier shapeSupplier, ContainerColorTokens colorTokens);

    float getOutlineInset(InsetKind insetKind);

    /**
     * Interface for specifying an overlay painted on top of the regular outline.
     *
     * @see RadianceThemingCortex.ComponentScope#setSurfacePainterOverlay(JComponent, RadianceSurfacePainter.Overlay)
     */
    interface Overlay {
        /**
         * Paints an outline overlay defined by the specified shape supplier.
         *
         * @param g
         *     Graphics.
         * @param c
         *     Component.
         * @param width
         *     Width of a UI component.
         * @param height
         *     Height of a UI component.
         * @param scaleFactor
         *     Scale factor.
         * @param shapeSupplier
         *     To compute the shape(s) painted by this painter.
         * @param colorTokens
         *     The color tokens.
         */
        void paintOutlineOverlay(Graphics g, Component c, float width, float height, double scaleFactor,
            ShapeSupplier shapeSupplier, ContainerColorTokens colorTokens);
    }

    /**
     * A composite overlay that chains one or more outline painter overlays.
     */
    class CompositeOverlay implements Overlay {
        private Overlay[] overlays;

        public CompositeOverlay(Overlay... overlays) {
            this.overlays = new Overlay[overlays.length];
            System.arraycopy(overlays, 0, this.overlays, 0, overlays.length);
        }

        @Override
        public void paintOutlineOverlay(Graphics g, Component c, float width, float height,
            double scaleFactor, ShapeSupplier shapeSupplier, ContainerColorTokens colorTokens) {
            for (Overlay overlay: this.overlays) {
                overlay.paintOutlineOverlay(g, c, width, height, scaleFactor, shapeSupplier,
                    colorTokens);
            }
        }
    }
}
