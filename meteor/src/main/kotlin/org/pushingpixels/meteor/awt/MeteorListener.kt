/*
 * Copyright (c) 2018 Radiance Meteor Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Meteor Kirill Grouchnikov nor the names of
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

import kotlinx.coroutines.experimental.Dispatchers
import kotlinx.coroutines.experimental.GlobalScope
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.swing.Swing
import java.awt.AWTEvent
import java.awt.Container
import java.awt.Window
import java.awt.dnd.*
import java.awt.event.*
import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener
import java.beans.VetoableChangeListener
import javax.swing.AbstractButton
import javax.swing.JComboBox
import javax.swing.JSlider
import javax.swing.event.*

fun DelayedActionListener(listener: (ActionEvent) -> Unit): ActionListener {
    return ActionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedAdjustmentListener(listener: (AdjustmentEvent) -> Unit): AdjustmentListener {
    return AdjustmentListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedAncestorListener(
        onAncestorAdded: (event: AncestorEvent?) -> Unit = {},
        onAncestorRemoved: (event: AncestorEvent?) -> Unit = {},
        onAncestorMoved: (event: AncestorEvent?) -> Unit = {}): AncestorListener {
    return object : AncestorListener {
        override fun ancestorAdded(event: AncestorEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onAncestorAdded.invoke(event)
            }
        }

        override fun ancestorRemoved(event: AncestorEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onAncestorRemoved.invoke(event)
            }
        }

        override fun ancestorMoved(event: AncestorEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onAncestorMoved.invoke(event)
            }
        }
    }
}

fun DelayedAWTEventListener(listener: (AWTEvent) -> Unit): AWTEventListener {
    return AWTEventListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedCaretListener(listener: (CaretEvent) -> Unit): CaretListener {
    return CaretListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedCellEditorListener(
        onEditingCanceled: (event: ChangeEvent?) -> Unit = {},
        onEditingStopped: (event: ChangeEvent?) -> Unit = {}): CellEditorListener {
    return object : CellEditorListener {
        override fun editingCanceled(event: ChangeEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onEditingCanceled.invoke(event)
            }
        }

        override fun editingStopped(event: ChangeEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onEditingStopped.invoke(event)
            }
        }
    }
}

fun DelayedChangeListener(listener: (ChangeEvent) -> Unit): ChangeListener {
    return ChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedComponentListener(
        onComponentHidden: (event: ComponentEvent?) -> Unit = {},
        onComponentMoved: (event: ComponentEvent?) -> Unit = {},
        onComponentResized: (event: ComponentEvent?) -> Unit = {},
        onComponentShown: (event: ComponentEvent?) -> Unit = {}): ComponentListener {
    return object : ComponentListener {
        override fun componentHidden(event: ComponentEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onComponentHidden.invoke(event)
            }
        }

        override fun componentMoved(event: ComponentEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onComponentMoved.invoke(event)
            }
        }

        override fun componentResized(event: ComponentEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onComponentResized.invoke(event)
            }
        }

        override fun componentShown(event: ComponentEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onComponentShown.invoke(event)
            }
        }
    }
}

fun DelayedContainerListener(
        onComponentAdded: (event: ContainerEvent?) -> Unit = {},
        onComponentRemoved: (event: ContainerEvent?) -> Unit = {}): ContainerListener {
    return object : ContainerListener {
        override fun componentAdded(event: ContainerEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onComponentAdded.invoke(event)
            }
        }

        override fun componentRemoved(event: ContainerEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onComponentRemoved.invoke(event)
            }
        }
    }
}

fun DelayedDocumentListener(
        onChangedUpdate: (event: DocumentEvent?) -> Unit = {},
        onInsertUpdate: (event: DocumentEvent?) -> Unit = {},
        onRemoveUpdate: (event: DocumentEvent?) -> Unit = {}): DocumentListener {
    return object : DocumentListener {
        override fun changedUpdate(event: DocumentEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onChangedUpdate.invoke(event)
            }
        }

        override fun insertUpdate(event: DocumentEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onInsertUpdate.invoke(event)
            }
        }

        override fun removeUpdate(event: DocumentEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onRemoveUpdate.invoke(event)
            }
        }
    }
}

fun DelayedDragGestureListener(listener: (DragGestureEvent) -> Unit): DragGestureListener {
    return DragGestureListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedDragSourceListener(
        onDragDropEnd: (event: DragSourceDropEvent?) -> Unit = {},
        onDragEnter: (event: DragSourceDragEvent?) -> Unit = {},
        onDragExit: (event: DragSourceEvent?) -> Unit = {},
        onDragOver: (event: DragSourceDragEvent?) -> Unit = {},
        onDropActionChanged: (event: DragSourceDragEvent?) -> Unit = {}): DragSourceListener {
    return object : DragSourceListener {
        override fun dragDropEnd(event: DragSourceDropEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onDragDropEnd.invoke(event)
            }
        }

        override fun dragEnter(event: DragSourceDragEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onDragEnter.invoke(event)
            }
        }

        override fun dragExit(event: DragSourceEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onDragExit.invoke(event)
            }
        }

        override fun dragOver(event: DragSourceDragEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onDragOver.invoke(event)
            }
        }

        override fun dropActionChanged(event: DragSourceDragEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onDropActionChanged.invoke(event)
            }
        }
    }
}

fun DelayedDragSourceMotionListener(listener: (DragSourceDragEvent) -> Unit): DragSourceMotionListener {
    return DragSourceMotionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedDropTargetListener(
        onDragEnter: (event: DropTargetDragEvent?) -> Unit = {},
        onDragExit: (event: DropTargetEvent?) -> Unit = {},
        onDragOver: (event: DropTargetDragEvent?) -> Unit = {},
        onDrop: (event: DropTargetDropEvent?) -> Unit = {},
        onDropActionChanged: (event: DropTargetDragEvent?) -> Unit = {}): DropTargetListener {
    return object : DropTargetListener {
        override fun dragEnter(event: DropTargetDragEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onDragEnter.invoke(event)
            }
        }

        override fun dragExit(event: DropTargetEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onDragExit.invoke(event)
            }
        }

        override fun dragOver(event: DropTargetDragEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onDragOver.invoke(event)
            }
        }

        override fun drop(event: DropTargetDropEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onDrop.invoke(event)
            }
        }

        override fun dropActionChanged(event: DropTargetDragEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onDropActionChanged.invoke(event)
            }
        }
    }
}

fun DelayedInputMethodListener(
        onCaretPositionChanged: (event: InputMethodEvent?) -> Unit = {},
        onInputMethodTextChanged: (event: InputMethodEvent?) -> Unit = {}): InputMethodListener {
    return object : InputMethodListener {
        override fun caretPositionChanged(event: InputMethodEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onCaretPositionChanged.invoke(event)
            }
        }

        override fun inputMethodTextChanged(event: InputMethodEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onInputMethodTextChanged.invoke(event)
            }
        }
    }
}

fun DelayedInputMethodListener(
        onInternalFrameActivated: (event: InternalFrameEvent?) -> Unit = {},
        onInternalFrameClosed: (event: InternalFrameEvent?) -> Unit = {},
        onInternalFrameClosing: (event: InternalFrameEvent?) -> Unit = {},
        onInternalFrameDeactivated: (event: InternalFrameEvent?) -> Unit = {},
        onInternalFrameDeiconified: (event: InternalFrameEvent?) -> Unit = {},
        onInternalFrameIconified: (event: InternalFrameEvent?) -> Unit = {},
        onInternalFrameOpened: (event: InternalFrameEvent?) -> Unit = {}): InternalFrameListener {
    return object : InternalFrameListener {
        override fun internalFrameActivated(event: InternalFrameEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onInternalFrameActivated.invoke(event)
            }
        }

        override fun internalFrameClosed(event: InternalFrameEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onInternalFrameClosed.invoke(event)
            }
        }

        override fun internalFrameClosing(event: InternalFrameEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onInternalFrameClosing.invoke(event)
            }
        }

        override fun internalFrameDeactivated(event: InternalFrameEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onInternalFrameDeactivated.invoke(event)
            }
        }

        override fun internalFrameDeiconified(event: InternalFrameEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onInternalFrameDeiconified.invoke(event)
            }
        }

        override fun internalFrameIconified(event: InternalFrameEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onInternalFrameIconified.invoke(event)
            }
        }

        override fun internalFrameOpened(event: InternalFrameEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onInternalFrameOpened.invoke(event)
            }
        }
    }
}

fun DelayedItemListener(listener: (ItemEvent) -> Unit): ItemListener {
    return ItemListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedKeyListener(
        onKeyPressed: (event: KeyEvent?) -> Unit = {},
        onKeyReleased: (event: KeyEvent?) -> Unit = {},
        onKeyTyped: (event: KeyEvent?) -> Unit = {}): KeyListener {
    return object : KeyListener {
        override fun keyPressed(event: KeyEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onKeyPressed.invoke(event)
            }
        }

        override fun keyReleased(event: KeyEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onKeyReleased.invoke(event)
            }
        }

        override fun keyTyped(event: KeyEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onKeyTyped.invoke(event)
            }
        }
    }
}

fun DelayedListDataListener(
        onContentsChanged: (event: ListDataEvent?) -> Unit = {},
        onIntervalAdded: (event: ListDataEvent?) -> Unit = {},
        onIntervalRemoved: (event: ListDataEvent?) -> Unit = {}): ListDataListener {
    return object : ListDataListener {
        override fun contentsChanged(event: ListDataEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onContentsChanged.invoke(event)
            }
        }

        override fun intervalAdded(event: ListDataEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onIntervalAdded.invoke(event)
            }
        }

        override fun intervalRemoved(event: ListDataEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onIntervalRemoved.invoke(event)
            }
        }
    }
}

fun DelayedListSelectionListener(listener: (ListSelectionEvent) -> Unit): ListSelectionListener {
    return ListSelectionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedMenuDragMouseListener(
        onMenuDragMouseDragged: (event: MenuDragMouseEvent?) -> Unit = {},
        onMenuDragMouseEntered: (event: MenuDragMouseEvent?) -> Unit = {},
        onMenuDragMouseExited: (event: MenuDragMouseEvent?) -> Unit = {},
        onMenuDragMouseReleased: (event: MenuDragMouseEvent?) -> Unit = {}): MenuDragMouseListener {
    return object : MenuDragMouseListener {
        override fun menuDragMouseDragged(event: MenuDragMouseEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMenuDragMouseDragged.invoke(event)
            }
        }

        override fun menuDragMouseEntered(event: MenuDragMouseEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMenuDragMouseEntered.invoke(event)
            }
        }

        override fun menuDragMouseExited(event: MenuDragMouseEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMenuDragMouseExited.invoke(event)
            }
        }

        override fun menuDragMouseReleased(event: MenuDragMouseEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMenuDragMouseReleased.invoke(event)
            }
        }
    }
}

fun DelayedMenuKeyListener(
        onMenuKeyPressed: (event: MenuKeyEvent?) -> Unit = {},
        onMenuKeyReleased: (event: MenuKeyEvent?) -> Unit = {},
        onMenuKeyTyped: (event: MenuKeyEvent?) -> Unit = {}): MenuKeyListener {
    return object : MenuKeyListener {
        override fun menuKeyPressed(event: MenuKeyEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMenuKeyPressed.invoke(event)
            }
        }

        override fun menuKeyReleased(event: MenuKeyEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMenuKeyReleased.invoke(event)
            }
        }

        override fun menuKeyTyped(event: MenuKeyEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMenuKeyTyped.invoke(event)
            }
        }
    }
}

fun DelayedMenuListener(
        onMenuCanceled: (event: MenuEvent?) -> Unit = {},
        onMenuDeselected: (event: MenuEvent?) -> Unit = {},
        onMenuSelected: (event: MenuEvent?) -> Unit = {}): MenuListener {
    return object : MenuListener {
        override fun menuCanceled(event: MenuEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMenuCanceled.invoke(event)
            }
        }

        override fun menuDeselected(event: MenuEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMenuDeselected.invoke(event)
            }
        }

        override fun menuSelected(event: MenuEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMenuSelected.invoke(event)
            }
        }
    }
}

fun DelayedMouseListener(
        onMouseClicked: (event: MouseEvent?) -> Unit = {},
        onMouseEntered: (event: MouseEvent?) -> Unit = {},
        onMouseExited: (event: MouseEvent?) -> Unit = {},
        onMousePressed: (event: MouseEvent?) -> Unit = {},
        onMouseReleased: (event: MouseEvent?) -> Unit = {}): MouseListener {
    return object : MouseListener {
        override fun mouseClicked(event: MouseEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMouseClicked.invoke(event)
            }
        }

        override fun mouseEntered(event: MouseEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMouseEntered.invoke(event)
            }
        }

        override fun mouseExited(event: MouseEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMouseExited.invoke(event)
            }
        }

        override fun mousePressed(event: MouseEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMousePressed.invoke(event)
            }
        }

        override fun mouseReleased(event: MouseEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMouseReleased.invoke(event)
            }
        }
    }
}

fun DelayedMouseMotionListener(
        onMouseDragged: (event: MouseEvent?) -> Unit = {},
        onMouseMoved: (event: MouseEvent?) -> Unit = {}): MouseMotionListener {
    return object : MouseMotionListener {
        override fun mouseDragged(event: MouseEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMouseDragged.invoke(event)
            }
        }

        override fun mouseMoved(event: MouseEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onMouseMoved.invoke(event)
            }
        }
    }
}

fun DelayedMouseWheelListener(listener: (MouseWheelEvent) -> Unit): MouseWheelListener {
    return MouseWheelListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedPopupMenuListener(
        onPopupMenuCanceled: (event: PopupMenuEvent?) -> Unit = {},
        onPopupMenuWillBecomeInvisible: (event: PopupMenuEvent?) -> Unit = {},
        onPopupMenuWillBecomeVisible: (event: PopupMenuEvent?) -> Unit = {}): PopupMenuListener {
    return object : PopupMenuListener {
        override fun popupMenuCanceled(event: PopupMenuEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onPopupMenuCanceled.invoke(event)
            }
        }

        override fun popupMenuWillBecomeInvisible(event: PopupMenuEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onPopupMenuWillBecomeInvisible.invoke(event)
            }
        }

        override fun popupMenuWillBecomeVisible(event: PopupMenuEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onPopupMenuWillBecomeVisible.invoke(event)
            }
        }
    }
}

fun DelayedPropertyChangeListener(listener: (PropertyChangeEvent) -> Unit): PropertyChangeListener {
    return PropertyChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedRowSorterListener(listener: (RowSorterEvent) -> Unit): RowSorterListener {
    return RowSorterListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedTableColumnModelListener(
        onColumnAdded: (event: TableColumnModelEvent?) -> Unit = {},
        onColumnMarginChanged: (event: ChangeEvent?) -> Unit = {},
        onColumnMoved: (event: TableColumnModelEvent?) -> Unit = {},
        onColumnRemoved: (event: TableColumnModelEvent?) -> Unit = {},
        onColumnSelectionChanged: (event: ListSelectionEvent?) -> Unit = {}): TableColumnModelListener {
    return object : TableColumnModelListener {
        override fun columnAdded(event: TableColumnModelEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onColumnAdded.invoke(event)
            }
        }

        override fun columnMarginChanged(event: ChangeEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onColumnMarginChanged.invoke(event)
            }
        }

        override fun columnMoved(event: TableColumnModelEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onColumnMoved.invoke(event)
            }
        }

        override fun columnRemoved(event: TableColumnModelEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onColumnRemoved.invoke(event)
            }
        }

        override fun columnSelectionChanged(event: ListSelectionEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onColumnSelectionChanged.invoke(event)
            }
        }
    }
}

fun DelayedTableModelListener(listener: (TableModelEvent) -> Unit): TableModelListener {
    return TableModelListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedTextListener(listener: (TextEvent) -> Unit): TextListener {
    return TextListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedTreeExpansionListener(
        onTreeCollapsed: (event: TreeExpansionEvent?) -> Unit = {},
        onTreeExpanded: (event: TreeExpansionEvent?) -> Unit = {}): TreeExpansionListener {
    return object : TreeExpansionListener {
        override fun treeCollapsed(event: TreeExpansionEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onTreeCollapsed.invoke(event)
            }
        }

        override fun treeExpanded(event: TreeExpansionEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onTreeExpanded.invoke(event)
            }
        }
    }
}

fun DelayedTreeModelListener(
        onTreeNodesChanged: (event: TreeModelEvent?) -> Unit = {},
        onTreeNodesInserted: (event: TreeModelEvent?) -> Unit = {},
        onTreeNodesRemoved: (event: TreeModelEvent?) -> Unit = {},
        onTreeStructureChanged: (event: TreeModelEvent?) -> Unit = {}): TreeModelListener {
    return object : TreeModelListener {
        override fun treeNodesChanged(event: TreeModelEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onTreeNodesChanged.invoke(event)
            }
        }

        override fun treeNodesInserted(event: TreeModelEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onTreeNodesInserted.invoke(event)
            }
        }

        override fun treeNodesRemoved(event: TreeModelEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onTreeNodesRemoved.invoke(event)
            }
        }

        override fun treeStructureChanged(event: TreeModelEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onTreeStructureChanged.invoke(event)
            }
        }
    }
}

fun DelayedTreeSelectionListener(listener: (TreeSelectionEvent) -> Unit): TreeSelectionListener {
    return TreeSelectionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedTreeWillExpandListener(
        onTreeWillCollapse: (event: TreeExpansionEvent?) -> Unit = {},
        onTreeWillExpand: (event: TreeExpansionEvent?) -> Unit = {}): TreeWillExpandListener {
    return object : TreeWillExpandListener {
        override fun treeWillCollapse(event: TreeExpansionEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onTreeWillCollapse.invoke(event)
            }
        }

        override fun treeWillExpand(event: TreeExpansionEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onTreeWillExpand.invoke(event)
            }
        }
    }
}

fun DelayedUndoableEditListener(listener: (UndoableEditEvent) -> Unit): UndoableEditListener {
    return UndoableEditListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}


fun DelayedVetoableChangeListener(listener: (PropertyChangeEvent) -> Unit): VetoableChangeListener {
    return VetoableChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

fun DelayedWindowFocusListener(
        onWindowGainedFocus: (event: WindowEvent?) -> Unit = {},
        onWindowLostFocus: (event: WindowEvent?) -> Unit = {}): WindowFocusListener {
    return object : WindowFocusListener {
        override fun windowGainedFocus(event: WindowEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onWindowGainedFocus.invoke(event)
            }
        }

        override fun windowLostFocus(event: WindowEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onWindowLostFocus.invoke(event)
            }
        }
    }
}

inline fun DelayedWindowListener(
        crossinline onWindowActivated: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowClosed: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowClosing: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowDeactivated: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowDeiconified: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowIconified: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowOpened: (event: WindowEvent?) -> Unit = {}): WindowListener {
    return object : WindowListener {
        override fun windowActivated(event: WindowEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onWindowActivated.invoke(event)
            }
        }

        override fun windowClosed(event: WindowEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onWindowClosed.invoke(event)
            }
        }

        override fun windowClosing(event: WindowEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onWindowClosing.invoke(event)
            }
        }

        override fun windowDeactivated(event: WindowEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onWindowDeactivated.invoke(event)
            }
        }

        override fun windowDeiconified(event: WindowEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onWindowDeiconified.invoke(event)
            }
        }

        override fun windowIconified(event: WindowEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onWindowIconified.invoke(event)
            }
        }

        override fun windowOpened(event: WindowEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onWindowOpened.invoke(event)
            }
        }
    }
}

fun DelayedWindowStateListener(listener: (WindowEvent) -> Unit): WindowStateListener {
    return WindowStateListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

inline fun AbstractButton.addDelayedActionListener(
        crossinline listener: suspend (ActionEvent) -> Unit): ActionListener {
    val listenerToAdd = ActionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addActionListener(listenerToAdd)
    return listenerToAdd
}

inline fun AbstractButton.addDelayedItemListener(crossinline listener: suspend (ItemEvent) -> Unit): ItemListener {
    val listenerToAdd = ItemListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addItemListener(listenerToAdd)
    return listenerToAdd
}

inline fun AbstractButton.addDelayedChangeListener(
        crossinline listener: suspend (ChangeEvent) -> Unit): ChangeListener {
    val listenerToAdd = ChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addChangeListener(listenerToAdd)
    return listenerToAdd
}

inline fun JComboBox<*>.addDelayedActionListener(crossinline listener: suspend (ActionEvent) -> Unit): ActionListener {
    val listenerToAdd = ActionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addActionListener(listenerToAdd)
    return listenerToAdd
}

inline fun JComboBox<*>.addDelayedItemListener(crossinline listener: suspend (ItemEvent) -> Unit): ItemListener {
    val listenerToAdd = ItemListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addItemListener(listenerToAdd)
    return listenerToAdd
}

inline fun JSlider.addDelayedChangeListener(crossinline listener: suspend (ChangeEvent) -> Unit): ChangeListener {
    val listenerToAdd = ChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addChangeListener(listenerToAdd)
    return listenerToAdd
}

fun Container.addDelayedPropertyChangeListener(listener: suspend (PropertyChangeEvent) -> Unit): PropertyChangeListener {
    val listenerToAdd = PropertyChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addPropertyChangeListener(listenerToAdd)
    return listenerToAdd
}

fun Container.addDelayedPropertyChangeListener(propertyName: String,
        listener: suspend (PropertyChangeEvent) -> Unit): PropertyChangeListener {
    val listenerToAdd = PropertyChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addPropertyChangeListener(propertyName, listenerToAdd)
    return listenerToAdd
}

class TypedPropertyChangeEvent<T>(val source: Any, val propertyName: String,
        val oldValue: T?, val newValue: T?)

inline fun <reified T> Container.addTypedDelayedPropertyChangeListener(propertyName: String,
        crossinline listener: suspend (TypedPropertyChangeEvent<T>) -> Unit) {
    this.addDelayedPropertyChangeListener(propertyName) { event ->
        listener.invoke(TypedPropertyChangeEvent(event.source,
                propertyName, event.oldValue as? T, event.newValue as? T))
    }
}

//inline fun Window.onWindowClosing(crossinline action: (event: WindowEvent?) -> Unit) {
//    this.addWindowListener {
//        DelayedWindowListener {
//            onWindowClosing {
//                action
//            }
//        }
//    }
//}

inline fun Window.addDelayedWindowListener(
        crossinline onWindowActivated: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowClosed: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowClosing: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowDeactivated: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowDeiconified: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowIconified: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowOpened: (event: WindowEvent?) -> Unit = {}): WindowListener {
    val listener = DelayedWindowListener(
            onWindowActivated, onWindowClosed, onWindowClosing,
            onWindowDeactivated, onWindowDeiconified, onWindowIconified,
            onWindowOpened)
    this.addWindowListener(listener)
    return listener
}


