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
public class ext_cpp implements NeonIcon {
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
generalPath.moveTo(22.1f, 83.8f);
generalPath.lineTo(26.0f, 85.0f);
generalPath.curveTo(25.4f, 87.2f, 24.4f, 88.8f, 23.0f, 89.8f);
generalPath.curveTo(21.6f, 90.9f, 19.8f, 91.4f, 17.7f, 91.4f);
generalPath.curveTo(15.000001f, 91.4f, 12.900001f, 90.5f, 11.200001f, 88.700005f);
generalPath.curveTo(9.500001f, 86.90001f, 8.6f, 84.4f, 8.6f, 81.3f);
generalPath.curveTo(8.6f, 78.0f, 9.5f, 75.4f, 11.200001f, 73.600006f);
generalPath.curveTo(12.900002f, 71.80001f, 15.200001f, 70.90001f, 18.0f, 70.90001f);
generalPath.curveTo(20.4f, 70.90001f, 22.4f, 71.600006f, 24.0f, 73.100006f);
generalPath.curveTo(24.9f, 73.90001f, 25.6f, 75.200005f, 26.0f, 76.8f);
generalPath.lineTo(22.0f, 77.700005f);
generalPath.curveTo(21.8f, 76.700005f, 21.3f, 75.9f, 20.5f, 75.3f);
generalPath.curveTo(19.8f, 74.700005f, 18.8f, 74.4f, 17.8f, 74.4f);
generalPath.curveTo(16.3f, 74.4f, 15.099999f, 74.9f, 14.199999f, 76.0f);
generalPath.curveTo(13.299998f, 77.1f, 12.799999f, 78.8f, 12.799999f, 81.1f);
generalPath.curveTo(12.799999f, 83.6f, 13.299999f, 85.4f, 14.199999f, 86.5f);
generalPath.curveTo(15.099998f, 87.6f, 16.3f, 88.1f, 17.699999f, 88.1f);
generalPath.curveTo(18.8f, 88.1f, 19.699999f, 87.799995f, 20.499998f, 87.1f);
generalPath.curveTo(21.299997f, 86.4f, 21.799997f, 85.2f, 22.099998f, 83.799995f);
generalPath.closePath();
generalPath.moveTo(29.5f, 91.100006f);
generalPath.lineTo(29.5f, 71.2f);
generalPath.lineTo(36.0f, 71.2f);
generalPath.curveTo(38.5f, 71.2f, 40.1f, 71.299995f, 40.8f, 71.5f);
generalPath.curveTo(41.899998f, 71.8f, 42.899998f, 72.4f, 43.7f, 73.4f);
generalPath.curveTo(44.5f, 74.4f, 44.9f, 75.700005f, 44.9f, 77.3f);
generalPath.curveTo(44.9f, 78.5f, 44.7f, 79.5f, 44.2f, 80.4f);
generalPath.curveTo(43.8f, 81.200005f, 43.2f, 81.9f, 42.5f, 82.4f);
generalPath.curveTo(41.8f, 82.9f, 41.1f, 83.200005f, 40.4f, 83.3f);
generalPath.curveTo(39.4f, 83.5f, 38.0f, 83.600006f, 36.2f, 83.600006f);
generalPath.lineTo(33.600002f, 83.600006f);
generalPath.lineTo(33.600002f, 91.100006f);
generalPath.lineTo(29.500002f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(33.5f, 74.600006f);
generalPath.lineTo(33.5f, 80.200005f);
generalPath.lineTo(35.7f, 80.200005f);
generalPath.curveTo(37.3f, 80.200005f, 38.4f, 80.100006f, 38.9f, 79.9f);
generalPath.curveTo(39.4f, 79.700005f, 39.9f, 79.4f, 40.2f, 78.9f);
generalPath.curveTo(40.5f, 78.5f, 40.7f, 77.9f, 40.7f, 77.4f);
generalPath.curveTo(40.7f, 76.700005f, 40.5f, 76.1f, 40.100002f, 75.6f);
generalPath.curveTo(39.7f, 75.1f, 39.100002f, 74.799995f, 38.500004f, 74.7f);
generalPath.curveTo(38.000004f, 74.6f, 37.100002f, 74.6f, 35.600002f, 74.6f);
generalPath.lineTo(33.500004f, 74.6f);
generalPath.closePath();
generalPath.moveTo(48.1f, 91.100006f);
generalPath.lineTo(48.1f, 71.2f);
generalPath.lineTo(54.6f, 71.2f);
generalPath.curveTo(57.1f, 71.2f, 58.699997f, 71.299995f, 59.399998f, 71.5f);
generalPath.curveTo(60.499996f, 71.8f, 61.499996f, 72.4f, 62.3f, 73.4f);
generalPath.curveTo(63.1f, 74.4f, 63.5f, 75.700005f, 63.5f, 77.3f);
generalPath.curveTo(63.5f, 78.5f, 63.3f, 79.5f, 62.8f, 80.4f);
generalPath.curveTo(62.399998f, 81.200005f, 61.8f, 81.9f, 61.1f, 82.4f);
generalPath.curveTo(60.399998f, 82.9f, 59.699997f, 83.200005f, 59.0f, 83.3f);
generalPath.curveTo(58.0f, 83.5f, 56.6f, 83.600006f, 54.8f, 83.600006f);
generalPath.lineTo(52.2f, 83.600006f);
generalPath.lineTo(52.2f, 91.100006f);
generalPath.lineTo(48.100002f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(52.1f, 74.600006f);
generalPath.lineTo(52.1f, 80.200005f);
generalPath.lineTo(54.3f, 80.200005f);
generalPath.curveTo(55.899998f, 80.200005f, 57.0f, 80.100006f, 57.5f, 79.9f);
generalPath.curveTo(58.0f, 79.700005f, 58.5f, 79.4f, 58.8f, 78.9f);
generalPath.curveTo(59.1f, 78.5f, 59.3f, 77.9f, 59.3f, 77.4f);
generalPath.curveTo(59.3f, 76.700005f, 59.1f, 76.1f, 58.7f, 75.6f);
generalPath.curveTo(58.3f, 75.1f, 57.7f, 74.799995f, 57.100002f, 74.7f);
generalPath.curveTo(56.600002f, 74.6f, 55.7f, 74.6f, 54.2f, 74.6f);
generalPath.lineTo(52.100002f, 74.6f);
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
generalPath.moveTo(13.1f, 22.0f);
generalPath.lineTo(54.1f, 22.0f);
generalPath.lineTo(54.1f, 26.0f);
generalPath.lineTo(13.099998f, 26.0f);
generalPath.lineTo(13.099998f, 22.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.149999618530273, 22.0), new Point2D.Double(54.150001525878906, 22.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 213, 219, 255)) : new Color(202, 213, 219, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(19.1f, 33.7f);
generalPath.lineTo(60.1f, 33.7f);
generalPath.lineTo(60.1f, 37.8f);
generalPath.lineTo(19.099998f, 37.8f);
generalPath.lineTo(19.099998f, 33.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(19.149999618530273, 33.75), new Point2D.Double(60.150001525878906, 33.75), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 213, 219, 255)) : new Color(202, 213, 219, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(13.1f, 45.7f);
generalPath.lineTo(54.1f, 45.7f);
generalPath.lineTo(54.1f, 49.8f);
generalPath.lineTo(13.099998f, 49.8f);
generalPath.lineTo(13.099998f, 45.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.149999618530273, 45.75), new Point2D.Double(54.150001525878906, 45.75), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 213, 219, 255)) : new Color(202, 213, 219, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(19.1f, 58.0f);
generalPath.lineTo(60.1f, 58.0f);
generalPath.lineTo(60.1f, 62.0f);
generalPath.lineTo(19.099998f, 62.0f);
generalPath.lineTo(19.099998f, 58.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(19.149999618530273, 58.0), new Point2D.Double(60.150001525878906, 58.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 213, 219, 255)) : new Color(202, 213, 219, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
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
// _0_8
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
	private ext_cpp() {
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
       ext_cpp base = new ext_cpp();
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
       ext_cpp base = new ext_cpp();
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
        return ext_cpp::new;
    }
}

