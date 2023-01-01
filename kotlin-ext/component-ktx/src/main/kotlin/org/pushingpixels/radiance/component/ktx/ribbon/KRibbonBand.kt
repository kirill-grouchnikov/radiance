/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.ktx.ribbon

import org.pushingpixels.radiance.common.api.icon.RadianceIcon.Factory
import org.pushingpixels.radiance.component.api.common.CommandAction
import org.pushingpixels.radiance.component.api.common.CommandActionEvent
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel
import org.pushingpixels.radiance.component.api.common.projection.ColorSelectorCommandButtonProjection
import org.pushingpixels.radiance.component.api.ribbon.AbstractRibbonBand
import org.pushingpixels.radiance.component.api.ribbon.JFlowRibbonBand
import org.pushingpixels.radiance.component.api.ribbon.JRibbonBand
import org.pushingpixels.radiance.component.api.ribbon.JRibbonBand.PresentationPriority
import org.pushingpixels.radiance.component.api.ribbon.projection.RibbonGalleryProjection
import org.pushingpixels.radiance.component.api.ribbon.resize.RibbonBandResizePolicy
import org.pushingpixels.radiance.component.api.ribbon.synapse.model.ComponentContentModel
import org.pushingpixels.radiance.component.api.ribbon.synapse.projection.ComponentProjection
import org.pushingpixels.radiance.component.ktx.*
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.PopupPlacementStrategy
import javax.swing.JComponent

@RadianceElementMarker
public class KRibbonBandExpandCommand {
    public var action: ((event: CommandActionEvent) -> Unit)? by NullableDelegate { false }
    internal var richTooltip: KRichTooltip? by NullableDelegate { false }
    public var keyTip: String? by NullableDelegate { false }

    public fun richTooltip(init: KRichTooltip.() -> Unit) {
        if (richTooltip == null) {
            richTooltip = KRichTooltip()
        }
        richTooltip!!.init()
    }
}

public sealed class KBaseRibbonBand<T : AbstractRibbonBand> {
    protected lateinit var ribbonBand: T
    protected var hasBeenConverted: Boolean = false

    public var title: String? by NullableDelegate { hasBeenConverted }
    public var iconFactory: Factory? by NullableDelegate { hasBeenConverted }
    protected var expandCommand: KRibbonBandExpandCommand? by NullableDelegate { hasBeenConverted }
    public var collapsedStateKeyTip: String? by NullableDelegate { hasBeenConverted }

    public var resizePolicies: ((ribbonBand: JRibbonBand) -> List<RibbonBandResizePolicy>)?
            by NullableDelegate { hasBeenConverted }

    public fun expandCommand(init: KRibbonBandExpandCommand.() -> Unit) {
        if (expandCommand == null) {
            expandCommand = KRibbonBandExpandCommand()
        }
        (expandCommand as KRibbonBandExpandCommand).init()
    }

    internal abstract fun asJavaRibbonBand(): AbstractRibbonBand
}

@RadianceElementMarker
public class KRibbonBandGroup {
    public var title: String? by NullableDelegate { false }

    internal val content = arrayListOf<Pair<PresentationPriority?, Any>>()

    public fun command(
        priority: PresentationPriority, actionKeyTip: String? = null,
        popupKeyTip: String? = null, textClick: CommandButtonPresentationModel.TextClick? = null,
        popupPlacementStrategy: RadianceThemingSlices.PopupPlacementStrategy? = null,
        init: KCommand.() -> Unit
    ): KCommand {
        val command = KCommand()
        command.init()
        content.add(
            Pair(
                priority, KCommandGroup.CommandConfig(
                    command, actionKeyTip, popupKeyTip,
                    textClick, popupPlacementStrategy
                )
            )
        )
        return command
    }

    public fun command(
        priority: PresentationPriority, actionKeyTip: String? = null, popupKeyTip: String? = null,
        textClick: CommandButtonPresentationModel.TextClick? = null,
        popupPlacementStrategy: RadianceThemingSlices.PopupPlacementStrategy? = null,
        command: KCommand
    ) {
        content.add(
            Pair(
                priority,
                KCommandGroup.CommandConfig(
                    command,
                    actionKeyTip,
                    popupKeyTip,
                    textClick,
                    popupPlacementStrategy
                )
            )
        )
    }

    public fun gallery(
        priority: PresentationPriority,
        init: KRibbonGallery.() -> Unit
    ): KRibbonGallery {
        val gallery = KRibbonGallery()
        gallery.init()
        content.add(Pair(priority, gallery))
        return gallery
    }

    public fun component(projection: ComponentProjection<out JComponent, out ComponentContentModel>) {
        content.add(Pair(null, projection))
    }
}

@RadianceElementMarker
public class KRibbonBand : KBaseRibbonBand<JRibbonBand>() {
    private val groups = arrayListOf<KRibbonBandGroup>()
    private val defaultGroup = KRibbonBandGroup()

    init {
        groups.add(defaultGroup)
    }

    public fun command(
        priority: PresentationPriority, actionKeyTip: String? = null, popupKeyTip: String? = null,
        textClick: CommandButtonPresentationModel.TextClick? = null,
        popupPlacementStrategy: RadianceThemingSlices.PopupPlacementStrategy? = null,
        init: KCommand.() -> Unit
    ): KCommand {
        if (groups.size > 1) {
            throw IllegalStateException("Can't add a command to default group after starting another group")
        }
        val command = KCommand()
        command.init()
        defaultGroup.content.add(
            Pair(
                priority, KCommandGroup.CommandConfig(
                    command, actionKeyTip, popupKeyTip,
                    textClick, popupPlacementStrategy
                )
            )
        )
        return command
    }

    public fun colorSelectorCommand(
        priority: PresentationPriority,
        actionKeyTip: String? = null,
        popupKeyTip: String? = null,
        textClick: CommandButtonPresentationModel.TextClick? = null,
        popupPlacementStrategy: RadianceThemingSlices.PopupPlacementStrategy? = null,
        init: KColorSelectorCommand.() -> Unit
    ): KColorSelectorCommand {
        if (groups.size > 1) {
            throw IllegalStateException("Can't add a command to default group after starting another group")
        }
        val command = KColorSelectorCommand()
        command.init()
        defaultGroup.content.add(
            Pair(
                priority, KCommandGroup.CommandConfig(
                    command, actionKeyTip, popupKeyTip,
                    textClick, popupPlacementStrategy
                )
            )
        )
        return command
    }

    public fun command(
        priority: PresentationPriority, actionKeyTip: String? = null, popupKeyTip: String? = null,
        textClick: CommandButtonPresentationModel.TextClick? = null,
        popupPlacementStrategy: RadianceThemingSlices.PopupPlacementStrategy? = null,
        command: KCommand
    ) {
        if (groups.size > 1) {
            throw IllegalStateException("Can't add a command to default group after starting another group")
        }
        defaultGroup.content.add(
            Pair(
                priority, KCommandGroup.CommandConfig(
                    command, actionKeyTip, popupKeyTip,
                    textClick, popupPlacementStrategy
                )
            )
        )
    }

    public fun gallery(
        priority: PresentationPriority,
        init: KRibbonGallery.() -> Unit
    ): KRibbonGallery {
        if (groups.size > 1) {
            throw IllegalStateException("Can't add a gallery to default group after starting another group")
        }
        val gallery = KRibbonGallery()
        gallery.init()
        defaultGroup.content.add(Pair(priority, gallery))
        return gallery
    }

    public fun component(projection: ComponentProjection<out JComponent, out ComponentContentModel>) {
        if (groups.size > 1) {
            throw IllegalStateException("Can't add a projection to default group after starting another group")
        }
        defaultGroup.content.add(Pair(null, projection))
    }

    public fun group(init: KRibbonBandGroup.() -> Unit): KRibbonBandGroup {
        val group = KRibbonBandGroup()
        group.init()
        groups.add(group)
        return group
    }

    override fun asJavaRibbonBand(): AbstractRibbonBand {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }
        ribbonBand =
            JRibbonBand(
                title,
                iconFactory
            )
        if (expandCommand != null) {
            if (expandCommand!!.action != null) {
                ribbonBand.expandCommandListener =
                    CommandAction { e ->
                        expandCommand!!.action!!.invoke(e)
                    }
            }
            ribbonBand.expandButtonKeyTip = expandCommand!!.keyTip
            if (expandCommand!!.richTooltip != null) {
                ribbonBand.expandButtonRichTooltip =
                    expandCommand!!.richTooltip!!.toJavaRichTooltip()
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
                    is KCommandGroup.CommandConfig -> {
                        val buttonPresentationModel = CommandButtonPresentationModel.builder()
                            .setActionKeyTip(content.actionKeyTip)
                            .setPopupKeyTip(content.secondaryKeyTip)
                        if (content.command is KColorSelectorCommand) {
                            if (content.command.colorSelectorPopupMenu != null) {
                                buttonPresentationModel.setPopupMenuPresentationModel(
                                    content.command.colorSelectorPopupMenu!!.toJavaPopupMenuPresentationModel()
                                )
                            }
                            ribbonBand.addRibbonCommand(
                                ColorSelectorCommandButtonProjection(
                                    content.command.asJavaColorSelectorCommand(),
                                    buttonPresentationModel.build()
                                ), priority
                            )
                        } else {
                            if (content.command.menu != null) {
                                buttonPresentationModel.setPopupMenuPresentationModel(
                                    content.command.menu!!.toJavaPopupMenuPresentationModel()
                                )
                            }
                            ribbonBand.addRibbonCommand(
                                content.command.asJavaCommand()
                                    .project(buttonPresentationModel.build()), priority
                            )
                        }
                    }
                    is ComponentProjection<*, *> -> {
                        ribbonBand.addRibbonComponent(content)
                    }
                    is KRibbonGallery -> {
                        // Get the presentation model
                        val galleryPresentationModel =
                            content.presentation.toRibbonGalleryPresentationModel()

                        // Get the content model
                        val galleryContentModel = content.content.asJavaRibbonGalleryContentModel()

                        // Create gallery projection
                        val galleryProjection =
                            RibbonGalleryProjection(
                                galleryContentModel,
                                galleryPresentationModel
                            )

                        // Configure with command overlays
                        galleryProjection.commandOverlays = content.content.toCommandOverlayMap()

                        ribbonBand.addRibbonGallery(galleryProjection, priority)
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

@RadianceElementMarker
public class KFlowRibbonBand : KBaseRibbonBand<JFlowRibbonBand>() {
    private val components = arrayListOf<Any>()

    public fun flowCommandButtonStrip(init: KCommandStrip.() -> Unit) {
        val commandButtonStrip = KCommandStrip(false)
        commandButtonStrip.init()
        components.add(commandButtonStrip)
    }

    public fun flowCommandToggleButtonStrip(init: KCommandStrip.() -> Unit) {
        val commandButtonStrip = KCommandStrip(true)
        commandButtonStrip.init()
        components.add(commandButtonStrip)
    }

    public fun flowComponent(projection: ComponentProjection<out JComponent, out ComponentContentModel>) {
        components.add(projection)
    }

    override fun asJavaRibbonBand(): AbstractRibbonBand {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }
        ribbonBand =
            JFlowRibbonBand(
                title,
                iconFactory
            )
        if (expandCommand != null) {
            if (expandCommand!!.action != null) {
                ribbonBand.expandCommandListener =
                    CommandAction { e ->
                        expandCommand!!.action!!.invoke(e)
                    }
            }
            ribbonBand.expandButtonKeyTip = expandCommand!!.keyTip
            if (expandCommand!!.richTooltip != null) {
                ribbonBand.expandButtonRichTooltip =
                    expandCommand!!.richTooltip!!.toJavaRichTooltip()
            }
        }
        ribbonBand.collapsedStateKeyTip = collapsedStateKeyTip

        for (component in components) {
            when (component) {
                is KCommandStrip -> ribbonBand.addFlowComponent(component.toJavaProjection())
                is ComponentProjection<*, *> -> ribbonBand.addFlowComponent(component)
                else -> throw IllegalStateException("Unknown ${component.javaClass}")
            }
        }
        hasBeenConverted = true
        return ribbonBand
    }
}

public fun ribbonBand(init: KRibbonBand.() -> Unit): KRibbonBand {
    val ribbonBand = KRibbonBand()
    ribbonBand.init()
    return ribbonBand
}

public fun flowRibbonBand(init: KFlowRibbonBand.() -> Unit): KFlowRibbonBand {
    val flowRibbonBand = KFlowRibbonBand()
    flowRibbonBand.init()
    return flowRibbonBand
}
