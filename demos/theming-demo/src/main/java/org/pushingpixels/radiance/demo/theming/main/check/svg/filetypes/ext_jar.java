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
public class ext_jar implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
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
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(71.7f, 99.2f);
generalPath.lineTo(0.2f, 99.2f);
generalPath.lineTo(0.2f, 0.9f);
generalPath.lineTo(44.9f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.880000114440918), new Point2D.Double(36.0, 101.125), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 196, 2, 255)) : new Color(239, 196, 2, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 200, 41, 255)) : new Color(241, 200, 41, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 210, 100, 255)) : new Color(244, 210, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(247, 220, 139, 255)) : new Color(247, 220, 139, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 229, 172, 255)) : new Color(249, 229, 172, 255)),((colorFilter != null) ? colorFilter.filter(new Color(251, 236, 199, 255)) : new Color(251, 236, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 243, 221, 255)) : new Color(252, 243, 221, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 249, 238, 255)) : new Color(254, 249, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 253, 249, 255)) : new Color(255, 253, 249, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(71.7f, 99.2f);
generalPath.lineTo(0.2f, 99.2f);
generalPath.lineTo(0.2f, 0.9f);
generalPath.lineTo(44.9f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 156, 2, 255)) : new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(71.7f, 99.2f);
generalPath.lineTo(0.2f, 99.2f);
generalPath.lineTo(0.2f, 0.9f);
generalPath.lineTo(44.9f, 0.9f);
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
generalPath.moveTo(17.2f, 72.3f);
generalPath.lineTo(21.2f, 72.3f);
generalPath.lineTo(21.2f, 84.9f);
generalPath.curveTo(21.2f, 86.5f, 21.1f, 87.8f, 20.800001f, 88.700005f);
generalPath.curveTo(20.400002f, 89.9f, 19.7f, 90.8f, 18.7f, 91.50001f);
generalPath.curveTo(17.7f, 92.200005f, 16.300001f, 92.600006f, 14.700001f, 92.600006f);
generalPath.curveTo(12.700001f, 92.600006f, 11.200001f, 92.100006f, 10.200001f, 91.00001f);
generalPath.curveTo(9.000001f, 89.80001f, 8.500001f, 88.100006f, 8.500001f, 86.00001f);
generalPath.lineTo(12.300001f, 85.600006f);
generalPath.curveTo(12.300001f, 86.700005f, 12.500001f, 87.50001f, 12.800001f, 88.00001f);
generalPath.curveTo(13.200001f, 88.700005f, 13.900002f, 89.100006f, 14.800001f, 89.100006f);
generalPath.curveTo(15.700001f, 89.100006f, 16.300001f, 88.8f, 16.7f, 88.3f);
generalPath.curveTo(17.1f, 87.8f, 17.300001f, 86.700005f, 17.300001f, 85.100006f);
generalPath.lineTo(17.300001f, 72.3f);
generalPath.closePath();
generalPath.moveTo(43.5f, 92.200005f);
generalPath.lineTo(39.1f, 92.200005f);
generalPath.lineTo(37.399998f, 87.700005f);
generalPath.lineTo(29.399998f, 87.700005f);
generalPath.lineTo(27.799997f, 92.200005f);
generalPath.lineTo(23.499996f, 92.200005f);
generalPath.lineTo(31.299995f, 72.3f);
generalPath.lineTo(35.499996f, 72.3f);
generalPath.lineTo(43.499996f, 92.200005f);
generalPath.closePath();
generalPath.moveTo(36.1f, 84.3f);
generalPath.lineTo(33.399998f, 76.9f);
generalPath.lineTo(30.699997f, 84.3f);
generalPath.lineTo(36.1f, 84.3f);
generalPath.closePath();
generalPath.moveTo(45.6f, 92.200005f);
generalPath.lineTo(45.6f, 72.3f);
generalPath.lineTo(54.1f, 72.3f);
generalPath.curveTo(56.199997f, 72.3f, 57.8f, 72.5f, 58.699997f, 72.8f);
generalPath.curveTo(59.599995f, 73.100006f, 60.399998f, 73.8f, 60.999996f, 74.700005f);
generalPath.curveTo(61.599995f, 75.600006f, 61.899998f, 76.700005f, 61.899998f, 77.8f);
generalPath.curveTo(61.899998f, 79.3f, 61.499996f, 80.5f, 60.6f, 81.5f);
generalPath.curveTo(59.7f, 82.5f, 58.399998f, 83.1f, 56.699997f, 83.3f);
generalPath.curveTo(57.6f, 83.8f, 58.299995f, 84.4f, 58.899998f, 85.0f);
generalPath.curveTo(59.499996f, 85.6f, 60.199997f, 86.7f, 61.199997f, 88.2f);
generalPath.lineTo(63.6f, 92.1f);
generalPath.lineTo(58.8f, 92.1f);
generalPath.lineTo(55.899998f, 87.799995f);
generalPath.curveTo(54.899998f, 86.299995f, 54.199997f, 85.299995f, 53.8f, 84.899994f);
generalPath.curveTo(53.4f, 84.49999f, 53.0f, 84.2f, 52.6f, 84.09999f);
generalPath.curveTo(52.199997f, 83.99999f, 51.5f, 83.899994f, 50.6f, 83.899994f);
generalPath.lineTo(49.8f, 83.899994f);
generalPath.lineTo(49.8f, 92.2f);
generalPath.lineTo(45.6f, 92.2f);
generalPath.closePath();
generalPath.moveTo(49.6f, 80.700005f);
generalPath.lineTo(52.6f, 80.700005f);
generalPath.curveTo(54.5f, 80.700005f, 55.699997f, 80.600006f, 56.199997f, 80.50001f);
generalPath.curveTo(56.699997f, 80.40001f, 57.1f, 80.100006f, 57.299995f, 79.700005f);
generalPath.curveTo(57.599995f, 79.3f, 57.699997f, 78.8f, 57.699997f, 78.200005f);
generalPath.curveTo(57.699997f, 77.50001f, 57.499996f, 77.00001f, 57.199997f, 76.600006f);
generalPath.curveTo(56.799995f, 76.200005f, 56.299995f, 75.90001f, 55.699997f, 75.8f);
generalPath.curveTo(55.399998f, 75.8f, 54.399998f, 75.700005f, 52.799995f, 75.700005f);
generalPath.lineTo(49.699997f, 75.700005f);
generalPath.lineTo(49.699997f, 80.700005f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(44.9f, 27.699999f);
generalPath.lineTo(44.9f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.94200134277344, 74.32599639892578), new Point2D.Double(58.347999572753906, 87.73300170898438), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 251, 255)) : new Color(255, 254, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 250, 241, 255)) : new Color(254, 250, 241, 255)),((colorFilter != null) ? colorFilter.filter(new Color(253, 245, 228, 255)) : new Color(253, 245, 228, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 240, 210, 255)) : new Color(252, 240, 210, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 233, 188, 255)) : new Color(250, 233, 188, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 226, 162, 255)) : new Color(249, 226, 162, 255)),((colorFilter != null) ? colorFilter.filter(new Color(247, 218, 131, 255)) : new Color(247, 218, 131, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 209, 93, 255)) : new Color(244, 209, 93, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 200, 39, 255)) : new Color(241, 200, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(239, 196, 2, 255)) : new Color(239, 196, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(44.9f, 27.699999f);
generalPath.lineTo(44.9f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 156, 2, 255)) : new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(44.9f, 27.699999f);
generalPath.lineTo(44.9f, 0.9f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.0f, 15.8f);
generalPath.lineTo(29.6f, 15.8f);
generalPath.lineTo(29.6f, 10.8f);
generalPath.lineTo(38.0f, 10.8f);
generalPath.lineTo(38.0f, 15.8f);
generalPath.closePath();
generalPath.moveTo(38.0f, 24.7f);
generalPath.lineTo(29.6f, 24.7f);
generalPath.lineTo(29.6f, 29.7f);
generalPath.lineTo(38.0f, 29.7f);
generalPath.lineTo(38.0f, 24.7f);
generalPath.closePath();
generalPath.moveTo(38.0f, 3.9000015f);
generalPath.lineTo(29.6f, 3.9000015f);
generalPath.lineTo(29.6f, 8.900002f);
generalPath.lineTo(38.0f, 8.900002f);
generalPath.lineTo(38.0f, 3.9000015f);
generalPath.closePath();
generalPath.moveTo(38.0f, 17.7f);
generalPath.lineTo(29.6f, 17.7f);
generalPath.lineTo(29.6f, 22.7f);
generalPath.lineTo(38.0f, 22.7f);
generalPath.lineTo(38.0f, 17.7f);
generalPath.closePath();
generalPath.moveTo(38.0f, 31.6f);
generalPath.lineTo(29.6f, 31.6f);
generalPath.lineTo(29.6f, 36.6f);
generalPath.lineTo(38.0f, 36.6f);
generalPath.lineTo(38.0f, 31.599998f);
generalPath.closePath();
generalPath.moveTo(38.7f, 56.2f);
generalPath.curveTo(38.7f, 59.0f, 36.4f, 61.3f, 33.600002f, 61.3f);
generalPath.curveTo(30.800003f, 61.3f, 28.500002f, 59.0f, 28.500002f, 56.2f);
generalPath.lineTo(28.500002f, 55.7f);
generalPath.lineTo(30.200003f, 41.1f);
generalPath.curveTo(30.200003f, 39.199997f, 31.700003f, 37.699997f, 33.600002f, 37.699997f);
generalPath.curveTo(35.4f, 37.699997f, 36.9f, 39.199997f, 37.000004f, 40.999996f);
generalPath.lineTo(38.600002f, 55.399994f);
generalPath.curveTo(38.7f, 55.799995f, 38.7f, 55.999992f, 38.7f, 56.199993f);
generalPath.closePath();
generalPath.moveTo(37.100002f, 56.100002f);
generalPath.curveTo(37.100002f, 54.2f, 35.500004f, 52.600002f, 33.600002f, 52.600002f);
generalPath.curveTo(31.7f, 52.600002f, 30.100002f, 54.2f, 30.100002f, 56.100002f);
generalPath.curveTo(30.100002f, 58.000004f, 31.700003f, 59.600002f, 33.600002f, 59.600002f);
generalPath.curveTo(35.600002f, 59.500004f, 37.100002f, 57.9f, 37.100002f, 56.100002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.617000579833984, 40.68899917602539), new Point2D.Double(33.617000579833984, 98.14800262451172), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(164, 125, 3, 255)) : new Color(164, 125, 3, 255)),((colorFilter != null) ? colorFilter.filter(new Color(222, 190, 0, 255)) : new Color(222, 190, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 173, 4, 255)) : new Color(207, 173, 4, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.5f, 41.6f);
generalPath.lineTo(30.2f, 37.1f);
generalPath.lineTo(30.2f, 34.8f);
generalPath.lineTo(32.5f, 32.6f);
generalPath.lineTo(34.7f, 32.6f);
generalPath.lineTo(37.0f, 34.8f);
generalPath.lineTo(37.0f, 37.1f);
generalPath.lineTo(34.7f, 41.6f);
generalPath.lineTo(32.5f, 41.6f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
		return 0.73499995470047;
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
	private ext_jar() {
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
       ext_jar base = new ext_jar();
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
       ext_jar base = new ext_jar();
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
        return ext_jar::new;
    }
}

