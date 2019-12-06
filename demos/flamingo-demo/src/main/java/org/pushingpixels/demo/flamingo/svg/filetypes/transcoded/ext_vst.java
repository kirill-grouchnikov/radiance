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
public class ext_vst implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.005f,0.188f,0.566f,1.0f}, new Color[] {new Color(55, 83, 157, 255),new Color(74, 105, 191, 255),new Color(112, 136, 205, 255),new Color(168, 183, 225, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(0.0, 50.0), new Point2D.Double(72.0, 50.0), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 0),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(55, 83, 157, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
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
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 25.774999618530273), new Point2D.Double(58.57500076293945, 12.274999618530273), new float[] {0.005f,0.604f,1.0f}, new Color[] {new Color(223, 241, 250, 255),new Color(198, 208, 235, 255),new Color(55, 83, 157, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(55, 83, 157, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.9, 91.1);
((GeneralPath)shape).lineTo(8.8, 71.2);
((GeneralPath)shape).lineTo(13.200001, 71.2);
((GeneralPath)shape).lineTo(18.300001, 85.899994);
((GeneralPath)shape).lineTo(23.2, 71.2);
((GeneralPath)shape).lineTo(27.5, 71.2);
((GeneralPath)shape).lineTo(20.3, 91.0);
((GeneralPath)shape).lineTo(15.9, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.5, 84.6);
((GeneralPath)shape).lineTo(32.4, 84.2);
((GeneralPath)shape).curveTo(32.600002, 85.5, 33.100002, 86.5, 33.800003, 87.1);
((GeneralPath)shape).curveTo(34.500004, 87.7, 35.500004, 88.0, 36.700005, 88.0);
((GeneralPath)shape).curveTo(38.000004, 88.0, 39.000004, 87.7, 39.600006, 87.2);
((GeneralPath)shape).curveTo(40.300007, 86.7, 40.600006, 86.0, 40.600006, 85.299995);
((GeneralPath)shape).curveTo(40.600006, 84.799995, 40.500008, 84.399994, 40.200005, 84.1);
((GeneralPath)shape).curveTo(39.900005, 83.799995, 39.400005, 83.5, 38.700005, 83.2);
((GeneralPath)shape).curveTo(38.200005, 83.0, 37.100006, 82.7, 35.500004, 82.299995);
((GeneralPath)shape).curveTo(33.300003, 81.799995, 31.800003, 81.1, 30.900003, 80.299995);
((GeneralPath)shape).curveTo(29.700003, 79.2, 29.100004, 77.899994, 29.100004, 76.299995);
((GeneralPath)shape).curveTo(29.100004, 75.299995, 29.400003, 74.299995, 30.000004, 73.49999);
((GeneralPath)shape).curveTo(30.600004, 72.59999, 31.400003, 71.99999, 32.500004, 71.49999);
((GeneralPath)shape).curveTo(33.600006, 70.99999, 34.900005, 70.799995, 36.400005, 70.799995);
((GeneralPath)shape).curveTo(38.900005, 70.799995, 40.800007, 71.299995, 42.100006, 72.399994);
((GeneralPath)shape).curveTo(43.400005, 73.49999, 44.000008, 74.899994, 44.100006, 76.799995);
((GeneralPath)shape).lineTo(40.100006, 76.99999);
((GeneralPath)shape).curveTo(39.900005, 75.99999, 39.600006, 75.19999, 39.000008, 74.799995);
((GeneralPath)shape).curveTo(38.40001, 74.399994, 37.600006, 74.1, 36.40001, 74.1);
((GeneralPath)shape).curveTo(35.20001, 74.1, 34.30001, 74.299995, 33.60001, 74.799995);
((GeneralPath)shape).curveTo(33.20001, 75.1, 33.00001, 75.49999, 33.00001, 75.99999);
((GeneralPath)shape).curveTo(33.00001, 76.49999, 33.200012, 76.899994, 33.60001, 77.19999);
((GeneralPath)shape).curveTo(34.10001, 77.59999, 35.40001, 78.09999, 37.30001, 78.49999);
((GeneralPath)shape).curveTo(39.200012, 78.899994, 40.700012, 79.399994, 41.700012, 79.899994);
((GeneralPath)shape).curveTo(42.600014, 80.399994, 43.400013, 81.09999, 43.900013, 81.899994);
((GeneralPath)shape).curveTo(44.400013, 82.7, 44.700012, 83.799995, 44.700012, 85.09999);
((GeneralPath)shape).curveTo(44.700012, 86.19999, 44.400013, 87.29999, 43.700012, 88.29999);
((GeneralPath)shape).curveTo(43.100014, 89.29999, 42.200012, 89.999985, 41.00001, 90.499985);
((GeneralPath)shape).curveTo(39.80001, 90.999985, 38.400013, 91.19998, 36.60001, 91.19998);
((GeneralPath)shape).curveTo(34.10001, 91.19998, 32.10001, 90.59998, 30.80001, 89.499985);
((GeneralPath)shape).curveTo(29.500011, 88.499985, 28.70001, 86.79999, 28.500011, 84.59998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.7, 91.1);
((GeneralPath)shape).lineTo(52.7, 74.6);
((GeneralPath)shape).lineTo(46.8, 74.6);
((GeneralPath)shape).lineTo(46.8, 71.2);
((GeneralPath)shape).lineTo(62.699997, 71.2);
((GeneralPath)shape).lineTo(62.699997, 74.6);
((GeneralPath)shape).lineTo(56.799995, 74.6);
((GeneralPath)shape).lineTo(56.799995, 91.1);
((GeneralPath)shape).lineTo(52.699997, 91.1);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(17.1, 32.3);
((GeneralPath)shape).lineTo(38.4, 28.199999);
((GeneralPath)shape).lineTo(38.4, 64.0);
((GeneralPath)shape).lineTo(17.100002, 60.1);
((GeneralPath)shape).closePath();
paint = new Color(55, 83, 157, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(53.3, 60.5);
((GeneralPath)shape).lineTo(35.2, 60.5);
((GeneralPath)shape).curveTo(34.3, 60.5, 33.600002, 59.8, 33.600002, 58.9);
((GeneralPath)shape).lineTo(33.600002, 33.4);
((GeneralPath)shape).curveTo(33.600002, 32.5, 34.300003, 31.800001, 35.2, 31.800001);
((GeneralPath)shape).lineTo(53.300003, 31.800001);
((GeneralPath)shape).curveTo(54.200005, 31.800001, 54.9, 32.5, 54.9, 33.4);
((GeneralPath)shape).lineTo(54.9, 58.9);
((GeneralPath)shape).curveTo(54.9, 59.800003, 54.2, 60.5, 53.300003, 60.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.2, 33.3);
((GeneralPath)shape).curveTo(35.100002, 33.3, 35.0, 33.399998, 35.0, 33.5);
((GeneralPath)shape).lineTo(35.0, 59.0);
((GeneralPath)shape).curveTo(35.0, 59.1, 35.1, 59.2, 35.2, 59.2);
((GeneralPath)shape).lineTo(53.300003, 59.2);
((GeneralPath)shape).curveTo(53.4, 59.2, 53.500004, 59.100002, 53.500004, 59.0);
((GeneralPath)shape).lineTo(53.500004, 33.4);
((GeneralPath)shape).curveTo(53.500004, 33.300003, 53.400005, 33.2, 53.300003, 33.2);
((GeneralPath)shape).lineTo(35.200005, 33.3);
((GeneralPath)shape).closePath();
paint = new Color(55, 83, 157, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
paint = new Color(55, 83, 157, 255);
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.0, 49.0);
((GeneralPath)shape).lineTo(42.0, 49.0);
((GeneralPath)shape).lineTo(42.0, 55.0);
((GeneralPath)shape).lineTo(36.0, 55.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(43.010002, 39.65);
((GeneralPath)shape).lineTo(46.617, 36.043003);
((GeneralPath)shape).lineTo(50.223, 39.65);
((GeneralPath)shape).lineTo(46.617, 43.256);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(43.000004, 39.800003);
((GeneralPath)shape).lineTo(38.000004, 39.800003);
((GeneralPath)shape).moveTo(47.000004, 43.000004);
((GeneralPath)shape).lineTo(47.000004, 52.000004);
((GeneralPath)shape).moveTo(42.000004, 52.000004);
((GeneralPath)shape).lineTo(48.000004, 52.000004);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.0, 41.2);
((GeneralPath)shape).lineTo(25.1, 41.2);
((GeneralPath)shape).lineTo(27.4, 48.100002);
((GeneralPath)shape).curveTo(27.6, 48.7, 27.8, 49.7, 27.8, 49.7);
((GeneralPath)shape).curveTo(27.8, 49.7, 28.0, 48.8, 28.199999, 48.100002);
((GeneralPath)shape).lineTo(30.599998, 41.2);
((GeneralPath)shape).lineTo(32.699997, 41.2);
((GeneralPath)shape).lineTo(28.799997, 51.800003);
((GeneralPath)shape).lineTo(26.899998, 51.800003);
((GeneralPath)shape).lineTo(23.0, 41.2);
((GeneralPath)shape).closePath();
paint = new Color(168, 183, 225, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(168, 183, 225, 255);
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.0, 41.2);
((GeneralPath)shape).lineTo(25.1, 41.2);
((GeneralPath)shape).lineTo(27.4, 48.100002);
((GeneralPath)shape).curveTo(27.6, 48.7, 27.8, 49.7, 27.8, 49.7);
((GeneralPath)shape).curveTo(27.8, 49.7, 28.0, 48.8, 28.199999, 48.100002);
((GeneralPath)shape).lineTo(30.599998, 41.2);
((GeneralPath)shape).lineTo(32.699997, 41.2);
((GeneralPath)shape).lineTo(28.799997, 51.800003);
((GeneralPath)shape).lineTo(26.899998, 51.800003);
((GeneralPath)shape).lineTo(23.0, 41.2);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_8);
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
	private ext_vst() {
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
       ext_vst base = new ext_vst();
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
       ext_vst base = new ext_vst();
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
        return ext_vst::new;
    }
}

