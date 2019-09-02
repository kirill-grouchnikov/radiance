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
public class ext_plist implements ResizableIcon {
    

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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 1.0), new Point2D.Double(36.0, 99.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
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
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.0620002746582, 72.20999908447266), new Point2D.Double(58.560001373291016, 85.70999908447266), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
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
paint = new Color(0, 0, 0, 0);
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
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.9, 66.4);
((GeneralPath)shape).lineTo(43.1, 66.4);
((GeneralPath)shape).lineTo(43.1, 72.1);
((GeneralPath)shape).lineTo(29.9, 72.1);
((GeneralPath)shape).lineTo(29.9, 66.4);
((GeneralPath)shape).closePath();
paint = new Color(237, 240, 243, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(60.3, 33.6);
((GeneralPath)shape).curveTo(59.5, 32.8, 58.5, 32.399998, 57.399998, 32.399998);
((GeneralPath)shape).lineTo(15.7, 32.399998);
((GeneralPath)shape).curveTo(14.599999, 32.399998, 13.6, 32.8, 12.799999, 33.6);
((GeneralPath)shape).curveTo(11.999999, 34.399998, 11.599999, 35.399998, 11.599999, 36.5);
((GeneralPath)shape).lineTo(11.599999, 64.8);
((GeneralPath)shape).curveTo(11.599999, 65.9, 11.999999, 66.9, 12.799999, 67.700005);
((GeneralPath)shape).curveTo(13.599999, 68.50001, 14.599999, 68.9, 15.699999, 68.9);
((GeneralPath)shape).lineTo(29.899998, 68.9);
((GeneralPath)shape).curveTo(29.899998, 69.6, 29.799997, 70.200005, 29.499998, 70.9);
((GeneralPath)shape).curveTo(29.199999, 71.6, 28.899998, 72.200005, 28.699999, 72.700005);
((GeneralPath)shape).curveTo(28.4, 73.200005, 28.3, 73.600006, 28.3, 73.8);
((GeneralPath)shape).curveTo(28.3, 74.3, 28.5, 74.600006, 28.8, 75.0);
((GeneralPath)shape).curveTo(29.099998, 75.3, 29.5, 75.5, 30.0, 75.5);
((GeneralPath)shape).lineTo(43.3, 75.5);
((GeneralPath)shape).curveTo(43.8, 75.5, 44.1, 75.3, 44.5, 75.0);
((GeneralPath)shape).curveTo(44.8, 74.7, 45.0, 74.3, 45.0, 73.8);
((GeneralPath)shape).curveTo(45.0, 73.600006, 44.9, 73.200005, 44.6, 72.700005);
((GeneralPath)shape).curveTo(44.3, 72.200005, 44.0, 71.600006, 43.8, 70.9);
((GeneralPath)shape).curveTo(43.5, 70.200005, 43.399998, 69.5, 43.399998, 68.9);
((GeneralPath)shape).lineTo(57.6, 68.9);
((GeneralPath)shape).curveTo(58.699997, 68.9, 59.699997, 68.5, 60.5, 67.700005);
((GeneralPath)shape).curveTo(61.3, 66.9, 61.7, 65.9, 61.7, 64.8);
((GeneralPath)shape).lineTo(61.7, 36.6);
((GeneralPath)shape).curveTo(61.5, 35.399998, 61.100002, 34.5, 60.3, 33.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(58.2, 58.3);
((GeneralPath)shape).curveTo(58.2, 58.5, 58.100002, 58.7, 58.0, 58.899998);
((GeneralPath)shape).curveTo(57.8, 59.1, 57.6, 59.1, 57.4, 59.1);
((GeneralPath)shape).lineTo(15.7, 59.1);
((GeneralPath)shape).curveTo(15.5, 59.1, 15.3, 59.0, 15.099999, 58.899998);
((GeneralPath)shape).curveTo(14.9, 58.699997, 14.9, 58.499996, 14.9, 58.3);
((GeneralPath)shape).lineTo(14.9, 36.6);
((GeneralPath)shape).curveTo(14.9, 36.399998, 15.0, 36.199997, 15.099999, 36.0);
((GeneralPath)shape).curveTo(15.299999, 35.8, 15.499999, 35.8, 15.7, 35.8);
((GeneralPath)shape).lineTo(57.4, 35.8);
((GeneralPath)shape).curveTo(57.600002, 35.8, 57.800003, 35.899998, 58.0, 36.0);
((GeneralPath)shape).curveTo(58.2, 36.2, 58.2, 36.4, 58.2, 36.6);
((GeneralPath)shape).lineTo(58.2, 58.3);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.5, 75.75299835205078), new Point2D.Double(36.5, 32.41899871826172), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(32.6, 56.6);
((GeneralPath)shape).curveTo(32.199997, 56.3, 31.899998, 56.0, 31.599998, 55.699997);
((GeneralPath)shape).curveTo(31.3, 55.299995, 30.999998, 54.899998, 30.8, 54.499996);
((GeneralPath)shape).curveTo(30.199999, 53.599995, 29.699999, 52.599995, 29.4, 51.599995);
((GeneralPath)shape).curveTo(29.0, 50.399994, 28.8, 49.299995, 28.8, 48.199993);
((GeneralPath)shape).curveTo(28.8, 46.999992, 29.099998, 45.899994, 29.599998, 44.999992);
((GeneralPath)shape).curveTo(29.999998, 44.29999, 30.599998, 43.699993, 31.3, 43.29999);
((GeneralPath)shape).curveTo(32.0, 42.89999, 32.8, 42.699993, 33.5, 42.59999);
((GeneralPath)shape).curveTo(33.8, 42.59999, 34.1, 42.59999, 34.4, 42.69999);
((GeneralPath)shape).curveTo(34.600002, 42.799988, 34.9, 42.89999, 35.2, 42.99999);
((GeneralPath)shape).curveTo(35.600002, 43.19999, 35.9, 43.299988, 36.0, 43.299988);
((GeneralPath)shape).curveTo(36.3, 43.399986, 36.5, 43.399986, 36.6, 43.399986);
((GeneralPath)shape).curveTo(36.699997, 43.399986, 36.899998, 43.399986, 37.1, 43.299988);
((GeneralPath)shape).curveTo(37.199997, 43.299988, 37.399998, 43.19999, 37.699997, 43.099987);
((GeneralPath)shape).curveTo(37.999996, 42.999985, 38.199997, 42.899986, 38.399998, 42.799988);
((GeneralPath)shape).curveTo(38.699997, 42.69999, 38.999996, 42.599987, 39.199997, 42.599987);
((GeneralPath)shape).curveTo(39.499996, 42.599987, 39.799995, 42.49999, 40.1, 42.599987);
((GeneralPath)shape).curveTo(40.699997, 42.599987, 41.199997, 42.799988, 41.6, 42.899986);
((GeneralPath)shape).curveTo(42.399998, 43.199986, 43.1, 43.699986, 43.5, 44.499985);
((GeneralPath)shape).curveTo(43.3, 44.599983, 43.1, 44.799984, 42.9, 44.899986);
((GeneralPath)shape).curveTo(42.5, 45.199986, 42.2, 45.599987, 41.9, 46.099987);
((GeneralPath)shape).curveTo(41.600002, 46.699986, 41.4, 47.399986, 41.4, 48.099987);
((GeneralPath)shape).curveTo(41.4, 48.99999, 41.600002, 49.699986, 42.100002, 50.399986);
((GeneralPath)shape).curveTo(42.4, 50.899986, 42.800003, 51.299988, 43.300003, 51.599987);
((GeneralPath)shape).curveTo(43.500004, 51.799988, 43.800003, 51.899986, 44.000004, 51.99999);
((GeneralPath)shape).lineTo(43.700005, 52.89999);
((GeneralPath)shape).curveTo(43.400005, 53.49999, 43.100006, 54.19999, 42.700005, 54.69999);
((GeneralPath)shape).curveTo(42.400005, 55.19999, 42.100006, 55.59999, 41.900005, 55.799988);
((GeneralPath)shape).curveTo(41.600006, 56.19999, 41.300007, 56.49999, 41.000004, 56.69999);
((GeneralPath)shape).curveTo(40.800003, 56.799988, 40.400005, 56.99999, 40.000004, 56.99999);
((GeneralPath)shape).curveTo(39.700005, 56.99999, 39.400005, 56.99999, 39.200005, 56.89999);
((GeneralPath)shape).curveTo(39.000004, 56.79999, 38.700005, 56.69999, 38.500004, 56.59999);
((GeneralPath)shape).curveTo(38.300003, 56.499992, 38.000004, 56.39999, 37.800003, 56.29999);
((GeneralPath)shape).curveTo(37.500004, 56.199993, 37.200005, 56.199993, 36.9, 56.199993);
((GeneralPath)shape).curveTo(36.600002, 56.199993, 36.300003, 56.199993, 36.0, 56.29999);
((GeneralPath)shape).curveTo(35.8, 56.39999, 35.5, 56.499992, 35.3, 56.59999);
((GeneralPath)shape).curveTo(35.0, 56.69999, 34.8, 56.79999, 34.6, 56.89999);
((GeneralPath)shape).curveTo(34.3, 56.89999, 34.0, 56.99999, 33.8, 56.99999);
((GeneralPath)shape).curveTo(33.399998, 56.99999, 33.0, 56.89999, 32.6, 56.599987);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.0, 42.0);
((GeneralPath)shape).curveTo(37.5, 42.3, 37.0, 42.4, 36.4, 42.3);
((GeneralPath)shape).curveTo(36.300003, 41.8, 36.4, 41.3, 36.600002, 40.7);
((GeneralPath)shape).curveTo(36.800003, 40.2, 37.000004, 39.8, 37.4, 39.4);
((GeneralPath)shape).curveTo(37.8, 39.000004, 38.2, 38.600002, 38.7, 38.4);
((GeneralPath)shape).curveTo(39.2, 38.100002, 39.7, 38.0, 40.2, 38.0);
((GeneralPath)shape).curveTo(40.3, 38.5, 40.2, 39.1, 40.0, 39.6);
((GeneralPath)shape).curveTo(39.8, 40.1, 39.6, 40.6, 39.2, 41.0);
((GeneralPath)shape).curveTo(38.9, 41.4, 38.5, 41.8, 38.0, 42.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.5, 57.0), new Point2D.Double(36.5, 38.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5_1);
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
	private ext_plist() {
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
       ext_plist base = new ext_plist();
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
       ext_plist base = new ext_plist();
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
        return ext_plist::new;
    }
}

