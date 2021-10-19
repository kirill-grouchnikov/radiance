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
package org.pushingpixels.radiance.tools.screenshot.theming.schemes

import org.pushingpixels.radiance.theming.api.colorscheme.*
import java.awt.Color

/**
 * Screenshot robots for Radiance color schemes.
 *
 * @author Kirill Grouchnikov
 */
class AquaScheme : ColorSchemeRobot(AquaColorScheme(), "theming/colorschemes/aqua.png")
class BarbyPinkScheme : ColorSchemeRobot(BarbyPinkColorScheme(), "theming/colorschemes/barby-pink.png")
class BottleGreenScheme : ColorSchemeRobot(BottleGreenColorScheme(), "theming/colorschemes/bottle-green.png")
class BrownScheme : ColorSchemeRobot(BrownColorScheme(), "theming/colorschemes/brown.png")
class CharcoalScheme : ColorSchemeRobot(CharcoalColorScheme(), "theming/colorschemes/charcoal.png")
class CremeScheme : ColorSchemeRobot(CremeColorScheme(), "theming/colorschemes/creme.png")
class DarkVioletScheme : ColorSchemeRobot(DarkVioletColorScheme(), "theming/colorschemes/dark-violet.png")
class DesertSandScheme : ColorSchemeRobot(DesertSandColorScheme(), "theming/colorschemes/desert-sand.png")
class EbonyScheme : ColorSchemeRobot(EbonyColorScheme(), "theming/colorschemes/ebony.png")
class JadeForestScheme : ColorSchemeRobot(JadeForestColorScheme(), "theming/colorschemes/jade-forest.png")
class LightAquaScheme : ColorSchemeRobot(LightAquaColorScheme(), "theming/colorschemes/light-aqua.png")
class LimeGreenScheme : ColorSchemeRobot(LimeGreenColorScheme(), "theming/colorschemes/lime-green.png")
class OliveScheme : ColorSchemeRobot(OliveColorScheme(), "theming/colorschemes/olive.png")
class OrangeScheme : ColorSchemeRobot(OrangeColorScheme(), "theming/colorschemes/orange.png")
class PurpleScheme : ColorSchemeRobot(PurpleColorScheme(), "theming/colorschemes/purple.png")
class RaspberryScheme : ColorSchemeRobot(RaspberryColorScheme(), "theming/colorschemes/raspberry.png")
class SepiaScheme : ColorSchemeRobot(SepiaColorScheme(), "theming/colorschemes/sepia.png")
class SteelBlueScheme : ColorSchemeRobot(SteelBlueColorScheme(), "theming/colorschemes/steel-blue.png")
class SunGlareScheme : ColorSchemeRobot(SunGlareColorScheme(), "theming/colorschemes/sun-glare.png")
class SunsetScheme : ColorSchemeRobot(SunsetColorScheme(), "theming/colorschemes/sunset.png")
class TerracottaScheme : ColorSchemeRobot(TerracottaColorScheme(), "theming/colorschemes/terracotta.png")
class UltramarineScheme : ColorSchemeRobot(UltramarineColorScheme(), "theming/colorschemes/ultramarine.png")

class DerivedDesaturatedScheme : ColorSchemeRobot(
    PurpleColorScheme().saturate(-0.4),
        "theming/colorschemes/derived-desaturate.png")
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
