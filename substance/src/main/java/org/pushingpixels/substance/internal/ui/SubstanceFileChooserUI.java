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
package org.pushingpixels.substance.internal.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileView;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicFileChooserUI;
import javax.swing.plaf.metal.MetalFileChooserUI;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.icon.SubstanceIconPack;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

/**
 * UI for file chooser in <b>Substance</b> look and feel. The {@link BasicFileChooserUI} can't be
 * used on its own (creates an empty dialog).
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceFileChooserUI extends MetalFileChooserUI {
    /**
     * Custom file view - for system icons on the files.
     */
    private final SubstanceFileView fileView = new SubstanceFileView();

    private final static int ICON_SIZE = 14;

    /**
     * Custom file view implementation that returns system-specific file icons.
     * 
     * @author Kirill Grouchnikov
     */
    private class SubstanceFileView extends BasicFileView {
        /**
         * Cache for the file icons.
         */
        private final Map<String, Icon> pathIconCache = new HashMap<String, Icon>();

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.plaf.basic.BasicFileChooserUI$BasicFileView#getCachedIcon (java.io.File)
         */
        @Override
        public Icon getCachedIcon(File f) {
            return pathIconCache.get(f.getPath());
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.plaf.basic.BasicFileChooserUI$BasicFileView#getIcon(java .io.File)
         */
        @Override
        public Icon getIcon(File f) {
            Icon icon = getCachedIcon(f);
            if (icon != null)
                return icon;

            icon = getDefaultIcon(f);
            // System.out.println("System : " + f.getAbsolutePath() + " --> "
            // + icon);
            if (icon == null) {
                icon = super.getIcon(f);
                if (icon == null) {
                    icon = new ImageIcon(SubstanceCoreUtilities.getBlankImage(8, 8));
                }
                // System.out.println("Super : " + f.getAbsolutePath() + " --> "
                // + icon);
            }
            cacheIcon(f, icon);
            return icon;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.plaf.basic.BasicFileChooserUI$BasicFileView#cacheIcon (java.io.File,
         * javax.swing.Icon)
         */
        @Override
        public void cacheIcon(File f, Icon icon) {
            pathIconCache.put(f.getPath(), icon);
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.plaf.basic.BasicFileChooserUI$BasicFileView#clearIconCache ()
         */
        @Override
        public void clearIconCache() {
            pathIconCache.clear();
        }

        /**
         * Returns the default file icon.
         * 
         * @param f
         *            File.
         * @return File icon.
         */
        public Icon getDefaultIcon(File f) {
            JFileChooser fileChooser = getFileChooser();
            Icon icon = fileChooser.getFileSystemView().getSystemIcon(f);
            if (icon instanceof SubstanceIconUIResource) {
                SubstanceIconPack iconPack = SubstanceCortex.GlobalScope.getIconPack();
                SubstanceColorScheme colorScheme = SubstanceCoreUtilities.getSkin(fileChooser)
                        .getEnabledColorScheme(DecorationAreaType.NONE);
                icon = f.isDirectory()
                        ? iconPack.getFileChooserDirectoryIcon(ICON_SIZE, colorScheme)
                        : iconPack.getFileChooserFileIcon(ICON_SIZE, colorScheme);
            }

            if (SubstanceCoreUtilities.useThemedDefaultIcon(null)) {
                icon = SubstanceCoreUtilities.getThemedIcon(fileChooser, icon);
            }
            return icon;
        }
    }

    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceFileChooserUI((JFileChooser) comp);
    }

    /**
     * Creates the UI delegate for the specified file chooser.
     * 
     * @param filechooser
     *            File chooser.
     */
    public SubstanceFileChooserUI(JFileChooser filechooser) {
        super(filechooser);
    }

    /*
     * (non-Javadoc)
     * 
     * @seejavax.swing.plaf.basic.BasicFileChooserUI#getFileView(javax.swing. JFileChooser)
     */
    @Override
    public FileView getFileView(JFileChooser fc) {
        return fileView;
    }

    @Override
    protected void installIcons(JFileChooser fc) {
        super.installIcons(fc);

        SubstanceIconPack iconPack = SubstanceCortex.GlobalScope.getIconPack();
        SubstanceColorScheme colorScheme = SubstanceCoreUtilities.getSkin(fc)
                .getEnabledColorScheme(DecorationAreaType.NONE);

        directoryIcon = iconPack.getFileChooserDirectoryIcon(ICON_SIZE, colorScheme);
        fileIcon = iconPack.getFileChooserFileIcon(ICON_SIZE, colorScheme);
        computerIcon = iconPack.getFileChooserComputerIcon(ICON_SIZE, colorScheme);
        hardDriveIcon = iconPack.getFileChooserHardDriveIcon(ICON_SIZE, colorScheme);
        floppyDriveIcon = iconPack.getFileChooserFloppyDriveIcon(ICON_SIZE, colorScheme);

        newFolderIcon = iconPack.getFileChooserNewFolderIcon(ICON_SIZE, colorScheme);
        upFolderIcon = iconPack.getFileChooserUpFolderIcon(ICON_SIZE, colorScheme);
        homeFolderIcon = iconPack.getFileChooserHomeFolderIcon(ICON_SIZE, colorScheme);
        detailsViewIcon = iconPack.getFileChooserDetailsViewIcon(ICON_SIZE, colorScheme);
        listViewIcon = iconPack.getFileChooserListViewIcon(ICON_SIZE, colorScheme);
        viewMenuIcon = iconPack.getFileChooserViewMenuIcon(ICON_SIZE, colorScheme);
    }

    @Override
    public void installComponents(JFileChooser fc) {
        super.installComponents(fc);

        JPanel buttonPanel = getButtonPanel();
        buttonPanel.setLayout(new SubstanceFooterLayout(
                SubstanceSizeUtils.getAdjustedSize(
                        SubstanceSizeUtils.getComponentFontSize(buttonPanel), 8, 4, 1, true),
                SubstanceCortex.GlobalScope.getButtonBarOrder().isDefaultButtonLeading()));
        buttonPanel.setBorder(new EmptyBorder(
                SubstanceSizeUtils.getAdjustedSize(
                        SubstanceSizeUtils.getComponentFontSize(buttonPanel), 16, 4, 1, true),
                0, 0, 0));
    }

    /**
     * This class extends ButtonAreaLayout from the base class because in one of the places there is
     * an explicit cast of the button container to that layout.
     */
    private static class SubstanceFooterLayout implements LayoutManager {
        private int padding;
        private boolean isDefaultButtonLeading;

        public SubstanceFooterLayout(int padding, boolean isDefaultButtonLeading) {
            this.padding = padding;
            this.isDefaultButtonLeading = isDefaultButtonLeading;
        }

        public void addLayoutComponent(String string, Component comp) {
        }

        private Dimension getMaxButtonSize(Container container) {
            Component[] children = container.getComponents();
            Dimension result = new Dimension(0, 0);
            for (Component child : children) {
                Dimension pref = child.getPreferredSize();
                result.width = Math.max(result.width, pref.width);
                result.height = Math.max(result.height, pref.height);
            }
            return result;
        }

        public void layoutContainer(Container container) {
            Component[] children = container.getComponents();

            if (children != null && children.length > 0) {
                int numChildren = children.length;
                Insets insets = container.getInsets();
                Dimension maxDimension = getMaxButtonSize(container);
                int totalButtonWidth = maxDimension.width * numChildren
                        + padding * (numChildren - 1);

                boolean isLeftToRight = container.getComponentOrientation().isLeftToRight();
                int buttonAlignment = SubstanceCoreUtilities.getButtonBarGravity(container);
                int x;
                switch (buttonAlignment) {
                    case SwingConstants.LEFT:
                        x = insets.left;
                        break;
                    case SwingConstants.CENTER:
                        x = (container.getWidth() - insets.left - insets.right - totalButtonWidth)
                                / 2;
                        break;
                    default:
                        x = container.getWidth() - insets.right - totalButtonWidth;
                }

                // Here we have four cases:
                // 1. Under LTR mode and button #0 leading - button #0 goes leftmost
                // 2. Under LTR mode and button #0 trailing - button #0 goes rightmost
                // 3. Under RTL mode and button #0 leading - button #0 goes rightmost
                // 4. Under RTL mode and button #0 trailing - button #0 goes leftmost
                // So the condition is to iterate over the child buttons in their order
                // and place them from left to right when the LTR'ness is the same
                // as the "default button is leading"'ness
                boolean iterateForward = (isLeftToRight == this.isDefaultButtonLeading);

                for (int counter = 0; counter < numChildren; counter++) {
                    int index = iterateForward ? counter : numChildren - counter - 1;
                    children[index].setBounds(x, insets.top, maxDimension.width,
                            maxDimension.height);
                    x += children[index].getWidth() + padding;
                }
            }
        }

        public Dimension minimumLayoutSize(Container container) {
            if (container == null) {
                return new Dimension(0, 0);
            }

            Component[] children = container.getComponents();
            if ((children == null) || (children.length == 0)) {
                return new Dimension(0, 0);
            }
            int numChildren = children.length;
            Insets insets = container.getInsets();

            Dimension maxDimension = getMaxButtonSize(container);
            return new Dimension(
                    insets.left + insets.right + maxDimension.width * numChildren
                            + padding * (numChildren - 1),
                    insets.top + insets.bottom + maxDimension.height);
        }

        public Dimension preferredLayoutSize(Container c) {
            return minimumLayoutSize(c);
        }

        public void removeLayoutComponent(Component c) {
        }
    }

}
