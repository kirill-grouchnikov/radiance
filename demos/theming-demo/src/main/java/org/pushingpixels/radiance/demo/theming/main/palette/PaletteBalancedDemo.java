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
import com.jgoodies.forms.layout.CellConstraints;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.demo.theming.main.RadianceLogo;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.palette.RadianceColorScheme2;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;

public class PaletteBalancedDemo extends JFrame {
    public PaletteBalancedDemo() {
        super("Chroma Palette");

        RadianceLogo.tonalConfigureOn(this);

        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 4dlu, fill:pref:grow, 4dlu, fill:pref:grow").
                rows("p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p, 12dlu, p, $lg, p, $lg, p, $lg, " +
                "p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        int row = 1;

        RadianceColorScheme2 lightColorScheme = ColorSchemeUtils.getLightTonalBalancedColorScheme(
            Hct.fromInt(0xFF76A8C8), 16.0, 10.0);
        RadianceColorScheme2 darkColorScheme = ColorSchemeUtils.getDarkTonalBalancedColorScheme(
            Hct.fromInt(0xFF76A8C8), 16.0, 10.0);

        builder.addSeparator("LIGHT").xy(3, row, CellConstraints.CENTER, CellConstraints.FILL);
        builder.addSeparator("DARK").xy(5, row, CellConstraints.CENTER, CellConstraints.FILL);

        row += 2;
        builder.addROLabel("Surfaces").xy(1, row)
            .add(new SurfacePreview(lightColorScheme)).xy(3, row)
            .add(new SurfacePreview(darkColorScheme)).xy(5, row);
        row += 2;
        builder.addROLabel("Neutral container").xy(1, row)
            .add(new ContainerPalettePreview(lightColorScheme.getNeutralContainerTokens())).xy(3, row)
            .add(new ContainerPalettePreview(darkColorScheme.getNeutralContainerTokens())).xy(5, row);
        row += 2;
        builder.addROLabel("Muted container").xy(1, row)
            .add(new ContainerPalettePreview(lightColorScheme.getMutedContainerTokens())).xy(3, row)
            .add(new ContainerPalettePreview(darkColorScheme.getMutedContainerTokens())).xy(5, row);
        row += 2;
        builder.addROLabel("Tonal container").xy(1, row)
            .add(new ContainerPalettePreview(lightColorScheme.getTonalContainerTokens())).xy(3, row)
            .add(new ContainerPalettePreview(darkColorScheme.getTonalContainerTokens())).xy(5, row);
        row += 2;
        builder.addROLabel("Primary container").xy(1, row)
            .add(new ContainerPalettePreview(lightColorScheme.getPrimaryContainerTokens())).xy(3, row)
            .add(new ContainerPalettePreview(darkColorScheme.getPrimaryContainerTokens())).xy(5, row);

        row += 2;
        builder.addROLabel("Neutral container").xy(1, row)
            .add(new ContainerPreview(lightColorScheme.getNeutralContainerTokens(), "Neutral")).xy(3, row)
            .add(new ContainerPreview(darkColorScheme.getNeutralContainerTokens(), "Neutral")).xy(5, row);
        row += 2;
        builder.addROLabel("Muted container").xy(1, row)
            .add(new ContainerPreview(lightColorScheme.getMutedContainerTokens(), "Muted")).xy(3, row)
            .add(new ContainerPreview(darkColorScheme.getMutedContainerTokens(), "Muted")).xy(5, row);
        row += 2;
        builder.addROLabel("Tonal container").xy(1, row)
            .add(new ContainerPreview(lightColorScheme.getTonalContainerTokens(), "Tonal")).xy(3, row)
            .add(new ContainerPreview(darkColorScheme.getTonalContainerTokens(), "Tonal")).xy(5, row);
        row += 2;
        builder.addROLabel("Primary container").xy(1, row)
            .add(new ContainerPreview(lightColorScheme.getPrimaryContainerTokens(), "Primary")).xy(3, row)
            .add(new ContainerPreview(darkColorScheme.getPrimaryContainerTokens(), "Primary")).xy(5, row);

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
