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
public class ext_lnk implements ResizableIcon {
    

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
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 27.0), new Point2D.Double(36.20000076293945, -71.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 72.0f));
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
((GeneralPath)shape).moveTo(9.8, 90.1);
((GeneralPath)shape).lineTo(9.8, 70.4);
((GeneralPath)shape).lineTo(13.9, 70.4);
((GeneralPath)shape).lineTo(13.9, 86.7);
((GeneralPath)shape).lineTo(24.0, 86.7);
((GeneralPath)shape).lineTo(24.0, 90.0);
((GeneralPath)shape).lineTo(9.8, 90.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.900002, 90.1);
((GeneralPath)shape).lineTo(26.900002, 70.2);
((GeneralPath)shape).lineTo(30.900002, 70.2);
((GeneralPath)shape).lineTo(39.100002, 83.399994);
((GeneralPath)shape).lineTo(39.100002, 70.2);
((GeneralPath)shape).lineTo(42.9, 70.2);
((GeneralPath)shape).lineTo(42.9, 90.0);
((GeneralPath)shape).lineTo(38.800003, 90.0);
((GeneralPath)shape).lineTo(30.700003, 77.1);
((GeneralPath)shape).lineTo(30.700003, 90.0);
((GeneralPath)shape).lineTo(26.900003, 90.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.2, 90.1);
((GeneralPath)shape).lineTo(47.2, 70.2);
((GeneralPath)shape).lineTo(51.3, 70.2);
((GeneralPath)shape).lineTo(51.3, 79.0);
((GeneralPath)shape).lineTo(59.5, 70.2);
((GeneralPath)shape).lineTo(65.0, 70.2);
((GeneralPath)shape).lineTo(57.3, 78.0);
((GeneralPath)shape).lineTo(65.3, 90.1);
((GeneralPath)shape).lineTo(60.0, 90.1);
((GeneralPath)shape).lineTo(54.5, 80.799995);
((GeneralPath)shape).lineTo(51.2, 84.1);
((GeneralPath)shape).lineTo(51.2, 90.1);
((GeneralPath)shape).lineTo(47.2, 90.1);
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
paint = new LinearGradientPaint(new Point2D.Double(31.761999130249023, -39.935001373291016), new Point2D.Double(31.761999130249023, -39.986000061035156), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 72.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.29999923706055, -44.20000076293945), new Point2D.Double(58.849998474121094, -57.75), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 72.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(26.1, 48.1);
((GeneralPath)shape).lineTo(19.8, 41.8);
((GeneralPath)shape).curveTo(15.599999, 37.6, 15.4, 30.9, 19.3, 26.9);
((GeneralPath)shape).curveTo(23.199999, 22.9, 30.0, 23.1, 34.199997, 27.4);
((GeneralPath)shape).lineTo(41.299995, 34.5);
((GeneralPath)shape).curveTo(45.499996, 38.7, 45.699997, 45.3, 41.899994, 49.3);
((GeneralPath)shape).lineTo(41.799995, 49.399998);
((GeneralPath)shape).lineTo(41.799995, 49.499996);
((GeneralPath)shape).curveTo(40.599995, 50.599995, 38.699997, 50.599995, 37.499996, 49.399998);
((GeneralPath)shape).curveTo(36.299995, 48.199997, 36.299995, 46.199997, 37.499996, 44.999996);
((GeneralPath)shape).curveTo(39.299995, 43.199997, 39.199997, 40.099995, 37.199997, 38.199997);
((GeneralPath)shape).lineTo(30.599997, 31.599997);
((GeneralPath)shape).curveTo(28.599997, 29.599997, 25.399998, 29.499996, 23.599997, 31.399996);
((GeneralPath)shape).curveTo(21.799997, 33.199997, 21.899996, 36.399994, 23.799997, 38.399994);
((GeneralPath)shape).lineTo(26.299997, 40.899994);
((GeneralPath)shape).curveTo(26.299997, 40.899994, 25.899998, 41.999992, 25.599997, 44.199993);
((GeneralPath)shape).curveTo(25.499996, 45.999992, 26.099997, 48.099995, 26.099997, 48.099995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.7, 61.199997);
((GeneralPath)shape).curveTo(57.7, 57.199997, 57.5, 50.499996, 53.2, 46.299995);
((GeneralPath)shape).lineTo(46.9, 40.0);
((GeneralPath)shape).curveTo(46.9, 40.0, 47.5, 42.0, 47.300003, 44.2);
((GeneralPath)shape).curveTo(47.100002, 46.4, 46.600002, 47.5, 46.600002, 47.5);
((GeneralPath)shape).lineTo(49.100002, 50.0);
((GeneralPath)shape).curveTo(51.100002, 52.0, 51.2, 55.2, 49.300003, 57.0);
((GeneralPath)shape).curveTo(47.500004, 58.8, 44.300003, 58.7, 42.300003, 56.8);
((GeneralPath)shape).lineTo(35.7, 50.0);
((GeneralPath)shape).curveTo(33.7, 48.0, 33.600002, 45.0, 35.4, 43.2);
((GeneralPath)shape).curveTo(36.600002, 42.0, 36.600002, 40.0, 35.4, 38.8);
((GeneralPath)shape).curveTo(34.2, 37.6, 32.300003, 37.6, 31.100002, 38.7);
((GeneralPath)shape).lineTo(31.100002, 38.8);
((GeneralPath)shape).lineTo(31.000002, 38.899998);
((GeneralPath)shape).curveTo(27.200003, 42.899998, 27.500002, 49.5, 31.600002, 53.699997);
((GeneralPath)shape).lineTo(38.7, 60.799995);
((GeneralPath)shape).curveTo(43.0, 64.899994, 49.7, 65.1, 53.7, 61.199997);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(-60.99599838256836, 81.53700256347656), new Point2D.Double(-100.96800231933594, 81.53700256347656), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.0f, 1.0f, 1.0f, 0.0f, -45.0f, 125.0f));
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
	private ext_lnk() {
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
       ext_lnk base = new ext_lnk();
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
       ext_lnk base = new ext_lnk();
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
        return ext_lnk::new;
    }
}

