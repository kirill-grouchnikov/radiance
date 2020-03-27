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
public class ext_step implements ResizableIcon {
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
generalPath.moveTo(7.9, 84.9);
generalPath.lineTo(11.0, 84.6);
generalPath.curveTo(11.2, 85.6, 11.6, 86.4, 12.1, 86.9);
generalPath.curveTo(12.700001, 87.4, 13.5, 87.6, 14.400001, 87.6);
generalPath.curveTo(15.400001, 87.6, 16.2, 87.4, 16.7, 86.9);
generalPath.curveTo(17.2, 86.5, 17.5, 86.0, 17.5, 85.4);
generalPath.curveTo(17.5, 85.0, 17.4, 84.700005, 17.2, 84.4);
generalPath.curveTo(17.0, 84.1, 16.6, 83.9, 16.0, 83.700005);
generalPath.curveTo(15.6, 83.600006, 14.8, 83.3, 13.4, 83.00001);
generalPath.curveTo(11.7, 82.600006, 10.5, 82.100006, 9.799999, 81.40001);
generalPath.curveTo(8.799999, 80.50001, 8.299999, 79.50001, 8.299999, 78.20001);
generalPath.curveTo(8.299999, 77.40001, 8.499999, 76.60001, 8.999999, 76.000015);
generalPath.curveTo(9.499999, 75.30002, 10.099999, 74.80002, 10.999999, 74.40002);
generalPath.curveTo(11.899999, 74.000015, 12.899999, 73.90002, 14.099998, 73.90002);
generalPath.curveTo(16.099998, 73.90002, 17.599998, 74.30002, 18.599998, 75.20002);
generalPath.curveTo(19.599998, 76.10002, 20.099998, 77.20002, 20.199999, 78.70002);
generalPath.lineTo(17.199999, 79.00002);
generalPath.curveTo(17.099998, 78.20002, 16.8, 77.60002, 16.3, 77.300026);
generalPath.curveTo(15.799999, 76.900024, 15.199999, 76.800026, 14.299999, 76.800026);
generalPath.curveTo(13.4, 76.800026, 12.599999, 77.00002, 12.099999, 77.400024);
generalPath.curveTo(11.799999, 77.60002, 11.599999, 78.00002, 11.599999, 78.400024);
generalPath.curveTo(11.599999, 78.800026, 11.799999, 79.10002, 12.099999, 79.400024);
generalPath.curveTo(12.499999, 79.70003, 13.499999, 80.10002, 15.099999, 80.50002);
generalPath.curveTo(16.699999, 80.900024, 17.8, 81.20002, 18.599998, 81.60002);
generalPath.curveTo(19.399998, 82.00002, 19.899998, 82.50002, 20.399998, 83.20002);
generalPath.curveTo(20.799997, 83.90002, 20.999998, 84.70002, 20.999998, 85.70002);
generalPath.curveTo(20.999998, 86.60002, 20.699999, 87.40002, 20.199999, 88.20002);
generalPath.curveTo(19.699999, 89.00002, 19.0, 89.6, 18.0, 90.0);
generalPath.curveTo(17.1, 90.4, 15.9, 90.6, 14.5, 90.6);
generalPath.curveTo(12.5, 90.6, 10.9, 90.1, 9.9, 89.2);
generalPath.curveTo(8.799999, 88.0, 8.099999, 86.7, 7.8999996, 84.899994);
generalPath.closePath();
generalPath.moveTo(27.199999, 90.1);
generalPath.lineTo(27.199999, 77.0);
generalPath.lineTo(22.5, 77.0);
generalPath.lineTo(22.5, 74.3);
generalPath.lineTo(35.2, 74.3);
generalPath.lineTo(35.2, 77.0);
generalPath.lineTo(30.5, 77.0);
generalPath.lineTo(30.5, 90.1);
generalPath.lineTo(27.2, 90.1);
generalPath.closePath();
generalPath.moveTo(37.199997, 90.1);
generalPath.lineTo(37.199997, 74.3);
generalPath.lineTo(49.0, 74.3);
generalPath.lineTo(49.0, 77.0);
generalPath.lineTo(40.4, 77.0);
generalPath.lineTo(40.4, 80.5);
generalPath.lineTo(48.4, 80.5);
generalPath.lineTo(48.4, 83.2);
generalPath.lineTo(40.4, 83.2);
generalPath.lineTo(40.4, 87.5);
generalPath.lineTo(49.300003, 87.5);
generalPath.lineTo(49.300003, 90.2);
generalPath.lineTo(37.2, 90.2);
generalPath.closePath();
generalPath.moveTo(52.1, 90.1);
generalPath.lineTo(52.1, 74.3);
generalPath.lineTo(57.3, 74.3);
generalPath.curveTo(59.3, 74.3, 60.5, 74.4, 61.1, 74.5);
generalPath.curveTo(62.0, 74.7, 62.8, 75.3, 63.399998, 76.0);
generalPath.curveTo(63.999996, 76.8, 64.299995, 77.8, 64.299995, 79.1);
generalPath.curveTo(64.299995, 80.1, 64.1, 80.9, 63.799995, 81.5);
generalPath.curveTo(63.399994, 82.2, 62.999996, 82.7, 62.399994, 83.1);
generalPath.curveTo(61.899994, 83.5, 61.299995, 83.7, 60.699993, 83.799995);
generalPath.curveTo(59.899994, 83.99999, 58.79999, 83.99999, 57.399994, 83.99999);
generalPath.lineTo(55.299995, 83.99999);
generalPath.lineTo(55.299995, 89.899994);
generalPath.lineTo(52.099995, 89.899994);
generalPath.closePath();
generalPath.moveTo(55.3, 77.0);
generalPath.lineTo(55.3, 81.5);
generalPath.lineTo(57.1, 81.5);
generalPath.curveTo(58.399998, 81.5, 59.199997, 81.4, 59.6, 81.3);
generalPath.curveTo(60.0, 81.100006, 60.399998, 80.9, 60.6, 80.5);
generalPath.curveTo(60.8, 80.1, 61.0, 79.7, 61.0, 79.3);
generalPath.curveTo(61.0, 78.700005, 60.8, 78.3, 60.5, 77.9);
generalPath.curveTo(60.2, 77.5, 59.7, 77.3, 59.2, 77.200005);
generalPath.curveTo(58.8, 77.00001, 58.0, 77.00001, 56.9, 77.00001);
generalPath.lineTo(55.300003, 77.00001);
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
	private ext_step() {
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
       ext_step base = new ext_step();
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
       ext_step base = new ext_step();
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
        return ext_step::new;
    }
}

