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
public class ext_udf implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.75, 2.994999885559082), new Point2D.Double(35.75, 101.0009994506836), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {new Color(239, 196, 2, 255),new Color(241, 200, 41, 255),new Color(244, 210, 100, 255),new Color(247, 220, 139, 255),new Color(249, 229, 172, 255),new Color(251, 236, 199, 255),new Color(252, 243, 221, 255),new Color(254, 249, 238, 255),new Color(255, 253, 249, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.8, 1.0);
((GeneralPath)shape).lineTo(71.8, 27.7);
((GeneralPath)shape).lineTo(71.8, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 99.0);
((GeneralPath)shape).lineTo(-0.19999695, 1.0);
((GeneralPath)shape).lineTo(44.800003, 1.0);
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
((GeneralPath)shape).moveTo(8.9, 72.2);
((GeneralPath)shape).lineTo(12.9, 72.2);
((GeneralPath)shape).lineTo(12.9, 83.0);
((GeneralPath)shape).curveTo(12.9, 84.7, 12.9, 85.8, 13.099999, 86.3);
((GeneralPath)shape).curveTo(13.299999, 87.100006, 13.7, 87.8, 14.299999, 88.3);
((GeneralPath)shape).curveTo(14.999999, 88.700005, 15.799999, 89.0, 17.0, 89.0);
((GeneralPath)shape).curveTo(18.1, 89.0, 19.0, 88.8, 19.6, 88.3);
((GeneralPath)shape).curveTo(20.2, 87.8, 20.5, 87.3, 20.7, 86.600006);
((GeneralPath)shape).curveTo(20.800001, 85.90001, 20.900002, 84.8, 20.900002, 83.200005);
((GeneralPath)shape).lineTo(20.900002, 72.200005);
((GeneralPath)shape).lineTo(24.900002, 72.200005);
((GeneralPath)shape).lineTo(24.900002, 82.600006);
((GeneralPath)shape).curveTo(24.900002, 85.00001, 24.800001, 86.700005, 24.600002, 87.600006);
((GeneralPath)shape).curveTo(24.400002, 88.600006, 24.000002, 89.40001, 23.400002, 90.100006);
((GeneralPath)shape).curveTo(22.800001, 90.8, 22.0, 91.3, 21.0, 91.7);
((GeneralPath)shape).curveTo(20.0, 92.09999, 18.7, 92.299995, 17.1, 92.299995);
((GeneralPath)shape).curveTo(15.200001, 92.299995, 13.700001, 92.1, 12.700001, 91.6);
((GeneralPath)shape).curveTo(11.700001, 91.2, 10.900001, 90.6, 10.400001, 89.9);
((GeneralPath)shape).curveTo(9.900001, 89.200005, 9.400001, 88.5, 9.3, 87.700005);
((GeneralPath)shape).curveTo(9.0, 86.600006, 8.900001, 84.9, 8.900001, 82.700005);
((GeneralPath)shape).lineTo(8.900001, 72.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.1, 72.2);
((GeneralPath)shape).lineTo(36.5, 72.2);
((GeneralPath)shape).curveTo(38.2, 72.2, 39.4, 72.299995, 40.3, 72.6);
((GeneralPath)shape).curveTo(41.5, 72.9, 42.5, 73.6, 43.3, 74.4);
((GeneralPath)shape).curveTo(44.1, 75.3, 44.8, 76.3, 45.2, 77.6);
((GeneralPath)shape).curveTo(45.600002, 78.899994, 45.9, 80.4, 45.9, 82.299995);
((GeneralPath)shape).curveTo(45.9, 83.899994, 45.7, 85.299995, 45.300003, 86.49999);
((GeneralPath)shape).curveTo(44.800003, 87.899994, 44.100002, 89.09999, 43.200005, 89.99999);
((GeneralPath)shape).curveTo(42.500004, 90.69999, 41.500004, 91.19999, 40.400005, 91.59999);
((GeneralPath)shape).curveTo(39.500004, 91.899994, 38.300007, 91.99999, 36.800007, 91.99999);
((GeneralPath)shape).lineTo(29.200006, 91.99999);
((GeneralPath)shape).lineTo(29.200006, 72.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.2, 75.6);
((GeneralPath)shape).lineTo(33.2, 88.7);
((GeneralPath)shape).lineTo(36.2, 88.7);
((GeneralPath)shape).curveTo(37.3, 88.7, 38.100002, 88.6, 38.600002, 88.5);
((GeneralPath)shape).curveTo(39.300003, 88.3, 39.800003, 88.1, 40.2, 87.7);
((GeneralPath)shape).curveTo(40.600002, 87.299995, 41.0, 86.7, 41.3, 85.799995);
((GeneralPath)shape).curveTo(41.6, 84.899994, 41.7, 83.7, 41.7, 82.2);
((GeneralPath)shape).curveTo(41.7, 80.7, 41.600002, 79.5, 41.3, 78.7);
((GeneralPath)shape).curveTo(41.0, 77.899994, 40.6, 77.2, 40.2, 76.799995);
((GeneralPath)shape).curveTo(39.7, 76.299995, 39.100002, 75.99999, 38.3, 75.899994);
((GeneralPath)shape).curveTo(37.7, 75.799995, 36.6, 75.7, 35.0, 75.7);
((GeneralPath)shape).lineTo(33.2, 75.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.4, 92.1);
((GeneralPath)shape).lineTo(49.4, 72.2);
((GeneralPath)shape).lineTo(63.100002, 72.2);
((GeneralPath)shape).lineTo(63.100002, 75.6);
((GeneralPath)shape).lineTo(53.4, 75.6);
((GeneralPath)shape).lineTo(53.4, 80.299995);
((GeneralPath)shape).lineTo(61.800003, 80.299995);
((GeneralPath)shape).lineTo(61.800003, 83.7);
((GeneralPath)shape).lineTo(53.4, 83.7);
((GeneralPath)shape).lineTo(53.4, 92.1);
((GeneralPath)shape).lineTo(49.4, 92.1);
((GeneralPath)shape).closePath();
paint = new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.8, 18.8);
((GeneralPath)shape).curveTo(23.4, 18.8, 13.299999, 28.8, 13.299999, 41.1);
((GeneralPath)shape).curveTo(13.299999, 53.399998, 23.4, 63.399998, 35.8, 63.399998);
((GeneralPath)shape).curveTo(48.199997, 63.399998, 58.3, 53.399998, 58.3, 41.1);
((GeneralPath)shape).curveTo(58.3, 28.8, 48.199997, 18.8, 35.8, 18.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.8, 48.699997);
((GeneralPath)shape).curveTo(31.5, 48.699997, 28.099998, 45.199997, 28.099998, 41.1);
((GeneralPath)shape).curveTo(28.099998, 36.8, 31.599998, 33.5, 35.8, 33.5);
((GeneralPath)shape).curveTo(40.1, 33.5, 43.5, 37.0, 43.5, 41.1);
((GeneralPath)shape).curveTo(43.5, 45.3, 40.0, 48.699997, 35.8, 48.699997);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.75, 38.632999420166016), new Point2D.Double(35.75, 83.18099975585938), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {new Color(164, 125, 3, 255),new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.8, 38.3);
((GeneralPath)shape).curveTo(34.2, 38.3, 33.0, 39.6, 33.0, 41.1);
((GeneralPath)shape).curveTo(33.0, 42.699997, 34.3, 43.899998, 35.8, 43.899998);
((GeneralPath)shape).curveTo(37.399998, 43.899998, 38.6, 42.6, 38.6, 41.1);
((GeneralPath)shape).curveTo(38.5, 39.5, 37.399998, 38.3, 35.8, 38.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.8, 42.1);
((GeneralPath)shape).curveTo(35.3, 42.1, 34.8, 41.699997, 34.8, 41.1);
((GeneralPath)shape).curveTo(34.8, 40.6, 35.2, 40.1, 35.8, 40.1);
((GeneralPath)shape).curveTo(36.3, 40.1, 36.8, 40.5, 36.8, 41.1);
((GeneralPath)shape).curveTo(36.8, 41.6, 36.2, 42.1, 35.8, 42.1);
((GeneralPath)shape).closePath();
paint = new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.8, 32.8);
((GeneralPath)shape).curveTo(31.099998, 32.8, 27.4, 36.6, 27.4, 41.1);
((GeneralPath)shape).curveTo(27.4, 45.8, 31.199999, 49.399998, 35.8, 49.399998);
((GeneralPath)shape).curveTo(40.5, 49.399998, 44.199997, 45.6, 44.199997, 41.1);
((GeneralPath)shape).curveTo(44.199997, 36.399998, 40.499996, 32.8, 35.799995, 32.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.8, 48.0);
((GeneralPath)shape).curveTo(31.9, 48.0, 28.8, 44.9, 28.8, 41.1);
((GeneralPath)shape).curveTo(28.8, 37.299995, 31.9, 34.199997, 35.8, 34.199997);
((GeneralPath)shape).curveTo(39.699997, 34.199997, 42.8, 37.299995, 42.8, 41.1);
((GeneralPath)shape).curveTo(42.8, 44.9, 39.7, 48.0, 35.8, 48.0);
((GeneralPath)shape).closePath();
paint = new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.34400177001953, 74.2300033569336), new Point2D.Double(58.84400177001953, 87.7300033569336), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 254, 251, 255),new Color(254, 250, 241, 255),new Color(253, 245, 228, 255),new Color(252, 240, 210, 255),new Color(250, 233, 188, 255),new Color(249, 226, 162, 255),new Color(247, 218, 131, 255),new Color(244, 209, 93, 255),new Color(241, 200, 39, 255),new Color(239, 196, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
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
        return 0.12800002098083496;
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
		return 0.7410314083099365;
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
	private ext_udf() {
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
       ext_udf base = new ext_udf();
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
       ext_udf base = new ext_udf();
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
        return ext_udf::new;
    }
}

