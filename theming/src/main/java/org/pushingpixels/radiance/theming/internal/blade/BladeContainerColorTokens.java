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
    public Color containerLowest = Color.white;
    public Color containerLow = Color.white;
    public Color container = Color.white;
    public Color containerHigh = Color.white;
    public Color containerHighest = Color.white;
    public Color onContainer = Color.white;
    public Color onContainerVariant = Color.white;
    public Color containerOutline = Color.white;
    public Color containerOutlineVariant = Color.white;
    public float containerDisabledAlpha = 0.0f;
    public float onContainerDisabledAlpha = 0.0f;
    public float containerOutlineDisabledAlpha = 0.0f;
    public String combinedName = "";

    public BladeContainerColorTokens() {
    }

    @Override
    public boolean isDark() {
        return this.isDark;
    }

    @Override
    public Color getContainerLowest() {
        return containerLowest;
    }

    @Override
    public Color getContainerLow() {
        return containerLow;
    }

    @Override
    public Color getContainer() {
        return container;
    }

    @Override
    public Color getContainerHigh() {
        return containerHigh;
    }

    @Override
    public Color getContainerHighest() {
        return containerHighest;
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
    public float getContainerDisabledAlpha() {
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
    public int hashCode() {
        if (this.combinedName.length() == 0) {
            return super.hashCode();
        }
        return this.combinedName.hashCode();
    }
}
