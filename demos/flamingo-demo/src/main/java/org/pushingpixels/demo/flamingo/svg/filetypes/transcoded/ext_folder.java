package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_folder implements NeonIcon {
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
g.transform(new AffineTransform(0.013888888992369175f, 0.0f, 0.0f, 0.013888888992369175f, -0.0f, 0.11805555643513799f));
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
generalPath.moveTo(2.6f, 18.3f);
generalPath.lineTo(2.6f, 2.5f);
generalPath.curveTo(2.6f, 1.6f, 3.3f, 0.79999995f, 4.3f, 0.79999995f);
generalPath.lineTo(27.599998f, 0.79999995f);
generalPath.lineTo(34.3f, 5.8f);
generalPath.lineTo(67.6f, 5.8f);
generalPath.curveTo(68.5f, 5.8f, 69.299995f, 6.6000004f, 69.299995f, 7.5f);
generalPath.lineTo(69.299995f, 18.4f);
generalPath.lineTo(2.6f, 18.4f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.94300079345703, 56.209999084472656), new Point2D.Double(35.94300079345703, 38.66400146484375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(252, 252, 253, 255)) : new Color(252, 252, 253, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 57.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(67, 66, 66, 255)) : new Color(67, 66, 66, 255);
stroke = new BasicStroke(1.25f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(2.6f, 18.3f);
generalPath.lineTo(2.6f, 2.5f);
generalPath.curveTo(2.6f, 1.6f, 3.3f, 0.79999995f, 4.3f, 0.79999995f);
generalPath.lineTo(27.599998f, 0.79999995f);
generalPath.lineTo(34.3f, 5.8f);
generalPath.lineTo(67.6f, 5.8f);
generalPath.curveTo(68.5f, 5.8f, 69.299995f, 6.6000004f, 69.299995f, 7.5f);
generalPath.lineTo(69.299995f, 18.4f);
generalPath.lineTo(2.6f, 18.4f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(4.3f, 54.3f);
generalPath.lineTo(67.6f, 54.3f);
generalPath.curveTo(68.5f, 54.3f, 69.2f, 53.5f, 69.299995f, 52.6f);
generalPath.lineTo(71.0f, 11.7f);
generalPath.curveTo(71.0f, 10.8f, 70.3f, 10.0f, 69.3f, 10.0f);
generalPath.lineTo(44.300003f, 10.0f);
generalPath.lineTo(37.600002f, 15.0f);
generalPath.lineTo(2.6000023f, 15.0f);
generalPath.curveTo(1.7000023f, 15.0f, 0.90000224f, 15.8f, 0.90000224f, 16.7f);
generalPath.lineTo(2.6000023f, 52.600002f);
generalPath.curveTo(2.7000022f, 53.500004f, 3.4000022f, 54.300003f, 4.300002f, 54.300003f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.94300079345703, 54.26300048828125), new Point2D.Double(35.94300079345703, 9.980999946594238), new float[] {0.109f,0.532f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(222, 190, 0, 255)) : new Color(222, 190, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 173, 4, 255)) : new Color(207, 173, 4, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(67, 66, 66, 255)) : new Color(67, 66, 66, 255);
stroke = new BasicStroke(1.25f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.3f, 54.3f);
generalPath.lineTo(67.6f, 54.3f);
generalPath.curveTo(68.5f, 54.3f, 69.2f, 53.5f, 69.299995f, 52.6f);
generalPath.lineTo(71.0f, 11.7f);
generalPath.curveTo(71.0f, 10.8f, 70.3f, 10.0f, 69.3f, 10.0f);
generalPath.lineTo(44.300003f, 10.0f);
generalPath.lineTo(37.600002f, 15.0f);
generalPath.lineTo(2.6000023f, 15.0f);
generalPath.curveTo(1.7000023f, 15.0f, 0.90000224f, 15.8f, 0.90000224f, 16.7f);
generalPath.lineTo(2.6000023f, 52.600002f);
generalPath.curveTo(2.7000022f, 53.500004f, 3.4000022f, 54.300003f, 4.300002f, 54.300003f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.6f, 4.1f);
generalPath.lineTo(25.9f, 4.1f);
generalPath.curveTo(26.8f, 4.1f, 27.6f, 4.9f, 27.6f, 5.8f);
generalPath.curveTo(27.6f, 6.7000003f, 26.9f, 7.5f, 25.9f, 7.5f);
generalPath.lineTo(7.6f, 7.5f);
generalPath.curveTo(6.7f, 7.5f, 5.8999996f, 6.7f, 5.8999996f, 5.8f);
generalPath.curveTo(5.8999996f, 4.9000006f, 6.7f, 4.1000004f, 7.5999994f, 4.1000004f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(67, 66, 66, 255)) : new Color(67, 66, 66, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(67, 66, 66, 255)) : new Color(67, 66, 66, 255);
stroke = new BasicStroke(1.25f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.6f, 4.1f);
generalPath.lineTo(25.9f, 4.1f);
generalPath.curveTo(26.8f, 4.1f, 27.6f, 4.9f, 27.6f, 5.8f);
generalPath.curveTo(27.6f, 6.7000003f, 26.9f, 7.5f, 25.9f, 7.5f);
generalPath.lineTo(7.6f, 7.5f);
generalPath.curveTo(6.7f, 7.5f, 5.8999996f, 6.7f, 5.8999996f, 5.8f);
generalPath.curveTo(5.8999996f, 4.9000006f, 6.7f, 4.1000004f, 7.5999994f, 4.1000004f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
        return 0.0038194756489247084;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.12048611044883728;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 0.9909722208976746;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 0.7604166865348816;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_folder() {
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
       ext_folder base = new ext_folder();
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
       ext_folder base = new ext_folder();
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
        return ext_folder::new;
    }
}

