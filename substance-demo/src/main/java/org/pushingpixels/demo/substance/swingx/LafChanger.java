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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LafChanger implements ActionListener {
    private JFrame frame;

    private String lafClassName;

    public static JMenuItem getMenuItem(JFrame frame, String lafName, String lafClassName) {
        JMenuItem result = new JMenuItem(lafName);
        result.addActionListener(new LafChanger(frame, lafClassName));
        return result;
    }

    public LafChanger(JFrame frame, String lafClassName) {
        super();
        this.frame = frame;
        this.lafClassName = lafClassName;
    }

    public void actionPerformed(ActionEvent e) {
        SwingUtilities.invokeLater(() -> {
            boolean was_wm_decorated = !frame.isUndecorated();

            try {
                UIManager.setLookAndFeel(lafClassName);
                SwingUtilities.updateComponentTreeUI(frame);
            } catch (ClassNotFoundException cnfe) {
                out("LAF main class '" + lafClassName + "' not found");
            } catch (Exception exc) {
                exc.printStackTrace();
            }

            if (JFrame.isDefaultLookAndFeelDecorated()) {
                boolean is_wm_decorated = !UIManager.getLookAndFeel()
                        .getSupportsWindowDecorations();
                if (is_wm_decorated != was_wm_decorated) {
                    out("Changing decoration policy\n");
                    frame.setVisible(false);
                    frame.dispose();
                    frame.setUndecorated(!is_wm_decorated);
                    frame.pack();
                    frame.setVisible(true);
                    was_wm_decorated = !frame.isUndecorated();
                }
            }
        });
    }

    private static void out(Object obj) {
        try {
            System.out.println(obj);
        } catch (Exception exc) {
            // ignore - is thrown on Mac in WebStart (security access)
        }
    }
}