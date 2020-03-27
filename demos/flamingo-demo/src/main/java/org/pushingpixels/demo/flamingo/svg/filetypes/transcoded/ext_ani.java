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
public class ext_ani implements ResizableIcon {
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(72.1, 99.0);
generalPath.lineTo(0.3, 99.0);
generalPath.lineTo(0.3, 1.0);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.0f,0.124f,0.262f,0.41f,0.571f,0.752f,1.0f}, new Color[] {new Color(0, 107, 105, 255),new Color(0, 128, 127, 255),new Color(0, 147, 147, 255),new Color(0, 163, 163, 255),new Color(0, 176, 175, 255),new Color(8, 184, 183, 255),new Color(20, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(72.1, 99.0);
generalPath.lineTo(0.3, 99.0);
generalPath.lineTo(0.3, 1.0);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(72.1, 99.0);
generalPath.lineTo(0.3, 99.0);
generalPath.lineTo(0.3, 1.0);
generalPath.lineTo(45.2, 1.0);
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
generalPath.moveTo(32.2, 91.1);
generalPath.lineTo(27.800001, 91.1);
generalPath.lineTo(26.1, 86.6);
generalPath.lineTo(18.1, 86.6);
generalPath.lineTo(16.5, 91.1);
generalPath.lineTo(12.2, 91.1);
generalPath.lineTo(20.0, 71.2);
generalPath.lineTo(24.3, 71.2);
generalPath.lineTo(32.2, 91.1);
generalPath.closePath();
generalPath.moveTo(24.800001, 83.2);
generalPath.lineTo(22.0, 75.9);
generalPath.lineTo(19.3, 83.3);
generalPath.lineTo(24.8, 83.3);
generalPath.closePath();
generalPath.moveTo(34.4, 91.1);
generalPath.lineTo(34.4, 71.2);
generalPath.lineTo(38.300003, 71.2);
generalPath.lineTo(46.500004, 84.399994);
generalPath.lineTo(46.500004, 71.2);
generalPath.lineTo(50.200005, 71.2);
generalPath.lineTo(50.200005, 91.0);
generalPath.lineTo(46.200005, 91.0);
generalPath.lineTo(38.100006, 78.1);
generalPath.lineTo(38.100006, 91.0);
generalPath.lineTo(34.400005, 91.0);
generalPath.closePath();
generalPath.moveTo(54.4, 91.1);
generalPath.lineTo(54.4, 71.2);
generalPath.lineTo(58.4, 71.2);
generalPath.lineTo(58.4, 91.0);
generalPath.lineTo(54.4, 91.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(51.4, 18.0);
generalPath.lineTo(21.5, 18.0);
generalPath.curveTo(20.0, 18.0, 18.9, 19.2, 18.9, 20.6);
generalPath.curveTo(18.9, 22.1, 20.1, 23.2, 21.5, 23.2);
generalPath.lineTo(21.6, 23.2);
generalPath.lineTo(21.6, 25.800001);
generalPath.curveTo(21.6, 31.300001, 24.9, 36.2, 30.1, 38.2);
generalPath.curveTo(30.4, 38.3, 30.6, 38.600002, 30.6, 38.9);
generalPath.lineTo(30.6, 39.100002);
generalPath.curveTo(30.6, 39.4, 30.4, 39.7, 30.1, 39.800003);
generalPath.curveTo(25.0, 41.800003, 21.6, 46.700005, 21.6, 52.200005);
generalPath.lineTo(21.6, 54.800003);
generalPath.lineTo(21.5, 54.800003);
generalPath.curveTo(20.0, 54.800003, 18.9, 56.000004, 18.9, 57.4);
generalPath.curveTo(18.9, 58.9, 20.1, 60.0, 21.5, 60.0);
generalPath.lineTo(51.3, 60.0);
generalPath.curveTo(52.8, 60.0, 53.899998, 58.8, 53.899998, 57.4);
generalPath.curveTo(53.899998, 55.9, 52.699997, 54.800003, 51.3, 54.800003);
generalPath.lineTo(51.2, 54.800003);
generalPath.lineTo(51.2, 52.200005);
generalPath.curveTo(51.2, 46.700005, 47.9, 41.800003, 42.7, 39.800003);
generalPath.curveTo(42.4, 39.700005, 42.2, 39.4, 42.2, 39.100002);
generalPath.lineTo(42.2, 38.9);
generalPath.curveTo(42.2, 38.600002, 42.4, 38.300003, 42.7, 38.2);
generalPath.curveTo(47.8, 36.2, 51.2, 31.300001, 51.2, 25.800001);
generalPath.lineTo(51.2, 23.2);
generalPath.lineTo(51.3, 23.2);
generalPath.curveTo(52.8, 23.2, 53.899998, 22.0, 53.899998, 20.6);
generalPath.curveTo(53.999996, 19.2, 52.8, 18.0, 51.399998, 18.0);
generalPath.closePath();
generalPath.moveTo(47.800003, 25.9);
generalPath.curveTo(47.800003, 29.9, 45.300003, 33.6, 41.600002, 35.0);
generalPath.curveTo(40.000004, 35.6, 38.9, 37.2, 38.9, 38.9);
generalPath.lineTo(38.9, 39.100002);
generalPath.curveTo(38.9, 40.800003, 40.0, 42.4, 41.600002, 43.000004);
generalPath.curveTo(45.4, 44.500004, 47.800003, 48.100002, 47.800003, 52.100006);
generalPath.lineTo(47.800003, 54.700005);
generalPath.lineTo(25.1, 54.700005);
generalPath.lineTo(25.1, 52.100006);
generalPath.curveTo(25.1, 48.100006, 27.6, 44.400005, 31.3, 43.000008);
generalPath.curveTo(32.899998, 42.40001, 34.0, 40.800007, 34.0, 39.100006);
generalPath.lineTo(34.0, 38.900005);
generalPath.curveTo(34.0, 37.200005, 32.9, 35.600006, 31.3, 35.000004);
generalPath.curveTo(27.552471, 33.538002, 25.089231, 29.922602, 25.099998, 25.900003);
generalPath.lineTo(25.099998, 23.300003);
generalPath.lineTo(47.699997, 23.300003);
generalPath.lineTo(47.699997, 25.900003);
generalPath.closePath();
generalPath.moveTo(28.700003, 30.3);
generalPath.curveTo(28.500002, 29.9, 28.500002, 29.5, 28.900003, 29.199999);
generalPath.curveTo(29.000004, 29.099998, 29.200003, 29.099998, 29.300003, 29.099998);
generalPath.lineTo(43.4, 29.099998);
generalPath.curveTo(43.800003, 29.099998, 44.2, 29.399998, 44.2, 29.899998);
generalPath.curveTo(44.2, 30.099998, 44.2, 30.199997, 44.100002, 30.299997);
generalPath.curveTo(43.2, 31.499998, 42.100002, 32.399998, 40.7, 32.999996);
generalPath.curveTo(39.2, 33.599995, 38.0, 34.599995, 37.3, 35.999996);
generalPath.curveTo(37.0, 36.499996, 36.399998, 36.699997, 35.899998, 36.399998);
generalPath.curveTo(35.699997, 36.3, 35.6, 36.199997, 35.499996, 35.999996);
generalPath.curveTo(34.799995, 34.599995, 33.599995, 33.499996, 32.099995, 32.999996);
generalPath.curveTo(30.799995, 32.499996, 29.599995, 31.499996, 28.699995, 30.299995);
generalPath.closePath();
generalPath.moveTo(38.700005, 46.199997);
generalPath.curveTo(39.400005, 46.899998, 40.400005, 47.299995, 41.400005, 47.299995);
generalPath.curveTo(43.300007, 47.299995, 44.900005, 48.599995, 45.300007, 50.399994);
generalPath.lineTo(45.300007, 50.599995);
generalPath.curveTo(45.400005, 50.999996, 45.400005, 51.399994, 45.400005, 51.799995);
generalPath.curveTo(45.400005, 52.299995, 45.100006, 52.699997, 44.600006, 52.699997);
generalPath.lineTo(28.2, 52.699997);
generalPath.curveTo(27.7, 52.699997, 27.300001, 52.299995, 27.300001, 51.799995);
generalPath.curveTo(27.300001, 51.399994, 27.400002, 50.899994, 27.500002, 50.499996);
generalPath.lineTo(27.500002, 50.299995);
generalPath.curveTo(28.000002, 48.499996, 29.600002, 47.299995, 31.400002, 47.299995);
generalPath.curveTo(32.4, 47.299995, 33.4, 46.899994, 34.100002, 46.299995);
generalPath.curveTo(34.600002, 45.799995, 35.100002, 45.199997, 35.4, 44.599995);
generalPath.curveTo(35.600002, 44.199993, 36.100002, 43.999996, 36.5, 44.099995);
generalPath.curveTo(36.8, 44.199993, 37.1, 44.399994, 37.2, 44.699993);
generalPath.curveTo(37.7, 45.199993, 38.100002, 45.699993, 38.7, 46.199993);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.45800018310547, 60.099998474121094), new Point2D.Double(36.45800018310547, 18.0), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {new Color(214, 237, 232, 255),new Color(211, 235, 230, 255),new Color(199, 227, 223, 255),new Color(183, 216, 213, 255),new Color(160, 203, 201, 255),new Color(132, 186, 185, 255),new Color(98, 167, 167, 255),new Color(52, 147, 148, 255),new Color(0, 127, 127, 255),new Color(0, 107, 106, 255),new Color(0, 107, 105, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.1, 27.7);
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
        return 0.13300000131130219;
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
		return 0.7379999160766602;
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
	private ext_ani() {
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
       ext_ani base = new ext_ani();
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
       ext_ani base = new ext_ani();
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
        return ext_ani::new;
    }
}

