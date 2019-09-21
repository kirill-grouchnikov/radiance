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
package org.pushingpixels.substance.api.skin;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.substance.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.*;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

/**
 * <code>Sentinel</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class SentinelSkin extends SubstanceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Sentinel";

    /**
     * Creates a new <code>Sentinel</code> skin.
     */
    public SentinelSkin() {
        ColorSchemes schemes = SubstanceSkin
                .getColorSchemes("org/pushingpixels/substance/api/skin/sentinel.colorschemes");
        SubstanceColorScheme activeScheme = schemes.get("Sentinel Active");
        SubstanceColorScheme enabledScheme = schemes.get("Sentinel Enabled");
        SubstanceColorScheme disabledScheme = schemes.get("Sentinel Disabled");
        SubstanceColorScheme disabledSelectedScheme = schemes.get("Sentinel Disabled Selected");

        SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);
        defaultSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(disabledSelectedScheme, ComponentState.DISABLED_SELECTED);

        // borders
        SubstanceColorScheme borderScheme = schemes.get("Sentinel Border");
        defaultSchemeBundle.registerColorScheme(borderScheme, ColorSchemeAssociationKind.BORDER);

        // marks
        SubstanceColorScheme markScheme = schemes.get("Sentinel Mark");
        defaultSchemeBundle.registerColorScheme(markScheme, ColorSchemeAssociationKind.MARK);

        // separators
        SubstanceColorScheme separatorScheme = schemes.get("Sentinel Separator");
        defaultSchemeBundle.registerColorScheme(separatorScheme, ColorSchemeAssociationKind.SEPARATOR);

        // tab borders
        defaultSchemeBundle.registerColorScheme(schemes.get("Sentinel Tab Border"),
                ColorSchemeAssociationKind.TAB_BORDER, ComponentState.getActiveStates());

        // highlights
        SubstanceColorScheme highlightScheme = schemes.get("Sentinel Highlight");
        defaultSchemeBundle.registerHighlightColorScheme(highlightScheme);

        SubstanceColorScheme backgroundScheme = schemes.get("Sentinel Background");

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, backgroundScheme, DecorationAreaType.NONE);

        SubstanceColorScheme activeDecorationsScheme = schemes.get("Sentinel Decorations Active");
        SubstanceColorScheme enabledDecorationsScheme = schemes.get("Sentinel Decorations Enabled");
        SubstanceColorSchemeBundle decorationsSchemeBundle = new SubstanceColorSchemeBundle(
                activeDecorationsScheme, enabledDecorationsScheme, enabledDecorationsScheme);
        decorationsSchemeBundle.registerAlpha(0.4f, ComponentState.DISABLED_UNSELECTED);
        decorationsSchemeBundle.registerColorScheme(enabledDecorationsScheme, ComponentState.DISABLED_UNSELECTED);

        // borders
        SubstanceColorScheme borderDecorationsScheme = schemes.get("Sentinel Decorations Border");
        decorationsSchemeBundle.registerColorScheme(borderDecorationsScheme, ColorSchemeAssociationKind.BORDER);

        // marks
        SubstanceColorScheme markDecorationsScheme = schemes.get("Sentinel Decorations Mark");
        decorationsSchemeBundle.registerColorScheme(markDecorationsScheme, ColorSchemeAssociationKind.MARK);

        // separators
        SubstanceColorScheme separatorDecorationsScheme = schemes.get("Sentinel Decorations Separator");
        decorationsSchemeBundle.registerColorScheme(separatorDecorationsScheme,
                ColorSchemeAssociationKind.SEPARATOR);

        SubstanceColorScheme decorationsBackgroundScheme = schemes.get("Sentinel Decorations Background");
        this.registerDecorationAreaSchemeBundle(decorationsSchemeBundle, decorationsBackgroundScheme,
                DecorationAreaType.TOOLBAR, DecorationAreaType.FOOTER);

        SubstanceColorScheme activeGeneralScheme = schemes.get("Sentinel General Active");
        SubstanceColorScheme enabledGeneralScheme = schemes.get("Sentinel General Enabled");
        SubstanceColorSchemeBundle generalSchemeBundle = new SubstanceColorSchemeBundle(
                activeGeneralScheme, enabledGeneralScheme, enabledGeneralScheme);
        generalSchemeBundle.registerAlpha(0.4f, ComponentState.DISABLED_UNSELECTED);
        generalSchemeBundle.registerColorScheme(enabledGeneralScheme, ComponentState.DISABLED_UNSELECTED);

        // borders
        SubstanceColorScheme borderGeneralScheme = schemes.get("Sentinel General Border");
        generalSchemeBundle.registerColorScheme(borderGeneralScheme, ColorSchemeAssociationKind.BORDER);

        // marks
        SubstanceColorScheme markGeneralScheme = schemes.get("Sentinel General Mark");
        generalSchemeBundle.registerColorScheme(markGeneralScheme, ColorSchemeAssociationKind.MARK,
                ComponentState.getActiveStates());

        // separators
        SubstanceColorScheme separatorGeneralScheme = schemes.get("Sentinel General Separator");
        generalSchemeBundle.registerColorScheme(separatorGeneralScheme,
                ColorSchemeAssociationKind.SEPARATOR);
        SubstanceColorScheme generalBackgroundScheme = schemes.get("Sentinel General Background");
        this.registerDecorationAreaSchemeBundle(generalSchemeBundle, generalBackgroundScheme,
                DecorationAreaType.GENERAL);

        SubstanceColorScheme activeHeaderScheme = schemes.get("Sentinel Header Active");
        SubstanceColorScheme enabledHeaderScheme = schemes.get("Sentinel Header Enabled");
        SubstanceColorScheme disabledHeaderScheme = schemes.get("Sentinel Header Disabled");
        SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(activeHeaderScheme,
                enabledHeaderScheme, disabledHeaderScheme);
        headerSchemeBundle.registerAlpha(0.95f, ComponentState.DISABLED_UNSELECTED);
        headerSchemeBundle.registerColorScheme(disabledHeaderScheme, ComponentState.DISABLED_UNSELECTED);

        // borders
        SubstanceColorScheme headerBorderScheme = schemes.get("Sentinel Header Border");
        headerSchemeBundle.registerColorScheme(headerBorderScheme, ColorSchemeAssociationKind.BORDER);
        // marks
        SubstanceColorScheme headerMarkScheme = schemes.get("Sentinel Header Mark");
        headerSchemeBundle.registerColorScheme(headerMarkScheme, ColorSchemeAssociationKind.MARK);
        headerSchemeBundle.registerColorScheme(disabledHeaderScheme, ColorSchemeAssociationKind.MARK,
                ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
        // separators
        SubstanceColorScheme separatorHeaderScheme = schemes.get("Sentinel Header Separator");
        headerSchemeBundle.registerColorScheme(separatorHeaderScheme,
                ColorSchemeAssociationKind.SEPARATOR);

        headerSchemeBundle.registerHighlightAlpha(0.85f, ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.ROLLOVER_ARMED, ComponentState.ARMED);
        headerSchemeBundle.registerHighlightAlpha(0.9f, ComponentState.SELECTED);
        headerSchemeBundle.registerHighlightAlpha(1.0f, ComponentState.ROLLOVER_SELECTED);
        headerSchemeBundle.registerHighlightColorScheme(highlightScheme);

        SubstanceColorScheme headerBackgroundScheme = schemes.get("Sentinel Header Background");

        this.registerDecorationAreaSchemeBundle(headerSchemeBundle, headerBackgroundScheme,
                DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER);

        setTabFadeStart(0.2);
        setTabFadeEnd(0.9);

        // Add overlay painters to paint drop shadow and a dark line along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(), DecorationAreaType.TOOLBAR);
        this.addOverlayPainter( new BottomLineOverlayPainter(
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
        this.watermark = null;
        this.fillPainter = new ClassicFillPainter();
        this.decorationPainter = new MatteDecorationPainter();
        this.highlightPainter = new ClassicHighlightPainter();
        this.borderPainter = new ClassicBorderPainter();
    }

    public String getDisplayName() {
        return NAME;
    }
}
