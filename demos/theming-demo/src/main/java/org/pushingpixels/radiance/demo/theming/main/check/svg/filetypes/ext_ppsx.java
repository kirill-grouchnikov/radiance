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
public class ext_ppsx implements RadianceIcon {
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
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.06999969482422, 23.68000030517578), new Point2D.Double(58.56999969482422, 10.180000305175781), new float[] {0.0f,0.383f,0.521f,0.62f,0.699f,0.767f,0.828f,0.882f,0.933f,0.977f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 252, 227, 255)) : new Color(255, 252, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 250, 224, 255)) : new Color(255, 250, 224, 255)),((colorFilter != null) ? colorFilter.filter(new Color(253, 243, 216, 255)) : new Color(253, 243, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(251, 235, 204, 255)) : new Color(251, 235, 204, 255)),((colorFilter != null) ? colorFilter.filter(new Color(248, 223, 187, 255)) : new Color(248, 223, 187, 255)),((colorFilter != null) ? colorFilter.filter(new Color(245, 208, 166, 255)) : new Color(245, 208, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 191, 141, 255)) : new Color(241, 191, 141, 255)),((colorFilter != null) ? colorFilter.filter(new Color(236, 170, 114, 255)) : new Color(236, 170, 114, 255)),((colorFilter != null) ? colorFilter.filter(new Color(231, 147, 84, 255)) : new Color(231, 147, 84, 255)),((colorFilter != null) ? colorFilter.filter(new Color(226, 124, 52, 255)) : new Color(226, 124, 52, 255)),((colorFilter != null) ? colorFilter.filter(new Color(223, 111, 38, 255)) : new Color(223, 111, 38, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
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
generalPath.moveTo(7.6f, 91.3f);
generalPath.lineTo(7.6f, 75.6f);
generalPath.lineTo(12.7f, 75.6f);
generalPath.curveTo(14.599999f, 75.6f, 15.9f, 75.7f, 16.5f, 75.799995f);
generalPath.curveTo(17.4f, 75.99999f, 18.2f, 76.6f, 18.8f, 77.299995f);
generalPath.curveTo(19.4f, 78.1f, 19.699999f, 79.1f, 19.699999f, 80.399994f);
generalPath.curveTo(19.699999f, 81.399994f, 19.499998f, 82.2f, 19.199999f, 82.799995f);
generalPath.curveTo(18.8f, 83.49999f, 18.4f, 83.99999f, 17.9f, 84.399994f);
generalPath.curveTo(17.4f, 84.799995f, 16.8f, 84.99999f, 16.199999f, 85.09999f);
generalPath.curveTo(15.399999f, 85.29999f, 14.299999f, 85.29999f, 12.899999f, 85.29999f);
generalPath.lineTo(10.799999f, 85.29999f);
generalPath.lineTo(10.799999f, 91.19999f);
generalPath.lineTo(7.6f, 91.19999f);
generalPath.closePath();
generalPath.moveTo(10.8f, 78.200005f);
generalPath.lineTo(10.8f, 82.700005f);
generalPath.lineTo(12.6f, 82.700005f);
generalPath.curveTo(13.900001f, 82.700005f, 14.700001f, 82.600006f, 15.1f, 82.50001f);
generalPath.curveTo(15.5f, 82.30001f, 15.900001f, 82.100006f, 16.1f, 81.700005f);
generalPath.curveTo(16.300001f, 81.3f, 16.5f, 80.9f, 16.5f, 80.50001f);
generalPath.curveTo(16.5f, 79.90001f, 16.3f, 79.50001f, 16.0f, 79.100006f);
generalPath.curveTo(15.7f, 78.700005f, 15.2f, 78.50001f, 14.7f, 78.40001f);
generalPath.curveTo(14.3f, 78.30001f, 13.599999f, 78.30001f, 12.4f, 78.30001f);
generalPath.lineTo(10.799999f, 78.30001f);
generalPath.closePath();
generalPath.moveTo(22.400002f, 91.3f);
generalPath.lineTo(22.400002f, 75.6f);
generalPath.lineTo(27.500002f, 75.6f);
generalPath.curveTo(29.400002f, 75.6f, 30.700003f, 75.7f, 31.300001f, 75.799995f);
generalPath.curveTo(32.2f, 75.99999f, 33.0f, 76.6f, 33.600002f, 77.299995f);
generalPath.curveTo(34.2f, 78.1f, 34.500004f, 79.1f, 34.500004f, 80.399994f);
generalPath.curveTo(34.500004f, 81.399994f, 34.300003f, 82.2f, 34.000004f, 82.799995f);
generalPath.curveTo(33.600002f, 83.49999f, 33.200005f, 83.99999f, 32.700005f, 84.399994f);
generalPath.curveTo(32.200005f, 84.799995f, 31.600004f, 84.99999f, 31.000004f, 85.09999f);
generalPath.curveTo(30.200005f, 85.29999f, 29.100004f, 85.29999f, 27.700005f, 85.29999f);
generalPath.lineTo(25.600004f, 85.29999f);
generalPath.lineTo(25.600004f, 91.19999f);
generalPath.lineTo(22.400003f, 91.19999f);
generalPath.closePath();
generalPath.moveTo(25.600002f, 78.200005f);
generalPath.lineTo(25.600002f, 82.700005f);
generalPath.lineTo(27.400002f, 82.700005f);
generalPath.curveTo(28.7f, 82.700005f, 29.500002f, 82.600006f, 29.900002f, 82.50001f);
generalPath.curveTo(30.300001f, 82.30001f, 30.7f, 82.100006f, 30.900002f, 81.700005f);
generalPath.curveTo(31.100002f, 81.3f, 31.300001f, 80.9f, 31.300001f, 80.50001f);
generalPath.curveTo(31.300001f, 79.90001f, 31.1f, 79.50001f, 30.800001f, 79.100006f);
generalPath.curveTo(30.500002f, 78.700005f, 30.000002f, 78.50001f, 29.500002f, 78.40001f);
generalPath.curveTo(29.100002f, 78.30001f, 28.400002f, 78.30001f, 27.200003f, 78.30001f);
generalPath.lineTo(25.600002f, 78.30001f);
generalPath.closePath();
generalPath.moveTo(36.4f, 86.200005f);
generalPath.lineTo(39.5f, 85.9f);
generalPath.curveTo(39.7f, 86.9f, 40.1f, 87.700005f, 40.6f, 88.200005f);
generalPath.curveTo(41.199997f, 88.700005f, 41.899998f, 88.9f, 42.899998f, 88.9f);
generalPath.curveTo(43.899998f, 88.9f, 44.699997f, 88.700005f, 45.199997f, 88.200005f);
generalPath.curveTo(45.699997f, 87.8f, 45.999996f, 87.3f, 45.999996f, 86.700005f);
generalPath.curveTo(45.999996f, 86.3f, 45.899998f, 86.00001f, 45.699997f, 85.700005f);
generalPath.curveTo(45.499996f, 85.4f, 45.1f, 85.200005f, 44.499996f, 85.00001f);
generalPath.curveTo(44.099995f, 84.90001f, 43.299995f, 84.600006f, 41.899998f, 84.30001f);
generalPath.curveTo(40.199997f, 83.90001f, 38.999996f, 83.40001f, 38.3f, 82.70001f);
generalPath.curveTo(37.3f, 81.80001f, 36.8f, 80.80001f, 36.8f, 79.500015f);
generalPath.curveTo(36.8f, 78.70001f, 37.0f, 77.90002f, 37.5f, 77.30002f);
generalPath.curveTo(38.0f, 76.60002f, 38.6f, 76.10002f, 39.5f, 75.70002f);
generalPath.curveTo(40.4f, 75.30002f, 41.4f, 75.20002f, 42.6f, 75.20002f);
generalPath.curveTo(44.6f, 75.20002f, 46.1f, 75.60002f, 47.1f, 76.50002f);
generalPath.curveTo(48.1f, 77.400024f, 48.6f, 78.50002f, 48.699997f, 80.00002f);
generalPath.lineTo(45.499996f, 80.10002f);
generalPath.curveTo(45.399998f, 79.30002f, 45.099995f, 78.70002f, 44.599995f, 78.400024f);
generalPath.curveTo(44.099995f, 78.00002f, 43.499996f, 77.900024f, 42.599995f, 77.900024f);
generalPath.curveTo(41.699993f, 77.900024f, 40.899994f, 78.10002f, 40.399994f, 78.50002f);
generalPath.curveTo(40.099995f, 78.70002f, 39.899994f, 79.10002f, 39.899994f, 79.50002f);
generalPath.curveTo(39.899994f, 79.900024f, 40.099995f, 80.20002f, 40.399994f, 80.50002f);
generalPath.curveTo(40.799995f, 80.800026f, 41.799995f, 81.20002f, 43.299995f, 81.60002f);
generalPath.curveTo(44.899994f, 82.00002f, 45.999996f, 82.30002f, 46.799995f, 82.70002f);
generalPath.curveTo(47.499996f, 83.10002f, 48.099995f, 83.60002f, 48.599995f, 84.30002f);
generalPath.curveTo(48.999996f, 85.000015f, 49.199993f, 85.80002f, 49.199993f, 86.80002f);
generalPath.curveTo(49.199993f, 87.70002f, 48.899994f, 88.500015f, 48.399994f, 89.30002f);
generalPath.curveTo(47.999992f, 90.000015f, 47.299995f, 90.60002f, 46.399994f, 91.000015f);
generalPath.curveTo(45.499992f, 91.40002f, 44.299995f, 91.60001f, 42.999992f, 91.60001f);
generalPath.curveTo(40.999992f, 91.60001f, 39.499992f, 91.10001f, 38.399994f, 90.20001f);
generalPath.curveTo(37.199993f, 89.30001f, 36.599995f, 87.90001f, 36.399994f, 86.20001f);
generalPath.closePath();
generalPath.moveTo(50.300003f, 91.3f);
generalPath.lineTo(55.700005f, 83.100006f);
generalPath.lineTo(50.800003f, 75.600006f);
generalPath.lineTo(54.500004f, 75.600006f);
generalPath.lineTo(57.700005f, 80.700005f);
generalPath.lineTo(60.800003f, 75.600006f);
generalPath.lineTo(64.5f, 75.600006f);
generalPath.lineTo(59.6f, 83.200005f);
generalPath.lineTo(65.0f, 91.3f);
generalPath.lineTo(61.1f, 91.3f);
generalPath.lineTo(57.6f, 85.9f);
generalPath.lineTo(54.1f, 91.3f);
generalPath.lineTo(50.3f, 91.3f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
	private ext_ppsx() {
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
       ext_ppsx base = new ext_ppsx();
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
       ext_ppsx base = new ext_ppsx();
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
        return ext_ppsx::new;
    }
}

