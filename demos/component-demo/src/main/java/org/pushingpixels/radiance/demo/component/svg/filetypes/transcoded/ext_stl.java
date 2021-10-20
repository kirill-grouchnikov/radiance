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
public class ext_stl implements RadianceIcon {
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
generalPath.moveTo(12.6f, 84.1f);
generalPath.lineTo(16.300001f, 83.7f);
generalPath.curveTo(16.500002f, 84.899994f, 17.000002f, 85.799995f, 17.6f, 86.399994f);
generalPath.curveTo(18.300001f, 86.99999f, 19.2f, 87.299995f, 20.300001f, 87.299995f);
generalPath.curveTo(21.500002f, 87.299995f, 22.400002f, 86.99999f, 23.000002f, 86.49999f);
generalPath.curveTo(23.600002f, 85.99999f, 23.900002f, 85.399994f, 23.900002f, 84.69999f);
generalPath.curveTo(23.900002f, 84.29999f, 23.800001f, 83.89999f, 23.500002f, 83.59999f);
generalPath.curveTo(23.200003f, 83.29999f, 22.800001f, 82.99999f, 22.100002f, 82.79999f);
generalPath.curveTo(21.700003f, 82.59999f, 20.700003f, 82.39999f, 19.100002f, 81.999985f);
generalPath.curveTo(17.100002f, 81.499985f, 15.700003f, 80.89999f, 14.800002f, 80.19998f);
generalPath.curveTo(13.700002f, 79.19998f, 13.100002f, 77.999985f, 13.100002f, 76.499985f);
generalPath.curveTo(13.100002f, 75.59998f, 13.4000025f, 74.69998f, 13.9000025f, 73.89999f);
generalPath.curveTo(14.4000025f, 73.09999f, 15.200003f, 72.499985f, 16.200003f, 71.999985f);
generalPath.curveTo(17.200003f, 71.59998f, 18.400003f, 71.39999f, 19.900003f, 71.39999f);
generalPath.curveTo(22.200003f, 71.39999f, 24.000004f, 71.89999f, 25.200005f, 72.89999f);
generalPath.curveTo(26.400005f, 73.89999f, 27.000004f, 75.29999f, 27.100004f, 76.999985f);
generalPath.lineTo(23.300005f, 77.19998f);
generalPath.curveTo(23.100004f, 76.29998f, 22.800005f, 75.59998f, 22.300005f, 75.19998f);
generalPath.curveTo(21.800005f, 74.79998f, 21.000006f, 74.59998f, 19.900005f, 74.59998f);
generalPath.curveTo(18.800005f, 74.59998f, 17.900005f, 74.79998f, 17.300005f, 75.29998f);
generalPath.curveTo(16.900005f, 75.59998f, 16.700005f, 75.99998f, 16.700005f, 76.39998f);
generalPath.curveTo(16.700005f, 76.79998f, 16.900005f, 77.19998f, 17.300005f, 77.49998f);
generalPath.curveTo(17.800005f, 77.89998f, 18.900005f, 78.29998f, 20.800005f, 78.699974f);
generalPath.curveTo(22.700005f, 79.09997f, 24.000006f, 79.599976f, 24.900005f, 79.99998f);
generalPath.curveTo(25.800005f, 80.49998f, 26.500006f, 81.099976f, 27.000006f, 81.89998f);
generalPath.curveTo(27.500006f, 82.69998f, 27.700006f, 83.69998f, 27.700006f, 84.79998f);
generalPath.curveTo(27.700006f, 85.89998f, 27.400007f, 86.79998f, 26.800007f, 87.79998f);
generalPath.curveTo(26.200006f, 88.69998f, 25.400007f, 89.39998f, 24.300007f, 89.89998f);
generalPath.curveTo(23.200006f, 90.29998f, 21.900007f, 90.599976f, 20.200006f, 90.599976f);
generalPath.curveTo(17.800007f, 90.599976f, 16.000008f, 90.099976f, 14.800007f, 88.99998f);
generalPath.curveTo(13.600007f, 87.699974f, 12.800007f, 86.099976f, 12.600007f, 84.099976f);
generalPath.closePath();
generalPath.moveTo(35.1f, 90.1f);
generalPath.lineTo(35.1f, 74.7f);
generalPath.lineTo(29.599998f, 74.7f);
generalPath.lineTo(29.599998f, 71.6f);
generalPath.lineTo(44.399998f, 71.6f);
generalPath.lineTo(44.399998f, 74.7f);
generalPath.lineTo(38.899998f, 74.7f);
generalPath.lineTo(38.899998f, 90.0f);
generalPath.lineTo(35.1f, 90.0f);
generalPath.closePath();
generalPath.moveTo(47.0f, 90.1f);
generalPath.lineTo(47.0f, 71.8f);
generalPath.lineTo(50.8f, 71.8f);
generalPath.lineTo(50.8f, 87.0f);
generalPath.lineTo(60.199997f, 87.0f);
generalPath.lineTo(60.199997f, 90.1f);
generalPath.lineTo(47.0f, 90.1f);
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
	private ext_stl() {
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
       ext_stl base = new ext_stl();
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
       ext_stl base = new ext_stl();
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
        return ext_stl::new;
    }
}

