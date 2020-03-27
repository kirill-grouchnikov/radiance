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
public class ext_map implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
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
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.1, 91.9);
generalPath.lineTo(7.1, 71.9);
generalPath.lineTo(13.2, 71.9);
generalPath.lineTo(16.8, 85.6);
generalPath.lineTo(20.4, 71.9);
generalPath.lineTo(26.5, 71.9);
generalPath.lineTo(26.5, 91.9);
generalPath.lineTo(22.7, 91.9);
generalPath.lineTo(22.7, 76.1);
generalPath.lineTo(18.7, 91.9);
generalPath.lineTo(14.800001, 91.9);
generalPath.lineTo(10.800001, 76.1);
generalPath.lineTo(10.800001, 91.9);
generalPath.lineTo(7.1, 91.9);
generalPath.closePath();
generalPath.moveTo(48.6, 91.9);
generalPath.lineTo(44.199997, 91.9);
generalPath.lineTo(42.399998, 87.3);
generalPath.lineTo(34.399998, 87.3);
generalPath.lineTo(32.699997, 91.9);
generalPath.lineTo(28.399998, 91.9);
generalPath.lineTo(36.199997, 71.9);
generalPath.lineTo(40.499996, 71.9);
generalPath.lineTo(48.6, 91.9);
generalPath.closePath();
generalPath.moveTo(41.1, 84.0);
generalPath.lineTo(38.3, 76.6);
generalPath.lineTo(35.7, 84.0);
generalPath.lineTo(41.100002, 84.0);
generalPath.closePath();
generalPath.moveTo(50.699997, 91.9);
generalPath.lineTo(50.699997, 71.9);
generalPath.lineTo(57.199997, 71.9);
generalPath.curveTo(59.699997, 71.9, 61.299995, 72.0, 61.999996, 72.200005);
generalPath.curveTo(63.099995, 72.50001, 64.1, 73.200005, 64.899994, 74.200005);
generalPath.curveTo(65.7, 75.200005, 66.09999, 76.50001, 66.09999, 78.100006);
generalPath.curveTo(66.09999, 79.3, 65.899994, 80.40001, 65.399994, 81.200005);
generalPath.curveTo(64.99999, 82.00001, 64.399994, 82.700005, 63.699993, 83.200005);
generalPath.curveTo(62.999992, 83.700005, 62.29999, 84.00001, 61.599995, 84.200005);
generalPath.curveTo(60.599995, 84.4, 59.199993, 84.50001, 57.399994, 84.50001);
generalPath.lineTo(54.799995, 84.50001);
generalPath.lineTo(54.799995, 92.100006);
generalPath.lineTo(50.699997, 92.100006);
generalPath.closePath();
generalPath.moveTo(54.799995, 75.2);
generalPath.lineTo(54.799995, 80.899994);
generalPath.lineTo(57.0, 80.899994);
generalPath.curveTo(58.6, 80.899994, 59.7, 80.799995, 60.2, 80.59999);
generalPath.curveTo(60.7, 80.399994, 61.2, 80.09999, 61.5, 79.59999);
generalPath.curveTo(61.8, 79.19999, 62.0, 78.59999, 62.0, 77.99999);
generalPath.curveTo(62.0, 77.299995, 61.8, 76.69999, 61.4, 76.19999);
generalPath.curveTo(61.0, 75.69999, 60.4, 75.39999, 59.800003, 75.29999);
generalPath.curveTo(59.300003, 75.19999, 58.300003, 75.19999, 56.9, 75.19999);
generalPath.lineTo(54.800003, 75.19999);
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
generalPath.moveTo(53.4, 54.2);
generalPath.curveTo(53.2, 53.9, 52.9, 53.8, 52.600002, 53.8);
generalPath.lineTo(43.0, 53.8);
generalPath.curveTo(42.7, 54.5, 42.3, 55.2, 42.0, 55.899998);
generalPath.curveTo(41.2, 57.499996, 40.3, 59.3, 39.5, 60.699997);
generalPath.lineTo(39.5, 60.799995);
generalPath.curveTo(39.0, 61.699997, 38.1, 62.199997, 37.1, 62.199997);
generalPath.curveTo(36.1, 62.199997, 35.199997, 61.699997, 34.699997, 60.799995);
generalPath.curveTo(34.399998, 60.299995, 33.399998, 58.399994, 32.1, 55.899994);
generalPath.curveTo(31.699999, 55.199993, 31.399998, 54.499992, 31.099998, 53.799995);
generalPath.lineTo(25.899998, 53.799995);
generalPath.curveTo(25.599998, 53.799995, 25.199997, 53.999996, 25.099998, 54.299995);
generalPath.lineTo(20.599998, 63.699997);
generalPath.curveTo(20.499998, 63.999996, 20.499998, 64.299995, 20.599998, 64.6);
generalPath.curveTo(20.8, 64.9, 21.099998, 65.0, 21.399998, 65.0);
generalPath.lineTo(48.199997, 65.0);
generalPath.curveTo(48.499996, 65.0, 48.899998, 64.8, 48.999996, 64.5);
generalPath.lineTo(53.499996, 55.1);
generalPath.curveTo(53.499996, 54.8, 53.499996, 54.399998, 53.399998, 54.199997);
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
generalPath.moveTo(37.0, 28.1);
generalPath.curveTo(31.5, 28.1, 27.1, 32.5, 27.1, 38.0);
generalPath.curveTo(27.1, 41.3, 30.7, 49.1, 33.7, 55.1);
generalPath.curveTo(35.100002, 57.899998, 36.2, 60.0, 36.2, 60.0);
generalPath.curveTo(36.4, 60.3, 36.7, 60.5, 37.0, 60.5);
generalPath.curveTo(37.3, 60.5, 37.6, 60.3, 37.8, 60.0);
generalPath.curveTo(37.8, 60.0, 38.899998, 57.9, 40.3, 55.1);
generalPath.curveTo(43.3, 49.1, 46.899998, 41.399998, 46.899998, 38.0);
generalPath.curveTo(46.899998, 32.5, 42.499996, 28.1, 37.0, 28.1);
generalPath.closePath();
generalPath.moveTo(37.0, 44.0);
generalPath.curveTo(34.5, 44.0, 32.4, 42.1, 32.2, 39.6);
generalPath.lineTo(32.2, 39.1);
generalPath.curveTo(32.2, 36.399998, 34.4, 34.3, 37.0, 34.3);
generalPath.curveTo(39.5, 34.3, 41.6, 36.2, 41.8, 38.6);
generalPath.lineTo(41.8, 39.1);
generalPath.curveTo(41.899998, 41.8, 39.7, 44.0, 37.0, 44.0);
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
    public static ResizableIcon of(int width, int height) {
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_map base = new ext_map();
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
        return ext_map::new;
    }
}

