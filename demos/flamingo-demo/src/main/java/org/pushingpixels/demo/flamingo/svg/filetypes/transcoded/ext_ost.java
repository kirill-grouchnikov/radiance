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
public class ext_ost implements ResizableIcon {
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
((GeneralPath)shape).moveTo(8.0, 81.3);
((GeneralPath)shape).curveTo(8.0, 79.3, 8.3, 77.600006, 8.9, 76.200005);
((GeneralPath)shape).curveTo(9.4, 75.200005, 10.0, 74.3, 10.799999, 73.50001);
((GeneralPath)shape).curveTo(11.599999, 72.700005, 12.499999, 72.100006, 13.4, 71.700005);
((GeneralPath)shape).curveTo(14.599999, 71.200005, 16.1, 70.9, 17.7, 70.9);
((GeneralPath)shape).curveTo(20.7, 70.9, 23.0, 71.8, 24.800001, 73.6);
((GeneralPath)shape).curveTo(26.6, 75.4, 27.500002, 77.9, 27.500002, 81.2);
((GeneralPath)shape).curveTo(27.500002, 84.399994, 26.600002, 86.899994, 24.900002, 88.7);
((GeneralPath)shape).curveTo(23.100002, 90.5, 20.800001, 91.399994, 17.800001, 91.399994);
((GeneralPath)shape).curveTo(14.800001, 91.399994, 12.400002, 90.49999, 10.700001, 88.7);
((GeneralPath)shape).curveTo(8.9, 86.9, 8.0, 84.4, 8.0, 81.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.2, 81.100006);
((GeneralPath)shape).curveTo(12.2, 83.3, 12.7, 85.100006, 13.8, 86.200005);
((GeneralPath)shape).curveTo(14.8, 87.4, 16.2, 87.9, 17.8, 87.9);
((GeneralPath)shape).curveTo(19.399998, 87.9, 20.699999, 87.3, 21.8, 86.200005);
((GeneralPath)shape).curveTo(22.8, 85.00001, 23.4, 83.3, 23.4, 81.00001);
((GeneralPath)shape).curveTo(23.4, 78.700005, 22.9, 77.00001, 21.9, 75.90001);
((GeneralPath)shape).curveTo(20.9, 74.80001, 19.6, 74.20001, 17.9, 74.20001);
((GeneralPath)shape).curveTo(16.199999, 74.20001, 14.9, 74.80001, 13.9, 75.90001);
((GeneralPath)shape).curveTo(12.7, 77.100006, 12.2, 78.80001, 12.2, 81.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.599998, 84.600006);
((GeneralPath)shape).lineTo(33.5, 84.200005);
((GeneralPath)shape).curveTo(33.7, 85.50001, 34.2, 86.50001, 34.9, 87.100006);
((GeneralPath)shape).curveTo(35.600002, 87.700005, 36.600002, 88.00001, 37.800003, 88.00001);
((GeneralPath)shape).curveTo(39.100002, 88.00001, 40.100002, 87.700005, 40.700005, 87.200005);
((GeneralPath)shape).curveTo(41.400005, 86.700005, 41.700005, 86.00001, 41.700005, 85.3);
((GeneralPath)shape).curveTo(41.700005, 84.8, 41.600006, 84.4, 41.300003, 84.100006);
((GeneralPath)shape).curveTo(41.0, 83.80001, 40.500004, 83.50001, 39.800003, 83.200005);
((GeneralPath)shape).curveTo(39.300003, 83.00001, 38.200005, 82.700005, 36.600002, 82.3);
((GeneralPath)shape).curveTo(34.4, 81.8, 32.9, 81.100006, 32.000004, 80.3);
((GeneralPath)shape).curveTo(30.800003, 79.200005, 30.200005, 77.9, 30.200005, 76.3);
((GeneralPath)shape).curveTo(30.200005, 75.3, 30.500004, 74.3, 31.100004, 73.5);
((GeneralPath)shape).curveTo(31.700005, 72.6, 32.500004, 72.0, 33.600006, 71.5);
((GeneralPath)shape).curveTo(34.70001, 71.0, 36.000008, 70.8, 37.500008, 70.8);
((GeneralPath)shape).curveTo(40.000008, 70.8, 41.90001, 71.3, 43.20001, 72.4);
((GeneralPath)shape).curveTo(44.500008, 73.5, 45.10001, 74.9, 45.20001, 76.8);
((GeneralPath)shape).lineTo(41.20001, 77.0);
((GeneralPath)shape).curveTo(41.000008, 76.0, 40.70001, 75.2, 40.10001, 74.8);
((GeneralPath)shape).curveTo(39.50001, 74.40001, 38.70001, 74.100006, 37.50001, 74.100006);
((GeneralPath)shape).curveTo(36.30001, 74.100006, 35.400013, 74.3, 34.700012, 74.8);
((GeneralPath)shape).curveTo(34.30001, 75.100006, 34.100014, 75.5, 34.100014, 76.0);
((GeneralPath)shape).curveTo(34.100014, 76.5, 34.300014, 76.9, 34.700012, 77.2);
((GeneralPath)shape).curveTo(35.200012, 77.6, 36.50001, 78.1, 38.400013, 78.5);
((GeneralPath)shape).curveTo(40.300014, 78.9, 41.800014, 79.4, 42.800014, 79.9);
((GeneralPath)shape).curveTo(43.700016, 80.4, 44.500015, 81.1, 45.000015, 81.9);
((GeneralPath)shape).curveTo(45.500015, 82.700005, 45.800014, 83.8, 45.800014, 85.1);
((GeneralPath)shape).curveTo(45.800014, 86.2, 45.500015, 87.299995, 44.800014, 88.299995);
((GeneralPath)shape).curveTo(44.200016, 89.299995, 43.300014, 89.99999, 42.100014, 90.49999);
((GeneralPath)shape).curveTo(40.900013, 90.99999, 39.500015, 91.19999, 37.700012, 91.19999);
((GeneralPath)shape).curveTo(35.200012, 91.19999, 33.200012, 90.59999, 31.900013, 89.49999);
((GeneralPath)shape).curveTo(30.700012, 88.49999, 29.800013, 86.799995, 29.600014, 84.59999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.8, 91.100006);
((GeneralPath)shape).lineTo(53.8, 74.6);
((GeneralPath)shape).lineTo(47.899998, 74.6);
((GeneralPath)shape).lineTo(47.899998, 71.2);
((GeneralPath)shape).lineTo(63.799995, 71.2);
((GeneralPath)shape).lineTo(63.799995, 74.6);
((GeneralPath)shape).lineTo(57.899994, 74.6);
((GeneralPath)shape).lineTo(57.899994, 91.1);
((GeneralPath)shape).lineTo(53.799995, 91.1);
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
	public ext_ost() {
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
       ext_ost base = new ext_ost();
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
       ext_ost base = new ext_ost();
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
        return () -> new ext_ost();
    }
}

