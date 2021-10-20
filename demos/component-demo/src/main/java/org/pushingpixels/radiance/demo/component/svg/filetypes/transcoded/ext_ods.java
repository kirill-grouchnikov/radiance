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
public class ext_ods implements RadianceIcon {
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 97.0), new Point2D.Double(36.20000076293945, -1.0), new float[] {0.029f,0.462f,0.998f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(35, 84, 39, 255)) : new Color(35, 84, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(78, 176, 86, 255)) : new Color(78, 176, 86, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 214, 109, 255)) : new Color(100, 214, 109, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(0.30000001192092896, 50.0), new Point2D.Double(72.0999984741211, 50.0), new float[] {0.005f,0.343f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(7, 114, 101, 0)) : new Color(7, 114, 101, 0)),((colorFilter != null) ? colorFilter.filter(new Color(0, 106, 105, 0)) : new Color(0, 106, 105, 0)),((colorFilter != null) ? colorFilter.filter(new Color(0, 56, 54, 0)) : new Color(0, 56, 54, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(35, 84, 39, 255)) : new Color(35, 84, 39, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(7.2f, 81.3f);
generalPath.curveTo(7.2f, 79.3f, 7.5f, 77.600006f, 8.099999f, 76.200005f);
generalPath.curveTo(8.599999f, 75.200005f, 9.2f, 74.3f, 9.999999f, 73.50001f);
generalPath.curveTo(10.799999f, 72.700005f, 11.599999f, 72.100006f, 12.599998f, 71.700005f);
generalPath.curveTo(13.799998f, 71.200005f, 15.299998f, 70.9f, 16.899998f, 70.9f);
generalPath.curveTo(19.799997f, 70.9f, 22.199997f, 71.8f, 23.999998f, 73.6f);
generalPath.curveTo(25.8f, 75.399994f, 26.599998f, 77.9f, 26.599998f, 81.2f);
generalPath.curveTo(26.599998f, 84.399994f, 25.699999f, 86.899994f, 23.999998f, 88.7f);
generalPath.curveTo(22.299997f, 90.5f, 19.899998f, 91.399994f, 16.999998f, 91.399994f);
generalPath.curveTo(13.999998f, 91.399994f, 11.699998f, 90.49999f, 9.899998f, 88.7f);
generalPath.curveTo(8.0999975f, 86.899994f, 7.199998f, 84.399994f, 7.199998f, 81.299995f);
generalPath.closePath();
generalPath.moveTo(11.299999f, 81.100006f);
generalPath.curveTo(11.299999f, 83.3f, 11.799999f, 85.100006f, 12.9f, 86.200005f);
generalPath.curveTo(13.9f, 87.4f, 15.299999f, 87.9f, 16.9f, 87.9f);
generalPath.curveTo(18.5f, 87.9f, 19.8f, 87.3f, 20.9f, 86.200005f);
generalPath.curveTo(21.9f, 85.00001f, 22.4f, 83.3f, 22.4f, 81.00001f);
generalPath.curveTo(22.4f, 78.700005f, 21.9f, 77.00001f, 20.9f, 75.90001f);
generalPath.curveTo(19.9f, 74.80001f, 18.6f, 74.20001f, 16.9f, 74.20001f);
generalPath.curveTo(15.199999f, 74.20001f, 13.9f, 74.80001f, 12.9f, 75.90001f);
generalPath.curveTo(11.799999f, 77.100006f, 11.299999f, 78.90001f, 11.299999f, 81.100006f);
generalPath.closePath();
generalPath.moveTo(29.699999f, 71.200005f);
generalPath.lineTo(37.1f, 71.200005f);
generalPath.curveTo(38.8f, 71.200005f, 40.0f, 71.3f, 40.899998f, 71.600006f);
generalPath.curveTo(42.1f, 71.90001f, 43.1f, 72.600006f, 43.899998f, 73.40001f);
generalPath.curveTo(44.699997f, 74.30001f, 45.399998f, 75.30001f, 45.8f, 76.600006f);
generalPath.curveTo(46.2f, 77.90001f, 46.5f, 79.40001f, 46.5f, 81.3f);
generalPath.curveTo(46.5f, 82.9f, 46.3f, 84.3f, 45.9f, 85.5f);
generalPath.curveTo(45.4f, 86.9f, 44.7f, 88.1f, 43.800003f, 89.0f);
generalPath.curveTo(43.100002f, 89.7f, 42.200005f, 90.2f, 41.000004f, 90.6f);
generalPath.curveTo(40.100002f, 90.9f, 38.900005f, 91.0f, 37.400005f, 91.0f);
generalPath.lineTo(29.800005f, 91.0f);
generalPath.lineTo(29.800005f, 71.2f);
generalPath.lineTo(29.700005f, 71.2f);
generalPath.closePath();
generalPath.moveTo(33.699997f, 74.600006f);
generalPath.lineTo(33.699997f, 87.700005f);
generalPath.lineTo(36.699997f, 87.700005f);
generalPath.curveTo(37.799995f, 87.700005f, 38.6f, 87.600006f, 39.1f, 87.50001f);
generalPath.curveTo(39.8f, 87.30001f, 40.3f, 87.100006f, 40.699997f, 86.700005f);
generalPath.curveTo(41.1f, 86.3f, 41.499996f, 85.700005f, 41.799995f, 84.8f);
generalPath.curveTo(42.099995f, 83.9f, 42.199997f, 82.700005f, 42.199997f, 81.200005f);
generalPath.curveTo(42.199997f, 79.700005f, 42.1f, 78.50001f, 41.799995f, 77.700005f);
generalPath.curveTo(41.499996f, 76.9f, 41.099995f, 76.200005f, 40.699997f, 75.8f);
generalPath.curveTo(40.199997f, 75.3f, 39.6f, 75.0f, 38.799995f, 74.9f);
generalPath.curveTo(38.199997f, 74.8f, 37.099995f, 74.700005f, 35.499996f, 74.700005f);
generalPath.lineTo(33.699997f, 74.600006f);
generalPath.closePath();
generalPath.moveTo(48.799995f, 84.600006f);
generalPath.lineTo(52.699997f, 84.200005f);
generalPath.curveTo(52.899998f, 85.50001f, 53.399998f, 86.50001f, 54.1f, 87.100006f);
generalPath.curveTo(54.8f, 87.700005f, 55.8f, 88.00001f, 57.0f, 88.00001f);
generalPath.curveTo(58.3f, 88.00001f, 59.3f, 87.700005f, 59.9f, 87.200005f);
generalPath.curveTo(60.600002f, 86.700005f, 60.9f, 86.00001f, 60.9f, 85.3f);
generalPath.curveTo(60.9f, 84.8f, 60.800003f, 84.4f, 60.5f, 84.100006f);
generalPath.curveTo(60.199997f, 83.80001f, 59.7f, 83.50001f, 59.0f, 83.200005f);
generalPath.curveTo(58.5f, 83.00001f, 57.5f, 82.700005f, 55.8f, 82.3f);
generalPath.curveTo(53.6f, 81.8f, 52.1f, 81.100006f, 51.2f, 80.3f);
generalPath.curveTo(50.0f, 79.200005f, 49.4f, 77.9f, 49.4f, 76.3f);
generalPath.curveTo(49.4f, 75.3f, 49.7f, 74.3f, 50.300003f, 73.5f);
generalPath.curveTo(50.9f, 72.6f, 51.700005f, 72.0f, 52.800003f, 71.5f);
generalPath.curveTo(53.9f, 71.0f, 55.200005f, 70.8f, 56.700005f, 70.8f);
generalPath.curveTo(59.200005f, 70.8f, 61.100006f, 71.3f, 62.400005f, 72.4f);
generalPath.curveTo(63.700005f, 73.5f, 64.3f, 74.9f, 64.40001f, 76.8f);
generalPath.lineTo(60.40001f, 77.0f);
generalPath.curveTo(60.20001f, 76.0f, 59.90001f, 75.2f, 59.30001f, 74.8f);
generalPath.curveTo(58.700012f, 74.40001f, 57.90001f, 74.100006f, 56.700012f, 74.100006f);
generalPath.curveTo(55.50001f, 74.100006f, 54.600014f, 74.3f, 53.900013f, 74.8f);
generalPath.curveTo(53.50001f, 75.100006f, 53.300014f, 75.5f, 53.300014f, 76.0f);
generalPath.curveTo(53.300014f, 76.5f, 53.500015f, 76.9f, 53.900013f, 77.2f);
generalPath.curveTo(54.400013f, 77.6f, 55.600014f, 78.1f, 57.600014f, 78.5f);
generalPath.curveTo(59.600014f, 79.0f, 61.000015f, 79.4f, 62.000015f, 79.9f);
generalPath.curveTo(62.900017f, 80.4f, 63.700016f, 81.1f, 64.20001f, 81.9f);
generalPath.curveTo(64.70001f, 82.700005f, 65.000015f, 83.8f, 65.000015f, 85.1f);
generalPath.curveTo(65.000015f, 86.2f, 64.70001f, 87.299995f, 64.000015f, 88.299995f);
generalPath.curveTo(63.400017f, 89.299995f, 62.500015f, 89.99999f, 61.300014f, 90.49999f);
generalPath.curveTo(60.100014f, 90.99999f, 58.700016f, 91.19999f, 57.000015f, 91.19999f);
generalPath.curveTo(54.500015f, 91.19999f, 52.500015f, 90.59999f, 51.200016f, 89.49999f);
generalPath.curveTo(49.900017f, 88.49999f, 49.100018f, 86.799995f, 48.800014f, 84.59999f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.22100067138672, 25.77899932861328), new Point2D.Double(58.672000885009766, 12.329000473022461), new float[] {0.484f,0.931f,0.998f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 248, 210, 255)) : new Color(204, 248, 210, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 155, 78, 255)) : new Color(66, 155, 78, 255)),((colorFilter != null) ? colorFilter.filter(new Color(45, 113, 54, 255)) : new Color(45, 113, 54, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(35, 84, 39, 255)) : new Color(35, 84, 39, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(47.6f, 41.1f);
generalPath.lineTo(59.0f, 41.1f);
generalPath.lineTo(59.0f, 48.699997f);
generalPath.lineTo(47.6f, 48.699997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(53.279998779296875, 41.060001373291016), new Point2D.Double(53.279998779296875, 48.65599822998047), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(35, 84, 39, 255)) : new Color(35, 84, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(68, 152, 75, 255)) : new Color(68, 152, 75, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(47.6f, 52.8f);
generalPath.lineTo(59.0f, 52.8f);
generalPath.lineTo(59.0f, 60.399998f);
generalPath.lineTo(47.6f, 60.399998f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(53.279998779296875, 52.78200149536133), new Point2D.Double(53.279998779296875, 60.37799835205078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(35, 84, 39, 255)) : new Color(35, 84, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(68, 152, 75, 255)) : new Color(68, 152, 75, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(36.6f, 36.0f);
generalPath.lineTo(38.199997f, 36.0f);
generalPath.curveTo(40.6f, 36.2f, 42.499996f, 36.8f, 44.399998f, 37.5f);
generalPath.curveTo(47.999996f, 35.9f, 53.0f, 37.1f, 56.199997f, 38.3f);
generalPath.curveTo(52.199997f, 37.899998f, 47.399998f, 38.3f, 44.6f, 39.899998f);
generalPath.curveTo(41.8f, 37.6f, 36.5f, 36.999996f, 31.599998f, 37.6f);
generalPath.curveTo(32.899998f, 36.8f, 34.6f, 36.199997f, 36.6f, 36.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(43.85499954223633, 36.0359992980957), new Point2D.Double(43.85499954223633, 39.974998474121094), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(35, 84, 39, 255)) : new Color(35, 84, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(68, 152, 75, 255)) : new Color(68, 152, 75, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.5f, 42.1f);
generalPath.curveTo(32.6f, 42.3f, 30.2f, 43.199997f, 28.7f, 44.5f);
generalPath.curveTo(23.900002f, 42.3f, 15.700001f, 43.3f, 12.6f, 46.2f);
generalPath.curveTo(12.3f, 46.4f, 12.0f, 46.600002f, 12.1f, 46.9f);
generalPath.curveTo(14.8f, 46.100002f, 18.1f, 45.4f, 21.5f, 45.7f);
generalPath.curveTo(24.9f, 46.0f, 27.4f, 47.100002f, 29.3f, 48.600002f);
generalPath.curveTo(32.8f, 45.500004f, 37.9f, 43.7f, 44.4f, 43.800003f);
generalPath.curveTo(42.0f, 42.800003f, 38.7f, 41.9f, 35.5f, 42.100002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.138999938964844, 42.10499954223633), new Point2D.Double(28.138999938964844, 48.60200119018555), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(35, 84, 39, 255)) : new Color(35, 84, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(68, 152, 75, 255)) : new Color(68, 152, 75, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.2f, 52.9f);
generalPath.lineTo(43.6f, 52.9f);
generalPath.lineTo(43.6f, 60.5f);
generalPath.lineTo(32.2f, 60.5f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.90800094604492, 52.867000579833984), new Point2D.Double(37.90800094604492, 60.46200180053711), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(35, 84, 39, 255)) : new Color(35, 84, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(68, 152, 75, 255)) : new Color(68, 152, 75, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(16.7f, 52.9f);
generalPath.lineTo(28.1f, 52.9f);
generalPath.lineTo(28.1f, 60.5f);
generalPath.lineTo(16.7f, 60.5f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(22.434999465942383, 52.867000579833984), new Point2D.Double(22.434999465942383, 60.46200180053711), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(35, 84, 39, 255)) : new Color(35, 84, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(68, 152, 75, 255)) : new Color(68, 152, 75, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
        return 0.13300000131130219;
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
		return 0.7379999160766602;
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
	private ext_ods() {
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
       ext_ods base = new ext_ods();
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
       ext_ods base = new ext_ods();
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
        return ext_ods::new;
    }
}

