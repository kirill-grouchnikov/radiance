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
    private var button: AbstractCommandButton? = null

    var title: String? by NullableDelegate(button)
    var icon: ResizableIcon? by NullableDelegate(button)
    var disabledIcon: ResizableIcon? by NullableDelegate(button)
    var extraText: String? by NullableDelegate(button)
    var action: ActionListener? by NullableDelegate(button)
    var actionModelChangeListener: ActionModelChangeInterface? by NullableDelegate(button)
    private var actionRichTooltip: KRichTooltip? by NullableDelegate(button)
    var actionKeyTip: String? by NullableDelegate(button)
    var popupCallback: PopupPanelCallback? by NullableDelegate(button)
    var popupModelChangeListener: PopupModelChangeInterface? by NullableDelegate(button)
    private var popupRichTooltip: KRichTooltip? by NullableDelegate(button)
    var popupOrientationKind: CommandButtonPopupOrientationKind? by NullableDelegate(button)
    var popupKeyTip: String? by NullableDelegate(button)
    var isTitleClickAction: Boolean by NonNullDelegate(button)
    var isTitleClickPopup: Boolean by NonNullDelegate(button)

    // This is the only property that can be modified after a button has been
    // created from this command. The setter propagates the new value to the underlying
    // builder, as well as the button that has been created (if any).
    private var _isEnabled: Boolean = true
    var isEnabled: Boolean
        get() = _isEnabled
        set(value) {
            _isEnabled = value
            builder.setEnabled(value)
            button?.isEnabled = value
        }

    var isToggle: Boolean by NonNullDelegate(button)
    var isToggleSelected: Boolean by NonNullDelegate(button)
    var toggleGroup: KCommandToggleGroup? by NullableDelegate<KCommandToggleGroup?>(button)
    var isAutoRepeatAction: Boolean by NonNullDelegate(button)
    var autoRepeatInitialInterval: Int by NonNullDelegate(button)
    var autoRepeatSubsequentInterval: Int by NonNullDelegate(button)
    var isFireActionOnRollover: Boolean by NonNullDelegate(button)

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
//        builder.setTitle(title)
//        builder.setIcon(icon)
//        builder.setDisabledIcon(disabledIcon)
//        builder.setExtraText(extraText)
//        builder.setAction(action)
//        builder.setAutoRepeatAction(isAutoRepeatAction)
//
//        builder.setActionRichTooltip(actionRichTooltip?.buildRichTooltip())
//        builder.setPopupRichTooltip(popupRichTooltip?.buildRichTooltip())
//
//        builder.setActionKeyTip(actionKeyTip)
//        builder.setPopupKeyTip(popupKeyTip)
//
//        if (popupOrientationKind != null) {
//            builder.setPopupOrientationKind(popupOrientationKind)
//        }
//        builder.setPopupCallback(popupCallback)
//
//        if (isTitleClickAction) {
//            builder.setTitleClickAction()
//        }
//        if (isTitleClickPopup) {
//            builder.setTitleClickPopup()
//        }
//
//        if (isToggleSelected) {
//            builder.setToggleSelected(isToggleSelected)
//        } else {
//            if (isToggle) {
//                builder.setToggle()
//            }
//        }
//        if (toggleGroup != null) {
//            builder.inToggleGroup(toggleGroup!!.flamingoCommandToggleGroup)
//        }
//
//        builder.setEnabled(isEnabled)

        return builder.build()
    }

    fun asButton(): AbstractCommandButton {
        if (button != null) {
            throw IllegalStateException("This method can only be called once")
        }
        button = toFlamingoCommand().buildButton()
        if (actionModelChangeListener != null) {
            button!!.actionModel.addChangeListener({
                actionModelChangeListener!!.stateChanged(button!!.actionModel)
            })
        }
        if ((popupModelChangeListener != null) && (button is JCommandButton)) {
            (button as JCommandButton).popupModel.addChangeListener({
                popupModelChangeListener!!.stateChanged((button as JCommandButton).popupModel)
            })
        }
        return button!!
    }

    fun asMenuButton(): AbstractCommandButton {
        if (button != null) {
            throw IllegalStateException("This method can only be called once")
        }
        button = toFlamingoCommand().buildMenuButton()
        if (actionModelChangeListener != null) {
            button!!.actionModel.addChangeListener({
                actionModelChangeListener!!.stateChanged(button!!.actionModel)
            })
        }
        if ((popupModelChangeListener != null) && (button is JCommandMenuButton)) {
            (button as JCommandMenuButton).popupModel.addChangeListener({
                popupModelChangeListener!!.stateChanged((button as JCommandMenuButton).popupModel)
            })
        }
        return button!!
    }
}

fun command(init: KCommand.() -> Unit): KCommand {
    val command = KCommand()
    command.init()
    return command
}





