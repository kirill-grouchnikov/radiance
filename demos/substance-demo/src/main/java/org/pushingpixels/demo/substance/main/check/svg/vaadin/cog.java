package org.pushingpixels.demo.substance.main.check.svg.vaadin;

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
public class cog implements NeonIcon {
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
generalPath.moveTo(16.0f, 9.0f);
generalPath.lineTo(16.0f, 7.0f);
generalPath.lineTo(14.3f, 6.4f);
generalPath.curveTo(14.1f, 5.8f, 13.900001f, 5.2f, 13.6f, 4.6000004f);
generalPath.lineTo(14.400001f, 3.0000005f);
generalPath.lineTo(13.000001f, 1.6000005f);
generalPath.lineTo(11.400001f, 2.4000006f);
generalPath.curveTo(10.900001f, 2.1000006f, 10.3f, 1.8000005f, 9.6f, 1.7000005f);
generalPath.lineTo(9.0f, 4.7683716E-7f);
generalPath.lineTo(7.0f, 4.7683716E-7f);
generalPath.lineTo(6.4f, 1.7000005f);
generalPath.curveTo(5.8f, 1.9000006f, 5.2f, 2.1000006f, 4.7f, 2.4000006f);
generalPath.lineTo(3.1f, 1.6000006f);
generalPath.lineTo(1.5999999f, 3.1000006f);
generalPath.lineTo(2.3999999f, 4.700001f);
generalPath.curveTo(2.1f, 5.200001f, 1.8999999f, 5.8000007f, 1.6999998f, 6.4000006f);
generalPath.lineTo(-2.3841858E-7f, 7.0000005f);
generalPath.lineTo(-2.3841858E-7f, 9.0f);
generalPath.lineTo(1.6999998f, 9.6f);
generalPath.curveTo(1.8999999f, 10.200001f, 2.1f, 10.8f, 2.3999999f, 11.400001f);
generalPath.lineTo(1.5999999f, 13.000001f);
generalPath.lineTo(3.0f, 14.400001f);
generalPath.lineTo(4.6f, 13.6f);
generalPath.curveTo(5.1f, 13.900001f, 5.7f, 14.200001f, 6.3999996f, 14.3f);
generalPath.lineTo(6.9999995f, 16.0f);
generalPath.lineTo(9.0f, 16.0f);
generalPath.lineTo(9.6f, 14.3f);
generalPath.curveTo(10.200001f, 14.1f, 10.8f, 13.900001f, 11.400001f, 13.6f);
generalPath.lineTo(13.000001f, 14.400001f);
generalPath.lineTo(14.400001f, 13.000001f);
generalPath.lineTo(13.6f, 11.400001f);
generalPath.curveTo(13.900001f, 10.900001f, 14.200001f, 10.3f, 14.3f, 9.6f);
generalPath.lineTo(16.0f, 9.0f);
generalPath.closePath();
generalPath.moveTo(8.0f, 12.0f);
generalPath.curveTo(5.8f, 12.0f, 4.0f, 10.2f, 4.0f, 8.0f);
generalPath.curveTo(4.0f, 5.8f, 5.8f, 4.0f, 8.0f, 4.0f);
generalPath.curveTo(10.2f, 4.0f, 12.0f, 5.8f, 12.0f, 8.0f);
generalPath.curveTo(12.0f, 10.2f, 10.2f, 12.0f, 8.0f, 12.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 68, 68, 255)) : new Color(68, 68, 68, 255);
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
generalPath.moveTo(10.6f, 7.9f);
generalPath.curveTo(10.6f, 9.281f, 9.481001f, 10.4f, 8.1f, 10.4f);
generalPath.curveTo(6.719f, 10.4f, 5.6000004f, 9.281f, 5.6000004f, 7.8999996f);
generalPath.curveTo(5.6000004f, 6.5189996f, 6.7190003f, 5.3999996f, 8.1f, 5.3999996f);
generalPath.curveTo(9.481001f, 5.3999996f, 10.6f, 6.5189996f, 10.6f, 7.8999996f);
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
        return 4.76837158203125E-7;
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private cog() {
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
       cog base = new cog();
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
       cog base = new cog();
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
        return cog::new;
    }
}

