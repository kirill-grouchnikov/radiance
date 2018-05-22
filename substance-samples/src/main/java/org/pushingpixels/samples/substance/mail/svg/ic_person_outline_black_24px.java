package org.pushingpixels.samples.substance.mail.svg;

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
public class ic_person_outline_black_24px implements Icon, IsResizable, IsHiDpiAware, UIResource {
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
((GeneralPath)shape).moveTo(12.0, 5.9);
((GeneralPath)shape).curveTo(13.16, 5.9, 14.1, 6.84, 14.1, 8.0);
((GeneralPath)shape).curveTo(14.1, 9.16, 13.160001, 10.1, 12.0, 10.1);
((GeneralPath)shape).curveTo(10.839999, 10.1, 9.9, 9.16, 9.9, 8.0);
((GeneralPath)shape).curveTo(9.9, 6.84, 10.839999, 5.9, 12.0, 5.9);
((GeneralPath)shape).moveTo(12.0, 14.9);
((GeneralPath)shape).curveTo(14.97, 14.9, 18.1, 16.36, 18.1, 17.0);
((GeneralPath)shape).lineTo(18.1, 18.1);
((GeneralPath)shape).lineTo(5.9, 18.1);
((GeneralPath)shape).lineTo(5.9, 17.0);
((GeneralPath)shape).curveTo(5.9, 16.36, 9.030001, 14.9, 12.0, 14.9);
((GeneralPath)shape).moveTo(12.0, 4.0);
((GeneralPath)shape).curveTo(9.79, 4.0, 8.0, 5.79, 8.0, 8.0);
((GeneralPath)shape).curveTo(8.0, 10.21, 9.79, 12.0, 12.0, 12.0);
((GeneralPath)shape).curveTo(14.21, 12.0, 16.0, 10.21, 16.0, 8.0);
((GeneralPath)shape).curveTo(16.0, 5.79, 14.21, 4.0, 12.0, 4.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.0, 13.0);
((GeneralPath)shape).curveTo(9.33, 13.0, 4.0, 14.34, 4.0, 17.0);
((GeneralPath)shape).lineTo(4.0, 20.0);
((GeneralPath)shape).lineTo(20.0, 20.0);
((GeneralPath)shape).lineTo(20.0, 17.0);
((GeneralPath)shape).curveTo(20.0, 14.34, 14.67, 13.0, 12.0, 13.0);
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
        return 4.0;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 4.0;
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
     * Creates a new transcoded SVG image. It is recommended to use the 
     * {@link #of(int, int)} method to obtain a pre-configured instance.
     */
	public ic_person_outline_black_24px() {
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
       ic_person_outline_black_24px base = new ic_person_outline_black_24px();
       base.width = width;
       base.height = height;
       return new SubstanceIcon(base);
    }
    
    /**
     * Returns a {@link UIResource} instance of this icon with specified dimensions.
     */
    public static SubstanceIconUIResource uiResourceOf(int width, int height) {
       ic_person_outline_black_24px base = new ic_person_outline_black_24px();
       base.width = width;
       base.height = height;
       return new SubstanceIconUIResource(base);
    }
}

