package org.pushingpixels.demo.substance.main.check.svg.tango;

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
public class process_stop implements ResizableIcon {
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
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 0.6306818f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.1738029718399048f, 0.0f, 0.0f, 0.6000000238418579f, -5.265865802764893f, 19.575000762939453f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.875f, 36.75f);
generalPath.curveTo(40.900238f, 40.109352f, 37.90384f, 43.21997f, 33.020405f, 44.904f);
generalPath.curveTo(28.136969f, 46.588028f, 22.113031f, 46.588028f, 17.229597f, 44.904f);
generalPath.curveTo(12.346162f, 43.21997f, 9.34976f, 40.109352f, 9.375f, 36.75f);
generalPath.curveTo(9.34976f, 33.390648f, 12.346162f, 30.28003f, 17.229597f, 28.596f);
generalPath.curveTo(22.113031f, 26.911972f, 28.136969f, 26.911972f, 33.020405f, 28.596f);
generalPath.curveTo(37.90384f, 30.28003f, 40.900238f, 33.390648f, 40.875f, 36.75f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(25.125, 36.75), 15.75f, new Point2D.Double(25.125, 36.75), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5952379703521729f, -2.3006780688054245E-15f, 14.875f));
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
generalPath.moveTo(15.591006f, 0.4919213f);
generalPath.lineTo(32.67631f, 0.4919213f);
generalPath.lineTo(45.497585f, 13.586385f);
generalPath.lineTo(45.497585f, 31.48003f);
generalPath.lineTo(32.848988f, 43.49693f);
generalPath.lineTo(15.418649f, 43.49693f);
generalPath.lineTo(2.4943857f, 30.658264f);
generalPath.lineTo(2.4943857f, 13.464078f);
generalPath.lineTo(15.591006f, 0.4919213f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(23.99598503112793, 20.105337142944336), new Point2D.Double(41.04783630371094, 37.95978546142578), new float[] {0.0f,1.0f}, new Color[] {new Color(204, 0, 0, 255),new Color(179, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -2.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(134, 0, 0, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.591006f, 0.4919213f);
generalPath.lineTo(32.67631f, 0.4919213f);
generalPath.lineTo(45.497585f, 13.586385f);
generalPath.lineTo(45.497585f, 31.48003f);
generalPath.lineTo(32.848988f, 43.49693f);
generalPath.lineTo(15.418649f, 43.49693f);
generalPath.lineTo(2.4943857f, 30.658264f);
generalPath.lineTo(2.4943857f, 13.464078f);
generalPath.lineTo(15.591006f, 0.4919213f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.8131868f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_2
paint = new LinearGradientPaint(new Point2D.Double(15.737001419067383, 12.503600120544434), new Point2D.Double(53.570125579833984, 47.37431716918945), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 139, 139, 255),new Color(236, 27, 27, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -2.0f));
stroke = new BasicStroke(1.0000002f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.020655f, 1.5003424f);
generalPath.lineTo(32.24856f, 1.5003424f);
generalPath.lineTo(44.496456f, 13.922717f);
generalPath.lineTo(44.496456f, 31.037f);
generalPath.lineTo(32.638474f, 42.48783f);
generalPath.lineTo(15.870253f, 42.48783f);
generalPath.lineTo(3.5090792f, 30.208717f);
generalPath.lineTo(3.5090792f, 13.84561f);
generalPath.lineTo(16.020655f, 1.5003424f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.28977272f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.6875f, 0.75f);
generalPath.lineTo(2.75f, 13.5625f);
generalPath.lineTo(2.75f, 30.5625f);
generalPath.lineTo(5.6875f, 33.46875f);
generalPath.curveTo(22.45004f, 33.5263f, 22.164665f, 20.450068f, 45.25f, 21.59375f);
generalPath.lineTo(45.25f, 13.6875f);
generalPath.lineTo(32.5625f, 0.75f);
generalPath.lineTo(15.6875f, 0.75f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(16.75, 10.666343688964844), 21.25f, new Point2D.Double(16.75, 10.666343688964844), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(4.154956817626953f, -2.9792059809856577E-24f, 3.255656960409251E-24f, 3.198723077774048f, -52.84553146362305f, -23.50921058654785f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.767176f, 10.5f);
generalPath.lineTo(12.5f, 14.767175f);
generalPath.lineTo(20.035074f, 22.30225f);
generalPath.lineTo(12.5f, 29.837324f);
generalPath.lineTo(16.767176f, 34.1045f);
generalPath.lineTo(24.30225f, 26.569426f);
generalPath.lineTo(31.837324f, 34.1045f);
generalPath.lineTo(36.1045f, 29.837324f);
generalPath.lineTo(28.569426f, 22.30225f);
generalPath.lineTo(36.1045f, 14.767175f);
generalPath.lineTo(31.837324f, 10.5f);
generalPath.lineTo(24.30225f, 18.035074f);
generalPath.lineTo(16.767176f, 10.5f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(24.302249908447266, 33.302249908447266), 12.30225f, new Point2D.Double(24.302249908447266, 33.302249908447266), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(219, 219, 219, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.6939810514450073f, -5.775713850024141E-16f, 5.775713850024141E-16f, 1.6939810514450073f, -16.86528968811035f, -25.11111068725586f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(21.75, 15.802249908447266), new Point2D.Double(24.302249908447266, 35.052249908447266), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 2, 2, 255),new Color(255, 155, 155, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -2.0f));
stroke = new BasicStroke(0.9999996f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.767176f, 10.5f);
generalPath.lineTo(12.5f, 14.767175f);
generalPath.lineTo(20.035074f, 22.30225f);
generalPath.lineTo(12.5f, 29.837324f);
generalPath.lineTo(16.767176f, 34.1045f);
generalPath.lineTo(24.30225f, 26.569426f);
generalPath.lineTo(31.837324f, 34.1045f);
generalPath.lineTo(36.1045f, 29.837324f);
generalPath.lineTo(28.569426f, 22.30225f);
generalPath.lineTo(36.1045f, 14.767175f);
generalPath.lineTo(31.837324f, 10.5f);
generalPath.lineTo(24.30225f, 18.035074f);
generalPath.lineTo(16.767176f, 10.5f);
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
        return 1.9943857192993164;
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
		return 44.00320053100586;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 47.52781677246094;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private process_stop() {
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
       process_stop base = new process_stop();
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
       process_stop base = new process_stop();
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
        return process_stop::new;
    }
}

