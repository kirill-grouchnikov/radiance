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
package org.pushingpixels.radiance.theming.extras.api.skinpack;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.decorator.RadianceDecorators;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FractionBasedOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FlatSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.GlassSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;
import org.pushingpixels.radiance.theming.api.palette.TokenPaletteColorResolverUtils;
import org.pushingpixels.radiance.theming.api.shaper.ClassicComponentShaper;

/**
 * <code>Streelights</code> skin. This class is part of officially supported
 * API.
 *
 * @author Kirill Grouchnikov
 */
public class StreetlightsSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Streetlights";

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public StreetlightsSkin() {
        ContainerColorTokens streetlightsDefaultMutedTokens = ContainerColorTokensUtils.getDuotoneContainerTokens(
            /* seedContainer */ Hct.fromInt(0xFF052914),
            /* seedOnContainer */ Hct.fromInt(0xFFC4ECCB),
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ true,
                /* contrastLevel */ 1.0),
            /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver());

        ContainerColorTokens streetlightsDefaultNeutralTokens = ContainerColorTokensUtils.getDuotoneContainerTokens(
            /* seedContainer */ Hct.fromInt(0xFF252A26),
            /* seedOnContainer */ Hct.fromInt(0xFFC4ECCB),
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ true,
                /* contrastLevel */ 1.0),
            /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver());

        ContainerColorTokensBundle streetlightsDefaultBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFF6000),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 1.0)),
            /* mutedContainerTokens */ streetlightsDefaultMutedTokens,
            /* neutralContainerTokens */ streetlightsDefaultNeutralTokens,
            /* isSystemDark */ true);

        ContainerColorTokens streetlightsHighlightContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFF9000),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 1.0));

        streetlightsDefaultBundle.registerActiveContainerTokens(
            streetlightsHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        this.registerDecorationAreaTokensBundle(streetlightsDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        this.registerAsDecorationArea(
            ContainerColorTokensUtils.getDuotoneContainerTokens(
                /* seedContainer */ Hct.fromInt(0xFF2E332F),
                /* seedOnContainer */ Hct.fromInt(0xFFC4ECCB),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 1.0),
                /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver()),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        this.registerComponentShaper(new ClassicComponentShaper(),
            RadianceThemingSlices.DecorationAreaType.NONE);
        this.surfacePainter = new SpecularRectangularSurfacePainter(new GlassSurfacePainter(), 0.5f);
        this.decorationPainter = new ArcDecorationPainter();

        this.outlinePainter = new FractionBasedOutlinePainter("Streetlights",
            new float[] {0.0f, 1.0f},
            new int[] {80, 80},
            new ContainerColorTokensSingleColorQuery[]{
                ContainerColorTokens::getComplementaryContainerOutline,
                ContainerColorTokens::getComplementaryContainerOutline,
            });

        this.highlightSurfacePainter = new FlatSurfacePainter("Streetlights",
            (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHighest()
                : colorTokens.getContainerSurfaceLowest());
        this.highlightOutlinePainter = new FlatOutlinePainter();

        this.decorators = RadianceDecorators.buildDefault();
    }
}
