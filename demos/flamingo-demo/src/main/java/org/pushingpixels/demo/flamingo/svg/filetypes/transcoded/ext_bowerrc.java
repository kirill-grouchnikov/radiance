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
public class ext_bowerrc implements NeonIcon {
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.200000047683716), new Point2D.Double(36.0, 100.19999694824219), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 73.42500305175781), new Point2D.Double(58.57500076293945, 86.92500305175781), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(59.8f, 53.1f);
generalPath.curveTo(59.3f, 52.899998f, 58.7f, 52.6f, 58.2f, 52.5f);
generalPath.curveTo(55.0f, 51.8f, 51.9f, 51.1f, 48.7f, 50.5f);
generalPath.curveTo(46.4f, 50.1f, 44.0f, 49.8f, 41.7f, 49.5f);
generalPath.curveTo(41.9f, 47.9f, 42.2f, 47.7f, 43.9f, 47.4f);
generalPath.curveTo(44.800003f, 48.9f, 44.800003f, 48.9f, 46.600002f, 48.7f);
generalPath.curveTo(50.4f, 48.3f, 52.800003f, 46.100002f, 53.500004f, 42.2f);
generalPath.curveTo(54.000004f, 39.3f, 54.600002f, 36.5f, 56.800003f, 34.4f);
generalPath.lineTo(56.800003f, 34.2f);
generalPath.curveTo(52.800003f, 33.0f, 47.600002f, 35.7f, 44.4f, 40.9f);
generalPath.curveTo(42.9f, 40.7f, 42.0f, 40.2f, 41.300003f, 38.7f);
generalPath.curveTo(39.600002f, 34.600002f, 36.300003f, 32.100002f, 31.700003f, 31.900002f);
generalPath.curveTo(23.400002f, 31.600002f, 15.9000025f, 36.4f, 12.600002f, 44.100002f);
generalPath.curveTo(9.4000025f, 51.7f, 10.4000025f, 59.100002f, 14.100002f, 66.3f);
generalPath.curveTo(15.600002f, 69.200005f, 17.500002f, 71.8f, 20.300003f, 73.600006f);
generalPath.curveTo(22.700003f, 75.100006f, 24.900003f, 74.700005f, 26.500004f, 72.3f);
generalPath.lineTo(26.800003f, 72.0f);
generalPath.lineTo(27.500004f, 73.9f);
generalPath.curveTo(27.700005f, 74.5f, 28.000004f, 75.200005f, 28.200005f, 75.8f);
generalPath.curveTo(28.800005f, 77.100006f, 30.200005f, 77.700005f, 31.500004f, 77.200005f);
generalPath.curveTo(31.800003f, 77.100006f, 32.300003f, 77.100006f, 32.600002f, 77.200005f);
generalPath.curveTo(34.000004f, 77.700005f, 35.4f, 77.700005f, 36.500004f, 76.50001f);
generalPath.curveTo(36.700005f, 76.30001f, 37.100002f, 76.30001f, 37.400005f, 76.30001f);
generalPath.curveTo(39.400005f, 76.40001f, 40.500004f, 75.70001f, 41.300007f, 73.90001f);
generalPath.curveTo(41.400005f, 73.70001f, 41.500008f, 73.600006f, 41.600006f, 73.50001f);
generalPath.curveTo(42.900005f, 72.50001f, 43.200005f, 71.40001f, 42.600006f, 69.80001f);
generalPath.curveTo(42.200005f, 68.90001f, 41.700005f, 68.00001f, 41.200005f, 67.10001f);
generalPath.curveTo(40.900005f, 66.500015f, 40.500004f, 65.80001f, 40.000004f, 65.000015f);
generalPath.curveTo(42.200005f, 65.70001f, 44.100002f, 66.500015f, 45.900005f, 64.80002f);
generalPath.curveTo(46.300007f, 65.000015f, 46.600006f, 65.20002f, 46.900005f, 65.30002f);
generalPath.curveTo(48.700005f, 66.10002f, 51.100006f, 65.80002f, 52.200005f, 64.60002f);
generalPath.curveTo(52.600006f, 64.10002f, 53.000004f, 64.10002f, 53.600006f, 64.10002f);
generalPath.curveTo(55.900005f, 64.30002f, 58.500008f, 63.60002f, 58.900005f, 60.90002f);
generalPath.curveTo(61.300007f, 60.40002f, 62.400005f, 59.40002f, 62.600006f, 57.300022f);
generalPath.curveTo(62.900005f, 55.300022f, 62.000008f, 54.000023f, 59.800007f, 53.10002f);
generalPath.closePath();
generalPath.moveTo(45.8f, 47.399998f);
generalPath.curveTo(45.6f, 47.399998f, 45.2f, 46.999996f, 45.1f, 46.699997f);
generalPath.curveTo(44.899998f, 46.299995f, 44.899998f, 45.799995f, 44.699997f, 44.999996f);
generalPath.lineTo(46.6f, 45.699997f);
generalPath.curveTo(47.5f, 45.1f, 48.3f, 45.999996f, 49.6f, 46.199997f);
generalPath.curveTo(48.3f, 47.1f, 47.1f, 47.399998f, 45.8f, 47.399998f);
generalPath.closePath();
generalPath.moveTo(53.9f, 35.5f);
generalPath.curveTo(53.0f, 38.7f, 52.0f, 41.9f, 51.0f, 45.3f);
generalPath.curveTo(49.8f, 44.3f, 49.0f, 43.6f, 47.9f, 42.7f);
generalPath.lineTo(51.4f, 37.3f);
generalPath.curveTo(49.5f, 38.5f, 48.300003f, 40.3f, 47.300003f, 42.3f);
generalPath.lineTo(45.700005f, 41.399998f);
generalPath.curveTo(46.900005f, 38.399998f, 50.900005f, 35.6f, 53.900005f, 35.499996f);
generalPath.closePath();
generalPath.moveTo(40.7f, 41.5f);
generalPath.curveTo(43.3f, 41.6f, 45.600002f, 42.8f, 47.7f, 44.4f);
generalPath.curveTo(47.8f, 44.5f, 47.9f, 44.800003f, 48.0f, 45.2f);
generalPath.curveTo(45.6f, 44.4f, 43.6f, 44.7f, 41.5f, 45.4f);
generalPath.curveTo(40.9f, 45.600002f, 40.2f, 45.5f, 39.5f, 45.5f);
generalPath.lineTo(39.5f, 45.8f);
generalPath.lineTo(43.3f, 45.6f);
generalPath.lineTo(43.3f, 45.899998f);
generalPath.lineTo(39.399998f, 47.699997f);
generalPath.curveTo(38.399998f, 46.299995f, 38.8f, 42.999996f, 39.899998f, 41.799995f);
generalPath.curveTo(40.1f, 41.699997f, 40.399998f, 41.499996f, 40.699997f, 41.499996f);
generalPath.closePath();
generalPath.moveTo(46.600002f, 55.1f);
generalPath.lineTo(46.600002f, 55.399998f);
generalPath.curveTo(50.7f, 56.199997f, 54.700005f, 56.999996f, 58.800003f, 57.8f);
generalPath.curveTo(58.300003f, 59.1f, 57.300003f, 59.5f, 55.000004f, 59.5f);
generalPath.curveTo(54.900005f, 61.7f, 53.900005f, 62.3f, 50.500004f, 62.1f);
generalPath.curveTo(49.800003f, 64.1f, 48.000004f, 64.6f, 44.900005f, 63.399998f);
generalPath.curveTo(43.200005f, 65.2f, 41.400005f, 64.6f, 39.400005f, 63.8f);
generalPath.curveTo(39.000004f, 66.8f, 37.600006f, 69.1f, 35.000004f, 70.6f);
generalPath.curveTo(32.600002f, 72.0f, 29.900003f, 71.799995f, 27.300003f, 71.299995f);
generalPath.curveTo(16.8f, 69.0f, 10.7f, 58.8f, 13.5f, 48.0f);
generalPath.curveTo(15.6f, 40.0f, 22.1f, 34.5f, 30.2f, 34.1f);
generalPath.curveTo(34.100002f, 33.899998f, 37.600002f, 35.899998f, 39.2f, 39.399998f);
generalPath.curveTo(39.4f, 39.699997f, 39.4f, 40.399998f, 39.2f, 40.6f);
generalPath.curveTo(37.0f, 43.3f, 37.0f, 46.199997f, 38.4f, 49.199997f);
generalPath.curveTo(38.7f, 49.899998f, 38.600002f, 50.299995f, 38.2f, 50.799995f);
generalPath.curveTo(36.3f, 53.099995f, 33.8f, 54.499996f, 31.1f, 55.399994f);
generalPath.lineTo(30.7f, 55.499992f);
generalPath.curveTo(33.9f, 55.399994f, 37.0f, 54.899994f, 39.300003f, 52.29999f);
generalPath.curveTo(39.9f, 51.59999f, 40.500004f, 51.39999f, 41.300003f, 51.59999f);
generalPath.curveTo(45.700005f, 52.29999f, 50.000004f, 52.999992f, 54.4f, 53.69999f);
generalPath.curveTo(55.5f, 53.89999f, 56.600002f, 54.19999f, 57.7f, 54.49999f);
generalPath.curveTo(58.5f, 54.69999f, 59.100002f, 55.299988f, 59.3f, 56.299988f);
generalPath.curveTo(55.0f, 55.899986f, 50.8f, 55.49999f, 46.6f, 55.099987f);
generalPath.closePath();
generalPath.moveTo(33.5f, 43.5f);
generalPath.curveTo(33.5f, 42.0f, 32.3f, 40.8f, 30.8f, 40.9f);
generalPath.curveTo(29.4f, 40.9f, 28.199999f, 42.300003f, 28.199999f, 43.600002f);
generalPath.curveTo(28.3f, 45.000004f, 29.499998f, 46.2f, 30.9f, 46.2f);
generalPath.curveTo(32.3f, 46.2f, 33.5f, 45.0f, 33.5f, 43.5f);
generalPath.closePath();
generalPath.moveTo(29.3f, 42.3f);
generalPath.curveTo(29.3f, 41.399998f, 30.199999f, 41.2f, 31.0f, 41.3f);
generalPath.curveTo(31.7f, 41.3f, 32.5f, 41.5f, 32.5f, 42.3f);
generalPath.curveTo(32.5f, 43.2f, 31.5f, 43.3f, 30.6f, 43.6f);
generalPath.curveTo(30.1f, 43.199997f, 29.300001f, 42.8f, 29.300001f, 42.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.66699981689453, 22.485000610351562), new Point2D.Double(36.66699981689453, 68.11299896240234), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.66699981689453, 77.76499938964844), new Point2D.Double(36.66699981689453, 31.636999130249023), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(59.8f, 53.1f);
generalPath.curveTo(59.3f, 52.899998f, 58.7f, 52.6f, 58.2f, 52.5f);
generalPath.curveTo(55.0f, 51.8f, 51.9f, 51.1f, 48.7f, 50.5f);
generalPath.curveTo(46.4f, 50.1f, 44.0f, 49.8f, 41.7f, 49.5f);
generalPath.curveTo(41.9f, 47.9f, 42.2f, 47.7f, 43.9f, 47.4f);
generalPath.curveTo(44.800003f, 48.9f, 44.800003f, 48.9f, 46.600002f, 48.7f);
generalPath.curveTo(50.4f, 48.3f, 52.800003f, 46.100002f, 53.500004f, 42.2f);
generalPath.curveTo(54.000004f, 39.3f, 54.600002f, 36.5f, 56.800003f, 34.4f);
generalPath.lineTo(56.800003f, 34.2f);
generalPath.curveTo(52.800003f, 33.0f, 47.600002f, 35.7f, 44.4f, 40.9f);
generalPath.curveTo(42.9f, 40.7f, 42.0f, 40.2f, 41.300003f, 38.7f);
generalPath.curveTo(39.600002f, 34.600002f, 36.300003f, 32.100002f, 31.700003f, 31.900002f);
generalPath.curveTo(23.400002f, 31.600002f, 15.9000025f, 36.4f, 12.600002f, 44.100002f);
generalPath.curveTo(9.4000025f, 51.7f, 10.4000025f, 59.100002f, 14.100002f, 66.3f);
generalPath.curveTo(15.600002f, 69.200005f, 17.500002f, 71.8f, 20.300003f, 73.600006f);
generalPath.curveTo(22.700003f, 75.100006f, 24.900003f, 74.700005f, 26.500004f, 72.3f);
generalPath.lineTo(26.800003f, 72.0f);
generalPath.lineTo(27.500004f, 73.9f);
generalPath.curveTo(27.700005f, 74.5f, 28.000004f, 75.200005f, 28.200005f, 75.8f);
generalPath.curveTo(28.800005f, 77.100006f, 30.200005f, 77.700005f, 31.500004f, 77.200005f);
generalPath.curveTo(31.800003f, 77.100006f, 32.300003f, 77.100006f, 32.600002f, 77.200005f);
generalPath.curveTo(34.000004f, 77.700005f, 35.4f, 77.700005f, 36.500004f, 76.50001f);
generalPath.curveTo(36.700005f, 76.30001f, 37.100002f, 76.30001f, 37.400005f, 76.30001f);
generalPath.curveTo(39.400005f, 76.40001f, 40.500004f, 75.70001f, 41.300007f, 73.90001f);
generalPath.curveTo(41.400005f, 73.70001f, 41.500008f, 73.600006f, 41.600006f, 73.50001f);
generalPath.curveTo(42.900005f, 72.50001f, 43.200005f, 71.40001f, 42.600006f, 69.80001f);
generalPath.curveTo(42.200005f, 68.90001f, 41.700005f, 68.00001f, 41.200005f, 67.10001f);
generalPath.curveTo(40.900005f, 66.500015f, 40.500004f, 65.80001f, 40.000004f, 65.000015f);
generalPath.curveTo(42.200005f, 65.70001f, 44.100002f, 66.500015f, 45.900005f, 64.80002f);
generalPath.curveTo(46.300007f, 65.000015f, 46.600006f, 65.20002f, 46.900005f, 65.30002f);
generalPath.curveTo(48.700005f, 66.10002f, 51.100006f, 65.80002f, 52.200005f, 64.60002f);
generalPath.curveTo(52.600006f, 64.10002f, 53.000004f, 64.10002f, 53.600006f, 64.10002f);
generalPath.curveTo(55.900005f, 64.30002f, 58.500008f, 63.60002f, 58.900005f, 60.90002f);
generalPath.curveTo(61.300007f, 60.40002f, 62.400005f, 59.40002f, 62.600006f, 57.300022f);
generalPath.curveTo(62.900005f, 55.300022f, 62.000008f, 54.000023f, 59.800007f, 53.10002f);
generalPath.closePath();
generalPath.moveTo(45.8f, 47.399998f);
generalPath.curveTo(45.6f, 47.399998f, 45.2f, 46.999996f, 45.1f, 46.699997f);
generalPath.curveTo(44.899998f, 46.299995f, 44.899998f, 45.799995f, 44.699997f, 44.999996f);
generalPath.lineTo(46.6f, 45.699997f);
generalPath.curveTo(47.5f, 45.1f, 48.3f, 45.999996f, 49.6f, 46.199997f);
generalPath.curveTo(48.3f, 47.1f, 47.1f, 47.399998f, 45.8f, 47.399998f);
generalPath.closePath();
generalPath.moveTo(53.9f, 35.5f);
generalPath.curveTo(53.0f, 38.7f, 52.0f, 41.9f, 51.0f, 45.3f);
generalPath.curveTo(49.8f, 44.3f, 49.0f, 43.6f, 47.9f, 42.7f);
generalPath.lineTo(51.4f, 37.3f);
generalPath.curveTo(49.5f, 38.5f, 48.300003f, 40.3f, 47.300003f, 42.3f);
generalPath.lineTo(45.700005f, 41.399998f);
generalPath.curveTo(46.900005f, 38.399998f, 50.900005f, 35.6f, 53.900005f, 35.499996f);
generalPath.closePath();
generalPath.moveTo(40.7f, 41.5f);
generalPath.curveTo(43.3f, 41.6f, 45.600002f, 42.8f, 47.7f, 44.4f);
generalPath.curveTo(47.8f, 44.5f, 47.9f, 44.800003f, 48.0f, 45.2f);
generalPath.curveTo(45.6f, 44.4f, 43.6f, 44.7f, 41.5f, 45.4f);
generalPath.curveTo(40.9f, 45.600002f, 40.2f, 45.5f, 39.5f, 45.5f);
generalPath.lineTo(39.5f, 45.8f);
generalPath.lineTo(43.3f, 45.6f);
generalPath.lineTo(43.3f, 45.899998f);
generalPath.lineTo(39.399998f, 47.699997f);
generalPath.curveTo(38.399998f, 46.299995f, 38.8f, 42.999996f, 39.899998f, 41.799995f);
generalPath.curveTo(40.1f, 41.699997f, 40.399998f, 41.499996f, 40.699997f, 41.499996f);
generalPath.closePath();
generalPath.moveTo(46.600002f, 55.1f);
generalPath.lineTo(46.600002f, 55.399998f);
generalPath.curveTo(50.7f, 56.199997f, 54.700005f, 56.999996f, 58.800003f, 57.8f);
generalPath.curveTo(58.300003f, 59.1f, 57.300003f, 59.5f, 55.000004f, 59.5f);
generalPath.curveTo(54.900005f, 61.7f, 53.900005f, 62.3f, 50.500004f, 62.1f);
generalPath.curveTo(49.800003f, 64.1f, 48.000004f, 64.6f, 44.900005f, 63.399998f);
generalPath.curveTo(43.200005f, 65.2f, 41.400005f, 64.6f, 39.400005f, 63.8f);
generalPath.curveTo(39.000004f, 66.8f, 37.600006f, 69.1f, 35.000004f, 70.6f);
generalPath.curveTo(32.600002f, 72.0f, 29.900003f, 71.799995f, 27.300003f, 71.299995f);
generalPath.curveTo(16.8f, 69.0f, 10.7f, 58.8f, 13.5f, 48.0f);
generalPath.curveTo(15.6f, 40.0f, 22.1f, 34.5f, 30.2f, 34.1f);
generalPath.curveTo(34.100002f, 33.899998f, 37.600002f, 35.899998f, 39.2f, 39.399998f);
generalPath.curveTo(39.4f, 39.699997f, 39.4f, 40.399998f, 39.2f, 40.6f);
generalPath.curveTo(37.0f, 43.3f, 37.0f, 46.199997f, 38.4f, 49.199997f);
generalPath.curveTo(38.7f, 49.899998f, 38.600002f, 50.299995f, 38.2f, 50.799995f);
generalPath.curveTo(36.3f, 53.099995f, 33.8f, 54.499996f, 31.1f, 55.399994f);
generalPath.lineTo(30.7f, 55.499992f);
generalPath.curveTo(33.9f, 55.399994f, 37.0f, 54.899994f, 39.300003f, 52.29999f);
generalPath.curveTo(39.9f, 51.59999f, 40.500004f, 51.39999f, 41.300003f, 51.59999f);
generalPath.curveTo(45.700005f, 52.29999f, 50.000004f, 52.999992f, 54.4f, 53.69999f);
generalPath.curveTo(55.5f, 53.89999f, 56.600002f, 54.19999f, 57.7f, 54.49999f);
generalPath.curveTo(58.5f, 54.69999f, 59.100002f, 55.299988f, 59.3f, 56.299988f);
generalPath.curveTo(55.0f, 55.899986f, 50.8f, 55.49999f, 46.6f, 55.099987f);
generalPath.closePath();
generalPath.moveTo(33.5f, 43.5f);
generalPath.curveTo(33.5f, 42.0f, 32.3f, 40.8f, 30.8f, 40.9f);
generalPath.curveTo(29.4f, 40.9f, 28.199999f, 42.300003f, 28.199999f, 43.600002f);
generalPath.curveTo(28.3f, 45.000004f, 29.499998f, 46.2f, 30.9f, 46.2f);
generalPath.curveTo(32.3f, 46.2f, 33.5f, 45.0f, 33.5f, 43.5f);
generalPath.closePath();
generalPath.moveTo(29.3f, 42.3f);
generalPath.curveTo(29.3f, 41.399998f, 30.199999f, 41.2f, 31.0f, 41.3f);
generalPath.curveTo(31.7f, 41.3f, 32.5f, 41.5f, 32.5f, 42.3f);
generalPath.curveTo(32.5f, 43.2f, 31.5f, 43.3f, 30.6f, 43.6f);
generalPath.curveTo(30.1f, 43.199997f, 29.300001f, 42.8f, 29.300001f, 42.3f);
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
	private ext_bowerrc() {
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
       ext_bowerrc base = new ext_bowerrc();
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
       ext_bowerrc base = new ext_bowerrc();
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
        return ext_bowerrc::new;
    }
}

