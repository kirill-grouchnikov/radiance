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
package org.pushingpixels.radiance.tools.lafbenchmark.panels;

import org.pushingpixels.radiance.tools.lafbenchmark.LafBenchmarkUtils;
import org.pushingpixels.radiance.tools.lafbenchmark.PerformanceScenario;
import org.pushingpixels.radiance.tools.lafbenchmark.PerformanceScenarioParticipant;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;

/**
 * Test application panel for testing {@link JTree} component.
 * 
 * @author Kirill Grouchnikov
 */
public class TreePanel extends JPanel {
	private JTree tree;

	/**
	 * Creates a new tree panel.
	 */
	public TreePanel() {
		this.setLayout(new BorderLayout());

		this.tree = new JTree();
		this.tree.setModel(new DefaultTreeModel(getTreeNode(5, "")));

		this.add(new JScrollPane(this.tree), BorderLayout.CENTER);
	}

	private DefaultMutableTreeNode getTreeNode(int depthLeft, String prefix) {
		DefaultMutableTreeNode result = new DefaultMutableTreeNode("node"
				+ prefix);
		if (depthLeft > 0) {
			for (int i = 0; i < 4; i++) {
				result.add(getTreeNode(depthLeft - 1, prefix + i));
			}
		}
		return result;
	}

	private void expandAll(JTree tree, TreePath path) {
		TreeNode node = (TreeNode) path.getLastPathComponent();
		for (int i = 0; i < node.getChildCount(); i++) {
			TreeNode child = node.getChildAt(i);
			expandAll(tree, path.pathByAddingChild(child));
		}
		tree.expandPath(path);
	}

	public void expandAll() {
		expandAll(tree, new TreePath(tree.getModel().getRoot()));
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getLargeTreeScrollPerformanceScenario() {
		return new PerformanceScenario() {
			int perm[];

			@Override
			public String getName() {
				return "Scrolling large tree";
			}

			@Override
			public int getIterationCount() {
				return 10;
			}

			@Override
			public void setup() {
				expandAll();
				this.perm = LafBenchmarkUtils.getPermutation(tree.getRowCount(),
						getIterationCount());
			}

			@Override
			public void runSingleIteration(int iterationNumber) {
				tree.scrollRowToVisible(this.perm[iterationNumber]);
				tree.paintImmediately(tree.getVisibleRect());
			}
		};
	}
}
