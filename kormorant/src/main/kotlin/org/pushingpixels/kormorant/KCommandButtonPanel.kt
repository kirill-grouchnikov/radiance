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
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState
import org.pushingpixels.flamingo.api.common.model.CommandPanelContentModel
import org.pushingpixels.flamingo.api.common.model.CommandPanelPresentationModel
import org.pushingpixels.flamingo.api.common.model.CommandPresentation
import org.pushingpixels.flamingo.api.common.model.CommandProjectionGroupModel
import org.pushingpixels.flamingo.api.common.projection.CommandPanelProjection
import javax.swing.JComponent

@FlamingoElementMarker
class KCommandButtonPanelPresentation {
    var maxColumns: Int = -1
    var maxRows: Int = -1
    var toShowGroupLabels: Boolean = true
    var commandPresentationState: CommandButtonPresentationState? = null
    var commandIconDimension: Int = -1
    var layoutKind: CommandPanelPresentationModel.LayoutKind = CommandPanelPresentationModel.LayoutKind.ROW_FILL
    var commandHorizontalAlignment: Int = AbstractCommandButton.DEFAULT_HORIZONTAL_ALIGNMENT
    var isMenu: Boolean = false
    var popupOrientationKind: CommandPresentation.CommandButtonPopupOrientationKind =
            CommandPresentation.CommandButtonPopupOrientationKind.DOWNWARD

    internal fun toCommandPanelPresentationModel() : CommandPanelPresentationModel {
        val presentationModelBuilder = CommandPanelPresentationModel.builder()
        if (this.commandPresentationState != null) {
            presentationModelBuilder.setCommandPresentationState(this.commandPresentationState)
        } else {
            presentationModelBuilder.setCommandPresentationState(
                    CommandButtonPresentationState.FIT_TO_ICON)
            presentationModelBuilder.setCommandIconDimension(this.commandIconDimension)
        }
        presentationModelBuilder.setMaxColumns(this.maxColumns)
        presentationModelBuilder.setMaxRows(this.maxRows)
        presentationModelBuilder.setToShowGroupLabels(this.toShowGroupLabels)
        presentationModelBuilder.setLayoutKind(this.layoutKind)
        presentationModelBuilder.setCommandHorizontalAlignment(this.commandHorizontalAlignment)
        presentationModelBuilder.setMenu(this.isMenu)
        presentationModelBuilder.setPopupOrientationKind(this.popupOrientationKind)

        return presentationModelBuilder.build()
    }
}

@FlamingoElementMarker
class KCommandButtonPanel {
    class KCommandButtonPanelGroup {
        var title: String by NonNullDelegate { false }
        internal val commands = arrayListOf<KCommand>()

        fun command(init: KCommand.() -> Unit): KCommand {
            val command = KCommand()
            command.init()
            commands.add(command)
            return command
        }

        fun toJavaCommandGroupModel() : CommandProjectionGroupModel {
            return CommandProjectionGroupModel(this.title,
                    this.commands.map { it.asJavaCommand().project() })
        }
    }

    private var hasBeenConverted: Boolean = false

    private val commandGroups = arrayListOf<KCommandButtonPanelGroup>()
    internal val presentation: KCommandButtonPanelPresentation = KCommandButtonPanelPresentation()
    var isSingleSelectionMode: Boolean by NonNullDelegate { hasBeenConverted }

    init {
        isSingleSelectionMode = false
    }

    fun commandGroup(init: KCommandButtonPanelGroup.() -> Unit): KCommandButtonPanelGroup {
        val commandGroup = KCommandButtonPanelGroup()
        commandGroup.init()
        commandGroups.add(commandGroup)
        return commandGroup
    }

    fun presentation(init: KCommandButtonPanelPresentation.() -> Unit) {
        presentation.init()
    }

    fun toJavaButtonPanel(): JComponent {
        val hasInitialState = (presentation.commandPresentationState != null)
        val hasInitialDimension = (presentation.commandIconDimension > 0)

        if (!hasInitialState && !hasInitialDimension) {
            throw IllegalStateException("No presentation state or dimension specified")
        }

        val contentModel = CommandPanelContentModel(commandGroups.map { it.toJavaCommandGroupModel() })
        val presentationModel = presentation.toCommandPanelPresentationModel()

        return CommandPanelProjection(contentModel, presentationModel).buildComponent()
    }
}

fun commandButtonPanel(init: KCommandButtonPanel.() -> Unit): KCommandButtonPanel {
    val commandButtonPanel = KCommandButtonPanel()
    commandButtonPanel.init()
    return commandButtonPanel
}
