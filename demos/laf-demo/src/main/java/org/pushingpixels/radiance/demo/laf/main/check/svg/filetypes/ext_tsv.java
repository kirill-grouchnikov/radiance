package org.pushingpixels.radiance.demo.laf.main.check.svg.filetypes;

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
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_tsv implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
transformsStack.push(g.getTransform());
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.108001708984375, 3.003000020980835), new Point2D.Double(36.108001708984375, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.1f, 91.1f);
generalPath.lineTo(15.1f, 74.6f);
generalPath.lineTo(9.2f, 74.6f);
generalPath.lineTo(9.2f, 71.2f);
generalPath.lineTo(25.099998f, 71.2f);
generalPath.lineTo(25.099998f, 74.6f);
generalPath.lineTo(19.199999f, 74.6f);
generalPath.lineTo(19.199999f, 91.1f);
generalPath.lineTo(15.099998f, 91.1f);
generalPath.closePath();
generalPath.moveTo(26.6f, 84.6f);
generalPath.lineTo(30.5f, 84.2f);
generalPath.curveTo(30.7f, 85.5f, 31.2f, 86.5f, 31.9f, 87.1f);
generalPath.curveTo(32.6f, 87.7f, 33.6f, 88.0f, 34.8f, 88.0f);
generalPath.curveTo(36.1f, 88.0f, 37.1f, 87.7f, 37.7f, 87.2f);
generalPath.curveTo(38.300003f, 86.7f, 38.7f, 86.0f, 38.7f, 85.299995f);
generalPath.curveTo(38.7f, 84.799995f, 38.600002f, 84.399994f, 38.3f, 84.1f);
generalPath.curveTo(37.999996f, 83.8f, 37.5f, 83.5f, 36.8f, 83.2f);
generalPath.curveTo(36.3f, 83.0f, 35.3f, 82.7f, 33.6f, 82.299995f);
generalPath.curveTo(31.399998f, 81.799995f, 29.899998f, 81.1f, 28.999998f, 80.299995f);
generalPath.curveTo(27.799997f, 79.2f, 27.199999f, 77.899994f, 27.199999f, 76.299995f);
generalPath.curveTo(27.199999f, 75.299995f, 27.499998f, 74.299995f, 28.099998f, 73.49999f);
generalPath.curveTo(28.699999f, 72.59999f, 29.499998f, 71.99999f, 30.599998f, 71.49999f);
generalPath.curveTo(31.699999f, 70.99999f, 33.0f, 70.799995f, 34.5f, 70.799995f);
generalPath.curveTo(37.0f, 70.799995f, 38.9f, 71.299995f, 40.2f, 72.399994f);
generalPath.curveTo(41.5f, 73.49999f, 42.100002f, 74.899994f, 42.2f, 76.799995f);
generalPath.lineTo(38.2f, 76.99999f);
generalPath.curveTo(38.0f, 75.99999f, 37.7f, 75.19999f, 37.100002f, 74.799995f);
generalPath.curveTo(36.500004f, 74.399994f, 35.7f, 74.1f, 34.500004f, 74.1f);
generalPath.curveTo(33.300003f, 74.1f, 32.400005f, 74.299995f, 31.700005f, 74.799995f);
generalPath.curveTo(31.300005f, 75.1f, 31.100004f, 75.49999f, 31.100004f, 75.99999f);
generalPath.curveTo(31.100004f, 76.49999f, 31.300005f, 76.899994f, 31.700005f, 77.19999f);
generalPath.curveTo(32.200005f, 77.59999f, 33.400005f, 78.09999f, 35.400005f, 78.49999f);
generalPath.curveTo(37.400005f, 78.899994f, 38.800007f, 79.399994f, 39.800007f, 79.899994f);
generalPath.curveTo(40.70001f, 80.399994f, 41.500008f, 81.09999f, 42.000008f, 81.899994f);
generalPath.curveTo(42.500008f, 82.799995f, 42.800007f, 83.799995f, 42.800007f, 85.09999f);
generalPath.curveTo(42.800007f, 86.19999f, 42.500008f, 87.29999f, 41.800007f, 88.29999f);
generalPath.curveTo(41.20001f, 89.29999f, 40.300007f, 89.999985f, 39.100006f, 90.499985f);
generalPath.curveTo(37.900005f, 90.999985f, 36.500008f, 91.19998f, 34.800007f, 91.19998f);
generalPath.curveTo(32.300007f, 91.19998f, 30.300007f, 90.59998f, 29.000008f, 89.499985f);
generalPath.curveTo(27.700008f, 88.499985f, 26.900007f, 86.79999f, 26.600008f, 84.59998f);
generalPath.closePath();
generalPath.moveTo(51.4f, 91.1f);
generalPath.lineTo(44.300003f, 71.3f);
generalPath.lineTo(48.700005f, 71.3f);
generalPath.lineTo(53.8f, 86.0f);
generalPath.lineTo(58.7f, 71.3f);
generalPath.lineTo(63.0f, 71.3f);
generalPath.lineTo(55.8f, 91.100006f);
generalPath.lineTo(51.399998f, 91.100006f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(47.9f, 26.8f);
generalPath.lineTo(61.0f, 26.8f);
generalPath.lineTo(61.0f, 35.5f);
generalPath.lineTo(47.9f, 35.5f);
generalPath.lineTo(47.9f, 26.8f);
generalPath.closePath();
generalPath.moveTo(47.9f, 40.199997f);
generalPath.lineTo(61.0f, 40.199997f);
generalPath.lineTo(61.0f, 49.0f);
generalPath.lineTo(47.9f, 49.0f);
generalPath.lineTo(47.9f, 40.2f);
generalPath.closePath();
generalPath.moveTo(47.9f, 53.6f);
generalPath.lineTo(61.0f, 53.6f);
generalPath.lineTo(61.0f, 62.3f);
generalPath.lineTo(47.9f, 62.3f);
generalPath.lineTo(47.9f, 53.6f);
generalPath.closePath();
generalPath.moveTo(30.2f, 53.6f);
generalPath.lineTo(43.300003f, 53.6f);
generalPath.lineTo(43.300003f, 62.3f);
generalPath.lineTo(30.2f, 62.3f);
generalPath.lineTo(30.2f, 53.6f);
generalPath.closePath();
generalPath.moveTo(12.400002f, 53.6f);
generalPath.lineTo(25.500002f, 53.6f);
generalPath.lineTo(25.500002f, 62.3f);
generalPath.lineTo(12.500002f, 62.3f);
generalPath.lineTo(12.400002f, 53.6f);
generalPath.closePath();
generalPath.moveTo(30.300001f, 26.599998f);
generalPath.lineTo(43.4f, 26.599998f);
generalPath.lineTo(43.4f, 35.3f);
generalPath.lineTo(30.3f, 35.3f);
generalPath.lineTo(30.3f, 26.599998f);
generalPath.closePath();
generalPath.moveTo(12.6f, 26.599998f);
generalPath.lineTo(25.7f, 26.599998f);
generalPath.lineTo(25.7f, 35.3f);
generalPath.lineTo(12.6f, 35.3f);
generalPath.lineTo(12.6f, 26.599998f);
generalPath.closePath();
generalPath.moveTo(30.300001f, 40.199997f);
generalPath.lineTo(43.4f, 40.199997f);
generalPath.lineTo(43.4f, 49.0f);
generalPath.lineTo(30.3f, 49.0f);
generalPath.lineTo(30.3f, 40.2f);
generalPath.closePath();
generalPath.moveTo(12.6f, 40.199997f);
generalPath.lineTo(25.7f, 40.199997f);
generalPath.lineTo(25.7f, 49.0f);
generalPath.lineTo(12.6f, 49.0f);
generalPath.lineTo(12.6f, 40.2f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.75, 62.28900146484375), new Point2D.Double(36.75, 26.583999633789062), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_tsv() {
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
       ext_tsv base = new ext_tsv();
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
       ext_tsv base = new ext_tsv();
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
        return ext_tsv::new;
    }
}

