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
public class ext_ttf implements ResizableIcon {
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(71.9, 27.7);
generalPath.lineTo(71.9, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(190, 192, 219, 255),new Color(206, 205, 230, 255),new Color(225, 220, 243, 255),new Color(239, 230, 251, 255),new Color(245, 245, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(71.9, 27.7);
generalPath.lineTo(71.9, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 135, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(71.9, 27.7);
generalPath.lineTo(71.9, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.0, 1.0);
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
generalPath.moveTo(44.7, 1.0);
generalPath.lineTo(71.6, 27.7);
generalPath.lineTo(44.7, 27.7);
generalPath.lineTo(44.7, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.75400161743164, 74.23400115966797), new Point2D.Double(58.198001861572266, 87.677001953125), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 245, 255, 255),new Color(250, 241, 251, 255),new Color(237, 231, 244, 255),new Color(221, 219, 233, 255),new Color(199, 201, 218, 255),new Color(173, 179, 199, 255),new Color(146, 145, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.7, 1.0);
generalPath.lineTo(71.6, 27.7);
generalPath.lineTo(44.7, 27.7);
generalPath.lineTo(44.7, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.7, 1.0);
generalPath.lineTo(71.6, 27.7);
generalPath.lineTo(44.7, 27.7);
generalPath.lineTo(44.7, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(41.0, 22.2);
generalPath.lineTo(41.0, 30.0);
generalPath.lineTo(40.2, 30.0);
generalPath.curveTo(39.7, 28.2, 39.2, 26.9, 38.7, 26.1);
generalPath.curveTo(38.100002, 25.300001, 37.4, 24.7, 36.4, 24.2);
generalPath.curveTo(35.9, 23.900002, 34.9, 23.800001, 33.600002, 23.800001);
generalPath.lineTo(31.400002, 23.800001);
generalPath.lineTo(31.400002, 46.0);
generalPath.curveTo(31.400002, 47.5, 31.500002, 48.4, 31.600002, 48.8);
generalPath.curveTo(31.700003, 49.199997, 32.100002, 49.5, 32.600002, 49.8);
generalPath.curveTo(33.100002, 50.1, 33.7, 50.2, 34.600002, 50.2);
generalPath.lineTo(35.600002, 50.2);
generalPath.lineTo(35.600002, 51.0);
generalPath.lineTo(20.4, 51.0);
generalPath.lineTo(20.4, 50.2);
generalPath.lineTo(21.4, 50.2);
generalPath.curveTo(22.199999, 50.2, 22.9, 50.100002, 23.4, 49.8);
generalPath.curveTo(23.8, 49.6, 24.1, 49.3, 24.3, 48.8);
generalPath.curveTo(24.5, 48.5, 24.5, 47.6, 24.5, 46.1);
generalPath.lineTo(24.5, 23.9);
generalPath.lineTo(22.4, 23.9);
generalPath.curveTo(20.4, 23.9, 19.0, 24.3, 18.099998, 25.1);
generalPath.curveTo(16.899998, 26.2, 16.099998, 27.9, 15.699999, 30.0);
generalPath.lineTo(14.899999, 30.0);
generalPath.lineTo(14.899999, 22.2);
generalPath.lineTo(41.0, 22.2);
generalPath.closePath();
shape = generalPath;
paint = new Color(114, 145, 161, 255);
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(54.1, 30.8);
generalPath.lineTo(54.1, 38.6);
generalPath.lineTo(53.3, 38.6);
generalPath.curveTo(52.8, 36.8, 52.3, 35.5, 51.8, 34.699997);
generalPath.curveTo(51.2, 33.899998, 50.5, 33.299995, 49.5, 32.799995);
generalPath.curveTo(49.0, 32.499996, 48.0, 32.399994, 46.7, 32.399994);
generalPath.lineTo(44.5, 32.399994);
generalPath.lineTo(44.5, 54.599995);
generalPath.curveTo(44.5, 56.099995, 44.6, 56.999996, 44.7, 57.399994);
generalPath.curveTo(44.9, 57.799995, 45.2, 58.099995, 45.7, 58.399994);
generalPath.curveTo(46.2, 58.699993, 46.8, 58.799995, 47.7, 58.799995);
generalPath.lineTo(48.7, 58.799995);
generalPath.lineTo(48.7, 59.599995);
generalPath.lineTo(33.5, 59.599995);
generalPath.lineTo(33.5, 58.799995);
generalPath.lineTo(34.5, 58.799995);
generalPath.curveTo(35.3, 58.799995, 36.0, 58.699997, 36.5, 58.399994);
generalPath.curveTo(36.9, 58.199993, 37.2, 57.899994, 37.4, 57.399994);
generalPath.curveTo(37.600002, 57.099995, 37.600002, 56.199993, 37.600002, 54.699993);
generalPath.lineTo(37.600002, 32.4);
generalPath.lineTo(35.500004, 32.4);
generalPath.curveTo(33.500004, 32.4, 32.100002, 32.800003, 31.200005, 33.600002);
generalPath.curveTo(30.000004, 34.7, 29.200005, 36.4, 28.800005, 38.500004);
generalPath.lineTo(28.0, 38.500004);
generalPath.lineTo(28.0, 30.700005);
generalPath.lineTo(54.1, 30.700005);
generalPath.closePath();
shape = generalPath;
paint = new Color(54, 69, 77, 255);
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
generalPath.moveTo(16.9, 92.1);
generalPath.lineTo(16.9, 75.6);
generalPath.lineTo(11.0, 75.6);
generalPath.lineTo(11.0, 72.2);
generalPath.lineTo(26.9, 72.2);
generalPath.lineTo(26.9, 75.6);
generalPath.lineTo(21.0, 75.6);
generalPath.lineTo(21.0, 92.1);
generalPath.lineTo(16.9, 92.1);
generalPath.closePath();
generalPath.moveTo(33.9, 92.1);
generalPath.lineTo(33.9, 75.6);
generalPath.lineTo(28.0, 75.6);
generalPath.lineTo(28.0, 72.2);
generalPath.lineTo(43.9, 72.2);
generalPath.lineTo(43.9, 75.6);
generalPath.lineTo(38.0, 75.6);
generalPath.lineTo(38.0, 92.1);
generalPath.lineTo(33.9, 92.1);
generalPath.closePath();
generalPath.moveTo(46.5, 92.1);
generalPath.lineTo(46.5, 72.2);
generalPath.lineTo(60.2, 72.2);
generalPath.lineTo(60.2, 75.6);
generalPath.lineTo(50.5, 75.6);
generalPath.lineTo(50.5, 80.299995);
generalPath.lineTo(58.8, 80.299995);
generalPath.lineTo(58.8, 83.7);
generalPath.lineTo(50.5, 83.7);
generalPath.lineTo(50.5, 92.1);
generalPath.lineTo(46.5, 92.1);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 98, 123, 255);
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
        return 0.13099998235702515;
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
		return 0.7380000352859497;
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
	private ext_ttf() {
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
       ext_ttf base = new ext_ttf();
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
       ext_ttf base = new ext_ttf();
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
        return ext_ttf::new;
    }
}

