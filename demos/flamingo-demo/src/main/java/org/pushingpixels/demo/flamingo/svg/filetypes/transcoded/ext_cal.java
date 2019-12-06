package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_cal implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 98.899994);
((GeneralPath)shape).lineTo(-0.19999695, 98.899994);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.75, 3.0959999561309814), new Point2D.Double(35.75, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 98.899994);
((GeneralPath)shape).lineTo(-0.19999695, 98.899994);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 98.899994);
((GeneralPath)shape).lineTo(-0.19999695, 98.899994);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
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
((GeneralPath)shape).moveTo(0.7, 63.6);
((GeneralPath)shape).lineTo(70.899994, 63.6);
((GeneralPath)shape).lineTo(70.899994, 97.899994);
((GeneralPath)shape).lineTo(0.7, 97.899994);
((GeneralPath)shape).lineTo(0.7, 63.6);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.849998474121094, 4.085000038146973), new Point2D.Double(35.849998474121094, 38.441001892089844), new float[] {0.0f,1.0f}, new Color[] {new Color(239, 65, 54, 255),new Color(190, 30, 45, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(21.8, 82.8);
((GeneralPath)shape).lineTo(25.699999, 84.0);
((GeneralPath)shape).curveTo(25.099998, 86.2, 24.099998, 87.8, 22.699999, 88.8);
((GeneralPath)shape).curveTo(21.3, 89.9, 19.499998, 90.4, 17.399998, 90.4);
((GeneralPath)shape).curveTo(14.699998, 90.4, 12.5999975, 89.5, 10.799997, 87.700005);
((GeneralPath)shape).curveTo(9.0999975, 85.9, 8.199997, 83.4, 8.199997, 80.3);
((GeneralPath)shape).curveTo(8.199997, 77.0, 9.099997, 74.4, 10.799997, 72.600006);
((GeneralPath)shape).curveTo(12.499998, 70.80001, 14.799997, 69.90001, 17.599998, 69.90001);
((GeneralPath)shape).curveTo(20.099998, 69.90001, 21.999998, 70.600006, 23.599998, 72.00001);
((GeneralPath)shape).curveTo(24.499998, 72.80001, 25.199999, 74.100006, 25.699999, 75.700005);
((GeneralPath)shape).lineTo(21.699999, 76.600006);
((GeneralPath)shape).curveTo(21.499998, 75.600006, 20.999998, 74.8, 20.199999, 74.200005);
((GeneralPath)shape).curveTo(19.4, 73.600006, 18.499998, 73.3, 17.499998, 73.3);
((GeneralPath)shape).curveTo(15.999998, 73.3, 14.799998, 73.8, 13.899998, 74.9);
((GeneralPath)shape).curveTo(12.999998, 76.0, 12.499998, 77.700005, 12.499998, 80.0);
((GeneralPath)shape).curveTo(12.499998, 82.5, 12.999998, 84.3, 13.899998, 85.4);
((GeneralPath)shape).curveTo(14.799997, 86.5, 15.999998, 87.0, 17.499998, 87.0);
((GeneralPath)shape).curveTo(18.599998, 87.0, 19.499998, 86.7, 20.299997, 86.0);
((GeneralPath)shape).curveTo(20.899998, 85.3, 21.499998, 84.2, 21.799997, 82.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.3, 90.100006);
((GeneralPath)shape).lineTo(42.899998, 90.100006);
((GeneralPath)shape).lineTo(41.1, 85.600006);
((GeneralPath)shape).lineTo(33.1, 85.600006);
((GeneralPath)shape).lineTo(31.399998, 90.100006);
((GeneralPath)shape).lineTo(27.099998, 90.100006);
((GeneralPath)shape).lineTo(35.0, 70.3);
((GeneralPath)shape).lineTo(39.3, 70.3);
((GeneralPath)shape).lineTo(47.3, 90.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(39.8, 82.200005);
((GeneralPath)shape).lineTo(37.0, 74.8);
((GeneralPath)shape).lineTo(34.3, 82.200005);
((GeneralPath)shape).lineTo(39.8, 82.200005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.6, 90.100006);
((GeneralPath)shape).lineTo(49.6, 70.4);
((GeneralPath)shape).lineTo(53.6, 70.4);
((GeneralPath)shape).lineTo(53.6, 86.7);
((GeneralPath)shape).lineTo(63.699997, 86.7);
((GeneralPath)shape).lineTo(63.699997, 90.0);
((GeneralPath)shape).lineTo(49.6, 90.0);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.2, 54.4);
((GeneralPath)shape).lineTo(18.2, 48.2);
((GeneralPath)shape).lineTo(25.400002, 48.2);
((GeneralPath)shape).lineTo(25.400002, 54.4);
((GeneralPath)shape).lineTo(18.2, 54.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 54.4);
((GeneralPath)shape).lineTo(27.0, 48.2);
((GeneralPath)shape).lineTo(35.0, 48.2);
((GeneralPath)shape).lineTo(35.0, 54.4);
((GeneralPath)shape).lineTo(27.0, 54.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.2, 46.800003);
((GeneralPath)shape).lineTo(18.2, 39.9);
((GeneralPath)shape).lineTo(25.400002, 39.9);
((GeneralPath)shape).lineTo(25.400002, 46.800003);
((GeneralPath)shape).lineTo(18.2, 46.800003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 46.800003);
((GeneralPath)shape).lineTo(27.0, 39.9);
((GeneralPath)shape).lineTo(35.0, 39.9);
((GeneralPath)shape).lineTo(35.0, 46.800003);
((GeneralPath)shape).lineTo(27.0, 46.800003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.2, 38.500004);
((GeneralPath)shape).lineTo(18.2, 32.300003);
((GeneralPath)shape).lineTo(25.400002, 32.300003);
((GeneralPath)shape).lineTo(25.400002, 38.500004);
((GeneralPath)shape).lineTo(18.2, 38.500004);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.6, 54.4);
((GeneralPath)shape).lineTo(36.6, 48.2);
((GeneralPath)shape).lineTo(44.6, 48.2);
((GeneralPath)shape).lineTo(44.6, 54.4);
((GeneralPath)shape).lineTo(36.6, 54.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 38.5);
((GeneralPath)shape).lineTo(27.0, 32.3);
((GeneralPath)shape).lineTo(35.0, 32.3);
((GeneralPath)shape).lineTo(35.0, 38.5);
((GeneralPath)shape).lineTo(27.0, 38.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.2, 54.4);
((GeneralPath)shape).lineTo(46.2, 48.2);
((GeneralPath)shape).lineTo(53.4, 48.2);
((GeneralPath)shape).lineTo(53.4, 54.4);
((GeneralPath)shape).lineTo(46.2, 54.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.6, 46.800003);
((GeneralPath)shape).lineTo(36.6, 39.9);
((GeneralPath)shape).lineTo(44.6, 39.9);
((GeneralPath)shape).lineTo(44.6, 46.800003);
((GeneralPath)shape).lineTo(36.6, 46.800003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.8, 28.100002);
((GeneralPath)shape).curveTo(27.8, 28.500002, 27.4, 28.800003, 27.0, 28.800003);
((GeneralPath)shape).lineTo(25.4, 28.800003);
((GeneralPath)shape).curveTo(25.0, 28.800003, 24.6, 28.500004, 24.6, 28.100002);
((GeneralPath)shape).lineTo(24.6, 21.900002);
((GeneralPath)shape).curveTo(24.6, 21.500002, 25.0, 21.2, 25.4, 21.2);
((GeneralPath)shape).lineTo(27.0, 21.2);
((GeneralPath)shape).curveTo(27.4, 21.2, 27.8, 21.5, 27.8, 21.900002);
((GeneralPath)shape).lineTo(27.8, 28.100002);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.199997, 46.800003);
((GeneralPath)shape).lineTo(46.199997, 39.9);
((GeneralPath)shape).lineTo(53.399998, 39.9);
((GeneralPath)shape).lineTo(53.399998, 46.800003);
((GeneralPath)shape).lineTo(46.199997, 46.800003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.6, 38.500004);
((GeneralPath)shape).lineTo(36.6, 32.300003);
((GeneralPath)shape).lineTo(44.6, 32.300003);
((GeneralPath)shape).lineTo(44.6, 38.500004);
((GeneralPath)shape).lineTo(36.6, 38.500004);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.199997, 38.500004);
((GeneralPath)shape).lineTo(46.199997, 32.300003);
((GeneralPath)shape).lineTo(53.399998, 32.300003);
((GeneralPath)shape).lineTo(53.399998, 38.500004);
((GeneralPath)shape).lineTo(46.199997, 38.500004);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.999996, 28.100004);
((GeneralPath)shape).curveTo(46.999996, 28.500004, 46.599995, 28.800005, 46.199997, 28.800005);
((GeneralPath)shape).lineTo(44.6, 28.800005);
((GeneralPath)shape).curveTo(44.199997, 28.800005, 43.8, 28.500006, 43.8, 28.100004);
((GeneralPath)shape).lineTo(43.8, 21.900005);
((GeneralPath)shape).curveTo(43.8, 21.500006, 44.2, 21.200005, 44.6, 21.200005);
((GeneralPath)shape).lineTo(46.199997, 21.200005);
((GeneralPath)shape).curveTo(46.6, 21.200005, 46.999996, 21.500004, 46.999996, 21.900005);
((GeneralPath)shape).lineTo(46.999996, 28.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(56.6, 26.700005);
((GeneralPath)shape).curveTo(56.6, 25.200005, 55.199997, 23.900005, 53.399998, 23.900005);
((GeneralPath)shape).lineTo(50.199997, 23.900005);
((GeneralPath)shape).lineTo(50.199997, 21.800005);
((GeneralPath)shape).curveTo(50.199997, 19.900005, 48.399998, 18.300005, 46.199997, 18.300005);
((GeneralPath)shape).lineTo(44.6, 18.300005);
((GeneralPath)shape).curveTo(42.399998, 18.300005, 40.6, 19.900005, 40.6, 21.800005);
((GeneralPath)shape).lineTo(40.6, 23.900005);
((GeneralPath)shape).lineTo(31.0, 23.900005);
((GeneralPath)shape).lineTo(31.0, 21.800005);
((GeneralPath)shape).curveTo(31.0, 19.900005, 29.2, 18.300005, 27.0, 18.300005);
((GeneralPath)shape).lineTo(25.4, 18.300005);
((GeneralPath)shape).curveTo(23.199999, 18.300005, 21.4, 19.900005, 21.4, 21.800005);
((GeneralPath)shape).lineTo(21.4, 23.900005);
((GeneralPath)shape).lineTo(18.199999, 23.900005);
((GeneralPath)shape).curveTo(16.499998, 23.900005, 14.999999, 25.200005, 14.999999, 26.700005);
((GeneralPath)shape).lineTo(14.999999, 54.400005);
((GeneralPath)shape).curveTo(14.999999, 55.900005, 16.4, 57.200005, 18.199999, 57.200005);
((GeneralPath)shape).lineTo(53.299995, 57.200005);
((GeneralPath)shape).curveTo(54.999996, 57.200005, 56.499996, 55.900005, 56.499996, 54.400005);
((GeneralPath)shape).lineTo(56.499996, 26.7);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(1025.800048828125, 947.9450073242188), new Point2D.Double(1025.800048828125, 986.7000122070312), new float[] {0.0f,1.0f}, new Color[] {new Color(135, 156, 168, 255),new Color(77, 106, 120, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -990.0f, 1005.1110229492188f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(44.800003, 27.7);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(44.82500076293945, 74.2239990234375), new Point2D.Double(58.32500076293945, 87.7239990234375), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(44.800003, 27.7);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(44.800003, 27.7);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_6);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.12800002098083496;
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
		return 0.9990000128746033;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_cal() {
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
       ext_cal base = new ext_cal();
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
       ext_cal base = new ext_cal();
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
        return ext_cal::new;
    }
}

