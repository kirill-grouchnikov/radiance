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

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicBimodalPalette;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.demo.theming.main.RadianceLogo;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;

public class PaletteBalancedDemo extends JFrame {
    public PaletteBalancedDemo() {
        super("Chroma Palette");

        RadianceLogo.tonalConfigureOn(this);

        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 4dlu, fill:pref:grow, 4dlu, fill:pref:grow").
                rows("p, $lg, p, 12dlu, p, $lg, p, 12dlu, p, $lg, p, 12dlu, p, $lg, p, 12dlu, p, $lg, p").
                padding(Paddings.DIALOG);

        int row = 1;

        Hct seedOne = Hct.fromInt(0xFFFFD757);
        Hct seedTwo = Hct.fromInt(0xFFFFA62A);
        int fidelityTone = (int) seedTwo.getTone();
        int startTone = fidelityTone - 10;
        int endTone = fidelityTone + 10;

        DynamicBimodalPalette bimodalPalette1 = DynamicBimodalPalette.fidelity(
            /* seedOne */ seedOne,
            /* seedTwo */ seedTwo,
            /* transitionRange */ DynamicBimodalPalette.TransitionRange.FULL_SPAN,
            /* isDark */ false,
            /* fidelityTone */ fidelityTone,
            /* isContrastLevel */ 0.0);

        DynamicBimodalPalette bimodalPalette1Custom = DynamicBimodalPalette.fidelity(
            /* seedOne */ seedOne,
            /* seedTwo */ seedTwo,
            /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
            /* isDark */ false,
            /* fidelityTone */ fidelityTone,
            /* isContrastLevel */ 0.0);

        DynamicBimodalPalette bimodalPalette2 = DynamicBimodalPalette.fidelity(
            /* seedOne */ seedTwo,
            /* seedTwo */ seedOne,
            /* transitionRange */ DynamicBimodalPalette.TransitionRange.FULL_SPAN,
            /* isDark */ false,
            /* fidelityTone */ fidelityTone,
            /* isContrastLevel */ 0.0);

        DynamicBimodalPalette bimodalPalette2Custom = DynamicBimodalPalette.fidelity(
            /* seedOne */ seedTwo,
            /* seedTwo */ seedOne,
            /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
            /* isDark */ false,
            /* fidelityTone */ fidelityTone,
            /* isContrastLevel */ 0.0);

        builder.addROLabel("Palette one").xy(1, row)
            .add(new TonalPalettePreview(bimodalPalette1.paletteOne))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Palette two").xy(1, row)
            .add(new TonalPalettePreview(bimodalPalette1.paletteTwo))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Bimodal one-two 0:100").xy(1, row)
            .add(new BimodalPalettePreview(bimodalPalette1))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Zoom").xy(1, row)
            .add(new BimodalPaletteRangePreview(bimodalPalette1, startTone, endTone, 1))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Bimodal one-two " + startTone + ":" + endTone).xy(1, row)
            .add(new BimodalPalettePreview(bimodalPalette1Custom))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Zoom").xy(1, row)
            .add(new BimodalPaletteRangePreview(bimodalPalette1Custom, startTone, endTone, 1))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Bimodal two-one 0:100").xy(1, row)
            .add(new BimodalPalettePreview(bimodalPalette2))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Zoom").xy(1, row)
            .add(new BimodalPaletteRangePreview(bimodalPalette2, startTone, endTone, 1))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Bimodal two-one " + startTone + ":" + endTone).xy(1, row)
            .add(new BimodalPalettePreview(bimodalPalette2Custom))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Zoom").xy(1, row)
            .add(new BimodalPaletteRangePreview(bimodalPalette2Custom, startTone, endTone, 1))
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
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessSkin.BusinessTonalSkin());
            new PaletteBalancedDemo().setVisible(true);
        });
    }
}
