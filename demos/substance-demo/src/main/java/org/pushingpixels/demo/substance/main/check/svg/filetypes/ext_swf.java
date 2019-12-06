package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_swf implements ResizableIcon {
    

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
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(-0.2, 99.0);
((GeneralPath)shape).lineTo(-0.2, 1.0);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0), new Point2D.Double(36.0, 3.003999948501587), new float[] {0.0f,0.531f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(249, 177, 178, 255),new Color(209, 4, 7, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(-0.2, 99.0);
((GeneralPath)shape).lineTo(-0.2, 1.0);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(209, 4, 7, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(-0.2, 99.0);
((GeneralPath)shape).lineTo(-0.2, 1.0);
((GeneralPath)shape).lineTo(45.1, 1.0);
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
((GeneralPath)shape).moveTo(6.1, 84.6);
((GeneralPath)shape).lineTo(10.1, 84.2);
((GeneralPath)shape).curveTo(10.3, 85.5, 10.8, 86.5, 11.6, 87.1);
((GeneralPath)shape).curveTo(12.3, 87.7, 13.3, 88.0, 14.6, 88.0);
((GeneralPath)shape).curveTo(15.900001, 88.0, 16.9, 87.7, 17.6, 87.2);
((GeneralPath)shape).curveTo(18.300001, 86.7, 18.6, 86.0, 18.6, 85.299995);
((GeneralPath)shape).curveTo(18.6, 84.799995, 18.5, 84.399994, 18.2, 84.1);
((GeneralPath)shape).curveTo(17.900002, 83.799995, 17.400002, 83.5, 16.7, 83.2);
((GeneralPath)shape).curveTo(16.2, 83.0, 15.1, 82.7, 13.400001, 82.299995);
((GeneralPath)shape).curveTo(11.200001, 81.799995, 9.700001, 81.1, 8.800001, 80.299995);
((GeneralPath)shape).curveTo(7.6000013, 79.2, 6.900001, 77.899994, 6.900001, 76.299995);
((GeneralPath)shape).curveTo(6.900001, 75.299995, 7.2000012, 74.299995, 7.800001, 73.49999);
((GeneralPath)shape).curveTo(8.400002, 72.59999, 9.200001, 71.99999, 10.300001, 71.49999);
((GeneralPath)shape).curveTo(11.400002, 70.99999, 12.700001, 70.799995, 14.300001, 70.799995);
((GeneralPath)shape).curveTo(16.800001, 70.799995, 18.7, 71.299995, 20.0, 72.399994);
((GeneralPath)shape).curveTo(21.3, 73.49999, 22.0, 74.899994, 22.0, 76.799995);
((GeneralPath)shape).lineTo(17.9, 76.99999);
((GeneralPath)shape).curveTo(17.699999, 75.99999, 17.4, 75.19999, 16.8, 74.799995);
((GeneralPath)shape).curveTo(16.199999, 74.399994, 15.4, 74.1, 14.199999, 74.1);
((GeneralPath)shape).curveTo(12.999999, 74.1, 12.099998, 74.299995, 11.399999, 74.799995);
((GeneralPath)shape).curveTo(10.999999, 75.1, 10.799998, 75.49999, 10.799998, 75.99999);
((GeneralPath)shape).curveTo(10.799998, 76.49999, 10.999998, 76.899994, 11.399999, 77.19999);
((GeneralPath)shape).curveTo(11.899999, 77.59999, 13.199999, 78.09999, 15.099998, 78.49999);
((GeneralPath)shape).curveTo(16.999998, 78.899994, 18.499998, 79.399994, 19.499998, 79.899994);
((GeneralPath)shape).curveTo(20.499998, 80.399994, 21.199999, 81.09999, 21.699999, 81.899994);
((GeneralPath)shape).curveTo(22.199999, 82.799995, 22.499998, 83.799995, 22.499998, 85.09999);
((GeneralPath)shape).curveTo(22.499998, 86.19999, 22.199999, 87.29999, 21.499998, 88.29999);
((GeneralPath)shape).curveTo(20.899998, 89.29999, 19.899998, 89.999985, 18.799997, 90.499985);
((GeneralPath)shape).curveTo(17.699997, 90.999985, 16.199997, 91.19998, 14.399998, 91.19998);
((GeneralPath)shape).curveTo(11.799997, 91.19998, 9.899998, 90.59998, 8.499998, 89.499985);
((GeneralPath)shape).curveTo(7.199998, 88.499985, 6.2999983, 86.79999, 6.099998, 84.59998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.800001, 91.1);
((GeneralPath)shape).lineTo(24.0, 71.2);
((GeneralPath)shape).lineTo(28.2, 71.2);
((GeneralPath)shape).lineTo(31.2, 84.799995);
((GeneralPath)shape).lineTo(34.9, 71.2);
((GeneralPath)shape).lineTo(39.7, 71.2);
((GeneralPath)shape).lineTo(43.2, 85.1);
((GeneralPath)shape).lineTo(46.3, 71.2);
((GeneralPath)shape).lineTo(50.399998, 71.2);
((GeneralPath)shape).lineTo(45.5, 91.0);
((GeneralPath)shape).lineTo(41.2, 91.0);
((GeneralPath)shape).lineTo(37.2, 76.2);
((GeneralPath)shape).lineTo(33.2, 91.0);
((GeneralPath)shape).lineTo(28.800001, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.5, 91.1);
((GeneralPath)shape).lineTo(52.5, 71.2);
((GeneralPath)shape).lineTo(66.3, 71.2);
((GeneralPath)shape).lineTo(66.3, 74.6);
((GeneralPath)shape).lineTo(56.500004, 74.6);
((GeneralPath)shape).lineTo(56.500004, 79.299995);
((GeneralPath)shape).lineTo(65.0, 79.299995);
((GeneralPath)shape).lineTo(65.0, 82.7);
((GeneralPath)shape).lineTo(56.6, 82.7);
((GeneralPath)shape).lineTo(56.6, 91.1);
((GeneralPath)shape).lineTo(52.5, 91.1);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -952.3619995117188f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.6, 974.6);
((GeneralPath)shape).curveTo(25.3, 974.6, 16.199999, 983.69995, 16.199999, 995.0);
((GeneralPath)shape).curveTo(16.199999, 1006.3, 25.3, 1015.4, 36.6, 1015.4);
((GeneralPath)shape).curveTo(47.899998, 1015.4, 57.0, 1006.2, 57.0, 995.0);
((GeneralPath)shape).curveTo(57.0, 983.7, 47.9, 974.6, 36.6, 974.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(40.5, 979.39996);
((GeneralPath)shape).lineTo(37.2, 991.69995);
((GeneralPath)shape).lineTo(45.800003, 991.69995);
((GeneralPath)shape).lineTo(32.800003, 1010.49994);
((GeneralPath)shape).lineTo(36.100002, 998.19995);
((GeneralPath)shape).lineTo(27.500002, 998.19995);
((GeneralPath)shape).lineTo(40.5, 979.39996);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.625, 974.6119995117188), new Point2D.Double(36.625, 1015.3619995117188), new float[] {0.118f,1.0f}, new Color[] {new Color(249, 177, 178, 255),new Color(209, 4, 7, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3_0);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.178001403808594, 74.15899658203125), new Point2D.Double(58.77199935913086, 87.75299835205078), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(249, 177, 178, 255),new Color(209, 4, 7, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(209, 4, 7, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
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
        return 0.12799999117851257;
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
		return 0.7450000047683716;
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
	private ext_swf() {
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
       ext_swf base = new ext_swf();
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
       ext_swf base = new ext_swf();
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
        return ext_swf::new;
    }
}

