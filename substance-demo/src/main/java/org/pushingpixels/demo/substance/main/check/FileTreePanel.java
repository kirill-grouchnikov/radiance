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
package org.pushingpixels.demo.substance.main.check;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeNode;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultTreeCellRenderer;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Test application panel for testing {@link JTree} component and
 * {@link SubstanceLookAndFeel#TREE_SMART_SCROLL_ANIMATION_KIND}.
 * 
 * @author Kirill Grouchnikov
 */
public class FileTreePanel extends ControllablePanel implements Deferrable {
    private boolean isInitialized;

    @Override
    public boolean isInitialized() {
        return this.isInitialized;
    }

    /**
     * File system view.
     */
    protected static FileSystemView fsv = FileSystemView.getFileSystemView();

    /**
     * Renderer for the file tree.
     * 
     * @author Kirill Grouchnikov
     */
    private static class SubstanceFileTreeCellRenderer extends SubstanceDefaultTreeCellRenderer {
        /**
         * Icon cache to speed the rendering.
         */
        private Map<String, Icon> iconCache = new HashMap<String, Icon>();

        /**
         * Root name cache to speed the rendering.
         */
        private Map<File, String> rootNameCache = new HashMap<File, String>();

        /*
         * (non-Javadoc)
         * 
         * @seeorg.pushingpixels.substance.SubstanceDefaultTreeCellRenderer#
         * getTreeCellRendererComponent(javax.swing.JTree, java.lang.Object, boolean, boolean,
         * boolean, int, boolean)
         */
        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel,
                boolean expanded, boolean leaf, int row, boolean hasFocus) {
            FileTreeNode ftn = (FileTreeNode) value;
            File file = ftn.file;
            String filename = "";
            if (file != null) {
                if (ftn.isFileSystemRoot) {
                    // long start = System.currentTimeMillis();
                    filename = rootNameCache.get(file);
                    if (filename == null) {
                        filename = fsv.getSystemDisplayName(file);
                        rootNameCache.put(file, filename);
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
                Icon icon = iconCache.get(filename);
                if (icon == null) {
                    // System.out.println("Getting icon of " + filename);
                    icon = fsv.getSystemIcon(file);
                    iconCache.put(filename, icon);
                }
                result.setIcon(icon);
            }
            return result;
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
        private Map<String, Icon> iconCache = new HashMap<String, Icon>();

        /**
         * Root name cache to speed the rendering.
         */
        private Map<File, String> rootNameCache = new HashMap<File, String>();

        /*
         * (non-Javadoc)
         * 
         * @seeorg.pushingpixels.substance.SubstanceDefaultTreeCellRenderer#
         * getTreeCellRendererComponent(javax.swing.JTree, java.lang.Object, boolean, boolean,
         * boolean, int, boolean)
         */
        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel,
                boolean expanded, boolean leaf, int row, boolean hasFocus) {
            FileTreeNode ftn = (FileTreeNode) value;
            File file = ftn.file;
            String filename = "";
            if (file != null) {
                if (ftn.isFileSystemRoot) {
                    // long start = System.currentTimeMillis();
                    filename = rootNameCache.get(file);
                    if (filename == null) {
                        filename = fsv.getSystemDisplayName(file);
                        rootNameCache.put(file, filename);
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
                Icon icon = iconCache.get(filename);
                if (icon == null) {
                    // System.out.println("Getting icon of " + filename);
                    icon = fsv.getSystemIcon(file);
                    iconCache.put(filename, icon);
                }
                result.setIcon(icon);
            }
            return result;
        }
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
        private List<File> children;

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
         * @param file
         *            Node file
         * @param isFileSystemRoot
         *            Indicates whether the file is a file system root.
         * @param parent
         *            Parent node.
         */
        public FileTreeNode(File file, boolean isFileSystemRoot, TreeNode parent) {
            this.file = file;
            this.isFileSystemRoot = isFileSystemRoot;
            this.parent = parent;
            this.children = new ArrayList<File>();
            File[] children = file.listFiles();
            if (children != null) {
                for (File child : file.listFiles()) {
                    if (fsv.isHiddenFile(child))
                        continue;
                    this.children.add(child);
                }
                Collections.sort(this.children, new Comparator<File>() {
                    @Override
                    public int compare(File o1, File o2) {
                        if (o1.equals(o2))
                            return 0;
                        if (o1.isDirectory() && o2.isFile())
                            return -1;
                        if (o1.isFile() && o2.isDirectory())
                            return 1;
                        int result = fsv.getSystemDisplayName(o1).toLowerCase()
                                .compareTo(fsv.getSystemDisplayName(o2).toLowerCase());
                        if (result != 0)
                            return result;
                        return o1.compareTo(o2);
                    }
                });
            }
        }

        /**
         * Creates a new file tree node.
         * 
         * @param children
         *            Children files.
         */
        public FileTreeNode(List<File> children) {
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
            final int elementCount = this.children.size();
            return new Enumeration<File>() {
                int count = 0;

                /*
                 * (non-Javadoc)
                 * 
                 * @see java.util.Enumeration#hasMoreElements()
                 */
                public boolean hasMoreElements() {
                    return count < elementCount;
                }

                /*
                 * (non-Javadoc)
                 * 
                 * @see java.util.Enumeration#nextElement()
                 */
                public File nextElement() {
                    if (count < elementCount) {
                        return children.get(count++);
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
            return new FileTreeNode(this.children.get(childIndex), this.parent == null, this);
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.tree.TreeNode#getChildCount()
         */
        public int getChildCount() {
            return this.children.size();
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.tree.TreeNode#getIndex(javax.swing.tree.TreeNode)
         */
        public int getIndex(TreeNode node) {
            FileTreeNode ftn = (FileTreeNode) node;
            for (int i = 0; i < this.children.size(); i++) {
                if (ftn.file.equals(this.children.get(i)))
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
            return (this.getChildCount() == 0);
        }
    }

    /**
     * The file tree.
     */
    private JTree tree;

    /**
     * Creates the file tree panel.
     */
    public FileTreePanel() {
        this.setLayout(new BorderLayout());
    }

    public synchronized void initialize() {
        List<File> rootsList = new ArrayList<File>();
        for (File child : File.listRoots()) {
            rootsList.add(child);
        }
        FileTreeNode rootTreeNode = new FileTreeNode(rootsList);
        this.tree = new JTree(rootTreeNode);
        this.tree.setCellRenderer((UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel)
                ? new SubstanceFileTreeCellRenderer()
                : new FileTreeCellRenderer());
        this.tree.setRootVisible(false);
        final JScrollPane jsp = new JScrollPane(this.tree);
        jsp.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.add(jsp, BorderLayout.CENTER);

        FormLayout lm = new FormLayout("right:pref, 4dlu, fill:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm, new ScrollablePanel());
        builder.appendSeparator("General");

        final JCheckBox isEnabled = new JCheckBox("is enabled");
        isEnabled.setSelected(tree.isEnabled());
        isEnabled.addActionListener((ActionEvent e) -> 
                tree.setEnabled(isEnabled.isSelected()));
        builder.append("Enabled", isEnabled);

        final JCheckBox watermarkBleed = new JCheckBox("is bleeding");
        watermarkBleed.addActionListener((ActionEvent e) -> {
            SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(tree,
                    watermarkBleed.isSelected());
            SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jsp,
                    watermarkBleed.isSelected());
            tree.repaint();
        });
        builder.append("Watermark", watermarkBleed);

        final JCheckBox cbTreeSmartScroll = new JCheckBox("smart tree scroll");
        cbTreeSmartScroll.addActionListener((ActionEvent e) -> {
            if (cbTreeSmartScroll.isSelected()) {
                SubstanceCortex.ComponentScope.allowAnimations(tree,
                        SubstanceSlices.AnimationFacet.TREE_SMART_SCROLL_ANIMATION_KIND);
            } else {
                SubstanceCortex.ComponentScope.disallowAnimations(tree,
                        SubstanceSlices.AnimationFacet.TREE_SMART_SCROLL_ANIMATION_KIND);
            }
            tree.repaint();
        });
        builder.append("Decorations", cbTreeSmartScroll);

        this.controlPanel = builder.getPanel();
        this.isInitialized = true;
    }
}