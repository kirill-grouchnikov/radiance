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
package org.pushingpixels.flamingo.api.common;

import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.neon.AsynchronousLoading;
import org.pushingpixels.neon.icon.ResizableIcon;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.util.*;
import java.util.List;

/**
 * Panel that hosts file-related command buttons with progress indication and cancellation
 * capabilities.
 *
 * @param <T> Type tag.
 * @author Kirill Grouchnikov
 */
public abstract class AbstractFileViewPanel<T> extends JCommandButtonPanel {
    /**
     * Maps from file name to the buttons.
     */
    private Map<String, JCommandButton> buttonMap;

    /**
     * Progress listener to report back on loaded images.
     */
    private ProgressListener progressListener;

    /**
     * Contains the buttons with completely loaded images.
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

        /**
         * Sets the leaf property with the specified name.
         *
         * @param propName  Property name.
         * @param propValue Property value.
         */
        public void setLeafProp(String propName, Object propValue) {
            this.leafProps.put(propName, propValue);
        }

        /**
         * Returns the map of all the properties of this leaf.
         *
         * @return Unmodifiable view of the map of all the properties of this leaf.
         */
        public Map<String, Object> getLeafProps() {
            return Collections.unmodifiableMap(this.leafProps);
        }
    }

    /**
     * Creates a new panel.
     *
     * @param startingDimension Initial dimension for icons.
     */
    public AbstractFileViewPanel(int startingDimension) {
        super(new CommandPanelContentModel(new ArrayList<>()),
                CommandPanelPresentationModel.builder()
                        .setCommandDisplayState(CommandButtonDisplayState.FIT_TO_ICON)
                        .setCommandIconDimension(startingDimension)
                        .setToShowGroupLabels(false).build());
        this.buttonMap = new HashMap<>();
        this.loadedSet = new HashSet<>();
    }

    /**
     * Creates a new panel.
     *
     * @param startingState Initial state for icons.
     */
    public AbstractFileViewPanel(CommandButtonDisplayState startingState) {
        super(new CommandPanelContentModel(new ArrayList<>()),
                CommandPanelPresentationModel.builder()
                        .setCommandHorizontalAlignment(SwingUtilities.LEADING)
                        .setCommandDisplayState(startingState)
                        .setToShowGroupLabels(false).build());
        this.buttonMap = new HashMap<>();
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
     * matching entry determined by the {@link #toShowFile(StringValuePair)} call, a new
     * {@link JCommandButton} hosting an the matching implementation of {@link ResizableIcon} is
     * added to the panel.
     *
     * @param leafs Information on the entries to show in the panel.
     */
    public void setFolder(final java.util.List<StringValuePair<T>> leafs) {
        this.getContentModel().removeAllCommandProjectionGroups();
        this.getContentModel().addCommandProjectionGroup(new CommandProjectionGroupModel(new ArrayList<>()));
        this.buttonMap.clear();
        int fileCount = 0;

        final Map<String, Command> newCommands = new HashMap<>();
        for (StringValuePair<T> leaf : leafs) {
            String name = leaf.getKey();
            if (!toShowFile(leaf)) {
                continue;
            }

            int initialSize = this.getPresentationModel().getCommandIconDimension();
            if (initialSize < 0) {
                initialSize = this.getPresentationModel().getCommandDisplayState()
                        .getPreferredIconSize();
            }
            Command command = Command.builder()
                    .setTitle(name).setIcon(new EmptyResizableIcon(initialSize)).build();

            int buttonIndex = this.addCommandToLastGroup(command);
            JCommandButton button = (JCommandButton) this.getGroupButtons(this.getGroupCount() - 1).
                    get(buttonIndex);

            newCommands.put(name, command);
            buttonMap.put(name, button);
            fileCount++;
        }
        this.doLayout();
        this.repaint();

        final int totalCount = fileCount;
        this.mainWorker = new SwingWorker<Void, Leaf>() {
            @Override
            protected Void doInBackground() throws Exception {
                if ((totalCount > 0) && (progressListener != null)) {
                    progressListener.onProgress(
                            new ProgressEvent(AbstractFileViewPanel.this, 0, totalCount, 0));
                }
                for (final StringValuePair<T> leafPair : leafs) {
                    if (isCancelled()) {
                        break;
                    }
                    final String name = leafPair.getKey();
                    if (!toShowFile(leafPair)) {
                        continue;
                    }
                    InputStream stream = getLeafContent(leafPair.getValue());
                    Leaf leaf = new Leaf(name, stream);
                    leaf.setLeafProp("source", leafPair.getValue());
                    for (Map.Entry<String, Object> propEntry : leafPair.getProps().entrySet()) {
                        leaf.setLeafProp(propEntry.getKey(), propEntry.getValue());
                    }
                    publish(leaf);
                }
                return null;
            }

            @Override
            protected void process(List<Leaf> leaves) {
                for (final Leaf leaf : leaves) {
                    final String name = leaf.getLeafName();
                    InputStream stream = leaf.getLeafStream();
                    int iconDimension = getPresentationModel().getCommandIconDimension();
                    Dimension dim = new Dimension(iconDimension, iconDimension);
                    final ResizableIcon icon = getResizableIcon(leaf, stream,
                            getPresentationModel().getCommandDisplayState(), dim);
                    if (icon == null) {
                        continue;
                    }
                    final Command command = newCommands.get(name);
                    command.setIcon(icon);

                    if (icon instanceof AsynchronousLoading) {
                        ((AsynchronousLoading) icon)
                                .addAsynchronousLoadListener((boolean success) -> {
                                    synchronized (AbstractFileViewPanel.this) {
                                        if (loadedSet.contains(command)) {
                                            return;
                                        }
                                        loadedSet.add(command);
                                        if (progressListener != null) {
                                            progressListener.onProgress(
                                                    new ProgressEvent(AbstractFileViewPanel.this, 0,
                                                            totalCount, loadedSet.size()));
                                        }
                                    }
                                });
                    }

                    configureCommand(leaf, command, icon);
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
     * Returns the button map.
     *
     * @return Unmodifiable view on the button map.
     */
    public Map<String, JCommandButton> getButtonMap() {
        return Collections.unmodifiableMap(buttonMap);
    }

    /**
     * Returns indication whether the specified file should be shown on this panel.
     *
     * @param pair Information on the file.
     * @return <code>true</code> if the specified file should be shown on this panel,
     * <code>false</code> otherwise.
     */
    protected abstract boolean toShowFile(StringValuePair<T> pair);

    /**
     * Returns the icon for the specified parameters.
     *
     * @param leaf      Information on the file.
     * @param stream    Input stream with the file contents.
     * @param state     Icon state.
     * @param dimension Icon dimension.
     * @return File icon.
     */
    protected abstract ResizableIcon getResizableIcon(Leaf leaf, InputStream stream,
            CommandButtonDisplayState state, Dimension dimension);

    /**
     * Configures the specified command. Can be used to wire additional behavior, such as
     * tooltips or action listeners if the specific panel implementation requires it.
     *
     * @param leaf    Information on the file "behind" the command.
     * @param command Command to configure.
     * @param icon    Command icon.
     */
    protected void configureCommand(Leaf leaf, Command command, ResizableIcon icon) {
    }

    /**
     * Returns the input stream with the file contents.
     *
     * @param leaf Leaf (file behind a command on this panel).
     * @return Input stream with the file contents.
     */
    protected abstract InputStream getLeafContent(T leaf);
}
