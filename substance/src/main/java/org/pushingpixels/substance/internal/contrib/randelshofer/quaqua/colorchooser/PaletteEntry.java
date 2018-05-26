package org.pushingpixels.substance.internal.contrib.randelshofer.quaqua.colorchooser;

/*
 * @(#)PaletteEntry.java  1.0  19 septembre 2005
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

import java.awt.*;
/**
 * PaletteEntry.
 *
 * @author  Werner Randelshofer
 * @version 1.0 19 septembre 2005 Created.
 */
public class PaletteEntry {
    private String name;
    private Color color;
    
    /**
     * Creates a new instance.
     */
    public PaletteEntry(String name, Color color) {
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return name;
    }
    public Color getColor() {
        return color;
    }
}
