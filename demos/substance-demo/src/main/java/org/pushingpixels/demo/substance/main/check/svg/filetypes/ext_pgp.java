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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_pgp implements NeonIcon {
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(9.2f, 91.9f);
generalPath.lineTo(9.2f, 71.9f);
generalPath.lineTo(15.7f, 71.9f);
generalPath.curveTo(18.2f, 71.9f, 19.8f, 72.0f, 20.5f, 72.200005f);
generalPath.curveTo(21.6f, 72.50001f, 22.6f, 73.200005f, 23.4f, 74.200005f);
generalPath.curveTo(24.199999f, 75.200005f, 24.6f, 76.50001f, 24.6f, 78.100006f);
generalPath.curveTo(24.6f, 79.3f, 24.4f, 80.40001f, 23.9f, 81.200005f);
generalPath.curveTo(23.5f, 82.00001f, 22.9f, 82.700005f, 22.199999f, 83.200005f);
generalPath.curveTo(21.499998f, 83.700005f, 20.8f, 84.00001f, 20.099998f, 84.200005f);
generalPath.curveTo(19.099998f, 84.4f, 17.699999f, 84.50001f, 15.899999f, 84.50001f);
generalPath.lineTo(13.299999f, 84.50001f);
generalPath.lineTo(13.299999f, 92.100006f);
generalPath.lineTo(9.2f, 92.100006f);
generalPath.closePath();
generalPath.moveTo(13.299999f, 75.2f);
generalPath.lineTo(13.299999f, 80.899994f);
generalPath.lineTo(15.499999f, 80.899994f);
generalPath.curveTo(17.099998f, 80.899994f, 18.199999f, 80.799995f, 18.699999f, 80.59999f);
generalPath.curveTo(19.199999f, 80.399994f, 19.699999f, 80.09999f, 19.999998f, 79.59999f);
generalPath.curveTo(20.299997f, 79.19999f, 20.499998f, 78.59999f, 20.499998f, 77.99999f);
generalPath.curveTo(20.499998f, 77.299995f, 20.299997f, 76.69999f, 19.899998f, 76.19999f);
generalPath.curveTo(19.499998f, 75.69999f, 18.899998f, 75.39999f, 18.299997f, 75.29999f);
generalPath.curveTo(17.799997f, 75.19999f, 16.799997f, 75.19999f, 15.399998f, 75.19999f);
generalPath.lineTo(13.299997f, 75.19999f);
generalPath.closePath();
generalPath.moveTo(37.199997f, 84.5f);
generalPath.lineTo(37.199997f, 81.1f);
generalPath.lineTo(45.899998f, 81.1f);
generalPath.lineTo(45.899998f, 89.1f);
generalPath.curveTo(45.1f, 89.9f, 43.8f, 90.6f, 42.199997f, 91.299995f);
generalPath.curveTo(40.6f, 91.899994f, 38.999996f, 92.2f, 37.299995f, 92.2f);
generalPath.curveTo(35.199997f, 92.2f, 33.399994f, 91.799995f, 31.799995f, 90.899994f);
generalPath.curveTo(30.199997f, 89.99999f, 29.099995f, 88.799995f, 28.299995f, 87.09999f);
generalPath.curveTo(27.499996f, 85.49999f, 27.099995f, 83.69999f, 27.099995f, 81.79999f);
generalPath.curveTo(27.099995f, 79.69999f, 27.499994f, 77.89999f, 28.399994f, 76.19999f);
generalPath.curveTo(29.299994f, 74.49999f, 30.599995f, 73.29999f, 32.199993f, 72.49999f);
generalPath.curveTo(33.499992f, 71.799995f, 35.099995f, 71.49999f, 36.999992f, 71.49999f);
generalPath.curveTo(39.499992f, 71.49999f, 41.399994f, 71.99999f, 42.79999f, 73.09999f);
generalPath.curveTo(44.199993f, 74.09999f, 45.09999f, 75.59999f, 45.499992f, 77.399994f);
generalPath.lineTo(41.499992f, 78.2f);
generalPath.curveTo(41.199993f, 77.2f, 40.699993f, 76.399994f, 39.899994f, 75.899994f);
generalPath.curveTo(39.099995f, 75.399994f, 38.299995f, 74.99999f, 37.199993f, 74.99999f);
generalPath.curveTo(35.399994f, 74.99999f, 33.999992f, 75.59999f, 32.999992f, 76.69999f);
generalPath.curveTo(31.999992f, 77.79999f, 31.399992f, 79.49999f, 31.399992f, 81.69999f);
generalPath.curveTo(31.399992f, 84.09999f, 31.899992f, 85.89999f, 32.999992f, 87.09999f);
generalPath.curveTo(34.09999f, 88.29999f, 35.399994f, 88.899994f, 37.199993f, 88.899994f);
generalPath.curveTo(37.999992f, 88.899994f, 38.899994f, 88.7f, 39.699993f, 88.399994f);
generalPath.curveTo(40.599995f, 88.09999f, 41.29999f, 87.7f, 41.899994f, 87.2f);
generalPath.lineTo(41.899994f, 84.7f);
generalPath.lineTo(37.199993f, 84.7f);
generalPath.closePath();
generalPath.moveTo(49.699997f, 91.9f);
generalPath.lineTo(49.699997f, 71.9f);
generalPath.lineTo(56.199997f, 71.9f);
generalPath.curveTo(58.699997f, 71.9f, 60.299995f, 72.0f, 60.999996f, 72.200005f);
generalPath.curveTo(62.099995f, 72.50001f, 63.099995f, 73.200005f, 63.899998f, 74.200005f);
generalPath.curveTo(64.7f, 75.200005f, 65.1f, 76.50001f, 65.1f, 78.100006f);
generalPath.curveTo(65.1f, 79.3f, 64.9f, 80.40001f, 64.4f, 81.200005f);
generalPath.curveTo(64.0f, 82.00001f, 63.4f, 82.700005f, 62.7f, 83.200005f);
generalPath.curveTo(62.0f, 83.700005f, 61.3f, 84.00001f, 60.600002f, 84.200005f);
generalPath.curveTo(59.600002f, 84.4f, 58.2f, 84.50001f, 56.4f, 84.50001f);
generalPath.lineTo(53.800003f, 84.50001f);
generalPath.lineTo(53.800003f, 92.100006f);
generalPath.lineTo(49.700005f, 92.100006f);
generalPath.closePath();
generalPath.moveTo(53.699997f, 75.2f);
generalPath.lineTo(53.699997f, 80.899994f);
generalPath.lineTo(55.899998f, 80.899994f);
generalPath.curveTo(57.499996f, 80.899994f, 58.6f, 80.799995f, 59.1f, 80.59999f);
generalPath.curveTo(59.6f, 80.399994f, 60.1f, 80.09999f, 60.399998f, 79.59999f);
generalPath.curveTo(60.699997f, 79.19999f, 60.899998f, 78.59999f, 60.899998f, 77.99999f);
generalPath.curveTo(60.899998f, 77.299995f, 60.699997f, 76.69999f, 60.3f, 76.19999f);
generalPath.curveTo(59.899998f, 75.69999f, 59.3f, 75.39999f, 58.7f, 75.29999f);
generalPath.curveTo(58.2f, 75.19999f, 57.2f, 75.19999f, 55.8f, 75.19999f);
generalPath.lineTo(53.7f, 75.19999f);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -952.3619995117188f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.4f, 978.9f);
generalPath.curveTo(38.5f, 982.0f, 39.5f, 986.4f, 38.300003f, 990.4f);
generalPath.lineTo(54.800003f, 1006.9f);
generalPath.lineTo(55.200005f, 1014.30005f);
generalPath.lineTo(45.900005f, 1013.50006f);
generalPath.lineTo(45.900005f, 1008.80005f);
generalPath.lineTo(41.200005f, 1008.80005f);
generalPath.lineTo(41.200005f, 1004.10004f);
generalPath.lineTo(36.500004f, 1004.10004f);
generalPath.lineTo(30.500004f, 998.10004f);
generalPath.curveTo(26.600004f, 999.30005f, 22.100004f, 998.30005f, 19.000004f, 995.2f);
generalPath.curveTo(14.500004f, 990.7f, 14.500004f, 983.4f, 19.000004f, 978.9f);
generalPath.curveTo(23.600004f, 974.4f, 30.900003f, 974.4f, 35.4f, 978.9f);
generalPath.closePath();
generalPath.moveTo(26.800001f, 982.0f);
generalPath.curveTo(26.177185f, 981.3759f, 25.3317f, 981.0252f, 24.45f, 981.0252f);
generalPath.curveTo(23.568304f, 981.0252f, 22.722818f, 981.3759f, 22.100002f, 982.0f);
generalPath.curveTo(21.475904f, 982.6228f, 21.125183f, 983.4683f, 21.125183f, 984.35f);
generalPath.curveTo(21.125183f, 985.2317f, 21.475904f, 986.0772f, 22.100002f, 986.7f);
generalPath.curveTo(23.400002f, 988.0f, 25.500002f, 988.0f, 26.800003f, 986.7f);
generalPath.curveTo(28.100002f, 985.4f, 28.100002f, 983.3f, 26.800003f, 982.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.444000244140625, 1014.3270263671875), new Point2D.Double(35.444000244140625, 975.551025390625), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_pgp() {
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
       ext_pgp base = new ext_pgp();
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
       ext_pgp base = new ext_pgp();
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
        return ext_pgp::new;
    }
}

