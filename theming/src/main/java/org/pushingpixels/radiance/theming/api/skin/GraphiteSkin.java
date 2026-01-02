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
package org.pushingpixels.radiance.theming.api.skin;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;
import org.pushingpixels.radiance.theming.api.palette.TokenPaletteColorResolver;
import org.pushingpixels.radiance.theming.api.palette.TokenPaletteColorResolverUtils;

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

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public GraphiteSkin() {
        this(TokenPaletteColorResolverUtils.getPaletteColorResolver());
    }

    protected GraphiteSkin(TokenPaletteColorResolver tokenPaletteColorResolver) {
        super(new AccentBuilder()
            .withDefaultAreaPaletteColorResolver(tokenPaletteColorResolver)
            .withDefaultAreaSelectedTokens(ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF606060),
                /* containerConfiguration */ ContainerConfiguration.defaultDark(),
                /* colorResolver */ tokenPaletteColorResolver))
            .withDefaultAreaHighlightTokens(ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFEBECF0),
                /* containerConfiguration */ ContainerConfiguration.defaultLight(),
                /* colorResolver */ tokenPaletteColorResolver)));

        this.graphiteDefaultBundle.registerActiveContainerTokens(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFEBECF0),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6),
                /* colorResolver */ tokenPaletteColorResolver),
            ComponentState.ROLLOVER_UNSELECTED, ComponentState.ROLLOVER_SELECTED,
            ComponentState.ROLLOVER_ARMED);
        this.graphiteDefaultBundle.registerActiveContainerTokens(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFACB2B9),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6),
                /* colorResolver */ tokenPaletteColorResolver),
            ComponentState.PRESSED_UNSELECTED, ComponentState.PRESSED_SELECTED);
    }
}
