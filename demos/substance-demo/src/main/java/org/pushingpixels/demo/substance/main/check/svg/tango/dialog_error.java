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
public class dialog_error implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.6f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0705549716949463f, 0.0f, 0.0f, 0.5249999761581421f, -0.8927549719810486f, 22.5f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(41.0f, 40.0f);
generalPath.curveTo(41.027473f, 43.071407f, 37.766083f, 45.9154f, 32.45078f, 47.455086f);
generalPath.curveTo(27.135475f, 48.994766f, 20.578812f, 48.994766f, 15.263508f, 47.455086f);
generalPath.curveTo(9.948204f, 45.9154f, 6.6868153f, 43.071407f, 6.714287f, 40.0f);
generalPath.curveTo(6.6868153f, 36.928593f, 9.948204f, 34.0846f, 15.263508f, 32.544914f);
generalPath.curveTo(20.578812f, 31.005232f, 27.135475f, 31.005232f, 32.45078f, 32.544914f);
generalPath.curveTo(37.766083f, 34.0846f, 41.027473f, 36.928593f, 41.0f, 40.0f);
generalPath.closePath();
shape = generalPath;
paint = new RadialGradientPaint(new Point2D.Double(23.85714340209961, 40.0), 17.142857f, new Point2D.Double(23.85714340209961, 40.0), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.5f, 1.8930479945655602E-14f, 20.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.9204879999160767f, 0.0f, 0.0f, 0.9204879999160767f, 2.3685319423675537f, 0.9740800261497498f));
// _0_1_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(46.857143f, 23.928572f);
generalPath.curveTo(46.894573f, 32.29816f, 42.45093f, 40.048042f, 35.208828f, 44.24368f);
generalPath.curveTo(27.966728f, 48.439316f, 19.033272f, 48.439316f, 11.79117f, 44.24368f);
generalPath.curveTo(4.549069f, 40.048042f, 0.10542657f, 32.29816f, 0.1428566f, 23.928572f);
generalPath.curveTo(0.10542657f, 15.558984f, 4.549069f, 7.8091016f, 11.79117f, 3.6134653f);
generalPath.curveTo(19.033272f, -0.5821709f, 27.966728f, -0.5821709f, 35.208828f, 3.6134653f);
generalPath.curveTo(42.45093f, 7.8091016f, 46.894573f, 15.558984f, 46.857143f, 23.928572f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.91797637939453, 66.2880630493164), new Point2D.Double(19.071495056152344, 5.541010856628418), new float[] {0.0f,1.0f}, new Color[] {new Color(164, 0, 0, 255),new Color(255, 23, 23, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(178, 0, 0, 255);
stroke = new BasicStroke(1.08638f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(46.857143f, 23.928572f);
generalPath.curveTo(46.894573f, 32.29816f, 42.45093f, 40.048042f, 35.208828f, 44.24368f);
generalPath.curveTo(27.966728f, 48.439316f, 19.033272f, 48.439316f, 11.79117f, 44.24368f);
generalPath.curveTo(4.549069f, 40.048042f, 0.10542657f, 32.29816f, 0.1428566f, 23.928572f);
generalPath.curveTo(0.10542657f, 15.558984f, 4.549069f, 7.8091016f, 11.79117f, 3.6134653f);
generalPath.curveTo(19.033272f, -0.5821709f, 27.966728f, -0.5821709f, 35.208828f, 3.6134653f);
generalPath.curveTo(42.45093f, 7.8091016f, 46.894573f, 15.558984f, 46.857143f, 23.928572f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.34659088f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.8560929894447327f, 0.0f, 0.0f, 0.8560929894447327f, 1.818274974822998f, 0.19776900112628937f));
// _0_1_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.901535f, 26.635273f);
generalPath.curveTo(49.93998f, 35.232037f, 45.375725f, 43.192272f, 37.937054f, 47.50179f);
generalPath.curveTo(30.49838f, 51.811306f, 21.322443f, 51.811306f, 13.883771f, 47.50179f);
generalPath.curveTo(6.445098f, 43.192272f, 1.8808427f, 35.232037f, 1.9192886f, 26.635273f);
generalPath.curveTo(1.8808427f, 18.038511f, 6.445098f, 10.078274f, 13.883771f, 5.7687564f);
generalPath.curveTo(21.322443f, 1.4592386f, 30.49838f, 1.4592386f, 37.937054f, 5.7687564f);
generalPath.curveTo(45.375725f, 10.078274f, 49.93998f, 18.038511f, 49.901535f, 26.635273f);
generalPath.closePath();
shape = generalPath;
paint = new Color(204, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(43.93581008911133, 53.83598327636719), new Point2D.Double(20.064685821533203, -8.562670707702637), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 230, 155, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.1680961f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.901535f, 26.635273f);
generalPath.curveTo(49.93998f, 35.232037f, 45.375725f, 43.192272f, 37.937054f, 47.50179f);
generalPath.curveTo(30.49838f, 51.811306f, 21.322443f, 51.811306f, 13.883771f, 47.50179f);
generalPath.curveTo(6.445098f, 43.192272f, 1.8808427f, 35.232037f, 1.9192886f, 26.635273f);
generalPath.curveTo(1.8808427f, 18.038511f, 6.445098f, 10.078274f, 13.883771f, 5.7687564f);
generalPath.curveTo(21.322443f, 1.4592386f, 30.49838f, 1.4592386f, 37.937054f, 5.7687564f);
generalPath.curveTo(45.375725f, 10.078274f, 49.93998f, 18.038511f, 49.901535f, 26.635273f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0058759450912476f, 0.0f, 0.0f, 1.1152009963989258f, -0.13804499804973602f, -2.3727080821990967f));
// _0_2_0
shape = new Rectangle2D.Double(10.078821182250977, 19.164932250976562, 27.836435317993164, 7.1735944747924805);
paint = new Color(239, 239, 239, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0029939413070679f, 0.0f, 0.0f, 1.0029939413070679f, -0.07185874134302139f, 0.019683560356497765f));
// _0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.370686f, 21.715487f);
generalPath.curveTo(43.370686f, 32.5461f, 33.016357f, 15.449178f, 24.695948f, 22.101873f);
generalPath.curveTo(16.569626f, 28.599384f, 4.098984f, 34.292423f, 4.098984f, 23.461805f);
generalPath.curveTo(4.098984f, 12.377753f, 12.79438f, 2.094803f, 23.625f, 2.094803f);
generalPath.curveTo(34.45562f, 2.094803f, 43.370686f, 10.884868f, 43.370686f, 21.715487f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.993772506713867, 33.955299377441406), new Point2D.Double(20.917078018188477, 15.81460189819336), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 254, 255, 85),new Color(255, 254, 255, 55)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
        return 1.9647797346115112;
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
		return 44.07044219970703;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 48.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private dialog_error() {
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
       dialog_error base = new dialog_error();
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
       dialog_error base = new dialog_error();
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
        return dialog_error::new;
    }
}

