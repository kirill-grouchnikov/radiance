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
public class ext_pyc implements ResizableIcon {
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.0, 90.1);
((GeneralPath)shape).lineTo(10.0, 70.2);
((GeneralPath)shape).lineTo(16.5, 70.2);
((GeneralPath)shape).curveTo(19.0, 70.2, 20.6, 70.299995, 21.3, 70.5);
((GeneralPath)shape).curveTo(22.5, 70.8, 23.4, 71.4, 24.199999, 72.4);
((GeneralPath)shape).curveTo(24.999998, 73.4, 25.4, 74.700005, 25.4, 76.3);
((GeneralPath)shape).curveTo(25.4, 77.5, 25.199999, 78.5, 24.699999, 79.4);
((GeneralPath)shape).curveTo(24.3, 80.200005, 23.699999, 80.9, 22.999998, 81.4);
((GeneralPath)shape).curveTo(22.299997, 81.9, 21.599998, 82.200005, 20.899998, 82.3);
((GeneralPath)shape).curveTo(19.899998, 82.5, 18.499998, 82.600006, 16.699997, 82.600006);
((GeneralPath)shape).lineTo(14.0, 82.600006);
((GeneralPath)shape).lineTo(14.0, 90.100006);
((GeneralPath)shape).lineTo(10.0, 90.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(14.0, 73.6);
((GeneralPath)shape).lineTo(14.0, 79.2);
((GeneralPath)shape).lineTo(16.2, 79.2);
((GeneralPath)shape).curveTo(17.800001, 79.2, 18.900002, 79.1, 19.400002, 78.899994);
((GeneralPath)shape).curveTo(19.900002, 78.7, 20.400002, 78.399994, 20.7, 77.899994);
((GeneralPath)shape).curveTo(21.0, 77.49999, 21.2, 76.899994, 21.2, 76.399994);
((GeneralPath)shape).curveTo(21.2, 75.7, 21.0, 75.09999, 20.6, 74.59999);
((GeneralPath)shape).curveTo(20.2, 74.09999, 19.6, 73.79999, 19.0, 73.69999);
((GeneralPath)shape).curveTo(18.5, 73.59999, 17.5, 73.59999, 16.1, 73.59999);
((GeneralPath)shape).lineTo(14.0, 73.59999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(34.0, 90.1);
((GeneralPath)shape).lineTo(34.0, 81.799995);
((GeneralPath)shape).lineTo(26.6, 70.299995);
((GeneralPath)shape).lineTo(31.400002, 70.299995);
((GeneralPath)shape).lineTo(36.100002, 78.1);
((GeneralPath)shape).lineTo(40.7, 70.299995);
((GeneralPath)shape).lineTo(45.4, 70.299995);
((GeneralPath)shape).lineTo(38.0, 81.7);
((GeneralPath)shape).lineTo(38.0, 90.0);
((GeneralPath)shape).lineTo(34.0, 90.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(60.3, 82.799995);
((GeneralPath)shape).lineTo(64.2, 83.99999);
((GeneralPath)shape).curveTo(63.6, 86.19999, 62.6, 87.799995, 61.199997, 88.799995);
((GeneralPath)shape).curveTo(59.799995, 89.899994, 57.999996, 90.399994, 55.899998, 90.399994);
((GeneralPath)shape).curveTo(53.199997, 90.399994, 50.999996, 89.49999, 49.3, 87.7);
((GeneralPath)shape).curveTo(47.600002, 85.9, 46.7, 83.399994, 46.7, 80.299995);
((GeneralPath)shape).curveTo(46.7, 76.99999, 47.600002, 74.399994, 49.3, 72.6);
((GeneralPath)shape).curveTo(51.0, 70.799995, 53.3, 69.9, 56.1, 69.9);
((GeneralPath)shape).curveTo(58.6, 69.9, 60.6, 70.6, 62.1, 72.1);
((GeneralPath)shape).curveTo(63.0, 72.9, 63.699997, 74.2, 64.2, 75.799995);
((GeneralPath)shape).lineTo(60.199997, 76.7);
((GeneralPath)shape).curveTo(59.999996, 75.7, 59.499996, 74.899994, 58.699997, 74.299995);
((GeneralPath)shape).curveTo(57.899998, 73.7, 56.999996, 73.399994, 55.899998, 73.399994);
((GeneralPath)shape).curveTo(54.399998, 73.399994, 53.199997, 73.899994, 52.3, 74.99999);
((GeneralPath)shape).curveTo(51.399998, 76.09999, 50.899998, 77.799995, 50.899998, 80.09999);
((GeneralPath)shape).curveTo(50.899998, 82.59999, 51.399998, 84.399994, 52.3, 85.49999);
((GeneralPath)shape).curveTo(53.2, 86.59999, 54.399998, 87.09999, 55.899998, 87.09999);
((GeneralPath)shape).curveTo(56.999996, 87.09999, 57.899998, 86.79999, 58.699997, 86.09999);
((GeneralPath)shape).curveTo(59.399998, 85.29999, 59.999996, 84.19999, 60.299995, 82.79999);
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
((GeneralPath)shape).moveTo(31.8, 32.0);
((GeneralPath)shape).curveTo(31.699999, 32.1, 31.699999, 32.1, 31.8, 32.0);
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.6, 18.6);
((GeneralPath)shape).lineTo(31.0, 18.6);
((GeneralPath)shape).curveTo(23.4, 18.6, 23.4, 23.900002, 23.4, 23.900002);
((GeneralPath)shape).lineTo(23.4, 27.2);
((GeneralPath)shape).lineTo(38.5, 27.2);
((GeneralPath)shape).lineTo(38.5, 29.300001);
((GeneralPath)shape).lineTo(23.3, 29.300001);
((GeneralPath)shape).curveTo(15.699999, 29.300001, 15.699999, 34.600002, 15.699999, 34.600002);
((GeneralPath)shape).lineTo(15.699999, 39.9);
((GeneralPath)shape).curveTo(15.699999, 45.2, 23.3, 45.2, 23.3, 45.2);
((GeneralPath)shape).curveTo(23.3, 39.9, 30.9, 39.9, 30.9, 39.9);
((GeneralPath)shape).lineTo(38.5, 39.9);
((GeneralPath)shape).curveTo(46.1, 39.9, 46.1, 34.600002, 46.1, 34.600002);
((GeneralPath)shape).lineTo(46.1, 23.9);
((GeneralPath)shape).curveTo(46.199997, 18.599998, 38.6, 18.599998, 38.6, 18.599998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.399998, 25.5);
((GeneralPath)shape).curveTo(25.599998, 25.5, 24.999998, 24.9, 24.999998, 24.1);
((GeneralPath)shape).curveTo(24.999998, 23.300001, 25.599998, 22.7, 26.399998, 22.7);
((GeneralPath)shape).curveTo(27.199997, 22.7, 27.799997, 23.300001, 27.799997, 24.1);
((GeneralPath)shape).curveTo(27.899998, 24.800001, 27.199997, 25.5, 26.399998, 25.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.299995, 35.4);
((GeneralPath)shape).curveTo(47.299995, 40.7, 39.699997, 40.7, 39.699997, 40.7);
((GeneralPath)shape).lineTo(32.199997, 40.7);
((GeneralPath)shape).curveTo(24.599997, 40.7, 24.599997, 46.0, 24.599997, 46.0);
((GeneralPath)shape).lineTo(24.599997, 56.7);
((GeneralPath)shape).curveTo(24.599997, 62.0, 32.199997, 62.0, 32.199997, 62.0);
((GeneralPath)shape).lineTo(39.799995, 62.0);
((GeneralPath)shape).curveTo(47.399994, 62.0, 47.399994, 56.7, 47.399994, 56.7);
((GeneralPath)shape).lineTo(47.399994, 53.4);
((GeneralPath)shape).lineTo(32.2, 53.4);
((GeneralPath)shape).lineTo(32.2, 51.300003);
((GeneralPath)shape).lineTo(47.4, 51.300003);
((GeneralPath)shape).curveTo(55.0, 51.3, 55.0, 46.0, 55.0, 46.0);
((GeneralPath)shape).lineTo(55.0, 40.7);
((GeneralPath)shape).curveTo(54.9, 35.4, 47.3, 35.4, 47.3, 35.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(44.299995, 55.100002);
((GeneralPath)shape).curveTo(45.099995, 55.100002, 45.699997, 55.7, 45.699997, 56.500004);
((GeneralPath)shape).curveTo(45.699997, 57.300007, 45.1, 57.900005, 44.299995, 57.900005);
((GeneralPath)shape).curveTo(43.499992, 57.900005, 42.899994, 57.300007, 42.899994, 56.500004);
((GeneralPath)shape).curveTo(42.899994, 55.7, 43.499992, 55.100002, 44.299995, 55.100002);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.349998474121094, 39.8489990234375), new Point2D.Double(35.349998474121094, 83.43699645996094), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
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
	private ext_pyc() {
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
       ext_pyc base = new ext_pyc();
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
       ext_pyc base = new ext_pyc();
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
        return ext_pyc::new;
    }
}

