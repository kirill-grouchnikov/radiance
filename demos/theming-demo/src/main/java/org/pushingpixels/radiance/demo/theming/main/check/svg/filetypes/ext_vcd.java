package org.pushingpixels.radiance.demo.theming.main.check.svg.filetypes;

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
public class ext_vcd implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 99.0f);
generalPath.lineTo(-0.19999695f, 99.0f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 2.994999885559082), new Point2D.Double(35.75, 101.0009994506836), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 196, 2, 255)) : new Color(239, 196, 2, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 200, 41, 255)) : new Color(241, 200, 41, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 210, 100, 255)) : new Color(244, 210, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(247, 220, 139, 255)) : new Color(247, 220, 139, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 229, 172, 255)) : new Color(249, 229, 172, 255)),((colorFilter != null) ? colorFilter.filter(new Color(251, 236, 199, 255)) : new Color(251, 236, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 243, 221, 255)) : new Color(252, 243, 221, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 249, 238, 255)) : new Color(254, 249, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 253, 249, 255)) : new Color(255, 253, 249, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 99.0f);
generalPath.lineTo(-0.19999695f, 99.0f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 156, 2, 255)) : new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 99.0f);
generalPath.lineTo(-0.19999695f, 99.0f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
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
generalPath.moveTo(13.8f, 92.1f);
generalPath.lineTo(6.6f, 72.2f);
generalPath.lineTo(11.0f, 72.2f);
generalPath.lineTo(16.1f, 86.899994f);
generalPath.lineTo(21.0f, 72.2f);
generalPath.lineTo(25.3f, 72.2f);
generalPath.lineTo(18.1f, 92.0f);
generalPath.lineTo(13.8f, 92.0f);
generalPath.closePath();
generalPath.moveTo(40.2f, 84.799995f);
generalPath.lineTo(44.100002f, 85.99999f);
generalPath.curveTo(43.500004f, 88.19999f, 42.500004f, 89.799995f, 41.100002f, 90.799995f);
generalPath.curveTo(39.7f, 91.899994f, 37.9f, 92.399994f, 35.800003f, 92.399994f);
generalPath.curveTo(33.100002f, 92.399994f, 31.000004f, 91.49999f, 29.200003f, 89.7f);
generalPath.curveTo(27.500002f, 87.899994f, 26.600002f, 85.399994f, 26.600002f, 82.299995f);
generalPath.curveTo(26.600002f, 78.99999f, 27.500002f, 76.399994f, 29.200003f, 74.6f);
generalPath.curveTo(30.900003f, 72.8f, 33.200005f, 71.9f, 36.000004f, 71.9f);
generalPath.curveTo(38.500004f, 71.9f, 40.400005f, 72.6f, 42.000004f, 74.1f);
generalPath.curveTo(42.900005f, 74.9f, 43.600002f, 76.2f, 44.100002f, 77.799995f);
generalPath.lineTo(40.100002f, 78.7f);
generalPath.curveTo(39.9f, 77.7f, 39.4f, 76.899994f, 38.600002f, 76.299995f);
generalPath.curveTo(37.800003f, 75.7f, 36.9f, 75.399994f, 35.9f, 75.399994f);
generalPath.curveTo(34.4f, 75.399994f, 33.2f, 75.899994f, 32.300003f, 76.99999f);
generalPath.curveTo(31.400003f, 78.09999f, 30.900003f, 79.799995f, 30.900003f, 82.09999f);
generalPath.curveTo(30.900003f, 84.59999f, 31.400003f, 86.399994f, 32.300003f, 87.49999f);
generalPath.curveTo(33.200005f, 88.59999f, 34.4f, 89.09999f, 35.9f, 89.09999f);
generalPath.curveTo(37.0f, 89.09999f, 37.9f, 88.79999f, 38.7f, 88.09999f);
generalPath.curveTo(39.3f, 87.29999f, 39.8f, 86.19999f, 40.2f, 84.79999f);
generalPath.closePath();
generalPath.moveTo(47.600002f, 72.2f);
generalPath.lineTo(55.0f, 72.2f);
generalPath.curveTo(56.7f, 72.2f, 57.9f, 72.299995f, 58.8f, 72.6f);
generalPath.curveTo(60.0f, 72.9f, 61.0f, 73.6f, 61.8f, 74.4f);
generalPath.curveTo(62.6f, 75.3f, 63.3f, 76.3f, 63.7f, 77.6f);
generalPath.curveTo(64.100006f, 78.899994f, 64.4f, 80.4f, 64.4f, 82.299995f);
generalPath.curveTo(64.4f, 83.899994f, 64.200005f, 85.299995f, 63.800003f, 86.49999f);
generalPath.curveTo(63.300003f, 87.899994f, 62.600002f, 89.09999f, 61.700005f, 89.99999f);
generalPath.curveTo(61.000004f, 90.69999f, 60.100006f, 91.19999f, 58.900005f, 91.59999f);
generalPath.curveTo(58.000004f, 91.899994f, 56.800007f, 91.99999f, 55.300007f, 91.99999f);
generalPath.lineTo(47.70001f, 91.99999f);
generalPath.lineTo(47.70001f, 72.2f);
generalPath.closePath();
generalPath.moveTo(51.600002f, 75.6f);
generalPath.lineTo(51.600002f, 88.7f);
generalPath.lineTo(54.600002f, 88.7f);
generalPath.curveTo(55.7f, 88.7f, 56.500004f, 88.6f, 57.000004f, 88.5f);
generalPath.curveTo(57.700005f, 88.3f, 58.200005f, 88.1f, 58.600002f, 87.7f);
generalPath.curveTo(59.000004f, 87.299995f, 59.4f, 86.7f, 59.7f, 85.799995f);
generalPath.curveTo(60.0f, 84.899994f, 60.100002f, 83.7f, 60.100002f, 82.2f);
generalPath.curveTo(60.100002f, 80.7f, 60.000004f, 79.5f, 59.7f, 78.7f);
generalPath.curveTo(59.4f, 77.899994f, 59.0f, 77.2f, 58.600002f, 76.799995f);
generalPath.curveTo(58.100002f, 76.299995f, 57.500004f, 75.99999f, 56.7f, 75.899994f);
generalPath.curveTo(56.100002f, 75.799995f, 55.0f, 75.7f, 53.4f, 75.7f);
generalPath.lineTo(51.600002f, 75.7f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.8f, 18.8f);
generalPath.curveTo(23.4f, 18.8f, 13.299999f, 28.8f, 13.299999f, 41.1f);
generalPath.curveTo(13.299999f, 53.399998f, 23.4f, 63.399998f, 35.8f, 63.399998f);
generalPath.curveTo(48.199997f, 63.399998f, 58.3f, 53.399998f, 58.3f, 41.1f);
generalPath.curveTo(58.3f, 28.8f, 48.199997f, 18.8f, 35.8f, 18.8f);
generalPath.closePath();
generalPath.moveTo(35.8f, 48.699997f);
generalPath.curveTo(31.5f, 48.699997f, 28.099998f, 45.199997f, 28.099998f, 41.1f);
generalPath.curveTo(28.099998f, 36.8f, 31.599998f, 33.5f, 35.8f, 33.5f);
generalPath.curveTo(40.1f, 33.5f, 43.5f, 37.0f, 43.5f, 41.1f);
generalPath.curveTo(43.5f, 45.3f, 40.0f, 48.699997f, 35.8f, 48.699997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 38.632999420166016), new Point2D.Double(35.75, 83.18099975585938), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(164, 125, 3, 255)) : new Color(164, 125, 3, 255)),((colorFilter != null) ? colorFilter.filter(new Color(222, 190, 0, 255)) : new Color(222, 190, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 173, 4, 255)) : new Color(207, 173, 4, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.8f, 38.3f);
generalPath.curveTo(34.2f, 38.3f, 33.0f, 39.6f, 33.0f, 41.1f);
generalPath.curveTo(33.0f, 42.699997f, 34.3f, 43.899998f, 35.8f, 43.899998f);
generalPath.curveTo(37.399998f, 43.899998f, 38.6f, 42.6f, 38.6f, 41.1f);
generalPath.curveTo(38.5f, 39.5f, 37.399998f, 38.3f, 35.8f, 38.3f);
generalPath.closePath();
generalPath.moveTo(35.8f, 42.1f);
generalPath.curveTo(35.3f, 42.1f, 34.8f, 41.699997f, 34.8f, 41.1f);
generalPath.curveTo(34.8f, 40.6f, 35.2f, 40.1f, 35.8f, 40.1f);
generalPath.curveTo(36.3f, 40.1f, 36.8f, 40.5f, 36.8f, 41.1f);
generalPath.curveTo(36.8f, 41.6f, 36.2f, 42.1f, 35.8f, 42.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.8f, 32.8f);
generalPath.curveTo(31.099998f, 32.8f, 27.4f, 36.6f, 27.4f, 41.1f);
generalPath.curveTo(27.4f, 45.8f, 31.199999f, 49.399998f, 35.8f, 49.399998f);
generalPath.curveTo(40.5f, 49.399998f, 44.199997f, 45.6f, 44.199997f, 41.1f);
generalPath.curveTo(44.199997f, 36.399998f, 40.499996f, 32.8f, 35.799995f, 32.8f);
generalPath.closePath();
generalPath.moveTo(35.8f, 48.0f);
generalPath.curveTo(31.9f, 48.0f, 28.8f, 44.9f, 28.8f, 41.1f);
generalPath.curveTo(28.8f, 37.299995f, 31.9f, 34.199997f, 35.8f, 34.199997f);
generalPath.curveTo(39.699997f, 34.199997f, 42.8f, 37.299995f, 42.8f, 41.1f);
generalPath.curveTo(42.8f, 44.9f, 39.7f, 48.0f, 35.8f, 48.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.34400177001953, 74.2300033569336), new Point2D.Double(58.84400177001953, 87.7300033569336), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 251, 255)) : new Color(255, 254, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 250, 241, 255)) : new Color(254, 250, 241, 255)),((colorFilter != null) ? colorFilter.filter(new Color(253, 245, 228, 255)) : new Color(253, 245, 228, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 240, 210, 255)) : new Color(252, 240, 210, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 233, 188, 255)) : new Color(250, 233, 188, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 226, 162, 255)) : new Color(249, 226, 162, 255)),((colorFilter != null) ? colorFilter.filter(new Color(247, 218, 131, 255)) : new Color(247, 218, 131, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 209, 93, 255)) : new Color(244, 209, 93, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 200, 39, 255)) : new Color(241, 200, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(239, 196, 2, 255)) : new Color(239, 196, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_5_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 156, 2, 255)) : new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
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
        return 0.12800002098083496;
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
		return 0.7410314083099365;
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
	private ext_vcd() {
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
       ext_vcd base = new ext_vcd();
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
       ext_vcd base = new ext_vcd();
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
        return ext_vcd::new;
    }
}

