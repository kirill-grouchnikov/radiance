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
@file:OptIn(DelicateCoroutinesApi::class)

package org.pushingpixels.radiance.swing.ktx

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import java.awt.*
import java.awt.List
import java.awt.dnd.*
import java.awt.event.*
import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener
import java.beans.VetoableChangeListener
import javax.swing.*
import javax.swing.event.*
import javax.swing.table.AbstractTableModel
import javax.swing.tree.DefaultTreeModel
import javax.swing.tree.DefaultTreeSelectionModel
import kotlin.reflect.KProperty

public fun DelayedActionListener(listener: (ActionEvent) -> Unit): ActionListener {
    return ActionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public fun DelayedAdjustmentListener(listener: (AdjustmentEvent) -> Unit): AdjustmentListener {
    return AdjustmentListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun DelayedAncestorListener(
        crossinline onAncestorAdded: (event: AncestorEvent?) -> Unit = {},
        crossinline onAncestorRemoved: (event: AncestorEvent?) -> Unit = {},
        crossinline onAncestorMoved: (event: AncestorEvent?) -> Unit = {}): AncestorListener {
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

public fun DelayedAWTEventListener(listener: (AWTEvent) -> Unit): AWTEventListener {
    return AWTEventListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public fun DelayedCaretListener(listener: (CaretEvent) -> Unit): CaretListener {
    return CaretListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun DelayedCellEditorListener(
        crossinline onEditingCanceled: (event: ChangeEvent?) -> Unit = {},
        crossinline onEditingStopped: (event: ChangeEvent?) -> Unit = {}): CellEditorListener {
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

public fun DelayedChangeListener(listener: (ChangeEvent) -> Unit): ChangeListener {
    return ChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun DelayedComponentListener(
        crossinline onComponentHidden: (event: ComponentEvent?) -> Unit = {},
        crossinline onComponentMoved: (event: ComponentEvent?) -> Unit = {},
        crossinline onComponentResized: (event: ComponentEvent?) -> Unit = {},
        crossinline onComponentShown: (event: ComponentEvent?) -> Unit = {}): ComponentListener {
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

public inline fun DelayedContainerListener(
        crossinline onComponentAdded: (event: ContainerEvent?) -> Unit = {},
        crossinline onComponentRemoved: (event: ContainerEvent?) -> Unit = {}): ContainerListener {
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

public inline fun DelayedDocumentListener(
        crossinline onChangedUpdate: (event: DocumentEvent?) -> Unit = {},
        crossinline onInsertUpdate: (event: DocumentEvent?) -> Unit = {},
        crossinline onRemoveUpdate: (event: DocumentEvent?) -> Unit = {}): DocumentListener {
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

public fun DelayedDragGestureListener(listener: (DragGestureEvent) -> Unit): DragGestureListener {
    return DragGestureListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun DelayedDragSourceListener(
        crossinline onDragDropEnd: (event: DragSourceDropEvent?) -> Unit = {},
        crossinline onDragEnter: (event: DragSourceDragEvent?) -> Unit = {},
        crossinline onDragExit: (event: DragSourceEvent?) -> Unit = {},
        crossinline onDragOver: (event: DragSourceDragEvent?) -> Unit = {},
        crossinline onDropActionChanged: (event: DragSourceDragEvent?) -> Unit = {}): DragSourceListener {
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

public fun DelayedDragSourceMotionListener(listener: (DragSourceDragEvent) -> Unit): DragSourceMotionListener {
    return DragSourceMotionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun DelayedDropTargetListener(
        crossinline onDragEnter: (event: DropTargetDragEvent?) -> Unit = {},
        crossinline onDragExit: (event: DropTargetEvent?) -> Unit = {},
        crossinline onDragOver: (event: DropTargetDragEvent?) -> Unit = {},
        crossinline onDrop: (event: DropTargetDropEvent?) -> Unit = {},
        crossinline onDropActionChanged: (event: DropTargetDragEvent?) -> Unit = {}): DropTargetListener {
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

public inline fun DelayedFocusListener(
        crossinline onFocusGained: (event: FocusEvent?) -> Unit = {},
        crossinline onFocusLost: (event: FocusEvent?) -> Unit = {}): FocusListener {
    return object : FocusListener {
        override fun focusGained(event: FocusEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onFocusGained.invoke(event)
            }
        }

        override fun focusLost(event: FocusEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onFocusLost.invoke(event)
            }
        }
    }
}

public inline fun DelayedHierarchyBoundsListener(
        crossinline onAncestorMoved: (event: HierarchyEvent?) -> Unit = {},
        crossinline onAncestorResized: (event: HierarchyEvent?) -> Unit = {}): HierarchyBoundsListener {
    return object : HierarchyBoundsListener {
        override fun ancestorMoved(event: HierarchyEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onAncestorMoved.invoke(event)
            }
        }

        override fun ancestorResized(event: HierarchyEvent?) {
            GlobalScope.launch(Dispatchers.Swing) {
                onAncestorResized.invoke(event)
            }
        }
    }
}

public fun DelayedHierarchyListener(listener: (HierarchyEvent) -> Unit): HierarchyListener {
    return HierarchyListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public fun DelayedHyperlinkListener(listener: (HyperlinkEvent) -> Unit): HyperlinkListener {
    return HyperlinkListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun DelayedInputMethodListener(
        crossinline onCaretPositionChanged: (event: InputMethodEvent?) -> Unit = {},
        crossinline onInputMethodTextChanged: (event: InputMethodEvent?) -> Unit = {}): InputMethodListener {
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

public inline fun DelayedInputMethodListener(
        crossinline onInternalFrameActivated: (event: InternalFrameEvent?) -> Unit = {},
        crossinline onInternalFrameClosed: (event: InternalFrameEvent?) -> Unit = {},
        crossinline onInternalFrameClosing: (event: InternalFrameEvent?) -> Unit = {},
        crossinline onInternalFrameDeactivated: (event: InternalFrameEvent?) -> Unit = {},
        crossinline onInternalFrameDeiconified: (event: InternalFrameEvent?) -> Unit = {},
        crossinline onInternalFrameIconified: (event: InternalFrameEvent?) -> Unit = {},
        crossinline onInternalFrameOpened: (event: InternalFrameEvent?) -> Unit = {}): InternalFrameListener {
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

public fun DelayedItemListener(listener: (ItemEvent) -> Unit): ItemListener {
    return ItemListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun DelayedKeyListener(
        crossinline onKeyPressed: (event: KeyEvent?) -> Unit = {},
        crossinline onKeyReleased: (event: KeyEvent?) -> Unit = {},
        crossinline onKeyTyped: (event: KeyEvent?) -> Unit = {}): KeyListener {
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

public inline fun DelayedListDataListener(
        crossinline onContentsChanged: (event: ListDataEvent?) -> Unit = {},
        crossinline onIntervalAdded: (event: ListDataEvent?) -> Unit = {},
        crossinline onIntervalRemoved: (event: ListDataEvent?) -> Unit = {}): ListDataListener {
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

public fun DelayedListSelectionListener(listener: (ListSelectionEvent) -> Unit): ListSelectionListener {
    return ListSelectionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun DelayedMenuDragMouseListener(
        crossinline onMenuDragMouseDragged: (event: MenuDragMouseEvent?) -> Unit = {},
        crossinline onMenuDragMouseEntered: (event: MenuDragMouseEvent?) -> Unit = {},
        crossinline onMenuDragMouseExited: (event: MenuDragMouseEvent?) -> Unit = {},
        crossinline onMenuDragMouseReleased: (event: MenuDragMouseEvent?) -> Unit = {}): MenuDragMouseListener {
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

public inline fun DelayedMenuKeyListener(
        crossinline onMenuKeyPressed: (event: MenuKeyEvent?) -> Unit = {},
        crossinline onMenuKeyReleased: (event: MenuKeyEvent?) -> Unit = {},
        crossinline onMenuKeyTyped: (event: MenuKeyEvent?) -> Unit = {}): MenuKeyListener {
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

public inline fun DelayedMenuListener(
        crossinline onMenuCanceled: (event: MenuEvent?) -> Unit = {},
        crossinline onMenuDeselected: (event: MenuEvent?) -> Unit = {},
        crossinline onMenuSelected: (event: MenuEvent?) -> Unit = {}): MenuListener {
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

public inline fun DelayedMouseListener(
        crossinline onMouseClicked: (event: MouseEvent?) -> Unit = {},
        crossinline onMouseEntered: (event: MouseEvent?) -> Unit = {},
        crossinline onMouseExited: (event: MouseEvent?) -> Unit = {},
        crossinline onMousePressed: (event: MouseEvent?) -> Unit = {},
        crossinline onMouseReleased: (event: MouseEvent?) -> Unit = {}): MouseListener {
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

public inline fun DelayedMouseMotionListener(
        crossinline onMouseDragged: (event: MouseEvent?) -> Unit = {},
        crossinline onMouseMoved: (event: MouseEvent?) -> Unit = {}): MouseMotionListener {
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

public fun DelayedMouseWheelListener(listener: (MouseWheelEvent) -> Unit): MouseWheelListener {
    return MouseWheelListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun DelayedPopupMenuListener(
        crossinline onPopupMenuCanceled: (event: PopupMenuEvent?) -> Unit = {},
        crossinline onPopupMenuWillBecomeInvisible: (event: PopupMenuEvent?) -> Unit = {},
        crossinline onPopupMenuWillBecomeVisible: (event: PopupMenuEvent?) -> Unit = {}): PopupMenuListener {
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

public fun DelayedPropertyChangeListener(listener: (PropertyChangeEvent) -> Unit): PropertyChangeListener {
    return PropertyChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public fun DelayedRowSorterListener(listener: (RowSorterEvent) -> Unit): RowSorterListener {
    return RowSorterListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun DelayedTableColumnModelListener(
        crossinline onColumnAdded: (event: TableColumnModelEvent?) -> Unit = {},
        crossinline onColumnMarginChanged: (event: ChangeEvent?) -> Unit = {},
        crossinline onColumnMoved: (event: TableColumnModelEvent?) -> Unit = {},
        crossinline onColumnRemoved: (event: TableColumnModelEvent?) -> Unit = {},
        crossinline onColumnSelectionChanged: (event: ListSelectionEvent?) -> Unit = {}): TableColumnModelListener {
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

public fun DelayedTableModelListener(listener: (TableModelEvent) -> Unit): TableModelListener {
    return TableModelListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public fun DelayedTextListener(listener: (TextEvent) -> Unit): TextListener {
    return TextListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun DelayedTreeExpansionListener(
        crossinline onTreeCollapsed: (event: TreeExpansionEvent?) -> Unit = {},
        crossinline onTreeExpanded: (event: TreeExpansionEvent?) -> Unit = {}): TreeExpansionListener {
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

public inline fun DelayedTreeModelListener(
        crossinline onTreeNodesChanged: (event: TreeModelEvent?) -> Unit = {},
        crossinline onTreeNodesInserted: (event: TreeModelEvent?) -> Unit = {},
        crossinline onTreeNodesRemoved: (event: TreeModelEvent?) -> Unit = {},
        crossinline onTreeStructureChanged: (event: TreeModelEvent?) -> Unit = {}): TreeModelListener {
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

public fun DelayedTreeSelectionListener(listener: (TreeSelectionEvent) -> Unit): TreeSelectionListener {
    return TreeSelectionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun DelayedTreeWillExpandListener(
        crossinline onTreeWillCollapse: (event: TreeExpansionEvent?) -> Unit = {},
        crossinline onTreeWillExpand: (event: TreeExpansionEvent?) -> Unit = {}): TreeWillExpandListener {
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

public fun DelayedUndoableEditListener(listener: (UndoableEditEvent) -> Unit): UndoableEditListener {
    return UndoableEditListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public fun DelayedVetoableChangeListener(listener: (PropertyChangeEvent) -> Unit): VetoableChangeListener {
    return VetoableChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun DelayedWindowFocusListener(
        crossinline onWindowGainedFocus: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowLostFocus: (event: WindowEvent?) -> Unit = {}): WindowFocusListener {
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

public inline fun DelayedWindowListener(
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

public fun DelayedWindowStateListener(listener: (WindowEvent) -> Unit): WindowStateListener {
    return WindowStateListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
}

public inline fun AbstractButton.addDelayedActionListener(
        crossinline listener: suspend (ActionEvent) -> Unit): ActionListener {
    val listenerToAdd = ActionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addActionListener(listenerToAdd)
    return listenerToAdd
}

public inline fun AbstractButton.addDelayedItemListener(crossinline listener: suspend (ItemEvent) -> Unit): ItemListener {
    val listenerToAdd = ItemListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addItemListener(listenerToAdd)
    return listenerToAdd
}

public inline fun AbstractButton.addDelayedChangeListener(
        crossinline listener: suspend (ChangeEvent) -> Unit): ChangeListener {
    val listenerToAdd = ChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addChangeListener(listenerToAdd)
    return listenerToAdd
}

public inline fun JComboBox<*>.addDelayedActionListener(crossinline listener: suspend (ActionEvent) -> Unit): ActionListener {
    val listenerToAdd = ActionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addActionListener(listenerToAdd)
    return listenerToAdd
}

public inline fun JComboBox<*>.addDelayedItemListener(crossinline listener: suspend (ItemEvent) -> Unit): ItemListener {
    val listenerToAdd = ItemListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addItemListener(listenerToAdd)
    return listenerToAdd
}

public inline fun JSlider.addDelayedChangeListener(crossinline listener: suspend (ChangeEvent) -> Unit): ChangeListener {
    val listenerToAdd = ChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addChangeListener(listenerToAdd)
    return listenerToAdd
}

public inline fun Window.addDelayedWindowListener(
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

public inline fun  Window.addDelayedWindowFocusListener(
        crossinline onWindowGainedFocus: (event: WindowEvent?) -> Unit = {},
        crossinline onWindowLostFocus: (event: WindowEvent?) -> Unit = {}): WindowFocusListener {
    val listener = DelayedWindowFocusListener(onWindowGainedFocus, onWindowLostFocus)
    this.addWindowFocusListener(listener)
    return listener
}

public inline fun Component.addDelayedComponentListener(
        crossinline onComponentHidden: (event: ComponentEvent?) -> Unit = {},
        crossinline onComponentMoved: (event: ComponentEvent?) -> Unit = {},
        crossinline onComponentResized: (event: ComponentEvent?) -> Unit = {},
        crossinline onComponentShown: (event: ComponentEvent?) -> Unit = {}): ComponentListener {
    val listener = DelayedComponentListener(
            onComponentHidden, onComponentMoved, onComponentResized, onComponentShown)
    this.addComponentListener(listener)
    return listener
}

public inline fun Component.addDelayedFocusListener(
        crossinline onFocusGained: (event: FocusEvent?) -> Unit = {},
        crossinline onFocusLost: (event: FocusEvent?) -> Unit = {}): FocusListener {
    val listener = DelayedFocusListener(onFocusGained, onFocusLost)
    this.addFocusListener(listener)
    return listener
}

public inline fun Component.addDelayedHierarchyBoundsListener(
        crossinline onAncestorMoved: (event: HierarchyEvent?) -> Unit = {},
        crossinline onAncestorResized: (event: HierarchyEvent?) -> Unit = {}): HierarchyBoundsListener {
    val listener = DelayedHierarchyBoundsListener(onAncestorMoved, onAncestorResized)
    this.addHierarchyBoundsListener(listener)
    return listener
}

public inline fun Component.addDelayedHierarchyListener(
        crossinline listener: suspend (HierarchyEvent) -> Unit): HierarchyListener {
    val listenerToAdd = HierarchyListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addHierarchyListener(listenerToAdd)
    return listenerToAdd
}

public inline fun Component.addDelayedInputMethodListener(
        crossinline onCaretPositionChanged: (event: InputMethodEvent?) -> Unit = {},
        crossinline onInputMethodTextChanged: (event: InputMethodEvent?) -> Unit = {}): InputMethodListener {
    val listener = DelayedInputMethodListener(onCaretPositionChanged, onInputMethodTextChanged)
    this.addInputMethodListener(listener)
    return listener
}

public inline fun Component.addDelayedKeyListener(
        crossinline onKeyPressed: (event: KeyEvent?) -> Unit = {},
        crossinline onKeyReleased: (event: KeyEvent?) -> Unit = {},
        crossinline onKeyTyped: (event: KeyEvent?) -> Unit = {}): KeyListener {
    val listener = DelayedKeyListener(onKeyPressed, onKeyReleased, onKeyTyped)
    this.addKeyListener(listener)
    return listener
}

public inline fun Component.addDelayedMouseListener(
        crossinline onMouseClicked: (event: MouseEvent?) -> Unit = {},
        crossinline onMouseEntered: (event: MouseEvent?) -> Unit = {},
        crossinline onMouseExited: (event: MouseEvent?) -> Unit = {},
        crossinline onMousePressed: (event: MouseEvent?) -> Unit = {},
        crossinline onMouseReleased: (event: MouseEvent?) -> Unit = {}): MouseListener {
    val listener = DelayedMouseListener(
            onMouseClicked, onMouseEntered, onMouseExited, onMousePressed, onMouseReleased)
    this.addMouseListener(listener)
    return listener
}

public inline fun Component.addDelayedMouseMotionListener(
        crossinline onMouseDragged: (event: MouseEvent?) -> Unit = {},
        crossinline onMouseMoved: (event: MouseEvent?) -> Unit = {}): MouseMotionListener {
    val listener = DelayedMouseMotionListener(onMouseDragged, onMouseMoved)
    this.addMouseMotionListener(listener)
    return listener
}

public inline fun Component.addDelayedMouseWheelListener(
        crossinline listener: suspend (MouseWheelEvent) -> Unit): MouseWheelListener {
    val listenerToAdd = MouseWheelListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addMouseWheelListener(listenerToAdd)
    return listenerToAdd
}

public fun Component.addDelayedPropertyChangeListener(
        listener: suspend (PropertyChangeEvent) -> Unit): PropertyChangeListener {
    val listenerToAdd = PropertyChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addPropertyChangeListener(listenerToAdd)
    return listenerToAdd
}

public fun Component.addDelayedPropertyChangeListener(propertyName: String,
        listener: suspend (PropertyChangeEvent) -> Unit): PropertyChangeListener {
    val listenerToAdd = PropertyChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addPropertyChangeListener(propertyName, listenerToAdd)
    return listenerToAdd
}

public class TypedPropertyChangeEvent<T>(public val source: Any, public val propertyName: String,
        public val oldValue: T?, public val newValue: T?)

public inline fun <reified T> Component.addTypedDelayedPropertyChangeListener(propertyName: String,
        crossinline listener: suspend (TypedPropertyChangeEvent<T>) -> Unit) {
    this.addDelayedPropertyChangeListener(propertyName) { event ->
        listener.invoke(
            TypedPropertyChangeEvent(event.source,
                propertyName, event.oldValue as? T, event.newValue as? T)
        )
    }
}

public inline fun <reified T> Component.addTypedDelayedPropertyChangeListener(propertyClass: KProperty<*>,
        noinline listener: suspend (TypedPropertyChangeEvent<T>) -> Unit) {
    this.addDelayedPropertyChangeListener(propertyClass.name) { event ->
        listener.invoke(
            TypedPropertyChangeEvent(event.source,
                propertyClass.name, event.oldValue as? T, event.newValue as? T)
        )
    }
}

public inline fun AbstractListModel<*>.addDelayedListDataListener(
        crossinline onContentsChanged: (event: ListDataEvent?) -> Unit = {},
        crossinline onIntervalAdded: (event: ListDataEvent?) -> Unit = {},
        crossinline onIntervalRemoved: (event: ListDataEvent?) -> Unit = {}): ListDataListener {
    val listener =
            DelayedListDataListener(onContentsChanged, onIntervalAdded, onIntervalRemoved)
    this.addListDataListener(listener)
    return listener
}

public inline fun AbstractTableModel.addDelayedTableModelListener(
        crossinline listener: suspend (TableModelEvent) -> Unit): TableModelListener {
    val listenerToAdd = TableModelListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addTableModelListener(listenerToAdd)
    return listenerToAdd
}

public inline fun DefaultTreeModel.addDelayedTreeModelListener(
        crossinline onTreeNodesChanged: (event: TreeModelEvent?) -> Unit = {},
        crossinline onTreeNodesInserted: (event: TreeModelEvent?) -> Unit = {},
        crossinline onTreeNodesRemoved: (event: TreeModelEvent?) -> Unit = {},
        crossinline onTreeStructureChanged: (event: TreeModelEvent?) -> Unit = {}): TreeModelListener {
    val listener = DelayedTreeModelListener(onTreeNodesChanged, onTreeNodesInserted,
            onTreeNodesRemoved, onTreeStructureChanged)
    this.addTreeModelListener(listener)
    return listener
}

public inline fun DefaultTreeSelectionModel.addDelayedPropertyChangeListener(
        crossinline listener: suspend (PropertyChangeEvent) -> Unit): PropertyChangeListener {
    val listenerToAdd = PropertyChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addPropertyChangeListener(listenerToAdd)
    return listenerToAdd
}

public inline fun DefaultTreeSelectionModel.addDelayedTreeSelectionListener(
        crossinline listener: suspend (TreeSelectionEvent) -> Unit): TreeSelectionListener {
    val listenerToAdd = TreeSelectionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addTreeSelectionListener(listenerToAdd)
    return listenerToAdd
}

public inline fun DefaultListSelectionModel.addDelayedListSelectionListener(
        crossinline listener: suspend (ListSelectionEvent) -> Unit): ListSelectionListener {
    val listenerToAdd = ListSelectionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addListSelectionListener(listenerToAdd)
    return listenerToAdd
}

public inline fun DefaultSingleSelectionModel.addDelayedChangeListener(
        crossinline listener: suspend (ChangeEvent) -> Unit): ChangeListener {
    val listenerToAdd = ChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addChangeListener(listenerToAdd)
    return listenerToAdd
}

public inline fun Checkbox.addDelayedItemListener(
        crossinline listener: suspend (ItemEvent) -> Unit): ItemListener {
    val listenerToAdd = ItemListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addItemListener(listenerToAdd)
    return listenerToAdd
}

public inline fun Container.addDelayedContainerListener(
        crossinline onComponentAdded: (event: ContainerEvent?) -> Unit = {},
        crossinline onComponentRemoved: (event: ContainerEvent?) -> Unit = {}): ContainerListener {
    val listener = DelayedContainerListener(onComponentAdded, onComponentRemoved)
    this.addContainerListener(listener)
    return listener
}

public inline fun List.addDelayedActionListener(
        crossinline listener: suspend (ActionEvent) -> Unit): ActionListener {
    val listenerToAdd = ActionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addActionListener(listenerToAdd)
    return listenerToAdd
}

public inline fun MenuItem.addDelayedActionListener(
        crossinline listener: suspend (ActionEvent) -> Unit): ActionListener {
    val listenerToAdd = ActionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addActionListener(listenerToAdd)
    return listenerToAdd
}

public inline fun Scrollbar.addDelayedAdjustmentListener(
        crossinline listener: suspend (AdjustmentEvent) -> Unit): AdjustmentListener {
    val listenerToAdd = AdjustmentListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addAdjustmentListener(listenerToAdd)
    return listenerToAdd
}

public inline fun TextComponent.addDelayedTextListener(
        crossinline listener: suspend (TextEvent) -> Unit): TextListener {
    val listenerToAdd = TextListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addTextListener(listenerToAdd)
    return listenerToAdd
}

public inline fun TextField.addDelayedActionListener(
        crossinline listener: suspend (ActionEvent) -> Unit): ActionListener {
    val listenerToAdd = ActionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addActionListener(listenerToAdd)
    return listenerToAdd
}

public inline fun JComponent.addDelayedAncestorListener(
        crossinline onAncestorAdded: (event: AncestorEvent?) -> Unit = {},
        crossinline onAncestorRemoved: (event: AncestorEvent?) -> Unit = {},
        crossinline onAncestorMoved: (event: AncestorEvent?) -> Unit = {}): AncestorListener {
    val listener = DelayedAncestorListener(onAncestorAdded, onAncestorRemoved, onAncestorMoved)
    this.addAncestorListener(listener)
    return listener
}

public inline fun JComponent.addDelayedVetoableChangeListener(
        crossinline listener: suspend (PropertyChangeEvent) -> Unit): VetoableChangeListener {
    val listenerToAdd = VetoableChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addVetoableChangeListener(listenerToAdd)
    return listenerToAdd
}

public inline fun JList<*>.addDelayedListSelectionListener(
        crossinline listener: suspend (ListSelectionEvent) -> Unit): ListSelectionListener {
    val listenerToAdd = ListSelectionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addListSelectionListener(listenerToAdd)
    return listenerToAdd
}

public inline fun JTree.addDelayedTreeExpansionListener(
        crossinline onTreeCollapsed: (event: TreeExpansionEvent?) -> Unit = {},
        crossinline onTreeExpanded: (event: TreeExpansionEvent?) -> Unit = {}): TreeExpansionListener {
    val listener = DelayedTreeExpansionListener(onTreeCollapsed, onTreeExpanded)
    this.addTreeExpansionListener(listener)
    return listener
}

public inline fun JTree.addDelayedTreeSelectionListener(
        crossinline listener: suspend (TreeSelectionEvent) -> Unit): TreeSelectionListener {
    val listenerToAdd = TreeSelectionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addTreeSelectionListener(listenerToAdd)
    return listenerToAdd
}

public inline fun JTree.addDelayedTreeWillExpandListener(
        crossinline onTreeWillCollapse: (event: TreeExpansionEvent?) -> Unit = {},
        crossinline onTreeWillExpand: (event: TreeExpansionEvent?) -> Unit = {}): TreeWillExpandListener {
    val listener = DelayedTreeWillExpandListener(onTreeWillCollapse, onTreeWillExpand)
    this.addTreeWillExpandListener(listener)
    return listener
}

public inline fun JViewport.addDelayedChangeListener(
        crossinline listener: suspend (ChangeEvent) -> Unit): ChangeListener {
    val listenerToAdd = ChangeListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addChangeListener(listenerToAdd)
    return listenerToAdd
}

public inline fun JEditorPane.addDelayedHyperlinkListener(
        crossinline listener: suspend (HyperlinkEvent) -> Unit): HyperlinkListener {
    val listenerToAdd = HyperlinkListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addHyperlinkListener(listenerToAdd)
    return listenerToAdd
}

public inline fun JTextField.addDelayedActionListener(
        crossinline listener: suspend (ActionEvent) -> Unit): ActionListener {
    val listenerToAdd = ActionListener { event ->
        GlobalScope.launch(Dispatchers.Swing) {
            listener.invoke(event)
        }
    }
    this.addActionListener(listenerToAdd)
    return listenerToAdd
}
