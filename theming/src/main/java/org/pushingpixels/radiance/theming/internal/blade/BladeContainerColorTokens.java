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
package org.pushingpixels.radiance.theming.internal.blade;

import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;

import java.awt.*;

public class BladeContainerColorTokens implements ContainerColorTokens {
    public boolean isDark = false;
    public Color containerSurfaceLowest = Color.white;
    public Color containerSurfaceLow = Color.white;
    public Color containerSurface = Color.white;
    public Color containerSurfaceHigh = Color.white;
    public Color containerSurfaceHighest = Color.white;
    public Color onContainer = Color.white;
    public Color onContainerVariant = Color.white;
    public Color containerOutline = Color.white;
    public Color containerOutlineVariant = Color.white;
    public float containerDisabledAlpha = 0.0f;
    public float onContainerDisabledAlpha = 0.0f;
    public float containerOutlineDisabledAlpha = 0.0f;
    public Color inverseContainerSurface = Color.white;
    public Color inverseOnContainer = Color.white;
    public Color inverseContainerOutline = Color.white;
    public Color complementaryContainerOutline = Color.white;
    public Color complementaryOnContainer = Color.white;
    public String combinedName = "";

    public BladeContainerColorTokens() {
    }

    @Override
    public boolean isDark() {
        return this.isDark;
    }

    @Override
    public Color getContainerSurfaceLowest() {
        return containerSurfaceLowest;
    }

    @Override
    public Color getContainerSurfaceLow() {
        return containerSurfaceLow;
    }

    @Override
    public Color getContainerSurface() {
        return containerSurface;
    }

    @Override
    public Color getContainerSurfaceHigh() {
        return containerSurfaceHigh;
    }

    @Override
    public Color getContainerSurfaceHighest() {
        return containerSurfaceHighest;
    }

    @Override
    public Color getOnContainer() {
        return onContainer;
    }

    @Override
    public Color getOnContainerVariant() {
        return onContainerVariant;
    }

    @Override
    public Color getContainerOutline() {
        return containerOutline;
    }

    @Override
    public Color getContainerOutlineVariant() {
        return containerOutlineVariant;
    }

    @Override
    public float getContainerSurfaceDisabledAlpha() {
        return this.containerDisabledAlpha;
    }

    @Override
    public float getOnContainerDisabledAlpha() {
        return this.onContainerDisabledAlpha;
    }

    @Override
    public float getContainerOutlineDisabledAlpha() {
        return this.containerOutlineDisabledAlpha;
    }

    @Override
    public Color getInverseContainerSurface() {
        return this.inverseContainerSurface;
    }

    @Override
    public Color getInverseOnContainer() {
        return this.inverseOnContainer;
    }

    @Override
    public Color getInverseContainerOutline() {
        return this.inverseContainerOutline;
    }

    @Override
    public Color getComplementaryOnContainer() {
        return this.complementaryOnContainer;
    }

    @Override
    public Color getComplementaryContainerOutline() {
        return this.complementaryContainerOutline;
    }

    @Override
    public int hashCode() {
        if (this.combinedName.length() == 0) {
            return super.hashCode();
        }
        return this.combinedName.hashCode();
    }
}
