package org.pushingpixels.radiance.theming.internal.svg;

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
public class palette_black_24dp implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(12.0f, 2.0f);
generalPath.curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f);
generalPath.curveTo(2.0f, 17.51f, 6.49f, 22.0f, 12.0f, 22.0f);
generalPath.curveTo(13.38f, 22.0f, 14.5f, 20.88f, 14.5f, 19.5f);
generalPath.curveTo(14.5f, 18.89f, 14.27f, 18.3f, 13.86f, 17.83f);
generalPath.curveTo(13.78f, 17.73f, 13.73f, 17.62f, 13.73f, 17.5f);
generalPath.curveTo(13.73f, 17.22f, 13.95f, 17.0f, 14.23f, 17.0f);
generalPath.lineTo(16.0f, 17.0f);
generalPath.curveTo(19.31f, 17.0f, 22.0f, 14.309999f, 22.0f, 11.0f);
generalPath.curveTo(22.0f, 6.04f, 17.51f, 2.0f, 12.0f, 2.0f);
generalPath.closePath();
generalPath.moveTo(17.5f, 13.0f);
generalPath.curveTo(16.67f, 13.0f, 16.0f, 12.33f, 16.0f, 11.5f);
generalPath.curveTo(16.0f, 10.67f, 16.67f, 10.0f, 17.5f, 10.0f);
generalPath.curveTo(18.33f, 10.0f, 19.0f, 10.67f, 19.0f, 11.5f);
generalPath.curveTo(19.0f, 12.33f, 18.33f, 13.0f, 17.5f, 13.0f);
generalPath.closePath();
generalPath.moveTo(14.5f, 9.0f);
generalPath.curveTo(13.67f, 9.0f, 13.0f, 8.33f, 13.0f, 7.5f);
generalPath.curveTo(13.0f, 6.67f, 13.67f, 6.0f, 14.5f, 6.0f);
generalPath.curveTo(15.33f, 6.0f, 16.0f, 6.67f, 16.0f, 7.5f);
generalPath.curveTo(16.0f, 8.33f, 15.33f, 9.0f, 14.5f, 9.0f);
generalPath.closePath();
generalPath.moveTo(5.0f, 11.5f);
generalPath.curveTo(5.0f, 10.67f, 5.67f, 10.0f, 6.5f, 10.0f);
generalPath.curveTo(7.33f, 10.0f, 8.0f, 10.67f, 8.0f, 11.5f);
generalPath.curveTo(8.0f, 12.33f, 7.33f, 13.0f, 6.5f, 13.0f);
generalPath.curveTo(5.67f, 13.0f, 5.0f, 12.33f, 5.0f, 11.5f);
generalPath.closePath();
generalPath.moveTo(11.0f, 7.5f);
generalPath.curveTo(11.0f, 8.33f, 10.33f, 9.0f, 9.5f, 9.0f);
generalPath.curveTo(8.67f, 9.0f, 8.0f, 8.33f, 8.0f, 7.5f);
generalPath.curveTo(8.0f, 6.67f, 8.67f, 6.0f, 9.5f, 6.0f);
generalPath.curveTo(10.33f, 6.0f, 11.0f, 6.67f, 11.0f, 7.5f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);

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
        return 2.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 2.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 20.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 20.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private palette_black_24dp() {
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
       palette_black_24dp base = new palette_black_24dp();
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
       palette_black_24dp base = new palette_black_24dp();
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
        return palette_black_24dp::new;
    }
}

