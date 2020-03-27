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
public class ext_pps implements ResizableIcon {
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.699999);
generalPath.lineTo(72.0, 99.299995);
generalPath.lineTo(0.0, 99.299995);
generalPath.lineTo(0.0, 0.8);
generalPath.lineTo(45.0, 0.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 95.30000305175781), new Point2D.Double(36.0, -3.200000047683716), new float[] {0.0f,0.032f,0.162f,0.305f,0.468f,0.666f,1.0f}, new Color[] {new Color(203, 85, 40, 255),new Color(207, 91, 39, 255),new Color(219, 112, 38, 255),new Color(230, 128, 37, 255),new Color(238, 140, 35, 255),new Color(244, 147, 34, 255),new Color(246, 150, 34, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.699999);
generalPath.lineTo(72.0, 99.299995);
generalPath.lineTo(0.0, 99.299995);
generalPath.lineTo(0.0, 0.8);
generalPath.lineTo(45.0, 0.8);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.699999);
generalPath.lineTo(72.0, 99.299995);
generalPath.lineTo(0.0, 99.299995);
generalPath.lineTo(0.0, 0.8);
generalPath.lineTo(45.0, 0.8);
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
generalPath.moveTo(56.5, 32.0);
generalPath.curveTo(56.5, 34.3, 56.0, 36.4, 55.1, 38.0);
generalPath.curveTo(54.1, 39.7, 52.8, 41.1, 51.1, 42.1);
generalPath.curveTo(49.3, 43.199997, 47.3, 44.0, 45.1, 44.5);
generalPath.curveTo(42.8, 45.0, 40.3, 45.2, 37.5, 45.2);
generalPath.lineTo(34.0, 45.2);
generalPath.lineTo(34.0, 56.800003);
generalPath.curveTo(34.0, 57.500004, 34.1, 58.100002, 34.4, 58.600002);
generalPath.curveTo(34.700005, 59.100002, 35.2, 59.500004, 35.9, 59.800003);
generalPath.curveTo(36.300003, 60.000004, 36.9, 60.100002, 37.800003, 60.300003);
generalPath.curveTo(38.700005, 60.500004, 39.4, 60.600002, 40.000004, 60.700005);
generalPath.lineTo(40.000004, 63.0);
generalPath.lineTo(17.5, 63.0);
generalPath.lineTo(17.5, 60.7);
generalPath.curveTo(18.1, 60.600002, 18.8, 60.600002, 19.8, 60.5);
generalPath.curveTo(20.699999, 60.4, 21.4, 60.3, 21.8, 60.1);
generalPath.curveTo(22.599998, 59.8, 23.099998, 59.399998, 23.3, 59.0);
generalPath.curveTo(23.5, 58.600002, 23.699999, 57.9, 23.699999, 57.1);
generalPath.lineTo(23.699999, 27.9);
generalPath.curveTo(23.699999, 27.199999, 23.599998, 26.6, 23.3, 26.1);
generalPath.curveTo(23.099998, 25.6, 22.599998, 25.2, 21.8, 24.9);
generalPath.curveTo(21.3, 24.699999, 20.5, 24.5, 19.599998, 24.3);
generalPath.curveTo(18.699999, 24.099998, 17.999998, 24.0, 17.599998, 23.9);
generalPath.lineTo(17.599998, 21.6);
generalPath.lineTo(40.5, 21.6);
generalPath.curveTo(45.9, 21.6, 49.9, 22.5, 52.5, 24.2);
generalPath.curveTo(55.1, 25.900002, 56.5, 28.5, 56.5, 32.0);
generalPath.closePath();
generalPath.moveTo(45.0, 33.5);
generalPath.curveTo(45.0, 30.4, 44.4, 28.1, 43.1, 26.5);
generalPath.curveTo(41.8, 25.0, 39.6, 24.2, 36.399998, 24.2);
generalPath.lineTo(34.0, 24.2);
generalPath.lineTo(34.0, 42.300003);
generalPath.lineTo(35.2, 42.300003);
generalPath.curveTo(38.4, 42.300003, 40.8, 41.600002, 42.5, 40.100002);
generalPath.curveTo(44.2, 38.800003, 45.0, 36.600002, 45.0, 33.500004);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(12.838000297546387, 54.262001037597656), new Point2D.Double(49.83300018310547, 17.267000198364258), new float[] {0.005f,0.418f,0.679f,0.897f,1.0f}, new Color[] {new Color(214, 91, 37, 255),new Color(211, 90, 37, 255),new Color(202, 86, 36, 255),new Color(188, 79, 34, 255),new Color(179, 75, 33, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.699999);
generalPath.lineTo(45.0, 27.699999);
generalPath.lineTo(45.0, 0.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.06999969482422, 23.68000030517578), new Point2D.Double(58.56999969482422, 10.180000305175781), new float[] {0.0f,0.383f,0.521f,0.62f,0.699f,0.767f,0.828f,0.882f,0.933f,0.977f,1.0f}, new Color[] {new Color(255, 252, 227, 255),new Color(255, 250, 224, 255),new Color(253, 243, 216, 255),new Color(251, 235, 204, 255),new Color(248, 223, 187, 255),new Color(245, 208, 166, 255),new Color(241, 191, 141, 255),new Color(236, 170, 114, 255),new Color(231, 147, 84, 255),new Color(226, 124, 52, 255),new Color(223, 111, 38, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.699999);
generalPath.lineTo(45.0, 27.699999);
generalPath.lineTo(45.0, 0.8);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.699999);
generalPath.lineTo(45.0, 27.699999);
generalPath.lineTo(45.0, 0.8);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(9.7, 91.3);
generalPath.lineTo(9.7, 71.5);
generalPath.lineTo(16.2, 71.5);
generalPath.curveTo(18.7, 71.5, 20.300001, 71.6, 21.0, 71.8);
generalPath.curveTo(22.1, 72.100006, 23.1, 72.700005, 23.9, 73.700005);
generalPath.curveTo(24.699999, 74.700005, 25.1, 76.00001, 25.1, 77.600006);
generalPath.curveTo(25.1, 78.8, 24.9, 79.8, 24.4, 80.700005);
generalPath.curveTo(24.0, 81.50001, 23.4, 82.200005, 22.699999, 82.700005);
generalPath.curveTo(21.999998, 83.200005, 21.3, 83.50001, 20.599998, 83.600006);
generalPath.curveTo(19.599998, 83.8, 18.199999, 83.90001, 16.399998, 83.90001);
generalPath.lineTo(13.799997, 83.90001);
generalPath.lineTo(13.799997, 91.40001);
generalPath.lineTo(9.7, 91.40001);
generalPath.closePath();
generalPath.moveTo(13.7, 74.8);
generalPath.lineTo(13.7, 80.4);
generalPath.lineTo(15.9, 80.4);
generalPath.curveTo(17.5, 80.4, 18.6, 80.3, 19.1, 80.1);
generalPath.curveTo(19.6, 79.9, 20.1, 79.6, 20.4, 79.1);
generalPath.curveTo(20.699999, 78.7, 20.9, 78.1, 20.9, 77.6);
generalPath.curveTo(20.9, 76.9, 20.699999, 76.299995, 20.3, 75.799995);
generalPath.curveTo(19.9, 75.299995, 19.3, 74.99999, 18.699999, 74.899994);
generalPath.curveTo(18.199999, 74.799995, 17.3, 74.799995, 15.799999, 74.799995);
generalPath.lineTo(13.699999, 74.799995);
generalPath.closePath();
generalPath.moveTo(28.3, 91.3);
generalPath.lineTo(28.3, 71.5);
generalPath.lineTo(34.8, 71.5);
generalPath.curveTo(37.3, 71.5, 38.899998, 71.6, 39.6, 71.8);
generalPath.curveTo(40.699997, 72.100006, 41.699997, 72.700005, 42.5, 73.700005);
generalPath.curveTo(43.3, 74.700005, 43.7, 76.00001, 43.7, 77.600006);
generalPath.curveTo(43.7, 78.8, 43.5, 79.8, 43.0, 80.700005);
generalPath.curveTo(42.5, 81.600006, 42.0, 82.200005, 41.3, 82.700005);
generalPath.curveTo(40.6, 83.200005, 39.899998, 83.50001, 39.2, 83.600006);
generalPath.curveTo(38.2, 83.8, 36.8, 83.90001, 35.0, 83.90001);
generalPath.lineTo(32.4, 83.90001);
generalPath.lineTo(32.4, 91.40001);
generalPath.lineTo(28.300001, 91.40001);
generalPath.closePath();
generalPath.moveTo(32.3, 74.8);
generalPath.lineTo(32.3, 80.4);
generalPath.lineTo(34.5, 80.4);
generalPath.curveTo(36.1, 80.4, 37.2, 80.3, 37.7, 80.1);
generalPath.curveTo(38.2, 79.9, 38.7, 79.6, 39.0, 79.1);
generalPath.curveTo(39.3, 78.7, 39.5, 78.1, 39.5, 77.6);
generalPath.curveTo(39.5, 76.9, 39.3, 76.299995, 38.9, 75.799995);
generalPath.curveTo(38.5, 75.299995, 37.9, 74.99999, 37.300003, 74.899994);
generalPath.curveTo(36.800003, 74.799995, 35.9, 74.799995, 34.4, 74.799995);
generalPath.lineTo(32.300003, 74.799995);
generalPath.closePath();
generalPath.moveTo(45.9, 84.8);
generalPath.lineTo(49.800003, 84.4);
generalPath.curveTo(50.000004, 85.700005, 50.500004, 86.700005, 51.200005, 87.3);
generalPath.curveTo(51.900005, 87.9, 52.900005, 88.200005, 54.100006, 88.200005);
generalPath.curveTo(55.400005, 88.200005, 56.400005, 87.9, 57.000008, 87.4);
generalPath.curveTo(57.70001, 86.9, 58.000008, 86.200005, 58.000008, 85.5);
generalPath.curveTo(58.000008, 85.0, 57.90001, 84.6, 57.600006, 84.3);
generalPath.curveTo(57.300003, 84.00001, 56.800007, 83.700005, 56.100006, 83.4);
generalPath.curveTo(55.600006, 83.200005, 54.600006, 82.9, 52.900005, 82.5);
generalPath.curveTo(50.700005, 82.0, 49.200005, 81.3, 48.300007, 80.5);
generalPath.curveTo(47.100006, 79.4, 46.500008, 78.1, 46.500008, 76.5);
generalPath.curveTo(46.500008, 75.5, 46.800007, 74.5, 47.40001, 73.7);
generalPath.curveTo(48.000008, 72.799995, 48.80001, 72.2, 49.90001, 71.7);
generalPath.curveTo(51.000008, 71.2, 52.30001, 71.0, 53.80001, 71.0);
generalPath.curveTo(56.30001, 71.0, 58.200012, 71.5, 59.50001, 72.6);
generalPath.curveTo(60.80001, 73.7, 61.400013, 75.1, 61.50001, 77.0);
generalPath.lineTo(57.50001, 77.2);
generalPath.curveTo(57.30001, 76.2, 57.00001, 75.399994, 56.400013, 75.0);
generalPath.curveTo(55.800014, 74.600006, 55.00001, 74.3, 53.800014, 74.3);
generalPath.curveTo(52.600014, 74.3, 51.700016, 74.5, 51.000015, 75.0);
generalPath.curveTo(50.600014, 75.3, 50.400017, 75.7, 50.400017, 76.2);
generalPath.curveTo(50.400017, 76.7, 50.600018, 77.1, 51.000015, 77.399994);
generalPath.curveTo(51.500015, 77.799995, 52.700016, 78.299995, 54.700016, 78.7);
generalPath.curveTo(56.700016, 79.2, 58.100018, 79.6, 59.100018, 80.1);
generalPath.curveTo(60.00002, 80.6, 60.80002, 81.299995, 61.30002, 82.1);
generalPath.curveTo(61.80002, 82.9, 62.100018, 84.0, 62.100018, 85.299995);
generalPath.curveTo(62.100018, 86.399994, 61.80002, 87.49999, 61.100018, 88.49999);
generalPath.curveTo(60.50002, 89.49999, 59.600018, 90.19999, 58.400017, 90.69999);
generalPath.curveTo(57.200016, 91.19999, 55.80002, 91.39999, 54.100018, 91.39999);
generalPath.curveTo(51.600018, 91.39999, 49.600018, 90.79999, 48.30002, 89.69999);
generalPath.curveTo(47.00002, 88.79999, 46.20002, 87.09999, 45.900017, 84.79999);
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
	private ext_pps() {
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
       ext_pps base = new ext_pps();
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
       ext_pps base = new ext_pps();
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
        return ext_pps::new;
    }
}

