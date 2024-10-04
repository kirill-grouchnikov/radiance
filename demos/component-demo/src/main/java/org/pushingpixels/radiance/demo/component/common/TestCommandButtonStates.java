/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;
import org.pushingpixels.radiance.theming.api.skin.CremeSkin;

import javax.swing.*;
import java.awt.*;

public class TestCommandButtonStates extends JFrame {
    private Command command1;
    private Command command2;
    private Command command3;

    TestCommandButtonStates() {
        super("Command button test");
        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.setLayout(new FlowLayout());

        this.command1 = Command.builder()
                .setText("Command 1")
                .setAction(commandActionEvent -> {
                    command1.setActionEnabled(false);
                    command2.setActionEnabled(!command2.isActionEnabled());
                })
                .build();
        this.command2 = Command.builder()
                .setText("Command 2")
                .setAction(commandActionEvent -> {
                    command2.setActionEnabled(false);
                    command3.setActionEnabled(!command3.isActionEnabled());
                })
                .build();
        this.command3 = Command.builder()
                .setText("Command 3")
                .setAction(commandActionEvent -> {
                    command3.setActionEnabled(false);
                    command1.setActionEnabled(!command1.isActionEnabled());
                })
                .build();


        CommandButtonPresentationModel presentationModel =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.MEDIUM)
                        .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.ALWAYS)
                        .build();

        this.add(this.command1.project(presentationModel).buildComponent());
        this.add(this.command2.project(presentationModel).buildComponent());
        this.add(this.command3.project(presentationModel).buildComponent());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new CremeSkin());
            TestCommandButtonStates frame = new TestCommandButtonStates();
            frame.setSize(600, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        });

    }
}
