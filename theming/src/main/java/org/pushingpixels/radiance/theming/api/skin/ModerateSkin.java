/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.MetallicColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.SteelBlueColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.*;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineTonalOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.palette.RadianceColorScheme2;
import org.pushingpixels.radiance.theming.api.palette.TonalSkin;
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

    /**
     * Creates a new <code>Moderate</code> skin.
     */
    public ModerateSkin() {
        RadianceColorScheme activeScheme = new SteelBlueColorScheme();
        RadianceColorScheme enabledScheme = new MetallicColorScheme();

        ColorSchemes kitchenSinkSchemes = RadianceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/kitchen-sink.colorschemes"));
        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
                activeScheme, enabledScheme, kitchenSinkSchemes.get("Gray Disabled"));
        RadianceColorScheme highlightColorScheme = kitchenSinkSchemes.get("Moderate Highlight");
        defaultSchemeBundle.registerHighlightColorScheme(highlightColorScheme);

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, RadianceThemingSlices.DecorationAreaType.NONE);

        RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(
                activeScheme.saturate(0.2), activeScheme, kitchenSinkSchemes.get("Gray Disabled"));
        this.registerDecorationAreaSchemeBundle(headerSchemeBundle,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE, RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER);

        this.registerAsDecorationArea(kitchenSinkSchemes.get("LightGray Control Pane Background"),
                RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        this.configureOverlayPainters();

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new SpecularRectangularFillPainter(new GlassFillPainter(), 1.0f);
        this.decorationPainter = new MatteDecorationPainter();
        this.borderPainter = new ClassicBorderPainter();
        this.highlightFillPainter = new ClassicFillPainter();
    }

    void configureOverlayPainters() {
        // add an overlay painter to paint a drop shadow along the top
        // edge of toolbars
        this.addOverlayPainter(TopShadowOverlayPainter.getInstance(100),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint separator lines along the bottom
        // edges of title panes and menu bars
        BottomLineOverlayPainter bottomLineOverlayPainter = new BottomLineOverlayPainter(
            ColorSchemeSingleColorQuery.MID);
        this.addOverlayPainter(bottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public static class ModerateTonalSkin extends ModerateSkin implements TonalSkin {
        public static final String NAME = "Moderate Tonal";

        public ModerateTonalSkin() {
            RadianceColorScheme2 steelBlueColorScheme =
                ColorSchemeUtils.getLightTonalColorScheme(Hct.fromInt(0xFF68A8CF), 28.0, 0.0, 3.0);
            RadianceColorScheme2 steelBlueHighlightColorScheme =
                ColorSchemeUtils.getLightTonalColorScheme(Hct.fromInt(0xFFF1D59A), 2.0, 4.0);

            RadianceColorScheme2 steelBlueHeaderColorScheme =
                ColorSchemeUtils.getLightTonalColorScheme(Hct.fromInt(0xFF6D9BBA), 0.0, 2.0);
            RadianceColorScheme2 steelBlueHeaderHighlightColorScheme =
                ColorSchemeUtils.getLightTonalColorScheme(Hct.fromInt(0xFF679FC3), 42.0, 2.0, 4.0);

            RadianceColorScheme2 controlPaneColorScheme =
                ColorSchemeUtils.getLightTonalColorScheme(Hct.fromInt(0xFFD1D3D7), 2.0, 4.0);

            RadianceColorSchemeBundle2 steelBlueDefaultBundle =
                new RadianceColorSchemeBundle2(steelBlueColorScheme);
            steelBlueDefaultBundle.registerColorScheme(steelBlueHighlightColorScheme,
                RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
                ComponentState.getActiveStates());
            this.registerDecorationAreaSchemeBundle(steelBlueDefaultBundle,
                RadianceThemingSlices.DecorationAreaType.NONE);

            RadianceColorSchemeBundle2 steelBlueHeaderBundle =
                new RadianceColorSchemeBundle2(steelBlueHeaderColorScheme);
            steelBlueHeaderBundle.registerColorScheme(steelBlueHeaderHighlightColorScheme,
                RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
                ComponentState.getActiveStates());
            this.registerDecorationAreaSchemeBundle(steelBlueHeaderBundle,
                steelBlueHeaderBundle.getMainColorScheme().getTonalSurfaceRenderColorTokens(),
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER);

            this.registerAsDecorationArea(
                controlPaneColorScheme.getTonalSurfaceRenderColorTokens(),
                RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

            this.buttonShaper = new ClassicButtonShaper();
            this.fillPainter = new SpecularRectangularFillPainter(new GlassTonalFillPainter(), 1.0f);
            this.borderPainter = new ClassicTonalBorderPainter();
            this.decorationPainter = new MatteDecorationPainter();
            this.highlightFillPainter = new ClassicTonalFillPainter();
        }

        @Override
        void configureOverlayPainters() {
            // add an overlay painter to paint a drop shadow along the top
            // edge of toolbars
            this.addOverlayPainter(TopShadowOverlayPainter.getInstance(100),
                RadianceThemingSlices.DecorationAreaType.TOOLBAR);

            // add an overlay painter to paint separator lines along the bottom
            // edges of title panes and menu bars
            BottomLineTonalOverlayPainter bottomLineOverlayPainter = new BottomLineTonalOverlayPainter(
                ContainerColorTokensSingleColorQuery.CONTAINER_OUTLINE);
            this.addOverlayPainter(bottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);
        }

        @Override
        public String getDisplayName() {
            return ModerateTonalSkin.NAME;
        }
    }
}
