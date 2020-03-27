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
public class ext_ash implements ResizableIcon {
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.2, 40.4);
((GeneralPath)shape).lineTo(43.1, 40.4);
((GeneralPath)shape).lineTo(43.1, 43.600002);
((GeneralPath)shape).lineTo(30.2, 43.600002);
((GeneralPath)shape).lineTo(30.2, 40.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 46.800003);
((GeneralPath)shape).lineTo(43.1, 46.800003);
((GeneralPath)shape).lineTo(43.1, 50.0);
((GeneralPath)shape).lineTo(30.2, 50.0);
((GeneralPath)shape).lineTo(30.2, 46.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 53.300003);
((GeneralPath)shape).lineTo(43.1, 53.300003);
((GeneralPath)shape).lineTo(43.1, 56.500004);
((GeneralPath)shape).lineTo(30.2, 56.500004);
((GeneralPath)shape).lineTo(30.2, 53.300003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.800003, 24.200003);
((GeneralPath)shape).lineTo(26.9, 24.200003);
((GeneralPath)shape).curveTo(23.3, 24.200003, 20.4, 27.100002, 20.4, 30.700003);
((GeneralPath)shape).lineTo(20.4, 59.800003);
((GeneralPath)shape).lineTo(14.0, 59.800003);
((GeneralPath)shape).curveTo(14.0, 63.4, 16.9, 66.3, 20.5, 66.3);
((GeneralPath)shape).lineTo(46.3, 66.3);
((GeneralPath)shape).curveTo(49.899998, 66.3, 52.8, 63.4, 52.8, 59.800003);
((GeneralPath)shape).lineTo(52.8, 33.9);
((GeneralPath)shape).lineTo(59.3, 33.9);
((GeneralPath)shape).lineTo(59.3, 30.7);
((GeneralPath)shape).curveTo(59.2, 27.1, 56.399998, 24.2, 52.8, 24.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.600002, 59.200005);
((GeneralPath)shape).curveTo(49.600002, 61.300003, 47.9, 63.000004, 45.800003, 63.000004);
((GeneralPath)shape).lineTo(22.1, 63.000004);
((GeneralPath)shape).curveTo(23.7, 61.900005, 23.7, 59.800003, 23.7, 59.800003);
((GeneralPath)shape).lineTo(23.7, 30.7);
((GeneralPath)shape).curveTo(23.7, 28.900002, 25.1, 27.5, 26.900002, 27.5);
((GeneralPath)shape).curveTo(28.7, 27.5, 30.100002, 28.9, 30.100002, 30.7);
((GeneralPath)shape).lineTo(30.100002, 33.9);
((GeneralPath)shape).lineTo(49.5, 33.9);
((GeneralPath)shape).lineTo(49.5, 59.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.4, 30.7);
((GeneralPath)shape).lineTo(33.4, 27.5);
((GeneralPath)shape).lineTo(52.800003, 27.5);
((GeneralPath)shape).curveTo(55.700005, 27.5, 56.000004, 29.3, 56.000004, 30.7);
((GeneralPath)shape).lineTo(33.4, 30.7);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 66.23100280761719), new Point2D.Double(36.63199996948242, 24.231000900268555), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 66.60600280761719), new Point2D.Double(36.63199996948242, 23.856000900268555), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.2, 40.4);
((GeneralPath)shape).lineTo(43.1, 40.4);
((GeneralPath)shape).lineTo(43.1, 43.600002);
((GeneralPath)shape).lineTo(30.2, 43.600002);
((GeneralPath)shape).lineTo(30.2, 40.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 46.800003);
((GeneralPath)shape).lineTo(43.1, 46.800003);
((GeneralPath)shape).lineTo(43.1, 50.0);
((GeneralPath)shape).lineTo(30.2, 50.0);
((GeneralPath)shape).lineTo(30.2, 46.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 53.300003);
((GeneralPath)shape).lineTo(43.1, 53.300003);
((GeneralPath)shape).lineTo(43.1, 56.500004);
((GeneralPath)shape).lineTo(30.2, 56.500004);
((GeneralPath)shape).lineTo(30.2, 53.300003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.800003, 24.200003);
((GeneralPath)shape).lineTo(26.9, 24.200003);
((GeneralPath)shape).curveTo(23.3, 24.200003, 20.4, 27.100002, 20.4, 30.700003);
((GeneralPath)shape).lineTo(20.4, 59.800003);
((GeneralPath)shape).lineTo(14.0, 59.800003);
((GeneralPath)shape).curveTo(14.0, 63.4, 16.9, 66.3, 20.5, 66.3);
((GeneralPath)shape).lineTo(46.3, 66.3);
((GeneralPath)shape).curveTo(49.899998, 66.3, 52.8, 63.4, 52.8, 59.800003);
((GeneralPath)shape).lineTo(52.8, 33.9);
((GeneralPath)shape).lineTo(59.3, 33.9);
((GeneralPath)shape).lineTo(59.3, 30.7);
((GeneralPath)shape).curveTo(59.2, 27.1, 56.399998, 24.2, 52.8, 24.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.600002, 59.200005);
((GeneralPath)shape).curveTo(49.600002, 61.300003, 47.9, 63.000004, 45.800003, 63.000004);
((GeneralPath)shape).lineTo(22.1, 63.000004);
((GeneralPath)shape).curveTo(23.7, 61.900005, 23.7, 59.800003, 23.7, 59.800003);
((GeneralPath)shape).lineTo(23.7, 30.7);
((GeneralPath)shape).curveTo(23.7, 28.900002, 25.1, 27.5, 26.900002, 27.5);
((GeneralPath)shape).curveTo(28.7, 27.5, 30.100002, 28.9, 30.100002, 30.7);
((GeneralPath)shape).lineTo(30.100002, 33.9);
((GeneralPath)shape).lineTo(49.5, 33.9);
((GeneralPath)shape).lineTo(49.5, 59.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.4, 30.7);
((GeneralPath)shape).lineTo(33.4, 27.5);
((GeneralPath)shape).lineTo(52.800003, 27.5);
((GeneralPath)shape).curveTo(55.700005, 27.5, 56.000004, 29.3, 56.000004, 30.7);
((GeneralPath)shape).lineTo(33.4, 30.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(27.9, 91.9);
((GeneralPath)shape).lineTo(24.1, 91.9);
((GeneralPath)shape).lineTo(22.6, 88.0);
((GeneralPath)shape).lineTo(15.700001, 88.0);
((GeneralPath)shape).lineTo(14.300001, 91.9);
((GeneralPath)shape).lineTo(10.600001, 91.9);
((GeneralPath)shape).lineTo(17.300001, 74.7);
((GeneralPath)shape).lineTo(21.0, 74.7);
((GeneralPath)shape).lineTo(27.9, 91.899994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.5, 85.1);
((GeneralPath)shape).lineTo(19.1, 78.7);
((GeneralPath)shape).lineTo(16.800001, 85.1);
((GeneralPath)shape).lineTo(21.5, 85.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.9, 86.299995);
((GeneralPath)shape).lineTo(32.3, 85.99999);
((GeneralPath)shape).curveTo(32.5, 87.09999, 32.899998, 87.99999, 33.5, 88.49999);
((GeneralPath)shape).curveTo(34.100002, 88.99999, 35.0, 89.299995, 36.0, 89.299995);
((GeneralPath)shape).curveTo(37.1, 89.299995, 38.0, 89.1, 38.5, 88.6);
((GeneralPath)shape).curveTo(39.0, 88.1, 39.3, 87.6, 39.3, 86.9);
((GeneralPath)shape).curveTo(39.3, 86.5, 39.2, 86.1, 38.899998, 85.9);
((GeneralPath)shape).curveTo(38.599995, 85.700005, 38.199997, 85.4, 37.699997, 85.200005);
((GeneralPath)shape).curveTo(37.299995, 85.100006, 36.399998, 84.8, 34.899998, 84.4);
((GeneralPath)shape).curveTo(32.999996, 83.9, 31.699997, 83.4, 30.999998, 82.700005);
((GeneralPath)shape).curveTo(29.899998, 81.8, 29.399998, 80.600006, 29.399998, 79.200005);
((GeneralPath)shape).curveTo(29.399998, 78.3, 29.599998, 77.50001, 30.099998, 76.700005);
((GeneralPath)shape).curveTo(30.599998, 75.9, 31.3, 75.4, 32.199997, 75.00001);
((GeneralPath)shape).curveTo(33.099995, 74.60001, 34.299995, 74.40001, 35.6, 74.40001);
((GeneralPath)shape).curveTo(37.8, 74.40001, 39.399998, 74.90001, 40.5, 75.80001);
((GeneralPath)shape).curveTo(41.600002, 76.70001, 42.2, 78.00001, 42.2, 79.60001);
((GeneralPath)shape).lineTo(38.7, 79.80001);
((GeneralPath)shape).curveTo(38.600002, 78.90001, 38.2, 78.30001, 37.7, 77.90001);
((GeneralPath)shape).curveTo(37.2, 77.50001, 36.5, 77.30001, 35.5, 77.30001);
((GeneralPath)shape).curveTo(34.5, 77.30001, 33.7, 77.50001, 33.1, 77.90001);
((GeneralPath)shape).curveTo(32.699997, 78.20001, 32.5, 78.50001, 32.5, 79.00001);
((GeneralPath)shape).curveTo(32.5, 79.40001, 32.7, 79.80001, 33.0, 80.00001);
((GeneralPath)shape).curveTo(33.4, 80.40001, 34.5, 80.80001, 36.2, 81.100006);
((GeneralPath)shape).curveTo(37.9, 81.4, 39.100002, 81.90001, 39.9, 82.3);
((GeneralPath)shape).curveTo(40.7, 82.7, 41.300003, 83.3, 41.800003, 84.0);
((GeneralPath)shape).curveTo(42.300003, 84.7, 42.500004, 85.7, 42.500004, 86.7);
((GeneralPath)shape).curveTo(42.500004, 87.7, 42.200005, 88.6, 41.700005, 89.5);
((GeneralPath)shape).curveTo(41.200005, 90.4, 40.400005, 91.0, 39.400005, 91.4);
((GeneralPath)shape).curveTo(38.400005, 91.8, 37.200005, 92.0, 35.700005, 92.0);
((GeneralPath)shape).curveTo(33.500004, 92.0, 31.900005, 91.5, 30.700005, 90.5);
((GeneralPath)shape).curveTo(29.500004, 89.5, 29.100004, 88.2, 28.900005, 86.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.8, 91.899994);
((GeneralPath)shape).lineTo(45.8, 74.7);
((GeneralPath)shape).lineTo(49.3, 74.7);
((GeneralPath)shape).lineTo(49.3, 81.5);
((GeneralPath)shape).lineTo(56.0, 81.5);
((GeneralPath)shape).lineTo(56.0, 74.7);
((GeneralPath)shape).lineTo(59.5, 74.7);
((GeneralPath)shape).lineTo(59.5, 91.899994);
((GeneralPath)shape).lineTo(56.0, 91.899994);
((GeneralPath)shape).lineTo(56.0, 84.399994);
((GeneralPath)shape).lineTo(49.2, 84.399994);
((GeneralPath)shape).lineTo(49.2, 91.899994);
((GeneralPath)shape).lineTo(45.8, 91.899994);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
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
	private ext_ash() {
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
       ext_ash base = new ext_ash();
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
       ext_ash base = new ext_ash();
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
        return ext_ash::new;
    }
}

