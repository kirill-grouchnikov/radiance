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
public class ext_vb implements ResizableIcon {
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(72.0, 98.8);
generalPath.lineTo(0.0, 98.8);
generalPath.lineTo(0.0, 0.8);
generalPath.lineTo(45.0, 0.8);
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(72.0, 98.8);
generalPath.lineTo(0.0, 98.8);
generalPath.lineTo(0.0, 0.8);
generalPath.lineTo(45.0, 0.8);
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(72.0, 98.8);
generalPath.lineTo(0.0, 98.8);
generalPath.lineTo(0.0, 0.8);
generalPath.lineTo(45.0, 0.8);
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
generalPath.moveTo(24.5, 89.8);
generalPath.lineTo(17.3, 69.8);
generalPath.lineTo(21.699999, 69.8);
generalPath.lineTo(26.8, 84.600006);
generalPath.lineTo(31.8, 69.8);
generalPath.lineTo(36.1, 69.8);
generalPath.lineTo(28.8, 89.8);
generalPath.lineTo(24.5, 89.8);
generalPath.closePath();
generalPath.moveTo(38.2, 69.8);
generalPath.lineTo(46.300003, 69.8);
generalPath.curveTo(47.9, 69.8, 49.100002, 69.9, 49.9, 70.0);
generalPath.curveTo(50.7, 70.1, 51.4, 70.4, 52.0, 70.8);
generalPath.curveTo(52.6, 71.200005, 53.1, 71.8, 53.6, 72.5);
generalPath.curveTo(54.1, 73.2, 54.199997, 74.0, 54.199997, 74.8);
generalPath.curveTo(54.199997, 75.700005, 53.899998, 76.600006, 53.399998, 77.4);
generalPath.curveTo(52.899998, 78.2, 52.199997, 78.8, 51.3, 79.200005);
generalPath.curveTo(52.5, 79.600006, 53.5, 80.200005, 54.1, 81.00001);
generalPath.curveTo(54.8, 81.90001, 55.1, 82.90001, 55.1, 84.00001);
generalPath.curveTo(55.1, 84.90001, 54.899998, 85.80001, 54.5, 86.700005);
generalPath.curveTo(54.100002, 87.6, 53.5, 88.200005, 52.7, 88.8);
generalPath.curveTo(52.0, 89.3, 51.0, 89.600006, 50.0, 89.8);
generalPath.curveTo(49.3, 89.9, 47.7, 89.9, 45.1, 89.9);
generalPath.lineTo(38.199997, 89.9);
generalPath.lineTo(38.199997, 69.8);
generalPath.closePath();
generalPath.moveTo(42.3, 73.100006);
generalPath.lineTo(42.3, 77.700005);
generalPath.lineTo(45.0, 77.700005);
generalPath.curveTo(46.6, 77.700005, 47.6, 77.700005, 48.0, 77.600006);
generalPath.curveTo(48.7, 77.50001, 49.2, 77.3, 49.7, 76.90001);
generalPath.curveTo(50.100002, 76.50001, 50.3, 76.00001, 50.3, 75.30001);
generalPath.curveTo(50.3, 74.70001, 50.1, 74.20001, 49.8, 73.80001);
generalPath.curveTo(49.5, 73.40001, 48.899998, 73.20001, 48.3, 73.10001);
generalPath.curveTo(47.899998, 73.10001, 46.7, 73.000015, 44.8, 73.000015);
generalPath.lineTo(42.3, 73.000015);
generalPath.closePath();
generalPath.moveTo(42.3, 81.100006);
generalPath.lineTo(42.3, 86.50001);
generalPath.lineTo(46.1, 86.50001);
generalPath.curveTo(47.6, 86.50001, 48.5, 86.50001, 48.899998, 86.40001);
generalPath.curveTo(49.499996, 86.30001, 49.999996, 86.00001, 50.399998, 85.600006);
generalPath.curveTo(50.8, 85.200005, 50.999996, 84.600006, 50.999996, 83.90001);
generalPath.curveTo(50.999996, 83.30001, 50.899998, 82.80001, 50.599995, 82.40001);
generalPath.curveTo(50.29999, 82.00001, 49.899994, 81.70001, 49.299995, 81.50001);
generalPath.curveTo(48.699997, 81.30001, 47.499996, 81.200005, 45.699997, 81.200005);
generalPath.lineTo(42.299995, 81.200005);
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
generalPath.moveTo(28.2, 44.6);
generalPath.curveTo(26.800001, 45.6, 25.5, 46.699997, 24.2, 47.699997);
generalPath.curveTo(21.5, 49.699997, 18.900002, 51.799995, 16.2, 53.799995);
generalPath.curveTo(15.800001, 54.099995, 15.6, 54.099995, 15.200001, 53.899994);
generalPath.curveTo(14.700001, 53.599995, 14.1, 53.299995, 13.500001, 52.999992);
generalPath.curveTo(13.200001, 52.79999, 13.100001, 52.59999, 13.100001, 52.29999);
generalPath.lineTo(13.100001, 31.1);
generalPath.curveTo(13.100001, 30.9, 13.300001, 30.5, 13.500001, 30.4);
generalPath.curveTo(14.100001, 30.0, 14.800001, 29.699999, 15.400001, 29.4);
generalPath.curveTo(15.700001, 29.199999, 16.0, 29.4, 16.300001, 29.6);
generalPath.curveTo(18.500002, 31.300001, 20.7, 33.0, 22.900002, 34.6);
generalPath.curveTo(24.7, 36.0, 26.500002, 37.399998, 28.300001, 38.699997);
generalPath.curveTo(28.400002, 38.6, 28.6, 38.499996, 28.7, 38.399998);
generalPath.curveTo(35.3, 31.999998, 41.9, 25.599998, 48.4, 19.199997);
generalPath.curveTo(48.7, 18.899998, 49.0, 18.799997, 49.4, 18.999996);
generalPath.curveTo(52.2, 20.099997, 55.0, 21.199997, 57.800003, 22.399996);
generalPath.curveTo(58.000004, 22.499996, 58.200005, 22.799995, 58.300003, 22.999996);
generalPath.curveTo(58.4, 23.099997, 58.300003, 23.299995, 58.300003, 23.499996);
generalPath.lineTo(58.300003, 60.0);
generalPath.curveTo(58.300003, 60.9, 58.300003, 60.9, 57.4, 61.2);
generalPath.curveTo(54.7, 62.3, 52.100002, 63.3, 49.5, 64.4);
generalPath.curveTo(49.0, 64.6, 48.7, 64.5, 48.4, 64.200005);
generalPath.curveTo(41.9, 57.800003, 35.4, 51.500004, 28.800001, 45.200005);
generalPath.lineTo(28.2, 44.600006);
generalPath.closePath();
generalPath.moveTo(47.2, 50.399998);
generalPath.lineTo(47.2, 33.0);
generalPath.curveTo(43.3, 35.9, 39.5, 38.8, 35.6, 41.7);
generalPath.curveTo(39.5, 44.600002, 43.3, 47.5, 47.199997, 50.4);
generalPath.closePath();
generalPath.moveTo(22.900002, 41.699997);
generalPath.curveTo(21.000002, 39.999996, 19.100002, 38.299995, 17.100002, 36.499996);
generalPath.lineTo(17.100002, 46.899994);
generalPath.curveTo(19.000002, 45.199993, 20.900002, 43.399994, 22.900002, 41.699993);
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(45.0, 27.5);
generalPath.lineTo(45.0, 0.8);
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(45.0, 27.5);
generalPath.lineTo(45.0, 0.8);
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(45.0, 27.5);
generalPath.lineTo(45.0, 0.8);
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
	private ext_vb() {
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
       ext_vb base = new ext_vb();
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
       ext_vb base = new ext_vb();
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
        return ext_vb::new;
    }
}

