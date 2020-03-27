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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_pub implements ResizableIcon {
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(72.1, 99.0);
generalPath.lineTo(0.3, 99.0);
generalPath.lineTo(0.3, 1.0);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.0f,0.124f,0.262f,0.41f,0.571f,0.752f,1.0f}, new Color[] {new Color(0, 107, 105, 255),new Color(0, 128, 127, 255),new Color(0, 147, 147, 255),new Color(0, 163, 163, 255),new Color(0, 176, 175, 255),new Color(8, 184, 183, 255),new Color(20, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(72.1, 99.0);
generalPath.lineTo(0.3, 99.0);
generalPath.lineTo(0.3, 1.0);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(0.32499998807907104, 49.99700164794922), new Point2D.Double(72.07499694824219, 49.99700164794922), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(7, 114, 101, 0),new Color(0, 106, 105, 0),new Color(0, 56, 54, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(72.1, 99.0);
generalPath.lineTo(0.3, 99.0);
generalPath.lineTo(0.3, 1.0);
generalPath.lineTo(45.2, 1.0);
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
generalPath.moveTo(8.8, 91.1);
generalPath.lineTo(8.8, 71.2);
generalPath.lineTo(15.3, 71.2);
generalPath.curveTo(17.8, 71.2, 19.4, 71.299995, 20.1, 71.5);
generalPath.curveTo(21.2, 71.8, 22.2, 72.4, 23.0, 73.4);
generalPath.curveTo(23.8, 74.4, 24.2, 75.700005, 24.2, 77.3);
generalPath.curveTo(24.2, 78.5, 24.0, 79.5, 23.5, 80.4);
generalPath.curveTo(23.1, 81.200005, 22.5, 81.9, 21.8, 82.4);
generalPath.curveTo(21.099998, 82.9, 20.4, 83.200005, 19.699999, 83.3);
generalPath.curveTo(18.699999, 83.5, 17.3, 83.600006, 15.499999, 83.600006);
generalPath.lineTo(12.9, 83.600006);
generalPath.lineTo(12.9, 91.100006);
generalPath.lineTo(8.8, 91.100006);
generalPath.closePath();
generalPath.moveTo(12.8, 74.6);
generalPath.lineTo(12.8, 80.2);
generalPath.lineTo(15.0, 80.2);
generalPath.curveTo(16.6, 80.2, 17.7, 80.1, 18.2, 79.899994);
generalPath.curveTo(18.7, 79.7, 19.2, 79.399994, 19.5, 78.899994);
generalPath.curveTo(19.8, 78.49999, 20.0, 77.899994, 20.0, 77.399994);
generalPath.curveTo(20.0, 76.7, 19.8, 76.09999, 19.4, 75.59999);
generalPath.curveTo(19.0, 75.09999, 18.4, 74.79999, 17.8, 74.69999);
generalPath.curveTo(17.3, 74.59999, 16.4, 74.59999, 14.9, 74.59999);
generalPath.lineTo(12.799999, 74.59999);
generalPath.closePath();
generalPath.moveTo(27.400002, 71.2);
generalPath.lineTo(31.400002, 71.2);
generalPath.lineTo(31.400002, 82.0);
generalPath.curveTo(31.400002, 83.7, 31.400002, 84.8, 31.500002, 85.3);
generalPath.curveTo(31.700003, 86.100006, 32.100002, 86.8, 32.7, 87.3);
generalPath.curveTo(33.3, 87.8, 34.2, 88.0, 35.4, 88.0);
generalPath.curveTo(36.5, 88.0, 37.4, 87.8, 38.0, 87.3);
generalPath.curveTo(38.6, 86.8, 38.9, 86.3, 39.0, 85.600006);
generalPath.curveTo(39.1, 84.90001, 39.2, 83.8, 39.2, 82.200005);
generalPath.lineTo(39.2, 71.200005);
generalPath.lineTo(43.2, 71.200005);
generalPath.lineTo(43.2, 81.600006);
generalPath.curveTo(43.2, 84.00001, 43.100002, 85.700005, 42.9, 86.600006);
generalPath.curveTo(42.7, 87.600006, 42.300003, 88.40001, 41.7, 89.100006);
generalPath.curveTo(41.1, 89.8, 40.3, 90.3, 39.3, 90.700005);
generalPath.curveTo(38.3, 91.100006, 37.0, 91.3, 35.5, 91.3);
generalPath.curveTo(33.6, 91.3, 32.1, 91.100006, 31.2, 90.600006);
generalPath.curveTo(30.300003, 90.100006, 29.400002, 89.600006, 28.900002, 88.90001);
generalPath.curveTo(28.400002, 88.20001, 28.000002, 87.50001, 27.800001, 86.70001);
generalPath.curveTo(27.500002, 85.60001, 27.400002, 83.90001, 27.400002, 81.70001);
generalPath.lineTo(27.400002, 71.2);
generalPath.closePath();
generalPath.moveTo(47.5, 71.2);
generalPath.lineTo(55.5, 71.2);
generalPath.curveTo(57.1, 71.2, 58.3, 71.299995, 59.0, 71.399994);
generalPath.curveTo(59.8, 71.49999, 60.5, 71.799995, 61.1, 72.2);
generalPath.curveTo(61.699997, 72.6, 62.199997, 73.2, 62.6, 73.899994);
generalPath.curveTo(63.0, 74.59999, 63.199997, 75.399994, 63.199997, 76.2);
generalPath.curveTo(63.199997, 77.1, 62.899998, 78.0, 62.399998, 78.799995);
generalPath.curveTo(61.899998, 79.59999, 61.199997, 80.2, 60.399998, 80.49999);
generalPath.curveTo(61.6, 80.899994, 62.6, 81.49999, 63.199997, 82.299995);
generalPath.curveTo(63.899998, 83.1, 64.2, 84.1, 64.2, 85.299995);
generalPath.curveTo(64.2, 86.2, 63.999996, 87.1, 63.6, 87.899994);
generalPath.curveTo(63.199997, 88.799995, 62.6, 89.399994, 61.899998, 89.899994);
generalPath.curveTo(61.199997, 90.399994, 60.3, 90.7, 59.199997, 90.799995);
generalPath.curveTo(58.499996, 90.899994, 56.899998, 90.899994, 54.299995, 90.899994);
generalPath.lineTo(47.499996, 90.899994);
generalPath.lineTo(47.499996, 71.2);
generalPath.closePath();
generalPath.moveTo(51.6, 74.5);
generalPath.lineTo(51.6, 79.1);
generalPath.lineTo(54.199997, 79.1);
generalPath.curveTo(55.799995, 79.1, 56.699997, 79.1, 57.1, 79.0);
generalPath.curveTo(57.8, 78.9, 58.3, 78.7, 58.699997, 78.3);
generalPath.curveTo(59.1, 77.9, 59.299995, 77.4, 59.299995, 76.8);
generalPath.curveTo(59.299995, 76.200005, 59.099995, 75.700005, 58.799995, 75.3);
generalPath.curveTo(58.499996, 74.9, 57.999996, 74.700005, 57.299995, 74.600006);
generalPath.curveTo(56.899994, 74.600006, 55.799995, 74.50001, 53.899994, 74.50001);
generalPath.lineTo(51.599995, 74.50001);
generalPath.closePath();
generalPath.moveTo(51.6, 82.4);
generalPath.lineTo(51.6, 87.700005);
generalPath.lineTo(55.3, 87.700005);
generalPath.curveTo(56.8, 87.700005, 57.7, 87.700005, 58.1, 87.600006);
generalPath.curveTo(58.699997, 87.50001, 59.199997, 87.200005, 59.6, 86.8);
generalPath.curveTo(60.0, 86.4, 60.199997, 85.8, 60.199997, 85.100006);
generalPath.curveTo(60.199997, 84.50001, 60.1, 84.00001, 59.799995, 83.600006);
generalPath.curveTo(59.499996, 83.200005, 59.099995, 82.90001, 58.499996, 82.700005);
generalPath.curveTo(57.999996, 82.50001, 56.799995, 82.4, 54.899998, 82.4);
generalPath.lineTo(51.6, 82.4);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(31.1, 36.2);
generalPath.curveTo(31.1, 33.0, 29.5, 31.400002, 27.1, 31.400002);
generalPath.curveTo(26.1, 31.400002, 25.4, 31.500002, 25.0, 31.7);
generalPath.lineTo(25.0, 41.2);
generalPath.curveTo(25.5, 41.4, 26.1, 41.5, 26.8, 41.5);
generalPath.curveTo(29.5, 41.4, 31.099998, 39.6, 31.099998, 36.2);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.031999588012695, 41.41299819946289), new Point2D.Double(28.031999588012695, 31.378000259399414), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(15.0, 55.3);
generalPath.lineTo(41.1, 62.0);
generalPath.lineTo(41.1, 19.3);
generalPath.lineTo(15.0, 26.0);
generalPath.lineTo(15.0, 55.3);
generalPath.closePath();
generalPath.moveTo(22.8, 29.3);
generalPath.curveTo(23.9, 29.0, 25.3, 28.8, 27.0, 28.8);
generalPath.curveTo(29.2, 28.8, 30.8, 29.5, 31.8, 30.8);
generalPath.curveTo(32.7, 32.0, 33.3, 33.7, 33.3, 35.899998);
generalPath.curveTo(33.3, 38.1, 32.8, 39.899998, 32.0, 41.1);
generalPath.curveTo(30.8, 42.899998, 28.9, 43.8, 26.8, 43.8);
generalPath.curveTo(26.099998, 43.8, 25.5, 43.8, 25.0, 43.6);
generalPath.lineTo(25.0, 53.399998);
generalPath.lineTo(22.8, 53.399998);
generalPath.lineTo(22.8, 29.3);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.030000686645508, 62.0), new Point2D.Double(28.030000686645508, 19.29199981689453), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(43.3, 24.7);
generalPath.lineTo(43.3, 27.300001);
generalPath.lineTo(52.1, 27.300001);
generalPath.lineTo(52.1, 34.600002);
generalPath.lineTo(43.3, 34.600002);
generalPath.lineTo(43.3, 37.4);
generalPath.lineTo(52.1, 37.4);
generalPath.lineTo(52.1, 40.600002);
generalPath.lineTo(43.3, 40.600002);
generalPath.lineTo(43.3, 43.2);
generalPath.lineTo(52.1, 43.2);
generalPath.lineTo(52.1, 46.5);
generalPath.lineTo(43.3, 46.5);
generalPath.lineTo(43.3, 49.4);
generalPath.lineTo(52.1, 49.4);
generalPath.lineTo(52.1, 52.7);
generalPath.lineTo(43.3, 52.7);
generalPath.lineTo(43.3, 58.2);
generalPath.lineTo(58.199997, 58.2);
generalPath.lineTo(58.199997, 24.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(50.73899841308594, 58.152000427246094), new Point2D.Double(50.73899841308594, 24.680999755859375), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {new Color(214, 237, 232, 255),new Color(211, 235, 230, 255),new Color(199, 227, 223, 255),new Color(183, 216, 213, 255),new Color(160, 203, 201, 255),new Color(132, 186, 185, 255),new Color(98, 167, 167, 255),new Color(52, 147, 148, 255),new Color(0, 127, 127, 255),new Color(0, 107, 106, 255),new Color(0, 107, 105, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_pub() {
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
       ext_pub base = new ext_pub();
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
       ext_pub base = new ext_pub();
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
        return ext_pub::new;
    }
}

