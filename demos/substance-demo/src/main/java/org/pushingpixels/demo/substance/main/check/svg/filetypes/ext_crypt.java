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
public class ext_crypt implements ResizableIcon {
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(51.4f, 37.7f);
generalPath.lineTo(48.5f, 37.7f);
generalPath.lineTo(48.5f, 32.0f);
generalPath.curveTo(48.5f, 25.6f, 43.3f, 20.3f, 36.8f, 20.3f);
generalPath.curveTo(30.3f, 20.3f, 25.1f, 25.6f, 25.1f, 32.0f);
generalPath.lineTo(25.1f, 37.7f);
generalPath.lineTo(22.2f, 37.7f);
generalPath.curveTo(21.1f, 37.7f, 20.2f, 38.600002f, 20.2f, 39.7f);
generalPath.lineTo(20.2f, 59.5f);
generalPath.curveTo(20.2f, 60.6f, 21.1f, 61.5f, 22.2f, 61.5f);
generalPath.lineTo(51.300003f, 61.5f);
generalPath.curveTo(52.4f, 61.5f, 53.300003f, 60.6f, 53.300003f, 59.5f);
generalPath.lineTo(53.300003f, 39.8f);
generalPath.curveTo(53.4f, 38.6f, 52.500004f, 37.7f, 51.4f, 37.7f);
generalPath.closePath();
generalPath.moveTo(39.3f, 54.2f);
generalPath.curveTo(39.5f, 54.9f, 39.0f, 55.5f, 38.3f, 55.5f);
generalPath.lineTo(35.3f, 55.5f);
generalPath.curveTo(34.6f, 55.5f, 34.1f, 54.8f, 34.3f, 54.2f);
generalPath.lineTo(35.3f, 50.5f);
generalPath.curveTo(34.2f, 49.9f, 33.399998f, 48.8f, 33.399998f, 47.4f);
generalPath.curveTo(33.399998f, 45.4f, 34.999996f, 43.9f, 36.899998f, 43.9f);
generalPath.curveTo(38.8f, 43.9f, 40.399998f, 45.5f, 40.399998f, 47.4f);
generalPath.curveTo(40.399998f, 48.800003f, 39.6f, 50.0f, 38.499996f, 50.5f);
generalPath.lineTo(39.299995f, 54.2f);
generalPath.closePath();
generalPath.moveTo(42.6f, 37.7f);
generalPath.lineTo(31.0f, 37.7f);
generalPath.lineTo(31.0f, 32.0f);
generalPath.curveTo(31.0f, 28.8f, 33.6f, 26.2f, 36.8f, 26.2f);
generalPath.curveTo(40.0f, 26.2f, 42.6f, 28.800001f, 42.6f, 32.0f);
generalPath.lineTo(42.6f, 37.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.79999923706055, 61.5890007019043), new Point2D.Double(36.79999923706055, 20.33300018310547), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.5f, 86.9f);
generalPath.lineTo(17.2f, 87.700005f);
generalPath.curveTo(16.800001f, 89.200005f, 16.1f, 90.3f, 15.200001f, 91.00001f);
generalPath.curveTo(14.300001f, 91.700005f, 13.000001f, 92.100006f, 11.6f, 92.100006f);
generalPath.curveTo(9.8f, 92.100006f, 8.3f, 91.50001f, 7.1000004f, 90.200005f);
generalPath.curveTo(5.9000006f, 89.00001f, 5.4000006f, 87.3f, 5.4000006f, 85.100006f);
generalPath.curveTo(5.4000006f, 82.8f, 6.0000005f, 81.100006f, 7.200001f, 79.8f);
generalPath.curveTo(8.400001f, 78.5f, 9.900001f, 77.9f, 11.800001f, 77.9f);
generalPath.curveTo(13.500001f, 77.9f, 14.800001f, 78.4f, 15.900002f, 79.4f);
generalPath.curveTo(16.500002f, 80.0f, 17.000002f, 80.8f, 17.300001f, 81.9f);
generalPath.lineTo(14.600001f, 82.5f);
generalPath.curveTo(14.400002f, 81.8f, 14.100001f, 81.2f, 13.600001f, 80.8f);
generalPath.curveTo(13.100001f, 80.4f, 12.500001f, 80.200005f, 11.700002f, 80.200005f);
generalPath.curveTo(10.700002f, 80.200005f, 9.900002f, 80.600006f, 9.200002f, 81.3f);
generalPath.curveTo(8.600001f, 82.0f, 8.300002f, 83.200005f, 8.300002f, 84.8f);
generalPath.curveTo(8.300002f, 86.5f, 8.600002f, 87.700005f, 9.200002f, 88.5f);
generalPath.curveTo(9.800002f, 89.2f, 10.600001f, 89.6f, 11.600002f, 89.6f);
generalPath.curveTo(12.300002f, 89.6f, 13.000002f, 89.4f, 13.500002f, 88.9f);
generalPath.curveTo(13.900002f, 88.6f, 14.300002f, 87.9f, 14.500002f, 86.9f);
generalPath.closePath();
generalPath.moveTo(19.5f, 91.9f);
generalPath.lineTo(19.5f, 78.3f);
generalPath.lineTo(25.3f, 78.3f);
generalPath.curveTo(26.8f, 78.3f, 27.8f, 78.4f, 28.5f, 78.700005f);
generalPath.curveTo(29.2f, 78.9f, 29.7f, 79.4f, 30.1f, 80.00001f);
generalPath.curveTo(30.5f, 80.600006f, 30.7f, 81.30001f, 30.7f, 82.100006f);
generalPath.curveTo(30.7f, 83.100006f, 30.400002f, 84.00001f, 29.800001f, 84.600006f);
generalPath.curveTo(29.2f, 85.3f, 28.300001f, 85.700005f, 27.1f, 85.90001f);
generalPath.curveTo(27.7f, 86.20001f, 28.2f, 86.600006f, 28.6f, 87.00001f);
generalPath.curveTo(29.0f, 87.40001f, 29.5f, 88.200005f, 30.2f, 89.200005f);
generalPath.lineTo(31.900002f, 91.9f);
generalPath.lineTo(28.600002f, 91.9f);
generalPath.lineTo(26.600002f, 88.9f);
generalPath.curveTo(25.900002f, 87.8f, 25.400002f, 87.200005f, 25.200003f, 86.9f);
generalPath.curveTo(24.900003f, 86.6f, 24.700003f, 86.4f, 24.400003f, 86.3f);
generalPath.curveTo(24.100004f, 86.200005f, 23.600004f, 86.100006f, 23.000004f, 86.100006f);
generalPath.lineTo(22.400003f, 86.100006f);
generalPath.lineTo(22.400003f, 91.8f);
generalPath.lineTo(19.500004f, 91.8f);
generalPath.closePath();
generalPath.moveTo(22.3f, 84.0f);
generalPath.lineTo(24.3f, 84.0f);
generalPath.curveTo(25.599998f, 84.0f, 26.4f, 83.9f, 26.8f, 83.8f);
generalPath.curveTo(27.099998f, 83.700005f, 27.4f, 83.5f, 27.599998f, 83.200005f);
generalPath.curveTo(27.799997f, 82.90001f, 27.899998f, 82.600006f, 27.899998f, 82.200005f);
generalPath.curveTo(27.899998f, 81.700005f, 27.799997f, 81.4f, 27.499998f, 81.100006f);
generalPath.curveTo(27.299997f, 80.8f, 26.899998f, 80.600006f, 26.499998f, 80.600006f);
generalPath.lineTo(22.399998f, 80.600006f);
generalPath.lineTo(22.399998f, 84.0f);
generalPath.closePath();
generalPath.moveTo(36.1f, 91.9f);
generalPath.lineTo(36.1f, 86.200005f);
generalPath.lineTo(31.099998f, 78.3f);
generalPath.lineTo(34.3f, 78.3f);
generalPath.lineTo(37.5f, 83.700005f);
generalPath.lineTo(40.6f, 78.3f);
generalPath.lineTo(43.8f, 78.3f);
generalPath.lineTo(38.8f, 86.200005f);
generalPath.lineTo(38.8f, 91.9f);
generalPath.lineTo(36.1f, 91.9f);
generalPath.closePath();
generalPath.moveTo(45.199997f, 91.9f);
generalPath.lineTo(45.199997f, 78.3f);
generalPath.lineTo(49.6f, 78.3f);
generalPath.curveTo(51.3f, 78.3f, 52.399998f, 78.4f, 52.899998f, 78.5f);
generalPath.curveTo(53.699997f, 78.7f, 54.3f, 79.1f, 54.899998f, 79.8f);
generalPath.curveTo(55.399998f, 80.5f, 55.699997f, 81.4f, 55.699997f, 82.4f);
generalPath.curveTo(55.699997f, 83.200005f, 55.499996f, 83.9f, 55.199997f, 84.5f);
generalPath.curveTo(54.899998f, 85.1f, 54.499996f, 85.5f, 53.999996f, 85.8f);
generalPath.curveTo(53.499996f, 86.100006f, 53.099995f, 86.3f, 52.599995f, 86.4f);
generalPath.curveTo(51.899994f, 86.5f, 50.999996f, 86.6f, 49.799995f, 86.6f);
generalPath.lineTo(48.0f, 86.6f);
generalPath.lineTo(48.0f, 91.7f);
generalPath.lineTo(45.2f, 91.7f);
generalPath.closePath();
generalPath.moveTo(47.899998f, 80.6f);
generalPath.lineTo(47.899998f, 84.5f);
generalPath.lineTo(49.399998f, 84.5f);
generalPath.curveTo(50.499996f, 84.5f, 51.199997f, 84.4f, 51.6f, 84.3f);
generalPath.curveTo(52.0f, 84.200005f, 52.3f, 83.9f, 52.5f, 83.600006f);
generalPath.curveTo(52.7f, 83.3f, 52.8f, 82.90001f, 52.8f, 82.50001f);
generalPath.curveTo(52.8f, 82.00001f, 52.7f, 81.600006f, 52.399998f, 81.30001f);
generalPath.curveTo(52.1f, 81.00001f, 51.699997f, 80.80001f, 51.3f, 80.70001f);
generalPath.curveTo(51.0f, 80.60001f, 50.3f, 80.60001f, 49.3f, 80.60001f);
generalPath.lineTo(47.899998f, 80.60001f);
generalPath.closePath();
generalPath.moveTo(60.899998f, 91.9f);
generalPath.lineTo(60.899998f, 80.6f);
generalPath.lineTo(56.899998f, 80.6f);
generalPath.lineTo(56.899998f, 78.299995f);
generalPath.lineTo(67.7f, 78.299995f);
generalPath.lineTo(67.7f, 80.6f);
generalPath.lineTo(63.699997f, 80.6f);
generalPath.lineTo(63.699997f, 91.9f);
generalPath.lineTo(60.899998f, 91.9f);
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
	private ext_crypt() {
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
       ext_crypt base = new ext_crypt();
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
       ext_crypt base = new ext_crypt();
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
        return ext_crypt::new;
    }
}

