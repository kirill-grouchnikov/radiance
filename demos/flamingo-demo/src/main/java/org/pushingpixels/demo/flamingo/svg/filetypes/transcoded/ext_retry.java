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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_retry implements ResizableIcon {
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
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
generalPath.moveTo(7.1, 90.1);
generalPath.lineTo(7.1, 77.2);
generalPath.lineTo(12.7, 77.2);
generalPath.curveTo(14.099999, 77.2, 15.1, 77.299995, 15.7, 77.5);
generalPath.curveTo(16.3, 77.700005, 16.8, 78.1, 17.2, 78.7);
generalPath.curveTo(17.6, 79.299995, 17.800001, 80.0, 17.800001, 80.7);
generalPath.curveTo(17.800001, 81.7, 17.500002, 82.5, 16.900002, 83.1);
generalPath.curveTo(16.300001, 83.7, 15.500002, 84.1, 14.300001, 84.299995);
generalPath.curveTo(14.900002, 84.6, 15.300001, 84.99999, 15.700001, 85.399994);
generalPath.curveTo(16.1, 85.799995, 16.6, 86.49999, 17.2, 87.49999);
generalPath.lineTo(18.800001, 89.99999);
generalPath.lineTo(15.600001, 89.99999);
generalPath.lineTo(13.700002, 87.19999);
generalPath.curveTo(13.000002, 86.19999, 12.600001, 85.59999, 12.300002, 85.29999);
generalPath.curveTo(12.000003, 84.999985, 11.800002, 84.89999, 11.500002, 84.79999);
generalPath.curveTo(11.200002, 84.69999, 10.800002, 84.69999, 10.200002, 84.69999);
generalPath.lineTo(9.700002, 84.69999);
generalPath.lineTo(9.700002, 90.09999);
generalPath.lineTo(7.1, 90.09999);
generalPath.closePath();
generalPath.moveTo(9.7, 82.6);
generalPath.lineTo(11.7, 82.6);
generalPath.curveTo(13.0, 82.6, 13.799999, 82.5, 14.1, 82.4);
generalPath.curveTo(14.400002, 82.3, 14.700001, 82.1, 14.8, 81.9);
generalPath.curveTo(14.9, 81.700005, 15.1, 81.3, 15.1, 80.9);
generalPath.curveTo(15.1, 80.5, 15.0, 80.1, 14.700001, 79.8);
generalPath.curveTo(14.500001, 79.5, 14.1, 79.4, 13.700001, 79.3);
generalPath.lineTo(9.700001, 79.3);
generalPath.lineTo(9.700001, 82.600006);
generalPath.closePath();
generalPath.moveTo(20.2, 90.1);
generalPath.lineTo(20.2, 77.2);
generalPath.lineTo(29.900002, 77.2);
generalPath.lineTo(29.900002, 79.399994);
generalPath.lineTo(22.900002, 79.399994);
generalPath.lineTo(22.900002, 82.299995);
generalPath.lineTo(29.500002, 82.299995);
generalPath.lineTo(29.500002, 84.49999);
generalPath.lineTo(22.900002, 84.49999);
generalPath.lineTo(22.900002, 88.0);
generalPath.lineTo(30.2, 88.0);
generalPath.lineTo(30.2, 90.2);
generalPath.lineTo(20.2, 90.2);
generalPath.closePath();
generalPath.moveTo(35.4, 90.1);
generalPath.lineTo(35.4, 79.4);
generalPath.lineTo(31.500002, 79.4);
generalPath.lineTo(31.500002, 77.200005);
generalPath.lineTo(41.9, 77.200005);
generalPath.lineTo(41.9, 79.4);
generalPath.lineTo(38.0, 79.4);
generalPath.lineTo(38.0, 90.1);
generalPath.lineTo(35.4, 90.1);
generalPath.closePath();
generalPath.moveTo(43.600002, 90.1);
generalPath.lineTo(43.600002, 77.2);
generalPath.lineTo(49.2, 77.2);
generalPath.curveTo(50.600002, 77.2, 51.600002, 77.299995, 52.2, 77.5);
generalPath.curveTo(52.8, 77.700005, 53.3, 78.1, 53.7, 78.7);
generalPath.curveTo(54.100002, 79.299995, 54.3, 80.0, 54.3, 80.7);
generalPath.curveTo(54.3, 81.7, 54.0, 82.5, 53.399998, 83.1);
generalPath.curveTo(52.799995, 83.7, 51.999996, 84.1, 50.8, 84.299995);
generalPath.curveTo(51.399998, 84.6, 51.8, 84.99999, 52.2, 85.399994);
generalPath.curveTo(52.600002, 85.799995, 53.100002, 86.49999, 53.7, 87.49999);
generalPath.lineTo(55.3, 89.99999);
generalPath.lineTo(52.1, 89.99999);
generalPath.lineTo(50.199997, 87.19999);
generalPath.curveTo(49.499996, 86.19999, 49.1, 85.59999, 48.799995, 85.29999);
generalPath.curveTo(48.599995, 84.999985, 48.299995, 84.89999, 47.999996, 84.79999);
generalPath.curveTo(47.699997, 84.69999, 47.299995, 84.69999, 46.699997, 84.69999);
generalPath.lineTo(46.199997, 84.69999);
generalPath.lineTo(46.199997, 90.09999);
generalPath.lineTo(43.6, 90.09999);
generalPath.closePath();
generalPath.moveTo(46.2, 82.6);
generalPath.lineTo(48.2, 82.6);
generalPath.curveTo(49.5, 82.6, 50.3, 82.5, 50.600002, 82.4);
generalPath.curveTo(50.900005, 82.3, 51.2, 82.1, 51.300003, 81.9);
generalPath.curveTo(51.500004, 81.6, 51.600002, 81.3, 51.600002, 80.9);
generalPath.curveTo(51.600002, 80.5, 51.500004, 80.1, 51.2, 79.8);
generalPath.curveTo(51.0, 79.5, 50.600002, 79.4, 50.2, 79.3);
generalPath.lineTo(46.2, 79.3);
generalPath.lineTo(46.2, 82.600006);
generalPath.closePath();
generalPath.moveTo(59.5, 90.1);
generalPath.lineTo(59.5, 84.7);
generalPath.lineTo(54.7, 77.2);
generalPath.lineTo(57.8, 77.2);
generalPath.lineTo(60.899998, 82.299995);
generalPath.lineTo(63.899998, 77.2);
generalPath.lineTo(66.899994, 77.2);
generalPath.lineTo(62.099995, 84.7);
generalPath.lineTo(62.099995, 90.1);
generalPath.lineTo(59.499996, 90.1);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
generalPath.moveTo(31.8, 32.0);
generalPath.curveTo(31.699999, 32.1, 31.699999, 32.1, 31.8, 32.0);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
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
generalPath.moveTo(55.4, 50.3);
generalPath.curveTo(55.4, 60.6, 47.0, 69.0, 36.7, 69.0);
generalPath.curveTo(26.400002, 69.0, 18.0, 60.6, 18.0, 50.3);
generalPath.curveTo(18.0, 46.7, 19.0, 43.399998, 20.8, 40.5);
generalPath.lineTo(26.8, 44.0);
generalPath.curveTo(25.599998, 45.8, 24.9, 48.0, 24.9, 50.3);
generalPath.curveTo(24.9, 56.7, 30.099998, 61.9, 36.5, 61.9);
generalPath.curveTo(42.9, 61.9, 48.2, 56.7, 48.2, 50.300003);
generalPath.curveTo(48.2, 44.9, 44.5, 40.4, 39.5, 39.100002);
generalPath.lineTo(39.5, 45.0);
generalPath.lineTo(22.4, 35.0);
generalPath.lineTo(39.8, 25.0);
generalPath.lineTo(39.8, 32.0);
generalPath.curveTo(48.6, 33.4, 55.4, 41.1, 55.4, 50.3);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0939998626709, 47.0), new Point2D.Double(55.40599822998047, 47.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
		return 0.7420000433921814;
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
	private ext_retry() {
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
       ext_retry base = new ext_retry();
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
       ext_retry base = new ext_retry();
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
        return ext_retry::new;
    }
}

