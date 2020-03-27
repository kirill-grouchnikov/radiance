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
public class ext_cs implements ResizableIcon {
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
generalPath.moveTo(31.3, 82.4);
generalPath.lineTo(35.3, 83.6);
generalPath.curveTo(34.7, 85.799995, 33.7, 87.4, 32.3, 88.5);
generalPath.curveTo(30.9, 89.6, 29.099998, 90.1, 26.9, 90.1);
generalPath.curveTo(24.199999, 90.1, 22.0, 89.2, 20.3, 87.4);
generalPath.curveTo(18.599998, 85.6, 17.699999, 83.1, 17.699999, 79.9);
generalPath.curveTo(17.699999, 76.6, 18.599998, 74.0, 20.3, 72.1);
generalPath.curveTo(22.0, 70.299995, 24.3, 69.299995, 27.199999, 69.299995);
generalPath.curveTo(29.699999, 69.299995, 31.699999, 69.99999, 33.199997, 71.49999);
generalPath.curveTo(34.1, 72.399994, 34.799995, 73.59999, 35.299995, 75.19999);
generalPath.lineTo(31.299995, 76.19999);
generalPath.curveTo(31.099995, 75.19999, 30.599995, 74.29999, 29.799995, 73.69999);
generalPath.curveTo(28.999996, 73.09999, 28.099995, 72.79999, 26.999996, 72.79999);
generalPath.curveTo(25.499996, 72.79999, 24.299995, 73.29999, 23.299995, 74.39999);
generalPath.curveTo(22.299995, 75.499985, 21.899996, 77.19999, 21.899996, 79.59998);
generalPath.curveTo(21.899996, 82.09998, 22.399996, 83.89999, 23.299995, 84.999985);
generalPath.curveTo(24.199995, 86.09998, 25.399996, 86.59998, 26.899996, 86.59998);
generalPath.curveTo(27.999996, 86.59998, 28.899996, 86.29998, 29.699995, 85.59998);
generalPath.curveTo(30.499994, 84.89999, 30.899996, 83.89999, 31.299995, 82.39999);
generalPath.closePath();
generalPath.moveTo(37.7, 83.3);
generalPath.lineTo(41.7, 82.9);
generalPath.curveTo(41.9, 84.200005, 42.4, 85.200005, 43.2, 85.8);
generalPath.curveTo(44.0, 86.4, 44.9, 86.700005, 46.2, 86.700005);
generalPath.curveTo(47.5, 86.700005, 48.5, 86.4, 49.2, 85.9);
generalPath.curveTo(49.9, 85.3, 50.2, 84.700005, 50.2, 84.0);
generalPath.curveTo(50.2, 83.5, 50.100002, 83.1, 49.8, 82.8);
generalPath.curveTo(49.5, 82.5, 49.0, 82.200005, 48.3, 81.9);
generalPath.curveTo(47.8, 81.700005, 46.7, 81.4, 45.0, 81.0);
generalPath.curveTo(42.8, 80.5, 41.3, 79.8, 40.4, 79.0);
generalPath.curveTo(39.2, 77.9, 38.5, 76.6, 38.5, 75.0);
generalPath.curveTo(38.5, 74.0, 38.8, 73.0, 39.4, 72.1);
generalPath.curveTo(40.000004, 71.2, 40.800003, 70.5, 41.9, 70.1);
generalPath.curveTo(43.0, 69.6, 44.300003, 69.4, 45.9, 69.4);
generalPath.curveTo(48.4, 69.4, 50.4, 70.0, 51.600002, 71.1);
generalPath.curveTo(52.9, 72.2, 53.600002, 73.7, 53.600002, 75.5);
generalPath.lineTo(49.500004, 75.7);
generalPath.curveTo(49.300003, 74.7, 48.900005, 73.899994, 48.400005, 73.5);
generalPath.curveTo(47.900005, 73.100006, 47.000004, 72.8, 45.800007, 72.8);
generalPath.curveTo(44.600006, 72.8, 43.70001, 73.0, 43.000008, 73.5);
generalPath.curveTo(42.600006, 73.8, 42.40001, 74.2, 42.40001, 74.7);
generalPath.curveTo(42.40001, 75.2, 42.60001, 75.6, 43.000008, 75.899994);
generalPath.curveTo(43.500008, 76.299995, 44.800007, 76.799995, 46.800007, 77.2);
generalPath.curveTo(48.800007, 77.7, 50.300007, 78.1, 51.20001, 78.6);
generalPath.curveTo(52.10001, 79.1, 52.90001, 79.799995, 53.40001, 80.6);
generalPath.curveTo(53.90001, 81.5, 54.20001, 82.5, 54.20001, 83.799995);
generalPath.curveTo(54.20001, 84.899994, 53.90001, 85.99999, 53.20001, 86.99999);
generalPath.curveTo(52.60001, 87.99999, 51.60001, 88.69999, 50.500008, 89.19999);
generalPath.curveTo(49.400005, 89.69999, 47.90001, 89.89999, 46.100006, 89.89999);
generalPath.curveTo(43.500008, 89.89999, 41.600006, 89.29999, 40.200005, 88.09998);
generalPath.curveTo(38.800003, 86.89998, 38.000004, 85.499985, 37.700005, 83.29998);
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
	private ext_cs() {
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
       ext_cs base = new ext_cs();
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
       ext_cs base = new ext_cs();
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
        return ext_cs::new;
    }
}

