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
public class ext_step implements RadianceIcon {
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
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.6f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0179998874664307), new Point2D.Double(36.20000076293945, 101.052001953125), new float[] {0.0f,0.002f,0.092f,0.186f,0.286f,0.393f,0.507f,0.633f,0.781f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 166, 233, 255)) : new Color(0, 166, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 167, 233, 255)) : new Color(0, 167, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 178, 236, 255)) : new Color(0, 178, 236, 255)),((colorFilter != null) ? colorFilter.filter(new Color(35, 189, 239, 255)) : new Color(35, 189, 239, 255)),((colorFilter != null) ? colorFilter.filter(new Color(102, 200, 242, 255)) : new Color(102, 200, 242, 255)),((colorFilter != null) ? colorFilter.filter(new Color(137, 211, 245, 255)) : new Color(137, 211, 245, 255)),((colorFilter != null) ? colorFilter.filter(new Color(161, 219, 248, 255)) : new Color(161, 219, 248, 255)),((colorFilter != null) ? colorFilter.filter(new Color(178, 226, 249, 255)) : new Color(178, 226, 249, 255)),((colorFilter != null) ? colorFilter.filter(new Color(188, 230, 251, 255)) : new Color(188, 230, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(191, 231, 251, 255)) : new Color(191, 231, 251, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.6f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 150, 219, 255)) : new Color(0, 150, 219, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.6f);
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
generalPath.moveTo(45.2f, 0.8f);
generalPath.lineTo(72.3f, 27.5f);
generalPath.lineTo(45.2f, 27.5f);
generalPath.lineTo(45.2f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(58.77299880981445, 87.8759994506836), new Point2D.Double(49.74100112915039, 78.84500122070312), new float[] {0.0f,0.03f,0.095f,0.166f,0.241f,0.321f,0.407f,0.503f,0.614f,0.751f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 157, 225, 255)) : new Color(0, 157, 225, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 163, 227, 255)) : new Color(0, 163, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 177, 231, 255)) : new Color(0, 177, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(103, 192, 236, 255)) : new Color(103, 192, 236, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 206, 240, 255)) : new Color(146, 206, 240, 255)),((colorFilter != null) ? colorFilter.filter(new Color(180, 219, 244, 255)) : new Color(180, 219, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(206, 231, 248, 255)) : new Color(206, 231, 248, 255)),((colorFilter != null) ? colorFilter.filter(new Color(227, 240, 251, 255)) : new Color(227, 240, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 248, 253, 255)) : new Color(241, 248, 253, 255)),((colorFilter != null) ? colorFilter.filter(new Color(251, 253, 254, 255)) : new Color(251, 253, 254, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 0.8f);
generalPath.lineTo(72.3f, 27.5f);
generalPath.lineTo(45.2f, 27.5f);
generalPath.lineTo(45.2f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 150, 219, 255)) : new Color(0, 150, 219, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.8f);
generalPath.lineTo(72.3f, 27.5f);
generalPath.lineTo(45.2f, 27.5f);
generalPath.lineTo(45.2f, 0.8f);
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
generalPath.moveTo(7.9f, 84.9f);
generalPath.lineTo(11.0f, 84.6f);
generalPath.curveTo(11.2f, 85.6f, 11.6f, 86.4f, 12.1f, 86.9f);
generalPath.curveTo(12.700001f, 87.4f, 13.5f, 87.6f, 14.400001f, 87.6f);
generalPath.curveTo(15.400001f, 87.6f, 16.2f, 87.4f, 16.7f, 86.9f);
generalPath.curveTo(17.2f, 86.5f, 17.5f, 86.0f, 17.5f, 85.4f);
generalPath.curveTo(17.5f, 85.0f, 17.4f, 84.700005f, 17.2f, 84.4f);
generalPath.curveTo(17.0f, 84.1f, 16.6f, 83.9f, 16.0f, 83.700005f);
generalPath.curveTo(15.6f, 83.600006f, 14.8f, 83.3f, 13.4f, 83.00001f);
generalPath.curveTo(11.7f, 82.600006f, 10.5f, 82.100006f, 9.799999f, 81.40001f);
generalPath.curveTo(8.799999f, 80.50001f, 8.299999f, 79.50001f, 8.299999f, 78.20001f);
generalPath.curveTo(8.299999f, 77.40001f, 8.499999f, 76.60001f, 8.999999f, 76.000015f);
generalPath.curveTo(9.499999f, 75.30002f, 10.099999f, 74.80002f, 10.999999f, 74.40002f);
generalPath.curveTo(11.899999f, 74.000015f, 12.899999f, 73.90002f, 14.099998f, 73.90002f);
generalPath.curveTo(16.099998f, 73.90002f, 17.599998f, 74.30002f, 18.599998f, 75.20002f);
generalPath.curveTo(19.599998f, 76.10002f, 20.099998f, 77.20002f, 20.199999f, 78.70002f);
generalPath.lineTo(17.199999f, 79.00002f);
generalPath.curveTo(17.099998f, 78.20002f, 16.8f, 77.60002f, 16.3f, 77.300026f);
generalPath.curveTo(15.799999f, 76.900024f, 15.199999f, 76.800026f, 14.299999f, 76.800026f);
generalPath.curveTo(13.4f, 76.800026f, 12.599999f, 77.00002f, 12.099999f, 77.400024f);
generalPath.curveTo(11.799999f, 77.60002f, 11.599999f, 78.00002f, 11.599999f, 78.400024f);
generalPath.curveTo(11.599999f, 78.800026f, 11.799999f, 79.10002f, 12.099999f, 79.400024f);
generalPath.curveTo(12.499999f, 79.70003f, 13.499999f, 80.10002f, 15.099999f, 80.50002f);
generalPath.curveTo(16.699999f, 80.900024f, 17.8f, 81.20002f, 18.599998f, 81.60002f);
generalPath.curveTo(19.399998f, 82.00002f, 19.899998f, 82.50002f, 20.399998f, 83.20002f);
generalPath.curveTo(20.799997f, 83.90002f, 20.999998f, 84.70002f, 20.999998f, 85.70002f);
generalPath.curveTo(20.999998f, 86.60002f, 20.699999f, 87.40002f, 20.199999f, 88.20002f);
generalPath.curveTo(19.699999f, 89.00002f, 19.0f, 89.6f, 18.0f, 90.0f);
generalPath.curveTo(17.1f, 90.4f, 15.9f, 90.6f, 14.5f, 90.6f);
generalPath.curveTo(12.5f, 90.6f, 10.9f, 90.1f, 9.9f, 89.2f);
generalPath.curveTo(8.799999f, 88.0f, 8.099999f, 86.7f, 7.8999996f, 84.899994f);
generalPath.closePath();
generalPath.moveTo(27.199999f, 90.1f);
generalPath.lineTo(27.199999f, 77.0f);
generalPath.lineTo(22.5f, 77.0f);
generalPath.lineTo(22.5f, 74.3f);
generalPath.lineTo(35.2f, 74.3f);
generalPath.lineTo(35.2f, 77.0f);
generalPath.lineTo(30.5f, 77.0f);
generalPath.lineTo(30.5f, 90.1f);
generalPath.lineTo(27.2f, 90.1f);
generalPath.closePath();
generalPath.moveTo(37.199997f, 90.1f);
generalPath.lineTo(37.199997f, 74.3f);
generalPath.lineTo(49.0f, 74.3f);
generalPath.lineTo(49.0f, 77.0f);
generalPath.lineTo(40.4f, 77.0f);
generalPath.lineTo(40.4f, 80.5f);
generalPath.lineTo(48.4f, 80.5f);
generalPath.lineTo(48.4f, 83.2f);
generalPath.lineTo(40.4f, 83.2f);
generalPath.lineTo(40.4f, 87.5f);
generalPath.lineTo(49.300003f, 87.5f);
generalPath.lineTo(49.300003f, 90.2f);
generalPath.lineTo(37.2f, 90.2f);
generalPath.closePath();
generalPath.moveTo(52.1f, 90.1f);
generalPath.lineTo(52.1f, 74.3f);
generalPath.lineTo(57.3f, 74.3f);
generalPath.curveTo(59.3f, 74.3f, 60.5f, 74.4f, 61.1f, 74.5f);
generalPath.curveTo(62.0f, 74.7f, 62.8f, 75.3f, 63.399998f, 76.0f);
generalPath.curveTo(63.999996f, 76.8f, 64.299995f, 77.8f, 64.299995f, 79.1f);
generalPath.curveTo(64.299995f, 80.1f, 64.1f, 80.9f, 63.799995f, 81.5f);
generalPath.curveTo(63.399994f, 82.2f, 62.999996f, 82.7f, 62.399994f, 83.1f);
generalPath.curveTo(61.899994f, 83.5f, 61.299995f, 83.7f, 60.699993f, 83.799995f);
generalPath.curveTo(59.899994f, 83.99999f, 58.79999f, 83.99999f, 57.399994f, 83.99999f);
generalPath.lineTo(55.299995f, 83.99999f);
generalPath.lineTo(55.299995f, 89.899994f);
generalPath.lineTo(52.099995f, 89.899994f);
generalPath.closePath();
generalPath.moveTo(55.3f, 77.0f);
generalPath.lineTo(55.3f, 81.5f);
generalPath.lineTo(57.1f, 81.5f);
generalPath.curveTo(58.399998f, 81.5f, 59.199997f, 81.4f, 59.6f, 81.3f);
generalPath.curveTo(60.0f, 81.100006f, 60.399998f, 80.9f, 60.6f, 80.5f);
generalPath.curveTo(60.8f, 80.1f, 61.0f, 79.7f, 61.0f, 79.3f);
generalPath.curveTo(61.0f, 78.700005f, 60.8f, 78.3f, 60.5f, 77.9f);
generalPath.curveTo(60.2f, 77.5f, 59.7f, 77.3f, 59.2f, 77.200005f);
generalPath.curveTo(58.8f, 77.00001f, 58.0f, 77.00001f, 56.9f, 77.00001f);
generalPath.lineTo(55.300003f, 77.00001f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(1.7f, 9.5f);
generalPath.lineTo(19.0f, 22.5f);
generalPath.lineTo(20.8f, 20.1f);
generalPath.lineTo(1.0f, 5.3f);
generalPath.lineTo(1.0f, 9.0f);
generalPath.lineTo(1.7f, 9.5f);
generalPath.closePath();
generalPath.moveTo(37.7f, 32.8f);
generalPath.lineTo(43.2f, 25.699999f);
generalPath.lineTo(42.0f, 24.8f);
generalPath.lineTo(35.4f, 19.699999f);
generalPath.lineTo(36.100002f, 20.199999f);
generalPath.lineTo(44.300003f, 9.499999f);
generalPath.lineTo(44.300003f, 4.499999f);
generalPath.lineTo(33.600002f, 18.5f);
generalPath.lineTo(26.500002f, 13.0f);
generalPath.lineTo(13.600002f, 29.6f);
generalPath.lineTo(20.700003f, 35.0f);
generalPath.lineTo(1.1f, 59.9f);
generalPath.lineTo(1.0f, 64.2f);
generalPath.lineTo(23.1f, 36.799995f);
generalPath.lineTo(22.2f, 36.099995f);
generalPath.lineTo(30.300001f, 42.199993f);
generalPath.lineTo(35.800003f, 35.099995f);
generalPath.lineTo(71.200005f, 61.699997f);
generalPath.lineTo(71.200005f, 58.0f);
generalPath.lineTo(37.7f, 32.8f);
generalPath.closePath();
generalPath.moveTo(29.7f, 38.3f);
generalPath.lineTo(17.800001f, 29.3f);
generalPath.lineTo(26.900002f, 17.5f);
generalPath.lineTo(38.800003f, 26.5f);
generalPath.lineTo(29.700003f, 38.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.099998474121094, 97.4260025024414), new Point2D.Double(36.099998474121094, 37.78200149536133), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 154, 222, 255)) : new Color(0, 154, 222, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 189, 242, 255)) : new Color(0, 189, 242, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
		return 0.9999999403953552;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_step() {
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
       ext_step base = new ext_step();
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
       ext_step base = new ext_step();
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
        return ext_step::new;
    }
}

