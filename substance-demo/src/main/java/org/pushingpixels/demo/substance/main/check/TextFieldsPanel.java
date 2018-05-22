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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;
import java.text.DecimalFormat;

import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.password.PasswordStrengthChecker;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Test application panel for testing {@link JTextArea}, {@link JTextField}, {@link JTextPane},
 * {@link JPasswordField}, {@link JEditorPane} and {@link JFormattedTextField} components.
 * 
 * @author Kirill Grouchnikov
 */
public class TextFieldsPanel extends JPanel implements Deferrable {
    private boolean isInitialized;

    @Override
    public boolean isInitialized() {
        return this.isInitialized;
    }

    /**
     * Returns the panel contents.
     * 
     * @return The panel contents.
     */
    private JPanel getContents() {
        FormLayout lm = new FormLayout("right:pref, 4dlu, fill:default:grow(1), 4dlu,"
                + "fill:default:grow(1), 4dlu, fill:default:grow(1)", "");
        // lm.setColumnGroups(new int[][] { { 3, 5, 7 } });
        DefaultFormBuilder builder = new DefaultFormBuilder(lm, new ScrollablePanel())
                .border(Borders.DIALOG);

        JLabel textLabel = new JLabel("Text fields");
        JLabel formattedTextLabel = new JLabel("Formatted text fields");
        JLabel passwordLabel = new JLabel("Password fields");
        // textLabel.setFont(textLabel.getFont().deriveFont(Font.BOLD));
        // formattedTextLabel.setFont(formattedTextLabel.getFont().deriveFont(
        // Font.BOLD));
        // passwordLabel.setFont(passwordLabel.getFont().deriveFont(Font.BOLD));

        builder.append("", textLabel);
        builder.append(formattedTextLabel, passwordLabel);

        JTextField jtf1 = new JTextField("sample text");
        builder.append("Enabled", jtf1);

        JFormattedTextField jftf1 = new JFormattedTextField(new DecimalFormat("#,##0.0000"));
        jftf1.setText("2,430.0000");
        JPasswordField jpf1 = new JPasswordField("password", 10);
        builder.append(jftf1, jpf1);

        JTextField jtfNotEditable = new JTextField("sample text");
        jtfNotEditable.setEditable(false);
        builder.append("Not editable", jtfNotEditable);

        JFormattedTextField jftfNotEditable = new JFormattedTextField(
                new DecimalFormat("#,##0.0000"));
        jftfNotEditable.setText("2,430.0000");
        jftfNotEditable.setEditable(false);
        JPasswordField jpfNotEditable = new JPasswordField("password", 10);
        jpfNotEditable.setEditable(false);
        builder.append(jftfNotEditable, jpfNotEditable);

        JTextField jtfNotEditableWithLock = new JTextField("sample text");
        jtfNotEditableWithLock.setEditable(false);
        SubstanceCortex.ComponentScope.setLockIconVisible(jtfNotEditableWithLock, true);
        builder.append("Not editable with lock", jtfNotEditableWithLock);

        JFormattedTextField jftfNotEditableWithLock = new JFormattedTextField(
                new DecimalFormat("#,##0.0000"));
        jftfNotEditableWithLock.setText("2,430.0000");
        jftfNotEditableWithLock.setEditable(false);
        SubstanceCortex.ComponentScope.setLockIconVisible(jftfNotEditableWithLock, true);
        JPasswordField jpfNotEditableWithLock = new JPasswordField("password", 10);
        jpfNotEditableWithLock.setEditable(false);
        SubstanceCortex.ComponentScope.setLockIconVisible(jpfNotEditableWithLock, true);
        builder.append(jftfNotEditableWithLock, jpfNotEditableWithLock);

        JTextField jtfDisabled = new JTextField("sample text");
        jtfDisabled.setEnabled(false);
        builder.append("Disabled", jtfDisabled);

        JFormattedTextField jftfDisabled = new JFormattedTextField(new DecimalFormat("#,##0.0000"));
        jftfDisabled.setText("2,430.0000");
        jftfDisabled.setEnabled(false);
        JPasswordField jpfDisabled = new JPasswordField("password", 10);
        jpfDisabled.setEnabled(false);
        builder.append(jftfDisabled, jpfDisabled);

        JTextField jtfNonOpaque = new JTextField("sample text");
        jtfNonOpaque.setOpaque(false);
        builder.append("Non opaque", jtfNonOpaque);

        JFormattedTextField jftfNonOpaque = new JFormattedTextField(
                new DecimalFormat("#,##0.0000"));
        jftfNonOpaque.setText("2,430.0000");
        jftfNonOpaque.setOpaque(false);
        JPasswordField jpfNonOpaque = new JPasswordField("password", 10);
        jpfNonOpaque.setOpaque(false);
        builder.append(jftfNonOpaque, jpfNonOpaque);

        JTextField jtfWatermarkBleed = new JTextField("sample text");
        SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jtfWatermarkBleed, true);
        builder.append("Watermark bleed", jtfWatermarkBleed);

        JFormattedTextField jftfWatermarkBleed = new JFormattedTextField(
                new DecimalFormat("#,##0.0000"));
        jftfWatermarkBleed.setText("2,430.0000");
        SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jftfWatermarkBleed, true);
        JPasswordField jpfWatermarkBleed = new JPasswordField("password", 10);
        SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jpfWatermarkBleed, true);
        builder.append(jftfWatermarkBleed, jpfWatermarkBleed);

        JTextField jtf4 = new JTextField("sample text");
        SubstanceCortex.ComponentOrParentChainScope.setSelectTextOnFocus(jtf4, true);
        builder.append("Select all on focus", jtf4);

        JFormattedTextField jftf4 = new JFormattedTextField(new DecimalFormat("#,##0.0000"));
        jftf4.setText("2,430.0000");
        SubstanceCortex.ComponentOrParentChainScope.setSelectTextOnFocus(jftf4, true);
        builder.append(jftf4);
        builder.nextLine();

        JTextField jtf4_1 = new JTextField("sample text");
        SubstanceCortex.ComponentScope.setFlipTextSelectionOnEscape(jtf4_1, true);
        builder.append("Flip selection on ESC", jtf4_1);

        JFormattedTextField jftf4_1 = new JFormattedTextField(new DecimalFormat("#,##0.0000"));
        jftf4_1.setText("2,430.0000");
        SubstanceCortex.ComponentScope.setFlipTextSelectionOnEscape(jftf4_1, true);
        builder.append(jftf4_1);
        builder.nextLine();

        JTextField jtf5 = new JTextField("sample text");
        SubstanceCortex.ComponentScope.setTextEditContextMenuPresence(jtf5, true);
        builder.append("With context menu", jtf5);

        JFormattedTextField jftf5 = new JFormattedTextField(new DecimalFormat("#,##0.0000"));
        jftf5.setText("2,430.0000");
        SubstanceCortex.ComponentScope.setTextEditContextMenuPresence(jftf5, true);
        builder.append(jftf5);
        builder.nextLine();

        JTextField jtf6 = new JTextField("sample text");
        jtf6.setMargin(new Insets(2, 2, 2, 2));
        builder.append("With margin a2", jtf6);

        JFormattedTextField jftf6 = new JFormattedTextField(new DecimalFormat("#,##0.0000"));
        jftf6.setText("2,430.0000");
        jftf6.setMargin(new Insets(2, 2, 2, 2));
        JPasswordField jpf6 = new JPasswordField("password", 10);
        jpf6.setMargin(new Insets(2, 2, 2, 2));
        builder.append(jftf6, jpf6);

        JTextField jtf60 = new JTextField("sample text");
        jtf60.setMargin(new Insets(0, 10, 0, 0));
        builder.append("With margin l10", jtf60);

        JFormattedTextField jftf60 = new JFormattedTextField(new DecimalFormat("#,##0.0000"));
        jftf60.setText("2,430.0000");
        jftf60.setMargin(new Insets(0, 10, 0, 0));
        JPasswordField jpf60 = new JPasswordField("password", 10);
        jpf60.setMargin(new Insets(0, 10, 0, 0));
        builder.append(jftf60, jpf60);

        JPasswordField jpfEmptyEchoChar = new JPasswordField("password", 10);
        jpfEmptyEchoChar.setEchoChar((char) 0);
        builder.append("Empty echo char", new JLabel());
        builder.append(new JLabel(), jpfEmptyEchoChar);

        JPasswordField jpfStrengthChecker = new JPasswordField("password", 10);
        SubstanceCortex.ComponentScope.setPasswordStrengthChecker(jpfStrengthChecker,
                new PasswordStrengthChecker() {
                    public SubstanceSlices.PasswordStrength getStrength(char[] password) {
                        if (password == null)
                            return SubstanceSlices.PasswordStrength.WEAK;
                        int length = password.length;
                        if (length < 3)
                            return SubstanceSlices.PasswordStrength.WEAK;
                        if (length < 6)
                            return SubstanceSlices.PasswordStrength.MEDIUM;
                        return SubstanceSlices.PasswordStrength.STRONG;
                    }

                    public String getDescription(SubstanceSlices.PasswordStrength strength) {
                        if (strength == SubstanceSlices.PasswordStrength.WEAK)
                            return "<html>This password is <b>way</b> too weak</html>";
                        if (strength == SubstanceSlices.PasswordStrength.MEDIUM)
                            return "<html>Come on, you can do<br> a little better than that</html>";
                        if (strength == SubstanceSlices.PasswordStrength.STRONG)
                            return "OK";
                        return null;
                    }
                });
        builder.append("Strength checker", new JLabel());
        builder.append(new JLabel(), jpfStrengthChecker);

        JPasswordField jpfTwoEchoChar = new JPasswordField("password", 10);
        SubstanceCortex.ComponentScope.setNumberOfPasswordEchoesPerCharacter(jpfTwoEchoChar, 2);
        builder.append("Two echo chars", new JLabel());
        builder.append(new JLabel(), jpfTwoEchoChar);

        JLabel editorPaneLabel = new JLabel("Editor panes");
        JLabel textAreaLabel = new JLabel("Text areas");
        JLabel textPaneLabel = new JLabel("Text panes");
        // editorPaneLabel
        // .setFont(editorPaneLabel.getFont().deriveFont(Font.BOLD));
        // textAreaLabel.setFont(textAreaLabel.getFont().deriveFont(Font.BOLD));
        // textPaneLabel.setFont(textPaneLabel.getFont().deriveFont(Font.BOLD));

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

        JEditorPane jepNotEditableWithLock = new JEditorPane("text/html;",
                "Sample <b>content</b><br> <u>text</u>");
        jepNotEditableWithLock.setEditable(false);
        SubstanceCortex.ComponentScope.setLockIconVisible(jepNotEditableWithLock, true);
        builder.append("Not editable with lock", jepNotEditableWithLock);

        JTextArea jtaNotEditableWithLock = new JTextArea("Sample content text", 3, 20);
        jtaNotEditableWithLock.setEditable(false);
        SubstanceCortex.ComponentScope.setLockIconVisible(jtaNotEditableWithLock, true);
        JTextPane jtpNotEditableWithLock = new JTextPane();
        jtpNotEditableWithLock.replaceSelection("Sample content text");
        jtpNotEditableWithLock.setPreferredSize(new Dimension(100, 40));
        jtpNotEditableWithLock.setEditable(false);
        SubstanceCortex.ComponentScope.setLockIconVisible(jtpNotEditableWithLock, true);
        builder.append(jtaNotEditableWithLock, jtpNotEditableWithLock);

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

        JEditorPane jepWatermarkBleed = new JEditorPane("text/html;",
                "Sample <b>content</b><br> <u>text</u>");
        SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jepWatermarkBleed, true);
        builder.append("Watermark bleed", jepWatermarkBleed);

        JTextArea jtaWatermarkBleed = new JTextArea("Sample content text", 3, 20);
        SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jtaWatermarkBleed, true);
        JTextPane jtpWatermarkBleed = new JTextPane();
        jtpWatermarkBleed.replaceSelection("Sample content text");
        jtpWatermarkBleed.setPreferredSize(new Dimension(100, 40));
        SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jtpWatermarkBleed, true);
        builder.append(jtaWatermarkBleed, jtpWatermarkBleed);

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

        JTextArea jtaLineWrap = new JTextArea(
                "The contents of this text area wrap, but not necessarily between words", 3, 15);
        jtaLineWrap.setLineWrap(true);
        builder.append("Line wrap", new JLabel(""));
        builder.append(jtaLineWrap, new JLabel(""));

        JTextArea jtaLineWrapWords = new JTextArea(
                "The contents of this text area wrap, necessarily between words", 3, 15);
        jtaLineWrapWords.setLineWrap(true);
        jtaLineWrapWords.setWrapStyleWord(true);
        builder.append("Line wrap words", new JLabel(""));
        builder.append(jtaLineWrapWords, new JLabel(""));

        JTextArea textAreaScroll = new JTextArea(5, 15);
        for (int i = 0; i < 20; i++) {
            textAreaScroll.append("Some long long long line with number " + i + "\n");
        }
        textAreaScroll.setEditable(false);
        builder.append("Scrollable", new JScrollPane(textAreaScroll));
        builder.nextLine();

        JTextArea textAreaScrollWithLock = new JTextArea(5, 15);
        for (int i = 0; i < 20; i++) {
            textAreaScrollWithLock.append("Some long long long line with number " + i + "\n");
        }
        SubstanceCortex.ComponentScope.setLockIconVisible(textAreaScrollWithLock, true);
        textAreaScrollWithLock.setEditable(false);
        builder.append("Scrollable with lock", new JScrollPane(textAreaScrollWithLock));

        JPanel result = builder.getPanel();
        result.setName("Text fields panel");
        // result.setBackground(Color.red);
        return result;
    }

    /**
     * Creates a test panel with text components.
     */
    public TextFieldsPanel() {
        setLayout(new BorderLayout());
    }

    @Override
    public synchronized void initialize() {
        final JPanel contents = getContents();
        JScrollPane scroller = new JScrollPane(contents);
        this.add(scroller, BorderLayout.CENTER);
        this.isInitialized = true;
        SwingUtilities.invokeLater(() -> {
            contents.scrollRectToVisible(new Rectangle(0, 0, 10, 10));
        });
    }
}