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
package org.pushingpixels.radiance.component.internal.ui.ribbon;

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.model.*;
import org.pushingpixels.radiance.component.api.common.model.panel.MenuPopupPanelLayoutSpec;
import org.pushingpixels.radiance.component.api.common.popup.JCommandPopupMenuPanel;
import org.pushingpixels.radiance.component.api.common.popup.PopupPanelManager;
import org.pushingpixels.radiance.component.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandPopupMenuPanelProjection;
import org.pushingpixels.radiance.component.api.common.projection.Projection;
import org.pushingpixels.radiance.component.api.ribbon.JRibbon;
import org.pushingpixels.radiance.component.api.ribbon.JRibbonBand;
import org.pushingpixels.radiance.component.api.ribbon.model.RibbonGalleryContentModel;
import org.pushingpixels.radiance.component.api.ribbon.model.RibbonGalleryPresentationModel;
import org.pushingpixels.radiance.component.api.ribbon.projection.RibbonGalleryProjection;
import org.pushingpixels.radiance.component.internal.theming.ribbon.ui.RadianceRibbonGalleryUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * In-ribbon gallery. This class is for internal use only and should not be directly used by the
 * applications.
 *
 * @author Kirill Grouchnikov
 * @see JRibbonBand#addRibbonGallery(RibbonGalleryProjection, JRibbonBand.PresentationPriority)
 * @see JRibbon#addTaskbarGalleryDropdown(RibbonGalleryProjection)
 */
public class JRibbonGallery extends JComponent {
    private RibbonGalleryProjection galleryProjection;
    private RibbonGalleryContentModel galleryContentModel;
    private RibbonGalleryPresentationModel galleryPresentationModel;
    private Map<Command, CommandButtonPresentationModel.Overlay> galleryCommandOverlays;
    private ChangeListener galleryContentChangeListener;

    /**
     * The buttons of <code>this</code> gallery.
     */
    protected List<JCommandButton> buttons;

    /**
     * The commands of <code>this</code> gallery.
     */
    protected List<BaseCommand> commands;

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

    public JRibbonGallery(RibbonGalleryProjection galleryProjection) {
        this.galleryProjection = galleryProjection;
        this.galleryContentModel = galleryProjection.getContentModel();
        this.galleryPresentationModel = galleryProjection.getPresentationModel();
        this.galleryCommandOverlays = (galleryProjection.getCommandOverlays() == null)
                ? Collections.emptyMap() : galleryProjection.getCommandOverlays();

        this.buttons = new ArrayList<>();
        this.commands = new ArrayList<>();
        this.commandToggleGroupModel = new CommandToggleGroupModel();

        this.validateCommandPresentationState(
                galleryPresentationModel.getCommandPresentationState());

        this.populateContent();

        this.galleryContentModel.addCommandActivationListener(
                (BaseCommand activated) -> this.commandToggleGroupModel.setSelected(activated, true));

        this.galleryContentChangeListener = (ChangeEvent changeEvent) -> {
            this.buttons.clear();
            this.commandToggleGroupModel.removeAll();
            this.commands.clear();
            this.removeAll();

            populateContent();
            this.updateUI();
        };
        this.galleryContentModel.addChangeListener(this.galleryContentChangeListener);

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
        setUI(RadianceRibbonGalleryUI.createUI(this));
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
        CommandButtonPresentationModel presentation = CommandButtonPresentationModel.withDefaults();
        CommandButtonPresentationModel.Overlay overlay = this.galleryCommandOverlays.get(command);
        if (overlay != null) {
            presentation = presentation.overlayWith(overlay);
        }

        JCommandButton button = command.project(presentation).buildComponent();
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
        button.getActionModel().addActionListener(actionEvent ->
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
    public JCommandButton getButtonAt(int index) {
        return this.buttons.get(index);
    }

    /**
     * Returns the currently selected gallery button.
     *
     * @return The currently selected gallery button.
     */
    public JCommandButton getSelectedButton() {
        BaseCommand selectedCommand = this.commandToggleGroupModel.getSelected();
        if (selectedCommand == null) {
            return null;
        }
        int buttonIndex = this.commands.indexOf(selectedCommand);
        return this.buttons.get(buttonIndex);
    }

    public RibbonGalleryProjection getProjection() {
        return this.galleryProjection;
    }

    /**
     * Sets the command groups for this ribbon gallery.
     *
     * @param commandGroups Command groups.
     */
    private void setGroupMapping(List<CommandGroup> commandGroups) {
        for (CommandGroup commandGroupModel : commandGroups) {
            for (Command command : commandGroupModel.getCommands()) {
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
        for (CommandGroup commandGroupModel : commandGroups) {
            if (commandGroupModel.getTitle() == null) {
                if (hasGroupWithNullTitle) {
                    throw new IllegalArgumentException(
                            "Can't have more than one ribbon gallery group with null name");
                }
                hasGroupWithNullTitle = true;
            }

            // add all the commands to this gallery (creating a UI representation for each command)
            for (Command command : commandGroupModel.getCommands()) {
                this.addGalleryCommand(command);
            }
        }
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

    public static CommandPopupMenuPanelProjection getExpandPopupMenuPanelProjection(
            RibbonGalleryProjection galleryProjection,
            ComponentOrientation componentOrientation) {

        // Create the content model for the panel with all the primary gallery commands,
        // wiring the preview listener for the panel to update the gallery content
        // model
        CommandPanelContentModel galleryPopupMenuPanelContentModel = new CommandPanelContentModel(
                galleryProjection.getContentModel().getCommandGroups());
        galleryPopupMenuPanelContentModel.setSingleSelectionMode(true);
        galleryPopupMenuPanelContentModel.setCommandPreviewListener(
                new Command.CommandActionPreview() {
                    @Override
                    public void onCommandPreviewActivated(BaseCommand command) {
                        galleryProjection.getContentModel().activatePreview(command);
                    }

                    @Override
                    public void onCommandPreviewCanceled(BaseCommand command) {
                        galleryProjection.getContentModel().cancelPreview(command);
                    }
                });

        // Create the content model for the entire popup based on the gallery commands,
        // as well as on the extra popup commands set on the gallery content model
        CommandMenuContentModel galleryPopupMenuContentModel =
                new CommandMenuContentModel(
                        galleryPopupMenuPanelContentModel,
                        galleryProjection.getContentModel().getExtraPopupCommandGroups());

        // Do all the primary gallery command groups have titles?
        boolean allGroupsHaveTitles = true;
        for (CommandGroup commandGroupModel :
                galleryProjection.getContentModel().getCommandGroups()) {
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
        RibbonGalleryPresentationModel galleryPresentationModel =
                galleryProjection.getPresentationModel();
        CommandPopupMenuPresentationModel galleryPopupMenuPresentationModel =
                CommandPopupMenuPresentationModel.builder()
                        .setPanelPresentationModel(
                                CommandPopupMenuPanelPresentationModel.builder()
                                        .setLayoutSpec(galleryPresentationModel.getPopupLayoutSpec())
                                        .setToShowGroupLabels(allGroupsHaveTitles)
                                        .setCommandPresentationState(
                                                galleryPresentationModel.getCommandPresentationState())
                                        .build())
                        .build();

        CommandPopupMenuPanelProjection commandPopupMenuPanelProjection = new CommandPopupMenuPanelProjection(
                galleryPopupMenuContentModel, galleryPopupMenuPresentationModel);
        if (galleryProjection.getCommandOverlays() != null) {
            commandPopupMenuPanelProjection.setCommandOverlays(galleryProjection.getCommandOverlays());
        }

        commandPopupMenuPanelProjection.setComponentCustomizer(
                new RibbonGalleryCommandPopupMenuCustomizer(galleryProjection, componentOrientation));

        return commandPopupMenuPanelProjection;
    }

    private static class RibbonGalleryCommandPopupMenuCustomizer
            implements Projection.ComponentCustomizer<JCommandPopupMenuPanel> {
        private RibbonGalleryProjection galleryProjection;
        private ComponentOrientation componentOrientation;

        // Do not convert this to a local variable inside #customizeComponent, as we need
        // this strong reference to prevent PopupPanelManager from garbage collecting its
        // internal weak reference.
        @SuppressWarnings("FieldCanBeLocal")
        private PopupPanelManager.PopupListener popupListener;

        public RibbonGalleryCommandPopupMenuCustomizer(
                RibbonGalleryProjection galleryProjection,
                ComponentOrientation componentOrientation
        ) {
            this.galleryProjection = galleryProjection;
            this.componentOrientation = componentOrientation;
        }

        @Override
        public void customizeComponent(JCommandPopupMenuPanel galleryPopupMenu) {
            galleryPopupMenu.applyComponentOrientation(componentOrientation);

            // Configure a popup listener for the two-way sync between the gallery model and
            // its present popup menu manifestation.
            this.popupListener = new PopupPanelManager.PopupListener() {
                @Override
                public void popupShown(PopupPanelManager.PopupEvent event) {
                    // scroll the popup to reveal the selected command
                    galleryPopupMenu.getMainButtonPanel().scrollToSelectedCommand();
                }

                @Override
                public void popupHidden(PopupPanelManager.PopupEvent event) {
                    // update the gallery content model with the command selection
                    Command selectedCommand = galleryPopupMenu.getMainButtonPanel().getSelectedCommand();
                    galleryProjection.getContentModel().setSelectedCommand(selectedCommand);
                    PopupPanelManager.defaultManager().removePopupListener(this);
                }
            };
            PopupPanelManager.defaultManager().addPopupListener(this.popupListener);
        }
    }
}



