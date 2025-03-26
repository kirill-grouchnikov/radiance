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

import org.pushingpixels.ephemeral.chroma.blend.Blend;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicBimodalPalette;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.plaf.UIResource;
import java.awt.*;

public class ContainerColorTokensUtils {
    public static ContainerColorTokens getRolloverUnselectedTokens(ContainerColorTokens baseTokens) {
        // Mixing in 20% of surface bright on top of base
        return ContainerColorTokensUtils.overlay(
            baseTokens,
            baseTokens.getContainerSurfaceBright(),
            0.2f);
    }

    public static ContainerColorTokens getRolloverSelectedTokens(ContainerColorTokens baseTokens) {
        // Mixing in 30% of surface bright on top of base
        return ContainerColorTokensUtils.overlay(
            baseTokens,
            baseTokens.getContainerSurfaceBright(),
            0.3f);
    }

    public static ContainerColorTokens getRolloverArmedTokens(ContainerColorTokens baseTokens) {
        // Mixing in 30% of surface bright on top of base
        return ContainerColorTokensUtils.overlay(
            baseTokens,
            baseTokens.getContainerSurfaceBright(),
            0.3f);
    }

    public static ContainerColorTokens getPressedUnselectedTokens(ContainerColorTokens baseTokens) {
        // Mixing in 50% of surface dim on top
        return ContainerColorTokensUtils.overlay(
            baseTokens,
            baseTokens.getContainerSurfaceDim(),
            0.5f);
    }

    public static ContainerColorTokens getPressedSelectedTokens(ContainerColorTokens baseTokens) {
        // Mixing in 50% of surface dim on top
        return ContainerColorTokensUtils.overlay(
            baseTokens,
            baseTokens.getContainerSurfaceDim(),
            0.4f);
    }

    private static ContainerColorTokens overlay(ContainerColorTokens original,
        Color overlay, float overlayAmount) {

        Color overlayWithAlpha = RadianceColorUtilities.getAlphaColor(
            overlay, (int) (255 * overlayAmount));

        // Apply overlay on the container tokens
        Color containerSurfaceLowest = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceLowest(), overlayWithAlpha);
        Color containerSurfaceLow = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceLow(), overlayWithAlpha);
        Color containerSurface = RadianceColorUtilities.overlayColor(
            original.getContainerSurface(), overlayWithAlpha);
        Color containerSurfaceHigh = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceHigh(), overlayWithAlpha);
        Color containerSurfaceHighest = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceHighest(), overlayWithAlpha);
        Color inverseContainerSurface = RadianceColorUtilities.overlayColor(
            original.getInverseContainerSurface(), overlayWithAlpha);
        Color containerSurfaceDim = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceDim(), overlayWithAlpha);
        Color containerSurfaceBright = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceBright(), overlayWithAlpha);

        // Leave on container and container outline tokens as they are
        Color onContainer = original.getOnContainer();
        Color onContainerVariant = original.getOnContainerVariant();
        Color containerOutline = original.getContainerOutline();
        Color containerOutlineVariant = original.getContainerOutlineVariant();

        Color inverseOnContainer = original.getInverseOnContainer();
        Color inverseContainerOutline = original.getInverseContainerOutline();
        Color complementaryOnContainer = original.getComplementaryOnContainer();
        Color complementaryContainerOutline = original.getComplementaryContainerOutline();
        Color accentOnContainer = original.getAccentOnContainer();

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return original.isDark();
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
            public Color getContainerSurfaceDim() {
                return containerSurfaceDim;
            }

            @Override
            public Color getContainerSurfaceBright() {
                return containerSurfaceBright;
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
                return original.getContainerSurfaceDisabledAlpha();
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return original.getOnContainerDisabledAlpha();
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return original.getContainerOutlineDisabledAlpha();
            }

            @Override
            public Color getInverseContainerSurface() {
                return inverseContainerSurface;
            }

            @Override
            public Color getInverseOnContainer() {
                return inverseOnContainer;
            }

            @Override
            public Color getInverseContainerOutline() {
                return inverseContainerOutline;
            }

            @Override
            public Color getComplementaryOnContainer() {
                return complementaryOnContainer;
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return complementaryContainerOutline;
            }

            @Override
            public Color getAccentOnContainer() {
                return accentOnContainer;
            }
        };
    }

    public static ContainerColorTokens getContainerTokens(
        Hct seed,
        ContainerConfiguration containerConfiguration) {
        return getContainerTokens(seed, containerConfiguration,
            TokenPaletteColorResolverUtils.getPaletteColorResolver());
    }

    public static ContainerColorTokens getContainerTokens(
        Hct seed,
        ContainerConfiguration containerConfiguration,
        TokenPaletteColorResolver colorResolver) {

        DynamicPalette dynamicPalette = new DynamicPalette(
            /* sourceColorHct */ seed,
            /* containerConfiguration */ containerConfiguration);

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return dynamicPalette.containerConfiguration.isDark();
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return colorResolver.getContainerSurfaceLowest(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceLow() {
                return colorResolver.getContainerSurfaceLow(dynamicPalette);
            }

            @Override
            public Color getContainerSurface() {
                return colorResolver.getContainerSurface(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return colorResolver.getContainerSurfaceHigh(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return colorResolver.getContainerSurfaceHighest(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceDim() {
                return colorResolver.getContainerSurfaceDim(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceBright() {
                return colorResolver.getContainerSurfaceBright(dynamicPalette);
            }

            @Override
            public Color getOnContainer() {
                return colorResolver.getOnContainer(dynamicPalette);
            }

            @Override
            public Color getOnContainerVariant() {
                return colorResolver.getOnContainerVariant(dynamicPalette);
            }

            @Override
            public Color getContainerOutline() {
                return colorResolver.getContainerOutline(dynamicPalette);
            }

            @Override
            public Color getContainerOutlineVariant() {
                return colorResolver.getContainerOutlineVariant(dynamicPalette);
            }

            @Override
            public float getContainerSurfaceDisabledAlpha() {
                return colorResolver.getContainerSurfaceDisabledAlpha(dynamicPalette);
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return colorResolver.getOnContainerDisabledAlpha(dynamicPalette);
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return colorResolver.getContainerOutlineDisabledAlpha(dynamicPalette);
            }

            @Override
            public Color getInverseContainerSurface() {
                return colorResolver.getInverseContainerSurface(dynamicPalette);
            }

            @Override
            public Color getInverseOnContainer() {
                return colorResolver.getInverseOnContainer(dynamicPalette);
            }

            @Override
            public Color getInverseContainerOutline() {
                return colorResolver.getInverseContainerOutline(dynamicPalette);
            }

            @Override
            public Color getComplementaryOnContainer() {
                return colorResolver.getComplementaryOnContainer(dynamicPalette);
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return colorResolver.getComplementaryContainerOutline(dynamicPalette);
            }

            @Override
            public Color getAccentOnContainer() {
                return colorResolver.getAccentOnContainer(dynamicPalette);
            }
        };
    }

    public static ContainerColorTokens getBimodalContainerTokens(
        Hct seedOne,
        Hct seedTwo,
        DynamicBimodalPalette.TransitionRange transitionRange,
        double fidelityTone,
        ContainerConfiguration containerConfiguration,
        TokenPaletteColorResolver colorResolver) {

        DynamicBimodalPalette dynamicPalette = new DynamicBimodalPalette(
            /* seedOne */ seedOne,
            /* seedTwo */ seedTwo,
            /* transitionRange */ transitionRange,
            /* fidelityTone */ fidelityTone,
            /* containerConfiguration */ containerConfiguration);

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return dynamicPalette.containerConfiguration.isDark();
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return colorResolver.getContainerSurfaceLowest(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceLow() {
                return colorResolver.getContainerSurfaceLow(dynamicPalette);
            }

            @Override
            public Color getContainerSurface() {
                return colorResolver.getContainerSurface(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return colorResolver.getContainerSurfaceHigh(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return colorResolver.getContainerSurfaceHighest(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceDim() {
                return colorResolver.getContainerSurfaceDim(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceBright() {
                return colorResolver.getContainerSurfaceBright(dynamicPalette);
            }

            @Override
            public Color getOnContainer() {
                return colorResolver.getOnContainer(dynamicPalette);
            }

            @Override
            public Color getOnContainerVariant() {
                return colorResolver.getOnContainerVariant(dynamicPalette);
            }

            @Override
            public Color getContainerOutline() {
                return colorResolver.getContainerOutline(dynamicPalette);
            }

            @Override
            public Color getContainerOutlineVariant() {
                return colorResolver.getContainerOutlineVariant(dynamicPalette);
            }

            @Override
            public float getContainerSurfaceDisabledAlpha() {
                return colorResolver.getContainerSurfaceDisabledAlpha(dynamicPalette);
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return colorResolver.getOnContainerDisabledAlpha(dynamicPalette);
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return colorResolver.getContainerOutlineDisabledAlpha(dynamicPalette);
            }

            @Override
            public Color getInverseContainerSurface() {
                return colorResolver.getInverseContainerSurface(dynamicPalette);
            }

            @Override
            public Color getInverseOnContainer() {
                return colorResolver.getInverseOnContainer(dynamicPalette);
            }

            @Override
            public Color getInverseContainerOutline() {
                return colorResolver.getInverseContainerOutline(dynamicPalette);
            }

            @Override
            public Color getComplementaryOnContainer() {
                return colorResolver.getComplementaryOnContainer(dynamicPalette);
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return colorResolver.getComplementaryContainerOutline(dynamicPalette);
            }

            @Override
            public Color getAccentOnContainer() {
                return colorResolver.getAccentOnContainer(dynamicPalette);
            }
        };
    }

    /**
     * Cache of blended schemes.
     */
    private final static LazyResettableHashMap<ContainerColorTokens> blendedCache =
        new LazyResettableHashMap<>("ColorSchemeUtils.blendedTokens");

    public static ContainerColorTokens getColorizedTokens(Component component,
        ContainerColorTokens tokens, boolean isEnabled) {
        Component forQuerying = component;
        if ((component != null) && (component.getParent() != null)
            && ((component.getClass().isAnnotationPresent(RadianceInternalArrowButton.class)
            || (component instanceof RadianceTitleButton)))) {
            forQuerying = component.getParent();
        }
        return getColorizedTokens(component, tokens,
            (forQuerying == null) ? null : forQuerying.getForeground(),
            (forQuerying == null) ? null : forQuerying.getBackground(), isEnabled);
    }

    public static ContainerColorTokens getColorizedTokens(Component component,
        ContainerColorTokens tokens, Color fgColor, Color bgColor, boolean isEnabled) {
        if ((tokens != null) && (component != null)) {
            // Support for enhancement 256 - colorizing
            // controls.
            if (bgColor instanceof UIResource) {
                bgColor = null;
            }
            if (fgColor instanceof UIResource) {
                fgColor = null;
            }
            if ((bgColor != null) || (fgColor != null)) {
                double colorization = RadianceCoreUtilities.getColorizationFactor(component);
                if (!isEnabled) {
                    colorization /= 2.0;
                }
                if (colorization > 0.0) {
                    return getBlendedTokens(tokens, bgColor, colorization, fgColor, colorization);
                }
            }
        }
        return tokens;
    }

    public static ContainerColorTokens getBlendedTokens(ContainerColorTokens original,
        Color backgroundShiftColor, double backgroundShiftFactor, Color foregroundShiftColor,
        double foregroundShiftFactor) {
        HashMapKey key = RadianceCoreUtilities.getHashKey(original,
            backgroundShiftColor == null ? "" : backgroundShiftColor.getRGB(),
            backgroundShiftFactor,
            foregroundShiftColor == null ? "" : foregroundShiftColor.getRGB(),
            foregroundShiftFactor);
        ContainerColorTokens result = blendedCache.get(key);
        if (result == null) {
            result = blendTowards(original, backgroundShiftColor, backgroundShiftFactor,
                foregroundShiftColor, foregroundShiftFactor);
            blendedCache.put(key, result);
        }
        return result;
    }

    private static ContainerColorTokens blendTowards(ContainerColorTokens original,
        Color backgroundShiftColor, double backgroundShiftFactor, Color foregroundShiftColor,
        double foregroundShiftFactor) {

        Color containerSurfaceLowest = (backgroundShiftColor == null)
            ? original.getContainerSurfaceLowest()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceLowest().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurfaceLow = (backgroundShiftColor == null)
            ? original.getContainerSurfaceLow()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceLow().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurface = (backgroundShiftColor == null)
            ? original.getContainerSurface()
            : new Color(Blend.harmonizeAll(original.getContainerSurface().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurfaceHigh = (backgroundShiftColor == null)
            ? original.getContainerSurfaceHigh()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceHigh().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurfaceHighest = (backgroundShiftColor == null)
            ? original.getContainerSurfaceHighest()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceHighest().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurfaceDim = (backgroundShiftColor == null)
            ? original.getContainerSurfaceDim()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceDim().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurfaceBright = (backgroundShiftColor == null)
            ? original.getContainerSurfaceBright()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceBright().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color onContainer = (foregroundShiftColor == null)
            ? original.getOnContainer()
            : new Color(Blend.harmonizeAll(original.getOnContainer().getRGB(),
                foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color onContainerVariant = (foregroundShiftColor == null)
            ? original.getOnContainerVariant()
            : new Color(Blend.harmonizeAll(original.getOnContainerVariant().getRGB(),
                foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color containerOutline = (backgroundShiftColor == null)
            ? original.getContainerOutline()
            : new Color(Blend.harmonizeAll(original.getContainerOutline().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerOutlineVariant = (backgroundShiftColor == null)
            ? original.getContainerOutlineVariant()
            : new Color(Blend.harmonizeAll(original.getContainerOutlineVariant().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color inverseContainerSurface = (backgroundShiftColor == null)
            ? original.getInverseContainerSurface()
            : new Color(Blend.harmonizeAll(original.getInverseContainerSurface().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color inverseOnContainer = (foregroundShiftColor == null)
            ? original.getInverseOnContainer()
            : new Color(Blend.harmonizeAll(original.getInverseOnContainer().getRGB(),
                foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color inverseContainerOutline = (backgroundShiftColor == null)
            ? original.getInverseContainerOutline()
            : new Color(Blend.harmonizeAll(original.getInverseContainerOutline().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color complementaryOnContainer = (foregroundShiftColor == null)
            ? original.getComplementaryOnContainer()
            : new Color(Blend.harmonizeAll(original.getComplementaryOnContainer().getRGB(),
            foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color complementaryContainerOutline = (backgroundShiftColor == null)
            ? original.getComplementaryContainerOutline()
            : new Color(Blend.harmonizeAll(original.getComplementaryContainerOutline().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color accentOnContainer = (foregroundShiftColor == null)
            ? original.getAccentOnContainer()
            : new Color(Blend.harmonizeAll(original.getAccentOnContainer().getRGB(),
            foregroundShiftColor.getRGB(), foregroundShiftFactor));

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return original.isDark();
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
            public Color getContainerSurfaceDim() {
                return containerSurfaceDim;
            }

            @Override
            public Color getContainerSurfaceBright() {
                return containerSurfaceBright;
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
                return original.getContainerSurfaceDisabledAlpha();
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return original.getOnContainerDisabledAlpha();
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return original.getContainerOutlineDisabledAlpha();
            }

            @Override
            public Color getInverseContainerSurface() {
                return inverseContainerSurface;
            }

            @Override
            public Color getInverseOnContainer() {
                return inverseOnContainer;
            }

            @Override
            public Color getInverseContainerOutline() {
                return inverseContainerOutline;
            }

            @Override
            public Color getComplementaryOnContainer() {
                return complementaryOnContainer;
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return complementaryContainerOutline;
            }

            @Override
            public Color getAccentOnContainer() {
                return accentOnContainer;
            }
        };
    }
}
