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
generalPath.moveTo(9.64f, 7.64f);
generalPath.curveTo(9.87f, 7.14f, 10.0f, 6.59f, 10.0f, 6.0f);
generalPath.curveTo(10.0f, 3.79f, 8.21f, 2.0f, 6.0f, 2.0f);
generalPath.curveTo(3.79f, 2.0f, 2.0f, 3.79f, 2.0f, 6.0f);
generalPath.curveTo(2.0f, 8.21f, 3.79f, 10.0f, 6.0f, 10.0f);
generalPath.curveTo(6.59f, 10.0f, 7.14f, 9.87f, 7.64f, 9.64f);
generalPath.lineTo(10.0f, 12.0f);
generalPath.lineTo(7.6400003f, 14.36f);
generalPath.curveTo(7.14f, 14.13f, 6.59f, 14.0f, 6.0f, 14.0f);
generalPath.curveTo(3.79f, 14.0f, 2.0f, 15.79f, 2.0f, 18.0f);
generalPath.curveTo(2.0f, 20.21f, 3.79f, 22.0f, 6.0f, 22.0f);
generalPath.curveTo(8.21f, 22.0f, 10.0f, 20.21f, 10.0f, 18.0f);
generalPath.curveTo(10.0f, 17.41f, 9.87f, 16.86f, 9.64f, 16.36f);
generalPath.lineTo(12.0f, 14.0f);
generalPath.lineTo(19.0f, 21.0f);
generalPath.lineTo(22.0f, 21.0f);
generalPath.lineTo(22.0f, 20.0f);
generalPath.lineTo(9.64f, 7.64f);
generalPath.closePath();
generalPath.moveTo(6.0f, 8.0f);
generalPath.curveTo(4.9f, 8.0f, 4.0f, 7.11f, 4.0f, 6.0f);
generalPath.curveTo(4.0f, 4.89f, 4.9f, 4.0f, 6.0f, 4.0f);
generalPath.curveTo(7.1f, 4.0f, 8.0f, 4.89f, 8.0f, 6.0f);
generalPath.curveTo(8.0f, 7.11f, 7.1f, 8.0f, 6.0f, 8.0f);
generalPath.closePath();
generalPath.moveTo(6.0f, 20.0f);
generalPath.curveTo(4.9f, 20.0f, 4.0f, 19.11f, 4.0f, 18.0f);
generalPath.curveTo(4.0f, 16.89f, 4.9f, 16.0f, 6.0f, 16.0f);
generalPath.curveTo(7.1f, 16.0f, 8.0f, 16.89f, 8.0f, 18.0f);
generalPath.curveTo(8.0f, 19.11f, 7.1f, 20.0f, 6.0f, 20.0f);
generalPath.closePath();
generalPath.moveTo(12.0f, 12.5f);
generalPath.curveTo(11.72f, 12.5f, 11.5f, 12.28f, 11.5f, 12.0f);
generalPath.curveTo(11.5f, 11.72f, 11.72f, 11.5f, 12.0f, 11.5f);
generalPath.curveTo(12.28f, 11.5f, 12.5f, 11.72f, 12.5f, 12.0f);
generalPath.curveTo(12.5f, 12.28f, 12.28f, 12.5f, 12.0f, 12.5f);
generalPath.closePath();
generalPath.moveTo(19.0f, 3.0f);
generalPath.lineTo(13.0f, 9.0f);
generalPath.lineTo(15.0f, 11.0f);
generalPath.lineTo(22.0f, 4.0f);
generalPath.lineTo(22.0f, 3.0f);
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

