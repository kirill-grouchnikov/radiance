/*
 * Copyright (c) 2018-2019 Radiance Plasma Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Plasma Kirill Grouchnikov nor the names of
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
package org.pushingpixels.demo.plasma.popup

import org.pushingpixels.demo.plasma.svg.Help_browser
import org.pushingpixels.demo.plasma.svg.Text_x_generic
import org.pushingpixels.flamingo.api.common.CommandAction
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState
import org.pushingpixels.plasma.commandButton
import org.pushingpixels.plasma.commandPopupMenu
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.skin.BusinessSkin
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.image.BufferedImage
import java.text.MessageFormat
import java.util.*
import javax.swing.JFrame
import javax.swing.SwingUtilities
import javax.swing.WindowConstants

fun main() {
    SwingUtilities.invokeLater {
        SubstanceCortex.GlobalScope.setSkin(BusinessSkin())

        val resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.demo.plasma.resources.Resources", Locale.getDefault())

        val frame = JFrame("Test")
        frame.layout = FlowLayout()

        val commandButton = commandButton {
            command {
                title = resourceBundle.getString("Paste.text")
                iconFactory = Help_browser.factory()
                extraText = resourceBundle.getString("Paste.textExtra")
                menu = commandPopupMenu {
                    val mf = MessageFormat(resourceBundle.getString("TestMenuItem.text"))
                    for (i in 0 until 20) {
                        command {
                            title = mf.format(arrayOf<Any>(i))
                            iconFactory = Text_x_generic.factory()
                            action = CommandAction {
                                println("Invoked action on '$i'")
                            }
                        }
                    }
                    maxVisibleMenuCommands = 8
                }
            }
            presentation {
                presentationState = CommandButtonPresentationState.TILE
                isFlat = false
            }
        }

        frame.add(commandButton.toButton())

        frame.iconImage = BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR)
        frame.size = Dimension(250, 200)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE

        frame.isVisible = true
    }
}
