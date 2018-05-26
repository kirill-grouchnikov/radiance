/*
 * @(#)RGBColorSliderModel.java  1.0  May 22, 2005
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

import javax.swing.*;
/**
 * A ColorSliderModel for RGB color components (red, green, blue).
 *
 * @author  Werner Randelshofer
 * @version 1.0 May 22, 2005 Created.
 */
public class RGBColorSliderModel extends ColorSliderModel {
    /**
     * Creates a new instance.
     */
    public RGBColorSliderModel() {
        super(new DefaultBoundedRangeModel[] {
            new DefaultBoundedRangeModel(255, 0, 0, 255),
            new DefaultBoundedRangeModel(255, 0, 0, 255),
            new DefaultBoundedRangeModel(255, 0, 0, 255)
        });
    }
    
    public int getRGB() {
        return getRGB(components[0].getValue(), components[1].getValue(), components[2].getValue());
    }
    
    protected int getRGB(int r, int g, int b) {
        return 0xff000000 | r << 16 | g << 8 | b;
    }
    
    public void setRGB(int rgb) {
        components[0].setValue((rgb & 0xff0000) >> 16);
        components[1].setValue((rgb & 0x00ff00) >> 8);
        components[2].setValue( rgb & 0x0000ff);
    }
    
    public int toRGB(int[] values) {
        return 0xff000000 | values[0] << 16 | values[1] << 8 | values[2];
    }
    
}
