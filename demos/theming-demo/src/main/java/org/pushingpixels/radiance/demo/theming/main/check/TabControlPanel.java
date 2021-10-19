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
package org.pushingpixels.radiance.demo.theming.main.check;

import com.jgoodies.forms.builder.FormBuilder;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.TabContentPaneBorderKind;
import org.pushingpixels.radiance.theming.extras.api.RadianceExtrasSlices.TabOverviewKind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

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
    private static class TabComboBoxModel extends DefaultComboBoxModel<Integer> {
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

        @Override
        public int getSize() {
            return this.jtp.getTabCount();
        }

        @Override
        public Integer getElementAt(int index) {
            return index;
        }

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
        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 4dlu, fill:min:grow(1), 2dlu, fill:min:grow(1)").
                rows("p, 2dlu, p, 3dlu, p, 3dlu, p, 3dlu,  p, 3dlu, p, 3dlu, p, 3dlu, p, 3dlu, "
                        + "p, 3dlu, p, 7dlu, p, 2dlu, p, 0dlu, p, 0dlu, p, 0dlu, p, 7dlu,"
                        + "p, 2dlu, p, 3dlu, p, 0dlu, p, 3dlu, p, 3dlu, p, 7dlu, "
                        + "p, 2dlu, p, 0dlu, p, 0dlu, p, 0dlu, p, 7dlu, p, 2dlu, p, 3dlu, p").
                columnGroups(new int[][] { { 3, 5 } });

        int row = 1;
        builder.addSeparator("General").xyw(1, row, 5);

        final JComboBox<String> addKindCombo = new JComboBox<>(
                new String[] { "regular", "null", "modified" });
        JButton addNewTabButton = new JButton("Add");
        addNewTabButton.addActionListener(actionEvent -> {
            String selectedKind = (String) addKindCombo.getSelectedItem();
            if ("null".equals(selectedKind)) {
                SwingUtilities.invokeLater(() -> jtp.addTab("null tab", null));
                return;
            }

            final int count = 1 + jtp.getTabCount();
            final JComponent tabComp = new NumberedPanel(count);
            if ("modified".equals(selectedKind)) {
                RadianceThemingCortex.ComponentScope.setTabContentsModified(tabComp, true);
            }
            SwingUtilities.invokeLater(() -> jtp.addTab("tab" + count, tabComp));
        });
        row += 2;

        builder.addLabel("Add tab").xy(1, row);
        builder.add(addKindCombo).xy(3, row);
        builder.add(addNewTabButton).xy(5, row);

        final JComboBox<String> placementCombo = new JComboBox<>(
                new String[] { "top", "bottom", "left", "right" });
        placementCombo.addActionListener(actionEvent -> {
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
        builder.addLabel("Placement").xy(1, row);
        builder.add(placementCombo).xyw(3, row, 3);

        try {
            final JComboBox<TabOverviewKind> overviewKindCombo = new FlexiComboBox<>(
                    TabOverviewKind.GRID, TabOverviewKind.MENU_CAROUSEL,
                    TabOverviewKind.ROUND_CAROUSEL) {
                @Override
                public String getCaption(TabOverviewKind item) {
                    return item.getName();
                }
            };
            overviewKindCombo.addActionListener(actionEvent -> mainTabPreviewPainter
                    .setTabOverviewKind((TabOverviewKind) overviewKindCombo.getSelectedItem()));
            row += 2;
            builder.addLabel("Overview kind").xy(1, row);
            builder.add(overviewKindCombo).xyw(3, row, 3);
        } catch (NoClassDefFoundError ncdfe) {
        }

        final JCheckBox useScrollLayout = new JCheckBox("Uses scroll layout");
        useScrollLayout.setSelected(false);
        useScrollLayout.addActionListener(actionEvent -> jtp
                .setTabLayoutPolicy(useScrollLayout.isSelected() ? JTabbedPane.SCROLL_TAB_LAYOUT
                        : JTabbedPane.WRAP_TAB_LAYOUT));
        row += 2;
        builder.addLabel("Layout").xy(1, row);
        builder.add(useScrollLayout).xyw(3, row, 3);

        final JComboBox<TabContentPaneBorderKind> contentBorderCombo = new JComboBox<>(new TabContentPaneBorderKind[] {
                        TabContentPaneBorderKind.DOUBLE_FULL, TabContentPaneBorderKind.SINGLE_FULL,
                        TabContentPaneBorderKind.DOUBLE_PLACEMENT,
                        TabContentPaneBorderKind.SINGLE_PLACEMENT });
        contentBorderCombo.setSelectedItem(TabContentPaneBorderKind.DOUBLE_FULL);
        contentBorderCombo.addActionListener(actionEvent -> {
            TabContentPaneBorderKind contentBorderKind = (TabContentPaneBorderKind) contentBorderCombo
                    .getSelectedItem();
            RadianceThemingCortex.ComponentScope.setTabContentPaneBorderKind(jtp, contentBorderKind);
            jtp.updateUI();
            jtp.repaint();
        });
        row += 2;
        builder.addLabel("Content border").xy(1, row);
        builder.add(contentBorderCombo).xyw(3, row, 3);

        JButton enableAll = new JButton("+ all");
        enableAll.addActionListener(actionEvent -> {
            for (int i = 0; i < jtp.getTabCount(); i++) {
                jtp.setEnabledAt(i, true);
            }
        });

        JButton disableAll = new JButton("- all");
        disableAll.addActionListener(actionEvent -> {
            for (int i = 0; i < jtp.getTabCount(); i++) {
                jtp.setEnabledAt(i, false);
            }
        });

        row += 2;
        builder.addLabel("Enable all").xy(1, row);
        builder.add(enableAll).xy(3, row);
        builder.add(disableAll).xy(5, row);

        JButton closeAllEnabled = new JButton("Close");
        closeAllEnabled.addActionListener(actionEvent -> {
            Set<Component> toRemove = new HashSet<>();
            for (int i = 0; i < jtp.getTabCount(); i++) {
                if (jtp.isEnabledAt(i))
                    toRemove.add(jtp.getComponentAt(i));
            }
            for (Component comp : toRemove)
                jtp.remove(comp);
        });

        JButton restoreClosed = new JButton("Restore");
        restoreClosed.addActionListener(actionEvent -> {
            for (Component tnp : closed) {
                jtp.addTab("restored", tnp);
            }
        });

        row += 2;
        builder.addLabel("Close all").xy(1, row);
        builder.add(closeAllEnabled).xy(3, row);
        builder.add(restoreClosed).xy(5, row);

        row += 2;
        builder.addSeparator("Single Tab").xyw(1, row, 5);

        final JComboBox<Integer> tabSelectorCombo = new JComboBox<>(new TabComboBoxModel(this.jtp));
        //tabSelectorCombo.setRenderer(new TabCellRenderer());
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
        builder.addLabel("Select").xy(1, row);
        builder.add(tabSelectorCombo).xyw(3, row, 3);

        final JButton markAsModified = new JButton("-> modified");
        markAsModified.addActionListener(actionEvent -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            if ((comp != null) && (comp instanceof JComponent)) {
                RadianceThemingCortex.ComponentScope.setTabContentsModified((JComponent) comp, true);
            }
        });
        final JButton markAsUnmodified = new JButton("-> unmodified");
        markAsUnmodified.addActionListener(actionEvent -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            if ((comp != null) && (comp instanceof JComponent)) {
                RadianceThemingCortex.ComponentScope.setTabContentsModified((JComponent) comp, false);
            }
        });
        row += 2;
        builder.addLabel("Modified").xy(1, row);
        builder.add(markAsModified).xy(3, row);
        builder.add(markAsUnmodified).xy(5, row);

        final JButton runModifiedAnimOnClose = new JButton("Animate on X");
        runModifiedAnimOnClose.addActionListener(actionEvent -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            if ((comp != null) && (comp instanceof JComponent)) {
                JComponent jc = (JComponent) comp;
                RadianceThemingCortex.ComponentScope.setRunModifiedAnimationOnTabCloseButton(jc, true);
            }
        });
        final JButton runModifiedAnimOnTab = new JButton("Animate on tab");
        runModifiedAnimOnTab.addActionListener(actionEvent -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            if ((comp != null) && (comp instanceof JComponent)) {
                JComponent jc = (JComponent) comp;
                RadianceThemingCortex.ComponentScope.setRunModifiedAnimationOnTabCloseButton(jc, false);
            }
        });
        row += 2;
        builder.add(runModifiedAnimOnClose).xy(3, row);
        builder.add(runModifiedAnimOnTab).xy(5, row);

        final JButton showCloseButton = new JButton("+ close button");
        showCloseButton.addActionListener(actionEvent -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            if ((comp != null) && (comp instanceof JComponent)) {
                JComponent jc = (JComponent) comp;
                RadianceThemingCortex.ComponentScope.setTabCloseButtonVisible(jc, true);
                jtp.repaint();
            }
        });
        final JButton hideCloseButton = new JButton("- close button");
        hideCloseButton.addActionListener(actionEvent -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            if ((comp != null) && (comp instanceof JComponent)) {
                JComponent jc = (JComponent) comp;
                RadianceThemingCortex.ComponentScope.setTabCloseButtonVisible(jc, false);
                jtp.repaint();
            }
        });

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            Component comp = jtp.getComponentAt((Integer) tabSelectorCombo.getSelectedItem());
            jtp.removeTabAt((Integer) tabSelectorCombo.getSelectedItem());
            closed.add(comp);
            jtp.repaint();
        }));

        JButton selectButton = new JButton("Select");
        selectButton.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            if (tabSelectorCombo.getSelectedItem() == null)
                return;
            jtp.setSelectedIndex((Integer) tabSelectorCombo.getSelectedItem());
        }));
        row += 2;
        builder.addLabel("Tab op").xy(1, row);
        builder.add(closeButton).xy(3, row);
        builder.add(selectButton).xy(5, row);

        row += 2;
        builder.addSeparator("Close Button Single").xyw(1, row, 5);

        row += 2;
        builder.addLabel("Visible").xy(1, row);
        builder.add(showCloseButton).xy(3, row);
        builder.add(hideCloseButton).xy(5, row);

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
        this.closed = new LinkedList<>();

        this.setLayout(new BorderLayout());
        JPanel contents = getContents(jtp, previewPainter);
        contents.setOpaque(false);
        RadianceThemingCortex.ComponentOrParentScope.setButtonIgnoreMinimumSize(contents, true);
        this.add(contents, BorderLayout.CENTER);
    }
}
