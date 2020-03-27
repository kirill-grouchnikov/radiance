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
public class ext_ics implements ResizableIcon {
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
generalPath.moveTo(44.8, 1.0);
generalPath.lineTo(71.8, 27.7);
generalPath.lineTo(71.8, 98.899994);
generalPath.lineTo(-0.19999695, 98.899994);
generalPath.lineTo(-0.19999695, 1.0);
generalPath.lineTo(44.800003, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 3.0959999561309814), new Point2D.Double(35.75, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.8, 1.0);
generalPath.lineTo(71.8, 27.7);
generalPath.lineTo(71.8, 98.899994);
generalPath.lineTo(-0.19999695, 98.899994);
generalPath.lineTo(-0.19999695, 1.0);
generalPath.lineTo(44.800003, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8, 1.0);
generalPath.lineTo(71.8, 27.7);
generalPath.lineTo(71.8, 98.899994);
generalPath.lineTo(-0.19999695, 98.899994);
generalPath.lineTo(-0.19999695, 1.0);
generalPath.lineTo(44.800003, 1.0);
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
generalPath.moveTo(0.7, 63.6);
generalPath.lineTo(70.899994, 63.6);
generalPath.lineTo(70.899994, 97.899994);
generalPath.lineTo(0.7, 97.899994);
generalPath.lineTo(0.7, 63.6);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.849998474121094, 4.085000038146973), new Point2D.Double(35.849998474121094, 38.441001892089844), new float[] {0.0f,1.0f}, new Color[] {new Color(239, 65, 54, 255),new Color(190, 30, 45, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(14.4, 90.1);
generalPath.lineTo(14.4, 70.3);
generalPath.lineTo(18.4, 70.3);
generalPath.lineTo(18.4, 90.100006);
generalPath.lineTo(14.4, 90.100006);
generalPath.closePath();
generalPath.moveTo(35.1, 82.799995);
generalPath.lineTo(39.0, 84.0);
generalPath.curveTo(38.4, 86.2, 37.4, 87.8, 36.0, 88.8);
generalPath.curveTo(34.6, 89.9, 32.8, 90.4, 30.7, 90.4);
generalPath.curveTo(28.0, 90.4, 25.900002, 89.5, 24.1, 87.700005);
generalPath.curveTo(22.4, 85.9, 21.5, 83.4, 21.5, 80.3);
generalPath.curveTo(21.5, 77.0, 22.4, 74.4, 24.1, 72.600006);
generalPath.curveTo(25.800001, 70.80001, 28.1, 69.90001, 30.900002, 69.90001);
generalPath.curveTo(33.4, 69.90001, 35.300003, 70.600006, 36.9, 72.00001);
generalPath.curveTo(37.800003, 72.80001, 38.5, 74.100006, 39.0, 75.700005);
generalPath.lineTo(35.0, 76.600006);
generalPath.curveTo(34.8, 75.600006, 34.3, 74.8, 33.5, 74.200005);
generalPath.curveTo(32.7, 73.600006, 31.8, 73.3, 30.8, 73.3);
generalPath.curveTo(29.3, 73.3, 28.099998, 73.8, 27.199999, 74.9);
generalPath.curveTo(26.3, 76.0, 25.8, 77.700005, 25.8, 80.0);
generalPath.curveTo(25.8, 82.5, 26.3, 84.3, 27.199999, 85.4);
generalPath.curveTo(28.099998, 86.5, 29.3, 87.0, 30.8, 87.0);
generalPath.curveTo(31.9, 87.0, 32.8, 86.7, 33.6, 86.0);
generalPath.curveTo(34.199997, 85.3, 34.8, 84.2, 35.1, 82.8);
generalPath.closePath();
generalPath.moveTo(41.5, 83.6);
generalPath.lineTo(45.4, 83.2);
generalPath.curveTo(45.600002, 84.5, 46.100002, 85.5, 46.800003, 86.1);
generalPath.curveTo(47.500004, 86.7, 48.500004, 87.0, 49.700005, 87.0);
generalPath.curveTo(51.000004, 87.0, 52.000004, 86.7, 52.600006, 86.2);
generalPath.curveTo(53.300007, 85.7, 53.600006, 85.0, 53.600006, 84.299995);
generalPath.curveTo(53.600006, 83.799995, 53.500008, 83.399994, 53.200005, 83.1);
generalPath.curveTo(52.9, 82.8, 52.400005, 82.5, 51.700005, 82.2);
generalPath.curveTo(51.200005, 82.0, 50.100006, 81.7, 48.500004, 81.299995);
generalPath.curveTo(46.300003, 80.799995, 44.800003, 80.1, 43.900005, 79.299995);
generalPath.curveTo(42.700005, 78.2, 42.100006, 76.899994, 42.100006, 75.299995);
generalPath.curveTo(42.100006, 74.299995, 42.400005, 73.299995, 43.000008, 72.49999);
generalPath.curveTo(43.60001, 71.69999, 44.40001, 70.99999, 45.500008, 70.49999);
generalPath.curveTo(46.600006, 69.99999, 47.90001, 69.799995, 49.40001, 69.799995);
generalPath.curveTo(51.90001, 69.799995, 53.80001, 70.299995, 55.10001, 71.399994);
generalPath.curveTo(56.40001, 72.49999, 57.00001, 73.899994, 57.10001, 75.799995);
generalPath.lineTo(53.10001, 75.99999);
generalPath.curveTo(52.90001, 74.99999, 52.60001, 74.19999, 52.00001, 73.799995);
generalPath.curveTo(51.400013, 73.399994, 50.60001, 73.1, 49.400013, 73.1);
generalPath.curveTo(48.200012, 73.1, 47.300014, 73.299995, 46.600014, 73.799995);
generalPath.curveTo(46.200012, 74.1, 46.000015, 74.49999, 46.000015, 74.99999);
generalPath.curveTo(46.000015, 75.49999, 46.200016, 75.899994, 46.600014, 76.19999);
generalPath.curveTo(47.100014, 76.59999, 48.400013, 77.09999, 50.300014, 77.49999);
generalPath.curveTo(52.200016, 77.899994, 53.700016, 78.399994, 54.700016, 78.899994);
generalPath.curveTo(55.600018, 79.399994, 56.400017, 80.09999, 56.900017, 80.899994);
generalPath.curveTo(57.400017, 81.799995, 57.700016, 82.799995, 57.700016, 84.09999);
generalPath.curveTo(57.700016, 85.19999, 57.400017, 86.29999, 56.700016, 87.29999);
generalPath.curveTo(56.100018, 88.29999, 55.200016, 88.999985, 54.000015, 89.499985);
generalPath.curveTo(52.800014, 89.999985, 51.400017, 90.19998, 49.600014, 90.19998);
generalPath.curveTo(47.100014, 90.19998, 45.100014, 89.59998, 43.800014, 88.499985);
generalPath.curveTo(42.500015, 87.39999, 41.800014, 85.79999, 41.500015, 83.59998);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(18.2, 54.4);
generalPath.lineTo(18.2, 48.2);
generalPath.lineTo(25.400002, 48.2);
generalPath.lineTo(25.400002, 54.4);
generalPath.lineTo(18.2, 54.4);
generalPath.closePath();
generalPath.moveTo(27.0, 54.4);
generalPath.lineTo(27.0, 48.2);
generalPath.lineTo(35.0, 48.2);
generalPath.lineTo(35.0, 54.4);
generalPath.lineTo(27.0, 54.4);
generalPath.closePath();
generalPath.moveTo(18.2, 46.800003);
generalPath.lineTo(18.2, 39.9);
generalPath.lineTo(25.400002, 39.9);
generalPath.lineTo(25.400002, 46.800003);
generalPath.lineTo(18.2, 46.800003);
generalPath.closePath();
generalPath.moveTo(27.0, 46.800003);
generalPath.lineTo(27.0, 39.9);
generalPath.lineTo(35.0, 39.9);
generalPath.lineTo(35.0, 46.800003);
generalPath.lineTo(27.0, 46.800003);
generalPath.closePath();
generalPath.moveTo(18.2, 38.500004);
generalPath.lineTo(18.2, 32.300003);
generalPath.lineTo(25.400002, 32.300003);
generalPath.lineTo(25.400002, 38.500004);
generalPath.lineTo(18.2, 38.500004);
generalPath.closePath();
generalPath.moveTo(36.6, 54.4);
generalPath.lineTo(36.6, 48.2);
generalPath.lineTo(44.6, 48.2);
generalPath.lineTo(44.6, 54.4);
generalPath.lineTo(36.6, 54.4);
generalPath.closePath();
generalPath.moveTo(27.0, 38.5);
generalPath.lineTo(27.0, 32.3);
generalPath.lineTo(35.0, 32.3);
generalPath.lineTo(35.0, 38.5);
generalPath.lineTo(27.0, 38.5);
generalPath.closePath();
generalPath.moveTo(46.2, 54.4);
generalPath.lineTo(46.2, 48.2);
generalPath.lineTo(53.4, 48.2);
generalPath.lineTo(53.4, 54.4);
generalPath.lineTo(46.2, 54.4);
generalPath.closePath();
generalPath.moveTo(36.6, 46.800003);
generalPath.lineTo(36.6, 39.9);
generalPath.lineTo(44.6, 39.9);
generalPath.lineTo(44.6, 46.800003);
generalPath.lineTo(36.6, 46.800003);
generalPath.closePath();
generalPath.moveTo(27.8, 28.100002);
generalPath.curveTo(27.8, 28.500002, 27.4, 28.800003, 27.0, 28.800003);
generalPath.lineTo(25.4, 28.800003);
generalPath.curveTo(25.0, 28.800003, 24.6, 28.500004, 24.6, 28.100002);
generalPath.lineTo(24.6, 21.900002);
generalPath.curveTo(24.6, 21.500002, 25.0, 21.2, 25.4, 21.2);
generalPath.lineTo(27.0, 21.2);
generalPath.curveTo(27.4, 21.2, 27.8, 21.5, 27.8, 21.900002);
generalPath.lineTo(27.8, 28.100002);
generalPath.closePath();
generalPath.moveTo(46.199997, 46.800003);
generalPath.lineTo(46.199997, 39.9);
generalPath.lineTo(53.399998, 39.9);
generalPath.lineTo(53.399998, 46.800003);
generalPath.lineTo(46.199997, 46.800003);
generalPath.closePath();
generalPath.moveTo(36.6, 38.500004);
generalPath.lineTo(36.6, 32.300003);
generalPath.lineTo(44.6, 32.300003);
generalPath.lineTo(44.6, 38.500004);
generalPath.lineTo(36.6, 38.500004);
generalPath.closePath();
generalPath.moveTo(46.199997, 38.500004);
generalPath.lineTo(46.199997, 32.300003);
generalPath.lineTo(53.399998, 32.300003);
generalPath.lineTo(53.399998, 38.500004);
generalPath.lineTo(46.199997, 38.500004);
generalPath.closePath();
generalPath.moveTo(46.999996, 28.100004);
generalPath.curveTo(46.999996, 28.500004, 46.599995, 28.800005, 46.199997, 28.800005);
generalPath.lineTo(44.6, 28.800005);
generalPath.curveTo(44.199997, 28.800005, 43.8, 28.500006, 43.8, 28.100004);
generalPath.lineTo(43.8, 21.900005);
generalPath.curveTo(43.8, 21.500006, 44.2, 21.200005, 44.6, 21.200005);
generalPath.lineTo(46.199997, 21.200005);
generalPath.curveTo(46.6, 21.200005, 46.999996, 21.500004, 46.999996, 21.900005);
generalPath.lineTo(46.999996, 28.100006);
generalPath.closePath();
generalPath.moveTo(56.6, 26.700005);
generalPath.curveTo(56.6, 25.200005, 55.199997, 23.900005, 53.399998, 23.900005);
generalPath.lineTo(50.199997, 23.900005);
generalPath.lineTo(50.199997, 21.800005);
generalPath.curveTo(50.199997, 19.900005, 48.399998, 18.300005, 46.199997, 18.300005);
generalPath.lineTo(44.6, 18.300005);
generalPath.curveTo(42.399998, 18.300005, 40.6, 19.900005, 40.6, 21.800005);
generalPath.lineTo(40.6, 23.900005);
generalPath.lineTo(31.0, 23.900005);
generalPath.lineTo(31.0, 21.800005);
generalPath.curveTo(31.0, 19.900005, 29.2, 18.300005, 27.0, 18.300005);
generalPath.lineTo(25.4, 18.300005);
generalPath.curveTo(23.199999, 18.300005, 21.4, 19.900005, 21.4, 21.800005);
generalPath.lineTo(21.4, 23.900005);
generalPath.lineTo(18.199999, 23.900005);
generalPath.curveTo(16.499998, 23.900005, 14.999999, 25.200005, 14.999999, 26.700005);
generalPath.lineTo(14.999999, 54.400005);
generalPath.curveTo(14.999999, 55.900005, 16.4, 57.200005, 18.199999, 57.200005);
generalPath.lineTo(53.299995, 57.200005);
generalPath.curveTo(54.999996, 57.200005, 56.499996, 55.900005, 56.499996, 54.400005);
generalPath.lineTo(56.499996, 26.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(1025.800048828125, 947.9450073242188), new Point2D.Double(1025.800048828125, 986.7000122070312), new float[] {0.0f,1.0f}, new Color[] {new Color(135, 156, 168, 255),new Color(77, 106, 120, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -990.0f, 1005.1110229492188f));
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
generalPath.moveTo(44.8, 1.0);
generalPath.lineTo(71.8, 27.7);
generalPath.lineTo(44.800003, 27.7);
generalPath.lineTo(44.800003, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.82500076293945, 74.2239990234375), new Point2D.Double(58.32500076293945, 87.7239990234375), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.8, 1.0);
generalPath.lineTo(71.8, 27.7);
generalPath.lineTo(44.800003, 27.7);
generalPath.lineTo(44.800003, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8, 1.0);
generalPath.lineTo(71.8, 27.7);
generalPath.lineTo(44.800003, 27.7);
generalPath.lineTo(44.800003, 1.0);
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
        return 0.12800002098083496;
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
		return 0.9990000128746033;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_ics() {
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
       ext_ics base = new ext_ics();
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
       ext_ics base = new ext_ics();
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
        return ext_ics::new;
    }
}

