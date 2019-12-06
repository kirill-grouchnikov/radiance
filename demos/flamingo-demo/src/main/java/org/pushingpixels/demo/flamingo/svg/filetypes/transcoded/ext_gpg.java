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
public class ext_gpg implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(16.5, 84.5);
((GeneralPath)shape).lineTo(16.5, 81.1);
((GeneralPath)shape).lineTo(25.2, 81.1);
((GeneralPath)shape).lineTo(25.2, 89.1);
((GeneralPath)shape).curveTo(24.400002, 89.9, 23.1, 90.6, 21.5, 91.299995);
((GeneralPath)shape).curveTo(19.9, 91.899994, 18.3, 92.2, 16.6, 92.2);
((GeneralPath)shape).curveTo(14.5, 92.2, 12.700001, 91.799995, 11.1, 90.899994);
((GeneralPath)shape).curveTo(9.5, 89.99999, 8.400001, 88.799995, 7.6000004, 87.09999);
((GeneralPath)shape).curveTo(6.8, 85.49999, 6.4000006, 83.69999, 6.4000006, 81.79999);
((GeneralPath)shape).curveTo(6.4000006, 79.69999, 6.8000007, 77.89999, 7.700001, 76.19999);
((GeneralPath)shape).curveTo(8.6, 74.49999, 9.900001, 73.29999, 11.500001, 72.49999);
((GeneralPath)shape).curveTo(12.800001, 71.799995, 14.400002, 71.49999, 16.300001, 71.49999);
((GeneralPath)shape).curveTo(18.800001, 71.49999, 20.7, 71.99999, 22.100002, 73.09999);
((GeneralPath)shape).curveTo(23.500002, 74.09999, 24.400002, 75.59999, 24.800003, 77.399994);
((GeneralPath)shape).lineTo(20.800003, 78.2);
((GeneralPath)shape).curveTo(20.500004, 77.2, 20.000004, 76.399994, 19.200003, 75.899994);
((GeneralPath)shape).curveTo(18.400002, 75.399994, 17.600002, 74.99999, 16.400003, 74.99999);
((GeneralPath)shape).curveTo(14.600003, 74.99999, 13.200004, 75.59999, 12.200004, 76.69999);
((GeneralPath)shape).curveTo(11.200004, 77.79999, 10.600003, 79.49999, 10.600003, 81.69999);
((GeneralPath)shape).curveTo(10.600003, 84.09999, 11.100003, 85.89999, 12.200004, 87.09999);
((GeneralPath)shape).curveTo(13.300004, 88.29999, 14.600004, 88.899994, 16.400003, 88.899994);
((GeneralPath)shape).curveTo(17.200003, 88.899994, 18.100004, 88.7, 18.900003, 88.399994);
((GeneralPath)shape).curveTo(19.800003, 88.09999, 20.500004, 87.7, 21.100004, 87.2);
((GeneralPath)shape).lineTo(21.100004, 84.7);
((GeneralPath)shape).lineTo(16.500004, 84.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.9, 91.9);
((GeneralPath)shape).lineTo(28.9, 71.9);
((GeneralPath)shape).lineTo(35.4, 71.9);
((GeneralPath)shape).curveTo(37.9, 71.9, 39.5, 72.0, 40.2, 72.200005);
((GeneralPath)shape).curveTo(41.3, 72.50001, 42.3, 73.200005, 43.100002, 74.200005);
((GeneralPath)shape).curveTo(43.900005, 75.200005, 44.300003, 76.50001, 44.300003, 78.100006);
((GeneralPath)shape).curveTo(44.300003, 79.3, 44.100002, 80.40001, 43.600002, 81.200005);
((GeneralPath)shape).curveTo(43.100002, 82.0, 42.600002, 82.700005, 41.9, 83.200005);
((GeneralPath)shape).curveTo(41.2, 83.700005, 40.5, 84.00001, 39.800003, 84.200005);
((GeneralPath)shape).curveTo(38.800003, 84.4, 37.4, 84.50001, 35.600002, 84.50001);
((GeneralPath)shape).lineTo(33.0, 84.50001);
((GeneralPath)shape).lineTo(33.0, 92.100006);
((GeneralPath)shape).lineTo(28.9, 92.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.0, 75.2);
((GeneralPath)shape).lineTo(33.0, 80.899994);
((GeneralPath)shape).lineTo(35.2, 80.899994);
((GeneralPath)shape).curveTo(36.8, 80.899994, 37.9, 80.799995, 38.4, 80.59999);
((GeneralPath)shape).curveTo(38.9, 80.39999, 39.4, 80.09999, 39.7, 79.59999);
((GeneralPath)shape).curveTo(40.0, 79.09999, 40.2, 78.59999, 40.2, 77.99999);
((GeneralPath)shape).curveTo(40.2, 77.299995, 40.0, 76.69999, 39.600002, 76.19999);
((GeneralPath)shape).curveTo(39.200005, 75.69999, 38.600002, 75.39999, 38.000004, 75.29999);
((GeneralPath)shape).curveTo(37.500004, 75.19999, 36.500004, 75.19999, 35.100002, 75.19999);
((GeneralPath)shape).lineTo(33.0, 75.19999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(56.9, 84.5);
((GeneralPath)shape).lineTo(56.9, 81.1);
((GeneralPath)shape).lineTo(65.6, 81.1);
((GeneralPath)shape).lineTo(65.6, 89.1);
((GeneralPath)shape).curveTo(64.799995, 89.9, 63.5, 90.6, 61.899998, 91.299995);
((GeneralPath)shape).curveTo(60.299995, 91.99999, 58.699997, 92.2, 56.999996, 92.2);
((GeneralPath)shape).curveTo(54.899998, 92.2, 53.099995, 91.799995, 51.499996, 90.899994);
((GeneralPath)shape).curveTo(49.899998, 89.99999, 48.799995, 88.799995, 47.999996, 87.09999);
((GeneralPath)shape).curveTo(47.199997, 85.39999, 46.799995, 83.69999, 46.799995, 81.79999);
((GeneralPath)shape).curveTo(46.799995, 79.69999, 47.199997, 77.89999, 48.099995, 76.19999);
((GeneralPath)shape).curveTo(48.999992, 74.49999, 50.299995, 73.29999, 51.899994, 72.49999);
((GeneralPath)shape).curveTo(53.199993, 71.799995, 54.799995, 71.49999, 56.699993, 71.49999);
((GeneralPath)shape).curveTo(59.199993, 71.49999, 61.099995, 71.99999, 62.499992, 73.09999);
((GeneralPath)shape).curveTo(63.89999, 74.19999, 64.799995, 75.59999, 65.19999, 77.399994);
((GeneralPath)shape).lineTo(61.19999, 78.2);
((GeneralPath)shape).curveTo(60.89999, 77.2, 60.39999, 76.399994, 59.59999, 75.899994);
((GeneralPath)shape).curveTo(58.79999, 75.399994, 58.0, 75.0, 56.9, 75.0);
((GeneralPath)shape).curveTo(55.100002, 75.0, 53.7, 75.6, 52.7, 76.7);
((GeneralPath)shape).curveTo(51.7, 77.799995, 51.100002, 79.5, 51.100002, 81.7);
((GeneralPath)shape).curveTo(51.100002, 84.1, 51.600002, 85.899994, 52.7, 87.1);
((GeneralPath)shape).curveTo(53.8, 88.3, 55.100002, 88.9, 56.9, 88.9);
((GeneralPath)shape).curveTo(57.7, 88.9, 58.600002, 88.700005, 59.4, 88.4);
((GeneralPath)shape).curveTo(60.2, 88.1, 61.0, 87.700005, 61.600002, 87.200005);
((GeneralPath)shape).lineTo(61.600002, 84.700005);
((GeneralPath)shape).lineTo(56.9, 84.700005);
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
	private ext_gpg() {
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
       ext_gpg base = new ext_gpg();
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
       ext_gpg base = new ext_gpg();
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
        return ext_gpg::new;
    }
}

