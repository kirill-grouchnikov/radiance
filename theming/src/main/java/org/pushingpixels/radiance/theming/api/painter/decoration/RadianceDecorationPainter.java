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
package org.pushingpixels.radiance.theming.api.painter.decoration;

import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.trait.RadianceTrait;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Decoration painter for <b>Radiance</b> look and feel. This class
 * is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class RadianceDecorationPainter implements RadianceTrait {
    /**
     * Overlay decoration painter interface for <b>Radiance</b> look and feel. This class is
     * part of officially supported API.
     *
     * @author Kirill Grouchnikov
     */
    public interface OverlayPainter extends RadianceTrait {
        /**
         * Paints the overlay.
         *
         * @param graphics           Graphics context.
         * @param comp               Component.
         * @param decorationAreaType Decoration area type.
         * @param width              Width.
         * @param height             Height.
         * @param scaleFactor        Scale factor.
         * @param colorTokens        Color tokens for painting the overlay.
         */
        void paintOverlay(Graphics2D graphics, Component comp,
            RadianceThemingSlices.DecorationAreaType decorationAreaType,
            int width, int height, double scaleFactor, ContainerColorTokens colorTokens);
    }

    /**
     * Inlay decoration painter interface for <b>Radiance</b> look and feel. This class is
     * part of officially supported API.
     *
     * @author Kirill Grouchnikov
     */
    public interface InlayPainter extends RadianceTrait {
        /**
         * Paints the inlay.
         *
         * @param graphics           Graphics context.
         * @param comp               Component.
         * @param decorationAreaType Decoration area type.
         * @param width              Width.
         * @param height             Height.
         * @param scaleFactor        Scale factor.
         * @param colorTokens        Color tokens for painting the inlay.
         */
        void paintInlay(Graphics2D graphics, Component comp,
            RadianceThemingSlices.DecorationAreaType decorationAreaType,
            int x, int y, int width, int height, double scaleFactor,
            ContainerColorTokens colorTokens);
    }

    /**
     * Maps decoration area type to the registered overlay painters. Each
     * decoration area type can have more than one overlay painter.
     */
    private final Map<RadianceThemingSlices.DecorationAreaType, List<OverlayPainter>> overlayPaintersMap;

    /** Can be null. */
    private InlayPainter inlayPainter;

    protected RadianceDecorationPainter() {
        this.overlayPaintersMap = new HashMap<>();
    }

    /**
     * Adds the specified overlay painter to the end of the list of overlay
     * painters associated with the specified decoration area types.
     *
     * @param overlayPainter Overlay painter to add to the end of the list of overlay
     *                       painters associated with the specified decoration area types.
     * @param areaTypes      Decoration area types.
     */
    public void addOverlayPainter(OverlayPainter overlayPainter,
        RadianceThemingSlices.DecorationAreaType... areaTypes) {
        for (RadianceThemingSlices.DecorationAreaType areaType : areaTypes) {
            if (!this.overlayPaintersMap.containsKey(areaType)) {
                this.overlayPaintersMap.put(areaType, new ArrayList<>());
            }
            this.overlayPaintersMap.get(areaType).add(overlayPainter);
        }
    }

    /**
     * Removes the specified overlay painter from the list of overlay painters
     * associated with the specified decoration area types.
     *
     * @param overlayPainter Overlay painter to remove from the list of overlay painters
     *                       associated with the specified decoration area types.
     * @param areaTypes      Decoration area types.
     */
    public void removeOverlayPainter(OverlayPainter overlayPainter,
        RadianceThemingSlices.DecorationAreaType... areaTypes) {
        for (RadianceThemingSlices.DecorationAreaType areaType : areaTypes) {
            if (!this.overlayPaintersMap.containsKey(areaType)) {
                return;
            }
            this.overlayPaintersMap.get(areaType).remove(overlayPainter);
            if (this.overlayPaintersMap.get(areaType).isEmpty()) {
                this.overlayPaintersMap.remove(areaType);
            }
        }
    }

    /**
     * Removes all overlay painters associated with the specified decoration area types.
     *
     * @param areaTypes Decoration area types.
     */
    public void clearOverlayPainters(RadianceThemingSlices.DecorationAreaType... areaTypes) {
        for (RadianceThemingSlices.DecorationAreaType areaType : areaTypes) {
            if (!this.overlayPaintersMap.containsKey(areaType)) {
                return;
            }
            this.overlayPaintersMap.get(areaType).clear();
            this.overlayPaintersMap.remove(areaType);
        }
    }

    /**
     * Returns a non-null, non-modifiable list of overlay painters associated
     * with the specified decoration area type.
     *
     * @param decorationAreaType Decoration area type.
     * @return A non-null, non-modifiable list of overlay painters associated
     * with the specified decoration area type.
     */
    public List<OverlayPainter> getOverlayPainters(RadianceThemingSlices.DecorationAreaType decorationAreaType) {
        if (!this.overlayPaintersMap.containsKey(decorationAreaType)) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(this.overlayPaintersMap.get(decorationAreaType));
    }

    /**
     * Sets the inlay painter.
     */
    public void setInlayPainter(InlayPainter inlayPainter) {
        this.inlayPainter = inlayPainter;
    }

    /**
     * Returns the inlay painter. The result can be <code>null</code>.
     */
    public InlayPainter getInlayPainter() {
        return this.inlayPainter;
    }

    /**
     * Paints the decoration area as a fully filled rectangle.
     *
     * @param graphics           Graphics context.
     * @param comp               Component.
     * @param decorationAreaType Decoration area type. Must not be <code>null</code>.
     * @param width              Width.
     * @param height             Height.
     * @param colorTokens        Color tokens for painting the decoration area.
     */
    public abstract void paintDecorationArea(Graphics2D graphics, Component comp,
        RadianceThemingSlices.DecorationAreaType decorationAreaType,
        int width, int height, double scaleFactor, ContainerColorTokens colorTokens);
}
