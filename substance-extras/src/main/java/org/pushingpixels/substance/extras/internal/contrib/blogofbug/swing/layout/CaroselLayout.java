/*
 * CaroselLayout.java
 *
 * Created on November 21, 2006, 11:48 AM
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

package org.pushingpixels.substance.extras.internal.contrib.blogofbug.swing.layout;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ConcurrentModificationException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.Timer;

import org.pushingpixels.substance.extras.internal.contrib.blogofbug.swing.components.RichComponent;


/**
 * Layout engine for JCarousel components (although would work for any container). 
 * It does have a closer than usual relationship with the container, sometimes causing the container to repaint.
 * @author bug
 */
public class CaroselLayout implements LayoutManager,ActionListener{
    /**
     * Number of items in the carousel (that are visible)
     */
    protected int                      numberOfItems = 0;
    
    /**
     * List of components being laid out
     */
    protected LinkedList<Component>    components = new LinkedList<>();
    
    /**
     * List of additional information held on components in the carousel
     */
    protected Hashtable     additionalData = new Hashtable();
    
    /**
     * The current degree of rotation of the carousel
     */
    protected double        rotationalOffset = 0.0;
    
    /**
     * The desired rotational offset, which will be moved to by a timer animating the carousel
     */
    protected double        targetOffset = 0.0;
    
    /**
     * Time for driving animations
     */
    private   Timer         animationTimer = null;
    
    /**
     * The container the layout is... laying out
     */
    private   Container     container = null;
    
    /**
     * Should items furtehr away from the observer be faded out?
     */
    private   boolean       depthBasedAlpha = true;
    
    /**
     * The width of a component when the scale is 1.0
     */
    private   int           neutralContentWidth = 64;
    
    /**
     * Creates a new instance of the layout engine, tied to the specified container.
     * @param forContainer The container the layout will layout
     */
    public CaroselLayout(Container forContainer){
        animationTimer = new Timer(0,this);
        container = forContainer;
    }

    /**
     * Specify the neutral content width of any laid out component.
     * @param neutralContentWidth The neutral width of components
     */
    public void setNeutralContentWidth(int neutralContentWidth) {
        this.neutralContentWidth = neutralContentWidth;
    }
    
    
    
    /**
     * Moves a layout component at a particular location in the 
     * carousel
     *
     * @param i The location at which to insert
     * @param comp The component to insert
     *
     */ 
    public void moveComponentTo(int i, Component comp){
        components.remove(comp);
        components.add(i,comp);
        recalculateCarosel();
    }
    
    /**
     * Name is ignored
     * @param name The name of the component, ignored.
     * @param comp The component being added
     */
    public void addLayoutComponent(String name, Component comp) {
        components.addLast(comp);
        recalculateCarosel();
    }
    
    /**
     * Remove the component
     * @param comp The component being removed
     */
    public void removeLayoutComponent(Component comp) {
        components.remove(comp);
        recalculateCarosel();
    }
    
    /**
     * Gets the additional data stored by the layout manager for a given component
     *
     * @param comp The component you wish retreive the data for
     * @return A position, which is added if it does not already exist. Never null unless
     * you run out of memory!
     */
    protected CaroselPosition getPosition(Component comp){
        CaroselPosition cpos = (CaroselPosition) additionalData.get(comp);
        
        if (cpos==null){
            cpos = new CaroselPosition(comp);
            additionalData.put(comp,cpos);
        }
        
        return cpos;
    }
    
    /**
     * Determines how many of the items being laid out are currently visible.
     * @return How many of the items in the carousel are currently visible.
     */
    protected int recalculateVisibleItems(){
        int visibleItems=0;
        try{
            for (Component comp : components){
                if (comp.isVisible()){
                    visibleItems++;
                }
            }
        } catch (ConcurrentModificationException ex){
            return recalculateVisibleItems();
        }
        return visibleItems;
    }
    
    /**
     * Updates all of the positions of the carousel. Does not do a repaint, just does the math ready for the next one.
     */
    protected void recalculateCarosel(){
        //Need to count visible, not just how many in the list
        //Again dealing with out-of-EDT modification
        numberOfItems = recalculateVisibleItems();

        //Trap and re-calc on concurrent modification (might as well be up-to-date)
        
        try{
            boolean animate=false;
            double itemCount = 0;
            for (Component comp : components){
                CaroselPosition position = getPosition(comp);
                if (comp.isVisible()){
                    double localAngle = itemCount * (Math.PI * 2.0 / (double) numberOfItems);
                    position.setAngle(localAngle);
                }
                if (position.isAnimating()){
                    animate=true;
                }
                itemCount+=1.0;
            }

            //If we do need to animate, get it started
            if (animate){
                animationTimer.start();
            }
        } catch (ConcurrentModificationException ex){
            recalculateCarosel();
            return;
        }
        
    }
    
    /**
     * Cheats and bases it's size on the prefered sizes of each component
     * @param parent The container interested in the layout size
     * @return The minimum size of the layout. See above.
     */
    public Dimension minimumLayoutSize(Container parent) {
        return preferredLayoutSize(parent);
    }
    
    /**
     * Determine the widest and tallest dimensions, then return the height as 1.5 * the highest, and 3 * the widest
     * @param parent The container for the layout
     * @return The prefered size of the layout
     */
    public Dimension preferredLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);
        // get widest preferred width for left && right
        // get highest preferred height for left && right
        // add preferred width of middle
        int widestWidth = 0;
        int highestHeight = 0;
        
        Iterator i = components.iterator();
        while (i.hasNext()){
            Component comp = (Component) i.next();
            
            if (comp.isVisible()){
                widestWidth = Math.max(widestWidth, comp.getPreferredSize().width);
                highestHeight = Math.max(highestHeight, comp.getPreferredSize().height);
            }
        }
        
        dim.width = widestWidth * 3;
        dim.height = highestHeight * 2;
        
        Insets insets = parent.getInsets();
        dim.width += insets.left + insets.right;
        dim.height += insets.top + insets.bottom;
        
        return dim;
    }
    
    /**
     * Determines the center of the carousel
     * @param insets The insets of the container
     * @param width The width of the container
     * 
     * @param height The height of the container
     * @param widest The widest component
     * @return A point at the center of the carousel
     */
    protected Point calculateCenter(Insets insets, int width, int height, int widest){
        return new Point((insets.left+widest/2) + width/2, insets.top + height/2);        
    }

    /**
     * Controls if items should fade as they move to the back of the carousel
     * @param depthBasedAlpha True if they should fade, false if they shouldn't
     */
    public void setDepthBasedAlpha(boolean depthBasedAlpha) {
        this.depthBasedAlpha = depthBasedAlpha;
    }
    
    /**
     * Can be over-ridden to restrict the range of angles where the child component
     * is shown
     * @return false if the component should not be shown
     * @param comp Controls if components are hidden or not, in the case of this layout it always returns false
     * @param angle The angle of the component under consideration
     * @param s The scale of the component under consideration
     */
    protected boolean shouldHide(Component comp, double angle, double s){
        if (depthBasedAlpha){
            if (comp instanceof RichComponent){
                s = Math.min(1.0f,Math.max(0.0f,s/1.2f));
                ((RichComponent) comp).setAlpha((float)s);
            }            
        }
        return false;
    }
    
    /**
     * Determines the correct size of the carousel for the container
     * @param target The target container
     * @param insets Insets into the target container
     * @param width Width of the target container
     * @param height Height of the target container
     * @param widestComponent The widest component in the container
     * @return The 
     */
    protected Dimension getCarouselRadius(Container target, Insets insets, int width, int height, int widestComponent){
        return null;
    }
    
    /** 
     * Determines the scale to be applied to the component. The default calculation 
     * divides the y co-ordinate by the y-cordinate of the centre. Other implimentations 
     * may use some of the other parameters
     *
     * @param angle The angle of the component
     * @param x The x-position of the component
     * @param y The y-position of the component
     * @param carouselX The x centre of the carousel
     * @param carouselY The y centre of the carousel
     * @return A double which will be used to scale x and y co-ordinates
     */
    protected double getScale(double angle, double x, double y, double carouselX, double carouselY){
        return (y / carouselY);    
    }
    
    /**
     * Lays out all of the components on the carosel. Using the preferred width and height to base
     * scaling on
     * @param target The container currently being laid out
     */
    public void layoutContainer(Container target) {
        //Let's make a local copy of components to avoid concurrent modification
        //which could happen if someone adds something to the layout outside
        //of the EDT. This is faster than do any synchronization or brute force
        //exception catching
        LinkedList<Component> components = (LinkedList) this.components.clone();
        int numberOfItems = this.numberOfItems;
        
        recalculateCarosel();
        // these variables hold the position where we can draw components
        // taking into account insets
        Insets insets = target.getInsets();
        int    width  = target.getSize().width - (insets.left + insets.right);
        int    height = target.getSize().height - (insets.top + insets.bottom);
        
        //No longer calculate the width based on prefered sizes, we're going to control 
        //it by the component not the content'
        int widestWidth = neutralContentWidth;
                
        width -= widestWidth;
        
 
        int    radiusX = width /2;
        int    radiusY = radiusX/3;
        Dimension radius = getCarouselRadius(target,insets,width,height,widestWidth);
        if (radius!=null){
            radiusX = radius.width;
            radiusY = radius.height;
        }
        
        Point  center = calculateCenter(insets,width,height,widestWidth);
        int    centerX = center.x;
        int    centerY = center.y;
        
        //Go through each visible component and set the scale and z-order, and eventually the bounds
        //Need to protected against other things adding components at the same time
        Iterator i = components.iterator();
        int p = 0;
        CaroselPosition z_order[] = new CaroselPosition[numberOfItems];
        while (i.hasNext()){
            Component comp = (Component) i.next();
            CaroselPosition position = getPosition(comp);
            double finalAngle = position.getAngle()+this.rotationalOffset;
            
            double x = (Math.sin(finalAngle) * (double) radiusX)+(double) centerX;
            double y = (Math.cos(finalAngle) * (double) radiusY)+(double) centerY;
            
            double initialWidth = (double) comp.getPreferredSize().width;
            double initialHeight = ((double) comp.getPreferredSize().height) * (initialWidth / (double) comp.getPreferredSize().width);
            
            double s = getScale(finalAngle, x,y,(double) centerX, (double) centerY);//(y / (double) centerY);
            double boundsWidth = initialWidth * s;
            double boundsHeight = initialHeight * s;
            
            if (!shouldHide(comp, finalAngle,s)){
                //Even scaling only to avoid windows jitter...
                int finalWidth = (int)boundsWidth / 1;
                int finalHeight = (int)boundsHeight / 1;
                finalWidth = (int) finalWidth & 0xFFFFFFFE;
                finalHeight = (int) finalHeight & 0xFFFFFFFE;
                comp.setBounds((int)x - ((int)boundsWidth/2),(int) y - ((int)boundsHeight /2),finalWidth, finalHeight);
            } else {
                comp.setBounds(-100,-100,32,32);
            }
                        
            position.setZ(s);
            z_order[p++] = position;
        }
        
        //Now sort out the z, we may need to cache the dimensions, do the z and then reset the bounds, see what happens on redraw first
        //bubble sort is actually very fast for a small number of items, and this layout shouldn't be used for loads.
        boolean swaps = true;
        int     limit = numberOfItems-1;
        while (swaps){
            swaps = false;
            for (int j=0;j<limit;j++){
                if (z_order[j].getZ()<z_order[j+1].getZ()){
                    CaroselPosition temp = z_order[j+1];
                    z_order[j+1]=z_order[j];
                    z_order[j]=temp;
                    swaps=true;
                }
            }
            limit--;
            //We must be done if we hit the bottom
            if (limit==0){
                swaps=false;
            }
        }
        
        //Re-order everything (yet as little as possible :-)
        for (int j=0;j<numberOfItems;j++){
            if (target.getComponentZOrder(z_order[j].getComponent())!=j){
                target.setComponentZOrder(z_order[j].getComponent(),j);
            }
        }
    }
    
    /**
     * Returns the current rotational angle
     *
     * @return The current rotated angle in radians
     */
    public double getAngle() {
        return this.rotationalOffset;
    }
    
    /**
     * Sets the current rotational angle. Will not cause an animation to start
     *
     * @param d The desired angle in radians
     */
    public void setAngle(double d) {
        this.rotationalOffset = d;
    }
    
    /**
     * Determines if an animation is currently playing
     *
     * @return true if it is animating, false if it isn't
     */
    protected boolean isAnimating(){
        if (!animationTimer.isRunning()){
            return false;
        }
        
        try{
            for (Component comp : components) {
                CaroselPosition cpos = getPosition(comp);
                if (cpos.isAnimating()){
                    return true;
                }
            }
        } catch (ConcurrentModificationException ex){
            return isAnimating();
        }
        
        if (Math.abs(rotationalOffset - targetOffset) < 0.001){
            return false;
        } else {
            return true;
        }
        
    }
    
    /**
     * Manages timer actions, terminating the timer if any event is fully achieved
     *
     * @param actionEvent the action event, although this will always be the timer
     */
    public void actionPerformed(ActionEvent actionEvent) {
        if (animationTimer==null){
            return;
        }
        
        if (!animationTimer.isRunning()){
            return;
        }
        
        if (!isAnimating()){
            animationTimer.stop();
            return;
        }
        
        //Update any animating icons, could be subject to modification
        //outside the EDT
        try {
            for (Component comp : components) {
                CaroselPosition cpos = getPosition(comp);
                
                if (cpos.isAnimating()){
                    cpos.updateAngle();
                }
            }
        } catch (ConcurrentModificationException cMe){
            actionPerformed(actionEvent);
        }
        rotationalOffset += (targetOffset - rotationalOffset) / 6.0;
        if (container!=null){
            this.layoutContainer(container);
            if (container instanceof Component){
                ((Component) container).repaint();
            }
        }
    }
    
    /**
     * Moves everything to their "target" positions, without animating anything
     *
     */
    public void finalizeLayoutImmediately(){
        for (Component comp : components){
            CaroselPosition cpos = getPosition(comp);
            
            cpos.angle=cpos.targetAngle;
        }
        rotationalOffset = targetOffset;
        recalculateCarosel();
        container.validate();
    }
    
    /**
     * Sets a target angle to rotate to, always choses a direction that is less than
     * or equal to 180 degrees
     *
     * @param target The target angle in radians
     */
    protected final void setTarget(double target){
        //We should never have to rotate more than PI radians
        while (Math.abs(target-rotationalOffset) > Math.PI){
            if (target<rotationalOffset){
                target += Math.PI * 2;
            } else {
                target -= Math.PI * 2;
            }
        }
        targetOffset = target;
        if (!animationTimer.isRunning()){
            animationTimer.setCoalesce(true);
            animationTimer.setRepeats(true);
            animationTimer.setDelay(20);
            animationTimer.start();
        }
    }
    
    /**
     * Moves the specified component to the front
     *
     * @param component The component move to the front
     */
    public void setFrontMostComponent(Component component){
        setTarget(-getPosition(component).getTargetAngle());                      
    }

    /**
     * Retrieve the component before the specified one. It does not filter out invisible ones.
     * @param component The component you are looking for the one before for.
     * @return The component before it
     */
    public Component getPreviousComponent(Component component) {
       int i = this.components.indexOf(component)-1;
       if (i<0){
           return components.get(components.size()-1);
       } else {
           return components.get(i);
       }
    }
    
    
    /**
     * Retrieve the component after the specified one. It does not filter out invisible ones.
     * @param component The component
     * @return The one after it
     */
    public Component getNextComponent(Component component) {
       int i = this.components.indexOf(component)+1;
       if (i>=components.size()){
           return components.get(0);
       } else {
           return components.get(i);
       }
    }

    /**
     * The number of components being laid out. Does not included hidden ones
     * @return The number of components
     */
    public int getComponentCount(){
        return components.size();
    }
    
    /**
     * Gets the index of the supplied component
     * @param comp The component
     * @return The index
     */
    public int getComponentIndex(Component comp) {
        return components.indexOf(comp);
    }
    
    /**
     * The size of comopnents a neutral width
     * @return The size of components at neutral width (scale 1.0)
     */
    public int getNeutralContentWidth() {
        return neutralContentWidth;
    }
static class CaroselPosition{
        protected double  angle;
        protected double  scale;
        protected double  z;
        protected Component component;
        protected boolean firstSet = false;
        protected double  targetAngle = 0.0;
        
        public CaroselPosition(Component component){
            angle = 0.0;
            scale = 0.0;
            z = 0.0;
            this.component = component;
        }
        
        public Component getComponent(){
            return component;
        }
        
        public double getZ(){
            return z;
        }
        
        public void setZ(double z){
            this.z = z;
        }
        
        public double getTargetAngle(){
            return targetAngle;
        }
        
        public double getAngle(){
            return angle;
        }
        
        public double getScale(){
            return scale;
        }
        
        public boolean isAnimating(){
            if ((Math.abs(angle - targetAngle) < 0.001)){
                return false;
            }
            return true;
        }
        
        public void moveToTarget(){
            angle=targetAngle;
        }
        
        public void updateAngle(){
            if ((Math.abs(angle - targetAngle) < 0.001)){
                angle = targetAngle;
            } else {
                angle += Math.min((targetAngle - angle) / 6.0,0.10);
            }
        }
        
        public void setAngle(double angle){
            if (firstSet){
                this.angle = angle;
                this.targetAngle = angle;
                firstSet = false;
            } else {
                this.targetAngle = angle;
            }
        }
        
        public void setScale(double scale){
            this.scale = scale;
        }
    }
    
}
