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
public class ext_rsa implements ResizableIcon {
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
generalPath.moveTo(51.4, 37.7);
generalPath.lineTo(48.5, 37.7);
generalPath.lineTo(48.5, 32.0);
generalPath.curveTo(48.5, 25.6, 43.3, 20.3, 36.8, 20.3);
generalPath.curveTo(30.3, 20.3, 25.1, 25.6, 25.1, 32.0);
generalPath.lineTo(25.1, 37.7);
generalPath.lineTo(22.2, 37.7);
generalPath.curveTo(21.1, 37.7, 20.2, 38.600002, 20.2, 39.7);
generalPath.lineTo(20.2, 59.5);
generalPath.curveTo(20.2, 60.6, 21.1, 61.5, 22.2, 61.5);
generalPath.lineTo(51.300003, 61.5);
generalPath.curveTo(52.4, 61.5, 53.300003, 60.6, 53.300003, 59.5);
generalPath.lineTo(53.300003, 39.8);
generalPath.curveTo(53.4, 38.6, 52.500004, 37.7, 51.4, 37.7);
generalPath.closePath();
generalPath.moveTo(39.3, 54.2);
generalPath.curveTo(39.5, 54.9, 39.0, 55.5, 38.3, 55.5);
generalPath.lineTo(35.3, 55.5);
generalPath.curveTo(34.6, 55.5, 34.1, 54.8, 34.3, 54.2);
generalPath.lineTo(35.3, 50.5);
generalPath.curveTo(34.2, 49.9, 33.399998, 48.8, 33.399998, 47.4);
generalPath.curveTo(33.399998, 45.4, 34.999996, 43.9, 36.899998, 43.9);
generalPath.curveTo(38.8, 43.9, 40.399998, 45.5, 40.399998, 47.4);
generalPath.curveTo(40.399998, 48.800003, 39.6, 50.0, 38.499996, 50.5);
generalPath.lineTo(39.299995, 54.2);
generalPath.closePath();
generalPath.moveTo(42.6, 37.7);
generalPath.lineTo(31.0, 37.7);
generalPath.lineTo(31.0, 32.0);
generalPath.curveTo(31.0, 28.8, 33.6, 26.2, 36.8, 26.2);
generalPath.curveTo(40.0, 26.2, 42.6, 28.800001, 42.6, 32.0);
generalPath.lineTo(42.6, 37.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.79999923706055, 61.5890007019043), new Point2D.Double(36.79999923706055, 20.33300018310547), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {new Color(134, 155, 166, 255),new Color(131, 153, 164, 255),new Color(123, 146, 158, 255),new Color(109, 134, 148, 255),new Color(90, 119, 133, 255),new Color(66, 99, 115, 255),new Color(65, 98, 113, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.6, 91.9);
generalPath.lineTo(9.6, 71.9);
generalPath.lineTo(18.1, 71.9);
generalPath.curveTo(20.2, 71.9, 21.800001, 72.1, 22.8, 72.4);
generalPath.curveTo(23.799997, 72.700005, 24.5, 73.4, 25.099998, 74.3);
generalPath.curveTo(25.699999, 75.200005, 25.999998, 76.3, 25.999998, 77.5);
generalPath.curveTo(25.999998, 79.0, 25.599998, 80.2, 24.699999, 81.2);
generalPath.curveTo(23.8, 82.2, 22.499998, 82.799995, 20.699999, 83.1);
generalPath.curveTo(21.599998, 83.6, 22.3, 84.2, 22.9, 84.799995);
generalPath.curveTo(23.5, 85.399994, 24.199999, 86.49999, 25.199999, 88.1);
generalPath.lineTo(27.599998, 92.0);
generalPath.lineTo(22.8, 92.0);
generalPath.lineTo(19.9, 87.6);
generalPath.curveTo(18.9, 86.0, 18.1, 85.1, 17.8, 84.7);
generalPath.curveTo(17.499998, 84.299995, 17.0, 84.0, 16.599998, 83.899994);
generalPath.curveTo(16.199999, 83.7, 15.499998, 83.7, 14.599998, 83.7);
generalPath.lineTo(13.799998, 83.7);
generalPath.lineTo(13.799998, 92.1);
generalPath.lineTo(9.6, 92.1);
generalPath.closePath();
generalPath.moveTo(13.700001, 80.3);
generalPath.lineTo(16.7, 80.3);
generalPath.curveTo(18.6, 80.3, 19.900002, 80.200005, 20.300001, 80.100006);
generalPath.curveTo(20.800001, 79.90001, 21.2, 79.700005, 21.400002, 79.3);
generalPath.curveTo(21.600002, 78.9, 21.800001, 78.4, 21.800001, 77.8);
generalPath.curveTo(21.800001, 77.100006, 21.6, 76.600006, 21.300001, 76.200005);
generalPath.curveTo(20.900002, 75.8, 20.400002, 75.50001, 19.800001, 75.4);
generalPath.curveTo(19.500002, 75.4, 18.500002, 75.3, 16.800001, 75.3);
generalPath.lineTo(13.600001, 75.3);
generalPath.lineTo(13.600001, 80.3);
generalPath.closePath();
generalPath.moveTo(28.800001, 85.4);
generalPath.lineTo(32.7, 85.0);
generalPath.curveTo(32.9, 86.3, 33.4, 87.3, 34.100002, 87.9);
generalPath.curveTo(34.800003, 88.5, 35.800003, 88.8, 37.000004, 88.8);
generalPath.curveTo(38.300003, 88.8, 39.300003, 88.5, 39.900005, 88.0);
generalPath.curveTo(40.600006, 87.4, 40.900005, 86.8, 40.900005, 86.1);
generalPath.curveTo(40.900005, 85.6, 40.800007, 85.2, 40.500004, 84.9);
generalPath.curveTo(40.200005, 84.6, 39.700005, 84.3, 39.000004, 84.0);
generalPath.curveTo(38.500004, 83.8, 37.400005, 83.5, 35.800003, 83.1);
generalPath.curveTo(33.600002, 82.6, 32.100002, 81.9, 31.200003, 81.1);
generalPath.curveTo(30.000002, 80.0, 29.400003, 78.7, 29.400003, 77.1);
generalPath.curveTo(29.400003, 76.1, 29.700003, 75.1, 30.300003, 74.2);
generalPath.curveTo(30.900003, 73.299995, 31.700003, 72.6, 32.800003, 72.2);
generalPath.curveTo(33.9, 71.7, 35.200005, 71.5, 36.700005, 71.5);
generalPath.curveTo(39.200005, 71.5, 41.100006, 72.1, 42.400005, 73.2);
generalPath.curveTo(43.700005, 74.299995, 44.300007, 75.799995, 44.400005, 77.6);
generalPath.lineTo(40.400005, 77.799995);
generalPath.curveTo(40.200005, 76.799995, 39.900005, 75.99999, 39.300007, 75.6);
generalPath.curveTo(38.70001, 75.1, 37.900005, 74.9, 36.70001, 74.9);
generalPath.curveTo(35.500008, 74.9, 34.60001, 75.1, 33.90001, 75.6);
generalPath.curveTo(33.500008, 75.9, 33.30001, 76.299995, 33.30001, 76.799995);
generalPath.curveTo(33.30001, 77.299995, 33.50001, 77.7, 33.90001, 77.99999);
generalPath.curveTo(34.40001, 78.399994, 35.70001, 78.899994, 37.60001, 79.299995);
generalPath.curveTo(39.50001, 79.7, 41.00001, 80.2, 42.00001, 80.7);
generalPath.curveTo(43.00001, 81.2, 43.700012, 81.899994, 44.200012, 82.7);
generalPath.curveTo(44.700012, 83.5, 45.00001, 84.6, 45.00001, 85.899994);
generalPath.curveTo(45.00001, 86.99999, 44.700012, 88.09999, 44.00001, 89.09999);
generalPath.curveTo(43.400013, 90.09999, 42.50001, 90.79999, 41.30001, 91.29999);
generalPath.curveTo(40.10001, 91.79999, 38.700012, 91.999985, 36.90001, 91.999985);
generalPath.curveTo(34.40001, 91.999985, 32.40001, 91.39999, 31.10001, 90.19998);
generalPath.curveTo(29.90001, 89.29998, 29.10001, 87.59998, 28.80001, 85.39998);
generalPath.closePath();
generalPath.moveTo(66.6, 91.9);
generalPath.lineTo(62.199997, 91.9);
generalPath.lineTo(60.399998, 87.3);
generalPath.lineTo(52.399998, 87.3);
generalPath.lineTo(50.699997, 91.9);
generalPath.lineTo(46.399998, 91.9);
generalPath.lineTo(54.199997, 71.9);
generalPath.lineTo(58.499996, 71.9);
generalPath.lineTo(66.6, 91.9);
generalPath.closePath();
generalPath.moveTo(59.1, 84.0);
generalPath.lineTo(56.3, 76.6);
generalPath.lineTo(53.7, 84.0);
generalPath.lineTo(59.100002, 84.0);
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
	private ext_rsa() {
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
       ext_rsa base = new ext_rsa();
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
       ext_rsa base = new ext_rsa();
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
        return ext_rsa::new;
    }
}

