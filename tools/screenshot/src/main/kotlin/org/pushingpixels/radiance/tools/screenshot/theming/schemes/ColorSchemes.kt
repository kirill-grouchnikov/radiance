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
package org.pushingpixels.radiance.tools.screenshot.theming.schemes

import org.pushingpixels.radiance.theming.api.colorscheme.*
import java.awt.Color

private val radianceColorSchemes = listOf(
    AquaColorScheme(),
    BarbyPinkColorScheme(),
    BottleGreenColorScheme(),
    BrownColorScheme(),
    CharcoalColorScheme(),
    CremeColorScheme(),
    DarkVioletColorScheme(),
    DesertSandColorScheme(),
    EbonyColorScheme(),
    JadeForestColorScheme(),
    LightAquaColorScheme(),
    LimeGreenColorScheme(),
    OliveColorScheme(),
    OrangeColorScheme(),
    PurpleColorScheme(),
    RaspberryColorScheme(),
    SepiaColorScheme(),
    SteelBlueColorScheme(),
    SunGlareColorScheme(),
    SunsetColorScheme(),
    TerracottaColorScheme(),
    UltramarineColorScheme(),
    PurpleColorScheme().saturate(-0.4).named("Derived Desaturate"),
    PurpleColorScheme().saturate(0.4).named("Derived Saturate"),
    PurpleColorScheme().hueShift(0.4).named("Derived HueShift"),
    PurpleColorScheme().shade(0.4).named("Derived Shaded"),
    PurpleColorScheme().tint(0.4).named("Derived Tinted"),
    PurpleColorScheme().tone(0.4).named("Derived Toned"),
    PurpleColorScheme().invert().named("Derived Invert"),
    PurpleColorScheme().negate().named("Derived Negate"),
    PurpleColorScheme()
        .shiftBackground(Color(255, 128, 128), 0.8).named("Derived ShiftedBackground"),
    PurpleColorScheme()
        .shift(Color(128, 255, 128), 0.8, Color(128, 0, 0), 0.7).named("Derived Shifted")
)

/**
 * Screenshot robots for Radiance color schemes.
 *
 * @author Kirill Grouchnikov
 */
class All : ColorSchemeRobot(radianceColorSchemes, "theming/colorschemes", "Radiance")

class EphemeralAll : ColorSchemeRobot(radianceColorSchemes, "theming/colorschemes", "Ephemeral")
