package org.pushingpixels.radiance.demo.theming.main.check.svg.flags;

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
public class ca implements RadianceIcon {
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
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.18199999630451202f, -3.0250000953674316f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(81.32f, 3.025f);
generalPath.lineTo(443.595f, 3.025f);
generalPath.lineTo(443.595f, 515.025f);
generalPath.lineTo(81.32f, 515.025f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(-99.818f, 3.025f);
generalPath.lineTo(81.32f, 3.025f);
generalPath.lineTo(81.32f, 515.025f);
generalPath.lineTo(-99.818f, 515.025f);
generalPath.closePath();
generalPath.moveTo(443.59503f, 3.025f);
generalPath.lineTo(624.73303f, 3.025f);
generalPath.lineTo(624.73303f, 515.025f);
generalPath.lineTo(443.595f, 515.025f);
generalPath.closePath();
generalPath.moveTo(135.49f, 250.44f);
generalPath.lineTo(121.423004f, 255.248f);
generalPath.lineTo(186.879f, 312.694f);
generalPath.curveTo(191.829f, 327.458f, 185.159f, 331.81f, 180.909f, 339.55402f);
generalPath.lineTo(251.969f, 330.53403f);
generalPath.lineTo(250.11899f, 402.04602f);
generalPath.lineTo(264.83698f, 401.62302f);
generalPath.lineTo(261.62698f, 330.70502f);
generalPath.lineTo(332.757f, 339.13702f);
generalPath.curveTo(328.35498f, 329.84003f, 324.43698f, 324.90402f, 328.50998f, 310.03903f);
generalPath.lineTo(393.92398f, 255.61304f);
generalPath.lineTo(382.477f, 251.46904f);
generalPath.curveTo(373.117f, 244.24704f, 386.521f, 216.68504f, 388.543f, 199.29105f);
generalPath.curveTo(388.543f, 199.29105f, 350.348f, 212.42604f, 347.845f, 205.55304f);
generalPath.lineTo(338.118f, 186.86804f);
generalPath.lineTo(303.371f, 225.03804f);
generalPath.curveTo(299.575f, 225.94804f, 297.958f, 224.43803f, 297.06702f, 221.23004f);
generalPath.lineTo(313.12003f, 141.46405f);
generalPath.lineTo(287.7f, 155.76105f);
generalPath.curveTo(285.57202f, 156.67105f, 283.444f, 155.88605f, 282.04202f, 153.40605f);
generalPath.lineTo(257.59702f, 104.33305f);
generalPath.lineTo(232.38702f, 155.28505f);
generalPath.curveTo(230.48703f, 157.11105f, 228.58502f, 157.32205f, 227.00702f, 156.08105f);
generalPath.lineTo(202.8f, 142.505f);
generalPath.lineTo(217.33f, 221.64801f);
generalPath.curveTo(216.174f, 224.79001f, 213.406f, 225.67401f, 210.15001f, 223.973f);
generalPath.lineTo(176.934f, 186.23601f);
generalPath.curveTo(172.589f, 193.19801f, 169.64401f, 204.572f, 163.901f, 207.121f);
generalPath.curveTo(158.157f, 209.509f, 138.921f, 202.299f, 126.028f, 199.485f);
generalPath.curveTo(130.432f, 215.38f, 144.204f, 241.787f, 135.488f, 250.442f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(191, 10, 48, 255)) : new Color(191, 10, 48, 255);
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
		return 512.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 512.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ca() {
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
       ca base = new ca();
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
       ca base = new ca();
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
        return ca::new;
    }
}

