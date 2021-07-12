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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_handlebars implements NeonIcon {
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.80000305175781), new Point2D.Double(36.0, -0.20000000298023224), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 26.575000762939453), new Point2D.Double(58.57500076293945, 13.074999809265137), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.93f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.4f, 55.3f);
generalPath.curveTo(32.1f, 55.2f, 33.9f, 55.8f, 35.3f, 57.0f);
generalPath.curveTo(36.0f, 57.6f, 36.5f, 58.2f, 37.0f, 59.1f);
generalPath.curveTo(37.8f, 57.699997f, 39.1f, 56.5f, 40.6f, 56.0f);
generalPath.curveTo(42.5f, 55.3f, 44.6f, 55.3f, 46.5f, 56.0f);
generalPath.curveTo(48.2f, 56.7f, 49.6f, 57.6f, 50.9f, 58.8f);
generalPath.curveTo(51.9f, 59.7f, 52.9f, 60.7f, 54.0f, 61.5f);
generalPath.curveTo(54.6f, 62.0f, 55.2f, 62.3f, 55.8f, 62.6f);
generalPath.curveTo(56.7f, 62.899998f, 57.8f, 62.6f, 58.399998f, 61.899998f);
generalPath.curveTo(58.999996f, 61.199997f, 58.999996f, 60.199997f, 58.3f, 59.499996f);
generalPath.curveTo(57.899998f, 59.199997f, 57.3f, 59.199997f, 56.899998f, 59.599995f);
generalPath.curveTo(56.899998f, 59.599995f, 56.899998f, 59.699993f, 56.8f, 59.699993f);
generalPath.curveTo(56.6f, 60.099995f, 56.6f, 60.599995f, 56.899998f, 60.899994f);
generalPath.curveTo(56.3f, 60.599995f, 55.899998f, 59.899994f, 55.8f, 59.199993f);
generalPath.curveTo(55.7f, 58.399994f, 56.3f, 57.599995f, 57.0f, 57.399994f);
generalPath.curveTo(58.5f, 56.799995f, 60.2f, 57.299995f, 61.1f, 58.599995f);
generalPath.curveTo(61.8f, 59.799995f, 62.199997f, 61.299995f, 61.899998f, 62.699993f);
generalPath.curveTo(61.699997f, 63.999992f, 60.999996f, 65.299995f, 59.8f, 66.09999f);
generalPath.curveTo(58.2f, 67.19999f, 56.3f, 67.69999f, 54.399998f, 67.49999f);
generalPath.curveTo(52.6f, 67.399994f, 50.8f, 67.09999f, 49.1f, 66.299995f);
generalPath.curveTo(46.3f, 65.1f, 43.699997f, 63.699997f, 40.8f, 62.699997f);
generalPath.curveTo(39.8f, 62.499996f, 38.7f, 62.199997f, 37.7f, 61.999996f);
generalPath.lineTo(35.4f, 61.999996f);
generalPath.curveTo(34.5f, 62.099995f, 33.5f, 62.299995f, 32.7f, 62.699997f);
generalPath.curveTo(29.7f, 63.6f, 27.1f, 65.2f, 24.300001f, 66.299995f);
generalPath.curveTo(21.900002f, 67.299995f, 19.300001f, 67.6f, 16.7f, 67.1f);
generalPath.curveTo(15.200001f, 66.9f, 13.900001f, 66.1f, 12.900001f, 65.0f);
generalPath.curveTo(12.1f, 64.0f, 11.700001f, 62.8f, 11.700001f, 61.5f);
generalPath.curveTo(11.6f, 60.3f, 11.900001f, 59.1f, 12.700001f, 58.1f);
generalPath.curveTo(13.400001f, 57.199997f, 14.6f, 56.8f, 15.800001f, 56.899998f);
generalPath.curveTo(16.500002f, 56.899998f, 17.2f, 57.199997f, 17.7f, 57.8f);
generalPath.curveTo(18.0f, 58.3f, 18.1f, 58.899998f, 17.900002f, 59.5f);
generalPath.curveTo(17.7f, 60.0f, 17.300001f, 60.4f, 16.900002f, 60.7f);
generalPath.curveTo(17.100002f, 60.4f, 17.2f, 59.9f, 17.000002f, 59.5f);
generalPath.curveTo(16.700003f, 59.1f, 16.100002f, 58.9f, 15.600002f, 59.3f);
generalPath.curveTo(15.500002f, 59.3f, 15.500002f, 59.399998f, 15.4000025f, 59.399998f);
generalPath.curveTo(14.9000025f, 59.999996f, 14.800002f, 60.699997f, 15.200003f, 61.399998f);
generalPath.curveTo(15.600002f, 62.1f, 16.300003f, 62.499996f, 17.000002f, 62.6f);
generalPath.curveTo(18.100002f, 62.6f, 19.100002f, 62.1f, 19.900002f, 61.399998f);
generalPath.curveTo(21.500002f, 59.8f, 23.2f, 58.399998f, 24.900002f, 57.1f);
generalPath.curveTo(26.7f, 56.0f, 28.500002f, 55.399998f, 30.400002f, 55.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 67.48899841308594), new Point2D.Double(37.0, 55.3120002746582), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.4f, 37.3f);
generalPath.curveTo(32.1f, 37.2f, 33.9f, 37.8f, 35.3f, 39.0f);
generalPath.curveTo(36.0f, 39.6f, 36.5f, 40.2f, 37.0f, 41.1f);
generalPath.curveTo(37.8f, 39.699997f, 39.1f, 38.5f, 40.6f, 38.0f);
generalPath.curveTo(42.5f, 37.3f, 44.6f, 37.3f, 46.5f, 38.0f);
generalPath.curveTo(48.2f, 38.7f, 49.6f, 39.6f, 50.9f, 40.8f);
generalPath.curveTo(51.9f, 41.7f, 52.9f, 42.7f, 54.0f, 43.5f);
generalPath.curveTo(54.6f, 44.0f, 55.2f, 44.3f, 55.8f, 44.6f);
generalPath.curveTo(56.7f, 44.899998f, 57.8f, 44.6f, 58.399998f, 43.899998f);
generalPath.curveTo(58.999996f, 43.199997f, 58.999996f, 42.199997f, 58.3f, 41.499996f);
generalPath.curveTo(57.899998f, 41.199997f, 57.3f, 41.199997f, 56.899998f, 41.599995f);
generalPath.curveTo(56.899998f, 41.599995f, 56.899998f, 41.699993f, 56.8f, 41.699993f);
generalPath.curveTo(56.6f, 42.099995f, 56.6f, 42.599995f, 56.899998f, 42.899994f);
generalPath.curveTo(56.3f, 42.599995f, 55.899998f, 41.899994f, 55.8f, 41.199993f);
generalPath.curveTo(55.7f, 40.399994f, 56.3f, 39.599995f, 57.0f, 39.399994f);
generalPath.curveTo(58.5f, 38.799995f, 60.2f, 39.299995f, 61.1f, 40.599995f);
generalPath.curveTo(61.8f, 41.799995f, 62.199997f, 43.299995f, 61.899998f, 44.699993f);
generalPath.curveTo(61.699997f, 45.999992f, 60.999996f, 47.29999f, 59.8f, 48.099995f);
generalPath.curveTo(58.2f, 49.199993f, 56.3f, 49.699993f, 54.399998f, 49.499996f);
generalPath.curveTo(52.6f, 49.399998f, 50.8f, 49.099995f, 49.1f, 48.299995f);
generalPath.curveTo(46.3f, 47.099995f, 43.699997f, 45.699997f, 40.8f, 44.699997f);
generalPath.curveTo(39.8f, 44.499996f, 38.7f, 44.199997f, 37.7f, 43.999996f);
generalPath.lineTo(35.4f, 43.999996f);
generalPath.curveTo(34.5f, 44.099995f, 33.5f, 44.299995f, 32.7f, 44.699997f);
generalPath.curveTo(29.7f, 45.6f, 27.1f, 47.199997f, 24.300001f, 48.299995f);
generalPath.curveTo(21.900002f, 49.299995f, 19.300001f, 49.599995f, 16.7f, 49.099995f);
generalPath.curveTo(15.200001f, 48.899994f, 13.900001f, 48.099995f, 12.900001f, 46.999996f);
generalPath.curveTo(12.1f, 45.999996f, 11.700001f, 44.799995f, 11.700001f, 43.499996f);
generalPath.curveTo(11.6f, 42.299995f, 11.900001f, 41.099995f, 12.700001f, 40.099995f);
generalPath.curveTo(13.400001f, 39.199993f, 14.6f, 38.799995f, 15.800001f, 38.899994f);
generalPath.curveTo(16.500002f, 38.899994f, 17.2f, 39.199993f, 17.7f, 39.799995f);
generalPath.curveTo(18.0f, 40.299995f, 18.1f, 40.899994f, 17.900002f, 41.499996f);
generalPath.curveTo(17.7f, 41.999996f, 17.300001f, 42.399998f, 16.900002f, 42.699997f);
generalPath.curveTo(17.100002f, 42.399998f, 17.2f, 41.899998f, 17.000002f, 41.499996f);
generalPath.curveTo(16.700003f, 41.099995f, 16.100002f, 40.899998f, 15.600002f, 41.299995f);
generalPath.curveTo(15.500002f, 41.299995f, 15.500002f, 41.399994f, 15.4000025f, 41.399994f);
generalPath.curveTo(14.9000025f, 41.999992f, 14.800002f, 42.699993f, 15.200003f, 43.399994f);
generalPath.curveTo(15.600002f, 44.099995f, 16.300003f, 44.499992f, 17.000002f, 44.599995f);
generalPath.curveTo(18.100002f, 44.599995f, 19.100002f, 44.099995f, 19.900002f, 43.399994f);
generalPath.curveTo(21.500002f, 41.799995f, 23.2f, 40.399994f, 24.900002f, 39.099995f);
generalPath.curveTo(26.7f, 37.999996f, 28.500002f, 37.399994f, 30.400002f, 37.299995f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 49.487998962402344), new Point2D.Double(37.0, 37.31100082397461), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
		return 0.9980000257492065;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_handlebars() {
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
       ext_handlebars base = new ext_handlebars();
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
       ext_handlebars base = new ext_handlebars();
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
        return ext_handlebars::new;
    }
}

