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
package org.pushingpixels.demo.flamingo;

import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.photon.api.icon.SvgBatikResizableIcon;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.colorscheme.LimeGreenColorScheme;
import org.pushingpixels.substance.api.colorscheme.SteelBlueColorScheme;
import org.pushingpixels.substance.api.colorscheme.SunfireRedColorScheme;
import org.pushingpixels.substance.api.skin.MarinerSkin;

import javax.swing.*;
import java.awt.*;

public class IconFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new MarinerSkin());
            JFrame.setDefaultLookAndFeelDecorated(true);

            JFrame frame = new JFrame("Icons");
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setIconImage(RadianceLogo.getLogoImage(frame,
                    SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                            SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                            SubstanceSlices.ColorSchemeAssociationKind.FILL,
                            ComponentState.ENABLED)));

            frame.setLayout(new FlowLayout(FlowLayout.CENTER));

            CommandButtonPresentationModel presentationModel =
                    CommandButtonPresentationModel.builder().setPresentationState(
                            CommandButtonPresentationState.MEDIUM
                    ).setFlat(false).build();

            Command originalCommand = Command.builder()
                    .setText("None")
                    .setIconFactory(() -> SvgBatikResizableIcon.getSvgIcon(
                            IconFrame.class.getResourceAsStream("svg/radiance_menu.svg"),
                            NeonCortex.getScaleFactor(frame),
                            new Dimension(16, 16)
                    ))
                    .build();
            frame.add(originalCommand.project(presentationModel).buildComponent());

            Command redCommand = Command.builder()
                    .setText("Red")
                    .setIconFactory(() -> NeonCortex.colorizeIcon(
                            () -> SvgBatikResizableIcon.getSvgIcon(
                                    IconFrame.class.getResourceAsStream("svg/radiance_menu.svg"),
                                    NeonCortex.getScaleFactor(frame),
                                    new Dimension(16, 16)),
                            Color.red
                    ))
                    .build();
            frame.add(redCommand.project(presentationModel).buildComponent());

            Command greenCommand = Command.builder()
                    .setText("Green")
                    .setIconFactory(() -> NeonCortex.colorizeIcon(
                            () -> SvgBatikResizableIcon.getSvgIcon(
                                    IconFrame.class.getResourceAsStream("svg/radiance_menu.svg"),
                                    NeonCortex.getScaleFactor(frame),
                                    new Dimension(16, 16)),
                            new Color(0, 128, 0)
                    ))
                    .build();
            frame.add(greenCommand.project(presentationModel).buildComponent());

            Command blueCommand = Command.builder()
                    .setText("Red")
                    .setIconFactory(() -> NeonCortex.colorizeIcon(
                            () -> SvgBatikResizableIcon.getSvgIcon(
                                    IconFrame.class.getResourceAsStream("svg/radiance_menu.svg"),
                                    NeonCortex.getScaleFactor(frame),
                                    new Dimension(16, 16)),
                            Color.blue
                    ))
                    .build();
            frame.add(blueCommand.project(presentationModel).buildComponent());

            Command originalTangoCommand = Command.builder()
                    .setText("None")
                    .setIconFactory(() -> SvgBatikResizableIcon.getSvgIcon(
                            IconFrame.class.getResourceAsStream("svg/tango/Edit-paste.svg"),
                            NeonCortex.getScaleFactor(frame),
                            new Dimension(16, 16)
                    ))
                    .build();
            frame.add(originalTangoCommand.project(presentationModel).buildComponent());

            Command redTangoCommand = Command.builder()
                    .setText("Red")
                    .setIconFactory(() -> SubstanceCortex.GlobalScope.colorizeIcon(
                            () -> SvgBatikResizableIcon.getSvgIcon(
                                    IconFrame.class.getResourceAsStream("svg/tango/Edit-paste.svg"),
                                    NeonCortex.getScaleFactor(frame),
                                    new Dimension(16, 16)
                            ),
                            new SunfireRedColorScheme(),
                            1.0f
                    ))
                    .build();
            frame.add(redTangoCommand.project(presentationModel).buildComponent());

            Command greenTangoCommand = Command.builder()
                    .setText("Green")
                    .setIconFactory(() -> SubstanceCortex.GlobalScope.colorizeIcon(
                            () -> SvgBatikResizableIcon.getSvgIcon(
                                    IconFrame.class.getResourceAsStream("svg/tango/Edit-paste.svg"),
                                    NeonCortex.getScaleFactor(frame),
                                    new Dimension(16, 16)
                            ),
                            new LimeGreenColorScheme(),
                            1.0f
                    ))
                    .build();
            frame.add(greenTangoCommand.project(presentationModel).buildComponent());

            Command blueTangoCommand = Command.builder()
                    .setText("Blue")
                    .setIconFactory(() -> SubstanceCortex.GlobalScope.colorizeIcon(
                            () -> SvgBatikResizableIcon.getSvgIcon(
                                    IconFrame.class.getResourceAsStream("svg/tango/Edit-paste.svg"),
                                    NeonCortex.getScaleFactor(frame),
                                    new Dimension(16, 16)
                            ),
                            new SteelBlueColorScheme(),
                            1.0f
                    ))
                    .build();
            frame.add(blueTangoCommand.project(presentationModel).buildComponent());

            frame.setVisible(true);
        });
    }
}
