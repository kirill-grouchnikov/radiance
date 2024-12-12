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
package org.pushingpixels.radiance.theming.api.palette;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import java.awt.*;

public interface RadianceColorScheme2 {
    Color getSurface();

    Color getSurfaceDim();

    Color getSurfaceBright();

    ContainerRenderColorTokens getNeutralContainerTokens();

    ContainerRenderColorTokens getMutedContainerTokens();

    ContainerRenderColorTokens getTonalContainerTokens();

    ContainerRenderColorTokens getPrimaryContainerTokens();

    ContainerRenderColorTokens getContainerTokensForState(ComponentState componentState);

    default ExtendedContainerRenderColorTokens getExtendedContainerRenderTokens(ComponentState componentState) {
        RadianceColorScheme2 me = this;
        ContainerRenderColorTokens stateRenderTokens = getContainerTokensForState(componentState);

        return new ExtendedContainerRenderColorTokens() {
            @Override
            public Color getSurface() {
                return me.getSurface();
            }

            @Override
            public Color getSurfaceDim() {
                return me.getSurfaceDim();
            }

            @Override
            public Color getSurfaceBright() {
                return me.getSurfaceBright();
            }

            @Override
            public ContainerRenderColorTokens getSurfaceContainerTokens() {
                return stateRenderTokens;
            }
        };
    }

    default ContainerRenderColorTokens getContainerTokens(RadianceThemingSlices.ContainerType containerType) {
        switch (containerType) {
            case MUTED: return this.getMutedContainerTokens();
            case TONAL: return this.getTonalContainerTokens();
            case PRIMARY: return this.getPrimaryContainerTokens();
            case NEUTRAL:
            default: return this.getNeutralContainerTokens();
        }
    }

    ContainerRenderColorTokens getSystemInfoContainerTokens();

    ContainerRenderColorTokens getSystemWarningContainerTokens();

    ContainerRenderColorTokens getSystemErrorContainerTokens();

    ContainerRenderColorTokens getSystemSuccessContainerTokens();

    ContainerRenderColorTokens getSystemEmergencyContainerTokens();

    default ExtendedContainerRenderColorTokens getExtendedContainerTokens(RadianceThemingSlices.ContainerType containerType) {
        switch (containerType) {
            case MUTED: return this.getExtendedMutedContainerTokens();
            case TONAL: return this.getExtendedTonalContainerTokens();
            case PRIMARY: return this.getExtendedPrimaryContainerTokens();
            case NEUTRAL:
            default: return this.getExtendedNeutralContainerTokens();
        }
    }

    default ExtendedContainerRenderColorTokens getExtendedNeutralContainerTokens() {
        return getExtendedContainerTokens(getNeutralContainerTokens());
    }

    default ExtendedContainerRenderColorTokens getExtendedMutedContainerTokens() {
        return getExtendedContainerTokens(getMutedContainerTokens());
    }

    default ExtendedContainerRenderColorTokens getExtendedTonalContainerTokens() {
        return getExtendedContainerTokens(getTonalContainerTokens());
    }

    default ExtendedContainerRenderColorTokens getExtendedPrimaryContainerTokens() {
        return getExtendedContainerTokens(getPrimaryContainerTokens());
    }

    private ExtendedContainerRenderColorTokens getExtendedContainerTokens(
        ContainerRenderColorTokens containerRenderColorTokens) {
        RadianceColorScheme2 me = this;
        return new ExtendedContainerRenderColorTokens() {
            @Override
            public Color getSurface() {
                return me.getSurface();
            }

            @Override
            public Color getSurfaceDim() {
                return me.getSurfaceDim();
            }

            @Override
            public Color getSurfaceBright() {
                return me.getSurfaceBright();
            }

            @Override
            public ContainerRenderColorTokens getSurfaceContainerTokens() {
                return containerRenderColorTokens;
            }
        };
    }
}
