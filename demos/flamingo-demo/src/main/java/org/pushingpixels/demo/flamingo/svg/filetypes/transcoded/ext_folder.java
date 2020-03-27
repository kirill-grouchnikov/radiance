package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_folder implements ResizableIcon {
    private Shape shape = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
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
shape = new GeneralPath();
((GeneralPath)shape).moveTo(2.6, 18.3);
((GeneralPath)shape).lineTo(2.6, 2.5);
((GeneralPath)shape).curveTo(2.6, 1.6, 3.3, 0.79999995, 4.3, 0.79999995);
((GeneralPath)shape).lineTo(27.599998, 0.79999995);
((GeneralPath)shape).lineTo(34.3, 5.8);
((GeneralPath)shape).lineTo(67.6, 5.8);
((GeneralPath)shape).curveTo(68.5, 5.8, 69.299995, 6.6000004, 69.299995, 7.5);
((GeneralPath)shape).lineTo(69.299995, 18.4);
((GeneralPath)shape).lineTo(2.6, 18.4);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.94300079345703, 56.209999084472656), new Point2D.Double(35.94300079345703, 38.66400146484375), new float[] {0.0f,1.0f}, new Color[] {new Color(252, 252, 253, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 57.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(67, 66, 66, 255);
stroke = new BasicStroke(1.25f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(2.6, 18.3);
((GeneralPath)shape).lineTo(2.6, 2.5);
((GeneralPath)shape).curveTo(2.6, 1.6, 3.3, 0.79999995, 4.3, 0.79999995);
((GeneralPath)shape).lineTo(27.599998, 0.79999995);
((GeneralPath)shape).lineTo(34.3, 5.8);
((GeneralPath)shape).lineTo(67.6, 5.8);
((GeneralPath)shape).curveTo(68.5, 5.8, 69.299995, 6.6000004, 69.299995, 7.5);
((GeneralPath)shape).lineTo(69.299995, 18.4);
((GeneralPath)shape).lineTo(2.6, 18.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.3, 54.3);
((GeneralPath)shape).lineTo(67.6, 54.3);
((GeneralPath)shape).curveTo(68.5, 54.3, 69.2, 53.5, 69.299995, 52.6);
((GeneralPath)shape).lineTo(71.0, 11.7);
((GeneralPath)shape).curveTo(71.0, 10.8, 70.3, 10.0, 69.3, 10.0);
((GeneralPath)shape).lineTo(44.300003, 10.0);
((GeneralPath)shape).lineTo(37.600002, 15.0);
((GeneralPath)shape).lineTo(2.6000023, 15.0);
((GeneralPath)shape).curveTo(1.7000023, 15.0, 0.90000224, 15.8, 0.90000224, 16.7);
((GeneralPath)shape).lineTo(2.6000023, 52.600002);
((GeneralPath)shape).curveTo(2.7000022, 53.500004, 3.4000022, 54.300003, 4.300002, 54.300003);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.94300079345703, 54.26300048828125), new Point2D.Double(35.94300079345703, 9.980999946594238), new float[] {0.109f,0.532f,1.0f}, new Color[] {new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(67, 66, 66, 255);
stroke = new BasicStroke(1.25f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(4.3, 54.3);
((GeneralPath)shape).lineTo(67.6, 54.3);
((GeneralPath)shape).curveTo(68.5, 54.3, 69.2, 53.5, 69.299995, 52.6);
((GeneralPath)shape).lineTo(71.0, 11.7);
((GeneralPath)shape).curveTo(71.0, 10.8, 70.3, 10.0, 69.3, 10.0);
((GeneralPath)shape).lineTo(44.300003, 10.0);
((GeneralPath)shape).lineTo(37.600002, 15.0);
((GeneralPath)shape).lineTo(2.6000023, 15.0);
((GeneralPath)shape).curveTo(1.7000023, 15.0, 0.90000224, 15.8, 0.90000224, 16.7);
((GeneralPath)shape).lineTo(2.6000023, 52.600002);
((GeneralPath)shape).curveTo(2.7000022, 53.500004, 3.4000022, 54.300003, 4.300002, 54.300003);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.6, 4.1);
((GeneralPath)shape).lineTo(25.9, 4.1);
((GeneralPath)shape).curveTo(26.8, 4.1, 27.6, 4.9, 27.6, 5.8);
((GeneralPath)shape).curveTo(27.6, 6.7000003, 26.9, 7.5, 25.9, 7.5);
((GeneralPath)shape).lineTo(7.6, 7.5);
((GeneralPath)shape).curveTo(6.7, 7.5, 5.8999996, 6.7, 5.8999996, 5.8);
((GeneralPath)shape).curveTo(5.8999996, 4.9000006, 6.7, 4.1000004, 7.5999994, 4.1000004);
((GeneralPath)shape).closePath();
paint = new Color(67, 66, 66, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(67, 66, 66, 255);
stroke = new BasicStroke(1.25f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.6, 4.1);
((GeneralPath)shape).lineTo(25.9, 4.1);
((GeneralPath)shape).curveTo(26.8, 4.1, 27.6, 4.9, 27.6, 5.8);
((GeneralPath)shape).curveTo(27.6, 6.7000003, 26.9, 7.5, 25.9, 7.5);
((GeneralPath)shape).lineTo(7.6, 7.5);
((GeneralPath)shape).curveTo(6.7, 7.5, 5.8999996, 6.7, 5.8999996, 5.8);
((GeneralPath)shape).curveTo(5.8999996, 4.9000006, 6.7, 4.1000004, 7.5999994, 4.1000004);
((GeneralPath)shape).closePath();
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
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
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_folder base = new ext_folder();
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
        return ext_folder::new;
    }
}

