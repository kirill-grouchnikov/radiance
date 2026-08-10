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
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.BimodalTonalPalette;
import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;
import org.pushingpixels.radiance.demo.theming.main.RadianceLogo;
import org.pushingpixels.radiance.demo.theming.main.palette.component.TonalPalettePreview;
import org.pushingpixels.radiance.demo.theming.main.palette.component.TonalPaletteRangePreview;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;

public class BimodalTonalPaletteDemo extends JFrame {
    public BimodalTonalPaletteDemo() {
        super("Chroma Palette");

        RadianceLogo.tonalConfigureOn(this);

        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 4dlu, fill:pref:grow, 4dlu, fill:pref:grow").
                rows("p, $lg, p, 12dlu, p, $lg, p, 12dlu, p, $lg, p").
                padding(Paddings.DIALOG);

        int row = 1;

        Hct seedOne = Hct.fromInt(0xFFFFD007);
        Hct seedTwo = Hct.fromInt(0xFFFFA300);
        int fidelityTone = (int) seedTwo.getTone();

        TonalPalette tonalPalette1 = TonalPalette.fromHct(seedOne);
        TonalPalette tonalPalette2 = TonalPalette.fromHct(seedTwo);

        BimodalTonalPalette bimodalTonalPalette1 = BimodalTonalPalette.from(
            /* hct1 */ seedOne,
            /* hct2 */ seedTwo,
            /* transitionRange */ new BimodalTonalPalette.TransitionRangeFidelityLight(fidelityTone));
        BimodalTonalPalette bimodalTonalPalette2 = BimodalTonalPalette.from(
            /* hct1 */ seedTwo,
            /* hct2 */ seedOne,
            /* transitionRange */ new BimodalTonalPalette.TransitionRangeFidelityLight(fidelityTone));

        builder.addROLabel("Palette one").xy(1, row)
            .add(new TonalPalettePreview(tonalPalette1))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Palette two").xy(1, row)
            .add(new TonalPalettePreview(tonalPalette2))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Bimodal one-two").xy(1, row)
            .add(new TonalPalettePreview(bimodalTonalPalette1))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Zoom").xy(1, row)
            .add(new TonalPaletteRangePreview(bimodalTonalPalette1, 64, 84, 1))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Bimodal two-one").xy(1, row)
            .add(new TonalPalettePreview(bimodalTonalPalette2))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Zoom").xy(1, row)
            .add(new TonalPaletteRangePreview(bimodalTonalPalette2, 64, 84, 1))
            .xyw(3, row, 3);

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
            new BimodalTonalPaletteDemo().setVisible(true);
        });
    }
}
