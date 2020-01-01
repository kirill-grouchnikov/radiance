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

import org.pushingpixels.flamingo.api.common.RichTooltip
import org.pushingpixels.flamingo.api.common.model.Command
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenu
import org.pushingpixels.plasma.*

@FlamingoElementMarker
class KRibbonApplicationMenu {
    private lateinit var ribbonApplicationMenu: RibbonApplicationMenu
    private var hasBeenConverted: Boolean = false

    var title: String by NonNullDelegate { hasBeenConverted }
    private var richTooltip: KRichTooltip? by NullableDelegate { hasBeenConverted }
    var keyTip: String? by NullableDelegate { hasBeenConverted }
    private val footerCommands = KCommandGroup()
    private val groups = arrayListOf<KCommandGroup>()
    private val defaultGroup = KCommandGroup()

    fun richTooltip(init: KRichTooltip.() -> Unit) {
        if (richTooltip == null) {
            richTooltip = KRichTooltip()
        }
        (richTooltip as KRichTooltip).init()
    }

    fun command(actionKeyTip: String? = null, popupKeyTip: String? = null,
            init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        defaultGroup.commands.add(KCommandGroup.CommandConfig(command, actionKeyTip, popupKeyTip, null, null))
        return command
    }

    fun group(init: KCommandGroup.() -> Unit): KCommandGroup {
        val group = KCommandGroup()
        group.init()
        groups.add(group)
        return group
    }

    fun footer(init: KCommandGroup.() -> Unit) {
        footerCommands.init()
    }

    fun asJavaRibbonApplicationMenu(): RibbonApplicationMenu {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }

        ribbonApplicationMenu = RibbonApplicationMenu()
        if (defaultGroup.commands.isEmpty()) {
            groups.remove(defaultGroup)
        }

        for (group in groups) {
            ribbonApplicationMenu.addCommandGroup(group.toCommandGroupModel())
        }

        for (footerCommand in footerCommands.commands) {
            ribbonApplicationMenu.addFooterCommand(footerCommand.command.asJavaCommand())
        }
        hasBeenConverted = true
        return ribbonApplicationMenu
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
        for (footerCommand in footerCommands.commands) {
            if ((footerCommand.actionKeyTip != null) || (footerCommand.secondaryKeyTip != null)) {
                overlays[footerCommand.command.asJavaCommand()] =
                        CommandButtonPresentationModel.overlay()
                                .setActionKeyTip(footerCommand.actionKeyTip)
                                .setPopupKeyTip(footerCommand.secondaryKeyTip)
            }
        }
    }

    fun getRichTooltip(): RichTooltip? {
        return richTooltip?.toJavaRichTooltip()
    }
}
