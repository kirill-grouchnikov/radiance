package org.pushingpixels.radiance.demo.component.svg.filetypes.transcoded;

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
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class ext_pps implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(72.0f, 99.299995f);
generalPath.lineTo(0.0f, 99.299995f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 95.30000305175781), new Point2D.Double(36.0, -3.200000047683716), new float[] {0.0f,0.032f,0.162f,0.305f,0.468f,0.666f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(203, 85, 40, 255)) : new Color(203, 85, 40, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 91, 39, 255)) : new Color(207, 91, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(219, 112, 38, 255)) : new Color(219, 112, 38, 255)),((colorFilter != null) ? colorFilter.filter(new Color(230, 128, 37, 255)) : new Color(230, 128, 37, 255)),((colorFilter != null) ? colorFilter.filter(new Color(238, 140, 35, 255)) : new Color(238, 140, 35, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 147, 34, 255)) : new Color(244, 147, 34, 255)),((colorFilter != null) ? colorFilter.filter(new Color(246, 150, 34, 255)) : new Color(246, 150, 34, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(72.0f, 99.299995f);
generalPath.lineTo(0.0f, 99.299995f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(193, 81, 39, 255)) : new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(72.0f, 99.299995f);
generalPath.lineTo(0.0f, 99.299995f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(56.5f, 32.0f);
generalPath.curveTo(56.5f, 34.3f, 56.0f, 36.4f, 55.1f, 38.0f);
generalPath.curveTo(54.1f, 39.7f, 52.8f, 41.1f, 51.1f, 42.1f);
generalPath.curveTo(49.3f, 43.199997f, 47.3f, 44.0f, 45.1f, 44.5f);
generalPath.curveTo(42.8f, 45.0f, 40.3f, 45.2f, 37.5f, 45.2f);
generalPath.lineTo(34.0f, 45.2f);
generalPath.lineTo(34.0f, 56.800003f);
generalPath.curveTo(34.0f, 57.500004f, 34.1f, 58.100002f, 34.4f, 58.600002f);
generalPath.curveTo(34.700005f, 59.100002f, 35.2f, 59.500004f, 35.9f, 59.800003f);
generalPath.curveTo(36.300003f, 60.000004f, 36.9f, 60.100002f, 37.800003f, 60.300003f);
generalPath.curveTo(38.700005f, 60.500004f, 39.4f, 60.600002f, 40.000004f, 60.700005f);
generalPath.lineTo(40.000004f, 63.0f);
generalPath.lineTo(17.5f, 63.0f);
generalPath.lineTo(17.5f, 60.7f);
generalPath.curveTo(18.1f, 60.600002f, 18.8f, 60.600002f, 19.8f, 60.5f);
generalPath.curveTo(20.699999f, 60.4f, 21.4f, 60.3f, 21.8f, 60.1f);
generalPath.curveTo(22.599998f, 59.8f, 23.099998f, 59.399998f, 23.3f, 59.0f);
generalPath.curveTo(23.5f, 58.600002f, 23.699999f, 57.9f, 23.699999f, 57.1f);
generalPath.lineTo(23.699999f, 27.9f);
generalPath.curveTo(23.699999f, 27.199999f, 23.599998f, 26.6f, 23.3f, 26.1f);
generalPath.curveTo(23.099998f, 25.6f, 22.599998f, 25.2f, 21.8f, 24.9f);
generalPath.curveTo(21.3f, 24.699999f, 20.5f, 24.5f, 19.599998f, 24.3f);
generalPath.curveTo(18.699999f, 24.099998f, 17.999998f, 24.0f, 17.599998f, 23.9f);
generalPath.lineTo(17.599998f, 21.6f);
generalPath.lineTo(40.5f, 21.6f);
generalPath.curveTo(45.9f, 21.6f, 49.9f, 22.5f, 52.5f, 24.2f);
generalPath.curveTo(55.1f, 25.900002f, 56.5f, 28.5f, 56.5f, 32.0f);
generalPath.closePath();
generalPath.moveTo(45.0f, 33.5f);
generalPath.curveTo(45.0f, 30.4f, 44.4f, 28.1f, 43.1f, 26.5f);
generalPath.curveTo(41.8f, 25.0f, 39.6f, 24.2f, 36.399998f, 24.2f);
generalPath.lineTo(34.0f, 24.2f);
generalPath.lineTo(34.0f, 42.300003f);
generalPath.lineTo(35.2f, 42.300003f);
generalPath.curveTo(38.4f, 42.300003f, 40.8f, 41.600002f, 42.5f, 40.100002f);
generalPath.curveTo(44.2f, 38.800003f, 45.0f, 36.600002f, 45.0f, 33.500004f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(12.838000297546387, 54.262001037597656), new Point2D.Double(49.83300018310547, 17.267000198364258), new float[] {0.005f,0.418f,0.679f,0.897f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(214, 91, 37, 255)) : new Color(214, 91, 37, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 90, 37, 255)) : new Color(211, 90, 37, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 86, 36, 255)) : new Color(202, 86, 36, 255)),((colorFilter != null) ? colorFilter.filter(new Color(188, 79, 34, 255)) : new Color(188, 79, 34, 255)),((colorFilter != null) ? colorFilter.filter(new Color(179, 75, 33, 255)) : new Color(179, 75, 33, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.06999969482422, 23.68000030517578), new Point2D.Double(58.56999969482422, 10.180000305175781), new float[] {0.0f,0.383f,0.521f,0.62f,0.699f,0.767f,0.828f,0.882f,0.933f,0.977f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 252, 227, 255)) : new Color(255, 252, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 250, 224, 255)) : new Color(255, 250, 224, 255)),((colorFilter != null) ? colorFilter.filter(new Color(253, 243, 216, 255)) : new Color(253, 243, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(251, 235, 204, 255)) : new Color(251, 235, 204, 255)),((colorFilter != null) ? colorFilter.filter(new Color(248, 223, 187, 255)) : new Color(248, 223, 187, 255)),((colorFilter != null) ? colorFilter.filter(new Color(245, 208, 166, 255)) : new Color(245, 208, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 191, 141, 255)) : new Color(241, 191, 141, 255)),((colorFilter != null) ? colorFilter.filter(new Color(236, 170, 114, 255)) : new Color(236, 170, 114, 255)),((colorFilter != null) ? colorFilter.filter(new Color(231, 147, 84, 255)) : new Color(231, 147, 84, 255)),((colorFilter != null) ? colorFilter.filter(new Color(226, 124, 52, 255)) : new Color(226, 124, 52, 255)),((colorFilter != null) ? colorFilter.filter(new Color(223, 111, 38, 255)) : new Color(223, 111, 38, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(193, 81, 39, 255)) : new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.7f, 91.3f);
generalPath.lineTo(9.7f, 71.5f);
generalPath.lineTo(16.2f, 71.5f);
generalPath.curveTo(18.7f, 71.5f, 20.300001f, 71.6f, 21.0f, 71.8f);
generalPath.curveTo(22.1f, 72.100006f, 23.1f, 72.700005f, 23.9f, 73.700005f);
generalPath.curveTo(24.699999f, 74.700005f, 25.1f, 76.00001f, 25.1f, 77.600006f);
generalPath.curveTo(25.1f, 78.8f, 24.9f, 79.8f, 24.4f, 80.700005f);
generalPath.curveTo(24.0f, 81.50001f, 23.4f, 82.200005f, 22.699999f, 82.700005f);
generalPath.curveTo(21.999998f, 83.200005f, 21.3f, 83.50001f, 20.599998f, 83.600006f);
generalPath.curveTo(19.599998f, 83.8f, 18.199999f, 83.90001f, 16.399998f, 83.90001f);
generalPath.lineTo(13.799997f, 83.90001f);
generalPath.lineTo(13.799997f, 91.40001f);
generalPath.lineTo(9.7f, 91.40001f);
generalPath.closePath();
generalPath.moveTo(13.7f, 74.8f);
generalPath.lineTo(13.7f, 80.4f);
generalPath.lineTo(15.9f, 80.4f);
generalPath.curveTo(17.5f, 80.4f, 18.6f, 80.3f, 19.1f, 80.1f);
generalPath.curveTo(19.6f, 79.9f, 20.1f, 79.6f, 20.4f, 79.1f);
generalPath.curveTo(20.699999f, 78.7f, 20.9f, 78.1f, 20.9f, 77.6f);
generalPath.curveTo(20.9f, 76.9f, 20.699999f, 76.299995f, 20.3f, 75.799995f);
generalPath.curveTo(19.9f, 75.299995f, 19.3f, 74.99999f, 18.699999f, 74.899994f);
generalPath.curveTo(18.199999f, 74.799995f, 17.3f, 74.799995f, 15.799999f, 74.799995f);
generalPath.lineTo(13.699999f, 74.799995f);
generalPath.closePath();
generalPath.moveTo(28.3f, 91.3f);
generalPath.lineTo(28.3f, 71.5f);
generalPath.lineTo(34.8f, 71.5f);
generalPath.curveTo(37.3f, 71.5f, 38.899998f, 71.6f, 39.6f, 71.8f);
generalPath.curveTo(40.699997f, 72.100006f, 41.699997f, 72.700005f, 42.5f, 73.700005f);
generalPath.curveTo(43.3f, 74.700005f, 43.7f, 76.00001f, 43.7f, 77.600006f);
generalPath.curveTo(43.7f, 78.8f, 43.5f, 79.8f, 43.0f, 80.700005f);
generalPath.curveTo(42.5f, 81.600006f, 42.0f, 82.200005f, 41.3f, 82.700005f);
generalPath.curveTo(40.6f, 83.200005f, 39.899998f, 83.50001f, 39.2f, 83.600006f);
generalPath.curveTo(38.2f, 83.8f, 36.8f, 83.90001f, 35.0f, 83.90001f);
generalPath.lineTo(32.4f, 83.90001f);
generalPath.lineTo(32.4f, 91.40001f);
generalPath.lineTo(28.300001f, 91.40001f);
generalPath.closePath();
generalPath.moveTo(32.3f, 74.8f);
generalPath.lineTo(32.3f, 80.4f);
generalPath.lineTo(34.5f, 80.4f);
generalPath.curveTo(36.1f, 80.4f, 37.2f, 80.3f, 37.7f, 80.1f);
generalPath.curveTo(38.2f, 79.9f, 38.7f, 79.6f, 39.0f, 79.1f);
generalPath.curveTo(39.3f, 78.7f, 39.5f, 78.1f, 39.5f, 77.6f);
generalPath.curveTo(39.5f, 76.9f, 39.3f, 76.299995f, 38.9f, 75.799995f);
generalPath.curveTo(38.5f, 75.299995f, 37.9f, 74.99999f, 37.300003f, 74.899994f);
generalPath.curveTo(36.800003f, 74.799995f, 35.9f, 74.799995f, 34.4f, 74.799995f);
generalPath.lineTo(32.300003f, 74.799995f);
generalPath.closePath();
generalPath.moveTo(45.9f, 84.8f);
generalPath.lineTo(49.800003f, 84.4f);
generalPath.curveTo(50.000004f, 85.700005f, 50.500004f, 86.700005f, 51.200005f, 87.3f);
generalPath.curveTo(51.900005f, 87.9f, 52.900005f, 88.200005f, 54.100006f, 88.200005f);
generalPath.curveTo(55.400005f, 88.200005f, 56.400005f, 87.9f, 57.000008f, 87.4f);
generalPath.curveTo(57.70001f, 86.9f, 58.000008f, 86.200005f, 58.000008f, 85.5f);
generalPath.curveTo(58.000008f, 85.0f, 57.90001f, 84.6f, 57.600006f, 84.3f);
generalPath.curveTo(57.300003f, 84.00001f, 56.800007f, 83.700005f, 56.100006f, 83.4f);
generalPath.curveTo(55.600006f, 83.200005f, 54.600006f, 82.9f, 52.900005f, 82.5f);
generalPath.curveTo(50.700005f, 82.0f, 49.200005f, 81.3f, 48.300007f, 80.5f);
generalPath.curveTo(47.100006f, 79.4f, 46.500008f, 78.1f, 46.500008f, 76.5f);
generalPath.curveTo(46.500008f, 75.5f, 46.800007f, 74.5f, 47.40001f, 73.7f);
generalPath.curveTo(48.000008f, 72.799995f, 48.80001f, 72.2f, 49.90001f, 71.7f);
generalPath.curveTo(51.000008f, 71.2f, 52.30001f, 71.0f, 53.80001f, 71.0f);
generalPath.curveTo(56.30001f, 71.0f, 58.200012f, 71.5f, 59.50001f, 72.6f);
generalPath.curveTo(60.80001f, 73.7f, 61.400013f, 75.1f, 61.50001f, 77.0f);
generalPath.lineTo(57.50001f, 77.2f);
generalPath.curveTo(57.30001f, 76.2f, 57.00001f, 75.399994f, 56.400013f, 75.0f);
generalPath.curveTo(55.800014f, 74.600006f, 55.00001f, 74.3f, 53.800014f, 74.3f);
generalPath.curveTo(52.600014f, 74.3f, 51.700016f, 74.5f, 51.000015f, 75.0f);
generalPath.curveTo(50.600014f, 75.3f, 50.400017f, 75.7f, 50.400017f, 76.2f);
generalPath.curveTo(50.400017f, 76.7f, 50.600018f, 77.1f, 51.000015f, 77.399994f);
generalPath.curveTo(51.500015f, 77.799995f, 52.700016f, 78.299995f, 54.700016f, 78.7f);
generalPath.curveTo(56.700016f, 79.2f, 58.100018f, 79.6f, 59.100018f, 80.1f);
generalPath.curveTo(60.00002f, 80.6f, 60.80002f, 81.299995f, 61.30002f, 82.1f);
generalPath.curveTo(61.80002f, 82.9f, 62.100018f, 84.0f, 62.100018f, 85.299995f);
generalPath.curveTo(62.100018f, 86.399994f, 61.80002f, 87.49999f, 61.100018f, 88.49999f);
generalPath.curveTo(60.50002f, 89.49999f, 59.600018f, 90.19999f, 58.400017f, 90.69999f);
generalPath.curveTo(57.200016f, 91.19999f, 55.80002f, 91.39999f, 54.100018f, 91.39999f);
generalPath.curveTo(51.600018f, 91.39999f, 49.600018f, 90.79999f, 48.30002f, 89.69999f);
generalPath.curveTo(47.00002f, 88.79999f, 46.20002f, 87.09999f, 45.900017f, 84.79999f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
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
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       ext_pps base = new ext_pps();
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
        return ext_pps::new;
    }
}

