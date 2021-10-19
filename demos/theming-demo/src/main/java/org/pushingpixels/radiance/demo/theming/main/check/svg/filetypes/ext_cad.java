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
public class ext_cad implements RadianceIcon {
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
generalPath.moveTo(21.6f, 83.3f);
generalPath.lineTo(25.300001f, 84.4f);
generalPath.curveTo(24.7f, 86.4f, 23.800001f, 87.9f, 22.500002f, 88.9f);
generalPath.curveTo(21.200003f, 89.9f, 19.500002f, 90.4f, 17.500002f, 90.4f);
generalPath.curveTo(15.000002f, 90.4f, 13.000002f, 89.6f, 11.400002f, 87.9f);
generalPath.curveTo(9.8f, 86.2f, 9.0f, 83.9f, 9.0f, 81.0f);
generalPath.curveTo(9.0f, 77.9f, 9.8f, 75.6f, 11.4f, 73.9f);
generalPath.curveTo(13.0f, 72.200005f, 15.099999f, 71.4f, 17.7f, 71.4f);
generalPath.curveTo(20.0f, 71.4f, 21.800001f, 72.1f, 23.300001f, 73.4f);
generalPath.curveTo(24.1f, 74.200005f, 24.800001f, 75.3f, 25.2f, 76.8f);
generalPath.lineTo(21.5f, 77.700005f);
generalPath.curveTo(21.3f, 76.700005f, 20.8f, 76.00001f, 20.1f, 75.4f);
generalPath.curveTo(19.4f, 74.8f, 18.5f, 74.6f, 17.5f, 74.6f);
generalPath.curveTo(16.1f, 74.6f, 15.0f, 75.1f, 14.1f, 76.1f);
generalPath.curveTo(13.200001f, 77.1f, 12.8f, 78.7f, 12.8f, 80.9f);
generalPath.curveTo(12.8f, 83.200005f, 13.2f, 84.9f, 14.1f, 85.9f);
generalPath.curveTo(14.900001f, 86.9f, 16.1f, 87.4f, 17.4f, 87.4f);
generalPath.curveTo(18.4f, 87.4f, 19.3f, 87.1f, 20.0f, 86.5f);
generalPath.curveTo(20.8f, 85.6f, 21.3f, 84.6f, 21.6f, 83.3f);
generalPath.closePath();
generalPath.moveTo(45.300003f, 90.100006f);
generalPath.lineTo(41.200005f, 90.100006f);
generalPath.lineTo(39.600006f, 85.90001f);
generalPath.lineTo(32.100006f, 85.90001f);
generalPath.lineTo(30.600006f, 90.100006f);
generalPath.lineTo(26.600006f, 90.100006f);
generalPath.lineTo(33.900005f, 71.700005f);
generalPath.lineTo(37.900005f, 71.700005f);
generalPath.lineTo(45.300007f, 90.100006f);
generalPath.closePath();
generalPath.moveTo(38.4f, 82.8f);
generalPath.lineTo(35.8f, 76.0f);
generalPath.lineTo(33.3f, 82.8f);
generalPath.lineTo(38.399998f, 82.8f);
generalPath.closePath();
generalPath.moveTo(47.300003f, 71.600006f);
generalPath.lineTo(54.200005f, 71.600006f);
generalPath.curveTo(55.800003f, 71.600006f, 56.900005f, 71.700005f, 57.800003f, 72.00001f);
generalPath.curveTo(58.9f, 72.30001f, 59.800003f, 72.90001f, 60.600002f, 73.700005f);
generalPath.curveTo(61.4f, 74.50001f, 62.000004f, 75.50001f, 62.4f, 76.700005f);
generalPath.curveTo(62.800003f, 77.9f, 63.0f, 79.3f, 63.0f, 81.100006f);
generalPath.curveTo(63.0f, 82.600006f, 62.8f, 83.90001f, 62.4f, 85.00001f);
generalPath.curveTo(61.9f, 86.30001f, 61.300003f, 87.40001f, 60.4f, 88.30001f);
generalPath.curveTo(59.7f, 88.90001f, 58.9f, 89.40001f, 57.800003f, 89.80001f);
generalPath.curveTo(57.000004f, 90.10001f, 55.9f, 90.20001f, 54.500004f, 90.20001f);
generalPath.lineTo(47.400005f, 90.20001f);
generalPath.lineTo(47.400005f, 71.6f);
generalPath.closePath();
generalPath.moveTo(51.100002f, 74.700005f);
generalPath.lineTo(51.100002f, 87.0f);
generalPath.lineTo(53.9f, 87.0f);
generalPath.curveTo(55.0f, 87.0f, 55.7f, 86.9f, 56.2f, 86.8f);
generalPath.curveTo(56.8f, 86.600006f, 57.3f, 86.4f, 57.7f, 86.0f);
generalPath.curveTo(58.100002f, 85.6f, 58.4f, 85.0f, 58.7f, 84.2f);
generalPath.curveTo(59.0f, 83.399994f, 59.100002f, 82.2f, 59.100002f, 80.799995f);
generalPath.curveTo(59.100002f, 79.399994f, 59.000004f, 78.299995f, 58.7f, 77.49999f);
generalPath.curveTo(58.399998f, 76.69999f, 58.100002f, 76.09999f, 57.600002f, 75.69999f);
generalPath.curveTo(57.100002f, 75.29999f, 56.600002f, 74.99999f, 55.9f, 74.79999f);
generalPath.curveTo(55.4f, 74.69999f, 54.300003f, 74.59999f, 52.800003f, 74.59999f);
generalPath.lineTo(51.100002f, 74.59999f);
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
	private ext_cad() {
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
       ext_cad base = new ext_cad();
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
       ext_cad base = new ext_cad();
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
        return ext_cad::new;
    }
}

