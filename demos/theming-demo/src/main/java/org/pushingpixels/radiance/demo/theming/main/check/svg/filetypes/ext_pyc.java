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
public class ext_pyc implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(10.0f, 90.1f);
generalPath.lineTo(10.0f, 70.2f);
generalPath.lineTo(16.5f, 70.2f);
generalPath.curveTo(19.0f, 70.2f, 20.6f, 70.299995f, 21.3f, 70.5f);
generalPath.curveTo(22.5f, 70.8f, 23.4f, 71.4f, 24.199999f, 72.4f);
generalPath.curveTo(24.999998f, 73.4f, 25.4f, 74.700005f, 25.4f, 76.3f);
generalPath.curveTo(25.4f, 77.5f, 25.199999f, 78.5f, 24.699999f, 79.4f);
generalPath.curveTo(24.3f, 80.200005f, 23.699999f, 80.9f, 22.999998f, 81.4f);
generalPath.curveTo(22.299997f, 81.9f, 21.599998f, 82.200005f, 20.899998f, 82.3f);
generalPath.curveTo(19.899998f, 82.5f, 18.499998f, 82.600006f, 16.699997f, 82.600006f);
generalPath.lineTo(14.0f, 82.600006f);
generalPath.lineTo(14.0f, 90.100006f);
generalPath.lineTo(10.0f, 90.100006f);
generalPath.closePath();
generalPath.moveTo(14.0f, 73.6f);
generalPath.lineTo(14.0f, 79.2f);
generalPath.lineTo(16.2f, 79.2f);
generalPath.curveTo(17.800001f, 79.2f, 18.900002f, 79.1f, 19.400002f, 78.899994f);
generalPath.curveTo(19.900002f, 78.7f, 20.400002f, 78.399994f, 20.7f, 77.899994f);
generalPath.curveTo(21.0f, 77.49999f, 21.2f, 76.899994f, 21.2f, 76.399994f);
generalPath.curveTo(21.2f, 75.7f, 21.0f, 75.09999f, 20.6f, 74.59999f);
generalPath.curveTo(20.2f, 74.09999f, 19.6f, 73.79999f, 19.0f, 73.69999f);
generalPath.curveTo(18.5f, 73.59999f, 17.5f, 73.59999f, 16.1f, 73.59999f);
generalPath.lineTo(14.0f, 73.59999f);
generalPath.closePath();
generalPath.moveTo(34.0f, 90.1f);
generalPath.lineTo(34.0f, 81.799995f);
generalPath.lineTo(26.6f, 70.299995f);
generalPath.lineTo(31.400002f, 70.299995f);
generalPath.lineTo(36.100002f, 78.1f);
generalPath.lineTo(40.7f, 70.299995f);
generalPath.lineTo(45.4f, 70.299995f);
generalPath.lineTo(38.0f, 81.7f);
generalPath.lineTo(38.0f, 90.0f);
generalPath.lineTo(34.0f, 90.0f);
generalPath.closePath();
generalPath.moveTo(60.3f, 82.799995f);
generalPath.lineTo(64.2f, 83.99999f);
generalPath.curveTo(63.6f, 86.19999f, 62.6f, 87.799995f, 61.199997f, 88.799995f);
generalPath.curveTo(59.799995f, 89.899994f, 57.999996f, 90.399994f, 55.899998f, 90.399994f);
generalPath.curveTo(53.199997f, 90.399994f, 50.999996f, 89.49999f, 49.3f, 87.7f);
generalPath.curveTo(47.600002f, 85.9f, 46.7f, 83.399994f, 46.7f, 80.299995f);
generalPath.curveTo(46.7f, 76.99999f, 47.600002f, 74.399994f, 49.3f, 72.6f);
generalPath.curveTo(51.0f, 70.799995f, 53.3f, 69.9f, 56.1f, 69.9f);
generalPath.curveTo(58.6f, 69.9f, 60.6f, 70.6f, 62.1f, 72.1f);
generalPath.curveTo(63.0f, 72.9f, 63.699997f, 74.2f, 64.2f, 75.799995f);
generalPath.lineTo(60.199997f, 76.7f);
generalPath.curveTo(59.999996f, 75.7f, 59.499996f, 74.899994f, 58.699997f, 74.299995f);
generalPath.curveTo(57.899998f, 73.7f, 56.999996f, 73.399994f, 55.899998f, 73.399994f);
generalPath.curveTo(54.399998f, 73.399994f, 53.199997f, 73.899994f, 52.3f, 74.99999f);
generalPath.curveTo(51.399998f, 76.09999f, 50.899998f, 77.799995f, 50.899998f, 80.09999f);
generalPath.curveTo(50.899998f, 82.59999f, 51.399998f, 84.399994f, 52.3f, 85.49999f);
generalPath.curveTo(53.2f, 86.59999f, 54.399998f, 87.09999f, 55.899998f, 87.09999f);
generalPath.curveTo(56.999996f, 87.09999f, 57.899998f, 86.79999f, 58.699997f, 86.09999f);
generalPath.curveTo(59.399998f, 85.29999f, 59.999996f, 84.19999f, 60.299995f, 82.79999f);
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
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(38.6f, 18.6f);
generalPath.lineTo(31.0f, 18.6f);
generalPath.curveTo(23.4f, 18.6f, 23.4f, 23.900002f, 23.4f, 23.900002f);
generalPath.lineTo(23.4f, 27.2f);
generalPath.lineTo(38.5f, 27.2f);
generalPath.lineTo(38.5f, 29.300001f);
generalPath.lineTo(23.3f, 29.300001f);
generalPath.curveTo(15.699999f, 29.300001f, 15.699999f, 34.600002f, 15.699999f, 34.600002f);
generalPath.lineTo(15.699999f, 39.9f);
generalPath.curveTo(15.699999f, 45.2f, 23.3f, 45.2f, 23.3f, 45.2f);
generalPath.curveTo(23.3f, 39.9f, 30.9f, 39.9f, 30.9f, 39.9f);
generalPath.lineTo(38.5f, 39.9f);
generalPath.curveTo(46.1f, 39.9f, 46.1f, 34.600002f, 46.1f, 34.600002f);
generalPath.lineTo(46.1f, 23.9f);
generalPath.curveTo(46.199997f, 18.599998f, 38.6f, 18.599998f, 38.6f, 18.599998f);
generalPath.closePath();
generalPath.moveTo(26.399998f, 25.5f);
generalPath.curveTo(25.599998f, 25.5f, 24.999998f, 24.9f, 24.999998f, 24.1f);
generalPath.curveTo(24.999998f, 23.300001f, 25.599998f, 22.7f, 26.399998f, 22.7f);
generalPath.curveTo(27.199997f, 22.7f, 27.799997f, 23.300001f, 27.799997f, 24.1f);
generalPath.curveTo(27.899998f, 24.800001f, 27.199997f, 25.5f, 26.399998f, 25.5f);
generalPath.closePath();
generalPath.moveTo(47.299995f, 35.4f);
generalPath.curveTo(47.299995f, 40.7f, 39.699997f, 40.7f, 39.699997f, 40.7f);
generalPath.lineTo(32.199997f, 40.7f);
generalPath.curveTo(24.599997f, 40.7f, 24.599997f, 46.0f, 24.599997f, 46.0f);
generalPath.lineTo(24.599997f, 56.7f);
generalPath.curveTo(24.599997f, 62.0f, 32.199997f, 62.0f, 32.199997f, 62.0f);
generalPath.lineTo(39.799995f, 62.0f);
generalPath.curveTo(47.399994f, 62.0f, 47.399994f, 56.7f, 47.399994f, 56.7f);
generalPath.lineTo(47.399994f, 53.4f);
generalPath.lineTo(32.2f, 53.4f);
generalPath.lineTo(32.2f, 51.300003f);
generalPath.lineTo(47.4f, 51.300003f);
generalPath.curveTo(55.0f, 51.3f, 55.0f, 46.0f, 55.0f, 46.0f);
generalPath.lineTo(55.0f, 40.7f);
generalPath.curveTo(54.9f, 35.4f, 47.3f, 35.4f, 47.3f, 35.4f);
generalPath.closePath();
generalPath.moveTo(44.299995f, 55.100002f);
generalPath.curveTo(45.099995f, 55.100002f, 45.699997f, 55.7f, 45.699997f, 56.500004f);
generalPath.curveTo(45.699997f, 57.300007f, 45.1f, 57.900005f, 44.299995f, 57.900005f);
generalPath.curveTo(43.499992f, 57.900005f, 42.899994f, 57.300007f, 42.899994f, 56.500004f);
generalPath.curveTo(42.899994f, 55.7f, 43.499992f, 55.100002f, 44.299995f, 55.100002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.349998474121094, 39.8489990234375), new Point2D.Double(35.349998474121094, 83.43699645996094), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
	private ext_pyc() {
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
       ext_pyc base = new ext_pyc();
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
       ext_pyc base = new ext_pyc();
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
        return ext_pyc::new;
    }
}

