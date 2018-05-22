/*
 * @(#)HTMLChooser.java  1.5  2006-04-23
 *
 * Copyright (c) 2005 Werner Randelshofer
 * Staldenmattweg 2, Immensee, CH-6405, Switzerland.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Werner Randelshofer. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Werner Randelshofer.
 */

package org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.HashMap;

import javax.swing.Icon;
import javax.swing.UIManager;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.VisualMargin;
/**
 * HTMLChooser.
 *
 * @author  Werner Randelshofer
 * @version 1.5 2006-04-23 Retrieve labels from UIManager. 
 * <br>1.4 2005-11-22 Moved handler for text fields into separate class.
 * <br>1.3.1 2005-11-07 Get "Labels" resource bundle from UIManager.
 * <br>1.3 2005-09-05 Get font,spacing and icon from UIManager.
 * <br>1.2 2005-08-28 Remember last selection state of "webSaveCheckBox". 
 * <br>1.1.1 2005-06-19 Sliders were not updated when a color was entered
 * into the HTML field.
 * <br>1.1 2005-04-18 Localized form.
 * <br>1.0  29 March 2005  Created.
 */
public class HTMLChooser extends AbstractColorChooserPanel implements UIResource {
    private HTMLColorSliderModel ccModel = new HTMLColorSliderModel();
    private ChangeListener htmlListener;
    
    /**
     * This is used to remember the last selection state of the "webSaveCheckBox".
     */
    private static boolean lastWebSaveSelectionState = false;
    
    /**
     * We have to prevent us from constantly updating the color model, because
     * the gray chooser is not able to preserve all color components.
     */
    private int updateRecursion;
    
    /**
     * W3C HTML 4.1 well known color names.
     */
    private final static Object[][] colorNames = {
        {"Black", new Color(0x000000)},
        {"Green", new Color(0x008000)},
        {"Silver", new Color(0xC0C0C0)},
        {"Lime", new Color(0x00FF00)},
        {"Gray", new Color(0x808080)},
        {"Olive", new Color(0x808000)},
        {"White", new Color(0xFFFFFF)},
        {"Yellow", new Color(0xFFFF00)},
        {"Maroon", new Color(0x800000)},
        {"Navy", new Color(0x000080)},
        {"Red", new Color(0xFF0000)},
        {"Blue", new Color(0x0000FF)},
        {"Purple", new Color(0x800080)},
        {"Teal", new Color(0x008080)},
        {"Fuchsia", new Color(0xFF00FF)},
        {"Aqua", new Color(0x00FF)}
    };
    private final static HashMap nameToColorMap = new HashMap();
    static {
        for (int i=0; i < colorNames.length; i++) {
            nameToColorMap.put(((String) colorNames[i][0]).toLowerCase(), colorNames[i][1]);
        }
    }
    
    
    /** Creates new form. */
    public HTMLChooser() {
        initComponents();
        
        //
        Font font = UIManager.getFont("ColorChooser.font");
        redLabel.setFont(font);
        redSlider.setFont(font);
        redField.setFont(font);
        greenLabel.setFont(font);
        greenField.setFont(font);
        greenSlider.setFont(font);
        blueLabel.setFont(font);
        blueSlider.setFont(font);
        blueField.setFont(font);
        htmlLabel.setFont(font);
        htmlField.setFont(font);
        webSaveCheckBox.setFont(font);
        //
        int textSliderGap = UIManager.getInt("ColorChooser.textSliderGap");
        if (textSliderGap != 0) {
            Insets fieldInsets = new Insets(0,textSliderGap,0,0);
            GridBagLayout layout = (GridBagLayout) getLayout();
            GridBagConstraints gbc;
            gbc = layout.getConstraints(redField);
            gbc.insets = fieldInsets;
            layout.setConstraints(redField, gbc);
            gbc = layout.getConstraints(greenField);
            gbc.insets = fieldInsets;
            layout.setConstraints(greenField, gbc);
            gbc = layout.getConstraints(blueField);
            gbc.insets = fieldInsets;
            layout.setConstraints(blueField, gbc);
        }
        
        webSaveCheckBox.setSelected(lastWebSaveSelectionState);
        redSlider.setSnapToTicks(lastWebSaveSelectionState);
        greenSlider.setSnapToTicks(lastWebSaveSelectionState);
        blueSlider.setSnapToTicks(lastWebSaveSelectionState);
        

        htmlListener = (ChangeEvent e) -> {
            Color c = ccModel.getColor();
            setColorToModel(c);
            if (!c.equals(nameToColorMap.get(htmlField.getText().toLowerCase()))) {
                if (!htmlField.hasFocus()) {
                    String hex = Integer.toHexString(0xffffff & c.getRGB());
                    StringBuffer buf = new StringBuffer(7);
                    buf.append('#');
                    for (int i = hex.length(); i < 6; i++) {
                        buf.append('0');
                    }
                    buf.append(hex.toUpperCase());
                    if (!htmlField.getText().equals(buf.toString())) {
                        htmlField.setText(buf.toString());
                    }
                }
            }
        };
        
        updateRecursion++;
        
        ccModel = new HTMLColorSliderModel();
        ccModel.setWebSaveOnly(lastWebSaveSelectionState);
        ccModel.configureColorSlider(0, redSlider);
        ccModel.configureColorSlider(1, greenSlider);
        ccModel.configureColorSlider(2, blueSlider);
        new ColorSliderTextFieldHandler(redField, ccModel, 0);
        new ColorSliderTextFieldHandler(greenField, ccModel, 1);
        new ColorSliderTextFieldHandler(blueField, ccModel, 2);
        ccModel.addChangeListener(htmlListener);
        
        redFieldFocusLost(null);
        greenFieldFocusLost(null);
        blueFieldFocusLost(null);
        htmlFieldFocusLost(null);
        updateRecursion--;
        redField.setMinimumSize(redField.getPreferredSize());
        greenField.setMinimumSize(greenField.getPreferredSize());
        blueField.setMinimumSize(blueField.getPreferredSize());
        htmlPanel.setMinimumSize(htmlPanel.getPreferredSize());
        VisualMargin bm = new VisualMargin(false,false,true,false);
        redLabel.setBorder(bm);
        greenLabel.setBorder(bm);
        blueLabel.setBorder(bm);
    }
    protected void buildChooser() {
    }
    
    public String getDisplayName() {
        return UIManager.getString("ColorChooser.htmlSliders");
    }
    
    public Icon getLargeDisplayIcon() {
        return UIManager.getIcon("ColorChooser.colorSlidersIcon");
    }
    
    public Icon getSmallDisplayIcon() {
        return getLargeDisplayIcon();
    }
    
    public void updateChooser() {
        if (updateRecursion == 0) {
            updateRecursion++;
            if (ccModel.isWebSaveOnly()) {
                Color c = getColorFromModel();
                if (! HTMLColorSliderModel.isWebSave(c.getRGB())) {
                    webSaveCheckBox.setSelected(false);
                }
            }
            ccModel.setColor(getColorFromModel());
            
            updateRecursion--;
        }
    }
    
    public void setColorToModel(Color color) {
        if (updateRecursion == 0) {
            updateRecursion++;
            getColorSelectionModel().setSelectedColor(color);
            updateRecursion--;
        }
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        redLabel = new javax.swing.JLabel();
        redSlider = new javax.swing.JSlider();
        redField = new javax.swing.JTextField();
        greenLabel = new javax.swing.JLabel();
        greenField = new javax.swing.JTextField();
        greenSlider = new javax.swing.JSlider();
        blueLabel = new javax.swing.JLabel();
        blueSlider = new javax.swing.JSlider();
        blueField = new javax.swing.JTextField();
        htmlPanel = new javax.swing.JPanel();
        htmlLabel = new javax.swing.JLabel();
        htmlField = new javax.swing.JTextField();
        webSaveCheckBox = new javax.swing.JCheckBox();
        springPanel = new javax.swing.JPanel();

        setLayout(new java.awt.GridBagLayout());
        boolean isLtr = getComponentOrientation().isLeftToRight();
        Insets tfInsets = new java.awt.Insets(1, isLtr ? 4 : 0, 0, isLtr ? 0 : 4);

        redLabel.setText(UIManager.getString("ColorChooser.rgbRedText"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 0, 0);
        add(redLabel, gridBagConstraints);

        redSlider.setMajorTickSpacing(255);
        redSlider.setMaximum(255);
        redSlider.setMinorTickSpacing(51);
        redSlider.setPaintTicks(true);
        redSlider.setSnapToTicks(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        add(redSlider, gridBagConstraints);

        redField.setColumns(3);
        redField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        redField.setText("0");
        redField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                redFieldFocusLost(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = tfInsets;
        add(redField, gridBagConstraints);

        greenLabel.setText(UIManager.getString("ColorChooser.rgbGreenText"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 0, 0);
        add(greenLabel, gridBagConstraints);

        greenField.setColumns(3);
        greenField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        greenField.setText("0");
        greenField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                greenFieldFocusLost(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = tfInsets;
        add(greenField, gridBagConstraints);

        greenSlider.setMajorTickSpacing(255);
        greenSlider.setMaximum(255);
        greenSlider.setMinorTickSpacing(51);
        greenSlider.setPaintTicks(true);
        greenSlider.setSnapToTicks(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        add(greenSlider, gridBagConstraints);

        blueLabel.setText(UIManager.getString("ColorChooser.rgbBlueText"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 0, 0);
        add(blueLabel, gridBagConstraints);

        blueSlider.setMajorTickSpacing(255);
        blueSlider.setMaximum(255);
        blueSlider.setMinorTickSpacing(51);
        blueSlider.setPaintTicks(true);
        blueSlider.setSnapToTicks(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        add(blueSlider, gridBagConstraints);

        blueField.setColumns(3);
        blueField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        blueField.setText("0");
        blueField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                blueFieldFocusLost(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = tfInsets;
        add(blueField, gridBagConstraints);

        htmlPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        htmlLabel.setText(UIManager.getString("ColorChooser.htmlText"));
        htmlLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 4));
        htmlPanel.add(htmlLabel);

        htmlField.setColumns(7);
        htmlField.setText("#000000");
        htmlField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                htmlFieldFocusLost(evt);
            }
        });

        htmlPanel.add(htmlField);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        add(htmlPanel, gridBagConstraints);

        webSaveCheckBox.setText(UIManager.getString("ColorChooser.htmlChooseOnlyWebSaveColorsText"));
        webSaveCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                webSaveChanged(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(webSaveCheckBox, gridBagConstraints);

        springPanel.setLayout(new java.awt.BorderLayout());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 100;
        gridBagConstraints.weighty = 1.0;
        add(springPanel, gridBagConstraints);

    }// </editor-fold>//GEN-END:initComponents
    
    private void blueFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_blueFieldFocusLost
        String hex = Integer.toHexString(ccModel.getBoundedRangeModel(2).getValue()).toUpperCase();
        blueField.setText((hex.length() == 1) ? "0"+hex : hex);
    }//GEN-LAST:event_blueFieldFocusLost
    
    private void greenFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_greenFieldFocusLost
        String hex = Integer.toHexString(ccModel.getBoundedRangeModel(1).getValue()).toUpperCase();
        greenField.setText((hex.length() == 1) ? "0"+hex : hex);
    }//GEN-LAST:event_greenFieldFocusLost
    
    private void redFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_redFieldFocusLost
        String hex = Integer.toHexString(ccModel.getBoundedRangeModel(0).getValue()).toUpperCase();
        redField.setText((hex.length() == 1) ? "0"+hex : hex);
    }//GEN-LAST:event_redFieldFocusLost
    
    private void htmlFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_htmlFieldFocusLost
        Color mc = ccModel.getColor();
        
        Color fc = (Color) nameToColorMap.get(htmlField.getText().toLowerCase());
        if (fc == null || ! fc.equals(mc)) {
            String hex = Integer.toHexString(0xffffff & mc.getRGB());
            StringBuffer buf = new StringBuffer(7);
            buf.append('#');
            for (int i=hex.length(); i < 6; i++) {
                buf.append('0');
            }
            buf.append(hex.toUpperCase());
            htmlField.setText(buf.toString());
        }
    }//GEN-LAST:event_htmlFieldFocusLost
    
    private void webSaveChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_webSaveChanged
      
        
        // TODO add your handling code here:
        boolean b = webSaveCheckBox.isSelected();
        redSlider.setSnapToTicks(b);
        greenSlider.setSnapToTicks(b);
        blueSlider.setSnapToTicks(b);
        lastWebSaveSelectionState = b;
        /*
        redSlider.repaint();
        greenSlider.repaint();
        blueSlider.repaint();
         */
        ccModel.setWebSaveOnly(b);
        
    }//GEN-LAST:event_webSaveChanged
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField blueField;
    private javax.swing.JLabel blueLabel;
    private javax.swing.JSlider blueSlider;
    private javax.swing.JTextField greenField;
    private javax.swing.JLabel greenLabel;
    private javax.swing.JSlider greenSlider;
    private javax.swing.JTextField htmlField;
    private javax.swing.JLabel htmlLabel;
    private javax.swing.JPanel htmlPanel;
    private javax.swing.JTextField redField;
    private javax.swing.JLabel redLabel;
    private javax.swing.JSlider redSlider;
    private javax.swing.JPanel springPanel;
    private javax.swing.JCheckBox webSaveCheckBox;
    // End of variables declaration//GEN-END:variables
    
}
