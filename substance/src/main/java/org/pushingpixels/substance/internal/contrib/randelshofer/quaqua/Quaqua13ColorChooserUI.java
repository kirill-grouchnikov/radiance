/*
 * @(#)QuaquaColorChooserUI.java  1.2.1  2006-05-10
 *
 * Copyright (c) 2005-2006 Werner Randelshofer
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

import java.awt.BorderLayout;
import java.awt.Container;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.security.AccessControlException;
import java.util.ArrayList;

import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ColorChooserUI;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser.ColorChooserMainPanel;
import org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser.QuaquaColorPreviewPanel;
import org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser.SubstanceColorChooserPanel;
/**
 * QuaquaColorChooserUI.
 *
 * @author  Werner Randelshofer
 * @version 1.2.1 2006-05-10 Method createDefaultChoosers mustn't return an 
 * an array with null entries in it. 
 * <br>1.2 2005-09-18 Read class names of default choosers from UIManager.
 * <br>1.1 2005-08-28 ColorWheelChooser and CrayonsChooser added.
 * <br>1.0  29 March 2005  Created.
 */
public class Quaqua13ColorChooserUI extends ColorChooserUI {
    protected ColorChooserMainPanel mainPanel;
    protected JColorChooser chooser;
    protected ChangeListener previewListener;
    protected PropertyChangeListener propertyChangeListener;
    protected AbstractColorChooserPanel[] defaultChoosers;
    protected JComponent previewPanel;
    
    public static ComponentUI createUI(JComponent c) {
        return new Quaqua13ColorChooserUI();
    }
    
    public void installUI( JComponent c ) {
        chooser = (JColorChooser)c;
        
        installDefaults();
        installListeners();
        
        chooser.setLayout( new BorderLayout() );
        mainPanel = new ColorChooserMainPanel();
        chooser.add(mainPanel);
        defaultChoosers = createDefaultChoosers();
        chooser.setChooserPanels(defaultChoosers);
        
        installPreviewPanel();
    }
    
    protected AbstractColorChooserPanel[] createDefaultChoosers() {
        String[] defaultChoosers = (String[]) UIManager.get("ColorChooser.defaultChoosers");
        ArrayList panels = new ArrayList(defaultChoosers.length);
        for (int i=0; i < defaultChoosers.length; i++) {
            try {
                
            panels.add(Class.forName(defaultChoosers[i]).newInstance());
            } catch (AccessControlException e) {
                // suppress
                System.err.println("Quaqua13ColorChooserUI warning: unable to instantiate "+defaultChoosers[i]);
            } catch (Exception e) {
                throw new InternalError("Unable to instantiate "+defaultChoosers[i]);
            } catch (UnsupportedClassVersionError e) {
                // suppress
                System.err.println("Quaqua13ColorChooserUI warning: unable to instantiate "+defaultChoosers[i]);
            }
        }
        //AbstractColorChooserPanel[] panels = new AbstractColorChooserPanel[defaultChoosers.length];
        return (AbstractColorChooserPanel[]) panels.toArray(new AbstractColorChooserPanel[panels.size()]);
    }
    
    
    public void uninstallUI( JComponent c ) {
        chooser.remove(mainPanel);
        
        uninstallListeners();
        uninstallDefaultChoosers();
        uninstallDefaults();
        
        mainPanel.setPreviewPanel(null);
        if (previewPanel instanceof UIResource) {
            chooser.setPreviewPanel(null);
        }
        
        mainPanel = null;
        previewPanel = null;
        defaultChoosers = null;
        chooser = null;
    }
    protected void installDefaults() {
        LookAndFeel.installColorsAndFont(chooser, "ColorChooser.background",
        "ColorChooser.foreground",
        "ColorChooser.font");
    }
    
    protected void uninstallDefaults() {
    }
    
    
    protected void installListeners() {
        propertyChangeListener = createPropertyChangeListener();
        chooser.addPropertyChangeListener( propertyChangeListener );
        
        previewListener = new PreviewListener();
        chooser.getSelectionModel().addChangeListener(previewListener);
    }
    
    protected void uninstallListeners() {
        chooser.removePropertyChangeListener( propertyChangeListener );
        chooser.getSelectionModel().removeChangeListener(previewListener);
    }
    
    protected PropertyChangeListener createPropertyChangeListener() {
        return new PropertyHandler();
    }
    
    protected void installPreviewPanel() {
        if (previewPanel != null) {
            mainPanel.setPreviewPanel(null);
        }
        
        previewPanel = chooser.getPreviewPanel();
		// reject the default preview panel
		if (previewPanel != null && "javax.swing.colorchooser.DefaultPreviewPanel"
				.equals(previewPanel.getClass().getName())) {
			previewPanel = null;
		}
		if ((previewPanel != null) && (mainPanel != null) && (chooser != null)
				&& (previewPanel.getSize().getHeight() + previewPanel.getSize().getWidth() == 0)) {
            mainPanel.setPreviewPanel(null);
            return;
        }
        if (previewPanel == null || previewPanel instanceof UIResource) {
            //previewPanel = ColorChooserComponentFactory.getPreviewPanel(); // get from table?
            previewPanel = new QuaquaColorPreviewPanel();
            chooser.setPreviewPanel(previewPanel);
        }
        previewPanel.setForeground(chooser.getColor());
        mainPanel.setPreviewPanel(previewPanel);
    }
    
    class PreviewListener implements ChangeListener {
        public void stateChanged( ChangeEvent e ) {
            ColorSelectionModel model = (ColorSelectionModel)e.getSource();
            if (previewPanel != null) {
                previewPanel.setForeground(model.getSelectedColor());
                previewPanel.repaint();
            }
        }
    }
    protected void uninstallDefaultChoosers() {
        for( int i = 0 ; i < defaultChoosers.length; i++) {
            chooser.removeChooserPanel( defaultChoosers[i] );
        }
    }
    
    /**
     * This inner class is marked &quot;public&quot; due to a compiler bug.
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of <Foo>.
     */
    public class PropertyHandler implements PropertyChangeListener {
        
        public void propertyChange(PropertyChangeEvent e) {
            
            if (e.getPropertyName().equals( JColorChooser.CHOOSER_PANELS_PROPERTY)) {
                AbstractColorChooserPanel[] oldPanels = (AbstractColorChooserPanel[]) e.getOldValue();
                AbstractColorChooserPanel[] newPanels = (AbstractColorChooserPanel[]) e.getNewValue();
                
                for (int i = 0; i < oldPanels.length; i++) {  // remove old panels
                    Container wrapper = oldPanels[i].getParent();
                    if (wrapper != null) {
                        Container parent = wrapper.getParent();
                        if (parent != null)
                            parent.remove(wrapper);  // remove from hierarchy
                        oldPanels[i].uninstallChooserPanel(chooser); // uninstall
                    }
                }
                
                mainPanel.removeAllColorChooserPanels();
                for (int i = 0; i < newPanels.length; i++) {
                    if (newPanels[i] != null) {
                    mainPanel.addColorChooserPanel((SubstanceColorChooserPanel) newPanels[i]);
                    }
                }
                
                for (int i = 0; i < newPanels.length; i++) {
                    if (newPanels[i] != null) {
                    newPanels[i].installChooserPanel(chooser);
                    }
                }
            }
            
            if ( e.getPropertyName().equals( JColorChooser.PREVIEW_PANEL_PROPERTY)) {
                if (e.getNewValue() != previewPanel) {
                    installPreviewPanel();
                }
            }
        }
    }
}