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
package org.pushingpixels.demo.substance.main.check;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.TabContentPaneBorderKind;
import org.pushingpixels.substance.extras.api.SubstanceExtrasSlices.TabOverviewKind;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Control panel for the tabbed panes.
 * 
 * @author Kirill Grouchnikov
 */
public class TabControlPanel extends JPanel {
    /**
     * Tabbed pane.
     */
    private JTabbedPane jtp;

    /**
     * Contains the closed components.
     */
    public LinkedList<Component> closed;

    /**
     * Model for the combobox that contains the list of all tabs.
     * 
     * @author Kirill Grouchnikov
     */
    private static class TabComboBoxModel extends DefaultComboBoxModel {
        /**
         * Tabbed pane.
         */
        private JTabbedPane jtp;

        /**
         * Creates the combobox model.
         * 
         * @param jtp
         *            Tabbed pane.
         */
        public TabComboBoxModel(JTabbedPane jtp) {
            this.jtp = jtp;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.DefaultComboBoxModel#getSize()
         */
        @Override
        public int getSize() {
            return this.jtp.getTabCount();
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.DefaultComboBoxModel#getElementAt(int)
         */
        @Override
        public Object getElementAt(int index) {
            return index;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.DefaultComboBoxModel#getIndexOf(java.lang.Object)
         */
        @Override
        public int getIndexOf(Object anObject) {
            return (Integer) anObject;
        }

        /**
         * Fires the event that the combo contents has been changed.
         */
        public void changed() {
            this.fireContentsChanged(this, 0, this.getSize() - 1);
        }
    }

    /**
     * Cell renderer for the combobox that lists the tabs.
     * 
     * @author Kirill Grouchnikov
     */
    private class TabCellRenderer extends JLabel implements ListCellRenderer {
        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.ListCellRenderer#getListCellRendererComponent(javax.swing .JList,
         * java.lang.Object, int, boolean, boolean)
         */
        public Component getListCellRendererComponent(JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            if (value == null) {
                this.setText("");
                this.setIcon(null);
            } else {
                this.setText(jtp.getTitleAt((Integer) value));
                this.setIcon(jtp.getIconAt((Integer) value));
            }
            return this;
        }
    }

    /**
     * Returns the contents of the control panel.
     * 
     * @param jtp
     *            Tabbed pane.
     * @param mainTabPreviewPainter
     *            Tab preview painter.
     * @return Control panel contents.
     */
    private JPanel getContents(final JTabbedPane jtp,
            final MyTabPreviewPainter mainTabPreviewPainter) {
        FormLayout lm = new FormLayout("right:pref, 4dlu, fill:min:grow(1), 2dlu, fill:min:grow(1)",
                "p, 2dlu, p, 3dlu, p, 3dlu, p, 3dlu,  p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, "
                        + "p, 3dlu, p, 7dlu, p, 2dlu, p, 0dlu, p, 0dlu, p, 0dlu, p, 7dlu,"
                        + "p, 2dlu, p, 3dlu, p, 0dlu, p, 3dlu, p, 3dlu, p, 7dlu, "
                        + "p, 2dlu, p, 0dlu, p, 0dlu, p, 0dlu, p, 7dlu, p, 2dlu, p, 3dlu, p");
        lm.setColumnGroups(new int[][] { { 3, 5 } });
        PanelBuilder builder = new PanelBuilder(lm);
        CellConstraints cc = new CellConstraints();

        int row = 1;
        builder.addSeparator("General", cc.xyw(1, row, 5));

        final JComboBox addKindCombo = new JComboBox(
                new Object[] { "regular", "null", "modified" });
        JButton addNewTabButton = new JButton("Add");
        addNewTabButton.addActionListener((ActionEvent e) -> {
            String selectedKind = (String) addKindCombo.getSelectedItem();
            if ("null".equals(selectedKind)) {
                SwingUtilities.invokeLater(() -> jtp.addTab("null tab", null));
                return;
            }

            final int count = 1 + jtp.getTabCount();
            final JComponent tabComp = new NumberedPanel(count);
            if ("modified".equals(selectedKind)) {
                SubstanceCortex.ComponentScope.setTabContentsModified(tabComp, true);
            }
            SwingUtilities.invokeLater(() -> jtp.addTab("tab" + count, tabComp));
        });
        row += 2;

        builder.addLabel("Add tab", cc.xy(1, row));
        builder.add(addKindCombo, cc.xy(3, row));
        builder.add(addNewTabButton, cc.xy(5, row));

        final JComboBox placementCombo = new JComboBox(
                new Object[] { "top", "bottom", "left", "right" });
        placementCombo.addActionListener((ActionEvent e) -> {
            String selected = (String) placementCombo.getSelectedItem();
            if ("top".equals(selected))
                jtp.setTabPlacement(JTabbedPane.TOP);
            if ("bottom".equals(selected))
                jtp.setTabPlacement(JTabbedPane.BOTTOM);
            if ("left".equals(selected))
                jtp.setTabPlacement(JTabbedPane.LEFT);
            if ("right".equals(selected))
                jtp.setTabPlacement(JTabbedPane.RIGHT);
        });
        row += 2;
        builder.addLabel("Placement", cc.xy(1, row));
        builder.add(placementCombo, cc.xyw(3, row, 3));

        try {
            final JComboBox overviewKindCombo = new FlexiComboBox<TabOverviewKind>(
                    TabOverviewKind.GRID, TabOverviewKind.MENU_CAROUSEL,
                    TabOverviewKind.ROUND_CAROUSEL) {
                @Override
                public String getCaption(TabOverviewKind item) {
                    return item.getName();
                }
            };
            overviewKindCombo.addActionListener((ActionEvent e) -> mainTabPreviewPainter
                    .setTabOverviewKind((TabOverviewKind) overviewKindCombo.getSelectedItem()));
            row += 2;
            builder.addLabel("Overview kind", cc.xy(1, row));
            builder.add(overviewKindCombo, cc.xyw(3, row, 3));
        } catch (NoClassDefFoundError ncdfe) {
        }

        final JCheckBox useScrollLayout = new JCheckBox("Uses scroll layout");
        useScrollLayout.setSelected(false);
        useScrollLayout.addActionListener((ActionEvent e) -> jtp
                .setTabLayoutPolicy(useScrollLayout.isSelected() ? JTabbedPane.SCROLL_TAB_LAYOUT
                        : JTabbedPane.WRAP_TAB_LAYOUT));
        row += 2;
        builder.addLabel("Layout", cc.xy(1, row));
        builder.add(useScrollLayout, cc.xyw(3, row, 3));

        final JComboBox contentBorderCombo = new JComboBox(new Object[] {
                        TabContentPaneBorderKind.DOUBLE_FULL, TabContentPaneBorderKind.SINGLE_FULL,
                        TabContentPaneBorderKind.DOUBLE_PLACEMENT,
                        TabContentPaneBorderKind.SINGLE_PLACEMENT });
        contentBorderCombo.setSelectedItem(TabContentPaneBorderKind.DOUBLE_FULL);
        contentBorderCombo.addActionListener((ActionEvent e) -> {
            TabContentPaneBorderKind contentBorderKind = (TabContentPaneBorderKind) contentBorderCombo
                    .getSelectedItem();
            SubstanceCortex.ComponentScope.setTabContentPaneBorderKind(jtp, contentBorderKind);
            jtp.updateUI();
            jtp.repaint();
        });
        row += 2;
        builder.addLabel("Content border", cc.xy(1, row));
        builder.add(contentBorderCombo, cc.xyw(3, row, 3));

        JButton enableAll = new JButton("+ all");
        enableAll.addActionListener((ActionEvent e) -> {
            for (int i = 0; i < jtp.getTabCount(); i++) {
                jtp.setEnabledAt(i, true);
            }
        });

        JButton disableAll = new JButton("- all");
        disableAll.addActionListener((ActionEvent e) -> {
            for (int i = 0; i < jtp.getTabCount(); i++) {
                jtp.setEnabledAt(i, false);
            }
        });

        row += 2;
        builder.addLabel("Enable all", cc.xy(1, row));
        builder.add(enableAll, cc.xy(3, row));
        builder.add(disableAll, cc.xy(5, row));

        JButton closeAllEnabled = new JButton("Close");
        closeAllEnabled.addActionListener((ActionEvent e) -> {
            Set<Component> toRemove = new HashSet<Component>();
            for (int i = 0; i < jtp.getTabCount(); i++) {
                if (jtp.isEnabledAt(i))
                    toRemove.add(jtp.getComponentAt(i));
            }
            for (Component comp : toRemove)
                jtp.remove(comp);
        });

        JButton restoreClosed = new JButton("Restore");
        restoreClosed.addActionListener((ActionEvent e) -> {
            for (Component tnp : closed) {
                jtp.addTab("restored", tnp);
            }
        });

        row += 2;
        builder.addLabel("Close all", cc.xy(1, row));
        builder.add(closeAllEnabled, cc.xy(3, row));
        builder.add(restoreClosed, cc.xy(5, row));

        row += 2;
        builder.addSeparator("Single Tab", cc.xyw(1, row, 5));

        final JComboBox tabSelectorCombo = new JComboBox(new TabComboBoxModel(this.jtp));
        tabSelectorCombo.setRenderer(new TabCellRenderer());
        jtp.addContainerListener(new ContainerAdapter() {
            @Override
            public void componentAdded(ContainerEvent e) {
                ((TabComboBoxModel) tabSelectorCombo.getModel()).changed();
            }

            @Override
            public void componentRemoved(ContainerEvent e) {
                ((TabComboBoxModel) tabSelectorCombo.getModel()).changed();
            }
        });

        row += 2;
        builder.addLabel("Select", cc.xy(1, row));
        builder.add(tabSelectorCombo, cc.xyw(3, row, 3));

        final JButton markAsModified = new JButton("-> modified");
        markAsModified.addActionListener((ActionEvent e) -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            if ((comp != null) && (comp instanceof JComponent)) {
                SubstanceCortex.ComponentScope.setTabContentsModified((JComponent) comp, true);
            }
        });
        final JButton markAsUnmodified = new JButton("-> unmodified");
        markAsUnmodified.addActionListener((ActionEvent e) -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            if ((comp != null) && (comp instanceof JComponent)) {
                SubstanceCortex.ComponentScope.setTabContentsModified((JComponent) comp, false);
            }
        });
        row += 2;
        builder.addLabel("Modified", cc.xy(1, row));
        builder.add(markAsModified, cc.xy(3, row));
        builder.add(markAsUnmodified, cc.xy(5, row));

        final JButton runModifiedAnimOnClose = new JButton("Animate on X");
        runModifiedAnimOnClose.addActionListener((ActionEvent e) -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            if ((comp != null) && (comp instanceof JComponent)) {
                JComponent jc = (JComponent) comp;
                SubstanceCortex.ComponentScope.setRunModifiedAnimationOnTabCloseButton(jc, true);
            }
        });
        final JButton runModifiedAnimOnTab = new JButton("Animate on tab");
        runModifiedAnimOnTab.addActionListener((ActionEvent e) -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            if ((comp != null) && (comp instanceof JComponent)) {
                JComponent jc = (JComponent) comp;
                SubstanceCortex.ComponentScope.setRunModifiedAnimationOnTabCloseButton(jc, false);
            }
        });
        row += 2;
        builder.add(runModifiedAnimOnClose, cc.xy(3, row));
        builder.add(runModifiedAnimOnTab, cc.xy(5, row));

        final JButton showCloseButton = new JButton("+ close button");
        showCloseButton.addActionListener((ActionEvent e) -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            if ((comp != null) && (comp instanceof JComponent)) {
                JComponent jc = (JComponent) comp;
                SubstanceCortex.ComponentScope.setTabCloseButtonVisible(jc, true);
                jtp.repaint();
            }
        });
        final JButton hideCloseButton = new JButton("- close button");
        hideCloseButton.addActionListener((ActionEvent e) -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            if ((comp != null) && (comp instanceof JComponent)) {
                JComponent jc = (JComponent) comp;
                SubstanceCortex.ComponentScope.setTabCloseButtonVisible(jc, false);
                jtp.repaint();
            }
        });

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            jtp.removeTabAt((Integer) tabSelectorCombo.getSelectedItem());
            closed.add(comp);
            jtp.repaint();
        }));

        JButton selectButton = new JButton("Select");
        selectButton.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            jtp.setSelectedIndex((Integer) tabSelectorCombo.getSelectedItem());
        }));
        row += 2;
        builder.addLabel("Tab op", cc.xy(1, row));
        builder.add(closeButton, cc.xy(3, row));
        builder.add(selectButton, cc.xy(5, row));

        row += 2;
        builder.addSeparator("Close Button Single", cc.xyw(1, row, 5));

        row += 2;
        builder.addLabel("Visible", cc.xy(1, row));
        builder.add(showCloseButton, cc.xy(3, row));
        builder.add(hideCloseButton, cc.xy(5, row));

        return builder.getPanel();
    }

    /**
     * Creates the tab control panel.
     * 
     * @param jtp
     *            Tabbed pane.
     * @param previewPainter
     *            Preview painter.
     */
    public TabControlPanel(JTabbedPane jtp, MyTabPreviewPainter previewPainter) {
        super();
        this.jtp = jtp;
        this.closed = new LinkedList<Component>();

        this.setLayout(new BorderLayout());
        JPanel contents = getContents(jtp, previewPainter);
        contents.setOpaque(false);
        SubstanceCortex.ComponentOrParentScope.setButtonIgnoreMinimumSize(contents, true);
        this.add(contents, BorderLayout.CENTER);
    }

    // @Override
    // public Dimension getPreferredSize() {
    // Dimension result = super.getPreferredSize();
    // return new Dimension(190, result.height);
    // }
    //
    // private class TabControlPanelLayout implements LayoutManager {
    // public void addLayoutComponent(String name, Component comp) {
    // }
    //
    // public void removeLayoutComponent(Component comp) {
    // }
    //
    // public void layoutContainer(Container parent) {
    // Insets pIns = paneControls.getInsets();
    // Insets tIns = tabControls.getInsets();
    // int width = Math.max(paneControls.getPreferredSize().width
    // + pIns.left + pIns.right,
    // tabControls.getPreferredSize().width + tIns.left
    // + tIns.right);
    // width = Math.min(parent.getWidth(), width);
    //
    // int h = paneControls.getPreferredSize().height + pIns.top
    // + pIns.bottom;
    // paneControls.setBounds(0, 0, width, h);
    //
    // tabControls.setBounds(0, h, width,
    // tabControls.getPreferredSize().height + tIns.top
    // + tIns.bottom);
    // }
    //
    // public Dimension minimumLayoutSize(Container parent) {
    // int w = Math.max(tabControls.getMinimumSize().width, paneControls
    // .getMinimumSize().width);
    // Insets tIns = tabControls.getInsets();
    // Insets pIns = paneControls.getInsets();
    // int h = tabControls.getMinimumSize().height
    // + paneControls.getMinimumSize().height + tIns.top
    // + tIns.bottom + pIns.top + pIns.bottom;
    // return new Dimension(w, h);
    // }
    //
    // public Dimension preferredLayoutSize(Container parent) {
    // int w = Math.max(tabControls.getPreferredSize().width, paneControls
    // .getPreferredSize().width);
    // Insets tIns = tabControls.getInsets();
    // Insets pIns = paneControls.getInsets();
    // int h = tabControls.getPreferredSize().height
    // + paneControls.getPreferredSize().height + tIns.top
    // + tIns.bottom + pIns.top + pIns.bottom;
    // return new Dimension(w, h);
    // }
    // }
    //
    // private void addSeparator(JPanel panel, String text) {
    // JLabel l = new JLabel(text, SwingConstants.LEADING);
    // l.setFont(l.getFont().deriveFont(Font.BOLD));
    //
    // panel.add(l, "gapbottom 1,gaptop para, span, split 2");
    // panel.add(new JSeparator(), "gapleft rel, gaptop para, growx");
    // }
}
