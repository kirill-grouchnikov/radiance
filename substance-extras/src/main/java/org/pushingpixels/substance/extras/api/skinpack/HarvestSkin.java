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

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

/**
 * <code>Harvest</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class HarvestSkin extends SubstanceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Harvest";

    /**
     * Creates a new <code>Harvest</code> skin.
     */
    public HarvestSkin() {
        ColorSchemes schemes = SubstanceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/substance/extras/api/skinpack/harvest.colorschemes"));
        SubstanceColorScheme activeScheme = schemes.get("Harvest Active");
        SubstanceColorScheme enabledScheme = schemes.get("Harvest Enabled");
        SubstanceColorScheme disabledScheme = schemes.get("Harvest Disabled");
        SubstanceColorScheme disabledSelectedScheme = schemes.get("Harvest Disabled Selected");

        SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);
        defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);

        SubstanceColorScheme selectedScheme = schemes.get("Harvest Selected");
        SubstanceColorScheme rolloverSelectedScheme = schemes.get("Harvest Rollover Selected");
        defaultSchemeBundle.registerColorScheme(selectedScheme, ComponentState.SELECTED);
        defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme, ComponentState.ROLLOVER_SELECTED);
        defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledSelectedScheme, ComponentState.DISABLED_SELECTED);

        // borders
        SubstanceColorScheme borderActiveScheme = schemes.get("Harvest Border Active");
        defaultSchemeBundle.registerColorScheme(borderActiveScheme, ColorSchemeAssociationKind.BORDER,
                ComponentState.getActiveStates());
        defaultSchemeBundle.registerColorScheme(borderActiveScheme, ColorSchemeAssociationKind.BORDER,
                ComponentState.DISABLED_SELECTED);
        SubstanceColorScheme borderScheme = schemes.get("Harvest Border");
        defaultSchemeBundle.registerColorScheme(borderScheme, ColorSchemeAssociationKind.BORDER);

        // marks
        SubstanceColorScheme markScheme = schemes.get("Harvest Mark");
        defaultSchemeBundle.registerColorScheme(markScheme, ColorSchemeAssociationKind.MARK);

        // separators
        SubstanceColorScheme separatorScheme = schemes.get("Harvest Separator");
        defaultSchemeBundle.registerColorScheme(separatorScheme, ColorSchemeAssociationKind.SEPARATOR);

        // tab borders
        defaultSchemeBundle.registerColorScheme(schemes.get("Harvest Tab Border"),
                ColorSchemeAssociationKind.TAB_BORDER, ComponentState.getActiveStates());

        // highlights
        SubstanceColorScheme highlightScheme = schemes.get("Harvest Highlight");
        defaultSchemeBundle.registerHighlightColorScheme(highlightScheme);

        SubstanceColorScheme backgroundScheme = schemes.get("Harvest Background");

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, backgroundScheme, DecorationAreaType.NONE);

        // GENERAL area
        SubstanceColorScheme generalBackgroundScheme = schemes.get("Harvest General Background");
        this.registerAsDecorationArea(generalBackgroundScheme, DecorationAreaType.GENERAL);

        // HEADER area
        SubstanceColorScheme activeHeaderScheme = schemes.get("Harvest Header Active");
        SubstanceColorScheme enabledHeaderScheme = schemes.get("Harvest Header Enabled");
        SubstanceColorScheme disabledHeaderScheme = schemes.get("Harvest Header Disabled");
        SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(activeHeaderScheme,
                enabledHeaderScheme, disabledHeaderScheme);
        headerSchemeBundle.registerAlpha(0.7f, ComponentState.DISABLED_UNSELECTED);
        headerSchemeBundle.registerColorScheme(disabledHeaderScheme, ComponentState.DISABLED_UNSELECTED);

        // borders
        SubstanceColorScheme headerBorderScheme = schemes.get("Harvest Header Border");
        headerSchemeBundle.registerColorScheme(headerBorderScheme, ColorSchemeAssociationKind.BORDER);
        // marks
        SubstanceColorScheme headerMarkScheme = schemes.get("Harvest Header Mark");
        headerSchemeBundle.registerColorScheme(headerMarkScheme, ColorSchemeAssociationKind.MARK);
        headerSchemeBundle.registerColorScheme(disabledHeaderScheme, ColorSchemeAssociationKind.MARK,
                ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
        // separators
        SubstanceColorScheme separatorHeaderScheme = schemes.get("Harvest Header Separator");
        headerSchemeBundle.registerColorScheme(separatorHeaderScheme,
                ColorSchemeAssociationKind.SEPARATOR);

        headerSchemeBundle.registerHighlightAlpha(0.85f, ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.ROLLOVER_ARMED, ComponentState.ARMED);
        headerSchemeBundle.registerHighlightAlpha(0.9f, ComponentState.SELECTED);
        headerSchemeBundle.registerHighlightAlpha(1.0f, ComponentState.ROLLOVER_SELECTED);
        headerSchemeBundle.registerHighlightColorScheme(highlightScheme);

        SubstanceColorScheme headerBackgroundScheme = schemes.get("Harvest Header Background");

        this.registerDecorationAreaSchemeBundle(headerSchemeBundle, headerBackgroundScheme,
                DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER, DecorationAreaType.TOOLBAR, DecorationAreaType.FOOTER);

        setTabFadeStart(0.2);
        setTabFadeEnd(0.9);

        // Add overlay painters to paint drop shadow and a dark line along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100), DecorationAreaType.TOOLBAR);
        this.addOverlayPainter(new BottomLineOverlayPainter(
                (SubstanceColorScheme scheme) -> SubstanceColorUtilities.deriveByBrightness(
                        scheme.getUltraDarkColor(), -0.1f)), DecorationAreaType.TOOLBAR);

        // Add overlay painters to paint drop shadow and a dark line along the top
        // edges of footers
        this.addOverlayPainter(TopShadowOverlayPainter.getInstance(15), DecorationAreaType.FOOTER);
        this.addOverlayPainter(new TopLineOverlayPainter(
                (SubstanceColorScheme scheme) -> SubstanceColorUtilities.deriveByBrightness(
                        scheme.getUltraDarkColor(), -0.1f)), DecorationAreaType.FOOTER);

        this.setTabFadeStart(0.18);
        this.setTabFadeEnd(0.18);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new ClassicFillPainter();

        this.decorationPainter = new MatteDecorationPainter();
        this.highlightPainter = new ClassicHighlightPainter();
        this.borderPainter = new ClassicBorderPainter();
    }

    public String getDisplayName() {
        return NAME;
    }
}
