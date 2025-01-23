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
package org.pushingpixels.radiance.theming.api.palette;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import java.awt.*;

public interface RadianceColorScheme2 {
    Color getSurface();

    Color getSurfaceDim();

    Color getSurfaceBright();

    Color getInverseSurface();

    ContainerColorTokens getNeutralContainerTokens();

    ContainerColorTokens getMutedContainerTokens();

    ContainerColorTokens getTonalContainerTokens();

    ContainerColorTokens getPrimaryContainerTokens();

    ContainerColorTokens getActiveContainerTokens();

    ContainerColorTokens getSystemInfoTonalContainerTokens();

    ContainerColorTokens getSystemInfoPrimaryContainerTokens();

    ContainerColorTokens getSystemWarningTonalContainerTokens();

    ContainerColorTokens getSystemWarningPrimaryContainerTokens();

    ContainerColorTokens getSystemErrorTonalContainerTokens();

    ContainerColorTokens getSystemErrorPrimaryContainerTokens();

    ContainerColorTokens getSystemSuccessTonalContainerTokens();

    ContainerColorTokens getSystemSuccessPrimaryContainerTokens();

    ContainerColorTokens getSystemEmergencyTonalContainerTokens();

    ContainerColorTokens getSystemEmergencyPrimaryContainerTokens();

    ContainerColorTokens getContainerTokensForState(ComponentState componentState);

    default ContainerColorTokens getContainerTokens(RadianceThemingSlices.ContainerType containerType) {
        switch (containerType) {
            case MUTED: return this.getMutedContainerTokens();
            case TONAL: return this.getTonalContainerTokens();
            case PRIMARY: return this.getPrimaryContainerTokens();
            case NEUTRAL:
            default: return this.getNeutralContainerTokens();
        }
    }

    default ExtendedContainerColorTokens getExtendedNeutralContainerTokens() {
        return getExtendedContainerTokens(getNeutralContainerTokens());
    }

    default ExtendedContainerColorTokens getExtendedMutedContainerTokens() {
        return getExtendedContainerTokens(getMutedContainerTokens());
    }

    default ExtendedContainerColorTokens getExtendedTonalContainerTokens() {
        return getExtendedContainerTokens(getTonalContainerTokens());
    }

    default ExtendedContainerColorTokens getExtendedPrimaryContainerTokens() {
        return getExtendedContainerTokens(getPrimaryContainerTokens());
    }

    private ExtendedContainerColorTokens getExtendedContainerTokens(
        ContainerColorTokens containerColorTokens) {
        RadianceColorScheme2 me = this;
        return new ExtendedContainerColorTokens() {
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
            public Color getInverseSurface() {
                return me.getInverseSurface();
            }

            @Override
            public ContainerColorTokens getBaseContainerTokens() {
                return containerColorTokens;
            }
        };
    }
}
