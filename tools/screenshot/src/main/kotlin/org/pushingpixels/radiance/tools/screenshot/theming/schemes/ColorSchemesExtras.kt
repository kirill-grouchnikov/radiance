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
import java.awt.Color

data class RobotConfig(
    val name: String,
    val seed: Color,
    val hueDeltaLow: Double,
    val hueDeltaHigh: Double,
    val headerTextureAlpha: Float)

private val radianceColors = listOf(
    RobotConfig("Belize", TonalPaletteExtrasSeeds.BELIZE, -30.0, 30.0, 0.7f),
    RobotConfig("Bloody Moon", TonalPaletteExtrasSeeds.BLOODY_MOON, -5.0, 5.0, 0.5f),
    RobotConfig("Blue Yonder", TonalPaletteExtrasSeeds.BLUE_YONDER, -25.0, 15.0, 0.5f),
    RobotConfig("Brick Wall", TonalPaletteExtrasSeeds.BRICK_WALL, -15.0, 5.0, 0.5f),
    RobotConfig("Brown Velvet", TonalPaletteExtrasSeeds.BROWN_VELVET, -5.0, 5.0, 0.1f),
    RobotConfig("Cobalt Steel", TonalPaletteExtrasSeeds.COBALT_STEEL, -25.0, 15.0, 0.5f),
    RobotConfig("Desert Mars", TonalPaletteExtrasSeeds.DESERT_MARS, -15.0, 5.0, 0.5f),
    RobotConfig("Earth Fresco", TonalPaletteExtrasSeeds.EARTH_FRESCO, -25.0, 0.0, 0.5f),
    RobotConfig("Emerald Grass", TonalPaletteExtrasSeeds.EMERALD_GRASS, -5.0, 5.0, 0.2f),
    RobotConfig("Fauve Mauve", TonalPaletteExtrasSeeds.FAUVE_MAUVE, 15.0, -20.0, 0.7f),
    RobotConfig("Gooseberry Jungle", TonalPaletteExtrasSeeds.GOOSEBERRY_JUNGLE, -20.0, 40.0, 0.5f),
    RobotConfig("Green Pearl", TonalPaletteExtrasSeeds.GREEN_PEARL, -5.0, 5.0, 0.5f),
    RobotConfig("Mahogany", TonalPaletteExtrasSeeds.MAHOGANY, 0.0, 0.0, 0.2f),
    RobotConfig("Orchid Alloy", TonalPaletteExtrasSeeds.ORCHID_ALLOY, -5.0, 5.0, 0.5f),
    RobotConfig("Peach", TonalPaletteExtrasSeeds.PEACH, -5.0, 5.0, 0.3f),
    RobotConfig("Placid Pink", TonalPaletteExtrasSeeds.PLACID_PINK, 20.0, 0.0, 0.7f),
    RobotConfig("Sky High", TonalPaletteExtrasSeeds.SKY_HIGH, -5.0, 5.0, 0.5f),
    RobotConfig("Spring Leaf", TonalPaletteExtrasSeeds.SPRING_LEAF, -10.0, 15.0, 0.5f),
    RobotConfig("Turquoise Lake", TonalPaletteExtrasSeeds.TURQUOISE_LAKE, 0.0, 0.0, 0.1f),
    RobotConfig("Wild Pine", TonalPaletteExtrasSeeds.WILD_PINE, -20.0, 20.0, 0.5f),
    RobotConfig("Yellow Marine", TonalPaletteExtrasSeeds.YELLOW_MARINE, -40.0, 40.0, 0.5f),
)

class AllExtras : LightBimodalColorSchemeRobot(radianceColors, "theming-extras/colorschemes", "Radiance")
