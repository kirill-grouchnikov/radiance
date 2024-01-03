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
package org.pushingpixels.radiance.component.ktx

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState
import org.pushingpixels.radiance.component.api.common.model.Command
import org.pushingpixels.radiance.component.api.common.model.CommandGroup
import org.pushingpixels.radiance.component.api.common.model.CommandStripPresentationModel
import org.pushingpixels.radiance.component.api.common.projection.CommandStripProjection
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import javax.swing.JComponent

@RadianceElementMarker
public class KCommandButtonStripPresentation {
    public var orientation: CommandStripPresentationModel.StripOrientation =
        CommandStripPresentationModel.StripOrientation.HORIZONTAL
    public var presentationState: CommandButtonPresentationState =
        CommandButtonPresentationState.SMALL
    public var activeIconFilterStrategy: RadianceThemingSlices.IconFilterStrategy =
        RadianceThemingSlices.IconFilterStrategy.ORIGINAL
    public var enabledIconFilterStrategy: RadianceThemingSlices.IconFilterStrategy =
        RadianceThemingSlices.IconFilterStrategy.ORIGINAL
    public var disabledIconFilterStrategy: RadianceThemingSlices.IconFilterStrategy =
        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME
    public var horizontalGapScaleFactor: Double = -1.0
    public var verticalGapScaleFactor: Double = -1.0

    internal fun toCommandStripPresentationModel(): CommandStripPresentationModel {
        return CommandStripPresentationModel.builder()
            .setCommandPresentationState(presentationState)
            .setIconFilterStrategies(
                activeIconFilterStrategy,
                enabledIconFilterStrategy,
                disabledIconFilterStrategy
            )
            .setHorizontalGapScaleFactor(horizontalGapScaleFactor)
            .setVerticalGapScaleFactor(verticalGapScaleFactor)
            .setOrientation(orientation)
            .build()
    }
}

@RadianceElementMarker
public class KCommandStrip(private val isToggleGroup: Boolean) {
    private val commandConfigs = arrayListOf<KCommandGroup.CommandConfig>()
    internal val presentation: KCommandButtonStripPresentation = KCommandButtonStripPresentation()
    private val commandToggleGroup = KCommandToggleGroupModel()

    public operator fun KCommand.unaryPlus() {
        this@KCommandStrip.commandConfigs.add(
            KCommandGroup.CommandConfig(
                this,
                null,
                null,
                null,
                null
            )
        )
    }

    public fun command(actionKeyTip: String? = null, init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        if (isToggleGroup) {
            // Our button strip is marked as a single toggle group
            if (command.toggleGroup != null) {
                throw IllegalStateException(
                    "Command with an explicitly declared toggle group is in a button strip with an implicit toggle group"
                )
            }
            // Mark the command explicitly as toggle
            command.isToggle = true
            // And associate it with our implicit toggle group
            command.toggleGroup = commandToggleGroup
        }
        commandConfigs.add(
            KCommandGroup.CommandConfig(
                command,
                actionKeyTip,
                null,
                null,
                null
            )
        )
        return command
    }

    public fun presentation(init: KCommandButtonStripPresentation.() -> Unit) {
        presentation.init()
    }

    public fun toJavaButtonStrip(): JComponent {
        return toJavaProjection().buildComponent()
    }

    public fun toJavaProjection(): CommandStripProjection {
        val commandGroupModel =
            CommandGroup(
                commandConfigs.map { it.command.asJavaCommand() as Command })
        val commandStripPresentationModel = presentation.toCommandStripPresentationModel()
        val commandOverlays =
            commandConfigs.map { it.command.asJavaCommand() as Command to it.toJavaPresentationOverlay() }
                .toMap()

        val commandStripProjection =
            CommandStripProjection(
                commandGroupModel,
                commandStripPresentationModel
            )
        commandStripProjection.commandOverlays = commandOverlays

        return commandStripProjection
    }
}

public fun commandButtonStrip(init: KCommandStrip.() -> Unit): KCommandStrip {
    val commandButtonStrip = KCommandStrip(false)
    commandButtonStrip.init()
    return commandButtonStrip
}

public fun commandToggleButtonStrip(init: KCommandStrip.() -> Unit): KCommandStrip {
    val commandButtonStrip = KCommandStrip(true)
    commandButtonStrip.init()
    return commandButtonStrip
}
