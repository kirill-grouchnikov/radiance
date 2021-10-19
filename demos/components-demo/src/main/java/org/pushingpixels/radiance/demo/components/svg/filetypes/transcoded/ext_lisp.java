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
public class ext_lisp implements RadianceIcon {
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
generalPath.moveTo(7.4f, 91.1f);
generalPath.lineTo(7.4f, 71.4f);
generalPath.lineTo(11.4f, 71.4f);
generalPath.lineTo(11.4f, 87.7f);
generalPath.lineTo(21.4f, 87.7f);
generalPath.lineTo(21.4f, 91.0f);
generalPath.lineTo(7.3999996f, 91.0f);
generalPath.closePath();
generalPath.moveTo(24.199999f, 91.1f);
generalPath.lineTo(24.199999f, 71.2f);
generalPath.lineTo(28.199999f, 71.2f);
generalPath.lineTo(28.199999f, 91.0f);
generalPath.lineTo(24.199999f, 91.0f);
generalPath.closePath();
generalPath.moveTo(31.0f, 84.6f);
generalPath.lineTo(34.9f, 84.2f);
generalPath.curveTo(35.100002f, 85.5f, 35.600002f, 86.5f, 36.300003f, 87.1f);
generalPath.curveTo(37.000004f, 87.7f, 38.000004f, 88.0f, 39.200005f, 88.0f);
generalPath.curveTo(40.500004f, 88.0f, 41.500004f, 87.7f, 42.100006f, 87.2f);
generalPath.curveTo(42.800007f, 86.7f, 43.100006f, 86.0f, 43.100006f, 85.299995f);
generalPath.curveTo(43.100006f, 84.799995f, 43.000008f, 84.399994f, 42.700005f, 84.1f);
generalPath.curveTo(42.400005f, 83.799995f, 41.900005f, 83.5f, 41.200005f, 83.2f);
generalPath.curveTo(40.700005f, 83.0f, 39.700005f, 82.7f, 38.000004f, 82.299995f);
generalPath.curveTo(35.800003f, 81.799995f, 34.300003f, 81.1f, 33.500004f, 80.299995f);
generalPath.curveTo(32.300003f, 79.2f, 31.700005f, 77.899994f, 31.700005f, 76.299995f);
generalPath.curveTo(31.700005f, 75.299995f, 32.000004f, 74.299995f, 32.600006f, 73.49999f);
generalPath.curveTo(33.200005f, 72.59999f, 34.000008f, 71.99999f, 35.100006f, 71.49999f);
generalPath.curveTo(36.200005f, 70.99999f, 37.500008f, 70.799995f, 39.000008f, 70.799995f);
generalPath.curveTo(41.500008f, 70.799995f, 43.40001f, 71.299995f, 44.70001f, 72.399994f);
generalPath.curveTo(46.000008f, 73.49999f, 46.60001f, 74.899994f, 46.70001f, 76.799995f);
generalPath.lineTo(42.70001f, 76.99999f);
generalPath.curveTo(42.500008f, 75.99999f, 42.20001f, 75.19999f, 41.60001f, 74.799995f);
generalPath.curveTo(41.00001f, 74.399994f, 40.20001f, 74.1f, 39.00001f, 74.1f);
generalPath.curveTo(37.80001f, 74.1f, 36.900013f, 74.299995f, 36.200012f, 74.799995f);
generalPath.curveTo(35.80001f, 75.1f, 35.600014f, 75.49999f, 35.600014f, 75.99999f);
generalPath.curveTo(35.600014f, 76.49999f, 35.800014f, 76.899994f, 36.200012f, 77.19999f);
generalPath.curveTo(36.700012f, 77.59999f, 37.900013f, 78.09999f, 39.900013f, 78.49999f);
generalPath.curveTo(41.900013f, 78.899994f, 43.300014f, 79.399994f, 44.300014f, 79.899994f);
generalPath.curveTo(45.200016f, 80.399994f, 46.000015f, 81.09999f, 46.500015f, 81.899994f);
generalPath.curveTo(47.000015f, 82.799995f, 47.300014f, 83.799995f, 47.300014f, 85.09999f);
generalPath.curveTo(47.300014f, 86.19999f, 47.000015f, 87.29999f, 46.300014f, 88.29999f);
generalPath.curveTo(45.600014f, 89.29999f, 44.800014f, 89.999985f, 43.600014f, 90.499985f);
generalPath.curveTo(42.400013f, 90.999985f, 41.000015f, 91.19998f, 39.300014f, 91.19998f);
generalPath.curveTo(36.800014f, 91.19998f, 34.800014f, 90.59998f, 33.500015f, 89.499985f);
generalPath.curveTo(32.100014f, 88.499985f, 31.300014f, 86.79999f, 31.000015f, 84.59998f);
generalPath.closePath();
generalPath.moveTo(50.7f, 91.1f);
generalPath.lineTo(50.7f, 71.2f);
generalPath.lineTo(57.2f, 71.2f);
generalPath.curveTo(59.7f, 71.2f, 61.3f, 71.299995f, 62.0f, 71.5f);
generalPath.curveTo(63.1f, 71.8f, 64.1f, 72.4f, 64.9f, 73.4f);
generalPath.curveTo(65.700005f, 74.4f, 66.1f, 75.700005f, 66.1f, 77.3f);
generalPath.curveTo(66.1f, 78.5f, 65.9f, 79.5f, 65.4f, 80.4f);
generalPath.curveTo(64.9f, 81.3f, 64.4f, 81.9f, 63.7f, 82.4f);
generalPath.curveTo(63.0f, 82.9f, 62.3f, 83.200005f, 61.600002f, 83.3f);
generalPath.curveTo(60.600002f, 83.5f, 59.2f, 83.600006f, 57.4f, 83.600006f);
generalPath.lineTo(54.800003f, 83.600006f);
generalPath.lineTo(54.800003f, 91.100006f);
generalPath.lineTo(50.700005f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(54.7f, 74.6f);
generalPath.lineTo(54.7f, 80.2f);
generalPath.lineTo(56.9f, 80.2f);
generalPath.curveTo(58.5f, 80.2f, 59.600002f, 80.1f, 60.100002f, 79.899994f);
generalPath.curveTo(60.600002f, 79.7f, 61.100002f, 79.399994f, 61.4f, 78.899994f);
generalPath.curveTo(61.7f, 78.49999f, 61.9f, 77.899994f, 61.9f, 77.399994f);
generalPath.curveTo(61.9f, 76.7f, 61.7f, 76.09999f, 61.300003f, 75.59999f);
generalPath.curveTo(60.9f, 75.09999f, 60.300003f, 74.79999f, 59.700005f, 74.69999f);
generalPath.curveTo(59.200005f, 74.59999f, 58.300003f, 74.59999f, 56.800003f, 74.59999f);
generalPath.lineTo(54.700005f, 74.59999f);
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
// _0_4
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
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.3f, 54.2f);
generalPath.lineTo(50.3f, 54.2f);
generalPath.curveTo(50.3f, 57.100002f, 49.8f, 59.100002f, 48.899998f, 60.4f);
generalPath.curveTo(47.999996f, 61.7f, 46.8f, 62.4f, 45.399998f, 62.4f);
generalPath.curveTo(44.3f, 62.4f, 43.199997f, 62.0f, 42.1f, 61.100002f);
generalPath.curveTo(41.1f, 60.300003f, 40.1f, 57.9f, 39.3f, 54.2f);
generalPath.lineTo(37.0f, 43.7f);
generalPath.lineTo(28.9f, 62.0f);
generalPath.lineTo(23.8f, 62.0f);
generalPath.lineTo(35.4f, 37.0f);
generalPath.curveTo(34.800003f, 33.8f, 34.0f, 31.4f, 33.2f, 29.8f);
generalPath.curveTo(32.4f, 28.199999f, 31.300001f, 27.5f, 30.0f, 27.5f);
generalPath.curveTo(29.0f, 27.5f, 28.1f, 27.9f, 27.3f, 28.7f);
generalPath.curveTo(26.5f, 29.5f, 26.099998f, 30.7f, 26.0f, 32.4f);
generalPath.lineTo(25.0f, 32.4f);
generalPath.curveTo(25.1f, 29.7f, 25.6f, 27.600002f, 26.6f, 26.000002f);
generalPath.curveTo(27.6f, 24.400002f, 28.9f, 23.600002f, 30.4f, 23.600002f);
generalPath.curveTo(31.4f, 23.600002f, 32.3f, 24.000002f, 33.2f, 24.800003f);
generalPath.curveTo(34.100002f, 25.600004f, 34.8f, 27.000004f, 35.5f, 28.900003f);
generalPath.curveTo(36.2f, 30.800003f, 37.2f, 34.9f, 38.5f, 41.000004f);
generalPath.lineTo(40.4f, 49.600006f);
generalPath.curveTo(41.2f, 53.200005f, 42.0f, 55.500008f, 42.800003f, 56.700005f);
generalPath.curveTo(43.600006f, 57.9f, 44.700005f, 58.500004f, 45.9f, 58.500004f);
generalPath.curveTo(47.9f, 58.500004f, 49.0f, 57.100002f, 49.300003f, 54.200005f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 62.41400146484375), new Point2D.Double(37.0, 23.586000442504883), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.78799819946289, 63.16400146484375), new Point2D.Double(36.78799819946289, 22.836000442504883), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.3f, 54.2f);
generalPath.lineTo(50.3f, 54.2f);
generalPath.curveTo(50.3f, 57.100002f, 49.8f, 59.100002f, 48.899998f, 60.4f);
generalPath.curveTo(47.999996f, 61.7f, 46.8f, 62.4f, 45.399998f, 62.4f);
generalPath.curveTo(44.3f, 62.4f, 43.199997f, 62.0f, 42.1f, 61.100002f);
generalPath.curveTo(41.1f, 60.300003f, 40.1f, 57.9f, 39.3f, 54.2f);
generalPath.lineTo(37.0f, 43.7f);
generalPath.lineTo(28.9f, 62.0f);
generalPath.lineTo(23.8f, 62.0f);
generalPath.lineTo(35.4f, 37.0f);
generalPath.curveTo(34.800003f, 33.8f, 34.0f, 31.4f, 33.2f, 29.8f);
generalPath.curveTo(32.4f, 28.199999f, 31.300001f, 27.5f, 30.0f, 27.5f);
generalPath.curveTo(29.0f, 27.5f, 28.1f, 27.9f, 27.3f, 28.7f);
generalPath.curveTo(26.5f, 29.5f, 26.099998f, 30.7f, 26.0f, 32.4f);
generalPath.lineTo(25.0f, 32.4f);
generalPath.curveTo(25.1f, 29.7f, 25.6f, 27.600002f, 26.6f, 26.000002f);
generalPath.curveTo(27.6f, 24.400002f, 28.9f, 23.600002f, 30.4f, 23.600002f);
generalPath.curveTo(31.4f, 23.600002f, 32.3f, 24.000002f, 33.2f, 24.800003f);
generalPath.curveTo(34.100002f, 25.600004f, 34.8f, 27.000004f, 35.5f, 28.900003f);
generalPath.curveTo(36.2f, 30.800003f, 37.2f, 34.9f, 38.5f, 41.000004f);
generalPath.lineTo(40.4f, 49.600006f);
generalPath.curveTo(41.2f, 53.200005f, 42.0f, 55.500008f, 42.800003f, 56.700005f);
generalPath.curveTo(43.600006f, 57.9f, 44.700005f, 58.500004f, 45.9f, 58.500004f);
generalPath.curveTo(47.9f, 58.500004f, 49.0f, 57.100002f, 49.300003f, 54.200005f);
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
	private ext_lisp() {
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
       ext_lisp base = new ext_lisp();
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
       ext_lisp base = new ext_lisp();
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
        return ext_lisp::new;
    }
}

