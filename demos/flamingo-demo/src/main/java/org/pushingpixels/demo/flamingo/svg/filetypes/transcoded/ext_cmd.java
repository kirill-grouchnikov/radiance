package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.IsHiDpiAware;
import org.pushingpixels.neon.icon.NeonIcon;
import org.pushingpixels.neon.icon.NeonIconUIResource;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconFactory;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_cmd implements ResizableIcon, IsHiDpiAware {
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
paint = new Color(0, 0, 0, 0);
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
((GeneralPath)shape).moveTo(18.8, 83.8);
((GeneralPath)shape).lineTo(22.699999, 85.0);
((GeneralPath)shape).curveTo(22.099998, 87.2, 21.099998, 88.8, 19.699999, 89.8);
((GeneralPath)shape).curveTo(18.3, 90.9, 16.499998, 91.4, 14.399999, 91.4);
((GeneralPath)shape).curveTo(11.699999, 91.4, 9.599998, 90.5, 7.8999987, 88.700005);
((GeneralPath)shape).curveTo(6.199999, 86.90001, 5.2999988, 84.4, 5.2999988, 81.3);
((GeneralPath)shape).curveTo(5.2999988, 78.0, 6.199999, 75.4, 7.8999987, 73.600006);
((GeneralPath)shape).curveTo(9.599998, 71.80001, 11.899999, 70.90001, 14.699999, 70.90001);
((GeneralPath)shape).curveTo(17.099998, 70.90001, 19.099998, 71.600006, 20.699999, 73.100006);
((GeneralPath)shape).curveTo(21.599998, 73.90001, 22.3, 75.200005, 22.699999, 76.8);
((GeneralPath)shape).lineTo(18.699999, 77.700005);
((GeneralPath)shape).curveTo(18.499998, 76.700005, 17.999998, 75.9, 17.199999, 75.3);
((GeneralPath)shape).curveTo(16.499998, 74.700005, 15.499999, 74.4, 14.499999, 74.4);
((GeneralPath)shape).curveTo(12.999999, 74.4, 11.799999, 74.9, 10.9, 76.0);
((GeneralPath)shape).curveTo(10.0, 77.1, 9.4, 78.7, 9.4, 81.0);
((GeneralPath)shape).curveTo(9.4, 83.5, 9.9, 85.3, 10.799999, 86.4);
((GeneralPath)shape).curveTo(11.699999, 87.5, 12.9, 88.0, 14.299999, 88.0);
((GeneralPath)shape).curveTo(15.4, 88.0, 16.3, 87.7, 17.099998, 87.0);
((GeneralPath)shape).curveTo(17.899998, 86.3, 18.399998, 85.2, 18.8, 83.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.099998, 91.100006);
((GeneralPath)shape).lineTo(26.099998, 71.2);
((GeneralPath)shape).lineTo(32.1, 71.2);
((GeneralPath)shape).lineTo(35.699997, 84.7);
((GeneralPath)shape).lineTo(39.299995, 71.2);
((GeneralPath)shape).lineTo(45.299995, 71.2);
((GeneralPath)shape).lineTo(45.299995, 91.0);
((GeneralPath)shape).lineTo(41.599995, 91.0);
((GeneralPath)shape).lineTo(41.599995, 75.4);
((GeneralPath)shape).lineTo(37.599995, 91.0);
((GeneralPath)shape).lineTo(33.699993, 91.0);
((GeneralPath)shape).lineTo(29.699993, 75.4);
((GeneralPath)shape).lineTo(29.699993, 91.0);
((GeneralPath)shape).lineTo(26.099993, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.399998, 71.200005);
((GeneralPath)shape).lineTo(56.8, 71.200005);
((GeneralPath)shape).curveTo(58.5, 71.200005, 59.7, 71.3, 60.6, 71.600006);
((GeneralPath)shape).curveTo(61.8, 71.90001, 62.8, 72.600006, 63.6, 73.40001);
((GeneralPath)shape).curveTo(64.399994, 74.20001, 65.1, 75.30001, 65.5, 76.600006);
((GeneralPath)shape).curveTo(65.9, 77.90001, 66.2, 79.40001, 66.2, 81.3);
((GeneralPath)shape).curveTo(66.2, 82.9, 66.0, 84.3, 65.6, 85.5);
((GeneralPath)shape).curveTo(65.1, 86.9, 64.4, 88.1, 63.5, 89.0);
((GeneralPath)shape).curveTo(62.8, 89.7, 61.9, 90.2, 60.7, 90.6);
((GeneralPath)shape).curveTo(59.8, 90.9, 58.600002, 91.0, 57.100002, 91.0);
((GeneralPath)shape).lineTo(49.500004, 91.0);
((GeneralPath)shape).lineTo(49.500004, 71.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.399998, 74.600006);
((GeneralPath)shape).lineTo(53.399998, 87.700005);
((GeneralPath)shape).lineTo(56.399998, 87.700005);
((GeneralPath)shape).curveTo(57.499996, 87.700005, 58.3, 87.600006, 58.8, 87.50001);
((GeneralPath)shape).curveTo(59.5, 87.30001, 60.0, 87.100006, 60.399998, 86.700005);
((GeneralPath)shape).curveTo(60.799995, 86.3, 61.199997, 85.700005, 61.499996, 84.8);
((GeneralPath)shape).curveTo(61.799995, 83.9, 61.899998, 82.700005, 61.899998, 81.200005);
((GeneralPath)shape).curveTo(61.899998, 79.700005, 61.8, 78.50001, 61.499996, 77.700005);
((GeneralPath)shape).curveTo(61.199993, 76.9, 60.799995, 76.200005, 60.399998, 75.8);
((GeneralPath)shape).curveTo(59.899998, 75.3, 59.3, 75.0, 58.499996, 74.9);
((GeneralPath)shape).curveTo(57.899998, 74.8, 56.799995, 74.700005, 55.199997, 74.700005);
((GeneralPath)shape).lineTo(53.399998, 74.700005);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(36.75, 64.0), new Point2D.Double(36.75, 17.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(60.0, 17.5);
((GeneralPath)shape).lineTo(13.5, 17.5);
((GeneralPath)shape).lineTo(13.5, 64.0);
((GeneralPath)shape).lineTo(60.0, 64.0);
((GeneralPath)shape).lineTo(60.0, 17.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(22.8, 26.8);
((GeneralPath)shape).lineTo(18.199999, 26.8);
((GeneralPath)shape).lineTo(18.199999, 22.199999);
((GeneralPath)shape).lineTo(22.8, 22.199999);
((GeneralPath)shape).lineTo(22.8, 26.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(55.3, 26.8);
((GeneralPath)shape).lineTo(27.5, 26.8);
((GeneralPath)shape).lineTo(27.5, 22.199999);
((GeneralPath)shape).lineTo(55.4, 22.199999);
((GeneralPath)shape).lineTo(55.4, 26.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(55.3, 59.3);
((GeneralPath)shape).lineTo(18.1, 59.3);
((GeneralPath)shape).lineTo(18.1, 31.5);
((GeneralPath)shape).lineTo(55.300003, 31.5);
((GeneralPath)shape).lineTo(55.300003, 59.3);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new LinearGradientPaint(new Point2D.Double(28.108999252319336, 52.694000244140625), new Point2D.Double(28.108999252319336, 35.45600128173828), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.4, 35.5);
((GeneralPath)shape).lineTo(22.199999, 38.7);
((GeneralPath)shape).lineTo(27.5, 44.100002);
((GeneralPath)shape).lineTo(22.2, 49.4);
((GeneralPath)shape).lineTo(25.400002, 52.7);
((GeneralPath)shape).lineTo(34.100002, 44.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new LinearGradientPaint(new Point2D.Double(37.75, 55.70000076293945), new Point2D.Double(37.75, 51.04999923706055), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(33.1, 51.0);
((GeneralPath)shape).lineTo(42.399998, 51.0);
((GeneralPath)shape).lineTo(42.399998, 55.7);
((GeneralPath)shape).lineTo(33.1, 55.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
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
g.setTransform(defaultTransform__0_7);
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
	public ext_cmd() {
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
    public boolean isHiDpiAware() {
        return true;
    }

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
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
    public static NeonIcon of(int width, int height) {
       ext_cmd base = new ext_cmd();
       base.width = width;
       base.height = height;
       return new NeonIcon(base);
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_cmd base = new ext_cmd();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static ResizableIconFactory factory() {
        return () -> new NeonIcon(new ext_cmd());
    }
}

