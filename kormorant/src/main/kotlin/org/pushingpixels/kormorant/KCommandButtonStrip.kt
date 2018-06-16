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
import org.pushingpixels.flamingo.api.common.JCommandButtonStrip
import org.pushingpixels.flamingo.api.common.JCommandToggleButton

@FlamingoElementMarker
class KCommandButtonStripDisplay {
    var orientation: JCommandButtonStrip.StripOrientation = JCommandButtonStrip.StripOrientation.HORIZONTAL
    var state: CommandButtonDisplayState = CommandButtonDisplayState.SMALL
    var horizontalGapScaleFactor: Double = -1.0
    var verticalGapScaleFactor: Double = -1.0
}

@FlamingoElementMarker
class KCommandStrip(private val isToggleGroup: Boolean) {
    private val commands = arrayListOf<KCommand>()
    internal val display: KCommandButtonStripDisplay = KCommandButtonStripDisplay()
    private val commandToggleGroup = KCommandToggleGroup()
    var isEnabled: Boolean
        get() = throw UnsupportedOperationException()
        set(value) {
            for (command in commands) {
                command.isEnabled = value
            }
        }

    fun command(init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        if (isToggleGroup) {
            // Our button strip is marked as a single toggle group
            if (command.toggleGroup != null) {
                throw IllegalStateException(
                        "Command with an explicitly declared toggle group is in a button strip with an implicit toggle group")
            }
            // Mark the command explicitly as toggle
            command.isToggle = true
            // And associate it with our implicit toggle group
            command.toggleGroup = commandToggleGroup
        }
        commands.add(command)
        return command
    }

    fun display(init: KCommandButtonStripDisplay.() -> Unit) {
        display.init()
    }

    fun asButtonStrip(): JCommandButtonStrip {
        val result = JCommandButtonStrip(display.orientation)
        result.setDisplayState(display.state)
        if (display.horizontalGapScaleFactor >= 0.0) {
            result.setHGapScaleFactor(display.horizontalGapScaleFactor)
        }
        if (display.verticalGapScaleFactor >= 0.0) {
            result.setVGapScaleFactor(display.verticalGapScaleFactor)
        }
        for (command in commands) {
            val commandButton = command.asBaseButton()
            if (isToggleGroup && (commandButton !is JCommandToggleButton)) {
                throw IllegalStateException("Command button should be toggle")
            }
            commandButton.displayState = display.state
            commandButton.isFlat = false
            result.add(commandButton)
        }
        return result
    }
}

fun commandButtonStrip(init: KCommandStrip.() -> Unit): KCommandStrip {
    val commandButtonStrip = KCommandStrip(false)
    commandButtonStrip.init()
    return commandButtonStrip
}

fun commandToggleButtonStrip(init: KCommandStrip.() -> Unit): KCommandStrip {
    val commandButtonStrip = KCommandStrip(true)
    commandButtonStrip.init()
    return commandButtonStrip
}
