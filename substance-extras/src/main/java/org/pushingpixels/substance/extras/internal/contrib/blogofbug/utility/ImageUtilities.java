/*
 * ImageUtilities.java
 *
 * Created on March 16, 2007, 4:34 PM
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

package org.pushingpixels.substance.extras.internal.contrib.blogofbug.utility;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.font.FontRenderContext;
import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextAttribute;
import java.awt.font.TextLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.Hashtable;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 * Static class with utility methods for images
 *
 * @author nigel
 */
public class ImageUtilities {
    
     /** 
     * Creates an image compatible with the current display
     *
     * @return A BufferedImage with the appropriate color model
     */
    public static BufferedImage createCompatibleImage(int width, int height){
       GraphicsConfiguration configuration = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        
        //Create a buffered image which is the right (translucent) format for the current graphics device, this
        //should ensure the fastest possible performance. Adding on some extra height to make room for the reflection
        return configuration.createCompatibleImage(width,height, Transparency.TRANSLUCENT);
    }
    
    /** 
     * Loads an image in a format compatible with the current display
     *
     *
     * @return A BufferedImage with the appropriate color model
     */
    public static BufferedImage loadCompatibleImage(String imageURL){
        Image image = null;
        try {
            image = ImageIO.read(new URL(imageURL));
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
            return null;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        if (image==null){
            return null;
        }
        
        GraphicsConfiguration configuration = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        
        //Create a buffered image which is the right (translucent) format for the current graphics device, this
        //should ensure the fastest possible performance. Adding on some extra height to make room for the reflection
        BufferedImage originalImage = configuration.createCompatibleImage(image.getWidth(null),image.getHeight(null), Transparency.TRANSLUCENT);
        
        //Blit the loaded image onto the optimized surface by creating a graphics context for the new image
        Graphics2D g = originalImage.createGraphics();
        //Draw the original image
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return originalImage;
    }
    
    /**
     * Produces a resized image that is of the given dimensions
     *
     * @param image The original image
     * @param width The desired width
     * @param height The desired height
     * @return The new BufferedImage
     */
    public static BufferedImage scaledImage(BufferedImage image, int width, int height){
        BufferedImage newImage = createCompatibleImage(width,height);
        Graphics graphics = newImage.createGraphics();
        
        graphics.drawImage(image,0,0,width,height,null);
        
        graphics.dispose();
        return newImage;
    }
    
    /**
     * Produces a copy of the supplied image
     *
     * @param image The original image
     * @return The new BufferedImage
     */
    public static BufferedImage copyImage(BufferedImage image){
        return scaledImage(image,image.getWidth(),image.getHeight());
    }    
    
    /** 
     * Renders a paragraph of text (line breaks ignored) to an image (created and returned). 
     *
     * @param font The font to use
     * @param textColor The color of the text
     * @param text The message
     * @param width The width the text should be limited to
     * @return An image with the text rendered into it
     */
    public static BufferedImage renderTextToImage(Font font, Color textColor, String text, int width){
        Hashtable   map = new Hashtable();
        map.put(TextAttribute.FONT, font);
        AttributedString attributedString = new AttributedString(text,map);
        AttributedCharacterIterator paragraph = attributedString.getIterator();
        
        FontRenderContext frc = new FontRenderContext(null, false, false);
        int paragraphStart = paragraph.getBeginIndex();
        int paragraphEnd = paragraph.getEndIndex();
        LineBreakMeasurer lineMeasurer = new LineBreakMeasurer(paragraph, frc);      
        
        float   drawPosY=0;
        
        //First time around, just determine the height
        while (lineMeasurer.getPosition() < paragraphEnd) {
            TextLayout layout = lineMeasurer.nextLayout(width);
            
            // Move it down
            drawPosY += layout.getAscent() + layout.getDescent() + layout.getLeading();
        }
        
        BufferedImage image = ImageUtilities.createCompatibleImage(width,(int) drawPosY);
        Graphics2D graphics = (Graphics2D) image.getGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        
        drawPosY=0;
        lineMeasurer.setPosition(paragraphStart);
        while (lineMeasurer.getPosition() < paragraphEnd) {
            TextLayout layout = lineMeasurer.nextLayout(width);
            
            // Move y-coordinate by the ascent of the layout.
            drawPosY += layout.getAscent();
            
           /* Compute pen x position.  If the paragraph is
              right-to-left, we want to align the TextLayouts
              to the right edge of the panel.
            */
            float drawPosX;
            if (layout.isLeftToRight()) {
                drawPosX = 0;
            } else {
                drawPosX = width - layout.getAdvance();
            }
            
            // Draw the TextLayout at (drawPosX, drawPosY).
            layout.draw(graphics, drawPosX, drawPosY);
            
            // Move y-coordinate in preparation for next layout.
            drawPosY += layout.getDescent() + layout.getLeading();
        }
        
        graphics.dispose();
        return image;
    }
    
    
    /** 
     * Renders multiple paragraphs of text in an array to an image (created and returned). 
     *
     * @param font The font to use
     * @param textColor The color of the text
     * @param text The message in an array of strings (one paragraph in each
     * @param width The width the text should be limited to
     * @return An image with the text rendered into it
     */
    public static BufferedImage renderTextToImage(Font font, Color textColor, String text[], int width){
        LinkedList<BufferedImage> images = new LinkedList<BufferedImage>();
        
        int totalHeight = 0;
        
        for (String paragraph : text){
            BufferedImage paraImage = renderTextToImage(font,textColor,paragraph,width);
            totalHeight+=paraImage.getHeight();
            images.add(paraImage);
        }
        
        BufferedImage image = createCompatibleImage(width,totalHeight);
        Graphics2D graphics = (Graphics2D) image.createGraphics();
        
        int y=0;
        
        for (BufferedImage paraImage : images){
            graphics.drawImage(paraImage,0,y,null);
            y+=paraImage.getHeight();
        }
        
        graphics.dispose();
        return image;
    }
    
    /** 
     * Renders a component into an image, which is useful for playing with the component's 
     * resultant image in special effects or transitions
     *
     * @param component The component to render
     * @return A buffered image with the rendered component. 
     */
    public static BufferedImage renderComponentToImage(JComponent component){
        //Create the image
        BufferedImage image = createCompatibleImage(component.getWidth(),component.getHeight());
        
        //Render the component onto the image
        Graphics graphics = image.createGraphics();
        component.paint(graphics);
        graphics.dispose();
        return image;
    }
}
