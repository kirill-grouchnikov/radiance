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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_resx implements NeonIcon {
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.265000104904175), new Point2D.Double(36.0, 100.25), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(7.5f, 89.8f);
generalPath.lineTo(7.5f, 74.1f);
generalPath.lineTo(14.3f, 74.1f);
generalPath.curveTo(16.0f, 74.1f, 17.2f, 74.2f, 18.0f, 74.5f);
generalPath.curveTo(18.8f, 74.8f, 19.4f, 75.3f, 19.9f, 76.0f);
generalPath.curveTo(20.4f, 76.7f, 20.6f, 77.6f, 20.6f, 78.5f);
generalPath.curveTo(20.6f, 79.7f, 20.2f, 80.7f, 19.5f, 81.4f);
generalPath.curveTo(18.8f, 82.200005f, 17.7f, 82.700005f, 16.4f, 82.9f);
generalPath.curveTo(17.1f, 83.3f, 17.699999f, 83.700005f, 18.1f, 84.200005f);
generalPath.curveTo(18.500002f, 84.700005f, 19.2f, 85.50001f, 19.9f, 86.8f);
generalPath.lineTo(21.8f, 89.9f);
generalPath.lineTo(18.0f, 89.9f);
generalPath.lineTo(15.7f, 86.5f);
generalPath.curveTo(14.9f, 85.3f, 14.3f, 84.5f, 14.0f, 84.2f);
generalPath.curveTo(13.7f, 83.899994f, 13.4f, 83.7f, 13.0f, 83.5f);
generalPath.curveTo(12.7f, 83.4f, 12.1f, 83.3f, 11.4f, 83.3f);
generalPath.lineTo(10.7f, 83.3f);
generalPath.lineTo(10.7f, 89.9f);
generalPath.lineTo(7.5f, 89.9f);
generalPath.closePath();
generalPath.moveTo(10.8f, 80.700005f);
generalPath.lineTo(13.200001f, 80.700005f);
generalPath.curveTo(14.700001f, 80.700005f, 15.700001f, 80.600006f, 16.1f, 80.50001f);
generalPath.curveTo(16.5f, 80.40001f, 16.800001f, 80.100006f, 17.0f, 79.80001f);
generalPath.curveTo(17.199999f, 79.500015f, 17.3f, 79.10001f, 17.3f, 78.60001f);
generalPath.curveTo(17.3f, 78.10001f, 17.199999f, 77.60001f, 16.9f, 77.30001f);
generalPath.curveTo(16.6f, 77.00001f, 16.199999f, 76.80001f, 15.7f, 76.70001f);
generalPath.curveTo(15.4f, 76.70001f, 14.7f, 76.60001f, 13.4f, 76.60001f);
generalPath.lineTo(10.9f, 76.60001f);
generalPath.lineTo(10.9f, 80.70001f);
generalPath.closePath();
generalPath.moveTo(23.6f, 89.8f);
generalPath.lineTo(23.6f, 74.1f);
generalPath.lineTo(35.4f, 74.1f);
generalPath.lineTo(35.4f, 76.799995f);
generalPath.lineTo(26.800001f, 76.799995f);
generalPath.lineTo(26.800001f, 80.299995f);
generalPath.lineTo(34.800003f, 80.299995f);
generalPath.lineTo(34.800003f, 83.0f);
generalPath.lineTo(26.800003f, 83.0f);
generalPath.lineTo(26.800003f, 87.3f);
generalPath.lineTo(35.700005f, 87.3f);
generalPath.lineTo(35.700005f, 90.0f);
generalPath.lineTo(23.6f, 90.0f);
generalPath.closePath();
generalPath.moveTo(37.6f, 84.700005f);
generalPath.lineTo(40.699997f, 84.4f);
generalPath.curveTo(40.899998f, 85.4f, 41.299995f, 86.200005f, 41.799995f, 86.700005f);
generalPath.curveTo(42.299995f, 87.200005f, 43.199997f, 87.4f, 44.099995f, 87.4f);
generalPath.curveTo(45.099995f, 87.4f, 45.899994f, 87.200005f, 46.399994f, 86.700005f);
generalPath.curveTo(46.899994f, 86.3f, 47.199993f, 85.8f, 47.199993f, 85.200005f);
generalPath.curveTo(47.199993f, 84.8f, 47.099995f, 84.50001f, 46.899994f, 84.200005f);
generalPath.curveTo(46.699993f, 83.9f, 46.299995f, 83.700005f, 45.699993f, 83.50001f);
generalPath.curveTo(45.29999f, 83.40001f, 44.499992f, 83.100006f, 43.099995f, 82.80001f);
generalPath.curveTo(41.399994f, 82.40001f, 40.199993f, 81.90001f, 39.499996f, 81.20001f);
generalPath.curveTo(38.499996f, 80.30001f, 37.999996f, 79.30001f, 37.999996f, 78.000015f);
generalPath.curveTo(37.999996f, 77.20001f, 38.199997f, 76.40002f, 38.699997f, 75.80002f);
generalPath.curveTo(39.199997f, 75.10002f, 39.799995f, 74.60002f, 40.699997f, 74.20002f);
generalPath.curveTo(41.6f, 73.80002f, 42.6f, 73.70002f, 43.799995f, 73.70002f);
generalPath.curveTo(45.799995f, 73.70002f, 47.299995f, 74.10002f, 48.299995f, 75.00002f);
generalPath.curveTo(49.299995f, 75.900024f, 49.799995f, 77.00002f, 49.899994f, 78.50002f);
generalPath.lineTo(46.699993f, 78.60002f);
generalPath.curveTo(46.599995f, 77.80002f, 46.29999f, 77.20002f, 45.79999f, 76.900024f);
generalPath.curveTo(45.29999f, 76.50002f, 44.699993f, 76.400024f, 43.79999f, 76.400024f);
generalPath.curveTo(42.89999f, 76.400024f, 42.09999f, 76.60002f, 41.59999f, 77.00002f);
generalPath.curveTo(41.29999f, 77.20002f, 41.09999f, 77.60002f, 41.09999f, 78.00002f);
generalPath.curveTo(41.09999f, 78.400024f, 41.29999f, 78.70002f, 41.59999f, 79.00002f);
generalPath.curveTo(41.999992f, 79.300026f, 42.999992f, 79.70002f, 44.59999f, 80.10002f);
generalPath.curveTo(46.19999f, 80.50002f, 47.29999f, 80.80002f, 48.09999f, 81.20002f);
generalPath.curveTo(48.79999f, 81.60002f, 49.39999f, 82.10002f, 49.89999f, 82.80002f);
generalPath.curveTo(50.29999f, 83.500015f, 50.49999f, 84.30002f, 50.49999f, 85.30002f);
generalPath.curveTo(50.49999f, 86.20002f, 50.19999f, 87.000015f, 49.69999f, 87.80002f);
generalPath.curveTo(49.19999f, 88.60002f, 48.49999f, 89.20002f, 47.59999f, 89.60002f);
generalPath.curveTo(46.69999f, 90.00002f, 45.499992f, 90.20002f, 44.09999f, 90.20002f);
generalPath.curveTo(42.09999f, 90.20002f, 40.499992f, 89.70002f, 39.499992f, 88.80002f);
generalPath.curveTo(38.499992f, 87.80002f, 37.79999f, 86.500015f, 37.59999f, 84.70002f);
generalPath.closePath();
generalPath.moveTo(51.6f, 89.8f);
generalPath.lineTo(57.0f, 81.600006f);
generalPath.lineTo(52.1f, 74.100006f);
generalPath.lineTo(55.899998f, 74.100006f);
generalPath.lineTo(59.1f, 79.200005f);
generalPath.lineTo(62.199997f, 74.100006f);
generalPath.lineTo(65.899994f, 74.100006f);
generalPath.lineTo(61.0f, 81.7f);
generalPath.lineTo(66.4f, 89.799995f);
generalPath.lineTo(62.5f, 89.799995f);
generalPath.lineTo(59.0f, 84.4f);
generalPath.lineTo(55.5f, 89.8f);
generalPath.lineTo(51.6f, 89.8f);
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
generalPath.moveTo(28.2f, 44.6f);
generalPath.curveTo(26.800001f, 45.6f, 25.5f, 46.699997f, 24.2f, 47.699997f);
generalPath.curveTo(21.5f, 49.699997f, 18.900002f, 51.799995f, 16.2f, 53.799995f);
generalPath.curveTo(15.800001f, 54.099995f, 15.6f, 54.099995f, 15.200001f, 53.899994f);
generalPath.curveTo(14.700001f, 53.599995f, 14.1f, 53.299995f, 13.500001f, 52.999992f);
generalPath.curveTo(13.200001f, 52.79999f, 13.100001f, 52.59999f, 13.100001f, 52.29999f);
generalPath.lineTo(13.100001f, 31.1f);
generalPath.curveTo(13.100001f, 30.9f, 13.300001f, 30.5f, 13.500001f, 30.4f);
generalPath.curveTo(14.100001f, 30.0f, 14.800001f, 29.699999f, 15.400001f, 29.4f);
generalPath.curveTo(15.700001f, 29.199999f, 16.0f, 29.4f, 16.300001f, 29.6f);
generalPath.curveTo(18.500002f, 31.300001f, 20.7f, 33.0f, 22.900002f, 34.6f);
generalPath.curveTo(24.7f, 36.0f, 26.500002f, 37.399998f, 28.300001f, 38.699997f);
generalPath.curveTo(28.400002f, 38.6f, 28.6f, 38.499996f, 28.7f, 38.399998f);
generalPath.curveTo(35.3f, 31.999998f, 41.9f, 25.599998f, 48.4f, 19.199997f);
generalPath.curveTo(48.7f, 18.899998f, 49.0f, 18.799997f, 49.4f, 18.999996f);
generalPath.curveTo(52.2f, 20.099997f, 55.0f, 21.199997f, 57.800003f, 22.399996f);
generalPath.curveTo(58.000004f, 22.499996f, 58.200005f, 22.799995f, 58.300003f, 22.999996f);
generalPath.curveTo(58.4f, 23.099997f, 58.300003f, 23.299995f, 58.300003f, 23.499996f);
generalPath.lineTo(58.300003f, 60.0f);
generalPath.curveTo(58.300003f, 60.9f, 58.300003f, 60.9f, 57.4f, 61.2f);
generalPath.curveTo(54.7f, 62.3f, 52.100002f, 63.3f, 49.5f, 64.4f);
generalPath.curveTo(49.0f, 64.6f, 48.7f, 64.5f, 48.4f, 64.200005f);
generalPath.curveTo(41.9f, 57.800003f, 35.4f, 51.500004f, 28.800001f, 45.200005f);
generalPath.lineTo(28.2f, 44.600006f);
generalPath.closePath();
generalPath.moveTo(47.2f, 50.399998f);
generalPath.lineTo(47.2f, 33.0f);
generalPath.curveTo(43.3f, 35.9f, 39.5f, 38.8f, 35.6f, 41.7f);
generalPath.curveTo(39.5f, 44.600002f, 43.3f, 47.5f, 47.199997f, 50.4f);
generalPath.closePath();
generalPath.moveTo(22.900002f, 41.699997f);
generalPath.curveTo(21.000002f, 39.999996f, 19.100002f, 38.299995f, 17.100002f, 36.499996f);
generalPath.lineTo(17.100002f, 46.899994f);
generalPath.curveTo(19.000002f, 45.199993f, 20.900002f, 43.399994f, 22.900002f, 41.699993f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.61899948120117, 64.5), new Point2D.Double(35.61899948120117, 18.9060001373291), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 73.45700073242188), new Point2D.Double(58.569000244140625, 86.95700073242188), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
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
		return 0.9980000257492065;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_resx() {
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
    public static NeonIcon of(int width, int height) {
       ext_resx base = new ext_resx();
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
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_resx base = new ext_resx();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_resx::new;
    }
}

