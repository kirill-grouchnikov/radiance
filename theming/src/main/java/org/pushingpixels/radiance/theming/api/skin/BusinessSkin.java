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
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.ContainerColorTokensBundle;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;

/**
 * <code>Business</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class BusinessSkin extends BusinessAccentedSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Business";

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public BusinessSkin() {
        super(new AccentBuilder()
            .withDefaultAreaActiveTokens(ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFEAEDF3),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()))
            .withDefaultAreaMutedTokens(ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFC4C8CC),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()))
            .withDefaultAreaNeutralTokens(ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFE4EAF0),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()))
            .withDefaultAreaHighlightTokens(ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFEBD296),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()))
            .withHeaderAreaActiveTokens(ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFEAEDF3),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()))
            .withHeaderAreaMutedTokens(ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFDEDDDF),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()))
            .withHeaderAreaNeutralTokens(ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFBDC8D3),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()))
            .withHeaderAreaHighlightTokens(ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFEBD296),
                /* containerConfiguration */ ContainerConfiguration.defaultLight())));

        ContainerColorTokensBundle businessControlPaneBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFEAEDF3),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFC4C8CC),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFD4D9DF),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* isSystemDark */ false);
        businessControlPaneBundle.registerActiveContainerTokens(
            this.getDefaultAreaHighlightTokens(),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        this.registerDecorationAreaTokensBundle(businessControlPaneBundle,
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        ContainerColorTokensBundle businessFooterBundle =
            new ContainerColorTokensBundle(this.getHeaderAreaActiveTokens(),
                this.getHeaderAreaMutedTokens(), this.getHeaderAreaNeutralTokens(),
                this.isHeaderDark());
        businessFooterBundle.registerActiveContainerTokens(
            this.getDefaultAreaHighlightTokens(),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        this.registerDecorationAreaTokensBundle(businessFooterBundle,
            RadianceThemingSlices.DecorationAreaType.FOOTER);
    }

    @Override
    protected boolean isHeaderDark() {
        return false;
    }
}
