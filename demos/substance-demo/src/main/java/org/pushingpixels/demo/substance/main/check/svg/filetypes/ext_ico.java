package org.pushingpixels.demo.substance.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_ico implements ResizableIcon {
    

    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Shape clip = null;

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
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.0f,0.124f,0.262f,0.41f,0.571f,0.752f,1.0f}, new Color[] {new Color(0, 107, 105, 255),new Color(0, 128, 127, 255),new Color(0, 147, 147, 255),new Color(0, 163, 163, 255),new Color(0, 176, 175, 255),new Color(8, 184, 183, 255),new Color(20, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
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
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.3, 91.1);
((GeneralPath)shape).lineTo(13.3, 71.2);
((GeneralPath)shape).lineTo(17.3, 71.2);
((GeneralPath)shape).lineTo(17.3, 91.0);
((GeneralPath)shape).lineTo(13.299999, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(34.0, 83.8);
((GeneralPath)shape).lineTo(37.9, 85.0);
((GeneralPath)shape).curveTo(37.300003, 87.2, 36.300003, 88.8, 34.9, 89.8);
((GeneralPath)shape).curveTo(33.5, 90.9, 31.7, 91.4, 29.600002, 91.4);
((GeneralPath)shape).curveTo(26.900002, 91.4, 24.800003, 90.5, 23.100002, 88.700005);
((GeneralPath)shape).curveTo(21.400002, 86.90001, 20.500002, 84.4, 20.500002, 81.3);
((GeneralPath)shape).curveTo(20.500002, 78.0, 21.400002, 75.4, 23.100002, 73.600006);
((GeneralPath)shape).curveTo(24.800003, 71.80001, 27.100002, 70.90001, 29.900002, 70.90001);
((GeneralPath)shape).curveTo(32.300003, 70.90001, 34.300003, 71.600006, 35.9, 73.100006);
((GeneralPath)shape).curveTo(36.800003, 73.90001, 37.5, 75.200005, 37.9, 76.8);
((GeneralPath)shape).lineTo(33.9, 77.700005);
((GeneralPath)shape).curveTo(33.7, 76.700005, 33.2, 75.9, 32.4, 75.3);
((GeneralPath)shape).curveTo(31.7, 74.700005, 30.7, 74.4, 29.7, 74.4);
((GeneralPath)shape).curveTo(28.2, 74.4, 27.0, 74.9, 26.1, 76.0);
((GeneralPath)shape).curveTo(25.2, 77.1, 24.7, 78.8, 24.7, 81.1);
((GeneralPath)shape).curveTo(24.7, 83.6, 25.2, 85.4, 26.1, 86.5);
((GeneralPath)shape).curveTo(27.0, 87.6, 28.2, 88.1, 29.6, 88.1);
((GeneralPath)shape).curveTo(30.7, 88.1, 31.6, 87.799995, 32.4, 87.1);
((GeneralPath)shape).curveTo(33.200005, 86.4, 33.600002, 85.2, 34.0, 83.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(40.5, 81.3);
((GeneralPath)shape).curveTo(40.5, 79.3, 40.8, 77.600006, 41.4, 76.200005);
((GeneralPath)shape).curveTo(41.9, 75.200005, 42.5, 74.3, 43.300003, 73.50001);
((GeneralPath)shape).curveTo(44.100002, 72.700005, 44.9, 72.100006, 45.9, 71.700005);
((GeneralPath)shape).curveTo(47.100002, 71.200005, 48.600002, 70.9, 50.2, 70.9);
((GeneralPath)shape).curveTo(53.100002, 70.9, 55.5, 71.8, 57.3, 73.6);
((GeneralPath)shape).curveTo(59.1, 75.4, 59.899998, 77.9, 59.899998, 81.2);
((GeneralPath)shape).curveTo(59.899998, 84.399994, 58.999996, 86.899994, 57.3, 88.7);
((GeneralPath)shape).curveTo(55.5, 90.5, 53.2, 91.399994, 50.3, 91.399994);
((GeneralPath)shape).curveTo(47.3, 91.399994, 45.0, 90.49999, 43.2, 88.7);
((GeneralPath)shape).curveTo(41.4, 86.9, 40.5, 84.399994, 40.5, 81.299995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(44.7, 81.100006);
((GeneralPath)shape).curveTo(44.7, 83.3, 45.2, 85.100006, 46.3, 86.200005);
((GeneralPath)shape).curveTo(47.3, 87.4, 48.7, 87.9, 50.3, 87.9);
((GeneralPath)shape).curveTo(51.899998, 87.9, 53.2, 87.3, 54.3, 86.200005);
((GeneralPath)shape).curveTo(55.3, 85.00001, 55.8, 83.3, 55.8, 81.00001);
((GeneralPath)shape).curveTo(55.8, 78.700005, 55.3, 77.00001, 54.3, 75.90001);
((GeneralPath)shape).curveTo(53.3, 74.80001, 52.0, 74.20001, 50.3, 74.20001);
((GeneralPath)shape).curveTo(48.6, 74.20001, 47.3, 74.80001, 46.3, 75.90001);
((GeneralPath)shape).curveTo(45.2, 77.100006, 44.7, 78.90001, 44.7, 81.100006);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
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
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {new Color(214, 237, 232, 255),new Color(211, 235, 230, 255),new Color(199, 227, 223, 255),new Color(183, 216, 213, 255),new Color(160, 203, 201, 255),new Color(132, 186, 185, 255),new Color(98, 167, 167, 255),new Color(52, 147, 148, 255),new Color(0, 127, 127, 255),new Color(0, 107, 106, 255),new Color(0, 107, 105, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(35.8, 16.2);
((GeneralPath)shape).curveTo(36.0, 15.700001, 36.2, 15.700001, 36.399998, 16.2);
((GeneralPath)shape).lineTo(41.8, 32.9);
((GeneralPath)shape).curveTo(42.0, 33.4, 42.399998, 33.800003, 43.0, 33.800003);
((GeneralPath)shape).lineTo(60.6, 33.800003);
((GeneralPath)shape).curveTo(61.1, 33.800003, 61.199997, 34.000004, 60.8, 34.300003);
((GeneralPath)shape).lineTo(46.5, 44.6);
((GeneralPath)shape).curveTo(46.1, 44.899998, 45.9, 45.5, 46.1, 46.0);
((GeneralPath)shape).lineTo(51.5, 62.7);
((GeneralPath)shape).curveTo(51.7, 63.2, 51.4, 63.3, 51.1, 63.0);
((GeneralPath)shape).lineTo(36.8, 52.7);
((GeneralPath)shape).curveTo(36.399998, 52.4, 35.8, 52.4, 35.3, 52.7);
((GeneralPath)shape).lineTo(21.2, 63.0);
((GeneralPath)shape).curveTo(20.800001, 63.3, 20.6, 63.1, 20.800001, 62.7);
((GeneralPath)shape).lineTo(26.2, 46.0);
((GeneralPath)shape).curveTo(26.300001, 45.5, 26.2, 44.9, 25.800001, 44.6);
((GeneralPath)shape).lineTo(11.5, 34.3);
((GeneralPath)shape).curveTo(11.1, 34.0, 11.2, 33.8, 11.7, 33.8);
((GeneralPath)shape).lineTo(29.3, 33.8);
((GeneralPath)shape).curveTo(29.8, 33.8, 30.3, 33.399998, 30.5, 32.899998);
((GeneralPath)shape).lineTo(35.8, 16.199997);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.11800003051758, 63.15800094604492), new Point2D.Double(36.11800003051758, 15.819999694824219), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
		return 0.7379999160766602;
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
	private ext_ico() {
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
       ext_ico base = new ext_ico();
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
       ext_ico base = new ext_ico();
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
        return ext_ico::new;
    }
}

