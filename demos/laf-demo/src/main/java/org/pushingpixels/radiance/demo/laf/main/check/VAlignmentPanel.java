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
package org.pushingpixels.radiance.demo.laf.main.check;

import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.laf.api.RadianceLafCortex;
import org.pushingpixels.radiance.laf.api.RadianceLookAndFeel;
import org.pushingpixels.radiance.laf.api.skin.BusinessBlackSteelSkin;

import javax.swing.*;
import javax.swing.text.StyleContext;
import java.awt.*;

public class VAlignmentPanel extends ControllablePanel implements Deferrable {
    private boolean isInitialized;
    private JCheckBox toPaintGuiderLines;
    private JCheckBox toPaintBounds;

    @Override
    public boolean isInitialized() {
        return this.isInitialized;
    }

    public VAlignmentPanel() {
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

        TestFormLayoutBuilder controlPanelBuilder = new TestFormLayoutBuilder("fill:pref:grow", 1, 2);

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
        final JPanel result = new JPanel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);

                Graphics2D g2d = (Graphics2D) g.create();
                if (toPaintGuiderLines.isSelected()) {
                    int w = getWidth();
                    int h = getHeight();
                    for (int x = 0; x < w; x += 4) {
                        if (x % 20 == 0) {
                            g2d.setColor(new Color(240, 0, 0, 128));
                        } else {
                            g2d.setColor(new Color(0, 0, 255, 64));
                        }
                        g2d.drawLine(x, 0, x, h);
                    }
                    for (int y = 0; y < h; y += 4) {
                        if (y % 20 == 0) {
                            g2d.setColor(new Color(240, 0, 0, 128));
                        } else {
                            g2d.setColor(new Color(0, 0, 255, 64));
                        }
                        g2d.drawLine(0, y, w, y);
                    }
                }

                if (toPaintBounds.isSelected()) {
                    for (int i = 0; i < getComponentCount(); i++) {
                        Component child = getComponent(i);
                        Rectangle bounds = child.getBounds();
                        g2d.setColor(new Color(128, 0, 255, 128));
                        g2d.fill(bounds);
                    }
                }
                g2d.dispose();
            }
        };
        result.setLayout(new BorderLayout());

        TestFormLayoutBuilder builder = new TestFormLayoutBuilder("left:pref", 1, 9)
                .padding(Paddings.DIALOG);

        String fontName = "Tahoma";
        Font font = new Font(fontName, Font.PLAIN, size);
        if (UIManager.getLookAndFeel() instanceof RadianceLookAndFeel) {
            // Control font we're getting from Substance's font policy is marked as a
            // UIResource. A font derived from such a font is not guaranteed to not be
            // a UIResource. As we don't want Substance to reset larger fonts back to the
            // default (which it can at any point in time if the application-provided font
            // is a UIResource), create a non-UIResource base font explicitly.
            Font controlFont = RadianceLafCortex.GlobalScope.getFontPolicy().getFontSet()
                    .getControlFont();
            Font base = StyleContext.getDefaultStyleContext().getFont(controlFont.getFamily(),
                    controlFont.getStyle(), controlFont.getSize());
            fontName = base.getFamily();
            font = base.deriveFont((float) size);
        }

        JLabel label = new JLabel(fontName + " " + size);
        label.setFont(font);
        builder.append(label);

        JRadioButton radio = new JRadioButton("sample");
        radio.setFont(font);
        builder.append(radio);

        JCheckBox check = new JCheckBox("sample");
        check.setFont(font);
        builder.append(check);

        JButton button = new JButton("sample");
        button.setFont(font);
        builder.append(button);

        JComboBox<String> cb = new JComboBox<>(new String[] { "sample" });
        cb.setFont(font);
        builder.append(cb);

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
        builder.append(ecb);

        JSpinner s = new JSpinner(
                new SpinnerListModel(new Object[] { "sample0", "sample", "sample2" }));
        s.getModel().setValue("sample");
        s.setFont(font);
        builder.append(s);

        JTextField tf = new JTextField("sample");
        tf.setFont(font);
        builder.append(tf);

        JPasswordField pf = new JPasswordField("sample");
        pf.setFont(font);
        builder.append(pf);

        result.add(builder.build(), BorderLayout.CENTER);

        SwingUtilities.invokeLater(result::revalidate);

        return result;
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            RadianceLafCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            JFrame frame = new JFrame("Alignment");
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            VAlignmentPanel panel = new VAlignmentPanel();
            panel.initialize();
            frame.add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}
