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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.ephemeral.chroma.hct.Hct;

import java.awt.*;

public class RadianceTonalColorUtilities {
    /**
     * Returns lighter version of the specified color.
     *
     * @param color Color.
     * @param diff  Difference factor (values closer to 1.0 will produce results
     *              closer to white color).
     * @return Lighter version of the specified color.
     */
    public static Color getLighterColor(Color color, double diff) {
        Hct hct = Hct.fromInt(color.getRGB());
        return new Color(Hct.from(hct.getHue(), hct.getChroma(),
            100.0 - (100.0 - hct.getTone()) * (1.0 - diff)).toInt());
    }

    /**
     * Returns darker version of the specified color.
     *
     * @param color Color.
     * @param diff  Difference factor (values closer to 1.0 will produce results
     *              closer to black color).
     * @return Darker version of the specified color.
     */
    public static Color getDarkerColor(Color color, double diff) {
        Hct hct = Hct.fromInt(color.getRGB());
        return new Color(Hct.from(hct.getHue(), hct.getChroma(), hct.getTone() * (1.0 - diff)).toInt());
    }

    /**
     * Returns a desaturated version of the specified color.
     *
     * @param color  Color.
     * @param factor Desaturation factor (values closer to 1.0 will produce results closer to
     *               fully monochromatic color).
     * @return Desaturated version of the specified color.
     */
    public static Color getDesaturatedColor(Color color, double factor) {
        Hct hct = Hct.fromInt(color.getRGB());
        return new Color(Hct.from(hct.getHue(), hct.getChroma() * (1.0 - factor), hct.getTone()).toInt());
    }
}
