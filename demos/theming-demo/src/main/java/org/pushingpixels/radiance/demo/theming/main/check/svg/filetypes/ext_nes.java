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
public class ext_nes implements RadianceIcon {
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(9.3f, 91.9f);
generalPath.lineTo(9.3f, 71.9f);
generalPath.lineTo(13.200001f, 71.9f);
generalPath.lineTo(21.400002f, 85.3f);
generalPath.lineTo(21.400002f, 71.8f);
generalPath.lineTo(25.2f, 71.8f);
generalPath.lineTo(25.2f, 91.8f);
generalPath.lineTo(21.1f, 91.8f);
generalPath.lineTo(13.0f, 78.7f);
generalPath.lineTo(13.0f, 91.799995f);
generalPath.lineTo(9.3f, 91.799995f);
generalPath.closePath();
generalPath.moveTo(29.5f, 91.9f);
generalPath.lineTo(29.5f, 71.9f);
generalPath.lineTo(44.4f, 71.9f);
generalPath.lineTo(44.4f, 75.3f);
generalPath.lineTo(33.5f, 75.3f);
generalPath.lineTo(33.5f, 79.700005f);
generalPath.lineTo(43.6f, 79.700005f);
generalPath.lineTo(43.6f, 83.100006f);
generalPath.lineTo(33.5f, 83.100006f);
generalPath.lineTo(33.5f, 88.600006f);
generalPath.lineTo(44.7f, 88.600006f);
generalPath.lineTo(44.7f, 92.0f);
generalPath.lineTo(29.5f, 92.0f);
generalPath.closePath();
generalPath.moveTo(47.1f, 85.4f);
generalPath.lineTo(51.0f, 85.0f);
generalPath.curveTo(51.2f, 86.3f, 51.7f, 87.3f, 52.4f, 87.9f);
generalPath.curveTo(53.100002f, 88.5f, 54.100002f, 88.8f, 55.300003f, 88.8f);
generalPath.curveTo(56.600002f, 88.8f, 57.600002f, 88.5f, 58.200005f, 88.0f);
generalPath.curveTo(58.900005f, 87.4f, 59.200005f, 86.8f, 59.200005f, 86.1f);
generalPath.curveTo(59.200005f, 85.6f, 59.100006f, 85.2f, 58.800003f, 84.9f);
generalPath.curveTo(58.500004f, 84.6f, 58.000004f, 84.3f, 57.300003f, 84.0f);
generalPath.curveTo(56.800003f, 83.8f, 55.700005f, 83.5f, 54.100002f, 83.1f);
generalPath.curveTo(51.9f, 82.6f, 50.4f, 81.9f, 49.500004f, 81.1f);
generalPath.curveTo(48.300003f, 80.0f, 47.700005f, 78.7f, 47.700005f, 77.1f);
generalPath.curveTo(47.700005f, 76.1f, 48.000004f, 75.1f, 48.600006f, 74.2f);
generalPath.curveTo(49.200005f, 73.299995f, 50.000008f, 72.6f, 51.100006f, 72.2f);
generalPath.curveTo(52.200005f, 71.7f, 53.500008f, 71.5f, 55.000008f, 71.5f);
generalPath.curveTo(57.500008f, 71.5f, 59.40001f, 72.1f, 60.70001f, 73.2f);
generalPath.curveTo(62.000008f, 74.299995f, 62.60001f, 75.799995f, 62.70001f, 77.6f);
generalPath.lineTo(58.70001f, 77.799995f);
generalPath.curveTo(58.500008f, 76.799995f, 58.20001f, 75.99999f, 57.60001f, 75.6f);
generalPath.curveTo(57.00001f, 75.1f, 56.20001f, 74.9f, 55.00001f, 74.9f);
generalPath.curveTo(53.80001f, 74.9f, 52.900013f, 75.1f, 52.200012f, 75.6f);
generalPath.curveTo(51.80001f, 75.9f, 51.600014f, 76.299995f, 51.600014f, 76.799995f);
generalPath.curveTo(51.600014f, 77.299995f, 51.800014f, 77.7f, 52.200012f, 77.99999f);
generalPath.curveTo(52.700012f, 78.399994f, 54.00001f, 78.899994f, 55.900013f, 79.299995f);
generalPath.curveTo(57.800014f, 79.7f, 59.300014f, 80.2f, 60.300014f, 80.7f);
generalPath.curveTo(61.300014f, 81.2f, 62.000015f, 81.899994f, 62.500015f, 82.7f);
generalPath.curveTo(63.000015f, 83.5f, 63.300014f, 84.6f, 63.300014f, 85.899994f);
generalPath.curveTo(63.300014f, 86.99999f, 63.000015f, 88.09999f, 62.300014f, 89.09999f);
generalPath.curveTo(61.700016f, 90.09999f, 60.800014f, 90.79999f, 59.600014f, 91.29999f);
generalPath.curveTo(58.400013f, 91.79999f, 57.000015f, 91.999985f, 55.200012f, 91.999985f);
generalPath.curveTo(52.700012f, 91.999985f, 50.700012f, 91.39999f, 49.400013f, 90.19998f);
generalPath.curveTo(48.200012f, 89.29998f, 47.400013f, 87.59998f, 47.100014f, 85.39998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.3f, 31.3f);
generalPath.lineTo(23.2f, 31.3f);
generalPath.lineTo(23.2f, 34.899998f);
generalPath.lineTo(17.800001f, 34.899998f);
generalPath.lineTo(17.800001f, 36.0f);
generalPath.lineTo(15.0f, 36.0f);
generalPath.lineTo(15.0f, 37.0f);
generalPath.lineTo(17.8f, 37.0f);
generalPath.lineTo(17.8f, 38.3f);
generalPath.lineTo(23.199999f, 38.3f);
generalPath.lineTo(23.199999f, 44.6f);
generalPath.lineTo(17.8f, 44.6f);
generalPath.lineTo(17.8f, 45.899998f);
generalPath.lineTo(15.0f, 45.899998f);
generalPath.lineTo(15.0f, 46.899998f);
generalPath.lineTo(17.8f, 46.899998f);
generalPath.lineTo(17.8f, 48.0f);
generalPath.lineTo(23.199999f, 48.0f);
generalPath.lineTo(23.199999f, 54.7f);
generalPath.lineTo(17.8f, 54.7f);
generalPath.lineTo(17.8f, 55.9f);
generalPath.lineTo(15.0f, 55.9f);
generalPath.lineTo(15.0f, 56.9f);
generalPath.lineTo(17.8f, 56.9f);
generalPath.lineTo(17.8f, 58.100002f);
generalPath.lineTo(23.199999f, 58.100002f);
generalPath.lineTo(23.199999f, 63.0f);
generalPath.lineTo(49.3f, 63.0f);
generalPath.lineTo(49.3f, 58.1f);
generalPath.lineTo(54.2f, 58.1f);
generalPath.lineTo(54.2f, 56.899998f);
generalPath.lineTo(57.0f, 56.899998f);
generalPath.lineTo(57.0f, 55.899998f);
generalPath.lineTo(54.2f, 55.899998f);
generalPath.lineTo(54.2f, 54.699997f);
generalPath.lineTo(49.3f, 54.699997f);
generalPath.lineTo(49.3f, 48.0f);
generalPath.lineTo(54.2f, 48.0f);
generalPath.lineTo(54.2f, 46.9f);
generalPath.lineTo(57.0f, 46.9f);
generalPath.lineTo(57.0f, 45.9f);
generalPath.lineTo(54.2f, 45.9f);
generalPath.lineTo(54.2f, 44.600002f);
generalPath.lineTo(49.3f, 44.600002f);
generalPath.lineTo(49.3f, 38.300003f);
generalPath.lineTo(54.2f, 38.300003f);
generalPath.lineTo(54.2f, 37.0f);
generalPath.lineTo(57.0f, 37.0f);
generalPath.lineTo(57.0f, 36.0f);
generalPath.lineTo(54.2f, 36.0f);
generalPath.lineTo(54.2f, 34.9f);
generalPath.lineTo(49.3f, 34.9f);
generalPath.lineTo(49.3f, 31.300001f);
generalPath.closePath();
generalPath.moveTo(44.3f, 39.9f);
generalPath.curveTo(43.2f, 39.9f, 42.3f, 39.0f, 42.3f, 37.9f);
generalPath.curveTo(42.3f, 36.800003f, 43.2f, 35.9f, 44.3f, 35.9f);
generalPath.curveTo(45.399998f, 35.9f, 46.3f, 36.800003f, 46.3f, 37.9f);
generalPath.curveTo(46.3f, 39.0f, 45.399998f, 39.9f, 44.3f, 39.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 63.0), new Point2D.Double(36.0, 31.28700065612793), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_nes() {
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
       ext_nes base = new ext_nes();
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
       ext_nes base = new ext_nes();
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
        return ext_nes::new;
    }
}

