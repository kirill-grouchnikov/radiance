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
package org.pushingpixels.demo.kormorant.button

import org.pushingpixels.demo.kormorant.svg.Format_text_bold
import org.pushingpixels.demo.kormorant.svg.Format_text_italic
import org.pushingpixels.demo.kormorant.svg.Format_text_strikethrough
import org.pushingpixels.demo.kormorant.svg.Format_text_underline
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState
import org.pushingpixels.flamingo.api.common.CommandListener
import org.pushingpixels.kormorant.commandButton
import org.pushingpixels.kormorant.commandPopupMenu
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.skin.BusinessSkin
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.image.BufferedImage
import java.util.*
import javax.swing.JFrame
import javax.swing.SwingUtilities

fun main(args: Array<String>) {
    SwingUtilities.invokeLater {
        SubstanceCortex.GlobalScope.setSkin(BusinessSkin())

        val frame = JFrame("Test")
        frame.layout = FlowLayout()

        var isBold = false
        var isItalic = false
        var isUnderline = false
        var isStrikeThrough = false

        val resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.demo.kormorant.resources.Resources", Locale.getDefault())

        val singleChoice = commandButton {
            command {
                title = "multi"
                popupMenu = commandPopupMenu {
                    command {
                        title = resourceBundle.getString("FontBold.tooltip.textActionTitle")
                        icon = Format_text_bold.of(16, 16)
                        action = CommandListener {
                            println("Toggle bold")
                            isBold = !isBold
                        }
                        isToggle = true
                        isToggleSelected = isBold
                    }
                    command {
                        title = resourceBundle.getString("FontItalic.tooltip.textActionTitle")
                        icon = Format_text_italic.of(16, 16)
                        action = CommandListener {
                            println("Toggle italic")
                            isItalic = !isItalic
                        }
                        isToggle = true
                        isToggleSelected = isItalic
                    }
                    command {
                        title = resourceBundle.getString("FontUnderline.tooltip.textActionTitle")
                        icon = Format_text_underline.of(16, 16)
                        action = CommandListener {
                            println("Toggle underline")
                            isUnderline = !isUnderline
                        }
                        isToggle = true
                        isToggleSelected = isUnderline
                    }
                    command {
                        title = resourceBundle.getString("FontStrikethrough.tooltip.textActionTitle")
                        icon = Format_text_strikethrough.of(16, 16)
                        action = CommandListener {
                            println("Toggle strikethrough")
                            isStrikeThrough = !isStrikeThrough
                        }
                        isToggle = true
                        isToggleSelected = isStrikeThrough
                    }
                    toDismissOnCommandActivation = false
                }
            }
            presentation {
                isFlat = false
                commandDisplayState = CommandButtonDisplayState.MEDIUM
            }
        }

        frame.add(singleChoice.toButton())

        frame.iconImage = BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR)
        frame.size = Dimension(250, 200)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        frame.isVisible = true
    }
}
