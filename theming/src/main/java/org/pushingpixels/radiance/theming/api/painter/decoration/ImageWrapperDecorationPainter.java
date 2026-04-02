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

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceImageCreator;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * Implementation of {@link RadianceDecorationPainter} that uses an image source to paint on
 * decoration areas.
 * 
 * @author Kirill Grouchnikov
 */
public abstract class ImageWrapperDecorationPainter extends RadianceDecorationPainter {
    /**
     * Contains the original (not colorized) image of this painter.
     */
    protected Image originalTile = null;

    /**
     * The base decoration painter - the colorized image tiles are painted over the painting of this
     * painter. Can be <code>null</code>.
     */
    protected RadianceDecorationPainter baseDecorationPainter;

    /**
     * Map of colorized tiles.
     */
    protected LinkedHashMap<String, BufferedImage> colorizedTileMap;

    /**
     * Alpha channel for the texture image (colorized tiles applied on top of the
     * {@link #baseDecorationPainter} painting).
     */
    protected float textureAlpha;

    /**
     * Creates a new image wrapper decoration painter.
     */
    public ImageWrapperDecorationPainter() {
        this.textureAlpha = 0.2f;

        this.colorizedTileMap = new LinkedHashMap<>() {
            @Override
            protected boolean removeEldestEntry(Entry<String, BufferedImage> eldest) {
                return this.size() > 10;
            }
        };
    }

    @Override
    public void paintDecorationArea(Graphics2D graphics, Component comp,
        RadianceThemingSlices.DecorationAreaType decorationAreaType,
        int width, int height, double scaleFactor, ContainerColorTokens colorTokens) {
        if ((decorationAreaType == RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE)
                || (decorationAreaType == RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE)) {
            this.paintTitleBackground(graphics, comp, decorationAreaType, width, height, scaleFactor, colorTokens);
        } else {
            this.paintExtraBackground(graphics, comp, decorationAreaType, width, height, scaleFactor, colorTokens);
        }
    }

    /**
     * Paints the title background.
     * 
     * @param graphics
     *            Graphics context.
     * @param comp
     *            Component.
     * @param decorationAreaType
     *            Decoration area type. Must not be <code>null</code>.
     * @param width
     *            Width.
     * @param height
     *            Height.
     * @param colorTokens
     *            Color tokens for painting the title background.
     */
    private void paintTitleBackground(Graphics2D graphics, Component comp,
        RadianceThemingSlices.DecorationAreaType decorationAreaType,
        int width, int height, double scaleFactor, ContainerColorTokens colorTokens) {

        if (this.baseDecorationPainter == null) {
            graphics.setColor(colorTokens.getContainerSurface());
            graphics.fillRect(0, 0, width, height);
        } else {
            this.baseDecorationPainter.paintDecorationArea(graphics, comp, decorationAreaType,
                width, height, scaleFactor, colorTokens);
        }

        Graphics2D temp = (Graphics2D) graphics.create();
        this.tileArea(temp, comp, colorTokens, 0, 0, width, height, scaleFactor);
        temp.dispose();
    }

    /**
     * Paints the background of non-title decoration areas.
     * 
     * @param graphics
     *            Graphics context.
     * @param comp
     *            Component.
     * @param decorationAreaType
     *            Decoration area type. Must not be <code>null</code>.
     * @param width
     *            Width.
     * @param height
     *            Height.
     * @param colorTokens
     *            Color tokens for painting the background of non-title decoration areas.
     */
    private void paintExtraBackground(Graphics2D graphics, Component comp,
        RadianceThemingSlices.DecorationAreaType decorationAreaType,
        int width, int height, double scaleFactor, ContainerColorTokens colorTokens) {

        Point offset = RadianceCoreUtilities.getOffsetInRootPaneCoords(comp);

        if (this.baseDecorationPainter != null) {
            this.baseDecorationPainter.paintDecorationArea(graphics, comp, decorationAreaType,
                width, height, scaleFactor, colorTokens);
        } else {
            graphics.setColor(colorTokens.getContainerSurface());
            graphics.fillRect(0, 0, width, height);
        }
        Graphics2D temp = (Graphics2D) graphics.create();
        this.tileArea(temp, comp, colorTokens, offset.x, offset.y, width, height, scaleFactor);
        temp.dispose();
    }

    private void tileArea(Graphics2D g, Component comp, ContainerColorTokens tileContainerTokens,
            int offsetTextureX, int offsetTextureY, int width, int height, double scaleFactor) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setComposite(WidgetUtilities.getAlphaComposite(comp, this.textureAlpha, g));

        Image colorizedTile = this.getColorizedTile(scaleFactor, tileContainerTokens);
        int tileWidth = (int) (colorizedTile.getWidth(null) / scaleFactor);
        int tileHeight = (int) (colorizedTile.getHeight(null) / scaleFactor);

        offsetTextureX = offsetTextureX % tileWidth;
        offsetTextureY = offsetTextureY % tileHeight;
        int currTileTop = -offsetTextureY;
        do {
            int currTileLeft = -offsetTextureX;
            do {
                graphics.drawImage(colorizedTile, currTileLeft, currTileTop, tileWidth, tileHeight,
                        null);
                currTileLeft += tileWidth;
            } while (currTileLeft < width);
            currTileTop += tileHeight;
        } while (currTileTop < height);

        graphics.dispose();
    }

    /**
     * Sets the base decoration painter.
     * 
     * @param baseDecorationPainter
     *            Base decoration painter.
     */
    public void setBaseDecorationPainter(RadianceDecorationPainter baseDecorationPainter) {
        this.baseDecorationPainter = baseDecorationPainter;
    }

    /**
     * Sets the alpha channel for the image texture.
     * 
     * @param textureAlpha
     *            Alpha channel for the image texture.
     */
    public void setTextureAlpha(float textureAlpha) {
        this.textureAlpha = textureAlpha;
    }

    /**
     * Returns a colorized image tile.
     * 
     * @param colorTokens
     *            Color tokens for the colorization.
     * @return Colorized tile.
     */
    protected BufferedImage getColorizedTile(double scale, ContainerColorTokens colorTokens) {
        String key = scale + ":" + colorTokens.hashCode();
        BufferedImage result = this.colorizedTileMap.get(key);
        if (result == null) {
            int tileWidth = this.originalTile.getWidth(null);
            int tileHeight = this.originalTile.getHeight(null);
            BufferedImage tileBi = RadianceCoreUtilities.getBlankImage(scale,
                    (int) (tileWidth / scale),
                    (int) (tileHeight / scale));
            Graphics2D tile2D = tileBi.createGraphics();
            tile2D.drawImage(this.originalTile, 0, 0, (int) (tileWidth / scale),
                    (int) ( tileHeight / scale), null);
            tile2D.dispose();
            result = RadianceImageCreator.getContainerTokensImage(tileBi,
                colorTokens, 0.0f, 1.0f);
            this.colorizedTileMap.put(key, result);
        }
        return result;
    }
}
