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
public class ext_sed implements ResizableIcon {
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
generalPath.moveTo(38.7, 45.4);
generalPath.lineTo(41.9, 46.300003);
generalPath.lineTo(43.800003, 39.300003);
generalPath.lineTo(40.600002, 38.4);
generalPath.curveTo(40.600002, 37.300003, 40.500004, 36.100002, 40.2, 35.0);
generalPath.lineTo(43.100002, 33.3);
generalPath.lineTo(39.4, 27.0);
generalPath.lineTo(36.5, 28.7);
generalPath.curveTo(35.7, 27.900002, 34.8, 27.2, 33.8, 26.6);
generalPath.lineTo(34.7, 23.4);
generalPath.lineTo(27.7, 21.5);
generalPath.lineTo(26.800001, 24.7);
generalPath.curveTo(25.7, 24.7, 24.500002, 24.800001, 23.400002, 25.1);
generalPath.lineTo(21.7, 22.2);
generalPath.lineTo(15.400001, 25.800001);
generalPath.lineTo(17.1, 28.7);
generalPath.curveTo(16.300001, 29.5, 15.6, 30.400002, 15.0, 31.400002);
generalPath.lineTo(11.8, 30.500002);
generalPath.lineTo(9.900001, 37.5);
generalPath.lineTo(13.1, 38.4);
generalPath.curveTo(13.1, 39.5, 13.200001, 40.7, 13.5, 41.800003);
generalPath.lineTo(10.6, 43.500004);
generalPath.lineTo(14.200001, 49.800003);
generalPath.lineTo(17.1, 48.100002);
generalPath.curveTo(17.9, 48.9, 18.800001, 49.600002, 19.800001, 50.2);
generalPath.lineTo(18.900002, 53.4);
generalPath.lineTo(25.900002, 55.300003);
generalPath.lineTo(26.800001, 52.100002);
generalPath.curveTo(27.900002, 52.100002, 29.1, 51.9, 30.2, 51.7);
generalPath.lineTo(31.900002, 54.600002);
generalPath.lineTo(38.2, 51.000004);
generalPath.lineTo(36.5, 48.100002);
generalPath.curveTo(37.4, 47.300003, 38.1, 46.4, 38.7, 45.4);
generalPath.closePath();
generalPath.moveTo(21.300001, 41.7);
generalPath.curveTo(19.500002, 38.600002, 20.6, 34.600002, 23.7, 32.9);
generalPath.curveTo(26.800001, 31.100002, 30.800001, 32.2, 32.5, 35.300003);
generalPath.curveTo(34.3, 38.4, 33.2, 42.4, 30.1, 44.100002);
generalPath.curveTo(27.0, 45.800003, 23.0, 44.800003, 21.3, 41.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.861000061035156, 55.39099884033203), new Point2D.Double(26.861000061035156, 21.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(55.4, 64.0);
generalPath.lineTo(59.5, 61.6);
generalPath.lineTo(58.4, 59.699997);
generalPath.curveTo(58.9, 59.199997, 59.4, 58.6, 59.800003, 57.899998);
generalPath.lineTo(61.9, 58.499996);
generalPath.lineTo(63.100002, 53.899998);
generalPath.lineTo(61.000004, 53.399998);
generalPath.curveTo(61.000004, 52.699997, 60.900005, 51.899998, 60.700005, 51.199997);
generalPath.lineTo(62.600006, 50.1);
generalPath.lineTo(60.200005, 46.0);
generalPath.lineTo(58.300003, 47.0);
generalPath.curveTo(57.800003, 46.5, 57.200005, 46.0, 56.500004, 45.6);
generalPath.lineTo(57.100002, 43.5);
generalPath.lineTo(52.500004, 42.3);
generalPath.lineTo(51.900005, 44.399998);
generalPath.curveTo(51.200005, 44.399998, 50.400005, 44.499996, 49.700005, 44.699997);
generalPath.lineTo(48.600006, 42.799995);
generalPath.lineTo(44.500008, 45.199997);
generalPath.lineTo(45.600006, 47.1);
generalPath.curveTo(45.100006, 47.6, 44.600006, 48.199997, 44.200005, 48.899998);
generalPath.lineTo(42.100006, 48.3);
generalPath.lineTo(40.900005, 52.899998);
generalPath.lineTo(43.000004, 53.499996);
generalPath.curveTo(43.000004, 54.199997, 43.100002, 54.999996, 43.300003, 55.699997);
generalPath.lineTo(41.4, 56.799995);
generalPath.lineTo(43.800003, 60.899994);
generalPath.lineTo(45.700005, 59.799995);
generalPath.curveTo(46.200005, 60.299995, 46.800003, 60.799995, 47.500004, 61.199997);
generalPath.lineTo(46.900005, 63.299995);
generalPath.lineTo(51.500004, 64.49999);
generalPath.lineTo(52.100002, 62.399994);
generalPath.curveTo(52.800003, 62.399994, 53.600002, 62.299995, 54.300003, 62.099995);
generalPath.lineTo(55.4, 63.999996);
generalPath.closePath();
generalPath.moveTo(48.300003, 55.5);
generalPath.curveTo(47.100002, 53.5, 47.800003, 50.9, 49.9, 49.7);
generalPath.curveTo(51.9, 48.5, 54.5, 49.2, 55.7, 51.2);
generalPath.curveTo(56.9, 53.2, 56.2, 55.8, 54.2, 57.0);
generalPath.curveTo(52.100002, 58.2, 49.5, 57.6, 48.3, 55.5);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(52.00199890136719, 64.5), new Point2D.Double(52.00199890136719, 42.33599853515625), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(8.3, 84.6);
generalPath.lineTo(12.200001, 84.2);
generalPath.curveTo(12.400001, 85.5, 12.900001, 86.5, 13.6, 87.1);
generalPath.curveTo(14.3, 87.7, 15.3, 88.0, 16.5, 88.0);
generalPath.curveTo(17.8, 88.0, 18.8, 87.7, 19.4, 87.2);
generalPath.curveTo(20.1, 86.7, 20.4, 86.0, 20.4, 85.299995);
generalPath.curveTo(20.4, 84.799995, 20.3, 84.399994, 20.0, 84.1);
generalPath.curveTo(19.7, 83.799995, 19.2, 83.5, 18.5, 83.2);
generalPath.curveTo(18.0, 83.0, 17.0, 82.7, 15.3, 82.299995);
generalPath.curveTo(13.1, 81.799995, 11.6, 81.1, 10.700001, 80.299995);
generalPath.curveTo(9.700001, 79.299995, 9.000001, 77.99999, 9.000001, 76.399994);
generalPath.curveTo(9.000001, 75.399994, 9.300001, 74.399994, 9.900001, 73.59999);
generalPath.curveTo(10.500001, 72.69999, 11.3, 72.09999, 12.400001, 71.59999);
generalPath.curveTo(13.500001, 71.09999, 14.800001, 70.899994, 16.300001, 70.899994);
generalPath.curveTo(18.800001, 70.899994, 20.7, 71.399994, 22.0, 72.49999);
generalPath.curveTo(23.3, 73.59999, 23.9, 74.99999, 24.0, 76.899994);
generalPath.lineTo(20.0, 77.09999);
generalPath.curveTo(19.8, 76.09999, 19.5, 75.29999, 18.9, 74.899994);
generalPath.curveTo(18.3, 74.49999, 17.5, 74.2, 16.3, 74.2);
generalPath.curveTo(15.099999, 74.2, 14.199999, 74.399994, 13.499999, 74.899994);
generalPath.curveTo(13.099999, 75.2, 12.899999, 75.59999, 12.899999, 76.09999);
generalPath.curveTo(12.899999, 76.59999, 13.099998, 76.99999, 13.499999, 77.29999);
generalPath.curveTo(13.999999, 77.69999, 15.199999, 78.19999, 17.199999, 78.59999);
generalPath.curveTo(19.199999, 78.99999, 20.599998, 79.49999, 21.599998, 79.99999);
generalPath.curveTo(22.499998, 80.49999, 23.3, 81.19999, 23.8, 81.99999);
generalPath.curveTo(24.3, 82.899994, 24.599998, 83.899994, 24.599998, 85.19999);
generalPath.curveTo(24.599998, 86.29999, 24.3, 87.39999, 23.599998, 88.39999);
generalPath.curveTo(22.999998, 89.39999, 22.099998, 90.09998, 20.899998, 90.59998);
generalPath.curveTo(19.699997, 91.09998, 18.299997, 91.29998, 16.599998, 91.29998);
generalPath.curveTo(14.099998, 91.29998, 12.099998, 90.69998, 10.799998, 89.59998);
generalPath.curveTo(9.399999, 88.499985, 8.599998, 86.79998, 8.299998, 84.59998);
generalPath.closePath();
generalPath.moveTo(28.0, 91.1);
generalPath.lineTo(28.0, 71.2);
generalPath.lineTo(42.8, 71.2);
generalPath.lineTo(42.8, 74.6);
generalPath.lineTo(32.0, 74.6);
generalPath.lineTo(32.0, 79.0);
generalPath.lineTo(42.0, 79.0);
generalPath.lineTo(42.0, 82.3);
generalPath.lineTo(32.0, 82.3);
generalPath.lineTo(32.0, 87.700005);
generalPath.lineTo(43.2, 87.700005);
generalPath.lineTo(43.2, 91.0);
generalPath.lineTo(28.0, 91.0);
generalPath.closePath();
generalPath.moveTo(46.6, 71.2);
generalPath.lineTo(54.0, 71.2);
generalPath.curveTo(55.7, 71.2, 56.9, 71.299995, 57.8, 71.6);
generalPath.curveTo(59.0, 71.9, 60.0, 72.6, 60.8, 73.4);
generalPath.curveTo(61.6, 74.200005, 62.3, 75.3, 62.7, 76.6);
generalPath.curveTo(63.100002, 77.9, 63.4, 79.4, 63.4, 81.299995);
generalPath.curveTo(63.4, 82.899994, 63.2, 84.299995, 62.800003, 85.49999);
generalPath.curveTo(62.300003, 86.899994, 61.600002, 88.09999, 60.700005, 88.99999);
generalPath.curveTo(60.000004, 89.69999, 59.100006, 90.19999, 57.900005, 90.59999);
generalPath.curveTo(57.000004, 90.899994, 55.800007, 90.99999, 54.300007, 90.99999);
generalPath.lineTo(46.70001, 90.99999);
generalPath.lineTo(46.70001, 71.2);
generalPath.closePath();
generalPath.moveTo(50.6, 74.6);
generalPath.lineTo(50.6, 87.7);
generalPath.lineTo(53.6, 87.7);
generalPath.curveTo(54.699997, 87.7, 55.5, 87.6, 56.0, 87.5);
generalPath.curveTo(56.7, 87.3, 57.2, 87.1, 57.6, 86.7);
generalPath.curveTo(57.999996, 86.299995, 58.399998, 85.7, 58.699997, 84.799995);
generalPath.curveTo(58.999996, 83.899994, 59.1, 82.7, 59.1, 81.2);
generalPath.curveTo(59.1, 79.7, 59.0, 78.5, 58.699997, 77.7);
generalPath.curveTo(58.399994, 76.899994, 57.999996, 76.2, 57.6, 75.799995);
generalPath.curveTo(57.1, 75.299995, 56.5, 74.99999, 55.699997, 74.899994);
generalPath.curveTo(55.1, 74.799995, 53.999996, 74.7, 52.399998, 74.7);
generalPath.lineTo(50.6, 74.7);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
// _0_6
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
	private ext_sed() {
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
       ext_sed base = new ext_sed();
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
       ext_sed base = new ext_sed();
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
        return ext_sed::new;
    }
}

