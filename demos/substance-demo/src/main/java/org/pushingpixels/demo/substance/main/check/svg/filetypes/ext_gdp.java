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
public class ext_gdp implements ResizableIcon {
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.2, 99.0);
generalPath.lineTo(0.2, 1.0);
generalPath.lineTo(45.100002, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.108001708984375, 3.003000020980835), new Point2D.Double(36.108001708984375, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.2, 99.0);
generalPath.lineTo(0.2, 1.0);
generalPath.lineTo(45.100002, 1.0);
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
generalPath.moveTo(42.6, 59.0);
generalPath.lineTo(21.4, 59.0);
generalPath.curveTo(19.1, 59.0, 17.2, 57.1, 17.2, 54.8);
generalPath.curveTo(17.2, 52.5, 19.1, 50.6, 21.400002, 50.6);
generalPath.lineTo(29.600002, 50.6);
generalPath.curveTo(33.300003, 50.6, 36.4, 47.6, 36.4, 43.8);
generalPath.curveTo(36.4, 40.0, 33.4, 37.0, 29.600002, 37.0);
generalPath.lineTo(25.100002, 37.0);
generalPath.curveTo(25.200003, 37.4, 25.200003, 37.8, 25.200003, 38.3);
generalPath.curveTo(25.200003, 38.8, 25.200003, 39.2, 25.100002, 39.6);
generalPath.lineTo(29.600002, 39.6);
generalPath.curveTo(31.900002, 39.6, 33.800003, 41.5, 33.800003, 43.8);
generalPath.curveTo(33.800003, 46.1, 32.0, 48.0, 29.7, 48.0);
generalPath.lineTo(21.5, 48.0);
generalPath.curveTo(17.8, 48.0, 14.7, 51.0, 14.7, 54.8);
generalPath.curveTo(14.7, 58.6, 17.7, 61.6, 21.5, 61.6);
generalPath.lineTo(42.7, 61.6);
generalPath.curveTo(42.600002, 61.199997, 42.600002, 60.8, 42.600002, 60.3);
generalPath.curveTo(42.600002, 59.8, 42.500004, 59.399998, 42.600002, 59.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.635000228881836, 36.96099853515625), new Point2D.Double(28.635000228881836, 61.53900146484375), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 145, 161, 255),new Color(202, 213, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(49.1, 56.2);
generalPath.curveTo(46.899998, 56.2, 45.1, 58.0, 45.1, 60.2);
generalPath.curveTo(45.1, 62.4, 46.899998, 64.2, 49.1, 64.2);
generalPath.curveTo(51.3, 64.2, 53.1, 62.399998, 53.1, 60.199997);
generalPath.curveTo(53.1, 57.999996, 51.3, 56.199997, 49.1, 56.199997);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(49.111000061035156, 56.21099853515625), new Point2D.Double(49.111000061035156, 64.28900146484375), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 145, 161, 255),new Color(202, 213, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(26.9, 23.2);
generalPath.lineTo(18.7, 23.2);
generalPath.curveTo(18.0, 23.2, 17.400002, 23.800001, 17.400002, 24.5);
generalPath.lineTo(17.400002, 34.4);
generalPath.curveTo(15.800001, 34.9, 14.600001, 36.5, 14.600001, 38.2);
generalPath.curveTo(14.600001, 40.4, 16.400002, 42.2, 18.600002, 42.2);
generalPath.curveTo(20.800003, 42.2, 22.600002, 40.4, 22.600002, 38.2);
generalPath.curveTo(22.600002, 36.4, 21.400002, 34.9, 19.800003, 34.4);
generalPath.lineTo(19.800003, 31.300001);
generalPath.lineTo(26.800003, 31.300001);
generalPath.curveTo(27.500004, 31.300001, 28.100002, 30.7, 28.100002, 30.000002);
generalPath.lineTo(28.100002, 24.500002);
generalPath.curveTo(28.200003, 23.800001, 27.700003, 23.200003, 26.900002, 23.200003);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.43899917602539, 23.211000442504883), new Point2D.Double(21.43899917602539, 42.28900146484375), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 145, 161, 255),new Color(202, 213, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(49.1, 26.0);
generalPath.curveTo(43.8, 26.0, 39.6, 30.3, 39.6, 35.5);
generalPath.curveTo(39.6, 38.3, 40.8, 41.0, 43.0, 42.8);
generalPath.lineTo(48.0, 52.6);
generalPath.curveTo(48.5, 53.5, 49.8, 53.5, 50.3, 52.6);
generalPath.lineTo(55.3, 42.8);
generalPath.curveTo(57.5, 41.0, 58.7, 38.3, 58.7, 35.5);
generalPath.curveTo(58.7, 30.2, 54.4, 26.0, 49.1, 26.0);
generalPath.closePath();
generalPath.moveTo(49.1, 39.5);
generalPath.curveTo(46.899998, 39.5, 45.1, 37.7, 45.1, 35.5);
generalPath.curveTo(45.1, 33.3, 46.899998, 31.5, 49.1, 31.5);
generalPath.curveTo(51.3, 31.5, 53.1, 33.3, 53.1, 35.5);
generalPath.curveTo(53.1, 37.7, 51.3, 39.5, 49.1, 39.5);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(49.111000061035156, 25.961000442504883), new Point2D.Double(49.111000061035156, 53.28799819946289), new float[] {0.0f,1.0f}, new Color[] {new Color(114, 145, 161, 255),new Color(202, 213, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(17.1, 83.8);
generalPath.lineTo(17.1, 80.5);
generalPath.lineTo(25.8, 80.5);
generalPath.lineTo(25.8, 88.4);
generalPath.curveTo(25.0, 89.200005, 23.699999, 89.9, 22.099998, 90.5);
generalPath.curveTo(20.499998, 91.1, 18.899998, 91.4, 17.199999, 91.4);
generalPath.curveTo(15.099998, 91.4, 13.299999, 91.0, 11.699999, 90.1);
generalPath.curveTo(10.199999, 89.2, 8.999999, 88.0, 8.299999, 86.4);
generalPath.curveTo(7.499999, 84.8, 7.0999994, 83.0, 7.0999994, 81.1);
generalPath.curveTo(7.0999994, 79.0, 7.4999995, 77.2, 8.4, 75.6);
generalPath.curveTo(9.299999, 74.0, 10.5, 72.799995, 12.2, 71.9);
generalPath.curveTo(13.5, 71.200005, 15.1, 70.9, 17.0, 70.9);
generalPath.curveTo(19.5, 70.9, 21.4, 71.4, 22.8, 72.4);
generalPath.curveTo(24.199999, 73.4, 25.099998, 74.9, 25.5, 76.700005);
generalPath.lineTo(21.5, 77.4);
generalPath.curveTo(21.2, 76.4, 20.7, 75.700005, 19.9, 75.1);
generalPath.curveTo(19.1, 74.5, 18.199999, 74.299995, 17.0, 74.299995);
generalPath.curveTo(15.2, 74.299995, 13.8, 74.899994, 12.8, 75.99999);
generalPath.curveTo(11.8, 77.09999, 11.2, 78.799995, 11.2, 80.899994);
generalPath.curveTo(11.2, 83.299995, 11.7, 84.99999, 12.8, 86.2);
generalPath.curveTo(13.900001, 87.399994, 15.200001, 88.0, 16.9, 88.0);
generalPath.curveTo(17.699999, 88.0, 18.6, 87.8, 19.4, 87.5);
generalPath.curveTo(20.199999, 87.2, 21.0, 86.8, 21.6, 86.3);
generalPath.lineTo(21.6, 83.8);
generalPath.lineTo(17.1, 83.8);
generalPath.closePath();
generalPath.moveTo(29.5, 71.200005);
generalPath.lineTo(36.9, 71.200005);
generalPath.curveTo(38.600002, 71.200005, 39.800003, 71.3, 40.7, 71.600006);
generalPath.curveTo(41.9, 71.90001, 42.9, 72.600006, 43.7, 73.40001);
generalPath.curveTo(44.5, 74.20001, 45.2, 75.30001, 45.600002, 76.600006);
generalPath.curveTo(46.000004, 77.90001, 46.300003, 79.40001, 46.300003, 81.3);
generalPath.curveTo(46.300003, 82.9, 46.100002, 84.3, 45.700005, 85.5);
generalPath.curveTo(45.200005, 86.9, 44.500004, 88.1, 43.600006, 89.0);
generalPath.curveTo(42.900005, 89.7, 42.000008, 90.2, 40.800007, 90.6);
generalPath.curveTo(39.900005, 90.9, 38.70001, 91.0, 37.20001, 91.0);
generalPath.lineTo(29.600008, 91.0);
generalPath.lineTo(29.600008, 71.2);
generalPath.closePath();
generalPath.moveTo(33.5, 74.600006);
generalPath.lineTo(33.5, 87.700005);
generalPath.lineTo(36.5, 87.700005);
generalPath.curveTo(37.6, 87.700005, 38.4, 87.600006, 38.9, 87.50001);
generalPath.curveTo(39.600002, 87.30001, 40.100002, 87.100006, 40.5, 86.700005);
generalPath.curveTo(40.899998, 86.3, 41.3, 85.700005, 41.6, 84.8);
generalPath.curveTo(41.899998, 83.9, 42.0, 82.700005, 42.0, 81.200005);
generalPath.curveTo(42.0, 79.700005, 41.9, 78.50001, 41.6, 77.700005);
generalPath.curveTo(41.3, 76.9, 40.899998, 76.200005, 40.5, 75.8);
generalPath.curveTo(40.0, 75.3, 39.4, 75.0, 38.6, 74.9);
generalPath.curveTo(38.0, 74.8, 36.899998, 74.700005, 35.3, 74.700005);
generalPath.lineTo(33.5, 74.700005);
generalPath.closePath();
generalPath.moveTo(49.6, 91.100006);
generalPath.lineTo(49.6, 71.2);
generalPath.lineTo(56.1, 71.2);
generalPath.curveTo(58.6, 71.2, 60.199997, 71.299995, 60.899998, 71.5);
generalPath.curveTo(61.999996, 71.8, 62.999996, 72.4, 63.8, 73.4);
generalPath.curveTo(64.6, 74.4, 65.0, 75.700005, 65.0, 77.3);
generalPath.curveTo(65.0, 78.5, 64.8, 79.5, 64.3, 80.4);
generalPath.curveTo(63.9, 81.200005, 63.300003, 81.9, 62.600002, 82.4);
generalPath.curveTo(61.9, 82.9, 61.2, 83.200005, 60.500004, 83.3);
generalPath.curveTo(59.500004, 83.5, 58.100002, 83.600006, 56.300003, 83.600006);
generalPath.lineTo(53.700005, 83.600006);
generalPath.lineTo(53.700005, 91.100006);
generalPath.lineTo(49.600006, 91.100006);
generalPath.closePath();
generalPath.moveTo(53.699997, 74.600006);
generalPath.lineTo(53.699997, 80.200005);
generalPath.lineTo(55.899998, 80.200005);
generalPath.curveTo(57.499996, 80.200005, 58.6, 80.100006, 59.1, 79.9);
generalPath.curveTo(59.6, 79.700005, 60.1, 79.4, 60.399998, 78.9);
generalPath.curveTo(60.699997, 78.5, 60.899998, 77.9, 60.899998, 77.4);
generalPath.curveTo(60.899998, 76.700005, 60.699997, 76.1, 60.3, 75.6);
generalPath.curveTo(59.899998, 75.1, 59.3, 74.799995, 58.7, 74.7);
generalPath.curveTo(58.2, 74.6, 57.3, 74.6, 55.8, 74.6);
generalPath.lineTo(53.7, 74.6);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.1, 27.7);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.1, 27.7);
generalPath.lineTo(45.1, 1.0);
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_gdp() {
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
       ext_gdp base = new ext_gdp();
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
       ext_gdp base = new ext_gdp();
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
        return ext_gdp::new;
    }
}

