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
public class ext_mp2 implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
paint = new LinearGradientPaint(new Point2D.Double(36.150001525878906, 2.88700008392334), new Point2D.Double(36.150001525878906, 101.1259994506836), new float[] {0.0f,0.012f,0.182f,0.352f,0.521f,0.687f,0.848f,1.0f}, new Color[] {new Color(89, 85, 147, 255),new Color(91, 87, 148, 255),new Color(123, 119, 170, 255),new Color(152, 150, 191, 255),new Color(178, 178, 210, 255),new Color(199, 201, 226, 255),new Color(214, 217, 236, 255),new Color(219, 223, 240, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(72.3, 99.1);
((GeneralPath)shape).lineTo(0.0, 99.1);
((GeneralPath)shape).lineTo(0.0, 0.9);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(72.3, 99.1);
((GeneralPath)shape).lineTo(0.0, 99.1);
((GeneralPath)shape).lineTo(0.0, 0.9);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(72.3, 99.1);
((GeneralPath)shape).lineTo(0.0, 99.1);
((GeneralPath)shape).lineTo(0.0, 0.9);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_1);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(255, 255, 255, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.4, 91.2);
((GeneralPath)shape).lineTo(9.4, 71.3);
((GeneralPath)shape).lineTo(15.5, 71.3);
((GeneralPath)shape).lineTo(19.1, 84.9);
((GeneralPath)shape).lineTo(22.7, 71.3);
((GeneralPath)shape).lineTo(28.800001, 71.3);
((GeneralPath)shape).lineTo(28.800001, 91.200005);
((GeneralPath)shape).lineTo(25.0, 91.200005);
((GeneralPath)shape).lineTo(25.0, 75.5);
((GeneralPath)shape).lineTo(21.0, 91.2);
((GeneralPath)shape).lineTo(17.1, 91.2);
((GeneralPath)shape).lineTo(13.1, 75.5);
((GeneralPath)shape).lineTo(13.1, 91.2);
((GeneralPath)shape).lineTo(9.4, 91.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.9, 91.2);
((GeneralPath)shape).lineTo(32.9, 71.3);
((GeneralPath)shape).lineTo(39.4, 71.3);
((GeneralPath)shape).curveTo(41.9, 71.3, 43.5, 71.4, 44.2, 71.600006);
((GeneralPath)shape).curveTo(45.4, 71.90001, 46.3, 72.50001, 47.100002, 73.50001);
((GeneralPath)shape).curveTo(47.900005, 74.50001, 48.300003, 75.80001, 48.300003, 77.40001);
((GeneralPath)shape).curveTo(48.300003, 78.600006, 48.100002, 79.600006, 47.600002, 80.50001);
((GeneralPath)shape).curveTo(47.2, 81.30001, 46.600002, 82.00001, 45.9, 82.50001);
((GeneralPath)shape).curveTo(45.2, 83.00001, 44.5, 83.30001, 43.800003, 83.40001);
((GeneralPath)shape).curveTo(42.800003, 83.600006, 41.4, 83.70001, 39.600002, 83.70001);
((GeneralPath)shape).lineTo(37.0, 83.70001);
((GeneralPath)shape).lineTo(37.0, 91.20001);
((GeneralPath)shape).lineTo(32.9, 91.20001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.9, 74.6);
((GeneralPath)shape).lineTo(36.9, 80.2);
((GeneralPath)shape).lineTo(39.100002, 80.2);
((GeneralPath)shape).curveTo(40.7, 80.2, 41.800003, 80.1, 42.300003, 79.899994);
((GeneralPath)shape).curveTo(42.800003, 79.7, 43.300003, 79.399994, 43.600002, 78.899994);
((GeneralPath)shape).curveTo(43.9, 78.49999, 44.100002, 77.899994, 44.100002, 77.399994);
((GeneralPath)shape).curveTo(44.100002, 76.7, 43.9, 76.09999, 43.500004, 75.59999);
((GeneralPath)shape).curveTo(43.100002, 75.09999, 42.500004, 74.79999, 41.900005, 74.69999);
((GeneralPath)shape).curveTo(41.400005, 74.59999, 40.400005, 74.59999, 39.000004, 74.59999);
((GeneralPath)shape).lineTo(36.900005, 74.59999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(63.800003, 87.6);
((GeneralPath)shape).lineTo(63.800003, 91.1);
((GeneralPath)shape).lineTo(50.3, 91.1);
((GeneralPath)shape).curveTo(50.399998, 89.799995, 50.899998, 88.5, 51.6, 87.299995);
((GeneralPath)shape).curveTo(52.3, 86.1, 53.8, 84.49999, 55.899998, 82.49999);
((GeneralPath)shape).curveTo(57.6, 80.899994, 58.699997, 79.799995, 59.1, 79.19999);
((GeneralPath)shape).curveTo(59.6, 78.39999, 59.899998, 77.59999, 59.899998, 76.89999);
((GeneralPath)shape).curveTo(59.899998, 76.09998, 59.699997, 75.39999, 59.199997, 74.89999);
((GeneralPath)shape).curveTo(58.699997, 74.39999, 58.1, 74.19999, 57.299995, 74.19999);
((GeneralPath)shape).curveTo(56.499996, 74.19999, 55.899994, 74.39999, 55.399994, 74.89999);
((GeneralPath)shape).curveTo(54.899994, 75.39999, 54.599995, 76.19999, 54.599995, 77.29999);
((GeneralPath)shape).lineTo(50.799995, 76.89999);
((GeneralPath)shape).curveTo(50.999996, 74.79999, 51.699997, 73.29999, 52.999996, 72.39999);
((GeneralPath)shape).curveTo(54.199997, 71.499985, 55.699997, 70.999985, 57.499996, 70.999985);
((GeneralPath)shape).curveTo(59.499996, 70.999985, 60.999996, 71.499985, 62.199997, 72.59998);
((GeneralPath)shape).curveTo(63.299995, 73.69998, 63.899998, 74.999985, 63.899998, 76.499985);
((GeneralPath)shape).curveTo(63.899998, 77.39999, 63.699997, 78.19998, 63.399998, 79.09998);
((GeneralPath)shape).curveTo(63.1, 79.999985, 62.6, 80.79998, 61.899998, 81.59998);
((GeneralPath)shape).curveTo(61.399998, 82.19998, 60.6, 82.999985, 59.399998, 84.09998);
((GeneralPath)shape).curveTo(58.199997, 85.19998, 57.399998, 85.89999, 57.1, 86.29998);
((GeneralPath)shape).curveTo(56.8, 86.69998, 56.5, 86.99998, 56.3, 87.39998);
((GeneralPath)shape).lineTo(63.8, 87.39998);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
paint = new LinearGradientPaint(new Point2D.Double(58.32099914550781, 87.27300262451172), new Point2D.Double(50.78300094604492, 78.83899688720703), new float[] {0.0f,0.07f,0.159f,0.255f,0.359f,0.471f,0.598f,0.751f,1.0f}, new Color[] {new Color(89, 85, 147, 255),new Color(112, 108, 162, 255),new Color(137, 136, 181, 255),new Color(163, 165, 200, 255),new Color(186, 191, 217, 255),new Color(206, 213, 231, 255),new Color(222, 230, 242, 255),new Color(233, 243, 250, 255),new Color(236, 248, 254, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(45.2, 27.699999);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(45.2, 27.699999);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 0.9);
((GeneralPath)shape).lineTo(72.3, 27.699999);
((GeneralPath)shape).lineTo(45.2, 27.699999);
((GeneralPath)shape).lineTo(45.2, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_1);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(14.776000022888184, 56.17399978637695), new Point2D.Double(57.72600173950195, 56.17399978637695), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.8, 39.3);
((GeneralPath)shape).lineTo(21.3, 39.3);
((GeneralPath)shape).lineTo(34.3, 29.3);
((GeneralPath)shape).lineTo(34.3, 62.3);
((GeneralPath)shape).lineTo(21.3, 52.3);
((GeneralPath)shape).lineTo(14.799999, 52.3);
((GeneralPath)shape).lineTo(14.799999, 39.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(40.9, 49.5);
((GeneralPath)shape).lineTo(40.9, 52.4);
((GeneralPath)shape).curveTo(41.0, 52.4, 42.5, 52.4, 44.100002, 51.600002);
((GeneralPath)shape).curveTo(45.700005, 50.800003, 47.500004, 48.9, 47.500004, 45.800003);
((GeneralPath)shape).curveTo(47.500004, 42.700005, 45.800003, 40.800003, 44.100002, 40.000004);
((GeneralPath)shape).curveTo(42.500004, 39.200005, 41.000004, 39.200005, 40.9, 39.200005);
((GeneralPath)shape).lineTo(40.9, 42.100006);
((GeneralPath)shape).lineTo(41.0, 42.100006);
((GeneralPath)shape).curveTo(41.4, 42.100006, 42.4, 42.300007, 43.1, 42.800007);
((GeneralPath)shape).curveTo(43.899998, 43.300007, 44.5, 44.000008, 44.5, 45.800007);
((GeneralPath)shape).curveTo(44.5, 47.800007, 43.7, 48.400005, 42.7, 49.000008);
((GeneralPath)shape).curveTo(42.2, 49.20001, 41.7, 49.40001, 41.4, 49.40001);
((GeneralPath)shape).curveTo(41.2, 49.40001, 41.100002, 49.40001, 41.0, 49.500008);
((GeneralPath)shape).lineTo(40.9, 49.500008);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(40.9, 54.6);
((GeneralPath)shape).lineTo(40.9, 57.5);
((GeneralPath)shape).curveTo(41.0, 57.5, 43.7, 57.5, 46.7, 56.1);
((GeneralPath)shape).curveTo(49.600002, 54.699997, 52.7, 51.5, 52.600002, 46.0);
((GeneralPath)shape).curveTo(52.7, 40.4, 49.600002, 37.3, 46.7, 35.9);
((GeneralPath)shape).curveTo(43.8, 34.5, 41.100002, 34.5, 40.9, 34.5);
((GeneralPath)shape).lineTo(40.9, 37.4);
((GeneralPath)shape).lineTo(41.2, 37.4);
((GeneralPath)shape).curveTo(42.0, 37.5, 44.3, 37.800003, 46.100002, 39.0);
((GeneralPath)shape).curveTo(48.000004, 40.2, 49.600002, 42.1, 49.600002, 46.1);
((GeneralPath)shape).curveTo(49.600002, 50.699997, 47.500004, 52.6, 45.300003, 53.6);
((GeneralPath)shape).curveTo(44.200005, 54.199997, 43.100002, 54.399998, 42.200005, 54.6);
((GeneralPath)shape).curveTo(41.800003, 54.699997, 41.400005, 54.699997, 41.200005, 54.699997);
((GeneralPath)shape).curveTo(41.000004, 54.6, 40.900005, 54.6, 40.900005, 54.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(40.9, 59.6);
((GeneralPath)shape).lineTo(40.9, 62.5);
((GeneralPath)shape).curveTo(41.0, 62.5, 45.0, 62.5, 49.2, 60.4);
((GeneralPath)shape).curveTo(53.4, 58.4, 57.7, 53.9, 57.7, 45.800003);
((GeneralPath)shape).curveTo(57.8, 37.700005, 53.4, 33.200005, 49.2, 31.200003);
((GeneralPath)shape).curveTo(45.0, 29.100002, 41.0, 29.100002, 40.9, 29.100002);
((GeneralPath)shape).lineTo(40.9, 32.0);
((GeneralPath)shape).lineTo(41.5, 32.0);
((GeneralPath)shape).curveTo(42.8, 32.1, 46.3, 32.6, 49.2, 34.5);
((GeneralPath)shape).curveTo(52.100002, 36.4, 54.7, 39.6, 54.8, 45.8);
((GeneralPath)shape).curveTo(54.7, 52.8, 51.399998, 56.0, 47.899998, 57.8);
((GeneralPath)shape).curveTo(46.199997, 58.7, 44.399998, 59.1, 42.999996, 59.3);
((GeneralPath)shape).curveTo(42.299995, 59.399998, 41.799995, 59.5, 41.399998, 59.5);
((GeneralPath)shape).curveTo(41.1, 59.6, 40.899998, 59.6, 40.899998, 59.6);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
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
		return 0.7430000305175781;
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
	public ext_mp2() {
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
       ext_mp2 base = new ext_mp2();
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
       ext_mp2 base = new ext_mp2();
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
        return () -> new ext_mp2();
    }
}

