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
import org.pushingpixels.radiance.demo.theming.main.RadianceLogo;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.skin.*;

import javax.swing.*;

public class SkinContainersDemo extends JFrame {
    private int row = 1;

    public SkinContainersDemo() {
        super("Chroma Palette");

        RadianceLogo.tonalConfigureOn(this);

        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 4dlu, fill:pref:grow, 4dlu, fill:pref:grow, 4dlu, " +
                    "fill:pref:grow, 4dlu, right:pref, 4dlu, fill:pref:grow, 4dlu, " +
                    "fill:pref:grow, 4dlu, fill:pref:grow").
                rows("p, 8dlu, p, $nlg, p, $nlg, p, $nlg, p, $nlg, p, " +
                "$nlg, p, $nlg, p, $nlg, p, $nlg, p, $nlg, p, 12dlu, p, " +
                "$nlg, p, $nlg, p, $nlg, p, $nlg, p, $nlg, p, $nlg, p, " +
                "$nlg, p, $nlg, p").
                padding(Paddings.DIALOG);

        builder.addSeparator("MUTED").xy(3, row, CellConstraints.CENTER, CellConstraints.FILL);
        builder.addSeparator("TONAL").xy(5, row, CellConstraints.CENTER, CellConstraints.FILL);
        builder.addSeparator("SELECTED").xy(7, row, CellConstraints.CENTER, CellConstraints.FILL);
        builder.addSeparator("MUTED").xy(11, row, CellConstraints.CENTER, CellConstraints.FILL);
        builder.addSeparator("TONAL").xy(13, row, CellConstraints.CENTER, CellConstraints.FILL);
        builder.addSeparator("SELECTED").xy(15, row, CellConstraints.CENTER, CellConstraints.FILL);

        row += 2;

        RadianceSkin[] lightSkins = new RadianceSkin[] {
            new AutumnSkin(),
            new BusinessSkin(),
            new BusinessBlackSteelSkin(),
            new BusinessBlueSteelSkin(),
            new CeruleanSkin(),
            new CremeSkin(),
            new CremeCoffeeSkin(),
            new DustSkin(),
            new DustCoffeeSkin(),
            new GeminiSkin(),
            new GreenMagicSkin(),
            new MarinerSkin(),
            new MistAquaSkin(),
            new MistSilverSkin(),
            new ModerateSkin(),
            new NebulaSkin(),
            new NebulaAmethystSkin(),
            new NebulaBrickWallSkin(),
            new SaharaSkin(),
            new SentinelSkin()
        };

        RadianceSkin[] darkSkins = new RadianceSkin[] {
            // all dark
            new GraphiteSkin(),
            new GraphiteAquaSkin(),
            new GraphiteChalkSkin(),
            new GraphiteElectricSkin(),
            new GraphiteGlassSkin(),
            new GraphiteGoldSkin(),
            new GraphiteSiennaSkin(),
            new GraphiteSunsetSkin(),
            new MagellanSkin(),
            new NightShadeSkin(),
            new RavenSkin(),
            new TwilightSkin()
        };

        addSkins(lightSkins, builder);
        addSkins(darkSkins, builder);

        this.add(builder.build());

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void addSkins(RadianceSkin[] skins, FormBuilder builder) {
        int rows = (skins.length + 1) / 2;
        int skinIndex = 0;
        for (int skinRow = 0; skinRow < rows; skinRow++) {
            ContainerColorTokens muted = skins[skinIndex].getContainerTokens(null,
                ComponentState.ENABLED, RadianceThemingSlices.ContainerType.MUTED);
            ContainerColorTokens tonal = skins[skinIndex].getTonalContainerTokens(
                RadianceThemingSlices.DecorationAreaType.NONE);
            ContainerColorTokens selected = skins[skinIndex].getContainerTokens(
                null, ComponentState.SELECTED, RadianceThemingSlices.ContainerType.TONAL);
            builder.addROLabel(skins[skinIndex].getDisplayName()).xy(1, row)
                .add(new ContainerPreview(muted, "Muted", ContainerPreview.Variant.COMPACT)).xy(3, row)
                .add(new ContainerPreview(tonal, "Tonal", ContainerPreview.Variant.COMPACT)).xy(5, row)
                .add(new ContainerPreview(selected, "Selected", ContainerPreview.Variant.COMPACT)).xy(7, row);
            skinIndex++;
            if (skinIndex < skins.length) {
                muted = skins[skinIndex].getContainerTokens(null,
                    ComponentState.ENABLED, RadianceThemingSlices.ContainerType.MUTED);
                tonal = skins[skinIndex].getTonalContainerTokens(
                    RadianceThemingSlices.DecorationAreaType.NONE);
                selected = skins[skinIndex].getContainerTokens(
                    null, ComponentState.SELECTED, RadianceThemingSlices.ContainerType.TONAL);
                builder.addROLabel(skins[skinIndex].getDisplayName()).xy(9, row)
                    .add(new ContainerPreview(muted, "Muted", ContainerPreview.Variant.COMPACT)).xy(11, row)
                    .add(new ContainerPreview(tonal, "Tonal", ContainerPreview.Variant.COMPACT)).xy(13, row)
                    .add(new ContainerPreview(selected, "Selected", ContainerPreview.Variant.COMPACT)).xy(15, row);
            }
            skinIndex++;
            row += 2;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setFocusKind(RadianceThemingSlices.FocusKind.NONE);
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessSkin());
            new SkinContainersDemo().setVisible(true);
        });
    }
}
