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
package org.pushingpixels.radiance.component.ktx.ribbon

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState
import org.pushingpixels.radiance.component.api.common.model.Command
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel
import org.pushingpixels.radiance.component.api.ribbon.JRibbonBand.PresentationPriority
import org.pushingpixels.radiance.component.api.ribbon.model.RibbonGalleryContentModel
import org.pushingpixels.radiance.component.api.ribbon.model.RibbonGalleryPresentationModel
import org.pushingpixels.radiance.component.ktx.RadianceElementMarker
import org.pushingpixels.radiance.component.ktx.KCommand
import org.pushingpixels.radiance.component.ktx.KCommandGroup
import org.pushingpixels.radiance.component.ktx.NullableDelegate
import org.pushingpixels.radiance.common.api.icon.RadianceIcon.Factory
import org.pushingpixels.radiance.component.api.common.model.BaseCommand
import org.pushingpixels.radiance.component.api.common.model.BaseCommandButtonPresentationModel
import org.pushingpixels.radiance.component.api.common.model.panel.MenuPopupPanelLayoutSpec

@RadianceElementMarker
public class GalleryCommandVisibilityContainer {
    internal val policies = arrayListOf<Pair<Int, PresentationPriority>>()

    public infix fun Int.at(priority: PresentationPriority) {
        policies.add(Pair(this, priority))
    }
}

@RadianceElementMarker
public class KRibbonGalleryPresentation {
    public var state: CommandButtonPresentationState = CommandButtonPresentationState.BIG_FIT_TO_ICON
    public var popupLayoutSpec: MenuPopupPanelLayoutSpec? by NullableDelegate { false }
    private val commandVisibilityContainer = GalleryCommandVisibilityContainer()
    public var expandKeyTip: String? by NullableDelegate { false }

    public fun commandVisibilities(init: GalleryCommandVisibilityContainer.() -> Unit) {
        commandVisibilityContainer.init()
    }

    internal fun toRibbonGalleryPresentationModel(): RibbonGalleryPresentationModel {
        val presentationModelBuilder = RibbonGalleryPresentationModel.builder()

        presentationModelBuilder.setCommandPresentationState(this.state)
        presentationModelBuilder.setPopupLayoutSpec(this.popupLayoutSpec!!)
        presentationModelBuilder.setPreferredVisibleCommandCounts(
            this.commandVisibilityContainer.policies.associate { it.second to it.first })
        presentationModelBuilder.setExpandKeyTip(this.expandKeyTip)

        return presentationModelBuilder.build()
    }
}

@RadianceElementMarker
public class KRibbonGalleryContent {
    private var hasBeenConverted: Boolean = false
    private lateinit var javaRibbonGalleryContentModel: RibbonGalleryContentModel

    public var iconFactory: Factory? by NullableDelegate { hasBeenConverted }
    private val commandGroups = arrayListOf<KCommandGroup>()
    private val extraPopupGroups = arrayListOf<KCommandGroup>()
    private val extraPopupDefaultGroup = KCommandGroup()
    public var onCommandActivated: ((BaseCommand<*>) -> Unit)? by NullableDelegate { hasBeenConverted }
    public var onCommandPreviewActivated: ((BaseCommand<*>) -> Unit)? by NullableDelegate { hasBeenConverted }
    public var onCommandPreviewCanceled: ((BaseCommand<*>) -> Unit)? by NullableDelegate { hasBeenConverted }

    public fun commandGroup(init: KCommandGroup.() -> Unit): KCommandGroup {
        if (hasBeenConverted) {
            throw IllegalArgumentException("This gallery content model has already been converted")
        }
        val commandGroup = KCommandGroup()
        commandGroup.init()
        commandGroups.add(commandGroup)
        return commandGroup
    }

    public fun extraPopupCommand(actionKeyTip: String? = null, popupKeyTip: String? = null,
            init: KCommand.() -> Unit): KCommand {
        if (hasBeenConverted) {
            throw IllegalArgumentException("This gallery content model has already been converted")
        }

        val command = KCommand()
        command.init()
        extraPopupDefaultGroup.commands.add(
            KCommandGroup.CommandConfig(command, actionKeyTip, popupKeyTip, null, null))
        return command
    }

    public fun extraPopupGroup(init: KCommandGroup.() -> Unit): KCommandGroup {
        if (hasBeenConverted) {
            throw IllegalArgumentException("This gallery content model has already been converted")
        }

        val group = KCommandGroup()
        group.init()
        extraPopupGroups.add(group)
        return group
    }

    internal fun toCommandOverlayMap(): Map<Command, BaseCommandButtonPresentationModel.Overlay> {
        val commandOverlays = HashMap<Command, BaseCommandButtonPresentationModel.Overlay>()
        for (groupOverlays in extraPopupGroups.map { it.toPresentationOverlays() }) {
            commandOverlays.putAll(groupOverlays)
        }
        return commandOverlays
    }

    internal fun asJavaRibbonGalleryContentModel(): RibbonGalleryContentModel {
        if (hasBeenConverted) {
            return javaRibbonGalleryContentModel
        }

        // Map primary gallery commands to the command group models expected for the content model
        javaRibbonGalleryContentModel =
            RibbonGalleryContentModel(
                this.iconFactory,
                commandGroups.map { it.toCommandGroupModel() })

        // Wire extra popup content if we have it
        if (extraPopupDefaultGroup.commands.isEmpty()) {
            extraPopupGroups.remove(extraPopupDefaultGroup)
        }

        for (extraContent in extraPopupGroups) {
            javaRibbonGalleryContentModel.addExtraPopupCommandGroup(extraContent.toCommandGroupModel())
        }

        // Wire command preview and activation listeners
        javaRibbonGalleryContentModel.addCommandPreviewListener(
                object : RibbonGalleryContentModel.GalleryCommandActionPreview {
                    override fun onCommandPreviewActivated(command: BaseCommand<*>) {
                        onCommandPreviewActivated?.invoke(command)
                    }

                    override fun onCommandPreviewCanceled(command: BaseCommand<*>) {
                        onCommandPreviewCanceled?.invoke(command)
                    }
                })
        if (onCommandActivated != null) {
            javaRibbonGalleryContentModel.addCommandActivationListener(onCommandActivated)
        }

        hasBeenConverted = true

        return javaRibbonGalleryContentModel
    }
}

@RadianceElementMarker
public class KRibbonGallery {
    public var content: KRibbonGalleryContent = KRibbonGalleryContent()
    internal val presentation: KRibbonGalleryPresentation = KRibbonGalleryPresentation()

    public fun content(init: KRibbonGalleryContent.() -> Unit) {
        content.init()
    }

    public fun content(content: KRibbonGalleryContent) {
        this.content = content
    }

    public fun presentation(init: KRibbonGalleryPresentation.() -> Unit) {
        presentation.init()
    }
}

public fun galleryContent(init: KRibbonGalleryContent.() -> Unit): KRibbonGalleryContent {
    val galleryContent = KRibbonGalleryContent()
    galleryContent.init()
    return galleryContent
}

