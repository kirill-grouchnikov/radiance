/*
 * OffsetCaroselLayout.java
 *
 * Created on January 12, 2007, 6:11 AM
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

package org.pushingpixels.radiance.laf.extras.internal.contrib.blogofbug.swing.layout;

import org.pushingpixels.radiance.laf.extras.internal.contrib.blogofbug.swing.components.RichComponent;

import java.awt.*;


/**
 * Offsets a normal carousel layout be a fixed amount allowing it be "moved" around the screen.
 * @author nigel
 */
public class OffsetCaroselLayout extends CaroselLayout{
    
    /**
     * Creates a new instance of OffsetCaroselLayout
     * @param forContainer The container to associate the layout with. 
     */
    public OffsetCaroselLayout(Container forContainer) {
        super(forContainer);
    }
    
    //Checks to see if the component should be hidden
    /**
     * Overrides the normal layout method to determine if the object is offscreen and can therefore 
     * be ignored (giving a performance gain). In addition, it will adjust the alpha of the component
     * based on its distance from 3'oclock (or 15:00 if you use a 24-hour compass)
     * @param comp The component to consider
     * @param angle Its position on the carousel.
     * @param scale The scale (applied to size) of the image, that is, how far from the observer is it
     * @return True if it should be hidden, false if it should not
     */
    protected boolean shouldHide(Component comp, double angle, double scale){
        //Quick test where it's visible

        double cos = Math.cos(angle);
        double sin = Math.sin(angle);
        if ((sin>-0.5) && (sin<1) && (cos< 0.3)){
            //We are not going to hide it, but we will set the alpha
            if (scale>1.00){
                scale = Math.abs(scale-1.0);
                scale *= 3.0;
                scale = 1.0-scale;
            } else {
                scale = 1.0;
                
            }
            if (comp instanceof RichComponent){
                ((RichComponent) comp).setAlpha((float)scale);
            }
            return false;
        }
        
        return true;
    }    
    
    /**
     * Determines how "wide" the carousel should be drawn based on the side of the container the layout is laying out
     * @param target The container the radius should be calculated for
     * @param insets Any insets of the container
     * @param width The width of the container
     * @param height The height of the container
     * @param widestComponent The widest component
     * @return The size (in a bounding box) of the carousel
     */
    protected Dimension getCarouselRadius(Container target, Insets insets, int width, int height, int widestComponent){
        width = target.getSize().width - (insets.left + insets.right+(widestComponent/2));
        height = (int) (height/2.5);
        
        return new Dimension(width,height);
    }    
    
    /**
     * Determines the center of the carousel based on the dimensions of the container
     * @param insets The container insets
     * @param width Width of the container
     * @param height The height of the container
     * @param widest width of the container
     * @return A point representing the new center
     */
    protected Point calculateCenter(Insets insets, int width, int height, int widest) {
        return new Point(0,((height-insets.bottom)/2)+widest/3);
    }

    /**
     * Over-rides the normal setFrontMostComponent to move the selected component to 3 o'clock instead of 6 o'clock
     * @param component The component to move to the 'front'
     */
    public void setFrontMostComponent(Component component) {
        setTarget(-getPosition(component).getTargetAngle()+ (Math.PI /2));        
    }
    
}
