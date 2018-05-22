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

import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.border.Border;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeNode;

/**
 * DnDCellRendererProxy is a TreeCellRenderer that proxies operations to a true
 * TreeCellRenderer, but that draws a border around specific TreeNodes.
 * 
 * @author Antonio Vieiro (antonio@antonioshome.net), $Author: kirillcool $
 */
class DnDCellRendererProxy extends Component implements TreeCellRenderer {
	private TreeCellRenderer originalTreeCellRenderer;
	private DnDBorderFactory borderFactory;
	private TreeNode draggedNode;
	private TreeNode dropNode;
	private int dropNodeRow;
	private boolean fetchBorder;
	private Border originalBorder;

	/**
	 * Creates a new instance of DragAndDropCellRenderer.
	 * 
	 * @param trueCellRenderer
	 *            the original cell renderer.
	 */
	public DnDCellRendererProxy(TreeCellRenderer trueCellRenderer) {
		this.originalTreeCellRenderer = trueCellRenderer;
		this.borderFactory = new DnDBorderFactory();
		this.fetchBorder = true;
	}

	public TreeCellRenderer getOriginalTreeCellRenderer() {
		return this.originalTreeCellRenderer;
	}

	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean selected, boolean expanded, boolean leaf, int row,
			boolean hasFocus) {
		Component c = this.originalTreeCellRenderer
				.getTreeCellRendererComponent(tree, value, selected, expanded,
						leaf, row, hasFocus);

		TreeNode nodeToRender = (TreeNode) value;

		if (c instanceof JComponent) {
			if (this.fetchBorder) {
				this.fetchBorder = false;
				this.originalBorder = ((JComponent) c).getBorder();
			}
			// TODO: This *REMOVES* the border in c.
			// TODO: Use compound borders to draw BOTH borders.
			JComponent jComponent = (JComponent) c;
			if (nodeToRender.equals(this.dropNode)) {
				Border border = null;
				if (this.isDropAllowed()) {
					border = this.borderFactory.getDropAllowedBorder();
					this.dropNodeRow = row;
				} else {
					border = this.borderFactory.getDropNotAllowedBorder();
					this.dropNodeRow = -2;
				}
				jComponent.setBorder(border);
			} else if (this.isDropAllowed() && (row == this.dropNodeRow + 1)) {
				jComponent.setBorder(this.borderFactory.getOffsetBorder());
			} else {
				jComponent.setBorder(this.originalBorder);
				this.dropNodeRow = -2;
			}
		}
		return c;
	}

	/**
	 * Getter for property draggedNode.
	 * 
	 * @return Value of property draggedNode.
	 */
	public TreeNode getDraggedNode() {
		return this.draggedNode;
	}

	/**
	 * Setter for property draggedNode.
	 * 
	 * @param draggedNode
	 *            New value of property draggedNode.
	 */
	public void setDraggedNode(TreeNode draggedNode) {
		this.draggedNode = draggedNode;
	}

	/**
	 * Getter for property dropNode.
	 * 
	 * @return Value of property dropNode.
	 */
	public TreeNode getDropNode() {
		return this.dropNode;
	}

	/**
	 * Setter for property dropNode.
	 * 
	 * @param dropNode
	 *            New value of property dropNode.
	 */
	public void setDropNode(TreeNode dropNode) {
		this.dropNode = dropNode;
		if (dropNode == null)
			this.dropNodeRow = -2;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[DnDCellRendererProxy for : ").append(
				this.originalTreeCellRenderer).append("]");
		return sb.toString();
	}

	/**
	 * Holds value of property dropAllowed.
	 */
	private boolean dropAllowed;

	/**
	 * Getter for property dropAllowed.
	 * 
	 * @return Value of property dropAllowed.
	 */
	public boolean isDropAllowed() {
		return this.dropAllowed;
	}

	/**
	 * Setter for property dropAllowed.
	 * 
	 * @param dropAllowed
	 *            New value of property dropAllowed.
	 */
	public void setDropAllowed(boolean dropAllowed) {
		this.dropAllowed = dropAllowed;
		if (!dropAllowed)
			this.dropNodeRow = -2;
	}
}
