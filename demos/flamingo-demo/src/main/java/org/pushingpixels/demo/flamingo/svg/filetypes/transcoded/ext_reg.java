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
public class ext_reg implements ResizableIcon {
    

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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.0f,0.124f,0.262f,0.41f,0.571f,0.752f,1.0f}, new Color[] {new Color(0, 107, 105, 255),new Color(0, 128, 127, 255),new Color(0, 147, 147, 255),new Color(0, 163, 163, 255),new Color(0, 176, 175, 255),new Color(8, 184, 183, 255),new Color(20, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.5, 56.2);
((GeneralPath)shape).lineTo(17.5, 51.4);
((GeneralPath)shape).lineTo(27.0, 51.4);
((GeneralPath)shape).lineTo(27.0, 61.0);
((GeneralPath)shape).lineTo(17.4, 61.0);
((GeneralPath)shape).lineTo(17.4, 56.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(31.8, 56.2);
((GeneralPath)shape).lineTo(31.8, 51.4);
((GeneralPath)shape).lineTo(41.4, 51.4);
((GeneralPath)shape).lineTo(41.4, 61.0);
((GeneralPath)shape).lineTo(31.800001, 61.0);
((GeneralPath)shape).lineTo(31.800001, 56.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.1, 56.2);
((GeneralPath)shape).lineTo(46.1, 51.4);
((GeneralPath)shape).lineTo(55.699997, 51.4);
((GeneralPath)shape).lineTo(55.699997, 61.0);
((GeneralPath)shape).lineTo(46.1, 61.0);
((GeneralPath)shape).lineTo(46.1, 56.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.5, 45.300003);
((GeneralPath)shape).lineTo(44.1, 42.0);
((GeneralPath)shape).lineTo(47.399998, 38.6);
((GeneralPath)shape).lineTo(50.8, 35.3);
((GeneralPath)shape).lineTo(54.2, 38.6);
((GeneralPath)shape).lineTo(57.5, 42.0);
((GeneralPath)shape).lineTo(54.2, 45.3);
((GeneralPath)shape).curveTo(52.4, 47.2, 50.8, 48.7, 50.8, 48.7);
((GeneralPath)shape).curveTo(50.8, 48.7, 49.3, 47.2, 47.5, 45.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(17.5, 42.000004);
((GeneralPath)shape).lineTo(17.5, 37.200005);
((GeneralPath)shape).lineTo(27.0, 37.200005);
((GeneralPath)shape).lineTo(27.0, 46.800003);
((GeneralPath)shape).lineTo(17.4, 46.800003);
((GeneralPath)shape).lineTo(17.4, 42.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(31.8, 42.000004);
((GeneralPath)shape).lineTo(31.8, 37.200005);
((GeneralPath)shape).lineTo(41.4, 37.200005);
((GeneralPath)shape).lineTo(41.4, 46.800003);
((GeneralPath)shape).lineTo(31.800001, 46.800003);
((GeneralPath)shape).lineTo(31.800001, 42.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.2, 31.000004);
((GeneralPath)shape).lineTo(29.900002, 27.700005);
((GeneralPath)shape).lineTo(33.2, 24.300005);
((GeneralPath)shape).lineTo(36.600002, 21.000006);
((GeneralPath)shape).lineTo(40.000004, 24.300005);
((GeneralPath)shape).lineTo(43.300003, 27.700005);
((GeneralPath)shape).lineTo(39.9, 31.000004);
((GeneralPath)shape).curveTo(38.100002, 32.900005, 36.5, 34.400005, 36.5, 34.400005);
((GeneralPath)shape).curveTo(36.5, 34.400005, 35.0, 32.9, 33.2, 31.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(17.5, 27.700005);
((GeneralPath)shape).lineTo(17.5, 22.900005);
((GeneralPath)shape).lineTo(27.0, 22.900005);
((GeneralPath)shape).lineTo(27.0, 32.500008);
((GeneralPath)shape).lineTo(17.4, 32.500008);
((GeneralPath)shape).lineTo(17.4, 27.700008);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(37.5, 61.0), new Point2D.Double(37.5, 21.0), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.0, 91.1);
((GeneralPath)shape).lineTo(8.0, 71.2);
((GeneralPath)shape).lineTo(16.5, 71.2);
((GeneralPath)shape).curveTo(18.6, 71.2, 20.2, 71.399994, 21.2, 71.7);
((GeneralPath)shape).curveTo(22.2, 72.0, 22.900002, 72.7, 23.5, 73.6);
((GeneralPath)shape).curveTo(24.1, 74.5, 24.4, 75.6, 24.4, 76.7);
((GeneralPath)shape).curveTo(24.4, 78.2, 24.0, 79.399994, 23.1, 80.399994);
((GeneralPath)shape).curveTo(22.2, 81.399994, 20.9, 81.99999, 19.1, 82.2);
((GeneralPath)shape).curveTo(20.0, 82.7, 20.7, 83.299995, 21.300001, 83.899994);
((GeneralPath)shape).curveTo(21.900002, 84.49999, 22.6, 85.59999, 23.6, 87.09999);
((GeneralPath)shape).lineTo(26.0, 91.0);
((GeneralPath)shape).lineTo(21.2, 91.0);
((GeneralPath)shape).lineTo(18.300001, 86.7);
((GeneralPath)shape).curveTo(17.300001, 85.2, 16.6, 84.2, 16.2, 83.799995);
((GeneralPath)shape).curveTo(15.800001, 83.399994, 15.400001, 83.1, 15.000001, 82.99999);
((GeneralPath)shape).curveTo(14.600001, 82.899994, 13.900001, 82.799995, 13.000001, 82.799995);
((GeneralPath)shape).lineTo(12.000001, 82.799995);
((GeneralPath)shape).lineTo(12.000001, 91.1);
((GeneralPath)shape).lineTo(8.0, 91.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.0, 79.6);
((GeneralPath)shape).lineTo(15.0, 79.6);
((GeneralPath)shape).curveTo(16.9, 79.6, 18.1, 79.5, 18.6, 79.4);
((GeneralPath)shape).curveTo(19.1, 79.3, 19.5, 79.0, 19.7, 78.6);
((GeneralPath)shape).curveTo(20.0, 78.2, 20.1, 77.7, 20.1, 77.1);
((GeneralPath)shape).curveTo(20.1, 76.4, 19.9, 75.9, 19.6, 75.5);
((GeneralPath)shape).curveTo(19.2, 75.1, 18.7, 74.8, 18.1, 74.7);
((GeneralPath)shape).curveTo(17.800001, 74.7, 16.800001, 74.6, 15.200001, 74.6);
((GeneralPath)shape).lineTo(12.0, 74.6);
((GeneralPath)shape).lineTo(12.0, 79.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.1, 91.1);
((GeneralPath)shape).lineTo(28.1, 71.2);
((GeneralPath)shape).lineTo(43.0, 71.2);
((GeneralPath)shape).lineTo(43.0, 74.6);
((GeneralPath)shape).lineTo(32.2, 74.6);
((GeneralPath)shape).lineTo(32.2, 79.0);
((GeneralPath)shape).lineTo(42.2, 79.0);
((GeneralPath)shape).lineTo(42.2, 82.3);
((GeneralPath)shape).lineTo(32.2, 82.3);
((GeneralPath)shape).lineTo(32.2, 87.700005);
((GeneralPath)shape).lineTo(43.4, 87.700005);
((GeneralPath)shape).lineTo(43.4, 91.0);
((GeneralPath)shape).lineTo(28.1, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(56.1, 83.799995);
((GeneralPath)shape).lineTo(56.1, 80.49999);
((GeneralPath)shape).lineTo(64.799995, 80.49999);
((GeneralPath)shape).lineTo(64.799995, 88.399994);
((GeneralPath)shape).curveTo(63.999996, 89.2, 62.699997, 89.899994, 61.099995, 90.49999);
((GeneralPath)shape).curveTo(59.499996, 91.09999, 57.899994, 91.399994, 56.199993, 91.399994);
((GeneralPath)shape).curveTo(54.099995, 91.399994, 52.29999, 90.99999, 50.699993, 90.09999);
((GeneralPath)shape).curveTo(49.099995, 89.19999, 48.0, 88.0, 47.2, 86.4);
((GeneralPath)shape).curveTo(46.4, 84.8, 46.0, 83.0, 46.0, 81.1);
((GeneralPath)shape).curveTo(46.0, 79.0, 46.4, 77.2, 47.3, 75.6);
((GeneralPath)shape).curveTo(48.199997, 74.0, 49.399998, 72.799995, 51.1, 71.9);
((GeneralPath)shape).curveTo(52.399998, 71.200005, 54.0, 70.9, 55.899998, 70.9);
((GeneralPath)shape).curveTo(58.399998, 70.9, 60.3, 71.4, 61.699997, 72.4);
((GeneralPath)shape).curveTo(63.099995, 73.4, 63.999996, 74.9, 64.399994, 76.700005);
((GeneralPath)shape).lineTo(60.399994, 77.4);
((GeneralPath)shape).curveTo(60.099995, 76.4, 59.599995, 75.700005, 58.799995, 75.1);
((GeneralPath)shape).curveTo(57.999996, 74.5, 57.099995, 74.299995, 55.899994, 74.299995);
((GeneralPath)shape).curveTo(54.099995, 74.299995, 52.699993, 74.899994, 51.699993, 75.99999);
((GeneralPath)shape).curveTo(50.699993, 77.09999, 50.099995, 78.799995, 50.099995, 80.899994);
((GeneralPath)shape).curveTo(50.099995, 83.299995, 50.599995, 84.99999, 51.699993, 86.2);
((GeneralPath)shape).curveTo(52.79999, 87.4, 54.099995, 88.0, 55.79999, 88.0);
((GeneralPath)shape).curveTo(56.59999, 88.0, 57.499992, 87.8, 58.29999, 87.5);
((GeneralPath)shape).curveTo(59.09999, 87.2, 59.89999, 86.8, 60.499992, 86.3);
((GeneralPath)shape).lineTo(60.499992, 83.8);
((GeneralPath)shape).lineTo(56.09999, 83.8);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {new Color(214, 237, 232, 255),new Color(211, 235, 230, 255),new Color(199, 227, 223, 255),new Color(183, 216, 213, 255),new Color(160, 203, 201, 255),new Color(132, 186, 185, 255),new Color(98, 167, 167, 255),new Color(52, 147, 148, 255),new Color(0, 127, 127, 255),new Color(0, 107, 106, 255),new Color(0, 107, 105, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_3_1);
g.setTransform(defaultTransform__0_3);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.13300000131130219;
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
		return 0.7379999160766602;
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
	private ext_reg() {
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
       ext_reg base = new ext_reg();
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
       ext_reg base = new ext_reg();
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
        return ext_reg::new;
    }
}

