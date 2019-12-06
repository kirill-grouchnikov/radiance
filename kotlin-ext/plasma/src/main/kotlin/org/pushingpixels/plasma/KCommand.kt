/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.plasma

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.flamingo.api.common.AbstractCommandButton
import org.pushingpixels.flamingo.api.common.CommandAction
import org.pushingpixels.flamingo.api.common.CommandActionEvent
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState
import org.pushingpixels.flamingo.api.common.model.ColorSelectorCommand
import org.pushingpixels.flamingo.api.common.model.Command
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel
import org.pushingpixels.flamingo.api.common.model.CommandGroup
import org.pushingpixels.flamingo.api.common.popup.model.CommandPopupMenuPresentationModel
import org.pushingpixels.flamingo.api.common.projection.ColorSelectorCommandButtonProjection
import org.pushingpixels.flamingo.api.common.projection.CommandButtonProjection
import org.pushingpixels.neon.api.icon.ResizableIcon.Factory

@FlamingoElementMarker
open class KCommand {
    private val builder = Command.builder()
    internal lateinit var javaCommand: Command
    internal var hasBeenConverted: Boolean = false

    // The "title" property can be modified even after [KCommandButton.toButton] has been called
    // multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _title: String? = null
    var title: String?
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
    var extraText: String?
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
    var iconFactory: Factory?
        get() = _iconFactory
        set(value) {
            _iconFactory = value
            builder.setIconFactory(value)
            if (hasBeenConverted) {
                javaCommand.iconFactory = value
            }
        }

    // The "disabledIconFactory" property can be modified even after [KCommandButton.toButton] has been called
    // multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _disabledIconFactory: Factory? = null
    var disabledIconFactory: Factory?
        get() = _disabledIconFactory
        set(value) {
            _disabledIconFactory = value
            builder.setDisabledIconFactory(value)
            if (hasBeenConverted) {
                javaCommand.iconFactory = value
            }
        }

    var onActionPreviewActivated: (() -> Unit)? by NullableDelegate { hasBeenConverted }
    var onActionPreviewCanceled: (() -> Unit)? by NullableDelegate { hasBeenConverted }

    // The "action" property can be modified even after [KCommandButton.toButton] has been called
    // multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _action: CommandAction? = null
    var action: CommandAction?
        get() = _action
        set(value) {
            _action = value
            builder.setAction(value)
            if (hasBeenConverted) {
                javaCommand.action = value
            }
        }

    // The "actionRichTooltip" property can be modified even after [KCommandButton.toButton] has been called
    // multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _actionRichTooltip: KRichTooltip? = null
    var actionRichTooltip: KRichTooltip?
        get() = _actionRichTooltip
        set(value) {
            _actionRichTooltip = value
            builder.setActionRichTooltip(value?.toJavaRichTooltip())
            if (hasBeenConverted) {
                javaCommand.actionRichTooltip = value?.toJavaRichTooltip()
            }
        }

    var menu: KCommandMenu? by NullableDelegate { hasBeenConverted }

    // The "secondaryRichTooltip" property can be modified even after [KCommandButton.toButton] has been called
    // multiple times. Internally, the setter propagates the new value to the underlying
    // builder and the cached [Command] instance, which then gets propagated to be reflected in all
    // command buttons created from this command.
    private var _secondaryRichTooltip: KRichTooltip? = null
    var secondaryRichTooltip: KRichTooltip?
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
    var isActionEnabled: Boolean
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
    var isSecondaryEnabled: Boolean
        get() = _isSecondaryEnabled
        set(value) {
            _isSecondaryEnabled = value
            builder.setSecondaryEnabled(value)
            if (hasBeenConverted) {
                javaCommand.isSecondaryEnabled = value
            }
        }

    private var _isToggle: Boolean = false
    var isToggle: Boolean
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
    var isToggleSelected: Boolean
        get() = _isToggleSelected
        set(value) {
            _isToggleSelected = value
            builder.setToggleSelected(value)
            if (hasBeenConverted) {
                javaCommand.isToggleSelected = value
            }
        }

    var toggleGroup: KCommandToggleGroupModel? by NullableDelegate { hasBeenConverted }

    init {
        isToggle = false
    }

    fun actionRichTooltip(init: KRichTooltip.() -> Unit) {
        if (actionRichTooltip == null) {
            val temp = KRichTooltip()
            temp.init()
            actionRichTooltip = temp
        } else {
            actionRichTooltip!!.init()
        }
    }

    fun secondaryRichTooltip(init: KRichTooltip.() -> Unit) {
        if (secondaryRichTooltip == null) {
            val temp = KRichTooltip()
            temp.init()
            secondaryRichTooltip = temp
        } else {
            secondaryRichTooltip!!.init()
        }
    }

    companion object {
        fun populateBuilder(builder: Command.BaseBuilder<*, *>, command: KCommand) {
            builder.setText(command.title)
            builder.setIconFactory(command.iconFactory)
            builder.setDisabledIconFactory(command.disabledIconFactory)
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

    fun asJavaCommand(): Command {
        if (hasBeenConverted) {
            return javaCommand
        }
        populateBuilder(builder, this)
        javaCommand = builder.build()
        hasBeenConverted = true
        return javaCommand
    }

    internal fun toCommandButton(presentation: KCommandButtonPresentation): AbstractCommandButton {
        return asJavaCommand().project(presentation.toCommandPresentation(this)).buildComponent()
    }

    internal fun populateCommandOverlays(overlays: MutableMap<Command, CommandButtonPresentationModel.Overlay>) {
        menu?.populateCommandOverlays(overlays)
    }
}

fun command(init: KCommand.() -> Unit): KCommand {
    val command = KCommand()
    command.init()
    return command
}

@FlamingoElementMarker
class KColorSelectorCommand : KCommand() {
    var colorSelectorPopupMenu: KColorSelectorPopupMenu? by NullableDelegate { hasBeenConverted }
    private val colorSelectorBuilder = ColorSelectorCommand.colorSelectorBuilder()

    fun asJavaColorSelectorCommand(): ColorSelectorCommand {
        if (hasBeenConverted) {
            return javaCommand as ColorSelectorCommand
        }
        populateBuilder(colorSelectorBuilder, this)
        colorSelectorBuilder.setColorSelectorPopupMenuContentModel(
                colorSelectorPopupMenu?.toJavaPopupMenuContentModel())
        javaCommand = colorSelectorBuilder.build()
        hasBeenConverted = true
        return javaCommand as ColorSelectorCommand
    }

    internal fun toColorSelectorCommandButton(presentation: KColorSelectorCommandPresentation): AbstractCommandButton {
        return ColorSelectorCommandButtonProjection(asJavaColorSelectorCommand(),
                presentation.toColorSelectorCommandPresentation(this)).buildComponent()
    }
}

fun colorSelectorCommand(init: KColorSelectorCommand.() -> Unit): KColorSelectorCommand {
    val colorSelectorCommand = KColorSelectorCommand()
    colorSelectorCommand.init()
    return colorSelectorCommand
}

@FlamingoElementMarker
open class KCommandButtonPresentation {
    var presentationState: CommandButtonPresentationState = CommandButtonPresentationState.FIT_TO_ICON
    var isFlat: Boolean = true
    var horizontalAlignment: Int = AbstractCommandButton.DEFAULT_HORIZONTAL_ALIGNMENT
    var horizontalGapScaleFactor: Double = AbstractCommandButton.DEFAULT_GAP_SCALE_FACTOR
    var verticalGapScaleFactor: Double = AbstractCommandButton.DEFAULT_GAP_SCALE_FACTOR
    var popupOrientationKind: CommandButtonPresentationModel.PopupOrientationKind =
            CommandButtonPresentationModel.PopupOrientationKind.DOWNWARD
    var iconDimension: Int? = null
    var isMenu: Boolean = false
    var actionKeyTip: String? = null
    var popupKeyTip: String? = null
    var isTextClickAction: Boolean = true
    var isTextClickPopup: Boolean = false
    var isFireActionOnRollover: Boolean = false
    var isFireActionOnPress: Boolean = false
    var isAutoRepeatAction: Boolean = false
    var autoRepeatInitialInterval: Int = CommandButtonPresentationModel.DEFAULT_AUTO_REPEAT_INITIAL_INTERVAL_MS
    var autoRepeatSubsequentInterval: Int = CommandButtonPresentationModel.DEFAULT_AUTO_REPEAT_SUBSEQUENT_INTERVAL_MS

    fun toCommandPresentation(command: KCommand): CommandButtonPresentationModel {
        val result = CommandButtonPresentationModel.builder()
                .setPresentationState(presentationState)
                .setFlat(isFlat)
                .setHorizontalAlignment(horizontalAlignment)
                .setHorizontalGapScaleFactor(horizontalGapScaleFactor)
                .setVerticalGapScaleFactor(verticalGapScaleFactor)
                .setPopupOrientationKind(popupOrientationKind)
                .setIconDimension(iconDimension)
                .setActionKeyTip(actionKeyTip)
                .setPopupKeyTip(popupKeyTip)
                .setMenu(isMenu)
                .setPopupMenuPresentationModel(command.menu?.toJavaPopupMenuPresentationModel())
                .setFireActionOnRollover(isFireActionOnRollover)
                .setFireActionOnPress(isFireActionOnPress)
                .setAutoRepeatAction(isAutoRepeatAction)
                .setAutoRepeatActionIntervals(autoRepeatInitialInterval, autoRepeatSubsequentInterval)

        if (isTextClickAction) {
            result.setTextClickAction()
        }
        if (isTextClickPopup) {
            result.setTextClickPopup()
        }

        return result.build()
    }
}

@FlamingoElementMarker
class KColorSelectorCommandPresentation : KCommandButtonPresentation() {
    var colorColumns: Int = 10
    var menuPresentationState: CommandButtonPresentationState =
            CommandPopupMenuPresentationModel.DEFAULT_POPUP_MENU_PRESENTATION_STATE

    fun toColorSelectorCommandPresentation(command: KColorSelectorCommand): CommandButtonPresentationModel {
        return CommandButtonPresentationModel.builder()
                .setPresentationState(presentationState)
                .setFlat(isFlat)
                .setHorizontalAlignment(horizontalAlignment)
                .setHorizontalGapScaleFactor(horizontalGapScaleFactor)
                .setVerticalGapScaleFactor(verticalGapScaleFactor)
                .setPopupOrientationKind(popupOrientationKind)
                .setIconDimension(iconDimension)
                .setActionKeyTip(actionKeyTip)
                .setPopupKeyTip(popupKeyTip)
                .setMenu(isMenu)
                .setPopupMenuPresentationModel(command.colorSelectorPopupMenu!!.toJavaPopupMenuPresentationModel())
                .build()
    }
}

@FlamingoElementMarker
class KCommandGroup {
    var title: String? by NullableDelegate { false }
    internal val commands = arrayListOf<CommandConfig>()

    internal data class CommandConfig(val command: KCommand, val actionKeyTip: String?, val secondaryKeyTip: String?,
            val isTextClickAction: Boolean?, val isTextClickSecondary: Boolean?) {
        fun toJavaCommand(): Command {
            return command.asJavaCommand()
        }

        fun toJavaProjection(): CommandButtonProjection<Command> {
            val presentationBuilder = CommandButtonPresentationModel.builder()
                    .setActionKeyTip(actionKeyTip)
                    .setPopupKeyTip(secondaryKeyTip)
            if ((isTextClickAction != null) && isTextClickAction) {
                presentationBuilder.setTextClickAction()
            }
            if ((isTextClickSecondary != null) && isTextClickSecondary) {
                presentationBuilder.setTextClickPopup()
            }
            return command.asJavaCommand().project(presentationBuilder.build())
        }

        fun toJavaPresentationOverlay(): CommandButtonPresentationModel.Overlay {
            val overlay = CommandButtonPresentationModel.overlay()
                    .setActionKeyTip(actionKeyTip)
                    .setPopupKeyTip(secondaryKeyTip)
            if ((isTextClickAction != null) && isTextClickAction) {
                overlay.setTextClickAction()
            }
            if ((isTextClickSecondary != null) && isTextClickSecondary) {
                overlay.setTextClickPopup()
            }
            return overlay
        }
    }

    operator fun KCommand.unaryPlus() {
        this@KCommandGroup.commands.add(CommandConfig(this, null, null, false, false))
    }

    fun command(actionKeyTip: String? = null, popupKeyTip: String? = null,
            isTextClickAction: Boolean? = false, isTextClickSecondary: Boolean? = false,
            init: KCommand.() -> Unit): KCommand {
        val command = KCommand()
        command.init()
        commands.add(CommandConfig(command, actionKeyTip, popupKeyTip, isTextClickAction, isTextClickSecondary))
        return command
    }

    fun command(actionKeyTip: String? = null, popupKeyTip: String? = null,
            isTextClickAction: Boolean? = false, isTextClickSecondary: Boolean? = false,
            command: KCommand) {
        commands.add(CommandConfig(command, actionKeyTip, popupKeyTip, isTextClickAction, isTextClickSecondary))
    }

    fun toCommandGroupModel(): CommandGroup {
        return CommandGroup(title, commands.map { it.toJavaCommand() })
    }

    fun toPresentationOverlays(): Map<Command, CommandButtonPresentationModel.Overlay> {
        return commands.map { it.command.asJavaCommand() to it.toJavaPresentationOverlay() }.toMap()
    }
}

fun DelayedCommandListener(listener: (CommandActionEvent) -> Unit): CommandAction {
    return CommandAction { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}





