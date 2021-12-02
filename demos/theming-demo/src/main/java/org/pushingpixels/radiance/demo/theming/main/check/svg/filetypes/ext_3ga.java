package org.pushingpixels.radiance.demo.theming.main.check.svg.filetypes;

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
public class ext_3ga implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.699999f);
generalPath.lineTo(72.3f, 99.1f);
generalPath.lineTo(0.0f, 99.1f);
generalPath.lineTo(0.0f, 0.9f);
generalPath.lineTo(45.2f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.150001525878906, 2.88700008392334), new Point2D.Double(36.150001525878906, 101.1259994506836), new float[] {0.0f,0.012f,0.182f,0.352f,0.521f,0.687f,0.848f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(89, 85, 147, 255)) : new Color(89, 85, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(91, 87, 148, 255)) : new Color(91, 87, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 119, 170, 255)) : new Color(123, 119, 170, 255)),((colorFilter != null) ? colorFilter.filter(new Color(152, 150, 191, 255)) : new Color(152, 150, 191, 255)),((colorFilter != null) ? colorFilter.filter(new Color(178, 178, 210, 255)) : new Color(178, 178, 210, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 201, 226, 255)) : new Color(199, 201, 226, 255)),((colorFilter != null) ? colorFilter.filter(new Color(214, 217, 236, 255)) : new Color(214, 217, 236, 255)),((colorFilter != null) ? colorFilter.filter(new Color(219, 223, 240, 255)) : new Color(219, 223, 240, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.699999f);
generalPath.lineTo(72.3f, 99.1f);
generalPath.lineTo(0.0f, 99.1f);
generalPath.lineTo(0.0f, 0.9f);
generalPath.lineTo(45.2f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(45, 50, 147, 255)) : new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.699999f);
generalPath.lineTo(72.3f, 99.1f);
generalPath.lineTo(0.0f, 99.1f);
generalPath.lineTo(0.0f, 0.9f);
generalPath.lineTo(45.2f, 0.9f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(9.0f, 85.9f);
generalPath.lineTo(12.7f, 85.5f);
generalPath.curveTo(12.8f, 86.4f, 13.099999f, 87.2f, 13.7f, 87.7f);
generalPath.curveTo(14.2f, 88.2f, 14.9f, 88.399994f, 15.599999f, 88.399994f);
generalPath.curveTo(16.4f, 88.399994f, 17.099998f, 88.09999f, 17.599998f, 87.49999f);
generalPath.curveTo(18.099998f, 86.899994f, 18.399998f, 86.09999f, 18.399998f, 85.09999f);
generalPath.curveTo(18.399998f, 84.09999f, 18.099998f, 83.399994f, 17.599998f, 82.79999f);
generalPath.curveTo(17.099998f, 82.19999f, 16.399998f, 81.999985f, 15.699999f, 81.999985f);
generalPath.curveTo(15.199999f, 81.999985f, 14.599998f, 82.09998f, 13.899999f, 82.29999f);
generalPath.lineTo(14.299998f, 79.19999f);
generalPath.curveTo(15.299998f, 79.19999f, 16.099998f, 78.99999f, 16.699999f, 78.49999f);
generalPath.curveTo(17.199999f, 77.99999f, 17.499998f, 77.399994f, 17.499998f, 76.59999f);
generalPath.curveTo(17.499998f, 75.899994f, 17.299997f, 75.399994f, 16.899998f, 74.99999f);
generalPath.curveTo(16.499998f, 74.59999f, 15.999998f, 74.399994f, 15.299997f, 74.399994f);
generalPath.curveTo(14.5999975f, 74.399994f, 14.0999975f, 74.59999f, 13.5999975f, 75.09999f);
generalPath.curveTo(13.0999975f, 75.59999f, 12.799997f, 76.19999f, 12.699998f, 77.09999f);
generalPath.lineTo(9.099998f, 76.49999f);
generalPath.curveTo(9.299998f, 75.299995f, 9.699999f, 74.299995f, 10.199999f, 73.59999f);
generalPath.curveTo(10.699999f, 72.89999f, 11.399999f, 72.29999f, 12.299999f, 71.899994f);
generalPath.curveTo(13.199999f, 71.49999f, 14.199999f, 71.299995f, 15.299999f, 71.299995f);
generalPath.curveTo(17.199999f, 71.299995f, 18.699999f, 71.899994f, 19.9f, 73.1f);
generalPath.curveTo(20.8f, 74.1f, 21.3f, 75.2f, 21.3f, 76.4f);
generalPath.curveTo(21.3f, 78.1f, 20.3f, 79.5f, 18.4f, 80.6f);
generalPath.curveTo(19.6f, 80.799995f, 20.5f, 81.4f, 21.199999f, 82.2f);
generalPath.curveTo(21.9f, 83.0f, 22.199999f, 84.1f, 22.199999f, 85.299995f);
generalPath.curveTo(22.199999f, 86.99999f, 21.599998f, 88.49999f, 20.3f, 89.799995f);
generalPath.curveTo(19.0f, 90.99999f, 17.4f, 91.6f, 15.499999f, 91.6f);
generalPath.curveTo(13.699999f, 91.6f, 12.199999f, 91.1f, 10.999999f, 90.0f);
generalPath.curveTo(9.899999f, 88.9f, 9.199999f, 87.6f, 8.999999f, 85.9f);
generalPath.closePath();
generalPath.moveTo(35.0f, 83.9f);
generalPath.lineTo(35.0f, 80.5f);
generalPath.lineTo(43.8f, 80.5f);
generalPath.lineTo(43.8f, 88.4f);
generalPath.curveTo(42.899998f, 89.200005f, 41.7f, 89.9f, 40.1f, 90.6f);
generalPath.curveTo(38.5f, 91.2f, 36.899998f, 91.5f, 35.199997f, 91.5f);
generalPath.curveTo(33.1f, 91.5f, 31.299997f, 91.1f, 29.699997f, 90.2f);
generalPath.curveTo(28.099997f, 89.299995f, 26.999996f, 88.1f, 26.199997f, 86.5f);
generalPath.curveTo(25.399998f, 84.9f, 24.999996f, 83.1f, 24.999996f, 81.2f);
generalPath.curveTo(24.999996f, 79.1f, 25.399996f, 77.299995f, 26.299995f, 75.7f);
generalPath.curveTo(27.199995f, 74.1f, 28.499996f, 72.899994f, 30.199995f, 72.0f);
generalPath.curveTo(31.499994f, 71.3f, 33.099995f, 71.0f, 34.999996f, 71.0f);
generalPath.curveTo(37.499996f, 71.0f, 39.399998f, 71.5f, 40.899998f, 72.6f);
generalPath.curveTo(42.3f, 73.6f, 43.199997f, 75.1f, 43.6f, 76.9f);
generalPath.lineTo(39.6f, 77.6f);
generalPath.curveTo(39.3f, 76.6f, 38.8f, 75.9f, 38.0f, 75.299995f);
generalPath.curveTo(37.2f, 74.7f, 36.2f, 74.49999f, 35.1f, 74.49999f);
generalPath.curveTo(33.3f, 74.49999f, 31.899998f, 75.09999f, 30.899998f, 76.19999f);
generalPath.curveTo(29.899998f, 77.29999f, 29.299997f, 78.99999f, 29.299997f, 81.19999f);
generalPath.curveTo(29.299997f, 83.59999f, 29.799997f, 85.29999f, 30.899998f, 86.49999f);
generalPath.curveTo(31.999998f, 87.69999f, 33.399998f, 88.299995f, 35.1f, 88.299995f);
generalPath.curveTo(36.0f, 88.299995f, 36.8f, 88.1f, 37.699997f, 87.799995f);
generalPath.curveTo(38.6f, 87.49999f, 39.299995f, 87.1f, 39.899998f, 86.6f);
generalPath.lineTo(39.899998f, 84.1f);
generalPath.lineTo(35.0f, 84.1f);
generalPath.closePath();
generalPath.moveTo(65.6f, 91.200005f);
generalPath.lineTo(61.199997f, 91.200005f);
generalPath.lineTo(59.399998f, 86.700005f);
generalPath.lineTo(51.399998f, 86.700005f);
generalPath.lineTo(49.699997f, 91.200005f);
generalPath.lineTo(45.399998f, 91.200005f);
generalPath.lineTo(53.199997f, 71.3f);
generalPath.lineTo(57.499996f, 71.3f);
generalPath.lineTo(65.6f, 91.200005f);
generalPath.closePath();
generalPath.moveTo(58.1f, 83.3f);
generalPath.lineTo(55.3f, 75.9f);
generalPath.lineTo(52.6f, 83.3f);
generalPath.lineTo(58.1f, 83.3f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.699999f);
generalPath.lineTo(45.2f, 27.699999f);
generalPath.lineTo(45.2f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(58.32099914550781, 87.27300262451172), new Point2D.Double(50.78300094604492, 78.83899688720703), new float[] {0.0f,0.07f,0.159f,0.255f,0.359f,0.471f,0.598f,0.751f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(89, 85, 147, 255)) : new Color(89, 85, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(112, 108, 162, 255)) : new Color(112, 108, 162, 255)),((colorFilter != null) ? colorFilter.filter(new Color(137, 136, 181, 255)) : new Color(137, 136, 181, 255)),((colorFilter != null) ? colorFilter.filter(new Color(163, 165, 200, 255)) : new Color(163, 165, 200, 255)),((colorFilter != null) ? colorFilter.filter(new Color(186, 191, 217, 255)) : new Color(186, 191, 217, 255)),((colorFilter != null) ? colorFilter.filter(new Color(206, 213, 231, 255)) : new Color(206, 213, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(222, 230, 242, 255)) : new Color(222, 230, 242, 255)),((colorFilter != null) ? colorFilter.filter(new Color(233, 243, 250, 255)) : new Color(233, 243, 250, 255)),((colorFilter != null) ? colorFilter.filter(new Color(236, 248, 254, 255)) : new Color(236, 248, 254, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.699999f);
generalPath.lineTo(45.2f, 27.699999f);
generalPath.lineTo(45.2f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(45, 50, 147, 255)) : new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.699999f);
generalPath.lineTo(45.2f, 27.699999f);
generalPath.lineTo(45.2f, 0.9f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.8f, 39.3f);
generalPath.lineTo(21.3f, 39.3f);
generalPath.lineTo(34.3f, 29.3f);
generalPath.lineTo(34.3f, 62.3f);
generalPath.lineTo(21.3f, 52.3f);
generalPath.lineTo(14.799999f, 52.3f);
generalPath.lineTo(14.799999f, 39.3f);
generalPath.closePath();
generalPath.moveTo(40.9f, 49.5f);
generalPath.lineTo(40.9f, 52.4f);
generalPath.curveTo(41.0f, 52.4f, 42.5f, 52.4f, 44.100002f, 51.600002f);
generalPath.curveTo(45.700005f, 50.800003f, 47.500004f, 48.9f, 47.500004f, 45.800003f);
generalPath.curveTo(47.500004f, 42.700005f, 45.800003f, 40.800003f, 44.100002f, 40.000004f);
generalPath.curveTo(42.500004f, 39.200005f, 41.000004f, 39.200005f, 40.9f, 39.200005f);
generalPath.lineTo(40.9f, 42.100006f);
generalPath.lineTo(41.0f, 42.100006f);
generalPath.curveTo(41.4f, 42.100006f, 42.4f, 42.300007f, 43.1f, 42.800007f);
generalPath.curveTo(43.899998f, 43.300007f, 44.5f, 44.000008f, 44.5f, 45.800007f);
generalPath.curveTo(44.5f, 47.800007f, 43.7f, 48.400005f, 42.7f, 49.000008f);
generalPath.curveTo(42.2f, 49.20001f, 41.7f, 49.40001f, 41.4f, 49.40001f);
generalPath.curveTo(41.2f, 49.40001f, 41.100002f, 49.40001f, 41.0f, 49.500008f);
generalPath.lineTo(40.9f, 49.500008f);
generalPath.closePath();
generalPath.moveTo(40.9f, 54.6f);
generalPath.lineTo(40.9f, 57.5f);
generalPath.curveTo(41.0f, 57.5f, 43.7f, 57.5f, 46.7f, 56.1f);
generalPath.curveTo(49.600002f, 54.699997f, 52.7f, 51.5f, 52.600002f, 46.0f);
generalPath.curveTo(52.7f, 40.4f, 49.600002f, 37.3f, 46.7f, 35.9f);
generalPath.curveTo(43.8f, 34.5f, 41.100002f, 34.5f, 40.9f, 34.5f);
generalPath.lineTo(40.9f, 37.4f);
generalPath.lineTo(41.2f, 37.4f);
generalPath.curveTo(42.0f, 37.5f, 44.3f, 37.800003f, 46.100002f, 39.0f);
generalPath.curveTo(48.000004f, 40.2f, 49.600002f, 42.1f, 49.600002f, 46.1f);
generalPath.curveTo(49.600002f, 50.699997f, 47.500004f, 52.6f, 45.300003f, 53.6f);
generalPath.curveTo(44.200005f, 54.199997f, 43.100002f, 54.399998f, 42.200005f, 54.6f);
generalPath.curveTo(41.800003f, 54.699997f, 41.400005f, 54.699997f, 41.200005f, 54.699997f);
generalPath.curveTo(41.000004f, 54.6f, 40.900005f, 54.6f, 40.900005f, 54.6f);
generalPath.closePath();
generalPath.moveTo(40.9f, 59.6f);
generalPath.lineTo(40.9f, 62.5f);
generalPath.curveTo(41.0f, 62.5f, 45.0f, 62.5f, 49.2f, 60.4f);
generalPath.curveTo(53.4f, 58.4f, 57.7f, 53.9f, 57.7f, 45.800003f);
generalPath.curveTo(57.8f, 37.700005f, 53.4f, 33.200005f, 49.2f, 31.200003f);
generalPath.curveTo(45.0f, 29.100002f, 41.0f, 29.100002f, 40.9f, 29.100002f);
generalPath.lineTo(40.9f, 32.0f);
generalPath.lineTo(41.5f, 32.0f);
generalPath.curveTo(42.8f, 32.1f, 46.3f, 32.6f, 49.2f, 34.5f);
generalPath.curveTo(52.100002f, 36.4f, 54.7f, 39.6f, 54.8f, 45.8f);
generalPath.curveTo(54.7f, 52.8f, 51.399998f, 56.0f, 47.899998f, 57.8f);
generalPath.curveTo(46.199997f, 58.7f, 44.399998f, 59.1f, 42.999996f, 59.3f);
generalPath.curveTo(42.299995f, 59.399998f, 41.799995f, 59.5f, 41.399998f, 59.5f);
generalPath.curveTo(41.1f, 59.6f, 40.899998f, 59.6f, 40.899998f, 59.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(14.776000022888184, 56.17399978637695), new Point2D.Double(57.72600173950195, 56.17399978637695), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(53, 44, 127, 255)) : new Color(53, 44, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(62, 55, 134, 255)) : new Color(62, 55, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(84, 79, 150, 255)) : new Color(84, 79, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(103, 99, 165, 255)) : new Color(103, 99, 165, 255)),((colorFilter != null) ? colorFilter.filter(new Color(117, 114, 177, 255)) : new Color(117, 114, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(126, 124, 186, 255)) : new Color(126, 124, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 128, 189, 255)) : new Color(129, 128, 189, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_3ga() {
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
       ext_3ga base = new ext_3ga();
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
       ext_3ga base = new ext_3ga();
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
        return ext_3ga::new;
    }
}

