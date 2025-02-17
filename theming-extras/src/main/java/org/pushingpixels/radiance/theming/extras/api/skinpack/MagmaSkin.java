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

import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.colorscheme.CharcoalColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.GlassBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.*;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Magma</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class MagmaSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Magma";

    /**
     * Creates a new <code>Magma</code> skin.
     */
    public MagmaSkin() {
        ColorSchemes schemes = RadianceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/extras/api/skinpack/magma.colorschemes"));
        RadianceColorScheme activeScheme = schemes.get("Magma Active");
        RadianceColorScheme enabledScheme = new CharcoalColorScheme();
        RadianceColorScheme disabledScheme = schemes.get("Magma Disabled");

        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);
        defaultSchemeBundle.registerColorScheme(new CharcoalColorScheme(),
                ColorSchemeAssociationKind.BORDER, ComponentState
                        .getActiveStates());
        defaultSchemeBundle.registerColorScheme(activeScheme,
                ColorSchemeAssociationKind.MARK, ComponentState
                        .getActiveStates());
        defaultSchemeBundle.registerAlpha(0.7f, ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme,
                ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);

        defaultSchemeBundle.registerHighlightAlpha(0.7f, ComponentState.ROLLOVER_UNSELECTED);
        defaultSchemeBundle.registerHighlightAlpha(0.7f, ComponentState.SELECTED);
        defaultSchemeBundle.registerHighlightAlpha(0.9f, ComponentState.ROLLOVER_SELECTED);
        defaultSchemeBundle.registerHighlightAlpha(0.7f, ComponentState.ARMED,
                ComponentState.ROLLOVER_ARMED);
        defaultSchemeBundle.registerHighlightColorScheme(activeScheme,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
        defaultSchemeBundle.registerHighlightColorScheme(activeScheme.saturate(-0.2),
                ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

        defaultSchemeBundle.registerColorScheme(schemes.get("Magma Tab Border"),
                RadianceThemingSlices.ColorSchemeAssociationKind.TAB_BORDER, ComponentState.getActiveStates());

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        this.registerAsDecorationArea(enabledScheme,
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER,
            RadianceThemingSlices.DecorationAreaType.FOOTER,
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new SpecularRectangularFillPainter(new GlassFillPainter(), 1.0f);
        this.decorationPainter = new ArcDecorationPainter();

        this.borderPainter = new GlassBorderPainter();
        this.highlightFillPainter = new ClassicFillPainter();
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public static class MagmaTonalSkin extends MagmaSkin implements TonalSkin {
        public static final String NAME = "Magma Tonal";

        public MagmaTonalSkin() {
            SchemeColorResolver defaultSchemeColorResolver = SchemeResolverUtils.getSchemeColorResolver();

            RadianceColorScheme2 magmaColorScheme = ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFFFF4900), Hct.fromInt(0xFF5C0C17), Hct.fromInt(0xFF361215)),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isPrimaryDark */ false,
                /* isTonalDark */ false,
                /* isMutedDark */ true,
                /* isNeutralDark */ true,
                /* isSystemDark */ true,
                /* primaryContrastLevel */ 1.0f,
                /* tonalContrastLevel */ 1.0f,
                /* mutedContrastLevel */ 1.0f,
                /* neutralContrastLevel */ 1.0f,
                /* schemeColorResolver */ defaultSchemeColorResolver);

            ContainerColorTokens magmaHighlightContainerTokens =
                ColorSchemeUtils.getContainerTokens(
                    /* seed */ Hct.fromInt(0xFFFF8000),
                    /* isFidelity */ true,
                    /* isDark */ false,
                    /* contrastLevel */ 1.0f,
                    /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver());

            RadianceColorSchemeBundle2 harvestDefaultBundle =
                new RadianceColorSchemeBundle2(magmaColorScheme);
            harvestDefaultBundle.registerActiveContainerTokens(
                magmaHighlightContainerTokens,
                RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
                ComponentState.getActiveStates());
            this.registerDecorationAreaSchemeBundle(harvestDefaultBundle,
                RadianceThemingSlices.DecorationAreaType.NONE);

            this.registerAsDecorationArea(
                ColorSchemeUtils.getExtendedContainerTokens(
                    /* seed */ Hct.fromInt(0xFF3E101A),
                    /* isFidelity */ true,
                    /* isDark */ true,
                    /* contrastLevel */ 1.0,
                    /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER,
                RadianceThemingSlices.DecorationAreaType.FOOTER,
                RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
                RadianceThemingSlices.DecorationAreaType.TOOLBAR);

            this.buttonShaper = new ClassicButtonShaper();
            this.fillPainter = new SpecularRectangularFillPainter(new GlassTonalFillPainter(), 1.0f);
            this.decorationPainter = new ArcDecorationPainter();

            this.borderPainter = new FractionBasedTonalBorderPainter("Magma",
                new float[] {0.0f, 1.0f},
                new int[] {80, 80},
                new ContainerColorTokensSingleColorQuery[]{
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline,
                });

            this.highlightFillPainter = new ClassicTonalFillPainter();
            this.highlightBorderPainter = new FlatTonalBorderPainter();
        }

        @Override
        public String getDisplayName() {
            return MagmaTonalSkin.NAME;
        }
    }
}
