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
public class ext_cur implements NeonIcon {
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.108001708984375, 3.003000020980835), new Point2D.Double(36.108001708984375, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
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
generalPath.moveTo(20.6f, 83.8f);
generalPath.lineTo(24.5f, 85.0f);
generalPath.curveTo(23.9f, 87.2f, 22.9f, 88.8f, 21.5f, 89.8f);
generalPath.curveTo(20.1f, 90.9f, 18.3f, 91.4f, 16.2f, 91.4f);
generalPath.curveTo(13.500001f, 91.4f, 11.400001f, 90.5f, 9.700001f, 88.700005f);
generalPath.curveTo(8.000001f, 86.9f, 7.100001f, 84.4f, 7.100001f, 81.3f);
generalPath.curveTo(7.100001f, 78.0f, 8.000001f, 75.4f, 9.700001f, 73.600006f);
generalPath.curveTo(11.400001f, 71.80001f, 13.700001f, 70.90001f, 16.5f, 70.90001f);
generalPath.curveTo(18.9f, 70.90001f, 20.9f, 71.600006f, 22.5f, 73.100006f);
generalPath.curveTo(23.4f, 73.90001f, 24.1f, 75.200005f, 24.5f, 76.8f);
generalPath.lineTo(20.5f, 77.700005f);
generalPath.curveTo(20.3f, 76.700005f, 19.8f, 75.9f, 19.0f, 75.3f);
generalPath.curveTo(18.2f, 74.700005f, 17.3f, 74.4f, 16.3f, 74.4f);
generalPath.curveTo(14.799999f, 74.4f, 13.599999f, 74.9f, 12.699999f, 76.0f);
generalPath.curveTo(11.799998f, 77.1f, 11.299999f, 78.8f, 11.299999f, 81.1f);
generalPath.curveTo(11.299999f, 83.6f, 11.799999f, 85.4f, 12.699999f, 86.5f);
generalPath.curveTo(13.599998f, 87.6f, 14.799999f, 88.1f, 16.199999f, 88.1f);
generalPath.curveTo(17.3f, 88.1f, 18.199999f, 87.799995f, 18.999998f, 87.1f);
generalPath.curveTo(19.699999f, 86.299995f, 20.199999f, 85.2f, 20.599998f, 83.799995f);
generalPath.closePath();
generalPath.moveTo(27.900002f, 71.200005f);
generalPath.lineTo(31.900002f, 71.200005f);
generalPath.lineTo(31.900002f, 82.0f);
generalPath.curveTo(31.900002f, 83.7f, 31.900002f, 84.8f, 32.100002f, 85.3f);
generalPath.curveTo(32.300003f, 86.100006f, 32.7f, 86.8f, 33.300003f, 87.3f);
generalPath.curveTo(34.000004f, 87.700005f, 34.9f, 88.0f, 36.000004f, 88.0f);
generalPath.curveTo(37.100006f, 88.0f, 38.000004f, 87.8f, 38.600002f, 87.3f);
generalPath.curveTo(39.2f, 86.8f, 39.500004f, 86.3f, 39.600002f, 85.600006f);
generalPath.curveTo(39.7f, 84.90001f, 39.800003f, 83.8f, 39.800003f, 82.200005f);
generalPath.lineTo(39.800003f, 71.200005f);
generalPath.lineTo(43.800003f, 71.200005f);
generalPath.lineTo(43.800003f, 81.600006f);
generalPath.curveTo(43.800003f, 84.00001f, 43.700005f, 85.700005f, 43.500004f, 86.600006f);
generalPath.curveTo(43.300003f, 87.50001f, 42.900005f, 88.40001f, 42.300003f, 89.100006f);
generalPath.curveTo(41.7f, 89.8f, 41.000004f, 90.40001f, 40.000004f, 90.8f);
generalPath.curveTo(39.000004f, 91.200005f, 37.700005f, 91.4f, 36.200005f, 91.4f);
generalPath.curveTo(34.300003f, 91.4f, 32.800003f, 91.200005f, 31.900005f, 90.700005f);
generalPath.curveTo(31.000008f, 90.200005f, 30.100006f, 89.700005f, 29.600006f, 89.00001f);
generalPath.curveTo(29.100006f, 88.30001f, 28.700006f, 87.600006f, 28.500006f, 86.80001f);
generalPath.curveTo(28.200006f, 85.70001f, 28.100006f, 84.00001f, 28.100006f, 81.80001f);
generalPath.lineTo(28.100006f, 71.2f);
generalPath.closePath();
generalPath.moveTo(48.100002f, 91.100006f);
generalPath.lineTo(48.100002f, 71.2f);
generalPath.lineTo(56.600002f, 71.2f);
generalPath.curveTo(58.7f, 71.2f, 60.300003f, 71.399994f, 61.300003f, 71.7f);
generalPath.curveTo(62.300003f, 72.1f, 63.000004f, 72.7f, 63.600002f, 73.6f);
generalPath.curveTo(64.200005f, 74.5f, 64.5f, 75.6f, 64.5f, 76.7f);
generalPath.curveTo(64.5f, 78.2f, 64.1f, 79.399994f, 63.2f, 80.399994f);
generalPath.curveTo(62.300003f, 81.399994f, 61.0f, 81.99999f, 59.2f, 82.2f);
generalPath.curveTo(60.100002f, 82.7f, 60.8f, 83.299995f, 61.4f, 83.899994f);
generalPath.curveTo(62.0f, 84.49999f, 62.7f, 85.59999f, 63.7f, 87.09999f);
generalPath.lineTo(66.1f, 90.99999f);
generalPath.lineTo(61.3f, 90.99999f);
generalPath.lineTo(58.399998f, 86.69999f);
generalPath.curveTo(57.399998f, 85.19999f, 56.699997f, 84.19999f, 56.3f, 83.79999f);
generalPath.curveTo(55.899998f, 83.39999f, 55.5f, 83.09999f, 55.1f, 82.999985f);
generalPath.curveTo(54.699997f, 82.89999f, 54.0f, 82.79999f, 53.1f, 82.79999f);
generalPath.lineTo(52.3f, 82.79999f);
generalPath.lineTo(52.3f, 91.09999f);
generalPath.lineTo(48.1f, 91.09999f);
generalPath.closePath();
generalPath.moveTo(52.2f, 79.600006f);
generalPath.lineTo(55.2f, 79.600006f);
generalPath.curveTo(57.100002f, 79.600006f, 58.3f, 79.50001f, 58.8f, 79.40001f);
generalPath.curveTo(59.3f, 79.20001f, 59.7f, 79.00001f, 59.899998f, 78.600006f);
generalPath.curveTo(60.199997f, 78.200005f, 60.3f, 77.700005f, 60.3f, 77.100006f);
generalPath.curveTo(60.3f, 76.40001f, 60.1f, 75.90001f, 59.8f, 75.50001f);
generalPath.curveTo(59.399998f, 75.100006f, 58.899998f, 74.80001f, 58.3f, 74.700005f);
generalPath.curveTo(58.0f, 74.700005f, 57.0f, 74.600006f, 55.399998f, 74.600006f);
generalPath.lineTo(52.3f, 74.600006f);
generalPath.lineTo(52.3f, 79.600006f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(-1.5219899415969849f, 1.5223400592803955f, -1.4066799879074097f, -1.4063600301742554f, 178.2310028076172f, 24.104999542236328f));
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
generalPath.moveTo(52.4f, 34.0f);
generalPath.lineTo(56.7f, 34.5f);
generalPath.lineTo(56.100002f, 41.1f);
generalPath.lineTo(60.000004f, 40.699997f);
generalPath.lineTo(52.400005f, 56.199997f);
generalPath.lineTo(48.0f, 39.3f);
generalPath.lineTo(51.8f, 40.6f);
generalPath.lineTo(52.399998f, 34.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(47.33700180053711, 50.60499954223633), new Point2D.Double(47.33700180053711, 13.604000091552734), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 213, 219, 255)) : new Color(202, 213, 219, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
        return 0.13199996948242188;
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
		return 0.7380000352859497;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_cur() {
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
       ext_cur base = new ext_cur();
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
       ext_cur base = new ext_cur();
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
        return ext_cur::new;
    }
}

