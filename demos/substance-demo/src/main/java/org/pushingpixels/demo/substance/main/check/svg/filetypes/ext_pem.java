package org.pushingpixels.demo.substance.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_pem implements ResizableIcon {
    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
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
paint = new LinearGradientPaint(new Point2D.Double(36.79999923706055, 61.5890007019043), new Point2D.Double(36.79999923706055, 20.33300018310547), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(51.4, 37.7);
((GeneralPath)shape).lineTo(48.5, 37.7);
((GeneralPath)shape).lineTo(48.5, 32.0);
((GeneralPath)shape).curveTo(48.5, 25.6, 43.3, 20.3, 36.8, 20.3);
((GeneralPath)shape).curveTo(30.3, 20.3, 25.1, 25.6, 25.1, 32.0);
((GeneralPath)shape).lineTo(25.1, 37.7);
((GeneralPath)shape).lineTo(22.2, 37.7);
((GeneralPath)shape).curveTo(21.1, 37.7, 20.2, 38.600002, 20.2, 39.7);
((GeneralPath)shape).lineTo(20.2, 59.5);
((GeneralPath)shape).curveTo(20.2, 60.6, 21.1, 61.5, 22.2, 61.5);
((GeneralPath)shape).lineTo(51.300003, 61.5);
((GeneralPath)shape).curveTo(52.4, 61.5, 53.300003, 60.6, 53.300003, 59.5);
((GeneralPath)shape).lineTo(53.300003, 39.8);
((GeneralPath)shape).curveTo(53.4, 38.6, 52.500004, 37.7, 51.4, 37.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(39.3, 54.2);
((GeneralPath)shape).curveTo(39.5, 54.9, 39.0, 55.5, 38.3, 55.5);
((GeneralPath)shape).lineTo(35.3, 55.5);
((GeneralPath)shape).curveTo(34.6, 55.5, 34.1, 54.8, 34.3, 54.2);
((GeneralPath)shape).lineTo(35.3, 50.5);
((GeneralPath)shape).curveTo(34.2, 49.9, 33.399998, 48.8, 33.399998, 47.4);
((GeneralPath)shape).curveTo(33.399998, 45.4, 34.999996, 43.9, 36.899998, 43.9);
((GeneralPath)shape).curveTo(38.8, 43.9, 40.399998, 45.5, 40.399998, 47.4);
((GeneralPath)shape).curveTo(40.399998, 48.800003, 39.6, 50.0, 38.499996, 50.5);
((GeneralPath)shape).lineTo(39.299995, 54.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.6, 37.7);
((GeneralPath)shape).lineTo(31.0, 37.7);
((GeneralPath)shape).lineTo(31.0, 32.0);
((GeneralPath)shape).curveTo(31.0, 28.8, 33.6, 26.2, 36.8, 26.2);
((GeneralPath)shape).curveTo(40.0, 26.2, 42.6, 28.800001, 42.6, 32.0);
((GeneralPath)shape).lineTo(42.6, 37.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
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
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.2, 91.9);
((GeneralPath)shape).lineTo(8.2, 71.9);
((GeneralPath)shape).lineTo(14.7, 71.9);
((GeneralPath)shape).curveTo(17.2, 71.9, 18.8, 72.0, 19.5, 72.200005);
((GeneralPath)shape).curveTo(20.6, 72.50001, 21.6, 73.200005, 22.4, 74.200005);
((GeneralPath)shape).curveTo(23.199999, 75.200005, 23.6, 76.50001, 23.6, 78.100006);
((GeneralPath)shape).curveTo(23.6, 79.3, 23.4, 80.40001, 22.9, 81.200005);
((GeneralPath)shape).curveTo(22.5, 82.00001, 21.9, 82.700005, 21.199999, 83.200005);
((GeneralPath)shape).curveTo(20.499998, 83.700005, 19.8, 84.00001, 19.099998, 84.200005);
((GeneralPath)shape).curveTo(18.099998, 84.4, 16.699999, 84.50001, 14.899999, 84.50001);
((GeneralPath)shape).lineTo(12.299999, 84.50001);
((GeneralPath)shape).lineTo(12.299999, 92.100006);
((GeneralPath)shape).lineTo(8.2, 92.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.2, 75.2);
((GeneralPath)shape).lineTo(12.2, 80.899994);
((GeneralPath)shape).lineTo(14.4, 80.899994);
((GeneralPath)shape).curveTo(16.0, 80.899994, 17.1, 80.799995, 17.6, 80.59999);
((GeneralPath)shape).curveTo(18.1, 80.399994, 18.6, 80.09999, 18.9, 79.59999);
((GeneralPath)shape).curveTo(19.199999, 79.19999, 19.4, 78.59999, 19.4, 77.99999);
((GeneralPath)shape).curveTo(19.4, 77.299995, 19.199999, 76.69999, 18.8, 76.19999);
((GeneralPath)shape).curveTo(18.4, 75.69999, 17.8, 75.39999, 17.199999, 75.29999);
((GeneralPath)shape).curveTo(16.699999, 75.19999, 15.699999, 75.19999, 14.299999, 75.19999);
((GeneralPath)shape).lineTo(12.199999, 75.19999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.8, 91.899994);
((GeneralPath)shape).lineTo(26.8, 71.899994);
((GeneralPath)shape).lineTo(41.699997, 71.899994);
((GeneralPath)shape).lineTo(41.699997, 75.299995);
((GeneralPath)shape).lineTo(30.9, 75.299995);
((GeneralPath)shape).lineTo(30.9, 79.7);
((GeneralPath)shape).lineTo(41.0, 79.7);
((GeneralPath)shape).lineTo(41.0, 83.1);
((GeneralPath)shape).lineTo(30.9, 83.1);
((GeneralPath)shape).lineTo(30.9, 88.6);
((GeneralPath)shape).lineTo(42.1, 88.6);
((GeneralPath)shape).lineTo(42.1, 92.0);
((GeneralPath)shape).lineTo(26.8, 92.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.5, 91.899994);
((GeneralPath)shape).lineTo(45.5, 71.899994);
((GeneralPath)shape).lineTo(51.6, 71.899994);
((GeneralPath)shape).lineTo(55.199997, 85.59999);
((GeneralPath)shape).lineTo(58.799995, 71.899994);
((GeneralPath)shape).lineTo(64.899994, 71.899994);
((GeneralPath)shape).lineTo(64.899994, 91.899994);
((GeneralPath)shape).lineTo(61.099995, 91.899994);
((GeneralPath)shape).lineTo(61.099995, 76.1);
((GeneralPath)shape).lineTo(57.099995, 91.9);
((GeneralPath)shape).lineTo(53.199993, 91.9);
((GeneralPath)shape).lineTo(49.199993, 76.1);
((GeneralPath)shape).lineTo(49.199993, 91.9);
((GeneralPath)shape).lineTo(45.499992, 91.9);
((GeneralPath)shape).closePath();
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
	private ext_pem() {
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
       ext_pem base = new ext_pem();
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
       ext_pem base = new ext_pem();
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
        return () -> new ext_pem();
    }
}

