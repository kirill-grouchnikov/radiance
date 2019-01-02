/*
 * Copyright (c) 2008-2019 Lightbeam Kirill Grouchnikov. All Rights Reserved.
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

import com.jgoodies.forms.factories.*;
import org.pushingpixels.lightbeam.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Test application panel for testing {@link JComboBox} component.
 *
 * @author Kirill Grouchnikov
 */
public class CombosPanel extends JPanel {
    /**
     * Returns the left panel with comboboxes.
     *
     * @return The left panel with comboboxes.
     */
    private JPanel getLeftComboPanel() {
        TestFormLayoutBuilder builder = new TestFormLayoutBuilder(
                "right:pref, 4dlu, fill:pref:grow", 2, 9).border(Paddings.DIALOG);

        builder.appendSeparator("Simple combos");

        JComboBox comboRegular = new JComboBox(new Object[] { "entry1",
                "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboRegular.setToolTipText("This is my combo 1");
        comboRegular.setMaximumRowCount(4);
        builder.append("Regular", comboRegular);

        JComboBox comboDisabled = new JComboBox(new Object[] { "entry1",
                "entry2", "entry3" });
        comboDisabled.setEnabled(false);
        builder.append("Disabled", comboDisabled);

        JComboBox comboColored = new JComboBox(new Object[] { "entry31",
                "entry32", "entry33", "entry34", "entry35", "entry36", "aaa",
                "abb", "abc" });
        comboColored.setName("Colored combo");
        comboColored.setBackground(new Color(255, 128, 128));
        comboColored.setForeground(new Color(0, 0, 128));
        builder.append("Pink background", comboColored);

        JComboBox comboDefaultCoreRenderer = new JComboBox(new Object[] {
                "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboDefaultCoreRenderer.setRenderer(new DefaultListCellRenderer());
        builder.append("Default core renderer", comboDefaultCoreRenderer);

        JComboBox comboEditable = new JComboBox(new Object[] { "Ester",
                "Jordi", "Jordina", "Jorge", "Sergi" });
        comboEditable.setEditable(true);
        builder.append("Editable", comboEditable);

        builder.appendSeparator("Miscellaneous");

        JComboBox comboHebrew = new JComboBox(new Object[] {
                "\u05e8\u05d0\u05e9\u05d9 1", "\u05e8\u05d0\u05e9\u05d9 2",
                "\u05e8\u05d0\u05e9\u05d9 3", "\u05e8\u05d0\u05e9\u05d9 4",
                "\u05e8\u05d0\u05e9\u05d9 5", "\u05e8\u05d0\u05e9\u05d9 6",
                "\u05e8\u05d0\u05e9\u05d9 7", "\u05e8\u05d0\u05e9\u05d9 8",
                "\u05e8\u05d0\u05e9\u05d9 9" });
        comboHebrew.setToolTipText("RTL combo");
        comboHebrew.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        comboHebrew.setMaximumRowCount(6);
        builder.append("RTL (Hebrew)", comboHebrew);

        JComboBox comboHebrewCustomRenderer = new JComboBox(new Object[] {
                "\u05e8\u05d0\u05e9\u05d9 1", "\u05e8\u05d0\u05e9\u05d9 2",
                "\u05e8\u05d0\u05e9\u05d9 3", "\u05e8\u05d0\u05e9\u05d9 4",
                "\u05e8\u05d0\u05e9\u05d9 5", "\u05e8\u05d0\u05e9\u05d9 6",
                "\u05e8\u05d0\u05e9\u05d9 7", "\u05e8\u05d0\u05e9\u05d9 8",
                "\u05e8\u05d0\u05e9\u05d9 9" });
        comboHebrewCustomRenderer.setToolTipText("RTL combo");
        comboHebrewCustomRenderer
                .setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        comboHebrewCustomRenderer.setMaximumRowCount(6);
        builder.append("RTL (Hebrew) with icon", comboHebrewCustomRenderer);

        return builder.build();
    }

    /**
     * Returns the right panel with comboboxes.
     *
     * @return The right panel with comboboxes.
     */
    private JPanel getRightComboPanel() {
        TestFormLayoutBuilder builder = new TestFormLayoutBuilder(
                "right:pref, 4dlu, left:pref:grow", 2, 7).border(Paddings.DIALOG);

        builder.appendSeparator("Empty combos");
        JComboBox emptyModelCombo = new JComboBox(new String[] {});
        builder.append("Empty model", emptyModelCombo);

        JComboBox emptyStringCombo = new JComboBox(new String[] { "" });
        builder.append("Empty string", emptyStringCombo);

        JComboBox spaceCombo = new JComboBox(new String[] { " " });
        builder.append("Space string", spaceCombo);

        JComboBox emptyEditableCombo = new JComboBox(new String[] {});
        emptyEditableCombo.setEditable(true);
        builder.append("Empty model + editable", emptyEditableCombo);

        JComboBox emptyStringEditableCombo = new JComboBox(new String[] { "" });
        emptyStringEditableCombo.setEditable(true);
        builder.append("Empty string + editable", emptyStringEditableCombo);

        JComboBox spaceEditableCombo = new JComboBox(new String[] { " " });
        spaceEditableCombo.setEditable(true);
        builder.append("Space string + editable", spaceEditableCombo);

        return builder.build();
    }

    protected abstract class BaseComboBoxPerformanceScenario extends
            BasePerformanceScenario<JComboBox> {
        int[] perms;

        int flipCount;

        public BaseComboBoxPerformanceScenario() {
            super(CombosPanel.this, JComboBox.class);
        }

        @Override
        public void setup() {
            super.setup();
            this.flipCount = this.controls.size() / 4;
            this.perms = LightbeamUtils.getPermutation(this.controls.size(),
                    this.flipCount * getIterationCount());
        }
    }

    @PerformanceScenarioParticipant
    public PerformanceScenario getToggleEnabledScenario() {
        return new BaseComboBoxPerformanceScenario() {
            Map<JComboBox, Boolean> origEnabledMap;

            @Override
            public String getName() {
                return "Toggling enabled on comboboxes";
            }

            @Override
            public int getIterationCount() {
                return 10;
            }

            @Override
            public void setup() {
                super.setup();
                this.origEnabledMap = new HashMap<JComboBox, Boolean>();
                for (JComboBox combo : this.controls) {
                    this.origEnabledMap.put(combo, combo.isEnabled());
                }
            }

            @Override
            public void tearDown() {
                for (JComboBox combo : this.controls) {
                    combo.setEnabled(this.origEnabledMap.get(combo));
                }
                this.origEnabledMap.clear();
                super.tearDown();
            }

            @Override
            public void runSingleIteration(int iterationNumber) {
                int startInd = this.flipCount * iterationNumber;
                int endInd = startInd + this.flipCount;
                for (int i = startInd; i < endInd; i++) {
                    JComboBox combo = this.controls.get(this.perms[i]);
                    combo.setEnabled(!combo.isEnabled());
                }
                paintImmediately(new Rectangle(0, 0, getWidth(), getHeight()));
            }
        };
    }

    @PerformanceScenarioParticipant
    public PerformanceScenario getToggleEditableScenario() {
        return new BaseComboBoxPerformanceScenario() {
            Map<JComboBox, Boolean> origEditableMap;

            @Override
            public String getName() {
                return "Toggling editable on comboboxes";
            }

            @Override
            public int getIterationCount() {
                return 10;
            }

            @Override
            public void setup() {
                super.setup();
                this.origEditableMap = new HashMap<JComboBox, Boolean>();
                for (JComboBox combo : this.controls) {
                    this.origEditableMap.put(combo, combo.isEditable());
                }
            }

            @Override
            public void tearDown() {
                for (JComboBox combo : this.controls) {
                    combo.setEditable(this.origEditableMap.get(combo));
                }
                this.origEditableMap.clear();
                super.tearDown();
            }

            @Override
            public void runSingleIteration(int iterationNumber) {
                int startInd = this.flipCount * iterationNumber;
                int endInd = startInd + this.flipCount;
                for (int i = startInd; i < endInd; i++) {
                    JComboBox combo = this.controls.get(this.perms[i]);
                    combo.setEditable(!combo.isEditable());
                }
                paintImmediately(new Rectangle(0, 0, getWidth(), getHeight()));
            }
        };
    }

    /**
     * Creates the combobox panel.
     */
    public CombosPanel() {
        this.setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(1, 2));
        gridPanel.add(getLeftComboPanel());
        gridPanel.add(getRightComboPanel());
        this.add(new JScrollPane(gridPanel), BorderLayout.CENTER);
    }
}
