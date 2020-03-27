package org.pushingpixels.demo.substance.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_mdf implements ResizableIcon {
    private Shape shape = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
transformsStack.push(g.getTransform());
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.265000104904175), new Point2D.Double(36.0, 100.25), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.3, 89.8);
((GeneralPath)shape).lineTo(8.3, 69.8);
((GeneralPath)shape).lineTo(14.4, 69.8);
((GeneralPath)shape).lineTo(18.1, 83.5);
((GeneralPath)shape).lineTo(21.7, 69.8);
((GeneralPath)shape).lineTo(27.800001, 69.8);
((GeneralPath)shape).lineTo(27.800001, 89.8);
((GeneralPath)shape).lineTo(24.0, 89.8);
((GeneralPath)shape).lineTo(24.0, 74.0);
((GeneralPath)shape).lineTo(20.0, 89.8);
((GeneralPath)shape).lineTo(16.1, 89.8);
((GeneralPath)shape).lineTo(12.1, 74.0);
((GeneralPath)shape).lineTo(12.1, 89.8);
((GeneralPath)shape).lineTo(8.3, 89.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(31.900002, 69.8);
((GeneralPath)shape).lineTo(39.4, 69.8);
((GeneralPath)shape).curveTo(41.100002, 69.8, 42.4, 69.9, 43.300003, 70.200005);
((GeneralPath)shape).curveTo(44.500004, 70.50001, 45.500004, 71.200005, 46.4, 72.00001);
((GeneralPath)shape).curveTo(47.3, 72.80001, 47.9, 74.00001, 48.300003, 75.200005);
((GeneralPath)shape).curveTo(48.700005, 76.50001, 49.000004, 78.100006, 49.000004, 79.9);
((GeneralPath)shape).curveTo(49.000004, 81.5, 48.800003, 83.0, 48.400005, 84.200005);
((GeneralPath)shape).curveTo(47.900005, 85.700005, 47.200005, 86.8, 46.200005, 87.700005);
((GeneralPath)shape).curveTo(45.500004, 88.4, 44.500004, 88.9, 43.300003, 89.3);
((GeneralPath)shape).curveTo(42.4, 89.600006, 41.200005, 89.700005, 39.700005, 89.700005);
((GeneralPath)shape).lineTo(32.0, 89.700005);
((GeneralPath)shape).lineTo(32.0, 69.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 73.200005);
((GeneralPath)shape).lineTo(36.0, 86.50001);
((GeneralPath)shape).lineTo(39.0, 86.50001);
((GeneralPath)shape).curveTo(40.1, 86.50001, 41.0, 86.40001, 41.5, 86.30001);
((GeneralPath)shape).curveTo(42.2, 86.10001, 42.7, 85.90001, 43.2, 85.50001);
((GeneralPath)shape).curveTo(43.7, 85.100006, 44.0, 84.50001, 44.3, 83.600006);
((GeneralPath)shape).curveTo(44.6, 82.700005, 44.7, 81.50001, 44.7, 79.90001);
((GeneralPath)shape).curveTo(44.7, 78.30001, 44.600002, 77.20001, 44.3, 76.30001);
((GeneralPath)shape).curveTo(43.999996, 75.40001, 43.6, 74.80001, 43.1, 74.40001);
((GeneralPath)shape).curveTo(42.6, 73.90001, 42.0, 73.600006, 41.199997, 73.50001);
((GeneralPath)shape).curveTo(40.6, 73.40001, 39.499996, 73.30001, 37.799995, 73.30001);
((GeneralPath)shape).lineTo(36.0, 73.30001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.4, 89.8);
((GeneralPath)shape).lineTo(52.4, 69.8);
((GeneralPath)shape).lineTo(66.3, 69.8);
((GeneralPath)shape).lineTo(66.3, 73.200005);
((GeneralPath)shape).lineTo(56.500004, 73.200005);
((GeneralPath)shape).lineTo(56.500004, 77.9);
((GeneralPath)shape).lineTo(65.0, 77.9);
((GeneralPath)shape).lineTo(65.0, 81.3);
((GeneralPath)shape).lineTo(56.5, 81.3);
((GeneralPath)shape).lineTo(56.5, 89.8);
((GeneralPath)shape).lineTo(52.4, 89.8);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.2, 44.6);
((GeneralPath)shape).curveTo(26.800001, 45.6, 25.5, 46.699997, 24.2, 47.699997);
((GeneralPath)shape).curveTo(21.5, 49.699997, 18.900002, 51.799995, 16.2, 53.799995);
((GeneralPath)shape).curveTo(15.800001, 54.099995, 15.6, 54.099995, 15.200001, 53.899994);
((GeneralPath)shape).curveTo(14.700001, 53.599995, 14.1, 53.299995, 13.500001, 52.999992);
((GeneralPath)shape).curveTo(13.200001, 52.79999, 13.100001, 52.59999, 13.100001, 52.29999);
((GeneralPath)shape).lineTo(13.100001, 31.1);
((GeneralPath)shape).curveTo(13.100001, 30.9, 13.300001, 30.5, 13.500001, 30.4);
((GeneralPath)shape).curveTo(14.100001, 30.0, 14.800001, 29.699999, 15.400001, 29.4);
((GeneralPath)shape).curveTo(15.700001, 29.199999, 16.0, 29.4, 16.300001, 29.6);
((GeneralPath)shape).curveTo(18.500002, 31.300001, 20.7, 33.0, 22.900002, 34.6);
((GeneralPath)shape).curveTo(24.7, 36.0, 26.500002, 37.399998, 28.300001, 38.699997);
((GeneralPath)shape).curveTo(28.400002, 38.6, 28.6, 38.499996, 28.7, 38.399998);
((GeneralPath)shape).curveTo(35.3, 31.999998, 41.9, 25.599998, 48.4, 19.199997);
((GeneralPath)shape).curveTo(48.7, 18.899998, 49.0, 18.799997, 49.4, 18.999996);
((GeneralPath)shape).curveTo(52.2, 20.099997, 55.0, 21.199997, 57.800003, 22.399996);
((GeneralPath)shape).curveTo(58.000004, 22.499996, 58.200005, 22.799995, 58.300003, 22.999996);
((GeneralPath)shape).curveTo(58.4, 23.099997, 58.300003, 23.299995, 58.300003, 23.499996);
((GeneralPath)shape).lineTo(58.300003, 60.0);
((GeneralPath)shape).curveTo(58.300003, 60.9, 58.300003, 60.9, 57.4, 61.2);
((GeneralPath)shape).curveTo(54.7, 62.3, 52.100002, 63.3, 49.5, 64.4);
((GeneralPath)shape).curveTo(49.0, 64.6, 48.7, 64.5, 48.4, 64.200005);
((GeneralPath)shape).curveTo(41.9, 57.800003, 35.4, 51.500004, 28.800001, 45.200005);
((GeneralPath)shape).lineTo(28.2, 44.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.2, 50.399998);
((GeneralPath)shape).lineTo(47.2, 33.0);
((GeneralPath)shape).curveTo(43.3, 35.9, 39.5, 38.8, 35.6, 41.7);
((GeneralPath)shape).curveTo(39.5, 44.600002, 43.3, 47.5, 47.199997, 50.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(22.900002, 41.699997);
((GeneralPath)shape).curveTo(21.000002, 39.999996, 19.100002, 38.299995, 17.100002, 36.499996);
((GeneralPath)shape).lineTo(17.100002, 46.899994);
((GeneralPath)shape).curveTo(19.000002, 45.199993, 20.900002, 43.399994, 22.900002, 41.699993);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.61899948120117, 64.5), new Point2D.Double(35.61899948120117, 18.9060001373291), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 73.45700073242188), new Point2D.Double(58.569000244140625, 86.95700073242188), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());

}



    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    _paint0(g, origAlpha);


	    shape = null;
	    paint = null;
	    stroke = null;
	    clip = null;
        transformsStack.clear();
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
		return 0.9980000257492065;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_mdf() {
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
       ext_mdf base = new ext_mdf();
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
       ext_mdf base = new ext_mdf();
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
        return ext_mdf::new;
    }
}

