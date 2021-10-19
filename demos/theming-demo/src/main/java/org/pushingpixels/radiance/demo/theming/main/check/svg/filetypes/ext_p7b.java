package org.pushingpixels.radiance.demo.theming.main.check.svg.filetypes;

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
public class ext_p7b implements RadianceIcon {
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
generalPath.moveTo(11.1f, 91.9f);
generalPath.lineTo(11.1f, 71.9f);
generalPath.lineTo(17.6f, 71.9f);
generalPath.curveTo(20.1f, 71.9f, 21.7f, 72.0f, 22.400002f, 72.200005f);
generalPath.curveTo(23.500002f, 72.50001f, 24.500002f, 73.200005f, 25.300001f, 74.200005f);
generalPath.curveTo(26.1f, 75.200005f, 26.500002f, 76.50001f, 26.500002f, 78.100006f);
generalPath.curveTo(26.500002f, 79.3f, 26.300001f, 80.40001f, 25.800001f, 81.200005f);
generalPath.curveTo(25.400002f, 82.00001f, 24.800001f, 82.700005f, 24.1f, 83.200005f);
generalPath.curveTo(23.4f, 83.700005f, 22.7f, 84.00001f, 22.0f, 84.200005f);
generalPath.curveTo(21.0f, 84.4f, 19.6f, 84.50001f, 17.8f, 84.50001f);
generalPath.lineTo(15.199999f, 84.50001f);
generalPath.lineTo(15.199999f, 92.100006f);
generalPath.lineTo(11.099998f, 92.100006f);
generalPath.closePath();
generalPath.moveTo(15.1f, 75.2f);
generalPath.lineTo(15.1f, 80.899994f);
generalPath.lineTo(17.300001f, 80.899994f);
generalPath.curveTo(18.900002f, 80.899994f, 20.000002f, 80.799995f, 20.500002f, 80.59999f);
generalPath.curveTo(21.000002f, 80.399994f, 21.500002f, 80.09999f, 21.800001f, 79.59999f);
generalPath.curveTo(22.1f, 79.19999f, 22.300001f, 78.59999f, 22.300001f, 77.99999f);
generalPath.curveTo(22.300001f, 77.299995f, 22.1f, 76.69999f, 21.7f, 76.19999f);
generalPath.curveTo(21.300001f, 75.69999f, 20.7f, 75.39999f, 20.1f, 75.29999f);
generalPath.curveTo(19.6f, 75.19999f, 18.6f, 75.19999f, 17.2f, 75.19999f);
generalPath.lineTo(15.1f, 75.19999f);
generalPath.closePath();
generalPath.moveTo(28.900002f, 75.7f);
generalPath.lineTo(28.900002f, 72.1f);
generalPath.lineTo(42.0f, 72.1f);
generalPath.lineTo(42.0f, 74.9f);
generalPath.curveTo(40.9f, 76.0f, 39.8f, 77.5f, 38.7f, 79.5f);
generalPath.curveTo(37.600002f, 81.5f, 36.7f, 83.6f, 36.100002f, 85.9f);
generalPath.curveTo(35.500004f, 88.200005f, 35.2f, 90.200005f, 35.2f, 91.9f);
generalPath.lineTo(31.5f, 91.9f);
generalPath.curveTo(31.6f, 89.1f, 32.1f, 86.3f, 33.2f, 83.4f);
generalPath.curveTo(34.300003f, 80.5f, 35.7f, 77.9f, 37.5f, 75.700005f);
generalPath.lineTo(28.9f, 75.700005f);
generalPath.closePath();
generalPath.moveTo(45.300003f, 71.799995f);
generalPath.lineTo(53.300003f, 71.799995f);
generalPath.curveTo(54.9f, 71.799995f, 56.100002f, 71.899994f, 56.800003f, 71.99999f);
generalPath.curveTo(57.500004f, 72.09999f, 58.300003f, 72.399994f, 58.9f, 72.799995f);
generalPath.curveTo(59.5f, 73.2f, 60.0f, 73.799995f, 60.4f, 74.49999f);
generalPath.curveTo(60.800003f, 75.19999f, 61.0f, 75.99999f, 61.0f, 76.799995f);
generalPath.curveTo(61.0f, 77.7f, 60.7f, 78.6f, 60.2f, 79.399994f);
generalPath.curveTo(59.7f, 80.19999f, 59.0f, 80.799995f, 58.100002f, 81.2f);
generalPath.curveTo(59.300003f, 81.6f, 60.300003f, 82.2f, 60.9f, 83.0f);
generalPath.curveTo(61.5f, 83.8f, 61.9f, 84.9f, 61.9f, 86.0f);
generalPath.curveTo(61.9f, 86.9f, 61.7f, 87.8f, 61.300003f, 88.7f);
generalPath.curveTo(60.900005f, 89.59999f, 60.300003f, 90.2f, 59.600002f, 90.799995f);
generalPath.curveTo(58.9f, 91.299995f, 58.000004f, 91.6f, 56.9f, 91.799995f);
generalPath.curveTo(56.2f, 91.899994f, 54.600002f, 91.899994f, 52.0f, 91.899994f);
generalPath.lineTo(45.2f, 91.899994f);
generalPath.lineTo(45.2f, 71.8f);
generalPath.closePath();
generalPath.moveTo(49.4f, 75.2f);
generalPath.lineTo(49.4f, 79.799995f);
generalPath.lineTo(52.0f, 79.799995f);
generalPath.curveTo(53.6f, 79.799995f, 54.6f, 79.799995f, 54.9f, 79.7f);
generalPath.curveTo(55.600002f, 79.6f, 56.100002f, 79.399994f, 56.5f, 79.0f);
generalPath.curveTo(56.899998f, 78.600006f, 57.1f, 78.1f, 57.1f, 77.4f);
generalPath.curveTo(57.1f, 76.8f, 56.899998f, 76.3f, 56.6f, 75.9f);
generalPath.curveTo(56.3f, 75.5f, 55.699997f, 75.3f, 55.1f, 75.200005f);
generalPath.curveTo(54.699997f, 75.200005f, 53.5f, 75.100006f, 51.6f, 75.100006f);
generalPath.lineTo(49.399998f, 75.100006f);
generalPath.closePath();
generalPath.moveTo(49.4f, 83.1f);
generalPath.lineTo(49.4f, 88.5f);
generalPath.lineTo(53.100002f, 88.5f);
generalPath.curveTo(54.600002f, 88.5f, 55.500004f, 88.5f, 55.9f, 88.4f);
generalPath.curveTo(56.5f, 88.3f, 57.0f, 88.0f, 57.4f, 87.6f);
generalPath.curveTo(57.800003f, 87.2f, 58.0f, 86.6f, 58.0f, 85.9f);
generalPath.curveTo(58.0f, 85.3f, 57.9f, 84.8f, 57.6f, 84.4f);
generalPath.curveTo(57.3f, 84.0f, 56.899998f, 83.700005f, 56.3f, 83.5f);
generalPath.curveTo(55.7f, 83.3f, 54.6f, 83.2f, 52.7f, 83.2f);
generalPath.lineTo(49.4f, 83.2f);
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
	private ext_p7b() {
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
       ext_p7b base = new ext_p7b();
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
       ext_p7b base = new ext_p7b();
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
        return ext_p7b::new;
    }
}

