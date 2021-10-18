/*
 * ImageBorder.java
 *
 * Created on January 15, 2007, 6:54 AM
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

package org.pushingpixels.radiance.laf.extras.internal.contrib.blogofbug.swing.borders;

import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

/**
 * ImageBorder takes an image and breaks out the corners and the top, left, right, and bottom
 * borders stretching them to fill the space around which the border is drawn
 * @author nigel
 */
public class ImageBorder extends AbstractBorder{
  protected     AbstractImageBorder borderRenderer;
  boolean           paintBorder = true;

  /** 
   * Creates a new ImageBorder using the supplied image and the insets
   * 
   * @param borderImage The image to be used as the border
   * @param imageInsets The insets around the edge of the image that allow the cookie-cut-and-stretch of the image
   * around the edge of the border
   */
  public ImageBorder(BufferedImage borderImage, Insets imageInsets) {
    borderRenderer= new AbstractImageBorder(borderImage, imageInsets);
  }
      
  
  /**
   * Creates a new ImageBofder loading the image from the supplied URL
   * @param imageURL The location of the image to use
   * @param imageInsets The insets around the edge of the image that allow the cookie-cut-and-stretch of the image 
   * around the edge of the border
   */
  public ImageBorder(URL imageURL, Insets imageInsets){
    borderRenderer = new AbstractImageBorder(imageURL,imageInsets);
  }

    /** 
     * Paints the border around the specified component
     * 
     * @param c The component to paint the border on 
     * @param g The graphics context
     * @param x The x offset
     * @param y The y offset
     * @param width The width
     * @param height The height
     */
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if (!paintBorder){
            return;
        }
        borderRenderer.paintBorder(c.getWidth(),c.getHeight(),g,x,y,width,height);
    }  
  
  /** 
   * Controls wether or not the border is actually painted or not. 
   *
   * @param paintBorder If false then will not draw the border. Useful if the border is being used to show a selected item
   */
  public void setPaintBorder(boolean paintBorder){
      this.paintBorder = paintBorder;
  }
  
  /**
   * Gets the insets of the image back (subtracting from the component size would give you the renderable
   * area
   * 
   * @param c The component to which the border will be applied
   * @return The insets of the border 
   */
  public Insets getBorderInsets(Component c) {
    return borderRenderer.getImageInsets();
  }
  
  /**
   * Gets the insets of the image and returns in the in the supplied Insets instance
   *
   * @param c The component to which the border will be applied
   * @param i A pre-created insets object
   * @return The insets of the border 
   */
  public Insets getBorderInsets(Component c, Insets i){
      Insets imageInsets = borderRenderer.getImageInsets();
      i.top = imageInsets.top;
      i.bottom = imageInsets.bottom;
      i.left = imageInsets.left;
      i.right = imageInsets.right;
      return i;
  }

    public void paintCenter(Graphics2D g2, Component c) {
        if (paintBorder){
            borderRenderer.paintCenter(g2,c.getWidth(),c.getHeight());
        }
    }



}
