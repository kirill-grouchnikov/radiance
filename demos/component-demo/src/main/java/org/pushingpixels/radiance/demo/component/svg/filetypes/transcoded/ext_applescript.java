package org.pushingpixels.radiance.demo.component.svg.filetypes.transcoded;

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
public class ext_applescript implements RadianceIcon {
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(52.7f, 32.2f);
generalPath.lineTo(26.9f, 32.2f);
generalPath.curveTo(23.4f, 32.2f, 20.4f, 35.100002f, 20.4f, 38.7f);
generalPath.lineTo(20.4f, 67.8f);
generalPath.lineTo(14.0f, 67.8f);
generalPath.curveTo(14.0f, 71.3f, 16.9f, 74.3f, 20.5f, 74.3f);
generalPath.lineTo(46.4f, 74.3f);
generalPath.curveTo(49.9f, 74.3f, 52.9f, 71.4f, 52.9f, 67.8f);
generalPath.lineTo(52.9f, 41.9f);
generalPath.lineTo(59.4f, 41.9f);
generalPath.lineTo(59.4f, 38.7f);
generalPath.curveTo(59.2f, 35.100002f, 56.300003f, 32.2f, 52.7f, 32.2f);
generalPath.closePath();
generalPath.moveTo(49.5f, 67.2f);
generalPath.curveTo(49.5f, 69.299995f, 47.8f, 71.0f, 45.7f, 71.0f);
generalPath.lineTo(22.1f, 71.0f);
generalPath.curveTo(23.7f, 69.9f, 23.7f, 67.8f, 23.7f, 67.8f);
generalPath.lineTo(23.7f, 38.7f);
generalPath.curveTo(23.7f, 36.9f, 25.1f, 35.5f, 26.900002f, 35.5f);
generalPath.curveTo(28.7f, 35.5f, 30.100002f, 36.9f, 30.100002f, 38.7f);
generalPath.lineTo(30.100002f, 41.9f);
generalPath.lineTo(49.5f, 41.9f);
generalPath.lineTo(49.5f, 67.2f);
generalPath.closePath();
generalPath.moveTo(33.4f, 38.7f);
generalPath.lineTo(33.4f, 35.5f);
generalPath.lineTo(52.800003f, 35.5f);
generalPath.curveTo(55.700005f, 35.5f, 56.000004f, 37.3f, 56.000004f, 38.7f);
generalPath.lineTo(33.4f, 38.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 74.23100280761719), new Point2D.Double(36.63199996948242, 32.23099899291992), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 74.60600280761719), new Point2D.Double(36.63199996948242, 31.856000900268555), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(52.7f, 32.2f);
generalPath.lineTo(26.9f, 32.2f);
generalPath.curveTo(23.4f, 32.2f, 20.4f, 35.100002f, 20.4f, 38.7f);
generalPath.lineTo(20.4f, 67.8f);
generalPath.lineTo(14.0f, 67.8f);
generalPath.curveTo(14.0f, 71.3f, 16.9f, 74.3f, 20.5f, 74.3f);
generalPath.lineTo(46.4f, 74.3f);
generalPath.curveTo(49.9f, 74.3f, 52.9f, 71.4f, 52.9f, 67.8f);
generalPath.lineTo(52.9f, 41.9f);
generalPath.lineTo(59.4f, 41.9f);
generalPath.lineTo(59.4f, 38.7f);
generalPath.curveTo(59.2f, 35.100002f, 56.300003f, 32.2f, 52.7f, 32.2f);
generalPath.closePath();
generalPath.moveTo(49.5f, 67.2f);
generalPath.curveTo(49.5f, 69.299995f, 47.8f, 71.0f, 45.7f, 71.0f);
generalPath.lineTo(22.1f, 71.0f);
generalPath.curveTo(23.7f, 69.9f, 23.7f, 67.8f, 23.7f, 67.8f);
generalPath.lineTo(23.7f, 38.7f);
generalPath.curveTo(23.7f, 36.9f, 25.1f, 35.5f, 26.900002f, 35.5f);
generalPath.curveTo(28.7f, 35.5f, 30.100002f, 36.9f, 30.100002f, 38.7f);
generalPath.lineTo(30.100002f, 41.9f);
generalPath.lineTo(49.5f, 41.9f);
generalPath.lineTo(49.5f, 67.2f);
generalPath.closePath();
generalPath.moveTo(33.4f, 38.7f);
generalPath.lineTo(33.4f, 35.5f);
generalPath.lineTo(52.800003f, 35.5f);
generalPath.curveTo(55.700005f, 35.5f, 56.000004f, 37.3f, 56.000004f, 38.7f);
generalPath.lineTo(33.4f, 38.7f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.0f, 63.4f);
generalPath.curveTo(32.7f, 63.2f, 32.3f, 62.9f, 32.1f, 62.600002f);
generalPath.curveTo(31.8f, 62.300003f, 31.599998f, 61.9f, 31.3f, 61.500004f);
generalPath.curveTo(30.699999f, 60.700005f, 30.3f, 59.800003f, 30.0f, 58.800003f);
generalPath.curveTo(29.6f, 57.700005f, 29.5f, 56.600002f, 29.5f, 55.600002f);
generalPath.curveTo(29.5f, 54.4f, 29.7f, 53.4f, 30.2f, 52.600002f);
generalPath.curveTo(30.6f, 51.9f, 31.1f, 51.4f, 31.7f, 51.000004f);
generalPath.curveTo(32.3f, 50.600002f, 33.100002f, 50.400005f, 33.8f, 50.400005f);
generalPath.curveTo(34.1f, 50.400005f, 34.3f, 50.400005f, 34.6f, 50.500004f);
generalPath.curveTo(34.8f, 50.600002f, 35.1f, 50.700005f, 35.399998f, 50.800003f);
generalPath.curveTo(35.8f, 51.000004f, 35.999996f, 51.000004f, 36.1f, 51.100002f);
generalPath.curveTo(36.3f, 51.2f, 36.5f, 51.2f, 36.699997f, 51.2f);
generalPath.curveTo(36.799995f, 51.2f, 36.999996f, 51.2f, 37.199997f, 51.100002f);
generalPath.curveTo(37.299995f, 51.100002f, 37.499996f, 51.000004f, 37.799995f, 50.9f);
generalPath.curveTo(38.099995f, 50.8f, 38.299995f, 50.7f, 38.499996f, 50.600002f);
generalPath.curveTo(38.799995f, 50.500004f, 38.999996f, 50.4f, 39.299995f, 50.4f);
generalPath.curveTo(39.599995f, 50.4f, 39.899994f, 50.300003f, 40.099995f, 50.4f);
generalPath.curveTo(40.599995f, 50.4f, 41.099995f, 50.5f, 41.499996f, 50.7f);
generalPath.curveTo(42.199997f, 51.0f, 42.899998f, 51.5f, 43.299995f, 52.100002f);
generalPath.curveTo(43.099995f, 52.2f, 42.899994f, 52.4f, 42.799995f, 52.500004f);
generalPath.curveTo(42.399994f, 52.800003f, 42.099995f, 53.200005f, 41.899994f, 53.600002f);
generalPath.curveTo(41.599995f, 54.2f, 41.399994f, 54.800003f, 41.399994f, 55.500004f);
generalPath.curveTo(41.399994f, 56.300003f, 41.599995f, 57.000004f, 41.999992f, 57.600002f);
generalPath.curveTo(42.29999f, 58.000004f, 42.699993f, 58.4f, 43.09999f, 58.7f);
generalPath.curveTo(43.29999f, 58.9f, 43.499992f, 59.0f, 43.69999f, 59.0f);
generalPath.curveTo(43.59999f, 59.3f, 43.49999f, 59.5f, 43.39999f, 59.8f);
generalPath.curveTo(43.09999f, 60.399998f, 42.79999f, 61.0f, 42.49999f, 61.5f);
generalPath.curveTo(42.19999f, 62.0f, 41.89999f, 62.3f, 41.69999f, 62.5f);
generalPath.curveTo(41.39999f, 62.9f, 41.09999f, 63.1f, 40.799988f, 63.3f);
generalPath.curveTo(40.49999f, 63.5f, 40.099987f, 63.6f, 39.69999f, 63.6f);
generalPath.curveTo(39.39999f, 63.6f, 39.19999f, 63.6f, 38.89999f, 63.5f);
generalPath.curveTo(38.69999f, 63.4f, 38.49999f, 63.4f, 38.29999f, 63.3f);
generalPath.curveTo(38.09999f, 63.2f, 37.89999f, 63.1f, 37.59999f, 63.1f);
generalPath.curveTo(37.499992f, 63.0f, 37.19999f, 63.0f, 36.89999f, 63.0f);
generalPath.curveTo(36.59999f, 63.0f, 36.29999f, 63.0f, 35.99999f, 63.1f);
generalPath.curveTo(35.799988f, 63.199997f, 35.599987f, 63.199997f, 35.299988f, 63.3f);
generalPath.curveTo(34.99999f, 63.399998f, 34.799988f, 63.5f, 34.69999f, 63.5f);
generalPath.curveTo(34.49999f, 63.6f, 34.19999f, 63.6f, 33.99999f, 63.6f);
generalPath.curveTo(33.69999f, 63.699997f, 33.299988f, 63.6f, 32.99999f, 63.399998f);
generalPath.closePath();
generalPath.moveTo(38.0f, 49.800003f);
generalPath.curveTo(37.5f, 50.000004f, 37.0f, 50.200005f, 36.6f, 50.100002f);
generalPath.curveTo(36.5f, 49.600002f, 36.6f, 49.100002f, 36.8f, 48.600002f);
generalPath.curveTo(37.0f, 48.100002f, 37.2f, 47.7f, 37.5f, 47.4f);
generalPath.curveTo(37.8f, 47.0f, 38.2f, 46.7f, 38.7f, 46.5f);
generalPath.curveTo(39.2f, 46.3f, 39.600002f, 46.1f, 40.100002f, 46.1f);
generalPath.curveTo(40.2f, 46.6f, 40.100002f, 47.1f, 39.9f, 47.6f);
generalPath.curveTo(39.7f, 48.1f, 39.5f, 48.5f, 39.2f, 48.899998f);
generalPath.curveTo(38.8f, 49.3f, 38.4f, 49.6f, 38.0f, 49.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.58399963378906, 63.736000061035156), new Point2D.Double(36.58399963378906, 46.09600067138672), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
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
	private ext_applescript() {
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
       ext_applescript base = new ext_applescript();
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
       ext_applescript base = new ext_applescript();
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
        return ext_applescript::new;
    }
}

