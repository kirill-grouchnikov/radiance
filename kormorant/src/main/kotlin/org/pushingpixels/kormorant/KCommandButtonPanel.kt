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

@FlamingoElementMarker
class KCommandButtonPanelDisplay {
    var maxButtonColumns: Int = -1
    var maxButtonRows: Int = -1
    var isShowingGroupTitles: Boolean = true
    var state: CommandButtonDisplayState? = null
    var dimension: Int = -1
    var layoutKind: JCommandButtonPanel.LayoutKind = JCommandButtonPanel.LayoutKind.ROW_FILL
    var buttonHorizontalAlignment: Int? by NullableDelegate2({ false })
}

@FlamingoElementMarker
class KCommandButtonPanel {
    class KCommandButtonPanelGroup {
        var title: String by NonNullDelegate2({ false })
        internal val commands = arrayListOf<KCommand>()

        fun command(init: KCommand.() -> Unit): KCommand {
            val command = KCommand()
            command.init()
            commands.add(command)
            return command
        }
    }

    private lateinit var buttonPanel: JCommandButtonPanel
    private var hasBeenConverted: Boolean = false

    private val commandGroups = arrayListOf<KCommandButtonPanelGroup>()
    internal val display: KCommandButtonPanelDisplay = KCommandButtonPanelDisplay()
    var isSingleSelectionMode: Boolean by NonNullDelegate2({ hasBeenConverted })

    init {
        isSingleSelectionMode = false
    }

    fun commandGroup(init: KCommandButtonPanelGroup.() -> Unit): KCommandButtonPanelGroup {
        val commandGroup = KCommandButtonPanelGroup()
        commandGroup.init()
        commandGroups.add(commandGroup)
        return commandGroup
    }

    fun display(init: KCommandButtonPanelDisplay.() -> Unit) {
        display.init()
    }

    fun asButtonPanel(): JCommandButtonPanel {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }

        val hasInitialState = (display.state != null)
        val hasInitialDimension = (display.dimension > 0)

        if (!hasInitialState && !hasInitialDimension) {
            throw IllegalStateException("No display state or dimension specified")
        }

        buttonPanel = if (hasInitialState) JCommandButtonPanel(display.state)
        else JCommandButtonPanel(display.dimension)

        if (display.maxButtonColumns > 0) {
            buttonPanel.maxButtonColumns = display.maxButtonColumns
        }
        if (display.maxButtonRows > 0) {
            buttonPanel.maxButtonRows = display.maxButtonRows
        }
        buttonPanel.isToShowGroupLabels = display.isShowingGroupTitles
        buttonPanel.layoutKind = display.layoutKind

        buttonPanel.setSingleSelectionMode(isSingleSelectionMode)

        for (commandGroup in commandGroups) {
            buttonPanel.addButtonGroup(commandGroup.title)
            for (command in commandGroup.commands) {
                val javaButton = command.asBaseButton()
                if (display.buttonHorizontalAlignment != null) {
                    javaButton.horizontalAlignment = display.buttonHorizontalAlignment!!
                }
                buttonPanel.addButtonToLastGroup(javaButton)
            }
        }
        hasBeenConverted = true

        return buttonPanel
    }
}

fun commandButtonPanel(init: KCommandButtonPanel.() -> Unit): KCommandButtonPanel {
    val commandButtonPanel = KCommandButtonPanel()
    commandButtonPanel.init()
    return commandButtonPanel
}
