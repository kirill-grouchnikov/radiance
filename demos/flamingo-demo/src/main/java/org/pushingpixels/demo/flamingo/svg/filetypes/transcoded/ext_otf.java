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
public class ext_otf implements ResizableIcon {
    

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
((GeneralPath)shape).lineTo(71.9, 27.7);
((GeneralPath)shape).lineTo(71.9, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(190, 192, 219, 255),new Color(206, 205, 230, 255),new Color(225, 220, 243, 255),new Color(239, 230, 251, 255),new Color(245, 245, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(71.9, 27.7);
((GeneralPath)shape).lineTo(71.9, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 135, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(71.9, 27.7);
((GeneralPath)shape).lineTo(71.9, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
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
((GeneralPath)shape).moveTo(44.7, 1.0);
((GeneralPath)shape).lineTo(71.6, 27.7);
((GeneralPath)shape).lineTo(44.7, 27.7);
((GeneralPath)shape).lineTo(44.7, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(44.75400161743164, 74.23400115966797), new Point2D.Double(58.198001861572266, 87.677001953125), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 245, 255, 255),new Color(250, 241, 251, 255),new Color(237, 231, 244, 255),new Color(221, 219, 233, 255),new Color(199, 201, 218, 255),new Color(173, 179, 199, 255),new Color(146, 145, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.7, 1.0);
((GeneralPath)shape).lineTo(71.6, 27.7);
((GeneralPath)shape).lineTo(44.7, 27.7);
((GeneralPath)shape).lineTo(44.7, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.7, 1.0);
((GeneralPath)shape).lineTo(71.6, 27.7);
((GeneralPath)shape).lineTo(44.7, 27.7);
((GeneralPath)shape).lineTo(44.7, 1.0);
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
((GeneralPath)shape).moveTo(26.9, 49.3);
((GeneralPath)shape).lineTo(16.5, 49.3);
((GeneralPath)shape).lineTo(15.3, 52.1);
((GeneralPath)shape).curveTo(14.900001, 53.0, 14.7, 53.8, 14.7, 54.399998);
((GeneralPath)shape).curveTo(14.7, 55.199997, 15.0, 55.8, 15.7, 56.199997);
((GeneralPath)shape).curveTo(16.1, 56.399998, 17.1, 56.6, 18.6, 56.699997);
((GeneralPath)shape).lineTo(18.6, 57.499996);
((GeneralPath)shape).lineTo(8.7, 57.499996);
((GeneralPath)shape).lineTo(8.7, 56.699997);
((GeneralPath)shape).curveTo(9.8, 56.499996, 10.599999, 56.1, 11.299999, 55.399998);
((GeneralPath)shape).curveTo(11.999999, 54.699997, 12.799999, 53.3, 13.799999, 51.1);
((GeneralPath)shape).lineTo(24.3, 28.399998);
((GeneralPath)shape).lineTo(24.699999, 28.399998);
((GeneralPath)shape).lineTo(35.3, 51.799995);
((GeneralPath)shape).curveTo(36.3, 53.999996, 37.1, 55.399994, 37.8, 55.999996);
((GeneralPath)shape).curveTo(38.3, 56.399998, 39.0, 56.699997, 39.899998, 56.799995);
((GeneralPath)shape).lineTo(39.899998, 57.599995);
((GeneralPath)shape).lineTo(25.7, 57.599995);
((GeneralPath)shape).lineTo(25.7, 56.799995);
((GeneralPath)shape).lineTo(26.300001, 56.799995);
((GeneralPath)shape).curveTo(27.400002, 56.799995, 28.2, 56.599995, 28.7, 56.299995);
((GeneralPath)shape).curveTo(29.0, 56.099995, 29.2, 55.799995, 29.2, 55.299995);
((GeneralPath)shape).curveTo(29.2, 54.999996, 29.2, 54.799995, 29.1, 54.499996);
((GeneralPath)shape).curveTo(29.1, 54.399998, 28.9, 53.799995, 28.4, 52.899998);
((GeneralPath)shape).lineTo(26.9, 49.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.1, 47.7);
((GeneralPath)shape).lineTo(21.7, 37.9);
((GeneralPath)shape).lineTo(17.2, 47.7);
((GeneralPath)shape).lineTo(26.1, 47.7);
((GeneralPath)shape).closePath();
paint = new Color(114, 145, 161, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(62.1, 38.6);
((GeneralPath)shape).lineTo(57.899998, 52.6);
((GeneralPath)shape).lineTo(57.499996, 54.3);
((GeneralPath)shape).curveTo(57.499996, 54.5, 57.399998, 54.7, 57.399998, 54.8);
((GeneralPath)shape).curveTo(57.399998, 55.0, 57.499996, 55.1, 57.6, 55.2);
((GeneralPath)shape).curveTo(57.699997, 55.3, 57.8, 55.4, 58.0, 55.4);
((GeneralPath)shape).curveTo(58.3, 55.4, 58.7, 55.2, 59.3, 54.7);
((GeneralPath)shape).curveTo(59.5, 54.5, 60.0, 53.9, 60.899998, 52.8);
((GeneralPath)shape).lineTo(61.699997, 53.2);
((GeneralPath)shape).curveTo(60.699997, 55.0, 59.6, 56.3, 58.399998, 57.2);
((GeneralPath)shape).curveTo(57.199997, 58.0, 55.999996, 58.4, 54.6, 58.4);
((GeneralPath)shape).curveTo(53.8, 58.4, 53.1, 58.2, 52.699997, 57.800003);
((GeneralPath)shape).curveTo(52.299995, 57.4, 51.999996, 56.9, 51.999996, 56.200005);
((GeneralPath)shape).curveTo(51.999996, 55.700005, 52.199997, 54.600006, 52.699997, 53.200005);
((GeneralPath)shape).lineTo(53.199997, 51.500004);
((GeneralPath)shape).curveTo(51.499996, 54.300003, 49.899998, 56.300003, 48.399998, 57.400005);
((GeneralPath)shape).curveTo(47.499996, 58.100006, 46.499996, 58.400005, 45.499996, 58.400005);
((GeneralPath)shape).curveTo(44.199997, 58.400005, 43.199997, 57.900005, 42.599995, 56.800007);
((GeneralPath)shape).curveTo(41.999996, 55.70001, 41.699993, 54.600006, 41.699993, 53.20001);
((GeneralPath)shape).curveTo(41.699993, 51.20001, 42.29999, 49.000008, 43.599995, 46.40001);
((GeneralPath)shape).curveTo(44.899998, 43.80001, 46.499996, 41.80001, 48.499996, 40.20001);
((GeneralPath)shape).curveTo(50.199997, 38.90001, 51.699997, 38.300007, 53.199997, 38.300007);
((GeneralPath)shape).curveTo(53.999996, 38.300007, 54.699997, 38.500008, 55.199997, 39.000008);
((GeneralPath)shape).curveTo(55.699997, 39.500008, 56.1, 40.300007, 56.299995, 41.500008);
((GeneralPath)shape).lineTo(57.099995, 38.90001);
((GeneralPath)shape).lineTo(62.099995, 38.60001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(55.1, 42.6);
((GeneralPath)shape).curveTo(55.1, 41.5, 54.899998, 40.6, 54.6, 40.1);
((GeneralPath)shape).curveTo(54.3, 39.699997, 54.0, 39.6, 53.5, 39.6);
((GeneralPath)shape).curveTo(53.1, 39.6, 52.6, 39.8, 52.1, 40.199997);
((GeneralPath)shape).curveTo(51.1, 41.1, 50.1, 42.799995, 49.0, 45.499996);
((GeneralPath)shape).curveTo(47.9, 48.199997, 47.3, 50.399998, 47.3, 52.399998);
((GeneralPath)shape).curveTo(47.3, 53.1, 47.399998, 53.699997, 47.7, 53.999996);
((GeneralPath)shape).curveTo(48.0, 54.299995, 48.2, 54.499996, 48.5, 54.499996);
((GeneralPath)shape).curveTo(49.2, 54.499996, 49.8, 54.099995, 50.5, 53.399998);
((GeneralPath)shape).curveTo(51.5, 52.399998, 52.3, 51.1, 53.1, 49.6);
((GeneralPath)shape).curveTo(54.399998, 47.0, 55.1, 44.699997, 55.1, 42.6);
((GeneralPath)shape).closePath();
paint = new Color(54, 69, 77, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.7, 82.3);
((GeneralPath)shape).curveTo(9.7, 80.3, 10.0, 78.600006, 10.599999, 77.200005);
((GeneralPath)shape).curveTo(11.099999, 76.200005, 11.7, 75.3, 12.499999, 74.50001);
((GeneralPath)shape).curveTo(13.299999, 73.700005, 14.099999, 73.100006, 15.099998, 72.700005);
((GeneralPath)shape).curveTo(16.3, 72.200005, 17.8, 71.9, 19.399998, 71.9);
((GeneralPath)shape).curveTo(22.299997, 71.9, 24.699997, 72.8, 26.499998, 74.6);
((GeneralPath)shape).curveTo(28.299997, 76.4, 29.099998, 78.9, 29.099998, 82.2);
((GeneralPath)shape).curveTo(29.099998, 85.399994, 28.199999, 87.899994, 26.499998, 89.7);
((GeneralPath)shape).curveTo(24.699999, 91.5, 22.399998, 92.399994, 19.499998, 92.399994);
((GeneralPath)shape).curveTo(16.499998, 92.399994, 14.199998, 91.49999, 12.399998, 89.7);
((GeneralPath)shape).curveTo(10.5999975, 87.899994, 9.699998, 85.399994, 9.699998, 82.299995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(13.799999, 82.100006);
((GeneralPath)shape).curveTo(13.799999, 84.3, 14.299999, 86.100006, 15.4, 87.200005);
((GeneralPath)shape).curveTo(16.4, 88.4, 17.8, 88.9, 19.4, 88.9);
((GeneralPath)shape).curveTo(21.0, 88.9, 22.3, 88.3, 23.4, 87.200005);
((GeneralPath)shape).curveTo(24.5, 86.100006, 24.9, 84.3, 24.9, 82.00001);
((GeneralPath)shape).curveTo(24.9, 79.700005, 24.4, 78.00001, 23.4, 76.90001);
((GeneralPath)shape).curveTo(22.4, 75.80001, 21.1, 75.20001, 19.4, 75.20001);
((GeneralPath)shape).curveTo(17.699999, 75.20001, 16.4, 75.80001, 15.4, 76.90001);
((GeneralPath)shape).curveTo(14.299999, 78.100006, 13.799999, 79.80001, 13.799999, 82.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.699997, 92.100006);
((GeneralPath)shape).lineTo(36.699997, 75.6);
((GeneralPath)shape).lineTo(30.799997, 75.6);
((GeneralPath)shape).lineTo(30.799997, 72.2);
((GeneralPath)shape).lineTo(46.699997, 72.2);
((GeneralPath)shape).lineTo(46.699997, 75.6);
((GeneralPath)shape).lineTo(40.799995, 75.6);
((GeneralPath)shape).lineTo(40.799995, 92.1);
((GeneralPath)shape).lineTo(36.699997, 92.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.199997, 92.100006);
((GeneralPath)shape).lineTo(49.199997, 72.2);
((GeneralPath)shape).lineTo(62.899998, 72.2);
((GeneralPath)shape).lineTo(62.899998, 75.6);
((GeneralPath)shape).lineTo(53.199997, 75.6);
((GeneralPath)shape).lineTo(53.199997, 80.299995);
((GeneralPath)shape).lineTo(61.499996, 80.299995);
((GeneralPath)shape).lineTo(61.499996, 83.7);
((GeneralPath)shape).lineTo(53.199997, 83.7);
((GeneralPath)shape).lineTo(53.199997, 92.1);
((GeneralPath)shape).lineTo(49.199997, 92.1);
((GeneralPath)shape).closePath();
paint = new Color(76, 98, 123, 255);
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
	private ext_otf() {
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
       ext_otf base = new ext_otf();
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
       ext_otf base = new ext_otf();
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
        return ext_otf::new;
    }
}

