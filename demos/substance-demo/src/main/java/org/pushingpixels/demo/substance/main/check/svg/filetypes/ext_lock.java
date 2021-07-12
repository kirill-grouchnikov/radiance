package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_lock implements NeonIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private NeonIcon.ColorFilter colorFilter = null;
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
generalPath.moveTo(7.0f, 91.9f);
generalPath.lineTo(7.0f, 76.3f);
generalPath.lineTo(10.2f, 76.3f);
generalPath.lineTo(10.2f, 89.3f);
generalPath.lineTo(18.1f, 89.3f);
generalPath.lineTo(18.1f, 92.0f);
generalPath.lineTo(7.0f, 92.0f);
generalPath.closePath();
generalPath.moveTo(19.7f, 84.1f);
generalPath.curveTo(19.7f, 82.5f, 19.900002f, 81.1f, 20.400002f, 80.1f);
generalPath.curveTo(20.800001f, 79.299995f, 21.2f, 78.6f, 21.900002f, 77.9f);
generalPath.curveTo(22.500002f, 77.3f, 23.2f, 76.8f, 23.900002f, 76.5f);
generalPath.curveTo(24.900002f, 76.1f, 26.000002f, 75.9f, 27.300001f, 75.9f);
generalPath.curveTo(29.6f, 75.9f, 31.5f, 76.6f, 32.9f, 78.1f);
generalPath.curveTo(34.300003f, 79.5f, 35.0f, 81.5f, 35.0f, 84.1f);
generalPath.curveTo(35.0f, 86.6f, 34.3f, 88.6f, 32.9f, 90.1f);
generalPath.curveTo(31.500002f, 91.5f, 29.7f, 92.299995f, 27.400002f, 92.299995f);
generalPath.curveTo(25.100002f, 92.299995f, 23.2f, 91.6f, 21.800001f, 90.2f);
generalPath.curveTo(20.400002f, 88.6f, 19.7f, 86.6f, 19.7f, 84.1f);
generalPath.closePath();
generalPath.moveTo(23.0f, 84.0f);
generalPath.curveTo(23.0f, 85.8f, 23.4f, 87.1f, 24.2f, 88.1f);
generalPath.curveTo(25.0f, 89.0f, 26.1f, 89.5f, 27.300001f, 89.5f);
generalPath.curveTo(28.500002f, 89.5f, 29.6f, 89.0f, 30.400002f, 88.1f);
generalPath.curveTo(31.2f, 87.2f, 31.600002f, 85.799995f, 31.600002f, 84.0f);
generalPath.curveTo(31.600002f, 82.2f, 31.200003f, 80.8f, 30.400002f, 80.0f);
generalPath.curveTo(29.600002f, 79.1f, 28.600002f, 78.7f, 27.2f, 78.7f);
generalPath.curveTo(25.8f, 78.7f, 25.0f, 79.0f, 24.2f, 79.899994f);
generalPath.curveTo(23.400002f, 80.799995f, 23.0f, 82.2f, 23.0f, 83.99999f);
generalPath.closePath();
generalPath.moveTo(47.6f, 86.1f);
generalPath.lineTo(50.699997f, 87.1f);
generalPath.curveTo(50.199997f, 88.799995f, 49.399998f, 90.1f, 48.299995f, 90.9f);
generalPath.curveTo(47.199997f, 91.700005f, 45.799995f, 92.200005f, 44.099995f, 92.200005f);
generalPath.curveTo(41.999996f, 92.200005f, 40.299995f, 91.50001f, 38.899994f, 90.100006f);
generalPath.curveTo(37.599995f, 88.700005f, 36.899994f, 86.700005f, 36.899994f, 84.200005f);
generalPath.curveTo(36.899994f, 81.600006f, 37.599995f, 79.50001f, 38.899994f, 78.100006f);
generalPath.curveTo(40.299995f, 76.700005f, 41.999992f, 75.90001f, 44.199993f, 75.90001f);
generalPath.curveTo(46.099995f, 75.90001f, 47.699993f, 76.50001f, 48.899994f, 77.600006f);
generalPath.curveTo(49.599995f, 78.3f, 50.199993f, 79.200005f, 50.499992f, 80.50001f);
generalPath.lineTo(47.399994f, 81.30001f);
generalPath.curveTo(47.199993f, 80.50001f, 46.799995f, 79.80001f, 46.199993f, 79.40001f);
generalPath.curveTo(45.59999f, 79.00001f, 44.899994f, 78.70001f, 43.999992f, 78.70001f);
generalPath.curveTo(42.79999f, 78.70001f, 41.899994f, 79.10001f, 41.199993f, 80.000015f);
generalPath.curveTo(40.499992f, 80.90002f, 40.099995f, 82.20001f, 40.099995f, 84.10001f);
generalPath.curveTo(40.099995f, 86.10001f, 40.499996f, 87.500015f, 41.199993f, 88.40002f);
generalPath.curveTo(41.899994f, 89.20002f, 42.79999f, 89.70002f, 43.999992f, 89.70002f);
generalPath.curveTo(44.79999f, 89.70002f, 45.59999f, 89.40002f, 46.199993f, 88.90002f);
generalPath.curveTo(46.899994f, 88.10001f, 47.29999f, 87.20002f, 47.599995f, 86.10001f);
generalPath.closePath();
generalPath.moveTo(53.399998f, 91.9f);
generalPath.lineTo(53.399998f, 76.1f);
generalPath.lineTo(56.6f, 76.1f);
generalPath.lineTo(56.6f, 83.1f);
generalPath.lineTo(63.0f, 76.1f);
generalPath.lineTo(67.3f, 76.1f);
generalPath.lineTo(61.4f, 82.2f);
generalPath.lineTo(67.700005f, 91.799995f);
generalPath.lineTo(63.600006f, 91.799995f);
generalPath.lineTo(59.300007f, 84.399994f);
generalPath.lineTo(56.70001f, 86.99999f);
generalPath.lineTo(56.70001f, 91.799995f);
generalPath.lineTo(53.40001f, 91.799995f);
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
	private ext_lock() {
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
    public static NeonIcon of(int width, int height) {
       ext_lock base = new ext_lock();
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
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_lock base = new ext_lock();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_lock::new;
    }
}

