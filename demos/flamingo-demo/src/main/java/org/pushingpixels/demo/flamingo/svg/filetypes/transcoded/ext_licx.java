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
public class ext_licx implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.265000104904175), new Point2D.Double(36.0, 100.25), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
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
((GeneralPath)shape).moveTo(12.6, 89.8);
((GeneralPath)shape).lineTo(12.6, 74.2);
((GeneralPath)shape).lineTo(15.8, 74.2);
((GeneralPath)shape).lineTo(15.8, 87.2);
((GeneralPath)shape).lineTo(23.8, 87.2);
((GeneralPath)shape).lineTo(23.8, 89.899994);
((GeneralPath)shape).lineTo(12.6, 89.899994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.0, 89.8);
((GeneralPath)shape).lineTo(26.0, 74.1);
((GeneralPath)shape).lineTo(29.2, 74.1);
((GeneralPath)shape).lineTo(29.2, 89.799995);
((GeneralPath)shape).lineTo(26.0, 89.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.5, 84.0);
((GeneralPath)shape).lineTo(45.6, 85.0);
((GeneralPath)shape).curveTo(45.1, 86.7, 44.3, 88.0, 43.199997, 88.8);
((GeneralPath)shape).curveTo(42.1, 89.600006, 40.699997, 90.100006, 38.999996, 90.100006);
((GeneralPath)shape).curveTo(36.899998, 90.100006, 35.199997, 89.40001, 33.799995, 88.00001);
((GeneralPath)shape).curveTo(32.399994, 86.600006, 31.799995, 84.600006, 31.799995, 82.100006);
((GeneralPath)shape).curveTo(31.799995, 79.50001, 32.499996, 77.40001, 33.899994, 76.00001);
((GeneralPath)shape).curveTo(35.299995, 74.600006, 37.099995, 73.80001, 39.299995, 73.80001);
((GeneralPath)shape).curveTo(41.199997, 73.80001, 42.799995, 74.40001, 43.999996, 75.50001);
((GeneralPath)shape).curveTo(44.699997, 76.200005, 45.299995, 77.100006, 45.599995, 78.40001);
((GeneralPath)shape).lineTo(42.399994, 79.20001);
((GeneralPath)shape).curveTo(42.199993, 78.40001, 41.799995, 77.70001, 41.199993, 77.30001);
((GeneralPath)shape).curveTo(40.599995, 76.80001, 39.899994, 76.60001, 38.999992, 76.60001);
((GeneralPath)shape).curveTo(37.79999, 76.60001, 36.899994, 77.000015, 36.09999, 77.90002);
((GeneralPath)shape).curveTo(35.299988, 78.80002, 35.0, 80.0, 35.0, 81.8);
((GeneralPath)shape).curveTo(35.0, 83.8, 35.4, 85.200005, 36.1, 86.100006);
((GeneralPath)shape).curveTo(36.799995, 87.00001, 37.8, 87.40001, 38.899998, 87.40001);
((GeneralPath)shape).curveTo(39.8, 87.40001, 40.499996, 87.100006, 41.1, 86.600006);
((GeneralPath)shape).curveTo(41.7, 86.100006, 42.199997, 85.200005, 42.5, 84.00001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.7, 89.8);
((GeneralPath)shape).lineTo(52.100002, 81.600006);
((GeneralPath)shape).lineTo(47.2, 74.100006);
((GeneralPath)shape).lineTo(51.0, 74.100006);
((GeneralPath)shape).lineTo(54.2, 79.200005);
((GeneralPath)shape).lineTo(57.3, 74.100006);
((GeneralPath)shape).lineTo(61.0, 74.100006);
((GeneralPath)shape).lineTo(56.1, 81.700005);
((GeneralPath)shape).lineTo(61.5, 89.8);
((GeneralPath)shape).lineTo(57.6, 89.8);
((GeneralPath)shape).lineTo(54.1, 84.4);
((GeneralPath)shape).lineTo(50.6, 89.8);
((GeneralPath)shape).lineTo(46.699997, 89.8);
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
((GeneralPath)shape).moveTo(28.2, 44.6);
((GeneralPath)shape).curveTo(26.800001, 45.6, 25.5, 46.699997, 24.2, 47.699997);
((GeneralPath)shape).curveTo(21.5, 49.699997, 18.900002, 51.799995, 16.2, 53.799995);
((GeneralPath)shape).curveTo(15.800001, 54.099995, 15.6, 54.099995, 15.200001, 53.899994);
((GeneralPath)shape).curveTo(14.700001, 53.599995, 14.1, 53.299995, 13.500001, 52.999992);
((GeneralPath)shape).curveTo(13.200001, 52.79999, 13.100001, 52.59999, 13.100001, 52.29999);
((GeneralPath)shape).lineTo(13.100001, 31.1);
((GeneralPath)shape).curveTo(13.100001, 30.9, 13.300001, 30.5, 13.500001, 30.4);
((GeneralPath)shape).curveTo(14.100001, 30.0, 14.800001, 29.699999, 15.400001, 29.4);
((GeneralPath)shape).curveTo(15.700001, 29.199999, 16.0, 29.4, 16.300001, 29.6);
((GeneralPath)shape).curveTo(18.500002, 31.300001, 20.7, 33.0, 22.900002, 34.6);
((GeneralPath)shape).curveTo(24.7, 36.0, 26.500002, 37.399998, 28.300001, 38.699997);
((GeneralPath)shape).curveTo(28.400002, 38.6, 28.6, 38.499996, 28.7, 38.399998);
((GeneralPath)shape).curveTo(35.3, 31.999998, 41.9, 25.599998, 48.4, 19.199997);
((GeneralPath)shape).curveTo(48.7, 18.899998, 49.0, 18.799997, 49.4, 18.999996);
((GeneralPath)shape).curveTo(52.2, 20.099997, 55.0, 21.199997, 57.800003, 22.399996);
((GeneralPath)shape).curveTo(58.000004, 22.499996, 58.200005, 22.799995, 58.300003, 22.999996);
((GeneralPath)shape).curveTo(58.4, 23.099997, 58.300003, 23.299995, 58.300003, 23.499996);
((GeneralPath)shape).lineTo(58.300003, 60.0);
((GeneralPath)shape).curveTo(58.300003, 60.9, 58.300003, 60.9, 57.4, 61.2);
((GeneralPath)shape).curveTo(54.7, 62.3, 52.100002, 63.3, 49.5, 64.4);
((GeneralPath)shape).curveTo(49.0, 64.6, 48.7, 64.5, 48.4, 64.200005);
((GeneralPath)shape).curveTo(41.9, 57.800003, 35.4, 51.500004, 28.800001, 45.200005);
((GeneralPath)shape).lineTo(28.2, 44.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.2, 50.399998);
((GeneralPath)shape).lineTo(47.2, 33.0);
((GeneralPath)shape).curveTo(43.3, 35.9, 39.5, 38.8, 35.6, 41.7);
((GeneralPath)shape).curveTo(39.5, 44.600002, 43.3, 47.5, 47.199997, 50.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(22.900002, 41.699997);
((GeneralPath)shape).curveTo(21.000002, 39.999996, 19.100002, 38.299995, 17.100002, 36.499996);
((GeneralPath)shape).lineTo(17.100002, 46.899994);
((GeneralPath)shape).curveTo(19.000002, 45.199993, 20.900002, 43.399994, 22.900002, 41.699993);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.61899948120117, 64.5), new Point2D.Double(35.61899948120117, 18.9060001373291), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 73.45700073242188), new Point2D.Double(58.569000244140625, 86.95700073242188), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
		return 0.9980000257492065;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_licx() {
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
       ext_licx base = new ext_licx();
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
       ext_licx base = new ext_licx();
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
        return ext_licx::new;
    }
}

