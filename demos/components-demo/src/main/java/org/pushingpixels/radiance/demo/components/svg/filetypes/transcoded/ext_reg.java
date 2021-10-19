package org.pushingpixels.radiance.demo.components.svg.filetypes.transcoded;

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
public class ext_reg implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(17.5f, 56.2f);
generalPath.lineTo(17.5f, 51.4f);
generalPath.lineTo(27.0f, 51.4f);
generalPath.lineTo(27.0f, 61.0f);
generalPath.lineTo(17.4f, 61.0f);
generalPath.lineTo(17.4f, 56.2f);
generalPath.closePath();
generalPath.moveTo(31.8f, 56.2f);
generalPath.lineTo(31.8f, 51.4f);
generalPath.lineTo(41.4f, 51.4f);
generalPath.lineTo(41.4f, 61.0f);
generalPath.lineTo(31.800001f, 61.0f);
generalPath.lineTo(31.800001f, 56.2f);
generalPath.closePath();
generalPath.moveTo(46.1f, 56.2f);
generalPath.lineTo(46.1f, 51.4f);
generalPath.lineTo(55.699997f, 51.4f);
generalPath.lineTo(55.699997f, 61.0f);
generalPath.lineTo(46.1f, 61.0f);
generalPath.lineTo(46.1f, 56.2f);
generalPath.closePath();
generalPath.moveTo(47.5f, 45.300003f);
generalPath.lineTo(44.1f, 42.0f);
generalPath.lineTo(47.399998f, 38.6f);
generalPath.lineTo(50.8f, 35.3f);
generalPath.lineTo(54.2f, 38.6f);
generalPath.lineTo(57.5f, 42.0f);
generalPath.lineTo(54.2f, 45.3f);
generalPath.curveTo(52.4f, 47.2f, 50.8f, 48.7f, 50.8f, 48.7f);
generalPath.curveTo(50.8f, 48.7f, 49.3f, 47.2f, 47.5f, 45.3f);
generalPath.closePath();
generalPath.moveTo(17.5f, 42.000004f);
generalPath.lineTo(17.5f, 37.200005f);
generalPath.lineTo(27.0f, 37.200005f);
generalPath.lineTo(27.0f, 46.800003f);
generalPath.lineTo(17.4f, 46.800003f);
generalPath.lineTo(17.4f, 42.0f);
generalPath.closePath();
generalPath.moveTo(31.8f, 42.000004f);
generalPath.lineTo(31.8f, 37.200005f);
generalPath.lineTo(41.4f, 37.200005f);
generalPath.lineTo(41.4f, 46.800003f);
generalPath.lineTo(31.800001f, 46.800003f);
generalPath.lineTo(31.800001f, 42.0f);
generalPath.closePath();
generalPath.moveTo(33.2f, 31.000004f);
generalPath.lineTo(29.900002f, 27.700005f);
generalPath.lineTo(33.2f, 24.300005f);
generalPath.lineTo(36.600002f, 21.000006f);
generalPath.lineTo(40.000004f, 24.300005f);
generalPath.lineTo(43.300003f, 27.700005f);
generalPath.lineTo(39.9f, 31.000004f);
generalPath.curveTo(38.100002f, 32.900005f, 36.5f, 34.400005f, 36.5f, 34.400005f);
generalPath.curveTo(36.5f, 34.400005f, 35.0f, 32.9f, 33.2f, 31.0f);
generalPath.closePath();
generalPath.moveTo(17.5f, 27.700005f);
generalPath.lineTo(17.5f, 22.900005f);
generalPath.lineTo(27.0f, 22.900005f);
generalPath.lineTo(27.0f, 32.500008f);
generalPath.lineTo(17.4f, 32.500008f);
generalPath.lineTo(17.4f, 27.700008f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.5, 61.0), new Point2D.Double(37.5, 21.0), new float[] {0.005f,0.343f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 130, 129, 255)) : new Color(0, 130, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 106, 105, 255)) : new Color(0, 106, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 56, 54, 255)) : new Color(0, 56, 54, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(8.0f, 91.1f);
generalPath.lineTo(8.0f, 71.2f);
generalPath.lineTo(16.5f, 71.2f);
generalPath.curveTo(18.6f, 71.2f, 20.2f, 71.399994f, 21.2f, 71.7f);
generalPath.curveTo(22.2f, 72.0f, 22.900002f, 72.7f, 23.5f, 73.6f);
generalPath.curveTo(24.1f, 74.5f, 24.4f, 75.6f, 24.4f, 76.7f);
generalPath.curveTo(24.4f, 78.2f, 24.0f, 79.399994f, 23.1f, 80.399994f);
generalPath.curveTo(22.2f, 81.399994f, 20.9f, 81.99999f, 19.1f, 82.2f);
generalPath.curveTo(20.0f, 82.7f, 20.7f, 83.299995f, 21.300001f, 83.899994f);
generalPath.curveTo(21.900002f, 84.49999f, 22.6f, 85.59999f, 23.6f, 87.09999f);
generalPath.lineTo(26.0f, 91.0f);
generalPath.lineTo(21.2f, 91.0f);
generalPath.lineTo(18.300001f, 86.7f);
generalPath.curveTo(17.300001f, 85.2f, 16.6f, 84.2f, 16.2f, 83.799995f);
generalPath.curveTo(15.800001f, 83.399994f, 15.400001f, 83.1f, 15.000001f, 82.99999f);
generalPath.curveTo(14.600001f, 82.899994f, 13.900001f, 82.799995f, 13.000001f, 82.799995f);
generalPath.lineTo(12.000001f, 82.799995f);
generalPath.lineTo(12.000001f, 91.1f);
generalPath.lineTo(8.0f, 91.1f);
generalPath.closePath();
generalPath.moveTo(12.0f, 79.6f);
generalPath.lineTo(15.0f, 79.6f);
generalPath.curveTo(16.9f, 79.6f, 18.1f, 79.5f, 18.6f, 79.4f);
generalPath.curveTo(19.1f, 79.3f, 19.5f, 79.0f, 19.7f, 78.6f);
generalPath.curveTo(20.0f, 78.2f, 20.1f, 77.7f, 20.1f, 77.1f);
generalPath.curveTo(20.1f, 76.4f, 19.9f, 75.9f, 19.6f, 75.5f);
generalPath.curveTo(19.2f, 75.1f, 18.7f, 74.8f, 18.1f, 74.7f);
generalPath.curveTo(17.800001f, 74.7f, 16.800001f, 74.6f, 15.200001f, 74.6f);
generalPath.lineTo(12.0f, 74.6f);
generalPath.lineTo(12.0f, 79.6f);
generalPath.closePath();
generalPath.moveTo(28.1f, 91.1f);
generalPath.lineTo(28.1f, 71.2f);
generalPath.lineTo(43.0f, 71.2f);
generalPath.lineTo(43.0f, 74.6f);
generalPath.lineTo(32.2f, 74.6f);
generalPath.lineTo(32.2f, 79.0f);
generalPath.lineTo(42.2f, 79.0f);
generalPath.lineTo(42.2f, 82.3f);
generalPath.lineTo(32.2f, 82.3f);
generalPath.lineTo(32.2f, 87.700005f);
generalPath.lineTo(43.4f, 87.700005f);
generalPath.lineTo(43.4f, 91.0f);
generalPath.lineTo(28.1f, 91.0f);
generalPath.closePath();
generalPath.moveTo(56.1f, 83.799995f);
generalPath.lineTo(56.1f, 80.49999f);
generalPath.lineTo(64.799995f, 80.49999f);
generalPath.lineTo(64.799995f, 88.399994f);
generalPath.curveTo(63.999996f, 89.2f, 62.699997f, 89.899994f, 61.099995f, 90.49999f);
generalPath.curveTo(59.499996f, 91.09999f, 57.899994f, 91.399994f, 56.199993f, 91.399994f);
generalPath.curveTo(54.099995f, 91.399994f, 52.29999f, 90.99999f, 50.699993f, 90.09999f);
generalPath.curveTo(49.099995f, 89.19999f, 48.0f, 88.0f, 47.2f, 86.4f);
generalPath.curveTo(46.4f, 84.8f, 46.0f, 83.0f, 46.0f, 81.1f);
generalPath.curveTo(46.0f, 79.0f, 46.4f, 77.2f, 47.3f, 75.6f);
generalPath.curveTo(48.199997f, 74.0f, 49.399998f, 72.799995f, 51.1f, 71.9f);
generalPath.curveTo(52.399998f, 71.200005f, 54.0f, 70.9f, 55.899998f, 70.9f);
generalPath.curveTo(58.399998f, 70.9f, 60.3f, 71.4f, 61.699997f, 72.4f);
generalPath.curveTo(63.099995f, 73.4f, 63.999996f, 74.9f, 64.399994f, 76.700005f);
generalPath.lineTo(60.399994f, 77.4f);
generalPath.curveTo(60.099995f, 76.4f, 59.599995f, 75.700005f, 58.799995f, 75.1f);
generalPath.curveTo(57.999996f, 74.5f, 57.099995f, 74.299995f, 55.899994f, 74.299995f);
generalPath.curveTo(54.099995f, 74.299995f, 52.699993f, 74.899994f, 51.699993f, 75.99999f);
generalPath.curveTo(50.699993f, 77.09999f, 50.099995f, 78.799995f, 50.099995f, 80.899994f);
generalPath.curveTo(50.099995f, 83.299995f, 50.599995f, 84.99999f, 51.699993f, 86.2f);
generalPath.curveTo(52.79999f, 87.4f, 54.099995f, 88.0f, 55.79999f, 88.0f);
generalPath.curveTo(56.59999f, 88.0f, 57.499992f, 87.8f, 58.29999f, 87.5f);
generalPath.curveTo(59.09999f, 87.2f, 59.89999f, 86.8f, 60.499992f, 86.3f);
generalPath.lineTo(60.499992f, 83.8f);
generalPath.lineTo(56.09999f, 83.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_1
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
	private ext_reg() {
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
       ext_reg base = new ext_reg();
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
       ext_reg base = new ext_reg();
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
        return ext_reg::new;
    }
}

