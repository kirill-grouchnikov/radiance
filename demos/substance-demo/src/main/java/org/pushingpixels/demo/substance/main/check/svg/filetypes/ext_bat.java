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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_bat implements ResizableIcon {
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.2, 99.0);
generalPath.lineTo(0.2, 1.0);
generalPath.lineTo(45.100002, 1.0);
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.2, 99.0);
generalPath.lineTo(0.2, 1.0);
generalPath.lineTo(45.100002, 1.0);
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.2, 99.0);
generalPath.lineTo(0.2, 1.0);
generalPath.lineTo(45.100002, 1.0);
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
generalPath.moveTo(10.1, 71.2);
generalPath.lineTo(18.1, 71.2);
generalPath.curveTo(19.7, 71.2, 20.9, 71.299995, 21.6, 71.399994);
generalPath.curveTo(22.4, 71.49999, 23.1, 71.799995, 23.7, 72.2);
generalPath.curveTo(24.300001, 72.6, 24.800001, 73.2, 25.2, 73.899994);
generalPath.curveTo(25.6, 74.59999, 25.800001, 75.399994, 25.800001, 76.2);
generalPath.curveTo(25.800001, 77.1, 25.500002, 78.0, 25.000002, 78.799995);
generalPath.curveTo(24.500002, 79.59999, 23.800001, 80.2, 22.900002, 80.49999);
generalPath.curveTo(24.100002, 80.899994, 25.100002, 81.49999, 25.7, 82.299995);
generalPath.curveTo(26.400002, 83.1, 26.7, 84.1, 26.7, 85.299995);
generalPath.curveTo(26.7, 86.2, 26.5, 87.1, 26.1, 87.899994);
generalPath.curveTo(25.7, 88.69999, 25.1, 89.399994, 24.4, 89.899994);
generalPath.curveTo(23.699999, 90.399994, 22.8, 90.7, 21.699999, 90.799995);
generalPath.curveTo(20.999998, 90.899994, 19.4, 90.899994, 16.8, 90.899994);
generalPath.lineTo(10.0, 90.899994);
generalPath.lineTo(10.0, 71.2);
generalPath.closePath();
generalPath.moveTo(14.200001, 74.5);
generalPath.lineTo(14.200001, 79.1);
generalPath.lineTo(16.800001, 79.1);
generalPath.curveTo(18.400002, 79.1, 19.300001, 79.1, 19.7, 79.0);
generalPath.curveTo(20.400002, 78.9, 20.900002, 78.7, 21.300001, 78.3);
generalPath.curveTo(21.7, 77.90001, 21.900002, 77.4, 21.900002, 76.8);
generalPath.curveTo(21.900002, 76.200005, 21.7, 75.700005, 21.400002, 75.3);
generalPath.curveTo(21.100002, 74.9, 20.600002, 74.700005, 19.900002, 74.600006);
generalPath.curveTo(19.500002, 74.600006, 18.400002, 74.50001, 16.500002, 74.50001);
generalPath.lineTo(14.200002, 74.50001);
generalPath.closePath();
generalPath.moveTo(14.200001, 82.4);
generalPath.lineTo(14.200001, 87.700005);
generalPath.lineTo(17.900002, 87.700005);
generalPath.curveTo(19.400002, 87.700005, 20.300001, 87.700005, 20.7, 87.600006);
generalPath.curveTo(21.300001, 87.50001, 21.800001, 87.200005, 22.2, 86.8);
generalPath.curveTo(22.6, 86.4, 22.800001, 85.8, 22.800001, 85.100006);
generalPath.curveTo(22.800001, 84.50001, 22.7, 84.00001, 22.400002, 83.600006);
generalPath.curveTo(22.100002, 83.200005, 21.7, 82.90001, 21.100002, 82.700005);
generalPath.curveTo(20.600002, 82.50001, 19.400002, 82.4, 17.500002, 82.4);
generalPath.lineTo(14.200002, 82.4);
generalPath.closePath();
generalPath.moveTo(48.3, 91.1);
generalPath.lineTo(43.899998, 91.1);
generalPath.lineTo(42.199997, 86.6);
generalPath.lineTo(34.199997, 86.6);
generalPath.lineTo(32.6, 91.1);
generalPath.lineTo(28.3, 91.1);
generalPath.lineTo(36.0, 71.2);
generalPath.lineTo(40.3, 71.2);
generalPath.lineTo(48.3, 91.1);
generalPath.closePath();
generalPath.moveTo(40.899998, 83.2);
generalPath.lineTo(38.1, 75.799995);
generalPath.lineTo(35.399998, 83.2);
generalPath.lineTo(40.899998, 83.2);
generalPath.closePath();
generalPath.moveTo(52.799995, 91.1);
generalPath.lineTo(52.799995, 74.6);
generalPath.lineTo(46.899994, 74.6);
generalPath.lineTo(46.899994, 71.2);
generalPath.lineTo(62.799995, 71.2);
generalPath.lineTo(62.799995, 74.6);
generalPath.lineTo(56.899994, 74.6);
generalPath.lineTo(56.899994, 91.1);
generalPath.lineTo(52.799995, 91.1);
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
generalPath.moveTo(60.0, 17.5);
generalPath.lineTo(13.5, 17.5);
generalPath.lineTo(13.5, 64.0);
generalPath.lineTo(60.0, 64.0);
generalPath.lineTo(60.0, 17.5);
generalPath.closePath();
generalPath.moveTo(22.8, 26.8);
generalPath.lineTo(18.199999, 26.8);
generalPath.lineTo(18.199999, 22.199999);
generalPath.lineTo(22.8, 22.199999);
generalPath.lineTo(22.8, 26.8);
generalPath.closePath();
generalPath.moveTo(55.3, 26.8);
generalPath.lineTo(27.5, 26.8);
generalPath.lineTo(27.5, 22.199999);
generalPath.lineTo(55.4, 22.199999);
generalPath.lineTo(55.4, 26.8);
generalPath.closePath();
generalPath.moveTo(55.3, 59.3);
generalPath.lineTo(18.1, 59.3);
generalPath.lineTo(18.1, 31.5);
generalPath.lineTo(55.300003, 31.5);
generalPath.lineTo(55.300003, 59.3);
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
generalPath.moveTo(25.4, 35.5);
generalPath.lineTo(22.199999, 38.7);
generalPath.lineTo(27.5, 44.100002);
generalPath.lineTo(22.2, 49.4);
generalPath.lineTo(25.400002, 52.7);
generalPath.lineTo(34.100002, 44.1);
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
generalPath.moveTo(33.1, 51.0);
generalPath.lineTo(42.399998, 51.0);
generalPath.lineTo(42.399998, 55.7);
generalPath.lineTo(33.1, 55.7);
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.1, 27.7);
generalPath.lineTo(45.1, 1.0);
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.1, 27.7);
generalPath.lineTo(45.1, 1.0);
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.1, 27.7);
generalPath.lineTo(45.1, 1.0);
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
	private ext_bat() {
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
       ext_bat base = new ext_bat();
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
       ext_bat base = new ext_bat();
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
        return ext_bat::new;
    }
}

