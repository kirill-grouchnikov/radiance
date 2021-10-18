package org.pushingpixels.radiance.demo.laf.main.check.svg.filetypes;

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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_svg implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
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
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0), new Point2D.Double(36.0, 3.003999948501587), new float[] {0.0f,0.211f,0.37f,0.512f,0.645f,0.77f,0.889f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(248, 176, 184, 255)) : new Color(248, 176, 184, 255)),((colorFilter != null) ? colorFilter.filter(new Color(246, 172, 181, 255)) : new Color(246, 172, 181, 255)),((colorFilter != null) ? colorFilter.filter(new Color(242, 163, 173, 255)) : new Color(242, 163, 173, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 149, 161, 255)) : new Color(237, 149, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(231, 130, 146, 255)) : new Color(231, 130, 146, 255)),((colorFilter != null) ? colorFilter.filter(new Color(224, 105, 128, 255)) : new Color(224, 105, 128, 255)),((colorFilter != null) ? colorFilter.filter(new Color(215, 72, 107, 255)) : new Color(215, 72, 107, 255)),((colorFilter != null) ? colorFilter.filter(new Color(206, 7, 87, 255)) : new Color(206, 7, 87, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(212, 28, 92, 255)) : new Color(212, 28, 92, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
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
generalPath.moveTo(7.6f, 84.6f);
generalPath.lineTo(11.6f, 84.2f);
generalPath.curveTo(11.8f, 85.5f, 12.3f, 86.5f, 13.1f, 87.1f);
generalPath.curveTo(13.8f, 87.7f, 14.8f, 88.0f, 16.1f, 88.0f);
generalPath.curveTo(17.400002f, 88.0f, 18.4f, 87.7f, 19.1f, 87.2f);
generalPath.curveTo(19.800001f, 86.7f, 20.1f, 86.0f, 20.1f, 85.299995f);
generalPath.curveTo(20.1f, 84.799995f, 20.0f, 84.399994f, 19.7f, 84.1f);
generalPath.curveTo(19.400002f, 83.799995f, 18.900002f, 83.5f, 18.2f, 83.2f);
generalPath.curveTo(17.7f, 83.0f, 16.6f, 82.7f, 14.900001f, 82.299995f);
generalPath.curveTo(12.700001f, 81.799995f, 11.200001f, 81.1f, 10.300001f, 80.299995f);
generalPath.curveTo(9.100001f, 79.2f, 8.400002f, 77.899994f, 8.400002f, 76.299995f);
generalPath.curveTo(8.400002f, 75.299995f, 8.700002f, 74.299995f, 9.300001f, 73.49999f);
generalPath.curveTo(9.900002f, 72.59999f, 10.700001f, 71.99999f, 11.800001f, 71.49999f);
generalPath.curveTo(12.900002f, 70.99999f, 14.200001f, 70.799995f, 15.800001f, 70.799995f);
generalPath.curveTo(18.300001f, 70.799995f, 20.2f, 71.299995f, 21.5f, 72.399994f);
generalPath.curveTo(22.8f, 73.49999f, 23.5f, 74.899994f, 23.5f, 76.799995f);
generalPath.lineTo(19.4f, 76.99999f);
generalPath.curveTo(19.199999f, 75.99999f, 18.9f, 75.19999f, 18.3f, 74.799995f);
generalPath.curveTo(17.699999f, 74.399994f, 16.9f, 74.1f, 15.699999f, 74.1f);
generalPath.curveTo(14.499999f, 74.1f, 13.599998f, 74.299995f, 12.899999f, 74.799995f);
generalPath.curveTo(12.499999f, 75.1f, 12.299998f, 75.49999f, 12.299998f, 75.99999f);
generalPath.curveTo(12.299998f, 76.49999f, 12.499998f, 76.899994f, 12.899999f, 77.19999f);
generalPath.curveTo(13.399999f, 77.59999f, 14.699999f, 78.09999f, 16.599998f, 78.49999f);
generalPath.curveTo(18.499998f, 78.899994f, 19.999998f, 79.399994f, 20.999998f, 79.899994f);
generalPath.curveTo(21.999998f, 80.399994f, 22.699999f, 81.09999f, 23.199999f, 81.899994f);
generalPath.curveTo(23.8f, 82.99999f, 23.999998f, 83.99999f, 23.999998f, 85.299995f);
generalPath.curveTo(23.999998f, 86.399994f, 23.699999f, 87.49999f, 22.999998f, 88.49999f);
generalPath.curveTo(22.399998f, 89.49999f, 21.399998f, 90.19999f, 20.299997f, 90.69999f);
generalPath.curveTo(19.199997f, 91.19999f, 17.699997f, 91.39999f, 15.899998f, 91.39999f);
generalPath.curveTo(13.299997f, 91.39999f, 11.399998f, 90.79999f, 9.999998f, 89.69999f);
generalPath.curveTo(8.599998f, 88.59999f, 7.899998f, 86.79999f, 7.599998f, 84.59999f);
generalPath.closePath();
generalPath.moveTo(32.6f, 91.1f);
generalPath.lineTo(25.399998f, 71.3f);
generalPath.lineTo(29.799997f, 71.3f);
generalPath.lineTo(34.9f, 86.0f);
generalPath.lineTo(39.800003f, 71.3f);
generalPath.lineTo(44.100002f, 71.3f);
generalPath.lineTo(37.0f, 91.1f);
generalPath.lineTo(32.6f, 91.1f);
generalPath.closePath();
generalPath.moveTo(55.699997f, 83.799995f);
generalPath.lineTo(55.699997f, 80.49999f);
generalPath.lineTo(64.5f, 80.49999f);
generalPath.lineTo(64.5f, 88.399994f);
generalPath.curveTo(63.6f, 89.2f, 62.4f, 89.899994f, 60.8f, 90.49999f);
generalPath.curveTo(59.199997f, 91.09999f, 57.5f, 91.399994f, 55.899998f, 91.399994f);
generalPath.curveTo(53.8f, 91.399994f, 51.899998f, 90.99999f, 50.399998f, 90.09999f);
generalPath.curveTo(48.8f, 89.19999f, 47.699997f, 87.99999f, 46.899998f, 86.399994f);
generalPath.curveTo(46.1f, 84.799995f, 45.699997f, 82.99999f, 45.699997f, 81.09999f);
generalPath.curveTo(45.699997f, 78.99999f, 46.1f, 77.19999f, 46.999996f, 75.59999f);
generalPath.curveTo(47.899994f, 73.99999f, 49.199997f, 72.79999f, 50.899998f, 71.899994f);
generalPath.curveTo(52.199997f, 71.2f, 53.8f, 70.899994f, 55.699997f, 70.899994f);
generalPath.curveTo(58.199997f, 70.899994f, 60.199997f, 71.399994f, 61.6f, 72.399994f);
generalPath.curveTo(63.0f, 73.399994f, 63.899998f, 74.899994f, 64.299995f, 76.7f);
generalPath.lineTo(60.299995f, 77.399994f);
generalPath.curveTo(59.999996f, 76.399994f, 59.499996f, 75.7f, 58.699997f, 75.09999f);
generalPath.curveTo(57.899998f, 74.49999f, 56.899998f, 74.29999f, 55.799995f, 74.29999f);
generalPath.curveTo(53.999996f, 74.29999f, 52.599995f, 74.89999f, 51.599995f, 75.999985f);
generalPath.curveTo(50.499996f, 77.09998f, 49.999996f, 78.79999f, 49.999996f, 80.89999f);
generalPath.curveTo(49.999996f, 83.29999f, 50.499996f, 84.999985f, 51.599995f, 86.19999f);
generalPath.curveTo(52.699993f, 87.399994f, 54.099995f, 87.99999f, 55.799995f, 87.99999f);
generalPath.curveTo(56.699997f, 87.99999f, 57.499996f, 87.799995f, 58.399994f, 87.49999f);
generalPath.curveTo(59.299995f, 87.19999f, 59.999992f, 86.799995f, 60.599995f, 86.299995f);
generalPath.lineTo(60.599995f, 83.799995f);
generalPath.lineTo(55.699993f, 83.799995f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.73f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.0f, 62.3f);
generalPath.lineTo(17.4f, 59.0f);
generalPath.curveTo(17.4f, 59.0f, 25.099998f, 43.8f, 22.099998f, 38.2f);
generalPath.lineTo(38.399998f, 25.6f);
generalPath.curveTo(38.399998f, 25.6f, 44.6f, 26.6f, 47.699997f, 32.1f);
generalPath.lineTo(40.699997f, 51.199997f);
generalPath.curveTo(34.3f, 50.3f, 22.0f, 62.3f, 22.0f, 62.3f);
generalPath.closePath();
generalPath.moveTo(33.1f, 42.5f);
generalPath.curveTo(34.399998f, 43.4f, 36.1f, 43.1f, 37.0f, 41.9f);
generalPath.curveTo(37.9f, 40.600002f, 37.6f, 38.9f, 36.4f, 38.0f);
generalPath.curveTo(35.100002f, 37.1f, 33.4f, 37.4f, 32.5f, 38.6f);
generalPath.curveTo(31.5f, 39.8f, 31.8f, 41.6f, 33.1f, 42.5f);
generalPath.closePath();
generalPath.moveTo(33.1f, 42.5f);
generalPath.lineTo(19.8f, 60.6f);
generalPath.moveTo(59.1f, 26.199997f);
generalPath.curveTo(52.899998f, 14.399997f, 39.5f, 12.199997f, 39.5f, 12.199997f);
generalPath.lineTo(33.5f, 20.399998f);
generalPath.curveTo(46.9f, 22.599998f, 53.1f, 34.399998f, 53.1f, 34.399998f);
generalPath.lineTo(59.1f, 26.199997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(1729.68896484375, -415.95599365234375), new Point2D.Double(1753.864013671875, -415.95599365234375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(238, 40, 104, 255)) : new Color(238, 40, 104, 255)),((colorFilter != null) ? colorFilter.filter(new Color(188, 2, 79, 255)) : new Color(188, 2, 79, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-0.8102462627304787f, -0.5860895782483186f, -0.5860895782483186f, 0.8102462627304787f, 1202.6828163388243f, 1396.7453704594668f));
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
generalPath.moveTo(19.9f, 60.8f);
generalPath.lineTo(33.3f, 42.6f);
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(248, 182, 187, 255)) : new Color(248, 182, 187, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.9f, 60.8f);
generalPath.lineTo(33.3f, 42.6f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.178001403808594, 74.15899658203125), new Point2D.Double(58.77199935913086, 87.75299835205078), new float[] {0.0f,0.265f,0.402f,0.51f,0.604f,0.687f,0.763f,0.834f,0.901f,0.962f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 238, 255)) : new Color(255, 254, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 250, 236, 255)) : new Color(255, 250, 236, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 242, 230, 255)) : new Color(254, 242, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 231, 220, 255)) : new Color(252, 231, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 215, 207, 255)) : new Color(250, 215, 207, 255)),((colorFilter != null) ? colorFilter.filter(new Color(246, 195, 191, 255)) : new Color(246, 195, 191, 255)),((colorFilter != null) ? colorFilter.filter(new Color(242, 171, 172, 255)) : new Color(242, 171, 172, 255)),((colorFilter != null) ? colorFilter.filter(new Color(238, 143, 151, 255)) : new Color(238, 143, 151, 255)),((colorFilter != null) ? colorFilter.filter(new Color(234, 111, 130, 255)) : new Color(234, 111, 130, 255)),((colorFilter != null) ? colorFilter.filter(new Color(229, 68, 109, 255)) : new Color(229, 68, 109, 255)),((colorFilter != null) ? colorFilter.filter(new Color(227, 14, 96, 255)) : new Color(227, 14, 96, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(212, 28, 92, 255)) : new Color(212, 28, 92, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
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
        return 0.12799999117851257;
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
		return 0.7450000047683716;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_svg() {
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
    public boolean supportsColorFilter() {
        return true;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
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
    public static RadianceIcon of(int width, int height) {
       ext_svg base = new ext_svg();
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
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       ext_svg base = new ext_svg();
       base.width = width;
       base.height = height;
       return new RadianceIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_svg::new;
    }
}

