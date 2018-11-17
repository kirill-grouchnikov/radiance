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
    private CommandToggleButtonGroup buttonGroup;

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

    /**
     * Creates a new panel.
     */
    private JCommandButtonPanel() {
        this.buttons = new ArrayList<>();
        this.groupTitles = new ArrayList<>();
    }

    /**
     * Creates a new panel.
     *
     * @param startingDimension Initial dimension for buttons.
     * @deprecated Use {@link #JCommandButtonPanel(CommandPanelContentModel, CommandPanelPresentationModel)}
     */
    @Deprecated
    public JCommandButtonPanel(int startingDimension) {
        this();
        this.panelContentModel = new CommandPanelContentModel(new ArrayList<>());
        this.panelPresentationModel = CommandPanelPresentationModel.builder()
                .setLayoutKind(LayoutKind.ROW_FILL)
                .setCommandIconDimension(startingDimension)
                .setCommandDisplayState(CommandButtonDisplayState.FIT_TO_ICON).build();
        this.updateUI();
    }

    /**
     * Creates a new panel.
     *
     * @param startingState Initial state for buttons.
     * @deprecated Use {@link #JCommandButtonPanel(CommandPanelContentModel, CommandPanelPresentationModel)}
     */
    @Deprecated
    public JCommandButtonPanel(CommandButtonDisplayState startingState) {
        this();
        this.panelContentModel = new CommandPanelContentModel(new ArrayList<>());
        this.panelPresentationModel = CommandPanelPresentationModel.builder()
                .setLayoutKind(LayoutKind.ROW_FILL)
                .setCommandDisplayState(startingState).build();
        this.updateUI();
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
            this.buttonGroup = new CommandToggleButtonGroup();
        } else {
            this.buttonGroup = null;
        }

        int groupIndex = 0;
        FlamingoCommandDisplay commandDisplay = createCommandDisplay();
        FlamingoCommand.CommandPreviewListener commandPreviewListener =
                panelContentModel.getCommandPreviewListener();
        for (CommandGroupModel groupModel : panelContentModel.getCommandGroups()) {
            this.groupTitles.add(groupIndex, groupModel.getTitle());
            List<AbstractCommandButton> list = new ArrayList<>();
            this.buttons.add(groupIndex, list);

            for (FlamingoCommand command : groupModel.getCommandList()) {
                AbstractCommandButton button = command.buildButton(commandDisplay);

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

                button.putClientProperty(COMMAND, command);
                this.addButtonToLastGroup(button);
            }
            groupIndex++;
        }
    }

    /**
     * Adds a new button group at the specified index.
     *
     * @param buttonGroupName Button group name.
     * @param groupIndex      Button group index.
     * @see #addButtonGroup(String)
     * @see #removeButtonGroup(String)
     * @see #removeAllGroups()
     * @deprecated Use {@link CommandPanelContentModel#addCommandGroup(CommandGroupModel)}
     */
    @Deprecated
    public void addButtonGroup(String buttonGroupName, int groupIndex) {
        this.groupTitles.add(groupIndex, buttonGroupName);
        List<AbstractCommandButton> list = new ArrayList<>();
        this.buttons.add(groupIndex, list);
        this.fireStateChanged();
    }

    /**
     * Adds a new button group after all the existing button groups.
     *
     * @param buttonGroupName Button group name.
     * @see #addButtonGroup(String, int)
     * @see #removeButtonGroup(String)
     * @see #removeAllGroups()
     * @deprecated Use {@link CommandPanelContentModel#addCommandGroup(CommandGroupModel)}
     */
    @Deprecated
    public void addButtonGroup(String buttonGroupName) {
        this.addButtonGroup(buttonGroupName, this.groupTitles.size());
    }

    /**
     * Removes the specified button group.
     *
     * @param buttonGroupName Name of the button group to remove.
     * @see #addButtonGroup(String)
     * @see #addButtonGroup(String, int)
     * @see #removeAllGroups()
     * @deprecated Use {@link CommandPanelContentModel#removeCommandGroup(CommandGroupModel)}
     */
    @Deprecated
    public void removeButtonGroup(String buttonGroupName) {
        int groupIndex = this.groupTitles.indexOf(buttonGroupName);
        if (groupIndex < 0)
            return;
        this.groupTitles.remove(groupIndex);
        List<AbstractCommandButton> list = this.buttons.get(groupIndex);
        if (list != null) {
            for (AbstractCommandButton button : list) {
                this.remove(button);
                if (this.panelContentModel.isSingleSelectionMode()
                        && (button instanceof JCommandToggleButton)) {
                    this.buttonGroup.remove((JCommandToggleButton) button);
                }
            }
        }
        this.buttons.remove(groupIndex);
        this.fireStateChanged();
    }

    /**
     * Adds a new button to the specified button group.
     *
     * @param commandButton Button to add.
     * @return Returns the index of the button on the specified group, or -1 if
     * no such group exists.
     * @see #addButtonToGroup(String, AbstractCommandButton)
     * @see #addButtonToGroup(String, int, AbstractCommandButton)
     * @see #removeButtonFromGroup(String, int)
     * @deprecated Use {@link CommandGroupModel#addCommand(FlamingoCommand)}
     */
    @Deprecated
    public int addButtonToLastGroup(AbstractCommandButton commandButton) {
        if (this.groupTitles.size() == 0) {
            return -1;
        }
        int groupIndex = this.groupTitles.size() - 1;
        return this.addButtonToGroup(this.groupTitles.get(groupIndex),
                this.buttons.get(groupIndex).size(), commandButton);
    }

    protected int addCommandToLastGroup(FlamingoCommand command) {
        AbstractCommandButton button = command.buildButton(createCommandDisplay());
        button.putClientProperty(COMMAND, command);
        return this.addButtonToLastGroup(button);
    }

    /**
     * Adds a new button to the specified button group.
     *
     * @param buttonGroupName Name of the button group.
     * @param commandButton   Button to add.
     * @return Returns the index of the button on the specified group, or -1 if
     * no such group exists.
     * @see #addButtonToGroup(String, int, AbstractCommandButton)
     * @see #addButtonToLastGroup(AbstractCommandButton)
     * @see #removeButtonFromGroup(String, int)
     * @deprecated Use {@link CommandGroupModel#addCommand(FlamingoCommand)}
     */
    @Deprecated
    public int addButtonToGroup(String buttonGroupName,
            AbstractCommandButton commandButton) {
        int groupIndex = this.groupTitles.indexOf(buttonGroupName);
        if (groupIndex < 0)
            return -1;
        return this.addButtonToGroup(buttonGroupName, this.buttons.get(
                groupIndex).size(), commandButton);
    }

    /**
     * Adds a new button to the specified button group.
     *
     * @param buttonGroupName Name of the button group.
     * @param indexInGroup    Index of the button in group.
     * @param commandButton   Button to add.
     * @return Returns the index of the button on the specified group, or -1 if
     * no such group exists.
     * @see #addButtonToGroup(String, int, AbstractCommandButton)
     * @see #addButtonToLastGroup(AbstractCommandButton)
     * @see #removeButtonFromGroup(String, int)
     * @deprecated Use {@link CommandGroupModel#addCommand(FlamingoCommand)}
     */
    @Deprecated
    public int addButtonToGroup(String buttonGroupName, int indexInGroup,
            AbstractCommandButton commandButton) {
        int groupIndex = this.groupTitles.indexOf(buttonGroupName);
        if (groupIndex < 0) {
            return -1;
        }
        commandButton.updateCustomDimension(this.panelPresentationModel.getCommandIconDimension());
        commandButton.setDisplayState(this.panelPresentationModel.getCommandDisplayState());
        this.add(commandButton);
        this.buttons.get(groupIndex).add(indexInGroup, commandButton);
        if (this.panelContentModel.isSingleSelectionMode()
                && (commandButton instanceof JCommandToggleButton)) {
            this.buttonGroup.add((JCommandToggleButton) commandButton);
        }
        this.fireStateChanged();
        return indexInGroup;
    }

    /**
     * Removes the button at the specified index from the specified button
     * group.
     *
     * @param buttonGroupName Name of the button group.
     * @param indexInGroup    Index of the button to remove.
     * @see #addButtonToGroup(String, AbstractCommandButton)
     * @see #addButtonToGroup(String, int, AbstractCommandButton)
     * @see #addButtonToLastGroup(AbstractCommandButton)
     * @deprecated Use {@link CommandGroupModel#removeCommand(FlamingoCommand)}
     */
    @Deprecated
    public void removeButtonFromGroup(String buttonGroupName, int indexInGroup) {
        int groupIndex = this.groupTitles.indexOf(buttonGroupName);
        if (groupIndex < 0)
            return;

        AbstractCommandButton removed = this.buttons.get(groupIndex).remove(
                indexInGroup);
        this.remove(removed);
        if (this.panelContentModel.isSingleSelectionMode()
                && (removed instanceof JCommandToggleButton)) {
            this.buttonGroup.remove((JCommandToggleButton) removed);
        }
        this.fireStateChanged();
    }

    /**
     * Removes all the button groups and buttons from this panel.
     *
     * @see #addButtonGroup(String, int)
     * @see #addButtonGroup(String)
     * @see #removeButtonGroup(String)
     * @see #removeButtonFromGroup(String, int)
     * @deprecated Use {@link CommandPanelContentModel#removeAllCommandGroups()}
     */
    @Deprecated
    public void removeAllGroups() {
        for (List<AbstractCommandButton> ljcb : this.buttons) {
            for (AbstractCommandButton jcb : ljcb) {
                if (this.panelContentModel.isSingleSelectionMode()
                        && (jcb instanceof JCommandToggleButton)) {
                    this.buttonGroup.remove((JCommandToggleButton) jcb);
                }
                this.remove(jcb);
            }
        }
        this.buttons.clear();
        this.groupTitles.clear();
        this.fireStateChanged();
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
     * Returns the number of buttons in this panel.
     *
     * @return Number of buttons in this panel.
     * @deprecated Use {@link CommandPanelContentModel#getCommandCount()}
     */
    @Deprecated
    public int getButtonCount() {
        int result = 0;
        for (List<AbstractCommandButton> ljcb : this.buttons) {
            result += ljcb.size();
        }
        return result;
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

    @Override
    public void updateUI() {
        setUI(SubstanceCommandButtonPanelUI.createUI(this));
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    /**
     * Sets the maximum button columns for this panel. When this panel is shown
     * and the layout kind is {@link LayoutKind#ROW_FILL}, it will have no more
     * than this number of buttons in each row. Fires a
     * <code>maxButtonColumns</code> property change event.
     *
     * @param maxButtonColumns Maximum button columns for this panel.
     * @see #getMaxButtonColumns()
     * @see #setMaxButtonRows(int)
     * @deprecated See {@link CommandPanelPresentationModel#setMaxColumns(int)}
     */
    @Deprecated
    public void setMaxButtonColumns(int maxButtonColumns) {
        this.getPresentationModel().setMaxColumns(maxButtonColumns);
    }

    /**
     * Returns the maximum button columns for this panel. The return value is
     * relevant only when the layout kind is {@link LayoutKind#ROW_FILL}.
     *
     * @return Maximum button columns for this panel.
     * @see #setMaxButtonColumns(int)
     * @see #getMaxButtonRows()
     * @deprecated Use {@link CommandPanelPresentationModel#getMaxColumns()}
     */
    @Deprecated
    public int getMaxButtonColumns() {
        return this.getPresentationModel().getMaxColumns();
    }

    /**
     * Sets the maximum button rows for this panel. When this panel is shown and
     * the layout kind is {@link LayoutKind#COLUMN_FILL}, it will have no more
     * than this number of buttons in each column. Fires a
     * <code>maxButtonRows</code> property change event.
     *
     * @param maxButtonRows Maximum button rows for this panel.
     * @see #getMaxButtonRows()
     * @see #setMaxButtonColumns(int)
     * @deprecated Use {@link CommandPanelPresentationModel#setMaxRows(int)}
     */
    @Deprecated
    public void setMaxButtonRows(int maxButtonRows) {
        this.getPresentationModel().setMaxRows(maxButtonRows);
    }

    /**
     * Returns the maximum button rows for this panel. The return value is
     * relevant only when the layout kind is {@link LayoutKind#COLUMN_FILL}.
     *
     * @return Maximum button rows for this panel.
     * @see #setMaxButtonRows(int)
     * @see #getMaxButtonColumns()
     * @deprecated Use {@link CommandPanelPresentationModel#getMaxRows()}
     */
    @Deprecated
    public int getMaxButtonRows() {
        return this.getPresentationModel().getMaxRows();
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

    /**
     * Sets the selection mode for this panel. If <code>true</code> is passed as
     * the parameter, all {@link JCommandToggleButton} in this panel are set to
     * belong to the same button group.
     *
     * @param isSingleSelectionMode If <code>true</code>,all {@link JCommandToggleButton} in this
     *                              panel are set to belong to the same button group.
     * @see #getSelectedButton()
     * @deprecated Use {@link CommandPanelContentModel#setSingleSelectionMode(boolean)}
     */
    @Deprecated
    public void setSingleSelectionMode(boolean isSingleSelectionMode) {
        this.panelContentModel.setSingleSelectionMode(isSingleSelectionMode);
    }

    /**
     * Sets indication whether button group labels should be shown. Fires a
     * <code>toShowGroupLabels</code> property change event.
     *
     * @param toShowGroupLabels If <code>true</code>, this panel will show the labels of the
     *                          button groups.
     * @see #isToShowGroupLabels()
     * @deprecated Use {@link CommandPanelPresentationModel#setToShowGroupLabels(boolean)}
     */
    @Deprecated
    public void setToShowGroupLabels(boolean toShowGroupLabels) {
        this.getPresentationModel().setToShowGroupLabels(toShowGroupLabels);
    }

    /**
     * Returns indication whether button group labels should be shown.
     *
     * @return If <code>true</code>, this panel shows the labels of the button
     * groups, and <code>false</code> otherwise.
     * @see #setToShowGroupLabels(boolean)
     * @deprecated Use {@link CommandPanelPresentationModel#isToShowGroupLabels()}
     */
    public boolean isToShowGroupLabels() {
        return this.getPresentationModel().isToShowGroupLabels();
    }

    /**
     * Sets the new dimension for the icons in this panel. The state for all the
     * icons is set to {@link CommandButtonDisplayState#FIT_TO_ICON}.
     *
     * @param dimension New dimension for the icons in this panel.
     * @see #setIconState(CommandButtonDisplayState)
     * @deprecated Use {@link CommandPanelPresentationModel#setCommandIconDimension(Integer)}
     */
    @Deprecated
    public void setIconDimension(int dimension) {
        this.panelPresentationModel.setCommandIconDimension(dimension);
        this.panelPresentationModel.setCommandDisplayState(CommandButtonDisplayState.FIT_TO_ICON);
    }

    /**
     * Sets the new state for the icons in this panel. The dimension for all the
     * icons is set to -1; this method should only be called with a state that
     * has an associated default size (like
     * {@link CommandButtonDisplayState#BIG},
     * {@link CommandButtonDisplayState#TILE},
     * {@link CommandButtonDisplayState#MEDIUM} and
     * {@link CommandButtonDisplayState#SMALL}).
     *
     * @param state New state for the icons in this panel.
     * @see #setIconDimension(int)
     * @deprecated Use {@link CommandPanelPresentationModel#setCommandDisplayState(CommandButtonDisplayState)}
     */
    @Deprecated
    public void setIconState(CommandButtonDisplayState state) {
        this.panelPresentationModel.setCommandIconDimension(-1);
        this.panelPresentationModel.setCommandDisplayState(state);
    }

    /**
     * Returns the selected button of this panel. Only relevant for single
     * selection mode (set by {@link #setSingleSelectionMode(boolean)}),
     * returning <code>null</code> otherwise.
     *
     * @return The selected button of this panel.
     * @see #setSingleSelectionMode(boolean)
     * @deprecated Use {@link #getSelectedCommand()}
     */
    @Deprecated
    public JCommandToggleButton getSelectedButton() {
        if (this.panelContentModel.isSingleSelectionMode()) {
            for (List<AbstractCommandButton> ljrb : this.buttons) {
                for (AbstractCommandButton jrb : ljrb) {
                    if (jrb instanceof JCommandToggleButton) {
                        JCommandToggleButton jctb = (JCommandToggleButton) jrb;
                        if (jctb.getActionModel().isSelected()) {
                            return jctb;
                        }
                    }
                }
            }
        }
        return null;
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
     * Returns the layout kind of this panel.
     *
     * @return Layout kind of this panel.
     * @see #setLayoutKind(LayoutKind)
     * @deprecated Use {@link CommandPanelPresentationModel#getLayoutKind()}
     */
    public LayoutKind getLayoutKind() {
        return this.getPresentationModel().getLayoutKind();
    }

    /**
     * Sets the new layout kind for this panel. Fires a <code>layoutKind</code>
     * property change event.
     *
     * @param layoutKind New layout kind for this panel.
     * @see #getLayoutKind()
     * @deprecated Use {@link CommandPanelPresentationModel#setLayoutKind(LayoutKind)}
     */
    @Deprecated
    public void setLayoutKind(LayoutKind layoutKind) {
        this.getPresentationModel().setLayoutKind(layoutKind);
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
