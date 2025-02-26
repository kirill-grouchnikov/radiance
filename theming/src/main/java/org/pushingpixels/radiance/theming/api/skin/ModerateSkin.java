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

import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle2;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.GlassTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineTonalOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Moderate</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class ModerateSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Moderate";

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public ModerateSkin() {
        RadianceColorScheme2 steelBlueColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFF6CA9CE), Hct.fromInt(0xFFDDE2E5), Hct.fromInt(0xFFEFF5FB)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isDark */ false);
        ContainerColorTokens steelBlueHighlightContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFF1D59A),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false);

        RadianceColorScheme2 steelBlueHeaderColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFF6D9BBA), Hct.fromInt(0xFF82ABC7), Hct.fromInt(0xFF8BBAD5)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isPrimaryDark */ false,
            /* isTonalDark */ false,
            /* isMutedDark */ false,
            /* isNeutralDark */ false,
            /* isSystemDark */ false,
            /* primaryContrastLevel */ 0.6f,
            /* tonalContrastLevel */ 0.6f,
            /* mutedContrastLevel */ 0.6f,
            /* neutralContrastLevel */ 0.6f,
            /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver());
        ContainerColorTokens steelBlueHeaderHighlightContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF6EA7CA),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false);

        RadianceColorScheme2 controlPaneColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFFD1D3D7), Hct.fromInt(0xFFDDE2E5), Hct.fromInt(0xFFEFF5FB)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isDark */ false);

        RadianceColorSchemeBundle2 steelBlueDefaultBundle =
            new RadianceColorSchemeBundle2(steelBlueColorScheme);
        steelBlueDefaultBundle.registerActiveContainerTokens(steelBlueHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        this.registerDecorationAreaSchemeBundle(steelBlueDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        RadianceColorSchemeBundle2 steelBlueHeaderBundle =
            new RadianceColorSchemeBundle2(steelBlueHeaderColorScheme);
        steelBlueHeaderBundle.registerActiveContainerTokens(steelBlueHeaderHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        this.registerDecorationAreaSchemeBundle(steelBlueHeaderBundle,
            steelBlueHeaderBundle.getMainColorScheme().getExtendedTonalContainerTokens(),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        this.registerAsDecorationArea(
            controlPaneColorScheme.getExtendedTonalContainerTokens(),
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        // add an overlay painter to paint a drop shadow along the top
        // edge of toolbars
        this.addOverlayPainter(TopShadowOverlayPainter.getInstance(100),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint separator lines along the bottom
        // edges of title panes and menu bars
        BottomLineTonalOverlayPainter bottomLineOverlayPainter = new BottomLineTonalOverlayPainter(
            ContainerColorTokens::getContainerOutline);
        this.addOverlayPainter(bottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new SpecularRectangularFillPainter(new GlassTonalFillPainter(), 1.0f);
        this.borderPainter = new ClassicTonalBorderPainter();
        this.decorationPainter = new MatteDecorationPainter();
        this.highlightFillPainter = new ClassicTonalFillPainter();
    }
}
