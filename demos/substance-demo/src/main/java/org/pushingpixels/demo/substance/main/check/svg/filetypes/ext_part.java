package org.pushingpixels.demo.substance.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_part implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
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
((GeneralPath)shape).moveTo(8.1, 90.1);
((GeneralPath)shape).lineTo(8.1, 74.3);
((GeneralPath)shape).lineTo(13.3, 74.3);
((GeneralPath)shape).curveTo(15.3, 74.3, 16.5, 74.4, 17.1, 74.5);
((GeneralPath)shape).curveTo(18.0, 74.7, 18.800001, 75.3, 19.4, 76.0);
((GeneralPath)shape).curveTo(20.0, 76.8, 20.3, 77.8, 20.3, 79.1);
((GeneralPath)shape).curveTo(20.3, 80.1, 20.099998, 80.9, 19.8, 81.5);
((GeneralPath)shape).curveTo(19.4, 82.2, 19.0, 82.7, 18.4, 83.1);
((GeneralPath)shape).curveTo(17.9, 83.5, 17.3, 83.7, 16.699999, 83.799995);
((GeneralPath)shape).curveTo(15.899999, 83.99999, 14.799999, 83.99999, 13.399999, 83.99999);
((GeneralPath)shape).lineTo(11.299999, 83.99999);
((GeneralPath)shape).lineTo(11.299999, 89.899994);
((GeneralPath)shape).lineTo(8.1, 89.899994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(11.3, 77.0);
((GeneralPath)shape).lineTo(11.3, 81.5);
((GeneralPath)shape).lineTo(13.1, 81.5);
((GeneralPath)shape).curveTo(14.400001, 81.5, 15.200001, 81.4, 15.6, 81.3);
((GeneralPath)shape).curveTo(16.0, 81.200005, 16.4, 80.9, 16.6, 80.5);
((GeneralPath)shape).curveTo(16.800001, 80.1, 17.0, 79.7, 17.0, 79.3);
((GeneralPath)shape).curveTo(17.0, 78.700005, 16.8, 78.3, 16.5, 77.9);
((GeneralPath)shape).curveTo(16.2, 77.5, 15.7, 77.3, 15.2, 77.200005);
((GeneralPath)shape).curveTo(14.8, 77.00001, 14.0, 77.00001, 12.9, 77.00001);
((GeneralPath)shape).lineTo(11.299999, 77.00001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.7, 90.1);
((GeneralPath)shape).lineTo(32.2, 90.1);
((GeneralPath)shape).lineTo(30.800001, 86.5);
((GeneralPath)shape).lineTo(24.400002, 86.5);
((GeneralPath)shape).lineTo(23.100002, 90.1);
((GeneralPath)shape).lineTo(19.700003, 90.1);
((GeneralPath)shape).lineTo(25.900002, 74.4);
((GeneralPath)shape).lineTo(29.300001, 74.4);
((GeneralPath)shape).lineTo(35.7, 90.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.800001, 83.799995);
((GeneralPath)shape).lineTo(27.6, 78.0);
((GeneralPath)shape).lineTo(25.4, 83.8);
((GeneralPath)shape).lineTo(29.8, 83.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.4, 90.1);
((GeneralPath)shape).lineTo(37.4, 74.3);
((GeneralPath)shape).lineTo(44.2, 74.3);
((GeneralPath)shape).curveTo(45.9, 74.3, 47.100002, 74.4, 47.9, 74.700005);
((GeneralPath)shape).curveTo(48.7, 75.00001, 49.300003, 75.50001, 49.800003, 76.200005);
((GeneralPath)shape).curveTo(50.300003, 76.9, 50.500004, 77.8, 50.500004, 78.700005);
((GeneralPath)shape).curveTo(50.500004, 79.9, 50.100002, 80.9, 49.400005, 81.600006);
((GeneralPath)shape).curveTo(48.700005, 82.40001, 47.600006, 82.90001, 46.200005, 83.100006);
((GeneralPath)shape).curveTo(46.900005, 83.50001, 47.500004, 83.90001, 47.900005, 84.40001);
((GeneralPath)shape).curveTo(48.400005, 84.90001, 49.000004, 85.70001, 49.700005, 87.00001);
((GeneralPath)shape).lineTo(51.600006, 90.100006);
((GeneralPath)shape).lineTo(47.700005, 90.100006);
((GeneralPath)shape).lineTo(45.400005, 86.700005);
((GeneralPath)shape).curveTo(44.600006, 85.50001, 44.000004, 84.700005, 43.700005, 84.4);
((GeneralPath)shape).curveTo(43.400005, 84.1, 43.100006, 83.9, 42.700005, 83.700005);
((GeneralPath)shape).curveTo(42.400005, 83.600006, 41.800003, 83.50001, 41.100006, 83.50001);
((GeneralPath)shape).lineTo(40.400005, 83.50001);
((GeneralPath)shape).lineTo(40.400005, 90.100006);
((GeneralPath)shape).lineTo(37.400005, 90.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(40.7, 81.0);
((GeneralPath)shape).lineTo(43.0, 81.0);
((GeneralPath)shape).curveTo(44.5, 81.0, 45.5, 80.9, 45.9, 80.8);
((GeneralPath)shape).curveTo(46.300003, 80.700005, 46.600002, 80.4, 46.800003, 80.100006);
((GeneralPath)shape).curveTo(47.000004, 79.80001, 47.100002, 79.40001, 47.100002, 78.90001);
((GeneralPath)shape).curveTo(47.100002, 78.40001, 47.000004, 77.90001, 46.7, 77.600006);
((GeneralPath)shape).curveTo(46.4, 77.3, 46.0, 77.100006, 45.5, 77.00001);
((GeneralPath)shape).curveTo(45.2, 77.00001, 44.5, 76.90001, 43.1, 76.90001);
((GeneralPath)shape).lineTo(40.6, 76.90001);
((GeneralPath)shape).lineTo(40.6, 81.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(57.1, 90.1);
((GeneralPath)shape).lineTo(57.1, 77.0);
((GeneralPath)shape).lineTo(52.399998, 77.0);
((GeneralPath)shape).lineTo(52.399998, 74.3);
((GeneralPath)shape).lineTo(65.1, 74.3);
((GeneralPath)shape).lineTo(65.1, 77.0);
((GeneralPath)shape).lineTo(60.399998, 77.0);
((GeneralPath)shape).lineTo(60.399998, 90.1);
((GeneralPath)shape).lineTo(57.1, 90.1);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.8, 32.0);
((GeneralPath)shape).curveTo(31.699999, 32.1, 31.699999, 32.1, 31.8, 32.0);
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(56.2, 43.4);
((GeneralPath)shape).curveTo(55.7, 43.2, 55.3, 43.2, 54.8, 43.2);
((GeneralPath)shape).curveTo(53.6, 43.3, 52.5, 43.9, 51.3, 44.0);
((GeneralPath)shape).curveTo(50.5, 44.1, 49.8, 43.5, 49.7, 42.6);
((GeneralPath)shape).curveTo(49.5, 39.899998, 49.600002, 37.199997, 49.8, 34.5);
((GeneralPath)shape).curveTo(49.8, 34.1, 49.5, 33.8, 49.2, 33.8);
((GeneralPath)shape).curveTo(46.2, 33.7, 43.2, 33.899998, 40.1, 34.6);
((GeneralPath)shape).curveTo(39.3, 34.8, 38.6, 35.399998, 38.699997, 36.199997);
((GeneralPath)shape).curveTo(38.799995, 37.899998, 39.899998, 39.6, 39.299995, 41.399998);
((GeneralPath)shape).curveTo(38.799995, 42.899998, 37.599995, 43.999996, 36.099995, 44.199997);
((GeneralPath)shape).curveTo(34.599995, 44.499996, 32.999996, 43.699997, 32.099995, 42.499996);
((GeneralPath)shape).curveTo(31.099995, 40.999996, 31.699995, 38.999996, 31.199995, 37.299995);
((GeneralPath)shape).curveTo(30.999994, 36.499996, 30.199995, 35.999996, 29.399996, 36.099995);
((GeneralPath)shape).curveTo(26.299995, 36.299995, 23.399996, 36.999996, 20.499996, 38.099995);
((GeneralPath)shape).curveTo(20.099997, 38.199993, 19.899996, 38.599995, 20.099997, 38.899994);
((GeneralPath)shape).curveTo(21.099997, 41.399994, 21.999996, 43.899994, 22.599997, 46.599995);
((GeneralPath)shape).curveTo(22.799997, 47.399994, 22.299997, 48.199993, 21.499996, 48.399994);
((GeneralPath)shape).curveTo(20.299995, 48.699993, 18.999996, 48.399994, 17.899996, 48.699993);
((GeneralPath)shape).curveTo(17.399996, 48.79999, 16.999996, 48.999992, 16.599997, 49.29999);
((GeneralPath)shape).curveTo(15.199997, 50.09999, 14.499996, 51.699993, 14.699997, 53.199993);
((GeneralPath)shape).curveTo(14.899997, 54.699993, 15.999997, 55.899994, 17.299997, 56.399994);
((GeneralPath)shape).curveTo(18.999998, 56.999992, 20.599997, 55.899994, 22.299997, 55.799995);
((GeneralPath)shape).curveTo(23.099997, 55.699997, 23.799997, 56.299995, 23.899998, 57.199997);
((GeneralPath)shape).curveTo(24.099998, 59.899998, 23.999998, 62.6, 23.799997, 65.299995);
((GeneralPath)shape).curveTo(23.799997, 65.7, 24.099997, 65.99999, 24.399998, 65.99999);
((GeneralPath)shape).curveTo(27.399998, 66.299995, 30.499998, 65.899994, 33.5, 65.19999);
((GeneralPath)shape).curveTo(34.3, 64.99999, 35.0, 64.39999, 34.9, 63.59999);
((GeneralPath)shape).curveTo(34.800003, 61.89999, 33.7, 60.09999, 34.2, 58.39999);
((GeneralPath)shape).curveTo(34.7, 56.99999, 36.100002, 55.79999, 37.5, 55.59999);
((GeneralPath)shape).curveTo(39.0, 55.39999, 40.6, 56.09999, 41.5, 57.29999);
((GeneralPath)shape).curveTo(42.6, 58.79999, 41.9, 60.89999, 42.4, 62.499992);
((GeneralPath)shape).curveTo(42.600002, 63.29999, 43.4, 63.79999, 44.2, 63.699993);
((GeneralPath)shape).curveTo(47.3, 63.499992, 50.3, 62.899994, 53.1, 61.699993);
((GeneralPath)shape).curveTo(53.5, 61.599995, 53.699997, 61.199993, 53.5, 60.899994);
((GeneralPath)shape).curveTo(52.5, 58.399994, 51.6, 55.899994, 51.0, 53.199993);
((GeneralPath)shape).curveTo(50.8, 52.399994, 51.3, 51.599995, 52.1, 51.399994);
((GeneralPath)shape).curveTo(53.8, 51.099995, 55.5, 51.599995, 57.1, 50.499992);
((GeneralPath)shape).curveTo(58.3, 49.59999, 59.0, 48.09999, 58.699997, 46.699993);
((GeneralPath)shape).curveTo(58.699997, 45.199993, 57.6, 43.899994, 56.199997, 43.399994);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.75, 66.12200164794922), new Point2D.Double(36.75, 33.891998291015625), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(169, 200, 216, 255),new Color(129, 161, 176, 255),new Color(100, 132, 147, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
        return 0.13099998235702515;
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
		return 0.7420000433921814;
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
	private ext_part() {
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
       ext_part base = new ext_part();
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
       ext_part base = new ext_part();
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
        return ext_part::new;
    }
}

