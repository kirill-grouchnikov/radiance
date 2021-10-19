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
public class ext_cer implements RadianceIcon {
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
generalPath.moveTo(51.4f, 37.7f);
generalPath.lineTo(48.5f, 37.7f);
generalPath.lineTo(48.5f, 32.0f);
generalPath.curveTo(48.5f, 25.6f, 43.3f, 20.3f, 36.8f, 20.3f);
generalPath.curveTo(30.3f, 20.3f, 25.1f, 25.6f, 25.1f, 32.0f);
generalPath.lineTo(25.1f, 37.7f);
generalPath.lineTo(22.2f, 37.7f);
generalPath.curveTo(21.1f, 37.7f, 20.2f, 38.600002f, 20.2f, 39.7f);
generalPath.lineTo(20.2f, 59.5f);
generalPath.curveTo(20.2f, 60.6f, 21.1f, 61.5f, 22.2f, 61.5f);
generalPath.lineTo(51.300003f, 61.5f);
generalPath.curveTo(52.4f, 61.5f, 53.300003f, 60.6f, 53.300003f, 59.5f);
generalPath.lineTo(53.300003f, 39.8f);
generalPath.curveTo(53.4f, 38.6f, 52.500004f, 37.7f, 51.4f, 37.7f);
generalPath.closePath();
generalPath.moveTo(39.3f, 54.2f);
generalPath.curveTo(39.5f, 54.9f, 39.0f, 55.5f, 38.3f, 55.5f);
generalPath.lineTo(35.3f, 55.5f);
generalPath.curveTo(34.6f, 55.5f, 34.1f, 54.8f, 34.3f, 54.2f);
generalPath.lineTo(35.3f, 50.5f);
generalPath.curveTo(34.2f, 49.9f, 33.399998f, 48.8f, 33.399998f, 47.4f);
generalPath.curveTo(33.399998f, 45.4f, 34.999996f, 43.9f, 36.899998f, 43.9f);
generalPath.curveTo(38.8f, 43.9f, 40.399998f, 45.5f, 40.399998f, 47.4f);
generalPath.curveTo(40.399998f, 48.800003f, 39.6f, 50.0f, 38.499996f, 50.5f);
generalPath.lineTo(39.299995f, 54.2f);
generalPath.closePath();
generalPath.moveTo(42.6f, 37.7f);
generalPath.lineTo(31.0f, 37.7f);
generalPath.lineTo(31.0f, 32.0f);
generalPath.curveTo(31.0f, 28.8f, 33.6f, 26.2f, 36.8f, 26.2f);
generalPath.curveTo(40.0f, 26.2f, 42.6f, 28.800001f, 42.6f, 32.0f);
generalPath.lineTo(42.6f, 37.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.79999923706055, 61.5890007019043), new Point2D.Double(36.79999923706055, 20.33300018310547), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
// _0_4
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
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.2f, 84.5f);
generalPath.lineTo(25.1f, 85.7f);
generalPath.curveTo(24.5f, 87.899994f, 23.5f, 89.5f, 22.1f, 90.6f);
generalPath.curveTo(20.7f, 91.7f, 18.9f, 92.2f, 16.8f, 92.2f);
generalPath.curveTo(14.099999f, 92.2f, 11.999999f, 91.299995f, 10.199999f, 89.5f);
generalPath.curveTo(8.499999f, 87.7f, 7.599999f, 85.2f, 7.599999f, 82.0f);
generalPath.curveTo(7.599999f, 78.7f, 8.499999f, 76.1f, 10.199999f, 74.2f);
generalPath.curveTo(11.899999f, 72.299995f, 14.199999f, 71.399994f, 17.0f, 71.399994f);
generalPath.curveTo(19.5f, 71.399994f, 21.4f, 72.09999f, 23.0f, 73.59999f);
generalPath.curveTo(23.9f, 74.49999f, 24.6f, 75.69999f, 25.1f, 77.29999f);
generalPath.lineTo(21.1f, 78.29999f);
generalPath.curveTo(20.9f, 77.29999f, 20.4f, 76.39999f, 19.6f, 75.79999f);
generalPath.curveTo(18.800001f, 75.19999f, 17.9f, 74.999985f, 16.9f, 74.999985f);
generalPath.curveTo(15.4f, 74.999985f, 14.2f, 75.499985f, 13.299999f, 76.59998f);
generalPath.curveTo(12.4f, 77.69998f, 11.9f, 79.39999f, 11.9f, 81.79998f);
generalPath.curveTo(11.9f, 84.29998f, 12.4f, 86.09998f, 13.299999f, 87.19998f);
generalPath.curveTo(14.199999f, 88.29998f, 15.4f, 88.79998f, 16.9f, 88.79998f);
generalPath.curveTo(18.0f, 88.79998f, 18.9f, 88.49998f, 19.699999f, 87.79998f);
generalPath.curveTo(20.3f, 87.09998f, 20.9f, 85.99998f, 21.199999f, 84.49998f);
generalPath.closePath();
generalPath.moveTo(28.6f, 91.9f);
generalPath.lineTo(28.6f, 71.9f);
generalPath.lineTo(43.5f, 71.9f);
generalPath.lineTo(43.5f, 75.3f);
generalPath.lineTo(32.7f, 75.3f);
generalPath.lineTo(32.7f, 79.700005f);
generalPath.lineTo(42.800003f, 79.700005f);
generalPath.lineTo(42.800003f, 83.100006f);
generalPath.lineTo(32.7f, 83.100006f);
generalPath.lineTo(32.7f, 88.600006f);
generalPath.lineTo(43.9f, 88.600006f);
generalPath.lineTo(43.9f, 92.0f);
generalPath.lineTo(28.6f, 92.0f);
generalPath.closePath();
generalPath.moveTo(47.300003f, 91.9f);
generalPath.lineTo(47.300003f, 71.9f);
generalPath.lineTo(55.800003f, 71.9f);
generalPath.curveTo(57.9f, 71.9f, 59.500004f, 72.1f, 60.500004f, 72.4f);
generalPath.curveTo(61.500004f, 72.700005f, 62.200005f, 73.4f, 62.800003f, 74.3f);
generalPath.curveTo(63.4f, 75.200005f, 63.700005f, 76.3f, 63.700005f, 77.5f);
generalPath.curveTo(63.700005f, 79.0f, 63.300003f, 80.2f, 62.400005f, 81.2f);
generalPath.curveTo(61.500008f, 82.2f, 60.200005f, 82.799995f, 58.400005f, 83.1f);
generalPath.curveTo(59.300007f, 83.6f, 60.000004f, 84.2f, 60.600006f, 84.799995f);
generalPath.curveTo(61.200005f, 85.399994f, 61.900005f, 86.49999f, 62.900005f, 88.1f);
generalPath.lineTo(65.3f, 92.0f);
generalPath.lineTo(60.500004f, 92.0f);
generalPath.lineTo(57.600002f, 87.6f);
generalPath.curveTo(56.600002f, 86.0f, 55.800003f, 85.1f, 55.500004f, 84.7f);
generalPath.curveTo(55.200005f, 84.299995f, 54.700005f, 84.0f, 54.300003f, 83.899994f);
generalPath.curveTo(53.9f, 83.7f, 53.200005f, 83.7f, 52.300003f, 83.7f);
generalPath.lineTo(51.500004f, 83.7f);
generalPath.lineTo(51.500004f, 92.1f);
generalPath.lineTo(47.300003f, 92.1f);
generalPath.closePath();
generalPath.moveTo(51.300003f, 80.3f);
generalPath.lineTo(54.300003f, 80.3f);
generalPath.curveTo(56.200005f, 80.3f, 57.500004f, 80.200005f, 57.9f, 80.100006f);
generalPath.curveTo(58.4f, 79.90001f, 58.800003f, 79.700005f, 59.0f, 79.3f);
generalPath.curveTo(59.199997f, 78.9f, 59.4f, 78.4f, 59.4f, 77.8f);
generalPath.curveTo(59.4f, 77.100006f, 59.2f, 76.600006f, 58.9f, 76.200005f);
generalPath.curveTo(58.5f, 75.8f, 58.0f, 75.50001f, 57.4f, 75.4f);
generalPath.curveTo(57.100002f, 75.4f, 56.100002f, 75.3f, 54.4f, 75.3f);
generalPath.lineTo(51.2f, 75.3f);
generalPath.lineTo(51.2f, 80.3f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
	private ext_cer() {
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
       ext_cer base = new ext_cer();
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
       ext_cer base = new ext_cer();
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
        return ext_cer::new;
    }
}

