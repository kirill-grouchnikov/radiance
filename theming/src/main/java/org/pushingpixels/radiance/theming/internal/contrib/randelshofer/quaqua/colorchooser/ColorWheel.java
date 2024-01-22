/*
 * @(#)ColorWheel.java  1.0  August 27, 2005
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

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

/**
 * The ColorWheel displays a hue/saturation wheel of the HSB color model. The user can click at the
 * wheel to pick a color on the ColorWheel. The ColorWheel should be used together with a HSB
 * brightness color slider.
 *
 * @author Werner Randelshofer
 * @version 1.0 August 27, 2005 Created.
 */
public class ColorWheel extends JPanel {
    private Image colorWheelImage;
    private ColorWheelImageProducer colorWheelProducer;
    private HSBColorSliderModel model;

    private class MouseHandler implements MouseListener, MouseMotionListener {
        public void mouseClicked(MouseEvent e) {
        }

        public void mouseDragged(MouseEvent e) {
            update(e);
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

        public void mouseMoved(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
            update(e);
        }

        private void update(MouseEvent e) {
            double scaleFactor = RadianceCommonCortex.getScaleFactor(ColorWheel.this);
            int x = e.getX() - getWidth() / 2;
            int y = e.getY() - getHeight() / 2;
            float r = (float) (scaleFactor * Math.sqrt(x * x + y * y));
            float theta = (float) Math.atan2(y, -x);

            model.setValue(0, 180 + (int) (theta / Math.PI * 180d));
            model.setValue(1,
                    (int) (Math.min(1f, r / colorWheelProducer.getRadius()) * 100f));

            // FIXME - We should only repaint the damaged area
            repaint();
        }
    }

    private MouseHandler mouseHandler;

    private class ModelHandler implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            repaint();
        }
    }

    private ModelHandler modelHandler;

    /**
     * Creates a new instance.
     */
    public ColorWheel() {
        model = new HSBColorSliderModel();
        initComponents();
        colorWheelProducer = new ColorWheelImageProducer(0, 0);
        mouseHandler = new MouseHandler();
        modelHandler = new ModelHandler();
        addMouseListener(mouseHandler);
        addMouseMotionListener(mouseHandler);
        setOpaque(false);
    }

    public void setModel(HSBColorSliderModel m) {
        if (model != null) {
            model.removeChangeListener(modelHandler);
        }
        model = m;
        if (model != null) {
            model.addChangeListener(modelHandler);
            repaint();
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(100, 100);
    }

    public HSBColorSliderModel getModel() {
        return model;
    }

    public void paintComponent(Graphics g) {
        int w = getWidth();
        int h = getHeight();

        double scaleFactor = RadianceCommonCortex.getScaleFactor(this);
        if (colorWheelImage == null || (scaleFactor * colorWheelImage.getWidth(this)) != w
                || (scaleFactor * colorWheelImage.getHeight(this)) != h) {
            if (colorWheelImage != null) {
                colorWheelImage.flush();
            }
            colorWheelProducer = new ColorWheelImageProducer((int) (w * scaleFactor),
                    (int) (h * scaleFactor));
            colorWheelImage = createImage(colorWheelProducer);
            if (scaleFactor > 1) {
                BufferedImage retinaWheelImage = RadianceCoreUtilities.getBlankImage(
                        scaleFactor, w, h);
                Graphics2D wheel2D = retinaWheelImage.createGraphics();
                wheel2D.drawImage(colorWheelImage, 0, 0, w, h, null);
                wheel2D.dispose();
                colorWheelImage = retinaWheelImage;
            }
        }

        colorWheelProducer.setBrightness(model.getValue(2) / 100f);
        colorWheelProducer.regenerateColorWheel();

        g.drawImage(colorWheelImage, 0, 0, (int) (colorWheelImage.getWidth(null) / scaleFactor),
                (int) (colorWheelImage.getHeight(null) / scaleFactor), this);

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, w, h,
                (graphics1X, x, y, scaledWidth, scaledHeight, _scaleFactor) -> {
                    double r = colorWheelProducer.getRadius() * model.getValue(1) / 100d;
                    double angle = model.getValue(0) * Math.PI / 180d;

                    int scaledX = scaledWidth / 2 + (int) (r * Math.cos(angle));
                    int scaledY = scaledHeight / 2 - (int) (r * Math.sin(angle));
                    int halfRectSize = ((int) Math.floor( 4 * _scaleFactor)) / 2;
                    int rectSize = 2 * halfRectSize;
                    graphics1X.setColor(Color.black);
                    graphics1X.fillRect(scaledX - rectSize, scaledY - rectSize, 2 * rectSize, 2 * rectSize);
                    graphics1X.setColor(Color.white);
                    graphics1X.fillRect(scaledX - halfRectSize, scaledY - halfRectSize, rectSize, rectSize);
                });
        graphics.dispose();
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
