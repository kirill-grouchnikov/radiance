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
public class ext_asm implements ResizableIcon {
    

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
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.108001708984375, 3.003000020980835), new Point2D.Double(36.108001708984375, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
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
((GeneralPath)shape).moveTo(25.0, 91.1);
((GeneralPath)shape).lineTo(20.6, 91.1);
((GeneralPath)shape).lineTo(18.9, 86.6);
((GeneralPath)shape).lineTo(10.9, 86.6);
((GeneralPath)shape).lineTo(9.299999, 91.1);
((GeneralPath)shape).lineTo(5.0, 91.1);
((GeneralPath)shape).lineTo(12.8, 71.3);
((GeneralPath)shape).lineTo(17.0, 71.3);
((GeneralPath)shape).lineTo(25.0, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(17.6, 83.2);
((GeneralPath)shape).lineTo(14.8, 75.799995);
((GeneralPath)shape).lineTo(12.1, 83.2);
((GeneralPath)shape).lineTo(17.6, 83.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.2, 84.6);
((GeneralPath)shape).lineTo(30.1, 84.2);
((GeneralPath)shape).curveTo(30.300001, 85.5, 30.800001, 86.5, 31.5, 87.1);
((GeneralPath)shape).curveTo(32.2, 87.7, 33.2, 88.0, 34.4, 88.0);
((GeneralPath)shape).curveTo(35.7, 88.0, 36.7, 87.7, 37.300003, 87.2);
((GeneralPath)shape).curveTo(38.000004, 86.7, 38.300003, 86.0, 38.300003, 85.299995);
((GeneralPath)shape).curveTo(38.300003, 84.799995, 38.200005, 84.399994, 37.9, 84.1);
((GeneralPath)shape).curveTo(37.600002, 83.799995, 37.100002, 83.5, 36.4, 83.2);
((GeneralPath)shape).curveTo(35.9, 83.0, 34.9, 82.7, 33.2, 82.299995);
((GeneralPath)shape).curveTo(31.0, 81.799995, 29.5, 81.1, 28.6, 80.299995);
((GeneralPath)shape).curveTo(27.4, 79.2, 26.800001, 77.899994, 26.800001, 76.299995);
((GeneralPath)shape).curveTo(26.800001, 75.299995, 27.1, 74.299995, 27.7, 73.49999);
((GeneralPath)shape).curveTo(28.300001, 72.59999, 29.1, 71.99999, 30.2, 71.49999);
((GeneralPath)shape).curveTo(31.300001, 70.99999, 32.600002, 70.799995, 34.100002, 70.799995);
((GeneralPath)shape).curveTo(36.600002, 70.799995, 38.500004, 71.299995, 39.800003, 72.399994);
((GeneralPath)shape).curveTo(41.100002, 73.49999, 41.700005, 74.899994, 41.800003, 76.799995);
((GeneralPath)shape).lineTo(37.800003, 76.99999);
((GeneralPath)shape).curveTo(37.600002, 75.99999, 37.300003, 75.19999, 36.700005, 74.799995);
((GeneralPath)shape).curveTo(36.100006, 74.399994, 35.300003, 74.1, 34.100006, 74.1);
((GeneralPath)shape).curveTo(32.900005, 74.1, 32.000008, 74.299995, 31.300007, 74.799995);
((GeneralPath)shape).curveTo(30.900007, 75.1, 30.700006, 75.49999, 30.700006, 75.99999);
((GeneralPath)shape).curveTo(30.700006, 76.49999, 30.900007, 76.899994, 31.300007, 77.19999);
((GeneralPath)shape).curveTo(31.800007, 77.59999, 33.000008, 78.09999, 35.000008, 78.49999);
((GeneralPath)shape).curveTo(37.000008, 78.899994, 38.40001, 79.399994, 39.40001, 79.899994);
((GeneralPath)shape).curveTo(40.30001, 80.399994, 41.10001, 81.09999, 41.60001, 81.899994);
((GeneralPath)shape).curveTo(42.10001, 82.7, 42.40001, 83.799995, 42.40001, 85.09999);
((GeneralPath)shape).curveTo(42.40001, 86.19999, 42.10001, 87.29999, 41.40001, 88.29999);
((GeneralPath)shape).curveTo(40.80001, 89.29999, 39.90001, 89.999985, 38.70001, 90.499985);
((GeneralPath)shape).curveTo(37.500008, 90.999985, 36.10001, 91.19998, 34.40001, 91.19998);
((GeneralPath)shape).curveTo(31.90001, 91.19998, 29.90001, 90.59998, 28.60001, 89.499985);
((GeneralPath)shape).curveTo(27.20001, 88.499985, 26.40001, 86.79999, 26.20001, 84.59998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.7, 91.1);
((GeneralPath)shape).lineTo(45.7, 71.2);
((GeneralPath)shape).lineTo(51.7, 71.2);
((GeneralPath)shape).lineTo(55.3, 84.7);
((GeneralPath)shape).lineTo(59.0, 71.2);
((GeneralPath)shape).lineTo(65.0, 71.2);
((GeneralPath)shape).lineTo(65.0, 91.0);
((GeneralPath)shape).lineTo(61.3, 91.0);
((GeneralPath)shape).lineTo(61.3, 75.4);
((GeneralPath)shape).lineTo(57.3, 91.0);
((GeneralPath)shape).lineTo(53.399998, 91.0);
((GeneralPath)shape).lineTo(49.399998, 75.4);
((GeneralPath)shape).lineTo(49.399998, 91.0);
((GeneralPath)shape).lineTo(45.699997, 91.0);
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
((GeneralPath)shape).moveTo(15.0, 21.0);
((GeneralPath)shape).lineTo(52.0, 21.0);
((GeneralPath)shape).lineTo(52.0, 25.0);
((GeneralPath)shape).lineTo(15.0, 25.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(33.5, 25.0), new Point2D.Double(33.5, 21.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.0, 30.0);
((GeneralPath)shape).lineTo(59.0, 30.0);
((GeneralPath)shape).lineTo(59.0, 34.0);
((GeneralPath)shape).lineTo(22.0, 34.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(40.5, 34.0), new Point2D.Double(40.5, 30.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.0, 39.0);
((GeneralPath)shape).lineTo(52.0, 39.0);
((GeneralPath)shape).lineTo(52.0, 43.0);
((GeneralPath)shape).lineTo(15.0, 43.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(33.5, 43.0), new Point2D.Double(33.5, 39.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.0, 48.0);
((GeneralPath)shape).lineTo(59.0, 48.0);
((GeneralPath)shape).lineTo(59.0, 52.0);
((GeneralPath)shape).lineTo(22.0, 52.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(40.5, 52.0), new Point2D.Double(40.5, 48.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.0, 57.0);
((GeneralPath)shape).lineTo(50.0, 57.0);
((GeneralPath)shape).lineTo(50.0, 61.0);
((GeneralPath)shape).lineTo(13.0, 61.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(31.5, 61.0), new Point2D.Double(31.5, 57.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_9);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.13199996948242188;
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
	private ext_asm() {
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
       ext_asm base = new ext_asm();
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
       ext_asm base = new ext_asm();
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
        return ext_asm::new;
    }
}

