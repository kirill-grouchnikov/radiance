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
public class ext_apk implements ResizableIcon {
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
generalPath.moveTo(26.1, 91.1);
generalPath.lineTo(21.7, 91.1);
generalPath.lineTo(19.900002, 86.6);
generalPath.lineTo(11.900002, 86.6);
generalPath.lineTo(10.200002, 91.1);
generalPath.lineTo(6.0, 91.1);
generalPath.lineTo(13.8, 71.3);
generalPath.lineTo(18.1, 71.3);
generalPath.lineTo(26.1, 91.100006);
generalPath.closePath();
generalPath.moveTo(18.6, 83.299995);
generalPath.lineTo(15.8, 75.899994);
generalPath.lineTo(13.1, 83.299995);
generalPath.lineTo(18.6, 83.299995);
generalPath.closePath();
generalPath.moveTo(28.2, 91.1);
generalPath.lineTo(28.2, 71.3);
generalPath.lineTo(34.7, 71.3);
generalPath.curveTo(37.2, 71.3, 38.8, 71.4, 39.5, 71.600006);
generalPath.curveTo(40.6, 71.90001, 41.6, 72.50001, 42.4, 73.50001);
generalPath.curveTo(43.2, 74.50001, 43.600002, 75.80001, 43.600002, 77.40001);
generalPath.curveTo(43.600002, 78.600006, 43.4, 79.600006, 42.9, 80.50001);
generalPath.curveTo(42.5, 81.30001, 41.9, 82.00001, 41.2, 82.50001);
generalPath.curveTo(40.5, 83.00001, 39.8, 83.30001, 39.100002, 83.40001);
generalPath.curveTo(38.100002, 83.600006, 36.7, 83.70001, 34.9, 83.70001);
generalPath.lineTo(32.300003, 83.70001);
generalPath.lineTo(32.300003, 91.20001);
generalPath.lineTo(28.200003, 91.20001);
generalPath.lineTo(28.200003, 91.10001);
generalPath.closePath();
generalPath.moveTo(32.3, 74.6);
generalPath.lineTo(32.3, 80.2);
generalPath.lineTo(34.5, 80.2);
generalPath.curveTo(36.1, 80.2, 37.2, 80.1, 37.7, 79.899994);
generalPath.curveTo(38.2, 79.7, 38.7, 79.399994, 39.0, 78.899994);
generalPath.curveTo(39.3, 78.49999, 39.5, 77.899994, 39.5, 77.399994);
generalPath.curveTo(39.5, 76.7, 39.3, 76.09999, 38.9, 75.59999);
generalPath.curveTo(38.5, 75.09999, 37.9, 74.79999, 37.300003, 74.69999);
generalPath.curveTo(36.800003, 74.59999, 35.800003, 74.59999, 34.4, 74.59999);
generalPath.lineTo(32.300003, 74.59999);
generalPath.closePath();
generalPath.moveTo(47.0, 91.1);
generalPath.lineTo(47.0, 71.3);
generalPath.lineTo(51.0, 71.3);
generalPath.lineTo(51.0, 80.100006);
generalPath.lineTo(59.2, 71.3);
generalPath.lineTo(64.6, 71.3);
generalPath.lineTo(57.1, 79.0);
generalPath.lineTo(65.1, 91.1);
generalPath.lineTo(59.899998, 91.1);
generalPath.lineTo(54.399998, 81.799995);
generalPath.lineTo(50.999996, 85.1);
generalPath.lineTo(50.999996, 91.1);
generalPath.lineTo(46.999996, 91.1);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.4, 51.7);
generalPath.curveTo(23.4, 52.9, 24.199999, 53.8, 25.5, 53.8);
generalPath.lineTo(27.6, 53.8);
generalPath.lineTo(27.6, 61.0);
generalPath.curveTo(27.6, 62.6, 29.0, 64.1, 30.7, 64.1);
generalPath.curveTo(32.3, 64.1, 33.8, 62.699997, 33.8, 61.0);
generalPath.lineTo(33.8, 53.8);
generalPath.lineTo(37.899998, 53.8);
generalPath.lineTo(37.899998, 61.0);
generalPath.curveTo(37.899998, 62.6, 39.3, 64.1, 40.999996, 64.1);
generalPath.curveTo(42.699993, 64.1, 44.099995, 62.699997, 44.099995, 61.0);
generalPath.lineTo(44.099995, 53.8);
generalPath.lineTo(46.0, 53.8);
generalPath.curveTo(47.2, 53.8, 48.1, 53.0, 48.1, 51.7);
generalPath.lineTo(48.1, 31.1);
generalPath.lineTo(23.4, 31.1);
generalPath.lineTo(23.4, 51.7);
generalPath.closePath();
generalPath.moveTo(18.3, 31.1);
generalPath.curveTo(16.699999, 31.1, 15.199999, 32.5, 15.199999, 34.2);
generalPath.lineTo(15.199999, 48.6);
generalPath.curveTo(15.199999, 50.199997, 16.599998, 51.699997, 18.3, 51.699997);
generalPath.curveTo(19.9, 51.699997, 21.4, 50.299995, 21.4, 48.6);
generalPath.lineTo(21.4, 34.2);
generalPath.curveTo(21.4, 32.5, 19.9, 31.1, 18.3, 31.1);
generalPath.closePath();
generalPath.moveTo(53.2, 31.1);
generalPath.curveTo(51.600002, 31.1, 50.100002, 32.5, 50.100002, 34.2);
generalPath.lineTo(50.100002, 48.6);
generalPath.curveTo(50.100002, 50.199997, 51.500004, 51.699997, 53.2, 51.699997);
generalPath.curveTo(54.899998, 51.699997, 56.3, 50.299995, 56.3, 48.6);
generalPath.lineTo(56.3, 34.2);
generalPath.curveTo(56.3, 32.5, 54.899998, 31.1, 53.2, 31.1);
generalPath.closePath();
generalPath.moveTo(42.9, 19.2);
generalPath.lineTo(45.600002, 16.5);
generalPath.curveTo(46.000004, 16.1, 46.000004, 15.5, 45.600002, 15.1);
generalPath.curveTo(45.2, 14.700001, 44.600002, 14.700001, 44.2, 15.1);
generalPath.lineTo(41.100002, 18.2);
generalPath.curveTo(39.7, 17.2, 37.800003, 16.800001, 35.800003, 16.800001);
generalPath.curveTo(33.800003, 16.800001, 31.900003, 17.2, 30.200003, 18.000002);
generalPath.lineTo(27.300003, 14.900002);
generalPath.curveTo(26.900003, 14.700002, 26.100002, 14.700002, 25.700003, 14.900002);
generalPath.curveTo(25.500002, 15.300001, 25.500002, 16.100002, 25.700003, 16.500002);
generalPath.lineTo(28.400003, 19.200003);
generalPath.curveTo(25.500004, 21.500002, 23.500004, 25.000004, 23.500004, 29.100002);
generalPath.lineTo(48.200005, 29.100002);
generalPath.curveTo(48.100006, 24.900002, 46.000004, 21.200003, 42.900005, 19.200003);
generalPath.closePath();
generalPath.moveTo(31.600002, 24.900002);
generalPath.lineTo(29.500002, 24.900002);
generalPath.lineTo(29.500002, 22.800001);
generalPath.lineTo(31.600002, 22.800001);
generalPath.lineTo(31.600002, 24.900002);
generalPath.closePath();
generalPath.moveTo(41.9, 24.900002);
generalPath.lineTo(39.800003, 24.900002);
generalPath.lineTo(39.800003, 22.800001);
generalPath.lineTo(41.9, 22.800001);
generalPath.lineTo(41.9, 24.900002);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 64.0999984741211), new Point2D.Double(35.75, 14.75), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0359992980957, 25.81399917602539), new Point2D.Double(58.5359992980957, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
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
	private ext_apk() {
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
       ext_apk base = new ext_apk();
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
       ext_apk base = new ext_apk();
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
        return ext_apk::new;
    }
}

