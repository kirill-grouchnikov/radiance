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
public class ext_kts implements ResizableIcon, IsHiDpiAware {
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
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 97.0), new Point2D.Double(36.20000076293945, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
((GeneralPath)shape).moveTo(10.5, 90.1);
((GeneralPath)shape).lineTo(10.5, 70.2);
((GeneralPath)shape).lineTo(14.6, 70.2);
((GeneralPath)shape).lineTo(14.6, 79.0);
((GeneralPath)shape).lineTo(22.8, 70.2);
((GeneralPath)shape).lineTo(28.3, 70.2);
((GeneralPath)shape).lineTo(20.7, 78.0);
((GeneralPath)shape).lineTo(28.7, 90.1);
((GeneralPath)shape).lineTo(23.400002, 90.1);
((GeneralPath)shape).lineTo(17.900002, 80.799995);
((GeneralPath)shape).lineTo(14.600001, 84.1);
((GeneralPath)shape).lineTo(14.600001, 90.1);
((GeneralPath)shape).lineTo(10.500002, 90.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.3, 90.1);
((GeneralPath)shape).lineTo(35.3, 73.6);
((GeneralPath)shape).lineTo(29.3, 73.6);
((GeneralPath)shape).lineTo(29.3, 70.2);
((GeneralPath)shape).lineTo(45.3, 70.2);
((GeneralPath)shape).lineTo(45.3, 73.6);
((GeneralPath)shape).lineTo(39.3, 73.6);
((GeneralPath)shape).lineTo(39.3, 90.1);
((GeneralPath)shape).lineTo(35.3, 90.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.9, 83.6);
((GeneralPath)shape).lineTo(50.9, 83.2);
((GeneralPath)shape).curveTo(51.100002, 84.5, 51.600002, 85.5, 52.300003, 86.1);
((GeneralPath)shape).curveTo(53.000004, 86.7, 54.000004, 87.0, 55.200005, 87.0);
((GeneralPath)shape).curveTo(56.500004, 87.0, 57.500004, 86.7, 58.200005, 86.2);
((GeneralPath)shape).curveTo(58.900005, 85.7, 59.200005, 85.0, 59.200005, 84.299995);
((GeneralPath)shape).curveTo(59.200005, 83.799995, 59.100006, 83.399994, 58.800003, 83.1);
((GeneralPath)shape).curveTo(58.500004, 82.799995, 58.000004, 82.5, 57.300003, 82.2);
((GeneralPath)shape).curveTo(56.800003, 82.0, 55.700005, 81.7, 54.000004, 81.299995);
((GeneralPath)shape).curveTo(51.800003, 80.799995, 50.300003, 80.1, 49.400005, 79.299995);
((GeneralPath)shape).curveTo(48.200005, 78.2, 47.500004, 76.899994, 47.500004, 75.299995);
((GeneralPath)shape).curveTo(47.500004, 74.299995, 47.800003, 73.299995, 48.400005, 72.49999);
((GeneralPath)shape).curveTo(49.000008, 71.69999, 49.800007, 70.99999, 50.900005, 70.49999);
((GeneralPath)shape).curveTo(52.000004, 69.99999, 53.300007, 69.799995, 54.900005, 69.799995);
((GeneralPath)shape).curveTo(57.400005, 69.799995, 59.300007, 70.299995, 60.600006, 71.399994);
((GeneralPath)shape).curveTo(61.900005, 72.49999, 62.500008, 73.899994, 62.600006, 75.799995);
((GeneralPath)shape).lineTo(58.500008, 75.99999);
((GeneralPath)shape).curveTo(58.300007, 74.99999, 58.000008, 74.19999, 57.40001, 73.799995);
((GeneralPath)shape).curveTo(56.80001, 73.399994, 56.000008, 73.1, 54.80001, 73.1);
((GeneralPath)shape).curveTo(53.60001, 73.1, 52.700012, 73.299995, 52.00001, 73.799995);
((GeneralPath)shape).curveTo(51.60001, 74.1, 51.400013, 74.49999, 51.400013, 74.99999);
((GeneralPath)shape).curveTo(51.400013, 75.49999, 51.600014, 75.899994, 52.00001, 76.19999);
((GeneralPath)shape).curveTo(52.50001, 76.59999, 53.80001, 77.09999, 55.700012, 77.49999);
((GeneralPath)shape).curveTo(57.600014, 77.899994, 59.100014, 78.399994, 60.100014, 78.899994);
((GeneralPath)shape).curveTo(61.000015, 79.399994, 61.800014, 80.09999, 62.300014, 80.899994);
((GeneralPath)shape).curveTo(62.800014, 81.7, 63.100014, 82.799995, 63.100014, 84.09999);
((GeneralPath)shape).curveTo(63.100014, 85.19999, 62.800014, 86.29999, 62.100014, 87.29999);
((GeneralPath)shape).curveTo(61.500015, 88.29999, 60.600014, 88.999985, 59.400013, 89.499985);
((GeneralPath)shape).curveTo(58.200012, 89.999985, 56.800014, 90.19998, 55.00001, 90.19998);
((GeneralPath)shape).curveTo(52.50001, 90.19998, 50.50001, 89.59998, 49.10001, 88.499985);
((GeneralPath)shape).curveTo(48.00001, 87.499985, 47.10001, 85.79999, 46.90001, 83.59998);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(31.761999130249023, 30.065000534057617), new Point2D.Double(31.761999130249023, 30.013999938964844), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(37.5, 38.0), new Point2D.Double(37.5, 78.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.5, 52.2);
((GeneralPath)shape).lineTo(18.5, 40.1);
((GeneralPath)shape).curveTo(18.5, 39.3, 18.7, 38.899998, 19.5, 38.5);
((GeneralPath)shape).curveTo(28.6, 33.5, 37.7, 28.4, 46.7, 23.4);
((GeneralPath)shape).curveTo(48.0, 22.699999, 49.3, 22.0, 50.8, 22.0);
((GeneralPath)shape).curveTo(53.399998, 22.1, 55.5, 23.6, 56.2, 26.0);
((GeneralPath)shape).curveTo(57.0, 28.4, 56.2, 31.2, 54.100002, 32.6);
((GeneralPath)shape).curveTo(51.800003, 34.0, 49.2, 35.399998, 46.800003, 36.8);
((GeneralPath)shape).curveTo(37.700005, 41.8, 28.600002, 46.9, 19.400003, 51.9);
((GeneralPath)shape).curveTo(19.200003, 52.0, 18.900003, 52.100002, 18.500004, 52.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.9, 47.7);
((GeneralPath)shape).curveTo(33.2, 47.5, 33.5, 47.4, 33.7, 47.100002);
((GeneralPath)shape).curveTo(36.7, 45.4, 39.7, 43.9, 42.6, 42.2);
((GeneralPath)shape).curveTo(43.3, 41.9, 43.699997, 41.9, 44.3, 42.3);
((GeneralPath)shape).curveTo(47.7, 45.399998, 51.2, 48.399998, 54.5, 51.5);
((GeneralPath)shape).curveTo(56.4, 53.2, 56.9, 55.4, 56.2, 57.7);
((GeneralPath)shape).curveTo(55.5, 60.0, 53.9, 61.4, 51.4, 61.7);
((GeneralPath)shape).curveTo(49.800003, 61.9, 48.300003, 61.5, 47.100002, 60.5);
((GeneralPath)shape).curveTo(42.4, 56.3, 37.800003, 52.1, 32.9, 47.7);
((GeneralPath)shape).curveTo(33.100002, 47.9, 33.100002, 47.8, 32.9, 47.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.5, 35.8);
((GeneralPath)shape).curveTo(18.5, 32.8, 18.3, 29.9, 18.6, 27.0);
((GeneralPath)shape).curveTo(18.9, 23.8, 22.2, 21.8, 25.6, 22.1);
((GeneralPath)shape).curveTo(28.5, 22.4, 30.900002, 25.4, 30.7, 28.400002);
((GeneralPath)shape).curveTo(30.7, 28.7, 30.5, 29.2, 30.1, 29.300001);
((GeneralPath)shape).lineTo(18.7, 35.600002);
((GeneralPath)shape).curveTo(18.800001, 35.800003, 18.7, 35.7, 18.5, 35.800003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.7, 48.9);
((GeneralPath)shape).curveTo(30.7, 51.7, 30.800001, 54.100002, 30.7, 56.7);
((GeneralPath)shape).curveTo(30.5, 59.7, 27.7, 62.0, 24.7, 62.0);
((GeneralPath)shape).curveTo(21.800001, 62.0, 19.0, 59.8, 18.5, 56.9);
((GeneralPath)shape).curveTo(18.4, 56.0, 18.5, 55.5, 19.4, 55.0);
((GeneralPath)shape).curveTo(22.8, 53.1, 26.3, 51.2, 29.7, 49.3);
((GeneralPath)shape).curveTo(29.900002, 49.2, 30.300001, 49.1, 30.7, 48.899998);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new LinearGradientPaint(new Point2D.Double(45.29999923706055, 25.799999237060547), new Point2D.Double(58.849998474121094, 12.25), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
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
	public ext_kts() {
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
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return An instance of this icon with specified dimensions.
     */
    public static NeonIcon of(int width, int height) {
       ext_kts base = new ext_kts();
       base.width = width;
       base.height = height;
       return new NeonIcon(base);
    }

    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A {@link UIResource} instance of this icon with specified dimensions.
     */
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_kts base = new ext_kts();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }
}

