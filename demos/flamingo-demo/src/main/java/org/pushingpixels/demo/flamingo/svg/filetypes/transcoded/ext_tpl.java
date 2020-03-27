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
public class ext_tpl implements ResizableIcon {
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
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.0), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
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
generalPath.moveTo(15.5, 23.6);
generalPath.lineTo(15.5, 55.6);
generalPath.curveTo(15.5, 56.0, 15.9, 56.399998, 16.3, 56.399998);
generalPath.lineTo(18.8, 56.399998);
generalPath.curveTo(19.199999, 56.399998, 19.599998, 55.999996, 19.599998, 55.6);
generalPath.lineTo(19.599998, 25.7);
generalPath.lineTo(49.5, 25.7);
generalPath.curveTo(49.9, 25.7, 50.3, 25.300001, 50.3, 24.900002);
generalPath.lineTo(50.3, 22.400002);
generalPath.curveTo(50.3, 22.000002, 49.899998, 21.600002, 49.5, 21.600002);
generalPath.lineTo(17.5, 21.600002);
generalPath.curveTo(16.3, 21.600002, 15.5, 22.400002, 15.5, 23.600002);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(81.0999984741211, 43.55699920654297), new Point2D.Double(81.0999984741211, 78.40699768066406), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, 114.0f, 100.0f));
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
generalPath.moveTo(23.7, 30.6);
generalPath.lineTo(23.7, 61.800003);
generalPath.curveTo(23.7, 62.200005, 24.1, 62.600002, 24.5, 62.600002);
generalPath.lineTo(55.7, 62.600002);
generalPath.curveTo(56.100002, 62.600002, 56.5, 62.2, 56.5, 61.800003);
generalPath.lineTo(56.5, 30.6);
generalPath.curveTo(56.5, 30.2, 56.1, 29.800001, 55.7, 29.800001);
generalPath.lineTo(24.5, 29.800001);
generalPath.curveTo(24.1, 29.800001, 23.7, 30.2, 23.7, 30.6);
generalPath.closePath();
generalPath.moveTo(42.2, 55.2);
generalPath.curveTo(42.2, 54.8, 42.600002, 54.4, 43.0, 54.4);
generalPath.lineTo(51.6, 54.4);
generalPath.curveTo(52.0, 54.4, 52.399998, 54.800003, 52.399998, 55.2);
generalPath.lineTo(52.399998, 57.7);
generalPath.curveTo(52.399998, 58.100002, 51.999996, 58.5, 51.6, 58.5);
generalPath.lineTo(43.0, 58.5);
generalPath.curveTo(42.6, 58.5, 42.2, 58.1, 42.2, 57.7);
generalPath.lineTo(42.2, 55.2);
generalPath.closePath();
generalPath.moveTo(42.2, 47.0);
generalPath.curveTo(42.2, 46.6, 42.600002, 46.2, 43.0, 46.2);
generalPath.lineTo(51.6, 46.2);
generalPath.curveTo(52.0, 46.2, 52.399998, 46.600002, 52.399998, 47.0);
generalPath.lineTo(52.399998, 49.5);
generalPath.curveTo(52.399998, 49.9, 51.999996, 50.3, 51.6, 50.3);
generalPath.lineTo(43.0, 50.3);
generalPath.curveTo(42.6, 50.3, 42.2, 49.899998, 42.2, 49.5);
generalPath.lineTo(42.2, 47.0);
generalPath.closePath();
generalPath.moveTo(27.800001, 55.2);
generalPath.curveTo(27.800001, 54.8, 28.2, 54.4, 28.6, 54.4);
generalPath.lineTo(37.2, 54.4);
generalPath.curveTo(37.600002, 54.4, 38.0, 54.800003, 38.0, 55.2);
generalPath.lineTo(38.0, 57.7);
generalPath.curveTo(38.0, 58.100002, 37.6, 58.5, 37.2, 58.5);
generalPath.lineTo(28.6, 58.5);
generalPath.curveTo(28.2, 58.5, 27.800001, 58.1, 27.800001, 57.7);
generalPath.lineTo(27.800001, 55.2);
generalPath.closePath();
generalPath.moveTo(27.800001, 47.0);
generalPath.curveTo(27.800001, 46.6, 28.2, 46.2, 28.6, 46.2);
generalPath.lineTo(37.2, 46.2);
generalPath.curveTo(37.600002, 46.2, 38.0, 46.600002, 38.0, 47.0);
generalPath.lineTo(38.0, 49.5);
generalPath.curveTo(38.0, 49.9, 37.6, 50.3, 37.2, 50.3);
generalPath.lineTo(28.6, 50.3);
generalPath.curveTo(28.2, 50.3, 27.800001, 49.899998, 27.800001, 49.5);
generalPath.lineTo(27.800001, 47.0);
generalPath.closePath();
generalPath.moveTo(27.800001, 34.7);
generalPath.curveTo(27.800001, 34.3, 28.2, 33.9, 28.6, 33.9);
generalPath.lineTo(51.6, 33.9);
generalPath.curveTo(52.0, 33.9, 52.399998, 34.300003, 52.399998, 34.7);
generalPath.lineTo(52.399998, 41.3);
generalPath.curveTo(52.399998, 41.7, 51.999996, 42.1, 51.6, 42.1);
generalPath.lineTo(28.599998, 42.1);
generalPath.curveTo(28.199999, 42.1, 27.8, 41.699997, 27.8, 41.3);
generalPath.lineTo(27.8, 34.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(73.9000015258789, 37.400001525878906), new Point2D.Double(73.9000015258789, 70.19999694824219), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, 114.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 74.18699645996094), new Point2D.Double(58.5369987487793, 87.68699645996094), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
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
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.2, 91.9);
generalPath.lineTo(16.2, 75.2);
generalPath.lineTo(10.300001, 75.2);
generalPath.lineTo(10.300001, 71.799995);
generalPath.lineTo(26.2, 71.799995);
generalPath.lineTo(26.2, 75.2);
generalPath.lineTo(20.300001, 75.2);
generalPath.lineTo(20.300001, 91.899994);
generalPath.lineTo(16.2, 91.899994);
generalPath.closePath();
generalPath.moveTo(28.800001, 91.9);
generalPath.lineTo(28.800001, 71.9);
generalPath.lineTo(35.300003, 71.9);
generalPath.curveTo(37.800003, 71.9, 39.4, 72.0, 40.100002, 72.200005);
generalPath.curveTo(41.2, 72.50001, 42.2, 73.200005, 43.000004, 74.200005);
generalPath.curveTo(43.800003, 75.200005, 44.200005, 76.50001, 44.200005, 78.100006);
generalPath.curveTo(44.200005, 79.3, 44.000004, 80.40001, 43.500004, 81.200005);
generalPath.curveTo(43.100002, 82.00001, 42.500004, 82.700005, 41.800003, 83.200005);
generalPath.curveTo(41.100002, 83.700005, 40.4, 84.00001, 39.700005, 84.200005);
generalPath.curveTo(38.700005, 84.4, 37.300003, 84.50001, 35.500004, 84.50001);
generalPath.lineTo(32.900005, 84.50001);
generalPath.lineTo(32.900005, 92.100006);
generalPath.lineTo(28.800005, 92.100006);
generalPath.lineTo(28.800005, 91.90001);
generalPath.closePath();
generalPath.moveTo(32.9, 75.2);
generalPath.lineTo(32.9, 80.899994);
generalPath.lineTo(35.100002, 80.899994);
generalPath.curveTo(36.7, 80.899994, 37.800003, 80.799995, 38.300003, 80.59999);
generalPath.curveTo(38.800003, 80.399994, 39.300003, 80.09999, 39.600002, 79.59999);
generalPath.curveTo(39.9, 79.19999, 40.100002, 78.59999, 40.100002, 77.99999);
generalPath.curveTo(40.100002, 77.299995, 39.9, 76.69999, 39.500004, 76.19999);
generalPath.curveTo(39.100002, 75.69999, 38.500004, 75.39999, 37.900005, 75.29999);
generalPath.curveTo(37.400005, 75.19999, 36.400005, 75.19999, 35.000004, 75.19999);
generalPath.lineTo(32.900005, 75.19999);
generalPath.closePath();
generalPath.moveTo(47.600002, 91.899994);
generalPath.lineTo(47.600002, 72.0);
generalPath.lineTo(51.600002, 72.0);
generalPath.lineTo(51.600002, 88.5);
generalPath.lineTo(61.700005, 88.5);
generalPath.lineTo(61.700005, 91.9);
generalPath.lineTo(47.6, 91.9);
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
	private ext_tpl() {
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
       ext_tpl base = new ext_tpl();
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
       ext_tpl base = new ext_tpl();
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
        return ext_tpl::new;
    }
}

