package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_php implements NeonIcon {
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
generalPath.moveTo(9.3f, 90.1f);
generalPath.lineTo(9.3f, 70.2f);
generalPath.lineTo(15.8f, 70.2f);
generalPath.curveTo(18.3f, 70.2f, 19.9f, 70.299995f, 20.6f, 70.5f);
generalPath.curveTo(21.800001f, 70.8f, 22.7f, 71.4f, 23.5f, 72.4f);
generalPath.curveTo(24.3f, 73.4f, 24.7f, 74.700005f, 24.7f, 76.3f);
generalPath.curveTo(24.7f, 77.5f, 24.5f, 78.5f, 24.0f, 79.4f);
generalPath.curveTo(23.6f, 80.200005f, 23.0f, 80.9f, 22.3f, 81.4f);
generalPath.curveTo(21.599998f, 81.9f, 20.9f, 82.200005f, 20.199999f, 82.3f);
generalPath.curveTo(19.199999f, 82.5f, 17.8f, 82.600006f, 15.999999f, 82.600006f);
generalPath.lineTo(13.4f, 82.600006f);
generalPath.lineTo(13.4f, 90.100006f);
generalPath.lineTo(9.3f, 90.100006f);
generalPath.closePath();
generalPath.moveTo(13.4f, 73.6f);
generalPath.lineTo(13.4f, 79.2f);
generalPath.lineTo(15.599999f, 79.2f);
generalPath.curveTo(17.199999f, 79.2f, 18.3f, 79.1f, 18.8f, 78.899994f);
generalPath.curveTo(19.3f, 78.7f, 19.8f, 78.399994f, 20.099998f, 77.899994f);
generalPath.curveTo(20.399998f, 77.49999f, 20.599998f, 76.899994f, 20.599998f, 76.399994f);
generalPath.curveTo(20.599998f, 75.7f, 20.399998f, 75.09999f, 19.999998f, 74.59999f);
generalPath.curveTo(19.599998f, 74.09999f, 18.999998f, 73.79999f, 18.399998f, 73.69999f);
generalPath.curveTo(17.899998f, 73.59999f, 16.899998f, 73.59999f, 15.499998f, 73.59999f);
generalPath.lineTo(13.399998f, 73.59999f);
generalPath.closePath();
generalPath.moveTo(28.099998f, 90.1f);
generalPath.lineTo(28.099998f, 70.2f);
generalPath.lineTo(32.199997f, 70.2f);
generalPath.lineTo(32.199997f, 78.0f);
generalPath.lineTo(40.199997f, 78.0f);
generalPath.lineTo(40.199997f, 70.2f);
generalPath.lineTo(44.299995f, 70.2f);
generalPath.lineTo(44.299995f, 90.0f);
generalPath.lineTo(40.199997f, 90.0f);
generalPath.lineTo(40.199997f, 81.3f);
generalPath.lineTo(32.199997f, 81.3f);
generalPath.lineTo(32.199997f, 90.0f);
generalPath.lineTo(28.099997f, 90.0f);
generalPath.closePath();
generalPath.moveTo(48.3f, 90.1f);
generalPath.lineTo(48.3f, 70.2f);
generalPath.lineTo(54.8f, 70.2f);
generalPath.curveTo(57.3f, 70.2f, 58.899998f, 70.299995f, 59.6f, 70.5f);
generalPath.curveTo(60.8f, 70.8f, 61.699997f, 71.4f, 62.5f, 72.4f);
generalPath.curveTo(63.3f, 73.4f, 63.7f, 74.700005f, 63.7f, 76.3f);
generalPath.curveTo(63.7f, 77.5f, 63.5f, 78.5f, 63.0f, 79.4f);
generalPath.curveTo(62.5f, 80.3f, 62.0f, 80.9f, 61.3f, 81.4f);
generalPath.curveTo(60.6f, 81.9f, 59.899998f, 82.200005f, 59.2f, 82.3f);
generalPath.curveTo(58.2f, 82.5f, 56.8f, 82.600006f, 55.0f, 82.600006f);
generalPath.lineTo(52.4f, 82.600006f);
generalPath.lineTo(52.4f, 90.100006f);
generalPath.lineTo(48.300003f, 90.100006f);
generalPath.closePath();
generalPath.moveTo(52.399998f, 73.6f);
generalPath.lineTo(52.399998f, 79.2f);
generalPath.lineTo(54.6f, 79.2f);
generalPath.curveTo(56.199997f, 79.2f, 57.3f, 79.1f, 57.8f, 78.899994f);
generalPath.curveTo(58.3f, 78.7f, 58.8f, 78.399994f, 59.1f, 77.899994f);
generalPath.curveTo(59.399998f, 77.49999f, 59.6f, 76.899994f, 59.6f, 76.399994f);
generalPath.curveTo(59.6f, 75.7f, 59.399998f, 75.09999f, 59.0f, 74.59999f);
generalPath.curveTo(58.6f, 74.09999f, 58.0f, 73.79999f, 57.4f, 73.69999f);
generalPath.curveTo(56.9f, 73.59999f, 55.9f, 73.59999f, 54.5f, 73.59999f);
generalPath.lineTo(52.4f, 73.59999f);
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
generalPath.moveTo(34.1f, 50.9f);
generalPath.curveTo(36.1f, 51.600002f, 39.399998f, 51.5f, 41.8f, 51.2f);
generalPath.curveTo(42.2f, 52.2f, 41.6f, 53.4f, 42.0f, 54.5f);
generalPath.curveTo(42.2f, 55.0f, 42.9f, 55.5f, 43.9f, 56.0f);
generalPath.curveTo(44.100002f, 56.1f, 44.4f, 56.1f, 44.600002f, 56.2f);
generalPath.lineTo(44.800003f, 56.4f);
generalPath.curveTo(45.200005f, 56.7f, 46.100002f, 57.2f, 46.300003f, 57.300003f);
generalPath.curveTo(46.600002f, 57.4f, 46.9f, 57.4f, 47.200005f, 57.4f);
generalPath.lineTo(48.300003f, 57.4f);
generalPath.curveTo(49.800003f, 57.300003f, 51.300003f, 56.9f, 51.700005f, 56.300003f);
generalPath.curveTo(52.400005f, 55.300003f, 52.000004f, 53.200005f, 51.900005f, 51.4f);
generalPath.curveTo(51.800007f, 49.800003f, 51.600006f, 47.7f, 51.900005f, 46.5f);
generalPath.curveTo(52.000004f, 46.1f, 52.400005f, 45.6f, 52.600006f, 45.1f);
generalPath.curveTo(53.500008f, 43.3f, 54.300007f, 40.3f, 54.000008f, 37.5f);
generalPath.curveTo(53.800007f, 36.2f, 53.20001f, 35.1f, 53.000008f, 34.1f);
generalPath.curveTo(55.000008f, 34.3f, 56.90001f, 33.899998f, 58.70001f, 34.1f);
generalPath.curveTo(59.800007f, 34.199997f, 60.60001f, 34.899998f, 61.60001f, 34.8f);
generalPath.curveTo(61.80001f, 34.3f, 62.40001f, 34.0f, 62.50001f, 33.3f);
generalPath.curveTo(62.60001f, 32.6f, 62.30001f, 31.699999f, 62.00001f, 31.199999f);
generalPath.curveTo(60.60001f, 30.999998f, 59.50001f, 32.3f, 58.200012f, 32.399998f);
generalPath.curveTo(57.80001f, 32.399998f, 57.200012f, 32.3f, 56.700012f, 32.199997f);
generalPath.curveTo(55.100014f, 32.1f, 52.900013f, 32.499996f, 51.50001f, 32.199997f);
generalPath.curveTo(50.50001f, 31.999996f, 49.700012f, 30.899998f, 48.700012f, 30.499996f);
generalPath.curveTo(48.50001f, 30.399996f, 48.100014f, 30.499996f, 47.80001f, 30.299995f);
generalPath.curveTo(47.50001f, 30.199995f, 47.30001f, 29.999996f, 47.10001f, 29.999996f);
generalPath.curveTo(46.00001f, 29.599997f, 44.90001f, 29.199997f, 43.80001f, 28.999996f);
generalPath.curveTo(41.80001f, 28.499996f, 39.00001f, 28.499996f, 36.40001f, 28.699997f);
generalPath.curveTo(35.60001f, 28.799997f, 34.80001f, 29.199997f, 34.000008f, 28.999996f);
generalPath.curveTo(33.40001f, 28.899996f, 33.300007f, 28.499996f, 32.800007f, 28.299995f);
generalPath.curveTo(31.000008f, 27.499996f, 29.200006f, 28.399996f, 28.000008f, 28.999996f);
generalPath.curveTo(27.100008f, 29.399996f, 26.100008f, 30.099997f, 25.200008f, 30.199997f);
generalPath.curveTo(24.300009f, 30.399998f, 23.100008f, 30.199997f, 22.300009f, 30.199997f);
generalPath.curveTo(21.300009f, 30.199997f, 20.100008f, 30.399998f, 19.00001f, 30.499996f);
generalPath.curveTo(18.00001f, 30.699997f, 16.70001f, 30.799995f, 16.10001f, 31.199997f);
generalPath.curveTo(14.60001f, 32.1f, 14.20001f, 35.999996f, 13.70001f, 38.199997f);
generalPath.curveTo(13.5000105f, 39.1f, 13.20001f, 39.899998f, 13.0000105f, 40.799995f);
generalPath.curveTo(12.70001f, 42.699997f, 12.5000105f, 44.699997f, 12.5000105f, 46.499996f);
generalPath.curveTo(12.40001f, 50.199997f, 12.0000105f, 55.399994f, 13.90001f, 56.699997f);
generalPath.curveTo(14.30001f, 56.999996f, 15.70001f, 57.399998f, 16.10001f, 57.199997f);
generalPath.curveTo(16.20001f, 57.199997f, 16.70001f, 56.699997f, 16.80001f, 56.499996f);
generalPath.curveTo(16.900011f, 56.199997f, 16.60001f, 55.799995f, 16.60001f, 55.299995f);
generalPath.curveTo(16.60001f, 54.499996f, 16.40001f, 53.399994f, 16.40001f, 52.499996f);
generalPath.curveTo(16.40001f, 50.299995f, 16.800009f, 47.799995f, 17.40001f, 46.899998f);
generalPath.curveTo(17.40001f, 46.8f, 17.700008f, 46.8f, 17.700008f, 46.699997f);
generalPath.curveTo(17.800009f, 46.499996f, 17.700008f, 46.299995f, 17.90001f, 46.199997f);
generalPath.curveTo(18.300009f, 45.799995f, 19.00001f, 45.299995f, 19.40001f, 45.199997f);
generalPath.curveTo(20.700008f, 44.699997f, 21.40001f, 45.299995f, 22.00001f, 46.1f);
generalPath.curveTo(23.10001f, 47.5f, 23.300009f, 49.8f, 23.40001f, 52.0f);
generalPath.lineTo(23.40001f, 53.4f);
generalPath.curveTo(23.40001f, 53.9f, 23.200008f, 54.5f, 23.200008f, 54.800003f);
generalPath.curveTo(23.500008f, 55.700005f, 25.000008f, 56.100002f, 25.600008f, 56.500004f);
generalPath.curveTo(25.600008f, 56.800003f, 25.700008f, 57.200005f, 25.900007f, 57.500004f);
generalPath.curveTo(26.200006f, 58.000004f, 26.700006f, 58.400005f, 27.100008f, 58.600002f);
generalPath.curveTo(28.700008f, 59.500004f, 32.70001f, 58.9f, 33.500008f, 57.9f);
generalPath.curveTo(33.600006f, 57.800003f, 33.70001f, 57.7f, 33.70001f, 57.5f);
generalPath.curveTo(33.800007f, 57.2f, 34.000008f, 56.9f, 34.000008f, 56.7f);
generalPath.curveTo(34.500008f, 54.5f, 33.800007f, 52.9f, 34.100006f, 50.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.46200180053711, 43.229000091552734), new Point2D.Double(37.46200180053711, 74.26499938964844), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
	private ext_php() {
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
       ext_php base = new ext_php();
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
       ext_php base = new ext_php();
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
        return ext_php::new;
    }
}

