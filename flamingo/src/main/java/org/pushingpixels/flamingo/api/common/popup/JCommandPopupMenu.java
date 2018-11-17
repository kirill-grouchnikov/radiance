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
import org.pushingpixels.flamingo.internal.substance.common.ui.SubstanceCommandPopupMenuUI;
import org.pushingpixels.flamingo.internal.ui.common.popup.ScrollableHost;

import javax.swing.*;
import javax.swing.JPopupMenu.Separator;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Popup menu. Can host any number of command menu buttons added with
 * {@link #addMenuButton(JCommandMenuButton)} separated with optional
 * {@link #addMenuSeparator()}. The
 * {@link #JCommandPopupMenu(JCommandButtonPanel, int, int)} constructor allows
 * placing a scrollable command button panel in the top part of the popup menu.
 *
 * @author Kirill Grouchnikov
 */
public class JCommandPopupMenu extends JPopupPanel implements ScrollableHost {
    /**
     * @see #getUIClassID
     */
    public static final String uiClassID = "CommandPopupMenuUI";

    private CommandPopupMenuContentModel popupMenuContentModel;
    private CommandPopupMenuPresentationModel popupMenuPresentationModel;

    private CommandPanelContentModel popupMenuPanelContentModel;
    private CommandPanelPresentationModel popupMenuPanelPresentationModel;

    /**
     * The main button panel. Can be <code>null</code> if this command popup
     * menu was created with the {@link #JCommandPopupMenu()} constructor.
     *
     * @see #JCommandPopupMenu(JCommandButtonPanel, int, int)
     * @see #hasCommandButtonPanel()
     * @see #getMainButtonPanel()
     */
    private JCommandButtonPanel mainButtonPanel;

    /**
     * Menu components. This list holds:
     * <ul>
     * <li>{@link JCommandMenuButton}s added with
     * {@link #addMenuButton(JCommandMenuButton)}</li>
     * <li>{@link JCommandToggleMenuButton}s added with
     * {@link #addMenuButton(JCommandToggleMenuButton)}</li>
     * <li>{@link Separator}s added with {@link #addMenuSeparator()}</li>
     * <li>{@link JPanel}s added by the subclasses with
     * {@link #addMenuPanel(JPanel)}</li>
     * </ul>
     *
     * @see #addMenuButton(JCommandMenuButton)
     * @see #addMenuButton(JCommandToggleMenuButton)
     * @see #addMenuSeparator()
     * @see #addMenuPanel(JPanel)
     * @see #getMenuComponents()
     */
    private List<Component> menuComponents;

    /**
     * Maximum number of button columns visible in the {@link #mainButtonPanel}.
     *
     * @see #JCommandPopupMenu(JCommandButtonPanel, int, int)
     * @see #getMaxButtonColumns()
     */
    private int maxButtonColumns;

    /**
     * Maximum number of button rows visible in the {@link #mainButtonPanel}.
     *
     * @see #JCommandPopupMenu(JCommandButtonPanel, int, int)
     * @see #getMaxVisibleButtonRows()
     */
    private int maxVisibleButtonRows;

    /**
     * Creates an empty popup menu with no button panel.
     *
     * @deprecated Use {@link #JCommandPopupMenu(CommandPopupMenuContentModel, CommandPopupMenuPresentationModel)}
     */
    @Deprecated
    public JCommandPopupMenu() {
        this.menuComponents = new ArrayList<>();

        this.popupMenuPresentationModel = CommandPopupMenuPresentationModel.builder()
                .setMaxVisibleMenuCommands(-1)
                .setToDismissOnCommandActivation(true).build();
    }

    /**
     * Creates a popup menu hosting the specified button panel.
     *
     * @param buttonPanel          Fully constructed button panel.
     * @param maxButtonColumns     Maximum number of button columns visible in
     *                             <code>buttonPanel</code>.
     * @param maxVisibleButtonRows Maximum number of button rows visible in
     *                             <code>buttonPanel</code>.
     * @deprecated Use {@link #JCommandPopupMenu(CommandPopupMenuContentModel, CommandPopupMenuPresentationModel)}
     */
    @Deprecated
    public JCommandPopupMenu(JCommandButtonPanel buttonPanel,
            int maxButtonColumns, int maxVisibleButtonRows) {
        this();

        this.mainButtonPanel = buttonPanel;
        this.maxButtonColumns = maxButtonColumns;
        this.maxVisibleButtonRows = maxVisibleButtonRows;

        this.updateUI();
    }

    public JCommandPopupMenu(CommandPopupMenuContentModel popupMenuContentModel,
            CommandPopupMenuPresentationModel popupMenuPresentationModel) {
        this.menuComponents = new ArrayList<>();

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

    protected void populateContent() {
        if (this.popupMenuPanelContentModel != null) {
            this.mainButtonPanel = new JCommandButtonPanel(
                    this.popupMenuPanelContentModel,
                    this.popupMenuPresentationModel.getPanelPresentationModel());
        }
        if (this.popupMenuPanelPresentationModel != null) {
            this.maxButtonColumns = this.popupMenuPanelPresentationModel.getMaxColumns();
            this.maxVisibleButtonRows = this.popupMenuPanelPresentationModel.getMaxRows();
        }

        List<CommandGroupModel> commandGroups = this.popupMenuContentModel.getCommandGroups();
        for (int i = 0; i < commandGroups.size(); i++) {
            for (FlamingoCommand command : commandGroups.get(i).getCommandList()) {
                AbstractCommandButton commandButton = command.buildMenuButton();

                // highlight?
                FlamingoCommand highlightedCommand =
                        this.popupMenuPresentationModel.getHighlightedCommand();
                if (command == highlightedCommand) {
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
     * Adds the specified menu button to this menu.
     *
     * @param menuButton Menu button to add.
     * @deprecated Use {@link CommandGroupModel#addCommand(FlamingoCommand)} on the content
     * model of this popup menu. Use
     * {@link CommandPopupMenuContentModel#addChangeListener(ChangeListener)} to get notified
     * on changes to the content of this popup menu.
     */
    @Deprecated
    public void addMenuButton(JCommandMenuButton menuButton) {
        menuButton.setHorizontalAlignment(SwingUtilities.LEFT);
        this.menuComponents.add(menuButton);
        this.fireStateChanged();
    }

    /**
     * Adds the specified toggle menu button to this menu.
     *
     * @param menuButton Menu button to add.
     * @deprecated Use {@link CommandGroupModel#addCommand(FlamingoCommand)} on the content
     * model of this popup menu. Use
     * {@link CommandPopupMenuContentModel#addChangeListener(ChangeListener)} to get
     * notified on changes to the content of this popup menu.
     */
    @Deprecated
    public void addMenuButton(JCommandToggleMenuButton menuButton) {
        menuButton.setHorizontalAlignment(SwingUtilities.LEFT);
        this.menuComponents.add(menuButton);
        this.fireStateChanged();
    }

    /**
     * Adds a menu separator to this menu.
     *
     * @deprecated Use {@link CommandPopupMenuContentModel#addCommandGroup(CommandGroupModel)}
     * to start a new command group for this popup menu.  Use
     * {@link CommandPopupMenuContentModel#addChangeListener(ChangeListener)} to get
     * notified on changes to the content of this popup menu.
     */
    @Deprecated
    public void addMenuSeparator() {
        this.menuComponents.add(new JPopupMenu.Separator());
        this.fireStateChanged();
    }

    /**
     * Adds a menu panel to this menu.
     *
     * @param menuPanel Menu panel to add.
     */
    void addMenuPanel(JPanel menuPanel) {
        if (this.popupMenuPresentationModel.getMaxVisibleMenuCommands() > 0) {
            throw new IllegalStateException(
                    "This method is not supported on menu configured with max visible entry count");
        }
        this.menuComponents.add(menuPanel);
        this.fireStateChanged();
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

    /**
     * Returns an unmodifiable list of all the menu components. Can return
     * <code>null</code>.
     *
     * @return An unmodifiable list of all the menu components
     */
    public java.util.List<Component> getMenuComponents() {
        if (this.menuComponents == null) {
            return null;
        }
        return Collections.unmodifiableList(this.menuComponents);
    }

    /**
     * Returns the maximum number of button columns visible in the command
     * button panel of this menu.
     *
     * @return The maximum number of button columns visible in the command
     * button panel of this menu.
     * @see #JCommandPopupMenu(JCommandButtonPanel, int, int)
     * @see #getMaxVisibleButtonRows()
     * @deprecated Use {@link CommandPopupMenuPresentationModel#getPanelPresentationModel()}
     * and {@link CommandPanelPresentationModel#getMaxColumns()}.
     */
    @Deprecated
    public int getMaxButtonColumns() {
        return (this.popupMenuPanelPresentationModel != null)
                ? this.popupMenuPanelPresentationModel.getMaxColumns()
                : this.maxButtonColumns;
    }

    /**
     * Returns the maximum number of button rows visible in the command button
     * panel of this menu.
     *
     * @return The maximum number of button rows visible in the command button
     * panel of this menu.
     * @see #JCommandPopupMenu(JCommandButtonPanel, int, int)
     * @see #getMaxButtonColumns()
     * @deprecated Use {@link CommandPopupMenuPresentationModel#getPanelPresentationModel()}
     * and {@link CommandPanelPresentationModel#getMaxRows()}.
     */
    @Deprecated
    public int getMaxVisibleButtonRows() {
        return (this.popupMenuPanelPresentationModel != null)
                ? this.popupMenuPanelPresentationModel.getMaxRows()
                : this.maxVisibleButtonRows;
    }

    /**
     * Returns the maximum number of menu items visible in this menu.
     *
     * @return The maximum number of menu items visible in this menu. If the
     * value is negative, there is no limitation on how many menu
     * buttons are shown, and the entire popup menu can overflow the
     * monitor edges.
     * @deprecated Use {@link CommandPopupMenuPresentationModel#getMaxVisibleMenuCommands()}
     */
    @Deprecated
    public int getMaxVisibleMenuButtons() {
        return this.popupMenuPresentationModel.getMaxVisibleMenuCommands();
    }

    /**
     * Sets the maximum number of menu items visible in this menu. If the value
     * is negative, there is no limitation on how many menu buttons are shown,
     * and the entire popup menu can overflow the monitor edges.
     *
     * @param maxVisibleMenuButtons The new value for the maximum number of menu items visible in
     *                              this menu.
     * @deprecated Use {@link CommandPopupMenuPresentationModel#setMaxVisibleMenuCommands(int)}
     */
    @Deprecated
    public void setMaxVisibleMenuButtons(int maxVisibleMenuButtons) {
        for (Component menuComp : this.menuComponents) {
            if (menuComp instanceof JPanel) {
                throw new IllegalStateException(
                        "This method is not supported on menus with panels");
            }
        }

        this.popupMenuPresentationModel.setMaxVisibleMenuCommands(maxVisibleMenuButtons);
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    @Override
    public void updateUI() {
        setUI(SubstanceCommandPopupMenuUI.createUI(this));
    }

    /**
     * Adds the specified change listener to track changes to this popup menu.
     *
     * @param l Change listener to add.
     * @see #removeChangeListener(ChangeListener)
     */
    public void addChangeListener(ChangeListener l) {
        this.listenerList.add(ChangeListener.class, l);
    }

    /**
     * Removes the specified change listener from tracking changes to this popup
     * menu.
     *
     * @param l Change listener to remove.
     * @see #addChangeListener(ChangeListener)
     */
    public void removeChangeListener(ChangeListener l) {
        this.listenerList.remove(ChangeListener.class, l);
    }

    /**
     * Notifies all registered listener that the state of this popup menu has
     * changed.
     */
    protected void fireStateChanged() {
        // Guaranteed to return a non-null array
        Object[] listeners = this.listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        ChangeEvent event = new ChangeEvent(this);
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ChangeListener.class) {
                ((ChangeListener) listeners[i + 1]).stateChanged(event);
            }
        }
    }

    /**
     * @deprecated Use {@link CommandPopupMenuPresentationModel#isToDismissOnCommandActivation()}
     */
    @Deprecated
    public boolean isToDismissOnChildClick() {
        return this.popupMenuPresentationModel.isToDismissOnCommandActivation();
    }

    /**
     * @deprecated Use {@link CommandPopupMenuPresentationModel#setToDismissOnCommandActivation(boolean)}
     */
    @Deprecated
    public void setToDismissOnChildClick(boolean toDismissOnChildClick) {
        this.popupMenuPresentationModel.setToDismissOnCommandActivation(toDismissOnChildClick);
    }
}
