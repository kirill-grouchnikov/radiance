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
public class ic_palette_black_24px implements Icon, IsResizable, IsHiDpiAware, UIResource {
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
paint = new Color(0, 0, 0, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.0, 3.0);
((GeneralPath)shape).curveTo(7.03, 3.0, 3.0, 7.03, 3.0, 12.0);
((GeneralPath)shape).curveTo(3.0, 16.97, 7.03, 21.0, 12.0, 21.0);
((GeneralPath)shape).curveTo(12.83, 21.0, 13.5, 20.33, 13.5, 19.5);
((GeneralPath)shape).curveTo(13.5, 19.11, 13.35, 18.76, 13.11, 18.49);
((GeneralPath)shape).curveTo(12.88, 18.23, 12.73, 17.88, 12.73, 17.5);
((GeneralPath)shape).curveTo(12.73, 16.67, 13.4, 16.0, 14.23, 16.0);
((GeneralPath)shape).lineTo(16.0, 16.0);
((GeneralPath)shape).curveTo(18.76, 16.0, 21.0, 13.76, 21.0, 11.0);
((GeneralPath)shape).curveTo(21.0, 6.58, 16.97, 3.0, 12.0, 3.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(6.5, 12.0);
((GeneralPath)shape).curveTo(5.67, 12.0, 5.0, 11.33, 5.0, 10.5);
((GeneralPath)shape).curveTo(5.0, 9.67, 5.67, 9.0, 6.5, 9.0);
((GeneralPath)shape).curveTo(7.33, 9.0, 8.0, 9.67, 8.0, 10.5);
((GeneralPath)shape).curveTo(8.0, 11.33, 7.33, 12.0, 6.5, 12.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(9.5, 8.0);
((GeneralPath)shape).curveTo(8.67, 8.0, 8.0, 7.33, 8.0, 6.5);
((GeneralPath)shape).curveTo(8.0, 5.67, 8.67, 5.0, 9.5, 5.0);
((GeneralPath)shape).curveTo(10.33, 5.0, 11.0, 5.67, 11.0, 6.5);
((GeneralPath)shape).curveTo(11.0, 7.33, 10.33, 8.0, 9.5, 8.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(14.5, 8.0);
((GeneralPath)shape).curveTo(13.67, 8.0, 13.0, 7.33, 13.0, 6.5);
((GeneralPath)shape).curveTo(13.0, 5.67, 13.67, 5.0, 14.5, 5.0);
((GeneralPath)shape).curveTo(15.33, 5.0, 16.0, 5.67, 16.0, 6.5);
((GeneralPath)shape).curveTo(16.0, 7.33, 15.33, 8.0, 14.5, 8.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(17.5, 12.0);
((GeneralPath)shape).curveTo(16.67, 12.0, 16.0, 11.33, 16.0, 10.5);
((GeneralPath)shape).curveTo(16.0, 9.67, 16.67, 9.0, 17.5, 9.0);
((GeneralPath)shape).curveTo(18.33, 9.0, 19.0, 9.67, 19.0, 10.5);
((GeneralPath)shape).curveTo(19.0, 11.33, 18.33, 12.0, 17.5, 12.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
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
        return 3.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 3.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 18.0;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 18.0;
	}

    /** The current width of this resizable icon. */
    private int width;

    /** The current height of this resizable icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image. It is recommended to use the 
     * {@link #of(int, int)} method to obtain a pre-configured instance.
     */
	public ic_palette_black_24px() {
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
       ic_palette_black_24px base = new ic_palette_black_24px();
       base.width = width;
       base.height = height;
       return new SubstanceIcon(base);
    }
    
    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static SubstanceIconUIResource uiResourceOf(int width, int height) {
       ic_palette_black_24px base = new ic_palette_black_24px();
       base.width = width;
       base.height = height;
       return new SubstanceIconUIResource(base);
    }
}

