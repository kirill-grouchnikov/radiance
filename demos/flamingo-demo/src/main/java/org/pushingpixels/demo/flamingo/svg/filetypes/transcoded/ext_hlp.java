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
public class ext_hlp implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(486.3110046386719, 644.1119995117188), new Point2D.Double(486.30999755859375, 742.0850219726562), new float[] {0.0f,0.005f,1.0f}, new Color[] {new Color(116, 45, 45, 255),new Color(130, 113, 0, 255),new Color(255, 238, 145, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.3, 1.0);
((GeneralPath)shape).lineTo(72.4, 27.7);
((GeneralPath)shape).lineTo(72.4, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.3, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.3, 1.0);
((GeneralPath)shape).lineTo(72.4, 27.7);
((GeneralPath)shape).lineTo(72.4, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.3, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
paint = new Color(254, 254, 254, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.2, 91.6);
((GeneralPath)shape).lineTo(16.2, 76.0);
((GeneralPath)shape).lineTo(19.400002, 76.0);
((GeneralPath)shape).lineTo(19.400002, 82.1);
((GeneralPath)shape).lineTo(25.7, 82.1);
((GeneralPath)shape).lineTo(25.7, 76.0);
((GeneralPath)shape).lineTo(28.900002, 76.0);
((GeneralPath)shape).lineTo(28.900002, 91.6);
((GeneralPath)shape).lineTo(25.7, 91.6);
((GeneralPath)shape).lineTo(25.7, 84.799995);
((GeneralPath)shape).lineTo(19.400002, 84.799995);
((GeneralPath)shape).lineTo(19.400002, 91.6);
((GeneralPath)shape).lineTo(16.2, 91.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.300003, 91.6);
((GeneralPath)shape).lineTo(32.300003, 76.1);
((GeneralPath)shape).lineTo(35.500004, 76.1);
((GeneralPath)shape).lineTo(35.500004, 89.0);
((GeneralPath)shape).lineTo(43.400005, 89.0);
((GeneralPath)shape).lineTo(43.400005, 91.6);
((GeneralPath)shape).lineTo(32.3, 91.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.700005, 91.6);
((GeneralPath)shape).lineTo(45.700005, 76.0);
((GeneralPath)shape).lineTo(50.800003, 76.0);
((GeneralPath)shape).curveTo(52.700005, 76.0, 54.000004, 76.1, 54.600002, 76.2);
((GeneralPath)shape).curveTo(55.500004, 76.399994, 56.300003, 76.899994, 56.9, 77.7);
((GeneralPath)shape).curveTo(57.5, 78.5, 57.800003, 79.5, 57.800003, 80.7);
((GeneralPath)shape).curveTo(57.800003, 81.7, 57.600002, 82.5, 57.300003, 83.1);
((GeneralPath)shape).curveTo(57.000004, 83.7, 56.500004, 84.299995, 56.000004, 84.6);
((GeneralPath)shape).curveTo(55.500004, 84.9, 54.900005, 85.2, 54.300003, 85.299995);
((GeneralPath)shape).curveTo(53.500004, 85.399994, 52.4, 85.49999, 51.000004, 85.49999);
((GeneralPath)shape).lineTo(48.900005, 85.49999);
((GeneralPath)shape).lineTo(48.900005, 91.399994);
((GeneralPath)shape).lineTo(45.700005, 91.399994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.800003, 78.6);
((GeneralPath)shape).lineTo(48.800003, 83.0);
((GeneralPath)shape).lineTo(50.500004, 83.0);
((GeneralPath)shape).curveTo(51.800003, 83.0, 52.600002, 82.9, 53.000004, 82.8);
((GeneralPath)shape).curveTo(53.400005, 82.600006, 53.800003, 82.4, 54.000004, 82.0);
((GeneralPath)shape).curveTo(54.200005, 81.7, 54.400005, 81.2, 54.400005, 80.8);
((GeneralPath)shape).curveTo(54.400005, 80.200005, 54.200005, 79.8, 53.900005, 79.4);
((GeneralPath)shape).curveTo(53.600006, 79.0, 53.100006, 78.8, 52.600006, 78.700005);
((GeneralPath)shape).curveTo(52.200005, 78.600006, 51.500008, 78.600006, 50.300007, 78.600006);
((GeneralPath)shape).lineTo(48.800007, 78.600006);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(37.0, 68.5), new Point2D.Double(37.0, 21.5), new float[] {0.0f,1.0f}, new Color[] {new Color(170, 148, 0, 255),new Color(86, 74, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(58.5, 21.5);
((GeneralPath)shape).lineTo(25.2, 21.5);
((GeneralPath)shape).curveTo(20.300001, 21.5, 15.400001, 23.5, 15.400001, 29.3);
((GeneralPath)shape).lineTo(15.400001, 68.5);
((GeneralPath)shape).lineTo(50.600002, 68.5);
((GeneralPath)shape).lineTo(50.600002, 29.3);
((GeneralPath)shape).lineTo(20.4, 29.3);
((GeneralPath)shape).curveTo(20.4, 26.4, 22.4, 25.4, 24.3, 25.4);
((GeneralPath)shape).lineTo(54.699997, 25.4);
((GeneralPath)shape).lineTo(54.699997, 64.6);
((GeneralPath)shape).lineTo(58.6, 60.699997);
((GeneralPath)shape).lineTo(58.6, 21.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new Color(199, 184, 104, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.5, 51.0);
((GeneralPath)shape).curveTo(31.5, 46.9, 36.2, 46.3, 36.2, 43.4);
((GeneralPath)shape).curveTo(36.2, 42.100002, 35.0, 41.100002, 33.5, 41.100002);
((GeneralPath)shape).curveTo(31.9, 41.100002, 30.5, 42.300003, 30.5, 42.300003);
((GeneralPath)shape).lineTo(28.5, 39.800003);
((GeneralPath)shape).curveTo(28.5, 39.800003, 30.4, 37.800003, 33.8, 37.800003);
((GeneralPath)shape).curveTo(37.0, 37.800003, 39.899998, 39.800003, 39.899998, 43.100002);
((GeneralPath)shape).curveTo(39.899998, 47.800003, 34.999996, 48.300003, 34.999996, 51.300003);
((GeneralPath)shape).lineTo(34.999996, 52.4);
((GeneralPath)shape).lineTo(31.499996, 52.4);
((GeneralPath)shape).lineTo(31.499996, 51.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(31.5, 54.8);
((GeneralPath)shape).lineTo(35.0, 54.8);
((GeneralPath)shape).lineTo(35.0, 58.1);
((GeneralPath)shape).lineTo(31.5, 58.1);
((GeneralPath)shape).lineTo(31.5, 54.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new LinearGradientPaint(new Point2D.Double(495.43701171875, 715.27099609375), new Point2D.Double(508.98199462890625, 728.8179931640625), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 234, 134, 255),new Color(134, 114, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.3, 1.0);
((GeneralPath)shape).lineTo(72.4, 27.7);
((GeneralPath)shape).lineTo(45.3, 27.7);
((GeneralPath)shape).lineTo(45.3, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
paint = new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.3, 1.0);
((GeneralPath)shape).lineTo(72.4, 27.7);
((GeneralPath)shape).lineTo(45.3, 27.7);
((GeneralPath)shape).lineTo(45.3, 1.0);
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
        return 0.13099998235702515;
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
		return 0.7437919974327087;
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
	private ext_hlp() {
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
       ext_hlp base = new ext_hlp();
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
       ext_hlp base = new ext_hlp();
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
        return () -> new ext_hlp();
    }
}

