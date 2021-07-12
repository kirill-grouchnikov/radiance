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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_chm implements NeonIcon {
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
generalPath.moveTo(22.6f, 85.8f);
generalPath.lineTo(25.7f, 86.8f);
generalPath.curveTo(25.2f, 88.5f, 24.400002f, 89.8f, 23.300001f, 90.600006f);
generalPath.curveTo(22.2f, 91.40001f, 20.800001f, 91.8f, 19.100002f, 91.8f);
generalPath.curveTo(17.000002f, 91.8f, 15.300002f, 91.100006f, 13.9000025f, 89.700005f);
generalPath.curveTo(12.500003f, 88.3f, 11.9000025f, 86.4f, 11.9000025f, 83.9f);
generalPath.curveTo(11.9000025f, 81.3f, 12.600002f, 79.3f, 13.9000025f, 77.9f);
generalPath.curveTo(15.300002f, 76.5f, 17.000002f, 75.700005f, 19.300003f, 75.700005f);
generalPath.curveTo(21.200003f, 75.700005f, 22.800003f, 76.3f, 24.000004f, 77.4f);
generalPath.curveTo(24.700005f, 78.1f, 25.300003f, 79.0f, 25.600004f, 80.3f);
generalPath.lineTo(22.500004f, 81.0f);
generalPath.curveTo(22.300003f, 80.2f, 21.900003f, 79.6f, 21.300003f, 79.1f);
generalPath.curveTo(20.700003f, 78.6f, 20.000004f, 78.4f, 19.100002f, 78.4f);
generalPath.curveTo(17.900002f, 78.4f, 17.000002f, 78.8f, 16.200003f, 79.6f);
generalPath.curveTo(15.400003f, 80.399994f, 15.100002f, 81.799995f, 15.100002f, 83.6f);
generalPath.curveTo(15.100002f, 85.6f, 15.500002f, 87.0f, 16.200003f, 87.799995f);
generalPath.curveTo(16.900003f, 88.6f, 17.900003f, 89.1f, 19.000002f, 89.1f);
generalPath.curveTo(19.800001f, 89.1f, 20.600002f, 88.799995f, 21.200003f, 88.299995f);
generalPath.curveTo(21.900003f, 87.799995f, 22.300003f, 86.99999f, 22.600002f, 85.799995f);
generalPath.closePath();
generalPath.moveTo(28.400002f, 91.600006f);
generalPath.lineTo(28.400002f, 76.0f);
generalPath.lineTo(31.600002f, 76.0f);
generalPath.lineTo(31.600002f, 82.1f);
generalPath.lineTo(37.9f, 82.1f);
generalPath.lineTo(37.9f, 76.0f);
generalPath.lineTo(41.100002f, 76.0f);
generalPath.lineTo(41.100002f, 91.6f);
generalPath.lineTo(37.9f, 91.6f);
generalPath.lineTo(37.9f, 84.799995f);
generalPath.lineTo(31.600002f, 84.799995f);
generalPath.lineTo(31.600002f, 91.6f);
generalPath.lineTo(28.400002f, 91.6f);
generalPath.closePath();
generalPath.moveTo(44.300003f, 91.600006f);
generalPath.lineTo(44.300003f, 76.0f);
generalPath.lineTo(49.100002f, 76.0f);
generalPath.lineTo(52.0f, 86.6f);
generalPath.lineTo(54.8f, 76.0f);
generalPath.lineTo(59.6f, 76.0f);
generalPath.lineTo(59.6f, 91.6f);
generalPath.lineTo(56.6f, 91.6f);
generalPath.lineTo(56.6f, 79.3f);
generalPath.lineTo(53.5f, 91.600006f);
generalPath.lineTo(50.4f, 91.600006f);
generalPath.lineTo(47.300003f, 79.3f);
generalPath.lineTo(47.300003f, 91.600006f);
generalPath.lineTo(44.300003f, 91.600006f);
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
paint = new Color(218, 203, 122, 255);
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
	private ext_chm() {
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
    public static NeonIcon of(int width, int height) {
       ext_chm base = new ext_chm();
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
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_chm base = new ext_chm();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_chm::new;
    }
}

