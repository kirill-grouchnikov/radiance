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
package org.pushingpixels.radiance.demo.theming.main.check;

import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.demo.theming.main.check.command.ConfigurationCommand;
import org.pushingpixels.radiance.demo.theming.main.check.command.CreationCommand;
import org.pushingpixels.radiance.demo.theming.main.check.command.DisableCommand;
import org.pushingpixels.radiance.demo.theming.main.check.command.DisableViewportCommand;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.util.Enumeration;

public class CellsPanel extends JPanel implements Deferrable {
    private boolean isInitialized;

    @Override
    public boolean isInitialized() {
        return this.isInitialized;
    }

    public CellsPanel() {
    }

    @Override
    public synchronized void initialize() {
        TestFormLayoutBuilder builderCells = new TestFormLayoutBuilder(
                "right:pref, 10dlu, fill:pref:grow(1), 4dlu,"
                        + "fill:pref:grow(1), 4dlu, fill:pref:grow(1), 4dlu, fill:pref:grow(1)",
                5, 10).columnGroups(new int[][] { { 3, 5, 7, 9 } }).
                padding(Paddings.DIALOG);

        builderCells.append("");
        builderCells.append(new JLabel("NONE"), new JLabel("CONTROL_PANE"));
        builderCells.append(new JLabel("HEADER"), new JLabel("FOOTER"));

        builderCells.appendSeparator("Lists");
        addControlRow(builderCells, "List", () -> {
            JList<String> list = new JList<>(new String[] {"entry1", "entry2", "entry3"});
            return list;
        }, null);
        addControlRow(builderCells, "List disabled", () -> {
            JList<String> list = new JList<>(new String[] {"entry1", "entry2", "entry3"});
            return list;
        }, new DisableCommand());

        CreationCommand<JComponent> tableCreationCmd = new CreationCommand<>() {
            public JComponent create() {
                final JTable table = new JTable(
                        new Object[][] {{"entry11", "entry12", "entry13"},
                                {"entry21", "entry22", "entry23"},
                                {"entry31", "entry32", "entry33"}},
                        new Object[] {"Column1", "Column2", "Column3"});
                table.setName("Table ");
                JScrollPane tableScroll = new JScrollPane(table) {
                    @Override
                    public void setBackground(Color bg) {
                        super.setBackground(bg);
                        table.setBackground(bg);
                        table.getTableHeader().setBackground(bg);
                    }

                    @Override
                    public void setForeground(Color fg) {
                        super.setForeground(fg);
                        table.setForeground(fg);
                        table.getTableHeader().setForeground(fg);
                    }
                };
                Dimension prefTable = table.getPreferredSize();
                tableScroll.setPreferredSize(new Dimension(prefTable.width, prefTable.height + 25));
                return tableScroll;
            }
        };
        builderCells.appendSeparator("Tables");
        addControlRow(builderCells, "Table", tableCreationCmd, null);
        addControlRow(builderCells, "Table disabled", tableCreationCmd,
                new DisableViewportCommand());

        CreationCommand<JComponent> treeCreationCmd = new CreationCommand<>() {
            private void expandAll(JTree tree, boolean expand) {
                TreeNode root = (TreeNode) tree.getModel().getRoot();

                // Traverse tree from root
                expandAll(tree, new TreePath(root), expand);
            }

            private void expandAll(JTree tree, TreePath parent, boolean expand) {
                // Traverse children
                TreeNode node = (TreeNode) parent.getLastPathComponent();
                if (node.getChildCount() >= 0) {
                    for (Enumeration<?> e = node.children(); e.hasMoreElements(); ) {
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

            public JComponent create() {
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
                return tree;
            }
        };
        builderCells.appendSeparator("Trees");
        addControlRow(builderCells, "Tree", treeCreationCmd, null);
        addControlRow(builderCells, "Tree disabled", treeCreationCmd, new DisableCommand());

        JPanel panelCells = builderCells.build();
        JScrollPane jspCells = new JScrollPane(panelCells);
        panelCells.setOpaque(false);
        jspCells.setOpaque(false);
        jspCells.getViewport().setOpaque(false);

        this.setLayout(new BorderLayout());
        this.add(jspCells);

        this.isInitialized = true;
    }

    /**
     * Adds a row of components configured with the specified configuration command.
     *
     * @param builder
     *            Form builder.
     * @param label
     *            Text to set.
     * @param creationCmd
     *            Creation command.
     * @param configurationCmd
     *            Configuration command to apply.
     */
    private void addControlRow(TestFormLayoutBuilder builder, String label,
            CreationCommand<JComponent> creationCmd,
            ConfigurationCommand<JComponent> configurationCmd) {

        JComponent[] row = new JComponent[4];
        row[0] = creationCmd.create();
        ComponentOrParentChainScope.setDecorationType((row[0]),
                DecorationAreaType.NONE);
        row[0].setName(row[0].getName() + ": NONE");

        row[1] = creationCmd.create();
        ComponentOrParentChainScope.setDecorationType((row[1]),
                DecorationAreaType.CONTROL_PANE);
        row[1].setName(row[1].getName() + ": CONTROL_PANE");

        row[2] = creationCmd.create();
        ComponentOrParentChainScope.setDecorationType((row[2]),
                DecorationAreaType.HEADER);
        row[2].setName(row[2].getName() + ": HEADER");

        row[3] = creationCmd.create();
        ComponentOrParentChainScope.setDecorationType((row[3]),
                DecorationAreaType.FOOTER);
        row[3].setName(row[3].getName() + ": FOOTER");

        if (configurationCmd != null) {
            for (JComponent comp : row) {
                configurationCmd.configure(comp);
            }
        }

        JLabel jl = new JLabel(label);
        builder.append(jl);
        for (Component comp : row)
            builder.append(comp);
    }

}
