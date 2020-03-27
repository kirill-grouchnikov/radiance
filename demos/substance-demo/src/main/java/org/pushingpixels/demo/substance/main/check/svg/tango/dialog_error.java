package org.pushingpixels.demo.substance.main.check.svg.tango;

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
public class dialog_error implements ResizableIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.6f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0705549716949463f, 0.0f, 0.0f, 0.5249999761581421f, -0.8927549719810486f, 22.5f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(41.0, 40.0);
generalPath.curveTo(41.027473, 43.071407, 37.766083, 45.9154, 32.45078, 47.455086);
generalPath.curveTo(27.135475, 48.994766, 20.578812, 48.994766, 15.263508, 47.455086);
generalPath.curveTo(9.948204, 45.9154, 6.6868153, 43.071407, 6.714287, 40.0);
generalPath.curveTo(6.6868153, 36.928593, 9.948204, 34.0846, 15.263508, 32.544914);
generalPath.curveTo(20.578812, 31.005232, 27.135475, 31.005232, 32.45078, 32.544914);
generalPath.curveTo(37.766083, 34.0846, 41.027473, 36.928593, 41.0, 40.0);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(23.85714340209961, 40.0), 17.142857f, new Point2D.Double(23.85714340209961, 40.0), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5f, 1.8930479945655602E-14f, 20.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9204879999160767f, 0.0f, 0.0f, 0.9204879999160767f, 2.3685319423675537f, 0.9740800261497498f));
// _0_1_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(46.857143, 23.928572);
generalPath.curveTo(46.894573, 32.29816, 42.45093, 40.048042, 35.208828, 44.24368);
generalPath.curveTo(27.966728, 48.439316, 19.033272, 48.439316, 11.79117, 44.24368);
generalPath.curveTo(4.549069, 40.048042, 0.10542657, 32.29816, 0.1428566, 23.928572);
generalPath.curveTo(0.10542657, 15.558984, 4.549069, 7.8091016, 11.79117, 3.6134653);
generalPath.curveTo(19.033272, -0.5821709, 27.966728, -0.5821709, 35.208828, 3.6134653);
generalPath.curveTo(42.45093, 7.8091016, 46.894573, 15.558984, 46.857143, 23.928572);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.91797637939453, 66.2880630493164), new Point2D.Double(19.071495056152344, 5.541010856628418), new float[] {0.0f,1.0f}, new Color[] {new Color(164, 0, 0, 255),new Color(255, 23, 23, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(178, 0, 0, 255);
stroke = new BasicStroke(1.08638f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(46.857143, 23.928572);
generalPath.curveTo(46.894573, 32.29816, 42.45093, 40.048042, 35.208828, 44.24368);
generalPath.curveTo(27.966728, 48.439316, 19.033272, 48.439316, 11.79117, 44.24368);
generalPath.curveTo(4.549069, 40.048042, 0.10542657, 32.29816, 0.1428566, 23.928572);
generalPath.curveTo(0.10542657, 15.558984, 4.549069, 7.8091016, 11.79117, 3.6134653);
generalPath.curveTo(19.033272, -0.5821709, 27.966728, -0.5821709, 35.208828, 3.6134653);
generalPath.curveTo(42.45093, 7.8091016, 46.894573, 15.558984, 46.857143, 23.928572);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.34659088f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.8560929894447327f, 0.0f, 0.0f, 0.8560929894447327f, 1.818274974822998f, 0.19776900112628937f));
// _0_1_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.901535, 26.635273);
generalPath.curveTo(49.93998, 35.232037, 45.375725, 43.192272, 37.937054, 47.50179);
generalPath.curveTo(30.49838, 51.811306, 21.322443, 51.811306, 13.883771, 47.50179);
generalPath.curveTo(6.445098, 43.192272, 1.8808427, 35.232037, 1.9192886, 26.635273);
generalPath.curveTo(1.8808427, 18.038511, 6.445098, 10.078274, 13.883771, 5.7687564);
generalPath.curveTo(21.322443, 1.4592386, 30.49838, 1.4592386, 37.937054, 5.7687564);
generalPath.curveTo(45.375725, 10.078274, 49.93998, 18.038511, 49.901535, 26.635273);
generalPath.closePath();
shape = generalPath;
paint = new Color(204, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(43.93581008911133, 53.83598327636719), new Point2D.Double(20.064685821533203, -8.562670707702637), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 230, 155, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.1680961f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.901535, 26.635273);
generalPath.curveTo(49.93998, 35.232037, 45.375725, 43.192272, 37.937054, 47.50179);
generalPath.curveTo(30.49838, 51.811306, 21.322443, 51.811306, 13.883771, 47.50179);
generalPath.curveTo(6.445098, 43.192272, 1.8808427, 35.232037, 1.9192886, 26.635273);
generalPath.curveTo(1.8808427, 18.038511, 6.445098, 10.078274, 13.883771, 5.7687564);
generalPath.curveTo(21.322443, 1.4592386, 30.49838, 1.4592386, 37.937054, 5.7687564);
generalPath.curveTo(45.375725, 10.078274, 49.93998, 18.038511, 49.901535, 26.635273);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0058759450912476f, 0.0f, 0.0f, 1.1152009963989258f, -0.13804499804973602f, -2.3727080821990967f));
// _0_2_0
shape = new Rectangle2D.Double(10.078821182250977, 19.164932250976562, 27.836435317993164, 7.1735944747924805);
paint = new Color(239, 239, 239, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0029939413070679f, 0.0f, 0.0f, 1.0029939413070679f, -0.07185874134302139f, 0.019683560356497765f));
// _0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.370686, 21.715487);
generalPath.curveTo(43.370686, 32.5461, 33.016357, 15.449178, 24.695948, 22.101873);
generalPath.curveTo(16.569626, 28.599384, 4.098984, 34.292423, 4.098984, 23.461805);
generalPath.curveTo(4.098984, 12.377753, 12.79438, 2.094803, 23.625, 2.094803);
generalPath.curveTo(34.45562, 2.094803, 43.370686, 10.884868, 43.370686, 21.715487);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.993772506713867, 33.955299377441406), new Point2D.Double(20.917078018188477, 15.81460189819336), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 254, 255, 85),new Color(255, 254, 255, 55)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
        return 1.9647797346115112;
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
		return 44.07044219970703;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 48.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private dialog_error() {
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
       dialog_error base = new dialog_error();
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
       dialog_error base = new dialog_error();
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
        return dialog_error::new;
    }
}

