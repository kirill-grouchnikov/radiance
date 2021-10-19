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
package org.pushingpixels.radiance.demo.theming.main;

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.SkinInfo;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;

public class Alignment extends JFrame {
    private JCheckBox toPaintOverlays;

    public Alignment() {
        super("Alignment");

        this.setLayout(new BorderLayout());

        final JTextField textField = new JTextField("test");
        JFormattedTextField fTextField = new JFormattedTextField("test");
        JPasswordField passField = new JPasswordField("test");
        JSpinner spinner = new JSpinner(
                new SpinnerListModel(new Object[] { "test1", "test", "test2" }));
        spinner.setValue("test");
        JComboBox<String> editableCombo = new JComboBox<>(new String[] { "test" }) {
            @Override
            public void updateUI() {
                super.updateUI();
                ((JTextField) getEditor().getEditorComponent()).setColumns(3);
            }
        };
        editableCombo.setEditable(true);
        final JButton button = new JButton("test");
        JComboBox<String> combo = new JComboBox<>(new String[] { "test" });

        JPanel content = new JPanel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                if (toPaintOverlays.isSelected()) {
                    Rectangle buttonBounds = button.getBounds();
                    Rectangle textFieldBounds = button.getBounds();
                    int textFieldBaseline = textField.getBaseline(textFieldBounds.width,
                            textFieldBounds.height);
                    g.setColor(new Color(255, 0, 0, 196));
                    g.drawLine(0, buttonBounds.y, getWidth(), buttonBounds.y);
                    g.drawLine(0, buttonBounds.y + buttonBounds.height, getWidth(),
                            buttonBounds.y + buttonBounds.height);
                    g.setColor(new Color(0, 128, 0, 196));
                    g.drawLine(0, textFieldBounds.y + textFieldBaseline, getWidth(),
                            textFieldBounds.y + textFieldBaseline);
                }
            }
        };
        content.setLayout(new BorderLayout());

        FormBuilder builder = FormBuilder.create().
                columns("pref,2dlu,pref,2dlu,pref,2dlu,pref,2dlu,pref,2dlu,pref,2dlu,pref,2dlu").
                rows("p").
                padding(Paddings.DIALOG);

        builder.add(textField).xy(1, 1);
        builder.add(fTextField).xy(3, 1);
        builder.add(passField).xy(5, 1);
        builder.add(spinner).xy(7, 1);
        builder.add(editableCombo).xy(9, 1);
        builder.add(combo).xy(11, 1);
        builder.add(button).xy(13, 1);

        content.add(builder.build(), BorderLayout.CENTER);

        // FocusManager.setCurrentManager(null);

        this.add(content, BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        final LookAndFeelInfo[] lafs = UIManager.getInstalledLookAndFeels();
        final String[] lafNames = new String[lafs.length];
        for (int i = 0; i < lafs.length; i++) {
            lafNames[i] = lafs[i].getName();
        }
        final JComboBox<String> lafSwitchCombo = new JComboBox<>(lafNames);
        for (LookAndFeelInfo lafi : lafs) {
            if (UIManager.getLookAndFeel().getName().equals(lafi.getName())) {
                lafSwitchCombo.setSelectedItem(lafi.getName());
                break;
            }
        }
        lafSwitchCombo.addItemListener(itemEvent -> SwingUtilities.invokeLater(() -> {
            String selected = (String) lafSwitchCombo.getSelectedItem();
            LookAndFeelInfo matchingLafInfo = null;
            for (int i = 0; i < lafs.length; i++) {
                if (lafs[i].getName().equals(selected)) {
                    matchingLafInfo = lafs[i];
                    break;
                }
            }

            if (selected.startsWith("Radiance")) {
                RadianceThemingCortex.GlobalScope.setSkin(matchingLafInfo.getClassName());
            } else {
                try {
                    UIManager.setLookAndFeel(matchingLafInfo.getClassName());
                    for (Window w : Window.getWindows()) {
                        SwingUtilities.updateComponentTreeUI(w);
                    }
                } catch (Exception exc) {
                    System.out.println(
                            "Look-and-feel " + matchingLafInfo.getName() + " not found");
                }
            }
        }));

        toPaintOverlays = new JCheckBox("paint overlays");
        toPaintOverlays.addActionListener(actionEvent -> Alignment.this.repaint());

        controls.add(toPaintOverlays);
        controls.add(lafSwitchCombo);

        lafSwitchCombo.requestFocus();
        this.add(controls, BorderLayout.SOUTH);

        this.setSize(450, 125);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        UIManager.installLookAndFeel("JGoodies Plastic",
                "com.jgoodies.looks.plastic.PlasticLookAndFeel");
        UIManager.installLookAndFeel("JGoodies PlasticXP",
                "com.jgoodies.looks.plastic.PlasticXPLookAndFeel");
        UIManager.installLookAndFeel("JGoodies Plastic3D",
                "com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
        UIManager.installLookAndFeel("JGoodies Windows",
                "com.jgoodies.looks.windows.WindowsLookAndFeel");

        UIManager.installLookAndFeel("Synthetica base",
                "de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel");
        UIManager.installLookAndFeel("Synthetica BlackEye",
                "de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel");
        UIManager.installLookAndFeel("Synthetica BlackMoon",
                "de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel");
        UIManager.installLookAndFeel("Synthetica BlackStar",
                "de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel");
        UIManager.installLookAndFeel("Synthetica BlueIce",
                "de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel");
        UIManager.installLookAndFeel("Synthetica BlueMoon",
                "de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel");
        UIManager.installLookAndFeel("Synthetica BlueSteel",
                "de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel");
        UIManager.installLookAndFeel("Synthetica GreenDream",
                "de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel");
        UIManager.installLookAndFeel("Synthetica MauveMetallic",
                "de.javasoft.plaf.synthetica.SyntheticaMauveMetallicLookAndFeel");
        UIManager.installLookAndFeel("Synthetica OrangeMetallic",
                "de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel");
        UIManager.installLookAndFeel("Synthetica SkyMetallic",
                "de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel");
        UIManager.installLookAndFeel("Synthetica SilverMoon",
                "de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel");
        UIManager.installLookAndFeel("Synthetica WhiteVision",
                "de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel");
        UIManager.installLookAndFeel("Synthetica Simple2D",
                "de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel");

        UIManager.installLookAndFeel("A03", "a03.swing.plaf.A03LookAndFeel");
        UIManager.installLookAndFeel("Liquid", "com.birosoft.liquid.LiquidLookAndFeel");
        UIManager.installLookAndFeel("Napkin", "net.sourceforge.napkinlaf.NapkinLookAndFeel");
        UIManager.installLookAndFeel("Pagosoft", "com.pagosoft.plaf.PgsLookAndFeel");
        UIManager.installLookAndFeel("Squareness", "net.beeger.squareness.SquarenessLookAndFeel");

        for (SkinInfo sInfo : RadianceThemingCortex.GlobalScope.getAllSkins().values()) {
            UIManager.installLookAndFeel("Radiance " + sInfo.getDisplayName(),
                    sInfo.getClassName());
        }

        SwingUtilities.invokeLater(() -> new Alignment().setVisible(true));
    }

}
