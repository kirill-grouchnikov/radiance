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

import com.jgoodies.forms.builder.FormBuilder
import com.jgoodies.forms.factories.Paddings
import org.pushingpixels.meteor.awt.addTypedDelayedPropertyChangeListener
import org.pushingpixels.meteor.awt.deepForEach
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme
import java.awt.BorderLayout
import java.awt.Color
import java.awt.Font
import javax.swing.ButtonGroup
import javax.swing.JCheckBox
import javax.swing.JLabel
import javax.swing.JPanel

class JColorSchemeComponent : JPanel() {
    enum class StateChangeType {
        INITIALIZED, MODIFIED, RESET
    }

    private val isLightCheckbox: JCheckBox
    private val name: JLabel
    private val ultraLight: JColorComponent
    private val extraLight: JColorComponent
    private val light: JColorComponent
    private val mid: JColorComponent
    private val dark: JColorComponent
    private val ultraDark: JColorComponent
    private val foreground: JColorComponent
    private val bg: ButtonGroup

    private val stateChangeListeners: MutableList<(StateChangeType) -> Unit> = arrayListOf()

    val displayName: String
        get() = this.name.text

    val ultraLightColor: Color
        get() = ultraLight.color!!

    val extraLightColor: Color
        get() = extraLight.color!!

    val lightColor: Color
        get() = light.color!!

    val midColor: Color
        get() = mid.color!!

    val darkColor: Color
        get() = dark.color!!

    val ultraDarkColor: Color
        get() = ultraDark.color!!

    val foregroundColor: Color
        get() = foreground.color!!

    val isLight: Boolean
        get() = isLightCheckbox.isSelected

    val isDefined: Boolean
        get() {
            if (this.name.text == null || this.name.text.trim { it <= ' ' }.length == 0) {
                return false
            }
            if (!this.ultraLight.isDefined) {
                return false
            }
            if (!this.extraLight.isDefined) {
                return false
            }
            if (!this.light.isDefined) {
                return false
            }
            if (!this.mid.isDefined) {
                return false
            }
            if (!this.dark.isDefined) {
                return false
            }
            if (!this.ultraDark.isDefined) {
                return false
            }
            return this.foreground.isDefined
        }

    val selectedColorComponent: JColorComponent?
        get() {
            if (this.ultraLight.radio.isSelected) {
                return this.ultraLight
            }
            if (this.extraLight.radio.isSelected) {
                return this.extraLight
            }
            if (this.light.radio.isSelected) {
                return this.light
            }
            if (this.mid.radio.isSelected) {
                return this.mid
            }
            if (this.dark.radio.isSelected) {
                return this.dark
            }
            if (this.ultraDark.radio.isSelected) {
                return this.ultraDark
            }
            return if (this.foreground.radio.isSelected) {
                this.foreground
            } else null
        }

    init {
        this.layout = BorderLayout()

        val formBuilder = FormBuilder.create().columns("fill:pref")
                .rows("p, \$lg, p, \$lg, p, \$lg, p, \$lg, p, \$lg, p, \$lg, p, \$lg, p").padding(Paddings.DIALOG)

        this.bg = ButtonGroup()

        this.ultraLight = createColorComponent("ultra light")
        this.extraLight = createColorComponent("extra light")
        this.light = createColorComponent("light")
        this.mid = createColorComponent("mid")
        this.dark = createColorComponent("dark")
        this.ultraDark = createColorComponent("ultra dark")
        this.foreground = createColorComponent("foreground")

        val headerBuilder =
                FormBuilder.create().columns("fill:pref,2dlu,fill:min(150px;pref):grow,4dlu,right:pref").rows("p")

        name = JLabel("")
        name.font = name.font.deriveFont(Font.BOLD)
        isLightCheckbox = JCheckBox("light")
        isLightCheckbox.isSelected = true
        isLightCheckbox.isFocusable = false
        headerBuilder.add(JLabel("Display name:")).xy(1, 1)
        headerBuilder.add(name).xy(3, 1)
        headerBuilder.add(isLightCheckbox).xy(5, 1)

        isLightCheckbox.addActionListener {
            fireStateChanged(StateChangeType.MODIFIED)
        }

        formBuilder.add(headerBuilder.build()).xy(1, 1)

        formBuilder.add(ultraLight).xy(1, 3)
        formBuilder.add(extraLight).xy(1, 5)
        formBuilder.add(light).xy(1, 7)
        formBuilder.add(mid).xy(1, 9)
        formBuilder.add(dark).xy(1, 11)
        formBuilder.add(ultraDark).xy(1, 13)
        formBuilder.add(foreground).xy(1, 15)

        this.add(formBuilder.panel, BorderLayout.CENTER)
    }

    private fun createColorComponent(label: String): JColorComponent {
        val result = JColorComponent(label, null)
        result.addTypedDelayedPropertyChangeListener<Color>("selectedColor") {
            fireStateChanged(StateChangeType.MODIFIED)
        }
        this.bg.add(result.radio)
        return result
    }

    fun setContent(scheme: SubstanceColorScheme) {
        this.isEnabled = true

        ultraLight.setColor(scheme.ultraLightColor, false)
        extraLight.setColor(scheme.extraLightColor, false)
        light.setColor(scheme.lightColor, false)
        mid.setColor(scheme.midColor, false)
        dark.setColor(scheme.darkColor, false)
        ultraDark.setColor(scheme.ultraDarkColor, false)
        foreground.setColor(scheme.foregroundColor, false)
        isLightCheckbox.isSelected = !scheme.isDark
        name.text = scheme.displayName

        fireStateChanged(StateChangeType.INITIALIZED)
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        this.deepForEach { it.isEnabled = enabled }
    }

    fun clearContent() {
        this.isEnabled = false

        ultraLight.setColor(null, false)
        extraLight.setColor(null, false)
        light.setColor(null, false)
        mid.setColor(null, false)
        dark.setColor(null, false)
        ultraDark.setColor(null, false)
        foreground.setColor(null, false)
        isLightCheckbox.isSelected = true
        name.text = ""

        fireStateChanged(StateChangeType.RESET)
    }

    /**
     * Adds the specified change listener to track changes to this component.
     *
     * @param l Change listener to add.
     * @see .removeChangeListener
     */
    fun addStateChangeListener(l: (StateChangeType) -> Unit) {
        this.stateChangeListeners.add(l)
    }

    /**
     * Notifies all registered listener that the state of this component has changed.
     */
    protected fun fireStateChanged(stateChangeType: StateChangeType) {
        for (listener in this.stateChangeListeners) {
            listener.invoke(stateChangeType)
        }
    }
}
