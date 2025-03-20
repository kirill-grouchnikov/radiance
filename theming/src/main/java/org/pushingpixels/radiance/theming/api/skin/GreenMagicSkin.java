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
package org.pushingpixels.radiance.theming.api.skin;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicBimodalPalette;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.BimodalPaletteResolverUtils;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FractionBasedSurfacePainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Green Magic</code> skin. This class is part of officially supported
 * API.
 *
 * @author Kirill Grouchnikov
 */
public class GreenMagicSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Green Magic";

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public GreenMagicSkin() {
        RadianceColorSchemeBundle greenMagicDefaultBundle = new RadianceColorSchemeBundle(
            /* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF00C5A9),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)),
            /* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF8CDFB5),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)),
            /* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFA3ECB9),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)),
            /* isSystemDark */ false);

        ContainerColorTokens greenMagicSelectedContainerTokens =
            ColorSchemeUtils.getBimodalContainerTokens(
                /* seedOne */ Hct.fromInt(0xFF00C6A8),
                /* seedTwo */ Hct.fromInt(0xFF00E68A),
                /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
                /* fidelityTone */ 75.0,  // lighter tone for selected and rollover states
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6),
                /* colorResolver */ BimodalPaletteResolverUtils.getBimodalPaletteColorResolver());
        ContainerColorTokens greenMagicPressedContainerTokens =
            ColorSchemeUtils.getBimodalContainerTokens(
                /* seedOne */ Hct.fromInt(0xFF00BF7F),
                /* seedTwo */ Hct.fromInt(0xFF00B39A),
                /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
                /* fidelityTone */ 65.0,  // darker tone for pressed states
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6),
                /* colorResolver */ BimodalPaletteResolverUtils.getBimodalPaletteColorResolver());

        greenMagicDefaultBundle.registerActiveContainerTokens(greenMagicSelectedContainerTokens,
            ComponentState.SELECTED, ComponentState.ROLLOVER_UNSELECTED,
            ComponentState.ROLLOVER_SELECTED,
            ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        greenMagicDefaultBundle.registerActiveContainerTokens(greenMagicSelectedContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.SELECTED, ComponentState.ROLLOVER_UNSELECTED, ComponentState.ROLLOVER_SELECTED);
        greenMagicDefaultBundle.registerActiveContainerTokens(greenMagicPressedContainerTokens,
            ComponentState.PRESSED_SELECTED, ComponentState.PRESSED_UNSELECTED);
        greenMagicDefaultBundle.registerActiveContainerTokens(greenMagicPressedContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.PRESSED_SELECTED, ComponentState.PRESSED_UNSELECTED);
        this.registerDecorationAreaSchemeBundle(greenMagicDefaultBundle,
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFA3ECB9),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            RadianceThemingSlices.DecorationAreaType.NONE);

        // Headers
        this.registerAsDecorationArea(
            ColorSchemeUtils.getBimodalContainerTokens(
                /* seedOne */ Hct.fromInt(0xFF4ECDAA),
                /* seedTwo */ Hct.fromInt(0xFFA3ECB9),
                /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
                /* fidelityTone */ 85.0,
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6),
                /* colorResolver */ BimodalPaletteResolverUtils.getBimodalPaletteColorResolver()),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        // Footers
        this.registerAsDecorationArea(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF8ADFB5),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        // Add overlay painters to paint drop shadow and a dark line along the bottom
        // edges of headers
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(50),
            RadianceThemingSlices.DecorationAreaType.HEADER);
        this.addOverlayPainter(new BottomLineOverlayPainter(
                ContainerColorTokens::getContainerOutlineVariant),
            RadianceThemingSlices.DecorationAreaType.HEADER);

        this.buttonShaper = new ClassicButtonShaper();
        this.surfacePainter = new FractionBasedSurfacePainter("Green Magic",
            new float[] {0.0f, 0.5f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerSurfaceLowest,
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurface});
        this.outlinePainter = new FlatOutlinePainter();
        this.decorationPainter = new ArcDecorationPainter();
        this.highlightSurfacePainter = new ClassicSurfacePainter();
    }
}
