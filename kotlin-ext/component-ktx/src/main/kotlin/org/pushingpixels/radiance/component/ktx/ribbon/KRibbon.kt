/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.ktx.ribbon

import org.pushingpixels.radiance.component.api.common.model.Command
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel
import org.pushingpixels.radiance.component.api.ribbon.JRibbon
import org.pushingpixels.radiance.component.api.ribbon.JRibbonFrame
import org.pushingpixels.radiance.component.api.ribbon.RibbonContextualTaskGroup
import org.pushingpixels.radiance.component.api.ribbon.RibbonTask
import org.pushingpixels.radiance.component.api.ribbon.model.RibbonTaskbarCommandButtonPresentationModel
import org.pushingpixels.radiance.component.api.ribbon.projection.RibbonApplicationMenuCommandButtonProjection
import org.pushingpixels.radiance.component.api.ribbon.projection.RibbonGalleryProjection
import org.pushingpixels.radiance.component.api.ribbon.synapse.model.ComponentContentModel
import org.pushingpixels.radiance.component.api.ribbon.synapse.projection.ComponentProjection
import org.pushingpixels.radiance.common.api.icon.RadianceIcon.Factory
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState
import org.pushingpixels.radiance.component.ktx.*
import org.pushingpixels.radiance.component.ktx.NonNullDelegate
import org.pushingpixels.radiance.component.ktx.NullableDelegate
import org.pushingpixels.radiance.component.ktx.RadianceElementMarker
import java.awt.Color
import javax.swing.JComponent
import javax.swing.KeyStroke

@RadianceElementMarker
public class KRibbonTaskContainer {
    internal val tasks = arrayListOf<KRibbonTask>()

    public operator fun KRibbonTask.unaryPlus() {
        this@KRibbonTaskContainer.tasks.add(this)
    }
}

@RadianceElementMarker
public class KRibbonTaskbar {
    internal val components = arrayListOf<Any>()

    internal data class AppMenuLinkWrapper(val command: KCommand)

    public operator fun KCommand.unaryPlus() {
        this@KRibbonTaskbar.components.add(this)
    }

    public fun command(init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        components.add(KCommandGroup.CommandConfig(command, null, null, null, null))
        return command
    }

    public fun command(command: KCommand): KCommand {
        components.add(KCommandGroup.CommandConfig(command, null, null, null, null))
        return command
    }

    public fun component(projection: ComponentProjection<out JComponent, out ComponentContentModel>) {
        components.add(projection)
    }

    public fun gallery(init: KRibbonGallery.() -> Unit): KRibbonGallery {
        val gallery = KRibbonGallery()
        gallery.init()
        components.add(gallery)
        return gallery
    }

    public fun appMenuLink(command: KCommand) : KCommand {
        components.add(AppMenuLinkWrapper(command))
        return command
    }
}

@RadianceElementMarker
public class KRibbonContextualTaskContainer {
    public var title: String by NonNullDelegate { false }
    public var color: Color by NonNullDelegate { false }
    internal val tasks = KRibbonTaskContainer()

    public fun tasks(init: KRibbonTaskContainer.() -> Unit) {
        tasks.init()
    }
}

@RadianceElementMarker
public class KRibbonContextualTaskGroupContainer {
    internal val taskGroups = arrayListOf<KRibbonContextualTaskContainer>()

    public operator fun KRibbonContextualTaskContainer.unaryPlus() {
        this@KRibbonContextualTaskGroupContainer.taskGroups.add(this)
    }

    public fun taskGroup(init: KRibbonContextualTaskContainer.() -> Unit): KRibbonContextualTaskContainer {
        val taskGroup = KRibbonContextualTaskContainer()
        taskGroup.init()
        taskGroups.add(taskGroup)
        return taskGroup
    }
}

public data class RibbonKeyboardAction(
    val actionName: String,
    val actionKeyStroke: KeyStroke,
    val command: KCommand
)

@RadianceElementMarker
public class KRibbonKeyboardActions {
    internal val keyboardActions = arrayListOf<RibbonKeyboardAction>()

    public operator fun RibbonKeyboardAction.unaryPlus() {
        this@KRibbonKeyboardActions.keyboardActions.add(this)
    }
}

@RadianceElementMarker
public class KRibbonFrame {
    public var title: String? by NullableDelegate { hasBeenConverted }
    public var applicationIconFactory: Factory? by NullableDelegate { hasBeenConverted }
    private val keyboardActions = KRibbonKeyboardActions()
    private val tasks = KRibbonTaskContainer()
    private val contextualTaskGroups = KRibbonContextualTaskGroupContainer()
    private val anchoredCommands = KCommandGroup()
    private val taskbar = KRibbonTaskbar()
    private val applicationMenu = KRibbonApplicationMenu()
    public var onTaskSelectionChange: ((ribbonTask: RibbonTask) -> Unit)? by NullableDelegate { hasBeenConverted }
    public var onShowContextualMenuListener: JRibbon.OnShowContextualMenuListener? by NullableDelegate { hasBeenConverted }

    private lateinit var ribbonFrame: JRibbonFrame
    private var hasBeenConverted: Boolean = false

    public fun keyboardActions(init: KRibbonKeyboardActions.() -> Unit) {
        keyboardActions.init()
    }

    public fun tasks(init: KRibbonTaskContainer.() -> Unit) {
        tasks.init()
    }

    public fun contextualTaskGroups(init: KRibbonContextualTaskGroupContainer.() -> Unit) {
        contextualTaskGroups.init()
    }

    public fun anchored(init: KCommandGroup.() -> Unit) {
        anchoredCommands.init()
    }

    public fun taskbar(init: KRibbonTaskbar.() -> Unit) {
        taskbar.init()
    }

    public fun applicationMenu(init: KRibbonApplicationMenu.() -> Unit) {
        applicationMenu.init()
    }

    public fun asJavaRibbonFrame(): JRibbonFrame {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }

        ribbonFrame =
            JRibbonFrame(title)
        ribbonFrame.setApplicationIcon(applicationIconFactory)
        for (task in tasks.tasks) {
            ribbonFrame.ribbon.addTask(task.asJavaRibbonTask())
        }

        for (anchoredCommand in anchoredCommands.commands) {
            ribbonFrame.ribbon.addAnchoredCommand(anchoredCommand.toJavaProjection())
        }

        for (contextualTaskGroup in contextualTaskGroups.taskGroups) {
            ribbonFrame.ribbon.addContextualTaskGroup(
                RibbonContextualTaskGroup(
                    contextualTaskGroup.title,
                    contextualTaskGroup.color,
                    contextualTaskGroup.tasks.tasks.map { it.asJavaRibbonTask() })
            )
        }

        if (onTaskSelectionChange != null) {
            ribbonFrame.ribbon.addOnTaskSelectionChangedListener(onTaskSelectionChange)
        }

        if (onShowContextualMenuListener != null) {
            ribbonFrame.ribbon.onShowContextualMenuListener = onShowContextualMenuListener
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
                    .setPopupRichTooltipPresentationModel(applicationMenu.getRichTooltipPresentation())
                    .build()
            )

        val overlays: MutableMap<Command, CommandButtonPresentationModel.Overlay> = hashMapOf()
        applicationMenu.populateCommandOverlays(overlays)
        ribbonMenuCommandProjection.commandOverlays = overlays

        val secondaryStates : MutableMap<Command, CommandButtonPresentationState> = hashMapOf()
        applicationMenu.populateSecondaryStates(secondaryStates)
        ribbonMenuCommandProjection.secondaryLevelCommandPresentationState = secondaryStates

        ribbonFrame.ribbon.setApplicationMenuCommand(ribbonMenuCommandProjection)

        // This needs to be done after setting the application menu command in order to be able
        // to add app menu links to the taskbar
        for (taskbarComponent in taskbar.components) {
            when (taskbarComponent) {
                is KCommand -> ribbonFrame.ribbon.addTaskbarCommand(
                    taskbarComponent.asJavaCommand().project()
                )
                is KCommandGroup.CommandConfig -> ribbonFrame.ribbon.addTaskbarCommand(
                    taskbarComponent.toJavaCommand().project()
                )
                is ComponentProjection<*, *> -> ribbonFrame.ribbon.addTaskbarComponent(
                    taskbarComponent
                )
                is KRibbonGallery -> ribbonFrame.ribbon.addTaskbarGalleryDropdown(
                    RibbonGalleryProjection(
                        taskbarComponent.content.asJavaRibbonGalleryContentModel(),
                        taskbarComponent.presentation.toRibbonGalleryPresentationModel()
                    )
                )
                is KRibbonTaskbar.AppMenuLinkWrapper -> ribbonFrame.ribbon.addTaskbarAppMenuLink(
                    taskbarComponent.command.asJavaCommand()
                )
            }
        }

        if (keyboardActions.keyboardActions.isNotEmpty()) {
            ribbonFrame.setKeyboardActions(keyboardActions.keyboardActions.map {
                JRibbonFrame.RibbonKeyboardAction(
                    it.actionName,
                    it.actionKeyStroke,
                    it.command.javaCommand
                )
            }.toSet())
        }

        hasBeenConverted = true

        return ribbonFrame
    }
}

public fun ribbonFrame(init: KRibbonFrame.() -> Unit): KRibbonFrame {
    val ribbonFrame = KRibbonFrame()
    ribbonFrame.init()
    return ribbonFrame
}
