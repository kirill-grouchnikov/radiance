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
public class ext_tcsh implements NeonIcon {
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
generalPath.moveTo(30.2f, 40.4f);
generalPath.lineTo(43.1f, 40.4f);
generalPath.lineTo(43.1f, 43.600002f);
generalPath.lineTo(30.2f, 43.600002f);
generalPath.lineTo(30.2f, 40.4f);
generalPath.closePath();
generalPath.moveTo(30.2f, 46.800003f);
generalPath.lineTo(43.1f, 46.800003f);
generalPath.lineTo(43.1f, 50.0f);
generalPath.lineTo(30.2f, 50.0f);
generalPath.lineTo(30.2f, 46.8f);
generalPath.closePath();
generalPath.moveTo(30.2f, 53.300003f);
generalPath.lineTo(43.1f, 53.300003f);
generalPath.lineTo(43.1f, 56.500004f);
generalPath.lineTo(30.2f, 56.500004f);
generalPath.lineTo(30.2f, 53.300003f);
generalPath.closePath();
generalPath.moveTo(52.800003f, 24.200003f);
generalPath.lineTo(26.9f, 24.200003f);
generalPath.curveTo(23.3f, 24.200003f, 20.4f, 27.100002f, 20.4f, 30.700003f);
generalPath.lineTo(20.4f, 59.800003f);
generalPath.lineTo(14.0f, 59.800003f);
generalPath.curveTo(14.0f, 63.4f, 16.9f, 66.3f, 20.5f, 66.3f);
generalPath.lineTo(46.3f, 66.3f);
generalPath.curveTo(49.899998f, 66.3f, 52.8f, 63.4f, 52.8f, 59.800003f);
generalPath.lineTo(52.8f, 33.9f);
generalPath.lineTo(59.3f, 33.9f);
generalPath.lineTo(59.3f, 30.7f);
generalPath.curveTo(59.2f, 27.1f, 56.399998f, 24.2f, 52.8f, 24.2f);
generalPath.closePath();
generalPath.moveTo(49.600002f, 59.200005f);
generalPath.curveTo(49.600002f, 61.300003f, 47.9f, 63.000004f, 45.800003f, 63.000004f);
generalPath.lineTo(22.1f, 63.000004f);
generalPath.curveTo(23.7f, 61.900005f, 23.7f, 59.800003f, 23.7f, 59.800003f);
generalPath.lineTo(23.7f, 30.7f);
generalPath.curveTo(23.7f, 28.900002f, 25.1f, 27.5f, 26.900002f, 27.5f);
generalPath.curveTo(28.7f, 27.5f, 30.100002f, 28.9f, 30.100002f, 30.7f);
generalPath.lineTo(30.100002f, 33.9f);
generalPath.lineTo(49.5f, 33.9f);
generalPath.lineTo(49.5f, 59.2f);
generalPath.closePath();
generalPath.moveTo(33.4f, 30.7f);
generalPath.lineTo(33.4f, 27.5f);
generalPath.lineTo(52.800003f, 27.5f);
generalPath.curveTo(55.700005f, 27.5f, 56.000004f, 29.3f, 56.000004f, 30.7f);
generalPath.lineTo(33.4f, 30.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 66.23100280761719), new Point2D.Double(36.63199996948242, 24.231000900268555), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 66.60600280761719), new Point2D.Double(36.63199996948242, 23.856000900268555), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.2f, 40.4f);
generalPath.lineTo(43.1f, 40.4f);
generalPath.lineTo(43.1f, 43.600002f);
generalPath.lineTo(30.2f, 43.600002f);
generalPath.lineTo(30.2f, 40.4f);
generalPath.closePath();
generalPath.moveTo(30.2f, 46.800003f);
generalPath.lineTo(43.1f, 46.800003f);
generalPath.lineTo(43.1f, 50.0f);
generalPath.lineTo(30.2f, 50.0f);
generalPath.lineTo(30.2f, 46.8f);
generalPath.closePath();
generalPath.moveTo(30.2f, 53.300003f);
generalPath.lineTo(43.1f, 53.300003f);
generalPath.lineTo(43.1f, 56.500004f);
generalPath.lineTo(30.2f, 56.500004f);
generalPath.lineTo(30.2f, 53.300003f);
generalPath.closePath();
generalPath.moveTo(52.800003f, 24.200003f);
generalPath.lineTo(26.9f, 24.200003f);
generalPath.curveTo(23.3f, 24.200003f, 20.4f, 27.100002f, 20.4f, 30.700003f);
generalPath.lineTo(20.4f, 59.800003f);
generalPath.lineTo(14.0f, 59.800003f);
generalPath.curveTo(14.0f, 63.4f, 16.9f, 66.3f, 20.5f, 66.3f);
generalPath.lineTo(46.3f, 66.3f);
generalPath.curveTo(49.899998f, 66.3f, 52.8f, 63.4f, 52.8f, 59.800003f);
generalPath.lineTo(52.8f, 33.9f);
generalPath.lineTo(59.3f, 33.9f);
generalPath.lineTo(59.3f, 30.7f);
generalPath.curveTo(59.2f, 27.1f, 56.399998f, 24.2f, 52.8f, 24.2f);
generalPath.closePath();
generalPath.moveTo(49.600002f, 59.200005f);
generalPath.curveTo(49.600002f, 61.300003f, 47.9f, 63.000004f, 45.800003f, 63.000004f);
generalPath.lineTo(22.1f, 63.000004f);
generalPath.curveTo(23.7f, 61.900005f, 23.7f, 59.800003f, 23.7f, 59.800003f);
generalPath.lineTo(23.7f, 30.7f);
generalPath.curveTo(23.7f, 28.900002f, 25.1f, 27.5f, 26.900002f, 27.5f);
generalPath.curveTo(28.7f, 27.5f, 30.100002f, 28.9f, 30.100002f, 30.7f);
generalPath.lineTo(30.100002f, 33.9f);
generalPath.lineTo(49.5f, 33.9f);
generalPath.lineTo(49.5f, 59.2f);
generalPath.closePath();
generalPath.moveTo(33.4f, 30.7f);
generalPath.lineTo(33.4f, 27.5f);
generalPath.lineTo(52.800003f, 27.5f);
generalPath.curveTo(55.700005f, 27.5f, 56.000004f, 29.3f, 56.000004f, 30.7f);
generalPath.lineTo(33.4f, 30.7f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(11.2f, 91.9f);
generalPath.lineTo(11.2f, 78.8f);
generalPath.lineTo(6.5f, 78.8f);
generalPath.lineTo(6.5f, 76.100006f);
generalPath.lineTo(19.0f, 76.100006f);
generalPath.lineTo(19.0f, 78.8f);
generalPath.lineTo(14.3f, 78.8f);
generalPath.lineTo(14.3f, 91.9f);
generalPath.lineTo(11.200001f, 91.9f);
generalPath.closePath();
generalPath.moveTo(31.2f, 86.1f);
generalPath.lineTo(34.3f, 87.1f);
generalPath.curveTo(33.8f, 88.799995f, 33.0f, 90.1f, 31.9f, 90.9f);
generalPath.curveTo(30.8f, 91.700005f, 29.4f, 92.200005f, 27.7f, 92.200005f);
generalPath.curveTo(25.6f, 92.200005f, 23.900002f, 91.50001f, 22.5f, 90.100006f);
generalPath.curveTo(21.2f, 88.700005f, 20.5f, 86.700005f, 20.5f, 84.200005f);
generalPath.curveTo(20.5f, 81.600006f, 21.2f, 79.50001f, 22.5f, 78.100006f);
generalPath.curveTo(23.9f, 76.700005f, 25.6f, 75.90001f, 27.8f, 75.90001f);
generalPath.curveTo(29.699999f, 75.90001f, 31.3f, 76.50001f, 32.5f, 77.600006f);
generalPath.curveTo(33.2f, 78.3f, 33.8f, 79.200005f, 34.1f, 80.50001f);
generalPath.lineTo(30.999998f, 81.30001f);
generalPath.curveTo(30.799997f, 80.50001f, 30.399998f, 79.80001f, 29.799997f, 79.40001f);
generalPath.curveTo(29.199997f, 79.00001f, 28.499998f, 78.70001f, 27.599997f, 78.70001f);
generalPath.curveTo(26.399996f, 78.70001f, 25.499996f, 79.10001f, 24.799997f, 80.000015f);
generalPath.curveTo(24.099997f, 80.80002f, 23.699997f, 82.20001f, 23.699997f, 84.10001f);
generalPath.curveTo(23.699997f, 86.10001f, 24.099997f, 87.500015f, 24.799997f, 88.40002f);
generalPath.curveTo(25.499998f, 89.20002f, 26.399998f, 89.70002f, 27.599997f, 89.70002f);
generalPath.curveTo(28.399996f, 89.70002f, 29.199997f, 89.40002f, 29.799997f, 88.90002f);
generalPath.curveTo(30.499998f, 88.10001f, 30.899998f, 87.20002f, 31.199997f, 86.10001f);
generalPath.closePath();
generalPath.moveTo(36.2f, 86.799995f);
generalPath.lineTo(39.3f, 86.49999f);
generalPath.curveTo(39.5f, 87.49999f, 39.899998f, 88.299995f, 40.399998f, 88.799995f);
generalPath.curveTo(40.899998f, 89.299995f, 41.699997f, 89.49999f, 42.699997f, 89.49999f);
generalPath.curveTo(43.699997f, 89.49999f, 44.499996f, 89.299995f, 44.999996f, 88.799995f);
generalPath.curveTo(45.499996f, 88.399994f, 45.799995f, 87.899994f, 45.799995f, 87.299995f);
generalPath.curveTo(45.799995f, 86.899994f, 45.699997f, 86.6f, 45.499996f, 86.299995f);
generalPath.curveTo(45.299995f, 85.99999f, 44.899998f, 85.799995f, 44.399998f, 85.6f);
generalPath.curveTo(43.999996f, 85.5f, 43.199997f, 85.2f, 41.899998f, 84.9f);
generalPath.curveTo(40.199997f, 84.5f, 38.999996f, 84.0f, 38.3f, 83.3f);
generalPath.curveTo(37.3f, 82.4f, 36.8f, 81.4f, 36.8f, 80.100006f);
generalPath.curveTo(36.8f, 79.3f, 37.0f, 78.50001f, 37.5f, 77.90001f);
generalPath.curveTo(38.0f, 77.20001f, 38.6f, 76.70001f, 39.5f, 76.30001f);
generalPath.curveTo(40.4f, 75.90001f, 41.4f, 75.80001f, 42.6f, 75.80001f);
generalPath.curveTo(44.6f, 75.80001f, 46.1f, 76.20001f, 47.1f, 77.10001f);
generalPath.curveTo(48.1f, 78.000015f, 48.6f, 79.10001f, 48.699997f, 80.60001f);
generalPath.lineTo(45.499996f, 80.70001f);
generalPath.curveTo(45.399998f, 79.90001f, 45.099995f, 79.30001f, 44.599995f, 79.000015f);
generalPath.curveTo(44.199993f, 78.60001f, 43.499996f, 78.500015f, 42.599995f, 78.500015f);
generalPath.curveTo(41.699993f, 78.500015f, 40.999996f, 78.70001f, 40.399994f, 79.10001f);
generalPath.curveTo(40.099995f, 79.30001f, 39.899994f, 79.70001f, 39.899994f, 80.10001f);
generalPath.curveTo(39.899994f, 80.500015f, 40.099995f, 80.80001f, 40.399994f, 81.10001f);
generalPath.curveTo(40.799995f, 81.40002f, 41.799995f, 81.80001f, 43.299995f, 82.20001f);
generalPath.curveTo(44.799995f, 82.60001f, 45.999996f, 82.90001f, 46.699997f, 83.30001f);
generalPath.curveTo(47.399998f, 83.70001f, 47.999996f, 84.20001f, 48.399998f, 84.90001f);
generalPath.curveTo(48.8f, 85.600006f, 48.999996f, 86.40001f, 48.999996f, 87.40001f);
generalPath.curveTo(48.999996f, 88.30001f, 48.699997f, 89.100006f, 48.199997f, 89.90001f);
generalPath.curveTo(47.699997f, 90.70001f, 46.999996f, 91.30001f, 46.1f, 91.70001f);
generalPath.curveTo(45.199997f, 92.10001f, 44.0f, 92.30001f, 42.699997f, 92.30001f);
generalPath.curveTo(40.699997f, 92.30001f, 39.199997f, 91.80001f, 38.1f, 90.90001f);
generalPath.curveTo(37.0f, 89.90001f, 36.399998f, 88.50001f, 36.199997f, 86.80001f);
generalPath.closePath();
generalPath.moveTo(51.7f, 91.899994f);
generalPath.lineTo(51.7f, 76.1f);
generalPath.lineTo(54.9f, 76.1f);
generalPath.lineTo(54.9f, 82.299995f);
generalPath.lineTo(61.100002f, 82.299995f);
generalPath.lineTo(61.100002f, 76.1f);
generalPath.lineTo(64.3f, 76.1f);
generalPath.lineTo(64.3f, 91.799995f);
generalPath.lineTo(61.100002f, 91.799995f);
generalPath.lineTo(61.100002f, 85.0f);
generalPath.lineTo(54.9f, 85.0f);
generalPath.lineTo(54.9f, 91.9f);
generalPath.lineTo(51.7f, 91.9f);
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
	private ext_tcsh() {
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
       ext_tcsh base = new ext_tcsh();
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
       ext_tcsh base = new ext_tcsh();
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
        return ext_tcsh::new;
    }
}

