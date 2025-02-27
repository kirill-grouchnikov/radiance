/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.utils.filters.ImageColorFilter;
import org.pushingpixels.radiance.theming.internal.utils.filters.TonalContainerFilter;

import javax.swing.*;
import java.awt.*;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/**
 * Provides utility functions for creating various images for <b>Radiance</b> look and feel. This
 * class is <b>for internal use only</b>.
 *
 * @author Kirill Grouchnikov
 */
public final class RadianceImageCreator {
    /**
     * Retrieves a single crayon of the specified color and dimensions for the crayon panel in color
     * chooser.
     *
     * @param mainColor Crayon main color.
     * @param width     Crayon width.
     * @param height    Crayon height.
     * @return Crayon image.
     */
    private static BufferedImage getSingleCrayon(double scale, Color mainColor,
            int width, int height) {
        BufferedImage image = RadianceCoreUtilities.getBlankImage(scale, width, height);

        // Four parts:
        // 1. Pointed tip
        // 2. Colorful cap
        // 3. Muted base
        // 4. Stripe across the cap

        int tipBase = (int) (0.2 * height);
        int capBase = (int) (0.4 * height);

        Graphics2D graphics = (Graphics2D) image.getGraphics().create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        Color lightColor = RadianceColorUtilities.getLighterColor(mainColor, 0.6);
        Color darkColor = RadianceColorUtilities.getDarkerColor(mainColor, 0.2);
        Color desaturatedLight = RadianceColorUtilities.getSaturatedColor(
                RadianceColorUtilities.getLighterColor(mainColor, 0.3), -0.4f);
        Color desaturatedDark = RadianceColorUtilities.getSaturatedColor(
                RadianceColorUtilities.getInterpolatedColor(
                        RadianceColorUtilities.getDarkerColor(mainColor, 0.2),
                        Color.lightGray, 0.6), -0.4f);

        LinearGradientPaint capFillPaint = new LinearGradientPaint(0, 0, width, 0,
                new float[]{0.0f, 0.45f, 1.0f},
                new Color[]{desaturatedLight, darkColor, desaturatedLight},
                CycleMethod.REPEAT);
        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
        graphics.setPaint(capFillPaint);
        graphics.fillRect(0, tipBase, width, height - tipBase);

        LinearGradientPaint caseFillPaint = new LinearGradientPaint(0, 0, width, 0,
                new float[]{0.0f, 0.45f, 1.0f},
                new Color[]{desaturatedDark, lightColor, desaturatedDark},
                CycleMethod.REPEAT);
        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));
        graphics.setPaint(caseFillPaint);
        graphics.fillRect(0, capBase, width, height - capBase);

        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));

        Color sideStripeColor = RadianceColorUtilities.getSaturatedColor(lightColor, -0.1f);
        Color midStripeColor = RadianceColorUtilities.getSaturatedColor(lightColor, -0.25f);
        int stripeTop = (int) (0.25 * height);
        int stripeHeight = (int) (0.04 * height);
        LinearGradientPaint stripeFillPaint = new LinearGradientPaint(0, 0, width, 0,
                new float[]{0.0f, 0.45f, 1.0f},
                new Color[]{sideStripeColor, midStripeColor, sideStripeColor},
                CycleMethod.REPEAT);
        graphics.setPaint(stripeFillPaint);
        graphics.fillRect(0, stripeTop, width, stripeHeight);

        // Stripe outline
        graphics.setColor(RadianceColorUtilities.getInterpolatedColor(sideStripeColor,
                Color.gray, 0.3));
        graphics.drawLine(0, stripeTop, 0, stripeTop + stripeHeight);
        graphics.drawLine(width - 1, stripeTop, width - 1, stripeTop + stripeHeight);

        // Outline between the tip and the stripe
        graphics.setColor(darkColor);
        graphics.drawRect(0, tipBase, width - 1, stripeTop - tipBase);

        // Outline between the stripe and the base of the cap
        graphics.setPaint(new LinearGradientPaint(0, 0, width, 0,
                new float[]{0.0f, 0.45f, 1.0f},
                new Color[]{darkColor, RadianceColorUtilities.getDarkerColor(mainColor, 0.4), darkColor},
                CycleMethod.REPEAT));
        graphics.drawRect(0, stripeTop + stripeHeight, width - 1, capBase - stripeTop - stripeHeight);

        // Base side outlines
        graphics.setColor(RadianceColorUtilities.getInterpolatedColor(mainColor,
                Color.gray, 0.6));
        graphics.drawLine(0, capBase, 0, height);
        graphics.drawLine(width - 1, capBase, width - 1, height);

        // create cap path
        GeneralPath capPath = new GeneralPath();
        capPath.moveTo(0.5f * width - 3, 4);
        capPath.quadTo(0.5f * width, 0, 0.5f * width + 3, 4);
        capPath.lineTo(width - 3, tipBase);
        capPath.lineTo(2, tipBase);
        capPath.lineTo(0.5f * width - 3, 4);

        graphics.setClip(capPath);

        // Tip fill
        ConicalGradientPaint tipFillPaint = new ConicalGradientPaint(
                true, // use degrees
                new Point2D.Double(0.5 * width, 0), // cone center
                0f, // rotation offset
                new float[] {0f, 162f, 179f, 183f, 198f, 360f}, // cone angles
                new Color[] {desaturatedLight, desaturatedLight, darkColor, darkColor, desaturatedLight, desaturatedLight}
        );
        graphics.setPaint(tipFillPaint);
        graphics.fillRect(0, 0, width, tipBase);

        graphics.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        // Tip outline
        graphics.setClip(new Rectangle2D.Double(0, 0, width, tipBase));
        graphics.setColor(darkColor);
        graphics.draw(capPath);

        graphics.dispose();

        return image;
    }

    /**
     * Crayon colors.
     */
    private final static int[] crayonColors = {0x800000, // Cayenne
            0x808000, // Asparagus
            0x008000, // Clover
            0x008080, // Teal
            0x000080, // Midnight
            0x800080, // Plum
            0x7f7f7f, // Tin
            0x808080, // Nickel

            0x804000, // Mocha
            0x408000, // Fern
            0x008040, // Moss
            0x004080, // Ocean
            0x400080, // Eggplant
            0x800040, // Maroon
            0x666666, // Steel
            0x999999, // Aluminium

            0xff0000, // Maraschino
            0xffff00, // Lemon
            0x00ff00, // Spring
            0x00ffff, // Turquoise
            0x0000ff, // Blueberry
            0xff00ff, // Magenta
            0x4c4c4c, // Iron
            0xb3b3b3, // Magnesium

            0xff8000, // Tangerine
            0x80ff00, // Lime
            0x00ff80, // Sea Foam
            0x0080ff, // Aqua
            0x8000ff, // Grape
            0xff0080, // Strawberry
            0x333333, // Tungsten
            0xcccccc, // Silver

            0xff6666, // Salmon
            0xffff66, // Banana
            0x66ff66, // Flora
            0x66ffff, // Ice
            0x6666ff, // Orchid
            0xff66ff, // Bubblegum
            0x191919, // Lead
            0xe6e6e6, // Mercury

            0xffcc66, // Cantaloupe
            0xccff66, // Honeydew
            0x66ffcc, // Spindrift
            0x66ccff, // Sky
            0xcc66ff, // Lavender
            0xff6fcf, // Carnation
            0x000000, // Licorice
            0xffffff, // Snow
    };

    /**
     * Retrieves crayon X offset.
     *
     * @param i Crayon index.
     * @return Crayon X offset.
     */
    private static int crayonX(int i) {
        return (i % 8) * 22 + 4 + ((i / 8) % 2) * 11;
    }

    /**
     * Retrieves crayon Y offset.
     *
     * @param i Crayon index.
     * @return Crayon Y offset.
     */
    private static int crayonY(int i) {
        return (i / 8) * 20 + 23;
    }

    /**
     * Retrieves crayons image for the crayon panel of color chooser.
     *
     * @return Crayons image.
     */
    public static Image getCrayonsImage(Color fillColor) {
        int iw = 195;
        int ih = 208;
        double scale = RadianceCommonCortex.getScaleFactor(null);
        Image image = RadianceCoreUtilities.getBlankImage(scale, iw, ih);
        Graphics2D graphics = (Graphics2D) image.getGraphics().create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        graphics.setColor(fillColor);
        graphics.fillRect(0, 0, iw, ih);

        for (int i = 0; i < RadianceImageCreator.crayonColors.length; i++) {
            Color crayonColor = new Color(0xff000000 | RadianceImageCreator.crayonColors[i]);
            BufferedImage crayonImage = RadianceImageCreator.getSingleCrayon(
                    scale, crayonColor, 22, 120);
            RadianceCommonCortex.drawImageWithScale(graphics, scale, crayonImage,
                    RadianceImageCreator.crayonX(i), RadianceImageCreator.crayonY(i));
        }

        graphics.dispose();
        return image;
    }

    /**
     * Returns a lock icon that matches the specified scheme.
     *
     * @param tokens Tokens.
     * @return Lock icon that matches the specified scheme.
     */
    public static Icon getSmallLockIcon(ContainerColorTokens tokens, Component c) {
        int componentFontSize = RadianceSizeUtils.getComponentFontSize(c);
        int extraPadding = RadianceSizeUtils.getExtraPadding(componentFontSize);
        int size = 9 + 2 * extraPadding;

        return RadianceThemingCortex.GlobalScope.getIconPack().getLockIcon(size, tokens);
    }

    /**
     * Returns a caps lock icon that matches the specified scheme.
     *
     * @param tokens Tokens.
     * @return Caps lock icon that matches the specified scheme.
     */
    public static Icon getCapsLockIcon(ContainerColorTokens tokens, Component c) {
        return RadianceThemingCortex.GlobalScope.getIconPack().getCapsLockIcon(32, tokens);
    }

    /**
     * Creates a new version of the specified icon that is rendered in the colors of the specified
     * color scheme.
     *
     * @param comp        Component.
     * @param original    The original icon.
     * @param colorTokens Color tokens.
     * @return Scheme-based version of the original icon.
     */
    public static BufferedImage getContainerTokensImage(Component comp, Icon original,
        ContainerColorTokens colorTokens, float originalBrightnessFactor) {
        int w = original.getIconWidth();
        int h = original.getIconHeight();
        if ((w == 0) || (h == 0)) {
            return null;
        }
        double scale = RadianceCommonCortex.getScaleFactor(comp);
        BufferedImage origImage = RadianceCoreUtilities.getBlankImage(scale, w, h);
        Graphics2D g2d = (Graphics2D) origImage.getGraphics().create();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
            RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        original.paintIcon(comp, origImage.getGraphics(), 0, 0);
        g2d.dispose();

        BufferedImage result = getContainerTokensImage(origImage, colorTokens,
            originalBrightnessFactor, 1.0f);
        return result;
    }

    /**
     * Creates a new version of the specified image that is rendered in the colors of the specified
     * color scheme.
     *
     * @param original                 The original image.
     * @param colorTokens              Color tokens.
     * @param originalBrightnessFactor The original brightness factor.
     * @return Scheme-based version of the original icon.
     */
    public static BufferedImage getContainerTokensImage(BufferedImage original,
            ContainerColorTokens colorTokens, float originalBrightnessFactor,
            float alpha) {
        return TonalContainerFilter.getContainerTokensFilter(colorTokens, originalBrightnessFactor, alpha)
                .filter(original, null);
    }

    public static BufferedImage getColorImage(Component comp, Icon original,
            Color color, float alpha) {
        int w = original.getIconWidth();
        int h = original.getIconHeight();
        if ((w == 0) || (h == 0)) {
            return null;
        }
        BufferedImage origImage = RadianceCoreUtilities.getBlankImage(
                RadianceCommonCortex.getScaleFactor(comp), w, h);
        Graphics2D g2d = (Graphics2D) origImage.getGraphics().create();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        original.paintIcon(comp, origImage.getGraphics(), 0, 0);
        g2d.dispose();

        return new ImageColorFilter(color, alpha).filter(origImage, null);
    }
}
