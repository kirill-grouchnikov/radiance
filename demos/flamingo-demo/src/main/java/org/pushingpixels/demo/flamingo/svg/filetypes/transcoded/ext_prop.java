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
public class ext_prop implements NeonIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(6.3f, 90.9f);
generalPath.lineTo(6.3f, 75.1f);
generalPath.lineTo(11.5f, 75.1f);
generalPath.curveTo(13.5f, 75.1f, 14.7f, 75.2f, 15.3f, 75.299995f);
generalPath.curveTo(16.2f, 75.49999f, 17.0f, 76.1f, 17.6f, 76.799995f);
generalPath.curveTo(18.2f, 77.6f, 18.5f, 78.6f, 18.5f, 79.899994f);
generalPath.curveTo(18.5f, 80.899994f, 18.3f, 81.7f, 18.0f, 82.299995f);
generalPath.curveTo(17.7f, 82.899994f, 17.2f, 83.49999f, 16.6f, 83.899994f);
generalPath.curveTo(16.1f, 84.299995f, 15.5f, 84.49999f, 14.900001f, 84.59999f);
generalPath.curveTo(14.1f, 84.79999f, 13.000001f, 84.79999f, 11.6f, 84.79999f);
generalPath.lineTo(9.5f, 84.79999f);
generalPath.lineTo(9.5f, 90.69999f);
generalPath.lineTo(6.3f, 90.69999f);
generalPath.lineTo(6.3f, 90.89999f);
generalPath.closePath();
generalPath.moveTo(9.5f, 77.8f);
generalPath.lineTo(9.5f, 82.3f);
generalPath.lineTo(11.3f, 82.3f);
generalPath.curveTo(12.6f, 82.3f, 13.4f, 82.200005f, 13.8f, 82.100006f);
generalPath.curveTo(14.200001f, 82.00001f, 14.6f, 81.700005f, 14.8f, 81.3f);
generalPath.curveTo(15.0f, 80.9f, 15.2f, 80.5f, 15.2f, 80.100006f);
generalPath.curveTo(15.2f, 79.50001f, 15.0f, 79.100006f, 14.7f, 78.700005f);
generalPath.curveTo(14.4f, 78.3f, 13.9f, 78.100006f, 13.4f, 78.00001f);
generalPath.curveTo(13.0f, 77.90001f, 12.2f, 77.90001f, 11.099999f, 77.90001f);
generalPath.lineTo(9.5f, 77.90001f);
generalPath.lineTo(9.5f, 77.80001f);
generalPath.closePath();
generalPath.moveTo(21.2f, 90.9f);
generalPath.lineTo(21.2f, 75.1f);
generalPath.lineTo(28.0f, 75.1f);
generalPath.curveTo(29.7f, 75.1f, 30.9f, 75.2f, 31.7f, 75.5f);
generalPath.curveTo(32.5f, 75.8f, 33.100002f, 76.3f, 33.600002f, 77.0f);
generalPath.curveTo(34.100002f, 77.7f, 34.300003f, 78.6f, 34.300003f, 79.5f);
generalPath.curveTo(34.300003f, 80.7f, 33.9f, 81.7f, 33.200005f, 82.4f);
generalPath.curveTo(32.500004f, 83.200005f, 31.400005f, 83.700005f, 30.100004f, 83.9f);
generalPath.curveTo(30.800005f, 84.3f, 31.400003f, 84.700005f, 31.800005f, 85.200005f);
generalPath.curveTo(32.200005f, 85.700005f, 32.900005f, 86.50001f, 33.600006f, 87.8f);
generalPath.lineTo(35.500008f, 90.9f);
generalPath.lineTo(31.700008f, 90.9f);
generalPath.lineTo(29.40001f, 87.5f);
generalPath.curveTo(28.60001f, 86.3f, 28.00001f, 85.5f, 27.700008f, 85.2f);
generalPath.curveTo(27.40001f, 84.899994f, 27.100008f, 84.7f, 26.700008f, 84.5f);
generalPath.curveTo(26.40001f, 84.4f, 25.800009f, 84.3f, 25.100008f, 84.3f);
generalPath.lineTo(24.400007f, 84.3f);
generalPath.lineTo(24.400007f, 90.9f);
generalPath.lineTo(21.200006f, 90.9f);
generalPath.closePath();
generalPath.moveTo(24.400002f, 81.8f);
generalPath.lineTo(26.800001f, 81.8f);
generalPath.curveTo(28.300001f, 81.8f, 29.300001f, 81.700005f, 29.7f, 81.600006f);
generalPath.curveTo(30.1f, 81.50001f, 30.400002f, 81.200005f, 30.6f, 80.90001f);
generalPath.curveTo(30.800001f, 80.600006f, 30.9f, 80.20001f, 30.9f, 79.70001f);
generalPath.curveTo(30.9f, 79.20001f, 30.8f, 78.70001f, 30.5f, 78.40001f);
generalPath.curveTo(30.2f, 78.100006f, 29.8f, 77.90001f, 29.3f, 77.80001f);
generalPath.curveTo(29.0f, 77.80001f, 28.3f, 77.70001f, 27.0f, 77.70001f);
generalPath.lineTo(24.5f, 77.70001f);
generalPath.lineTo(24.4f, 81.80001f);
generalPath.closePath();
generalPath.moveTo(36.5f, 83.100006f);
generalPath.curveTo(36.5f, 81.50001f, 36.7f, 80.100006f, 37.2f, 79.100006f);
generalPath.curveTo(37.600002f, 78.3f, 38.100002f, 77.600006f, 38.7f, 76.90001f);
generalPath.curveTo(39.3f, 76.30001f, 40.0f, 75.80001f, 40.8f, 75.50001f);
generalPath.curveTo(41.8f, 75.100006f, 42.899998f, 74.90001f, 44.2f, 74.90001f);
generalPath.curveTo(46.5f, 74.90001f, 48.4f, 75.600006f, 49.8f, 77.100006f);
generalPath.curveTo(51.2f, 78.50001f, 51.899998f, 80.50001f, 51.899998f, 83.100006f);
generalPath.curveTo(51.899998f, 85.600006f, 51.199997f, 87.600006f, 49.8f, 89.100006f);
generalPath.curveTo(48.399998f, 90.50001f, 46.5f, 91.3f, 44.2f, 91.3f);
generalPath.curveTo(41.8f, 91.3f, 40.0f, 90.600006f, 38.600002f, 89.200005f);
generalPath.curveTo(37.2f, 87.600006f, 36.500004f, 85.600006f, 36.500004f, 83.100006f);
generalPath.closePath();
generalPath.moveTo(39.9f, 83.00001f);
generalPath.curveTo(39.9f, 84.80001f, 40.300003f, 86.100006f, 41.100002f, 87.100006f);
generalPath.curveTo(41.9f, 88.00001f, 43.000004f, 88.50001f, 44.300003f, 88.50001f);
generalPath.curveTo(45.600002f, 88.50001f, 46.600002f, 88.00001f, 47.500004f, 87.100006f);
generalPath.curveTo(48.300003f, 86.200005f, 48.700005f, 84.8f, 48.700005f, 83.00001f);
generalPath.curveTo(48.700005f, 81.200005f, 48.300003f, 79.80001f, 47.500004f, 79.00001f);
generalPath.curveTo(46.700005f, 78.200005f, 45.600002f, 77.700005f, 44.300003f, 77.700005f);
generalPath.curveTo(43.000004f, 77.700005f, 41.9f, 78.100006f, 41.100002f, 79.00001f);
generalPath.curveTo(40.300003f, 79.80001f, 39.9f, 81.200005f, 39.9f, 83.00001f);
generalPath.closePath();
generalPath.moveTo(54.5f, 90.90001f);
generalPath.lineTo(54.5f, 75.1f);
generalPath.lineTo(59.7f, 75.1f);
generalPath.curveTo(61.7f, 75.1f, 62.9f, 75.2f, 63.5f, 75.299995f);
generalPath.curveTo(64.4f, 75.49999f, 65.2f, 76.1f, 65.8f, 76.799995f);
generalPath.curveTo(66.4f, 77.6f, 66.700005f, 78.6f, 66.700005f, 79.899994f);
generalPath.curveTo(66.700005f, 80.899994f, 66.50001f, 81.7f, 66.200005f, 82.299995f);
generalPath.curveTo(65.9f, 82.899994f, 65.4f, 83.49999f, 64.8f, 83.899994f);
generalPath.curveTo(64.3f, 84.299995f, 63.700005f, 84.49999f, 63.100002f, 84.59999f);
generalPath.curveTo(62.300003f, 84.79999f, 61.2f, 84.79999f, 59.800003f, 84.79999f);
generalPath.lineTo(57.700005f, 84.79999f);
generalPath.lineTo(57.700005f, 90.69999f);
generalPath.lineTo(54.500004f, 90.69999f);
generalPath.lineTo(54.500004f, 90.89999f);
generalPath.closePath();
generalPath.moveTo(57.7f, 77.80001f);
generalPath.lineTo(57.7f, 82.30001f);
generalPath.lineTo(59.5f, 82.30001f);
generalPath.curveTo(60.8f, 82.30001f, 61.6f, 82.20001f, 62.0f, 82.10001f);
generalPath.curveTo(62.4f, 81.90002f, 62.8f, 81.70001f, 63.0f, 81.30001f);
generalPath.curveTo(63.2f, 80.90001f, 63.4f, 80.50001f, 63.4f, 80.10001f);
generalPath.curveTo(63.4f, 79.500015f, 63.2f, 79.10001f, 62.9f, 78.70001f);
generalPath.curveTo(62.600002f, 78.30001f, 62.100002f, 78.10001f, 61.600002f, 78.000015f);
generalPath.curveTo(61.2f, 77.90002f, 60.4f, 77.90002f, 59.300003f, 77.90002f);
generalPath.lineTo(57.700005f, 77.90002f);
generalPath.lineTo(57.700005f, 77.80002f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.4f, 52.7f);
generalPath.curveTo(23.4f, 53.9f, 24.199999f, 54.8f, 25.5f, 54.8f);
generalPath.lineTo(27.6f, 54.8f);
generalPath.lineTo(27.6f, 62.0f);
generalPath.curveTo(27.6f, 63.6f, 29.0f, 65.1f, 30.7f, 65.1f);
generalPath.curveTo(32.3f, 65.1f, 33.8f, 63.699997f, 33.8f, 62.0f);
generalPath.lineTo(33.8f, 54.8f);
generalPath.lineTo(37.899998f, 54.8f);
generalPath.lineTo(37.899998f, 62.0f);
generalPath.curveTo(37.899998f, 63.6f, 39.3f, 65.1f, 40.999996f, 65.1f);
generalPath.curveTo(42.699993f, 65.1f, 44.099995f, 63.699997f, 44.099995f, 62.0f);
generalPath.lineTo(44.099995f, 54.8f);
generalPath.lineTo(46.0f, 54.8f);
generalPath.curveTo(47.2f, 54.8f, 48.1f, 54.0f, 48.1f, 52.7f);
generalPath.lineTo(48.1f, 32.1f);
generalPath.lineTo(23.4f, 32.1f);
generalPath.lineTo(23.4f, 52.699997f);
generalPath.closePath();
generalPath.moveTo(18.3f, 32.1f);
generalPath.curveTo(16.699999f, 32.1f, 15.199999f, 33.5f, 15.199999f, 35.199997f);
generalPath.lineTo(15.199999f, 49.6f);
generalPath.curveTo(15.199999f, 51.199997f, 16.599998f, 52.699997f, 18.3f, 52.699997f);
generalPath.curveTo(19.9f, 52.699997f, 21.4f, 51.299995f, 21.4f, 49.6f);
generalPath.lineTo(21.4f, 35.2f);
generalPath.curveTo(21.4f, 33.5f, 19.9f, 32.100002f, 18.3f, 32.100002f);
generalPath.closePath();
generalPath.moveTo(53.2f, 32.1f);
generalPath.curveTo(51.600002f, 32.1f, 50.100002f, 33.5f, 50.100002f, 35.199997f);
generalPath.lineTo(50.100002f, 49.6f);
generalPath.curveTo(50.100002f, 51.199997f, 51.500004f, 52.699997f, 53.2f, 52.699997f);
generalPath.curveTo(54.899998f, 52.699997f, 56.3f, 51.299995f, 56.3f, 49.6f);
generalPath.lineTo(56.3f, 35.2f);
generalPath.curveTo(56.3f, 33.5f, 54.899998f, 32.100002f, 53.2f, 32.100002f);
generalPath.closePath();
generalPath.moveTo(42.9f, 20.2f);
generalPath.lineTo(45.600002f, 17.5f);
generalPath.curveTo(46.000004f, 17.1f, 46.000004f, 16.5f, 45.600002f, 16.1f);
generalPath.curveTo(45.2f, 15.700001f, 44.600002f, 15.700001f, 44.2f, 16.1f);
generalPath.lineTo(41.100002f, 19.2f);
generalPath.curveTo(39.7f, 18.2f, 37.800003f, 17.800001f, 35.800003f, 17.800001f);
generalPath.curveTo(33.800003f, 17.800001f, 31.900003f, 18.2f, 30.200003f, 19.000002f);
generalPath.lineTo(27.300003f, 15.900002f);
generalPath.curveTo(26.900003f, 15.700002f, 26.100002f, 15.700002f, 25.700003f, 15.900002f);
generalPath.curveTo(25.500002f, 16.300001f, 25.500002f, 17.100002f, 25.700003f, 17.500002f);
generalPath.lineTo(28.400003f, 20.200003f);
generalPath.curveTo(25.500004f, 22.500002f, 23.500004f, 26.000004f, 23.500004f, 30.100002f);
generalPath.lineTo(48.200005f, 30.100002f);
generalPath.curveTo(48.100006f, 25.900002f, 46.000004f, 22.200003f, 42.900005f, 20.200003f);
generalPath.closePath();
generalPath.moveTo(31.600002f, 25.900002f);
generalPath.lineTo(29.500002f, 25.900002f);
generalPath.lineTo(29.500002f, 23.800001f);
generalPath.lineTo(31.600002f, 23.800001f);
generalPath.lineTo(31.600002f, 25.900002f);
generalPath.closePath();
generalPath.moveTo(41.9f, 25.900002f);
generalPath.lineTo(39.800003f, 25.900002f);
generalPath.lineTo(39.800003f, 23.800001f);
generalPath.lineTo(41.9f, 23.800001f);
generalPath.lineTo(41.9f, 25.900002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 34.900001525878906), new Point2D.Double(35.75, 84.25), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
paint = new LinearGradientPaint(new Point2D.Double(45.0359992980957, 25.81399917602539), new Point2D.Double(58.5359992980957, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
	private ext_prop() {
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
       ext_prop base = new ext_prop();
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
       ext_prop base = new ext_prop();
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
        return ext_prop::new;
    }
}

