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

import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame
import org.pushingpixels.flamingo.api.ribbon.RibbonContextualTaskGroup
import org.pushingpixels.kormorant.*
import org.pushingpixels.neon.icon.ResizableIcon
import java.awt.Color

@FlamingoElementMarker
class KRibbonTaskContainer {
    internal val tasks = arrayListOf<KRibbonTask>()

    operator fun KRibbonTask.unaryPlus() {
        this@KRibbonTaskContainer.tasks.add(this)
    }
}

@FlamingoElementMarker
class KRibbonAnchoredCommandContainer {
    internal val commands = arrayListOf<KCommand>()

    operator fun KCommand.unaryPlus() {
        this@KRibbonAnchoredCommandContainer.commands.add(this)
    }

    fun command(init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        commands.add(command)
        return command
    }
}

@FlamingoElementMarker
class KRibbonTaskbar {
    internal val components = arrayListOf<Any>()

    operator fun KCommand.unaryPlus() {
        this@KRibbonTaskbar.components.add(this)
    }

    fun command(init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        components.add(command)
        return command
    }

    fun ribbonComponent(init: KRibbonComponent.() -> Unit): KRibbonComponent {
        val ribbonComponent = KRibbonComponent()
        ribbonComponent.init()
        components.add(ribbonComponent)
        return ribbonComponent
    }

    fun gallery() {
        // TODO: implement
    }

    fun separator() {
        components.add(KCommandPopupMenu.KCommandPopupMenuSeparator())
    }
}

@FlamingoElementMarker
class KRibbonContextualTaskContainer {
    var title: String by NonNullDelegate { false }
    var color: Color by NonNullDelegate { false }
    internal val tasks = KRibbonTaskContainer()

    fun tasks(init: KRibbonTaskContainer.() -> Unit) {
        tasks.init()
    }
}

@FlamingoElementMarker
class KRibbonContextualTaskGroupContainer {
    internal val taskGroups = arrayListOf<KRibbonContextualTaskContainer>()

    operator fun KRibbonContextualTaskContainer.unaryPlus() {
        this@KRibbonContextualTaskGroupContainer.taskGroups.add(this)
    }

    fun taskGroup(init: KRibbonContextualTaskContainer.() -> Unit): KRibbonContextualTaskContainer {
        val taskGroup = KRibbonContextualTaskContainer()
        taskGroup.init()
        taskGroups.add(taskGroup)
        return taskGroup
    }
}

@FlamingoElementMarker
class KRibbonFrame {
    var title: String? by NullableDelegate { hasBeenConverted }
    var applicationIcon: ResizableIcon? by NullableDelegate { hasBeenConverted }
    private val tasks = KRibbonTaskContainer()
    private val contextualTaskGroups = KRibbonContextualTaskGroupContainer()
    private val anchoredCommands = KRibbonAnchoredCommandContainer()
    private val taskbar = KRibbonTaskbar()
    private val applicationMenu = KRibbonApplicationMenu()

    private lateinit var ribbonFrame: JRibbonFrame
    private var hasBeenConverted: Boolean = false

    fun tasks(init: KRibbonTaskContainer.() -> Unit) {
        tasks.init()
    }

    fun contextualTaskGroups(init: KRibbonContextualTaskGroupContainer.() -> Unit) {
        contextualTaskGroups.init()
    }

    fun anchored(init: KRibbonAnchoredCommandContainer.() -> Unit) {
        anchoredCommands.init()
    }

    fun taskbar(init: KRibbonTaskbar.() -> Unit) {
        taskbar.init()
    }

    fun applicationMenu(init: KRibbonApplicationMenu.() -> Unit) {
        applicationMenu.init()
    }

    fun asRibbonFrame(): JRibbonFrame {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }

        ribbonFrame = JRibbonFrame(title)
        ribbonFrame.setApplicationIcon(applicationIcon)
        for (task in tasks.tasks) {
            ribbonFrame.ribbon.addTask(task.asRibbonTask())
        }

        for (anchoredCommand in anchoredCommands.commands) {
            ribbonFrame.ribbon.addAnchoredCommand(anchoredCommand.toFlamingoCommand())
        }

        for (taskbarComponent in taskbar.components) {
            when (taskbarComponent) {
                is KCommand -> ribbonFrame.ribbon.addTaskbarCommand(taskbarComponent.toFlamingoCommand())
                is KRibbonComponent -> ribbonFrame.ribbon.addTaskbarComponent(taskbarComponent.asRibbonComponent())
                is KCommandPopupMenu.KCommandPopupMenuSeparator -> ribbonFrame.ribbon.addTaskbarSeparator()
            }
        }

        for (contextualTaskGroup in contextualTaskGroups.taskGroups) {
            ribbonFrame.ribbon.addContextualTaskGroup(
                    RibbonContextualTaskGroup(contextualTaskGroup.title,
                            contextualTaskGroup.color,
                            contextualTaskGroup.tasks.tasks.map { it -> it.asRibbonTask() })
            )
        }

        ribbonFrame.ribbon.applicationMenu = applicationMenu.asRibbonApplicationMenu()
        ribbonFrame.ribbon.applicationMenuKeyTip = applicationMenu.keyTip
        ribbonFrame.ribbon.applicationMenuRichTooltip = applicationMenu.getRichTooltip()

        hasBeenConverted = true

        return ribbonFrame
    }
}

fun ribbonFrame(init: KRibbonFrame.() -> Unit): KRibbonFrame {
    val ribbonFrame = KRibbonFrame()
    ribbonFrame.init()
    return ribbonFrame
}
