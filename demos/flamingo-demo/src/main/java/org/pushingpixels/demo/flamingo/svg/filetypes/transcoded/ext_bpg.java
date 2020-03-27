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
public class ext_bpg implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.0f,0.124f,0.262f,0.41f,0.571f,0.752f,1.0f}, new Color[] {new Color(0, 107, 105, 255),new Color(0, 128, 127, 255),new Color(0, 147, 147, 255),new Color(0, 163, 163, 255),new Color(0, 176, 175, 255),new Color(8, 184, 183, 255),new Color(20, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(8.0, 71.2);
((GeneralPath)shape).lineTo(16.0, 71.2);
((GeneralPath)shape).curveTo(17.6, 71.2, 18.8, 71.299995, 19.5, 71.399994);
((GeneralPath)shape).curveTo(20.3, 71.49999, 21.0, 71.799995, 21.6, 72.2);
((GeneralPath)shape).curveTo(22.2, 72.6, 22.7, 73.2, 23.1, 73.899994);
((GeneralPath)shape).curveTo(23.5, 74.59999, 23.7, 75.399994, 23.7, 76.2);
((GeneralPath)shape).curveTo(23.7, 77.1, 23.400002, 78.0, 22.900002, 78.799995);
((GeneralPath)shape).curveTo(22.400002, 79.59999, 21.7, 80.2, 20.800001, 80.49999);
((GeneralPath)shape).curveTo(22.000002, 80.899994, 23.000002, 81.49999, 23.6, 82.299995);
((GeneralPath)shape).curveTo(24.199999, 83.1, 24.6, 84.1, 24.6, 85.299995);
((GeneralPath)shape).curveTo(24.6, 86.2, 24.4, 87.1, 24.0, 87.899994);
((GeneralPath)shape).curveTo(23.6, 88.69999, 23.0, 89.399994, 22.3, 89.899994);
((GeneralPath)shape).curveTo(21.599998, 90.399994, 20.699999, 90.7, 19.599998, 90.799995);
((GeneralPath)shape).curveTo(18.999998, 90.99999, 17.399998, 90.99999, 14.799998, 91.1);
((GeneralPath)shape).lineTo(8.0, 91.1);
((GeneralPath)shape).lineTo(8.0, 71.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.0, 74.5);
((GeneralPath)shape).lineTo(12.0, 79.1);
((GeneralPath)shape).lineTo(14.6, 79.1);
((GeneralPath)shape).curveTo(16.2, 79.1, 17.1, 79.1, 17.5, 79.0);
((GeneralPath)shape).curveTo(18.2, 78.9, 18.7, 78.7, 19.1, 78.3);
((GeneralPath)shape).curveTo(19.5, 77.90001, 19.7, 77.4, 19.7, 76.8);
((GeneralPath)shape).curveTo(19.7, 76.200005, 19.5, 75.700005, 19.2, 75.3);
((GeneralPath)shape).curveTo(18.900002, 74.9, 18.400002, 74.700005, 17.7, 74.600006);
((GeneralPath)shape).curveTo(17.300001, 74.600006, 16.2, 74.50001, 14.300001, 74.50001);
((GeneralPath)shape).lineTo(12.0, 74.50001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.0, 82.4);
((GeneralPath)shape).lineTo(12.0, 87.700005);
((GeneralPath)shape).lineTo(15.7, 87.700005);
((GeneralPath)shape).curveTo(17.2, 87.700005, 18.1, 87.700005, 18.5, 87.600006);
((GeneralPath)shape).curveTo(19.1, 87.50001, 19.6, 87.200005, 20.0, 86.8);
((GeneralPath)shape).curveTo(20.4, 86.4, 20.6, 85.8, 20.6, 85.100006);
((GeneralPath)shape).curveTo(20.6, 84.50001, 20.5, 84.00001, 20.2, 83.600006);
((GeneralPath)shape).curveTo(19.900002, 83.200005, 19.5, 82.90001, 18.900002, 82.700005);
((GeneralPath)shape).curveTo(18.400002, 82.50001, 17.2, 82.4, 15.300001, 82.4);
((GeneralPath)shape).lineTo(12.0, 82.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.1, 91.1);
((GeneralPath)shape).lineTo(28.1, 71.2);
((GeneralPath)shape).lineTo(34.6, 71.2);
((GeneralPath)shape).curveTo(37.1, 71.2, 38.699997, 71.299995, 39.399998, 71.5);
((GeneralPath)shape).curveTo(40.499996, 71.8, 41.499996, 72.4, 42.3, 73.4);
((GeneralPath)shape).curveTo(43.1, 74.4, 43.5, 75.700005, 43.5, 77.3);
((GeneralPath)shape).curveTo(43.5, 78.5, 43.3, 79.5, 42.8, 80.4);
((GeneralPath)shape).curveTo(42.399998, 81.200005, 41.8, 81.9, 41.1, 82.4);
((GeneralPath)shape).curveTo(40.399998, 82.9, 39.699997, 83.200005, 39.0, 83.3);
((GeneralPath)shape).curveTo(38.0, 83.5, 36.6, 83.600006, 34.8, 83.600006);
((GeneralPath)shape).lineTo(32.2, 83.600006);
((GeneralPath)shape).lineTo(32.2, 91.100006);
((GeneralPath)shape).lineTo(28.1, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.2, 74.6);
((GeneralPath)shape).lineTo(32.2, 80.2);
((GeneralPath)shape).lineTo(34.4, 80.2);
((GeneralPath)shape).curveTo(36.0, 80.2, 37.100002, 80.1, 37.600002, 79.899994);
((GeneralPath)shape).curveTo(38.100002, 79.7, 38.600002, 79.399994, 38.9, 78.899994);
((GeneralPath)shape).curveTo(39.2, 78.49999, 39.4, 77.899994, 39.4, 77.399994);
((GeneralPath)shape).curveTo(39.4, 76.7, 39.2, 76.09999, 38.800003, 75.59999);
((GeneralPath)shape).curveTo(38.4, 75.09999, 37.800003, 74.79999, 37.200005, 74.69999);
((GeneralPath)shape).curveTo(36.700005, 74.59999, 35.800003, 74.59999, 34.300003, 74.59999);
((GeneralPath)shape).lineTo(32.200005, 74.59999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(56.1, 83.799995);
((GeneralPath)shape).lineTo(56.1, 80.49999);
((GeneralPath)shape).lineTo(64.799995, 80.49999);
((GeneralPath)shape).lineTo(64.799995, 88.399994);
((GeneralPath)shape).curveTo(63.999996, 89.2, 62.699997, 89.899994, 61.099995, 90.49999);
((GeneralPath)shape).curveTo(59.499996, 91.09999, 57.899994, 91.399994, 56.199993, 91.399994);
((GeneralPath)shape).curveTo(54.099995, 91.399994, 52.29999, 90.99999, 50.699993, 90.09999);
((GeneralPath)shape).curveTo(49.099995, 89.19999, 48.0, 88.0, 47.2, 86.4);
((GeneralPath)shape).curveTo(46.4, 84.8, 46.0, 83.0, 46.0, 81.1);
((GeneralPath)shape).curveTo(46.0, 79.0, 46.4, 77.2, 47.3, 75.6);
((GeneralPath)shape).curveTo(48.199997, 74.0, 49.399998, 72.799995, 51.1, 71.9);
((GeneralPath)shape).curveTo(52.399998, 71.200005, 54.0, 70.9, 55.899998, 70.9);
((GeneralPath)shape).curveTo(58.399998, 70.9, 60.3, 71.4, 61.699997, 72.4);
((GeneralPath)shape).curveTo(63.099995, 73.4, 63.999996, 74.9, 64.399994, 76.700005);
((GeneralPath)shape).lineTo(60.399994, 77.4);
((GeneralPath)shape).curveTo(60.099995, 76.4, 59.599995, 75.700005, 58.799995, 75.1);
((GeneralPath)shape).curveTo(57.999996, 74.5, 57.099995, 74.299995, 55.899994, 74.299995);
((GeneralPath)shape).curveTo(54.099995, 74.299995, 52.699993, 74.899994, 51.699993, 75.99999);
((GeneralPath)shape).curveTo(50.699993, 77.09999, 50.099995, 78.799995, 50.099995, 80.899994);
((GeneralPath)shape).curveTo(50.099995, 83.299995, 50.599995, 84.99999, 51.699993, 86.2);
((GeneralPath)shape).curveTo(52.79999, 87.4, 54.099995, 88.0, 55.79999, 88.0);
((GeneralPath)shape).curveTo(56.59999, 88.0, 57.499992, 87.8, 58.29999, 87.5);
((GeneralPath)shape).curveTo(59.09999, 87.2, 59.89999, 86.8, 60.499992, 86.3);
((GeneralPath)shape).lineTo(60.499992, 83.8);
((GeneralPath)shape).lineTo(56.09999, 83.8);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {new Color(214, 237, 232, 255),new Color(211, 235, 230, 255),new Color(199, 227, 223, 255),new Color(183, 216, 213, 255),new Color(160, 203, 201, 255),new Color(132, 186, 185, 255),new Color(98, 167, 167, 255),new Color(52, 147, 148, 255),new Color(0, 127, 127, 255),new Color(0, 107, 106, 255),new Color(0, 107, 105, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(62.7, 56.8);
((GeneralPath)shape).curveTo(61.100002, 56.0, 58.100002, 50.2, 53.5, 49.8);
((GeneralPath)shape).curveTo(49.5, 49.5, 44.4, 48.0, 41.6, 47.8);
((GeneralPath)shape).curveTo(38.1, 42.0, 32.1, 32.8, 27.099998, 27.9);
((GeneralPath)shape).lineTo(40.899998, 28.6);
((GeneralPath)shape).curveTo(37.2, 19.8, 27.7, 23.0, 27.7, 23.0);
((GeneralPath)shape).lineTo(34.100002, 17.7);
((GeneralPath)shape).curveTo(25.900002, 14.400001, 22.500002, 22.400002, 22.500002, 22.400002);
((GeneralPath)shape).curveTo(14.000002, 17.7, 9.600002, 25.7, 9.600002, 25.7);
((GeneralPath)shape).lineTo(18.400002, 26.300001);
((GeneralPath)shape).curveTo(8.4, 29.1, 11.2, 39.0, 11.2, 39.0);
((GeneralPath)shape).lineTo(20.099998, 31.0);
((GeneralPath)shape).curveTo(18.199999, 35.4, 22.399998, 38.5, 22.399998, 38.5);
((GeneralPath)shape).lineTo(25.0, 27.7);
((GeneralPath)shape).curveTo(25.0, 27.7, 34.3, 38.300003, 37.2, 49.1);
((GeneralPath)shape).curveTo(33.5, 51.0, 27.7, 54.1, 23.2, 54.699997);
((GeneralPath)shape).curveTo(17.0, 55.499996, 9.700001, 59.699997, 9.700001, 59.699997);
((GeneralPath)shape).lineTo(9.700001, 64.6);
((GeneralPath)shape).lineTo(62.8, 64.6);
((GeneralPath)shape).lineTo(62.7, 56.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.25, 37.35300064086914), new Point2D.Double(36.25, 85.16100311279297), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
        return 0.13300000131130219;
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
		return 0.7379999160766602;
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
	private ext_bpg() {
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
       ext_bpg base = new ext_bpg();
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
       ext_bpg base = new ext_bpg();
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
        return ext_bpg::new;
    }
}

