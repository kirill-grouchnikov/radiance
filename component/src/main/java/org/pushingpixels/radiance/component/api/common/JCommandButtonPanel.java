/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.component.api.common.model.*;
import org.pushingpixels.radiance.component.api.common.model.panel.PanelLayoutSpec;
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection;
import org.pushingpixels.radiance.component.api.common.projection.Projection;
import org.pushingpixels.radiance.component.internal.theming.common.ui.RadianceCommandButtonPanelUI;
import org.pushingpixels.radiance.component.internal.ui.common.CommandButtonPanelUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Panel that hosts command buttons. Provides support for button groups, single
 * selection mode (for toggle command buttons), same icon state / dimension and
 * column-fill / row-fill layout. Note that while this class is a part of public API,
 * it is highly recommended to use the {@link CommandPanelContentModel} and
 * {@link CommandPanelPresentationModel} instances used to project the command button panel
 * on screen for any dynamic manipulation of the state.
 *
 * <p>
 * Under the default {@link org.pushingpixels.radiance.component.api.common.model.panel.PanelRowFillSpec}, the buttons are
 * laid out in rows, never exceeding the available horizontal space. A vertical scroll bar
 * will kick in once there is not enough vertical space to show all the buttons.
 * The schematic below shows a row-fill command button panel:
 * </p>
 *
 * <pre>
 * +-----------------------------+-+
 * |                             |o|
 * | +----+ +----+ +----+ +----+ |o|
 * | | 01 | | 02 | | 03 | | 04 | |o|
 * | +----+ +----+ +----+ +----+ |o|
 * |                             | |
 * | +----+ +----+ +----+ +----+ | |
 * | | 05 | | 06 | | 07 | | 07 | | |
 * | +----+ +----+ +----+ +----+ | |
 * |                             | |
 * | +----+ +----+ +----+ +----+ | |
 * | | 09 | | 10 | | 11 | | 12 | | |
 * | +----+ +----+ +----+ +----+ | |
 * |                             | |
 * | +----+ +----+ +----+ +----+ | |
 * | | 13 | | 14 | | 15 | | 16 | | |
 * +-----------------------------+-+
 * </pre>
 *
 * <p>
 * Each row hosts four buttons, and the vertical scroll bar allows scrolling the
 * content up and down.
 * </p>
 *
 * <p>
 * Under the {@link org.pushingpixels.radiance.component.api.common.model.panel.PanelColumnFillSpec}, the buttons are laid
 * out in columns, never exceeding the available vertical space. A horizontal scroll
 * bar will kick in once there is not enough horizontal space to show all the
 * buttons. The schematic below shows a column-fill command button panel:
 * </p>
 *
 * <pre>
 * +---------------------------------+
 * |                                 |
 * | +----+ +----+ +----+ +----+ +---|
 * | | 01 | | 04 | | 07 | | 10 | | 13|
 * | +----+ +----+ +----+ +----+ +---|
 * |                                 |
 * | +----+ +----+ +----+ +----+ +---|
 * | | 02 | | 05 | | 08 | | 11 | | 14|
 * | +----+ +----+ +----+ +----+ +---|
 * |                                 |
 * | +----+ +----+ +----+ +----+ +---|
 * | | 03 | | 06 | | 09 | | 12 | | 15|
 * | +----+ +----+ +----+ +----+ +---|
 * |                                 |
 * +---------------------------------+
 * |oooo                             |
 * +---------------------------------+
 * </pre>
 *
 * <p>
 * Each column hosts three buttons, and the horizontal scroll bar allows
 * scrolling the content left and right.
 * </p>
 *
 * @author Kirill Grouchnikov
 */
public class JCommandButtonPanel extends JComponent implements Scrollable {
    /**
     * @see #getUIClassID
     */
    public static final String uiClassID = "CommandButtonPanelUI";

    private Projection<JCommandButtonPanel, CommandPanelContentModel, CommandPanelPresentationModel> projection;
    private CommandPanelContentModel panelContentModel;
    private CommandPanelPresentationModel panelPresentationModel;

    /**
     * List of titles for all button groups.
     *
     * @see #getGroupCount()
     * @see #getGroupTitleAt(int)
     */
    private List<String> groupTitles;

    /**
     * List of all button groups.
     *
     * @see #getGroupCount()
     * @see #getGroupButtons(int)
     */
    private List<List<JCommandButton>> buttons;

    private ChangeListener contentChangeListener;

    private Insets contentPadding;
    private int contentGap;

    /**
     * The button group for the single selection mode.
     */
    private CommandToggleGroupModel buttonGroup;

    public JCommandButtonPanel(Projection<JCommandButtonPanel,
            CommandPanelContentModel, CommandPanelPresentationModel> projection) {
        this.projection = projection;
        this.panelContentModel = projection.getContentModel();
        this.panelPresentationModel = projection.getPresentationModel();

        this.buttons = new ArrayList<>();
        this.groupTitles = new ArrayList<>();

        this.contentPadding = this.panelPresentationModel.getContentPadding();
        this.contentGap = this.panelPresentationModel.getContentGap();
        populateContent();
        this.contentChangeListener = (ChangeEvent changeEvent) -> populateContent();
        this.panelContentModel.addChangeListener(this.contentChangeListener);

        this.updateUI();
    }

    public Projection<JCommandButtonPanel, CommandPanelContentModel, CommandPanelPresentationModel> getProjection() {
        return this.projection;
    }

    private CommandButtonPresentationModel createBaseCommandPresentation() {
        return CommandButtonPresentationModel.builder()
                .setPresentationState(this.panelPresentationModel.getCommandPresentationState())
                .setIconDimension(this.panelPresentationModel.getCommandIconDimension())
                .setContentPadding(this.panelPresentationModel.getCommandContentPadding())
                .setMenu(this.panelPresentationModel.isMenu())
                .setHorizontalAlignment(this.panelPresentationModel.getCommandHorizontalAlignment())
                .setPopupPlacementStrategy(this.panelPresentationModel.getPopupPlacementStrategy())
                .build();
    }

    private void populateContent() {
        this.groupTitles.clear();
        this.buttons.clear();
        this.removeAll();

        if (this.panelContentModel.isSingleSelectionMode()) {
            this.buttonGroup = new CommandToggleGroupModel();
        } else {
            this.buttonGroup = null;
        }

        int groupIndex = 0;
        CommandButtonPresentationModel baseCommandPresentation = createBaseCommandPresentation();
        Command.CommandActionPreview commandPreviewListener =
                panelContentModel.getCommandPreviewListener();
        for (CommandGroup groupModel : panelContentModel.getCommandGroups()) {
            this.groupTitles.add(groupIndex, groupModel.getTitle());
            List<JCommandButton> list = new ArrayList<>();
            this.buttons.add(groupIndex, list);

            for (Command command : groupModel.getCommands()) {
                // Apply overlay if we have it in the top-level projection
                CommandButtonPresentationModel commandPresentation =
                        this.projection.getCommandOverlays().containsKey(command)
                                ? baseCommandPresentation.overlayWith(
                                this.projection.getCommandOverlays().get(command))
                                : baseCommandPresentation;

                CommandButtonProjection<Command> commandProjection = command.project(commandPresentation);
                // Propagate command overlays so that key tips are properly displayed
                // on secondary content of this command's projection
                commandProjection.setCommandOverlays(this.projection.getCommandOverlays());
                JCommandButton button = commandProjection.buildComponent();

                // Wire preview listener is configured on the panel content model
                if (commandPreviewListener != null) {
                    button.getActionModel().addChangeListener(new ChangeListener() {
                        boolean wasRollover = false;

                        @Override
                        public void stateChanged(ChangeEvent e) {
                            boolean isRollover = button.getActionModel().isRollover();
                            if (wasRollover && !isRollover) {
                                commandPreviewListener.onCommandPreviewCanceled(command);
                            }
                            if (!wasRollover && isRollover) {
                                commandPreviewListener.onCommandPreviewActivated(command);
                            }
                            wasRollover = isRollover;
                        }
                    });
                }

                this.addButtonToLastGroup(command, button);
            }
            groupIndex++;
        }
    }

    private void addButtonToLastGroup(Command command, JCommandButton commandButton) {
        if (this.groupTitles.size() == 0) {
            return;
        }
        int groupIndex = this.groupTitles.size() - 1;
        this.addButtonToGroup(this.groupTitles.get(groupIndex),
                this.buttons.get(groupIndex).size(), command, commandButton);
    }

    private void addButtonToGroup(String buttonGroupName, int indexInGroup,
            Command command, JCommandButton commandButton) {
        int groupIndex = this.groupTitles.indexOf(buttonGroupName);
        if (groupIndex < 0) {
            return;
        }
        commandButton.setIconDimension(this.panelPresentationModel.getCommandIconDimension());
        commandButton.setContentPadding(this.panelPresentationModel.getCommandContentPadding());
        commandButton.setPresentationState(
                this.panelPresentationModel.getCommandPresentationState());
        this.add(commandButton);
        this.buttons.get(groupIndex).add(indexInGroup, commandButton);
        if (this.panelContentModel.isSingleSelectionMode() && command.isToggle()) {
            this.buttonGroup.add(command);
        }
    }

    /**
     * Returns the number of button groups in this panel.
     *
     * @return Number of button groups in this panel.
     */
    public int getGroupCount() {
        return (this.groupTitles != null) ? this.groupTitles.size() : 0;
    }

    /**
     * Returns the title of the command group at the specified index.
     *
     * @param index Command group index.
     * @return Title of the command group at the specified index.
     */
    public String getGroupTitleAt(int index) {
        return this.panelContentModel.getCommandGroups().get(index).getTitle();
    }

    /**
     * Returns the UI delegate for this component.
     *
     * @return a <code>CommandButtonPanelUI</code> object
     * @see #setUI
     */
    public CommandButtonPanelUI getUI() {
        return (CommandButtonPanelUI) ui;
    }

    @Override
    public void updateUI() {
        setUI(RadianceCommandButtonPanelUI.createUI(this));
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    /**
     * Returns the list of all buttons in the specified button group. Note that this method should only
     * be used sparingly when your UI logic has to work with the projected buttons instead of the original
     * (canonical) commands that define the content itself.
     *
     * @param groupIndex Group index.
     * @return Unmodifiable view on the list of all buttons in the specified button group.
     * @see #getGroupCount()
     */
    public List<JCommandButton> getGroupButtons(int groupIndex) {
        return Collections.unmodifiableList(this.buttons.get(groupIndex));
    }

    public Command getSelectedCommand() {
        if (this.panelContentModel.isSingleSelectionMode()) {
            for (List<JCommandButton> commandButtons : this.buttons) {
                for (JCommandButton commandButton : commandButtons) {
                    Command curr = commandButton.getProjection().getContentModel();
                    if (curr.isToggleSelected()) {
                        return curr;
                    }
                }
            }
        }
        return null;
    }

    public void scrollToSelectedCommand() {
        if (this.panelContentModel.isSingleSelectionMode()) {
            for (List<JCommandButton> commandButtons : this.buttons) {
                for (JCommandButton commandButton : commandButtons) {
                    Command curr = commandButton.getProjection().getContentModel();
                    if (curr.isToggleSelected()) {
                        Rectangle selectionButtonBounds = commandButton.getBounds();
                        scrollRectToVisible(selectionButtonBounds);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public Dimension getPreferredScrollableViewportSize() {
        return this.getPreferredSize();
    }

    @Override
    public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 30;
    }

    @Override
    public boolean getScrollableTracksViewportHeight() {
        return (this.getProjection().getPresentationModel().getLayoutSpec() instanceof
                PanelLayoutSpec.ColumnFill);
    }

    @Override
    public boolean getScrollableTracksViewportWidth() {
        return (this.getProjection().getPresentationModel().getLayoutSpec() instanceof
                PanelLayoutSpec.RowFill);
    }

    @Override
    public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 10;
    }
}
