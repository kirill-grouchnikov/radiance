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

import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.swing.SwingConstants;

import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.CommandButtonLayoutManager;
import org.pushingpixels.flamingo.api.common.FlamingoCommand;
import org.pushingpixels.flamingo.api.common.JCommandMenuButton;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.flamingo.internal.ui.ribbon.CommandButtonLayoutManagerBigFixed;
import org.pushingpixels.flamingo.internal.ui.ribbon.CommandButtonLayoutManagerBigFixedLandscape;
import org.pushingpixels.flamingo.internal.ui.ribbon.JBandControlPanel;
import org.pushingpixels.flamingo.internal.ui.ribbon.JRibbonGallery;

/**
 * Ribbon band component. Can host three types of content:
 * 
 * <ul>
 * <li>Ribbon commands added with
 * {@link #addRibbonCommand(FlamingoCommand, RibbonElementPriority)}.</li>
 * <li>Wrapped core / 3rd party components added with {@link #addRibbonComponent(JRibbonComponent)}
 * or {@link #addRibbonComponent(JRibbonComponent, int)}.</li>
 * <li>Ribbon galleries added with
 * {@link #addRibbonGallery(String, List, Map, int, int, RibbonElementPriority)} .</li>
 * </ul>
 * 
 * <p>
 * Commands are added with associated {@link RibbonElementPriority}. The higher the priority, the
 * longer the presentation button "stays" in the {@link CommandButtonDisplayState#BIG} or
 * {@link CommandButtonDisplayState#MEDIUM} state - depending on the available resize policies.
 * </p>
 * 
 * <p>
 * Wrapped components can span one or multiple rows. Use the
 * {@link #addRibbonComponent(JRibbonComponent, int)} API to add a wrapped component that spans more
 * than one row.
 * </p>
 * 
 * <p>
 * Once a ribbon gallery is added with
 * {@link #addRibbonGallery(String, List, Map, int, int, RibbonElementPriority)} , you can use the
 * following APIs to configure the content and behavior of that gallery:
 * </p>
 * 
 * <ul>
 * <li>{@link #addRibbonGalleryCommands(String, String, FlamingoCommand...)}</li>
 * <li>{@link #removeRibbonGalleryCommands(String, FlamingoCommand...)}</li>
 * <li>{@link #setSelectedRibbonGalleryCommand(String, FlamingoCommand)}</li>
 * <li>{@link #setRibbonGalleryExpandKeyTip(String, String)}</li>
 * <li>{@link #setRibbonGalleryPopupCallback(String, RibbonGalleryPopupCallback)}</li>
 * </ul>
 * 
 * <p>
 * A ribbon band can have multiple visual groups separated with vertical separator lines. To start a
 * new unnamed group use the {@link #startGroup()} API. To start a new named group use the
 * {@link #startGroup(String)} API. Unnamed groups will have three rows of controls. Named groups
 * will have two rows of controls, with the top row showing the group title.
 * </p>
 * 
 * @author Kirill Grouchnikov
 */
public class JRibbonBand extends AbstractRibbonBand<JBandControlPanel> {
    /**
     * This callback allows application code to place additional menu entries in the popup menu
     * shown when the ribbon gallery expand button is clicked. Application code should use
     * {@link JCommandPopupMenu#addMenuButton(JCommandMenuButton)} and
     * {@link JCommandPopupMenu#addMenuSeparator()} APIs on the passed menu parameter.
     * 
     * @author Kirill Grouchnikov
     */
    public static interface RibbonGalleryPopupCallback {
        /**
         * Called just before the popup menu is about to be shown.
         * 
         * @param menu
         *            The popup menu that will be shown.
         */
        public void popupToBeShown(JCommandPopupMenu menu);
    }

    /**
     * Big size with landscape orientation. Used for buttons in in-ribbon galleries.
     */
    public static final CommandButtonDisplayState BIG_FIXED_LANDSCAPE = new CommandButtonDisplayState(
            "Big Fixed Landscape", 32) {
        @Override
        public CommandButtonLayoutManager createLayoutManager(AbstractCommandButton button) {
            return new CommandButtonLayoutManagerBigFixedLandscape();
        }
    };

    /**
     * Big size with landscape orientation. Used for buttons in in-ribbon galleries.
     */
    public static final CommandButtonDisplayState BIG_FIXED = new CommandButtonDisplayState(
            "Big Fixed", 32) {
        @Override
        public CommandButtonLayoutManager createLayoutManager(AbstractCommandButton button) {
            return new CommandButtonLayoutManagerBigFixed();
        }
    };

    /**
     * Creates a new ribbon band.
     * 
     * @param title
     *            Band title.
     * @param icon
     *            Associated icon (for collapsed state).
     */
    public JRibbonBand(String title, ResizableIcon icon) {
        this(title, icon, null);
    }

    /**
     * Creates a new ribbon band.
     * 
     * @param title
     *            Band title.
     * @param icon
     *            Associated icon (for collapsed state).
     * @param expandActionListener
     *            Expand action listener (can be <code>null</code>).
     */
    public JRibbonBand(String title, ResizableIcon icon, ActionListener expandActionListener) {
        super(title, icon, expandActionListener, new JBandControlPanel());
        this.resizePolicies = Collections
                .unmodifiableList(CoreRibbonResizePolicies.getCorePoliciesPermissive(this));
        updateUI();
    }

    /**
     * Adds the specified command to <code>this</code> band.
     * 
     * @param ribbonCommand
     *            Command to add.
     * @param priority
     *            Priority of the command.
     */
    public AbstractCommandButton addRibbonCommand(FlamingoCommand ribbonCommand,
            RibbonElementPriority priority) {
        AbstractCommandButton commandButton = ribbonCommand.buildButton();
        commandButton.setHorizontalAlignment(SwingConstants.LEADING);
        this.controlPanel.addCommandButton(commandButton, priority);
        return commandButton;
    }

    public void addRibbonGallery(String galleryName,
            List<StringValuePair<List<FlamingoCommand>>> commands,
            Map<RibbonElementPriority, Integer> preferredVisibleCommandCounts,
            int preferredPopupMaxCommandColumns, int preferredPopupMaxVisibleCommandRows,
            RibbonElementPriority priority) {
        this.addRibbonGallery(galleryName, commands, preferredVisibleCommandCounts,
                preferredPopupMaxCommandColumns, preferredPopupMaxVisibleCommandRows,
                JRibbonBand.BIG_FIXED_LANDSCAPE, priority);
    }

    /**
     * Adds a new ribbon gallery to <code>this</code> band.
     * 
     * @param galleryName
     *            Gallery name.
     * @param commands
     *            Command groups.
     * @param preferredVisibleCommandCounts
     *            Preferred count of visible commands of the ribbon gallery under different states.
     * @param preferredPopupMaxCommandColumns
     *            Preferred maximum columns in the popup gallery associated with the ribbon gallery.
     * @param preferredPopupMaxVisibleCommandRows
     *            Preferred maximum visible rows in the popup gallery associated with the ribbon
     *            gallery.
     * @param priority
     *            The initial ribbon gallery priority.
     * @see #addRibbonGalleryCommands(String, String, FlamingoCommand...)
     * @see #removeRibbonGalleryCommands(String, FlamingoCommand...)
     * @see #setSelectedRibbonGalleryCommand(String, FlamingoCommand)
     */
    public void addRibbonGallery(String galleryName,
            List<StringValuePair<List<FlamingoCommand>>> commands,
            Map<RibbonElementPriority, Integer> preferredVisibleCommandCounts,
            int preferredPopupMaxCommandColumns, int preferredPopupMaxVisibleCommandRows,
            CommandButtonDisplayState commandDisplayState, RibbonElementPriority priority) {
        JRibbonGallery gallery = new JRibbonGallery();
        gallery.setCommandDisplayState(commandDisplayState);
        gallery.setName(galleryName);
        for (Map.Entry<RibbonElementPriority, Integer> prefCountEntry : preferredVisibleCommandCounts
                .entrySet()) {
            gallery.setPreferredVisibleButtonCount(prefCountEntry.getKey(),
                    prefCountEntry.getValue());
        }
        gallery.setGroupMapping(commands);
        gallery.setPreferredPopupPanelDimension(preferredPopupMaxCommandColumns,
                preferredPopupMaxVisibleCommandRows);

        this.controlPanel.addRibbonGallery(gallery, priority);
    }

    /**
     * Adds the specified command toggle commands to a command group in the specified ribbon gallery.
     * 
     * @param galleryName
     *            Ribbon gallery name.
     * @param commandGroupName
     *            Command group name.
     * @param commands
     *            Commands to add.
     * @see #addRibbonGallery(String, List, Map, int, int, RibbonElementPriority)
     * @see #addRibbonGallery(String, List, Map, int, int, CommandButtonDisplayState, RibbonElementPriority)
     * @see #removeRibbonGalleryCommands(String, FlamingoCommand...)
     * @see #setSelectedRibbonGalleryCommand(String, FlamingoCommand)
     */
    public void addRibbonGalleryCommands(String galleryName, String commandGroupName,
            FlamingoCommand... commands) {
        JRibbonGallery gallery = this.controlPanel.getRibbonGallery(galleryName);
        if (gallery == null)
            return;
        gallery.addRibbonGalleryCommands(commandGroupName, commands);
    }

    /**
     * Removes commands from the specified ribbon gallery.
     * 
     * @param galleryName
     *            Ribbon gallery name.
     * @param commands
     *            Commands to remove.
     * @see #addRibbonGallery(String, List, Map, int, int, CommandButtonDisplayState, RibbonElementPriority)
     * @see #addRibbonGalleryCommands(String, String, FlamingoCommand...)
     * @see #setSelectedRibbonGalleryCommand(String, FlamingoCommand)
     */
    public void removeRibbonGalleryCommands(String galleryName, FlamingoCommand... commands) {
        JRibbonGallery gallery = this.controlPanel.getRibbonGallery(galleryName);
        if (gallery == null)
            return;
        gallery.removeRibbonGalleryCommands(commands);
    }

    /**
     * Selects the specified command in the specified ribbon gallery.
     * 
     * @param galleryName
     *            Ribbon gallery name.
     * @param commandToSelect
     *            Command to select.
     * @see #addRibbonGallery(String, List, Map, int, int, RibbonElementPriority)
     * @see #addRibbonGallery(String, List, Map, int, int, CommandButtonDisplayState, RibbonElementPriority)
     * @see #addRibbonGalleryCommands(String, String, FlamingoCommand...)
     * @see #removeRibbonGalleryCommands(String, FlamingoCommand...)
     */
    public void setSelectedRibbonGalleryCommand(String galleryName,
            FlamingoCommand commandToSelect) {
        JRibbonGallery gallery = this.controlPanel.getRibbonGallery(galleryName);
        if (gallery == null)
            return;
        gallery.setSelectedCommand(commandToSelect);
    }

    /**
     * Sets the display state for the commands of the specified ribbon gallery.
     * 
     * @param galleryName
     *            Ribbon gallery name.
     * @param displayState
     *            Display state for the commands of the matching ribbon gallery.
     */
    public void setRibbonGalleryCommandDisplayState(String galleryName,
            CommandButtonDisplayState displayState) {
        JRibbonGallery gallery = this.controlPanel.getRibbonGallery(galleryName);
        if (gallery == null)
            return;
        gallery.setCommandDisplayState(displayState);
    }

    /**
     * Sets the application callback to place additional entries in the popup menu shown when the
     * specified ribbon gallery is expanded.
     * 
     * @param galleryName
     *            Gallery name.
     * @param popupCallback
     *            Application callback.
     * @see RibbonGalleryPopupCallback
     */
    public void setRibbonGalleryPopupCallback(String galleryName,
            RibbonGalleryPopupCallback popupCallback) {
        JRibbonGallery gallery = this.controlPanel.getRibbonGallery(galleryName);
        if (gallery == null)
            return;
        gallery.setPopupCallback(popupCallback);
    }

    /**
     * Sets the key tip on the expand button of the specified ribbon gallery.
     * 
     * @param galleryName
     *            Gallery name.
     * @param expandKeyTip
     *            The key tip on the expand button of the specified ribbon gallery.
     */
    public void setRibbonGalleryExpandKeyTip(String galleryName, String expandKeyTip) {
        JRibbonGallery gallery = this.controlPanel.getRibbonGallery(galleryName);
        if (gallery == null)
            return;
        gallery.setExpandKeyTip(expandKeyTip);
    }

    /**
     * Adds the specified ribbon component to this ribbon band.
     * 
     * @param comp
     *            The ribbon component to add.
     */
    public void addRibbonComponent(JRibbonComponent comp) {
        this.controlPanel.addRibbonComponent(comp);
    }

    /**
     * Adds the specified ribbon component to this ribbon band.
     * 
     * @param comp
     *            The ribbon component to add.
     * @param rowSpan
     *            Row span of the ribbon component.
     * @throws IllegalArgumentException
     *             if the row span is not legal. Legal row span is 1..3 for unnamed groups and 1..2
     *             for named groups.
     * @see #startGroup()
     * @see #startGroup(String)
     */
    public void addRibbonComponent(JRibbonComponent comp, int rowSpan) {
        int groupCount = this.controlPanel.getControlPanelGroupCount();
        String groupTitle = (groupCount > 0)
                ? this.controlPanel.getControlPanelGroupTitle(groupCount - 1)
                : null;
        int availableRows = (groupTitle == null) ? 3 : 2;
        if ((rowSpan <= 0) || (rowSpan > availableRows)) {
            throw new IllegalArgumentException(
                    "Row span value not supported. Should be in 1.." + availableRows + " range");
        }
        this.controlPanel.addRibbonComponent(comp, rowSpan);
    }

    /**
     * Starts a new unnamed group.
     * 
     * @return The index of the new group.
     */
    public int startGroup() {
        return this.controlPanel.startGroup();
    }

    /**
     * Starts a new named group.
     * 
     * @param groupTitle
     *            The group title.
     * @return The index of the new group.
     */
    public int startGroup(String groupTitle) {
        return this.controlPanel.startGroup(groupTitle);
    }

    /**
     * Changes the title of the specified group.
     * 
     * @param groupIndex
     *            Group index.
     * @param groupTitle
     *            The new title for this group.
     */
    public void setGroupTitle(int groupIndex, String groupTitle) {
        this.controlPanel.setGroupTitle(groupIndex, groupTitle);
    }

    public List<JRibbonComponent> getRibbonComponents(int groupIndex) {
        return this.controlPanel.getRibbonComponents(groupIndex);
    }

    @Override
    public AbstractRibbonBand<JBandControlPanel> cloneBand() {
        AbstractRibbonBand<JBandControlPanel> result = new JRibbonBand(this.getTitle(),
                this.getIcon(), this.getExpandActionListener());
        result.applyComponentOrientation(this.getComponentOrientation());
        return result;
    }
}
