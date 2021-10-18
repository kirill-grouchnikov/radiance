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
public class ext_retry implements RadianceIcon {
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
generalPath.moveTo(7.1f, 90.1f);
generalPath.lineTo(7.1f, 77.2f);
generalPath.lineTo(12.7f, 77.2f);
generalPath.curveTo(14.099999f, 77.2f, 15.1f, 77.299995f, 15.7f, 77.5f);
generalPath.curveTo(16.3f, 77.700005f, 16.8f, 78.1f, 17.2f, 78.7f);
generalPath.curveTo(17.6f, 79.299995f, 17.800001f, 80.0f, 17.800001f, 80.7f);
generalPath.curveTo(17.800001f, 81.7f, 17.500002f, 82.5f, 16.900002f, 83.1f);
generalPath.curveTo(16.300001f, 83.7f, 15.500002f, 84.1f, 14.300001f, 84.299995f);
generalPath.curveTo(14.900002f, 84.6f, 15.300001f, 84.99999f, 15.700001f, 85.399994f);
generalPath.curveTo(16.1f, 85.799995f, 16.6f, 86.49999f, 17.2f, 87.49999f);
generalPath.lineTo(18.800001f, 89.99999f);
generalPath.lineTo(15.600001f, 89.99999f);
generalPath.lineTo(13.700002f, 87.19999f);
generalPath.curveTo(13.000002f, 86.19999f, 12.600001f, 85.59999f, 12.300002f, 85.29999f);
generalPath.curveTo(12.000003f, 84.999985f, 11.800002f, 84.89999f, 11.500002f, 84.79999f);
generalPath.curveTo(11.200002f, 84.69999f, 10.800002f, 84.69999f, 10.200002f, 84.69999f);
generalPath.lineTo(9.700002f, 84.69999f);
generalPath.lineTo(9.700002f, 90.09999f);
generalPath.lineTo(7.1f, 90.09999f);
generalPath.closePath();
generalPath.moveTo(9.7f, 82.6f);
generalPath.lineTo(11.7f, 82.6f);
generalPath.curveTo(13.0f, 82.6f, 13.799999f, 82.5f, 14.1f, 82.4f);
generalPath.curveTo(14.400002f, 82.3f, 14.700001f, 82.1f, 14.8f, 81.9f);
generalPath.curveTo(14.9f, 81.700005f, 15.1f, 81.3f, 15.1f, 80.9f);
generalPath.curveTo(15.1f, 80.5f, 15.0f, 80.1f, 14.700001f, 79.8f);
generalPath.curveTo(14.500001f, 79.5f, 14.1f, 79.4f, 13.700001f, 79.3f);
generalPath.lineTo(9.700001f, 79.3f);
generalPath.lineTo(9.700001f, 82.600006f);
generalPath.closePath();
generalPath.moveTo(20.2f, 90.1f);
generalPath.lineTo(20.2f, 77.2f);
generalPath.lineTo(29.900002f, 77.2f);
generalPath.lineTo(29.900002f, 79.399994f);
generalPath.lineTo(22.900002f, 79.399994f);
generalPath.lineTo(22.900002f, 82.299995f);
generalPath.lineTo(29.500002f, 82.299995f);
generalPath.lineTo(29.500002f, 84.49999f);
generalPath.lineTo(22.900002f, 84.49999f);
generalPath.lineTo(22.900002f, 88.0f);
generalPath.lineTo(30.2f, 88.0f);
generalPath.lineTo(30.2f, 90.2f);
generalPath.lineTo(20.2f, 90.2f);
generalPath.closePath();
generalPath.moveTo(35.4f, 90.1f);
generalPath.lineTo(35.4f, 79.4f);
generalPath.lineTo(31.500002f, 79.4f);
generalPath.lineTo(31.500002f, 77.200005f);
generalPath.lineTo(41.9f, 77.200005f);
generalPath.lineTo(41.9f, 79.4f);
generalPath.lineTo(38.0f, 79.4f);
generalPath.lineTo(38.0f, 90.1f);
generalPath.lineTo(35.4f, 90.1f);
generalPath.closePath();
generalPath.moveTo(43.600002f, 90.1f);
generalPath.lineTo(43.600002f, 77.2f);
generalPath.lineTo(49.2f, 77.2f);
generalPath.curveTo(50.600002f, 77.2f, 51.600002f, 77.299995f, 52.2f, 77.5f);
generalPath.curveTo(52.8f, 77.700005f, 53.3f, 78.1f, 53.7f, 78.7f);
generalPath.curveTo(54.100002f, 79.299995f, 54.3f, 80.0f, 54.3f, 80.7f);
generalPath.curveTo(54.3f, 81.7f, 54.0f, 82.5f, 53.399998f, 83.1f);
generalPath.curveTo(52.799995f, 83.7f, 51.999996f, 84.1f, 50.8f, 84.299995f);
generalPath.curveTo(51.399998f, 84.6f, 51.8f, 84.99999f, 52.2f, 85.399994f);
generalPath.curveTo(52.600002f, 85.799995f, 53.100002f, 86.49999f, 53.7f, 87.49999f);
generalPath.lineTo(55.3f, 89.99999f);
generalPath.lineTo(52.1f, 89.99999f);
generalPath.lineTo(50.199997f, 87.19999f);
generalPath.curveTo(49.499996f, 86.19999f, 49.1f, 85.59999f, 48.799995f, 85.29999f);
generalPath.curveTo(48.599995f, 84.999985f, 48.299995f, 84.89999f, 47.999996f, 84.79999f);
generalPath.curveTo(47.699997f, 84.69999f, 47.299995f, 84.69999f, 46.699997f, 84.69999f);
generalPath.lineTo(46.199997f, 84.69999f);
generalPath.lineTo(46.199997f, 90.09999f);
generalPath.lineTo(43.6f, 90.09999f);
generalPath.closePath();
generalPath.moveTo(46.2f, 82.6f);
generalPath.lineTo(48.2f, 82.6f);
generalPath.curveTo(49.5f, 82.6f, 50.3f, 82.5f, 50.600002f, 82.4f);
generalPath.curveTo(50.900005f, 82.3f, 51.2f, 82.1f, 51.300003f, 81.9f);
generalPath.curveTo(51.500004f, 81.6f, 51.600002f, 81.3f, 51.600002f, 80.9f);
generalPath.curveTo(51.600002f, 80.5f, 51.500004f, 80.1f, 51.2f, 79.8f);
generalPath.curveTo(51.0f, 79.5f, 50.600002f, 79.4f, 50.2f, 79.3f);
generalPath.lineTo(46.2f, 79.3f);
generalPath.lineTo(46.2f, 82.600006f);
generalPath.closePath();
generalPath.moveTo(59.5f, 90.1f);
generalPath.lineTo(59.5f, 84.7f);
generalPath.lineTo(54.7f, 77.2f);
generalPath.lineTo(57.8f, 77.2f);
generalPath.lineTo(60.899998f, 82.299995f);
generalPath.lineTo(63.899998f, 77.2f);
generalPath.lineTo(66.899994f, 77.2f);
generalPath.lineTo(62.099995f, 84.7f);
generalPath.lineTo(62.099995f, 90.1f);
generalPath.lineTo(59.499996f, 90.1f);
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(55.4f, 50.3f);
generalPath.curveTo(55.4f, 60.6f, 47.0f, 69.0f, 36.7f, 69.0f);
generalPath.curveTo(26.400002f, 69.0f, 18.0f, 60.6f, 18.0f, 50.3f);
generalPath.curveTo(18.0f, 46.7f, 19.0f, 43.399998f, 20.8f, 40.5f);
generalPath.lineTo(26.8f, 44.0f);
generalPath.curveTo(25.599998f, 45.8f, 24.9f, 48.0f, 24.9f, 50.3f);
generalPath.curveTo(24.9f, 56.7f, 30.099998f, 61.9f, 36.5f, 61.9f);
generalPath.curveTo(42.9f, 61.9f, 48.2f, 56.7f, 48.2f, 50.300003f);
generalPath.curveTo(48.2f, 44.9f, 44.5f, 40.4f, 39.5f, 39.100002f);
generalPath.lineTo(39.5f, 45.0f);
generalPath.lineTo(22.4f, 35.0f);
generalPath.lineTo(39.8f, 25.0f);
generalPath.lineTo(39.8f, 32.0f);
generalPath.curveTo(48.6f, 33.4f, 55.4f, 41.1f, 55.4f, 50.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0939998626709, 47.0), new Point2D.Double(55.40599822998047, 47.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_retry() {
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
       ext_retry base = new ext_retry();
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
       ext_retry base = new ext_retry();
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
        return ext_retry::new;
    }
}

