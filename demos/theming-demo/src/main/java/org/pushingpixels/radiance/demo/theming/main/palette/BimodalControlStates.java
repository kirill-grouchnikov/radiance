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
package org.pushingpixels.radiance.demo.theming.main.palette;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicBimodalPalette;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.demo.theming.main.RadianceLogo;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.BimodalPaletteResolverUtils;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.painter.border.FlatBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ImageWrapperDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.GlassFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;

import javax.swing.*;
import java.awt.*;

public class BimodalControlStates extends JFrame {
    public BimodalControlStates() {
        super("Control states");

        this.setLayout(new FlowLayout());

        JButton attentionButton = new JButton("attention");
        attentionButton.putClientProperty(RadianceSynapse.CONTENTS_MODIFIED, Boolean.TRUE);

        JToggleButton toggleButton = new JToggleButton("selected");
        toggleButton.setSelected(true);

        JButton enabledButton = new JButton("enabled");

        JButton disabledButton = new JButton("disabled");
        disabledButton.setEnabled(false);

        this.add(attentionButton);
        this.add(toggleButton);
        this.add(enabledButton);
        this.add(disabledButton);

        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        RadianceLogo.tonalConfigureOn(this);
    }

    private static class SampleSkin extends RadianceSkin {
        public SampleSkin() {
            Hct primarySeed = Hct.fromInt(0xFFA8DEB5);
            double primaryHue = primarySeed.getHue();
            double hue1 = primaryHue + 30.0;
            double hue2 = primaryHue - 30.0;
            double primaryTone = primarySeed.getTone();

            Hct secondarySeed = Hct.fromInt(0xFFC2FADC);
            Hct mutedSeed = Hct.from(secondarySeed.getHue(), 12.0, secondarySeed.getTone());
            Hct neutralSeed = Hct.from(secondarySeed.getHue(), 4.0, secondarySeed.getTone());

            RadianceColorSchemeBundle defaultBundle = new RadianceColorSchemeBundle(
                /* activeContainerTokens */ ColorSchemeUtils.getBimodalContainerTokens(
                    /* seedOne */ Hct.from(hue1, primarySeed.getChroma(), primaryTone),
                    /* seedTwo */ Hct.from(hue2, primarySeed.getChroma(), primaryTone),
                    /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
                    /* fidelityTone */ primaryTone,
                    /* containerConfiguration */ ContainerConfiguration.defaultLight(),
                    /* colorResolver */ BimodalPaletteResolverUtils.getBimodalPaletteColorResolver()),
                /* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(mutedSeed,
                    ContainerConfiguration.defaultLight()),
                /* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(neutralSeed,
                    ContainerConfiguration.defaultLight()),
                /* isSystemDark */ false);

            this.registerDecorationAreaSchemeBundle(defaultBundle,
                RadianceThemingSlices.DecorationAreaType.NONE);

            this.registerAsDecorationArea(
                defaultBundle.getMainColorScheme().getActiveContainerTokens(),
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER);

            this.buttonShaper = new ClassicButtonShaper();
            this.fillPainter = new SpecularRectangularFillPainter(new GlassFillPainter(), 1.0f);
            this.borderPainter = new FlatBorderPainter();

            ImageWrapperDecorationPainter decorationPainter = new MarbleNoiseDecorationPainter();
            decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
            decorationPainter.setTextureAlpha(0.3f);
            this.decorationPainter = decorationPainter;

            this.highlightFillPainter = new ClassicFillPainter();
        }

        @Override
        public String getDisplayName() {
            return "Sample Tonal";
        }
    }

    public static void main(String[] args) {
        RadianceSkin tonalSkin = new SampleSkin();

        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setFocusKind(RadianceThemingSlices.FocusKind.NONE);
            RadianceThemingCortex.GlobalScope.setSkin(tonalSkin);
            new BimodalControlStates().setVisible(true);
        });
    }

}
