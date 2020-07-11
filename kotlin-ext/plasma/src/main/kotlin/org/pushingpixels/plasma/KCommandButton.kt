/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.flamingo.api.common.AbstractCommandButton

@PlasmaElementMarker
class KCommandButton {
    internal val command: KCommand = KCommand()
    internal val presentation: KCommandButtonPresentation = KCommandButtonPresentation()

    fun command(init: KCommand.() -> Unit) : KCommand {
        command.init()
        return command
    }

    fun presentation(init: KCommandButtonPresentation.() -> Unit) {
        presentation.init()
    }

    fun toButton(): AbstractCommandButton {
        return command.toCommandButton(presentation)
    }
}

fun commandButton(init: KCommandButton.() -> Unit): KCommandButton {
    val commandButton = KCommandButton()
    commandButton.init()
    return commandButton
}

@PlasmaElementMarker
class KColorSelectorCommandButton {
    internal val command: KColorSelectorCommand = KColorSelectorCommand()
    internal val presentation: KColorSelectorCommandPresentation = KColorSelectorCommandPresentation()

    fun command(init: KColorSelectorCommand.() -> Unit) : KColorSelectorCommand {
        command.init()
        return command
    }

    fun presentation(init: KColorSelectorCommandPresentation.() -> Unit) {
        presentation.init()
    }

    fun toButton(): AbstractCommandButton {
        return command.toColorSelectorCommandButton(presentation)
    }
}

fun colorSelectorCommandButton(init: KColorSelectorCommandButton.() -> Unit): KColorSelectorCommandButton {
    val commandButton = KColorSelectorCommandButton()
    commandButton.init()
    return commandButton
}



