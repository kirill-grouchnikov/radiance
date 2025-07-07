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
public class help_24dp implements RadianceIcon {
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
generalPath.moveTo(478.0f, -240.0f);
generalPath.quadTo(499.0f, -240.0f, 513.5f, -254.5f);
generalPath.quadTo(528.0f, -269.0f, 528.0f, -290.0f);
generalPath.quadTo(528.0f, -311.0f, 513.5f, -325.5f);
generalPath.quadTo(499.0f, -340.0f, 478.0f, -340.0f);
generalPath.quadTo(457.0f, -340.0f, 442.5f, -325.5f);
generalPath.quadTo(428.0f, -311.0f, 428.0f, -290.0f);
generalPath.quadTo(428.0f, -269.0f, 442.5f, -254.5f);
generalPath.quadTo(457.0f, -240.0f, 478.0f, -240.0f);
generalPath.closePath();
generalPath.moveTo(442.0f, -394.0f);
generalPath.lineTo(516.0f, -394.0f);
generalPath.quadTo(516.0f, -427.0f, 523.5f, -446.0f);
generalPath.quadTo(531.0f, -465.0f, 566.0f, -498.0f);
generalPath.quadTo(592.0f, -524.0f, 607.0f, -547.5f);
generalPath.quadTo(622.0f, -571.0f, 622.0f, -604.0f);
generalPath.quadTo(622.0f, -660.0f, 581.0f, -690.0f);
generalPath.quadTo(540.0f, -720.0f, 484.0f, -720.0f);
generalPath.quadTo(427.0f, -720.0f, 391.5f, -690.0f);
generalPath.quadTo(356.0f, -660.0f, 342.0f, -618.0f);
generalPath.lineTo(408.0f, -592.0f);
generalPath.quadTo(413.0f, -610.0f, 430.5f, -631.0f);
generalPath.quadTo(448.0f, -652.0f, 484.0f, -652.0f);
generalPath.quadTo(516.0f, -652.0f, 532.0f, -634.5f);
generalPath.quadTo(548.0f, -617.0f, 548.0f, -596.0f);
generalPath.quadTo(548.0f, -576.0f, 536.0f, -558.5f);
generalPath.quadTo(524.0f, -541.0f, 506.0f, -526.0f);
generalPath.quadTo(462.0f, -487.0f, 452.0f, -467.0f);
generalPath.quadTo(442.0f, -447.0f, 442.0f, -394.0f);
generalPath.closePath();
generalPath.moveTo(480.0f, -80.0f);
generalPath.quadTo(397.0f, -80.0f, 324.0f, -111.5f);
generalPath.quadTo(251.0f, -143.0f, 197.0f, -197.0f);
generalPath.quadTo(143.0f, -251.0f, 111.5f, -324.0f);
generalPath.quadTo(80.0f, -397.0f, 80.0f, -480.0f);
generalPath.quadTo(80.0f, -563.0f, 111.5f, -636.0f);
generalPath.quadTo(143.0f, -709.0f, 197.0f, -763.0f);
generalPath.quadTo(251.0f, -817.0f, 324.0f, -848.5f);
generalPath.quadTo(397.0f, -880.0f, 480.0f, -880.0f);
generalPath.quadTo(563.0f, -880.0f, 636.0f, -848.5f);
generalPath.quadTo(709.0f, -817.0f, 763.0f, -763.0f);
generalPath.quadTo(817.0f, -709.0f, 848.5f, -636.0f);
generalPath.quadTo(880.0f, -563.0f, 880.0f, -480.0f);
generalPath.quadTo(880.0f, -397.0f, 848.5f, -324.0f);
generalPath.quadTo(817.0f, -251.0f, 763.0f, -197.0f);
generalPath.quadTo(709.0f, -143.0f, 636.0f, -111.5f);
generalPath.quadTo(563.0f, -80.0f, 480.0f, -80.0f);
generalPath.closePath();
generalPath.moveTo(480.0f, -160.0f);
generalPath.quadTo(614.0f, -160.0f, 707.0f, -253.0f);
generalPath.quadTo(800.0f, -346.0f, 800.0f, -480.0f);
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
	private help_24dp() {
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
       help_24dp base = new help_24dp();
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
       help_24dp base = new help_24dp();
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
        return help_24dp::new;
    }
}

