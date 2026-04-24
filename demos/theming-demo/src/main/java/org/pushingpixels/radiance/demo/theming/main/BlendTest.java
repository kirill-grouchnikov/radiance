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
package org.pushingpixels.radiance.demo.theming.main;

import org.pushingpixels.ephemeral.chroma.blend.Blend;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.utils.MathUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

import java.awt.*;

public class BlendTest {
    public static int harmonizeAll(int designColor, int sourceColor, double amount) {
        Hct fromHct = Hct.fromInt(designColor);
        Hct toHct = Hct.fromInt(sourceColor);
        double differenceDegrees = MathUtils.differenceDegrees(fromHct.getHue(), toHct.getHue());
        double rotationDegrees = differenceDegrees * amount;
        double outputHue =
            MathUtils.sanitizeDegreesDouble(
                fromHct.getHue()
                    + rotationDegrees * MathUtils.rotationDirection(fromHct.getHue(), toHct.getHue()));
        double outputChroma = fromHct.getChroma() * (1.0 - amount) + toHct.getChroma() * amount;
        double outputTone = fromHct.getTone() * (1.0 - amount) + toHct.getTone() * amount;
        return Hct.from(outputHue, outputChroma, outputTone).toInt();

    }

    public static void main(String[] args) {
        Color to = new Color(0xFFB0BBBE);
        Color from = new Color(0xFFFFE000);

        Hct fromHct = Hct.fromInt(from.getRGB());
        Hct toHct = Hct.fromInt(to.getRGB());

        for (int i = 0; i <= 10; i++) {
            int interpolated = harmonizeAll(toHct.toInt(), fromHct.toInt(), i / 10.0);
            int interpolated2 = harmonizeAll(fromHct.toInt(), toHct.toInt(), i / 10.0);

            Hct intHct = Hct.fromInt(interpolated);
            Color intColor = new Color(intHct.toInt());
            Hct intHct2 = Hct.fromInt(interpolated2);
            Color intColor2 = new Color(intHct2.toInt());

            System.out.println("" + i / 10.0 + " " + RadianceColorUtilities.encode(intColor) + ", hue " + intHct.getTone() + ", chroma " + intHct.getChroma());
            System.out.println("\t" + RadianceColorUtilities.encode(intColor2) + ", hue " + intHct2.getTone() + ", chroma " + intHct2.getChroma());
        }

    }
}
