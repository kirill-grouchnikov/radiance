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
package org.pushingpixels.radiance.theming.internal.utils.icon;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.ui.RadianceTreeUI;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Icon factory for dynamically-changing icons. This class is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceIconFactory {
    /**
     * Icons for tree collapse / expand in {@link RadianceTreeUI}.
     */
    private static LazyResettableHashMap<RadianceIcon> treeIcons =
            new LazyResettableHashMap<>("RadianceIconFactory.treeIcon");

    public static RadianceIcon getTreeIcon(JTree tree, boolean isCollapsed) {
        double scale = RadianceCommonCortex.getScaleFactor(tree);
        int fontSize = RadianceSizeUtils.getComponentFontSize(tree);
        int size = RadianceSizeUtils.getTreeIconSize(fontSize);

        ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(scale, size, isCollapsed);
        if (RadianceIconFactory.treeIcons.get(key) == null) {
            RadianceIcon icon = new TreeIcon(size, isCollapsed);
            RadianceIconFactory.treeIcons.put(key, icon);
        }
        return RadianceIconFactory.treeIcons.get(key);
    }

    /**
     * Collapse / expand icons for JTrees in {@link RadianceTreeUI}.
     * 
     * @author Kirill Grouchnikov
     */
    private static class TreeIcon implements RadianceIcon, UIResource {
        /**
         * Icon hash.
         */
        private static LazyResettableHashMap<ScaleAwareImageWrapperIcon> icons =
                new LazyResettableHashMap<>("RadianceIconFactory.TreeIcon");

        /**
         * The collapsed indication of this icon
         */
        private boolean isCollapsed;

        private int size;

        /**
         * Simple constructor.
         * 
         * @param isCollapsed
         *            The collapsed indication of <code>this</code> icon.
         */
        public TreeIcon(int size, boolean isCollapsed) {
            this.isCollapsed = isCollapsed;
            this.size = size;
        }

        @Override
        public void setDimension(Dimension newDimension) {
            this.size = newDimension.width;
        }

        @Override
        public boolean supportsColorFilter() {
            return false;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            throw new UnsupportedOperationException();
        }

        /**
         * Retrieves icon that matches the specified state of the tree.
         */
        private static ScaleAwareImageWrapperIcon getIcon(JTree tree, boolean isCollapsed) {
            double scale = RadianceCommonCortex.getScaleFactor(tree);
            ComponentState state = ((tree == null) || tree.isEnabled()) ? ComponentState.ENABLED
                    : ComponentState.DISABLED_UNSELECTED;
            RadianceColorScheme fillScheme = RadianceColorSchemeUtilities.getColorScheme(tree,
                    state);
            RadianceColorScheme borderScheme = RadianceColorSchemeUtilities.getColorScheme(tree,
                    ColorSchemeAssociationKind.BORDER, state);
            RadianceColorScheme markScheme = RadianceColorSchemeUtilities.getColorScheme(tree,
                    ColorSchemeAssociationKind.MARK, state);

            int fontSize = RadianceSizeUtils.getComponentFontSize(tree);

            ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                    scale, fontSize,
                    fillScheme.getDisplayName(), borderScheme.getDisplayName(),
                    markScheme.getDisplayName(), isCollapsed);

            ScaleAwareImageWrapperIcon result = TreeIcon.icons.get(key);
            if (result != null) {
                return result;
            }

            result = new ScaleAwareImageWrapperIcon(RadianceImageCreator.getTreeIcon(
                    tree, fillScheme, borderScheme, markScheme, isCollapsed), scale);
            TreeIcon.icons.put(key, result);

            return result;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            if (!(g instanceof Graphics2D)) {
                return;
            }

            // The following check is here because some applications
            // (like JIDE's ExpandablePanel) may decide to use the
            // "Tree.collapsedIcon" and "Tree.expandedIcon" UIManager
            // entries to paint on non-JTree components. Sigh.
            JTree tree = (c instanceof JTree) ? (JTree) c : null;
            ScaleAwareImageWrapperIcon iconToDraw = TreeIcon.getIcon(tree, this.isCollapsed);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.translate(x, y);
            iconToDraw.paintIcon(c, g2d, 0, 0);
            g2d.dispose();
        }

        @Override
        public int getIconWidth() {
            return this.size;
        }

        @Override
        public int getIconHeight() {
            return this.size;
        }
    }

    /**
     * Icon kind of a title pane button.
     * 
     * @author Kirill Grocuhnikov.
     */
    public enum IconKind {
        /**
         * Icon of a close button.
         */
        CLOSE,

        /**
         * Icon of a minimize button.
         */
        MINIMIZE,

        /**
         * Icon of a maximize button.
         */
        MAXIMIZE,

        /**
         * Icon of a restore button.
         */
        RESTORE
    }

    /**
     * Cache of title pane icons.
     */
    private static final Map<IconKind, LazyResettableHashMap<ScaleAwareImageWrapperIcon>> titlePaneIcons =
            RadianceIconFactory.createTitlePaneIcons();

    /**
     * Creates an empty map of title pane icons.
     * 
     * @return Empty map of title pane icons.
     */
    private static Map<IconKind, LazyResettableHashMap<ScaleAwareImageWrapperIcon>> createTitlePaneIcons() {
        Map<IconKind, LazyResettableHashMap<ScaleAwareImageWrapperIcon>> result = new HashMap<>();

        result.put(IconKind.CLOSE, new LazyResettableHashMap<>("Close title pane icons"));
        result.put(IconKind.MINIMIZE, new LazyResettableHashMap<>("Minimize title pane icons"));
        result.put(IconKind.MAXIMIZE, new LazyResettableHashMap<>("Maximize title pane icons"));
        result.put(IconKind.RESTORE, new LazyResettableHashMap<>("Restore title pane icons"));
        return result;
    }

    /**
     * Returns title pane icon of the specified kind.
     * 
     * @param iconKind
     *            Icon kind.
     * @param scheme
     *            Color scheme.
     * @return Title pane icon of the specified kind.
     */
    public static ScaleAwareImageWrapperIcon getTitlePaneIcon(Component titlePane,
            IconKind iconKind, RadianceColorScheme scheme) {
        LazyResettableHashMap<ScaleAwareImageWrapperIcon> kindMap =
                RadianceIconFactory.titlePaneIcons.get(iconKind);
        ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                RadianceCommonCortex.getScaleFactor(titlePane), scheme.getDisplayName());
        ScaleAwareImageWrapperIcon result = kindMap.get(key);
        if (result != null)
            return result;

        switch (iconKind) {
            case CLOSE:
                result = RadianceImageCreator.getCloseIcon(titlePane, scheme);
                break;
            case MINIMIZE:
                result = RadianceImageCreator.getMinimizeIcon(titlePane, scheme);
                break;
            case MAXIMIZE:
                result = RadianceImageCreator.getMaximizeIcon(titlePane, scheme);
                break;
            case RESTORE:
                result = RadianceImageCreator.getRestoreIcon(titlePane, scheme);
                break;
        }
        kindMap.put(key, result);
        return result;
    }
}
