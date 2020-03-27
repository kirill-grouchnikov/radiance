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
public class ext_vss implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.005f,0.188f,0.566f,1.0f}, new Color[] {new Color(55, 83, 157, 255),new Color(74, 105, 191, 255),new Color(112, 136, 205, 255),new Color(168, 183, 225, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(0.0, 50.0), new Point2D.Double(72.0, 50.0), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 0),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(55, 83, 157, 255);
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
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 25.774999618530273), new Point2D.Double(58.57500076293945, 12.274999618530273), new float[] {0.005f,0.604f,1.0f}, new Color[] {new Color(223, 241, 250, 255),new Color(198, 208, 235, 255),new Color(55, 83, 157, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
paint = new Color(55, 83, 157, 255);
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
generalPath.moveTo(15.1, 91.1);
generalPath.lineTo(8.0, 71.2);
generalPath.lineTo(12.4, 71.2);
generalPath.lineTo(17.5, 85.899994);
generalPath.lineTo(22.4, 71.2);
generalPath.lineTo(26.7, 71.2);
generalPath.lineTo(19.5, 91.0);
generalPath.lineTo(15.1, 91.0);
generalPath.closePath();
generalPath.moveTo(27.7, 84.6);
generalPath.lineTo(31.6, 84.2);
generalPath.curveTo(31.800001, 85.5, 32.3, 86.5, 33.0, 87.1);
generalPath.curveTo(33.7, 87.7, 34.7, 88.0, 35.9, 88.0);
generalPath.curveTo(37.2, 88.0, 38.2, 87.7, 38.800003, 87.2);
generalPath.curveTo(39.500004, 86.7, 39.800003, 86.0, 39.800003, 85.299995);
generalPath.curveTo(39.800003, 84.799995, 39.700005, 84.399994, 39.4, 84.1);
generalPath.curveTo(39.1, 83.8, 38.600002, 83.5, 37.9, 83.2);
generalPath.curveTo(37.4, 83.0, 36.300003, 82.7, 34.7, 82.299995);
generalPath.curveTo(32.5, 81.799995, 31.0, 81.1, 30.1, 80.299995);
generalPath.curveTo(28.9, 79.2, 28.300001, 77.899994, 28.300001, 76.299995);
generalPath.curveTo(28.300001, 75.299995, 28.6, 74.299995, 29.2, 73.49999);
generalPath.curveTo(29.800001, 72.59999, 30.6, 71.99999, 31.7, 71.49999);
generalPath.curveTo(32.800003, 70.99999, 34.100002, 70.799995, 35.600002, 70.799995);
generalPath.curveTo(38.100002, 70.799995, 40.000004, 71.299995, 41.300003, 72.399994);
generalPath.curveTo(42.600002, 73.49999, 43.200005, 74.899994, 43.300003, 76.799995);
generalPath.lineTo(39.300003, 76.99999);
generalPath.curveTo(39.100002, 75.99999, 38.800003, 75.19999, 38.200005, 74.799995);
generalPath.curveTo(37.600006, 74.4, 36.800003, 74.1, 35.600006, 74.1);
generalPath.curveTo(34.400005, 74.1, 33.500008, 74.299995, 32.800007, 74.799995);
generalPath.curveTo(32.400005, 75.1, 32.20001, 75.49999, 32.20001, 75.99999);
generalPath.curveTo(32.20001, 76.49999, 32.40001, 76.899994, 32.800007, 77.19999);
generalPath.curveTo(33.300007, 77.59999, 34.600006, 78.09999, 36.500008, 78.49999);
generalPath.curveTo(38.40001, 78.899994, 39.90001, 79.399994, 40.90001, 79.899994);
generalPath.curveTo(41.80001, 80.399994, 42.60001, 81.09999, 43.10001, 81.899994);
generalPath.curveTo(43.60001, 82.7, 44.00001, 83.99999, 44.00001, 85.299995);
generalPath.curveTo(44.00001, 86.399994, 43.700012, 87.49999, 43.00001, 88.49999);
generalPath.curveTo(42.400013, 89.49999, 41.50001, 90.19999, 40.30001, 90.69999);
generalPath.curveTo(39.10001, 91.19999, 37.700012, 91.39999, 35.90001, 91.39999);
generalPath.curveTo(33.40001, 91.39999, 31.40001, 90.79999, 30.10001, 89.69999);
generalPath.curveTo(28.70001, 88.49999, 27.90001, 86.79999, 27.70001, 84.59999);
generalPath.closePath();
generalPath.moveTo(46.300003, 84.6);
generalPath.lineTo(50.200005, 84.2);
generalPath.curveTo(50.400005, 85.5, 50.900005, 86.5, 51.600006, 87.1);
generalPath.curveTo(52.300007, 87.7, 53.300007, 88.0, 54.500008, 88.0);
generalPath.curveTo(55.800007, 88.0, 56.800007, 87.7, 57.40001, 87.2);
generalPath.curveTo(58.10001, 86.7, 58.40001, 86.0, 58.40001, 85.299995);
generalPath.curveTo(58.40001, 84.799995, 58.30001, 84.399994, 58.000008, 84.1);
generalPath.curveTo(57.700005, 83.8, 57.20001, 83.5, 56.500008, 83.2);
generalPath.curveTo(56.000008, 83.0, 54.90001, 82.7, 53.300007, 82.299995);
generalPath.curveTo(51.100006, 81.799995, 49.600006, 81.1, 48.70001, 80.299995);
generalPath.curveTo(47.500008, 79.2, 46.90001, 77.899994, 46.90001, 76.299995);
generalPath.curveTo(46.90001, 75.299995, 47.20001, 74.299995, 47.80001, 73.49999);
generalPath.curveTo(48.40001, 72.59999, 49.200012, 71.99999, 50.30001, 71.49999);
generalPath.curveTo(51.40001, 70.99999, 52.700012, 70.799995, 54.200012, 70.799995);
generalPath.curveTo(56.700012, 70.799995, 58.600014, 71.299995, 59.900013, 72.399994);
generalPath.curveTo(61.200012, 73.49999, 61.800014, 74.899994, 61.900013, 76.799995);
generalPath.lineTo(57.900013, 76.99999);
generalPath.curveTo(57.700012, 75.99999, 57.400013, 75.19999, 56.800014, 74.799995);
generalPath.curveTo(56.200016, 74.4, 55.400013, 74.1, 54.200016, 74.1);
generalPath.curveTo(53.000015, 74.1, 52.100018, 74.299995, 51.400017, 74.799995);
generalPath.curveTo(51.000015, 75.1, 50.80002, 75.49999, 50.80002, 75.99999);
generalPath.curveTo(50.80002, 76.49999, 51.00002, 76.899994, 51.400017, 77.19999);
generalPath.curveTo(51.900017, 77.59999, 53.200016, 78.09999, 55.100018, 78.49999);
generalPath.curveTo(57.00002, 78.899994, 58.50002, 79.399994, 59.50002, 79.899994);
generalPath.curveTo(60.40002, 80.399994, 61.20002, 81.09999, 61.70002, 81.899994);
generalPath.curveTo(62.20002, 82.7, 62.50002, 83.799995, 62.50002, 85.09999);
generalPath.curveTo(62.50002, 86.19999, 62.20002, 87.29999, 61.50002, 88.29999);
generalPath.curveTo(60.90002, 89.29999, 60.00002, 89.999985, 58.80002, 90.499985);
generalPath.curveTo(57.600018, 90.999985, 56.20002, 91.19998, 54.400017, 91.19998);
generalPath.curveTo(51.900017, 91.19998, 49.900017, 90.59998, 48.600018, 89.499985);
generalPath.curveTo(47.400017, 88.499985, 46.600018, 86.79999, 46.30002, 84.59998);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
generalPath.moveTo(17.1, 32.3);
generalPath.lineTo(38.4, 28.199999);
generalPath.lineTo(38.4, 64.0);
generalPath.lineTo(17.100002, 60.1);
generalPath.closePath();
shape = generalPath;
paint = new Color(55, 83, 157, 255);
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
generalPath.moveTo(53.3, 60.5);
generalPath.lineTo(35.2, 60.5);
generalPath.curveTo(34.3, 60.5, 33.600002, 59.8, 33.600002, 58.9);
generalPath.lineTo(33.600002, 33.4);
generalPath.curveTo(33.600002, 32.5, 34.300003, 31.800001, 35.2, 31.800001);
generalPath.lineTo(53.300003, 31.800001);
generalPath.curveTo(54.200005, 31.800001, 54.9, 32.5, 54.9, 33.4);
generalPath.lineTo(54.9, 58.9);
generalPath.curveTo(54.9, 59.800003, 54.2, 60.5, 53.300003, 60.5);
generalPath.closePath();
generalPath.moveTo(35.2, 33.3);
generalPath.curveTo(35.100002, 33.3, 35.0, 33.399998, 35.0, 33.5);
generalPath.lineTo(35.0, 59.0);
generalPath.curveTo(35.0, 59.1, 35.1, 59.2, 35.2, 59.2);
generalPath.lineTo(53.300003, 59.2);
generalPath.curveTo(53.4, 59.2, 53.500004, 59.100002, 53.500004, 59.0);
generalPath.lineTo(53.500004, 33.4);
generalPath.curveTo(53.500004, 33.300003, 53.400005, 33.2, 53.300003, 33.2);
generalPath.lineTo(35.200005, 33.3);
generalPath.closePath();
shape = generalPath;
paint = new Color(55, 83, 157, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
paint = new Color(55, 83, 157, 255);
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.0, 49.0);
generalPath.lineTo(42.0, 49.0);
generalPath.lineTo(42.0, 55.0);
generalPath.lineTo(36.0, 55.0);
generalPath.closePath();
generalPath.moveTo(43.010002, 39.65);
generalPath.lineTo(46.617, 36.043003);
generalPath.lineTo(50.223, 39.65);
generalPath.lineTo(46.617, 43.256);
generalPath.closePath();
generalPath.moveTo(43.000004, 39.800003);
generalPath.lineTo(38.000004, 39.800003);
generalPath.moveTo(47.000004, 43.000004);
generalPath.lineTo(47.000004, 52.000004);
generalPath.moveTo(42.000004, 52.000004);
generalPath.lineTo(48.000004, 52.000004);
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.0, 41.2);
generalPath.lineTo(25.1, 41.2);
generalPath.lineTo(27.4, 48.100002);
generalPath.curveTo(27.6, 48.7, 27.8, 49.7, 27.8, 49.7);
generalPath.curveTo(27.8, 49.7, 28.0, 48.8, 28.199999, 48.100002);
generalPath.lineTo(30.599998, 41.2);
generalPath.lineTo(32.699997, 41.2);
generalPath.lineTo(28.799997, 51.800003);
generalPath.lineTo(26.899998, 51.800003);
generalPath.lineTo(23.0, 41.2);
generalPath.closePath();
shape = generalPath;
paint = new Color(168, 183, 225, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(168, 183, 225, 255);
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.0, 41.2);
generalPath.lineTo(25.1, 41.2);
generalPath.lineTo(27.4, 48.100002);
generalPath.curveTo(27.6, 48.7, 27.8, 49.7, 27.8, 49.7);
generalPath.curveTo(27.8, 49.7, 28.0, 48.8, 28.199999, 48.100002);
generalPath.lineTo(30.599998, 41.2);
generalPath.lineTo(32.699997, 41.2);
generalPath.lineTo(28.799997, 51.800003);
generalPath.lineTo(26.899998, 51.800003);
generalPath.lineTo(23.0, 41.2);
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
	private ext_vss() {
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
       ext_vss base = new ext_vss();
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
       ext_vss base = new ext_vss();
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
        return ext_vss::new;
    }
}

