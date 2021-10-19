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
public class ext_ttf implements RadianceIcon {
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
generalPath.lineTo(71.9f, 27.7f);
generalPath.lineTo(71.9f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(190, 192, 219, 255)) : new Color(190, 192, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(206, 205, 230, 255)) : new Color(206, 205, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(225, 220, 243, 255)) : new Color(225, 220, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(239, 230, 251, 255)) : new Color(239, 230, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(245, 245, 255, 255)) : new Color(245, 245, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.lineTo(71.9f, 27.7f);
generalPath.lineTo(71.9f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 135, 161, 255)) : new Color(113, 135, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(71.9f, 27.7f);
generalPath.lineTo(71.9f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
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
generalPath.moveTo(44.7f, 1.0f);
generalPath.lineTo(71.6f, 27.7f);
generalPath.lineTo(44.7f, 27.7f);
generalPath.lineTo(44.7f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.75400161743164, 74.23400115966797), new Point2D.Double(58.198001861572266, 87.677001953125), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 245, 255, 255)) : new Color(255, 245, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 241, 251, 255)) : new Color(250, 241, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 231, 244, 255)) : new Color(237, 231, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 219, 233, 255)) : new Color(221, 219, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 201, 218, 255)) : new Color(199, 201, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 179, 199, 255)) : new Color(173, 179, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 145, 176, 255)) : new Color(146, 145, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.7f, 1.0f);
generalPath.lineTo(71.6f, 27.7f);
generalPath.lineTo(44.7f, 27.7f);
generalPath.lineTo(44.7f, 1.0f);
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
generalPath.moveTo(44.7f, 1.0f);
generalPath.lineTo(71.6f, 27.7f);
generalPath.lineTo(44.7f, 27.7f);
generalPath.lineTo(44.7f, 1.0f);
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
generalPath.moveTo(41.0f, 22.2f);
generalPath.lineTo(41.0f, 30.0f);
generalPath.lineTo(40.2f, 30.0f);
generalPath.curveTo(39.7f, 28.2f, 39.2f, 26.9f, 38.7f, 26.1f);
generalPath.curveTo(38.100002f, 25.300001f, 37.4f, 24.7f, 36.4f, 24.2f);
generalPath.curveTo(35.9f, 23.900002f, 34.9f, 23.800001f, 33.600002f, 23.800001f);
generalPath.lineTo(31.400002f, 23.800001f);
generalPath.lineTo(31.400002f, 46.0f);
generalPath.curveTo(31.400002f, 47.5f, 31.500002f, 48.4f, 31.600002f, 48.8f);
generalPath.curveTo(31.700003f, 49.199997f, 32.100002f, 49.5f, 32.600002f, 49.8f);
generalPath.curveTo(33.100002f, 50.1f, 33.7f, 50.2f, 34.600002f, 50.2f);
generalPath.lineTo(35.600002f, 50.2f);
generalPath.lineTo(35.600002f, 51.0f);
generalPath.lineTo(20.4f, 51.0f);
generalPath.lineTo(20.4f, 50.2f);
generalPath.lineTo(21.4f, 50.2f);
generalPath.curveTo(22.199999f, 50.2f, 22.9f, 50.100002f, 23.4f, 49.8f);
generalPath.curveTo(23.8f, 49.6f, 24.1f, 49.3f, 24.3f, 48.8f);
generalPath.curveTo(24.5f, 48.5f, 24.5f, 47.6f, 24.5f, 46.1f);
generalPath.lineTo(24.5f, 23.9f);
generalPath.lineTo(22.4f, 23.9f);
generalPath.curveTo(20.4f, 23.9f, 19.0f, 24.3f, 18.099998f, 25.1f);
generalPath.curveTo(16.899998f, 26.2f, 16.099998f, 27.9f, 15.699999f, 30.0f);
generalPath.lineTo(14.899999f, 30.0f);
generalPath.lineTo(14.899999f, 22.2f);
generalPath.lineTo(41.0f, 22.2f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255);
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
generalPath.moveTo(54.1f, 30.8f);
generalPath.lineTo(54.1f, 38.6f);
generalPath.lineTo(53.3f, 38.6f);
generalPath.curveTo(52.8f, 36.8f, 52.3f, 35.5f, 51.8f, 34.699997f);
generalPath.curveTo(51.2f, 33.899998f, 50.5f, 33.299995f, 49.5f, 32.799995f);
generalPath.curveTo(49.0f, 32.499996f, 48.0f, 32.399994f, 46.7f, 32.399994f);
generalPath.lineTo(44.5f, 32.399994f);
generalPath.lineTo(44.5f, 54.599995f);
generalPath.curveTo(44.5f, 56.099995f, 44.6f, 56.999996f, 44.7f, 57.399994f);
generalPath.curveTo(44.9f, 57.799995f, 45.2f, 58.099995f, 45.7f, 58.399994f);
generalPath.curveTo(46.2f, 58.699993f, 46.8f, 58.799995f, 47.7f, 58.799995f);
generalPath.lineTo(48.7f, 58.799995f);
generalPath.lineTo(48.7f, 59.599995f);
generalPath.lineTo(33.5f, 59.599995f);
generalPath.lineTo(33.5f, 58.799995f);
generalPath.lineTo(34.5f, 58.799995f);
generalPath.curveTo(35.3f, 58.799995f, 36.0f, 58.699997f, 36.5f, 58.399994f);
generalPath.curveTo(36.9f, 58.199993f, 37.2f, 57.899994f, 37.4f, 57.399994f);
generalPath.curveTo(37.600002f, 57.099995f, 37.600002f, 56.199993f, 37.600002f, 54.699993f);
generalPath.lineTo(37.600002f, 32.4f);
generalPath.lineTo(35.500004f, 32.4f);
generalPath.curveTo(33.500004f, 32.4f, 32.100002f, 32.800003f, 31.200005f, 33.600002f);
generalPath.curveTo(30.000004f, 34.7f, 29.200005f, 36.4f, 28.800005f, 38.500004f);
generalPath.lineTo(28.0f, 38.500004f);
generalPath.lineTo(28.0f, 30.700005f);
generalPath.lineTo(54.1f, 30.700005f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(54, 69, 77, 255)) : new Color(54, 69, 77, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.9f, 92.1f);
generalPath.lineTo(16.9f, 75.6f);
generalPath.lineTo(11.0f, 75.6f);
generalPath.lineTo(11.0f, 72.2f);
generalPath.lineTo(26.9f, 72.2f);
generalPath.lineTo(26.9f, 75.6f);
generalPath.lineTo(21.0f, 75.6f);
generalPath.lineTo(21.0f, 92.1f);
generalPath.lineTo(16.9f, 92.1f);
generalPath.closePath();
generalPath.moveTo(33.9f, 92.1f);
generalPath.lineTo(33.9f, 75.6f);
generalPath.lineTo(28.0f, 75.6f);
generalPath.lineTo(28.0f, 72.2f);
generalPath.lineTo(43.9f, 72.2f);
generalPath.lineTo(43.9f, 75.6f);
generalPath.lineTo(38.0f, 75.6f);
generalPath.lineTo(38.0f, 92.1f);
generalPath.lineTo(33.9f, 92.1f);
generalPath.closePath();
generalPath.moveTo(46.5f, 92.1f);
generalPath.lineTo(46.5f, 72.2f);
generalPath.lineTo(60.2f, 72.2f);
generalPath.lineTo(60.2f, 75.6f);
generalPath.lineTo(50.5f, 75.6f);
generalPath.lineTo(50.5f, 80.299995f);
generalPath.lineTo(58.8f, 80.299995f);
generalPath.lineTo(58.8f, 83.7f);
generalPath.lineTo(50.5f, 83.7f);
generalPath.lineTo(50.5f, 92.1f);
generalPath.lineTo(46.5f, 92.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 98, 123, 255)) : new Color(76, 98, 123, 255);
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_ttf() {
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
       ext_ttf base = new ext_ttf();
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
       ext_ttf base = new ext_ttf();
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
        return ext_ttf::new;
    }
}

