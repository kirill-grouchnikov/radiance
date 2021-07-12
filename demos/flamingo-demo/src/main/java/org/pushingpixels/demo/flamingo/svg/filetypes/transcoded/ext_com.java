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
public class ext_com implements NeonIcon {
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.108001708984375, 3.003000020980835), new Point2D.Double(36.108001708984375, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
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
generalPath.moveTo(18.0f, 83.8f);
generalPath.lineTo(21.9f, 85.0f);
generalPath.curveTo(21.3f, 87.2f, 20.3f, 88.8f, 18.9f, 89.8f);
generalPath.curveTo(17.5f, 90.9f, 15.7f, 91.4f, 13.599999f, 91.4f);
generalPath.curveTo(10.9f, 91.4f, 8.799999f, 90.5f, 7.0999994f, 88.700005f);
generalPath.curveTo(5.3999996f, 86.90001f, 4.4999995f, 84.4f, 4.4999995f, 81.3f);
generalPath.curveTo(4.4999995f, 78.0f, 5.3999996f, 75.4f, 7.0999994f, 73.600006f);
generalPath.curveTo(8.799999f, 71.80001f, 11.099999f, 70.90001f, 13.9f, 70.90001f);
generalPath.curveTo(16.3f, 70.90001f, 18.3f, 71.600006f, 19.9f, 73.100006f);
generalPath.curveTo(20.8f, 73.90001f, 21.5f, 75.200005f, 21.9f, 76.8f);
generalPath.lineTo(17.9f, 77.700005f);
generalPath.curveTo(17.699999f, 76.700005f, 17.199999f, 75.9f, 16.4f, 75.3f);
generalPath.curveTo(15.7f, 74.700005f, 14.7f, 74.4f, 13.7f, 74.4f);
generalPath.curveTo(12.2f, 74.4f, 11.0f, 74.9f, 10.1f, 76.0f);
generalPath.curveTo(9.200001f, 77.1f, 8.700001f, 78.7f, 8.700001f, 81.0f);
generalPath.curveTo(8.700001f, 83.5f, 9.200001f, 85.3f, 10.1f, 86.4f);
generalPath.curveTo(11.0f, 87.5f, 12.200001f, 88.0f, 13.6f, 88.0f);
generalPath.curveTo(14.700001f, 88.0f, 15.6f, 87.7f, 16.4f, 87.0f);
generalPath.curveTo(17.199999f, 86.3f, 17.699999f, 85.2f, 18.0f, 83.8f);
generalPath.closePath();
generalPath.moveTo(24.5f, 81.3f);
generalPath.curveTo(24.5f, 79.3f, 24.8f, 77.600006f, 25.4f, 76.200005f);
generalPath.curveTo(25.9f, 75.200005f, 26.5f, 74.3f, 27.3f, 73.50001f);
generalPath.curveTo(28.099998f, 72.700005f, 28.9f, 72.100006f, 29.9f, 71.700005f);
generalPath.curveTo(31.1f, 71.200005f, 32.6f, 70.9f, 34.2f, 70.9f);
generalPath.curveTo(37.100002f, 70.9f, 39.5f, 71.8f, 41.3f, 73.6f);
generalPath.curveTo(43.1f, 75.4f, 44.0f, 77.9f, 44.0f, 81.2f);
generalPath.curveTo(44.0f, 84.399994f, 43.1f, 86.899994f, 41.4f, 88.7f);
generalPath.curveTo(39.600002f, 90.5f, 37.300003f, 91.399994f, 34.4f, 91.399994f);
generalPath.curveTo(31.400002f, 91.399994f, 29.100002f, 90.49999f, 27.300001f, 88.7f);
generalPath.curveTo(25.400002f, 86.899994f, 24.500002f, 84.399994f, 24.500002f, 81.299995f);
generalPath.closePath();
generalPath.moveTo(28.7f, 81.100006f);
generalPath.curveTo(28.7f, 83.3f, 29.2f, 85.00001f, 30.300001f, 86.200005f);
generalPath.curveTo(31.300001f, 87.4f, 32.7f, 87.9f, 34.300003f, 87.9f);
generalPath.curveTo(35.900005f, 87.9f, 37.200005f, 87.3f, 38.300003f, 86.200005f);
generalPath.curveTo(39.300003f, 85.00001f, 39.800003f, 83.3f, 39.800003f, 81.00001f);
generalPath.curveTo(39.800003f, 78.700005f, 39.300003f, 77.00001f, 38.300003f, 75.90001f);
generalPath.curveTo(37.300003f, 74.80001f, 36.000004f, 74.20001f, 34.300003f, 74.20001f);
generalPath.curveTo(32.600002f, 74.20001f, 31.300003f, 74.80001f, 30.300003f, 75.90001f);
generalPath.curveTo(29.200003f, 77.100006f, 28.700003f, 78.80001f, 28.700003f, 81.100006f);
generalPath.closePath();
generalPath.moveTo(47.0f, 91.100006f);
generalPath.lineTo(47.0f, 71.2f);
generalPath.lineTo(53.0f, 71.2f);
generalPath.lineTo(56.6f, 84.7f);
generalPath.lineTo(60.199997f, 71.2f);
generalPath.lineTo(66.2f, 71.2f);
generalPath.lineTo(66.2f, 91.0f);
generalPath.lineTo(62.499996f, 91.0f);
generalPath.lineTo(62.499996f, 75.4f);
generalPath.lineTo(58.499996f, 91.0f);
generalPath.lineTo(54.599995f, 91.0f);
generalPath.lineTo(50.599995f, 75.4f);
generalPath.lineTo(50.599995f, 91.0f);
generalPath.lineTo(47.0f, 91.0f);
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
generalPath.moveTo(60.0f, 17.5f);
generalPath.lineTo(13.5f, 17.5f);
generalPath.lineTo(13.5f, 64.0f);
generalPath.lineTo(60.0f, 64.0f);
generalPath.lineTo(60.0f, 17.5f);
generalPath.closePath();
generalPath.moveTo(22.8f, 26.8f);
generalPath.lineTo(18.199999f, 26.8f);
generalPath.lineTo(18.199999f, 22.199999f);
generalPath.lineTo(22.8f, 22.199999f);
generalPath.lineTo(22.8f, 26.8f);
generalPath.closePath();
generalPath.moveTo(55.3f, 26.8f);
generalPath.lineTo(27.5f, 26.8f);
generalPath.lineTo(27.5f, 22.199999f);
generalPath.lineTo(55.4f, 22.199999f);
generalPath.lineTo(55.4f, 26.8f);
generalPath.closePath();
generalPath.moveTo(55.3f, 59.3f);
generalPath.lineTo(18.1f, 59.3f);
generalPath.lineTo(18.1f, 31.5f);
generalPath.lineTo(55.300003f, 31.5f);
generalPath.lineTo(55.300003f, 59.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.75, 64.0), new Point2D.Double(36.75, 17.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(25.4f, 35.5f);
generalPath.lineTo(22.199999f, 38.7f);
generalPath.lineTo(27.5f, 44.100002f);
generalPath.lineTo(22.2f, 49.4f);
generalPath.lineTo(25.400002f, 52.7f);
generalPath.lineTo(34.100002f, 44.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.108999252319336, 52.694000244140625), new Point2D.Double(28.108999252319336, 35.45600128173828), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(33.1f, 51.0f);
generalPath.lineTo(42.399998f, 51.0f);
generalPath.lineTo(42.399998f, 55.7f);
generalPath.lineTo(33.1f, 55.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.75, 55.70000076293945), new Point2D.Double(37.75, 51.04999923706055), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
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
	private ext_com() {
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
       ext_com base = new ext_com();
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
       ext_com base = new ext_com();
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
        return ext_com::new;
    }
}

