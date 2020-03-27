package org.pushingpixels.substance.internal.svg;

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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ic_palette_black_24px implements ResizableIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
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
generalPath.moveTo(12.0, 3.0);
generalPath.curveTo(7.03, 3.0, 3.0, 7.03, 3.0, 12.0);
generalPath.curveTo(3.0, 16.97, 7.03, 21.0, 12.0, 21.0);
generalPath.curveTo(12.83, 21.0, 13.5, 20.33, 13.5, 19.5);
generalPath.curveTo(13.5, 19.11, 13.35, 18.76, 13.11, 18.49);
generalPath.curveTo(12.88, 18.23, 12.73, 17.88, 12.73, 17.5);
generalPath.curveTo(12.73, 16.67, 13.4, 16.0, 14.23, 16.0);
generalPath.lineTo(16.0, 16.0);
generalPath.curveTo(18.76, 16.0, 21.0, 13.76, 21.0, 11.0);
generalPath.curveTo(21.0, 6.58, 16.97, 3.0, 12.0, 3.0);
generalPath.closePath();
generalPath.moveTo(6.5, 12.0);
generalPath.curveTo(5.67, 12.0, 5.0, 11.33, 5.0, 10.5);
generalPath.curveTo(5.0, 9.67, 5.67, 9.0, 6.5, 9.0);
generalPath.curveTo(7.33, 9.0, 8.0, 9.67, 8.0, 10.5);
generalPath.curveTo(8.0, 11.33, 7.33, 12.0, 6.5, 12.0);
generalPath.closePath();
generalPath.moveTo(9.5, 8.0);
generalPath.curveTo(8.67, 8.0, 8.0, 7.33, 8.0, 6.5);
generalPath.curveTo(8.0, 5.67, 8.67, 5.0, 9.5, 5.0);
generalPath.curveTo(10.33, 5.0, 11.0, 5.67, 11.0, 6.5);
generalPath.curveTo(11.0, 7.33, 10.33, 8.0, 9.5, 8.0);
generalPath.closePath();
generalPath.moveTo(14.5, 8.0);
generalPath.curveTo(13.67, 8.0, 13.0, 7.33, 13.0, 6.5);
generalPath.curveTo(13.0, 5.67, 13.67, 5.0, 14.5, 5.0);
generalPath.curveTo(15.33, 5.0, 16.0, 5.67, 16.0, 6.5);
generalPath.curveTo(16.0, 7.33, 15.33, 8.0, 14.5, 8.0);
generalPath.closePath();
generalPath.moveTo(17.5, 12.0);
generalPath.curveTo(16.67, 12.0, 16.0, 11.33, 16.0, 10.5);
generalPath.curveTo(16.0, 9.67, 16.67, 9.0, 17.5, 9.0);
generalPath.curveTo(18.33, 9.0, 19.0, 9.67, 19.0, 10.5);
generalPath.curveTo(19.0, 11.33, 18.33, 12.0, 17.5, 12.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
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
        return 3.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 18.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 18.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ic_palette_black_24px() {
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
    public static ResizableIcon of(int width, int height) {
       ic_palette_black_24px base = new ic_palette_black_24px();
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ic_palette_black_24px base = new ic_palette_black_24px();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ic_palette_black_24px::new;
    }
}

