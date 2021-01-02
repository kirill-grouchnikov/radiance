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
package org.pushingpixels.demo.substance.main;

import org.pushingpixels.demo.substance.main.check.selector.SubstanceSkinSelector;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.combo.WidestComboPopupPrototype;
import org.pushingpixels.substance.api.skin.SkinInfo;
import org.pushingpixels.substance.api.skin.SubstanceNightShadeLookAndFeel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class TestFrame extends JFrame {
    private JToolBar toolbar;

    public TestFrame() {
        super("Substance skeleton");

        setLayout(new BorderLayout());
        toolbar = Check.getToolbar(22, false);
        this.add(toolbar, BorderLayout.NORTH);

        JPanel statusBar = getStatusBar();
        this.add(statusBar, BorderLayout.SOUTH);

        setPreferredSize(new Dimension(400, 400));
        this.setSize(getPreferredSize());
        setMinimumSize(getPreferredSize());

        // sample menu bar
        JMenuBar jmb = new JMenuBar();
        jmb.add(new JMenu("File"));
        jmb.add(new JMenu("Edit"));
        jmb.add(new JMenu("Source"));
        jmb.add(new JMenu("Refactor"));
        jmb.add(new JMenu("Navigate"));
        jmb.add(new JMenu("Search"));
        jmb.add(new JMenu("Project"));

        setJMenuBar(jmb);

    }

    private JPanel getStatusBar() {
        JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        statusBar.setBorder(new EmptyBorder(4, 5, 4, 5));

        ComponentOrParentChainScope.setDecorationType(statusBar,
                DecorationAreaType.FOOTER);

        SubstanceSkinSelector skinSelector = new SubstanceSkinSelector();
        SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(skinSelector,
                SwingUtilities.NORTH);
        SubstanceCortex.ComponentScope.setComboBoxPrototypeCallback(skinSelector,
                new WidestComboPopupPrototype<SkinInfo>());
        skinSelector.setToolTipText("Substance skin");
        statusBar.add(skinSelector);

        return statusBar;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                LookAndFeel laf = new SubstanceNightShadeLookAndFeel();
                UIManager.setLookAndFeel(laf);
            } catch (Exception e) {
                e.printStackTrace();
            }

            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);

            TestFrame c = new TestFrame();
            RadianceLogo.configureOn(c);

            c.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    super.componentResized(e);
                    ((JFrame) e.getComponent()).getRootPane().repaint();
                }
            });
            c.setPreferredSize(new Dimension(600, 400));
            c.setMinimumSize(new Dimension(150, 100));
            c.pack();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            // center the frame in the physical screen
            c.setLocation((d.width - c.getWidth()) / 2, (d.height - c.getHeight()) / 2);

            c.setVisible(true);
            c.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        });
    }

}
