/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.demo.flamingo.common;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.pushingpixels.flamingo.api.common.JCommandButton;

public class TestCommandButtonsAutoRepeat extends TestCommandButtons {
    @Override
    protected void configureControlPanel(JPanel controlPanel) {
        final JCheckBox autoRepeatActionMode = new JCheckBox("auto repeat action");
        autoRepeatActionMode.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(
                () -> apply(TestCommandButtonsAutoRepeat.this, (JCommandButton button) -> button
                        .setAutoRepeatAction(autoRepeatActionMode.isSelected()))));
        final JCheckBox actionOnRolloverMode = new JCheckBox("action on rollover");
        actionOnRolloverMode.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(
                () -> apply(TestCommandButtonsAutoRepeat.this, (JCommandButton button) -> button
                        .setFireActionOnRollover(actionOnRolloverMode.isSelected()))));
        controlPanel.add(autoRepeatActionMode);
        controlPanel.add(actionOnRolloverMode);
    }

    private static interface Command {
        void apply(JCommandButton button);
    }

    private static void apply(Container cont, Command cmd) {
        for (int i = 0; i < cont.getComponentCount(); i++) {
            Component comp = cont.getComponent(i);
            if (comp instanceof JCommandButton) {
                JCommandButton cb = (JCommandButton) comp;
                cmd.apply(cb);
            }
            if (comp instanceof Container) {
                apply((Container) comp, cmd);
            }
        }
    }

    /**
     * Main method for testing.
     * 
     * @param args
     *            Ignored.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TestCommandButtonsAutoRepeat frame = new TestCommandButtonsAutoRepeat();
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
    }
}
