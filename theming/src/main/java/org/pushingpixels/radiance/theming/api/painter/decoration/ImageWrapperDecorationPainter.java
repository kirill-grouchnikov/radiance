/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
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
public abstract class ImageWrapperDecorationPainter implements RadianceDecorationPainter {
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
                                    RadianceThemingSlices.DecorationAreaType decorationAreaType, int width, int height, RadianceSkin skin) {
        if ((decorationAreaType == RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE)
                || (decorationAreaType == RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE)) {
            this.paintTitleBackground(graphics, comp, decorationAreaType, width, height, skin);
        } else {
            this.paintExtraBackground(graphics, comp, decorationAreaType, width, height, skin);
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
     * @param skin
     *            Skin for painting the title background.
     */
    private void paintTitleBackground(Graphics2D graphics, Component comp,
                                      RadianceThemingSlices.DecorationAreaType decorationAreaType, int width, int height, RadianceSkin skin) {

        RadianceColorScheme tileScheme = skin.getBackgroundColorScheme(decorationAreaType);
        if (this.baseDecorationPainter == null) {
            graphics.setColor(tileScheme.getMidColor());
            graphics.fillRect(0, 0, width, height);
        } else {
            this.baseDecorationPainter.paintDecorationArea(graphics, comp, decorationAreaType,
                    width, height, skin);
        }

        Graphics2D temp = (Graphics2D) graphics.create();
        this.tileArea(temp, comp, tileScheme, 0, 0, width, height);
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
     * @param skin
     *            Skin for painting the background of non-title decoration areas.
     */
    private void paintExtraBackground(Graphics2D graphics, Component comp,
                                      RadianceThemingSlices.DecorationAreaType decorationAreaType, int width, int height, RadianceSkin skin) {
        Point offset = RadianceCoreUtilities.getOffsetInRootPaneCoords(comp);

        RadianceColorScheme tileScheme = skin.getBackgroundColorScheme(decorationAreaType);
        if (this.baseDecorationPainter != null) {
            this.baseDecorationPainter.paintDecorationArea(graphics, comp, decorationAreaType,
                    width, height, skin);
        } else {
            graphics.setColor(tileScheme.getMidColor());
            graphics.fillRect(0, 0, width, height);
        }
        Graphics2D temp = (Graphics2D) graphics.create();
        this.tileArea(temp, comp, tileScheme, offset.x, offset.y, width, height);
        temp.dispose();
    }

    @Override
    public void paintDecorationArea(Graphics2D graphics, Component comp, RadianceThemingSlices.DecorationAreaType
            decorationAreaType, Shape contour, RadianceColorScheme colorScheme) {
        Point offset = RadianceCoreUtilities.getOffsetInRootPaneCoords(comp);
        if (this.baseDecorationPainter != null) {
            this.baseDecorationPainter.paintDecorationArea(graphics, comp, decorationAreaType,
                    contour, colorScheme);
        } else {
            graphics.setColor(colorScheme.getMidColor());
            graphics.fill(contour);
        }
        Graphics2D temp = (Graphics2D) graphics.create();
        // Clip the area for tiling with the image. Ideally this would be done
        // with soft clipping (in RadianceCoreUtilities), but that creates an
        // additional image. For now do hard clipping instead.
        temp.setClip(contour);
        this.tileArea(temp, comp, colorScheme, offset.x, offset.y, comp.getWidth(),
                comp.getHeight());
        temp.dispose();
    }

    /**
     * Tiles the specified area with colorized version of the image tile. This is called after the
     * {@link #baseDecorationPainter} has painted the area. This method should respect the current
     * {@link #textureAlpha} value.
     * 
     * @param g
     *            Graphic context.
     * @param comp
     *            Component.
     * @param tileScheme
     *            Scheme for the tile colorization.
     * @param offsetTextureX
     *            X offset for the tiling.
     * @param offsetTextureY
     *            Y offset for the tiling.
     * @param width
     *            Width of the tiling region.
     * @param height
     *            Height of the tiling region.
     */
    private void tileArea(Graphics2D g, Component comp, RadianceColorScheme tileScheme,
            int offsetTextureX, int offsetTextureY, int width, int height) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setComposite(WidgetUtilities.getAlphaComposite(comp, this.textureAlpha, g));

        double scale = RadianceCommonCortex.getScaleFactor(comp);
        Image colorizedTile = this.getColorizedTile(scale, tileScheme);
        int tileWidth = (int) (colorizedTile.getWidth(null) / scale);
        int tileHeight = (int) (colorizedTile.getHeight(null) / scale);

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
     * @param scheme
     *            Color scheme for the colorization.
     * @return Colorized tile.
     */
    protected BufferedImage getColorizedTile(double scale, RadianceColorScheme scheme) {
        String key = scale + ":" + scheme.getDisplayName();
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
            result = RadianceImageCreator.getColorSchemeImage(tileBi, scheme, 0.0f, 1.0f);
            this.colorizedTileMap.put(key, result);
        }
        return result;
    }
}
