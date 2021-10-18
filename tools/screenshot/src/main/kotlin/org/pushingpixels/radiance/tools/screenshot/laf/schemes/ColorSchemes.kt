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
package org.pushingpixels.radiance.tools.screenshot.laf.schemes

import org.pushingpixels.radiance.laf.api.colorscheme.*
import java.awt.Color

/**
 * Screenshot robots for Substance color schemes.
 *
 * @author Kirill Grouchnikov
 */
class AquaScheme : ColorSchemeRobot(AquaColorScheme(), "laf/colorschemes/aqua.png")
class BarbyPinkScheme : ColorSchemeRobot(BarbyPinkColorScheme(), "laf/colorschemes/barby-pink.png")
class BottleGreenScheme : ColorSchemeRobot(BottleGreenColorScheme(), "laf/colorschemes/bottle-green.png")
class BrownScheme : ColorSchemeRobot(BrownColorScheme(), "laf/colorschemes/brown.png")
class CharcoalScheme : ColorSchemeRobot(CharcoalColorScheme(), "laf/colorschemes/charcoal.png")
class CremeScheme : ColorSchemeRobot(CremeColorScheme(), "laf/colorschemes/creme.png")
class DarkVioletScheme : ColorSchemeRobot(DarkVioletColorScheme(), "laf/colorschemes/dark-violet.png")
class DesertSandScheme : ColorSchemeRobot(DesertSandColorScheme(), "laf/colorschemes/desert-sand.png")
class EbonyScheme : ColorSchemeRobot(EbonyColorScheme(), "laf/colorschemes/ebony.png")
class JadeForestScheme : ColorSchemeRobot(JadeForestColorScheme(), "laf/colorschemes/jade-forest.png")
class LightAquaScheme : ColorSchemeRobot(LightAquaColorScheme(), "laf/colorschemes/light-aqua.png")
class LimeGreenScheme : ColorSchemeRobot(LimeGreenColorScheme(), "laf/colorschemes/lime-green.png")
class OliveScheme : ColorSchemeRobot(OliveColorScheme(), "laf/colorschemes/olive.png")
class OrangeScheme : ColorSchemeRobot(OrangeColorScheme(), "laf/colorschemes/orange.png")
class PurpleScheme : ColorSchemeRobot(PurpleColorScheme(), "laf/colorschemes/purple.png")
class RaspberryScheme : ColorSchemeRobot(RaspberryColorScheme(), "laf/colorschemes/raspberry.png")
class SepiaScheme : ColorSchemeRobot(SepiaColorScheme(), "laf/colorschemes/sepia.png")
class SteelBlueScheme : ColorSchemeRobot(SteelBlueColorScheme(), "laf/colorschemes/steel-blue.png")
class SunGlareScheme : ColorSchemeRobot(SunGlareColorScheme(), "laf/colorschemes/sun-glare.png")
class SunsetScheme : ColorSchemeRobot(SunsetColorScheme(), "laf/colorschemes/sunset.png")
class TerracottaScheme : ColorSchemeRobot(TerracottaColorScheme(), "laf/colorschemes/terracotta.png")
class UltramarineScheme : ColorSchemeRobot(UltramarineColorScheme(), "laf/colorschemes/ultramarine.png")

class DerivedDesaturatedScheme : ColorSchemeRobot(
    PurpleColorScheme().saturate(-0.4),
        "laf/colorschemes/derived-desaturate.png")
class DerivedHueShiftedScheme : ColorSchemeRobot(
    PurpleColorScheme().hueShift(0.4),
        "laf/colorschemes/derived-hueshift.png")
class DerivedInvertedScheme : ColorSchemeRobot(
    PurpleColorScheme().invert(), "laf/colorschemes/derived-invert.png")
class DerivedNegatedScheme : ColorSchemeRobot(
    PurpleColorScheme().negate(), "laf/colorschemes/derived-negate.png")
class DerivedSaturatedScheme : ColorSchemeRobot(
    PurpleColorScheme().saturate(0.4),
        "laf/colorschemes/derived-saturate.png")
class DerivedShadedScheme : ColorSchemeRobot(
    PurpleColorScheme().shade(0.4), "laf/colorschemes/derived-shaded.png")
class DerivedShiftedBackgroundScheme : ColorSchemeRobot(
    PurpleColorScheme()
        .shiftBackground(Color(255, 128, 128), 0.8),
        "laf/colorschemes/derived-shiftedbackground.png")
class DerivedShiftedScheme : ColorSchemeRobot(
    PurpleColorScheme()
        .shift(Color(128, 255, 128), 0.8,
        Color(128, 0, 0), 0.7), "laf/colorschemes/derived-shifted.png")
class DerivedTintedScheme : ColorSchemeRobot(
    PurpleColorScheme().tint(0.4), "laf/colorschemes/derived-tinted.png")
class DerivedTonedScheme : ColorSchemeRobot(
    PurpleColorScheme().tone(0.4), "laf/colorschemes/derived-toned.png")
