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
public class ext_ace implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.880000114440918), new Point2D.Double(36.0, 101.125), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {new Color(239, 196, 2, 255),new Color(241, 200, 41, 255),new Color(244, 210, 100, 255),new Color(247, 220, 139, 255),new Color(249, 229, 172, 255),new Color(251, 236, 199, 255),new Color(252, 243, 221, 255),new Color(254, 249, 238, 255),new Color(255, 253, 249, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(71.7, 99.2);
((GeneralPath)shape).lineTo(0.2, 99.2);
((GeneralPath)shape).lineTo(0.2, 0.9);
((GeneralPath)shape).lineTo(44.9, 0.9);
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
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(71.7, 99.2);
((GeneralPath)shape).lineTo(0.2, 99.2);
((GeneralPath)shape).lineTo(0.2, 0.9);
((GeneralPath)shape).lineTo(44.9, 0.9);
((GeneralPath)shape).closePath();
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
paint = new Color(160, 120, 2, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(26.8, 92.2);
((GeneralPath)shape).lineTo(22.4, 92.2);
((GeneralPath)shape).lineTo(20.699999, 87.7);
((GeneralPath)shape).lineTo(12.699999, 87.7);
((GeneralPath)shape).lineTo(11.099998, 92.2);
((GeneralPath)shape).lineTo(6.8, 92.2);
((GeneralPath)shape).lineTo(14.6, 72.299995);
((GeneralPath)shape).lineTo(18.8, 72.299995);
((GeneralPath)shape).lineTo(26.8, 92.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.4, 84.299995);
((GeneralPath)shape).lineTo(16.699999, 76.899994);
((GeneralPath)shape).lineTo(13.999999, 84.299995);
((GeneralPath)shape).lineTo(19.4, 84.299995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(41.699997, 84.899994);
((GeneralPath)shape).lineTo(45.6, 86.09999);
((GeneralPath)shape).curveTo(45.0, 88.29999, 44.0, 89.899994, 42.6, 90.899994);
((GeneralPath)shape).curveTo(41.199997, 91.899994, 39.399998, 92.49999, 37.3, 92.49999);
((GeneralPath)shape).curveTo(34.7, 92.49999, 32.5, 91.59999, 30.8, 89.799995);
((GeneralPath)shape).curveTo(29.099998, 87.99999, 28.199999, 85.49999, 28.199999, 82.399994);
((GeneralPath)shape).curveTo(28.199999, 79.09999, 29.099998, 76.49999, 30.8, 74.7);
((GeneralPath)shape).curveTo(32.5, 72.899994, 34.8, 72.0, 37.5, 72.0);
((GeneralPath)shape).curveTo(39.9, 72.0, 41.9, 72.7, 43.4, 74.2);
((GeneralPath)shape).curveTo(44.300003, 75.1, 45.0, 76.299995, 45.4, 77.899994);
((GeneralPath)shape).lineTo(41.4, 78.899994);
((GeneralPath)shape).curveTo(41.2, 77.899994, 40.7, 77.09999, 39.9, 76.49999);
((GeneralPath)shape).curveTo(39.100002, 75.899994, 38.2, 75.59999, 37.2, 75.59999);
((GeneralPath)shape).curveTo(35.7, 75.59999, 34.5, 76.09999, 33.600002, 77.19999);
((GeneralPath)shape).curveTo(32.7, 78.29999, 32.2, 79.99999, 32.2, 82.29999);
((GeneralPath)shape).curveTo(32.2, 84.79999, 32.7, 86.59999, 33.600002, 87.69999);
((GeneralPath)shape).curveTo(34.500004, 88.79999, 35.7, 89.29999, 37.100002, 89.29999);
((GeneralPath)shape).curveTo(38.2, 89.29999, 39.100002, 88.999985, 39.9, 88.29999);
((GeneralPath)shape).curveTo(40.800003, 87.39999, 41.300003, 86.29999, 41.7, 84.89999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.999996, 92.2);
((GeneralPath)shape).lineTo(48.999996, 72.3);
((GeneralPath)shape).lineTo(63.799995, 72.3);
((GeneralPath)shape).lineTo(63.799995, 75.700005);
((GeneralPath)shape).lineTo(53.0, 75.700005);
((GeneralPath)shape).lineTo(53.0, 80.0);
((GeneralPath)shape).lineTo(63.0, 80.0);
((GeneralPath)shape).lineTo(63.0, 83.4);
((GeneralPath)shape).lineTo(53.0, 83.4);
((GeneralPath)shape).lineTo(53.0, 88.8);
((GeneralPath)shape).lineTo(64.1, 88.8);
((GeneralPath)shape).lineTo(64.1, 92.200005);
((GeneralPath)shape).lineTo(49.0, 92.200005);
((GeneralPath)shape).closePath();
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
paint = new LinearGradientPaint(new Point2D.Double(44.94200134277344, 74.32599639892578), new Point2D.Double(58.347999572753906, 87.73300170898438), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 254, 251, 255),new Color(254, 250, 241, 255),new Color(253, 245, 228, 255),new Color(252, 240, 210, 255),new Color(250, 233, 188, 255),new Color(249, 226, 162, 255),new Color(247, 218, 131, 255),new Color(244, 209, 93, 255),new Color(241, 200, 39, 255),new Color(239, 196, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(44.9, 27.699999);
((GeneralPath)shape).lineTo(44.9, 0.9);
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
((GeneralPath)shape).moveTo(44.9, 0.9);
((GeneralPath)shape).lineTo(71.7, 27.699999);
((GeneralPath)shape).lineTo(44.9, 27.699999);
((GeneralPath)shape).lineTo(44.9, 0.9);
((GeneralPath)shape).closePath();
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
paint = new LinearGradientPaint(new Point2D.Double(33.617000579833984, 40.68899917602539), new Point2D.Double(33.617000579833984, 98.14800262451172), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {new Color(164, 125, 3, 255),new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new Color(255, 255, 255, 255);
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
	private ext_ace() {
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
       ext_ace base = new ext_ace();
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
       ext_ace base = new ext_ace();
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
        return () -> new ext_ace();
    }
}

