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
public class ext_js implements NeonIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
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
generalPath.moveTo(14.4f, 44.1f);
generalPath.lineTo(14.4f, 39.199997f);
generalPath.curveTo(15.4f, 39.1f, 16.199999f, 38.999996f, 16.699999f, 38.699997f);
generalPath.curveTo(17.199999f, 38.499996f, 17.599998f, 37.999996f, 17.999998f, 37.499996f);
generalPath.curveTo(18.399998f, 36.899998f, 18.599998f, 36.199997f, 18.799997f, 35.299995f);
generalPath.curveTo(18.899998f, 34.599995f, 18.999998f, 33.499996f, 18.999998f, 31.899996f);
generalPath.curveTo(18.999998f, 29.199995f, 19.099998f, 27.399996f, 19.399998f, 26.299995f);
generalPath.curveTo(19.599998f, 25.299995f, 20.099998f, 24.399996f, 20.699997f, 23.799995f);
generalPath.curveTo(21.299995f, 23.199995f, 22.299997f, 22.699995f, 23.499996f, 22.299995f);
generalPath.curveTo(24.299995f, 22.099995f, 25.599997f, 21.899996f, 27.399996f, 21.899996f);
generalPath.lineTo(28.499996f, 21.899996f);
generalPath.lineTo(28.499996f, 26.799995f);
generalPath.curveTo(26.999996f, 26.799995f, 25.999996f, 26.899996f, 25.599997f, 27.099995f);
generalPath.curveTo(25.199997f, 27.299995f, 24.899996f, 27.499994f, 24.599997f, 27.899994f);
generalPath.curveTo(24.399996f, 28.199993f, 24.299997f, 28.799994f, 24.299997f, 29.699993f);
generalPath.curveTo(24.299997f, 30.599993f, 24.199997f, 32.199993f, 24.099997f, 34.599995f);
generalPath.curveTo(23.999996f, 35.999996f, 23.899996f, 37.099995f, 23.599997f, 37.999996f);
generalPath.curveTo(23.299997f, 38.799995f, 22.899996f, 39.499996f, 22.499996f, 40.099995f);
generalPath.curveTo(22.099997f, 40.599995f, 21.399996f, 41.199993f, 20.499996f, 41.799995f);
generalPath.curveTo(21.299995f, 42.299995f, 21.999996f, 42.799995f, 22.499996f, 43.399994f);
generalPath.curveTo(22.999996f, 43.999992f, 23.399996f, 44.799995f, 23.699997f, 45.699993f);
generalPath.curveTo(23.999998f, 46.59999f, 24.199997f, 47.79999f, 24.199997f, 49.29999f);
generalPath.curveTo(24.299997f, 51.59999f, 24.299997f, 52.999992f, 24.299997f, 53.699993f);
generalPath.curveTo(24.299997f, 54.599995f, 24.399998f, 55.199993f, 24.599997f, 55.599995f);
generalPath.curveTo(24.799997f, 55.999996f, 25.199997f, 56.199993f, 25.599997f, 56.399994f);
generalPath.curveTo(25.999996f, 56.599995f, 26.999996f, 56.699993f, 28.499996f, 56.699993f);
generalPath.lineTo(28.499996f, 61.599995f);
generalPath.lineTo(27.399996f, 61.599995f);
generalPath.curveTo(25.599997f, 61.599995f, 24.099997f, 61.499996f, 23.199997f, 61.199993f);
generalPath.curveTo(22.199997f, 60.899994f, 21.399998f, 60.399994f, 20.699997f, 59.699993f);
generalPath.curveTo(19.999996f, 58.999992f, 19.599997f, 58.199993f, 19.299997f, 57.199993f);
generalPath.curveTo(19.099997f, 56.199993f, 18.999998f, 54.599995f, 18.999998f, 52.399994f);
generalPath.curveTo(18.999998f, 49.899994f, 18.899998f, 48.199993f, 18.699999f, 47.499992f);
generalPath.curveTo(18.4f, 46.399994f, 17.9f, 45.59999f, 17.3f, 45.09999f);
generalPath.curveTo(16.599998f, 44.499992f, 15.699999f, 44.09999f, 14.4f, 44.09999f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.450000762939453, 61.54999923706055), new Point2D.Double(21.450000762939453, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(58.7f, 44.1f);
generalPath.curveTo(57.7f, 44.199997f, 56.9f, 44.3f, 56.4f, 44.6f);
generalPath.curveTo(55.9f, 44.8f, 55.5f, 45.3f, 55.100002f, 45.8f);
generalPath.curveTo(54.7f, 46.399998f, 54.500004f, 47.1f, 54.300003f, 48.0f);
generalPath.curveTo(54.200005f, 48.7f, 54.100002f, 49.8f, 54.100002f, 51.4f);
generalPath.curveTo(54.100002f, 54.100002f, 54.000004f, 55.9f, 53.7f, 57.0f);
generalPath.curveTo(53.5f, 58.1f, 53.0f, 58.9f, 52.4f, 59.5f);
generalPath.curveTo(51.800003f, 60.1f, 50.800003f, 60.6f, 49.600002f, 61.0f);
generalPath.curveTo(48.800003f, 61.2f, 47.500004f, 61.4f, 45.7f, 61.4f);
generalPath.lineTo(44.600002f, 61.4f);
generalPath.lineTo(44.600002f, 56.5f);
generalPath.curveTo(46.100002f, 56.5f, 47.000004f, 56.4f, 47.500004f, 56.2f);
generalPath.curveTo(48.000004f, 56.0f, 48.300003f, 55.7f, 48.500004f, 55.4f);
generalPath.curveTo(48.700005f, 55.100002f, 48.800003f, 54.5f, 48.800003f, 53.600002f);
generalPath.curveTo(48.800003f, 52.800003f, 48.9f, 51.2f, 49.000004f, 48.800003f);
generalPath.curveTo(49.100002f, 47.4f, 49.300003f, 46.200005f, 49.600002f, 45.4f);
generalPath.curveTo(49.9f, 44.5f, 50.300003f, 43.800003f, 50.800003f, 43.2f);
generalPath.curveTo(51.300003f, 42.6f, 51.9f, 42.100002f, 52.700005f, 41.600002f);
generalPath.curveTo(51.700005f, 40.9f, 50.900005f, 40.300003f, 50.500004f, 39.7f);
generalPath.curveTo(49.900005f, 38.8f, 49.400005f, 37.600002f, 49.200005f, 36.3f);
generalPath.curveTo(49.000004f, 35.3f, 48.900005f, 33.2f, 48.900005f, 30.0f);
generalPath.curveTo(48.900005f, 29.0f, 48.800007f, 28.3f, 48.600006f, 27.9f);
generalPath.curveTo(48.400005f, 27.6f, 48.100006f, 27.3f, 47.700005f, 27.1f);
generalPath.curveTo(47.300003f, 26.9f, 46.300003f, 26.800001f, 44.700005f, 26.800001f);
generalPath.lineTo(44.700005f, 22.0f);
generalPath.lineTo(45.800003f, 22.0f);
generalPath.curveTo(47.600002f, 22.0f, 49.100002f, 22.1f, 50.000004f, 22.4f);
generalPath.curveTo(51.000004f, 22.699999f, 51.800003f, 23.199999f, 52.500004f, 23.9f);
generalPath.curveTo(53.200005f, 24.6f, 53.600002f, 25.4f, 53.900005f, 26.4f);
generalPath.curveTo(54.100006f, 27.4f, 54.300007f, 29.0f, 54.300007f, 31.2f);
generalPath.curveTo(54.300007f, 33.7f, 54.400005f, 35.3f, 54.600006f, 36.100002f);
generalPath.curveTo(54.900005f, 37.2f, 55.400005f, 38.000004f, 56.000008f, 38.4f);
generalPath.curveTo(56.600006f, 38.9f, 57.600006f, 39.100002f, 58.800007f, 39.2f);
generalPath.lineTo(58.70001f, 44.100002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(51.70000076293945, 61.45000076293945), new Point2D.Double(51.70000076293945, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
// _0_4
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
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(28.1f, 71.5f);
generalPath.lineTo(32.1f, 71.5f);
generalPath.lineTo(32.1f, 84.2f);
generalPath.curveTo(32.1f, 85.899994f, 31.999998f, 87.1f, 31.699999f, 88.0f);
generalPath.curveTo(31.3f, 89.2f, 30.599998f, 90.1f, 29.599998f, 90.8f);
generalPath.curveTo(28.599998f, 91.5f, 27.199999f, 91.9f, 25.499998f, 91.9f);
generalPath.curveTo(23.499998f, 91.9f, 21.999998f, 91.3f, 20.899998f, 90.200005f);
generalPath.curveTo(19.799997f, 89.100006f, 19.299997f, 87.50001f, 19.299997f, 85.3f);
generalPath.lineTo(23.099997f, 84.9f);
generalPath.curveTo(23.099997f, 86.0f, 23.299997f, 86.9f, 23.599997f, 87.3f);
generalPath.curveTo(23.999996f, 88.0f, 24.699997f, 88.4f, 25.599997f, 88.4f);
generalPath.curveTo(26.499996f, 88.4f, 27.099997f, 88.1f, 27.499996f, 87.6f);
generalPath.curveTo(27.899996f, 87.1f, 28.099997f, 86.0f, 28.099997f, 84.4f);
generalPath.lineTo(28.099997f, 71.5f);
generalPath.closePath();
generalPath.moveTo(35.5f, 85.0f);
generalPath.lineTo(39.4f, 84.6f);
generalPath.curveTo(39.600002f, 85.9f, 40.100002f, 86.9f, 40.800003f, 87.5f);
generalPath.curveTo(41.500004f, 88.1f, 42.500004f, 88.4f, 43.700005f, 88.4f);
generalPath.curveTo(45.000004f, 88.4f, 46.000004f, 88.1f, 46.600006f, 87.6f);
generalPath.curveTo(47.300007f, 87.0f, 47.600006f, 86.4f, 47.600006f, 85.7f);
generalPath.curveTo(47.600006f, 85.2f, 47.500008f, 84.799995f, 47.200005f, 84.5f);
generalPath.curveTo(46.900005f, 84.2f, 46.400005f, 83.9f, 45.700005f, 83.6f);
generalPath.curveTo(45.200005f, 83.4f, 44.100006f, 83.1f, 42.500004f, 82.7f);
generalPath.curveTo(40.300003f, 82.2f, 38.800003f, 81.5f, 37.900005f, 80.7f);
generalPath.curveTo(36.700005f, 79.6f, 36.100006f, 78.299995f, 36.100006f, 76.7f);
generalPath.curveTo(36.100006f, 75.7f, 36.400005f, 74.7f, 37.000008f, 73.799995f);
generalPath.curveTo(37.600006f, 72.899994f, 38.40001f, 72.2f, 39.500008f, 71.799995f);
generalPath.curveTo(40.600006f, 71.299995f, 41.90001f, 71.1f, 43.40001f, 71.1f);
generalPath.curveTo(45.90001f, 71.1f, 47.80001f, 71.7f, 49.10001f, 72.799995f);
generalPath.curveTo(50.40001f, 73.899994f, 51.00001f, 75.399994f, 51.10001f, 77.2f);
generalPath.lineTo(47.10001f, 77.399994f);
generalPath.curveTo(46.90001f, 76.399994f, 46.60001f, 75.59999f, 46.00001f, 75.2f);
generalPath.curveTo(45.400013f, 74.7f, 44.60001f, 74.5f, 43.400013f, 74.5f);
generalPath.curveTo(42.200012f, 74.5f, 41.300014f, 74.7f, 40.600014f, 75.2f);
generalPath.curveTo(40.200012f, 75.5f, 40.000015f, 75.899994f, 40.000015f, 76.399994f);
generalPath.curveTo(40.000015f, 76.899994f, 40.200016f, 77.299995f, 40.600014f, 77.59999f);
generalPath.curveTo(41.100014f, 77.99999f, 42.400013f, 78.49999f, 44.300014f, 78.899994f);
generalPath.curveTo(46.200016f, 79.299995f, 47.700016f, 79.799995f, 48.700016f, 80.299995f);
generalPath.curveTo(49.700016f, 80.799995f, 50.400017f, 81.49999f, 50.900017f, 82.299995f);
generalPath.curveTo(51.400017f, 83.1f, 51.700016f, 84.2f, 51.700016f, 85.49999f);
generalPath.curveTo(51.700016f, 86.59999f, 51.400017f, 87.69999f, 50.700016f, 88.69999f);
generalPath.curveTo(50.100018f, 89.69999f, 49.200016f, 90.39999f, 48.000015f, 90.89999f);
generalPath.curveTo(46.800014f, 91.39999f, 45.400017f, 91.59998f, 43.600014f, 91.59998f);
generalPath.curveTo(41.100014f, 91.59998f, 39.100014f, 90.999985f, 37.800014f, 89.79998f);
generalPath.curveTo(36.500015f, 88.99998f, 35.700016f, 87.29998f, 35.500015f, 84.99998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_js() {
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
       ext_js base = new ext_js();
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
       ext_js base = new ext_js();
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
        return ext_js::new;
    }
}

