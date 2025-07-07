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
public class content_cut_24dp implements RadianceIcon {
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
generalPath.moveTo(760.0f, -120.0f);
generalPath.lineTo(480.0f, -400.0f);
generalPath.lineTo(386.0f, -306.0f);
generalPath.quadTo(394.0f, -291.0f, 397.0f, -274.0f);
generalPath.quadTo(400.0f, -257.0f, 400.0f, -240.0f);
generalPath.quadTo(400.0f, -174.0f, 353.0f, -127.0f);
generalPath.quadTo(306.0f, -80.0f, 240.0f, -80.0f);
generalPath.quadTo(174.0f, -80.0f, 127.0f, -127.0f);
generalPath.quadTo(80.0f, -174.0f, 80.0f, -240.0f);
generalPath.quadTo(80.0f, -306.0f, 127.0f, -353.0f);
generalPath.quadTo(174.0f, -400.0f, 240.0f, -400.0f);
generalPath.quadTo(257.0f, -400.0f, 274.0f, -397.0f);
generalPath.quadTo(291.0f, -394.0f, 306.0f, -386.0f);
generalPath.lineTo(400.0f, -480.0f);
generalPath.lineTo(306.0f, -574.0f);
generalPath.quadTo(291.0f, -566.0f, 274.0f, -563.0f);
generalPath.quadTo(257.0f, -560.0f, 240.0f, -560.0f);
generalPath.quadTo(174.0f, -560.0f, 127.0f, -607.0f);
generalPath.quadTo(80.0f, -654.0f, 80.0f, -720.0f);
generalPath.quadTo(80.0f, -786.0f, 127.0f, -833.0f);
generalPath.quadTo(174.0f, -880.0f, 240.0f, -880.0f);
generalPath.quadTo(306.0f, -880.0f, 353.0f, -833.0f);
generalPath.quadTo(400.0f, -786.0f, 400.0f, -720.0f);
generalPath.quadTo(400.0f, -703.0f, 397.0f, -686.0f);
generalPath.quadTo(394.0f, -669.0f, 386.0f, -654.0f);
generalPath.lineTo(880.0f, -160.0f);
generalPath.lineTo(880.0f, -120.0f);
generalPath.lineTo(760.0f, -120.0f);
generalPath.closePath();
generalPath.moveTo(600.0f, -520.0f);
generalPath.lineTo(520.0f, -600.0f);
generalPath.lineTo(760.0f, -840.0f);
generalPath.lineTo(880.0f, -840.0f);
generalPath.lineTo(880.0f, -800.0f);
generalPath.lineTo(600.0f, -520.0f);
generalPath.closePath();
generalPath.moveTo(240.0f, -640.0f);
generalPath.quadTo(273.0f, -640.0f, 296.5f, -663.5f);
generalPath.quadTo(320.0f, -687.0f, 320.0f, -720.0f);
generalPath.quadTo(320.0f, -753.0f, 296.5f, -776.5f);
generalPath.quadTo(273.0f, -800.0f, 240.0f, -800.0f);
generalPath.quadTo(207.0f, -800.0f, 183.5f, -776.5f);
generalPath.quadTo(160.0f, -753.0f, 160.0f, -720.0f);
generalPath.quadTo(160.0f, -687.0f, 183.5f, -663.5f);
generalPath.quadTo(207.0f, -640.0f, 240.0f, -640.0f);
generalPath.closePath();
generalPath.moveTo(480.0f, -460.0f);
generalPath.quadTo(488.0f, -460.0f, 494.0f, -466.0f);
generalPath.quadTo(500.0f, -472.0f, 500.0f, -480.0f);
generalPath.quadTo(500.0f, -488.0f, 494.0f, -494.0f);
generalPath.quadTo(488.0f, -500.0f, 480.0f, -500.0f);
generalPath.quadTo(472.0f, -500.0f, 466.0f, -494.0f);
generalPath.quadTo(460.0f, -488.0f, 460.0f, -480.0f);
generalPath.quadTo(460.0f, -472.0f, 466.0f, -466.0f);
generalPath.quadTo(472.0f, -460.0f, 480.0f, -460.0f);
generalPath.closePath();
generalPath.moveTo(240.0f, -160.0f);
generalPath.quadTo(273.0f, -160.0f, 296.5f, -183.5f);
generalPath.quadTo(320.0f, -207.0f, 320.0f, -240.0f);
generalPath.quadTo(320.0f, -273.0f, 296.5f, -296.5f);
generalPath.quadTo(273.0f, -320.0f, 240.0f, -320.0f);
generalPath.quadTo(207.0f, -320.0f, 183.5f, -296.5f);
generalPath.quadTo(160.0f, -273.0f, 160.0f, -240.0f);
generalPath.quadTo(160.0f, -207.0f, 183.5f, -183.5f);
generalPath.quadTo(207.0f, -160.0f, 240.0f, -160.0f);
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
	private content_cut_24dp() {
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
       content_cut_24dp base = new content_cut_24dp();
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
       content_cut_24dp base = new content_cut_24dp();
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
        return content_cut_24dp::new;
    }
}

