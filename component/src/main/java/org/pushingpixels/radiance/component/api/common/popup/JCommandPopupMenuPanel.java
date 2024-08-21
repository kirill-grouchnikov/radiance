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
package org.pushingpixels.radiance.component.api.common.popup;

import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.JCommandButtonPanel;
import org.pushingpixels.radiance.component.api.common.model.*;
import org.pushingpixels.radiance.component.api.common.model.panel.PanelLayoutSpec;
import org.pushingpixels.radiance.component.api.common.model.panel.PanelRowFillSpec;
import org.pushingpixels.radiance.component.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection;
import org.pushingpixels.radiance.component.api.common.projection.CommandPanelProjection;
import org.pushingpixels.radiance.component.api.common.projection.Projection;
import org.pushingpixels.radiance.component.internal.theming.common.ui.RadianceCommandPopupMenuPanelUI;
import org.pushingpixels.radiance.component.internal.ui.common.popup.ScrollableHost;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.List;

/**
 * Popup menu with groups of command buttons. Use the
 * {@link CommandMenuContentModel#CommandMenuContentModel(CommandPanelContentModel, List)}
 * constructor to place a scrollable command button panel in the top part of the popup menu.
 *
 * @author Kirill Grouchnikov
 */
public class JCommandPopupMenuPanel extends AbstractPopupMenuPanel implements ScrollableHost {
    /**
     * @see #getUIClassID
     */
    public static final String uiClassID = "CommandPopupMenuPanelUI";

    private Projection<JCommandPopupMenuPanel, CommandMenuContentModel,
            CommandPopupMenuPresentationModel> projection;

    private CommandMenuContentModel popupMenuContentModel;
    private CommandPopupMenuPresentationModel popupMenuPresentationModel;

    private CommandPanelContentModel popupMenuPanelContentModel;
    private ChangeListener popupMenuPanelContentChangeListener;

    /**
     * The main button panel.
     *
     * @see CommandMenuContentModel#CommandMenuContentModel(CommandPanelContentModel, List)
     * @see #hasCommandButtonPanel()
     * @see #getMainButtonPanel()
     */
    private JCommandButtonPanel mainButtonPanel;

    public JCommandPopupMenuPanel(Projection<JCommandPopupMenuPanel, CommandMenuContentModel,
            CommandPopupMenuPresentationModel> projection) {
        this.projection = projection;
        this.popupMenuContentModel = projection.getContentModel();
        this.popupMenuPresentationModel = projection.getPresentationModel();
        this.popupMenuPanelContentModel = (this.popupMenuContentModel != null) ?
                this.popupMenuContentModel.getPanelContentModel() : null;

        this.syncContent();
        this.popupMenuPanelContentChangeListener = (ChangeEvent event) -> syncContent();
        this.popupMenuContentModel.addChangeListener(this.popupMenuPanelContentChangeListener);

        this.updateUI();

        SwingUtilities.invokeLater(() -> {
            if (mainButtonPanel != null) {
                mainButtonPanel.scrollToSelectedCommand();
            }
        });
    }

    private void syncContent() {
        if (this.popupMenuPanelContentModel != null) {
            CommandPopupMenuPanelPresentationModel commandPopupMenuPanelPresentationModel =
                    this.popupMenuPresentationModel.getPanelPresentationModel();
            this.mainButtonPanel = new CommandPanelProjection(
                    this.popupMenuPanelContentModel,
                    CommandPanelPresentationModel.builder().
                            setLayoutSpec(new PanelLayoutSpec.RowFill(new PanelRowFillSpec.Fixed(
                                    commandPopupMenuPanelPresentationModel.getLayoutSpec().getColumnCount()
                            )))
                            .setContentPadding(commandPopupMenuPanelPresentationModel.getContentPadding())
                            .setContentGap(commandPopupMenuPanelPresentationModel.getContentGap())
                            .setCommandPresentationState(commandPopupMenuPanelPresentationModel.getCommandPresentationState())
                            .setCommandContentPadding(commandPopupMenuPanelPresentationModel.getCommandContentPadding())
                            .setCommandHorizontalAlignment(commandPopupMenuPanelPresentationModel.getCommandHorizontalAlignment())
                            .setCommandIconDimension(commandPopupMenuPanelPresentationModel.getCommandIconDimension())
                            .setToShowGroupLabels(commandPopupMenuPanelPresentationModel.isToShowGroupLabels())
                            .setCommandHorizontalGapScaleFactor(commandPopupMenuPanelPresentationModel.getCommandHorizontalGapScaleFactor())
                            .setCommandVerticalGapScaleFactor(commandPopupMenuPanelPresentationModel.getCommandVerticalGapScaleFactor())
                            .setBackgroundAppearanceStrategy(commandPopupMenuPanelPresentationModel.getBackgroundAppearanceStrategy())
                            .setIconFilterStrategies(
                                    commandPopupMenuPanelPresentationModel.getActiveIconFilterStrategy(),
                                    commandPopupMenuPanelPresentationModel.getEnabledIconFilterStrategy(),
                                    commandPopupMenuPanelPresentationModel.getDisabledIconFilterStrategy())
                            .build())
                    .buildComponent();
        }

        List<CommandGroup> commandGroups = this.popupMenuContentModel.getCommandGroups();
        boolean atLeastOneButtonHasIcon = false;
        for (CommandGroup commandGroup : commandGroups) {
            for (Command command : commandGroup.getCommands()) {
                if ((command.getIconFactory() != null) || command.isToggle()) {
                    atLeastOneButtonHasIcon = true;
                    break;
                }
            }
        }

        // Command presentation for menu content
        CommandButtonPresentationModel presentation =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(this.popupMenuPresentationModel.getItemPresentationState())
                        .setIconFilterStrategies(
                                this.popupMenuPresentationModel.getItemActiveIconFilterStrategy(),
                                this.popupMenuPresentationModel.getItemEnabledIconFilterStrategy(),
                                this.popupMenuPresentationModel.getItemDisabledIconFilterStrategy())
                        .setContentPadding(this.popupMenuPresentationModel.getItemContentPadding())
                        .setSides(this.popupMenuPresentationModel.getItemSides())
                        .setHorizontalAlignment(this.popupMenuPresentationModel.getItemHorizontalAlignment())
                        .setPopupFireTrigger(this.popupMenuPresentationModel.getItemPopupFireTrigger())
                        .setSelectedStateHighlight(this.popupMenuPresentationModel.getItemSelectedStateHighlight())
                        .setPopupPlacementStrategy(this.popupMenuPresentationModel.getPopupPlacementStrategy())
                        .setForceAllocateSpaceForIcon(atLeastOneButtonHasIcon)
                        .build();


        for (int i = 0; i < commandGroups.size(); i++) {
            for (Command command : commandGroups.get(i).getCommands()) {
                CommandButtonProjection<Command> commandProjection;
                // Do we need to apply a command-specific overlay?
                CommandButtonPresentationModel.Overlay overlay = this.projection.getCommandOverlays().get(command);
                CommandButtonPresentationModel combinedPresentationModel = (overlay != null) ?
                        presentation.overlayWith(overlay) : presentation;
                commandProjection = command.project(combinedPresentationModel);
                commandProjection.setCommandOverlays(this.projection.getCommandOverlays());

                // Create a button that can be used in this popup menu
                JCommandButton commandButton = commandProjection.buildComponent();

                // Need to highlight it?
                Command highlightedCommand = this.popupMenuContentModel.getHighlightedCommand();
                if (command == highlightedCommand) {
                    // Use bold font
                    commandButton.setFont(commandButton.getFont().deriveFont(Font.BOLD));
                }

                this.addMenuButton(commandButton);
            }
            if (i < (commandGroups.size() - 1)) {
                this.addMenuSeparator();
            }
        }
    }

    public Projection<JCommandPopupMenuPanel, CommandMenuContentModel, CommandPopupMenuPresentationModel> getProjection() {
        return this.projection;
    }

    /**
     * Returns indication whether this menu has a command button panel.
     *
     * @return <code>true</code> if this menu has a command button panel,
     * <code>false</code> otherwise.
     * @see #getMainButtonPanel()
     */
    public boolean hasCommandButtonPanel() {
        return (this.mainButtonPanel != null);
    }

    /**
     * Returns the command button panel of this menu. Can return
     * <code>null</code>.
     *
     * @return The command button panel of this menu.
     * @see #hasCommandButtonPanel()
     */
    public JCommandButtonPanel getMainButtonPanel() {
        return this.mainButtonPanel;
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    @Override
    public void updateUI() {
        setUI(RadianceCommandPopupMenuPanelUI.createUI(this));
    }
}
