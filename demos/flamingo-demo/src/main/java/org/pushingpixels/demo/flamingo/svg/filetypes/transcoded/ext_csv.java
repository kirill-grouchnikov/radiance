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
public class ext_csv implements NeonIcon {
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
generalPath.moveTo(21.6f, 83.8f);
generalPath.lineTo(25.5f, 85.0f);
generalPath.curveTo(24.9f, 87.2f, 23.9f, 88.8f, 22.5f, 89.8f);
generalPath.curveTo(21.1f, 90.9f, 19.3f, 91.4f, 17.2f, 91.4f);
generalPath.curveTo(14.500001f, 91.4f, 12.400001f, 90.5f, 10.700001f, 88.700005f);
generalPath.curveTo(9.000001f, 86.90001f, 8.1f, 84.4f, 8.1f, 81.3f);
generalPath.curveTo(8.1f, 78.0f, 9.0f, 75.4f, 10.700001f, 73.600006f);
generalPath.curveTo(12.400002f, 71.80001f, 14.700001f, 70.90001f, 17.5f, 70.90001f);
generalPath.curveTo(19.9f, 70.90001f, 21.9f, 71.600006f, 23.5f, 73.100006f);
generalPath.curveTo(24.4f, 73.90001f, 25.1f, 75.200005f, 25.5f, 76.8f);
generalPath.lineTo(21.5f, 77.700005f);
generalPath.curveTo(21.3f, 76.700005f, 20.8f, 75.9f, 20.0f, 75.3f);
generalPath.curveTo(19.3f, 74.700005f, 18.3f, 74.4f, 17.3f, 74.4f);
generalPath.curveTo(15.799999f, 74.4f, 14.599999f, 74.9f, 13.699999f, 76.0f);
generalPath.curveTo(12.799998f, 77.1f, 12.299999f, 78.8f, 12.299999f, 81.1f);
generalPath.curveTo(12.299999f, 83.6f, 12.799999f, 85.4f, 13.699999f, 86.5f);
generalPath.curveTo(14.599998f, 87.6f, 15.799999f, 88.1f, 17.199999f, 88.1f);
generalPath.curveTo(18.3f, 88.1f, 19.199999f, 87.799995f, 19.999998f, 87.1f);
generalPath.curveTo(20.799997f, 86.4f, 21.299997f, 85.2f, 21.599998f, 83.799995f);
generalPath.closePath();
generalPath.moveTo(28.0f, 84.600006f);
generalPath.lineTo(31.9f, 84.200005f);
generalPath.curveTo(32.1f, 85.50001f, 32.6f, 86.50001f, 33.3f, 87.100006f);
generalPath.curveTo(34.0f, 87.700005f, 35.0f, 88.00001f, 36.2f, 88.00001f);
generalPath.curveTo(37.5f, 88.00001f, 38.5f, 87.700005f, 39.100002f, 87.200005f);
generalPath.curveTo(39.800003f, 86.700005f, 40.100002f, 86.00001f, 40.100002f, 85.3f);
generalPath.curveTo(40.100002f, 84.8f, 40.000004f, 84.4f, 39.7f, 84.100006f);
generalPath.curveTo(39.4f, 83.8f, 38.9f, 83.50001f, 38.2f, 83.200005f);
generalPath.curveTo(37.7f, 83.00001f, 36.7f, 82.700005f, 35.0f, 82.3f);
generalPath.curveTo(32.8f, 81.8f, 31.3f, 81.100006f, 30.4f, 80.3f);
generalPath.curveTo(29.199999f, 79.200005f, 28.6f, 77.9f, 28.6f, 76.3f);
generalPath.curveTo(28.6f, 75.3f, 28.9f, 74.3f, 29.5f, 73.5f);
generalPath.curveTo(30.1f, 72.6f, 30.9f, 72.0f, 32.0f, 71.5f);
generalPath.curveTo(33.1f, 71.0f, 34.4f, 70.8f, 35.9f, 70.8f);
generalPath.curveTo(38.4f, 70.8f, 40.300003f, 71.3f, 41.600002f, 72.4f);
generalPath.curveTo(42.9f, 73.5f, 43.500004f, 74.9f, 43.600002f, 76.8f);
generalPath.lineTo(39.600002f, 77.0f);
generalPath.curveTo(39.4f, 76.0f, 39.100002f, 75.2f, 38.500004f, 74.8f);
generalPath.curveTo(37.900005f, 74.4f, 37.100002f, 74.100006f, 35.900005f, 74.100006f);
generalPath.curveTo(34.700005f, 74.100006f, 33.800007f, 74.3f, 33.100006f, 74.8f);
generalPath.curveTo(32.700005f, 75.100006f, 32.500008f, 75.5f, 32.500008f, 76.0f);
generalPath.curveTo(32.500008f, 76.5f, 32.70001f, 76.9f, 33.100006f, 77.2f);
generalPath.curveTo(33.600006f, 77.6f, 34.800007f, 78.1f, 36.800007f, 78.5f);
generalPath.curveTo(38.800007f, 78.9f, 40.20001f, 79.4f, 41.20001f, 79.9f);
generalPath.curveTo(42.10001f, 80.4f, 42.90001f, 81.1f, 43.40001f, 81.9f);
generalPath.curveTo(43.90001f, 82.700005f, 44.20001f, 83.8f, 44.20001f, 85.1f);
generalPath.curveTo(44.20001f, 86.2f, 43.90001f, 87.299995f, 43.20001f, 88.299995f);
generalPath.curveTo(42.60001f, 89.299995f, 41.70001f, 89.99999f, 40.500008f, 90.49999f);
generalPath.curveTo(39.300007f, 90.99999f, 37.90001f, 91.19999f, 36.20001f, 91.19999f);
generalPath.curveTo(33.70001f, 91.19999f, 31.700008f, 90.59999f, 30.40001f, 89.49999f);
generalPath.curveTo(29.00001f, 88.49999f, 28.200008f, 86.799995f, 28.00001f, 84.59999f);
generalPath.closePath();
generalPath.moveTo(52.7f, 91.100006f);
generalPath.lineTo(45.600002f, 71.3f);
generalPath.lineTo(50.0f, 71.3f);
generalPath.lineTo(55.0f, 85.9f);
generalPath.lineTo(59.9f, 71.200005f);
generalPath.lineTo(64.200005f, 71.200005f);
generalPath.lineTo(57.0f, 91.1f);
generalPath.lineTo(52.7f, 91.1f);
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
	private ext_csv() {
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
    public static NeonIcon of(int width, int height) {
       ext_csv base = new ext_csv();
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
       ext_csv base = new ext_csv();
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
        return ext_csv::new;
    }
}

