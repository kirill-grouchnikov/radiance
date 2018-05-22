/*
 * @(#)ColorWheelImageProducer.java  1.0  August 27, 2005
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
import java.awt.image.ColorModel;
import java.awt.image.MemoryImageSource;
/**
 * Produces the image of a ColorWheel.
 *
 * @see ColorWheel
 *
 * @author  Werner Randelshofer
 * @version 1.0 August 27, 2005 Created.
 */
public class ColorWheelImageProducer extends MemoryImageSource {
    private int[] pixels;
    private int w, h;
    private float brightness = 1f;
    private boolean isDirty = true;
    
    /** Lookup table for hues. */
    private float[] hues;
    /** Lookup table for saturations. */
    private float[] saturations;
    /** Lookup table for alphas. 
     * The alpha value is used for antialiasing the
     * color wheel.
     */
    private int[] alphas;
    
    /** Creates a new instance. */
    public ColorWheelImageProducer(int w, int h) {
        super(w, h, null, 0, w);
        pixels = new int[w*h];
        this.w = w;
        this.h = h;
        generateLookupTables();
        newPixels(pixels, ColorModel.getRGBdefault(), 0, w);
        setAnimated(true);
        generateColorWheel();
    }
    
    public int getRadius() {
        return Math.min(w, h) / 2 - 2;
    }
    
    private void generateLookupTables() {
        saturations = new float[w*h];
        hues = new float[w*h];
        alphas = new int[w*h];
        float radius = getRadius();
        
        // blend is used to create a linear alpha gradient of two extra pixels
        float blend = (radius + 2f) / radius - 1f;

        // Center of the color wheel circle
        int cx = w / 2;
        int cy = h / 2;
        
        for (int x=0; x < w; x++) {
            int kx = x - cx; // Kartesian coordinates of x
            int squarekx = kx * kx; // Square of kartesian x
            
            for (int y=0; y < h; y++) {
                int ky = cy - y; // Kartesian coordinates of y
                
                int index = x + y * w;
                saturations[index] = (float) Math.sqrt(squarekx + ky*ky) / radius;
                if (saturations[index] <= 1f) {
                    alphas[index] = 0xff000000;
                } else {
                    alphas[index] = (int) ((blend - Math.min(blend,saturations[index] - 1f)) * 255 / blend) << 24;
                    saturations[index] = 1f;
                }
                if (alphas[index] != 0) {
                    hues[index] = (float) (Math.atan2(ky, kx) / Math.PI / 2d);
                }
            }
        }
    }
    
    public void setBrightness(float newValue) {
        isDirty = isDirty || brightness != newValue;
        brightness = newValue;
    }
    
    public boolean needsGeneration() {
        return isDirty;
    }
    
    public void regenerateColorWheel() {
        if (isDirty) {
            generateColorWheel();
        }
    }
    
    public void generateColorWheel() {
        for (int index=0; index < pixels.length; index++) {
            if (alphas[index] != 0) {
                pixels[index] = alphas[index]
                | 0xffffff & Color.HSBtoRGB(hues[index], saturations[index], brightness);
            }
        }
        newPixels();
        isDirty = false;
    }
}
