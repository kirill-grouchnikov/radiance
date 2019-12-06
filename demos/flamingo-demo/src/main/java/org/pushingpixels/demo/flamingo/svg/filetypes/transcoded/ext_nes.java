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
public class ext_nes implements ResizableIcon {
    

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
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
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
((GeneralPath)shape).moveTo(9.3, 91.9);
((GeneralPath)shape).lineTo(9.3, 71.9);
((GeneralPath)shape).lineTo(13.200001, 71.9);
((GeneralPath)shape).lineTo(21.400002, 85.3);
((GeneralPath)shape).lineTo(21.400002, 71.8);
((GeneralPath)shape).lineTo(25.2, 71.8);
((GeneralPath)shape).lineTo(25.2, 91.8);
((GeneralPath)shape).lineTo(21.1, 91.8);
((GeneralPath)shape).lineTo(13.0, 78.7);
((GeneralPath)shape).lineTo(13.0, 91.799995);
((GeneralPath)shape).lineTo(9.3, 91.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.5, 91.9);
((GeneralPath)shape).lineTo(29.5, 71.9);
((GeneralPath)shape).lineTo(44.4, 71.9);
((GeneralPath)shape).lineTo(44.4, 75.3);
((GeneralPath)shape).lineTo(33.5, 75.3);
((GeneralPath)shape).lineTo(33.5, 79.700005);
((GeneralPath)shape).lineTo(43.6, 79.700005);
((GeneralPath)shape).lineTo(43.6, 83.100006);
((GeneralPath)shape).lineTo(33.5, 83.100006);
((GeneralPath)shape).lineTo(33.5, 88.600006);
((GeneralPath)shape).lineTo(44.7, 88.600006);
((GeneralPath)shape).lineTo(44.7, 92.0);
((GeneralPath)shape).lineTo(29.5, 92.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.1, 85.4);
((GeneralPath)shape).lineTo(51.0, 85.0);
((GeneralPath)shape).curveTo(51.2, 86.3, 51.7, 87.3, 52.4, 87.9);
((GeneralPath)shape).curveTo(53.100002, 88.5, 54.100002, 88.8, 55.300003, 88.8);
((GeneralPath)shape).curveTo(56.600002, 88.8, 57.600002, 88.5, 58.200005, 88.0);
((GeneralPath)shape).curveTo(58.900005, 87.4, 59.200005, 86.8, 59.200005, 86.1);
((GeneralPath)shape).curveTo(59.200005, 85.6, 59.100006, 85.2, 58.800003, 84.9);
((GeneralPath)shape).curveTo(58.500004, 84.6, 58.000004, 84.3, 57.300003, 84.0);
((GeneralPath)shape).curveTo(56.800003, 83.8, 55.700005, 83.5, 54.100002, 83.1);
((GeneralPath)shape).curveTo(51.9, 82.6, 50.4, 81.9, 49.500004, 81.1);
((GeneralPath)shape).curveTo(48.300003, 80.0, 47.700005, 78.7, 47.700005, 77.1);
((GeneralPath)shape).curveTo(47.700005, 76.1, 48.000004, 75.1, 48.600006, 74.2);
((GeneralPath)shape).curveTo(49.200005, 73.299995, 50.000008, 72.6, 51.100006, 72.2);
((GeneralPath)shape).curveTo(52.200005, 71.7, 53.500008, 71.5, 55.000008, 71.5);
((GeneralPath)shape).curveTo(57.500008, 71.5, 59.40001, 72.1, 60.70001, 73.2);
((GeneralPath)shape).curveTo(62.000008, 74.299995, 62.60001, 75.799995, 62.70001, 77.6);
((GeneralPath)shape).lineTo(58.70001, 77.799995);
((GeneralPath)shape).curveTo(58.500008, 76.799995, 58.20001, 75.99999, 57.60001, 75.6);
((GeneralPath)shape).curveTo(57.00001, 75.1, 56.20001, 74.9, 55.00001, 74.9);
((GeneralPath)shape).curveTo(53.80001, 74.9, 52.900013, 75.1, 52.200012, 75.6);
((GeneralPath)shape).curveTo(51.80001, 75.9, 51.600014, 76.299995, 51.600014, 76.799995);
((GeneralPath)shape).curveTo(51.600014, 77.299995, 51.800014, 77.7, 52.200012, 77.99999);
((GeneralPath)shape).curveTo(52.700012, 78.399994, 54.00001, 78.899994, 55.900013, 79.299995);
((GeneralPath)shape).curveTo(57.800014, 79.7, 59.300014, 80.2, 60.300014, 80.7);
((GeneralPath)shape).curveTo(61.300014, 81.2, 62.000015, 81.899994, 62.500015, 82.7);
((GeneralPath)shape).curveTo(63.000015, 83.5, 63.300014, 84.6, 63.300014, 85.899994);
((GeneralPath)shape).curveTo(63.300014, 86.99999, 63.000015, 88.09999, 62.300014, 89.09999);
((GeneralPath)shape).curveTo(61.700016, 90.09999, 60.800014, 90.79999, 59.600014, 91.29999);
((GeneralPath)shape).curveTo(58.400013, 91.79999, 57.000015, 91.999985, 55.200012, 91.999985);
((GeneralPath)shape).curveTo(52.700012, 91.999985, 50.700012, 91.39999, 49.400013, 90.19998);
((GeneralPath)shape).curveTo(48.200012, 89.29998, 47.400013, 87.59998, 47.100014, 85.39998);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.3, 31.3);
((GeneralPath)shape).lineTo(23.2, 31.3);
((GeneralPath)shape).lineTo(23.2, 34.899998);
((GeneralPath)shape).lineTo(17.800001, 34.899998);
((GeneralPath)shape).lineTo(17.800001, 36.0);
((GeneralPath)shape).lineTo(15.0, 36.0);
((GeneralPath)shape).lineTo(15.0, 37.0);
((GeneralPath)shape).lineTo(17.8, 37.0);
((GeneralPath)shape).lineTo(17.8, 38.3);
((GeneralPath)shape).lineTo(23.199999, 38.3);
((GeneralPath)shape).lineTo(23.199999, 44.6);
((GeneralPath)shape).lineTo(17.8, 44.6);
((GeneralPath)shape).lineTo(17.8, 45.899998);
((GeneralPath)shape).lineTo(15.0, 45.899998);
((GeneralPath)shape).lineTo(15.0, 46.899998);
((GeneralPath)shape).lineTo(17.8, 46.899998);
((GeneralPath)shape).lineTo(17.8, 48.0);
((GeneralPath)shape).lineTo(23.199999, 48.0);
((GeneralPath)shape).lineTo(23.199999, 54.7);
((GeneralPath)shape).lineTo(17.8, 54.7);
((GeneralPath)shape).lineTo(17.8, 55.9);
((GeneralPath)shape).lineTo(15.0, 55.9);
((GeneralPath)shape).lineTo(15.0, 56.9);
((GeneralPath)shape).lineTo(17.8, 56.9);
((GeneralPath)shape).lineTo(17.8, 58.100002);
((GeneralPath)shape).lineTo(23.199999, 58.100002);
((GeneralPath)shape).lineTo(23.199999, 63.0);
((GeneralPath)shape).lineTo(49.3, 63.0);
((GeneralPath)shape).lineTo(49.3, 58.1);
((GeneralPath)shape).lineTo(54.2, 58.1);
((GeneralPath)shape).lineTo(54.2, 56.899998);
((GeneralPath)shape).lineTo(57.0, 56.899998);
((GeneralPath)shape).lineTo(57.0, 55.899998);
((GeneralPath)shape).lineTo(54.2, 55.899998);
((GeneralPath)shape).lineTo(54.2, 54.699997);
((GeneralPath)shape).lineTo(49.3, 54.699997);
((GeneralPath)shape).lineTo(49.3, 48.0);
((GeneralPath)shape).lineTo(54.2, 48.0);
((GeneralPath)shape).lineTo(54.2, 46.9);
((GeneralPath)shape).lineTo(57.0, 46.9);
((GeneralPath)shape).lineTo(57.0, 45.9);
((GeneralPath)shape).lineTo(54.2, 45.9);
((GeneralPath)shape).lineTo(54.2, 44.600002);
((GeneralPath)shape).lineTo(49.3, 44.600002);
((GeneralPath)shape).lineTo(49.3, 38.300003);
((GeneralPath)shape).lineTo(54.2, 38.300003);
((GeneralPath)shape).lineTo(54.2, 37.0);
((GeneralPath)shape).lineTo(57.0, 37.0);
((GeneralPath)shape).lineTo(57.0, 36.0);
((GeneralPath)shape).lineTo(54.2, 36.0);
((GeneralPath)shape).lineTo(54.2, 34.9);
((GeneralPath)shape).lineTo(49.3, 34.9);
((GeneralPath)shape).lineTo(49.3, 31.300001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(44.3, 39.9);
((GeneralPath)shape).curveTo(43.2, 39.9, 42.3, 39.0, 42.3, 37.9);
((GeneralPath)shape).curveTo(42.3, 36.800003, 43.2, 35.9, 44.3, 35.9);
((GeneralPath)shape).curveTo(45.399998, 35.9, 46.3, 36.800003, 46.3, 37.9);
((GeneralPath)shape).curveTo(46.3, 39.0, 45.399998, 39.9, 44.3, 39.9);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 63.0), new Point2D.Double(36.0, 31.28700065612793), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_nes() {
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
       ext_nes base = new ext_nes();
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
       ext_nes base = new ext_nes();
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
        return ext_nes::new;
    }
}

