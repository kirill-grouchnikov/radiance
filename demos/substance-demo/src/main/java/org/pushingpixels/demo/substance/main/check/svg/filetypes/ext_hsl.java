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
public class ext_hsl implements ResizableIcon {
    

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
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
((GeneralPath)shape).moveTo(10.6, 90.1);
((GeneralPath)shape).lineTo(10.6, 70.2);
((GeneralPath)shape).lineTo(14.700001, 70.2);
((GeneralPath)shape).lineTo(14.700001, 78.0);
((GeneralPath)shape).lineTo(22.7, 78.0);
((GeneralPath)shape).lineTo(22.7, 70.2);
((GeneralPath)shape).lineTo(26.800001, 70.2);
((GeneralPath)shape).lineTo(26.800001, 90.0);
((GeneralPath)shape).lineTo(22.7, 90.0);
((GeneralPath)shape).lineTo(22.7, 81.3);
((GeneralPath)shape).lineTo(14.700001, 81.3);
((GeneralPath)shape).lineTo(14.700001, 90.0);
((GeneralPath)shape).lineTo(10.6, 90.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.800001, 83.6);
((GeneralPath)shape).lineTo(33.800003, 83.2);
((GeneralPath)shape).curveTo(34.000004, 84.5, 34.500004, 85.5, 35.200005, 86.1);
((GeneralPath)shape).curveTo(35.900005, 86.7, 36.900005, 87.0, 38.100006, 87.0);
((GeneralPath)shape).curveTo(39.400005, 87.0, 40.400005, 86.7, 41.100006, 86.2);
((GeneralPath)shape).curveTo(41.800007, 85.7, 42.100006, 85.0, 42.100006, 84.299995);
((GeneralPath)shape).curveTo(42.100006, 83.799995, 42.000008, 83.399994, 41.700005, 83.1);
((GeneralPath)shape).curveTo(41.400005, 82.799995, 40.900005, 82.5, 40.200005, 82.2);
((GeneralPath)shape).curveTo(39.700005, 82.0, 38.600006, 81.7, 36.900005, 81.299995);
((GeneralPath)shape).curveTo(34.700005, 80.799995, 33.200005, 80.1, 32.300007, 79.299995);
((GeneralPath)shape).curveTo(31.100006, 78.2, 30.400007, 76.899994, 30.400007, 75.299995);
((GeneralPath)shape).curveTo(30.400007, 74.299995, 30.700006, 73.299995, 31.300007, 72.49999);
((GeneralPath)shape).curveTo(31.900007, 71.59999, 32.70001, 70.99999, 33.800007, 70.49999);
((GeneralPath)shape).curveTo(34.900005, 69.99999, 36.20001, 69.799995, 37.800007, 69.799995);
((GeneralPath)shape).curveTo(40.300007, 69.799995, 42.20001, 70.299995, 43.500008, 71.399994);
((GeneralPath)shape).curveTo(44.800007, 72.49999, 45.40001, 73.899994, 45.500008, 75.799995);
((GeneralPath)shape).lineTo(41.40001, 75.99999);
((GeneralPath)shape).curveTo(41.20001, 74.99999, 40.90001, 74.19999, 40.30001, 73.799995);
((GeneralPath)shape).curveTo(39.700012, 73.399994, 38.90001, 73.1, 37.700012, 73.1);
((GeneralPath)shape).curveTo(36.50001, 73.1, 35.600014, 73.299995, 34.900013, 73.799995);
((GeneralPath)shape).curveTo(34.50001, 74.1, 34.300014, 74.49999, 34.300014, 74.99999);
((GeneralPath)shape).curveTo(34.300014, 75.49999, 34.500015, 75.899994, 34.900013, 76.19999);
((GeneralPath)shape).curveTo(35.400013, 76.59999, 36.700012, 77.09999, 38.600014, 77.49999);
((GeneralPath)shape).curveTo(40.500015, 77.899994, 42.000015, 78.399994, 43.000015, 78.899994);
((GeneralPath)shape).curveTo(43.900017, 79.399994, 44.700016, 80.09999, 45.200016, 80.899994);
((GeneralPath)shape).curveTo(45.700016, 81.7, 46.000015, 82.799995, 46.000015, 84.09999);
((GeneralPath)shape).curveTo(46.000015, 85.19999, 45.700016, 86.29999, 45.000015, 87.29999);
((GeneralPath)shape).curveTo(44.400017, 88.29999, 43.500015, 88.999985, 42.300014, 89.499985);
((GeneralPath)shape).curveTo(41.100014, 89.999985, 39.700016, 90.19998, 37.900013, 90.19998);
((GeneralPath)shape).curveTo(35.400013, 90.19998, 33.400013, 89.59998, 32.00001, 88.499985);
((GeneralPath)shape).curveTo(30.60001, 87.39999, 30.100012, 85.79999, 29.80001, 83.59998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.7, 90.1);
((GeneralPath)shape).lineTo(49.7, 70.4);
((GeneralPath)shape).lineTo(53.8, 70.4);
((GeneralPath)shape).lineTo(53.8, 86.7);
((GeneralPath)shape).lineTo(63.9, 86.7);
((GeneralPath)shape).lineTo(63.9, 90.0);
((GeneralPath)shape).lineTo(49.7, 90.0);
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
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.5, 58.5);
((GeneralPath)shape).lineTo(25.8, 43.0);
((GeneralPath)shape).lineTo(15.5, 27.5);
((GeneralPath)shape).lineTo(23.2, 27.5);
((GeneralPath)shape).lineTo(33.6, 43.0);
((GeneralPath)shape).lineTo(23.2, 58.5);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(15.461999893188477, 43.0), new Point2D.Double(33.58399963378906, 43.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.8, 58.5);
((GeneralPath)shape).lineTo(36.2, 43.0);
((GeneralPath)shape).lineTo(25.8, 27.5);
((GeneralPath)shape).lineTo(33.6, 27.5);
((GeneralPath)shape).lineTo(54.3, 58.5);
((GeneralPath)shape).lineTo(46.5, 58.5);
((GeneralPath)shape).lineTo(40.1, 48.8);
((GeneralPath)shape).lineTo(33.6, 58.5);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(25.827999114990234, 43.0), new Point2D.Double(54.316001892089844, 43.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(50.8, 49.5);
((GeneralPath)shape).lineTo(47.399998, 44.3);
((GeneralPath)shape).lineTo(59.5, 44.3);
((GeneralPath)shape).lineTo(59.5, 49.5);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(47.38100051879883, 46.87799835205078), new Point2D.Double(59.46200180053711, 46.87799835205078), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.7, 41.7);
((GeneralPath)shape).lineTo(42.2, 36.5);
((GeneralPath)shape).lineTo(59.5, 36.5);
((GeneralPath)shape).lineTo(59.5, 41.7);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(42.23500061035156, 39.12200164794922), new Point2D.Double(59.46200180053711, 39.12200164794922), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6_3);
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
	private ext_hsl() {
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
       ext_hsl base = new ext_hsl();
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
       ext_hsl base = new ext_hsl();
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
        return ext_hsl::new;
    }
}

