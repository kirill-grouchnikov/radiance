/*
 * Copyright (c) 2018 Radiance Kormorant Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Kormorant Kirill Grouchnikov nor the names of
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
package org.pushingpixels.demo.kormorant.group

import org.pushingpixels.demo.kormorant.svg.Format_text_bold
import org.pushingpixels.demo.kormorant.svg.Format_text_italic
import org.pushingpixels.demo.kormorant.svg.Format_text_strikethrough
import org.pushingpixels.demo.kormorant.svg.Format_text_underline
import org.pushingpixels.flamingo.api.common.JCommandButtonStrip
import org.pushingpixels.kormorant.commandButtonStrip
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.skin.BusinessSkin
import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.event.ActionListener
import java.awt.image.BufferedImage
import java.util.*
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.JTextPane
import javax.swing.SwingUtilities
import javax.swing.border.EmptyBorder
import javax.swing.text.SimpleAttributeSet
import javax.swing.text.StyleConstants

// Extension function on JTextPane to check presence of content style
fun JTextPane.hasStyleInSelection(style: Any): Boolean {
    for (index in this.selectionStart until this.selectionEnd) {
        val attr = this.styledDocument.getCharacterElement(index).attributes?.getAttribute(style)
        if ((attr is Boolean) && attr) {
            return true
        }
    }
    return false
}

// Extension function on JTextPane to toggle content style
fun JTextPane.toggleStyleInSelection(style: Any) {
    val attrSet = SimpleAttributeSet()
    // Add or remove the style on the entire selection
    attrSet.addAttribute(style, !hasStyleInSelection(style))
    this.styledDocument.setCharacterAttributes(this.selectionStart,
            this.selectionEnd - this.selectionStart,
            attrSet, false)
}

fun main(args: Array<String>) {
    SwingUtilities.invokeLater {
        SubstanceCortex.GlobalScope.setSkin(BusinessSkin())

        val frame = JFrame("Text styling demo")
        frame.layout = BorderLayout()

        // Configure and populate "Lorem ipsum" multiline content
        val textPane = JTextPane()
        textPane.text =
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
        textPane.isEditable = false
        textPane.border = EmptyBorder(12, 12, 12, 12)

        frame.add(textPane, BorderLayout.CENTER)

        val styleButtonPanel = JPanel(FlowLayout())
        frame.add(styleButtonPanel, BorderLayout.LINE_END)

        val resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.demo.kormorant.resources.Resources", Locale.getDefault())

        // Create a button strip to change the text styling in our text pane.
        val commandStyleStrip = commandButtonStrip {
            command {
                icon = Format_text_bold.of(16, 16)
                action = ActionListener {
                    textPane.toggleStyleInSelection(StyleConstants.CharacterConstants.Bold)
                }
                isEnabled = false
                actionRichTooltip {
                    title = resourceBundle.getString("FontBold.tooltip.textActionTitle")
                    description {
                        +resourceBundle.getString("FontBold.tooltip.textActionParagraph1")
                    }
                }
            }
            command {
                icon = Format_text_italic.of(16, 16)
                action = ActionListener {
                    textPane.toggleStyleInSelection(StyleConstants.CharacterConstants.Italic)
                }
                isEnabled = false
                actionRichTooltip {
                    title = resourceBundle.getString("FontItalic.tooltip.textActionTitle")
                    description {
                        +resourceBundle.getString("FontItalic.tooltip.textActionParagraph1")
                    }
                }
            }
            command {
                icon = Format_text_underline.of(16, 16)
                action = ActionListener {
                    textPane.toggleStyleInSelection(StyleConstants.CharacterConstants.Underline)
                }
                isEnabled = false
                actionRichTooltip {
                    title = resourceBundle.getString("FontUnderline.tooltip.textActionTitle")
                    description {
                        +resourceBundle.getString("FontUnderline.tooltip.textActionParagraph1")
                    }
                }
            }
            command {
                icon = Format_text_strikethrough.of(16, 16)
                action = ActionListener {
                    textPane.toggleStyleInSelection(StyleConstants.CharacterConstants.StrikeThrough)
                }
                isEnabled = false
                actionRichTooltip {
                    title = resourceBundle.getString("FontStrikethrough.tooltip.textActionTitle")
                    description {
                        +resourceBundle.getString("FontStrikethrough.tooltip.textActionParagraph1")
                    }
                }
            }
            display {
                orientation = JCommandButtonStrip.StripOrientation.VERTICAL
                horizontalGapScaleFactor = 0.8
                verticalGapScaleFactor = 1.4
            }
        }

        styleButtonPanel.add(commandStyleStrip.asButtonStrip())

        textPane.addCaretListener {
            // Compute selection presence
            val hasSelection = (textPane.selectionEnd - textPane.selectionStart) > 0
            // Enable or disable the style commands based on that
            commandStyleStrip.isEnabled = hasSelection
        }

        // Show our frame in the center of the screen
        frame.iconImage = BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR)
        frame.size = Dimension(600, 300)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.isVisible = true
    }
}
