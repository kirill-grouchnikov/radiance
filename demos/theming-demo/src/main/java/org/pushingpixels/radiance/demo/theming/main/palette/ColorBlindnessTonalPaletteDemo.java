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
import org.pushingpixels.ephemeral.chroma.colorblind.ColorBlindnessKind;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.ColorBlindTonalPalette;
import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;
import org.pushingpixels.radiance.demo.theming.main.RadianceLogo;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;

public class ColorBlindnessTonalPaletteDemo extends JFrame {
    public ColorBlindnessTonalPaletteDemo() {
        super("Chroma Palette");

        RadianceLogo.tonalConfigureOn(this);

        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 4dlu, fill:pref:grow, 4dlu, fill:pref:grow").
                rows("p, $lg, p, $lg, p, $lg, p, 12dlu, p, $lg, p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        int row = 1;

        Hct seedOne = Hct.fromInt(0xFFFFD007);
        Hct seedTwo = Hct.fromInt(0xFF4CDFD2);

        TonalPalette tonalPalette1 = TonalPalette.fromHct(seedOne);
        TonalPalette tonalPalette2 = TonalPalette.fromHct(seedTwo);

        ColorBlindTonalPalette tonalPalette1Protanopia = ColorBlindTonalPalette.from(
            tonalPalette1, ColorBlindnessKind.PROTANOPIA);
        ColorBlindTonalPalette tonalPalette1Deuteranopia = ColorBlindTonalPalette.from(
            tonalPalette1, ColorBlindnessKind.DEUTERANOPIA);
        ColorBlindTonalPalette tonalPalette1Tritanopia = ColorBlindTonalPalette.from(
            tonalPalette1, ColorBlindnessKind.TRITANOPIA);

        ColorBlindTonalPalette tonalPalette2Protanopia = ColorBlindTonalPalette.from(
            tonalPalette2, ColorBlindnessKind.PROTANOPIA);
        ColorBlindTonalPalette tonalPalette2Deuteranopia = ColorBlindTonalPalette.from(
            tonalPalette2, ColorBlindnessKind.DEUTERANOPIA);
        ColorBlindTonalPalette tonalPalette2Tritanopia = ColorBlindTonalPalette.from(
            tonalPalette2, ColorBlindnessKind.TRITANOPIA);

        builder.addROLabel("Palette one").xy(1, row)
            .add(new TonalPalettePreview(tonalPalette1))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Protanopia").xy(1, row)
            .add(new TonalPalettePreview(tonalPalette1Protanopia))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Deuteranopia").xy(1, row)
            .add(new TonalPalettePreview(tonalPalette1Deuteranopia))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Tritanopia").xy(1, row)
            .add(new TonalPalettePreview(tonalPalette1Tritanopia))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Palette two").xy(1, row)
            .add(new TonalPalettePreview(tonalPalette2))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Protanopia").xy(1, row)
            .add(new TonalPalettePreview(tonalPalette2Protanopia))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Deuteranopia").xy(1, row)
            .add(new TonalPalettePreview(tonalPalette2Deuteranopia))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Tritanopia").xy(1, row)
            .add(new TonalPalettePreview(tonalPalette2Tritanopia))
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
            new ColorBlindnessTonalPaletteDemo().setVisible(true);
        });
    }
}
