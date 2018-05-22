package org.pushingpixels.substance.internal.svg;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.Icon;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.api.icon.IsHiDpiAware;
import org.pushingpixels.substance.api.icon.IsResizable;
import org.pushingpixels.substance.api.icon.SubstanceIcon;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/ibis">Ibis SVG transcoder</a>.
 */
public class ic_brightness_high_black_24px implements Icon, IsResizable, IsHiDpiAware, UIResource {
    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = ((Graphics2D)g).getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(20.0, 8.69);
((GeneralPath)shape).lineTo(20.0, 4.0);
((GeneralPath)shape).lineTo(15.309999, 4.0);
((GeneralPath)shape).lineTo(12.0, 0.69);
((GeneralPath)shape).lineTo(8.69, 4.0);
((GeneralPath)shape).lineTo(4.0, 4.0);
((GeneralPath)shape).lineTo(4.0, 8.690001);
((GeneralPath)shape).lineTo(0.69, 12.0);
((GeneralPath)shape).lineTo(4.0, 15.31);
((GeneralPath)shape).lineTo(4.0, 20.0);
((GeneralPath)shape).lineTo(8.690001, 20.0);
((GeneralPath)shape).lineTo(12.0, 23.31);
((GeneralPath)shape).lineTo(15.31, 20.0);
((GeneralPath)shape).lineTo(20.0, 20.0);
((GeneralPath)shape).lineTo(20.0, 15.309999);
((GeneralPath)shape).lineTo(23.31, 12.0);
((GeneralPath)shape).lineTo(20.0, 8.69);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.0, 18.0);
((GeneralPath)shape).curveTo(8.690001, 18.0, 6.0, 15.309999, 6.0, 12.0);
((GeneralPath)shape).curveTo(6.0, 8.690001, 8.690001, 6.0, 12.0, 6.0);
((GeneralPath)shape).curveTo(15.309999, 6.0, 18.0, 8.690001, 18.0, 12.0);
((GeneralPath)shape).curveTo(18.0, 15.309999, 15.309999, 18.0, 12.0, 18.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.0, 8.0);
((GeneralPath)shape).curveTo(9.79, 8.0, 8.0, 9.79, 8.0, 12.0);
((GeneralPath)shape).curveTo(8.0, 14.21, 9.79, 16.0, 12.0, 16.0);
((GeneralPath)shape).curveTo(14.21, 16.0, 16.0, 14.21, 16.0, 12.0);
((GeneralPath)shape).curveTo(16.0, 9.79, 14.21, 8.0, 12.0, 8.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.6899999976158142;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.6899999976158142;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 22.619998931884766;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 22.619998931884766;
	}

    /** The current width of this resizable icon. */
    private int width;

    /** The current height of this resizable icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image. It is recommended to use the 
     * {@link #of(int, int)} method to obtain a pre-configured instance.
     */
	public ic_brightness_high_black_24px() {
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
    public void setDimension(Dimension newDimension) {
        this.width = newDimension.width;
        this.height = newDimension.height;
    }
    
    @Override
    public boolean isHiDpiAware() {
        return true;
    }

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(x, y);

		double coef1 = (double) this.width / (double) getOrigWidth();
		double coef2 = (double) this.height / (double) getOrigHeight();
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
     * Returns an instance of this icon with specified dimensions.
     */
    public static SubstanceIcon of(int width, int height) {
       ic_brightness_high_black_24px base = new ic_brightness_high_black_24px();
       base.width = width;
       base.height = height;
       return new SubstanceIcon(base);
    }
    
    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static SubstanceIconUIResource uiResourceOf(int width, int height) {
       ic_brightness_high_black_24px base = new ic_brightness_high_black_24px();
       base.width = width;
       base.height = height;
       return new SubstanceIconUIResource(base);
    }
}

