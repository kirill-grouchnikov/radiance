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
public class ext_dtd implements NeonIcon {
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
generalPath.moveTo(9.5f, 71.2f);
generalPath.lineTo(16.9f, 71.2f);
generalPath.curveTo(18.6f, 71.2f, 19.8f, 71.299995f, 20.699999f, 71.6f);
generalPath.curveTo(21.9f, 71.9f, 22.9f, 72.6f, 23.699999f, 73.4f);
generalPath.curveTo(24.499998f, 74.3f, 25.199999f, 75.3f, 25.599998f, 76.6f);
generalPath.curveTo(25.999998f, 77.899994f, 26.3f, 79.4f, 26.3f, 81.299995f);
generalPath.curveTo(26.3f, 82.899994f, 26.099998f, 84.299995f, 25.699999f, 85.49999f);
generalPath.curveTo(25.199999f, 86.899994f, 24.499998f, 88.09999f, 23.599998f, 88.99999f);
generalPath.curveTo(22.899998f, 89.69999f, 21.999998f, 90.19999f, 20.8f, 90.59999f);
generalPath.curveTo(19.9f, 90.899994f, 18.699999f, 90.99999f, 17.199999f, 90.99999f);
generalPath.lineTo(9.5f, 90.99999f);
generalPath.lineTo(9.5f, 71.2f);
generalPath.closePath();
generalPath.moveTo(13.6f, 74.6f);
generalPath.lineTo(13.6f, 87.7f);
generalPath.lineTo(16.6f, 87.7f);
generalPath.curveTo(17.7f, 87.7f, 18.5f, 87.6f, 19.0f, 87.5f);
generalPath.curveTo(19.7f, 87.3f, 20.2f, 87.1f, 20.6f, 86.7f);
generalPath.curveTo(21.0f, 86.299995f, 21.4f, 85.7f, 21.7f, 84.799995f);
generalPath.curveTo(22.000002f, 83.899994f, 22.1f, 82.7f, 22.1f, 81.2f);
generalPath.curveTo(22.1f, 79.7f, 22.0f, 78.5f, 21.7f, 77.7f);
generalPath.curveTo(21.400002f, 76.899994f, 21.0f, 76.2f, 20.6f, 75.799995f);
generalPath.curveTo(20.1f, 75.299995f, 19.5f, 74.99999f, 18.7f, 74.899994f);
generalPath.curveTo(18.1f, 74.799995f, 17.0f, 74.7f, 15.400001f, 74.7f);
generalPath.lineTo(13.6f, 74.7f);
generalPath.closePath();
generalPath.moveTo(34.2f, 91.1f);
generalPath.lineTo(34.2f, 74.6f);
generalPath.lineTo(28.300001f, 74.6f);
generalPath.lineTo(28.300001f, 71.2f);
generalPath.lineTo(44.2f, 71.2f);
generalPath.lineTo(44.2f, 74.6f);
generalPath.lineTo(38.3f, 74.6f);
generalPath.lineTo(38.3f, 91.1f);
generalPath.lineTo(34.2f, 91.1f);
generalPath.closePath();
generalPath.moveTo(46.7f, 71.2f);
generalPath.lineTo(54.100002f, 71.2f);
generalPath.curveTo(55.800003f, 71.2f, 57.000004f, 71.299995f, 57.9f, 71.6f);
generalPath.curveTo(59.100002f, 71.9f, 60.100002f, 72.6f, 60.9f, 73.4f);
generalPath.curveTo(61.7f, 74.200005f, 62.4f, 75.3f, 62.800003f, 76.6f);
generalPath.curveTo(63.200005f, 77.9f, 63.500004f, 79.4f, 63.500004f, 81.299995f);
generalPath.curveTo(63.500004f, 82.899994f, 63.300003f, 84.299995f, 62.900005f, 85.49999f);
generalPath.curveTo(62.400005f, 86.899994f, 61.700005f, 88.09999f, 60.800007f, 88.99999f);
generalPath.curveTo(60.100006f, 89.69999f, 59.20001f, 90.19999f, 58.000008f, 90.59999f);
generalPath.curveTo(57.100006f, 90.899994f, 55.90001f, 90.99999f, 54.40001f, 90.99999f);
generalPath.lineTo(46.80001f, 90.99999f);
generalPath.lineTo(46.80001f, 71.2f);
generalPath.closePath();
generalPath.moveTo(50.8f, 74.6f);
generalPath.lineTo(50.8f, 87.7f);
generalPath.lineTo(53.8f, 87.7f);
generalPath.curveTo(54.899998f, 87.7f, 55.7f, 87.6f, 56.2f, 87.5f);
generalPath.curveTo(56.9f, 87.3f, 57.4f, 87.1f, 57.8f, 86.7f);
generalPath.curveTo(58.199997f, 86.299995f, 58.6f, 85.7f, 58.899998f, 84.799995f);
generalPath.curveTo(59.199997f, 83.899994f, 59.3f, 82.7f, 59.3f, 81.2f);
generalPath.curveTo(59.3f, 79.7f, 59.2f, 78.5f, 58.899998f, 77.7f);
generalPath.curveTo(58.599995f, 76.899994f, 58.199997f, 76.2f, 57.8f, 75.799995f);
generalPath.curveTo(57.3f, 75.299995f, 56.7f, 74.99999f, 55.899998f, 74.899994f);
generalPath.curveTo(55.3f, 74.799995f, 54.199997f, 74.7f, 52.6f, 74.7f);
generalPath.lineTo(50.8f, 74.7f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
generalPath.moveTo(29.9f, 40.8f);
generalPath.lineTo(17.0f, 34.3f);
generalPath.lineTo(17.0f, 34.2f);
generalPath.lineTo(29.9f, 27.800001f);
generalPath.lineTo(29.9f, 23.400002f);
generalPath.lineTo(12.799999f, 32.5f);
generalPath.lineTo(12.799999f, 36.0f);
generalPath.lineTo(29.9f, 45.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(12.784000396728516, 34.27000045776367), new Point2D.Double(29.89900016784668, 34.27000045776367), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(12.034000396728516, 34.27000045776367), new Point2D.Double(30.64900016784668, 34.27000045776367), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.9f, 40.8f);
generalPath.lineTo(17.0f, 34.3f);
generalPath.lineTo(17.0f, 34.2f);
generalPath.lineTo(29.9f, 27.800001f);
generalPath.lineTo(29.9f, 23.400002f);
generalPath.lineTo(12.799999f, 32.5f);
generalPath.lineTo(12.799999f, 36.0f);
generalPath.lineTo(29.9f, 45.1f);
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
generalPath.moveTo(38.8f, 37.0f);
generalPath.lineTo(39.6f, 22.0f);
generalPath.lineTo(33.899998f, 22.0f);
generalPath.lineTo(34.699997f, 37.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.89799880981445, 29.459999084472656), new Point2D.Double(39.56800079345703, 29.459999084472656), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(33.10599899291992, 29.459999084472656), new Point2D.Double(40.358001708984375, 29.459999084472656), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.8f, 37.0f);
generalPath.lineTo(39.6f, 22.0f);
generalPath.lineTo(33.899998f, 22.0f);
generalPath.lineTo(34.699997f, 37.0f);
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
generalPath.moveTo(36.8f, 46.4f);
generalPath.curveTo(38.7f, 46.4f, 40.0f, 44.800003f, 40.0f, 42.7f);
generalPath.curveTo(40.0f, 40.5f, 38.7f, 39.0f, 36.8f, 39.0f);
generalPath.curveTo(34.899998f, 39.0f, 33.6f, 40.5f, 33.6f, 42.7f);
generalPath.curveTo(33.5f, 44.8f, 34.8f, 46.4f, 36.8f, 46.4f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.540000915527344, 42.71099853515625), new Point2D.Double(39.92399978637695, 42.71099853515625), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(32.790000915527344, 42.71099853515625), new Point2D.Double(40.67399978637695, 42.71099853515625), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.8f, 46.4f);
generalPath.curveTo(38.7f, 46.4f, 40.0f, 44.800003f, 40.0f, 42.7f);
generalPath.curveTo(40.0f, 40.5f, 38.7f, 39.0f, 36.8f, 39.0f);
generalPath.curveTo(34.899998f, 39.0f, 33.6f, 40.5f, 33.6f, 42.7f);
generalPath.curveTo(33.5f, 44.8f, 34.8f, 46.4f, 36.8f, 46.4f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(43.6f, 23.4f);
generalPath.lineTo(43.6f, 27.8f);
generalPath.lineTo(56.8f, 34.2f);
generalPath.lineTo(56.8f, 34.3f);
generalPath.lineTo(43.6f, 40.8f);
generalPath.lineTo(43.6f, 45.1f);
generalPath.lineTo(60.699997f, 36.1f);
generalPath.lineTo(60.699997f, 32.399998f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(43.597999572753906, 34.27000045776367), new Point2D.Double(60.715999603271484, 34.27000045776367), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(42.847999572753906, 34.27000045776367), new Point2D.Double(61.465999603271484, 34.27000045776367), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.6f, 23.4f);
generalPath.lineTo(43.6f, 27.8f);
generalPath.lineTo(56.8f, 34.2f);
generalPath.lineTo(56.8f, 34.3f);
generalPath.lineTo(43.6f, 40.8f);
generalPath.lineTo(43.6f, 45.1f);
generalPath.lineTo(60.699997f, 36.1f);
generalPath.lineTo(60.699997f, 32.399998f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(15.3f, 50.9f);
generalPath.lineTo(58.2f, 50.9f);
generalPath.lineTo(58.2f, 53.800003f);
generalPath.lineTo(15.3f, 53.800003f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(15.302000045776367, 52.39400100708008), new Point2D.Double(58.22999954223633, 52.39400100708008), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(14.552000045776367, 52.39400100708008), new Point2D.Double(58.97999954223633, 52.39400100708008), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.3f, 50.9f);
generalPath.lineTo(58.2f, 50.9f);
generalPath.lineTo(58.2f, 53.800003f);
generalPath.lineTo(15.3f, 53.800003f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(15.3f, 59.2f);
generalPath.lineTo(58.2f, 59.2f);
generalPath.lineTo(58.2f, 62.100002f);
generalPath.lineTo(15.3f, 62.100002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(15.302000045776367, 60.67399978637695), new Point2D.Double(58.22999954223633, 60.67399978637695), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(14.552000045776367, 60.67399978637695), new Point2D.Double(58.97999954223633, 60.67399978637695), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.3f, 59.2f);
generalPath.lineTo(58.2f, 59.2f);
generalPath.lineTo(58.2f, 62.100002f);
generalPath.lineTo(15.3f, 62.100002f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
// _0_10
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
	private ext_dtd() {
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
       ext_dtd base = new ext_dtd();
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
       ext_dtd base = new ext_dtd();
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
        return ext_dtd::new;
    }
}

