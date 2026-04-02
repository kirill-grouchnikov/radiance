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
package org.pushingpixels.radiance.theming.api.painter.surface;

import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.trait.RadianceTrait;

import javax.swing.*;
import java.awt.*;

/**
 * Surface painter interface for <b>Radiance</b> look and feel. This class is part
 * of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public interface RadianceSurfacePainter extends RadianceTrait {
	/**
	 * Fills the surface defined by the specified outline.
	 *
     * @param g
     *      Graphics context.
     * @param comp
     *      Component to paint.
     * @param width
     *      Width of the component.
     * @param height
     *      Height of the component.
     * @param scaleFactor
     *      Scale factor that matches the 1x painting of the component.
     * @param outline
     *      Outline of the component.
     * @param colorTokens
     *      Color tokens to use for the fill.
	 */
	void paintSurface(Graphics g, Component comp, float width, float height, double scaleFactor,
        Shape outline, ContainerColorTokens colorTokens);

    /**
     * Interface for specifying an overlay painted on top of the regular surface fill.
     *
     * @see RadianceThemingCortex.ComponentScope#setSurfacePainterOverlay(JComponent, Overlay)
     */
    interface Overlay {
        /**
         * Paints a fill overlay on the surface defined by the specified outline.
         *
         * @param g
         *      Graphics context.
         * @param comp
         *      Component to paint.
         * @param width
         *      Width of the component.
         * @param height
         *      Height of the component.
         * @param scaleFactor
         *      Scale factor that matches the 1x painting of the component.
         * @param outline
         *      Outline of the component.
         * @param colorTokens
         *      Color tokens to use for the fill.
         */
        void paintSurfaceOverlay(Graphics g, Component comp, float width, float height,
            double scaleFactor, Shape outline, ContainerColorTokens colorTokens);
    }

    /**
     * A composite overlay that chains one or more surface painter overlays.
     */
    class CompositeOverlay implements Overlay {
        private Overlay[] overlays;

        public CompositeOverlay(Overlay... overlays) {
            this.overlays = new Overlay[overlays.length];
            System.arraycopy(overlays, 0, this.overlays, 0, overlays.length);
        }

        @Override
        public void paintSurfaceOverlay(Graphics g, Component comp, float width, float height,
            double scaleFactor, Shape outline, ContainerColorTokens colorTokens) {
            for (Overlay overlay: this.overlays) {
                overlay.paintSurfaceOverlay(g, comp, width, height, scaleFactor, outline,
                    colorTokens);
            }
        }
    }
}
