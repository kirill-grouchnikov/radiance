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
package org.pushingpixels.plasma.synapse

import org.pushingpixels.flamingo.api.ribbon.synapse.model.RibbonDefaultComboBoxContentModel
import org.pushingpixels.flamingo.api.ribbon.synapse.projection.RibbonComboBoxProjection
import org.pushingpixels.radiance.common.api.icon.RadianceIcon
import org.pushingpixels.plasma.PlasmaElementMarker
import org.pushingpixels.plasma.KRichTooltip
import org.pushingpixels.plasma.NullableDelegate
import org.pushingpixels.plasma.ribbon.KFlowRibbonBand
import org.pushingpixels.plasma.ribbon.KRibbonBand
import org.pushingpixels.plasma.ribbon.KRibbonBandGroup
import org.pushingpixels.plasma.ribbon.KRibbonTaskbar

@PlasmaElementMarker
public class KRibbonComboBoxContentModel<T> {
    private val builder = RibbonDefaultComboBoxContentModel.builder<T>()
    private lateinit var javaContentModel: RibbonDefaultComboBoxContentModel<T>
    internal var hasBeenConverted: Boolean = false

    private var richTooltip: KRichTooltip? by NullableDelegate { false }
    private var items: Array<out T>? = null
    public var iconFactory: RadianceIcon.Factory? by NullableDelegate { false }
    public var caption: String? by NullableDelegate { false }
    public var selectionChangeListener: ((oldSelection: Any?, newSelection: Any?) -> Unit)?
            by NullableDelegate { hasBeenConverted }

    // The "isEnabled" property can be modified even after [KRibbonComboBox.toJavaProjection] has
    // been called multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [RibbonDefaultComboBoxContentModel] instance, which then gets
    // propagated to be reflected in all comboboxes created from this content model.
    private var _isEnabled: Boolean = true
    public var isEnabled: Boolean
        get() = _isEnabled
        set(value) {
            _isEnabled = value
            builder.setEnabled(value)
            if (hasBeenConverted) {
                javaContentModel.isEnabled = value
            }
        }

    public fun richTooltip(init: KRichTooltip.() -> Unit) {
        if (richTooltip == null) {
            richTooltip = KRichTooltip()
        }
        richTooltip!!.init()
    }

    public fun items(vararg items: T) {
        this.items = items
    }

    internal fun asJavaComboBoxContentModel(): RibbonDefaultComboBoxContentModel<T> {
        if (hasBeenConverted) {
            return javaContentModel
        }


        val javaBuilder = RibbonDefaultComboBoxContentModel.builder<T>()
                .setItems(this.items)
                .setIconFactory(this.iconFactory)
                .setCaption(this.caption)
                .setEnabled(this.isEnabled)
                .setSelectionChangeListener(this.selectionChangeListener)
                .setRichTooltip(this.richTooltip?.toJavaRichTooltip())
        javaContentModel = javaBuilder.build()
        hasBeenConverted = true
        return javaContentModel
    }

}

@PlasmaElementMarker
public class KRibbonComboBox<T> {
    internal var content: KRibbonComboBoxContentModel<T> = KRibbonComboBoxContentModel()
    internal val presentation: KComponentPresentation = KComponentPresentation()

    public operator fun KRibbonComboBoxContentModel<T>.unaryPlus() {
        this@KRibbonComboBox.content = this
    }

    public fun content(init: KRibbonComboBoxContentModel<T>.() -> Unit) {
        content.init()
    }

    public fun presentation(init: KComponentPresentation.() -> Unit) {
        presentation.init()
    }

    internal fun toJavaProjection(): RibbonComboBoxProjection<T> {
        val javaContent = content.asJavaComboBoxContentModel()
        val javaPresentation = presentation.toComponentPresentation()
        return RibbonComboBoxProjection(javaContent, javaPresentation)
    }
}

public fun <T> comboBoxContentModel(init: KRibbonComboBoxContentModel<T>.() -> Unit): KRibbonComboBoxContentModel<T> {
    val result = KRibbonComboBoxContentModel<T>()
    result.init()
    return result
}

public fun <T> KRibbonBand.comboBox(init: KRibbonComboBox<T>.() -> Unit) {
    val ribbonComboBox = KRibbonComboBox<T>()
    ribbonComboBox.init()
    this.component(ribbonComboBox.toJavaProjection())
}

public fun <T> KFlowRibbonBand.flowComboBox(init: KRibbonComboBox<T>.() -> Unit) {
    val ribbonComboBox = KRibbonComboBox<T>()
    ribbonComboBox.init()
    this.flowComponent(ribbonComboBox.toJavaProjection())
}

public fun <T> KRibbonBandGroup.comboBox(init: KRibbonComboBox<T>.() -> Unit) {
    val ribbonComboBox = KRibbonComboBox<T>()
    ribbonComboBox.init()
    this.component(ribbonComboBox.toJavaProjection())
}

public fun <T> KRibbonTaskbar.comboBox(init: KRibbonComboBox<T>.() -> Unit) {
    val ribbonComboBox = KRibbonComboBox<T>()
    ribbonComboBox.init()
    this.component(ribbonComboBox.toJavaProjection())
}


