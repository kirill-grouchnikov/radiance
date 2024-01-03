/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.samples.theming.api;

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;
import org.pushingpixels.radiance.theming.api.skin.SkinChangeListener;
import org.pushingpixels.radiance.theming.api.skin.SkinInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.Vector;

/**
 * Test application that shows the use of the
 * {@link RadianceThemingCortex.GlobalScope#registerSkinChangeListener(SkinChangeListener)} API.
 * 
 * @author Kirill Grouchnikov
 * @see RadianceThemingCortex.GlobalScope#registerSkinChangeListener(SkinChangeListener)
 */
public class UnregisterSkinChangeListener extends JFrame {
    /**
     * Listener instance.
     */
    private SkinChangeListener listener;

    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public UnregisterSkinChangeListener() {
        super("Register skin change listener");

        this.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new FlowLayout());

        // Get all skin display names and set the vector as a model
        // for combobox.
        final JComboBox<String> cb = new JComboBox<>(
                new Vector<>(RadianceThemingCortex.GlobalScope.getAllSkins().keySet()));
        cb.setSelectedIndex(-1);

        cb.addItemListener(itemEvent -> {
            // Get the affected item
            final String item = (String) itemEvent.getItem();

            if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                SwingUtilities.invokeLater(() -> {
                    try {
                        // Get the skin info object based on
                        // the selected skin display name
                        SkinInfo skinInfo = RadianceThemingCortex.GlobalScope.getAllSkins().get(item);
                        // Set the global skin based on the
                        // skin class name.
                        RadianceThemingCortex.GlobalScope.setSkin(skinInfo.getClassName());
                        SwingUtilities.updateComponentTreeUI(UnregisterSkinChangeListener.this);
                    } catch (Exception exc) {
                    }
                });
            }
        });

        panel.add(new JLabel("All skins:"));
        panel.add(cb);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        final JButton unregisterListener = new JButton("Unregister listener");
        unregisterListener.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            unregisterListener.setEnabled(false);
            // unregister listener
            RadianceThemingCortex.GlobalScope.unregisterSkinChangeListener(listener);
        }));
        controls.add(unregisterListener);
        this.add(controls, BorderLayout.SOUTH);

        this.add(panel, BorderLayout.CENTER);

        // register listener
        RadianceThemingCortex.GlobalScope.registerSkinChangeListener(listener = () -> {
            // show dialog with skin changed message.
            SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(UnregisterSkinChangeListener.this, "Skin changed"));
        });

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * The main method for <code>this</code> sample. The arguments are ignored.
     * 
     * @param args
     *            Ignored.
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new UnregisterSkinChangeListener().setVisible(true);
        });
    }
}
