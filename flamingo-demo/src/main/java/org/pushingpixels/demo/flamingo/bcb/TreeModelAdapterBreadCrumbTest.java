/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.NoSuchElementException;

import javax.swing.AbstractListModel;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

import org.pushingpixels.flamingo.api.bcb.BreadcrumbItem;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbPathEvent;
import org.pushingpixels.flamingo.api.bcb.core.BreadcrumbTreeAdapterSelector;
import org.pushingpixels.flamingo.api.common.StringValuePair;

public class TreeModelAdapterBreadCrumbTest extends JFrame {
    private JList fileList;

    private BreadcrumbTreeAdapterSelector bar;

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
         * Creates a new file tree node.
         * 
         * @param file
         *            Node file
         * @param isFileSystemRoot
         *            Indicates whether the file is a file system root.
         * @param parent
         *            Parent node.
         */
        public FileTreeNode(File file, TreeNode parent) {
            this.file = file;
            this.parent = parent;
            this.children = this.file.listFiles();
            if (this.children == null)
                this.children = new File[0];
        }

        /**
         * Creates a new file tree node.
         * 
         * @param children
         *            Children files.
         */
        public FileTreeNode(File[] children) {
            this.file = null;
            this.parent = null;
            this.children = children;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.tree.TreeNode#children()
         */
        public Enumeration children() {
            final int elementCount = this.children.length;
            return new Enumeration<File>() {
                int count = 0;

                /*
                 * (non-Javadoc)
                 * 
                 * @see java.util.Enumeration#hasMoreElements()
                 */
                public boolean hasMoreElements() {
                    return this.count < elementCount;
                }

                /*
                 * (non-Javadoc)
                 * 
                 * @see java.util.Enumeration#nextElement()
                 */
                public File nextElement() {
                    if (this.count < elementCount) {
                        return FileTreeNode.this.children[this.count++];
                    }
                    throw new NoSuchElementException("Vector Enumeration");
                }
            };

        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.tree.TreeNode#getAllowsChildren()
         */
        public boolean getAllowsChildren() {
            return true;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.tree.TreeNode#getChildAt(int)
         */
        public TreeNode getChildAt(int childIndex) {
            return new FileTreeNode(this.children[childIndex], this);
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.tree.TreeNode#getChildCount()
         */
        public int getChildCount() {
            return this.children.length;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.tree.TreeNode#getIndex(javax.swing.tree.TreeNode)
         */
        public int getIndex(TreeNode node) {
            FileTreeNode ftn = (FileTreeNode) node;
            for (int i = 0; i < this.children.length; i++) {
                if (ftn.file.equals(this.children[i]))
                    return i;
            }
            return -1;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.tree.TreeNode#getParent()
         */
        public TreeNode getParent() {
            return this.parent;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.tree.TreeNode#isLeaf()
         */
        public boolean isLeaf() {
            boolean isNotFolder = (this.file != null) && (this.file.isFile());
            return (this.getChildCount() == 0) && isNotFolder;
        }
    }

    public class FileListRenderer extends JLabel implements ListCellRenderer {
        public FileListRenderer() {
            this.setBorder(new EmptyBorder(1, 1, 1, 1));
            this.setFont(new Font("Tahoma", Font.PLAIN, 11));
            this.setOpaque(true);
        }

        public Component getListCellRendererComponent(JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            File file = (File) value;
            this.setIcon(FileSystemView.getFileSystemView().getSystemIcon(file));
            this.setText(FileSystemView.getFileSystemView().getSystemDisplayName(file));
            Color back = (index % 2 == 0) ? new Color(250, 250, 250) : new Color(240, 240, 240);
            if (isSelected)
                back = new Color(220, 220, 240);
            this.setBackground(back);
            return this;
        }
    }

    public static class FileListModel extends AbstractListModel {
        private ArrayList<File> files = new ArrayList<File>();

        public void add(File file) {
            files.add(file);
        }

        public void sort() {
            Collections.sort(files, new Comparator<File>() {
                public int compare(File o1, File o2) {
                    if (o1.isDirectory() && (!o2.isDirectory()))
                        return -1;
                    if (o2.isDirectory() && (!o1.isDirectory()))
                        return 1;
                    return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
                }
            });
        }

        public Object getElementAt(int index) {
            return files.get(index);
        }

        public int getSize() {
            return files.size();
        }
    }

    public class MemoryListRenderer extends JLabel implements ListCellRenderer {

        public MemoryListRenderer() {
            this.setBorder(new EmptyBorder(1, 1, 1, 1));
            this.setFont(new Font("Tahoma", Font.PLAIN, 11));
            this.setOpaque(true);
        }

        public Component getListCellRendererComponent(JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            BreadcrumbItem<File>[] path = (BreadcrumbItem<File>[]) value;
            if (path.length > 0) {
                // this.setIcon(bar.getFileSystemView().getSystemIcon(
                // new File(path[0].getValue()[1])));
                this.setText(path[path.length - 1].getData().getName());
            } else {
                this.setIcon(null);
                this.setText("Root");
            }
            Color back = (index % 2 == 0) ? new Color(250, 250, 250) : new Color(240, 240, 240);
            this.setBackground(back);
            return this;
        }
    }

    public TreeModelAdapterBreadCrumbTest() {
        super("BreadCrumb test");

        File[] roots = File.listRoots();
        FileTreeNode rootTreeNode = new FileTreeNode(roots);

        this.bar = new BreadcrumbTreeAdapterSelector(new DefaultTreeModel(rootTreeNode),
                new BreadcrumbTreeAdapterSelector.TreeAdapter() {
                    @Override
                    public String toString(Object node) {
                        FileTreeNode n = (FileTreeNode) node;
                        if (n.file == null)
                            return "Computer";
                        String result = FileSystemView.getFileSystemView()
                                .getSystemDisplayName(n.file);
                        if (result.length() == 0)
                            result = n.file.getAbsolutePath();
                        return result;
                    }

                    @Override
                    public Icon getIcon(Object node) {
                        FileTreeNode n = (FileTreeNode) node;
                        if (n.file == null)
                            return null;
                        Icon result = FileSystemView.getFileSystemView().getSystemIcon(n.file);
                        return result;
                    }
                }, true);
        this.bar.getModel().addPathListener((BreadcrumbPathEvent event) -> {
            SwingUtilities.invokeLater(() -> {
                final List<BreadcrumbItem<Object>> newPath = bar.getModel().getItems();
                System.out.println("New path is ");
                for (BreadcrumbItem<Object> item : newPath) {
                    FileTreeNode node = (FileTreeNode) item.getData();
                    if (node.file == null)
                        continue;
                    System.out.println("\t" + node.file.getName());
                }

                if (newPath.size() > 0) {
                    SwingWorker<List<StringValuePair<Object>>, Void> worker = new SwingWorker<List<StringValuePair<Object>>, Void>() {
                        @Override
                        protected List<StringValuePair<Object>> doInBackground() throws Exception {
                            return bar.getCallback().getLeafs(newPath);
                        }

                        @Override
                        protected void done() {
                            try {
                                FileListModel model = new FileListModel();
                                List<StringValuePair<Object>> leafs = get();
                                for (StringValuePair<Object> leaf : leafs) {
                                    FileTreeNode node = (FileTreeNode) leaf.getValue();
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
            });
        });

        this.setLayout(new BorderLayout());
        this.add(bar, BorderLayout.NORTH);

        this.fileList = new JList();
        this.fileList.setCellRenderer(new FileListRenderer());
        JScrollPane fileListScrollPane = new JScrollPane(this.fileList);
        fileListScrollPane.setBorder(new TitledBorder("File list"));

        this.add(fileListScrollPane, BorderLayout.CENTER);
    }

    /**
     * Main method for testing.
     * 
     * @param args
     *            Ignored.
     */
    public static void main(String... args) {
        SwingUtilities.invokeLater(() -> {
            TreeModelAdapterBreadCrumbTest test = new TreeModelAdapterBreadCrumbTest();
            test.setSize(700, 400);
            test.setLocation(300, 100);
            test.setVisible(true);
            test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
