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
package org.pushingpixels.substance.extras.api.skinpack;

import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.*;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.fill.GlassFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.extras.api.painterpack.decoration.Glass3DDecorationPainter;
import org.pushingpixels.substance.extras.api.watermarkpack.SubstanceBinaryWatermark;
import org.pushingpixels.substance.internal.colorscheme.SaturatedColorScheme;

import java.awt.*;

/**
 * <code>Field of Wheat</code> skin. This class is part of officially supported
 * API.
 *
 * @author Kirill Grouchnikov
 */
public class FieldOfWheatSkin extends SubstanceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Field of Wheat";

    /**
     * Creates a new <code>Field of Wheat</code> skin.
     */
    public FieldOfWheatSkin() {
        SubstanceColorScheme activeScheme = new AquaColorScheme().saturate(0.1);
        SubstanceColorScheme defaultScheme = new BrownColorScheme();

        SubstanceColorScheme disabledScheme = new SaturatedColorScheme(
                new BrownColorScheme().blendWith(new SunGlareColorScheme(), 0.3), -0.2) {
            Color foreColor = new Color(181, 122, 26);

            @Override
            public Color getForegroundColor() {
                return foreColor;
            }
        };

        SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
                activeScheme, defaultScheme, disabledScheme);
        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                DecorationAreaType.NONE);

        this.watermarkScheme = new SunGlareColorScheme().tone(0.8);

        this.buttonShaper = new ClassicButtonShaper();
        this.watermark = new SubstanceBinaryWatermark();
        this.fillPainter = new GlassFillPainter();
        this.decorationPainter = new Glass3DDecorationPainter();
        this.borderPainter = new ClassicBorderPainter();
        this.highlightPainter = new ClassicHighlightPainter();
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }
}
