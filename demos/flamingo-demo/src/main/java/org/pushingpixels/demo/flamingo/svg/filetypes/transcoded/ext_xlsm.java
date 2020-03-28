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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_xlsm implements ResizableIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
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
generalPath.moveTo(45.0f, 0.7f);
generalPath.lineTo(72.0f, 27.6f);
generalPath.lineTo(72.0f, 99.2f);
generalPath.lineTo(0.0f, 99.2f);
generalPath.lineTo(0.0f, 0.7f);
generalPath.lineTo(45.0f, 0.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 99.19999694824219), new Point2D.Double(36.0, 0.699999988079071), new float[] {0.0f,0.102f,0.222f,0.355f,0.506f,0.69f,1.0f}, new Color[] {new Color(81, 132, 42, 255),new Color(96, 150, 49, 255),new Color(109, 167, 55, 255),new Color(119, 179, 59, 255),new Color(126, 187, 62, 255),new Color(131, 193, 64, 255),new Color(133, 196, 65, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.0f, 0.7f);
generalPath.lineTo(72.0f, 27.6f);
generalPath.lineTo(72.0f, 99.2f);
generalPath.lineTo(0.0f, 99.2f);
generalPath.lineTo(0.0f, 0.7f);
generalPath.lineTo(45.0f, 0.7f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(82, 130, 40, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.7f);
generalPath.lineTo(72.0f, 27.6f);
generalPath.lineTo(72.0f, 99.2f);
generalPath.lineTo(0.0f, 99.2f);
generalPath.lineTo(0.0f, 0.7f);
generalPath.lineTo(45.0f, 0.7f);
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
generalPath.moveTo(57.8f, 61.4f);
generalPath.lineTo(35.2f, 61.4f);
generalPath.lineTo(35.2f, 59.4f);
generalPath.curveTo(37.4f, 59.300003f, 38.7f, 59.100002f, 39.4f, 58.800003f);
generalPath.curveTo(40.0f, 58.500004f, 40.300003f, 58.200005f, 40.300003f, 57.800003f);
generalPath.curveTo(40.300003f, 57.600002f, 40.200005f, 57.200005f, 40.000004f, 56.700005f);
generalPath.curveTo(39.800003f, 56.200005f, 39.500004f, 55.600006f, 39.100002f, 55.000004f);
generalPath.curveTo(38.500004f, 54.000004f, 37.7f, 52.700005f, 36.7f, 51.200005f);
generalPath.curveTo(35.7f, 49.700005f, 34.600002f, 48.100006f, 33.5f, 46.400005f);
generalPath.curveTo(29.9f, 50.600006f, 27.5f, 53.400005f, 26.6f, 54.800003f);
generalPath.curveTo(25.6f, 56.200005f, 25.1f, 57.100002f, 25.1f, 57.600002f);
generalPath.curveTo(25.1f, 57.800003f, 25.1f, 58.000004f, 25.2f, 58.2f);
generalPath.curveTo(25.300001f, 58.4f, 25.5f, 58.5f, 25.800001f, 58.7f);
generalPath.curveTo(26.000002f, 58.8f, 26.500002f, 59.0f, 27.1f, 59.100002f);
generalPath.curveTo(27.7f, 59.2f, 28.4f, 59.300003f, 29.2f, 59.4f);
generalPath.lineTo(29.2f, 61.4f);
generalPath.lineTo(14.8f, 61.4f);
generalPath.lineTo(14.8f, 59.4f);
generalPath.curveTo(15.5f, 59.300003f, 16.1f, 59.300003f, 16.6f, 59.2f);
generalPath.curveTo(17.0f, 59.100002f, 17.5f, 59.0f, 17.9f, 58.8f);
generalPath.curveTo(18.9f, 58.3f, 19.8f, 57.7f, 20.6f, 57.0f);
generalPath.curveTo(21.4f, 56.3f, 22.2f, 55.4f, 23.0f, 54.5f);
generalPath.curveTo(24.2f, 53.1f, 25.6f, 51.6f, 27.1f, 49.8f);
generalPath.curveTo(28.6f, 48.1f, 30.2f, 46.2f, 31.900002f, 44.2f);
generalPath.curveTo(30.300001f, 41.8f, 28.7f, 39.4f, 27.100002f, 37.2f);
generalPath.curveTo(25.500002f, 34.9f, 24.100002f, 33.0f, 23.000002f, 31.400002f);
generalPath.curveTo(22.400002f, 30.600002f, 21.800001f, 29.800001f, 20.900002f, 29.000002f);
generalPath.curveTo(20.100002f, 28.200003f, 19.2f, 27.600002f, 18.300001f, 27.300001f);
generalPath.curveTo(17.800001f, 27.1f, 17.300001f, 26.900002f, 16.800001f, 26.800001f);
generalPath.curveTo(16.2f, 26.7f, 15.600001f, 26.6f, 14.800001f, 26.500002f);
generalPath.lineTo(14.800001f, 24.500002f);
generalPath.lineTo(37.4f, 24.500002f);
generalPath.lineTo(37.4f, 26.500002f);
generalPath.curveTo(35.600002f, 26.600002f, 34.300003f, 26.700003f, 33.5f, 27.000002f);
generalPath.curveTo(32.7f, 27.200003f, 32.2f, 27.600002f, 32.2f, 28.100002f);
generalPath.curveTo(32.2f, 28.300003f, 32.3f, 28.700003f, 32.4f, 29.000002f);
generalPath.curveTo(32.600002f, 29.400002f, 32.9f, 30.000002f, 33.4f, 30.800001f);
generalPath.curveTo(33.800003f, 31.500002f, 34.5f, 32.5f, 35.300003f, 33.800003f);
generalPath.curveTo(36.200005f, 35.100002f, 37.200005f, 36.700005f, 38.300003f, 38.4f);
generalPath.curveTo(41.600002f, 34.5f, 43.600002f, 31.900002f, 44.500004f, 30.800001f);
generalPath.curveTo(45.300003f, 29.6f, 45.800003f, 28.800001f, 45.800003f, 28.400002f);
generalPath.curveTo(45.800003f, 27.900002f, 45.600002f, 27.500002f, 45.100002f, 27.300001f);
generalPath.curveTo(44.600002f, 27.000002f, 43.500004f, 26.800001f, 41.7f, 26.7f);
generalPath.lineTo(41.7f, 24.7f);
generalPath.lineTo(56.1f, 24.7f);
generalPath.lineTo(56.1f, 26.7f);
generalPath.curveTo(55.399998f, 26.7f, 54.899998f, 26.800001f, 54.5f, 26.900002f);
generalPath.curveTo(54.1f, 27.000002f, 53.6f, 27.2f, 53.0f, 27.400002f);
generalPath.curveTo(51.9f, 27.900002f, 51.0f, 28.500002f, 50.3f, 29.2f);
generalPath.curveTo(49.6f, 29.900002f, 48.8f, 30.7f, 47.899998f, 31.7f);
generalPath.curveTo(46.6f, 33.100002f, 45.399998f, 34.5f, 44.199997f, 35.9f);
generalPath.curveTo(42.999996f, 37.2f, 41.6f, 38.9f, 39.899998f, 40.800003f);
generalPath.curveTo(41.999996f, 44.000004f, 43.8f, 46.600002f, 45.3f, 48.700005f);
generalPath.curveTo(46.8f, 50.800003f, 48.2f, 52.800003f, 49.6f, 54.700005f);
generalPath.curveTo(50.1f, 55.500004f, 50.8f, 56.300003f, 51.6f, 57.100006f);
generalPath.curveTo(52.399998f, 57.900005f, 53.3f, 58.500008f, 54.199997f, 58.800007f);
generalPath.curveTo(54.6f, 59.000008f, 55.1f, 59.100006f, 55.6f, 59.20001f);
generalPath.curveTo(56.1f, 59.300007f, 56.899998f, 59.40001f, 57.699997f, 59.500008f);
generalPath.lineTo(57.799995f, 61.40001f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(16.325000762939453, 62.92499923706055), new Point2D.Double(55.441001892089844, 23.80900001525879), new float[] {0.005f,0.267f,0.443f,0.594f,0.731f,0.858f,0.976f,1.0f}, new Color[] {new Color(97, 149, 48, 255),new Color(96, 148, 47, 255),new Color(91, 142, 45, 255),new Color(83, 132, 41, 255),new Color(72, 119, 35, 255),new Color(58, 103, 27, 255),new Color(41, 82, 15, 255),new Color(36, 77, 11, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.0f, 0.7f);
generalPath.lineTo(72.0f, 27.6f);
generalPath.lineTo(45.0f, 27.6f);
generalPath.lineTo(45.0f, 0.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.025001525878906, 27.625), new Point2D.Double(58.525001525878906, 14.125), new float[] {0.0f,0.312f,0.458f,0.569f,0.663f,0.745f,0.82f,0.889f,0.951f,1.0f}, new Color[] {new Color(242, 245, 213, 255),new Color(240, 244, 210, 255),new Color(232, 238, 202, 255),new Color(221, 231, 189, 255),new Color(207, 221, 173, 255),new Color(190, 210, 152, 255),new Color(169, 196, 129, 255),new Color(145, 181, 102, 255),new Color(120, 166, 71, 255),new Color(97, 153, 50, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.0f, 0.7f);
generalPath.lineTo(72.0f, 27.6f);
generalPath.lineTo(45.0f, 27.6f);
generalPath.lineTo(45.0f, 0.7f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(82, 130, 40, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.7f);
generalPath.lineTo(72.0f, 27.6f);
generalPath.lineTo(45.0f, 27.6f);
generalPath.lineTo(45.0f, 0.7f);
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
generalPath.moveTo(5.1f, 91.3f);
generalPath.lineTo(10.5f, 83.100006f);
generalPath.lineTo(5.6f, 75.600006f);
generalPath.lineTo(9.4f, 75.600006f);
generalPath.lineTo(12.599999f, 80.700005f);
generalPath.lineTo(15.699999f, 75.600006f);
generalPath.lineTo(19.4f, 75.600006f);
generalPath.lineTo(14.5f, 83.200005f);
generalPath.lineTo(19.9f, 91.3f);
generalPath.lineTo(16.0f, 91.3f);
generalPath.lineTo(12.5f, 85.9f);
generalPath.lineTo(9.0f, 91.3f);
generalPath.lineTo(5.1f, 91.3f);
generalPath.closePath();
generalPath.moveTo(21.7f, 91.3f);
generalPath.lineTo(21.7f, 75.7f);
generalPath.lineTo(24.900002f, 75.7f);
generalPath.lineTo(24.900002f, 88.7f);
generalPath.lineTo(32.9f, 88.7f);
generalPath.lineTo(32.9f, 91.399994f);
generalPath.lineTo(21.7f, 91.399994f);
generalPath.closePath();
generalPath.moveTo(34.300003f, 86.200005f);
generalPath.lineTo(37.4f, 85.9f);
generalPath.curveTo(37.600002f, 86.9f, 38.0f, 87.700005f, 38.5f, 88.200005f);
generalPath.curveTo(39.0f, 88.700005f, 39.9f, 88.9f, 40.8f, 88.9f);
generalPath.curveTo(41.8f, 88.9f, 42.6f, 88.700005f, 43.1f, 88.200005f);
generalPath.curveTo(43.6f, 87.8f, 43.899998f, 87.3f, 43.899998f, 86.700005f);
generalPath.curveTo(43.899998f, 86.3f, 43.8f, 86.00001f, 43.6f, 85.700005f);
generalPath.curveTo(43.399998f, 85.4f, 43.0f, 85.200005f, 42.399998f, 85.00001f);
generalPath.curveTo(41.999996f, 84.90001f, 41.199997f, 84.600006f, 39.8f, 84.30001f);
generalPath.curveTo(38.1f, 83.90001f, 36.899998f, 83.40001f, 36.2f, 82.70001f);
generalPath.curveTo(35.2f, 81.80001f, 34.7f, 80.80001f, 34.7f, 79.500015f);
generalPath.curveTo(34.7f, 78.70001f, 34.9f, 77.90002f, 35.4f, 77.30002f);
generalPath.curveTo(35.9f, 76.60002f, 36.5f, 76.10002f, 37.4f, 75.70002f);
generalPath.curveTo(38.300003f, 75.30002f, 39.300003f, 75.20002f, 40.5f, 75.20002f);
generalPath.curveTo(42.5f, 75.20002f, 44.0f, 75.60002f, 45.0f, 76.50002f);
generalPath.curveTo(46.0f, 77.400024f, 46.5f, 78.50002f, 46.6f, 80.00002f);
generalPath.lineTo(43.399998f, 80.10002f);
generalPath.curveTo(43.3f, 79.30002f, 42.999996f, 78.70002f, 42.499996f, 78.400024f);
generalPath.curveTo(41.999996f, 78.00002f, 41.399998f, 77.900024f, 40.499996f, 77.900024f);
generalPath.curveTo(39.599995f, 77.900024f, 38.799995f, 78.10002f, 38.299995f, 78.50002f);
generalPath.curveTo(37.999996f, 78.70002f, 37.799995f, 79.10002f, 37.799995f, 79.50002f);
generalPath.curveTo(37.799995f, 79.900024f, 37.999996f, 80.20002f, 38.299995f, 80.50002f);
generalPath.curveTo(38.699997f, 80.800026f, 39.699997f, 81.20002f, 41.299995f, 81.60002f);
generalPath.curveTo(42.899994f, 82.00002f, 43.999996f, 82.30002f, 44.799995f, 82.70002f);
generalPath.curveTo(45.499996f, 83.10002f, 46.099995f, 83.60002f, 46.599995f, 84.30002f);
generalPath.curveTo(46.999996f, 85.000015f, 47.199993f, 85.80002f, 47.199993f, 86.80002f);
generalPath.curveTo(47.199993f, 87.70002f, 46.899994f, 88.500015f, 46.399994f, 89.30002f);
generalPath.curveTo(45.899994f, 90.10002f, 45.199993f, 90.70002f, 44.299995f, 91.10002f);
generalPath.curveTo(43.399994f, 91.50002f, 42.199997f, 91.70002f, 40.799995f, 91.70002f);
generalPath.curveTo(38.799995f, 91.70002f, 37.199997f, 91.20002f, 36.199997f, 90.30002f);
generalPath.curveTo(35.199997f, 89.30002f, 34.499996f, 88.000015f, 34.299995f, 86.20002f);
generalPath.closePath();
generalPath.moveTo(49.9f, 91.3f);
generalPath.lineTo(49.9f, 75.6f);
generalPath.lineTo(54.7f, 75.6f);
generalPath.lineTo(57.600002f, 86.299995f);
generalPath.lineTo(60.500004f, 75.6f);
generalPath.lineTo(65.3f, 75.6f);
generalPath.lineTo(65.3f, 91.299995f);
generalPath.lineTo(62.300003f, 91.299995f);
generalPath.lineTo(62.300003f, 78.9f);
generalPath.lineTo(59.100002f, 91.3f);
generalPath.lineTo(56.0f, 91.3f);
generalPath.lineTo(52.9f, 78.9f);
generalPath.lineTo(52.9f, 91.3f);
generalPath.lineTo(49.9f, 91.3f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_xlsm() {
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
    public static ResizableIcon of(int width, int height) {
       ext_xlsm base = new ext_xlsm();
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_xlsm base = new ext_xlsm();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_xlsm::new;
    }
}

