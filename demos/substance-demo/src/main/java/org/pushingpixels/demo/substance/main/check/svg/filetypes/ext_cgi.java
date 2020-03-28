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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_cgi implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(113, 145, 161, 255);
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
generalPath.moveTo(16.2f, 55.5f);
generalPath.lineTo(30.9f, 65.0f);
generalPath.lineTo(30.9f, 58.0f);
generalPath.lineTo(56.0f, 58.0f);
generalPath.lineTo(56.0f, 53.0f);
generalPath.lineTo(30.9f, 53.0f);
generalPath.lineTo(30.9f, 46.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.253999710083008, 65.19100189208984), new Point2D.Double(42.72200012207031, 45.32699966430664), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(41.5f, 36.6f);
generalPath.lineTo(16.4f, 36.6f);
generalPath.lineTo(16.4f, 41.699997f);
generalPath.lineTo(41.5f, 41.699997f);
generalPath.lineTo(41.5f, 48.6f);
generalPath.lineTo(56.2f, 39.199997f);
generalPath.lineTo(41.5f, 29.699997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(29.677000045776367, 49.35499954223633), new Point2D.Double(41.145999908447266, 29.490999221801758), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new Color(113, 145, 161, 255);
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
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(26.0f, 84.5f);
generalPath.lineTo(29.9f, 85.7f);
generalPath.curveTo(29.3f, 87.899994f, 28.3f, 89.5f, 26.9f, 90.6f);
generalPath.curveTo(25.5f, 91.7f, 23.699999f, 92.2f, 21.599998f, 92.2f);
generalPath.curveTo(18.899998f, 92.2f, 16.8f, 91.299995f, 14.999998f, 89.5f);
generalPath.curveTo(13.299998f, 87.7f, 12.399998f, 85.2f, 12.399998f, 82.0f);
generalPath.curveTo(12.399998f, 78.7f, 13.299997f, 76.1f, 14.999998f, 74.2f);
generalPath.curveTo(16.699999f, 72.299995f, 18.999998f, 71.399994f, 21.8f, 71.399994f);
generalPath.curveTo(24.3f, 71.399994f, 26.199999f, 72.09999f, 27.8f, 73.59999f);
generalPath.curveTo(28.699999f, 74.49999f, 29.4f, 75.69999f, 29.9f, 77.29999f);
generalPath.lineTo(25.9f, 78.29999f);
generalPath.curveTo(25.699999f, 77.29999f, 25.199999f, 76.39999f, 24.4f, 75.79999f);
generalPath.curveTo(23.6f, 75.19999f, 22.699999f, 74.999985f, 21.6f, 74.999985f);
generalPath.curveTo(20.1f, 74.999985f, 18.9f, 75.499985f, 18.0f, 76.59998f);
generalPath.curveTo(17.1f, 77.69998f, 16.6f, 79.39999f, 16.6f, 81.79998f);
generalPath.curveTo(16.6f, 84.29998f, 17.1f, 86.09998f, 18.0f, 87.19998f);
generalPath.curveTo(18.9f, 88.29998f, 20.1f, 88.79998f, 21.6f, 88.79998f);
generalPath.curveTo(22.7f, 88.79998f, 23.6f, 88.49998f, 24.4f, 87.79998f);
generalPath.curveTo(25.1f, 87.09998f, 25.6f, 85.99998f, 26.0f, 84.49998f);
generalPath.closePath();
generalPath.moveTo(42.7f, 84.5f);
generalPath.lineTo(42.7f, 81.1f);
generalPath.lineTo(51.4f, 81.1f);
generalPath.lineTo(51.4f, 89.1f);
generalPath.curveTo(50.600002f, 89.9f, 49.300003f, 90.6f, 47.7f, 91.299995f);
generalPath.curveTo(46.100002f, 91.899994f, 44.5f, 92.2f, 42.8f, 92.2f);
generalPath.curveTo(40.7f, 92.2f, 38.899998f, 91.799995f, 37.3f, 90.899994f);
generalPath.curveTo(35.7f, 89.99999f, 34.6f, 88.799995f, 33.8f, 87.09999f);
generalPath.curveTo(33.0f, 85.49999f, 32.6f, 83.69999f, 32.6f, 81.79999f);
generalPath.curveTo(32.6f, 79.69999f, 33.0f, 77.89999f, 33.899998f, 76.19999f);
generalPath.curveTo(34.799995f, 74.49999f, 36.1f, 73.29999f, 37.699997f, 72.49999f);
generalPath.curveTo(38.999996f, 71.799995f, 40.6f, 71.49999f, 42.499996f, 71.49999f);
generalPath.curveTo(44.999996f, 71.49999f, 46.899998f, 71.99999f, 48.299995f, 73.09999f);
generalPath.curveTo(49.699997f, 74.09999f, 50.599995f, 75.59999f, 50.999996f, 77.399994f);
generalPath.lineTo(46.999996f, 78.2f);
generalPath.curveTo(46.699997f, 77.2f, 46.199997f, 76.399994f, 45.399998f, 75.899994f);
generalPath.curveTo(44.6f, 75.399994f, 43.8f, 74.99999f, 42.6f, 74.99999f);
generalPath.curveTo(40.8f, 74.99999f, 39.399998f, 75.59999f, 38.399998f, 76.69999f);
generalPath.curveTo(37.399998f, 77.79999f, 36.8f, 79.49999f, 36.8f, 81.69999f);
generalPath.curveTo(36.8f, 84.09999f, 37.3f, 85.89999f, 38.399998f, 87.09999f);
generalPath.curveTo(39.499996f, 88.29999f, 40.8f, 88.899994f, 42.6f, 88.899994f);
generalPath.curveTo(43.399998f, 88.899994f, 44.3f, 88.7f, 45.1f, 88.399994f);
generalPath.curveTo(46.0f, 88.09999f, 46.699997f, 87.7f, 47.3f, 87.2f);
generalPath.lineTo(47.3f, 84.7f);
generalPath.lineTo(42.7f, 84.7f);
generalPath.closePath();
generalPath.moveTo(55.0f, 91.9f);
generalPath.lineTo(55.0f, 71.9f);
generalPath.lineTo(59.0f, 71.9f);
generalPath.lineTo(59.0f, 91.9f);
generalPath.lineTo(55.0f, 91.9f);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
	private ext_cgi() {
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
       ext_cgi base = new ext_cgi();
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
       ext_cgi base = new ext_cgi();
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
        return ext_cgi::new;
    }
}

