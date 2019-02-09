/*
 * Copyright (c) 2005-2019 Radiance Apollo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Apollo Kirill Grouchnikov nor the names of
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
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.neon.NeonCortex
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.trident.Timeline
import org.pushingpixels.trident.TimelinePropertyBuilder
import org.pushingpixels.trident.swing.SwingComponentTimeline
import org.pushingpixels.trident.swing.SwingRepaintCallback
import java.awt.*
import javax.swing.JColorChooser
import javax.swing.JComponent
import javax.swing.JRadioButton
import kotlin.properties.Delegates

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

    var selectedColor: Color? by Delegates.observable<Color?>(null) {
        prop, old, new -> this.firePropertyChange(prop.name, old, new)
    }

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
        this.color = color
        this.repaint()
        if (firePropertyChange) {
            selectedColor = this.color
        }
    }

    private inner class ColorVisualizer : JComponent() {
        internal var borderThickness = 1.0f
        internal val rolloverTimeline: SwingComponentTimeline

        init {
            val rolloverTimelineBuilder = SwingComponentTimeline.componentBuilder(this)

            // TODO - switch to operate on the property directly (with accessor object)
            // when Torch is available
            rolloverTimelineBuilder.addPropertyToInterpolate(
                    Timeline.property<Float>(this::borderThickness.name).from(1.0f).to(2.0f)
                            .accessWith(object: TimelinePropertyBuilder.PropertyAccessor<Float> {
                                override fun get(obj: Any?, fieldName: String?): Float {
                                    return borderThickness
                                }

                                override fun set(obj: Any?, fieldName: String?, value: Float?) {
                                    borderThickness = value!!
                                }
                            }))
            rolloverTimelineBuilder.duration = 80
            rolloverTimelineBuilder.addCallback(SwingRepaintCallback(this))
            rolloverTimeline = rolloverTimelineBuilder.build()

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
                    it.color = color!!.darker()
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

    private inner class ColorComponentLayout : LayoutManager {
        override fun addLayoutComponent(name: String, comp: Component) {}

        override fun layoutContainer(parent: Container) {
            val jColorComponent = parent as JColorComponent
            val width = jColorComponent.width
            val height = jColorComponent.height

            val colorVisualizer = jColorComponent.visualizer
            val cvPref = colorVisualizer.preferredSize
            colorVisualizer.setBounds(width - cvPref.width, 0, cvPref.width, height)
            jColorComponent.radio.setBounds(0, 0, width - cvPref.width, height)
        }

        override fun minimumLayoutSize(parent: Container): Dimension {
            return preferredLayoutSize(parent)
        }

        override fun preferredLayoutSize(parent: Container): Dimension {
            val colorComponent = parent as JColorComponent
            val colorVisualizer = colorComponent.visualizer
            val cvPref = colorVisualizer.preferredSize
            return Dimension(100 + cvPref.width, cvPref.height)
        }

        override fun removeLayoutComponent(comp: Component) {}
    }
}
