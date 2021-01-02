/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.flamingo.common;

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Edit_paste;
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestCommandButtonsGapScale extends JFrame {
    ResourceBundle resourceBundle;

    Locale currLocale;

    private TestCommandButtonsGapScale() {
        super("Gap scaling");
        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.setLayout(new BorderLayout());

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.demo.flamingo.resource.Resources", currLocale);

        FormBuilder builder = FormBuilder.create().
                columns("center:pref, 10dlu, center:pref, 10dlu, center:pref").
                rows("p, $lg, p").
                padding(Paddings.DIALOG);

        builder.add(Command.builder()
                .setText("hgapScale=1.0")
                .setIconFactory(Edit_paste.factory())
                .build().project(
                        CommandButtonPresentationModel.builder()
                                .setPresentationState(CommandButtonPresentationState.MEDIUM)
                                .setHorizontalGapScaleFactor(1.0f)
                                .setFlat(false)
                                .build())
                .buildComponent()).xy(1, 1);
        builder.add(Command.builder()
                .setText("hgapScale=2.0")
                .setIconFactory(Edit_paste.factory())
                .build().project(
                        CommandButtonPresentationModel.builder()
                                .setPresentationState(CommandButtonPresentationState.MEDIUM)
                                .setHorizontalGapScaleFactor(2.0f)
                                .setFlat(false)
                                .build())
                .buildComponent()).xy(3, 1);
        builder.add(Command.builder()
                .setText("hgapScale=3.0")
                .setIconFactory(Edit_paste.factory())
                .build().project(
                        CommandButtonPresentationModel.builder()
                                .setPresentationState(CommandButtonPresentationState.MEDIUM)
                                .setHorizontalGapScaleFactor(3.0f)
                                .setFlat(false)
                                .build())
                .buildComponent()).xy(5, 1);

        builder.add(Command.builder()
                .setText("vgapScale=1.0")
                .setIconFactory(Edit_paste.factory())
                .build().project(
                        CommandButtonPresentationModel.builder()
                                .setPresentationState(CommandButtonPresentationState.BIG)
                                .setVerticalGapScaleFactor(1.0f)
                                .setFlat(false)
                                .build())
                .buildComponent()).xy(1, 3);
        builder.add(Command.builder()
                .setText("vgapScale=2.0")
                .setIconFactory(Edit_paste.factory())
                .build().project(
                        CommandButtonPresentationModel.builder()
                                .setPresentationState(CommandButtonPresentationState.BIG)
                                .setVerticalGapScaleFactor(2.0f)
                                .setFlat(false)
                                .build())
                .buildComponent()).xy(3, 3);
        builder.add(Command.builder()
                .setText("vgapScale=3.0")
                .setIconFactory(Edit_paste.factory())
                .build().project(
                        CommandButtonPresentationModel.builder()
                                .setPresentationState(CommandButtonPresentationState.BIG)
                                .setVerticalGapScaleFactor(3.0f)
                                .setFlat(false)
                                .build())
                .buildComponent()).xy(5, 3);

        this.add(builder.build(), BorderLayout.CENTER);
    }

    private static String stamp() {
        return new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
    }

    /**
     * Main method for testing.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());
            TestCommandButtonsGapScale frame = new TestCommandButtonsGapScale();
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        });
    }
}
