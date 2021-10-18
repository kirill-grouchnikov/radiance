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
public class ext_ps implements RadianceIcon {
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
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0), new Point2D.Double(36.0, 3.003999948501587), new float[] {0.0f,0.211f,0.37f,0.512f,0.645f,0.77f,0.889f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(248, 176, 184, 255)) : new Color(248, 176, 184, 255)),((colorFilter != null) ? colorFilter.filter(new Color(246, 172, 181, 255)) : new Color(246, 172, 181, 255)),((colorFilter != null) ? colorFilter.filter(new Color(242, 163, 173, 255)) : new Color(242, 163, 173, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 149, 161, 255)) : new Color(237, 149, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(231, 130, 146, 255)) : new Color(231, 130, 146, 255)),((colorFilter != null) ? colorFilter.filter(new Color(224, 105, 128, 255)) : new Color(224, 105, 128, 255)),((colorFilter != null) ? colorFilter.filter(new Color(215, 72, 107, 255)) : new Color(215, 72, 107, 255)),((colorFilter != null) ? colorFilter.filter(new Color(206, 7, 87, 255)) : new Color(206, 7, 87, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(212, 28, 92, 255)) : new Color(212, 28, 92, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
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
generalPath.moveTo(20.0f, 91.1f);
generalPath.lineTo(20.0f, 71.2f);
generalPath.lineTo(26.5f, 71.2f);
generalPath.curveTo(29.0f, 71.2f, 30.6f, 71.299995f, 31.3f, 71.5f);
generalPath.curveTo(32.5f, 71.8f, 33.399998f, 72.4f, 34.2f, 73.4f);
generalPath.curveTo(35.0f, 74.4f, 35.4f, 75.700005f, 35.4f, 77.3f);
generalPath.curveTo(35.4f, 78.5f, 35.2f, 79.5f, 34.7f, 80.4f);
generalPath.curveTo(34.2f, 81.3f, 33.7f, 81.9f, 33.0f, 82.4f);
generalPath.curveTo(32.3f, 82.9f, 31.6f, 83.200005f, 30.9f, 83.3f);
generalPath.curveTo(29.9f, 83.5f, 28.5f, 83.600006f, 26.7f, 83.600006f);
generalPath.lineTo(24.0f, 83.600006f);
generalPath.lineTo(24.0f, 91.100006f);
generalPath.lineTo(20.0f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(24.1f, 74.6f);
generalPath.lineTo(24.1f, 80.2f);
generalPath.lineTo(26.300001f, 80.2f);
generalPath.curveTo(27.900002f, 80.2f, 29.000002f, 80.1f, 29.500002f, 79.899994f);
generalPath.curveTo(30.000002f, 79.7f, 30.500002f, 79.399994f, 30.800001f, 78.899994f);
generalPath.curveTo(31.1f, 78.49999f, 31.300001f, 77.899994f, 31.300001f, 77.399994f);
generalPath.curveTo(31.300001f, 76.7f, 31.1f, 76.09999f, 30.7f, 75.59999f);
generalPath.curveTo(30.300001f, 75.09999f, 29.7f, 74.79999f, 29.1f, 74.69999f);
generalPath.curveTo(28.6f, 74.59999f, 27.6f, 74.59999f, 26.2f, 74.59999f);
generalPath.lineTo(24.1f, 74.59999f);
generalPath.closePath();
generalPath.moveTo(37.8f, 84.6f);
generalPath.lineTo(41.8f, 84.2f);
generalPath.curveTo(42.0f, 85.5f, 42.5f, 86.5f, 43.3f, 87.1f);
generalPath.curveTo(44.0f, 87.7f, 45.0f, 88.0f, 46.3f, 88.0f);
generalPath.curveTo(47.6f, 88.0f, 48.6f, 87.7f, 49.3f, 87.2f);
generalPath.curveTo(50.0f, 86.7f, 50.3f, 86.0f, 50.3f, 85.299995f);
generalPath.curveTo(50.3f, 84.799995f, 50.2f, 84.399994f, 49.899998f, 84.1f);
generalPath.curveTo(49.6f, 83.799995f, 49.1f, 83.5f, 48.399998f, 83.2f);
generalPath.curveTo(47.899998f, 83.0f, 46.8f, 82.7f, 45.1f, 82.299995f);
generalPath.curveTo(42.899998f, 81.799995f, 41.399998f, 81.1f, 40.5f, 80.299995f);
generalPath.curveTo(39.3f, 79.2f, 38.6f, 77.899994f, 38.6f, 76.299995f);
generalPath.curveTo(38.6f, 75.299995f, 38.899998f, 74.299995f, 39.5f, 73.49999f);
generalPath.curveTo(40.1f, 72.59999f, 40.9f, 71.99999f, 42.0f, 71.49999f);
generalPath.curveTo(43.1f, 70.99999f, 44.4f, 70.799995f, 46.0f, 70.799995f);
generalPath.curveTo(48.5f, 70.799995f, 50.4f, 71.299995f, 51.7f, 72.399994f);
generalPath.curveTo(53.0f, 73.49999f, 53.7f, 74.899994f, 53.7f, 76.799995f);
generalPath.lineTo(49.600002f, 76.99999f);
generalPath.curveTo(49.4f, 75.99999f, 49.100002f, 75.19999f, 48.500004f, 74.799995f);
generalPath.curveTo(47.900005f, 74.399994f, 47.100002f, 74.1f, 45.900005f, 74.1f);
generalPath.curveTo(44.700005f, 74.1f, 43.800007f, 74.299995f, 43.100006f, 74.799995f);
generalPath.curveTo(42.700005f, 75.1f, 42.500008f, 75.49999f, 42.500008f, 75.99999f);
generalPath.curveTo(42.500008f, 76.49999f, 42.70001f, 76.899994f, 43.100006f, 77.19999f);
generalPath.curveTo(43.600006f, 77.59999f, 44.900005f, 78.09999f, 46.800007f, 78.49999f);
generalPath.curveTo(48.70001f, 78.899994f, 50.20001f, 79.399994f, 51.20001f, 79.899994f);
generalPath.curveTo(52.10001f, 80.399994f, 52.90001f, 81.09999f, 53.40001f, 81.899994f);
generalPath.curveTo(53.90001f, 82.799995f, 54.20001f, 83.799995f, 54.20001f, 85.09999f);
generalPath.curveTo(54.20001f, 86.19999f, 53.90001f, 87.29999f, 53.20001f, 88.29999f);
generalPath.curveTo(52.60001f, 89.29999f, 51.60001f, 89.999985f, 50.500008f, 90.499985f);
generalPath.curveTo(49.400005f, 90.999985f, 47.90001f, 91.19998f, 46.100006f, 91.19998f);
generalPath.curveTo(43.500008f, 91.19998f, 41.600006f, 90.59998f, 40.200005f, 89.499985f);
generalPath.curveTo(38.900005f, 88.499985f, 38.000004f, 86.79999f, 37.800003f, 84.59998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.73f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.0f, 62.3f);
generalPath.lineTo(17.4f, 59.0f);
generalPath.curveTo(17.4f, 59.0f, 25.099998f, 43.8f, 22.099998f, 38.2f);
generalPath.lineTo(38.399998f, 25.6f);
generalPath.curveTo(38.399998f, 25.6f, 44.6f, 26.6f, 47.699997f, 32.1f);
generalPath.lineTo(40.699997f, 51.199997f);
generalPath.curveTo(34.3f, 50.3f, 22.0f, 62.3f, 22.0f, 62.3f);
generalPath.closePath();
generalPath.moveTo(33.1f, 42.5f);
generalPath.curveTo(34.399998f, 43.4f, 36.1f, 43.1f, 37.0f, 41.9f);
generalPath.curveTo(37.9f, 40.600002f, 37.6f, 38.9f, 36.4f, 38.0f);
generalPath.curveTo(35.100002f, 37.1f, 33.4f, 37.4f, 32.5f, 38.6f);
generalPath.curveTo(31.5f, 39.8f, 31.8f, 41.6f, 33.1f, 42.5f);
generalPath.closePath();
generalPath.moveTo(33.1f, 42.5f);
generalPath.lineTo(19.8f, 60.6f);
generalPath.moveTo(59.1f, 26.199997f);
generalPath.curveTo(52.899998f, 14.399997f, 39.5f, 12.199997f, 39.5f, 12.199997f);
generalPath.lineTo(33.5f, 20.399998f);
generalPath.curveTo(46.9f, 22.599998f, 53.1f, 34.399998f, 53.1f, 34.399998f);
generalPath.lineTo(59.1f, 26.199997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(1729.68896484375, -415.95599365234375), new Point2D.Double(1753.864013671875, -415.95599365234375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(238, 40, 104, 255)) : new Color(238, 40, 104, 255)),((colorFilter != null) ? colorFilter.filter(new Color(188, 2, 79, 255)) : new Color(188, 2, 79, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-0.8102462627304787f, -0.5860895782483186f, -0.5860895782483186f, 0.8102462627304787f, 1202.6828163388243f, 1396.7453704594668f));
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
generalPath.moveTo(19.9f, 60.8f);
generalPath.lineTo(33.3f, 42.6f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(248, 182, 187, 255)) : new Color(248, 182, 187, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.9f, 60.8f);
generalPath.lineTo(33.3f, 42.6f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.178001403808594, 74.15899658203125), new Point2D.Double(58.77199935913086, 87.75299835205078), new float[] {0.0f,0.265f,0.402f,0.51f,0.604f,0.687f,0.763f,0.834f,0.901f,0.962f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 238, 255)) : new Color(255, 254, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 250, 236, 255)) : new Color(255, 250, 236, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 242, 230, 255)) : new Color(254, 242, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 231, 220, 255)) : new Color(252, 231, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 215, 207, 255)) : new Color(250, 215, 207, 255)),((colorFilter != null) ? colorFilter.filter(new Color(246, 195, 191, 255)) : new Color(246, 195, 191, 255)),((colorFilter != null) ? colorFilter.filter(new Color(242, 171, 172, 255)) : new Color(242, 171, 172, 255)),((colorFilter != null) ? colorFilter.filter(new Color(238, 143, 151, 255)) : new Color(238, 143, 151, 255)),((colorFilter != null) ? colorFilter.filter(new Color(234, 111, 130, 255)) : new Color(234, 111, 130, 255)),((colorFilter != null) ? colorFilter.filter(new Color(229, 68, 109, 255)) : new Color(229, 68, 109, 255)),((colorFilter != null) ? colorFilter.filter(new Color(227, 14, 96, 255)) : new Color(227, 14, 96, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(212, 28, 92, 255)) : new Color(212, 28, 92, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
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
        return 0.12799999117851257;
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
		return 0.7450000047683716;
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
	private ext_ps() {
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
       ext_ps base = new ext_ps();
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
       ext_ps base = new ext_ps();
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
        return ext_ps::new;
    }
}

