/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.substance.api.painter.decoration;

import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;

/**
 * Implementation of {@link SubstanceDecorationPainter} that uses an image source to paint on
 * decoration areas.
 * 
 * @author Kirill Grouchnikov
 * @since version 4.3
 */
public abstract class ImageWrapperDecorationPainter implements SubstanceDecorationPainter {
    /**
     * Contains the original (not colorized) image of this painter.
     */
    protected Image originalTile = null;

    /**
     * The base decoration painter - the colorized image tiles are painted over the painting of this
     * painter. Can be <code>null</code>.
     */
    protected SubstanceDecorationPainter baseDecorationPainter;

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

        this.colorizedTileMap = new LinkedHashMap<String, BufferedImage>() {
            @Override
            protected boolean removeEldestEntry(Entry<String, BufferedImage> eldest) {
                return this.size() > 10;
            }
        };
    }

    @Override
    public void paintDecorationArea(Graphics2D graphics, Component comp,
            DecorationAreaType decorationAreaType, int width, int height, SubstanceSkin skin) {
        if ((decorationAreaType == DecorationAreaType.PRIMARY_TITLE_PANE)
                || (decorationAreaType == DecorationAreaType.SECONDARY_TITLE_PANE)) {
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
            DecorationAreaType decorationAreaType, int width, int height, SubstanceSkin skin) {

        SubstanceColorScheme tileScheme = skin.getBackgroundColorScheme(decorationAreaType);
        if (this.baseDecorationPainter == null) {
            graphics.setColor(tileScheme.getMidColor());
            graphics.fillRect(0, 0, width, height);
        } else {
            this.baseDecorationPainter.paintDecorationArea(graphics, comp, decorationAreaType,
                    width, height, skin);
        }

        Graphics2D temp = (Graphics2D) graphics.create();
        this.tileArea(temp, comp, tileScheme, 0, 0, 0, 0, width, height);
        temp.dispose();
    }

    /**
     * Paints the background of non-title decoration areas.
     * 
     * @param graphics
     *            Graphics context.
     * @param parent
     *            Component ancestor for computing the correct offset of the background painting.
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
            DecorationAreaType decorationAreaType, int width, int height, SubstanceSkin skin) {

        Point offset = SubstanceCoreUtilities.getOffsetInRootPaneCoords(comp);

        SubstanceColorScheme tileScheme = skin.getBackgroundColorScheme(decorationAreaType);
        if (this.baseDecorationPainter != null) {
            this.baseDecorationPainter.paintDecorationArea(graphics, comp, decorationAreaType,
                    width, height, skin);
        } else {
            graphics.setColor(tileScheme.getMidColor());
            graphics.fillRect(0, 0, width, height);
        }
        Graphics2D temp = (Graphics2D) graphics.create();
        this.tileArea(temp, comp, tileScheme, offset.x, offset.y, 0, 0, width, height);
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
     * @param x
     *            X coordinate of the tiling region.
     * @param y
     *            Y coordinate of the tiling region.
     * @param width
     *            Width of the tiling region.
     * @param height
     *            Height of the tiling region.
     */
    protected void tileArea(Graphics2D g, Component comp, SubstanceColorScheme tileScheme,
            int offsetTextureX, int offsetTextureY, int x, int y, int width, int height) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setComposite(WidgetUtilities.getAlphaComposite(comp, this.textureAlpha, g));

        Image colorizedTile = this.getColorizedTile(tileScheme);
        float scaleFactor = SubstanceCoreUtilities.isHiDpiAwareImage(this.originalTile)
                ? (float) UIUtil.getScaleFactor()
                : 1;
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
    public void setBaseDecorationPainter(SubstanceDecorationPainter baseDecorationPainter) {
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
    protected BufferedImage getColorizedTile(SubstanceColorScheme scheme) {
        BufferedImage result = this.colorizedTileMap.get(scheme.getDisplayName());
        if (result == null) {
            float scaleFactor = SubstanceCoreUtilities.isHiDpiAwareImage(this.originalTile)
                    ? (float) UIUtil.getScaleFactor()
                    : 1;
            int tileWidth = this.originalTile.getWidth(null);
            int tileHeight = this.originalTile.getHeight(null);
            BufferedImage tileBi = SubstanceCoreUtilities.getBlankImage((int) (tileWidth / scaleFactor),
                    (int) (tileHeight / scaleFactor));
            Graphics2D tile2D = tileBi.createGraphics();
            tile2D.drawImage(this.originalTile, 0, 0, (int) (tileWidth / scaleFactor),
                    (int) ( tileHeight / scaleFactor), null);
            tile2D.dispose();
            result = SubstanceImageCreator.getColorSchemeImage(tileBi, scheme, 0.0f);
            this.colorizedTileMap.put(scheme.getDisplayName(), result);
        }
        return result;
    }
}
