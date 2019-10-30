/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.tools.zodiac.substance

import org.pushingpixels.substance.api.SubstanceColorSchemeBundle
import org.pushingpixels.substance.api.SubstanceSkin
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery
import org.pushingpixels.substance.api.colorscheme.LightGrayColorScheme
import org.pushingpixels.substance.api.colorscheme.MetallicColorScheme
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter
import org.pushingpixels.substance.api.painter.decoration.ArcDecorationPainter
import org.pushingpixels.substance.api.painter.decoration.MarbleNoiseDecorationPainter
import org.pushingpixels.substance.api.painter.fill.ClassicFillPainter
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper

/**
 * The default light skin for the docrobot scripts.
 *
 * @author Kirill Grouchnikov
 */
class RobotDefaultSkin(colorScheme: SubstanceColorScheme) : SubstanceSkin() {

    init {
        val defaultSchemeBundle = SubstanceColorSchemeBundle(
                colorScheme, MetallicColorScheme(),
                LightGrayColorScheme())
        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                DecorationAreaType.NONE)

        this.registerAsDecorationArea(colorScheme,
                DecorationAreaType.PRIMARY_TITLE_PANE,
                DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER)

        val bottomLineOverlayPainter = BottomLineOverlayPainter(
                ColorSchemeSingleColorQuery.MID)
        this.addOverlayPainter(bottomLineOverlayPainter,
                DecorationAreaType.PRIMARY_TITLE_PANE,
                DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER)

        this.buttonShaper = ClassicButtonShaper()
        this.fillPainter = ClassicFillPainter()
        this.borderPainter = ClassicBorderPainter()

        val decorationPainter = MarbleNoiseDecorationPainter()
        decorationPainter.setBaseDecorationPainter(ArcDecorationPainter())
        decorationPainter.setTextureAlpha(0.3f)
        this.decorationPainter = decorationPainter

        this.highlightPainter = ClassicHighlightPainter()
        this.borderPainter = ClassicBorderPainter()
    }

    override fun getDisplayName(): String {
        return NAME
    }

    companion object {
        /**
         * Display name for `this` skin.
         */
        var NAME = "Robot Default"
    }
}
