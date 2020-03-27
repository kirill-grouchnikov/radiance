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
public class ext_pom implements ResizableIcon {
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
generalPath.moveTo(6.6, 90.1);
generalPath.lineTo(6.6, 70.2);
generalPath.lineTo(13.1, 70.2);
generalPath.curveTo(15.6, 70.2, 17.2, 70.299995, 17.900002, 70.5);
generalPath.curveTo(19.100002, 70.8, 20.000002, 71.4, 20.800001, 72.4);
generalPath.curveTo(21.6, 73.4, 22.000002, 74.700005, 22.000002, 76.3);
generalPath.curveTo(22.000002, 77.5, 21.800001, 78.5, 21.300001, 79.4);
generalPath.curveTo(20.900002, 80.200005, 20.300001, 80.9, 19.6, 81.4);
generalPath.curveTo(18.9, 81.9, 18.2, 82.200005, 17.5, 82.3);
generalPath.curveTo(16.5, 82.5, 15.1, 82.600006, 13.3, 82.600006);
generalPath.lineTo(10.700001, 82.600006);
generalPath.lineTo(10.700001, 90.100006);
generalPath.lineTo(6.6, 90.100006);
generalPath.closePath();
generalPath.moveTo(10.7, 73.6);
generalPath.lineTo(10.7, 79.2);
generalPath.lineTo(12.9, 79.2);
generalPath.curveTo(14.5, 79.2, 15.599999, 79.1, 16.1, 78.899994);
generalPath.curveTo(16.6, 78.7, 17.1, 78.399994, 17.4, 77.899994);
generalPath.curveTo(17.699999, 77.49999, 17.9, 76.899994, 17.9, 76.399994);
generalPath.curveTo(17.9, 75.7, 17.699999, 75.09999, 17.3, 74.59999);
generalPath.curveTo(16.9, 74.09999, 16.3, 73.79999, 15.699999, 73.69999);
generalPath.curveTo(15.199999, 73.59999, 14.199999, 73.59999, 12.799999, 73.59999);
generalPath.lineTo(10.699999, 73.59999);
generalPath.closePath();
generalPath.moveTo(24.5, 80.299995);
generalPath.curveTo(24.5, 78.299995, 24.8, 76.6, 25.4, 75.2);
generalPath.curveTo(25.9, 74.2, 26.5, 73.299995, 27.3, 72.5);
generalPath.curveTo(28.099998, 71.7, 29.0, 71.1, 29.9, 70.7);
generalPath.curveTo(31.199999, 70.2, 32.6, 69.899994, 34.2, 69.899994);
generalPath.curveTo(37.2, 69.899994, 39.5, 70.799995, 41.3, 72.59999);
generalPath.curveTo(43.1, 74.399994, 44.0, 76.899994, 44.0, 80.19999);
generalPath.curveTo(44.0, 83.39999, 43.1, 85.89999, 41.4, 87.69999);
generalPath.curveTo(39.700005, 89.49999, 37.300003, 90.39999, 34.300003, 90.39999);
generalPath.curveTo(31.300003, 90.39999, 28.900003, 89.499985, 27.200003, 87.69999);
generalPath.curveTo(25.500002, 85.899994, 24.500002, 83.39999, 24.500002, 80.29999);
generalPath.closePath();
generalPath.moveTo(28.7, 80.1);
generalPath.curveTo(28.7, 82.299995, 29.2, 84.0, 30.300001, 85.2);
generalPath.curveTo(31.400002, 86.399994, 32.7, 86.899994, 34.300003, 86.899994);
generalPath.curveTo(35.900005, 86.899994, 37.200005, 86.299995, 38.300003, 85.2);
generalPath.curveTo(39.4, 84.1, 39.9, 82.299995, 39.9, 80.0);
generalPath.curveTo(39.9, 77.7, 39.4, 76.0, 38.4, 74.9);
generalPath.curveTo(37.4, 73.8, 36.0, 73.200005, 34.4, 73.200005);
generalPath.curveTo(32.800003, 73.200005, 31.400002, 73.8, 30.400002, 74.9);
generalPath.curveTo(29.2, 76.1, 28.7, 77.9, 28.7, 80.1);
generalPath.closePath();
generalPath.moveTo(47.2, 90.1);
generalPath.lineTo(47.2, 70.2);
generalPath.lineTo(53.3, 70.2);
generalPath.lineTo(56.899998, 83.7);
generalPath.lineTo(60.499996, 70.2);
generalPath.lineTo(66.6, 70.2);
generalPath.lineTo(66.6, 90.0);
generalPath.lineTo(62.8, 90.0);
generalPath.lineTo(62.8, 74.5);
generalPath.lineTo(58.8, 90.1);
generalPath.lineTo(54.899998, 90.1);
generalPath.lineTo(50.899998, 74.5);
generalPath.lineTo(50.899998, 90.1);
generalPath.lineTo(47.199997, 90.1);
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
generalPath.moveTo(56.5, 27.1);
generalPath.curveTo(56.5, 27.1, 42.1, 27.300001, 32.9, 39.0);
generalPath.curveTo(32.4, 39.7, 31.900002, 40.3, 31.400002, 41.0);
generalPath.curveTo(31.100002, 41.4, 30.800001, 45.4, 30.800001, 45.4);
generalPath.curveTo(30.800001, 45.4, 30.400002, 45.100002, 30.2, 44.600002);
generalPath.curveTo(29.900002, 44.000004, 29.800001, 43.300003, 29.800001, 43.300003);
generalPath.curveTo(24.600002, 51.800003, 26.1, 56.200005, 26.1, 56.200005);
generalPath.curveTo(25.7, 57.200005, 24.9, 57.800003, 23.800001, 60.100006);
generalPath.curveTo(22.7, 62.400005, 22.800001, 64.600006, 22.800001, 64.600006);
generalPath.curveTo(22.800001, 65.00001, 22.900002, 65.100006, 23.1, 64.700005);
generalPath.curveTo(23.1, 64.700005, 24.300001, 62.400005, 25.2, 60.900005);
generalPath.curveTo(25.800001, 59.900005, 27.6, 57.600006, 27.6, 57.600006);
generalPath.curveTo(27.6, 57.600006, 30.6, 57.700005, 34.2, 56.800007);
generalPath.curveTo(33.9, 56.70001, 32.9, 56.400005, 32.2, 56.100006);
generalPath.curveTo(31.5, 55.800007, 31.1, 55.300007, 31.1, 55.300007);
generalPath.lineTo(44.0, 52.300007);
generalPath.curveTo(45.8, 51.20001, 47.4, 49.900005, 48.7, 48.300007);
generalPath.curveTo(55.5, 40.200005, 57.2, 27.800007, 57.2, 27.800007);
generalPath.curveTo(57.3, 27.400007, 57.0, 27.100006, 56.5, 27.100006);
generalPath.closePath();
generalPath.moveTo(43.7, 40.0);
generalPath.curveTo(43.7, 40.0, 37.7, 45.3, 34.7, 48.1);
generalPath.curveTo(31.7, 50.899998, 27.7, 57.6, 27.7, 57.6);
generalPath.lineTo(26.2, 56.199997);
generalPath.curveTo(26.2, 56.199997, 27.300001, 53.499996, 31.7, 48.1);
generalPath.curveTo(36.1, 42.7, 43.5, 39.5, 43.5, 39.5);
generalPath.curveTo(44.4, 39.1, 44.5, 39.3, 43.7, 40.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(22.788000106811523, 46.0), new Point2D.Double(57.21200180053711, 46.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_pom() {
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
       ext_pom base = new ext_pom();
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
       ext_pom base = new ext_pom();
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
        return ext_pom::new;
    }
}

