/*
 * Copyright (c) 2008-2018 Lightbeam Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Lightbeam Kirill Grouchnikov nor the names of
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
package org.pushingpixels.lightbeam.panels;

import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.lightbeam.*;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

/**
 * Test application panel for testing {@link JTextArea}, {@link JTextField}, {@link JTextPane},
 * {@link JPasswordField}, {@link JEditorPane} and {@link JFormattedTextField} components.
 *
 * @author Kirill Grouchnikov
 */
public class TextAreasPanel extends JPanel {
    /**
     * Returns the panel contents.
     *
     * @return The panel contents.
     */
    private JPanel getContents() {
        TestFormLayoutBuilder builder = new TestFormLayoutBuilder(
                "right:pref, 4dlu, fill:default:grow(1), 4dlu,"
                        + "fill:default:grow(1), 4dlu, fill:default:grow(1)", 4, 6)
                .border(Paddings.DIALOG);

        JLabel editorPaneLabel = new JLabel("Editor panes");
        JLabel textAreaLabel = new JLabel("Text areas");
        JLabel textPaneLabel = new JLabel("Text panes");

        builder.append("", editorPaneLabel);
        builder.append(textAreaLabel, textPaneLabel);

        JEditorPane jep1 = new JEditorPane("text/html;", "Sample <b>content</b><br> <u>text</u>");
        builder.append("Enabled", jep1);

        JTextArea jta1 = new JTextArea("Sample content text", 3, 20);
        JTextPane jtp1 = new JTextPane();
        jtp1.replaceSelection("Sample content text");
        jtp1.setPreferredSize(new Dimension(100, 40));
        builder.append(jta1, jtp1);

        JEditorPane jepNotEditable = new JEditorPane("text/html;",
                "Sample <b>content</b><br> <u>text</u>");
        jepNotEditable.setEditable(false);
        builder.append("Not editable", jepNotEditable);

        JTextArea jtaNotEditable = new JTextArea("Sample content text", 3, 20);
        jtaNotEditable.setEditable(false);
        JTextPane jtpNotEditable = new JTextPane();
        jtpNotEditable.replaceSelection("Sample content text");
        jtpNotEditable.setPreferredSize(new Dimension(100, 40));
        jtpNotEditable.setEditable(false);
        builder.append(jtaNotEditable, jtpNotEditable);

        JEditorPane jep3 = new JEditorPane("text/html;", "Sample <b>content</b><br> <u>text</u>");
        jep3.setEnabled(false);
        builder.append("Disabled", jep3);

        JTextArea jta3 = new JTextArea("Sample content text", 3, 20);
        jta3.setEnabled(false);
        JTextPane jtp3 = new JTextPane();
        jtp3.replaceSelection("Sample content text");
        jtp3.setPreferredSize(new Dimension(100, 40));
        jtp3.setEnabled(false);
        builder.append(jta3, jtp3);

        JEditorPane jepNonOpaque = new JEditorPane("text/html;",
                "Sample <b>content</b><br> <u>text</u>");
        jepNonOpaque.setOpaque(false);
        builder.append("Non opaque", jepNonOpaque);

        JTextArea jtaNonOpaque = new JTextArea("Sample content text", 3, 20);
        jtaNonOpaque.setOpaque(false);
        JTextPane jtpNonOpaque = new JTextPane();
        jtpNonOpaque.replaceSelection("Sample content text");
        jtpNonOpaque.setPreferredSize(new Dimension(100, 40));
        jtpNonOpaque.setOpaque(false);
        builder.append(jtaNonOpaque, jtpNonOpaque);

        JEditorPane jep4 = new JEditorPane("text/html;", "Sample <b>content</b><br> <u>text</u>");
        jep4.setMargin(new Insets(2, 2, 2, 2));
        builder.append("With margin", jep4);

        JTextArea jta4 = new JTextArea("Sample content text", 3, 20);
        jta4.setMargin(new Insets(2, 2, 2, 2));
        JTextPane jtp4 = new JTextPane();
        jtp4.replaceSelection("Sample content text");
        jtp4.setPreferredSize(new Dimension(100, 40));
        jtp4.setMargin(new Insets(2, 2, 2, 2));
        builder.append(jta4, jtp4);

        return builder.build();
    }

    /**
     * Creates a test panel with text components.
     */
    public TextAreasPanel() {
        setLayout(new BorderLayout());
        this.add(new JScrollPane(getContents()), BorderLayout.CENTER);
    }

    @PerformanceScenarioParticipant
    public PerformanceScenario getSetTextComponentTextPerformanceScenario() {
        return new BasePerformanceScenario<JTextComponent>(TextAreasPanel.this,
                JTextComponent.class, false) {
            int[] perms;

            @Override
            public String getName() {
                return "Changing text areas text";
            }

            ;

            @Override
            public void setup() {
                super.setup();
                this.perms = LightbeamUtils.getPermutation(LightbeamUtils.dictionary.length,
                        getIterationCount() * this.controls.size() * 2);
            }

            @Override
            public int getIterationCount() {
                return 10;
            }

            ;

            @Override
            public void runSingleIteration(int iterationNumber) {
                int count = 0;
                for (JTextComponent field : this.controls) {
                    int index = this.controls.size() * iterationNumber + count;
                    if (field instanceof JFormattedTextField) {
                        int value = 100 + this.perms[index] * 10;
                        field.setText(value + "0.000");
                    } else {
                        field.setText(LightbeamUtils.dictionary[this.perms[index]] + " "
                                + LightbeamUtils.dictionary[this.perms[index + 1]]);
                    }
                    count++;
                }
                paintImmediately(new Rectangle(0, 0, getWidth(), getHeight()));
            }

            ;
        };
    }

}