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
public class ext_gif implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(23.6, 83.8);
((GeneralPath)shape).lineTo(23.6, 80.5);
((GeneralPath)shape).lineTo(32.3, 80.5);
((GeneralPath)shape).lineTo(32.3, 88.4);
((GeneralPath)shape).curveTo(31.5, 89.200005, 30.199999, 89.9, 28.599998, 90.5);
((GeneralPath)shape).curveTo(26.999998, 91.1, 25.399998, 91.4, 23.699999, 91.4);
((GeneralPath)shape).curveTo(21.599998, 91.4, 19.8, 91.0, 18.199999, 90.1);
((GeneralPath)shape).curveTo(16.599998, 89.2, 15.499999, 88.0, 14.699999, 86.4);
((GeneralPath)shape).curveTo(13.899999, 84.8, 13.499999, 83.0, 13.499999, 81.1);
((GeneralPath)shape).curveTo(13.499999, 79.0, 13.899999, 77.2, 14.799999, 75.6);
((GeneralPath)shape).curveTo(15.7, 74.0, 16.9, 72.799995, 18.599998, 71.9);
((GeneralPath)shape).curveTo(19.899998, 71.200005, 21.499998, 70.9, 23.399998, 70.9);
((GeneralPath)shape).curveTo(25.899998, 70.9, 27.799997, 71.4, 29.199997, 72.4);
((GeneralPath)shape).curveTo(30.599997, 73.4, 31.499996, 74.9, 31.899998, 76.700005);
((GeneralPath)shape).lineTo(27.899998, 77.4);
((GeneralPath)shape).curveTo(27.599998, 76.4, 27.099998, 75.700005, 26.299997, 75.1);
((GeneralPath)shape).curveTo(25.499998, 74.5, 24.599997, 74.299995, 23.399998, 74.299995);
((GeneralPath)shape).curveTo(21.599998, 74.299995, 20.199997, 74.899994, 19.199997, 75.99999);
((GeneralPath)shape).curveTo(18.199997, 77.09999, 17.599997, 78.799995, 17.599997, 80.899994);
((GeneralPath)shape).curveTo(17.599997, 83.299995, 18.099997, 84.99999, 19.199997, 86.2);
((GeneralPath)shape).curveTo(20.299997, 87.399994, 21.599997, 88.0, 23.299997, 88.0);
((GeneralPath)shape).curveTo(24.099997, 88.0, 24.999998, 87.8, 25.799997, 87.5);
((GeneralPath)shape).curveTo(26.599997, 87.2, 27.399998, 86.8, 27.999998, 86.3);
((GeneralPath)shape).lineTo(27.999998, 83.8);
((GeneralPath)shape).lineTo(23.599998, 83.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.8, 91.100006);
((GeneralPath)shape).lineTo(35.8, 71.2);
((GeneralPath)shape).lineTo(39.8, 71.2);
((GeneralPath)shape).lineTo(39.8, 91.0);
((GeneralPath)shape).lineTo(35.8, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(43.7, 91.100006);
((GeneralPath)shape).lineTo(43.7, 71.2);
((GeneralPath)shape).lineTo(57.4, 71.2);
((GeneralPath)shape).lineTo(57.4, 74.6);
((GeneralPath)shape).lineTo(47.7, 74.6);
((GeneralPath)shape).lineTo(47.7, 79.299995);
((GeneralPath)shape).lineTo(56.0, 79.299995);
((GeneralPath)shape).lineTo(56.0, 82.7);
((GeneralPath)shape).lineTo(47.7, 82.7);
((GeneralPath)shape).lineTo(47.7, 91.1);
((GeneralPath)shape).lineTo(43.7, 91.1);
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
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
paint = new LinearGradientPaint(new Point2D.Double(36.25, 37.35300064086914), new Point2D.Double(36.25, 85.16100311279297), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
	private ext_gif() {
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
       ext_gif base = new ext_gif();
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
       ext_gif base = new ext_gif();
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
        return ext_gif::new;
    }
}

