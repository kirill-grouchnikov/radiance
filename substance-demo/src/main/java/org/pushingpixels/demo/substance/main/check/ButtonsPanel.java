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
import java.awt.Font;
import java.awt.Insets;
import java.util.EnumSet;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

import org.pushingpixels.demo.substance.main.Check;
import org.pushingpixels.demo.substance.main.check.command.ChainCommand;
import org.pushingpixels.demo.substance.main.check.command.ConfigurationCommand;
import org.pushingpixels.demo.substance.main.check.command.DisableCommand;
import org.pushingpixels.demo.substance.main.check.command.SelectCommand;
import org.pushingpixels.demo.substance.main.check.svg.flags.cn;
import org.pushingpixels.demo.substance.main.check.svg.flags.gr;
import org.pushingpixels.demo.substance.main.check.svg.flags.il;
import org.pushingpixels.demo.substance.main.check.svg.flags.it;
import org.pushingpixels.demo.substance.main.check.svg.flags.ru;
import org.pushingpixels.demo.substance.main.check.svg.flags.se;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.FocusKind;
import org.pushingpixels.substance.api.SubstanceSlices.Side;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Test application panel for testing {@link JButton}, {@link JToggleButton}, {@link JRadioButton}
 * and {@link JCheckBox} components.
 * 
 * @author Kirill Grouchnikov
 */
public class ButtonsPanel extends JPanel {
    /**
     * The default button.
     */
    public JButton defaultButton;

    /**
     * A configure command that removes the focus painting from the specified button.
     * 
     * @author Kirill Grouchnikov
     */
    private class NoFocusCommand implements ConfigurationCommand<AbstractButton> {
        /*
         * (non-Javadoc)
         * 
         * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
         */
        public void configure(AbstractButton ab) {
            ab.setFocusPainted(false);
        }
    }

    /**
     * A configure command that sets a 5-pixel margin on the specified button.
     * 
     * @author Kirill Grouchnikov
     */
    private class MarginCommand implements ConfigurationCommand<AbstractButton> {
        /*
         * (non-Javadoc)
         * 
         * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
         */
        public void configure(AbstractButton ab) {
            ab.setMargin(new Insets(5, 5, 5, 5));
        }
    }

    /**
     * A configure command that sets the specified text on the specified button.
     * 
     * @author Kirill Grouchnikov
     */
    private class TextCommand implements ConfigurationCommand<AbstractButton> {
        /**
         * Text to set.
         */
        private String text;

        /**
         * Creates a text configuration command.
         * 
         * @param text
         *            Text to set.
         */
        public TextCommand(String text) {
            this.text = text;
        }

        /*
         * (non-Javadoc)
         * 
         * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
         */
        public void configure(AbstractButton ab) {
            ab.setText(this.text);
        }
    }

    /**
     * A configure command that sets the specified tooltip text on the specified button.
     * 
     * @author Kirill Grouchnikov
     */
    private class TooltipTextCommand implements ConfigurationCommand<AbstractButton> {
        /**
         * Tooltip text to set.
         */
        private String tooltipText;

        /**
         * Creates a tooltip text configuration command.
         * 
         * @param tooltipText
         *            Tooltip text to set.
         */
        public TooltipTextCommand(String tooltipText) {
            this.tooltipText = tooltipText;
        }

        /*
         * (non-Javadoc)
         * 
         * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
         */
        public void configure(AbstractButton ab) {
            ab.setToolTipText(this.tooltipText);
        }
    }

    /**
     * A configure command that sets a popup menu handler on the specified button.
     * 
     * @author Kirill Grouchnikov
     */
    private class PopupMenuCommand implements ConfigurationCommand<AbstractButton> {
        /*
         * (non-Javadoc)
         * 
         * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
         */
        public void configure(AbstractButton ab) {
            ab.addMouseListener(new MousePopupListener(ab));
        }
    }

    /**
     * A configure command that sets the specified font on the specified button.
     * 
     * @author Kirill Grouchnikov
     */
    private class FontCommand implements ConfigurationCommand<AbstractButton> {
        /**
         * Font to set.
         */
        private Font font;

        /**
         * Creates a font configuration command.
         * 
         * @param font
         *            Font to set.
         */
        public FontCommand(Font font) {
            this.font = font;
        }

        /*
         * (non-Javadoc)
         * 
         * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
         */
        public void configure(AbstractButton ab) {
            ab.setFont(this.font);
        }
    }

    /**
     * A configure command that sets the specified icon on the specified button.
     * 
     * @author Kirill Grouchnikov
     */
    private class IconCommand implements ConfigurationCommand<AbstractButton> {
        /**
         * Icon to set.
         */
        private Icon icon;

        /**
         * Creates an icon configuration command.
         * 
         * @param icon
         *            Icon to set.
         */
        public IconCommand(Icon icon) {
            this.icon = icon;
        }

        /*
         * (non-Javadoc)
         * 
         * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
         */
        public void configure(AbstractButton ab) {
            if ((ab instanceof JRadioButton) || (ab instanceof JCheckBox))
                return;
            ab.setIcon(this.icon);
        }
    }

    /**
     * A configure command that marks the button to not have content area filled.
     * 
     * @author Kirill Grouchnikov
     */
    private class NoContentAreaFilledCommand implements ConfigurationCommand<AbstractButton> {
        /*
         * (non-Javadoc)
         * 
         * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
         */
        public void configure(AbstractButton ab) {
            ab.setContentAreaFilled(false);
        }
    }

    /**
     * A configure command that marks the button to not have border painted.
     * 
     * @author Kirill Grouchnikov
     */
    private class NoBorderPaintedCommand implements ConfigurationCommand<AbstractButton> {
        /*
         * (non-Javadoc)
         * 
         * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
         */
        public void configure(AbstractButton ab) {
            ab.setBorderPainted(false);
        }
    }

    /**
     * Returns a row of buttons, consisting of {@link JButton}, {@link JToggleButton},
     * {@link JCheckBox} and {@link JRadioButton} in default states.
     * 
     * @return A row of buttons, consisting of {@link JButton}, {@link JToggleButton},
     *         {@link JCheckBox} and {@link JRadioButton} in default states.
     */
    private AbstractButton[] getRow() {
        AbstractButton[] result = new AbstractButton[4];
        result[0] = new JButton("sample");
        result[0].setName("Button " + rowCount);
        result[1] = new JToggleButton("sample");
        result[1].setName("Toggle " + rowCount);
        result[2] = new JCheckBox("sample");
        result[2].setName("Check " + rowCount);
        result[3] = new JRadioButton("sample");
        result[3].setName("Radio " + rowCount);
        rowCount++;
        return result;
    }

    private int rowCount = 0;

    /**
     * Adds a row of buttons configured with the specified text, icon and configuration command.
     * 
     * @param builder
     *            Form builder.
     * @param label
     *            Text to set.
     * @param icon
     *            Icon to set.
     * @param cmd
     *            Configuration command to apply.
     */
    private void addRow(DefaultFormBuilder builder, String label, Icon icon,
            ConfigurationCommand<? super AbstractButton> cmd) {
        AbstractButton[] row = this.getRow();
        if (cmd != null) {
            for (AbstractButton ab : row) {
                cmd.configure(ab);
            }
        }

        JLabel jl = new JLabel(label);
        if (icon != null)
            jl.setIcon(icon);
        builder.append(jl);
        for (AbstractButton ab : row)
            builder.append(ab);
    }

    /**
     * Creates a new button panel.
     */
    @SuppressWarnings("unchecked")
    public ButtonsPanel() {
        this.setLayout(new BorderLayout());

        FormLayout lm = new FormLayout("right:pref, 10dlu, left:pref:grow(1), 4dlu,"
                + "left:pref:grow(1), 4dlu, left:pref:grow(1), " + "4dlu, left:pref:grow(1)", "");
        lm.setColumnGroups(new int[][] { { 3, 5, 7, 9 } });
        DefaultFormBuilder builder = new DefaultFormBuilder(lm, new ScrollablePanel())
                .border(Borders.DIALOG);

        builder.append("");
        JLabel bLabel = new JLabel("Buttons");
        bLabel.setIcon(Check.getIcon("JButtonColor16"));
        JLabel tbLabel = new JLabel("Toggle buttons");
        tbLabel.setIcon(Check.getIcon("JToggleButtonColor16"));
        JLabel cbLabel = new JLabel("Check boxes");
        cbLabel.setIcon(Check.getIcon("JCheckBoxColor16"));
        JLabel rbLabel = new JLabel("Radio buttons");
        rbLabel.setIcon(Check.getIcon("JRadioButtonColor16"));

        // bLabel.setFont(bLabel.getFont().deriveFont(Font.BOLD));
        // tbLabel.setFont(rbLabel.getFont().deriveFont(Font.BOLD));
        // cbLabel.setFont(cbLabel.getFont().deriveFont(Font.BOLD));
        // rbLabel.setFont(rbLabel.getFont().deriveFont(Font.BOLD));

        builder.append(bLabel, tbLabel);
        builder.append(cbLabel, rbLabel);

        builder.appendSeparator("Regular settings");
        this.addRow(builder, "Enabled", null, null);
        this.addRow(builder, "Disabled", null, new DisableCommand());
        this.addRow(builder, "Selected", null, new SelectCommand());
        this.addRow(builder, "Disabled selected", null,
                new ChainCommand<JComponent>(new DisableCommand(), new SelectCommand()));
        this.addRow(builder, "HTML text", null,
                new TextCommand("<html>text <b>text</b> <font color='red'>text</font>"));
        this.addRow(builder, "Long text", null, new TextCommand("Some long long text"));
        this.addRow(builder, "With tooltip", null, new TooltipTextCommand("Sample tooltip"));
        this.addRow(builder, "Disabled with tooltip", null,
                new ChainCommand(new TooltipTextCommand("Sample tooltip"), new DisableCommand()));
        this.addRow(builder, "Popup menu", null, new PopupMenuCommand());
        this.addRow(builder, "With icon", se.of(16, 16), new IconCommand(se.of(16, 16)));

        builder.appendSeparator("Focus indications");
        this.addRow(builder, "No focus painted", null, new NoFocusCommand());
        this.addRow(builder, "None", null,
                (AbstractButton ab) -> SubstanceCortex.ComponentOrParentChainScope.setFocusKind(ab,
                        FocusKind.NONE));
        this.addRow(builder, "Text", null,
                (AbstractButton ab) -> SubstanceCortex.ComponentOrParentChainScope.setFocusKind(ab,
                        FocusKind.TEXT));
        this.addRow(builder, "All", null,
                (AbstractButton ab) -> SubstanceCortex.ComponentOrParentChainScope.setFocusKind(ab,
                        FocusKind.ALL));
        this.addRow(builder, "All inner", null,
                (AbstractButton ab) -> SubstanceCortex.ComponentOrParentChainScope.setFocusKind(ab,
                        FocusKind.ALL_INNER));
        this.addRow(builder, "All strong inner", null,
                (AbstractButton ab) -> SubstanceCortex.ComponentOrParentChainScope.setFocusKind(ab,
                        FocusKind.ALL_STRONG_INNER));
        this.addRow(builder, "Underline", null,
                (AbstractButton ab) -> SubstanceCortex.ComponentOrParentChainScope.setFocusKind(ab,
                        FocusKind.UNDERLINE));
        this.addRow(builder, "Strong underline", null,
                (AbstractButton ab) -> SubstanceCortex.ComponentOrParentChainScope.setFocusKind(ab,
                        FocusKind.STRONG_UNDERLINE));

        builder.appendSeparator("Size settings");
        this.addRow(builder, "No min size", null,
                (AbstractButton ab) -> SubstanceCortex.ComponentOrParentScope
                        .setButtonIgnoreMinimumSize(ab, true));
        this.addRow(builder, "Custom margin", null, new MarginCommand());

        builder.appendSeparator("Side settings");
        this.addRow(builder, "Straight top", null,
                (AbstractButton ab) -> SubstanceCortex.ComponentScope.setButtonStraightSide(ab,
                        Side.TOP));
        this.addRow(builder, "Straight bottom", null,
                (AbstractButton ab) -> SubstanceCortex.ComponentScope.setButtonStraightSide(ab,
                        Side.BOTTOM));
        this.addRow(builder, "Straight left", null,
                (AbstractButton ab) -> SubstanceCortex.ComponentScope.setButtonStraightSides(ab,
                        EnumSet.of(Side.LEFT)));
        this.addRow(builder, "Straight right", null,
                (AbstractButton ab) -> SubstanceCortex.ComponentScope.setButtonStraightSides(ab,
                        EnumSet.of(Side.RIGHT)));

        this.addRow(builder, "Open top", null,
                new ChainCommand<AbstractButton>(
                        (AbstractButton ab) -> SubstanceCortex.ComponentScope
                                .setButtonStraightSide(ab, Side.TOP),
                        (AbstractButton ab) -> SubstanceCortex.ComponentScope.setButtonOpenSide(ab,
                                Side.TOP)));
        this.addRow(builder, "Open bottom", null,
                new ChainCommand<AbstractButton>(
                        (AbstractButton ab) -> SubstanceCortex.ComponentScope
                                .setButtonStraightSide(ab, Side.BOTTOM),
                        (AbstractButton ab) -> SubstanceCortex.ComponentScope.setButtonOpenSide(ab,
                                Side.BOTTOM)));
        this.addRow(builder, "Open left", null,
                new ChainCommand<AbstractButton>(
                        (AbstractButton ab) -> SubstanceCortex.ComponentScope
                                .setButtonStraightSides(ab, EnumSet.of(Side.LEFT)),
                        (AbstractButton ab) -> SubstanceCortex.ComponentScope.setButtonOpenSides(ab,
                                EnumSet.of(Side.LEFT))));
        this.addRow(builder, "Open right", null,
                new ChainCommand<AbstractButton>(
                        (AbstractButton ab) -> SubstanceCortex.ComponentScope
                                .setButtonStraightSides(ab, EnumSet.of(Side.RIGHT)),
                        (AbstractButton ab) -> SubstanceCortex.ComponentScope.setButtonOpenSides(ab,
                                EnumSet.of(Side.RIGHT))));

        builder.appendSeparator("Unicode texts");
        this.addRow(builder, "Hebrew", null, new ChainCommand<AbstractButton>(
                new TextCommand("\u05D0\u05D1\u05D2"), new IconCommand(il.of(16, 16))));
        this.addRow(builder, "Chinese", null,
                new ChainCommand<AbstractButton>(
                        new FontCommand(new Font("Arial Unicode MS", Font.PLAIN, 11)),
                        new TextCommand("\u4E01\u4E02\u4E03"), new IconCommand(cn.of(16, 16))));
        this.addRow(builder, "Cyrillic", null, new ChainCommand<AbstractButton>(
                new TextCommand("\u0430\u0431\u0432"), new IconCommand(ru.of(16, 16))));
        this.addRow(builder, "Greek", null, new ChainCommand<AbstractButton>(
                new TextCommand("\u03B1\u03B2\u03B3"), new IconCommand(gr.of(16, 16))));
        this.addRow(builder, "Latin", null, new ChainCommand<AbstractButton>(
                new TextCommand("\u00E6\u00F0\u0127\u2248"), new IconCommand(it.of(16, 16))));

        builder.appendSeparator("Misc settings");
        this.addRow(builder, "No content area", null, new NoContentAreaFilledCommand());
        this.addRow(builder, "No border", null, new NoBorderPaintedCommand());
        this.addRow(builder, "No background", null, new ChainCommand<AbstractButton>(
                new NoContentAreaFilledCommand(), new NoBorderPaintedCommand()));
        this.addRow(builder, "Flat", null, (JComponent jc) -> SubstanceCortex.ComponentOrParentScope
                .setFlatBackground(jc, true));
        this.addRow(builder, "Never", null,
                (JComponent jc) -> SubstanceCortex.ComponentOrParentScope
                        .setButtonNeverPaintBackground(jc, true));

        this.addRow(builder, "Fixed font", null,
                new FontCommand(new Font("Arial", Font.PLAIN, 12)));
        this.addRow(builder, "Null text", null, new TextCommand(null));
        this.addRow(builder, "Empty text", null, new TextCommand(""));

        JPanel panel = builder.getPanel();
        JScrollPane jsp = new JScrollPane(panel);
        SubstanceCortex.ComponentScope.setAutomaticScrollPresence(jsp, true);
        this.add(jsp, BorderLayout.CENTER);
    }
}
