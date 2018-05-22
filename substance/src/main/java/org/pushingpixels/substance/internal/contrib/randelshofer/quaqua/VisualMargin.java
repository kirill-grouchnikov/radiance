/*
 * @(#)VisualMargin.java  2.2  2005-10-01
 *
 * Copyright (c) 2004-2005 Werner Randelshofer
 * Staldenmattweg 2, Immensee, CH-6405, Switzerland.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Werner Randelshofer. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Werner Randelshofer.
 */

package org.pushingpixels.substance.internal.contrib.randelshofer.quaqua;

import java.awt.Component;
import java.awt.Insets;

import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.border.AbstractBorder;
import javax.swing.plaf.UIResource;

/**
 * The VisualMargin is used to visually align components using bounds
 * based on other criterias than the clip bounds of the component.
 *
 * For example: The clip bounds of a JButton includes its cast shadow and its
 * focus ring. When we align the JButton with a JLabel, we want to align the
 * baseline of the Text of the JButton with the text in the JLabel.
 *
 * The visual margin may be quite large. We allow to programmatically set a
 * smaller margin using the client property "Quaqua.Component.margin".
 *
 * @author  Werner Randelshofer
 * @version 2.2 2005-10-01 Added method getVisualMargin.
 * <br>2.1 2005-06-21 Implements UIResource.
 * <br>2.0 2005-05-08 Renamed from BorderMargin to VisualMargin. Reworked
 * API.
 * <br>1.0  31 March 2005  Created.
 */
public class VisualMargin extends AbstractBorder implements UIResource {
    /**
     * Defines the margin from the clip bounds of the
     * component to its visually perceived borderline.
     */
    private Insets layoutMargin;
    
    /**
     * The UIManager Property to be used for the default margin.
     */
    private String uiManagerPropertyName = "Component.visualMargin";
    /**
     * The Client Property to be used for the default margin.
     */
    private String propertyName = "Quaqua.Component.visualMargin";
    
    private boolean isTopFixed, isLeftFixed, isBottomFixed, isRightFixed;
    
    /**
     * Creates a new VisualMargin.
     */
    public VisualMargin() {
        layoutMargin = new Insets(0, 0, 0, 0);
    }
    
    /**
     * The UIManager Property to be used for the default margin.
     */
    public void setPropertyName(String propertyName) {
        //  this.propertyName = propertyName;
    }
    
    /*
     * Specifies SwingConstants.TOP, LEFT, BOTTOM, RIGHT to be fixed.
     * Set to false to unfix.
     */
    public void setFixed(boolean top, boolean left, boolean bottom, boolean right) {
        isTopFixed = top;
        isLeftFixed = left;
        isBottomFixed = bottom;
        isRightFixed = right;
    }
    /**
     * Creates a new VisualMargin.
     *
     * @param top Defines the margin from the clip bounds of the
     * component to its visual bounds.
     * @param left Defines the margin from the clip bounds of the
     * component to its visual bounds.
     * @param bottom Defines the margin from the clip bounds of the
     * component to its visual bounds.
     * @param right Defines the margin from the clip bounds of the
     * component to its visual bounds.
     */
    public VisualMargin(int top, int left, int bottom, int right) {
        layoutMargin = new Insets(top, left, bottom, right);
    }
    public VisualMargin(int top, int left, int bottom, int right, boolean ftop, boolean fleft, boolean fbottom, boolean fright) {
        layoutMargin = new Insets(top, left, bottom, right);
        isTopFixed = ftop;
        isLeftFixed = fleft;
        isBottomFixed = fbottom;
        isRightFixed = fright;
    }
    public VisualMargin(boolean ftop, boolean fleft, boolean fbottom, boolean fright) {
        layoutMargin = new Insets(0, 0, 0, 0);
        isTopFixed = ftop;
        isLeftFixed = fleft;
        isBottomFixed = fbottom;
        isRightFixed = fright;
    }
    /**
     * Creates a new VisualMargin.
     *
     * @param layoutMargin Defines the margin from the clip bounds of the
     * component to its visual bounds. The margin has usually negative values!
     */
    public VisualMargin(Insets layoutMargin) {
        this.layoutMargin = layoutMargin;
    }
    
    public Insets getVisualMargin(Component c) {
        Insets insets = new Insets(
         layoutMargin.top,
        layoutMargin.left,
        layoutMargin.bottom,
         layoutMargin.right
         );
        
        if (c instanceof JComponent) {
            Insets componentMargin = (Insets) ((JComponent) c).getClientProperty(propertyName);
            if (componentMargin == null && propertyName != null) {
                componentMargin = UIManager.getInsets(uiManagerPropertyName);
            }
            if (componentMargin != null) {
                if (! isTopFixed) insets.top = componentMargin.top;
                if (! isLeftFixed) insets.left = componentMargin.left;
                if (! isBottomFixed) insets.bottom = componentMargin.bottom;
                if (! isRightFixed) insets.right = componentMargin.right;
            }
        }
        return insets;
    }
    
    public Insets getBorderInsets(Component c) {
        return getBorderInsets(c, new Insets(0, 0, 0, 0));
    }
    
    /**
     * Reinitializes the insets parameter with this Border's current Insets.
     * @param c the component for which this border insets value applies
     * @param insets the object to be reinitialized
     * @return the <code>insets</code> object
     */
    public Insets getBorderInsets(Component c, Insets insets) {
        return getVisualMargin(c, insets);
    }
    /**
     * Reinitializes the insets parameter with this Border's current Insets.
     * @param c the component for which this border insets value applies
     * @param insets the object to be reinitialized
     * @return the <code>insets</code> object
     */
    protected Insets getVisualMargin(Component c, Insets insets) {
        insets.top = -layoutMargin.top;
        insets.left = -layoutMargin.left;
        insets.bottom = -layoutMargin.bottom;
        insets.right = -layoutMargin.right;
        
        if (c instanceof JComponent) {
            Insets componentMargin = (Insets) ((JComponent) c).getClientProperty(propertyName);
            if (componentMargin == null && propertyName != null) {
                componentMargin = UIManager.getInsets(uiManagerPropertyName);
            }
            if (componentMargin != null) {
                if (! isTopFixed) insets.top += componentMargin.top;
                if (! isLeftFixed) insets.left += componentMargin.left;
                if (! isBottomFixed) insets.bottom += componentMargin.bottom;
                if (! isRightFixed) insets.right += componentMargin.right;
            }
        }
        return insets;
    }
}
