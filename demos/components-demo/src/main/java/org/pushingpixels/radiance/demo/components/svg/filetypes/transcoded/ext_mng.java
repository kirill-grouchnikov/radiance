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
public class ext_mng implements RadianceIcon {
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
generalPath.moveTo(58.3f, 64.2f);
generalPath.lineTo(13.7f, 64.2f);
generalPath.curveTo(13.099999f, 64.2f, 12.5f, 63.699997f, 12.5f, 62.999996f);
generalPath.lineTo(12.5f, 18.4f);
generalPath.curveTo(12.5f, 17.8f, 13.0f, 17.199999f, 13.7f, 17.199999f);
generalPath.lineTo(58.4f, 17.199999f);
generalPath.curveTo(59.0f, 17.199999f, 59.600002f, 17.699999f, 59.600002f, 18.4f);
generalPath.lineTo(59.600002f, 63.1f);
generalPath.curveTo(59.500004f, 63.699997f, 59.000004f, 64.2f, 58.300003f, 64.2f);
generalPath.closePath();
generalPath.moveTo(14.899998f, 61.299995f);
generalPath.curveTo(14.899998f, 61.699997f, 15.0999975f, 61.899994f, 15.499998f, 61.899994f);
generalPath.lineTo(56.6f, 61.899994f);
generalPath.curveTo(57.0f, 61.899994f, 57.199997f, 61.699993f, 57.199997f, 61.299995f);
generalPath.lineTo(57.199997f, 50.7f);
generalPath.curveTo(57.199997f, 50.3f, 56.999996f, 50.100002f, 56.6f, 50.100002f);
generalPath.lineTo(15.4f, 50.100002f);
generalPath.curveTo(15.0f, 50.100002f, 14.799999f, 50.300003f, 14.799999f, 50.7f);
generalPath.lineTo(14.799999f, 61.300003f);
generalPath.closePath();
generalPath.moveTo(56.6f, 19.599995f);
generalPath.lineTo(15.4f, 19.599995f);
generalPath.curveTo(15.0f, 19.599995f, 14.799999f, 19.799995f, 14.799999f, 20.199995f);
generalPath.lineTo(14.799999f, 47.199997f);
generalPath.curveTo(14.799999f, 47.299995f, 14.9f, 47.399998f, 14.9f, 47.499996f);
generalPath.lineTo(23.599998f, 36.6f);
generalPath.lineTo(32.399998f, 41.899998f);
generalPath.lineTo(42.399998f, 30.099998f);
generalPath.lineTo(57.1f, 41.399998f);
generalPath.lineTo(57.1f, 20.2f);
generalPath.curveTo(57.199997f, 19.800001f, 56.899998f, 19.6f, 56.6f, 19.6f);
generalPath.closePath();
generalPath.moveTo(20.7f, 52.5f);
generalPath.curveTo(22.6f, 52.5f, 24.2f, 54.1f, 24.2f, 56.0f);
generalPath.curveTo(24.2f, 57.9f, 22.6f, 59.5f, 20.7f, 59.5f);
generalPath.curveTo(18.800001f, 59.5f, 17.2f, 58.0f, 17.2f, 56.0f);
generalPath.curveTo(17.2f, 54.1f, 18.800001f, 52.5f, 20.7f, 52.5f);
generalPath.closePath();
generalPath.moveTo(27.2f, 54.8f);
generalPath.lineTo(54.2f, 54.8f);
generalPath.curveTo(54.600002f, 54.8f, 54.8f, 55.0f, 54.8f, 55.399998f);
generalPath.lineTo(54.8f, 56.6f);
generalPath.curveTo(54.8f, 57.0f, 54.6f, 57.199997f, 54.2f, 57.199997f);
generalPath.lineTo(27.2f, 57.199997f);
generalPath.curveTo(26.800001f, 57.199997f, 26.6f, 56.999996f, 26.6f, 56.6f);
generalPath.lineTo(26.6f, 55.399998f);
generalPath.curveTo(26.6f, 55.1f, 26.800001f, 54.8f, 27.2f, 54.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 64.24299621582031), new Point2D.Double(36.0, 17.243000030517578), new float[] {0.005f,0.343f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 130, 129, 255)) : new Color(0, 130, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 106, 105, 255)) : new Color(0, 106, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 56, 54, 255)) : new Color(0, 56, 54, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(6.4f, 91.1f);
generalPath.lineTo(6.4f, 71.7f);
generalPath.lineTo(12.3f, 71.7f);
generalPath.lineTo(15.8f, 84.899994f);
generalPath.lineTo(19.3f, 71.7f);
generalPath.lineTo(25.199999f, 71.7f);
generalPath.lineTo(25.199999f, 91.0f);
generalPath.lineTo(21.599998f, 91.0f);
generalPath.lineTo(21.599998f, 75.9f);
generalPath.lineTo(17.699999f, 91.1f);
generalPath.lineTo(13.899999f, 91.1f);
generalPath.lineTo(10.099998f, 75.9f);
generalPath.lineTo(10.099998f, 91.1f);
generalPath.lineTo(6.4f, 91.1f);
generalPath.closePath();
generalPath.moveTo(29.199999f, 91.1f);
generalPath.lineTo(29.199999f, 71.7f);
generalPath.lineTo(33.0f, 71.7f);
generalPath.lineTo(41.0f, 84.6f);
generalPath.lineTo(41.0f, 71.7f);
generalPath.lineTo(44.6f, 71.7f);
generalPath.lineTo(44.6f, 91.0f);
generalPath.lineTo(40.699997f, 91.0f);
generalPath.lineTo(32.899998f, 78.4f);
generalPath.lineTo(32.899998f, 91.0f);
generalPath.lineTo(29.199997f, 91.0f);
generalPath.closePath();
generalPath.moveTo(57.8f, 84.0f);
generalPath.lineTo(57.8f, 80.7f);
generalPath.lineTo(66.3f, 80.7f);
generalPath.lineTo(66.3f, 88.399994f);
generalPath.curveTo(65.5f, 89.2f, 64.3f, 89.899994f, 62.700005f, 90.49999f);
generalPath.curveTo(61.100006f, 91.09999f, 59.600006f, 91.399994f, 58.000004f, 91.399994f);
generalPath.curveTo(56.000004f, 91.399994f, 54.200005f, 90.99999f, 52.700005f, 90.09999f);
generalPath.curveTo(51.200005f, 89.29999f, 50.100006f, 87.99999f, 49.300003f, 86.49999f);
generalPath.curveTo(48.500004f, 84.899994f, 48.200005f, 83.19999f, 48.200005f, 81.399994f);
generalPath.curveTo(48.200005f, 79.399994f, 48.600006f, 77.59999f, 49.500004f, 75.99999f);
generalPath.curveTo(50.300003f, 74.399994f, 51.600002f, 73.19999f, 53.200005f, 72.399994f);
generalPath.curveTo(54.400005f, 71.799995f, 56.000004f, 71.399994f, 57.900005f, 71.399994f);
generalPath.curveTo(60.300007f, 71.399994f, 62.200005f, 71.899994f, 63.600006f, 72.899994f);
generalPath.curveTo(65.00001f, 73.899994f, 65.8f, 75.299995f, 66.200005f, 77.09999f);
generalPath.lineTo(62.300003f, 77.79999f);
generalPath.curveTo(62.000004f, 76.89999f, 61.500004f, 76.09999f, 60.800003f, 75.59999f);
generalPath.curveTo(60.000004f, 75.09999f, 59.100002f, 74.79999f, 58.000004f, 74.79999f);
generalPath.curveTo(56.300003f, 74.79999f, 54.900005f, 75.29999f, 53.900005f, 76.39999f);
generalPath.curveTo(52.900005f, 77.499985f, 52.400005f, 79.09998f, 52.400005f, 81.19999f);
generalPath.curveTo(52.400005f, 83.49999f, 52.900005f, 85.19999f, 53.900005f, 86.39999f);
generalPath.curveTo(54.900005f, 87.499985f, 56.300007f, 88.09998f, 57.900005f, 88.09998f);
generalPath.curveTo(58.700005f, 88.09998f, 59.500004f, 87.89999f, 60.400005f, 87.59998f);
generalPath.curveTo(61.200005f, 87.29998f, 61.900005f, 86.89999f, 62.500004f, 86.39999f);
generalPath.lineTo(62.500004f, 84.0f);
generalPath.lineTo(57.800003f, 84.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
	private ext_mng() {
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
       ext_mng base = new ext_mng();
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
       ext_mng base = new ext_mng();
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
        return ext_mng::new;
    }
}

