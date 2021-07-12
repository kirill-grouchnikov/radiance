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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_ds_store implements NeonIcon {
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 71.0), new Point2D.Double(36.0, 169.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 170.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0620002746582, 142.2100067138672), new Point2D.Double(58.560001373291016, 155.7100067138672), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 170.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(29.9f, 66.4f);
generalPath.lineTo(43.1f, 66.4f);
generalPath.lineTo(43.1f, 72.1f);
generalPath.lineTo(29.9f, 72.1f);
generalPath.lineTo(29.9f, 66.4f);
generalPath.closePath();
shape = generalPath;
paint = new Color(237, 240, 243, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(60.3f, 33.6f);
generalPath.curveTo(59.5f, 32.8f, 58.5f, 32.399998f, 57.399998f, 32.399998f);
generalPath.lineTo(15.7f, 32.399998f);
generalPath.curveTo(14.599999f, 32.399998f, 13.6f, 32.8f, 12.799999f, 33.6f);
generalPath.curveTo(11.999999f, 34.399998f, 11.599999f, 35.399998f, 11.599999f, 36.5f);
generalPath.lineTo(11.599999f, 64.8f);
generalPath.curveTo(11.599999f, 65.9f, 11.999999f, 66.9f, 12.799999f, 67.700005f);
generalPath.curveTo(13.599999f, 68.50001f, 14.599999f, 68.9f, 15.699999f, 68.9f);
generalPath.lineTo(29.899998f, 68.9f);
generalPath.curveTo(29.899998f, 69.6f, 29.799997f, 70.200005f, 29.499998f, 70.9f);
generalPath.curveTo(29.199999f, 71.6f, 28.899998f, 72.200005f, 28.699999f, 72.700005f);
generalPath.curveTo(28.4f, 73.200005f, 28.3f, 73.600006f, 28.3f, 73.8f);
generalPath.curveTo(28.3f, 74.3f, 28.5f, 74.600006f, 28.8f, 75.0f);
generalPath.curveTo(29.099998f, 75.3f, 29.5f, 75.5f, 30.0f, 75.5f);
generalPath.lineTo(43.3f, 75.5f);
generalPath.curveTo(43.8f, 75.5f, 44.1f, 75.3f, 44.5f, 75.0f);
generalPath.curveTo(44.8f, 74.7f, 45.0f, 74.3f, 45.0f, 73.8f);
generalPath.curveTo(45.0f, 73.600006f, 44.9f, 73.200005f, 44.6f, 72.700005f);
generalPath.curveTo(44.3f, 72.200005f, 44.0f, 71.600006f, 43.8f, 70.9f);
generalPath.curveTo(43.5f, 70.200005f, 43.399998f, 69.5f, 43.399998f, 68.9f);
generalPath.lineTo(57.6f, 68.9f);
generalPath.curveTo(58.699997f, 68.9f, 59.699997f, 68.5f, 60.5f, 67.700005f);
generalPath.curveTo(61.3f, 66.9f, 61.7f, 65.9f, 61.7f, 64.8f);
generalPath.lineTo(61.7f, 36.6f);
generalPath.curveTo(61.5f, 35.399998f, 61.100002f, 34.5f, 60.3f, 33.6f);
generalPath.closePath();
generalPath.moveTo(58.2f, 58.3f);
generalPath.curveTo(58.2f, 58.5f, 58.100002f, 58.7f, 58.0f, 58.899998f);
generalPath.curveTo(57.8f, 59.1f, 57.6f, 59.1f, 57.4f, 59.1f);
generalPath.lineTo(15.7f, 59.1f);
generalPath.curveTo(15.5f, 59.1f, 15.3f, 59.0f, 15.099999f, 58.899998f);
generalPath.curveTo(14.9f, 58.699997f, 14.9f, 58.499996f, 14.9f, 58.3f);
generalPath.lineTo(14.9f, 36.6f);
generalPath.curveTo(14.9f, 36.399998f, 15.0f, 36.199997f, 15.099999f, 36.0f);
generalPath.curveTo(15.299999f, 35.8f, 15.499999f, 35.8f, 15.7f, 35.8f);
generalPath.lineTo(57.4f, 35.8f);
generalPath.curveTo(57.600002f, 35.8f, 57.800003f, 35.899998f, 58.0f, 36.0f);
generalPath.curveTo(58.2f, 36.2f, 58.2f, 36.4f, 58.2f, 36.6f);
generalPath.lineTo(58.2f, 58.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.650001525878906, 5.752999782562256), new Point2D.Double(36.650001525878906, -37.58100128173828), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 70.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.6f, 46.1f);
generalPath.lineTo(43.8f, 45.6f);
generalPath.curveTo(43.6f, 44.8f, 43.3f, 44.1f, 42.899998f, 43.5f);
generalPath.lineTo(43.8f, 41.9f);
generalPath.curveTo(43.899998f, 41.7f, 43.899998f, 41.5f, 43.7f, 41.4f);
generalPath.lineTo(42.4f, 40.100002f);
generalPath.curveTo(42.2f, 39.9f, 42.0f, 39.9f, 41.9f, 40.000004f);
generalPath.lineTo(40.4f, 41.000004f);
generalPath.curveTo(39.800003f, 40.600002f, 39.0f, 40.300003f, 38.300003f, 40.100002f);
generalPath.lineTo(37.800003f, 38.300003f);
generalPath.curveTo(37.700005f, 38.100002f, 37.600002f, 38.000004f, 37.4f, 38.000004f);
generalPath.lineTo(35.600002f, 38.000004f);
generalPath.curveTo(35.4f, 38.000004f, 35.2f, 38.200005f, 35.2f, 38.300003f);
generalPath.lineTo(34.7f, 40.000004f);
generalPath.curveTo(33.9f, 40.200005f, 33.2f, 40.500004f, 32.600002f, 40.900005f);
generalPath.lineTo(31.0f, 40.0f);
generalPath.curveTo(30.8f, 39.9f, 30.6f, 39.9f, 30.5f, 40.1f);
generalPath.lineTo(29.0f, 41.4f);
generalPath.curveTo(28.8f, 41.600002f, 28.8f, 41.800003f, 28.9f, 41.9f);
generalPath.lineTo(29.8f, 43.5f);
generalPath.curveTo(29.4f, 44.1f, 29.099998f, 44.9f, 28.9f, 45.6f);
generalPath.lineTo(27.1f, 46.1f);
generalPath.curveTo(26.9f, 46.199997f, 26.800001f, 46.3f, 26.800001f, 46.5f);
generalPath.lineTo(26.800001f, 48.3f);
generalPath.curveTo(26.800001f, 48.5f, 27.000002f, 48.7f, 27.1f, 48.7f);
generalPath.lineTo(28.9f, 49.2f);
generalPath.curveTo(29.1f, 50.0f, 29.4f, 50.7f, 29.8f, 51.3f);
generalPath.lineTo(29.0f, 53.0f);
generalPath.curveTo(28.9f, 53.2f, 28.9f, 53.4f, 29.1f, 53.5f);
generalPath.lineTo(30.4f, 54.8f);
generalPath.curveTo(30.6f, 55.0f, 30.8f, 55.0f, 30.9f, 54.899998f);
generalPath.lineTo(32.5f, 53.999996f);
generalPath.curveTo(33.1f, 54.399998f, 33.9f, 54.699997f, 34.6f, 54.899998f);
generalPath.lineTo(35.1f, 56.699997f);
generalPath.curveTo(35.199997f, 56.899998f, 35.3f, 56.999996f, 35.5f, 56.999996f);
generalPath.lineTo(37.3f, 56.999996f);
generalPath.curveTo(37.5f, 56.999996f, 37.7f, 56.799995f, 37.7f, 56.699997f);
generalPath.lineTo(38.2f, 54.899998f);
generalPath.curveTo(39.0f, 54.699997f, 39.7f, 54.399998f, 40.3f, 53.999996f);
generalPath.lineTo(41.899998f, 54.899998f);
generalPath.curveTo(42.1f, 54.999996f, 42.3f, 54.999996f, 42.399998f, 54.8f);
generalPath.lineTo(43.699997f, 53.5f);
generalPath.curveTo(43.899998f, 53.3f, 43.899998f, 53.1f, 43.799995f, 53.0f);
generalPath.lineTo(42.899994f, 51.4f);
generalPath.curveTo(43.299995f, 50.800003f, 43.599995f, 50.0f, 43.799995f, 49.300003f);
generalPath.lineTo(45.599995f, 48.800003f);
generalPath.curveTo(45.799995f, 48.700005f, 45.899994f, 48.600002f, 45.899994f, 48.4f);
generalPath.lineTo(45.899994f, 46.5f);
generalPath.curveTo(45.999992f, 46.4f, 45.899994f, 46.2f, 45.599995f, 46.1f);
generalPath.closePath();
generalPath.moveTo(36.399998f, 50.899998f);
generalPath.curveTo(34.499996f, 50.899998f, 32.999996f, 49.399998f, 32.999996f, 47.499996f);
generalPath.curveTo(32.999996f, 45.599995f, 34.499996f, 44.099995f, 36.399998f, 44.099995f);
generalPath.curveTo(38.3f, 44.099995f, 39.8f, 45.599995f, 39.8f, 47.499996f);
generalPath.curveTo(39.8f, 49.399998f, 38.3f, 50.899998f, 36.399998f, 50.899998f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.36899948120117, 43.0), new Point2D.Double(36.36899948120117, 62.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
	private ext_ds_store() {
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
       ext_ds_store base = new ext_ds_store();
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
       ext_ds_store base = new ext_ds_store();
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
        return ext_ds_store::new;
    }
}

