/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.api.bcb.core;

import org.pushingpixels.radiance.component.api.bcb.BreadcrumbBarCallBack;
import org.pushingpixels.radiance.component.api.bcb.BreadcrumbBarModel;
import org.pushingpixels.radiance.component.api.bcb.BreadcrumbItem;
import org.pushingpixels.radiance.component.api.bcb.JBreadcrumbBar;

import javax.swing.*;
import javax.swing.tree.TreeModel;
import java.awt.*;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

/**
 * Breadcrumb bar that allows wrapping an existing {@link JTree} or a
 * {@link TreeModel}.
 *
 * <ul>
 * <li>Use
 * {@link BreadcrumbTreeAdapterSelector#BreadcrumbTreeAdapterSelector(JTree)} to
 * wrap an existing tree that has a {@link JLabel} based renderer.</li>
 * <li>Use a
 * {@link BreadcrumbTreeAdapterSelector#BreadcrumbTreeAdapterSelector(JTree, TreeAdapter)}
 * to wrap an existing tree and provide a custom breadcrumb bar path renderer.</li>
 * <li>Use
 * {@link BreadcrumbTreeAdapterSelector#BreadcrumbTreeAdapterSelector(TreeModel, TreeAdapter, boolean)}
 * to wrap an existing tree model.</li>
 * </ul>
 *
 * @author Kirill Grouchnikov
 */
public class BreadcrumbTreeAdapterSelector<T> extends JBreadcrumbBar<T> {
    /**
     * Tree adapter that allows plugging a custom rendering logic.
     *
     * @author Kirill Grouchnikov
     */
    public interface TreeAdapter<T> {
        /**
         * Returns the caption for the specified tree node. Note that the
         * extending class <strong>must</strong> override this method in an
         * EDT-safe fashion.
         *
         * @param node Tree node.
         * @return The caption for the specified tree node.
         */
        String toString(final T node);

        /**
         * Returns the icon for the specified tree node.
         *
         * @param node Tree node.
         * @return The icon for the specified tree node.
         */
        default Icon getIcon(T node) {
            return null;
        }
    }

    /**
     * Tree-adapter specific implementation of the {@link BreadcrumbBarCallBack}
     * .
     *
     * @author Kirill Grouchnikov
     */
    private class TreeCallback extends BreadcrumbBarCallBack<T> {
        /**
         * The corresponding tree model.
         */
        private TreeModel treeModel;

        /**
         * The corresponding tree adapter. Can not be <code>null</code>.
         */
        private TreeAdapter<T> treeAdapter;

        /**
         * If <code>true</code>, the first selector shows the tree root node. If
         * <code>false</code>, the first selector shows the tree root child
         * nodes.
         */
        private boolean isRootVisible;

        /**
         * Creates the callback.
         *
         * @param treeModel     The corresponding tree model.
         * @param treeAdapter   The corresponding tree adapter. Can not be
         *                      <code>null</code>.
         * @param isRootVisible If <code>true</code>, the first selector shows the tree
         *                      root node. If <code>false</code>, the first selector shows
         *                      the tree root child nodes.
         */
        private TreeCallback(TreeModel treeModel, TreeAdapter<T> treeAdapter,
                boolean isRootVisible) {
            this.treeModel = treeModel;
            this.treeAdapter = treeAdapter;
            this.isRootVisible = isRootVisible;
        }

        @Override
        public List<BreadcrumbItem<T>> getPathChoices(List<BreadcrumbItem<T>> path) {
            if (path == null) {
                T root = (T) this.treeModel.getRoot();
                List<BreadcrumbItem<T>> bRoots = new LinkedList<>();
                if (isRootVisible) {
                    BreadcrumbItem<T> rootPair = new BreadcrumbItem<>(
                            this.treeAdapter.toString(root), root);
                    rootPair.setIcon(this.treeAdapter.getIcon(root));
                    bRoots.add(rootPair);
                } else {
                    for (int i = 0; i < this.treeModel.getChildCount(root); i++) {
                        T rootChild = (T) this.treeModel.getChild(root, i);
                        BreadcrumbItem<T> rootPair = new BreadcrumbItem<>(
                                this.treeAdapter.toString(rootChild), rootChild);
                        rootPair.setIcon(this.treeAdapter.getIcon(rootChild));
                        bRoots.add(rootPair);
                    }
                }
                return bRoots;
            }
            if (path.size() == 0) {
                return null;
            }

            T lastInPath = path.get(path.size() - 1).getData();
            if (this.treeModel.isLeaf(lastInPath)) {
                return null;
            }

            LinkedList<BreadcrumbItem<T>> lResult = new LinkedList<>();
            for (int i = 0; i < this.treeModel.getChildCount(lastInPath); i++) {
                T child = (T) this.treeModel.getChild(lastInPath, i);
                if (this.treeModel.isLeaf(child)) {
                    continue;
                }
                BreadcrumbItem<T> item = new BreadcrumbItem<>(
                        this.treeAdapter.toString(child), child);
                item.setIcon(this.treeAdapter.getIcon(child));
                lResult.add(item);
            }
            return lResult;
        }

        @Override
        public List<BreadcrumbItem<T>> getLeaves(List<BreadcrumbItem<T>> path) {
            T lastInPath = path.get(path.size() - 1).getData();
            if (this.treeModel.isLeaf(lastInPath)) {
                return null;
            }

            LinkedList<BreadcrumbItem<T>> lResult = new LinkedList<>();
            for (int i = 0; i < this.treeModel.getChildCount(lastInPath); i++) {
                T child = (T) this.treeModel.getChild(lastInPath, i);
                if (!this.treeModel.isLeaf(child)) {
                    continue;
                }
                BreadcrumbItem<T> item = new BreadcrumbItem<>(
                        this.treeAdapter.toString(child), child);
                item.setIcon(this.treeAdapter.getIcon(child));
                lResult.add(item);
            }
            return lResult;
        }

        @Override
        public InputStream getLeafContent(T leaf) {
            return null;
        }
    }

    /**
     * Creates an adapter for the specified tree model.
     *
     * @param treeModel     Tree model.
     * @param treeAdapter   Tree adapter. Can not be <code>null</code>.
     * @param isRootVisible If <code>true</code>, the first selector shows the tree root
     *                      node. If <code>false</code>, the first selector shows the tree
     *                      root child nodes.
     */
    public BreadcrumbTreeAdapterSelector(TreeModel treeModel,
            TreeAdapter<T> treeAdapter, boolean isRootVisible) {
        super(null);

        this.model = new BreadcrumbBarModel<>();
        this.callback = new TreeCallback(treeModel, treeAdapter, isRootVisible);

        this.updateUI();
    }

    /**
     * Creates an adapter for the specified tree.
     *
     * @param tree        Tree.
     * @param treeAdapter Tree adapter. Can not be <code>null</code>.
     */
    public BreadcrumbTreeAdapterSelector(JTree tree, TreeAdapter<T> treeAdapter) {
        this(tree.getModel(), treeAdapter, tree.isRootVisible());
    }

    /**
     * Creates an adapter for the specified tree. Assumes that the tree renderer
     * extends a {@link JLabel}. Otherwise, the path selectors will have no
     * captions and no icons.
     *
     * @param tree Tree.
     */
    public BreadcrumbTreeAdapterSelector(final JTree tree) {
        this(tree, new TreeAdapter<>() {
            private JLabel getRenderer(Object node) {
                Component renderer = tree.getCellRenderer().getTreeCellRendererComponent(
                        tree, node, false, false, tree.getModel().isLeaf(node), 0, false);
                if (renderer instanceof JLabel) {
                    return (JLabel) renderer;
                }
                return null;
            }

            @Override
            public String toString(Object node) {
                JLabel label = getRenderer(node);
                if (label != null) {
                    return label.getText();
                }
                return null;
            }

            @Override
            public Icon getIcon(Object node) {
                JLabel label = getRenderer(node);
                if (label != null) {
                    return label.getIcon();
                }
                return null;
            }
        });
    }
}
