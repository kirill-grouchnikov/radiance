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
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.*;
import org.pushingpixels.flamingo.api.common.popup.model.*;
import org.pushingpixels.flamingo.api.common.projection.*;
import org.pushingpixels.flamingo.api.ribbon.*;
import org.pushingpixels.flamingo.api.ribbon.model.*;
import org.pushingpixels.flamingo.internal.substance.ribbon.ui.SubstanceRibbonGalleryUI;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.util.*;

/**
 * In-ribbon gallery. This class is for internal use only and should not be directly used by the
 * applications.
 *
 * @author Kirill Grouchnikov
 * @see JRibbonBand#addRibbonGallery(RibbonGalleryContentModel, RibbonGalleryPresentationModel, JRibbonBand.PresentationPriority)
 * @see JRibbon#addTaskbarGalleryDropdown(RibbonGalleryContentModel, RibbonGalleryPresentationModel)
 */
public class JRibbonGallery extends JComponent {
    private RibbonGalleryContentModel galleryContentModel;
    private RibbonGalleryPresentationModel galleryPresentationModel;

    /**
     * The buttons of <code>this</code> gallery.
     */
    protected List<JCommandToggleButton> buttons;

    /**
     * The commands of <code>this</code> gallery.
     */
    protected List<Command> commands;

    /**
     * Button group for ensuring that only one button is selected.
     */
    private CommandToggleGroupModel commandToggleGroupModel;

    /**
     * The current presentation priority of <code>this</code> in-ribbon gallery.
     */
    private JRibbonBand.PresentationPriority presentationPriority;

    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "RibbonGalleryUI";

    private String expandKeyTip;

    public JRibbonGallery(RibbonGalleryContentModel galleryContentModel,
            RibbonGalleryPresentationModel galleryPresentationModel) {
        this.galleryContentModel = galleryContentModel;
        this.galleryPresentationModel = galleryPresentationModel;

        this.buttons = new ArrayList<>();
        this.commands = new ArrayList<>();
        this.commandToggleGroupModel = new CommandToggleGroupModel();

        this.validateCommandPresentationState(
                galleryPresentationModel.getCommandPresentationState());

        this.populateContent();

        this.galleryContentModel.addCommandActivationListener((Command activated) -> {
            this.commandToggleGroupModel.setSelected(activated, true);
        });

        this.galleryContentModel.addChangeListener((ChangeEvent changeEvent) -> {
            this.buttons.clear();
            this.commandToggleGroupModel.removeAll();
            this.commands.clear();
            this.removeAll();

            populateContent();
        });

        this.galleryPresentationModel.addChangeListener((ChangeEvent changeEvent) -> {
            this.buttons.clear();
            this.commandToggleGroupModel.removeAll();
            this.commands.clear();
            this.removeAll();

            populateContent();
        });

        this.updateUI();
    }

    private void populateContent() {
        this.setGroupMapping(this.galleryContentModel.getCommandGroups());
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
     * @param command Command to add.
     */
    private void addGalleryCommand(Command command) {
        JCommandToggleButton button = (JCommandToggleButton) command.project().buildComponent();
        button.getActionModel().addChangeListener(new ChangeListener() {
            boolean wasRollover = false;

            @Override
            public void stateChanged(ChangeEvent e) {
                boolean isRollover = button.getActionModel().isRollover();
                if (wasRollover && !isRollover) {
                    if (galleryContentModel != null) {
                        galleryContentModel.cancelPreview(command);
                    }
                }
                if (!wasRollover && isRollover) {
                    if (galleryContentModel != null) {
                        galleryContentModel.activatePreview(command);
                    }
                }
                wasRollover = isRollover;
            }
        });
        button.getActionModel().addActionListener((ActionEvent e) ->
                galleryContentModel.setSelectedCommand(command));

        this.buttons.add(button);
        this.commandToggleGroupModel.add(command);
        this.commands.add(command);
        button.setPresentationState(this.galleryPresentationModel.getCommandPresentationState());

        super.add(button);
    }

    /**
     * Returns the preferred width of <code>this</code> in-ribbon gallery for the specified
     * presentation state.
     *
     * @param state           Presentation state.
     * @param availableHeight Available height in pixels.
     * @return The preferred width of <code>this</code> in-ribbon gallery for the specified
     * presentation
     * state.
     */
    public int getPreferredWidth(JRibbonBand.PresentationPriority state, int availableHeight) {
        int preferredVisibleButtonCount = this.galleryPresentationModel.
                getPreferredVisibleCommandCounts().get(state);

        BasicRibbonGalleryUI ui = (BasicRibbonGalleryUI) this.getUI();
        return ui.getPreferredWidth(preferredVisibleButtonCount, availableHeight);
    }

    /**
     * Sets new presentation priority for <code>this</code> in-ribbon gallery.
     *
     * @param presentationPriority New presentation priority for <code>this</code> in-ribbon
     *                             gallery.
     */
    public void setPresentationPriority(JRibbonBand.PresentationPriority presentationPriority) {
        this.presentationPriority = presentationPriority;
    }

    /**
     * Returns the current presentation priority for <code>this</code> in-ribbon gallery.
     *
     * @return The current presentation priority for <code>this</code> in-ribbon gallery.
     */
    public JRibbonBand.PresentationPriority getPresentationPriority() {
        return this.presentationPriority;
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
        int buttonIndex = this.commands.indexOf(this.commandToggleGroupModel.getSelected());
        return this.buttons.get(buttonIndex);
    }

    public RibbonGalleryContentModel getContentModel() {
        return this.galleryContentModel;
    }

    public RibbonGalleryPresentationModel getPresentationModel() {
        return this.galleryPresentationModel;
    }

    /**
     * Sets the command groups for this ribbon gallery.
     *
     * @param commandGroups Command groups.
     */
    private void setGroupMapping(List<CommandProjectionGroupModel> commandGroups) {
        for (CommandProjectionGroupModel commandGroupModel : commandGroups) {
            for (CommandProjection projection : commandGroupModel.getCommandProjections()) {
                Command command = projection.getContentModel();
                if (!command.isToggle()) {
                    throw new IllegalStateException("Gallery command must be toggle");
                }
                if (command.getToggleGroupModel() != null) {
                    throw new IllegalStateException(
                            "Gallery toggle command should not be associated with a toggle group");
                }
            }
        }

        boolean hasGroupWithNullTitle = false;
        for (CommandProjectionGroupModel commandGroupModel : commandGroups) {
            if (commandGroupModel.getTitle() == null) {
                if (hasGroupWithNullTitle) {
                    throw new IllegalArgumentException(
                            "Can't have more than one ribbon gallery group with null name");
                }
                hasGroupWithNullTitle = true;
            }

            // add all the commands to this gallery (creating a UI representation for each command)
            for (CommandProjection projection : commandGroupModel.getCommandProjections()) {
                this.addGalleryCommand(projection.getContentModel());
            }
        }
    }

    public String getExpandKeyTip() {
        return expandKeyTip;
    }

    private void validateCommandPresentationState(
            CommandButtonPresentationState commandPresentationState) {
        boolean isSupported = (commandPresentationState == JRibbonBand.BIG_FIXED)
                || (commandPresentationState == CommandButtonPresentationState.SMALL)
                || (commandPresentationState == JRibbonBand.BIG_FIXED_LANDSCAPE);
        if (!isSupported) {
            throw new IllegalArgumentException(
                    "Presentation state " + commandPresentationState.getDisplayName()
                            + " is not supported in ribbon galleries");
        }
    }

    public static JCommandPopupMenu getExpandPopupMenu(
            RibbonGalleryContentModel galleryContentModel,
            RibbonGalleryPresentationModel galleryPresentationModel,
            JComponent originator) {

        // Create the content model for the panel with all the primary gallery commands,
        // wiring the preview listener for the panel to update the gallery content
        // model
        CommandPanelContentModel galleryPopupMenuPanelContentModel = new CommandPanelContentModel(
                galleryContentModel.getCommandGroups());
        galleryPopupMenuPanelContentModel.setSingleSelectionMode(true);
        galleryPopupMenuPanelContentModel.setCommandPreviewListener(
                new Command.CommandActionPreview() {
                    @Override
                    public void onCommandPreviewActivated(Command command) {
                        galleryContentModel.activatePreview(command);
                    }

                    @Override
                    public void onCommandPreviewCanceled(Command command) {
                        galleryContentModel.cancelPreview(command);
                    }
                });

        // Create the content model for the entire popup based on the gallery commands,
        // as well as on the extra popup commands set on the gallery content model
        CommandPopupMenuContentModel galleryPopupMenuContentModel =
                new CommandPopupMenuContentModel(
                        galleryPopupMenuPanelContentModel,
                        galleryContentModel.getExtraPopupCommandGroups());

        // Do all the primary gallery command groups have titles?
        boolean allGroupsHaveTitles = true;
        for (CommandProjectionGroupModel commandGroupModel :
                galleryContentModel.getCommandGroups()) {
            String groupTitle = commandGroupModel.getTitle();
            if (groupTitle == null) {
                allGroupsHaveTitles = false;
                break;
            }
        }

        // Configure the presentation model for the gallery popup menu. Here we configure
        // the presentation model for the panel with primary gallery commands based on
        // the gallery presentation model. This is what allows having different presentation
        // for the same gallery popup content when it's in the ribbon band vs when it's shown
        // in ribbon task bar.
        CommandPopupMenuPresentationModel galleryPopupMenuPresentationModel =
                CommandPopupMenuPresentationModel.builder()
                        .setPanelPresentationModel(
                                CommandPanelPresentationModel.builder()
                                        .setToShowGroupLabels(allGroupsHaveTitles)
                                        .setCommandPresentationState(
                                                galleryPresentationModel.getCommandPresentationState())
                                        .setMaxColumns(
                                                galleryPresentationModel.getPreferredPopupMaxCommandColumns())
                                        .setMaxRows(
                                                galleryPresentationModel.getPreferredPopupMaxVisibleCommandRows())
                                        .build())
                        .build();

        JCommandPopupMenu galleryPopupMenu = new CommandPopupMenuProjection(
                galleryPopupMenuContentModel, galleryPopupMenuPresentationModel).buildComponent();

        galleryPopupMenu.applyComponentOrientation(originator.getComponentOrientation());

        // Configure the popup listener for two-way sync between the gallery model and
        // its present popup menu manifestation.
        PopupPanelManager.PopupListener popupListener = new PopupPanelManager.PopupListener() {
            @Override
            public void popupShown(PopupPanelManager.PopupEvent event) {
                // scroll the popup to reveal the selected command
                galleryPopupMenu.getMainButtonPanel().scrollToSelectedCommand();
            }

            @Override
            public void popupHidden(PopupPanelManager.PopupEvent event) {
                // update the gallery content model with the command selection
                Command selectedCommand =
                        galleryPopupMenu.getMainButtonPanel().getSelectedCommand();
                galleryContentModel.setSelectedCommand(selectedCommand);
                if (event.getPopupOriginator() == originator) {
                    PopupPanelManager.defaultManager().removePopupListener(this);
                }
            }
        };
        PopupPanelManager.defaultManager().addPopupListener(popupListener);

        return galleryPopupMenu;
    }
}


