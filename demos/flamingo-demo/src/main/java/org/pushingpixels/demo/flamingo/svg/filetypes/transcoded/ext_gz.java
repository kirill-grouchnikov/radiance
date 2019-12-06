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
public class ext_gz implements ResizableIcon {
    

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
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(71.7, 99.2);
((GeneralPath)shape).lineTo(0.2, 99.2);
((GeneralPath)shape).lineTo(0.2, 0.9);
((GeneralPath)shape).lineTo(44.9, 0.9);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.880000114440918), new Point2D.Double(36.0, 101.125), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {new Color(239, 196, 2, 255),new Color(241, 200, 41, 255),new Color(244, 210, 100, 255),new Color(247, 220, 139, 255),new Color(249, 229, 172, 255),new Color(251, 236, 199, 255),new Color(252, 243, 221, 255),new Color(254, 249, 238, 255),new Color(255, 253, 249, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(71.7, 99.2);
((GeneralPath)shape).lineTo(0.2, 99.2);
((GeneralPath)shape).lineTo(0.2, 0.9);
((GeneralPath)shape).lineTo(44.9, 0.9);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(71.7, 99.2);
((GeneralPath)shape).lineTo(0.2, 99.2);
((GeneralPath)shape).lineTo(0.2, 0.9);
((GeneralPath)shape).lineTo(44.9, 0.9);
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
((GeneralPath)shape).moveTo(27.1, 84.9);
((GeneralPath)shape).lineTo(27.1, 81.5);
((GeneralPath)shape).lineTo(35.8, 81.5);
((GeneralPath)shape).lineTo(35.8, 89.4);
((GeneralPath)shape).curveTo(35.0, 90.200005, 33.7, 90.9, 32.1, 91.6);
((GeneralPath)shape).curveTo(30.499998, 92.2, 28.899998, 92.5, 27.199999, 92.5);
((GeneralPath)shape).curveTo(25.099998, 92.5, 23.3, 92.1, 21.8, 91.2);
((GeneralPath)shape).curveTo(20.3, 90.299995, 19.099998, 89.1, 18.3, 87.5);
((GeneralPath)shape).curveTo(17.5, 85.9, 17.099998, 84.1, 17.099998, 82.2);
((GeneralPath)shape).curveTo(17.099998, 80.1, 17.499998, 78.299995, 18.399998, 76.7);
((GeneralPath)shape).curveTo(19.299997, 75.1, 20.499998, 73.899994, 22.199997, 73.0);
((GeneralPath)shape).curveTo(23.499996, 72.3, 25.099997, 72.0, 26.999996, 72.0);
((GeneralPath)shape).curveTo(29.499996, 72.0, 31.399996, 72.5, 32.799995, 73.6);
((GeneralPath)shape).curveTo(34.199997, 74.6, 35.099995, 76.1, 35.499996, 77.9);
((GeneralPath)shape).lineTo(31.499996, 78.6);
((GeneralPath)shape).curveTo(31.199997, 77.6, 30.699997, 76.9, 29.899996, 76.299995);
((GeneralPath)shape).curveTo(29.099997, 75.7, 28.199995, 75.49999, 26.999996, 75.49999);
((GeneralPath)shape).curveTo(25.199997, 75.49999, 23.799995, 76.09999, 22.799995, 77.19999);
((GeneralPath)shape).curveTo(21.799995, 78.29999, 21.199995, 79.99999, 21.199995, 82.19999);
((GeneralPath)shape).curveTo(21.199995, 84.59999, 21.699995, 86.29999, 22.799995, 87.49999);
((GeneralPath)shape).curveTo(23.799995, 88.69999, 25.199995, 89.299995, 26.899996, 89.299995);
((GeneralPath)shape).curveTo(27.699995, 89.299995, 28.599997, 89.1, 29.399996, 88.799995);
((GeneralPath)shape).curveTo(30.199995, 88.49999, 30.999996, 88.1, 31.599997, 87.6);
((GeneralPath)shape).lineTo(31.599997, 85.1);
((GeneralPath)shape).lineTo(27.099997, 85.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.7, 92.200005);
((GeneralPath)shape).lineTo(37.7, 88.600006);
((GeneralPath)shape).lineTo(48.2, 75.700005);
((GeneralPath)shape).lineTo(38.9, 75.700005);
((GeneralPath)shape).lineTo(38.9, 72.3);
((GeneralPath)shape).lineTo(53.5, 72.3);
((GeneralPath)shape).lineTo(53.5, 75.4);
((GeneralPath)shape).lineTo(42.5, 88.8);
((GeneralPath)shape).lineTo(53.8, 88.8);
((GeneralPath)shape).lineTo(53.8, 92.200005);
((GeneralPath)shape).lineTo(37.7, 92.200005);
((GeneralPath)shape).closePath();
paint = new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(44.9, 27.699999);
((GeneralPath)shape).lineTo(44.9, 0.9);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(44.94200134277344, 74.32599639892578), new Point2D.Double(58.347999572753906, 87.73300170898438), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 254, 251, 255),new Color(254, 250, 241, 255),new Color(253, 245, 228, 255),new Color(252, 240, 210, 255),new Color(250, 233, 188, 255),new Color(249, 226, 162, 255),new Color(247, 218, 131, 255),new Color(244, 209, 93, 255),new Color(241, 200, 39, 255),new Color(239, 196, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(44.9, 27.699999);
((GeneralPath)shape).lineTo(44.9, 0.9);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(44.9, 27.699999);
((GeneralPath)shape).lineTo(44.9, 0.9);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_2_1);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.0, 15.8);
((GeneralPath)shape).lineTo(29.6, 15.8);
((GeneralPath)shape).lineTo(29.6, 10.8);
((GeneralPath)shape).lineTo(38.0, 10.8);
((GeneralPath)shape).lineTo(38.0, 15.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.0, 24.7);
((GeneralPath)shape).lineTo(29.6, 24.7);
((GeneralPath)shape).lineTo(29.6, 29.7);
((GeneralPath)shape).lineTo(38.0, 29.7);
((GeneralPath)shape).lineTo(38.0, 24.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.0, 3.9000015);
((GeneralPath)shape).lineTo(29.6, 3.9000015);
((GeneralPath)shape).lineTo(29.6, 8.900002);
((GeneralPath)shape).lineTo(38.0, 8.900002);
((GeneralPath)shape).lineTo(38.0, 3.9000015);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.0, 17.7);
((GeneralPath)shape).lineTo(29.6, 17.7);
((GeneralPath)shape).lineTo(29.6, 22.7);
((GeneralPath)shape).lineTo(38.0, 22.7);
((GeneralPath)shape).lineTo(38.0, 17.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.0, 31.6);
((GeneralPath)shape).lineTo(29.6, 31.6);
((GeneralPath)shape).lineTo(29.6, 36.6);
((GeneralPath)shape).lineTo(38.0, 36.6);
((GeneralPath)shape).lineTo(38.0, 31.599998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.7, 56.2);
((GeneralPath)shape).curveTo(38.7, 59.0, 36.4, 61.3, 33.600002, 61.3);
((GeneralPath)shape).curveTo(30.800003, 61.3, 28.500002, 59.0, 28.500002, 56.2);
((GeneralPath)shape).lineTo(28.500002, 55.7);
((GeneralPath)shape).lineTo(30.200003, 41.1);
((GeneralPath)shape).curveTo(30.200003, 39.199997, 31.700003, 37.699997, 33.600002, 37.699997);
((GeneralPath)shape).curveTo(35.4, 37.699997, 36.9, 39.199997, 37.000004, 40.999996);
((GeneralPath)shape).lineTo(38.600002, 55.399994);
((GeneralPath)shape).curveTo(38.7, 55.799995, 38.7, 55.999992, 38.7, 56.199993);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.100002, 56.100002);
((GeneralPath)shape).curveTo(37.100002, 54.2, 35.500004, 52.600002, 33.600002, 52.600002);
((GeneralPath)shape).curveTo(31.7, 52.600002, 30.100002, 54.2, 30.100002, 56.100002);
((GeneralPath)shape).curveTo(30.100002, 58.000004, 31.700003, 59.600002, 33.600002, 59.600002);
((GeneralPath)shape).curveTo(35.600002, 59.500004, 37.100002, 57.9, 37.100002, 56.100002);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(33.617000579833984, 40.68899917602539), new Point2D.Double(33.617000579833984, 98.14800262451172), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {new Color(164, 125, 3, 255),new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(32.5, 41.6);
((GeneralPath)shape).lineTo(30.2, 37.1);
((GeneralPath)shape).lineTo(30.2, 34.8);
((GeneralPath)shape).lineTo(32.5, 32.6);
((GeneralPath)shape).lineTo(34.7, 32.6);
((GeneralPath)shape).lineTo(37.0, 34.8);
((GeneralPath)shape).lineTo(37.0, 37.1);
((GeneralPath)shape).lineTo(34.7, 41.6);
((GeneralPath)shape).lineTo(32.5, 41.6);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
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
		return 0.73499995470047;
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
	private ext_gz() {
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
       ext_gz base = new ext_gz();
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
       ext_gz base = new ext_gz();
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
        return ext_gz::new;
    }
}

