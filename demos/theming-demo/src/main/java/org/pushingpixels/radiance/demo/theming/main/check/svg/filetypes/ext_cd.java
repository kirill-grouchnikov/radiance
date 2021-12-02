package org.pushingpixels.radiance.demo.theming.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.plaf.UIResource;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class ext_cd implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.265000104904175), new Point2D.Double(36.0, 100.25), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.5f, 82.4f);
generalPath.lineTo(34.5f, 83.6f);
generalPath.curveTo(33.9f, 85.799995f, 32.9f, 87.4f, 31.5f, 88.5f);
generalPath.curveTo(30.1f, 89.6f, 28.3f, 90.1f, 26.1f, 90.1f);
generalPath.curveTo(23.4f, 90.1f, 21.2f, 89.2f, 19.5f, 87.4f);
generalPath.curveTo(17.8f, 85.6f, 16.9f, 83.1f, 16.9f, 79.9f);
generalPath.curveTo(16.9f, 76.6f, 17.8f, 74.0f, 19.5f, 72.1f);
generalPath.curveTo(21.2f, 70.299995f, 23.5f, 69.299995f, 26.4f, 69.299995f);
generalPath.curveTo(28.9f, 69.299995f, 30.9f, 69.99999f, 32.4f, 71.49999f);
generalPath.curveTo(33.300003f, 72.399994f, 34.0f, 73.59999f, 34.5f, 75.19999f);
generalPath.lineTo(30.5f, 76.19999f);
generalPath.curveTo(30.3f, 75.19999f, 29.8f, 74.29999f, 29.0f, 73.69999f);
generalPath.curveTo(28.2f, 73.09999f, 27.3f, 72.79999f, 26.2f, 72.79999f);
generalPath.curveTo(24.7f, 72.79999f, 23.5f, 73.29999f, 22.5f, 74.39999f);
generalPath.curveTo(21.6f, 75.499985f, 21.1f, 77.19999f, 21.1f, 79.59998f);
generalPath.curveTo(21.1f, 82.09998f, 21.6f, 83.89999f, 22.5f, 84.999985f);
generalPath.curveTo(23.4f, 86.09998f, 24.6f, 86.59998f, 26.1f, 86.59998f);
generalPath.curveTo(27.2f, 86.59998f, 28.1f, 86.29998f, 28.9f, 85.59998f);
generalPath.curveTo(29.6f, 84.999985f, 30.199999f, 83.89999f, 30.5f, 82.39999f);
generalPath.closePath();
generalPath.moveTo(38.0f, 69.8f);
generalPath.lineTo(45.5f, 69.8f);
generalPath.curveTo(47.2f, 69.8f, 48.5f, 69.9f, 49.4f, 70.200005f);
generalPath.curveTo(50.600002f, 70.50001f, 51.600002f, 71.200005f, 52.5f, 72.00001f);
generalPath.curveTo(53.399998f, 72.80001f, 54.0f, 74.00001f, 54.4f, 75.200005f);
generalPath.curveTo(54.800003f, 76.50001f, 55.100002f, 78.100006f, 55.100002f, 79.9f);
generalPath.curveTo(55.100002f, 81.5f, 54.9f, 83.0f, 54.500004f, 84.200005f);
generalPath.curveTo(54.000004f, 85.700005f, 53.300003f, 86.8f, 52.300003f, 87.700005f);
generalPath.curveTo(51.600002f, 88.4f, 50.600002f, 88.9f, 49.4f, 89.3f);
generalPath.curveTo(48.5f, 89.600006f, 47.300003f, 89.700005f, 45.800003f, 89.700005f);
generalPath.lineTo(38.0f, 89.700005f);
generalPath.lineTo(38.0f, 69.8f);
generalPath.closePath();
generalPath.moveTo(42.1f, 73.200005f);
generalPath.lineTo(42.1f, 86.50001f);
generalPath.lineTo(45.199997f, 86.50001f);
generalPath.curveTo(46.299995f, 86.50001f, 47.199997f, 86.40001f, 47.699997f, 86.30001f);
generalPath.curveTo(48.399998f, 86.10001f, 48.899998f, 85.90001f, 49.399998f, 85.50001f);
generalPath.curveTo(49.899998f, 85.100006f, 50.199997f, 84.50001f, 50.499996f, 83.600006f);
generalPath.curveTo(50.799995f, 82.700005f, 50.899998f, 81.50001f, 50.899998f, 79.90001f);
generalPath.curveTo(50.899998f, 78.30001f, 50.8f, 77.20001f, 50.499996f, 76.30001f);
generalPath.curveTo(50.199993f, 75.40001f, 49.799995f, 74.80001f, 49.299995f, 74.40001f);
generalPath.curveTo(48.799995f, 73.90001f, 48.199997f, 73.600006f, 47.399994f, 73.50001f);
generalPath.curveTo(46.799995f, 73.40001f, 45.699993f, 73.30001f, 43.999992f, 73.30001f);
generalPath.lineTo(42.09999f, 73.30001f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 73.45700073242188), new Point2D.Double(58.569000244140625, 86.95700073242188), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.2f, 52.2f);
generalPath.lineTo(44.8f, 50.7f);
generalPath.curveTo(45.7f, 47.9f, 46.6f, 45.0f, 47.5f, 42.2f);
generalPath.curveTo(47.8f, 41.100002f, 48.2f, 40.0f, 48.9f, 39.100002f);
generalPath.curveTo(50.0f, 37.600002f, 51.5f, 36.800003f, 53.2f, 36.600002f);
generalPath.curveTo(53.9f, 36.500004f, 54.600002f, 36.4f, 55.3f, 36.4f);
generalPath.lineTo(62.0f, 36.4f);
generalPath.curveTo(61.9f, 36.5f, 61.9f, 36.600002f, 61.9f, 36.7f);
generalPath.curveTo(61.100002f, 38.100002f, 60.4f, 39.5f, 59.600002f, 40.9f);
generalPath.lineTo(55.4f, 48.100002f);
generalPath.curveTo(54.5f, 49.600002f, 53.5f, 51.100002f, 52.300003f, 52.500004f);
generalPath.curveTo(51.500004f, 53.500004f, 50.600002f, 54.500004f, 49.500004f, 55.200005f);
generalPath.curveTo(48.700005f, 55.700005f, 47.900005f, 56.000004f, 47.000004f, 56.000004f);
generalPath.lineTo(37.100006f, 56.000004f);
generalPath.curveTo(36.100006f, 56.000004f, 35.300007f, 55.600002f, 34.600006f, 55.000004f);
generalPath.curveTo(33.600006f, 54.100002f, 33.000008f, 52.800003f, 32.500008f, 51.600002f);
generalPath.curveTo(31.600008f, 49.300003f, 31.100008f, 46.800003f, 30.500008f, 44.4f);
generalPath.curveTo(30.200008f, 43.300003f, 29.900007f, 42.100002f, 29.600008f, 41.0f);
generalPath.curveTo(29.600008f, 40.9f, 29.500008f, 40.9f, 29.500008f, 40.8f);
generalPath.lineTo(29.300007f, 41.0f);
generalPath.curveTo(28.000008f, 42.3f, 26.900007f, 43.7f, 25.900007f, 45.2f);
generalPath.curveTo(25.600008f, 45.600002f, 25.500008f, 46.100002f, 25.400007f, 46.600002f);
generalPath.curveTo(24.800007f, 48.4f, 24.300007f, 50.2f, 23.700006f, 51.9f);
generalPath.curveTo(23.100006f, 53.600002f, 22.100006f, 54.9f, 20.400007f, 55.7f);
generalPath.curveTo(19.400007f, 56.2f, 18.400007f, 56.4f, 17.300007f, 56.4f);
generalPath.curveTo(15.7000065f, 56.4f, 14.100007f, 56.4f, 12.500007f, 56.5f);
generalPath.curveTo(12.100007f, 56.5f, 12.100007f, 56.5f, 12.2000065f, 56.1f);
generalPath.curveTo(12.900006f, 53.6f, 13.7000065f, 51.1f, 14.800007f, 48.699997f);
generalPath.curveTo(15.900007f, 46.199997f, 17.200006f, 43.899998f, 18.900007f, 41.799995f);
generalPath.curveTo(20.000008f, 40.299995f, 21.300007f, 38.999996f, 22.800007f, 37.999996f);
generalPath.curveTo(23.600006f, 37.499996f, 24.400007f, 37.099995f, 25.400007f, 36.999996f);
generalPath.lineTo(36.0f, 36.999996f);
generalPath.curveTo(37.8f, 36.999996f, 39.1f, 37.699997f, 40.1f, 39.199997f);
generalPath.curveTo(40.699997f, 40.1f, 41.1f, 41.1f, 41.5f, 42.1f);
generalPath.curveTo(42.2f, 44.199997f, 42.7f, 46.3f, 43.2f, 48.399998f);
generalPath.lineTo(44.100002f, 51.999996f);
generalPath.curveTo(44.100002f, 52.099995f, 44.100002f, 52.199997f, 44.2f, 52.199997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 56.5), new Point2D.Double(37.0, 36.5), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());

}



    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    _paint0(g, origAlpha);


	    shape = null;
	    generalPath = null;
	    paint = null;
	    stroke = null;
	    clip = null;
        transformsStack.clear();
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_cd() {
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
	public synchronized void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
    public boolean supportsColorFilter() {
        return true;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    @Override
	public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
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
    public static RadianceIcon of(int width, int height) {
       ext_cd base = new ext_cd();
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
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       ext_cd base = new ext_cd();
       base.width = width;
       base.height = height;
       return new RadianceIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_cd::new;
    }
}

