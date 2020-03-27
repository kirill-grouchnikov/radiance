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
public class ext_exe implements ResizableIcon {
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.8, 91.1);
((GeneralPath)shape).lineTo(9.8, 71.2);
((GeneralPath)shape).lineTo(24.6, 71.2);
((GeneralPath)shape).lineTo(24.6, 74.6);
((GeneralPath)shape).lineTo(13.9, 74.6);
((GeneralPath)shape).lineTo(13.9, 79.0);
((GeneralPath)shape).lineTo(23.9, 79.0);
((GeneralPath)shape).lineTo(23.9, 82.3);
((GeneralPath)shape).lineTo(13.9, 82.3);
((GeneralPath)shape).lineTo(13.9, 87.700005);
((GeneralPath)shape).lineTo(25.0, 87.700005);
((GeneralPath)shape).lineTo(25.0, 91.0);
((GeneralPath)shape).lineTo(9.8, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.400002, 91.1);
((GeneralPath)shape).lineTo(33.2, 80.7);
((GeneralPath)shape).lineTo(27.0, 71.2);
((GeneralPath)shape).lineTo(31.7, 71.2);
((GeneralPath)shape).lineTo(35.7, 77.6);
((GeneralPath)shape).lineTo(39.600002, 71.2);
((GeneralPath)shape).lineTo(44.300003, 71.2);
((GeneralPath)shape).lineTo(38.100002, 80.799995);
((GeneralPath)shape).lineTo(45.0, 91.1);
((GeneralPath)shape).lineTo(40.1, 91.1);
((GeneralPath)shape).lineTo(35.699997, 84.2);
((GeneralPath)shape).lineTo(31.299997, 91.1);
((GeneralPath)shape).lineTo(26.399998, 91.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.100002, 91.1);
((GeneralPath)shape).lineTo(47.100002, 71.2);
((GeneralPath)shape).lineTo(61.9, 71.2);
((GeneralPath)shape).lineTo(61.9, 74.6);
((GeneralPath)shape).lineTo(51.1, 74.6);
((GeneralPath)shape).lineTo(51.1, 79.0);
((GeneralPath)shape).lineTo(61.1, 79.0);
((GeneralPath)shape).lineTo(61.1, 82.3);
((GeneralPath)shape).lineTo(51.1, 82.3);
((GeneralPath)shape).lineTo(51.1, 87.700005);
((GeneralPath)shape).lineTo(62.3, 87.700005);
((GeneralPath)shape).lineTo(62.3, 91.0);
((GeneralPath)shape).lineTo(47.1, 91.0);
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
((GeneralPath)shape).moveTo(55.1, 36.3);
((GeneralPath)shape).curveTo(55.0, 35.3, 54.8, 34.399998, 54.5, 33.399998);
((GeneralPath)shape).lineTo(59.2, 30.699997);
((GeneralPath)shape).lineTo(54.2, 22.099997);
((GeneralPath)shape).lineTo(49.5, 24.799997);
((GeneralPath)shape).curveTo(48.2, 23.399998, 46.6, 22.199997, 44.9, 21.199997);
((GeneralPath)shape).lineTo(46.300003, 16.099997);
((GeneralPath)shape).lineTo(36.600002, 13.399997);
((GeneralPath)shape).lineTo(35.2, 18.499996);
((GeneralPath)shape).curveTo(34.2, 18.499996, 33.3, 18.499996, 32.3, 18.599997);
((GeneralPath)shape).curveTo(31.3, 18.699997, 30.4, 18.899996, 29.4, 19.199997);
((GeneralPath)shape).lineTo(26.699999, 14.499997);
((GeneralPath)shape).lineTo(18.0, 19.399998);
((GeneralPath)shape).lineTo(20.7, 24.099998);
((GeneralPath)shape).curveTo(19.300001, 25.499998, 18.1, 26.999998, 17.1, 28.699999);
((GeneralPath)shape).lineTo(11.900001, 27.3);
((GeneralPath)shape).lineTo(9.4, 37.0);
((GeneralPath)shape).lineTo(14.599999, 38.4);
((GeneralPath)shape).curveTo(14.599999, 39.4, 14.599999, 40.300003, 14.799999, 41.300003);
((GeneralPath)shape).curveTo(14.9, 42.300003, 15.099999, 43.200005, 15.4, 44.200005);
((GeneralPath)shape).lineTo(10.7, 46.900005);
((GeneralPath)shape).lineTo(15.7, 55.500008);
((GeneralPath)shape).lineTo(20.4, 52.800007);
((GeneralPath)shape).curveTo(21.699999, 54.20001, 23.3, 55.400005, 25.0, 56.400005);
((GeneralPath)shape).lineTo(23.6, 61.500004);
((GeneralPath)shape).lineTo(33.3, 64.200005);
((GeneralPath)shape).lineTo(34.7, 59.100006);
((GeneralPath)shape).curveTo(35.7, 59.100006, 36.600002, 59.100006, 37.600002, 59.000008);
((GeneralPath)shape).curveTo(38.600002, 58.90001, 39.500004, 58.70001, 40.500004, 58.40001);
((GeneralPath)shape).lineTo(43.200005, 63.10001);
((GeneralPath)shape).lineTo(51.900005, 58.20001);
((GeneralPath)shape).lineTo(49.200005, 53.500008);
((GeneralPath)shape).curveTo(50.600006, 52.20001, 51.800003, 50.600006, 52.800003, 48.90001);
((GeneralPath)shape).lineTo(58.000004, 50.30001);
((GeneralPath)shape).lineTo(60.700005, 40.700012);
((GeneralPath)shape).lineTo(55.500004, 39.30001);
((GeneralPath)shape).curveTo(55.300003, 38.30001, 55.300003, 37.30001, 55.100002, 36.30001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.1, 47.0);
((GeneralPath)shape).curveTo(31.599998, 47.6, 27.399998, 44.3, 26.8, 39.9);
((GeneralPath)shape).curveTo(26.199999, 35.4, 29.5, 31.300001, 34.0, 30.7);
((GeneralPath)shape).curveTo(38.5, 30.1, 42.7, 33.4, 43.3, 37.8);
((GeneralPath)shape).curveTo(43.8, 42.3, 40.6, 46.4, 36.1, 47.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(34.96200180053711, 37.84700012207031), new Point2D.Double(34.96200180053711, 88.47000122070312), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
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
	private ext_exe() {
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
       ext_exe base = new ext_exe();
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
       ext_exe base = new ext_exe();
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
        return ext_exe::new;
    }
}

