package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_lisp implements ResizableIcon, IsHiDpiAware {
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
((GeneralPath)shape).moveTo(7.4, 91.1);
((GeneralPath)shape).lineTo(7.4, 71.4);
((GeneralPath)shape).lineTo(11.4, 71.4);
((GeneralPath)shape).lineTo(11.4, 87.7);
((GeneralPath)shape).lineTo(21.4, 87.7);
((GeneralPath)shape).lineTo(21.4, 91.0);
((GeneralPath)shape).lineTo(7.3999996, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(24.199999, 91.1);
((GeneralPath)shape).lineTo(24.199999, 71.2);
((GeneralPath)shape).lineTo(28.199999, 71.2);
((GeneralPath)shape).lineTo(28.199999, 91.0);
((GeneralPath)shape).lineTo(24.199999, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(31.0, 84.6);
((GeneralPath)shape).lineTo(34.9, 84.2);
((GeneralPath)shape).curveTo(35.100002, 85.5, 35.600002, 86.5, 36.300003, 87.1);
((GeneralPath)shape).curveTo(37.000004, 87.7, 38.000004, 88.0, 39.200005, 88.0);
((GeneralPath)shape).curveTo(40.500004, 88.0, 41.500004, 87.7, 42.100006, 87.2);
((GeneralPath)shape).curveTo(42.800007, 86.7, 43.100006, 86.0, 43.100006, 85.299995);
((GeneralPath)shape).curveTo(43.100006, 84.799995, 43.000008, 84.399994, 42.700005, 84.1);
((GeneralPath)shape).curveTo(42.400005, 83.799995, 41.900005, 83.5, 41.200005, 83.2);
((GeneralPath)shape).curveTo(40.700005, 83.0, 39.700005, 82.7, 38.000004, 82.299995);
((GeneralPath)shape).curveTo(35.800003, 81.799995, 34.300003, 81.1, 33.500004, 80.299995);
((GeneralPath)shape).curveTo(32.300003, 79.2, 31.700005, 77.899994, 31.700005, 76.299995);
((GeneralPath)shape).curveTo(31.700005, 75.299995, 32.000004, 74.299995, 32.600006, 73.49999);
((GeneralPath)shape).curveTo(33.200005, 72.59999, 34.000008, 71.99999, 35.100006, 71.49999);
((GeneralPath)shape).curveTo(36.200005, 70.99999, 37.500008, 70.799995, 39.000008, 70.799995);
((GeneralPath)shape).curveTo(41.500008, 70.799995, 43.40001, 71.299995, 44.70001, 72.399994);
((GeneralPath)shape).curveTo(46.000008, 73.49999, 46.60001, 74.899994, 46.70001, 76.799995);
((GeneralPath)shape).lineTo(42.70001, 76.99999);
((GeneralPath)shape).curveTo(42.500008, 75.99999, 42.20001, 75.19999, 41.60001, 74.799995);
((GeneralPath)shape).curveTo(41.00001, 74.399994, 40.20001, 74.1, 39.00001, 74.1);
((GeneralPath)shape).curveTo(37.80001, 74.1, 36.900013, 74.299995, 36.200012, 74.799995);
((GeneralPath)shape).curveTo(35.80001, 75.1, 35.600014, 75.49999, 35.600014, 75.99999);
((GeneralPath)shape).curveTo(35.600014, 76.49999, 35.800014, 76.899994, 36.200012, 77.19999);
((GeneralPath)shape).curveTo(36.700012, 77.59999, 37.900013, 78.09999, 39.900013, 78.49999);
((GeneralPath)shape).curveTo(41.900013, 78.899994, 43.300014, 79.399994, 44.300014, 79.899994);
((GeneralPath)shape).curveTo(45.200016, 80.399994, 46.000015, 81.09999, 46.500015, 81.899994);
((GeneralPath)shape).curveTo(47.000015, 82.799995, 47.300014, 83.799995, 47.300014, 85.09999);
((GeneralPath)shape).curveTo(47.300014, 86.19999, 47.000015, 87.29999, 46.300014, 88.29999);
((GeneralPath)shape).curveTo(45.600014, 89.29999, 44.800014, 89.999985, 43.600014, 90.499985);
((GeneralPath)shape).curveTo(42.400013, 90.999985, 41.000015, 91.19998, 39.300014, 91.19998);
((GeneralPath)shape).curveTo(36.800014, 91.19998, 34.800014, 90.59998, 33.500015, 89.499985);
((GeneralPath)shape).curveTo(32.100014, 88.499985, 31.300014, 86.79999, 31.000015, 84.59998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.7, 91.1);
((GeneralPath)shape).lineTo(50.7, 71.2);
((GeneralPath)shape).lineTo(57.2, 71.2);
((GeneralPath)shape).curveTo(59.7, 71.2, 61.3, 71.299995, 62.0, 71.5);
((GeneralPath)shape).curveTo(63.1, 71.8, 64.1, 72.4, 64.9, 73.4);
((GeneralPath)shape).curveTo(65.700005, 74.4, 66.1, 75.700005, 66.1, 77.3);
((GeneralPath)shape).curveTo(66.1, 78.5, 65.9, 79.5, 65.4, 80.4);
((GeneralPath)shape).curveTo(64.9, 81.3, 64.4, 81.9, 63.7, 82.4);
((GeneralPath)shape).curveTo(63.0, 82.9, 62.3, 83.200005, 61.600002, 83.3);
((GeneralPath)shape).curveTo(60.600002, 83.5, 59.2, 83.600006, 57.4, 83.600006);
((GeneralPath)shape).lineTo(54.800003, 83.600006);
((GeneralPath)shape).lineTo(54.800003, 91.100006);
((GeneralPath)shape).lineTo(50.700005, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.7, 74.6);
((GeneralPath)shape).lineTo(54.7, 80.2);
((GeneralPath)shape).lineTo(56.9, 80.2);
((GeneralPath)shape).curveTo(58.5, 80.2, 59.600002, 80.1, 60.100002, 79.899994);
((GeneralPath)shape).curveTo(60.600002, 79.7, 61.100002, 79.399994, 61.4, 78.899994);
((GeneralPath)shape).curveTo(61.7, 78.49999, 61.9, 77.899994, 61.9, 77.399994);
((GeneralPath)shape).curveTo(61.9, 76.7, 61.7, 76.09999, 61.300003, 75.59999);
((GeneralPath)shape).curveTo(60.9, 75.09999, 60.300003, 74.79999, 59.700005, 74.69999);
((GeneralPath)shape).curveTo(59.200005, 74.59999, 58.300003, 74.59999, 56.800003, 74.59999);
((GeneralPath)shape).lineTo(54.700005, 74.59999);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
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
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new LinearGradientPaint(new Point2D.Double(37.0, 62.41400146484375), new Point2D.Double(37.0, 23.586000442504883), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.3, 54.2);
((GeneralPath)shape).lineTo(50.3, 54.2);
((GeneralPath)shape).curveTo(50.3, 57.100002, 49.8, 59.100002, 48.899998, 60.4);
((GeneralPath)shape).curveTo(47.999996, 61.7, 46.8, 62.4, 45.399998, 62.4);
((GeneralPath)shape).curveTo(44.3, 62.4, 43.199997, 62.0, 42.1, 61.100002);
((GeneralPath)shape).curveTo(41.1, 60.300003, 40.1, 57.9, 39.3, 54.2);
((GeneralPath)shape).lineTo(37.0, 43.7);
((GeneralPath)shape).lineTo(28.9, 62.0);
((GeneralPath)shape).lineTo(23.8, 62.0);
((GeneralPath)shape).lineTo(35.4, 37.0);
((GeneralPath)shape).curveTo(34.800003, 33.8, 34.0, 31.4, 33.2, 29.8);
((GeneralPath)shape).curveTo(32.4, 28.199999, 31.300001, 27.5, 30.0, 27.5);
((GeneralPath)shape).curveTo(29.0, 27.5, 28.1, 27.9, 27.3, 28.7);
((GeneralPath)shape).curveTo(26.5, 29.5, 26.099998, 30.7, 26.0, 32.4);
((GeneralPath)shape).lineTo(25.0, 32.4);
((GeneralPath)shape).curveTo(25.1, 29.7, 25.6, 27.600002, 26.6, 26.000002);
((GeneralPath)shape).curveTo(27.6, 24.400002, 28.9, 23.600002, 30.4, 23.600002);
((GeneralPath)shape).curveTo(31.4, 23.600002, 32.3, 24.000002, 33.2, 24.800003);
((GeneralPath)shape).curveTo(34.100002, 25.600004, 34.8, 27.000004, 35.5, 28.900003);
((GeneralPath)shape).curveTo(36.2, 30.800003, 37.2, 34.9, 38.5, 41.000004);
((GeneralPath)shape).lineTo(40.4, 49.600006);
((GeneralPath)shape).curveTo(41.2, 53.200005, 42.0, 55.500008, 42.800003, 56.700005);
((GeneralPath)shape).curveTo(43.600006, 57.9, 44.700005, 58.500004, 45.9, 58.500004);
((GeneralPath)shape).curveTo(47.9, 58.500004, 49.0, 57.100002, 49.300003, 54.200005);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.78799819946289, 63.16400146484375), new Point2D.Double(36.78799819946289, 22.836000442504883), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(49.3, 54.2);
((GeneralPath)shape).lineTo(50.3, 54.2);
((GeneralPath)shape).curveTo(50.3, 57.100002, 49.8, 59.100002, 48.899998, 60.4);
((GeneralPath)shape).curveTo(47.999996, 61.7, 46.8, 62.4, 45.399998, 62.4);
((GeneralPath)shape).curveTo(44.3, 62.4, 43.199997, 62.0, 42.1, 61.100002);
((GeneralPath)shape).curveTo(41.1, 60.300003, 40.1, 57.9, 39.3, 54.2);
((GeneralPath)shape).lineTo(37.0, 43.7);
((GeneralPath)shape).lineTo(28.9, 62.0);
((GeneralPath)shape).lineTo(23.8, 62.0);
((GeneralPath)shape).lineTo(35.4, 37.0);
((GeneralPath)shape).curveTo(34.800003, 33.8, 34.0, 31.4, 33.2, 29.8);
((GeneralPath)shape).curveTo(32.4, 28.199999, 31.300001, 27.5, 30.0, 27.5);
((GeneralPath)shape).curveTo(29.0, 27.5, 28.1, 27.9, 27.3, 28.7);
((GeneralPath)shape).curveTo(26.5, 29.5, 26.099998, 30.7, 26.0, 32.4);
((GeneralPath)shape).lineTo(25.0, 32.4);
((GeneralPath)shape).curveTo(25.1, 29.7, 25.6, 27.600002, 26.6, 26.000002);
((GeneralPath)shape).curveTo(27.6, 24.400002, 28.9, 23.600002, 30.4, 23.600002);
((GeneralPath)shape).curveTo(31.4, 23.600002, 32.3, 24.000002, 33.2, 24.800003);
((GeneralPath)shape).curveTo(34.100002, 25.600004, 34.8, 27.000004, 35.5, 28.900003);
((GeneralPath)shape).curveTo(36.2, 30.800003, 37.2, 34.9, 38.5, 41.000004);
((GeneralPath)shape).lineTo(40.4, 49.600006);
((GeneralPath)shape).curveTo(41.2, 53.200005, 42.0, 55.500008, 42.800003, 56.700005);
((GeneralPath)shape).curveTo(43.600006, 57.9, 44.700005, 58.500004, 45.9, 58.500004);
((GeneralPath)shape).curveTo(47.9, 58.500004, 49.0, 57.100002, 49.300003, 54.200005);
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
	public ext_lisp() {
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
       ext_lisp base = new ext_lisp();
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
       ext_lisp base = new ext_lisp();
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
        return () -> new NeonIcon(new ext_lisp());
    }
}

