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
public class ext_psd implements ResizableIcon {
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
generalPath.lineTo(72.399994, 27.9);
generalPath.lineTo(72.399994, 99.5);
generalPath.lineTo(-0.4, 99.5);
generalPath.lineTo(-0.4, 1.0);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0009994506836), new Point2D.Double(36.0, 2.5169999599456787), new float[] {0.0f,0.264f,0.412f,0.53f,0.633f,0.726f,0.812f,0.892f,0.966f,1.0f}, new Color[] {new Color(181, 216, 233, 255),new Color(178, 214, 232, 255),new Color(167, 208, 227, 255),new Color(150, 198, 220, 255),new Color(125, 184, 210, 255),new Color(93, 167, 197, 255),new Color(48, 148, 181, 255),new Color(0, 127, 163, 255),new Color(0, 106, 144, 255),new Color(0, 96, 134, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.lineTo(72.399994, 27.9);
generalPath.lineTo(72.399994, 99.5);
generalPath.lineTo(-0.4, 99.5);
generalPath.lineTo(-0.4, 1.0);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(54, 108, 129, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.399994, 27.9);
generalPath.lineTo(72.399994, 99.5);
generalPath.lineTo(-0.4, 99.5);
generalPath.lineTo(-0.4, 1.0);
generalPath.lineTo(45.1, 1.0);
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
generalPath.moveTo(9.0, 91.5);
generalPath.lineTo(9.0, 71.6);
generalPath.lineTo(15.6, 71.6);
generalPath.curveTo(18.1, 71.6, 19.7, 71.7, 20.5, 71.9);
generalPath.curveTo(21.7, 72.200005, 22.6, 72.9, 23.4, 73.9);
generalPath.curveTo(24.199999, 74.9, 24.6, 76.200005, 24.6, 77.8);
generalPath.curveTo(24.6, 79.0, 24.4, 80.100006, 23.9, 80.9);
generalPath.curveTo(23.4, 81.700005, 22.9, 82.4, 22.199999, 82.9);
generalPath.curveTo(21.499998, 83.4, 20.8, 83.700005, 20.099998, 83.8);
generalPath.curveTo(19.099998, 84.0, 17.699999, 84.100006, 15.899999, 84.100006);
generalPath.lineTo(13.199999, 84.100006);
generalPath.lineTo(13.199999, 91.600006);
generalPath.lineTo(9.0, 91.600006);
generalPath.closePath();
generalPath.moveTo(13.1, 74.9);
generalPath.lineTo(13.1, 80.6);
generalPath.lineTo(15.3, 80.6);
generalPath.curveTo(16.9, 80.6, 18.0, 80.5, 18.5, 80.299995);
generalPath.curveTo(19.0, 80.1, 19.5, 79.799995, 19.8, 79.299995);
generalPath.curveTo(20.099998, 78.799995, 20.3, 78.299995, 20.3, 77.7);
generalPath.curveTo(20.3, 77.0, 20.099998, 76.399994, 19.699999, 75.899994);
generalPath.curveTo(19.3, 75.399994, 18.699999, 75.09999, 18.099998, 74.99999);
generalPath.curveTo(17.599998, 74.899994, 16.599998, 74.899994, 15.199999, 74.899994);
generalPath.lineTo(13.099998, 74.899994);
generalPath.closePath();
generalPath.moveTo(26.8, 85.0);
generalPath.lineTo(30.8, 84.6);
generalPath.curveTo(31.0, 85.9, 31.5, 86.9, 32.3, 87.5);
generalPath.curveTo(33.0, 88.1, 34.0, 88.4, 35.3, 88.4);
generalPath.curveTo(36.6, 88.4, 37.6, 88.1, 38.3, 87.6);
generalPath.curveTo(39.0, 87.1, 39.3, 86.4, 39.3, 85.7);
generalPath.curveTo(39.3, 85.2, 39.2, 84.799995, 38.899998, 84.5);
generalPath.curveTo(38.599995, 84.200005, 38.1, 83.9, 37.399998, 83.6);
generalPath.curveTo(36.899998, 83.4, 35.8, 83.1, 34.1, 82.7);
generalPath.curveTo(31.899998, 82.2, 30.399998, 81.5, 29.499998, 80.7);
generalPath.curveTo(28.299997, 79.6, 27.599998, 78.299995, 27.599998, 76.7);
generalPath.curveTo(27.599998, 75.7, 27.899998, 74.7, 28.499998, 73.899994);
generalPath.curveTo(29.099998, 72.99999, 29.899998, 72.299995, 30.999998, 71.899994);
generalPath.curveTo(32.1, 71.399994, 33.399998, 71.2, 35.0, 71.2);
generalPath.curveTo(37.5, 71.2, 39.5, 71.7, 40.7, 72.799995);
generalPath.curveTo(42.0, 73.899994, 42.7, 75.399994, 42.7, 77.2);
generalPath.lineTo(38.600002, 77.399994);
generalPath.curveTo(38.4, 76.399994, 38.100002, 75.59999, 37.500004, 75.2);
generalPath.curveTo(36.900005, 74.799995, 36.100002, 74.5, 34.900005, 74.5);
generalPath.curveTo(33.700005, 74.5, 32.800007, 74.7, 32.100006, 75.2);
generalPath.curveTo(31.700006, 75.5, 31.500006, 75.899994, 31.500006, 76.399994);
generalPath.curveTo(31.500006, 76.899994, 31.700006, 77.299995, 32.100006, 77.59999);
generalPath.curveTo(32.600006, 77.99999, 33.900005, 78.49999, 35.900005, 78.899994);
generalPath.curveTo(37.900005, 79.399994, 39.400005, 79.799995, 40.300007, 80.299995);
generalPath.curveTo(41.300007, 80.799995, 42.000008, 81.49999, 42.500008, 82.299995);
generalPath.curveTo(43.000008, 83.2, 43.300007, 84.2, 43.300007, 85.49999);
generalPath.curveTo(43.300007, 86.59999, 43.000008, 87.69999, 42.300007, 88.69999);
generalPath.curveTo(41.600006, 89.69999, 40.70001, 90.39999, 39.600006, 90.89999);
generalPath.curveTo(38.400005, 91.39999, 37.000008, 91.59998, 35.200005, 91.59998);
generalPath.curveTo(32.600006, 91.59998, 30.700005, 90.999985, 29.300005, 89.89999);
generalPath.curveTo(27.900005, 88.999985, 27.100004, 87.29999, 26.800005, 84.999985);
generalPath.closePath();
generalPath.moveTo(46.699997, 71.6);
generalPath.lineTo(54.199997, 71.6);
generalPath.curveTo(55.899998, 71.6, 57.199997, 71.7, 58.1, 72.0);
generalPath.curveTo(59.3, 72.3, 60.3, 73.0, 61.199997, 73.8);
generalPath.curveTo(61.999996, 74.700005, 62.699997, 75.8, 63.1, 77.0);
generalPath.curveTo(63.5, 78.3, 63.8, 79.8, 63.8, 81.7);
generalPath.curveTo(63.8, 83.299995, 63.6, 84.799995, 63.2, 85.899994);
generalPath.curveTo(62.7, 87.399994, 62.0, 88.49999, 61.0, 89.399994);
generalPath.curveTo(60.3, 90.09999, 59.3, 90.59999, 58.1, 90.99999);
generalPath.curveTo(57.199997, 91.299995, 56.0, 91.399994, 54.5, 91.399994);
generalPath.lineTo(46.8, 91.399994);
generalPath.lineTo(46.8, 71.6);
generalPath.closePath();
generalPath.moveTo(50.799995, 74.9);
generalPath.lineTo(50.799995, 88.1);
generalPath.lineTo(53.899994, 88.1);
generalPath.curveTo(54.999992, 88.1, 55.899994, 88.0, 56.399994, 87.9);
generalPath.curveTo(57.099995, 87.700005, 57.599995, 87.5, 58.099995, 87.1);
generalPath.curveTo(58.499996, 86.7, 58.899994, 86.1, 59.199993, 85.2);
generalPath.curveTo(59.499992, 84.299995, 59.599995, 83.1, 59.599995, 81.5);
generalPath.curveTo(59.599995, 80.0, 59.499996, 78.8, 59.199993, 78.0);
generalPath.curveTo(58.89999, 77.2, 58.499992, 76.5, 57.999992, 76.1);
generalPath.curveTo(57.499992, 75.6, 56.899994, 75.299995, 56.09999, 75.2);
generalPath.curveTo(55.499992, 75.1, 54.39999, 75.0, 52.69999, 75.0);
generalPath.lineTo(50.799988, 75.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.399994, 27.9);
generalPath.lineTo(45.1, 27.9);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.19900131225586, 74.03600311279297), new Point2D.Double(58.84000015258789, 87.677001953125), new float[] {0.0f,0.357f,0.494f,0.593f,0.673f,0.743f,0.805f,0.861f,0.913f,0.959f,1.0f}, new Color[] {new Color(235, 243, 248, 255),new Color(232, 242, 247, 255),new Color(223, 237, 244, 255),new Color(208, 229, 240, 255),new Color(187, 218, 233, 255),new Color(160, 204, 225, 255),new Color(127, 188, 216, 255),new Color(87, 171, 204, 255),new Color(11, 153, 191, 255),new Color(0, 135, 177, 255),new Color(0, 118, 163, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.399994, 27.9);
generalPath.lineTo(45.1, 27.9);
generalPath.lineTo(45.1, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(52, 106, 128, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.399994, 27.9);
generalPath.lineTo(45.1, 27.9);
generalPath.lineTo(45.1, 1.0);
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
generalPath.moveTo(48.9, 58.2);
generalPath.curveTo(49.7, 58.600002, 48.300003, 58.600002, 48.9, 58.2);
generalPath.closePath();
generalPath.moveTo(50.300003, 61.100002);
generalPath.curveTo(51.4, 63.500004, 52.9, 65.4, 54.000004, 67.8);
generalPath.curveTo(54.800003, 66.9, 52.600002, 65.8, 53.300003, 64.4);
generalPath.curveTo(52.300003, 63.600002, 52.300003, 60.7, 50.300003, 61.100002);
generalPath.closePath();
generalPath.moveTo(31.7, 34.5);
generalPath.curveTo(30.1, 36.0, 27.0, 36.7, 24.1, 36.5);
generalPath.curveTo(24.0, 37.2, 24.7, 37.5, 25.1, 38.0);
generalPath.curveTo(27.800001, 41.4, 30.7, 45.5, 33.3, 49.0);
generalPath.curveTo(37.8, 48.7, 40.2, 50.6, 43.0, 51.9);
generalPath.curveTo(40.7, 51.300003, 37.7, 49.9, 34.1, 50.100002);
generalPath.curveTo(35.6, 51.7, 36.3, 53.800003, 38.199997, 55.2);
generalPath.curveTo(40.399998, 56.8, 43.799995, 55.9, 46.899998, 56.8);
generalPath.curveTo(47.499996, 56.899998, 47.499996, 57.7, 47.999996, 57.8);
generalPath.curveTo(48.499996, 57.6, 47.799995, 56.899998, 47.499996, 56.5);
generalPath.curveTo(38.299995, 41.9, 28.899996, 25.9, 16.199997, 14.5);
generalPath.curveTo(30.899998, 24.6, 38.899998, 41.3, 48.6, 56.3);
generalPath.curveTo(48.699997, 54.8, 49.5, 53.2, 49.399998, 51.6);
generalPath.curveTo(49.3, 50.1, 48.499996, 48.8, 47.8, 47.5);
generalPath.curveTo(47.1, 46.2, 46.5, 44.8, 45.5, 44.1);
generalPath.curveTo(45.4, 46.5, 45.7, 48.5, 46.2, 50.3);
generalPath.curveTo(45.2, 48.3, 44.100002, 45.5, 44.9, 42.6);
generalPath.curveTo(40.2, 35.6, 35.4, 27.599998, 29.7, 21.8);
generalPath.curveTo(29.900002, 23.3, 30.300001, 24.599998, 30.2, 26.4);
generalPath.curveTo(29.5, 24.8, 29.5, 22.6, 28.900002, 20.9);
generalPath.curveTo(26.500002, 18.5, 23.800001, 16.5, 21.000002, 14.5);
generalPath.curveTo(20.600002, 15.0, 20.700003, 15.9, 20.500002, 16.6);
generalPath.curveTo(20.200003, 15.8, 20.200003, 14.700001, 20.000002, 13.8);
generalPath.curveTo(18.400002, 12.900001, 16.700003, 12.0, 14.700002, 11.200001);
generalPath.curveTo(12.900002, 10.500001, 10.900002, 9.200001, 8.600002, 10.1);
generalPath.curveTo(8.500002, 11.700001, 9.100002, 12.6, 9.300002, 14.0);
generalPath.curveTo(10.4000025, 15.1, 12.300002, 15.3, 14.600002, 15.1);
generalPath.curveTo(13.300002, 15.6, 11.200003, 15.5, 10.000002, 14.900001);
generalPath.curveTo(10.200002, 17.0, 11.500002, 18.7, 12.400002, 20.400002);
generalPath.curveTo(15.300001, 25.500002, 18.800001, 30.400002, 22.600002, 34.800003);
generalPath.curveTo(25.500002, 35.800003, 29.300003, 35.600002, 31.700003, 34.500004);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(517.302978515625, 63.152000427246094), new Point2D.Double(562.9299926757812, 63.152000427246094), new float[] {0.0f,0.188f,0.377f,0.567f,0.758f,0.947f,1.0f}, new Color[] {new Color(68, 158, 192, 255),new Color(62, 156, 189, 255),new Color(40, 148, 183, 255),new Color(0, 137, 173, 255),new Color(0, 122, 159, 255),new Color(0, 104, 143, 255),new Color(0, 99, 138, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, 571.6480102539062f, 102.0f));
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
        return 0.12599998712539673;
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
		return 0.7479999661445618;
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
	private ext_psd() {
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
       ext_psd base = new ext_psd();
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
       ext_psd base = new ext_psd();
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
        return ext_psd::new;
    }
}

