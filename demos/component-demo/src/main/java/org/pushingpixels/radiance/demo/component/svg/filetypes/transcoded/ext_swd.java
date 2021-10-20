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
public class ext_swd implements RadianceIcon {
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
generalPath.moveTo(4.5f, 84.6f);
generalPath.lineTo(8.5f, 84.2f);
generalPath.curveTo(8.7f, 85.5f, 9.2f, 86.5f, 10.0f, 87.1f);
generalPath.curveTo(10.7f, 87.7f, 11.7f, 88.0f, 13.0f, 88.0f);
generalPath.curveTo(14.3f, 88.0f, 15.3f, 87.7f, 16.0f, 87.2f);
generalPath.curveTo(16.7f, 86.7f, 17.0f, 86.0f, 17.0f, 85.299995f);
generalPath.curveTo(17.0f, 84.799995f, 16.9f, 84.399994f, 16.6f, 84.1f);
generalPath.curveTo(16.300001f, 83.799995f, 15.8f, 83.5f, 15.1f, 83.2f);
generalPath.curveTo(14.6f, 83.0f, 13.5f, 82.7f, 11.8f, 82.299995f);
generalPath.curveTo(9.6f, 81.799995f, 8.1f, 81.1f, 7.2000003f, 80.299995f);
generalPath.curveTo(6.0f, 79.2f, 5.3f, 77.899994f, 5.3f, 76.299995f);
generalPath.curveTo(5.3f, 75.299995f, 5.6000004f, 74.299995f, 6.2000003f, 73.49999f);
generalPath.curveTo(6.8f, 72.59999f, 7.6000004f, 71.99999f, 8.700001f, 71.49999f);
generalPath.curveTo(9.800001f, 70.99999f, 11.1f, 70.799995f, 12.700001f, 70.799995f);
generalPath.curveTo(15.200001f, 70.799995f, 17.1f, 71.299995f, 18.400002f, 72.399994f);
generalPath.curveTo(19.7f, 73.49999f, 20.400002f, 74.899994f, 20.400002f, 76.799995f);
generalPath.lineTo(16.300001f, 76.99999f);
generalPath.curveTo(16.1f, 75.99999f, 15.800001f, 75.19999f, 15.200001f, 74.799995f);
generalPath.curveTo(14.6f, 74.399994f, 13.800001f, 74.1f, 12.6f, 74.1f);
generalPath.curveTo(11.400001f, 74.1f, 10.5f, 74.299995f, 9.8f, 74.799995f);
generalPath.curveTo(9.400001f, 75.1f, 9.2f, 75.49999f, 9.2f, 75.99999f);
generalPath.curveTo(9.2f, 76.49999f, 9.4f, 76.899994f, 9.8f, 77.19999f);
generalPath.curveTo(10.3f, 77.59999f, 11.6f, 78.09999f, 13.5f, 78.49999f);
generalPath.curveTo(15.4f, 78.899994f, 16.9f, 79.399994f, 17.9f, 79.899994f);
generalPath.curveTo(18.9f, 80.399994f, 19.6f, 81.09999f, 20.1f, 81.899994f);
generalPath.curveTo(20.6f, 82.799995f, 20.9f, 83.799995f, 20.9f, 85.09999f);
generalPath.curveTo(20.9f, 86.19999f, 20.6f, 87.29999f, 19.9f, 88.29999f);
generalPath.curveTo(19.3f, 89.29999f, 18.3f, 89.999985f, 17.199999f, 90.499985f);
generalPath.curveTo(16.099998f, 90.999985f, 14.599998f, 91.19998f, 12.799999f, 91.19998f);
generalPath.curveTo(10.199999f, 91.19998f, 8.299999f, 90.59998f, 6.899999f, 89.499985f);
generalPath.curveTo(5.5999994f, 88.499985f, 4.799999f, 86.79999f, 4.499999f, 84.59998f);
generalPath.closePath();
generalPath.moveTo(27.2f, 91.1f);
generalPath.lineTo(22.400002f, 71.3f);
generalPath.lineTo(26.600002f, 71.3f);
generalPath.lineTo(29.600002f, 84.9f);
generalPath.lineTo(33.300003f, 71.3f);
generalPath.lineTo(38.100002f, 71.3f);
generalPath.lineTo(41.600002f, 85.200005f);
generalPath.lineTo(44.7f, 71.3f);
generalPath.lineTo(48.8f, 71.3f);
generalPath.lineTo(44.0f, 91.1f);
generalPath.lineTo(39.7f, 91.1f);
generalPath.lineTo(35.7f, 76.299995f);
generalPath.lineTo(31.7f, 91.1f);
generalPath.lineTo(27.2f, 91.1f);
generalPath.closePath();
generalPath.moveTo(50.9f, 71.2f);
generalPath.lineTo(58.300003f, 71.2f);
generalPath.curveTo(60.000004f, 71.2f, 61.300003f, 71.299995f, 62.100002f, 71.6f);
generalPath.curveTo(63.300003f, 71.9f, 64.3f, 72.6f, 65.100006f, 73.4f);
generalPath.curveTo(65.90001f, 74.200005f, 66.600006f, 75.3f, 67.00001f, 76.6f);
generalPath.curveTo(67.40001f, 77.9f, 67.700005f, 79.4f, 67.700005f, 81.299995f);
generalPath.curveTo(67.700005f, 82.899994f, 67.50001f, 84.299995f, 67.100006f, 85.49999f);
generalPath.curveTo(66.600006f, 86.899994f, 65.90001f, 88.09999f, 64.90001f, 88.99999f);
generalPath.curveTo(64.20001f, 89.69999f, 63.20001f, 90.19999f, 62.000008f, 90.59999f);
generalPath.curveTo(61.100006f, 90.899994f, 59.90001f, 90.99999f, 58.40001f, 90.99999f);
generalPath.lineTo(50.70001f, 90.99999f);
generalPath.lineTo(50.70001f, 71.2f);
generalPath.closePath();
generalPath.moveTo(55.0f, 74.6f);
generalPath.lineTo(55.0f, 87.7f);
generalPath.lineTo(58.0f, 87.7f);
generalPath.curveTo(59.1f, 87.7f, 60.0f, 87.6f, 60.5f, 87.5f);
generalPath.curveTo(61.2f, 87.3f, 61.7f, 87.1f, 62.1f, 86.7f);
generalPath.curveTo(62.499996f, 86.299995f, 62.899998f, 85.7f, 63.199997f, 84.799995f);
generalPath.curveTo(63.499996f, 83.899994f, 63.6f, 82.7f, 63.6f, 81.2f);
generalPath.curveTo(63.6f, 79.7f, 63.5f, 78.5f, 63.199997f, 77.7f);
generalPath.curveTo(62.899994f, 76.899994f, 62.499996f, 76.2f, 61.999996f, 75.799995f);
generalPath.curveTo(61.499996f, 75.299995f, 60.899998f, 74.99999f, 60.099995f, 74.899994f);
generalPath.curveTo(59.499996f, 74.799995f, 58.399994f, 74.7f, 56.799995f, 74.7f);
generalPath.lineTo(55.0f, 74.7f);
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
	private ext_swd() {
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
       ext_swd base = new ext_swd();
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
       ext_swd base = new ext_swd();
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
        return ext_swd::new;
    }
}

