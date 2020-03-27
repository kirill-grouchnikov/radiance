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
public class ext_enc implements ResizableIcon {
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(51.4, 37.7);
((GeneralPath)shape).lineTo(48.5, 37.7);
((GeneralPath)shape).lineTo(48.5, 32.0);
((GeneralPath)shape).curveTo(48.5, 25.6, 43.3, 20.3, 36.8, 20.3);
((GeneralPath)shape).curveTo(30.3, 20.3, 25.1, 25.6, 25.1, 32.0);
((GeneralPath)shape).lineTo(25.1, 37.7);
((GeneralPath)shape).lineTo(22.2, 37.7);
((GeneralPath)shape).curveTo(21.1, 37.7, 20.2, 38.600002, 20.2, 39.7);
((GeneralPath)shape).lineTo(20.2, 59.5);
((GeneralPath)shape).curveTo(20.2, 60.6, 21.1, 61.5, 22.2, 61.5);
((GeneralPath)shape).lineTo(51.300003, 61.5);
((GeneralPath)shape).curveTo(52.4, 61.5, 53.300003, 60.6, 53.300003, 59.5);
((GeneralPath)shape).lineTo(53.300003, 39.8);
((GeneralPath)shape).curveTo(53.4, 38.6, 52.500004, 37.7, 51.4, 37.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(39.3, 54.2);
((GeneralPath)shape).curveTo(39.5, 54.9, 39.0, 55.5, 38.3, 55.5);
((GeneralPath)shape).lineTo(35.3, 55.5);
((GeneralPath)shape).curveTo(34.6, 55.5, 34.1, 54.8, 34.3, 54.2);
((GeneralPath)shape).lineTo(35.3, 50.5);
((GeneralPath)shape).curveTo(34.2, 49.9, 33.399998, 48.8, 33.399998, 47.4);
((GeneralPath)shape).curveTo(33.399998, 45.4, 34.999996, 43.9, 36.899998, 43.9);
((GeneralPath)shape).curveTo(38.8, 43.9, 40.399998, 45.5, 40.399998, 47.4);
((GeneralPath)shape).curveTo(40.399998, 48.800003, 39.6, 50.0, 38.499996, 50.5);
((GeneralPath)shape).lineTo(39.299995, 54.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.6, 37.7);
((GeneralPath)shape).lineTo(31.0, 37.7);
((GeneralPath)shape).lineTo(31.0, 32.0);
((GeneralPath)shape).curveTo(31.0, 28.8, 33.6, 26.2, 36.8, 26.2);
((GeneralPath)shape).curveTo(40.0, 26.2, 42.6, 28.800001, 42.6, 32.0);
((GeneralPath)shape).lineTo(42.6, 37.7);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.79999923706055, 61.5890007019043), new Point2D.Double(36.79999923706055, 20.33300018310547), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.0, 91.9);
((GeneralPath)shape).lineTo(9.0, 71.9);
((GeneralPath)shape).lineTo(23.9, 71.9);
((GeneralPath)shape).lineTo(23.9, 75.3);
((GeneralPath)shape).lineTo(13.0, 75.3);
((GeneralPath)shape).lineTo(13.0, 79.700005);
((GeneralPath)shape).lineTo(23.1, 79.700005);
((GeneralPath)shape).lineTo(23.1, 83.100006);
((GeneralPath)shape).lineTo(13.0, 83.100006);
((GeneralPath)shape).lineTo(13.0, 88.600006);
((GeneralPath)shape).lineTo(24.2, 88.600006);
((GeneralPath)shape).lineTo(24.2, 92.0);
((GeneralPath)shape).lineTo(9.0, 92.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.7, 91.9);
((GeneralPath)shape).lineTo(27.7, 71.9);
((GeneralPath)shape).lineTo(31.6, 71.9);
((GeneralPath)shape).lineTo(39.8, 85.3);
((GeneralPath)shape).lineTo(39.8, 71.8);
((GeneralPath)shape).lineTo(43.6, 71.8);
((GeneralPath)shape).lineTo(43.6, 91.8);
((GeneralPath)shape).lineTo(39.5, 91.8);
((GeneralPath)shape).lineTo(31.4, 78.700005);
((GeneralPath)shape).lineTo(31.4, 91.8);
((GeneralPath)shape).lineTo(27.699999, 91.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(60.7, 84.5);
((GeneralPath)shape).lineTo(64.6, 85.7);
((GeneralPath)shape).curveTo(64.0, 87.899994, 63.0, 89.5, 61.6, 90.6);
((GeneralPath)shape).curveTo(60.199997, 91.7, 58.399998, 92.2, 56.3, 92.2);
((GeneralPath)shape).curveTo(53.6, 92.2, 51.5, 91.299995, 49.7, 89.5);
((GeneralPath)shape).curveTo(48.0, 87.7, 47.100002, 85.2, 47.100002, 82.0);
((GeneralPath)shape).curveTo(47.100002, 78.7, 48.000004, 76.1, 49.7, 74.2);
((GeneralPath)shape).curveTo(51.399998, 72.299995, 53.7, 71.399994, 56.5, 71.399994);
((GeneralPath)shape).curveTo(59.0, 71.399994, 60.9, 72.09999, 62.5, 73.59999);
((GeneralPath)shape).curveTo(63.4, 74.49999, 64.1, 75.69999, 64.6, 77.29999);
((GeneralPath)shape).lineTo(60.6, 78.29999);
((GeneralPath)shape).curveTo(60.399998, 77.29999, 59.899998, 76.39999, 59.1, 75.79999);
((GeneralPath)shape).curveTo(58.3, 75.19999, 57.399998, 74.999985, 56.3, 74.999985);
((GeneralPath)shape).curveTo(54.8, 74.999985, 53.6, 75.499985, 52.7, 76.59998);
((GeneralPath)shape).curveTo(51.8, 77.69998, 51.3, 79.39999, 51.3, 81.79998);
((GeneralPath)shape).curveTo(51.3, 84.29998, 51.8, 86.09998, 52.7, 87.19998);
((GeneralPath)shape).curveTo(53.600002, 88.29998, 54.8, 88.79998, 56.3, 88.79998);
((GeneralPath)shape).curveTo(57.399998, 88.79998, 58.3, 88.49998, 59.1, 87.79998);
((GeneralPath)shape).curveTo(59.8, 87.09998, 60.399998, 85.99998, 60.699997, 84.49998);
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
	private ext_enc() {
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
       ext_enc base = new ext_enc();
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
       ext_enc base = new ext_enc();
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
        return ext_enc::new;
    }
}

