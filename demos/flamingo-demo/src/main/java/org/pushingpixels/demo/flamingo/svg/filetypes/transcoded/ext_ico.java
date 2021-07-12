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
public class ext_ico implements NeonIcon {
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(13.3f, 91.1f);
generalPath.lineTo(13.3f, 71.2f);
generalPath.lineTo(17.3f, 71.2f);
generalPath.lineTo(17.3f, 91.0f);
generalPath.lineTo(13.299999f, 91.0f);
generalPath.closePath();
generalPath.moveTo(34.0f, 83.8f);
generalPath.lineTo(37.9f, 85.0f);
generalPath.curveTo(37.300003f, 87.2f, 36.300003f, 88.8f, 34.9f, 89.8f);
generalPath.curveTo(33.5f, 90.9f, 31.7f, 91.4f, 29.600002f, 91.4f);
generalPath.curveTo(26.900002f, 91.4f, 24.800003f, 90.5f, 23.100002f, 88.700005f);
generalPath.curveTo(21.400002f, 86.90001f, 20.500002f, 84.4f, 20.500002f, 81.3f);
generalPath.curveTo(20.500002f, 78.0f, 21.400002f, 75.4f, 23.100002f, 73.600006f);
generalPath.curveTo(24.800003f, 71.80001f, 27.100002f, 70.90001f, 29.900002f, 70.90001f);
generalPath.curveTo(32.300003f, 70.90001f, 34.300003f, 71.600006f, 35.9f, 73.100006f);
generalPath.curveTo(36.800003f, 73.90001f, 37.5f, 75.200005f, 37.9f, 76.8f);
generalPath.lineTo(33.9f, 77.700005f);
generalPath.curveTo(33.7f, 76.700005f, 33.2f, 75.9f, 32.4f, 75.3f);
generalPath.curveTo(31.7f, 74.700005f, 30.7f, 74.4f, 29.7f, 74.4f);
generalPath.curveTo(28.2f, 74.4f, 27.0f, 74.9f, 26.1f, 76.0f);
generalPath.curveTo(25.2f, 77.1f, 24.7f, 78.8f, 24.7f, 81.1f);
generalPath.curveTo(24.7f, 83.6f, 25.2f, 85.4f, 26.1f, 86.5f);
generalPath.curveTo(27.0f, 87.6f, 28.2f, 88.1f, 29.6f, 88.1f);
generalPath.curveTo(30.7f, 88.1f, 31.6f, 87.799995f, 32.4f, 87.1f);
generalPath.curveTo(33.200005f, 86.4f, 33.600002f, 85.2f, 34.0f, 83.799995f);
generalPath.closePath();
generalPath.moveTo(40.5f, 81.3f);
generalPath.curveTo(40.5f, 79.3f, 40.8f, 77.600006f, 41.4f, 76.200005f);
generalPath.curveTo(41.9f, 75.200005f, 42.5f, 74.3f, 43.300003f, 73.50001f);
generalPath.curveTo(44.100002f, 72.700005f, 44.9f, 72.100006f, 45.9f, 71.700005f);
generalPath.curveTo(47.100002f, 71.200005f, 48.600002f, 70.9f, 50.2f, 70.9f);
generalPath.curveTo(53.100002f, 70.9f, 55.5f, 71.8f, 57.3f, 73.6f);
generalPath.curveTo(59.1f, 75.4f, 59.899998f, 77.9f, 59.899998f, 81.2f);
generalPath.curveTo(59.899998f, 84.399994f, 58.999996f, 86.899994f, 57.3f, 88.7f);
generalPath.curveTo(55.5f, 90.5f, 53.2f, 91.399994f, 50.3f, 91.399994f);
generalPath.curveTo(47.3f, 91.399994f, 45.0f, 90.49999f, 43.2f, 88.7f);
generalPath.curveTo(41.4f, 86.9f, 40.5f, 84.399994f, 40.5f, 81.299995f);
generalPath.closePath();
generalPath.moveTo(44.7f, 81.100006f);
generalPath.curveTo(44.7f, 83.3f, 45.2f, 85.100006f, 46.3f, 86.200005f);
generalPath.curveTo(47.3f, 87.4f, 48.7f, 87.9f, 50.3f, 87.9f);
generalPath.curveTo(51.899998f, 87.9f, 53.2f, 87.3f, 54.3f, 86.200005f);
generalPath.curveTo(55.3f, 85.00001f, 55.8f, 83.3f, 55.8f, 81.00001f);
generalPath.curveTo(55.8f, 78.700005f, 55.3f, 77.00001f, 54.3f, 75.90001f);
generalPath.curveTo(53.3f, 74.80001f, 52.0f, 74.20001f, 50.3f, 74.20001f);
generalPath.curveTo(48.6f, 74.20001f, 47.3f, 74.80001f, 46.3f, 75.90001f);
generalPath.curveTo(45.2f, 77.100006f, 44.7f, 78.90001f, 44.7f, 81.100006f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {new Color(214, 237, 232, 255),new Color(211, 235, 230, 255),new Color(199, 227, 223, 255),new Color(183, 216, 213, 255),new Color(160, 203, 201, 255),new Color(132, 186, 185, 255),new Color(98, 167, 167, 255),new Color(52, 147, 148, 255),new Color(0, 127, 127, 255),new Color(0, 107, 106, 255),new Color(0, 107, 105, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
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
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.8f, 16.2f);
generalPath.curveTo(36.0f, 15.700001f, 36.2f, 15.700001f, 36.399998f, 16.2f);
generalPath.lineTo(41.8f, 32.9f);
generalPath.curveTo(42.0f, 33.4f, 42.399998f, 33.800003f, 43.0f, 33.800003f);
generalPath.lineTo(60.6f, 33.800003f);
generalPath.curveTo(61.1f, 33.800003f, 61.199997f, 34.000004f, 60.8f, 34.300003f);
generalPath.lineTo(46.5f, 44.6f);
generalPath.curveTo(46.1f, 44.899998f, 45.9f, 45.5f, 46.1f, 46.0f);
generalPath.lineTo(51.5f, 62.7f);
generalPath.curveTo(51.7f, 63.2f, 51.4f, 63.3f, 51.1f, 63.0f);
generalPath.lineTo(36.8f, 52.7f);
generalPath.curveTo(36.399998f, 52.4f, 35.8f, 52.4f, 35.3f, 52.7f);
generalPath.lineTo(21.2f, 63.0f);
generalPath.curveTo(20.800001f, 63.3f, 20.6f, 63.1f, 20.800001f, 62.7f);
generalPath.lineTo(26.2f, 46.0f);
generalPath.curveTo(26.300001f, 45.5f, 26.2f, 44.9f, 25.800001f, 44.6f);
generalPath.lineTo(11.5f, 34.3f);
generalPath.curveTo(11.1f, 34.0f, 11.2f, 33.8f, 11.7f, 33.8f);
generalPath.lineTo(29.3f, 33.8f);
generalPath.curveTo(29.8f, 33.8f, 30.3f, 33.399998f, 30.5f, 32.899998f);
generalPath.lineTo(35.8f, 16.199997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.11800003051758, 63.15800094604492), new Point2D.Double(36.11800003051758, 15.819999694824219), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(0, 130, 129, 255),new Color(0, 106, 105, 255),new Color(0, 56, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_ico() {
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
       ext_ico base = new ext_ico();
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
       ext_ico base = new ext_ico();
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
        return ext_ico::new;
    }
}

