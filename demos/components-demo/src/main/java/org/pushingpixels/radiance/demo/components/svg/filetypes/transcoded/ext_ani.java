package org.pushingpixels.radiance.demo.components.svg.filetypes.transcoded;

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
public class ext_ani implements RadianceIcon {
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
generalPath.moveTo(32.2f, 91.1f);
generalPath.lineTo(27.800001f, 91.1f);
generalPath.lineTo(26.1f, 86.6f);
generalPath.lineTo(18.1f, 86.6f);
generalPath.lineTo(16.5f, 91.1f);
generalPath.lineTo(12.2f, 91.1f);
generalPath.lineTo(20.0f, 71.2f);
generalPath.lineTo(24.3f, 71.2f);
generalPath.lineTo(32.2f, 91.1f);
generalPath.closePath();
generalPath.moveTo(24.800001f, 83.2f);
generalPath.lineTo(22.0f, 75.9f);
generalPath.lineTo(19.3f, 83.3f);
generalPath.lineTo(24.8f, 83.3f);
generalPath.closePath();
generalPath.moveTo(34.4f, 91.1f);
generalPath.lineTo(34.4f, 71.2f);
generalPath.lineTo(38.300003f, 71.2f);
generalPath.lineTo(46.500004f, 84.399994f);
generalPath.lineTo(46.500004f, 71.2f);
generalPath.lineTo(50.200005f, 71.2f);
generalPath.lineTo(50.200005f, 91.0f);
generalPath.lineTo(46.200005f, 91.0f);
generalPath.lineTo(38.100006f, 78.1f);
generalPath.lineTo(38.100006f, 91.0f);
generalPath.lineTo(34.400005f, 91.0f);
generalPath.closePath();
generalPath.moveTo(54.4f, 91.1f);
generalPath.lineTo(54.4f, 71.2f);
generalPath.lineTo(58.4f, 71.2f);
generalPath.lineTo(58.4f, 91.0f);
generalPath.lineTo(54.4f, 91.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(51.4f, 18.0f);
generalPath.lineTo(21.5f, 18.0f);
generalPath.curveTo(20.0f, 18.0f, 18.9f, 19.2f, 18.9f, 20.6f);
generalPath.curveTo(18.9f, 22.1f, 20.1f, 23.2f, 21.5f, 23.2f);
generalPath.lineTo(21.6f, 23.2f);
generalPath.lineTo(21.6f, 25.800001f);
generalPath.curveTo(21.6f, 31.300001f, 24.9f, 36.2f, 30.1f, 38.2f);
generalPath.curveTo(30.4f, 38.3f, 30.6f, 38.600002f, 30.6f, 38.9f);
generalPath.lineTo(30.6f, 39.100002f);
generalPath.curveTo(30.6f, 39.4f, 30.4f, 39.7f, 30.1f, 39.800003f);
generalPath.curveTo(25.0f, 41.800003f, 21.6f, 46.700005f, 21.6f, 52.200005f);
generalPath.lineTo(21.6f, 54.800003f);
generalPath.lineTo(21.5f, 54.800003f);
generalPath.curveTo(20.0f, 54.800003f, 18.9f, 56.000004f, 18.9f, 57.4f);
generalPath.curveTo(18.9f, 58.9f, 20.1f, 60.0f, 21.5f, 60.0f);
generalPath.lineTo(51.3f, 60.0f);
generalPath.curveTo(52.8f, 60.0f, 53.899998f, 58.8f, 53.899998f, 57.4f);
generalPath.curveTo(53.899998f, 55.9f, 52.699997f, 54.800003f, 51.3f, 54.800003f);
generalPath.lineTo(51.2f, 54.800003f);
generalPath.lineTo(51.2f, 52.200005f);
generalPath.curveTo(51.2f, 46.700005f, 47.9f, 41.800003f, 42.7f, 39.800003f);
generalPath.curveTo(42.4f, 39.700005f, 42.2f, 39.4f, 42.2f, 39.100002f);
generalPath.lineTo(42.2f, 38.9f);
generalPath.curveTo(42.2f, 38.600002f, 42.4f, 38.300003f, 42.7f, 38.2f);
generalPath.curveTo(47.8f, 36.2f, 51.2f, 31.300001f, 51.2f, 25.800001f);
generalPath.lineTo(51.2f, 23.2f);
generalPath.lineTo(51.3f, 23.2f);
generalPath.curveTo(52.8f, 23.2f, 53.899998f, 22.0f, 53.899998f, 20.6f);
generalPath.curveTo(53.999996f, 19.2f, 52.8f, 18.0f, 51.399998f, 18.0f);
generalPath.closePath();
generalPath.moveTo(47.800003f, 25.9f);
generalPath.curveTo(47.800003f, 29.9f, 45.300003f, 33.6f, 41.600002f, 35.0f);
generalPath.curveTo(40.000004f, 35.6f, 38.9f, 37.2f, 38.9f, 38.9f);
generalPath.lineTo(38.9f, 39.100002f);
generalPath.curveTo(38.9f, 40.800003f, 40.0f, 42.4f, 41.600002f, 43.000004f);
generalPath.curveTo(45.4f, 44.500004f, 47.800003f, 48.100002f, 47.800003f, 52.100006f);
generalPath.lineTo(47.800003f, 54.700005f);
generalPath.lineTo(25.1f, 54.700005f);
generalPath.lineTo(25.1f, 52.100006f);
generalPath.curveTo(25.1f, 48.100006f, 27.6f, 44.400005f, 31.3f, 43.000008f);
generalPath.curveTo(32.899998f, 42.40001f, 34.0f, 40.800007f, 34.0f, 39.100006f);
generalPath.lineTo(34.0f, 38.900005f);
generalPath.curveTo(34.0f, 37.200005f, 32.9f, 35.600006f, 31.3f, 35.000004f);
generalPath.curveTo(27.552471f, 33.538002f, 25.089231f, 29.922602f, 25.099998f, 25.900003f);
generalPath.lineTo(25.099998f, 23.300003f);
generalPath.lineTo(47.699997f, 23.300003f);
generalPath.lineTo(47.699997f, 25.900003f);
generalPath.closePath();
generalPath.moveTo(28.700003f, 30.3f);
generalPath.curveTo(28.500002f, 29.9f, 28.500002f, 29.5f, 28.900003f, 29.199999f);
generalPath.curveTo(29.000004f, 29.099998f, 29.200003f, 29.099998f, 29.300003f, 29.099998f);
generalPath.lineTo(43.4f, 29.099998f);
generalPath.curveTo(43.800003f, 29.099998f, 44.2f, 29.399998f, 44.2f, 29.899998f);
generalPath.curveTo(44.2f, 30.099998f, 44.2f, 30.199997f, 44.100002f, 30.299997f);
generalPath.curveTo(43.2f, 31.499998f, 42.100002f, 32.399998f, 40.7f, 32.999996f);
generalPath.curveTo(39.2f, 33.599995f, 38.0f, 34.599995f, 37.3f, 35.999996f);
generalPath.curveTo(37.0f, 36.499996f, 36.399998f, 36.699997f, 35.899998f, 36.399998f);
generalPath.curveTo(35.699997f, 36.3f, 35.6f, 36.199997f, 35.499996f, 35.999996f);
generalPath.curveTo(34.799995f, 34.599995f, 33.599995f, 33.499996f, 32.099995f, 32.999996f);
generalPath.curveTo(30.799995f, 32.499996f, 29.599995f, 31.499996f, 28.699995f, 30.299995f);
generalPath.closePath();
generalPath.moveTo(38.700005f, 46.199997f);
generalPath.curveTo(39.400005f, 46.899998f, 40.400005f, 47.299995f, 41.400005f, 47.299995f);
generalPath.curveTo(43.300007f, 47.299995f, 44.900005f, 48.599995f, 45.300007f, 50.399994f);
generalPath.lineTo(45.300007f, 50.599995f);
generalPath.curveTo(45.400005f, 50.999996f, 45.400005f, 51.399994f, 45.400005f, 51.799995f);
generalPath.curveTo(45.400005f, 52.299995f, 45.100006f, 52.699997f, 44.600006f, 52.699997f);
generalPath.lineTo(28.2f, 52.699997f);
generalPath.curveTo(27.7f, 52.699997f, 27.300001f, 52.299995f, 27.300001f, 51.799995f);
generalPath.curveTo(27.300001f, 51.399994f, 27.400002f, 50.899994f, 27.500002f, 50.499996f);
generalPath.lineTo(27.500002f, 50.299995f);
generalPath.curveTo(28.000002f, 48.499996f, 29.600002f, 47.299995f, 31.400002f, 47.299995f);
generalPath.curveTo(32.4f, 47.299995f, 33.4f, 46.899994f, 34.100002f, 46.299995f);
generalPath.curveTo(34.600002f, 45.799995f, 35.100002f, 45.199997f, 35.4f, 44.599995f);
generalPath.curveTo(35.600002f, 44.199993f, 36.100002f, 43.999996f, 36.5f, 44.099995f);
generalPath.curveTo(36.8f, 44.199993f, 37.1f, 44.399994f, 37.2f, 44.699993f);
generalPath.curveTo(37.7f, 45.199993f, 38.100002f, 45.699993f, 38.7f, 46.199993f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.45800018310547, 60.099998474121094), new Point2D.Double(36.45800018310547, 18.0), new float[] {0.005f,0.343f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 130, 129, 255)) : new Color(0, 130, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 106, 105, 255)) : new Color(0, 106, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 56, 54, 255)) : new Color(0, 56, 54, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
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
// _0_3_1
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
	private ext_ani() {
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
       ext_ani base = new ext_ani();
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
       ext_ani base = new ext_ani();
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
        return ext_ani::new;
    }
}

