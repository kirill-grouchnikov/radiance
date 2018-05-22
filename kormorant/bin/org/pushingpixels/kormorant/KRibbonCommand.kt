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
package org.pushingpixels.kormorant

import org.pushingpixels.flamingo.api.common.AbstractCommandButton
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon
import org.pushingpixels.flamingo.api.ribbon.RibbonCommand
import org.pushingpixels.flamingo.api.ribbon.RibbonCommand.RibbonCommandBuilder
import java.awt.event.ActionListener

class KRibbonCommand() {
    var title: String? = null
    var icon: ResizableIcon? = null
    var disabledIcon: ResizableIcon? = null
    var extraText: String? = null
    var action: ActionListener? = null
    
    fun toRibbonCommand() : RibbonCommand {
        val builder = RibbonCommandBuilder()
        builder.setTitle(title)
        builder.setIcon(icon)
        builder.setDisabledIcon(disabledIcon)
        builder.setExtraText(extraText)
        builder.setAction(action)
        
        return builder.build()
    }
    
    fun buildButton() : AbstractCommandButton {
        return toRibbonCommand().buildButton()
    }
    
    fun buildMenuButton() : AbstractCommandButton {
        return toRibbonCommand().buildMenuButton()
    }
}

fun ribbonCommand(init: KRibbonCommand.() -> Unit): KRibbonCommand {
    val kommand = KRibbonCommand()
    kommand.init()
    return kommand
}
