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
package org.pushingpixels.radiance.component.api.bcb.core;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.bcb.*;
import org.pushingpixels.radiance.component.internal.svg.folder_open_black_24dp;
import org.pushingpixels.radiance.component.internal.svg.insert_drive_file_black_24dp;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

/**
 * Breadcrumb bar that allows browsing the local file system.
 *
 * @author Kirill Grouchnikov
 * @author Brian Young
 */
public class BreadcrumbFileSelector extends JBreadcrumbBar<File> {
    private IconProvider iconProvider;

    public interface IconProvider {
        RadianceIcon.Factory getIconFactory(File file);
    }

    public static class FixedIconProvider implements IconProvider {
        @Override
        public RadianceIcon.Factory getIconFactory(File file) {
            if (file.isDirectory()) {
                return folder_open_black_24dp.factory();
            } else {
                return insert_drive_file_black_24dp.factory();
            }
        }
    }

    public static class EmptyIconProvider implements IconProvider {
        @Override
        public RadianceIcon.Factory getIconFactory(File file) {
            return null;
        }
    }

    /**
     * Local file system specific implementation of the
     * {@link BreadcrumbBarContentProvider}.
     *
     * @author Kirill Grouchnikov
     */
    private class FileSystemContentProvider extends BreadcrumbBarContentProvider<File> {
        /**
         * File system view.
         */
        private final FileSystemView fsv;

        /**
         * Creates a new callback.
         */
        public FileSystemContentProvider() {
            this(FileSystemView.getFileSystemView());
        }

        /**
         * Creates a new callback.
         *
         * @param fileSystemView File system view to use.
         */
        public FileSystemContentProvider(FileSystemView fileSystemView) {
            this.fsv = fileSystemView;
        }

        @Override
        public List<BreadcrumbItem<File>> getPathChoices(List<BreadcrumbItem<File>> path) {
            synchronized (fsv) {
                if (path == null) {
                    LinkedList<BreadcrumbItem<File>> bRoots = new LinkedList<>();
                    for (File root : fsv.getRoots()) {
                        if (fsv.isHiddenFile(root)) {
                            continue;
                        }
                        String systemName = fsv.getSystemDisplayName(root);
                        if (systemName.isEmpty()) {
                            systemName = root.getAbsolutePath();
                        }
                        BreadcrumbItem<File> rootItem = new BreadcrumbItem<>(systemName,
                                iconProvider.getIconFactory(root), root);
                        bRoots.add(rootItem);
                    }
                    return bRoots;
                }
                if (path.isEmpty()) {
                    return null;
                }
                File lastInPath = path.get(path.size() - 1).getData();

                if (!lastInPath.exists()) {
                    return new ArrayList<>();
                }
                if (!lastInPath.isDirectory()) {
                    return null;
                }
                LinkedList<BreadcrumbItem<File>> lResult = new LinkedList<>();
                for (File child : lastInPath.listFiles()) {
                    // ignore regular files and hidden directories
                    if (!child.isDirectory()) {
                        continue;
                    }
                    if (fsv.isHiddenFile(child)) {
                        continue;
                    }
                    String childFileName = fsv.getSystemDisplayName(child);
                    if ((childFileName == null) || childFileName.isEmpty()) {
                        childFileName = child.getName();
                    }
                    BreadcrumbItem<File> item = new BreadcrumbItem<>(childFileName,
                            iconProvider.getIconFactory(child), child);
                    lResult.add(item);
                }
                lResult.sort(new Comparator<>() {
                    @Override
                    public int compare(BreadcrumbItem<File> o1, BreadcrumbItem<File> o2) {
                        String key1 = fsv.isFileSystemRoot(o1.getData()) ?
                                o1.getData().getAbsolutePath() : o1.getData().getName();
                        String key2 = fsv.isFileSystemRoot(o2.getData()) ?
                                o2.getData().getAbsolutePath() : o2.getData().getName();
                        return key1.toLowerCase().compareTo(key2.toLowerCase());
                    }

                    @Override
                    public boolean equals(Object obj) {
                        return super.equals(obj);
                    }
                });
                return lResult;
            }
        }

        @Override
        public List<BreadcrumbItem<File>> getLeaves(List<BreadcrumbItem<File>> path) {
            synchronized (fsv) {
                if ((path == null) || (path.isEmpty())) {
                    return null;
                }
                File lastInPath = path.get(path.size() - 1).getData();
                if (!lastInPath.exists()) {
                    return new ArrayList<>();
                }
                if (!lastInPath.isDirectory()) {
                    return null;
                }
                LinkedList<BreadcrumbItem<File>> lResult = new LinkedList<>();
                for (File child : lastInPath.listFiles()) {
                    // ignore directories and hidden directories
                    if (child.isDirectory()) {
                        continue;
                    }
                    if (fsv.isHiddenFile(child)) {
                        continue;
                    }
                    String childFileName = fsv.getSystemDisplayName(child);
                    if ((childFileName == null) || childFileName.isEmpty()) {
                        childFileName = child.getName();
                    }
                    BreadcrumbItem<File> item = new BreadcrumbItem<>(childFileName,
                            iconProvider.getIconFactory(child), child);
                    lResult.add(item);
                }
                lResult.sort(new Comparator<>() {
                    @Override
                    public int compare(BreadcrumbItem<File> o1,
                            BreadcrumbItem<File> o2) {
                        String key1 = fsv.isFileSystemRoot(o1.getData()) ?
                                o1.getData().getAbsolutePath() : o1.getData().getName();
                        String key2 = fsv.isFileSystemRoot(o2.getData()) ?
                                o2.getData().getAbsolutePath() : o2.getData().getName();
                        return key1.toLowerCase().compareTo(key2.toLowerCase());
                    }

                    @Override
                    public boolean equals(Object obj) {
                        return super.equals(obj);
                    }
                });
                return lResult;
            }
        }

        @Override
        public InputStream getLeafContent(File leaf) {
            try {
                return new FileInputStream(leaf);
            } catch (FileNotFoundException fnfe) {
                return null;
            }
        }
    }

    /**
     * Creates a new breadcrumb bar file selector that uses native icons and the
     * default file system view.
     */
    public BreadcrumbFileSelector() {
        this(FileSystemView.getFileSystemView(), new FixedIconProvider(),
                BreadcrumbBarPresentationModel.builder().setIconFilterStrategies(
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                        RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT
                ).build());
    }

    /**
     * Creates a new breadcrumb bar file selector.
     *
     * @param fileSystemView File system view.
     * @param iconProvider Icon provider.
     */
    public BreadcrumbFileSelector(FileSystemView fileSystemView, IconProvider iconProvider,
            BreadcrumbBarPresentationModel presentationModel) {
        super(null, presentationModel);

        this.contentModel = new BreadcrumbBarContentModel<>();
        this.iconProvider = iconProvider;
        this.contentProvider = new FileSystemContentProvider(fileSystemView);

        this.updateUI();
    }

    /**
     * Sets the selected path based of the specified file. If this file is
     * either <code>null</code> or not a directory, the home directory is
     * selected.
     *
     * @param dir Points to a directory to be selected.
     */
    public void setPath(File dir) {
        final FileSystemView fsv = FileSystemView.getFileSystemView();

        if ((dir == null) || !dir.isDirectory()) {
            dir = fsv.getHomeDirectory();
        }

        ArrayList<BreadcrumbItem<File>> path = new ArrayList<>();
        File parent = dir;
        BreadcrumbItem<File> bci = new BreadcrumbItem<>(fsv.getSystemDisplayName(dir),
                this.iconProvider.getIconFactory(dir), dir);
        path.add(bci);
        while (true) {
            parent = fsv.getParentDirectory(parent);
            if (parent == null) {
                break;
            }
            bci = new BreadcrumbItem<>(fsv.getSystemDisplayName(parent),
                    this.iconProvider.getIconFactory(parent), parent);
            path.add(bci);
        }
        Collections.reverse(path);
        this.setPath(path);
    }
}
