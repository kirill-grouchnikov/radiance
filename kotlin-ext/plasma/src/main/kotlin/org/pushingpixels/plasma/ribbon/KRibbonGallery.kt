/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.plasma.ribbon

import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState
import org.pushingpixels.flamingo.api.common.model.Command
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand.PresentationPriority
import org.pushingpixels.flamingo.api.ribbon.model.RibbonGalleryContentModel
import org.pushingpixels.flamingo.api.ribbon.model.RibbonGalleryPresentationModel
import org.pushingpixels.plasma.PlasmaElementMarker
import org.pushingpixels.plasma.KCommand
import org.pushingpixels.plasma.KCommandGroup
import org.pushingpixels.plasma.NullableDelegate
import org.pushingpixels.neon.api.icon.ResizableIcon.Factory

@PlasmaElementMarker
class GalleryCommandVisibilityContainer {
    internal val policies = arrayListOf<Pair<Int, PresentationPriority>>()

    infix fun Int.at(priority: PresentationPriority) {
        policies.add(Pair(this, priority))
    }
}

@PlasmaElementMarker
class KRibbonGalleryPresentation {
    var state: CommandButtonPresentationState = CommandButtonPresentationState.FIT_TO_ICON
    var preferredPopupMaxCommandColumns: Int? by NullableDelegate { false }
    var preferredPopupMaxVisibleCommandRows: Int? by NullableDelegate { false }
    private val commandVisibilityContainer = GalleryCommandVisibilityContainer()
    var expandKeyTip: String? by NullableDelegate { false }

    fun commandVisibilities(init: GalleryCommandVisibilityContainer.() -> Unit) {
        commandVisibilityContainer.init()
    }

    internal fun toRibbonGalleryPresentationModel(): RibbonGalleryPresentationModel {
        val presentationModelBuilder = RibbonGalleryPresentationModel.builder()

        presentationModelBuilder.setCommandPresentationState(this.state)
        presentationModelBuilder.setPreferredPopupMaxCommandColumns(this.preferredPopupMaxCommandColumns!!)
        presentationModelBuilder.setPreferredPopupMaxVisibleCommandRows(this.preferredPopupMaxVisibleCommandRows!!)
        presentationModelBuilder.setPreferredVisibleCommandCounts(
                this.commandVisibilityContainer.policies.map { it.second to it.first }.toMap())
        presentationModelBuilder.setExpandKeyTip(this.expandKeyTip)

        return presentationModelBuilder.build()
    }
}

@PlasmaElementMarker
class KRibbonGalleryContent {
    private var hasBeenConverted: Boolean = false
    private lateinit var javaRibbonGalleryContentModel: RibbonGalleryContentModel

    var iconFactory: Factory? by NullableDelegate { hasBeenConverted }
    private val commandGroups = arrayListOf<KCommandGroup>()
    private val extraPopupGroups = arrayListOf<KCommandGroup>()
    private val extraPopupDefaultGroup = KCommandGroup()
    var onCommandActivated: ((Command) -> Unit)? by NullableDelegate { hasBeenConverted }
    var onCommandPreviewActivated: ((Command) -> Unit)? by NullableDelegate { hasBeenConverted }
    var onCommandPreviewCanceled: ((Command) -> Unit)? by NullableDelegate { hasBeenConverted }

    fun commandGroup(init: KCommandGroup.() -> Unit): KCommandGroup {
        if (hasBeenConverted) {
            throw IllegalArgumentException("This gallery content model has already been converted")
        }
        val commandGroup = KCommandGroup()
        commandGroup.init()
        commandGroups.add(commandGroup)
        return commandGroup
    }

    fun extraPopupCommand(actionKeyTip: String? = null, popupKeyTip: String? = null,
            init: KCommand.() -> Unit): KCommand {
        if (hasBeenConverted) {
            throw IllegalArgumentException("This gallery content model has already been converted")
        }

        val command = KCommand()
        command.init()
        extraPopupDefaultGroup.commands.add(KCommandGroup.CommandConfig(command, actionKeyTip, popupKeyTip,
                null, null, null))
        return command
    }

    fun extraPopupGroup(init: KCommandGroup.() -> Unit): KCommandGroup {
        if (hasBeenConverted) {
            throw IllegalArgumentException("This gallery content model has already been converted")
        }

        val group = KCommandGroup()
        group.init()
        extraPopupGroups.add(group)
        return group
    }

    internal fun toCommandOverlayMap(): Map<Command, CommandButtonPresentationModel.Overlay> {
        val commandOverlays = HashMap<Command, CommandButtonPresentationModel.Overlay>()
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
        javaRibbonGalleryContentModel = RibbonGalleryContentModel(this.iconFactory,
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
                    override fun onCommandPreviewActivated(command: Command) {
                        onCommandPreviewActivated?.invoke(command)
                    }

                    override fun onCommandPreviewCanceled(command: Command) {
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

@PlasmaElementMarker
class KRibbonGallery {
    var content: KRibbonGalleryContent = KRibbonGalleryContent()
    internal val presentation: KRibbonGalleryPresentation = KRibbonGalleryPresentation()

    fun content(init: KRibbonGalleryContent.() -> Unit) {
        content.init()
    }

    fun content(content: KRibbonGalleryContent) {
        this.content = content
    }

    fun presentation(init: KRibbonGalleryPresentation.() -> Unit) {
        presentation.init()
    }
}

fun galleryContent(init: KRibbonGalleryContent.() -> Unit): KRibbonGalleryContent {
    val galleryContent = KRibbonGalleryContent()
    galleryContent.init()
    return galleryContent
}

