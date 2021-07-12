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
public class ext_dwg implements NeonIcon {
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
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.6f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0179998874664307), new Point2D.Double(36.20000076293945, 101.052001953125), new float[] {0.0f,0.002f,0.092f,0.186f,0.286f,0.393f,0.507f,0.633f,0.781f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 166, 233, 255)) : new Color(0, 166, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 167, 233, 255)) : new Color(0, 167, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 178, 236, 255)) : new Color(0, 178, 236, 255)),((colorFilter != null) ? colorFilter.filter(new Color(35, 189, 239, 255)) : new Color(35, 189, 239, 255)),((colorFilter != null) ? colorFilter.filter(new Color(102, 200, 242, 255)) : new Color(102, 200, 242, 255)),((colorFilter != null) ? colorFilter.filter(new Color(137, 211, 245, 255)) : new Color(137, 211, 245, 255)),((colorFilter != null) ? colorFilter.filter(new Color(161, 219, 248, 255)) : new Color(161, 219, 248, 255)),((colorFilter != null) ? colorFilter.filter(new Color(178, 226, 249, 255)) : new Color(178, 226, 249, 255)),((colorFilter != null) ? colorFilter.filter(new Color(188, 230, 251, 255)) : new Color(188, 230, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(191, 231, 251, 255)) : new Color(191, 231, 251, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.6f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 150, 219, 255)) : new Color(0, 150, 219, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.6f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
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
generalPath.moveTo(45.2f, 0.8f);
generalPath.lineTo(72.3f, 27.5f);
generalPath.lineTo(45.2f, 27.5f);
generalPath.lineTo(45.2f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(58.77299880981445, 87.8759994506836), new Point2D.Double(49.74100112915039, 78.84500122070312), new float[] {0.0f,0.03f,0.095f,0.166f,0.241f,0.321f,0.407f,0.503f,0.614f,0.751f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 157, 225, 255)) : new Color(0, 157, 225, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 163, 227, 255)) : new Color(0, 163, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 177, 231, 255)) : new Color(0, 177, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(103, 192, 236, 255)) : new Color(103, 192, 236, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 206, 240, 255)) : new Color(146, 206, 240, 255)),((colorFilter != null) ? colorFilter.filter(new Color(180, 219, 244, 255)) : new Color(180, 219, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(206, 231, 248, 255)) : new Color(206, 231, 248, 255)),((colorFilter != null) ? colorFilter.filter(new Color(227, 240, 251, 255)) : new Color(227, 240, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 248, 253, 255)) : new Color(241, 248, 253, 255)),((colorFilter != null) ? colorFilter.filter(new Color(251, 253, 254, 255)) : new Color(251, 253, 254, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 0.8f);
generalPath.lineTo(72.3f, 27.5f);
generalPath.lineTo(45.2f, 27.5f);
generalPath.lineTo(45.2f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 150, 219, 255)) : new Color(0, 150, 219, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.8f);
generalPath.lineTo(72.3f, 27.5f);
generalPath.lineTo(45.2f, 27.5f);
generalPath.lineTo(45.2f, 0.8f);
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
generalPath.moveTo(6.9f, 71.6f);
generalPath.lineTo(13.8f, 71.6f);
generalPath.curveTo(15.400001f, 71.6f, 16.5f, 71.7f, 17.4f, 72.0f);
generalPath.curveTo(18.5f, 72.3f, 19.4f, 72.9f, 20.199999f, 73.7f);
generalPath.curveTo(20.999998f, 74.5f, 21.599998f, 75.5f, 21.999998f, 76.7f);
generalPath.curveTo(22.399998f, 77.899994f, 22.599998f, 79.299995f, 22.599998f, 81.1f);
generalPath.curveTo(22.599998f, 82.6f, 22.399998f, 83.9f, 21.999998f, 85.0f);
generalPath.curveTo(21.499998f, 86.3f, 20.899998f, 87.4f, 19.999998f, 88.3f);
generalPath.curveTo(19.299997f, 88.9f, 18.499998f, 89.4f, 17.399998f, 89.8f);
generalPath.curveTo(16.599998f, 90.100006f, 15.499998f, 90.200005f, 14.0999975f, 90.200005f);
generalPath.lineTo(6.9f, 90.200005f);
generalPath.lineTo(6.9f, 71.6f);
generalPath.closePath();
generalPath.moveTo(10.7f, 74.7f);
generalPath.lineTo(10.7f, 87.0f);
generalPath.lineTo(13.5f, 87.0f);
generalPath.curveTo(14.6f, 87.0f, 15.3f, 86.9f, 15.8f, 86.8f);
generalPath.curveTo(16.4f, 86.600006f, 16.9f, 86.4f, 17.3f, 86.0f);
generalPath.curveTo(17.699999f, 85.6f, 18.0f, 85.0f, 18.3f, 84.2f);
generalPath.curveTo(18.599998f, 83.399994f, 18.699999f, 82.2f, 18.699999f, 80.799995f);
generalPath.curveTo(18.699999f, 79.399994f, 18.599998f, 78.299995f, 18.3f, 77.49999f);
generalPath.curveTo(18.0f, 76.69999f, 17.699999f, 76.09999f, 17.199999f, 75.69999f);
generalPath.curveTo(16.699999f, 75.29999f, 16.199999f, 74.99999f, 15.499999f, 74.79999f);
generalPath.curveTo(14.999999f, 74.69999f, 13.899999f, 74.59999f, 12.4f, 74.59999f);
generalPath.lineTo(10.7f, 74.59999f);
generalPath.closePath();
generalPath.moveTo(28.400002f, 90.1f);
generalPath.lineTo(24.0f, 71.6f);
generalPath.lineTo(27.9f, 71.6f);
generalPath.lineTo(30.699999f, 84.299995f);
generalPath.lineTo(34.1f, 71.6f);
generalPath.lineTo(38.6f, 71.6f);
generalPath.lineTo(41.899998f, 84.5f);
generalPath.lineTo(44.8f, 71.6f);
generalPath.lineTo(48.6f, 71.6f);
generalPath.lineTo(44.1f, 90.0f);
generalPath.lineTo(40.1f, 90.0f);
generalPath.lineTo(36.399998f, 76.2f);
generalPath.lineTo(32.7f, 90.0f);
generalPath.lineTo(28.400002f, 90.0f);
generalPath.closePath();
generalPath.moveTo(59.100002f, 83.299995f);
generalPath.lineTo(59.100002f, 80.2f);
generalPath.lineTo(67.200005f, 80.2f);
generalPath.lineTo(67.200005f, 87.5f);
generalPath.curveTo(66.4f, 88.3f, 65.3f, 88.9f, 63.800003f, 89.5f);
generalPath.curveTo(62.300003f, 90.1f, 60.800003f, 90.4f, 59.200005f, 90.4f);
generalPath.curveTo(57.200005f, 90.4f, 55.500004f, 90.0f, 54.100006f, 89.200005f);
generalPath.curveTo(52.600006f, 88.4f, 51.600006f, 87.200005f, 50.800007f, 85.700005f);
generalPath.curveTo(50.100006f, 84.200005f, 49.70001f, 82.600006f, 49.70001f, 80.8f);
generalPath.curveTo(49.70001f, 78.9f, 50.10001f, 77.200005f, 50.90001f, 75.700005f);
generalPath.curveTo(51.70001f, 74.200005f, 52.90001f, 73.100006f, 54.500008f, 72.3f);
generalPath.curveTo(55.70001f, 71.700005f, 57.20001f, 71.4f, 59.000008f, 71.4f);
generalPath.curveTo(61.300007f, 71.4f, 63.100006f, 71.9f, 64.40001f, 72.8f);
generalPath.curveTo(65.70001f, 73.8f, 66.50001f, 75.100006f, 66.90001f, 76.8f);
generalPath.lineTo(63.20001f, 77.5f);
generalPath.curveTo(62.90001f, 76.6f, 62.40001f, 75.9f, 61.70001f, 75.4f);
generalPath.curveTo(61.000008f, 74.9f, 60.10001f, 74.6f, 59.000008f, 74.6f);
generalPath.curveTo(57.40001f, 74.6f, 56.000008f, 75.1f, 55.100006f, 76.1f);
generalPath.curveTo(54.100006f, 77.1f, 53.600006f, 78.7f, 53.600006f, 80.7f);
generalPath.curveTo(53.600006f, 82.899994f, 54.100006f, 84.5f, 55.100006f, 85.6f);
generalPath.curveTo(56.100006f, 86.7f, 57.400005f, 87.2f, 59.000008f, 87.2f);
generalPath.curveTo(59.800007f, 87.2f, 60.600006f, 87.0f, 61.40001f, 86.7f);
generalPath.curveTo(62.200012f, 86.399994f, 62.90001f, 86.0f, 63.40001f, 85.6f);
generalPath.lineTo(63.40001f, 83.299995f);
generalPath.lineTo(59.10001f, 83.299995f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(1.7f, 9.5f);
generalPath.lineTo(19.0f, 22.5f);
generalPath.lineTo(20.8f, 20.1f);
generalPath.lineTo(1.0f, 5.3f);
generalPath.lineTo(1.0f, 9.0f);
generalPath.lineTo(1.7f, 9.5f);
generalPath.closePath();
generalPath.moveTo(37.7f, 32.8f);
generalPath.lineTo(43.2f, 25.699999f);
generalPath.lineTo(42.0f, 24.8f);
generalPath.lineTo(35.4f, 19.699999f);
generalPath.lineTo(36.100002f, 20.199999f);
generalPath.lineTo(44.300003f, 9.499999f);
generalPath.lineTo(44.300003f, 4.499999f);
generalPath.lineTo(33.600002f, 18.5f);
generalPath.lineTo(26.500002f, 13.0f);
generalPath.lineTo(13.600002f, 29.6f);
generalPath.lineTo(20.700003f, 35.0f);
generalPath.lineTo(1.1f, 59.9f);
generalPath.lineTo(1.0f, 64.2f);
generalPath.lineTo(23.1f, 36.799995f);
generalPath.lineTo(22.2f, 36.099995f);
generalPath.lineTo(30.300001f, 42.199993f);
generalPath.lineTo(35.800003f, 35.099995f);
generalPath.lineTo(71.200005f, 61.699997f);
generalPath.lineTo(71.200005f, 58.0f);
generalPath.lineTo(37.7f, 32.8f);
generalPath.closePath();
generalPath.moveTo(29.7f, 38.3f);
generalPath.lineTo(17.800001f, 29.3f);
generalPath.lineTo(26.900002f, 17.5f);
generalPath.lineTo(38.800003f, 26.5f);
generalPath.lineTo(29.700003f, 38.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.099998474121094, 97.4260025024414), new Point2D.Double(36.099998474121094, 37.78200149536133), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 154, 222, 255)) : new Color(0, 154, 222, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 189, 242, 255)) : new Color(0, 189, 242, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_dwg() {
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
       ext_dwg base = new ext_dwg();
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
       ext_dwg base = new ext_dwg();
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
        return ext_dwg::new;
    }
}

