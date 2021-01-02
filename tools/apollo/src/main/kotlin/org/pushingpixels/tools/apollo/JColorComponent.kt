/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.tools.apollo

import org.pushingpixels.meteor.addDelayedMouseListener
import org.pushingpixels.meteor.awt.MeteorLayoutManager
import org.pushingpixels.meteor.awt.deriveByBrightness
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.neon.api.NeonCortex
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.torch.componentTimeline
import org.pushingpixels.torch.from
import org.pushingpixels.trident.api.swing.SwingComponentTimeline
import java.awt.*
import javax.swing.JColorChooser
import javax.swing.JComponent
import javax.swing.JRadioButton
import kotlin.properties.Delegates

class JColorComponent(name: String, color: Color?) : JComponent() {
    val radio: JRadioButton = JRadioButton(name)

    var color: Color? = null
        private set

    private val visualizer: ColorVisualizer

    val encodedColor: String
        get() = ("#" + encodeColorComponent(color!!.red)
                + encodeColorComponent(color!!.green)
                + encodeColorComponent(color!!.blue))

    val isDefined: Boolean
        get() = this.color != null

    var selectedColor: Color? by Delegates.observable(null) {
        prop, old, new -> this.firePropertyChange(prop.name, old, new)
    }

    init {
        this.radio.isFocusable = false
        this.color = color
        this.visualizer = ColorVisualizer()
        this.layout = MeteorLayoutManager(
                getPreferredSize = { parent ->
                    val colorComponent = parent as JColorComponent
                    val colorVisualizer = colorComponent.visualizer
                    val cvPref = colorVisualizer.preferredSize
                    Dimension(100 + cvPref.width, cvPref.height)
                },
                onLayout = { parent ->
                    val jColorComponent = parent as JColorComponent
                    val width = jColorComponent.width
                    val height = jColorComponent.height

                    val colorVisualizer = jColorComponent.visualizer
                    val cvPref = colorVisualizer.preferredSize
                    colorVisualizer.setBounds(width - cvPref.width, 0, cvPref.width, height)
                    jColorComponent.radio.setBounds(0, 0, width - cvPref.width, height)
                })

        this.add(this.radio)
        this.add(this.visualizer)
    }

    private fun encodeColorComponent(colorComp: Int): String {
        val hex = "0123456789ABCDEF"
        return "" + hex[colorComp / 16] + hex[colorComp % 16]
    }

    fun setColor(color: Color?, firePropertyChange: Boolean) {
        this.color = color
        this.repaint()
        if (firePropertyChange) {
            selectedColor = this.color
        }
    }

    inner class ColorVisualizer : JComponent() {
        var borderThickness = 1.0f
        private val rolloverTimeline: SwingComponentTimeline

        init {
            rolloverTimeline = this.componentTimeline {
                duration = 80
                property(::borderThickness from 1.0f to 2.0f)
                repaintCallback()
            }

            this.addDelayedMouseListener(
                    onMouseClicked = {
                        if (isEnabled) {
                            radio.isSelected = true
                            val selected = JColorChooser.showDialog(this@ColorVisualizer,
                                    "Color chooser", color)
                            if (selected != null) {
                                color = selected
                                selectedColor = color
                            }
                        }
                    },
                    onMouseEntered = {
                        if (isEnabled) {
                            rolloverTimeline.play()
                        }
                    },
                    onMouseExited = {
                        if (isEnabled) {
                            rolloverTimeline.playReverse()
                        }
                    })
            this.cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)
            this.toolTipText = "Open color chooser and change the color"
        }

        override fun paintComponent(g: Graphics) {
            g.render {
                it.font = SubstanceCortex.GlobalScope.getFontPolicy().fontSet.controlFont
                NeonCortex.installDesktopHints(it, it.font)

                if (color != null) {
                    it.color = color
                    it.fillRect(2, 2, 100, height - 4)
                    it.stroke = BasicStroke(borderThickness)
                    it.color = color!!.deriveByBrightness(-0.4)
                    it.drawRect(2, 2, 99, height - 4)

                    it.color = Color.black
                    it.drawString(encodedColor, 108,
                            (height + it.fontMetrics.height) / 2 - it.fontMetrics.descent)
                } else {
                    it.color = if (isEnabled) Color.gray else Color.lightGray
                    it.drawString("click to choose", 5,
                            (height + it.fontMetrics.height) / 2 - it.fontMetrics.descent)
                }
            }
        }

        override fun getPreferredSize(): Dimension {
            return Dimension(200, 25)
        }
    }
}
