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
public class ext_icns implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
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
generalPath.moveTo(9.0f, 91.1f);
generalPath.lineTo(9.0f, 73.9f);
generalPath.lineTo(12.5f, 73.9f);
generalPath.lineTo(12.5f, 91.100006f);
generalPath.lineTo(9.0f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(26.9f, 84.799995f);
generalPath.lineTo(30.3f, 85.899994f);
generalPath.curveTo(29.8f, 87.799995f, 28.9f, 89.2f, 27.699999f, 90.09999f);
generalPath.curveTo(26.499998f, 90.99999f, 24.999998f, 91.49999f, 23.099998f, 91.49999f);
generalPath.curveTo(20.8f, 91.49999f, 18.899998f, 90.69999f, 17.399998f, 89.19999f);
generalPath.curveTo(15.899998f, 87.69999f, 15.199998f, 85.49999f, 15.199998f, 82.79999f);
generalPath.curveTo(15.199998f, 79.89999f, 15.899998f, 77.69999f, 17.399998f, 76.09999f);
generalPath.curveTo(18.899998f, 74.49999f, 20.799997f, 73.69999f, 23.299997f, 73.69999f);
generalPath.curveTo(25.399998f, 73.69999f, 27.099997f, 74.29999f, 28.499996f, 75.59999f);
generalPath.curveTo(29.299995f, 76.29999f, 29.899996f, 77.399994f, 30.299995f, 78.79999f);
generalPath.lineTo(26.799995f, 79.59999f);
generalPath.curveTo(26.599995f, 78.69999f, 26.199995f, 77.99999f, 25.499996f, 77.49999f);
generalPath.curveTo(24.799997f, 76.99999f, 24.099997f, 76.69999f, 23.099997f, 76.69999f);
generalPath.curveTo(21.799997f, 76.69999f, 20.799997f, 77.19999f, 19.999996f, 78.09999f);
generalPath.curveTo(19.199997f, 78.99999f, 18.799995f, 80.49999f, 18.799995f, 82.49999f);
generalPath.curveTo(18.799995f, 84.69999f, 19.199995f, 86.19999f, 19.999996f, 87.09999f);
generalPath.curveTo(20.799997f, 87.99999f, 21.799995f, 88.49999f, 23.099997f, 88.49999f);
generalPath.curveTo(23.999996f, 88.49999f, 24.799997f, 88.19999f, 25.499996f, 87.59999f);
generalPath.curveTo(26.199995f, 86.99999f, 26.599997f, 85.99999f, 26.899996f, 84.79999f);
generalPath.closePath();
generalPath.moveTo(33.3f, 91.1f);
generalPath.lineTo(33.3f, 73.9f);
generalPath.lineTo(36.7f, 73.9f);
generalPath.lineTo(43.8f, 85.4f);
generalPath.lineTo(43.8f, 73.9f);
generalPath.lineTo(47.0f, 73.9f);
generalPath.lineTo(47.0f, 91.100006f);
generalPath.lineTo(43.5f, 91.100006f);
generalPath.lineTo(36.5f, 79.90001f);
generalPath.lineTo(36.5f, 91.100006f);
generalPath.lineTo(33.3f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(49.8f, 85.5f);
generalPath.lineTo(53.2f, 85.2f);
generalPath.curveTo(53.4f, 86.299995f, 53.8f, 87.2f, 54.4f, 87.7f);
generalPath.curveTo(55.000004f, 88.2f, 55.9f, 88.5f, 56.9f, 88.5f);
generalPath.curveTo(58.0f, 88.5f, 58.9f, 88.3f, 59.4f, 87.8f);
generalPath.curveTo(59.9f, 87.3f, 60.300003f, 86.8f, 60.300003f, 86.100006f);
generalPath.curveTo(60.300003f, 85.700005f, 60.200005f, 85.3f, 59.9f, 85.100006f);
generalPath.curveTo(59.6f, 84.90001f, 59.2f, 84.600006f, 58.600002f, 84.40001f);
generalPath.curveTo(58.2f, 84.30001f, 57.300003f, 84.00001f, 55.800003f, 83.600006f);
generalPath.curveTo(53.9f, 83.100006f, 52.600002f, 82.600006f, 51.9f, 81.90001f);
generalPath.curveTo(50.800003f, 81.00001f, 50.300003f, 79.80001f, 50.300003f, 78.40001f);
generalPath.curveTo(50.300003f, 77.50001f, 50.500004f, 76.70001f, 51.100002f, 75.90001f);
generalPath.curveTo(51.600002f, 75.100006f, 52.300003f, 74.600006f, 53.300003f, 74.20001f);
generalPath.curveTo(54.300003f, 73.80002f, 55.4f, 73.60001f, 56.700005f, 73.60001f);
generalPath.curveTo(58.900005f, 73.60001f, 60.500004f, 74.10001f, 61.600006f, 75.000015f);
generalPath.curveTo(62.700005f, 75.90002f, 63.300007f, 77.20001f, 63.300007f, 78.80002f);
generalPath.lineTo(59.800007f, 79.000015f);
generalPath.curveTo(59.70001f, 78.10001f, 59.300007f, 77.500015f, 58.800007f, 77.10001f);
generalPath.curveTo(58.300007f, 76.70001f, 57.600006f, 76.500015f, 56.600006f, 76.500015f);
generalPath.curveTo(55.600006f, 76.500015f, 54.800007f, 76.70001f, 54.200005f, 77.10001f);
generalPath.curveTo(53.800003f, 77.40002f, 53.600006f, 77.70001f, 53.600006f, 78.20001f);
generalPath.curveTo(53.600006f, 78.60001f, 53.800007f, 79.000015f, 54.100006f, 79.20001f);
generalPath.curveTo(54.500008f, 79.60001f, 55.600006f, 80.000015f, 57.300007f, 80.30001f);
generalPath.curveTo(59.000008f, 80.70001f, 60.300007f, 81.10001f, 61.100006f, 81.50001f);
generalPath.curveTo(61.900005f, 81.90001f, 62.600006f, 82.50001f, 63.000008f, 83.200005f);
generalPath.curveTo(63.40001f, 83.9f, 63.70001f, 84.9f, 63.70001f, 85.9f);
generalPath.curveTo(63.70001f, 86.9f, 63.40001f, 87.8f, 62.90001f, 88.700005f);
generalPath.curveTo(62.40001f, 89.600006f, 61.60001f, 90.200005f, 60.60001f, 90.600006f);
generalPath.curveTo(59.60001f, 91.00001f, 58.30001f, 91.200005f, 56.80001f, 91.200005f);
generalPath.curveTo(54.60001f, 91.200005f, 52.90001f, 90.700005f, 51.80001f, 89.700005f);
generalPath.curveTo(50.700012f, 88.700005f, 50.00001f, 87.4f, 49.80001f, 85.50001f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(35.8f, 16.2f);
generalPath.curveTo(36.0f, 15.700001f, 36.2f, 15.700001f, 36.399998f, 16.2f);
generalPath.lineTo(41.8f, 32.9f);
generalPath.curveTo(42.0f, 33.4f, 42.399998f, 33.800003f, 43.0f, 33.800003f);
generalPath.lineTo(60.6f, 33.800003f);
generalPath.curveTo(61.1f, 33.800003f, 61.199997f, 34.000004f, 60.8f, 34.300003f);
generalPath.lineTo(46.5f, 44.6f);
generalPath.curveTo(46.1f, 44.899998f, 45.9f, 45.5f, 46.1f, 46.0f);
generalPath.lineTo(51.5f, 62.7f);
generalPath.curveTo(51.7f, 63.2f, 51.4f, 63.3f, 51.1f, 63.0f);
generalPath.lineTo(36.8f, 52.7f);
generalPath.curveTo(36.399998f, 52.4f, 35.8f, 52.4f, 35.3f, 52.7f);
generalPath.lineTo(21.2f, 63.0f);
generalPath.curveTo(20.800001f, 63.3f, 20.6f, 63.1f, 20.800001f, 62.7f);
generalPath.lineTo(26.2f, 46.0f);
generalPath.curveTo(26.300001f, 45.5f, 26.2f, 44.9f, 25.800001f, 44.6f);
generalPath.lineTo(11.5f, 34.3f);
generalPath.curveTo(11.1f, 34.0f, 11.2f, 33.8f, 11.7f, 33.8f);
generalPath.lineTo(29.3f, 33.8f);
generalPath.curveTo(29.8f, 33.8f, 30.3f, 33.399998f, 30.5f, 32.899998f);
generalPath.lineTo(35.8f, 16.199997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.11800003051758, 63.15800094604492), new Point2D.Double(36.11800003051758, 15.819999694824219), new float[] {0.005f,0.343f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 130, 129, 255)) : new Color(0, 130, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 106, 105, 255)) : new Color(0, 106, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 56, 54, 255)) : new Color(0, 56, 54, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_icns() {
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
       ext_icns base = new ext_icns();
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
       ext_icns base = new ext_icns();
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
        return ext_icns::new;
    }
}

