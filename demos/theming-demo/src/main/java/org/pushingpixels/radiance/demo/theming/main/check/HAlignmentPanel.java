/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.check;

import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.theming.api.RadianceLookAndFeel;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;

import javax.swing.*;
import javax.swing.text.StyleContext;
import java.awt.*;

public class HAlignmentPanel extends ControllablePanel implements Deferrable {
    private boolean isInitialized;
    private JCheckBox toPaintGuiderLines;
    private JCheckBox toPaintBounds;

    @Override
    public boolean isInitialized() {
        return this.isInitialized;
    }

    public HAlignmentPanel() {
        this.setLayout(new BorderLayout());
    }

    @Override
    public synchronized void initialize() {
        TestFormLayoutBuilder builder = new TestFormLayoutBuilder("left:pref:grow", 1, 15)
                .padding(Paddings.DIALOG);

        for (int fontSize = 11; fontSize < 25; fontSize++) {
            builder.append(getSubPanel(fontSize));
        }

        this.add(new JScrollPane(builder.build()));

        TestFormLayoutBuilder controlPanelBuilder = new TestFormLayoutBuilder("fill:pref:grow",
                1, 2);

        toPaintGuiderLines = new JCheckBox("guider lines");
        toPaintGuiderLines.addActionListener(actionEvent -> repaint());
        controlPanelBuilder.append(toPaintGuiderLines);

        toPaintBounds = new JCheckBox("bounds");
        toPaintBounds.addActionListener(actionEvent -> repaint());
        controlPanelBuilder.append(toPaintBounds);
        this.controlPanel = controlPanelBuilder.build();

        this.isInitialized = true;
    }

    private JPanel getSubPanel(int size) {
        final JButton button = new JButton("sample");
        final JTextField tf = new JTextField("sample");

        final JPanel result = new JPanel(new FlowLayout(FlowLayout.LEFT)) {
            @Override
            public void paint(Graphics g) {
                super.paint(g);

                Graphics2D g2d = (Graphics2D) g.create();
                if (toPaintGuiderLines.isSelected()) {
                    Rectangle buttonBounds = button.getBounds();
                    int textFieldBaseline = tf.getBaseline(buttonBounds.width, buttonBounds.height);
                    g2d.setColor(new Color(255, 0, 0, 196));
                    g2d.drawLine(0, buttonBounds.y, getWidth(), buttonBounds.y);
                    g2d.drawLine(0, buttonBounds.y + buttonBounds.height - 1, getWidth(),
                            buttonBounds.y + buttonBounds.height - 1);
                    g2d.setColor(new Color(0, 128, 0, 196));
                    g2d.drawLine(0, buttonBounds.y + textFieldBaseline, getWidth(),
                            buttonBounds.y + textFieldBaseline);
                }

                if (toPaintBounds.isSelected()) {
                    for (int i = 0; i < getComponentCount(); i++) {
                        Component child = getComponent(i);
                        Rectangle bounds = child.getBounds();
                        g2d.setColor(new Color(128, 0, 255, 128));
                        g2d.fill(bounds);

                        // g2d.setFont(child.getFont());
                        // String size = bounds.getWidth() + "*"
                        // + bounds.getHeight();
                        // int sizeWidth =
                        // g2d.getFontMetrics().stringWidth(size);
                        // int sizeHeight = g2d.getFontMetrics().getHeight();
                        // g2d.setColor(new Color(64, 0, 128));
                        // Rectangle buttonBounds = button.getBounds();
                        // int textFieldBaseline = tf.getBaseline(
                        // buttonBounds.width, buttonBounds.height);
                        // g2d.drawString(size, bounds.x
                        // + (bounds.width - sizeWidth) / 2, bounds.y
                        // + textFieldBaseline);
                    }
                }
                g2d.dispose();
            }
        };

        String fontName = "Tahoma";
        Font font = new Font(fontName, Font.PLAIN, size);
        if (UIManager.getLookAndFeel() instanceof RadianceLookAndFeel) {
            // Control font we're getting from Radiance's font policy is marked as a
            // UIResource. A font derived from such a font is not guaranteed to not be
            // a UIResource. As we don't want Radiance to reset larger fonts back to the
            // default (which it can at any point in time if the application-provided font
            // is a UIResource), create a non-UIResource base font explicitly.
            Font controlFont = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet()
                    .getControlFont();
            Font base = StyleContext.getDefaultStyleContext().getFont(controlFont.getFamily(),
                    controlFont.getStyle(), controlFont.getSize());
            fontName = base.getFamily();
            font = base.deriveFont((float) size);
        }

        JLabel label = new JLabel(fontName + " " + size);
        label.setFont(font);
        result.add(label);

        tf.setFont(font);
        result.add(tf);

        JPasswordField pf = new JPasswordField("sample");
        pf.setFont(font);
        result.add(pf);

        JComboBox<String> ecb = new JComboBox<>(new String[] { "sample" }) {
            @Override
            public void updateUI() {
                super.updateUI();
                ((JTextField) getEditor().getEditorComponent()).setColumns(5);
            }
        };
        ecb.setFont(font);
        ecb.setEditable(true);
        // the next line is to make the combobox not too wide
        ecb.setPrototypeDisplayValue("sample");
        result.add(ecb);

        JSpinner s = new JSpinner(
                new SpinnerListModel(new String[] { "sample0", "sample", "sample2" }));
        s.getModel().setValue("sample");
        s.setFont(font);
        result.add(s);

        JComboBox<String> cb = new JComboBox<>(new String[] { "sample" });
        cb.setFont(font);
        result.add(cb);

        button.setFont(font);
        result.add(button);

        JRadioButton radio = new JRadioButton("sample");
        radio.setFont(font);
        result.add(radio);

        JCheckBox check = new JCheckBox("sample");
        check.setFont(font);
        result.add(check);

        SwingUtilities.invokeLater(result::revalidate);

        return result;
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            JFrame frame = new JFrame("Alignment");
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            HAlignmentPanel panel = new HAlignmentPanel();
            panel.initialize();
            frame.add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}
