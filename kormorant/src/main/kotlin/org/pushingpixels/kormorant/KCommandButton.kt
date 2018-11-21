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
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState
import org.pushingpixels.flamingo.api.common.FlamingoCommandDisplay
import org.pushingpixels.flamingo.api.common.JCommandButton

@FlamingoElementMarker
class KCommandButtonPresentation {
    var state: CommandButtonDisplayState = CommandButtonDisplayState.FIT_TO_ICON
    var isFlat: Boolean = true
    var horizontalAlignment: Int = AbstractCommandButton.DEFAULT_HORIZONTAL_ALIGNMENT
    var horizontalGapScaleFactor: Double = AbstractCommandButton.DEFAULT_GAP_SCALE_FACTOR
    var verticalGapScaleFactor: Double = AbstractCommandButton.DEFAULT_GAP_SCALE_FACTOR
    var popupOrientationKind: JCommandButton.CommandButtonPopupOrientationKind
        = JCommandButton.CommandButtonPopupOrientationKind.DOWNWARD
    var customDimension: Int? = null
    var isMenu: Boolean = false
    var actionKeyTip: String? = null
    var popupKeyTip: String? = null

    fun toCommandDisplay() : FlamingoCommandDisplay {
        return FlamingoCommandDisplay.builder()
                .setState(state)
                .setFlat(isFlat)
                .setHorizontalAlignment(horizontalAlignment)
                .setHorizontalGapScaleFactor(horizontalGapScaleFactor)
                .setVerticalGapScaleFactor(verticalGapScaleFactor)
                .setPopupOrientationKind(popupOrientationKind)
                .setCustomDimension(customDimension)
                .setActionKeyTip(actionKeyTip)
                .setPopupKeyTip(popupKeyTip)
                .setMenu(isMenu)
                .build()
    }
}

@FlamingoElementMarker
class KCommandButton {
    internal val command: KCommand = KCommand()
    internal val presentation: KCommandButtonPresentation = KCommandButtonPresentation()

    fun command(init: KCommand.() -> Unit) {
        command.init()
    }

    fun presentation(init: KCommandButtonPresentation.() -> Unit) {
        presentation.init()
    }

    fun asButton(): AbstractCommandButton {
        return command.asBaseButton(presentation)
    }
}

fun commandButton(init: KCommandButton.() -> Unit): KCommandButton {
    val commandButton = KCommandButton()
    commandButton.init()
    return commandButton
}



