package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_log implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(11.8, 33.7);
((GeneralPath)shape).lineTo(60.399998, 33.7);
((GeneralPath)shape).lineTo(60.399998, 37.8);
((GeneralPath)shape).lineTo(11.8, 37.8);
((GeneralPath)shape).lineTo(11.8, 33.7);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(11.800000190734863, 33.75), new Point2D.Double(60.400001525878906, 33.75), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 145, 161, 255),new Color(202, 213, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.8, 57.8);
((GeneralPath)shape).lineTo(60.399998, 57.8);
((GeneralPath)shape).lineTo(60.399998, 61.899998);
((GeneralPath)shape).lineTo(11.8, 61.899998);
((GeneralPath)shape).lineTo(11.8, 57.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(11.800000190734863, 57.849998474121094), new Point2D.Double(60.400001525878906, 57.849998474121094), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 145, 161, 255),new Color(202, 213, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.8, 46.0);
((GeneralPath)shape).lineTo(60.399998, 46.0);
((GeneralPath)shape).lineTo(60.399998, 50.1);
((GeneralPath)shape).lineTo(11.8, 50.1);
((GeneralPath)shape).lineTo(11.8, 46.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(11.800000190734863, 46.04999923706055), new Point2D.Double(60.400001525878906, 46.04999923706055), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 145, 161, 255),new Color(202, 213, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.8, 21.6);
((GeneralPath)shape).lineTo(60.399998, 21.6);
((GeneralPath)shape).lineTo(60.399998, 25.7);
((GeneralPath)shape).lineTo(11.8, 25.7);
((GeneralPath)shape).lineTo(11.8, 21.6);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(11.800000190734863, 21.649999618530273), new Point2D.Double(60.400001525878906, 21.649999618530273), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 145, 161, 255),new Color(202, 213, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
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
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.6, 91.2);
((GeneralPath)shape).lineTo(7.6, 71.3);
((GeneralPath)shape).lineTo(11.6, 71.3);
((GeneralPath)shape).lineTo(11.6, 87.8);
((GeneralPath)shape).lineTo(21.7, 87.8);
((GeneralPath)shape).lineTo(21.7, 91.200005);
((GeneralPath)shape).lineTo(7.6, 91.200005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.800001, 81.299995);
((GeneralPath)shape).curveTo(23.800001, 79.299995, 24.1, 77.49999, 24.7, 76.2);
((GeneralPath)shape).curveTo(25.2, 75.2, 25.800001, 74.299995, 26.6, 73.5);
((GeneralPath)shape).curveTo(27.4, 72.7, 28.300001, 72.1, 29.2, 71.7);
((GeneralPath)shape).curveTo(30.400002, 71.2, 31.900002, 70.899994, 33.5, 70.899994);
((GeneralPath)shape).curveTo(36.5, 70.899994, 38.8, 71.799995, 40.6, 73.59999);
((GeneralPath)shape).curveTo(42.399998, 75.399994, 43.3, 77.99999, 43.3, 81.19999);
((GeneralPath)shape).curveTo(43.3, 84.39999, 42.399998, 86.99999, 40.7, 88.79999);
((GeneralPath)shape).curveTo(38.9, 90.59999, 36.600002, 91.499985, 33.600002, 91.499985);
((GeneralPath)shape).curveTo(30.600002, 91.499985, 28.200003, 90.59998, 26.500002, 88.79999);
((GeneralPath)shape).curveTo(24.600002, 86.999985, 23.800001, 84.499985, 23.800001, 81.29999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.900002, 81.2);
((GeneralPath)shape).curveTo(27.900002, 83.5, 28.400002, 85.2, 29.500002, 86.399994);
((GeneralPath)shape).curveTo(30.500002, 87.59999, 31.900002, 88.2, 33.5, 88.2);
((GeneralPath)shape).curveTo(35.1, 88.2, 36.4, 87.6, 37.5, 86.5);
((GeneralPath)shape).curveTo(38.5, 85.3, 39.1, 83.6, 39.1, 81.3);
((GeneralPath)shape).curveTo(39.1, 79.0, 38.6, 77.3, 37.6, 76.200005);
((GeneralPath)shape).curveTo(36.6, 75.100006, 35.3, 74.50001, 33.6, 74.50001);
((GeneralPath)shape).curveTo(31.899998, 74.50001, 30.599998, 75.100006, 29.599998, 76.200005);
((GeneralPath)shape).curveTo(28.399998, 77.100006, 27.899998, 78.9, 27.899998, 81.200005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(55.7, 83.799995);
((GeneralPath)shape).lineTo(55.7, 80.399994);
((GeneralPath)shape).lineTo(64.4, 80.399994);
((GeneralPath)shape).lineTo(64.4, 88.399994);
((GeneralPath)shape).curveTo(63.600002, 89.2, 62.300003, 89.899994, 60.7, 90.59999);
((GeneralPath)shape).curveTo(59.100002, 91.19999, 57.5, 91.49999, 55.8, 91.49999);
((GeneralPath)shape).curveTo(53.7, 91.49999, 51.899998, 91.09999, 50.3, 90.19999);
((GeneralPath)shape).curveTo(48.7, 89.29999, 47.6, 88.09999, 46.8, 86.39999);
((GeneralPath)shape).curveTo(46.0, 84.79999, 45.6, 82.999985, 45.6, 81.09998);
((GeneralPath)shape).curveTo(45.6, 78.999985, 46.0, 77.19998, 46.899998, 75.499985);
((GeneralPath)shape).curveTo(47.799995, 73.79999, 49.1, 72.59998, 50.699997, 71.79999);
((GeneralPath)shape).curveTo(51.999996, 71.09999, 53.6, 70.79999, 55.499996, 70.79999);
((GeneralPath)shape).curveTo(57.999996, 70.79999, 59.899998, 71.29999, 61.299995, 72.39999);
((GeneralPath)shape).curveTo(62.699997, 73.39999, 63.599995, 74.89999, 63.999996, 76.69999);
((GeneralPath)shape).lineTo(59.999996, 77.49999);
((GeneralPath)shape).curveTo(59.699997, 76.49999, 59.199997, 75.69999, 58.399998, 75.19999);
((GeneralPath)shape).curveTo(57.6, 74.69999, 56.6, 74.29999, 55.499996, 74.29999);
((GeneralPath)shape).curveTo(53.699997, 74.29999, 52.299995, 74.89999, 51.299995, 75.999985);
((GeneralPath)shape).curveTo(50.299995, 77.09998, 49.699997, 78.79999, 49.699997, 80.999985);
((GeneralPath)shape).curveTo(49.699997, 83.39999, 50.199997, 85.19998, 51.299995, 86.39999);
((GeneralPath)shape).curveTo(52.399994, 87.59998, 53.699997, 88.19999, 55.499996, 88.19999);
((GeneralPath)shape).curveTo(56.299995, 88.19999, 57.199997, 87.99999, 57.999996, 87.69999);
((GeneralPath)shape).curveTo(58.899998, 87.39999, 59.599995, 86.99999, 60.199997, 86.49999);
((GeneralPath)shape).lineTo(60.199997, 84.0);
((GeneralPath)shape).lineTo(55.699997, 84.0);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_8);
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
	private ext_log() {
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
       ext_log base = new ext_log();
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
       ext_log base = new ext_log();
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
        return ext_log::new;
    }
}

