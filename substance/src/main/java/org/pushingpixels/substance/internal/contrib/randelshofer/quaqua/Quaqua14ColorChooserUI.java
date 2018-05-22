/*
 * @(#)QuaquaColorChooserUI.java  1.1  2005-12-18
 *
 * Copyright (c) 2004 Werner Randelshofer
 * Staldenmattweg 2, Immensee, CH-6405, Switzerland.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Werner Randelshofer. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Werner Randelshofer.
 */

package org.pushingpixels.substance.internal.contrib.randelshofer.quaqua;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.TransferHandler;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser.SubstanceColorChooserPanel;

/**
 * QuaquaColorChooserUI with enhancements for Java 1.4.
 *
 * @author  Werner Randelshofer
 * @version 1.1 2005-12-18 Gracefully handle instantiation failures of 
 * color chooser panels.
 * <br>1.0  29 March 2005  Created.
 */
public class Quaqua14ColorChooserUI extends Quaqua13ColorChooserUI {
    private static TransferHandler defaultTransferHandler = new ColorTransferHandler();
    private MouseListener previewMouseListener;
    
    public static ComponentUI createUI(JComponent c) {
        return new Quaqua14ColorChooserUI();
    }
    
    public void installUI(JComponent c) {
        super.installUI(c);
        chooser.applyComponentOrientation(c.getComponentOrientation());
    }
    
    protected void installDefaults() {
        super.installDefaults();
        TransferHandler th = chooser.getTransferHandler();
        if (th == null || th instanceof UIResource) {
            chooser.setTransferHandler(defaultTransferHandler);
        }
    }
    
    protected void uninstallDefaults() {
        if (chooser.getTransferHandler() instanceof UIResource) {
            chooser.setTransferHandler(null);
        }
    }
    
    protected void installListeners() {
        super.installListeners();
        
        previewMouseListener = new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (chooser.getDragEnabled()) {
                    TransferHandler th = chooser.getTransferHandler();
                    th.exportAsDrag(chooser, e, TransferHandler.COPY);
                }
            }
        };
        
    }
    
    protected void uninstallListeners() {
        super.uninstallListeners();
        previewPanel.removeMouseListener(previewMouseListener);
    }
    
    protected void installPreviewPanel() {
        if (previewPanel != null) {
            previewPanel.removeMouseListener(previewMouseListener);
        }
        super.installPreviewPanel();
        previewPanel.addMouseListener(previewMouseListener);
    }
    
    protected PropertyChangeListener createPropertyChangeListener() {
        return new PropertyHandler();
    }
    
    public class PropertyHandler implements PropertyChangeListener {
        
        public void propertyChange(PropertyChangeEvent e) {
            
            if ( e.getPropertyName().equals( JColorChooser.CHOOSER_PANELS_PROPERTY ) ) {
                AbstractColorChooserPanel[] oldPanels = (AbstractColorChooserPanel[]) e.getOldValue();
                AbstractColorChooserPanel[] newPanels = (AbstractColorChooserPanel[]) e.getNewValue();
                
                for (int i = 0; i < oldPanels.length; i++) {  // remove old panels
                    if (oldPanels[i] != null) {
                        Container wrapper = oldPanels[i].getParent();
                        if (wrapper != null) {
                            Container parent = wrapper.getParent();
                            if (parent != null)
                                parent.remove(wrapper);  // remove from hierarchy
                            oldPanels[i].uninstallChooserPanel(chooser); // uninstall
                        }
                    }
                }
                
                mainPanel.removeAllColorChooserPanels();
                for (int i = 0; i < newPanels.length; i++) {
                    if (newPanels[i] != null) {
                        mainPanel.addColorChooserPanel((SubstanceColorChooserPanel) newPanels[i]);
                    }
                }
                
                chooser.applyComponentOrientation(chooser.getComponentOrientation());
                for (int i = 0; i < newPanels.length; i++) {
                    if (newPanels[i] != null) {
                        newPanels[i].installChooserPanel(chooser);
                    }
                }
            }
            if ( e.getPropertyName().equals( JColorChooser.PREVIEW_PANEL_PROPERTY ) ) {
                if (e.getNewValue() != previewPanel) {
                    installPreviewPanel();
                }
            }
            if (e.getPropertyName().equals("componentOrientation")) {
                ComponentOrientation o = (ComponentOrientation)e.getNewValue();
                JColorChooser cc = (JColorChooser)e.getSource();
                if (o != (ComponentOrientation)e.getOldValue()) {
                    cc.applyComponentOrientation(o);
                    cc.updateUI();
                }
            }
        }
    }
    static class ColorTransferHandler extends TransferHandler implements UIResource {
        
        ColorTransferHandler() {
            super("color");
        }
    }
}
