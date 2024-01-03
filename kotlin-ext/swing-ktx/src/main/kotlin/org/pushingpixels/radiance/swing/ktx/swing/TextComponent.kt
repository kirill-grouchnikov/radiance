/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import javax.swing.JTextPane
import javax.swing.text.SimpleAttributeSet
import javax.swing.text.StyleConstants

public enum class AlignType(public val alignConstant: Int) {
    ALIGN_LEFT(StyleConstants.ALIGN_LEFT),
    ALIGN_CENTER(StyleConstants.ALIGN_CENTER),
    ALIGN_RIGHT(StyleConstants.ALIGN_RIGHT),
    ALIGN_JUSTIFIED(StyleConstants.ALIGN_JUSTIFIED)
}

public enum class CharacterStyleType(public val characterStyle: Any) {
    STYLE_BOLD(StyleConstants.CharacterConstants.Bold),
    STYLE_ITALIC(StyleConstants.CharacterConstants.Italic),
    STYLE_UNDERLINE(StyleConstants.CharacterConstants.Underline),
    STYLE_STRIKETHROUGH(StyleConstants.CharacterConstants.StrikeThrough)
}

/**
 * Change content alignment on the text pane.
 */
public inline fun JTextPane.setAlignment(alignment: AlignType) {
    val attrSet = SimpleAttributeSet()
    StyleConstants.setAlignment(attrSet, alignment.alignConstant)
    this.styledDocument.setParagraphAttributes(0, this.styledDocument.length, attrSet, false)
}

/**
 * Checks presence of content style in current selection
 */
public fun JTextPane.hasStyleInSelection(style: CharacterStyleType): Boolean {
    for (index in this.selectionStart until this.selectionEnd) {
        val attr = this.styledDocument.getCharacterElement(index)
                .attributes?.getAttribute(style.characterStyle)
        if ((attr is Boolean) && attr) {
            return true
        }
    }
    return false
}

/**
 * Toggles presence of content style in current selection
 */
public fun JTextPane.toggleStyleInSelection(style: CharacterStyleType) {
    val attrSet = SimpleAttributeSet()
    // Add or remove the style on the entire selection
    attrSet.addAttribute(style.characterStyle, !hasStyleInSelection(style))
    this.styledDocument.setCharacterAttributes(this.selectionStart,
            this.selectionEnd - this.selectionStart,
            attrSet, false)
}
