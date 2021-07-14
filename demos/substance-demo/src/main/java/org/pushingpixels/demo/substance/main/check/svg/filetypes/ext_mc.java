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
public class ext_mc implements NeonIcon {
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
generalPath.moveTo(16.6f, 90.1f);
generalPath.lineTo(16.6f, 70.2f);
generalPath.lineTo(22.7f, 70.2f);
generalPath.lineTo(26.300001f, 83.7f);
generalPath.lineTo(30.0f, 70.2f);
generalPath.lineTo(36.1f, 70.2f);
generalPath.lineTo(36.1f, 90.0f);
generalPath.lineTo(32.3f, 90.0f);
generalPath.lineTo(32.3f, 74.5f);
generalPath.lineTo(28.3f, 90.1f);
generalPath.lineTo(24.4f, 90.1f);
generalPath.lineTo(20.4f, 74.5f);
generalPath.lineTo(20.4f, 90.1f);
generalPath.lineTo(16.6f, 90.1f);
generalPath.closePath();
generalPath.moveTo(53.0f, 82.8f);
generalPath.lineTo(56.9f, 84.0f);
generalPath.curveTo(56.300003f, 86.2f, 55.300003f, 87.8f, 53.9f, 88.8f);
generalPath.curveTo(52.5f, 89.9f, 50.7f, 90.4f, 48.600002f, 90.4f);
generalPath.curveTo(45.9f, 90.4f, 43.7f, 89.5f, 42.000004f, 87.700005f);
generalPath.curveTo(40.300003f, 85.9f, 39.400005f, 83.4f, 39.400005f, 80.3f);
generalPath.curveTo(39.400005f, 77.0f, 40.300007f, 74.4f, 42.000004f, 72.600006f);
generalPath.curveTo(43.700005f, 70.8f, 46.000004f, 69.90001f, 48.800003f, 69.90001f);
generalPath.curveTo(51.300003f, 69.90001f, 53.300003f, 70.600006f, 54.800003f, 72.100006f);
generalPath.curveTo(55.700005f, 72.90001f, 56.4f, 74.200005f, 56.9f, 75.8f);
generalPath.lineTo(52.9f, 76.700005f);
generalPath.curveTo(52.7f, 75.700005f, 52.2f, 74.9f, 51.4f, 74.3f);
generalPath.curveTo(50.600002f, 73.700005f, 49.7f, 73.4f, 48.600002f, 73.4f);
generalPath.curveTo(47.100002f, 73.4f, 45.9f, 73.9f, 45.000004f, 75.0f);
generalPath.curveTo(44.000004f, 76.0f, 43.600002f, 77.7f, 43.600002f, 80.0f);
generalPath.curveTo(43.600002f, 82.5f, 44.100002f, 84.3f, 45.000004f, 85.4f);
generalPath.curveTo(45.900005f, 86.5f, 47.000004f, 87.0f, 48.500004f, 87.0f);
generalPath.curveTo(49.600002f, 87.0f, 50.500004f, 86.7f, 51.300003f, 86.0f);
generalPath.curveTo(52.100002f, 85.3f, 52.600002f, 84.2f, 53.000004f, 82.8f);
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
generalPath.moveTo(54.0f, 45.0f);
generalPath.curveTo(53.2f, 39.7f, 47.6f, 36.2f, 43.4f, 33.6f);
generalPath.curveTo(41.600002f, 32.5f, 38.600002f, 30.999998f, 38.300003f, 28.599998f);
generalPath.curveTo(38.100002f, 27.599998f, 38.100002f, 26.599998f, 38.100002f, 25.599998f);
generalPath.curveTo(38.100002f, 25.199999f, 38.100002f, 24.8f, 38.000004f, 24.399998f);
generalPath.curveTo(38.000004f, 23.899998f, 37.400005f, 24.499998f, 37.200005f, 24.099998f);
generalPath.curveTo(36.500004f, 22.999998f, 36.800003f, 24.399998f, 36.800003f, 24.999998f);
generalPath.curveTo(37.000004f, 26.299997f, 37.100002f, 27.699999f, 37.100002f, 28.999998f);
generalPath.curveTo(37.100002f, 31.599998f, 36.7f, 34.1f, 36.000004f, 36.6f);
generalPath.curveTo(34.500004f, 42.399998f, 33.300003f, 48.399998f, 34.800003f, 54.399998f);
generalPath.curveTo(35.100002f, 55.6f, 35.500004f, 56.899998f, 36.000004f, 57.999996f);
generalPath.curveTo(36.200005f, 58.399998f, 36.500004f, 59.299995f, 36.900005f, 59.499996f);
generalPath.curveTo(38.500004f, 59.899998f, 39.700005f, 59.999996f, 41.000004f, 61.199997f);
generalPath.curveTo(41.800003f, 61.899998f, 42.400005f, 61.499996f, 43.300003f, 61.199997f);
generalPath.curveTo(46.100002f, 60.1f, 48.600002f, 58.6f, 50.600002f, 56.299995f);
generalPath.curveTo(53.500004f, 53.099995f, 54.7f, 49.299995f, 54.000004f, 44.999996f);
generalPath.moveTo(51.000004f, 50.399998f);
generalPath.curveTo(50.700005f, 52.6f, 49.400005f, 54.499996f, 48.000004f, 56.199997f);
generalPath.curveTo(47.000004f, 57.399998f, 45.600002f, 58.899998f, 44.100002f, 59.399998f);
generalPath.curveTo(43.600002f, 59.6f, 44.2f, 58.499996f, 44.300003f, 58.399998f);
generalPath.curveTo(44.800003f, 57.699997f, 45.300003f, 57.1f, 45.9f, 56.399998f);
generalPath.curveTo(46.7f, 55.399998f, 47.4f, 54.399998f, 47.800003f, 53.3f);
generalPath.curveTo(49.300003f, 49.399998f, 49.000004f, 44.8f, 46.700005f, 41.3f);
generalPath.curveTo(45.500004f, 39.399998f, 43.800003f, 37.8f, 42.100006f, 36.399998f);
generalPath.curveTo(41.300007f, 35.699997f, 40.400005f, 34.999996f, 39.700005f, 34.199997f);
generalPath.curveTo(39.500004f, 33.999996f, 38.100006f, 32.1f, 38.600006f, 31.899998f);
generalPath.curveTo(38.700005f, 31.799997f, 41.800007f, 35.1f, 42.200005f, 35.3f);
generalPath.curveTo(43.500004f, 36.3f, 44.800003f, 37.2f, 46.000004f, 38.3f);
generalPath.curveTo(47.600002f, 39.8f, 49.300003f, 41.399998f, 50.200005f, 43.399998f);
generalPath.curveTo(51.100006f, 45.499996f, 51.300003f, 47.999996f, 51.000004f, 50.399998f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.178001403808594, 61.7239990234375), new Point2D.Double(44.178001403808594, 23.770999908447266), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(35.6f, 18.8f);
generalPath.curveTo(36.1f, 19.099998f, 36.199997f, 20.9f, 36.199997f, 22.599998f);
generalPath.curveTo(36.199997f, 24.3f, 36.399998f, 31.399998f, 35.799995f, 33.3f);
generalPath.curveTo(35.299995f, 35.2f, 34.099995f, 37.3f, 32.799995f, 39.2f);
generalPath.curveTo(31.499996f, 41.100002f, 29.999996f, 45.0f, 30.099995f, 47.4f);
generalPath.curveTo(30.199995f, 49.800003f, 31.499994f, 53.800003f, 32.599995f, 55.5f);
generalPath.curveTo(33.699993f, 57.2f, 35.499996f, 59.5f, 35.099995f, 60.0f);
generalPath.curveTo(34.399994f, 60.9f, 31.399994f, 57.7f, 29.899994f, 55.9f);
generalPath.curveTo(28.299994f, 54.0f, 26.799994f, 50.300003f, 26.699993f, 47.300003f);
generalPath.curveTo(26.599993f, 44.4f, 28.299994f, 41.600002f, 29.499992f, 40.000004f);
generalPath.curveTo(30.699993f, 38.300003f, 32.999992f, 35.500004f, 33.59999f, 34.200005f);
generalPath.curveTo(34.19999f, 32.900005f, 34.89999f, 31.500004f, 35.09999f, 29.700005f);
generalPath.curveTo(35.29999f, 27.900005f, 35.09999f, 21.400005f, 35.09999f, 21.400005f);
generalPath.curveTo(35.09999f, 21.400005f, 35.19999f, 18.500006f, 35.59999f, 18.800005f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.518999099731445, 60.15999984741211), new Point2D.Double(31.518999099731445, 18.820999145507812), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(34.4f, 21.9f);
generalPath.curveTo(34.9f, 22.1f, 34.9f, 22.699999f, 34.9f, 23.199999f);
generalPath.curveTo(34.9f, 23.8f, 34.7f, 26.099998f, 34.600002f, 28.399998f);
generalPath.curveTo(34.4f, 30.699997f, 32.600002f, 32.6f, 31.300003f, 33.899998f);
generalPath.curveTo(30.000004f, 35.199997f, 26.100002f, 39.399998f, 24.600002f, 41.499996f);
generalPath.curveTo(23.200003f, 43.599995f, 22.400002f, 46.299995f, 22.600002f, 48.599995f);
generalPath.curveTo(22.800003f, 50.899994f, 23.300003f, 53.199993f, 25.500002f, 55.599995f);
generalPath.curveTo(27.700003f, 57.999996f, 29.200003f, 59.199993f, 30.300003f, 59.699993f);
generalPath.curveTo(31.400003f, 60.29999f, 32.600002f, 60.699993f, 32.300003f, 61.199993f);
generalPath.curveTo(32.000004f, 61.699993f, 31.000004f, 61.399994f, 29.800003f, 60.899994f);
generalPath.curveTo(28.600002f, 60.499992f, 24.600002f, 58.799995f, 22.300003f, 56.199993f);
generalPath.curveTo(20.000004f, 53.59999f, 18.800003f, 49.999992f, 18.900003f, 46.699993f);
generalPath.curveTo(19.000004f, 43.29999f, 19.900003f, 41.899994f, 21.500004f, 39.79999f);
generalPath.curveTo(23.100004f, 37.59999f, 27.300003f, 34.39999f, 28.700005f, 33.59999f);
generalPath.curveTo(30.000004f, 32.79999f, 31.900005f, 31.39999f, 32.700005f, 30.199991f);
generalPath.curveTo(33.600006f, 29.09999f, 34.000004f, 28.09999f, 34.000004f, 26.59999f);
generalPath.curveTo(33.900005f, 24.99999f, 34.100002f, 23.699991f, 34.100002f, 23.09999f);
generalPath.curveTo(33.9f, 22.699991f, 33.9f, 21.699991f, 34.4f, 21.89999f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.878999710083008, 61.54199981689453), new Point2D.Double(26.878999710083008, 21.868000030517578), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(34.5f, 62.4f);
generalPath.curveTo(34.7f, 62.4f, 34.6f, 63.300003f, 34.2f, 63.800003f);
generalPath.curveTo(33.8f, 64.3f, 33.2f, 64.5f, 33.100002f, 64.3f);
generalPath.curveTo(33.000004f, 64.100006f, 33.600002f, 64.0f, 34.000004f, 63.600002f);
generalPath.curveTo(34.400005f, 63.2f, 34.300003f, 62.4f, 34.500004f, 62.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.888999938964844, 64.37000274658203), new Point2D.Double(33.888999938964844, 62.41600036621094), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(38.7f, 62.4f);
generalPath.curveTo(38.5f, 62.4f, 38.600002f, 63.300003f, 39.0f, 63.800003f);
generalPath.curveTo(39.4f, 64.3f, 40.0f, 64.5f, 40.1f, 64.3f);
generalPath.curveTo(40.199997f, 64.100006f, 39.6f, 64.0f, 39.199997f, 63.600002f);
generalPath.curveTo(38.899998f, 63.2f, 38.999996f, 62.4f, 38.699997f, 62.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(39.361000061035156, 64.34600067138672), new Point2D.Double(39.361000061035156, 62.391998291015625), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(36.9f, 63.4f);
generalPath.curveTo(36.9f, 64.200005f, 36.9f, 64.8f, 36.800003f, 64.8f);
generalPath.curveTo(36.600002f, 64.8f, 36.700005f, 64.200005f, 36.700005f, 63.4f);
generalPath.curveTo(36.700005f, 62.600002f, 36.600006f, 62.0f, 36.800003f, 62.0f);
generalPath.curveTo(36.9f, 61.9f, 36.9f, 62.6f, 36.9f, 63.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.72100067138672, 64.82099914550781), new Point2D.Double(36.72100067138672, 61.939998626708984), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(54.0f, 45.0f);
generalPath.curveTo(53.2f, 39.7f, 47.6f, 36.2f, 43.4f, 33.6f);
generalPath.curveTo(41.600002f, 32.5f, 38.600002f, 30.999998f, 38.300003f, 28.599998f);
generalPath.curveTo(38.100002f, 27.599998f, 38.100002f, 26.599998f, 38.100002f, 25.599998f);
generalPath.curveTo(38.100002f, 25.199999f, 38.100002f, 24.8f, 38.000004f, 24.399998f);
generalPath.curveTo(38.000004f, 23.899998f, 37.400005f, 24.499998f, 37.200005f, 24.099998f);
generalPath.curveTo(36.500004f, 22.999998f, 36.800003f, 24.399998f, 36.800003f, 24.999998f);
generalPath.curveTo(37.000004f, 26.299997f, 37.100002f, 27.699999f, 37.100002f, 28.999998f);
generalPath.curveTo(37.100002f, 31.599998f, 36.7f, 34.1f, 36.000004f, 36.6f);
generalPath.curveTo(34.500004f, 42.399998f, 33.300003f, 48.399998f, 34.800003f, 54.399998f);
generalPath.curveTo(35.100002f, 55.6f, 35.500004f, 56.899998f, 36.000004f, 57.999996f);
generalPath.curveTo(36.200005f, 58.399998f, 36.500004f, 59.299995f, 36.900005f, 59.499996f);
generalPath.curveTo(38.500004f, 59.899998f, 39.700005f, 59.999996f, 41.000004f, 61.199997f);
generalPath.curveTo(41.800003f, 61.899998f, 42.400005f, 61.499996f, 43.300003f, 61.199997f);
generalPath.curveTo(46.100002f, 60.1f, 48.600002f, 58.6f, 50.600002f, 56.299995f);
generalPath.curveTo(53.500004f, 53.099995f, 54.7f, 49.299995f, 54.000004f, 44.999996f);
generalPath.moveTo(51.000004f, 50.399998f);
generalPath.curveTo(50.700005f, 52.6f, 49.400005f, 54.499996f, 48.000004f, 56.199997f);
generalPath.curveTo(47.000004f, 57.399998f, 45.600002f, 58.899998f, 44.100002f, 59.399998f);
generalPath.curveTo(43.600002f, 59.6f, 44.2f, 58.499996f, 44.300003f, 58.399998f);
generalPath.curveTo(44.800003f, 57.699997f, 45.300003f, 57.1f, 45.9f, 56.399998f);
generalPath.curveTo(46.7f, 55.399998f, 47.4f, 54.399998f, 47.800003f, 53.3f);
generalPath.curveTo(49.300003f, 49.399998f, 49.000004f, 44.8f, 46.700005f, 41.3f);
generalPath.curveTo(45.500004f, 39.399998f, 43.800003f, 37.8f, 42.100006f, 36.399998f);
generalPath.curveTo(41.300007f, 35.699997f, 40.400005f, 34.999996f, 39.700005f, 34.199997f);
generalPath.curveTo(39.500004f, 33.999996f, 38.100006f, 32.1f, 38.600006f, 31.899998f);
generalPath.curveTo(38.700005f, 31.799997f, 41.800007f, 35.1f, 42.200005f, 35.3f);
generalPath.curveTo(43.500004f, 36.3f, 44.800003f, 37.2f, 46.000004f, 38.3f);
generalPath.curveTo(47.600002f, 39.8f, 49.300003f, 41.399998f, 50.200005f, 43.399998f);
generalPath.curveTo(51.100006f, 45.499996f, 51.300003f, 47.999996f, 51.000004f, 50.399998f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.178001403808594, 61.7239990234375), new Point2D.Double(44.178001403808594, 23.770999908447266), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(35.6f, 18.8f);
generalPath.curveTo(36.1f, 19.099998f, 36.199997f, 20.9f, 36.199997f, 22.599998f);
generalPath.curveTo(36.199997f, 24.3f, 36.399998f, 31.399998f, 35.799995f, 33.3f);
generalPath.curveTo(35.299995f, 35.2f, 34.099995f, 37.3f, 32.799995f, 39.2f);
generalPath.curveTo(31.499996f, 41.100002f, 29.999996f, 45.0f, 30.099995f, 47.4f);
generalPath.curveTo(30.199995f, 49.800003f, 31.499994f, 53.800003f, 32.599995f, 55.5f);
generalPath.curveTo(33.699993f, 57.2f, 35.499996f, 59.5f, 35.099995f, 60.0f);
generalPath.curveTo(34.399994f, 60.9f, 31.399994f, 57.7f, 29.899994f, 55.9f);
generalPath.curveTo(28.299994f, 54.0f, 26.799994f, 50.300003f, 26.699993f, 47.300003f);
generalPath.curveTo(26.599993f, 44.4f, 28.299994f, 41.600002f, 29.499992f, 40.000004f);
generalPath.curveTo(30.699993f, 38.300003f, 32.999992f, 35.500004f, 33.59999f, 34.200005f);
generalPath.curveTo(34.19999f, 32.900005f, 34.89999f, 31.500004f, 35.09999f, 29.700005f);
generalPath.curveTo(35.29999f, 27.900005f, 35.09999f, 21.400005f, 35.09999f, 21.400005f);
generalPath.curveTo(35.09999f, 21.400005f, 35.19999f, 18.500006f, 35.59999f, 18.800005f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.518999099731445, 60.15999984741211), new Point2D.Double(31.518999099731445, 18.820999145507812), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(34.4f, 21.9f);
generalPath.curveTo(34.9f, 22.1f, 34.9f, 22.699999f, 34.9f, 23.199999f);
generalPath.curveTo(34.9f, 23.8f, 34.7f, 26.099998f, 34.600002f, 28.399998f);
generalPath.curveTo(34.4f, 30.699997f, 32.600002f, 32.6f, 31.300003f, 33.899998f);
generalPath.curveTo(30.000004f, 35.199997f, 26.100002f, 39.399998f, 24.600002f, 41.499996f);
generalPath.curveTo(23.200003f, 43.599995f, 22.400002f, 46.299995f, 22.600002f, 48.599995f);
generalPath.curveTo(22.800003f, 50.899994f, 23.300003f, 53.199993f, 25.500002f, 55.599995f);
generalPath.curveTo(27.700003f, 57.999996f, 29.200003f, 59.199993f, 30.300003f, 59.699993f);
generalPath.curveTo(31.400003f, 60.29999f, 32.600002f, 60.699993f, 32.300003f, 61.199993f);
generalPath.curveTo(32.000004f, 61.699993f, 31.000004f, 61.399994f, 29.800003f, 60.899994f);
generalPath.curveTo(28.600002f, 60.499992f, 24.600002f, 58.799995f, 22.300003f, 56.199993f);
generalPath.curveTo(20.000004f, 53.59999f, 18.800003f, 49.999992f, 18.900003f, 46.699993f);
generalPath.curveTo(19.000004f, 43.29999f, 19.900003f, 41.899994f, 21.500004f, 39.79999f);
generalPath.curveTo(23.100004f, 37.59999f, 27.300003f, 34.39999f, 28.700005f, 33.59999f);
generalPath.curveTo(30.000004f, 32.79999f, 31.900005f, 31.39999f, 32.700005f, 30.199991f);
generalPath.curveTo(33.600006f, 29.09999f, 34.000004f, 28.09999f, 34.000004f, 26.59999f);
generalPath.curveTo(33.900005f, 24.99999f, 34.100002f, 23.699991f, 34.100002f, 23.09999f);
generalPath.curveTo(33.9f, 22.699991f, 33.9f, 21.699991f, 34.4f, 21.89999f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.878999710083008, 61.54199981689453), new Point2D.Double(26.878999710083008, 21.868000030517578), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(34.5f, 62.4f);
generalPath.curveTo(34.7f, 62.4f, 34.6f, 63.300003f, 34.2f, 63.800003f);
generalPath.curveTo(33.8f, 64.3f, 33.2f, 64.5f, 33.100002f, 64.3f);
generalPath.curveTo(33.000004f, 64.100006f, 33.600002f, 64.0f, 34.000004f, 63.600002f);
generalPath.curveTo(34.400005f, 63.2f, 34.300003f, 62.4f, 34.500004f, 62.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.888999938964844, 64.37000274658203), new Point2D.Double(33.888999938964844, 62.41600036621094), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(38.7f, 62.4f);
generalPath.curveTo(38.5f, 62.4f, 38.600002f, 63.300003f, 39.0f, 63.800003f);
generalPath.curveTo(39.4f, 64.3f, 40.0f, 64.5f, 40.1f, 64.3f);
generalPath.curveTo(40.199997f, 64.100006f, 39.6f, 64.0f, 39.199997f, 63.600002f);
generalPath.curveTo(38.899998f, 63.2f, 38.999996f, 62.4f, 38.699997f, 62.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(39.361000061035156, 64.34600067138672), new Point2D.Double(39.361000061035156, 62.391998291015625), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(36.9f, 63.4f);
generalPath.curveTo(36.9f, 64.200005f, 36.9f, 64.8f, 36.800003f, 64.8f);
generalPath.curveTo(36.600002f, 64.8f, 36.700005f, 64.200005f, 36.700005f, 63.4f);
generalPath.curveTo(36.700005f, 62.600002f, 36.600006f, 62.0f, 36.800003f, 62.0f);
generalPath.curveTo(36.9f, 61.9f, 36.9f, 62.6f, 36.9f, 63.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.72100067138672, 64.82099914550781), new Point2D.Double(36.72100067138672, 61.939998626708984), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(54.0f, 45.0f);
generalPath.curveTo(53.2f, 39.7f, 47.6f, 36.2f, 43.4f, 33.6f);
generalPath.curveTo(41.600002f, 32.5f, 38.600002f, 30.999998f, 38.300003f, 28.599998f);
generalPath.curveTo(38.100002f, 27.599998f, 38.100002f, 26.599998f, 38.100002f, 25.599998f);
generalPath.curveTo(38.100002f, 25.199999f, 38.100002f, 24.8f, 38.000004f, 24.399998f);
generalPath.curveTo(38.000004f, 23.899998f, 37.400005f, 24.499998f, 37.200005f, 24.099998f);
generalPath.curveTo(36.500004f, 22.999998f, 36.800003f, 24.399998f, 36.800003f, 24.999998f);
generalPath.curveTo(37.000004f, 26.299997f, 37.100002f, 27.699999f, 37.100002f, 28.999998f);
generalPath.curveTo(37.100002f, 31.599998f, 36.7f, 34.1f, 36.000004f, 36.6f);
generalPath.curveTo(34.500004f, 42.399998f, 33.300003f, 48.399998f, 34.800003f, 54.399998f);
generalPath.curveTo(35.100002f, 55.6f, 35.500004f, 56.899998f, 36.000004f, 57.999996f);
generalPath.curveTo(36.200005f, 58.399998f, 36.500004f, 59.299995f, 36.900005f, 59.499996f);
generalPath.curveTo(38.500004f, 59.899998f, 39.700005f, 59.999996f, 41.000004f, 61.199997f);
generalPath.curveTo(41.800003f, 61.899998f, 42.400005f, 61.499996f, 43.300003f, 61.199997f);
generalPath.curveTo(46.100002f, 60.1f, 48.600002f, 58.6f, 50.600002f, 56.299995f);
generalPath.curveTo(53.500004f, 53.099995f, 54.7f, 49.299995f, 54.000004f, 44.999996f);
generalPath.moveTo(51.000004f, 50.399998f);
generalPath.curveTo(50.700005f, 52.6f, 49.400005f, 54.499996f, 48.000004f, 56.199997f);
generalPath.curveTo(47.000004f, 57.399998f, 45.600002f, 58.899998f, 44.100002f, 59.399998f);
generalPath.curveTo(43.600002f, 59.6f, 44.2f, 58.499996f, 44.300003f, 58.399998f);
generalPath.curveTo(44.800003f, 57.699997f, 45.300003f, 57.1f, 45.9f, 56.399998f);
generalPath.curveTo(46.7f, 55.399998f, 47.4f, 54.399998f, 47.800003f, 53.3f);
generalPath.curveTo(49.300003f, 49.399998f, 49.000004f, 44.8f, 46.700005f, 41.3f);
generalPath.curveTo(45.500004f, 39.399998f, 43.800003f, 37.8f, 42.100006f, 36.399998f);
generalPath.curveTo(41.300007f, 35.699997f, 40.400005f, 34.999996f, 39.700005f, 34.199997f);
generalPath.curveTo(39.500004f, 33.999996f, 38.100006f, 32.1f, 38.600006f, 31.899998f);
generalPath.curveTo(38.700005f, 31.799997f, 41.800007f, 35.1f, 42.200005f, 35.3f);
generalPath.curveTo(43.500004f, 36.3f, 44.800003f, 37.2f, 46.000004f, 38.3f);
generalPath.curveTo(47.600002f, 39.8f, 49.300003f, 41.399998f, 50.200005f, 43.399998f);
generalPath.curveTo(51.100006f, 45.499996f, 51.300003f, 47.999996f, 51.000004f, 50.399998f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.178001403808594, 61.7239990234375), new Point2D.Double(44.178001403808594, 23.770999908447266), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(35.6f, 18.8f);
generalPath.curveTo(36.1f, 19.099998f, 36.199997f, 20.9f, 36.199997f, 22.599998f);
generalPath.curveTo(36.199997f, 24.3f, 36.399998f, 31.399998f, 35.799995f, 33.3f);
generalPath.curveTo(35.299995f, 35.2f, 34.099995f, 37.3f, 32.799995f, 39.2f);
generalPath.curveTo(31.499996f, 41.100002f, 29.999996f, 45.0f, 30.099995f, 47.4f);
generalPath.curveTo(30.199995f, 49.800003f, 31.499994f, 53.800003f, 32.599995f, 55.5f);
generalPath.curveTo(33.699993f, 57.2f, 35.499996f, 59.5f, 35.099995f, 60.0f);
generalPath.curveTo(34.399994f, 60.9f, 31.399994f, 57.7f, 29.899994f, 55.9f);
generalPath.curveTo(28.299994f, 54.0f, 26.799994f, 50.300003f, 26.699993f, 47.300003f);
generalPath.curveTo(26.599993f, 44.4f, 28.299994f, 41.600002f, 29.499992f, 40.000004f);
generalPath.curveTo(30.699993f, 38.300003f, 32.999992f, 35.500004f, 33.59999f, 34.200005f);
generalPath.curveTo(34.19999f, 32.900005f, 34.89999f, 31.500004f, 35.09999f, 29.700005f);
generalPath.curveTo(35.29999f, 27.900005f, 35.09999f, 21.400005f, 35.09999f, 21.400005f);
generalPath.curveTo(35.09999f, 21.400005f, 35.19999f, 18.500006f, 35.59999f, 18.800005f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.518999099731445, 60.15999984741211), new Point2D.Double(31.518999099731445, 18.820999145507812), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(34.4f, 21.9f);
generalPath.curveTo(34.9f, 22.1f, 34.9f, 22.699999f, 34.9f, 23.199999f);
generalPath.curveTo(34.9f, 23.8f, 34.7f, 26.099998f, 34.600002f, 28.399998f);
generalPath.curveTo(34.4f, 30.699997f, 32.600002f, 32.6f, 31.300003f, 33.899998f);
generalPath.curveTo(30.000004f, 35.199997f, 26.100002f, 39.399998f, 24.600002f, 41.499996f);
generalPath.curveTo(23.200003f, 43.599995f, 22.400002f, 46.299995f, 22.600002f, 48.599995f);
generalPath.curveTo(22.800003f, 50.899994f, 23.300003f, 53.199993f, 25.500002f, 55.599995f);
generalPath.curveTo(27.700003f, 57.999996f, 29.200003f, 59.199993f, 30.300003f, 59.699993f);
generalPath.curveTo(31.400003f, 60.29999f, 32.600002f, 60.699993f, 32.300003f, 61.199993f);
generalPath.curveTo(32.000004f, 61.699993f, 31.000004f, 61.399994f, 29.800003f, 60.899994f);
generalPath.curveTo(28.600002f, 60.499992f, 24.600002f, 58.799995f, 22.300003f, 56.199993f);
generalPath.curveTo(20.000004f, 53.59999f, 18.800003f, 49.999992f, 18.900003f, 46.699993f);
generalPath.curveTo(19.000004f, 43.29999f, 19.900003f, 41.899994f, 21.500004f, 39.79999f);
generalPath.curveTo(23.100004f, 37.59999f, 27.300003f, 34.39999f, 28.700005f, 33.59999f);
generalPath.curveTo(30.000004f, 32.79999f, 31.900005f, 31.39999f, 32.700005f, 30.199991f);
generalPath.curveTo(33.600006f, 29.09999f, 34.000004f, 28.09999f, 34.000004f, 26.59999f);
generalPath.curveTo(33.900005f, 24.99999f, 34.100002f, 23.699991f, 34.100002f, 23.09999f);
generalPath.curveTo(33.9f, 22.699991f, 33.9f, 21.699991f, 34.4f, 21.89999f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.878999710083008, 61.54199981689453), new Point2D.Double(26.878999710083008, 21.868000030517578), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(34.5f, 62.4f);
generalPath.curveTo(34.7f, 62.4f, 34.6f, 63.300003f, 34.2f, 63.800003f);
generalPath.curveTo(33.8f, 64.3f, 33.2f, 64.5f, 33.100002f, 64.3f);
generalPath.curveTo(33.000004f, 64.100006f, 33.600002f, 64.0f, 34.000004f, 63.600002f);
generalPath.curveTo(34.400005f, 63.2f, 34.300003f, 62.4f, 34.500004f, 62.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.888999938964844, 64.37000274658203), new Point2D.Double(33.888999938964844, 62.41600036621094), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(38.7f, 62.4f);
generalPath.curveTo(38.5f, 62.4f, 38.600002f, 63.300003f, 39.0f, 63.800003f);
generalPath.curveTo(39.4f, 64.3f, 40.0f, 64.5f, 40.1f, 64.3f);
generalPath.curveTo(40.199997f, 64.100006f, 39.6f, 64.0f, 39.199997f, 63.600002f);
generalPath.curveTo(38.899998f, 63.2f, 38.999996f, 62.4f, 38.699997f, 62.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(39.361000061035156, 64.34600067138672), new Point2D.Double(39.361000061035156, 62.391998291015625), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(36.9f, 63.4f);
generalPath.curveTo(36.9f, 64.200005f, 36.9f, 64.8f, 36.800003f, 64.8f);
generalPath.curveTo(36.600002f, 64.8f, 36.700005f, 64.200005f, 36.700005f, 63.4f);
generalPath.curveTo(36.700005f, 62.600002f, 36.600006f, 62.0f, 36.800003f, 62.0f);
generalPath.curveTo(36.9f, 61.9f, 36.9f, 62.6f, 36.9f, 63.4f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.72100067138672, 64.82099914550781), new Point2D.Double(36.72100067138672, 61.939998626708984), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_mc() {
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
       ext_mc base = new ext_mc();
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
       ext_mc base = new ext_mc();
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
        return ext_mc::new;
    }
}

