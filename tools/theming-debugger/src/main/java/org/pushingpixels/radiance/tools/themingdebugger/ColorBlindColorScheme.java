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
package org.pushingpixels.radiance.tools.themingdebugger;

import org.pushingpixels.radiance.theming.api.colorscheme.BaseColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;

import java.awt.*;

/**
 * Base class for color schemes simulating color-blind users.
 *
 * @author Kirill Grouchnikov
 */
public class ColorBlindColorScheme extends BaseColorScheme {
    /**
     * Matrix for converting RGB to LMS.
     */
    public double[][] _rgbToLms = { { 0.05059983, 0.08585369, 0.00952420 },
            { 0.01893033, 0.08925308, 0.01370054 },
            { 0.00292202, 0.00975732, 0.07145979 } };

    /**
     * Matrix for converting LMS to RGB.
     */
    public double[][] _lmsToRgb = { { 30.830854, -29.832659, 1.610474 },
            { -6.481468, 17.715578, -2.532642 },
            { -0.375690, -1.199062, 14.273846 } };

    /**
     * The main ultra-light color.
     */
    private Color mainUltraLightColor;

    /**
     * The main extra-light color.
     */
    private Color mainExtraLightColor;

    /**
     * The main light color.
     */
    private Color mainLightColor;

    /**
     * The main medium color.
     */
    private Color mainMidColor;

    /**
     * The main dark color.
     */
    private Color mainDarkColor;

    /**
     * The main ultra-dark color.
     */
    private Color mainUltraDarkColor;

    /**
     * The foreground color.
     */
    private Color foregroundColor;

    /**
     * The original color scheme.
     */
    private RadianceColorScheme origScheme;

    /**
     * Creates a new color scheme that simulates color-blindness.
     *
     * @param origScheme Original color scheme.
     * @param kind       Color-blindness kind.
     */
    public ColorBlindColorScheme(RadianceColorScheme origScheme,
            BlindnessKind kind) {
        super(kind.name() + " " + origScheme.getDisplayName(), origScheme
                .isDark());
        this.origScheme = origScheme;
        this.foregroundColor = getColorBlindColor(origScheme
                .getForegroundColor(), _rgbToLms, kind, _lmsToRgb);
        this.mainUltraDarkColor = getColorBlindColor(origScheme
                .getUltraDarkColor(), _rgbToLms, kind, _lmsToRgb);
        this.mainDarkColor = getColorBlindColor(origScheme.getDarkColor(),
                _rgbToLms, kind, _lmsToRgb);
        this.mainMidColor = getColorBlindColor(origScheme.getMidColor(),
                _rgbToLms, kind, _lmsToRgb);
        this.mainLightColor = getColorBlindColor(origScheme.getLightColor(),
                _rgbToLms, kind, _lmsToRgb);
        this.mainExtraLightColor = getColorBlindColor(origScheme
                .getExtraLightColor(), _rgbToLms, kind, _lmsToRgb);
        this.mainUltraLightColor = getColorBlindColor(origScheme
                .getUltraLightColor(), _rgbToLms, kind, _lmsToRgb);
    }

    /**
     * Converts the specified color into color-blind version.
     *
     * @param orig     The original color.
     * @param rgbToLms RGB to LMS conversion matrix.
     * @param kind     Color-blindness kind.
     * @param lmsToRgb LMS to RGB conversion matrix.
     * @return Color-blind version of the original color.
     */
    private static Color getColorBlindColor(Color orig, double[][] rgbToLms,
            BlindnessKind kind, double[][] lmsToRgb) {
        double r = orig.getRed();
        double g = orig.getGreen();
        double b = orig.getBlue();

        double[] rgbOrig = new double[] { r, g, b };
        double[] lms = mult3(rgbToLms, rgbOrig);
        double tmp = 0.0;

        double[] anchor = { 0.08008, 0.1579, 0.5897, 0.1284, 0.2237, 0.3636,
                0.9856, 0.7325, 0.001079, 0.0914, 0.007009, 0.0 };

        double[] rgbAnchor = {
                rgbToLms[0][0] + rgbToLms[0][1] + rgbToLms[0][2],
                rgbToLms[1][0] + rgbToLms[1][1] + rgbToLms[1][2],
                rgbToLms[2][0] + rgbToLms[2][1] + rgbToLms[2][2] };

        double a1, a2, b1, b2, c1, c2, inflection;

        switch (kind) {
            case PROTANOPIA:
                a1 = rgbAnchor[1] * anchor[8] - rgbAnchor[2] * anchor[7];
                b1 = rgbAnchor[2] * anchor[6] - rgbAnchor[0] * anchor[8];
                c1 = rgbAnchor[0] * anchor[7] - rgbAnchor[1] * anchor[6];
                a2 = rgbAnchor[1] * anchor[2] - rgbAnchor[2] * anchor[1];
                b2 = rgbAnchor[2] * anchor[0] - rgbAnchor[0] * anchor[2];
                c2 = rgbAnchor[0] * anchor[1] - rgbAnchor[1] * anchor[0];
                inflection = rgbAnchor[2] / rgbAnchor[1];
                tmp = lms[2] / lms[1];
                if (tmp < inflection)
                    lms[0] = -(b1 * lms[1] + c1 * lms[2]) / a1;
                else
                    lms[0] = -(b2 * lms[1] + c2 * lms[2]) / a2;
                break;

            case DEUTERANOPIA:
                a1 = rgbAnchor[1] * anchor[8] - rgbAnchor[2] * anchor[7];
                b1 = rgbAnchor[2] * anchor[6] - rgbAnchor[0] * anchor[8];
                c1 = rgbAnchor[0] * anchor[7] - rgbAnchor[1] * anchor[6];
                a2 = rgbAnchor[1] * anchor[2] - rgbAnchor[2] * anchor[1];
                b2 = rgbAnchor[2] * anchor[0] - rgbAnchor[0] * anchor[2];
                c2 = rgbAnchor[0] * anchor[1] - rgbAnchor[1] * anchor[0];
                inflection = rgbAnchor[2] / rgbAnchor[0];
                tmp = lms[2] / lms[0];
                /* See which side of the inflection line we fall... */
                if (tmp < inflection)
                    lms[1] = -(a1 * lms[0] + c1 * lms[2]) / b1;
                else
                    lms[1] = -(a2 * lms[0] + c2 * lms[2]) / b2;
                break;

            case TRITANOPIA:
                a1 = rgbAnchor[1] * anchor[11] - rgbAnchor[2] * anchor[10];
                b1 = rgbAnchor[2] * anchor[9] - rgbAnchor[0] * anchor[11];
                c1 = rgbAnchor[0] * anchor[10] - rgbAnchor[1] * anchor[9];
                a2 = rgbAnchor[1] * anchor[5] - rgbAnchor[2] * anchor[4];
                b2 = rgbAnchor[2] * anchor[3] - rgbAnchor[0] * anchor[5];
                c2 = rgbAnchor[0] * anchor[4] - rgbAnchor[1] * anchor[3];
                inflection = (rgbAnchor[1] / rgbAnchor[0]);
                tmp = lms[1] / lms[0];
                if (tmp < inflection)
                    lms[2] = -(a1 * lms[0] + b1 * lms[1]) / c1;
                else
                    lms[2] = -(a2 * lms[0] + b2 * lms[1]) / c2;
                break;

            default:
                break;
        }
        double[] rgbCb = mult3(lmsToRgb, lms);

        double nr = Math.min(255.0, Math.max(0.0, rgbCb[0]));
        double ng = Math.min(255.0, Math.max(0.0, rgbCb[1]));
        double nb = Math.min(255.0, Math.max(0.0, rgbCb[2]));
        return new Color((int) nr, (int) ng, (int) nb);
    }

    /**
     * Multiplies the specified 3x3 matrix by the specified 3x1 vector.
     *
     * @param matrix Matrix.
     * @param vector Vector.
     * @return Vector multiplication.
     */
    private static double[] mult3(double[][] matrix, double[] vector) {
        double[] res = new double[3];
        res[0] = matrix[0][0] * vector[0] + matrix[0][1] * vector[1]
                + matrix[0][2] * vector[2];
        res[1] = matrix[1][0] * vector[0] + matrix[1][1] * vector[1]
                + matrix[1][2] * vector[2];
        res[2] = matrix[2][0] * vector[0] + matrix[2][1] * vector[1]
                + matrix[2][2] * vector[2];
        return res;
    }

    @Override
    public Color getForegroundColor() {
        return this.foregroundColor;
    }

    @Override
    public Color getUltraLightColor() {
        return this.mainUltraLightColor;
    }

    @Override
    public Color getExtraLightColor() {
        return this.mainExtraLightColor;
    }

    @Override
    public Color getLightColor() {
        return this.mainLightColor;
    }

    @Override
    public Color getMidColor() {
        return this.mainMidColor;
    }

    @Override
    public Color getDarkColor() {
        return this.mainDarkColor;
    }

    @Override
    public Color getUltraDarkColor() {
        return this.mainUltraDarkColor;
    }

    /**
     * Returns the original color scheme.
     *
     * @return The original color scheme.
     */
    public RadianceColorScheme getOrigScheme() {
        return this.origScheme;
    }

    /**
     * Blindness kind.
     *
     * @author Kirill Grouchnikov
     */
    public enum BlindnessKind {
        /**
         * Protanopia color blindness.
         */
        PROTANOPIA,

        /**
         * Deuteranopia color blindness.
         */
        DEUTERANOPIA,

        /**
         * Tritanopia color blindness.
         */
        TRITANOPIA
    }
}
