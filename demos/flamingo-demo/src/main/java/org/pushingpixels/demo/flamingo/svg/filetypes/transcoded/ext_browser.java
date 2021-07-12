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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_browser implements NeonIcon {
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.80000305175781), new Point2D.Double(36.0, -0.20000000298023224), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 26.575000762939453), new Point2D.Double(58.57500076293945, 13.074999809265137), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.4f, 64.3f);
generalPath.curveTo(28.9f, 63.300003f, 31.5f, 62.600002f, 34.3f, 62.500004f);
generalPath.lineTo(34.3f, 55.200005f);
generalPath.lineTo(24.699999f, 55.200005f);
generalPath.curveTo(24.8f, 58.300003f, 25.4f, 61.400005f, 26.4f, 64.3f);
generalPath.closePath();
generalPath.moveTo(21.099998f, 36.200005f);
generalPath.curveTo(22.199999f, 37.300003f, 23.599998f, 38.300003f, 24.899998f, 39.000004f);
generalPath.curveTo(25.999998f, 36.300003f, 27.599998f, 33.900005f, 29.399998f, 31.600004f);
generalPath.curveTo(26.199997f, 32.600006f, 23.499998f, 34.100006f, 21.099998f, 36.200005f);
generalPath.closePath();
generalPath.moveTo(45.0f, 43.1f);
generalPath.curveTo(42.5f, 44.1f, 39.9f, 44.8f, 37.1f, 44.899998f);
generalPath.lineTo(37.1f, 52.199997f);
generalPath.lineTo(46.699997f, 52.199997f);
generalPath.curveTo(46.6f, 49.1f, 46.1f, 45.999996f, 44.999996f, 43.1f);
generalPath.closePath();
generalPath.moveTo(34.3f, 44.899998f);
generalPath.curveTo(31.5f, 44.699997f, 28.9f, 44.1f, 26.4f, 43.1f);
generalPath.curveTo(25.4f, 46.0f, 24.8f, 49.199997f, 24.699999f, 52.3f);
generalPath.lineTo(34.3f, 52.3f);
generalPath.lineTo(34.3f, 44.899998f);
generalPath.closePath();
generalPath.moveTo(27.5f, 40.399998f);
generalPath.curveTo(29.7f, 41.3f, 32.0f, 41.8f, 34.3f, 41.999996f);
generalPath.lineTo(34.3f, 30.8f);
generalPath.lineTo(34.0f, 30.8f);
generalPath.lineTo(32.8f, 32.1f);
generalPath.curveTo(30.5f, 34.6f, 28.8f, 37.5f, 27.5f, 40.399998f);
generalPath.closePath();
generalPath.moveTo(46.7f, 55.1f);
generalPath.lineTo(37.1f, 55.1f);
generalPath.lineTo(37.1f, 62.399998f);
generalPath.curveTo(39.899998f, 62.6f, 42.5f, 63.199997f, 45.0f, 64.2f);
generalPath.curveTo(46.1f, 61.399998f, 46.6f, 58.299995f, 46.7f, 55.1f);
generalPath.closePath();
generalPath.moveTo(37.1f, 42.0f);
generalPath.curveTo(39.5f, 41.8f, 41.8f, 41.3f, 43.899998f, 40.4f);
generalPath.curveTo(42.6f, 37.4f, 40.8f, 34.600002f, 38.6f, 32.100002f);
generalPath.lineTo(37.6f, 30.900002f);
generalPath.lineTo(37.1f, 30.900002f);
generalPath.lineTo(37.1f, 42.0f);
generalPath.closePath();
generalPath.moveTo(50.399998f, 36.1f);
generalPath.curveTo(48.0f, 34.0f, 45.2f, 32.5f, 42.0f, 31.6f);
generalPath.curveTo(43.8f, 33.9f, 45.3f, 36.3f, 46.5f, 39.0f);
generalPath.curveTo(47.9f, 38.3f, 49.2f, 37.4f, 50.4f, 36.1f);
generalPath.closePath();
generalPath.moveTo(34.3f, 65.4f);
generalPath.curveTo(31.9f, 65.6f, 29.599998f, 66.1f, 27.5f, 67.0f);
generalPath.curveTo(28.8f, 69.9f, 30.6f, 72.8f, 32.7f, 75.3f);
generalPath.lineTo(33.8f, 76.5f);
generalPath.lineTo(34.2f, 76.5f);
generalPath.lineTo(34.3f, 65.4f);
generalPath.closePath();
generalPath.moveTo(21.8f, 52.3f);
generalPath.curveTo(21.9f, 48.7f, 22.699999f, 45.2f, 23.8f, 41.9f);
generalPath.curveTo(22.099998f, 41.0f, 20.599998f, 39.800003f, 19.099998f, 38.4f);
generalPath.lineTo(18.999998f, 38.300003f);
generalPath.curveTo(15.599998f, 42.100002f, 13.299998f, 46.9f, 12.999998f, 52.500004f);
generalPath.lineTo(21.8f, 52.300003f);
generalPath.closePath();
generalPath.moveTo(49.6f, 55.1f);
generalPath.curveTo(49.5f, 58.699997f, 48.699997f, 62.199997f, 47.6f, 65.5f);
generalPath.curveTo(49.3f, 66.4f, 50.8f, 67.6f, 52.3f, 69.0f);
generalPath.lineTo(52.5f, 69.2f);
generalPath.curveTo(55.9f, 65.399994f, 58.2f, 60.6f, 58.5f, 54.999996f);
generalPath.curveTo(58.5f, 55.099995f, 49.6f, 55.099995f, 49.6f, 55.099995f);
generalPath.closePath();
generalPath.moveTo(52.3f, 38.3f);
generalPath.curveTo(50.899998f, 39.6f, 49.3f, 40.899998f, 47.6f, 41.8f);
generalPath.curveTo(48.8f, 45.1f, 49.5f, 48.6f, 49.6f, 52.199997f);
generalPath.lineTo(58.5f, 52.199997f);
generalPath.curveTo(58.2f, 46.799995f, 55.9f, 41.799995f, 52.5f, 37.999996f);
generalPath.lineTo(52.3f, 38.299995f);
generalPath.closePath();
generalPath.moveTo(50.3f, 71.2f);
generalPath.curveTo(49.2f, 70.1f, 47.8f, 69.1f, 46.5f, 68.399994f);
generalPath.curveTo(45.4f, 71.09999f, 43.8f, 73.49999f, 42.0f, 75.799995f);
generalPath.curveTo(45.2f, 74.799995f, 48.1f, 73.299995f, 50.3f, 71.2f);
generalPath.closePath();
generalPath.moveTo(19.099998f, 69.1f);
generalPath.curveTo(20.499998f, 67.799995f, 22.099998f, 66.5f, 23.8f, 65.6f);
generalPath.curveTo(22.599998f, 62.3f, 21.9f, 58.8f, 21.8f, 55.199997f);
generalPath.lineTo(13.0f, 55.199997f);
generalPath.curveTo(13.4f, 60.6f, 15.6f, 65.6f, 19.0f, 69.399994f);
generalPath.lineTo(19.1f, 69.09999f);
generalPath.closePath();
generalPath.moveTo(24.899998f, 68.299995f);
generalPath.curveTo(23.599998f, 69.1f, 22.199997f, 70.1f, 21.099998f, 71.1f);
generalPath.curveTo(23.499998f, 73.2f, 26.3f, 74.7f, 29.499998f, 75.6f);
generalPath.curveTo(27.599998f, 73.5f, 25.999998f, 71.0f, 24.899998f, 68.299995f);
generalPath.closePath();
generalPath.moveTo(44.0f, 67.0f);
generalPath.curveTo(41.8f, 66.1f, 39.5f, 65.6f, 37.2f, 65.4f);
generalPath.lineTo(37.2f, 76.6f);
generalPath.lineTo(37.600002f, 76.6f);
generalPath.lineTo(38.800003f, 75.299995f);
generalPath.curveTo(40.9f, 72.799995f, 42.700005f, 69.899994f, 44.000004f, 66.99999f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.72200012207031, 76.58999633789062), new Point2D.Double(35.72200012207031, 30.809999465942383), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
		return 0.9980000257492065;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_browser() {
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
       ext_browser base = new ext_browser();
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
       ext_browser base = new ext_browser();
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
        return ext_browser::new;
    }
}

