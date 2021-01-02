/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;

/**
 * <code>Graphite</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class GraphiteSkin extends GraphiteAccentedSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Graphite";

    /**
     * Creates a new <code>Graphite</code> skin.
     */
    public GraphiteSkin() {
        super(new AccentBuilder()
                .withAccentResource("org/pushingpixels/substance/api/skin/graphite.colorschemes")
				.withActiveControlsAccent("Graphite Highlight")
				.withHighlightsAccent("Graphite Highlight"));

        // Unlike other accented Graphite skins that use the same highlight appearance on
        // checkboxes and radio buttons as on active renderers, this skin uses a more muted
        // appearance for checkboxes and radio buttons.
        // The following sections remove the accent from those controls and use darker, less
        // vibrant appearance.
        defaultSchemeBundle.registerAlpha(0.65f, ComponentState.DISABLED_SELECTED);
        ColorSchemes schemes = SubstanceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/substance/api/skin/graphite.colorschemes"));
        SubstanceColorScheme highlightMarkScheme = schemes.get("Graphite Highlight Mark");
        defaultSchemeBundle.registerColorScheme(highlightMarkScheme,
                SubstanceSlices.ColorSchemeAssociationKind.HIGHLIGHT_MARK, ComponentState.getActiveStates());
        defaultSchemeBundle.registerColorScheme(highlightMarkScheme,
                SubstanceSlices.ColorSchemeAssociationKind.MARK, ComponentState.ROLLOVER_SELECTED,
                ComponentState.ROLLOVER_UNSELECTED);

        SubstanceColorScheme selectedScheme = schemes.get("Graphite Selected");
        SubstanceColorScheme borderScheme = schemes.get("Graphite Border");
        defaultSchemeBundle.registerColorScheme(selectedScheme, ComponentState.SELECTED);
        defaultSchemeBundle.registerColorScheme(borderScheme, SubstanceSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.SELECTED);

        SubstanceColorScheme selectedDisabledScheme = schemes.get("Graphite Selected Disabled");
        SubstanceColorScheme disabledScheme = schemes.get("Graphite Disabled");
        defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(selectedDisabledScheme, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme, SubstanceSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }
}
