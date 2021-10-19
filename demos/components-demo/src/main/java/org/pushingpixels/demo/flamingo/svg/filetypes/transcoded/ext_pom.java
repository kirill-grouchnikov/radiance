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
public class ext_pom implements RadianceIcon {
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
generalPath.moveTo(6.6f, 90.1f);
generalPath.lineTo(6.6f, 70.2f);
generalPath.lineTo(13.1f, 70.2f);
generalPath.curveTo(15.6f, 70.2f, 17.2f, 70.299995f, 17.900002f, 70.5f);
generalPath.curveTo(19.100002f, 70.8f, 20.000002f, 71.4f, 20.800001f, 72.4f);
generalPath.curveTo(21.6f, 73.4f, 22.000002f, 74.700005f, 22.000002f, 76.3f);
generalPath.curveTo(22.000002f, 77.5f, 21.800001f, 78.5f, 21.300001f, 79.4f);
generalPath.curveTo(20.900002f, 80.200005f, 20.300001f, 80.9f, 19.6f, 81.4f);
generalPath.curveTo(18.9f, 81.9f, 18.2f, 82.200005f, 17.5f, 82.3f);
generalPath.curveTo(16.5f, 82.5f, 15.1f, 82.600006f, 13.3f, 82.600006f);
generalPath.lineTo(10.700001f, 82.600006f);
generalPath.lineTo(10.700001f, 90.100006f);
generalPath.lineTo(6.6f, 90.100006f);
generalPath.closePath();
generalPath.moveTo(10.7f, 73.6f);
generalPath.lineTo(10.7f, 79.2f);
generalPath.lineTo(12.9f, 79.2f);
generalPath.curveTo(14.5f, 79.2f, 15.599999f, 79.1f, 16.1f, 78.899994f);
generalPath.curveTo(16.6f, 78.7f, 17.1f, 78.399994f, 17.4f, 77.899994f);
generalPath.curveTo(17.699999f, 77.49999f, 17.9f, 76.899994f, 17.9f, 76.399994f);
generalPath.curveTo(17.9f, 75.7f, 17.699999f, 75.09999f, 17.3f, 74.59999f);
generalPath.curveTo(16.9f, 74.09999f, 16.3f, 73.79999f, 15.699999f, 73.69999f);
generalPath.curveTo(15.199999f, 73.59999f, 14.199999f, 73.59999f, 12.799999f, 73.59999f);
generalPath.lineTo(10.699999f, 73.59999f);
generalPath.closePath();
generalPath.moveTo(24.5f, 80.299995f);
generalPath.curveTo(24.5f, 78.299995f, 24.8f, 76.6f, 25.4f, 75.2f);
generalPath.curveTo(25.9f, 74.2f, 26.5f, 73.299995f, 27.3f, 72.5f);
generalPath.curveTo(28.099998f, 71.7f, 29.0f, 71.1f, 29.9f, 70.7f);
generalPath.curveTo(31.199999f, 70.2f, 32.6f, 69.899994f, 34.2f, 69.899994f);
generalPath.curveTo(37.2f, 69.899994f, 39.5f, 70.799995f, 41.3f, 72.59999f);
generalPath.curveTo(43.1f, 74.399994f, 44.0f, 76.899994f, 44.0f, 80.19999f);
generalPath.curveTo(44.0f, 83.39999f, 43.1f, 85.89999f, 41.4f, 87.69999f);
generalPath.curveTo(39.700005f, 89.49999f, 37.300003f, 90.39999f, 34.300003f, 90.39999f);
generalPath.curveTo(31.300003f, 90.39999f, 28.900003f, 89.499985f, 27.200003f, 87.69999f);
generalPath.curveTo(25.500002f, 85.899994f, 24.500002f, 83.39999f, 24.500002f, 80.29999f);
generalPath.closePath();
generalPath.moveTo(28.7f, 80.1f);
generalPath.curveTo(28.7f, 82.299995f, 29.2f, 84.0f, 30.300001f, 85.2f);
generalPath.curveTo(31.400002f, 86.399994f, 32.7f, 86.899994f, 34.300003f, 86.899994f);
generalPath.curveTo(35.900005f, 86.899994f, 37.200005f, 86.299995f, 38.300003f, 85.2f);
generalPath.curveTo(39.4f, 84.1f, 39.9f, 82.299995f, 39.9f, 80.0f);
generalPath.curveTo(39.9f, 77.7f, 39.4f, 76.0f, 38.4f, 74.9f);
generalPath.curveTo(37.4f, 73.8f, 36.0f, 73.200005f, 34.4f, 73.200005f);
generalPath.curveTo(32.800003f, 73.200005f, 31.400002f, 73.8f, 30.400002f, 74.9f);
generalPath.curveTo(29.2f, 76.1f, 28.7f, 77.9f, 28.7f, 80.1f);
generalPath.closePath();
generalPath.moveTo(47.2f, 90.1f);
generalPath.lineTo(47.2f, 70.2f);
generalPath.lineTo(53.3f, 70.2f);
generalPath.lineTo(56.899998f, 83.7f);
generalPath.lineTo(60.499996f, 70.2f);
generalPath.lineTo(66.6f, 70.2f);
generalPath.lineTo(66.6f, 90.0f);
generalPath.lineTo(62.8f, 90.0f);
generalPath.lineTo(62.8f, 74.5f);
generalPath.lineTo(58.8f, 90.1f);
generalPath.lineTo(54.899998f, 90.1f);
generalPath.lineTo(50.899998f, 74.5f);
generalPath.lineTo(50.899998f, 90.1f);
generalPath.lineTo(47.199997f, 90.1f);
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
generalPath.moveTo(56.5f, 27.1f);
generalPath.curveTo(56.5f, 27.1f, 42.1f, 27.300001f, 32.9f, 39.0f);
generalPath.curveTo(32.4f, 39.7f, 31.900002f, 40.3f, 31.400002f, 41.0f);
generalPath.curveTo(31.100002f, 41.4f, 30.800001f, 45.4f, 30.800001f, 45.4f);
generalPath.curveTo(30.800001f, 45.4f, 30.400002f, 45.100002f, 30.2f, 44.600002f);
generalPath.curveTo(29.900002f, 44.000004f, 29.800001f, 43.300003f, 29.800001f, 43.300003f);
generalPath.curveTo(24.600002f, 51.800003f, 26.1f, 56.200005f, 26.1f, 56.200005f);
generalPath.curveTo(25.7f, 57.200005f, 24.9f, 57.800003f, 23.800001f, 60.100006f);
generalPath.curveTo(22.7f, 62.400005f, 22.800001f, 64.600006f, 22.800001f, 64.600006f);
generalPath.curveTo(22.800001f, 65.00001f, 22.900002f, 65.100006f, 23.1f, 64.700005f);
generalPath.curveTo(23.1f, 64.700005f, 24.300001f, 62.400005f, 25.2f, 60.900005f);
generalPath.curveTo(25.800001f, 59.900005f, 27.6f, 57.600006f, 27.6f, 57.600006f);
generalPath.curveTo(27.6f, 57.600006f, 30.6f, 57.700005f, 34.2f, 56.800007f);
generalPath.curveTo(33.9f, 56.70001f, 32.9f, 56.400005f, 32.2f, 56.100006f);
generalPath.curveTo(31.5f, 55.800007f, 31.1f, 55.300007f, 31.1f, 55.300007f);
generalPath.lineTo(44.0f, 52.300007f);
generalPath.curveTo(45.8f, 51.20001f, 47.4f, 49.900005f, 48.7f, 48.300007f);
generalPath.curveTo(55.5f, 40.200005f, 57.2f, 27.800007f, 57.2f, 27.800007f);
generalPath.curveTo(57.3f, 27.400007f, 57.0f, 27.100006f, 56.5f, 27.100006f);
generalPath.closePath();
generalPath.moveTo(43.7f, 40.0f);
generalPath.curveTo(43.7f, 40.0f, 37.7f, 45.3f, 34.7f, 48.1f);
generalPath.curveTo(31.7f, 50.899998f, 27.7f, 57.6f, 27.7f, 57.6f);
generalPath.lineTo(26.2f, 56.199997f);
generalPath.curveTo(26.2f, 56.199997f, 27.300001f, 53.499996f, 31.7f, 48.1f);
generalPath.curveTo(36.1f, 42.7f, 43.5f, 39.5f, 43.5f, 39.5f);
generalPath.curveTo(44.4f, 39.1f, 44.5f, 39.3f, 43.7f, 40.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(22.788000106811523, 46.0), new Point2D.Double(57.21200180053711, 46.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_pom() {
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
       ext_pom base = new ext_pom();
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
       ext_pom base = new ext_pom();
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
        return ext_pom::new;
    }
}

