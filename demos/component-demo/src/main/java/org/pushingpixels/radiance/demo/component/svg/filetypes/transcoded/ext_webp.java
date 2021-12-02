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
public class ext_webp implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.0f,0.124f,0.262f,0.41f,0.571f,0.752f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 107, 105, 255)) : new Color(0, 107, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 128, 127, 255)) : new Color(0, 128, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 147, 147, 255)) : new Color(0, 147, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 163, 163, 255)) : new Color(0, 163, 163, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 176, 175, 255)) : new Color(0, 176, 175, 255)),((colorFilter != null) ? colorFilter.filter(new Color(8, 184, 183, 255)) : new Color(8, 184, 183, 255)),((colorFilter != null) ? colorFilter.filter(new Color(20, 187, 187, 255)) : new Color(20, 187, 187, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 110, 108, 255)) : new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.0f, 91.1f);
generalPath.lineTo(3.3f, 75.3f);
generalPath.lineTo(6.6f, 75.3f);
generalPath.lineTo(9.0f, 86.1f);
generalPath.lineTo(11.9f, 75.299995f);
generalPath.lineTo(15.7f, 75.299995f);
generalPath.lineTo(18.5f, 86.299995f);
generalPath.lineTo(20.9f, 75.299995f);
generalPath.lineTo(24.1f, 75.299995f);
generalPath.lineTo(20.2f, 91.0f);
generalPath.lineTo(16.800001f, 91.0f);
generalPath.lineTo(13.600001f, 79.2f);
generalPath.lineTo(10.5f, 91.0f);
generalPath.lineTo(7.0f, 91.0f);
generalPath.closePath();
generalPath.moveTo(25.7f, 91.1f);
generalPath.lineTo(25.7f, 75.3f);
generalPath.lineTo(37.5f, 75.3f);
generalPath.lineTo(37.5f, 78.0f);
generalPath.lineTo(28.9f, 78.0f);
generalPath.lineTo(28.9f, 81.5f);
generalPath.lineTo(36.9f, 81.5f);
generalPath.lineTo(36.9f, 84.2f);
generalPath.lineTo(28.900002f, 84.2f);
generalPath.lineTo(28.900002f, 88.5f);
generalPath.lineTo(37.800003f, 88.5f);
generalPath.lineTo(37.800003f, 91.2f);
generalPath.lineTo(25.7f, 91.2f);
generalPath.closePath();
generalPath.moveTo(40.5f, 75.299995f);
generalPath.lineTo(46.8f, 75.299995f);
generalPath.curveTo(48.1f, 75.299995f, 49.0f, 75.399994f, 49.6f, 75.49999f);
generalPath.curveTo(50.199997f, 75.59999f, 50.8f, 75.799995f, 51.3f, 76.09999f);
generalPath.curveTo(51.8f, 76.39999f, 52.2f, 76.899994f, 52.5f, 77.399994f);
generalPath.curveTo(52.8f, 77.899994f, 53.0f, 78.59999f, 53.0f, 79.2f);
generalPath.curveTo(53.0f, 79.899994f, 52.8f, 80.6f, 52.4f, 81.2f);
generalPath.curveTo(52.000004f, 81.799995f, 51.5f, 82.299995f, 50.800003f, 82.6f);
generalPath.curveTo(51.800003f, 82.9f, 52.500004f, 83.4f, 53.000004f, 84.0f);
generalPath.curveTo(53.500004f, 84.7f, 53.800003f, 85.5f, 53.800003f, 86.4f);
generalPath.curveTo(53.800003f, 87.1f, 53.600002f, 87.8f, 53.300003f, 88.5f);
generalPath.curveTo(53.000004f, 89.2f, 52.500004f, 89.7f, 51.9f, 90.1f);
generalPath.curveTo(51.300003f, 90.5f, 50.600002f, 90.799995f, 49.800003f, 90.799995f);
generalPath.curveTo(49.300003f, 90.899994f, 48.000004f, 90.899994f, 45.9f, 90.899994f);
generalPath.lineTo(40.5f, 90.899994f);
generalPath.lineTo(40.5f, 75.3f);
generalPath.closePath();
generalPath.moveTo(43.7f, 77.899994f);
generalPath.lineTo(43.7f, 81.49999f);
generalPath.lineTo(45.8f, 81.49999f);
generalPath.curveTo(47.0f, 81.49999f, 47.8f, 81.49999f, 48.1f, 81.399994f);
generalPath.curveTo(48.6f, 81.299995f, 49.1f, 81.09999f, 49.399998f, 80.799995f);
generalPath.curveTo(49.699997f, 80.49999f, 49.899998f, 80.1f, 49.899998f, 79.6f);
generalPath.curveTo(49.899998f, 79.1f, 49.8f, 78.7f, 49.499996f, 78.4f);
generalPath.curveTo(49.199997f, 78.1f, 48.799995f, 77.9f, 48.299995f, 77.8f);
generalPath.curveTo(47.999996f, 77.8f, 47.099995f, 77.700005f, 45.599995f, 77.700005f);
generalPath.lineTo(43.699993f, 77.700005f);
generalPath.closePath();
generalPath.moveTo(43.7f, 84.2f);
generalPath.lineTo(43.7f, 88.399994f);
generalPath.lineTo(46.7f, 88.399994f);
generalPath.curveTo(47.9f, 88.399994f, 48.600002f, 88.399994f, 48.9f, 88.299995f);
generalPath.curveTo(49.4f, 88.2f, 49.800003f, 87.99999f, 50.100002f, 87.7f);
generalPath.curveTo(50.4f, 87.399994f, 50.500004f, 86.899994f, 50.500004f, 86.399994f);
generalPath.curveTo(50.500004f, 85.899994f, 50.400005f, 85.49999f, 50.200005f, 85.2f);
generalPath.curveTo(50.000004f, 84.899994f, 49.600006f, 84.6f, 49.200005f, 84.5f);
generalPath.curveTo(48.800003f, 84.3f, 47.800003f, 84.3f, 46.400005f, 84.3f);
generalPath.lineTo(43.700005f, 84.3f);
generalPath.closePath();
generalPath.moveTo(56.5f, 91.1f);
generalPath.lineTo(56.5f, 75.3f);
generalPath.lineTo(61.6f, 75.3f);
generalPath.curveTo(63.5f, 75.3f, 64.799995f, 75.4f, 65.4f, 75.5f);
generalPath.curveTo(66.3f, 75.7f, 67.1f, 76.3f, 67.700005f, 77.0f);
generalPath.curveTo(68.3f, 77.8f, 68.600006f, 78.8f, 68.600006f, 80.1f);
generalPath.curveTo(68.600006f, 81.1f, 68.40001f, 81.9f, 68.100006f, 82.5f);
generalPath.curveTo(67.8f, 83.1f, 67.3f, 83.7f, 66.8f, 84.1f);
generalPath.curveTo(66.3f, 84.5f, 65.700005f, 84.7f, 65.100006f, 84.799995f);
generalPath.curveTo(64.3f, 84.99999f, 63.200005f, 84.99999f, 61.800007f, 84.99999f);
generalPath.lineTo(59.70001f, 84.99999f);
generalPath.lineTo(59.70001f, 90.899994f);
generalPath.lineTo(56.500008f, 90.899994f);
generalPath.closePath();
generalPath.moveTo(59.7f, 78.0f);
generalPath.lineTo(59.7f, 82.5f);
generalPath.lineTo(61.5f, 82.5f);
generalPath.curveTo(62.8f, 82.5f, 63.6f, 82.4f, 64.0f, 82.3f);
generalPath.curveTo(64.4f, 82.200005f, 64.8f, 81.9f, 65.0f, 81.5f);
generalPath.curveTo(65.2f, 81.1f, 65.4f, 80.7f, 65.4f, 80.3f);
generalPath.curveTo(65.4f, 79.700005f, 65.200005f, 79.3f, 64.9f, 78.9f);
generalPath.curveTo(64.6f, 78.5f, 64.1f, 78.3f, 63.600002f, 78.200005f);
generalPath.curveTo(63.100002f, 78.00001f, 62.4f, 78.00001f, 61.2f, 78.00001f);
generalPath.lineTo(59.7f, 78.00001f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(214, 237, 232, 255)) : new Color(214, 237, 232, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 235, 230, 255)) : new Color(211, 235, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 227, 223, 255)) : new Color(199, 227, 223, 255)),((colorFilter != null) ? colorFilter.filter(new Color(183, 216, 213, 255)) : new Color(183, 216, 213, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 203, 201, 255)) : new Color(160, 203, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(132, 186, 185, 255)) : new Color(132, 186, 185, 255)),((colorFilter != null) ? colorFilter.filter(new Color(98, 167, 167, 255)) : new Color(98, 167, 167, 255)),((colorFilter != null) ? colorFilter.filter(new Color(52, 147, 148, 255)) : new Color(52, 147, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 127, 127, 255)) : new Color(0, 127, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 107, 106, 255)) : new Color(0, 107, 106, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 107, 105, 255)) : new Color(0, 107, 105, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 110, 108, 255)) : new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(62.7f, 56.8f);
generalPath.curveTo(61.100002f, 56.0f, 58.100002f, 50.2f, 53.5f, 49.8f);
generalPath.curveTo(49.5f, 49.5f, 44.4f, 48.0f, 41.6f, 47.8f);
generalPath.curveTo(38.1f, 42.0f, 32.1f, 32.8f, 27.099998f, 27.9f);
generalPath.lineTo(40.899998f, 28.6f);
generalPath.curveTo(37.2f, 19.8f, 27.7f, 23.0f, 27.7f, 23.0f);
generalPath.lineTo(34.100002f, 17.7f);
generalPath.curveTo(25.900002f, 14.400001f, 22.500002f, 22.400002f, 22.500002f, 22.400002f);
generalPath.curveTo(14.000002f, 17.7f, 9.600002f, 25.7f, 9.600002f, 25.7f);
generalPath.lineTo(18.400002f, 26.300001f);
generalPath.curveTo(8.4f, 29.1f, 11.2f, 39.0f, 11.2f, 39.0f);
generalPath.lineTo(20.099998f, 31.0f);
generalPath.curveTo(18.199999f, 35.4f, 22.399998f, 38.5f, 22.399998f, 38.5f);
generalPath.lineTo(25.0f, 27.7f);
generalPath.curveTo(25.0f, 27.7f, 34.3f, 38.300003f, 37.2f, 49.1f);
generalPath.curveTo(33.5f, 51.0f, 27.7f, 54.1f, 23.2f, 54.699997f);
generalPath.curveTo(17.0f, 55.499996f, 9.700001f, 59.699997f, 9.700001f, 59.699997f);
generalPath.lineTo(9.700001f, 64.6f);
generalPath.lineTo(62.8f, 64.6f);
generalPath.lineTo(62.7f, 56.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.25, 37.35300064086914), new Point2D.Double(36.25, 85.16100311279297), new float[] {0.005f,0.343f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 130, 129, 255)) : new Color(0, 130, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 106, 105, 255)) : new Color(0, 106, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 56, 54, 255)) : new Color(0, 56, 54, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
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
        return 0.13300000131130219;
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
		return 0.7379999160766602;
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
	private ext_webp() {
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
       ext_webp base = new ext_webp();
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
       ext_webp base = new ext_webp();
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
        return ext_webp::new;
    }
}

