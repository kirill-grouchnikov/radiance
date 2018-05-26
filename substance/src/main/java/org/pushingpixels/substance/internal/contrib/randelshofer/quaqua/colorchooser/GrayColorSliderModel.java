/*
 * @(#)GrayColorSliderModel.java  1.0  May 22, 2005
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
 * A ColorSliderModel for a gray color model (brightness).
 *
 * @author  Werner Randelshofer
 * @version 1.0 May 22, 2005 Created.
 */
public class GrayColorSliderModel extends ColorSliderModel {
    
    /**
     * Creates a new instance.
     */
    public GrayColorSliderModel() {
        super(new DefaultBoundedRangeModel[] {
            new DefaultBoundedRangeModel(0, 0, 0, 100)
        });
    }
    
    public int getRGB() {
        int br = (int) (components[0].getValue() * 2.55f);
        return 0xff000000 | (br << 16) | (br << 8) | (br);
    }
    
    public void setRGB(int rgb) {
        components[0].setValue((int)
        (
        (((rgb & 0xff0000) >> 16) + ((rgb & 0x00ff00) >> 8) + (rgb & 0x0000ff))
        / 3f / 2.55f
        )
        );
    }
    
    public int toRGB(int[] values) {
        int br = (int) (values[0] * 2.55f);
        return 0xff000000 | (br << 16) | (br << 8) | (br);
    }
}
