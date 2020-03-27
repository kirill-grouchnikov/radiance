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
public class ext_pot implements ResizableIcon {
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
generalPath.moveTo(45.3, 1.0);
generalPath.lineTo(72.4, 27.7);
generalPath.lineTo(72.4, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.3, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(486.3110046386719, 644.1119995117188), new Point2D.Double(486.30999755859375, 742.0850219726562), new float[] {0.0f,0.005f,1.0f}, new Color[] {new Color(116, 45, 45, 255),new Color(130, 113, 0, 255),new Color(255, 238, 145, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
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
generalPath.moveTo(45.3, 1.0);
generalPath.lineTo(72.4, 27.7);
generalPath.lineTo(72.4, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.3, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3, 1.0);
generalPath.lineTo(72.4, 27.7);
generalPath.lineTo(72.4, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.3, 1.0);
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
generalPath.moveTo(15.2, 91.6);
generalPath.lineTo(15.2, 76.0);
generalPath.lineTo(20.3, 76.0);
generalPath.curveTo(22.199999, 76.0, 23.5, 76.1, 24.099998, 76.2);
generalPath.curveTo(24.999998, 76.399994, 25.8, 76.899994, 26.399998, 77.7);
generalPath.curveTo(26.999996, 78.5, 27.299997, 79.5, 27.299997, 80.7);
generalPath.curveTo(27.299997, 81.7, 27.099997, 82.5, 26.799997, 83.1);
generalPath.curveTo(26.499998, 83.7, 25.999998, 84.299995, 25.499998, 84.6);
generalPath.curveTo(24.999998, 85.0, 24.399998, 85.2, 23.799997, 85.299995);
generalPath.curveTo(22.999998, 85.399994, 21.899998, 85.49999, 20.499998, 85.49999);
generalPath.lineTo(18.399998, 85.49999);
generalPath.lineTo(18.399998, 91.399994);
generalPath.lineTo(15.199998, 91.399994);
generalPath.closePath();
generalPath.moveTo(18.3, 78.6);
generalPath.lineTo(18.3, 83.0);
generalPath.lineTo(20.0, 83.0);
generalPath.curveTo(21.3, 83.0, 22.1, 82.9, 22.5, 82.8);
generalPath.curveTo(22.9, 82.600006, 23.3, 82.4, 23.5, 82.0);
generalPath.curveTo(23.7, 81.7, 23.9, 81.2, 23.9, 80.8);
generalPath.curveTo(23.9, 80.200005, 23.699999, 79.8, 23.4, 79.4);
generalPath.curveTo(23.1, 79.0, 22.6, 78.8, 22.1, 78.700005);
generalPath.curveTo(21.7, 78.600006, 21.0, 78.600006, 19.800001, 78.600006);
generalPath.lineTo(18.300001, 78.600006);
generalPath.closePath();
generalPath.moveTo(29.199999, 83.9);
generalPath.curveTo(29.199999, 82.3, 29.4, 81.0, 29.9, 79.9);
generalPath.curveTo(30.3, 79.1, 30.699999, 78.4, 31.4, 77.8);
generalPath.curveTo(32.1, 77.200005, 32.7, 76.700005, 33.4, 76.4);
generalPath.curveTo(34.4, 76.0, 35.5, 75.8, 36.800003, 75.8);
generalPath.curveTo(39.100002, 75.8, 41.000004, 76.5, 42.4, 77.9);
generalPath.curveTo(43.800003, 79.3, 44.5, 81.3, 44.5, 83.8);
generalPath.curveTo(44.5, 86.3, 43.8, 88.3, 42.4, 89.700005);
generalPath.curveTo(41.000004, 91.100006, 39.2, 91.8, 36.800003, 91.8);
generalPath.curveTo(34.4, 91.8, 32.600002, 91.100006, 31.200003, 89.700005);
generalPath.curveTo(29.900003, 88.3, 29.200003, 86.4, 29.200003, 83.9);
generalPath.closePath();
generalPath.moveTo(32.5, 83.8);
generalPath.curveTo(32.5, 85.600006, 32.9, 86.9, 33.7, 87.8);
generalPath.curveTo(34.5, 88.700005, 35.600002, 89.200005, 36.8, 89.200005);
generalPath.curveTo(37.999996, 89.200005, 39.1, 88.700005, 39.899998, 87.8);
generalPath.curveTo(40.699997, 86.9, 41.1, 85.5, 41.1, 83.700005);
generalPath.curveTo(41.1, 81.9, 40.699997, 80.600006, 39.899998, 79.700005);
generalPath.curveTo(39.1, 78.8, 38.1, 78.4, 36.699997, 78.4);
generalPath.curveTo(35.299995, 78.4, 34.299995, 78.8, 33.499996, 79.700005);
generalPath.curveTo(32.899998, 80.600006, 32.499996, 82.00001, 32.499996, 83.8);
generalPath.closePath();
generalPath.moveTo(50.6, 91.600006);
generalPath.lineTo(50.6, 78.600006);
generalPath.lineTo(45.899998, 78.600006);
generalPath.lineTo(45.899998, 76.0);
generalPath.lineTo(58.5, 76.0);
generalPath.lineTo(58.5, 78.6);
generalPath.lineTo(53.8, 78.6);
generalPath.lineTo(53.8, 91.5);
generalPath.lineTo(50.6, 91.5);
generalPath.closePath();
shape = generalPath;
paint = new Color(254, 254, 254, 255);
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
generalPath.moveTo(45.3, 1.0);
generalPath.lineTo(72.4, 27.7);
generalPath.lineTo(45.3, 27.7);
generalPath.lineTo(45.3, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(495.43701171875, 715.27099609375), new Point2D.Double(508.98199462890625, 728.8179931640625), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 234, 134, 255),new Color(134, 114, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
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
generalPath.moveTo(45.3, 1.0);
generalPath.lineTo(72.4, 27.7);
generalPath.lineTo(45.3, 27.7);
generalPath.lineTo(45.3, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3, 1.0);
generalPath.lineTo(72.4, 27.7);
generalPath.lineTo(45.3, 27.7);
generalPath.lineTo(45.3, 1.0);
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
generalPath.moveTo(34.9, 48.6);
generalPath.curveTo(31.400002, 45.199997, 28.300001, 42.1, 26.500002, 35.199997);
generalPath.lineTo(38.800003, 35.199997);
generalPath.lineTo(38.800003, 30.0);
generalPath.lineTo(26.6, 30.0);
generalPath.lineTo(26.6, 23.1);
generalPath.lineTo(21.3, 23.1);
generalPath.lineTo(21.3, 30.1);
generalPath.lineTo(9.0, 30.1);
generalPath.lineTo(9.0, 35.3);
generalPath.lineTo(21.6, 35.3);
generalPath.curveTo(21.6, 35.3, 21.5, 36.3, 21.300001, 37.1);
generalPath.curveTo(19.6, 43.9, 17.5, 48.3, 9.0, 52.5);
generalPath.lineTo(10.8, 57.7);
generalPath.curveTo(18.8, 53.4, 23.0, 48.1, 24.900002, 42.1);
generalPath.curveTo(26.7, 46.6, 29.7, 50.3, 33.100002, 53.699997);
generalPath.lineTo(34.9, 48.6);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(23.924999237060547, 57.72800064086914), new Point2D.Double(23.924999237060547, 23.100000381469727), new float[] {0.0f,1.0f}, new Color[] {new Color(170, 148, 0, 255),new Color(86, 74, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(23.881999969482422, 58.266998291015625), new Point2D.Double(23.881999969482422, 22.725000381469727), new float[] {0.0f,1.0f}, new Color[] {new Color(170, 148, 0, 255),new Color(86, 74, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(34.9, 48.6);
generalPath.curveTo(31.400002, 45.199997, 28.300001, 42.1, 26.500002, 35.199997);
generalPath.lineTo(38.800003, 35.199997);
generalPath.lineTo(38.800003, 30.0);
generalPath.lineTo(26.6, 30.0);
generalPath.lineTo(26.6, 23.1);
generalPath.lineTo(21.3, 23.1);
generalPath.lineTo(21.3, 30.1);
generalPath.lineTo(9.0, 30.1);
generalPath.lineTo(9.0, 35.3);
generalPath.lineTo(21.6, 35.3);
generalPath.curveTo(21.6, 35.3, 21.5, 36.3, 21.300001, 37.1);
generalPath.curveTo(19.6, 43.9, 17.5, 48.3, 9.0, 52.5);
generalPath.lineTo(10.8, 57.7);
generalPath.curveTo(18.8, 53.4, 23.0, 48.1, 24.900002, 42.1);
generalPath.curveTo(26.7, 46.6, 29.7, 50.3, 33.100002, 53.699997);
generalPath.lineTo(34.9, 48.6);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.2, 31.7);
generalPath.lineTo(44.2, 31.7);
generalPath.lineTo(31.8, 66.4);
generalPath.lineTo(37.1, 66.4);
generalPath.lineTo(40.6, 56.0);
generalPath.lineTo(54.699997, 56.0);
generalPath.lineTo(58.199997, 66.4);
generalPath.lineTo(63.499996, 66.4);
generalPath.lineTo(51.2, 31.7);
generalPath.closePath();
generalPath.moveTo(42.4, 50.800003);
generalPath.lineTo(47.7, 37.0);
generalPath.lineTo(53.0, 50.9);
generalPath.lineTo(42.4, 50.800003);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(47.65299987792969, 66.36499786376953), new Point2D.Double(47.65299987792969, 31.736000061035156), new float[] {0.0f,1.0f}, new Color[] {new Color(170, 148, 0, 255),new Color(86, 74, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(47.65299987792969, 66.73999786376953), new Point2D.Double(47.65299987792969, 31.361000061035156), new float[] {0.0f,1.0f}, new Color[] {new Color(170, 148, 0, 255),new Color(86, 74, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.2, 31.7);
generalPath.lineTo(44.2, 31.7);
generalPath.lineTo(31.8, 66.4);
generalPath.lineTo(37.1, 66.4);
generalPath.lineTo(40.6, 56.0);
generalPath.lineTo(54.699997, 56.0);
generalPath.lineTo(58.199997, 66.4);
generalPath.lineTo(63.499996, 66.4);
generalPath.lineTo(51.2, 31.7);
generalPath.closePath();
generalPath.moveTo(42.4, 50.800003);
generalPath.lineTo(47.7, 37.0);
generalPath.lineTo(53.0, 50.9);
generalPath.lineTo(42.4, 50.800003);
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
		return 0.7437919974327087;
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
	private ext_pot() {
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
       ext_pot base = new ext_pot();
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
       ext_pot base = new ext_pot();
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
        return ext_pot::new;
    }
}

