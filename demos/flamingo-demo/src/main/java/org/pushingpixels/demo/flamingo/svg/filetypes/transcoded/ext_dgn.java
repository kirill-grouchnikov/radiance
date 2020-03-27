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
public class ext_dgn implements ResizableIcon {
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
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.6);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0179998874664307), new Point2D.Double(36.20000076293945, 101.052001953125), new float[] {0.0f,0.002f,0.092f,0.186f,0.286f,0.393f,0.507f,0.633f,0.781f,1.0f}, new Color[] {new Color(0, 166, 233, 255),new Color(0, 167, 233, 255),new Color(0, 178, 236, 255),new Color(35, 189, 239, 255),new Color(102, 200, 242, 255),new Color(137, 211, 245, 255),new Color(161, 219, 248, 255),new Color(178, 226, 249, 255),new Color(188, 230, 251, 255),new Color(191, 231, 251, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.6);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 150, 219, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.6);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
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
generalPath.moveTo(45.2, 0.8);
generalPath.lineTo(72.3, 27.5);
generalPath.lineTo(45.2, 27.5);
generalPath.lineTo(45.2, 0.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(58.77299880981445, 87.8759994506836), new Point2D.Double(49.74100112915039, 78.84500122070312), new float[] {0.0f,0.03f,0.095f,0.166f,0.241f,0.321f,0.407f,0.503f,0.614f,0.751f,1.0f}, new Color[] {new Color(0, 157, 225, 255),new Color(0, 163, 227, 255),new Color(0, 177, 231, 255),new Color(103, 192, 236, 255),new Color(146, 206, 240, 255),new Color(180, 219, 244, 255),new Color(206, 231, 248, 255),new Color(227, 240, 251, 255),new Color(241, 248, 253, 255),new Color(251, 253, 254, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 0.8);
generalPath.lineTo(72.3, 27.5);
generalPath.lineTo(45.2, 27.5);
generalPath.lineTo(45.2, 0.8);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 150, 219, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.8);
generalPath.lineTo(72.3, 27.5);
generalPath.lineTo(45.2, 27.5);
generalPath.lineTo(45.2, 0.8);
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
generalPath.moveTo(8.9, 71.6);
generalPath.lineTo(15.799999, 71.6);
generalPath.curveTo(17.4, 71.6, 18.5, 71.7, 19.4, 72.0);
generalPath.curveTo(20.5, 72.3, 21.4, 72.9, 22.199999, 73.7);
generalPath.curveTo(22.999998, 74.5, 23.599998, 75.5, 23.999998, 76.7);
generalPath.curveTo(24.399998, 77.899994, 24.599998, 79.299995, 24.599998, 81.1);
generalPath.curveTo(24.599998, 82.6, 24.399998, 83.9, 23.999998, 85.0);
generalPath.curveTo(23.499998, 86.3, 22.899998, 87.4, 21.999998, 88.3);
generalPath.curveTo(21.299997, 88.9, 20.499998, 89.4, 19.399998, 89.8);
generalPath.curveTo(18.599998, 90.100006, 17.499998, 90.200005, 16.099998, 90.200005);
generalPath.lineTo(8.9, 90.200005);
generalPath.lineTo(8.9, 71.6);
generalPath.closePath();
generalPath.moveTo(12.7, 74.7);
generalPath.lineTo(12.7, 87.0);
generalPath.lineTo(15.5, 87.0);
generalPath.curveTo(16.6, 87.0, 17.3, 86.9, 17.8, 86.8);
generalPath.curveTo(18.4, 86.600006, 18.9, 86.4, 19.3, 86.0);
generalPath.curveTo(19.699999, 85.6, 20.0, 85.0, 20.3, 84.2);
generalPath.curveTo(20.599998, 83.399994, 20.699999, 82.2, 20.699999, 80.799995);
generalPath.curveTo(20.699999, 79.399994, 20.599998, 78.299995, 20.3, 77.49999);
generalPath.curveTo(20.0, 76.69999, 19.699999, 76.09999, 19.199999, 75.69999);
generalPath.curveTo(18.699999, 75.29999, 18.199999, 74.99999, 17.499998, 74.79999);
generalPath.curveTo(16.999998, 74.69999, 15.899998, 74.59999, 14.399998, 74.59999);
generalPath.lineTo(12.699998, 74.59999);
generalPath.closePath();
generalPath.moveTo(36.5, 83.299995);
generalPath.lineTo(36.5, 80.2);
generalPath.lineTo(44.6, 80.2);
generalPath.lineTo(44.6, 87.5);
generalPath.curveTo(43.8, 88.3, 42.699997, 88.9, 41.199997, 89.5);
generalPath.curveTo(39.699997, 90.1, 38.199997, 90.4, 36.6, 90.4);
generalPath.curveTo(34.6, 90.4, 32.899998, 90.0, 31.499998, 89.200005);
generalPath.curveTo(29.999998, 88.4, 28.999998, 87.200005, 28.199999, 85.700005);
generalPath.curveTo(27.499998, 84.200005, 27.099998, 82.600006, 27.099998, 80.8);
generalPath.curveTo(27.099998, 78.9, 27.499998, 77.200005, 28.3, 75.700005);
generalPath.curveTo(29.099998, 74.200005, 30.3, 73.100006, 31.9, 72.3);
generalPath.curveTo(33.1, 71.700005, 34.6, 71.4, 36.4, 71.4);
generalPath.curveTo(38.7, 71.4, 40.5, 71.9, 41.800003, 72.8);
generalPath.curveTo(43.100002, 73.8, 43.9, 75.100006, 44.300003, 76.8);
generalPath.lineTo(40.600002, 77.5);
generalPath.curveTo(40.300003, 76.6, 39.800003, 75.9, 39.100002, 75.4);
generalPath.curveTo(38.4, 74.9, 37.500004, 74.6, 36.4, 74.6);
generalPath.curveTo(34.800003, 74.6, 33.4, 75.1, 32.5, 76.1);
generalPath.curveTo(31.5, 77.1, 31.0, 78.7, 31.0, 80.7);
generalPath.curveTo(31.0, 82.899994, 31.5, 84.5, 32.5, 85.6);
generalPath.curveTo(33.5, 86.7, 34.8, 87.2, 36.4, 87.2);
generalPath.curveTo(37.2, 87.2, 38.0, 87.0, 38.800003, 86.7);
generalPath.curveTo(39.600006, 86.399994, 40.300003, 86.0, 40.800003, 85.6);
generalPath.lineTo(40.800003, 83.299995);
generalPath.lineTo(36.500004, 83.299995);
generalPath.closePath();
generalPath.moveTo(48.1, 90.1);
generalPath.lineTo(48.1, 71.6);
generalPath.lineTo(51.8, 71.6);
generalPath.lineTo(59.399998, 83.9);
generalPath.lineTo(59.399998, 71.6);
generalPath.lineTo(62.899998, 71.6);
generalPath.lineTo(62.899998, 90.0);
generalPath.lineTo(59.1, 90.0);
generalPath.lineTo(51.6, 78.0);
generalPath.lineTo(51.6, 90.0);
generalPath.lineTo(48.1, 90.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(1.7, 9.5);
generalPath.lineTo(19.0, 22.5);
generalPath.lineTo(20.8, 20.1);
generalPath.lineTo(1.0, 5.3);
generalPath.lineTo(1.0, 9.0);
generalPath.lineTo(1.7, 9.5);
generalPath.closePath();
generalPath.moveTo(37.7, 32.8);
generalPath.lineTo(43.2, 25.699999);
generalPath.lineTo(42.0, 24.8);
generalPath.lineTo(35.4, 19.699999);
generalPath.lineTo(36.100002, 20.199999);
generalPath.lineTo(44.300003, 9.499999);
generalPath.lineTo(44.300003, 4.499999);
generalPath.lineTo(33.600002, 18.5);
generalPath.lineTo(26.500002, 13.0);
generalPath.lineTo(13.600002, 29.6);
generalPath.lineTo(20.700003, 35.0);
generalPath.lineTo(1.1, 59.9);
generalPath.lineTo(1.0, 64.2);
generalPath.lineTo(23.1, 36.799995);
generalPath.lineTo(22.2, 36.099995);
generalPath.lineTo(30.300001, 42.199993);
generalPath.lineTo(35.800003, 35.099995);
generalPath.lineTo(71.200005, 61.699997);
generalPath.lineTo(71.200005, 58.0);
generalPath.lineTo(37.7, 32.8);
generalPath.closePath();
generalPath.moveTo(29.7, 38.3);
generalPath.lineTo(17.800001, 29.3);
generalPath.lineTo(26.900002, 17.5);
generalPath.lineTo(38.800003, 26.5);
generalPath.lineTo(29.700003, 38.3);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.099998474121094, 97.4260025024414), new Point2D.Double(36.099998474121094, 37.78200149536133), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 154, 222, 255),new Color(0, 189, 242, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
        return 0.13099998235702515;
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
		return 0.7420000433921814;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 0.9999999403953552;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_dgn() {
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
       ext_dgn base = new ext_dgn();
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
       ext_dgn base = new ext_dgn();
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
        return ext_dgn::new;
    }
}

