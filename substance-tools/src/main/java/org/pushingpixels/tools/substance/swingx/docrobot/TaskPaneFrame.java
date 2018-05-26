/*
 * Copyright 2005-2008 Kirill Grouchnikov, based on work by
 * Sun Microsystems, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.pushingpixels.tools.substance.swingx.docrobot;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;
import org.jdesktop.swingx.JXHyperlink;
import org.jdesktop.swingx.JXTaskPane;
import org.jdesktop.swingx.JXTaskPaneContainer;
import org.pushingpixels.substance.api.SubstanceSlices.MenuGutterFillKind;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultListCellRenderer;
import org.pushingpixels.substance.api.skin.SubstanceBusinessBlackSteelLookAndFeel;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

import javax.swing.*;
import java.awt.*;

public class TaskPaneFrame extends JFrame {
    public TaskPaneFrame() {
        super("JXTaskPane example");

        this.setLayout(new BorderLayout());

        JXTaskPaneContainer container = new JXTaskPaneContainer();

        JXTaskPane taskPane1 = new JXTaskPane();
        taskPane1.setTitle("Task pane 1");
        // taskPane1.setSpecial(true);
        container.add(taskPane1);

        FormLayout lm = new FormLayout("right:pref, 4dlu, fill:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm);

        builder.appendSeparator("Miscellaneous");

        final JCheckBox useThemedDefaultIconsCheckBox = new JCheckBox("themed icons");
        useThemedDefaultIconsCheckBox
                .setSelected(SubstanceCoreUtilities.useThemedDefaultIcon(null));
        builder.append("Themed icons", useThemedDefaultIconsCheckBox);

        final JCheckBox useConstantThemesOnDialogs = new JCheckBox("constant themes");
        useConstantThemesOnDialogs
                .setSelected(SubstanceCoreUtilities.shouldUseThemedIconsOnOptionPanes());
        builder.append("Option pane icons", useConstantThemesOnDialogs);

        final JComboBox placementCombo = new JComboBox(
                new Object[] { "top", "bottom", "left", "right" });
        builder.append("Placement", placementCombo);

        final JComboBox menuGutterFillCombo = new JComboBox(new Object[] { MenuGutterFillKind.NONE,
                        MenuGutterFillKind.SOFT, MenuGutterFillKind.HARD,
                        MenuGutterFillKind.SOFT_FILL, MenuGutterFillKind.HARD_FILL });
        menuGutterFillCombo.setRenderer(new SubstanceDefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                MenuGutterFillKind mgfk = (MenuGutterFillKind) value;
                return super.getListCellRendererComponent(list, mgfk.name().toLowerCase(), index,
                        isSelected, cellHasFocus);
            }
        });
        menuGutterFillCombo.setSelectedItem(SubstanceCoreUtilities.getMenuGutterFillKind());
        builder.append("Menu fill", menuGutterFillCombo);

        taskPane1.add(builder.getPanel());

        JXTaskPane taskPane2 = new JXTaskPane();
        taskPane2.setTitle("Task pane 2");
        container.add(taskPane2);

        JXHyperlink link = new JXHyperlink();
        link.setText("Hyper link");
        taskPane2.add(link);

        JXTaskPane taskPane3 = new JXTaskPane();
        taskPane3.setTitle("Collapsed");
        taskPane3.setCollapsed(true);
        container.add(taskPane3);

        this.add(container, BorderLayout.WEST);

        JMenuBar jmb = new JMenuBar();
        jmb.add(new JMenu("File"));
        jmb.add(new JMenu("Edit"));
        jmb.add(new JMenu("Source"));
        jmb.add(new JMenu("Refactor"));
        jmb.add(new JMenu("Navigate"));
        jmb.add(new JMenu("Search"));
        jmb.add(new JMenu("Project"));
        this.setJMenuBar(jmb);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) throws Exception {
        JFrame.setDefaultLookAndFeelDecorated(true);
        UIManager.setLookAndFeel(new SubstanceBusinessBlackSteelLookAndFeel());
        SwingUtilities.invokeLater(() -> new TaskPaneFrame().setVisible(true));
    }
}
