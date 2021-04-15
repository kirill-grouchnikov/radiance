/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.plasma

import org.pushingpixels.flamingo.api.common.model.Command
import org.pushingpixels.flamingo.api.common.model.CommandPanelContentModel
import org.pushingpixels.flamingo.api.common.model.CommandPanelPresentationModel
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel
import org.pushingpixels.flamingo.api.common.model.CommandMenuContentModel
import org.pushingpixels.flamingo.api.common.popup.model.CommandPopupMenuPresentationModel

@PlasmaElementMarker
public class KCommandPopupMenuButtonPanel {
    private val commandGroups = arrayListOf<KCommandButtonPanel.KCommandButtonPanelGroup>()
    internal val presentation: KCommandButtonPanelPresentation = KCommandButtonPanelPresentation()
    public var isSingleSelectionMode: Boolean by NonNullDelegate { false }

    init {
        isSingleSelectionMode = false
    }

    public fun commandGroup(init: KCommandButtonPanel.KCommandButtonPanelGroup.() -> Unit):
            KCommandButtonPanel.KCommandButtonPanelGroup {
        val commandGroup = KCommandButtonPanel.KCommandButtonPanelGroup()
        commandGroup.init()
        commandGroups.add(commandGroup)
        return commandGroup
    }

    public fun presentation(init: KCommandButtonPanelPresentation.() -> Unit) {
        presentation.init()
    }

    internal fun getContentModel(): CommandPanelContentModel {
        return CommandPanelContentModel(this.commandGroups.map { it.toJavaCommandGroupModel() })
    }

    internal fun getPresentationModel(): CommandPanelPresentationModel {
        return presentation.toCommandPanelPresentationModel()
    }
}

@PlasmaElementMarker
public class KCommandMenu {
    private var hasBeenConverted: Boolean = false

    private val groups = arrayListOf<KCommandGroup>()
    private val defaultGroup = KCommandGroup()

    public var maxVisibleMenuCommands: Int by NonNullDelegate { hasBeenConverted }
    public var toDismissOnCommandActivation: Boolean by NonNullDelegate { hasBeenConverted }
    public var horizontalGravity: CommandButtonPresentationModel.PopupHorizontalGravity by NonNullDelegate { hasBeenConverted }

    private var commandPanel: KCommandPopupMenuButtonPanel? = null

    init {
        maxVisibleMenuCommands = -1
        toDismissOnCommandActivation = true
        horizontalGravity = CommandButtonPresentationModel.PopupHorizontalGravity.START
        groups.add(defaultGroup)
    }

    public fun commandPanel(init: KCommandPopupMenuButtonPanel.() -> Unit) {
        if (commandPanel != null) {
            throw IllegalStateException("Command panel already configured")
        }
        commandPanel = KCommandPopupMenuButtonPanel()
        commandPanel!!.init()
    }

    public fun command(actionKeyTip: String? = null, popupKeyTip: String? = null,
            init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        defaultGroup.commands.add(KCommandGroup.CommandConfig(command, actionKeyTip, popupKeyTip, null, null, null))
        return command
    }

    public fun group(init: KCommandGroup.() -> Unit): KCommandGroup {
        val group = KCommandGroup()
        group.init()
        groups.add(group)
        return group
    }

    internal fun populateCommandOverlays(overlays: MutableMap<Command, CommandButtonPresentationModel.Overlay>) {
        for (group in groups) {
            for (commandConfig in group.commands) {
                if ((commandConfig.actionKeyTip != null) || (commandConfig.secondaryKeyTip != null)) {
                    overlays[commandConfig.toJavaCommand()] =
                            CommandButtonPresentationModel.overlay()
                                    .setActionKeyTip(commandConfig.actionKeyTip)
                                    .setPopupKeyTip(commandConfig.secondaryKeyTip)
                    commandConfig.command.populateCommandOverlays(overlays)
                }
            }
        }
    }

    internal fun toJavaMenuContentModel(): CommandMenuContentModel {
        if (defaultGroup.commands.isEmpty()) {
            groups.remove(defaultGroup)
        }

        val commandGroupModels = groups.map { it.toCommandGroupModel() }

        return CommandMenuContentModel(
                commandPanel?.getContentModel(), commandGroupModels)
    }

    internal fun toJavaPopupMenuPresentationModel(): CommandPopupMenuPresentationModel {
        val presentationModelBuilder = CommandPopupMenuPresentationModel.builder()
        if (maxVisibleMenuCommands > 0) {
            presentationModelBuilder.setMaxVisibleMenuCommands(maxVisibleMenuCommands)
        }
        presentationModelBuilder.setToDismissOnCommandActivation(toDismissOnCommandActivation)
        if (commandPanel != null) {
            presentationModelBuilder.setPanelPresentationModel(commandPanel!!.getPresentationModel())
        }

        return presentationModelBuilder.build()
    }
}

public fun commandPopupMenu(init: KCommandMenu.() -> Unit): KCommandMenu {
    val commandPopupMenu = KCommandMenu()
    commandPopupMenu.init()
    return commandPopupMenu
}
