/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.component.ktx.button

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.radiance.demo.component.ktx.svg.Format_justify_center
import org.pushingpixels.radiance.demo.component.ktx.svg.Format_justify_fill
import org.pushingpixels.radiance.demo.component.ktx.svg.Format_justify_left
import org.pushingpixels.radiance.demo.component.ktx.svg.Format_justify_right
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState
import org.pushingpixels.radiance.component.ktx.commandButton
import org.pushingpixels.radiance.component.ktx.commandPopupMenu
import org.pushingpixels.radiance.component.ktx.commandToggleGroup
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.image.BufferedImage
import javax.swing.JFrame
import javax.swing.WindowConstants
import javax.swing.text.StyleConstants

fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        RadianceThemingCortex.GlobalScope.setSkin(
            BusinessSkin()
        )

        val frame = JFrame("Test")
        frame.layout = FlowLayout()

        var currentAlignment = StyleConstants.ALIGN_LEFT

        val menuToggleGroup = commandToggleGroup()

        val singleChoice = commandButton {
            command {
                title = "single"
                menu = commandPopupMenu {
                    command {
                        title = "left"
                        iconFactory = Format_justify_left.factory()
                        action = {
                            println("Justify left")
                            currentAlignment = StyleConstants.ALIGN_LEFT
                        }
                        isToggle = true
                        isToggleSelected = (currentAlignment == StyleConstants.ALIGN_LEFT)
                        toggleGroup = menuToggleGroup
                    }
                    command {
                        title = "center"
                        iconFactory = Format_justify_center.factory()
                        action = {
                            println("Justify center")
                            currentAlignment = StyleConstants.ALIGN_CENTER
                        }
                        isToggle = true
                        isToggleSelected = (currentAlignment == StyleConstants.ALIGN_CENTER)
                        toggleGroup = menuToggleGroup
                    }
                    command {
                        title = "right"
                        iconFactory = Format_justify_right.factory()
                        action = {
                            println("Justify right")
                            currentAlignment = StyleConstants.ALIGN_RIGHT
                        }
                        isToggle = true
                        isToggleSelected = (currentAlignment == StyleConstants.ALIGN_RIGHT)
                        toggleGroup = menuToggleGroup
                    }
                    command {
                        title = "fill"
                        iconFactory = Format_justify_fill.factory()
                        action = {
                            println("Justify fill")
                            currentAlignment = StyleConstants.ALIGN_JUSTIFIED
                        }
                        isToggle = true
                        isToggleSelected = (currentAlignment == StyleConstants.ALIGN_JUSTIFIED)
                        toggleGroup = menuToggleGroup
                    }
                }
            }
            presentation {
                isFlat = false
                presentationState = CommandButtonPresentationState.MEDIUM
            }
        }

        frame.add(singleChoice.toButton())

        frame.iconImage = BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR)
        frame.size = Dimension(250, 200)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE

        frame.isVisible = true
    }
}
