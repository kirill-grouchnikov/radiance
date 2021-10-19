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
public class ext_img implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(11.1f, 92.1f);
generalPath.lineTo(11.1f, 72.2f);
generalPath.lineTo(15.1f, 72.2f);
generalPath.lineTo(15.1f, 92.0f);
generalPath.lineTo(11.1f, 92.0f);
generalPath.closePath();
generalPath.moveTo(19.0f, 92.1f);
generalPath.lineTo(19.0f, 72.2f);
generalPath.lineTo(25.0f, 72.2f);
generalPath.lineTo(28.6f, 85.7f);
generalPath.lineTo(32.2f, 72.2f);
generalPath.lineTo(38.3f, 72.2f);
generalPath.lineTo(38.3f, 92.0f);
generalPath.lineTo(34.5f, 92.0f);
generalPath.lineTo(34.5f, 76.4f);
generalPath.lineTo(30.5f, 92.0f);
generalPath.lineTo(26.6f, 92.0f);
generalPath.lineTo(22.6f, 76.4f);
generalPath.lineTo(22.6f, 92.0f);
generalPath.lineTo(19.0f, 92.0f);
generalPath.closePath();
generalPath.moveTo(51.7f, 84.799995f);
generalPath.lineTo(51.7f, 81.49999f);
generalPath.lineTo(60.4f, 81.49999f);
generalPath.lineTo(60.4f, 89.399994f);
generalPath.curveTo(59.600002f, 90.2f, 58.300003f, 90.899994f, 56.7f, 91.49999f);
generalPath.curveTo(55.100002f, 92.09999f, 53.5f, 92.399994f, 51.8f, 92.399994f);
generalPath.curveTo(49.7f, 92.399994f, 47.899998f, 91.99999f, 46.3f, 91.09999f);
generalPath.curveTo(44.7f, 90.19999f, 43.6f, 88.99999f, 42.8f, 87.399994f);
generalPath.curveTo(42.0f, 85.799995f, 41.6f, 83.99999f, 41.6f, 82.09999f);
generalPath.curveTo(41.6f, 79.99999f, 42.0f, 78.19999f, 42.899998f, 76.59999f);
generalPath.curveTo(43.799995f, 74.99999f, 45.1f, 73.79999f, 46.699997f, 72.899994f);
generalPath.curveTo(47.999996f, 72.2f, 49.6f, 71.899994f, 51.499996f, 71.899994f);
generalPath.curveTo(53.999996f, 71.899994f, 55.899998f, 72.399994f, 57.299995f, 73.399994f);
generalPath.curveTo(58.699997f, 74.399994f, 59.599995f, 75.899994f, 59.999996f, 77.7f);
generalPath.lineTo(55.999996f, 78.399994f);
generalPath.curveTo(55.699997f, 77.399994f, 55.199997f, 76.7f, 54.399998f, 76.09999f);
generalPath.curveTo(53.6f, 75.49999f, 52.6f, 75.29999f, 51.499996f, 75.29999f);
generalPath.curveTo(49.699997f, 75.29999f, 48.299995f, 75.89999f, 47.299995f, 76.999985f);
generalPath.curveTo(46.299995f, 78.09998f, 45.699997f, 79.79999f, 45.699997f, 81.89999f);
generalPath.curveTo(45.699997f, 84.29999f, 46.199997f, 85.999985f, 47.299995f, 87.19999f);
generalPath.curveTo(48.399994f, 88.39999f, 49.699997f, 88.99999f, 51.499996f, 88.99999f);
generalPath.curveTo(52.299995f, 88.99999f, 53.199997f, 88.799995f, 54.099995f, 88.49999f);
generalPath.curveTo(54.999996f, 88.19999f, 55.699993f, 87.799995f, 56.299995f, 87.299995f);
generalPath.lineTo(56.299995f, 84.799995f);
generalPath.lineTo(51.699997f, 84.799995f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_img() {
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
       ext_img base = new ext_img();
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
       ext_img base = new ext_img();
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
        return ext_img::new;
    }
}

