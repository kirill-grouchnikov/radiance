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
@file:Suppress("NOTHING_TO_INLINE")

package org.pushingpixels.radiance.swing.ktx.swing

import org.pushingpixels.radiance.swing.ktx.awt.windowAncestor
import java.awt.Component
import javax.swing.JOptionPane

public enum class OptionPaneMessageType(public val optionPaneConstant: Int) {
    ERROR_MESSAGE_TYPE(JOptionPane.ERROR_MESSAGE),
    INFORMATION_MESSAGE_TYPE(JOptionPane.INFORMATION_MESSAGE),
    WARNING_MESSAGE_TYPE(JOptionPane.WARNING_MESSAGE),
    QUESTION_MESSAGE_TYPE(JOptionPane.QUESTION_MESSAGE),
    PLAIN_MESSAGE_TYPE(JOptionPane.PLAIN_MESSAGE)
}

public enum class OptionPaneConfirmType(public val optionPaneConstant: Int) {
    DEFAULT_OPTION_TYPE(JOptionPane.DEFAULT_OPTION),
    YES_NO_OPTION_TYPE(JOptionPane.YES_NO_OPTION),
    YES_NO_CANCEL_OPTION_TYPE(JOptionPane.YES_NO_CANCEL_OPTION),
    OK_CANCEL_OPTION_TYPE(JOptionPane.OK_CANCEL_OPTION)
}

public inline fun Component.showMessageDialogInWindow(message: Any,
        title: String?, messageType: OptionPaneMessageType
) {
    JOptionPane.showMessageDialog(this.windowAncestor,
            message, title, messageType.optionPaneConstant)
}

public inline fun Component.showConfirmDialogInWindow(message: Any,
        title: String?, confirmType: OptionPaneConfirmType
): Int {
    return JOptionPane.showConfirmDialog(this.windowAncestor,
            message, title, confirmType.optionPaneConstant)
}

public inline fun Component.showInputDialogInWindow(message: Any, title: String?): String? {
    return JOptionPane.showInputDialog(this.windowAncestor, message, title)
}
