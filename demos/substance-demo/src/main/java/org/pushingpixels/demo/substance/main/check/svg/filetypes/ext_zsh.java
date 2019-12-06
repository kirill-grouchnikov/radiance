package org.pushingpixels.demo.substance.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_zsh implements ResizableIcon {
    

    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Shape clip = null;

        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.2, 40.4);
((GeneralPath)shape).lineTo(43.1, 40.4);
((GeneralPath)shape).lineTo(43.1, 43.600002);
((GeneralPath)shape).lineTo(30.2, 43.600002);
((GeneralPath)shape).lineTo(30.2, 40.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 46.800003);
((GeneralPath)shape).lineTo(43.1, 46.800003);
((GeneralPath)shape).lineTo(43.1, 50.0);
((GeneralPath)shape).lineTo(30.2, 50.0);
((GeneralPath)shape).lineTo(30.2, 46.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 53.300003);
((GeneralPath)shape).lineTo(43.1, 53.300003);
((GeneralPath)shape).lineTo(43.1, 56.500004);
((GeneralPath)shape).lineTo(30.2, 56.500004);
((GeneralPath)shape).lineTo(30.2, 53.300003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.800003, 24.200003);
((GeneralPath)shape).lineTo(26.9, 24.200003);
((GeneralPath)shape).curveTo(23.3, 24.200003, 20.4, 27.100002, 20.4, 30.700003);
((GeneralPath)shape).lineTo(20.4, 59.800003);
((GeneralPath)shape).lineTo(14.0, 59.800003);
((GeneralPath)shape).curveTo(14.0, 63.4, 16.9, 66.3, 20.5, 66.3);
((GeneralPath)shape).lineTo(46.3, 66.3);
((GeneralPath)shape).curveTo(49.899998, 66.3, 52.8, 63.4, 52.8, 59.800003);
((GeneralPath)shape).lineTo(52.8, 33.9);
((GeneralPath)shape).lineTo(59.3, 33.9);
((GeneralPath)shape).lineTo(59.3, 30.7);
((GeneralPath)shape).curveTo(59.2, 27.1, 56.399998, 24.2, 52.8, 24.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.600002, 59.200005);
((GeneralPath)shape).curveTo(49.600002, 61.300003, 47.9, 63.000004, 45.800003, 63.000004);
((GeneralPath)shape).lineTo(22.1, 63.000004);
((GeneralPath)shape).curveTo(23.7, 61.900005, 23.7, 59.800003, 23.7, 59.800003);
((GeneralPath)shape).lineTo(23.7, 30.7);
((GeneralPath)shape).curveTo(23.7, 28.900002, 25.1, 27.5, 26.900002, 27.5);
((GeneralPath)shape).curveTo(28.7, 27.5, 30.100002, 28.9, 30.100002, 30.7);
((GeneralPath)shape).lineTo(30.100002, 33.9);
((GeneralPath)shape).lineTo(49.5, 33.9);
((GeneralPath)shape).lineTo(49.5, 59.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.4, 30.7);
((GeneralPath)shape).lineTo(33.4, 27.5);
((GeneralPath)shape).lineTo(52.800003, 27.5);
((GeneralPath)shape).curveTo(55.700005, 27.5, 56.000004, 29.3, 56.000004, 30.7);
((GeneralPath)shape).lineTo(33.4, 30.7);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 66.23100280761719), new Point2D.Double(36.63199996948242, 24.231000900268555), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 66.60600280761719), new Point2D.Double(36.63199996948242, 23.856000900268555), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.2, 40.4);
((GeneralPath)shape).lineTo(43.1, 40.4);
((GeneralPath)shape).lineTo(43.1, 43.600002);
((GeneralPath)shape).lineTo(30.2, 43.600002);
((GeneralPath)shape).lineTo(30.2, 40.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 46.800003);
((GeneralPath)shape).lineTo(43.1, 46.800003);
((GeneralPath)shape).lineTo(43.1, 50.0);
((GeneralPath)shape).lineTo(30.2, 50.0);
((GeneralPath)shape).lineTo(30.2, 46.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 53.300003);
((GeneralPath)shape).lineTo(43.1, 53.300003);
((GeneralPath)shape).lineTo(43.1, 56.500004);
((GeneralPath)shape).lineTo(30.2, 56.500004);
((GeneralPath)shape).lineTo(30.2, 53.300003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.800003, 24.200003);
((GeneralPath)shape).lineTo(26.9, 24.200003);
((GeneralPath)shape).curveTo(23.3, 24.200003, 20.4, 27.100002, 20.4, 30.700003);
((GeneralPath)shape).lineTo(20.4, 59.800003);
((GeneralPath)shape).lineTo(14.0, 59.800003);
((GeneralPath)shape).curveTo(14.0, 63.4, 16.9, 66.3, 20.5, 66.3);
((GeneralPath)shape).lineTo(46.3, 66.3);
((GeneralPath)shape).curveTo(49.899998, 66.3, 52.8, 63.4, 52.8, 59.800003);
((GeneralPath)shape).lineTo(52.8, 33.9);
((GeneralPath)shape).lineTo(59.3, 33.9);
((GeneralPath)shape).lineTo(59.3, 30.7);
((GeneralPath)shape).curveTo(59.2, 27.1, 56.399998, 24.2, 52.8, 24.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.600002, 59.200005);
((GeneralPath)shape).curveTo(49.600002, 61.300003, 47.9, 63.000004, 45.800003, 63.000004);
((GeneralPath)shape).lineTo(22.1, 63.000004);
((GeneralPath)shape).curveTo(23.7, 61.900005, 23.7, 59.800003, 23.7, 59.800003);
((GeneralPath)shape).lineTo(23.7, 30.7);
((GeneralPath)shape).curveTo(23.7, 28.900002, 25.1, 27.5, 26.900002, 27.5);
((GeneralPath)shape).curveTo(28.7, 27.5, 30.100002, 28.9, 30.100002, 30.7);
((GeneralPath)shape).lineTo(30.100002, 33.9);
((GeneralPath)shape).lineTo(49.5, 33.9);
((GeneralPath)shape).lineTo(49.5, 59.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.4, 30.7);
((GeneralPath)shape).lineTo(33.4, 27.5);
((GeneralPath)shape).lineTo(52.800003, 27.5);
((GeneralPath)shape).curveTo(55.700005, 27.5, 56.000004, 29.3, 56.000004, 30.7);
((GeneralPath)shape).lineTo(33.4, 30.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.3, 91.9);
((GeneralPath)shape).lineTo(12.3, 88.8);
((GeneralPath)shape).lineTo(21.3, 77.700005);
((GeneralPath)shape).lineTo(13.299999, 77.700005);
((GeneralPath)shape).lineTo(13.299999, 74.8);
((GeneralPath)shape).lineTo(25.9, 74.8);
((GeneralPath)shape).lineTo(25.9, 77.5);
((GeneralPath)shape).lineTo(16.4, 89.0);
((GeneralPath)shape).lineTo(26.2, 89.0);
((GeneralPath)shape).lineTo(26.2, 91.9);
((GeneralPath)shape).lineTo(12.3, 91.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.5, 86.3);
((GeneralPath)shape).lineTo(30.9, 86.0);
((GeneralPath)shape).curveTo(31.1, 87.1, 31.5, 88.0, 32.1, 88.5);
((GeneralPath)shape).curveTo(32.699997, 89.0, 33.6, 89.3, 34.6, 89.3);
((GeneralPath)shape).curveTo(35.699997, 89.3, 36.6, 89.100006, 37.1, 88.600006);
((GeneralPath)shape).curveTo(37.6, 88.100006, 37.899998, 87.600006, 37.899998, 86.90001);
((GeneralPath)shape).curveTo(37.899998, 86.50001, 37.8, 86.100006, 37.499996, 85.90001);
((GeneralPath)shape).curveTo(37.199993, 85.70001, 36.799995, 85.40001, 36.299995, 85.20001);
((GeneralPath)shape).curveTo(35.899994, 85.10001, 34.999996, 84.80001, 33.499996, 84.40001);
((GeneralPath)shape).curveTo(31.599997, 83.90001, 30.299995, 83.40001, 29.599997, 82.70001);
((GeneralPath)shape).curveTo(28.499996, 81.80001, 27.999996, 80.60001, 27.999996, 79.20001);
((GeneralPath)shape).curveTo(27.999996, 78.30001, 28.199997, 77.500015, 28.699997, 76.70001);
((GeneralPath)shape).curveTo(29.199997, 75.90001, 29.899998, 75.40001, 30.799997, 75.000015);
((GeneralPath)shape).curveTo(31.699997, 74.60002, 32.899998, 74.40002, 34.199997, 74.40002);
((GeneralPath)shape).curveTo(36.399998, 74.40002, 37.999996, 74.90002, 39.1, 75.80002);
((GeneralPath)shape).curveTo(40.2, 76.70002, 40.8, 78.000015, 40.8, 79.60002);
((GeneralPath)shape).lineTo(37.3, 79.80002);
((GeneralPath)shape).curveTo(37.2, 78.90002, 36.8, 78.30002, 36.3, 77.90002);
((GeneralPath)shape).curveTo(35.8, 77.500015, 35.1, 77.30002, 34.1, 77.30002);
((GeneralPath)shape).curveTo(33.1, 77.30002, 32.3, 77.500015, 31.699999, 77.90002);
((GeneralPath)shape).curveTo(31.3, 78.20002, 31.099998, 78.500015, 31.099998, 79.000015);
((GeneralPath)shape).curveTo(31.099998, 79.40002, 31.3, 79.80002, 31.599998, 80.000015);
((GeneralPath)shape).curveTo(31.999998, 80.40002, 33.1, 80.80002, 34.8, 81.10001);
((GeneralPath)shape).curveTo(36.5, 81.40001, 37.7, 81.90002, 38.5, 82.30001);
((GeneralPath)shape).curveTo(39.3, 82.700005, 39.9, 83.30001, 40.4, 84.00001);
((GeneralPath)shape).curveTo(40.9, 84.700005, 41.100002, 85.700005, 41.100002, 86.700005);
((GeneralPath)shape).curveTo(41.100002, 87.700005, 40.800003, 88.600006, 40.300003, 89.50001);
((GeneralPath)shape).curveTo(39.800003, 90.40001, 39.0, 91.0, 38.0, 91.4);
((GeneralPath)shape).curveTo(37.0, 91.8, 35.8, 92.0, 34.3, 92.0);
((GeneralPath)shape).curveTo(32.1, 92.0, 30.5, 91.5, 29.3, 90.5);
((GeneralPath)shape).curveTo(28.099998, 89.5, 27.8, 88.2, 27.5, 86.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(44.4, 91.9);
((GeneralPath)shape).lineTo(44.4, 74.7);
((GeneralPath)shape).lineTo(47.9, 74.7);
((GeneralPath)shape).lineTo(47.9, 81.5);
((GeneralPath)shape).lineTo(54.7, 81.5);
((GeneralPath)shape).lineTo(54.7, 74.7);
((GeneralPath)shape).lineTo(58.2, 74.7);
((GeneralPath)shape).lineTo(58.2, 91.899994);
((GeneralPath)shape).lineTo(54.7, 91.899994);
((GeneralPath)shape).lineTo(54.7, 84.399994);
((GeneralPath)shape).lineTo(47.9, 84.399994);
((GeneralPath)shape).lineTo(47.9, 91.899994);
((GeneralPath)shape).lineTo(44.4, 91.899994);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.12999999523162842;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 0.7400000095367432;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_zsh() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

    @Override
	public int getIconHeight() {
		return height;
	}

    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.translate(x, y);

        double coef1 = (double) this.width / getOrigWidth();
        double coef2 = (double) this.height / getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        Graphics2D g2ForInner = (Graphics2D) g2d.create();
        innerPaint(g2ForInner);
        g2ForInner.dispose();
        g2d.dispose();
	}
    
    /**
     * Returns a new instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new instance of this icon with specified dimensions.
     */
    public static ResizableIcon of(int width, int height) {
       ext_zsh base = new ext_zsh();
       base.width = width;
       base.height = height;
       return base;
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_zsh base = new ext_zsh();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_zsh::new;
    }
}

