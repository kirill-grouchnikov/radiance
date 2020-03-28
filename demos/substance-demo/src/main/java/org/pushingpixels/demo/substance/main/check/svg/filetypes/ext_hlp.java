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
public class ext_hlp implements ResizableIcon {
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
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(72.4f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.3f, 1.0f);
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
paint = new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(72.4f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.3f, 1.0f);
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
generalPath.moveTo(16.2f, 91.6f);
generalPath.lineTo(16.2f, 76.0f);
generalPath.lineTo(19.400002f, 76.0f);
generalPath.lineTo(19.400002f, 82.1f);
generalPath.lineTo(25.7f, 82.1f);
generalPath.lineTo(25.7f, 76.0f);
generalPath.lineTo(28.900002f, 76.0f);
generalPath.lineTo(28.900002f, 91.6f);
generalPath.lineTo(25.7f, 91.6f);
generalPath.lineTo(25.7f, 84.799995f);
generalPath.lineTo(19.400002f, 84.799995f);
generalPath.lineTo(19.400002f, 91.6f);
generalPath.lineTo(16.2f, 91.6f);
generalPath.closePath();
generalPath.moveTo(32.300003f, 91.6f);
generalPath.lineTo(32.300003f, 76.1f);
generalPath.lineTo(35.500004f, 76.1f);
generalPath.lineTo(35.500004f, 89.0f);
generalPath.lineTo(43.400005f, 89.0f);
generalPath.lineTo(43.400005f, 91.6f);
generalPath.lineTo(32.3f, 91.6f);
generalPath.closePath();
generalPath.moveTo(45.700005f, 91.6f);
generalPath.lineTo(45.700005f, 76.0f);
generalPath.lineTo(50.800003f, 76.0f);
generalPath.curveTo(52.700005f, 76.0f, 54.000004f, 76.1f, 54.600002f, 76.2f);
generalPath.curveTo(55.500004f, 76.399994f, 56.300003f, 76.899994f, 56.9f, 77.7f);
generalPath.curveTo(57.5f, 78.5f, 57.800003f, 79.5f, 57.800003f, 80.7f);
generalPath.curveTo(57.800003f, 81.7f, 57.600002f, 82.5f, 57.300003f, 83.1f);
generalPath.curveTo(57.000004f, 83.7f, 56.500004f, 84.299995f, 56.000004f, 84.6f);
generalPath.curveTo(55.500004f, 84.9f, 54.900005f, 85.2f, 54.300003f, 85.299995f);
generalPath.curveTo(53.500004f, 85.399994f, 52.4f, 85.49999f, 51.000004f, 85.49999f);
generalPath.lineTo(48.900005f, 85.49999f);
generalPath.lineTo(48.900005f, 91.399994f);
generalPath.lineTo(45.700005f, 91.399994f);
generalPath.closePath();
generalPath.moveTo(48.800003f, 78.6f);
generalPath.lineTo(48.800003f, 83.0f);
generalPath.lineTo(50.500004f, 83.0f);
generalPath.curveTo(51.800003f, 83.0f, 52.600002f, 82.9f, 53.000004f, 82.8f);
generalPath.curveTo(53.400005f, 82.600006f, 53.800003f, 82.4f, 54.000004f, 82.0f);
generalPath.curveTo(54.200005f, 81.7f, 54.400005f, 81.2f, 54.400005f, 80.8f);
generalPath.curveTo(54.400005f, 80.200005f, 54.200005f, 79.8f, 53.900005f, 79.4f);
generalPath.curveTo(53.600006f, 79.0f, 53.100006f, 78.8f, 52.600006f, 78.700005f);
generalPath.curveTo(52.200005f, 78.600006f, 51.500008f, 78.600006f, 50.300007f, 78.600006f);
generalPath.lineTo(48.800007f, 78.600006f);
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
generalPath.moveTo(58.5f, 21.5f);
generalPath.lineTo(25.2f, 21.5f);
generalPath.curveTo(20.300001f, 21.5f, 15.400001f, 23.5f, 15.400001f, 29.3f);
generalPath.lineTo(15.400001f, 68.5f);
generalPath.lineTo(50.600002f, 68.5f);
generalPath.lineTo(50.600002f, 29.3f);
generalPath.lineTo(20.4f, 29.3f);
generalPath.curveTo(20.4f, 26.4f, 22.4f, 25.4f, 24.3f, 25.4f);
generalPath.lineTo(54.699997f, 25.4f);
generalPath.lineTo(54.699997f, 64.6f);
generalPath.lineTo(58.6f, 60.699997f);
generalPath.lineTo(58.6f, 21.5f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 68.5), new Point2D.Double(37.0, 21.5), new float[] {0.0f,1.0f}, new Color[] {new Color(170, 148, 0, 255),new Color(86, 74, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(31.5f, 51.0f);
generalPath.curveTo(31.5f, 46.9f, 36.2f, 46.3f, 36.2f, 43.4f);
generalPath.curveTo(36.2f, 42.100002f, 35.0f, 41.100002f, 33.5f, 41.100002f);
generalPath.curveTo(31.9f, 41.100002f, 30.5f, 42.300003f, 30.5f, 42.300003f);
generalPath.lineTo(28.5f, 39.800003f);
generalPath.curveTo(28.5f, 39.800003f, 30.4f, 37.800003f, 33.8f, 37.800003f);
generalPath.curveTo(37.0f, 37.800003f, 39.899998f, 39.800003f, 39.899998f, 43.100002f);
generalPath.curveTo(39.899998f, 47.800003f, 34.999996f, 48.300003f, 34.999996f, 51.300003f);
generalPath.lineTo(34.999996f, 52.4f);
generalPath.lineTo(31.499996f, 52.4f);
generalPath.lineTo(31.499996f, 51.0f);
generalPath.closePath();
generalPath.moveTo(31.5f, 54.8f);
generalPath.lineTo(35.0f, 54.8f);
generalPath.lineTo(35.0f, 58.1f);
generalPath.lineTo(31.5f, 58.1f);
generalPath.lineTo(31.5f, 54.8f);
generalPath.closePath();
shape = generalPath;
paint = new Color(199, 184, 104, 255);
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
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(45.3f, 27.7f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(495.43701171875, 715.27099609375), new Point2D.Double(508.98199462890625, 728.8179931640625), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 234, 134, 255),new Color(134, 114, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
paint = new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(45.3f, 27.7f);
generalPath.lineTo(45.3f, 1.0f);
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
	private ext_hlp() {
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
       ext_hlp base = new ext_hlp();
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
       ext_hlp base = new ext_hlp();
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
        return ext_hlp::new;
    }
}

