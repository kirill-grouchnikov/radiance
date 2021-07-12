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
public class ext_wbk implements NeonIcon {
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
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
generalPath.moveTo(14.5f, 90.1f);
generalPath.lineTo(10.7f, 74.4f);
generalPath.lineTo(14.0f, 74.4f);
generalPath.lineTo(16.4f, 85.200005f);
generalPath.lineTo(19.3f, 74.4f);
generalPath.lineTo(23.099998f, 74.4f);
generalPath.lineTo(25.899998f, 85.4f);
generalPath.lineTo(28.399998f, 74.4f);
generalPath.lineTo(31.599998f, 74.4f);
generalPath.lineTo(27.699999f, 90.1f);
generalPath.lineTo(24.3f, 90.1f);
generalPath.lineTo(21.099998f, 78.299995f);
generalPath.lineTo(18.0f, 90.1f);
generalPath.lineTo(14.5f, 90.1f);
generalPath.closePath();
generalPath.moveTo(33.3f, 74.299995f);
generalPath.lineTo(39.7f, 74.299995f);
generalPath.curveTo(41.0f, 74.299995f, 41.9f, 74.399994f, 42.5f, 74.49999f);
generalPath.curveTo(43.1f, 74.59999f, 43.7f, 74.799995f, 44.2f, 75.09999f);
generalPath.curveTo(44.7f, 75.39999f, 45.100002f, 75.899994f, 45.4f, 76.399994f);
generalPath.curveTo(45.7f, 76.899994f, 45.9f, 77.59999f, 45.9f, 78.2f);
generalPath.curveTo(45.9f, 78.899994f, 45.7f, 79.6f, 45.300003f, 80.2f);
generalPath.curveTo(44.900005f, 80.799995f, 44.4f, 81.299995f, 43.700005f, 81.6f);
generalPath.curveTo(44.700005f, 81.9f, 45.400005f, 82.4f, 45.900005f, 83.0f);
generalPath.curveTo(46.400005f, 83.6f, 46.700005f, 84.5f, 46.700005f, 85.4f);
generalPath.curveTo(46.700005f, 86.1f, 46.500004f, 86.8f, 46.200005f, 87.5f);
generalPath.curveTo(45.900005f, 88.2f, 45.400005f, 88.7f, 44.800003f, 89.1f);
generalPath.curveTo(44.200005f, 89.5f, 43.500004f, 89.799995f, 42.600002f, 89.799995f);
generalPath.curveTo(42.100002f, 89.899994f, 40.800003f, 89.899994f, 38.7f, 89.899994f);
generalPath.lineTo(33.3f, 89.899994f);
generalPath.lineTo(33.3f, 74.3f);
generalPath.closePath();
generalPath.moveTo(36.5f, 76.899994f);
generalPath.lineTo(36.5f, 80.49999f);
generalPath.lineTo(38.6f, 80.49999f);
generalPath.curveTo(39.899998f, 80.49999f, 40.6f, 80.49999f, 40.899998f, 80.399994f);
generalPath.curveTo(41.499996f, 80.299995f, 41.899998f, 80.09999f, 42.199997f, 79.799995f);
generalPath.curveTo(42.499996f, 79.49999f, 42.699997f, 79.1f, 42.699997f, 78.6f);
generalPath.curveTo(42.699997f, 78.1f, 42.6f, 77.7f, 42.299995f, 77.4f);
generalPath.curveTo(41.999996f, 77.1f, 41.599995f, 76.9f, 41.099995f, 76.8f);
generalPath.curveTo(40.799995f, 76.8f, 39.899994f, 76.700005f, 38.299995f, 76.700005f);
generalPath.lineTo(36.499996f, 76.700005f);
generalPath.closePath();
generalPath.moveTo(36.5f, 83.2f);
generalPath.lineTo(36.5f, 87.399994f);
generalPath.lineTo(39.5f, 87.399994f);
generalPath.curveTo(40.7f, 87.399994f, 41.4f, 87.399994f, 41.7f, 87.299995f);
generalPath.curveTo(42.2f, 87.2f, 42.600002f, 86.99999f, 42.9f, 86.7f);
generalPath.curveTo(43.2f, 86.399994f, 43.4f, 85.899994f, 43.4f, 85.399994f);
generalPath.curveTo(43.4f, 84.899994f, 43.300003f, 84.49999f, 43.100002f, 84.2f);
generalPath.curveTo(42.9f, 83.9f, 42.500004f, 83.6f, 42.100002f, 83.5f);
generalPath.curveTo(41.7f, 83.3f, 40.7f, 83.3f, 39.2f, 83.3f);
generalPath.lineTo(36.5f, 83.3f);
generalPath.closePath();
generalPath.moveTo(49.5f, 90.1f);
generalPath.lineTo(49.5f, 74.3f);
generalPath.lineTo(52.7f, 74.3f);
generalPath.lineTo(52.7f, 81.3f);
generalPath.lineTo(59.2f, 74.3f);
generalPath.lineTo(63.5f, 74.3f);
generalPath.lineTo(57.5f, 80.4f);
generalPath.lineTo(63.8f, 90.0f);
generalPath.lineTo(59.6f, 90.0f);
generalPath.lineTo(55.199997f, 82.6f);
generalPath.lineTo(52.6f, 85.2f);
generalPath.lineTo(52.6f, 90.0f);
generalPath.lineTo(49.5f, 90.0f);
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
generalPath.moveTo(64.4f, 27.7f);
generalPath.curveTo(63.9f, 27.7f, 63.4f, 27.900002f, 63.0f, 28.0f);
generalPath.curveTo(62.5f, 28.2f, 62.0f, 28.4f, 61.6f, 28.6f);
generalPath.curveTo(60.899998f, 29.0f, 60.399998f, 29.4f, 60.1f, 29.9f);
generalPath.curveTo(59.8f, 30.4f, 59.5f, 31.0f, 59.3f, 31.6f);
generalPath.curveTo(58.399998f, 34.0f, 57.1f, 37.6f, 55.3f, 42.9f);
generalPath.curveTo(53.5f, 48.0f, 51.7f, 53.4f, 49.7f, 58.9f);
generalPath.lineTo(45.0f, 58.9f);
generalPath.lineTo(36.3f, 34.5f);
generalPath.lineTo(28.4f, 58.9f);
generalPath.lineTo(23.7f, 58.9f);
generalPath.curveTo(21.1f, 51.4f, 19.1f, 45.600002f, 17.7f, 41.7f);
generalPath.curveTo(16.300001f, 37.600002f, 15.200001f, 34.3f, 14.200001f, 31.5f);
generalPath.curveTo(13.900001f, 30.7f, 13.6f, 30.1f, 13.200001f, 29.7f);
generalPath.curveTo(12.800001f, 29.300001f, 12.300001f, 28.900002f, 11.800001f, 28.5f);
generalPath.curveTo(11.400002f, 28.2f, 10.900002f, 28.0f, 10.500001f, 27.9f);
generalPath.curveTo(10.000001f, 27.8f, 9.500001f, 27.699999f, 8.900001f, 27.6f);
generalPath.lineTo(8.900001f, 25.800001f);
generalPath.lineTo(26.5f, 25.800001f);
generalPath.lineTo(26.5f, 27.6f);
generalPath.curveTo(25.5f, 27.7f, 24.7f, 27.800001f, 24.2f, 28.0f);
generalPath.curveTo(23.7f, 28.1f, 23.300001f, 28.2f, 23.0f, 28.4f);
generalPath.curveTo(22.7f, 28.5f, 22.5f, 28.699999f, 22.5f, 28.8f);
generalPath.curveTo(22.4f, 28.9f, 22.4f, 29.099998f, 22.4f, 29.199999f);
generalPath.curveTo(22.4f, 29.4f, 22.4f, 29.599998f, 22.5f, 29.8f);
generalPath.curveTo(22.6f, 30.0f, 22.6f, 30.199999f, 22.7f, 30.5f);
generalPath.curveTo(23.1f, 31.7f, 23.800001f, 34.0f, 25.0f, 37.3f);
generalPath.curveTo(26.1f, 40.7f, 27.5f, 44.8f, 29.2f, 49.8f);
generalPath.lineTo(36.7f, 26.0f);
generalPath.lineTo(41.600002f, 26.0f);
generalPath.lineTo(50.300003f, 50.5f);
generalPath.curveTo(51.600002f, 46.5f, 52.600002f, 43.3f, 53.4f, 40.8f);
generalPath.curveTo(54.2f, 38.3f, 54.800003f, 36.1f, 55.300003f, 34.399998f);
generalPath.curveTo(55.600002f, 33.3f, 55.9f, 32.399998f, 56.000004f, 31.599998f);
generalPath.curveTo(56.200005f, 30.899998f, 56.300003f, 30.199999f, 56.300003f, 29.699999f);
generalPath.curveTo(56.300003f, 29.4f, 56.100002f, 29.099998f, 55.800003f, 28.9f);
generalPath.curveTo(55.500004f, 28.699999f, 55.100002f, 28.5f, 54.600002f, 28.3f);
generalPath.curveTo(54.2f, 28.199999f, 53.600002f, 28.0f, 52.9f, 28.0f);
generalPath.curveTo(52.2f, 27.9f, 51.600002f, 27.8f, 51.100002f, 27.8f);
generalPath.lineTo(51.100002f, 25.8f);
generalPath.lineTo(64.4f, 25.8f);
generalPath.lineTo(64.4f, 27.699999f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.60599899291992, 58.926998138427734), new Point2D.Double(36.60599899291992, 25.865999221801758), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(31.8f, 32.0f);
generalPath.curveTo(31.699999f, 32.1f, 31.699999f, 32.1f, 31.8f, 32.0f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
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
	private ext_wbk() {
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
       ext_wbk base = new ext_wbk();
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
       ext_wbk base = new ext_wbk();
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
        return ext_wbk::new;
    }
}

