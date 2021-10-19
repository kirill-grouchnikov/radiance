package org.pushingpixels.radiance.demo.theming.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import java.util.Stack;
import javax.swing.plaf.UIResource;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class ext_wsf implements RadianceIcon {
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.2f, 40.4f);
generalPath.lineTo(43.1f, 40.4f);
generalPath.lineTo(43.1f, 43.600002f);
generalPath.lineTo(30.2f, 43.600002f);
generalPath.lineTo(30.2f, 40.4f);
generalPath.closePath();
generalPath.moveTo(30.2f, 46.800003f);
generalPath.lineTo(43.1f, 46.800003f);
generalPath.lineTo(43.1f, 50.0f);
generalPath.lineTo(30.2f, 50.0f);
generalPath.lineTo(30.2f, 46.8f);
generalPath.closePath();
generalPath.moveTo(30.2f, 53.300003f);
generalPath.lineTo(43.1f, 53.300003f);
generalPath.lineTo(43.1f, 56.500004f);
generalPath.lineTo(30.2f, 56.500004f);
generalPath.lineTo(30.2f, 53.300003f);
generalPath.closePath();
generalPath.moveTo(52.800003f, 24.200003f);
generalPath.lineTo(26.9f, 24.200003f);
generalPath.curveTo(23.3f, 24.200003f, 20.4f, 27.100002f, 20.4f, 30.700003f);
generalPath.lineTo(20.4f, 59.800003f);
generalPath.lineTo(14.0f, 59.800003f);
generalPath.curveTo(14.0f, 63.4f, 16.9f, 66.3f, 20.5f, 66.3f);
generalPath.lineTo(46.3f, 66.3f);
generalPath.curveTo(49.899998f, 66.3f, 52.8f, 63.4f, 52.8f, 59.800003f);
generalPath.lineTo(52.8f, 33.9f);
generalPath.lineTo(59.3f, 33.9f);
generalPath.lineTo(59.3f, 30.7f);
generalPath.curveTo(59.2f, 27.1f, 56.399998f, 24.2f, 52.8f, 24.2f);
generalPath.closePath();
generalPath.moveTo(49.600002f, 59.200005f);
generalPath.curveTo(49.600002f, 61.300003f, 47.9f, 63.000004f, 45.800003f, 63.000004f);
generalPath.lineTo(22.1f, 63.000004f);
generalPath.curveTo(23.7f, 61.900005f, 23.7f, 59.800003f, 23.7f, 59.800003f);
generalPath.lineTo(23.7f, 30.7f);
generalPath.curveTo(23.7f, 28.900002f, 25.1f, 27.5f, 26.900002f, 27.5f);
generalPath.curveTo(28.7f, 27.5f, 30.100002f, 28.9f, 30.100002f, 30.7f);
generalPath.lineTo(30.100002f, 33.9f);
generalPath.lineTo(49.5f, 33.9f);
generalPath.lineTo(49.5f, 59.2f);
generalPath.closePath();
generalPath.moveTo(33.4f, 30.7f);
generalPath.lineTo(33.4f, 27.5f);
generalPath.lineTo(52.800003f, 27.5f);
generalPath.curveTo(55.700005f, 27.5f, 56.000004f, 29.3f, 56.000004f, 30.7f);
generalPath.lineTo(33.4f, 30.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 66.23100280761719), new Point2D.Double(36.63199996948242, 24.231000900268555), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 66.60600280761719), new Point2D.Double(36.63199996948242, 23.856000900268555), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.2f, 40.4f);
generalPath.lineTo(43.1f, 40.4f);
generalPath.lineTo(43.1f, 43.600002f);
generalPath.lineTo(30.2f, 43.600002f);
generalPath.lineTo(30.2f, 40.4f);
generalPath.closePath();
generalPath.moveTo(30.2f, 46.800003f);
generalPath.lineTo(43.1f, 46.800003f);
generalPath.lineTo(43.1f, 50.0f);
generalPath.lineTo(30.2f, 50.0f);
generalPath.lineTo(30.2f, 46.8f);
generalPath.closePath();
generalPath.moveTo(30.2f, 53.300003f);
generalPath.lineTo(43.1f, 53.300003f);
generalPath.lineTo(43.1f, 56.500004f);
generalPath.lineTo(30.2f, 56.500004f);
generalPath.lineTo(30.2f, 53.300003f);
generalPath.closePath();
generalPath.moveTo(52.800003f, 24.200003f);
generalPath.lineTo(26.9f, 24.200003f);
generalPath.curveTo(23.3f, 24.200003f, 20.4f, 27.100002f, 20.4f, 30.700003f);
generalPath.lineTo(20.4f, 59.800003f);
generalPath.lineTo(14.0f, 59.800003f);
generalPath.curveTo(14.0f, 63.4f, 16.9f, 66.3f, 20.5f, 66.3f);
generalPath.lineTo(46.3f, 66.3f);
generalPath.curveTo(49.899998f, 66.3f, 52.8f, 63.4f, 52.8f, 59.800003f);
generalPath.lineTo(52.8f, 33.9f);
generalPath.lineTo(59.3f, 33.9f);
generalPath.lineTo(59.3f, 30.7f);
generalPath.curveTo(59.2f, 27.1f, 56.399998f, 24.2f, 52.8f, 24.2f);
generalPath.closePath();
generalPath.moveTo(49.600002f, 59.200005f);
generalPath.curveTo(49.600002f, 61.300003f, 47.9f, 63.000004f, 45.800003f, 63.000004f);
generalPath.lineTo(22.1f, 63.000004f);
generalPath.curveTo(23.7f, 61.900005f, 23.7f, 59.800003f, 23.7f, 59.800003f);
generalPath.lineTo(23.7f, 30.7f);
generalPath.curveTo(23.7f, 28.900002f, 25.1f, 27.5f, 26.900002f, 27.5f);
generalPath.curveTo(28.7f, 27.5f, 30.100002f, 28.9f, 30.100002f, 30.7f);
generalPath.lineTo(30.100002f, 33.9f);
generalPath.lineTo(49.5f, 33.9f);
generalPath.lineTo(49.5f, 59.2f);
generalPath.closePath();
generalPath.moveTo(33.4f, 30.7f);
generalPath.lineTo(33.4f, 27.5f);
generalPath.lineTo(52.800003f, 27.5f);
generalPath.curveTo(55.700005f, 27.5f, 56.000004f, 29.3f, 56.000004f, 30.7f);
generalPath.lineTo(33.4f, 30.7f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(14.2f, 91.9f);
generalPath.lineTo(10.1f, 74.7f);
generalPath.lineTo(13.700001f, 74.7f);
generalPath.lineTo(16.300001f, 86.5f);
generalPath.lineTo(19.400002f, 74.7f);
generalPath.lineTo(23.500002f, 74.7f);
generalPath.lineTo(26.500002f, 86.7f);
generalPath.lineTo(29.100002f, 74.7f);
generalPath.lineTo(32.600002f, 74.7f);
generalPath.lineTo(28.400002f, 91.899994f);
generalPath.lineTo(24.7f, 91.899994f);
generalPath.lineTo(21.3f, 79.0f);
generalPath.lineTo(17.9f, 91.8f);
generalPath.lineTo(14.2f, 91.8f);
generalPath.closePath();
generalPath.moveTo(33.5f, 86.3f);
generalPath.lineTo(36.9f, 86.0f);
generalPath.curveTo(37.100002f, 87.1f, 37.5f, 88.0f, 38.100002f, 88.5f);
generalPath.curveTo(38.700005f, 89.0f, 39.600002f, 89.3f, 40.600002f, 89.3f);
generalPath.curveTo(41.7f, 89.3f, 42.600002f, 89.100006f, 43.100002f, 88.600006f);
generalPath.curveTo(43.600002f, 88.100006f, 43.9f, 87.600006f, 43.9f, 86.90001f);
generalPath.curveTo(43.9f, 86.50001f, 43.800003f, 86.100006f, 43.5f, 85.90001f);
generalPath.curveTo(43.199997f, 85.70001f, 42.8f, 85.40001f, 42.3f, 85.20001f);
generalPath.curveTo(41.899998f, 85.10001f, 41.0f, 84.80001f, 39.5f, 84.40001f);
generalPath.curveTo(37.6f, 83.90001f, 36.3f, 83.40001f, 35.6f, 82.70001f);
generalPath.curveTo(34.5f, 81.80001f, 34.0f, 80.60001f, 34.0f, 79.20001f);
generalPath.curveTo(34.0f, 78.30001f, 34.2f, 77.500015f, 34.7f, 76.70001f);
generalPath.curveTo(35.2f, 75.90001f, 35.9f, 75.40001f, 36.8f, 75.000015f);
generalPath.curveTo(37.699997f, 74.60002f, 38.899998f, 74.40002f, 40.2f, 74.40002f);
generalPath.curveTo(42.4f, 74.40002f, 44.0f, 74.90002f, 45.100002f, 75.80002f);
generalPath.curveTo(46.200005f, 76.70002f, 46.800003f, 78.000015f, 46.800003f, 79.60002f);
generalPath.lineTo(43.300003f, 79.80002f);
generalPath.curveTo(43.200005f, 78.90002f, 42.800003f, 78.30002f, 42.300003f, 77.90002f);
generalPath.curveTo(41.800003f, 77.500015f, 41.100002f, 77.30002f, 40.100002f, 77.30002f);
generalPath.curveTo(39.100002f, 77.30002f, 38.300003f, 77.500015f, 37.7f, 77.90002f);
generalPath.curveTo(37.3f, 78.20002f, 37.100002f, 78.500015f, 37.100002f, 79.000015f);
generalPath.curveTo(37.100002f, 79.40002f, 37.300003f, 79.80002f, 37.600002f, 80.000015f);
generalPath.curveTo(38.000004f, 80.40002f, 39.100002f, 80.80002f, 40.800003f, 81.10001f);
generalPath.curveTo(42.500004f, 81.40001f, 43.700005f, 81.90002f, 44.500004f, 82.30001f);
generalPath.curveTo(45.300003f, 82.700005f, 45.900005f, 83.30001f, 46.400005f, 84.00001f);
generalPath.curveTo(46.900005f, 84.700005f, 47.100006f, 85.700005f, 47.100006f, 86.700005f);
generalPath.curveTo(47.100006f, 87.700005f, 46.800007f, 88.600006f, 46.300007f, 89.50001f);
generalPath.curveTo(45.800007f, 90.40001f, 45.0f, 91.0f, 44.0f, 91.4f);
generalPath.curveTo(43.0f, 91.8f, 41.8f, 92.0f, 40.3f, 92.0f);
generalPath.curveTo(38.1f, 92.0f, 36.5f, 91.5f, 35.3f, 90.5f);
generalPath.curveTo(34.1f, 89.5f, 33.7f, 88.2f, 33.5f, 86.3f);
generalPath.closePath();
generalPath.moveTo(50.4f, 91.9f);
generalPath.lineTo(50.4f, 74.7f);
generalPath.lineTo(62.2f, 74.7f);
generalPath.lineTo(62.2f, 77.6f);
generalPath.lineTo(53.9f, 77.6f);
generalPath.lineTo(53.9f, 81.7f);
generalPath.lineTo(61.0f, 81.7f);
generalPath.lineTo(61.0f, 84.6f);
generalPath.lineTo(53.8f, 84.6f);
generalPath.lineTo(53.8f, 91.9f);
generalPath.lineTo(50.399998f, 91.9f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_wsf() {
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
       ext_wsf base = new ext_wsf();
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
       ext_wsf base = new ext_wsf();
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
        return ext_wsf::new;
    }
}

