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
import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.BaseTonalPalette;
import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;
import org.pushingpixels.radiance.demo.theming.main.RadianceLogo;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;

public class SchemeDemo extends JFrame {
    public SchemeDemo() {
        super("Chroma Palette");

        RadianceLogo.tonalConfigureOn(this);

        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 4dlu, fill:pref:grow, 4dlu, fill:pref:grow").
                rows("p, $lg, p, $lg, p, 12dlu, p, 8dlu, p, $lg, p, " +
                "$lg, p, 12dlu, p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        int row = 1;

        BaseTonalPalette activePalette = TonalPalette.fromHct(Hct.from(300.0, 40.0, 40.0));
        BaseTonalPalette mutedPalette = TonalPalette.fromHct(Hct.from(300.0, 18.0, 40.0));
        BaseTonalPalette neutralPalette = TonalPalette.fromHct(Hct.from(300.0, 8.0, 40.0));

        RadianceColorSchemeBundle lightBundle = new RadianceColorSchemeBundle(
            /* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ activePalette.getHct(80.0),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ mutedPalette.getHct(85.0),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ neutralPalette.getHct(95.0),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* isSystemDark */ false);

        RadianceColorSchemeBundle darkBundle = new RadianceColorSchemeBundle(
            /* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ activePalette.getHct(20.0),
                /* containerConfiguration */ ContainerConfiguration.defaultDark()),
            /* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ mutedPalette.getHct(16.0),
                /* containerConfiguration */ ContainerConfiguration.defaultDark()),
            /* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ neutralPalette.getHct(8.0),
                /* containerConfiguration */ ContainerConfiguration.defaultDark()),
            /* isSystemDark */ false);

        builder.addROLabel("Active palette").xy(1, row, "right, bottom")
            .add(new TonalPalettePreview(activePalette, true))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Muted palette").xy(1, row, "right, bottom")
            .add(new TonalPalettePreview(mutedPalette, false))
            .xyw(3, row, 3);
        row += 2;
        builder.addROLabel("Neutral palette").xy(1, row, "right, bottom")
            .add(new TonalPalettePreview(neutralPalette, false))
            .xyw(3, row, 3);
        row += 2;

        builder.addSeparator("LIGHT").xy(3, row, CellConstraints.CENTER, CellConstraints.FILL);
        builder.addSeparator("DARK").xy(5, row, CellConstraints.CENTER, CellConstraints.FILL);

        row += 2;
        builder.addROLabel("Active container").xy(1, row, "right, bottom")
            .add(new ContainerPalettePreview(lightBundle.getMainColorScheme().getActiveContainerTokens(), true)).xy(3, row)
            .add(new ContainerPalettePreview(darkBundle.getMainColorScheme().getActiveContainerTokens(), true)).xy(5, row);
        row += 2;
        builder.addROLabel("Muted container").xy(1, row, "right, bottom")
            .add(new ContainerPalettePreview(lightBundle.getMainColorScheme().getMutedContainerTokens(), false)).xy(3, row)
            .add(new ContainerPalettePreview(darkBundle.getMainColorScheme().getMutedContainerTokens(), false)).xy(5, row);
        row += 2;
        builder.addROLabel("Neutral container").xy(1, row, "right, bottom")
            .add(new ContainerPalettePreview(lightBundle.getMainColorScheme().getNeutralContainerTokens(), false)).xy(3, row)
            .add(new ContainerPalettePreview(darkBundle.getMainColorScheme().getNeutralContainerTokens(), false)).xy(5, row);

        row += 2;
        builder.addROLabel("Active container").xy(1, row)
            .add(new ContainerPreview(lightBundle.getMainColorScheme().getActiveContainerTokens(), "Tonal")).xy(3, row)
            .add(new ContainerPreview(darkBundle.getMainColorScheme().getActiveContainerTokens(), "Tonal")).xy(5, row);
        row += 2;
        builder.addROLabel("Muted container").xy(1, row)
            .add(new ContainerPreview(lightBundle.getMainColorScheme().getMutedContainerTokens(), "Muted")).xy(3, row)
            .add(new ContainerPreview(darkBundle.getMainColorScheme().getMutedContainerTokens(), "Muted")).xy(5, row);
        row += 2;
        builder.addROLabel("Neutral container").xy(1, row)
            .add(new ContainerPreview(lightBundle.getMainColorScheme().getNeutralContainerTokens(), "Neutral")).xy(3, row)
            .add(new ContainerPreview(darkBundle.getMainColorScheme().getNeutralContainerTokens(), "Neutral")).xy(5, row);

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
            new SchemeDemo().setVisible(true);
        });
    }
}
