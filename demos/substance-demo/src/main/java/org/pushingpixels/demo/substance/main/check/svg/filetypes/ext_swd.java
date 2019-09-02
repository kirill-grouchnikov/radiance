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
public class ext_swd implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(4.5, 84.6);
((GeneralPath)shape).lineTo(8.5, 84.2);
((GeneralPath)shape).curveTo(8.7, 85.5, 9.2, 86.5, 10.0, 87.1);
((GeneralPath)shape).curveTo(10.7, 87.7, 11.7, 88.0, 13.0, 88.0);
((GeneralPath)shape).curveTo(14.3, 88.0, 15.3, 87.7, 16.0, 87.2);
((GeneralPath)shape).curveTo(16.7, 86.7, 17.0, 86.0, 17.0, 85.299995);
((GeneralPath)shape).curveTo(17.0, 84.799995, 16.9, 84.399994, 16.6, 84.1);
((GeneralPath)shape).curveTo(16.300001, 83.799995, 15.8, 83.5, 15.1, 83.2);
((GeneralPath)shape).curveTo(14.6, 83.0, 13.5, 82.7, 11.8, 82.299995);
((GeneralPath)shape).curveTo(9.6, 81.799995, 8.1, 81.1, 7.2000003, 80.299995);
((GeneralPath)shape).curveTo(6.0, 79.2, 5.3, 77.899994, 5.3, 76.299995);
((GeneralPath)shape).curveTo(5.3, 75.299995, 5.6000004, 74.299995, 6.2000003, 73.49999);
((GeneralPath)shape).curveTo(6.8, 72.59999, 7.6000004, 71.99999, 8.700001, 71.49999);
((GeneralPath)shape).curveTo(9.800001, 70.99999, 11.1, 70.799995, 12.700001, 70.799995);
((GeneralPath)shape).curveTo(15.200001, 70.799995, 17.1, 71.299995, 18.400002, 72.399994);
((GeneralPath)shape).curveTo(19.7, 73.49999, 20.400002, 74.899994, 20.400002, 76.799995);
((GeneralPath)shape).lineTo(16.300001, 76.99999);
((GeneralPath)shape).curveTo(16.1, 75.99999, 15.800001, 75.19999, 15.200001, 74.799995);
((GeneralPath)shape).curveTo(14.6, 74.399994, 13.800001, 74.1, 12.6, 74.1);
((GeneralPath)shape).curveTo(11.400001, 74.1, 10.5, 74.299995, 9.8, 74.799995);
((GeneralPath)shape).curveTo(9.400001, 75.1, 9.2, 75.49999, 9.2, 75.99999);
((GeneralPath)shape).curveTo(9.2, 76.49999, 9.4, 76.899994, 9.8, 77.19999);
((GeneralPath)shape).curveTo(10.3, 77.59999, 11.6, 78.09999, 13.5, 78.49999);
((GeneralPath)shape).curveTo(15.4, 78.899994, 16.9, 79.399994, 17.9, 79.899994);
((GeneralPath)shape).curveTo(18.9, 80.399994, 19.6, 81.09999, 20.1, 81.899994);
((GeneralPath)shape).curveTo(20.6, 82.799995, 20.9, 83.799995, 20.9, 85.09999);
((GeneralPath)shape).curveTo(20.9, 86.19999, 20.6, 87.29999, 19.9, 88.29999);
((GeneralPath)shape).curveTo(19.3, 89.29999, 18.3, 89.999985, 17.199999, 90.499985);
((GeneralPath)shape).curveTo(16.099998, 90.999985, 14.599998, 91.19998, 12.799999, 91.19998);
((GeneralPath)shape).curveTo(10.199999, 91.19998, 8.299999, 90.59998, 6.899999, 89.499985);
((GeneralPath)shape).curveTo(5.5999994, 88.499985, 4.799999, 86.79999, 4.499999, 84.59998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.2, 91.1);
((GeneralPath)shape).lineTo(22.400002, 71.3);
((GeneralPath)shape).lineTo(26.600002, 71.3);
((GeneralPath)shape).lineTo(29.600002, 84.9);
((GeneralPath)shape).lineTo(33.300003, 71.3);
((GeneralPath)shape).lineTo(38.100002, 71.3);
((GeneralPath)shape).lineTo(41.600002, 85.200005);
((GeneralPath)shape).lineTo(44.7, 71.3);
((GeneralPath)shape).lineTo(48.8, 71.3);
((GeneralPath)shape).lineTo(44.0, 91.1);
((GeneralPath)shape).lineTo(39.7, 91.1);
((GeneralPath)shape).lineTo(35.7, 76.299995);
((GeneralPath)shape).lineTo(31.7, 91.1);
((GeneralPath)shape).lineTo(27.2, 91.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.9, 71.2);
((GeneralPath)shape).lineTo(58.300003, 71.2);
((GeneralPath)shape).curveTo(60.000004, 71.2, 61.300003, 71.299995, 62.100002, 71.6);
((GeneralPath)shape).curveTo(63.300003, 71.9, 64.3, 72.6, 65.100006, 73.4);
((GeneralPath)shape).curveTo(65.90001, 74.200005, 66.600006, 75.3, 67.00001, 76.6);
((GeneralPath)shape).curveTo(67.40001, 77.9, 67.700005, 79.4, 67.700005, 81.299995);
((GeneralPath)shape).curveTo(67.700005, 82.899994, 67.50001, 84.299995, 67.100006, 85.49999);
((GeneralPath)shape).curveTo(66.600006, 86.899994, 65.90001, 88.09999, 64.90001, 88.99999);
((GeneralPath)shape).curveTo(64.20001, 89.69999, 63.20001, 90.19999, 62.000008, 90.59999);
((GeneralPath)shape).curveTo(61.100006, 90.899994, 59.90001, 90.99999, 58.40001, 90.99999);
((GeneralPath)shape).lineTo(50.70001, 90.99999);
((GeneralPath)shape).lineTo(50.70001, 71.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(55.0, 74.6);
((GeneralPath)shape).lineTo(55.0, 87.7);
((GeneralPath)shape).lineTo(58.0, 87.7);
((GeneralPath)shape).curveTo(59.1, 87.7, 60.0, 87.6, 60.5, 87.5);
((GeneralPath)shape).curveTo(61.2, 87.3, 61.7, 87.1, 62.1, 86.7);
((GeneralPath)shape).curveTo(62.499996, 86.299995, 62.899998, 85.7, 63.199997, 84.799995);
((GeneralPath)shape).curveTo(63.499996, 83.899994, 63.6, 82.7, 63.6, 81.2);
((GeneralPath)shape).curveTo(63.6, 79.7, 63.5, 78.5, 63.199997, 77.7);
((GeneralPath)shape).curveTo(62.899994, 76.899994, 62.499996, 76.2, 61.999996, 75.799995);
((GeneralPath)shape).curveTo(61.499996, 75.299995, 60.899998, 74.99999, 60.099995, 74.899994);
((GeneralPath)shape).curveTo(59.499996, 74.799995, 58.399994, 74.7, 56.799995, 74.7);
((GeneralPath)shape).lineTo(55.0, 74.7);
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
	private ext_swd() {
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
       ext_swd base = new ext_swd();
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
       ext_swd base = new ext_swd();
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
        return ext_swd::new;
    }
}

