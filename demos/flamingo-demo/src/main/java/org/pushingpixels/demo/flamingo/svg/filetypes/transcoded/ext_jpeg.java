package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_jpeg implements ResizableIcon, IsHiDpiAware {
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
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.0f,0.124f,0.262f,0.41f,0.571f,0.752f,1.0f}, new Color[] {new Color(0, 107, 105, 255),new Color(0, 128, 127, 255),new Color(0, 147, 147, 255),new Color(0, 163, 163, 255),new Color(0, 176, 175, 255),new Color(8, 184, 183, 255),new Color(20, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
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
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
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
((GeneralPath)shape).moveTo(14.0, 75.3);
((GeneralPath)shape).lineTo(17.2, 75.3);
((GeneralPath)shape).lineTo(17.2, 85.3);
((GeneralPath)shape).curveTo(17.2, 86.600006, 17.1, 87.600006, 16.900002, 88.3);
((GeneralPath)shape).curveTo(16.600002, 89.200005, 16.000002, 90.0, 15.200002, 90.5);
((GeneralPath)shape).curveTo(14.400002, 91.1, 13.300002, 91.3, 12.000002, 91.3);
((GeneralPath)shape).curveTo(10.400002, 91.3, 9.200002, 90.9, 8.400002, 90.0);
((GeneralPath)shape).curveTo(7.5000014, 89.2, 7.0000014, 87.9, 7.0000014, 86.2);
((GeneralPath)shape).lineTo(10.000002, 85.899994);
((GeneralPath)shape).curveTo(10.000002, 86.799995, 10.200002, 87.399994, 10.400002, 87.799995);
((GeneralPath)shape).curveTo(10.700002, 88.399994, 11.300001, 88.6, 12.000002, 88.6);
((GeneralPath)shape).curveTo(12.700002, 88.6, 13.200002, 88.4, 13.500002, 88.0);
((GeneralPath)shape).curveTo(13.800002, 87.6, 13.900002, 86.8, 13.900002, 85.5);
((GeneralPath)shape).lineTo(13.900002, 75.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(20.6, 91.100006);
((GeneralPath)shape).lineTo(20.6, 75.3);
((GeneralPath)shape).lineTo(25.7, 75.3);
((GeneralPath)shape).curveTo(27.6, 75.3, 28.900002, 75.4, 29.5, 75.5);
((GeneralPath)shape).curveTo(30.4, 75.7, 31.2, 76.3, 31.8, 77.0);
((GeneralPath)shape).curveTo(32.399998, 77.8, 32.7, 78.8, 32.7, 80.1);
((GeneralPath)shape).curveTo(32.7, 81.1, 32.5, 81.9, 32.2, 82.5);
((GeneralPath)shape).curveTo(31.800001, 83.2, 31.400002, 83.7, 30.900002, 84.1);
((GeneralPath)shape).curveTo(30.400002, 84.5, 29.800001, 84.7, 29.2, 84.799995);
((GeneralPath)shape).curveTo(28.400002, 84.99999, 27.300001, 84.99999, 25.900002, 84.99999);
((GeneralPath)shape).lineTo(23.800001, 84.99999);
((GeneralPath)shape).lineTo(23.800001, 90.899994);
((GeneralPath)shape).lineTo(20.6, 90.899994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.8, 78.0);
((GeneralPath)shape).lineTo(23.8, 82.5);
((GeneralPath)shape).lineTo(25.599998, 82.5);
((GeneralPath)shape).curveTo(26.899998, 82.5, 27.699999, 82.4, 28.099998, 82.3);
((GeneralPath)shape).curveTo(28.499998, 82.100006, 28.899998, 81.9, 29.099998, 81.5);
((GeneralPath)shape).curveTo(29.3, 81.1, 29.499998, 80.7, 29.499998, 80.3);
((GeneralPath)shape).curveTo(29.499998, 79.700005, 29.299997, 79.3, 28.999998, 78.9);
((GeneralPath)shape).curveTo(28.699999, 78.5, 28.199999, 78.3, 27.699999, 78.200005);
((GeneralPath)shape).curveTo(27.3, 78.00001, 26.499998, 78.00001, 25.3, 78.00001);
((GeneralPath)shape).lineTo(23.8, 78.00001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.4, 91.1);
((GeneralPath)shape).lineTo(35.4, 75.3);
((GeneralPath)shape).lineTo(47.2, 75.3);
((GeneralPath)shape).lineTo(47.2, 78.0);
((GeneralPath)shape).lineTo(38.6, 78.0);
((GeneralPath)shape).lineTo(38.6, 81.5);
((GeneralPath)shape).lineTo(46.6, 81.5);
((GeneralPath)shape).lineTo(46.6, 84.2);
((GeneralPath)shape).lineTo(38.6, 84.2);
((GeneralPath)shape).lineTo(38.6, 88.5);
((GeneralPath)shape).lineTo(47.5, 88.5);
((GeneralPath)shape).lineTo(47.5, 91.2);
((GeneralPath)shape).lineTo(35.4, 91.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(57.5, 85.299995);
((GeneralPath)shape).lineTo(57.5, 82.6);
((GeneralPath)shape).lineTo(64.4, 82.6);
((GeneralPath)shape).lineTo(64.4, 88.9);
((GeneralPath)shape).curveTo(63.7, 89.5, 62.800003, 90.1, 61.5, 90.6);
((GeneralPath)shape).curveTo(60.2, 91.1, 58.9, 91.299995, 57.6, 91.299995);
((GeneralPath)shape).curveTo(55.899998, 91.299995, 54.5, 90.99999, 53.3, 90.299995);
((GeneralPath)shape).curveTo(52.1, 89.6, 51.1, 88.6, 50.5, 87.299995);
((GeneralPath)shape).curveTo(49.9, 85.99999, 49.6, 84.6, 49.6, 83.1);
((GeneralPath)shape).curveTo(49.6, 81.5, 49.899998, 80.0, 50.6, 78.7);
((GeneralPath)shape).curveTo(51.3, 77.399994, 52.3, 76.399994, 53.6, 75.799995);
((GeneralPath)shape).curveTo(54.6, 75.299995, 55.899998, 74.99999, 57.399998, 74.99999);
((GeneralPath)shape).curveTo(59.399998, 74.99999, 60.899998, 75.399994, 61.999996, 76.19999);
((GeneralPath)shape).curveTo(63.099995, 76.99999, 63.799995, 78.19999, 64.1, 79.59999);
((GeneralPath)shape).lineTo(61.0, 80.29999);
((GeneralPath)shape).curveTo(60.8, 79.499985, 60.4, 78.89999, 59.7, 78.499985);
((GeneralPath)shape).curveTo(59.100002, 78.09998, 58.3, 77.79999, 57.4, 77.79999);
((GeneralPath)shape).curveTo(56.0, 77.79999, 54.9, 78.19999, 54.100002, 79.09999);
((GeneralPath)shape).curveTo(53.300003, 79.99999, 52.9, 81.29999, 52.9, 82.99999);
((GeneralPath)shape).curveTo(52.9, 84.899994, 53.300003, 86.299995, 54.2, 87.19999);
((GeneralPath)shape).curveTo(55.0, 88.09999, 56.100002, 88.59999, 57.5, 88.59999);
((GeneralPath)shape).curveTo(58.2, 88.59999, 58.8, 88.49999, 59.5, 88.19999);
((GeneralPath)shape).curveTo(60.2, 87.89999, 60.8, 87.59999, 61.2, 87.19999);
((GeneralPath)shape).lineTo(61.2, 85.19999);
((GeneralPath)shape).lineTo(57.5, 85.19999);
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
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {new Color(214, 237, 232, 255),new Color(211, 235, 230, 255),new Color(199, 227, 223, 255),new Color(183, 216, 213, 255),new Color(160, 203, 201, 255),new Color(132, 186, 185, 255),new Color(98, 167, 167, 255),new Color(52, 147, 148, 255),new Color(0, 127, 127, 255),new Color(0, 107, 106, 255),new Color(0, 107, 105, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
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
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
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
paint = new LinearGradientPaint(new Point2D.Double(36.25, 37.35300064086914), new Point2D.Double(36.25, 85.16100311279297), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(62.7, 56.8);
((GeneralPath)shape).curveTo(61.100002, 56.0, 58.100002, 50.2, 53.5, 49.8);
((GeneralPath)shape).curveTo(49.5, 49.5, 44.4, 48.0, 41.6, 47.8);
((GeneralPath)shape).curveTo(38.1, 42.0, 32.1, 32.8, 27.099998, 27.9);
((GeneralPath)shape).lineTo(40.899998, 28.6);
((GeneralPath)shape).curveTo(37.2, 19.8, 27.7, 23.0, 27.7, 23.0);
((GeneralPath)shape).lineTo(34.100002, 17.7);
((GeneralPath)shape).curveTo(25.900002, 14.400001, 22.500002, 22.400002, 22.500002, 22.400002);
((GeneralPath)shape).curveTo(14.000002, 17.7, 9.600002, 25.7, 9.600002, 25.7);
((GeneralPath)shape).lineTo(18.400002, 26.300001);
((GeneralPath)shape).curveTo(8.4, 29.1, 11.2, 39.0, 11.2, 39.0);
((GeneralPath)shape).lineTo(20.099998, 31.0);
((GeneralPath)shape).curveTo(18.199999, 35.4, 22.399998, 38.5, 22.399998, 38.5);
((GeneralPath)shape).lineTo(25.0, 27.7);
((GeneralPath)shape).curveTo(25.0, 27.7, 34.3, 38.300003, 37.2, 49.1);
((GeneralPath)shape).curveTo(33.5, 51.0, 27.7, 54.1, 23.2, 54.699997);
((GeneralPath)shape).curveTo(17.0, 55.499996, 9.700001, 59.699997, 9.700001, 59.699997);
((GeneralPath)shape).lineTo(9.700001, 64.6);
((GeneralPath)shape).lineTo(62.8, 64.6);
((GeneralPath)shape).lineTo(62.7, 56.8);
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
        return 0.13300000131130219;
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
		return 0.7380063533782959;
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
	public ext_jpeg() {
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
       ext_jpeg base = new ext_jpeg();
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
       ext_jpeg base = new ext_jpeg();
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
        return () -> new NeonIcon(new ext_jpeg());
    }
}

