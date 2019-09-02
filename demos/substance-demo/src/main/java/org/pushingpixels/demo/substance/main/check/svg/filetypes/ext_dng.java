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
public class ext_dng implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(7.2, 71.2);
((GeneralPath)shape).lineTo(14.6, 71.2);
((GeneralPath)shape).curveTo(16.300001, 71.2, 17.5, 71.299995, 18.4, 71.6);
((GeneralPath)shape).curveTo(19.6, 71.9, 20.6, 72.6, 21.4, 73.4);
((GeneralPath)shape).curveTo(22.199999, 74.3, 22.9, 75.3, 23.3, 76.6);
((GeneralPath)shape).curveTo(23.699999, 77.9, 24.0, 79.4, 24.0, 81.299995);
((GeneralPath)shape).curveTo(24.0, 82.899994, 23.8, 84.299995, 23.4, 85.49999);
((GeneralPath)shape).curveTo(22.9, 86.899994, 22.199999, 88.09999, 21.3, 88.99999);
((GeneralPath)shape).curveTo(20.599998, 89.69999, 19.699999, 90.19999, 18.5, 90.59999);
((GeneralPath)shape).curveTo(17.6, 90.899994, 16.4, 90.99999, 14.9, 90.99999);
((GeneralPath)shape).lineTo(7.2, 90.99999);
((GeneralPath)shape).lineTo(7.2, 71.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(11.2, 74.6);
((GeneralPath)shape).lineTo(11.2, 87.7);
((GeneralPath)shape).lineTo(14.2, 87.7);
((GeneralPath)shape).curveTo(15.3, 87.7, 16.1, 87.6, 16.6, 87.5);
((GeneralPath)shape).curveTo(17.300001, 87.3, 17.800001, 87.1, 18.2, 86.7);
((GeneralPath)shape).curveTo(18.6, 86.299995, 19.0, 85.7, 19.300001, 84.799995);
((GeneralPath)shape).curveTo(19.600002, 83.899994, 19.7, 82.7, 19.7, 81.2);
((GeneralPath)shape).curveTo(19.7, 79.7, 19.6, 78.5, 19.300001, 77.7);
((GeneralPath)shape).curveTo(19.000002, 76.899994, 18.6, 76.2, 18.2, 75.799995);
((GeneralPath)shape).curveTo(17.7, 75.299995, 17.1, 74.99999, 16.300001, 74.899994);
((GeneralPath)shape).curveTo(15.700001, 74.799995, 14.600001, 74.7, 13.000001, 74.7);
((GeneralPath)shape).lineTo(11.200001, 74.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.400002, 91.1);
((GeneralPath)shape).lineTo(27.400002, 71.2);
((GeneralPath)shape).lineTo(31.300001, 71.2);
((GeneralPath)shape).lineTo(39.5, 84.399994);
((GeneralPath)shape).lineTo(39.5, 71.2);
((GeneralPath)shape).lineTo(43.2, 71.2);
((GeneralPath)shape).lineTo(43.2, 91.0);
((GeneralPath)shape).lineTo(39.2, 91.0);
((GeneralPath)shape).lineTo(31.1, 78.1);
((GeneralPath)shape).lineTo(31.1, 91.0);
((GeneralPath)shape).lineTo(27.4, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(56.800003, 83.799995);
((GeneralPath)shape).lineTo(56.800003, 80.49999);
((GeneralPath)shape).lineTo(65.5, 80.49999);
((GeneralPath)shape).lineTo(65.5, 88.399994);
((GeneralPath)shape).curveTo(64.7, 89.2, 63.4, 89.899994, 61.8, 90.49999);
((GeneralPath)shape).curveTo(60.2, 91.09999, 58.6, 91.399994, 56.899998, 91.399994);
((GeneralPath)shape).curveTo(54.8, 91.399994, 52.999996, 90.99999, 51.399998, 90.09999);
((GeneralPath)shape).curveTo(49.999996, 89.19999, 48.8, 87.99999, 47.999996, 86.399994);
((GeneralPath)shape).curveTo(47.199997, 84.799995, 46.799995, 82.99999, 46.799995, 81.09999);
((GeneralPath)shape).curveTo(46.799995, 78.99999, 47.199997, 77.19999, 48.099995, 75.59999);
((GeneralPath)shape).curveTo(48.999992, 73.99999, 50.199993, 72.79999, 51.899994, 71.899994);
((GeneralPath)shape).curveTo(53.199993, 71.2, 54.799995, 70.899994, 56.699993, 70.899994);
((GeneralPath)shape).curveTo(59.199993, 70.899994, 61.099995, 71.399994, 62.499992, 72.399994);
((GeneralPath)shape).curveTo(63.89999, 73.399994, 64.799995, 74.899994, 65.19999, 76.7);
((GeneralPath)shape).lineTo(61.19999, 77.399994);
((GeneralPath)shape).curveTo(60.89999, 76.399994, 60.39999, 75.7, 59.59999, 75.09999);
((GeneralPath)shape).curveTo(58.79999, 74.49999, 57.89999, 74.29999, 56.69999, 74.29999);
((GeneralPath)shape).curveTo(54.89999, 74.29999, 53.49999, 74.89999, 52.49999, 75.999985);
((GeneralPath)shape).curveTo(51.49999, 77.09998, 50.89999, 78.79999, 50.89999, 80.89999);
((GeneralPath)shape).curveTo(50.89999, 83.29999, 51.39999, 84.999985, 52.49999, 86.19999);
((GeneralPath)shape).curveTo(53.599987, 87.399994, 55.0, 88.0, 56.7, 88.0);
((GeneralPath)shape).curveTo(57.5, 88.0, 58.4, 87.8, 59.2, 87.5);
((GeneralPath)shape).curveTo(60.0, 87.2, 60.8, 86.8, 61.4, 86.3);
((GeneralPath)shape).lineTo(61.4, 83.8);
((GeneralPath)shape).lineTo(56.800003, 83.8);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {new Color(214, 237, 232, 255),new Color(211, 235, 230, 255),new Color(199, 227, 223, 255),new Color(183, 216, 213, 255),new Color(160, 203, 201, 255),new Color(132, 186, 185, 255),new Color(98, 167, 167, 255),new Color(52, 147, 148, 255),new Color(0, 127, 127, 255),new Color(0, 107, 106, 255),new Color(0, 107, 105, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
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
g.setTransform(defaultTransform__0_2_1);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(62.7, 56.8);
((GeneralPath)shape).curveTo(61.100002, 56.0, 58.100002, 50.2, 53.5, 49.8);
((GeneralPath)shape).curveTo(49.5, 49.5, 44.4, 48.0, 41.6, 47.8);
((GeneralPath)shape).curveTo(38.1, 42.0, 32.1, 32.8, 27.099998, 27.9);
((GeneralPath)shape).lineTo(40.899998, 28.6);
((GeneralPath)shape).curveTo(37.2, 19.8, 27.7, 23.0, 27.7, 23.0);
((GeneralPath)shape).lineTo(34.100002, 17.7);
((GeneralPath)shape).curveTo(25.900002, 14.400001, 22.500002, 22.400002, 22.500002, 22.400002);
((GeneralPath)shape).curveTo(14.000002, 17.7, 9.600002, 25.7, 9.600002, 25.7);
((GeneralPath)shape).lineTo(18.400002, 26.300001);
((GeneralPath)shape).curveTo(8.4, 29.1, 11.2, 39.0, 11.2, 39.0);
((GeneralPath)shape).lineTo(20.099998, 31.0);
((GeneralPath)shape).curveTo(18.199999, 35.4, 22.399998, 38.5, 22.399998, 38.5);
((GeneralPath)shape).lineTo(25.0, 27.7);
((GeneralPath)shape).curveTo(25.0, 27.7, 34.3, 38.300003, 37.2, 49.1);
((GeneralPath)shape).curveTo(33.5, 51.0, 27.7, 54.1, 23.2, 54.699997);
((GeneralPath)shape).curveTo(17.0, 55.499996, 9.700001, 59.699997, 9.700001, 59.699997);
((GeneralPath)shape).lineTo(9.700001, 64.6);
((GeneralPath)shape).lineTo(62.8, 64.6);
((GeneralPath)shape).lineTo(62.7, 56.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.25, 37.35300064086914), new Point2D.Double(36.25, 85.16100311279297), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
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
	private ext_dng() {
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
       ext_dng base = new ext_dng();
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
       ext_dng base = new ext_dng();
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
        return ext_dng::new;
    }
}

