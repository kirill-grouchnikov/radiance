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
public class ext_bmp implements ResizableIcon {
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
generalPath.moveTo(7.5, 71.2);
generalPath.lineTo(15.5, 71.2);
generalPath.curveTo(17.1, 71.2, 18.3, 71.299995, 19.0, 71.399994);
generalPath.curveTo(19.8, 71.49999, 20.5, 71.799995, 21.1, 72.2);
generalPath.curveTo(21.7, 72.6, 22.2, 73.2, 22.6, 73.899994);
generalPath.curveTo(23.0, 74.59999, 23.2, 75.399994, 23.2, 76.2);
generalPath.curveTo(23.2, 77.1, 22.900002, 78.0, 22.400002, 78.799995);
generalPath.curveTo(21.900002, 79.59999, 21.2, 80.2, 20.300001, 80.49999);
generalPath.curveTo(21.500002, 80.899994, 22.500002, 81.49999, 23.1, 82.299995);
generalPath.curveTo(23.699999, 83.1, 24.1, 84.1, 24.1, 85.299995);
generalPath.curveTo(24.1, 86.2, 23.9, 87.1, 23.5, 87.899994);
generalPath.curveTo(23.1, 88.69999, 22.5, 89.399994, 21.8, 89.899994);
generalPath.curveTo(21.099998, 90.399994, 20.199999, 90.7, 19.099998, 90.799995);
generalPath.curveTo(18.399998, 90.899994, 16.8, 90.899994, 14.199999, 90.899994);
generalPath.lineTo(7.5, 90.899994);
generalPath.lineTo(7.5, 71.2);
generalPath.closePath();
generalPath.moveTo(11.5, 74.5);
generalPath.lineTo(11.5, 79.1);
generalPath.lineTo(14.1, 79.1);
generalPath.curveTo(15.700001, 79.1, 16.6, 79.1, 17.0, 79.0);
generalPath.curveTo(17.7, 78.9, 18.2, 78.7, 18.6, 78.3);
generalPath.curveTo(19.0, 77.90001, 19.2, 77.4, 19.2, 76.8);
generalPath.curveTo(19.2, 76.200005, 19.0, 75.700005, 18.7, 75.3);
generalPath.curveTo(18.400002, 74.9, 17.900002, 74.700005, 17.2, 74.600006);
generalPath.curveTo(16.800001, 74.600006, 15.700001, 74.50001, 13.800001, 74.50001);
generalPath.lineTo(11.500001, 74.50001);
generalPath.closePath();
generalPath.moveTo(11.5, 82.4);
generalPath.lineTo(11.5, 87.700005);
generalPath.lineTo(15.2, 87.700005);
generalPath.curveTo(16.7, 87.700005, 17.6, 87.700005, 18.0, 87.600006);
generalPath.curveTo(18.6, 87.50001, 19.1, 87.200005, 19.5, 86.8);
generalPath.curveTo(19.9, 86.4, 20.1, 85.8, 20.1, 85.100006);
generalPath.curveTo(20.1, 84.50001, 20.0, 84.00001, 19.7, 83.600006);
generalPath.curveTo(19.400002, 83.200005, 19.0, 82.90001, 18.400002, 82.700005);
generalPath.curveTo(17.900002, 82.50001, 16.7, 82.4, 14.800001, 82.4);
generalPath.lineTo(11.500001, 82.4);
generalPath.closePath();
generalPath.moveTo(27.6, 91.1);
generalPath.lineTo(27.6, 71.2);
generalPath.lineTo(33.6, 71.2);
generalPath.lineTo(37.199997, 84.7);
generalPath.lineTo(40.799995, 71.2);
generalPath.lineTo(46.799995, 71.2);
generalPath.lineTo(46.799995, 91.0);
generalPath.lineTo(43.099995, 91.0);
generalPath.lineTo(43.099995, 75.4);
generalPath.lineTo(39.099995, 91.0);
generalPath.lineTo(35.199993, 91.0);
generalPath.lineTo(31.199993, 75.4);
generalPath.lineTo(31.199993, 91.0);
generalPath.lineTo(27.599993, 91.0);
generalPath.closePath();
generalPath.moveTo(50.9, 91.1);
generalPath.lineTo(50.9, 71.2);
generalPath.lineTo(57.4, 71.2);
generalPath.curveTo(59.9, 71.2, 61.5, 71.299995, 62.2, 71.5);
generalPath.curveTo(63.3, 71.8, 64.3, 72.4, 65.1, 73.4);
generalPath.curveTo(65.9, 74.4, 66.299995, 75.700005, 66.299995, 77.3);
generalPath.curveTo(66.299995, 78.5, 66.1, 79.5, 65.6, 80.4);
generalPath.curveTo(65.2, 81.200005, 64.6, 81.9, 63.899998, 82.4);
generalPath.curveTo(63.199997, 82.9, 62.499996, 83.200005, 61.8, 83.3);
generalPath.curveTo(60.8, 83.5, 59.399998, 83.600006, 57.6, 83.600006);
generalPath.lineTo(55.0, 83.600006);
generalPath.lineTo(55.0, 91.100006);
generalPath.lineTo(50.9, 91.100006);
generalPath.closePath();
generalPath.moveTo(54.9, 74.6);
generalPath.lineTo(54.9, 80.2);
generalPath.lineTo(57.100002, 80.2);
generalPath.curveTo(58.7, 80.2, 59.800003, 80.1, 60.300003, 79.899994);
generalPath.curveTo(60.800003, 79.7, 61.300003, 79.399994, 61.600002, 78.899994);
generalPath.curveTo(61.9, 78.49999, 62.100002, 77.899994, 62.100002, 77.399994);
generalPath.curveTo(62.100002, 76.7, 61.9, 76.09999, 61.500004, 75.59999);
generalPath.curveTo(61.100002, 75.09999, 60.500004, 74.79999, 59.900005, 74.69999);
generalPath.curveTo(59.400005, 74.59999, 58.500004, 74.59999, 57.000004, 74.59999);
generalPath.lineTo(54.900005, 74.59999);
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
	private ext_bmp() {
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
       ext_bmp base = new ext_bmp();
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
       ext_bmp base = new ext_bmp();
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
        return ext_bmp::new;
    }
}

