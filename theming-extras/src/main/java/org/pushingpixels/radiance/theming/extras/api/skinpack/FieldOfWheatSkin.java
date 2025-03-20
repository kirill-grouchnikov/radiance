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
package org.pushingpixels.radiance.theming.extras.api.skinpack;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.GlassSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.MatteSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Field of Wheat</code> skin. This class is part of officially supported
 * API.
 *
 * @author Kirill Grouchnikov
 */
public class FieldOfWheatSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Field of Wheat";

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public FieldOfWheatSkin() {
        RadianceColorSchemeBundle fieldOfWheatDefaultBundle = new RadianceColorSchemeBundle(
            /* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF00BDEA),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 1.0)),
            /* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFDDAB3C),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 1.0)),
            /* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFE8DB83),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 1.0)),
            /* isSystemDark */ false);

        ContainerColorTokens fieldOfWheatHighlightContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF40DDFF),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 1.0));

        fieldOfWheatDefaultBundle.registerActiveContainerTokens(
            fieldOfWheatHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        this.registerDecorationAreaSchemeBundle(fieldOfWheatDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        this.registerAsDecorationArea(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFD59C18),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 1.0)),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        // Add overlay painters to paint drop shadow and a dark line along the bottom
        // edges of headers
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(50),
            RadianceThemingSlices.DecorationAreaType.HEADER);
        this.addOverlayPainter(new BottomLineOverlayPainter(
                ContainerColorTokensSingleColorQuery.composite(
                    ContainerColorTokens::getContainerOutline, ColorTransform.alpha(128))),
            RadianceThemingSlices.DecorationAreaType.HEADER);

        this.buttonShaper = new ClassicButtonShaper();
        this.surfacePainter = new SpecularRectangularSurfacePainter(new GlassSurfacePainter(), 0.5f);
        this.decorationPainter = new ArcDecorationPainter();
        this.outlinePainter = new FlatOutlinePainter();
        this.highlightSurfacePainter = new MatteSurfacePainter();
        this.highlightOutlinePainter = new FlatOutlinePainter();
    }
}
