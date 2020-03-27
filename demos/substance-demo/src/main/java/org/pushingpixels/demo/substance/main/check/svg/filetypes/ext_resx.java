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
public class ext_resx implements ResizableIcon {
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
generalPath.moveTo(7.5, 89.8);
generalPath.lineTo(7.5, 74.1);
generalPath.lineTo(14.3, 74.1);
generalPath.curveTo(16.0, 74.1, 17.2, 74.2, 18.0, 74.5);
generalPath.curveTo(18.8, 74.8, 19.4, 75.3, 19.9, 76.0);
generalPath.curveTo(20.4, 76.7, 20.6, 77.6, 20.6, 78.5);
generalPath.curveTo(20.6, 79.7, 20.2, 80.7, 19.5, 81.4);
generalPath.curveTo(18.8, 82.200005, 17.7, 82.700005, 16.4, 82.9);
generalPath.curveTo(17.1, 83.3, 17.699999, 83.700005, 18.1, 84.200005);
generalPath.curveTo(18.500002, 84.700005, 19.2, 85.50001, 19.9, 86.8);
generalPath.lineTo(21.8, 89.9);
generalPath.lineTo(18.0, 89.9);
generalPath.lineTo(15.7, 86.5);
generalPath.curveTo(14.9, 85.3, 14.3, 84.5, 14.0, 84.2);
generalPath.curveTo(13.7, 83.899994, 13.4, 83.7, 13.0, 83.5);
generalPath.curveTo(12.7, 83.4, 12.1, 83.3, 11.4, 83.3);
generalPath.lineTo(10.7, 83.3);
generalPath.lineTo(10.7, 89.9);
generalPath.lineTo(7.5, 89.9);
generalPath.closePath();
generalPath.moveTo(10.8, 80.700005);
generalPath.lineTo(13.200001, 80.700005);
generalPath.curveTo(14.700001, 80.700005, 15.700001, 80.600006, 16.1, 80.50001);
generalPath.curveTo(16.5, 80.40001, 16.800001, 80.100006, 17.0, 79.80001);
generalPath.curveTo(17.199999, 79.500015, 17.3, 79.10001, 17.3, 78.60001);
generalPath.curveTo(17.3, 78.10001, 17.199999, 77.60001, 16.9, 77.30001);
generalPath.curveTo(16.6, 77.00001, 16.199999, 76.80001, 15.7, 76.70001);
generalPath.curveTo(15.4, 76.70001, 14.7, 76.60001, 13.4, 76.60001);
generalPath.lineTo(10.9, 76.60001);
generalPath.lineTo(10.9, 80.70001);
generalPath.closePath();
generalPath.moveTo(23.6, 89.8);
generalPath.lineTo(23.6, 74.1);
generalPath.lineTo(35.4, 74.1);
generalPath.lineTo(35.4, 76.799995);
generalPath.lineTo(26.800001, 76.799995);
generalPath.lineTo(26.800001, 80.299995);
generalPath.lineTo(34.800003, 80.299995);
generalPath.lineTo(34.800003, 83.0);
generalPath.lineTo(26.800003, 83.0);
generalPath.lineTo(26.800003, 87.3);
generalPath.lineTo(35.700005, 87.3);
generalPath.lineTo(35.700005, 90.0);
generalPath.lineTo(23.6, 90.0);
generalPath.closePath();
generalPath.moveTo(37.6, 84.700005);
generalPath.lineTo(40.699997, 84.4);
generalPath.curveTo(40.899998, 85.4, 41.299995, 86.200005, 41.799995, 86.700005);
generalPath.curveTo(42.299995, 87.200005, 43.199997, 87.4, 44.099995, 87.4);
generalPath.curveTo(45.099995, 87.4, 45.899994, 87.200005, 46.399994, 86.700005);
generalPath.curveTo(46.899994, 86.3, 47.199993, 85.8, 47.199993, 85.200005);
generalPath.curveTo(47.199993, 84.8, 47.099995, 84.50001, 46.899994, 84.200005);
generalPath.curveTo(46.699993, 83.9, 46.299995, 83.700005, 45.699993, 83.50001);
generalPath.curveTo(45.29999, 83.40001, 44.499992, 83.100006, 43.099995, 82.80001);
generalPath.curveTo(41.399994, 82.40001, 40.199993, 81.90001, 39.499996, 81.20001);
generalPath.curveTo(38.499996, 80.30001, 37.999996, 79.30001, 37.999996, 78.000015);
generalPath.curveTo(37.999996, 77.20001, 38.199997, 76.40002, 38.699997, 75.80002);
generalPath.curveTo(39.199997, 75.10002, 39.799995, 74.60002, 40.699997, 74.20002);
generalPath.curveTo(41.6, 73.80002, 42.6, 73.70002, 43.799995, 73.70002);
generalPath.curveTo(45.799995, 73.70002, 47.299995, 74.10002, 48.299995, 75.00002);
generalPath.curveTo(49.299995, 75.900024, 49.799995, 77.00002, 49.899994, 78.50002);
generalPath.lineTo(46.699993, 78.60002);
generalPath.curveTo(46.599995, 77.80002, 46.29999, 77.20002, 45.79999, 76.900024);
generalPath.curveTo(45.29999, 76.50002, 44.699993, 76.400024, 43.79999, 76.400024);
generalPath.curveTo(42.89999, 76.400024, 42.09999, 76.60002, 41.59999, 77.00002);
generalPath.curveTo(41.29999, 77.20002, 41.09999, 77.60002, 41.09999, 78.00002);
generalPath.curveTo(41.09999, 78.400024, 41.29999, 78.70002, 41.59999, 79.00002);
generalPath.curveTo(41.999992, 79.300026, 42.999992, 79.70002, 44.59999, 80.10002);
generalPath.curveTo(46.19999, 80.50002, 47.29999, 80.80002, 48.09999, 81.20002);
generalPath.curveTo(48.79999, 81.60002, 49.39999, 82.10002, 49.89999, 82.80002);
generalPath.curveTo(50.29999, 83.500015, 50.49999, 84.30002, 50.49999, 85.30002);
generalPath.curveTo(50.49999, 86.20002, 50.19999, 87.000015, 49.69999, 87.80002);
generalPath.curveTo(49.19999, 88.60002, 48.49999, 89.20002, 47.59999, 89.60002);
generalPath.curveTo(46.69999, 90.00002, 45.499992, 90.20002, 44.09999, 90.20002);
generalPath.curveTo(42.09999, 90.20002, 40.499992, 89.70002, 39.499992, 88.80002);
generalPath.curveTo(38.499992, 87.80002, 37.79999, 86.500015, 37.59999, 84.70002);
generalPath.closePath();
generalPath.moveTo(51.6, 89.8);
generalPath.lineTo(57.0, 81.600006);
generalPath.lineTo(52.1, 74.100006);
generalPath.lineTo(55.899998, 74.100006);
generalPath.lineTo(59.1, 79.200005);
generalPath.lineTo(62.199997, 74.100006);
generalPath.lineTo(65.899994, 74.100006);
generalPath.lineTo(61.0, 81.7);
generalPath.lineTo(66.4, 89.799995);
generalPath.lineTo(62.5, 89.799995);
generalPath.lineTo(59.0, 84.4);
generalPath.lineTo(55.5, 89.8);
generalPath.lineTo(51.6, 89.8);
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
    public static ResizableIcon of(int width, int height) {
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_resx base = new ext_resx();
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
        return ext_resx::new;
    }
}

