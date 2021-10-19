package org.pushingpixels.radiance.demo.theming.main.check.svg.filetypes;

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
public class ext_apk implements RadianceIcon {
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
generalPath.moveTo(26.1f, 91.1f);
generalPath.lineTo(21.7f, 91.1f);
generalPath.lineTo(19.900002f, 86.6f);
generalPath.lineTo(11.900002f, 86.6f);
generalPath.lineTo(10.200002f, 91.1f);
generalPath.lineTo(6.0f, 91.1f);
generalPath.lineTo(13.8f, 71.3f);
generalPath.lineTo(18.1f, 71.3f);
generalPath.lineTo(26.1f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(18.6f, 83.299995f);
generalPath.lineTo(15.8f, 75.899994f);
generalPath.lineTo(13.1f, 83.299995f);
generalPath.lineTo(18.6f, 83.299995f);
generalPath.closePath();
generalPath.moveTo(28.2f, 91.1f);
generalPath.lineTo(28.2f, 71.3f);
generalPath.lineTo(34.7f, 71.3f);
generalPath.curveTo(37.2f, 71.3f, 38.8f, 71.4f, 39.5f, 71.600006f);
generalPath.curveTo(40.6f, 71.90001f, 41.6f, 72.50001f, 42.4f, 73.50001f);
generalPath.curveTo(43.2f, 74.50001f, 43.600002f, 75.80001f, 43.600002f, 77.40001f);
generalPath.curveTo(43.600002f, 78.600006f, 43.4f, 79.600006f, 42.9f, 80.50001f);
generalPath.curveTo(42.5f, 81.30001f, 41.9f, 82.00001f, 41.2f, 82.50001f);
generalPath.curveTo(40.5f, 83.00001f, 39.8f, 83.30001f, 39.100002f, 83.40001f);
generalPath.curveTo(38.100002f, 83.600006f, 36.7f, 83.70001f, 34.9f, 83.70001f);
generalPath.lineTo(32.300003f, 83.70001f);
generalPath.lineTo(32.300003f, 91.20001f);
generalPath.lineTo(28.200003f, 91.20001f);
generalPath.lineTo(28.200003f, 91.10001f);
generalPath.closePath();
generalPath.moveTo(32.3f, 74.6f);
generalPath.lineTo(32.3f, 80.2f);
generalPath.lineTo(34.5f, 80.2f);
generalPath.curveTo(36.1f, 80.2f, 37.2f, 80.1f, 37.7f, 79.899994f);
generalPath.curveTo(38.2f, 79.7f, 38.7f, 79.399994f, 39.0f, 78.899994f);
generalPath.curveTo(39.3f, 78.49999f, 39.5f, 77.899994f, 39.5f, 77.399994f);
generalPath.curveTo(39.5f, 76.7f, 39.3f, 76.09999f, 38.9f, 75.59999f);
generalPath.curveTo(38.5f, 75.09999f, 37.9f, 74.79999f, 37.300003f, 74.69999f);
generalPath.curveTo(36.800003f, 74.59999f, 35.800003f, 74.59999f, 34.4f, 74.59999f);
generalPath.lineTo(32.300003f, 74.59999f);
generalPath.closePath();
generalPath.moveTo(47.0f, 91.1f);
generalPath.lineTo(47.0f, 71.3f);
generalPath.lineTo(51.0f, 71.3f);
generalPath.lineTo(51.0f, 80.100006f);
generalPath.lineTo(59.2f, 71.3f);
generalPath.lineTo(64.6f, 71.3f);
generalPath.lineTo(57.1f, 79.0f);
generalPath.lineTo(65.1f, 91.1f);
generalPath.lineTo(59.899998f, 91.1f);
generalPath.lineTo(54.399998f, 81.799995f);
generalPath.lineTo(50.999996f, 85.1f);
generalPath.lineTo(50.999996f, 91.1f);
generalPath.lineTo(46.999996f, 91.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(23.4f, 51.7f);
generalPath.curveTo(23.4f, 52.9f, 24.199999f, 53.8f, 25.5f, 53.8f);
generalPath.lineTo(27.6f, 53.8f);
generalPath.lineTo(27.6f, 61.0f);
generalPath.curveTo(27.6f, 62.6f, 29.0f, 64.1f, 30.7f, 64.1f);
generalPath.curveTo(32.3f, 64.1f, 33.8f, 62.699997f, 33.8f, 61.0f);
generalPath.lineTo(33.8f, 53.8f);
generalPath.lineTo(37.899998f, 53.8f);
generalPath.lineTo(37.899998f, 61.0f);
generalPath.curveTo(37.899998f, 62.6f, 39.3f, 64.1f, 40.999996f, 64.1f);
generalPath.curveTo(42.699993f, 64.1f, 44.099995f, 62.699997f, 44.099995f, 61.0f);
generalPath.lineTo(44.099995f, 53.8f);
generalPath.lineTo(46.0f, 53.8f);
generalPath.curveTo(47.2f, 53.8f, 48.1f, 53.0f, 48.1f, 51.7f);
generalPath.lineTo(48.1f, 31.1f);
generalPath.lineTo(23.4f, 31.1f);
generalPath.lineTo(23.4f, 51.7f);
generalPath.closePath();
generalPath.moveTo(18.3f, 31.1f);
generalPath.curveTo(16.699999f, 31.1f, 15.199999f, 32.5f, 15.199999f, 34.2f);
generalPath.lineTo(15.199999f, 48.6f);
generalPath.curveTo(15.199999f, 50.199997f, 16.599998f, 51.699997f, 18.3f, 51.699997f);
generalPath.curveTo(19.9f, 51.699997f, 21.4f, 50.299995f, 21.4f, 48.6f);
generalPath.lineTo(21.4f, 34.2f);
generalPath.curveTo(21.4f, 32.5f, 19.9f, 31.1f, 18.3f, 31.1f);
generalPath.closePath();
generalPath.moveTo(53.2f, 31.1f);
generalPath.curveTo(51.600002f, 31.1f, 50.100002f, 32.5f, 50.100002f, 34.2f);
generalPath.lineTo(50.100002f, 48.6f);
generalPath.curveTo(50.100002f, 50.199997f, 51.500004f, 51.699997f, 53.2f, 51.699997f);
generalPath.curveTo(54.899998f, 51.699997f, 56.3f, 50.299995f, 56.3f, 48.6f);
generalPath.lineTo(56.3f, 34.2f);
generalPath.curveTo(56.3f, 32.5f, 54.899998f, 31.1f, 53.2f, 31.1f);
generalPath.closePath();
generalPath.moveTo(42.9f, 19.2f);
generalPath.lineTo(45.600002f, 16.5f);
generalPath.curveTo(46.000004f, 16.1f, 46.000004f, 15.5f, 45.600002f, 15.1f);
generalPath.curveTo(45.2f, 14.700001f, 44.600002f, 14.700001f, 44.2f, 15.1f);
generalPath.lineTo(41.100002f, 18.2f);
generalPath.curveTo(39.7f, 17.2f, 37.800003f, 16.800001f, 35.800003f, 16.800001f);
generalPath.curveTo(33.800003f, 16.800001f, 31.900003f, 17.2f, 30.200003f, 18.000002f);
generalPath.lineTo(27.300003f, 14.900002f);
generalPath.curveTo(26.900003f, 14.700002f, 26.100002f, 14.700002f, 25.700003f, 14.900002f);
generalPath.curveTo(25.500002f, 15.300001f, 25.500002f, 16.100002f, 25.700003f, 16.500002f);
generalPath.lineTo(28.400003f, 19.200003f);
generalPath.curveTo(25.500004f, 21.500002f, 23.500004f, 25.000004f, 23.500004f, 29.100002f);
generalPath.lineTo(48.200005f, 29.100002f);
generalPath.curveTo(48.100006f, 24.900002f, 46.000004f, 21.200003f, 42.900005f, 19.200003f);
generalPath.closePath();
generalPath.moveTo(31.600002f, 24.900002f);
generalPath.lineTo(29.500002f, 24.900002f);
generalPath.lineTo(29.500002f, 22.800001f);
generalPath.lineTo(31.600002f, 22.800001f);
generalPath.lineTo(31.600002f, 24.900002f);
generalPath.closePath();
generalPath.moveTo(41.9f, 24.900002f);
generalPath.lineTo(39.800003f, 24.900002f);
generalPath.lineTo(39.800003f, 22.800001f);
generalPath.lineTo(41.9f, 22.800001f);
generalPath.lineTo(41.9f, 24.900002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 64.0999984741211), new Point2D.Double(35.75, 14.75), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0359992980957, 25.81399917602539), new Point2D.Double(58.5359992980957, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
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
	private ext_apk() {
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
       ext_apk base = new ext_apk();
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
       ext_apk base = new ext_apk();
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
        return ext_apk::new;
    }
}

