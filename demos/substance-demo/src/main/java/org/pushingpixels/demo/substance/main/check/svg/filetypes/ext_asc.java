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
public class ext_asc implements NeonIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 127.80000305175781), new Point2D.Double(36.0, 29.799999237060547), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -29.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 56.57500076293945), new Point2D.Double(58.57500076293945, 43.07500076293945), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -29.0f));
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
generalPath.moveTo(27.3f, 89.8f);
generalPath.lineTo(22.9f, 89.8f);
generalPath.lineTo(21.1f, 85.200005f);
generalPath.lineTo(13.1f, 85.200005f);
generalPath.lineTo(11.400001f, 89.8f);
generalPath.lineTo(7.2f, 89.8f);
generalPath.lineTo(15.0f, 69.8f);
generalPath.lineTo(19.3f, 69.8f);
generalPath.lineTo(27.3f, 89.8f);
generalPath.closePath();
generalPath.moveTo(19.8f, 81.9f);
generalPath.lineTo(17.0f, 74.5f);
generalPath.lineTo(14.3f, 81.9f);
generalPath.lineTo(19.8f, 81.9f);
generalPath.closePath();
generalPath.moveTo(28.4f, 83.3f);
generalPath.lineTo(32.3f, 82.9f);
generalPath.curveTo(32.5f, 84.200005f, 33.0f, 85.200005f, 33.7f, 85.8f);
generalPath.curveTo(34.4f, 86.4f, 35.4f, 86.700005f, 36.600002f, 86.700005f);
generalPath.curveTo(37.9f, 86.700005f, 38.9f, 86.4f, 39.500004f, 85.9f);
generalPath.curveTo(40.100006f, 85.4f, 40.500004f, 84.700005f, 40.500004f, 84.0f);
generalPath.curveTo(40.500004f, 83.5f, 40.400005f, 83.1f, 40.100002f, 82.8f);
generalPath.curveTo(39.8f, 82.50001f, 39.300003f, 82.200005f, 38.600002f, 81.9f);
generalPath.curveTo(38.100002f, 81.700005f, 37.000004f, 81.4f, 35.4f, 81.0f);
generalPath.curveTo(33.2f, 80.5f, 31.7f, 79.8f, 30.800001f, 79.0f);
generalPath.curveTo(29.6f, 77.9f, 29.000002f, 76.6f, 29.000002f, 75.0f);
generalPath.curveTo(29.000002f, 74.0f, 29.300001f, 73.0f, 29.900002f, 72.1f);
generalPath.curveTo(30.500002f, 71.2f, 31.300001f, 70.5f, 32.4f, 70.1f);
generalPath.curveTo(33.5f, 69.6f, 34.800003f, 69.4f, 36.300003f, 69.4f);
generalPath.curveTo(38.800003f, 69.4f, 40.700005f, 70.0f, 42.000004f, 71.1f);
generalPath.curveTo(43.300003f, 72.2f, 43.900005f, 73.7f, 44.000004f, 75.5f);
generalPath.lineTo(40.000004f, 75.7f);
generalPath.curveTo(39.800003f, 74.7f, 39.500004f, 73.899994f, 38.900005f, 73.5f);
generalPath.curveTo(38.300007f, 73.100006f, 37.500004f, 72.8f, 36.300007f, 72.8f);
generalPath.curveTo(35.100006f, 72.8f, 34.20001f, 73.0f, 33.500008f, 73.5f);
generalPath.curveTo(33.100006f, 73.8f, 32.90001f, 74.2f, 32.90001f, 74.7f);
generalPath.curveTo(32.90001f, 75.2f, 33.10001f, 75.6f, 33.500008f, 75.899994f);
generalPath.curveTo(34.000008f, 76.299995f, 35.300007f, 76.799995f, 37.20001f, 77.2f);
generalPath.curveTo(39.20001f, 77.7f, 40.60001f, 78.1f, 41.60001f, 78.6f);
generalPath.curveTo(42.60001f, 79.1f, 43.30001f, 79.799995f, 43.80001f, 80.6f);
generalPath.curveTo(44.30001f, 81.4f, 44.60001f, 82.5f, 44.60001f, 83.799995f);
generalPath.curveTo(44.60001f, 84.899994f, 44.30001f, 85.99999f, 43.60001f, 86.99999f);
generalPath.curveTo(42.90001f, 87.99999f, 42.10001f, 88.69999f, 40.90001f, 89.19999f);
generalPath.curveTo(39.70001f, 89.69999f, 38.30001f, 89.89999f, 36.500008f, 89.89999f);
generalPath.curveTo(34.000008f, 89.89999f, 32.000008f, 89.29999f, 30.700008f, 88.09998f);
generalPath.curveTo(29.500008f, 87.19998f, 28.700008f, 85.499985f, 28.40001f, 83.29998f);
generalPath.closePath();
generalPath.moveTo(60.9f, 82.4f);
generalPath.lineTo(64.8f, 83.6f);
generalPath.curveTo(64.200005f, 85.799995f, 63.200005f, 87.4f, 61.800003f, 88.5f);
generalPath.curveTo(60.4f, 89.6f, 58.600002f, 90.1f, 56.500004f, 90.1f);
generalPath.curveTo(53.800003f, 90.1f, 51.700005f, 89.2f, 49.900005f, 87.4f);
generalPath.curveTo(48.100006f, 85.600006f, 47.300007f, 83.1f, 47.300007f, 79.9f);
generalPath.curveTo(47.300007f, 76.6f, 48.20001f, 74.0f, 49.900005f, 72.1f);
generalPath.curveTo(51.600002f, 70.2f, 53.900005f, 69.299995f, 56.700005f, 69.299995f);
generalPath.curveTo(59.200005f, 69.299995f, 61.100006f, 69.99999f, 62.700005f, 71.49999f);
generalPath.curveTo(63.600006f, 72.399994f, 64.3f, 73.59999f, 64.8f, 75.19999f);
generalPath.lineTo(60.800003f, 76.19999f);
generalPath.curveTo(60.600002f, 75.19999f, 60.100002f, 74.29999f, 59.300003f, 73.69999f);
generalPath.curveTo(58.500004f, 73.09999f, 57.600002f, 72.79999f, 56.600002f, 72.79999f);
generalPath.curveTo(55.100002f, 72.79999f, 53.9f, 73.29999f, 53.000004f, 74.39999f);
generalPath.curveTo(52.100006f, 75.499985f, 51.600002f, 77.19999f, 51.600002f, 79.59998f);
generalPath.curveTo(51.600002f, 82.09998f, 52.100002f, 83.89999f, 53.000004f, 84.999985f);
generalPath.curveTo(53.900005f, 86.09998f, 55.100002f, 86.59998f, 56.600002f, 86.59998f);
generalPath.curveTo(57.7f, 86.59998f, 58.600002f, 86.29998f, 59.4f, 85.59998f);
generalPath.curveTo(60.2f, 84.89999f, 60.600002f, 83.89999f, 60.9f, 82.39999f);
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
	private ext_asc() {
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
       ext_asc base = new ext_asc();
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
       ext_asc base = new ext_asc();
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
        return ext_asc::new;
    }
}

