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
package org.pushingpixels.radiance.demo.component.group;

import org.pushingpixels.radiance.component.api.common.JCommandButtonStrip;
import org.pushingpixels.radiance.component.api.common.RichTooltip;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandGroup;
import org.pushingpixels.radiance.component.api.common.model.CommandStripPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandStripProjection;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Format_text_bold;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Format_text_italic;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Format_text_strikethrough;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Format_text_underline;
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
import java.util.Locale;
import java.util.ResourceBundle;

public class ButtonGroupDemo {
    private static boolean hasStyleInSelection(JTextPane textPane, Object style) {
        for (int index = textPane.getSelectionStart(); index < textPane.getSelectionEnd(); index++) {
            Object attr = textPane.getStyledDocument().getCharacterElement(index)
                    .getAttributes().getAttribute(style);
            if (attr instanceof Boolean) {
                if ((Boolean) attr) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void toggleStyleInSelection(JTextPane textPane, Object style) {
        MutableAttributeSet attrSet = new SimpleAttributeSet();
        // Add or remove the style on the entire selection
        attrSet.addAttribute(style, !hasStyleInSelection(textPane, style));
        textPane.getStyledDocument().setCharacterAttributes(textPane.getSelectionStart(),
                textPane.getSelectionEnd() - textPane.getSelectionStart(),
                attrSet, false);
    }

    public static void main(String... args) {
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new MarinerSkin());

            JFrame frame = new JFrame("Text styling demo");
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

            ResourceBundle resourceBundle = ResourceBundle.getBundle(
                    "org.pushingpixels.radiance.demo.component.resource.Resources",
                    Locale.getDefault());

            // Bold style command
            Command commandBold = Command.builder()
                    .setIconFactory(Format_text_bold.factory())
                    .setAction(commandActionEvent -> {
                        // toggle bold in current selection
                        toggleStyleInSelection(textPane, StyleConstants.CharacterConstants.Bold);
                        // and update command selection state based on the presence of bold
                        commandActionEvent.getCommand().setToggleSelected(
                                hasStyleInSelection(textPane,
                                        StyleConstants.CharacterConstants.Bold));
                    })
                    .setToggle()
                    .setActionEnabled(false)
                    .setActionRichTooltip(RichTooltip.builder()
                            .setTitle(resourceBundle.getString("FontBold.tooltip.textActionTitle"))
                            .addDescriptionSection(resourceBundle.getString(
                                    "FontBold.tooltip.textActionParagraph1"))
                            .build())
                    .build();

            // Italic style command
            Command commandItalic = Command.builder()
                    .setIconFactory(Format_text_italic.factory())
                    .setAction(commandActionEvent -> {
                        // toggle italic in current selection
                        toggleStyleInSelection(textPane, StyleConstants.CharacterConstants.Italic);
                        // and update command selection state based on the presence of italic
                        commandActionEvent.getCommand().setToggleSelected(
                                hasStyleInSelection(textPane,
                                        StyleConstants.CharacterConstants.Italic));
                    })
                    .setToggle()
                    .setActionEnabled(false)
                    .setActionRichTooltip(RichTooltip.builder()
                            .setTitle(resourceBundle.getString("FontItalic.tooltip.textActionTitle"))
                            .addDescriptionSection(resourceBundle.getString(
                                    "FontItalic.tooltip.textActionParagraph1"))
                            .build())
                    .build();

            // Underline style command
            Command commandUnderline = Command.builder()
                    .setIconFactory(Format_text_underline.factory())
                    .setAction(commandActionEvent -> {
                        // toggle underline in current selection
                        toggleStyleInSelection(textPane,
                                StyleConstants.CharacterConstants.Underline);
                        // and update command selection state based on the presence of underline
                        commandActionEvent.getCommand().setToggleSelected(
                                hasStyleInSelection(textPane,
                                        StyleConstants.CharacterConstants.Underline));
                    })
                    .setToggle()
                    .setActionEnabled(false)
                    .setActionRichTooltip(RichTooltip.builder()
                            .setTitle(resourceBundle.getString(
                                    "FontUnderline.tooltip.textActionTitle"))
                            .addDescriptionSection(resourceBundle.getString(
                                    "FontUnderline.tooltip.textActionParagraph1"))
                            .build())
                    .build();

            // Strikethrough style command
            Command commandStrikethrough = Command.builder()
                    .setIconFactory(Format_text_strikethrough.factory())
                    .setAction(commandActionEvent -> {
                        // toggle strikethrough in current selection
                        toggleStyleInSelection(textPane,
                                StyleConstants.CharacterConstants.StrikeThrough);
                        // and update command selection state based on the presence of strikethrough
                        commandActionEvent.getCommand().setToggleSelected(
                                hasStyleInSelection(textPane,
                                        StyleConstants.CharacterConstants.StrikeThrough));
                    })
                    .setToggle()
                    .setActionEnabled(false)
                    .setActionRichTooltip(RichTooltip.builder()
                            .setTitle(resourceBundle.getString(
                                    "FontStrikethrough.tooltip.textActionTitle"))
                            .addDescriptionSection(resourceBundle.getString(
                                    "FontStrikethrough.tooltip.textActionParagraph1"))
                            .build())
                    .build();

            textPane.addCaretListener(caretEvent -> {
                // Compute selection presence
                boolean hasSelection =
                        (textPane.getSelectionEnd() - textPane.getSelectionStart()) > 0;
                // Enable or disable the style commands based on that
                commandBold.setActionEnabled(hasSelection);
                commandItalic.setActionEnabled(hasSelection);
                commandUnderline.setActionEnabled(hasSelection);
                commandStrikethrough.setActionEnabled(hasSelection);

                // For each command, determine whether its toggle selection is "on" based on
                // the presence of the matching style in the text pane selection
                commandBold.setToggleSelected(hasStyleInSelection(textPane,
                        StyleConstants.CharacterConstants.Bold));
                commandItalic.setToggleSelected(hasStyleInSelection(textPane,
                        StyleConstants.CharacterConstants.Italic));
                commandUnderline.setToggleSelected(hasStyleInSelection(textPane,
                        StyleConstants.CharacterConstants.Underline));
                commandStrikethrough.setToggleSelected(hasStyleInSelection(textPane,
                        StyleConstants.CharacterConstants.StrikeThrough));
            });

            // Create a button strip to change the text styling in our text pane.
            CommandStripProjection commandStripProjection = new CommandStripProjection(
                    new CommandGroup(commandBold, commandItalic, commandUnderline,
                            commandStrikethrough),
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
