/*
 * @(#)QuaquaSmallColorWellBorder.java  1.0  2005-04-18
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
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;
/**
 * SmallColorWellBorder.
 *
 * @author  werni
 */
public class SmallColorWellBorder implements Border {
    private static Color inner = Color.white;
    private static Color outer = new Color(0x949494);
    /** Creates a new instance of QuaquaSquareButtonBorder */
    public SmallColorWellBorder() {
    }
    
    public Insets getBorderInsets(Component c) {
        return new Insets(1, 1, 1, 1);
    }
    
    public boolean isBorderOpaque() {
        return true;
    }
    
    public void paintBorder(Component c, Graphics gr, int x, int y, int width, int height) {
        gr.setColor(c.getBackground());
        gr.fillRect(x + 2, y + 2, width - 4, height - 4);
        gr.setColor(inner);
        gr.drawRect(x + 1, y + 1, width - 3, height - 3);
        gr.setColor(outer);
        gr.drawRect(x, y, width - 1, height - 1);
    }    
}
