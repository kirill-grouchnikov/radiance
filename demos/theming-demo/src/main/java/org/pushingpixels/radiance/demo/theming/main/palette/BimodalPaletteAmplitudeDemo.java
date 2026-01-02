/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import com.jgoodies.forms.layout.CellConstraints;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicBimodalPalette;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.demo.theming.main.RadianceLogo;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;
import org.pushingpixels.radiance.theming.api.palette.TokenPaletteColorResolverUtils;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;

public class BimodalPaletteAmplitudeDemo extends JFrame {
    public BimodalPaletteAmplitudeDemo() {
        super("Chroma Palette");

        RadianceLogo.tonalConfigureOn(this);

        FormBuilder builder = FormBuilder.create().
            columns("right:pref, 4dlu, fill:pref:grow, 4dlu, fill:pref:grow").
            rows("p, $lg, p, 12dlu, p, 8dlu, p, $lg, p, 12dlu, p, 6dlu, p, " +
                "12dlu, p, 8dlu, p, $lg, p, 12dlu, p, 6dlu, p," +
                "12dlu, p, 8dlu, p, $lg, p, 12dlu, p, 6dlu, p").
                padding(Paddings.DIALOG);

        int row = 1;

        Hct seedOne = Hct.fromInt(0xFFC37222);
        Hct seedTwo = Hct.fromInt(0xFF6F2003);
        int fidelityTone = 40;
        int startTone = fidelityTone - 10;
        int endTone = fidelityTone + 10;

        ContainerColorTokens tokens1 = ContainerColorTokensUtils.getBimodalContainerTokens(
            /* seedOne */ seedTwo,
            /* seedTwo */ seedOne,
            /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
            /* fidelityTone */ fidelityTone,
            /* containerConfiguration */ ContainerConfiguration.defaultDark(),
            /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver());

        DynamicBimodalPalette bimodalPalette1 = new DynamicBimodalPalette(
            /* seedOne */ seedTwo,
            /* seedTwo */ seedOne,
            /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
            /* fidelityTone */ fidelityTone,
            /* containerConfiguration */ ContainerConfiguration.defaultDark());

        ContainerColorTokens tokens2 = ContainerColorTokensUtils.getBimodalContainerTokens(
            /* seedOne */ seedTwo,
            /* seedTwo */ seedOne,
            /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
            /* fidelityTone */ fidelityTone,
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ true,
                /* contrastLevel */ 0.0,
                /* surfaceRangeAmplitudeFactor */ 1.5),
            /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver());

        DynamicBimodalPalette bimodalPalette2 = new DynamicBimodalPalette(
            /* seedOne */ seedTwo,
            /* seedTwo */ seedOne,
            /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
            /* fidelityTone */ fidelityTone,
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ true,
                /* contrastLevel */ 0.0,
                /* surfaceRangeAmplitudeFactor */ 1.5));

        ContainerColorTokens tokens3 = ContainerColorTokensUtils.getBimodalContainerTokens(
            /* seedOne */ seedTwo,
            /* seedTwo */ seedOne,
            /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
            /* fidelityTone */ fidelityTone,
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ true,
                /* contrastLevel */ 0.0,
                /* surfaceRangeAmplitudeFactor */ 2.0),
            /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver());

        DynamicBimodalPalette bimodalPalette3 = new DynamicBimodalPalette(
            /* seedOne */ seedTwo,
            /* seedTwo */ seedOne,
            /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
            /* fidelityTone */ fidelityTone,
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ true,
                /* contrastLevel */ 0.0,
                /* surfaceRangeAmplitudeFactor */ 2.0));

        builder.addROLabel("Palette one").xy(1, row)
            .add(new TonalPalettePreview(bimodalPalette1.paletteOne))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Palette two").xy(1, row)
            .add(new TonalPalettePreview(bimodalPalette1.paletteTwo))
            .xyw(3, row, 3);
        row += 2;

        builder.addSeparator("Amplitude factor = 1.0").xy(3, row, CellConstraints.CENTER,
            CellConstraints.FILL);
        row += 2;
        builder.addROLabel("Palette " + startTone + ":" + endTone).xy(1, row)
            .add(new BimodalPalettePreview(bimodalPalette1))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Transition range").xy(1, row)
            .add(new BimodalPaletteRangePreview(bimodalPalette1, startTone, endTone, 1))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Container tokens").xy(1, row)
            .add(new ContainerPalettePreview(tokens1)).xy(3, row);
        row += 2;
        builder.addROLabel("Container visuals").xy(1, row)
            .add(new ContainerGradient2Preview(tokens1, "Tonal")).xy(3, row);
        row += 2;

        builder.addSeparator("Amplitude factor = 1.5").xy(3, row, CellConstraints.CENTER,
            CellConstraints.FILL);
        row += 2;
        builder.addROLabel("Palette " + startTone + ":" + endTone).xy(1, row)
            .add(new BimodalPalettePreview(bimodalPalette2))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Transition range").xy(1, row)
            .add(new BimodalPaletteRangePreview(bimodalPalette2, startTone, endTone, 1))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Container tokens").xy(1, row)
            .add(new ContainerPalettePreview(tokens2)).xy(3, row);
        row += 2;
        builder.addROLabel("Container visuals").xy(1, row)
            .add(new ContainerGradient2Preview(tokens2, "Tonal")).xy(3, row);
        row += 2;

        builder.addSeparator("Amplitude factor = 2.0").xy(3, row, CellConstraints.CENTER,
            CellConstraints.FILL);
        row += 2;
        builder.addROLabel("Palette " + startTone + ":" + endTone).xy(1, row)
            .add(new BimodalPalettePreview(bimodalPalette3))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Transition range").xy(1, row)
            .add(new BimodalPaletteRangePreview(bimodalPalette3, startTone, endTone, 1))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Container tokens").xy(1, row)
            .add(new ContainerPalettePreview(tokens3)).xy(3, row);
        row += 2;
        builder.addROLabel("Container visuals").xy(1, row)
            .add(new ContainerGradient2Preview(tokens3, "Tonal")).xy(3, row);
        row += 2;

        this.add(builder.build());

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setFocusKind(RadianceThemingSlices.FocusKind.NONE);
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessSkin());
            new BimodalPaletteAmplitudeDemo().setVisible(true);
        });
    }
}
