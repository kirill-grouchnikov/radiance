/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.check;

import org.pushingpixels.radiance.demo.theming.main.check.svg.flags.se;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.renderer.RadianceDefaultTreeCellRenderer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

/**
 * Test application panel for testing {@link JTree} component.
 * 
 * @author Kirill Grouchnikov
 */
public class TreePanel extends ControllablePanel {
    /**
     * The cell renderer for the tree. Uses HTML for bold text on selected row and custom icon on
     * selected row.
     * 
     * @author Kirill Grouchnikov
     */
    private static class TestTreeCellRenderer extends RadianceDefaultTreeCellRenderer {
        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel,
                boolean expanded, boolean leaf, int row, boolean hasFocus) {
            JLabel result = (JLabel) super.getTreeCellRendererComponent(tree, value, sel, expanded,
                    leaf, row, hasFocus);
            if (sel) {
                result.setText("<html><b>" + getText() + "</b></html>");
                result.setIcon(se.of(16, 16));
            }
            return result;
        }
    }

    /**
     * The tree component.
     */
    private JTree tree;

    /**
     * The scroll pane that contains the tree.
     */
    private JScrollPane jsp;

    /**
     * Creates the tree panel.
     */
    public TreePanel() {
        this.setLayout(new BorderLayout());

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

        this.tree = new JTree(root);

        this.tree.setTransferHandler(new TransferHandler() {
            @Override
            public boolean canImport(TransferSupport support) {
                return true;
            }

            @Override
            public boolean canImport(JComponent comp, DataFlavor[] transferFlavors) {
                return true;
            }

            @Override
            public boolean importData(JComponent comp, Transferable t) {
                return false;
            }

            @Override
            public boolean importData(TransferSupport support) {
                return false;
            }
        });
        this.tree.setDropMode(DropMode.ON);

        RadianceThemingCortex.ComponentScope.setAutomaticDragAndDropSupportPresence(this.tree, true);
        this.jsp = new JScrollPane(this.tree);
        this.jsp.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.add(this.jsp, BorderLayout.CENTER);

        TestFormLayoutBuilder builder = new TestFormLayoutBuilder("right:pref, 4dlu, fill:pref:grow",
                2, 13);
        builder.appendSeparator("General");

        final JCheckBox isEnabled = new JCheckBox("is enabled");
        isEnabled.setSelected(tree.isEnabled());
        isEnabled.addActionListener(actionEvent -> tree.setEnabled(isEnabled.isSelected()));
        builder.append("Enabled", isEnabled);

        final JCheckBox isOpaque = new JCheckBox("is opaque");
        isOpaque.setSelected(tree.isOpaque());
        isOpaque.addActionListener(actionEvent -> {
            tree.setOpaque(isOpaque.isSelected());
            tree.repaint();
        });
        builder.append("Opacity", isOpaque);

        final JCheckBox isEditable = new JCheckBox("is editable");
        isEditable.setSelected(tree.isEditable());
        isEditable.addActionListener(actionEvent -> tree.setEditable(isEditable.isSelected()));
        builder.append("Editable", isEditable);

        final JCheckBox isDragEnabled = new JCheckBox("is drag enabled");
        isDragEnabled.setSelected(tree.getDragEnabled());
        isDragEnabled.addActionListener(actionEvent -> tree.setDragEnabled(isDragEnabled.isSelected()));
        builder.append("Drag enabled", isDragEnabled);

        final JCheckBox isWrappedInScrollPane = new JCheckBox("is in scroll pane");
        isWrappedInScrollPane.setSelected(true);
        isWrappedInScrollPane.addActionListener(actionEvent -> {
            if (isWrappedInScrollPane.isSelected()) {
                remove(tree);
                jsp.setViewportView(tree);
                add(jsp, BorderLayout.CENTER);
            } else {
                remove(jsp);
                add(tree, BorderLayout.CENTER);
            }
            revalidate();
            repaint();
        });
        builder.append("Container", isWrappedInScrollPane);

        final JCheckBox rendererCB = new JCheckBox("has custom renderer");
        rendererCB.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            if (rendererCB.isSelected()) {
                tree.setCellRenderer(new TestTreeCellRenderer());
            } else {
                tree.setCellRenderer(new RadianceDefaultTreeCellRenderer());
            }
        }));
        builder.append("Renderer", rendererCB);

        builder.appendSeparator("Insets");
        Insets ins = tree.getInsets();
        final JSpinner topInsets = new JSpinner(new SpinnerNumberModel(ins.top, 0, 10, 1));
        final JSpinner leftInsets = new JSpinner(new SpinnerNumberModel(ins.left, 0, 10, 1));
        final JSpinner bottomInsets = new JSpinner(new SpinnerNumberModel(ins.bottom, 0, 10, 1));
        final JSpinner rightInsets = new JSpinner(new SpinnerNumberModel(ins.right, 0, 10, 1));
        builder.append("Top", topInsets);
        builder.append("Left", leftInsets);
        builder.append("Bottom", bottomInsets);
        builder.append("Right", rightInsets);

        ChangeListener cl = changeEvent -> tree.setBorder(
                new EmptyBorder((Integer) topInsets.getValue(), (Integer) leftInsets.getValue(),
                        (Integer) bottomInsets.getValue(), (Integer) rightInsets.getValue()));
        topInsets.addChangeListener(cl);
        leftInsets.addChangeListener(cl);
        bottomInsets.addChangeListener(cl);
        rightInsets.addChangeListener(cl);

        this.controlPanel = builder.build();
        // this.tree.setEditable(true);
    }
}
