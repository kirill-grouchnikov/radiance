package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_master implements ResizableIcon {
    

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
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.80000305175781), new Point2D.Double(36.0, -0.20000000298023224), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
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
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 26.575000762939453), new Point2D.Double(58.57500076293945, 13.074999809265137), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(56.6, 47.5);
((GeneralPath)shape).curveTo(56.0, 47.2, 55.3, 47.2, 54.8, 47.6);
((GeneralPath)shape).lineTo(45.9, 54.399998);
((GeneralPath)shape).lineTo(37.800003, 43.6);
((GeneralPath)shape).curveTo(37.500004, 43.3, 37.000004, 43.0, 36.500004, 43.0);
((GeneralPath)shape).curveTo(36.000004, 43.0, 35.500004, 43.2, 35.200005, 43.6);
((GeneralPath)shape).lineTo(26.500004, 54.399998);
((GeneralPath)shape).lineTo(18.100004, 47.6);
((GeneralPath)shape).curveTo(17.600004, 47.199997, 16.900003, 47.1, 16.300005, 47.5);
((GeneralPath)shape).curveTo(15.700005, 47.8, 15.400005, 48.5, 15.600005, 49.2);
((GeneralPath)shape).lineTo(18.400005, 63.6);
((GeneralPath)shape).curveTo(18.500006, 64.4, 19.200005, 64.9, 20.000006, 64.9);
((GeneralPath)shape).lineTo(53.000008, 64.9);
((GeneralPath)shape).curveTo(53.800007, 64.9, 54.40001, 64.4, 54.600006, 63.600002);
((GeneralPath)shape).lineTo(57.400005, 49.200005);
((GeneralPath)shape).curveTo(57.500004, 48.500004, 57.200005, 47.900005, 56.600006, 47.500004);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(51.699997, 61.7);
((GeneralPath)shape).lineTo(21.3, 61.7);
((GeneralPath)shape).lineTo(19.599998, 52.800003);
((GeneralPath)shape).lineTo(25.8, 57.9);
((GeneralPath)shape).curveTo(26.099998, 58.2, 26.599998, 58.300003, 27.0, 58.2);
((GeneralPath)shape).curveTo(27.4, 58.2, 27.8, 57.9, 28.1, 57.600002);
((GeneralPath)shape).lineTo(36.5, 47.100002);
((GeneralPath)shape).lineTo(44.3, 57.5);
((GeneralPath)shape).curveTo(44.6, 57.8, 44.899998, 58.1, 45.399998, 58.1);
((GeneralPath)shape).curveTo(45.8, 58.199997, 46.199997, 58.0, 46.6, 57.8);
((GeneralPath)shape).lineTo(53.5, 52.5);
((GeneralPath)shape).lineTo(51.7, 61.7);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(15.640000343322754, 53.95500183105469), new Point2D.Double(57.36000061035156, 53.95500183105469), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(51.4, 63.3);
((GeneralPath)shape).lineTo(51.4, 67.4);
((GeneralPath)shape).lineTo(21.6, 67.4);
((GeneralPath)shape).lineTo(21.6, 63.300003);
((GeneralPath)shape).lineTo(18.4, 63.300003);
((GeneralPath)shape).lineTo(18.4, 69.0);
((GeneralPath)shape).curveTo(18.4, 69.9, 19.1, 70.6, 20.0, 70.6);
((GeneralPath)shape).lineTo(53.0, 70.6);
((GeneralPath)shape).curveTo(53.9, 70.6, 54.6, 69.9, 54.6, 69.0);
((GeneralPath)shape).lineTo(54.6, 63.3);
((GeneralPath)shape).lineTo(51.399998, 63.3);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(18.399999618530273, 66.93299865722656), new Point2D.Double(54.599998474121094, 66.93299865722656), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.5, 35.4);
((GeneralPath)shape).curveTo(33.6, 35.4, 31.2, 37.800003, 31.2, 40.7);
((GeneralPath)shape).curveTo(31.2, 43.6, 33.600002, 46.0, 36.5, 46.0);
((GeneralPath)shape).curveTo(39.399998, 46.0, 41.8, 43.6, 41.8, 40.7);
((GeneralPath)shape).curveTo(41.8, 37.800003, 39.399998, 35.4, 36.5, 35.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.5, 42.9);
((GeneralPath)shape).curveTo(35.3, 42.9, 34.4, 41.9, 34.4, 40.800003);
((GeneralPath)shape).curveTo(34.4, 39.700005, 35.4, 38.700005, 36.5, 38.700005);
((GeneralPath)shape).curveTo(37.6, 38.700005, 38.6, 39.700005, 38.6, 40.800003);
((GeneralPath)shape).curveTo(38.6, 41.9, 37.699997, 42.9, 36.5, 42.9);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(31.191999435424805, 40.73899841308594), new Point2D.Double(41.80799865722656, 40.73899841308594), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(56.2, 39.6);
((GeneralPath)shape).curveTo(53.3, 39.6, 50.9, 42.0, 50.9, 44.899998);
((GeneralPath)shape).curveTo(50.9, 47.799995, 53.300003, 50.199997, 56.2, 50.199997);
((GeneralPath)shape).curveTo(59.1, 50.199997, 61.5, 47.799995, 61.5, 44.899998);
((GeneralPath)shape).curveTo(61.5, 42.0, 59.1, 39.6, 56.2, 39.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(56.2, 47.1);
((GeneralPath)shape).curveTo(55.0, 47.1, 54.100002, 46.1, 54.100002, 45.0);
((GeneralPath)shape).curveTo(54.100002, 43.9, 55.100002, 42.9, 56.2, 42.9);
((GeneralPath)shape).curveTo(57.3, 42.9, 58.3, 43.9, 58.3, 45.0);
((GeneralPath)shape).curveTo(58.3, 46.1, 57.399998, 47.1, 56.2, 47.1);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(56.19200134277344, 39.624000549316406), new Point2D.Double(56.19200134277344, 50.2400016784668), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(16.8, 39.6);
((GeneralPath)shape).curveTo(13.9, 39.6, 11.499999, 42.0, 11.499999, 44.899998);
((GeneralPath)shape).curveTo(11.499999, 47.799995, 13.9, 50.199997, 16.8, 50.199997);
((GeneralPath)shape).curveTo(19.699999, 50.199997, 22.099998, 47.799995, 22.099998, 44.899998);
((GeneralPath)shape).curveTo(22.099998, 42.0, 19.699999, 39.6, 16.8, 39.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(16.8, 47.1);
((GeneralPath)shape).curveTo(15.599999, 47.1, 14.699999, 46.1, 14.699999, 45.0);
((GeneralPath)shape).curveTo(14.699999, 43.9, 15.699999, 42.9, 16.8, 42.9);
((GeneralPath)shape).curveTo(17.9, 42.9, 18.9, 43.9, 18.9, 45.0);
((GeneralPath)shape).curveTo(18.9, 46.1, 18.0, 47.1, 16.8, 47.1);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(16.808000564575195, 50.2400016784668), new Point2D.Double(16.808000564575195, 39.624000549316406), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4_4);
g.setTransform(defaultTransform__0_4);
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
		return 0.9980000257492065;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_master() {
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
       ext_master base = new ext_master();
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
       ext_master base = new ext_master();
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
        return ext_master::new;
    }
}

