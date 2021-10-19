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
package org.pushingpixels.radiance.demo.components.common;

import org.pushingpixels.radiance.demo.components.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.components.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.components.api.common.JCommandButton;
import org.pushingpixels.radiance.components.api.common.model.Command;
import org.pushingpixels.radiance.components.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.components.api.common.model.CommandGroup;
import org.pushingpixels.radiance.components.api.common.model.CommandStripPresentationModel;
import org.pushingpixels.radiance.components.api.common.projection.CommandStripProjection;
import org.pushingpixels.radiance.demo.components.svg.tango.transcoded.*;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;

public class TestButtonStripMultiple extends JFrame {
    /**
     * Creates the test application.
     */
    public TestButtonStripMultiple() {
        this.setLayout(new FlowLayout());

        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        JComponent buttonStrip = new CommandStripProjection(
                new CommandGroup(
                        Command.builder().setIconFactory(Format_justify_left.factory()).build(),
                        Command.builder().setIconFactory(Format_justify_center.factory()).build(),
                        Command.builder().setIconFactory(Format_justify_right.factory()).build()),
                CommandStripPresentationModel.withDefaults())
                .buildComponent();
        this.add(buttonStrip);

        JComponent buttonStrip2 = new CommandStripProjection(
                new CommandGroup(
                        Command.builder().setIconFactory(Format_text_bold.factory()).build(),
                        Command.builder().setIconFactory(Format_text_italic.factory()).build(),
                        Command.builder().setIconFactory(Format_text_underline.factory()).build(),
                        Command.builder()
                                .setIconFactory(Format_text_strikethrough.factory())
                                .setSecondaryContentModel(SamplePopupMenu.getSamplePopupMenuContentModel())
                                .build()),
                CommandStripPresentationModel.withDefaults())
                .buildComponent();
        this.add(buttonStrip2);

        JCommandButton standalone = Command.builder()
                .setIconFactory(Format_justify_left.factory())
                .build().project(CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.SMALL)
                        .setFlat(false)
                        .build())
                .buildComponent();
        this.add(standalone);

        this.setSize(300, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
            TestButtonStripMultiple bst = new TestButtonStripMultiple();
            bst.setVisible(true);
        });
    }
}
