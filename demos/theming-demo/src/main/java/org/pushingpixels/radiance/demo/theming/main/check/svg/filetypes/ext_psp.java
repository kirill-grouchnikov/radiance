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
public class ext_psp implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.0f,0.124f,0.262f,0.41f,0.571f,0.752f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 107, 105, 255)) : new Color(0, 107, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 128, 127, 255)) : new Color(0, 128, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 147, 147, 255)) : new Color(0, 147, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 163, 163, 255)) : new Color(0, 163, 163, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 176, 175, 255)) : new Color(0, 176, 175, 255)),((colorFilter != null) ? colorFilter.filter(new Color(8, 184, 183, 255)) : new Color(8, 184, 183, 255)),((colorFilter != null) ? colorFilter.filter(new Color(20, 187, 187, 255)) : new Color(20, 187, 187, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 110, 108, 255)) : new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(10.6f, 91.1f);
generalPath.lineTo(10.6f, 71.2f);
generalPath.lineTo(17.0f, 71.2f);
generalPath.curveTo(19.5f, 71.2f, 21.1f, 71.299995f, 21.8f, 71.5f);
generalPath.curveTo(22.9f, 71.8f, 23.9f, 72.4f, 24.699999f, 73.4f);
generalPath.curveTo(25.499998f, 74.4f, 25.9f, 75.700005f, 25.9f, 77.3f);
generalPath.curveTo(25.9f, 78.5f, 25.699999f, 79.5f, 25.199999f, 80.4f);
generalPath.curveTo(24.8f, 81.200005f, 24.199999f, 81.9f, 23.499998f, 82.4f);
generalPath.curveTo(22.799997f, 82.9f, 22.099998f, 83.200005f, 21.399998f, 83.3f);
generalPath.curveTo(20.399998f, 83.5f, 18.999998f, 83.600006f, 17.199997f, 83.600006f);
generalPath.lineTo(14.599997f, 83.600006f);
generalPath.lineTo(14.599997f, 91.100006f);
generalPath.lineTo(10.599997f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(14.6f, 74.6f);
generalPath.lineTo(14.6f, 80.2f);
generalPath.lineTo(16.800001f, 80.2f);
generalPath.curveTo(18.400002f, 80.2f, 19.500002f, 80.1f, 20.000002f, 79.899994f);
generalPath.curveTo(20.500002f, 79.7f, 21.000002f, 79.399994f, 21.300001f, 78.899994f);
generalPath.curveTo(21.6f, 78.49999f, 21.800001f, 77.899994f, 21.800001f, 77.399994f);
generalPath.curveTo(21.800001f, 76.7f, 21.6f, 76.09999f, 21.2f, 75.59999f);
generalPath.curveTo(20.800001f, 75.09999f, 20.2f, 74.79999f, 19.6f, 74.69999f);
generalPath.curveTo(19.1f, 74.59999f, 18.2f, 74.59999f, 16.7f, 74.59999f);
generalPath.lineTo(14.6f, 74.59999f);
generalPath.closePath();
generalPath.moveTo(28.2f, 84.6f);
generalPath.lineTo(32.100002f, 84.2f);
generalPath.curveTo(32.300003f, 85.5f, 32.800003f, 86.5f, 33.500004f, 87.1f);
generalPath.curveTo(34.200005f, 87.7f, 35.200005f, 88.0f, 36.400005f, 88.0f);
generalPath.curveTo(37.700005f, 88.0f, 38.700005f, 87.7f, 39.300007f, 87.2f);
generalPath.curveTo(40.000008f, 86.7f, 40.300007f, 86.0f, 40.300007f, 85.299995f);
generalPath.curveTo(40.300007f, 84.799995f, 40.20001f, 84.399994f, 39.900005f, 84.1f);
generalPath.curveTo(39.600006f, 83.799995f, 39.100006f, 83.5f, 38.400005f, 83.2f);
generalPath.curveTo(37.900005f, 83.0f, 36.900005f, 82.7f, 35.200005f, 82.299995f);
generalPath.curveTo(33.000004f, 81.799995f, 31.500004f, 81.1f, 30.600004f, 80.299995f);
generalPath.curveTo(29.400003f, 79.2f, 28.800005f, 77.899994f, 28.800005f, 76.299995f);
generalPath.curveTo(28.800005f, 75.299995f, 29.100004f, 74.299995f, 29.700005f, 73.49999f);
generalPath.curveTo(30.300005f, 72.59999f, 31.100004f, 71.99999f, 32.200005f, 71.49999f);
generalPath.curveTo(33.300003f, 70.99999f, 34.600006f, 70.799995f, 36.100006f, 70.799995f);
generalPath.curveTo(38.600006f, 70.799995f, 40.500008f, 71.299995f, 41.800007f, 72.399994f);
generalPath.curveTo(43.100006f, 73.49999f, 43.70001f, 74.899994f, 43.800007f, 76.799995f);
generalPath.lineTo(39.800007f, 76.99999f);
generalPath.curveTo(39.600006f, 75.99999f, 39.300007f, 75.19999f, 38.70001f, 74.799995f);
generalPath.curveTo(38.10001f, 74.399994f, 37.300007f, 74.1f, 36.10001f, 74.1f);
generalPath.curveTo(34.90001f, 74.1f, 34.00001f, 74.299995f, 33.30001f, 74.799995f);
generalPath.curveTo(32.90001f, 75.1f, 32.700012f, 75.49999f, 32.700012f, 75.99999f);
generalPath.curveTo(32.700012f, 76.49999f, 32.900013f, 76.899994f, 33.30001f, 77.19999f);
generalPath.curveTo(33.80001f, 77.59999f, 35.00001f, 78.09999f, 37.00001f, 78.49999f);
generalPath.curveTo(39.00001f, 78.899994f, 40.400013f, 79.399994f, 41.400013f, 79.899994f);
generalPath.curveTo(42.300014f, 80.399994f, 43.100014f, 81.09999f, 43.600014f, 81.899994f);
generalPath.curveTo(44.100014f, 82.7f, 44.400013f, 83.799995f, 44.400013f, 85.09999f);
generalPath.curveTo(44.400013f, 86.19999f, 44.100014f, 87.29999f, 43.400013f, 88.29999f);
generalPath.curveTo(42.800014f, 89.29999f, 41.900013f, 89.999985f, 40.700012f, 90.499985f);
generalPath.curveTo(39.50001f, 90.999985f, 38.100014f, 91.19998f, 36.400013f, 91.19998f);
generalPath.curveTo(33.900013f, 91.19998f, 31.900013f, 90.59998f, 30.600014f, 89.499985f);
generalPath.curveTo(29.200014f, 88.499985f, 28.400013f, 86.79999f, 28.200014f, 84.59998f);
generalPath.closePath();
generalPath.moveTo(47.800003f, 91.1f);
generalPath.lineTo(47.800003f, 71.2f);
generalPath.lineTo(54.300003f, 71.2f);
generalPath.curveTo(56.800003f, 71.2f, 58.4f, 71.299995f, 59.100002f, 71.5f);
generalPath.curveTo(60.2f, 71.8f, 61.2f, 72.4f, 62.000004f, 73.4f);
generalPath.curveTo(62.800007f, 74.4f, 63.200005f, 75.700005f, 63.200005f, 77.3f);
generalPath.curveTo(63.200005f, 78.5f, 63.000004f, 79.5f, 62.500004f, 80.4f);
generalPath.curveTo(62.100002f, 81.200005f, 61.500004f, 81.9f, 60.800003f, 82.4f);
generalPath.curveTo(60.100002f, 82.9f, 59.4f, 83.200005f, 58.700005f, 83.3f);
generalPath.curveTo(57.700005f, 83.5f, 56.300003f, 83.600006f, 54.500004f, 83.600006f);
generalPath.lineTo(51.900005f, 83.600006f);
generalPath.lineTo(51.900005f, 91.100006f);
generalPath.lineTo(47.800007f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(51.800003f, 74.6f);
generalPath.lineTo(51.800003f, 80.2f);
generalPath.lineTo(54.0f, 80.2f);
generalPath.curveTo(55.6f, 80.2f, 56.7f, 80.1f, 57.2f, 79.899994f);
generalPath.curveTo(57.7f, 79.7f, 58.2f, 79.399994f, 58.5f, 78.899994f);
generalPath.curveTo(58.8f, 78.49999f, 59.0f, 77.899994f, 59.0f, 77.399994f);
generalPath.curveTo(59.0f, 76.7f, 58.8f, 76.09999f, 58.4f, 75.59999f);
generalPath.curveTo(58.0f, 75.09999f, 57.4f, 74.79999f, 56.800003f, 74.69999f);
generalPath.curveTo(56.300003f, 74.59999f, 55.4f, 74.59999f, 53.9f, 74.59999f);
generalPath.lineTo(51.800003f, 74.59999f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(214, 237, 232, 255)) : new Color(214, 237, 232, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 235, 230, 255)) : new Color(211, 235, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 227, 223, 255)) : new Color(199, 227, 223, 255)),((colorFilter != null) ? colorFilter.filter(new Color(183, 216, 213, 255)) : new Color(183, 216, 213, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 203, 201, 255)) : new Color(160, 203, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(132, 186, 185, 255)) : new Color(132, 186, 185, 255)),((colorFilter != null) ? colorFilter.filter(new Color(98, 167, 167, 255)) : new Color(98, 167, 167, 255)),((colorFilter != null) ? colorFilter.filter(new Color(52, 147, 148, 255)) : new Color(52, 147, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 127, 127, 255)) : new Color(0, 127, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 107, 106, 255)) : new Color(0, 107, 106, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 107, 105, 255)) : new Color(0, 107, 105, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 110, 108, 255)) : new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(62.7f, 56.8f);
generalPath.curveTo(61.100002f, 56.0f, 58.100002f, 50.2f, 53.5f, 49.8f);
generalPath.curveTo(49.5f, 49.5f, 44.4f, 48.0f, 41.6f, 47.8f);
generalPath.curveTo(38.1f, 42.0f, 32.1f, 32.8f, 27.099998f, 27.9f);
generalPath.lineTo(40.899998f, 28.6f);
generalPath.curveTo(37.2f, 19.8f, 27.7f, 23.0f, 27.7f, 23.0f);
generalPath.lineTo(34.100002f, 17.7f);
generalPath.curveTo(25.900002f, 14.400001f, 22.500002f, 22.400002f, 22.500002f, 22.400002f);
generalPath.curveTo(14.000002f, 17.7f, 9.600002f, 25.7f, 9.600002f, 25.7f);
generalPath.lineTo(18.400002f, 26.300001f);
generalPath.curveTo(8.4f, 29.1f, 11.2f, 39.0f, 11.2f, 39.0f);
generalPath.lineTo(20.099998f, 31.0f);
generalPath.curveTo(18.199999f, 35.4f, 22.399998f, 38.5f, 22.399998f, 38.5f);
generalPath.lineTo(25.0f, 27.7f);
generalPath.curveTo(25.0f, 27.7f, 34.3f, 38.300003f, 37.2f, 49.1f);
generalPath.curveTo(33.5f, 51.0f, 27.7f, 54.1f, 23.2f, 54.699997f);
generalPath.curveTo(17.0f, 55.499996f, 9.700001f, 59.699997f, 9.700001f, 59.699997f);
generalPath.lineTo(9.700001f, 64.6f);
generalPath.lineTo(62.8f, 64.6f);
generalPath.lineTo(62.7f, 56.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.25, 37.35300064086914), new Point2D.Double(36.25, 85.16100311279297), new float[] {0.005f,0.343f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 130, 129, 255)) : new Color(0, 130, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 106, 105, 255)) : new Color(0, 106, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 56, 54, 255)) : new Color(0, 56, 54, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
        return 0.13300000131130219;
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
		return 0.7379999160766602;
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
	private ext_psp() {
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
       ext_psp base = new ext_psp();
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
       ext_psp base = new ext_psp();
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
        return ext_psp::new;
    }
}

