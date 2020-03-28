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
public class ext_ocx implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(54.0f, 37.3f);
generalPath.curveTo(55.9f, 32.8f, 56.0f, 29.0f, 53.8f, 26.8f);
generalPath.curveTo(51.3f, 24.3f, 45.3f, 25.0f, 38.9f, 28.099998f);
generalPath.lineTo(38.100002f, 28.099998f);
generalPath.curveTo(33.600002f, 28.099998f, 29.200003f, 29.699999f, 26.000002f, 32.6f);
generalPath.curveTo(23.200003f, 35.1f, 21.2f, 38.399998f, 20.400002f, 42.0f);
generalPath.curveTo(21.000002f, 41.2f, 24.500002f, 37.1f, 28.500002f, 34.9f);
generalPath.curveTo(28.600002f, 34.9f, 29.600002f, 34.300003f, 29.600002f, 34.300003f);
generalPath.curveTo(29.500002f, 34.300003f, 27.600002f, 36.200005f, 27.200003f, 36.600002f);
generalPath.curveTo(18.400002f, 45.600002f, 13.300003f, 59.200005f, 17.300003f, 63.200005f);
generalPath.curveTo(19.900003f, 65.8f, 24.700003f, 65.200005f, 30.200003f, 62.200005f);
generalPath.curveTo(32.600002f, 63.300003f, 35.200005f, 63.800003f, 38.100002f, 63.800003f);
generalPath.curveTo(41.9f, 63.800003f, 45.4f, 62.800003f, 48.4f, 60.800003f);
generalPath.curveTo(51.5f, 58.800003f, 53.800003f, 55.700005f, 55.2f, 52.100002f);
generalPath.lineTo(45.4f, 52.100002f);
generalPath.curveTo(44.100002f, 54.500004f, 41.300003f, 56.100002f, 38.300003f, 56.100002f);
generalPath.curveTo(34.000004f, 56.100002f, 30.500004f, 52.600002f, 30.400003f, 48.600002f);
generalPath.lineTo(30.400003f, 48.2f);
generalPath.lineTo(55.9f, 48.2f);
generalPath.lineTo(55.9f, 47.8f);
generalPath.curveTo(55.9f, 47.2f, 56.0f, 46.399998f, 56.0f, 45.899998f);
generalPath.curveTo(56.0f, 42.8f, 55.2f, 39.899998f, 54.0f, 37.299995f);
generalPath.closePath();
generalPath.moveTo(20.099998f, 62.3f);
generalPath.curveTo(18.099998f, 60.3f, 18.699999f, 56.399998f, 21.099998f, 51.8f);
generalPath.curveTo(22.199999f, 54.899998f, 24.099998f, 57.7f, 26.499998f, 59.7f);
generalPath.curveTo(27.299997f, 60.3f, 28.099998f, 61.0f, 28.999998f, 61.5f);
generalPath.curveTo(24.999998f, 63.6f, 21.8f, 63.9f, 20.099998f, 62.3f);
generalPath.closePath();
generalPath.moveTo(45.8f, 43.3f);
generalPath.lineTo(30.5f, 43.3f);
generalPath.lineTo(30.5f, 43.2f);
generalPath.curveTo(30.7f, 39.3f, 34.4f, 35.9f, 38.6f, 35.9f);
generalPath.curveTo(42.6f, 35.9f, 45.899998f, 39.0f, 46.1f, 43.2f);
generalPath.lineTo(46.1f, 43.3f);
generalPath.lineTo(45.8f, 43.3f);
generalPath.closePath();
generalPath.moveTo(53.399998f, 36.3f);
generalPath.curveTo(52.6f, 35.0f, 51.6f, 33.8f, 50.499996f, 32.8f);
generalPath.curveTo(48.799995f, 31.199999f, 46.699997f, 29.9f, 44.499996f, 29.0f);
generalPath.curveTo(48.499996f, 27.1f, 51.899998f, 26.9f, 53.6f, 28.6f);
generalPath.curveTo(55.0f, 30.300001f, 54.899998f, 33.1f, 53.399998f, 36.3f);
generalPath.curveTo(53.399998f, 36.399998f, 53.399998f, 36.399998f, 53.399998f, 36.3f);
generalPath.curveTo(53.399998f, 36.399998f, 53.399998f, 36.399998f, 53.399998f, 36.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 64.7020034790039), new Point2D.Double(36.0, 25.29800033569336), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(6.9f, 82.0f);
generalPath.curveTo(6.9f, 80.0f, 7.2000003f, 78.2f, 7.8f, 76.9f);
generalPath.curveTo(8.3f, 75.9f, 8.900001f, 75.0f, 9.7f, 74.200005f);
generalPath.curveTo(10.5f, 73.4f, 11.4f, 72.8f, 12.299999f, 72.4f);
generalPath.curveTo(13.499999f, 71.9f, 14.999999f, 71.6f, 16.599998f, 71.6f);
generalPath.curveTo(19.599998f, 71.6f, 21.899998f, 72.5f, 23.699999f, 74.299995f);
generalPath.curveTo(25.499998f, 76.1f, 26.4f, 78.7f, 26.4f, 81.899994f);
generalPath.curveTo(26.4f, 85.09999f, 25.5f, 87.7f, 23.8f, 89.49999f);
generalPath.curveTo(22.0f, 91.299995f, 19.699999f, 92.19999f, 16.699999f, 92.19999f);
generalPath.curveTo(13.699999f, 92.19999f, 11.299999f, 91.29999f, 9.599998f, 89.49999f);
generalPath.curveTo(7.7999983f, 87.69999f, 6.8999987f, 85.19999f, 6.8999987f, 81.99999f);
generalPath.closePath();
generalPath.moveTo(11.0f, 81.8f);
generalPath.curveTo(11.0f, 84.100006f, 11.5f, 85.8f, 12.6f, 87.0f);
generalPath.curveTo(13.6f, 88.2f, 15.0f, 88.8f, 16.6f, 88.8f);
generalPath.curveTo(18.2f, 88.8f, 19.5f, 88.200005f, 20.6f, 87.100006f);
generalPath.curveTo(21.6f, 85.90001f, 22.2f, 84.200005f, 22.2f, 81.90001f);
generalPath.curveTo(22.2f, 79.600006f, 21.7f, 77.90001f, 20.7f, 76.80001f);
generalPath.curveTo(19.7f, 75.70001f, 18.400002f, 75.10001f, 16.7f, 75.10001f);
generalPath.curveTo(15.0f, 75.10001f, 13.700001f, 75.70001f, 12.700001f, 76.80001f);
generalPath.curveTo(11.6f, 77.80001f, 11.000001f, 79.50001f, 11.000001f, 81.80001f);
generalPath.closePath();
generalPath.moveTo(42.3f, 84.5f);
generalPath.lineTo(46.2f, 85.7f);
generalPath.curveTo(45.600002f, 87.899994f, 44.600002f, 89.5f, 43.2f, 90.6f);
generalPath.curveTo(41.8f, 91.7f, 40.0f, 92.2f, 37.9f, 92.2f);
generalPath.curveTo(35.2f, 92.2f, 33.100002f, 91.299995f, 31.300001f, 89.5f);
generalPath.curveTo(29.6f, 87.7f, 28.7f, 85.2f, 28.7f, 82.0f);
generalPath.curveTo(28.7f, 78.7f, 29.6f, 76.1f, 31.300001f, 74.2f);
generalPath.curveTo(33.0f, 72.299995f, 35.300003f, 71.399994f, 38.100002f, 71.399994f);
generalPath.curveTo(40.600002f, 71.399994f, 42.500004f, 72.09999f, 44.100002f, 73.59999f);
generalPath.curveTo(45.000004f, 74.49999f, 45.7f, 75.69999f, 46.2f, 77.29999f);
generalPath.lineTo(42.2f, 78.29999f);
generalPath.curveTo(42.0f, 77.29999f, 41.5f, 76.39999f, 40.7f, 75.79999f);
generalPath.curveTo(39.9f, 75.19999f, 39.0f, 75.0f, 37.9f, 75.0f);
generalPath.curveTo(36.4f, 75.0f, 35.2f, 75.5f, 34.300003f, 76.6f);
generalPath.curveTo(33.4f, 77.7f, 32.9f, 79.4f, 32.9f, 81.799995f);
generalPath.curveTo(32.9f, 84.299995f, 33.4f, 86.1f, 34.300003f, 87.2f);
generalPath.curveTo(35.200005f, 88.299995f, 36.4f, 88.799995f, 37.9f, 88.799995f);
generalPath.curveTo(39.0f, 88.799995f, 39.9f, 88.49999f, 40.7f, 87.799995f);
generalPath.curveTo(41.4f, 87.1f, 42.0f, 85.99999f, 42.3f, 84.49999f);
generalPath.closePath();
generalPath.moveTo(47.7f, 91.9f);
generalPath.lineTo(54.5f, 81.4f);
generalPath.lineTo(48.3f, 71.8f);
generalPath.lineTo(53.0f, 71.8f);
generalPath.lineTo(57.0f, 78.200005f);
generalPath.lineTo(60.9f, 71.8f);
generalPath.lineTo(65.6f, 71.8f);
generalPath.lineTo(59.399998f, 81.5f);
generalPath.lineTo(66.2f, 91.8f);
generalPath.lineTo(61.299995f, 91.8f);
generalPath.lineTo(57.0f, 85.0f);
generalPath.lineTo(52.5f, 91.9f);
generalPath.lineTo(47.7f, 91.9f);
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
	private ext_ocx() {
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
       ext_ocx base = new ext_ocx();
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
       ext_ocx base = new ext_ocx();
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
        return ext_ocx::new;
    }
}

