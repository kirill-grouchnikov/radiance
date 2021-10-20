/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.ui.common.popup;

import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.JCommandButtonPanel;
import org.pushingpixels.radiance.component.api.common.JScrollablePanel;
import org.pushingpixels.radiance.component.api.common.model.CommandPanelPresentationModel;
import org.pushingpixels.radiance.component.api.common.popup.AbstractPopupMenu;
import org.pushingpixels.radiance.component.api.common.popup.JColorSelectorPopupMenu;
import org.pushingpixels.radiance.component.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.radiance.component.api.common.popup.PopupPanelManager;
import org.pushingpixels.radiance.component.api.common.popup.PopupPanelManager.PopupEvent;
import org.pushingpixels.radiance.component.internal.ui.common.BasicCommandButtonPanelUI;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeListener;
import java.awt.*;

public abstract class BasicCommandPopupMenuUI extends BasicPopupPanelUI {
    /**
     * The associated popup menu
     */
    protected AbstractPopupMenu popupMenu;

    private ChangeListener popupMenuChangeListener;

    private PopupPanelManager.PopupListener popupListener;

    private ScrollableCommandButtonPanel commandButtonPanel;

    protected JScrollablePanel<JPanel> menuItemsPanel;

    public static final String FORCE_ICON = "radiance.components.internal.commandPopupMenu.forceIcon";

    /**
     * Popup panel that hosts groups of icons.
     *
     * @author Kirill Grouchnikov
     */
    protected static class ScrollableCommandButtonPanel extends JComponent {
        /**
         * Maximum dimension of <code>this</code> button panel.
         */
        private Dimension maxDimension;

        /**
         * The internal panel that hosts the icon command buttons. Is hosted in
         * the {@link #scroll}.
         */
        private JCommandButtonPanel buttonPanel;

        /**
         * The maximum number of visible button rows.
         */
        private int maxVisibleButtonRows;

        /**
         * Scroll panel that hosts {@link #buttonPanel}.
         */
        private JScrollPane scroll;

        /**
         * Creates new a icon popup panel.
         *
         * @param iconPanel            The internal panel that hosts icon command buttons.
         * @param maxButtonColumns     The maximum number of button columns.
         * @param maxVisibleButtonRows The maximum number of visible button rows.
         */
        private ScrollableCommandButtonPanel(JCommandButtonPanel iconPanel, int maxButtonColumns,
                                            int maxVisibleButtonRows) {
            this.buttonPanel = iconPanel;
            this.buttonPanel.getProjection().getPresentationModel().setMaxColumns(maxButtonColumns);
            this.maxVisibleButtonRows = maxVisibleButtonRows;

            int maxButtonWidth = 0;
            int maxButtonHeight = 0;
            int groupCount = iconPanel.getGroupCount();
            for (int i = 0; i < groupCount; i++) {
                for (JCommandButton button : iconPanel.getGroupButtons(i)) {
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
                    g.setColor(RadianceColorSchemeUtilities.getColorScheme(c,
                            RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
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
            int titlePanelCount = buttonPanel.getProjection().getPresentationModel()
                    .isToShowGroupLabels() ? 1 : 0;
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
                    int scrollBarWidth = RadianceSizeUtils.getScrollBarWidth(
                            RadianceSizeUtils.getControlFontSize());
                    w += scrollBarWidth;
                }
                return new Dimension(w, h);
            }
        }
    }

    @Override
    public void installUI(JComponent c) {
        this.popupMenu = (AbstractPopupMenu) c;
        super.installUI(this.popupMenu);

        this.popupMenu.setLayout(this.createLayoutManager());
    }

    @Override
    protected void installComponents() {
        super.installComponents();

        syncComponents();
    }

    protected boolean hasLeadingButtonPanel() {
        return ((JCommandPopupMenu) this.popupMenu).hasCommandButtonPanel();
    }

    protected int getMaxVisibleMenuCommands() {
        return ((JCommandPopupMenu) popupMenu).getProjection().getPresentationModel()
                .getMaxVisibleMenuCommands();
    }

    protected void syncComponents() {
        if (this.hasLeadingButtonPanel()) {
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
                if (menuComponent instanceof JCommandButton) {
                    JCommandButton menuButton = (JCommandButton) menuComponent;
                    if (menuButton.getIcon() != null) {
                        atLeastOneButtonHasIcon = true;
                    }
                    if (menuButton.getProjection().getContentModel().isToggle()) {
                        atLeastOneButtonHasIcon = true;
                    }
                }
            }

            this.popupMenu.putClientProperty(BasicCommandPopupMenuUI.FORCE_ICON,
                    atLeastOneButtonHasIcon ? Boolean.TRUE : null);
            for (Component menuComponent : menuComponents) {
                if (menuComponent instanceof JCommandButton) {
                    JCommandButton menuButton = (JCommandButton) menuComponent;
                    menuButton.putClientProperty(BasicCommandPopupMenuUI.FORCE_ICON,
                            atLeastOneButtonHasIcon ? Boolean.TRUE : null);
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
                int maxMenuButtonCount = getMaxVisibleMenuCommands();
                if ((maxMenuButtonCount < 0)
                        || (maxMenuButtonCount >= menuPanel.getComponentCount())) {
                    return result;
                }
                // the assumption is that all menu buttons have the same height.
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

    protected ScrollableCommandButtonPanel createScrollableButtonPanel() {
        CommandPanelPresentationModel panelPresentationModel =
                ((JCommandPopupMenu) this.popupMenu).getProjection().getPresentationModel()
                        .getPanelPresentationModel();
        return new ScrollableCommandButtonPanel(
                ((JCommandPopupMenu) this.popupMenu).getMainButtonPanel(),
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

        this.popupMenuChangeListener = changeEvent -> {
            popupMenu.removeAll();
            syncComponents();
        };
        this.popupMenu.addChangeListener(this.popupMenuChangeListener);

        this.popupListener = new PopupPanelManager.PopupListener() {
            @Override
            public void popupShown(PopupEvent event) {
            }

            @Override
            public void popupHidden(PopupEvent event) {
                if (event.getSource() instanceof JColorSelectorPopupMenu) {
                    ((JColorSelectorPopupMenu) event.getSource())
                            .getProjection().getContentModel().getColorPreviewListener()
                            .onColorPreviewCanceled();
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
            Dimension menuItemsPref = (getMaxVisibleMenuCommands() > 0)
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
            Dimension menuItemsPref = (getMaxVisibleMenuCommands() > 0)
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
            AbstractPopupMenu menu = (AbstractPopupMenu) SwingUtilities
                    .getAncestorOfClass(AbstractPopupMenu.class, this);
            if (Boolean.TRUE.equals(menu.getClientProperty(FORCE_ICON))) {
                this.paintIconGutterBackground(g);
            }
        }

        protected int getSeparatorX() {
            AbstractPopupMenu menu = (AbstractPopupMenu) SwingUtilities
                    .getAncestorOfClass(AbstractPopupMenu.class, this);
            if (!Boolean.TRUE.equals(menu.getClientProperty(FORCE_ICON))) {
                return -1;
            }
            java.util.List<Component> menuComponents = menu.getMenuComponents();
            if (menuComponents != null) {
                for (Component menuComponent : menuComponents) {
                    if (menuComponent instanceof JCommandButton) {
                        JCommandButton button = (JCommandButton) menuComponent;
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

    private void focusAndScrollToMenuItem(Component popupMenuComponent) {
        popupMenuComponent.requestFocus();
        this.menuItemsPanel.scrollToIfNecessary(popupMenuComponent.getY(),
                popupMenuComponent.getHeight());
    }

    @Override
    public void focusFirst() {
        if (this.commandButtonPanel != null) {
            if (this.commandButtonPanel.buttonPanel.getUI().focusFirst()) {
                return;
            }
        }

        java.util.List<Component> popupMenuComponents = this.popupMenu.getMenuComponents();
        if (!popupMenuComponents.isEmpty()) {
            focusAndScrollToMenuItem(popupMenuComponents.get(0));
        }
    }

    @Override
    public void focusLast() {
        java.util.List<Component> popupMenuComponents = this.popupMenu.getMenuComponents();
        if (!popupMenuComponents.isEmpty()) {
            focusAndScrollToMenuItem(popupMenuComponents.get(popupMenuComponents.size() - 1));
        }
    }

    private int getFocusedIndex(java.util.List<Component> components) {
        if (components != null) {
            for (int i = 0; i < components.size(); i++) {
                if (components.get(i).hasFocus()) {
                    return i;
                }
            }
        }
        return -1;
    }

    private Component findFirstFocusableAfter(java.util.List<Component> components, int index) {
        if (components == null) {
            return null;
        }
        if (index == -1) {
            return null;
        }
        for (int i = index + 1; i < components.size(); i++) {
            if (components.get(i).isFocusable()) {
                return components.get(i);
            }
        }
        return null;
    }

    private Component findLastFocusableBefore(java.util.List<Component> components, int index) {
        if (components == null) {
            return null;
        }
        if (index == -1) {
            return null;
        }
        for (int i = index - 1; i >= 0; i--) {
            if (components.get(i).isFocusable()) {
                return components.get(i);
            }
        }
        return null;
    }

    @Override
    public void focusDown() {
        if (this.commandButtonPanel != null) {
            if (this.commandButtonPanel.buttonPanel.getUI().focusDown()) {
                return;
            }
        }

        java.util.List<Component> popupMenuComponents = this.popupMenu.getMenuComponents();
        int focusedIndex = getFocusedIndex(popupMenuComponents);
        if (focusedIndex < 0) {
            if (this.commandButtonPanel != null) {
                if (!this.commandButtonPanel.buttonPanel.getUI().hasFocus() &&
                        this.commandButtonPanel.buttonPanel.getUI().focusFirst()) {
                    return;
                }
            }

            if (!popupMenuComponents.isEmpty()) {
                focusAndScrollToMenuItem(popupMenuComponents.get(0));
            }
        } else {
            Component nextFocus = findFirstFocusableAfter(popupMenuComponents, focusedIndex);
            if (nextFocus != null) {
                focusAndScrollToMenuItem(nextFocus);
            } else {
                if (this.commandButtonPanel != null) {
                    this.commandButtonPanel.buttonPanel.getUI().focusFirst();
                }
            }
        }
    }

    @Override
    public void focusUp() {
        if (this.commandButtonPanel != null) {
            if (this.commandButtonPanel.buttonPanel.getUI().focusUp()) {
                return;
            }
        }
        java.util.List<Component> popupMenuComponents = this.popupMenu.getMenuComponents();
        int focusedIndex = getFocusedIndex(popupMenuComponents);
        if (focusedIndex < 0) {
            this.focusLast();
        } else {
            Component prevFocus = findLastFocusableBefore(popupMenuComponents, focusedIndex);
            if (prevFocus != null) {
                focusAndScrollToMenuItem(prevFocus);
            } else {
                if (this.commandButtonPanel != null) {
                    this.commandButtonPanel.buttonPanel.getUI().focusLast();
                }
            }
        }
    }

    private boolean maybeMoveFocusToAnotherPopup() {
        // Who has the focus now?
        for (Component popupMenuComponent : this.popupMenu.getMenuComponents()) {
            if (popupMenuComponent.hasFocus()) {
                java.util.List<PopupPanelManager.PopupInfo> popups =
                        PopupPanelManager.defaultManager().getShownPath();
                for (PopupPanelManager.PopupInfo popup : popups) {
                    if (popup.getPopupOriginator() == popupMenuComponent) {
                        // We have a popup originating in the current focus owner.
                        // Transfer the focus into the popup.
                        popup.getPopupPanel().getUI().focusFirst();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void focusRight() {
        if (this.commandButtonPanel != null) {
            this.commandButtonPanel.buttonPanel.getUI().focusRight();
        } else {
            if (this.popupMenu.getComponentOrientation().isLeftToRight()) {
                maybeMoveFocusToAnotherPopup();
            }
        }
    }

    @Override
    public void focusLeft() {
        if (this.commandButtonPanel != null) {
            this.commandButtonPanel.buttonPanel.getUI().focusLeft();
        } else {
            if (!this.popupMenu.getComponentOrientation().isLeftToRight()) {
                maybeMoveFocusToAnotherPopup();
            }
        }
    }
}
