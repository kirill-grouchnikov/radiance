package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_h implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.108001708984375, 3.003000020980835), new Point2D.Double(36.108001708984375, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
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
shape = new GeneralPath();
((GeneralPath)shape).moveTo(27.7, 91.1);
((GeneralPath)shape).lineTo(27.7, 71.2);
((GeneralPath)shape).lineTo(31.7, 71.2);
((GeneralPath)shape).lineTo(31.7, 79.0);
((GeneralPath)shape).lineTo(39.600002, 79.0);
((GeneralPath)shape).lineTo(39.600002, 71.2);
((GeneralPath)shape).lineTo(43.600002, 71.2);
((GeneralPath)shape).lineTo(43.600002, 91.0);
((GeneralPath)shape).lineTo(39.600002, 91.0);
((GeneralPath)shape).lineTo(39.600002, 82.3);
((GeneralPath)shape).lineTo(31.700003, 82.3);
((GeneralPath)shape).lineTo(31.700003, 91.0);
((GeneralPath)shape).lineTo(27.700003, 91.0);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(60.1, 18.5);
((GeneralPath)shape).lineTo(13.099998, 18.5);
((GeneralPath)shape).lineTo(13.099998, 65.5);
((GeneralPath)shape).lineTo(60.1, 65.5);
((GeneralPath)shape).lineTo(60.1, 18.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(57.5, 62.8);
((GeneralPath)shape).lineTo(15.8, 62.8);
((GeneralPath)shape).lineTo(15.8, 27.6);
((GeneralPath)shape).lineTo(57.399998, 27.6);
((GeneralPath)shape).lineTo(57.399998, 62.800003);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(60.150001525878906, 42.0), new Point2D.Double(13.149999618530273, 42.0), new float[] {0.0f,0.082f,0.35f,0.602f,0.826f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(160, 192, 207, 255),new Color(124, 155, 171, 255),new Color(98, 129, 145, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(60.525001525878906, 42.0), new Point2D.Double(12.774999618530273, 42.0), new float[] {0.0f,0.082f,0.35f,0.602f,0.826f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(160, 192, 207, 255),new Color(124, 155, 171, 255),new Color(98, 129, 145, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(60.1, 18.5);
((GeneralPath)shape).lineTo(13.099998, 18.5);
((GeneralPath)shape).lineTo(13.099998, 65.5);
((GeneralPath)shape).lineTo(60.1, 65.5);
((GeneralPath)shape).lineTo(60.1, 18.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(57.5, 62.8);
((GeneralPath)shape).lineTo(15.8, 62.8);
((GeneralPath)shape).lineTo(15.8, 27.6);
((GeneralPath)shape).lineTo(57.399998, 27.6);
((GeneralPath)shape).lineTo(57.399998, 62.800003);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_3_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.9, 31.8);
((GeneralPath)shape).lineTo(53.5, 31.8);
((GeneralPath)shape).lineTo(53.5, 36.5);
((GeneralPath)shape).lineTo(19.9, 36.5);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(53.43600082397461, 34.12799835205078), new Point2D.Double(19.86400032043457, 34.12799835205078), new float[] {0.0f,0.082f,0.35f,0.602f,0.826f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(160, 192, 207, 255),new Color(124, 155, 171, 255),new Color(98, 129, 145, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(53.93600082397461, 34.12799835205078), new Point2D.Double(19.36400032043457, 34.12799835205078), new float[] {0.0f,0.082f,0.35f,0.602f,0.826f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(160, 192, 207, 255),new Color(124, 155, 171, 255),new Color(98, 129, 145, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(19.9, 31.8);
((GeneralPath)shape).lineTo(53.5, 31.8);
((GeneralPath)shape).lineTo(53.5, 36.5);
((GeneralPath)shape).lineTo(19.9, 36.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_3_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.2, 39.4);
((GeneralPath)shape).lineTo(45.7, 39.4);
((GeneralPath)shape).lineTo(45.7, 41.4);
((GeneralPath)shape).lineTo(25.2, 41.4);
((GeneralPath)shape).lineTo(25.2, 39.4);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.75, 40.38600158691406), new Point2D.Double(25.25, 40.38600158691406), new float[] {0.0f,0.082f,0.35f,0.602f,0.826f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(160, 192, 207, 255),new Color(124, 155, 171, 255),new Color(98, 129, 145, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.2, 45.2);
((GeneralPath)shape).lineTo(48.7, 45.2);
((GeneralPath)shape).lineTo(48.7, 47.2);
((GeneralPath)shape).lineTo(28.2, 47.2);
((GeneralPath)shape).lineTo(28.2, 45.2);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(48.75, 46.26100158691406), new Point2D.Double(28.25, 46.26100158691406), new float[] {0.0f,0.082f,0.35f,0.602f,0.826f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(160, 192, 207, 255),new Color(124, 155, 171, 255),new Color(98, 129, 145, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(25.2, 51.2);
((GeneralPath)shape).lineTo(45.7, 51.2);
((GeneralPath)shape).lineTo(45.7, 53.2);
((GeneralPath)shape).lineTo(25.2, 53.2);
((GeneralPath)shape).lineTo(25.2, 51.2);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.75, 52.26100158691406), new Point2D.Double(25.25, 52.26100158691406), new float[] {0.0f,0.082f,0.35f,0.602f,0.826f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(160, 192, 207, 255),new Color(124, 155, 171, 255),new Color(98, 129, 145, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.2, 57.4);
((GeneralPath)shape).lineTo(48.7, 57.4);
((GeneralPath)shape).lineTo(48.7, 59.4);
((GeneralPath)shape).lineTo(28.2, 59.4);
((GeneralPath)shape).lineTo(28.2, 57.4);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(48.75, 58.38600158691406), new Point2D.Double(28.25, 58.38600158691406), new float[] {0.0f,0.082f,0.35f,0.602f,0.826f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(160, 192, 207, 255),new Color(124, 155, 171, 255),new Color(98, 129, 145, 255),new Color(82, 114, 129, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3_5);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
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
        return 0.13199996948242188;
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
		return 0.7380000352859497;
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
	private ext_h() {
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
       ext_h base = new ext_h();
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
       ext_h base = new ext_h();
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
        return ext_h::new;
    }
}

