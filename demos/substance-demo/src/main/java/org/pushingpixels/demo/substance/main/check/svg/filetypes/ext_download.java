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
public class ext_download implements NeonIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 26.575000762939453), new Point2D.Double(58.57500076293945, 13.074999809265137), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(58.8f, 61.7f);
generalPath.curveTo(58.8f, 59.9f, 57.399998f, 58.5f, 55.6f, 58.5f);
generalPath.lineTo(16.4f, 58.5f);
generalPath.curveTo(14.599999f, 58.5f, 13.2f, 59.9f, 13.2f, 61.7f);
generalPath.lineTo(13.2f, 66.2f);
generalPath.curveTo(13.2f, 68.0f, 14.599999f, 69.399994f, 16.4f, 69.399994f);
generalPath.lineTo(55.6f, 69.399994f);
generalPath.curveTo(57.399998f, 69.399994f, 58.8f, 67.99999f, 58.8f, 66.2f);
generalPath.lineTo(58.8f, 61.699997f);
generalPath.closePath();
generalPath.moveTo(41.9f, 65.8f);
generalPath.curveTo(40.9f, 65.8f, 40.100002f, 65.0f, 40.100002f, 64.0f);
generalPath.curveTo(40.100002f, 63.0f, 40.9f, 62.2f, 41.9f, 62.2f);
generalPath.curveTo(42.9f, 62.2f, 43.7f, 63.0f, 43.7f, 64.0f);
generalPath.curveTo(43.8f, 65.0f, 42.9f, 65.8f, 41.9f, 65.8f);
generalPath.closePath();
generalPath.moveTo(47.4f, 65.8f);
generalPath.curveTo(46.4f, 65.8f, 45.600002f, 65.0f, 45.600002f, 64.0f);
generalPath.curveTo(45.600002f, 63.0f, 46.4f, 62.2f, 47.4f, 62.2f);
generalPath.curveTo(48.4f, 62.2f, 49.2f, 63.0f, 49.2f, 64.0f);
generalPath.curveTo(49.2f, 65.0f, 48.4f, 65.8f, 47.4f, 65.8f);
generalPath.closePath();
generalPath.moveTo(52.9f, 65.8f);
generalPath.curveTo(51.9f, 65.8f, 51.100002f, 65.0f, 51.100002f, 64.0f);
generalPath.curveTo(51.100002f, 63.0f, 51.9f, 62.2f, 52.9f, 62.2f);
generalPath.curveTo(53.9f, 62.2f, 54.7f, 63.0f, 54.7f, 64.0f);
generalPath.curveTo(54.7f, 65.0f, 53.9f, 65.8f, 52.9f, 65.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.199999809265137, 63.965999603271484), new Point2D.Double(58.79999923706055, 63.965999603271484), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.4f, 56.7f);
generalPath.lineTo(55.6f, 56.7f);
generalPath.curveTo(56.5f, 56.7f, 57.3f, 56.9f, 58.0f, 57.3f);
generalPath.lineTo(54.2f, 49.3f);
generalPath.curveTo(53.2f, 47.0f, 51.4f, 46.1f, 49.600002f, 46.1f);
generalPath.lineTo(45.300003f, 46.1f);
generalPath.lineTo(39.100002f, 52.399998f);
generalPath.curveTo(38.7f, 52.8f, 38.2f, 53.199997f, 37.600002f, 53.399998f);
generalPath.curveTo(37.000004f, 53.6f, 36.4f, 53.8f, 35.800003f, 53.8f);
generalPath.curveTo(35.200005f, 53.8f, 34.600002f, 53.7f, 34.000004f, 53.399998f);
generalPath.lineTo(33.800003f, 53.399998f);
generalPath.curveTo(33.300003f, 53.1f, 32.9f, 52.8f, 32.500004f, 52.499996f);
generalPath.lineTo(26.400003f, 46.199997f);
generalPath.lineTo(22.200005f, 46.199997f);
generalPath.curveTo(20.400005f, 46.199997f, 18.800005f, 47.199997f, 17.600004f, 49.399998f);
generalPath.lineTo(13.800004f, 57.399998f);
generalPath.curveTo(14.700004f, 56.899998f, 15.500004f, 56.699997f, 16.400003f, 56.699997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.968000411987305, 51.724998474121094), new Point2D.Double(58.03200149536133, 51.724998474121094), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 43.2f);
generalPath.curveTo(45.3f, 43.0f, 45.5f, 42.7f, 45.6f, 42.4f);
generalPath.curveTo(45.699997f, 42.100002f, 45.8f, 41.800003f, 45.8f, 41.5f);
generalPath.curveTo(45.8f, 41.2f, 45.7f, 40.9f, 45.6f, 40.6f);
generalPath.curveTo(45.5f, 40.3f, 45.3f, 40.1f, 45.1f, 39.8f);
generalPath.curveTo(44.899998f, 39.6f, 44.6f, 39.399998f, 44.3f, 39.3f);
generalPath.curveTo(44.0f, 39.2f, 43.7f, 39.1f, 43.399998f, 39.1f);
generalPath.curveTo(43.099995f, 39.1f, 42.8f, 39.199997f, 42.499996f, 39.3f);
generalPath.curveTo(42.199997f, 39.399998f, 41.899998f, 39.6f, 41.699997f, 39.8f);
generalPath.lineTo(38.199997f, 43.3f);
generalPath.lineTo(38.199997f, 32.3f);
generalPath.curveTo(38.199997f, 32.0f, 38.1f, 31.699999f, 37.999996f, 31.4f);
generalPath.curveTo(37.899998f, 31.1f, 37.699997f, 30.9f, 37.499996f, 30.6f);
generalPath.curveTo(37.299995f, 30.4f, 36.999996f, 30.2f, 36.699997f, 30.1f);
generalPath.curveTo(36.6f, 30.0f, 36.299995f, 30.0f, 35.999996f, 30.0f);
generalPath.curveTo(35.699997f, 30.0f, 35.399998f, 30.1f, 35.099995f, 30.2f);
generalPath.curveTo(34.799995f, 30.300001f, 34.499996f, 30.5f, 34.299995f, 30.7f);
generalPath.curveTo(34.099995f, 30.900002f, 33.899994f, 31.2f, 33.799995f, 31.5f);
generalPath.curveTo(33.699997f, 31.8f, 33.599995f, 32.1f, 33.599995f, 32.4f);
generalPath.lineTo(33.599995f, 43.4f);
generalPath.lineTo(30.099995f, 39.9f);
generalPath.curveTo(29.899994f, 39.7f, 29.599995f, 39.5f, 29.299995f, 39.4f);
generalPath.curveTo(28.999996f, 39.300003f, 28.699995f, 39.2f, 28.399996f, 39.2f);
generalPath.curveTo(28.099997f, 39.2f, 27.799995f, 39.3f, 27.499996f, 39.4f);
generalPath.curveTo(27.199997f, 39.5f, 26.999996f, 39.7f, 26.699997f, 39.9f);
generalPath.curveTo(26.499996f, 40.100002f, 26.299997f, 40.4f, 26.199997f, 40.7f);
generalPath.curveTo(26.099997f, 41.0f, 25.999996f, 41.3f, 25.999996f, 41.600002f);
generalPath.curveTo(25.999996f, 41.9f, 26.099997f, 42.2f, 26.199997f, 42.500004f);
generalPath.curveTo(26.299997f, 42.800003f, 26.499996f, 43.100002f, 26.699997f, 43.300003f);
generalPath.lineTo(34.199997f, 51.000004f);
generalPath.curveTo(34.399998f, 51.200005f, 34.699997f, 51.400005f, 34.999996f, 51.500004f);
generalPath.curveTo(35.299995f, 51.600002f, 35.599995f, 51.700005f, 35.899998f, 51.700005f);
generalPath.curveTo(36.199997f, 51.700005f, 36.499996f, 51.600006f, 36.8f, 51.500004f);
generalPath.curveTo(37.1f, 51.400005f, 37.3f, 51.200005f, 37.6f, 51.000004f);
generalPath.lineTo(45.1f, 43.200005f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.172000885009766, 40.75199890136719), new Point2D.Double(45.82699966430664, 40.75199890136719), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
	private ext_download() {
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
       ext_download base = new ext_download();
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
       ext_download base = new ext_download();
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
        return ext_download::new;
    }
}

