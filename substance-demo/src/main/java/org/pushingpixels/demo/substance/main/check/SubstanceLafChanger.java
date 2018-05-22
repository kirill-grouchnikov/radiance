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

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

/**
 * @author kirillg
 * @author Daniel Stonier
 * @author Keith Woodward
 */
public class SubstanceLafChanger implements ActionListener {
    private JFrame frame;

    private String lafClassName;

    private boolean wasOriginallyDecoratedByOS;

    public static JMenuItem getMenuItem(JFrame frame, String lafName, String lafClassName) {
        JMenuItem result = new JMenuItem(lafName);
        result.addActionListener(new SubstanceLafChanger(frame, lafClassName));
        return result;
    }

    public SubstanceLafChanger(JFrame frame, String lafClassName) {
        super();
        this.frame = frame;
        this.lafClassName = lafClassName;
        this.wasOriginallyDecoratedByOS = !frame.isUndecorated();
    }

    public void actionPerformed(ActionEvent e) {
        SwingUtilities.invokeLater(() -> {
            final boolean wasDecoratedByOS = !frame.isUndecorated();

            try {
                UIManager.setLookAndFeel(lafClassName);
                for (Window window : Window.getWindows()) {
                    SwingUtilities.updateComponentTreeUI(window);
                }

                boolean canBeDecoratedByLAF = UIManager.getLookAndFeel()
                        .getSupportsWindowDecorations();
                if (canBeDecoratedByLAF == wasDecoratedByOS) {
                    boolean wasVisible = frame.isVisible();

                    frame.setVisible(false);
                    frame.dispose();
                    if (!canBeDecoratedByLAF || wasOriginallyDecoratedByOS) {
                        // see the java docs under the method
                        // JFrame.setDefaultLookAndFeelDecorated(boolean
                        // value) for description of these 2 lines:
                        frame.setUndecorated(false);
                        frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);

                    } else {
                        frame.setUndecorated(true);
                        frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
                    }
                    frame.setVisible(wasVisible);

                    UIDefaults uid = UIManager.getLookAndFeelDefaults();
                    Enumeration<Object> newKeys = uid.keys();

                    while (newKeys.hasMoreElements()) {
                        Object key = newKeys.nextElement();
                        if (key instanceof String) {
                            if (((String) key).indexOf("AATextInfoPropertyKey") >= 0) {
                                Object value = uid.get(key);
                                System.out.println(key + " : " + value);
                            }
                        }
                    }
                    // wasDecoratedByOS = !frame.isUndecorated();
                }
            } catch (ClassNotFoundException cnfe) {
                out("LAF main class '" + lafClassName + "' not found");
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        });
    }

    public static void out(Object obj) {
        try {
            System.out.println(obj);
        } catch (Exception exc) {
            // ignore - is thrown on Mac in WebStart (security access)
        }
    }
}