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

import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_center;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_fill;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_left;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Format_justify_right;
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandGroup;
import org.pushingpixels.flamingo.api.common.model.CommandStripPresentationModel;
import org.pushingpixels.flamingo.api.common.model.CommandToggleGroupModel;
import org.pushingpixels.flamingo.api.common.projection.CommandStripProjection;
import org.pushingpixels.radiance.laf.api.ComponentState;
import org.pushingpixels.radiance.laf.api.RadianceLafCortex;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices;
import org.pushingpixels.radiance.laf.api.skin.MarinerSkin;
import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.animation.api.swing.SwingComponentTimeline;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TestCommandToggleButtonsSameGroupModel extends JFrame {
    private TestCommandToggleButtonsSameGroupModel() {
        super("Selection state sync");

        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceLafCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        RadianceLafSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceLafSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        CommandToggleGroupModel justifyToggleGroup = new CommandToggleGroupModel();

        Command justifyLeft = Command.builder()
                .setText("left")
                .setIconFactory(Format_justify_left.factory())
                .inToggleGroupAsSelected(justifyToggleGroup)
                .build();
        Command justifyCenter = Command.builder()
                .setText("center")
                .setIconFactory(Format_justify_center.factory())
                .inToggleGroup(justifyToggleGroup)
                .build();
        Command justifyRight = Command.builder()
                .setText("right")
                .setIconFactory(Format_justify_right.factory())
                .inToggleGroup(justifyToggleGroup)
                .build();
        Command justifyFill = Command.builder()
                .setText("fill")
                .setIconFactory(Format_justify_fill.factory())
                .inToggleGroup(justifyToggleGroup)
                .build();

        this.setLayout(new BorderLayout());

        JPanel contentPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        contentPanel.setBorder(new EmptyBorder(8, 8, 8, 8));

        JLabel instructional = new JLabel("Selection state is synced across the strips below");
        // create a looping animation to change the label foreground
        // from black to blue and back to draw some attention.
        SwingComponentTimeline.componentBuilder(instructional)
                .addPropertyToInterpolate("foreground", Color.black, Color.blue)
                .setDuration(1000)
                .playLoop(Timeline.RepeatBehavior.REVERSE);

        instructional.setFont(instructional.getFont().deriveFont(Font.BOLD));
        instructional.setBorder(new EmptyBorder(0, 0, 12, 0));
        contentPanel.add(instructional);

        // Three rows of toggle buttons with selection sync
        CommandGroup justifyCommandGroup =
                new CommandGroup(justifyLeft, justifyCenter, justifyRight, justifyFill);
        contentPanel.add(new CommandStripProjection(justifyCommandGroup,
                CommandStripPresentationModel.builder()
                        .setCommandPresentationState(CommandButtonPresentationState.SMALL)
                        .build())
                .buildComponent());
        contentPanel.add(new CommandStripProjection(justifyCommandGroup,
                CommandStripPresentationModel.builder()
                        .setCommandPresentationState(CommandButtonPresentationState.MEDIUM)
                        .build())
                .buildComponent());
        contentPanel.add(new CommandStripProjection(justifyCommandGroup,
                CommandStripPresentationModel.builder()
                        .setCommandPresentationState(CommandButtonPresentationState.BIG)
                        .build())
                .buildComponent());
        this.add(contentPanel, BorderLayout.CENTER);

        this.setSize(400, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceLafCortex.GlobalScope.setSkin(new MarinerSkin());

            new TestCommandToggleButtonsSameGroupModel().setVisible(true);
        });
    }
}
