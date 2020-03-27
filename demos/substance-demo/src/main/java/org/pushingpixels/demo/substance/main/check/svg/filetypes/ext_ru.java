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
public class ext_ru implements ResizableIcon {
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
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
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
generalPath.moveTo(18.9, 90.1);
generalPath.lineTo(18.9, 70.2);
generalPath.lineTo(27.4, 70.2);
generalPath.curveTo(29.5, 70.2, 31.1, 70.399994, 32.1, 70.7);
generalPath.curveTo(33.1, 71.0, 33.899998, 71.7, 34.399998, 72.6);
generalPath.curveTo(34.999996, 73.5, 35.3, 74.6, 35.3, 75.7);
generalPath.curveTo(35.3, 77.2, 34.899998, 78.399994, 34.0, 79.399994);
generalPath.curveTo(33.100002, 80.399994, 31.8, 80.99999, 30.0, 81.2);
generalPath.curveTo(30.9, 81.7, 31.6, 82.299995, 32.2, 82.899994);
generalPath.curveTo(32.8, 83.49999, 33.5, 84.59999, 34.5, 86.09999);
generalPath.lineTo(37.0, 90.0);
generalPath.lineTo(32.1, 90.0);
generalPath.lineTo(29.199999, 85.7);
generalPath.curveTo(28.199999, 84.2, 27.4, 83.2, 27.099998, 82.799995);
generalPath.curveTo(26.699999, 82.399994, 26.3, 82.1, 25.899998, 81.99999);
generalPath.curveTo(25.499998, 81.899994, 24.799997, 81.799995, 23.899998, 81.799995);
generalPath.lineTo(23.099998, 81.799995);
generalPath.lineTo(23.099998, 90.1);
generalPath.lineTo(18.899998, 90.1);
generalPath.closePath();
generalPath.moveTo(22.9, 78.6);
generalPath.lineTo(25.9, 78.6);
generalPath.curveTo(27.8, 78.6, 29.1, 78.5, 29.5, 78.4);
generalPath.curveTo(29.9, 78.3, 30.4, 78.0, 30.6, 77.6);
generalPath.curveTo(30.9, 77.2, 31.0, 76.7, 31.0, 76.1);
generalPath.curveTo(31.0, 75.4, 30.8, 74.9, 30.5, 74.5);
generalPath.curveTo(30.1, 74.1, 29.6, 73.8, 29.0, 73.7);
generalPath.curveTo(28.7, 73.7, 27.7, 73.6, 26.0, 73.6);
generalPath.lineTo(22.8, 73.6);
generalPath.lineTo(22.8, 78.6);
generalPath.closePath();
generalPath.moveTo(39.1, 70.2);
generalPath.lineTo(43.199997, 70.2);
generalPath.lineTo(43.199997, 81.0);
generalPath.curveTo(43.199997, 82.7, 43.199997, 83.8, 43.399998, 84.3);
generalPath.curveTo(43.6, 85.100006, 43.999996, 85.8, 44.6, 86.3);
generalPath.curveTo(45.3, 86.8, 46.1, 87.0, 47.3, 87.0);
generalPath.curveTo(48.5, 87.0, 49.3, 86.8, 49.899998, 86.3);
generalPath.curveTo(50.499996, 85.8, 50.8, 85.3, 50.999996, 84.600006);
generalPath.curveTo(51.199993, 83.90001, 51.199997, 82.8, 51.199997, 81.200005);
generalPath.lineTo(51.199997, 70.200005);
generalPath.lineTo(55.299995, 70.200005);
generalPath.lineTo(55.299995, 80.600006);
generalPath.curveTo(55.299995, 83.00001, 55.199997, 84.700005, 54.999996, 85.600006);
generalPath.curveTo(54.799995, 86.600006, 54.399998, 87.40001, 53.799995, 88.100006);
generalPath.curveTo(53.199993, 88.8, 52.399994, 89.3, 51.399994, 89.700005);
generalPath.curveTo(50.399994, 90.100006, 49.099995, 90.3, 47.499992, 90.3);
generalPath.curveTo(45.59999, 90.3, 44.09999, 90.100006, 43.09999, 89.600006);
generalPath.curveTo(42.09999, 89.200005, 41.29999, 88.600006, 40.69999, 87.90001);
generalPath.curveTo(40.09999, 87.20001, 39.69999, 86.50001, 39.59999, 85.70001);
generalPath.curveTo(39.29999, 84.60001, 39.19999, 82.90001, 39.19999, 80.70001);
generalPath.lineTo(39.19999, 70.2);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
generalPath.moveTo(31.8, 32.0);
generalPath.curveTo(31.699999, 32.1, 31.699999, 32.1, 31.8, 32.0);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(54.0, 23.5);
generalPath.lineTo(54.0, 59.5);
generalPath.lineTo(45.0, 32.5);
generalPath.lineTo(54.0, 23.5);
generalPath.closePath();
generalPath.moveTo(18.0, 59.5);
generalPath.lineTo(54.0, 59.5);
generalPath.lineTo(27.0, 50.5);
generalPath.lineTo(18.0, 59.5);
generalPath.closePath();
generalPath.moveTo(27.0, 50.5);
generalPath.lineTo(54.0, 59.5);
generalPath.lineTo(36.0, 41.5);
generalPath.lineTo(27.0, 50.5);
generalPath.closePath();
generalPath.moveTo(36.0, 41.5);
generalPath.lineTo(54.0, 59.5);
generalPath.lineTo(45.0, 32.5);
generalPath.lineTo(36.0, 41.5);
generalPath.closePath();
generalPath.moveTo(18.0, 50.5);
generalPath.lineTo(18.0, 59.5);
generalPath.lineTo(27.0, 50.5);
generalPath.lineTo(18.0, 50.5);
generalPath.closePath();
generalPath.moveTo(36.0, 41.5);
generalPath.lineTo(27.0, 41.5);
generalPath.lineTo(27.0, 50.5);
generalPath.lineTo(36.0, 41.5);
generalPath.closePath();
generalPath.moveTo(45.0, 32.5);
generalPath.lineTo(36.0, 32.5);
generalPath.lineTo(36.0, 41.5);
generalPath.lineTo(45.0, 32.5);
generalPath.closePath();
generalPath.moveTo(54.0, 23.5);
generalPath.lineTo(45.0, 23.5);
generalPath.lineTo(45.0, 32.5);
generalPath.lineTo(54.0, 23.5);
generalPath.closePath();
generalPath.moveTo(27.0, 41.5);
generalPath.lineTo(18.0, 50.5);
generalPath.lineTo(27.0, 50.5);
generalPath.lineTo(27.0, 41.5);
generalPath.closePath();
generalPath.moveTo(36.0, 32.5);
generalPath.lineTo(27.0, 41.5);
generalPath.lineTo(36.0, 41.5);
generalPath.lineTo(36.0, 32.5);
generalPath.closePath();
generalPath.moveTo(45.0, 23.5);
generalPath.lineTo(36.0, 32.5);
generalPath.lineTo(45.0, 32.5);
generalPath.lineTo(45.0, 23.5);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0, 60.5), new Point2D.Double(54.0, 60.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(54.0, 23.5);
generalPath.lineTo(54.0, 59.5);
generalPath.lineTo(45.0, 32.5);
generalPath.lineTo(54.0, 23.5);
generalPath.closePath();
generalPath.moveTo(18.0, 59.5);
generalPath.lineTo(54.0, 59.5);
generalPath.lineTo(27.0, 50.5);
generalPath.lineTo(18.0, 59.5);
generalPath.closePath();
generalPath.moveTo(27.0, 50.5);
generalPath.lineTo(54.0, 59.5);
generalPath.lineTo(36.0, 41.5);
generalPath.lineTo(27.0, 50.5);
generalPath.closePath();
generalPath.moveTo(36.0, 41.5);
generalPath.lineTo(54.0, 59.5);
generalPath.lineTo(45.0, 32.5);
generalPath.lineTo(36.0, 41.5);
generalPath.closePath();
generalPath.moveTo(18.0, 50.5);
generalPath.lineTo(18.0, 59.5);
generalPath.lineTo(27.0, 50.5);
generalPath.lineTo(18.0, 50.5);
generalPath.closePath();
generalPath.moveTo(36.0, 41.5);
generalPath.lineTo(27.0, 41.5);
generalPath.lineTo(27.0, 50.5);
generalPath.lineTo(36.0, 41.5);
generalPath.closePath();
generalPath.moveTo(45.0, 32.5);
generalPath.lineTo(36.0, 32.5);
generalPath.lineTo(36.0, 41.5);
generalPath.lineTo(45.0, 32.5);
generalPath.closePath();
generalPath.moveTo(54.0, 23.5);
generalPath.lineTo(45.0, 23.5);
generalPath.lineTo(45.0, 32.5);
generalPath.lineTo(54.0, 23.5);
generalPath.closePath();
generalPath.moveTo(27.0, 41.5);
generalPath.lineTo(18.0, 50.5);
generalPath.lineTo(27.0, 50.5);
generalPath.lineTo(27.0, 41.5);
generalPath.closePath();
generalPath.moveTo(36.0, 32.5);
generalPath.lineTo(27.0, 41.5);
generalPath.lineTo(36.0, 41.5);
generalPath.lineTo(36.0, 32.5);
generalPath.closePath();
generalPath.moveTo(45.0, 23.5);
generalPath.lineTo(36.0, 32.5);
generalPath.lineTo(45.0, 32.5);
generalPath.lineTo(45.0, 23.5);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(54.0, 23.5);
generalPath.lineTo(54.0, 59.5);
generalPath.lineTo(45.0, 32.5);
generalPath.lineTo(54.0, 23.5);
generalPath.closePath();
generalPath.moveTo(18.0, 59.5);
generalPath.lineTo(54.0, 59.5);
generalPath.lineTo(27.0, 50.5);
generalPath.lineTo(18.0, 59.5);
generalPath.closePath();
generalPath.moveTo(27.0, 50.5);
generalPath.lineTo(54.0, 59.5);
generalPath.lineTo(36.0, 41.5);
generalPath.lineTo(27.0, 50.5);
generalPath.closePath();
generalPath.moveTo(36.0, 41.5);
generalPath.lineTo(54.0, 59.5);
generalPath.lineTo(45.0, 32.5);
generalPath.lineTo(36.0, 41.5);
generalPath.closePath();
generalPath.moveTo(18.0, 50.5);
generalPath.lineTo(18.0, 59.5);
generalPath.lineTo(27.0, 50.5);
generalPath.lineTo(18.0, 50.5);
generalPath.closePath();
generalPath.moveTo(36.0, 41.5);
generalPath.lineTo(27.0, 41.5);
generalPath.lineTo(27.0, 50.5);
generalPath.lineTo(36.0, 41.5);
generalPath.closePath();
generalPath.moveTo(45.0, 32.5);
generalPath.lineTo(36.0, 32.5);
generalPath.lineTo(36.0, 41.5);
generalPath.lineTo(45.0, 32.5);
generalPath.closePath();
generalPath.moveTo(54.0, 23.5);
generalPath.lineTo(45.0, 23.5);
generalPath.lineTo(45.0, 32.5);
generalPath.lineTo(54.0, 23.5);
generalPath.closePath();
generalPath.moveTo(27.0, 41.5);
generalPath.lineTo(18.0, 50.5);
generalPath.lineTo(27.0, 50.5);
generalPath.lineTo(27.0, 41.5);
generalPath.closePath();
generalPath.moveTo(36.0, 32.5);
generalPath.lineTo(27.0, 41.5);
generalPath.lineTo(36.0, 41.5);
generalPath.lineTo(36.0, 32.5);
generalPath.closePath();
generalPath.moveTo(45.0, 23.5);
generalPath.lineTo(36.0, 32.5);
generalPath.lineTo(45.0, 32.5);
generalPath.lineTo(45.0, 23.5);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
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
        return 0.13099998235702515;
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
		return 0.7420000433921814;
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
	private ext_ru() {
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
       ext_ru base = new ext_ru();
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
       ext_ru base = new ext_ru();
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
        return ext_ru::new;
    }
}

