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

import org.pushingpixels.flamingo.api.common.model.CommandPanelContentModel
import org.pushingpixels.flamingo.api.common.model.CommandPanelPresentationModel
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu
import org.pushingpixels.flamingo.api.common.popup.model.CommandPopupMenuContentModel
import org.pushingpixels.flamingo.api.common.popup.model.CommandPopupMenuPresentationModel

@FlamingoElementMarker
class KCommandPopupMenuButtonPanel {
    private val commandGroups = arrayListOf<KCommandButtonPanel.KCommandButtonPanelGroup>()
    internal val presentation: KCommandButtonPanelPresentation = KCommandButtonPanelPresentation()
    var isSingleSelectionMode: Boolean by NonNullDelegate { false }

    init {
        isSingleSelectionMode = false
    }

    fun commandGroup(init: KCommandButtonPanel.KCommandButtonPanelGroup.() -> Unit):
            KCommandButtonPanel.KCommandButtonPanelGroup {
        val commandGroup = KCommandButtonPanel.KCommandButtonPanelGroup()
        commandGroup.init()
        commandGroups.add(commandGroup)
        return commandGroup
    }

    fun presentation(init: KCommandButtonPanelPresentation.() -> Unit) {
        presentation.init()
    }

    internal fun getContentModel() : CommandPanelContentModel {
        return CommandPanelContentModel(this.commandGroups.map { it.asCommandGroupModel() })
    }

    internal fun getPresentationModel() : CommandPanelPresentationModel {
        return presentation.asCommandPanelPresentationModel()
    }
}

@FlamingoElementMarker
class KCommandPopupMenu {
    internal data class CommandConfig(val command: KCommand, val actionKeyTip: String?)

    private lateinit var popupMenu: JCommandPopupMenu
    private var hasBeenConverted: Boolean = false

    private val groups = arrayListOf<KCommandGroup>()
    private val defaultGroup = KCommandGroup()

    var maxVisibleMenuCommands: Int by NonNullDelegate { hasBeenConverted }
    var toDismissOnCommandActivation: Boolean by NonNullDelegate { hasBeenConverted }

    private var commandPanel: KCommandPopupMenuButtonPanel? = null

    init {
        maxVisibleMenuCommands = -1
        toDismissOnCommandActivation = true
        groups.add(defaultGroup)
    }

    class KCommandPopupMenuSeparator

    fun commandPanel(init: KCommandPopupMenuButtonPanel.() -> Unit) {
        if (commandPanel != null) {
            throw IllegalStateException("Command panel already configured")
        }
        commandPanel = KCommandPopupMenuButtonPanel()
        commandPanel!!.init()
    }

    fun command(actionKeyTip: String? = null, init: KCommand.() -> Unit): KCommand {
        // TODO - handle action key tip
        val command = KCommand()
        command.init()
        defaultGroup.commands.add(command)
        return command
    }

    fun group(init: KCommandGroup.() -> Unit): KCommandGroup {
        val group = KCommandGroup()
        group.init()
        groups.add(group)
        return group
    }

    fun asCommandPopupMenu(): JCommandPopupMenu {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }

        val presentationModelBuilder = CommandPopupMenuPresentationModel.builder()
        if (maxVisibleMenuCommands > 0) {
            presentationModelBuilder.setMaxVisibleMenuCommands(maxVisibleMenuCommands)
        }
        presentationModelBuilder.setToDismissOnCommandActivation(toDismissOnCommandActivation)
        if (commandPanel != null) {
            presentationModelBuilder.setPanelPresentationModel(commandPanel!!.getPresentationModel())
        }

        if (defaultGroup.commands.isEmpty()) {
            groups.remove(defaultGroup)
        }
        val commandGroupModels = groups.map { it.toCommandGroupModel() }
//        for (group in groups) {
//            // skip empty default group
//            if ((group == defaultGroup) && group.content.isEmpty()) {
//                continue
//            }
//        }
//
//        val commandGroupModels = ArrayList<CommandGroupModel>()
//        var currCommandGroupModel = CommandGroupModel()
//        for (component in components) {
//            when (component) {
//                is KCommandPopupMenuSeparator -> {
//                    commandGroupModels.add(currCommandGroupModel)
//                    currCommandGroupModel = CommandGroupModel()
//                }
//                is CommandConfig -> {
//                    val flamingoCommand = component.command.toFlamingoCommand()
//                    // TODO - wire on the correct display
//                    if (component.actionKeyTip != null) {
//                        flamingoCommand.actionKeyTip = component.actionKeyTip
//                    }
//                    currCommandGroupModel.addCommandProjection(flamingoCommand)
//                }
//                else -> throw IllegalStateException("Unsupported content")
//            }
//        }
//        if (!currCommandGroupModel.commandList.isEmpty()) {
//            commandGroupModels.add(currCommandGroupModel)
//        }

        popupMenu = JCommandPopupMenu(
                CommandPopupMenuContentModel(commandPanel?.getContentModel(), commandGroupModels),
                presentationModelBuilder.build())

        hasBeenConverted = true
        return popupMenu
    }
}

fun commandPopupMenu(init: KCommandPopupMenu.() -> Unit): KCommandPopupMenu {
    val commandPopupMenu = KCommandPopupMenu()
    commandPopupMenu.init()
    return commandPopupMenu
}
