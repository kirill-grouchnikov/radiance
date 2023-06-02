/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.component.common;

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.component.api.common.HorizontalAlignment;
import org.pushingpixels.radiance.component.api.common.model.LabelContentModel;
import org.pushingpixels.radiance.component.api.common.model.LabelPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.LabelProjection;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.demo.component.svg.material.transcoded.info_black_24dp;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestExoLabels extends JFrame {
    ResourceBundle resourceBundle;

    Locale currLocale;

    private TestExoLabels() {
        super("Exo labels");
        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.setLayout(new BorderLayout());

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.radiance.demo.component.resource.Resources", currLocale);

        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 10dlu, 120dlu").
                rows("p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        Font defaultFont = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet().getControlFont();

        builder.add("Regular").xy(1, 1);
        builder.add(new LabelProjection(
                LabelContentModel.builder().setText("Sample label").build(),
                LabelPresentationModel.builder().build()
        ).buildComponent()).xy(3, 1);

        builder.add("Bold").xy(1, 3);
        builder.add(new LabelProjection(
                LabelContentModel.builder().setText("Sample label").build(),
                LabelPresentationModel.builder().setFont(defaultFont.deriveFont(Font.BOLD)).build()
        ).buildComponent()).xy(3, 3);

        builder.add("With icon").xy(1, 5);
        builder.add(new LabelProjection(
                LabelContentModel.builder().setText("Sample label")
                        .setIconFactory(info_black_24dp.factory()).build(),
                LabelPresentationModel.builder().build()
        ).buildComponent()).xy(3, 5);

        builder.add("Bold with icon").xy(1, 7);
        builder.add(new LabelProjection(
                LabelContentModel.builder().setText("Sample label")
                        .setIconFactory(info_black_24dp.factory()).build(),
                LabelPresentationModel.builder().setFont(defaultFont.deriveFont(Font.BOLD)).build()
        ).buildComponent()).xy(3, 7);

        builder.add("Center aligned").xy(1, 9);
        builder.add(new LabelProjection(
                LabelContentModel.builder().setText("Sample label").build(),
                LabelPresentationModel.builder().setHorizontalAlignment(HorizontalAlignment.CENTER).build()
        ).buildComponent()).xy(3, 9);

        builder.add("End aligned").xy(1, 11);
        builder.add(new LabelProjection(
                LabelContentModel.builder().setText("Sample label").build(),
                LabelPresentationModel.builder().setHorizontalAlignment(HorizontalAlignment.TRAILING).build()
        ).buildComponent()).xy(3, 11);

        builder.add("Center aligned with icon").xy(1, 13);
        builder.add(new LabelProjection(
                LabelContentModel.builder().setText("Sample label")
                        .setIconFactory(info_black_24dp.factory()).build(),
                LabelPresentationModel.builder().setHorizontalAlignment(HorizontalAlignment.CENTER).build()
        ).buildComponent()).xy(3, 13);

        builder.add("End aligned with icon").xy(1, 15);
        builder.add(new LabelProjection(
                LabelContentModel.builder().setText("Sample label")
                        .setIconFactory(info_black_24dp.factory()).build(),
                LabelPresentationModel.builder().setHorizontalAlignment(HorizontalAlignment.TRAILING).build()
        ).buildComponent()).xy(3, 15);

        this.add(builder.build(), BorderLayout.CENTER);
    }

    /**
     * Main method for testing.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessSkin());
            TestExoLabels frame = new TestExoLabels();
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        });
    }
}
