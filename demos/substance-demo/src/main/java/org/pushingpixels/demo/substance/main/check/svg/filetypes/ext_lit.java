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
public class ext_lit implements ResizableIcon {
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
generalPath.moveTo(21.4, 91.6);
generalPath.lineTo(21.4, 76.1);
generalPath.lineTo(24.6, 76.1);
generalPath.lineTo(24.6, 89.0);
generalPath.lineTo(32.5, 89.0);
generalPath.lineTo(32.5, 91.6);
generalPath.lineTo(21.4, 91.6);
generalPath.closePath();
generalPath.moveTo(34.7, 91.6);
generalPath.lineTo(34.7, 76.0);
generalPath.lineTo(37.9, 76.0);
generalPath.lineTo(37.9, 91.6);
generalPath.lineTo(34.7, 91.6);
generalPath.closePath();
generalPath.moveTo(44.5, 91.6);
generalPath.lineTo(44.5, 78.6);
generalPath.lineTo(39.8, 78.6);
generalPath.lineTo(39.8, 76.0);
generalPath.lineTo(52.4, 76.0);
generalPath.lineTo(52.4, 78.6);
generalPath.lineTo(47.7, 78.6);
generalPath.lineTo(47.7, 91.5);
generalPath.lineTo(44.5, 91.5);
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
generalPath.moveTo(62.7, 34.5);
generalPath.curveTo(62.4, 33.8, 62.0, 33.3, 61.4, 32.8);
generalPath.curveTo(61.300003, 33.3, 61.100002, 33.899998, 60.800003, 34.399998);
generalPath.lineTo(44.4, 59.6);
generalPath.curveTo(43.800003, 60.5, 42.4, 60.8, 41.4, 60.5);
generalPath.lineTo(15.300001, 53.2);
generalPath.curveTo(13.700001, 52.8, 11.900002, 51.9, 11.800001, 50.100002);
generalPath.curveTo(11.700001, 49.4, 11.800001, 49.2, 12.200001, 48.9);
generalPath.curveTo(12.6, 48.600002, 13.000001, 48.7, 13.400001, 48.800003);
generalPath.lineTo(38.0, 55.6);
generalPath.curveTo(41.6, 56.6, 42.6, 55.899998, 45.2, 51.899998);
generalPath.lineTo(60.2, 28.799997);
generalPath.curveTo(61.0, 27.599997, 61.2, 26.199997, 60.7, 24.999998);
generalPath.curveTo(60.3, 23.799997, 59.3, 22.899998, 57.9, 22.499998);
generalPath.lineTo(36.4, 16.499998);
generalPath.curveTo(35.9, 16.399998, 35.4, 16.399998, 34.9, 16.299997);
generalPath.lineTo(35.0, 16.199997);
generalPath.curveTo(31.7, 14.199997, 30.4, 17.999996, 28.7, 19.399998);
generalPath.curveTo(28.1, 19.899998, 27.2, 20.299997, 27.0, 20.799997);
generalPath.curveTo(26.8, 21.299997, 26.9, 21.799997, 26.7, 22.299997);
generalPath.curveTo(26.1, 23.699997, 24.2, 26.099997, 23.300001, 26.799997);
generalPath.curveTo(22.7, 27.199997, 22.000002, 27.299997, 21.6, 27.899998);
generalPath.curveTo(21.300001, 28.299997, 21.4, 28.999998, 21.2, 29.599998);
generalPath.curveTo(20.7, 30.899998, 19.0, 33.1, 17.800001, 34.199997);
generalPath.curveTo(17.400002, 34.6, 16.7, 34.899998, 16.400002, 35.399998);
generalPath.curveTo(16.100002, 35.8, 16.2, 36.499996, 15.900002, 36.999996);
generalPath.curveTo(15.200002, 38.399998, 13.600001, 40.399998, 12.300001, 41.499996);
generalPath.curveTo(11.600001, 42.099995, 10.900002, 42.399998, 10.600001, 43.099995);
generalPath.curveTo(10.400002, 43.399994, 10.600001, 43.899994, 10.400002, 44.299995);
generalPath.curveTo(10.100001, 44.999996, 9.800001, 45.499996, 9.600001, 45.999996);
generalPath.curveTo(8.900002, 46.999996, 8.500001, 48.199997, 8.600001, 49.599995);
generalPath.curveTo(8.800001, 52.799995, 11.300001, 55.899994, 14.100001, 56.699993);
generalPath.lineTo(40.3, 64.0);
generalPath.curveTo(42.7, 64.7, 45.8, 63.5, 47.1, 61.4);
generalPath.lineTo(62.1, 38.300003);
generalPath.curveTo(62.899998, 37.000004, 63.1, 35.700005, 62.699997, 34.500004);
generalPath.closePath();
generalPath.moveTo(32.5, 26.2);
generalPath.lineTo(33.6, 24.6);
generalPath.curveTo(33.899998, 24.1, 34.6, 23.9, 35.0, 24.0);
generalPath.lineTo(52.2, 28.8);
generalPath.curveTo(52.7, 28.9, 52.9, 29.4, 52.600002, 29.9);
generalPath.lineTo(51.500004, 31.5);
generalPath.curveTo(51.200005, 32.0, 50.500004, 32.2, 50.100002, 32.1);
generalPath.lineTo(32.9, 27.3);
generalPath.curveTo(32.4, 27.099998, 32.2, 26.599998, 32.5, 26.199999);
generalPath.closePath();
generalPath.moveTo(28.1, 32.600002);
generalPath.lineTo(29.2, 31.000002);
generalPath.curveTo(29.5, 30.500002, 30.2, 30.300001, 30.6, 30.400002);
generalPath.lineTo(47.800003, 35.2);
generalPath.curveTo(48.300003, 35.3, 48.500004, 35.8, 48.200005, 36.3);
generalPath.lineTo(47.100006, 37.899998);
generalPath.curveTo(46.800007, 38.399998, 46.100006, 38.6, 45.700005, 38.499996);
generalPath.lineTo(28.500004, 33.699997);
generalPath.curveTo(28.000004, 33.6, 27.800003, 33.1, 28.100004, 32.6);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(305.1709899902344, 859.4439697265625), new Point2D.Double(305.1709899902344, 814.6840209960938), new float[] {0.0f,1.0f}, new Color[] {new Color(170, 148, 0, 255),new Color(86, 74, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9622655009227857f, 0.27211230353260446f, 0.27211230353260446f, -0.9622655009227857f, -485.17203323389003f, 762.9451758873668f));
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
paint = new LinearGradientPaint(new Point2D.Double(495.43701171875, 715.27099609375), new Point2D.Double(508.98199462890625, 728.8179931640625), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 234, 134, 255),new Color(134, 114, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
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
	private ext_lit() {
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
       ext_lit base = new ext_lit();
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
       ext_lit base = new ext_lit();
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
        return ext_lit::new;
    }
}

