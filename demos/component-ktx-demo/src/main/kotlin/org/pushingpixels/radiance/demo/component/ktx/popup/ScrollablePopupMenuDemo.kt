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
package org.pushingpixels.radiance.demo.component.ktx.popup

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.radiance.demo.component.ktx.svg.Help_browser
import org.pushingpixels.radiance.demo.component.ktx.svg.Text_x_generic
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState
import org.pushingpixels.radiance.component.ktx.commandButton
import org.pushingpixels.radiance.component.ktx.commandPopupMenu
import org.pushingpixels.radiance.swing.ktx.util.get
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.image.BufferedImage
import java.text.MessageFormat
import java.util.*
import javax.swing.JFrame
import javax.swing.WindowConstants

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        RadianceThemingCortex.GlobalScope.setSkin(
            BusinessSkin()
        )

        val resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.radiance.demo.component.ktx.resources.Resources", Locale.getDefault())

        val frame = JFrame("Test")
        frame.layout = FlowLayout()

        val commandButton = commandButton {
            command {
                title = resourceBundle["Paste.text"]
                iconFactory = Help_browser.factory()
                extraText = resourceBundle["Paste.textExtra"]
                menu = commandPopupMenu {
                    val mf = MessageFormat(resourceBundle["TestMenuItem.text"])
                    for (i in 0 until 20) {
                        command {
                            title = mf.format(arrayOf<Any>(i))
                            iconFactory = Text_x_generic.factory()
                            action = { println("Invoked action on '$i'") }
                        }
                    }
                    maxVisibleMenuCommands = 8
                }
            }
            presentation {
                presentationState = CommandButtonPresentationState.TILE
                backgroundAppearanceStrategy = RadianceThemingSlices.BackgroundAppearanceStrategy.ALWAYS
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
