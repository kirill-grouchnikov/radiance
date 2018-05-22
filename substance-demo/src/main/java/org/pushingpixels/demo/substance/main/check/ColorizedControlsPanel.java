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
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JTree;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

import org.pushingpixels.demo.substance.main.Check;
import org.pushingpixels.demo.substance.main.check.command.BackgroundColorCommand;
import org.pushingpixels.demo.substance.main.check.command.ChainCommand;
import org.pushingpixels.demo.substance.main.check.command.ConfigurationCommand;
import org.pushingpixels.demo.substance.main.check.command.CreationCommand;
import org.pushingpixels.demo.substance.main.check.command.DisableCommand;
import org.pushingpixels.demo.substance.main.check.command.DisableViewportCommand;
import org.pushingpixels.demo.substance.main.check.command.ForegroundColorCommand;
import org.pushingpixels.demo.substance.main.check.command.MinimizeInternalFrameCommand;
import org.pushingpixels.demo.substance.main.check.command.SelectCommand;
import org.pushingpixels.demo.substance.main.check.command.SetBoundsCommand;
import org.pushingpixels.substance.api.SubstanceCortex;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Test application panel for testing colorized components.
 * 
 * @author Kirill Grouchnikov
 */
public class ColorizedControlsPanel extends JPanel implements Deferrable {
    /**
     * The default button.
     */
    public JButton defaultButton;

    private boolean isInitialized;

    @Override
    public boolean isInitialized() {
        return this.isInitialized;
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
        result[1] = new JToggleButton("sample");
        result[2] = new JCheckBox("sample");
        result[3] = new JRadioButton("sample");
        return result;
    }

    /**
     * Adds a row of buttons configured with the specified text, icon and configuration command.
     * 
     * @param builder
     *            Form builder.
     * @param label
     *            Text to set.
     * @param icon
     *            Icon to set.
     * @param configurationCmd
     *            Configuration command to apply.
     */
    private void addButtonRow(DefaultFormBuilder builder, String label, Icon icon,
            ConfigurationCommand<JComponent> configurationCmd) {
        AbstractButton[] row = this.getRow();
        if (configurationCmd != null) {
            for (AbstractButton ab : row) {
                configurationCmd.configure(ab);
                ab.setName(label + " " + ab.getClass().getSimpleName());
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
     * Adds a row of components configured with the specified configuration command.
     * 
     * @param builder
     *            Form builder.
     * @param label
     *            Text to set.
     * @param creationCmd
     *            Creation command.
     * @param configurationCmd
     *            Configuration command to apply.
     */
    private void addControlRow(DefaultFormBuilder builder, String label,
            CreationCommand<JComponent> creationCmd,
            ConfigurationCommand<JComponent> configurationCmd) {

        JComponent[] row = new JComponent[4];
        row[0] = creationCmd.create();
        row[0].setBackground(Color.yellow);
        row[0].setName(row[0].getName() + ": yellow backgr");
        row[1] = creationCmd.create();
        row[1].setBackground(Color.blue);
        row[1].setForeground(Color.red);
        row[1].setName(row[1].getName() + ": blue backgr, red foregr");
        row[2] = creationCmd.create();
        row[2].setBackground(Color.green);
        row[2].setName(row[2].getName() + ": green backgr");
        row[3] = creationCmd.create();
        row[3].setBackground(Color.green.darker());
        row[3].setName(row[3].getName() + ": darker green backgr");

        if (configurationCmd != null) {
            for (JComponent comp : row) {
                configurationCmd.configure(comp);
            }
        }

        JLabel jl = new JLabel(label);
        builder.append(jl);
        for (Component comp : row)
            builder.append(comp);
    }

    private void addInternalFrame(JDesktopPane desktopPane, CreationCommand creationCommand,
            ConfigurationCommand<JComponent> configCommand) {
        JInternalFrame jif = (JInternalFrame) creationCommand.create();
        desktopPane.add(jif);
        configCommand.configure(jif);
    }

    /**
     * Creates a new button panel.
     */
    @SuppressWarnings("unchecked")
    public ColorizedControlsPanel() {
        this.setLayout(new BorderLayout());
    }

    @Override
    public synchronized void initialize() {
        FormLayout lmButtons = new FormLayout("right:pref, 10dlu, left:pref:grow(1), 4dlu,"
                + "left:pref:grow(1), 4dlu, left:pref:grow(1), " + "4dlu, left:pref:grow(1)", "");
        lmButtons.setColumnGroups(new int[][] { { 3, 5, 7, 9 } });
        DefaultFormBuilder builderButtons = new DefaultFormBuilder(lmButtons, new ScrollablePanel())
                .border(Borders.DIALOG);

        builderButtons.append("");
        JLabel bLabel = new JLabel("Buttons");
        bLabel.setIcon(Check.getIcon("JButtonColor16"));
        JLabel tbLabel = new JLabel("Toggle buttons");
        tbLabel.setIcon(Check.getIcon("JToggleButtonColor16"));
        JLabel cbLabel = new JLabel("Check boxes");
        cbLabel.setIcon(Check.getIcon("JCheckBoxColor16"));
        JLabel rbLabel = new JLabel("Radio buttons");
        rbLabel.setIcon(Check.getIcon("JRadioButtonColor16"));

        builderButtons.append(bLabel, tbLabel);
        builderButtons.append(cbLabel, rbLabel);

        builderButtons.appendSeparator("Regular settings");

        this.addButtonRow(builderButtons, "Enabled", null, null);
        this.addButtonRow(builderButtons, "Flat", null,
                (JComponent jc) -> SubstanceCortex.ComponentOrParentScope.setFlatBackground(jc,
                        true));
        this.addButtonRow(builderButtons, "Disabled", null, new DisableCommand());
        this.addButtonRow(builderButtons, "Selected", null, new SelectCommand());
        this.addButtonRow(builderButtons, "Disabled selected", null,
                new ChainCommand<JComponent>(new DisableCommand(), new SelectCommand()));

        builderButtons.appendSeparator("Background settings");
        this.addButtonRow(builderButtons, "Yellow", null, new BackgroundColorCommand(Color.yellow));
        this.addButtonRow(builderButtons, "Yellow flat", null,
                new ChainCommand<JComponent>(new BackgroundColorCommand(Color.yellow),
                        (JComponent jc) -> SubstanceCortex.ComponentOrParentScope
                                .setFlatBackground(jc, true)));
        this.addButtonRow(builderButtons, "Yellow disabled", null, new ChainCommand<JComponent>(
                new BackgroundColorCommand(Color.yellow), new DisableCommand()));
        this.addButtonRow(builderButtons, "Yellow selected", null, new ChainCommand<JComponent>(
                new BackgroundColorCommand(Color.yellow), new SelectCommand()));
        this.addButtonRow(builderButtons, "Yellow disabled selected", null,
                new ChainCommand<JComponent>(new BackgroundColorCommand(Color.yellow),
                        new SelectCommand(), new DisableCommand()));
        this.addButtonRow(builderButtons, "Red", null, new BackgroundColorCommand(Color.red));
        this.addButtonRow(builderButtons, "Red disabled", null, new ChainCommand<JComponent>(
                new BackgroundColorCommand(Color.red), new DisableCommand()));
        this.addButtonRow(builderButtons, "Red selected", null, new ChainCommand<JComponent>(
                new BackgroundColorCommand(Color.red), new SelectCommand()));
        this.addButtonRow(builderButtons, "Red disabled selected", null,
                new ChainCommand<JComponent>(new BackgroundColorCommand(Color.red),
                        new SelectCommand(), new DisableCommand()));
        this.addButtonRow(builderButtons, "Green", null, new BackgroundColorCommand(Color.green));
        this.addButtonRow(builderButtons, "Green disabled", null, new ChainCommand<JComponent>(
                new BackgroundColorCommand(Color.green), new DisableCommand()));
        this.addButtonRow(builderButtons, "Green selected", null, new ChainCommand<JComponent>(
                new BackgroundColorCommand(Color.green), new SelectCommand()));
        this.addButtonRow(builderButtons, "Green disabled selected", null,
                new ChainCommand<JComponent>(new BackgroundColorCommand(Color.green),
                        new SelectCommand(), new DisableCommand()));
        this.addButtonRow(builderButtons, "Dark Green", null,
                new BackgroundColorCommand(Color.green.darker()));
        this.addButtonRow(builderButtons, "Dark Green disabled", null, new ChainCommand<JComponent>(
                new BackgroundColorCommand(Color.green.darker()), new DisableCommand()));
        this.addButtonRow(builderButtons, "Dark Green selected", null, new ChainCommand<JComponent>(
                new BackgroundColorCommand(Color.green.darker()), new SelectCommand()));
        this.addButtonRow(builderButtons, "Dark Green disabled selected", null,
                new ChainCommand<JComponent>(new BackgroundColorCommand(Color.green.darker()),
                        new SelectCommand(), new DisableCommand()));

        builderButtons.appendSeparator("Foreground settings");
        this.addButtonRow(builderButtons, "Yellow", null, new ForegroundColorCommand(Color.yellow));
        this.addButtonRow(builderButtons, "Yellow disabled", null, new ChainCommand<JComponent>(
                new ForegroundColorCommand(Color.yellow), new DisableCommand()));
        this.addButtonRow(builderButtons, "Yellow selected", null, new ChainCommand<JComponent>(
                new ForegroundColorCommand(Color.yellow), new SelectCommand()));
        this.addButtonRow(builderButtons, "Yellow disabled selected", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.yellow),
                        new SelectCommand(), new DisableCommand()));
        this.addButtonRow(builderButtons, "Red", null, new ForegroundColorCommand(Color.red));
        this.addButtonRow(builderButtons, "Red disabled", null, new ChainCommand<JComponent>(
                new ForegroundColorCommand(Color.red), new DisableCommand()));
        this.addButtonRow(builderButtons, "Red selected", null, new ChainCommand<JComponent>(
                new ForegroundColorCommand(Color.red), new SelectCommand()));
        this.addButtonRow(builderButtons, "Red disabled selected", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.red),
                        new SelectCommand(), new DisableCommand()));
        this.addButtonRow(builderButtons, "Green", null, new ForegroundColorCommand(Color.green));
        this.addButtonRow(builderButtons, "Green disabled", null, new ChainCommand<JComponent>(
                new ForegroundColorCommand(Color.green), new DisableCommand()));
        this.addButtonRow(builderButtons, "Green selected", null, new ChainCommand<JComponent>(
                new ForegroundColorCommand(Color.green), new SelectCommand()));
        this.addButtonRow(builderButtons, "Green disabled selected", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.green),
                        new SelectCommand(), new DisableCommand()));
        this.addButtonRow(builderButtons, "Dark Green", null,
                new ForegroundColorCommand(Color.green.darker()));
        this.addButtonRow(builderButtons, "Dark Green disabled", null, new ChainCommand<JComponent>(
                new ForegroundColorCommand(Color.green.darker()), new DisableCommand()));
        this.addButtonRow(builderButtons, "Dark Green selected", null, new ChainCommand<JComponent>(
                new ForegroundColorCommand(Color.green.darker()), new SelectCommand()));
        this.addButtonRow(builderButtons, "Dark Green disabled selected", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.green.darker()),
                        new SelectCommand(), new DisableCommand()));

        builderButtons.appendSeparator("Combined settings");
        this.addButtonRow(builderButtons, "Blue/yellow", null, new ChainCommand<JComponent>(
                new ForegroundColorCommand(Color.blue), new BackgroundColorCommand(Color.yellow)));
        this.addButtonRow(builderButtons, "Blue/yellow disabled", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.blue),
                        new BackgroundColorCommand(Color.yellow), new DisableCommand()));
        this.addButtonRow(builderButtons, "Blue/yellow selected", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.blue),
                        new BackgroundColorCommand(Color.yellow), new SelectCommand()));
        this.addButtonRow(builderButtons, "Blue/yellow disabled selected", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.blue),
                        new BackgroundColorCommand(Color.yellow), new SelectCommand(),
                        new DisableCommand()));
        this.addButtonRow(builderButtons, "Red/light green", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.red),
                        new BackgroundColorCommand(Color.green.brighter())));
        this.addButtonRow(builderButtons, "Red/light green disabled", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.red),
                        new BackgroundColorCommand(Color.green.brighter()), new DisableCommand()));
        this.addButtonRow(builderButtons, "Red/light green selected", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.red),
                        new BackgroundColorCommand(Color.green.brighter()), new SelectCommand()));
        this.addButtonRow(builderButtons, "Red/light green disabled selected", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.red),
                        new BackgroundColorCommand(Color.green.brighter()), new SelectCommand(),
                        new DisableCommand()));
        this.addButtonRow(builderButtons, "Dark yellow/blue", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.yellow.darker()),
                        new BackgroundColorCommand(Color.blue)));
        this.addButtonRow(builderButtons, "Dark yellow/blue disabled", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.yellow.darker()),
                        new BackgroundColorCommand(Color.blue), new DisableCommand()));
        this.addButtonRow(builderButtons, "Dark yellow/blue selected", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.yellow.darker()),
                        new BackgroundColorCommand(Color.blue), new SelectCommand()));
        this.addButtonRow(builderButtons, "Dark yellow/blue disabled selected", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.yellow.darker()),
                        new BackgroundColorCommand(Color.blue), new SelectCommand(),
                        new DisableCommand()));
        this.addButtonRow(builderButtons, "Dark green/magenta", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.green.darker()),
                        new BackgroundColorCommand(Color.magenta)));
        this.addButtonRow(builderButtons, "Dark green/magenta disabled", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.green.darker()),
                        new BackgroundColorCommand(Color.magenta), new DisableCommand()));
        this.addButtonRow(builderButtons, "Dark green/magenta selected", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.green.darker()),
                        new BackgroundColorCommand(Color.magenta), new SelectCommand()));
        this.addButtonRow(builderButtons, "Dark green/magenta disabled selected", null,
                new ChainCommand<JComponent>(new ForegroundColorCommand(Color.green.darker()),
                        new BackgroundColorCommand(Color.magenta), new SelectCommand(),
                        new DisableCommand()));

        JPanel panelButtons = builderButtons.getPanel();
        JScrollPane jspButtons = new JScrollPane(panelButtons);
        panelButtons.setOpaque(false);
        jspButtons.setOpaque(false);
        jspButtons.getViewport().setOpaque(false);

        FormLayout lmOther = new FormLayout("right:pref, 10dlu, left:pref:grow(1), 4dlu,"
                + "left:pref:grow(1), 4dlu, left:pref:grow(1), " + "4dlu, left:pref:grow(1)", "");
        lmOther.setColumnGroups(new int[][] { { 3, 5, 7, 9 } });
        DefaultFormBuilder builderOther = new DefaultFormBuilder(lmOther, new ScrollablePanel())
                .border(Borders.DIALOG);

        builderOther.append("");
        builderOther.append(new JLabel("Yellow"), new JLabel("Blue + red foreground"));
        builderOther.append(new JLabel("Green"), new JLabel("Dark green"));

        builderOther.appendSeparator("Labels");
        addControlRow(builderOther, "Regular", new CreationCommand<JComponent>() {
            public JComponent create() {
                return new JLabel("label");
            }
        }, null);
        addControlRow(builderOther, "Disabled", new CreationCommand<JComponent>() {
            public JComponent create() {
                return new JLabel("label");
            }
        }, new DisableCommand());
        addControlRow(builderOther, "HTML", new CreationCommand<JComponent>() {
            public JComponent create() {
                return new JLabel("<html>text <b>text</b> <font color='red'>text</font>");
            }
        }, null);

        builderOther.appendSeparator("Sliders");
        addControlRow(builderOther, "Regular", new CreationCommand<JComponent>() {
            public JComponent create() {
                return new JSlider(0, 100, 50);
            }
        }, null);
        addControlRow(builderOther, "Disabled", new CreationCommand<JComponent>() {
            public JComponent create() {
                return new JSlider(0, 100, 50);
            }
        }, new DisableCommand());

        builderOther.appendSeparator("Progress bars");
        addControlRow(builderOther, "Regular", new CreationCommand<JComponent>() {
            public JComponent create() {
                JProgressBar jpb = new JProgressBar(0, 100);
                jpb.setIndeterminate(false);
                jpb.setValue(50);
                jpb.setStringPainted(true);
                return jpb;
            }
        }, null);
        addControlRow(builderOther, "Disabled", new CreationCommand<JComponent>() {
            public JComponent create() {
                JProgressBar jpb = new JProgressBar(0, 100);
                jpb.setIndeterminate(false);
                jpb.setValue(50);
                jpb.setStringPainted(true);
                return jpb;
            }
        }, new DisableCommand());
        addControlRow(builderOther, "Custom foreground", new CreationCommand<JComponent>() {
            public JComponent create() {
                JProgressBar jpb = new JProgressBar(0, 100);
                jpb.setIndeterminate(false);
                jpb.setValue(50);
                jpb.setStringPainted(true);
                return jpb;
            }
        }, new ForegroundColorCommand(Color.red));
        addControlRow(builderOther, "Disabled with foreground", new CreationCommand<JComponent>() {
            public JComponent create() {
                JProgressBar jpb = new JProgressBar(0, 100);
                jpb.setIndeterminate(false);
                jpb.setValue(50);
                jpb.setStringPainted(true);
                return jpb;
            }
        }, new ChainCommand<JComponent>(new DisableCommand(),
                new ForegroundColorCommand(Color.red)));
        addControlRow(builderOther, "Indeterminate", new CreationCommand<JComponent>() {
            public JComponent create() {
                JProgressBar jpb = new JProgressBar(0, 100);
                jpb.setIndeterminate(true);
                return jpb;
            }
        }, null);
        addControlRow(builderOther, "Indeterminate disabled", new CreationCommand<JComponent>() {
            public JComponent create() {
                JProgressBar jpb = new JProgressBar(0, 100);
                jpb.setIndeterminate(true);
                return jpb;
            }
        }, new DisableCommand());

        builderOther.appendSeparator("Combo boxes");
        addControlRow(builderOther, "Regular", new CreationCommand<JComponent>() {
            public JComponent create() {
                JComboBox jcb = new JComboBox(
                        new Object[] { "Ester", "Jordi", "Jordina", "Jorge", "Sergi" });
                return jcb;
            }
        }, null);
        addControlRow(builderOther, "Flat", new CreationCommand<JComponent>() {
            public JComponent create() {
                JComboBox jcb = new JComboBox(
                        new Object[] { "Ester", "Jordi", "Jordina", "Jorge", "Sergi" });
                return jcb;
            }
        }, (JComponent jc) -> SubstanceCortex.ComponentOrParentScope.setFlatBackground(jc, true));
        addControlRow(builderOther, "Disabled", new CreationCommand<JComponent>() {
            public JComponent create() {
                JComboBox jcb = new JComboBox(
                        new Object[] { "Ester", "Jordi", "Jordina", "Jorge", "Sergi" });
                return jcb;
            }
        }, new DisableCommand());
        addControlRow(builderOther, "Editable", new CreationCommand<JComponent>() {
            public JComponent create() {
                JComboBox jcb = new JComboBox(
                        new Object[] { "Ester", "Jordi", "Jordina", "Jorge", "Sergi" });
                jcb.setEditable(true);
                return jcb;
            }
        }, null);
        addControlRow(builderOther, "Disabled editable", new CreationCommand<JComponent>() {
            public JComponent create() {
                JComboBox jcb = new JComboBox(
                        new Object[] { "Ester", "Jordi", "Jordina", "Jorge", "Sergi" });
                jcb.setEditable(true);
                return jcb;
            }
        }, new DisableCommand());

        CreationCommand<JComponent> spinnerCreationCmd = new CreationCommand<JComponent>() {
            public JComponent create() {
                JSpinner s = new JSpinner(
                        new SpinnerListModel(new Object[] { "sample0", "sample", "sample2" }));
                s.getModel().setValue("sample");
                return s;
            }
        };
        builderOther.appendSeparator("Spinners");
        addControlRow(builderOther, "Regular", spinnerCreationCmd, null);
        addControlRow(builderOther, "Flat", spinnerCreationCmd,
                (JComponent jc) -> SubstanceCortex.ComponentOrParentScope.setFlatBackground(jc,
                        true));
        addControlRow(builderOther, "Disabled", spinnerCreationCmd, new DisableCommand());

        JPanel panelOther = builderOther.getPanel();
        JScrollPane jspOther = new JScrollPane(panelOther);
        panelOther.setOpaque(false);
        jspOther.setOpaque(false);
        jspOther.getViewport().setOpaque(false);

        FormLayout lmText = new FormLayout("right:pref, 10dlu, left:pref:grow(1), 4dlu,"
                + "left:pref:grow(1), 4dlu, left:pref:grow(1), " + "4dlu, left:pref:grow(1)", "");
        lmText.setColumnGroups(new int[][] { { 3, 5, 7, 9 } });
        DefaultFormBuilder builderText = new DefaultFormBuilder(lmText, new ScrollablePanel())
                .border(Borders.DIALOG);

        builderText.append("");
        builderText.append(new JLabel("Yellow"), new JLabel("Blue + red foreground"));
        builderText.append(new JLabel("Green"), new JLabel("Dark green"));

        builderText.appendSeparator("Text fields");
        addControlRow(builderText, "Regular", new CreationCommand<JComponent>() {
            public JComponent create() {
                JTextField field = new JTextField("test", 15);
                return field;
            }
        }, null);
        addControlRow(builderText, "Watermark", new CreationCommand<JComponent>() {
            public JComponent create() {
                JTextField field = new JTextField("test", 15);
                return field;
            }
        }, (JComponent jc) -> SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jc,
                true));
        addControlRow(builderText, "Disabled", new CreationCommand<JComponent>() {
            public JComponent create() {
                JTextField field = new JTextField("test", 15);
                return field;
            }
        }, new DisableCommand());
        addControlRow(builderText, "Not editable", new CreationCommand<JComponent>() {
            public JComponent create() {
                JTextField field = new JTextField("test", 15);
                field.setEditable(false);
                return field;
            }
        }, null);

        builderText.appendSeparator("Formatted text fields");
        addControlRow(builderText, "Regular", new CreationCommand<JComponent>() {
            public JComponent create() {
                JFormattedTextField field = new JFormattedTextField(
                        new DecimalFormat("#,##0.0000"));
                field.setText("2,430.0000");
                return field;
            }
        }, null);
        addControlRow(builderText, "Watermark", new CreationCommand<JComponent>() {
            public JComponent create() {
                JFormattedTextField field = new JFormattedTextField(
                        new DecimalFormat("#,##0.0000"));
                field.setText("2,430.0000");
                return field;
            }
        }, (JComponent jc) -> SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jc,
                true));
        addControlRow(builderText, "Disabled", new CreationCommand<JComponent>() {
            public JComponent create() {
                JFormattedTextField field = new JFormattedTextField(
                        new DecimalFormat("#,##0.0000"));
                field.setText("2,430.0000");
                return field;
            }
        }, new DisableCommand());
        addControlRow(builderText, "Not editable", new CreationCommand<JComponent>() {
            public JComponent create() {
                JFormattedTextField field = new JFormattedTextField(
                        new DecimalFormat("#,##0.0000"));
                field.setText("2,430.0000");
                field.setEditable(false);
                return field;
            }
        }, null);

        builderText.appendSeparator("Password fields");
        addControlRow(builderText, "Regular", new CreationCommand<JComponent>() {
            public JComponent create() {
                JPasswordField field = new JPasswordField("password", 15);
                return field;
            }
        }, null);
        addControlRow(builderText, "Watermark", new CreationCommand<JComponent>() {
            public JComponent create() {
                JPasswordField field = new JPasswordField("password", 15);
                return field;
            }
        }, (JComponent jc) -> SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jc,
                true));
        addControlRow(builderText, "Disabled", new CreationCommand<JComponent>() {
            public JComponent create() {
                JPasswordField field = new JPasswordField("password", 15);
                return field;
            }
        }, new DisableCommand());
        addControlRow(builderText, "Not editable", new CreationCommand<JComponent>() {
            public JComponent create() {
                JPasswordField field = new JPasswordField("password", 15);
                field.setEditable(false);
                return field;
            }
        }, null);

        builderText.appendSeparator("Editor panes");
        addControlRow(builderText, "Regular", new CreationCommand<JComponent>() {
            public JComponent create() {
                JEditorPane pane = new JEditorPane("text/html;",
                        "Sample <b>content</b><br> <u>text</u>");
                return pane;
            }
        }, null);
        addControlRow(builderText, "Watermark", new CreationCommand<JComponent>() {
            public JComponent create() {
                JEditorPane pane = new JEditorPane("text/html;",
                        "Sample <b>content</b><br> <u>text</u>");
                return pane;
            }
        }, (JComponent jc) -> SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jc,
                true));
        addControlRow(builderText, "Disabled", new CreationCommand<JComponent>() {
            public JComponent create() {
                JEditorPane pane = new JEditorPane("text/html;",
                        "Sample <b>content</b><br> <u>text</u>");
                return pane;
            }
        }, new DisableCommand());
        addControlRow(builderText, "Not editable", new CreationCommand<JComponent>() {
            public JComponent create() {
                JEditorPane pane = new JEditorPane("text/html;",
                        "Sample <b>content</b><br> <u>text</u>");
                pane.setEditable(false);
                return pane;
            }
        }, null);

        builderText.appendSeparator("Text areas");
        addControlRow(builderText, "Regular", new CreationCommand<JComponent>() {
            public JComponent create() {
                JTextArea area = new JTextArea("Sample content text", 3, 15);
                return area;
            }
        }, null);
        addControlRow(builderText, "Watermark", new CreationCommand<JComponent>() {
            public JComponent create() {
                JTextArea area = new JTextArea("Sample content text", 3, 15);
                return area;
            }
        }, (JComponent jc) -> SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jc,
                true));
        addControlRow(builderText, "Disabled", new CreationCommand<JComponent>() {
            public JComponent create() {
                JTextArea area = new JTextArea("Sample content text", 3, 15);
                return area;
            }
        }, new DisableCommand());
        addControlRow(builderText, "Not editable", new CreationCommand<JComponent>() {
            public JComponent create() {
                JTextArea area = new JTextArea("Sample content text", 3, 15);
                area.setEditable(false);
                return area;
            }
        }, null);

        builderText.appendSeparator("Text panes");
        addControlRow(builderText, "Regular", new CreationCommand<JComponent>() {
            public JComponent create() {
                JTextPane pane = new JTextPane();
                pane.replaceSelection("Sample content text");
                pane.setPreferredSize(new Dimension(120, 40));
                return pane;
            }
        }, null);
        addControlRow(builderText, "Watermark", new CreationCommand<JComponent>() {
            public JComponent create() {
                JTextPane pane = new JTextPane();
                pane.replaceSelection("Sample content text");
                pane.setPreferredSize(new Dimension(120, 40));
                return pane;
            }
        }, (JComponent jc) -> SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jc,
                true));
        addControlRow(builderText, "Disabled", new CreationCommand<JComponent>() {
            public JComponent create() {
                JTextPane pane = new JTextPane();
                pane.replaceSelection("Sample content text");
                pane.setPreferredSize(new Dimension(120, 40));
                return pane;
            }
        }, new DisableCommand());
        addControlRow(builderText, "Not editable", new CreationCommand<JComponent>() {
            public JComponent create() {
                JTextPane pane = new JTextPane();
                pane.replaceSelection("Sample content text");
                pane.setPreferredSize(new Dimension(120, 40));
                pane.setEditable(false);
                return pane;
            }
        }, null);

        JPanel panelText = builderText.getPanel();
        JScrollPane jspText = new JScrollPane(panelText);
        panelText.setOpaque(false);
        jspText.setOpaque(false);
        jspText.getViewport().setOpaque(false);

        JScrollPane coloredScrollPane = new JScrollPane(new CheckeredPanel());
        coloredScrollPane.setBackground(Color.yellow);
        coloredScrollPane.getVerticalScrollBar().setBackground(Color.green);

        FormLayout lmCells = new FormLayout("right:pref, 10dlu, fill:pref:grow(1), 4dlu,"
                + "fill:pref:grow(1), 4dlu, fill:pref:grow(1), " + "4dlu, fill:pref:grow(1)", "");
        lmCells.setColumnGroups(new int[][] { { 3, 5, 7, 9 } });
        DefaultFormBuilder builderCells = new DefaultFormBuilder(lmCells, new ScrollablePanel())
                .border(Borders.DIALOG);

        builderCells.append("");
        builderCells.append(new JLabel("Yellow"), new JLabel("Blue + red foreground"));
        builderCells.append(new JLabel("Green"), new JLabel("Dark green"));

        builderCells.appendSeparator("Lists");
        addControlRow(builderCells, "List", new CreationCommand<JComponent>() {
            public JComponent create() {
                JList list = new JList(new Object[] { "entry1", "entry2", "entry3" });
                return list;
            }
        }, null);
        addControlRow(builderCells, "List watermark", new CreationCommand<JComponent>() {
            public JComponent create() {
                JList list = new JList(new Object[] { "entry1", "entry2", "entry3" });
                return list;
            }
        }, (JComponent jc) -> SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jc,
                true));
        addControlRow(builderCells, "List disabled", new CreationCommand<JComponent>() {
            public JComponent create() {
                JList list = new JList(new Object[] { "entry1", "entry2", "entry3" });
                return list;
            }
        }, new DisableCommand());

        CreationCommand<JComponent> tableCreationCmd = new CreationCommand<JComponent>() {
            public JComponent create() {
                final JTable table = new JTable(
                        new Object[][] { { "entry11", "entry12", "entry13" },
                                        { "entry21", "entry22", "entry23" },
                                        { "entry31", "entry32", "entry33" } },
                        new Object[] { "Column1", "Column2", "Column3" });
                table.setName("Table ");
                JScrollPane tableScroll = new JScrollPane(table) {
                    @Override
                    public void setBackground(Color bg) {
                        super.setBackground(bg);
                        table.setBackground(bg);
                        table.getTableHeader().setBackground(bg);
                    }

                    @Override
                    public void setForeground(Color fg) {
                        super.setForeground(fg);
                        table.setForeground(fg);
                        table.getTableHeader().setForeground(fg);
                    }
                };
                Dimension prefTable = table.getPreferredSize();
                tableScroll.setPreferredSize(new Dimension(prefTable.width, prefTable.height + 25));
                return tableScroll;
            }
        };
        builderCells.appendSeparator("Tables");
        addControlRow(builderCells, "Table", tableCreationCmd, null);
        addControlRow(builderCells, "Table watermark", tableCreationCmd,
                (JComponent jc) -> SubstanceCortex.ComponentOrParentChainScope
                        .setWatermarkVisible(jc, true));
        addControlRow(builderCells, "Table disabled", tableCreationCmd,
                new DisableViewportCommand());

        CreationCommand<JComponent> treeCreationCmd = new CreationCommand<JComponent>() {
            public void expandAll(JTree tree, boolean expand) {
                TreeNode root = (TreeNode) tree.getModel().getRoot();

                // Traverse tree from root
                expandAll(tree, new TreePath(root), expand);
            }

            private void expandAll(JTree tree, TreePath parent, boolean expand) {
                // Traverse children
                TreeNode node = (TreeNode) parent.getLastPathComponent();
                if (node.getChildCount() >= 0) {
                    for (Enumeration e = node.children(); e.hasMoreElements();) {
                        TreeNode n = (TreeNode) e.nextElement();
                        TreePath path = parent.pathByAddingChild(n);
                        expandAll(tree, path, expand);
                    }
                }

                // Expansion or collapse must be done bottom-up
                if (expand) {
                    tree.expandPath(parent);
                } else {
                    tree.collapsePath(parent);
                }
            }

            public JComponent create() {
                DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
                DefaultMutableTreeNode son1 = new DefaultMutableTreeNode("son1");
                DefaultMutableTreeNode son2 = new DefaultMutableTreeNode("son2");
                DefaultMutableTreeNode son3 = new DefaultMutableTreeNode("son3");
                DefaultMutableTreeNode gson11 = new DefaultMutableTreeNode("gson11");
                DefaultMutableTreeNode gson12 = new DefaultMutableTreeNode("gson12");
                DefaultMutableTreeNode gson21 = new DefaultMutableTreeNode("gson21");
                DefaultMutableTreeNode gson22 = new DefaultMutableTreeNode("gson22");
                DefaultMutableTreeNode gson31 = new DefaultMutableTreeNode("gson31");
                DefaultMutableTreeNode gson32 = new DefaultMutableTreeNode("gson32");
                DefaultMutableTreeNode ggson111 = new DefaultMutableTreeNode("ggson111");
                DefaultMutableTreeNode ggson112 = new DefaultMutableTreeNode("ggson112");
                DefaultMutableTreeNode ggson113 = new DefaultMutableTreeNode("ggson113");

                gson11.add(ggson111);
                gson11.add(ggson112);
                gson11.add(ggson113);
                son1.add(gson11);
                son1.add(gson12);
                son2.add(gson21);
                son2.add(gson22);
                son3.add(gson31);
                son3.add(gson32);
                root.add(son1);
                root.add(son2);
                root.add(son3);

                JTree tree = new JTree(root);
                expandAll(tree, true);
                return tree;
            }
        };
        builderCells.appendSeparator("Trees");
        addControlRow(builderCells, "Tree", treeCreationCmd, null);
        addControlRow(builderCells, "Tree watermark", treeCreationCmd,
                (JComponent jc) -> SubstanceCortex.ComponentOrParentChainScope
                        .setWatermarkVisible(jc, true));
        addControlRow(builderCells, "Tree disabled", treeCreationCmd, new DisableCommand());

        JPanel panelCells = builderCells.getPanel();
        JScrollPane jspCells = new JScrollPane(panelCells);
        panelCells.setOpaque(false);
        jspCells.setOpaque(false);
        jspCells.getViewport().setOpaque(false);

        JDesktopPane desktopPane = new JDesktopPane();
        CreationCommand<JComponent> internalFrameCreationCmd = new CreationCommand<JComponent>() {
            public JComponent create() {
                JInternalFrame jif = new JInternalFrame("Internal frame");
                jif.setLayout(new FlowLayout());
                JButton button = new JButton("red button");
                button.setBackground(Color.red);
                jif.add(button);
                jif.setClosable(true);
                jif.setMaximizable(true);
                jif.setIconifiable(true);
                jif.setResizable(true);
                jif.setVisible(true);

                JMenuBar jmb = new JMenuBar();
                JMenu coloredMenu = new JMenu("Colors");
                coloredMenu.setMnemonic('0');
                JMenuItem coloredMI = new JMenuItem("Italic red");
                coloredMI.setFont(coloredMI.getFont().deriveFont(Font.ITALIC));
                coloredMI.setForeground(Color.red);
                coloredMI.setBackground(Color.yellow);
                coloredMenu.add(coloredMI);
                JRadioButtonMenuItem coloredRBMI = new JRadioButtonMenuItem("Bold green");
                coloredRBMI.setFont(coloredRBMI.getFont().deriveFont(Font.BOLD));
                coloredRBMI.setForeground(Color.green);
                coloredRBMI.setBackground(Color.blue.brighter());
                coloredMenu.add(coloredRBMI);
                JCheckBoxMenuItem coloredCBMI = new JCheckBoxMenuItem("Big blue");
                coloredCBMI.setFont(coloredCBMI.getFont().deriveFont(32f));
                coloredCBMI.setForeground(Color.blue);
                coloredCBMI.setBackground(Color.green.brighter());
                coloredMenu.add(coloredCBMI);
                JMenu coloredM = new JMenu("Always big magenta");
                coloredM.setForeground(Color.magenta);
                coloredM.setBackground(Color.red.darker());
                coloredM.setFont(coloredM.getFont().deriveFont(24f));
                coloredMenu.add(coloredM);
                jmb.add(coloredMenu);

                JMenu blueMenu = new JMenu("Blue");
                blueMenu.setForeground(Color.blue);
                blueMenu.setBackground(Color.yellow);
                jmb.add(blueMenu);

                jif.setJMenuBar(jmb);

                return jif;
            }
        };
        addInternalFrame(desktopPane, internalFrameCreationCmd,
                new ChainCommand<JComponent>(new BackgroundColorCommand(Color.yellow),
                        new SetBoundsCommand(new Rectangle(0, 0, 200, 100))));
        addInternalFrame(desktopPane, internalFrameCreationCmd,
                new ChainCommand<JComponent>(new BackgroundColorCommand(Color.green),
                        new SetBoundsCommand(new Rectangle(250, 0, 200, 100))));
        addInternalFrame(desktopPane, internalFrameCreationCmd,
                new ChainCommand<JComponent>(new BackgroundColorCommand(Color.yellow),
                        new SetBoundsCommand(new Rectangle(0, 150, 200, 100)),
                        new MinimizeInternalFrameCommand()));
        addInternalFrame(desktopPane, internalFrameCreationCmd,
                new ChainCommand<JComponent>(new BackgroundColorCommand(Color.green),
                        new SetBoundsCommand(new Rectangle(250, 150, 200, 100)),
                        new MinimizeInternalFrameCommand()));
        desktopPane.setBackground(Color.blue);

        final JTabbedPane tabbed = new JTabbedPane();
        tabbed.addTab("Buttons", jspButtons);
        tabbed.addTab("Text", jspText);
        tabbed.addTab("Scroll", coloredScrollPane);
        tabbed.addTab("Cells", jspCells);
        tabbed.addTab("Desktop", desktopPane);
        tabbed.addTab("Other", jspOther);
        tabbed.addTab("Yellow / Magenta", new JPanel());
        tabbed.setBackgroundAt(tabbed.getTabCount() - 1, Color.yellow);
        tabbed.setForegroundAt(tabbed.getTabCount() - 1, Color.magenta);
        tabbed.addTab("Green / Blue", new JPanel());
        tabbed.setBackgroundAt(tabbed.getTabCount() - 1, Color.green);
        tabbed.setForegroundAt(tabbed.getTabCount() - 1, Color.blue);
        tabbed.addTab("Dark Green", new JPanel());
        tabbed.setBackgroundAt(tabbed.getTabCount() - 1, Color.green.darker());
        tabbed.addTab("Disabled Green / Red", new JPanel());
        tabbed.setBackgroundAt(tabbed.getTabCount() - 1, Color.green);
        tabbed.setForegroundAt(tabbed.getTabCount() - 1, Color.red.darker());
        tabbed.setEnabledAt(tabbed.getTabCount() - 1, false);

        this.add(tabbed, BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.LEFT));
        final JSlider colorizationSlider = new JSlider(0, 100, 50);
        SubstanceCortex.ComponentOrParentChainScope.setColorizationFactor(this, 0.5);
        colorizationSlider.addChangeListener((ChangeEvent e) -> {
            double val = colorizationSlider.getValue() / 100.0;
            SubstanceCortex.ComponentOrParentChainScope
                    .setColorizationFactor(ColorizedControlsPanel.this, val);
            tabbed.repaint();
        });
        controls.add(colorizationSlider);
        this.add(controls, BorderLayout.NORTH);

        this.isInitialized = true;
    }
}
