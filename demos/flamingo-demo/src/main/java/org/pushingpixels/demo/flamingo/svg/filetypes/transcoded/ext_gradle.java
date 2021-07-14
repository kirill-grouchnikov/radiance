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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_gradle implements NeonIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private NeonIcon.ColorFilter colorFilter = null;
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
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.108001708984375, 3.003000020980835), new Point2D.Double(36.108001708984375, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
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
generalPath.moveTo(10.2f, 87.1f);
generalPath.lineTo(10.2f, 85.299995f);
generalPath.lineTo(15.0f, 85.299995f);
generalPath.lineTo(15.0f, 89.6f);
generalPath.curveTo(14.5f, 90.0f, 13.9f, 90.4f, 13.0f, 90.799995f);
generalPath.curveTo(12.1f, 91.1f, 11.3f, 91.299995f, 10.4f, 91.299995f);
generalPath.curveTo(9.299999f, 91.299995f, 8.299999f, 91.1f, 7.3999996f, 90.6f);
generalPath.curveTo(6.5999994f, 90.1f, 5.8999996f, 89.5f, 5.4999995f, 88.6f);
generalPath.curveTo(5.0999994f, 87.7f, 4.8999996f, 86.799995f, 4.8999996f, 85.7f);
generalPath.curveTo(4.8999996f, 84.6f, 5.0999994f, 83.6f, 5.5999994f, 82.7f);
generalPath.curveTo(6.0999994f, 81.799995f, 6.799999f, 81.2f, 7.6999993f, 80.7f);
generalPath.curveTo(8.4f, 80.299995f, 9.299999f, 80.2f, 10.299999f, 80.2f);
generalPath.curveTo(11.599999f, 80.2f, 12.699999f, 80.5f, 13.4f, 81.0f);
generalPath.curveTo(14.2f, 81.6f, 14.599999f, 82.3f, 14.9f, 83.3f);
generalPath.lineTo(12.7f, 83.700005f);
generalPath.curveTo(12.5f, 83.200005f, 12.3f, 82.8f, 11.8f, 82.50001f);
generalPath.curveTo(11.400001f, 82.200005f, 10.900001f, 82.00001f, 10.2f, 82.00001f);
generalPath.curveTo(9.2f, 82.00001f, 8.5f, 82.30001f, 7.8999996f, 82.90001f);
generalPath.curveTo(7.2999997f, 83.50001f, 7.0999994f, 84.40001f, 7.0999994f, 85.600006f);
generalPath.curveTo(7.0999994f, 86.90001f, 7.3999996f, 87.8f, 7.9999995f, 88.50001f);
generalPath.curveTo(8.599999f, 89.100006f, 9.299999f, 89.50001f, 10.2f, 89.50001f);
generalPath.curveTo(10.7f, 89.50001f, 11.099999f, 89.40001f, 11.599999f, 89.200005f);
generalPath.curveTo(12.099999f, 89.00001f, 12.499999f, 88.8f, 12.799999f, 88.600006f);
generalPath.lineTo(12.799999f, 87.200005f);
generalPath.lineTo(10.199999f, 87.200005f);
generalPath.closePath();
generalPath.moveTo(17.0f, 91.1f);
generalPath.lineTo(17.0f, 80.3f);
generalPath.lineTo(21.6f, 80.3f);
generalPath.curveTo(22.800001f, 80.3f, 23.6f, 80.4f, 24.1f, 80.600006f);
generalPath.curveTo(24.6f, 80.8f, 25.0f, 81.100006f, 25.4f, 81.600006f);
generalPath.curveTo(25.8f, 82.100006f, 25.9f, 82.700005f, 25.9f, 83.3f);
generalPath.curveTo(25.9f, 84.100006f, 25.699999f, 84.8f, 25.199999f, 85.3f);
generalPath.curveTo(24.699999f, 85.8f, 23.999998f, 86.200005f, 23.099998f, 86.3f);
generalPath.curveTo(23.599998f, 86.600006f, 23.999998f, 86.9f, 24.3f, 87.200005f);
generalPath.curveTo(24.599998f, 87.50001f, 25.0f, 88.100006f, 25.5f, 88.9f);
generalPath.lineTo(26.8f, 91.0f);
generalPath.lineTo(24.199999f, 91.0f);
generalPath.lineTo(22.599998f, 88.7f);
generalPath.curveTo(21.999998f, 87.899994f, 21.699999f, 87.299995f, 21.399998f, 87.1f);
generalPath.curveTo(21.199997f, 86.9f, 20.999998f, 86.7f, 20.699997f, 86.7f);
generalPath.curveTo(20.499996f, 86.6f, 20.099997f, 86.6f, 19.599997f, 86.6f);
generalPath.lineTo(19.199997f, 86.6f);
generalPath.lineTo(19.199997f, 91.1f);
generalPath.lineTo(17.0f, 91.1f);
generalPath.closePath();
generalPath.moveTo(19.2f, 84.9f);
generalPath.lineTo(20.800001f, 84.9f);
generalPath.curveTo(21.800001f, 84.9f, 22.500002f, 84.9f, 22.800001f, 84.8f);
generalPath.curveTo(23.1f, 84.700005f, 23.300001f, 84.600006f, 23.400002f, 84.3f);
generalPath.curveTo(23.500002f, 84.0f, 23.600002f, 83.8f, 23.600002f, 83.5f);
generalPath.curveTo(23.600002f, 83.1f, 23.500002f, 82.8f, 23.300003f, 82.6f);
generalPath.curveTo(23.100002f, 82.4f, 22.800003f, 82.2f, 22.500004f, 82.2f);
generalPath.lineTo(19.200005f, 82.2f);
generalPath.lineTo(19.200005f, 84.899994f);
generalPath.closePath();
generalPath.moveTo(37.6f, 91.1f);
generalPath.lineTo(35.199997f, 91.1f);
generalPath.lineTo(34.299995f, 88.7f);
generalPath.lineTo(30.0f, 88.7f);
generalPath.lineTo(29.1f, 91.1f);
generalPath.lineTo(26.800001f, 91.1f);
generalPath.lineTo(31.0f, 80.3f);
generalPath.lineTo(33.3f, 80.3f);
generalPath.lineTo(37.6f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(33.6f, 86.799995f);
generalPath.lineTo(32.1f, 82.799995f);
generalPath.lineTo(30.599998f, 86.799995f);
generalPath.lineTo(33.6f, 86.799995f);
generalPath.closePath();
generalPath.moveTo(38.8f, 80.299995f);
generalPath.lineTo(42.8f, 80.299995f);
generalPath.curveTo(43.7f, 80.299995f, 44.399998f, 80.399994f, 44.899998f, 80.49999f);
generalPath.curveTo(45.499996f, 80.69999f, 46.1f, 80.99999f, 46.499996f, 81.49999f);
generalPath.curveTo(46.899994f, 81.99999f, 47.299995f, 82.59999f, 47.499996f, 83.19999f);
generalPath.curveTo(47.699997f, 83.89999f, 47.899998f, 84.69999f, 47.899998f, 85.69999f);
generalPath.curveTo(47.899998f, 86.59999f, 47.8f, 87.29999f, 47.6f, 87.99999f);
generalPath.curveTo(47.3f, 88.799995f, 46.899998f, 89.399994f, 46.399998f, 89.899994f);
generalPath.curveTo(45.999996f, 90.299995f, 45.499996f, 90.59999f, 44.899998f, 90.799995f);
generalPath.curveTo(44.399998f, 90.99999f, 43.8f, 90.99999f, 42.999996f, 90.99999f);
generalPath.lineTo(38.899998f, 90.99999f);
generalPath.lineTo(38.899998f, 80.3f);
generalPath.closePath();
generalPath.moveTo(41.0f, 82.1f);
generalPath.lineTo(41.0f, 89.2f);
generalPath.lineTo(42.6f, 89.2f);
generalPath.curveTo(43.199997f, 89.2f, 43.6f, 89.2f, 43.899998f, 89.1f);
generalPath.curveTo(44.3f, 89.0f, 44.499996f, 88.9f, 44.8f, 88.7f);
generalPath.curveTo(45.0f, 88.5f, 45.2f, 88.1f, 45.399998f, 87.7f);
generalPath.curveTo(45.499996f, 87.2f, 45.6f, 86.6f, 45.6f, 85.7f);
generalPath.curveTo(45.6f, 84.799995f, 45.5f, 84.2f, 45.399998f, 83.799995f);
generalPath.curveTo(45.3f, 83.399994f, 44.999996f, 82.99999f, 44.8f, 82.799995f);
generalPath.curveTo(44.5f, 82.6f, 44.2f, 82.399994f, 43.8f, 82.299995f);
generalPath.curveTo(43.5f, 82.2f, 42.899998f, 82.2f, 42.0f, 82.2f);
generalPath.lineTo(41.0f, 82.2f);
generalPath.closePath();
generalPath.moveTo(49.7f, 91.1f);
generalPath.lineTo(49.7f, 80.4f);
generalPath.lineTo(51.9f, 80.4f);
generalPath.lineTo(51.9f, 89.200005f);
generalPath.lineTo(57.300003f, 89.200005f);
generalPath.lineTo(57.300003f, 91.0f);
generalPath.lineTo(49.700005f, 91.0f);
generalPath.closePath();
generalPath.moveTo(58.9f, 91.1f);
generalPath.lineTo(58.9f, 80.3f);
generalPath.lineTo(66.9f, 80.3f);
generalPath.lineTo(66.9f, 82.100006f);
generalPath.lineTo(61.100002f, 82.100006f);
generalPath.lineTo(61.100002f, 84.50001f);
generalPath.lineTo(66.5f, 84.50001f);
generalPath.lineTo(66.5f, 86.30001f);
generalPath.lineTo(61.1f, 86.30001f);
generalPath.lineTo(61.1f, 89.20001f);
generalPath.lineTo(67.1f, 89.20001f);
generalPath.lineTo(67.1f, 91.0f);
generalPath.lineTo(58.899998f, 91.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
generalPath.moveTo(60.1f, 36.1f);
generalPath.curveTo(58.399998f, 33.0f, 55.399998f, 32.1f, 53.199997f, 32.1f);
generalPath.curveTo(50.6f, 32.1f, 48.399998f, 33.5f, 48.799995f, 34.5f);
generalPath.curveTo(48.899994f, 34.7f, 49.399994f, 35.8f, 49.699997f, 36.2f);
generalPath.curveTo(50.199997f, 36.9f, 50.999996f, 36.3f, 51.199997f, 36.2f);
generalPath.curveTo(51.999996f, 35.7f, 52.899998f, 35.600002f, 53.799995f, 35.7f);
generalPath.curveTo(54.699997f, 35.8f, 55.999996f, 36.4f, 56.899994f, 38.0f);
generalPath.curveTo(58.899994f, 41.8f, 52.799995f, 49.7f, 45.099995f, 44.2f);
generalPath.curveTo(37.299995f, 38.8f, 29.799995f, 40.5f, 26.399994f, 41.7f);
generalPath.curveTo(22.999994f, 42.8f, 21.499994f, 43.9f, 22.799994f, 46.4f);
generalPath.curveTo(24.599993f, 49.800003f, 24.099993f, 48.800003f, 25.799994f, 51.7f);
generalPath.curveTo(28.599993f, 56.3f, 34.799995f, 49.600002f, 34.799995f, 49.600002f);
generalPath.curveTo(30.199995f, 56.4f, 26.299995f, 54.800003f, 24.799995f, 52.4f);
generalPath.curveTo(23.399996f, 50.300003f, 22.399996f, 47.800003f, 22.399996f, 47.800003f);
generalPath.curveTo(10.8f, 51.9f, 13.9f, 70.0f, 13.9f, 70.0f);
generalPath.lineTo(19.599998f, 70.0f);
generalPath.curveTo(21.099998f, 63.3f, 26.3f, 63.6f, 27.199999f, 70.0f);
generalPath.lineTo(31.599998f, 70.0f);
generalPath.curveTo(35.5f, 57.0f, 45.3f, 70.0f, 45.3f, 70.0f);
generalPath.lineTo(51.0f, 70.0f);
generalPath.curveTo(49.4f, 61.1f, 54.2f, 58.4f, 57.2f, 53.2f);
generalPath.curveTo(60.4f, 47.9f, 63.3f, 41.6f, 60.100002f, 36.1f);
generalPath.closePath();
generalPath.moveTo(45.3f, 53.2f);
generalPath.curveTo(42.3f, 52.2f, 43.3f, 49.2f, 43.3f, 49.2f);
generalPath.curveTo(43.3f, 49.2f, 45.899998f, 50.0f, 49.5f, 51.3f);
generalPath.curveTo(49.4f, 52.0f, 47.6f, 53.899998f, 45.3f, 53.2f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.5, 69.96900177001953), new Point2D.Double(37.5, 32.03099822998047), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_gradle() {
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
    public static NeonIcon of(int width, int height) {
       ext_gradle base = new ext_gradle();
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
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_gradle base = new ext_gradle();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_gradle::new;
    }
}

