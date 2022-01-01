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
package org.pushingpixels.radiance.tools.lafbenchmark.panels;

import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.tools.lafbenchmark.commands.ChainCommand;
import org.pushingpixels.radiance.tools.lafbenchmark.commands.ConfigurationCommand;
import org.pushingpixels.radiance.tools.lafbenchmark.*;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Test application panel for testing {@link JButton}, {@link JToggleButton},
 * {@link JRadioButton} and {@link JCheckBox} components.
 *
 * @author Kirill Grouchnikov
 */
public class ButtonsPanel extends JPanel {
    /**
     * The default button.
     */
    public JButton defaultButton;

    /**
     * A configure command that sets a 5-pixel margin on the specified button.
     *
     * @author Kirill Grouchnikov
     */
    private class MarginCommand implements ConfigurationCommand<AbstractButton> {
        @Override
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
         * @param text Text to set.
         */
        public TextCommand(String text) {
            this.text = text;
        }

        @Override
        public void configure(AbstractButton ab) {
            ab.setText(this.text);
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
         * @param font Font to set.
         */
        public FontCommand(Font font) {
            this.font = font;
        }

        @Override
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
         * @param icon Icon to set.
         */
        public IconCommand(Icon icon) {
            this.icon = icon;
        }

        @Override
        public void configure(AbstractButton ab) {
            if ((ab instanceof JRadioButton) || (ab instanceof JCheckBox))
                return;
            ab.setIcon(this.icon);
        }
    }

    /**
     * A configure command that marks the button to not have content area
     * filled.
     *
     * @author Kirill Grouchnikov
     */
    private class NoContentAreaFilledCommand implements
            ConfigurationCommand<AbstractButton> {
        @Override
        public void configure(AbstractButton ab) {
            ab.setContentAreaFilled(false);
        }
    }

    /**
     * A configure command that marks the button to not have border painted.
     *
     * @author Kirill Grouchnikov
     */
    private class NoBorderPaintedCommand implements
            ConfigurationCommand<AbstractButton> {
        @Override
        public void configure(AbstractButton ab) {
            ab.setBorderPainted(false);
        }
    }

    /**
     * Returns a row of buttons, consisting of {@link JButton}, {@link
     * JToggleButton}, {@link JCheckBox} and {@link JRadioButton} in default
     * states.
     *
     * @return A row of buttons, consisting of {@link JButton}, {@link
     * JToggleButton}, {@link JCheckBox} and {@link JRadioButton} in default
     * states.
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
     * Adds a row of buttons configured with the specified text, icon and
     * configuration command.
     *
     * @param builder Form builder.
     * @param label   Text to set.
     * @param icon    Icon to set.
     * @param cmd     Configuration command to apply.
     */
    private void addRow(TestFormLayoutBuilder builder, String label, Icon icon,
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

        TestFormLayoutBuilder builder = new TestFormLayoutBuilder(
                "right:pref, 10dlu, left:pref:grow(1), 4dlu,"
                        + "left:pref:grow(1), 4dlu, left:pref:grow(1), "
                        + "4dlu, left:pref:grow(1)", 5, 20).
                columnGroups(new int[][] {{3, 5, 7, 9}}).
                border(Paddings.DIALOG);

        builder.append("");
        JLabel bLabel = new JLabel("Buttons");
        JLabel tbLabel = new JLabel("Toggle buttons");
        JLabel cbLabel = new JLabel("Check boxes");
        JLabel rbLabel = new JLabel("Radio buttons");

        builder.append(bLabel, tbLabel);
        builder.append(cbLabel, rbLabel);

        builder.appendSeparator("Regular settings");

        this.addRow(builder, "Regular", null, null);
        this.addRow(builder, "HTML text", null, new TextCommand(
                "<html>text <b>text</b> <font color='red'>text</font>"));
        this.addRow(builder, "Long text", null, new TextCommand(
                "Some long long text"));
        this.addRow(builder, "With icon", IconManager.getRandomIcon(),
                new IconCommand(IconManager.getRandomIcon()));
        this.addRow(builder, "Custom margin", null, new MarginCommand());

        builder.appendSeparator("Misc settings");
        this.addRow(builder, "No content area", null,
                new NoContentAreaFilledCommand());
        this.addRow(builder, "No border", null, new NoBorderPaintedCommand());
        this.addRow(builder, "No background", null,
                new ChainCommand<Component>(new ConfigurationCommand[] {
                        new NoContentAreaFilledCommand(),
                        new NoBorderPaintedCommand()}));

        builder.appendSeparator("Unicode texts");
        this.addRow(builder, "Hebrew", null, new TextCommand(
                "\u05D0\u05D1\u05D2"));
        this.addRow(builder, "Chinese", null, new ChainCommand<AbstractButton>(new ConfigurationCommand[] {
                new FontCommand(new Font("Arial Unicode MS", Font.PLAIN, 11)),
                new TextCommand("\u4E01\u4E02\u4E03")}));
        this.addRow(builder, "Cyrillic", null, new TextCommand(
                "\u0430\u0431\u0432"));
        this.addRow(builder, "Greek", null, new TextCommand(
                "\u03B1\u03B2\u03B3"));
        this.addRow(builder, "Latin", null, new TextCommand(
                "\u00E6\u00F0\u0127\u2248"));

        this.addRow(builder, "Fixed font", null, new FontCommand(new Font(
                "Arial", Font.PLAIN, 12)));
        this.addRow(builder, "Null text", null, new TextCommand(null));
        this.addRow(builder, "Empty text", null, new TextCommand(""));

        JScrollPane jsp = new JScrollPane(builder.build());
        this.add(jsp, BorderLayout.CENTER);
    }

    protected abstract class BaseButtonPerformanceScenario extends
            BasePerformanceScenario<AbstractButton> {
        int[] perms;

        int flipCount;

        public BaseButtonPerformanceScenario() {
            super(ButtonsPanel.this, AbstractButton.class);
        }

        @Override
        public void setup() {
            super.setup();
            this.flipCount = this.controls.size() / 4;
            this.perms = LafBenchmarkUtils.getPermutation(this.controls.size(),
                    this.flipCount * getIterationCount());
        }
    }

    @PerformanceScenarioParticipant
    public PerformanceScenario getToggleSelectionScenario() {
        return new BaseButtonPerformanceScenario() {
            Map<AbstractButton, Boolean> origToggleMap;

            @Override
            public String getName() {
                return "Toggling selection on buttons";
            }

            @Override
            public int getIterationCount() {
                return 10;
            }

            @Override
            public void setup() {
                super.setup();
                this.origToggleMap = new HashMap<AbstractButton, Boolean>();
                for (AbstractButton button : this.controls) {
                    this.origToggleMap.put(button, button.isSelected());
                }
            }

            @Override
            public void tearDown() {
                for (AbstractButton button : this.controls) {
                    button.setSelected(this.origToggleMap.get(button));
                }
                this.origToggleMap.clear();
                super.tearDown();
            }

            @Override
            public void runSingleIteration(int iterationNumber) {
                int startInd = this.flipCount * iterationNumber;
                int endInd = startInd + this.flipCount;
                for (int i = startInd; i < endInd; i++) {
                    AbstractButton button = this.controls.get(this.perms[i]);
                    button.setSelected(!button.isSelected());
                }
                paintImmediately(new Rectangle(0, 0, getWidth(), getHeight()));
            }
        };
    }

    @PerformanceScenarioParticipant
    public PerformanceScenario getToggleEnabledScenario() {
        return new BaseButtonPerformanceScenario() {
            Map<AbstractButton, Boolean> origEnabledMap;

            @Override
            public String getName() {
                return "Toggling enabled on buttons";
            }

            @Override
            public int getIterationCount() {
                return 10;
            }

            @Override
            public void setup() {
                super.setup();
                this.origEnabledMap = new HashMap<AbstractButton, Boolean>();
                for (AbstractButton button : this.controls) {
                    this.origEnabledMap.put(button, button.isEnabled());
                }
            }

            @Override
            public void tearDown() {
                for (AbstractButton button : this.controls) {
                    button.setEnabled(this.origEnabledMap.get(button));
                }
                this.origEnabledMap.clear();
                super.tearDown();
            }

            @Override
            public void runSingleIteration(int iterationNumber) {
                int startInd = this.flipCount * iterationNumber;
                int endInd = startInd + this.flipCount;
                for (int i = startInd; i < endInd; i++) {
                    AbstractButton button = this.controls.get(this.perms[i]);
                    button.setEnabled(!button.isEnabled());
                }
                paintImmediately(new Rectangle(0, 0, getWidth(), getHeight()));
            }
        };
    }

    @PerformanceScenarioParticipant
    public PerformanceScenario getChangeTextScenario() {
        return new BasePerformanceScenario<AbstractButton>(
                ButtonsPanel.this, AbstractButton.class, false) {
            Map<AbstractButton, String> origText;

            int[] perms;

            @Override
            public String getName() {
                return "Changing text on buttons";
            }

            @Override
            public int getIterationCount() {
                return 10;
            }

            @Override
            public void setup() {
                super.setup();
                this.perms = LafBenchmarkUtils.getPermutation(
                        LafBenchmarkUtils.dictionary.length, getIterationCount()
                                * this.controls.size()
                                * this.getIterationCount());
                this.origText = new HashMap<AbstractButton, String>();
                for (AbstractButton button : this.controls) {
                    this.origText.put(button, button.getText());
                }
            }

            @Override
            public void tearDown() {
                for (AbstractButton button : this.controls) {
                    button.setText(this.origText.get(button));
                }
                this.origText.clear();
                super.tearDown();
            }

            @Override
            public void runSingleIteration(int iterationNumber) {
                int count = 0;
                for (AbstractButton button : this.controls) {
                    int index = this.controls.size() * iterationNumber + count;
                    button
                            .setText(LafBenchmarkUtils.dictionary[this.perms[index]]);
                    count++;
                }
                paintImmediately(new Rectangle(0, 0, getWidth(), getHeight()));
            }
        };
    }

}
