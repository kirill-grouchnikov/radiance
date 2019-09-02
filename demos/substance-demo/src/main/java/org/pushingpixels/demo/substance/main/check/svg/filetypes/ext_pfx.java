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
public class ext_pfx implements ResizableIcon {
    

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
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.3, 91.9);
((GeneralPath)shape).lineTo(11.3, 71.9);
((GeneralPath)shape).lineTo(17.8, 71.9);
((GeneralPath)shape).curveTo(20.3, 71.9, 21.9, 72.0, 22.599998, 72.200005);
((GeneralPath)shape).curveTo(23.699999, 72.50001, 24.699999, 73.200005, 25.499998, 74.200005);
((GeneralPath)shape).curveTo(26.299997, 75.200005, 26.699999, 76.50001, 26.699999, 78.100006);
((GeneralPath)shape).curveTo(26.699999, 79.3, 26.499998, 80.40001, 25.999998, 81.200005);
((GeneralPath)shape).curveTo(25.599998, 82.00001, 24.999998, 82.700005, 24.299997, 83.200005);
((GeneralPath)shape).curveTo(23.599997, 83.700005, 22.899998, 84.00001, 22.199997, 84.200005);
((GeneralPath)shape).curveTo(21.199997, 84.4, 19.799997, 84.50001, 17.999996, 84.50001);
((GeneralPath)shape).lineTo(15.399996, 84.50001);
((GeneralPath)shape).lineTo(15.399996, 92.100006);
((GeneralPath)shape).lineTo(11.299995, 92.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.4, 75.2);
((GeneralPath)shape).lineTo(15.4, 80.899994);
((GeneralPath)shape).lineTo(17.6, 80.899994);
((GeneralPath)shape).curveTo(19.2, 80.899994, 20.300001, 80.799995, 20.800001, 80.59999);
((GeneralPath)shape).curveTo(21.300001, 80.399994, 21.800001, 80.09999, 22.1, 79.59999);
((GeneralPath)shape).curveTo(22.4, 79.19999, 22.6, 78.59999, 22.6, 77.99999);
((GeneralPath)shape).curveTo(22.6, 77.299995, 22.4, 76.69999, 22.0, 76.19999);
((GeneralPath)shape).curveTo(21.6, 75.69999, 21.0, 75.39999, 20.4, 75.29999);
((GeneralPath)shape).curveTo(19.9, 75.19999, 18.9, 75.19999, 17.5, 75.19999);
((GeneralPath)shape).lineTo(15.4, 75.19999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.0, 91.9);
((GeneralPath)shape).lineTo(30.0, 71.9);
((GeneralPath)shape).lineTo(43.7, 71.9);
((GeneralPath)shape).lineTo(43.7, 75.3);
((GeneralPath)shape).lineTo(34.0, 75.3);
((GeneralPath)shape).lineTo(34.0, 80.0);
((GeneralPath)shape).lineTo(42.4, 80.0);
((GeneralPath)shape).lineTo(42.4, 83.4);
((GeneralPath)shape).lineTo(34.0, 83.4);
((GeneralPath)shape).lineTo(34.0, 91.9);
((GeneralPath)shape).lineTo(30.0, 91.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.1, 91.9);
((GeneralPath)shape).lineTo(51.899998, 81.4);
((GeneralPath)shape).lineTo(45.699997, 71.8);
((GeneralPath)shape).lineTo(50.399998, 71.8);
((GeneralPath)shape).lineTo(54.399998, 78.200005);
((GeneralPath)shape).lineTo(58.3, 71.8);
((GeneralPath)shape).lineTo(63.0, 71.8);
((GeneralPath)shape).lineTo(56.8, 81.5);
((GeneralPath)shape).lineTo(63.6, 91.8);
((GeneralPath)shape).lineTo(58.699997, 91.8);
((GeneralPath)shape).lineTo(54.4, 85.0);
((GeneralPath)shape).lineTo(49.9, 91.9);
((GeneralPath)shape).lineTo(45.100002, 91.9);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -952.3619995117188f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.4, 978.9);
((GeneralPath)shape).curveTo(38.5, 982.0, 39.5, 986.4, 38.300003, 990.4);
((GeneralPath)shape).lineTo(54.800003, 1006.9);
((GeneralPath)shape).lineTo(55.200005, 1014.30005);
((GeneralPath)shape).lineTo(45.900005, 1013.50006);
((GeneralPath)shape).lineTo(45.900005, 1008.80005);
((GeneralPath)shape).lineTo(41.200005, 1008.80005);
((GeneralPath)shape).lineTo(41.200005, 1004.10004);
((GeneralPath)shape).lineTo(36.500004, 1004.10004);
((GeneralPath)shape).lineTo(30.500004, 998.10004);
((GeneralPath)shape).curveTo(26.600004, 999.30005, 22.100004, 998.30005, 19.000004, 995.2);
((GeneralPath)shape).curveTo(14.500004, 990.7, 14.500004, 983.4, 19.000004, 978.9);
((GeneralPath)shape).curveTo(23.600004, 974.4, 30.900003, 974.4, 35.4, 978.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.800001, 982.0);
((GeneralPath)shape).curveTo(26.177185, 981.3759, 25.3317, 981.0252, 24.45, 981.0252);
((GeneralPath)shape).curveTo(23.568304, 981.0252, 22.722818, 981.3759, 22.100002, 982.0);
((GeneralPath)shape).curveTo(21.475904, 982.6228, 21.125183, 983.4683, 21.125183, 984.35);
((GeneralPath)shape).curveTo(21.125183, 985.2317, 21.475904, 986.0772, 22.100002, 986.7);
((GeneralPath)shape).curveTo(23.400002, 988.0, 25.500002, 988.0, 26.800003, 986.7);
((GeneralPath)shape).curveTo(28.100002, 985.4, 28.100002, 983.3, 26.800003, 982.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.444000244140625, 1014.3270263671875), new Point2D.Double(35.444000244140625, 975.551025390625), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5_0);
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
	private ext_pfx() {
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
       ext_pfx base = new ext_pfx();
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
       ext_pfx base = new ext_pfx();
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
        return ext_pfx::new;
    }
}

