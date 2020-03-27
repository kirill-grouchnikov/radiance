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
public class ext_ts implements ResizableIcon {
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
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
generalPath.moveTo(14.4, 44.1);
generalPath.lineTo(14.4, 39.199997);
generalPath.curveTo(15.4, 39.1, 16.199999, 38.999996, 16.699999, 38.699997);
generalPath.curveTo(17.199999, 38.499996, 17.599998, 37.999996, 17.999998, 37.499996);
generalPath.curveTo(18.399998, 36.899998, 18.599998, 36.199997, 18.799997, 35.299995);
generalPath.curveTo(18.899998, 34.599995, 18.999998, 33.499996, 18.999998, 31.899996);
generalPath.curveTo(18.999998, 29.199995, 19.099998, 27.399996, 19.399998, 26.299995);
generalPath.curveTo(19.599998, 25.299995, 20.099998, 24.399996, 20.699997, 23.799995);
generalPath.curveTo(21.299995, 23.199995, 22.299997, 22.699995, 23.499996, 22.299995);
generalPath.curveTo(24.299995, 22.099995, 25.599997, 21.899996, 27.399996, 21.899996);
generalPath.lineTo(28.499996, 21.899996);
generalPath.lineTo(28.499996, 26.799995);
generalPath.curveTo(26.999996, 26.799995, 25.999996, 26.899996, 25.599997, 27.099995);
generalPath.curveTo(25.199997, 27.299995, 24.899996, 27.499994, 24.599997, 27.899994);
generalPath.curveTo(24.399996, 28.199993, 24.299997, 28.799994, 24.299997, 29.699993);
generalPath.curveTo(24.299997, 30.599993, 24.199997, 32.199993, 24.099997, 34.599995);
generalPath.curveTo(23.999996, 35.999996, 23.899996, 37.099995, 23.599997, 37.999996);
generalPath.curveTo(23.299997, 38.799995, 22.899996, 39.499996, 22.499996, 40.099995);
generalPath.curveTo(22.099997, 40.599995, 21.399996, 41.199993, 20.499996, 41.799995);
generalPath.curveTo(21.299995, 42.299995, 21.999996, 42.799995, 22.499996, 43.399994);
generalPath.curveTo(22.999996, 43.999992, 23.399996, 44.799995, 23.699997, 45.699993);
generalPath.curveTo(23.999998, 46.59999, 24.199997, 47.79999, 24.199997, 49.29999);
generalPath.curveTo(24.299997, 51.59999, 24.299997, 52.999992, 24.299997, 53.699993);
generalPath.curveTo(24.299997, 54.599995, 24.399998, 55.199993, 24.599997, 55.599995);
generalPath.curveTo(24.799997, 55.999996, 25.199997, 56.199993, 25.599997, 56.399994);
generalPath.curveTo(25.999996, 56.599995, 26.999996, 56.699993, 28.499996, 56.699993);
generalPath.lineTo(28.499996, 61.599995);
generalPath.lineTo(27.399996, 61.599995);
generalPath.curveTo(25.599997, 61.599995, 24.099997, 61.499996, 23.199997, 61.199993);
generalPath.curveTo(22.199997, 60.899994, 21.399998, 60.399994, 20.699997, 59.699993);
generalPath.curveTo(19.999996, 58.999992, 19.599997, 58.199993, 19.299997, 57.199993);
generalPath.curveTo(19.099997, 56.199993, 18.999998, 54.599995, 18.999998, 52.399994);
generalPath.curveTo(18.999998, 49.899994, 18.899998, 48.199993, 18.699999, 47.499992);
generalPath.curveTo(18.4, 46.399994, 17.9, 45.59999, 17.3, 45.09999);
generalPath.curveTo(16.599998, 44.499992, 15.699999, 44.09999, 14.4, 44.09999);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.450000762939453, 61.54999923706055), new Point2D.Double(21.450000762939453, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(58.7, 44.1);
generalPath.curveTo(57.7, 44.199997, 56.9, 44.3, 56.4, 44.6);
generalPath.curveTo(55.9, 44.8, 55.5, 45.3, 55.100002, 45.8);
generalPath.curveTo(54.7, 46.399998, 54.500004, 47.1, 54.300003, 48.0);
generalPath.curveTo(54.200005, 48.7, 54.100002, 49.8, 54.100002, 51.4);
generalPath.curveTo(54.100002, 54.100002, 54.000004, 55.9, 53.7, 57.0);
generalPath.curveTo(53.5, 58.1, 53.0, 58.9, 52.4, 59.5);
generalPath.curveTo(51.800003, 60.1, 50.800003, 60.6, 49.600002, 61.0);
generalPath.curveTo(48.800003, 61.2, 47.500004, 61.4, 45.7, 61.4);
generalPath.lineTo(44.600002, 61.4);
generalPath.lineTo(44.600002, 56.5);
generalPath.curveTo(46.100002, 56.5, 47.000004, 56.4, 47.500004, 56.2);
generalPath.curveTo(48.000004, 56.0, 48.300003, 55.7, 48.500004, 55.4);
generalPath.curveTo(48.700005, 55.100002, 48.800003, 54.5, 48.800003, 53.600002);
generalPath.curveTo(48.800003, 52.800003, 48.9, 51.2, 49.000004, 48.800003);
generalPath.curveTo(49.100002, 47.4, 49.300003, 46.200005, 49.600002, 45.4);
generalPath.curveTo(49.9, 44.5, 50.300003, 43.800003, 50.800003, 43.2);
generalPath.curveTo(51.300003, 42.6, 51.9, 42.100002, 52.700005, 41.600002);
generalPath.curveTo(51.700005, 40.9, 50.900005, 40.300003, 50.500004, 39.7);
generalPath.curveTo(49.900005, 38.8, 49.400005, 37.600002, 49.200005, 36.3);
generalPath.curveTo(49.000004, 35.3, 48.900005, 33.2, 48.900005, 30.0);
generalPath.curveTo(48.900005, 29.0, 48.800007, 28.3, 48.600006, 27.9);
generalPath.curveTo(48.400005, 27.6, 48.100006, 27.3, 47.700005, 27.1);
generalPath.curveTo(47.300003, 26.9, 46.300003, 26.800001, 44.700005, 26.800001);
generalPath.lineTo(44.700005, 22.0);
generalPath.lineTo(45.800003, 22.0);
generalPath.curveTo(47.600002, 22.0, 49.100002, 22.1, 50.000004, 22.4);
generalPath.curveTo(51.000004, 22.699999, 51.800003, 23.199999, 52.500004, 23.9);
generalPath.curveTo(53.200005, 24.6, 53.600002, 25.4, 53.900005, 26.4);
generalPath.curveTo(54.100006, 27.4, 54.300007, 29.0, 54.300007, 31.2);
generalPath.curveTo(54.300007, 33.7, 54.400005, 35.3, 54.600006, 36.100002);
generalPath.curveTo(54.900005, 37.2, 55.400005, 38.000004, 56.000008, 38.4);
generalPath.curveTo(56.600006, 38.9, 57.600006, 39.100002, 58.800007, 39.2);
generalPath.lineTo(58.70001, 44.100002);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(51.70000076293945, 61.45000076293945), new Point2D.Double(51.70000076293945, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
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
generalPath.moveTo(24.7, 91.5);
generalPath.lineTo(24.7, 74.9);
generalPath.lineTo(18.800001, 74.9);
generalPath.lineTo(18.800001, 71.5);
generalPath.lineTo(34.7, 71.5);
generalPath.lineTo(34.7, 74.9);
generalPath.lineTo(28.800001, 74.9);
generalPath.lineTo(28.800001, 91.600006);
generalPath.lineTo(24.7, 91.600006);
generalPath.closePath();
generalPath.moveTo(36.2, 85.0);
generalPath.lineTo(40.100002, 84.6);
generalPath.curveTo(40.300003, 85.9, 40.800003, 86.9, 41.500004, 87.5);
generalPath.curveTo(42.200005, 88.1, 43.200005, 88.4, 44.400005, 88.4);
generalPath.curveTo(45.700005, 88.4, 46.700005, 88.1, 47.300007, 87.6);
generalPath.curveTo(48.000008, 87.0, 48.300007, 86.4, 48.300007, 85.7);
generalPath.curveTo(48.300007, 85.2, 48.20001, 84.799995, 47.900005, 84.5);
generalPath.curveTo(47.600006, 84.2, 47.100006, 83.9, 46.400005, 83.6);
generalPath.curveTo(45.900005, 83.4, 44.800007, 83.1, 43.200005, 82.7);
generalPath.curveTo(41.000004, 82.2, 39.500004, 81.5, 38.600006, 80.7);
generalPath.curveTo(37.400005, 79.6, 36.800007, 78.299995, 36.800007, 76.7);
generalPath.curveTo(36.800007, 75.7, 37.100006, 74.7, 37.70001, 73.799995);
generalPath.curveTo(38.300007, 72.899994, 39.10001, 72.2, 40.20001, 71.799995);
generalPath.curveTo(41.300007, 71.299995, 42.60001, 71.1, 44.10001, 71.1);
generalPath.curveTo(46.60001, 71.1, 48.50001, 71.7, 49.80001, 72.799995);
generalPath.curveTo(51.10001, 73.899994, 51.700012, 75.399994, 51.80001, 77.2);
generalPath.lineTo(47.80001, 77.399994);
generalPath.curveTo(47.60001, 76.399994, 47.30001, 75.59999, 46.700012, 75.2);
generalPath.curveTo(46.100014, 74.7, 45.30001, 74.5, 44.100014, 74.5);
generalPath.curveTo(42.900013, 74.5, 42.000015, 74.7, 41.300014, 75.2);
generalPath.curveTo(40.900013, 75.5, 40.700016, 75.899994, 40.700016, 76.399994);
generalPath.curveTo(40.700016, 76.899994, 40.900017, 77.299995, 41.300014, 77.59999);
generalPath.curveTo(41.800014, 77.99999, 43.100014, 78.49999, 45.000015, 78.899994);
generalPath.curveTo(46.900017, 79.299995, 48.400017, 79.799995, 49.400017, 80.299995);
generalPath.curveTo(50.400017, 80.799995, 51.100018, 81.49999, 51.600018, 82.299995);
generalPath.curveTo(52.100018, 83.1, 52.400017, 84.2, 52.400017, 85.49999);
generalPath.curveTo(52.400017, 86.59999, 52.100018, 87.69999, 51.400017, 88.69999);
generalPath.curveTo(50.80002, 89.69999, 49.900017, 90.39999, 48.700016, 90.89999);
generalPath.curveTo(47.500015, 91.39999, 46.100018, 91.59998, 44.300014, 91.59998);
generalPath.curveTo(41.800014, 91.59998, 39.800014, 90.999985, 38.500015, 89.79998);
generalPath.curveTo(37.300014, 88.99998, 36.500015, 87.29998, 36.200016, 84.99998);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
	private ext_ts() {
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
       ext_ts base = new ext_ts();
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
       ext_ts base = new ext_ts();
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
        return ext_ts::new;
    }
}

