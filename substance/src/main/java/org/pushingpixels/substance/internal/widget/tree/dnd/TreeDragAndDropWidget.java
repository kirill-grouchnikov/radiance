/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.substance.internal.widget.tree.dnd;

import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragGestureRecognizer;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetContext;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.EventListener;

import javax.swing.JTree;
import javax.swing.event.EventListenerList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;

/**
 * TreeWrapper is used to handle drag and drop and popup menus in any JTree.
 * 
 * @author Antonio Vieiro (antonio@antonioshome.net)
 * @author Kirill Grouchnikov
 */
public class TreeDragAndDropWidget extends SubstanceWidget<JTree> {
	/**
	 * This to avoid excesive creation of objects in invocation.
	 */
	private static Class[] EMPTY_CLASS_ARRAY = new Class[0];

	/**
	 * This to avoid excessive reflection to find the "getTransferable" method.
	 */
	private static Method getTransferableMethod = null;

	/**
	 * This to avoid excesive creation of objects in invocation.
	 */
	private static Object[] EMPTY_OBJECT_ARRAY = new Object[0];

	protected DnDCellRendererProxy rendererProxy;

	protected DragSource dragSource;

	protected DropTarget dropTarget;

	protected MutableTreeNode dropNode;

	protected EventListenerList listeners;

	protected PropertyChangeListener propertyChangeListener;

	protected PropertyChangeListener cellRendererChangeListener;

	protected TreeDropTargetListener dropListener;

	protected TreeDragGestureListener gestureListener;

	protected DragGestureRecognizer dragGestureRecognizer;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.lafwidget.LafWidgetAdapter#installListeners()
	 */
	@Override
	public void installListeners() {
		this.listeners = new EventListenerList();

		this.propertyChangeListener = (PropertyChangeEvent evt) -> {
			if (SubstanceSynapse.TREE_AUTO_DND_SUPPORT.equals(evt.getPropertyName())) {
				Object oldValue = evt.getOldValue();
				Object newValue = evt.getNewValue();
				boolean hadDnd = false;
				if (oldValue instanceof Boolean)
					hadDnd = ((Boolean) oldValue).booleanValue();
				boolean hasDnd = false;
				if (newValue instanceof Boolean)
					hasDnd = ((Boolean) newValue).booleanValue();

				if (!hadDnd && hasDnd
						&& TreeDragAndDropWidget.this.jcomp.isEnabled()) {
					TreeDragAndDropWidget.this.installDnDSupport();
				}
				if (hadDnd && !hasDnd) {
					TreeDragAndDropWidget.this.uninstallDnDSupport();
				}
			}

			if ("enabled".equals(evt.getPropertyName())) {
				boolean wasEnabled = ((Boolean) evt.getOldValue()).booleanValue();
				boolean isEnabled = ((Boolean) evt.getNewValue()).booleanValue();
				if (!wasEnabled && isEnabled) {
					if (WidgetUtilities
							.hasAutomaticDnDSupport(TreeDragAndDropWidget.this.jcomp))
						TreeDragAndDropWidget.this.installDnDSupport();
				}
				if (wasEnabled && !isEnabled)
					TreeDragAndDropWidget.this.uninstallDnDSupport();
			}
		};
		this.jcomp.addPropertyChangeListener(this.propertyChangeListener);

		if (this.jcomp.isEnabled()
				&& WidgetUtilities.hasAutomaticDnDSupport(this.jcomp))
			this.installDnDSupport();
	}

	private void installDnDSupport() {
		if (this.cellRendererChangeListener != null) {
			// already installed.
			return;
		}

		this.cellRendererChangeListener = (PropertyChangeEvent evt) -> {
			String name = evt.getPropertyName();

			if (name.equals(JTree.CELL_RENDERER_PROPERTY)) {
				TreeCellRenderer renderer = TreeDragAndDropWidget.this.jcomp
						.getCellRenderer();
				if (!(renderer instanceof DnDCellRendererProxy)) {
					TreeDragAndDropWidget.this.rendererProxy = new DnDCellRendererProxy(
							renderer);
					TreeDragAndDropWidget.this.jcomp
							.setCellRenderer(TreeDragAndDropWidget.this.rendererProxy);
					TreeDragAndDropWidget.this.jcomp.repaint();
				} else
					TreeDragAndDropWidget.this.rendererProxy = (DnDCellRendererProxy) renderer;
			}
		};

		this.jcomp.addPropertyChangeListener(this.cellRendererChangeListener);
		if (this.jcomp.getCellRenderer() != null) {
			this.jcomp.setCellRenderer(new DnDCellRendererProxy(this.jcomp
					.getCellRenderer()));
		}
		this.dragSource = new DragSource();
		this.gestureListener = new TreeDragGestureListener();
		this.dragGestureRecognizer = this.dragSource
				.createDefaultDragGestureRecognizer(this.jcomp,
						DnDConstants.ACTION_COPY_OR_MOVE, this.gestureListener);
		this.dropListener = new TreeDropTargetListener();
		this.dropTarget = new AutoScrollingTreeDropTarget(this.jcomp,
				this.dropListener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.lafwidget.LafWidgetAdapter#uninstallListeners()
	 */
	@Override
	public void uninstallListeners() {
		this.jcomp.removePropertyChangeListener(this.propertyChangeListener);
		this.propertyChangeListener = null;

		this.uninstallDnDSupport();
	}

	private void uninstallDnDSupport() {
		if (this.cellRendererChangeListener != null) {
			this.jcomp
					.removePropertyChangeListener(this.cellRendererChangeListener);
			this.cellRendererChangeListener = null;
		}

		TreeCellRenderer tcl = this.jcomp.getCellRenderer();
		if (tcl instanceof DnDCellRendererProxy) {
			TreeCellRenderer origRenderer = ((DnDCellRendererProxy) tcl)
					.getOriginalTreeCellRenderer();
			this.jcomp.setCellRenderer(origRenderer);
		}

		if (this.dropListener != null) {
			this.dropTarget.removeDropTargetListener(this.dropListener);
			this.dropListener = null;
			this.jcomp.setDropTarget(null);
		}

		if (this.dragGestureRecognizer != null) {
			this.dragGestureRecognizer
					.removeDragGestureListener(this.gestureListener);
			this.gestureListener = null;
			this.dragGestureRecognizer = null;
		}
	}

	/**
	 * Internal class that implements DragGestureListener.
	 */
	class TreeDragGestureListener implements DragGestureListener {
		public void dragGestureRecognized(DragGestureEvent dge) {
			// If tree is disabled then discard drag from it
			if (!TreeDragAndDropWidget.this.jcomp.isEnabled())
				return;

			// Select the node that the user is trying to drag, if any.
			TreePath draggedPath = TreeDragAndDropWidget.this.jcomp
					.getClosestPathForLocation(dge.getDragOrigin().x, dge
							.getDragOrigin().y);
			if (draggedPath == null)
				return;
			TreeNode node = (TreeNode) draggedPath.getLastPathComponent();
			if ((node instanceof MutableTreeNode) && (node.getParent() != null)
					&& (node.getParent() instanceof MutableTreeNode))
				;
			else
				return;

			// Prepare the node for transfer
			TransferableTreeNode transferableNode = new TransferableTreeNode(
					TreeDragAndDropWidget.this.jcomp, (MutableTreeNode) node,
					TreeDragAndDropWidget.this.jcomp.isExpanded(draggedPath));
			TreeDragAndDropWidget.this.rendererProxy.setDraggedNode(node);

			// Initialize the drag. If isDragImageSupported then build a
			// transparent image
			BufferedImage image = null;
			Point imageOffset = null;
			// Create an image with the dragged node.
			TreeCellRenderer renderer = TreeDragAndDropWidget.this.rendererProxy
					.getOriginalTreeCellRenderer();
			Rectangle dragBounds = TreeDragAndDropWidget.this.jcomp
					.getPathBounds(draggedPath);
			imageOffset = new Point(dge.getDragOrigin().x - dragBounds.x, dge
					.getDragOrigin().y
					- dragBounds.y);
			Component component = renderer.getTreeCellRendererComponent(
					TreeDragAndDropWidget.this.jcomp, node, false,
					TreeDragAndDropWidget.this.jcomp.isExpanded(draggedPath),
					node.isLeaf(), 0, false);
			component.setSize(dragBounds.width, dragBounds.height);
			image = new BufferedImage(dragBounds.width, dragBounds.height,
					BufferedImage.TYPE_INT_ARGB);
			Graphics2D g2d = image.createGraphics();
			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC, 0.75f));
			component.paint(g2d);
			g2d.dispose();

			// Initiate the drag
			if (DragSource.isDragImageSupported()) {
				TreeDragAndDropWidget.this.dragSource.startDrag(dge, null,
						image, imageOffset, transferableNode,
						new TreeDragSourceListener());
			} else {
				TreeDragAndDropWidget.this.dragSource.startDrag(dge, null,
						transferableNode, new TreeDragSourceListener());
			}
		}
	}

	/**
	 * Internal class that implements DragSourceListener.
	 */
	class TreeDragSourceListener implements DragSourceListener {
		public void dragExit(DragSourceEvent dse) {
		}

		public void dropActionChanged(DragSourceDragEvent dsde) {
		}

		public void dragOver(DragSourceDragEvent dsde) {
		}

		public void dragEnter(DragSourceDragEvent dsde) {
		}

		public void dragDropEnd(DragSourceDropEvent dsde) {
			TreeDragAndDropWidget.this.resetDragAndDrop();
		}
	}

	class TreeDropTargetListener implements DropTargetListener {
		public void drop(DropTargetDropEvent dtde) {
			TreePath dropPath = TreeDragAndDropWidget.this.jcomp
					.getClosestPathForLocation(dtde.getLocation().x, dtde
							.getLocation().y);

			if (!TreeDragAndDropWidget.this.jcomp.isEnabled()
					|| (dropPath == null)) {
				dtde.rejectDrop();
				dtde.dropComplete(false);
				TreeDragAndDropWidget.this.resetDragAndDrop();
				return;
			}

			TreeDragAndDropWidget.this.dropNode = (MutableTreeNode) dropPath
					.getLastPathComponent();

			// Handle dropping java JVM local objects (tree nodes)
			try {
				dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
				// Are we dropping a JVM local object?
				TransferableTreeNode ttn = (TransferableTreeNode) dtde
						.getTransferable().getTransferData(
								TransferableTreeNode
										.getJavaJVMLocalObjectFlavor());
				JTree sourceTree = ttn.getSourceTree();
				MutableTreeNode sourceNode = ttn.getSourceNode();
				if (TreeDragAndDropWidget.this.mayDropHere(sourceTree,
						sourceNode, TreeDragAndDropWidget.this.dropNode)) {
					dtde
							.dropComplete(this
									.dropNodes(
											ttn.getSourceTree(),
											ttn.getSourceNode(),
											TreeDragAndDropWidget.this.jcomp,
											TreeDragAndDropWidget.this.dropNode,
											(dtde.getDropAction() & DnDConstants.ACTION_MOVE) != 0));
					if (ttn.isNodeWasExpanded()) {
						DefaultTreeModel targetModel = (DefaultTreeModel) TreeDragAndDropWidget.this.jcomp
								.getModel();
						TreeDragAndDropWidget.this.jcomp
								.expandPath(new TreePath(targetModel
										.getPathToRoot(ttn.getSourceNode())));
					}

					TreeDragAndDropWidget.this.resetDragAndDrop();
				} else {
					try {
						dtde.rejectDrop();
					} catch (Exception e) {
						// An exception may be thrown here if the user leaves
						// and enters the window.
						// This is an exceptional case.
					}
					dtde.dropComplete(false);
					TreeDragAndDropWidget.this.resetDragAndDrop();
					return;
				}
			} catch (UnsupportedFlavorException ufe) {
				// So this is not a JVM local object, maybe it's a String...
				try {
					String droppedString = (String) dtde.getTransferable()
							.getTransferData(DataFlavor.stringFlavor);
					if (TreeDragAndDropWidget.this.mayDropHere(droppedString,
							TreeDragAndDropWidget.this.jcomp, dropPath)) {
						dtde.dropComplete(this.dropString(droppedString));
						TreeDragAndDropWidget.this.resetDragAndDrop();
					} else {
						dtde.rejectDrop();
						dtde.dropComplete(false);
						TreeDragAndDropWidget.this.resetDragAndDrop();
						return;
					}
				} catch (Exception exception) {
					dtde.rejectDrop();
					dtde.dropComplete(false);
					TreeDragAndDropWidget.this.resetDragAndDrop();
					return;
				}
			} catch (Exception e) {
				// ClassCastException: So this is a JVM local object but not a
				// TransferableTreeNode, right? Well, then just discard
				// IOException: So there's a problem deserializing this, right?
				// Well, then just discard
				e.printStackTrace();
				dtde.rejectDrop();
				dtde.dropComplete(true);
				TreeDragAndDropWidget.this.resetDragAndDrop();
				return;
			}
		}

		private boolean dropString(String droppedString) {
			// Get the mutable TreeModel
			DefaultTreeModel model = (DefaultTreeModel) TreeDragAndDropWidget.this.jcomp
					.getModel();

			// Ask the listeners to handle this drop
			boolean doItOurselves = true;
			EventListener[] listeners = TreeDragAndDropWidget.this.listeners
					.getListeners(StringTreeDnDListener.class);
			if ((listeners != null) && (listeners.length > 0)) {
				try {
					StringTreeDnDEvent event = new StringTreeDnDEvent(
							droppedString, TreeDragAndDropWidget.this.jcomp,
							TreeDragAndDropWidget.this.dropNode);
					for (int i = 0; i < listeners.length; i++) {
						((StringTreeDnDListener) listeners[i]).drop(event);
					}
				} catch (DnDVetoException exception) {
					doItOurselves = true;
				}
			}
			if (doItOurselves) {
				DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(
						droppedString);

				MutableTreeNode parent = (MutableTreeNode) TreeDragAndDropWidget.this.dropNode
						.getParent();
				if (TreeDragAndDropWidget.this.dropNode.isLeaf()) {
					int index = parent
							.getIndex(TreeDragAndDropWidget.this.dropNode);
					model.insertNodeInto(newNode, parent, index + 1);
				} else {
					model.insertNodeInto(newNode,
							TreeDragAndDropWidget.this.dropNode, 0); // dropNode.getChildCount()
					// );
				}
			}
			return true;
		}

		private boolean dropNodes(JTree aSourceTree,
				MutableTreeNode aSourceNode, JTree aTargetTree,
				MutableTreeNode aDropNode, boolean move) {
			// Get the mutable TreeModel
			DefaultTreeModel sourceModel = (DefaultTreeModel) aSourceTree
					.getModel();
			DefaultTreeModel targetModel = (DefaultTreeModel) aTargetTree
					.getModel();

			boolean doItOurselves = true;
			EventListener[] listeners = TreeDragAndDropWidget.this.listeners
					.getListeners(TreeTreeDnDListener.class);
			if ((listeners != null) && (listeners.length > 0)) {
				try {
					TreeTreeDnDEvent event = new TreeTreeDnDEvent(aSourceTree,
							aSourceNode, aTargetTree, aDropNode);
					for (int i = 0; i < listeners.length; i++) {
						((TreeTreeDnDListener) listeners[i]).drop(event);
					}
				} catch (DnDVetoException exception) {
					doItOurselves = false;
				}
			}
			if (doItOurselves) {
				MutableTreeNode sourceNodeCopy = aSourceNode;
				if (move) {
					sourceModel.removeNodeFromParent(aSourceNode);
				} else {
					sourceNodeCopy = this.recursivelyCopyNodes(targetModel,
							aSourceNode);
				}
				// Attach the draggedNode into the new parent
				MutableTreeNode parent = (MutableTreeNode) aDropNode
						.getParent();
				if (aDropNode.isLeaf() && (parent != null)) {
					int index = parent.getIndex(aDropNode);
					targetModel.insertNodeInto(sourceNodeCopy, parent,
							index + 1);
				} else {
					targetModel.insertNodeInto(sourceNodeCopy, aDropNode, 0);// aDropNode.getChildCount()
					// );
				}
			}
			return true;
		}

		private DefaultMutableTreeNode recursivelyCopyNodes(
				DefaultTreeModel aModel, TreeNode aNode) {
			DefaultMutableTreeNode copy = new DefaultMutableTreeNode(aNode
					.toString());
			copy.setAllowsChildren(aNode.getAllowsChildren());
			if (aNode.getChildCount() != 0) {
				Enumeration children = aNode.children();
				while (children.hasMoreElements()) {
					TreeNode child = (TreeNode) children.nextElement();
					DefaultMutableTreeNode childCopy = this
							.recursivelyCopyNodes(aModel, child);
					aModel
							.insertNodeInto(childCopy, copy, copy
									.getChildCount());
					childCopy.setParent(copy);
				}
			}
			return copy;
		}

		public void dragExit(DropTargetEvent dte) {
			TreeDragAndDropWidget.this.dropNode = null;
			TreeDragAndDropWidget.this.rendererProxy.setDropNode(null);
			TreeDragAndDropWidget.this.jcomp.repaint();
		}

		public void dropActionChanged(DropTargetDragEvent dtde) {
		}

		private Transferable getTransferable(DropTargetDragEvent dtde) {
			try {
				DropTargetContext context = dtde.getDropTargetContext();
				if (TreeDragAndDropWidget.getTransferableMethod == null) {
					TreeDragAndDropWidget.getTransferableMethod = context
							.getClass().getDeclaredMethod("getTransferable",
									TreeDragAndDropWidget.EMPTY_CLASS_ARRAY);
					TreeDragAndDropWidget.getTransferableMethod
							.setAccessible(true);
				}
				return (Transferable) TreeDragAndDropWidget.getTransferableMethod
						.invoke(context,
								TreeDragAndDropWidget.EMPTY_OBJECT_ARRAY);
			} catch (Exception e) {
				e.printStackTrace(System.err);
				return null;
			}
		}

		/** This node to avoid too many invocations to dragOver */
		private TreeNode lastDragOverNode = null;

		public void dragOver(DropTargetDragEvent dtde) {
			if (!TreeDragAndDropWidget.this.jcomp.isEnabled()) {
				dtde.rejectDrag();
				return;
			}

			// Is this a valid node for dropping?
			TreePath dropPath = TreeDragAndDropWidget.this.jcomp
					.getClosestPathForLocation(dtde.getLocation().x, dtde
							.getLocation().y);

			TreeNode currentDropNode = (TreeNode) dropPath
					.getLastPathComponent();

			if ((dropPath == null) || (currentDropNode == null)
					|| currentDropNode.equals(this.lastDragOverNode)) {
				return;
			} else {
				this.lastDragOverNode = currentDropNode;
			}

			Transferable transferable = this.getTransferable(dtde); // dtde.getTransferable();

			boolean mayDropHere = false;

			try {
				// WARNING: getTransferable available only on JDK 1.5
				TransferableTreeNode transferredNode = (TransferableTreeNode) transferable
						.getTransferData(TransferableTreeNode
								.getJavaJVMLocalObjectFlavor());
				JTree sourceTree = transferredNode.getSourceTree();
				MutableTreeNode sourceNode = transferredNode.getSourceNode();
				if (TreeDragAndDropWidget.this.mayDropHere(sourceTree,
						sourceNode, dropPath)) {
					TreeDragAndDropWidget.this.dropNode = (MutableTreeNode) dropPath
							.getLastPathComponent();
					if (!TreeDragAndDropWidget.this.jcomp.isExpanded(dropPath))
						TreeDragAndDropWidget.this.jcomp.expandPath(dropPath);
					mayDropHere = true;
				} else {
					TreeDragAndDropWidget.this.dropNode = null;
				}
			} catch (UnsupportedFlavorException ufe) {
				// Oh, this is not a TransferableTreeNode, so maybe is a String,
				// maybe?
				try {
					String sourceText = (String) transferable
							.getTransferData(DataFlavor.stringFlavor);
					if (TreeDragAndDropWidget.this.mayDropHere(sourceText,
							TreeDragAndDropWidget.this.jcomp, dropPath)) {
						TreeDragAndDropWidget.this.dropNode = (MutableTreeNode) dropPath
								.getLastPathComponent();
						if (!TreeDragAndDropWidget.this.jcomp
								.isExpanded(dropPath))
							TreeDragAndDropWidget.this.jcomp
									.expandPath(dropPath);
						mayDropHere = true;
					} else {
						TreeDragAndDropWidget.this.dropNode = null;
					}
				} catch (Exception e) {
					// Well, whatever, just discard
					TreeDragAndDropWidget.this.dropNode = null;
				}
			} catch (Exception e) {
				// IOException: Oh, there's a problem with serialization. Maybe
				// a classloader issue? Well, ummm... just discard this and say
				// no
				// ClassCastException: Oh, user is transferring a JVM object but
				// not a TransferableTreeNode, well, umm... just discard and say
				// no
				TreeDragAndDropWidget.this.dropNode = null;
			}
			TreeDragAndDropWidget.this.rendererProxy
					.setDropAllowed(mayDropHere);
			TreeDragAndDropWidget.this.rendererProxy
					.setDropNode((TreeNode) dropPath.getLastPathComponent());
			TreeDragAndDropWidget.this.jcomp.repaint();
			if (!mayDropHere) {
				dtde.rejectDrag();
			} else {
				dtde.acceptDrag(dtde.getDropAction());
			}
			TreeDragAndDropWidget.this.jcomp.repaint();
		}

		public void dragEnter(DropTargetDragEvent dtde) {
			this.dragOver(dtde);
			// dtde.acceptDrag(DnDConstants.ACTION_COPY_OR_MOVE );
		}
	}

	/**
	 * Invoked to decide if a given String can be dropped in the last path
	 * component of the given path.
	 * 
	 * @param aSourceString
	 *            the String being dragged.
	 * @param aPath
	 *            the path to drop into.
	 * @return true to allow the drop operation, false otherwise.
	 */
	private boolean mayDropHere(String aSourceString, JTree aTargetTree,
			TreePath aPath) {
		return this.mayDropHere(aSourceString, aTargetTree, (TreeNode) aPath
				.getLastPathComponent());
	}

	/**
	 * Invoked to decide if a given String can be dropped in the last path
	 * component of the given path.
	 * 
	 * @param aSourceString
	 *            the String being dragged.
	 * @param aPath
	 *            the path to drop into.
	 * @return true to allow the drop operation, false otherwise.
	 */
	private boolean mayDropHere(String aSourceString, JTree aTargetTree,
			TreeNode aNode) {
		EventListener[] listeners = this.listeners
				.getListeners(StringTreeDnDListener.class);
		if ((listeners != null) && (listeners.length > 0)) {
			try {
				StringTreeDnDEvent event = new StringTreeDnDEvent(
						aSourceString, aTargetTree, aNode);
				for (int i = 0; i < listeners.length; i++) {
					((StringTreeDnDListener) listeners[i]).mayDrop(event);
				}
			} catch (DnDVetoException exception) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Invoked to decide if draggedNode can be dropped in the last path
	 * component of the given path.
	 * 
	 * @param aSourceTree
	 *            the source tree.
	 * @param aSourceNode
	 *            the source node.
	 * @param aPath
	 *            the path to drop into.
	 * @return true to allow the drop operation, false otherwise.
	 */
	private boolean mayDropHere(JTree aSourceTree, MutableTreeNode aSourceNode,
			TreePath aPath) {
		if (aPath == null)
			return false;
		return this.mayDropHere(aSourceTree, aSourceNode, (TreeNode) aPath
				.getLastPathComponent());
	}

	/**
	 * Invoked to decide if draggedNode can be dropped into aNode.
	 * 
	 * @param aSourceTree
	 *            the source tree.
	 * @param aSourceNode
	 *            the source node.
	 * @param aNode
	 *            the node to drop into.
	 * @return true to allow the drop operation, false to avoid it.
	 */
	private boolean mayDropHere(JTree aSourceTree, MutableTreeNode aSourceNode,
			TreeNode aNode) {
		boolean mayDropHere = (aNode != aSourceNode)
				&& (aNode instanceof MutableTreeNode)
				&& ((aNode.getParent() == null) || (aNode.getParent() instanceof MutableTreeNode))
				&& (this.jcomp.getModel() instanceof DefaultTreeModel)
				&& !((this.jcomp == aSourceTree) && TreeDragAndDropWidget
						.isAncestorOf(aSourceNode, aNode));

		if (mayDropHere) {
			// Ask listeners
			EventListener[] listeners = this.listeners
					.getListeners(TreeTreeDnDListener.class);
			if ((listeners != null) && (listeners.length > 0)) {
				try {
					TreeTreeDnDEvent event = new TreeTreeDnDEvent(aSourceTree,
							aSourceNode, this.jcomp, aNode);
					for (int i = 0; i < listeners.length; i++) {
						((TreeTreeDnDListener) listeners[i]).mayDrop(event);
					}
				} catch (DnDVetoException exception) {
					mayDropHere = false;
				}
			}
		}

		return mayDropHere;
	}

	/**
	 * See if aPossibleParent is ancestor of aNode
	 */
	private static boolean isAncestorOf(TreeNode aPossibleParent, TreeNode aNode) {
		if ((aPossibleParent == null) || (aNode.getParent() == null))
			return false;
		else if (aNode.getParent() == aPossibleParent)
			return true;
		else
			return TreeDragAndDropWidget.isAncestorOf(aPossibleParent, aNode
					.getParent());
	}

	private void resetDragAndDrop() {
		this.dropNode = null;
		this.rendererProxy.setDraggedNode(null);
		this.rendererProxy.setDropAllowed(false);
		this.rendererProxy.setDropNode(null);
		this.jcomp.repaint();
	}
}
