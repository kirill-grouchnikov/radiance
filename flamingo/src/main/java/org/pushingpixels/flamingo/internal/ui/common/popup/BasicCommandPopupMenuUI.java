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
package org.pushingpixels.flamingo.internal.ui.common.popup;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.CommandPanelPresentationModel;
import org.pushingpixels.flamingo.api.common.popup.*;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager.PopupEvent;
import org.pushingpixels.flamingo.internal.ui.common.*;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;

public abstract class BasicCommandPopupMenuUI extends BasicPopupPanelUI {
    /**
     * The associated popup menu
     */
    protected JCommandPopupMenu popupMenu;

    private ChangeListener popupMenuChangeListener;

    private PopupPanelManager.PopupListener popupListener;

    private ScrollableCommandButtonPanel commandButtonPanel;

    private JScrollablePanel<JPanel> menuItemsPanel;

    public static final String FORCE_ICON = "flamingo.internal.commandPopupMenu.forceIcon";

    private static final CommandButtonDisplayState POPUP_MENU = new CommandButtonDisplayState(
            "Popup menu", 16) {
        @Override
        public CommandButtonLayoutManager createLayoutManager(AbstractCommandButton commandButton) {
            return new CommandButtonLayoutManagerMedium() {
                @Override
                protected float getIconTextGapFactor() {
                    return 2.0f;
                }
            };
        }
    };

    /**
     * Popup panel that hosts groups of icons.
     *
     * @author Kirill Grouchnikov
     */
    protected static class ScrollableCommandButtonPanel extends JComponent {
        /**
         * Maximum dimension of <code>this</code> popup gallery.
         */
        protected Dimension maxDimension;

        /**
         * The internal panel that hosts the icon command buttons. Is hosted in
         * the {@link #scroll}.
         */
        protected JCommandButtonPanel buttonPanel;

        /**
         * The maximum number of visible button rows.
         */
        protected int maxVisibleButtonRows;

        /**
         * Scroll panel that hosts {@link #buttonPanel}.
         */
        protected JScrollPane scroll;

        /**
         * Creates new a icon popup panel.
         *
         * @param iconPanel            The internal panel that hosts icon command buttons.
         * @param maxButtonColumns     The maximum number of button columns.
         * @param maxVisibleButtonRows The maximum number of visible button rows.
         */
        public ScrollableCommandButtonPanel(JCommandButtonPanel iconPanel, int maxButtonColumns,
                int maxVisibleButtonRows) {
            this.buttonPanel = iconPanel;
            this.buttonPanel.getPresentationModel().setMaxColumns(maxButtonColumns);
            this.maxVisibleButtonRows = maxVisibleButtonRows;

            int maxButtonWidth = 0;
            int maxButtonHeight = 0;
            int groupCount = iconPanel.getGroupCount();
            for (int i = 0; i < groupCount; i++) {
                for (AbstractCommandButton button : iconPanel.getGroupButtons(i)) {
                    maxButtonWidth = Math.max(maxButtonWidth, button.getPreferredSize().width);
                    maxButtonHeight = Math.max(maxButtonHeight, button.getPreferredSize().height);
                }
            }

            updateMaxDimension();

            this.scroll = new JScrollPane(this.buttonPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                    JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            this.scroll.setBorder(new EmptyBorder(0, 0, 0, 0));
            this.buttonPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
            this.scroll.setOpaque(false);
            this.scroll.getViewport().setOpaque(false);
            this.setLayout(new IconPopupLayout());

            this.add(this.scroll);

            this.setBorder(new Border() {
                @Override
                public Insets getBorderInsets(Component c) {
                    return new Insets(0, 0, 1, 0);
                }

                @Override
                public boolean isBorderOpaque() {
                    return true;
                }

                @Override
                public void paintBorder(Component c, Graphics g, int x, int y, int width,
                        int height) {
                    g.setColor(SubstanceColorSchemeUtilities.getColorScheme(c,
                            SubstanceSlices.ColorSchemeAssociationKind.FILL,
                            ComponentState.ENABLED).getDarkColor());
                    g.drawLine(x, y + height - 1, x + width, y + height - 1);
                }
            });
        }

        /**
         * Updates the max dimension of this panel. This method is for internal
         * use only.
         */
        public void updateMaxDimension() {
            if (this.buttonPanel == null)
                return;
            this.buttonPanel.setPreferredSize(null);
            Dimension prefIconPanelDim = this.buttonPanel.getPreferredSize();
            // fix for issue 13 - respect the gaps and insets
            BasicCommandButtonPanelUI panelUI = (BasicCommandButtonPanelUI) buttonPanel.getUI();
            int titlePanelCount =
                    buttonPanel.getPresentationModel().isToShowGroupLabels() ? 1 : 0;
            this.maxDimension = new Dimension(prefIconPanelDim.width,
                    panelUI.getPreferredHeight(this.maxVisibleButtonRows, titlePanelCount));
            this.setPreferredSize(null);
        }

        /**
         * Layout manager for <code>this</code> popup gallery.
         *
         * @author Kirill Grouchnikov
         */
        protected class IconPopupLayout implements LayoutManager {
            @Override
            public void addLayoutComponent(String name, Component comp) {
            }

            @Override
            public void removeLayoutComponent(Component comp) {
            }

            @Override
            public void layoutContainer(Container parent) {
                Insets insets = parent.getInsets();
                int left = insets.left;
                int right = insets.right;
                int top = insets.top;
                int bottom = insets.bottom;
                scroll.setBounds(left, top, parent.getWidth() - left - right,
                        parent.getHeight() - top - bottom);
            }

            @Override
            public Dimension minimumLayoutSize(Container parent) {
                return this.preferredLayoutSize(parent);
            }

            @Override
            public Dimension preferredLayoutSize(Container parent) {
                Insets insets = parent.getInsets();
                int left = insets.left;
                int right = insets.right;
                int top = insets.top;
                int bottom = insets.bottom;
                Dimension controlPanelDim = buttonPanel.getPreferredSize();
                if (controlPanelDim == null)
                    controlPanelDim = new Dimension(0, 0);
                int w = Math.min(controlPanelDim.width, maxDimension.width) + left + right;
                int h = Math.min(controlPanelDim.height, maxDimension.height) + top + bottom;
                if (h == (maxDimension.height + top + bottom)) {
                    int scrollBarWidth = SubstanceSizeUtils.getScrollBarWidth(
                            SubstanceSizeUtils.getControlFontSize());
                    w += scrollBarWidth;
                }
                return new Dimension(w, h);
            }
        }
    }

    @Override
    public void installUI(JComponent c) {
        this.popupMenu = (JCommandPopupMenu) c;
        super.installUI(this.popupMenu);

        this.popupMenu.setLayout(this.createLayoutManager());
    }

    @Override
    protected void installComponents() {
        super.installComponents();

        syncComponents();
    }

    protected void syncComponents() {
        if (this.popupMenu.hasCommandButtonPanel()) {
            this.commandButtonPanel = createScrollableButtonPanel();
            this.popupMenu.add(this.commandButtonPanel);
        }

        final JPanel menuPanel = this.createMenuPanel();
        menuPanel.setLayout(new LayoutManager() {
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

        this.popupMenu.putClientProperty(BasicCommandPopupMenuUI.FORCE_ICON, null);
        java.util.List<Component> menuComponents = this.popupMenu.getMenuComponents();
        if (menuComponents != null) {
            for (Component menuComponent : menuComponents) {
                menuPanel.add(menuComponent);
            }

            boolean atLeastOneButtonHasIcon = false;
            for (Component menuComponent : menuComponents) {
                if (menuComponent instanceof JCommandMenuButton) {
                    JCommandMenuButton menuButton = (JCommandMenuButton) menuComponent;
                    if (menuButton.getIcon() != null) {
                        atLeastOneButtonHasIcon = true;
                    }
                }
                if (menuComponent instanceof JCommandToggleMenuButton) {
                    atLeastOneButtonHasIcon = true;
                }
            }

            this.popupMenu.putClientProperty(BasicCommandPopupMenuUI.FORCE_ICON,
                    atLeastOneButtonHasIcon ? Boolean.TRUE : null);
            for (Component menuComponent : menuComponents) {
                if (menuComponent instanceof JCommandMenuButton) {
                    JCommandMenuButton menuButton = (JCommandMenuButton) menuComponent;
                    menuButton.putClientProperty(BasicCommandPopupMenuUI.FORCE_ICON,
                            atLeastOneButtonHasIcon ? Boolean.TRUE : null);
                    menuButton.setDisplayState(POPUP_MENU);
                }
                if (menuComponent instanceof JCommandToggleMenuButton) {
                    JCommandToggleMenuButton menuButton = (JCommandToggleMenuButton) menuComponent;
                    menuButton.putClientProperty(BasicCommandPopupMenuUI.FORCE_ICON, Boolean.TRUE);
                    menuButton.setDisplayState(POPUP_MENU);
                }
            }
        }

        this.menuItemsPanel = new JScrollablePanel<>(menuPanel,
                JScrollablePanel.ScrollType.VERTICALLY);
        final LayoutManager scrollableLm = this.menuItemsPanel.getLayout();
        this.menuItemsPanel.setLayout(new LayoutManager() {
            @Override
            public void addLayoutComponent(String name, Component comp) {
                scrollableLm.addLayoutComponent(name, comp);
            }

            @Override
            public void removeLayoutComponent(Component comp) {
                scrollableLm.removeLayoutComponent(comp);
            }

            @Override
            public Dimension preferredLayoutSize(Container parent) {
                Dimension result = menuPanel.getPreferredSize();
                int maxMenuButtonCount =
                        popupMenu.getPresentationModel().getMaxVisibleMenuCommands();
                if ((maxMenuButtonCount < 0)
                        || (maxMenuButtonCount >= menuPanel.getComponentCount())) {
                    return result;
                }
                // the assumption is that all menu buttons have the
                // same height.
                int singleHeight = menuPanel.getComponent(0).getPreferredSize().height;
                int width = 0;
                for (int i = 0; i < menuPanel.getComponentCount(); i++) {
                    width = Math.max(width, menuPanel.getComponent(i).getPreferredSize().width);
                }
                Insets ins = parent.getInsets();
                // add two for scroller buttons
                return new Dimension(width + ins.left + ins.right,
                        singleHeight * (maxMenuButtonCount + 2) + ins.top + ins.bottom);
            }

            @Override
            public Dimension minimumLayoutSize(Container parent) {
                return this.preferredLayoutSize(parent);
            }

            @Override
            public void layoutContainer(Container parent) {
                scrollableLm.layoutContainer(parent);
            }
        });
        this.popupMenu.add(this.menuItemsPanel);
    }

    @SuppressWarnings("deprecation")
    private ScrollableCommandButtonPanel createScrollableButtonPanel() {
        CommandPanelPresentationModel panelPresentationModel =
                this.popupMenu.getPresentationModel().getPanelPresentationModel();
        return new ScrollableCommandButtonPanel(this.popupMenu.getMainButtonPanel(),
                panelPresentationModel.getMaxColumns(), panelPresentationModel.getMaxRows());
    }

    @Override
    protected void uninstallComponents() {
        this.popupMenu.removeAll();
        super.uninstallComponents();
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        this.popupMenuChangeListener = (ChangeEvent e) -> {
            popupMenu.removeAll();
            syncComponents();
        };
        this.popupMenu.addChangeListener(this.popupMenuChangeListener);

        this.popupListener = new PopupPanelManager.PopupListener() {
            @Override
            public void popupShown(PopupEvent event) {
            }

            @SuppressWarnings("deprecation")
            @Override
            public void popupHidden(PopupEvent event) {
                if (event.getSource() instanceof JColorSelectorPopupMenu) {
                    ((JColorSelectorPopupMenu) event.getSource())
                            .getColorSelectorPopupMenuContentModel().getColorSelectorCallback()
                            .onColorRollover(null);
                }
            }
        };
        PopupPanelManager.defaultManager().addPopupListener(this.popupListener);
    }

    @Override
    protected void uninstallListeners() {
        this.popupMenu.removeChangeListener(this.popupMenuChangeListener);
        this.popupMenuChangeListener = null;

        PopupPanelManager.defaultManager().removePopupListener(this.popupListener);
        this.popupListener = null;

        super.uninstallListeners();
    }

    protected abstract JPanel createMenuPanel();

    protected LayoutManager createLayoutManager() {
        return new PopupMenuLayoutManager();
    }

    protected class PopupMenuLayoutManager implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return null;
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            int height = 0;
            int width = 0;

            if (commandButtonPanel != null) {
                width = commandButtonPanel.getPreferredSize().width;
                height = commandButtonPanel.getPreferredSize().height;
            }
            Dimension menuItemsPref =
                    (popupMenu.getPresentationModel().getMaxVisibleMenuCommands() > 0)
                            ? menuItemsPanel.getPreferredSize()
                            : menuItemsPanel.getView().getPreferredSize();
            width = Math.max(menuItemsPref.width, width);
            height += menuItemsPref.height;

            Insets ins = parent.getInsets();
            return new Dimension(width + ins.left + ins.right, height + ins.top + ins.bottom);
        }

        @Override
        public void layoutContainer(Container parent) {
            Insets ins = parent.getInsets();

            int bottomY = parent.getHeight() - ins.bottom;
            Dimension menuItemsPref =
                    (popupMenu.getPresentationModel().getMaxVisibleMenuCommands() > 0)
                            ? menuItemsPanel.getPreferredSize()
                            : menuItemsPanel.getView().getPreferredSize();
            menuItemsPanel.setBounds(ins.left, bottomY - menuItemsPref.height,
                    parent.getWidth() - ins.left - ins.right, menuItemsPref.height);
            menuItemsPanel.doLayout();
            bottomY -= menuItemsPref.height;

            if (commandButtonPanel != null) {
                commandButtonPanel.setBounds(ins.left, ins.top,
                        parent.getWidth() - ins.left - ins.right, bottomY - ins.top);
                commandButtonPanel.invalidate();
                commandButtonPanel.validate();
                commandButtonPanel.doLayout();
            }
        }
    }

    protected abstract static class MenuPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            JCommandPopupMenu menu = (JCommandPopupMenu) SwingUtilities
                    .getAncestorOfClass(JCommandPopupMenu.class, this);
            if (Boolean.TRUE.equals(menu.getClientProperty(FORCE_ICON))) {
                this.paintIconGutterBackground(g);
            }
        }

        protected int getSeparatorX() {
            JCommandPopupMenu menu = (JCommandPopupMenu) SwingUtilities
                    .getAncestorOfClass(JCommandPopupMenu.class, this);
            if (!Boolean.TRUE.equals(menu.getClientProperty(FORCE_ICON))) {
                return -1;
            }
            java.util.List<Component> menuComponents = menu.getMenuComponents();
            if (menuComponents != null) {
                for (Component menuComponent : menuComponents) {
                    if (menuComponent instanceof JCommandMenuButton
                            || menuComponent instanceof JCommandToggleMenuButton) {
                        AbstractCommandButton button = (AbstractCommandButton) menuComponent;
                        if (!Boolean.TRUE.equals(button.getClientProperty(FORCE_ICON))) {
                            continue;
                        }
                        boolean ltr = button.getComponentOrientation().isLeftToRight();
                        CommandButtonLayoutManager.CommandButtonLayoutInfo layoutInfo = button
                                .getUI().getLayoutInfo();
                        if (ltr) {
                            int iconRight = layoutInfo.iconRect.x + layoutInfo.iconRect.width;
                            int textLeft = button.getWidth();
                            for (CommandButtonLayoutManager.TextLayoutInfo tli :
                                    layoutInfo.textLayoutInfoList) {
                                textLeft = Math.min(textLeft, tli.textRect.x);
                            }
                            return (iconRight + textLeft) / 2;
                        } else {
                            int iconLeft = layoutInfo.iconRect.x;
                            int textRight = 0;
                            for (CommandButtonLayoutManager.TextLayoutInfo tli :
                                    layoutInfo.textLayoutInfoList) {
                                textRight = Math.max(textRight,
                                        tli.textRect.x + tli.textRect.width);
                            }
                            return (iconLeft + textRight) / 2;
                        }
                    }
                }
            }
            throw new IllegalStateException("Menu marked to show icons but no menu buttons in it");
        }

        protected abstract void paintIconGutterBackground(Graphics g);
    }
}