package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_gradle implements ResizableIcon {
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
((GeneralPath)shape).moveTo(10.2, 87.1);
((GeneralPath)shape).lineTo(10.2, 85.299995);
((GeneralPath)shape).lineTo(15.0, 85.299995);
((GeneralPath)shape).lineTo(15.0, 89.6);
((GeneralPath)shape).curveTo(14.5, 90.0, 13.9, 90.4, 13.0, 90.799995);
((GeneralPath)shape).curveTo(12.1, 91.1, 11.3, 91.299995, 10.4, 91.299995);
((GeneralPath)shape).curveTo(9.299999, 91.299995, 8.299999, 91.1, 7.3999996, 90.6);
((GeneralPath)shape).curveTo(6.5999994, 90.1, 5.8999996, 89.5, 5.4999995, 88.6);
((GeneralPath)shape).curveTo(5.0999994, 87.7, 4.8999996, 86.799995, 4.8999996, 85.7);
((GeneralPath)shape).curveTo(4.8999996, 84.6, 5.0999994, 83.6, 5.5999994, 82.7);
((GeneralPath)shape).curveTo(6.0999994, 81.799995, 6.799999, 81.2, 7.6999993, 80.7);
((GeneralPath)shape).curveTo(8.4, 80.299995, 9.299999, 80.2, 10.299999, 80.2);
((GeneralPath)shape).curveTo(11.599999, 80.2, 12.699999, 80.5, 13.4, 81.0);
((GeneralPath)shape).curveTo(14.2, 81.6, 14.599999, 82.3, 14.9, 83.3);
((GeneralPath)shape).lineTo(12.7, 83.700005);
((GeneralPath)shape).curveTo(12.5, 83.200005, 12.3, 82.8, 11.8, 82.50001);
((GeneralPath)shape).curveTo(11.400001, 82.200005, 10.900001, 82.00001, 10.2, 82.00001);
((GeneralPath)shape).curveTo(9.2, 82.00001, 8.5, 82.30001, 7.8999996, 82.90001);
((GeneralPath)shape).curveTo(7.2999997, 83.50001, 7.0999994, 84.40001, 7.0999994, 85.600006);
((GeneralPath)shape).curveTo(7.0999994, 86.90001, 7.3999996, 87.8, 7.9999995, 88.50001);
((GeneralPath)shape).curveTo(8.599999, 89.100006, 9.299999, 89.50001, 10.2, 89.50001);
((GeneralPath)shape).curveTo(10.7, 89.50001, 11.099999, 89.40001, 11.599999, 89.200005);
((GeneralPath)shape).curveTo(12.099999, 89.00001, 12.499999, 88.8, 12.799999, 88.600006);
((GeneralPath)shape).lineTo(12.799999, 87.200005);
((GeneralPath)shape).lineTo(10.199999, 87.200005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(17.0, 91.1);
((GeneralPath)shape).lineTo(17.0, 80.3);
((GeneralPath)shape).lineTo(21.6, 80.3);
((GeneralPath)shape).curveTo(22.800001, 80.3, 23.6, 80.4, 24.1, 80.600006);
((GeneralPath)shape).curveTo(24.6, 80.8, 25.0, 81.100006, 25.4, 81.600006);
((GeneralPath)shape).curveTo(25.8, 82.100006, 25.9, 82.700005, 25.9, 83.3);
((GeneralPath)shape).curveTo(25.9, 84.100006, 25.699999, 84.8, 25.199999, 85.3);
((GeneralPath)shape).curveTo(24.699999, 85.8, 23.999998, 86.200005, 23.099998, 86.3);
((GeneralPath)shape).curveTo(23.599998, 86.600006, 23.999998, 86.9, 24.3, 87.200005);
((GeneralPath)shape).curveTo(24.599998, 87.50001, 25.0, 88.100006, 25.5, 88.9);
((GeneralPath)shape).lineTo(26.8, 91.0);
((GeneralPath)shape).lineTo(24.199999, 91.0);
((GeneralPath)shape).lineTo(22.599998, 88.7);
((GeneralPath)shape).curveTo(21.999998, 87.899994, 21.699999, 87.299995, 21.399998, 87.1);
((GeneralPath)shape).curveTo(21.199997, 86.9, 20.999998, 86.7, 20.699997, 86.7);
((GeneralPath)shape).curveTo(20.499996, 86.6, 20.099997, 86.6, 19.599997, 86.6);
((GeneralPath)shape).lineTo(19.199997, 86.6);
((GeneralPath)shape).lineTo(19.199997, 91.1);
((GeneralPath)shape).lineTo(17.0, 91.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.2, 84.9);
((GeneralPath)shape).lineTo(20.800001, 84.9);
((GeneralPath)shape).curveTo(21.800001, 84.9, 22.500002, 84.9, 22.800001, 84.8);
((GeneralPath)shape).curveTo(23.1, 84.700005, 23.300001, 84.600006, 23.400002, 84.3);
((GeneralPath)shape).curveTo(23.500002, 84.0, 23.600002, 83.8, 23.600002, 83.5);
((GeneralPath)shape).curveTo(23.600002, 83.1, 23.500002, 82.8, 23.300003, 82.6);
((GeneralPath)shape).curveTo(23.100002, 82.4, 22.800003, 82.2, 22.500004, 82.2);
((GeneralPath)shape).lineTo(19.200005, 82.2);
((GeneralPath)shape).lineTo(19.200005, 84.899994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.6, 91.1);
((GeneralPath)shape).lineTo(35.199997, 91.1);
((GeneralPath)shape).lineTo(34.299995, 88.7);
((GeneralPath)shape).lineTo(30.0, 88.7);
((GeneralPath)shape).lineTo(29.1, 91.1);
((GeneralPath)shape).lineTo(26.800001, 91.1);
((GeneralPath)shape).lineTo(31.0, 80.3);
((GeneralPath)shape).lineTo(33.3, 80.3);
((GeneralPath)shape).lineTo(37.6, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.6, 86.799995);
((GeneralPath)shape).lineTo(32.1, 82.799995);
((GeneralPath)shape).lineTo(30.599998, 86.799995);
((GeneralPath)shape).lineTo(33.6, 86.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.8, 80.299995);
((GeneralPath)shape).lineTo(42.8, 80.299995);
((GeneralPath)shape).curveTo(43.7, 80.299995, 44.399998, 80.399994, 44.899998, 80.49999);
((GeneralPath)shape).curveTo(45.499996, 80.69999, 46.1, 80.99999, 46.499996, 81.49999);
((GeneralPath)shape).curveTo(46.899994, 81.99999, 47.299995, 82.59999, 47.499996, 83.19999);
((GeneralPath)shape).curveTo(47.699997, 83.89999, 47.899998, 84.69999, 47.899998, 85.69999);
((GeneralPath)shape).curveTo(47.899998, 86.59999, 47.8, 87.29999, 47.6, 87.99999);
((GeneralPath)shape).curveTo(47.3, 88.799995, 46.899998, 89.399994, 46.399998, 89.899994);
((GeneralPath)shape).curveTo(45.999996, 90.299995, 45.499996, 90.59999, 44.899998, 90.799995);
((GeneralPath)shape).curveTo(44.399998, 90.99999, 43.8, 90.99999, 42.999996, 90.99999);
((GeneralPath)shape).lineTo(38.899998, 90.99999);
((GeneralPath)shape).lineTo(38.899998, 80.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(41.0, 82.1);
((GeneralPath)shape).lineTo(41.0, 89.2);
((GeneralPath)shape).lineTo(42.6, 89.2);
((GeneralPath)shape).curveTo(43.199997, 89.2, 43.6, 89.2, 43.899998, 89.1);
((GeneralPath)shape).curveTo(44.3, 89.0, 44.499996, 88.9, 44.8, 88.7);
((GeneralPath)shape).curveTo(45.0, 88.5, 45.2, 88.1, 45.399998, 87.7);
((GeneralPath)shape).curveTo(45.499996, 87.2, 45.6, 86.6, 45.6, 85.7);
((GeneralPath)shape).curveTo(45.6, 84.799995, 45.5, 84.2, 45.399998, 83.799995);
((GeneralPath)shape).curveTo(45.3, 83.399994, 44.999996, 82.99999, 44.8, 82.799995);
((GeneralPath)shape).curveTo(44.5, 82.6, 44.2, 82.399994, 43.8, 82.299995);
((GeneralPath)shape).curveTo(43.5, 82.2, 42.899998, 82.2, 42.0, 82.2);
((GeneralPath)shape).lineTo(41.0, 82.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.7, 91.1);
((GeneralPath)shape).lineTo(49.7, 80.4);
((GeneralPath)shape).lineTo(51.9, 80.4);
((GeneralPath)shape).lineTo(51.9, 89.200005);
((GeneralPath)shape).lineTo(57.300003, 89.200005);
((GeneralPath)shape).lineTo(57.300003, 91.0);
((GeneralPath)shape).lineTo(49.700005, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(58.9, 91.1);
((GeneralPath)shape).lineTo(58.9, 80.3);
((GeneralPath)shape).lineTo(66.9, 80.3);
((GeneralPath)shape).lineTo(66.9, 82.100006);
((GeneralPath)shape).lineTo(61.100002, 82.100006);
((GeneralPath)shape).lineTo(61.100002, 84.50001);
((GeneralPath)shape).lineTo(66.5, 84.50001);
((GeneralPath)shape).lineTo(66.5, 86.30001);
((GeneralPath)shape).lineTo(61.1, 86.30001);
((GeneralPath)shape).lineTo(61.1, 89.20001);
((GeneralPath)shape).lineTo(67.1, 89.20001);
((GeneralPath)shape).lineTo(67.1, 91.0);
((GeneralPath)shape).lineTo(58.899998, 91.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(37.5, 69.96900177001953), new Point2D.Double(37.5, 32.03099822998047), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(60.1, 36.1);
((GeneralPath)shape).curveTo(58.399998, 33.0, 55.399998, 32.1, 53.199997, 32.1);
((GeneralPath)shape).curveTo(50.6, 32.1, 48.399998, 33.5, 48.799995, 34.5);
((GeneralPath)shape).curveTo(48.899994, 34.7, 49.399994, 35.8, 49.699997, 36.2);
((GeneralPath)shape).curveTo(50.199997, 36.9, 50.999996, 36.3, 51.199997, 36.2);
((GeneralPath)shape).curveTo(51.999996, 35.7, 52.899998, 35.600002, 53.799995, 35.7);
((GeneralPath)shape).curveTo(54.699997, 35.8, 55.999996, 36.4, 56.899994, 38.0);
((GeneralPath)shape).curveTo(58.899994, 41.8, 52.799995, 49.7, 45.099995, 44.2);
((GeneralPath)shape).curveTo(37.299995, 38.8, 29.799995, 40.5, 26.399994, 41.7);
((GeneralPath)shape).curveTo(22.999994, 42.8, 21.499994, 43.9, 22.799994, 46.4);
((GeneralPath)shape).curveTo(24.599993, 49.800003, 24.099993, 48.800003, 25.799994, 51.7);
((GeneralPath)shape).curveTo(28.599993, 56.3, 34.799995, 49.600002, 34.799995, 49.600002);
((GeneralPath)shape).curveTo(30.199995, 56.4, 26.299995, 54.800003, 24.799995, 52.4);
((GeneralPath)shape).curveTo(23.399996, 50.300003, 22.399996, 47.800003, 22.399996, 47.800003);
((GeneralPath)shape).curveTo(10.8, 51.9, 13.9, 70.0, 13.9, 70.0);
((GeneralPath)shape).lineTo(19.599998, 70.0);
((GeneralPath)shape).curveTo(21.099998, 63.3, 26.3, 63.6, 27.199999, 70.0);
((GeneralPath)shape).lineTo(31.599998, 70.0);
((GeneralPath)shape).curveTo(35.5, 57.0, 45.3, 70.0, 45.3, 70.0);
((GeneralPath)shape).lineTo(51.0, 70.0);
((GeneralPath)shape).curveTo(49.4, 61.1, 54.2, 58.4, 57.2, 53.2);
((GeneralPath)shape).curveTo(60.4, 47.9, 63.3, 41.6, 60.100002, 36.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.3, 53.2);
((GeneralPath)shape).curveTo(42.3, 52.2, 43.3, 49.2, 43.3, 49.2);
((GeneralPath)shape).curveTo(43.3, 49.2, 45.899998, 50.0, 49.5, 51.3);
((GeneralPath)shape).curveTo(49.4, 52.0, 47.6, 53.899998, 45.3, 53.2);
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
	private ext_gradle() {
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
       ext_gradle base = new ext_gradle();
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
       ext_gradle base = new ext_gradle();
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
        return () -> new ext_gradle();
    }
}

