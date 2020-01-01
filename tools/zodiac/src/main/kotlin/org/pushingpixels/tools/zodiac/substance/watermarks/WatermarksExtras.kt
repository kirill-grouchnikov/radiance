/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.tools.zodiac.substance.watermarks

import org.pushingpixels.substance.extras.api.watermarkpack.*
import org.pushingpixels.substance.extras.api.watermarkpack.flamefractal.SubstanceKaleidoscopeWatermark
import org.pushingpixels.substance.extras.api.watermarkpack.flamefractal.SubstanceScripturesWatermark
import org.pushingpixels.substance.extras.api.watermarkpack.flamefractal.SubstanceSingularityWatermark
import org.pushingpixels.substance.extras.api.watermarkpack.flamefractal.SubstanceVortexWatermark
import org.pushingpixels.tools.zodiac.substance.WatermarkRobot

/**
 * Screenshot robots for Substance extras watermarks.
 *
 * @author Kirill Grouchnikov
 */
class BinaryWatermark : WatermarkRobot(SubstanceBinaryWatermark(), "substance-extras/watermarks/binary.png")
class BrushedMetalWatermark : WatermarkRobot(SubstanceBrushedMetalWatermark(), "substance-extras/watermarks/brushed-metal.png")
class BubblesWatermark : WatermarkRobot(SubstanceBubblesWatermark(), "substance-extras/watermarks/bubbles.png")
class CrosshatchWatermark : WatermarkRobot(SubstanceCrosshatchWatermark(), "substance-extras/watermarks/crosshatch.png")
class ExceedWatermark : WatermarkRobot(SubstanceExceedWatermark(), "substance-extras/watermarks/exceed.png")
class FlameFractalKaleidoscopeWatermark : WatermarkRobot(SubstanceKaleidoscopeWatermark(), "substance-extras/watermarks/flame-fractal-kaleidoscope.png")
class FlameFractalScripturesWatermark : WatermarkRobot(SubstanceScripturesWatermark(), "substance-extras/watermarks/flame-fractal-scriptures.png")
class FlameFractalSingularityWatermark : WatermarkRobot(SubstanceSingularityWatermark(), "substance-extras/watermarks/flame-fractal-singularity.png")
class FlameFractalVortexWatermark : WatermarkRobot(SubstanceVortexWatermark(), "substance-extras/watermarks/flame-fractal-vortex.png")
class KatakanaWatermark : WatermarkRobot(SubstanceKatakanaWatermark(), "substance-extras/watermarks/katakana.png")
class LatchWatermark : WatermarkRobot(SubstanceLatchWatermark(), "substance-extras/watermarks/latch.png")
class MetalWallWatermark : WatermarkRobot(SubstanceMetalWallWatermark(), "substance-extras/watermarks/metal-wall.png")
class MosaicWatermark : WatermarkRobot(SubstanceMosaicWatermark(), "substance-extras/watermarks/mosaic.png")
class NoiseCopperplateEngravingWatermark : WatermarkRobot(SubstanceCopperplateEngravingWatermark(), "substance-extras/watermarks/noise-copperplate-engraving.png")
class NoiseFabricWatermark : WatermarkRobot(SubstanceFabricWatermark(), "substance-extras/watermarks/noise-fabric.png")
class NoiseMagneticFieldWatermark : WatermarkRobot(SubstanceMagneticFieldWatermark(), "substance-extras/watermarks/noise-magnetic-field.png")
class NoiseMarbleVeinWatermark : WatermarkRobot(SubstanceMarbleVeinWatermark(), "substance-extras/watermarks/noise-marble-vein.png")
class NoiseMazeWatermark : WatermarkRobot(SubstanceMazeWatermark(), "substance-extras/watermarks/noise-maze.png")
class NoisePlanktonWatermark : WatermarkRobot(SubstancePlanktonWatermark(), "substance-extras/watermarks/noise-plankton.png")
class NoiseWoodWatermark : WatermarkRobot(SubstanceWoodWatermark(), "substance-extras/watermarks/noise-wood.png")
