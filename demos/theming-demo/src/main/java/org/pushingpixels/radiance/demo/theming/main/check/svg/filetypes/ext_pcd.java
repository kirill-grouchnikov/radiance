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
public class ext_pcd implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 127.80000305175781), new Point2D.Double(36.0, 29.799999237060547), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -29.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 56.57500076293945), new Point2D.Double(58.57500076293945, 43.07500076293945), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -29.0f));
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
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.3f, 89.8f);
generalPath.lineTo(9.3f, 69.8f);
generalPath.lineTo(15.8f, 69.8f);
generalPath.curveTo(18.3f, 69.8f, 19.9f, 69.9f, 20.6f, 70.100006f);
generalPath.curveTo(21.7f, 70.40001f, 22.7f, 71.100006f, 23.5f, 72.100006f);
generalPath.curveTo(24.3f, 73.100006f, 24.7f, 74.40001f, 24.7f, 76.00001f);
generalPath.curveTo(24.7f, 77.200005f, 24.5f, 78.30001f, 24.0f, 79.100006f);
generalPath.curveTo(23.6f, 79.90001f, 23.0f, 80.600006f, 22.3f, 81.100006f);
generalPath.curveTo(21.599998f, 81.600006f, 20.9f, 81.90001f, 20.199999f, 82.100006f);
generalPath.curveTo(19.199999f, 82.3f, 17.8f, 82.40001f, 15.999999f, 82.40001f);
generalPath.lineTo(13.4f, 82.40001f);
generalPath.lineTo(13.4f, 90.0f);
generalPath.lineTo(9.3f, 90.0f);
generalPath.closePath();
generalPath.moveTo(13.4f, 73.100006f);
generalPath.lineTo(13.4f, 78.8f);
generalPath.lineTo(15.599999f, 78.8f);
generalPath.curveTo(17.199999f, 78.8f, 18.3f, 78.700005f, 18.8f, 78.5f);
generalPath.curveTo(19.3f, 78.3f, 19.8f, 78.0f, 20.099998f, 77.5f);
generalPath.curveTo(20.399998f, 77.1f, 20.599998f, 76.5f, 20.599998f, 75.9f);
generalPath.curveTo(20.599998f, 75.200005f, 20.399998f, 74.6f, 19.999998f, 74.1f);
generalPath.curveTo(19.599998f, 73.6f, 18.999998f, 73.299995f, 18.399998f, 73.2f);
generalPath.curveTo(17.899998f, 73.1f, 16.899998f, 73.1f, 15.499998f, 73.1f);
generalPath.lineTo(13.399998f, 73.1f);
generalPath.closePath();
generalPath.moveTo(40.8f, 82.40001f);
generalPath.lineTo(44.7f, 83.600006f);
generalPath.curveTo(44.100002f, 85.8f, 43.100002f, 87.40001f, 41.7f, 88.50001f);
generalPath.curveTo(40.3f, 89.600006f, 38.5f, 90.100006f, 36.4f, 90.100006f);
generalPath.curveTo(33.7f, 90.100006f, 31.600002f, 89.200005f, 29.800001f, 87.40001f);
generalPath.curveTo(28.1f, 85.600006f, 27.2f, 83.100006f, 27.2f, 79.90001f);
generalPath.curveTo(27.2f, 76.600006f, 28.1f, 74.00001f, 29.800001f, 72.100006f);
generalPath.curveTo(31.500002f, 70.200005f, 33.800003f, 69.3f, 36.600002f, 69.3f);
generalPath.curveTo(39.100002f, 69.3f, 41.000004f, 70.0f, 42.600002f, 71.5f);
generalPath.curveTo(43.500004f, 72.4f, 44.2f, 73.6f, 44.7f, 75.2f);
generalPath.lineTo(40.7f, 76.2f);
generalPath.curveTo(40.5f, 75.2f, 40.0f, 74.299995f, 39.2f, 73.7f);
generalPath.curveTo(38.4f, 73.1f, 37.5f, 72.799995f, 36.5f, 72.799995f);
generalPath.curveTo(35.0f, 72.799995f, 33.8f, 73.299995f, 32.9f, 74.399994f);
generalPath.curveTo(32.0f, 75.49999f, 31.500002f, 77.2f, 31.500002f, 79.59999f);
generalPath.curveTo(31.500002f, 82.09999f, 32.0f, 83.899994f, 32.9f, 84.99999f);
generalPath.curveTo(33.800003f, 86.09999f, 35.0f, 86.59999f, 36.5f, 86.59999f);
generalPath.curveTo(37.6f, 86.59999f, 38.5f, 86.29999f, 39.3f, 85.59999f);
generalPath.curveTo(40.1f, 84.899994f, 40.5f, 83.899994f, 40.8f, 82.399994f);
generalPath.closePath();
generalPath.moveTo(48.2f, 69.80001f);
generalPath.lineTo(55.600002f, 69.80001f);
generalPath.curveTo(57.300003f, 69.80001f, 58.500004f, 69.90001f, 59.4f, 70.20001f);
generalPath.curveTo(60.600002f, 70.500015f, 61.600002f, 71.20001f, 62.4f, 72.000015f);
generalPath.curveTo(63.2f, 72.80002f, 63.9f, 74.000015f, 64.3f, 75.20001f);
generalPath.curveTo(64.700005f, 76.40001f, 65.0f, 78.10001f, 65.0f, 80.000015f);
generalPath.curveTo(65.0f, 81.60001f, 64.8f, 83.10001f, 64.4f, 84.30002f);
generalPath.curveTo(63.9f, 85.80002f, 63.2f, 86.90002f, 62.300003f, 87.80002f);
generalPath.curveTo(61.600002f, 88.500015f, 60.700005f, 89.000015f, 59.500004f, 89.40002f);
generalPath.curveTo(58.600002f, 89.70002f, 57.400005f, 89.80002f, 55.900005f, 89.80002f);
generalPath.lineTo(48.300007f, 89.80002f);
generalPath.lineTo(48.300007f, 69.80002f);
generalPath.closePath();
generalPath.moveTo(52.2f, 73.10001f);
generalPath.lineTo(52.2f, 86.40002f);
generalPath.lineTo(55.2f, 86.40002f);
generalPath.curveTo(56.3f, 86.40002f, 57.100002f, 86.30002f, 57.600002f, 86.20002f);
generalPath.curveTo(58.300003f, 86.00002f, 58.800003f, 85.80002f, 59.2f, 85.40002f);
generalPath.curveTo(59.6f, 85.000015f, 60.0f, 84.40002f, 60.3f, 83.500015f);
generalPath.curveTo(60.6f, 82.60001f, 60.7f, 81.40002f, 60.7f, 79.80002f);
generalPath.curveTo(60.7f, 78.20002f, 60.600002f, 77.10002f, 60.3f, 76.20002f);
generalPath.curveTo(59.999996f, 75.30002f, 59.6f, 74.70002f, 59.2f, 74.30002f);
generalPath.curveTo(58.800003f, 73.90002f, 58.100002f, 73.500015f, 57.3f, 73.40002f);
generalPath.curveTo(56.7f, 73.30002f, 55.6f, 73.20002f, 54.0f, 73.20002f);
generalPath.lineTo(52.2f, 73.20002f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
	private ext_pcd() {
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
       ext_pcd base = new ext_pcd();
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
       ext_pcd base = new ext_pcd();
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
        return ext_pcd::new;
    }
}

