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

import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState
import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.flamingo.api.common.model.ActionButtonModel
import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback
import org.pushingpixels.kormorant.ActionModelChangeInterface
import org.pushingpixels.kormorant.colorSelectorPopupMenu
import org.pushingpixels.kormorant.commandButton
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.skin.BusinessSkin
import java.awt.*
import java.awt.event.ActionListener
import java.awt.image.BufferedImage
import java.util.*
import javax.swing.JColorChooser
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.SwingUtilities

class ColorIcon(private var color: Color) : ResizableIcon {
    private var w: Int = 0
    private var h: Int = 0

    fun setColor(color: Color) {
        this.color = color
    }

    override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
        g.color = color
        g.fillRect(x, y, w, h)
        g.color = color.darker()
        g.drawRect(x, y, w - 1, h - 1)
    }

    override fun getIconWidth(): Int {
        return w
    }

    override fun getIconHeight(): Int {
        return h
    }

    override fun setDimension(newDimension: Dimension) {
        w = newDimension.width
        h = newDimension.height
    }
}

fun main(args: Array<String>) {
    SwingUtilities.invokeLater({
        SubstanceCortex.GlobalScope.setSkin(BusinessSkin())

        val resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.demo.kormorant.resources.Resources", Locale.getDefault())

        val frame = JFrame("Test")
        frame.layout = BorderLayout()

        val centerPanel = JPanel()
        var backgroundColor = centerPanel.background
        frame.add(centerPanel, BorderLayout.CENTER)

        val controlPanel = JPanel(FlowLayout())
        frame.add(controlPanel, BorderLayout.NORTH)

        // Icon for our button
        val colorIcon = ColorIcon(backgroundColor)
        // Color selector callback to update the background fill of the main panel
        // and keep the button icon in sync
        val callback = object : JColorSelectorPopupMenu.ColorSelectorCallback {
            override fun onColorSelected(color: Color) {
                backgroundColor = color
                centerPanel.background = backgroundColor
                colorIcon.setColor(backgroundColor)
            }

            override fun onColorRollover(color: Color?) {
                if (color != null) {
                    centerPanel.background = color
                } else {
                    centerPanel.background = backgroundColor
                    colorIcon.setColor(backgroundColor)
                }
            }
        }

        val defaultPanelColor = centerPanel.background
        val commandButton = commandButton {
            command {
                icon = colorIcon
                popupCallback = PopupPanelCallback {
                    colorSelectorPopupMenu {
                        colorSelectorCallback = callback

                        command {
                            title = resourceBundle.getString("ColorSelector.textAutomatic")
                            icon = ColorIcon(defaultPanelColor)
                            action = ActionListener {
                                callback.onColorSelected(defaultPanelColor)
                                JColorSelectorPopupMenu.addColorToRecentlyUsed(defaultPanelColor)
                            }
                            // Register a listener on the action model
                            actionModelChangeListener = object : ActionModelChangeInterface {
                                var wasRollover = false
                                override fun stateChanged(model: ActionButtonModel) {
                                    val isRollover = model.isRollover
                                    if (wasRollover && !isRollover) {
                                        // Notify the callback that there is no rollover
                                        callback.onColorRollover(null)
                                    }
                                    if (!wasRollover && isRollover) {
                                        // Notify the callback that there is rollover with automatic (black) color
                                        callback.onColorRollover(Color.black)
                                    }
                                    wasRollover = isRollover
                                }
                            }
                        }

                        colorSectionWithDerived {
                            title = resourceBundle.getString("ColorSelector.textThemeCaption")
                            colors {
                                +Color(255, 255, 255)
                                +Color(0, 0, 0)
                                +Color(160, 160, 160)
                                +Color(16, 64, 128)
                                +Color(80, 128, 192)
                                +Color(180, 80, 80)
                                +Color(160, 192, 80)
                                +Color(128, 92, 160)
                                +Color(80, 160, 208)
                                +Color(255, 144, 64)
                            }
                        }

                        colorSection {
                            title = resourceBundle.getString("ColorSelector.textStandardCaption")
                            colors {
                                +Color(140, 0, 0)
                                +Color(253, 0, 0)
                                +Color(255, 160, 0)
                                +Color(255, 255, 0)
                                +Color(144, 240, 144)
                                +Color(0, 128, 0)
                                +Color(160, 224, 224)
                                +Color(0, 0, 255)
                                +Color(0, 0, 128)
                                +Color(128, 0, 128)
                            }
                        }

                        recentSection {
                            title = resourceBundle.getString("ColorSelector.textRecentCaption")
                        }

                        command {
                            title = resourceBundle.getString("ColorSelector.textMoreColor")
                            action = ActionListener {
                                SwingUtilities.invokeLater({
                                    val color = JColorChooser.showDialog(it.source as Component,
                                            "Color chooser", backgroundColor)
                                    if (color != null) {
                                        callback.onColorSelected(color)
                                        JColorSelectorPopupMenu.addColorToRecentlyUsed(color)
                                    }
                                })
                            }
                        }
                    }.asColorSelectorPopupMenu()
                }
            }
            display {
                state = CommandButtonDisplayState.SMALL
                isFlat = false
            }
        }

        controlPanel.add(commandButton.asButton())

        frame.iconImage = BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR)
        frame.size = Dimension(250, 200)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        frame.isVisible = true
    })
}
