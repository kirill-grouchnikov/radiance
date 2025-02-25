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
package org.pushingpixels.radiance.tools.screenshot.theming.schemes

import org.pushingpixels.radiance.theming.extras.api.colorschemepack.TonalPaletteExtrasSeeds

private val radianceLightColors = mapOf(
    "Belize" to TonalPaletteExtrasSeeds.BELIZE,
    "Bloody Moon" to TonalPaletteExtrasSeeds.BLOODY_MOON,
    "Blue Yonder" to TonalPaletteExtrasSeeds.BLUE_YONDER,
    "Brick Wall" to TonalPaletteExtrasSeeds.BRICK_WALL,
    "Cobalt Steel" to TonalPaletteExtrasSeeds.COBALT_STEEL,
    "Desert Mars" to TonalPaletteExtrasSeeds.DESERT_MARS,
    "Gooseberry Jungle" to TonalPaletteExtrasSeeds.GOOSEBERRY_JUNGLE,
    "Green Pearl" to TonalPaletteExtrasSeeds.GREEN_PEARL,
    "Orchid Alloy" to TonalPaletteExtrasSeeds.ORCHID_ALLOY,
    "Placid Pink" to TonalPaletteExtrasSeeds.PLACID_PINK,
    "Sky High" to TonalPaletteExtrasSeeds.SKY_HIGH,
    "Spring Leaf" to TonalPaletteExtrasSeeds.SPRING_LEAF,
    "Wild Pine" to TonalPaletteExtrasSeeds.WILD_PINE,
    "Yellow Marine" to TonalPaletteExtrasSeeds.YELLOW_MARINE,
)

private val radianceDarkColors = mapOf(
    "Brown Velvet" to TonalPaletteExtrasSeeds.BROWN_VELVET,
    "Earth Fresco" to TonalPaletteExtrasSeeds.EARTH_FRESCO,
    "Emerald Glass" to TonalPaletteExtrasSeeds.EMERALD_GRASS,
    "Fauve Mauve" to TonalPaletteExtrasSeeds.FAUVE_MAUVE,
    "Mahogany" to TonalPaletteExtrasSeeds.MAHOGANY,
    "Peach" to TonalPaletteExtrasSeeds.PEACH,
    "Turquoise Lake" to TonalPaletteExtrasSeeds.TURQUOISE_LAKE,
)

class AllExtrasLight : LightBimodalColorSchemeRobot(radianceLightColors, "theming-extras/colorschemes", "Radiance")
class AllExtrasDark : DarkColorSchemeRobot(radianceDarkColors, "theming-extras/colorschemes", "Radiance")
