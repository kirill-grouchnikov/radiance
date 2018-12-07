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

import org.pushingpixels.ember.setColorizationFactor
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState
import org.pushingpixels.flamingo.api.common.CommandAction
import org.pushingpixels.flamingo.api.common.popup.JColorSelectorPopupMenu
import org.pushingpixels.kormorant.DelayedCommandListener
import org.pushingpixels.kormorant.colorSelectorPopupMenu
import org.pushingpixels.kormorant.commandButton
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.neon.NeonCortex
import org.pushingpixels.neon.icon.ResizableIcon
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.skin.BusinessSkin
import java.awt.*
import java.awt.geom.Rectangle2D
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
        g.render {
            it.color = color
            it.fillRect(x, y, w, h)
            val borderThickness = 1.0f / NeonCortex.getScaleFactor().toFloat()
            it.color = color.darker()
            it.stroke = BasicStroke(borderThickness, BasicStroke.CAP_ROUND,
                    BasicStroke.JOIN_ROUND)
            it.draw(Rectangle2D.Double(x.toDouble(), y.toDouble(),
                    (w - borderThickness).toDouble(), (h - borderThickness).toDouble()))
        }
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
    SwingUtilities.invokeLater {
        SubstanceCortex.GlobalScope.setSkin(BusinessSkin())

        val defaultPanelColor = Color.lightGray

        val resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.demo.kormorant.resources.Resources", Locale.getDefault())

        val frame = JFrame("Test")
        frame.layout = BorderLayout()

        val centerPanel = JPanel()
        centerPanel.background = defaultPanelColor
        centerPanel.setColorizationFactor(1.0)
        var backgroundColor = centerPanel.background
        frame.add(centerPanel, BorderLayout.CENTER)

        val controlPanel = JPanel(FlowLayout())
        frame.add(controlPanel, BorderLayout.NORTH)

        // Icon for our button
        val colorIcon = ColorIcon(backgroundColor)
        // Color selector listeners to update the background fill of the main panel
        // and keep the button icon in sync
        val onColorActivatedListener = { color: Color ->
            backgroundColor = color
            centerPanel.background = backgroundColor
            colorIcon.setColor(backgroundColor)
        }
        val onColorPreviewActivatedListener = { color: Color -> centerPanel.background = color }
        val onColorPreviewCanceledListener = {
            centerPanel.background = backgroundColor
            colorIcon.setColor(backgroundColor)
        }

        val commandButton = commandButton {
            command {
                icon = colorIcon
                popupMenu = colorSelectorPopupMenu {
                    onColorActivated = onColorActivatedListener
                    onColorPreviewActivated = onColorPreviewActivatedListener
                    onColorPreviewCanceled = onColorPreviewCanceledListener

                    command {
                        title = resourceBundle.getString("ColorSelector.textAutomatic")
                        icon = ColorIcon(defaultPanelColor)
                        action = CommandAction {
                            onColorActivatedListener.invoke(defaultPanelColor)
                            JColorSelectorPopupMenu.addColorToRecentlyUsed(defaultPanelColor)
                        }

                        onActionPreviewActivated = {
                            // Notify the callback that there is rollover with automatic
                            // (light gray) color
                            onColorPreviewActivatedListener.invoke(defaultPanelColor)
                        }
                        onActionPreviewCanceled = {
                            // Notify the callback that there is no rollover
                            onColorPreviewCanceledListener.invoke()
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
                        action = DelayedCommandListener {
                            val color = JColorChooser.showDialog(it.source as Component,
                                    "Color chooser", backgroundColor)
                            if (color != null) {
                                onColorActivatedListener(color)
                                JColorSelectorPopupMenu.addColorToRecentlyUsed(color)
                            }
                        }
                    }
                }
            }
            presentation {
                presentationState = CommandButtonPresentationState.SMALL
                isFlat = false
            }
        }

        controlPanel.add(commandButton.toButton())

        frame.iconImage = BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR)
        frame.size = Dimension(250, 200)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        frame.isVisible = true
    }
}
