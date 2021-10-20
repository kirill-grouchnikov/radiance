package org.pushingpixels.radiance.demo.component.svg.filetypes.transcoded;

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
public class ext_skin implements RadianceIcon {
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.265000104904175), new Point2D.Double(36.0, 100.25), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(6.7f, 84.0f);
generalPath.lineTo(10.299999f, 83.7f);
generalPath.curveTo(10.499999f, 84.899994f, 10.9f, 85.7f, 11.599999f, 86.299995f);
generalPath.curveTo(12.299999f, 86.899994f, 13.099999f, 87.1f, 14.199999f, 87.1f);
generalPath.curveTo(15.399999f, 87.1f, 16.3f, 86.9f, 16.9f, 86.4f);
generalPath.curveTo(17.5f, 85.9f, 17.8f, 85.3f, 17.8f, 84.700005f);
generalPath.curveTo(17.8f, 84.3f, 17.699999f, 83.9f, 17.4f, 83.600006f);
generalPath.curveTo(17.1f, 83.3f, 16.699999f, 83.00001f, 16.1f, 82.8f);
generalPath.curveTo(15.700001f, 82.700005f, 14.700001f, 82.4f, 13.200001f, 82.0f);
generalPath.curveTo(11.200001f, 81.5f, 9.900001f, 80.9f, 9.1f, 80.2f);
generalPath.curveTo(8.0f, 79.2f, 7.4000006f, 78.0f, 7.4000006f, 76.6f);
generalPath.curveTo(7.4000006f, 75.7f, 7.700001f, 74.799995f, 8.200001f, 74.0f);
generalPath.curveTo(8.700001f, 73.200005f, 9.500001f, 72.6f, 10.500001f, 72.2f);
generalPath.curveTo(11.500001f, 71.799995f, 12.700001f, 71.6f, 14.1f, 71.6f);
generalPath.curveTo(16.4f, 71.6f, 18.1f, 72.1f, 19.2f, 73.1f);
generalPath.curveTo(20.300001f, 74.1f, 20.900002f, 75.4f, 21.0f, 77.0f);
generalPath.lineTo(17.3f, 77.2f);
generalPath.curveTo(17.099998f, 76.299995f, 16.8f, 75.6f, 16.3f, 75.2f);
generalPath.curveTo(15.799999f, 74.799995f, 14.999999f, 74.6f, 13.999999f, 74.6f);
generalPath.curveTo(12.899999f, 74.6f, 12.099999f, 74.799995f, 11.499999f, 75.2f);
generalPath.curveTo(11.099999f, 75.5f, 10.899999f, 75.799995f, 10.899999f, 76.299995f);
generalPath.curveTo(10.899999f, 76.7f, 11.099998f, 77.1f, 11.399999f, 77.399994f);
generalPath.curveTo(11.899999f, 77.799995f, 12.999999f, 78.2f, 14.799999f, 78.59999f);
generalPath.curveTo(16.599998f, 78.99999f, 17.9f, 79.399994f, 18.699999f, 79.899994f);
generalPath.curveTo(19.599998f, 80.299995f, 20.199999f, 80.899994f, 20.699999f, 81.7f);
generalPath.curveTo(21.199999f, 82.5f, 21.4f, 83.399994f, 21.4f, 84.5f);
generalPath.curveTo(21.4f, 85.5f, 21.1f, 86.5f, 20.5f, 87.4f);
generalPath.curveTo(19.9f, 88.3f, 19.1f, 89.0f, 18.1f, 89.4f);
generalPath.curveTo(17.0f, 89.8f, 15.700001f, 90.1f, 14.200001f, 90.1f);
generalPath.curveTo(11.900001f, 90.1f, 10.200001f, 89.6f, 8.900001f, 88.5f);
generalPath.curveTo(7.6000004f, 87.4f, 6.9f, 86.0f, 6.7f, 84.0f);
generalPath.closePath();
generalPath.moveTo(24.5f, 89.8f);
generalPath.lineTo(24.5f, 71.9f);
generalPath.lineTo(28.2f, 71.9f);
generalPath.lineTo(28.2f, 79.8f);
generalPath.lineTo(35.600002f, 71.9f);
generalPath.lineTo(40.500004f, 71.9f);
generalPath.lineTo(33.700005f, 78.9f);
generalPath.lineTo(40.900005f, 89.8f);
generalPath.lineTo(36.200005f, 89.8f);
generalPath.lineTo(31.200005f, 81.4f);
generalPath.lineTo(28.200005f, 84.4f);
generalPath.lineTo(28.200005f, 89.8f);
generalPath.lineTo(24.500004f, 89.8f);
generalPath.closePath();
generalPath.moveTo(42.6f, 89.8f);
generalPath.lineTo(42.6f, 71.9f);
generalPath.lineTo(46.3f, 71.9f);
generalPath.lineTo(46.3f, 89.8f);
generalPath.lineTo(42.6f, 89.8f);
generalPath.closePath();
generalPath.moveTo(49.699997f, 89.8f);
generalPath.lineTo(49.699997f, 71.9f);
generalPath.lineTo(53.299995f, 71.9f);
generalPath.lineTo(60.699997f, 83.9f);
generalPath.lineTo(60.699997f, 71.9f);
generalPath.lineTo(64.1f, 71.9f);
generalPath.lineTo(64.1f, 89.8f);
generalPath.lineTo(60.399998f, 89.8f);
generalPath.lineTo(53.1f, 78.100006f);
generalPath.lineTo(53.1f, 89.8f);
generalPath.lineTo(49.699997f, 89.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 73.45700073242188), new Point2D.Double(58.569000244140625, 86.95700073242188), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(44.2f, 52.2f);
generalPath.lineTo(44.8f, 50.7f);
generalPath.curveTo(45.7f, 47.9f, 46.6f, 45.0f, 47.5f, 42.2f);
generalPath.curveTo(47.8f, 41.100002f, 48.2f, 40.0f, 48.9f, 39.100002f);
generalPath.curveTo(50.0f, 37.600002f, 51.5f, 36.800003f, 53.2f, 36.600002f);
generalPath.curveTo(53.9f, 36.500004f, 54.600002f, 36.4f, 55.3f, 36.4f);
generalPath.lineTo(62.0f, 36.4f);
generalPath.curveTo(61.9f, 36.5f, 61.9f, 36.600002f, 61.9f, 36.7f);
generalPath.curveTo(61.100002f, 38.100002f, 60.4f, 39.5f, 59.600002f, 40.9f);
generalPath.lineTo(55.4f, 48.100002f);
generalPath.curveTo(54.5f, 49.600002f, 53.5f, 51.100002f, 52.300003f, 52.500004f);
generalPath.curveTo(51.500004f, 53.500004f, 50.600002f, 54.500004f, 49.500004f, 55.200005f);
generalPath.curveTo(48.700005f, 55.700005f, 47.900005f, 56.000004f, 47.000004f, 56.000004f);
generalPath.lineTo(37.100006f, 56.000004f);
generalPath.curveTo(36.100006f, 56.000004f, 35.300007f, 55.600002f, 34.600006f, 55.000004f);
generalPath.curveTo(33.600006f, 54.100002f, 33.000008f, 52.800003f, 32.500008f, 51.600002f);
generalPath.curveTo(31.600008f, 49.300003f, 31.100008f, 46.800003f, 30.500008f, 44.4f);
generalPath.curveTo(30.200008f, 43.300003f, 29.900007f, 42.100002f, 29.600008f, 41.0f);
generalPath.curveTo(29.600008f, 40.9f, 29.500008f, 40.9f, 29.500008f, 40.8f);
generalPath.lineTo(29.300007f, 41.0f);
generalPath.curveTo(28.000008f, 42.3f, 26.900007f, 43.7f, 25.900007f, 45.2f);
generalPath.curveTo(25.600008f, 45.600002f, 25.500008f, 46.100002f, 25.400007f, 46.600002f);
generalPath.curveTo(24.800007f, 48.4f, 24.300007f, 50.2f, 23.700006f, 51.9f);
generalPath.curveTo(23.100006f, 53.600002f, 22.100006f, 54.9f, 20.400007f, 55.7f);
generalPath.curveTo(19.400007f, 56.2f, 18.400007f, 56.4f, 17.300007f, 56.4f);
generalPath.curveTo(15.7000065f, 56.4f, 14.100007f, 56.4f, 12.500007f, 56.5f);
generalPath.curveTo(12.100007f, 56.5f, 12.100007f, 56.5f, 12.2000065f, 56.1f);
generalPath.curveTo(12.900006f, 53.6f, 13.7000065f, 51.1f, 14.800007f, 48.699997f);
generalPath.curveTo(15.900007f, 46.199997f, 17.200006f, 43.899998f, 18.900007f, 41.799995f);
generalPath.curveTo(20.000008f, 40.299995f, 21.300007f, 38.999996f, 22.800007f, 37.999996f);
generalPath.curveTo(23.600006f, 37.499996f, 24.400007f, 37.099995f, 25.400007f, 36.999996f);
generalPath.lineTo(36.0f, 36.999996f);
generalPath.curveTo(37.8f, 36.999996f, 39.1f, 37.699997f, 40.1f, 39.199997f);
generalPath.curveTo(40.699997f, 40.1f, 41.1f, 41.1f, 41.5f, 42.1f);
generalPath.curveTo(42.2f, 44.199997f, 42.7f, 46.3f, 43.2f, 48.399998f);
generalPath.lineTo(44.100002f, 51.999996f);
generalPath.curveTo(44.100002f, 52.099995f, 44.100002f, 52.199997f, 44.2f, 52.199997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 56.5), new Point2D.Double(37.0, 36.5), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
		return 0.9980000257492065;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_skin() {
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
       ext_skin base = new ext_skin();
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
       ext_skin base = new ext_skin();
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
        return ext_skin::new;
    }
}

