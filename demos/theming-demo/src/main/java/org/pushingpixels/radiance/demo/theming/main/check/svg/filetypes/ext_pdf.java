package org.pushingpixels.radiance.demo.laf.main.check.svg.filetypes;

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
public class ext_pdf implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 0.7670000195503235), new Point2D.Double(36.0, 99.25), new float[] {0.005f,0.047f,0.116f,0.196f,0.289f,0.403f,0.563f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(110, 14, 16, 255)) : new Color(110, 14, 16, 255)),((colorFilter != null) ? colorFilter.filter(new Color(126, 20, 22, 255)) : new Color(126, 20, 22, 255)),((colorFilter != null) ? colorFilter.filter(new Color(148, 25, 28, 255)) : new Color(148, 25, 28, 255)),((colorFilter != null) ? colorFilter.filter(new Color(167, 29, 33, 255)) : new Color(167, 29, 33, 255)),((colorFilter != null) ? colorFilter.filter(new Color(182, 31, 36, 255)) : new Color(182, 31, 36, 255)),((colorFilter != null) ? colorFilter.filter(new Color(192, 32, 38, 255)) : new Color(192, 32, 38, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 32, 39, 255)) : new Color(199, 32, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(200, 33, 39, 255)) : new Color(200, 33, 39, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(149, 27, 31, 255)) : new Color(149, 27, 31, 255);
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
generalPath.moveTo(9.9f, 91.3f);
generalPath.lineTo(9.9f, 71.3f);
generalPath.lineTo(16.4f, 71.3f);
generalPath.curveTo(18.9f, 71.3f, 20.5f, 71.4f, 21.2f, 71.600006f);
generalPath.curveTo(22.300001f, 71.90001f, 23.300001f, 72.50001f, 24.1f, 73.600006f);
generalPath.curveTo(24.9f, 74.600006f, 25.300001f, 75.90001f, 25.300001f, 77.50001f);
generalPath.curveTo(25.300001f, 78.700005f, 25.1f, 79.80001f, 24.6f, 80.600006f);
generalPath.curveTo(24.2f, 81.40001f, 23.6f, 82.100006f, 22.9f, 82.600006f);
generalPath.curveTo(22.199999f, 83.100006f, 21.5f, 83.40001f, 20.8f, 83.50001f);
generalPath.curveTo(19.8f, 83.700005f, 18.4f, 83.80001f, 16.599998f, 83.80001f);
generalPath.lineTo(14.0f, 83.80001f);
generalPath.lineTo(14.0f, 91.30001f);
generalPath.lineTo(9.9f, 91.30001f);
generalPath.closePath();
generalPath.moveTo(14.0f, 74.7f);
generalPath.lineTo(14.0f, 80.399994f);
generalPath.lineTo(16.2f, 80.399994f);
generalPath.curveTo(17.800001f, 80.399994f, 18.900002f, 80.299995f, 19.400002f, 80.09999f);
generalPath.curveTo(19.900002f, 79.899994f, 20.400002f, 79.59999f, 20.7f, 79.09999f);
generalPath.curveTo(21.0f, 78.69999f, 21.2f, 78.09999f, 21.2f, 77.49999f);
generalPath.curveTo(21.2f, 76.799995f, 21.0f, 76.19999f, 20.6f, 75.69999f);
generalPath.curveTo(20.2f, 75.19999f, 19.6f, 74.89999f, 19.0f, 74.79999f);
generalPath.curveTo(18.5f, 74.69999f, 17.5f, 74.69999f, 16.1f, 74.69999f);
generalPath.lineTo(14.0f, 74.69999f);
generalPath.closePath();
generalPath.moveTo(28.6f, 71.299995f);
generalPath.lineTo(36.0f, 71.299995f);
generalPath.curveTo(37.7f, 71.299995f, 38.9f, 71.399994f, 39.8f, 71.7f);
generalPath.curveTo(41.0f, 72.0f, 42.0f, 72.7f, 42.8f, 73.5f);
generalPath.curveTo(43.6f, 74.4f, 44.3f, 75.5f, 44.7f, 76.7f);
generalPath.curveTo(45.100002f, 78.0f, 45.4f, 79.5f, 45.4f, 81.399994f);
generalPath.curveTo(45.4f, 82.99999f, 45.2f, 84.49999f, 44.800003f, 85.59999f);
generalPath.curveTo(44.300003f, 87.09999f, 43.600002f, 88.19999f, 42.700005f, 89.09999f);
generalPath.curveTo(42.000004f, 89.79999f, 41.000004f, 90.29999f, 39.900005f, 90.69999f);
generalPath.curveTo(39.000004f, 90.99999f, 37.800007f, 91.09999f, 36.300007f, 91.09999f);
generalPath.lineTo(28.700006f, 91.09999f);
generalPath.lineTo(28.700006f, 71.3f);
generalPath.closePath();
generalPath.moveTo(32.6f, 74.7f);
generalPath.lineTo(32.6f, 87.899994f);
generalPath.lineTo(35.6f, 87.899994f);
generalPath.curveTo(36.699997f, 87.899994f, 37.5f, 87.799995f, 38.0f, 87.7f);
generalPath.curveTo(38.7f, 87.5f, 39.2f, 87.299995f, 39.6f, 86.899994f);
generalPath.curveTo(40.0f, 86.49999f, 40.399998f, 85.899994f, 40.699997f, 84.99999f);
generalPath.curveTo(40.999996f, 84.09999f, 41.1f, 82.899994f, 41.1f, 81.299995f);
generalPath.curveTo(41.1f, 79.799995f, 41.0f, 78.6f, 40.699997f, 77.799995f);
generalPath.curveTo(40.399994f, 76.99999f, 39.999996f, 76.299995f, 39.6f, 75.899994f);
generalPath.curveTo(39.1f, 75.399994f, 38.5f, 75.09999f, 37.699997f, 74.99999f);
generalPath.curveTo(37.1f, 74.899994f, 35.999996f, 74.799995f, 34.399998f, 74.799995f);
generalPath.lineTo(32.6f, 74.799995f);
generalPath.closePath();
generalPath.moveTo(48.8f, 91.299995f);
generalPath.lineTo(48.8f, 71.299995f);
generalPath.lineTo(62.5f, 71.299995f);
generalPath.lineTo(62.5f, 74.7f);
generalPath.lineTo(52.8f, 74.7f);
generalPath.lineTo(52.8f, 79.399994f);
generalPath.lineTo(61.199997f, 79.399994f);
generalPath.lineTo(61.199997f, 82.799995f);
generalPath.lineTo(52.799995f, 82.799995f);
generalPath.lineTo(52.799995f, 91.299995f);
generalPath.lineTo(48.799995f, 91.299995f);
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.03499984741211, 72.35600280761719), new Point2D.Double(58.53499984741211, 85.85600280761719), new float[] {0.0f,0.166f,0.302f,0.427f,0.546f,0.661f,0.772f,0.88f,0.984f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(253, 223, 216, 255)) : new Color(253, 223, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 220, 212, 255)) : new Color(252, 220, 212, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 211, 201, 255)) : new Color(249, 211, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 197, 183, 255)) : new Color(244, 197, 183, 255)),((colorFilter != null) ? colorFilter.filter(new Color(239, 177, 160, 255)) : new Color(239, 177, 160, 255)),((colorFilter != null) ? colorFilter.filter(new Color(233, 153, 131, 255)) : new Color(233, 153, 131, 255)),((colorFilter != null) ? colorFilter.filter(new Color(226, 126, 102, 255)) : new Color(226, 126, 102, 255)),((colorFilter != null) ? colorFilter.filter(new Color(218, 92, 70, 255)) : new Color(218, 92, 70, 255)),((colorFilter != null) ? colorFilter.filter(new Color(210, 43, 42, 255)) : new Color(210, 43, 42, 255)),((colorFilter != null) ? colorFilter.filter(new Color(209, 32, 39, 255)) : new Color(209, 32, 39, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(142, 25, 28, 255)) : new Color(142, 25, 28, 255);
stroke = new BasicStroke(2.0f,0,1,4.0f,null,0.0f);
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
generalPath.moveTo(15.7f, 54.3f);
generalPath.curveTo(12.799999f, 57.3f, 9.0f, 59.5f, 7.8999996f, 64.2f);
generalPath.curveTo(14.9f, 62.499996f, 18.9f, 54.999996f, 22.8f, 48.299995f);
generalPath.curveTo(24.4f, 45.499996f, 26.599998f, 41.899994f, 28.5f, 38.099995f);
generalPath.curveTo(30.1f, 34.799995f, 32.7f, 29.699995f, 32.8f, 26.799995f);
generalPath.curveTo(33.0f, 21.299995f, 28.3f, 14.199995f, 32.399998f, 8.799995f);
generalPath.curveTo(34.999996f, 8.399996f, 36.399998f, 9.299995f, 35.999996f, 11.999995f);
generalPath.curveTo(35.199997f, 11.199995f, 35.499996f, 9.499995f, 33.899998f, 9.499995f);
generalPath.curveTo(31.099998f, 12.099995f, 32.699997f, 19.899994f, 33.899998f, 22.899994f);
generalPath.curveTo(34.6f, 20.599995f, 35.3f, 18.099995f, 35.3f, 15.099994f);
generalPath.curveTo(36.5f, 19.399994f, 34.6f, 22.999994f, 34.899998f, 26.399994f);
generalPath.curveTo(35.899998f, 35.099995f, 43.799995f, 40.199993f, 49.799995f, 44.099995f);
generalPath.curveTo(55.599995f, 43.899994f, 65.1f, 42.399994f, 67.59999f, 46.599995f);
generalPath.curveTo(66.99999f, 47.499996f, 65.79999f, 45.899994f, 64.399994f, 45.499996f);
generalPath.curveTo(61.299995f, 44.799995f, 56.699993f, 45.399998f, 52.999992f, 45.099995f);
generalPath.curveTo(56.499992f, 47.399994f, 60.899994f, 48.799995f, 66.899994f, 48.699993f);
generalPath.curveTo(61.399994f, 52.599995f, 53.599995f, 46.099995f, 48.799995f, 45.499992f);
generalPath.curveTo(41.799995f, 44.59999f, 33.999996f, 48.899994f, 27.099995f, 49.399994f);
generalPath.curveTo(32.699993f, 46.899994f, 39.499992f, 45.699993f, 46.299995f, 44.399994f);
generalPath.curveTo(41.099995f, 40.599995f, 36.599995f, 36.099995f, 34.199997f, 29.599995f);
generalPath.curveTo(32.499996f, 35.299995f, 28.699997f, 41.699997f, 24.999996f, 47.999992f);
generalPath.curveTo(21.299995f, 54.09999f, 17.999996f, 60.59999f, 13.299996f, 63.899994f);
generalPath.curveTo(11.199997f, 65.399994f, 8.899996f, 65.7f, 6.499996f, 64.299995f);
generalPath.curveTo(7.099996f, 58.899994f, 13.199996f, 55.499996f, 15.699996f, 54.299995f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(10.267999649047852, 31.916000366210938), new Point2D.Double(52.27399826049805, 73.9209976196289), new float[] {0.005f,0.432f,0.639f,0.799f,0.933f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(165, 13, 18, 255)) : new Color(165, 13, 18, 255)),((colorFilter != null) ? colorFilter.filter(new Color(162, 13, 18, 255)) : new Color(162, 13, 18, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 12, 16, 255)) : new Color(154, 12, 16, 255)),((colorFilter != null) ? colorFilter.filter(new Color(140, 9, 11, 255)) : new Color(140, 9, 11, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 4, 5, 255)) : new Color(123, 4, 5, 255)),((colorFilter != null) ? colorFilter.filter(new Color(112, 1, 1, 255)) : new Color(112, 1, 1, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(6.8f, 65.5f);
generalPath.lineTo(6.5f, 65.6f);
generalPath.lineTo(6.5f, 65.4f);
generalPath.lineTo(5.9f, 65.1f);
generalPath.lineTo(5.3f, 64.799995f);
generalPath.lineTo(5.4f, 64.2f);
generalPath.curveTo(6.2000003f, 58.1f, 12.700001f, 54.699997f, 15.200001f, 53.499996f);
generalPath.lineTo(16.300001f, 55.099995f);
generalPath.curveTo(13.700001f, 57.799995f, 10.800001f, 59.599995f, 9.400002f, 62.799995f);
generalPath.curveTo(14.800001f, 60.499996f, 18.300001f, 53.999996f, 21.900002f, 47.999996f);
generalPath.curveTo(23.500002f, 45.199997f, 25.7f, 41.599995f, 27.600002f, 37.899994f);
generalPath.curveTo(29.200003f, 34.699993f, 31.700003f, 29.499994f, 31.800003f, 26.999994f);
generalPath.lineTo(31.800003f, 26.699995f);
generalPath.curveTo(31.800003f, 23.299995f, 29.700003f, 18.799995f, 29.700003f, 14.499995f);
generalPath.curveTo(29.700003f, 12.399996f, 30.200003f, 10.299995f, 31.600002f, 8.499995f);
generalPath.lineTo(31.800003f, 7.999995f);
generalPath.lineTo(32.200005f, 7.8999953f);
generalPath.curveTo(32.600006f, 7.7999954f, 33.000004f, 7.7999954f, 33.400005f, 7.7999954f);
generalPath.curveTo(34.400005f, 7.7999954f, 35.300007f, 7.999995f, 36.000004f, 8.599996f);
generalPath.curveTo(36.700005f, 9.199996f, 37.000004f, 10.199996f, 37.000004f, 11.199995f);
generalPath.curveTo(37.000004f, 11.499995f, 37.000004f, 11.899995f, 36.900005f, 12.299995f);
generalPath.lineTo(36.600006f, 14.199995f);
generalPath.lineTo(35.200005f, 12.899995f);
generalPath.curveTo(34.500004f, 12.199995f, 34.400005f, 11.499995f, 34.200005f, 11.099995f);
generalPath.curveTo(34.100006f, 10.999994f, 34.100006f, 10.899995f, 34.100006f, 10.899995f);
generalPath.curveTo(33.500008f, 11.699995f, 33.200005f, 13.199995f, 33.200005f, 14.899995f);
generalPath.curveTo(33.200005f, 16.399994f, 33.400005f, 17.999994f, 33.700005f, 19.499994f);
generalPath.curveTo(34.000004f, 18.199995f, 34.100006f, 16.899994f, 34.200005f, 15.399994f);
generalPath.lineTo(36.200005f, 15.099994f);
generalPath.curveTo(36.500004f, 16.199993f, 36.700005f, 17.399994f, 36.700005f, 18.399994f);
generalPath.curveTo(36.700005f, 21.199993f, 35.900005f, 23.699993f, 35.900005f, 25.799994f);
generalPath.lineTo(35.900005f, 26.699993f);
generalPath.curveTo(36.700005f, 34.699993f, 44.100006f, 39.699993f, 50.100006f, 43.499992f);
generalPath.curveTo(52.500008f, 43.399994f, 55.700005f, 43.09999f, 58.700005f, 43.09999f);
generalPath.curveTo(62.700005f, 43.09999f, 66.600006f, 43.59999f, 68.50001f, 46.499992f);
generalPath.lineTo(68.80001f, 47.09999f);
generalPath.lineTo(68.40001f, 47.59999f);
generalPath.curveTo(68.30001f, 47.79999f, 68.00001f, 47.999992f, 67.80001f, 48.09999f);
generalPath.lineTo(70.10001f, 47.999992f);
generalPath.lineTo(67.500015f, 49.899994f);
generalPath.curveTo(66.10001f, 50.899994f, 64.500015f, 51.299995f, 62.900017f, 51.299995f);
generalPath.curveTo(57.600018f, 51.199997f, 52.000015f, 47.199997f, 48.700016f, 46.799995f);
generalPath.curveTo(48.100018f, 46.699997f, 47.500015f, 46.699997f, 46.900017f, 46.699997f);
generalPath.curveTo(40.80002f, 46.699997f, 33.80002f, 50.199997f, 27.300016f, 50.699997f);
generalPath.lineTo(26.800016f, 48.799995f);
generalPath.curveTo(31.900017f, 46.499996f, 38.000015f, 45.299995f, 44.000015f, 44.199997f);
generalPath.curveTo(40.100014f, 41.1f, 36.700016f, 37.499996f, 34.400017f, 32.799995f);
generalPath.curveTo(32.400017f, 37.999996f, 29.200016f, 43.499996f, 25.900017f, 48.899994f);
generalPath.curveTo(22.200016f, 54.999992f, 18.900017f, 61.499992f, 13.900017f, 65.09999f);
generalPath.curveTo(12.600017f, 65.99999f, 11.200017f, 66.59999f, 9.700017f, 66.59999f);
generalPath.curveTo(8.600017f, 66.09999f, 7.700017f, 65.899994f, 6.800017f, 65.49999f);
generalPath.closePath();
generalPath.moveTo(66.0f, 47.7f);
generalPath.lineTo(66.5f, 47.7f);
generalPath.curveTo(66.0f, 47.5f, 65.7f, 47.3f, 65.4f, 47.100002f);
generalPath.curveTo(64.9f, 46.800003f, 64.5f, 46.500004f, 64.200005f, 46.500004f);
generalPath.curveTo(63.100006f, 46.200005f, 61.600006f, 46.100002f, 60.000004f, 46.100002f);
generalPath.lineTo(57.100002f, 46.100002f);
generalPath.curveTo(59.600002f, 47.100002f, 62.500004f, 47.7f, 66.0f, 47.7f);
generalPath.closePath();
generalPath.moveTo(51.1f, 45.0f);
generalPath.lineTo(51.0f, 45.0f);
generalPath.lineTo(51.1f, 45.0f);
generalPath.closePath();
generalPath.moveTo(48.6f, 44.4f);
generalPath.curveTo(46.899998f, 43.300003f, 45.1f, 42.100002f, 43.3f, 40.800003f);
generalPath.curveTo(44.399998f, 41.800003f, 45.6f, 42.700005f, 46.8f, 43.600002f);
generalPath.lineTo(47.899998f, 44.4f);
generalPath.lineTo(48.6f, 44.4f);
generalPath.closePath();
generalPath.moveTo(33.8f, 26.400002f);
generalPath.lineTo(33.8f, 26.800001f);
generalPath.curveTo(33.8f, 27.2f, 33.7f, 27.6f, 33.7f, 28.000002f);
generalPath.lineTo(34.0f, 26.900002f);
generalPath.lineTo(34.0f, 26.500002f);
generalPath.curveTo(34.0f, 26.200003f, 33.9f, 25.900002f, 33.9f, 25.600002f);
generalPath.lineTo(33.800003f, 25.300003f);
generalPath.curveTo(33.700005f, 25.600002f, 33.800003f, 26.000004f, 33.800003f, 26.400003f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(9.781999588012695, 30.875), new Point2D.Double(53.23899841308594, 74.33200073242188), new float[] {0.005f,0.432f,0.639f,0.799f,0.933f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(165, 13, 18, 255)) : new Color(165, 13, 18, 255)),((colorFilter != null) ? colorFilter.filter(new Color(162, 13, 18, 255)) : new Color(162, 13, 18, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 12, 16, 255)) : new Color(154, 12, 16, 255)),((colorFilter != null) ? colorFilter.filter(new Color(140, 9, 11, 255)) : new Color(140, 9, 11, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 4, 5, 255)) : new Color(123, 4, 5, 255)),((colorFilter != null) ? colorFilter.filter(new Color(112, 1, 1, 255)) : new Color(112, 1, 1, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
		return 0.740787923336029;
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
	private ext_pdf() {
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
       ext_pdf base = new ext_pdf();
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
       ext_pdf base = new ext_pdf();
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
        return ext_pdf::new;
    }
}

