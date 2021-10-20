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
public class ext_odt implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.056f,0.16f,0.274f,0.398f,0.539f,0.711f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 45, 68, 255)) : new Color(0, 45, 68, 255)),((colorFilter != null) ? colorFilter.filter(new Color(1, 56, 82, 255)) : new Color(1, 56, 82, 255)),((colorFilter != null) ? colorFilter.filter(new Color(10, 77, 107, 255)) : new Color(10, 77, 107, 255)),((colorFilter != null) ? colorFilter.filter(new Color(15, 94, 130, 255)) : new Color(15, 94, 130, 255)),((colorFilter != null) ? colorFilter.filter(new Color(15, 109, 150, 255)) : new Color(15, 109, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(13, 119, 164, 255)) : new Color(13, 119, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(10, 126, 174, 255)) : new Color(10, 126, 174, 255)),((colorFilter != null) ? colorFilter.filter(new Color(8, 129, 178, 255)) : new Color(8, 129, 178, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(1, 65, 94, 255)) : new Color(1, 65, 94, 255);
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
generalPath.moveTo(7.5f, 81.3f);
generalPath.curveTo(7.5f, 79.3f, 7.8f, 77.600006f, 8.4f, 76.200005f);
generalPath.curveTo(8.9f, 75.200005f, 9.5f, 74.3f, 10.299999f, 73.50001f);
generalPath.curveTo(11.099999f, 72.700005f, 11.999999f, 72.100006f, 12.9f, 71.700005f);
generalPath.curveTo(14.099999f, 71.200005f, 15.599999f, 70.9f, 17.2f, 70.9f);
generalPath.curveTo(20.2f, 70.9f, 22.5f, 71.8f, 24.300001f, 73.6f);
generalPath.curveTo(26.1f, 75.4f, 27.000002f, 77.9f, 27.000002f, 81.2f);
generalPath.curveTo(27.000002f, 84.399994f, 26.100002f, 86.899994f, 24.400002f, 88.7f);
generalPath.curveTo(22.600002f, 90.5f, 20.300001f, 91.399994f, 17.300001f, 91.399994f);
generalPath.curveTo(14.300001f, 91.399994f, 11.900002f, 90.49999f, 10.200001f, 88.7f);
generalPath.curveTo(8.400001f, 86.899994f, 7.500001f, 84.399994f, 7.500001f, 81.299995f);
generalPath.closePath();
generalPath.moveTo(11.7f, 81.100006f);
generalPath.curveTo(11.7f, 83.3f, 12.2f, 85.100006f, 13.3f, 86.200005f);
generalPath.curveTo(14.3f, 87.4f, 15.700001f, 87.9f, 17.3f, 87.9f);
generalPath.curveTo(18.899998f, 87.9f, 20.199999f, 87.3f, 21.3f, 86.200005f);
generalPath.curveTo(22.3f, 85.00001f, 22.9f, 83.3f, 22.9f, 81.00001f);
generalPath.curveTo(22.9f, 78.700005f, 22.4f, 77.00001f, 21.4f, 75.90001f);
generalPath.curveTo(20.4f, 74.80001f, 19.1f, 74.20001f, 17.4f, 74.20001f);
generalPath.curveTo(15.699999f, 74.20001f, 14.4f, 74.80001f, 13.4f, 75.90001f);
generalPath.curveTo(12.2f, 77.100006f, 11.7f, 78.80001f, 11.7f, 81.100006f);
generalPath.closePath();
generalPath.moveTo(30.099998f, 71.200005f);
generalPath.lineTo(37.5f, 71.200005f);
generalPath.curveTo(39.2f, 71.200005f, 40.4f, 71.3f, 41.3f, 71.600006f);
generalPath.curveTo(42.5f, 71.90001f, 43.5f, 72.600006f, 44.3f, 73.40001f);
generalPath.curveTo(45.1f, 74.20001f, 45.8f, 75.30001f, 46.2f, 76.600006f);
generalPath.curveTo(46.600002f, 77.90001f, 46.9f, 79.40001f, 46.9f, 81.3f);
generalPath.curveTo(46.9f, 82.9f, 46.7f, 84.3f, 46.300003f, 85.5f);
generalPath.curveTo(45.800003f, 86.9f, 45.100002f, 88.1f, 44.200005f, 89.0f);
generalPath.curveTo(43.500004f, 89.7f, 42.600006f, 90.2f, 41.400005f, 90.6f);
generalPath.curveTo(40.500004f, 90.9f, 39.300007f, 91.0f, 37.800007f, 91.0f);
generalPath.lineTo(30.200006f, 91.0f);
generalPath.lineTo(30.200006f, 71.2f);
generalPath.closePath();
generalPath.moveTo(34.199997f, 74.600006f);
generalPath.lineTo(34.199997f, 87.700005f);
generalPath.lineTo(37.199997f, 87.700005f);
generalPath.curveTo(38.299995f, 87.700005f, 39.1f, 87.600006f, 39.6f, 87.50001f);
generalPath.curveTo(40.3f, 87.30001f, 40.8f, 87.100006f, 41.199997f, 86.700005f);
generalPath.curveTo(41.6f, 86.3f, 41.999996f, 85.700005f, 42.299995f, 84.8f);
generalPath.curveTo(42.599995f, 83.9f, 42.699997f, 82.700005f, 42.699997f, 81.200005f);
generalPath.curveTo(42.699997f, 79.700005f, 42.6f, 78.50001f, 42.299995f, 77.700005f);
generalPath.curveTo(41.999996f, 76.9f, 41.599995f, 76.200005f, 41.199997f, 75.8f);
generalPath.curveTo(40.8f, 75.4f, 40.1f, 75.0f, 39.299995f, 74.9f);
generalPath.curveTo(38.699997f, 74.8f, 37.599995f, 74.700005f, 35.999996f, 74.700005f);
generalPath.lineTo(34.199997f, 74.700005f);
generalPath.closePath();
generalPath.moveTo(54.899998f, 91.100006f);
generalPath.lineTo(54.899998f, 74.6f);
generalPath.lineTo(49.0f, 74.6f);
generalPath.lineTo(49.0f, 71.2f);
generalPath.lineTo(64.9f, 71.2f);
generalPath.lineTo(64.9f, 74.6f);
generalPath.lineTo(59.0f, 74.6f);
generalPath.lineTo(59.0f, 91.1f);
generalPath.lineTo(54.9f, 91.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 74.20500183105469), new Point2D.Double(58.569000244140625, 87.70500183105469), new float[] {0.005f,0.3f,0.443f,0.553f,0.647f,0.73f,0.805f,0.875f,0.938f,0.998f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(223, 241, 250, 255)) : new Color(223, 241, 250, 255)),((colorFilter != null) ? colorFilter.filter(new Color(220, 238, 247, 255)) : new Color(220, 238, 247, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 228, 239, 255)) : new Color(211, 228, 239, 255)),((colorFilter != null) ? colorFilter.filter(new Color(196, 214, 227, 255)) : new Color(196, 214, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(177, 197, 213, 255)) : new Color(177, 197, 213, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 176, 197, 255)) : new Color(154, 176, 197, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 154, 179, 255)) : new Color(129, 154, 179, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 130, 159, 255)) : new Color(100, 130, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 108, 140, 255)) : new Color(66, 108, 140, 255)),((colorFilter != null) ? colorFilter.filter(new Color(6, 87, 122, 255)) : new Color(6, 87, 122, 255)),((colorFilter != null) ? colorFilter.filter(new Color(1, 86, 121, 255)) : new Color(1, 86, 121, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(1, 65, 94, 255)) : new Color(1, 65, 94, 255);
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
generalPath.moveTo(39.2f, 34.0f);
generalPath.lineTo(41.100002f, 34.0f);
generalPath.curveTo(43.9f, 34.2f, 46.2f, 34.9f, 48.4f, 35.8f);
generalPath.curveTo(52.600002f, 33.899998f, 58.7f, 35.399998f, 62.4f, 36.8f);
generalPath.curveTo(57.600002f, 36.3f, 51.9f, 36.8f, 48.600002f, 38.7f);
generalPath.curveTo(45.3f, 36.0f, 39.0f, 35.3f, 33.1f, 36.0f);
generalPath.curveTo(34.8f, 34.9f, 36.8f, 34.2f, 39.199997f, 34.0f);
generalPath.closePath();
generalPath.moveTo(37.8f, 41.3f);
generalPath.curveTo(34.399998f, 41.5f, 31.599998f, 42.6f, 29.699999f, 44.2f);
generalPath.curveTo(24.0f, 41.600002f, 14.199999f, 42.7f, 10.499998f, 46.2f);
generalPath.curveTo(10.199998f, 46.4f, 9.799998f, 46.7f, 9.899998f, 47.0f);
generalPath.curveTo(13.0999975f, 46.0f, 16.999998f, 45.2f, 21.099998f, 45.5f);
generalPath.curveTo(25.099998f, 45.8f, 28.099998f, 47.2f, 30.399998f, 49.0f);
generalPath.curveTo(34.499996f, 45.3f, 40.6f, 43.2f, 48.299995f, 43.3f);
generalPath.curveTo(45.599995f, 42.0f, 41.699997f, 41.0f, 37.799995f, 41.3f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_odt() {
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
       ext_odt base = new ext_odt();
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
       ext_odt base = new ext_odt();
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
        return ext_odt::new;
    }
}

