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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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
import java.awt.Component;
import java.awt.Font;
import java.util.LinkedList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultListCellRenderer;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.FormLayout;

public class SizesPanel extends JPanel {
    private static interface Creator {
        public JComponent create(int fontSize);
    }

    private static class Mapping {
        public String caption;

        public Creator creator;

        public Mapping(String caption, Creator creator) {
            super();
            this.caption = caption;
            this.creator = creator;
        }
    }

    private List<Mapping> model;

    private JScrollPane central;

    public SizesPanel() {
        this.model = new LinkedList<Mapping>();
        Font base = new Font("Tahoma", Font.PLAIN, 11);
        if (UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel) {
            base = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet("Substance", null)
                    .getControlFont();
        }
        final Font baseFinal = base;
        this.model.add(new Mapping("buttons", new Creator() {
            public JComponent create(int fontSize) {
                JButton result = new JButton("size " + fontSize);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("toggle buttons", new Creator() {
            public JComponent create(int fontSize) {
                JToggleButton result = new JToggleButton("size " + fontSize);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("check boxes", new Creator() {
            public JComponent create(int fontSize) {
                JCheckBox result = new JCheckBox("size " + fontSize);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("radio buttons", new Creator() {
            public JComponent create(int fontSize) {
                JRadioButton result = new JRadioButton("size " + fontSize);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("combo boxes", new Creator() {
            public JComponent create(int fontSize) {
                JComboBox result = new JComboBox(new Object[] { "size " + fontSize });
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("editable combo boxes", new Creator() {
            public JComponent create(int fontSize) {
                JComboBox result = new JComboBox(new Object[] { "size " + fontSize });
                result.setEditable(true);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("spinners", new Creator() {
            public JComponent create(int fontSize) {
                JSpinner result = new JSpinner(
                        new SpinnerNumberModel(fontSize, fontSize - 10, fontSize + 10, 1));
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("text fields", new Creator() {
            public JComponent create(int fontSize) {
                JTextField result = new JTextField("size " + fontSize);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("locked text fields", new Creator() {
            public JComponent create(int fontSize) {
                JTextField result = new JTextField("size " + fontSize);
                result.setEditable(false);
                SubstanceCortex.ComponentScope.setLockIconVisible(result, true);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("password fields", new Creator() {
            public JComponent create(int fontSize) {
                JPasswordField result = new JPasswordField("size " + fontSize);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        // this.model.add(new Mapping("scroll bars", new Creator() {
        // public JComponent create(int fontSize) {
        // JScrollBar result = new JScrollBar(JScrollBar.HORIZONTAL);
        // result.setFont(baseFinal.deriveFont((float) fontSize));
        // return result;
        // }
        // }));
        this.model.add(new Mapping("progress bars", new Creator() {
            public JComponent create(int fontSize) {
                JProgressBar result = new JProgressBar(JProgressBar.HORIZONTAL);
                result.setMinimum(0);
                result.setMaximum(100);
                result.setValue(60);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("progress bars 2", new Creator() {
            public JComponent create(int fontSize) {
                JProgressBar result = new JProgressBar(JProgressBar.HORIZONTAL);
                result.setMinimum(0);
                result.setMaximum(100);
                result.setValue(60);
                result.setStringPainted(true);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("sliders", new Creator() {
            public JComponent create(int fontSize) {
                JSlider result = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("sliders 2", new Creator() {
            public JComponent create(int fontSize) {
                JSlider result = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
                result.setMajorTickSpacing(20);
                result.setMinorTickSpacing(5);
                result.setPaintLabels(true);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("sliders 3", new Creator() {
            public JComponent create(int fontSize) {
                JSlider result = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
                result.setMajorTickSpacing(20);
                result.setMinorTickSpacing(5);
                result.setPaintTicks(true);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("sliders 4", new Creator() {
            public JComponent create(int fontSize) {
                JSlider result = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
                result.setMajorTickSpacing(20);
                result.setMinorTickSpacing(5);
                result.setPaintTicks(true);
                result.setPaintLabels(true);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("trees", new Creator() {
            public JComponent create(int fontSize) {
                DefaultMutableTreeNode root = new DefaultMutableTreeNode("size " + fontSize);
                DefaultMutableTreeNode son1 = new DefaultMutableTreeNode("son1");
                DefaultMutableTreeNode gson11 = new DefaultMutableTreeNode("gson11");
                son1.add(gson11);
                root.add(son1);
                JTree result = new JTree(root);
                // result.setRootVisible(false);
                // result.setShowsRootHandles(true);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("lists", new Creator() {
            public JComponent create(int fontSize) {
                JList result = new JList(new Object[] { "item1", "item2" });
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));
        this.model.add(new Mapping("tables", new Creator() {
            public JComponent create(int fontSize) {
                DefaultTableModel model = new DefaultTableModel() {
                    @Override
                    public int getRowCount() {
                        return 2;
                    }

                    @Override
                    public int getColumnCount() {
                        return 3;
                    }

                    @Override
                    public Object getValueAt(int row, int column) {
                        return row + ":" + column;
                    }

                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }

                    @Override
                    public String getColumnName(int column) {
                        return "Column " + column;
                    }
                };
                JTable result = new JTable(model);
                result.setFont(baseFinal.deriveFont((float) fontSize));
                return result;
            }
        }));

        final JList list = new JList(new AbstractListModel() {
            public Object getElementAt(int index) {
                return model.get(index);
            }

            public int getSize() {
                return model.size();
            }
        });
        if (UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel) {
            list.setCellRenderer(new SubstanceDefaultListCellRenderer() {
                @Override
                public Component getListCellRendererComponent(JList list, Object value, int index,
                        boolean isSelected, boolean cellHasFocus) {
                    return super.getListCellRendererComponent(list, ((Mapping) value).caption,
                            index, isSelected, cellHasFocus);
                }
            });
        }
        this.setLayout(new BorderLayout());
        this.add(new JScrollPane(list), BorderLayout.WEST);

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list.getSelectionModel().addListSelectionListener(
                (ListSelectionEvent e) -> SwingUtilities.invokeLater(() -> {
                    if (central != null)
                        remove(central);
                    central = null;

                    int selIndex = list.getSelectedIndex();
                    if (selIndex >= 0) {
                        Mapping sel = (Mapping) list.getSelectedValue();
                        FormLayout lm = new FormLayout("right:pref, 4dlu, left:pref:grow", "");
                        DefaultFormBuilder builder = new DefaultFormBuilder(lm,
                                new ScrollablePanel()).border(Borders.DIALOG);
                        for (int fontSize = 11; fontSize < 25; fontSize++) {
                            builder.append(fontSize + " pixels", sel.creator.create(fontSize));
                        }
                        builder.append("72 pixels", sel.creator.create(72));
                        central = new JScrollPane(builder.getPanel(),
                                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                        add(central, BorderLayout.CENTER);
                        doLayout();
                        revalidate();
                    }
                }));
    }
}
