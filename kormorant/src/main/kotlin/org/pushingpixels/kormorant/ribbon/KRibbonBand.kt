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

import org.pushingpixels.flamingo.api.common.model.CommandPresentation
import org.pushingpixels.flamingo.api.ribbon.AbstractRibbonBand
import org.pushingpixels.flamingo.api.ribbon.JFlowRibbonBand
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority
import org.pushingpixels.flamingo.api.ribbon.resize.RibbonBandResizePolicy
import org.pushingpixels.kormorant.*
import org.pushingpixels.neon.icon.ResizableIcon
import java.awt.event.ActionListener
import javax.swing.JComponent

@FlamingoElementMarker
class KRibbonBandExpandCommand {
    var action: ActionListener? by NullableDelegate { false }
    internal var richTooltip: KRichTooltip? by NullableDelegate { false }
    var keyTip: String? by NullableDelegate { false }

    fun richTooltip(init: KRichTooltip.() -> Unit) {
        if (richTooltip == null) {
            richTooltip = KRichTooltip()
        }
        (richTooltip as KRichTooltip).init()
    }
}

sealed class KBaseRibbonBand<T : AbstractRibbonBand> {
    protected lateinit var ribbonBand: T
    protected var hasBeenConverted: Boolean = false

    var title: String? by NullableDelegate { hasBeenConverted }
    var icon: ResizableIcon? by NullableDelegate { hasBeenConverted }
    protected var expandCommand: KRibbonBandExpandCommand? by NullableDelegate { hasBeenConverted }
    var collapsedStateKeyTip: String? by NullableDelegate { hasBeenConverted }

    var resizePolicies: ((ribbonBand: JRibbonBand) -> List<RibbonBandResizePolicy>)?
            by NullableDelegate { hasBeenConverted }

    fun expandCommand(init: KRibbonBandExpandCommand.() -> Unit) {
        if (expandCommand == null) {
            expandCommand = KRibbonBandExpandCommand()
        }
        (expandCommand as KRibbonBandExpandCommand).init()
    }

    abstract fun asJavaRibbonBand(): AbstractRibbonBand
}

@FlamingoElementMarker
class KRibbonBandGroup {
    var title: String? by NullableDelegate { false }

    internal val content = arrayListOf<Pair<RibbonElementPriority?, Any>>()

    internal data class CommandConfig(val command: KCommand, val actionKeyTip: String?, val popupKeyTip: String?)

    fun command(priority: RibbonElementPriority, actionKeyTip: String? = null,
            popupKeyTip: String? = null, init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        content.add(Pair(priority, CommandConfig(command, actionKeyTip, popupKeyTip)))
        return command
    }

    fun command(priority: RibbonElementPriority, actionKeyTip: String? = null,
            popupKeyTip: String? = null, command: KCommand) {
        content.add(Pair(priority, CommandConfig(command, actionKeyTip, popupKeyTip)))
    }

    fun gallery(priority: RibbonElementPriority, init: KRibbonGallery.() -> Unit): KRibbonGallery {
        val gallery = KRibbonGallery()
        gallery.init()
        content.add(Pair(priority, gallery))
        return gallery
    }

    fun wrapper(init: KRibbonComponent.() -> Unit): KRibbonComponent {
        val component = KRibbonComponent()
        component.init()
        content.add(Pair(null, component))
        return component
    }
}

@FlamingoElementMarker
class KRibbonBand : KBaseRibbonBand<JRibbonBand>() {
    private val groups = arrayListOf<KRibbonBandGroup>()
    private val defaultGroup = KRibbonBandGroup()

    init {
        groups.add(defaultGroup)
    }

    fun command(priority: RibbonElementPriority, actionKeyTip: String? = null,
            popupKeyTip: String? = null, init: KCommand.() -> Unit): KCommand {
        if (groups.size > 1) {
            throw IllegalStateException("Can't add a command to default group after starting another group")
        }
        val command = KCommand()
        command.init()
        defaultGroup.content.add(Pair(priority, KRibbonBandGroup.CommandConfig(command, actionKeyTip, popupKeyTip)))
        return command
    }

    fun command(priority: RibbonElementPriority, actionKeyTip: String? = null,
            popupKeyTip: String? = null, command: KCommand) {
        if (groups.size > 1) {
            throw IllegalStateException("Can't add a command to default group after starting another group")
        }
        defaultGroup.content.add(Pair(priority, KRibbonBandGroup.CommandConfig(command, actionKeyTip, popupKeyTip)))
    }

    fun gallery(priority: RibbonElementPriority, init: KRibbonGallery.() -> Unit): KRibbonGallery {
        if (groups.size > 1) {
            throw IllegalStateException("Can't add a gallery to default group after starting another group")
        }
        val gallery = KRibbonGallery()
        gallery.init()
        defaultGroup.content.add(Pair(priority, gallery))
        return gallery
    }

    fun wrapper(init: KRibbonComponent.() -> Unit): KRibbonComponent {
        if (groups.size > 1) {
            throw IllegalStateException("Can't add a component to default group after starting another group")
        }
        val component = KRibbonComponent()
        component.init()
        defaultGroup.content.add(Pair(null, component))
        return component
    }

    fun group(init: KRibbonBandGroup.() -> Unit): KRibbonBandGroup {
        val group = KRibbonBandGroup()
        group.init()
        groups.add(group)
        return group
    }

    override fun asJavaRibbonBand(): AbstractRibbonBand {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }
        ribbonBand = JRibbonBand(title, icon)
        if (expandCommand != null) {
            ribbonBand.expandActionListener = expandCommand!!.action
            ribbonBand.expandButtonKeyTip = expandCommand!!.keyTip
            if (expandCommand!!.richTooltip != null) {
                ribbonBand.expandButtonRichTooltip = expandCommand!!.richTooltip!!.toJavaRichTooltip()
            }
        }
        ribbonBand.collapsedStateKeyTip = collapsedStateKeyTip

        for (group in groups) {
            // skip empty default group
            if ((group == defaultGroup) && group.content.isEmpty()) {
                continue
            }

            ribbonBand.startGroup(group.title)
            for ((priority, content) in group.content) {
                when (content) {
                    is KRibbonBandGroup.CommandConfig -> {
                        ribbonBand.addRibbonCommand(
                                content.command.asJavaCommand().project(
                                        CommandPresentation.builder()
                                                .setActionKeyTip(content.actionKeyTip)
                                                .setPopupKeyTip(content.popupKeyTip)
                                                .build()), priority)
                    }
                    is KRibbonComponent -> {
                        ribbonBand.addRibbonComponent(content.asJavaRibbonComponent())
                    }
                    is KRibbonGallery -> {
                        // Get the presentation model
                        val galleryPresentationModel = content.presentation.toRibbonGalleryPresentationModel()

                        // Get the content model
                        val galleryContentModel = content.content.asJavaRibbonGalleryContentModel()

                        ribbonBand.addRibbonGallery(galleryContentModel, galleryPresentationModel, priority)
                    }
                }
            }
        }

        if (resizePolicies != null) {
            ribbonBand.resizePolicies = resizePolicies!!(ribbonBand)
        }
        hasBeenConverted = true
        return ribbonBand
    }
}

@FlamingoElementMarker
class KFlowRibbonBand : KBaseRibbonBand<JFlowRibbonBand>() {
    private val components = arrayListOf<Any>()

    fun flowComponent(component: JComponent) {
        components.add(component)
    }

    fun flowCommandButtonStrip(init: KCommandStrip.() -> Unit) {
        val commandButtonStrip = KCommandStrip(false)
        commandButtonStrip.init()
        components.add(commandButtonStrip)
    }

    fun flowCommandToggleButtonStrip(init: KCommandStrip.() -> Unit) {
        val commandButtonStrip = KCommandStrip(true)
        commandButtonStrip.init()
        components.add(commandButtonStrip)
    }

    fun ribbonComponent(init: KRibbonComponent.() -> Unit) {
        val ribbonComponent = KRibbonComponent()
        ribbonComponent.init()
        components.add(ribbonComponent)
    }

    override fun asJavaRibbonBand(): AbstractRibbonBand {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }
        ribbonBand = JFlowRibbonBand(title, icon)
        if (expandCommand != null) {
            ribbonBand.expandActionListener = expandCommand!!.action
            ribbonBand.expandButtonKeyTip = expandCommand!!.keyTip
            if (expandCommand!!.richTooltip != null) {
                ribbonBand.expandButtonRichTooltip = expandCommand!!.richTooltip!!.toJavaRichTooltip()
            }
        }
        ribbonBand.collapsedStateKeyTip = collapsedStateKeyTip

        for (component in components) {
            when (component) {
                is JComponent -> ribbonBand.addFlowComponent(component)
                is KCommandStrip -> ribbonBand.addFlowComponent(component.toJavaButtonStrip())
                is KRibbonComponent -> ribbonBand.addFlowComponent(component.asJavaRibbonComponent())
                else -> throw IllegalStateException("Unknown ${component.javaClass}")
            }
        }
        hasBeenConverted = true
        return ribbonBand
    }
}

fun ribbonBand(init: KRibbonBand.() -> Unit): KRibbonBand {
    val ribbonBand = KRibbonBand()
    ribbonBand.init()
    return ribbonBand
}

fun flowRibbonBand(init: KFlowRibbonBand.() -> Unit): KFlowRibbonBand {
    val flowRibbonBand = KFlowRibbonBand()
    flowRibbonBand.init()
    return flowRibbonBand
}
