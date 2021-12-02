package org.pushingpixels.radiance.demo.component.svg.filetypes.transcoded;

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
public class ext_el implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.3f, 91.1f);
generalPath.lineTo(20.3f, 71.0f);
generalPath.lineTo(35.3f, 71.0f);
generalPath.lineTo(35.3f, 74.4f);
generalPath.lineTo(24.4f, 74.4f);
generalPath.lineTo(24.4f, 78.8f);
generalPath.lineTo(34.5f, 78.8f);
generalPath.lineTo(34.5f, 82.200005f);
generalPath.lineTo(24.4f, 82.200005f);
generalPath.lineTo(24.4f, 87.700005f);
generalPath.lineTo(35.7f, 87.700005f);
generalPath.lineTo(35.7f, 91.100006f);
generalPath.lineTo(20.3f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(39.199997f, 91.1f);
generalPath.lineTo(39.199997f, 71.2f);
generalPath.lineTo(43.299995f, 71.2f);
generalPath.lineTo(43.299995f, 87.7f);
generalPath.lineTo(53.399994f, 87.7f);
generalPath.lineTo(53.399994f, 91.1f);
generalPath.lineTo(39.2f, 91.1f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_4
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
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.3f, 54.2f);
generalPath.lineTo(50.3f, 54.2f);
generalPath.curveTo(50.3f, 57.100002f, 49.8f, 59.100002f, 48.899998f, 60.4f);
generalPath.curveTo(47.999996f, 61.7f, 46.8f, 62.4f, 45.399998f, 62.4f);
generalPath.curveTo(44.3f, 62.4f, 43.199997f, 62.0f, 42.1f, 61.100002f);
generalPath.curveTo(41.1f, 60.300003f, 40.1f, 57.9f, 39.3f, 54.2f);
generalPath.lineTo(37.0f, 43.7f);
generalPath.lineTo(28.9f, 62.0f);
generalPath.lineTo(23.8f, 62.0f);
generalPath.lineTo(35.4f, 37.0f);
generalPath.curveTo(34.800003f, 33.8f, 34.0f, 31.4f, 33.2f, 29.8f);
generalPath.curveTo(32.4f, 28.199999f, 31.300001f, 27.5f, 30.0f, 27.5f);
generalPath.curveTo(29.0f, 27.5f, 28.1f, 27.9f, 27.3f, 28.7f);
generalPath.curveTo(26.5f, 29.5f, 26.099998f, 30.7f, 26.0f, 32.4f);
generalPath.lineTo(25.0f, 32.4f);
generalPath.curveTo(25.1f, 29.7f, 25.6f, 27.600002f, 26.6f, 26.000002f);
generalPath.curveTo(27.6f, 24.400002f, 28.9f, 23.600002f, 30.4f, 23.600002f);
generalPath.curveTo(31.4f, 23.600002f, 32.3f, 24.000002f, 33.2f, 24.800003f);
generalPath.curveTo(34.100002f, 25.600004f, 34.8f, 27.000004f, 35.5f, 28.900003f);
generalPath.curveTo(36.2f, 30.800003f, 37.2f, 34.9f, 38.5f, 41.000004f);
generalPath.lineTo(40.4f, 49.600006f);
generalPath.curveTo(41.2f, 53.200005f, 42.0f, 55.500008f, 42.800003f, 56.700005f);
generalPath.curveTo(43.600006f, 57.9f, 44.700005f, 58.500004f, 45.9f, 58.500004f);
generalPath.curveTo(47.9f, 58.500004f, 49.0f, 57.100002f, 49.300003f, 54.200005f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 62.41400146484375), new Point2D.Double(37.0, 23.586000442504883), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.78799819946289, 63.16400146484375), new Point2D.Double(36.78799819946289, 22.836000442504883), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.3f, 54.2f);
generalPath.lineTo(50.3f, 54.2f);
generalPath.curveTo(50.3f, 57.100002f, 49.8f, 59.100002f, 48.899998f, 60.4f);
generalPath.curveTo(47.999996f, 61.7f, 46.8f, 62.4f, 45.399998f, 62.4f);
generalPath.curveTo(44.3f, 62.4f, 43.199997f, 62.0f, 42.1f, 61.100002f);
generalPath.curveTo(41.1f, 60.300003f, 40.1f, 57.9f, 39.3f, 54.2f);
generalPath.lineTo(37.0f, 43.7f);
generalPath.lineTo(28.9f, 62.0f);
generalPath.lineTo(23.8f, 62.0f);
generalPath.lineTo(35.4f, 37.0f);
generalPath.curveTo(34.800003f, 33.8f, 34.0f, 31.4f, 33.2f, 29.8f);
generalPath.curveTo(32.4f, 28.199999f, 31.300001f, 27.5f, 30.0f, 27.5f);
generalPath.curveTo(29.0f, 27.5f, 28.1f, 27.9f, 27.3f, 28.7f);
generalPath.curveTo(26.5f, 29.5f, 26.099998f, 30.7f, 26.0f, 32.4f);
generalPath.lineTo(25.0f, 32.4f);
generalPath.curveTo(25.1f, 29.7f, 25.6f, 27.600002f, 26.6f, 26.000002f);
generalPath.curveTo(27.6f, 24.400002f, 28.9f, 23.600002f, 30.4f, 23.600002f);
generalPath.curveTo(31.4f, 23.600002f, 32.3f, 24.000002f, 33.2f, 24.800003f);
generalPath.curveTo(34.100002f, 25.600004f, 34.8f, 27.000004f, 35.5f, 28.900003f);
generalPath.curveTo(36.2f, 30.800003f, 37.2f, 34.9f, 38.5f, 41.000004f);
generalPath.lineTo(40.4f, 49.600006f);
generalPath.curveTo(41.2f, 53.200005f, 42.0f, 55.500008f, 42.800003f, 56.700005f);
generalPath.curveTo(43.600006f, 57.9f, 44.700005f, 58.500004f, 45.9f, 58.500004f);
generalPath.curveTo(47.9f, 58.500004f, 49.0f, 57.100002f, 49.300003f, 54.200005f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
	private ext_el() {
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
       ext_el base = new ext_el();
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
       ext_el base = new ext_el();
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
        return ext_el::new;
    }
}

