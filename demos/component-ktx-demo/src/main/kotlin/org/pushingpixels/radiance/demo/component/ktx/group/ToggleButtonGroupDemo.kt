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
package org.pushingpixels.radiance.demo.component.ktx.group

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.radiance.demo.component.ktx.svg.Format_justify_center
import org.pushingpixels.radiance.demo.component.ktx.svg.Format_justify_fill
import org.pushingpixels.radiance.demo.component.ktx.svg.Format_justify_left
import org.pushingpixels.radiance.demo.component.ktx.svg.Format_justify_right
import org.pushingpixels.radiance.component.api.common.model.CommandStripPresentationModel
import org.pushingpixels.radiance.swing.ktx.swing.AlignType
import org.pushingpixels.radiance.swing.ktx.swing.setAlignment
import org.pushingpixels.radiance.component.ktx.commandToggleButtonStrip
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex
import org.pushingpixels.radiance.theming.api.skin.GeminiSkin
import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.image.BufferedImage
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.JTextPane
import javax.swing.WindowConstants
import javax.swing.border.EmptyBorder

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        RadianceThemingCortex.GlobalScope.setSkin(
            GeminiSkin()
        )

        val frame = JFrame("Text alignment demo")
        frame.layout = BorderLayout()

        // Configure and populate "Lorem ipsum" multiline content
        val textPane = JTextPane()
        textPane.text =
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
        textPane.isEditable = false
        textPane.border = EmptyBorder(12, 12, 12, 12)

        frame.add(textPane, BorderLayout.CENTER)

        val alignButtonPanel = JPanel(FlowLayout())
        frame.add(alignButtonPanel, BorderLayout.LINE_END)

        // Create a toggle button strip to change the text alignment in our text pane.
        val commandAlignStrip = commandToggleButtonStrip {
            command {
                iconFactory = Format_justify_left.factory()
                isToggleSelected = true
                action = { textPane.setAlignment(AlignType.ALIGN_LEFT) }
            }
            command {
                iconFactory = Format_justify_center.factory()
                action = { textPane.setAlignment(AlignType.ALIGN_CENTER) }
            }
            command {
                iconFactory = Format_justify_right.factory()
                action = { textPane.setAlignment(AlignType.ALIGN_RIGHT) }
            }
            command {
                iconFactory = Format_justify_fill.factory()
                action = { textPane.setAlignment(AlignType.ALIGN_JUSTIFIED) }
            }
            presentation {
                orientation = CommandStripPresentationModel.StripOrientation.VERTICAL
                horizontalGapScaleFactor = 0.8
                verticalGapScaleFactor = 1.4
            }
        }

        alignButtonPanel.add(commandAlignStrip.toJavaButtonStrip())

        // Show our frame in the center of the screen
        frame.iconImage = BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR)
        frame.size = Dimension(600, 300)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE

        frame.isVisible = true
    }
}
