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
import org.pushingpixels.radiance.components.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.components.api.common.model.Command;
import org.pushingpixels.radiance.components.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestCommandButtonsAlignment extends JFrame {
    ResourceBundle resourceBundle;

    Locale currLocale;

    private TestCommandButtonsAlignment() {
        super("Alignment");
        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.setLayout(new BorderLayout());

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.demo.flamingo.resource.Resources", currLocale);

        Command pasteActionCommand = Command.builder()
                .setText(resourceBundle.getString("Paste.text"))
                .setIconFactory(Edit_paste.factory())
                .setExtraText(resourceBundle.getString("Paste.textExtra"))
                .setAction(commandActionEvent -> System.out.println(stamp() + ": Main paste"))
                .build();

        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 10dlu, 24dlu, 10dlu, 48dlu, 10dlu, 96dlu").
                rows("p, $lg, p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        builder.add("SMALL").xy(3, 1);
        builder.add("MEDIUM").xy(5, 1);
        builder.add("TILE").xy(7, 1);

        builder.add("leading").xy(1, 3);
        builder.add(pasteActionCommand.project(
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.SMALL)
                        .setHorizontalAlignment(SwingUtilities.LEADING)
                        .setFlat(false)
                        .build())
                .buildComponent()).xy(3, 3);
        builder.add(pasteActionCommand.project(
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.MEDIUM)
                        .setHorizontalAlignment(SwingUtilities.LEADING)
                        .setFlat(false)
                        .build())
                .buildComponent()).xy(5, 3);
        builder.add(pasteActionCommand.project(
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.TILE)
                        .setHorizontalAlignment(SwingUtilities.LEADING)
                        .setFlat(false)
                        .build())
                .buildComponent()).xy(7, 3);

        builder.add("center").xy(1, 5);
        builder.add(pasteActionCommand.project(
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.SMALL)
                        .setHorizontalAlignment(SwingUtilities.CENTER)
                        .setFlat(false)
                        .build())
                .buildComponent()).xy(3, 5);
        builder.add(pasteActionCommand.project(
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.MEDIUM)
                        .setHorizontalAlignment(SwingUtilities.CENTER)
                        .setFlat(false)
                        .build())
                .buildComponent()).xy(5, 5);
        builder.add(pasteActionCommand.project(
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.TILE)
                        .setHorizontalAlignment(SwingUtilities.CENTER)
                        .setFlat(false)
                        .build())
                .buildComponent()).xy(7, 5);

        builder.add("trailing").xy(1, 7);
        builder.add(pasteActionCommand.project(
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.SMALL)
                        .setHorizontalAlignment(SwingUtilities.TRAILING)
                        .setFlat(false)
                        .build())
                .buildComponent()).xy(3, 7);
        builder.add(pasteActionCommand.project(
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.MEDIUM)
                        .setHorizontalAlignment(SwingUtilities.TRAILING)
                        .setFlat(false)
                        .build())
                .buildComponent()).xy(5, 7);
        builder.add(pasteActionCommand.project(
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.TILE)
                        .setHorizontalAlignment(SwingUtilities.TRAILING)
                        .setFlat(false)
                        .build())
                .buildComponent()).xy(7, 7);

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
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessSkin());
            TestCommandButtonsAlignment frame = new TestCommandButtonsAlignment();
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        });
    }
}
