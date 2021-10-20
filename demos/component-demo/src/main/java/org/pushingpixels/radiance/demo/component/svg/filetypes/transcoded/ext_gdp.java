package org.pushingpixels.radiance.demo.component.svg.filetypes.transcoded;

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
public class ext_gdp implements RadianceIcon {
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
generalPath.moveTo(42.6f, 59.0f);
generalPath.lineTo(21.4f, 59.0f);
generalPath.curveTo(19.1f, 59.0f, 17.2f, 57.1f, 17.2f, 54.8f);
generalPath.curveTo(17.2f, 52.5f, 19.1f, 50.6f, 21.400002f, 50.6f);
generalPath.lineTo(29.600002f, 50.6f);
generalPath.curveTo(33.300003f, 50.6f, 36.4f, 47.6f, 36.4f, 43.8f);
generalPath.curveTo(36.4f, 40.0f, 33.4f, 37.0f, 29.600002f, 37.0f);
generalPath.lineTo(25.100002f, 37.0f);
generalPath.curveTo(25.200003f, 37.4f, 25.200003f, 37.8f, 25.200003f, 38.3f);
generalPath.curveTo(25.200003f, 38.8f, 25.200003f, 39.2f, 25.100002f, 39.6f);
generalPath.lineTo(29.600002f, 39.6f);
generalPath.curveTo(31.900002f, 39.6f, 33.800003f, 41.5f, 33.800003f, 43.8f);
generalPath.curveTo(33.800003f, 46.1f, 32.0f, 48.0f, 29.7f, 48.0f);
generalPath.lineTo(21.5f, 48.0f);
generalPath.curveTo(17.8f, 48.0f, 14.7f, 51.0f, 14.7f, 54.8f);
generalPath.curveTo(14.7f, 58.6f, 17.7f, 61.6f, 21.5f, 61.6f);
generalPath.lineTo(42.7f, 61.6f);
generalPath.curveTo(42.600002f, 61.199997f, 42.600002f, 60.8f, 42.600002f, 60.3f);
generalPath.curveTo(42.600002f, 59.8f, 42.500004f, 59.399998f, 42.600002f, 59.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.635000228881836, 36.96099853515625), new Point2D.Double(28.635000228881836, 61.53900146484375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 213, 219, 255)) : new Color(202, 213, 219, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(49.1f, 56.2f);
generalPath.curveTo(46.899998f, 56.2f, 45.1f, 58.0f, 45.1f, 60.2f);
generalPath.curveTo(45.1f, 62.4f, 46.899998f, 64.2f, 49.1f, 64.2f);
generalPath.curveTo(51.3f, 64.2f, 53.1f, 62.399998f, 53.1f, 60.199997f);
generalPath.curveTo(53.1f, 57.999996f, 51.3f, 56.199997f, 49.1f, 56.199997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(49.111000061035156, 56.21099853515625), new Point2D.Double(49.111000061035156, 64.28900146484375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 213, 219, 255)) : new Color(202, 213, 219, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(26.9f, 23.2f);
generalPath.lineTo(18.7f, 23.2f);
generalPath.curveTo(18.0f, 23.2f, 17.400002f, 23.800001f, 17.400002f, 24.5f);
generalPath.lineTo(17.400002f, 34.4f);
generalPath.curveTo(15.800001f, 34.9f, 14.600001f, 36.5f, 14.600001f, 38.2f);
generalPath.curveTo(14.600001f, 40.4f, 16.400002f, 42.2f, 18.600002f, 42.2f);
generalPath.curveTo(20.800003f, 42.2f, 22.600002f, 40.4f, 22.600002f, 38.2f);
generalPath.curveTo(22.600002f, 36.4f, 21.400002f, 34.9f, 19.800003f, 34.4f);
generalPath.lineTo(19.800003f, 31.300001f);
generalPath.lineTo(26.800003f, 31.300001f);
generalPath.curveTo(27.500004f, 31.300001f, 28.100002f, 30.7f, 28.100002f, 30.000002f);
generalPath.lineTo(28.100002f, 24.500002f);
generalPath.curveTo(28.200003f, 23.800001f, 27.700003f, 23.200003f, 26.900002f, 23.200003f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.43899917602539, 23.211000442504883), new Point2D.Double(21.43899917602539, 42.28900146484375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 213, 219, 255)) : new Color(202, 213, 219, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(49.1f, 26.0f);
generalPath.curveTo(43.8f, 26.0f, 39.6f, 30.3f, 39.6f, 35.5f);
generalPath.curveTo(39.6f, 38.3f, 40.8f, 41.0f, 43.0f, 42.8f);
generalPath.lineTo(48.0f, 52.6f);
generalPath.curveTo(48.5f, 53.5f, 49.8f, 53.5f, 50.3f, 52.6f);
generalPath.lineTo(55.3f, 42.8f);
generalPath.curveTo(57.5f, 41.0f, 58.7f, 38.3f, 58.7f, 35.5f);
generalPath.curveTo(58.7f, 30.2f, 54.4f, 26.0f, 49.1f, 26.0f);
generalPath.closePath();
generalPath.moveTo(49.1f, 39.5f);
generalPath.curveTo(46.899998f, 39.5f, 45.1f, 37.7f, 45.1f, 35.5f);
generalPath.curveTo(45.1f, 33.3f, 46.899998f, 31.5f, 49.1f, 31.5f);
generalPath.curveTo(51.3f, 31.5f, 53.1f, 33.3f, 53.1f, 35.5f);
generalPath.curveTo(53.1f, 37.7f, 51.3f, 39.5f, 49.1f, 39.5f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(49.111000061035156, 25.961000442504883), new Point2D.Double(49.111000061035156, 53.28799819946289), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 213, 219, 255)) : new Color(202, 213, 219, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(17.1f, 83.8f);
generalPath.lineTo(17.1f, 80.5f);
generalPath.lineTo(25.8f, 80.5f);
generalPath.lineTo(25.8f, 88.4f);
generalPath.curveTo(25.0f, 89.200005f, 23.699999f, 89.9f, 22.099998f, 90.5f);
generalPath.curveTo(20.499998f, 91.1f, 18.899998f, 91.4f, 17.199999f, 91.4f);
generalPath.curveTo(15.099998f, 91.4f, 13.299999f, 91.0f, 11.699999f, 90.1f);
generalPath.curveTo(10.199999f, 89.2f, 8.999999f, 88.0f, 8.299999f, 86.4f);
generalPath.curveTo(7.499999f, 84.8f, 7.0999994f, 83.0f, 7.0999994f, 81.1f);
generalPath.curveTo(7.0999994f, 79.0f, 7.4999995f, 77.2f, 8.4f, 75.6f);
generalPath.curveTo(9.299999f, 74.0f, 10.5f, 72.799995f, 12.2f, 71.9f);
generalPath.curveTo(13.5f, 71.200005f, 15.1f, 70.9f, 17.0f, 70.9f);
generalPath.curveTo(19.5f, 70.9f, 21.4f, 71.4f, 22.8f, 72.4f);
generalPath.curveTo(24.199999f, 73.4f, 25.099998f, 74.9f, 25.5f, 76.700005f);
generalPath.lineTo(21.5f, 77.4f);
generalPath.curveTo(21.2f, 76.4f, 20.7f, 75.700005f, 19.9f, 75.1f);
generalPath.curveTo(19.1f, 74.5f, 18.199999f, 74.299995f, 17.0f, 74.299995f);
generalPath.curveTo(15.2f, 74.299995f, 13.8f, 74.899994f, 12.8f, 75.99999f);
generalPath.curveTo(11.8f, 77.09999f, 11.2f, 78.799995f, 11.2f, 80.899994f);
generalPath.curveTo(11.2f, 83.299995f, 11.7f, 84.99999f, 12.8f, 86.2f);
generalPath.curveTo(13.900001f, 87.399994f, 15.200001f, 88.0f, 16.9f, 88.0f);
generalPath.curveTo(17.699999f, 88.0f, 18.6f, 87.8f, 19.4f, 87.5f);
generalPath.curveTo(20.199999f, 87.2f, 21.0f, 86.8f, 21.6f, 86.3f);
generalPath.lineTo(21.6f, 83.8f);
generalPath.lineTo(17.1f, 83.8f);
generalPath.closePath();
generalPath.moveTo(29.5f, 71.200005f);
generalPath.lineTo(36.9f, 71.200005f);
generalPath.curveTo(38.600002f, 71.200005f, 39.800003f, 71.3f, 40.7f, 71.600006f);
generalPath.curveTo(41.9f, 71.90001f, 42.9f, 72.600006f, 43.7f, 73.40001f);
generalPath.curveTo(44.5f, 74.20001f, 45.2f, 75.30001f, 45.600002f, 76.600006f);
generalPath.curveTo(46.000004f, 77.90001f, 46.300003f, 79.40001f, 46.300003f, 81.3f);
generalPath.curveTo(46.300003f, 82.9f, 46.100002f, 84.3f, 45.700005f, 85.5f);
generalPath.curveTo(45.200005f, 86.9f, 44.500004f, 88.1f, 43.600006f, 89.0f);
generalPath.curveTo(42.900005f, 89.7f, 42.000008f, 90.2f, 40.800007f, 90.6f);
generalPath.curveTo(39.900005f, 90.9f, 38.70001f, 91.0f, 37.20001f, 91.0f);
generalPath.lineTo(29.600008f, 91.0f);
generalPath.lineTo(29.600008f, 71.2f);
generalPath.closePath();
generalPath.moveTo(33.5f, 74.600006f);
generalPath.lineTo(33.5f, 87.700005f);
generalPath.lineTo(36.5f, 87.700005f);
generalPath.curveTo(37.6f, 87.700005f, 38.4f, 87.600006f, 38.9f, 87.50001f);
generalPath.curveTo(39.600002f, 87.30001f, 40.100002f, 87.100006f, 40.5f, 86.700005f);
generalPath.curveTo(40.899998f, 86.3f, 41.3f, 85.700005f, 41.6f, 84.8f);
generalPath.curveTo(41.899998f, 83.9f, 42.0f, 82.700005f, 42.0f, 81.200005f);
generalPath.curveTo(42.0f, 79.700005f, 41.9f, 78.50001f, 41.6f, 77.700005f);
generalPath.curveTo(41.3f, 76.9f, 40.899998f, 76.200005f, 40.5f, 75.8f);
generalPath.curveTo(40.0f, 75.3f, 39.4f, 75.0f, 38.6f, 74.9f);
generalPath.curveTo(38.0f, 74.8f, 36.899998f, 74.700005f, 35.3f, 74.700005f);
generalPath.lineTo(33.5f, 74.700005f);
generalPath.closePath();
generalPath.moveTo(49.6f, 91.100006f);
generalPath.lineTo(49.6f, 71.2f);
generalPath.lineTo(56.1f, 71.2f);
generalPath.curveTo(58.6f, 71.2f, 60.199997f, 71.299995f, 60.899998f, 71.5f);
generalPath.curveTo(61.999996f, 71.8f, 62.999996f, 72.4f, 63.8f, 73.4f);
generalPath.curveTo(64.6f, 74.4f, 65.0f, 75.700005f, 65.0f, 77.3f);
generalPath.curveTo(65.0f, 78.5f, 64.8f, 79.5f, 64.3f, 80.4f);
generalPath.curveTo(63.9f, 81.200005f, 63.300003f, 81.9f, 62.600002f, 82.4f);
generalPath.curveTo(61.9f, 82.9f, 61.2f, 83.200005f, 60.500004f, 83.3f);
generalPath.curveTo(59.500004f, 83.5f, 58.100002f, 83.600006f, 56.300003f, 83.600006f);
generalPath.lineTo(53.700005f, 83.600006f);
generalPath.lineTo(53.700005f, 91.100006f);
generalPath.lineTo(49.600006f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(53.699997f, 74.600006f);
generalPath.lineTo(53.699997f, 80.200005f);
generalPath.lineTo(55.899998f, 80.200005f);
generalPath.curveTo(57.499996f, 80.200005f, 58.6f, 80.100006f, 59.1f, 79.9f);
generalPath.curveTo(59.6f, 79.700005f, 60.1f, 79.4f, 60.399998f, 78.9f);
generalPath.curveTo(60.699997f, 78.5f, 60.899998f, 77.9f, 60.899998f, 77.4f);
generalPath.curveTo(60.899998f, 76.700005f, 60.699997f, 76.1f, 60.3f, 75.6f);
generalPath.curveTo(59.899998f, 75.1f, 59.3f, 74.799995f, 58.7f, 74.7f);
generalPath.curveTo(58.2f, 74.6f, 57.3f, 74.6f, 55.8f, 74.6f);
generalPath.lineTo(53.7f, 74.6f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
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
// _0_8
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
	private ext_gdp() {
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
       ext_gdp base = new ext_gdp();
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
       ext_gdp base = new ext_gdp();
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
        return ext_gdp::new;
    }
}

