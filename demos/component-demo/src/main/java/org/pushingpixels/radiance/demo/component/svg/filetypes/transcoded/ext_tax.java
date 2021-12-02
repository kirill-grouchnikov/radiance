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
public class ext_tax implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.265000104904175), new Point2D.Double(36.0, 100.25), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.2f, 20.9f);
generalPath.curveTo(25.900002f, 20.9f, 23.1f, 23.6f, 23.1f, 27.0f);
generalPath.curveTo(23.1f, 30.4f, 25.800001f, 33.1f, 29.2f, 33.1f);
generalPath.curveTo(30.2f, 33.1f, 31.2f, 32.8f, 32.100002f, 32.3f);
generalPath.lineTo(34.600002f, 34.8f);
generalPath.lineTo(27.600002f, 41.8f);
generalPath.curveTo(26.400002f, 43.0f, 26.400002f, 44.899998f, 27.600002f, 46.1f);
generalPath.lineTo(27.900002f, 46.399998f);
generalPath.lineTo(42.0f, 32.3f);
generalPath.curveTo(42.9f, 32.8f, 43.8f, 33.1f, 44.9f, 33.1f);
generalPath.curveTo(48.2f, 33.1f, 51.0f, 30.399998f, 51.0f, 26.999998f);
generalPath.curveTo(51.0f, 23.599998f, 48.3f, 20.899998f, 44.9f, 20.899998f);
generalPath.curveTo(41.600002f, 20.899998f, 38.800003f, 23.599998f, 38.800003f, 26.999998f);
generalPath.curveTo(38.800003f, 27.999998f, 39.100002f, 28.999998f, 39.600002f, 29.899998f);
generalPath.lineTo(37.0f, 32.3f);
generalPath.lineTo(34.5f, 29.8f);
generalPath.curveTo(35.0f, 28.9f, 35.3f, 28.0f, 35.3f, 26.9f);
generalPath.curveTo(35.3f, 23.6f, 32.5f, 20.9f, 29.199999f, 20.9f);
generalPath.closePath();
generalPath.moveTo(29.2f, 24.3f);
generalPath.curveTo(30.7f, 24.3f, 31.800001f, 25.4f, 31.800001f, 26.9f);
generalPath.curveTo(31.800001f, 28.4f, 30.7f, 29.5f, 29.2f, 29.5f);
generalPath.curveTo(27.7f, 29.5f, 26.6f, 28.4f, 26.6f, 26.9f);
generalPath.curveTo(26.6f, 25.4f, 27.800001f, 24.3f, 29.2f, 24.3f);
generalPath.closePath();
generalPath.moveTo(44.800003f, 24.3f);
generalPath.curveTo(46.300003f, 24.3f, 47.4f, 25.4f, 47.4f, 26.9f);
generalPath.curveTo(47.4f, 28.4f, 46.300003f, 29.5f, 44.800003f, 29.5f);
generalPath.curveTo(43.300003f, 29.5f, 42.200005f, 28.4f, 42.200005f, 26.9f);
generalPath.curveTo(42.200005f, 25.4f, 43.300003f, 24.3f, 44.800003f, 24.3f);
generalPath.closePath();
generalPath.moveTo(18.0f, 36.4f);
generalPath.curveTo(17.8f, 36.4f, 17.5f, 36.4f, 17.3f, 36.5f);
generalPath.curveTo(17.099998f, 36.5f, 16.9f, 36.6f, 16.699999f, 36.7f);
generalPath.lineTo(16.099998f, 37.0f);
generalPath.curveTo(15.899999f, 37.1f, 15.799998f, 37.3f, 15.599998f, 37.4f);
generalPath.curveTo(15.499998f, 37.5f, 15.299998f, 37.7f, 15.199999f, 37.9f);
generalPath.curveTo(15.099998f, 38.100002f, 14.999999f, 38.300003f, 14.899999f, 38.4f);
generalPath.lineTo(14.899999f, 38.5f);
generalPath.curveTo(14.799998f, 38.7f, 14.799998f, 38.9f, 14.699999f, 39.1f);
generalPath.lineTo(14.699999f, 39.199997f);
generalPath.curveTo(14.699999f, 39.399998f, 14.599998f, 39.6f, 14.599998f, 39.899998f);
generalPath.lineTo(14.599998f, 60.699997f);
generalPath.curveTo(14.599998f, 60.899998f, 14.599998f, 61.199997f, 14.699999f, 61.399998f);
generalPath.curveTo(14.699999f, 61.6f, 14.799999f, 61.8f, 14.899999f, 61.999996f);
generalPath.lineTo(15.199999f, 62.599995f);
generalPath.curveTo(15.299999f, 62.799995f, 15.499999f, 62.899994f, 15.599998f, 63.099995f);
generalPath.curveTo(15.699999f, 63.199993f, 15.899999f, 63.399994f, 16.099998f, 63.499996f);
generalPath.curveTo(16.3f, 63.599995f, 16.499998f, 63.699997f, 16.599998f, 63.799995f);
generalPath.lineTo(16.699999f, 63.799995f);
generalPath.curveTo(16.9f, 63.899994f, 17.099998f, 63.899994f, 17.3f, 63.999996f);
generalPath.lineTo(17.4f, 63.999996f);
generalPath.curveTo(17.6f, 63.999996f, 17.8f, 64.1f, 18.1f, 64.1f);
generalPath.lineTo(56.0f, 64.1f);
generalPath.curveTo(56.2f, 64.1f, 56.5f, 64.1f, 56.7f, 64.0f);
generalPath.curveTo(56.9f, 64.0f, 57.100002f, 63.9f, 57.3f, 63.8f);
generalPath.lineTo(57.899998f, 63.5f);
generalPath.curveTo(58.1f, 63.4f, 58.199997f, 63.2f, 58.399998f, 63.1f);
generalPath.curveTo(58.499996f, 63.0f, 58.699997f, 62.8f, 58.8f, 62.6f);
generalPath.curveTo(58.899998f, 62.399998f, 59.0f, 62.199997f, 59.1f, 62.1f);
generalPath.lineTo(59.1f, 62.0f);
generalPath.curveTo(59.199997f, 61.8f, 59.199997f, 61.6f, 59.3f, 61.4f);
generalPath.lineTo(59.3f, 61.300003f);
generalPath.curveTo(59.3f, 61.100002f, 59.399998f, 60.9f, 59.399998f, 60.600002f);
generalPath.lineTo(59.399998f, 39.9f);
generalPath.curveTo(59.399998f, 39.7f, 59.399998f, 39.4f, 59.3f, 39.2f);
generalPath.curveTo(59.3f, 39.0f, 59.2f, 38.8f, 59.1f, 38.600002f);
generalPath.lineTo(58.8f, 38.000004f);
generalPath.curveTo(58.7f, 37.800003f, 58.5f, 37.700005f, 58.399998f, 37.500004f);
generalPath.curveTo(58.3f, 37.400005f, 58.1f, 37.200005f, 57.899998f, 37.100002f);
generalPath.curveTo(57.699997f, 37.000004f, 57.499996f, 36.9f, 57.399998f, 36.800003f);
generalPath.lineTo(57.3f, 36.800003f);
generalPath.curveTo(57.1f, 36.700005f, 56.899998f, 36.700005f, 56.7f, 36.600002f);
generalPath.lineTo(56.600002f, 36.600002f);
generalPath.curveTo(56.4f, 36.600002f, 56.2f, 36.500004f, 55.9f, 36.500004f);
generalPath.lineTo(42.2f, 36.500004f);
generalPath.lineTo(38.7f, 40.0f);
generalPath.lineTo(52.5f, 40.0f);
generalPath.curveTo(52.5f, 41.9f, 54.0f, 43.5f, 56.0f, 43.5f);
generalPath.lineTo(56.0f, 57.3f);
generalPath.curveTo(54.1f, 57.3f, 52.5f, 58.8f, 52.5f, 60.8f);
generalPath.lineTo(21.4f, 60.8f);
generalPath.curveTo(21.4f, 58.899998f, 19.9f, 57.3f, 17.9f, 57.3f);
generalPath.lineTo(17.9f, 43.4f);
generalPath.curveTo(19.8f, 43.4f, 21.4f, 41.9f, 21.4f, 39.9f);
generalPath.lineTo(25.4f, 39.9f);
generalPath.lineTo(28.9f, 36.4f);
generalPath.lineTo(18.0f, 36.4f);
generalPath.closePath();
generalPath.moveTo(37.0f, 43.4f);
generalPath.curveTo(33.2f, 43.4f, 30.1f, 46.9f, 30.1f, 51.2f);
generalPath.curveTo(30.1f, 53.7f, 31.1f, 55.8f, 32.7f, 57.3f);
generalPath.lineTo(41.300003f, 57.3f);
generalPath.curveTo(42.9f, 55.899998f, 43.9f, 53.7f, 43.9f, 51.2f);
generalPath.curveTo(43.9f, 46.9f, 40.800003f, 43.4f, 37.0f, 43.4f);
generalPath.closePath();
generalPath.moveTo(23.2f, 48.600002f);
generalPath.curveTo(22.2f, 48.600002f, 21.5f, 49.4f, 21.5f, 50.300003f);
generalPath.curveTo(21.5f, 51.300003f, 22.3f, 52.000004f, 23.2f, 52.000004f);
generalPath.curveTo(24.100002f, 52.000004f, 24.900002f, 51.200005f, 24.900002f, 50.300003f);
generalPath.curveTo(24.900002f, 49.300003f, 24.100002f, 48.600002f, 23.2f, 48.600002f);
generalPath.closePath();
generalPath.moveTo(50.800003f, 48.600002f);
generalPath.curveTo(49.800003f, 48.600002f, 49.100002f, 49.4f, 49.100002f, 50.300003f);
generalPath.curveTo(49.100002f, 51.300003f, 49.9f, 52.000004f, 50.800003f, 52.000004f);
generalPath.curveTo(51.700005f, 52.000004f, 52.500004f, 51.200005f, 52.500004f, 50.300003f);
generalPath.curveTo(52.600002f, 49.300003f, 51.800003f, 48.600002f, 50.800003f, 48.600002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 64.13500213623047), new Point2D.Double(37.0, 20.864999771118164), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.6f, 89.8f);
generalPath.lineTo(15.6f, 73.2f);
generalPath.lineTo(9.6f, 73.2f);
generalPath.lineTo(9.6f, 69.799995f);
generalPath.lineTo(25.7f, 69.799995f);
generalPath.lineTo(25.7f, 73.2f);
generalPath.lineTo(19.7f, 73.2f);
generalPath.lineTo(19.7f, 89.899994f);
generalPath.lineTo(15.6f, 89.899994f);
generalPath.closePath();
generalPath.moveTo(44.5f, 89.8f);
generalPath.lineTo(40.1f, 89.8f);
generalPath.lineTo(38.3f, 85.200005f);
generalPath.lineTo(30.199999f, 85.200005f);
generalPath.lineTo(28.499998f, 89.8f);
generalPath.lineTo(24.199997f, 89.8f);
generalPath.lineTo(32.1f, 69.8f);
generalPath.lineTo(36.399998f, 69.8f);
generalPath.lineTo(44.5f, 89.8f);
generalPath.closePath();
generalPath.moveTo(37.0f, 81.9f);
generalPath.lineTo(34.2f, 74.5f);
generalPath.lineTo(31.5f, 81.9f);
generalPath.lineTo(37.0f, 81.9f);
generalPath.closePath();
generalPath.moveTo(44.6f, 89.8f);
generalPath.lineTo(51.5f, 79.3f);
generalPath.lineTo(45.2f, 69.700005f);
generalPath.lineTo(50.0f, 69.700005f);
generalPath.lineTo(54.1f, 76.100006f);
generalPath.lineTo(58.1f, 69.700005f);
generalPath.lineTo(62.8f, 69.700005f);
generalPath.lineTo(56.5f, 79.4f);
generalPath.lineTo(63.4f, 89.700005f);
generalPath.lineTo(58.5f, 89.700005f);
generalPath.lineTo(54.0f, 82.9f);
generalPath.lineTo(49.5f, 89.8f);
generalPath.lineTo(44.6f, 89.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_4
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
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 73.45700073242188), new Point2D.Double(58.569000244140625, 86.95700073242188), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_5
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
	private ext_tax() {
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
       ext_tax base = new ext_tax();
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
       ext_tax base = new ext_tax();
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
        return ext_tax::new;
    }
}

