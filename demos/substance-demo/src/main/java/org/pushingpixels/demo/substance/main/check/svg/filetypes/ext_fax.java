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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_fax implements RadianceIcon {
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0), new Point2D.Double(36.0, 3.003999948501587), new float[] {0.0f,0.211f,0.37f,0.512f,0.645f,0.77f,0.889f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(248, 176, 184, 255)) : new Color(248, 176, 184, 255)),((colorFilter != null) ? colorFilter.filter(new Color(246, 172, 181, 255)) : new Color(246, 172, 181, 255)),((colorFilter != null) ? colorFilter.filter(new Color(242, 163, 173, 255)) : new Color(242, 163, 173, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 149, 161, 255)) : new Color(237, 149, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(231, 130, 146, 255)) : new Color(231, 130, 146, 255)),((colorFilter != null) ? colorFilter.filter(new Color(224, 105, 128, 255)) : new Color(224, 105, 128, 255)),((colorFilter != null) ? colorFilter.filter(new Color(215, 72, 107, 255)) : new Color(215, 72, 107, 255)),((colorFilter != null) ? colorFilter.filter(new Color(206, 7, 87, 255)) : new Color(206, 7, 87, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(212, 28, 92, 255)) : new Color(212, 28, 92, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
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
generalPath.moveTo(11.0f, 91.1f);
generalPath.lineTo(11.0f, 71.2f);
generalPath.lineTo(24.8f, 71.2f);
generalPath.lineTo(24.8f, 74.6f);
generalPath.lineTo(15.0f, 74.6f);
generalPath.lineTo(15.0f, 79.299995f);
generalPath.lineTo(23.4f, 79.299995f);
generalPath.lineTo(23.4f, 82.7f);
generalPath.lineTo(15.0f, 82.7f);
generalPath.lineTo(15.0f, 91.1f);
generalPath.lineTo(11.0f, 91.1f);
generalPath.closePath();
generalPath.moveTo(44.9f, 91.1f);
generalPath.lineTo(40.5f, 91.1f);
generalPath.lineTo(38.7f, 86.6f);
generalPath.lineTo(30.6f, 86.6f);
generalPath.lineTo(28.9f, 91.1f);
generalPath.lineTo(24.599998f, 91.1f);
generalPath.lineTo(32.5f, 71.3f);
generalPath.lineTo(36.8f, 71.3f);
generalPath.lineTo(44.9f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(37.4f, 83.2f);
generalPath.lineTo(34.600002f, 75.799995f);
generalPath.lineTo(31.900002f, 83.2f);
generalPath.lineTo(37.4f, 83.2f);
generalPath.closePath();
generalPath.moveTo(45.0f, 91.1f);
generalPath.lineTo(51.9f, 80.7f);
generalPath.lineTo(45.7f, 71.2f);
generalPath.lineTo(50.5f, 71.2f);
generalPath.lineTo(54.5f, 77.6f);
generalPath.lineTo(58.5f, 71.2f);
generalPath.lineTo(63.2f, 71.2f);
generalPath.lineTo(56.9f, 80.799995f);
generalPath.lineTo(63.8f, 91.0f);
generalPath.lineTo(58.899998f, 91.0f);
generalPath.lineTo(54.399998f, 84.1f);
generalPath.lineTo(49.899998f, 91.0f);
generalPath.lineTo(45.0f, 91.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.178001403808594, 74.15899658203125), new Point2D.Double(58.77199935913086, 87.75299835205078), new float[] {0.0f,0.265f,0.402f,0.51f,0.604f,0.687f,0.763f,0.834f,0.901f,0.962f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 238, 255)) : new Color(255, 254, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 250, 236, 255)) : new Color(255, 250, 236, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 242, 230, 255)) : new Color(254, 242, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 231, 220, 255)) : new Color(252, 231, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 215, 207, 255)) : new Color(250, 215, 207, 255)),((colorFilter != null) ? colorFilter.filter(new Color(246, 195, 191, 255)) : new Color(246, 195, 191, 255)),((colorFilter != null) ? colorFilter.filter(new Color(242, 171, 172, 255)) : new Color(242, 171, 172, 255)),((colorFilter != null) ? colorFilter.filter(new Color(238, 143, 151, 255)) : new Color(238, 143, 151, 255)),((colorFilter != null) ? colorFilter.filter(new Color(234, 111, 130, 255)) : new Color(234, 111, 130, 255)),((colorFilter != null) ? colorFilter.filter(new Color(229, 68, 109, 255)) : new Color(229, 68, 109, 255)),((colorFilter != null) ? colorFilter.filter(new Color(227, 14, 96, 255)) : new Color(227, 14, 96, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(212, 28, 92, 255)) : new Color(212, 28, 92, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(41.7f, 35.1f);
generalPath.lineTo(39.3f, 35.1f);
generalPath.curveTo(39.0f, 35.1f, 38.8f, 34.899998f, 38.8f, 34.6f);
generalPath.lineTo(38.8f, 23.599998f);
generalPath.lineTo(28.5f, 23.599998f);
generalPath.lineTo(28.5f, 28.099998f);
generalPath.curveTo(28.5f, 28.999998f, 27.8f, 29.699999f, 26.9f, 29.699999f);
generalPath.lineTo(22.4f, 29.699999f);
generalPath.lineTo(22.4f, 34.6f);
generalPath.curveTo(22.4f, 34.899998f, 22.199999f, 35.1f, 21.9f, 35.1f);
generalPath.lineTo(19.5f, 35.1f);
generalPath.curveTo(19.2f, 35.1f, 19.0f, 34.899998f, 19.0f, 34.6f);
generalPath.lineTo(19.0f, 27.3f);
generalPath.lineTo(26.2f, 20.099998f);
generalPath.lineTo(40.0f, 20.099998f);
generalPath.curveTo(41.2f, 20.099998f, 42.2f, 21.099998f, 42.3f, 22.3f);
generalPath.lineTo(42.3f, 34.6f);
generalPath.curveTo(42.2f, 34.899998f, 42.0f, 35.1f, 41.7f, 35.1f);
generalPath.closePath();
generalPath.moveTo(42.2f, 61.1f);
generalPath.curveTo(42.2f, 61.6f, 41.8f, 62.0f, 41.3f, 62.0f);
generalPath.lineTo(20.6f, 62.0f);
generalPath.curveTo(18.2f, 62.0f, 16.3f, 60.1f, 16.3f, 57.7f);
generalPath.lineTo(16.3f, 39.4f);
generalPath.curveTo(16.3f, 38.9f, 16.699999f, 38.5f, 17.199999f, 38.5f);
generalPath.lineTo(41.4f, 38.5f);
generalPath.curveTo(41.9f, 38.5f, 42.300003f, 38.9f, 42.300003f, 39.4f);
generalPath.lineTo(42.300003f, 61.100002f);
generalPath.lineTo(42.200005f, 61.100002f);
generalPath.closePath();
generalPath.moveTo(25.2f, 44.199997f);
generalPath.curveTo(25.2f, 43.199997f, 24.400002f, 42.399998f, 23.400002f, 42.399998f);
generalPath.curveTo(22.400002f, 42.399998f, 21.600002f, 43.199997f, 21.600002f, 44.199997f);
generalPath.curveTo(21.600002f, 45.199997f, 22.400002f, 45.999996f, 23.400002f, 45.999996f);
generalPath.curveTo(24.400002f, 45.999996f, 25.2f, 45.199997f, 25.2f, 44.199997f);
generalPath.closePath();
generalPath.moveTo(25.2f, 50.199997f);
generalPath.curveTo(25.2f, 49.199997f, 24.400002f, 48.399998f, 23.400002f, 48.399998f);
generalPath.curveTo(22.400002f, 48.399998f, 21.600002f, 49.199997f, 21.600002f, 50.199997f);
generalPath.curveTo(21.600002f, 51.199997f, 22.400002f, 51.999996f, 23.400002f, 51.999996f);
generalPath.curveTo(24.400002f, 52.099995f, 25.2f, 51.299995f, 25.2f, 50.199997f);
generalPath.curveTo(25.2f, 50.299995f, 25.2f, 50.199997f, 25.2f, 50.199997f);
generalPath.closePath();
generalPath.moveTo(29.400002f, 42.399998f);
generalPath.curveTo(28.400002f, 42.399998f, 27.600002f, 43.199997f, 27.600002f, 44.199997f);
generalPath.curveTo(27.600002f, 45.199997f, 28.400002f, 45.999996f, 29.400002f, 45.999996f);
generalPath.curveTo(30.400002f, 45.999996f, 31.2f, 45.199997f, 31.2f, 44.199997f);
generalPath.curveTo(31.2f, 43.199997f, 30.400002f, 42.399998f, 29.400002f, 42.399998f);
generalPath.closePath();
generalPath.moveTo(31.2f, 50.199997f);
generalPath.curveTo(31.2f, 49.199997f, 30.400002f, 48.399998f, 29.400002f, 48.399998f);
generalPath.curveTo(28.400002f, 48.399998f, 27.600002f, 49.199997f, 27.600002f, 50.199997f);
generalPath.curveTo(27.600002f, 51.199997f, 28.400002f, 51.999996f, 29.400002f, 51.999996f);
generalPath.curveTo(30.400002f, 52.099995f, 31.2f, 51.299995f, 31.2f, 50.199997f);
generalPath.closePath();
generalPath.moveTo(31.2f, 56.299995f);
generalPath.curveTo(31.2f, 55.299995f, 30.400002f, 54.499996f, 29.400002f, 54.499996f);
generalPath.curveTo(28.400002f, 54.499996f, 27.600002f, 55.299995f, 27.600002f, 56.299995f);
generalPath.curveTo(27.600002f, 57.299995f, 28.400002f, 58.099995f, 29.400002f, 58.099995f);
generalPath.curveTo(30.400002f, 58.099995f, 31.2f, 57.299995f, 31.2f, 56.299995f);
generalPath.closePath();
generalPath.moveTo(35.4f, 42.399994f);
generalPath.curveTo(34.4f, 42.399994f, 33.600002f, 43.199993f, 33.600002f, 44.199993f);
generalPath.curveTo(33.600002f, 45.199993f, 34.4f, 45.999992f, 35.4f, 45.999992f);
generalPath.curveTo(36.4f, 45.999992f, 37.2f, 45.199993f, 37.2f, 44.199993f);
generalPath.curveTo(37.2f, 43.199993f, 36.4f, 42.399994f, 35.4f, 42.399994f);
generalPath.closePath();
generalPath.moveTo(37.2f, 50.199993f);
generalPath.curveTo(37.2f, 49.199993f, 36.4f, 48.399994f, 35.4f, 48.399994f);
generalPath.curveTo(34.4f, 48.399994f, 33.600002f, 49.199993f, 33.600002f, 50.199993f);
generalPath.curveTo(33.600002f, 51.199993f, 34.4f, 51.999992f, 35.4f, 51.999992f);
generalPath.curveTo(36.4f, 52.09999f, 37.300003f, 51.29999f, 37.2f, 50.199993f);
generalPath.closePath();
generalPath.moveTo(37.3f, 56.29999f);
generalPath.curveTo(37.3f, 55.29999f, 36.5f, 54.499992f, 35.5f, 54.499992f);
generalPath.curveTo(34.5f, 54.499992f, 33.7f, 55.29999f, 33.7f, 56.29999f);
generalPath.curveTo(33.7f, 57.29999f, 34.5f, 58.09999f, 35.5f, 58.09999f);
generalPath.curveTo(36.4f, 58.09999f, 37.2f, 57.29999f, 37.3f, 56.29999f);
generalPath.closePath();
generalPath.moveTo(56.699997f, 57.59999f);
generalPath.lineTo(56.699997f, 38.4f);
generalPath.curveTo(56.699997f, 35.4f, 54.199997f, 32.9f, 51.199997f, 32.9f);
generalPath.lineTo(46.6f, 32.9f);
generalPath.curveTo(46.1f, 32.9f, 45.699997f, 33.300003f, 45.699997f, 33.800003f);
generalPath.lineTo(45.699997f, 61.100002f);
generalPath.curveTo(45.699997f, 61.600002f, 46.1f, 62.000004f, 46.6f, 62.000004f);
generalPath.lineTo(52.399998f, 62.000004f);
generalPath.curveTo(54.8f, 62.000004f, 56.699997f, 60.000004f, 56.699997f, 57.600002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(57.71799850463867, 58.4630012512207), new Point2D.Double(20.54199981689453, 31.56800079345703), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(238, 40, 104, 255)) : new Color(238, 40, 104, 255)),((colorFilter != null) ? colorFilter.filter(new Color(188, 2, 79, 255)) : new Color(188, 2, 79, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-1.0f, 0.0f, 0.0f, 1.0f, 73.5719985961914f, 0.0f));
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
        return 0.12799999117851257;
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
		return 0.7450000047683716;
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
	private ext_fax() {
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
       ext_fax base = new ext_fax();
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
       ext_fax base = new ext_fax();
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
        return ext_fax::new;
    }
}

