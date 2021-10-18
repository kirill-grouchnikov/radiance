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
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_plist implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 1.0), new Point2D.Double(36.0, 99.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
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
paint = new LinearGradientPaint(new Point2D.Double(45.0620002746582, 72.20999908447266), new Point2D.Double(58.560001373291016, 85.70999908447266), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.9f, 66.4f);
generalPath.lineTo(43.1f, 66.4f);
generalPath.lineTo(43.1f, 72.1f);
generalPath.lineTo(29.9f, 72.1f);
generalPath.lineTo(29.9f, 66.4f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(237, 240, 243, 255)) : new Color(237, 240, 243, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(60.3f, 33.6f);
generalPath.curveTo(59.5f, 32.8f, 58.5f, 32.399998f, 57.399998f, 32.399998f);
generalPath.lineTo(15.7f, 32.399998f);
generalPath.curveTo(14.599999f, 32.399998f, 13.6f, 32.8f, 12.799999f, 33.6f);
generalPath.curveTo(11.999999f, 34.399998f, 11.599999f, 35.399998f, 11.599999f, 36.5f);
generalPath.lineTo(11.599999f, 64.8f);
generalPath.curveTo(11.599999f, 65.9f, 11.999999f, 66.9f, 12.799999f, 67.700005f);
generalPath.curveTo(13.599999f, 68.50001f, 14.599999f, 68.9f, 15.699999f, 68.9f);
generalPath.lineTo(29.899998f, 68.9f);
generalPath.curveTo(29.899998f, 69.6f, 29.799997f, 70.200005f, 29.499998f, 70.9f);
generalPath.curveTo(29.199999f, 71.6f, 28.899998f, 72.200005f, 28.699999f, 72.700005f);
generalPath.curveTo(28.4f, 73.200005f, 28.3f, 73.600006f, 28.3f, 73.8f);
generalPath.curveTo(28.3f, 74.3f, 28.5f, 74.600006f, 28.8f, 75.0f);
generalPath.curveTo(29.099998f, 75.3f, 29.5f, 75.5f, 30.0f, 75.5f);
generalPath.lineTo(43.3f, 75.5f);
generalPath.curveTo(43.8f, 75.5f, 44.1f, 75.3f, 44.5f, 75.0f);
generalPath.curveTo(44.8f, 74.7f, 45.0f, 74.3f, 45.0f, 73.8f);
generalPath.curveTo(45.0f, 73.600006f, 44.9f, 73.200005f, 44.6f, 72.700005f);
generalPath.curveTo(44.3f, 72.200005f, 44.0f, 71.600006f, 43.8f, 70.9f);
generalPath.curveTo(43.5f, 70.200005f, 43.399998f, 69.5f, 43.399998f, 68.9f);
generalPath.lineTo(57.6f, 68.9f);
generalPath.curveTo(58.699997f, 68.9f, 59.699997f, 68.5f, 60.5f, 67.700005f);
generalPath.curveTo(61.3f, 66.9f, 61.7f, 65.9f, 61.7f, 64.8f);
generalPath.lineTo(61.7f, 36.6f);
generalPath.curveTo(61.5f, 35.399998f, 61.100002f, 34.5f, 60.3f, 33.6f);
generalPath.closePath();
generalPath.moveTo(58.2f, 58.3f);
generalPath.curveTo(58.2f, 58.5f, 58.100002f, 58.7f, 58.0f, 58.899998f);
generalPath.curveTo(57.8f, 59.1f, 57.6f, 59.1f, 57.4f, 59.1f);
generalPath.lineTo(15.7f, 59.1f);
generalPath.curveTo(15.5f, 59.1f, 15.3f, 59.0f, 15.099999f, 58.899998f);
generalPath.curveTo(14.9f, 58.699997f, 14.9f, 58.499996f, 14.9f, 58.3f);
generalPath.lineTo(14.9f, 36.6f);
generalPath.curveTo(14.9f, 36.399998f, 15.0f, 36.199997f, 15.099999f, 36.0f);
generalPath.curveTo(15.299999f, 35.8f, 15.499999f, 35.8f, 15.7f, 35.8f);
generalPath.lineTo(57.4f, 35.8f);
generalPath.curveTo(57.600002f, 35.8f, 57.800003f, 35.899998f, 58.0f, 36.0f);
generalPath.curveTo(58.2f, 36.2f, 58.2f, 36.4f, 58.2f, 36.6f);
generalPath.lineTo(58.2f, 58.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.5, 75.75299835205078), new Point2D.Double(36.5, 32.41899871826172), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.6f, 56.6f);
generalPath.curveTo(32.199997f, 56.3f, 31.899998f, 56.0f, 31.599998f, 55.699997f);
generalPath.curveTo(31.3f, 55.299995f, 30.999998f, 54.899998f, 30.8f, 54.499996f);
generalPath.curveTo(30.199999f, 53.599995f, 29.699999f, 52.599995f, 29.4f, 51.599995f);
generalPath.curveTo(29.0f, 50.399994f, 28.8f, 49.299995f, 28.8f, 48.199993f);
generalPath.curveTo(28.8f, 46.999992f, 29.099998f, 45.899994f, 29.599998f, 44.999992f);
generalPath.curveTo(29.999998f, 44.29999f, 30.599998f, 43.699993f, 31.3f, 43.29999f);
generalPath.curveTo(32.0f, 42.89999f, 32.8f, 42.699993f, 33.5f, 42.59999f);
generalPath.curveTo(33.8f, 42.59999f, 34.1f, 42.59999f, 34.4f, 42.69999f);
generalPath.curveTo(34.600002f, 42.799988f, 34.9f, 42.89999f, 35.2f, 42.99999f);
generalPath.curveTo(35.600002f, 43.19999f, 35.9f, 43.299988f, 36.0f, 43.299988f);
generalPath.curveTo(36.3f, 43.399986f, 36.5f, 43.399986f, 36.6f, 43.399986f);
generalPath.curveTo(36.699997f, 43.399986f, 36.899998f, 43.399986f, 37.1f, 43.299988f);
generalPath.curveTo(37.199997f, 43.299988f, 37.399998f, 43.19999f, 37.699997f, 43.099987f);
generalPath.curveTo(37.999996f, 42.999985f, 38.199997f, 42.899986f, 38.399998f, 42.799988f);
generalPath.curveTo(38.699997f, 42.69999f, 38.999996f, 42.599987f, 39.199997f, 42.599987f);
generalPath.curveTo(39.499996f, 42.599987f, 39.799995f, 42.49999f, 40.1f, 42.599987f);
generalPath.curveTo(40.699997f, 42.599987f, 41.199997f, 42.799988f, 41.6f, 42.899986f);
generalPath.curveTo(42.399998f, 43.199986f, 43.1f, 43.699986f, 43.5f, 44.499985f);
generalPath.curveTo(43.3f, 44.599983f, 43.1f, 44.799984f, 42.9f, 44.899986f);
generalPath.curveTo(42.5f, 45.199986f, 42.2f, 45.599987f, 41.9f, 46.099987f);
generalPath.curveTo(41.600002f, 46.699986f, 41.4f, 47.399986f, 41.4f, 48.099987f);
generalPath.curveTo(41.4f, 48.99999f, 41.600002f, 49.699986f, 42.100002f, 50.399986f);
generalPath.curveTo(42.4f, 50.899986f, 42.800003f, 51.299988f, 43.300003f, 51.599987f);
generalPath.curveTo(43.500004f, 51.799988f, 43.800003f, 51.899986f, 44.000004f, 51.99999f);
generalPath.lineTo(43.700005f, 52.89999f);
generalPath.curveTo(43.400005f, 53.49999f, 43.100006f, 54.19999f, 42.700005f, 54.69999f);
generalPath.curveTo(42.400005f, 55.19999f, 42.100006f, 55.59999f, 41.900005f, 55.799988f);
generalPath.curveTo(41.600006f, 56.19999f, 41.300007f, 56.49999f, 41.000004f, 56.69999f);
generalPath.curveTo(40.800003f, 56.799988f, 40.400005f, 56.99999f, 40.000004f, 56.99999f);
generalPath.curveTo(39.700005f, 56.99999f, 39.400005f, 56.99999f, 39.200005f, 56.89999f);
generalPath.curveTo(39.000004f, 56.79999f, 38.700005f, 56.69999f, 38.500004f, 56.59999f);
generalPath.curveTo(38.300003f, 56.499992f, 38.000004f, 56.39999f, 37.800003f, 56.29999f);
generalPath.curveTo(37.500004f, 56.199993f, 37.200005f, 56.199993f, 36.9f, 56.199993f);
generalPath.curveTo(36.600002f, 56.199993f, 36.300003f, 56.199993f, 36.0f, 56.29999f);
generalPath.curveTo(35.8f, 56.39999f, 35.5f, 56.499992f, 35.3f, 56.59999f);
generalPath.curveTo(35.0f, 56.69999f, 34.8f, 56.79999f, 34.6f, 56.89999f);
generalPath.curveTo(34.3f, 56.89999f, 34.0f, 56.99999f, 33.8f, 56.99999f);
generalPath.curveTo(33.399998f, 56.99999f, 33.0f, 56.89999f, 32.6f, 56.599987f);
generalPath.closePath();
generalPath.moveTo(38.0f, 42.0f);
generalPath.curveTo(37.5f, 42.3f, 37.0f, 42.4f, 36.4f, 42.3f);
generalPath.curveTo(36.300003f, 41.8f, 36.4f, 41.3f, 36.600002f, 40.7f);
generalPath.curveTo(36.800003f, 40.2f, 37.000004f, 39.8f, 37.4f, 39.4f);
generalPath.curveTo(37.8f, 39.000004f, 38.2f, 38.600002f, 38.7f, 38.4f);
generalPath.curveTo(39.2f, 38.100002f, 39.7f, 38.0f, 40.2f, 38.0f);
generalPath.curveTo(40.3f, 38.5f, 40.2f, 39.1f, 40.0f, 39.6f);
generalPath.curveTo(39.8f, 40.1f, 39.6f, 40.6f, 39.2f, 41.0f);
generalPath.curveTo(38.9f, 41.4f, 38.5f, 41.8f, 38.0f, 42.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.5, 57.0), new Point2D.Double(36.5, 38.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_plist() {
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
       ext_plist base = new ext_plist();
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
       ext_plist base = new ext_plist();
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
        return ext_plist::new;
    }
}

