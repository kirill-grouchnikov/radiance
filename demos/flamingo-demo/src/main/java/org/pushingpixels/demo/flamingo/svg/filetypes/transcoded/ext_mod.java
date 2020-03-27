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
public class ext_mod implements ResizableIcon {
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
generalPath.moveTo(6.3, 90.8);
generalPath.lineTo(6.3, 71.6);
generalPath.lineTo(12.200001, 71.6);
generalPath.lineTo(15.700001, 84.7);
generalPath.lineTo(19.2, 71.6);
generalPath.lineTo(25.0, 71.6);
generalPath.lineTo(25.0, 90.8);
generalPath.lineTo(21.4, 90.8);
generalPath.lineTo(21.4, 75.7);
generalPath.lineTo(17.5, 90.799995);
generalPath.lineTo(13.7, 90.799995);
generalPath.lineTo(9.9, 75.7);
generalPath.lineTo(9.9, 90.799995);
generalPath.lineTo(6.3, 90.799995);
generalPath.closePath();
generalPath.moveTo(28.099998, 81.3);
generalPath.curveTo(28.099998, 79.3, 28.399998, 77.700005, 28.999998, 76.4);
generalPath.curveTo(29.399998, 75.4, 29.999998, 74.5, 30.799997, 73.8);
generalPath.curveTo(31.599997, 73.0, 32.399998, 72.4, 33.299995, 72.100006);
generalPath.curveTo(34.499996, 71.600006, 35.899994, 71.3, 37.499996, 71.3);
generalPath.curveTo(40.399998, 71.3, 42.599995, 72.200005, 44.399998, 73.9);
generalPath.curveTo(46.1, 75.700005, 46.999996, 78.1, 46.999996, 81.200005);
generalPath.curveTo(46.999996, 84.3, 46.099995, 86.700005, 44.399998, 88.50001);
generalPath.curveTo(42.699997, 90.30001, 40.399998, 91.100006, 37.6, 91.100006);
generalPath.curveTo(34.699997, 91.100006, 32.399998, 90.200005, 30.699999, 88.50001);
generalPath.curveTo(28.999998, 86.80001, 28.099998, 84.40001, 28.099998, 81.30001);
generalPath.closePath();
generalPath.moveTo(32.199997, 81.200005);
generalPath.curveTo(32.199997, 83.4, 32.699997, 85.00001, 33.699997, 86.100006);
generalPath.curveTo(34.699997, 87.200005, 35.999996, 87.8, 37.6, 87.8);
generalPath.curveTo(39.2, 87.8, 40.399998, 87.200005, 41.399998, 86.100006);
generalPath.curveTo(42.399998, 85.00001, 42.899998, 83.3, 42.899998, 81.100006);
generalPath.curveTo(42.899998, 78.90001, 42.399998, 77.3, 41.399998, 76.200005);
generalPath.curveTo(40.399998, 75.100006, 39.1, 74.600006, 37.499996, 74.600006);
generalPath.curveTo(35.899994, 74.600006, 34.599995, 75.100006, 33.599995, 76.200005);
generalPath.curveTo(32.699993, 77.3, 32.199993, 79.00001, 32.199993, 81.200005);
generalPath.closePath();
generalPath.moveTo(50.0, 71.6);
generalPath.lineTo(57.2, 71.6);
generalPath.curveTo(58.8, 71.6, 60.0, 71.7, 60.9, 72.0);
generalPath.curveTo(62.0, 72.3, 63.0, 72.9, 63.800003, 73.8);
generalPath.curveTo(64.600006, 74.600006, 65.200005, 75.700005, 65.700005, 76.9);
generalPath.curveTo(66.100006, 78.1, 66.3, 79.6, 66.3, 81.4);
generalPath.curveTo(66.3, 83.0, 66.100006, 84.3, 65.700005, 85.5);
generalPath.curveTo(65.200005, 86.9, 64.50001, 88.0, 63.600006, 88.9);
generalPath.curveTo(62.900005, 89.6, 62.000008, 90.1, 60.800007, 90.4);
generalPath.curveTo(59.900005, 90.700005, 58.800007, 90.8, 57.300007, 90.8);
generalPath.lineTo(50.0, 90.8);
generalPath.lineTo(50.0, 71.6);
generalPath.closePath();
generalPath.moveTo(53.9, 74.9);
generalPath.lineTo(53.9, 87.6);
generalPath.lineTo(56.800003, 87.6);
generalPath.curveTo(57.9, 87.6, 58.700005, 87.5, 59.200005, 87.4);
generalPath.curveTo(59.800003, 87.200005, 60.400005, 87.0, 60.800003, 86.6);
generalPath.curveTo(61.200005, 86.2, 61.600002, 85.6, 61.800003, 84.7);
generalPath.curveTo(62.100002, 83.799995, 62.200005, 82.7, 62.200005, 81.2);
generalPath.curveTo(62.200005, 79.7, 62.100006, 78.6, 61.800003, 77.799995);
generalPath.curveTo(61.500004, 76.99999, 61.200005, 76.399994, 60.700005, 75.899994);
generalPath.curveTo(60.200005, 75.49999, 59.600006, 75.2, 58.900005, 74.99999);
generalPath.curveTo(58.400005, 74.899994, 57.300007, 74.799995, 55.700005, 74.799995);
generalPath.lineTo(53.900005, 74.799995);
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
	private ext_mod() {
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
       ext_mod base = new ext_mod();
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
       ext_mod base = new ext_mod();
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
        return ext_mod::new;
    }
}

