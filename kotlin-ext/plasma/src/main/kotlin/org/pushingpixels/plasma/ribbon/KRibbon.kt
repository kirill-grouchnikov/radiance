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
package org.pushingpixels.plasma.ribbon

import org.pushingpixels.flamingo.api.common.model.Command
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame
import org.pushingpixels.flamingo.api.ribbon.RibbonContextualTaskGroup
import org.pushingpixels.flamingo.api.ribbon.projection.RibbonApplicationMenuCommandButtonProjection
import org.pushingpixels.flamingo.api.ribbon.projection.RibbonGalleryProjection
import org.pushingpixels.flamingo.api.ribbon.synapse.model.ComponentContentModel
import org.pushingpixels.flamingo.api.ribbon.synapse.projection.ComponentProjection
import org.pushingpixels.plasma.*
import org.pushingpixels.neon.icon.ResizableIconFactory
import java.awt.Color
import javax.swing.JComponent

@FlamingoElementMarker
class KRibbonTaskContainer {
    internal val tasks = arrayListOf<KRibbonTask>()

    operator fun KRibbonTask.unaryPlus() {
        this@KRibbonTaskContainer.tasks.add(this)
    }
}

@FlamingoElementMarker
class KRibbonTaskbar {
    internal val components = arrayListOf<Any>()

    operator fun KCommand.unaryPlus() {
        this@KRibbonTaskbar.components.add(this)
    }

    fun command(actionKeyTip: String? = null, popupKeyTip: String? = null,
            init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        components.add(KCommandGroup.CommandConfig(command, actionKeyTip, popupKeyTip))
        return command
    }

    fun command(actionKeyTip: String? = null, popupKeyTip: String? = null, command: KCommand): KCommand {
        components.add(KCommandGroup.CommandConfig(command, actionKeyTip, popupKeyTip))
        return command
    }

    fun component(projection: ComponentProjection<out JComponent, out ComponentContentModel>) {
        components.add(projection)
    }

    fun gallery(init: KRibbonGallery.() -> Unit): KRibbonGallery {
        val gallery = KRibbonGallery()
        gallery.init()
        components.add(gallery)
        return gallery
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
    var applicationIconFactory: ResizableIconFactory? by NullableDelegate { hasBeenConverted }
    private val tasks = KRibbonTaskContainer()
    private val contextualTaskGroups = KRibbonContextualTaskGroupContainer()
    private val anchoredCommands = KCommandGroup()
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

    fun anchored(init: KCommandGroup.() -> Unit) {
        anchoredCommands.init()
    }

    fun taskbar(init: KRibbonTaskbar.() -> Unit) {
        taskbar.init()
    }

    fun applicationMenu(init: KRibbonApplicationMenu.() -> Unit) {
        applicationMenu.init()
    }

    fun asJavaRibbonFrame(): JRibbonFrame {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }

        ribbonFrame = JRibbonFrame(title)
        ribbonFrame.setApplicationIcon(applicationIconFactory?.createNewIcon())
        for (task in tasks.tasks) {
            ribbonFrame.ribbon.addTask(task.asJavaRibbonTask())
        }

        for (anchoredCommand in anchoredCommands.commands) {
            ribbonFrame.ribbon.addAnchoredCommand(anchoredCommand.toJavaProjection())
        }

        for (taskbarComponent in taskbar.components) {
            when (taskbarComponent) {
                is KCommandGroup.CommandConfig -> ribbonFrame.ribbon.addTaskbarCommand(
                        taskbarComponent.toJavaProjection())
                is ComponentProjection<*, *> -> ribbonFrame.ribbon.addTaskbarComponent(taskbarComponent)
                is KRibbonGallery -> ribbonFrame.ribbon.addTaskbarGalleryDropdown(RibbonGalleryProjection(
                        taskbarComponent.content.asJavaRibbonGalleryContentModel(),
                        taskbarComponent.presentation.toRibbonGalleryPresentationModel()))
            }
        }

        for (contextualTaskGroup in contextualTaskGroups.taskGroups) {
            ribbonFrame.ribbon.addContextualTaskGroup(
                    RibbonContextualTaskGroup(contextualTaskGroup.title,
                            contextualTaskGroup.color,
                            contextualTaskGroup.tasks.tasks.map { it -> it.asJavaRibbonTask() })
            )
        }

        val ribbonMenuCommandProjection =
                RibbonApplicationMenuCommandButtonProjection(
                        Command.builder()
                                .setText(applicationMenu.title)
                                .setSecondaryRichTooltip(applicationMenu.getRichTooltip())
                                .setSecondaryContentModel(applicationMenu.asJavaRibbonApplicationMenu())
                                .build(),
                        CommandButtonPresentationModel.builder()
                                .setPopupKeyTip(applicationMenu.keyTip)
                                .build())

        val overlays: MutableMap<Command, CommandButtonPresentationModel.Overlay> = hashMapOf()
        applicationMenu.populateCommandOverlays(overlays)
        ribbonMenuCommandProjection.commandOverlays = overlays

        ribbonFrame.ribbon.setApplicationMenuCommand(ribbonMenuCommandProjection)

        hasBeenConverted = true

        return ribbonFrame
    }
}

fun ribbonFrame(init: KRibbonFrame.() -> Unit): KRibbonFrame {
    val ribbonFrame = KRibbonFrame()
    ribbonFrame.init()
    return ribbonFrame
}
