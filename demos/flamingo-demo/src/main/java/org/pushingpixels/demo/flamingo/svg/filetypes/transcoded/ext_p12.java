package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_p12 implements NeonIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private NeonIcon.ColorFilter colorFilter = null;
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
generalPath.moveTo(13.3f, 91.9f);
generalPath.lineTo(13.3f, 71.9f);
generalPath.lineTo(19.8f, 71.9f);
generalPath.curveTo(22.3f, 71.9f, 23.9f, 72.0f, 24.599998f, 72.200005f);
generalPath.curveTo(25.699999f, 72.50001f, 26.699999f, 73.200005f, 27.499998f, 74.200005f);
generalPath.curveTo(28.299997f, 75.200005f, 28.699999f, 76.50001f, 28.699999f, 78.100006f);
generalPath.curveTo(28.699999f, 79.3f, 28.499998f, 80.40001f, 27.999998f, 81.200005f);
generalPath.curveTo(27.599998f, 82.00001f, 26.999998f, 82.700005f, 26.299997f, 83.200005f);
generalPath.curveTo(25.599997f, 83.700005f, 24.899998f, 84.00001f, 24.199997f, 84.200005f);
generalPath.curveTo(23.199997f, 84.4f, 21.799997f, 84.50001f, 19.999996f, 84.50001f);
generalPath.lineTo(17.399996f, 84.50001f);
generalPath.lineTo(17.399996f, 92.100006f);
generalPath.lineTo(13.299995f, 92.100006f);
generalPath.closePath();
generalPath.moveTo(17.4f, 75.2f);
generalPath.lineTo(17.4f, 80.899994f);
generalPath.lineTo(19.6f, 80.899994f);
generalPath.curveTo(21.2f, 80.899994f, 22.300001f, 80.799995f, 22.800001f, 80.59999f);
generalPath.curveTo(23.300001f, 80.399994f, 23.800001f, 80.09999f, 24.1f, 79.59999f);
generalPath.curveTo(24.4f, 79.19999f, 24.6f, 78.59999f, 24.6f, 77.99999f);
generalPath.curveTo(24.6f, 77.299995f, 24.4f, 76.69999f, 24.0f, 76.19999f);
generalPath.curveTo(23.6f, 75.69999f, 23.0f, 75.39999f, 22.4f, 75.29999f);
generalPath.curveTo(21.9f, 75.19999f, 20.9f, 75.19999f, 19.5f, 75.19999f);
generalPath.lineTo(17.4f, 75.19999f);
generalPath.closePath();
generalPath.moveTo(41.0f, 91.9f);
generalPath.lineTo(37.2f, 91.9f);
generalPath.lineTo(37.2f, 77.4f);
generalPath.curveTo(35.8f, 78.700005f, 34.100002f, 79.700005f, 32.2f, 80.3f);
generalPath.lineTo(32.2f, 76.8f);
generalPath.curveTo(33.2f, 76.5f, 34.3f, 75.8f, 35.5f, 74.9f);
generalPath.curveTo(36.7f, 74.0f, 37.5f, 72.9f, 37.9f, 71.700005f);
generalPath.lineTo(41.0f, 71.700005f);
generalPath.lineTo(41.0f, 91.90001f);
generalPath.closePath();
generalPath.moveTo(59.7f, 88.3f);
generalPath.lineTo(59.7f, 91.9f);
generalPath.lineTo(46.2f, 91.9f);
generalPath.curveTo(46.3f, 90.6f, 46.8f, 89.3f, 47.5f, 88.1f);
generalPath.curveTo(48.2f, 86.9f, 49.7f, 85.299995f, 51.8f, 83.299995f);
generalPath.curveTo(53.5f, 81.7f, 54.6f, 80.6f, 55.0f, 79.99999f);
generalPath.curveTo(55.5f, 79.19999f, 55.8f, 78.399994f, 55.8f, 77.59999f);
generalPath.curveTo(55.8f, 76.69999f, 55.6f, 76.09999f, 55.1f, 75.59999f);
generalPath.curveTo(54.6f, 75.09999f, 54.0f, 74.899994f, 53.199997f, 74.899994f);
generalPath.curveTo(52.399998f, 74.899994f, 51.799995f, 75.09999f, 51.299995f, 75.59999f);
generalPath.curveTo(50.799995f, 76.09999f, 50.599995f, 76.899994f, 50.499996f, 77.99999f);
generalPath.lineTo(46.699997f, 77.59999f);
generalPath.curveTo(46.899998f, 75.49999f, 47.6f, 73.99999f, 48.799995f, 72.99999f);
generalPath.curveTo(49.999992f, 71.99999f, 51.499996f, 71.59999f, 53.299995f, 71.59999f);
generalPath.curveTo(55.299995f, 71.59999f, 56.799995f, 72.09999f, 57.999996f, 73.19999f);
generalPath.curveTo(59.099995f, 74.29999f, 59.699997f, 75.59999f, 59.699997f, 77.19999f);
generalPath.curveTo(59.699997f, 78.09999f, 59.499996f, 78.99999f, 59.199997f, 79.79999f);
generalPath.curveTo(58.899998f, 80.59998f, 58.399998f, 81.499985f, 57.699997f, 82.39999f);
generalPath.curveTo(57.199997f, 82.999985f, 56.399998f, 83.79999f, 55.199997f, 84.999985f);
generalPath.curveTo(53.999996f, 86.09998f, 53.199997f, 86.89999f, 52.899998f, 87.19998f);
generalPath.curveTo(52.6f, 87.59998f, 52.3f, 87.89998f, 52.1f, 88.29998f);
generalPath.lineTo(59.699997f, 88.29998f);
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
	private ext_p12() {
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
    public static NeonIcon of(int width, int height) {
       ext_p12 base = new ext_p12();
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
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_p12 base = new ext_p12();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_p12::new;
    }
}

