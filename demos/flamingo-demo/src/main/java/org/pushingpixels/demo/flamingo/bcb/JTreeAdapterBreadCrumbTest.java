/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeNode;
import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.*;

public class JTreeAdapterBreadCrumbTest extends JFrame {
    /**
     * File system view.
     */
    private static FileSystemView fsv = FileSystemView.getFileSystemView();
    private JList fileList;
    private BreadcrumbTreeAdapterSelector<FileTreeNode> bar;

    private JTreeAdapterBreadCrumbTest() {
        super("BreadCrumb test");

        File[] roots = File.listRoots();
        FileTreeNode rootTreeNode = new FileTreeNode(roots);
        JTree tree = new JTree(rootTreeNode);
        tree.setRootVisible(false);
        tree.setCellRenderer(new FileTreeCellRenderer());

        this.bar = new BreadcrumbTreeAdapterSelector<>(tree);
        this.bar.getModel().addPathListener((BreadcrumbPathEvent<FileTreeNode> event) ->
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
                        SwingWorker<List<StringValuePair<FileTreeNode>>, Void> worker =
                                new SwingWorker<>() {
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
                    return;
                })
        );

        this.setLayout(new BorderLayout());
        this.add(bar, BorderLayout.NORTH);

        this.fileList = new JList();
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
    private static class FileTreeNode implements TreeNode {
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
         * Indication whether this node corresponds to a file system root.
         */
        private boolean isFileSystemRoot;

        /**
         * Creates a new file tree node.
         *
         * @param file             Node file
         * @param isFileSystemRoot Indicates whether the file is a file system root.
         * @param parent           Parent node.
         */
        private FileTreeNode(File file, boolean isFileSystemRoot, TreeNode parent) {
            this.file = file;
            this.isFileSystemRoot = isFileSystemRoot;
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
        public Enumeration children() {
            final int elementCount = this.children.length;
            return new Enumeration<File>() {
                int count = 0;

                @Override
                public boolean hasMoreElements() {
                    return this.count < elementCount;
                }

                @Override
                public File nextElement() {
                    if (this.count < elementCount) {
                        return FileTreeNode.this.children[this.count++];
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
            return new FileTreeNode(this.children[childIndex], this.parent == null, this);
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

    public class FileListModel extends AbstractListModel {
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
        public Object getElementAt(int index) {
            return files.get(index);
        }

        @Override
        public int getSize() {
            return files.size();
        }
    }

    /**
     * Renderer for the file tree.
     *
     * @author Kirill Grouchnikov
     */
    private static class FileTreeCellRenderer extends DefaultTreeCellRenderer {
        /**
         * Icon cache to speed the rendering.
         */
        private Map<String, Icon> iconCache = new HashMap<>();

        /**
         * Root name cache to speed the rendering.
         */
        private Map<File, String> rootNameCache = new HashMap<>();

        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel,
                boolean expanded, boolean leaf, int row, boolean hasFocus) {
            FileTreeNode ftn = (FileTreeNode) value;
            File file = ftn.file;
            String filename = "";
            if (file != null) {
                if (ftn.isFileSystemRoot) {
                    // long start = System.currentTimeMillis();
                    filename = this.rootNameCache.get(file);
                    if (filename == null) {
                        filename = fsv.getSystemDisplayName(file);
                        if (filename.length() == 0)
                            filename = file.getPath();
                        this.rootNameCache.put(file, filename);
                    }
                    // long end = System.currentTimeMillis();
                    // System.out.println(filename + ":" + (end - start));
                } else {
                    filename = file.getName();
                }
            }
            JLabel result = (JLabel) super.getTreeCellRendererComponent(tree, filename, sel,
                    expanded, leaf, row, hasFocus);
            if (file != null) {
                Icon icon = this.iconCache.get(filename);
                if (icon == null) {
                    // System.out.println("Getting icon of " + filename);
                    icon = fsv.getSystemIcon(file);
                    this.iconCache.put(filename, icon);
                }
                result.setIcon(icon);
            }
            return result;
        }
    }

    public class FileListRenderer extends SubstanceDefaultListCellRenderer {
        @Override
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

            JTreeAdapterBreadCrumbTest test = new JTreeAdapterBreadCrumbTest();
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
