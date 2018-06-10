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

import org.pushingpixels.flamingo.api.common.RichTooltip
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenu
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuPrimaryCommand
import org.pushingpixels.kormorant.*

@FlamingoElementMarker
class KRibbonApplicationMenuCommandContainer {
    var title : String? by NullableDelegate(null)
    internal val commands = arrayListOf<KCommand>()

    operator fun KCommand.unaryPlus() {
        this@KRibbonApplicationMenuCommandContainer.commands.add(this)
    }

    fun command(init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        commands.add(command)
        return command
    }
}

@FlamingoElementMarker
class KRibbonApplicationMenuPrimaryCommand : KCommand() {
    private val builder = RibbonApplicationMenuPrimaryCommand.RibbonApplicationMenuPrimaryCommandBuilder()

    var rolloverCallback: RibbonApplicationMenuPrimaryCommand.PrimaryRolloverCallback? by NullableDelegate(null)
    private var secondaryCommands = arrayListOf<KRibbonApplicationMenuCommandContainer>()

    fun secondaryGroup(init: KRibbonApplicationMenuCommandContainer.() -> Unit) {
        val secondaryGroup = KRibbonApplicationMenuCommandContainer()
        secondaryGroup.init()
        secondaryCommands.add(secondaryGroup)
    }

    fun toFlamingoApplicationMenuPrimaryCommand(): RibbonApplicationMenuPrimaryCommand {
        populateBuilder(builder, this)
        builder.setRolloverCallback(rolloverCallback)
        for (secondaryCommandContainer in secondaryCommands) {
            builder.addSecondaryMenuGroup(secondaryCommandContainer.title,
                    secondaryCommandContainer.commands.map { it -> it.toFlamingoCommand() })
        }

        return builder.build()
    }
}

@FlamingoElementMarker
class KRibbonApplicationMenu {
    private var ribbonApplicationMenu: RibbonApplicationMenu? = null

    private var richTooltip: KRichTooltip? by NullableDelegate(ribbonApplicationMenu)
    var keyTip: String? by NullableDelegate(ribbonApplicationMenu)
    private val footerCommands = KRibbonApplicationMenuCommandContainer()
    var defaultCallback: RibbonApplicationMenuPrimaryCommand.PrimaryRolloverCallback? by NullableDelegate(ribbonApplicationMenu)
    private var primaryContent = arrayListOf<Any>()

    fun richTooltip(init: KRichTooltip.() -> Unit) {
        if (richTooltip == null) {
            richTooltip = KRichTooltip()
        }
        (richTooltip as KRichTooltip).init()
    }

    fun primaryCommand(init: KRibbonApplicationMenuPrimaryCommand.() -> Unit) {
        val primaryCommand = KRibbonApplicationMenuPrimaryCommand()
        primaryCommand.init()
        primaryContent.add(primaryCommand)
    }

    fun primarySeparator() {
        primaryContent.add(KCommandPopupMenu.KCommandPopupMenuSeparator())
    }

    fun footer(init: KRibbonApplicationMenuCommandContainer.() -> Unit) {
        footerCommands.init()
    }

    fun asRibbonApplicationMenu(): RibbonApplicationMenu {
        if (ribbonApplicationMenu != null) {
            throw IllegalStateException("This method can only be called once")
        }

        ribbonApplicationMenu = RibbonApplicationMenu()
        for (primaryEntry in primaryContent) {
            when (primaryEntry) {
                is KRibbonApplicationMenuPrimaryCommand -> ribbonApplicationMenu!!.addMenuCommand(
                        primaryEntry.toFlamingoApplicationMenuPrimaryCommand())
                is KCommandPopupMenu.KCommandPopupMenuSeparator -> ribbonApplicationMenu!!.addMenuSeparator()
            }
        }

        ribbonApplicationMenu!!.defaultCallback = defaultCallback

        for (footerCommand in footerCommands.commands) {
            ribbonApplicationMenu!!.addFooterCommand(footerCommand.toFlamingoCommand())
        }
        return ribbonApplicationMenu!!
    }

    fun getRichTooltip() : RichTooltip? {
        return richTooltip?.buildRichTooltip()
    }
}
