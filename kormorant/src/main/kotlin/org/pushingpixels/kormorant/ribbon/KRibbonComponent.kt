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
package org.pushingpixels.kormorant.ribbon

import org.pushingpixels.flamingo.api.common.HorizontalAlignment
import org.pushingpixels.flamingo.api.ribbon.JRibbonComponent
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority
import org.pushingpixels.kormorant.*
import org.pushingpixels.neon.icon.ResizableIcon
import javax.swing.JComponent

@FlamingoElementMarker
class KRibbonComponent {
    private lateinit var ribbonComponent: JRibbonComponent
    private var hasBeenConverted: Boolean = false

    var caption: String? by NullableDelegate { hasBeenConverted }
    var icon: ResizableIcon? by NullableDelegate { hasBeenConverted }
    var component: JComponent? by NullableDelegate { hasBeenConverted }
    var commandButton: KCommandButton? by NullableDelegate { hasBeenConverted }
    var keyTip: String? by NullableDelegate { hasBeenConverted }
    private var richTooltip: KRichTooltip? by NullableDelegate { hasBeenConverted }
    var horizontalAlignment: HorizontalAlignment? by NullableDelegate { hasBeenConverted }
    var displayPriority: RibbonElementPriority? by NullableDelegate { hasBeenConverted }
    var isResizingAware: Boolean? by NullableDelegate { hasBeenConverted }
    var isEnabled: Boolean by NonNullDelegate { hasBeenConverted }

    init {
        isEnabled = true
    }

    fun commandButton(init: KCommandButton.() -> Unit): KCommandButton {
        commandButton = KCommandButton()
        commandButton!!.init()
        return commandButton!!
    }

    fun richTooltip(init: KRichTooltip.() -> Unit) {
        if (richTooltip == null) {
            richTooltip = KRichTooltip()
        }
        (richTooltip as KRichTooltip).init()
    }

    fun asRibbonComponent(): JRibbonComponent {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }
        if (commandButton != null) {
            component = commandButton!!.asButton()
        }
        ribbonComponent = if (caption != null)
            JRibbonComponent(icon, caption, component) else
            JRibbonComponent(component)
        ribbonComponent.keyTip = keyTip
        ribbonComponent.setRichTooltip(richTooltip?.buildRichTooltip())
        if (horizontalAlignment != null) {
            ribbonComponent.horizontalAlignment = horizontalAlignment
        }
        if (displayPriority != null) {
            ribbonComponent.displayPriority = displayPriority
        }
        if (isResizingAware != null) {
            ribbonComponent.isResizingAware = isResizingAware!!
        }
        ribbonComponent.isEnabled = isEnabled
        hasBeenConverted = true
        return ribbonComponent
    }
}

fun ribbonComponent(init: KRibbonComponent.() -> Unit): KRibbonComponent {
    val ribbonComponent = KRibbonComponent()
    ribbonComponent.init()
    return ribbonComponent
}
