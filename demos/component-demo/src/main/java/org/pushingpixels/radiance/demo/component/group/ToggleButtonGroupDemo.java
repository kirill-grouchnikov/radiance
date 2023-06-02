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
package org.pushingpixels.radiance.demo.component.group;

import org.pushingpixels.radiance.component.api.common.JCommandButtonStrip;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandGroup;
import org.pushingpixels.radiance.component.api.common.model.CommandStripPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.CommandToggleGroupModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandStripProjection;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Format_justify_center;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Format_justify_fill;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Format_justify_left;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Format_justify_right;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.MarinerSkin;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ToggleButtonGroupDemo {
    private static void setAlignment(JTextPane textPane, int alignment) {
        MutableAttributeSet attrSet = new SimpleAttributeSet();
        StyleConstants.setAlignment(attrSet, alignment);
        textPane.getStyledDocument().setParagraphAttributes(0,
                textPane.getStyledDocument().getLength(), attrSet, false);
    }

    public static void main(String... args) {
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new MarinerSkin());

            JFrame frame = new JFrame("Text alignment demo");
            frame.setLayout(new BorderLayout());

            // Configure and populate "Lorem ipsum" multiline content
            final JTextPane textPane = new JTextPane();
            textPane.setText(
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
                            "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim" +
                            " veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip " +
                            "ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
                            "voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                            "officia deserunt mollit anim id est laborum.");
            textPane.setEditable(true);
            textPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            // force the display of text selection even when the focus has been lost
            textPane.setCaret(new DefaultCaret() {
                @Override
                public void setSelectionVisible(boolean visible) {
                    super.setSelectionVisible(true);
                }
            });

            frame.add(textPane, BorderLayout.CENTER);

            JPanel styleButtonPanel = new JPanel(new FlowLayout());
            frame.add(styleButtonPanel, BorderLayout.LINE_END);

            CommandToggleGroupModel justifyToggleGroup = new CommandToggleGroupModel();

            // Align left command
            Command commandAlignLeft = Command.builder()
                    .setIconFactory(Format_justify_left.factory())
                    .setAction(commandActionEvent -> setAlignment(textPane, StyleConstants.ALIGN_LEFT))
                    .inToggleGroupAsSelected(justifyToggleGroup)
                    .build();

            // Align center command
            Command commandAlignCenter = Command.builder()
                    .setIconFactory(Format_justify_center.factory())
                    .setAction(commandActionEvent -> setAlignment(textPane, StyleConstants.ALIGN_CENTER))
                    .inToggleGroup(justifyToggleGroup)
                    .build();

            // Align right command
            Command commandAlignRight = Command.builder()
                    .setIconFactory(Format_justify_right.factory())
                    .setAction(commandActionEvent -> setAlignment(textPane, StyleConstants.ALIGN_RIGHT))
                    .inToggleGroup(justifyToggleGroup)
                    .build();

            // Align fill command
            Command commandAlignFill = Command.builder()
                    .setIconFactory(Format_justify_fill.factory())
                    .setAction(commandActionEvent -> setAlignment(textPane, StyleConstants.ALIGN_JUSTIFIED))
                    .inToggleGroup(justifyToggleGroup)
                    .build();

            // Create a button strip to change the text alignment in our text pane.
            CommandStripProjection commandStripProjection = new CommandStripProjection(
                    new CommandGroup(commandAlignLeft, commandAlignCenter,
                            commandAlignRight, commandAlignFill),
                    CommandStripPresentationModel.builder()
                            .setOrientation(CommandStripPresentationModel.StripOrientation.VERTICAL)
                            .setHorizontalGapScaleFactor(0.8)
                            .setVerticalGapScaleFactor(1.4)
                            .build());
            JCommandButtonStrip commandButtonStrip = commandStripProjection.buildComponent();
            styleButtonPanel.add(commandButtonStrip);

            // Show our frame in the center of the screen
            frame.setIconImage(new BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR));
            frame.setSize(new Dimension(600, 300));
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
