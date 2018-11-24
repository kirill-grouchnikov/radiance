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
public class ext_app implements ResizableIcon, IsHiDpiAware {
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
((GeneralPath)shape).moveTo(28.0, 91.1);
((GeneralPath)shape).lineTo(23.6, 91.1);
((GeneralPath)shape).lineTo(21.9, 86.6);
((GeneralPath)shape).lineTo(13.9, 86.6);
((GeneralPath)shape).lineTo(12.299999, 91.1);
((GeneralPath)shape).lineTo(8.0, 91.1);
((GeneralPath)shape).lineTo(15.8, 71.3);
((GeneralPath)shape).lineTo(20.0, 71.3);
((GeneralPath)shape).lineTo(28.0, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(20.6, 83.2);
((GeneralPath)shape).lineTo(17.800001, 75.799995);
((GeneralPath)shape).lineTo(15.100001, 83.2);
((GeneralPath)shape).lineTo(20.600002, 83.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.1, 91.1);
((GeneralPath)shape).lineTo(30.1, 71.2);
((GeneralPath)shape).lineTo(36.6, 71.2);
((GeneralPath)shape).curveTo(39.1, 71.2, 40.699997, 71.299995, 41.399998, 71.5);
((GeneralPath)shape).curveTo(42.499996, 71.8, 43.499996, 72.4, 44.3, 73.4);
((GeneralPath)shape).curveTo(45.1, 74.4, 45.5, 75.700005, 45.5, 77.3);
((GeneralPath)shape).curveTo(45.5, 78.5, 45.3, 79.5, 44.8, 80.4);
((GeneralPath)shape).curveTo(44.399998, 81.200005, 43.8, 81.9, 43.1, 82.4);
((GeneralPath)shape).curveTo(42.399998, 82.9, 41.699997, 83.200005, 41.0, 83.3);
((GeneralPath)shape).curveTo(40.0, 83.5, 38.6, 83.600006, 36.8, 83.600006);
((GeneralPath)shape).lineTo(34.2, 83.600006);
((GeneralPath)shape).lineTo(34.2, 91.100006);
((GeneralPath)shape).lineTo(30.1, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(34.2, 74.6);
((GeneralPath)shape).lineTo(34.2, 80.2);
((GeneralPath)shape).lineTo(36.4, 80.2);
((GeneralPath)shape).curveTo(38.0, 80.2, 39.100002, 80.1, 39.600002, 79.899994);
((GeneralPath)shape).curveTo(40.100002, 79.7, 40.600002, 79.399994, 40.9, 78.899994);
((GeneralPath)shape).curveTo(41.2, 78.49999, 41.4, 77.899994, 41.4, 77.399994);
((GeneralPath)shape).curveTo(41.4, 76.7, 41.2, 76.09999, 40.800003, 75.59999);
((GeneralPath)shape).curveTo(40.4, 75.09999, 39.800003, 74.79999, 39.200005, 74.69999);
((GeneralPath)shape).curveTo(38.700005, 74.59999, 37.800003, 74.59999, 36.300003, 74.59999);
((GeneralPath)shape).lineTo(34.200005, 74.59999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.7, 91.1);
((GeneralPath)shape).lineTo(48.7, 71.2);
((GeneralPath)shape).lineTo(55.2, 71.2);
((GeneralPath)shape).curveTo(57.7, 71.2, 59.3, 71.299995, 60.0, 71.5);
((GeneralPath)shape).curveTo(61.1, 71.8, 62.1, 72.4, 62.9, 73.4);
((GeneralPath)shape).curveTo(63.7, 74.4, 64.1, 75.700005, 64.1, 77.3);
((GeneralPath)shape).curveTo(64.1, 78.5, 63.899998, 79.5, 63.399998, 80.4);
((GeneralPath)shape).curveTo(62.999996, 81.200005, 62.399998, 81.9, 61.699997, 82.4);
((GeneralPath)shape).curveTo(60.999996, 82.9, 60.299995, 83.200005, 59.6, 83.3);
((GeneralPath)shape).curveTo(58.6, 83.5, 57.199997, 83.600006, 55.399998, 83.600006);
((GeneralPath)shape).lineTo(52.8, 83.600006);
((GeneralPath)shape).lineTo(52.8, 91.100006);
((GeneralPath)shape).lineTo(48.7, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.8, 74.6);
((GeneralPath)shape).lineTo(52.8, 80.2);
((GeneralPath)shape).lineTo(55.0, 80.2);
((GeneralPath)shape).curveTo(56.6, 80.2, 57.7, 80.1, 58.2, 79.899994);
((GeneralPath)shape).curveTo(58.7, 79.7, 59.2, 79.399994, 59.5, 78.899994);
((GeneralPath)shape).curveTo(59.8, 78.49999, 60.0, 77.899994, 60.0, 77.399994);
((GeneralPath)shape).curveTo(60.0, 76.7, 59.8, 76.09999, 59.4, 75.59999);
((GeneralPath)shape).curveTo(59.0, 75.09999, 58.4, 74.79999, 57.800003, 74.69999);
((GeneralPath)shape).curveTo(57.300003, 74.59999, 56.4, 74.59999, 54.9, 74.59999);
((GeneralPath)shape).lineTo(52.800003, 74.59999);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(34.96200180053711, 37.84700012207031), new Point2D.Double(34.96200180053711, 88.47000122070312), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
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
g.setTransform(defaultTransform__0_5);
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
	public ext_app() {
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
       ext_app base = new ext_app();
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
       ext_app base = new ext_app();
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
        return () -> new NeonIcon(new ext_app());
    }
}

