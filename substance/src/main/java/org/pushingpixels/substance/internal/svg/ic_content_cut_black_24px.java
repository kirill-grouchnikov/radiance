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
public class ic_content_cut_black_24px implements ResizableIcon {
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
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
generalPath.moveTo(9.64, 7.64);
generalPath.curveTo(9.87, 7.14, 10.0, 6.59, 10.0, 6.0);
generalPath.curveTo(10.0, 3.79, 8.21, 2.0, 6.0, 2.0);
generalPath.curveTo(3.79, 2.0, 2.0, 3.79, 2.0, 6.0);
generalPath.curveTo(2.0, 8.21, 3.79, 10.0, 6.0, 10.0);
generalPath.curveTo(6.59, 10.0, 7.14, 9.87, 7.64, 9.64);
generalPath.lineTo(10.0, 12.0);
generalPath.lineTo(7.6400003, 14.36);
generalPath.curveTo(7.14, 14.13, 6.59, 14.0, 6.0, 14.0);
generalPath.curveTo(3.79, 14.0, 2.0, 15.79, 2.0, 18.0);
generalPath.curveTo(2.0, 20.21, 3.79, 22.0, 6.0, 22.0);
generalPath.curveTo(8.21, 22.0, 10.0, 20.21, 10.0, 18.0);
generalPath.curveTo(10.0, 17.41, 9.87, 16.86, 9.64, 16.36);
generalPath.lineTo(12.0, 14.0);
generalPath.lineTo(19.0, 21.0);
generalPath.lineTo(22.0, 21.0);
generalPath.lineTo(22.0, 20.0);
generalPath.lineTo(9.64, 7.64);
generalPath.closePath();
generalPath.moveTo(6.0, 8.0);
generalPath.curveTo(4.9, 8.0, 4.0, 7.11, 4.0, 6.0);
generalPath.curveTo(4.0, 4.89, 4.9, 4.0, 6.0, 4.0);
generalPath.curveTo(7.1, 4.0, 8.0, 4.89, 8.0, 6.0);
generalPath.curveTo(8.0, 7.11, 7.1, 8.0, 6.0, 8.0);
generalPath.closePath();
generalPath.moveTo(6.0, 20.0);
generalPath.curveTo(4.9, 20.0, 4.0, 19.11, 4.0, 18.0);
generalPath.curveTo(4.0, 16.89, 4.9, 16.0, 6.0, 16.0);
generalPath.curveTo(7.1, 16.0, 8.0, 16.89, 8.0, 18.0);
generalPath.curveTo(8.0, 19.11, 7.1, 20.0, 6.0, 20.0);
generalPath.closePath();
generalPath.moveTo(12.0, 12.5);
generalPath.curveTo(11.72, 12.5, 11.5, 12.28, 11.5, 12.0);
generalPath.curveTo(11.5, 11.72, 11.72, 11.5, 12.0, 11.5);
generalPath.curveTo(12.28, 11.5, 12.5, 11.72, 12.5, 12.0);
generalPath.curveTo(12.5, 12.28, 12.28, 12.5, 12.0, 12.5);
generalPath.closePath();
generalPath.moveTo(19.0, 3.0);
generalPath.lineTo(13.0, 9.0);
generalPath.lineTo(15.0, 11.0);
generalPath.lineTo(22.0, 4.0);
generalPath.lineTo(22.0, 3.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 255);
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ic_content_cut_black_24px() {
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
       ic_content_cut_black_24px base = new ic_content_cut_black_24px();
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
       ic_content_cut_black_24px base = new ic_content_cut_black_24px();
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
        return ic_content_cut_black_24px::new;
    }
}

