/*
 * Copyright (c) 2018-2019 Radiance Plasma Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Plasma Kirill Grouchnikov nor the names of
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

import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState
import org.pushingpixels.flamingo.api.common.model.CommandGroup
import org.pushingpixels.flamingo.api.common.model.CommandStripPresentationModel
import org.pushingpixels.flamingo.api.common.projection.CommandStripProjection
import javax.swing.JComponent

@FlamingoElementMarker
class KCommandButtonStripPresentation {
    var orientation: CommandStripPresentationModel.StripOrientation = CommandStripPresentationModel.StripOrientation.HORIZONTAL
    var commandIconDimension: CommandButtonPresentationState = CommandButtonPresentationState.SMALL
    var horizontalGapScaleFactor: Double = -1.0
    var verticalGapScaleFactor: Double = -1.0

    fun toCommandStripPresentationModel() : CommandStripPresentationModel {
        return CommandStripPresentationModel.builder()
                .setCommandPresentationState(commandIconDimension)
                .setHorizontalGapScaleFactor(horizontalGapScaleFactor)
                .setVerticalGapScaleFactor(verticalGapScaleFactor)
                .setOrientation(orientation)
                .build()
    }
}

@FlamingoElementMarker
class KCommandStrip(private val isToggleGroup: Boolean) {
    private val commandConfigs = arrayListOf<KCommandGroup.CommandConfig>()
    internal val presentation: KCommandButtonStripPresentation = KCommandButtonStripPresentation()
    private val commandToggleGroup = KCommandToggleGroupModel()

    operator fun KCommand.unaryPlus() {
        this@KCommandStrip.commandConfigs.add(KCommandGroup.CommandConfig(this, null, null, null, null))
    }

    fun command(actionKeyTip: String? = null, init: KCommand.() -> Unit): KCommand {
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
        commandConfigs.add(KCommandGroup.CommandConfig(command, actionKeyTip, null, null, null))
        return command
    }

    fun presentation(init: KCommandButtonStripPresentation.() -> Unit) {
        presentation.init()
    }

    fun toJavaButtonStrip(): JComponent {
        return toJavaProjection().buildComponent()
    }

    fun toJavaProjection(): CommandStripProjection {
        val commandGroupModel = CommandGroup(
                commandConfigs.map { it -> it.command.asJavaCommand() })
        val commandStripPresentationModel = presentation.toCommandStripPresentationModel()
        val commandOverlays = commandConfigs.map { it.command.asJavaCommand() to it.toJavaPresentationOverlay() }.toMap()

        val commandStripProjection = CommandStripProjection(commandGroupModel, commandStripPresentationModel)
        commandStripProjection.setCommandOverlays(commandOverlays)

        return commandStripProjection
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
