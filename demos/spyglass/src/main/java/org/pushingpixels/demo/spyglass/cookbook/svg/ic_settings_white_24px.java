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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ic_settings_white_24px implements ResizableIcon {
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
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.43, 12.98);
generalPath.curveTo(19.470001, 12.66, 19.5, 12.339999, 19.5, 12.0);
generalPath.curveTo(19.5, 11.660001, 19.47, 11.34, 19.43, 11.02);
generalPath.lineTo(21.54, 9.370001);
generalPath.curveTo(21.730001, 9.220001, 21.78, 8.950001, 21.660002, 8.7300005);
generalPath.lineTo(19.660002, 5.2700005);
generalPath.curveTo(19.54, 5.0500007, 19.270002, 4.9700003, 19.050001, 5.0500007);
generalPath.lineTo(16.560001, 6.0500007);
generalPath.curveTo(16.04, 5.6500006, 15.480001, 5.3200006, 14.870001, 5.0700006);
generalPath.lineTo(14.490001, 2.4200006);
generalPath.curveTo(14.46, 2.18, 14.25, 2.0, 14.0, 2.0);
generalPath.lineTo(10.0, 2.0);
generalPath.curveTo(9.75, 2.0, 9.54, 2.18, 9.51, 2.42);
generalPath.lineTo(9.13, 5.07);
generalPath.curveTo(8.52, 5.32, 7.96, 5.6600003, 7.44, 6.05);
generalPath.lineTo(4.95, 5.05);
generalPath.curveTo(4.72, 4.96, 4.46, 5.05, 4.3399997, 5.27);
generalPath.lineTo(2.3399997, 8.73);
generalPath.curveTo(2.2099996, 8.95, 2.2699997, 9.219999, 2.4599996, 9.37);
generalPath.lineTo(4.5699997, 11.0199995);
generalPath.curveTo(4.5299997, 11.339999, 4.4999995, 11.669999, 4.4999995, 12.0);
generalPath.curveTo(4.4999995, 12.330001, 4.5299997, 12.66, 4.5699997, 12.98);
generalPath.lineTo(2.4599998, 14.629999);
generalPath.curveTo(2.2699997, 14.779999, 2.2199998, 15.049999, 2.34, 15.2699995);
generalPath.lineTo(4.34, 18.73);
generalPath.curveTo(4.46, 18.949999, 4.73, 19.029999, 4.9500003, 18.949999);
generalPath.lineTo(7.4400005, 17.949999);
generalPath.curveTo(7.9600005, 18.349998, 8.52, 18.679998, 9.130001, 18.929998);
generalPath.lineTo(9.510001, 21.579998);
generalPath.curveTo(9.540001, 21.819998, 9.750001, 21.999998, 10.000001, 21.999998);
generalPath.lineTo(14.000001, 21.999998);
generalPath.curveTo(14.250001, 21.999998, 14.460001, 21.819998, 14.490001, 21.579998);
generalPath.lineTo(14.870001, 18.929998);
generalPath.curveTo(15.4800005, 18.679998, 16.04, 18.339998, 16.560001, 17.949999);
generalPath.lineTo(19.050001, 18.949999);
generalPath.curveTo(19.28, 19.039999, 19.54, 18.949999, 19.660002, 18.73);
generalPath.lineTo(21.660002, 15.2699995);
generalPath.curveTo(21.780003, 15.049999, 21.730001, 14.78, 21.54, 14.629999);
generalPath.lineTo(19.43, 12.98);
generalPath.closePath();
generalPath.moveTo(12.0, 15.5);
generalPath.curveTo(10.07, 15.5, 8.5, 13.93, 8.5, 12.0);
generalPath.curveTo(8.5, 10.07, 10.07, 8.5, 12.0, 8.5);
generalPath.curveTo(13.93, 8.5, 15.5, 10.07, 15.5, 12.0);
generalPath.curveTo(15.5, 13.93, 13.93, 15.5, 12.0, 15.5);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ic_settings_white_24px base = new ic_settings_white_24px();
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
        return ic_settings_white_24px::new;
    }
}

