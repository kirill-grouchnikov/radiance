package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_mk implements RadianceIcon {
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
generalPath.moveTo(38.7f, 45.4f);
generalPath.lineTo(41.9f, 46.300003f);
generalPath.lineTo(43.800003f, 39.300003f);
generalPath.lineTo(40.600002f, 38.4f);
generalPath.curveTo(40.600002f, 37.300003f, 40.500004f, 36.100002f, 40.2f, 35.0f);
generalPath.lineTo(43.100002f, 33.3f);
generalPath.lineTo(39.4f, 27.0f);
generalPath.lineTo(36.5f, 28.7f);
generalPath.curveTo(35.7f, 27.900002f, 34.8f, 27.2f, 33.8f, 26.6f);
generalPath.lineTo(34.7f, 23.4f);
generalPath.lineTo(27.7f, 21.5f);
generalPath.lineTo(26.800001f, 24.7f);
generalPath.curveTo(25.7f, 24.7f, 24.500002f, 24.800001f, 23.400002f, 25.1f);
generalPath.lineTo(21.7f, 22.2f);
generalPath.lineTo(15.400001f, 25.800001f);
generalPath.lineTo(17.1f, 28.7f);
generalPath.curveTo(16.300001f, 29.5f, 15.6f, 30.400002f, 15.0f, 31.400002f);
generalPath.lineTo(11.8f, 30.500002f);
generalPath.lineTo(9.900001f, 37.5f);
generalPath.lineTo(13.1f, 38.4f);
generalPath.curveTo(13.1f, 39.5f, 13.200001f, 40.7f, 13.5f, 41.800003f);
generalPath.lineTo(10.6f, 43.500004f);
generalPath.lineTo(14.200001f, 49.800003f);
generalPath.lineTo(17.1f, 48.100002f);
generalPath.curveTo(17.9f, 48.9f, 18.800001f, 49.600002f, 19.800001f, 50.2f);
generalPath.lineTo(18.900002f, 53.4f);
generalPath.lineTo(25.900002f, 55.300003f);
generalPath.lineTo(26.800001f, 52.100002f);
generalPath.curveTo(27.900002f, 52.100002f, 29.1f, 51.9f, 30.2f, 51.7f);
generalPath.lineTo(31.900002f, 54.600002f);
generalPath.lineTo(38.2f, 51.000004f);
generalPath.lineTo(36.5f, 48.100002f);
generalPath.curveTo(37.4f, 47.300003f, 38.1f, 46.4f, 38.7f, 45.4f);
generalPath.closePath();
generalPath.moveTo(21.300001f, 41.7f);
generalPath.curveTo(19.500002f, 38.600002f, 20.6f, 34.600002f, 23.7f, 32.9f);
generalPath.curveTo(26.800001f, 31.100002f, 30.800001f, 32.2f, 32.5f, 35.300003f);
generalPath.curveTo(34.3f, 38.4f, 33.2f, 42.4f, 30.1f, 44.100002f);
generalPath.curveTo(27.0f, 45.800003f, 23.0f, 44.800003f, 21.3f, 41.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.861000061035156, 55.39099884033203), new Point2D.Double(26.861000061035156, 21.5), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(55.4f, 64.0f);
generalPath.lineTo(59.5f, 61.6f);
generalPath.lineTo(58.4f, 59.699997f);
generalPath.curveTo(58.9f, 59.199997f, 59.4f, 58.6f, 59.800003f, 57.899998f);
generalPath.lineTo(61.9f, 58.499996f);
generalPath.lineTo(63.100002f, 53.899998f);
generalPath.lineTo(61.000004f, 53.399998f);
generalPath.curveTo(61.000004f, 52.699997f, 60.900005f, 51.899998f, 60.700005f, 51.199997f);
generalPath.lineTo(62.600006f, 50.1f);
generalPath.lineTo(60.200005f, 46.0f);
generalPath.lineTo(58.300003f, 47.0f);
generalPath.curveTo(57.800003f, 46.5f, 57.200005f, 46.0f, 56.500004f, 45.6f);
generalPath.lineTo(57.100002f, 43.5f);
generalPath.lineTo(52.500004f, 42.3f);
generalPath.lineTo(51.900005f, 44.399998f);
generalPath.curveTo(51.200005f, 44.399998f, 50.400005f, 44.499996f, 49.700005f, 44.699997f);
generalPath.lineTo(48.600006f, 42.799995f);
generalPath.lineTo(44.500008f, 45.199997f);
generalPath.lineTo(45.600006f, 47.1f);
generalPath.curveTo(45.100006f, 47.6f, 44.600006f, 48.199997f, 44.200005f, 48.899998f);
generalPath.lineTo(42.100006f, 48.3f);
generalPath.lineTo(40.900005f, 52.899998f);
generalPath.lineTo(43.000004f, 53.499996f);
generalPath.curveTo(43.000004f, 54.199997f, 43.100002f, 54.999996f, 43.300003f, 55.699997f);
generalPath.lineTo(41.4f, 56.799995f);
generalPath.lineTo(43.800003f, 60.899994f);
generalPath.lineTo(45.700005f, 59.799995f);
generalPath.curveTo(46.200005f, 60.299995f, 46.800003f, 60.799995f, 47.500004f, 61.199997f);
generalPath.lineTo(46.900005f, 63.299995f);
generalPath.lineTo(51.500004f, 64.49999f);
generalPath.lineTo(52.100002f, 62.399994f);
generalPath.curveTo(52.800003f, 62.399994f, 53.600002f, 62.299995f, 54.300003f, 62.099995f);
generalPath.lineTo(55.4f, 63.999996f);
generalPath.closePath();
generalPath.moveTo(48.300003f, 55.5f);
generalPath.curveTo(47.100002f, 53.5f, 47.800003f, 50.9f, 49.9f, 49.7f);
generalPath.curveTo(51.9f, 48.5f, 54.5f, 49.2f, 55.7f, 51.2f);
generalPath.curveTo(56.9f, 53.2f, 56.2f, 55.8f, 54.2f, 57.0f);
generalPath.curveTo(52.100002f, 58.2f, 49.5f, 57.6f, 48.3f, 55.5f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(52.00199890136719, 64.5), new Point2D.Double(52.00199890136719, 42.33599853515625), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(16.3f, 91.1f);
generalPath.lineTo(16.3f, 71.2f);
generalPath.lineTo(22.3f, 71.2f);
generalPath.lineTo(25.9f, 84.7f);
generalPath.lineTo(29.5f, 71.2f);
generalPath.lineTo(35.5f, 71.2f);
generalPath.lineTo(35.5f, 91.0f);
generalPath.lineTo(31.8f, 91.0f);
generalPath.lineTo(31.8f, 75.4f);
generalPath.lineTo(27.8f, 91.0f);
generalPath.lineTo(24.0f, 91.0f);
generalPath.lineTo(20.0f, 75.4f);
generalPath.lineTo(20.0f, 91.0f);
generalPath.lineTo(16.3f, 91.0f);
generalPath.closePath();
generalPath.moveTo(39.6f, 91.1f);
generalPath.lineTo(39.6f, 71.2f);
generalPath.lineTo(43.6f, 71.2f);
generalPath.lineTo(43.6f, 80.0f);
generalPath.lineTo(51.699997f, 71.2f);
generalPath.lineTo(57.1f, 71.2f);
generalPath.lineTo(49.7f, 79.0f);
generalPath.lineTo(57.600002f, 91.1f);
generalPath.lineTo(52.4f, 91.1f);
generalPath.lineTo(46.9f, 81.799995f);
generalPath.lineTo(43.600002f, 85.1f);
generalPath.lineTo(43.600002f, 91.1f);
generalPath.lineTo(39.600002f, 91.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
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
	private ext_mk() {
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
       ext_mk base = new ext_mk();
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
       ext_mk base = new ext_mk();
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
        return ext_mk::new;
    }
}

