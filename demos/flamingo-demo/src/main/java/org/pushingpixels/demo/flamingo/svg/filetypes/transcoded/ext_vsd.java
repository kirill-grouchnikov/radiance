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
public class ext_vsd implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.005f,0.188f,0.566f,1.0f}, new Color[] {new Color(55, 83, 157, 255),new Color(74, 105, 191, 255),new Color(112, 136, 205, 255),new Color(168, 183, 225, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(0.0, 50.0), new Point2D.Double(72.0, 50.0), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 0),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
paint = new Color(55, 83, 157, 255);
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
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 25.774999618530273), new Point2D.Double(58.57500076293945, 12.274999618530273), new float[] {0.005f,0.604f,1.0f}, new Color[] {new Color(223, 241, 250, 255),new Color(198, 208, 235, 255),new Color(55, 83, 157, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(55, 83, 157, 255);
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
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.4, 91.1);
((GeneralPath)shape).lineTo(7.2, 71.2);
((GeneralPath)shape).lineTo(11.6, 71.2);
((GeneralPath)shape).lineTo(16.7, 85.899994);
((GeneralPath)shape).lineTo(21.6, 71.2);
((GeneralPath)shape).lineTo(25.900002, 71.2);
((GeneralPath)shape).lineTo(18.7, 91.0);
((GeneralPath)shape).lineTo(14.400001, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.9, 84.6);
((GeneralPath)shape).lineTo(30.8, 84.2);
((GeneralPath)shape).curveTo(31.0, 85.5, 31.5, 86.5, 32.2, 87.1);
((GeneralPath)shape).curveTo(33.0, 87.7, 34.0, 88.0, 35.2, 88.0);
((GeneralPath)shape).curveTo(36.5, 88.0, 37.5, 87.7, 38.100002, 87.2);
((GeneralPath)shape).curveTo(38.800003, 86.7, 39.100002, 86.0, 39.100002, 85.299995);
((GeneralPath)shape).curveTo(39.100002, 84.799995, 39.000004, 84.399994, 38.7, 84.1);
((GeneralPath)shape).curveTo(38.4, 83.799995, 37.9, 83.5, 37.2, 83.2);
((GeneralPath)shape).curveTo(36.7, 83.0, 35.600002, 82.7, 34.0, 82.299995);
((GeneralPath)shape).curveTo(31.8, 81.799995, 30.3, 81.1, 29.4, 80.299995);
((GeneralPath)shape).curveTo(28.199999, 79.2, 27.6, 77.899994, 27.6, 76.299995);
((GeneralPath)shape).curveTo(27.6, 75.299995, 27.9, 74.299995, 28.5, 73.49999);
((GeneralPath)shape).curveTo(29.1, 72.59999, 29.9, 71.99999, 31.0, 71.49999);
((GeneralPath)shape).curveTo(32.1, 70.99999, 33.4, 70.799995, 34.9, 70.799995);
((GeneralPath)shape).curveTo(37.4, 70.799995, 39.300003, 71.299995, 40.600002, 72.399994);
((GeneralPath)shape).curveTo(41.9, 73.49999, 42.500004, 74.899994, 42.600002, 76.799995);
((GeneralPath)shape).lineTo(38.600002, 76.99999);
((GeneralPath)shape).curveTo(38.4, 75.99999, 38.100002, 75.19999, 37.500004, 74.799995);
((GeneralPath)shape).curveTo(36.900005, 74.399994, 36.100002, 74.1, 34.900005, 74.1);
((GeneralPath)shape).curveTo(33.700005, 74.1, 32.800007, 74.299995, 32.100006, 74.799995);
((GeneralPath)shape).curveTo(31.700006, 75.1, 31.500006, 75.49999, 31.500006, 75.99999);
((GeneralPath)shape).curveTo(31.500006, 76.49999, 31.700006, 76.899994, 32.100006, 77.19999);
((GeneralPath)shape).curveTo(32.600006, 77.59999, 33.900005, 78.09999, 35.800007, 78.49999);
((GeneralPath)shape).curveTo(37.70001, 78.899994, 39.20001, 79.399994, 40.20001, 79.899994);
((GeneralPath)shape).curveTo(41.10001, 80.399994, 41.90001, 81.09999, 42.40001, 81.899994);
((GeneralPath)shape).curveTo(42.90001, 82.7, 43.20001, 83.799995, 43.20001, 85.09999);
((GeneralPath)shape).curveTo(43.20001, 86.19999, 42.90001, 87.29999, 42.20001, 88.29999);
((GeneralPath)shape).curveTo(41.60001, 89.29999, 40.70001, 89.999985, 39.500008, 90.499985);
((GeneralPath)shape).curveTo(38.300007, 90.999985, 36.90001, 91.19998, 35.100006, 91.19998);
((GeneralPath)shape).curveTo(32.600006, 91.19998, 30.600006, 90.59998, 29.300007, 89.499985);
((GeneralPath)shape).curveTo(28.000008, 88.499985, 27.200006, 86.79999, 26.900007, 84.59998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.6, 71.2);
((GeneralPath)shape).lineTo(54.0, 71.2);
((GeneralPath)shape).curveTo(55.7, 71.2, 56.9, 71.299995, 57.8, 71.6);
((GeneralPath)shape).curveTo(59.0, 71.9, 60.0, 72.6, 60.8, 73.4);
((GeneralPath)shape).curveTo(61.6, 74.200005, 62.3, 75.3, 62.7, 76.6);
((GeneralPath)shape).curveTo(63.100002, 77.9, 63.4, 79.4, 63.4, 81.299995);
((GeneralPath)shape).curveTo(63.4, 82.899994, 63.2, 84.299995, 62.800003, 85.49999);
((GeneralPath)shape).curveTo(62.300003, 86.899994, 61.600002, 88.09999, 60.700005, 88.99999);
((GeneralPath)shape).curveTo(60.000004, 89.69999, 59.100006, 90.19999, 57.900005, 90.59999);
((GeneralPath)shape).curveTo(57.000004, 90.899994, 55.800007, 90.99999, 54.300007, 90.99999);
((GeneralPath)shape).lineTo(46.70001, 90.99999);
((GeneralPath)shape).lineTo(46.70001, 71.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.6, 74.6);
((GeneralPath)shape).lineTo(50.6, 87.7);
((GeneralPath)shape).lineTo(53.6, 87.7);
((GeneralPath)shape).curveTo(54.699997, 87.7, 55.5, 87.6, 56.0, 87.5);
((GeneralPath)shape).curveTo(56.7, 87.3, 57.2, 87.1, 57.6, 86.7);
((GeneralPath)shape).curveTo(58.0, 86.299995, 58.399998, 85.7, 58.699997, 84.799995);
((GeneralPath)shape).curveTo(58.999996, 83.899994, 59.1, 82.7, 59.1, 81.2);
((GeneralPath)shape).curveTo(59.1, 79.7, 59.0, 78.5, 58.699997, 77.7);
((GeneralPath)shape).curveTo(58.399998, 76.899994, 57.999996, 76.2, 57.6, 75.799995);
((GeneralPath)shape).curveTo(57.2, 75.399994, 56.5, 74.99999, 55.699997, 74.899994);
((GeneralPath)shape).curveTo(55.1, 74.799995, 53.999996, 74.7, 52.399998, 74.7);
((GeneralPath)shape).lineTo(50.6, 74.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new Color(55, 83, 157, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.1, 32.3);
((GeneralPath)shape).lineTo(38.4, 28.199999);
((GeneralPath)shape).lineTo(38.4, 64.0);
((GeneralPath)shape).lineTo(17.100002, 60.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
paint = new Color(55, 83, 157, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(53.3, 60.5);
((GeneralPath)shape).lineTo(35.2, 60.5);
((GeneralPath)shape).curveTo(34.3, 60.5, 33.600002, 59.8, 33.600002, 58.9);
((GeneralPath)shape).lineTo(33.600002, 33.4);
((GeneralPath)shape).curveTo(33.600002, 32.5, 34.300003, 31.800001, 35.2, 31.800001);
((GeneralPath)shape).lineTo(53.300003, 31.800001);
((GeneralPath)shape).curveTo(54.200005, 31.800001, 54.9, 32.5, 54.9, 33.4);
((GeneralPath)shape).lineTo(54.9, 58.9);
((GeneralPath)shape).curveTo(54.9, 59.800003, 54.2, 60.5, 53.300003, 60.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.2, 33.3);
((GeneralPath)shape).curveTo(35.100002, 33.3, 35.0, 33.399998, 35.0, 33.5);
((GeneralPath)shape).lineTo(35.0, 59.0);
((GeneralPath)shape).curveTo(35.0, 59.1, 35.1, 59.2, 35.2, 59.2);
((GeneralPath)shape).lineTo(53.300003, 59.2);
((GeneralPath)shape).curveTo(53.4, 59.2, 53.500004, 59.100002, 53.500004, 59.0);
((GeneralPath)shape).lineTo(53.500004, 33.4);
((GeneralPath)shape).curveTo(53.500004, 33.300003, 53.400005, 33.2, 53.300003, 33.2);
((GeneralPath)shape).lineTo(35.200005, 33.3);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
paint = new Color(55, 83, 157, 255);
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.0, 49.0);
((GeneralPath)shape).lineTo(42.0, 49.0);
((GeneralPath)shape).lineTo(42.0, 55.0);
((GeneralPath)shape).lineTo(36.0, 55.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(43.010002, 39.65);
((GeneralPath)shape).lineTo(46.617, 36.043003);
((GeneralPath)shape).lineTo(50.223, 39.65);
((GeneralPath)shape).lineTo(46.617, 43.256);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(43.000004, 39.800003);
((GeneralPath)shape).lineTo(38.000004, 39.800003);
((GeneralPath)shape).moveTo(47.000004, 43.000004);
((GeneralPath)shape).lineTo(47.000004, 52.000004);
((GeneralPath)shape).moveTo(42.000004, 52.000004);
((GeneralPath)shape).lineTo(48.000004, 52.000004);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
paint = new Color(168, 183, 225, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.0, 41.2);
((GeneralPath)shape).lineTo(25.1, 41.2);
((GeneralPath)shape).lineTo(27.4, 48.100002);
((GeneralPath)shape).curveTo(27.6, 48.7, 27.8, 49.7, 27.8, 49.7);
((GeneralPath)shape).curveTo(27.8, 49.7, 28.0, 48.8, 28.199999, 48.100002);
((GeneralPath)shape).lineTo(30.599998, 41.2);
((GeneralPath)shape).lineTo(32.699997, 41.2);
((GeneralPath)shape).lineTo(28.799997, 51.800003);
((GeneralPath)shape).lineTo(26.899998, 51.800003);
((GeneralPath)shape).lineTo(23.0, 41.2);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(168, 183, 225, 255);
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.0, 41.2);
((GeneralPath)shape).lineTo(25.1, 41.2);
((GeneralPath)shape).lineTo(27.4, 48.100002);
((GeneralPath)shape).curveTo(27.6, 48.7, 27.8, 49.7, 27.8, 49.7);
((GeneralPath)shape).curveTo(27.8, 49.7, 28.0, 48.8, 28.199999, 48.100002);
((GeneralPath)shape).lineTo(30.599998, 41.2);
((GeneralPath)shape).lineTo(32.699997, 41.2);
((GeneralPath)shape).lineTo(28.799997, 51.800003);
((GeneralPath)shape).lineTo(26.899998, 51.800003);
((GeneralPath)shape).lineTo(23.0, 41.2);
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
	public ext_vsd() {
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
       ext_vsd base = new ext_vsd();
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
       ext_vsd base = new ext_vsd();
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
        return () -> new ext_vsd();
    }
}

