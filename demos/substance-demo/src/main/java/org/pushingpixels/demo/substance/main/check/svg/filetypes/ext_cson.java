package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_cson implements RadianceIcon {
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(16.5f, 86.1f);
generalPath.lineTo(19.6f, 87.1f);
generalPath.curveTo(19.1f, 88.799995f, 18.300001f, 90.1f, 17.2f, 90.9f);
generalPath.curveTo(16.1f, 91.700005f, 14.700001f, 92.200005f, 13.000001f, 92.200005f);
generalPath.curveTo(10.900002f, 92.200005f, 9.200001f, 91.50001f, 7.800001f, 90.100006f);
generalPath.curveTo(6.500001f, 88.700005f, 5.800001f, 86.700005f, 5.800001f, 84.200005f);
generalPath.curveTo(5.800001f, 81.600006f, 6.500001f, 79.50001f, 7.800001f, 78.100006f);
generalPath.curveTo(9.200001f, 76.700005f, 10.900002f, 75.90001f, 13.100001f, 75.90001f);
generalPath.curveTo(15.000001f, 75.90001f, 16.600002f, 76.50001f, 17.800001f, 77.600006f);
generalPath.curveTo(18.500002f, 78.3f, 19.1f, 79.200005f, 19.400002f, 80.50001f);
generalPath.lineTo(16.300001f, 81.30001f);
generalPath.curveTo(16.1f, 80.50001f, 15.700001f, 79.80001f, 15.100001f, 79.40001f);
generalPath.curveTo(14.500002f, 79.00001f, 13.800001f, 78.70001f, 12.900002f, 78.70001f);
generalPath.curveTo(11.700002f, 78.70001f, 10.800001f, 79.10001f, 10.100001f, 80.000015f);
generalPath.curveTo(9.400002f, 80.80002f, 9.000001f, 82.20001f, 9.000001f, 84.10001f);
generalPath.curveTo(9.000001f, 86.10001f, 9.400001f, 87.500015f, 10.100001f, 88.40002f);
generalPath.curveTo(10.800001f, 89.20002f, 11.700002f, 89.70002f, 12.900002f, 89.70002f);
generalPath.curveTo(13.700002f, 89.70002f, 14.500002f, 89.40002f, 15.100001f, 88.90002f);
generalPath.curveTo(15.800001f, 88.10001f, 16.300001f, 87.20002f, 16.500002f, 86.10001f);
generalPath.closePath();
generalPath.moveTo(21.5f, 86.799995f);
generalPath.lineTo(24.6f, 86.49999f);
generalPath.curveTo(24.800001f, 87.49999f, 25.2f, 88.299995f, 25.7f, 88.799995f);
generalPath.curveTo(26.2f, 89.299995f, 27.0f, 89.49999f, 28.0f, 89.49999f);
generalPath.curveTo(29.0f, 89.49999f, 29.8f, 89.299995f, 30.3f, 88.799995f);
generalPath.curveTo(30.8f, 88.399994f, 31.099998f, 87.899994f, 31.099998f, 87.299995f);
generalPath.curveTo(31.099998f, 86.899994f, 30.999998f, 86.6f, 30.8f, 86.299995f);
generalPath.curveTo(30.599998f, 85.99999f, 30.199999f, 85.799995f, 29.699999f, 85.6f);
generalPath.curveTo(29.3f, 85.5f, 28.499998f, 85.2f, 27.199999f, 84.9f);
generalPath.curveTo(25.499998f, 84.5f, 24.3f, 84.0f, 23.599998f, 83.3f);
generalPath.curveTo(22.599998f, 82.4f, 22.099998f, 81.4f, 22.099998f, 80.100006f);
generalPath.curveTo(22.099998f, 79.3f, 22.3f, 78.50001f, 22.8f, 77.90001f);
generalPath.curveTo(23.3f, 77.20001f, 23.9f, 76.70001f, 24.8f, 76.30001f);
generalPath.curveTo(25.699999f, 75.90001f, 26.699999f, 75.80001f, 27.9f, 75.80001f);
generalPath.curveTo(29.9f, 75.80001f, 31.4f, 76.20001f, 32.4f, 77.10001f);
generalPath.curveTo(33.4f, 78.000015f, 33.9f, 79.10001f, 34.0f, 80.60001f);
generalPath.lineTo(30.8f, 80.70001f);
generalPath.curveTo(30.699999f, 79.90001f, 30.4f, 79.30001f, 29.9f, 79.000015f);
generalPath.curveTo(29.5f, 78.60001f, 28.8f, 78.500015f, 27.9f, 78.500015f);
generalPath.curveTo(27.0f, 78.500015f, 26.3f, 78.70001f, 25.699999f, 79.10001f);
generalPath.curveTo(25.4f, 79.30001f, 25.199999f, 79.70001f, 25.199999f, 80.10001f);
generalPath.curveTo(25.199999f, 80.500015f, 25.4f, 80.80001f, 25.699999f, 81.10001f);
generalPath.curveTo(26.099998f, 81.40002f, 27.099998f, 81.80001f, 28.599998f, 82.20001f);
generalPath.curveTo(30.099998f, 82.60001f, 31.3f, 82.90001f, 31.999998f, 83.30001f);
generalPath.curveTo(32.699997f, 83.70001f, 33.3f, 84.20001f, 33.699997f, 84.90001f);
generalPath.curveTo(34.1f, 85.600006f, 34.299995f, 86.40001f, 34.299995f, 87.40001f);
generalPath.curveTo(34.299995f, 88.30001f, 33.999996f, 89.100006f, 33.499996f, 89.90001f);
generalPath.curveTo(32.999996f, 90.70001f, 32.299995f, 91.30001f, 31.399996f, 91.70001f);
generalPath.curveTo(30.499996f, 92.10001f, 29.299995f, 92.30001f, 27.999996f, 92.30001f);
generalPath.curveTo(25.999996f, 92.30001f, 24.499996f, 91.80001f, 23.399996f, 90.90001f);
generalPath.curveTo(22.399996f, 89.90001f, 21.699995f, 88.50001f, 21.499996f, 86.80001f);
generalPath.closePath();
generalPath.moveTo(36.4f, 84.1f);
generalPath.curveTo(36.4f, 82.5f, 36.600002f, 81.1f, 37.100002f, 80.1f);
generalPath.curveTo(37.500004f, 79.299995f, 37.9f, 78.6f, 38.600002f, 77.9f);
generalPath.curveTo(39.2f, 77.3f, 39.9f, 76.8f, 40.600002f, 76.5f);
generalPath.curveTo(41.600002f, 76.1f, 42.7f, 75.9f, 44.000004f, 75.9f);
generalPath.curveTo(46.300003f, 75.9f, 48.200005f, 76.6f, 49.600002f, 78.1f);
generalPath.curveTo(51.000004f, 79.5f, 51.7f, 81.5f, 51.7f, 84.1f);
generalPath.curveTo(51.7f, 86.6f, 51.0f, 88.6f, 49.600002f, 90.1f);
generalPath.curveTo(48.2f, 91.5f, 46.4f, 92.299995f, 44.100002f, 92.299995f);
generalPath.curveTo(41.800003f, 92.299995f, 39.9f, 91.6f, 38.500004f, 90.2f);
generalPath.curveTo(37.100002f, 88.6f, 36.400005f, 86.6f, 36.400005f, 84.1f);
generalPath.closePath();
generalPath.moveTo(39.600002f, 84.0f);
generalPath.curveTo(39.600002f, 85.8f, 40.000004f, 87.1f, 40.800003f, 88.1f);
generalPath.curveTo(41.600002f, 89.0f, 42.700005f, 89.5f, 43.9f, 89.5f);
generalPath.curveTo(45.1f, 89.5f, 46.2f, 89.0f, 47.0f, 88.1f);
generalPath.curveTo(47.8f, 87.2f, 48.2f, 85.799995f, 48.2f, 84.0f);
generalPath.curveTo(48.2f, 82.2f, 47.8f, 80.8f, 47.0f, 80.0f);
generalPath.curveTo(46.2f, 79.1f, 45.2f, 78.7f, 43.8f, 78.7f);
generalPath.curveTo(42.399998f, 78.7f, 41.399998f, 79.1f, 40.6f, 80.0f);
generalPath.curveTo(40.0f, 80.8f, 39.6f, 82.2f, 39.6f, 84.0f);
generalPath.closePath();
generalPath.moveTo(54.200005f, 91.9f);
generalPath.lineTo(54.200005f, 76.1f);
generalPath.lineTo(57.300003f, 76.1f);
generalPath.lineTo(63.700005f, 86.6f);
generalPath.lineTo(63.700005f, 76.1f);
generalPath.lineTo(66.700005f, 76.1f);
generalPath.lineTo(66.700005f, 91.799995f);
generalPath.lineTo(63.500004f, 91.799995f);
generalPath.lineTo(57.200005f, 81.49999f);
generalPath.lineTo(57.200005f, 91.799995f);
generalPath.lineTo(54.200005f, 91.799995f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
generalPath.moveTo(31.0f, 36.6f);
generalPath.curveTo(35.2f, 36.199997f, 36.4f, 33.6f, 41.2f, 33.1f);
generalPath.curveTo(43.600002f, 32.899998f, 45.100002f, 33.399998f, 45.3f, 34.199997f);
generalPath.curveTo(45.399998f, 34.999996f, 44.3f, 35.499996f, 42.8f, 35.6f);
generalPath.curveTo(40.8f, 35.8f, 39.899998f, 35.1f, 39.8f, 34.399998f);
generalPath.curveTo(38.3f, 34.499996f, 38.1f, 35.199997f, 38.2f, 35.6f);
generalPath.curveTo(38.3f, 36.5f, 40.2f, 37.3f, 43.2f, 37.0f);
generalPath.curveTo(46.7f, 36.7f, 47.8f, 35.4f, 47.600002f, 34.0f);
generalPath.curveTo(47.2f, 32.2f, 44.600002f, 30.7f, 39.7f, 31.1f);
generalPath.curveTo(33.5f, 31.7f, 33.600002f, 34.5f, 29.400002f, 34.8f);
generalPath.curveTo(27.7f, 34.899998f, 26.7f, 34.6f, 26.500002f, 33.899998f);
generalPath.curveTo(26.400002f, 33.199997f, 27.200003f, 32.899998f, 28.200003f, 32.8f);
generalPath.curveTo(29.100002f, 32.7f, 30.200003f, 32.899998f, 30.800003f, 33.2f);
generalPath.curveTo(31.200003f, 33.0f, 31.300003f, 32.8f, 31.300003f, 32.600002f);
generalPath.curveTo(31.200003f, 32.000004f, 29.900003f, 31.700003f, 28.300003f, 31.800003f);
generalPath.curveTo(25.200003f, 32.100002f, 25.200003f, 33.500004f, 25.300003f, 34.100002f);
generalPath.curveTo(25.600002f, 35.800003f, 28.000004f, 36.9f, 31.000004f, 36.600002f);
generalPath.closePath();
generalPath.moveTo(51.9f, 43.699997f);
generalPath.curveTo(48.0f, 44.6f, 43.100002f, 45.199997f, 37.2f, 45.199997f);
generalPath.curveTo(31.2f, 45.199997f, 26.2f, 44.6f, 22.400002f, 43.699997f);
generalPath.curveTo(19.000002f, 42.799995f, 17.100002f, 41.799995f, 16.500002f, 40.799995f);
generalPath.curveTo(16.800001f, 42.999996f, 17.400002f, 45.199997f, 18.100002f, 47.299995f);
generalPath.curveTo(17.200003f, 47.799995f, 16.400002f, 48.499996f, 15.700003f, 49.399994f);
generalPath.curveTo(14.300003f, 51.099995f, 13.700003f, 53.099995f, 13.800003f, 55.099995f);
generalPath.curveTo(13.900003f, 57.099995f, 14.900003f, 58.699993f, 16.400003f, 59.899994f);
generalPath.curveTo(18.000004f, 61.099995f, 19.700003f, 61.499992f, 21.700005f, 61.099995f);
generalPath.curveTo(22.400005f, 60.999996f, 23.300005f, 60.599995f, 24.100004f, 60.399994f);
generalPath.curveTo(22.500004f, 60.399994f, 21.100004f, 59.899994f, 19.800003f, 58.799995f);
generalPath.curveTo(18.300003f, 57.699997f, 17.300003f, 56.199997f, 17.100002f, 54.399994f);
generalPath.curveTo(16.700003f, 52.699993f, 17.100002f, 51.099995f, 18.100002f, 49.699993f);
generalPath.curveTo(18.300003f, 49.399994f, 18.500002f, 49.199993f, 18.800003f, 48.999992f);
generalPath.curveTo(19.300003f, 50.399994f, 20.000004f, 51.59999f, 20.700003f, 52.899994f);
generalPath.curveTo(22.200003f, 55.099995f, 23.700003f, 57.099995f, 25.100002f, 59.199993f);
generalPath.curveTo(25.700003f, 60.399994f, 26.200003f, 61.699993f, 26.500002f, 62.899994f);
generalPath.curveTo(27.500002f, 64.299995f, 28.900002f, 65.2f, 30.600002f, 65.7f);
generalPath.curveTo(32.7f, 66.399994f, 34.9f, 66.7f, 37.2f, 66.7f);
generalPath.lineTo(37.4f, 66.7f);
generalPath.curveTo(39.600002f, 66.7f, 42.0f, 66.299995f, 44.2f, 65.6f);
generalPath.curveTo(45.8f, 65.1f, 47.2f, 64.2f, 48.2f, 62.699997f);
generalPath.lineTo(48.3f, 62.699997f);
generalPath.curveTo(48.5f, 61.6f, 48.899998f, 60.299995f, 49.5f, 58.999996f);
generalPath.curveTo(51.0f, 56.899998f, 52.5f, 54.899998f, 53.9f, 52.699997f);
generalPath.curveTo(55.9f, 49.1f, 57.2f, 45.1f, 58.0f, 40.699997f);
generalPath.curveTo(57.1f, 41.899998f, 55.2f, 42.899998f, 51.9f, 43.699997f);
generalPath.closePath();
generalPath.moveTo(22.300001f, 40.6f);
generalPath.curveTo(26.2f, 41.6f, 31.100002f, 42.1f, 37.0f, 42.1f);
generalPath.curveTo(43.0f, 42.1f, 47.9f, 41.6f, 51.7f, 40.6f);
generalPath.curveTo(55.8f, 39.6f, 57.7f, 38.399998f, 57.7f, 37.199997f);
generalPath.curveTo(57.7f, 36.299995f, 56.8f, 35.499996f, 55.2f, 34.799995f);
generalPath.curveTo(55.600002f, 34.999996f, 55.8f, 35.399994f, 55.8f, 35.899994f);
generalPath.curveTo(55.8f, 37.099995f, 53.899998f, 38.099995f, 50.2f, 38.999992f);
generalPath.curveTo(46.8f, 39.699993f, 42.3f, 40.29999f, 37.0f, 40.29999f);
generalPath.curveTo(31.8f, 40.29999f, 27.2f, 39.79999f, 23.9f, 39.09999f);
generalPath.curveTo(20.3f, 38.19999f, 18.4f, 37.19999f, 18.4f, 35.999992f);
generalPath.curveTo(18.4f, 35.499992f, 18.6f, 34.999992f, 19.4f, 34.499992f);
generalPath.curveTo(17.199999f, 35.399994f, 16.0f, 36.09999f, 16.0f, 37.199993f);
generalPath.curveTo(16.2f, 38.399994f, 18.2f, 39.699993f, 22.3f, 40.599995f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.79999923706055, 66.7969970703125), new Point2D.Double(35.79999923706055, 31.125), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_cson() {
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
       ext_cson base = new ext_cson();
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
       ext_cson base = new ext_cson();
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
        return ext_cson::new;
    }
}

