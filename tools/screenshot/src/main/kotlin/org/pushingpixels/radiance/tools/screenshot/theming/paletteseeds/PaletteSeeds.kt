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
package org.pushingpixels.radiance.tools.screenshot.theming.paletteseeds

import org.pushingpixels.radiance.theming.api.palette.TonalPaletteSeeds

private val radianceLightColors = mapOf(
    "Aqua" to TonalPaletteSeeds.AQUA,
    "Barby Pink" to TonalPaletteSeeds.BARBY_PINK,
    "Bottle Green" to TonalPaletteSeeds.BOTTLE_GREEN,
    "Brown" to TonalPaletteSeeds.BROWN,
    "Desert Sand" to TonalPaletteSeeds.DESERT_SAND,
    "Lime Green" to TonalPaletteSeeds.LIME_GREEN,
    "Olive" to TonalPaletteSeeds.OLIVE,
    "Orange" to TonalPaletteSeeds.ORANGE,
    "Purple" to TonalPaletteSeeds.PURPLE,
    "Raspberry" to TonalPaletteSeeds.RASPBERRY,
    "Sepia" to TonalPaletteSeeds.SEPIA,
    "Steel Blue" to TonalPaletteSeeds.STEEL_BLUE,
    "Sun Glare" to TonalPaletteSeeds.SUN_GLARE,
    "Sunset" to TonalPaletteSeeds.SUNSET,
    "Terracotta" to TonalPaletteSeeds.TERRACOTTA,
)

private val radianceDarkColors = mapOf(
    "Charcoal" to TonalPaletteSeeds.CHARCOAL,
    "Jade Forest" to TonalPaletteSeeds.JADE_FOREST,
    "Ultramarine" to TonalPaletteSeeds.ULTRAMARINE,
    "Violet" to TonalPaletteSeeds.VIOLET,
)

/**
 * Screenshot robots for Radiance palette seeds.
 *
 * @author Kirill Grouchnikov
 */
class AllLight : LightPaletteSeedRobot(radianceLightColors, "theming/paletteseeds", "Radiance")
class AllDark : DarkPaletteSeedRobot(radianceDarkColors, "theming/paletteseeds", "Radiance")

class EphemeralAllLight : LightPaletteSeedRobot(radianceLightColors, "theming/paletteseeds", "Ephemeral")
class EphemeralAllDark : DarkPaletteSeedRobot(radianceDarkColors, "theming/paletteseeds", "Ephemeral")
