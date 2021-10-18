package org.pushingpixels.radiance.demo.laf.main.check.svg.vaadin;

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
public class globe implements RadianceIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.0f, -0.0f));
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
generalPath.moveTo(8.0f, 0.0f);
generalPath.curveTo(3.6f, 0.0f, 0.0f, 3.6f, 0.0f, 8.0f);
generalPath.curveTo(0.0f, 12.4f, 3.6f, 16.0f, 8.0f, 16.0f);
generalPath.curveTo(12.4f, 16.0f, 16.0f, 12.4f, 16.0f, 8.0f);
generalPath.curveTo(16.0f, 3.6000004f, 12.4f, 0.0f, 8.0f, 0.0f);
generalPath.closePath();
generalPath.moveTo(13.2f, 5.3f);
generalPath.curveTo(13.599999f, 5.3f, 13.9f, 5.6000004f, 14.3f, 5.6000004f);
generalPath.curveTo(14.0f, 6.0000005f, 12.7f, 6.0000005f, 12.3f, 5.5000005f);
generalPath.curveTo(12.6f, 5.4000006f, 12.8f, 5.3000007f, 13.2f, 5.3000007f);
generalPath.closePath();
generalPath.moveTo(1.0f, 8.0f);
generalPath.curveTo(1.0f, 7.6f, 1.0f, 7.2f, 1.1f, 6.7f);
generalPath.curveTo(1.2f, 6.7f, 1.3000001f, 6.7999997f, 1.4000001f, 6.7999997f);
generalPath.curveTo(1.4000001f, 6.7999997f, 1.5000001f, 6.8999996f, 1.5000001f, 6.9999995f);
generalPath.curveTo(1.5000001f, 7.2999997f, 1.8000002f, 7.4999995f, 2.0f, 7.4999995f);
generalPath.curveTo(2.8f, 7.5999994f, 3.1f, 8.299999f, 3.8f, 8.5f);
generalPath.curveTo(4.0f, 8.6f, 3.8999999f, 8.8f, 3.8f, 9.0f);
generalPath.curveTo(3.1999998f, 9.8f, 3.7f, 10.4f, 4.2f, 10.9f);
generalPath.curveTo(4.7f, 11.299999f, 4.7f, 11.7f, 4.7999997f, 12.299999f);
generalPath.curveTo(4.7999997f, 12.999999f, 4.8999996f, 13.799999f, 5.2f, 14.499999f);
generalPath.curveTo(2.6999998f, 13.299999f, 1.0f, 10.9f, 1.0f, 7.999999f);
generalPath.closePath();
generalPath.moveTo(8.0f, 15.0f);
generalPath.curveTo(7.3f, 15.0f, 6.5f, 14.9f, 5.9f, 14.7f);
generalPath.curveTo(5.8f, 14.5f, 5.8f, 14.3f, 5.9f, 14.099999f);
generalPath.curveTo(6.3f, 13.299999f, 6.7000003f, 12.599999f, 7.2f, 11.9f);
generalPath.curveTo(7.3999996f, 11.7f, 7.6f, 11.5f, 7.6f, 11.2f);
generalPath.curveTo(7.6f, 11.0f, 7.7f, 10.7f, 7.7999997f, 10.5f);
generalPath.curveTo(8.099999f, 10.0f, 7.9999995f, 9.7f, 7.6f, 9.6f);
generalPath.curveTo(6.7999997f, 9.400001f, 6.3999996f, 8.700001f, 5.8f, 8.400001f);
generalPath.curveTo(5.200001f, 8.1f, 4.6000004f, 7.9000006f, 4.1000004f, 8.200001f);
generalPath.curveTo(3.9000003f, 8.300001f, 3.6000004f, 8.400001f, 3.6000004f, 8.1f);
generalPath.curveTo(3.6000004f, 7.7000003f, 3.1000004f, 7.4000006f, 3.2000003f, 7.0000005f);
generalPath.curveTo(3.1000004f, 7.0000005f, 3.0000002f, 7.0000005f, 2.9000003f, 7.1000004f);
generalPath.curveTo(2.8000004f, 7.2000003f, 2.7000003f, 7.3f, 2.5000002f, 7.2000003f);
generalPath.curveTo(2.3000002f, 7.0000005f, 2.4000003f, 6.8f, 2.4000003f, 6.6000004f);
generalPath.curveTo(2.5000002f, 6.4000006f, 2.6000004f, 6.3f, 2.8000004f, 6.2000003f);
generalPath.curveTo(3.2000005f, 6.1000004f, 3.6000004f, 6.1000004f, 3.8000004f, 6.6000004f);
generalPath.curveTo(4.1000004f, 5.7000003f, 4.7000003f, 5.2000003f, 5.3f, 4.8f);
generalPath.curveTo(5.3f, 4.8f, 6.1000004f, 4.1000004f, 6.2000003f, 4.1000004f);
generalPath.curveTo(6.3f, 4.1000004f, 6.4f, 4.3f, 6.6000004f, 4.4000006f);
generalPath.curveTo(6.8f, 4.4000006f, 6.9000006f, 4.4000006f, 6.9000006f, 4.200001f);
generalPath.curveTo(7.0000005f, 3.7000008f, 6.700001f, 3.1000009f, 6.3000007f, 3.0000007f);
generalPath.curveTo(6.3000007f, 2.9000008f, 6.4000006f, 2.9000008f, 6.4000006f, 2.9000008f);
generalPath.curveTo(6.700001f, 2.800001f, 7.1000004f, 2.6000009f, 7.0000005f, 2.3000007f);
generalPath.curveTo(7.0000005f, 1.9000007f, 6.6000004f, 1.7000006f, 6.2000003f, 1.7000006f);
generalPath.curveTo(6.0000005f, 1.7000006f, 5.8f, 1.7000006f, 5.6000004f, 1.8000007f);
generalPath.curveTo(5.2000003f, 2.0000007f, 4.7000003f, 2.2000008f, 4.1000004f, 2.2000008f);
generalPath.curveTo(5.2000003f, 1.4000008f, 6.6000004f, 1.0000007f, 8.0f, 1.0000007f);
generalPath.curveTo(8.3f, 1.0000007f, 8.5f, 1.0000007f, 8.8f, 1.0000007f);
generalPath.curveTo(8.2f, 1.1000007f, 7.6000004f, 1.3000007f, 7.2000003f, 1.5000007f);
generalPath.curveTo(7.8f, 1.6000007f, 7.9f, 1.9000007f, 7.7000003f, 2.4000006f);
generalPath.curveTo(7.6000004f, 2.6000006f, 7.7000003f, 2.8000007f, 7.9f, 2.9000006f);
generalPath.curveTo(8.1f, 3.0000005f, 8.3f, 3.0000005f, 8.4f, 2.8000007f);
generalPath.curveTo(8.599999f, 2.5000007f, 9.0f, 2.4000006f, 9.299999f, 2.3000007f);
generalPath.curveTo(9.699999f, 2.2000008f, 9.999999f, 2.0000007f, 10.299999f, 1.6000006f);
generalPath.curveTo(10.299999f, 1.5000006f, 10.4f, 1.5000006f, 10.499999f, 1.4000006f);
generalPath.curveTo(11.099999f, 1.6000006f, 11.699999f, 2.0000005f, 12.299999f, 2.4000006f);
generalPath.curveTo(12.199999f, 2.4000006f, 12.199999f, 2.5000005f, 12.099999f, 2.5000005f);
generalPath.curveTo(11.9f, 2.7000005f, 11.599999f, 2.8000004f, 11.9f, 3.2000005f);
generalPath.curveTo(12.0f, 3.4000006f, 11.9f, 3.5000005f, 11.799999f, 3.6000006f);
generalPath.curveTo(11.599999f, 3.7000005f, 11.499999f, 3.6000006f, 11.4f, 3.5000007f);
generalPath.curveTo(11.3f, 3.4000008f, 11.299999f, 3.2000008f, 11.0f, 3.2000008f);
generalPath.curveTo(10.9f, 3.4000008f, 10.6f, 3.5000007f, 10.6f, 3.8000007f);
generalPath.curveTo(11.1f, 3.8000007f, 11.0f, 4.200001f, 11.1f, 4.5000005f);
generalPath.curveTo(10.5f, 4.6000004f, 10.3f, 4.9000006f, 10.6f, 5.4000006f);
generalPath.curveTo(10.700001f, 5.6000004f, 10.5f, 5.700001f, 10.400001f, 5.8000007f);
generalPath.curveTo(10.000001f, 6.4000006f, 9.6f, 6.8000007f, 9.6f, 7.500001f);
generalPath.curveTo(9.6f, 8.200001f, 10.1f, 8.900001f, 10.900001f, 8.800001f);
generalPath.curveTo(11.8f, 8.700001f, 11.8f, 8.700001f, 12.1f, 9.500001f);
generalPath.curveTo(12.1f, 9.600001f, 12.200001f, 9.700001f, 12.200001f, 9.800001f);
generalPath.curveTo(12.300001f, 10.000001f, 12.400001f, 10.200001f, 12.300001f, 10.400002f);
generalPath.curveTo(12.000001f, 11.200002f, 12.400002f, 11.800001f, 12.700001f, 12.400002f);
generalPath.curveTo(12.800001f, 12.600001f, 12.900001f, 12.700002f, 13.000001f, 12.800001f);
generalPath.curveTo(11.700001f, 14.200001f, 10.000001f, 15.000001f, 8.000001f, 15.000001f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 68, 68, 255)) : new Color(68, 68, 68, 255);
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
        return 0.0;
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
		return 16.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 16.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private globe() {
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
       globe base = new globe();
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
       globe base = new globe();
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
        return globe::new;
    }
}

