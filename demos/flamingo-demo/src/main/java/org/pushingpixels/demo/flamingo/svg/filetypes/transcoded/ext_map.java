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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_map implements NeonIcon {
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
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.1f, 91.9f);
generalPath.lineTo(7.1f, 71.9f);
generalPath.lineTo(13.2f, 71.9f);
generalPath.lineTo(16.8f, 85.6f);
generalPath.lineTo(20.4f, 71.9f);
generalPath.lineTo(26.5f, 71.9f);
generalPath.lineTo(26.5f, 91.9f);
generalPath.lineTo(22.7f, 91.9f);
generalPath.lineTo(22.7f, 76.1f);
generalPath.lineTo(18.7f, 91.9f);
generalPath.lineTo(14.800001f, 91.9f);
generalPath.lineTo(10.800001f, 76.1f);
generalPath.lineTo(10.800001f, 91.9f);
generalPath.lineTo(7.1f, 91.9f);
generalPath.closePath();
generalPath.moveTo(48.6f, 91.9f);
generalPath.lineTo(44.199997f, 91.9f);
generalPath.lineTo(42.399998f, 87.3f);
generalPath.lineTo(34.399998f, 87.3f);
generalPath.lineTo(32.699997f, 91.9f);
generalPath.lineTo(28.399998f, 91.9f);
generalPath.lineTo(36.199997f, 71.9f);
generalPath.lineTo(40.499996f, 71.9f);
generalPath.lineTo(48.6f, 91.9f);
generalPath.closePath();
generalPath.moveTo(41.1f, 84.0f);
generalPath.lineTo(38.3f, 76.6f);
generalPath.lineTo(35.7f, 84.0f);
generalPath.lineTo(41.100002f, 84.0f);
generalPath.closePath();
generalPath.moveTo(50.699997f, 91.9f);
generalPath.lineTo(50.699997f, 71.9f);
generalPath.lineTo(57.199997f, 71.9f);
generalPath.curveTo(59.699997f, 71.9f, 61.299995f, 72.0f, 61.999996f, 72.200005f);
generalPath.curveTo(63.099995f, 72.50001f, 64.1f, 73.200005f, 64.899994f, 74.200005f);
generalPath.curveTo(65.7f, 75.200005f, 66.09999f, 76.50001f, 66.09999f, 78.100006f);
generalPath.curveTo(66.09999f, 79.3f, 65.899994f, 80.40001f, 65.399994f, 81.200005f);
generalPath.curveTo(64.99999f, 82.00001f, 64.399994f, 82.700005f, 63.699993f, 83.200005f);
generalPath.curveTo(62.999992f, 83.700005f, 62.29999f, 84.00001f, 61.599995f, 84.200005f);
generalPath.curveTo(60.599995f, 84.4f, 59.199993f, 84.50001f, 57.399994f, 84.50001f);
generalPath.lineTo(54.799995f, 84.50001f);
generalPath.lineTo(54.799995f, 92.100006f);
generalPath.lineTo(50.699997f, 92.100006f);
generalPath.closePath();
generalPath.moveTo(54.799995f, 75.2f);
generalPath.lineTo(54.799995f, 80.899994f);
generalPath.lineTo(57.0f, 80.899994f);
generalPath.curveTo(58.6f, 80.899994f, 59.7f, 80.799995f, 60.2f, 80.59999f);
generalPath.curveTo(60.7f, 80.399994f, 61.2f, 80.09999f, 61.5f, 79.59999f);
generalPath.curveTo(61.8f, 79.19999f, 62.0f, 78.59999f, 62.0f, 77.99999f);
generalPath.curveTo(62.0f, 77.299995f, 61.8f, 76.69999f, 61.4f, 76.19999f);
generalPath.curveTo(61.0f, 75.69999f, 60.4f, 75.39999f, 59.800003f, 75.29999f);
generalPath.curveTo(59.300003f, 75.19999f, 58.300003f, 75.19999f, 56.9f, 75.19999f);
generalPath.lineTo(54.800003f, 75.19999f);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.4f, 54.2f);
generalPath.curveTo(53.2f, 53.9f, 52.9f, 53.8f, 52.600002f, 53.8f);
generalPath.lineTo(43.0f, 53.8f);
generalPath.curveTo(42.7f, 54.5f, 42.3f, 55.2f, 42.0f, 55.899998f);
generalPath.curveTo(41.2f, 57.499996f, 40.3f, 59.3f, 39.5f, 60.699997f);
generalPath.lineTo(39.5f, 60.799995f);
generalPath.curveTo(39.0f, 61.699997f, 38.1f, 62.199997f, 37.1f, 62.199997f);
generalPath.curveTo(36.1f, 62.199997f, 35.199997f, 61.699997f, 34.699997f, 60.799995f);
generalPath.curveTo(34.399998f, 60.299995f, 33.399998f, 58.399994f, 32.1f, 55.899994f);
generalPath.curveTo(31.699999f, 55.199993f, 31.399998f, 54.499992f, 31.099998f, 53.799995f);
generalPath.lineTo(25.899998f, 53.799995f);
generalPath.curveTo(25.599998f, 53.799995f, 25.199997f, 53.999996f, 25.099998f, 54.299995f);
generalPath.lineTo(20.599998f, 63.699997f);
generalPath.curveTo(20.499998f, 63.999996f, 20.499998f, 64.299995f, 20.599998f, 64.6f);
generalPath.curveTo(20.8f, 64.9f, 21.099998f, 65.0f, 21.399998f, 65.0f);
generalPath.lineTo(48.199997f, 65.0f);
generalPath.curveTo(48.499996f, 65.0f, 48.899998f, 64.8f, 48.999996f, 64.5f);
generalPath.lineTo(53.499996f, 55.1f);
generalPath.curveTo(53.499996f, 54.8f, 53.499996f, 54.399998f, 53.399998f, 54.199997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 64.93199920654297), new Point2D.Double(37.0, 53.76599884033203), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(37.0f, 28.1f);
generalPath.curveTo(31.5f, 28.1f, 27.1f, 32.5f, 27.1f, 38.0f);
generalPath.curveTo(27.1f, 41.3f, 30.7f, 49.1f, 33.7f, 55.1f);
generalPath.curveTo(35.100002f, 57.899998f, 36.2f, 60.0f, 36.2f, 60.0f);
generalPath.curveTo(36.4f, 60.3f, 36.7f, 60.5f, 37.0f, 60.5f);
generalPath.curveTo(37.3f, 60.5f, 37.6f, 60.3f, 37.8f, 60.0f);
generalPath.curveTo(37.8f, 60.0f, 38.899998f, 57.9f, 40.3f, 55.1f);
generalPath.curveTo(43.3f, 49.1f, 46.899998f, 41.399998f, 46.899998f, 38.0f);
generalPath.curveTo(46.899998f, 32.5f, 42.499996f, 28.1f, 37.0f, 28.1f);
generalPath.closePath();
generalPath.moveTo(37.0f, 44.0f);
generalPath.curveTo(34.5f, 44.0f, 32.4f, 42.1f, 32.2f, 39.6f);
generalPath.lineTo(32.2f, 39.1f);
generalPath.curveTo(32.2f, 36.399998f, 34.4f, 34.3f, 37.0f, 34.3f);
generalPath.curveTo(39.5f, 34.3f, 41.6f, 36.2f, 41.8f, 38.6f);
generalPath.lineTo(41.8f, 39.1f);
generalPath.curveTo(41.899998f, 41.8f, 39.7f, 44.0f, 37.0f, 44.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 60.4010009765625), new Point2D.Double(37.0, 28.07900047302246), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
	private ext_map() {
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
       ext_map base = new ext_map();
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
       ext_map base = new ext_map();
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
        return ext_map::new;
    }
}

