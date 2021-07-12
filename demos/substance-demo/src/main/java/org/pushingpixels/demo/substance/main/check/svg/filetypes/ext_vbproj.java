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
public class ext_vbproj implements NeonIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
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
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.265000104904175), new Point2D.Double(36.0, 100.25), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
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
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
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
generalPath.moveTo(8.8f, 89.8f);
generalPath.lineTo(4.9f, 79.1f);
generalPath.lineTo(7.3f, 79.1f);
generalPath.lineTo(10.0f, 87.0f);
generalPath.lineTo(12.7f, 79.1f);
generalPath.lineTo(15.0f, 79.1f);
generalPath.lineTo(11.1f, 89.799995f);
generalPath.lineTo(8.8f, 89.799995f);
generalPath.closePath();
generalPath.moveTo(16.1f, 79.100006f);
generalPath.lineTo(20.400002f, 79.100006f);
generalPath.curveTo(21.300001f, 79.100006f, 21.900002f, 79.100006f, 22.300001f, 79.200005f);
generalPath.curveTo(22.7f, 79.3f, 23.1f, 79.4f, 23.400002f, 79.600006f);
generalPath.curveTo(23.700003f, 79.80001f, 24.000002f, 80.100006f, 24.2f, 80.50001f);
generalPath.curveTo(24.400002f, 80.90001f, 24.5f, 81.30001f, 24.5f, 81.80001f);
generalPath.curveTo(24.5f, 82.30001f, 24.4f, 82.80001f, 24.1f, 83.20001f);
generalPath.curveTo(23.800001f, 83.60001f, 23.5f, 83.90001f, 23.0f, 84.10001f);
generalPath.curveTo(23.7f, 84.30001f, 24.2f, 84.60001f, 24.5f, 85.10001f);
generalPath.curveTo(24.9f, 85.60001f, 25.0f, 86.10001f, 25.0f, 86.70001f);
generalPath.curveTo(25.0f, 87.20001f, 24.9f, 87.70001f, 24.7f, 88.10001f);
generalPath.curveTo(24.5f, 88.60001f, 24.2f, 88.90002f, 23.800001f, 89.20001f);
generalPath.curveTo(23.400002f, 89.500015f, 22.900002f, 89.60001f, 22.300001f, 89.70001f);
generalPath.curveTo(21.900002f, 89.70001f, 21.1f, 89.80001f, 19.7f, 89.80001f);
generalPath.lineTo(16.0f, 89.80001f);
generalPath.lineTo(16.0f, 79.1f);
generalPath.closePath();
generalPath.moveTo(18.300001f, 80.90001f);
generalPath.lineTo(18.300001f, 83.40001f);
generalPath.lineTo(21.300001f, 83.40001f);
generalPath.curveTo(21.7f, 83.40001f, 22.000002f, 83.20001f, 22.2f, 83.00001f);
generalPath.curveTo(22.400002f, 82.80001f, 22.5f, 82.50001f, 22.5f, 82.200005f);
generalPath.curveTo(22.5f, 81.9f, 22.4f, 81.600006f, 22.2f, 81.4f);
generalPath.curveTo(22.0f, 81.200005f, 21.7f, 81.1f, 21.400002f, 81.0f);
generalPath.lineTo(18.300001f, 81.0f);
generalPath.closePath();
generalPath.moveTo(18.300001f, 85.100006f);
generalPath.lineTo(18.300001f, 88.0f);
generalPath.lineTo(20.300001f, 88.0f);
generalPath.curveTo(21.1f, 88.0f, 21.6f, 88.0f, 21.800001f, 87.9f);
generalPath.curveTo(22.1f, 87.8f, 22.400002f, 87.700005f, 22.6f, 87.5f);
generalPath.curveTo(22.800001f, 87.3f, 22.9f, 87.0f, 22.9f, 86.6f);
generalPath.curveTo(22.9f, 86.299995f, 22.8f, 86.0f, 22.699999f, 85.799995f);
generalPath.curveTo(22.499998f, 85.6f, 22.3f, 85.399994f, 21.999998f, 85.299995f);
generalPath.curveTo(21.699999f, 85.2f, 21.099998f, 85.1f, 20.099998f, 85.1f);
generalPath.lineTo(18.3f, 85.1f);
generalPath.closePath();
generalPath.moveTo(27.100002f, 89.8f);
generalPath.lineTo(27.100002f, 79.1f);
generalPath.lineTo(30.600002f, 79.1f);
generalPath.curveTo(31.900002f, 79.1f, 32.800003f, 79.2f, 33.2f, 79.299995f);
generalPath.curveTo(33.8f, 79.49999f, 34.3f, 79.799995f, 34.8f, 80.399994f);
generalPath.curveTo(35.2f, 80.899994f, 35.399998f, 81.59999f, 35.399998f, 82.49999f);
generalPath.curveTo(35.399998f, 83.19999f, 35.3f, 83.69999f, 34.999996f, 84.19999f);
generalPath.curveTo(34.799995f, 84.59999f, 34.499996f, 84.99999f, 34.099995f, 85.29999f);
generalPath.curveTo(33.699993f, 85.59999f, 33.299995f, 85.69999f, 32.999996f, 85.79999f);
generalPath.curveTo(32.499996f, 85.89999f, 31.699997f, 85.999985f, 30.699997f, 85.999985f);
generalPath.lineTo(29.299997f, 85.999985f);
generalPath.lineTo(29.299997f, 90.09998f);
generalPath.lineTo(27.099997f, 90.09998f);
generalPath.closePath();
generalPath.moveTo(29.300003f, 80.9f);
generalPath.lineTo(29.300003f, 83.9f);
generalPath.lineTo(30.500004f, 83.9f);
generalPath.curveTo(31.400003f, 83.9f, 31.900003f, 83.8f, 32.200005f, 83.700005f);
generalPath.curveTo(32.500004f, 83.600006f, 32.700005f, 83.4f, 32.900005f, 83.200005f);
generalPath.curveTo(33.100006f, 83.00001f, 33.100006f, 82.700005f, 33.100006f, 82.4f);
generalPath.curveTo(33.100006f, 82.0f, 33.000008f, 81.700005f, 32.800007f, 81.4f);
generalPath.curveTo(32.600006f, 81.1f, 32.300007f, 81.0f, 31.900007f, 81.0f);
generalPath.curveTo(31.600008f, 81.0f, 31.100008f, 80.9f, 30.300007f, 80.9f);
generalPath.lineTo(29.300007f, 80.9f);
generalPath.closePath();
generalPath.moveTo(37.200005f, 89.8f);
generalPath.lineTo(37.200005f, 79.1f);
generalPath.lineTo(41.800003f, 79.1f);
generalPath.curveTo(43.000004f, 79.1f, 43.800003f, 79.2f, 44.300003f, 79.4f);
generalPath.curveTo(44.800003f, 79.6f, 45.200005f, 79.9f, 45.600002f, 80.4f);
generalPath.curveTo(45.9f, 80.9f, 46.100002f, 81.5f, 46.100002f, 82.1f);
generalPath.curveTo(46.100002f, 82.9f, 45.9f, 83.6f, 45.4f, 84.1f);
generalPath.curveTo(44.9f, 84.6f, 44.2f, 85.0f, 43.300003f, 85.1f);
generalPath.curveTo(43.800003f, 85.4f, 44.200005f, 85.7f, 44.500004f, 86.0f);
generalPath.curveTo(44.800003f, 86.3f, 45.200005f, 86.9f, 45.700005f, 87.7f);
generalPath.lineTo(47.000004f, 89.799995f);
generalPath.lineTo(44.400005f, 89.799995f);
generalPath.lineTo(42.800007f, 87.49999f);
generalPath.curveTo(42.20001f, 86.69999f, 41.900005f, 86.09999f, 41.600006f, 85.899994f);
generalPath.curveTo(41.400005f, 85.7f, 41.200005f, 85.49999f, 40.900005f, 85.49999f);
generalPath.curveTo(40.700005f, 85.399994f, 40.300007f, 85.399994f, 39.800007f, 85.399994f);
generalPath.lineTo(39.400005f, 85.399994f);
generalPath.lineTo(39.400005f, 89.899994f);
generalPath.lineTo(37.200005f, 89.899994f);
generalPath.closePath();
generalPath.moveTo(39.400005f, 83.600006f);
generalPath.lineTo(41.0f, 83.600006f);
generalPath.curveTo(42.1f, 83.600006f, 42.7f, 83.600006f, 43.0f, 83.50001f);
generalPath.curveTo(43.3f, 83.40001f, 43.5f, 83.30001f, 43.6f, 83.00001f);
generalPath.curveTo(43.699997f, 82.80001f, 43.8f, 82.50001f, 43.8f, 82.200005f);
generalPath.curveTo(43.8f, 81.8f, 43.7f, 81.50001f, 43.5f, 81.3f);
generalPath.curveTo(43.3f, 81.100006f, 43.0f, 80.9f, 42.7f, 80.9f);
generalPath.lineTo(39.4f, 80.9f);
generalPath.lineTo(39.4f, 83.6f);
generalPath.closePath();
generalPath.moveTo(47.700005f, 84.50001f);
generalPath.curveTo(47.700005f, 83.40001f, 47.900005f, 82.50001f, 48.200005f, 81.700005f);
generalPath.curveTo(48.400005f, 81.200005f, 48.800003f, 80.700005f, 49.200005f, 80.200005f);
generalPath.curveTo(49.600006f, 79.8f, 50.100006f, 79.4f, 50.600006f, 79.200005f);
generalPath.curveTo(51.300007f, 78.9f, 52.100006f, 78.8f, 52.900005f, 78.8f);
generalPath.curveTo(54.500004f, 78.8f, 55.800007f, 79.3f, 56.700005f, 80.3f);
generalPath.curveTo(57.700005f, 81.3f, 58.100006f, 82.600006f, 58.100006f, 84.4f);
generalPath.curveTo(58.100006f, 86.1f, 57.600006f, 87.5f, 56.700005f, 88.5f);
generalPath.curveTo(55.700005f, 89.5f, 54.500004f, 90.0f, 52.900005f, 90.0f);
generalPath.curveTo(51.300007f, 90.0f, 50.000004f, 89.5f, 49.100006f, 88.5f);
generalPath.curveTo(48.200005f, 87.6f, 47.700005f, 86.2f, 47.700005f, 84.5f);
generalPath.closePath();
generalPath.moveTo(49.900005f, 84.40001f);
generalPath.curveTo(49.900005f, 85.600006f, 50.200005f, 86.50001f, 50.800007f, 87.20001f);
generalPath.curveTo(51.400005f, 87.80001f, 52.100006f, 88.10001f, 53.000008f, 88.10001f);
generalPath.curveTo(53.90001f, 88.10001f, 54.600006f, 87.80001f, 55.100006f, 87.20001f);
generalPath.curveTo(55.700005f, 86.60001f, 55.900005f, 85.60001f, 55.900005f, 84.40001f);
generalPath.curveTo(55.900005f, 83.20001f, 55.600006f, 82.30001f, 55.100006f, 81.600006f);
generalPath.curveTo(54.600006f, 81.00001f, 53.800007f, 80.700005f, 52.900005f, 80.700005f);
generalPath.curveTo(52.000004f, 80.700005f, 51.300007f, 81.00001f, 50.700005f, 81.600006f);
generalPath.curveTo(50.200005f, 82.3f, 49.900005f, 83.200005f, 49.900005f, 84.40001f);
generalPath.closePath();
generalPath.moveTo(63.800003f, 79.100006f);
generalPath.lineTo(66.0f, 79.100006f);
generalPath.lineTo(66.0f, 85.90001f);
generalPath.curveTo(66.0f, 86.80001f, 65.9f, 87.50001f, 65.8f, 88.00001f);
generalPath.curveTo(65.600006f, 88.600006f, 65.200005f, 89.100006f, 64.600006f, 89.50001f);
generalPath.curveTo(64.00001f, 89.90001f, 63.300007f, 90.100006f, 62.400005f, 90.100006f);
generalPath.curveTo(61.300007f, 90.100006f, 60.500004f, 89.8f, 59.900005f, 89.200005f);
generalPath.curveTo(59.300007f, 88.600006f, 59.000004f, 87.700005f, 59.000004f, 86.600006f);
generalPath.lineTo(61.100002f, 86.40001f);
generalPath.curveTo(61.100002f, 87.00001f, 61.2f, 87.50001f, 61.4f, 87.70001f);
generalPath.curveTo(61.600002f, 88.10001f, 62.0f, 88.30001f, 62.5f, 88.30001f);
generalPath.curveTo(63.0f, 88.30001f, 63.3f, 88.20001f, 63.5f, 87.90001f);
generalPath.curveTo(63.7f, 87.600006f, 63.8f, 87.100006f, 63.8f, 86.20001f);
generalPath.lineTo(63.8f, 79.10001f);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
generalPath.moveTo(28.2f, 44.6f);
generalPath.curveTo(26.800001f, 45.6f, 25.5f, 46.699997f, 24.2f, 47.699997f);
generalPath.curveTo(21.5f, 49.699997f, 18.900002f, 51.799995f, 16.2f, 53.799995f);
generalPath.curveTo(15.800001f, 54.099995f, 15.6f, 54.099995f, 15.200001f, 53.899994f);
generalPath.curveTo(14.700001f, 53.599995f, 14.1f, 53.299995f, 13.500001f, 52.999992f);
generalPath.curveTo(13.200001f, 52.79999f, 13.100001f, 52.59999f, 13.100001f, 52.29999f);
generalPath.lineTo(13.100001f, 31.1f);
generalPath.curveTo(13.100001f, 30.9f, 13.300001f, 30.5f, 13.500001f, 30.4f);
generalPath.curveTo(14.100001f, 30.0f, 14.800001f, 29.699999f, 15.400001f, 29.4f);
generalPath.curveTo(15.700001f, 29.199999f, 16.0f, 29.4f, 16.300001f, 29.6f);
generalPath.curveTo(18.500002f, 31.300001f, 20.7f, 33.0f, 22.900002f, 34.6f);
generalPath.curveTo(24.7f, 36.0f, 26.500002f, 37.399998f, 28.300001f, 38.699997f);
generalPath.curveTo(28.400002f, 38.6f, 28.6f, 38.499996f, 28.7f, 38.399998f);
generalPath.curveTo(35.3f, 31.999998f, 41.9f, 25.599998f, 48.4f, 19.199997f);
generalPath.curveTo(48.7f, 18.899998f, 49.0f, 18.799997f, 49.4f, 18.999996f);
generalPath.curveTo(52.2f, 20.099997f, 55.0f, 21.199997f, 57.800003f, 22.399996f);
generalPath.curveTo(58.000004f, 22.499996f, 58.200005f, 22.799995f, 58.300003f, 22.999996f);
generalPath.curveTo(58.4f, 23.099997f, 58.300003f, 23.299995f, 58.300003f, 23.499996f);
generalPath.lineTo(58.300003f, 60.0f);
generalPath.curveTo(58.300003f, 60.9f, 58.300003f, 60.9f, 57.4f, 61.2f);
generalPath.curveTo(54.7f, 62.3f, 52.100002f, 63.3f, 49.5f, 64.4f);
generalPath.curveTo(49.0f, 64.6f, 48.7f, 64.5f, 48.4f, 64.200005f);
generalPath.curveTo(41.9f, 57.800003f, 35.4f, 51.500004f, 28.800001f, 45.200005f);
generalPath.lineTo(28.2f, 44.600006f);
generalPath.closePath();
generalPath.moveTo(47.2f, 50.399998f);
generalPath.lineTo(47.2f, 33.0f);
generalPath.curveTo(43.3f, 35.9f, 39.5f, 38.8f, 35.6f, 41.7f);
generalPath.curveTo(39.5f, 44.600002f, 43.3f, 47.5f, 47.199997f, 50.4f);
generalPath.closePath();
generalPath.moveTo(22.900002f, 41.699997f);
generalPath.curveTo(21.000002f, 39.999996f, 19.100002f, 38.299995f, 17.100002f, 36.499996f);
generalPath.lineTo(17.100002f, 46.899994f);
generalPath.curveTo(19.000002f, 45.199993f, 20.900002f, 43.399994f, 22.900002f, 41.699993f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.61899948120117, 64.5), new Point2D.Double(35.61899948120117, 18.9060001373291), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 73.45700073242188), new Point2D.Double(58.569000244140625, 86.95700073242188), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
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
		return 0.9980000257492065;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_vbproj() {
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
       ext_vbproj base = new ext_vbproj();
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
       ext_vbproj base = new ext_vbproj();
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
        return ext_vbproj::new;
    }
}

