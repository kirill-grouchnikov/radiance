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

import org.pushingpixels.flamingo.api.common.*
import org.pushingpixels.flamingo.api.ribbon.AbstractRibbonBand
import org.pushingpixels.flamingo.api.ribbon.JFlowRibbonBand
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority
import org.pushingpixels.flamingo.api.ribbon.resize.RibbonBandResizePolicy
import org.pushingpixels.flamingo.internal.ui.ribbon.AbstractBandControlPanel
import org.pushingpixels.flamingo.internal.ui.ribbon.JBandControlPanel
import org.pushingpixels.flamingo.internal.ui.ribbon.JFlowBandControlPanel
import org.pushingpixels.kormorant.*
import org.pushingpixels.neon.icon.ResizableIcon
import java.awt.event.ActionListener
import java.util.*
import javax.swing.JComponent

@FlamingoElementMarker
class KRibbonBandExpandCommand {
    var action: ActionListener? by NullableDelegate(null)
    internal var richTooltip: KRichTooltip? by NullableDelegate(null)
    var keyTip: String? by NullableDelegate(null)

    fun richTooltip(init: KRichTooltip.() -> Unit) {
        if (richTooltip == null) {
            richTooltip = KRichTooltip()
        }
        (richTooltip as KRichTooltip).init()
    }
}

@FlamingoElementMarker
class GalleryCommandVisibilityContainer {
    internal val policies = arrayListOf<Pair<Int, RibbonElementPriority>>()

    infix fun Int.at(priority: RibbonElementPriority) {
        policies.add(Pair(this, priority))
    }
}

@FlamingoElementMarker
class KRibbonGalleryDisplay {
    var state: CommandButtonDisplayState = CommandButtonDisplayState.FIT_TO_ICON
    var preferredPopupMaxCommandColumns: Int? by NullableDelegate(null)
    var preferredPopupMaxVisibleCommandRows: Int? by NullableDelegate(null)
    internal val commandVisibilityContainer = GalleryCommandVisibilityContainer()

    fun commandVisibilities(init: GalleryCommandVisibilityContainer.() -> Unit) {
        commandVisibilityContainer.init()
    }
}

@FlamingoElementMarker
class KRibbonGalleryExtraPopupContent {
    internal val components = arrayListOf<Any>()

    fun command(init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        components.add(command)
        return command
    }

    fun separator() {
        components.add(KCommandPopupMenu.KCommandPopupMenuSeparator())
    }
}

@FlamingoElementMarker
class KRibbonGallery {
    class KRibbonGalleryCommandGroup {
        var title: String by NonNullDelegate(null)
        internal val commands = arrayListOf<KCommand>()

        fun command(init: KCommand.() -> Unit): KCommand {
            val command = KCommand()
            command.init()
            commands.add(command)
            return command
        }
    }

    var title: String by NonNullDelegate(null)
    internal val display: KRibbonGalleryDisplay = KRibbonGalleryDisplay()
    var expandKeyTip: String? by NullableDelegate(null)
    internal val commandGroups = arrayListOf<KRibbonGalleryCommandGroup>()
    internal val extraPopupContent: KRibbonGalleryExtraPopupContent = KRibbonGalleryExtraPopupContent()

    fun display(init: KRibbonGalleryDisplay.() -> Unit) {
        display.init()
    }

    fun commandGroup(init: KRibbonGalleryCommandGroup.() -> Unit): KRibbonGalleryCommandGroup {
        val commandGroup = KRibbonGalleryCommandGroup()
        commandGroup.init()
        commandGroups.add(commandGroup)
        return commandGroup
    }

    fun extraPopupContent(init: KRibbonGalleryExtraPopupContent.() -> Unit) {
        extraPopupContent.init()
    }
}

sealed class KBaseRibbonBand<V : AbstractBandControlPanel, T : AbstractRibbonBand<V>> {
    protected var ribbonBand: T? = null

    var title: String? by NullableDelegate(ribbonBand)
    var icon: ResizableIcon? by NullableDelegate(ribbonBand)
    protected var expandCommand: KRibbonBandExpandCommand? by NullableDelegate(ribbonBand)
    var collapsedStateKeyTip: String? by NullableDelegate(null)

    var resizePolicies: ((ribbonBand: JRibbonBand) -> List<RibbonBandResizePolicy>)?
            by NullableDelegate(ribbonBand)

    fun expandCommand(init: KRibbonBandExpandCommand.() -> Unit) {
        if (expandCommand == null) {
            expandCommand = KRibbonBandExpandCommand()
        }
        (expandCommand as KRibbonBandExpandCommand).init()
    }

    abstract fun asRibbonBand(): AbstractRibbonBand<out AbstractBandControlPanel>
}

@FlamingoElementMarker
class KRibbonBandGroup {
    var title: String? by NullableDelegate(null)

    internal val content = arrayListOf<Pair<RibbonElementPriority?, Any>>()
    internal val spans = hashMapOf<KRibbonComponent, Int>()

    fun command(priority: RibbonElementPriority, init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        content.add(Pair(priority, command))
        return command
    }

    fun gallery(priority: RibbonElementPriority, init: KRibbonGallery.() -> Unit): KRibbonGallery {
        val gallery = KRibbonGallery()
        gallery.init()
        content.add(Pair(priority, gallery))
        return gallery
    }

    fun wrapper(rowSpan: Int = 1, init: KRibbonComponent.() -> Unit): KRibbonComponent {
        val component = KRibbonComponent()
        component.init()
        content.add(Pair(null, component))
        spans[component] = rowSpan
        return component
    }
}

@FlamingoElementMarker
class KRibbonBand : KBaseRibbonBand<JBandControlPanel, JRibbonBand>() {
    private val groups = arrayListOf<KRibbonBandGroup>()
    private val defaultGroup = KRibbonBandGroup()

    init {
        groups.add(defaultGroup)
    }

    fun command(priority: RibbonElementPriority, init: KCommand.() -> Unit): KCommand {
        if (groups.size > 1) {
            throw IllegalStateException("Can't add a command to default group after starting another group")
        }
        val command = KCommand()
        command.init()
        defaultGroup.content.add(Pair(priority, command))
        return command
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

    fun wrapper(rowSpan : Int = 1, init: KRibbonComponent.() -> Unit): KRibbonComponent {
        if (groups.size > 1) {
            throw IllegalStateException("Can't add a component to default group after starting another group")
        }
        val component = KRibbonComponent()
        component.init()
        defaultGroup.content.add(Pair(null, component))
        defaultGroup.spans[component] = rowSpan
        return component
    }

    fun group(init: KRibbonBandGroup.() -> Unit): KRibbonBandGroup {
        val group = KRibbonBandGroup()
        group.init()
        groups.add(group)
        return group
    }

    override fun asRibbonBand(): AbstractRibbonBand<out AbstractBandControlPanel> {
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

        for (group in groups) {
            // skip empty default group
            if ((group == defaultGroup) && group.content.isEmpty()) {
                continue
            }

            ribbonBand!!.startGroup(group.title)
            for ((priority, content) in group.content) {
                when (content) {
                    is KCommand -> {
                        val commandButton = content.asButton()
                        commandButton.isFlat = false
                        ribbonBand!!.addRibbonCommand(content.toFlamingoCommand(), priority)
                    }
                    is KRibbonComponent -> {
                        ribbonBand!!.addRibbonComponent(content.asRibbonComponent(),
                                group.spans[content]!!)
                    }
                    is KRibbonGallery -> {
                        val stylesGalleryCommands = ArrayList<StringValuePair<List<FlamingoCommand>>>()
                        for (commandGroup in content.commandGroups) {
                            stylesGalleryCommands.add(StringValuePair(commandGroup.title,
                                    commandGroup.commands.map { it -> it.toFlamingoCommand() }))
                        }
                        ribbonBand!!.addRibbonGallery(content.title, stylesGalleryCommands,
                                content.display.commandVisibilityContainer.policies.map { it.second to it.first }.toMap(),
                                content.display.preferredPopupMaxCommandColumns!!,
                                content.display.preferredPopupMaxVisibleCommandRows!!,
                                content.display.state,
                                priority)
                        ribbonBand!!.setRibbonGalleryExpandKeyTip(content.title, content.expandKeyTip)
                        if (!content.extraPopupContent.components.isEmpty()) {
                            // A null entry in the mapped list means that the entry is a separator
                            val javaExtraPopupContent =
                                    content.extraPopupContent.components.map { it -> (it as? KCommand)?.asMenuButton() }
                            ribbonBand!!.setRibbonGalleryPopupCallback(content.title,
                                    { menu ->
                                        for (javaComponent in javaExtraPopupContent) {
                                            when (javaComponent) {
                                                is JCommandMenuButton -> menu.addMenuButton(javaComponent)
                                                is JCommandToggleMenuButton -> menu.addMenuButton(javaComponent)
                                                else -> menu.addMenuSeparator()
                                            }
                                        }
                                    })
                        }
                    }
                }
            }
        }

        if (resizePolicies != null) {
            ribbonBand!!.resizePolicies = resizePolicies!!(ribbonBand!!)
        }

        return ribbonBand!!
    }
}

@FlamingoElementMarker
class KFlowRibbonBand : KBaseRibbonBand<JFlowBandControlPanel, JFlowRibbonBand>() {
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

    override fun asRibbonBand(): AbstractRibbonBand<out AbstractBandControlPanel> {
        if (ribbonBand != null) {
            throw IllegalStateException("This method can only be called once")
        }
        ribbonBand = JFlowRibbonBand(title, icon)
        if (expandCommand != null) {
            ribbonBand!!.expandActionListener = expandCommand!!.action
            ribbonBand!!.expandButtonKeyTip = expandCommand!!.keyTip
            if (expandCommand!!.richTooltip != null) {
                ribbonBand!!.expandButtonRichTooltip = expandCommand!!.richTooltip!!.buildRichTooltip()
            }
        }
        ribbonBand!!.collapsedStateKeyTip = collapsedStateKeyTip

        for (component in components) {
            when (component) {
                is JComponent -> ribbonBand!!.addFlowComponent(component)
                is KCommandStrip -> ribbonBand!!.addFlowComponent(component.asButtonStrip())
                is KRibbonComponent -> ribbonBand!!.addFlowComponent(component.asRibbonComponent())
                else -> throw IllegalStateException("Unknown ${component.javaClass}")
            }
        }

        return ribbonBand!!
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
