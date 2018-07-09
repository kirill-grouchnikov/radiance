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

import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState
import org.pushingpixels.flamingo.api.common.JCommandButtonPanel
import org.pushingpixels.flamingo.api.common.JCommandMenuButton
import org.pushingpixels.flamingo.api.common.JCommandToggleMenuButton
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu

@FlamingoElementMarker
class KCommandPopupMenuButtonPanelDisplay {
    var maxButtonColumns: Int by NonNullDelegate({ false })
    var maxVisibleButtonRows: Int by NonNullDelegate({ false })
    var isShowingGroupTitles: Boolean by NonNullDelegate({ false })
    var state: CommandButtonDisplayState? by NullableDelegate({ false })
    var dimension: Int by NonNullDelegate({ false })

    init {
        isShowingGroupTitles = true
        dimension = -1
    }
}

@FlamingoElementMarker
class KCommandPopupMenuButtonPanel {
    private val commandGroups = arrayListOf<KCommandButtonPanel.KCommandButtonPanelGroup>()
    internal val display: KCommandPopupMenuButtonPanelDisplay = KCommandPopupMenuButtonPanelDisplay()
    var isSingleSelectionMode: Boolean by NonNullDelegate({ false })

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

    fun display(init: KCommandPopupMenuButtonPanelDisplay.() -> Unit) {
        display.init()
    }

    fun asButtonPanel(): JCommandButtonPanel {
        val hasInitialState = (display.state != null)
        val hasInitialDimension = (display.dimension > 0)

        if (!hasInitialState && !hasInitialDimension) {
            throw IllegalStateException("No display state or dimension specified")
        }

        val buttonPanel = if (hasInitialState) JCommandButtonPanel(display.state)
        else JCommandButtonPanel(display.dimension)

        if (display.maxButtonColumns > 0) {
            buttonPanel.maxButtonColumns = display.maxButtonColumns
        }
        buttonPanel.isToShowGroupLabels = display.isShowingGroupTitles
        buttonPanel.layoutKind = JCommandButtonPanel.LayoutKind.ROW_FILL

        buttonPanel.setSingleSelectionMode(isSingleSelectionMode)

        for (commandGroup in commandGroups) {
            buttonPanel.addButtonGroup(commandGroup.title)
            for (command in commandGroup.commands) {
                buttonPanel.addButtonToLastGroup(command.asBaseButton())
            }
        }

        return buttonPanel
    }
}

@FlamingoElementMarker
class KCommandPopupMenu {
    private lateinit var popupMenu: JCommandPopupMenu
    private var hasBeenConverted: Boolean = false

    private val components = arrayListOf<Any>()
    var maxVisibleMenuButtons: Int by NonNullDelegate({ hasBeenConverted })
    var toDismissOnChildClick: Boolean by NonNullDelegate({ hasBeenConverted })

    private var commandPanel: KCommandPopupMenuButtonPanel? = null

    init {
        maxVisibleMenuButtons = -1
        toDismissOnChildClick = false
    }

    class KCommandPopupMenuSeparator

    fun commandPanel(init: KCommandPopupMenuButtonPanel.() -> Unit) {
        if (commandPanel != null) {
            throw IllegalStateException("Command panel already configured")
        }
        commandPanel = KCommandPopupMenuButtonPanel()
        commandPanel!!.init()
    }

    fun command(init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        components.add(command)
        return command
    }

    fun separator() {
        components.add(KCommandPopupMenuSeparator())
    }

    fun asCommandPopupMenu(): JCommandPopupMenu {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }

        if (commandPanel != null) {
            popupMenu = JCommandPopupMenu(commandPanel!!.asButtonPanel(), commandPanel!!.display.maxButtonColumns,
                    commandPanel!!.display.maxVisibleButtonRows)
        } else {
            popupMenu = JCommandPopupMenu()
        }

        for (component in components) {
            when (component) {
                is KCommandPopupMenuSeparator -> popupMenu.addMenuSeparator()
                is KCommand -> {
                    val commandMenuButton = component.asBaseMenuButton()
                    when (commandMenuButton) {
                        is JCommandMenuButton -> popupMenu.addMenuButton(commandMenuButton)
                        is JCommandToggleMenuButton -> popupMenu.addMenuButton(commandMenuButton)
                        else -> throw IllegalStateException("Unsupported content")
                    }
                }
                else -> throw IllegalStateException("Unsupported content")
            }
        }
        if (maxVisibleMenuButtons > 0) {
            popupMenu.maxVisibleMenuButtons = maxVisibleMenuButtons
        }
        popupMenu.isToDismissOnChildClick = toDismissOnChildClick
        hasBeenConverted = true
        return popupMenu
    }
}

fun commandPopupMenu(init: KCommandPopupMenu.() -> Unit): KCommandPopupMenu {
    val commandPopupMenu = KCommandPopupMenu()
    commandPopupMenu.init()
    return commandPopupMenu
}
