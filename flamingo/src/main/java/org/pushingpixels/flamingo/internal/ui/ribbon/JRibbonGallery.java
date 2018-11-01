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

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.popup.*;
import org.pushingpixels.flamingo.api.ribbon.*;
import org.pushingpixels.flamingo.api.ribbon.model.RibbonGalleryModel;
import org.pushingpixels.flamingo.internal.substance.ribbon.ui.SubstanceRibbonGalleryUI;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.util.*;
import java.util.List;

/**
 * In-ribbon gallery. This class is for internal use only and should not be directly used by the
 * applications.
 *
 * @author Kirill Grouchnikov
 * @see JRibbonBand#addRibbonGallery(String, RibbonGalleryModel, RibbonElementPriority, String)
 */
public class JRibbonGallery extends JComponent {
    private static final String COMMAND = "radiance.flamingo.internal.galleryCommand";

    private RibbonGalleryModel galleryModel;

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
    private CommandToggleButtonGroup buttonSelectionGroup;

    /**
     * The current display priority of <code>this</code> in-ribbon gallery.
     */
    private RibbonElementPriority displayPriority;

    /**
     * Preferred widths for each possible display state (set in the user code according to design
     * preferences).
     */
    private Map<RibbonElementPriority, Integer> preferredVisibleIconCount;

    /**
     * Gallery command groups.
     */
    private List<StringValuePair<List<FlamingoCommand>>> commandGroups;

    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "RibbonGalleryUI";

    private String expandKeyTip;

    private CommandButtonDisplayState buttonDisplayState;

    public JRibbonGallery(String galleryName, RibbonGalleryModel ribbonGalleryModel) {
        this.galleryModel = ribbonGalleryModel;

        this.buttons = new ArrayList<>();
        this.commands = new ArrayList<>();
        this.buttonSelectionGroup = new CommandToggleButtonGroup();
        this.preferredVisibleIconCount = new HashMap<>();

        this.setCommandDisplayState(ribbonGalleryModel.getCommandDisplayState());
        this.setName(galleryName);

        this.populateContent();

        this.galleryModel.addCommandSelectionListener((FlamingoCommand selected) -> {
            int buttonIndex = this.commands.indexOf(selected);
            this.buttonSelectionGroup.setSelected(this.buttons.get(buttonIndex), true);
        });

        this.galleryModel.addChangeListener((ChangeEvent changeEvent) -> {
            this.buttons.clear();
            this.buttonSelectionGroup.removeAll();
            this.commands.clear();
            this.removeAll();

            populateContent();
        });

        this.buttonSelectionGroup.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if (CommandToggleButtonGroup.SELECTED_PROPERTY.equals(evt.getPropertyName())) {
                JCommandToggleButton selectedButton = this.buttonSelectionGroup.getSelected();
                int index = this.buttons.indexOf(selectedButton);
                this.galleryModel.setSelectedCommand(this.commands.get(index));
            }
        });

        this.updateUI();
    }

    private void populateContent() {
        for (Map.Entry<RibbonElementPriority, Integer> prefCountEntry :
                this.galleryModel.getPreferredVisibleCommandCounts().entrySet()) {
            this.setPreferredVisibleButtonCount(prefCountEntry.getKey(),
                    prefCountEntry.getValue());
        }
        this.setGroupMapping(this.galleryModel.getCommands());
    }

    /**
     * Sets the new UI delegate.
     *
     * @param ui New UI delegate.
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
        setUI(SubstanceRibbonGalleryUI.createUI(this));
    }

    /**
     * Returns the UI delegate for this component.
     *
     * @return a <code>RibbonGalleryUI</code> object
     * @see #setUI
     */
    public RibbonGalleryUI getUI() {
        return (RibbonGalleryUI) ui;
    }

    /**
     * Returns the name of the UI delegate for this component.
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
     * @param commandGroup Command group.
     * @param command      Command to add.
     */
    private void addGalleryCommand(StringValuePair<List<FlamingoCommand>> commandGroup,
            FlamingoCommand command) {
        String commandGroupName = commandGroup.getKey();
        // find the index to add
        int indexToAdd = 0;
        for (StringValuePair<List<FlamingoCommand>> commandGroupPair : this.commandGroups) {
            String currGroupName = commandGroupPair.getKey();
            indexToAdd += commandGroupPair.getValue().size();
            if ((currGroupName == null) && (commandGroupName == null)) {
                break;
            }
            if (currGroupName.compareTo(commandGroupName) == 0) {
                break;
            }
        }
        JCommandToggleButton button = (JCommandToggleButton) command.buildButton();
        button.getActionModel().addChangeListener(new ChangeListener() {
            boolean wasRollover = false;

            @Override
            public void stateChanged(ChangeEvent e) {
                boolean isRollover = button.getActionModel().isRollover();
                if (wasRollover && !isRollover) {
                    if (galleryModel != null) {
                        galleryModel.cancelPreview(command);
                    }
                }
                if (!wasRollover && isRollover) {
                    if (galleryModel != null) {
                        galleryModel.activatePreview(command);
                    }
                }
                wasRollover = isRollover;
            }
        });

        this.buttons.add(indexToAdd, button);
        this.buttonSelectionGroup.add(button);
        this.commands.add(indexToAdd, command);
        commandGroup.getValue().add(command);
        button.setDisplayState(this.buttonDisplayState);

        super.add(button);
    }

    /**
     * Set preferred width of <code>this</code> in-ribbon gallery for the specified display state.
     *
     * @param state              Display state.
     * @param visibleButtonCount Preferred width for the specified state.
     */
    private void setPreferredVisibleButtonCount(RibbonElementPriority state,
            int visibleButtonCount) {
        this.preferredVisibleIconCount.put(state, visibleButtonCount);
    }

    /**
     * Returns the preferred width of <code>this</code> in-ribbon gallery for the specified display
     * state.
     *
     * @param state           Display state.
     * @param availableHeight Available height in pixels.
     * @return The preferred width of <code>this</code> in-ribbon gallery for the specified display
     * state.
     */
    public int getPreferredWidth(RibbonElementPriority state, int availableHeight) {
        int preferredVisibleButtonCount = this.preferredVisibleIconCount.get(state);

        BasicRibbonGalleryUI ui = (BasicRibbonGalleryUI) this.getUI();
        return ui.getPreferredWidth(preferredVisibleButtonCount, availableHeight);
    }

    /**
     * Sets new display priority for <code>this</code> in-ribbon gallery.
     *
     * @param displayPriority New display priority for <code>this</code> in-ribbon gallery.
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
     * @param commandGroupName Command group name.
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
     * Returns the gallery button at specified index.
     *
     * @param index Gallery button index.
     * @return Gallery button at specified index.
     */
    public JCommandToggleButton getButtonAt(int index) {
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

    public RibbonGalleryModel getGalleryModel() {
        return this.galleryModel;
    }

    /**
     * Creates a popup panel with all the gallery buttons.
     *
     * @return The popup panel with all the gallery buttons.
     */
    static JCommandButtonPanel createPopupButtonPanel(RibbonGalleryModel galleryModel) {
        CommandToggleButtonGroup buttonGroup = new CommandToggleButtonGroup();
        JCommandButtonPanel buttonPanel = new JCommandButtonPanel(
                galleryModel.getCommandDisplayState());
        buttonPanel.setMaxButtonColumns(galleryModel.getPreferredPopupMaxCommandColumns());
        buttonPanel.setToShowGroupLabels(true);
        buttonPanel.setSingleSelectionMode(true);

        for (StringValuePair<List<FlamingoCommand>> commandGroupEntry : galleryModel.getCommands()) {
            String groupName = commandGroupEntry.getKey();
            if (groupName == null) {
                buttonPanel.setToShowGroupLabels(false);
            }
            buttonPanel.addButtonGroup(groupName);
            for (FlamingoCommand command : commandGroupEntry.getValue()) {
                JCommandToggleButton button = (JCommandToggleButton) command.buildButton();
                button.putClientProperty(COMMAND, command);
                buttonGroup.add(button);
                button.setDisplayState(galleryModel.getCommandDisplayState());
                if (galleryModel.getSelectedCommand() == command) {
                    button.getActionModel().setSelected(true);
                }
                button.setVisible(true);
                buttonPanel.addButtonToLastGroup(button);

                button.getActionModel().addChangeListener(new ChangeListener() {
                    boolean wasRollover = false;

                    @Override
                    public void stateChanged(ChangeEvent e) {
                        boolean isRollover = button.getActionModel().isRollover();
                        if (wasRollover && !isRollover) {
                            galleryModel.cancelPreview(command);
                        }
                        if (!wasRollover && isRollover) {
                            galleryModel.activatePreview(command);
                        }
                        wasRollover = isRollover;
                    }
                });
            }
        }

        return buttonPanel;
    }

    /**
     * Sets the command groups for this ribbon gallery.
     *
     * @param commands Command groups.
     */
    private void setGroupMapping(List<StringValuePair<List<FlamingoCommand>>> commands) {
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

        this.commandGroups = new ArrayList<>();
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
            List<FlamingoCommand> commandGroupCopy = new ArrayList<>();
            // add it to the groups list
            StringValuePair<List<FlamingoCommand>> commandGroupInfo = new StringValuePair<>(
                    commandGroupPair.getKey(), commandGroupCopy);
            this.commandGroups.add(commandGroupInfo);
            // add all the commands to the control
            for (FlamingoCommand command : commandGroupPair.getValue()) {
                this.addGalleryCommand(commandGroupInfo, command);
            }
        }
    }

    public void setExpandKeyTip(String expandKeyTip) {
        String old = this.expandKeyTip;
        this.expandKeyTip = expandKeyTip;
        this.firePropertyChange("expandKeyTip", old, this.expandKeyTip);
    }

    public String getExpandKeyTip() {
        return expandKeyTip;
    }

    private void setCommandDisplayState(CommandButtonDisplayState commandDisplayState) {
        boolean isSupported = (commandDisplayState == JRibbonBand.BIG_FIXED)
                || (commandDisplayState == CommandButtonDisplayState.SMALL)
                || (commandDisplayState == JRibbonBand.BIG_FIXED_LANDSCAPE);
        if (!isSupported) {
            throw new IllegalArgumentException(
                    "Display state " + commandDisplayState.getDisplayName()
                            + " is not supported in ribbon galleries");
        }
        this.buttonDisplayState = commandDisplayState;
    }

    public static JCommandPopupMenu getExpandPopupMenu(RibbonGalleryModel galleryModel,
            JComponent originator) {
        JCommandButtonPanel popupButtonPanel = createPopupButtonPanel(galleryModel);
        final JCommandPopupMenu popupMenu = new JCommandPopupMenu(popupButtonPanel,
                galleryModel.getPreferredPopupMaxCommandColumns(),
                galleryModel.getPreferredPopupMaxVisibleCommandRows());

        JRibbonBand.RibbonGalleryPopupCallback galleryPopupCallback =
                galleryModel.getRibbonGalleryPopupCallback();
        if (galleryPopupCallback != null) {
            galleryPopupCallback.popupToBeShown(popupMenu);
        }
        popupMenu.applyComponentOrientation(originator.getComponentOrientation());

        PopupPanelManager.PopupListener popupListener = new PopupPanelManager.PopupListener() {
            @Override
            public void popupHidden(PopupPanelManager.PopupEvent event) {
                JCommandToggleButton newSelection = popupButtonPanel.getSelectedButton();
                FlamingoCommand selectedCommand =
                        (FlamingoCommand) newSelection.getClientProperty(COMMAND);
                galleryModel.setSelectedCommand(selectedCommand);
                if (event.getPopupOriginator() == originator) {
                    PopupPanelManager.defaultManager().removePopupListener(this);
                }
            }

            @Override
            public void popupShown(PopupPanelManager.PopupEvent event) {
                // scroll to reveal the selected button
                if (popupButtonPanel.getSelectedButton() != null) {
                    Rectangle selectionButtonBounds = popupButtonPanel.getSelectedButton()
                            .getBounds();
                    popupButtonPanel.scrollRectToVisible(selectionButtonBounds);
                }
            }
        };
        PopupPanelManager.defaultManager().addPopupListener(popupListener);

        return popupMenu;
    }
}


