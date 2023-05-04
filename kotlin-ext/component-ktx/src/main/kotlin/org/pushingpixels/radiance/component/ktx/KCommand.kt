/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.radiance.common.api.icon.RadianceIcon.Factory
import org.pushingpixels.radiance.component.api.common.CommandAction
import org.pushingpixels.radiance.component.api.common.CommandActionEvent
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState
import org.pushingpixels.radiance.component.api.common.JCommandButton
import org.pushingpixels.radiance.component.api.common.model.*
import org.pushingpixels.radiance.component.api.common.model.BaseCommand.BaseBuilder
import org.pushingpixels.radiance.component.api.common.model.BaseCommandButtonPresentationModel.SelectedStateHighlight
import org.pushingpixels.radiance.component.api.common.popup.model.BaseCommandPopupMenuPresentationModel
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuContentModel
import org.pushingpixels.radiance.component.api.common.popup.model.ColorSelectorPopupMenuPresentationModel
import org.pushingpixels.radiance.component.api.common.popup.model.CommandPopupMenuPresentationModel
import org.pushingpixels.radiance.component.api.common.projection.ColorSelectorCommandButtonProjection
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.BackgroundAppearanceStrategy
import java.awt.Dimension
import java.awt.Insets

@RadianceElementMarker
public abstract class KBaseCommandMenu<MPM: BaseCommandPopupMenuPresentationModel> {
    public abstract fun toJavaPopupMenuPresentationModel(): MPM?
}

@RadianceElementMarker
public abstract class KBaseCommand<C : BaseCommand<MCM>, MCM : BaseCommandMenuContentModel,
        MPM: BaseCommandPopupMenuPresentationModel,
        CM: KBaseCommandMenu<MPM>, B : BaseBuilder<C, MCM, *>>(
    protected val builder: B
) {
    internal lateinit var javaCommand: C
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
    public var menu: CM? = null

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
        fun <C : BaseCommand<MCM>, MCM : BaseCommandMenuContentModel, MPM: BaseCommandPopupMenuPresentationModel,
                CM: KBaseCommandMenu<MPM>, B : BaseBuilder<C, MCM, *>> populateBuilder(
            builder: B, command: KBaseCommand<C, MCM, MPM, CM, B>,
            menuContentModelCreator: (KBaseCommand<C, MCM, MPM, CM, B>) -> MCM?
        ) {

            builder.setText(command.title)
            builder.setIconFactory(command.iconFactory)
            builder.setExtraText(command.extraText)
            builder.setAction(command.action)

            builder.setActionRichTooltip(command.actionRichTooltip?.toJavaRichTooltip())
            builder.setSecondaryRichTooltip(command.secondaryRichTooltip?.toJavaRichTooltip())

            val menuContentModel = menuContentModelCreator.invoke(command)
            builder.setSecondaryContentModel(menuContentModel)

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

            builder.setActionPreview(object : BaseCommand.CommandActionPreview {
                override fun onCommandPreviewActivated(cmd: BaseCommand<*>?) {
                    command.onActionPreviewActivated?.invoke()
                }

                override fun onCommandPreviewCanceled(cmd: BaseCommand<*>?) {
                    command.onActionPreviewCanceled?.invoke()
                }
            })

            builder.setActionEnabled(command.isActionEnabled)
            builder.setSecondaryEnabled(command.isSecondaryEnabled)
        }
    }

    internal abstract fun asJavaCommand(): C
}


@RadianceElementMarker
public class KCommand : KBaseCommand<Command, CommandMenuContentModel, CommandPopupMenuPresentationModel, KCommandMenu, Command.Builder>(
    Command.builder()
) {
    override fun asJavaCommand(): Command {
        if (hasBeenConverted) {
            return javaCommand
        }
        // TODO - make popup menu generic
        populateBuilder(builder, this) {
            menu?.toJavaMenuContentModel()
        }
        javaCommand = builder.build()
        hasBeenConverted = true
        return javaCommand
    }

    internal fun toCommandButton(presentation: KCommandButtonPresentation): JCommandButton {
        return asJavaCommand().project(presentation.toCommandPresentation(this)).buildComponent()
    }

    internal fun populateCommandOverlays(overlays: MutableMap<Command, BaseCommandButtonPresentationModel.Overlay>) {
        menu?.populateCommandOverlays(overlays)
    }
}

public fun command(init: KCommand.() -> Unit): KCommand {
    val command = KCommand()
    command.init()
    return command
}

@RadianceElementMarker
public class KColorSelectorCommand :
    KBaseCommand<ColorSelectorCommand, ColorSelectorPopupMenuContentModel,
            ColorSelectorPopupMenuPresentationModel,
            KColorSelectorPopupMenu, ColorSelectorCommand.Builder>(
        ColorSelectorCommand.colorSelectorBuilder()
    ) {
    public var colorSelectorPopupMenu: KColorSelectorPopupMenu? by NullableDelegate { hasBeenConverted }

    override fun asJavaCommand(): ColorSelectorCommand {
        if (hasBeenConverted) {
            return javaCommand
        }
        // TODO - make popup menu generic
        populateBuilder(builder, this) { colorSelectorPopupMenu?.toJavaPopupMenuContentModel() }
        javaCommand = builder.build()
        hasBeenConverted = true
        return javaCommand
    }

    internal fun toColorSelectorCommandButton(presentation: KColorSelectorCommandPresentation): JCommandButton {
        return ColorSelectorCommandButtonProjection(
            asJavaCommand(),
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
    public var backgroundAppearanceStrategy: BackgroundAppearanceStrategy =
        BackgroundAppearanceStrategy.FLAT
    public var horizontalAlignment: Int =
        CommandButtonPresentationModel.DEFAULT_HORIZONTAL_ALIGNMENT
    public var horizontalGapScaleFactor: Double =
        CommandButtonPresentationModel.DEFAULT_GAP_SCALE_FACTOR
    public var verticalGapScaleFactor: Double =
        CommandButtonPresentationModel.DEFAULT_GAP_SCALE_FACTOR
    public var popupPlacementStrategy: RadianceThemingSlices.PopupPlacementStrategy =
        RadianceThemingSlices.PopupPlacementStrategy.Downward.HALIGN_START
    public var contentPadding: Insets =
        CommandButtonPresentationModel.COMPACT_BUTTON_CONTENT_PADDING
    public var iconDimension: Dimension? = null
    public var activeIconFilterStrategy: RadianceThemingSlices.IconFilterStrategy =
        RadianceThemingSlices.IconFilterStrategy.ORIGINAL
    public var enabledIconFilterStrategy: RadianceThemingSlices.IconFilterStrategy =
        RadianceThemingSlices.IconFilterStrategy.ORIGINAL
    public var disabledIconFilterStrategy: RadianceThemingSlices.IconFilterStrategy =
        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME
    public var selectedStateHighlight: SelectedStateHighlight =
        SelectedStateHighlight.FULL_SIZE
    public var actionKeyTip: String? = null
    public var popupKeyTip: String? = null
    public var textClick: BaseCommandButtonPresentationModel.TextClick =
        BaseCommandButtonPresentationModel.TextClick.ACTION
    public var actionFireTrigger: BaseCommandButtonPresentationModel.ActionFireTrigger =
        BaseCommandButtonPresentationModel.ActionFireTrigger.ON_PRESS_RELEASED
    public var popupFireTrigger: BaseCommandButtonPresentationModel.PopupFireTrigger =
        BaseCommandButtonPresentationModel.PopupFireTrigger.ON_PRESSED
    public var isAutoRepeatAction: Boolean = false
    public var autoRepeatInitialInterval: Int =
        CommandButtonPresentationModel.DEFAULT_AUTO_REPEAT_INITIAL_INTERVAL_MS
    public var autoRepeatSubsequentInterval: Int =
        CommandButtonPresentationModel.DEFAULT_AUTO_REPEAT_SUBSEQUENT_INTERVAL_MS
    internal val actionRichTooltipPresentation: KRichTooltipPresentation =
        KRichTooltipPresentation()
    internal val popupRichTooltipPresentation: KRichTooltipPresentation = KRichTooltipPresentation()

    public fun actionRichTooltipPresentation(init: KRichTooltipPresentation.() -> Unit) {
        actionRichTooltipPresentation.init()
    }

    public fun popupRichTooltipPresentation(init: KRichTooltipPresentation.() -> Unit) {
        popupRichTooltipPresentation.init()
    }

    internal fun toCommandPresentation(command: KCommand): CommandButtonPresentationModel {
        val result = CommandButtonPresentationModel.builder()
            .setPresentationState(presentationState)
            .setBackgroundAppearanceStrategy(backgroundAppearanceStrategy)
            .setHorizontalAlignment(horizontalAlignment)
            .setHorizontalGapScaleFactor(horizontalGapScaleFactor)
            .setVerticalGapScaleFactor(verticalGapScaleFactor)
            .setContentPadding(contentPadding)
            .setPopupPlacementStrategy(popupPlacementStrategy)
            .setIconDimension(iconDimension)
            .setIconFilterStrategies(
                activeIconFilterStrategy,
                enabledIconFilterStrategy,
                disabledIconFilterStrategy
            )
            .setActionKeyTip(actionKeyTip)
            .setPopupKeyTip(popupKeyTip)
            .setPopupMenuPresentationModel(command.menu?.toJavaPopupMenuPresentationModel())
            .setActionFireTrigger(actionFireTrigger)
            .setPopupFireTrigger(popupFireTrigger)
            .setAutoRepeatAction(isAutoRepeatAction)
            .setAutoRepeatActionIntervals(autoRepeatInitialInterval, autoRepeatSubsequentInterval)
            .setTextClick(textClick)
            .setActionRichTooltipPresentationModel(actionRichTooltipPresentation.toRichTooltipPresentation())
            .setPopupRichTooltipPresentationModel(popupRichTooltipPresentation.toRichTooltipPresentation())

        return result.build()
    }
}

@RadianceElementMarker
public class KColorSelectorCommandPresentation : KCommandButtonPresentation() {
    public var colorColumns: Int = 10
    public var menuPresentationState: CommandButtonPresentationState =
        CommandPopupMenuPresentationModel.DEFAULT_POPUP_MENU_PRESENTATION_STATE

    internal fun toColorSelectorCommandPresentation(command: KColorSelectorCommand): ColorSelectorCommandButtonPresentationModel {
        return ColorSelectorCommandButtonPresentationModel.builder()
            .setPresentationState(presentationState)
            .setBackgroundAppearanceStrategy(backgroundAppearanceStrategy)
            .setHorizontalAlignment(horizontalAlignment)
            .setHorizontalGapScaleFactor(horizontalGapScaleFactor)
            .setVerticalGapScaleFactor(verticalGapScaleFactor)
            .setContentPadding(contentPadding)
            .setPopupPlacementStrategy(popupPlacementStrategy)
            .setIconDimension(iconDimension)
            .setIconFilterStrategies(
                activeIconFilterStrategy,
                enabledIconFilterStrategy,
                disabledIconFilterStrategy
            )
            .setActionKeyTip(actionKeyTip)
            .setPopupKeyTip(popupKeyTip)
            .setActionFireTrigger(actionFireTrigger)
            .setPopupFireTrigger(popupFireTrigger)
            .setSelectedStateHighlight(selectedStateHighlight)
            .setPopupMenuPresentationModel(command.colorSelectorPopupMenu!!.toJavaPopupMenuPresentationModel())
            .build()
    }
}

@RadianceElementMarker
public class KCommandGroup {
    public var title: String? by NullableDelegate { false }
    internal val commands = arrayListOf<CommandConfig>()

    internal data class CommandConfig(
        val command: KBaseCommand<*, *, *, *, *>, val actionKeyTip: String?, val secondaryKeyTip: String?,
        val textClick: BaseCommandButtonPresentationModel.TextClick?,
        val popupPlacementStrategy: RadianceThemingSlices.PopupPlacementStrategy?
    ) {
        fun toJavaCommand(): BaseCommand<*> {
            return command.asJavaCommand()
        }

        fun toJavaProjection(): CommandButtonProjection<Command> {
            require(command is KCommand)
            val presentationBuilder = CommandButtonPresentationModel.builder()
                .setActionKeyTip(actionKeyTip)
                .setPopupKeyTip(secondaryKeyTip)
            if (textClick != null) {
                presentationBuilder.setTextClick(textClick)
            }
            if (popupPlacementStrategy != null) {
                presentationBuilder.setPopupPlacementStrategy(popupPlacementStrategy)
            }
            return command.asJavaCommand().project(presentationBuilder.build())
        }

        fun toJavaPresentationOverlay(): BaseCommandButtonPresentationModel.Overlay {
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
        textClick: BaseCommandButtonPresentationModel.TextClick? = null,
        popupPlacementStrategy: RadianceThemingSlices.PopupPlacementStrategy? = null,
        init: KCommand.() -> Unit
    ): KCommand {
        val command = KCommand()
        command.init()
        commands.add(
            CommandConfig(command, actionKeyTip, popupKeyTip, textClick, popupPlacementStrategy)
        )
        return command
    }

    public fun command(
        actionKeyTip: String? = null, popupKeyTip: String? = null,
        textClick: BaseCommandButtonPresentationModel.TextClick? = null,
        popupPlacementStrategy: RadianceThemingSlices.PopupPlacementStrategy? = null,
        command: KCommand
    ) {
        commands.add(
            CommandConfig(command, actionKeyTip, popupKeyTip, textClick, popupPlacementStrategy)
        )
    }

    internal fun toCommandGroupModel(): CommandGroup {
        return CommandGroup(
            title,
            commands.map { it.toJavaCommand() as Command })
    }

    internal fun toPresentationOverlays(): Map<Command, BaseCommandButtonPresentationModel.Overlay> {
        return commands.map { it.command.asJavaCommand() as Command to it.toJavaPresentationOverlay() }
            .toMap()
    }
}

@OptIn(DelicateCoroutinesApi::class)
public fun DelayedCommandListener(listener: (CommandActionEvent) -> Unit): (CommandActionEvent) -> Unit {
    return { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}





