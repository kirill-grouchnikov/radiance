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

import java.util.EventObject;

import javax.swing.JTree;
import javax.swing.tree.TreeNode;

/**
 * StringTreeDnDEvent is an event fired whenever a String is about to be dropped
 * into a node in a JTree.
 * 
 * @author Antonio Vieiro (antonio@antonioshome.net), $Author: kirillcool $
 */
public class StringTreeDnDEvent extends EventObject {
	private JTree targetTree;
	private TreeNode targetNode;
	private String sourceString;

	/**
	 * Creates a new instance of StringTreeDnDEvent
	 * 
	 * @param aSourceString
	 *            the String being dragged.
	 * @param aTargetTree
	 *            the JTree containing the node.
	 * @param aTargetNode
	 *            the node onto which the String is about to be dropped into.
	 */
	public StringTreeDnDEvent(String aSourceString, JTree aTargetTree,
			TreeNode aTargetNode) {
		super(aSourceString);
		this.setSourceString(aSourceString);
		this.setTargetTree(aTargetTree);
		this.setTargetNode(aTargetNode);
	}

	public JTree getTargetTree() {
		return this.targetTree;
	}

	public void setTargetTree(JTree targetTree) {
		this.targetTree = targetTree;
	}

	public TreeNode getTargetNode() {
		return this.targetNode;
	}

	public void setTargetNode(TreeNode targetNode) {
		this.targetNode = targetNode;
	}

	public String getSourceString() {
		return this.sourceString;
	}

	public void setSourceString(String sourceString) {
		this.sourceString = sourceString;
	}

}
