package org.pushingpixels.radiance.demo.laf.main.check.svg.filetypes;

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
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_gpg implements RadianceIcon {
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.5f, 84.5f);
generalPath.lineTo(16.5f, 81.1f);
generalPath.lineTo(25.2f, 81.1f);
generalPath.lineTo(25.2f, 89.1f);
generalPath.curveTo(24.400002f, 89.9f, 23.1f, 90.6f, 21.5f, 91.299995f);
generalPath.curveTo(19.9f, 91.899994f, 18.3f, 92.2f, 16.6f, 92.2f);
generalPath.curveTo(14.5f, 92.2f, 12.700001f, 91.799995f, 11.1f, 90.899994f);
generalPath.curveTo(9.5f, 89.99999f, 8.400001f, 88.799995f, 7.6000004f, 87.09999f);
generalPath.curveTo(6.8f, 85.49999f, 6.4000006f, 83.69999f, 6.4000006f, 81.79999f);
generalPath.curveTo(6.4000006f, 79.69999f, 6.8000007f, 77.89999f, 7.700001f, 76.19999f);
generalPath.curveTo(8.6f, 74.49999f, 9.900001f, 73.29999f, 11.500001f, 72.49999f);
generalPath.curveTo(12.800001f, 71.799995f, 14.400002f, 71.49999f, 16.300001f, 71.49999f);
generalPath.curveTo(18.800001f, 71.49999f, 20.7f, 71.99999f, 22.100002f, 73.09999f);
generalPath.curveTo(23.500002f, 74.09999f, 24.400002f, 75.59999f, 24.800003f, 77.399994f);
generalPath.lineTo(20.800003f, 78.2f);
generalPath.curveTo(20.500004f, 77.2f, 20.000004f, 76.399994f, 19.200003f, 75.899994f);
generalPath.curveTo(18.400002f, 75.399994f, 17.600002f, 74.99999f, 16.400003f, 74.99999f);
generalPath.curveTo(14.600003f, 74.99999f, 13.200004f, 75.59999f, 12.200004f, 76.69999f);
generalPath.curveTo(11.200004f, 77.79999f, 10.600003f, 79.49999f, 10.600003f, 81.69999f);
generalPath.curveTo(10.600003f, 84.09999f, 11.100003f, 85.89999f, 12.200004f, 87.09999f);
generalPath.curveTo(13.300004f, 88.29999f, 14.600004f, 88.899994f, 16.400003f, 88.899994f);
generalPath.curveTo(17.200003f, 88.899994f, 18.100004f, 88.7f, 18.900003f, 88.399994f);
generalPath.curveTo(19.800003f, 88.09999f, 20.500004f, 87.7f, 21.100004f, 87.2f);
generalPath.lineTo(21.100004f, 84.7f);
generalPath.lineTo(16.500004f, 84.7f);
generalPath.closePath();
generalPath.moveTo(28.9f, 91.9f);
generalPath.lineTo(28.9f, 71.9f);
generalPath.lineTo(35.4f, 71.9f);
generalPath.curveTo(37.9f, 71.9f, 39.5f, 72.0f, 40.2f, 72.200005f);
generalPath.curveTo(41.3f, 72.50001f, 42.3f, 73.200005f, 43.100002f, 74.200005f);
generalPath.curveTo(43.900005f, 75.200005f, 44.300003f, 76.50001f, 44.300003f, 78.100006f);
generalPath.curveTo(44.300003f, 79.3f, 44.100002f, 80.40001f, 43.600002f, 81.200005f);
generalPath.curveTo(43.100002f, 82.0f, 42.600002f, 82.700005f, 41.9f, 83.200005f);
generalPath.curveTo(41.2f, 83.700005f, 40.5f, 84.00001f, 39.800003f, 84.200005f);
generalPath.curveTo(38.800003f, 84.4f, 37.4f, 84.50001f, 35.600002f, 84.50001f);
generalPath.lineTo(33.0f, 84.50001f);
generalPath.lineTo(33.0f, 92.100006f);
generalPath.lineTo(28.9f, 92.100006f);
generalPath.closePath();
generalPath.moveTo(33.0f, 75.2f);
generalPath.lineTo(33.0f, 80.899994f);
generalPath.lineTo(35.2f, 80.899994f);
generalPath.curveTo(36.8f, 80.899994f, 37.9f, 80.799995f, 38.4f, 80.59999f);
generalPath.curveTo(38.9f, 80.39999f, 39.4f, 80.09999f, 39.7f, 79.59999f);
generalPath.curveTo(40.0f, 79.09999f, 40.2f, 78.59999f, 40.2f, 77.99999f);
generalPath.curveTo(40.2f, 77.299995f, 40.0f, 76.69999f, 39.600002f, 76.19999f);
generalPath.curveTo(39.200005f, 75.69999f, 38.600002f, 75.39999f, 38.000004f, 75.29999f);
generalPath.curveTo(37.500004f, 75.19999f, 36.500004f, 75.19999f, 35.100002f, 75.19999f);
generalPath.lineTo(33.0f, 75.19999f);
generalPath.closePath();
generalPath.moveTo(56.9f, 84.5f);
generalPath.lineTo(56.9f, 81.1f);
generalPath.lineTo(65.6f, 81.1f);
generalPath.lineTo(65.6f, 89.1f);
generalPath.curveTo(64.799995f, 89.9f, 63.5f, 90.6f, 61.899998f, 91.299995f);
generalPath.curveTo(60.299995f, 91.99999f, 58.699997f, 92.2f, 56.999996f, 92.2f);
generalPath.curveTo(54.899998f, 92.2f, 53.099995f, 91.799995f, 51.499996f, 90.899994f);
generalPath.curveTo(49.899998f, 89.99999f, 48.799995f, 88.799995f, 47.999996f, 87.09999f);
generalPath.curveTo(47.199997f, 85.39999f, 46.799995f, 83.69999f, 46.799995f, 81.79999f);
generalPath.curveTo(46.799995f, 79.69999f, 47.199997f, 77.89999f, 48.099995f, 76.19999f);
generalPath.curveTo(48.999992f, 74.49999f, 50.299995f, 73.29999f, 51.899994f, 72.49999f);
generalPath.curveTo(53.199993f, 71.799995f, 54.799995f, 71.49999f, 56.699993f, 71.49999f);
generalPath.curveTo(59.199993f, 71.49999f, 61.099995f, 71.99999f, 62.499992f, 73.09999f);
generalPath.curveTo(63.89999f, 74.19999f, 64.799995f, 75.59999f, 65.19999f, 77.399994f);
generalPath.lineTo(61.19999f, 78.2f);
generalPath.curveTo(60.89999f, 77.2f, 60.39999f, 76.399994f, 59.59999f, 75.899994f);
generalPath.curveTo(58.79999f, 75.399994f, 58.0f, 75.0f, 56.9f, 75.0f);
generalPath.curveTo(55.100002f, 75.0f, 53.7f, 75.6f, 52.7f, 76.7f);
generalPath.curveTo(51.7f, 77.799995f, 51.100002f, 79.5f, 51.100002f, 81.7f);
generalPath.curveTo(51.100002f, 84.1f, 51.600002f, 85.899994f, 52.7f, 87.1f);
generalPath.curveTo(53.8f, 88.3f, 55.100002f, 88.9f, 56.9f, 88.9f);
generalPath.curveTo(57.7f, 88.9f, 58.600002f, 88.700005f, 59.4f, 88.4f);
generalPath.curveTo(60.2f, 88.1f, 61.0f, 87.700005f, 61.600002f, 87.200005f);
generalPath.lineTo(61.600002f, 84.700005f);
generalPath.lineTo(56.9f, 84.700005f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -952.3619995117188f));
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
generalPath.moveTo(35.4f, 978.9f);
generalPath.curveTo(38.5f, 982.0f, 39.5f, 986.4f, 38.300003f, 990.4f);
generalPath.lineTo(54.800003f, 1006.9f);
generalPath.lineTo(55.200005f, 1014.30005f);
generalPath.lineTo(45.900005f, 1013.50006f);
generalPath.lineTo(45.900005f, 1008.80005f);
generalPath.lineTo(41.200005f, 1008.80005f);
generalPath.lineTo(41.200005f, 1004.10004f);
generalPath.lineTo(36.500004f, 1004.10004f);
generalPath.lineTo(30.500004f, 998.10004f);
generalPath.curveTo(26.600004f, 999.30005f, 22.100004f, 998.30005f, 19.000004f, 995.2f);
generalPath.curveTo(14.500004f, 990.7f, 14.500004f, 983.4f, 19.000004f, 978.9f);
generalPath.curveTo(23.600004f, 974.4f, 30.900003f, 974.4f, 35.4f, 978.9f);
generalPath.closePath();
generalPath.moveTo(26.800001f, 982.0f);
generalPath.curveTo(26.177185f, 981.3759f, 25.3317f, 981.0252f, 24.45f, 981.0252f);
generalPath.curveTo(23.568304f, 981.0252f, 22.722818f, 981.3759f, 22.100002f, 982.0f);
generalPath.curveTo(21.475904f, 982.6228f, 21.125183f, 983.4683f, 21.125183f, 984.35f);
generalPath.curveTo(21.125183f, 985.2317f, 21.475904f, 986.0772f, 22.100002f, 986.7f);
generalPath.curveTo(23.400002f, 988.0f, 25.500002f, 988.0f, 26.800003f, 986.7f);
generalPath.curveTo(28.100002f, 985.4f, 28.100002f, 983.3f, 26.800003f, 982.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.444000244140625, 1014.3270263671875), new Point2D.Double(35.444000244140625, 975.551025390625), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
	private ext_gpg() {
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
       ext_gpg base = new ext_gpg();
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
       ext_gpg base = new ext_gpg();
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
        return ext_gpg::new;
    }
}

