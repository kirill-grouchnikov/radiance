/*
 * @(#)HTMLColorSliderModel.java  1.0.1  2005-08-28
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

/**
 * ColorSliderModel for the HTML color model (red, green, blue, restricted
 * to values considered as web-save).
 *
 * @author  Werner Randelshofer
 * @version 1.0.1 2005-08-28 Method toWebSave generates now ARGB value instead
 * of just an RGB value. Method isWebSave ignores the alpha channel of a color.
 * <br>1.0 May 22, 2005 Created.
 */
public class HTMLColorSliderModel extends RGBColorSliderModel {
    private boolean isWebSaveOnly = true;
    /**
     * Creates a new instance.
     */
    public HTMLColorSliderModel() {
    }
    
    public int getRGB() {
        return getRGB(components[0].getValue(), components[1].getValue(), components[2].getValue());
    }
    public int getInterpolatedRGB(int component, float value) {
        if (isWebSaveOnly) {
            for (int i=0, n = getComponentCount(); i < n; i++) {
                values[i] = Math.round(components[i].getValue() / 51f) * 51;
            }
            values[component] = Math.round((value * components[component].getMaximum()) / 51f) * 51;
            return toRGB(values);
        } else {
            return super.getInterpolatedRGB(component, value);
        }
    }
    protected int getRGB(int r, int g, int b) {
        if (isWebSaveOnly) {
            return 0xff000000 | (Math.round(r / 51f) * 51) << 16 | (Math.round(g / 51f) * 51) << 8 | Math.round(b / 51f) * 51;
        } else {
            return super.getRGB(r, g, b);
        }
    }
    
    public void setRGB(int rgb) {
        if (isWebSaveOnly) {
            components[0].setValue((Math.round((rgb & 0xff0000) / 51f) * 51) >> 16);
            components[1].setValue((Math.round((rgb & 0x00ff00) / 51f) * 51) >> 8);
            components[2].setValue(Math.round((rgb & 0x0000ff) / 51f) * 51);
        } else {
            super.setRGB(rgb);
        }
    }
    
    public int toRGB(int[] values) {
        if (isWebSaveOnly) {
            return 0xff000000 
            | (Math.round(values[0] / 51f) * 51) << 16 
            | (Math.round(values[1] / 51f) * 51) << 8 
            | (Math.round(values[2] / 51f) * 51);
        } else {
            return super.toRGB(values);
        }
    }
    
    public void setWebSaveOnly(boolean b) {
        isWebSaveOnly = b;
        if (b) {
            setRGB(getRGB());
        }
        fireColorChanged(-1);
    }
    public boolean isWebSaveOnly() {
        return isWebSaveOnly;
    }
    
    public static boolean isWebSave(int rgb) {
        return (rgb & 0xffffff) == (toWebSave(rgb) & 0xffffff);
    }
    public static int toWebSave(int rgb) {
        return
        (rgb & 0xff000000)
        | ((Math.round(((rgb & 0xff0000) >> 16) / 51f) * 51) << 16)
        | ((Math.round(((rgb & 0x00ff00) >> 8) / 51f) * 51) << 8)
        | (Math.round((rgb & 0x0000ff) / 51f) * 51);
    }
}
