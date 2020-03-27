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
public class ext_fon implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(190, 192, 219, 255),new Color(206, 205, 230, 255),new Color(225, 220, 243, 255),new Color(239, 230, 251, 255),new Color(245, 245, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(44.75, 25.75), new Point2D.Double(58.20000076293945, 12.300000190734863), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 245, 255, 255),new Color(250, 241, 251, 255),new Color(237, 231, 244, 255),new Color(221, 219, 233, 255),new Color(199, 201, 218, 255),new Color(173, 179, 199, 255),new Color(146, 145, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(26.9, 49.3);
generalPath.lineTo(16.5, 49.3);
generalPath.lineTo(15.3, 52.1);
generalPath.curveTo(14.900001, 53.0, 14.7, 53.8, 14.7, 54.399998);
generalPath.curveTo(14.7, 55.199997, 15.0, 55.8, 15.7, 56.199997);
generalPath.curveTo(16.1, 56.399998, 17.1, 56.6, 18.6, 56.699997);
generalPath.lineTo(18.6, 57.499996);
generalPath.lineTo(8.7, 57.499996);
generalPath.lineTo(8.7, 56.699997);
generalPath.curveTo(9.8, 56.499996, 10.599999, 56.1, 11.299999, 55.399998);
generalPath.curveTo(11.999999, 54.699997, 12.799999, 53.3, 13.799999, 51.1);
generalPath.lineTo(24.3, 28.399998);
generalPath.lineTo(24.699999, 28.399998);
generalPath.lineTo(35.3, 51.799995);
generalPath.curveTo(36.3, 53.999996, 37.1, 55.399994, 37.8, 55.999996);
generalPath.curveTo(38.3, 56.399998, 39.0, 56.699997, 39.899998, 56.799995);
generalPath.lineTo(39.899998, 57.599995);
generalPath.lineTo(25.7, 57.599995);
generalPath.lineTo(25.7, 56.799995);
generalPath.lineTo(26.300001, 56.799995);
generalPath.curveTo(27.400002, 56.799995, 28.2, 56.599995, 28.7, 56.299995);
generalPath.curveTo(29.0, 56.099995, 29.2, 55.799995, 29.2, 55.299995);
generalPath.curveTo(29.2, 54.999996, 29.2, 54.799995, 29.1, 54.499996);
generalPath.curveTo(29.1, 54.399998, 28.9, 53.799995, 28.4, 52.899998);
generalPath.lineTo(26.9, 49.3);
generalPath.closePath();
generalPath.moveTo(26.1, 47.7);
generalPath.lineTo(21.7, 37.9);
generalPath.lineTo(17.2, 47.7);
generalPath.lineTo(26.1, 47.7);
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
generalPath.moveTo(62.1, 38.6);
generalPath.lineTo(57.899998, 52.6);
generalPath.lineTo(57.499996, 54.3);
generalPath.curveTo(57.499996, 54.5, 57.399998, 54.7, 57.399998, 54.8);
generalPath.curveTo(57.399998, 55.0, 57.499996, 55.1, 57.6, 55.2);
generalPath.curveTo(57.7, 55.300003, 57.8, 55.4, 58.0, 55.4);
generalPath.curveTo(58.3, 55.4, 58.7, 55.2, 59.3, 54.7);
generalPath.curveTo(59.5, 54.5, 60.0, 53.9, 60.899998, 52.8);
generalPath.lineTo(61.699997, 53.2);
generalPath.curveTo(60.699997, 55.0, 59.6, 56.3, 58.399998, 57.2);
generalPath.curveTo(57.199997, 58.0, 55.999996, 58.4, 54.6, 58.4);
generalPath.curveTo(53.8, 58.4, 53.1, 58.2, 52.699997, 57.800003);
generalPath.curveTo(52.299995, 57.4, 51.999996, 56.9, 51.999996, 56.200005);
generalPath.curveTo(51.999996, 55.700005, 52.199997, 54.600006, 52.699997, 53.200005);
generalPath.lineTo(53.199997, 51.500004);
generalPath.curveTo(51.499996, 54.300003, 49.899998, 56.300003, 48.399998, 57.400005);
generalPath.curveTo(47.499996, 58.100006, 46.499996, 58.400005, 45.499996, 58.400005);
generalPath.curveTo(44.199997, 58.400005, 43.199997, 57.900005, 42.599995, 56.800007);
generalPath.curveTo(41.999996, 55.70001, 41.699993, 54.600006, 41.699993, 53.20001);
generalPath.curveTo(41.699993, 51.20001, 42.29999, 49.000008, 43.599995, 46.40001);
generalPath.curveTo(44.799995, 43.80001, 46.499996, 41.80001, 48.499996, 40.20001);
generalPath.curveTo(50.199997, 38.90001, 51.699997, 38.300007, 53.199997, 38.300007);
generalPath.curveTo(53.999996, 38.300007, 54.699997, 38.500008, 55.199997, 39.000008);
generalPath.curveTo(55.699997, 39.500008, 56.1, 40.300007, 56.299995, 41.500008);
generalPath.lineTo(57.099995, 38.90001);
generalPath.lineTo(62.099995, 38.60001);
generalPath.closePath();
generalPath.moveTo(55.1, 42.6);
generalPath.curveTo(55.1, 41.5, 54.899998, 40.6, 54.6, 40.1);
generalPath.curveTo(54.3, 39.699997, 54.0, 39.6, 53.5, 39.6);
generalPath.curveTo(53.1, 39.6, 52.6, 39.8, 52.1, 40.199997);
generalPath.curveTo(51.1, 41.1, 50.1, 42.799995, 49.0, 45.499996);
generalPath.curveTo(47.9, 48.199997, 47.3, 50.399998, 47.3, 52.399998);
generalPath.curveTo(47.3, 53.1, 47.399998, 53.699997, 47.7, 53.999996);
generalPath.curveTo(48.0, 54.299995, 48.2, 54.499996, 48.5, 54.499996);
generalPath.curveTo(49.2, 54.499996, 49.8, 54.099995, 50.5, 53.399998);
generalPath.curveTo(51.5, 52.399998, 52.3, 51.1, 53.1, 49.6);
generalPath.curveTo(54.399998, 47.0, 55.1, 44.699997, 55.1, 42.6);
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
generalPath.moveTo(14.6, 92.1);
generalPath.lineTo(14.6, 76.3);
generalPath.lineTo(25.5, 76.3);
generalPath.lineTo(25.5, 79.0);
generalPath.lineTo(17.8, 79.0);
generalPath.lineTo(17.8, 82.7);
generalPath.lineTo(24.4, 82.7);
generalPath.lineTo(24.4, 85.399994);
generalPath.lineTo(17.8, 85.399994);
generalPath.lineTo(17.8, 92.09999);
generalPath.lineTo(14.599999, 92.09999);
generalPath.closePath();
generalPath.moveTo(27.5, 84.299995);
generalPath.curveTo(27.5, 82.7, 27.7, 81.299995, 28.2, 80.299995);
generalPath.curveTo(28.6, 79.49999, 29.1, 78.799995, 29.7, 78.1);
generalPath.curveTo(30.300001, 77.5, 31.0, 77.0, 31.7, 76.7);
generalPath.curveTo(32.7, 76.299995, 33.8, 76.1, 35.100002, 76.1);
generalPath.curveTo(37.4, 76.1, 39.300003, 76.799995, 40.7, 78.299995);
generalPath.curveTo(42.1, 79.799995, 42.8, 81.7, 42.8, 84.299995);
generalPath.curveTo(42.8, 86.799995, 42.1, 88.799995, 40.7, 90.299995);
generalPath.curveTo(39.3, 91.7, 37.5, 92.49999, 35.100002, 92.49999);
generalPath.curveTo(32.7, 92.49999, 30.900002, 91.799995, 29.500002, 90.399994);
generalPath.curveTo(28.200003, 88.799995, 27.500002, 86.799995, 27.500002, 84.299995);
generalPath.closePath();
generalPath.moveTo(30.8, 84.2);
generalPath.curveTo(30.8, 86.0, 31.199999, 87.299995, 32.0, 88.299995);
generalPath.curveTo(32.8, 89.2, 33.9, 89.7, 35.2, 89.7);
generalPath.curveTo(36.5, 89.7, 37.5, 89.2, 38.3, 88.299995);
generalPath.curveTo(39.1, 87.399994, 39.5, 85.99999, 39.5, 84.2);
generalPath.curveTo(39.5, 82.399994, 39.1, 81.0, 38.3, 80.2);
generalPath.curveTo(37.5, 79.399994, 36.399998, 78.899994, 35.1, 78.899994);
generalPath.curveTo(33.8, 78.899994, 32.699997, 79.299995, 31.899998, 80.2);
generalPath.curveTo(31.199997, 81.0, 30.799997, 82.399994, 30.799997, 84.2);
generalPath.closePath();
generalPath.moveTo(45.4, 92.1);
generalPath.lineTo(45.4, 76.3);
generalPath.lineTo(48.5, 76.3);
generalPath.lineTo(55.0, 86.8);
generalPath.lineTo(55.0, 76.3);
generalPath.lineTo(58.0, 76.3);
generalPath.lineTo(58.0, 92.0);
generalPath.lineTo(54.8, 92.0);
generalPath.lineTo(48.399998, 81.7);
generalPath.lineTo(48.399998, 92.0);
generalPath.lineTo(45.399998, 92.1);
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
	private ext_fon() {
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
       ext_fon base = new ext_fon();
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
       ext_fon base = new ext_fon();
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
        return ext_fon::new;
    }
}

