package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconFactory;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_idx implements ResizableIcon {
    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
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
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
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
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.8, 90.1);
((GeneralPath)shape).lineTo(15.8, 70.2);
((GeneralPath)shape).lineTo(19.9, 70.2);
((GeneralPath)shape).lineTo(19.9, 90.0);
((GeneralPath)shape).lineTo(15.799999, 90.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.7, 70.2);
((GeneralPath)shape).lineTo(31.1, 70.2);
((GeneralPath)shape).curveTo(32.8, 70.2, 34.0, 70.299995, 34.9, 70.6);
((GeneralPath)shape).curveTo(36.100002, 70.9, 37.100002, 71.6, 37.9, 72.4);
((GeneralPath)shape).curveTo(38.7, 73.200005, 39.4, 74.3, 39.800003, 75.6);
((GeneralPath)shape).curveTo(40.200005, 76.9, 40.500004, 78.4, 40.500004, 80.299995);
((GeneralPath)shape).curveTo(40.500004, 81.899994, 40.300003, 83.299995, 39.900005, 84.49999);
((GeneralPath)shape).curveTo(39.400005, 85.899994, 38.700005, 87.09999, 37.700005, 87.99999);
((GeneralPath)shape).curveTo(37.000004, 88.69999, 36.000004, 89.19999, 34.800003, 89.59999);
((GeneralPath)shape).curveTo(33.9, 89.899994, 32.700005, 89.99999, 31.200003, 89.99999);
((GeneralPath)shape).lineTo(23.600002, 89.99999);
((GeneralPath)shape).lineTo(23.600002, 70.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.800001, 73.6);
((GeneralPath)shape).lineTo(27.800001, 86.7);
((GeneralPath)shape).lineTo(30.800001, 86.7);
((GeneralPath)shape).curveTo(31.900002, 86.7, 32.800003, 86.6, 33.300003, 86.5);
((GeneralPath)shape).curveTo(34.000004, 86.3, 34.500004, 86.1, 34.9, 85.7);
((GeneralPath)shape).curveTo(35.300003, 85.299995, 35.7, 84.7, 36.0, 83.799995);
((GeneralPath)shape).curveTo(36.3, 82.899994, 36.4, 81.7, 36.4, 80.2);
((GeneralPath)shape).curveTo(36.4, 78.7, 36.300003, 77.5, 36.0, 76.7);
((GeneralPath)shape).curveTo(35.7, 75.899994, 35.3, 75.2, 34.8, 74.799995);
((GeneralPath)shape).curveTo(34.3, 74.299995, 33.7, 73.99999, 32.899998, 73.899994);
((GeneralPath)shape).curveTo(32.3, 73.799995, 31.199997, 73.7, 29.599998, 73.7);
((GeneralPath)shape).lineTo(27.8, 73.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.0, 90.1);
((GeneralPath)shape).lineTo(48.9, 79.7);
((GeneralPath)shape).lineTo(42.7, 70.2);
((GeneralPath)shape).lineTo(47.4, 70.2);
((GeneralPath)shape).lineTo(51.4, 76.6);
((GeneralPath)shape).lineTo(55.4, 70.2);
((GeneralPath)shape).lineTo(60.0, 70.2);
((GeneralPath)shape).lineTo(53.7, 79.799995);
((GeneralPath)shape).lineTo(60.6, 90.0);
((GeneralPath)shape).lineTo(55.699997, 90.0);
((GeneralPath)shape).lineTo(51.199997, 83.1);
((GeneralPath)shape).lineTo(46.699997, 90.0);
((GeneralPath)shape).lineTo(42.0, 90.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.8, 32.0);
((GeneralPath)shape).curveTo(31.699999, 32.1, 31.699999, 32.1, 31.8, 32.0);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
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
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
paint = new LinearGradientPaint(new Point2D.Double(35.525001525878906, 61.0), new Point2D.Double(35.525001525878906, 16.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(52.7, 43.8);
((GeneralPath)shape).curveTo(52.7, 46.6, 50.600002, 56.3, 50.600002, 56.3);
((GeneralPath)shape).curveTo(50.100002, 58.5, 48.000004, 61.0, 45.300003, 61.0);
((GeneralPath)shape).lineTo(32.6, 61.0);
((GeneralPath)shape).curveTo(30.699999, 61.0, 28.999998, 59.9, 28.3, 58.2);
((GeneralPath)shape).curveTo(28.3, 58.2, 22.099998, 46.7, 19.5, 42.5);
((GeneralPath)shape).curveTo(17.8, 39.6, 17.8, 39.6, 20.0, 38.4);
((GeneralPath)shape).curveTo(20.4, 38.2, 20.8, 38.100002, 21.2, 38.100002);
((GeneralPath)shape).curveTo(22.1, 38.100002, 22.7, 38.600002, 23.300001, 39.300003);
((GeneralPath)shape).lineTo(27.1, 43.700005);
((GeneralPath)shape).lineTo(28.300001, 45.200005);
((GeneralPath)shape).lineTo(28.300001, 18.4);
((GeneralPath)shape).curveTo(28.300001, 17.1, 29.500002, 16.0, 30.900002, 16.0);
((GeneralPath)shape).curveTo(32.2, 16.0, 33.300003, 17.1, 33.300003, 18.4);
((GeneralPath)shape).lineTo(33.700005, 35.5);
((GeneralPath)shape).lineTo(35.0, 35.5);
((GeneralPath)shape).lineTo(35.2, 32.5);
((GeneralPath)shape).curveTo(35.2, 31.2, 36.3, 30.1, 37.600002, 30.1);
((GeneralPath)shape).curveTo(38.9, 30.1, 40.000004, 31.2, 40.000004, 32.5);
((GeneralPath)shape).lineTo(40.200005, 36.1);
((GeneralPath)shape).lineTo(41.300003, 36.1);
((GeneralPath)shape).lineTo(41.500004, 33.699997);
((GeneralPath)shape).curveTo(41.500004, 32.399998, 42.600002, 31.299997, 43.900005, 31.299997);
((GeneralPath)shape).curveTo(45.200005, 31.299997, 46.300007, 32.399998, 46.300007, 33.799995);
((GeneralPath)shape).lineTo(46.500008, 36.199997);
((GeneralPath)shape).lineTo(46.500008, 36.799995);
((GeneralPath)shape).lineTo(47.40001, 36.799995);
((GeneralPath)shape).lineTo(47.60001, 35.599995);
((GeneralPath)shape).curveTo(47.60001, 34.299995, 48.70001, 33.199993, 50.00001, 33.199993);
((GeneralPath)shape).curveTo(51.30001, 33.199993, 52.400013, 34.29999, 52.400013, 35.599995);
((GeneralPath)shape).curveTo(52.700012, 35.599995, 52.700012, 40.999996, 52.700012, 43.799995);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.13099999725818634;
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
		return 0.7420064210891724;
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
	 * Creates a new transcoded SVG image. It is recommended to use the 
	 * {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	public ext_idx() {
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
       ext_idx base = new ext_idx();
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
       ext_idx base = new ext_idx();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static ResizableIconFactory factory() {
        return () -> new ext_idx();
    }
}

