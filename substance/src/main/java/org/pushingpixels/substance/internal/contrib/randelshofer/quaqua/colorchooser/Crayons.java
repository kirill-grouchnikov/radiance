/*
 * @(#)Crayons.java  1.2  2006-04-23
 *
 * Copyright (c) 2005-2006 Werner Randelshofer
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
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.UIManager;

import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;

/**
 * A panel which displays a selection of color crayons. The user can click at a crayon to pick a
 * color.
 *
 * @author Werner Randelshofer
 * @version 1.2 2006-04-23 Retrieve labels directly from UIManager. <br>
 *          1.1.1 2005-11-07 Get "labels" resource bundle from UIManager. <br>
 *          1.1 2005-08-30 Rearranged code to ease the creation of derived look and feels. <br>
 *          1.0 August 28, 2005 Created.
 */
public class Crayons extends javax.swing.JPanel {

    /**
     * Shared crayons image.
     */
    private BufferedImage crayonsImage;

    /**
     * Coordinates of crayon shaped polygon.
     */
    private final static int[] crayonXPoints = { 10, 12, 20, 22, 22, 0, 0, 2 }; // xpoints
    private final static int[] crayonYPoints = { 0, 0, 21, 21, 104, 104, 21, 21 }; // ypoints

    /**
     * Current color.
     */
    private Color color = Color.white;
    /**
     * Selected crayon.
     */
    private Crayon selectedCrayon = null;

    /**
     * Crayon.
     */
    private class Crayon {
        Polygon shape;
        Color color;
        String name;

        public Crayon(Color color, String name, Polygon shape) {
            this.color = color;
            this.name = name;
            this.shape = shape;
        }
    }

    private class MouseHandler extends MouseAdapter {
        public void mousePressed(MouseEvent evt) {
            int x = evt.getX();
            int y = evt.getY();
            if (x > 0 && x < crayonsImage.getWidth(Crayons.this) && y > 0
                    && y < crayonsImage.getHeight(Crayons.this)) {
                for (int i = crayons.length - 1; i >= 0; i--) {
                    if (crayons[i].shape.contains(x, y)) {
                        setColor(crayons[i].color);
                        break;
                    }
                }
            }
        }
    }

    private MouseHandler mouseHandler;

    /**
     * Crayons.
     */
    private Crayon[] crayons;

    /**
     * Creates a new instance.
     */
    public Crayons() {
        initComponents();

        setForeground(new Color(0x808080));
        setPreferredSize(new Dimension(195, 208));
        setFont(UIManager.getFont("ColorChooser.crayonsFont"));

        crayonsImage = createCrayonsImage();
        crayons = createCrayons();

        mouseHandler = new MouseHandler();
        addMouseListener(mouseHandler);
    }

    protected BufferedImage createCrayonsImage() {
        return (BufferedImage) UIManager.get("ColorChooser.crayonsImage");
    }

    /**
     * Creates the crayons.
     * 
     * @return Array of crayons in z-order from bottom to top.
     */
    protected Crayon[] createCrayons() {
        Color[] colors = DefaultPalettes.CRAYONS;
        crayons = new Crayon[colors.length];
        for (int i = 0; i < colors.length; i++) {
            crayons[i] = new Crayon(colors[i],
                    UIManager.getString("ColorChooser.crayon."
                            + Integer.toHexString(0xff000000 | colors[i].getRGB()).substring(2)),
                    new Polygon((int[]) crayonXPoints.clone(), (int[]) crayonYPoints.clone(),
                            crayonXPoints.length));
            crayons[i].shape.translate((i % 8) * 22 + 4 + ((i / 8) % 2) * 11, (i / 8) * 20 + 23);
        }

        return crayons;
    }

    /**
     * Sets the current color. This results in a selection of a crayon, if a crayon with the same
     * RGB values exists.
     */
    public void setColor(Color newValue) {
        Color oldValue = color;
        color = newValue;

        Crayon newSelectedCrayon = null;
        int newRGB = newValue.getRGB() & 0xffffff;
        for (int i = 0; i < crayons.length; i++) {
            if ((crayons[i].color.getRGB() & 0xffffff) == newRGB) {
                newSelectedCrayon = crayons[i];
            }
        }
        if (newSelectedCrayon != selectedCrayon) {
            selectedCrayon = newSelectedCrayon;
            repaint();
        }

        firePropertyChange("Color", oldValue, newValue);
    }

    /**
     * Returns the current color.
     */
    public Color getColor() {
        return color;
    }

    public void paintComponent(Graphics gr) {
        Graphics2D g2d = (Graphics2D) gr.create();
        RenderingUtils.installDesktopHints(g2d, this);
        double scaleFactor = UIUtil.getScaleFactor();
        g2d.drawImage(crayonsImage, 0, 0, (int) (crayonsImage.getWidth() / scaleFactor),
                (int) (crayonsImage.getHeight() / scaleFactor), this);

        if (selectedCrayon != null) {
            g2d.setColor(getForeground());
            FontMetrics fm = g2d.getFontMetrics();
            int nameWidth = fm.stringWidth(selectedCrayon.name);
            g2d.drawString(selectedCrayon.name,
                    ((int) (crayonsImage.getWidth() / scaleFactor) - nameWidth) / 2,
                    fm.getAscent() + 1);
        }
        g2d.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    private void initComponents() {// GEN-BEGIN:initComponents

        setLayout(new java.awt.BorderLayout());

    }// GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
