package org.pushingpixels.demo.substance.main.check.svg.vaadin;

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
public class globe_wire implements NeonIcon {
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
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.0f, 0.0f);
generalPath.curveTo(3.5819998f, 0.0f, 0.0f, 3.582f, 0.0f, 8.0f);
generalPath.curveTo(0.0f, 12.418f, 3.582f, 16.0f, 8.0f, 16.0f);
generalPath.curveTo(12.418f, 16.0f, 16.0f, 12.418f, 16.0f, 8.0f);
generalPath.curveTo(16.0f, 3.5819998f, 12.418f, 0.0f, 8.0f, 0.0f);
generalPath.closePath();
generalPath.moveTo(14.8f, 9.5f);
generalPath.curveTo(14.8f, 10.0f, 14.1f, 10.16f, 12.8f, 10.5f);
generalPath.curveTo(12.924f, 9.911f, 13.0060005f, 9.223f, 13.029f, 8.52f);
generalPath.lineTo(15.030001f, 8.5f);
generalPath.curveTo(15.030001f, 8.86f, 14.950001f, 9.0f, 14.870001f, 9.5f);
generalPath.lineTo(14.870001f, 9.5f);
generalPath.closePath();
generalPath.moveTo(1.2f, 9.5f);
generalPath.lineTo(1.2f, 9.5f);
generalPath.curveTo(1.1f, 9.0f, 1.0500001f, 8.86f, 1.0f, 8.5f);
generalPath.lineTo(3.0f, 8.5f);
generalPath.curveTo(3.024f, 9.223f, 3.106f, 9.911f, 3.244f, 10.579f);
generalPath.curveTo(1.9f, 10.160001f, 1.2f, 10.0f, 1.2f, 9.5f);
generalPath.closePath();
generalPath.moveTo(1.2f, 6.5f);
generalPath.curveTo(1.2f, 6.0f, 1.9000001f, 5.84f, 3.2f, 5.5f);
generalPath.curveTo(3.085f, 6.094f, 3.013f, 6.784f, 3.0f, 7.489f);
generalPath.lineTo(1.0f, 7.5f);
generalPath.curveTo(1.0f, 7.14f, 1.08f, 7.0f, 1.16f, 6.5f);
generalPath.lineTo(1.16f, 6.5f);
generalPath.closePath();
generalPath.moveTo(8.5f, 5.0f);
generalPath.curveTo(9.63f, 5.013f, 10.726f, 5.107f, 11.798f, 5.277f);
generalPath.curveTo(11.845f, 5.92f, 11.963f, 6.687f, 11.999001f, 7.476f);
generalPath.lineTo(8.5f, 7.501f);
generalPath.lineTo(8.5f, 5.001f);
generalPath.closePath();
generalPath.moveTo(8.5f, 4.0f);
generalPath.lineTo(8.5f, 1.06f);
generalPath.curveTo(9.67f, 1.3299999f, 10.7f, 2.53f, 11.34f, 4.21f);
generalPath.curveTo(10.504f, 4.094f, 9.521f, 4.018f, 8.523001f, 4.0f);
generalPath.closePath();
generalPath.moveTo(7.5f, 1.06f);
generalPath.lineTo(7.5f, 4.0f);
generalPath.curveTo(6.483f, 4.015f, 5.499f, 4.087f, 4.532f, 4.214f);
generalPath.curveTo(5.3f, 2.5300002f, 6.33f, 1.3300002f, 7.5f, 1.0600002f);
generalPath.closePath();
generalPath.moveTo(7.5f, 5.0f);
generalPath.lineTo(7.5f, 7.5f);
generalPath.lineTo(4.0f, 7.5f);
generalPath.curveTo(4.031f, 6.6940002f, 4.142f, 5.929f, 4.326f, 5.193f);
generalPath.curveTo(5.2580004f, 5.113f, 6.361f, 5.016f, 7.484f, 5.0f);
generalPath.closePath();
generalPath.moveTo(4.0f, 8.5f);
generalPath.lineTo(7.5f, 8.5f);
generalPath.lineTo(7.5f, 11.0f);
generalPath.curveTo(6.37f, 10.987f, 5.274f, 10.893f, 4.2019997f, 10.723f);
generalPath.curveTo(4.1549997f, 10.08f, 4.0369997f, 9.313f, 4.0009995f, 8.524f);
generalPath.closePath();
generalPath.moveTo(7.5f, 12.0f);
generalPath.lineTo(7.5f, 14.940001f);
generalPath.curveTo(6.33f, 14.67f, 5.3f, 13.47f, 4.66f, 11.790001f);
generalPath.curveTo(5.496f, 11.906001f, 6.479f, 11.982001f, 7.4769998f, 12.000001f);
generalPath.closePath();
generalPath.moveTo(8.5f, 14.94f);
generalPath.lineTo(8.5f, 12.0f);
generalPath.curveTo(9.517f, 11.985f, 10.500999f, 11.913f, 11.468f, 11.786f);
generalPath.curveTo(10.700001f, 13.47f, 9.67f, 14.67f, 8.5f, 14.940001f);
generalPath.closePath();
generalPath.moveTo(8.5f, 11.0f);
generalPath.lineTo(8.5f, 8.5f);
generalPath.lineTo(12.0f, 8.5f);
generalPath.curveTo(11.969f, 9.306f, 11.858f, 10.071f, 11.674f, 10.807f);
generalPath.curveTo(10.742f, 10.887f, 9.639f, 10.984f, 8.516f, 11.0f);
generalPath.closePath();
generalPath.moveTo(15.0f, 7.5f);
generalPath.lineTo(13.0f, 7.5f);
generalPath.curveTo(12.976f, 6.777f, 12.894f, 6.0889997f, 12.756f, 5.421f);
generalPath.curveTo(14.11f, 5.82f, 14.7699995f, 5.98f, 14.7699995f, 6.5f);
generalPath.lineTo(14.7699995f, 6.5f);
generalPath.curveTo(14.9f, 7.0f, 14.95f, 7.14f, 14.999999f, 7.5f);
generalPath.closePath();
generalPath.moveTo(14.3f, 4.91f);
generalPath.curveTo(13.794001f, 4.706f, 13.194f, 4.5299997f, 12.574f, 4.41f);
generalPath.curveTo(12.213f, 3.3909998f, 11.765f, 2.5119998f, 11.185f, 1.7379999f);
generalPath.curveTo(12.540001f, 2.464f, 13.598001f, 3.5489998f, 14.252001f, 4.869f);
generalPath.closePath();
generalPath.moveTo(4.84f, 1.76f);
generalPath.curveTo(4.2720003f, 2.512f, 3.821f, 3.391f, 3.5350003f, 4.341f);
generalPath.curveTo(2.8360004f, 4.53f, 2.2360003f, 4.7060003f, 1.6610004f, 4.934f);
generalPath.curveTo(2.4120004f, 3.5440001f, 3.4840002f, 2.459f, 4.8f, 1.7780001f);
generalPath.closePath();
generalPath.moveTo(1.73f, 11.09f);
generalPath.curveTo(2.236f, 11.294001f, 2.836f, 11.47f, 3.4559999f, 11.59f);
generalPath.curveTo(3.817f, 12.609f, 4.265f, 13.488f, 4.845f, 14.262f);
generalPath.curveTo(3.4779997f, 13.54f, 2.4089997f, 12.455f, 1.7479999f, 11.1310005f);
generalPath.closePath();
generalPath.moveTo(11.17f, 14.24f);
generalPath.curveTo(11.734f, 13.4869995f, 12.182f, 12.608999f, 12.465f, 11.658999f);
generalPath.curveTo(13.1640005f, 11.469999f, 13.764f, 11.294f, 14.339f, 11.065999f);
generalPath.curveTo(13.587999f, 12.455999f, 12.516f, 13.540998f, 11.2f, 14.221999f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(68, 68, 68, 255)) : new Color(68, 68, 68, 255);
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
		return 16.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 16.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private globe_wire() {
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
       globe_wire base = new globe_wire();
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
       globe_wire base = new globe_wire();
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
        return globe_wire::new;
    }
}

