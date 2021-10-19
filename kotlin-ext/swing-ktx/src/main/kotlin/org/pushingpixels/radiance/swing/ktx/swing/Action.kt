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

package org.pushingpixels.radiance.swing.ktx.swing

import java.awt.event.ActionEvent
import javax.swing.*

public enum class KeyboardActionScopeType(public val scopeTypeConstant: Int) {
    WHEN_FOCUSED_TYPE(JComponent.WHEN_FOCUSED),
    WHEN_ANCESTOR_OF_FOCUSED_COMPONENT_TYPE(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT),
    WHEN_IN_FOCUSED_WINDOW_TYPE(JComponent.WHEN_IN_FOCUSED_WINDOW)
}

public inline fun JToolBar.addAction(name: String, crossinline action: (ActionEvent?) -> Unit): JButton {
    return this.add(object : AbstractAction(name) {
        override fun actionPerformed(e: ActionEvent?) {
            action.invoke(e)
        }
    })
}

public inline fun JMenu.addAction(name: String, crossinline action: (ActionEvent?) -> Unit): JMenuItem {
    return this.add(object : AbstractAction(name) {
        override fun actionPerformed(e: ActionEvent?) {
            action.invoke(e)
        }
    })
}

public inline fun JMenu.insertAction(name: String, position: Int,
        crossinline action: (ActionEvent?) -> Unit): JMenuItem {
    return this.insert(object : AbstractAction(name) {
        override fun actionPerformed(e: ActionEvent?) {
            action.invoke(e)
        }
    }, position)
}

public inline fun JPopupMenu.addAction(name: String, crossinline action: (ActionEvent?) -> Unit): JMenuItem {
    return this.add(object : AbstractAction(name) {
        override fun actionPerformed(e: ActionEvent?) {
            action.invoke(e)
        }
    })
}

public inline fun JPopupMenu.insertAction(name: String, position: Int,
        crossinline action: (ActionEvent?) -> Unit) {
    this.insert(object : AbstractAction(name) {
        override fun actionPerformed(e: ActionEvent?) {
            action.invoke(e)
        }
    }, position)
}

public inline fun ActionMap.putAction(name: String, crossinline action: (ActionEvent?) -> Unit) {
    this.put(name, object : AbstractAction(name) {
        override fun actionPerformed(e: ActionEvent?) {
            action.invoke(e)
        }
    })
}

public inline fun JComponent.wireActionToKeyStroke(actionName: String, actionKeyStroke: KeyStroke,
                                                   scopeType: KeyboardActionScopeType = KeyboardActionScopeType.WHEN_FOCUSED_TYPE,
                                                   crossinline action: (ActionEvent?) -> Unit) {
    val inputMap = this.getInputMap(scopeType.scopeTypeConstant)
    inputMap.put(actionKeyStroke, actionName)
    this.actionMap.put(actionName, object : AbstractAction(actionName) {
        override fun actionPerformed(e: ActionEvent?) {
            action.invoke(e)
        }
    })
}

public inline fun JComponent.wireActionToKeyStrokes(actionName: String,
                                                    actionKeyStrokes: Collection<KeyStroke>,
                                                    scopeType: KeyboardActionScopeType = KeyboardActionScopeType.WHEN_FOCUSED_TYPE,
                                                    crossinline action: (ActionEvent?) -> Unit) {
    // Make sure that we have at least one KeyStroke
    require(actionKeyStrokes.isNotEmpty()) { "Cannot pass an empty collection of KeyStroke objects" }

    val inputMap = this.getInputMap(scopeType.scopeTypeConstant)
    for (actionKeyStroke in actionKeyStrokes) {
        inputMap.put(actionKeyStroke, actionName)
    }
    this.actionMap.put(actionName, object : AbstractAction(actionName) {
        override fun actionPerformed(e: ActionEvent?) {
            action.invoke(e)
        }
    })
}

public inline fun JComponent.removeActionWiring(actionName: String, actionKeyStroke: KeyStroke,
        scopeType: KeyboardActionScopeType = KeyboardActionScopeType.WHEN_FOCUSED_TYPE
) {
    val currMap = SwingUtilities.getUIInputMap(this, scopeType.scopeTypeConstant)
    if (currMap != null) {
        // Filter out the UI input map entry that matches our action
        SwingUtilities.replaceUIInputMap(this, scopeType.scopeTypeConstant,
                currMap.filterNot { keyStroke, action ->
                    (keyStroke == actionKeyStroke) && (actionName == action)
                })
    }
    // And remove it from the action map as well
    this.actionMap.remove(actionName)
}
