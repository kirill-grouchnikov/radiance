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
package org.pushingpixels.radiance.demo.theming.main.palette.walkthrough;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.BaseTonalPalette;
import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;
import org.pushingpixels.radiance.demo.theming.main.RadianceLogo;
import org.pushingpixels.radiance.theming.api.ContainerColorTokensBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ImageWrapperDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.GlassSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

import javax.swing.*;
import java.awt.*;

public class Step4ComponentStatesDemo extends JFrame {
    public Step4ComponentStatesDemo() {
        super("Chroma Palette");

        this.setLayout(new FlowLayout());

        JToggleButton toggleButton = new JToggleButton("selected");
        toggleButton.setSelected(true);

        JButton enabledButton = new JButton("enabled");

        JButton disabledButton = new JButton("disabled");
        disabledButton.setEnabled(false);

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
            BaseTonalPalette activePalette = TonalPalette.fromHct(Hct.from(300.0, 40.0, 40.0));
            BaseTonalPalette mutedPalette = TonalPalette.fromHct(Hct.from(300.0, 18.0, 40.0));
            BaseTonalPalette neutralPalette = TonalPalette.fromHct(Hct.from(300.0, 8.0, 40.0));

            ContainerColorTokensBundle defaultBundle = new ContainerColorTokensBundle(
                /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                    /* seed */ activePalette.getHct(80.0),
                    /* containerConfiguration */ ContainerConfiguration.defaultLight()),
                /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                    /* seed */ mutedPalette.getHct(85.0),
                    /* containerConfiguration */ ContainerConfiguration.defaultLight()),
                /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                    /* seed */ neutralPalette.getHct(95.0),
                    /* containerConfiguration */ ContainerConfiguration.defaultLight()),
                /* isSystemDark */ false);

            this.registerDecorationAreaTokensBundle(defaultBundle,
                    RadianceThemingSlices.DecorationAreaType.NONE);

            this.registerAsDecorationArea(
                defaultBundle.getActiveContainerTokens(),
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER);

            this.registerButtonShaper(new ClassicButtonShaper(),
                RadianceThemingSlices.DecorationAreaType.NONE);
            this.surfacePainter = new SpecularRectangularSurfacePainter(new GlassSurfacePainter(), 1.0f);
            this.outlinePainter = new FlatOutlinePainter();

            ImageWrapperDecorationPainter decorationPainter = new MarbleNoiseDecorationPainter();
            decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
            decorationPainter.setTextureAlpha(0.3f);
            this.decorationPainter = decorationPainter;

            this.highlightSurfacePainter = new ClassicSurfacePainter();
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
            new Step4ComponentStatesDemo().setVisible(true);
        });
    }

}
