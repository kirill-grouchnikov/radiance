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

import org.pushingpixels.demo.kormorant.svg.Format_justify_center
import org.pushingpixels.demo.kormorant.svg.Format_justify_fill
import org.pushingpixels.demo.kormorant.svg.Format_justify_left
import org.pushingpixels.demo.kormorant.svg.Format_justify_right
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback
import org.pushingpixels.kormorant.commandButton
import org.pushingpixels.kormorant.commandPopupMenu
import org.pushingpixels.kormorant.commandToggleGroup
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.event.ActionListener
import java.awt.image.BufferedImage
import javax.swing.JFrame
import javax.swing.text.StyleConstants

fun main(args: Array<String>) {
    val frame = JFrame("Test")
    frame.layout = FlowLayout()

    var currentAlignment = StyleConstants.ALIGN_LEFT

    val singleChoice = commandButton {
        command {
            title = "single"
            popupCallback = PopupPanelCallback {
                val menuToggleGroup = commandToggleGroup()

                commandPopupMenu {
                    command {
                        title = "left"
                        icon = Format_justify_left.of(16, 16)
                        action = ActionListener {
                            println("Justify left")
                            currentAlignment = StyleConstants.ALIGN_LEFT
                        }
                        isToggle = true
                        isToggleSelected = currentAlignment == StyleConstants.ALIGN_LEFT
                        toggleGroup = menuToggleGroup
                    }
                    command {
                        title = "center"
                        icon = Format_justify_center.of(16, 16)
                        action = ActionListener {
                            println("Justify center")
                            currentAlignment = StyleConstants.ALIGN_CENTER
                        }
                        isToggle = true
                        isToggleSelected = currentAlignment == StyleConstants.ALIGN_CENTER
                        toggleGroup = menuToggleGroup
                    }
                    command {
                        title = "right"
                        icon = Format_justify_right.of(16, 16)
                        action = ActionListener {
                            println("Justify right")
                            currentAlignment = StyleConstants.ALIGN_RIGHT
                        }
                        isToggle = true
                        isToggleSelected = currentAlignment == StyleConstants.ALIGN_RIGHT
                        toggleGroup = menuToggleGroup
                    }
                    command {
                        title = "fill"
                        icon = Format_justify_fill.of(16, 16)
                        action = ActionListener {
                            println("Justify fill")
                            currentAlignment = StyleConstants.ALIGN_JUSTIFIED
                        }
                        isToggle = true
                        isToggleSelected = currentAlignment == StyleConstants.ALIGN_JUSTIFIED
                        toggleGroup = menuToggleGroup
                    }
                }.asCommandPopupMenu()
            }
        }
        display {
            isFlat = false
            state = CommandButtonDisplayState.MEDIUM
        }
    }

    frame.add(singleChoice.asButton())

    frame.iconImage = BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR)
    frame.size = Dimension(250, 200)
    frame.setLocationRelativeTo(null)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    frame.isVisible = true
}
