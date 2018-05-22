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

import java.awt.Point;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetListener;

import javax.swing.JTree;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;

class AutoScrollingTreeDropTarget extends DropTarget {
	private JViewport viewport;
	private int scrollUnits;
	private JTree tree;

	AutoScrollingTreeDropTarget(JTree aTree, DropTargetListener listener) {
		super(aTree, DnDConstants.ACTION_COPY_OR_MOVE, listener);
		this.viewport = (JViewport) SwingUtilities.getAncestorOfClass(
				JViewport.class, aTree);
		this.scrollUnits = Math.max(aTree.getRowHeight(), 16);
		this.tree = aTree;
	}

	private Point lastDragCursorLocn = new Point(0, 0);

	protected void updateAutoscroll(Point dragCursorLocn) {
		if (this.lastDragCursorLocn.equals(dragCursorLocn))
			return;
		else
			this.lastDragCursorLocn.setLocation(dragCursorLocn);
		this.doAutoscroll(dragCursorLocn);
	}

	protected void initializeAutoscrolling(Point p) {
		this.doAutoscroll(p);
	}

	protected void clearAutoscroll() {
	}

	private static final int AUTOSCROLL_MARGIN = 16;

	protected void doAutoscroll(Point aPoint) {
		if (this.viewport == null)
			return;

		Point treePosition = this.viewport.getViewPosition();
		int vH = this.viewport.getExtentSize().height;
		int vW = this.viewport.getExtentSize().width;
		Point nextPoint = null;
		if ((aPoint.y - treePosition.y) < AutoScrollingTreeDropTarget.AUTOSCROLL_MARGIN) {
			nextPoint = new Point(treePosition.x, Math.max(treePosition.y
					- this.scrollUnits, 0));
		} else if (treePosition.y + vH - aPoint.y < AutoScrollingTreeDropTarget.AUTOSCROLL_MARGIN) {
			nextPoint = new Point(treePosition.x, Math.min(aPoint.y
					+ AutoScrollingTreeDropTarget.AUTOSCROLL_MARGIN, this.tree
					.getHeight()
					- vH));
		} else if (aPoint.x - treePosition.x < AutoScrollingTreeDropTarget.AUTOSCROLL_MARGIN) {
			nextPoint = new Point(Math.max(treePosition.x
					- AutoScrollingTreeDropTarget.AUTOSCROLL_MARGIN, 0),
					treePosition.y);
		} else if (treePosition.x + vW - aPoint.x < AutoScrollingTreeDropTarget.AUTOSCROLL_MARGIN) {
			nextPoint = new Point(Math.min(treePosition.x
					+ AutoScrollingTreeDropTarget.AUTOSCROLL_MARGIN, this.tree
					.getWidth()
					- vW), treePosition.y);
		}
		if (nextPoint != null)
			this.viewport.setViewPosition(nextPoint);
	}
}