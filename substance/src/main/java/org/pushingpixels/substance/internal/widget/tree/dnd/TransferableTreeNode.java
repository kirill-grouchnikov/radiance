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

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.JTree;
import javax.swing.tree.MutableTreeNode;

/**
 * TransferableTreeNode is a Transferable object used to transfer TreeNodes or
 * Strings in drag and drop operations.
 * 
 * @author Antonio Vieiro (antonio@antonioshome.net), $Author: kirillcool $
 */
class TransferableTreeNode implements Transferable {
	/**
	 * The local JVM DataFlavor.
	 */
	private static DataFlavor javaJVMLocalObjectFlavor;
	/**
	 * The supported data flavors.
	 */
	private static DataFlavor[] supportedDataFlavors;

	/**
	 * Returns the Java JVM LocalObject Flavor.
	 */
	public static DataFlavor getJavaJVMLocalObjectFlavor() {
		if (TransferableTreeNode.javaJVMLocalObjectFlavor == null) {
			try {
				TransferableTreeNode.javaJVMLocalObjectFlavor = new DataFlavor(
						DataFlavor.javaJVMLocalObjectMimeType);
			} catch (ClassNotFoundException cnfe) {
				System.err.println("Cannot create JVM Local Object Flavor "
						+ cnfe.getMessage());
			}
		}
		return TransferableTreeNode.javaJVMLocalObjectFlavor;
	}

	/**
	 * Returns the supported data flavors.
	 */
	private static DataFlavor[] getSupportedDataFlavors() {
		if (TransferableTreeNode.supportedDataFlavors == null) {
			DataFlavor localJVMFlavor = TransferableTreeNode
					.getJavaJVMLocalObjectFlavor();
			TransferableTreeNode.supportedDataFlavors = localJVMFlavor == null ? new DataFlavor[] { DataFlavor.stringFlavor }
					: new DataFlavor[] { localJVMFlavor,
							DataFlavor.stringFlavor };
		}
		return TransferableTreeNode.supportedDataFlavors;
	}

	/**
	 * Creates a new instance of TransferableTreeNode.
	 * 
	 * @param aTree
	 *            the JTree that contains de dragged node.
	 * @param aNode
	 *            the MutableTreeNode in JTree that is to be dragged.
	 * @param wasExpanded
	 *            true if the source node was expanded, false otherwise.
	 */
	public TransferableTreeNode(JTree aTree, MutableTreeNode aNode,
			boolean wasExpanded) {
		this.setSourceTree(aTree);
		this.setSourceNode(aNode);
		this.setNodeWasExpanded(wasExpanded);
	}

	public boolean isDataFlavorSupported(DataFlavor flavor) {
		DataFlavor[] flavors = TransferableTreeNode.getSupportedDataFlavors();
		for (int i = 0; i < flavors.length; i++) {
			if (flavor.equals(flavors[i]))
				return true;
		}
		return false;
	}

	public Object getTransferData(DataFlavor flavor)
			throws UnsupportedFlavorException, IOException {
		if (flavor.equals(TransferableTreeNode.javaJVMLocalObjectFlavor)) {
			return this;
		} else if (flavor.equals(DataFlavor.stringFlavor)) {
			return this.getSourceNode().toString();
		} else
			throw new UnsupportedFlavorException(flavor);
	}

	public DataFlavor[] getTransferDataFlavors() {
		return TransferableTreeNode.getSupportedDataFlavors();
	}

	/**
	 * Holds value of property sourceTree.
	 */
	private JTree sourceTree;

	/**
	 * Getter for property sourceTree.
	 * 
	 * @return Value of property sourceTree.
	 */
	public JTree getSourceTree() {
		return this.sourceTree;
	}

	/**
	 * Setter for property sourceTree.
	 * 
	 * @param sourceTree
	 *            New value of property sourceTree.
	 */
	public void setSourceTree(JTree sourceTree) {
		this.sourceTree = sourceTree;
	}

	/**
	 * Holds value of property sourceNode.
	 */
	private MutableTreeNode sourceNode;

	/**
	 * Getter for property sourceNode.
	 * 
	 * @return Value of property sourceNode.
	 */
	public MutableTreeNode getSourceNode() {
		return this.sourceNode;
	}

	/**
	 * Setter for property sourceNode.
	 * 
	 * @param sourceNode
	 *            New value of property sourceNode.
	 */
	public void setSourceNode(MutableTreeNode sourceNode) {
		this.sourceNode = sourceNode;
	}

	/**
	 * Holds value of property nodeWasExpanded.
	 */
	private boolean nodeWasExpanded;

	/**
	 * Getter for property nodeWasExpanded.
	 * 
	 * @return Value of property nodeWasExpanded.
	 */
	public boolean isNodeWasExpanded() {
		return this.nodeWasExpanded;
	}

	/**
	 * Setter for property nodeWasExpanded.
	 * 
	 * @param nodeWasExpanded
	 *            New value of property nodeWasExpanded.
	 */
	public void setNodeWasExpanded(boolean nodeWasExpanded) {
		this.nodeWasExpanded = nodeWasExpanded;
	}

}
