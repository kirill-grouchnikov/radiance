/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.flamingo.bcb;

import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbItem;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbPathEvent;
import org.pushingpixels.flamingo.api.bcb.core.BreadcrumbTreeAdapterSelector;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultListCellRenderer;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.NoSuchElementException;

public class TreeAdapterBreadCrumbTest extends JFrame {
    private JList<File> fileList;

    private BreadcrumbTreeAdapterSelector<FileTreeNode> bar;

    private TreeAdapterBreadCrumbTest() {
        super("BreadCrumb test");

        File[] roots = File.listRoots();
        FileTreeNode rootTreeNode = new FileTreeNode(roots);

        this.bar = new BreadcrumbTreeAdapterSelector<>(new DefaultTreeModel(rootTreeNode),
                new BreadcrumbTreeAdapterSelector.TreeAdapter<>() {
                    @Override
                    public String toString(FileTreeNode node) {
                        if (node.file == null)
                            return "Computer";
                        String result = FileSystemView.getFileSystemView().getSystemDisplayName(
                                node.file);
                        if (result.length() == 0)
                            result = node.file.getAbsolutePath();
                        return result;
                    }

                    @Override
                    public Icon getIcon(FileTreeNode node) {
                        if (node.file == null)
                            return null;
                        Icon result = FileSystemView.getFileSystemView().getSystemIcon(node.file);
                        return result;
                    }
                }, false);
        this.bar.getModel().addPathListener(event ->
            SwingUtilities.invokeLater(() -> {
                final List<BreadcrumbItem<FileTreeNode>> newPath = event.getSource().getItems();
                System.out.println("New path is ");
                for (BreadcrumbItem<FileTreeNode> item : newPath) {
                    FileTreeNode node = item.getData();
                    if (node.file == null)
                        continue;
                    System.out.println("\t" + node.file.getName());
                }

                if (newPath.size() > 0) {
                    SwingWorker<List<StringValuePair<FileTreeNode>>, Void> worker = new
                            SwingWorker<List<StringValuePair<FileTreeNode>>, Void>() {
                                @Override
                                protected List<StringValuePair<FileTreeNode>> doInBackground() throws
                                        Exception {
                                    return bar.getCallback().getLeafs(newPath);
                                }

                                @Override
                                protected void done() {
                                    try {
                                        FileListModel model = new FileListModel();
                                        List<StringValuePair<FileTreeNode>> leafs = get();
                                        for (StringValuePair<FileTreeNode> leaf : leafs) {
                                            FileTreeNode node = leaf.getValue();
                                            model.add(node.file);
                                        }
                                        model.sort();
                                        fileList.setModel(model);
                                    } catch (Exception exc) {
                                    }
                                }
                            };
                    worker.execute();
                }
            })
        );

        this.setLayout(new BorderLayout());
        this.add(bar, BorderLayout.NORTH);

        this.fileList = new JList<>();
        this.fileList.setCellRenderer(new FileListRenderer());
        JScrollPane fileListScrollPane = new JScrollPane(this.fileList);
        fileListScrollPane.setBorder(new TitledBorder("File list"));

        this.add(fileListScrollPane, BorderLayout.CENTER);
    }

    /**
     * A node in the file tree.
     *
     * @author Kirill Grouchnikov
     */
    private class FileTreeNode implements TreeNode {
        /**
         * Node file.
         */
        private File file;

        /**
         * Children of the node file.
         */
        private File[] children;

        /**
         * Parent node.
         */
        private TreeNode parent;

        /**
         * Creates a new file tree node.
         *
         * @param file   Node file
         * @param parent Parent node.
         */
        private FileTreeNode(File file, TreeNode parent) {
            this.file = file;
            this.parent = parent;
            this.children = this.file.listFiles();
            if (this.children == null)
                this.children = new File[0];
        }

        /**
         * Creates a new file tree node.
         *
         * @param children Children files.
         */
        private FileTreeNode(File[] children) {
            this.file = null;
            this.parent = null;
            this.children = children;
        }

        @Override
        public Enumeration<FileTreeNode> children() {
            final int elementCount = this.children.length;
            return new Enumeration<>() {
                int count = 0;

                @Override
                public boolean hasMoreElements() {
                    return this.count < elementCount;
                }

                @Override
                public FileTreeNode nextElement() {
                    if (this.count < elementCount) {
                        return new FileTreeNode(FileTreeNode.this.children[this.count++],
                                FileTreeNode.this);
                    }
                    throw new NoSuchElementException("Vector Enumeration");
                }
            };

        }

        @Override
        public boolean getAllowsChildren() {
            return true;
        }

        @Override
        public TreeNode getChildAt(int childIndex) {
            return new FileTreeNode(this.children[childIndex], this);
        }

        @Override
        public int getChildCount() {
            return this.children.length;
        }

        @Override
        public int getIndex(TreeNode node) {
            FileTreeNode ftn = (FileTreeNode) node;
            for (int i = 0; i < this.children.length; i++) {
                if (ftn.file.equals(this.children[i]))
                    return i;
            }
            return -1;
        }

        @Override
        public TreeNode getParent() {
            return this.parent;
        }

        @Override
        public boolean isLeaf() {
            boolean isNotFolder = (this.file != null) && (this.file.isFile());
            return (this.getChildCount() == 0) && isNotFolder;
        }
    }

    public static class FileListModel extends AbstractListModel<File> {
        private ArrayList<File> files = new ArrayList<>();

        public void add(File file) {
            files.add(file);
        }

        private void sort() {
            files.sort((File o1, File o2) -> {
                if (o1.isDirectory() && (!o2.isDirectory()))
                    return -1;
                if (o2.isDirectory() && (!o1.isDirectory()))
                    return 1;
                return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
            });
        }

        @Override
        public File getElementAt(int index) {
            return files.get(index);
        }

        @Override
        public int getSize() {
            return files.size();
        }
    }

    public class FileListRenderer extends SubstanceDefaultListCellRenderer {
        public Component getListCellRendererComponent(JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            File file = (File) value;
            this.setIcon(FileSystemView.getFileSystemView().getSystemIcon(file));
            this.setText(FileSystemView.getFileSystemView().getSystemDisplayName(file));
            return this;
        }
    }

    /**
     * Main method for testing.
     *
     * @param args Ignored.
     */
    public static void main(String... args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());

            TreeAdapterBreadCrumbTest test = new TreeAdapterBreadCrumbTest();
            test.setIconImage(RadianceLogo.getLogoImage(
                    SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                            SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                            SubstanceSlices.ColorSchemeAssociationKind.FILL,
                            ComponentState.ENABLED)));
            test.setSize(700, 400);
            test.setLocation(300, 100);
            test.setVisible(true);
            test.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        });
    }
}
