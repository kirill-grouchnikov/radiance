/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.ktx.synapse

import org.pushingpixels.radiance.component.api.ribbon.synapse.model.RibbonCheckBoxContentModel
import org.pushingpixels.radiance.component.api.ribbon.synapse.projection.RibbonCheckBoxProjection
import org.pushingpixels.radiance.common.api.icon.RadianceIcon
import org.pushingpixels.radiance.component.ktx.RadianceElementMarker
import org.pushingpixels.radiance.component.ktx.KRichTooltip
import org.pushingpixels.radiance.component.ktx.NullableDelegate
import org.pushingpixels.radiance.component.ktx.ribbon.KFlowRibbonBand
import org.pushingpixels.radiance.component.ktx.ribbon.KRibbonBand
import org.pushingpixels.radiance.component.ktx.ribbon.KRibbonBandGroup
import org.pushingpixels.radiance.component.ktx.ribbon.KRibbonTaskbar
import java.awt.event.ActionEvent

@RadianceElementMarker
public class KRibbonCheckBoxContentModel {
    private val builder = RibbonCheckBoxContentModel.builder()
    internal lateinit var javaContentModel: RibbonCheckBoxContentModel
    internal var hasBeenConverted: Boolean = false

    internal var richTooltip: KRichTooltip? by NullableDelegate { false }
    public var iconFactory: RadianceIcon.Factory? by NullableDelegate { false }
    public var caption: String? by NullableDelegate { false }
    public var text: String? by NullableDelegate { false }
    public var actionListener: ((event: ActionEvent) -> Unit)? by NullableDelegate { false }

    // The "isEnabled" property can be modified even after [KRibbonCheckBox.toJavaProjection] has
    // been called multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [RibbonDefaultCheckBoxContentModel] instance, which then gets
    // propagated to be reflected in all checkboxes created from this content model.
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

    // The "isSelected" property can be modified even after [KRibbonCheckBox.toJavaProjection] has
    // been called multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [RibbonDefaultCheckBoxContentModel] instance, which then gets
    // propagated to be reflected in all checkboxes created from this content model.
    private var _isSelected: Boolean = false
    public var isSelected: Boolean
        get() = _isSelected
        set(value) {
            _isSelected = value
            builder.setEnabled(value)
            if (hasBeenConverted) {
                javaContentModel.isSelected = value
            }
        }

    public fun richTooltip(init: KRichTooltip.() -> Unit) {
        if (richTooltip == null) {
            richTooltip = KRichTooltip()
        }
        richTooltip!!.init()
    }

    internal fun asJavaCheckBoxContentModel(): RibbonCheckBoxContentModel {
        if (hasBeenConverted) {
            return javaContentModel
        }

        val javaBuilder = RibbonCheckBoxContentModel.builder()
                .setIconFactory(this.iconFactory)
                .setCaption(this.caption)
                .setEnabled(this.isEnabled)
                .setText(this.text)
                .setSelected(this.isSelected)
                .setActionListener(this.actionListener)
                .setRichTooltip(this.richTooltip?.toJavaRichTooltip())
        javaContentModel = javaBuilder.build()
        hasBeenConverted = true
        return javaContentModel
    }

}

@RadianceElementMarker
public class KRibbonCheckBox {
    internal var content: KRibbonCheckBoxContentModel = KRibbonCheckBoxContentModel()
    internal val presentation: KComponentPresentation = KComponentPresentation()

    public fun content(init: KRibbonCheckBoxContentModel.() -> Unit) {
        content.init()
    }

    public operator fun KRibbonCheckBoxContentModel.unaryPlus() {
        this@KRibbonCheckBox.content = this
    }

    public fun presentation(init: KComponentPresentation.() -> Unit) {
        presentation.init()
    }

    internal fun toJavaProjection(): RibbonCheckBoxProjection {
        val javaContent = content.asJavaCheckBoxContentModel()
        val javaPresentation = presentation.toComponentPresentation()
        return RibbonCheckBoxProjection(
            javaContent,
            javaPresentation
        )
    }
}

public fun checkBoxContentModel(init: KRibbonCheckBoxContentModel.() -> Unit): KRibbonCheckBoxContentModel {
    val result = KRibbonCheckBoxContentModel()
    result.init()
    return result
}

public fun KRibbonBand.checkBox(init: KRibbonCheckBox.() -> Unit) {
    val ribbonCheckBox = KRibbonCheckBox()
    ribbonCheckBox.init()
    this.component(ribbonCheckBox.toJavaProjection())
}

public fun KFlowRibbonBand.flowCheckBox(init: KRibbonCheckBox.() -> Unit) {
    val ribbonCheckBox = KRibbonCheckBox()
    ribbonCheckBox.init()
    this.flowComponent(ribbonCheckBox.toJavaProjection())
}

public fun KRibbonBandGroup.checkBox(init: KRibbonCheckBox.() -> Unit) {
    val ribbonCheckBox = KRibbonCheckBox()
    ribbonCheckBox.init()
    this.component(ribbonCheckBox.toJavaProjection())
}

public fun KRibbonTaskbar.checkBox(init: KRibbonCheckBox.() -> Unit) {
    val ribbonCheckBox = KRibbonCheckBox()
    ribbonCheckBox.init()
    this.component(ribbonCheckBox.toJavaProjection())
}


