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

import org.pushingpixels.radiance.components.api.ribbon.synapse.model.RibbonSpinnerDateContentModel
import org.pushingpixels.radiance.components.api.ribbon.synapse.model.RibbonSpinnerNumberContentModel
import org.pushingpixels.radiance.components.api.ribbon.synapse.projection.RibbonSpinnerProjection
import org.pushingpixels.radiance.common.api.icon.RadianceIcon
import org.pushingpixels.plasma.PlasmaElementMarker
import org.pushingpixels.plasma.KRichTooltip
import org.pushingpixels.plasma.NonNullDelegate
import org.pushingpixels.plasma.NullableDelegate
import org.pushingpixels.plasma.ribbon.KFlowRibbonBand
import org.pushingpixels.plasma.ribbon.KRibbonBand
import org.pushingpixels.plasma.ribbon.KRibbonBandGroup
import org.pushingpixels.plasma.ribbon.KRibbonTaskbar
import java.util.*

@PlasmaElementMarker
public class KRibbonSpinnerNumberContentModel {
    private val builder = RibbonSpinnerNumberContentModel.builder()
    internal lateinit var javaContentModel: RibbonSpinnerNumberContentModel
    internal var hasBeenConverted: Boolean = false

    internal var richTooltip: KRichTooltip? by NullableDelegate { false }
    public var iconFactory: RadianceIcon.Factory? by NullableDelegate { false }
    public var caption: String? by NullableDelegate { false }
    public var value : Int by NonNullDelegate { false }
    public var minimum : Int by NonNullDelegate { false }
    public var maximum : Int by NonNullDelegate { false }
    public var stepSize : Int by NonNullDelegate { false }
    public var selectionChangeListener: ((oldSelection: Any?, newSelection: Any?) -> Unit)? by NullableDelegate { false }

    // The "isEnabled" property can be modified even after [KRibbonSpinnerNumber.toJavaProjection] has
    // been called multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [RibbonSpinnerNumberContentModel] instance, which then gets
    // propagated to be reflected in all spinners created from this content model.
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

    init {
        value = 0
        minimum = 0
        maximum = 0
        stepSize = 0
    }

    public fun richTooltip(init: KRichTooltip.() -> Unit) {
        if (richTooltip == null) {
            richTooltip = KRichTooltip()
        }
        richTooltip!!.init()
    }

    internal fun asJavaSpinnerNumberContentModel(): RibbonSpinnerNumberContentModel {
        if (hasBeenConverted) {
            return javaContentModel
        }

        val javaBuilder = RibbonSpinnerNumberContentModel.builder()
                .setIconFactory(this.iconFactory)
                .setCaption(this.caption)
                .setEnabled(this.isEnabled)
                .setValues(this.value, this.minimum, this.maximum, this.stepSize)
                .setSelectionChangeListener(this.selectionChangeListener)
                .setRichTooltip(this.richTooltip?.toJavaRichTooltip())
        javaContentModel = javaBuilder.build()
        hasBeenConverted = true
        return javaContentModel
    }

}

@PlasmaElementMarker
public class KRibbonSpinnerNumber {
    internal var content: KRibbonSpinnerNumberContentModel = KRibbonSpinnerNumberContentModel()
    internal val presentation: KComponentPresentation = KComponentPresentation()

    public fun content(init: KRibbonSpinnerNumberContentModel.() -> Unit) {
        content.init()
    }

    public operator fun KRibbonSpinnerNumberContentModel.unaryPlus() {
        this@KRibbonSpinnerNumber.content = this
    }

    public fun presentation(init: KComponentPresentation.() -> Unit) {
        presentation.init()
    }

    internal fun toJavaProjection(): RibbonSpinnerProjection {
        val javaContent = content.asJavaSpinnerNumberContentModel()
        val javaPresentation = presentation.toComponentPresentation()
        return RibbonSpinnerProjection(
            javaContent,
            javaPresentation
        )
    }
}

public fun spinnerNumberContentModel(init: KRibbonSpinnerNumberContentModel.() -> Unit): KRibbonSpinnerNumberContentModel {
    val result = KRibbonSpinnerNumberContentModel()
    result.init()
    return result
}

public fun KRibbonBand.spinnerNumber(init: KRibbonSpinnerNumber.() -> Unit) {
    val ribbonSpinner = KRibbonSpinnerNumber()
    ribbonSpinner.init()
    this.component(ribbonSpinner.toJavaProjection())
}

public fun KFlowRibbonBand.flowSpinnerNumber(init: KRibbonSpinnerNumber.() -> Unit) {
    val ribbonSpinner = KRibbonSpinnerNumber()
    ribbonSpinner.init()
    this.flowComponent(ribbonSpinner.toJavaProjection())
}

public fun KRibbonBandGroup.spinnerNumber(init: KRibbonSpinnerNumber.() -> Unit) {
    val ribbonSpinner = KRibbonSpinnerNumber()
    ribbonSpinner.init()
    this.component(ribbonSpinner.toJavaProjection())
}

public fun KRibbonTaskbar.spinnerNumber(init: KRibbonSpinnerNumber.() -> Unit) {
    val ribbonSpinner = KRibbonSpinnerNumber()
    ribbonSpinner.init()
    this.component(ribbonSpinner.toJavaProjection())
}

@PlasmaElementMarker
public class KRibbonSpinnerDateContentModel {
    private val builder = RibbonSpinnerDateContentModel.builder()
    internal lateinit var javaContentModel: RibbonSpinnerDateContentModel
    internal var hasBeenConverted: Boolean = false

    internal var richTooltip: KRichTooltip? by NullableDelegate { false }
    public var iconFactory: RadianceIcon.Factory? by NullableDelegate { false }
    public var caption: String? by NullableDelegate { false }

    public var value : Date? by NullableDelegate { false }
    public var start : Comparable<Date>? by NullableDelegate { false }
    public var end : Comparable<Date>? by NullableDelegate { false }
    public var calendarField : Int? by NullableDelegate { false }
    public var selectionChangeListener: ((oldSelection: Any?, newSelection: Any?) -> Unit)? by NullableDelegate { false }

    // The "isEnabled" property can be modified even after [KRibbonSpinnerNumber.toJavaProjection] has
    // been called multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [RibbonSpinnerNumberContentModel] instance, which then gets
    // propagated to be reflected in all spinners created from this content model.
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

    internal fun asJavaSpinnerDateContentModel(): RibbonSpinnerDateContentModel {
        if (hasBeenConverted) {
            return javaContentModel
        }

        var javaBuilder = RibbonSpinnerDateContentModel.builder()
                .setIconFactory(this.iconFactory)
                .setCaption(this.caption)
                .setEnabled(this.isEnabled)
                .setSelectionChangeListener(this.selectionChangeListener)
                .setRichTooltip(this.richTooltip?.toJavaRichTooltip())

        if ((this.value != null) && (this.start != null) && (this.end != null) && (this.calendarField != null)) {
            javaBuilder = javaBuilder.setValues(this.value, this.start, this.end, this.calendarField!!)
        }

        javaContentModel = javaBuilder.build()
        hasBeenConverted = true
        return javaContentModel
    }

}

@PlasmaElementMarker
public class KRibbonSpinnerDate {
    internal var content: KRibbonSpinnerDateContentModel = KRibbonSpinnerDateContentModel()
    internal val presentation: KComponentPresentation = KComponentPresentation()

    public fun content(init: KRibbonSpinnerDateContentModel.() -> Unit) {
        content.init()
    }

    public operator fun KRibbonSpinnerDateContentModel.unaryPlus() {
        this@KRibbonSpinnerDate.content = this
    }

    public fun presentation(init: KComponentPresentation.() -> Unit) {
        presentation.init()
    }

    internal fun toJavaProjection(): RibbonSpinnerProjection {
        val javaContent = content.asJavaSpinnerDateContentModel()
        val javaPresentation = presentation.toComponentPresentation()
        return RibbonSpinnerProjection(
            javaContent,
            javaPresentation
        )
    }
}

public fun spinnerNumberDateModel(init: KRibbonSpinnerDateContentModel.() -> Unit): KRibbonSpinnerDateContentModel {
    val result = KRibbonSpinnerDateContentModel()
    result.init()
    return result
}

public fun KRibbonBand.spinnerDate(init: KRibbonSpinnerDate.() -> Unit) {
    val ribbonSpinner = KRibbonSpinnerDate()
    ribbonSpinner.init()
    this.component(ribbonSpinner.toJavaProjection())
}

public fun KFlowRibbonBand.flowSpinnerDate(init: KRibbonSpinnerDate.() -> Unit) {
    val ribbonSpinner = KRibbonSpinnerDate()
    ribbonSpinner.init()
    this.flowComponent(ribbonSpinner.toJavaProjection())
}

public fun KRibbonBandGroup.spinnerDate(init: KRibbonSpinnerDate.() -> Unit) {
    val ribbonSpinner = KRibbonSpinnerDate()
    ribbonSpinner.init()
    this.component(ribbonSpinner.toJavaProjection())
}

public fun KRibbonTaskbar.spinnerDate(init: KRibbonSpinnerDate.() -> Unit) {
    val ribbonSpinner = KRibbonSpinnerDate()
    ribbonSpinner.init()
    this.component(ribbonSpinner.toJavaProjection())
}


