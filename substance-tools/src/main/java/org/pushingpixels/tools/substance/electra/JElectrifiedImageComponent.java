/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  o Redistributions of source code must retain the above copyright notice, 
 *    this list of conditions and the following disclaimer. 
 *     
 *  o Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution. 
 *     
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
 *    its contributors may be used to endorse or promote products derived 
 *    from this software without specific prior written permission. 
 *     
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */
package org.pushingpixels.tools.substance.electra;

import org.pushingpixels.neon.NeonUtil;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.tools.substance.common.JImageComponent;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.beans.PropertyChangeEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JElectrifiedImageComponent extends JComponent {
    private JImageComponent originalImageComponent;

    private BufferedImage originalImage;

    private static final int WIDTH = 720;

    private BufferedImage electrifiedImage;

    private float scaleFactor;

    private int imageOffsetX;

    private int imageOffsetY;

    private List<ZoomBubble> zoomBubbles = new ArrayList<ZoomBubble>();

    private JTextField captionEditor;

    private MouseDragHandler mouseDragHandler;

    private static final float RIM_THICKNESS = 3.0f;

    private static final float OUTER_SHADOW_THICKNESS = 8.0f;

    private static final float INNER_SHADOW_THICKNESS = 3.0f;

    private static final int TEXT_OUTER_SHADOW_THICKNESS = 6;

    private static class ZoomBubble {
        double centerX;

        double centerY;

        double radius;

        boolean isSelected;

        boolean isInTextEdit;

        String caption;

        double captionOffsetX;

        double captionOffsetY;

        Rectangle captionRectangle;

        boolean isInverted;
    }

    private static interface MouseDragHandler {
        void onStart(Point point);

        void onDrag(Point point);

        void onEnd(Point point);
    }

    private class ZoomBubbleDragHandler implements MouseDragHandler {
        private ZoomBubble zoomBubble;

        private Point lastDragPoint;

        public ZoomBubbleDragHandler(ZoomBubble zoomBubble) {
            this.zoomBubble = zoomBubble;
        }

        @Override
        public void onStart(Point point) {
            this.lastDragPoint = point;
        }

        @Override
        public void onDrag(Point point) {
            double dx = ((point.x - lastDragPoint.x) / scaleFactor);
            double dy = ((point.y - lastDragPoint.y) / scaleFactor);

            zoomBubble.centerX += dx;
            zoomBubble.centerY += dy;

            lastDragPoint = point;
            repaint();
        }

        @Override
        public void onEnd(Point point) {
        }
    }

    private class ZoomBubbleResizeHandler implements MouseDragHandler {
        private ZoomBubble zoomBubble;

        private Point lastDragPoint;

        public ZoomBubbleResizeHandler(ZoomBubble zoomBubble) {
            this.zoomBubble = zoomBubble;
        }

        @Override
        public void onStart(Point point) {
            this.lastDragPoint = point;
        }

        @Override
        public void onDrag(Point point) {
            Point2D bubbleCenterView = originalToView(
                    new Point2D.Double(zoomBubble.centerX, zoomBubble.centerY));
            double ndx = point.x - bubbleCenterView.getX();
            double ndy = point.y - bubbleCenterView.getY();
            double newRadius = Math.sqrt(ndx * ndx + ndy * ndy);

            double odx = lastDragPoint.x - bubbleCenterView.getX();
            double ody = lastDragPoint.y - bubbleCenterView.getY();
            double oldRadius = Math.sqrt(odx * odx + ody * ody);

            zoomBubble.radius += (newRadius - oldRadius);

            lastDragPoint = point;
            repaint();
        }

        @Override
        public void onEnd(Point point) {
        }
    }

    private class ZoomBubbleCaptionDragHandler implements MouseDragHandler {
        private ZoomBubble zoomBubble;

        private Point lastDragPoint;

        public ZoomBubbleCaptionDragHandler(ZoomBubble zoomBubble) {
            this.zoomBubble = zoomBubble;
        }

        @Override
        public void onStart(Point point) {
            this.lastDragPoint = point;
        }

        @Override
        public void onDrag(Point point) {
            int dx = point.x - lastDragPoint.x;
            int dy = point.y - lastDragPoint.y;

            zoomBubble.captionOffsetX += dx;
            zoomBubble.captionOffsetY += dy;

            lastDragPoint = point;
            repaint();
        }

        @Override
        public void onEnd(Point point) {
        }
    }

    private enum DragType {
        BUBBLE_DRAG, BUBBLE_RESIZE, CAPTION_DRAG;
    }

    private class BubbleDragPair {
        ZoomBubble zoomBubble;

        DragType dragType;

        public BubbleDragPair(ZoomBubble zoomBubble, DragType dragType) {
            this.zoomBubble = zoomBubble;
            this.dragType = dragType;
        }
    }

    public JElectrifiedImageComponent(JImageComponent originalImageComponent) {
        this.originalImageComponent = originalImageComponent;
        this.originalImageComponent.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if ("image".equals(evt.getPropertyName())) {
                originalImage = (BufferedImage) evt.getNewValue();
                reset();
            }
            if ("file".equals(evt.getPropertyName())) {
                File file = (File) evt.getNewValue();
                File layers = new File(file.getParent(), file.getName() + ".layers");
                if (layers.exists()) {
                    loadBubbles(layers);
                }
            }
        });

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (!e.isPopupTrigger()) {
                    // stop editing if any
                    stopCaptionEdit(true);
                    for (ZoomBubble zoomBubble : zoomBubbles) {
                        zoomBubble.isSelected = false;
                    }

                    BubbleDragPair pressed = getInfoForDrag(e.getPoint());
                    if (pressed == null) {
                        repaint();
                        return;
                    }

                    pressed.zoomBubble.isSelected = true;

                    switch (pressed.dragType) {
                    case BUBBLE_DRAG:
                        mouseDragHandler = new ZoomBubbleDragHandler(pressed.zoomBubble);
                        break;
                    case BUBBLE_RESIZE:
                        mouseDragHandler = new ZoomBubbleResizeHandler(pressed.zoomBubble);
                        break;
                    case CAPTION_DRAG:
                        mouseDragHandler = new ZoomBubbleCaptionDragHandler(pressed.zoomBubble);
                        break;
                    }

                    mouseDragHandler.onStart(e.getPoint());
                    repaint();
                } else {
                    final BubbleDragPair pressed = getInfoForDrag(e.getPoint());
                    if (pressed == null) {
                        return;
                    }
                    JPopupMenu popupMenu = new JPopupMenu();
                    popupMenu.add(new AbstractAction("remove") {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            zoomBubbles.remove(pressed.zoomBubble);
                            repaint();
                        }
                    });
                    popupMenu.add(new AbstractAction("invert caption colors") {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            pressed.zoomBubble.isInverted = !pressed.zoomBubble.isInverted;
                            repaint();
                        }
                    });
                    Point pt = SwingUtilities.convertPoint(e.getComponent(), e.getPoint(),
                            JElectrifiedImageComponent.this);
                    popupMenu.show(JElectrifiedImageComponent.this, pt.x, pt.y);
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() != 2)
                    return;

                for (ZoomBubble zoomBubble : zoomBubbles) {
                    if ((zoomBubble.isSelected) && (zoomBubble.caption == null)) {
                        if (zoomBubble.centerX < originalImage.getWidth() / 2) {
                            zoomBubble.captionOffsetX = zoomBubble.radius + 30;
                        } else {
                            zoomBubble.captionOffsetX = -zoomBubble.radius - 30;
                        }
                        zoomBubble.captionOffsetY = 0;
                        startCaptionEdit(zoomBubble);
                        return;
                    }
                }
                for (ZoomBubble zoomBubble : zoomBubbles) {
                    if (zoomBubble.captionRectangle != null) {
                        if (zoomBubble.captionRectangle.contains(e.getPoint())) {
                            startCaptionEdit(zoomBubble);
                            break;
                        }
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (mouseDragHandler != null) {
                    mouseDragHandler.onEnd(e.getPoint());
                    mouseDragHandler = null;
                }
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (mouseDragHandler != null) {
                    mouseDragHandler.onDrag(e.getPoint());
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                BubbleDragPair underMouse = getInfoForDrag(e.getPoint());
                if (underMouse == null) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                    return;
                }

                switch (underMouse.dragType) {
                case BUBBLE_DRAG:
                case CAPTION_DRAG:
                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    break;
                case BUBBLE_RESIZE:
                    setCursor(Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR));
                    break;
                }
            }
        });

        this.captionEditor = new JTextField(25);

        InputMap im = this.captionEditor.getInputMap();
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enter");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "escape");

        ActionMap am = this.captionEditor.getActionMap();
        am.put("enter", new AbstractAction() {
            public void actionPerformed(ActionEvent ae) {
                stopCaptionEdit(true);
            }
        });

        am.put("escape", new AbstractAction() {
            public void actionPerformed(ActionEvent ae) {
                stopCaptionEdit(false);
            }
        });

        this.captionEditor.setVisible(false);
        this.add(this.captionEditor);
        this.setLayout(null);
    }

    BubbleDragPair getInfoForDrag(Point viewPoint) {
        for (ZoomBubble zoomBubble : zoomBubbles) {
            Point2D zoomViewCenter = originalToView(
                    new Point2D.Double(zoomBubble.centerX, zoomBubble.centerY));
            double diffX = zoomViewCenter.getX() - viewPoint.x;
            double diffY = zoomViewCenter.getY() - viewPoint.y;
            double distFromCenter = Math.sqrt(diffX * diffX + diffY * diffY);
            if (distFromCenter < zoomBubble.radius / 2) {
                return new BubbleDragPair(zoomBubble, DragType.BUBBLE_DRAG);
            }
            if (distFromCenter < zoomBubble.radius) {
                return new BubbleDragPair(zoomBubble, DragType.BUBBLE_RESIZE);
            }
        }

        // caption?
        for (ZoomBubble zoomBubble : zoomBubbles) {
            if (zoomBubble.captionRectangle != null) {
                if (zoomBubble.captionRectangle.contains(viewPoint)) {
                    return new BubbleDragPair(zoomBubble, DragType.CAPTION_DRAG);
                }
            }
        }
        return null;
    }

    /**
     * Convenience method that returns a scaled instance of the provided {@code
     * BufferedImage}. Adopted from
     * <a href="http://today.java.net/pub/a/today/2007/04/03/perils-of-image-getscaledinstance.html"
     * >article by Chris Campbell</a>.
     * 
     * @param img
     *            the original image to be scaled
     * @param targetWidth
     *            the desired width of the scaled instance, in pixels
     * @param targetHeight
     *            the desired height of the scaled instance, in pixels
     * @param hint
     *            one of the rendering hints that corresponds to {@code
     *            RenderingHints.KEY_INTERPOLATION} (e.g. {@code
     *            RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR}, {@code
     *            RenderingHints.VALUE_INTERPOLATION_BILINEAR}, {@code
     *            RenderingHints.VALUE_INTERPOLATION_BICUBIC})
     * @param higherQuality
     *            if true, this method will use a multi-step scaling technique that provides higher
     *            quality than the usual one-step technique (only useful in downscaling cases, where
     *            {@code targetWidth} or {@code targetHeight} is smaller than the original
     *            dimensions, and generally only when the {@code BILINEAR} hint is specified)
     * @return a scaled version of the original {@code BufferedImage}
     */
    static BufferedImage getScaledInstance(BufferedImage img, int targetWidth, int targetHeight) {
        int type = (img.getTransparency() == Transparency.OPAQUE) ? BufferedImage.TYPE_INT_RGB
                : BufferedImage.TYPE_INT_ARGB;
        BufferedImage ret = (BufferedImage) img;
        int w, h;
        // Use multi-step technique: start with original size, then
        // scale down in multiple passes with drawImage()
        // until the target size is reached
        w = img.getWidth();
        h = img.getHeight();

        do {
            if (w > targetWidth) {
                w /= 2;
                if (w < targetWidth) {
                    w = targetWidth;
                }
            }

            if (h > targetHeight) {
                h /= 2;
                if (h < targetHeight) {
                    h = targetHeight;
                }
            }

            BufferedImage tmp = new BufferedImage(w, h, type);
            Graphics2D g2 = tmp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            g2.drawImage(ret, 0, 0, w, h, null);
            g2.dispose();

            ret = tmp;
        } while (w != targetWidth || h != targetHeight);

        return ret;
    }

    private void reset() {
        if (originalImage == null) {
            electrifiedImage = null;
        } else {
            // scale down
            this.scaleFactor = (float) WIDTH / (float) originalImage.getWidth();
            if (this.scaleFactor < 1.0f) {
                electrifiedImage = getScaledInstance(originalImage, WIDTH,
                        (int) (this.scaleFactor * originalImage.getHeight()));
            } else {
                this.scaleFactor = 1.0f;
                electrifiedImage = originalImage;
            }
            // and blur
            int kernelSide = 3;
            float[] kernelData = new float[kernelSide * kernelSide];
            for (int i = 0; i < kernelData.length; i++)
                kernelData[i] = 1.0f / kernelData.length;
            Kernel kernel = new Kernel(kernelSide, kernelSide, kernelData);
            electrifiedImage = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null)
                    .filter(electrifiedImage, null);
            setPreferredSize(new Dimension(getSize().width, electrifiedImage.getHeight() + 50));
            ((JScrollPane) SwingUtilities.getAncestorOfClass(JScrollPane.class, this)).revalidate();
        }
        zoomBubbles.clear();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        if (electrifiedImage != null) {
            int width = getWidth();
            int height = getHeight();
            this.imageOffsetX = (width - electrifiedImage.getWidth()) / 2;
            this.imageOffsetY = (height - electrifiedImage.getHeight()) / 2;
            paintElectrified(g2d, true, this.imageOffsetX, this.imageOffsetY);
        }
        g2d.dispose();
    }

    private void paintElectrified(Graphics2D g2d, boolean isOnScreen, int offsetX, int offsetY) {
        if (electrifiedImage != null) {
            g2d.drawImage(this.electrifiedImage, offsetX, offsetY, null);

            g2d.setColor(new Color(0, 0, 0, 32));
            g2d.fillRect(offsetX, offsetY, this.electrifiedImage.getWidth(),
                    this.electrifiedImage.getHeight());

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            // bubbles
            for (ZoomBubble zoomBubble : zoomBubbles) {
                double bubbleCenterViewX = offsetX + zoomBubble.centerX * this.scaleFactor;
                double bubbleCenterViewY = offsetY + zoomBubble.centerY * this.scaleFactor;

                Shape currClip = g2d.getClip();

                int centerViewX = (int) bubbleCenterViewX;
                int centerViewY = (int) bubbleCenterViewY;
                g2d.clip(new Ellipse2D.Double(centerViewX - zoomBubble.radius,
                        centerViewY - zoomBubble.radius, 2 * zoomBubble.radius,
                        2 * zoomBubble.radius));

                int sx1 = (int) (zoomBubble.centerX - zoomBubble.radius);
                int dx1 = (int) (centerViewX - zoomBubble.radius);
                int sx2 = (int) (zoomBubble.centerX + zoomBubble.radius);
                int dx2 = dx1 + (sx2 - sx1);

                if (sx1 < 0) {
                    dx1 = dx1 - sx1;
                    sx1 = 0;
                }
                if (sx2 > originalImage.getWidth()) {
                    dx2 = dx2 - (sx2 - originalImage.getWidth());
                    sx2 = originalImage.getWidth();
                }

                int sy1 = (int) (zoomBubble.centerY - zoomBubble.radius);
                int dy1 = (int) (centerViewY - zoomBubble.radius);
                int sy2 = (int) (zoomBubble.centerY + zoomBubble.radius);
                int dy2 = dy1 + (sy2 - sy1);

                if (sy1 < 0) {
                    dy1 = dy1 - sy1;
                    sy1 = 0;
                }
                if (sy2 > originalImage.getHeight()) {
                    dy2 = dy2 - (sy2 - originalImage.getHeight());
                    sy2 = originalImage.getHeight();
                }

                if ((sx2 - sx1) != (dx2 - dx1)) {
                    throw new IllegalStateException();
                }
                if ((sy2 - sy1) != (dy2 - dy1)) {
                    throw new IllegalStateException();
                }

                g2d.drawImage(this.originalImage, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, null);
                g2d.setClip(currClip);

                float totalRadius = (float) (zoomBubble.radius + RIM_THICKNESS / 2
                        + OUTER_SHADOW_THICKNESS);
                RadialGradientPaint rimPaint = new RadialGradientPaint(centerViewX, centerViewY,
                        totalRadius,
                        new float[] { 0.0f,
                                        (float) ((zoomBubble.radius - RIM_THICKNESS / 2
                                                - INNER_SHADOW_THICKNESS) / totalRadius),
                                        (float) ((zoomBubble.radius - RIM_THICKNESS / 2)
                                                / totalRadius),
                                        (float) ((zoomBubble.radius + RIM_THICKNESS / 2)
                                                / totalRadius),
                                        (float) ((zoomBubble.radius + RIM_THICKNESS / 2
                                                + OUTER_SHADOW_THICKNESS / 3) / totalRadius),
                                        1.0f },
                        new Color[] { new Color(0, 0, 0, 0), new Color(0, 0, 0, 0),
                                        new Color(0, 0, 0, 128), new Color(0, 0, 0, 128),
                                        new Color(0, 0, 0, 32), new Color(0, 0, 0, 0) });
                g2d.setPaint(rimPaint);
                g2d.fill(new Ellipse2D.Double(centerViewX - totalRadius, centerViewY - totalRadius,
                        2 * totalRadius, 2 * totalRadius));
                g2d.setColor(Color.white);
                g2d.setStroke(new BasicStroke(RIM_THICKNESS));
                g2d.draw(new Ellipse2D.Double(centerViewX - zoomBubble.radius,
                        centerViewY - zoomBubble.radius, 2 * zoomBubble.radius,
                        2 * zoomBubble.radius));

                if (zoomBubble.isSelected && isOnScreen) {
                    g2d.setColor(new Color(0, 0, 0, 196));

                    int selectionCornerSide = 6;

                    int selectionLeftX = (int) (centerViewX - zoomBubble.radius
                            - RIM_THICKNESS / 2);
                    int selectionRightX = (int) (centerViewX + zoomBubble.radius
                            + RIM_THICKNESS / 2);
                    int selectionTopY = (int) (centerViewY - zoomBubble.radius - RIM_THICKNESS / 2);
                    int selectionBottomY = (int) (centerViewY + zoomBubble.radius
                            + RIM_THICKNESS / 2);

                    g2d.setStroke(new BasicStroke(1.2f));
                    g2d.drawRect((int) (selectionLeftX - selectionCornerSide / 2),
                            (int) (selectionTopY - selectionCornerSide / 2), selectionCornerSide,
                            selectionCornerSide);
                    g2d.drawRect((int) (selectionLeftX - selectionCornerSide / 2),
                            (int) (selectionBottomY - selectionCornerSide / 2), selectionCornerSide,
                            selectionCornerSide);
                    g2d.drawRect((int) (selectionRightX - selectionCornerSide / 2),
                            (int) (selectionTopY - selectionCornerSide / 2), selectionCornerSide,
                            selectionCornerSide);
                    g2d.drawRect((int) (selectionRightX - selectionCornerSide / 2),
                            (int) (selectionBottomY - selectionCornerSide / 2), selectionCornerSide,
                            selectionCornerSide);

                    g2d.setStroke(new BasicStroke(1.2f, BasicStroke.CAP_BUTT,
                            BasicStroke.JOIN_ROUND, 0.0f, new float[] { 2.0f, 1.0f }, 0.0f));
                    g2d.drawLine((int) (selectionLeftX + selectionCornerSide / 2), selectionTopY,
                            (int) (selectionRightX - selectionCornerSide / 2), selectionTopY);
                    g2d.drawLine((int) (selectionLeftX + selectionCornerSide / 2), selectionBottomY,
                            (int) (selectionRightX - selectionCornerSide / 2), selectionBottomY);
                    g2d.drawLine(selectionLeftX, (int) (selectionTopY + selectionCornerSide / 2),
                            selectionLeftX, (int) (selectionBottomY - selectionCornerSide / 2));
                    g2d.drawLine(selectionRightX, (int) (selectionTopY + selectionCornerSide / 2),
                            selectionRightX, (int) (selectionBottomY - selectionCornerSide / 2));
                }

                // caption
                if (zoomBubble.caption != null && !zoomBubble.isInTextEdit) {
                    Font font = SubstanceCortex.GlobalScope.getFontPolicy()
                            .getFontSet("Substance", null).getControlFont();
                    g2d.setFont(font);
                    int strWidth = g2d.getFontMetrics().stringWidth(zoomBubble.caption);
                    int fontHeight = g2d.getFontMetrics().getHeight();

                    int captionHeight = fontHeight + 8;
                    int captionWidth = strWidth + 8;

                    int radius = 3;
                    int x = (int) (centerViewX + zoomBubble.captionOffsetX);
                    int y = (int) (centerViewY + zoomBubble.captionOffsetY);

                    Shape outerContour = (zoomBubble.captionOffsetX < 0)
                            ? getCaptionOutlinePointingToRight(captionHeight, captionWidth, radius,
                                    0)
                            : getCaptionOutlinePointingToLeft(captionHeight, captionWidth, radius,
                                    0);
                    Shape innerContour = (zoomBubble.captionOffsetX < 0)
                            ? getCaptionOutlinePointingToRight(captionHeight, captionWidth, radius,
                                    1)
                            : getCaptionOutlinePointingToLeft(captionHeight, captionWidth, radius,
                                    1);

                    boolean isInverted = zoomBubble.isInverted;

                    g2d.translate(x, y);
                    g2d.setPaint(new GradientPaint(0, 0,
                            isInverted ? new Color(224, 224, 224, 240) : new Color(32, 32, 32, 240),
                            0, captionHeight,
                            isInverted ? new Color(255, 255, 255, 240) : new Color(0, 0, 0, 240)));
                    g2d.fill(outerContour);

                    for (int i = TEXT_OUTER_SHADOW_THICKNESS; i >= 0; i--) {
                        g2d.setColor(new Color(0, 0, 0, 12));
                        g2d.setStroke(new BasicStroke(i));
                        g2d.draw(outerContour);
                    }
                    g2d.setColor(
                            isInverted ? new Color(255, 255, 255, 196) : new Color(0, 0, 0, 196));
                    g2d.setStroke(
                            new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER));
                    g2d.draw(outerContour);

                    g2d.setPaint(new LinearGradientPaint(0, 0, 0, captionHeight,
                            new float[] { 0.0f, 0.8f, 1.0f },
                            new Color[] { isInverted ? new Color(64, 64, 64, 64)
                                    : new Color(192, 192, 192, 64),
                                            isInverted ? new Color(64, 64, 64, 48)
                                                    : new Color(192, 192, 192, 48),
                                            isInverted ? new Color(64, 64, 64, 16)
                                                    : new Color(192, 192, 192, 16) }));
                    g2d.setStroke(
                            new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER));
                    g2d.draw(innerContour);

                    g2d.translate(-x, -y);

                    NeonUtil.installDesktopHints(g2d, this);
                    int textY = y + 4 + g2d.getFontMetrics().getAscent();
                    int textX = (zoomBubble.captionOffsetX < 0) ? x + captionHeight / 6 + 4
                            : x + captionHeight / 3 + 4;

                    g2d.setColor(
                            isInverted ? new Color(255, 255, 255, 128) : new Color(0, 0, 0, 196));
                    g2d.drawString(zoomBubble.caption, textX - 1, textY);
                    g2d.drawString(zoomBubble.caption, textX + 1, textY);
                    g2d.drawString(zoomBubble.caption, textX, textY - 1);
                    g2d.drawString(zoomBubble.caption, textX, textY + 1);
                    g2d.setColor(isInverted ? new Color(0, 0, 0) : new Color(224, 224, 224));
                    g2d.drawString(zoomBubble.caption, textX, textY);

                    if (zoomBubble.captionOffsetX < 0) {
                        zoomBubble.captionRectangle = new Rectangle(x + captionHeight / 6, y,
                                captionWidth, captionHeight);
                    } else {
                        zoomBubble.captionRectangle = new Rectangle(x + captionHeight / 3, y,
                                captionWidth, captionHeight);
                    }
                }
            }
        }
    }

    private Shape getCaptionOutlinePointingToRight(int captionHeight, int captionWidth, int radius,
            int insets) {
        GeneralPath contour = new GeneralPath();
        contour.moveTo(radius, insets);
        contour.lineTo(captionWidth, insets);
        contour.lineTo(captionWidth + captionHeight / 2 - insets, captionHeight / 2);
        contour.lineTo(captionWidth, captionHeight - insets);
        // bottom left corner
        contour.append(
                new Arc2D.Double(insets, captionHeight - 2 * radius + insets,
                        2 * radius - 2 * insets, 2 * radius - 2 * insets, 270, -90, Arc2D.OPEN),
                true);
        contour.lineTo(insets, radius);
        // top left corner
        contour.append(new Arc2D.Double(insets, insets, 2 * radius - 2 * insets,
                2 * radius - 2 * insets, 180, -90, Arc2D.OPEN), true);
        contour.closePath();
        return contour;
    }

    private Shape getCaptionOutlinePointingToLeft(int captionHeight, int captionWidth, int radius,
            int insets) {
        GeneralPath contour = new GeneralPath();
        contour.moveTo(insets, captionHeight / 2);
        contour.lineTo(captionHeight / 2, insets);
        contour.lineTo(captionWidth + captionHeight / 2 - radius, insets);
        // top right corner
        contour.append(
                new Arc2D.Double(captionWidth + captionHeight / 2 - 2 * radius + insets, insets,
                        2 * radius - 2 * insets, 2 * radius - 2 * insets, 90, -90, Arc2D.OPEN),
                true);
        contour.lineTo(captionWidth + captionHeight / 2 - insets, captionHeight - radius - insets);
        // bottom right corner
        contour.append(new Arc2D.Double(captionWidth + captionHeight / 2 - 2 * radius + insets,
                captionHeight - 2 * radius + insets, 2 * radius - 2 * insets,
                2 * radius - 2 * insets, 0, -90, Arc2D.OPEN), true);
        contour.lineTo(captionHeight / 2, captionHeight - insets);
        contour.closePath();
        return contour;
    }

    void addZoomBubble(int x, int y, int radius) {
        ZoomBubble zoomBubble = new ZoomBubble();
        zoomBubble.centerX = x;
        zoomBubble.centerY = y;
        zoomBubble.radius = radius;
        zoomBubble.isInverted = false;
        this.zoomBubbles.add(zoomBubble);
        repaint();
    }

    Point2D originalToView(Point2D original) {
        double viewX = this.imageOffsetX + original.getX() * this.scaleFactor;
        double viewY = this.imageOffsetY + original.getY() * this.scaleFactor;
        return new Point2D.Double(viewX, viewY);
    }

    Point2D viewToOriginal(Point2D view) {
        double origX = (view.getX() - imageOffsetX) / scaleFactor;
        double origY = (view.getY() - imageOffsetY) / scaleFactor;
        return new Point2D.Double(origX, origY);
    }

    void startCaptionEdit(final ZoomBubble bubble) {
        bubble.isInTextEdit = true;

        if (bubble.caption != null) {
            captionEditor.setText(bubble.caption);
            captionEditor.selectAll();
        } else {
            captionEditor.setText("");
        }
        Dimension pref = captionEditor.getPreferredSize();
        Point2D bubbleCenterView = originalToView(
                new Point2D.Double(bubble.centerX, bubble.centerY));
        captionEditor.setBounds((int) (bubbleCenterView.getX() + bubble.captionOffsetX),
                (int) (bubbleCenterView.getY() + bubble.captionOffsetY), pref.width, pref.height);
        captionEditor.setVisible(true);
        captionEditor.requestFocus();
        repaint();
    }

    void stopCaptionEdit(boolean saveChanges) {
        if (!this.captionEditor.isVisible())
            return;

        // get the text
        String text = captionEditor.getText();
        if (text.length() == 0) {
            text = null;
        }
        for (ZoomBubble zoomBubble : zoomBubbles) {
            if (zoomBubble.isInTextEdit) {
                zoomBubble.caption = text;
                zoomBubble.isInTextEdit = false;
            }
        }

        captionEditor.setVisible(false);
        repaint();
    }

    void save(File originalFile) {
        int extraTop = 0;
        int extraBottom = 0;
        int extraLeft = 0;
        int extraRight = 0;
        for (ZoomBubble zoomBubble : zoomBubbles) {
            Point2D bubbleCenterView = originalToView(
                    new Point2D.Double(zoomBubble.centerX, zoomBubble.centerY));
            double l = bubbleCenterView.getX() - zoomBubble.radius - imageOffsetX
                    - RIM_THICKNESS / 2 - OUTER_SHADOW_THICKNESS;
            double r = bubbleCenterView.getX() + zoomBubble.radius - imageOffsetX
                    + RIM_THICKNESS / 2 + OUTER_SHADOW_THICKNESS;
            double t = bubbleCenterView.getY() - zoomBubble.radius - imageOffsetY
                    - RIM_THICKNESS / 2 - OUTER_SHADOW_THICKNESS;
            double b = bubbleCenterView.getY() + zoomBubble.radius - imageOffsetY
                    + RIM_THICKNESS / 2 + OUTER_SHADOW_THICKNESS;

            if (zoomBubble.captionRectangle != null) {
                l = Math.min(l, zoomBubble.captionRectangle.getMinX() - imageOffsetX
                        - TEXT_OUTER_SHADOW_THICKNESS);
                r = Math.max(r, zoomBubble.captionRectangle.getMaxX() - imageOffsetX
                        + TEXT_OUTER_SHADOW_THICKNESS);
                t = Math.min(t, zoomBubble.captionRectangle.getMinY() - imageOffsetY
                        - TEXT_OUTER_SHADOW_THICKNESS);
                b = Math.max(b, zoomBubble.captionRectangle.getMaxY() - imageOffsetY
                        + TEXT_OUTER_SHADOW_THICKNESS);
            }

            if (l < 0) {
                extraLeft = Math.max(extraLeft, (int) Math.ceil(-l));
            }
            if (r > WIDTH) {
                extraRight = Math.max(extraRight, (int) Math.ceil(r - WIDTH));
            }
            if (t < 0) {
                extraTop = Math.max(extraTop, (int) Math.ceil(-t));
            }
            if (b > electrifiedImage.getHeight()) {
                extraBottom = Math.max(extraBottom,
                        (int) Math.ceil(b - electrifiedImage.getHeight()));
            }
        }

        int finalWidth = WIDTH + extraLeft + extraRight;
        int finalHeight = electrifiedImage.getHeight() + extraTop + extraBottom;

        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice d = e.getDefaultScreenDevice();
        GraphicsConfiguration c = d.getDefaultConfiguration();
        BufferedImage compatibleImage = c.createCompatibleImage(finalWidth, finalHeight,
                Transparency.TRANSLUCENT);

        Graphics2D g2d = compatibleImage.createGraphics();
        g2d.translate(extraLeft, extraTop);
        this.paintElectrified(g2d, false, 0, 0);
        g2d.dispose();

        try {
            String origFileName = originalFile.getName();
            String targetFileName = origFileName.substring(0, origFileName.lastIndexOf('.'))
                    + ".electra.png";
            ImageIO.write(compatibleImage, "png",
                    new File(originalFile.getParentFile(), targetFileName));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        saveBubbles(new File(originalFile.getParentFile(), originalFile.getName() + ".layers"));
    }

    private void saveBubbles(File file) {
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("count=" + this.zoomBubbles.size());
            for (int i = 0; i < this.zoomBubbles.size(); i++) {
                ZoomBubble zoomBubble = this.zoomBubbles.get(i);
                pw.println("bubble" + i + ".centerX=" + zoomBubble.centerX);
                pw.println("bubble" + i + ".centerY=" + zoomBubble.centerY);
                pw.println("bubble" + i + ".radius=" + zoomBubble.radius);
                if (zoomBubble.caption != null) {
                    pw.println("bubble" + i + ".caption=" + zoomBubble.caption);
                    pw.println("bubble" + i + ".captionOffsetX=" + zoomBubble.captionOffsetX);
                    pw.println("bubble" + i + ".captionOffsetY=" + zoomBubble.captionOffsetY);
                }
                pw.println("bubble" + i + ".isInverted=" + zoomBubble.isInverted);
            }
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadBubbles(File file) {
        try {
            Properties props = new Properties();
            props.load(new FileReader(file));

            zoomBubbles.clear();
            int count = Integer.parseInt(props.getProperty("count"));
            for (int i = 0; i < count; i++) {
                ZoomBubble zoomBubble = new ZoomBubble();
                zoomBubble.centerX = Double
                        .parseDouble(props.getProperty("bubble" + i + ".centerX"));
                zoomBubble.centerY = Double
                        .parseDouble(props.getProperty("bubble" + i + ".centerY"));
                zoomBubble.radius = Double.parseDouble(props.getProperty("bubble" + i + ".radius"));
                zoomBubble.caption = props.getProperty("bubble" + i + ".caption");
                if (zoomBubble.caption != null) {
                    zoomBubble.captionOffsetX = Double
                            .parseDouble(props.getProperty("bubble" + i + ".captionOffsetX"));
                    zoomBubble.captionOffsetY = Double
                            .parseDouble(props.getProperty("bubble" + i + ".captionOffsetY"));
                }
                String invertedKey = "bubble" + i + ".isInverted";
                if (props.containsKey(invertedKey)) {
                    zoomBubble.isInverted = Boolean.parseBoolean(props.getProperty(invertedKey));
                } else {
                    zoomBubble.isInverted = false;
                }
                zoomBubbles.add(zoomBubble);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
