/*
 * Copyright (c) 2005-2018 Radiance Jitterbug Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Jitterbug Kirill Grouchnikov nor the names of
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
package org.pushingpixels.tools.jitterbug

import org.pushingpixels.meteor.awt.render
import org.pushingpixels.neon.NeonCortex

import javax.swing.*
import java.awt.*
import java.awt.event.*

class JColorComponent(name: String, color: Color?) : JComponent() {
    val radio: JRadioButton

    var color: Color? = null
        private set

    private val visualizer: ColorVisualizer

    val encodedColor: String
        get() = ("#" + encodeColorComponent(color!!.red)
                + encodeColorComponent(color!!.green)
                + encodeColorComponent(color!!.blue))

    val isDefined: Boolean
        get() = this.color != null

    init {
        this.radio = JRadioButton(name)
        this.radio.isFocusable = false
        this.color = color
        this.visualizer = ColorVisualizer()
        this.layout = ColorComponentLayout()

        this.add(this.radio)
        this.add(this.visualizer)
    }

    private fun encodeColorComponent(colorComp: Int): String {
        val hex = "0123456789ABCDEF"
        return "" + hex[colorComp / 16] + hex[colorComp % 16]
    }

    fun setColor(color: Color?, firePropertyChange: Boolean) {
        val old = this.color
        this.color = color
        this.repaint()
        if (firePropertyChange) {
            this.firePropertyChange("selectedColor", old, this.color)
        }
    }

    private inner class ColorVisualizer : JComponent() {
        internal var isRollover: Boolean = false

        init {
            this.addMouseListener(object : MouseAdapter() {
                override fun mouseClicked(e: MouseEvent?) {
                    if (!isEnabled) {
                        return
                    }

                    SwingUtilities.invokeLater {
                        radio.isSelected = true
                        val selected = JColorChooser.showDialog(this@ColorVisualizer,
                                "Color chooser", color)
                        if (selected != null) {
                            val old = color
                            color = selected
                            this@JColorComponent.firePropertyChange("selectedColor", old,
                                    color)
                        }
                    }
                }

                override fun mouseEntered(e: MouseEvent?) {
                    if (!isEnabled) {
                        return
                    }

                    isRollover = true
                    repaint()
                }

                override fun mouseExited(e: MouseEvent?) {
                    if (!isEnabled) {
                        return
                    }

                    isRollover = false
                    repaint()
                }
            })
            this.cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)
            this.toolTipText = "Open color chooser and change the color"
            this.isRollover = false
        }

        override fun paintComponent(g: Graphics) {
            g.render {
                NeonCortex.installDesktopHints(it, this)
                it.font = NeonCortex.getDefaultFontPolicy().getFontSet(null).controlFont

                if (color != null) {
                    it.color = color
                    it.fillRect(2, 2, 100, height - 4)
                    it.stroke = BasicStroke(if (isRollover) 2.5f else 1.0f)
                    it.color = color!!.darker()
                    it.drawRect(2, 2, 99, height - 5)

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

    private inner class ColorComponentLayout : LayoutManager {
        override fun addLayoutComponent(name: String, comp: Component) {}

        override fun layoutContainer(parent: Container) {
            val cc = parent as JColorComponent
            val width = cc.width
            val height = cc.height

            val cv = cc.visualizer
            val cvPref = cv.preferredSize
            cv.setBounds(width - cvPref.width, 0, cvPref.width, height)
            cc.radio.setBounds(0, 0, width - cvPref.width, height)
        }

        override fun minimumLayoutSize(parent: Container): Dimension {
            return preferredLayoutSize(parent)
        }

        override fun preferredLayoutSize(parent: Container): Dimension {
            val cc = parent as JColorComponent
            val cv = cc.visualizer
            val cvPref = cv.preferredSize
            return Dimension(100 + cvPref.width, cvPref.height)
        }

        override fun removeLayoutComponent(comp: Component) {}
    }
}
