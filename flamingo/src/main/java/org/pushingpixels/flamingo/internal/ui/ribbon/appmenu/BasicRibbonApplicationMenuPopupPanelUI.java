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
package org.pushingpixels.flamingo.internal.ui.ribbon.appmenu;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.*;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenu;
import org.pushingpixels.flamingo.internal.substance.common.ui.SubstanceCommandMenuButtonUI;
import org.pushingpixels.flamingo.internal.ui.common.popup.BasicPopupPanelUI;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.*;

/**
 * Basic UI for ribbon application menu button {@link JRibbonApplicationMenuButton}.
 *
 * @author Kirill Grouchnikov
 */
public abstract class BasicRibbonApplicationMenuPopupPanelUI extends BasicPopupPanelUI {
    private JPanel panelLevel1;

    protected JScrollablePanel<JPanel> panelScrollerLevel2;

    protected JPanel panelLevel2;

    private JPanel footerPanel;

    private static final CommandButtonPresentationState MENU_TILE_LEVEL_1 =
            new CommandButtonPresentationState(
                    "Ribbon application menu tile level 1", 32) {
                @Override
                public CommandButtonLayoutManager createLayoutManager(AbstractCommandButton commandButton) {
                    return new CommandButtonLayoutManagerMenuTileLevel1();
                }
            };

    /**
     * The associated application menu button.
     */
    protected JRibbonApplicationMenuPopupPanel applicationMenuPopupPanel;

    protected JPanel mainPanel;

    @Override
    public void installUI(JComponent c) {
        this.applicationMenuPopupPanel = (JRibbonApplicationMenuPopupPanel) c;
        this.popupPanel = (JPopupPanel) c;

        this.applicationMenuPopupPanel.setLayout(new BorderLayout());

        installDefaults();
        installComponents();
        installListeners();
    }

    @Override
    public void uninstallUI(JComponent c) {
        uninstallListeners();
        uninstallComponents();
        uninstallDefaults();

        this.applicationMenuPopupPanel = null;
    }

    @Override
    protected void installComponents() {
        super.installComponents();

        this.mainPanel = new JPanel(new BorderLayout());

        this.panelLevel1 = new JPanel();
        this.panelLevel1.setLayout(new LayoutManager() {
            @Override
            public void addLayoutComponent(String name, Component comp) {
            }

            @Override
            public void removeLayoutComponent(Component comp) {
            }

            @Override
            public Dimension preferredLayoutSize(Container parent) {
                int height = 0;
                int width = 0;
                for (int i = 0; i < parent.getComponentCount(); i++) {
                    Dimension pref = parent.getComponent(i).getPreferredSize();
                    height += pref.height;
                    width = Math.max(width, pref.width);
                }

                Insets ins = parent.getInsets();
                return new Dimension(width + ins.left + ins.right, height + ins.top + ins.bottom);
            }

            @Override
            public Dimension minimumLayoutSize(Container parent) {
                return preferredLayoutSize(parent);
            }

            @Override
            public void layoutContainer(Container parent) {
                Insets ins = parent.getInsets();

                int topY = ins.top;
                for (int i = 0; i < parent.getComponentCount(); i++) {
                    Component comp = parent.getComponent(i);
                    Dimension pref = comp.getPreferredSize();
                    comp.setBounds(ins.left, topY, parent.getWidth() - ins.left - ins.right,
                            pref.height);
                    topY += pref.height;
                }
            }
        });

        final RibbonApplicationMenuPanelProjection ribbonAppMenuProjection =
                (RibbonApplicationMenuPanelProjection) this.applicationMenuPopupPanel.getRibbonAppMenuProjection();
        final RibbonApplicationMenu ribbonAppMenu = (ribbonAppMenuProjection != null)
                ? ribbonAppMenuProjection.getContentModel() : null;

        if (ribbonAppMenu != null) {
            final Map<Command, CommandButtonPresentationModel.Overlay> commandOverlays =
                    ribbonAppMenuProjection.getCommandOverlays();
            CommandButtonPresentationModel baseCommandPresentation =
                    CommandButtonPresentationModel.builder()
                            .setMenu(true).build();
            List<CommandGroup> primaryEntries = ribbonAppMenu.getCommandGroups();
            int primaryGroupCount = primaryEntries.size();
            for (int i = 0; i < primaryGroupCount; i++) {
                for (final Command menuEntry : primaryEntries.get(i).getCommands()) {
                    // Check to see if we have an overlay for the current command
                    CommandButtonPresentationModel commandPresentation = baseCommandPresentation;
                    if (commandOverlays.containsKey(menuEntry)) {
                        commandPresentation = commandPresentation.overlayWith(
                                commandOverlays.get(menuEntry));
                    }
                    final JCommandMenuButton commandButton =
                            (JCommandMenuButton) menuEntry.project(commandPresentation)
                                    .buildComponent();

                    if (menuEntry.getSecondaryContentModel() == null) {
                        // if there are no secondary menu items, remove all entries from the
                        // secondary panel
                        commandButton.addRolloverActionListener((ActionEvent e) -> {
                            panelLevel2.removeAll();
                            panelScrollerLevel2.applyComponentOrientation(
                                    applicationMenuPopupPanel.getComponentOrientation());
                            panelLevel2.revalidate();
                            panelLevel2.repaint();
                        });
                    } else {
                        commandButton.addRolloverActionListener((ActionEvent e) -> {
                            // populate the second level panel with secondary level items
                            panelLevel2.removeAll();
                            panelLevel2.setLayout(new BorderLayout());

                            CommandButtonPresentationState secondaryMenuPresentationState =
                                    ribbonAppMenuProjection.getSecondaryLevelCommandPresentationState()
                                            .get(menuEntry);
                            if (secondaryMenuPresentationState == null) {
                                secondaryMenuPresentationState =
                                        CommandButtonPresentationState.MEDIUM;
                            }

                            JRibbonApplicationMenuPopupPanelSecondary secondary =
                                    JRibbonApplicationMenuPopupPanelSecondary.getPanel(menuEntry,
                                            commandOverlays, secondaryMenuPresentationState,
                                            commandButton);
                            secondary.applyComponentOrientation(
                                    applicationMenuPopupPanel.getComponentOrientation());
                            panelLevel2.add(secondary, BorderLayout.CENTER);
                            panelLevel2.revalidate();
                            panelLevel2.repaint();
                            // emulate showing the popup so the button remains "selected"
                            commandButton.getPopupModel().setPopupShowing(true);
                        });
                    }
                    commandButton.setPresentationState(MENU_TILE_LEVEL_1);
                    commandButton.setHorizontalAlignment(SwingUtilities.LEADING);
                    commandButton.setPopupOrientationKind(
                            CommandButtonPresentationModel.PopupOrientationKind.SIDEWARD);
                    commandButton.setEnabled(menuEntry.isEnabled());
                    this.panelLevel1.add(commandButton);
                }
                if (i < (primaryGroupCount - 1)) {
                    this.panelLevel1.add(new JPopupMenu.Separator());
                }
            }
        }

        mainPanel.add(this.panelLevel1, BorderLayout.LINE_START);

        this.panelLevel2 = new JPanel();
        this.panelScrollerLevel2 = new JScrollablePanel<>(this.panelLevel2,
                JScrollablePanel.ScrollType.VERTICALLY);
        this.panelScrollerLevel2.setPreferredSize(new Dimension(30 *
                this.panelLevel1.getFont().getSize() - 30, 10));

        mainPanel.add(this.panelScrollerLevel2, BorderLayout.CENTER);

        this.applicationMenuPopupPanel.add(mainPanel, BorderLayout.CENTER);

        this.footerPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING)) {
            @Override
            protected void paintComponent(Graphics g) {
                SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(null);
                SubstanceColorScheme baseFillScheme = SubstanceColorSchemeUtilities.getColorScheme(
                        null, ComponentState.ENABLED);
                fillPainter.paintContourBackground(g, null,
                        footerPanel.getWidth(), footerPanel.getHeight(),
                        new Rectangle(0, 0, footerPanel.getWidth(), footerPanel.getHeight()), false,
                        baseFillScheme, true);
            }
        };
        if (ribbonAppMenu != null) {
            for (Command footerCommand : ribbonAppMenu.getFooterCommands().getCommands()) {
                JCommandButton commandFooterButton =
                        (JCommandButton) footerCommand.project().buildComponent();
                commandFooterButton.setPresentationState(CommandButtonPresentationState.MEDIUM);
                commandFooterButton.setFlat(false);
                this.footerPanel.add(commandFooterButton);
            }
        }

        this.applicationMenuPopupPanel.add(this.footerPanel, BorderLayout.SOUTH);
    }

    @Override
    protected void installListeners() {
        super.installListeners();
    }

    @Override
    protected void uninstallDefaults() {
        super.uninstallDefaults();
    }

    @Override
    protected void uninstallComponents() {
        super.uninstallComponents();
    }

    @Override
    protected void uninstallListeners() {
        super.uninstallListeners();
    }

    @Override
    public void paint(Graphics g, JComponent c) {
    }

    public JPanel getPanelLevel1() {
        return panelLevel1;
    }

    public JPanel getPanelLevel2() {
        return panelLevel2;
    }

    private boolean getCommandPath(CommandMenuContentModel commandMenuContentModel,
            Command command, List<Command> pathTo) {
        // Is the command in this menu?
        for (CommandGroup group : commandMenuContentModel.getCommandGroups()) {
            if (group.getCommands().contains(command)) {
                return true;
            }
        }

        // Go one level deeper
        for (CommandGroup group : commandMenuContentModel.getCommandGroups()) {
            for (Command secondary : group.getCommands()) {
                CommandMenuContentModel secondaryMenuContentModel =
                        secondary.getSecondaryContentModel();
                if (secondaryMenuContentModel != null) {
                    pathTo.add(secondary);
                    if (getCommandPath(secondaryMenuContentModel, command, pathTo)) {
                        // Found it!
                        return true;
                    }
                    // Not there
                    pathTo.remove(pathTo.size() - 1);
                }
            }
        }

        // Didn't find it anywhere in the passed menu (recursively)
        return false;
    }

    private <T extends AbstractCommandButton> T getPrimaryForCommand(Command command) {
        for (int topLevelIndex = 0; topLevelIndex < this.panelLevel1.getComponentCount();
             topLevelIndex++) {
            Component topLevel = this.panelLevel1.getComponent(topLevelIndex);
            if (topLevel instanceof AbstractCommandButton) {
                AbstractCommandButton button = (AbstractCommandButton) topLevel;
                if (button.getProjection().getContentModel() == command) {
                    return (T) button;
                }
            }
        }
        return null;
    }

    private <T extends AbstractCommandButton> T getSecondaryForCommand(Command command) {
        JRibbonApplicationMenuPopupPanelSecondary secondaryPanel =
                (JRibbonApplicationMenuPopupPanelSecondary) this.panelLevel2.getComponent(0);
        for (int secondLevelIndex = 0;
             secondLevelIndex < secondaryPanel.getComponentCount();
             secondLevelIndex++) {
            Component secondLevel = secondaryPanel.getComponent(
                    secondLevelIndex);
            if (secondLevel instanceof AbstractCommandButton) {
                AbstractCommandButton secondLevelButton =
                        (AbstractCommandButton) secondLevel;
                if (secondLevelButton.getProjection().getContentModel() == command) {
                    return (T) secondLevelButton;
                }
            }
        }
        return null;
    }

    private <T extends AbstractCommandButton> T getMenuButtonForCommand(Command command) {
        List<PopupPanelManager.PopupInfo> popups =
                PopupPanelManager.defaultManager().getShownPath();
        if (popups.size() > 0) {
            PopupPanelManager.PopupInfo last = popups.get(popups.size() - 1);
            JPopupPanel popupPanel = last.getPopupPanel();
            // Should be command popup menu
            if (!(popupPanel instanceof JCommandPopupMenu)) {
                return null;
            }

            JCommandPopupMenu popupMenu = (JCommandPopupMenu) popupPanel;
            for (Component child : popupMenu.getMenuComponents()) {
                if (child instanceof AbstractCommandButton) {
                    AbstractCommandButton button = (AbstractCommandButton) child;
                    if (button.getProjection().getContentModel() == command) {
                        return (T) button;
                    }
                }
            }
        }
        return null;
    }

    public Runnable getPathToSequence(Command command) {
        final RibbonApplicationMenuPanelProjection ribbonAppMenuProjection =
                (RibbonApplicationMenuPanelProjection) this.applicationMenuPopupPanel.getRibbonAppMenuProjection();
        final RibbonApplicationMenu ribbonAppMenu = (ribbonAppMenuProjection != null)
                ? ribbonAppMenuProjection.getContentModel() : null;
        if (ribbonAppMenu == null) {
            return null;
        }

        // Is a footer command?
        int footerIndex = ribbonAppMenu.getFooterCommands().getCommands().indexOf(command);
        if (footerIndex >= 0) {
            AbstractCommandButton footerButton =
                    (AbstractCommandButton) this.footerPanel.getComponent(footerIndex);
            return () -> {
                footerButton.getActionModel().setRollover(true);
                footerButton.getActionModel().setArmed(true);
            };
        }

        List<Command> pathToCommand = new ArrayList<>();
        boolean found = getCommandPath(ribbonAppMenu, command, pathToCommand);
        if (!found) {
            // Not in the app menu at all
            return null;
        }

        // Trace the path to the command
        int pathLength = pathToCommand.size();
        if (pathLength == 0) {
            // It is a primary (top-level) command in the app menu
            AbstractCommandButton primary = getPrimaryForCommand(command);
            if (primary == null) {
                throw new IllegalStateException("Should have found the command at top level");
            }

            return () -> {
                // Highlight the primary button for this command
                primary.getActionModel().setRollover(true);
                primary.getActionModel().setArmed(true);
            };
        }

        // Find the primary command for the path
        JCommandButton primary = getPrimaryForCommand(pathToCommand.get(0));
        if (primary == null) {
            throw new IllegalStateException("Should have found the command at top level");
        }

        if (pathLength == 1) {
            // It is a secondary-level command in the app menu.
            return () -> {
                // Highlight the primary button for the first "leg" of the path
                primary.getPopupModel().setRollover(true);
                primary.getPopupModel().setArmed(true);
                // Fire the rollover action so that the secondary menu content is
                // populated
                SubstanceCommandMenuButtonUI buttonUI =
                        (SubstanceCommandMenuButtonUI) primary.getUI();
                buttonUI.fireRolloverActionPerformed(new ActionEvent(this,
                        ActionEvent.ACTION_PERFORMED,
                        primary.getActionModel().getActionCommand(),
                        EventQueue.getMostRecentEventTime(), 0));
                SwingUtilities.invokeLater(() -> {
                    // Find our command at secondary level, scroll to it if necessary
                    // and highlight it
                    AbstractCommandButton secondLevelButton = getSecondaryForCommand(command);
                    Rectangle selectionButtonBounds = secondLevelButton.getBounds();
                    this.panelScrollerLevel2.scrollToIfNecessary(selectionButtonBounds.y,
                            selectionButtonBounds.height);
                    secondLevelButton.getActionModel().setRollover(true);
                    secondLevelButton.getActionModel().setArmed(true);
                });
            };
        }

        // The command is in a popup chain shown off of a secondary-level command in the app menu.
        return () -> {
            // Highlight the primary button for the first "leg" of the path
            primary.getPopupModel().setRollover(true);
            primary.getPopupModel().setArmed(true);
            // Fire the rollover action so that the secondary menu content is
            // populated
            SubstanceCommandMenuButtonUI buttonUI =
                    (SubstanceCommandMenuButtonUI) primary.getUI();
            buttonUI.fireRolloverActionPerformed(new ActionEvent(this,
                    ActionEvent.ACTION_PERFORMED,
                    primary.getActionModel().getActionCommand(),
                    EventQueue.getMostRecentEventTime(), 0));

            SwingUtilities.invokeLater(() -> {
                // Find our command at secondary level, scroll to it if necessary
                // and highlight it
                JCommandButton secondLevelButton =
                        getSecondaryForCommand(pathToCommand.get(1));
                Rectangle selectionButtonBounds = secondLevelButton.getBounds();
                this.panelScrollerLevel2.scrollToIfNecessary(selectionButtonBounds.y,
                        selectionButtonBounds.height);
                secondLevelButton.getPopupModel().setRollover(true);
                secondLevelButton.getPopupModel().setArmed(true);

                SubstanceCommandMenuButtonUI secondLevelButtonUI =
                        (SubstanceCommandMenuButtonUI) secondLevelButton.getUI();
                secondLevelButtonUI.processPopupAction();

                int levelsToGo = pathLength - 2;
                for (int i = 0; i <= levelsToGo; i++) {
                    final int currLevel = 2 + i;
                    SwingUtilities.invokeLater(() -> {
                        if (currLevel == pathLength) {
                            AbstractCommandButton lastLevelButton =
                                    getMenuButtonForCommand(command);
                            // Last level!
                            lastLevelButton.getActionModel().setRollover(true);
                            lastLevelButton.getActionModel().setArmed(true);
                        } else {
                            JCommandMenuButton currLevelButton =
                                    getMenuButtonForCommand(pathToCommand.get(currLevel));
                            // we need to go deeper
                            currLevelButton.getPopupModel().setRollover(true);
                            currLevelButton.getPopupModel().setArmed(true);

                            SubstanceCommandMenuButtonUI currLevelButtonUI =
                                    (SubstanceCommandMenuButtonUI) currLevelButton.getUI();
                            currLevelButtonUI.processPopupAction();
                        }
                    });
                }
            });
        };
    }

}
