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
public class ext_pgp implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
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
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.2, 91.9);
generalPath.lineTo(9.2, 71.9);
generalPath.lineTo(15.7, 71.9);
generalPath.curveTo(18.2, 71.9, 19.8, 72.0, 20.5, 72.200005);
generalPath.curveTo(21.6, 72.50001, 22.6, 73.200005, 23.4, 74.200005);
generalPath.curveTo(24.199999, 75.200005, 24.6, 76.50001, 24.6, 78.100006);
generalPath.curveTo(24.6, 79.3, 24.4, 80.40001, 23.9, 81.200005);
generalPath.curveTo(23.5, 82.00001, 22.9, 82.700005, 22.199999, 83.200005);
generalPath.curveTo(21.499998, 83.700005, 20.8, 84.00001, 20.099998, 84.200005);
generalPath.curveTo(19.099998, 84.4, 17.699999, 84.50001, 15.899999, 84.50001);
generalPath.lineTo(13.299999, 84.50001);
generalPath.lineTo(13.299999, 92.100006);
generalPath.lineTo(9.2, 92.100006);
generalPath.closePath();
generalPath.moveTo(13.299999, 75.2);
generalPath.lineTo(13.299999, 80.899994);
generalPath.lineTo(15.499999, 80.899994);
generalPath.curveTo(17.099998, 80.899994, 18.199999, 80.799995, 18.699999, 80.59999);
generalPath.curveTo(19.199999, 80.399994, 19.699999, 80.09999, 19.999998, 79.59999);
generalPath.curveTo(20.299997, 79.19999, 20.499998, 78.59999, 20.499998, 77.99999);
generalPath.curveTo(20.499998, 77.299995, 20.299997, 76.69999, 19.899998, 76.19999);
generalPath.curveTo(19.499998, 75.69999, 18.899998, 75.39999, 18.299997, 75.29999);
generalPath.curveTo(17.799997, 75.19999, 16.799997, 75.19999, 15.399998, 75.19999);
generalPath.lineTo(13.299997, 75.19999);
generalPath.closePath();
generalPath.moveTo(37.199997, 84.5);
generalPath.lineTo(37.199997, 81.1);
generalPath.lineTo(45.899998, 81.1);
generalPath.lineTo(45.899998, 89.1);
generalPath.curveTo(45.1, 89.9, 43.8, 90.6, 42.199997, 91.299995);
generalPath.curveTo(40.6, 91.899994, 38.999996, 92.2, 37.299995, 92.2);
generalPath.curveTo(35.199997, 92.2, 33.399994, 91.799995, 31.799995, 90.899994);
generalPath.curveTo(30.199997, 89.99999, 29.099995, 88.799995, 28.299995, 87.09999);
generalPath.curveTo(27.499996, 85.49999, 27.099995, 83.69999, 27.099995, 81.79999);
generalPath.curveTo(27.099995, 79.69999, 27.499994, 77.89999, 28.399994, 76.19999);
generalPath.curveTo(29.299994, 74.49999, 30.599995, 73.29999, 32.199993, 72.49999);
generalPath.curveTo(33.499992, 71.799995, 35.099995, 71.49999, 36.999992, 71.49999);
generalPath.curveTo(39.499992, 71.49999, 41.399994, 71.99999, 42.79999, 73.09999);
generalPath.curveTo(44.199993, 74.09999, 45.09999, 75.59999, 45.499992, 77.399994);
generalPath.lineTo(41.499992, 78.2);
generalPath.curveTo(41.199993, 77.2, 40.699993, 76.399994, 39.899994, 75.899994);
generalPath.curveTo(39.099995, 75.399994, 38.299995, 74.99999, 37.199993, 74.99999);
generalPath.curveTo(35.399994, 74.99999, 33.999992, 75.59999, 32.999992, 76.69999);
generalPath.curveTo(31.999992, 77.79999, 31.399992, 79.49999, 31.399992, 81.69999);
generalPath.curveTo(31.399992, 84.09999, 31.899992, 85.89999, 32.999992, 87.09999);
generalPath.curveTo(34.09999, 88.29999, 35.399994, 88.899994, 37.199993, 88.899994);
generalPath.curveTo(37.999992, 88.899994, 38.899994, 88.7, 39.699993, 88.399994);
generalPath.curveTo(40.599995, 88.09999, 41.29999, 87.7, 41.899994, 87.2);
generalPath.lineTo(41.899994, 84.7);
generalPath.lineTo(37.199993, 84.7);
generalPath.closePath();
generalPath.moveTo(49.699997, 91.9);
generalPath.lineTo(49.699997, 71.9);
generalPath.lineTo(56.199997, 71.9);
generalPath.curveTo(58.699997, 71.9, 60.299995, 72.0, 60.999996, 72.200005);
generalPath.curveTo(62.099995, 72.50001, 63.099995, 73.200005, 63.899998, 74.200005);
generalPath.curveTo(64.7, 75.200005, 65.1, 76.50001, 65.1, 78.100006);
generalPath.curveTo(65.1, 79.3, 64.9, 80.40001, 64.4, 81.200005);
generalPath.curveTo(64.0, 82.00001, 63.4, 82.700005, 62.7, 83.200005);
generalPath.curveTo(62.0, 83.700005, 61.3, 84.00001, 60.600002, 84.200005);
generalPath.curveTo(59.600002, 84.4, 58.2, 84.50001, 56.4, 84.50001);
generalPath.lineTo(53.800003, 84.50001);
generalPath.lineTo(53.800003, 92.100006);
generalPath.lineTo(49.700005, 92.100006);
generalPath.closePath();
generalPath.moveTo(53.699997, 75.2);
generalPath.lineTo(53.699997, 80.899994);
generalPath.lineTo(55.899998, 80.899994);
generalPath.curveTo(57.499996, 80.899994, 58.6, 80.799995, 59.1, 80.59999);
generalPath.curveTo(59.6, 80.399994, 60.1, 80.09999, 60.399998, 79.59999);
generalPath.curveTo(60.699997, 79.19999, 60.899998, 78.59999, 60.899998, 77.99999);
generalPath.curveTo(60.899998, 77.299995, 60.699997, 76.69999, 60.3, 76.19999);
generalPath.curveTo(59.899998, 75.69999, 59.3, 75.39999, 58.7, 75.29999);
generalPath.curveTo(58.2, 75.19999, 57.2, 75.19999, 55.8, 75.19999);
generalPath.lineTo(53.7, 75.19999);
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
generalPath.moveTo(35.4, 978.9);
generalPath.curveTo(38.5, 982.0, 39.5, 986.4, 38.300003, 990.4);
generalPath.lineTo(54.800003, 1006.9);
generalPath.lineTo(55.200005, 1014.30005);
generalPath.lineTo(45.900005, 1013.50006);
generalPath.lineTo(45.900005, 1008.80005);
generalPath.lineTo(41.200005, 1008.80005);
generalPath.lineTo(41.200005, 1004.10004);
generalPath.lineTo(36.500004, 1004.10004);
generalPath.lineTo(30.500004, 998.10004);
generalPath.curveTo(26.600004, 999.30005, 22.100004, 998.30005, 19.000004, 995.2);
generalPath.curveTo(14.500004, 990.7, 14.500004, 983.4, 19.000004, 978.9);
generalPath.curveTo(23.600004, 974.4, 30.900003, 974.4, 35.4, 978.9);
generalPath.closePath();
generalPath.moveTo(26.800001, 982.0);
generalPath.curveTo(26.177185, 981.3759, 25.3317, 981.0252, 24.45, 981.0252);
generalPath.curveTo(23.568304, 981.0252, 22.722818, 981.3759, 22.100002, 982.0);
generalPath.curveTo(21.475904, 982.6228, 21.125183, 983.4683, 21.125183, 984.35);
generalPath.curveTo(21.125183, 985.2317, 21.475904, 986.0772, 22.100002, 986.7);
generalPath.curveTo(23.400002, 988.0, 25.500002, 988.0, 26.800003, 986.7);
generalPath.curveTo(28.100002, 985.4, 28.100002, 983.3, 26.800003, 982.0);
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
    public static ResizableIcon of(int width, int height) {
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_pgp base = new ext_pgp();
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
        return ext_pgp::new;
    }
}

