/*
 * @(#)CMYKChooser.java  1.4  2006-04-23
 *
 * Copyright (c) 2004-2006 Werner Randelshofer
 * Staldenmattweg 2, Immensee, CH-6405, Switzerland.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Werner Randelshofer. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entecyan into
 * with Werner Randelshofer.
 */

package org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.VisualMargin;

/**
 * A color chooser with CMYK color sliders.
 *
 * @author  Werner Randelshofer
 * @version 1.4 2006-04-23 Get labels directly from UIManager.
 * <br>1.3 2005-11-22 Moved handler for text fields into separate class.
 * <br>1.2.2 2005-11-22 If the user enters a non-numeric value, set the
 * corresponding bounded range model to 0.
 * <br>1.2.1 2005-11-07 Get "Labels" ResourceBundle from UIManager.
 * <br>1.2 2005-09-05 Get font, spacing and icon from UIManager.
 * <br>1.1.1 2005-05-23 Localized form.
 * <br>1.0  29 March 2005  Created.
 */
public class CMYKChooser
extends AbstractColorChooserPanel
implements UIResource {
    private ColorSliderModel ccModel;
    private int updateRecursion = 0;
    
    
    /** Creates new form. */
    public CMYKChooser() {
        initComponents();
        
        //
        Font font = UIManager.getFont("ColorChooser.font");
        cyanLabel.setFont(font);
        cyanSlider.setFont(font);
        cyanField.setFont(font);
        cyanFieldLabel.setFont(font);
        magentaLabel.setFont(font);
        magentaSlider.setFont(font);
        magentaField.setFont(font);
        magentaFieldLabel.setFont(font);
        yellowLabel.setFont(font);
        yellowSlider.setFont(font);
        yellowField.setFont(font);
        yellowFieldLabel.setFont(font);
        blackLabel.setFont(font);
        blackSlider.setFont(font);
        blackField.setFont(font);
        blackFieldLabel.setFont(font);
        //
        int textSliderGap = UIManager.getInt("ColorChooser.textSliderGap");
        if (textSliderGap != 0) {
            Border fieldBorder = new EmptyBorder(0,textSliderGap,0,0);
            cyanFieldPanel.setBorder(fieldBorder);
            magentaFieldPanel.setBorder(fieldBorder);
            yellowFieldPanel.setBorder(fieldBorder);
            blackFieldPanel.setBorder(fieldBorder);
        }
        
        ccModel = new NominalCMYKColorSliderModel();
        /* Unfortunately the following does not work due to Java bug #4760025 as
         * described at http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4760025
        InputStream in = null;
        try {
            in = new FileInputStream("/System/Library/ColorSync/Profiles/Generic CMYK Profile.icc");
            ccModel = new ICC_CMYKColorSliderModel(in);
        } catch (IOException e) {
            e.printStackTrace();
            ccModel = new NominalCMYKColorSliderModel();
        } finally {
            try {
                if (in != null) in.close();
            } catch (IOException e) {
                // suppress
            }
        }*/
        
        ccModel.configureColorSlider(0, cyanSlider);
        ccModel.configureColorSlider(1, magentaSlider);
        ccModel.configureColorSlider(2, yellowSlider);
        ccModel.configureColorSlider(3, blackSlider);
        cyanField.setText(Integer.toString(cyanSlider.getValue()));
        magentaField.setText(Integer.toString(magentaSlider.getValue()));
        yellowField.setText(Integer.toString(yellowSlider.getValue()));
        blackField.setText(Integer.toString(blackSlider.getValue()));
        Insets borderMargin = (Insets) UIManager.getInsets("Component.visualMargin").clone();
        borderMargin.left = 3 - borderMargin.left;
        cyanFieldLabel.putClientProperty("Quaqua.Component.visualMargin",borderMargin);
        magentaFieldLabel.putClientProperty("Quaqua.Component.visualMargin",borderMargin);
        yellowFieldLabel.putClientProperty("Quaqua.Component.visualMargin",borderMargin);
        blackFieldLabel.putClientProperty("Quaqua.Component.visualMargin",borderMargin);
        
        new ColorSliderTextFieldHandler(cyanField, ccModel, 0);
        new ColorSliderTextFieldHandler(magentaField, ccModel, 1);
        new ColorSliderTextFieldHandler(yellowField, ccModel, 2);
        new ColorSliderTextFieldHandler(blackField, ccModel, 3);
        
        ccModel.addChangeListener((ChangeEvent e) -> setColorToModel(ccModel.getColor()));
        cyanField.setMinimumSize(cyanField.getPreferredSize());
        magentaField.setMinimumSize(magentaField.getPreferredSize());
        yellowField.setMinimumSize(yellowField.getPreferredSize());
        blackField.setMinimumSize(blackField.getPreferredSize());
        
        VisualMargin bm = new VisualMargin(false,false,true,false);
        cyanLabel.setBorder(bm);
        magentaLabel.setBorder(bm);
        yellowLabel.setBorder(bm);
        blackLabel.setBorder(bm);
    }
    
    protected void buildChooser() {
    }
    
    public String getDisplayName() {
        return UIManager.getString("ColorChooser.cmykSliders");
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

        cyanLabel = new javax.swing.JLabel();
        cyanSlider = new javax.swing.JSlider();
        cyanFieldPanel = new javax.swing.JPanel();
        cyanField = new javax.swing.JTextField();
        cyanFieldLabel = new javax.swing.JLabel();
        magentaLabel = new javax.swing.JLabel();
        magentaSlider = new javax.swing.JSlider();
        magentaFieldPanel = new javax.swing.JPanel();
        magentaField = new javax.swing.JTextField();
        magentaFieldLabel = new javax.swing.JLabel();
        yellowLabel = new javax.swing.JLabel();
        yellowSlider = new javax.swing.JSlider();
        yellowFieldPanel = new javax.swing.JPanel();
        yellowField = new javax.swing.JTextField();
        yellowFieldLabel = new javax.swing.JLabel();
        blackLabel = new javax.swing.JLabel();
        blackSlider = new javax.swing.JSlider();
        blackFieldPanel = new javax.swing.JPanel();
        blackField = new javax.swing.JTextField();
        blackFieldLabel = new javax.swing.JLabel();
        springPanel = new javax.swing.JPanel();

        setLayout(new java.awt.GridBagLayout());
        boolean isLtr = getComponentOrientation().isLeftToRight();
        Insets tfInsets = new java.awt.Insets(1, isLtr ? 4 : 0, 0, isLtr ? 0 : 4);

        cyanLabel.setText(UIManager.getString("ColorChooser.cmykCyanText"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 0, 0);
        add(cyanLabel, gridBagConstraints);

        cyanSlider.setMajorTickSpacing(100);
        cyanSlider.setMinorTickSpacing(50);
        cyanSlider.setPaintTicks(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        add(cyanSlider, gridBagConstraints);

        cyanFieldPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        cyanField.setColumns(3);
        cyanField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        cyanField.setText("0");
        cyanField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cyanFieldFocusLost(evt);
            }
        });

        cyanFieldPanel.add(cyanField);

        cyanFieldLabel.setText("%");
        cyanFieldPanel.add(cyanFieldLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = tfInsets;
        add(cyanFieldPanel, gridBagConstraints);

        magentaLabel.setText(UIManager.getString("ColorChooser.cmykMagentaText"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 0, 0);
        add(magentaLabel, gridBagConstraints);

        magentaSlider.setMajorTickSpacing(100);
        magentaSlider.setMinorTickSpacing(50);
        magentaSlider.setPaintTicks(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        add(magentaSlider, gridBagConstraints);

        magentaFieldPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        magentaField.setColumns(3);
        magentaField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        magentaField.setText("0");
        magentaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                magentaFieldFocusLost(evt);
            }
        });

        magentaFieldPanel.add(magentaField);

        magentaFieldLabel.setText("%");
        magentaFieldPanel.add(magentaFieldLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = tfInsets;
        add(magentaFieldPanel, gridBagConstraints);

        yellowLabel.setText(UIManager.getString("ColorChooser.cmykYellowText"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 0, 0);
        add(yellowLabel, gridBagConstraints);

        yellowSlider.setMajorTickSpacing(100);
        yellowSlider.setMinorTickSpacing(50);
        yellowSlider.setPaintTicks(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        add(yellowSlider, gridBagConstraints);

        yellowFieldPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        yellowField.setColumns(3);
        yellowField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        yellowField.setText("0");
        yellowField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                yellowFieldFocusLost(evt);
            }
        });

        yellowFieldPanel.add(yellowField);

        yellowFieldLabel.setText("%");
        yellowFieldPanel.add(yellowFieldLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = tfInsets;
        add(yellowFieldPanel, gridBagConstraints);

        blackLabel.setText(UIManager.getString("ColorChooser.cmykBlackText"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 0, 0);
        add(blackLabel, gridBagConstraints);

        blackSlider.setMajorTickSpacing(100);
        blackSlider.setMinorTickSpacing(50);
        blackSlider.setPaintTicks(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        add(blackSlider, gridBagConstraints);

        blackFieldPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        blackField.setColumns(3);
        blackField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        blackField.setText("0");
        blackField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                blackFieldFocusLost(evt);
            }
        });

        blackFieldPanel.add(blackField);

        blackFieldLabel.setText("%");
        blackFieldPanel.add(blackFieldLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = tfInsets;
        add(blackFieldPanel, gridBagConstraints);

        springPanel.setLayout(new java.awt.BorderLayout());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 100;
        gridBagConstraints.weighty = 1.0;
        add(springPanel, gridBagConstraints);

    }// </editor-fold>//GEN-END:initComponents
    
    private void blackFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_blackFieldFocusLost
        blackField.setText(Integer.toString(ccModel.getBoundedRangeModel(3).getValue()));
    }//GEN-LAST:event_blackFieldFocusLost
    
    private void yellowFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yellowFieldFocusLost
        yellowField.setText(Integer.toString(ccModel.getBoundedRangeModel(2).getValue()));
    }//GEN-LAST:event_yellowFieldFocusLost
    
    private void magentaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_magentaFieldFocusLost
        magentaField.setText(Integer.toString(ccModel.getBoundedRangeModel(1).getValue()));
    }//GEN-LAST:event_magentaFieldFocusLost
    
    private void cyanFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cyanFieldFocusLost
        cyanField.setText(Integer.toString(ccModel.getBoundedRangeModel(0).getValue()));
    }//GEN-LAST:event_cyanFieldFocusLost
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField blackField;
    private javax.swing.JLabel blackFieldLabel;
    private javax.swing.JPanel blackFieldPanel;
    private javax.swing.JLabel blackLabel;
    private javax.swing.JSlider blackSlider;
    private javax.swing.JTextField cyanField;
    private javax.swing.JLabel cyanFieldLabel;
    private javax.swing.JPanel cyanFieldPanel;
    private javax.swing.JLabel cyanLabel;
    private javax.swing.JSlider cyanSlider;
    private javax.swing.JTextField magentaField;
    private javax.swing.JLabel magentaFieldLabel;
    private javax.swing.JPanel magentaFieldPanel;
    private javax.swing.JLabel magentaLabel;
    private javax.swing.JSlider magentaSlider;
    private javax.swing.JPanel springPanel;
    private javax.swing.JTextField yellowField;
    private javax.swing.JLabel yellowFieldLabel;
    private javax.swing.JPanel yellowFieldPanel;
    private javax.swing.JLabel yellowLabel;
    private javax.swing.JSlider yellowSlider;
    // End of variables declaration//GEN-END:variables
    
}
