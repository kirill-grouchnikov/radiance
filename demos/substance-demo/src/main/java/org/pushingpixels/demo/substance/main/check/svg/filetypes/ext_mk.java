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
public class ext_mk implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.108001708984375, 3.003000020980835), new Point2D.Double(36.108001708984375, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
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
((GeneralPath)shape).moveTo(38.7, 45.4);
((GeneralPath)shape).lineTo(41.9, 46.300003);
((GeneralPath)shape).lineTo(43.800003, 39.300003);
((GeneralPath)shape).lineTo(40.600002, 38.4);
((GeneralPath)shape).curveTo(40.600002, 37.300003, 40.500004, 36.100002, 40.2, 35.0);
((GeneralPath)shape).lineTo(43.100002, 33.3);
((GeneralPath)shape).lineTo(39.4, 27.0);
((GeneralPath)shape).lineTo(36.5, 28.7);
((GeneralPath)shape).curveTo(35.7, 27.900002, 34.8, 27.2, 33.8, 26.6);
((GeneralPath)shape).lineTo(34.7, 23.4);
((GeneralPath)shape).lineTo(27.7, 21.5);
((GeneralPath)shape).lineTo(26.800001, 24.7);
((GeneralPath)shape).curveTo(25.7, 24.7, 24.500002, 24.800001, 23.400002, 25.1);
((GeneralPath)shape).lineTo(21.7, 22.2);
((GeneralPath)shape).lineTo(15.400001, 25.800001);
((GeneralPath)shape).lineTo(17.1, 28.7);
((GeneralPath)shape).curveTo(16.300001, 29.5, 15.6, 30.400002, 15.0, 31.400002);
((GeneralPath)shape).lineTo(11.8, 30.500002);
((GeneralPath)shape).lineTo(9.900001, 37.5);
((GeneralPath)shape).lineTo(13.1, 38.4);
((GeneralPath)shape).curveTo(13.1, 39.5, 13.200001, 40.7, 13.5, 41.800003);
((GeneralPath)shape).lineTo(10.6, 43.500004);
((GeneralPath)shape).lineTo(14.200001, 49.800003);
((GeneralPath)shape).lineTo(17.1, 48.100002);
((GeneralPath)shape).curveTo(17.9, 48.9, 18.800001, 49.600002, 19.800001, 50.2);
((GeneralPath)shape).lineTo(18.900002, 53.4);
((GeneralPath)shape).lineTo(25.900002, 55.300003);
((GeneralPath)shape).lineTo(26.800001, 52.100002);
((GeneralPath)shape).curveTo(27.900002, 52.100002, 29.1, 51.9, 30.2, 51.7);
((GeneralPath)shape).lineTo(31.900002, 54.600002);
((GeneralPath)shape).lineTo(38.2, 51.000004);
((GeneralPath)shape).lineTo(36.5, 48.100002);
((GeneralPath)shape).curveTo(37.4, 47.300003, 38.1, 46.4, 38.7, 45.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.300001, 41.7);
((GeneralPath)shape).curveTo(19.500002, 38.600002, 20.6, 34.600002, 23.7, 32.9);
((GeneralPath)shape).curveTo(26.800001, 31.100002, 30.800001, 32.2, 32.5, 35.300003);
((GeneralPath)shape).curveTo(34.3, 38.4, 33.2, 42.4, 30.1, 44.100002);
((GeneralPath)shape).curveTo(27.0, 45.800003, 23.0, 44.800003, 21.3, 41.7);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(26.861000061035156, 55.39099884033203), new Point2D.Double(26.861000061035156, 21.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(55.4, 64.0);
((GeneralPath)shape).lineTo(59.5, 61.6);
((GeneralPath)shape).lineTo(58.4, 59.699997);
((GeneralPath)shape).curveTo(58.9, 59.199997, 59.4, 58.6, 59.800003, 57.899998);
((GeneralPath)shape).lineTo(61.9, 58.499996);
((GeneralPath)shape).lineTo(63.100002, 53.899998);
((GeneralPath)shape).lineTo(61.000004, 53.399998);
((GeneralPath)shape).curveTo(61.000004, 52.699997, 60.900005, 51.899998, 60.700005, 51.199997);
((GeneralPath)shape).lineTo(62.600006, 50.1);
((GeneralPath)shape).lineTo(60.200005, 46.0);
((GeneralPath)shape).lineTo(58.300003, 47.0);
((GeneralPath)shape).curveTo(57.800003, 46.5, 57.200005, 46.0, 56.500004, 45.6);
((GeneralPath)shape).lineTo(57.100002, 43.5);
((GeneralPath)shape).lineTo(52.500004, 42.3);
((GeneralPath)shape).lineTo(51.900005, 44.399998);
((GeneralPath)shape).curveTo(51.200005, 44.399998, 50.400005, 44.499996, 49.700005, 44.699997);
((GeneralPath)shape).lineTo(48.600006, 42.799995);
((GeneralPath)shape).lineTo(44.500008, 45.199997);
((GeneralPath)shape).lineTo(45.600006, 47.1);
((GeneralPath)shape).curveTo(45.100006, 47.6, 44.600006, 48.199997, 44.200005, 48.899998);
((GeneralPath)shape).lineTo(42.100006, 48.3);
((GeneralPath)shape).lineTo(40.900005, 52.899998);
((GeneralPath)shape).lineTo(43.000004, 53.499996);
((GeneralPath)shape).curveTo(43.000004, 54.199997, 43.100002, 54.999996, 43.300003, 55.699997);
((GeneralPath)shape).lineTo(41.4, 56.799995);
((GeneralPath)shape).lineTo(43.800003, 60.899994);
((GeneralPath)shape).lineTo(45.700005, 59.799995);
((GeneralPath)shape).curveTo(46.200005, 60.299995, 46.800003, 60.799995, 47.500004, 61.199997);
((GeneralPath)shape).lineTo(46.900005, 63.299995);
((GeneralPath)shape).lineTo(51.500004, 64.49999);
((GeneralPath)shape).lineTo(52.100002, 62.399994);
((GeneralPath)shape).curveTo(52.800003, 62.399994, 53.600002, 62.299995, 54.300003, 62.099995);
((GeneralPath)shape).lineTo(55.4, 63.999996);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.300003, 55.5);
((GeneralPath)shape).curveTo(47.100002, 53.5, 47.800003, 50.9, 49.9, 49.7);
((GeneralPath)shape).curveTo(51.9, 48.5, 54.5, 49.2, 55.7, 51.2);
((GeneralPath)shape).curveTo(56.9, 53.2, 56.2, 55.8, 54.2, 57.0);
((GeneralPath)shape).curveTo(52.100002, 58.2, 49.5, 57.6, 48.3, 55.5);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(52.00199890136719, 64.5), new Point2D.Double(52.00199890136719, 42.33599853515625), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.3, 91.1);
((GeneralPath)shape).lineTo(16.3, 71.2);
((GeneralPath)shape).lineTo(22.3, 71.2);
((GeneralPath)shape).lineTo(25.9, 84.7);
((GeneralPath)shape).lineTo(29.5, 71.2);
((GeneralPath)shape).lineTo(35.5, 71.2);
((GeneralPath)shape).lineTo(35.5, 91.0);
((GeneralPath)shape).lineTo(31.8, 91.0);
((GeneralPath)shape).lineTo(31.8, 75.4);
((GeneralPath)shape).lineTo(27.8, 91.0);
((GeneralPath)shape).lineTo(24.0, 91.0);
((GeneralPath)shape).lineTo(20.0, 75.4);
((GeneralPath)shape).lineTo(20.0, 91.0);
((GeneralPath)shape).lineTo(16.3, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(39.6, 91.1);
((GeneralPath)shape).lineTo(39.6, 71.2);
((GeneralPath)shape).lineTo(43.6, 71.2);
((GeneralPath)shape).lineTo(43.6, 80.0);
((GeneralPath)shape).lineTo(51.699997, 71.2);
((GeneralPath)shape).lineTo(57.1, 71.2);
((GeneralPath)shape).lineTo(49.7, 79.0);
((GeneralPath)shape).lineTo(57.600002, 91.1);
((GeneralPath)shape).lineTo(52.4, 91.1);
((GeneralPath)shape).lineTo(46.9, 81.799995);
((GeneralPath)shape).lineTo(43.600002, 85.1);
((GeneralPath)shape).lineTo(43.600002, 91.1);
((GeneralPath)shape).lineTo(39.600002, 91.1);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
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
        return 0.13199996948242188;
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
		return 0.7380000352859497;
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
	private ext_mk() {
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
       ext_mk base = new ext_mk();
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
       ext_mk base = new ext_mk();
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
        return ext_mk::new;
    }
}

