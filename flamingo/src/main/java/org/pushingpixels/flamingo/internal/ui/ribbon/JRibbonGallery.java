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
package org.pushingpixels.flamingo.internal.ui.ribbon;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.CommandToggleButtonGroup;
import org.pushingpixels.flamingo.api.common.FlamingoCommand;
import org.pushingpixels.flamingo.api.common.JCommandButtonPanel;
import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand.RibbonGalleryPopupCallback;
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority;

/**
 * In-ribbon gallery. This class is for internal use only and should not be directly used by the
 * applications.
 * 
 * @author Kirill Grouchnikov
 * @see JRibbonBand#addRibbonGallery(String, List, Map, int, int, RibbonElementPriority)
 * @see JRibbonBand#addRibbonGallery(String, List, Map, int, int, CommandButtonDisplayState,
 *      RibbonElementPriority)
 */
public class JRibbonGallery extends JComponent {
    /**
     * The buttons of <code>this</code> gallery.
     */
    protected List<JCommandToggleButton> buttons;

    /**
     * The commands of <code>this</code> gallery.
     */
    protected List<FlamingoCommand> commands;

    /**
     * Button group for ensuring that only one button is selected.
     */
    protected CommandToggleButtonGroup buttonSelectionGroup;

    /**
     * The current display priority of <code>this</code> in-ribbon gallery.
     */
    protected RibbonElementPriority displayPriority;

    /**
     * Preferred widths for each possible display state (set in the user code according to design
     * preferences).
     */
    protected Map<RibbonElementPriority, Integer> preferredVisibleIconCount;

    /**
     * Gallery command groups.
     */
    protected List<StringValuePair<List<FlamingoCommand>>> commandGroups;

    /**
     * Preferred maximum number of button columns for the popup panel.
     */
    protected int preferredPopupMaxButtonColumns;

    /**
     * Preferred maximum number of visible button rows for the popup panel.
     */
    protected int preferredPopupMaxVisibleButtonRows;

    /**
     * Indication whether the ribbon gallery is showing the popup panel.
     */
    protected boolean isShowingPopupPanel;

    protected RibbonGalleryPopupCallback popupCallback;

    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "RibbonGalleryUI";

    private String expandKeyTip;

    private CommandButtonDisplayState buttonDisplayState;

    /**
     * Creates new in-ribbon gallery.
     */
    public JRibbonGallery() {
        this.buttons = new ArrayList<>();
        this.commands = new ArrayList<>();
        this.buttonSelectionGroup = new CommandToggleButtonGroup();
        this.buttonSelectionGroup.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if (CommandToggleButtonGroup.SELECTED_PROPERTY.equals(evt.getPropertyName())) {
                SwingUtilities.invokeLater(() -> firePropertyChange("selectedButton",
                        evt.getOldValue(), evt.getNewValue()));
            }
        });

        this.preferredVisibleIconCount = new HashMap<RibbonElementPriority, Integer>();
        // Initialize with some values. Application should provide real
        // widths using setPreferredWidth.
        for (RibbonElementPriority state : RibbonElementPriority.values())
            this.preferredVisibleIconCount.put(state, 100);

        this.isShowingPopupPanel = false;
        this.buttonDisplayState = JRibbonBand.BIG_FIXED_LANDSCAPE;

        this.updateUI();
    }

    /**
     * Sets the new UI delegate.
     * 
     * @param ui
     *            New UI delegate.
     */
    public void setUI(RibbonGalleryUI ui) {
        super.setUI(ui);
    }

    /**
     * Resets the UI property to a value from the current look and feel.
     * 
     * @see JComponent#updateUI
     */
    @Override
    public void updateUI() {
        if (UIManager.get(getUIClassID()) != null) {
            setUI((RibbonGalleryUI) UIManager.getUI(this));
        } else {
            setUI(new BasicRibbonGalleryUI());
        }
    }

    /**
     * Returns the UI object which implements the L&F for this component.
     * 
     * @return a <code>RibbonGalleryUI</code> object
     * @see #setUI
     */
    public RibbonGalleryUI getUI() {
        return (RibbonGalleryUI) ui;
    }

    /**
     * Returns the name of the UI class that implements the L&F for this component.
     * 
     * @return the string "RibbonGalleryUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    /**
     * Adds new gallery command to <code>this</code> in-ribbon gallery.
     * 
     * @param commandGroup
     *            Command group.
     * @param command
     *            Command to add.
     */
    private void addGalleryCommand(StringValuePair<List<FlamingoCommand>> commandGroup,
            FlamingoCommand command) {
        String commandGroupName = commandGroup.getKey();
        // find the index to add
        int indexToAdd = 0;
        for (int i = 0; i < this.commandGroups.size(); i++) {
            StringValuePair<List<FlamingoCommand>> commandGroupPair = this.commandGroups.get(i);
            String currGroupName = commandGroupPair.getKey();
            indexToAdd += commandGroupPair.getValue().size();
            if ((currGroupName == null) && (commandGroupName == null)) {
                break;
            }
            if (currGroupName.compareTo(commandGroupName) == 0) {
                break;
            }
        }
        // System.out.println("Added " + button.getText() + " at " +
        // indexToAdd);
        JCommandToggleButton button = (JCommandToggleButton) command.buildButton();
        this.buttons.add(indexToAdd, button);
        this.buttonSelectionGroup.add(button);
        this.commands.add(indexToAdd, command);
        commandGroup.getValue().add(command);
        button.setDisplayState(this.buttonDisplayState);

        super.add(button);
    }

    /**
     * Removes an existing gallery command from <code>this</code> in-ribbon gallery.
     * 
     * @param command
     *            Gallery command to remove.
     */
    private void removeGalleryCommand(FlamingoCommand command) {
        int index = this.commands.indexOf(command);
        this.commands.remove(command);
        JCommandToggleButton button = this.buttons.get(index);
        this.buttons.remove(button);
        this.buttonSelectionGroup.remove(button);

        super.remove(button);
    }

    /**
     * Set preferred width of <code>this</code> in-ribbon gallery for the specified display state.
     * 
     * @param state
     *            Display state.
     * @param visibleButtonCount
     *            Preferred width for the specified state.
     */
    public void setPreferredVisibleButtonCount(RibbonElementPriority state,
            int visibleButtonCount) {
        this.preferredVisibleIconCount.put(state, visibleButtonCount);
    }

    /**
     * Returns the preferred width of <code>this</code> in-ribbon gallery for the specified display
     * state.
     * 
     * @param state
     *            Display state.
     * @param availableHeight
     *            Available height in pixels.
     * @return The preferred width of <code>this</code> in-ribbon gallery for the specified display
     *         state.
     */
    public int getPreferredWidth(RibbonElementPriority state, int availableHeight) {
        int preferredVisibleButtonCount = this.preferredVisibleIconCount.get(state);

        BasicRibbonGalleryUI ui = (BasicRibbonGalleryUI) this.getUI();
        return ui.getPreferredWidth(preferredVisibleButtonCount, availableHeight);
    }

    /**
     * Sets new display priority for <code>this</code> in-ribbon gallery.
     * 
     * @param displayPriority
     *            New display priority for <code>this</code> in-ribbon gallery.
     */
    public void setDisplayPriority(RibbonElementPriority displayPriority) {
        this.displayPriority = displayPriority;
    }

    /**
     * Returns the current display priority for <code>this</code> in-ribbon gallery.
     * 
     * @return The current display priority for <code>this</code> in-ribbon gallery.
     */
    public RibbonElementPriority getDisplayPriority() {
        return this.displayPriority;
    }

    /**
     * Returns the number of command groups in <code>this</code> in-ribbon gallery.
     * 
     * @return The number of command groups in <code>this</code> in-ribbon gallery.
     */
    public int getCommandGroupCount() {
        return this.commandGroups.size();
    }

    /**
     * Returns the list of commands in the specified command group.
     * 
     * @param commandGroupName
     *            Command group name.
     * @return The list of commands in the specified command group.
     */
    public List<FlamingoCommand> getCommandGroup(String commandGroupName) {
        for (StringValuePair<List<FlamingoCommand>> group : this.commandGroups) {
            if (group.getKey().compareTo(commandGroupName) == 0)
                return group.getValue();
        }
        return null;
    }

    /**
     * Returns the number of gallery commands in <code>this</code> in-ribbon gallery.
     * 
     * @return The number of gallery commands in <code>this</code> in-ribbon gallery.
     */
    public int getCommandCount() {
        return this.commands.size();
    }

    /**
     * Returns the gallery command at specified index.
     * 
     * @param index
     *            Gallery command index.
     * @return Gallery command at specified index.
     */
    public FlamingoCommand getCommandAt(int index) {
        return this.commands.get(index);
    }

    /**
     * Returns the gallery button at specified index.
     * 
     * @param index
     *            Gallery button index.
     * @return Gallery button at specified index.
     */
    public JCommandToggleButton getButtonAt(int index) {
        return this.buttons.get(index);
    }
    
    public JCommandToggleButton getButtonForCommand(FlamingoCommand command) {
        int index = this.commands.indexOf(command);
        if (index < 0) {
            return null;
        }
        return this.buttons.get(index);
    }

    /**
     * Returns the currently selected gallery button.
     * 
     * @return The currently selected gallery button.
     */
    public JCommandToggleButton getSelectedButton() {
        return this.buttonSelectionGroup.getSelected();
    }

    /**
     * Returns the currently selected gallery command.
     * 
     * @return The currently selected gallery command.
     */
    public FlamingoCommand getSelectedCommand() {
        JCommandToggleButton selectedButton = getSelectedButton();
        if (selectedButton == null) {
            return null;
        }
        int commandIndex = this.buttons.indexOf(selectedButton);
        return this.commands.get(commandIndex);
    }

    /**
     * Changes the selection to the specified button.
     * 
     * @param selectedButton
     *            New value for the currently selected gallery button.
     */
    public void setSelectedButton(JCommandToggleButton selectedButton) {
        this.buttonSelectionGroup.setSelected(selectedButton, true);
    }

    /**
     * Changes the selection to the specified button.
     * 
     * @param selectedButton
     *            New value for the currently selected gallery button.
     */
    public void setSelectedCommand(FlamingoCommand selectedCommand) {
        int buttonIndex = this.commands.indexOf(selectedCommand);
        setSelectedButton(this.buttons.get(buttonIndex));
    }

    /**
     * Returns the associated popup gallery.
     * 
     * @return The associated popup gallery.
     */
    public JCommandButtonPanel getPopupButtonPanel() {
        JCommandButtonPanel buttonPanel = new JCommandButtonPanel(this.buttonDisplayState);
        buttonPanel.setMaxButtonColumns(this.preferredPopupMaxButtonColumns);
        buttonPanel.setToShowGroupLabels(true);
        for (StringValuePair<List<FlamingoCommand>> commandGroupEntry : this.commandGroups) {
            String groupName = commandGroupEntry.getKey();
            if (groupName == null) {
                buttonPanel.setToShowGroupLabels(false);
            }
            buttonPanel.addButtonGroup(groupName);
            for (FlamingoCommand command : commandGroupEntry.getValue()) {
                JCommandToggleButton button = this.buttons.get(this.commands.indexOf(command));
                // set the button to visible (the gallery hides the buttons
                // that don't fit the front row).
                button.setVisible(true);
                buttonPanel.addButtonToLastGroup(button);
            }
        }
        // just to make sure that the button panel will not try to add
        // the buttons to its own button group
        buttonPanel.setSingleSelectionMode(true);
        return buttonPanel;
    }

    /**
     * Sets indication whether the popup panel is showing.
     * 
     * @param isShowingPopupPanel
     *            Indication whether the popup panel is showing.
     */
    public void setShowingPopupPanel(boolean isShowingPopupPanel) {
        this.isShowingPopupPanel = isShowingPopupPanel;

        if (!isShowingPopupPanel) {
            // populate the ribbon gallery back
            for (StringValuePair<List<FlamingoCommand>> commandGroupEntry : this.commandGroups) {
                for (FlamingoCommand command : commandGroupEntry.getValue()) {
                    JCommandToggleButton button = this.buttons.get(this.commands.indexOf(command));
                    button.setDisplayState(this.buttonDisplayState);
                    this.add(button);
                }
            }
            // and layout
            this.doLayout();
        }
    }

    /**
     * Returns indication whether the popup panel is showing.
     * 
     * @return <code>true</code> if the popup panel is showing, <code>false</code> otherwise.
     */
    public boolean isShowingPopupPanel() {
        return this.isShowingPopupPanel;
    }

    /**
     * Sets the command groups for this ribbon gallery.
     * 
     * @param buttons
     *            Button groups.
     */
    public void setGroupMapping(List<StringValuePair<List<FlamingoCommand>>> commands) {
        for (StringValuePair<List<FlamingoCommand>> commandGroupPair : commands) {
            for (FlamingoCommand command : commandGroupPair.getValue()) {
                if (!command.isToggle()) {
                    throw new IllegalStateException("Gallery command must be toggle");
                }
                if (command.getToggleGroup() != null) {
                    throw new IllegalStateException(
                            "Gallery toggle command should not be associated with a toggle group");
                }
            }
        }

        this.commandGroups = new ArrayList<StringValuePair<List<FlamingoCommand>>>();
        boolean hasGroupWithNullTitle = false;
        for (StringValuePair<List<FlamingoCommand>> commandGroupPair : commands) {
            if (commandGroupPair.getKey() == null) {
                if (hasGroupWithNullTitle) {
                    throw new IllegalArgumentException(
                            "Can't have more than one ribbon gallery group with null name");
                }
                hasGroupWithNullTitle = true;
            }

            // create the list of commands for this group
            List<FlamingoCommand> commandGroupCopy = new ArrayList<FlamingoCommand>();
            // add it to the groups list
            StringValuePair<List<FlamingoCommand>> commandGroupInfo = new StringValuePair<List<FlamingoCommand>>(
                    commandGroupPair.getKey(), commandGroupCopy);
            this.commandGroups.add(commandGroupInfo);
            // add all the commands to the control
            for (FlamingoCommand command : commandGroupPair.getValue()) {
                this.addGalleryCommand(commandGroupInfo, command);
            }
        }
    }

    /**
     * Adds commands to the specified command group in this ribbon gallery.
     * 
     * @param commandGroupName
     *            Command group name.
     * @param commands
     *            Commands to add to the specified command group.
     */
    public void addRibbonGalleryCommands(String commandGroupName, FlamingoCommand... commands) {
        for (StringValuePair<List<FlamingoCommand>> commandGroup : this.commandGroups) {
            if (commandGroup.getKey().compareTo(commandGroupName) == 0) {
                for (FlamingoCommand command : commands) {
                    this.addGalleryCommand(commandGroup, command);
                }
                return;
            }
        }
        this.revalidate();
        this.doLayout();
    }

    /**
     * Removes the specified commands from this ribbon gallery.
     * 
     * @param commands
     *            Commands to remove from this gallery.
     */
    public void removeRibbonGalleryCommands(FlamingoCommand... commands) {
        for (StringValuePair<List<FlamingoCommand>> commandGroup : this.commandGroups) {
            for (Iterator<FlamingoCommand> it = commandGroup.getValue().iterator(); it
                    .hasNext();) {
                FlamingoCommand currCommandInGroup = it.next();
                for (FlamingoCommand toRemove : commands) {
                    if (toRemove == currCommandInGroup) {
                        it.remove();
                        this.removeGalleryCommand(toRemove);
                    }
                }
            }
        }
        this.revalidate();
        this.doLayout();
    }

    /**
     * Sets the preferred dimension of the popup panel.
     * 
     * @param preferredPopupMaxButtonColumns
     *            Preferred maximum number of button columns for the popup panel.
     * @param preferredPopupMaxVisibleButtonRows
     *            Preferred maximum number of visible button rows for the popup panel.
     */
    public void setPreferredPopupPanelDimension(int preferredPopupMaxButtonColumns,
            int preferredPopupMaxVisibleButtonRows) {
        this.preferredPopupMaxButtonColumns = preferredPopupMaxButtonColumns;
        this.preferredPopupMaxVisibleButtonRows = preferredPopupMaxVisibleButtonRows;
    }

    public void setPopupCallback(RibbonGalleryPopupCallback popupCallback) {
        this.popupCallback = popupCallback;
    }

    public RibbonGalleryPopupCallback getPopupCallback() {
        return popupCallback;
    }

    public int getPreferredPopupMaxButtonColumns() {
        return preferredPopupMaxButtonColumns;
    }

    public int getPreferredPopupMaxVisibleButtonRows() {
        return preferredPopupMaxVisibleButtonRows;
    }

    public void setExpandKeyTip(String expandKeyTip) {
        String old = this.expandKeyTip;
        this.expandKeyTip = expandKeyTip;
        this.firePropertyChange("expandKeyTip", old, this.expandKeyTip);
    }

    public String getExpandKeyTip() {
        return expandKeyTip;
    }

    public CommandButtonDisplayState getButtonDisplayState() {
        return this.buttonDisplayState;
    }

    public void setCommandDisplayState(CommandButtonDisplayState commandDisplayState) {
        if (this.getCommandCount() > 0) {
            throw new IllegalStateException(
                    "Cannot change command display state on ribbon gallery with existing commands");
        }
        boolean isSupported = (commandDisplayState == JRibbonBand.BIG_FIXED)
                || (commandDisplayState == CommandButtonDisplayState.SMALL)
                || (commandDisplayState == JRibbonBand.BIG_FIXED_LANDSCAPE);
        if (!isSupported) {
            throw new IllegalArgumentException(
                    "Display state " + commandDisplayState.getDisplayName()
                            + " is not supported in ribbon galleries");
        }
        if (!commandDisplayState.equals(this.buttonDisplayState)) {
            CommandButtonDisplayState old = this.buttonDisplayState;
            this.buttonDisplayState = commandDisplayState;

            for (JCommandToggleButton button : this.buttons)
                button.setDisplayState(commandDisplayState);

            this.firePropertyChange("buttonDisplayState", old, this.buttonDisplayState);
        }
    }
}
