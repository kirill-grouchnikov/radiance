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

import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.internal.substance.common.ui.SubstanceCommandButtonPanelUI;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Panel that hosts command buttons. Provides support for button groups, single
 * selection mode (for toggle command buttons), same icon state / dimension and
 * column-fill / row-fill layout.
 *
 * <p>
 * Under the default {@link LayoutKind#ROW_FILL}, the buttons are laid out in
 * rows, never exceeding the available horizontal space. A vertical scroll bar
 * will kick in once there is not enough vertical space to show all the buttons.
 * The schematic below shows a row-fill command button panel:
 * </p>
 *
 * <pre>
 * +-----------------------------+-+
 * |                             | |
 * | +----+ +----+ +----+ +----+ | |
 * | | 01 | | 02 | | 03 | | 04 | | |
 * | +----+ +----+ +----+ +----+ | |
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
 * Under the {@link LayoutKind#COLUMN_FILL}, the buttons are laid out in
 * columns, never exceeding the available vertical space. A horizontal scroll
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
 * +---------------------------------+
 * </pre>
 *
 * <p>
 * Each column hosts three buttons, and the horizontal scroll bar allows
 * scrolling the content sideways.
 * </p>
 *
 * @author Kirill Grouchnikov
 */
public class JCommandButtonPanel extends JPanel implements Scrollable {
    private static final String COMMAND = "radiance.flamingo.internal.panelCommand";

    /**
     * @see #getUIClassID
     */
    public static final String uiClassID = "CommandButtonPanelUI";

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
    private List<List<AbstractCommandButton>> buttons;

    /**
     * The button group for the single selection mode.
     */
    private CommandToggleGroupModel buttonGroup;

    /**
     * Enumerates the available layout kinds.
     *
     * @author Kirill Grouchnikov
     */
    // TODO - move into CommandPanelPresentationModel in 2.0
    public enum LayoutKind {
        /**
         * The buttons are laid out in rows respecting the available width.
         */
        ROW_FILL,

        /**
         * The buttons are laid out in columns respecting the available height.
         */
        COLUMN_FILL
    }

    public JCommandButtonPanel(CommandPanelContentModel panelContentModel,
            CommandPanelPresentationModel panelPresentationModel) {
        this.panelContentModel = panelContentModel;
        this.panelPresentationModel = panelPresentationModel;

        this.buttons = new ArrayList<>();
        this.groupTitles = new ArrayList<>();

        populateContent();
        this.panelContentModel.addChangeListener((ChangeEvent changeEvent) -> populateContent());

        this.updateUI();
    }

    public CommandPanelContentModel getContentModel() {
        return this.panelContentModel;
    }

    public CommandPanelPresentationModel getPresentationModel() {
        return this.panelPresentationModel;
    }

    private FlamingoCommandDisplay createCommandDisplay() {
        FlamingoCommandDisplay commandDisplay = FlamingoCommandDisplay.builder()
                .setState(this.panelPresentationModel.getCommandDisplayState())
                .setCustomDimension(this.panelPresentationModel.getCommandIconDimension())
                .setMenu(this.panelPresentationModel.isMenu())
                .setHorizontalAlignment(this.panelPresentationModel.getCommandHorizontalAlignment())
                .setPopupOrientationKind(this.panelPresentationModel.getPopupOrientationKind())
                .build();
        return commandDisplay;
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
        FlamingoCommandDisplay commandDisplay = createCommandDisplay();
        FlamingoCommand.CommandPreviewListener commandPreviewListener =
                panelContentModel.getCommandPreviewListener();
        for (CommandProjectionGroupModel groupModel : panelContentModel.getCommandProjectionGroups()) {
            this.groupTitles.add(groupIndex, groupModel.getTitle());
            List<AbstractCommandButton> list = new ArrayList<>();
            this.buttons.add(groupIndex, list);

            for (CommandProjection projection : groupModel.getCommandProjections()) {
                AbstractCommandButton button = projection.reproject(commandDisplay).buildButton();

                // Wire preview listener is configured on the panel content model
                if (commandPreviewListener != null) {
                    button.getActionModel().addChangeListener(new ChangeListener() {
                        boolean wasRollover = false;

                        @Override
                        public void stateChanged(ChangeEvent e) {
                            boolean isRollover = button.getActionModel().isRollover();
                            if (wasRollover && !isRollover) {
                                commandPreviewListener.onCommandPreviewCanceled(projection.getCommand());
                            }
                            if (!wasRollover && isRollover) {
                                commandPreviewListener.onCommandPreviewActivated(projection.getCommand());
                            }
                            wasRollover = isRollover;
                        }
                    });
                }

                button.putClientProperty(COMMAND, projection.getCommand());
                this.addButtonToLastGroup(projection.getCommand(), button);
            }
            groupIndex++;
        }
    }

    private int addButtonToLastGroup(FlamingoCommand command,
            AbstractCommandButton commandButton) {
        if (this.groupTitles.size() == 0) {
            return -1;
        }
        int groupIndex = this.groupTitles.size() - 1;
        return this.addButtonToGroup(this.groupTitles.get(groupIndex),
                this.buttons.get(groupIndex).size(), command, commandButton);
    }

    protected int addCommandToLastGroup(FlamingoCommand command) {
        AbstractCommandButton button = command.project(createCommandDisplay()).buildButton();
        button.putClientProperty(COMMAND, command);
        return this.addButtonToLastGroup(command, button);
    }

    private int addButtonToGroup(String buttonGroupName, int indexInGroup,
            FlamingoCommand command, AbstractCommandButton commandButton) {
        int groupIndex = this.groupTitles.indexOf(buttonGroupName);
        if (groupIndex < 0) {
            return -1;
        }
        commandButton.updateCustomDimension(this.panelPresentationModel.getCommandIconDimension());
        commandButton.setDisplayState(this.panelPresentationModel.getCommandDisplayState());
        this.add(commandButton);
        this.buttons.get(groupIndex).add(indexInGroup, commandButton);
        if (this.panelContentModel.isSingleSelectionMode()
                && command.isToggle()) {
            this.buttonGroup.add(command);
        }
        this.fireStateChanged();
        return indexInGroup;
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
        return this.panelContentModel.getCommandProjectionGroups().get(index).getTitle();
    }

    @Override
    public void updateUI() {
        setUI(SubstanceCommandButtonPanelUI.createUI(this));
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    /**
     * Returns the list of all buttons in the specified button group.
     *
     * @param groupIndex Group index.
     * @return Unmodifiable view on the list of all buttons in the specified
     * button group.
     * @see #getGroupCount()
     */
    public List<AbstractCommandButton> getGroupButtons(int groupIndex) {
        return Collections.unmodifiableList(this.buttons.get(groupIndex));
    }

    public FlamingoCommand getSelectedCommand() {
        if (this.panelContentModel.isSingleSelectionMode()) {
            for (List<AbstractCommandButton> ljrb : this.buttons) {
                for (AbstractCommandButton jrb : ljrb) {
                    if (jrb instanceof JCommandToggleButton) {
                        JCommandToggleButton jctb = (JCommandToggleButton) jrb;
                        if (jctb.getActionModel().isSelected()) {
                            return (FlamingoCommand) jctb.getClientProperty(COMMAND);
                        }
                    }
                }
            }
        }
        return null;
    }

    public void scrollToSelectedCommand() {
        if (this.panelContentModel.isSingleSelectionMode()) {
            for (List<AbstractCommandButton> ljrb : this.buttons) {
                for (AbstractCommandButton jrb : ljrb) {
                    if (jrb instanceof JCommandToggleButton) {
                        JCommandToggleButton jctb = (JCommandToggleButton) jrb;
                        if (jctb.getActionModel().isSelected()) {
                            Rectangle selectionButtonBounds = jctb.getBounds();
                            scrollRectToVisible(selectionButtonBounds);
                            return;
                        }
                    }
                }
            }
        }
    }

    /**
     * Adds the specified change listener to this button panel.
     *
     * @param l Change listener to add.
     * @see #removeChangeListener(ChangeListener)
     */
    public void addChangeListener(ChangeListener l) {
        this.listenerList.add(ChangeListener.class, l);
    }

    /**
     * Removes the specified change listener from this button panel.
     *
     * @param l Change listener to remove.
     * @see #addChangeListener(ChangeListener)
     */
    public void removeChangeListener(ChangeListener l) {
        this.listenerList.remove(ChangeListener.class, l);
    }

    /**
     * Notifies all registered listener that the state of this command button
     * panel has changed.
     */
    protected void fireStateChanged() {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        ChangeEvent event = new ChangeEvent(this);
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ChangeListener.class) {
                ((ChangeListener) listeners[i + 1]).stateChanged(event);
            }
        }
    }

    @Override
    public Dimension getPreferredScrollableViewportSize() {
        return this.getPreferredSize();
    }

    @Override
    public int getScrollableBlockIncrement(Rectangle visibleRect,
            int orientation, int direction) {
        return 30;
    }

    @Override
    public boolean getScrollableTracksViewportHeight() {
        return (this.getPresentationModel().getLayoutKind() == LayoutKind.COLUMN_FILL);
    }

    @Override
    public boolean getScrollableTracksViewportWidth() {
        return (this.getPresentationModel().getLayoutKind() == LayoutKind.ROW_FILL);
    }

    @Override
    public int getScrollableUnitIncrement(Rectangle visibleRect,
            int orientation, int direction) {
        return 10;
    }
}
