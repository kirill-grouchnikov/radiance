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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_master implements RadianceIcon {
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.80000305175781), new Point2D.Double(36.0, -0.20000000298023224), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 26.575000762939453), new Point2D.Double(58.57500076293945, 13.074999809265137), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(56.6f, 47.5f);
generalPath.curveTo(56.0f, 47.2f, 55.3f, 47.2f, 54.8f, 47.6f);
generalPath.lineTo(45.9f, 54.399998f);
generalPath.lineTo(37.800003f, 43.6f);
generalPath.curveTo(37.500004f, 43.3f, 37.000004f, 43.0f, 36.500004f, 43.0f);
generalPath.curveTo(36.000004f, 43.0f, 35.500004f, 43.2f, 35.200005f, 43.6f);
generalPath.lineTo(26.500004f, 54.399998f);
generalPath.lineTo(18.100004f, 47.6f);
generalPath.curveTo(17.600004f, 47.199997f, 16.900003f, 47.1f, 16.300005f, 47.5f);
generalPath.curveTo(15.700005f, 47.8f, 15.400005f, 48.5f, 15.600005f, 49.2f);
generalPath.lineTo(18.400005f, 63.6f);
generalPath.curveTo(18.500006f, 64.4f, 19.200005f, 64.9f, 20.000006f, 64.9f);
generalPath.lineTo(53.000008f, 64.9f);
generalPath.curveTo(53.800007f, 64.9f, 54.40001f, 64.4f, 54.600006f, 63.600002f);
generalPath.lineTo(57.400005f, 49.200005f);
generalPath.curveTo(57.500004f, 48.500004f, 57.200005f, 47.900005f, 56.600006f, 47.500004f);
generalPath.closePath();
generalPath.moveTo(51.699997f, 61.7f);
generalPath.lineTo(21.3f, 61.7f);
generalPath.lineTo(19.599998f, 52.800003f);
generalPath.lineTo(25.8f, 57.9f);
generalPath.curveTo(26.099998f, 58.2f, 26.599998f, 58.300003f, 27.0f, 58.2f);
generalPath.curveTo(27.4f, 58.2f, 27.8f, 57.9f, 28.1f, 57.600002f);
generalPath.lineTo(36.5f, 47.100002f);
generalPath.lineTo(44.3f, 57.5f);
generalPath.curveTo(44.6f, 57.8f, 44.899998f, 58.1f, 45.399998f, 58.1f);
generalPath.curveTo(45.8f, 58.199997f, 46.199997f, 58.0f, 46.6f, 57.8f);
generalPath.lineTo(53.5f, 52.5f);
generalPath.lineTo(51.7f, 61.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(15.640000343322754, 53.95500183105469), new Point2D.Double(57.36000061035156, 53.95500183105469), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.4f, 63.3f);
generalPath.lineTo(51.4f, 67.4f);
generalPath.lineTo(21.6f, 67.4f);
generalPath.lineTo(21.6f, 63.300003f);
generalPath.lineTo(18.4f, 63.300003f);
generalPath.lineTo(18.4f, 69.0f);
generalPath.curveTo(18.4f, 69.9f, 19.1f, 70.6f, 20.0f, 70.6f);
generalPath.lineTo(53.0f, 70.6f);
generalPath.curveTo(53.9f, 70.6f, 54.6f, 69.9f, 54.6f, 69.0f);
generalPath.lineTo(54.6f, 63.3f);
generalPath.lineTo(51.399998f, 63.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.399999618530273, 66.93299865722656), new Point2D.Double(54.599998474121094, 66.93299865722656), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.5f, 35.4f);
generalPath.curveTo(33.6f, 35.4f, 31.2f, 37.800003f, 31.2f, 40.7f);
generalPath.curveTo(31.2f, 43.6f, 33.600002f, 46.0f, 36.5f, 46.0f);
generalPath.curveTo(39.399998f, 46.0f, 41.8f, 43.6f, 41.8f, 40.7f);
generalPath.curveTo(41.8f, 37.800003f, 39.399998f, 35.4f, 36.5f, 35.4f);
generalPath.closePath();
generalPath.moveTo(36.5f, 42.9f);
generalPath.curveTo(35.3f, 42.9f, 34.4f, 41.9f, 34.4f, 40.800003f);
generalPath.curveTo(34.4f, 39.700005f, 35.4f, 38.700005f, 36.5f, 38.700005f);
generalPath.curveTo(37.6f, 38.700005f, 38.6f, 39.700005f, 38.6f, 40.800003f);
generalPath.curveTo(38.6f, 41.9f, 37.699997f, 42.9f, 36.5f, 42.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.191999435424805, 40.73899841308594), new Point2D.Double(41.80799865722656, 40.73899841308594), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(56.2f, 39.6f);
generalPath.curveTo(53.3f, 39.6f, 50.9f, 42.0f, 50.9f, 44.899998f);
generalPath.curveTo(50.9f, 47.799995f, 53.300003f, 50.199997f, 56.2f, 50.199997f);
generalPath.curveTo(59.1f, 50.199997f, 61.5f, 47.799995f, 61.5f, 44.899998f);
generalPath.curveTo(61.5f, 42.0f, 59.1f, 39.6f, 56.2f, 39.6f);
generalPath.closePath();
generalPath.moveTo(56.2f, 47.1f);
generalPath.curveTo(55.0f, 47.1f, 54.100002f, 46.1f, 54.100002f, 45.0f);
generalPath.curveTo(54.100002f, 43.9f, 55.100002f, 42.9f, 56.2f, 42.9f);
generalPath.curveTo(57.3f, 42.9f, 58.3f, 43.9f, 58.3f, 45.0f);
generalPath.curveTo(58.3f, 46.1f, 57.399998f, 47.1f, 56.2f, 47.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(56.19200134277344, 39.624000549316406), new Point2D.Double(56.19200134277344, 50.2400016784668), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.8f, 39.6f);
generalPath.curveTo(13.9f, 39.6f, 11.499999f, 42.0f, 11.499999f, 44.899998f);
generalPath.curveTo(11.499999f, 47.799995f, 13.9f, 50.199997f, 16.8f, 50.199997f);
generalPath.curveTo(19.699999f, 50.199997f, 22.099998f, 47.799995f, 22.099998f, 44.899998f);
generalPath.curveTo(22.099998f, 42.0f, 19.699999f, 39.6f, 16.8f, 39.6f);
generalPath.closePath();
generalPath.moveTo(16.8f, 47.1f);
generalPath.curveTo(15.599999f, 47.1f, 14.699999f, 46.1f, 14.699999f, 45.0f);
generalPath.curveTo(14.699999f, 43.9f, 15.699999f, 42.9f, 16.8f, 42.9f);
generalPath.curveTo(17.9f, 42.9f, 18.9f, 43.9f, 18.9f, 45.0f);
generalPath.curveTo(18.9f, 46.1f, 18.0f, 47.1f, 16.8f, 47.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(16.808000564575195, 50.2400016784668), new Point2D.Double(16.808000564575195, 39.624000549316406), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
		return 0.9980000257492065;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_master() {
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
       ext_master base = new ext_master();
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
       ext_master base = new ext_master();
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
        return ext_master::new;
    }
}

