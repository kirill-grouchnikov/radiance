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
package org.pushingpixels.radiance.component.api.common;

import org.pushingpixels.radiance.common.api.AsynchronousLoading;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.bcb.BreadcrumbItem;
import org.pushingpixels.radiance.component.api.common.icon.EmptyRadianceIcon;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandGroup;
import org.pushingpixels.radiance.component.api.common.model.CommandPanelContentModel;
import org.pushingpixels.radiance.component.api.common.model.CommandPanelPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandPanelProjection;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.util.List;
import java.util.*;

/**
 * Panel that hosts file-related command buttons with progress indication and cancellation
 * capabilities.
 *
 * @param <T> Type tag of the underlying data.
 * @author Kirill Grouchnikov
 */
public abstract class AbstractFileViewPanel<T> extends JCommandButtonPanel {
    /**
     * Progress listener to report back on loaded images.
     */
    private ProgressListener progressListener;

    /**
     * Contains the commands with completely loaded images.
     */
    private Set<Command> loadedSet;

    /**
     * The main worker that loads the images off EDT.
     */
    private SwingWorker<Void, Leaf> mainWorker;

    /**
     * Information on the specific file. Depending on the actual type of the file repository, the
     * property map will have different keys.
     *
     * @author Kirill Grouchnikov
     */
    public static class Leaf {
        /**
         * Leaf name.
         */
        protected String leafName;

        /**
         * Stream with the contents of the leaf file.
         */
        protected InputStream leafStream;

        /**
         * Leaf property map.
         */
        protected Map<String, Object> leafProps;

        /**
         * Creates a new leaf.
         *
         * @param leafName   Leaf name.
         * @param leafStream Stream with the contents of the leaf file.
         */
        public Leaf(String leafName, InputStream leafStream) {
            this.leafName = leafName;
            this.leafStream = leafStream;
            this.leafProps = new HashMap<>();
        }

        /**
         * Returns the leaf name.
         *
         * @return Leaf name.
         */
        public String getLeafName() {
            return leafName;
        }

        /**
         * Returns the stream with the contents of the leaf file.
         *
         * @return Stream with the contents of the leaf file.
         */
        public InputStream getLeafStream() {
            return leafStream;
        }

        /**
         * Returns the leaf property with the specified name.
         *
         * @param propName Property name.
         * @return Leaf property with the specified name.
         */
        public Object getLeafProp(String propName) {
            return this.leafProps.get(propName);
        }
    }

    /**
     * Creates a new panel.
     *
     * @param startingDimension Initial dimension for icons.
     */
    public AbstractFileViewPanel(Dimension startingDimension) {
        super(new CommandPanelProjection(new CommandPanelContentModel(new ArrayList<>()),
                CommandPanelPresentationModel.builder()
                        .setCommandPresentationState(CommandButtonPresentationState.FIT_TO_ICON)
                        .setCommandIconDimension(startingDimension)
                        .setToShowGroupLabels(false).build()));
        this.loadedSet = new HashSet<>();
    }

    /**
     * Creates a new panel.
     *
     * @param startingState Initial state for icons.
     */
    public AbstractFileViewPanel(CommandButtonPresentationState startingState) {
        super(new CommandPanelProjection(new CommandPanelContentModel(new ArrayList<>()),
                CommandPanelPresentationModel.builder()
                        .setCommandHorizontalAlignment(SwingUtilities.LEADING)
                        .setCommandPresentationState(startingState)
                        .setToShowGroupLabels(false).build()));
        this.loadedSet = new HashSet<>();
    }

    public void setProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    public ProgressListener getProgressListener() {
        return this.progressListener;
    }

    /**
     * Sets the current entries to show. The current contents of the panel are discarded. For each
     * matching entry determined by the {@link #toShowFile(BreadcrumbItem)} call, a new
     * {@link JCommandButton} with matching implementation of {@link RadianceIcon} from
     * {@link #getRadianceIcon(Leaf, InputStream, CommandButtonPresentationState, Dimension)} is
     * added to the panel.
     *
     * @param leaves Information on the entries to show in the panel.
     */
    public void setFolder(final List<BreadcrumbItem<T>> leaves) {
        final CommandPanelContentModel contentModel = this.getProjection().getContentModel();
        contentModel.removeAllCommandGroups();

        CommandGroup commandGroup = new CommandGroup();
        contentModel.addCommandGroup(commandGroup);

        int fileCount = 0;
        for (BreadcrumbItem<T> leaf : leaves) {
            if (!toShowFile(leaf)) {
                continue;
            }

            // Create a command with empty icon factory. The icons will be loaded off the EDT / UI thread
            // a bit later in this method
            Command command = Command.builder()
                    .setText(leaf.getDisplayName())
                    .setIconFactory(EmptyRadianceIcon.factory())
                    .build();

            // We only have one command group in this projection's content model
            commandGroup.addCommand(command);

            fileCount++;
        }
        this.doLayout();
        this.repaint();

        final int totalCount = fileCount;
        this.mainWorker = new SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                if ((totalCount > 0) && (progressListener != null)) {
                    progressListener.onProgress(
                            new ProgressEvent(AbstractFileViewPanel.this, 0, totalCount, 0));
                }
                for (final BreadcrumbItem<T> leafItem : leaves) {
                    if (isCancelled()) {
                        break;
                    }
                    if (!toShowFile(leafItem)) {
                        continue;
                    }
                    InputStream stream = getLeafContent(leafItem.getData());
                    Leaf leaf = new Leaf(leafItem.getDisplayName(), stream);
                    publish(leaf);
                }
                return null;
            }

            @Override
            protected void process(List<Leaf> leaves) {
                for (final Leaf leaf : leaves) {
                    final String name = leaf.getLeafName();
                    InputStream stream = leaf.getLeafStream();
                    Dimension dim = getProjection().getPresentationModel().getCommandIconDimension();
                    final RadianceIcon icon = getRadianceIcon(leaf, stream,
                            getProjection().getPresentationModel().getCommandPresentationState(),
                            dim);
                    if (icon == null) {
                        continue;
                    }
                    // Find the matching command so that we can set the icon factory based on the newly
                    // loaded SVG content. The assumption here is that the underlying file system (local
                    // or remote) enforces unique file names in the same folder.
                    final Command matchingCommand = contentModel.findFirstMatch(
                            command -> name.equals(command.getText()));
                    matchingCommand.setIconFactory(() -> icon);

                    if (icon instanceof AsynchronousLoading) {
                        ((AsynchronousLoading) icon)
                                .addAsynchronousLoadListener((boolean success) -> {
                                    synchronized (AbstractFileViewPanel.this) {
                                        if (loadedSet.contains(matchingCommand)) {
                                            return;
                                        }
                                        loadedSet.add(matchingCommand);
                                        if (progressListener != null) {
                                            progressListener.onProgress(
                                                    new ProgressEvent(AbstractFileViewPanel.this, 0,
                                                            totalCount, loadedSet.size()));
                                        }
                                    }
                                });
                    }

                    configureCommand(leaf, matchingCommand, icon);
                }
            }
        };
        mainWorker.execute();
    }

    /**
     * Returns the number of loaded icons.
     *
     * @return The number of loaded icons.
     */
    public int getLoadedIconCount() {
        return this.loadedSet.size();
    }

    /**
     * Cancels the pending processing.
     */
    public void cancelMainWorker() {
        if (this.mainWorker == null) {
            return;
        }
        if (this.mainWorker.isDone() || this.mainWorker.isCancelled()) {
            return;
        }
        this.mainWorker.cancel(false);
    }

    /**
     * Returns indication whether the specified file should be shown on this panel.
     *
     * @param item Information on the file.
     * @return <code>true</code> if the specified file should be shown on this panel,
     * <code>false</code> otherwise.
     */
    protected abstract boolean toShowFile(BreadcrumbItem<T> item);

    /**
     * Returns the icon for the specified parameters.
     *
     * @param leaf      Information on the file.
     * @param stream    Input stream with the file contents.
     * @param state     Icon state.
     * @param dimension Icon dimension.
     * @return File icon.
     */
    protected abstract RadianceIcon getRadianceIcon(Leaf leaf, InputStream stream,
            CommandButtonPresentationState state, Dimension dimension);

    /**
     * Configures the specified command. Can be used to wire additional behavior, such as
     * tooltips or action listeners if the specific panel implementation requires it.
     *
     * @param leaf    Information on the file "behind" the command.
     * @param command Command to configure.
     * @param icon    Command icon.
     */
    protected void configureCommand(Leaf leaf, Command command, RadianceIcon icon) {
    }

    /**
     * Returns the input stream with the file contents.
     *
     * @param leaf Leaf (file behind a command on this panel).
     * @return Input stream with the file contents.
     */
    protected abstract InputStream getLeafContent(T leaf);
}
