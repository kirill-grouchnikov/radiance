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
public class ext_cptx implements ResizableIcon {
    

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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0), new Point2D.Double(36.0, 3.003999948501587), new float[] {0.118f,1.0f}, new Color[] {new Color(102, 226, 131, 255),new Color(36, 52, 45, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(36, 52, 45, 255);
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
((GeneralPath)shape).moveTo(17.5, 85.3);
((GeneralPath)shape).lineTo(20.6, 86.3);
((GeneralPath)shape).curveTo(20.1, 88.0, 19.300001, 89.3, 18.2, 90.100006);
((GeneralPath)shape).curveTo(17.1, 90.90001, 15.700001, 91.40001, 13.900001, 91.40001);
((GeneralPath)shape).curveTo(11.800001, 91.40001, 10.0, 90.70001, 8.700001, 89.30001);
((GeneralPath)shape).curveTo(7.3000007, 87.90001, 6.600001, 85.90001, 6.600001, 83.40001);
((GeneralPath)shape).curveTo(6.600001, 80.80001, 7.3000007, 78.70001, 8.700001, 77.30001);
((GeneralPath)shape).curveTo(10.1, 75.90001, 11.900001, 75.10001, 14.1, 75.10001);
((GeneralPath)shape).curveTo(16.1, 75.10001, 17.7, 75.70001, 18.900002, 76.80001);
((GeneralPath)shape).curveTo(19.600002, 77.50001, 20.2, 78.40001, 20.500002, 79.70001);
((GeneralPath)shape).lineTo(17.300001, 80.500015);
((GeneralPath)shape).curveTo(17.1, 79.70001, 16.7, 79.000015, 16.1, 78.60001);
((GeneralPath)shape).curveTo(15.5, 78.20001, 14.8, 77.90002, 13.900001, 77.90002);
((GeneralPath)shape).curveTo(12.700001, 77.90002, 11.700001, 78.30002, 11.0, 79.20002);
((GeneralPath)shape).curveTo(10.299999, 80.10002, 10.0, 81.20002, 10.0, 83.10002);
((GeneralPath)shape).curveTo(10.0, 85.10002, 10.4, 86.50002, 11.1, 87.400024);
((GeneralPath)shape).curveTo(11.8, 88.20003, 12.8, 88.70003, 13.900001, 88.70003);
((GeneralPath)shape).curveTo(14.8, 88.70003, 15.500001, 88.400024, 16.1, 87.900024);
((GeneralPath)shape).curveTo(16.7, 87.400024, 17.300001, 86.400024, 17.5, 85.300026);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.4, 91.100006);
((GeneralPath)shape).lineTo(23.4, 75.3);
((GeneralPath)shape).lineTo(28.599998, 75.3);
((GeneralPath)shape).curveTo(30.599998, 75.3, 31.8, 75.4, 32.399998, 75.5);
((GeneralPath)shape).curveTo(33.3, 75.7, 34.1, 76.3, 34.699997, 77.0);
((GeneralPath)shape).curveTo(35.299995, 77.8, 35.6, 78.8, 35.6, 80.1);
((GeneralPath)shape).curveTo(35.6, 81.1, 35.399998, 81.9, 35.1, 82.5);
((GeneralPath)shape).curveTo(34.8, 83.1, 34.3, 83.7, 33.699997, 84.1);
((GeneralPath)shape).curveTo(33.1, 84.5, 32.6, 84.7, 31.999996, 84.799995);
((GeneralPath)shape).curveTo(31.199997, 84.99999, 30.099997, 84.99999, 28.599997, 84.99999);
((GeneralPath)shape).lineTo(26.499996, 84.99999);
((GeneralPath)shape).lineTo(26.499996, 90.899994);
((GeneralPath)shape).lineTo(23.399996, 90.899994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.7, 78.0);
((GeneralPath)shape).lineTo(26.7, 82.5);
((GeneralPath)shape).lineTo(28.5, 82.5);
((GeneralPath)shape).curveTo(29.8, 82.5, 30.6, 82.4, 31.1, 82.3);
((GeneralPath)shape).curveTo(31.6, 82.200005, 31.9, 81.9, 32.1, 81.5);
((GeneralPath)shape).curveTo(32.299995, 81.1, 32.5, 80.7, 32.5, 80.3);
((GeneralPath)shape).curveTo(32.5, 79.700005, 32.3, 79.3, 32.0, 78.9);
((GeneralPath)shape).curveTo(31.7, 78.5, 31.2, 78.3, 30.7, 78.200005);
((GeneralPath)shape).curveTo(30.2, 78.00001, 29.400002, 78.00001, 28.2, 78.00001);
((GeneralPath)shape).lineTo(26.7, 78.00001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.0, 91.1);
((GeneralPath)shape).lineTo(42.0, 78.0);
((GeneralPath)shape).lineTo(37.2, 78.0);
((GeneralPath)shape).lineTo(37.2, 75.3);
((GeneralPath)shape).lineTo(49.9, 75.3);
((GeneralPath)shape).lineTo(49.9, 78.0);
((GeneralPath)shape).lineTo(45.2, 78.0);
((GeneralPath)shape).lineTo(45.2, 91.1);
((GeneralPath)shape).lineTo(42.0, 91.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.4, 91.1);
((GeneralPath)shape).lineTo(55.9, 82.9);
((GeneralPath)shape).lineTo(50.9, 75.4);
((GeneralPath)shape).lineTo(54.7, 75.4);
((GeneralPath)shape).lineTo(57.9, 80.5);
((GeneralPath)shape).lineTo(61.0, 75.4);
((GeneralPath)shape).lineTo(64.7, 75.4);
((GeneralPath)shape).lineTo(59.699997, 83.0);
((GeneralPath)shape).lineTo(65.2, 91.1);
((GeneralPath)shape).lineTo(61.299995, 91.1);
((GeneralPath)shape).lineTo(57.699997, 85.7);
((GeneralPath)shape).lineTo(54.1, 91.1);
((GeneralPath)shape).lineTo(50.399998, 91.1);
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
paint = new LinearGradientPaint(new Point2D.Double(36.625, 1015.3619995117188), new Point2D.Double(36.625, 974.6119995117188), new float[] {0.05f,0.283f,0.4f,0.969f,0.974f}, new Color[] {new Color(71, 133, 85, 255),new Color(63, 118, 76, 255),new Color(58, 108, 70, 255),new Color(31, 61, 38, 255),new Color(31, 61, 38, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.625, 1015.8619995117188), new Point2D.Double(36.625, 974.1119995117188), new float[] {0.05f,0.283f,0.4f,0.969f,0.974f}, new Color[] {new Color(71, 133, 85, 255),new Color(63, 118, 76, 255),new Color(58, 108, 70, 255),new Color(31, 61, 38, 255),new Color(31, 61, 38, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
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
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
paint = new LinearGradientPaint(new Point2D.Double(45.178001403808594, 74.15899658203125), new Point2D.Double(58.77199935913086, 87.75299835205078), new float[] {0.0f,0.128f,0.274f,0.429f,0.59f,0.732f,1.0f}, new Color[] {new Color(210, 224, 213, 255),new Color(205, 224, 209, 255),new Color(191, 224, 199, 255),new Color(168, 225, 181, 255),new Color(137, 225, 157, 255),new Color(102, 226, 131, 255),new Color(36, 52, 45, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new Color(36, 52, 45, 255);
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
	private ext_cptx() {
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
       ext_cptx base = new ext_cptx();
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
       ext_cptx base = new ext_cptx();
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
        return ext_cptx::new;
    }
}

