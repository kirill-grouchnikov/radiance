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
public class ext_xlsx implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 0.75), new Point2D.Double(36.0, 99.25), new float[] {0.0f,0.102f,0.222f,0.355f,0.506f,0.69f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(81, 132, 42, 255)) : new Color(81, 132, 42, 255)),((colorFilter != null) ? colorFilter.filter(new Color(96, 150, 49, 255)) : new Color(96, 150, 49, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 167, 55, 255)) : new Color(109, 167, 55, 255)),((colorFilter != null) ? colorFilter.filter(new Color(119, 179, 59, 255)) : new Color(119, 179, 59, 255)),((colorFilter != null) ? colorFilter.filter(new Color(126, 187, 62, 255)) : new Color(126, 187, 62, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 193, 64, 255)) : new Color(131, 193, 64, 255)),((colorFilter != null) ? colorFilter.filter(new Color(133, 196, 65, 255)) : new Color(133, 196, 65, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(82, 130, 40, 255)) : new Color(82, 130, 40, 255);
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
generalPath.moveTo(7.3f, 91.3f);
generalPath.lineTo(12.700001f, 83.100006f);
generalPath.lineTo(7.8000007f, 75.600006f);
generalPath.lineTo(11.500001f, 75.600006f);
generalPath.lineTo(14.700001f, 80.600006f);
generalPath.lineTo(17.800001f, 75.600006f);
generalPath.lineTo(21.500002f, 75.600006f);
generalPath.lineTo(16.600002f, 83.200005f);
generalPath.lineTo(22.000002f, 91.3f);
generalPath.lineTo(18.200003f, 91.3f);
generalPath.lineTo(14.700003f, 85.9f);
generalPath.lineTo(11.200003f, 91.3f);
generalPath.lineTo(7.3f, 91.3f);
generalPath.closePath();
generalPath.moveTo(23.599998f, 91.3f);
generalPath.lineTo(23.599998f, 75.7f);
generalPath.lineTo(26.8f, 75.7f);
generalPath.lineTo(26.8f, 88.6f);
generalPath.lineTo(34.7f, 88.6f);
generalPath.lineTo(34.7f, 91.2f);
generalPath.lineTo(23.6f, 91.2f);
generalPath.closePath();
generalPath.moveTo(36.199997f, 86.200005f);
generalPath.lineTo(39.299995f, 85.9f);
generalPath.curveTo(39.499996f, 86.9f, 39.899994f, 87.700005f, 40.399994f, 88.200005f);
generalPath.curveTo(40.999992f, 88.700005f, 41.699993f, 88.9f, 42.699993f, 88.9f);
generalPath.curveTo(43.699993f, 88.9f, 44.499992f, 88.700005f, 44.999992f, 88.3f);
generalPath.curveTo(45.499992f, 87.9f, 45.79999f, 87.4f, 45.79999f, 86.8f);
generalPath.curveTo(45.79999f, 86.4f, 45.699993f, 86.100006f, 45.499992f, 85.9f);
generalPath.curveTo(45.29999f, 85.7f, 44.899994f, 85.4f, 44.399994f, 85.200005f);
generalPath.curveTo(43.999992f, 85.100006f, 43.199993f, 84.8f, 41.899994f, 84.50001f);
generalPath.curveTo(40.199993f, 84.100006f, 38.999992f, 83.600006f, 38.299995f, 82.90001f);
generalPath.curveTo(37.299995f, 82.00001f, 36.799995f, 81.00001f, 36.799995f, 79.70001f);
generalPath.curveTo(36.799995f, 78.90001f, 36.999996f, 78.20001f, 37.499996f, 77.500015f);
generalPath.curveTo(37.999996f, 76.80002f, 38.599995f, 76.30002f, 39.499996f, 75.90002f);
generalPath.curveTo(40.399998f, 75.500015f, 41.399998f, 75.40002f, 42.599995f, 75.40002f);
generalPath.curveTo(44.599995f, 75.40002f, 46.099995f, 75.80002f, 47.099995f, 76.70002f);
generalPath.curveTo(48.099995f, 77.60002f, 48.599995f, 78.70002f, 48.699993f, 80.20002f);
generalPath.lineTo(45.499992f, 80.30002f);
generalPath.curveTo(45.399994f, 79.500015f, 45.09999f, 78.90002f, 44.59999f, 78.60002f);
generalPath.curveTo(44.19999f, 78.20002f, 43.499992f, 78.10002f, 42.59999f, 78.10002f);
generalPath.curveTo(41.69999f, 78.10002f, 40.999992f, 78.30002f, 40.39999f, 78.70002f);
generalPath.curveTo(40.09999f, 78.90002f, 39.89999f, 79.30002f, 39.89999f, 79.70002f);
generalPath.curveTo(39.89999f, 80.10002f, 40.09999f, 80.40002f, 40.39999f, 80.70002f);
generalPath.curveTo(40.79999f, 81.00002f, 41.79999f, 81.40002f, 43.29999f, 81.70002f);
generalPath.curveTo(44.79999f, 82.10002f, 45.999992f, 82.40002f, 46.699993f, 82.80002f);
generalPath.curveTo(47.399994f, 83.20002f, 47.999992f, 83.70002f, 48.399994f, 84.40002f);
generalPath.curveTo(48.799995f, 85.10001f, 48.999992f, 85.90002f, 48.999992f, 86.90002f);
generalPath.curveTo(48.999992f, 87.80002f, 48.699993f, 88.60001f, 48.199993f, 89.40002f);
generalPath.curveTo(47.699993f, 90.000015f, 46.999992f, 90.60001f, 46.099995f, 91.000015f);
generalPath.curveTo(45.199993f, 91.40002f, 43.999996f, 91.60001f, 42.699993f, 91.60001f);
generalPath.curveTo(40.699993f, 91.60001f, 39.199993f, 91.10001f, 38.099995f, 90.20001f);
generalPath.curveTo(36.999996f, 89.30001f, 36.399994f, 87.90001f, 36.199993f, 86.20001f);
generalPath.closePath();
generalPath.moveTo(50.1f, 91.3f);
generalPath.lineTo(55.5f, 83.100006f);
generalPath.lineTo(50.6f, 75.600006f);
generalPath.lineTo(54.3f, 75.600006f);
generalPath.lineTo(57.5f, 80.600006f);
generalPath.lineTo(60.6f, 75.600006f);
generalPath.lineTo(64.299995f, 75.600006f);
generalPath.lineTo(59.399994f, 83.200005f);
generalPath.lineTo(64.799995f, 91.3f);
generalPath.lineTo(61.0f, 91.3f);
generalPath.lineTo(57.5f, 85.9f);
generalPath.lineTo(54.0f, 91.3f);
generalPath.lineTo(50.1f, 91.3f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(57.8f, 61.4f);
generalPath.lineTo(35.2f, 61.4f);
generalPath.lineTo(35.2f, 59.4f);
generalPath.curveTo(37.4f, 59.300003f, 38.7f, 59.100002f, 39.4f, 58.800003f);
generalPath.curveTo(40.0f, 58.500004f, 40.300003f, 58.200005f, 40.300003f, 57.800003f);
generalPath.curveTo(40.300003f, 57.600002f, 40.200005f, 57.200005f, 40.000004f, 56.700005f);
generalPath.curveTo(39.800003f, 56.200005f, 39.500004f, 55.600006f, 39.100002f, 55.000004f);
generalPath.curveTo(38.500004f, 54.000004f, 37.7f, 52.700005f, 36.7f, 51.200005f);
generalPath.curveTo(35.7f, 49.700005f, 34.600002f, 48.100006f, 33.5f, 46.400005f);
generalPath.curveTo(29.9f, 50.600006f, 27.5f, 53.400005f, 26.6f, 54.800003f);
generalPath.curveTo(25.6f, 56.200005f, 25.1f, 57.100002f, 25.1f, 57.600002f);
generalPath.curveTo(25.1f, 57.800003f, 25.1f, 58.000004f, 25.2f, 58.2f);
generalPath.curveTo(25.300001f, 58.4f, 25.5f, 58.5f, 25.800001f, 58.7f);
generalPath.curveTo(26.000002f, 58.8f, 26.500002f, 59.0f, 27.1f, 59.100002f);
generalPath.curveTo(27.7f, 59.2f, 28.4f, 59.300003f, 29.2f, 59.4f);
generalPath.lineTo(29.2f, 61.4f);
generalPath.lineTo(14.8f, 61.4f);
generalPath.lineTo(14.8f, 59.4f);
generalPath.curveTo(15.5f, 59.300003f, 16.1f, 59.300003f, 16.6f, 59.2f);
generalPath.curveTo(17.0f, 59.100002f, 17.5f, 59.0f, 17.9f, 58.8f);
generalPath.curveTo(18.9f, 58.3f, 19.8f, 57.7f, 20.6f, 57.0f);
generalPath.curveTo(21.400002f, 56.3f, 22.2f, 55.4f, 23.0f, 54.5f);
generalPath.curveTo(24.2f, 53.1f, 25.6f, 51.6f, 27.1f, 49.8f);
generalPath.curveTo(28.6f, 48.1f, 30.2f, 46.2f, 31.900002f, 44.2f);
generalPath.curveTo(30.300001f, 41.8f, 28.7f, 39.4f, 27.100002f, 37.2f);
generalPath.curveTo(25.500002f, 34.9f, 24.100002f, 33.0f, 23.000002f, 31.400002f);
generalPath.curveTo(22.400002f, 30.600002f, 21.800001f, 29.800001f, 20.900002f, 29.000002f);
generalPath.curveTo(20.100002f, 28.200003f, 19.2f, 27.600002f, 18.300001f, 27.300001f);
generalPath.curveTo(17.800001f, 27.1f, 17.300001f, 26.900002f, 16.800001f, 26.800001f);
generalPath.curveTo(16.2f, 26.7f, 15.600001f, 26.6f, 14.800001f, 26.500002f);
generalPath.lineTo(14.800001f, 24.500002f);
generalPath.lineTo(37.4f, 24.500002f);
generalPath.lineTo(37.4f, 26.500002f);
generalPath.curveTo(35.600002f, 26.600002f, 34.300003f, 26.700003f, 33.5f, 27.000002f);
generalPath.curveTo(32.7f, 27.200003f, 32.2f, 27.600002f, 32.2f, 28.100002f);
generalPath.curveTo(32.2f, 28.300003f, 32.3f, 28.700003f, 32.4f, 29.000002f);
generalPath.curveTo(32.600002f, 29.400002f, 32.9f, 30.000002f, 33.4f, 30.800001f);
generalPath.curveTo(33.800003f, 31.500002f, 34.5f, 32.5f, 35.300003f, 33.800003f);
generalPath.curveTo(36.200005f, 35.100002f, 37.200005f, 36.700005f, 38.300003f, 38.4f);
generalPath.curveTo(41.600002f, 34.5f, 43.600002f, 31.900002f, 44.500004f, 30.800001f);
generalPath.curveTo(45.300003f, 29.6f, 45.800003f, 28.800001f, 45.800003f, 28.400002f);
generalPath.curveTo(45.800003f, 27.900002f, 45.600002f, 27.500002f, 45.100002f, 27.300001f);
generalPath.curveTo(44.600002f, 27.000002f, 43.500004f, 26.800001f, 41.7f, 26.7f);
generalPath.lineTo(41.7f, 24.7f);
generalPath.lineTo(56.1f, 24.7f);
generalPath.lineTo(56.1f, 26.7f);
generalPath.curveTo(55.399998f, 26.7f, 54.899998f, 26.800001f, 54.5f, 26.900002f);
generalPath.curveTo(54.1f, 27.000002f, 53.6f, 27.2f, 53.0f, 27.400002f);
generalPath.curveTo(51.9f, 27.900002f, 51.0f, 28.500002f, 50.3f, 29.2f);
generalPath.curveTo(49.6f, 29.900002f, 48.8f, 30.7f, 47.899998f, 31.7f);
generalPath.curveTo(46.6f, 33.100002f, 45.399998f, 34.5f, 44.199997f, 35.9f);
generalPath.curveTo(42.999996f, 37.2f, 41.6f, 38.9f, 39.899998f, 40.800003f);
generalPath.curveTo(41.999996f, 44.000004f, 43.8f, 46.600002f, 45.3f, 48.700005f);
generalPath.curveTo(46.8f, 50.800003f, 48.2f, 52.800003f, 49.6f, 54.700005f);
generalPath.curveTo(50.1f, 55.500004f, 50.8f, 56.300003f, 51.6f, 57.100006f);
generalPath.curveTo(52.399998f, 57.900005f, 53.3f, 58.500008f, 54.199997f, 58.800007f);
generalPath.curveTo(54.6f, 59.000008f, 55.1f, 59.100006f, 55.6f, 59.20001f);
generalPath.curveTo(56.1f, 59.300007f, 56.899998f, 59.40001f, 57.699997f, 59.500008f);
generalPath.lineTo(57.699997f, 61.40001f);
generalPath.lineTo(57.799995f, 61.40001f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(16.371000289916992, 36.98699951171875), new Point2D.Double(55.487998962402344, 76.10299682617188), new float[] {0.005f,0.267f,0.443f,0.594f,0.731f,0.858f,0.976f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(97, 149, 48, 255)) : new Color(97, 149, 48, 255)),((colorFilter != null) ? colorFilter.filter(new Color(96, 148, 47, 255)) : new Color(96, 148, 47, 255)),((colorFilter != null) ? colorFilter.filter(new Color(91, 142, 45, 255)) : new Color(91, 142, 45, 255)),((colorFilter != null) ? colorFilter.filter(new Color(83, 132, 41, 255)) : new Color(83, 132, 41, 255)),((colorFilter != null) ? colorFilter.filter(new Color(72, 119, 35, 255)) : new Color(72, 119, 35, 255)),((colorFilter != null) ? colorFilter.filter(new Color(58, 103, 27, 255)) : new Color(58, 103, 27, 255)),((colorFilter != null) ? colorFilter.filter(new Color(41, 82, 15, 255)) : new Color(41, 82, 15, 255)),((colorFilter != null) ? colorFilter.filter(new Color(36, 77, 11, 255)) : new Color(36, 77, 11, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.034000396728516, 72.35199737548828), new Point2D.Double(58.534000396728516, 85.85199737548828), new float[] {0.0f,0.312f,0.458f,0.569f,0.663f,0.745f,0.82f,0.889f,0.951f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(242, 245, 213, 255)) : new Color(242, 245, 213, 255)),((colorFilter != null) ? colorFilter.filter(new Color(240, 244, 210, 255)) : new Color(240, 244, 210, 255)),((colorFilter != null) ? colorFilter.filter(new Color(232, 238, 202, 255)) : new Color(232, 238, 202, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 231, 189, 255)) : new Color(221, 231, 189, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 221, 173, 255)) : new Color(207, 221, 173, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 210, 152, 255)) : new Color(190, 210, 152, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 196, 129, 255)) : new Color(169, 196, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(145, 181, 102, 255)) : new Color(145, 181, 102, 255)),((colorFilter != null) ? colorFilter.filter(new Color(120, 166, 71, 255)) : new Color(120, 166, 71, 255)),((colorFilter != null) ? colorFilter.filter(new Color(97, 153, 50, 255)) : new Color(97, 153, 50, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(82, 130, 40, 255)) : new Color(82, 130, 40, 255);
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
	private ext_xlsx() {
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
       ext_xlsx base = new ext_xlsx();
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
       ext_xlsx base = new ext_xlsx();
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
        return ext_xlsx::new;
    }
}

