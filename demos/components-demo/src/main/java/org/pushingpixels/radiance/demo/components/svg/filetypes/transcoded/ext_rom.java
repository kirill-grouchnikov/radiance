package org.pushingpixels.radiance.demo.components.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.util.Stack;
import javax.swing.plaf.UIResource;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class ext_rom implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
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
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
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
generalPath.moveTo(5.4f, 91.9f);
generalPath.lineTo(5.4f, 71.9f);
generalPath.lineTo(13.9f, 71.9f);
generalPath.curveTo(16.0f, 71.9f, 17.6f, 72.1f, 18.599998f, 72.4f);
generalPath.curveTo(19.599997f, 72.700005f, 20.3f, 73.4f, 20.899998f, 74.3f);
generalPath.curveTo(21.499998f, 75.200005f, 21.799997f, 76.3f, 21.799997f, 77.5f);
generalPath.curveTo(21.799997f, 79.0f, 21.399998f, 80.2f, 20.499998f, 81.2f);
generalPath.curveTo(19.599998f, 82.2f, 18.299997f, 82.799995f, 16.499998f, 83.1f);
generalPath.curveTo(17.399998f, 83.6f, 18.099998f, 84.2f, 18.699999f, 84.799995f);
generalPath.curveTo(19.3f, 85.399994f, 19.999998f, 86.49999f, 20.999998f, 88.1f);
generalPath.lineTo(23.399998f, 92.0f);
generalPath.lineTo(18.599998f, 92.0f);
generalPath.lineTo(15.699999f, 87.6f);
generalPath.curveTo(14.699999f, 86.0f, 13.899999f, 85.1f, 13.599998f, 84.7f);
generalPath.curveTo(13.299998f, 84.299995f, 12.799998f, 84.0f, 12.399999f, 83.899994f);
generalPath.curveTo(11.999999f, 83.7f, 11.299998f, 83.7f, 10.399999f, 83.7f);
generalPath.lineTo(9.399999f, 83.7f);
generalPath.lineTo(9.399999f, 92.1f);
generalPath.lineTo(5.3999987f, 92.1f);
generalPath.closePath();
generalPath.moveTo(9.4f, 80.3f);
generalPath.lineTo(12.4f, 80.3f);
generalPath.curveTo(14.299999f, 80.3f, 15.599999f, 80.200005f, 16.0f, 80.100006f);
generalPath.curveTo(16.5f, 79.90001f, 16.9f, 79.700005f, 17.1f, 79.3f);
generalPath.curveTo(17.300001f, 78.9f, 17.5f, 78.4f, 17.5f, 77.8f);
generalPath.curveTo(17.5f, 77.100006f, 17.3f, 76.600006f, 17.0f, 76.200005f);
generalPath.curveTo(16.6f, 75.8f, 16.1f, 75.50001f, 15.5f, 75.4f);
generalPath.curveTo(15.2f, 75.4f, 14.2f, 75.3f, 12.5f, 75.3f);
generalPath.lineTo(9.4f, 75.3f);
generalPath.lineTo(9.4f, 80.3f);
generalPath.closePath();
generalPath.moveTo(24.8f, 82.0f);
generalPath.curveTo(24.8f, 80.0f, 25.099998f, 78.2f, 25.699999f, 76.9f);
generalPath.curveTo(26.199999f, 75.9f, 26.8f, 75.0f, 27.599998f, 74.200005f);
generalPath.curveTo(28.399998f, 73.4f, 29.3f, 72.8f, 30.199999f, 72.4f);
generalPath.curveTo(31.4f, 71.9f, 32.899998f, 71.6f, 34.5f, 71.6f);
generalPath.curveTo(37.5f, 71.6f, 39.8f, 72.5f, 41.6f, 74.299995f);
generalPath.curveTo(43.399998f, 76.1f, 44.3f, 78.7f, 44.3f, 81.899994f);
generalPath.curveTo(44.3f, 85.09999f, 43.399998f, 87.7f, 41.7f, 89.49999f);
generalPath.curveTo(39.9f, 91.299995f, 37.600002f, 92.19999f, 34.600002f, 92.19999f);
generalPath.curveTo(31.600002f, 92.19999f, 29.200003f, 91.29999f, 27.500002f, 89.49999f);
generalPath.curveTo(25.700003f, 87.69999f, 24.800001f, 85.19999f, 24.800001f, 81.99999f);
generalPath.closePath();
generalPath.moveTo(28.9f, 81.8f);
generalPath.curveTo(28.9f, 84.100006f, 29.4f, 85.8f, 30.5f, 87.0f);
generalPath.curveTo(31.5f, 88.2f, 32.9f, 88.8f, 34.5f, 88.8f);
generalPath.curveTo(36.1f, 88.8f, 37.4f, 88.200005f, 38.5f, 87.100006f);
generalPath.curveTo(39.5f, 85.90001f, 40.1f, 84.200005f, 40.1f, 81.90001f);
generalPath.curveTo(40.1f, 79.600006f, 39.6f, 77.90001f, 38.6f, 76.80001f);
generalPath.curveTo(37.6f, 75.70001f, 36.3f, 75.10001f, 34.6f, 75.10001f);
generalPath.curveTo(32.899998f, 75.10001f, 31.599998f, 75.70001f, 30.599998f, 76.80001f);
generalPath.curveTo(29.499998f, 77.80001f, 28.899998f, 79.50001f, 28.899998f, 81.80001f);
generalPath.closePath();
generalPath.moveTo(47.3f, 91.9f);
generalPath.lineTo(47.3f, 71.9f);
generalPath.lineTo(53.399998f, 71.9f);
generalPath.lineTo(57.0f, 85.5f);
generalPath.lineTo(60.6f, 71.8f);
generalPath.lineTo(66.7f, 71.8f);
generalPath.lineTo(66.7f, 91.8f);
generalPath.lineTo(62.899998f, 91.8f);
generalPath.lineTo(62.899998f, 76.1f);
generalPath.lineTo(58.899998f, 91.9f);
generalPath.lineTo(55.0f, 91.9f);
generalPath.lineTo(51.0f, 76.1f);
generalPath.lineTo(51.0f, 91.9f);
generalPath.lineTo(47.3f, 91.9f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.3f, 31.3f);
generalPath.lineTo(23.2f, 31.3f);
generalPath.lineTo(23.2f, 34.899998f);
generalPath.lineTo(17.800001f, 34.899998f);
generalPath.lineTo(17.800001f, 36.0f);
generalPath.lineTo(15.0f, 36.0f);
generalPath.lineTo(15.0f, 37.0f);
generalPath.lineTo(17.8f, 37.0f);
generalPath.lineTo(17.8f, 38.3f);
generalPath.lineTo(23.199999f, 38.3f);
generalPath.lineTo(23.199999f, 44.6f);
generalPath.lineTo(17.8f, 44.6f);
generalPath.lineTo(17.8f, 45.899998f);
generalPath.lineTo(15.0f, 45.899998f);
generalPath.lineTo(15.0f, 46.899998f);
generalPath.lineTo(17.8f, 46.899998f);
generalPath.lineTo(17.8f, 48.0f);
generalPath.lineTo(23.199999f, 48.0f);
generalPath.lineTo(23.199999f, 54.7f);
generalPath.lineTo(17.8f, 54.7f);
generalPath.lineTo(17.8f, 55.9f);
generalPath.lineTo(15.0f, 55.9f);
generalPath.lineTo(15.0f, 56.9f);
generalPath.lineTo(17.8f, 56.9f);
generalPath.lineTo(17.8f, 58.100002f);
generalPath.lineTo(23.199999f, 58.100002f);
generalPath.lineTo(23.199999f, 63.0f);
generalPath.lineTo(49.3f, 63.0f);
generalPath.lineTo(49.3f, 58.1f);
generalPath.lineTo(54.2f, 58.1f);
generalPath.lineTo(54.2f, 56.899998f);
generalPath.lineTo(57.0f, 56.899998f);
generalPath.lineTo(57.0f, 55.899998f);
generalPath.lineTo(54.2f, 55.899998f);
generalPath.lineTo(54.2f, 54.699997f);
generalPath.lineTo(49.3f, 54.699997f);
generalPath.lineTo(49.3f, 48.0f);
generalPath.lineTo(54.2f, 48.0f);
generalPath.lineTo(54.2f, 46.9f);
generalPath.lineTo(57.0f, 46.9f);
generalPath.lineTo(57.0f, 45.9f);
generalPath.lineTo(54.2f, 45.9f);
generalPath.lineTo(54.2f, 44.600002f);
generalPath.lineTo(49.3f, 44.600002f);
generalPath.lineTo(49.3f, 38.300003f);
generalPath.lineTo(54.2f, 38.300003f);
generalPath.lineTo(54.2f, 37.0f);
generalPath.lineTo(57.0f, 37.0f);
generalPath.lineTo(57.0f, 36.0f);
generalPath.lineTo(54.2f, 36.0f);
generalPath.lineTo(54.2f, 34.9f);
generalPath.lineTo(49.3f, 34.9f);
generalPath.lineTo(49.3f, 31.300001f);
generalPath.closePath();
generalPath.moveTo(44.3f, 39.9f);
generalPath.curveTo(43.2f, 39.9f, 42.3f, 39.0f, 42.3f, 37.9f);
generalPath.curveTo(42.3f, 36.800003f, 43.2f, 35.9f, 44.3f, 35.9f);
generalPath.curveTo(45.399998f, 35.9f, 46.3f, 36.800003f, 46.3f, 37.9f);
generalPath.curveTo(46.3f, 39.0f, 45.399998f, 39.9f, 44.3f, 39.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 63.0), new Point2D.Double(36.0, 31.28700065612793), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_rom() {
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
       ext_rom base = new ext_rom();
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
       ext_rom base = new ext_rom();
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
        return ext_rom::new;
    }
}

