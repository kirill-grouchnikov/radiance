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
package org.pushingpixels.flamingo.api.common.popup;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.model.*;
import org.pushingpixels.flamingo.api.common.projection.*;
import org.pushingpixels.flamingo.internal.substance.common.ui.SubstanceCommandPopupMenuUI;
import org.pushingpixels.flamingo.internal.ui.common.popup.ScrollableHost;

import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.util.List;

/**
 * Popup menu with groups of command buttons. Use the
 * {@link CommandPopupMenuContentModel#CommandPopupMenuContentModel(CommandPanelContentModel, List)}
 * constructor to place a scrollable command button panel in the top part of the popup menu.
 *
 * @author Kirill Grouchnikov
 */
public class JCommandPopupMenu extends AbstractPopupMenu implements ScrollableHost {
    /**
     * @see #getUIClassID
     */
    public static final String uiClassID = "CommandPopupMenuUI";

    private CommandPopupMenuContentModel popupMenuContentModel;
    private CommandPopupMenuPresentationModel popupMenuPresentationModel;

    private CommandPanelContentModel popupMenuPanelContentModel;
    private CommandPanelPresentationModel popupMenuPanelPresentationModel;

    /**
     * The main button panel.
     *
     * @see CommandPopupMenuContentModel#CommandPopupMenuContentModel(CommandPanelContentModel, List)
     * @see #hasCommandButtonPanel()
     * @see #getMainButtonPanel()
     */
    private JCommandButtonPanel mainButtonPanel;

    public JCommandPopupMenu(CommandPopupMenuContentModel popupMenuContentModel,
            CommandPopupMenuPresentationModel popupMenuPresentationModel) {
        this.popupMenuContentModel = popupMenuContentModel;
        this.popupMenuPresentationModel = popupMenuPresentationModel;
        this.popupMenuPanelContentModel = (this.popupMenuContentModel != null) ?
                this.popupMenuContentModel.getPanelContentModel() : null;
        this.popupMenuPanelPresentationModel = (this.popupMenuPresentationModel != null) ?
                this.popupMenuPresentationModel.getPanelPresentationModel() : null;

        this.populateContent();
        this.popupMenuContentModel.addChangeListener((ChangeEvent event) -> populateContent());
        this.popupMenuPresentationModel.addChangeListener((ChangeEvent event) -> populateContent());

        this.updateUI();
    }

    private void populateContent() {
        if (this.popupMenuPanelContentModel != null) {
            this.mainButtonPanel = new CommandPanelProjection(
                    this.popupMenuPanelContentModel,
                    this.popupMenuPresentationModel.getPanelPresentationModel()).buildComponent();
        }

        List<CommandProjectionGroupModel> commandGroups =
                this.popupMenuContentModel.getCommandGroups();
        for (int i = 0; i < commandGroups.size(); i++) {
            for (CommandProjection projection : commandGroups.get(i).getCommandProjections()) {
                // Overlay the supplied projection command presentation to create menu content
                CommandPresentation withOverlay = projection.getPresentationModel().overlayWith(
                        CommandPresentation.overlay().setMenu(true));
                // Reproject to use the overlay
                CommandProjection projectionWithOverlay = projection.reproject(withOverlay);
                // And create a button that can be used in this popup menu
                AbstractCommandButton commandButton = projectionWithOverlay.buildComponent();

                // Need to highlight it?
                Command highlightedCommand =
                        this.popupMenuPresentationModel.getHighlightedCommand();
                if (projection.getContentModel() == highlightedCommand) {
                    // Use bold font
                    commandButton.setFont(commandButton.getFont().deriveFont(Font.BOLD));
                }

                if (commandButton instanceof JCommandMenuButton) {
                    JCommandMenuButton menuButton = (JCommandMenuButton) commandButton;
                    menuButton.setPopupOrientationKind(
                            this.popupMenuPresentationModel.getPopupOrientationKind());
                    this.addMenuButton(menuButton);
                }
                if (commandButton instanceof JCommandToggleMenuButton) {
                    this.addMenuButton((JCommandToggleMenuButton) commandButton);
                }
            }
            if (i < (commandGroups.size() - 1)) {
                this.addMenuSeparator();
            }
        }
    }

    public CommandPopupMenuContentModel getContentModel() {
        return this.popupMenuContentModel;
    }

    public CommandPopupMenuPresentationModel getPresentationModel() {
        return this.popupMenuPresentationModel;
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
        setUI(SubstanceCommandPopupMenuUI.createUI(this));
    }
}
