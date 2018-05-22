/*
 * @(#)PaletteListModel.java  1.0  19 septembre 2005
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

import javax.swing.AbstractListModel;
/**
 * PaletteListModel manages a list of PaletteEntry.
 *
 * @author  Werner Randelshofer
 * @version 1.0 19 septembre 2005 Created.
 */
public class PaletteListModel extends AbstractListModel {
    /**
     * Name of the palette.
     */
    private String name;
    
    /**
     * Informatation about the palette, such as the copyright.
     */
    private String info;
    
    private PaletteEntry[] entries;
    
    /**
     * Index of the color which is closest to the current color in
     * the color chooser.
     */
    private int closestIndex;
    
    /**
     * Creates a new instance.
     */
    public PaletteListModel(String name, String info, PaletteEntry[] entries) {
        this.name = name;
        this.info = info;
        this.entries = entries;
    }
    
    public void setName(String newValue) {
        name = newValue;
    }
    public String getName() {
        return name;
    }
    
    public void setInfo(String newValue) {
        info = newValue;
    }
    public String getInfo() {
        return info;
    }
    
    public Object getElementAt(int index) {
        return entries[index];
    }
    
    public int getSize() {
        return entries.length;
    }
    
    /**
     * Used for displaying the name of the palette in the combo box
     * of the ColorPalettesChooser.
     */
    public String toString() {
        return getName();
    }
    
    /**
     * Computes the index of the color which comes closest to the specified
     * color.
     * This may return -1, if there is no sufficiently close color in the 
     * color list.
     */
    public int computeClosestIndex(Color referenceColor) {
        int refRGB = referenceColor.getRGB();
        
        int closest = -1;
        
        // Setting this to a lower value than Integer.MAX_VALUE makes this
        // method search for closer matches.
        //int closestDistance = Integer.MAX_VALUE;
        int closestDistance = 1024*3;
        
        for (int i=0, n = getSize(); i < n; i++) {
            PaletteEntry entry = (PaletteEntry) getElementAt(i);
            int entryRGB = entry.getColor().getRGB();
            int rDiff = ((entryRGB & 0xff0000) - (refRGB & 0xff0000)) >> 16;
            int gDiff = ((entryRGB & 0xff00) - (refRGB & 0xff00)) >> 8;
            int bDiff = (entryRGB & 0xff) - (refRGB & 0xff);
            int distance = rDiff * rDiff + gDiff * gDiff + bDiff * bDiff;
            if (distance < closestDistance) {
                closest = i;
                closestDistance = distance;
            }
        }
        return closest;
    }
    
    /**
     * Sets the index of the color which is closest to the current color in
     * the color chooser.
     *
     * @param newValue closest index or -1, if no color is close.
     */
    public void setClosestIndex(int newValue) {
        closestIndex = newValue;
    }
    /**
     * Returns the index of the color which is closest to the current color in
     * the color chooser, or -1 of no such color exists.
     */
    public int getClosestIndex() {
        return closestIndex;
    }
}
