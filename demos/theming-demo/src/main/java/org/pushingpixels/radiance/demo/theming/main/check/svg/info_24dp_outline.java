package org.pushingpixels.radiance.demo.theming.main.check.svg;

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
public class info_24dp_outline implements RadianceIcon {
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
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.02500000037252903f, 0.0f, 0.0f, 0.02500000037252903f, -0.0f, 24.00000035762787f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(450.0f, -290.0f);
generalPath.lineTo(510.0f, -290.0f);
generalPath.lineTo(510.0f, -520.0f);
generalPath.lineTo(450.0f, -520.0f);
generalPath.lineTo(450.0f, -290.0f);
generalPath.closePath();
generalPath.moveTo(480.0f, -588.45996f);
generalPath.quadTo(493.73f, -588.45996f, 503.02f, -597.74994f);
generalPath.quadTo(512.30994f, -607.0399f, 512.31f, -620.76996f);
generalPath.quadTo(512.31f, -634.49994f, 503.02f, -643.79f);
generalPath.quadTo(493.72998f, -653.07f, 480.0f, -653.07f);
generalPath.quadTo(466.27002f, -653.07f, 456.98f, -643.79f);
generalPath.quadTo(447.69f, -634.5f, 447.69f, -620.76996f);
generalPath.quadTo(447.69f, -607.0399f, 456.98f, -597.74994f);
generalPath.quadTo(466.27002f, -588.45996f, 480.0f, -588.45996f);
generalPath.closePath();
generalPath.moveTo(480.07f, -99.99997f);
generalPath.quadTo(401.23f, -99.99997f, 331.86f, -129.91997f);
generalPath.quadTo(262.48996f, -159.83997f, 211.18f, -211.12997f);
generalPath.quadTo(159.87f, -262.41998f, 129.93f, -331.75998f);
generalPath.quadTo(100.0f, -401.1f, 100.0f, -479.93f);
generalPath.quadTo(100.0f, -558.77f, 129.92f, -628.14f);
generalPath.quadTo(159.84f, -697.51f, 211.13f, -748.82f);
generalPath.quadTo(262.42f, -800.13f, 331.76f, -830.07f);
generalPath.quadTo(401.1f, -860.0f, 479.93f, -860.0f);
generalPath.quadTo(558.77f, -860.0f, 628.14f, -830.08f);
generalPath.quadTo(697.51f, -800.16003f, 748.82f, -748.87f);
generalPath.quadTo(800.13f, -697.58f, 830.07f, -628.24f);
generalPath.quadTo(860.0f, -558.9f, 860.0f, -480.07f);
generalPath.quadTo(860.0f, -401.23f, 830.08f, -331.86f);
generalPath.quadTo(800.16003f, -262.48996f, 748.87f, -211.18f);
generalPath.quadTo(697.58f, -159.87f, 628.24f, -129.93f);
generalPath.quadTo(558.9f, -100.0f, 480.07f, -100.0f);
generalPath.closePath();
generalPath.moveTo(480.0f, -159.99997f);
generalPath.quadTo(614.0f, -159.99997f, 707.0f, -252.99997f);
generalPath.quadTo(800.0f, -345.99997f, 800.0f, -479.99997f);
generalPath.quadTo(800.0f, -614.0f, 707.0f, -707.0f);
generalPath.quadTo(614.0f, -800.0f, 480.0f, -800.0f);
generalPath.quadTo(346.0f, -800.0f, 253.0f, -707.0f);
generalPath.quadTo(160.0f, -614.0f, 160.0f, -480.0f);
generalPath.quadTo(160.0f, -346.0f, 253.0f, -253.0f);
generalPath.quadTo(346.0f, -160.0f, 480.0f, -160.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(31, 31, 31, 255)) : new Color(31, 31, 31, 255);
g.setPaint(paint);
g.fill(shape);
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
        return 2.5;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 2.5;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 19.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 19.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private info_24dp_outline() {
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
       info_24dp_outline base = new info_24dp_outline();
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
       info_24dp_outline base = new info_24dp_outline();
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
        return info_24dp_outline::new;
    }
}

