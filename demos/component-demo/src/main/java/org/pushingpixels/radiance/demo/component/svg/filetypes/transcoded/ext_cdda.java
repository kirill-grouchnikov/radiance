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
public class ext_cdda implements RadianceIcon {
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
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
generalPath.moveTo(16.0f, 84.3f);
generalPath.lineTo(19.1f, 85.3f);
generalPath.curveTo(18.6f, 87.0f, 17.800001f, 88.3f, 16.7f, 89.100006f);
generalPath.curveTo(15.6f, 89.90001f, 14.200001f, 90.40001f, 12.500001f, 90.40001f);
generalPath.curveTo(10.400002f, 90.40001f, 8.6f, 89.70001f, 7.300001f, 88.30001f);
generalPath.curveTo(5.900001f, 86.90001f, 5.300001f, 84.90001f, 5.300001f, 82.40001f);
generalPath.curveTo(5.300001f, 79.80001f, 6.000001f, 77.70001f, 7.400001f, 76.30001f);
generalPath.curveTo(8.800001f, 74.90001f, 10.600001f, 74.10001f, 12.800001f, 74.10001f);
generalPath.curveTo(14.800001f, 74.10001f, 16.300001f, 74.70001f, 17.600002f, 75.80001f);
generalPath.curveTo(18.300003f, 76.50001f, 18.900002f, 77.40001f, 19.200003f, 78.70001f);
generalPath.lineTo(16.000002f, 79.500015f);
generalPath.curveTo(15.800002f, 78.70001f, 15.400002f, 78.000015f, 14.800002f, 77.60001f);
generalPath.curveTo(14.200003f, 77.20001f, 13.500002f, 76.90002f, 12.600002f, 76.90002f);
generalPath.curveTo(11.4000025f, 76.90002f, 10.500002f, 77.30002f, 9.700003f, 78.20002f);
generalPath.curveTo(8.900003f, 79.10002f, 8.600002f, 80.40002f, 8.600002f, 82.30002f);
generalPath.curveTo(8.600002f, 84.30002f, 9.000002f, 85.70002f, 9.700003f, 86.60002f);
generalPath.curveTo(10.400003f, 87.50002f, 11.4000025f, 87.900024f, 12.500003f, 87.900024f);
generalPath.curveTo(13.4000025f, 87.900024f, 14.100003f, 87.60002f, 14.700003f, 87.10002f);
generalPath.curveTo(15.300002f, 86.60002f, 15.800003f, 85.400024f, 16.000002f, 84.30002f);
generalPath.closePath();
generalPath.moveTo(21.9f, 74.3f);
generalPath.lineTo(27.8f, 74.3f);
generalPath.curveTo(29.099998f, 74.3f, 30.099998f, 74.4f, 30.8f, 74.600006f);
generalPath.curveTo(31.699999f, 74.90001f, 32.5f, 75.40001f, 33.2f, 76.100006f);
generalPath.curveTo(33.9f, 76.8f, 34.4f, 77.600006f, 34.7f, 78.700005f);
generalPath.curveTo(35.0f, 79.700005f, 35.2f, 80.9f, 35.2f, 82.4f);
generalPath.curveTo(35.2f, 83.700005f, 35.0f, 84.8f, 34.7f, 85.8f);
generalPath.curveTo(34.3f, 86.9f, 33.7f, 87.9f, 33.0f, 88.600006f);
generalPath.curveTo(32.4f, 89.100006f, 31.7f, 89.600006f, 30.7f, 89.90001f);
generalPath.curveTo(30.0f, 90.100006f, 29.0f, 90.20001f, 27.800001f, 90.20001f);
generalPath.lineTo(21.7f, 90.20001f);
generalPath.lineTo(21.7f, 74.3f);
generalPath.closePath();
generalPath.moveTo(25.1f, 77.0f);
generalPath.lineTo(25.1f, 87.4f);
generalPath.lineTo(27.5f, 87.4f);
generalPath.curveTo(28.4f, 87.4f, 29.0f, 87.4f, 29.4f, 87.200005f);
generalPath.curveTo(29.9f, 87.100006f, 30.4f, 86.9f, 30.699999f, 86.50001f);
generalPath.curveTo(30.999998f, 86.200005f, 31.3f, 85.700005f, 31.499998f, 85.00001f);
generalPath.curveTo(31.699999f, 84.30001f, 31.799997f, 83.30001f, 31.799997f, 82.100006f);
generalPath.curveTo(31.799997f, 80.9f, 31.699997f, 79.90001f, 31.499998f, 79.3f);
generalPath.curveTo(31.3f, 78.7f, 30.999998f, 78.100006f, 30.599998f, 77.8f);
generalPath.curveTo(30.199999f, 77.5f, 29.699999f, 77.200005f, 29.099998f, 77.100006f);
generalPath.curveTo(28.8f, 77.00001f, 27.899998f, 77.00001f, 26.599998f, 77.00001f);
generalPath.lineTo(25.099998f, 77.00001f);
generalPath.closePath();
generalPath.moveTo(38.0f, 74.3f);
generalPath.lineTo(43.9f, 74.3f);
generalPath.curveTo(45.2f, 74.3f, 46.2f, 74.4f, 46.9f, 74.600006f);
generalPath.curveTo(47.800003f, 74.90001f, 48.600002f, 75.40001f, 49.300003f, 76.100006f);
generalPath.curveTo(50.000004f, 76.8f, 50.500004f, 77.600006f, 50.800003f, 78.700005f);
generalPath.curveTo(51.100002f, 79.700005f, 51.300003f, 80.9f, 51.300003f, 82.4f);
generalPath.curveTo(51.300003f, 83.700005f, 51.100002f, 84.8f, 50.800003f, 85.8f);
generalPath.curveTo(50.4f, 86.9f, 49.800003f, 87.9f, 49.100002f, 88.600006f);
generalPath.curveTo(48.500004f, 89.100006f, 47.800003f, 89.600006f, 46.800003f, 89.90001f);
generalPath.curveTo(46.100002f, 90.100006f, 45.100002f, 90.20001f, 43.9f, 90.20001f);
generalPath.lineTo(38.0f, 90.20001f);
generalPath.lineTo(38.0f, 74.3f);
generalPath.closePath();
generalPath.moveTo(41.2f, 77.0f);
generalPath.lineTo(41.2f, 87.4f);
generalPath.lineTo(43.600002f, 87.4f);
generalPath.curveTo(44.500004f, 87.4f, 45.100002f, 87.4f, 45.500004f, 87.200005f);
generalPath.curveTo(46.000004f, 87.100006f, 46.500004f, 86.9f, 46.800003f, 86.50001f);
generalPath.curveTo(47.100002f, 86.10001f, 47.4f, 85.700005f, 47.600002f, 85.00001f);
generalPath.curveTo(47.800003f, 84.30001f, 47.9f, 83.30001f, 47.9f, 82.100006f);
generalPath.curveTo(47.9f, 80.9f, 47.800003f, 79.90001f, 47.600002f, 79.3f);
generalPath.curveTo(47.4f, 78.7f, 47.100002f, 78.100006f, 46.7f, 77.8f);
generalPath.curveTo(46.3f, 77.4f, 45.8f, 77.200005f, 45.2f, 77.100006f);
generalPath.curveTo(44.9f, 77.00001f, 44.0f, 77.00001f, 42.7f, 77.00001f);
generalPath.lineTo(41.2f, 77.00001f);
generalPath.closePath();
generalPath.moveTo(68.5f, 90.1f);
generalPath.lineTo(65.0f, 90.1f);
generalPath.lineTo(63.6f, 86.5f);
generalPath.lineTo(57.199997f, 86.5f);
generalPath.lineTo(55.899998f, 90.1f);
generalPath.lineTo(52.499996f, 90.1f);
generalPath.lineTo(58.699997f, 74.4f);
generalPath.lineTo(62.1f, 74.4f);
generalPath.lineTo(68.5f, 90.1f);
generalPath.closePath();
generalPath.moveTo(62.6f, 83.799995f);
generalPath.lineTo(60.4f, 78.0f);
generalPath.lineTo(58.2f, 83.8f);
generalPath.lineTo(62.600002f, 83.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.8f, 32.0f);
generalPath.curveTo(31.699999f, 32.1f, 31.699999f, 32.1f, 31.8f, 32.0f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
// _0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.1f, 58.0f);
generalPath.lineTo(43.1f, 41.3f);
generalPath.lineTo(52.899998f, 39.7f);
generalPath.curveTo(51.3f, 31.400002f, 44.1f, 25.1f, 35.299995f, 25.1f);
generalPath.curveTo(25.399996f, 25.1f, 17.399996f, 33.1f, 17.399996f, 43.0f);
generalPath.curveTo(17.399996f, 52.9f, 25.399996f, 60.9f, 35.299995f, 60.9f);
generalPath.curveTo(36.299995f, 60.9f, 37.199997f, 60.800003f, 38.099995f, 60.7f);
generalPath.curveTo(38.799995f, 59.5f, 40.099995f, 58.600002f, 41.699993f, 58.100002f);
generalPath.curveTo(42.199993f, 58.100002f, 42.599995f, 58.000004f, 43.099995f, 58.000004f);
generalPath.closePath();
generalPath.moveTo(38.6f, 26.7f);
generalPath.lineTo(36.699997f, 35.1f);
generalPath.lineTo(34.799995f, 35.1f);
generalPath.lineTo(33.399994f, 26.699999f);
generalPath.curveTo(35.399994f, 25.699999f, 38.599995f, 26.699999f, 38.599995f, 26.699999f);
generalPath.closePath();
generalPath.moveTo(35.3f, 49.7f);
generalPath.curveTo(31.599998f, 49.7f, 28.699999f, 46.7f, 28.699999f, 43.100002f);
generalPath.curveTo(28.699999f, 39.4f, 31.699999f, 36.500004f, 35.3f, 36.500004f);
generalPath.curveTo(38.9f, 36.500004f, 41.899998f, 39.500004f, 41.899998f, 43.100002f);
generalPath.curveTo(41.899998f, 46.800003f, 38.999996f, 49.7f, 35.3f, 49.7f);
generalPath.closePath();
generalPath.moveTo(35.3f, 38.0f);
generalPath.curveTo(32.5f, 38.0f, 30.199999f, 40.3f, 30.199999f, 43.1f);
generalPath.curveTo(30.199999f, 45.899998f, 32.5f, 48.199997f, 35.3f, 48.199997f);
generalPath.curveTo(38.1f, 48.199997f, 40.399998f, 45.899998f, 40.399998f, 43.1f);
generalPath.curveTo(40.399998f, 40.3f, 38.1f, 38.0f, 35.3f, 38.0f);
generalPath.closePath();
generalPath.moveTo(35.3f, 46.7f);
generalPath.curveTo(33.3f, 46.7f, 31.699999f, 45.100002f, 31.699999f, 43.100002f);
generalPath.curveTo(31.699999f, 41.100002f, 33.3f, 39.500004f, 35.3f, 39.500004f);
generalPath.curveTo(37.3f, 39.500004f, 38.899998f, 41.100002f, 38.899998f, 43.100002f);
generalPath.curveTo(38.899998f, 45.100002f, 37.3f, 46.7f, 35.3f, 46.7f);
generalPath.closePath();
generalPath.moveTo(37.6f, 63.9f);
generalPath.curveTo(37.699997f, 64.4f, 37.899998f, 64.8f, 38.199997f, 65.200005f);
generalPath.curveTo(37.299995f, 65.3f, 36.299995f, 65.4f, 35.399998f, 65.4f);
generalPath.curveTo(23.0f, 65.4f, 13.0f, 55.4f, 13.0f, 43.1f);
generalPath.curveTo(13.0f, 30.799995f, 23.0f, 20.8f, 35.3f, 20.8f);
generalPath.curveTo(46.199997f, 20.8f, 55.3f, 28.699999f, 57.199997f, 39.0f);
generalPath.lineTo(54.999996f, 39.4f);
generalPath.curveTo(53.3f, 30.1f, 45.1f, 23.0f, 35.3f, 23.0f);
generalPath.curveTo(24.199999f, 23.0f, 15.199999f, 32.0f, 15.199999f, 43.1f);
generalPath.curveTo(15.199999f, 54.199997f, 24.199999f, 63.199997f, 35.3f, 63.199997f);
generalPath.curveTo(36.0f, 63.199997f, 36.8f, 63.199997f, 37.5f, 63.1f);
generalPath.curveTo(37.5f, 63.3f, 37.5f, 63.6f, 37.6f, 63.899998f);
generalPath.closePath();
generalPath.moveTo(59.5f, 40.300003f);
generalPath.lineTo(59.5f, 59.600002f);
generalPath.curveTo(59.5f, 61.2f, 58.3f, 62.500004f, 56.4f, 62.9f);
generalPath.curveTo(54.4f, 63.4f, 52.4f, 62.600002f, 52.0f, 61.0f);
generalPath.curveTo(51.6f, 59.4f, 52.9f, 57.8f, 55.0f, 57.2f);
generalPath.curveTo(55.9f, 57.0f, 56.8f, 57.0f, 57.6f, 57.3f);
generalPath.lineTo(57.6f, 45.7f);
generalPath.lineTo(47.199997f, 47.600002f);
generalPath.lineTo(47.199997f, 62.100002f);
generalPath.curveTo(47.199997f, 63.500004f, 45.999996f, 64.8f, 44.199997f, 65.3f);
generalPath.curveTo(42.199997f, 65.8f, 40.1f, 64.8f, 39.799995f, 63.4f);
generalPath.curveTo(39.399994f, 61.800003f, 40.699997f, 60.2f, 42.799995f, 59.7f);
generalPath.curveTo(43.699997f, 59.5f, 44.599995f, 59.5f, 45.299995f, 59.8f);
generalPath.lineTo(45.299995f, 42.6f);
generalPath.lineTo(59.499996f, 40.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.25, 65.36699676513672), new Point2D.Double(36.25, 20.819000244140625), new float[] {0.0f,0.633f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
		return 0.7420000433921814;
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
	private ext_cdda() {
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
       ext_cdda base = new ext_cdda();
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
       ext_cdda base = new ext_cdda();
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
        return ext_cdda::new;
    }
}

