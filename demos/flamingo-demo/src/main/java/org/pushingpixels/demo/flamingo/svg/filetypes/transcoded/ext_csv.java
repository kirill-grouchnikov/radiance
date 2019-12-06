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
public class ext_csv implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(21.6, 83.8);
((GeneralPath)shape).lineTo(25.5, 85.0);
((GeneralPath)shape).curveTo(24.9, 87.2, 23.9, 88.8, 22.5, 89.8);
((GeneralPath)shape).curveTo(21.1, 90.9, 19.3, 91.4, 17.2, 91.4);
((GeneralPath)shape).curveTo(14.500001, 91.4, 12.400001, 90.5, 10.700001, 88.700005);
((GeneralPath)shape).curveTo(9.000001, 86.90001, 8.1, 84.4, 8.1, 81.3);
((GeneralPath)shape).curveTo(8.1, 78.0, 9.0, 75.4, 10.700001, 73.600006);
((GeneralPath)shape).curveTo(12.400002, 71.80001, 14.700001, 70.90001, 17.5, 70.90001);
((GeneralPath)shape).curveTo(19.9, 70.90001, 21.9, 71.600006, 23.5, 73.100006);
((GeneralPath)shape).curveTo(24.4, 73.90001, 25.1, 75.200005, 25.5, 76.8);
((GeneralPath)shape).lineTo(21.5, 77.700005);
((GeneralPath)shape).curveTo(21.3, 76.700005, 20.8, 75.9, 20.0, 75.3);
((GeneralPath)shape).curveTo(19.3, 74.700005, 18.3, 74.4, 17.3, 74.4);
((GeneralPath)shape).curveTo(15.799999, 74.4, 14.599999, 74.9, 13.699999, 76.0);
((GeneralPath)shape).curveTo(12.799998, 77.1, 12.299999, 78.8, 12.299999, 81.1);
((GeneralPath)shape).curveTo(12.299999, 83.6, 12.799999, 85.4, 13.699999, 86.5);
((GeneralPath)shape).curveTo(14.599998, 87.6, 15.799999, 88.1, 17.199999, 88.1);
((GeneralPath)shape).curveTo(18.3, 88.1, 19.199999, 87.799995, 19.999998, 87.1);
((GeneralPath)shape).curveTo(20.799997, 86.4, 21.299997, 85.2, 21.599998, 83.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.0, 84.600006);
((GeneralPath)shape).lineTo(31.9, 84.200005);
((GeneralPath)shape).curveTo(32.1, 85.50001, 32.6, 86.50001, 33.3, 87.100006);
((GeneralPath)shape).curveTo(34.0, 87.700005, 35.0, 88.00001, 36.2, 88.00001);
((GeneralPath)shape).curveTo(37.5, 88.00001, 38.5, 87.700005, 39.100002, 87.200005);
((GeneralPath)shape).curveTo(39.800003, 86.700005, 40.100002, 86.00001, 40.100002, 85.3);
((GeneralPath)shape).curveTo(40.100002, 84.8, 40.000004, 84.4, 39.7, 84.100006);
((GeneralPath)shape).curveTo(39.4, 83.8, 38.9, 83.50001, 38.2, 83.200005);
((GeneralPath)shape).curveTo(37.7, 83.00001, 36.7, 82.700005, 35.0, 82.3);
((GeneralPath)shape).curveTo(32.8, 81.8, 31.3, 81.100006, 30.4, 80.3);
((GeneralPath)shape).curveTo(29.199999, 79.200005, 28.6, 77.9, 28.6, 76.3);
((GeneralPath)shape).curveTo(28.6, 75.3, 28.9, 74.3, 29.5, 73.5);
((GeneralPath)shape).curveTo(30.1, 72.6, 30.9, 72.0, 32.0, 71.5);
((GeneralPath)shape).curveTo(33.1, 71.0, 34.4, 70.8, 35.9, 70.8);
((GeneralPath)shape).curveTo(38.4, 70.8, 40.300003, 71.3, 41.600002, 72.4);
((GeneralPath)shape).curveTo(42.9, 73.5, 43.500004, 74.9, 43.600002, 76.8);
((GeneralPath)shape).lineTo(39.600002, 77.0);
((GeneralPath)shape).curveTo(39.4, 76.0, 39.100002, 75.2, 38.500004, 74.8);
((GeneralPath)shape).curveTo(37.900005, 74.4, 37.100002, 74.100006, 35.900005, 74.100006);
((GeneralPath)shape).curveTo(34.700005, 74.100006, 33.800007, 74.3, 33.100006, 74.8);
((GeneralPath)shape).curveTo(32.700005, 75.100006, 32.500008, 75.5, 32.500008, 76.0);
((GeneralPath)shape).curveTo(32.500008, 76.5, 32.70001, 76.9, 33.100006, 77.2);
((GeneralPath)shape).curveTo(33.600006, 77.6, 34.800007, 78.1, 36.800007, 78.5);
((GeneralPath)shape).curveTo(38.800007, 78.9, 40.20001, 79.4, 41.20001, 79.9);
((GeneralPath)shape).curveTo(42.10001, 80.4, 42.90001, 81.1, 43.40001, 81.9);
((GeneralPath)shape).curveTo(43.90001, 82.700005, 44.20001, 83.8, 44.20001, 85.1);
((GeneralPath)shape).curveTo(44.20001, 86.2, 43.90001, 87.299995, 43.20001, 88.299995);
((GeneralPath)shape).curveTo(42.60001, 89.299995, 41.70001, 89.99999, 40.500008, 90.49999);
((GeneralPath)shape).curveTo(39.300007, 90.99999, 37.90001, 91.19999, 36.20001, 91.19999);
((GeneralPath)shape).curveTo(33.70001, 91.19999, 31.700008, 90.59999, 30.40001, 89.49999);
((GeneralPath)shape).curveTo(29.00001, 88.49999, 28.200008, 86.799995, 28.00001, 84.59999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.7, 91.100006);
((GeneralPath)shape).lineTo(45.600002, 71.3);
((GeneralPath)shape).lineTo(50.0, 71.3);
((GeneralPath)shape).lineTo(55.0, 85.9);
((GeneralPath)shape).lineTo(59.9, 71.200005);
((GeneralPath)shape).lineTo(64.200005, 71.200005);
((GeneralPath)shape).lineTo(57.0, 91.1);
((GeneralPath)shape).lineTo(52.7, 91.1);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(47.9, 26.8);
((GeneralPath)shape).lineTo(61.0, 26.8);
((GeneralPath)shape).lineTo(61.0, 35.5);
((GeneralPath)shape).lineTo(47.9, 35.5);
((GeneralPath)shape).lineTo(47.9, 26.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.9, 40.199997);
((GeneralPath)shape).lineTo(61.0, 40.199997);
((GeneralPath)shape).lineTo(61.0, 49.0);
((GeneralPath)shape).lineTo(47.9, 49.0);
((GeneralPath)shape).lineTo(47.9, 40.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.9, 53.6);
((GeneralPath)shape).lineTo(61.0, 53.6);
((GeneralPath)shape).lineTo(61.0, 62.3);
((GeneralPath)shape).lineTo(47.9, 62.3);
((GeneralPath)shape).lineTo(47.9, 53.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 53.6);
((GeneralPath)shape).lineTo(43.300003, 53.6);
((GeneralPath)shape).lineTo(43.300003, 62.3);
((GeneralPath)shape).lineTo(30.2, 62.3);
((GeneralPath)shape).lineTo(30.2, 53.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.400002, 53.6);
((GeneralPath)shape).lineTo(25.500002, 53.6);
((GeneralPath)shape).lineTo(25.500002, 62.3);
((GeneralPath)shape).lineTo(12.500002, 62.3);
((GeneralPath)shape).lineTo(12.400002, 53.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.300001, 26.599998);
((GeneralPath)shape).lineTo(43.4, 26.599998);
((GeneralPath)shape).lineTo(43.4, 35.3);
((GeneralPath)shape).lineTo(30.3, 35.3);
((GeneralPath)shape).lineTo(30.3, 26.599998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.6, 26.599998);
((GeneralPath)shape).lineTo(25.7, 26.599998);
((GeneralPath)shape).lineTo(25.7, 35.3);
((GeneralPath)shape).lineTo(12.6, 35.3);
((GeneralPath)shape).lineTo(12.6, 26.599998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.300001, 40.199997);
((GeneralPath)shape).lineTo(43.4, 40.199997);
((GeneralPath)shape).lineTo(43.4, 49.0);
((GeneralPath)shape).lineTo(30.3, 49.0);
((GeneralPath)shape).lineTo(30.3, 40.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.6, 40.199997);
((GeneralPath)shape).lineTo(25.7, 40.199997);
((GeneralPath)shape).lineTo(25.7, 49.0);
((GeneralPath)shape).lineTo(12.6, 49.0);
((GeneralPath)shape).lineTo(12.6, 40.2);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.75, 62.28900146484375), new Point2D.Double(36.75, 26.583999633789062), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
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
	private ext_csv() {
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
       ext_csv base = new ext_csv();
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
       ext_csv base = new ext_csv();
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
        return ext_csv::new;
    }
}

