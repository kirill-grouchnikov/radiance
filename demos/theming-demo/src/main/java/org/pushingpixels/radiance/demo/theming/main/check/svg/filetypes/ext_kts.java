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
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class ext_kts implements RadianceIcon {
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 97.0), new Point2D.Double(36.20000076293945, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
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
generalPath.moveTo(10.5f, 90.1f);
generalPath.lineTo(10.5f, 70.2f);
generalPath.lineTo(14.6f, 70.2f);
generalPath.lineTo(14.6f, 79.0f);
generalPath.lineTo(22.8f, 70.2f);
generalPath.lineTo(28.3f, 70.2f);
generalPath.lineTo(20.7f, 78.0f);
generalPath.lineTo(28.7f, 90.1f);
generalPath.lineTo(23.400002f, 90.1f);
generalPath.lineTo(17.900002f, 80.799995f);
generalPath.lineTo(14.600001f, 84.1f);
generalPath.lineTo(14.600001f, 90.1f);
generalPath.lineTo(10.500002f, 90.1f);
generalPath.closePath();
generalPath.moveTo(35.3f, 90.1f);
generalPath.lineTo(35.3f, 73.6f);
generalPath.lineTo(29.3f, 73.6f);
generalPath.lineTo(29.3f, 70.2f);
generalPath.lineTo(45.3f, 70.2f);
generalPath.lineTo(45.3f, 73.6f);
generalPath.lineTo(39.3f, 73.6f);
generalPath.lineTo(39.3f, 90.1f);
generalPath.lineTo(35.3f, 90.1f);
generalPath.closePath();
generalPath.moveTo(46.9f, 83.6f);
generalPath.lineTo(50.9f, 83.2f);
generalPath.curveTo(51.100002f, 84.5f, 51.600002f, 85.5f, 52.300003f, 86.1f);
generalPath.curveTo(53.000004f, 86.7f, 54.000004f, 87.0f, 55.200005f, 87.0f);
generalPath.curveTo(56.500004f, 87.0f, 57.500004f, 86.7f, 58.200005f, 86.2f);
generalPath.curveTo(58.900005f, 85.7f, 59.200005f, 85.0f, 59.200005f, 84.299995f);
generalPath.curveTo(59.200005f, 83.799995f, 59.100006f, 83.399994f, 58.800003f, 83.1f);
generalPath.curveTo(58.500004f, 82.799995f, 58.000004f, 82.5f, 57.300003f, 82.2f);
generalPath.curveTo(56.800003f, 82.0f, 55.700005f, 81.7f, 54.000004f, 81.299995f);
generalPath.curveTo(51.800003f, 80.799995f, 50.300003f, 80.1f, 49.400005f, 79.299995f);
generalPath.curveTo(48.200005f, 78.2f, 47.500004f, 76.899994f, 47.500004f, 75.299995f);
generalPath.curveTo(47.500004f, 74.299995f, 47.800003f, 73.299995f, 48.400005f, 72.49999f);
generalPath.curveTo(49.000008f, 71.69999f, 49.800007f, 70.99999f, 50.900005f, 70.49999f);
generalPath.curveTo(52.000004f, 69.99999f, 53.300007f, 69.799995f, 54.900005f, 69.799995f);
generalPath.curveTo(57.400005f, 69.799995f, 59.300007f, 70.299995f, 60.600006f, 71.399994f);
generalPath.curveTo(61.900005f, 72.49999f, 62.500008f, 73.899994f, 62.600006f, 75.799995f);
generalPath.lineTo(58.500008f, 75.99999f);
generalPath.curveTo(58.300007f, 74.99999f, 58.000008f, 74.19999f, 57.40001f, 73.799995f);
generalPath.curveTo(56.80001f, 73.399994f, 56.000008f, 73.1f, 54.80001f, 73.1f);
generalPath.curveTo(53.60001f, 73.1f, 52.700012f, 73.299995f, 52.00001f, 73.799995f);
generalPath.curveTo(51.60001f, 74.1f, 51.400013f, 74.49999f, 51.400013f, 74.99999f);
generalPath.curveTo(51.400013f, 75.49999f, 51.600014f, 75.899994f, 52.00001f, 76.19999f);
generalPath.curveTo(52.50001f, 76.59999f, 53.80001f, 77.09999f, 55.700012f, 77.49999f);
generalPath.curveTo(57.600014f, 77.899994f, 59.100014f, 78.399994f, 60.100014f, 78.899994f);
generalPath.curveTo(61.000015f, 79.399994f, 61.800014f, 80.09999f, 62.300014f, 80.899994f);
generalPath.curveTo(62.800014f, 81.7f, 63.100014f, 82.799995f, 63.100014f, 84.09999f);
generalPath.curveTo(63.100014f, 85.19999f, 62.800014f, 86.29999f, 62.100014f, 87.29999f);
generalPath.curveTo(61.500015f, 88.29999f, 60.600014f, 88.999985f, 59.400013f, 89.499985f);
generalPath.curveTo(58.200012f, 89.999985f, 56.800014f, 90.19998f, 55.00001f, 90.19998f);
generalPath.curveTo(52.50001f, 90.19998f, 50.50001f, 89.59998f, 49.10001f, 88.499985f);
generalPath.curveTo(48.00001f, 87.499985f, 47.10001f, 85.79999f, 46.90001f, 83.59998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
generalPath.moveTo(31.8f, 32.0f);
generalPath.curveTo(31.699999f, 32.1f, 31.699999f, 32.1f, 31.8f, 32.0f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.761999130249023, 30.065000534057617), new Point2D.Double(31.761999130249023, 30.013999938964844), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(18.5f, 52.2f);
generalPath.lineTo(18.5f, 40.1f);
generalPath.curveTo(18.5f, 39.3f, 18.7f, 38.899998f, 19.5f, 38.5f);
generalPath.curveTo(28.6f, 33.5f, 37.7f, 28.4f, 46.7f, 23.4f);
generalPath.curveTo(48.0f, 22.699999f, 49.3f, 22.0f, 50.8f, 22.0f);
generalPath.curveTo(53.399998f, 22.1f, 55.5f, 23.6f, 56.2f, 26.0f);
generalPath.curveTo(57.0f, 28.4f, 56.2f, 31.2f, 54.100002f, 32.6f);
generalPath.curveTo(51.800003f, 34.0f, 49.2f, 35.399998f, 46.800003f, 36.8f);
generalPath.curveTo(37.700005f, 41.8f, 28.600002f, 46.9f, 19.400003f, 51.9f);
generalPath.curveTo(19.200003f, 52.0f, 18.900003f, 52.100002f, 18.500004f, 52.2f);
generalPath.closePath();
generalPath.moveTo(32.9f, 47.7f);
generalPath.curveTo(33.2f, 47.5f, 33.5f, 47.4f, 33.7f, 47.100002f);
generalPath.curveTo(36.7f, 45.4f, 39.7f, 43.9f, 42.6f, 42.2f);
generalPath.curveTo(43.3f, 41.9f, 43.699997f, 41.9f, 44.3f, 42.3f);
generalPath.curveTo(47.7f, 45.399998f, 51.2f, 48.399998f, 54.5f, 51.5f);
generalPath.curveTo(56.4f, 53.2f, 56.9f, 55.4f, 56.2f, 57.7f);
generalPath.curveTo(55.5f, 60.0f, 53.9f, 61.4f, 51.4f, 61.7f);
generalPath.curveTo(49.800003f, 61.9f, 48.300003f, 61.5f, 47.100002f, 60.5f);
generalPath.curveTo(42.4f, 56.3f, 37.800003f, 52.1f, 32.9f, 47.7f);
generalPath.curveTo(33.100002f, 47.9f, 33.100002f, 47.8f, 32.9f, 47.7f);
generalPath.closePath();
generalPath.moveTo(18.5f, 35.8f);
generalPath.curveTo(18.5f, 32.8f, 18.3f, 29.9f, 18.6f, 27.0f);
generalPath.curveTo(18.9f, 23.8f, 22.2f, 21.8f, 25.6f, 22.1f);
generalPath.curveTo(28.5f, 22.4f, 30.900002f, 25.4f, 30.7f, 28.400002f);
generalPath.curveTo(30.7f, 28.7f, 30.5f, 29.2f, 30.1f, 29.300001f);
generalPath.lineTo(18.7f, 35.600002f);
generalPath.curveTo(18.800001f, 35.800003f, 18.7f, 35.7f, 18.5f, 35.800003f);
generalPath.closePath();
generalPath.moveTo(30.7f, 48.9f);
generalPath.curveTo(30.7f, 51.7f, 30.800001f, 54.100002f, 30.7f, 56.7f);
generalPath.curveTo(30.5f, 59.7f, 27.7f, 62.0f, 24.7f, 62.0f);
generalPath.curveTo(21.800001f, 62.0f, 19.0f, 59.8f, 18.5f, 56.9f);
generalPath.curveTo(18.4f, 56.0f, 18.5f, 55.5f, 19.4f, 55.0f);
generalPath.curveTo(22.8f, 53.1f, 26.3f, 51.2f, 29.7f, 49.3f);
generalPath.curveTo(29.900002f, 49.2f, 30.300001f, 49.1f, 30.7f, 48.899998f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.5, 38.0), new Point2D.Double(37.5, 78.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.29999923706055, 25.799999237060547), new Point2D.Double(58.849998474121094, 12.25), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
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
        return 0.13099998235702515;
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
		return 0.7420000433921814;
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
	private ext_kts() {
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
       ext_kts base = new ext_kts();
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
       ext_kts base = new ext_kts();
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
        return ext_kts::new;
    }
}

