/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.plasma.group

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.demo.plasma.svg.Format_text_bold
import org.pushingpixels.demo.plasma.svg.Format_text_italic
import org.pushingpixels.demo.plasma.svg.Format_text_strikethrough
import org.pushingpixels.demo.plasma.svg.Format_text_underline
import org.pushingpixels.flamingo.api.common.model.CommandStripPresentationModel
import org.pushingpixels.meteor.swing.CharacterStyleType
import org.pushingpixels.meteor.swing.hasStyleInSelection
import org.pushingpixels.meteor.swing.toggleStyleInSelection
import org.pushingpixels.plasma.command
import org.pushingpixels.plasma.commandButtonStrip
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.skin.GeminiSkin
import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.image.BufferedImage
import java.util.*
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.JTextPane
import javax.swing.WindowConstants
import javax.swing.border.EmptyBorder
import javax.swing.text.DefaultCaret

fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        SubstanceCortex.GlobalScope.setSkin(GeminiSkin())

        val frame = JFrame("Text styling demo")
        frame.layout = BorderLayout()

        // Configure and populate "Lorem ipsum" multiline content
        val textPane = JTextPane()
        textPane.text =
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
        textPane.isEditable = false
        textPane.border = EmptyBorder(12, 12, 12, 12)
        // force the display of text selection even when the focus has been lost
        textPane.caret = object : DefaultCaret() {
            override fun setSelectionVisible(visible: Boolean) {
                super.setSelectionVisible(true)
            }
        }

        frame.add(textPane, BorderLayout.CENTER)

        val styleButtonPanel = JPanel(FlowLayout())
        frame.add(styleButtonPanel, BorderLayout.LINE_END)

        val resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.demo.plasma.resources.Resources", Locale.getDefault())

        val commandBold = command {
            iconFactory = Format_text_bold.factory()
            action = {
                textPane.toggleStyleInSelection(CharacterStyleType.STYLE_BOLD)
                isToggleSelected = textPane.hasStyleInSelection(CharacterStyleType.STYLE_BOLD)
            }
            isToggle = true
            isActionEnabled = false
            actionRichTooltip {
                title = resourceBundle.getString("FontBold.tooltip.textActionTitle")
                description = resourceBundle.getString("FontBold.tooltip.textActionParagraph1")
            }
        }

        val commandItalic = command {
            iconFactory = Format_text_italic.factory()
            action = {
                textPane.toggleStyleInSelection(CharacterStyleType.STYLE_ITALIC)
                isToggleSelected = textPane.hasStyleInSelection(CharacterStyleType.STYLE_ITALIC)
            }
            isToggle = true
            isActionEnabled = false
            actionRichTooltip {
                title = resourceBundle.getString("FontItalic.tooltip.textActionTitle")
                description = resourceBundle.getString("FontItalic.tooltip.textActionParagraph1")
            }
        }

        val commandUnderline = command {
            iconFactory = Format_text_underline.factory()
            action = {
                textPane.toggleStyleInSelection(CharacterStyleType.STYLE_UNDERLINE)
                isToggleSelected = textPane.hasStyleInSelection(CharacterStyleType.STYLE_UNDERLINE)
            }
            isToggle = true
            isActionEnabled = false
            actionRichTooltip {
                title = resourceBundle.getString("FontUnderline.tooltip.textActionTitle")
                description = resourceBundle.getString("FontUnderline.tooltip.textActionParagraph1")
            }
        }

        val commandStrikethrough = command {
            iconFactory = Format_text_strikethrough.factory()
            action = {
                textPane.toggleStyleInSelection(CharacterStyleType.STYLE_STRIKETHROUGH)
                isToggleSelected = textPane.hasStyleInSelection(CharacterStyleType.STYLE_STRIKETHROUGH)
            }
            isToggle = true
            isActionEnabled = false
            actionRichTooltip {
                title = resourceBundle.getString("FontStrikethrough.tooltip.textActionTitle")
                description = resourceBundle.getString("FontStrikethrough.tooltip.textActionParagraph1")
            }
        }

        // Create a button strip to change the text styling in our text pane.
        val commandStyleStrip = commandButtonStrip {
            +commandBold
            +commandItalic
            +commandUnderline
            +commandStrikethrough

            presentation {
                orientation = CommandStripPresentationModel.StripOrientation.VERTICAL
                horizontalGapScaleFactor = 0.8
                verticalGapScaleFactor = 1.4
            }
        }

        styleButtonPanel.add(commandStyleStrip.toJavaButtonStrip())

        textPane.addCaretListener {
            // Compute selection presence
            val hasSelection = (textPane.selectionEnd - textPane.selectionStart) > 0
            // Enable or disable the style commands based on that
            commandBold.isActionEnabled = hasSelection
            commandItalic.isActionEnabled = hasSelection
            commandUnderline.isActionEnabled = hasSelection
            commandStrikethrough.isActionEnabled = hasSelection

            // For each command, determine if its toggle selection is on based on
            // the presence of the matching style in the text pane selection
            commandBold.isToggleSelected = textPane.hasStyleInSelection(
                    CharacterStyleType.STYLE_BOLD)
            commandItalic.isToggleSelected = textPane.hasStyleInSelection(
                    CharacterStyleType.STYLE_ITALIC)
            commandUnderline.isToggleSelected = textPane.hasStyleInSelection(
                    CharacterStyleType.STYLE_UNDERLINE)
            commandStrikethrough.isToggleSelected = textPane.hasStyleInSelection(
                    CharacterStyleType.STYLE_STRIKETHROUGH)
        }

        // Show our frame in the center of the screen
        frame.iconImage = BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR)
        frame.size = Dimension(600, 300)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE

        frame.isVisible = true
    }
}
