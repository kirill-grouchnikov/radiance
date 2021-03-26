/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.spyglass.cookbook.skin;

import com.jhlabs.image.*;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.decoration.SubstanceDecorationPainter;

import javax.swing.*;
import java.awt.*;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;

class CookbookDecorationPainter implements SubstanceDecorationPainter {
    private BufferedImage brushedMetalImage;

    private BufferedImage woodImage;

    private BufferedImage lightImage;

    public CookbookDecorationPainter() {
        GoldenBrownColorScheme goldenBrownScheme = new GoldenBrownColorScheme();
        DarkBrownColorScheme darkBrownScheme = new DarkBrownColorScheme();

        Rectangle virtualBounds = new Rectangle();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gds = ge.getScreenDevices();
        for (GraphicsDevice gd : gds) {
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            virtualBounds = virtualBounds.union(gc.getBounds());
        }

        int screenWidth = virtualBounds.width;
        int screenHeight = virtualBounds.height;

        // brushed metal filter
        BrushedMetalFilter brushedMetalFilter = new BrushedMetalFilter();
        brushedMetalFilter.setAmount(10);
        LookupFilter brushedMetalLookupFilter = new LookupFilter(
                new Gradient(new int[] { 0, 96, 255 },
                        new int[] { goldenBrownScheme.getUltraDarkColor().getRGB(),
                                goldenBrownScheme.getLightColor().getRGB(),
                                goldenBrownScheme.getUltraLightColor().getRGB() }));

        this.brushedMetalImage = new CompoundFilter(brushedMetalFilter, brushedMetalLookupFilter)
                .filter(new BufferedImage(screenWidth, screenHeight, BufferedImage.TYPE_INT_ARGB),
                        null);

        // wood filter
        WoodFilter woodFilter = new WoodFilter();
        woodFilter.setScale(100);
        woodFilter.setAngle((float) Math.PI / 2.0f);
        woodFilter.setStretch(10);
        woodFilter.setTurbulence(0);
        woodFilter.setRings(0.4f);
        woodFilter.setFibres(0.3f);
        woodFilter.setgain(0.7f);

        LookupFilter woodLookupFilter = new LookupFilter(new Gradient(
                new int[] { 0, 64, 128, 192, 255 },
                new int[] { darkBrownScheme.getUltraDarkColor().getRGB(),
                        darkBrownScheme.getUltraDarkColor().getRGB(),
                        darkBrownScheme.getDarkColor().getRGB(),
                        darkBrownScheme.getLightColor().getRGB(),
                        darkBrownScheme.getUltraLightColor().getRGB() }));

        this.woodImage = new CompoundFilter(woodFilter, woodLookupFilter).filter(
                new BufferedImage(screenWidth, screenHeight, BufferedImage.TYPE_INT_ARGB), null);

        this.lightImage = getLightImage();
    }

    @Override
    public String getDisplayName() {
        return "Cookbook";
    }

    @Override
    public void paintDecorationArea(Graphics2D graphics, Component comp,
            DecorationAreaType decorationAreaType, int width, int height, SubstanceSkin skin) {
        SubstanceColorScheme fillScheme = skin.getBackgroundColorScheme(decorationAreaType);
        BufferedImage toOverlay = this.getWatermarkImage(decorationAreaType);
        Component farthestOfTheSameAreaType = this.getFarthest(comp, decorationAreaType);
        if ((decorationAreaType == DecorationAreaType.PRIMARY_TITLE_PANE)
                || (decorationAreaType == DecorationAreaType.SECONDARY_TITLE_PANE)
                || (decorationAreaType == DecorationAreaType.HEADER)
                || (decorationAreaType == DecorationAreaType.TOOLBAR)) {
            int dy = comp.getLocationOnScreen().y
                    - SwingUtilities.getWindowAncestor(comp).getLocationOnScreen().y;
            // main background gradient
            graphics.setPaint(new LinearGradientPaint(0, -dy, 0, 70 - dy,
                    new float[] { 0.0f, 0.05f, 0.6f, 0.8f, 1.0f },
                    new Color[] { fillScheme.getUltraLightColor(), fillScheme.getExtraLightColor(),
                            fillScheme.getMidColor(), fillScheme.getDarkColor(),
                            fillScheme.getUltraDarkColor() }));
            graphics.fillRect(0, 0, width, height);
        } else if (decorationAreaType == DecorationAreaType.FOOTER) {
            // main background gradient
            int dy = comp.getLocationOnScreen().y
                    - farthestOfTheSameAreaType.getLocationOnScreen().y;
            int footerHeight = farthestOfTheSameAreaType.getHeight();
            graphics.setPaint(new LinearGradientPaint(0, -dy, 0, -dy + footerHeight,
                    new float[] { 0.0f, 0.5f, 0.75f, 1.0f },
                    new Color[] { fillScheme.getLightColor(), fillScheme.getMidColor(),
                            fillScheme.getDarkColor(), fillScheme.getUltraDarkColor() }));
            graphics.fillRect(0, 0, width, height);
        } else if (decorationAreaType == DecorationAreaType.CONTROL_PANE) {
            // general background gradient
            graphics.setPaint(new GradientPaint(0, 0, fillScheme.getLightColor(), 0, height,
                    fillScheme.getMidColor()));
            graphics.fillRect(0, 0, width, height);
        } else {
            // main background gradient
            graphics.setPaint(new GradientPaint(0, 0, fillScheme.getExtraLightColor(), 0, height,
                    fillScheme.getMidColor()));
            graphics.fillRect(0, 0, width, height);
        }

        int dy = comp.getLocationOnScreen().y
                - SwingUtilities.getWindowAncestor(comp).getLocationOnScreen().y;
        int dx = comp.getLocationOnScreen().x
                - SwingUtilities.getWindowAncestor(comp).getLocationOnScreen().x;
        graphics.setComposite(AlphaComposite.SrcOver.derive(0.25f));
        graphics.drawImage(toOverlay, 0, 0, width, height, dx, dy, dx + width, dy + height, null);
        graphics.setComposite(AlphaComposite.SrcOver);

        if (decorationAreaType == DecorationAreaType.CONTROL_PANE) {
            // special case - draw lights
            int offsetX = comp.getLocationOnScreen().x
                    - farthestOfTheSameAreaType.getLocationOnScreen().x;
            int offsetY = comp.getLocationOnScreen().y
                    - farthestOfTheSameAreaType.getLocationOnScreen().y;

            final double scaleFactor = NeonCortex.getScaleFactor();
            int lightImageScaledWidth = (int) (this.lightImage.getWidth() / scaleFactor);

            int currTileX = -offsetX;
            graphics.translate(currTileX, -offsetY);
            while (currTileX < width) {
                graphics.drawImage(this.lightImage, 0, 0,
                        (int) (this.lightImage.getWidth() / scaleFactor),
                        (int) (this.lightImage.getHeight() / scaleFactor), null);
                currTileX += lightImageScaledWidth;
                graphics.translate(lightImageScaledWidth, 0);
            }
        }
    }

    @Override
    public void paintDecorationArea(Graphics2D graphics, Component comp, DecorationAreaType
            decorationAreaType, Shape contour, SubstanceColorScheme colorScheme) {
    }

    private Component getFarthest(Component comp, DecorationAreaType type) {
        Component result = comp;
        while (true) {
            comp = comp.getParent();
            if (comp == null)
                break;
            DecorationAreaType curr = ComponentOrParentChainScope.getDecorationType(comp);
            if (curr == type) {
                result = comp;
            }
        }
        return result;
    }

    private static BufferedImage getLightImage() {
        BufferedImage lightConeImage = SubstanceCortex.GlobalScope.getBlankImage(
                SubstanceCortex.GlobalScope.getScaleFactor(null), 200, 100);
        Graphics2D lightConeGraphics = lightConeImage.createGraphics();
        lightConeGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        GeneralPath path = new GeneralPath();
        path.moveTo(100, 5);
        path.quadTo(155, 20, 155, 25);
        path.curveTo(110, 40, 110, 60, 100, 50);
        path.curveTo(90, 60, 90, 40, 45, 25);
        path.quadTo(45, 20, 100, 5);
        lightConeGraphics.setComposite(AlphaComposite.SrcOver.derive(0.45f));
        LinearGradientPaint lightConeGradient = new LinearGradientPaint(0, 0, 0, 43,
                new float[] { 0.0f, 0.5f, 0.7f, 1.0f },
                new Color[] { new Color(200, 200, 255), new Color(200, 200, 255, 128),
                        new Color(200, 200, 255, 48), new Color(200, 200, 255, 0) },
                CycleMethod.NO_CYCLE);
        lightConeGraphics.setPaint(lightConeGradient);
        lightConeGraphics.fill(path);
        lightConeGraphics.dispose();

        GaussianFilter gaussianFilter = new GaussianFilter(29.0f);
        lightConeImage = gaussianFilter.filter(lightConeImage, null);

        BufferedImage finalImage = SubstanceCortex.GlobalScope.getBlankImage(
                SubstanceCortex.GlobalScope.getScaleFactor(null), 150, 100);
        Graphics2D finalGraphics = finalImage.createGraphics();
        finalGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        finalGraphics.translate(-25, -10);
        double scaleFactor = NeonCortex.getScaleFactor();
        finalGraphics.drawImage(lightConeImage, 0, 0,
                (int) (lightConeImage.getWidth() / scaleFactor),
                (int) (lightConeImage.getHeight() / scaleFactor), null);

        // Emulate the appearance of the light bulb itself
        finalGraphics.setColor(new Color(200, 200, 255, 96));
        finalGraphics.fillOval(97, 6, 8, 8);
        finalGraphics.setColor(new Color(200, 200, 255, 128));
        float borderStrokeWidth = 1.0f / (float) scaleFactor;
        finalGraphics.setStroke(new BasicStroke(borderStrokeWidth));
        finalGraphics.drawOval(97, 6, 8, 8);
        finalGraphics.dispose();

        return new HSBAdjustFilter(0.5f, 0.0f, 0.0f).filter(finalImage, null);
    }

    public BufferedImage getWatermarkImage(DecorationAreaType decorationAreaType) {
        if ((decorationAreaType == DecorationAreaType.PRIMARY_TITLE_PANE)
                || (decorationAreaType == DecorationAreaType.SECONDARY_TITLE_PANE)
                || (decorationAreaType == DecorationAreaType.HEADER)
                || (decorationAreaType == DecorationAreaType.TOOLBAR)
                || (decorationAreaType == DecorationAreaType.FOOTER)) {
            return this.brushedMetalImage;
        }

        if (decorationAreaType == DecorationAreaType.CONTROL_PANE) {
            return this.woodImage;
        }

        return null;
    }
}
