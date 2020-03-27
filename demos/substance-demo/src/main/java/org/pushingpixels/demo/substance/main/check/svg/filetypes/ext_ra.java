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
public class ext_ra implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(72.3, 99.1);
generalPath.lineTo(0.0, 99.1);
generalPath.lineTo(0.0, 0.9);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.150001525878906, 2.88700008392334), new Point2D.Double(36.150001525878906, 101.1259994506836), new float[] {0.0f,0.012f,0.182f,0.352f,0.521f,0.687f,0.848f,1.0f}, new Color[] {new Color(89, 85, 147, 255),new Color(91, 87, 148, 255),new Color(123, 119, 170, 255),new Color(152, 150, 191, 255),new Color(178, 178, 210, 255),new Color(199, 201, 226, 255),new Color(214, 217, 236, 255),new Color(219, 223, 240, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(72.3, 99.1);
generalPath.lineTo(0.0, 99.1);
generalPath.lineTo(0.0, 0.9);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(72.3, 99.1);
generalPath.lineTo(0.0, 99.1);
generalPath.lineTo(0.0, 0.9);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(18.6, 91.2);
generalPath.lineTo(18.6, 71.3);
generalPath.lineTo(27.1, 71.3);
generalPath.curveTo(29.2, 71.3, 30.800001, 71.5, 31.8, 71.8);
generalPath.curveTo(32.799995, 72.100006, 33.6, 72.8, 34.1, 73.700005);
generalPath.curveTo(34.699997, 74.600006, 35.0, 75.700005, 35.0, 76.8);
generalPath.curveTo(35.0, 78.3, 34.6, 79.5, 33.7, 80.5);
generalPath.curveTo(32.800003, 81.5, 31.5, 82.1, 29.7, 82.3);
generalPath.curveTo(30.6, 82.8, 31.300001, 83.4, 31.900002, 84.0);
generalPath.curveTo(32.5, 84.6, 33.2, 85.7, 34.2, 87.2);
generalPath.lineTo(36.7, 91.1);
generalPath.lineTo(31.800001, 91.1);
generalPath.lineTo(28.900002, 86.799995);
generalPath.curveTo(27.900002, 85.299995, 27.100002, 84.299995, 26.800001, 83.899994);
generalPath.curveTo(26.400002, 83.49999, 26.000002, 83.2, 25.6, 83.09999);
generalPath.curveTo(25.2, 82.99999, 24.5, 82.899994, 23.6, 82.899994);
generalPath.lineTo(22.800001, 82.899994);
generalPath.lineTo(22.800001, 91.2);
generalPath.lineTo(18.600002, 91.2);
generalPath.closePath();
generalPath.moveTo(22.7, 79.7);
generalPath.lineTo(25.7, 79.7);
generalPath.curveTo(27.6, 79.7, 28.900002, 79.6, 29.300001, 79.5);
generalPath.curveTo(29.800001, 79.3, 30.2, 79.1, 30.400002, 78.7);
generalPath.curveTo(30.7, 78.299995, 30.800001, 77.799995, 30.800001, 77.2);
generalPath.curveTo(30.800001, 76.5, 30.6, 76.0, 30.300001, 75.6);
generalPath.curveTo(29.900002, 75.2, 29.400002, 74.9, 28.800001, 74.799995);
generalPath.curveTo(28.500002, 74.799995, 27.500002, 74.7, 25.800001, 74.7);
generalPath.lineTo(22.6, 74.7);
generalPath.lineTo(22.6, 79.7);
generalPath.closePath();
generalPath.moveTo(57.0, 91.2);
generalPath.lineTo(52.6, 91.2);
generalPath.lineTo(50.8, 86.7);
generalPath.lineTo(42.8, 86.7);
generalPath.lineTo(41.1, 91.2);
generalPath.lineTo(36.8, 91.2);
generalPath.lineTo(44.6, 71.299995);
generalPath.lineTo(49.0, 71.299995);
generalPath.lineTo(57.0, 91.2);
generalPath.closePath();
generalPath.moveTo(49.5, 83.299995);
generalPath.lineTo(46.7, 75.899994);
generalPath.lineTo(44.0, 83.299995);
generalPath.lineTo(49.5, 83.299995);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(45.2, 27.699999);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(58.32099914550781, 87.27300262451172), new Point2D.Double(50.78300094604492, 78.83899688720703), new float[] {0.0f,0.07f,0.159f,0.255f,0.359f,0.471f,0.598f,0.751f,1.0f}, new Color[] {new Color(89, 85, 147, 255),new Color(112, 108, 162, 255),new Color(137, 136, 181, 255),new Color(163, 165, 200, 255),new Color(186, 191, 217, 255),new Color(206, 213, 231, 255),new Color(222, 230, 242, 255),new Color(233, 243, 250, 255),new Color(236, 248, 254, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(45.2, 27.699999);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(45.2, 27.699999);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.8, 39.3);
generalPath.lineTo(21.3, 39.3);
generalPath.lineTo(34.3, 29.3);
generalPath.lineTo(34.3, 62.3);
generalPath.lineTo(21.3, 52.3);
generalPath.lineTo(14.799999, 52.3);
generalPath.lineTo(14.799999, 39.3);
generalPath.closePath();
generalPath.moveTo(40.9, 49.5);
generalPath.lineTo(40.9, 52.4);
generalPath.curveTo(41.0, 52.4, 42.5, 52.4, 44.100002, 51.600002);
generalPath.curveTo(45.700005, 50.800003, 47.500004, 48.9, 47.500004, 45.800003);
generalPath.curveTo(47.500004, 42.700005, 45.800003, 40.800003, 44.100002, 40.000004);
generalPath.curveTo(42.500004, 39.200005, 41.000004, 39.200005, 40.9, 39.200005);
generalPath.lineTo(40.9, 42.100006);
generalPath.lineTo(41.0, 42.100006);
generalPath.curveTo(41.4, 42.100006, 42.4, 42.300007, 43.1, 42.800007);
generalPath.curveTo(43.899998, 43.300007, 44.5, 44.000008, 44.5, 45.800007);
generalPath.curveTo(44.5, 47.800007, 43.7, 48.400005, 42.7, 49.000008);
generalPath.curveTo(42.2, 49.20001, 41.7, 49.40001, 41.4, 49.40001);
generalPath.curveTo(41.2, 49.40001, 41.100002, 49.40001, 41.0, 49.500008);
generalPath.lineTo(40.9, 49.500008);
generalPath.closePath();
generalPath.moveTo(40.9, 54.6);
generalPath.lineTo(40.9, 57.5);
generalPath.curveTo(41.0, 57.5, 43.7, 57.5, 46.7, 56.1);
generalPath.curveTo(49.600002, 54.699997, 52.7, 51.5, 52.600002, 46.0);
generalPath.curveTo(52.7, 40.4, 49.600002, 37.3, 46.7, 35.9);
generalPath.curveTo(43.8, 34.5, 41.100002, 34.5, 40.9, 34.5);
generalPath.lineTo(40.9, 37.4);
generalPath.lineTo(41.2, 37.4);
generalPath.curveTo(42.0, 37.5, 44.3, 37.800003, 46.100002, 39.0);
generalPath.curveTo(48.000004, 40.2, 49.600002, 42.1, 49.600002, 46.1);
generalPath.curveTo(49.600002, 50.699997, 47.500004, 52.6, 45.300003, 53.6);
generalPath.curveTo(44.200005, 54.199997, 43.100002, 54.399998, 42.200005, 54.6);
generalPath.curveTo(41.800003, 54.699997, 41.400005, 54.699997, 41.200005, 54.699997);
generalPath.curveTo(41.000004, 54.6, 40.900005, 54.6, 40.900005, 54.6);
generalPath.closePath();
generalPath.moveTo(40.9, 59.6);
generalPath.lineTo(40.9, 62.5);
generalPath.curveTo(41.0, 62.5, 45.0, 62.5, 49.2, 60.4);
generalPath.curveTo(53.4, 58.4, 57.7, 53.9, 57.7, 45.800003);
generalPath.curveTo(57.8, 37.700005, 53.4, 33.200005, 49.2, 31.200003);
generalPath.curveTo(45.0, 29.100002, 41.0, 29.100002, 40.9, 29.100002);
generalPath.lineTo(40.9, 32.0);
generalPath.lineTo(41.5, 32.0);
generalPath.curveTo(42.8, 32.1, 46.3, 32.6, 49.2, 34.5);
generalPath.curveTo(52.100002, 36.4, 54.7, 39.6, 54.8, 45.8);
generalPath.curveTo(54.7, 52.8, 51.399998, 56.0, 47.899998, 57.8);
generalPath.curveTo(46.199997, 58.7, 44.399998, 59.1, 42.999996, 59.3);
generalPath.curveTo(42.299995, 59.399998, 41.799995, 59.5, 41.399998, 59.5);
generalPath.curveTo(41.1, 59.6, 40.899998, 59.6, 40.899998, 59.6);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(14.776000022888184, 56.17399978637695), new Point2D.Double(57.72600173950195, 56.17399978637695), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
		return 0.7430000305175781;
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
	private ext_ra() {
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
       ext_ra base = new ext_ra();
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
       ext_ra base = new ext_ra();
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
        return ext_ra::new;
    }
}

