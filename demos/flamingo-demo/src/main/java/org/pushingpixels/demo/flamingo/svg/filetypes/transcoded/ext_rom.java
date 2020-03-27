package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_rom implements ResizableIcon {
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.4, 91.9);
((GeneralPath)shape).lineTo(5.4, 71.9);
((GeneralPath)shape).lineTo(13.9, 71.9);
((GeneralPath)shape).curveTo(16.0, 71.9, 17.6, 72.1, 18.599998, 72.4);
((GeneralPath)shape).curveTo(19.599997, 72.700005, 20.3, 73.4, 20.899998, 74.3);
((GeneralPath)shape).curveTo(21.499998, 75.200005, 21.799997, 76.3, 21.799997, 77.5);
((GeneralPath)shape).curveTo(21.799997, 79.0, 21.399998, 80.2, 20.499998, 81.2);
((GeneralPath)shape).curveTo(19.599998, 82.2, 18.299997, 82.799995, 16.499998, 83.1);
((GeneralPath)shape).curveTo(17.399998, 83.6, 18.099998, 84.2, 18.699999, 84.799995);
((GeneralPath)shape).curveTo(19.3, 85.399994, 19.999998, 86.49999, 20.999998, 88.1);
((GeneralPath)shape).lineTo(23.399998, 92.0);
((GeneralPath)shape).lineTo(18.599998, 92.0);
((GeneralPath)shape).lineTo(15.699999, 87.6);
((GeneralPath)shape).curveTo(14.699999, 86.0, 13.899999, 85.1, 13.599998, 84.7);
((GeneralPath)shape).curveTo(13.299998, 84.299995, 12.799998, 84.0, 12.399999, 83.899994);
((GeneralPath)shape).curveTo(11.999999, 83.7, 11.299998, 83.7, 10.399999, 83.7);
((GeneralPath)shape).lineTo(9.399999, 83.7);
((GeneralPath)shape).lineTo(9.399999, 92.1);
((GeneralPath)shape).lineTo(5.3999987, 92.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(9.4, 80.3);
((GeneralPath)shape).lineTo(12.4, 80.3);
((GeneralPath)shape).curveTo(14.299999, 80.3, 15.599999, 80.200005, 16.0, 80.100006);
((GeneralPath)shape).curveTo(16.5, 79.90001, 16.9, 79.700005, 17.1, 79.3);
((GeneralPath)shape).curveTo(17.300001, 78.9, 17.5, 78.4, 17.5, 77.8);
((GeneralPath)shape).curveTo(17.5, 77.100006, 17.3, 76.600006, 17.0, 76.200005);
((GeneralPath)shape).curveTo(16.6, 75.8, 16.1, 75.50001, 15.5, 75.4);
((GeneralPath)shape).curveTo(15.2, 75.4, 14.2, 75.3, 12.5, 75.3);
((GeneralPath)shape).lineTo(9.4, 75.3);
((GeneralPath)shape).lineTo(9.4, 80.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(24.8, 82.0);
((GeneralPath)shape).curveTo(24.8, 80.0, 25.099998, 78.2, 25.699999, 76.9);
((GeneralPath)shape).curveTo(26.199999, 75.9, 26.8, 75.0, 27.599998, 74.200005);
((GeneralPath)shape).curveTo(28.399998, 73.4, 29.3, 72.8, 30.199999, 72.4);
((GeneralPath)shape).curveTo(31.4, 71.9, 32.899998, 71.6, 34.5, 71.6);
((GeneralPath)shape).curveTo(37.5, 71.6, 39.8, 72.5, 41.6, 74.299995);
((GeneralPath)shape).curveTo(43.399998, 76.1, 44.3, 78.7, 44.3, 81.899994);
((GeneralPath)shape).curveTo(44.3, 85.09999, 43.399998, 87.7, 41.7, 89.49999);
((GeneralPath)shape).curveTo(39.9, 91.299995, 37.600002, 92.19999, 34.600002, 92.19999);
((GeneralPath)shape).curveTo(31.600002, 92.19999, 29.200003, 91.29999, 27.500002, 89.49999);
((GeneralPath)shape).curveTo(25.700003, 87.69999, 24.800001, 85.19999, 24.800001, 81.99999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.9, 81.8);
((GeneralPath)shape).curveTo(28.9, 84.100006, 29.4, 85.8, 30.5, 87.0);
((GeneralPath)shape).curveTo(31.5, 88.2, 32.9, 88.8, 34.5, 88.8);
((GeneralPath)shape).curveTo(36.1, 88.8, 37.4, 88.200005, 38.5, 87.100006);
((GeneralPath)shape).curveTo(39.5, 85.90001, 40.1, 84.200005, 40.1, 81.90001);
((GeneralPath)shape).curveTo(40.1, 79.600006, 39.6, 77.90001, 38.6, 76.80001);
((GeneralPath)shape).curveTo(37.6, 75.70001, 36.3, 75.10001, 34.6, 75.10001);
((GeneralPath)shape).curveTo(32.899998, 75.10001, 31.599998, 75.70001, 30.599998, 76.80001);
((GeneralPath)shape).curveTo(29.499998, 77.80001, 28.899998, 79.50001, 28.899998, 81.80001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.3, 91.9);
((GeneralPath)shape).lineTo(47.3, 71.9);
((GeneralPath)shape).lineTo(53.399998, 71.9);
((GeneralPath)shape).lineTo(57.0, 85.5);
((GeneralPath)shape).lineTo(60.6, 71.8);
((GeneralPath)shape).lineTo(66.7, 71.8);
((GeneralPath)shape).lineTo(66.7, 91.8);
((GeneralPath)shape).lineTo(62.899998, 91.8);
((GeneralPath)shape).lineTo(62.899998, 76.1);
((GeneralPath)shape).lineTo(58.899998, 91.9);
((GeneralPath)shape).lineTo(55.0, 91.9);
((GeneralPath)shape).lineTo(51.0, 76.1);
((GeneralPath)shape).lineTo(51.0, 91.9);
((GeneralPath)shape).lineTo(47.3, 91.9);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
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
	private ext_rom() {
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
       ext_rom base = new ext_rom();
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
       ext_rom base = new ext_rom();
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
        return ext_rom::new;
    }
}

