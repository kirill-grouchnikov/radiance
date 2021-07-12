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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_sed implements NeonIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private NeonIcon.ColorFilter colorFilter = null;
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
generalPath.moveTo(38.7f, 45.4f);
generalPath.lineTo(41.9f, 46.300003f);
generalPath.lineTo(43.800003f, 39.300003f);
generalPath.lineTo(40.600002f, 38.4f);
generalPath.curveTo(40.600002f, 37.300003f, 40.500004f, 36.100002f, 40.2f, 35.0f);
generalPath.lineTo(43.100002f, 33.3f);
generalPath.lineTo(39.4f, 27.0f);
generalPath.lineTo(36.5f, 28.7f);
generalPath.curveTo(35.7f, 27.900002f, 34.8f, 27.2f, 33.8f, 26.6f);
generalPath.lineTo(34.7f, 23.4f);
generalPath.lineTo(27.7f, 21.5f);
generalPath.lineTo(26.800001f, 24.7f);
generalPath.curveTo(25.7f, 24.7f, 24.500002f, 24.800001f, 23.400002f, 25.1f);
generalPath.lineTo(21.7f, 22.2f);
generalPath.lineTo(15.400001f, 25.800001f);
generalPath.lineTo(17.1f, 28.7f);
generalPath.curveTo(16.300001f, 29.5f, 15.6f, 30.400002f, 15.0f, 31.400002f);
generalPath.lineTo(11.8f, 30.500002f);
generalPath.lineTo(9.900001f, 37.5f);
generalPath.lineTo(13.1f, 38.4f);
generalPath.curveTo(13.1f, 39.5f, 13.200001f, 40.7f, 13.5f, 41.800003f);
generalPath.lineTo(10.6f, 43.500004f);
generalPath.lineTo(14.200001f, 49.800003f);
generalPath.lineTo(17.1f, 48.100002f);
generalPath.curveTo(17.9f, 48.9f, 18.800001f, 49.600002f, 19.800001f, 50.2f);
generalPath.lineTo(18.900002f, 53.4f);
generalPath.lineTo(25.900002f, 55.300003f);
generalPath.lineTo(26.800001f, 52.100002f);
generalPath.curveTo(27.900002f, 52.100002f, 29.1f, 51.9f, 30.2f, 51.7f);
generalPath.lineTo(31.900002f, 54.600002f);
generalPath.lineTo(38.2f, 51.000004f);
generalPath.lineTo(36.5f, 48.100002f);
generalPath.curveTo(37.4f, 47.300003f, 38.1f, 46.4f, 38.7f, 45.4f);
generalPath.closePath();
generalPath.moveTo(21.300001f, 41.7f);
generalPath.curveTo(19.500002f, 38.600002f, 20.6f, 34.600002f, 23.7f, 32.9f);
generalPath.curveTo(26.800001f, 31.100002f, 30.800001f, 32.2f, 32.5f, 35.300003f);
generalPath.curveTo(34.3f, 38.4f, 33.2f, 42.4f, 30.1f, 44.100002f);
generalPath.curveTo(27.0f, 45.800003f, 23.0f, 44.800003f, 21.3f, 41.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.861000061035156, 55.39099884033203), new Point2D.Double(26.861000061035156, 21.5), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(55.4f, 64.0f);
generalPath.lineTo(59.5f, 61.6f);
generalPath.lineTo(58.4f, 59.699997f);
generalPath.curveTo(58.9f, 59.199997f, 59.4f, 58.6f, 59.800003f, 57.899998f);
generalPath.lineTo(61.9f, 58.499996f);
generalPath.lineTo(63.100002f, 53.899998f);
generalPath.lineTo(61.000004f, 53.399998f);
generalPath.curveTo(61.000004f, 52.699997f, 60.900005f, 51.899998f, 60.700005f, 51.199997f);
generalPath.lineTo(62.600006f, 50.1f);
generalPath.lineTo(60.200005f, 46.0f);
generalPath.lineTo(58.300003f, 47.0f);
generalPath.curveTo(57.800003f, 46.5f, 57.200005f, 46.0f, 56.500004f, 45.6f);
generalPath.lineTo(57.100002f, 43.5f);
generalPath.lineTo(52.500004f, 42.3f);
generalPath.lineTo(51.900005f, 44.399998f);
generalPath.curveTo(51.200005f, 44.399998f, 50.400005f, 44.499996f, 49.700005f, 44.699997f);
generalPath.lineTo(48.600006f, 42.799995f);
generalPath.lineTo(44.500008f, 45.199997f);
generalPath.lineTo(45.600006f, 47.1f);
generalPath.curveTo(45.100006f, 47.6f, 44.600006f, 48.199997f, 44.200005f, 48.899998f);
generalPath.lineTo(42.100006f, 48.3f);
generalPath.lineTo(40.900005f, 52.899998f);
generalPath.lineTo(43.000004f, 53.499996f);
generalPath.curveTo(43.000004f, 54.199997f, 43.100002f, 54.999996f, 43.300003f, 55.699997f);
generalPath.lineTo(41.4f, 56.799995f);
generalPath.lineTo(43.800003f, 60.899994f);
generalPath.lineTo(45.700005f, 59.799995f);
generalPath.curveTo(46.200005f, 60.299995f, 46.800003f, 60.799995f, 47.500004f, 61.199997f);
generalPath.lineTo(46.900005f, 63.299995f);
generalPath.lineTo(51.500004f, 64.49999f);
generalPath.lineTo(52.100002f, 62.399994f);
generalPath.curveTo(52.800003f, 62.399994f, 53.600002f, 62.299995f, 54.300003f, 62.099995f);
generalPath.lineTo(55.4f, 63.999996f);
generalPath.closePath();
generalPath.moveTo(48.300003f, 55.5f);
generalPath.curveTo(47.100002f, 53.5f, 47.800003f, 50.9f, 49.9f, 49.7f);
generalPath.curveTo(51.9f, 48.5f, 54.5f, 49.2f, 55.7f, 51.2f);
generalPath.curveTo(56.9f, 53.2f, 56.2f, 55.8f, 54.2f, 57.0f);
generalPath.curveTo(52.100002f, 58.2f, 49.5f, 57.6f, 48.3f, 55.5f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(52.00199890136719, 64.5), new Point2D.Double(52.00199890136719, 42.33599853515625), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(8.3f, 84.6f);
generalPath.lineTo(12.200001f, 84.2f);
generalPath.curveTo(12.400001f, 85.5f, 12.900001f, 86.5f, 13.6f, 87.1f);
generalPath.curveTo(14.3f, 87.7f, 15.3f, 88.0f, 16.5f, 88.0f);
generalPath.curveTo(17.8f, 88.0f, 18.8f, 87.7f, 19.4f, 87.2f);
generalPath.curveTo(20.1f, 86.7f, 20.4f, 86.0f, 20.4f, 85.299995f);
generalPath.curveTo(20.4f, 84.799995f, 20.3f, 84.399994f, 20.0f, 84.1f);
generalPath.curveTo(19.7f, 83.799995f, 19.2f, 83.5f, 18.5f, 83.2f);
generalPath.curveTo(18.0f, 83.0f, 17.0f, 82.7f, 15.3f, 82.299995f);
generalPath.curveTo(13.1f, 81.799995f, 11.6f, 81.1f, 10.700001f, 80.299995f);
generalPath.curveTo(9.700001f, 79.299995f, 9.000001f, 77.99999f, 9.000001f, 76.399994f);
generalPath.curveTo(9.000001f, 75.399994f, 9.300001f, 74.399994f, 9.900001f, 73.59999f);
generalPath.curveTo(10.500001f, 72.69999f, 11.3f, 72.09999f, 12.400001f, 71.59999f);
generalPath.curveTo(13.500001f, 71.09999f, 14.800001f, 70.899994f, 16.300001f, 70.899994f);
generalPath.curveTo(18.800001f, 70.899994f, 20.7f, 71.399994f, 22.0f, 72.49999f);
generalPath.curveTo(23.3f, 73.59999f, 23.9f, 74.99999f, 24.0f, 76.899994f);
generalPath.lineTo(20.0f, 77.09999f);
generalPath.curveTo(19.8f, 76.09999f, 19.5f, 75.29999f, 18.9f, 74.899994f);
generalPath.curveTo(18.3f, 74.49999f, 17.5f, 74.2f, 16.3f, 74.2f);
generalPath.curveTo(15.099999f, 74.2f, 14.199999f, 74.399994f, 13.499999f, 74.899994f);
generalPath.curveTo(13.099999f, 75.2f, 12.899999f, 75.59999f, 12.899999f, 76.09999f);
generalPath.curveTo(12.899999f, 76.59999f, 13.099998f, 76.99999f, 13.499999f, 77.29999f);
generalPath.curveTo(13.999999f, 77.69999f, 15.199999f, 78.19999f, 17.199999f, 78.59999f);
generalPath.curveTo(19.199999f, 78.99999f, 20.599998f, 79.49999f, 21.599998f, 79.99999f);
generalPath.curveTo(22.499998f, 80.49999f, 23.3f, 81.19999f, 23.8f, 81.99999f);
generalPath.curveTo(24.3f, 82.899994f, 24.599998f, 83.899994f, 24.599998f, 85.19999f);
generalPath.curveTo(24.599998f, 86.29999f, 24.3f, 87.39999f, 23.599998f, 88.39999f);
generalPath.curveTo(22.999998f, 89.39999f, 22.099998f, 90.09998f, 20.899998f, 90.59998f);
generalPath.curveTo(19.699997f, 91.09998f, 18.299997f, 91.29998f, 16.599998f, 91.29998f);
generalPath.curveTo(14.099998f, 91.29998f, 12.099998f, 90.69998f, 10.799998f, 89.59998f);
generalPath.curveTo(9.399999f, 88.499985f, 8.599998f, 86.79998f, 8.299998f, 84.59998f);
generalPath.closePath();
generalPath.moveTo(28.0f, 91.1f);
generalPath.lineTo(28.0f, 71.2f);
generalPath.lineTo(42.8f, 71.2f);
generalPath.lineTo(42.8f, 74.6f);
generalPath.lineTo(32.0f, 74.6f);
generalPath.lineTo(32.0f, 79.0f);
generalPath.lineTo(42.0f, 79.0f);
generalPath.lineTo(42.0f, 82.3f);
generalPath.lineTo(32.0f, 82.3f);
generalPath.lineTo(32.0f, 87.700005f);
generalPath.lineTo(43.2f, 87.700005f);
generalPath.lineTo(43.2f, 91.0f);
generalPath.lineTo(28.0f, 91.0f);
generalPath.closePath();
generalPath.moveTo(46.6f, 71.2f);
generalPath.lineTo(54.0f, 71.2f);
generalPath.curveTo(55.7f, 71.2f, 56.9f, 71.299995f, 57.8f, 71.6f);
generalPath.curveTo(59.0f, 71.9f, 60.0f, 72.6f, 60.8f, 73.4f);
generalPath.curveTo(61.6f, 74.200005f, 62.3f, 75.3f, 62.7f, 76.6f);
generalPath.curveTo(63.100002f, 77.9f, 63.4f, 79.4f, 63.4f, 81.299995f);
generalPath.curveTo(63.4f, 82.899994f, 63.2f, 84.299995f, 62.800003f, 85.49999f);
generalPath.curveTo(62.300003f, 86.899994f, 61.600002f, 88.09999f, 60.700005f, 88.99999f);
generalPath.curveTo(60.000004f, 89.69999f, 59.100006f, 90.19999f, 57.900005f, 90.59999f);
generalPath.curveTo(57.000004f, 90.899994f, 55.800007f, 90.99999f, 54.300007f, 90.99999f);
generalPath.lineTo(46.70001f, 90.99999f);
generalPath.lineTo(46.70001f, 71.2f);
generalPath.closePath();
generalPath.moveTo(50.6f, 74.6f);
generalPath.lineTo(50.6f, 87.7f);
generalPath.lineTo(53.6f, 87.7f);
generalPath.curveTo(54.699997f, 87.7f, 55.5f, 87.6f, 56.0f, 87.5f);
generalPath.curveTo(56.7f, 87.3f, 57.2f, 87.1f, 57.6f, 86.7f);
generalPath.curveTo(57.999996f, 86.299995f, 58.399998f, 85.7f, 58.699997f, 84.799995f);
generalPath.curveTo(58.999996f, 83.899994f, 59.1f, 82.7f, 59.1f, 81.2f);
generalPath.curveTo(59.1f, 79.7f, 59.0f, 78.5f, 58.699997f, 77.7f);
generalPath.curveTo(58.399994f, 76.899994f, 57.999996f, 76.2f, 57.6f, 75.799995f);
generalPath.curveTo(57.1f, 75.299995f, 56.5f, 74.99999f, 55.699997f, 74.899994f);
generalPath.curveTo(55.1f, 74.799995f, 53.999996f, 74.7f, 52.399998f, 74.7f);
generalPath.lineTo(50.6f, 74.7f);
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
// _0_6
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
	private ext_sed() {
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
    public static NeonIcon of(int width, int height) {
       ext_sed base = new ext_sed();
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
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_sed base = new ext_sed();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_sed::new;
    }
}

