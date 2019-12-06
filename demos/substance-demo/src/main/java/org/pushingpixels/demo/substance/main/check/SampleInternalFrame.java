/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.substance.main.check;

import org.pushingpixels.demo.substance.main.RadianceLogo;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.LinkedList;

/**
 * Internal frame for the test application.
 * 
 * @author Kirill Grouchnikov
 */
public class SampleInternalFrame extends JInternalFrame {
    /**
     * Creates the test internal frame.
     */
    public SampleInternalFrame() {
        this.setLayout(new BorderLayout());
        JTabbedPane tabbed = new JTabbedPane();
        this.add(tabbed, BorderLayout.CENTER);

        tabbed.addTab("Regular", new JPanel());

        JPanel samplePanel = new JPanel(new BorderLayout());
        TestFormLayoutBuilder builder = new TestFormLayoutBuilder(
                "fill:default:grow(1), 4dlu, fill:default:grow(1)", 2, 4)
                .border(new EmptyBorder(2, 2, 2, 2));

        JCheckBox cb1 = new JCheckBox("Enabled selected");
        cb1.setSelected(true);
        JCheckBox cb2 = new JCheckBox("Disabled selected");
        cb2.setSelected(true);
        cb2.setEnabled(false);
        JCheckBox cb3 = new JCheckBox("Enabled unselected");
        // cb3.setEnabled(false);
        JRadioButton rb1 = new JRadioButton("Enabled selected");
        rb1.setSelected(true);
        JRadioButton rb2 = new JRadioButton("Disabled selected");
        rb2.setSelected(true);
        rb2.setEnabled(false);
        JRadioButton rb3 = new JRadioButton("Enabled unselected");
        // rb3.setEnabled(false);

        builder.append(cb1, rb1);
        builder.append(cb2, rb2);
        builder.append(cb3, rb3);
        JComboBox combo = new JComboBox(new Object[] { "item1", "item2", "item3", "item4" });
        combo.setSelectedIndex(0);
        combo.setEditable(true);
        JTextField text = new JTextField("Text field");
        text.setEditable(false);
        builder.append(combo, text);
        JPanel contentPanel = builder.build();
        contentPanel.setPreferredSize(new Dimension(contentPanel.getPreferredSize().width,
                contentPanel.getPreferredSize().height + 100));
        contentPanel.setBorder(null);

        JScrollPane scroll = new JScrollPane(contentPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        scroll.setBorder(new EmptyBorder(0, 0, 0, 0));
        samplePanel.add(scroll, BorderLayout.CENTER);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton prev = new JButton("prev");
        JButton cancel = new JButton("cancel");
        cancel.setEnabled(false);
        JButton ok = new JButton("OK");
        buttons.add(prev);
        buttons.add(cancel);
        buttons.add(ok);

        samplePanel.add(buttons, BorderLayout.SOUTH);

        tabbed.addTab("Sample", samplePanel);
        tabbed.setSelectedComponent(samplePanel);
        tabbed.setOpaque(false);
        JMenuBar jmb = new JMenuBar();
        jmb.add(SampleMenuFactory.getSkinMenu());

        JMenu jm1 = new JMenu("Menu1");
        jm1.setMnemonic('1');
        int mcount = 0;
        for (LinkedList<JMenuItem> miList : SampleMenuFactory.getTestMenuItems()) {
            if (mcount > 0) {
                if (mcount % 2 == 0)
                    jm1.addSeparator();
                else
                    jm1.add(new JSeparator());
            }
            for (JMenuItem menuItem : miList) {
                jm1.add(menuItem);
            }
            mcount++;
        }
        jmb.add(jm1);
        this.setJMenuBar(jmb);

        this.setClosable(true);
        this.setMaximizable(true);
        this.setIconifiable(true);
        this.setResizable(true);

        synchronize();
        SubstanceCortex.GlobalScope.registerSkinChangeListener(this::synchronize);
        ok.requestFocusInWindow();
    }

    /**
     * Synchronizes the frame icon with the current theme.
     */
    protected void synchronize() {
        SwingUtilities.invokeLater(() -> {
            if (UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel) {
                SubstanceSkin currentSkin = SubstanceCortex.ComponentScope
                        .getCurrentSkin(getRootPane());
                setFrameIcon(RadianceLogo.getLogoIcon(
                        currentSkin.getColorScheme(DecorationAreaType.SECONDARY_TITLE_PANE,
                                ColorSchemeAssociationKind.FILL, ComponentState.ENABLED)));
                setTitle(currentSkin.getDisplayName());
            }
        });
    }
}
