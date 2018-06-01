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

import org.pushingpixels.flamingo.api.ribbon.AbstractRibbonBand
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority
import org.pushingpixels.flamingo.api.ribbon.resize.RibbonBandResizePolicy
import org.pushingpixels.flamingo.internal.ui.ribbon.AbstractBandControlPanel
import org.pushingpixels.flamingo.internal.ui.ribbon.JBandControlPanel
import org.pushingpixels.kormorant.FlamingoElementMarker
import org.pushingpixels.kormorant.KCommand
import org.pushingpixels.kormorant.KRichTooltip
import org.pushingpixels.kormorant.NullableDelegate
import org.pushingpixels.neon.icon.ResizableIcon
import java.awt.event.ActionListener
import java.util.*

@FlamingoElementMarker
class KRibbonBandExpandCommand {
    var action: ActionListener? by NullableDelegate(null)
    var richTooltip: KRichTooltip? by NullableDelegate(null)
    var keyTip: String? by NullableDelegate(null)

    fun richTooltip(init: KRichTooltip.() -> Unit) {
        if (richTooltip == null) {
            richTooltip = KRichTooltip()
        }
        (richTooltip as KRichTooltip).init()
    }
}

interface ResizePolicySource {
    fun getResizePolicy(controlPanel : JBandControlPanel) : RibbonBandResizePolicy
}

@FlamingoElementMarker
class ResizePolicyContainer {
    val policies = arrayListOf<ResizePolicySource>()

    operator fun ResizePolicySource.unaryPlus() {
        policies.add(this)
    }
}

@FlamingoElementMarker
class KRibbonBand {
    private var ribbonBand: JRibbonBand? = null

    private val commands = arrayListOf<Pair<RibbonElementPriority, KCommand>>()
    private val resizePolicies = ResizePolicyContainer()

    var title: String? by NullableDelegate(ribbonBand)
    var icon: ResizableIcon? by NullableDelegate(ribbonBand)
    private var expandCommand: KRibbonBandExpandCommand? by NullableDelegate(ribbonBand)
    var collapsedStateKeyTip: String? by NullableDelegate(null)

    fun expandCommand(init: KRibbonBandExpandCommand.() -> Unit) {
        if (expandCommand == null) {
            expandCommand = KRibbonBandExpandCommand()
        }
        (expandCommand as KRibbonBandExpandCommand).init()
    }

    fun resizePolicies(init: ResizePolicyContainer.() -> Unit) {
        resizePolicies.init()
    }

    fun command(priority: RibbonElementPriority, init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        commands.add(Pair(priority, command))
        return command
    }

    fun asRibbonBand(): AbstractRibbonBand<out AbstractBandControlPanel> {
        if (ribbonBand != null) {
            throw IllegalStateException("This method can only be called once")
        }
        ribbonBand = JRibbonBand(title, icon)
        if (expandCommand != null) {
            ribbonBand!!.expandActionListener = expandCommand!!.action
            ribbonBand!!.expandButtonKeyTip = expandCommand!!.keyTip
            if (expandCommand!!.richTooltip != null) {
                ribbonBand!!.expandButtonRichTooltip = expandCommand!!.richTooltip!!.buildRichTooltip()
            }
        }
        ribbonBand!!.collapsedStateKeyTip = collapsedStateKeyTip
        for ((priority, command) in commands) {
            val commandButton = command.asButton()
            commandButton.isFlat = false
            ribbonBand!!.addRibbonCommand(command.toFlamingoCommand(), priority)
        }

        if (!resizePolicies.policies.isEmpty()) {
            val javaResizePolicies = ArrayList<RibbonBandResizePolicy>()
            for (resizePolicy in resizePolicies.policies) {
                javaResizePolicies.add(resizePolicy.getResizePolicy(ribbonBand!!.controlPanel))
            }

            ribbonBand!!.resizePolicies = javaResizePolicies
        }

        return ribbonBand!!
    }
}

fun ribbonBand(init: KRibbonBand.() -> Unit): KRibbonBand {
    val ribbonBand = KRibbonBand()
    ribbonBand.init()
    return ribbonBand
}
