/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.radiance.common.api.icon.RadianceIcon.Factory
import org.pushingpixels.radiance.component.api.common.CommandAction
import org.pushingpixels.radiance.component.api.common.CommandActionEvent
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState
import org.pushingpixels.radiance.component.api.common.JCommandButton
import org.pushingpixels.radiance.component.api.common.model.ColorSelectorCommand
import org.pushingpixels.radiance.component.api.common.model.Command
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel
import org.pushingpixels.radiance.component.api.common.model.CommandGroup
import org.pushingpixels.radiance.component.api.common.popup.model.CommandPopupMenuPresentationModel
import org.pushingpixels.radiance.component.api.common.projection.ColorSelectorCommandButtonProjection
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices

@RadianceElementMarker
public open class KCommand {
    private val builder = Command.builder()
    internal lateinit var javaCommand: Command
    internal var hasBeenConverted: Boolean = false

    // The "title" property can be modified even after [KCommandButton.toButton] has been called
    // multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _title: String? = null
    public var title: String?
        get() = _title
        set(value) {
            _title = value
            builder.setText(value)
            if (hasBeenConverted) {
                javaCommand.text = value
            }
        }

    // The "extraText" property can be modified even after [KCommandButton.toButton] has been called
    // multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _extraText: String? = null
    public var extraText: String?
        get() = _extraText
        set(value) {
            _extraText = value
            builder.setExtraText(value)
            if (hasBeenConverted) {
                javaCommand.extraText = value
            }
        }

    // The "iconFactory" property can be modified even after [KCommandButton.toButton] has been called
    // multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _iconFactory: Factory? = null
    public var iconFactory: Factory?
        get() = _iconFactory
        set(value) {
            _iconFactory = value
            builder.setIconFactory(value)
            if (hasBeenConverted) {
                javaCommand.iconFactory = value
            }
        }

    public var onActionPreviewActivated: (() -> Unit)? by NullableDelegate { hasBeenConverted }
    public var onActionPreviewCanceled: (() -> Unit)? by NullableDelegate { hasBeenConverted }

    // The "action" property can be modified even after [KCommandButton.toButton] has been called
    // multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _action: ((event: CommandActionEvent) -> Unit)? = null
    public var action: ((event: CommandActionEvent) -> Unit)?
        get() = _action
        set(value) {
            _action = value
            builder.setAction(value)
            if (hasBeenConverted) {
                if (value == null) {
                    javaCommand.action = null
                } else {
                    javaCommand.action =
                        CommandAction { e ->
                            value.invoke(e)
                        }
                }
            }
        }

    // The "actionRichTooltip" property can be modified even after [KCommandButton.toButton] has been called
    // multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _actionRichTooltip: KRichTooltip? = null
    public var actionRichTooltip: KRichTooltip?
        get() = _actionRichTooltip
        set(value) {
            _actionRichTooltip = value
            builder.setActionRichTooltip(value?.toJavaRichTooltip())
            if (hasBeenConverted) {
                javaCommand.actionRichTooltip = value?.toJavaRichTooltip()
            }
        }

    public var menu: KCommandMenu? by NullableDelegate { hasBeenConverted }

    // The "secondaryRichTooltip" property can be modified even after [KCommandButton.toButton] has been called
    // multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _secondaryRichTooltip: KRichTooltip? = null
    public var secondaryRichTooltip: KRichTooltip?
        get() = _secondaryRichTooltip
        set(value) {
            _secondaryRichTooltip = value
            builder.setSecondaryRichTooltip(value?.toJavaRichTooltip())
            if (hasBeenConverted) {
                javaCommand.secondaryRichTooltip = value?.toJavaRichTooltip()
            }
        }

    // The "isActionEnabled" property can be modified even after [KCommandButton.toButton] has been called
    // multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _isActionEnabled: Boolean = true
    public var isActionEnabled: Boolean
        get() = _isActionEnabled
        set(value) {
            _isActionEnabled = value
            builder.setActionEnabled(value)
            if (hasBeenConverted) {
                javaCommand.isActionEnabled = value
            }
        }

    // The "isSecondaryEnabled" property can be modified even after [KCommandButton.toButton] has been called
    // multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _isSecondaryEnabled: Boolean = true
    public var isSecondaryEnabled: Boolean
        get() = _isSecondaryEnabled
        set(value) {
            _isSecondaryEnabled = value
            builder.setSecondaryEnabled(value)
            if (hasBeenConverted) {
                javaCommand.isSecondaryEnabled = value
            }
        }

    private var _isToggle: Boolean = false
    public var isToggle: Boolean
        get() = _isToggle
        set(value) {
            if (hasBeenConverted) {
                throw IllegalArgumentException("Cannot change toggle after command has been converted")
            }
            _isToggle = value
            if (_isToggle) {
                builder.setToggle()
            }
        }

    // The "isToggleSelected" property can be modified even after [KCommandButton.toButton] has
    // been called multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _isToggleSelected: Boolean = false
    public var isToggleSelected: Boolean
        get() = _isToggleSelected
        set(value) {
            _isToggleSelected = value
            builder.setToggleSelected(value)
            if (hasBeenConverted) {
                javaCommand.isToggleSelected = value
            }
        }

    public var toggleGroup: KCommandToggleGroupModel? by NullableDelegate { hasBeenConverted }

    init {
        isToggle = false
    }

    public fun actionRichTooltip(init: KRichTooltip.() -> Unit) {
        if (actionRichTooltip == null) {
            actionRichTooltip = KRichTooltip()
        }
        actionRichTooltip!!.init()
    }

    public fun secondaryRichTooltip(init: KRichTooltip.() -> Unit) {
        if (secondaryRichTooltip == null) {
            secondaryRichTooltip = KRichTooltip()
        }
        secondaryRichTooltip!!.init()
    }

    internal companion object {
        fun populateBuilder(builder: Command.BaseBuilder<*, *>, command: KCommand) {
            builder.setText(command.title)
            builder.setIconFactory(command.iconFactory)
            builder.setExtraText(command.extraText)
            builder.setAction(command.action)

            builder.setActionRichTooltip(command.actionRichTooltip?.toJavaRichTooltip())
            builder.setSecondaryRichTooltip(command.secondaryRichTooltip?.toJavaRichTooltip())

            if (command.menu != null) {
                builder.setSecondaryContentModel(command.menu!!.toJavaMenuContentModel())
            }

            if (command.isToggleSelected) {
                builder.setToggle()
                builder.setToggleSelected(command.isToggleSelected)
            } else {
                if (command.isToggle) {
                    builder.setToggle()
                }
            }
            if (command.toggleGroup != null) {
                builder.setToggle()
                builder.inToggleGroup(command.toggleGroup!!.javaCommandToggleModel)
            }

            builder.setActionPreview(object : Command.CommandActionPreview {
                override fun onCommandPreviewActivated(cmd: Command?) {
                    command.onActionPreviewActivated?.invoke()
                }

                override fun onCommandPreviewCanceled(cmd: Command?) {
                    command.onActionPreviewCanceled?.invoke()
                }
            })

            builder.setActionEnabled(command.isActionEnabled)
            builder.setSecondaryEnabled(command.isSecondaryEnabled)
        }
    }

    internal fun asJavaCommand(): Command {
        if (hasBeenConverted) {
            return javaCommand
        }
        populateBuilder(builder, this)
        javaCommand = builder.build()
        hasBeenConverted = true
        return javaCommand
    }

    internal fun toCommandButton(presentation: KCommandButtonPresentation): JCommandButton {
        return asJavaCommand().project(presentation.toCommandPresentation(this)).buildComponent()
    }

    internal fun populateCommandOverlays(overlays: MutableMap<Command, CommandButtonPresentationModel.Overlay>) {
        menu?.populateCommandOverlays(overlays)
    }
}

public fun command(init: KCommand.() -> Unit): KCommand {
    val command = KCommand()
    command.init()
    return command
}

@RadianceElementMarker
public class KColorSelectorCommand : KCommand() {
    public var colorSelectorPopupMenu: KColorSelectorPopupMenu? by NullableDelegate { hasBeenConverted }
    private val colorSelectorBuilder = ColorSelectorCommand.colorSelectorBuilder()

    internal fun asJavaColorSelectorCommand(): ColorSelectorCommand {
        if (hasBeenConverted) {
            return javaCommand as ColorSelectorCommand
        }
        populateBuilder(colorSelectorBuilder, this)
        colorSelectorBuilder.setColorSelectorPopupMenuContentModel(
            colorSelectorPopupMenu?.toJavaPopupMenuContentModel()
        )
        javaCommand = colorSelectorBuilder.build()
        hasBeenConverted = true
        return javaCommand as ColorSelectorCommand
    }

    internal fun toColorSelectorCommandButton(presentation: KColorSelectorCommandPresentation): JCommandButton {
        return ColorSelectorCommandButtonProjection(
            asJavaColorSelectorCommand(),
            presentation.toColorSelectorCommandPresentation(this)
        ).buildComponent()
    }
}

public fun colorSelectorCommand(init: KColorSelectorCommand.() -> Unit): KColorSelectorCommand {
    val colorSelectorCommand = KColorSelectorCommand()
    colorSelectorCommand.init()
    return colorSelectorCommand
}

@RadianceElementMarker
public open class KCommandButtonPresentation {
    public var presentationState: CommandButtonPresentationState =
        CommandButtonPresentationState.FIT_TO_ICON
    public var isFlat: Boolean = true
    public var horizontalAlignment: Int = JCommandButton.DEFAULT_HORIZONTAL_ALIGNMENT
    public var horizontalGapScaleFactor: Double = JCommandButton.DEFAULT_GAP_SCALE_FACTOR
    public var verticalGapScaleFactor: Double = JCommandButton.DEFAULT_GAP_SCALE_FACTOR
    public var popupOrientationKind: CommandButtonPresentationModel.PopupOrientationKind =
        CommandButtonPresentationModel.PopupOrientationKind.DOWNWARD
    public var popupHorizontalGravity: CommandButtonPresentationModel.PopupHorizontalGravity =
        CommandButtonPresentationModel.PopupHorizontalGravity.START
    public var iconDimension: Int? = null
    public var activeIconFilterStrategy: RadianceThemingSlices.IconFilterStrategy =
        RadianceThemingSlices.IconFilterStrategy.ORIGINAL
    public var enabledIconFilterStrategy: RadianceThemingSlices.IconFilterStrategy =
        RadianceThemingSlices.IconFilterStrategy.ORIGINAL
    public var disabledIconFilterStrategy: RadianceThemingSlices.IconFilterStrategy =
        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME
    public var isMenu: Boolean = false
    public var actionKeyTip: String? = null
    public var popupKeyTip: String? = null
    public var textClick: CommandButtonPresentationModel.TextClick =
        CommandButtonPresentationModel.TextClick.ACTION
    public var fireActionTrigger: CommandButtonPresentationModel.FireActionTrigger =
        CommandButtonPresentationModel.FireActionTrigger.ON_PRESS_RELEASED
    public var isAutoRepeatAction: Boolean = false
    public var autoRepeatInitialInterval: Int =
        CommandButtonPresentationModel.DEFAULT_AUTO_REPEAT_INITIAL_INTERVAL_MS
    public var autoRepeatSubsequentInterval: Int =
        CommandButtonPresentationModel.DEFAULT_AUTO_REPEAT_SUBSEQUENT_INTERVAL_MS

    internal fun toCommandPresentation(command: KCommand): CommandButtonPresentationModel {
        val result = CommandButtonPresentationModel.builder()
            .setPresentationState(presentationState)
            .setFlat(isFlat)
            .setHorizontalAlignment(horizontalAlignment)
            .setHorizontalGapScaleFactor(horizontalGapScaleFactor)
            .setVerticalGapScaleFactor(verticalGapScaleFactor)
            .setPopupOrientationKind(popupOrientationKind)
            .setPopupHorizontalGravity(command.menu?.horizontalGravity ?: popupHorizontalGravity)
            .setIconDimension(iconDimension)
            .setIconFilterStrategies(
                activeIconFilterStrategy,
                enabledIconFilterStrategy,
                disabledIconFilterStrategy
            )
            .setActionKeyTip(actionKeyTip)
            .setPopupKeyTip(popupKeyTip)
            .setMenu(isMenu)
            .setPopupMenuPresentationModel(command.menu?.toJavaPopupMenuPresentationModel())
            .setFireActionTrigger(fireActionTrigger)
            .setAutoRepeatAction(isAutoRepeatAction)
            .setAutoRepeatActionIntervals(autoRepeatInitialInterval, autoRepeatSubsequentInterval)
            .setTextClick(textClick)

        return result.build()
    }
}

@RadianceElementMarker
public class KColorSelectorCommandPresentation : KCommandButtonPresentation() {
    public var colorColumns: Int = 10
    public var menuPresentationState: CommandButtonPresentationState =
        CommandPopupMenuPresentationModel.DEFAULT_POPUP_MENU_PRESENTATION_STATE

    internal fun toColorSelectorCommandPresentation(command: KColorSelectorCommand): CommandButtonPresentationModel {
        return CommandButtonPresentationModel.builder()
            .setPresentationState(presentationState)
            .setFlat(isFlat)
            .setHorizontalAlignment(horizontalAlignment)
            .setHorizontalGapScaleFactor(horizontalGapScaleFactor)
            .setVerticalGapScaleFactor(verticalGapScaleFactor)
            .setPopupOrientationKind(popupOrientationKind)
            .setIconDimension(iconDimension)
            .setIconFilterStrategies(
                activeIconFilterStrategy,
                enabledIconFilterStrategy,
                disabledIconFilterStrategy
            )
            .setActionKeyTip(actionKeyTip)
            .setPopupKeyTip(popupKeyTip)
            .setMenu(isMenu)
            .setPopupMenuPresentationModel(command.colorSelectorPopupMenu!!.toJavaPopupMenuPresentationModel())
            .build()
    }
}

@RadianceElementMarker
public class KCommandGroup {
    public var title: String? by NullableDelegate { false }
    internal val commands = arrayListOf<CommandConfig>()

    internal data class CommandConfig(
        val command: KCommand, val actionKeyTip: String?, val secondaryKeyTip: String?,
        val textClick: CommandButtonPresentationModel.TextClick?,
        val popupHorizontalGravity: CommandButtonPresentationModel.PopupHorizontalGravity?
    ) {
        fun toJavaCommand(): Command {
            return command.asJavaCommand()
        }

        fun toJavaProjection(): CommandButtonProjection<Command> {
            val presentationBuilder = CommandButtonPresentationModel.builder()
                .setActionKeyTip(actionKeyTip)
                .setPopupKeyTip(secondaryKeyTip)
            if (textClick != null) {
                presentationBuilder.setTextClick(textClick)
            }
            if (popupHorizontalGravity != null) {
                presentationBuilder.setPopupHorizontalGravity(popupHorizontalGravity)
            }
            return command.asJavaCommand().project(presentationBuilder.build())
        }

        fun toJavaPresentationOverlay(): CommandButtonPresentationModel.Overlay {
            val overlay = CommandButtonPresentationModel.overlay()
                .setActionKeyTip(actionKeyTip)
                .setPopupKeyTip(secondaryKeyTip)
            if (textClick != null) {
                overlay.setTextClick(textClick)
            }
            return overlay
        }
    }

    public operator fun KCommand.unaryPlus() {
        this@KCommandGroup.commands.add(CommandConfig(this, null, null, null, null))
    }

    public fun command(
        actionKeyTip: String? = null, popupKeyTip: String? = null,
        textClick: CommandButtonPresentationModel.TextClick? = null,
        popupHorizontalGravity: CommandButtonPresentationModel.PopupHorizontalGravity? = null,
        init: KCommand.() -> Unit
    ): KCommand {
        val command = KCommand()
        command.init()
        commands.add(
            CommandConfig(command, actionKeyTip, popupKeyTip, textClick, popupHorizontalGravity)
        )
        return command
    }

    public fun command(
        actionKeyTip: String? = null, popupKeyTip: String? = null,
        textClick: CommandButtonPresentationModel.TextClick? = null,
        popupHorizontalGravity: CommandButtonPresentationModel.PopupHorizontalGravity? = null,
        command: KCommand
    ) {
        commands.add(
            CommandConfig(command, actionKeyTip, popupKeyTip, textClick, popupHorizontalGravity)
        )
    }

    internal fun toCommandGroupModel(): CommandGroup {
        return CommandGroup(
            title,
            commands.map { it.toJavaCommand() })
    }

    internal fun toPresentationOverlays(): Map<Command, CommandButtonPresentationModel.Overlay> {
        return commands.map { it.command.asJavaCommand() to it.toJavaPresentationOverlay() }.toMap()
    }
}

public fun DelayedCommandListener(listener: (CommandActionEvent) -> Unit): (CommandActionEvent) -> Unit {
    return { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}





