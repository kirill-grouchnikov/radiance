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
package org.pushingpixels.demo.kormorant.popup

import org.pushingpixels.demo.kormorant.svg.*
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState
import org.pushingpixels.flamingo.api.common.JCommandButton
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback
import org.pushingpixels.kormorant.commandButton
import org.pushingpixels.kormorant.commandPopupMenu
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.event.ActionListener
import java.awt.image.BufferedImage
import java.text.MessageFormat
import java.util.*
import javax.swing.JFrame

fun main(args: Array<String>) {
    val resourceBundle = ResourceBundle
            .getBundle("org.pushingpixels.demo.kormorant.resources.Resources", Locale.getDefault())

    val frame = JFrame("Test")
    frame.layout = FlowLayout()

    val commandButton = commandButton {
        command {
            title = resourceBundle.getString("Paste.text")
            icon = Help_browser.of(16, 16)
            extraText = resourceBundle.getString("Paste.textExtra")
            popupOrientationKind = JCommandButton.CommandButtonPopupOrientationKind.SIDEWARD
            popupRichTooltip {
                title = resourceBundle.getString("Tooltip.textActionTitle")
                mainIcon = Image_x_generic.of(32, 32)
                description {
                    +resourceBundle.getString("Tooltip.textParagraph1")
                    +resourceBundle.getString("Tooltip.textParagraph2")
                }
                footer {
                    +resourceBundle.getString("Tooltip.textFooterParagraph1")
                }
            }
            popupCallback = PopupPanelCallback {
                val mf = MessageFormat(resourceBundle.getString("TestMenuItem.text"))
                val popupMenuCommand = commandPopupMenu {
                    command {
                        title = mf.format(arrayOf("1"))
                        icon = Applications_games.of(16, 16)
                        action = ActionListener {
                            println("First!")
                        }
                    }
                    command {
                        title = mf.format(arrayOf("2"))
                        icon = Applications_graphics.of(16, 16)
                        action = ActionListener {
                            println("Second!")
                        }
                    }
                    command {
                        title = mf.format(arrayOf("3"))
                        icon = Applications_internet.of(16, 16)
                        action = ActionListener {
                            println("Third!")
                        }
                    }
                    separator()
                    command {
                        title = mf.format(arrayOf("4"))
                        icon = Applications_multimedia.of(16, 16)
                        action = ActionListener {
                            println("Fourth!")
                        }
                    }
                    command {
                        title = mf.format(arrayOf("5"))
                        icon = Applications_office.of(16, 16)
                        action = ActionListener {
                            println("Fifth!")
                        }
                    }
                }
                popupMenuCommand.asCommandPopupMenu()
            }
        }
        display {
            state = CommandButtonDisplayState.TILE
            isFlat = false
        }
    }

    frame.add(commandButton.asButton())

    frame.iconImage = BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR)
    frame.size = Dimension(250, 200)
    frame.setLocationRelativeTo(null)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    frame.isVisible = true
}
