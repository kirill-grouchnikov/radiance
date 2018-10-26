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
public class ext_lock implements ResizableIcon, IsHiDpiAware {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
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
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
paint = new LinearGradientPaint(new Point2D.Double(36.79999923706055, 61.5890007019043), new Point2D.Double(36.79999923706055, 20.33300018310547), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(51.4, 37.7);
((GeneralPath)shape).lineTo(48.5, 37.7);
((GeneralPath)shape).lineTo(48.5, 32.0);
((GeneralPath)shape).curveTo(48.5, 25.6, 43.3, 20.3, 36.8, 20.3);
((GeneralPath)shape).curveTo(30.3, 20.3, 25.1, 25.6, 25.1, 32.0);
((GeneralPath)shape).lineTo(25.1, 37.7);
((GeneralPath)shape).lineTo(22.2, 37.7);
((GeneralPath)shape).curveTo(21.1, 37.7, 20.2, 38.600002, 20.2, 39.7);
((GeneralPath)shape).lineTo(20.2, 59.5);
((GeneralPath)shape).curveTo(20.2, 60.6, 21.1, 61.5, 22.2, 61.5);
((GeneralPath)shape).lineTo(51.300003, 61.5);
((GeneralPath)shape).curveTo(52.4, 61.5, 53.300003, 60.6, 53.300003, 59.5);
((GeneralPath)shape).lineTo(53.300003, 39.8);
((GeneralPath)shape).curveTo(53.4, 38.6, 52.500004, 37.7, 51.4, 37.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(39.3, 54.2);
((GeneralPath)shape).curveTo(39.5, 54.9, 39.0, 55.5, 38.3, 55.5);
((GeneralPath)shape).lineTo(35.3, 55.5);
((GeneralPath)shape).curveTo(34.6, 55.5, 34.1, 54.8, 34.3, 54.2);
((GeneralPath)shape).lineTo(35.3, 50.5);
((GeneralPath)shape).curveTo(34.2, 49.9, 33.399998, 48.8, 33.399998, 47.4);
((GeneralPath)shape).curveTo(33.399998, 45.4, 34.999996, 43.9, 36.899998, 43.9);
((GeneralPath)shape).curveTo(38.8, 43.9, 40.399998, 45.5, 40.399998, 47.4);
((GeneralPath)shape).curveTo(40.399998, 48.800003, 39.6, 50.0, 38.499996, 50.5);
((GeneralPath)shape).lineTo(39.299995, 54.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.6, 37.7);
((GeneralPath)shape).lineTo(31.0, 37.7);
((GeneralPath)shape).lineTo(31.0, 32.0);
((GeneralPath)shape).curveTo(31.0, 28.8, 33.6, 26.2, 36.8, 26.2);
((GeneralPath)shape).curveTo(40.0, 26.2, 42.6, 28.800001, 42.6, 32.0);
((GeneralPath)shape).lineTo(42.6, 37.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
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
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.0, 91.9);
((GeneralPath)shape).lineTo(7.0, 76.3);
((GeneralPath)shape).lineTo(10.2, 76.3);
((GeneralPath)shape).lineTo(10.2, 89.3);
((GeneralPath)shape).lineTo(18.1, 89.3);
((GeneralPath)shape).lineTo(18.1, 92.0);
((GeneralPath)shape).lineTo(7.0, 92.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.7, 84.1);
((GeneralPath)shape).curveTo(19.7, 82.5, 19.900002, 81.1, 20.400002, 80.1);
((GeneralPath)shape).curveTo(20.800001, 79.299995, 21.2, 78.6, 21.900002, 77.9);
((GeneralPath)shape).curveTo(22.500002, 77.3, 23.2, 76.8, 23.900002, 76.5);
((GeneralPath)shape).curveTo(24.900002, 76.1, 26.000002, 75.9, 27.300001, 75.9);
((GeneralPath)shape).curveTo(29.6, 75.9, 31.5, 76.6, 32.9, 78.1);
((GeneralPath)shape).curveTo(34.300003, 79.5, 35.0, 81.5, 35.0, 84.1);
((GeneralPath)shape).curveTo(35.0, 86.6, 34.3, 88.6, 32.9, 90.1);
((GeneralPath)shape).curveTo(31.500002, 91.5, 29.7, 92.299995, 27.400002, 92.299995);
((GeneralPath)shape).curveTo(25.100002, 92.299995, 23.2, 91.6, 21.800001, 90.2);
((GeneralPath)shape).curveTo(20.400002, 88.6, 19.7, 86.6, 19.7, 84.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.0, 84.0);
((GeneralPath)shape).curveTo(23.0, 85.8, 23.4, 87.1, 24.2, 88.1);
((GeneralPath)shape).curveTo(25.0, 89.0, 26.1, 89.5, 27.300001, 89.5);
((GeneralPath)shape).curveTo(28.500002, 89.5, 29.6, 89.0, 30.400002, 88.1);
((GeneralPath)shape).curveTo(31.2, 87.2, 31.600002, 85.799995, 31.600002, 84.0);
((GeneralPath)shape).curveTo(31.600002, 82.2, 31.200003, 80.8, 30.400002, 80.0);
((GeneralPath)shape).curveTo(29.600002, 79.1, 28.600002, 78.7, 27.2, 78.7);
((GeneralPath)shape).curveTo(25.8, 78.7, 25.0, 79.0, 24.2, 79.899994);
((GeneralPath)shape).curveTo(23.400002, 80.799995, 23.0, 82.2, 23.0, 83.99999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.6, 86.1);
((GeneralPath)shape).lineTo(50.699997, 87.1);
((GeneralPath)shape).curveTo(50.199997, 88.799995, 49.399998, 90.1, 48.299995, 90.9);
((GeneralPath)shape).curveTo(47.199997, 91.700005, 45.799995, 92.200005, 44.099995, 92.200005);
((GeneralPath)shape).curveTo(41.999996, 92.200005, 40.299995, 91.50001, 38.899994, 90.100006);
((GeneralPath)shape).curveTo(37.599995, 88.700005, 36.899994, 86.700005, 36.899994, 84.200005);
((GeneralPath)shape).curveTo(36.899994, 81.600006, 37.599995, 79.50001, 38.899994, 78.100006);
((GeneralPath)shape).curveTo(40.299995, 76.700005, 41.999992, 75.90001, 44.199993, 75.90001);
((GeneralPath)shape).curveTo(46.099995, 75.90001, 47.699993, 76.50001, 48.899994, 77.600006);
((GeneralPath)shape).curveTo(49.599995, 78.3, 50.199993, 79.200005, 50.499992, 80.50001);
((GeneralPath)shape).lineTo(47.399994, 81.30001);
((GeneralPath)shape).curveTo(47.199993, 80.50001, 46.799995, 79.80001, 46.199993, 79.40001);
((GeneralPath)shape).curveTo(45.59999, 79.00001, 44.899994, 78.70001, 43.999992, 78.70001);
((GeneralPath)shape).curveTo(42.79999, 78.70001, 41.899994, 79.10001, 41.199993, 80.000015);
((GeneralPath)shape).curveTo(40.499992, 80.90002, 40.099995, 82.20001, 40.099995, 84.10001);
((GeneralPath)shape).curveTo(40.099995, 86.10001, 40.499996, 87.500015, 41.199993, 88.40002);
((GeneralPath)shape).curveTo(41.899994, 89.20002, 42.79999, 89.70002, 43.999992, 89.70002);
((GeneralPath)shape).curveTo(44.79999, 89.70002, 45.59999, 89.40002, 46.199993, 88.90002);
((GeneralPath)shape).curveTo(46.899994, 88.10001, 47.29999, 87.20002, 47.599995, 86.10001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.399998, 91.9);
((GeneralPath)shape).lineTo(53.399998, 76.1);
((GeneralPath)shape).lineTo(56.6, 76.1);
((GeneralPath)shape).lineTo(56.6, 83.1);
((GeneralPath)shape).lineTo(63.0, 76.1);
((GeneralPath)shape).lineTo(67.3, 76.1);
((GeneralPath)shape).lineTo(61.4, 82.2);
((GeneralPath)shape).lineTo(67.700005, 91.799995);
((GeneralPath)shape).lineTo(63.600006, 91.799995);
((GeneralPath)shape).lineTo(59.300007, 84.399994);
((GeneralPath)shape).lineTo(56.70001, 86.99999);
((GeneralPath)shape).lineTo(56.70001, 91.799995);
((GeneralPath)shape).lineTo(53.40001, 91.799995);
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
	public ext_lock() {
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
       ext_lock base = new ext_lock();
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
       ext_lock base = new ext_lock();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }
}

