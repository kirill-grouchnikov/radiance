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
public class ext_app implements NeonIcon {
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
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
generalPath.moveTo(28.0f, 91.1f);
generalPath.lineTo(23.6f, 91.1f);
generalPath.lineTo(21.9f, 86.6f);
generalPath.lineTo(13.9f, 86.6f);
generalPath.lineTo(12.299999f, 91.1f);
generalPath.lineTo(8.0f, 91.1f);
generalPath.lineTo(15.8f, 71.3f);
generalPath.lineTo(20.0f, 71.3f);
generalPath.lineTo(28.0f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(20.6f, 83.2f);
generalPath.lineTo(17.800001f, 75.799995f);
generalPath.lineTo(15.100001f, 83.2f);
generalPath.lineTo(20.600002f, 83.2f);
generalPath.closePath();
generalPath.moveTo(30.1f, 91.1f);
generalPath.lineTo(30.1f, 71.2f);
generalPath.lineTo(36.6f, 71.2f);
generalPath.curveTo(39.1f, 71.2f, 40.699997f, 71.299995f, 41.399998f, 71.5f);
generalPath.curveTo(42.499996f, 71.8f, 43.499996f, 72.4f, 44.3f, 73.4f);
generalPath.curveTo(45.1f, 74.4f, 45.5f, 75.700005f, 45.5f, 77.3f);
generalPath.curveTo(45.5f, 78.5f, 45.3f, 79.5f, 44.8f, 80.4f);
generalPath.curveTo(44.399998f, 81.200005f, 43.8f, 81.9f, 43.1f, 82.4f);
generalPath.curveTo(42.399998f, 82.9f, 41.699997f, 83.200005f, 41.0f, 83.3f);
generalPath.curveTo(40.0f, 83.5f, 38.6f, 83.600006f, 36.8f, 83.600006f);
generalPath.lineTo(34.2f, 83.600006f);
generalPath.lineTo(34.2f, 91.100006f);
generalPath.lineTo(30.1f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(34.2f, 74.6f);
generalPath.lineTo(34.2f, 80.2f);
generalPath.lineTo(36.4f, 80.2f);
generalPath.curveTo(38.0f, 80.2f, 39.100002f, 80.1f, 39.600002f, 79.899994f);
generalPath.curveTo(40.100002f, 79.7f, 40.600002f, 79.399994f, 40.9f, 78.899994f);
generalPath.curveTo(41.2f, 78.49999f, 41.4f, 77.899994f, 41.4f, 77.399994f);
generalPath.curveTo(41.4f, 76.7f, 41.2f, 76.09999f, 40.800003f, 75.59999f);
generalPath.curveTo(40.4f, 75.09999f, 39.800003f, 74.79999f, 39.200005f, 74.69999f);
generalPath.curveTo(38.700005f, 74.59999f, 37.800003f, 74.59999f, 36.300003f, 74.59999f);
generalPath.lineTo(34.200005f, 74.59999f);
generalPath.closePath();
generalPath.moveTo(48.7f, 91.1f);
generalPath.lineTo(48.7f, 71.2f);
generalPath.lineTo(55.2f, 71.2f);
generalPath.curveTo(57.7f, 71.2f, 59.3f, 71.299995f, 60.0f, 71.5f);
generalPath.curveTo(61.1f, 71.8f, 62.1f, 72.4f, 62.9f, 73.4f);
generalPath.curveTo(63.7f, 74.4f, 64.1f, 75.700005f, 64.1f, 77.3f);
generalPath.curveTo(64.1f, 78.5f, 63.899998f, 79.5f, 63.399998f, 80.4f);
generalPath.curveTo(62.999996f, 81.200005f, 62.399998f, 81.9f, 61.699997f, 82.4f);
generalPath.curveTo(60.999996f, 82.9f, 60.299995f, 83.200005f, 59.6f, 83.3f);
generalPath.curveTo(58.6f, 83.5f, 57.199997f, 83.600006f, 55.399998f, 83.600006f);
generalPath.lineTo(52.8f, 83.600006f);
generalPath.lineTo(52.8f, 91.100006f);
generalPath.lineTo(48.7f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(52.8f, 74.6f);
generalPath.lineTo(52.8f, 80.2f);
generalPath.lineTo(55.0f, 80.2f);
generalPath.curveTo(56.6f, 80.2f, 57.7f, 80.1f, 58.2f, 79.899994f);
generalPath.curveTo(58.7f, 79.7f, 59.2f, 79.399994f, 59.5f, 78.899994f);
generalPath.curveTo(59.8f, 78.49999f, 60.0f, 77.899994f, 60.0f, 77.399994f);
generalPath.curveTo(60.0f, 76.7f, 59.8f, 76.09999f, 59.4f, 75.59999f);
generalPath.curveTo(59.0f, 75.09999f, 58.4f, 74.79999f, 57.800003f, 74.69999f);
generalPath.curveTo(57.300003f, 74.59999f, 56.4f, 74.59999f, 54.9f, 74.59999f);
generalPath.lineTo(52.800003f, 74.59999f);
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
generalPath.moveTo(55.1f, 36.3f);
generalPath.curveTo(55.0f, 35.3f, 54.8f, 34.399998f, 54.5f, 33.399998f);
generalPath.lineTo(59.2f, 30.699997f);
generalPath.lineTo(54.2f, 22.099997f);
generalPath.lineTo(49.5f, 24.799997f);
generalPath.curveTo(48.2f, 23.399998f, 46.6f, 22.199997f, 44.9f, 21.199997f);
generalPath.lineTo(46.300003f, 16.099997f);
generalPath.lineTo(36.600002f, 13.399997f);
generalPath.lineTo(35.2f, 18.499996f);
generalPath.curveTo(34.2f, 18.499996f, 33.3f, 18.499996f, 32.3f, 18.599997f);
generalPath.curveTo(31.3f, 18.699997f, 30.4f, 18.899996f, 29.4f, 19.199997f);
generalPath.lineTo(26.699999f, 14.499997f);
generalPath.lineTo(18.0f, 19.399998f);
generalPath.lineTo(20.7f, 24.099998f);
generalPath.curveTo(19.300001f, 25.499998f, 18.1f, 26.999998f, 17.1f, 28.699999f);
generalPath.lineTo(11.900001f, 27.3f);
generalPath.lineTo(9.4f, 37.0f);
generalPath.lineTo(14.599999f, 38.4f);
generalPath.curveTo(14.599999f, 39.4f, 14.599999f, 40.300003f, 14.799999f, 41.300003f);
generalPath.curveTo(14.9f, 42.300003f, 15.099999f, 43.200005f, 15.4f, 44.200005f);
generalPath.lineTo(10.7f, 46.900005f);
generalPath.lineTo(15.7f, 55.500008f);
generalPath.lineTo(20.4f, 52.800007f);
generalPath.curveTo(21.699999f, 54.20001f, 23.3f, 55.400005f, 25.0f, 56.400005f);
generalPath.lineTo(23.6f, 61.500004f);
generalPath.lineTo(33.3f, 64.200005f);
generalPath.lineTo(34.7f, 59.100006f);
generalPath.curveTo(35.7f, 59.100006f, 36.600002f, 59.100006f, 37.600002f, 59.000008f);
generalPath.curveTo(38.600002f, 58.90001f, 39.500004f, 58.70001f, 40.500004f, 58.40001f);
generalPath.lineTo(43.200005f, 63.10001f);
generalPath.lineTo(51.900005f, 58.20001f);
generalPath.lineTo(49.200005f, 53.500008f);
generalPath.curveTo(50.600006f, 52.20001f, 51.800003f, 50.600006f, 52.800003f, 48.90001f);
generalPath.lineTo(58.000004f, 50.30001f);
generalPath.lineTo(60.700005f, 40.700012f);
generalPath.lineTo(55.500004f, 39.30001f);
generalPath.curveTo(55.300003f, 38.30001f, 55.300003f, 37.30001f, 55.100002f, 36.30001f);
generalPath.closePath();
generalPath.moveTo(36.1f, 47.0f);
generalPath.curveTo(31.599998f, 47.6f, 27.399998f, 44.3f, 26.8f, 39.9f);
generalPath.curveTo(26.199999f, 35.4f, 29.5f, 31.300001f, 34.0f, 30.7f);
generalPath.curveTo(38.5f, 30.1f, 42.7f, 33.4f, 43.3f, 37.8f);
generalPath.curveTo(43.8f, 42.3f, 40.6f, 46.4f, 36.1f, 47.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.96200180053711, 37.84700012207031), new Point2D.Double(34.96200180053711, 88.47000122070312), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
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
	private ext_app() {
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
       ext_app base = new ext_app();
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
       ext_app base = new ext_app();
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
        return ext_app::new;
    }
}

