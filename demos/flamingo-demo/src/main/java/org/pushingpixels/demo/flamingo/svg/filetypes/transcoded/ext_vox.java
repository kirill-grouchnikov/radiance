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
public class ext_vox implements ResizableIcon {
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
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(72.3, 99.1);
generalPath.lineTo(0.0, 99.1);
generalPath.lineTo(0.0, 0.9);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.150001525878906, 2.88700008392334), new Point2D.Double(36.150001525878906, 101.1259994506836), new float[] {0.0f,0.012f,0.182f,0.352f,0.521f,0.687f,0.848f,1.0f}, new Color[] {new Color(89, 85, 147, 255),new Color(91, 87, 148, 255),new Color(123, 119, 170, 255),new Color(152, 150, 191, 255),new Color(178, 178, 210, 255),new Color(199, 201, 226, 255),new Color(214, 217, 236, 255),new Color(219, 223, 240, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(72.3, 99.1);
generalPath.lineTo(0.0, 99.1);
generalPath.lineTo(0.0, 0.9);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(72.3, 99.1);
generalPath.lineTo(0.0, 99.1);
generalPath.lineTo(0.0, 0.9);
generalPath.lineTo(45.2, 0.9);
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
generalPath.moveTo(13.8, 91.2);
generalPath.lineTo(6.6, 71.3);
generalPath.lineTo(11.0, 71.3);
generalPath.lineTo(16.1, 86.0);
generalPath.lineTo(21.0, 71.3);
generalPath.lineTo(25.3, 71.3);
generalPath.lineTo(18.099998, 91.200005);
generalPath.lineTo(13.799998, 91.200005);
generalPath.closePath();
generalPath.moveTo(26.6, 81.299995);
generalPath.curveTo(26.6, 79.299995, 26.9, 77.6, 27.5, 76.2);
generalPath.curveTo(28.0, 75.2, 28.6, 74.299995, 29.4, 73.5);
generalPath.curveTo(30.199999, 72.700005, 31.1, 72.1, 32.0, 71.7);
generalPath.curveTo(33.3, 71.2, 34.7, 70.899994, 36.3, 70.899994);
generalPath.curveTo(39.3, 70.899994, 41.6, 71.799995, 43.399998, 73.59999);
generalPath.curveTo(45.199997, 75.399994, 46.1, 77.899994, 46.1, 81.19999);
generalPath.curveTo(46.1, 84.39999, 45.199997, 86.89999, 43.5, 88.69999);
generalPath.curveTo(41.800003, 90.49999, 39.4, 91.39999, 36.4, 91.39999);
generalPath.curveTo(33.4, 91.39999, 31.000002, 90.499985, 29.300001, 88.69999);
generalPath.curveTo(27.500002, 86.99999, 26.6, 84.49999, 26.6, 81.29999);
generalPath.closePath();
generalPath.moveTo(30.8, 81.2);
generalPath.curveTo(30.8, 83.5, 31.3, 85.2, 32.399998, 86.299995);
generalPath.curveTo(33.499996, 87.49999, 34.8, 87.99999, 36.399998, 87.99999);
generalPath.curveTo(37.999996, 87.99999, 39.3, 87.399994, 40.399998, 86.299995);
generalPath.curveTo(41.499996, 85.2, 41.999996, 83.399994, 41.999996, 81.1);
generalPath.curveTo(41.999996, 78.799995, 41.499996, 77.1, 40.499996, 76.0);
generalPath.curveTo(39.499996, 74.9, 38.099995, 74.3, 36.499996, 74.3);
generalPath.curveTo(34.899998, 74.3, 33.499996, 74.9, 32.499996, 76.0);
generalPath.curveTo(31.499996, 77.1, 30.799995, 78.9, 30.799995, 81.2);
generalPath.closePath();
generalPath.moveTo(47.199997, 91.2);
generalPath.lineTo(54.1, 80.799995);
generalPath.lineTo(47.899998, 71.299995);
generalPath.lineTo(52.6, 71.299995);
generalPath.lineTo(56.6, 77.7);
generalPath.lineTo(60.6, 71.299995);
generalPath.lineTo(65.299995, 71.299995);
generalPath.lineTo(59.0, 81.0);
generalPath.lineTo(65.9, 91.2);
generalPath.lineTo(61.0, 91.2);
generalPath.lineTo(56.5, 84.299995);
generalPath.lineTo(52.0, 91.2);
generalPath.lineTo(47.2, 91.2);
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
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(45.2, 27.699999);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(58.32099914550781, 87.27300262451172), new Point2D.Double(50.78300094604492, 78.83899688720703), new float[] {0.0f,0.07f,0.159f,0.255f,0.359f,0.471f,0.598f,0.751f,1.0f}, new Color[] {new Color(89, 85, 147, 255),new Color(112, 108, 162, 255),new Color(137, 136, 181, 255),new Color(163, 165, 200, 255),new Color(186, 191, 217, 255),new Color(206, 213, 231, 255),new Color(222, 230, 242, 255),new Color(233, 243, 250, 255),new Color(236, 248, 254, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(45.2, 27.699999);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2, 0.9);
generalPath.lineTo(72.3, 27.699999);
generalPath.lineTo(45.2, 27.699999);
generalPath.lineTo(45.2, 0.9);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.6, 37.8);
generalPath.lineTo(41.0, 42.7);
generalPath.lineTo(41.0, 25.5);
generalPath.lineTo(33.6, 30.4);
generalPath.lineTo(33.6, 27.9);
generalPath.curveTo(33.6, 26.5, 32.5, 25.4, 31.099998, 25.4);
generalPath.lineTo(16.3, 25.4);
generalPath.curveTo(14.9, 25.4, 13.799999, 26.5, 13.799999, 27.9);
generalPath.lineTo(13.799999, 40.2);
generalPath.curveTo(13.799999, 41.600002, 14.9, 42.7, 16.3, 42.7);
generalPath.lineTo(31.099998, 42.7);
generalPath.curveTo(32.5, 42.7, 33.6, 41.600002, 33.6, 40.2);
generalPath.lineTo(33.6, 37.8);
generalPath.closePath();
generalPath.moveTo(45.0, 42.3);
generalPath.lineTo(45.0, 49.7);
generalPath.curveTo(45.0, 52.4, 47.2, 54.600002, 49.9, 54.600002);
generalPath.curveTo(52.600002, 54.600002, 54.800003, 52.4, 54.800003, 49.7);
generalPath.lineTo(54.800003, 42.3);
generalPath.curveTo(54.800003, 39.6, 52.600002, 37.399998, 49.9, 37.399998);
generalPath.curveTo(47.2, 37.399998, 45.0, 39.6, 45.0, 42.3);
generalPath.closePath();
generalPath.moveTo(57.3, 49.7);
generalPath.curveTo(57.3, 53.8, 54.0, 57.100002, 49.899998, 57.100002);
generalPath.curveTo(45.799995, 57.100002, 42.499996, 53.800003, 42.499996, 49.7);
generalPath.lineTo(40.0, 49.7);
generalPath.curveTo(40.0, 54.3, 43.2, 58.1, 47.4, 59.2);
generalPath.lineTo(47.4, 64.5);
generalPath.lineTo(52.300003, 64.5);
generalPath.lineTo(52.300003, 59.2);
generalPath.curveTo(56.600002, 58.100002, 59.700005, 54.3, 59.700005, 49.7);
generalPath.lineTo(57.300003, 49.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.81700134277344, 25.461999893188477), new Point2D.Double(36.81700134277344, 64.53800201416016), new float[] {0.0f,0.074f,0.533f,0.658f,0.783f,0.896f,1.0f}, new Color[] {new Color(53, 44, 127, 255),new Color(62, 55, 134, 255),new Color(84, 79, 150, 255),new Color(103, 99, 165, 255),new Color(117, 114, 177, 255),new Color(126, 124, 186, 255),new Color(129, 128, 189, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
		return 0.7430000305175781;
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
	private ext_vox() {
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
       ext_vox base = new ext_vox();
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
       ext_vox base = new ext_vox();
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
        return ext_vox::new;
    }
}

