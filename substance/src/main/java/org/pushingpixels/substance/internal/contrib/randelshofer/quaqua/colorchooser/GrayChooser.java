/*
 * @(#)GrayChooser.java  1.4  2006-04-23
 *
 * Copyright (c) 2005-2006 Werner Randelshofer
 * Staldenmattweg 2, Immensee, CH-6405, Switzerland.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Werner Randelshofer. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entehue into
 * with Werner Randelshofer.
 */

package org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.VisualMargin;

/**
 * A color chooser with a brightness slider.
 *
 * @author  Werner Randelshofer
 * @version 1.4 2006-04-23 Retrieve labels from UIManager. 
 * <br>1.3 2005-11-22 Moved handler for text fields into separate class.
 * <br>1.2.1 2005-11-07 Get "Labels" ResourceBundle from UIManager.
 * <br>1.2 2005-09-05 Get font, spacing and icon from UIManager.
 * <br>1.1.1 2005-04-23 Localized form. Added color swatches for 0%, 25%, 50%,
 * 75% and 100% brightness.
 * <br>1.0  29 March 2005  Created.
 */
public class GrayChooser extends AbstractColorChooserPanel implements UIResource {
    private ColorSliderModel ccModel = new GrayColorSliderModel();
    
    /** Creates new form. */
    public GrayChooser() {
        initComponents();
        
        Font font = UIManager.getFont("ColorChooser.font");
        brightnessLabel.setFont(font);
        brightnessSlider.setFont(font);
        brightnessField.setFont(font);
        brightnessFieldLabel.setFont(font);
        zeroPercentButton.setFont(font);
        twentyFivePercentButton.setFont(font);
        fiftyPercentButton.setFont(font);
        seventyFivePercentButton.setFont(font);
        //
        int textSliderGap = UIManager.getInt("ColorChooser.textSliderGap");
        if (textSliderGap != 0) {
            Border fieldBorder = new EmptyBorder(0,textSliderGap,0,0);
            brightnessFieldPanel.setBorder(fieldBorder);
        }
        
        
        ccModel.configureColorSlider(0, brightnessSlider);
        brightnessField.setText(Integer.toString(brightnessSlider.getValue()));
        Insets borderMargin = (Insets) UIManager.getInsets("Component.visualMargin").clone();
        borderMargin.left = 3 - borderMargin.left;
        brightnessFieldLabel.putClientProperty("Quaqua.Component.visualMargin",borderMargin);

        new ColorSliderTextFieldHandler(brightnessField, ccModel, 0);

        ccModel.addChangeListener((ChangeEvent e) ->  {
            if (updateRecursion == 0) {
                setColorToModel(ccModel.getColor());
            }
        });
        brightnessField.setMinimumSize(brightnessField.getPreferredSize());
        
        VisualMargin bm = new VisualMargin(false,false,true,false);
        brightnessLabel.setBorder(bm);
        Border b = new CompoundBorder(new VisualMargin(), new SmallColorWellBorder());
        zeroPercentButton.setBorder(b);
        twentyFivePercentButton.setBorder(b);
        fiftyPercentButton.setBorder(b);
        seventyFivePercentButton.setBorder(b);
        hundredPercentButton.setBorder(b);
        Insets bmInsets = UIManager.getInsets("Component.visualMargin");
        Dimension d = new Dimension(12+bmInsets.left+bmInsets.right,12+bmInsets.top+bmInsets.bottom);
        zeroPercentButton.setPreferredSize(d);
        twentyFivePercentButton.setPreferredSize(d);
        fiftyPercentButton.setPreferredSize(d);
        seventyFivePercentButton.setPreferredSize(d);
        hundredPercentButton.setPreferredSize(d);
    }
    
    protected void buildChooser() {
    }
    
    public String getDisplayName() {
        return UIManager.getString("ColorChooser.grayScaleSlider");
    }
    
    public Icon getLargeDisplayIcon() {
        return UIManager.getIcon("ColorChooser.colorSlidersIcon");
    }
    
    public Icon getSmallDisplayIcon() {
        return getLargeDisplayIcon();
    }
    
    /**
     * We have to prevent us from constantly updating the color model, because
     * the gray chooser is not able to preserve all color components.
     */
    private int updateRecursion;
    
    public void updateChooser() {
        updateRecursion++;
        Color cfm = getColorFromModel();
            ccModel.setColor(cfm);
        updateRecursion--;
    }
    public void setColorToModel(Color color) {
        getColorSelectionModel().setSelectedColor(color);
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        brightnessLabel = new javax.swing.JLabel();
        brightnessSlider = new javax.swing.JSlider();
        brightnessFieldPanel = new javax.swing.JPanel();
        brightnessField = new javax.swing.JTextField();
        brightnessFieldLabel = new javax.swing.JLabel();
        springPanel = new javax.swing.JPanel();
        percentPanel = new javax.swing.JPanel();
        zeroPercentButton = new javax.swing.JButton();
        twentyFivePercentButton = new javax.swing.JButton();
        fiftyPercentButton = new javax.swing.JButton();
        seventyFivePercentButton = new javax.swing.JButton();
        hundredPercentButton = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());
        boolean isLtr = getComponentOrientation().isLeftToRight();
        Insets tfInsets = new java.awt.Insets(1, isLtr ? 4 : 0, 0, isLtr ? 0 : 4);

        brightnessLabel.setText(UIManager.getString("ColorChooser.hsbBrightnessText"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 0, 0);
        add(brightnessLabel, gridBagConstraints);

        brightnessSlider.setMajorTickSpacing(100);
        brightnessSlider.setMinorTickSpacing(50);
        brightnessSlider.setPaintTicks(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        add(brightnessSlider, gridBagConstraints);

        brightnessFieldPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        brightnessField.setColumns(3);
        brightnessField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        brightnessField.setText("0");
        brightnessField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                brightnessFieldFocusLost(evt);
            }
        });

        brightnessFieldPanel.add(brightnessField);

        brightnessFieldLabel.setText("%");
        brightnessFieldPanel.add(brightnessFieldLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = tfInsets;
        add(brightnessFieldPanel, gridBagConstraints);

        springPanel.setLayout(new java.awt.BorderLayout());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 100;
        gridBagConstraints.weighty = 1.0;
        add(springPanel, gridBagConstraints);

        percentPanel.setLayout(new java.awt.GridBagLayout());

        zeroPercentButton.setBackground(new java.awt.Color(0, 0, 0));
        zeroPercentButton.setToolTipText("0 %");
        zeroPercentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        percentPanel.add(zeroPercentButton, gridBagConstraints);

        twentyFivePercentButton.setBackground(new java.awt.Color(64, 64, 64));
        twentyFivePercentButton.setToolTipText("25 %");
        twentyFivePercentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        percentPanel.add(twentyFivePercentButton, gridBagConstraints);

        fiftyPercentButton.setBackground(new java.awt.Color(128, 128, 128));
        fiftyPercentButton.setToolTipText("50 %");
        fiftyPercentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        percentPanel.add(fiftyPercentButton, gridBagConstraints);

        seventyFivePercentButton.setBackground(new java.awt.Color(192, 192, 192));
        seventyFivePercentButton.setToolTipText("75 %");
        seventyFivePercentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        percentPanel.add(seventyFivePercentButton, gridBagConstraints);

        hundredPercentButton.setBackground(new java.awt.Color(255, 255, 255));
        hundredPercentButton.setToolTipText("100 %");
        hundredPercentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        percentPanel.add(hundredPercentButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(percentPanel, gridBagConstraints);

    }// </editor-fold>//GEN-END:initComponents
    
    private void percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentActionPerformed
        setColorToModel(((JButton) evt.getSource()).getBackground());
    }//GEN-LAST:event_percentActionPerformed
    
    private void brightnessFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_brightnessFieldFocusLost
        brightnessField.setText(Integer.toString(ccModel.getBoundedRangeModel(0).getValue()));
    }//GEN-LAST:event_brightnessFieldFocusLost
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brightnessField;
    private javax.swing.JLabel brightnessFieldLabel;
    private javax.swing.JPanel brightnessFieldPanel;
    private javax.swing.JLabel brightnessLabel;
    private javax.swing.JSlider brightnessSlider;
    private javax.swing.JButton fiftyPercentButton;
    private javax.swing.JButton hundredPercentButton;
    private javax.swing.JPanel percentPanel;
    private javax.swing.JButton seventyFivePercentButton;
    private javax.swing.JPanel springPanel;
    private javax.swing.JButton twentyFivePercentButton;
    private javax.swing.JButton zeroPercentButton;
    // End of variables declaration//GEN-END:variables
    
}
