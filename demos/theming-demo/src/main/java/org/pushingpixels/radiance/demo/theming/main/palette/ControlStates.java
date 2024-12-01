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
package org.pushingpixels.radiance.demo.theming.main.palette;

import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;
import org.pushingpixels.radiance.demo.theming.main.RadianceLogo;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.AquaColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.LightGrayColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.MetallicColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ImageWrapperDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicTonalFillPainter;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.palette.Palettes;
import org.pushingpixels.radiance.theming.api.palette.RadianceColorScheme2;
import org.pushingpixels.radiance.theming.api.palette.TonalSkin;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

import javax.swing.*;
import java.awt.*;

public class ControlStates extends JFrame {
    public ControlStates() {
        super("Control states");

        this.setLayout(new FlowLayout());
        JButton defaultButton = new JButton("active");
        JButton button = new JButton("default");
        JButton disabledButton = new JButton("disabled");
        disabledButton.setEnabled(false);
        this.getRootPane().setDefaultButton(defaultButton);

        this.add(defaultButton);
        this.add(button);
        this.add(disabledButton);

        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        RadianceLogo.tonalConfigureOn(this);
    }

    private static class SampleSkin extends RadianceSkin.Accented implements TonalSkin {
        public SampleSkin(RadianceColorScheme accentScheme) {
            super(new RadianceSkin.Accented.AccentBuilder()
                    .withActiveControlsAccent(accentScheme)
                    .withWindowChromeAccent(accentScheme));

            RadianceColorSchemeBundle bundle = new RadianceColorSchemeBundle(
                    accentScheme,
                    new MetallicColorScheme(),
                    new LightGrayColorScheme());
            this.registerDecorationAreaSchemeBundle(bundle,
                    RadianceThemingSlices.DecorationAreaType.NONE);
            this.registerAsDecorationArea(accentScheme,
                    RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                    RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                    RadianceThemingSlices.DecorationAreaType.HEADER);

            // First tonal configuration
            Hct seedHct = Hct.fromInt(0xFF20F290);
            double seedHue = seedHct.getHue();
            double seedChroma = seedHct.getChroma();

            TonalPalette primary = TonalPalette.fromHueAndChroma(seedHue, seedChroma);
            TonalPalette neutral = TonalPalette.fromHueAndChroma(seedHue, 10.0);
            TonalPalette neutralVariant = TonalPalette.fromHueAndChroma(seedHue, 16.0);

            Palettes samplePalettes = Palettes.builder()
                    .setNeutralPalette(neutral)
                    .setNeutralVariantPalette(neutralVariant)
                    .setPrimaryPalette(primary)
                    .build();

            RadianceColorScheme2 lightColorScheme = ColorSchemeUtils.getLightColorScheme(samplePalettes);

            this.registerDecorationAreaColorScheme(lightColorScheme,
                    RadianceThemingSlices.DecorationAreaType.NONE);

            this.registerAsDecorationArea(lightColorScheme.getTonalContainerTokens(),
                    RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                    RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                    RadianceThemingSlices.DecorationAreaType.HEADER);

            this.buttonShaper = new ClassicButtonShaper();
            this.fillPainter = new ClassicTonalFillPainter();
            this.borderPainter = new ClassicTonalBorderPainter();

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
        RadianceSkin tonalSkin = new SampleSkin(new AquaColorScheme());

        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setFocusKind(RadianceThemingSlices.FocusKind.NONE);
            RadianceThemingCortex.GlobalScope.setSkin(tonalSkin);
            new ControlStates().setVisible(true);
        });
    }

}
