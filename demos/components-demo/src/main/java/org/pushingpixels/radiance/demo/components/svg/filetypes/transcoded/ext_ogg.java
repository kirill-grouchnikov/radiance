package org.pushingpixels.radiance.demo.components.svg.filetypes.transcoded;

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
public class ext_ogg implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(4.8f, 81.3f);
generalPath.curveTo(4.8f, 79.3f, 5.1000004f, 77.600006f, 5.7000003f, 76.200005f);
generalPath.curveTo(6.2000003f, 75.200005f, 6.8f, 74.3f, 7.6000004f, 73.50001f);
generalPath.curveTo(8.400001f, 72.70001f, 9.3f, 72.100006f, 10.200001f, 71.700005f);
generalPath.curveTo(11.500001f, 71.200005f, 12.900001f, 70.9f, 14.500001f, 70.9f);
generalPath.curveTo(17.5f, 70.9f, 19.800001f, 71.8f, 21.6f, 73.6f);
generalPath.curveTo(23.4f, 75.4f, 24.300001f, 77.9f, 24.300001f, 81.2f);
generalPath.curveTo(24.300001f, 84.399994f, 23.400002f, 86.899994f, 21.7f, 88.7f);
generalPath.curveTo(20.0f, 90.5f, 17.6f, 91.399994f, 14.6f, 91.399994f);
generalPath.curveTo(11.6f, 91.399994f, 9.200001f, 90.49999f, 7.5000005f, 88.7f);
generalPath.curveTo(5.6000004f, 87.0f, 4.8f, 84.5f, 4.8f, 81.299995f);
generalPath.closePath();
generalPath.moveTo(8.9f, 81.200005f);
generalPath.curveTo(8.9f, 83.50001f, 9.4f, 85.200005f, 10.5f, 86.3f);
generalPath.curveTo(11.6f, 87.5f, 12.9f, 88.0f, 14.5f, 88.0f);
generalPath.curveTo(16.1f, 88.0f, 17.4f, 87.4f, 18.5f, 86.3f);
generalPath.curveTo(19.6f, 85.200005f, 20.1f, 83.4f, 20.1f, 81.100006f);
generalPath.curveTo(20.1f, 78.8f, 19.6f, 77.100006f, 18.6f, 76.00001f);
generalPath.curveTo(17.6f, 74.90001f, 16.2f, 74.30001f, 14.6f, 74.30001f);
generalPath.curveTo(13.0f, 74.30001f, 11.6f, 74.90001f, 10.6f, 76.00001f);
generalPath.curveTo(9.6f, 77.100006f, 8.900001f, 78.90001f, 8.900001f, 81.200005f);
generalPath.closePath();
generalPath.moveTo(36.8f, 83.9f);
generalPath.lineTo(36.8f, 80.5f);
generalPath.lineTo(45.6f, 80.5f);
generalPath.lineTo(45.6f, 88.4f);
generalPath.curveTo(44.699997f, 89.200005f, 43.5f, 89.9f, 41.899998f, 90.6f);
generalPath.curveTo(40.3f, 91.2f, 38.699997f, 91.5f, 36.999996f, 91.5f);
generalPath.curveTo(34.899998f, 91.5f, 33.099995f, 91.1f, 31.499996f, 90.2f);
generalPath.curveTo(29.899998f, 89.299995f, 28.799995f, 88.1f, 27.999996f, 86.5f);
generalPath.curveTo(27.199997f, 84.9f, 26.799995f, 83.1f, 26.799995f, 81.2f);
generalPath.curveTo(26.799995f, 79.1f, 27.199995f, 77.299995f, 28.099995f, 75.7f);
generalPath.curveTo(28.999994f, 74.1f, 30.299995f, 72.899994f, 31.999994f, 72.0f);
generalPath.curveTo(33.299995f, 71.3f, 34.899994f, 71.0f, 36.799995f, 71.0f);
generalPath.curveTo(39.299995f, 71.0f, 41.199997f, 71.5f, 42.699997f, 72.6f);
generalPath.curveTo(44.1f, 73.6f, 44.999996f, 75.1f, 45.399998f, 76.9f);
generalPath.lineTo(41.399998f, 77.6f);
generalPath.curveTo(41.1f, 76.6f, 40.6f, 75.9f, 39.8f, 75.299995f);
generalPath.curveTo(39.0f, 74.7f, 38.0f, 74.49999f, 36.899998f, 74.49999f);
generalPath.curveTo(35.1f, 74.49999f, 33.699997f, 75.09999f, 32.699997f, 76.19999f);
generalPath.curveTo(31.699997f, 77.29999f, 31.099997f, 78.99999f, 31.099997f, 81.19999f);
generalPath.curveTo(31.099997f, 83.59999f, 31.599997f, 85.29999f, 32.699997f, 86.49999f);
generalPath.curveTo(33.799995f, 87.69999f, 35.199997f, 88.299995f, 36.899998f, 88.299995f);
generalPath.curveTo(37.8f, 88.299995f, 38.6f, 88.1f, 39.499996f, 87.799995f);
generalPath.curveTo(40.399998f, 87.49999f, 41.099995f, 87.1f, 41.699997f, 86.6f);
generalPath.lineTo(41.699997f, 84.1f);
generalPath.lineTo(36.799995f, 84.1f);
generalPath.closePath();
generalPath.moveTo(58.6f, 83.9f);
generalPath.lineTo(58.6f, 80.5f);
generalPath.lineTo(67.4f, 80.5f);
generalPath.lineTo(67.4f, 88.4f);
generalPath.curveTo(66.6f, 89.200005f, 65.3f, 89.9f, 63.7f, 90.6f);
generalPath.curveTo(62.100002f, 91.2f, 60.5f, 91.5f, 58.8f, 91.5f);
generalPath.curveTo(56.7f, 91.5f, 54.899998f, 91.1f, 53.3f, 90.2f);
generalPath.curveTo(51.7f, 89.299995f, 50.6f, 88.1f, 49.8f, 86.5f);
generalPath.curveTo(49.0f, 84.9f, 48.6f, 83.1f, 48.6f, 81.2f);
generalPath.curveTo(48.6f, 79.1f, 49.0f, 77.299995f, 49.899998f, 75.7f);
generalPath.curveTo(50.799995f, 74.1f, 52.1f, 72.899994f, 53.8f, 72.0f);
generalPath.curveTo(55.1f, 71.3f, 56.7f, 71.0f, 58.6f, 71.0f);
generalPath.curveTo(61.1f, 71.0f, 63.0f, 71.5f, 64.5f, 72.6f);
generalPath.curveTo(65.9f, 73.6f, 66.8f, 75.1f, 67.2f, 76.9f);
generalPath.lineTo(63.199997f, 77.6f);
generalPath.curveTo(62.899998f, 76.6f, 62.399998f, 75.9f, 61.6f, 75.299995f);
generalPath.curveTo(60.8f, 74.7f, 59.8f, 74.49999f, 58.699997f, 74.49999f);
generalPath.curveTo(56.899998f, 74.49999f, 55.499996f, 75.09999f, 54.499996f, 76.19999f);
generalPath.curveTo(53.499996f, 77.29999f, 52.899998f, 78.99999f, 52.899998f, 81.19999f);
generalPath.curveTo(52.899998f, 83.59999f, 53.399998f, 85.29999f, 54.499996f, 86.49999f);
generalPath.curveTo(55.599995f, 87.69999f, 56.999996f, 88.299995f, 58.699997f, 88.299995f);
generalPath.curveTo(59.499996f, 88.299995f, 60.399998f, 88.1f, 61.299995f, 87.799995f);
generalPath.curveTo(62.199997f, 87.49999f, 62.899994f, 87.1f, 63.499996f, 86.6f);
generalPath.lineTo(63.499996f, 84.1f);
generalPath.lineTo(58.599995f, 84.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_ogg() {
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
       ext_ogg base = new ext_ogg();
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
       ext_ogg base = new ext_ogg();
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
        return ext_ogg::new;
    }
}

