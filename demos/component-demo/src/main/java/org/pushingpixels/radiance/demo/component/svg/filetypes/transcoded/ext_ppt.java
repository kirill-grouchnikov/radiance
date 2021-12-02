package org.pushingpixels.radiance.demo.component.svg.filetypes.transcoded;

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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class ext_ppt implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(72.0f, 99.299995f);
generalPath.lineTo(0.0f, 99.299995f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 0.7670000195503235), new Point2D.Double(36.0, 99.25), new float[] {0.0f,0.032f,0.162f,0.305f,0.468f,0.666f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(203, 85, 40, 255)) : new Color(203, 85, 40, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 91, 39, 255)) : new Color(207, 91, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(219, 112, 38, 255)) : new Color(219, 112, 38, 255)),((colorFilter != null) ? colorFilter.filter(new Color(230, 128, 37, 255)) : new Color(230, 128, 37, 255)),((colorFilter != null) ? colorFilter.filter(new Color(238, 140, 35, 255)) : new Color(238, 140, 35, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 147, 34, 255)) : new Color(244, 147, 34, 255)),((colorFilter != null) ? colorFilter.filter(new Color(246, 150, 34, 255)) : new Color(246, 150, 34, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(72.0f, 99.299995f);
generalPath.lineTo(0.0f, 99.299995f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(193, 81, 39, 255)) : new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(72.0f, 99.299995f);
generalPath.lineTo(0.0f, 99.299995f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(10.6f, 91.3f);
generalPath.lineTo(10.6f, 71.3f);
generalPath.lineTo(17.1f, 71.3f);
generalPath.curveTo(19.6f, 71.3f, 21.2f, 71.4f, 21.900002f, 71.600006f);
generalPath.curveTo(23.000002f, 71.90001f, 24.000002f, 72.50001f, 24.800001f, 73.600006f);
generalPath.curveTo(25.6f, 74.600006f, 26.000002f, 75.90001f, 26.000002f, 77.50001f);
generalPath.curveTo(26.000002f, 78.700005f, 25.800001f, 79.80001f, 25.300001f, 80.600006f);
generalPath.curveTo(24.900002f, 81.40001f, 24.300001f, 82.100006f, 23.6f, 82.600006f);
generalPath.curveTo(22.9f, 83.100006f, 22.2f, 83.40001f, 21.5f, 83.50001f);
generalPath.curveTo(20.5f, 83.700005f, 19.1f, 83.80001f, 17.3f, 83.80001f);
generalPath.lineTo(14.699999f, 83.80001f);
generalPath.lineTo(14.699999f, 91.30001f);
generalPath.lineTo(10.599998f, 91.30001f);
generalPath.closePath();
generalPath.moveTo(14.6f, 74.700005f);
generalPath.lineTo(14.6f, 80.4f);
generalPath.lineTo(16.800001f, 80.4f);
generalPath.curveTo(18.400002f, 80.4f, 19.500002f, 80.3f, 20.000002f, 80.1f);
generalPath.curveTo(20.500002f, 79.9f, 21.000002f, 79.6f, 21.300001f, 79.1f);
generalPath.curveTo(21.6f, 78.7f, 21.800001f, 78.1f, 21.800001f, 77.5f);
generalPath.curveTo(21.800001f, 76.8f, 21.6f, 76.2f, 21.2f, 75.7f);
generalPath.curveTo(20.800001f, 75.2f, 20.2f, 74.899994f, 19.6f, 74.799995f);
generalPath.curveTo(19.1f, 74.7f, 18.1f, 74.7f, 16.7f, 74.7f);
generalPath.lineTo(14.6f, 74.7f);
generalPath.closePath();
generalPath.moveTo(29.3f, 91.3f);
generalPath.lineTo(29.3f, 71.3f);
generalPath.lineTo(35.8f, 71.3f);
generalPath.curveTo(38.3f, 71.3f, 39.899998f, 71.4f, 40.6f, 71.600006f);
generalPath.curveTo(41.699997f, 71.90001f, 42.699997f, 72.50001f, 43.5f, 73.600006f);
generalPath.curveTo(44.3f, 74.600006f, 44.7f, 75.90001f, 44.7f, 77.50001f);
generalPath.curveTo(44.7f, 78.700005f, 44.5f, 79.80001f, 44.0f, 80.600006f);
generalPath.curveTo(43.6f, 81.40001f, 43.0f, 82.100006f, 42.3f, 82.600006f);
generalPath.curveTo(41.6f, 83.100006f, 40.899998f, 83.40001f, 40.2f, 83.50001f);
generalPath.curveTo(39.2f, 83.700005f, 37.8f, 83.80001f, 36.0f, 83.80001f);
generalPath.lineTo(33.4f, 83.80001f);
generalPath.lineTo(33.4f, 91.30001f);
generalPath.lineTo(29.300001f, 91.30001f);
generalPath.closePath();
generalPath.moveTo(33.3f, 74.700005f);
generalPath.lineTo(33.3f, 80.4f);
generalPath.lineTo(35.5f, 80.4f);
generalPath.curveTo(37.1f, 80.4f, 38.2f, 80.3f, 38.7f, 80.1f);
generalPath.curveTo(39.2f, 79.9f, 39.7f, 79.6f, 40.0f, 79.1f);
generalPath.curveTo(40.3f, 78.7f, 40.5f, 78.1f, 40.5f, 77.5f);
generalPath.curveTo(40.5f, 76.8f, 40.3f, 76.2f, 39.9f, 75.7f);
generalPath.curveTo(39.5f, 75.2f, 38.9f, 74.899994f, 38.300003f, 74.799995f);
generalPath.curveTo(37.800003f, 74.7f, 36.800003f, 74.7f, 35.4f, 74.7f);
generalPath.lineTo(33.300003f, 74.7f);
generalPath.closePath();
generalPath.moveTo(52.4f, 91.3f);
generalPath.lineTo(52.4f, 74.7f);
generalPath.lineTo(46.5f, 74.7f);
generalPath.lineTo(46.5f, 71.299995f);
generalPath.lineTo(62.4f, 71.299995f);
generalPath.lineTo(62.4f, 74.7f);
generalPath.lineTo(56.5f, 74.7f);
generalPath.lineTo(56.5f, 91.299995f);
generalPath.lineTo(52.4f, 91.299995f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(56.5f, 32.0f);
generalPath.curveTo(56.5f, 34.3f, 56.0f, 36.4f, 55.1f, 38.0f);
generalPath.curveTo(54.1f, 39.7f, 52.8f, 41.1f, 51.1f, 42.1f);
generalPath.curveTo(49.3f, 43.199997f, 47.3f, 44.0f, 45.1f, 44.5f);
generalPath.curveTo(42.8f, 45.0f, 40.3f, 45.2f, 37.5f, 45.2f);
generalPath.lineTo(34.0f, 45.2f);
generalPath.lineTo(34.0f, 56.800003f);
generalPath.curveTo(34.0f, 57.500004f, 34.1f, 58.100002f, 34.4f, 58.600002f);
generalPath.curveTo(34.700005f, 59.100002f, 35.2f, 59.500004f, 35.9f, 59.800003f);
generalPath.curveTo(36.300003f, 60.000004f, 36.9f, 60.100002f, 37.800003f, 60.300003f);
generalPath.curveTo(38.700005f, 60.500004f, 39.4f, 60.600002f, 40.000004f, 60.700005f);
generalPath.lineTo(40.000004f, 63.0f);
generalPath.lineTo(17.5f, 63.0f);
generalPath.lineTo(17.5f, 60.7f);
generalPath.curveTo(18.1f, 60.600002f, 18.8f, 60.600002f, 19.8f, 60.5f);
generalPath.curveTo(20.699999f, 60.4f, 21.4f, 60.3f, 21.8f, 60.1f);
generalPath.curveTo(22.599998f, 59.8f, 23.099998f, 59.399998f, 23.3f, 59.0f);
generalPath.curveTo(23.5f, 58.600002f, 23.699999f, 57.9f, 23.699999f, 57.1f);
generalPath.lineTo(23.699999f, 27.9f);
generalPath.curveTo(23.699999f, 27.199999f, 23.599998f, 26.6f, 23.3f, 26.1f);
generalPath.curveTo(23.099998f, 25.6f, 22.599998f, 25.2f, 21.8f, 24.9f);
generalPath.curveTo(21.3f, 24.699999f, 20.5f, 24.5f, 19.599998f, 24.3f);
generalPath.curveTo(18.699999f, 24.099998f, 17.999998f, 24.0f, 17.599998f, 23.9f);
generalPath.lineTo(17.599998f, 21.6f);
generalPath.lineTo(40.5f, 21.6f);
generalPath.curveTo(45.9f, 21.6f, 49.9f, 22.5f, 52.5f, 24.2f);
generalPath.curveTo(55.1f, 25.900002f, 56.5f, 28.5f, 56.5f, 32.0f);
generalPath.closePath();
generalPath.moveTo(45.0f, 33.5f);
generalPath.curveTo(45.0f, 30.4f, 44.4f, 28.1f, 43.1f, 26.5f);
generalPath.curveTo(41.8f, 25.0f, 39.6f, 24.2f, 36.399998f, 24.2f);
generalPath.lineTo(34.0f, 24.2f);
generalPath.lineTo(34.0f, 42.300003f);
generalPath.lineTo(35.2f, 42.300003f);
generalPath.curveTo(38.4f, 42.300003f, 40.8f, 41.600002f, 42.5f, 40.100002f);
generalPath.curveTo(44.2f, 38.800003f, 45.0f, 36.600002f, 45.0f, 33.500004f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(12.829000473022461, 41.74700164794922), new Point2D.Double(49.82400131225586, 78.74199676513672), new float[] {0.005f,0.418f,0.679f,0.897f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(214, 91, 37, 255)) : new Color(214, 91, 37, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 90, 37, 255)) : new Color(211, 90, 37, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 86, 36, 255)) : new Color(202, 86, 36, 255)),((colorFilter != null) ? colorFilter.filter(new Color(188, 79, 34, 255)) : new Color(188, 79, 34, 255)),((colorFilter != null) ? colorFilter.filter(new Color(179, 75, 33, 255)) : new Color(179, 75, 33, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.03499984741211, 72.3550033569336), new Point2D.Double(58.53499984741211, 85.8550033569336), new float[] {0.0f,0.383f,0.521f,0.62f,0.699f,0.767f,0.828f,0.882f,0.933f,0.977f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 252, 227, 255)) : new Color(255, 252, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 250, 224, 255)) : new Color(255, 250, 224, 255)),((colorFilter != null) ? colorFilter.filter(new Color(253, 243, 216, 255)) : new Color(253, 243, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(251, 235, 204, 255)) : new Color(251, 235, 204, 255)),((colorFilter != null) ? colorFilter.filter(new Color(248, 223, 187, 255)) : new Color(248, 223, 187, 255)),((colorFilter != null) ? colorFilter.filter(new Color(245, 208, 166, 255)) : new Color(245, 208, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 191, 141, 255)) : new Color(241, 191, 141, 255)),((colorFilter != null) ? colorFilter.filter(new Color(236, 170, 114, 255)) : new Color(236, 170, 114, 255)),((colorFilter != null) ? colorFilter.filter(new Color(231, 147, 84, 255)) : new Color(231, 147, 84, 255)),((colorFilter != null) ? colorFilter.filter(new Color(226, 124, 52, 255)) : new Color(226, 124, 52, 255)),((colorFilter != null) ? colorFilter.filter(new Color(223, 111, 38, 255)) : new Color(223, 111, 38, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(193, 81, 39, 255)) : new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_ppt() {
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
    public static RadianceIcon of(int width, int height) {
       ext_ppt base = new ext_ppt();
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
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       ext_ppt base = new ext_ppt();
       base.width = width;
       base.height = height;
       return new RadianceIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_ppt::new;
    }
}

