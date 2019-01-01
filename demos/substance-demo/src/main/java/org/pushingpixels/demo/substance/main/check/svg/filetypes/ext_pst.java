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
public class ext_pst implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.16f,0.36f,1.0f}, new Color[] {new Color(17, 60, 96, 255),new Color(25, 79, 126, 255),new Color(28, 95, 151, 255),new Color(29, 111, 181, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new Color(17, 60, 96, 255);
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
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(10.4, 91.1);
((GeneralPath)shape).lineTo(10.4, 71.2);
((GeneralPath)shape).lineTo(16.9, 71.2);
((GeneralPath)shape).curveTo(19.4, 71.2, 21.0, 71.299995, 21.7, 71.5);
((GeneralPath)shape).curveTo(22.800001, 71.8, 23.800001, 72.4, 24.6, 73.4);
((GeneralPath)shape).curveTo(25.4, 74.4, 25.800001, 75.700005, 25.800001, 77.3);
((GeneralPath)shape).curveTo(25.800001, 78.5, 25.6, 79.5, 25.1, 80.4);
((GeneralPath)shape).curveTo(24.7, 81.200005, 24.1, 81.9, 23.4, 82.4);
((GeneralPath)shape).curveTo(22.699999, 82.9, 22.0, 83.200005, 21.3, 83.3);
((GeneralPath)shape).curveTo(20.3, 83.5, 18.9, 83.600006, 17.099998, 83.600006);
((GeneralPath)shape).lineTo(14.499998, 83.600006);
((GeneralPath)shape).lineTo(14.499998, 91.100006);
((GeneralPath)shape).lineTo(10.399998, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(14.4, 74.6);
((GeneralPath)shape).lineTo(14.4, 80.2);
((GeneralPath)shape).lineTo(16.6, 80.2);
((GeneralPath)shape).curveTo(18.2, 80.2, 19.300001, 80.1, 19.800001, 79.899994);
((GeneralPath)shape).curveTo(20.300001, 79.7, 20.800001, 79.399994, 21.1, 78.899994);
((GeneralPath)shape).curveTo(21.4, 78.49999, 21.6, 77.899994, 21.6, 77.399994);
((GeneralPath)shape).curveTo(21.6, 76.7, 21.4, 76.09999, 21.0, 75.59999);
((GeneralPath)shape).curveTo(20.6, 75.09999, 20.0, 74.79999, 19.4, 74.69999);
((GeneralPath)shape).curveTo(18.9, 74.59999, 17.9, 74.59999, 16.5, 74.59999);
((GeneralPath)shape).lineTo(14.4, 74.59999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.0, 84.6);
((GeneralPath)shape).lineTo(31.9, 84.2);
((GeneralPath)shape).curveTo(32.1, 85.5, 32.6, 86.5, 33.3, 87.1);
((GeneralPath)shape).curveTo(34.0, 87.7, 35.0, 88.0, 36.2, 88.0);
((GeneralPath)shape).curveTo(37.5, 88.0, 38.5, 87.7, 39.100002, 87.2);
((GeneralPath)shape).curveTo(39.800003, 86.7, 40.100002, 86.0, 40.100002, 85.299995);
((GeneralPath)shape).curveTo(40.100002, 84.799995, 40.000004, 84.399994, 39.7, 84.1);
((GeneralPath)shape).curveTo(39.4, 83.799995, 38.9, 83.5, 38.2, 83.2);
((GeneralPath)shape).curveTo(37.7, 83.0, 36.600002, 82.7, 35.0, 82.299995);
((GeneralPath)shape).curveTo(32.8, 81.799995, 31.3, 81.1, 30.4, 80.299995);
((GeneralPath)shape).curveTo(29.199999, 79.2, 28.6, 77.899994, 28.6, 76.299995);
((GeneralPath)shape).curveTo(28.6, 75.299995, 28.9, 74.299995, 29.5, 73.49999);
((GeneralPath)shape).curveTo(30.1, 72.59999, 30.9, 71.99999, 32.0, 71.49999);
((GeneralPath)shape).curveTo(33.1, 70.99999, 34.4, 70.799995, 35.9, 70.799995);
((GeneralPath)shape).curveTo(38.4, 70.799995, 40.300003, 71.299995, 41.600002, 72.399994);
((GeneralPath)shape).curveTo(42.9, 73.49999, 43.500004, 74.899994, 43.600002, 76.799995);
((GeneralPath)shape).lineTo(39.600002, 76.99999);
((GeneralPath)shape).curveTo(39.4, 75.99999, 39.100002, 75.19999, 38.500004, 74.799995);
((GeneralPath)shape).curveTo(37.900005, 74.399994, 37.100002, 74.1, 35.900005, 74.1);
((GeneralPath)shape).curveTo(34.700005, 74.1, 33.800007, 74.299995, 33.100006, 74.799995);
((GeneralPath)shape).curveTo(32.700005, 75.1, 32.500008, 75.49999, 32.500008, 75.99999);
((GeneralPath)shape).curveTo(32.500008, 76.49999, 32.70001, 76.899994, 33.100006, 77.19999);
((GeneralPath)shape).curveTo(33.600006, 77.59999, 34.900005, 78.09999, 36.800007, 78.49999);
((GeneralPath)shape).curveTo(38.70001, 78.899994, 40.20001, 79.399994, 41.20001, 79.899994);
((GeneralPath)shape).curveTo(42.10001, 80.399994, 42.90001, 81.09999, 43.40001, 81.899994);
((GeneralPath)shape).curveTo(43.90001, 82.7, 44.20001, 83.799995, 44.20001, 85.09999);
((GeneralPath)shape).curveTo(44.20001, 86.19999, 43.90001, 87.29999, 43.20001, 88.29999);
((GeneralPath)shape).curveTo(42.60001, 89.29999, 41.70001, 89.999985, 40.500008, 90.499985);
((GeneralPath)shape).curveTo(39.300007, 90.999985, 37.90001, 91.19998, 36.100006, 91.19998);
((GeneralPath)shape).curveTo(33.600006, 91.19998, 31.600006, 90.59998, 30.300007, 89.499985);
((GeneralPath)shape).curveTo(29.100006, 88.499985, 28.300007, 86.79999, 28.000008, 84.59998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.2, 91.1);
((GeneralPath)shape).lineTo(52.2, 74.6);
((GeneralPath)shape).lineTo(46.3, 74.6);
((GeneralPath)shape).lineTo(46.3, 71.2);
((GeneralPath)shape).lineTo(62.199997, 71.2);
((GeneralPath)shape).lineTo(62.199997, 74.6);
((GeneralPath)shape).lineTo(56.299995, 74.6);
((GeneralPath)shape).lineTo(56.299995, 91.1);
((GeneralPath)shape).lineTo(52.199997, 91.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 74.20500183105469), new Point2D.Double(58.569000244140625, 87.70500183105469), new float[] {0.005f,0.3f,0.443f,0.553f,0.647f,0.73f,0.805f,0.875f,0.938f,0.998f,1.0f}, new Color[] {new Color(223, 241, 250, 255),new Color(220, 238, 247, 255),new Color(211, 228, 239, 255),new Color(196, 214, 227, 255),new Color(177, 197, 213, 255),new Color(154, 176, 197, 255),new Color(129, 154, 179, 255),new Color(100, 130, 159, 255),new Color(66, 108, 140, 255),new Color(6, 87, 122, 255),new Color(1, 86, 121, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new Color(17, 60, 96, 255);
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
paint = new LinearGradientPaint(new Point2D.Double(26.413000106811523, 38.04399871826172), new Point2D.Double(26.413000106811523, 45.15599822998047), new float[] {0.005f,0.824f,1.0f}, new Color[] {new Color(17, 60, 96, 255),new Color(25, 79, 126, 255),new Color(28, 95, 151, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(26.4, 38.1);
((GeneralPath)shape).curveTo(24.9, 38.3, 23.699999, 39.899998, 23.699999, 41.6);
((GeneralPath)shape).curveTo(23.699999, 43.399998, 24.9, 45.0, 26.4, 45.1);
((GeneralPath)shape).curveTo(27.9, 45.3, 29.1, 43.699997, 29.1, 41.6);
((GeneralPath)shape).curveTo(29.1, 39.5, 27.9, 37.899998, 26.4, 38.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
paint = new LinearGradientPaint(new Point2D.Double(26.71299934387207, 23.71299934387207), new Point2D.Double(26.71299934387207, 59.48699951171875), new float[] {0.005f,0.824f,1.0f}, new Color[] {new Color(17, 60, 96, 255),new Color(25, 79, 126, 255),new Color(28, 95, 151, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.9, 27.9);
((GeneralPath)shape).lineTo(15.9, 55.6);
((GeneralPath)shape).lineTo(37.6, 59.5);
((GeneralPath)shape).lineTo(37.6, 23.7);
((GeneralPath)shape).lineTo(15.899998, 27.900002);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.4, 47.3);
((GeneralPath)shape).curveTo(24.0, 47.0, 22.099998, 44.399998, 22.099998, 41.6);
((GeneralPath)shape).curveTo(22.099998, 38.8, 23.999998, 36.199997, 26.399998, 35.899998);
((GeneralPath)shape).curveTo(28.799997, 35.6, 30.699997, 38.199997, 30.699997, 41.6);
((GeneralPath)shape).curveTo(30.699997, 45.1, 28.799997, 47.6, 26.399998, 47.3);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
paint = new LinearGradientPaint(new Point2D.Double(47.03900146484375, 31.20199966430664), new Point2D.Double(47.03900146484375, 41.99700164794922), new float[] {0.005f,0.824f,1.0f}, new Color[] {new Color(17, 60, 96, 255),new Color(25, 79, 126, 255),new Color(28, 95, 151, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.6, 32.1);
((GeneralPath)shape).lineTo(42.7, 42.0);
((GeneralPath)shape).lineTo(39.5, 39.4);
((GeneralPath)shape).lineTo(39.5, 31.2);
((GeneralPath)shape).lineTo(54.6, 31.2);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
paint = new LinearGradientPaint(new Point2D.Double(47.03900146484375, 34.02299880981445), new Point2D.Double(47.03900146484375, 52.426998138427734), new float[] {0.005f,0.824f,1.0f}, new Color[] {new Color(17, 60, 96, 255),new Color(25, 79, 126, 255),new Color(28, 95, 151, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.6, 34.0);
((GeneralPath)shape).lineTo(42.699997, 43.9);
((GeneralPath)shape).lineTo(39.499996, 41.300003);
((GeneralPath)shape).lineTo(39.499996, 52.4);
((GeneralPath)shape).lineTo(54.6, 52.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
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
	public ext_pst() {
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
       ext_pst base = new ext_pst();
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
       ext_pst base = new ext_pst();
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
        return () -> new ext_pst();
    }
}

