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
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonPopupOrientationKind;
import org.pushingpixels.flamingo.api.common.popup.JPopupPanel;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenu;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuPrimaryCommand;
import org.pushingpixels.flamingo.api.ribbon.RibbonApplicationMenuPrimaryCommand.PrimaryRolloverCallback;
import org.pushingpixels.flamingo.internal.ui.common.popup.BasicPopupPanelUI;
import org.pushingpixels.flamingo.internal.utils.FlamingoUtilities;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

/**
 * Basic UI for ribbon application menu button {@link JRibbonApplicationMenuButton}.
 * 
 * @author Kirill Grouchnikov
 */
public abstract class BasicRibbonApplicationMenuPopupPanelUI extends BasicPopupPanelUI {
    protected JPanel panelLevel1;

    protected JScrollablePanel<JPanel> panelScrollerLevel2;

    protected JPanel panelLevel2;

    protected JPanel footerPanel;

    protected static final CommandButtonDisplayState MENU_TILE_LEVEL_1 = new CommandButtonDisplayState(
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

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicButtonUI#installUI(javax.swing.JComponent)
     */
    @Override
    public void installUI(JComponent c) {
        this.applicationMenuPopupPanel = (JRibbonApplicationMenuPopupPanel) c;
        this.popupPanel = (JPopupPanel) c;

        this.applicationMenuPopupPanel.setLayout(new BorderLayout());

        installDefaults();
        installComponents();
        installListeners();
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.ComponentUI#uninstallUI(javax.swing.JComponent)
     */
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

        this.mainPanel = createMainPanel();

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

        final RibbonApplicationMenu ribbonAppMenu = this.applicationMenuPopupPanel
                .getRibbonAppMenu();

        if (ribbonAppMenu != null) {
            List<List<RibbonApplicationMenuPrimaryCommand>> primaryEntries = ribbonAppMenu
                    .getPrimaryCommands();
            int primaryGroupCount = primaryEntries.size();
            for (int i = 0; i < primaryGroupCount; i++) {
                for (final RibbonApplicationMenuPrimaryCommand menuEntry : primaryEntries.get(i)) {
                    final JCommandMenuButton commandButton = (JCommandMenuButton) menuEntry
                            .buildMenuButton();

                    if (menuEntry.getSecondaryGroupCount() == 0) {
                        // if there are no secondary menu items, register the
                        // application rollover callback to populate the
                        // second level panel
                        commandButton.addRolloverActionListener((ActionEvent e) -> {
                            // System.out.println("Rollover action");
                            PrimaryRolloverCallback callback = menuEntry.getRolloverCallback();
                            if (callback != null) {
                                callback.menuEntryActivated(panelLevel2);
                            } else {
                                // default callback?
                                PrimaryRolloverCallback defaultCallback = ribbonAppMenu
                                        .getDefaultCallback();
                                if (defaultCallback != null) {
                                    defaultCallback.menuEntryActivated(panelLevel2);
                                } else {
                                    panelLevel2.removeAll();
                                    panelLevel2.revalidate();
                                    panelLevel2.repaint();
                                }
                            }
                            panelScrollerLevel2.applyComponentOrientation(
                                    applicationMenuPopupPanel.getComponentOrientation());
                        });
                    } else {
                        // register a core callback to populate the second level
                        // panel with secondary menu items
                        final PrimaryRolloverCallback coreCallback = (JPanel targetPanel) -> {
                            targetPanel.removeAll();
                            targetPanel.setLayout(new BorderLayout());
                            JRibbonApplicationMenuPopupPanelSecondary secondary = new JRibbonApplicationMenuPopupPanelSecondary(
                                    menuEntry) {
                                @Override
                                public void removeNotify() {
                                    super.removeNotify();
                                    commandButton.getPopupModel().setPopupShowing(false);
                                }
                            };
                            secondary.applyComponentOrientation(
                                    applicationMenuPopupPanel.getComponentOrientation());
                            targetPanel.add(secondary, BorderLayout.CENTER);
                        };
                        commandButton.addRolloverActionListener((ActionEvent e) -> {
                            coreCallback.menuEntryActivated(panelLevel2);
                            // emulate showing the popup so the
                            // button remains "selected"
                            commandButton.getPopupModel().setPopupShowing(true);
                        });
                    }
                    commandButton.setDisplayState(MENU_TILE_LEVEL_1);
                    commandButton.setHorizontalAlignment(SwingUtilities.LEADING);
                    commandButton
                            .setPopupOrientationKind(CommandButtonPopupOrientationKind.SIDEWARD);
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
        this.panelScrollerLevel2 = new JScrollablePanel<JPanel>(this.panelLevel2,
                JScrollablePanel.ScrollType.VERTICALLY);
        this.panelLevel2.setBorder(new Border() {

            @Override
            public Insets getBorderInsets(Component c) {
                boolean ltr = c.getComponentOrientation().isLeftToRight();
                return new Insets(0, ltr ? 1 : 0, 0, ltr ? 0 : 1);
            }

            @Override
            public boolean isBorderOpaque() {
                return true;
            }

            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                g.setColor(FlamingoUtilities.getColor(Color.gray, "Label.disabledForeground"));
                boolean ltr = c.getComponentOrientation().isLeftToRight();
                int xToPaint = ltr ? x : x + width - 1;
                g.drawLine(xToPaint, y, xToPaint, y + height);
            }
        });
        this.panelScrollerLevel2.setPreferredSize(new Dimension(30 * FlamingoUtilities
                .getFont(this.panelLevel1, "Ribbon.font", "Button.font", "Panel.font").getSize()
                - 30, 10));

        mainPanel.add(this.panelScrollerLevel2, BorderLayout.CENTER);

        if (ribbonAppMenu != null) {
            if (ribbonAppMenu.getDefaultCallback() != null) {
                ribbonAppMenu.getDefaultCallback().menuEntryActivated(this.panelLevel2);
            }
        }

        this.applicationMenuPopupPanel.add(mainPanel, BorderLayout.CENTER);

        this.footerPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING)) {
            @Override
            protected void paintComponent(Graphics g) {
                SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(null);
                SubstanceColorScheme baseFillScheme = SubstanceColorSchemeUtilities.getColorScheme(null,
                        ComponentState.ENABLED);
                fillPainter.paintContourBackground(g, null,
                        footerPanel.getWidth(), footerPanel.getHeight(),
                        new Rectangle(0, 0, footerPanel.getWidth(), footerPanel.getHeight()), false,
                        baseFillScheme, true);
            }
        };
        if (ribbonAppMenu != null) {
            for (FlamingoCommand footerCommand : ribbonAppMenu.getFooterCommands()) {
                JCommandButton commandFooterButton = (JCommandButton) footerCommand.buildButton();
                commandFooterButton.setDisplayState(CommandButtonDisplayState.MEDIUM);
                commandFooterButton.setFlat(false);
                this.footerPanel.add(commandFooterButton);
            }
        }

        this.applicationMenuPopupPanel.add(this.footerPanel, BorderLayout.SOUTH);
    }

    protected JPanel createMainPanel() {
        JPanel result = new JPanel(new BorderLayout());
        result.setBorder(new Border() {
            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(2, 2, 2, 2);
            }

            @Override
            public boolean isBorderOpaque() {
                return true;
            }

            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                g.setColor(FlamingoUtilities.getColor(Color.gray, "Label.disabledForeground")
                        .brighter().brighter());
                g.drawRect(x, y, width - 1, height - 1);
                g.setColor(FlamingoUtilities.getColor(Color.gray, "Label.disabledForeground"));
                g.drawRect(x + 1, y + 1, width - 3, height - 3);
            }
        });
        return result;
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
}
