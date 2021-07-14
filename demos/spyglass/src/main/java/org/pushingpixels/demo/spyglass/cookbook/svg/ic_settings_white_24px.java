package org.pushingpixels.demo.spyglass.cookbook.svg;

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
public class ic_settings_white_24px implements NeonIcon {
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
generalPath.moveTo(19.43f, 12.98f);
generalPath.curveTo(19.470001f, 12.66f, 19.5f, 12.339999f, 19.5f, 12.0f);
generalPath.curveTo(19.5f, 11.660001f, 19.47f, 11.34f, 19.43f, 11.02f);
generalPath.lineTo(21.54f, 9.370001f);
generalPath.curveTo(21.730001f, 9.220001f, 21.78f, 8.950001f, 21.660002f, 8.7300005f);
generalPath.lineTo(19.660002f, 5.2700005f);
generalPath.curveTo(19.54f, 5.0500007f, 19.270002f, 4.9700003f, 19.050001f, 5.0500007f);
generalPath.lineTo(16.560001f, 6.0500007f);
generalPath.curveTo(16.04f, 5.6500006f, 15.480001f, 5.3200006f, 14.870001f, 5.0700006f);
generalPath.lineTo(14.490001f, 2.4200006f);
generalPath.curveTo(14.46f, 2.18f, 14.25f, 2.0f, 14.0f, 2.0f);
generalPath.lineTo(10.0f, 2.0f);
generalPath.curveTo(9.75f, 2.0f, 9.54f, 2.18f, 9.51f, 2.42f);
generalPath.lineTo(9.13f, 5.07f);
generalPath.curveTo(8.52f, 5.32f, 7.96f, 5.6600003f, 7.44f, 6.05f);
generalPath.lineTo(4.95f, 5.05f);
generalPath.curveTo(4.72f, 4.96f, 4.46f, 5.05f, 4.3399997f, 5.27f);
generalPath.lineTo(2.3399997f, 8.73f);
generalPath.curveTo(2.2099996f, 8.95f, 2.2699997f, 9.219999f, 2.4599996f, 9.37f);
generalPath.lineTo(4.5699997f, 11.0199995f);
generalPath.curveTo(4.5299997f, 11.339999f, 4.4999995f, 11.669999f, 4.4999995f, 12.0f);
generalPath.curveTo(4.4999995f, 12.330001f, 4.5299997f, 12.66f, 4.5699997f, 12.98f);
generalPath.lineTo(2.4599998f, 14.629999f);
generalPath.curveTo(2.2699997f, 14.779999f, 2.2199998f, 15.049999f, 2.34f, 15.2699995f);
generalPath.lineTo(4.34f, 18.73f);
generalPath.curveTo(4.46f, 18.949999f, 4.73f, 19.029999f, 4.9500003f, 18.949999f);
generalPath.lineTo(7.4400005f, 17.949999f);
generalPath.curveTo(7.9600005f, 18.349998f, 8.52f, 18.679998f, 9.130001f, 18.929998f);
generalPath.lineTo(9.510001f, 21.579998f);
generalPath.curveTo(9.540001f, 21.819998f, 9.750001f, 21.999998f, 10.000001f, 21.999998f);
generalPath.lineTo(14.000001f, 21.999998f);
generalPath.curveTo(14.250001f, 21.999998f, 14.460001f, 21.819998f, 14.490001f, 21.579998f);
generalPath.lineTo(14.870001f, 18.929998f);
generalPath.curveTo(15.4800005f, 18.679998f, 16.04f, 18.339998f, 16.560001f, 17.949999f);
generalPath.lineTo(19.050001f, 18.949999f);
generalPath.curveTo(19.28f, 19.039999f, 19.54f, 18.949999f, 19.660002f, 18.73f);
generalPath.lineTo(21.660002f, 15.2699995f);
generalPath.curveTo(21.780003f, 15.049999f, 21.730001f, 14.78f, 21.54f, 14.629999f);
generalPath.lineTo(19.43f, 12.98f);
generalPath.closePath();
generalPath.moveTo(12.0f, 15.5f);
generalPath.curveTo(10.07f, 15.5f, 8.5f, 13.93f, 8.5f, 12.0f);
generalPath.curveTo(8.5f, 10.07f, 10.07f, 8.5f, 12.0f, 8.5f);
generalPath.curveTo(13.93f, 8.5f, 15.5f, 10.07f, 15.5f, 12.0f);
generalPath.curveTo(15.5f, 13.93f, 13.93f, 15.5f, 12.0f, 15.5f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
        return 2.2099995613098145;
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
		return 19.570003509521484;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 19.999998092651367;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ic_settings_white_24px() {
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
    public static NeonIcon of(int width, int height) {
       ic_settings_white_24px base = new ic_settings_white_24px();
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
       ic_settings_white_24px base = new ic_settings_white_24px();
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
        return ic_settings_white_24px::new;
    }
}

