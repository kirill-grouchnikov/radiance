package org.pushingpixels.radiance.demo.component.svg.filetypes.transcoded;

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
public class ext_cptx implements RadianceIcon {
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0), new Point2D.Double(36.0, 3.003999948501587), new float[] {0.118f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(102, 226, 131, 255)) : new Color(102, 226, 131, 255)),((colorFilter != null) ? colorFilter.filter(new Color(36, 52, 45, 255)) : new Color(36, 52, 45, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = (colorFilter != null) ? colorFilter.filter(new Color(36, 52, 45, 255)) : new Color(36, 52, 45, 255);
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
generalPath.moveTo(17.5f, 85.3f);
generalPath.lineTo(20.6f, 86.3f);
generalPath.curveTo(20.1f, 88.0f, 19.300001f, 89.3f, 18.2f, 90.100006f);
generalPath.curveTo(17.1f, 90.90001f, 15.700001f, 91.40001f, 13.900001f, 91.40001f);
generalPath.curveTo(11.800001f, 91.40001f, 10.0f, 90.70001f, 8.700001f, 89.30001f);
generalPath.curveTo(7.3000007f, 87.90001f, 6.600001f, 85.90001f, 6.600001f, 83.40001f);
generalPath.curveTo(6.600001f, 80.80001f, 7.3000007f, 78.70001f, 8.700001f, 77.30001f);
generalPath.curveTo(10.1f, 75.90001f, 11.900001f, 75.10001f, 14.1f, 75.10001f);
generalPath.curveTo(16.1f, 75.10001f, 17.7f, 75.70001f, 18.900002f, 76.80001f);
generalPath.curveTo(19.600002f, 77.50001f, 20.2f, 78.40001f, 20.500002f, 79.70001f);
generalPath.lineTo(17.300001f, 80.500015f);
generalPath.curveTo(17.1f, 79.70001f, 16.7f, 79.000015f, 16.1f, 78.60001f);
generalPath.curveTo(15.5f, 78.20001f, 14.8f, 77.90002f, 13.900001f, 77.90002f);
generalPath.curveTo(12.700001f, 77.90002f, 11.700001f, 78.30002f, 11.0f, 79.20002f);
generalPath.curveTo(10.299999f, 80.10002f, 10.0f, 81.20002f, 10.0f, 83.10002f);
generalPath.curveTo(10.0f, 85.10002f, 10.4f, 86.50002f, 11.1f, 87.400024f);
generalPath.curveTo(11.8f, 88.20003f, 12.8f, 88.70003f, 13.900001f, 88.70003f);
generalPath.curveTo(14.8f, 88.70003f, 15.500001f, 88.400024f, 16.1f, 87.900024f);
generalPath.curveTo(16.7f, 87.400024f, 17.300001f, 86.400024f, 17.5f, 85.300026f);
generalPath.closePath();
generalPath.moveTo(23.4f, 91.100006f);
generalPath.lineTo(23.4f, 75.3f);
generalPath.lineTo(28.599998f, 75.3f);
generalPath.curveTo(30.599998f, 75.3f, 31.8f, 75.4f, 32.399998f, 75.5f);
generalPath.curveTo(33.3f, 75.7f, 34.1f, 76.3f, 34.699997f, 77.0f);
generalPath.curveTo(35.299995f, 77.8f, 35.6f, 78.8f, 35.6f, 80.1f);
generalPath.curveTo(35.6f, 81.1f, 35.399998f, 81.9f, 35.1f, 82.5f);
generalPath.curveTo(34.8f, 83.1f, 34.3f, 83.7f, 33.699997f, 84.1f);
generalPath.curveTo(33.1f, 84.5f, 32.6f, 84.7f, 31.999996f, 84.799995f);
generalPath.curveTo(31.199997f, 84.99999f, 30.099997f, 84.99999f, 28.599997f, 84.99999f);
generalPath.lineTo(26.499996f, 84.99999f);
generalPath.lineTo(26.499996f, 90.899994f);
generalPath.lineTo(23.399996f, 90.899994f);
generalPath.closePath();
generalPath.moveTo(26.7f, 78.0f);
generalPath.lineTo(26.7f, 82.5f);
generalPath.lineTo(28.5f, 82.5f);
generalPath.curveTo(29.8f, 82.5f, 30.6f, 82.4f, 31.1f, 82.3f);
generalPath.curveTo(31.6f, 82.200005f, 31.9f, 81.9f, 32.1f, 81.5f);
generalPath.curveTo(32.299995f, 81.1f, 32.5f, 80.7f, 32.5f, 80.3f);
generalPath.curveTo(32.5f, 79.700005f, 32.3f, 79.3f, 32.0f, 78.9f);
generalPath.curveTo(31.7f, 78.5f, 31.2f, 78.3f, 30.7f, 78.200005f);
generalPath.curveTo(30.2f, 78.00001f, 29.400002f, 78.00001f, 28.2f, 78.00001f);
generalPath.lineTo(26.7f, 78.00001f);
generalPath.closePath();
generalPath.moveTo(42.0f, 91.1f);
generalPath.lineTo(42.0f, 78.0f);
generalPath.lineTo(37.2f, 78.0f);
generalPath.lineTo(37.2f, 75.3f);
generalPath.lineTo(49.9f, 75.3f);
generalPath.lineTo(49.9f, 78.0f);
generalPath.lineTo(45.2f, 78.0f);
generalPath.lineTo(45.2f, 91.1f);
generalPath.lineTo(42.0f, 91.1f);
generalPath.closePath();
generalPath.moveTo(50.4f, 91.1f);
generalPath.lineTo(55.9f, 82.9f);
generalPath.lineTo(50.9f, 75.4f);
generalPath.lineTo(54.7f, 75.4f);
generalPath.lineTo(57.9f, 80.5f);
generalPath.lineTo(61.0f, 75.4f);
generalPath.lineTo(64.7f, 75.4f);
generalPath.lineTo(59.699997f, 83.0f);
generalPath.lineTo(65.2f, 91.1f);
generalPath.lineTo(61.299995f, 91.1f);
generalPath.lineTo(57.699997f, 85.7f);
generalPath.lineTo(54.1f, 91.1f);
generalPath.lineTo(50.399998f, 91.1f);
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
paint = new LinearGradientPaint(new Point2D.Double(36.625, 1015.3619995117188), new Point2D.Double(36.625, 974.6119995117188), new float[] {0.05f,0.283f,0.4f,0.969f,0.974f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(71, 133, 85, 255)) : new Color(71, 133, 85, 255)),((colorFilter != null) ? colorFilter.filter(new Color(63, 118, 76, 255)) : new Color(63, 118, 76, 255)),((colorFilter != null) ? colorFilter.filter(new Color(58, 108, 70, 255)) : new Color(58, 108, 70, 255)),((colorFilter != null) ? colorFilter.filter(new Color(31, 61, 38, 255)) : new Color(31, 61, 38, 255)),((colorFilter != null) ? colorFilter.filter(new Color(31, 61, 38, 255)) : new Color(31, 61, 38, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.625, 1015.8619995117188), new Point2D.Double(36.625, 974.1119995117188), new float[] {0.05f,0.283f,0.4f,0.969f,0.974f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(71, 133, 85, 255)) : new Color(71, 133, 85, 255)),((colorFilter != null) ? colorFilter.filter(new Color(63, 118, 76, 255)) : new Color(63, 118, 76, 255)),((colorFilter != null) ? colorFilter.filter(new Color(58, 108, 70, 255)) : new Color(58, 108, 70, 255)),((colorFilter != null) ? colorFilter.filter(new Color(31, 61, 38, 255)) : new Color(31, 61, 38, 255)),((colorFilter != null) ? colorFilter.filter(new Color(31, 61, 38, 255)) : new Color(31, 61, 38, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
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
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
paint = new LinearGradientPaint(new Point2D.Double(45.178001403808594, 74.15899658203125), new Point2D.Double(58.77199935913086, 87.75299835205078), new float[] {0.0f,0.128f,0.274f,0.429f,0.59f,0.732f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(210, 224, 213, 255)) : new Color(210, 224, 213, 255)),((colorFilter != null) ? colorFilter.filter(new Color(205, 224, 209, 255)) : new Color(205, 224, 209, 255)),((colorFilter != null) ? colorFilter.filter(new Color(191, 224, 199, 255)) : new Color(191, 224, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(168, 225, 181, 255)) : new Color(168, 225, 181, 255)),((colorFilter != null) ? colorFilter.filter(new Color(137, 225, 157, 255)) : new Color(137, 225, 157, 255)),((colorFilter != null) ? colorFilter.filter(new Color(102, 226, 131, 255)) : new Color(102, 226, 131, 255)),((colorFilter != null) ? colorFilter.filter(new Color(36, 52, 45, 255)) : new Color(36, 52, 45, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = (colorFilter != null) ? colorFilter.filter(new Color(36, 52, 45, 255)) : new Color(36, 52, 45, 255);
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
	private ext_cptx() {
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
       ext_cptx base = new ext_cptx();
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
       ext_cptx base = new ext_cptx();
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
        return ext_cptx::new;
    }
}

