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
public class ext_cur implements ResizableIcon {
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
((GeneralPath)shape).moveTo(20.6, 83.8);
((GeneralPath)shape).lineTo(24.5, 85.0);
((GeneralPath)shape).curveTo(23.9, 87.2, 22.9, 88.8, 21.5, 89.8);
((GeneralPath)shape).curveTo(20.1, 90.9, 18.3, 91.4, 16.2, 91.4);
((GeneralPath)shape).curveTo(13.500001, 91.4, 11.400001, 90.5, 9.700001, 88.700005);
((GeneralPath)shape).curveTo(8.000001, 86.9, 7.100001, 84.4, 7.100001, 81.3);
((GeneralPath)shape).curveTo(7.100001, 78.0, 8.000001, 75.4, 9.700001, 73.600006);
((GeneralPath)shape).curveTo(11.400001, 71.80001, 13.700001, 70.90001, 16.5, 70.90001);
((GeneralPath)shape).curveTo(18.9, 70.90001, 20.9, 71.600006, 22.5, 73.100006);
((GeneralPath)shape).curveTo(23.4, 73.90001, 24.1, 75.200005, 24.5, 76.8);
((GeneralPath)shape).lineTo(20.5, 77.700005);
((GeneralPath)shape).curveTo(20.3, 76.700005, 19.8, 75.9, 19.0, 75.3);
((GeneralPath)shape).curveTo(18.2, 74.700005, 17.3, 74.4, 16.3, 74.4);
((GeneralPath)shape).curveTo(14.799999, 74.4, 13.599999, 74.9, 12.699999, 76.0);
((GeneralPath)shape).curveTo(11.799998, 77.1, 11.299999, 78.8, 11.299999, 81.1);
((GeneralPath)shape).curveTo(11.299999, 83.6, 11.799999, 85.4, 12.699999, 86.5);
((GeneralPath)shape).curveTo(13.599998, 87.6, 14.799999, 88.1, 16.199999, 88.1);
((GeneralPath)shape).curveTo(17.3, 88.1, 18.199999, 87.799995, 18.999998, 87.1);
((GeneralPath)shape).curveTo(19.699999, 86.299995, 20.199999, 85.2, 20.599998, 83.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.900002, 71.200005);
((GeneralPath)shape).lineTo(31.900002, 71.200005);
((GeneralPath)shape).lineTo(31.900002, 82.0);
((GeneralPath)shape).curveTo(31.900002, 83.7, 31.900002, 84.8, 32.100002, 85.3);
((GeneralPath)shape).curveTo(32.300003, 86.100006, 32.7, 86.8, 33.300003, 87.3);
((GeneralPath)shape).curveTo(34.000004, 87.700005, 34.9, 88.0, 36.000004, 88.0);
((GeneralPath)shape).curveTo(37.100006, 88.0, 38.000004, 87.8, 38.600002, 87.3);
((GeneralPath)shape).curveTo(39.2, 86.8, 39.500004, 86.3, 39.600002, 85.600006);
((GeneralPath)shape).curveTo(39.7, 84.90001, 39.800003, 83.8, 39.800003, 82.200005);
((GeneralPath)shape).lineTo(39.800003, 71.200005);
((GeneralPath)shape).lineTo(43.800003, 71.200005);
((GeneralPath)shape).lineTo(43.800003, 81.600006);
((GeneralPath)shape).curveTo(43.800003, 84.00001, 43.700005, 85.700005, 43.500004, 86.600006);
((GeneralPath)shape).curveTo(43.300003, 87.50001, 42.900005, 88.40001, 42.300003, 89.100006);
((GeneralPath)shape).curveTo(41.7, 89.8, 41.000004, 90.40001, 40.000004, 90.8);
((GeneralPath)shape).curveTo(39.000004, 91.200005, 37.700005, 91.4, 36.200005, 91.4);
((GeneralPath)shape).curveTo(34.300003, 91.4, 32.800003, 91.200005, 31.900005, 90.700005);
((GeneralPath)shape).curveTo(31.000008, 90.200005, 30.100006, 89.700005, 29.600006, 89.00001);
((GeneralPath)shape).curveTo(29.100006, 88.30001, 28.700006, 87.600006, 28.500006, 86.80001);
((GeneralPath)shape).curveTo(28.200006, 85.70001, 28.100006, 84.00001, 28.100006, 81.80001);
((GeneralPath)shape).lineTo(28.100006, 71.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.100002, 91.100006);
((GeneralPath)shape).lineTo(48.100002, 71.2);
((GeneralPath)shape).lineTo(56.600002, 71.2);
((GeneralPath)shape).curveTo(58.7, 71.2, 60.300003, 71.399994, 61.300003, 71.7);
((GeneralPath)shape).curveTo(62.300003, 72.1, 63.000004, 72.7, 63.600002, 73.6);
((GeneralPath)shape).curveTo(64.200005, 74.5, 64.5, 75.6, 64.5, 76.7);
((GeneralPath)shape).curveTo(64.5, 78.2, 64.1, 79.399994, 63.2, 80.399994);
((GeneralPath)shape).curveTo(62.300003, 81.399994, 61.0, 81.99999, 59.2, 82.2);
((GeneralPath)shape).curveTo(60.100002, 82.7, 60.8, 83.299995, 61.4, 83.899994);
((GeneralPath)shape).curveTo(62.0, 84.49999, 62.7, 85.59999, 63.7, 87.09999);
((GeneralPath)shape).lineTo(66.1, 90.99999);
((GeneralPath)shape).lineTo(61.3, 90.99999);
((GeneralPath)shape).lineTo(58.399998, 86.69999);
((GeneralPath)shape).curveTo(57.399998, 85.19999, 56.699997, 84.19999, 56.3, 83.79999);
((GeneralPath)shape).curveTo(55.899998, 83.39999, 55.5, 83.09999, 55.1, 82.999985);
((GeneralPath)shape).curveTo(54.699997, 82.89999, 54.0, 82.79999, 53.1, 82.79999);
((GeneralPath)shape).lineTo(52.3, 82.79999);
((GeneralPath)shape).lineTo(52.3, 91.09999);
((GeneralPath)shape).lineTo(48.1, 91.09999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.2, 79.600006);
((GeneralPath)shape).lineTo(55.2, 79.600006);
((GeneralPath)shape).curveTo(57.100002, 79.600006, 58.3, 79.50001, 58.8, 79.40001);
((GeneralPath)shape).curveTo(59.3, 79.20001, 59.7, 79.00001, 59.899998, 78.600006);
((GeneralPath)shape).curveTo(60.199997, 78.200005, 60.3, 77.700005, 60.3, 77.100006);
((GeneralPath)shape).curveTo(60.3, 76.40001, 60.1, 75.90001, 59.8, 75.50001);
((GeneralPath)shape).curveTo(59.399998, 75.100006, 58.899998, 74.80001, 58.3, 74.700005);
((GeneralPath)shape).curveTo(58.0, 74.700005, 57.0, 74.600006, 55.399998, 74.600006);
((GeneralPath)shape).lineTo(52.3, 74.600006);
((GeneralPath)shape).lineTo(52.3, 79.600006);
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
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(-1.5219899415969849f, 1.5223400592803955f, -1.4066799879074097f, -1.4063600301742554f, 178.2310028076172f, 24.104999542236328f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
paint = new LinearGradientPaint(new Point2D.Double(47.33700180053711, 50.60499954223633), new Point2D.Double(47.33700180053711, 13.604000091552734), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 145, 161, 255),new Color(202, 213, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(52.4, 34.0);
((GeneralPath)shape).lineTo(56.7, 34.5);
((GeneralPath)shape).lineTo(56.100002, 41.1);
((GeneralPath)shape).lineTo(60.000004, 40.699997);
((GeneralPath)shape).lineTo(52.400005, 56.199997);
((GeneralPath)shape).lineTo(48.0, 39.3);
((GeneralPath)shape).lineTo(51.8, 40.6);
((GeneralPath)shape).lineTo(52.399998, 34.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5_0);
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
	public ext_cur() {
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
       ext_cur base = new ext_cur();
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
       ext_cur base = new ext_cur();
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
        return () -> new ext_cur();
    }
}

