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
package org.pushingpixels.flamingo.api.ribbon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JPanel;

import org.pushingpixels.flamingo.api.common.FlamingoCommand;

/**
 * Metadata description for the primary menu entries of the {@link RibbonApplicationMenu}. The
 * primary menu entries at runtime are represented by command menu buttons placed in the leading panel
 * of the application menu.
 * 
 * <p>
 * There are two different types of primary entries:
 * </p>
 * 
 * <ul>
 * <li>Associated {@link PrimaryRolloverCallback} set by the
 * {@link #setRolloverCallback(PrimaryRolloverCallback)} . When this entry is armed (with mouse
 * rollover or via keyboard navigation), the contents of the secondary area are populated by the
 * application callback implementation of
 * {@link PrimaryRolloverCallback#menuEntryActivated(javax.swing.JPanel)}. The <code>Open</code>
 * menu item is an example of such a primary menu entry, showing a list of recently opened files.
 * For a primary entry that is action-only, pass {@link PrimaryClearRolloverCallback} as the primary
 * rollover callback to clear the secondary area.</li>
 * <li>Associated list of {@link FlamingoCommand}s added with the
 * {@link #addSecondaryMenuGroup(String, FlamingoCommand...)} API. When this entry is armed (with
 * mouse rollover or via keyboard navigation), the secondary area shows menu buttons for the
 * registered secondary menu commands. The <code>Save As</code> menu item is an example of such a
 * primary menu item, showing a list of default save formats.</li>
 * </ul>
 * 
 * @author Kirill Grouchnikov
 */
public class RibbonApplicationMenuPrimaryCommand extends FlamingoCommand {
    /**
     * An optional rollover callback. It allows the application to place custom content in the
     * secondary panel of the {@link RibbonApplicationMenu} when this primary menu entry is
     * activated.
     * 
     * @see #setRolloverCallback(PrimaryRolloverCallback)
     * @see #getRolloverCallback()
     */
    private PrimaryRolloverCallback rolloverCallback;

    /**
     * Callback that allows application code to provide custom content on the secondary panel of the
     * {@link RibbonApplicationMenu}.
     * 
     * @author Kirill Grouchnikov
     */
    public static interface PrimaryRolloverCallback {
        /**
         * Called when the matching primary menu item is activated.
         * 
         * @param targetPanel
         *            The secondary panel of the {@link RibbonApplicationMenu}. Note that the
         *            application code <strong>must not</strong> change the parent hierarchy of this
         *            panel.
         */
        public void menuEntryActivated(JPanel targetPanel);
    }

    public static class PrimaryClearRolloverCallback implements PrimaryRolloverCallback {
        @Override
        public void menuEntryActivated(JPanel targetPanel) {
            targetPanel.removeAll();
            targetPanel.revalidate();
            targetPanel.repaint();
        }
    }

    /**
     * List of titles for all menu groups.
     */
    private List<String> groupTitles;

    /**
     * List of all menu groups.
     */
    private List<List<FlamingoCommand>> groupEntries;

    RibbonApplicationMenuPrimaryCommand() {
    }

    /**
     * Returns the number of secondary menu groups of this primary menu entry.
     * 
     * @return The number of secondary menu groups of this primary menu entry.
     * @see #getSecondaryGroupTitleAt(int)
     * @see #getSecondaryGroupEntries(int)
     */
    public int getSecondaryGroupCount() {
        return this.groupTitles.size();
    }

    /**
     * Returns the title of the secondary menu group at the specified index.
     * 
     * @param groupIndex
     *            The index of a secondary menu group.
     * @return The title of the secondary menu group at the specified index.
     * @see #getSecondaryGroupCount()
     * @see #getSecondaryGroupEntries(int)
     */
    public String getSecondaryGroupTitleAt(int groupIndex) {
        return this.groupTitles.get(groupIndex);
    }

    /**
     * Returns an unmodifiable list of commands of the secondary menu group at the specified index.
     * 
     * @param groupIndex
     *            The index of a secondary menu group.
     * @return An unmodifiable list of commands of the secondary menu group at the specified index.
     * @see #getSecondaryGroupCount()
     * @see #getSecondaryGroupTitleAt(int)
     */
    public List<FlamingoCommand> getSecondaryGroupCommands(int groupIndex) {
        return Collections.unmodifiableList(this.groupEntries.get(groupIndex));
    }

    /**
     * Returns the current application callback that allows placing custom content in the secondary
     * panel of the {@link RibbonApplicationMenu} when this primary menu entry is activated.
     * 
     * @return The current rollover callback for populating the secondary panel of the
     *         {@link RibbonApplicationMenu}.
     */
    public PrimaryRolloverCallback getRolloverCallback() {
        return rolloverCallback;
    }

    @Override
    protected boolean hasAction() {
        return super.hasAction() || (this.getRolloverCallback() != null);
    }

    @Override
    protected boolean hasPopup() {
        return super.hasPopup() || (this.getSecondaryGroupCount() > 0);
    }

    public static class RibbonApplicationMenuPrimaryCommandBuilder extends
            BaseFlamingoCommandBuilder<RibbonApplicationMenuPrimaryCommand, RibbonApplicationMenuPrimaryCommandBuilder> {
        /**
         * An optional rollover callback. It allows the application to place custom content in the
         * secondary panel of the {@link RibbonApplicationMenu} when this primary menu entry is
         * activated.
         * 
         * @see #setRolloverCallback(PrimaryRolloverCallback)
         */
        private PrimaryRolloverCallback rolloverCallback;

        /**
         * List of titles for all menu groups.
         */
        private List<String> groupTitles = new ArrayList<>();

        /**
         * List of all menu groups.
         */
        private List<List<FlamingoCommand>> groupEntries = new ArrayList<>();

        /**
         * Adds a titled group of secondary menu commands.
         * 
         * @param groupTitle
         *            The title of the group.
         * @param secondaryCommands
         *            The secondary menu commands belonging to this group.
         */
        public synchronized RibbonApplicationMenuPrimaryCommandBuilder addSecondaryMenuGroup(
                String groupTitle, FlamingoCommand... secondaryCommands) {
            this.groupTitles.add(groupTitle);
            List<FlamingoCommand> entryList = new ArrayList<FlamingoCommand>();
            this.groupEntries.add(entryList);
            for (FlamingoCommand entry : secondaryCommands) {
                entryList.add(entry);
            }
            return this;
        }

        /**
         * Sets the rollover callback that allows the application to place custom content in the
         * secondary panel of the {@link RibbonApplicationMenu} when this primary menu entry is
         * activated.
         * 
         * @param rolloverCallback
         *            The new rollover callback for populating the secondary panel of the
         *            {@link RibbonApplicationMenu}.
         */
        public RibbonApplicationMenuPrimaryCommandBuilder setRolloverCallback(
                PrimaryRolloverCallback rolloverCallback) {
            this.rolloverCallback = rolloverCallback;
            return this;
        }

        /**
         * Changes the title of the specified group.
         * 
         * @param groupIndex
         *            Group index.
         * @param newTitle
         *            New title for the specified group.
         */
        public synchronized RibbonApplicationMenuPrimaryCommandBuilder setSecondaryGroupTitle(
                int groupIndex, String newTitle) {
            this.groupTitles.set(groupIndex, newTitle);
            return this;
        }

        public RibbonApplicationMenuPrimaryCommand build() {
            RibbonApplicationMenuPrimaryCommand command = new RibbonApplicationMenuPrimaryCommand();

            this.configureBaseCommand(command);

            command.groupTitles = this.groupTitles;
            command.groupEntries = this.groupEntries;
            command.rolloverCallback = this.rolloverCallback;

            // command.checkConsistency();

            return command;
        }
    }
}
