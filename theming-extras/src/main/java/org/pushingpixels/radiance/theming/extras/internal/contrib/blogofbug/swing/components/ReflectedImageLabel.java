/*
 * ReflectedImageLabel.java
 *
 * Created on November 22, 2006, 11:34 PM
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

package org.pushingpixels.radiance.theming.extras.internal.contrib.blogofbug.swing.components;

import org.pushingpixels.radiance.theming.extras.internal.contrib.blogofbug.utility.ImageUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * A RichComponent which takes the supplied image, adds on 50% to the height of the image
 * and draws a graduated alpha-blended reflection below the top aligned original image. The
 * text (set by setRichText()) is drawn dynamically over the reflection, below the original image.
 * @author nigel
 */
public class ReflectedImageLabel extends JLabel implements RichComponent{
    /**
     * The richtext associated with this component
     */
    private String  text = "";
    /**
     * The image with reflection
     */
    private BufferedImage   bufferedImage = null;
    
    /**
     * A font used for reference purposes when evaluating the size of the rendered component
     */
    private static final Font reference = new Font("Arial",Font.BOLD,14);
    /**
     * The desired alpha composite
     */
    private AlphaComposite  alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,1.0f);
    
    /**
     * Creates a new instance from the supplied image object
     * @param image The Image object
     * @param width The prefered width of the image when rendered by a rich container
     * @param height The prefered heightof the image when rendered by a rich container
     * @deprecated This function will be removed, use setNeutralWidth() on JCarousel instead.
     */
    @Deprecated
    public ReflectedImageLabel(Image image, int width, int height) {
        setRichImage(image);
    }
    
    /**
     * Creates a new instance of a reflected label for the supplied image, also setting the text
     * to be associated with the image.
     * @param image The image
     * @param text The text label
     * @param width The prefered width of the image when rendered by a rich container
     * @param height The prefered height of the image when rendered by a rich container
     * @deprecated This function will be removed, use setNeutralWidth() on JCarousel instead.
     */
    @Deprecated
    public ReflectedImageLabel(Image image, String text, int width, int height) {
        setRichImage(image);
        setRichText(text);
    }
    
    /**
     * Creates a new instance of a reflected label using the supplied image and text
     * @param image The image to be used
     * @param text The text to be displayed
     */
    public ReflectedImageLabel(Image image, String text) {
        this(image, text, image.getWidth(null), image.getHeight(null));
    }
    
    /**
     * See constructor for image label, this version of the constructor takes an image URL instead
     * of the image object (the URL can be in string format).
     * @param imageURL A URL (in string form) of the image.
     */
    public ReflectedImageLabel(String imageURL){
        try {
            setRichImage(new URL(imageURL));
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Creates a new instance, setting the width and the height that may be used by the RichContainer
     * @param imageURL The URL of the image (String form)
     * @param width The prefered width of the image when rendered by a rich container
     * @param height The prefered height of the image when rendered by a rich container
     * @deprecated This function will be removed, use setNeutralWidth() on JCarousel instead.
     */
    @Deprecated
    public ReflectedImageLabel(String imageURL, int width, int height){
        try {
            setRichImage(new URL(imageURL));
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Creates a new instance, using the image specified in the URL string, the prefered dimensions and sets the Rich text as well
     * @param imageURL The URL of the image in text form
     * @param text The RichText to be displayed
     * @param width The prefered width of the image when rendered by a rich container
     * @param height The prefered height of the image when rendered by a rich container
     * @deprecated This function will be removed, use setNeutralWidth() on JCarousel instead.
     */
    @Deprecated
    public ReflectedImageLabel(String imageURL, String text, int width, int height){
        this(imageURL,width,height);
        this.text=text;
    }
    
    /**
     * Depricated.
     * @deprecated Use setRichText() instead
     * @param text The rich text
     */
    @Deprecated
    public void setLabel(String text){
        this.text = text;
    }
    
    /**
     * Adds a reflection to the supplied image
     * @param image The image object to use to pre-render the reflection
     */
    protected void setupImage(Image image){
        if (image == null) {
            return;
        }
        
        //Create a buffered image which is the right (translucent) format for the current graphics device, this
        //should ensure the fastest possible performance. Adding on some extra height to make room for the reflection
        BufferedImage originalImage = ImageUtilities.createCompatibleImage(image.getWidth(null),(int)((double)image.getHeight(null)*1.5));
        
        //Blit the loaded image onto the optimized surface by creating a graphics context for the new image
        Graphics2D g = originalImage.createGraphics();
        //Draw the original image
        g.drawImage(image, 0, 0, null);
        g.dispose();
        BufferedImage reflection = ImageUtilities.createCompatibleImage(image.getWidth(null),image.getHeight(null));
        g = reflection.createGraphics();
        int drawHeight = image.getHeight(null);
        AffineTransform tranform = AffineTransform.getScaleInstance(1.0, -1.0);
        tranform.translate(0, -drawHeight);
        
        // draw the flipped image
        AffineTransform oldTransform = g.getTransform();
        g.setTransform(tranform);
        g.drawImage(image, 0,0,image.getWidth(null),drawHeight,0,0,image.getWidth(null),image.getHeight(null),null);
        g.setTransform(oldTransform);
        
        GradientPaint painter = new GradientPaint(0.0f, 0.0f,
                new Color(0.0f, 0.0f, 0.0f, 0.5f),
                0.0f, drawHeight / 2.0f,
                new Color(0.0f, 0.0f, 0.0f, 1.0f));
        
        // this use : Ar = Ad*(1-As) and Cr = Cd*(1-As)
        g.setComposite(AlphaComposite.DstOut);
        g.setPaint(painter);
        // this will make our image transluent ...
        g.fill(new Rectangle2D.Double(0, 0, image.getWidth(null), drawHeight));
        g.dispose();
        //Now blit back the reflection...
        g = originalImage.createGraphics();
        g.drawImage(reflection,0,drawHeight,null);
        g.dispose();
        
        //First hack, just sets the bufferedIMage to the one loaded, don't cache any rendering
        bufferedImage = originalImage;
        setPreferredSize(new Dimension(image.getWidth(null), image.getHeight(null)));
    }
    
    /**
     * Sets the transparency of the component
     * @param alphaLevel The alpha level of the object
     * @see RichComponent
     */
    public void setAlpha(float alphaLevel){
        alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alphaLevel);
    }
  
    /**
     * Deprecated
     * @param image An image object to use (reflection will be added)
     * @see RichComponent
     * @deprecated Please use setRichImage() instead from the RichComponent interface
     */
    @Deprecated
    public void setImage(Image image) {
        this.setupImage(image);
    }    
    
    
    /**
     * Overrides the default getPreferedSize() which has been controlled by the created image and adds 50% onto the height to allow for the reflection.
     * @return The prefered dimensions of the component
     */
    public Dimension getPreferredSize() {
        Dimension d = super.getPreferredSize();
        d.height = (int) ((double) d.height * 1.5);
        
        return d;
    }
    
    /** 
     * Paints the component
     * 
     * @param graphics The graphics context
     */
    public void paintComponent(Graphics graphics) {
        // Don't paint if I'm off screen
        if ((getX() + getWidth() < 0) && (getY() + getHeight() < 0)) {
            return;
        }

        Graphics2D g = (Graphics2D) graphics;
        Image image = bufferedImage;

        int drawHeight = (int) ((double) getHeight() / 1.5);

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        // SiAlphaCompositemple scale only
        Composite oldAc = g.getComposite();
        g.setComposite(alphaComposite);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), 0, 0, image
                .getWidth(null), image.getHeight(null), null);
        // Draw text if there is any...
        if ((text != null) && (text.length() > 0)) {
            Graphics2D g2d = (Graphics2D) graphics;
            Rectangle2D bounds = reference.getStringBounds(text, g2d
                    .getFontRenderContext());
            double scaleFactor = (double) getWidth() / image.getWidth(null);
            double scaleFactor2 = (double) getWidth() / bounds.getWidth();
            int fontSize = (int) Math.min(25.0 * scaleFactor,
                    14.0 * scaleFactor2);
            Font font = new Font("Arial", Font.BOLD, fontSize);
            g2d.setFont(font);
            int dx = (getWidth() - (int) font.getStringBounds(text,
                    g2d.getFontRenderContext()).getWidth()) / 2;
            int dy = drawHeight + 2 * (int) (bounds.getHeight() * scaleFactor);
            Color background = this.getBackground();
            int red = background.getRed();
            int green = background.getRed();
            int blue = background.getRed();
            graphics.setColor(new Color(red,green,blue,96));
            FontMetrics fm = g2d.getFontMetrics();
            Rectangle2D rect = fm.getStringBounds(text,graphics);
           
            graphics.fillRoundRect(dx-(int)rect.getHeight()/2, dy - (int) g2d.getFontMetrics().getAscent(),
                    (int)rect.getWidth()+((int)rect.getHeight()), fm.getAscent() + fm.getDescent(),(int)rect.getHeight(),(int)rect.getHeight());
            graphics.setColor(this.getForeground());
            graphics.drawString(text, dx, dy);
        }
        g.setComposite(oldAc);

    }


    /** 
     * Assigns an image to the component, the width and height taken from the supplied image
     *
     * @param image         The URL of the image
     */
    public void setRichImage(URL image) {
        setRichImage(ImageUtilities.loadCompatibleImage(image.toString()));
    }

    /**
     * See interface definition
     * @param image See interface definition
     * @see RichComponent
     */
    public void setRichImage(File image) {
        try {
            setRichImage(image.toURI().toURL());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * See interface definition
     * @param image See interface definition
     * @see RichComponent
     */
    public void setRichImage(Image image) {
        setImage(image);
    }

    /**
     * See interface definition
     * @see RichComponent
     */
    public void prePaintImage() {
        //I do all my pre-rendering earlier...
    }

    /**
     * See interface definition
     * @param text See interface definition
     * @see RichComponent
     */
    public void setRichText(String text) {
        setLabel(text);
    }

    /**
     * See interface definition
     * @return See interface definition
     * @see RichComponent
     */
    public String getRichText() {
        return this.text;
    }

}
