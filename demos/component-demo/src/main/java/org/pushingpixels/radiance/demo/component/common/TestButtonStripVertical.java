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
package org.pushingpixels.radiance.demo.component.common;

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.*;
import org.pushingpixels.radiance.demo.theming.main.check.selector.RadianceLocaleSelector;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandGroup;
import org.pushingpixels.radiance.component.api.common.model.CommandStripPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandStripProjection;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class TestButtonStripVertical extends JFrame {
    private Locale currLocale;

    private JPanel buttonPanel;

    private TestButtonStripVertical() {
        super("Tests for vertical buttons strips");

        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        buttonPanel = getButtonPanel();
        this.add(buttonPanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        controlPanel.add(new RadianceLocaleSelector(false, selected -> {
            currLocale = selected;
            Window window = SwingUtilities.getWindowAncestor(buttonPanel);
            window.applyComponentOrientation(ComponentOrientation.getOrientation(currLocale));
            SwingUtilities.updateComponentTreeUI(window);
        }));
        this.add(controlPanel, BorderLayout.SOUTH);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private JPanel getButtonPanel() {
        FormBuilder builder = FormBuilder.create().
                columns("center:pref, 4dlu, center:pref, 4dlu, center:pref, 4dlu, center:pref, " +
                        "4dlu, center:pref, 4dlu, center:pref").
                rows("p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        builder.add("h1.0-v0.5").xy(1, 1);
        builder.add("h1.0-v0.75").xy(3, 1);
        builder.add("h1.0-v1.0").xy(5, 1);
        builder.add("h0.5-v0.75").xy(7, 1);
        builder.add("h0.75-v0.75").xy(9, 1);
        builder.add("h1.0-v0.75").xy(11, 1);

        builder.add(getStrip1(1.0, 0.5)).xy(1, 3).add(getStrip1(1.0, 0.75)).xy(3, 3).add(
                getStrip1(1.0, 1.0)).xy(5, 3);
        builder.add(getStrip1(0.5, 0.75)).xy(7, 3).add(getStrip1(0.75, 0.75)).xy(9, 3).add(
                getStrip1(1.0, 0.75)).xy(11, 3);

        builder.add(getStrip2(1.0, 0.5)).xy(1, 5).add(getStrip2(1.0, 0.75)).xy(3, 5).add(
                getStrip2(1.0, 1.0)).xy(5, 5);
        builder.add(getStrip2(0.5, 0.75)).xy(7, 5).add(getStrip2(0.75, 0.75)).xy(9, 5).add(
                getStrip2(1.0, 0.75)).xy(11, 5);

        return builder.build();
    }

    private JComponent getStrip1(double hgapScaleFactor, double vgapScaleFactor) {
        return new CommandStripProjection(
                new CommandGroup(
                        Command.builder().setIconFactory(Format_justify_left.factory()).build(),
                        Command.builder().setIconFactory(Format_justify_center.factory()).build(),
                        Command.builder().setIconFactory(Format_justify_right.factory()).build()),
                CommandStripPresentationModel.builder()
                        .setCommandPresentationState(CommandButtonPresentationState.SMALL)
                        .setOrientation(CommandStripPresentationModel.StripOrientation.VERTICAL)
                        .setHorizontalGapScaleFactor(hgapScaleFactor)
                        .setVerticalGapScaleFactor(vgapScaleFactor)
                        .build())
                .buildComponent();
    }

    private JComponent getStrip2(double hgapScaleFactor, double vgapScaleFactor) {
        return new CommandStripProjection(
                new CommandGroup(
                        Command.builder().setIconFactory(Format_text_bold.factory()).build(),
                        Command.builder().setIconFactory(Format_text_italic.factory()).build(),
                        Command.builder().setIconFactory(Format_text_underline.factory()).build(),
                        Command.builder().setIconFactory(Format_text_strikethrough.factory())
                                .build()),
                CommandStripPresentationModel.builder()
                        .setCommandPresentationState(CommandButtonPresentationState.SMALL)
                        .setOrientation(CommandStripPresentationModel.StripOrientation.VERTICAL)
                        .setHorizontalGapScaleFactor(hgapScaleFactor)
                        .setVerticalGapScaleFactor(vgapScaleFactor)
                        .build())
                .buildComponent();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessSkin());
            new TestButtonStripVertical().setVisible(true);
        });
    }
}
