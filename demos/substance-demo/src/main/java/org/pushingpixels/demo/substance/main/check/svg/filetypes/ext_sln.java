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
public class ext_sln implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(8.9, 83.3);
((GeneralPath)shape).lineTo(12.9, 82.9);
((GeneralPath)shape).curveTo(13.099999, 84.200005, 13.599999, 85.200005, 14.4, 85.8);
((GeneralPath)shape).curveTo(15.099999, 86.4, 16.1, 86.700005, 17.4, 86.700005);
((GeneralPath)shape).curveTo(18.699999, 86.700005, 19.699999, 86.4, 20.4, 85.9);
((GeneralPath)shape).curveTo(21.1, 85.3, 21.4, 84.700005, 21.4, 84.0);
((GeneralPath)shape).curveTo(21.4, 83.5, 21.3, 83.1, 21.0, 82.8);
((GeneralPath)shape).curveTo(20.7, 82.50001, 20.2, 82.200005, 19.5, 81.9);
((GeneralPath)shape).curveTo(19.0, 81.700005, 17.9, 81.4, 16.2, 81.0);
((GeneralPath)shape).curveTo(14.000001, 80.5, 12.500001, 79.8, 11.6, 79.0);
((GeneralPath)shape).curveTo(10.400001, 77.9, 9.700001, 76.6, 9.700001, 75.0);
((GeneralPath)shape).curveTo(9.700001, 74.0, 10.000001, 73.0, 10.6, 72.1);
((GeneralPath)shape).curveTo(11.2, 71.2, 12.0, 70.5, 13.1, 70.1);
((GeneralPath)shape).curveTo(14.200001, 69.7, 15.5, 69.4, 17.1, 69.4);
((GeneralPath)shape).curveTo(19.6, 69.4, 21.6, 70.0, 22.8, 71.1);
((GeneralPath)shape).curveTo(23.999998, 72.2, 24.8, 73.7, 24.8, 75.5);
((GeneralPath)shape).lineTo(20.699999, 75.7);
((GeneralPath)shape).curveTo(20.499998, 74.7, 20.099998, 73.899994, 19.599998, 73.5);
((GeneralPath)shape).curveTo(19.099998, 73.100006, 18.199999, 72.8, 16.999998, 72.8);
((GeneralPath)shape).curveTo(15.799998, 72.8, 14.899998, 73.0, 14.199998, 73.5);
((GeneralPath)shape).curveTo(13.799998, 73.8, 13.5999975, 74.2, 13.5999975, 74.7);
((GeneralPath)shape).curveTo(13.5999975, 75.2, 13.799997, 75.6, 14.199998, 75.899994);
((GeneralPath)shape).curveTo(14.699998, 76.299995, 15.999998, 76.799995, 17.999998, 77.2);
((GeneralPath)shape).curveTo(19.999998, 77.7, 21.499998, 78.1, 22.399998, 78.6);
((GeneralPath)shape).curveTo(23.299997, 79.1, 24.099998, 79.799995, 24.599998, 80.6);
((GeneralPath)shape).curveTo(25.099998, 81.4, 25.399998, 82.5, 25.399998, 83.799995);
((GeneralPath)shape).curveTo(25.399998, 84.899994, 25.099998, 85.99999, 24.399998, 86.99999);
((GeneralPath)shape).curveTo(23.799997, 87.99999, 22.799997, 88.69999, 21.699997, 89.19999);
((GeneralPath)shape).curveTo(20.599997, 89.69999, 19.099997, 89.89999, 17.299997, 89.89999);
((GeneralPath)shape).curveTo(14.699997, 89.89999, 12.799997, 89.29999, 11.399998, 88.09998);
((GeneralPath)shape).curveTo(9.999998, 86.89998, 9.0999975, 85.499985, 8.899998, 83.29998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.9, 89.8);
((GeneralPath)shape).lineTo(28.9, 69.9);
((GeneralPath)shape).lineTo(33.0, 69.9);
((GeneralPath)shape).lineTo(33.0, 86.4);
((GeneralPath)shape).lineTo(43.2, 86.4);
((GeneralPath)shape).lineTo(43.2, 89.8);
((GeneralPath)shape).lineTo(28.9, 89.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.1, 89.8);
((GeneralPath)shape).lineTo(46.1, 69.8);
((GeneralPath)shape).lineTo(50.1, 69.8);
((GeneralPath)shape).lineTo(58.399998, 83.200005);
((GeneralPath)shape).lineTo(58.399998, 69.8);
((GeneralPath)shape).lineTo(62.199997, 69.8);
((GeneralPath)shape).lineTo(62.199997, 89.8);
((GeneralPath)shape).lineTo(58.0, 89.8);
((GeneralPath)shape).lineTo(49.8, 76.700005);
((GeneralPath)shape).lineTo(49.8, 89.8);
((GeneralPath)shape).lineTo(46.1, 89.8);
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
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 73.45700073242188), new Point2D.Double(58.569000244140625, 86.95700073242188), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
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
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.2, 52.2);
((GeneralPath)shape).lineTo(44.8, 50.7);
((GeneralPath)shape).curveTo(45.7, 47.9, 46.6, 45.0, 47.5, 42.2);
((GeneralPath)shape).curveTo(47.8, 41.100002, 48.2, 40.0, 48.9, 39.100002);
((GeneralPath)shape).curveTo(50.0, 37.600002, 51.5, 36.800003, 53.2, 36.600002);
((GeneralPath)shape).curveTo(53.9, 36.500004, 54.600002, 36.4, 55.3, 36.4);
((GeneralPath)shape).lineTo(62.0, 36.4);
((GeneralPath)shape).curveTo(61.9, 36.5, 61.9, 36.600002, 61.9, 36.7);
((GeneralPath)shape).curveTo(61.100002, 38.100002, 60.4, 39.5, 59.600002, 40.9);
((GeneralPath)shape).lineTo(55.4, 48.100002);
((GeneralPath)shape).curveTo(54.5, 49.600002, 53.5, 51.100002, 52.300003, 52.500004);
((GeneralPath)shape).curveTo(51.500004, 53.500004, 50.600002, 54.500004, 49.500004, 55.200005);
((GeneralPath)shape).curveTo(48.700005, 55.700005, 47.900005, 56.000004, 47.000004, 56.000004);
((GeneralPath)shape).lineTo(37.100006, 56.000004);
((GeneralPath)shape).curveTo(36.100006, 56.000004, 35.300007, 55.600002, 34.600006, 55.000004);
((GeneralPath)shape).curveTo(33.600006, 54.100002, 33.000008, 52.800003, 32.500008, 51.600002);
((GeneralPath)shape).curveTo(31.600008, 49.300003, 31.100008, 46.800003, 30.500008, 44.4);
((GeneralPath)shape).curveTo(30.200008, 43.300003, 29.900007, 42.100002, 29.600008, 41.0);
((GeneralPath)shape).curveTo(29.600008, 40.9, 29.500008, 40.9, 29.500008, 40.8);
((GeneralPath)shape).lineTo(29.300007, 41.0);
((GeneralPath)shape).curveTo(28.000008, 42.3, 26.900007, 43.7, 25.900007, 45.2);
((GeneralPath)shape).curveTo(25.600008, 45.600002, 25.500008, 46.100002, 25.400007, 46.600002);
((GeneralPath)shape).curveTo(24.800007, 48.4, 24.300007, 50.2, 23.700006, 51.9);
((GeneralPath)shape).curveTo(23.100006, 53.600002, 22.100006, 54.9, 20.400007, 55.7);
((GeneralPath)shape).curveTo(19.400007, 56.2, 18.400007, 56.4, 17.300007, 56.4);
((GeneralPath)shape).curveTo(15.7000065, 56.4, 14.100007, 56.4, 12.500007, 56.5);
((GeneralPath)shape).curveTo(12.100007, 56.5, 12.100007, 56.5, 12.2000065, 56.1);
((GeneralPath)shape).curveTo(12.900006, 53.6, 13.7000065, 51.1, 14.800007, 48.699997);
((GeneralPath)shape).curveTo(15.900007, 46.199997, 17.200006, 43.899998, 18.900007, 41.799995);
((GeneralPath)shape).curveTo(20.000008, 40.299995, 21.300007, 38.999996, 22.800007, 37.999996);
((GeneralPath)shape).curveTo(23.600006, 37.499996, 24.400007, 37.099995, 25.400007, 36.999996);
((GeneralPath)shape).lineTo(36.0, 36.999996);
((GeneralPath)shape).curveTo(37.8, 36.999996, 39.1, 37.699997, 40.1, 39.199997);
((GeneralPath)shape).curveTo(40.699997, 40.1, 41.1, 41.1, 41.5, 42.1);
((GeneralPath)shape).curveTo(42.2, 44.199997, 42.7, 46.3, 43.2, 48.399998);
((GeneralPath)shape).lineTo(44.100002, 51.999996);
((GeneralPath)shape).curveTo(44.100002, 52.099995, 44.100002, 52.199997, 44.2, 52.199997);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(37.0, 56.5), new Point2D.Double(37.0, 36.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_sln() {
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
       ext_sln base = new ext_sln();
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
       ext_sln base = new ext_sln();
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
        return ext_sln::new;
    }
}

