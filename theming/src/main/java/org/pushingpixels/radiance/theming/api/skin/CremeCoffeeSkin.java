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
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;

/**
 * <code>Creme Coffee</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class CremeCoffeeSkin extends CremeAccentedSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Creme Coffee";

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public CremeCoffeeSkin() {
        super(new AccentBuilder()
            .withDefaultAreaActiveTokens(ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFDEC59D),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)))
            .withDefaultAreaMutedTokens(ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFF0F1EB),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)))
            .withDefaultAreaNeutralTokens(ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFEEF3E5),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)))
            .withDefaultAreaSelectedTokens(ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFDFBF7F),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()))
            .withDefaultAreaHighlightTokens(ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFE1C591),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.1))));
    }
}
