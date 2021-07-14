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
public class ext_swf implements NeonIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private NeonIcon.ColorFilter colorFilter = null;
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0), new Point2D.Double(36.0, 3.003999948501587), new float[] {0.0f,0.531f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 238, 255)) : new Color(255, 254, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 177, 178, 255)) : new Color(249, 177, 178, 255)),((colorFilter != null) ? colorFilter.filter(new Color(209, 4, 7, 255)) : new Color(209, 4, 7, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(209, 4, 7, 255)) : new Color(209, 4, 7, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
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
generalPath.moveTo(6.1f, 84.6f);
generalPath.lineTo(10.1f, 84.2f);
generalPath.curveTo(10.3f, 85.5f, 10.8f, 86.5f, 11.6f, 87.1f);
generalPath.curveTo(12.3f, 87.7f, 13.3f, 88.0f, 14.6f, 88.0f);
generalPath.curveTo(15.900001f, 88.0f, 16.9f, 87.7f, 17.6f, 87.2f);
generalPath.curveTo(18.300001f, 86.7f, 18.6f, 86.0f, 18.6f, 85.299995f);
generalPath.curveTo(18.6f, 84.799995f, 18.5f, 84.399994f, 18.2f, 84.1f);
generalPath.curveTo(17.900002f, 83.799995f, 17.400002f, 83.5f, 16.7f, 83.2f);
generalPath.curveTo(16.2f, 83.0f, 15.1f, 82.7f, 13.400001f, 82.299995f);
generalPath.curveTo(11.200001f, 81.799995f, 9.700001f, 81.1f, 8.800001f, 80.299995f);
generalPath.curveTo(7.6000013f, 79.2f, 6.900001f, 77.899994f, 6.900001f, 76.299995f);
generalPath.curveTo(6.900001f, 75.299995f, 7.2000012f, 74.299995f, 7.800001f, 73.49999f);
generalPath.curveTo(8.400002f, 72.59999f, 9.200001f, 71.99999f, 10.300001f, 71.49999f);
generalPath.curveTo(11.400002f, 70.99999f, 12.700001f, 70.799995f, 14.300001f, 70.799995f);
generalPath.curveTo(16.800001f, 70.799995f, 18.7f, 71.299995f, 20.0f, 72.399994f);
generalPath.curveTo(21.3f, 73.49999f, 22.0f, 74.899994f, 22.0f, 76.799995f);
generalPath.lineTo(17.9f, 76.99999f);
generalPath.curveTo(17.699999f, 75.99999f, 17.4f, 75.19999f, 16.8f, 74.799995f);
generalPath.curveTo(16.199999f, 74.399994f, 15.4f, 74.1f, 14.199999f, 74.1f);
generalPath.curveTo(12.999999f, 74.1f, 12.099998f, 74.299995f, 11.399999f, 74.799995f);
generalPath.curveTo(10.999999f, 75.1f, 10.799998f, 75.49999f, 10.799998f, 75.99999f);
generalPath.curveTo(10.799998f, 76.49999f, 10.999998f, 76.899994f, 11.399999f, 77.19999f);
generalPath.curveTo(11.899999f, 77.59999f, 13.199999f, 78.09999f, 15.099998f, 78.49999f);
generalPath.curveTo(16.999998f, 78.899994f, 18.499998f, 79.399994f, 19.499998f, 79.899994f);
generalPath.curveTo(20.499998f, 80.399994f, 21.199999f, 81.09999f, 21.699999f, 81.899994f);
generalPath.curveTo(22.199999f, 82.799995f, 22.499998f, 83.799995f, 22.499998f, 85.09999f);
generalPath.curveTo(22.499998f, 86.19999f, 22.199999f, 87.29999f, 21.499998f, 88.29999f);
generalPath.curveTo(20.899998f, 89.29999f, 19.899998f, 89.999985f, 18.799997f, 90.499985f);
generalPath.curveTo(17.699997f, 90.999985f, 16.199997f, 91.19998f, 14.399998f, 91.19998f);
generalPath.curveTo(11.799997f, 91.19998f, 9.899998f, 90.59998f, 8.499998f, 89.499985f);
generalPath.curveTo(7.199998f, 88.499985f, 6.2999983f, 86.79999f, 6.099998f, 84.59998f);
generalPath.closePath();
generalPath.moveTo(28.800001f, 91.1f);
generalPath.lineTo(24.0f, 71.2f);
generalPath.lineTo(28.2f, 71.2f);
generalPath.lineTo(31.2f, 84.799995f);
generalPath.lineTo(34.9f, 71.2f);
generalPath.lineTo(39.7f, 71.2f);
generalPath.lineTo(43.2f, 85.1f);
generalPath.lineTo(46.3f, 71.2f);
generalPath.lineTo(50.399998f, 71.2f);
generalPath.lineTo(45.5f, 91.0f);
generalPath.lineTo(41.2f, 91.0f);
generalPath.lineTo(37.2f, 76.2f);
generalPath.lineTo(33.2f, 91.0f);
generalPath.lineTo(28.800001f, 91.0f);
generalPath.closePath();
generalPath.moveTo(52.5f, 91.1f);
generalPath.lineTo(52.5f, 71.2f);
generalPath.lineTo(66.3f, 71.2f);
generalPath.lineTo(66.3f, 74.6f);
generalPath.lineTo(56.500004f, 74.6f);
generalPath.lineTo(56.500004f, 79.299995f);
generalPath.lineTo(65.0f, 79.299995f);
generalPath.lineTo(65.0f, 82.7f);
generalPath.lineTo(56.6f, 82.7f);
generalPath.lineTo(56.6f, 91.1f);
generalPath.lineTo(52.5f, 91.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -952.3619995117188f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.6f, 974.6f);
generalPath.curveTo(25.3f, 974.6f, 16.199999f, 983.69995f, 16.199999f, 995.0f);
generalPath.curveTo(16.199999f, 1006.3f, 25.3f, 1015.4f, 36.6f, 1015.4f);
generalPath.curveTo(47.899998f, 1015.4f, 57.0f, 1006.2f, 57.0f, 995.0f);
generalPath.curveTo(57.0f, 983.7f, 47.9f, 974.6f, 36.6f, 974.6f);
generalPath.closePath();
generalPath.moveTo(40.5f, 979.39996f);
generalPath.lineTo(37.2f, 991.69995f);
generalPath.lineTo(45.800003f, 991.69995f);
generalPath.lineTo(32.800003f, 1010.49994f);
generalPath.lineTo(36.100002f, 998.19995f);
generalPath.lineTo(27.500002f, 998.19995f);
generalPath.lineTo(40.5f, 979.39996f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.625, 974.6119995117188), new Point2D.Double(36.625, 1015.3619995117188), new float[] {0.118f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(249, 177, 178, 255)) : new Color(249, 177, 178, 255)),((colorFilter != null) ? colorFilter.filter(new Color(209, 4, 7, 255)) : new Color(209, 4, 7, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.178001403808594, 74.15899658203125), new Point2D.Double(58.77199935913086, 87.75299835205078), new float[] {0.0f,0.637f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 238, 255)) : new Color(255, 254, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 177, 178, 255)) : new Color(249, 177, 178, 255)),((colorFilter != null) ? colorFilter.filter(new Color(209, 4, 7, 255)) : new Color(209, 4, 7, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(209, 4, 7, 255)) : new Color(209, 4, 7, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
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
        return 0.12799999117851257;
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
		return 0.7450000047683716;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_swf() {
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
    public boolean supportsColorFilter() {
        return true;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
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
       ext_swf base = new ext_swf();
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
       ext_swf base = new ext_swf();
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
        return ext_swf::new;
    }
}

