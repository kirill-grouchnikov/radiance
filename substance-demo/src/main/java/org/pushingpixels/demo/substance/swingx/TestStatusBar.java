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
package org.pushingpixels.demo.substance.swingx;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

import org.jdesktop.swingx.JXStatusBar;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.GraphiteSkin;
import org.pushingpixels.substance.swingx.SubstanceSwingxPlugin;

public class TestStatusBar extends JFrame {
    public TestStatusBar() {
        this.setLayout(new BorderLayout());

        JXStatusBar statusBar = new JXStatusBar();
        this.add(statusBar, BorderLayout.SOUTH);

        final JLabel statusLabel = new JLabel("");
        JXStatusBar.Constraint c1 = new JXStatusBar.Constraint();
        c1.setFixedWidth(100);
        statusBar.add(statusLabel, c1);
        Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
            public void eventDispatched(AWTEvent event) {
                if (event instanceof MouseEvent) {
                    MouseEvent me = (MouseEvent) event;
                    if (me.getID() == MouseEvent.MOUSE_MOVED) {
                        Point p = me.getPoint();
                        statusLabel.setText(p.x + ":" + p.y);
                    }
                }
            }
        }, AWTEvent.MOUSE_MOTION_EVENT_MASK);

        JPanel controls = new JPanel(new FlowLayout());
        final JButton winLaf = new JButton("Native LAF");
        final JButton metalLaf = new JButton("Metal LAF");
        metalLaf.setEnabled(false);
        winLaf.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            try {
                winLaf.setEnabled(false);
                metalLaf.setEnabled(true);
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                SwingUtilities.updateComponentTreeUI(TestStatusBar.this);
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }));
        metalLaf.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            try {
                winLaf.setEnabled(true);
                metalLaf.setEnabled(false);
                UIManager.setLookAndFeel(new MetalLookAndFeel());
                SwingUtilities.updateComponentTreeUI(TestStatusBar.this);
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }));
        controls.add(winLaf);
        controls.add(metalLaf);

        this.add(controls, BorderLayout.CENTER);

        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws Exception {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceCortex.GlobalScope.registerComponentPlugin(new SubstanceSwingxPlugin());

        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new GraphiteSkin());
            new TestStatusBar().setVisible(true);
        });
    }
}
