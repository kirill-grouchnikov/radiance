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

import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState
import org.pushingpixels.flamingo.api.common.FlamingoCommand
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority
import org.pushingpixels.flamingo.api.ribbon.model.RibbonGalleryContentModel
import org.pushingpixels.flamingo.api.ribbon.model.RibbonGalleryPresentationModel
import org.pushingpixels.kormorant.*
import org.pushingpixels.neon.icon.ResizableIcon

@FlamingoElementMarker
class GalleryCommandVisibilityContainer {
    internal val policies = arrayListOf<Pair<Int, RibbonElementPriority>>()

    infix fun Int.at(priority: RibbonElementPriority) {
        policies.add(Pair(this, priority))
    }
}

@FlamingoElementMarker
class KRibbonGalleryPresentation {
    var state: CommandButtonDisplayState = CommandButtonDisplayState.FIT_TO_ICON
    var preferredPopupMaxCommandColumns: Int? by NullableDelegate { false }
    var preferredPopupMaxVisibleCommandRows: Int? by NullableDelegate { false }
    private val commandVisibilityContainer = GalleryCommandVisibilityContainer()

    fun commandVisibilities(init: GalleryCommandVisibilityContainer.() -> Unit) {
        commandVisibilityContainer.init()
    }

    internal fun toRibbonGalleryPresentationModel(): RibbonGalleryPresentationModel {
        val presentationModelBuilder = RibbonGalleryPresentationModel.builder()

        presentationModelBuilder.setCommandDisplayState(this.state)
        presentationModelBuilder.setPreferredPopupMaxCommandColumns(this.preferredPopupMaxCommandColumns!!)
        presentationModelBuilder.setPreferredPopupMaxVisibleCommandRows(this.preferredPopupMaxVisibleCommandRows!!)
        presentationModelBuilder.setPreferredVisibleCommandCounts(
                this.commandVisibilityContainer.policies.map { it.second to it.first }.toMap())

        return presentationModelBuilder.build()
    }
}

@FlamingoElementMarker
class KRibbonGalleryContent {
    var title: String by NonNullDelegate { false }
    var icon: ResizableIcon? by NullableDelegate { false }
    internal val commandGroups = arrayListOf<KCommandGroup>()
    internal val extraPopupGroups = arrayListOf<KCommandGroup>()
    internal val extraPopupDefaultGroup = KCommandGroup()
    var onCommandActivated: ((FlamingoCommand) -> Unit)? by NullableDelegate { false }
    var onCommandPreviewActivated: ((FlamingoCommand) -> Unit)? by NullableDelegate { false }
    var onCommandPreviewCanceled: ((FlamingoCommand) -> Unit)? by NullableDelegate { false }
    fun commandGroup(init: KCommandGroup.() -> Unit): KCommandGroup {
        val commandGroup = KCommandGroup()
        commandGroup.init()
        commandGroups.add(commandGroup)
        return commandGroup
    }

    fun extraPopupCommand(actionKeyTip: String? = null, popupKeyTip: String? = null,
            init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        extraPopupDefaultGroup.commands.add(KCommandGroup.CommandConfig(command, actionKeyTip, popupKeyTip))
        return command
    }

    fun extraPopupGroup(init: KCommandGroup.() -> Unit): KCommandGroup {
        val group = KCommandGroup()
        group.init()
        extraPopupGroups.add(group)
        return group
    }
    
    internal fun toRibbonGalleryContentModel(): RibbonGalleryContentModel {
        // Map primary gallery commands to the command group models expected for the content model
        val galleryContentModel = RibbonGalleryContentModel(this.icon,
                commandGroups.map { it.toCommandGroupModel() })

        // Wire extra popup content if we have it
        if (extraPopupDefaultGroup.commands.isEmpty()) {
            extraPopupGroups.remove(extraPopupDefaultGroup)
        }

        for (extraContent in extraPopupGroups) {
            galleryContentModel.addExtraPopupCommandGroup(extraContent.toCommandGroupModel())
        }

        // Wire command preview and activation listeners
        galleryContentModel.addCommandPreviewListener(
                object : RibbonGalleryContentModel.GalleryCommandPreviewListener {
                    override fun onCommandPreviewActivated(command: FlamingoCommand) {
                        onCommandPreviewActivated?.invoke(command)
                    }

                    override fun onCommandPreviewCanceled(command: FlamingoCommand) {
                        onCommandPreviewCanceled?.invoke(command)
                    }
                }
        )
        if (onCommandActivated != null) {
            galleryContentModel.addCommandActivationListener(onCommandActivated)
        }

        return galleryContentModel
    }
}

@FlamingoElementMarker
class KRibbonGallery {
    var content: KRibbonGalleryContent = KRibbonGalleryContent()
    internal val presentation: KRibbonGalleryPresentation = KRibbonGalleryPresentation()
    var expandKeyTip: String? by NullableDelegate { false }

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

