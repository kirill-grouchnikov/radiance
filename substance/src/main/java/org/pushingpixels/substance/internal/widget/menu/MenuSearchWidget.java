/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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
package org.pushingpixels.substance.internal.widget.menu;

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.SubstanceSlices.SubstanceWidgetType;
import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.SubstanceTitlePane;
import org.pushingpixels.substance.internal.utils.SubstanceWidgetManager;
import org.pushingpixels.substance.internal.utils.icon.TransitionAwareIcon;

/**
 * Adds menu search panel to menu bars.
 * 
 * @author Kirill Grouchnikov
 */
public class MenuSearchWidget extends SubstanceWidget<JMenuBar> {
    /**
     * Boolean flag to prevent infinite loop. Maybe need to use something more elegant.
     */
    private boolean inEvent = false;

    /**
     * Listens on changes to the component orientation.
     */
    protected PropertyChangeListener propertyListener;

    /**
     * The associated search panel.
     */
    private SearchPanel searchPanel;

    /**
     * Panel for searching the menus.
     * 
     * @author Kirill Grouchnikov
     */
    private class SearchPanel extends JPanel {
        /**
         * Toggle button for showing / hiding search controls.
         */
        private JToggleButton searchButton;

        /**
         * Text field for entering search string.
         */
        private JTextField searchStringField;

        /**
         * The result buttons. Key is {@link Integer}, value is {@link JButton}.
         */
        private Map<Integer, JButton> resultButtons;

        /**
         * Simple constructor.
         * 
         * @param menuBar
         *            The associated menu bar.
         */
        public SearchPanel(final JMenuBar menuBar) {
            // this.menuBar = menuBar;
            this.setLayout(new SearchResultsLayout(this));

            // Search button (toggle) with tooltip.
            int buttonDim = SubstanceSizeUtils.getLookupButtonSize();
            this.searchButton = new JToggleButton();
            updateSearchIcon();
            this.searchButton.setPreferredSize(new Dimension(buttonDim, buttonDim));
            ResourceBundle bundle = SubstanceCortex.GlobalScope.getLabelBundle();
            this.searchButton.setToolTipText(bundle.getString("Tooltip.menuSearchButton"));
            this.searchButton.setFocusable(false);
            SubstanceCoreUtilities.markButtonAsFlat(this.searchButton);
            this.add(this.searchButton);

            // Add action listener on the toggle button. Based on the
            // state of the toggle button, the search field and result buttons
            // will be set visible or invisible.
            this.searchButton.addActionListener((ActionEvent e) -> {
                SwingUtilities.invokeLater(() -> {
                    boolean toShow = SearchPanel.this.searchButton.isSelected();
                    SearchPanel.this.searchStringField.setVisible(toShow);
                    SearchPanel.this.searchStringField.requestFocus();
                    for (JButton resultButton : SearchPanel.this.resultButtons.values()) {
                        resultButton.setVisible(toShow);
                    }
                    SearchPanel.this.repaint();
                    SearchPanel.this.revalidate();
                });
            });
            // add mouse listener to remove the search panel on mouse
            // click when CTRL button is pressed.
            this.searchButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if ((e.getModifiers() & InputEvent.CTRL_MASK) != 0) {
                        SwingUtilities.invokeLater(() -> {
                            SearchPanel.this.removeAll();
                            SearchPanel.this.repaint();
                            jcomp.revalidate();
                        });
                    }
                }
            });

            // Search field.
            this.searchStringField = new JTextField();
            this.searchStringField.setColumns(10);
            this.add(this.searchStringField);
            this.searchStringField.setVisible(false);
            this.searchStringField.setToolTipText(bundle.getString("Tooltip.menuSearchField"));

            // Map to hold the result buttons (need for the icon reset
            // on theme change and layout manager).
            this.resultButtons = new HashMap<Integer, JButton>();
            this.searchStringField.addActionListener((ActionEvent e) -> {
                String searchString = SearchPanel.this.searchStringField.getText().toLowerCase();
                // See if there is at least one non-white space character.
                // This is fix for bug 54
                if (searchString.trim().length() == 0) {
                    return;
                }

                // remove all old buttons
                for (JButton toRemove : SearchPanel.this.resultButtons.values()) {
                    SearchPanel.this.remove(toRemove);
                }
                SearchPanel.this.resultButtons.clear();
                // find all matching menu items / menus
                LinkedList<SearchResult> searchResults = SearchPanel.this
                        .findOccurences(searchString);
                int count = 0;
                for (SearchResult searchResult : searchResults) {
                    // show only first 16 results.
                    if (count == 16)
                        break;
                    // create new button with binary icon
                    JButton resultButton = new JButton();
                    final int finalCount = count;
                    resultButton.setIcon(new TransitionAwareIcon(resultButton,
                            () -> (TransitionAwareUI) resultButton.getUI(),
                            (SubstanceColorScheme scheme) -> SubstanceImageCreator
                                    .getHexaMarker((finalCount + 1), scheme),
                            (ComponentState state) -> state
                                    .isFacetActive(ComponentStateFacet.ROLLOVER)
                                            ? ColorSchemeAssociationKind.HIGHLIGHT
                                            : ColorSchemeAssociationKind.MARK,
                            "substance.widget.menusearch." + (finalCount + 1)));

                    // set action listener (to show the menu).
                    resultButton.addActionListener(new SearchResultListener(searchResult));
                    // check if the path to the menu (item) has
                    // only enabled items.
                    resultButton.setEnabled(searchResult.isEnabled());
                    SearchPanel.this.add(resultButton);
                    SearchPanel.this.resultButtons.put(new Integer(count + 1), resultButton);
                    resultButton.setToolTipText("<html><body><b>"
                            + searchResult.toString() + "</b><br>" + SubstanceCortex.GlobalScope
                                    .getLabelBundle().getString("Tooltip.menuSearchTooltip")
                            + "</html>");
                    SubstanceCoreUtilities.markButtonAsFlat(resultButton);
                    count++;
                }
                SearchPanel.this.repaint();
                jcomp.revalidate();
            });
        }

        /**
         * Returns all occurences of the specified string in the menus and menu items of the
         * associated menu bar.
         * 
         * @param searchPattern
         *            Pattern to search (no wildcards yet).
         * @return All occurences of the specified string in the menus and menu items of the
         *         associated menu bar.
         */
        private LinkedList<SearchResult> findOccurences(String searchPattern) {
            LinkedList<SearchResult> result = new LinkedList<SearchResult>();

            LinkedList<JMenu> currentPath = new LinkedList<JMenu>();

            for (int i = 0; i < jcomp.getComponentCount(); i++) {
                Component component = jcomp.getComponent(i);
                if (component instanceof JMenu) {
                    JMenu menu = (JMenu) component;
                    this.checkMenu(currentPath, menu, searchPattern, result);
                }
            }

            return result;
        }

        /**
         * Recursively scans the specified menu (item) and updates the list that contains all
         * occurences of the specified string in the contained menus and menu items.
         * 
         * @param currentPath
         *            The path to the current menu (item). Contains {@link JMenu}s.
         * @param menuItem
         *            The menu (item) itself that is being tested.
         * @param searchPattern
         *            Pattern to search (no wildcards yet).
         * @param matchingResults
         *            All occurences of the specified string up until now. After <code>this</code>
         *            function returns, will also contain all occurences of the specified string in
         *            the contained menu (item)s. Contains {@link SearchResult}s.
         */
        private void checkMenu(LinkedList<JMenu> currentPath, JMenuItem menuItem,
                String searchPattern, LinkedList<SearchResult> matchingResults) {
            String menuItemText = menuItem.getText();
            if (menuItemText.toLowerCase().indexOf(searchPattern) >= 0) {
                matchingResults.addLast(new SearchResult(jcomp, currentPath, menuItem));
            }
            if (menuItem instanceof JMenu) {
                JMenu menu = (JMenu) menuItem;
                currentPath.addLast(menu);
                for (int i = 0; i < menu.getMenuComponentCount(); i++) {
                    Component menuComponent = menu.getMenuComponent(i);
                    if (menuComponent instanceof JMenuItem) {
                        JMenuItem childItem = (JMenuItem) menuComponent;
                        this.checkMenu(currentPath, childItem, searchPattern, matchingResults);
                    }
                }
                currentPath.removeLast();
            }
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.awt.Component#setVisible(boolean)
         */
        @Override
        public void setVisible(boolean aFlag) {
            super.setVisible(aFlag);
            if (aFlag)
                this.searchStringField.requestFocus();
        }

        private void updateSearchIcon() {
            int dimension = SubstanceSizeUtils.getControlFontSize();
            this.searchButton.setIcon(new TransitionAwareIcon(
                    this.searchButton, (SubstanceColorScheme scheme) -> SubstanceCortex.GlobalScope
                            .getIconPack().getInspectIcon(dimension, scheme),
                    "substance.widget.menusearch"));
        }
    }

    /**
     * Listener on the <code>search result</code> button. The action itself - show the associated
     * menu path to the menu item that contains the string that has been specified during the
     * search.
     * 
     * @author Kirill Grouchnikov
     */
    private static class SearchResultListener implements ActionListener {
        /**
         * The associated search result.
         */
        private SearchResult searchResult;

        /**
         * Simple constructor.
         * 
         * @param searchResult
         *            The associated search result.
         */
        public SearchResultListener(SearchResult searchResult) {
            super();
            this.searchResult = searchResult;
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.awt.event.ActionListener#actionPerformed(java.awt.event. ActionEvent)
         */
        public void actionPerformed(ActionEvent e) {
            // start opening the menus
            MenuElement[] menuElements = this.searchResult.menuElements;
            MenuSelectionManager.defaultManager().setSelectedPath(menuElements);
        }
    }

    /**
     * Single result of menu search.
     * 
     * @author Kirill Grouchnikov
     */
    private static class SearchResult {
        /**
         * Path to the menu (item). The first element is always {@link JMenuBar}, and after each
         * {@link JMenu} there is it's {@link JMenu#getPopupMenu()}.
         */
        private MenuElement[] menuElements;

        /**
         * Simple constructor.
         * 
         * @param menuBar
         *            The main menu bar.
         * @param menuPath
         *            The menus leading to the matching entry. Contains {@link JMenu}s.
         * @param menuLeaf
         *            The menu (item) that matches the search pattern string.
         */
        public SearchResult(JMenuBar menuBar, LinkedList<JMenu> menuPath, JMenuItem menuLeaf) {
            int count = 1;
            if (menuPath != null)
                count += 2 * menuPath.size();
            if (menuLeaf != null)
                count++;
            this.menuElements = new MenuElement[count];
            count = 0;

            // the first element is the menu bar itself
            this.menuElements[count++] = menuBar;
            if (menuPath != null) {
                for (JMenu menu : menuPath) {
                    // JMenu menu = (JMenu) it.next();
                    this.menuElements[count++] = menu;
                    // important - don't forget the popup menu of the menu
                    this.menuElements[count++] = menu.getPopupMenu();
                }
            }
            if (menuLeaf != null)
                this.menuElements[count] = menuLeaf;
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString() {
            StringBuffer sb = new StringBuffer();
            if (this.menuElements != null) {
                String sep = "";
                for (int i = 0; i < this.menuElements.length; i++) {
                    MenuElement menuElem = this.menuElements[i];
                    if (menuElem instanceof JMenuItem) {
                        sb.append(sep);
                        sep = " -> ";
                        sb.append(((JMenuItem) menuElem).getText());
                    }
                }
            }
            return sb.toString();
        }

        /**
         * Checks that all entries leading to the associated menu (item) are enabled.
         * 
         * @return <code>true</code> if all entries leading to the associated menu (item) are
         *         enabled, <code>false</code> otherwise.
         */
        public boolean isEnabled() {
            // all parts must be enabled
            for (int i = 0; i < this.menuElements.length; i++) {
                MenuElement menuElem = this.menuElements[i];
                if (menuElem instanceof JMenuItem) {
                    JMenuItem menuItem = (JMenuItem) menuElem;
                    if (!menuItem.isEnabled())
                        return false;
                }
            }
            return true;
        }
    }

    private static boolean toInstallMenuSearch(JMenuBar menuBar) {
        // if the menu search widget has not been allowed,
        // return false
        if (!SubstanceWidgetManager.getInstance().isAllowed(SwingUtilities.getRootPane(menuBar),
                SubstanceWidgetType.MENU_SEARCH))
            return false;
        // don't install on menu bar of title panes
        if (menuBar instanceof SubstanceTitlePane.SubstanceMenuBar)
            return false;
        return MenuSearchWidget.getMenuItemCount(menuBar) > 40;
    }

    /**
     * Returns the number of menu items under the specified menu item.
     * 
     * @param menuItem
     *            The root menu item.
     * @return The number of menu items under the specified menu item.
     */
    private static int getMenuItemCount(JMenuItem menuItem) {
        int result = 1;

        if (menuItem instanceof JMenu) {
            JMenu menu = (JMenu) menuItem;
            for (int i = 0; i < menu.getMenuComponentCount(); i++) {
                Component child = menu.getMenuComponent(i);
                if (child instanceof JMenuItem)
                    result += MenuSearchWidget.getMenuItemCount((JMenuItem) child);
            }
        }

        return result;
    }

    /**
     * Returns the number of menu items under the specified menu bar.
     * 
     * @param menuBar
     *            The root menu bar.
     * @return The number of menu items under the specified menu bar.
     */
    public static int getMenuItemCount(JMenuBar menuBar) {
        int result = 0;

        for (int i = 0; i < menuBar.getMenuCount(); i++) {
            JMenu menu = menuBar.getMenu(i);
            if (menu != null) {
                result += MenuSearchWidget.getMenuItemCount(menu);
            }
        }

        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#installUI()
     */
    @Override
    public void installUI() {
        this.searchPanel = new SearchPanel(this.jcomp);
        this.jcomp.add(searchPanel, this.jcomp.getComponentCount());
        this.searchPanel.setVisible(toInstallMenuSearch(this.jcomp));
        // NewMenuSearchWidget.panels.put(this.jcomp, searchPanel);
        // toAddListener = true;
        // }

        // if (toAddListener) {
        // need to add a container listener that will move a newly added
        // JMenu one entry before the last (so that our search panel
        // will always be the last).
        this.jcomp.addContainerListener(new ContainerAdapter() {
            @Override
            public void componentAdded(ContainerEvent e) {
                if (!(e.getChild() instanceof JMenu))
                    return;
                if (!inEvent) {
                    inEvent = true;
                    Component removed = null;
                    for (int i = 0; i < MenuSearchWidget.this.jcomp.getComponentCount(); i++) {
                        if (MenuSearchWidget.this.jcomp.getComponent(i) instanceof SearchPanel) {
                            removed = MenuSearchWidget.this.jcomp.getComponent(i);
                            break;
                        }
                    }
                    if (removed != null) {
                        MenuSearchWidget.this.jcomp.remove(removed);
                        MenuSearchWidget.this.jcomp.add(removed,
                                MenuSearchWidget.this.jcomp.getComponentCount());
                        // Show search panel only if needed
                        removed.setVisible(toInstallMenuSearch(MenuSearchWidget.this.jcomp));
                    }
                    inEvent = false;
                }
            }
        });
        // }

        // SearchPanel sp = (SearchPanel)
        // NewMenuSearchWidget.panels.get(this.jcomp);
        // if (sp != null) {
        searchPanel.applyComponentOrientation(this.jcomp.getComponentOrientation());
        // }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#uninstallUI()
     */
    @Override
    public void uninstallUI() {
        this.jcomp.remove(this.searchPanel);
        super.uninstallUI();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#installListeners()
     */
    @Override
    public void installListeners() {
        super.installListeners();

        this.propertyListener = (final PropertyChangeEvent evt) -> {
            if ("componentOrientation".equals(evt.getPropertyName())) {
                // final SearchPanel sp = (SearchPanel)
                // NewMenuSearchWidget.panels
                // .get(NewMenuSearchWidget.this.jcomp);
                SwingUtilities.invokeLater(() -> {
                    if (searchPanel != null) {
                        searchPanel.applyComponentOrientation(
                                (ComponentOrientation) evt.getNewValue());
                    }
                    MenuSearchWidget.this.reset();
                });
            }
            if ("locale".equals(evt.getPropertyName())) {
                SwingUtilities.invokeLater(() -> reset());
            }
        };
        this.jcomp.addPropertyChangeListener(this.propertyListener);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.lafwidget.LafWidgetAdapter#uninstallListeners()
     */
    @Override
    public void uninstallListeners() {
        this.jcomp.removePropertyChangeListener(this.propertyListener);
        this.propertyListener = null;
    }

    private void reset() {
        if (searchPanel == null)
            return;
        for (Map.Entry<Integer, JButton> entry : searchPanel.resultButtons.entrySet()) {
            int index = entry.getKey();
            JButton button = entry.getValue();

            button.setIcon(new TransitionAwareIcon(button, () -> (TransitionAwareUI) button.getUI(),
                    (SubstanceColorScheme scheme) -> SubstanceImageCreator.getHexaMarker(index,
                            scheme),
                    (ComponentState state) -> state.isFacetActive(ComponentStateFacet.ROLLOVER)
                            ? ColorSchemeAssociationKind.HIGHLIGHT
                            : ColorSchemeAssociationKind.MARK,
                    "substance.widget.menusearch." + index));
        }
        searchPanel.updateSearchIcon();
        ResourceBundle bundle = SubstanceCortex.GlobalScope.getLabelBundle();
        searchPanel.searchButton.setToolTipText(bundle.getString("Tooltip.menuSearchButton"));
        searchPanel.searchStringField.setToolTipText(bundle.getString("Tooltip.menuSearchField"));
    }

    /**
     * Layout for the search panel. Note that {@link FlowLayout} is almost perfect for us, but we
     * need the following:
     * <ul>
     * <li>Minimum size to be 16*16 (for the search icon)
     * <li>When there isn't enough place for result buttons, they should continue (even if they are
     * unseen) and not flow to the next line.
     * </ul>
     * 
     * @author Kirill Grouchnikov
     */
    private class SearchResultsLayout implements LayoutManager {
        /**
         * The associated search panel.
         */
        private SearchPanel searchPanel;

        /**
         * Simple constructor.
         * 
         * @param searchPanel
         *            The associated search panel.
         */
        public SearchResultsLayout(SearchPanel searchPanel) {
            this.searchPanel = searchPanel;
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.awt.LayoutManager#addLayoutComponent(java.lang.String, java.awt.Component)
         */
        public void addLayoutComponent(String name, Component c) {
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.awt.LayoutManager#removeLayoutComponent(java.awt.Component)
         */
        public void removeLayoutComponent(Component c) {
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.awt.LayoutManager#preferredLayoutSize(java.awt.Container)
         */
        public Dimension preferredLayoutSize(Container c) {
            if (this.searchPanel.searchButton.isSelected())
                return c.getSize();
            int buttonSize = SubstanceSizeUtils.getLookupButtonSize();
            return new Dimension(buttonSize, buttonSize);
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.awt.LayoutManager#minimumLayoutSize(java.awt.Container)
         */
        public Dimension minimumLayoutSize(Container c) {
            // enough for the search icon
            int buttonSize = SubstanceSizeUtils.getLookupButtonSize();
            return new Dimension(buttonSize, buttonSize);
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.awt.LayoutManager#layoutContainer(java.awt.Container)
         */
        public void layoutContainer(Container c) {
            int height = c.getHeight();
            int width = c.getWidth();

            if (!this.searchPanel.searchButton.isVisible())
                return;

            boolean leftToRight = jcomp.getComponentOrientation().isLeftToRight();

            if (leftToRight) {
                // start from the toggle button
                int x = 2;
                int sbWidth = this.searchPanel.searchButton.getPreferredSize().width;
                int sbHeight = this.searchPanel.searchButton.getPreferredSize().height;
                this.searchPanel.searchButton.setBounds(x, (height - sbHeight) / 2, sbWidth,
                        sbHeight);

                x += (sbWidth + 4);

                if (this.searchPanel.isVisible()) {
                    // now - text field
                    int tbWidth = this.searchPanel.searchStringField.getPreferredSize().width;
                    int tbHeight = this.searchPanel.searchStringField.getPreferredSize().height;
                    // make the text field fit in the available height
                    tbHeight = Math.min(tbHeight, height - 2);
                    this.searchPanel.searchStringField.setBounds(x, (height - tbHeight) / 2,
                            tbWidth, tbHeight);

                    x += (tbWidth + 2);

                    // result buttons
                    int buttonCount = this.searchPanel.resultButtons.size();
                    for (int i = 1; i <= buttonCount; i++) {
                        JButton button = this.searchPanel.resultButtons.get(i);
                        int bw = button.getPreferredSize().width;
                        int bh = button.getPreferredSize().height;

                        button.setBounds(x, (height - bh) / 2, bw, bh);
                        x += (bw + 1);
                    }
                }
            } else {
                // start from the toggle button
                int x = width - 2;
                int sbWidth = this.searchPanel.searchButton.getPreferredSize().width;
                int sbHeight = this.searchPanel.searchButton.getPreferredSize().height;
                this.searchPanel.searchButton.setBounds(x - sbWidth, (height - sbHeight) / 2,
                        sbWidth, sbHeight);

                x -= (sbWidth + 4);

                if (this.searchPanel.isVisible()) {
                    // now - text field
                    int tbWidth = this.searchPanel.searchStringField.getPreferredSize().width;
                    int tbHeight = this.searchPanel.searchStringField.getPreferredSize().height;
                    // make the text field fit in the available height
                    tbHeight = Math.min(tbHeight, height - 2);
                    this.searchPanel.searchStringField.setBounds(x - tbWidth,
                            (height - tbHeight) / 2, tbWidth, tbHeight);

                    x -= (tbWidth + 2);

                    // result buttons
                    int buttonCount = this.searchPanel.resultButtons.size();
                    for (int i = 1; i <= buttonCount; i++) {
                        JButton button = this.searchPanel.resultButtons.get(i);
                        int bw = button.getPreferredSize().width;
                        int bh = button.getPreferredSize().height;

                        button.setBounds(x - bw, (height - bh) / 2, bw, bh);
                        x -= (bw + 1);
                    }
                }
            }
        }
    }
}
