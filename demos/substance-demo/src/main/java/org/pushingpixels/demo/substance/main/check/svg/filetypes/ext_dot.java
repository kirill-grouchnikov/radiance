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
public class ext_dot implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.056f,0.16f,0.274f,0.398f,0.539f,0.711f,1.0f}, new Color[] {new Color(0, 45, 68, 255),new Color(1, 56, 82, 255),new Color(10, 77, 107, 255),new Color(15, 94, 130, 255),new Color(15, 109, 150, 255),new Color(13, 119, 164, 255),new Color(10, 126, 174, 255),new Color(8, 129, 178, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new Color(1, 65, 94, 255);
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
generalPath.moveTo(8.2, 71.2);
generalPath.lineTo(15.6, 71.2);
generalPath.curveTo(17.300001, 71.2, 18.5, 71.299995, 19.4, 71.6);
generalPath.curveTo(20.6, 71.9, 21.6, 72.6, 22.4, 73.4);
generalPath.curveTo(23.199999, 74.3, 23.9, 75.3, 24.3, 76.6);
generalPath.curveTo(24.699999, 77.9, 25.0, 79.4, 25.0, 81.299995);
generalPath.curveTo(25.0, 82.899994, 24.8, 84.299995, 24.4, 85.49999);
generalPath.curveTo(23.9, 86.899994, 23.199999, 88.09999, 22.3, 88.99999);
generalPath.curveTo(21.599998, 89.69999, 20.699999, 90.19999, 19.5, 90.59999);
generalPath.curveTo(18.6, 90.899994, 17.4, 90.99999, 15.9, 90.99999);
generalPath.lineTo(8.2, 90.99999);
generalPath.lineTo(8.2, 71.2);
generalPath.closePath();
generalPath.moveTo(12.299999, 74.6);
generalPath.lineTo(12.299999, 87.7);
generalPath.lineTo(15.299999, 87.7);
generalPath.curveTo(16.4, 87.7, 17.199999, 87.6, 17.699999, 87.5);
generalPath.curveTo(18.4, 87.3, 18.9, 87.1, 19.3, 86.7);
generalPath.curveTo(19.699999, 86.299995, 20.099998, 85.7, 20.4, 84.799995);
generalPath.curveTo(20.7, 83.899994, 20.8, 82.7, 20.8, 81.2);
generalPath.curveTo(20.8, 79.7, 20.699999, 78.5, 20.4, 77.7);
generalPath.curveTo(20.1, 76.899994, 19.699999, 76.2, 19.3, 75.799995);
generalPath.curveTo(18.9, 75.399994, 18.199999, 74.99999, 17.4, 74.899994);
generalPath.curveTo(16.8, 74.799995, 15.7, 74.7, 14.099999, 74.7);
generalPath.lineTo(12.299999, 74.7);
generalPath.closePath();
generalPath.moveTo(27.699999, 81.299995);
generalPath.curveTo(27.699999, 79.299995, 27.999998, 77.6, 28.599998, 76.2);
generalPath.curveTo(29.099998, 75.2, 29.699999, 74.299995, 30.499998, 73.5);
generalPath.curveTo(31.299997, 72.7, 32.199997, 72.1, 33.1, 71.7);
generalPath.curveTo(34.3, 71.2, 35.8, 70.899994, 37.399998, 70.899994);
generalPath.curveTo(40.399998, 70.899994, 42.699997, 71.799995, 44.499996, 73.59999);
generalPath.curveTo(46.299995, 75.399994, 47.199997, 77.899994, 47.199997, 81.19999);
generalPath.curveTo(47.199997, 84.39999, 46.299995, 86.89999, 44.6, 88.69999);
generalPath.curveTo(42.9, 90.49999, 40.5, 91.39999, 37.5, 91.39999);
generalPath.curveTo(34.5, 91.39999, 32.1, 90.499985, 30.4, 88.69999);
generalPath.curveTo(28.5, 86.89999, 27.699999, 84.39999, 27.699999, 81.29999);
generalPath.closePath();
generalPath.moveTo(31.8, 81.1);
generalPath.curveTo(31.8, 83.299995, 32.3, 85.1, 33.399998, 86.2);
generalPath.curveTo(34.399998, 87.399994, 35.8, 87.899994, 37.399998, 87.899994);
generalPath.curveTo(38.999996, 87.899994, 40.3, 87.299995, 41.399998, 86.2);
generalPath.curveTo(42.399998, 85.0, 42.999996, 83.299995, 42.999996, 81.0);
generalPath.curveTo(42.999996, 78.7, 42.499996, 77.0, 41.499996, 75.9);
generalPath.curveTo(40.499996, 74.8, 39.199997, 74.200005, 37.499996, 74.200005);
generalPath.curveTo(35.799995, 74.200005, 34.499996, 74.8, 33.499996, 75.9);
generalPath.curveTo(32.299995, 77.1, 31.799995, 78.8, 31.799995, 81.1);
generalPath.closePath();
generalPath.moveTo(54.8, 91.1);
generalPath.lineTo(54.8, 74.6);
generalPath.lineTo(48.899998, 74.6);
generalPath.lineTo(48.899998, 71.2);
generalPath.lineTo(64.799995, 71.2);
generalPath.lineTo(64.799995, 74.6);
generalPath.lineTo(58.899994, 74.6);
generalPath.lineTo(58.899994, 91.1);
generalPath.lineTo(54.799995, 91.1);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(64.4, 25.7);
generalPath.curveTo(63.9, 25.7, 63.4, 25.900002, 63.0, 26.0);
generalPath.curveTo(62.5, 26.2, 62.0, 26.4, 61.6, 26.6);
generalPath.curveTo(60.899998, 27.0, 60.399998, 27.4, 60.1, 27.9);
generalPath.curveTo(59.8, 28.4, 59.5, 29.0, 59.3, 29.6);
generalPath.curveTo(58.399998, 32.0, 57.1, 35.6, 55.3, 40.9);
generalPath.curveTo(53.5, 46.0, 51.7, 51.4, 49.7, 56.9);
generalPath.lineTo(45.0, 56.9);
generalPath.lineTo(36.3, 32.5);
generalPath.lineTo(28.4, 56.9);
generalPath.lineTo(23.7, 56.9);
generalPath.curveTo(21.1, 49.4, 19.1, 43.600002, 17.7, 39.7);
generalPath.curveTo(16.300001, 35.600002, 15.200001, 32.3, 14.200001, 29.5);
generalPath.curveTo(13.900001, 28.7, 13.6, 28.1, 13.200001, 27.7);
generalPath.curveTo(12.800001, 27.300001, 12.300001, 26.900002, 11.800001, 26.5);
generalPath.curveTo(11.400002, 26.2, 10.900002, 26.0, 10.500001, 25.9);
generalPath.curveTo(10.000001, 25.8, 9.500001, 25.699999, 8.900001, 25.6);
generalPath.lineTo(8.900001, 23.800001);
generalPath.lineTo(26.5, 23.800001);
generalPath.lineTo(26.5, 25.6);
generalPath.curveTo(25.5, 25.7, 24.7, 25.800001, 24.2, 26.0);
generalPath.curveTo(23.7, 26.1, 23.300001, 26.2, 23.0, 26.4);
generalPath.curveTo(22.7, 26.5, 22.5, 26.699999, 22.5, 26.8);
generalPath.curveTo(22.4, 26.9, 22.4, 27.099998, 22.4, 27.199999);
generalPath.curveTo(22.4, 27.4, 22.4, 27.599998, 22.5, 27.8);
generalPath.curveTo(22.6, 28.0, 22.6, 28.199999, 22.7, 28.5);
generalPath.curveTo(23.1, 29.7, 23.800001, 32.0, 25.0, 35.3);
generalPath.curveTo(26.1, 38.7, 27.5, 42.8, 29.2, 47.8);
generalPath.lineTo(36.7, 24.0);
generalPath.lineTo(41.600002, 24.0);
generalPath.lineTo(50.300003, 48.5);
generalPath.curveTo(51.600002, 44.5, 52.600002, 41.3, 53.4, 38.8);
generalPath.curveTo(54.2, 36.3, 54.800003, 34.1, 55.300003, 32.399998);
generalPath.curveTo(55.600002, 31.299997, 55.9, 30.399998, 56.000004, 29.599998);
generalPath.curveTo(56.200005, 28.899998, 56.300003, 28.199999, 56.300003, 27.699999);
generalPath.curveTo(56.300003, 27.4, 56.100002, 27.099998, 55.800003, 26.9);
generalPath.curveTo(55.500004, 26.699999, 55.100002, 26.5, 54.600002, 26.3);
generalPath.curveTo(54.2, 26.199999, 53.600002, 26.0, 52.9, 26.0);
generalPath.curveTo(52.2, 25.9, 51.600002, 25.8, 51.100002, 25.8);
generalPath.lineTo(51.100002, 23.8);
generalPath.lineTo(64.4, 23.8);
generalPath.lineTo(64.4, 25.699999);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.121000289916992, 50.46799850463867), new Point2D.Double(55.04100036621094, 87.38899993896484), new float[] {0.005f,0.116f,0.239f,0.369f,0.502f,0.639f,0.779f,0.918f,1.0f}, new Color[] {new Color(0, 97, 134, 255),new Color(0, 95, 131, 255),new Color(0, 90, 125, 255),new Color(0, 83, 115, 255),new Color(0, 72, 101, 255),new Color(0, 57, 83, 255),new Color(0, 37, 60, 255),new Color(0, 3, 29, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 74.20500183105469), new Point2D.Double(58.569000244140625, 87.70500183105469), new float[] {0.005f,0.3f,0.443f,0.553f,0.647f,0.73f,0.805f,0.875f,0.938f,0.998f,1.0f}, new Color[] {new Color(223, 241, 250, 255),new Color(220, 238, 247, 255),new Color(211, 228, 239, 255),new Color(196, 214, 227, 255),new Color(177, 197, 213, 255),new Color(154, 176, 197, 255),new Color(129, 154, 179, 255),new Color(100, 130, 159, 255),new Color(66, 108, 140, 255),new Color(6, 87, 122, 255),new Color(1, 86, 121, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(1, 65, 94, 255);
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
	private ext_dot() {
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
       ext_dot base = new ext_dot();
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
       ext_dot base = new ext_dot();
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
        return ext_dot::new;
    }
}

