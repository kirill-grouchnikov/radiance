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
public class ext_pl implements NeonIcon {
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
generalPath.moveTo(20.3f, 90.1f);
generalPath.lineTo(20.3f, 70.2f);
generalPath.lineTo(26.8f, 70.2f);
generalPath.curveTo(29.3f, 70.2f, 30.9f, 70.299995f, 31.599998f, 70.5f);
generalPath.curveTo(32.8f, 70.8f, 33.699997f, 71.4f, 34.5f, 72.4f);
generalPath.curveTo(35.3f, 73.4f, 35.7f, 74.700005f, 35.7f, 76.3f);
generalPath.curveTo(35.7f, 77.5f, 35.5f, 78.5f, 35.0f, 79.4f);
generalPath.curveTo(34.6f, 80.200005f, 34.0f, 80.9f, 33.3f, 81.4f);
generalPath.curveTo(32.6f, 81.9f, 31.9f, 82.200005f, 31.199999f, 82.3f);
generalPath.curveTo(30.199999f, 82.5f, 28.8f, 82.600006f, 27.0f, 82.600006f);
generalPath.lineTo(24.4f, 82.600006f);
generalPath.lineTo(24.4f, 90.100006f);
generalPath.lineTo(20.3f, 90.100006f);
generalPath.closePath();
generalPath.moveTo(24.4f, 73.6f);
generalPath.lineTo(24.4f, 79.2f);
generalPath.lineTo(26.6f, 79.2f);
generalPath.curveTo(28.2f, 79.2f, 29.300001f, 79.1f, 29.800001f, 78.899994f);
generalPath.curveTo(30.300001f, 78.7f, 30.800001f, 78.399994f, 31.1f, 77.899994f);
generalPath.curveTo(31.4f, 77.49999f, 31.6f, 76.899994f, 31.6f, 76.399994f);
generalPath.curveTo(31.6f, 75.7f, 31.4f, 75.09999f, 31.0f, 74.59999f);
generalPath.curveTo(30.6f, 74.09999f, 30.0f, 73.79999f, 29.4f, 73.69999f);
generalPath.curveTo(28.9f, 73.59999f, 27.9f, 73.59999f, 26.5f, 73.59999f);
generalPath.lineTo(24.4f, 73.59999f);
generalPath.closePath();
generalPath.moveTo(39.2f, 90.1f);
generalPath.lineTo(39.2f, 70.4f);
generalPath.lineTo(43.3f, 70.4f);
generalPath.lineTo(43.3f, 86.7f);
generalPath.lineTo(53.4f, 86.7f);
generalPath.lineTo(53.4f, 90.0f);
generalPath.lineTo(39.2f, 90.0f);
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
generalPath.moveTo(31.8f, 32.0f);
generalPath.curveTo(31.699999f, 32.1f, 31.699999f, 32.1f, 31.8f, 32.0f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.5f, 45.0f);
generalPath.curveTo(52.7f, 39.7f, 47.1f, 36.2f, 42.9f, 33.6f);
generalPath.curveTo(41.100002f, 32.5f, 38.100002f, 30.999998f, 37.800003f, 28.599998f);
generalPath.curveTo(37.600002f, 27.599998f, 37.600002f, 26.599998f, 37.600002f, 25.599998f);
generalPath.curveTo(37.600002f, 25.199999f, 37.600002f, 24.8f, 37.500004f, 24.399998f);
generalPath.curveTo(37.500004f, 23.899998f, 36.900005f, 24.499998f, 36.700005f, 24.099998f);
generalPath.curveTo(36.000004f, 22.999998f, 36.300003f, 24.399998f, 36.300003f, 24.999998f);
generalPath.curveTo(36.500004f, 26.299997f, 36.600002f, 27.699999f, 36.600002f, 28.999998f);
generalPath.curveTo(36.600002f, 31.599998f, 36.2f, 34.1f, 35.500004f, 36.6f);
generalPath.curveTo(34.000004f, 42.399998f, 32.800003f, 48.399998f, 34.300003f, 54.399998f);
generalPath.curveTo(34.600002f, 55.6f, 35.000004f, 56.899998f, 35.500004f, 57.999996f);
generalPath.curveTo(35.700005f, 58.399998f, 36.000004f, 59.299995f, 36.400005f, 59.499996f);
generalPath.curveTo(38.000004f, 59.899998f, 39.200005f, 59.999996f, 40.500004f, 61.199997f);
generalPath.curveTo(41.300003f, 61.899998f, 41.900005f, 61.499996f, 42.800003f, 61.199997f);
generalPath.curveTo(45.600002f, 60.1f, 48.100002f, 58.6f, 50.100002f, 56.299995f);
generalPath.curveTo(53.000004f, 53.099995f, 54.2f, 49.299995f, 53.500004f, 44.999996f);
generalPath.moveTo(50.500004f, 50.399998f);
generalPath.curveTo(50.200005f, 52.6f, 48.900005f, 54.499996f, 47.500004f, 56.199997f);
generalPath.curveTo(46.500004f, 57.399998f, 45.100002f, 58.899998f, 43.600002f, 59.399998f);
generalPath.curveTo(43.100002f, 59.6f, 43.7f, 58.499996f, 43.800003f, 58.399998f);
generalPath.curveTo(44.300003f, 57.699997f, 44.800003f, 57.1f, 45.4f, 56.399998f);
generalPath.curveTo(46.2f, 55.399998f, 46.9f, 54.399998f, 47.300003f, 53.3f);
generalPath.curveTo(48.800003f, 49.399998f, 48.500004f, 44.8f, 46.200005f, 41.3f);
generalPath.curveTo(45.000004f, 39.399998f, 43.300003f, 37.8f, 41.600006f, 36.399998f);
generalPath.curveTo(40.800007f, 35.699997f, 39.900005f, 34.999996f, 39.200005f, 34.199997f);
generalPath.curveTo(39.000004f, 33.999996f, 37.600006f, 32.1f, 38.100006f, 31.899998f);
generalPath.curveTo(38.200005f, 31.799997f, 41.300007f, 35.1f, 41.700005f, 35.3f);
generalPath.curveTo(43.000004f, 36.3f, 44.300003f, 37.2f, 45.500004f, 38.3f);
generalPath.curveTo(47.100002f, 39.8f, 48.800003f, 41.399998f, 49.700005f, 43.399998f);
generalPath.curveTo(50.600006f, 45.499996f, 50.800003f, 47.999996f, 50.500004f, 50.399998f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(43.678001403808594, 61.7239990234375), new Point2D.Double(43.678001403808594, 23.770999908447266), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(35.1f, 18.8f);
generalPath.curveTo(35.6f, 19.099998f, 35.699997f, 20.9f, 35.699997f, 22.599998f);
generalPath.curveTo(35.699997f, 24.3f, 35.899998f, 31.399998f, 35.299995f, 33.3f);
generalPath.curveTo(34.799995f, 35.2f, 33.599995f, 37.3f, 32.299995f, 39.2f);
generalPath.curveTo(30.999996f, 41.100002f, 29.499996f, 45.0f, 29.599995f, 47.4f);
generalPath.curveTo(29.699995f, 49.800003f, 30.999994f, 53.800003f, 32.099995f, 55.5f);
generalPath.curveTo(33.199993f, 57.2f, 34.999996f, 59.5f, 34.599995f, 60.0f);
generalPath.curveTo(33.899994f, 60.9f, 30.899994f, 57.7f, 29.399994f, 55.9f);
generalPath.curveTo(27.799994f, 54.0f, 26.299994f, 50.300003f, 26.199993f, 47.300003f);
generalPath.curveTo(26.099993f, 44.4f, 27.799994f, 41.600002f, 28.999992f, 40.000004f);
generalPath.curveTo(30.199993f, 38.300003f, 32.499992f, 35.500004f, 33.09999f, 34.200005f);
generalPath.curveTo(33.69999f, 32.900005f, 34.39999f, 31.500004f, 34.59999f, 29.700005f);
generalPath.curveTo(34.79999f, 27.900005f, 34.59999f, 21.400005f, 34.59999f, 21.400005f);
generalPath.curveTo(34.59999f, 21.400005f, 34.69999f, 18.500006f, 35.09999f, 18.800005f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.018999099731445, 60.15999984741211), new Point2D.Double(31.018999099731445, 18.820999145507812), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(33.9f, 21.9f);
generalPath.curveTo(34.4f, 22.1f, 34.4f, 22.699999f, 34.4f, 23.199999f);
generalPath.curveTo(34.4f, 23.8f, 34.2f, 26.099998f, 34.100002f, 28.399998f);
generalPath.curveTo(33.9f, 30.699997f, 32.100002f, 32.6f, 30.800003f, 33.899998f);
generalPath.curveTo(29.500004f, 35.199997f, 25.600002f, 39.399998f, 24.100002f, 41.499996f);
generalPath.curveTo(22.700003f, 43.599995f, 21.900002f, 46.299995f, 22.100002f, 48.599995f);
generalPath.curveTo(22.300003f, 50.899994f, 22.800003f, 53.199993f, 25.000002f, 55.599995f);
generalPath.curveTo(27.200003f, 57.999996f, 28.700003f, 59.199993f, 29.800003f, 59.699993f);
generalPath.curveTo(30.900003f, 60.29999f, 32.100002f, 60.699993f, 31.800003f, 61.199993f);
generalPath.curveTo(31.500004f, 61.699993f, 30.500004f, 61.399994f, 29.300003f, 60.899994f);
generalPath.curveTo(28.100002f, 60.499992f, 24.100002f, 58.799995f, 21.800003f, 56.199993f);
generalPath.curveTo(19.500004f, 53.59999f, 18.300003f, 49.999992f, 18.400003f, 46.699993f);
generalPath.curveTo(18.500004f, 43.29999f, 19.400003f, 41.899994f, 21.000004f, 39.79999f);
generalPath.curveTo(22.600004f, 37.59999f, 26.800003f, 34.39999f, 28.200005f, 33.59999f);
generalPath.curveTo(29.500004f, 32.79999f, 31.400005f, 31.39999f, 32.200005f, 30.199991f);
generalPath.curveTo(33.100006f, 29.09999f, 33.500004f, 28.09999f, 33.500004f, 26.59999f);
generalPath.curveTo(33.400005f, 24.99999f, 33.600002f, 23.699991f, 33.600002f, 23.09999f);
generalPath.curveTo(33.4f, 22.699991f, 33.4f, 21.699991f, 33.9f, 21.89999f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.378999710083008, 61.54199981689453), new Point2D.Double(26.378999710083008, 21.868000030517578), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(34.0f, 62.4f);
generalPath.curveTo(34.2f, 62.4f, 34.1f, 63.300003f, 33.7f, 63.800003f);
generalPath.curveTo(33.3f, 64.3f, 32.7f, 64.5f, 32.600002f, 64.3f);
generalPath.curveTo(32.500004f, 64.100006f, 33.100002f, 64.0f, 33.500004f, 63.600002f);
generalPath.curveTo(33.900005f, 63.2f, 33.800003f, 62.4f, 34.000004f, 62.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.388999938964844, 64.37000274658203), new Point2D.Double(33.388999938964844, 62.41600036621094), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(38.2f, 62.4f);
generalPath.curveTo(38.0f, 62.4f, 38.100002f, 63.300003f, 38.5f, 63.800003f);
generalPath.curveTo(38.9f, 64.3f, 39.5f, 64.5f, 39.6f, 64.3f);
generalPath.curveTo(39.699997f, 64.100006f, 39.1f, 64.0f, 38.699997f, 63.600002f);
generalPath.curveTo(38.399998f, 63.2f, 38.499996f, 62.4f, 38.199997f, 62.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(38.861000061035156, 64.34600067138672), new Point2D.Double(38.861000061035156, 62.391998291015625), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.4f, 63.4f);
generalPath.curveTo(36.4f, 64.200005f, 36.4f, 64.8f, 36.300003f, 64.8f);
generalPath.curveTo(36.100002f, 64.8f, 36.200005f, 64.200005f, 36.200005f, 63.4f);
generalPath.curveTo(36.200005f, 62.600002f, 36.100006f, 62.0f, 36.300003f, 62.0f);
generalPath.curveTo(36.4f, 61.9f, 36.4f, 62.6f, 36.4f, 63.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.22100067138672, 64.82099914550781), new Point2D.Double(36.22100067138672, 61.939998626708984), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.5f, 45.0f);
generalPath.curveTo(52.7f, 39.7f, 47.1f, 36.2f, 42.9f, 33.6f);
generalPath.curveTo(41.100002f, 32.5f, 38.100002f, 30.999998f, 37.800003f, 28.599998f);
generalPath.curveTo(37.600002f, 27.599998f, 37.600002f, 26.599998f, 37.600002f, 25.599998f);
generalPath.curveTo(37.600002f, 25.199999f, 37.600002f, 24.8f, 37.500004f, 24.399998f);
generalPath.curveTo(37.500004f, 23.899998f, 36.900005f, 24.499998f, 36.700005f, 24.099998f);
generalPath.curveTo(36.000004f, 22.999998f, 36.300003f, 24.399998f, 36.300003f, 24.999998f);
generalPath.curveTo(36.500004f, 26.299997f, 36.600002f, 27.699999f, 36.600002f, 28.999998f);
generalPath.curveTo(36.600002f, 31.599998f, 36.2f, 34.1f, 35.500004f, 36.6f);
generalPath.curveTo(34.000004f, 42.399998f, 32.800003f, 48.399998f, 34.300003f, 54.399998f);
generalPath.curveTo(34.600002f, 55.6f, 35.000004f, 56.899998f, 35.500004f, 57.999996f);
generalPath.curveTo(35.700005f, 58.399998f, 36.000004f, 59.299995f, 36.400005f, 59.499996f);
generalPath.curveTo(38.000004f, 59.899998f, 39.200005f, 59.999996f, 40.500004f, 61.199997f);
generalPath.curveTo(41.300003f, 61.899998f, 41.900005f, 61.499996f, 42.800003f, 61.199997f);
generalPath.curveTo(45.600002f, 60.1f, 48.100002f, 58.6f, 50.100002f, 56.299995f);
generalPath.curveTo(53.000004f, 53.099995f, 54.2f, 49.299995f, 53.500004f, 44.999996f);
generalPath.moveTo(50.500004f, 50.399998f);
generalPath.curveTo(50.200005f, 52.6f, 48.900005f, 54.499996f, 47.500004f, 56.199997f);
generalPath.curveTo(46.500004f, 57.399998f, 45.100002f, 58.899998f, 43.600002f, 59.399998f);
generalPath.curveTo(43.100002f, 59.6f, 43.7f, 58.499996f, 43.800003f, 58.399998f);
generalPath.curveTo(44.300003f, 57.699997f, 44.800003f, 57.1f, 45.4f, 56.399998f);
generalPath.curveTo(46.2f, 55.399998f, 46.9f, 54.399998f, 47.300003f, 53.3f);
generalPath.curveTo(48.800003f, 49.399998f, 48.500004f, 44.8f, 46.200005f, 41.3f);
generalPath.curveTo(45.000004f, 39.399998f, 43.300003f, 37.8f, 41.600006f, 36.399998f);
generalPath.curveTo(40.800007f, 35.699997f, 39.900005f, 34.999996f, 39.200005f, 34.199997f);
generalPath.curveTo(39.000004f, 33.999996f, 37.600006f, 32.1f, 38.100006f, 31.899998f);
generalPath.curveTo(38.200005f, 31.799997f, 41.300007f, 35.1f, 41.700005f, 35.3f);
generalPath.curveTo(43.000004f, 36.3f, 44.300003f, 37.2f, 45.500004f, 38.3f);
generalPath.curveTo(47.100002f, 39.8f, 48.800003f, 41.399998f, 49.700005f, 43.399998f);
generalPath.curveTo(50.600006f, 45.499996f, 50.800003f, 47.999996f, 50.500004f, 50.399998f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(43.678001403808594, 61.7239990234375), new Point2D.Double(43.678001403808594, 23.770999908447266), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.1f, 18.8f);
generalPath.curveTo(35.6f, 19.099998f, 35.699997f, 20.9f, 35.699997f, 22.599998f);
generalPath.curveTo(35.699997f, 24.3f, 35.899998f, 31.399998f, 35.299995f, 33.3f);
generalPath.curveTo(34.799995f, 35.2f, 33.599995f, 37.3f, 32.299995f, 39.2f);
generalPath.curveTo(30.999996f, 41.100002f, 29.499996f, 45.0f, 29.599995f, 47.4f);
generalPath.curveTo(29.699995f, 49.800003f, 30.999994f, 53.800003f, 32.099995f, 55.5f);
generalPath.curveTo(33.199993f, 57.2f, 34.999996f, 59.5f, 34.599995f, 60.0f);
generalPath.curveTo(33.899994f, 60.9f, 30.899994f, 57.7f, 29.399994f, 55.9f);
generalPath.curveTo(27.799994f, 54.0f, 26.299994f, 50.300003f, 26.199993f, 47.300003f);
generalPath.curveTo(26.099993f, 44.4f, 27.799994f, 41.600002f, 28.999992f, 40.000004f);
generalPath.curveTo(30.199993f, 38.300003f, 32.499992f, 35.500004f, 33.09999f, 34.200005f);
generalPath.curveTo(33.69999f, 32.900005f, 34.39999f, 31.500004f, 34.59999f, 29.700005f);
generalPath.curveTo(34.79999f, 27.900005f, 34.59999f, 21.400005f, 34.59999f, 21.400005f);
generalPath.curveTo(34.59999f, 21.400005f, 34.69999f, 18.500006f, 35.09999f, 18.800005f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.018999099731445, 60.15999984741211), new Point2D.Double(31.018999099731445, 18.820999145507812), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_14
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.9f, 21.9f);
generalPath.curveTo(34.4f, 22.1f, 34.4f, 22.699999f, 34.4f, 23.199999f);
generalPath.curveTo(34.4f, 23.8f, 34.2f, 26.099998f, 34.100002f, 28.399998f);
generalPath.curveTo(33.9f, 30.699997f, 32.100002f, 32.6f, 30.800003f, 33.899998f);
generalPath.curveTo(29.500004f, 35.199997f, 25.600002f, 39.399998f, 24.100002f, 41.499996f);
generalPath.curveTo(22.700003f, 43.599995f, 21.900002f, 46.299995f, 22.100002f, 48.599995f);
generalPath.curveTo(22.300003f, 50.899994f, 22.800003f, 53.199993f, 25.000002f, 55.599995f);
generalPath.curveTo(27.200003f, 57.999996f, 28.700003f, 59.199993f, 29.800003f, 59.699993f);
generalPath.curveTo(30.900003f, 60.29999f, 32.100002f, 60.699993f, 31.800003f, 61.199993f);
generalPath.curveTo(31.500004f, 61.699993f, 30.500004f, 61.399994f, 29.300003f, 60.899994f);
generalPath.curveTo(28.100002f, 60.499992f, 24.100002f, 58.799995f, 21.800003f, 56.199993f);
generalPath.curveTo(19.500004f, 53.59999f, 18.300003f, 49.999992f, 18.400003f, 46.699993f);
generalPath.curveTo(18.500004f, 43.29999f, 19.400003f, 41.899994f, 21.000004f, 39.79999f);
generalPath.curveTo(22.600004f, 37.59999f, 26.800003f, 34.39999f, 28.200005f, 33.59999f);
generalPath.curveTo(29.500004f, 32.79999f, 31.400005f, 31.39999f, 32.200005f, 30.199991f);
generalPath.curveTo(33.100006f, 29.09999f, 33.500004f, 28.09999f, 33.500004f, 26.59999f);
generalPath.curveTo(33.400005f, 24.99999f, 33.600002f, 23.699991f, 33.600002f, 23.09999f);
generalPath.curveTo(33.4f, 22.699991f, 33.4f, 21.699991f, 33.9f, 21.89999f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.378999710083008, 61.54199981689453), new Point2D.Double(26.378999710083008, 21.868000030517578), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_15
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(34.0f, 62.4f);
generalPath.curveTo(34.2f, 62.4f, 34.1f, 63.300003f, 33.7f, 63.800003f);
generalPath.curveTo(33.3f, 64.3f, 32.7f, 64.5f, 32.600002f, 64.3f);
generalPath.curveTo(32.500004f, 64.100006f, 33.100002f, 64.0f, 33.500004f, 63.600002f);
generalPath.curveTo(33.900005f, 63.2f, 33.800003f, 62.4f, 34.000004f, 62.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.388999938964844, 64.37000274658203), new Point2D.Double(33.388999938964844, 62.41600036621094), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_16
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.2f, 62.4f);
generalPath.curveTo(38.0f, 62.4f, 38.100002f, 63.300003f, 38.5f, 63.800003f);
generalPath.curveTo(38.9f, 64.3f, 39.5f, 64.5f, 39.6f, 64.3f);
generalPath.curveTo(39.699997f, 64.100006f, 39.1f, 64.0f, 38.699997f, 63.600002f);
generalPath.curveTo(38.399998f, 63.2f, 38.499996f, 62.4f, 38.199997f, 62.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(38.861000061035156, 64.34600067138672), new Point2D.Double(38.861000061035156, 62.391998291015625), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_17
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.4f, 63.4f);
generalPath.curveTo(36.4f, 64.200005f, 36.4f, 64.8f, 36.300003f, 64.8f);
generalPath.curveTo(36.100002f, 64.8f, 36.200005f, 64.200005f, 36.200005f, 63.4f);
generalPath.curveTo(36.200005f, 62.600002f, 36.100006f, 62.0f, 36.300003f, 62.0f);
generalPath.curveTo(36.4f, 61.9f, 36.4f, 62.6f, 36.4f, 63.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.22100067138672, 64.82099914550781), new Point2D.Double(36.22100067138672, 61.939998626708984), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_18
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.5f, 45.0f);
generalPath.curveTo(52.7f, 39.7f, 47.1f, 36.2f, 42.9f, 33.6f);
generalPath.curveTo(41.100002f, 32.5f, 38.100002f, 30.999998f, 37.800003f, 28.599998f);
generalPath.curveTo(37.600002f, 27.599998f, 37.600002f, 26.599998f, 37.600002f, 25.599998f);
generalPath.curveTo(37.600002f, 25.199999f, 37.600002f, 24.8f, 37.500004f, 24.399998f);
generalPath.curveTo(37.500004f, 23.899998f, 36.900005f, 24.499998f, 36.700005f, 24.099998f);
generalPath.curveTo(36.000004f, 22.999998f, 36.300003f, 24.399998f, 36.300003f, 24.999998f);
generalPath.curveTo(36.500004f, 26.299997f, 36.600002f, 27.699999f, 36.600002f, 28.999998f);
generalPath.curveTo(36.600002f, 31.599998f, 36.2f, 34.1f, 35.500004f, 36.6f);
generalPath.curveTo(34.000004f, 42.399998f, 32.800003f, 48.399998f, 34.300003f, 54.399998f);
generalPath.curveTo(34.600002f, 55.6f, 35.000004f, 56.899998f, 35.500004f, 57.999996f);
generalPath.curveTo(35.700005f, 58.399998f, 36.000004f, 59.299995f, 36.400005f, 59.499996f);
generalPath.curveTo(38.000004f, 59.899998f, 39.200005f, 59.999996f, 40.500004f, 61.199997f);
generalPath.curveTo(41.300003f, 61.899998f, 41.900005f, 61.499996f, 42.800003f, 61.199997f);
generalPath.curveTo(45.600002f, 60.1f, 48.100002f, 58.6f, 50.100002f, 56.299995f);
generalPath.curveTo(53.000004f, 53.099995f, 54.2f, 49.299995f, 53.500004f, 44.999996f);
generalPath.moveTo(50.500004f, 50.399998f);
generalPath.curveTo(50.200005f, 52.6f, 48.900005f, 54.499996f, 47.500004f, 56.199997f);
generalPath.curveTo(46.500004f, 57.399998f, 45.100002f, 58.899998f, 43.600002f, 59.399998f);
generalPath.curveTo(43.100002f, 59.6f, 43.7f, 58.499996f, 43.800003f, 58.399998f);
generalPath.curveTo(44.300003f, 57.699997f, 44.800003f, 57.1f, 45.4f, 56.399998f);
generalPath.curveTo(46.2f, 55.399998f, 46.9f, 54.399998f, 47.300003f, 53.3f);
generalPath.curveTo(48.800003f, 49.399998f, 48.500004f, 44.8f, 46.200005f, 41.3f);
generalPath.curveTo(45.000004f, 39.399998f, 43.300003f, 37.8f, 41.600006f, 36.399998f);
generalPath.curveTo(40.800007f, 35.699997f, 39.900005f, 34.999996f, 39.200005f, 34.199997f);
generalPath.curveTo(39.000004f, 33.999996f, 37.600006f, 32.1f, 38.100006f, 31.899998f);
generalPath.curveTo(38.200005f, 31.799997f, 41.300007f, 35.1f, 41.700005f, 35.3f);
generalPath.curveTo(43.000004f, 36.3f, 44.300003f, 37.2f, 45.500004f, 38.3f);
generalPath.curveTo(47.100002f, 39.8f, 48.800003f, 41.399998f, 49.700005f, 43.399998f);
generalPath.curveTo(50.600006f, 45.499996f, 50.800003f, 47.999996f, 50.500004f, 50.399998f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(43.678001403808594, 61.7239990234375), new Point2D.Double(43.678001403808594, 23.770999908447266), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_19
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.1f, 18.8f);
generalPath.curveTo(35.6f, 19.099998f, 35.699997f, 20.9f, 35.699997f, 22.599998f);
generalPath.curveTo(35.699997f, 24.3f, 35.899998f, 31.399998f, 35.299995f, 33.3f);
generalPath.curveTo(34.799995f, 35.2f, 33.599995f, 37.3f, 32.299995f, 39.2f);
generalPath.curveTo(30.999996f, 41.100002f, 29.499996f, 45.0f, 29.599995f, 47.4f);
generalPath.curveTo(29.699995f, 49.800003f, 30.999994f, 53.800003f, 32.099995f, 55.5f);
generalPath.curveTo(33.199993f, 57.2f, 34.999996f, 59.5f, 34.599995f, 60.0f);
generalPath.curveTo(33.899994f, 60.9f, 30.899994f, 57.7f, 29.399994f, 55.9f);
generalPath.curveTo(27.799994f, 54.0f, 26.299994f, 50.300003f, 26.199993f, 47.300003f);
generalPath.curveTo(26.099993f, 44.4f, 27.799994f, 41.600002f, 28.999992f, 40.000004f);
generalPath.curveTo(30.199993f, 38.300003f, 32.499992f, 35.500004f, 33.09999f, 34.200005f);
generalPath.curveTo(33.69999f, 32.900005f, 34.39999f, 31.500004f, 34.59999f, 29.700005f);
generalPath.curveTo(34.79999f, 27.900005f, 34.59999f, 21.400005f, 34.59999f, 21.400005f);
generalPath.curveTo(34.59999f, 21.400005f, 34.69999f, 18.500006f, 35.09999f, 18.800005f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.018999099731445, 60.15999984741211), new Point2D.Double(31.018999099731445, 18.820999145507812), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_20
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.9f, 21.9f);
generalPath.curveTo(34.4f, 22.1f, 34.4f, 22.699999f, 34.4f, 23.199999f);
generalPath.curveTo(34.4f, 23.8f, 34.2f, 26.099998f, 34.100002f, 28.399998f);
generalPath.curveTo(33.9f, 30.699997f, 32.100002f, 32.6f, 30.800003f, 33.899998f);
generalPath.curveTo(29.500004f, 35.199997f, 25.600002f, 39.399998f, 24.100002f, 41.499996f);
generalPath.curveTo(22.700003f, 43.599995f, 21.900002f, 46.299995f, 22.100002f, 48.599995f);
generalPath.curveTo(22.300003f, 50.899994f, 22.800003f, 53.199993f, 25.000002f, 55.599995f);
generalPath.curveTo(27.200003f, 57.999996f, 28.700003f, 59.199993f, 29.800003f, 59.699993f);
generalPath.curveTo(30.900003f, 60.29999f, 32.100002f, 60.699993f, 31.800003f, 61.199993f);
generalPath.curveTo(31.500004f, 61.699993f, 30.500004f, 61.399994f, 29.300003f, 60.899994f);
generalPath.curveTo(28.100002f, 60.499992f, 24.100002f, 58.799995f, 21.800003f, 56.199993f);
generalPath.curveTo(19.500004f, 53.59999f, 18.300003f, 49.999992f, 18.400003f, 46.699993f);
generalPath.curveTo(18.500004f, 43.29999f, 19.400003f, 41.899994f, 21.000004f, 39.79999f);
generalPath.curveTo(22.600004f, 37.59999f, 26.800003f, 34.39999f, 28.200005f, 33.59999f);
generalPath.curveTo(29.500004f, 32.79999f, 31.400005f, 31.39999f, 32.200005f, 30.199991f);
generalPath.curveTo(33.100006f, 29.09999f, 33.500004f, 28.09999f, 33.500004f, 26.59999f);
generalPath.curveTo(33.400005f, 24.99999f, 33.600002f, 23.699991f, 33.600002f, 23.09999f);
generalPath.curveTo(33.4f, 22.699991f, 33.4f, 21.699991f, 33.9f, 21.89999f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.378999710083008, 61.54199981689453), new Point2D.Double(26.378999710083008, 21.868000030517578), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_21
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(34.0f, 62.4f);
generalPath.curveTo(34.2f, 62.4f, 34.1f, 63.300003f, 33.7f, 63.800003f);
generalPath.curveTo(33.3f, 64.3f, 32.7f, 64.5f, 32.600002f, 64.3f);
generalPath.curveTo(32.500004f, 64.100006f, 33.100002f, 64.0f, 33.500004f, 63.600002f);
generalPath.curveTo(33.900005f, 63.2f, 33.800003f, 62.4f, 34.000004f, 62.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.388999938964844, 64.37000274658203), new Point2D.Double(33.388999938964844, 62.41600036621094), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_22
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.2f, 62.4f);
generalPath.curveTo(38.0f, 62.4f, 38.100002f, 63.300003f, 38.5f, 63.800003f);
generalPath.curveTo(38.9f, 64.3f, 39.5f, 64.5f, 39.6f, 64.3f);
generalPath.curveTo(39.699997f, 64.100006f, 39.1f, 64.0f, 38.699997f, 63.600002f);
generalPath.curveTo(38.399998f, 63.2f, 38.499996f, 62.4f, 38.199997f, 62.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(38.861000061035156, 64.34600067138672), new Point2D.Double(38.861000061035156, 62.391998291015625), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_23
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.4f, 63.4f);
generalPath.curveTo(36.4f, 64.200005f, 36.4f, 64.8f, 36.300003f, 64.8f);
generalPath.curveTo(36.100002f, 64.8f, 36.200005f, 64.200005f, 36.200005f, 63.4f);
generalPath.curveTo(36.200005f, 62.600002f, 36.100006f, 62.0f, 36.300003f, 62.0f);
generalPath.curveTo(36.4f, 61.9f, 36.4f, 62.6f, 36.4f, 63.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.22100067138672, 64.82099914550781), new Point2D.Double(36.22100067138672, 61.939998626708984), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_pl() {
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
    public static NeonIcon of(int width, int height) {
       ext_pl base = new ext_pl();
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
       ext_pl base = new ext_pl();
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
        return ext_pl::new;
    }
}

