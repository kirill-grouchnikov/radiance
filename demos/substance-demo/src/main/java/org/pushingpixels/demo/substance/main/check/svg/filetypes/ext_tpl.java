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
public class ext_tpl implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.0), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
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
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
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
generalPath.moveTo(15.5f, 23.6f);
generalPath.lineTo(15.5f, 55.6f);
generalPath.curveTo(15.5f, 56.0f, 15.9f, 56.399998f, 16.3f, 56.399998f);
generalPath.lineTo(18.8f, 56.399998f);
generalPath.curveTo(19.199999f, 56.399998f, 19.599998f, 55.999996f, 19.599998f, 55.6f);
generalPath.lineTo(19.599998f, 25.7f);
generalPath.lineTo(49.5f, 25.7f);
generalPath.curveTo(49.9f, 25.7f, 50.3f, 25.300001f, 50.3f, 24.900002f);
generalPath.lineTo(50.3f, 22.400002f);
generalPath.curveTo(50.3f, 22.000002f, 49.899998f, 21.600002f, 49.5f, 21.600002f);
generalPath.lineTo(17.5f, 21.600002f);
generalPath.curveTo(16.3f, 21.600002f, 15.5f, 22.400002f, 15.5f, 23.600002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(81.0999984741211, 43.55699920654297), new Point2D.Double(81.0999984741211, 78.40699768066406), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, 114.0f, 100.0f));
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
generalPath.moveTo(23.7f, 30.6f);
generalPath.lineTo(23.7f, 61.800003f);
generalPath.curveTo(23.7f, 62.200005f, 24.1f, 62.600002f, 24.5f, 62.600002f);
generalPath.lineTo(55.7f, 62.600002f);
generalPath.curveTo(56.100002f, 62.600002f, 56.5f, 62.2f, 56.5f, 61.800003f);
generalPath.lineTo(56.5f, 30.6f);
generalPath.curveTo(56.5f, 30.2f, 56.1f, 29.800001f, 55.7f, 29.800001f);
generalPath.lineTo(24.5f, 29.800001f);
generalPath.curveTo(24.1f, 29.800001f, 23.7f, 30.2f, 23.7f, 30.6f);
generalPath.closePath();
generalPath.moveTo(42.2f, 55.2f);
generalPath.curveTo(42.2f, 54.8f, 42.600002f, 54.4f, 43.0f, 54.4f);
generalPath.lineTo(51.6f, 54.4f);
generalPath.curveTo(52.0f, 54.4f, 52.399998f, 54.800003f, 52.399998f, 55.2f);
generalPath.lineTo(52.399998f, 57.7f);
generalPath.curveTo(52.399998f, 58.100002f, 51.999996f, 58.5f, 51.6f, 58.5f);
generalPath.lineTo(43.0f, 58.5f);
generalPath.curveTo(42.6f, 58.5f, 42.2f, 58.1f, 42.2f, 57.7f);
generalPath.lineTo(42.2f, 55.2f);
generalPath.closePath();
generalPath.moveTo(42.2f, 47.0f);
generalPath.curveTo(42.2f, 46.6f, 42.600002f, 46.2f, 43.0f, 46.2f);
generalPath.lineTo(51.6f, 46.2f);
generalPath.curveTo(52.0f, 46.2f, 52.399998f, 46.600002f, 52.399998f, 47.0f);
generalPath.lineTo(52.399998f, 49.5f);
generalPath.curveTo(52.399998f, 49.9f, 51.999996f, 50.3f, 51.6f, 50.3f);
generalPath.lineTo(43.0f, 50.3f);
generalPath.curveTo(42.6f, 50.3f, 42.2f, 49.899998f, 42.2f, 49.5f);
generalPath.lineTo(42.2f, 47.0f);
generalPath.closePath();
generalPath.moveTo(27.800001f, 55.2f);
generalPath.curveTo(27.800001f, 54.8f, 28.2f, 54.4f, 28.6f, 54.4f);
generalPath.lineTo(37.2f, 54.4f);
generalPath.curveTo(37.600002f, 54.4f, 38.0f, 54.800003f, 38.0f, 55.2f);
generalPath.lineTo(38.0f, 57.7f);
generalPath.curveTo(38.0f, 58.100002f, 37.6f, 58.5f, 37.2f, 58.5f);
generalPath.lineTo(28.6f, 58.5f);
generalPath.curveTo(28.2f, 58.5f, 27.800001f, 58.1f, 27.800001f, 57.7f);
generalPath.lineTo(27.800001f, 55.2f);
generalPath.closePath();
generalPath.moveTo(27.800001f, 47.0f);
generalPath.curveTo(27.800001f, 46.6f, 28.2f, 46.2f, 28.6f, 46.2f);
generalPath.lineTo(37.2f, 46.2f);
generalPath.curveTo(37.600002f, 46.2f, 38.0f, 46.600002f, 38.0f, 47.0f);
generalPath.lineTo(38.0f, 49.5f);
generalPath.curveTo(38.0f, 49.9f, 37.6f, 50.3f, 37.2f, 50.3f);
generalPath.lineTo(28.6f, 50.3f);
generalPath.curveTo(28.2f, 50.3f, 27.800001f, 49.899998f, 27.800001f, 49.5f);
generalPath.lineTo(27.800001f, 47.0f);
generalPath.closePath();
generalPath.moveTo(27.800001f, 34.7f);
generalPath.curveTo(27.800001f, 34.3f, 28.2f, 33.9f, 28.6f, 33.9f);
generalPath.lineTo(51.6f, 33.9f);
generalPath.curveTo(52.0f, 33.9f, 52.399998f, 34.300003f, 52.399998f, 34.7f);
generalPath.lineTo(52.399998f, 41.3f);
generalPath.curveTo(52.399998f, 41.7f, 51.999996f, 42.1f, 51.6f, 42.1f);
generalPath.lineTo(28.599998f, 42.1f);
generalPath.curveTo(28.199999f, 42.1f, 27.8f, 41.699997f, 27.8f, 41.3f);
generalPath.lineTo(27.8f, 34.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(73.9000015258789, 37.400001525878906), new Point2D.Double(73.9000015258789, 70.19999694824219), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, 114.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 74.18699645996094), new Point2D.Double(58.5369987487793, 87.68699645996094), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
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
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.2f, 91.9f);
generalPath.lineTo(16.2f, 75.2f);
generalPath.lineTo(10.300001f, 75.2f);
generalPath.lineTo(10.300001f, 71.799995f);
generalPath.lineTo(26.2f, 71.799995f);
generalPath.lineTo(26.2f, 75.2f);
generalPath.lineTo(20.300001f, 75.2f);
generalPath.lineTo(20.300001f, 91.899994f);
generalPath.lineTo(16.2f, 91.899994f);
generalPath.closePath();
generalPath.moveTo(28.800001f, 91.9f);
generalPath.lineTo(28.800001f, 71.9f);
generalPath.lineTo(35.300003f, 71.9f);
generalPath.curveTo(37.800003f, 71.9f, 39.4f, 72.0f, 40.100002f, 72.200005f);
generalPath.curveTo(41.2f, 72.50001f, 42.2f, 73.200005f, 43.000004f, 74.200005f);
generalPath.curveTo(43.800003f, 75.200005f, 44.200005f, 76.50001f, 44.200005f, 78.100006f);
generalPath.curveTo(44.200005f, 79.3f, 44.000004f, 80.40001f, 43.500004f, 81.200005f);
generalPath.curveTo(43.100002f, 82.00001f, 42.500004f, 82.700005f, 41.800003f, 83.200005f);
generalPath.curveTo(41.100002f, 83.700005f, 40.4f, 84.00001f, 39.700005f, 84.200005f);
generalPath.curveTo(38.700005f, 84.4f, 37.300003f, 84.50001f, 35.500004f, 84.50001f);
generalPath.lineTo(32.900005f, 84.50001f);
generalPath.lineTo(32.900005f, 92.100006f);
generalPath.lineTo(28.800005f, 92.100006f);
generalPath.lineTo(28.800005f, 91.90001f);
generalPath.closePath();
generalPath.moveTo(32.9f, 75.2f);
generalPath.lineTo(32.9f, 80.899994f);
generalPath.lineTo(35.100002f, 80.899994f);
generalPath.curveTo(36.7f, 80.899994f, 37.800003f, 80.799995f, 38.300003f, 80.59999f);
generalPath.curveTo(38.800003f, 80.399994f, 39.300003f, 80.09999f, 39.600002f, 79.59999f);
generalPath.curveTo(39.9f, 79.19999f, 40.100002f, 78.59999f, 40.100002f, 77.99999f);
generalPath.curveTo(40.100002f, 77.299995f, 39.9f, 76.69999f, 39.500004f, 76.19999f);
generalPath.curveTo(39.100002f, 75.69999f, 38.500004f, 75.39999f, 37.900005f, 75.29999f);
generalPath.curveTo(37.400005f, 75.19999f, 36.400005f, 75.19999f, 35.000004f, 75.19999f);
generalPath.lineTo(32.900005f, 75.19999f);
generalPath.closePath();
generalPath.moveTo(47.600002f, 91.899994f);
generalPath.lineTo(47.600002f, 72.0f);
generalPath.lineTo(51.600002f, 72.0f);
generalPath.lineTo(51.600002f, 88.5f);
generalPath.lineTo(61.700005f, 88.5f);
generalPath.lineTo(61.700005f, 91.9f);
generalPath.lineTo(47.6f, 91.9f);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
	private ext_tpl() {
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
       ext_tpl base = new ext_tpl();
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
       ext_tpl base = new ext_tpl();
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
        return ext_tpl::new;
    }
}

