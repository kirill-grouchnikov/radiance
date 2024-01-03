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
package org.pushingpixels.radiance.component.ktx

import org.pushingpixels.radiance.component.api.common.RichTooltip
import org.pushingpixels.radiance.component.api.common.model.CommandToggleGroupModel
import org.pushingpixels.radiance.common.api.icon.RadianceIcon.Factory
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel
import org.pushingpixels.radiance.component.api.common.model.RichTooltipPresentationModel
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import java.awt.Color
import java.awt.Dimension
import java.awt.Insets
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

internal class NullableDelegate<T>(private val shouldBlockUpdates: () -> Boolean) : ReadWriteProperty<Any, T?> {
    private var value: T? = null

    override fun getValue(thisRef: Any, property: KProperty<*>): T? {
        return this.value
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T?) {
        if (shouldBlockUpdates.invoke()) {
            throw IllegalStateException("Cannot modify field after converting to Swing component")
        }
        this.value = value
    }
}

internal class NonNullDelegate<T : Any>(private val shouldBlockUpdates: () -> Boolean) {
    private lateinit var value: T
    private var isInitialized = false

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        if (!this.isInitialized) {
            throw UninitializedPropertyAccessException(property.name)
        }
        return this.value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        if (shouldBlockUpdates.invoke()) {
            throw IllegalStateException("Cannot modify field after converting to Swing component")
        }
        this.isInitialized = true
        this.value = value
    }
}

// Annotation to control the receiver scoping in the Radiance DSL
@DslMarker
internal annotation class RadianceElementMarker

@RadianceElementMarker
public class TextContainer {
    internal val strings = arrayListOf<String>()

    public operator fun String.unaryPlus() {
        strings.add(this)
    }
}

@RadianceElementMarker
public class ColorContainer {
    internal val colors = arrayListOf<Color>()

    public operator fun Color.unaryPlus() {
        colors.add(this)
    }
}

@RadianceElementMarker
public class KRichTooltip {
    public var title: String? = null
    public var mainIconFactory: Factory? = null
    private val descriptionSections = TextContainer()
    public var footerIconFactory: Factory? = null
    private val footerSections = TextContainer()

    public var description: String? = null
    set(value) {
        if (value != null) {
            descriptionSections.strings.add(value)
        }
    }

    public fun description(init: TextContainer.() -> Unit) {
        descriptionSections.init()
    }

    public var footer: String? = null
        set(value) {
            if (value != null) {
                footerSections.strings.add(value)
            }
        }

    public fun footer(init: TextContainer.() -> Unit) {
        footerSections.init()
    }

    internal fun toJavaRichTooltip(): RichTooltip {
        val builder = RichTooltip.builder()
        builder.setTitle(title)
        builder.setMainIconFactory(mainIconFactory)
        for (descriptionSection in descriptionSections.strings) {
            builder.addDescriptionSection(descriptionSection)
        }
        builder.setFooterIconFactory(footerIconFactory)
        for (footerSection in footerSections.strings) {
            builder.addFooterSection(footerSection)
        }

        return builder.build()
    }
}

@RadianceElementMarker
public open class KRichTooltipPresentation {
    public var contentPadding: Insets =
        RichTooltipPresentationModel.DEFAULT_CONTENT_PADDING
    public var mainIconSize: Dimension = Dimension(RichTooltipPresentationModel.LARGE_ICON_SIZE,
        RichTooltipPresentationModel.LARGE_ICON_SIZE)
    public var footerIconSize: Dimension = Dimension(RichTooltipPresentationModel.SMALL_ICON_SIZE,
        RichTooltipPresentationModel.SMALL_ICON_SIZE)

    internal fun toRichTooltipPresentation(): RichTooltipPresentationModel {
        val result = RichTooltipPresentationModel.builder()
            .setContentPadding(contentPadding)
            .setMainIconSize(mainIconSize)
            .setFooterIconSize(footerIconSize)

        return result.build()
    }
}

public class KCommandToggleGroupModel {
    internal val javaCommandToggleModel =
        CommandToggleGroupModel()
}

public fun commandToggleGroup(): KCommandToggleGroupModel {
    return KCommandToggleGroupModel()
}




