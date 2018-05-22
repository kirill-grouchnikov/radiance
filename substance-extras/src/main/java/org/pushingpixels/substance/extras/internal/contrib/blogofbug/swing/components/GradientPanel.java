/*
 * GradientPanel.java
 *
 * Created on November 22, 2006, 10:11 AM
 *
 *
 * Copyright 2006-2007 Nigel Hughes 
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/
 * licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language 
 * governing permissions and limitations under the License.
 */

package org.pushingpixels.substance.extras.internal.contrib.blogofbug.swing.components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

/**
 * Container that draws (in an optimized way) a gradient in the background
 * @author bug
 * 
 * Really trivial panel to draw the nice graduated background.
 */
public class GradientPanel extends JPanel implements ComponentListener{
    /**
     * Gradient start colour
     */
    protected Color start;
    /**
     * Gradient end color
     */
    protected Color end;
    /**
     * Gradient painter
     */
    protected GradientPaint gp = null;
    /**
     * A pre-rendered gradient in an image
     */
    protected BufferedImage cache = null;

    
    /**
     * Set the background to a single color
     * @param color The color for a solid background
     */
    public void setBackground(Color color){
        this.start = color;
        this.end = color;
        super.setBackground(color);
    }
    
    /**
     * Sets two background colors for a gradient
     * @param start Top (first) color 
     * @param end Bottom (final) color
     */
    public void setBackground(Color start, Color end){
        this.start = start;
        this.end = end;
        makeGradient();
    }
    
    /**
     * paints the gradient.
     * @param graphics The graphics context
     */
    public void paintComponent(Graphics graphics) {
        if (start == end){
            super.paintComponent(graphics);
            return;
        }
  
        Graphics2D g2 = (Graphics2D) graphics;
        
        /*
        //Thanks Romain Guy
        if (cache == null || cache.getHeight() != getHeight()) {
            cache = new BufferedImage(2, getHeight(),
                BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = cache.createGraphics();
            
            GradientPaint paint = new GradientPaint(0, 0, start,
                0, getHeight(), end);
            g2d.setPaint(paint);
            g2d.fillRect(0, 0, 2, getHeight());
            g2d.dispose();
        }
        g2.setPaint(new TexturePaint(cache, new Rectangle(0, 0, 1, getHeight())));
        g2.fillRect(0, 0, getWidth(), getHeight());
        
        //g2.drawImage(cache, 0, 0, getWidth(), getHeight(), null);        
        */
        gp = new GradientPaint((float)(getWidth()/2), (float) getY(), start, (float) (getWidth()/2), (float) getHeight(), end, false);

        g2.setPaint(gp);
        g2.fillRect(0,0,getWidth(),getHeight());
        super.paintChildren(graphics);
    }    

    /**
     * Pre-renders the gradient
     */
    private void makeGradient(){
        gp = new GradientPaint((float)(getWidth()/2), (float) getY(), start, (float) (getWidth()/2), (float) getHeight(), end, false);
    }
    
    /**
     * Recalculates the gradient when it's resized
     * @param componentEvent The event object
     */
    public void componentResized(ComponentEvent componentEvent) {
        makeGradient();
    }

    /**
     * Ignored
     * @param componentEvent The component event
     */
    public void componentShown(ComponentEvent componentEvent) {
        makeGradient();
    }
    
    /**
     * Not used *
     * @param componentEvent The event
     */
    public void componentMoved(ComponentEvent componentEvent){}

    /**
     * Not used *
     * @param componentEvent The event
     */
    public void componentHidden(ComponentEvent componentEvent){}

}
