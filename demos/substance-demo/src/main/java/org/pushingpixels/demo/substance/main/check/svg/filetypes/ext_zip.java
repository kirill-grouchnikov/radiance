package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_zip implements NeonIcon {
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
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 0.9940000176429749), new Point2D.Double(36.0, 99.0009994506836), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {new Color(239, 196, 2, 255),new Color(241, 200, 41, 255),new Color(244, 210, 100, 255),new Color(247, 220, 139, 255),new Color(249, 229, 172, 255),new Color(251, 236, 199, 255),new Color(252, 243, 221, 255),new Color(254, 249, 238, 255),new Color(255, 253, 249, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(14.4f, 92.1f);
generalPath.lineTo(14.4f, 88.5f);
generalPath.lineTo(24.9f, 75.6f);
generalPath.lineTo(15.599999f, 75.6f);
generalPath.lineTo(15.599999f, 72.2f);
generalPath.lineTo(30.3f, 72.2f);
generalPath.lineTo(30.3f, 75.299995f);
generalPath.lineTo(19.3f, 88.7f);
generalPath.lineTo(30.699999f, 88.7f);
generalPath.lineTo(30.699999f, 92.0f);
generalPath.lineTo(14.4f, 92.0f);
generalPath.closePath();
generalPath.moveTo(33.1f, 92.1f);
generalPath.lineTo(33.1f, 72.2f);
generalPath.lineTo(37.1f, 72.2f);
generalPath.lineTo(37.1f, 92.0f);
generalPath.lineTo(33.1f, 92.0f);
generalPath.closePath();
generalPath.moveTo(41.0f, 92.1f);
generalPath.lineTo(41.0f, 72.2f);
generalPath.lineTo(47.5f, 72.2f);
generalPath.curveTo(50.0f, 72.2f, 51.6f, 72.299995f, 52.3f, 72.5f);
generalPath.curveTo(53.399998f, 72.8f, 54.399998f, 73.4f, 55.2f, 74.4f);
generalPath.curveTo(56.000004f, 75.4f, 56.4f, 76.700005f, 56.4f, 78.3f);
generalPath.curveTo(56.4f, 79.5f, 56.2f, 80.5f, 55.7f, 81.4f);
generalPath.curveTo(55.2f, 82.3f, 54.7f, 82.9f, 54.0f, 83.4f);
generalPath.curveTo(53.3f, 83.9f, 52.6f, 84.200005f, 51.9f, 84.3f);
generalPath.curveTo(50.9f, 84.5f, 49.5f, 84.600006f, 47.7f, 84.600006f);
generalPath.lineTo(45.100002f, 84.600006f);
generalPath.lineTo(45.100002f, 92.100006f);
generalPath.lineTo(41.0f, 92.100006f);
generalPath.closePath();
generalPath.moveTo(45.1f, 75.6f);
generalPath.lineTo(45.1f, 81.2f);
generalPath.lineTo(47.3f, 81.2f);
generalPath.curveTo(48.899998f, 81.2f, 50.0f, 81.1f, 50.5f, 80.899994f);
generalPath.curveTo(51.0f, 80.69999f, 51.5f, 80.399994f, 51.8f, 79.899994f);
generalPath.curveTo(52.1f, 79.399994f, 52.3f, 78.899994f, 52.3f, 78.399994f);
generalPath.curveTo(52.3f, 77.7f, 52.1f, 77.09999f, 51.7f, 76.59999f);
generalPath.curveTo(51.3f, 76.09999f, 50.7f, 75.79999f, 50.100002f, 75.69999f);
generalPath.curveTo(49.600002f, 75.59999f, 48.600002f, 75.59999f, 47.2f, 75.59999f);
generalPath.lineTo(45.100002f, 75.59999f);
generalPath.closePath();
shape = generalPath;
paint = new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.06800079345703, 72.2040023803711), new Point2D.Double(58.56800079345703, 85.7040023803711), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 254, 251, 255),new Color(254, 250, 241, 255),new Color(253, 245, 228, 255),new Color(252, 240, 210, 255),new Color(250, 233, 188, 255),new Color(249, 226, 162, 255),new Color(247, 218, 131, 255),new Color(244, 209, 93, 255),new Color(241, 200, 39, 255),new Color(239, 196, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.0f, 15.8f);
generalPath.lineTo(29.5f, 15.8f);
generalPath.lineTo(29.5f, 10.9f);
generalPath.lineTo(38.0f, 10.9f);
generalPath.lineTo(38.0f, 15.799999f);
generalPath.closePath();
generalPath.moveTo(38.0f, 24.8f);
generalPath.lineTo(29.5f, 24.8f);
generalPath.lineTo(29.5f, 29.699999f);
generalPath.lineTo(38.0f, 29.699999f);
generalPath.lineTo(38.0f, 24.8f);
generalPath.closePath();
generalPath.moveTo(38.0f, 4.0f);
generalPath.lineTo(29.5f, 4.0f);
generalPath.lineTo(29.5f, 8.9f);
generalPath.lineTo(38.0f, 8.9f);
generalPath.lineTo(38.0f, 4.0f);
generalPath.closePath();
generalPath.moveTo(38.0f, 17.8f);
generalPath.lineTo(29.5f, 17.8f);
generalPath.lineTo(29.5f, 22.699999f);
generalPath.lineTo(38.0f, 22.699999f);
generalPath.lineTo(38.0f, 17.8f);
generalPath.closePath();
generalPath.moveTo(38.0f, 31.699999f);
generalPath.lineTo(29.5f, 31.699999f);
generalPath.lineTo(29.5f, 36.6f);
generalPath.lineTo(38.0f, 36.6f);
generalPath.lineTo(38.0f, 31.699999f);
generalPath.closePath();
generalPath.moveTo(38.7f, 56.199997f);
generalPath.curveTo(38.7f, 58.999996f, 36.4f, 61.199997f, 33.600002f, 61.199997f);
generalPath.curveTo(30.800003f, 61.199997f, 28.500002f, 58.899998f, 28.500002f, 56.199997f);
generalPath.lineTo(28.500002f, 55.699997f);
generalPath.lineTo(30.200003f, 41.1f);
generalPath.curveTo(30.200003f, 39.199997f, 31.700003f, 37.699997f, 33.600002f, 37.699997f);
generalPath.curveTo(35.4f, 37.699997f, 36.9f, 39.199997f, 37.000004f, 40.999996f);
generalPath.lineTo(38.600002f, 55.399994f);
generalPath.curveTo(38.7f, 55.699993f, 38.7f, 55.899994f, 38.7f, 56.199993f);
generalPath.closePath();
generalPath.moveTo(37.100002f, 55.999996f);
generalPath.curveTo(37.100002f, 54.099995f, 35.500004f, 52.499996f, 33.600002f, 52.499996f);
generalPath.curveTo(31.7f, 52.499996f, 30.100002f, 54.099995f, 30.100002f, 55.999996f);
generalPath.curveTo(30.100002f, 57.899998f, 31.700003f, 59.499996f, 33.600002f, 59.499996f);
generalPath.curveTo(35.600002f, 59.499996f, 37.100002f, 57.899998f, 37.100002f, 55.999996f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.599998474121094, 38.71200180053711), new Point2D.Double(33.599998474121094, 96.03099822998047), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {new Color(164, 125, 3, 255),new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.5f, 41.6f);
generalPath.lineTo(30.2f, 37.1f);
generalPath.lineTo(30.2f, 34.8f);
generalPath.lineTo(32.5f, 32.6f);
generalPath.lineTo(34.7f, 32.6f);
generalPath.lineTo(37.0f, 34.8f);
generalPath.lineTo(37.0f, 37.1f);
generalPath.lineTo(34.7f, 41.6f);
generalPath.lineTo(32.5f, 41.6f);
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
        return 0.12999999523162842;
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
		return 0.7400000095367432;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_zip() {
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
    public static NeonIcon of(int width, int height) {
       ext_zip base = new ext_zip();
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
       ext_zip base = new ext_zip();
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
        return ext_zip::new;
    }
}

