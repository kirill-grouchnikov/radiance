package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.IsHiDpiAware;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.NeonIcon;
import org.pushingpixels.neon.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_skin implements ResizableIcon, IsHiDpiAware {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.265000104904175), new Point2D.Double(36.0, 100.25), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
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
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
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
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.7, 84.0);
((GeneralPath)shape).lineTo(10.299999, 83.7);
((GeneralPath)shape).curveTo(10.499999, 84.899994, 10.9, 85.7, 11.599999, 86.299995);
((GeneralPath)shape).curveTo(12.299999, 86.899994, 13.099999, 87.1, 14.199999, 87.1);
((GeneralPath)shape).curveTo(15.399999, 87.1, 16.3, 86.9, 16.9, 86.4);
((GeneralPath)shape).curveTo(17.5, 85.9, 17.8, 85.3, 17.8, 84.700005);
((GeneralPath)shape).curveTo(17.8, 84.3, 17.699999, 83.9, 17.4, 83.600006);
((GeneralPath)shape).curveTo(17.1, 83.3, 16.699999, 83.00001, 16.1, 82.8);
((GeneralPath)shape).curveTo(15.700001, 82.700005, 14.700001, 82.4, 13.200001, 82.0);
((GeneralPath)shape).curveTo(11.200001, 81.5, 9.900001, 80.9, 9.1, 80.2);
((GeneralPath)shape).curveTo(8.0, 79.2, 7.4000006, 78.0, 7.4000006, 76.6);
((GeneralPath)shape).curveTo(7.4000006, 75.7, 7.700001, 74.799995, 8.200001, 74.0);
((GeneralPath)shape).curveTo(8.700001, 73.200005, 9.500001, 72.6, 10.500001, 72.2);
((GeneralPath)shape).curveTo(11.500001, 71.799995, 12.700001, 71.6, 14.1, 71.6);
((GeneralPath)shape).curveTo(16.4, 71.6, 18.1, 72.1, 19.2, 73.1);
((GeneralPath)shape).curveTo(20.300001, 74.1, 20.900002, 75.4, 21.0, 77.0);
((GeneralPath)shape).lineTo(17.3, 77.2);
((GeneralPath)shape).curveTo(17.099998, 76.299995, 16.8, 75.6, 16.3, 75.2);
((GeneralPath)shape).curveTo(15.799999, 74.799995, 14.999999, 74.6, 13.999999, 74.6);
((GeneralPath)shape).curveTo(12.899999, 74.6, 12.099999, 74.799995, 11.499999, 75.2);
((GeneralPath)shape).curveTo(11.099999, 75.5, 10.899999, 75.799995, 10.899999, 76.299995);
((GeneralPath)shape).curveTo(10.899999, 76.7, 11.099998, 77.1, 11.399999, 77.399994);
((GeneralPath)shape).curveTo(11.899999, 77.799995, 12.999999, 78.2, 14.799999, 78.59999);
((GeneralPath)shape).curveTo(16.599998, 78.99999, 17.9, 79.399994, 18.699999, 79.899994);
((GeneralPath)shape).curveTo(19.599998, 80.299995, 20.199999, 80.899994, 20.699999, 81.7);
((GeneralPath)shape).curveTo(21.199999, 82.5, 21.4, 83.399994, 21.4, 84.5);
((GeneralPath)shape).curveTo(21.4, 85.5, 21.1, 86.5, 20.5, 87.4);
((GeneralPath)shape).curveTo(19.9, 88.3, 19.1, 89.0, 18.1, 89.4);
((GeneralPath)shape).curveTo(17.0, 89.8, 15.700001, 90.1, 14.200001, 90.1);
((GeneralPath)shape).curveTo(11.900001, 90.1, 10.200001, 89.6, 8.900001, 88.5);
((GeneralPath)shape).curveTo(7.6000004, 87.4, 6.9, 86.0, 6.7, 84.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(24.5, 89.8);
((GeneralPath)shape).lineTo(24.5, 71.9);
((GeneralPath)shape).lineTo(28.2, 71.9);
((GeneralPath)shape).lineTo(28.2, 79.8);
((GeneralPath)shape).lineTo(35.600002, 71.9);
((GeneralPath)shape).lineTo(40.500004, 71.9);
((GeneralPath)shape).lineTo(33.700005, 78.9);
((GeneralPath)shape).lineTo(40.900005, 89.8);
((GeneralPath)shape).lineTo(36.200005, 89.8);
((GeneralPath)shape).lineTo(31.200005, 81.4);
((GeneralPath)shape).lineTo(28.200005, 84.4);
((GeneralPath)shape).lineTo(28.200005, 89.8);
((GeneralPath)shape).lineTo(24.500004, 89.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.6, 89.8);
((GeneralPath)shape).lineTo(42.6, 71.9);
((GeneralPath)shape).lineTo(46.3, 71.9);
((GeneralPath)shape).lineTo(46.3, 89.8);
((GeneralPath)shape).lineTo(42.6, 89.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.699997, 89.8);
((GeneralPath)shape).lineTo(49.699997, 71.9);
((GeneralPath)shape).lineTo(53.299995, 71.9);
((GeneralPath)shape).lineTo(60.699997, 83.9);
((GeneralPath)shape).lineTo(60.699997, 71.9);
((GeneralPath)shape).lineTo(64.1, 71.9);
((GeneralPath)shape).lineTo(64.1, 89.8);
((GeneralPath)shape).lineTo(60.399998, 89.8);
((GeneralPath)shape).lineTo(53.1, 78.100006);
((GeneralPath)shape).lineTo(53.1, 89.8);
((GeneralPath)shape).lineTo(49.699997, 89.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 73.45700073242188), new Point2D.Double(58.569000244140625, 86.95700073242188), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
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
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new LinearGradientPaint(new Point2D.Double(37.0, 56.5), new Point2D.Double(37.0, 36.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.2, 52.2);
((GeneralPath)shape).lineTo(44.8, 50.7);
((GeneralPath)shape).curveTo(45.7, 47.9, 46.6, 45.0, 47.5, 42.2);
((GeneralPath)shape).curveTo(47.8, 41.100002, 48.2, 40.0, 48.9, 39.100002);
((GeneralPath)shape).curveTo(50.0, 37.600002, 51.5, 36.800003, 53.2, 36.600002);
((GeneralPath)shape).curveTo(53.9, 36.500004, 54.600002, 36.4, 55.3, 36.4);
((GeneralPath)shape).lineTo(62.0, 36.4);
((GeneralPath)shape).curveTo(61.9, 36.5, 61.9, 36.600002, 61.9, 36.7);
((GeneralPath)shape).curveTo(61.100002, 38.100002, 60.4, 39.5, 59.600002, 40.9);
((GeneralPath)shape).lineTo(55.4, 48.100002);
((GeneralPath)shape).curveTo(54.5, 49.600002, 53.5, 51.100002, 52.300003, 52.500004);
((GeneralPath)shape).curveTo(51.500004, 53.500004, 50.600002, 54.500004, 49.500004, 55.200005);
((GeneralPath)shape).curveTo(48.700005, 55.700005, 47.900005, 56.000004, 47.000004, 56.000004);
((GeneralPath)shape).lineTo(37.100006, 56.000004);
((GeneralPath)shape).curveTo(36.100006, 56.000004, 35.300007, 55.600002, 34.600006, 55.000004);
((GeneralPath)shape).curveTo(33.600006, 54.100002, 33.000008, 52.800003, 32.500008, 51.600002);
((GeneralPath)shape).curveTo(31.600008, 49.300003, 31.100008, 46.800003, 30.500008, 44.4);
((GeneralPath)shape).curveTo(30.200008, 43.300003, 29.900007, 42.100002, 29.600008, 41.0);
((GeneralPath)shape).curveTo(29.600008, 40.9, 29.500008, 40.9, 29.500008, 40.8);
((GeneralPath)shape).lineTo(29.300007, 41.0);
((GeneralPath)shape).curveTo(28.000008, 42.3, 26.900007, 43.7, 25.900007, 45.2);
((GeneralPath)shape).curveTo(25.600008, 45.600002, 25.500008, 46.100002, 25.400007, 46.600002);
((GeneralPath)shape).curveTo(24.800007, 48.4, 24.300007, 50.2, 23.700006, 51.9);
((GeneralPath)shape).curveTo(23.100006, 53.600002, 22.100006, 54.9, 20.400007, 55.7);
((GeneralPath)shape).curveTo(19.400007, 56.2, 18.400007, 56.4, 17.300007, 56.4);
((GeneralPath)shape).curveTo(15.7000065, 56.4, 14.100007, 56.4, 12.500007, 56.5);
((GeneralPath)shape).curveTo(12.100007, 56.5, 12.100007, 56.5, 12.2000065, 56.1);
((GeneralPath)shape).curveTo(12.900006, 53.6, 13.7000065, 51.1, 14.800007, 48.699997);
((GeneralPath)shape).curveTo(15.900007, 46.199997, 17.200006, 43.899998, 18.900007, 41.799995);
((GeneralPath)shape).curveTo(20.000008, 40.299995, 21.300007, 38.999996, 22.800007, 37.999996);
((GeneralPath)shape).curveTo(23.600006, 37.499996, 24.400007, 37.099995, 25.400007, 36.999996);
((GeneralPath)shape).lineTo(36.0, 36.999996);
((GeneralPath)shape).curveTo(37.8, 36.999996, 39.1, 37.699997, 40.1, 39.199997);
((GeneralPath)shape).curveTo(40.699997, 40.1, 41.1, 41.1, 41.5, 42.1);
((GeneralPath)shape).curveTo(42.2, 44.199997, 42.7, 46.3, 43.2, 48.399998);
((GeneralPath)shape).lineTo(44.100002, 51.999996);
((GeneralPath)shape).curveTo(44.100002, 52.099995, 44.100002, 52.199997, 44.2, 52.199997);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
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
	 * Creates a new transcoded SVG image. It is recommended to use the 
	 * {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	public ext_skin() {
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
     * Returns an instance of this icon with specified dimensions.
     */
    public static NeonIcon of(int width, int height) {
       ext_skin base = new ext_skin();
       base.width = width;
       base.height = height;
       return new NeonIcon(base);
    }

    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_skin base = new ext_skin();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }
}

