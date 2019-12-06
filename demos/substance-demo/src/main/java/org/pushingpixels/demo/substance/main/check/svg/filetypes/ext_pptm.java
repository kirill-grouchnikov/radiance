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
public class ext_pptm implements ResizableIcon {
    

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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.699999);
((GeneralPath)shape).lineTo(72.0, 99.299995);
((GeneralPath)shape).lineTo(0.0, 99.299995);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 95.30000305175781), new Point2D.Double(36.0, -3.200000047683716), new float[] {0.0f,0.032f,0.162f,0.305f,0.468f,0.666f,1.0f}, new Color[] {new Color(203, 85, 40, 255),new Color(207, 91, 39, 255),new Color(219, 112, 38, 255),new Color(230, 128, 37, 255),new Color(238, 140, 35, 255),new Color(244, 147, 34, 255),new Color(246, 150, 34, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.699999);
((GeneralPath)shape).lineTo(72.0, 99.299995);
((GeneralPath)shape).lineTo(0.0, 99.299995);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.699999);
((GeneralPath)shape).lineTo(72.0, 99.299995);
((GeneralPath)shape).lineTo(0.0, 99.299995);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(56.5, 32.0);
((GeneralPath)shape).curveTo(56.5, 34.3, 56.0, 36.4, 55.1, 38.0);
((GeneralPath)shape).curveTo(54.1, 39.7, 52.8, 41.1, 51.1, 42.1);
((GeneralPath)shape).curveTo(49.3, 43.199997, 47.3, 44.0, 45.1, 44.5);
((GeneralPath)shape).curveTo(42.8, 45.0, 40.3, 45.2, 37.5, 45.2);
((GeneralPath)shape).lineTo(34.0, 45.2);
((GeneralPath)shape).lineTo(34.0, 56.800003);
((GeneralPath)shape).curveTo(34.0, 57.500004, 34.1, 58.100002, 34.4, 58.600002);
((GeneralPath)shape).curveTo(34.700005, 59.100002, 35.2, 59.500004, 35.9, 59.800003);
((GeneralPath)shape).curveTo(36.300003, 60.000004, 36.9, 60.100002, 37.800003, 60.300003);
((GeneralPath)shape).curveTo(38.700005, 60.500004, 39.4, 60.600002, 40.000004, 60.700005);
((GeneralPath)shape).lineTo(40.000004, 63.0);
((GeneralPath)shape).lineTo(17.5, 63.0);
((GeneralPath)shape).lineTo(17.5, 60.7);
((GeneralPath)shape).curveTo(18.1, 60.600002, 18.8, 60.600002, 19.8, 60.5);
((GeneralPath)shape).curveTo(20.699999, 60.4, 21.4, 60.3, 21.8, 60.1);
((GeneralPath)shape).curveTo(22.599998, 59.8, 23.099998, 59.399998, 23.3, 59.0);
((GeneralPath)shape).curveTo(23.5, 58.600002, 23.699999, 57.9, 23.699999, 57.1);
((GeneralPath)shape).lineTo(23.699999, 27.9);
((GeneralPath)shape).curveTo(23.699999, 27.199999, 23.599998, 26.6, 23.3, 26.1);
((GeneralPath)shape).curveTo(23.099998, 25.6, 22.599998, 25.2, 21.8, 24.9);
((GeneralPath)shape).curveTo(21.3, 24.699999, 20.5, 24.5, 19.599998, 24.3);
((GeneralPath)shape).curveTo(18.699999, 24.099998, 17.999998, 24.0, 17.599998, 23.9);
((GeneralPath)shape).lineTo(17.599998, 21.6);
((GeneralPath)shape).lineTo(40.5, 21.6);
((GeneralPath)shape).curveTo(45.9, 21.6, 49.9, 22.5, 52.5, 24.2);
((GeneralPath)shape).curveTo(55.1, 25.900002, 56.5, 28.5, 56.5, 32.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.0, 33.5);
((GeneralPath)shape).curveTo(45.0, 30.4, 44.4, 28.1, 43.1, 26.5);
((GeneralPath)shape).curveTo(41.8, 25.0, 39.6, 24.2, 36.399998, 24.2);
((GeneralPath)shape).lineTo(34.0, 24.2);
((GeneralPath)shape).lineTo(34.0, 42.300003);
((GeneralPath)shape).lineTo(35.2, 42.300003);
((GeneralPath)shape).curveTo(38.4, 42.300003, 40.8, 41.600002, 42.5, 40.100002);
((GeneralPath)shape).curveTo(44.2, 38.800003, 45.0, 36.600002, 45.0, 33.500004);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(12.838000297546387, 54.262001037597656), new Point2D.Double(49.83300018310547, 17.267000198364258), new float[] {0.005f,0.418f,0.679f,0.897f,1.0f}, new Color[] {new Color(214, 91, 37, 255),new Color(211, 90, 37, 255),new Color(202, 86, 36, 255),new Color(188, 79, 34, 255),new Color(179, 75, 33, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.699999);
((GeneralPath)shape).lineTo(45.0, 27.699999);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.06999969482422, 23.68000030517578), new Point2D.Double(58.56999969482422, 10.180000305175781), new float[] {0.0f,0.383f,0.521f,0.62f,0.699f,0.767f,0.828f,0.882f,0.933f,0.977f,1.0f}, new Color[] {new Color(255, 252, 227, 255),new Color(255, 250, 224, 255),new Color(253, 243, 216, 255),new Color(251, 235, 204, 255),new Color(248, 223, 187, 255),new Color(245, 208, 166, 255),new Color(241, 191, 141, 255),new Color(236, 170, 114, 255),new Color(231, 147, 84, 255),new Color(226, 124, 52, 255),new Color(223, 111, 38, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.699999);
((GeneralPath)shape).lineTo(45.0, 27.699999);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.699999);
((GeneralPath)shape).lineTo(45.0, 27.699999);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.4, 91.3);
((GeneralPath)shape).lineTo(6.4, 75.6);
((GeneralPath)shape).lineTo(11.5, 75.6);
((GeneralPath)shape).curveTo(13.4, 75.6, 14.7, 75.7, 15.3, 75.799995);
((GeneralPath)shape).curveTo(16.2, 75.99999, 17.0, 76.6, 17.6, 77.299995);
((GeneralPath)shape).curveTo(18.2, 78.1, 18.5, 79.1, 18.5, 80.399994);
((GeneralPath)shape).curveTo(18.5, 81.399994, 18.3, 82.2, 18.0, 82.799995);
((GeneralPath)shape).curveTo(17.6, 83.49999, 17.2, 83.99999, 16.7, 84.399994);
((GeneralPath)shape).curveTo(16.2, 84.799995, 15.6, 84.99999, 15.000001, 85.09999);
((GeneralPath)shape).curveTo(14.200001, 85.29999, 13.100001, 85.29999, 11.700001, 85.29999);
((GeneralPath)shape).lineTo(9.6, 85.29999);
((GeneralPath)shape).lineTo(9.6, 91.19999);
((GeneralPath)shape).lineTo(6.4, 91.19999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(9.6, 78.200005);
((GeneralPath)shape).lineTo(9.6, 82.700005);
((GeneralPath)shape).lineTo(11.400001, 82.700005);
((GeneralPath)shape).curveTo(12.700001, 82.700005, 13.5, 82.600006, 13.900001, 82.50001);
((GeneralPath)shape).curveTo(14.3, 82.30001, 14.700001, 82.100006, 14.900001, 81.700005);
((GeneralPath)shape).curveTo(15.1, 81.3, 15.3, 80.9, 15.3, 80.50001);
((GeneralPath)shape).curveTo(15.3, 79.90001, 15.1, 79.50001, 14.8, 79.100006);
((GeneralPath)shape).curveTo(14.5, 78.700005, 14.0, 78.50001, 13.5, 78.40001);
((GeneralPath)shape).curveTo(13.1, 78.30001, 12.4, 78.30001, 11.2, 78.30001);
((GeneralPath)shape).lineTo(9.6, 78.30001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.2, 91.3);
((GeneralPath)shape).lineTo(21.2, 75.6);
((GeneralPath)shape).lineTo(26.300001, 75.6);
((GeneralPath)shape).curveTo(28.2, 75.6, 29.500002, 75.7, 30.1, 75.799995);
((GeneralPath)shape).curveTo(31.0, 75.99999, 31.800001, 76.6, 32.4, 77.299995);
((GeneralPath)shape).curveTo(33.0, 78.1, 33.300003, 79.1, 33.300003, 80.399994);
((GeneralPath)shape).curveTo(33.300003, 81.399994, 33.100002, 82.2, 32.800003, 82.799995);
((GeneralPath)shape).curveTo(32.4, 83.49999, 32.000004, 83.99999, 31.500004, 84.399994);
((GeneralPath)shape).curveTo(31.000004, 84.799995, 30.400003, 84.99999, 29.800003, 85.09999);
((GeneralPath)shape).curveTo(29.000004, 85.29999, 27.900003, 85.29999, 26.500004, 85.29999);
((GeneralPath)shape).lineTo(24.400003, 85.29999);
((GeneralPath)shape).lineTo(24.400003, 91.19999);
((GeneralPath)shape).lineTo(21.200003, 91.19999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(24.400002, 78.200005);
((GeneralPath)shape).lineTo(24.400002, 82.700005);
((GeneralPath)shape).lineTo(26.2, 82.700005);
((GeneralPath)shape).curveTo(27.5, 82.700005, 28.300001, 82.600006, 28.7, 82.50001);
((GeneralPath)shape).curveTo(29.1, 82.30001, 29.5, 82.100006, 29.7, 81.700005);
((GeneralPath)shape).curveTo(29.900002, 81.3, 30.1, 80.9, 30.1, 80.50001);
((GeneralPath)shape).curveTo(30.1, 79.90001, 29.9, 79.50001, 29.6, 79.100006);
((GeneralPath)shape).curveTo(29.300001, 78.700005, 28.800001, 78.50001, 28.300001, 78.40001);
((GeneralPath)shape).curveTo(27.900002, 78.30001, 27.2, 78.30001, 26.000002, 78.30001);
((GeneralPath)shape).lineTo(24.400002, 78.30001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(39.5, 91.3);
((GeneralPath)shape).lineTo(39.5, 78.2);
((GeneralPath)shape).lineTo(34.8, 78.2);
((GeneralPath)shape).lineTo(34.8, 75.5);
((GeneralPath)shape).lineTo(47.4, 75.5);
((GeneralPath)shape).lineTo(47.4, 78.2);
((GeneralPath)shape).lineTo(42.7, 78.2);
((GeneralPath)shape).lineTo(42.7, 91.299995);
((GeneralPath)shape).lineTo(39.5, 91.299995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.5, 91.3);
((GeneralPath)shape).lineTo(49.5, 75.6);
((GeneralPath)shape).lineTo(54.3, 75.6);
((GeneralPath)shape).lineTo(57.2, 86.299995);
((GeneralPath)shape).lineTo(60.0, 75.6);
((GeneralPath)shape).lineTo(64.8, 75.6);
((GeneralPath)shape).lineTo(64.8, 91.299995);
((GeneralPath)shape).lineTo(61.800003, 91.299995);
((GeneralPath)shape).lineTo(61.800003, 78.9);
((GeneralPath)shape).lineTo(58.700005, 91.3);
((GeneralPath)shape).lineTo(55.600006, 91.3);
((GeneralPath)shape).lineTo(52.500008, 78.9);
((GeneralPath)shape).lineTo(52.500008, 91.3);
((GeneralPath)shape).lineTo(49.500008, 91.3);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
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
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_pptm() {
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
       ext_pptm base = new ext_pptm();
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
       ext_pptm base = new ext_pptm();
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
        return ext_pptm::new;
    }
}

