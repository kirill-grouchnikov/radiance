/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.check.decoration;

import org.pushingpixels.radiance.demo.theming.main.check.selector.RadianceSkinSelector;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.skin.MistSilverSkin;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.util.Enumeration;

public class DecorationTrees extends JFrame {
    private static class TreePanel extends JPanel {
        public TreePanel(String caption, DecorationAreaType decorationAreaType, boolean isEnabled) {
            super(new BorderLayout());
            ComponentOrParentChainScope.setDecorationType(this, decorationAreaType);

            JLabel captionLabel = new JLabel(" " + caption);
            Font font = captionLabel.getFont();
            captionLabel.setFont(font.deriveFont(Font.BOLD));
            this.add(captionLabel, BorderLayout.NORTH);

            DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
            DefaultMutableTreeNode son1 = new DefaultMutableTreeNode("son1");
            DefaultMutableTreeNode son2 = new DefaultMutableTreeNode("son2");
            DefaultMutableTreeNode son3 = new DefaultMutableTreeNode("son3");
            DefaultMutableTreeNode gson11 = new DefaultMutableTreeNode("gson11");
            DefaultMutableTreeNode gson12 = new DefaultMutableTreeNode("gson12");
            DefaultMutableTreeNode gson21 = new DefaultMutableTreeNode("gson21");
            DefaultMutableTreeNode gson22 = new DefaultMutableTreeNode("gson22");
            DefaultMutableTreeNode gson31 = new DefaultMutableTreeNode("gson31");
            DefaultMutableTreeNode gson32 = new DefaultMutableTreeNode("gson32");
            DefaultMutableTreeNode ggson111 = new DefaultMutableTreeNode("ggson111");
            DefaultMutableTreeNode ggson112 = new DefaultMutableTreeNode("ggson112");
            DefaultMutableTreeNode ggson113 = new DefaultMutableTreeNode("ggson113");

            gson11.add(ggson111);
            gson11.add(ggson112);
            gson11.add(ggson113);
            son1.add(gson11);
            son1.add(gson12);
            son2.add(gson21);
            son2.add(gson22);
            son3.add(gson31);
            son3.add(gson32);
            root.add(son1);
            root.add(son2);
            root.add(son3);

            JTree tree = new JTree(root);
            expandAll(tree, true);
            tree.setEnabled(isEnabled);

            this.add(tree, BorderLayout.CENTER);
        }

        private static void expandAll(JTree tree, boolean expand) {
            TreeNode root = (TreeNode) tree.getModel().getRoot();

            // Traverse tree from root
            expandAll(tree, new TreePath(root), expand);
        }

        private static void expandAll(JTree tree, TreePath parent, boolean expand) {
            // Traverse children
            TreeNode node = (TreeNode) parent.getLastPathComponent();
            if (node.getChildCount() >= 0) {
                for (Enumeration e = node.children(); e.hasMoreElements();) {
                    TreeNode n = (TreeNode) e.nextElement();
                    TreePath path = parent.pathByAddingChild(n);
                    expandAll(tree, path, expand);
                }
            }

            // Expansion or collapse must be done bottom-up
            if (expand) {
                tree.expandPath(parent);
            } else {
                tree.collapsePath(parent);
            }
        }

    }

    public DecorationTrees() {
        super("Trees in decoration areas");

        JPanel treePanel = new JPanel(new GridLayout(2, 4));

        treePanel.add(new TreePanel("Enabled in HEADER", DecorationAreaType.HEADER, true));
        treePanel.add(new TreePanel("Disabled in HEADER", DecorationAreaType.HEADER, false));
        treePanel.add(new TreePanel("Enabled in NONE", DecorationAreaType.NONE, true));
        treePanel.add(new TreePanel("Disabled in NONE", DecorationAreaType.NONE, false));
        treePanel.add(new TreePanel("Enabled in CONTROL_PANE", DecorationAreaType.CONTROL_PANE, true));
        treePanel.add(new TreePanel("Disabled in CONTROL_PANE", DecorationAreaType.CONTROL_PANE, false));
        treePanel.add(new TreePanel("Enabled in FOOTER", DecorationAreaType.FOOTER, true));
        treePanel.add(new TreePanel("Disabled in FOOTER", DecorationAreaType.FOOTER, false));

        this.setLayout(new BorderLayout());
        this.add(treePanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        controlPanel.add(new RadianceSkinSelector());

        this.add(controlPanel, BorderLayout.SOUTH);

        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new MistSilverSkin());
            new DecorationTrees().setVisible(true);
        });
    }
}
