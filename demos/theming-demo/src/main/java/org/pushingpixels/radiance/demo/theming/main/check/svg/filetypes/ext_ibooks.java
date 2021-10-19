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
public class ext_ibooks implements RadianceIcon {
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
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(72.4f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(486.3110046386719, -544.1090087890625), new Point2D.Double(486.30999755859375, -642.1090087890625), new float[] {0.0f,0.005f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(116, 45, 45, 255)) : new Color(116, 45, 45, 255)),((colorFilter != null) ? colorFilter.filter(new Color(130, 113, 0, 255)) : new Color(130, 113, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 238, 145, 255)) : new Color(255, 238, 145, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -450.0610046386719f, 643.1090087890625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = (colorFilter != null) ? colorFilter.filter(new Color(130, 113, 0, 255)) : new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(72.4f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.3f, 1.0f);
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
generalPath.moveTo(5.3f, 91.6f);
generalPath.lineTo(5.3f, 80.1f);
generalPath.lineTo(7.6000004f, 80.1f);
generalPath.lineTo(7.6000004f, 91.6f);
generalPath.lineTo(5.3f, 91.6f);
generalPath.closePath();
generalPath.moveTo(9.9f, 80.1f);
generalPath.lineTo(14.5f, 80.1f);
generalPath.curveTo(15.4f, 80.1f, 16.1f, 80.1f, 16.6f, 80.2f);
generalPath.curveTo(17.1f, 80.299995f, 17.5f, 80.399994f, 17.800001f, 80.7f);
generalPath.curveTo(18.100002f, 81.0f, 18.500002f, 81.299995f, 18.7f, 81.7f);
generalPath.curveTo(18.900002f, 82.1f, 19.1f, 82.5f, 19.1f, 83.0f);
generalPath.curveTo(19.1f, 83.5f, 19.0f, 84.0f, 18.7f, 84.5f);
generalPath.curveTo(18.400002f, 85.0f, 18.0f, 85.3f, 17.5f, 85.5f);
generalPath.curveTo(18.2f, 85.7f, 18.8f, 86.0f, 19.1f, 86.5f);
generalPath.curveTo(19.5f, 87.0f, 19.7f, 87.6f, 19.7f, 88.2f);
generalPath.curveTo(19.7f, 88.7f, 19.6f, 89.2f, 19.300001f, 89.7f);
generalPath.curveTo(19.000002f, 90.2f, 18.7f, 90.6f, 18.300001f, 90.899994f);
generalPath.curveTo(17.900002f, 91.2f, 17.400002f, 91.399994f, 16.7f, 91.399994f);
generalPath.curveTo(16.300001f, 91.399994f, 15.400001f, 91.49999f, 13.900001f, 91.49999f);
generalPath.lineTo(9.900001f, 91.49999f);
generalPath.lineTo(9.900001f, 80.1f);
generalPath.closePath();
generalPath.moveTo(12.299999f, 82.0f);
generalPath.lineTo(12.299999f, 84.6f);
generalPath.lineTo(15.499999f, 84.6f);
generalPath.curveTo(15.899999f, 84.6f, 16.199999f, 84.4f, 16.4f, 84.2f);
generalPath.curveTo(16.6f, 84.0f, 16.699999f, 83.7f, 16.699999f, 83.299995f);
generalPath.curveTo(16.699999f, 82.899994f, 16.599998f, 82.7f, 16.4f, 82.399994f);
generalPath.curveTo(16.199999f, 82.2f, 15.9f, 81.99999f, 15.5f, 81.99999f);
generalPath.lineTo(12.3f, 81.99999f);
generalPath.closePath();
generalPath.moveTo(12.299999f, 86.6f);
generalPath.lineTo(12.299999f, 89.7f);
generalPath.lineTo(14.499999f, 89.7f);
generalPath.curveTo(15.299999f, 89.7f, 15.899999f, 89.7f, 16.099998f, 89.6f);
generalPath.curveTo(16.399998f, 89.5f, 16.699999f, 89.4f, 16.999998f, 89.1f);
generalPath.curveTo(17.199999f, 88.9f, 17.299997f, 88.5f, 17.299997f, 88.1f);
generalPath.curveTo(17.299997f, 87.799995f, 17.199997f, 87.5f, 16.999998f, 87.2f);
generalPath.curveTo(16.8f, 86.899994f, 16.599998f, 86.799995f, 16.299997f, 86.7f);
generalPath.curveTo(15.999996f, 86.6f, 15.299997f, 86.5f, 14.199997f, 86.5f);
generalPath.lineTo(12.299997f, 86.6f);
generalPath.closePath();
generalPath.moveTo(21.199999f, 85.9f);
generalPath.curveTo(21.199999f, 84.700005f, 21.4f, 83.8f, 21.699999f, 83.0f);
generalPath.curveTo(21.999998f, 82.4f, 22.3f, 81.9f, 22.8f, 81.4f);
generalPath.curveTo(23.3f, 80.9f, 23.8f, 80.6f, 24.3f, 80.4f);
generalPath.curveTo(25.0f, 80.1f, 25.9f, 79.9f, 26.8f, 79.9f);
generalPath.curveTo(28.5f, 79.9f, 29.9f, 80.4f, 30.9f, 81.5f);
generalPath.curveTo(31.9f, 82.5f, 32.4f, 84.0f, 32.4f, 85.9f);
generalPath.curveTo(32.4f, 87.700005f, 31.900002f, 89.200005f, 30.900002f, 90.200005f);
generalPath.curveTo(29.900002f, 91.200005f, 28.500002f, 91.8f, 26.800001f, 91.8f);
generalPath.curveTo(25.1f, 91.8f, 23.7f, 91.3f, 22.7f, 90.200005f);
generalPath.curveTo(21.7f, 89.100006f, 21.2f, 87.700005f, 21.2f, 85.9f);
generalPath.closePath();
generalPath.moveTo(23.599998f, 85.8f);
generalPath.curveTo(23.599998f, 87.100006f, 23.899998f, 88.100006f, 24.499998f, 88.700005f);
generalPath.curveTo(25.099998f, 89.3f, 25.899998f, 89.700005f, 26.799997f, 89.700005f);
generalPath.curveTo(27.699997f, 89.700005f, 28.499998f, 89.4f, 29.099997f, 88.700005f);
generalPath.curveTo(29.699997f, 88.00001f, 29.999996f, 87.00001f, 29.999996f, 85.700005f);
generalPath.curveTo(29.999996f, 84.4f, 29.699997f, 83.4f, 29.099997f, 82.8f);
generalPath.curveTo(28.499996f, 82.200005f, 27.699997f, 81.8f, 26.799997f, 81.8f);
generalPath.curveTo(25.799997f, 81.8f, 25.099997f, 82.100006f, 24.499998f, 82.8f);
generalPath.curveTo(23.9f, 83.5f, 23.599998f, 84.5f, 23.599998f, 85.8f);
generalPath.closePath();
generalPath.moveTo(33.8f, 85.9f);
generalPath.curveTo(33.8f, 84.700005f, 34.0f, 83.8f, 34.3f, 83.0f);
generalPath.curveTo(34.6f, 82.4f, 34.899998f, 81.9f, 35.399998f, 81.4f);
generalPath.curveTo(35.899998f, 80.9f, 36.399998f, 80.6f, 36.899998f, 80.4f);
generalPath.curveTo(37.6f, 80.1f, 38.499996f, 79.9f, 39.399998f, 79.9f);
generalPath.curveTo(41.1f, 79.9f, 42.499996f, 80.4f, 43.499996f, 81.5f);
generalPath.curveTo(44.499996f, 82.5f, 44.999996f, 84.0f, 44.999996f, 85.9f);
generalPath.curveTo(44.999996f, 87.700005f, 44.499996f, 89.200005f, 43.499996f, 90.200005f);
generalPath.curveTo(42.499996f, 91.200005f, 41.099995f, 91.8f, 39.399998f, 91.8f);
generalPath.curveTo(37.699997f, 91.8f, 36.3f, 91.3f, 35.3f, 90.200005f);
generalPath.curveTo(34.3f, 89.100006f, 33.8f, 87.700005f, 33.8f, 85.9f);
generalPath.closePath();
generalPath.moveTo(36.2f, 85.8f);
generalPath.curveTo(36.2f, 87.100006f, 36.5f, 88.100006f, 37.100002f, 88.700005f);
generalPath.curveTo(37.7f, 89.4f, 38.500004f, 89.700005f, 39.4f, 89.700005f);
generalPath.curveTo(40.3f, 89.700005f, 41.100002f, 89.4f, 41.7f, 88.700005f);
generalPath.curveTo(42.3f, 88.00001f, 42.600002f, 87.00001f, 42.600002f, 85.700005f);
generalPath.curveTo(42.600002f, 84.4f, 42.300003f, 83.4f, 41.7f, 82.8f);
generalPath.curveTo(41.1f, 82.200005f, 40.3f, 81.8f, 39.4f, 81.8f);
generalPath.curveTo(38.4f, 81.8f, 37.7f, 82.100006f, 37.100002f, 82.8f);
generalPath.curveTo(36.500004f, 83.5f, 36.2f, 84.5f, 36.2f, 85.8f);
generalPath.closePath();
generalPath.moveTo(46.9f, 91.600006f);
generalPath.lineTo(46.9f, 80.1f);
generalPath.lineTo(49.2f, 80.1f);
generalPath.lineTo(49.2f, 85.2f);
generalPath.lineTo(53.9f, 80.1f);
generalPath.lineTo(57.100002f, 80.1f);
generalPath.lineTo(52.7f, 84.6f);
generalPath.lineTo(57.3f, 91.6f);
generalPath.lineTo(54.3f, 91.6f);
generalPath.lineTo(51.1f, 86.2f);
generalPath.lineTo(49.199997f, 88.1f);
generalPath.lineTo(49.199997f, 91.6f);
generalPath.lineTo(46.899998f, 91.6f);
generalPath.closePath();
generalPath.moveTo(58.0f, 87.9f);
generalPath.lineTo(60.3f, 87.700005f);
generalPath.curveTo(60.399998f, 88.50001f, 60.7f, 89.00001f, 61.1f, 89.4f);
generalPath.curveTo(61.499996f, 89.799995f, 62.1f, 89.9f, 62.8f, 89.9f);
generalPath.curveTo(63.6f, 89.9f, 64.1f, 89.700005f, 64.5f, 89.4f);
generalPath.curveTo(64.9f, 89.1f, 65.1f, 88.700005f, 65.1f, 88.3f);
generalPath.curveTo(65.1f, 88.0f, 65.0f, 87.8f, 64.9f, 87.600006f);
generalPath.curveTo(64.700005f, 87.40001f, 64.5f, 87.200005f, 64.1f, 87.100006f);
generalPath.curveTo(63.8f, 87.00001f, 63.199997f, 86.8f, 62.199997f, 86.600006f);
generalPath.curveTo(60.899998f, 86.3f, 60.1f, 85.90001f, 59.6f, 85.50001f);
generalPath.curveTo(58.899998f, 84.90001f, 58.5f, 84.100006f, 58.5f, 83.200005f);
generalPath.curveTo(58.5f, 82.600006f, 58.7f, 82.100006f, 59.0f, 81.600006f);
generalPath.curveTo(59.3f, 81.100006f, 59.8f, 80.700005f, 60.5f, 80.40001f);
generalPath.curveTo(61.1f, 80.100006f, 61.9f, 80.00001f, 62.8f, 80.00001f);
generalPath.curveTo(64.3f, 80.00001f, 65.4f, 80.30001f, 66.1f, 80.90001f);
generalPath.curveTo(66.799995f, 81.50001f, 67.2f, 82.40001f, 67.299995f, 83.40001f);
generalPath.lineTo(64.99999f, 83.50001f);
generalPath.curveTo(64.899994f, 82.90001f, 64.69999f, 82.50001f, 64.399994f, 82.200005f);
generalPath.curveTo(64.1f, 81.9f, 63.599995f, 81.8f, 62.899994f, 81.8f);
generalPath.curveTo(62.199993f, 81.8f, 61.699993f, 81.9f, 61.299995f, 82.200005f);
generalPath.curveTo(61.099995f, 82.4f, 60.899994f, 82.600006f, 60.899994f, 82.9f);
generalPath.curveTo(60.899994f, 83.200005f, 60.999992f, 83.4f, 61.199993f, 83.6f);
generalPath.curveTo(61.499992f, 83.799995f, 62.199993f, 84.1f, 63.399994f, 84.4f);
generalPath.curveTo(64.49999f, 84.700005f, 65.399994f, 84.9f, 65.899994f, 85.200005f);
generalPath.curveTo(66.399994f, 85.50001f, 66.899994f, 85.9f, 67.2f, 86.4f);
generalPath.curveTo(67.5f, 86.9f, 67.7f, 87.5f, 67.7f, 88.200005f);
generalPath.curveTo(67.7f, 88.90001f, 67.5f, 89.50001f, 67.1f, 90.00001f);
generalPath.curveTo(66.7f, 90.600006f, 66.2f, 91.00001f, 65.5f, 91.30001f);
generalPath.curveTo(64.8f, 91.60001f, 64.0f, 91.70001f, 63.0f, 91.70001f);
generalPath.curveTo(61.5f, 91.70001f, 60.4f, 91.40001f, 59.6f, 90.70001f);
generalPath.curveTo(58.799995f, 90.000015f, 58.199997f, 89.10001f, 58.0f, 87.90001f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(254, 254, 254, 255)) : new Color(254, 254, 254, 255);
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
generalPath.moveTo(62.7f, 39.5f);
generalPath.curveTo(62.4f, 38.8f, 62.0f, 38.3f, 61.4f, 37.8f);
generalPath.curveTo(61.300003f, 38.3f, 61.100002f, 38.899998f, 60.800003f, 39.399998f);
generalPath.lineTo(44.4f, 64.6f);
generalPath.curveTo(43.800003f, 65.5f, 42.4f, 65.799995f, 41.4f, 65.5f);
generalPath.lineTo(15.300001f, 58.2f);
generalPath.curveTo(13.700001f, 57.8f, 11.900002f, 56.9f, 11.800001f, 55.100002f);
generalPath.curveTo(11.700001f, 54.4f, 11.800001f, 54.2f, 12.200001f, 53.9f);
generalPath.curveTo(12.6f, 53.600002f, 13.000001f, 53.7f, 13.400001f, 53.800003f);
generalPath.lineTo(38.0f, 60.6f);
generalPath.curveTo(41.6f, 61.6f, 42.6f, 60.899998f, 45.2f, 56.899998f);
generalPath.lineTo(60.2f, 33.799995f);
generalPath.curveTo(61.0f, 32.599995f, 61.2f, 31.199995f, 60.7f, 29.999996f);
generalPath.curveTo(60.3f, 28.799995f, 59.3f, 27.899996f, 57.9f, 27.499996f);
generalPath.lineTo(36.4f, 21.499996f);
generalPath.curveTo(35.9f, 21.399996f, 35.4f, 21.399996f, 34.9f, 21.299995f);
generalPath.lineTo(35.0f, 21.199995f);
generalPath.curveTo(31.7f, 19.199995f, 30.4f, 22.999994f, 28.7f, 24.399996f);
generalPath.curveTo(28.1f, 24.899996f, 27.2f, 25.299995f, 27.0f, 25.799995f);
generalPath.curveTo(26.8f, 26.299995f, 26.9f, 26.799995f, 26.7f, 27.299995f);
generalPath.curveTo(26.1f, 28.699995f, 24.2f, 31.099995f, 23.300001f, 31.799995f);
generalPath.curveTo(22.7f, 32.199997f, 22.000002f, 32.299995f, 21.6f, 32.899994f);
generalPath.curveTo(21.300001f, 33.299995f, 21.4f, 33.999992f, 21.2f, 34.599995f);
generalPath.curveTo(20.7f, 35.899994f, 19.0f, 38.099995f, 17.800001f, 39.199993f);
generalPath.curveTo(17.400002f, 39.599995f, 16.7f, 39.899994f, 16.400002f, 40.399994f);
generalPath.curveTo(16.100002f, 40.799995f, 16.2f, 41.499992f, 15.900002f, 41.999992f);
generalPath.curveTo(15.200002f, 43.399994f, 13.600001f, 45.399994f, 12.300001f, 46.499992f);
generalPath.curveTo(11.600001f, 47.09999f, 10.900002f, 47.399994f, 10.600001f, 48.09999f);
generalPath.curveTo(10.400002f, 48.39999f, 10.600001f, 48.89999f, 10.400002f, 49.29999f);
generalPath.curveTo(10.100001f, 49.999992f, 9.800001f, 50.499992f, 9.600001f, 50.999992f);
generalPath.curveTo(8.900002f, 51.999992f, 8.500001f, 53.199993f, 8.600001f, 54.59999f);
generalPath.curveTo(8.800001f, 57.79999f, 11.300001f, 60.89999f, 14.100001f, 61.69999f);
generalPath.lineTo(40.3f, 69.0f);
generalPath.curveTo(42.7f, 69.7f, 45.8f, 68.5f, 47.1f, 66.4f);
generalPath.lineTo(62.1f, 43.300003f);
generalPath.curveTo(62.899998f, 42.000004f, 63.1f, 40.700005f, 62.699997f, 39.500004f);
generalPath.closePath();
generalPath.moveTo(32.5f, 31.2f);
generalPath.lineTo(33.6f, 29.6f);
generalPath.curveTo(33.899998f, 29.1f, 34.6f, 28.9f, 35.0f, 29.0f);
generalPath.lineTo(52.2f, 33.8f);
generalPath.curveTo(52.7f, 33.899998f, 52.9f, 34.399998f, 52.600002f, 34.899998f);
generalPath.lineTo(51.500004f, 36.499996f);
generalPath.curveTo(51.200005f, 36.999996f, 50.500004f, 37.199997f, 50.100002f, 37.099995f);
generalPath.lineTo(32.9f, 32.299995f);
generalPath.curveTo(32.4f, 32.099995f, 32.2f, 31.599995f, 32.5f, 31.199995f);
generalPath.closePath();
generalPath.moveTo(28.1f, 37.600002f);
generalPath.lineTo(29.2f, 36.000004f);
generalPath.curveTo(29.5f, 35.500004f, 30.2f, 35.300003f, 30.6f, 35.400005f);
generalPath.lineTo(47.800003f, 40.200005f);
generalPath.curveTo(48.300003f, 40.300003f, 48.500004f, 40.800003f, 48.200005f, 41.300003f);
generalPath.lineTo(47.100006f, 42.9f);
generalPath.curveTo(46.800007f, 43.4f, 46.100006f, 43.600002f, 45.700005f, 43.5f);
generalPath.lineTo(28.500004f, 38.7f);
generalPath.curveTo(28.000004f, 38.600002f, 27.800003f, 38.100002f, 28.100004f, 37.600002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(306.0469970703125, -758.1699829101562), new Point2D.Double(306.0469970703125, -713.4099731445312), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(170, 148, 0, 255)) : new Color(170, 148, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(86, 74, 0, 255)) : new Color(86, 74, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9622702519521364f, 0.2720955019987869f, -0.2720955019987869f, 0.9622702519521364f, -458.44528419433215f, 670.2443013897824f));
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
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(45.3f, 27.7f);
generalPath.lineTo(45.3f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(495.4309997558594, -615.2769775390625), new Point2D.Double(508.97900390625, -628.8270263671875), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(254, 234, 134, 255)) : new Color(254, 234, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(134, 114, 0, 255)) : new Color(134, 114, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -450.0610046386719f, 643.1090087890625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = (colorFilter != null) ? colorFilter.filter(new Color(130, 113, 0, 255)) : new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3f, 1.0f);
generalPath.lineTo(72.4f, 27.7f);
generalPath.lineTo(45.3f, 27.7f);
generalPath.lineTo(45.3f, 1.0f);
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
        return 0.13099998235702515;
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
		return 0.7437919974327087;
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
	private ext_ibooks() {
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
       ext_ibooks base = new ext_ibooks();
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
       ext_ibooks base = new ext_ibooks();
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
        return ext_ibooks::new;
    }
}

