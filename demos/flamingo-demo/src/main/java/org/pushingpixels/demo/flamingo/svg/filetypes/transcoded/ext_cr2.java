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
public class ext_cr2 implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(72.1, 99.0);
generalPath.lineTo(0.3, 99.0);
generalPath.lineTo(0.3, 1.0);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.0f,0.124f,0.262f,0.41f,0.571f,0.752f,1.0f}, new Color[] {new Color(0, 107, 105, 255),new Color(0, 128, 127, 255),new Color(0, 147, 147, 255),new Color(0, 163, 163, 255),new Color(0, 176, 175, 255),new Color(8, 184, 183, 255),new Color(20, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(72.1, 99.0);
generalPath.lineTo(0.3, 99.0);
generalPath.lineTo(0.3, 1.0);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(72.1, 99.0);
generalPath.lineTo(0.3, 99.0);
generalPath.lineTo(0.3, 1.0);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(22.7, 83.8);
generalPath.lineTo(26.6, 85.0);
generalPath.curveTo(26.0, 87.2, 25.0, 88.8, 23.6, 89.8);
generalPath.curveTo(22.2, 90.9, 20.4, 91.4, 18.3, 91.4);
generalPath.curveTo(15.599999, 91.4, 13.499999, 90.5, 11.799999, 88.700005);
generalPath.curveTo(10.099999, 86.90001, 9.199999, 84.4, 9.199999, 81.3);
generalPath.curveTo(9.199999, 78.0, 10.099998, 75.4, 11.799999, 73.600006);
generalPath.curveTo(13.5, 71.80001, 15.799999, 70.90001, 18.599998, 70.90001);
generalPath.curveTo(20.999998, 70.90001, 22.999998, 71.600006, 24.599998, 73.100006);
generalPath.curveTo(25.499998, 73.90001, 26.199999, 75.200005, 26.599998, 76.8);
generalPath.lineTo(22.599998, 77.700005);
generalPath.curveTo(22.399998, 76.700005, 21.899998, 75.9, 21.099998, 75.3);
generalPath.curveTo(20.399998, 74.700005, 19.399998, 74.4, 18.399998, 74.4);
generalPath.curveTo(16.899998, 74.4, 15.699998, 74.9, 14.799997, 76.0);
generalPath.curveTo(13.899997, 77.1, 13.399998, 78.8, 13.399998, 81.1);
generalPath.curveTo(13.399998, 83.6, 13.899998, 85.4, 14.799997, 86.5);
generalPath.curveTo(15.699997, 87.6, 16.899998, 88.1, 18.299997, 88.1);
generalPath.curveTo(19.399998, 88.1, 20.299997, 87.799995, 21.099997, 87.1);
generalPath.curveTo(21.899996, 86.4, 22.399996, 85.2, 22.699997, 83.799995);
generalPath.closePath();
generalPath.moveTo(30.1, 91.100006);
generalPath.lineTo(30.1, 71.2);
generalPath.lineTo(38.6, 71.2);
generalPath.curveTo(40.699997, 71.2, 42.3, 71.399994, 43.3, 71.7);
generalPath.curveTo(44.3, 72.0, 45.0, 72.7, 45.6, 73.6);
generalPath.curveTo(46.199997, 74.5, 46.5, 75.6, 46.5, 76.7);
generalPath.curveTo(46.5, 78.2, 46.1, 79.399994, 45.2, 80.399994);
generalPath.curveTo(44.300003, 81.399994, 43.0, 81.99999, 41.2, 82.2);
generalPath.curveTo(42.100002, 82.7, 42.8, 83.299995, 43.4, 83.899994);
generalPath.curveTo(44.0, 84.49999, 44.7, 85.59999, 45.7, 87.09999);
generalPath.lineTo(48.100002, 90.99999);
generalPath.lineTo(43.300003, 90.99999);
generalPath.lineTo(40.4, 86.69999);
generalPath.curveTo(39.4, 85.19999, 38.7, 84.19999, 38.300003, 83.79999);
generalPath.curveTo(37.900005, 83.39999, 37.4, 83.19999, 37.000004, 82.999985);
generalPath.curveTo(36.600002, 82.89999, 35.900005, 82.79999, 35.000004, 82.79999);
generalPath.lineTo(34.200005, 82.79999);
generalPath.lineTo(34.200005, 91.09999);
generalPath.lineTo(30.100004, 91.09999);
generalPath.closePath();
generalPath.moveTo(34.1, 79.600006);
generalPath.lineTo(37.1, 79.600006);
generalPath.curveTo(39.0, 79.600006, 40.199997, 79.50001, 40.699997, 79.40001);
generalPath.curveTo(41.199997, 79.20001, 41.6, 79.00001, 41.799995, 78.600006);
generalPath.curveTo(42.099995, 78.200005, 42.199997, 77.700005, 42.199997, 77.100006);
generalPath.curveTo(42.199997, 76.40001, 41.999996, 75.90001, 41.699997, 75.50001);
generalPath.curveTo(41.299995, 75.100006, 40.799995, 74.80001, 40.199997, 74.700005);
generalPath.curveTo(39.899998, 74.700005, 38.899998, 74.600006, 37.299995, 74.600006);
generalPath.lineTo(34.199997, 74.600006);
generalPath.lineTo(34.199997, 79.600006);
generalPath.closePath();
generalPath.moveTo(62.3, 87.50001);
generalPath.lineTo(62.3, 91.0);
generalPath.lineTo(48.9, 91.0);
generalPath.curveTo(49.0, 89.7, 49.5, 88.4, 50.2, 87.2);
generalPath.curveTo(50.9, 85.99999, 52.4, 84.399994, 54.5, 82.399994);
generalPath.curveTo(56.2, 80.799995, 57.3, 79.7, 57.7, 79.2);
generalPath.curveTo(58.2, 78.399994, 58.5, 77.6, 58.5, 76.899994);
generalPath.curveTo(58.5, 76.09999, 58.3, 75.399994, 57.8, 74.899994);
generalPath.curveTo(57.3, 74.399994, 56.7, 74.2, 55.899998, 74.2);
generalPath.curveTo(55.1, 74.2, 54.499996, 74.399994, 53.999996, 74.899994);
generalPath.curveTo(53.499996, 75.399994, 53.299995, 76.2, 53.199997, 77.299995);
generalPath.lineTo(49.299995, 76.99999);
generalPath.curveTo(49.499996, 74.899994, 50.199997, 73.399994, 51.399994, 72.49999);
generalPath.curveTo(52.599995, 71.59999, 54.099995, 71.09999, 55.899994, 71.09999);
generalPath.curveTo(57.899994, 71.09999, 59.399994, 71.59999, 60.499992, 72.69999);
generalPath.curveTo(61.59999, 73.79999, 62.199993, 75.09999, 62.199993, 76.59999);
generalPath.curveTo(62.199993, 77.49999, 61.999992, 78.29999, 61.699993, 79.19999);
generalPath.curveTo(61.399994, 79.99999, 60.899994, 80.89999, 60.199993, 81.69999);
generalPath.curveTo(59.699993, 82.29999, 58.899994, 83.09999, 57.699993, 84.19999);
generalPath.curveTo(56.499992, 85.29999, 55.699993, 85.99999, 55.399994, 86.39999);
generalPath.curveTo(55.099995, 86.79999, 54.799995, 87.09998, 54.599995, 87.499985);
generalPath.lineTo(62.299995, 87.499985);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {new Color(214, 237, 232, 255),new Color(211, 235, 230, 255),new Color(199, 227, 223, 255),new Color(183, 216, 213, 255),new Color(160, 203, 201, 255),new Color(132, 186, 185, 255),new Color(98, 167, 167, 255),new Color(52, 147, 148, 255),new Color(0, 127, 127, 255),new Color(0, 107, 106, 255),new Color(0, 107, 105, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(62.7, 56.8);
generalPath.curveTo(61.100002, 56.0, 58.100002, 50.2, 53.5, 49.8);
generalPath.curveTo(49.5, 49.5, 44.4, 48.0, 41.6, 47.8);
generalPath.curveTo(38.1, 42.0, 32.1, 32.8, 27.099998, 27.9);
generalPath.lineTo(40.899998, 28.6);
generalPath.curveTo(37.2, 19.8, 27.7, 23.0, 27.7, 23.0);
generalPath.lineTo(34.100002, 17.7);
generalPath.curveTo(25.900002, 14.400001, 22.500002, 22.400002, 22.500002, 22.400002);
generalPath.curveTo(14.000002, 17.7, 9.600002, 25.7, 9.600002, 25.7);
generalPath.lineTo(18.400002, 26.300001);
generalPath.curveTo(8.4, 29.1, 11.2, 39.0, 11.2, 39.0);
generalPath.lineTo(20.099998, 31.0);
generalPath.curveTo(18.199999, 35.4, 22.399998, 38.5, 22.399998, 38.5);
generalPath.lineTo(25.0, 27.7);
generalPath.curveTo(25.0, 27.7, 34.3, 38.300003, 37.2, 49.1);
generalPath.curveTo(33.5, 51.0, 27.7, 54.1, 23.2, 54.699997);
generalPath.curveTo(17.0, 55.499996, 9.700001, 59.699997, 9.700001, 59.699997);
generalPath.lineTo(9.700001, 64.6);
generalPath.lineTo(62.8, 64.6);
generalPath.lineTo(62.7, 56.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.25, 37.35300064086914), new Point2D.Double(36.25, 85.16100311279297), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
        return 0.13300000131130219;
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
		return 0.7379999160766602;
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
	private ext_cr2() {
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
       ext_cr2 base = new ext_cr2();
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
       ext_cr2 base = new ext_cr2();
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
        return ext_cr2::new;
    }
}

