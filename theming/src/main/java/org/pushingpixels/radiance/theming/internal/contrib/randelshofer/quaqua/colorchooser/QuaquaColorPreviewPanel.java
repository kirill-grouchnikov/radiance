/*
 * @(#)QuaquaColorPreviewPanel.java  1.2  2005-12-18
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

package org.pushingpixels.radiance.theming.internal.contrib.randelshofer.quaqua.colorchooser;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * QuaquaColorPreviewPanel.
 *
 * @author Werner Randelshofer
 * @version 1.2 2005-12-18 Tweaked insets. <br>
 * 			1.1 2005-09-20 Added tooltip. This is not what the native
 *          NSColorPicker does, but it is very useful. <br>
 * 			1.0 30 March 2005 Created.
 */
public class QuaquaColorPreviewPanel extends JPanel implements UIResource {
	/** Creates new form. */
	public QuaquaColorPreviewPanel() {
		initComponents();
		setToolTipText("on"); // set some text, to switch tooltip on
	}

	public void paintComponent(Graphics g) {
		Insets insets = getInsets();
		int x = insets.left;
		int y = insets.top;
		int w = getWidth() - insets.left - insets.right;
		int h = getHeight() - insets.top - insets.bottom;
		g.setColor(getForeground());
		g.fillRect(x, y, w, h);
	}

	public String getToolTipText(MouseEvent evt) {
		Color color = getForeground();
		return (color == null) ? null
				: color.getRed() + ", " + color.getGreen() + ", " + color.getBlue();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {// GEN-BEGIN:initComponents

		setLayout(new java.awt.BorderLayout());

		setPreferredSize(new java.awt.Dimension(26, 26));
	}// GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	// End of variables declaration//GEN-END:variables

}
