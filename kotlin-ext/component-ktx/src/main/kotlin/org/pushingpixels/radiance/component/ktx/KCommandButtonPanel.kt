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
package org.pushingpixels.radiance.component.ktx

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState
import org.pushingpixels.radiance.component.api.common.JCommandButton
import org.pushingpixels.radiance.component.api.common.model.*
import org.pushingpixels.radiance.component.api.common.model.panel.MenuPopupPanelLayoutSpec
import org.pushingpixels.radiance.component.api.common.model.panel.PanelLayoutSpec
import org.pushingpixels.radiance.component.api.common.model.panel.PanelRowFillSpec
import org.pushingpixels.radiance.component.api.common.projection.CommandPanelProjection
import javax.swing.JComponent

@RadianceElementMarker
public class KCommandButtonPanelPresentation {
    public var layoutSpec: PanelLayoutSpec = PanelLayoutSpec.RowFill(PanelRowFillSpec.Adaptive(48))
    public var toShowGroupLabels: Boolean = true
    public var commandPresentationState: CommandButtonPresentationState? = null
    public var commandIconDimension: Int = -1
    public var commandHorizontalAlignment: Int = JCommandButton.DEFAULT_HORIZONTAL_ALIGNMENT
    public var isMenu: Boolean = false
    public var popupOrientationKind: CommandButtonPresentationModel.PopupOrientationKind =
        CommandButtonPresentationModel.PopupOrientationKind.DOWNWARD

    internal fun toCommandPanelPresentationModel() : CommandPanelPresentationModel {
        val presentationModelBuilder = CommandPanelPresentationModel.builder()
        if (this.commandPresentationState != null) {
            presentationModelBuilder.setCommandPresentationState(this.commandPresentationState)
        } else {
            presentationModelBuilder.setCommandPresentationState(
                CommandButtonPresentationState.FIT_TO_ICON)
            presentationModelBuilder.setCommandIconDimension(this.commandIconDimension)
        }
        presentationModelBuilder.setLayoutSpec(this.layoutSpec)
        presentationModelBuilder.setToShowGroupLabels(this.toShowGroupLabels)
        presentationModelBuilder.setCommandHorizontalAlignment(this.commandHorizontalAlignment)
        presentationModelBuilder.setMenu(this.isMenu)
        presentationModelBuilder.setPopupOrientationKind(this.popupOrientationKind)

        return presentationModelBuilder.build()
    }
}

@RadianceElementMarker
public class KCommandPopupMenuPanelLayoutSpec {
    public var columnCount : Int by NonNullDelegate { false }
    public var visibleRowCount : Int by NonNullDelegate { false }

    internal fun toMenuPopupPanelLayoutSpec() : MenuPopupPanelLayoutSpec {
        return MenuPopupPanelLayoutSpec(columnCount, visibleRowCount)
    }
}

@RadianceElementMarker
public class KCommandPopupMenuPanelPresentation {
    public var layoutSpec: KCommandPopupMenuPanelLayoutSpec = KCommandPopupMenuPanelLayoutSpec()
    public var toShowGroupLabels: Boolean = true
    public var commandPresentationState: CommandButtonPresentationState? = null
    public var commandIconDimension: Int = -1
    public var commandHorizontalAlignment: Int = JCommandButton.DEFAULT_HORIZONTAL_ALIGNMENT

    public fun layoutSpec(init: KCommandPopupMenuPanelLayoutSpec.() -> Unit) {
        layoutSpec.init()
    }

    internal fun toCommandPopupMenuPanelPresentationModel() : CommandPopupMenuPanelPresentationModel {
        val presentationModelBuilder = CommandPopupMenuPanelPresentationModel.builder()
        presentationModelBuilder.setLayoutSpec(this.layoutSpec.toMenuPopupPanelLayoutSpec())
        if (this.commandPresentationState != null) {
            presentationModelBuilder.setCommandPresentationState(this.commandPresentationState)
        } else {
            presentationModelBuilder.setCommandPresentationState(
                CommandButtonPresentationState.FIT_TO_ICON)
            presentationModelBuilder.setCommandIconDimension(this.commandIconDimension)
        }
        presentationModelBuilder.setToShowGroupLabels(this.toShowGroupLabels)
        presentationModelBuilder.setCommandHorizontalAlignment(this.commandHorizontalAlignment)

        return presentationModelBuilder.build()
    }
}

@RadianceElementMarker
public class KCommandButtonPanel {
    public class KCommandButtonPanelGroup {
        public var title: String by NonNullDelegate { false }
        internal val commands = arrayListOf<KCommand>()

        public fun command(init: KCommand.() -> Unit): KCommand {
            val command = KCommand()
            command.init()
            commands.add(command)
            return command
        }

        internal fun toJavaCommandGroupModel() : CommandGroup {
            return CommandGroup(
                this.title,
                this.commands.map { it.asJavaCommand() })
        }
    }

    private var hasBeenConverted: Boolean = false

    private val commandGroups = arrayListOf<KCommandButtonPanelGroup>()
    internal val presentation: KCommandButtonPanelPresentation = KCommandButtonPanelPresentation()
    public var isSingleSelectionMode: Boolean by NonNullDelegate { hasBeenConverted }

    init {
        isSingleSelectionMode = false
    }

    public fun commandGroup(init: KCommandButtonPanelGroup.() -> Unit): KCommandButtonPanelGroup {
        val commandGroup = KCommandButtonPanelGroup()
        commandGroup.init()
        commandGroups.add(commandGroup)
        return commandGroup
    }

    public fun presentation(init: KCommandButtonPanelPresentation.() -> Unit) {
        presentation.init()
    }

    internal fun toJavaButtonPanel(): JComponent {
        val hasInitialState = (presentation.commandPresentationState != null)
        val hasInitialDimension = (presentation.commandIconDimension > 0)

        if (!hasInitialState && !hasInitialDimension) {
            throw IllegalStateException("No presentation state or dimension specified")
        }

        val contentModel =
            CommandPanelContentModel(
                commandGroups.map { it.toJavaCommandGroupModel() })
        val presentationModel = presentation.toCommandPanelPresentationModel()

        return CommandPanelProjection(
            contentModel,
            presentationModel
        ).buildComponent()
    }
}

public fun commandButtonPanel(init: KCommandButtonPanel.() -> Unit): KCommandButtonPanel {
    val commandButtonPanel = KCommandButtonPanel()
    commandButtonPanel.init()
    return commandButtonPanel
}
