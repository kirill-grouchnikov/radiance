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
public class ext_tgz implements NeonIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
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
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(71.7f, 99.2f);
generalPath.lineTo(0.2f, 99.2f);
generalPath.lineTo(0.2f, 0.9f);
generalPath.lineTo(44.9f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.880000114440918), new Point2D.Double(36.0, 101.125), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {new Color(239, 196, 2, 255),new Color(241, 200, 41, 255),new Color(244, 210, 100, 255),new Color(247, 220, 139, 255),new Color(249, 229, 172, 255),new Color(251, 236, 199, 255),new Color(252, 243, 221, 255),new Color(254, 249, 238, 255),new Color(255, 253, 249, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(71.7f, 99.2f);
generalPath.lineTo(0.2f, 99.2f);
generalPath.lineTo(0.2f, 0.9f);
generalPath.lineTo(44.9f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(71.7f, 99.2f);
generalPath.lineTo(0.2f, 99.2f);
generalPath.lineTo(0.2f, 0.9f);
generalPath.lineTo(44.9f, 0.9f);
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
generalPath.moveTo(14.7f, 92.2f);
generalPath.lineTo(14.7f, 75.6f);
generalPath.lineTo(8.8f, 75.6f);
generalPath.lineTo(8.8f, 72.2f);
generalPath.lineTo(24.6f, 72.2f);
generalPath.lineTo(24.6f, 75.6f);
generalPath.lineTo(18.7f, 75.6f);
generalPath.lineTo(18.7f, 92.1f);
generalPath.lineTo(14.700001f, 92.1f);
generalPath.closePath();
generalPath.moveTo(36.4f, 84.899994f);
generalPath.lineTo(36.4f, 81.49999f);
generalPath.lineTo(45.100002f, 81.49999f);
generalPath.lineTo(45.100002f, 89.399994f);
generalPath.curveTo(44.300003f, 90.2f, 43.000004f, 90.899994f, 41.4f, 91.59999f);
generalPath.curveTo(39.800003f, 92.19999f, 38.2f, 92.49999f, 36.5f, 92.49999f);
generalPath.curveTo(34.4f, 92.49999f, 32.6f, 92.09999f, 31.1f, 91.19999f);
generalPath.curveTo(29.600002f, 90.29999f, 28.4f, 89.09999f, 27.6f, 87.49999f);
generalPath.curveTo(26.800001f, 85.899994f, 26.4f, 84.09999f, 26.4f, 82.19999f);
generalPath.curveTo(26.4f, 80.09999f, 26.8f, 78.29999f, 27.699999f, 76.69999f);
generalPath.curveTo(28.599998f, 75.09999f, 29.8f, 73.89999f, 31.499998f, 72.99999f);
generalPath.curveTo(32.8f, 72.299995f, 34.399998f, 71.99999f, 36.3f, 71.99999f);
generalPath.curveTo(38.8f, 71.99999f, 40.7f, 72.49999f, 42.1f, 73.59999f);
generalPath.curveTo(43.5f, 74.59999f, 44.399998f, 76.09999f, 44.8f, 77.899994f);
generalPath.lineTo(40.8f, 78.59999f);
generalPath.curveTo(40.5f, 77.59999f, 40.0f, 76.899994f, 39.2f, 76.29999f);
generalPath.curveTo(38.4f, 75.69999f, 37.5f, 75.499985f, 36.3f, 75.499985f);
generalPath.curveTo(34.5f, 75.499985f, 33.1f, 76.09998f, 32.1f, 77.19998f);
generalPath.curveTo(31.099998f, 78.29998f, 30.499998f, 79.999985f, 30.499998f, 82.19998f);
generalPath.curveTo(30.499998f, 84.59998f, 30.999998f, 86.29998f, 32.1f, 87.499985f);
generalPath.curveTo(33.1f, 88.69998f, 34.5f, 89.29999f, 36.199997f, 89.29999f);
generalPath.curveTo(36.999996f, 89.29999f, 37.899998f, 89.09999f, 38.699997f, 88.79999f);
generalPath.curveTo(39.499996f, 88.499985f, 40.299995f, 88.09999f, 40.899998f, 87.59999f);
generalPath.lineTo(40.899998f, 85.09999f);
generalPath.lineTo(36.399998f, 85.09999f);
generalPath.closePath();
generalPath.moveTo(47.100002f, 92.2f);
generalPath.lineTo(47.100002f, 88.6f);
generalPath.lineTo(57.600002f, 75.7f);
generalPath.lineTo(48.300003f, 75.7f);
generalPath.lineTo(48.300003f, 72.299995f);
generalPath.lineTo(62.9f, 72.299995f);
generalPath.lineTo(62.9f, 75.399994f);
generalPath.lineTo(51.9f, 88.799995f);
generalPath.lineTo(63.2f, 88.799995f);
generalPath.lineTo(63.2f, 92.2f);
generalPath.lineTo(47.1f, 92.2f);
generalPath.closePath();
shape = generalPath;
paint = new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
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
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(44.9f, 27.699999f);
generalPath.lineTo(44.9f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.94200134277344, 74.32599639892578), new Point2D.Double(58.347999572753906, 87.73300170898438), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 254, 251, 255),new Color(254, 250, 241, 255),new Color(253, 245, 228, 255),new Color(252, 240, 210, 255),new Color(250, 233, 188, 255),new Color(249, 226, 162, 255),new Color(247, 218, 131, 255),new Color(244, 209, 93, 255),new Color(241, 200, 39, 255),new Color(239, 196, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(44.9f, 27.699999f);
generalPath.lineTo(44.9f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(44.9f, 27.699999f);
generalPath.lineTo(44.9f, 0.9f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.0f, 15.8f);
generalPath.lineTo(29.6f, 15.8f);
generalPath.lineTo(29.6f, 10.8f);
generalPath.lineTo(38.0f, 10.8f);
generalPath.lineTo(38.0f, 15.8f);
generalPath.closePath();
generalPath.moveTo(38.0f, 24.7f);
generalPath.lineTo(29.6f, 24.7f);
generalPath.lineTo(29.6f, 29.7f);
generalPath.lineTo(38.0f, 29.7f);
generalPath.lineTo(38.0f, 24.7f);
generalPath.closePath();
generalPath.moveTo(38.0f, 3.9000015f);
generalPath.lineTo(29.6f, 3.9000015f);
generalPath.lineTo(29.6f, 8.900002f);
generalPath.lineTo(38.0f, 8.900002f);
generalPath.lineTo(38.0f, 3.9000015f);
generalPath.closePath();
generalPath.moveTo(38.0f, 17.7f);
generalPath.lineTo(29.6f, 17.7f);
generalPath.lineTo(29.6f, 22.7f);
generalPath.lineTo(38.0f, 22.7f);
generalPath.lineTo(38.0f, 17.7f);
generalPath.closePath();
generalPath.moveTo(38.0f, 31.6f);
generalPath.lineTo(29.6f, 31.6f);
generalPath.lineTo(29.6f, 36.6f);
generalPath.lineTo(38.0f, 36.6f);
generalPath.lineTo(38.0f, 31.599998f);
generalPath.closePath();
generalPath.moveTo(38.7f, 56.2f);
generalPath.curveTo(38.7f, 59.0f, 36.4f, 61.3f, 33.600002f, 61.3f);
generalPath.curveTo(30.800003f, 61.3f, 28.500002f, 59.0f, 28.500002f, 56.2f);
generalPath.lineTo(28.500002f, 55.7f);
generalPath.lineTo(30.200003f, 41.1f);
generalPath.curveTo(30.200003f, 39.199997f, 31.700003f, 37.699997f, 33.600002f, 37.699997f);
generalPath.curveTo(35.4f, 37.699997f, 36.9f, 39.199997f, 37.000004f, 40.999996f);
generalPath.lineTo(38.600002f, 55.399994f);
generalPath.curveTo(38.7f, 55.799995f, 38.7f, 55.999992f, 38.7f, 56.199993f);
generalPath.closePath();
generalPath.moveTo(37.100002f, 56.100002f);
generalPath.curveTo(37.100002f, 54.2f, 35.500004f, 52.600002f, 33.600002f, 52.600002f);
generalPath.curveTo(31.7f, 52.600002f, 30.100002f, 54.2f, 30.100002f, 56.100002f);
generalPath.curveTo(30.100002f, 58.000004f, 31.700003f, 59.600002f, 33.600002f, 59.600002f);
generalPath.curveTo(35.600002f, 59.500004f, 37.100002f, 57.9f, 37.100002f, 56.100002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.617000579833984, 40.68899917602539), new Point2D.Double(33.617000579833984, 98.14800262451172), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {new Color(164, 125, 3, 255),new Color(222, 190, 0, 255),new Color(207, 173, 4, 255),new Color(160, 120, 2, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.5f, 41.6f);
generalPath.lineTo(30.2f, 37.1f);
generalPath.lineTo(30.2f, 34.8f);
generalPath.lineTo(32.5f, 32.6f);
generalPath.lineTo(34.7f, 32.6f);
generalPath.lineTo(37.0f, 34.8f);
generalPath.lineTo(37.0f, 37.1f);
generalPath.lineTo(34.7f, 41.6f);
generalPath.lineTo(32.5f, 41.6f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
        return 0.13199996948242188;
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
		return 0.73499995470047;
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
	private ext_tgz() {
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
       ext_tgz base = new ext_tgz();
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
       ext_tgz base = new ext_tgz();
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
        return ext_tgz::new;
    }
}

