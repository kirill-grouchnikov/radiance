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
public class ext_asc implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 127.80000305175781), new Point2D.Double(36.0, 29.799999237060547), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -29.0f));
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
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 56.57500076293945), new Point2D.Double(58.57500076293945, 43.07500076293945), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -29.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(27.3, 89.8);
((GeneralPath)shape).lineTo(22.9, 89.8);
((GeneralPath)shape).lineTo(21.1, 85.200005);
((GeneralPath)shape).lineTo(13.1, 85.200005);
((GeneralPath)shape).lineTo(11.400001, 89.8);
((GeneralPath)shape).lineTo(7.2, 89.8);
((GeneralPath)shape).lineTo(15.0, 69.8);
((GeneralPath)shape).lineTo(19.3, 69.8);
((GeneralPath)shape).lineTo(27.3, 89.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.8, 81.9);
((GeneralPath)shape).lineTo(17.0, 74.5);
((GeneralPath)shape).lineTo(14.3, 81.9);
((GeneralPath)shape).lineTo(19.8, 81.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.4, 83.3);
((GeneralPath)shape).lineTo(32.3, 82.9);
((GeneralPath)shape).curveTo(32.5, 84.200005, 33.0, 85.200005, 33.7, 85.8);
((GeneralPath)shape).curveTo(34.4, 86.4, 35.4, 86.700005, 36.600002, 86.700005);
((GeneralPath)shape).curveTo(37.9, 86.700005, 38.9, 86.4, 39.500004, 85.9);
((GeneralPath)shape).curveTo(40.100006, 85.4, 40.500004, 84.700005, 40.500004, 84.0);
((GeneralPath)shape).curveTo(40.500004, 83.5, 40.400005, 83.1, 40.100002, 82.8);
((GeneralPath)shape).curveTo(39.8, 82.50001, 39.300003, 82.200005, 38.600002, 81.9);
((GeneralPath)shape).curveTo(38.100002, 81.700005, 37.000004, 81.4, 35.4, 81.0);
((GeneralPath)shape).curveTo(33.2, 80.5, 31.7, 79.8, 30.800001, 79.0);
((GeneralPath)shape).curveTo(29.6, 77.9, 29.000002, 76.6, 29.000002, 75.0);
((GeneralPath)shape).curveTo(29.000002, 74.0, 29.300001, 73.0, 29.900002, 72.1);
((GeneralPath)shape).curveTo(30.500002, 71.2, 31.300001, 70.5, 32.4, 70.1);
((GeneralPath)shape).curveTo(33.5, 69.6, 34.800003, 69.4, 36.300003, 69.4);
((GeneralPath)shape).curveTo(38.800003, 69.4, 40.700005, 70.0, 42.000004, 71.1);
((GeneralPath)shape).curveTo(43.300003, 72.2, 43.900005, 73.7, 44.000004, 75.5);
((GeneralPath)shape).lineTo(40.000004, 75.7);
((GeneralPath)shape).curveTo(39.800003, 74.7, 39.500004, 73.899994, 38.900005, 73.5);
((GeneralPath)shape).curveTo(38.300007, 73.100006, 37.500004, 72.8, 36.300007, 72.8);
((GeneralPath)shape).curveTo(35.100006, 72.8, 34.20001, 73.0, 33.500008, 73.5);
((GeneralPath)shape).curveTo(33.100006, 73.8, 32.90001, 74.2, 32.90001, 74.7);
((GeneralPath)shape).curveTo(32.90001, 75.2, 33.10001, 75.6, 33.500008, 75.899994);
((GeneralPath)shape).curveTo(34.000008, 76.299995, 35.300007, 76.799995, 37.20001, 77.2);
((GeneralPath)shape).curveTo(39.20001, 77.7, 40.60001, 78.1, 41.60001, 78.6);
((GeneralPath)shape).curveTo(42.60001, 79.1, 43.30001, 79.799995, 43.80001, 80.6);
((GeneralPath)shape).curveTo(44.30001, 81.4, 44.60001, 82.5, 44.60001, 83.799995);
((GeneralPath)shape).curveTo(44.60001, 84.899994, 44.30001, 85.99999, 43.60001, 86.99999);
((GeneralPath)shape).curveTo(42.90001, 87.99999, 42.10001, 88.69999, 40.90001, 89.19999);
((GeneralPath)shape).curveTo(39.70001, 89.69999, 38.30001, 89.89999, 36.500008, 89.89999);
((GeneralPath)shape).curveTo(34.000008, 89.89999, 32.000008, 89.29999, 30.700008, 88.09998);
((GeneralPath)shape).curveTo(29.500008, 87.19998, 28.700008, 85.499985, 28.40001, 83.29998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(60.9, 82.4);
((GeneralPath)shape).lineTo(64.8, 83.6);
((GeneralPath)shape).curveTo(64.200005, 85.799995, 63.200005, 87.4, 61.800003, 88.5);
((GeneralPath)shape).curveTo(60.4, 89.6, 58.600002, 90.1, 56.500004, 90.1);
((GeneralPath)shape).curveTo(53.800003, 90.1, 51.700005, 89.2, 49.900005, 87.4);
((GeneralPath)shape).curveTo(48.100006, 85.600006, 47.300007, 83.1, 47.300007, 79.9);
((GeneralPath)shape).curveTo(47.300007, 76.6, 48.20001, 74.0, 49.900005, 72.1);
((GeneralPath)shape).curveTo(51.600002, 70.2, 53.900005, 69.299995, 56.700005, 69.299995);
((GeneralPath)shape).curveTo(59.200005, 69.299995, 61.100006, 69.99999, 62.700005, 71.49999);
((GeneralPath)shape).curveTo(63.600006, 72.399994, 64.3, 73.59999, 64.8, 75.19999);
((GeneralPath)shape).lineTo(60.800003, 76.19999);
((GeneralPath)shape).curveTo(60.600002, 75.19999, 60.100002, 74.29999, 59.300003, 73.69999);
((GeneralPath)shape).curveTo(58.500004, 73.09999, 57.600002, 72.79999, 56.600002, 72.79999);
((GeneralPath)shape).curveTo(55.100002, 72.79999, 53.9, 73.29999, 53.000004, 74.39999);
((GeneralPath)shape).curveTo(52.100006, 75.499985, 51.600002, 77.19999, 51.600002, 79.59998);
((GeneralPath)shape).curveTo(51.600002, 82.09998, 52.100002, 83.89999, 53.000004, 84.999985);
((GeneralPath)shape).curveTo(53.900005, 86.09998, 55.100002, 86.59998, 56.600002, 86.59998);
((GeneralPath)shape).curveTo(57.7, 86.59998, 58.600002, 86.29998, 59.4, 85.59998);
((GeneralPath)shape).curveTo(60.2, 84.89999, 60.600002, 83.89999, 60.9, 82.39999);
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
	private ext_asc() {
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
       ext_asc base = new ext_asc();
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
       ext_asc base = new ext_asc();
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
        return ext_asc::new;
    }
}

