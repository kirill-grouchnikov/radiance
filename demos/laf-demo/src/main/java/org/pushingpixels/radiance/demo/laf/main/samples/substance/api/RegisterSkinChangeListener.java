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
package org.pushingpixels.radiance.demo.laf.main.samples.substance.api;

import org.pushingpixels.radiance.laf.api.RadianceLafCortex;
import org.pushingpixels.radiance.laf.api.skin.BusinessBlackSteelSkin;
import org.pushingpixels.radiance.laf.api.skin.SkinChangeListener;
import org.pushingpixels.radiance.laf.api.skin.SkinInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.Vector;

/**
 * Test application that shows the use of the
 * {@link RadianceLafCortex.GlobalScope#registerSkinChangeListener(SkinChangeListener)} API.
 * 
 * @author Kirill Grouchnikov
 * @see RadianceLafCortex.GlobalScope#registerSkinChangeListener(SkinChangeListener)
 */
public class RegisterSkinChangeListener extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public RegisterSkinChangeListener() {
        super("Register skin change listener");

        this.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new FlowLayout());

        // Get all skin display names and set the vector as a model
        // for combobox.
        final JComboBox<String> cb = new JComboBox<>(
                new Vector<>(RadianceLafCortex.GlobalScope.getAllSkins().keySet()));
        cb.setSelectedIndex(-1);

        cb.addItemListener(itemEvent -> {
            // Get the affected item
            final Object item = itemEvent.getItem();

            if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                SwingUtilities.invokeLater(() -> {
                    try {
                        // Get the skin info object based on the selected skin display name
                        SkinInfo skinInfo = RadianceLafCortex.GlobalScope.getAllSkins().get(item);
                        // Set the global skin based on the skin class name.
                        RadianceLafCortex.GlobalScope.setSkin(skinInfo.getClassName());
                        SwingUtilities.updateComponentTreeUI(RegisterSkinChangeListener.this);
                    } catch (Exception exc) {
                    }
                });
            }
        });

        panel.add(new JLabel("All skins:"));
        panel.add(cb);

        this.add(panel, BorderLayout.CENTER);

        // register listener to show a dialog with skin changed message.
        RadianceLafCortex.GlobalScope
                .registerSkinChangeListener(() -> SwingUtilities.invokeLater(() -> JOptionPane
                        .showMessageDialog(RegisterSkinChangeListener.this, "Skin changed")));

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
            RadianceLafCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new RegisterSkinChangeListener().setVisible(true);
        });
    }
}
