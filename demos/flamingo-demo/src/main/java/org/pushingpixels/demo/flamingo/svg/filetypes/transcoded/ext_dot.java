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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_dot implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.056f,0.16f,0.274f,0.398f,0.539f,0.711f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 45, 68, 255)) : new Color(0, 45, 68, 255)),((colorFilter != null) ? colorFilter.filter(new Color(1, 56, 82, 255)) : new Color(1, 56, 82, 255)),((colorFilter != null) ? colorFilter.filter(new Color(10, 77, 107, 255)) : new Color(10, 77, 107, 255)),((colorFilter != null) ? colorFilter.filter(new Color(15, 94, 130, 255)) : new Color(15, 94, 130, 255)),((colorFilter != null) ? colorFilter.filter(new Color(15, 109, 150, 255)) : new Color(15, 109, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(13, 119, 164, 255)) : new Color(13, 119, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(10, 126, 174, 255)) : new Color(10, 126, 174, 255)),((colorFilter != null) ? colorFilter.filter(new Color(8, 129, 178, 255)) : new Color(8, 129, 178, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(1, 65, 94, 255)) : new Color(1, 65, 94, 255);
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
generalPath.moveTo(8.2f, 71.2f);
generalPath.lineTo(15.6f, 71.2f);
generalPath.curveTo(17.300001f, 71.2f, 18.5f, 71.299995f, 19.4f, 71.6f);
generalPath.curveTo(20.6f, 71.9f, 21.6f, 72.6f, 22.4f, 73.4f);
generalPath.curveTo(23.199999f, 74.3f, 23.9f, 75.3f, 24.3f, 76.6f);
generalPath.curveTo(24.699999f, 77.9f, 25.0f, 79.4f, 25.0f, 81.299995f);
generalPath.curveTo(25.0f, 82.899994f, 24.8f, 84.299995f, 24.4f, 85.49999f);
generalPath.curveTo(23.9f, 86.899994f, 23.199999f, 88.09999f, 22.3f, 88.99999f);
generalPath.curveTo(21.599998f, 89.69999f, 20.699999f, 90.19999f, 19.5f, 90.59999f);
generalPath.curveTo(18.6f, 90.899994f, 17.4f, 90.99999f, 15.9f, 90.99999f);
generalPath.lineTo(8.2f, 90.99999f);
generalPath.lineTo(8.2f, 71.2f);
generalPath.closePath();
generalPath.moveTo(12.299999f, 74.6f);
generalPath.lineTo(12.299999f, 87.7f);
generalPath.lineTo(15.299999f, 87.7f);
generalPath.curveTo(16.4f, 87.7f, 17.199999f, 87.6f, 17.699999f, 87.5f);
generalPath.curveTo(18.4f, 87.3f, 18.9f, 87.1f, 19.3f, 86.7f);
generalPath.curveTo(19.699999f, 86.299995f, 20.099998f, 85.7f, 20.4f, 84.799995f);
generalPath.curveTo(20.7f, 83.899994f, 20.8f, 82.7f, 20.8f, 81.2f);
generalPath.curveTo(20.8f, 79.7f, 20.699999f, 78.5f, 20.4f, 77.7f);
generalPath.curveTo(20.1f, 76.899994f, 19.699999f, 76.2f, 19.3f, 75.799995f);
generalPath.curveTo(18.9f, 75.399994f, 18.199999f, 74.99999f, 17.4f, 74.899994f);
generalPath.curveTo(16.8f, 74.799995f, 15.7f, 74.7f, 14.099999f, 74.7f);
generalPath.lineTo(12.299999f, 74.7f);
generalPath.closePath();
generalPath.moveTo(27.699999f, 81.299995f);
generalPath.curveTo(27.699999f, 79.299995f, 27.999998f, 77.6f, 28.599998f, 76.2f);
generalPath.curveTo(29.099998f, 75.2f, 29.699999f, 74.299995f, 30.499998f, 73.5f);
generalPath.curveTo(31.299997f, 72.7f, 32.199997f, 72.1f, 33.1f, 71.7f);
generalPath.curveTo(34.3f, 71.2f, 35.8f, 70.899994f, 37.399998f, 70.899994f);
generalPath.curveTo(40.399998f, 70.899994f, 42.699997f, 71.799995f, 44.499996f, 73.59999f);
generalPath.curveTo(46.299995f, 75.399994f, 47.199997f, 77.899994f, 47.199997f, 81.19999f);
generalPath.curveTo(47.199997f, 84.39999f, 46.299995f, 86.89999f, 44.6f, 88.69999f);
generalPath.curveTo(42.9f, 90.49999f, 40.5f, 91.39999f, 37.5f, 91.39999f);
generalPath.curveTo(34.5f, 91.39999f, 32.1f, 90.499985f, 30.4f, 88.69999f);
generalPath.curveTo(28.5f, 86.89999f, 27.699999f, 84.39999f, 27.699999f, 81.29999f);
generalPath.closePath();
generalPath.moveTo(31.8f, 81.1f);
generalPath.curveTo(31.8f, 83.299995f, 32.3f, 85.1f, 33.399998f, 86.2f);
generalPath.curveTo(34.399998f, 87.399994f, 35.8f, 87.899994f, 37.399998f, 87.899994f);
generalPath.curveTo(38.999996f, 87.899994f, 40.3f, 87.299995f, 41.399998f, 86.2f);
generalPath.curveTo(42.399998f, 85.0f, 42.999996f, 83.299995f, 42.999996f, 81.0f);
generalPath.curveTo(42.999996f, 78.7f, 42.499996f, 77.0f, 41.499996f, 75.9f);
generalPath.curveTo(40.499996f, 74.8f, 39.199997f, 74.200005f, 37.499996f, 74.200005f);
generalPath.curveTo(35.799995f, 74.200005f, 34.499996f, 74.8f, 33.499996f, 75.9f);
generalPath.curveTo(32.299995f, 77.1f, 31.799995f, 78.8f, 31.799995f, 81.1f);
generalPath.closePath();
generalPath.moveTo(54.8f, 91.1f);
generalPath.lineTo(54.8f, 74.6f);
generalPath.lineTo(48.899998f, 74.6f);
generalPath.lineTo(48.899998f, 71.2f);
generalPath.lineTo(64.799995f, 71.2f);
generalPath.lineTo(64.799995f, 74.6f);
generalPath.lineTo(58.899994f, 74.6f);
generalPath.lineTo(58.899994f, 91.1f);
generalPath.lineTo(54.799995f, 91.1f);
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
generalPath.moveTo(64.4f, 25.7f);
generalPath.curveTo(63.9f, 25.7f, 63.4f, 25.900002f, 63.0f, 26.0f);
generalPath.curveTo(62.5f, 26.2f, 62.0f, 26.4f, 61.6f, 26.6f);
generalPath.curveTo(60.899998f, 27.0f, 60.399998f, 27.4f, 60.1f, 27.9f);
generalPath.curveTo(59.8f, 28.4f, 59.5f, 29.0f, 59.3f, 29.6f);
generalPath.curveTo(58.399998f, 32.0f, 57.1f, 35.6f, 55.3f, 40.9f);
generalPath.curveTo(53.5f, 46.0f, 51.7f, 51.4f, 49.7f, 56.9f);
generalPath.lineTo(45.0f, 56.9f);
generalPath.lineTo(36.3f, 32.5f);
generalPath.lineTo(28.4f, 56.9f);
generalPath.lineTo(23.7f, 56.9f);
generalPath.curveTo(21.1f, 49.4f, 19.1f, 43.600002f, 17.7f, 39.7f);
generalPath.curveTo(16.300001f, 35.600002f, 15.200001f, 32.3f, 14.200001f, 29.5f);
generalPath.curveTo(13.900001f, 28.7f, 13.6f, 28.1f, 13.200001f, 27.7f);
generalPath.curveTo(12.800001f, 27.300001f, 12.300001f, 26.900002f, 11.800001f, 26.5f);
generalPath.curveTo(11.400002f, 26.2f, 10.900002f, 26.0f, 10.500001f, 25.9f);
generalPath.curveTo(10.000001f, 25.8f, 9.500001f, 25.699999f, 8.900001f, 25.6f);
generalPath.lineTo(8.900001f, 23.800001f);
generalPath.lineTo(26.5f, 23.800001f);
generalPath.lineTo(26.5f, 25.6f);
generalPath.curveTo(25.5f, 25.7f, 24.7f, 25.800001f, 24.2f, 26.0f);
generalPath.curveTo(23.7f, 26.1f, 23.300001f, 26.2f, 23.0f, 26.4f);
generalPath.curveTo(22.7f, 26.5f, 22.5f, 26.699999f, 22.5f, 26.8f);
generalPath.curveTo(22.4f, 26.9f, 22.4f, 27.099998f, 22.4f, 27.199999f);
generalPath.curveTo(22.4f, 27.4f, 22.4f, 27.599998f, 22.5f, 27.8f);
generalPath.curveTo(22.6f, 28.0f, 22.6f, 28.199999f, 22.7f, 28.5f);
generalPath.curveTo(23.1f, 29.7f, 23.800001f, 32.0f, 25.0f, 35.3f);
generalPath.curveTo(26.1f, 38.7f, 27.5f, 42.8f, 29.2f, 47.8f);
generalPath.lineTo(36.7f, 24.0f);
generalPath.lineTo(41.600002f, 24.0f);
generalPath.lineTo(50.300003f, 48.5f);
generalPath.curveTo(51.600002f, 44.5f, 52.600002f, 41.3f, 53.4f, 38.8f);
generalPath.curveTo(54.2f, 36.3f, 54.800003f, 34.1f, 55.300003f, 32.399998f);
generalPath.curveTo(55.600002f, 31.299997f, 55.9f, 30.399998f, 56.000004f, 29.599998f);
generalPath.curveTo(56.200005f, 28.899998f, 56.300003f, 28.199999f, 56.300003f, 27.699999f);
generalPath.curveTo(56.300003f, 27.4f, 56.100002f, 27.099998f, 55.800003f, 26.9f);
generalPath.curveTo(55.500004f, 26.699999f, 55.100002f, 26.5f, 54.600002f, 26.3f);
generalPath.curveTo(54.2f, 26.199999f, 53.600002f, 26.0f, 52.9f, 26.0f);
generalPath.curveTo(52.2f, 25.9f, 51.600002f, 25.8f, 51.100002f, 25.8f);
generalPath.lineTo(51.100002f, 23.8f);
generalPath.lineTo(64.4f, 23.8f);
generalPath.lineTo(64.4f, 25.699999f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.121000289916992, 50.46799850463867), new Point2D.Double(55.04100036621094, 87.38899993896484), new float[] {0.005f,0.116f,0.239f,0.369f,0.502f,0.639f,0.779f,0.918f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 97, 134, 255)) : new Color(0, 97, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 95, 131, 255)) : new Color(0, 95, 131, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 90, 125, 255)) : new Color(0, 90, 125, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 83, 115, 255)) : new Color(0, 83, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 72, 101, 255)) : new Color(0, 72, 101, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 57, 83, 255)) : new Color(0, 57, 83, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 37, 60, 255)) : new Color(0, 37, 60, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 3, 29, 255)) : new Color(0, 3, 29, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 74.20500183105469), new Point2D.Double(58.569000244140625, 87.70500183105469), new float[] {0.005f,0.3f,0.443f,0.553f,0.647f,0.73f,0.805f,0.875f,0.938f,0.998f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(223, 241, 250, 255)) : new Color(223, 241, 250, 255)),((colorFilter != null) ? colorFilter.filter(new Color(220, 238, 247, 255)) : new Color(220, 238, 247, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 228, 239, 255)) : new Color(211, 228, 239, 255)),((colorFilter != null) ? colorFilter.filter(new Color(196, 214, 227, 255)) : new Color(196, 214, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(177, 197, 213, 255)) : new Color(177, 197, 213, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 176, 197, 255)) : new Color(154, 176, 197, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 154, 179, 255)) : new Color(129, 154, 179, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 130, 159, 255)) : new Color(100, 130, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 108, 140, 255)) : new Color(66, 108, 140, 255)),((colorFilter != null) ? colorFilter.filter(new Color(6, 87, 122, 255)) : new Color(6, 87, 122, 255)),((colorFilter != null) ? colorFilter.filter(new Color(1, 86, 121, 255)) : new Color(1, 86, 121, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(1, 65, 94, 255)) : new Color(1, 65, 94, 255);
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
	private ext_dot() {
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
       ext_dot base = new ext_dot();
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
       ext_dot base = new ext_dot();
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
        return ext_dot::new;
    }
}

