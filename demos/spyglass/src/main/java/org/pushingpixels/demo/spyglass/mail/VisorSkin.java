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
package org.pushingpixels.demo.spyglass.mail;

import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.*;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.*;
import org.pushingpixels.substance.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.substance.api.painter.highlight.FractionBasedHighlightPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

public class VisorSkin extends SubstanceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Visor";

    /**
     * Creates a new <code>Visor</code> skin.
     */
    public VisorSkin() {
        ColorSchemes visorSchemes = SubstanceSkin
                .getColorSchemes("org/pushingpixels/demo/spyglass/mail/skin/visor.colorschemes");

        SubstanceColorScheme activeScheme = visorSchemes.get("Visor Active");
        SubstanceColorScheme enabledScheme = visorSchemes.get("Visor Enabled");
        SubstanceColorScheme disabledScheme = visorSchemes.get("Visor Disabled");

        SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);

        defaultSchemeBundle.registerColorScheme(activeScheme, 0.5f,
                ComponentState.DISABLED_SELECTED);
        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.NONE);

        SubstanceColorScheme activeDestinationsScheme =
                visorSchemes.get("Visor Active Destinations");
        SubstanceColorScheme enabledDestinationsScheme =
                visorSchemes.get("Visor Enabled Destinations");
        SubstanceColorSchemeBundle destinationsSchemeBundle = new SubstanceColorSchemeBundle(
                activeDestinationsScheme, enabledDestinationsScheme, disabledScheme);
        destinationsSchemeBundle.registerColorScheme(enabledDestinationsScheme, 0.7f,
                ComponentState.DISABLED_UNSELECTED);

        // use SunGlare for destinations highlights
        SubstanceColorScheme destinationsHighlight = new SunGlareColorScheme();
        destinationsSchemeBundle.registerHighlightColorScheme(destinationsHighlight, 0.75f,
                ComponentState.ROLLOVER_UNSELECTED);
        destinationsSchemeBundle.registerHighlightColorScheme(destinationsHighlight, 0.9f,
                ComponentState.SELECTED);
        destinationsSchemeBundle.registerHighlightColorScheme(destinationsHighlight, 1.0f,
                ComponentState.ROLLOVER_SELECTED);
        destinationsSchemeBundle.registerHighlightColorScheme(destinationsHighlight, 0.8f,
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        // use Terracotta for borders of destinations highlights
        destinationsSchemeBundle.registerColorScheme(new TerracottaColorScheme(),
                SubstanceSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
                ComponentState.getActiveStates());

        this.registerDecorationAreaSchemeBundle(destinationsSchemeBundle,
                VisorMail.DESTINATIONS);

        SubstanceColorSchemeBundle threadsSchemeBundle = new SubstanceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);

        threadsSchemeBundle.registerColorScheme(activeScheme, 0.5f,
                ComponentState.DISABLED_SELECTED);
        // Configure white-on-dark-blue highlights for the threads view
        SubstanceColorScheme threadsHighlight = visorSchemes.get("Visor Threads Highlight");
        threadsSchemeBundle.registerHighlightColorScheme(threadsHighlight, 0.75f,
                ComponentState.ROLLOVER_UNSELECTED);
        threadsSchemeBundle.registerHighlightColorScheme(threadsHighlight, 0.9f,
                ComponentState.SELECTED);
        threadsSchemeBundle.registerHighlightColorScheme(threadsHighlight, 1.0f,
                ComponentState.ROLLOVER_SELECTED);
        threadsSchemeBundle.registerHighlightColorScheme(threadsHighlight, 0.8f,
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

        this.registerDecorationAreaSchemeBundle(threadsSchemeBundle, VisorMail.THREADS);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new ClassicFillPainter();
        this.borderPainter = new ClassicBorderPainter();

        BrushedMetalDecorationPainter decorationPainter = new BrushedMetalDecorationPainter();
        decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
        decorationPainter.setTextureAlpha(0.3f);
        this.decorationPainter = decorationPainter;

        this.highlightPainter = new FractionBasedHighlightPainter(
                "Visor Highlight", new float[] { 0.0f, 1.0f },
                new ColorSchemeSingleColorQuery[] { ColorSchemeSingleColorQuery.EXTRALIGHT,
                        ColorSchemeSingleColorQuery.EXTRALIGHT });

        this.borderPainter = new ClassicBorderPainter();
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }
}
