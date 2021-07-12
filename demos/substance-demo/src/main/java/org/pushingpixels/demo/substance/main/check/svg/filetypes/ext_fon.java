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
public class ext_fon implements NeonIcon {
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(71.9f, 27.7f);
generalPath.lineTo(71.9f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(190, 192, 219, 255)) : new Color(190, 192, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(206, 205, 230, 255)) : new Color(206, 205, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(225, 220, 243, 255)) : new Color(225, 220, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(239, 230, 251, 255)) : new Color(239, 230, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(245, 245, 255, 255)) : new Color(245, 245, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(71.9f, 27.7f);
generalPath.lineTo(71.9f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 135, 161, 255)) : new Color(113, 135, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(71.9f, 27.7f);
generalPath.lineTo(71.9f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(44.7f, 1.0f);
generalPath.lineTo(71.6f, 27.7f);
generalPath.lineTo(44.7f, 27.7f);
generalPath.lineTo(44.7f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.75, 25.75), new Point2D.Double(58.20000076293945, 12.300000190734863), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 245, 255, 255)) : new Color(255, 245, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 241, 251, 255)) : new Color(250, 241, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 231, 244, 255)) : new Color(237, 231, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 219, 233, 255)) : new Color(221, 219, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 201, 218, 255)) : new Color(199, 201, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 179, 199, 255)) : new Color(173, 179, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 145, 176, 255)) : new Color(146, 145, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(44.7f, 1.0f);
generalPath.lineTo(71.6f, 27.7f);
generalPath.lineTo(44.7f, 27.7f);
generalPath.lineTo(44.7f, 1.0f);
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
generalPath.moveTo(44.7f, 1.0f);
generalPath.lineTo(71.6f, 27.7f);
generalPath.lineTo(44.7f, 27.7f);
generalPath.lineTo(44.7f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(26.9f, 49.3f);
generalPath.lineTo(16.5f, 49.3f);
generalPath.lineTo(15.3f, 52.1f);
generalPath.curveTo(14.900001f, 53.0f, 14.7f, 53.8f, 14.7f, 54.399998f);
generalPath.curveTo(14.7f, 55.199997f, 15.0f, 55.8f, 15.7f, 56.199997f);
generalPath.curveTo(16.1f, 56.399998f, 17.1f, 56.6f, 18.6f, 56.699997f);
generalPath.lineTo(18.6f, 57.499996f);
generalPath.lineTo(8.7f, 57.499996f);
generalPath.lineTo(8.7f, 56.699997f);
generalPath.curveTo(9.8f, 56.499996f, 10.599999f, 56.1f, 11.299999f, 55.399998f);
generalPath.curveTo(11.999999f, 54.699997f, 12.799999f, 53.3f, 13.799999f, 51.1f);
generalPath.lineTo(24.3f, 28.399998f);
generalPath.lineTo(24.699999f, 28.399998f);
generalPath.lineTo(35.3f, 51.799995f);
generalPath.curveTo(36.3f, 53.999996f, 37.1f, 55.399994f, 37.8f, 55.999996f);
generalPath.curveTo(38.3f, 56.399998f, 39.0f, 56.699997f, 39.899998f, 56.799995f);
generalPath.lineTo(39.899998f, 57.599995f);
generalPath.lineTo(25.7f, 57.599995f);
generalPath.lineTo(25.7f, 56.799995f);
generalPath.lineTo(26.300001f, 56.799995f);
generalPath.curveTo(27.400002f, 56.799995f, 28.2f, 56.599995f, 28.7f, 56.299995f);
generalPath.curveTo(29.0f, 56.099995f, 29.2f, 55.799995f, 29.2f, 55.299995f);
generalPath.curveTo(29.2f, 54.999996f, 29.2f, 54.799995f, 29.1f, 54.499996f);
generalPath.curveTo(29.1f, 54.399998f, 28.9f, 53.799995f, 28.4f, 52.899998f);
generalPath.lineTo(26.9f, 49.3f);
generalPath.closePath();
generalPath.moveTo(26.1f, 47.7f);
generalPath.lineTo(21.7f, 37.9f);
generalPath.lineTo(17.2f, 47.7f);
generalPath.lineTo(26.1f, 47.7f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255);
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
generalPath.moveTo(62.1f, 38.6f);
generalPath.lineTo(57.899998f, 52.6f);
generalPath.lineTo(57.499996f, 54.3f);
generalPath.curveTo(57.499996f, 54.5f, 57.399998f, 54.7f, 57.399998f, 54.8f);
generalPath.curveTo(57.399998f, 55.0f, 57.499996f, 55.1f, 57.6f, 55.2f);
generalPath.curveTo(57.7f, 55.300003f, 57.8f, 55.4f, 58.0f, 55.4f);
generalPath.curveTo(58.3f, 55.4f, 58.7f, 55.2f, 59.3f, 54.7f);
generalPath.curveTo(59.5f, 54.5f, 60.0f, 53.9f, 60.899998f, 52.8f);
generalPath.lineTo(61.699997f, 53.2f);
generalPath.curveTo(60.699997f, 55.0f, 59.6f, 56.3f, 58.399998f, 57.2f);
generalPath.curveTo(57.199997f, 58.0f, 55.999996f, 58.4f, 54.6f, 58.4f);
generalPath.curveTo(53.8f, 58.4f, 53.1f, 58.2f, 52.699997f, 57.800003f);
generalPath.curveTo(52.299995f, 57.4f, 51.999996f, 56.9f, 51.999996f, 56.200005f);
generalPath.curveTo(51.999996f, 55.700005f, 52.199997f, 54.600006f, 52.699997f, 53.200005f);
generalPath.lineTo(53.199997f, 51.500004f);
generalPath.curveTo(51.499996f, 54.300003f, 49.899998f, 56.300003f, 48.399998f, 57.400005f);
generalPath.curveTo(47.499996f, 58.100006f, 46.499996f, 58.400005f, 45.499996f, 58.400005f);
generalPath.curveTo(44.199997f, 58.400005f, 43.199997f, 57.900005f, 42.599995f, 56.800007f);
generalPath.curveTo(41.999996f, 55.70001f, 41.699993f, 54.600006f, 41.699993f, 53.20001f);
generalPath.curveTo(41.699993f, 51.20001f, 42.29999f, 49.000008f, 43.599995f, 46.40001f);
generalPath.curveTo(44.799995f, 43.80001f, 46.499996f, 41.80001f, 48.499996f, 40.20001f);
generalPath.curveTo(50.199997f, 38.90001f, 51.699997f, 38.300007f, 53.199997f, 38.300007f);
generalPath.curveTo(53.999996f, 38.300007f, 54.699997f, 38.500008f, 55.199997f, 39.000008f);
generalPath.curveTo(55.699997f, 39.500008f, 56.1f, 40.300007f, 56.299995f, 41.500008f);
generalPath.lineTo(57.099995f, 38.90001f);
generalPath.lineTo(62.099995f, 38.60001f);
generalPath.closePath();
generalPath.moveTo(55.1f, 42.6f);
generalPath.curveTo(55.1f, 41.5f, 54.899998f, 40.6f, 54.6f, 40.1f);
generalPath.curveTo(54.3f, 39.699997f, 54.0f, 39.6f, 53.5f, 39.6f);
generalPath.curveTo(53.1f, 39.6f, 52.6f, 39.8f, 52.1f, 40.199997f);
generalPath.curveTo(51.1f, 41.1f, 50.1f, 42.799995f, 49.0f, 45.499996f);
generalPath.curveTo(47.9f, 48.199997f, 47.3f, 50.399998f, 47.3f, 52.399998f);
generalPath.curveTo(47.3f, 53.1f, 47.399998f, 53.699997f, 47.7f, 53.999996f);
generalPath.curveTo(48.0f, 54.299995f, 48.2f, 54.499996f, 48.5f, 54.499996f);
generalPath.curveTo(49.2f, 54.499996f, 49.8f, 54.099995f, 50.5f, 53.399998f);
generalPath.curveTo(51.5f, 52.399998f, 52.3f, 51.1f, 53.1f, 49.6f);
generalPath.curveTo(54.399998f, 47.0f, 55.1f, 44.699997f, 55.1f, 42.6f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(54, 69, 77, 255)) : new Color(54, 69, 77, 255);
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
generalPath.moveTo(14.6f, 92.1f);
generalPath.lineTo(14.6f, 76.3f);
generalPath.lineTo(25.5f, 76.3f);
generalPath.lineTo(25.5f, 79.0f);
generalPath.lineTo(17.8f, 79.0f);
generalPath.lineTo(17.8f, 82.7f);
generalPath.lineTo(24.4f, 82.7f);
generalPath.lineTo(24.4f, 85.399994f);
generalPath.lineTo(17.8f, 85.399994f);
generalPath.lineTo(17.8f, 92.09999f);
generalPath.lineTo(14.599999f, 92.09999f);
generalPath.closePath();
generalPath.moveTo(27.5f, 84.299995f);
generalPath.curveTo(27.5f, 82.7f, 27.7f, 81.299995f, 28.2f, 80.299995f);
generalPath.curveTo(28.6f, 79.49999f, 29.1f, 78.799995f, 29.7f, 78.1f);
generalPath.curveTo(30.300001f, 77.5f, 31.0f, 77.0f, 31.7f, 76.7f);
generalPath.curveTo(32.7f, 76.299995f, 33.8f, 76.1f, 35.100002f, 76.1f);
generalPath.curveTo(37.4f, 76.1f, 39.300003f, 76.799995f, 40.7f, 78.299995f);
generalPath.curveTo(42.1f, 79.799995f, 42.8f, 81.7f, 42.8f, 84.299995f);
generalPath.curveTo(42.8f, 86.799995f, 42.1f, 88.799995f, 40.7f, 90.299995f);
generalPath.curveTo(39.3f, 91.7f, 37.5f, 92.49999f, 35.100002f, 92.49999f);
generalPath.curveTo(32.7f, 92.49999f, 30.900002f, 91.799995f, 29.500002f, 90.399994f);
generalPath.curveTo(28.200003f, 88.799995f, 27.500002f, 86.799995f, 27.500002f, 84.299995f);
generalPath.closePath();
generalPath.moveTo(30.8f, 84.2f);
generalPath.curveTo(30.8f, 86.0f, 31.199999f, 87.299995f, 32.0f, 88.299995f);
generalPath.curveTo(32.8f, 89.2f, 33.9f, 89.7f, 35.2f, 89.7f);
generalPath.curveTo(36.5f, 89.7f, 37.5f, 89.2f, 38.3f, 88.299995f);
generalPath.curveTo(39.1f, 87.399994f, 39.5f, 85.99999f, 39.5f, 84.2f);
generalPath.curveTo(39.5f, 82.399994f, 39.1f, 81.0f, 38.3f, 80.2f);
generalPath.curveTo(37.5f, 79.399994f, 36.399998f, 78.899994f, 35.1f, 78.899994f);
generalPath.curveTo(33.8f, 78.899994f, 32.699997f, 79.299995f, 31.899998f, 80.2f);
generalPath.curveTo(31.199997f, 81.0f, 30.799997f, 82.399994f, 30.799997f, 84.2f);
generalPath.closePath();
generalPath.moveTo(45.4f, 92.1f);
generalPath.lineTo(45.4f, 76.3f);
generalPath.lineTo(48.5f, 76.3f);
generalPath.lineTo(55.0f, 86.8f);
generalPath.lineTo(55.0f, 76.3f);
generalPath.lineTo(58.0f, 76.3f);
generalPath.lineTo(58.0f, 92.0f);
generalPath.lineTo(54.8f, 92.0f);
generalPath.lineTo(48.399998f, 81.7f);
generalPath.lineTo(48.399998f, 92.0f);
generalPath.lineTo(45.399998f, 92.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 98, 123, 255)) : new Color(76, 98, 123, 255);
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
	private ext_fon() {
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
       ext_fon base = new ext_fon();
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
       ext_fon base = new ext_fon();
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
        return ext_fon::new;
    }
}

