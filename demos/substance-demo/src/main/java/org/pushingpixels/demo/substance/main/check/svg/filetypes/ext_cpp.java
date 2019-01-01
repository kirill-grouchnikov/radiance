package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_cpp implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.108001708984375, 3.003000020980835), new Point2D.Double(36.108001708984375, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
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
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.1, 83.8);
((GeneralPath)shape).lineTo(26.0, 85.0);
((GeneralPath)shape).curveTo(25.4, 87.2, 24.4, 88.8, 23.0, 89.8);
((GeneralPath)shape).curveTo(21.6, 90.9, 19.8, 91.4, 17.7, 91.4);
((GeneralPath)shape).curveTo(15.000001, 91.4, 12.900001, 90.5, 11.200001, 88.700005);
((GeneralPath)shape).curveTo(9.500001, 86.90001, 8.6, 84.4, 8.6, 81.3);
((GeneralPath)shape).curveTo(8.6, 78.0, 9.5, 75.4, 11.200001, 73.600006);
((GeneralPath)shape).curveTo(12.900002, 71.80001, 15.200001, 70.90001, 18.0, 70.90001);
((GeneralPath)shape).curveTo(20.4, 70.90001, 22.4, 71.600006, 24.0, 73.100006);
((GeneralPath)shape).curveTo(24.9, 73.90001, 25.6, 75.200005, 26.0, 76.8);
((GeneralPath)shape).lineTo(22.0, 77.700005);
((GeneralPath)shape).curveTo(21.8, 76.700005, 21.3, 75.9, 20.5, 75.3);
((GeneralPath)shape).curveTo(19.8, 74.700005, 18.8, 74.4, 17.8, 74.4);
((GeneralPath)shape).curveTo(16.3, 74.4, 15.099999, 74.9, 14.199999, 76.0);
((GeneralPath)shape).curveTo(13.299998, 77.1, 12.799999, 78.8, 12.799999, 81.1);
((GeneralPath)shape).curveTo(12.799999, 83.6, 13.299999, 85.4, 14.199999, 86.5);
((GeneralPath)shape).curveTo(15.099998, 87.6, 16.3, 88.1, 17.699999, 88.1);
((GeneralPath)shape).curveTo(18.8, 88.1, 19.699999, 87.799995, 20.499998, 87.1);
((GeneralPath)shape).curveTo(21.299997, 86.4, 21.799997, 85.2, 22.099998, 83.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.5, 91.100006);
((GeneralPath)shape).lineTo(29.5, 71.2);
((GeneralPath)shape).lineTo(36.0, 71.2);
((GeneralPath)shape).curveTo(38.5, 71.2, 40.1, 71.299995, 40.8, 71.5);
((GeneralPath)shape).curveTo(41.899998, 71.8, 42.899998, 72.4, 43.7, 73.4);
((GeneralPath)shape).curveTo(44.5, 74.4, 44.9, 75.700005, 44.9, 77.3);
((GeneralPath)shape).curveTo(44.9, 78.5, 44.7, 79.5, 44.2, 80.4);
((GeneralPath)shape).curveTo(43.8, 81.200005, 43.2, 81.9, 42.5, 82.4);
((GeneralPath)shape).curveTo(41.8, 82.9, 41.1, 83.200005, 40.4, 83.3);
((GeneralPath)shape).curveTo(39.4, 83.5, 38.0, 83.600006, 36.2, 83.600006);
((GeneralPath)shape).lineTo(33.600002, 83.600006);
((GeneralPath)shape).lineTo(33.600002, 91.100006);
((GeneralPath)shape).lineTo(29.500002, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.5, 74.600006);
((GeneralPath)shape).lineTo(33.5, 80.200005);
((GeneralPath)shape).lineTo(35.7, 80.200005);
((GeneralPath)shape).curveTo(37.3, 80.200005, 38.4, 80.100006, 38.9, 79.9);
((GeneralPath)shape).curveTo(39.4, 79.700005, 39.9, 79.4, 40.2, 78.9);
((GeneralPath)shape).curveTo(40.5, 78.5, 40.7, 77.9, 40.7, 77.4);
((GeneralPath)shape).curveTo(40.7, 76.700005, 40.5, 76.1, 40.100002, 75.6);
((GeneralPath)shape).curveTo(39.7, 75.1, 39.100002, 74.799995, 38.500004, 74.7);
((GeneralPath)shape).curveTo(38.000004, 74.6, 37.100002, 74.6, 35.600002, 74.6);
((GeneralPath)shape).lineTo(33.500004, 74.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.1, 91.100006);
((GeneralPath)shape).lineTo(48.1, 71.2);
((GeneralPath)shape).lineTo(54.6, 71.2);
((GeneralPath)shape).curveTo(57.1, 71.2, 58.699997, 71.299995, 59.399998, 71.5);
((GeneralPath)shape).curveTo(60.499996, 71.8, 61.499996, 72.4, 62.3, 73.4);
((GeneralPath)shape).curveTo(63.1, 74.4, 63.5, 75.700005, 63.5, 77.3);
((GeneralPath)shape).curveTo(63.5, 78.5, 63.3, 79.5, 62.8, 80.4);
((GeneralPath)shape).curveTo(62.399998, 81.200005, 61.8, 81.9, 61.1, 82.4);
((GeneralPath)shape).curveTo(60.399998, 82.9, 59.699997, 83.200005, 59.0, 83.3);
((GeneralPath)shape).curveTo(58.0, 83.5, 56.6, 83.600006, 54.8, 83.600006);
((GeneralPath)shape).lineTo(52.2, 83.600006);
((GeneralPath)shape).lineTo(52.2, 91.100006);
((GeneralPath)shape).lineTo(48.100002, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.1, 74.600006);
((GeneralPath)shape).lineTo(52.1, 80.200005);
((GeneralPath)shape).lineTo(54.3, 80.200005);
((GeneralPath)shape).curveTo(55.899998, 80.200005, 57.0, 80.100006, 57.5, 79.9);
((GeneralPath)shape).curveTo(58.0, 79.700005, 58.5, 79.4, 58.8, 78.9);
((GeneralPath)shape).curveTo(59.1, 78.5, 59.3, 77.9, 59.3, 77.4);
((GeneralPath)shape).curveTo(59.3, 76.700005, 59.1, 76.1, 58.7, 75.6);
((GeneralPath)shape).curveTo(58.3, 75.1, 57.7, 74.799995, 57.100002, 74.7);
((GeneralPath)shape).curveTo(56.600002, 74.6, 55.7, 74.6, 54.2, 74.6);
((GeneralPath)shape).lineTo(52.100002, 74.6);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(13.149999618530273, 22.0), new Point2D.Double(54.150001525878906, 22.0), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 145, 161, 255),new Color(202, 213, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.1, 22.0);
((GeneralPath)shape).lineTo(54.1, 22.0);
((GeneralPath)shape).lineTo(54.1, 26.0);
((GeneralPath)shape).lineTo(13.099998, 26.0);
((GeneralPath)shape).lineTo(13.099998, 22.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new LinearGradientPaint(new Point2D.Double(19.149999618530273, 33.75), new Point2D.Double(60.150001525878906, 33.75), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 145, 161, 255),new Color(202, 213, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.1, 33.7);
((GeneralPath)shape).lineTo(60.1, 33.7);
((GeneralPath)shape).lineTo(60.1, 37.8);
((GeneralPath)shape).lineTo(19.099998, 37.8);
((GeneralPath)shape).lineTo(19.099998, 33.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new LinearGradientPaint(new Point2D.Double(13.149999618530273, 45.75), new Point2D.Double(54.150001525878906, 45.75), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 145, 161, 255),new Color(202, 213, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.1, 45.7);
((GeneralPath)shape).lineTo(54.1, 45.7);
((GeneralPath)shape).lineTo(54.1, 49.8);
((GeneralPath)shape).lineTo(13.099998, 49.8);
((GeneralPath)shape).lineTo(13.099998, 45.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
paint = new LinearGradientPaint(new Point2D.Double(19.149999618530273, 58.0), new Point2D.Double(60.150001525878906, 58.0), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 145, 161, 255),new Color(202, 213, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.1, 58.0);
((GeneralPath)shape).lineTo(60.1, 58.0);
((GeneralPath)shape).lineTo(60.1, 62.0);
((GeneralPath)shape).lineTo(19.099998, 62.0);
((GeneralPath)shape).lineTo(19.099998, 58.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
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
g.setTransform(defaultTransform__0_8);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.13199999928474426;
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
		return 0.7380064129829407;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 0.9999999403953552;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. It is recommended to use the 
	 * {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	public ext_cpp() {
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
       ext_cpp base = new ext_cpp();
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
       ext_cpp base = new ext_cpp();
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
        return () -> new ext_cpp();
    }
}

