/*
 * JCarouselMenu.java
 *
 * Created on January 13, 2007, 12:42 PM
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

package org.pushingpixels.radiance.laf.extras.internal.contrib.blogofbug.swing.components;

import org.pushingpixels.radiance.laf.extras.internal.contrib.blogofbug.swing.borders.ImageBorder;
import org.pushingpixels.radiance.laf.extras.internal.contrib.blogofbug.swing.layout.OffsetCaroselLayout;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


/**
 * Shows a carousel offset to the left with a menu of actions on the right.
 * @author nigel
 */
@SuppressWarnings("unchecked")
public class JCarouselMenu extends GradientPanel implements ListSelectionListener,MouseListener,KeyListener, ChangeListener, MouseWheelListener{
    /**
     * The carousel used and drawn on the left.
     */
    private JCarosel    carousel;
    /**
     * A JList with the menu items in
     */
    private JList       menu;
    /**
     * The scroll pane the menu is in
     */
    private JScrollPane menuScroll;
    /**
     * The model for the action menu
     */
    private DefaultListModel menuModel=new DefaultListModel();
    /**
     * Linked list of the items in the menu
     */
    private LinkedList<MenuItem>    menuItems= new LinkedList<>();
    /**
     * A hashtable connecting the actions to the components in the carousel
     */
    private Map<Component, MenuItem> menuMap = new HashMap<>();
    /**
     * The last item selected
     */
    private int lastSelection   = -1;

    /**
     * The button that is drawn when it is possible to scroll up
     */
    private UpDownButton  upButton = new UpDownButton("Up");
    /**
     * The button shown when you can scroll down
     */
    private UpDownButton  downButton = new UpDownButton("Down");
    
    /**
     * Creates a new instance of JCarouselMenu
     * @param border The border to use to draw items in the menu
     */
    public JCarouselMenu(ImageBorder border) {
        carousel = new JCarosel();
        carousel.setLayout(new OffsetCaroselLayout(carousel));
        carousel.setBackground(null);
        carousel.setOpaque(false);
        carousel.setContentWidth(256);
        
        super.setLayout(new GridLayout(1,2));
        super.add(carousel);
        
        upButton.setForeground(Color.WHITE);
        downButton.setForeground(Color.WHITE);
        
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(null);
        menuPanel.setOpaque(false);
        menuPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc  = new GridBagConstraints();
        
        menu = new JList();
        menuScroll = new JScrollPane(menu, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        menuScroll.getViewport().setOpaque(false);
        menuScroll.setBorder(null);
        menuScroll.getViewport().addChangeListener(this);
        menu.setModel(menuModel);
        menu.setCellRenderer(new CarouselListCellRenderer(border));
        menu.setBackground(null);       
        menu.setOpaque(false);
        menu.addListSelectionListener(this);
        menuScroll.setOpaque(true);
        menuScroll.setBackground(Color.BLACK);
        menuScroll.setBorder(BorderFactory.createEmptyBorder());
        
        gbc.weightx=0.0;
        gbc.weighty=0.0;
        gbc.gridy=0;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        menuPanel.add(upButton,gbc);
        gbc.weighty=1.0;
        gbc.weightx=1.0;
        gbc.gridy++;
        gbc.fill=GridBagConstraints.BOTH;
        menuPanel.add(menuScroll,gbc);
        gbc.weighty=0.0;
        gbc.weightx=0.0;
        gbc.gridy++;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        menuPanel.add(downButton,gbc);
        menu.addMouseListener(this);
        menu.addKeyListener(this);
                
        //Don't want it to listen to itself...
        carousel.removeMouseWheelListener(carousel);
        carousel.addMouseWheelListener(this);
        menu.addMouseWheelListener(this);
        menuScroll.addMouseWheelListener(this);
        menuPanel.addMouseWheelListener(this);
        
        super.add(menuPanel);
    }
    
    /**
     * Creates a new instance
     */
    public JCarouselMenu(){
        this(new ImageBorder(JCarouselMenu.class.getResource("/com/blogofbug/swing/borders/images/menu_highlight.png"),new Insets(10,12,16,12)));
    }
    
    /**
     * Sets the color the up and down buttons are drawn
     * @param color The desired color
     */
    public void setUpDownColor(Color color){
        upButton.setForeground(color);
        downButton.setForeground(color);
    }
    
    /**
     * Returns the list part of the carousel menu
     *
     * @return The JList object
     */
    public JList getList(){
        return this.menu;
    }
    
    /**
     * Sets the selected item in the menu
     * @param i The index of the item to select
     */
    public void setSelectedIndex(int i){
        menu.setSelectedIndex(i);
    }
    
    /**
     * Adds a component to the carousel menu that will be brought into view when the user clicks
     * on the associated item
     * @param component The component
     * @param label The text to appear in the menu
     * @return The created component
     */
    public Component add(Component component,String label){
        carousel.add(label,component);
        MenuItem item = new MenuItem(component, label, null);
        menuItems.addLast(item);
        menuModel.addElement(item);
        menuMap.put(component, item);
        component.removeMouseListener(carousel);
        return component;
    }
    
    /**
     * Removes a component from the menu
     * @param component The component to remove
     */
    public void remove(Component component) {
        carousel.remove(component);
        MenuItem menuItem = menuMap.remove(component);
        if (menuItem != null) {
            menuItems.remove(menuItem);
            menuModel.removeElement(menuItem);
        }
    }
    
    
    /**
     * Adds an image to the menu.
     * @deprecated Use add(Image, String) instead
     * @param image The image
     * @param label The text
     * @param width Prefered width
     * @param height Prefered height
     * @return The created component
     */
    @Deprecated
    public Component add(Image image, String label, int width, int height) {
        Component comp = carousel.add(image, null);
        MenuItem item = new MenuItem(comp, label, null);
        menuItems.addLast(item);
        menuModel.addElement(item);
        comp.removeMouseListener(carousel);
        menuMap.put(comp, item);
        return comp;
    }    
    
 
    /**
     * Adds an image (with a label) and returns the component created to represent them
     * @param image The image to display
     * @param label The label to show
     * @return The component created
     */
    public Component add(Image image, String label) {
        Component comp = carousel.add(image, null);
        MenuItem item = new MenuItem(comp, label, null);
        menuItems.addLast(item);
        menuModel.addElement(item);
        comp.removeMouseListener(carousel);
        menuMap.put(comp, item);
        return comp;
    }     
    
    /**
     * Adds an action to the menu
     * @deprecated Use add(imageURL) instead
     * @param action The action to add
     * @param width The width
     * @param height The height
     * @return The created component
     */
    @Deprecated
    public Component add(Action action, int width, int height){
        URL url = (URL) action.getValue(AbstractCarouselMenuAction.ACTION_IMAGE_URL);
        if (url==null){
            throw new InvalidParameterException("Supplied action does not have Image URL key (AbstractCarouselMenuAction.ACTION_IMAGE_URL)"
                    );
        }
        Component comp = carousel.add(url.toString());
        MenuItem item = new MenuItem(comp, (String) action.getValue(Action.SHORT_DESCRIPTION), action);
        menuItems.addLast(item);
        menuMap.put(comp, item);
        menuModel.addElement(item);
        comp.removeMouseListener(carousel);
        return comp;        
    }
    
    /**
     * Adds an action to the list, creating a menu item and a carousel entry
     * @param action The action to add
     * @return The resultant component
     */
    public Component add(Action action){
        URL url = (URL) action.getValue(AbstractCarouselMenuAction.ACTION_IMAGE_URL);
        if (url==null){
            throw new InvalidParameterException("Supplied action does not have Image URL key (AbstractCarouselMenuAction.ACTION_IMAGE_URL)"
                    );
        }
        Component comp = carousel.add(url.toString());
        MenuItem item = new MenuItem(comp, (String) action.getValue(Action.SHORT_DESCRIPTION), action);
        menuItems.addLast(item);
        menuMap.put(comp, item);
        menuModel.addElement(item);
        comp.removeMouseListener(carousel);
        return comp;        
    }    
    
    /**
     * Adds an image (through a URL) to the menu
     * @deprecated Use add(imageURL, label) instead
     * @param imageURL URL of the image
     * @param label Text message
     * @param width width
     * @param height height
     * @return The created component
     */
    @Deprecated
    public Component add(String imageURL, String label, int width, int height){
        Component comp = carousel.add(imageURL);
        MenuItem item = new MenuItem(comp, label, null);
        menuMap.put(comp, item);
        menuItems.addLast(item);
        menuModel.addElement(item);
        comp.removeMouseListener(carousel);
        return comp;
    }
    
    /**
     * Adds an image based on the imageURL and a text label, returning the component that is created as a result
     * @param imageURL The URL of the image
     * @param label Text label to be shown in the menu
     * @return The created component
     */
    public Component add(String imageURL, String label){
        Component comp = carousel.add(imageURL);
        MenuItem item = new MenuItem(comp, label, null);
        menuMap.put(comp, item);
        menuItems.addLast(item);
        menuModel.addElement(item);
        comp.removeMouseListener(carousel);
        return comp;
    }    
    
    /**
     * Return the preferred size of the component
     * @return The prefered dimensions of the component
     */
    public Dimension getPreferredSize() {
        Dimension size = super.getPreferredSize();
        size.width /= 2;
        return size;
    }
    
    /**
     * Detect when the list selection changes, and respond by updating the state
     * of the two "arrow" buttons. Contributed by Sebastian Charpentier.
     * @see javax.swing.event.ChangeListener#stateChanged(javax.swing.event.ChangeEvent)
     * @param e The state changed event
     */
    public void stateChanged(ChangeEvent e) {
        // Check if the scroll bar is at the top or at the bottom
        // Note: It's a trick, I don't know if this is the best/correct way to handle that
        // We show the "go up" arrow if were not at the beginning
        JViewport viewport = menuScroll.getViewport();
        int       yPos = (int)viewport.getViewPosition().getY();
        upButton.setDoPaint(yPos > 0);
        // We show the "go down" arrow if were not at the end (having the view as down as we could)
        downButton.setDoPaint((yPos + viewport.getExtentSize().getHeight()) != menu.getHeight());
    }    
    
    
    /**
     * Detect when the list selection changes, and respond by rotating the carousel to show
     * that item
     * @param listSelectionEvent The list selection change event
     */
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        MenuItem item = (MenuItem) menu.getSelectedValue();
        if (item==null){
            return;
        }
        
        carousel.bringToFront(item.carouselComponent);
    }
    
    /**
     * Launch the action associated with the currently selected list item
     *
     */
    protected void processAction(){
        MenuItem item = (MenuItem) menu.getSelectedValue();
        if (item==null){
            return;
        }
        if (item.action==null){
            return;
        }
        item.action.actionPerformed(new ActionEvent(this,ActionEvent.ACTION_PERFORMED,item.label));
    }
    
    /**
     * Look to see if an item in the list is double clicked, and launch the action if it is
     * @param mouseEvent The mouse event
     */
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount()==2){
            processAction();
        }
    }
    
    /**
     * Don't Care *
     * @param mouseEvent The mouse event
     */
    public void mousePressed(MouseEvent mouseEvent) {    }
    
    /**
     * Don't Care *
     * @param mouseEvent The mouse event
     */
    public void mouseReleased(MouseEvent mouseEvent) {}
    
    /**
     * Don't Care *
     * @param mouseEvent The mouse event
     */
    public void mouseEntered(MouseEvent mouseEvent) {}
    
    /**
     * Don't Care *
     * @param mouseEvent The mouse event
     */
    public void mouseExited(MouseEvent mouseEvent) {}
    
    /**
     * Don't Care *
     * @param keyEvent The key event
     */
    public void keyTyped(KeyEvent keyEvent) {    }
    
    /**
     * Listen for key events, when we see one that looks like it should wrap, set up the lastSelection variable to
     * trigger a change on release of the key
     * @param keyEvent The key event
     */
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()){
            case KeyEvent.VK_ENTER:
                processAction();
                break;
            case KeyEvent.VK_UP:
                if (menu.getSelectedIndex()==0){
                    this.lastSelection = menuModel.size()-1;
                } else {
                    this.lastSelection = -1;
                }
                break;
            case KeyEvent.VK_DOWN:
                if (menu.getSelectedIndex()==menuModel.size()-1){
                    this.lastSelection = 0;
                } else {
                    this.lastSelection = -1;
                }
                break;
                
        }
    }
    
    /**
     * Sets the image border used to draw around the items in the menu
     * @param imageBorder The desired image border
     */
    public void setCellImageBorder(ImageBorder imageBorder){
        CarouselListCellRenderer renderer = (CarouselListCellRenderer) menu.getCellRenderer();
        
        renderer.setImageBorder(imageBorder);
    }
    
    /**
     * Specifies the list cell renderer used to draw the items in the menu
     * @param cellRenderer The list cell renderer
     */
    public void setCellRenderer(ListCellRenderer cellRenderer){
        menu.setCellRenderer(cellRenderer);
    }
    
    /**
     * If the wrap-around has detected the need to wrap, sets the selection to the value
     * calculated when the key was first pressed.
     * @param keyEvent The key event
     */
    public void keyReleased(KeyEvent keyEvent) {
        if (lastSelection!=-1){
            menu.setSelectedIndex(lastSelection);
            menu.ensureIndexIsVisible(lastSelection);
            lastSelection=-1;
        }
    }

    /**
     * Moves the selected menu up or down when the mouse wheel scrolls
     * @param mouseWheelEvent The mouse wheel event
     */
    public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
        if (mouseWheelEvent.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL) {
            int amount = mouseWheelEvent.getWheelRotation();

            int lastSelection;
            if (amount < 0) {
                if (menu.getSelectedIndex()==0){
                    lastSelection = menuModel.size()-1;
                } else {
                    lastSelection = menu.getSelectedIndex()-1;
                }
            } else {
                if (menu.getSelectedIndex()==menuModel.size()-1){
                    lastSelection = 0;
                } else {
                    lastSelection = menu.getSelectedIndex()+1;
                }
            }
            
            final int indexToSelect = lastSelection;
            SwingUtilities.invokeLater(() -> {
                menu.setSelectedIndex(indexToSelect);
                menu.ensureIndexIsVisible(indexToSelect);
                menu.repaint();
            });
        }        
    }
    
    /**
     * Sets icons to use to show the up and down buttons
     * @param upIcon The icon to use for up
     * @param downIcon The icon to use for down
     */
    public void setUpDownIcons(Icon upIcon, Icon downIcon) {
        upButton.setIcon(upIcon);
        downButton.setIcon(downIcon);
    }

    /**
     * Allows the background color to the menu (left side) to be set
     * @param color Sets the background color to the menu
     */
    public void setMenuScrollColor(Color color) {
        this.menuScroll.setBackground(color);
    }    
    
    /**
     * ListCellRenderer for the Carousel uses an image border to draw a nice border around the menu item when it is selected
     *
     */
    protected class CarouselListCellRenderer extends JLabel implements ListCellRenderer{
        ImageBorder imageBorder;
        /**
         * Creates a new list cell renderer for the menu with the specified image border
         * @param border The border to use
         */
        public CarouselListCellRenderer(ImageBorder border){
            imageBorder = border;
            setBorder(imageBorder);
        }
        
        /**
         * Allows the setting of the image border
         * @param border The border to use
         */
        public void setImageBorder(ImageBorder border){
            imageBorder = border;
            setBorder(imageBorder);
        }
        
        /**
         * Sets up the component for stamping
         * @param jList The list
         * @param object The object being drawn
         * @param i The index of the object
         * @param isSelected If the object is selected
         * @param cellHasFocus Does the cell have the focus
         * @return The object to use to stamp the list item
         */
        public Component getListCellRendererComponent(JList jList, Object object, int i, boolean isSelected, boolean cellHasFocus) {
            MenuItem item = (MenuItem) object;
            setText(item.label);
            if (!isSelected){
                setBackground(null);
                imageBorder.setPaintBorder(false);
                setOpaque(false);
            } else {
                imageBorder.setPaintBorder(false);
                setOpaque(false);
            }
            setForeground(Color.WHITE);
            
            return this;
        }
        
        /**
         * Our image border can paint a center as well as a surround. Call paint center if we want it to do this. 
         * @param g The graphcis context
         */
        public void paintComponent(Graphics g){
            imageBorder.paintCenter((Graphics2D)g,this);
            super.paintComponent(g);
        }
        
        /**
         * I want it to be wider than it needs to be
         * @return The desired width of the cell
         */
        public Dimension getPreferredSize() {
            Dimension d = super.getPreferredSize();
            d.width+=20;
            return d;
        }
    }
    
    /**
     * A menu item inside the carousel
     */
    public static class MenuItem{
        /**
         * The component inside the caroulse
         */
        protected Component carouselComponent;
        /**
         * The text label
         */
        protected String    label;
        /**
         * An associated action
         */
        protected Action    action;
        
        /**
         * Creates a new instance of the menu item
         * @param component The component to use
         * @param label The text label
         * @param action The associated action
         */
        public MenuItem(Component component, String label,Action action){
            this.label = label;
            carouselComponent = component;
            this.action = action;
        }

        /**
         * Retreives the label associated with the entry
         * @return The label
         */
        public String getLabel() {
            return label;
        }

        /**
         * Gets the action associated with the entry
         * @return The action associated with the entry
         */
        public Action getAction() {
            return action;
        }

        /**
         * Gets the component in the carousel associated with the entry
         * @return The component
         */
        public Component getCarouselComponent() {
            return carouselComponent;
        }
 
    }
    
    /**
     * This class represents the up and down buttons that allow the scrolling through the menu when it is too big to fit in the avaiable space
     */
    private class UpDownButton extends JLabel implements MouseListener{
        /**
         * True if they should be painted
         */
        private boolean doPaint = true;
        
        /**
         * Creates the up down button
         * @param text Test, ignored
         */
        public UpDownButton(String text){
            super(text);
            addMouseListener(this);
            setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
        }
        
        /**
         * Controls if the button should paint itself or not
         * @param shouldPaint True if it should, false if it shouldn't
         */
        public void setDoPaint(boolean shouldPaint){
            doPaint = shouldPaint;
            repaint();
        }
        
        /**
         * Paint the component
         * @param g The graphics context
         */
        public void paintComponent(Graphics g){
            if (doPaint) {
                Icon icon = this.getIcon();
                if (icon != null) {
                    int centerX = getWidth()
                            - (getInsets().left + getInsets().right);
                    centerX = getInsets().left + centerX / 2;
                    int centerY = getHeight()
                            - (getInsets().top + getInsets().bottom);
                    centerY = getInsets().top + centerY / 2;
                    icon.paintIcon(this, g, centerX - icon.getIconWidth() / 2,
                            centerY - icon.getIconHeight() / 2);
                } else {
                    Graphics2D g2 = (Graphics2D) g;
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                    g.setColor(getForeground());
                    int centerX = getWidth()-(getInsets().left+getInsets().right);
                    centerX = getInsets().left + centerX/2;
                    int height = getHeight()-(getInsets().top+getInsets().bottom);
                    int width = height*2;
                    if ("Up".equals(getText())){
                        g.fillPolygon(new int[]{centerX-width,centerX,centerX+width},new int[]{height,getInsets().top,height},3);                
                    } else {
                        g.fillPolygon(new int[]{centerX-width,centerX,centerX+width},new int[]{getInsets().top,height,getInsets().top},3);                
                    }
                    
                }
            }            
        }


        /**
         * Listens for a mouse click and scroll up or down in the menu when it gets one
         * @param mouseEvent The mouse event
         */
        public void mouseClicked(MouseEvent mouseEvent) {
            if (!doPaint){
                return;
            }
            if (mouseEvent.getClickCount()==1){
                int height = menu.getCellBounds(menu.getSelectedIndex(),menu.getSelectedIndex()).height;
		if (getText().equals("Up")) {
			setSelectedIndex(menu.getSelectedIndex()-1);
                        Point pos = menuScroll.getViewport().getViewPosition();
                        pos.y-=height;
                        menuScroll.getViewport().setViewPosition(pos);
		} else if (getText().equals("Down")) {
			setSelectedIndex(menu.getSelectedIndex()+1);
                        Point pos = menuScroll.getViewport().getViewPosition();
                        pos.y+=height;
                        menuScroll.getViewport().setViewPosition(pos);
		}                
            }
        }

        /**
         * Don't care
         * @param mouseEvent The mouse event
         */
        public void mousePressed(MouseEvent mouseEvent) {
        }

        /**
         * Don't care
         * @param mouseEvent The mouse event
         */
        public void mouseReleased(MouseEvent mouseEvent) {
        }

        /**
         * Don't care
         * @param mouseEvent The mouse event
         */
        public void mouseEntered(MouseEvent mouseEvent) {
        }

        /**
         * Don't care
         * @param mouseEvent The mouse event
         */
        public void mouseExited(MouseEvent mouseEvent) {
        }
        
    }
}
