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
package org.pushingpixels.kormorant

import org.pushingpixels.flamingo.api.common.AbstractCommandButton
import org.pushingpixels.flamingo.api.common.FlamingoCommand
import org.pushingpixels.flamingo.api.common.JCommandButton
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonPopupOrientationKind
import org.pushingpixels.flamingo.api.common.JCommandMenuButton
import org.pushingpixels.flamingo.api.common.model.ActionButtonModel
import org.pushingpixels.flamingo.api.common.model.PopupButtonModel
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback
import org.pushingpixels.neon.icon.ResizableIcon
import java.awt.event.ActionListener

interface ActionModelChangeInterface {
    fun stateChanged(model: ActionButtonModel)
}

interface PopupModelChangeInterface {
    fun stateChanged(model: PopupButtonModel)
}

@FlamingoElementMarker
open class KCommand {
    private val builder = FlamingoCommand.FlamingoCommandBuilder()
    private lateinit var button: AbstractCommandButton
    private var hasBeenConverted: Boolean = false

    var title: String? by NullableDelegate { hasBeenConverted }
    var icon: ResizableIcon? by NullableDelegate { hasBeenConverted }
    var disabledIcon: ResizableIcon? by NullableDelegate { hasBeenConverted }
    var extraText: String? by NullableDelegate { hasBeenConverted }
    var action: ActionListener? by NullableDelegate { hasBeenConverted }
    var actionModelChangeListener: ActionModelChangeInterface? by NullableDelegate { hasBeenConverted }
    private var actionRichTooltip: KRichTooltip? by NullableDelegate { hasBeenConverted }
    var actionKeyTip: String? by NullableDelegate { hasBeenConverted }
    var popupCallback: PopupPanelCallback? by NullableDelegate { hasBeenConverted }
    var popupModelChangeListener: PopupModelChangeInterface? by NullableDelegate { hasBeenConverted }
    private var popupRichTooltip: KRichTooltip? by NullableDelegate { hasBeenConverted }
    var popupOrientationKind: CommandButtonPopupOrientationKind? by NullableDelegate { hasBeenConverted }
    var popupKeyTip: String? by NullableDelegate { hasBeenConverted }
    var isTitleClickAction: Boolean by NonNullDelegate { hasBeenConverted }
    var isTitleClickPopup: Boolean by NonNullDelegate { hasBeenConverted }

    // This is the only property that can be modified after a button has been
    // created from this command. The setter propagates the new value to the underlying
    // builder, as well as the button that has been created (if any).
    private var _isEnabled: Boolean = true
    var isEnabled: Boolean
        get() = _isEnabled
        set(value) {
            _isEnabled = value
            builder.setEnabled(value)
            if (hasBeenConverted) {
                button.isEnabled = value
            }
        }

    var isToggle: Boolean by NonNullDelegate { hasBeenConverted }
    var isToggleSelected: Boolean by NonNullDelegate { hasBeenConverted }
    var toggleGroup: KCommandToggleGroup? by NullableDelegate { hasBeenConverted }
    var isAutoRepeatAction: Boolean by NonNullDelegate { hasBeenConverted }
    var autoRepeatInitialInterval: Int by NonNullDelegate { hasBeenConverted }
    var autoRepeatSubsequentInterval: Int by NonNullDelegate { hasBeenConverted }
    var isFireActionOnRollover: Boolean by NonNullDelegate { hasBeenConverted }

    init {
        isTitleClickAction = false
        isTitleClickPopup = false
        isToggle = false
        isToggleSelected = false
        isAutoRepeatAction = false
        autoRepeatInitialInterval = JCommandButton.DEFAULT_AUTO_REPEAT_INITIAL_INTERVAL_MS
        autoRepeatSubsequentInterval = JCommandButton.DEFAULT_AUTO_REPEAT_SUBSEQUENT_INTERVAL_MS
        isFireActionOnRollover = false
    }

    fun actionRichTooltip(init: KRichTooltip.() -> Unit) {
        if (actionRichTooltip == null) {
            actionRichTooltip = KRichTooltip()
        }
        (actionRichTooltip as KRichTooltip).init()
    }

    fun popupRichTooltip(init: KRichTooltip.() -> Unit) {
        if (popupRichTooltip == null) {
            popupRichTooltip = KRichTooltip()
        }
        (popupRichTooltip as KRichTooltip).init()
    }

    companion object {
        fun populateBuilder(builder: FlamingoCommand.BaseFlamingoCommandBuilder<*, *>, command: KCommand) {
            builder.setTitle(command.title)
            builder.setIcon(command.icon)
            builder.setDisabledIcon(command.disabledIcon)
            builder.setExtraText(command.extraText)
            builder.setAction(command.action)
            builder.setAutoRepeatAction(command.isAutoRepeatAction)

            builder.setActionRichTooltip(command.actionRichTooltip?.buildRichTooltip())
            builder.setPopupRichTooltip(command.popupRichTooltip?.buildRichTooltip())

            builder.setActionKeyTip(command.actionKeyTip)
            builder.setPopupKeyTip(command.popupKeyTip)

            if (command.popupOrientationKind != null) {
                builder.setPopupOrientationKind(command.popupOrientationKind)
            }
            builder.setPopupCallback(command.popupCallback)

            if (command.isTitleClickAction) {
                builder.setTitleClickAction()
            }
            if (command.isTitleClickPopup) {
                builder.setTitleClickPopup()
            }

            if (command.isToggleSelected) {
                builder.setToggleSelected(command.isToggleSelected)
            } else {
                if (command.isToggle) {
                    builder.setToggle()
                }
            }
            if (command.toggleGroup != null) {
                builder.inToggleGroup(command.toggleGroup!!.flamingoCommandToggleGroup)
            }

            builder.setEnabled(command.isEnabled)
        }
    }

    fun toFlamingoCommand(): FlamingoCommand {
        populateBuilder(builder, this)
        return builder.build()
    }

    internal fun asBaseButton(): AbstractCommandButton {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }
        button = toFlamingoCommand().buildButton()
        if (actionModelChangeListener != null) {
            button.actionModel.addChangeListener {
                actionModelChangeListener!!.stateChanged(button.actionModel)
            }
        }
        if ((popupModelChangeListener != null) && (button is JCommandButton)) {
            (button as JCommandButton).popupModel.addChangeListener {
                popupModelChangeListener!!.stateChanged((button as JCommandButton).popupModel)
            }
        }
        hasBeenConverted = true
        return button
    }

    internal fun asBaseMenuButton(): AbstractCommandButton {
        if (hasBeenConverted) {
            throw IllegalStateException("This method can only be called once")
        }
        button = toFlamingoCommand().buildMenuButton()
        if (actionModelChangeListener != null) {
            button.actionModel.addChangeListener {
                actionModelChangeListener!!.stateChanged(button.actionModel)
            }
        }
        if ((popupModelChangeListener != null) && (button is JCommandMenuButton)) {
            (button as JCommandMenuButton).popupModel.addChangeListener {
                popupModelChangeListener!!.stateChanged((button as JCommandMenuButton).popupModel)
            }
        }
        hasBeenConverted = true
        return button
    }
}

fun command(init: KCommand.() -> Unit): KCommand {
    val command = KCommand()
    command.init()
    return command
}





