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
@file:Suppress("NOTHING_TO_INLINE")

package org.pushingpixels.meteor.awt

import java.awt.Component
import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.ActionMap
import javax.swing.JPopupMenu
import javax.swing.JRootPane
import javax.swing.SwingUtilities

/**
 * Wires the [popup] to this component, with the optional [popupMenuAction] to be invoked right before the popup
 * is shown.
 */
public fun Component.wirePopup(popup: JPopupMenu, popupMenuAction: ((JPopupMenu) -> Unit)? = null) {
    this.addMouseListener(object : MouseAdapter() {
        override fun mousePressed(e: MouseEvent) {
            maybeShowPopup(e)
        }

        override fun mouseReleased(e: MouseEvent) {
            maybeShowPopup(e)
        }

        private fun maybeShowPopup(e: MouseEvent) {
            if (e.isPopupTrigger) {
                popupMenuAction?.invoke(popup)
                popup.show(e.component, e.x, e.y)
            }
        }
    })
}

public val Component.windowAncestor: Window?
    get() = SwingUtilities.getWindowAncestor(this)

public val Component.rootPane: JRootPane?
    get() = SwingUtilities.getRootPane(this)
