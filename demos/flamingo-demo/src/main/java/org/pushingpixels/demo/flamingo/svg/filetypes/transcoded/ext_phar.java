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
public class ext_phar implements NeonIcon {
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
generalPath.moveTo(6.0f, 90.1f);
generalPath.lineTo(6.0f, 74.3f);
generalPath.lineTo(11.2f, 74.3f);
generalPath.curveTo(13.2f, 74.3f, 14.4f, 74.4f, 15.0f, 74.5f);
generalPath.curveTo(15.9f, 74.7f, 16.7f, 75.3f, 17.3f, 76.0f);
generalPath.curveTo(17.9f, 76.8f, 18.199999f, 77.8f, 18.199999f, 79.1f);
generalPath.curveTo(18.199999f, 80.1f, 17.999998f, 80.9f, 17.699999f, 81.5f);
generalPath.curveTo(17.4f, 82.1f, 16.9f, 82.7f, 16.3f, 83.1f);
generalPath.curveTo(15.799999f, 83.5f, 15.199999f, 83.7f, 14.599999f, 83.799995f);
generalPath.curveTo(13.799999f, 83.99999f, 12.7f, 83.99999f, 11.299999f, 83.99999f);
generalPath.lineTo(9.2f, 83.99999f);
generalPath.lineTo(9.2f, 89.899994f);
generalPath.lineTo(6.0f, 89.899994f);
generalPath.closePath();
generalPath.moveTo(9.2f, 77.0f);
generalPath.lineTo(9.2f, 81.5f);
generalPath.lineTo(11.0f, 81.5f);
generalPath.curveTo(12.3f, 81.5f, 13.1f, 81.4f, 13.5f, 81.3f);
generalPath.curveTo(13.9f, 81.100006f, 14.3f, 80.9f, 14.5f, 80.5f);
generalPath.curveTo(14.7f, 80.1f, 14.9f, 79.7f, 14.9f, 79.3f);
generalPath.curveTo(14.9f, 78.700005f, 14.7f, 78.3f, 14.4f, 77.9f);
generalPath.curveTo(14.099999f, 77.5f, 13.599999f, 77.3f, 13.099999f, 77.200005f);
generalPath.curveTo(12.7f, 77.00001f, 11.999999f, 77.00001f, 10.799999f, 77.00001f);
generalPath.lineTo(9.2f, 77.00001f);
generalPath.closePath();
generalPath.moveTo(20.9f, 90.1f);
generalPath.lineTo(20.9f, 74.3f);
generalPath.lineTo(24.1f, 74.3f);
generalPath.lineTo(24.1f, 80.5f);
generalPath.lineTo(30.400002f, 80.5f);
generalPath.lineTo(30.400002f, 74.3f);
generalPath.lineTo(33.600002f, 74.3f);
generalPath.lineTo(33.600002f, 90.0f);
generalPath.lineTo(30.400002f, 90.0f);
generalPath.lineTo(30.400002f, 83.1f);
generalPath.lineTo(24.100002f, 83.1f);
generalPath.lineTo(24.100002f, 90.0f);
generalPath.lineTo(20.900002f, 90.0f);
generalPath.closePath();
generalPath.moveTo(51.4f, 90.1f);
generalPath.lineTo(47.9f, 90.1f);
generalPath.lineTo(46.5f, 86.5f);
generalPath.lineTo(40.1f, 86.5f);
generalPath.lineTo(38.8f, 90.1f);
generalPath.lineTo(35.399998f, 90.1f);
generalPath.lineTo(41.6f, 74.4f);
generalPath.lineTo(45.0f, 74.4f);
generalPath.lineTo(51.4f, 90.1f);
generalPath.closePath();
generalPath.moveTo(45.5f, 83.799995f);
generalPath.lineTo(43.3f, 78.0f);
generalPath.lineTo(41.1f, 83.8f);
generalPath.lineTo(45.5f, 83.8f);
generalPath.closePath();
generalPath.moveTo(53.1f, 90.1f);
generalPath.lineTo(53.1f, 74.3f);
generalPath.lineTo(59.899998f, 74.3f);
generalPath.curveTo(61.6f, 74.3f, 62.8f, 74.4f, 63.6f, 74.700005f);
generalPath.curveTo(64.4f, 75.00001f, 65.0f, 75.50001f, 65.5f, 76.200005f);
generalPath.curveTo(66.0f, 76.9f, 66.2f, 77.8f, 66.2f, 78.700005f);
generalPath.curveTo(66.2f, 79.9f, 65.799995f, 80.9f, 65.1f, 81.600006f);
generalPath.curveTo(64.4f, 82.40001f, 63.3f, 82.90001f, 61.899998f, 83.100006f);
generalPath.curveTo(62.6f, 83.50001f, 63.199997f, 83.90001f, 63.6f, 84.40001f);
generalPath.curveTo(64.0f, 84.90001f, 64.7f, 85.70001f, 65.4f, 87.00001f);
generalPath.lineTo(67.4f, 90.100006f);
generalPath.lineTo(63.5f, 90.100006f);
generalPath.lineTo(61.2f, 86.700005f);
generalPath.curveTo(60.4f, 85.50001f, 59.8f, 84.700005f, 59.5f, 84.4f);
generalPath.curveTo(59.2f, 84.1f, 58.9f, 83.9f, 58.5f, 83.700005f);
generalPath.curveTo(58.2f, 83.600006f, 57.6f, 83.50001f, 56.9f, 83.50001f);
generalPath.lineTo(56.2f, 83.50001f);
generalPath.lineTo(56.2f, 90.100006f);
generalPath.lineTo(53.100002f, 90.100006f);
generalPath.closePath();
generalPath.moveTo(56.399998f, 81.0f);
generalPath.lineTo(58.8f, 81.0f);
generalPath.curveTo(60.3f, 81.0f, 61.3f, 80.9f, 61.7f, 80.8f);
generalPath.curveTo(62.100002f, 80.700005f, 62.4f, 80.4f, 62.600002f, 80.100006f);
generalPath.curveTo(62.800003f, 79.80001f, 62.9f, 79.40001f, 62.9f, 78.90001f);
generalPath.curveTo(62.9f, 78.40001f, 62.800003f, 77.90001f, 62.5f, 77.600006f);
generalPath.curveTo(62.2f, 77.3f, 61.8f, 77.100006f, 61.3f, 77.00001f);
generalPath.curveTo(61.0f, 77.00001f, 60.3f, 76.90001f, 58.899998f, 76.90001f);
generalPath.lineTo(56.399998f, 76.90001f);
generalPath.lineTo(56.399998f, 81.0f);
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
generalPath.moveTo(56.4f, 35.2f);
generalPath.lineTo(36.0f, 27.0f);
generalPath.lineTo(28.0f, 30.2f);
generalPath.lineTo(48.3f, 38.4f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(42.16999816894531, 38.369998931884766), new Point2D.Double(42.16999816894531, 27.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(22.9f, 32.2f);
generalPath.lineTo(15.599999f, 35.2f);
generalPath.lineTo(36.0f, 43.3f);
generalPath.lineTo(43.2f, 40.399998f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(29.434999465942383, 43.30400085449219), new Point2D.Double(29.434999465942383, 32.25), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(14.8f, 58.8f);
generalPath.lineTo(35.4f, 67.0f);
generalPath.lineTo(35.4f, 44.3f);
generalPath.lineTo(14.800001f, 36.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(25.11400032043457, 67.0), new Point2D.Double(25.11400032043457, 36.11000061035156), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(49.1f, 39.3f);
generalPath.lineTo(49.1f, 45.7f);
generalPath.lineTo(48.3f, 45.2f);
generalPath.lineTo(47.399998f, 46.4f);
generalPath.lineTo(46.6f, 45.9f);
generalPath.lineTo(45.699997f, 47.100002f);
generalPath.lineTo(44.899998f, 46.600002f);
generalPath.lineTo(43.999996f, 47.800003f);
generalPath.lineTo(43.999996f, 41.4f);
generalPath.lineTo(36.599995f, 44.300003f);
generalPath.lineTo(36.599995f, 67.0f);
generalPath.lineTo(57.199997f, 58.8f);
generalPath.lineTo(57.199997f, 36.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(46.88600158691406, 67.0), new Point2D.Double(46.88600158691406, 36.11000061035156), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(19.5f, 49.6f);
generalPath.curveTo(19.9f, 49.8f, 20.3f, 49.8f, 20.6f, 49.699997f);
generalPath.curveTo(20.900002f, 49.599995f, 21.1f, 49.399998f, 21.300001f, 48.999996f);
generalPath.curveTo(21.500002f, 48.699997f, 21.6f, 48.399998f, 21.500002f, 48.199997f);
generalPath.curveTo(21.400002f, 47.999996f, 21.200003f, 47.799995f, 20.800001f, 47.699997f);
generalPath.lineTo(20.1f, 47.399998f);
generalPath.lineTo(18.9f, 49.3f);
generalPath.curveTo(18.9f, 49.399998f, 19.5f, 49.6f, 19.5f, 49.6f);
generalPath.closePath();
generalPath.moveTo(16.2f, 51.199997f);
generalPath.curveTo(16.2f, 51.199997f, 16.1f, 51.199997f, 16.2f, 51.199997f);
generalPath.curveTo(16.1f, 51.1f, 16.1f, 51.1f, 16.2f, 50.999996f);
generalPath.lineTo(19.300001f, 45.899998f);
generalPath.lineTo(19.400002f, 45.8f);
generalPath.lineTo(21.7f, 46.7f);
generalPath.curveTo(22.400002f, 47.0f, 22.900002f, 47.4f, 23.0f, 47.9f);
generalPath.curveTo(23.099998f, 48.4f, 23.1f, 49.0f, 22.7f, 49.600002f);
generalPath.curveTo(22.5f, 49.9f, 22.300001f, 50.100002f, 22.1f, 50.300003f);
generalPath.curveTo(21.9f, 50.500004f, 21.6f, 50.600002f, 21.4f, 50.700005f);
generalPath.curveTo(21.1f, 50.800003f, 20.699999f, 50.900005f, 20.4f, 50.900005f);
generalPath.curveTo(20.1f, 50.900005f, 19.699999f, 50.800007f, 19.199999f, 50.600006f);
generalPath.lineTo(18.3f, 50.300007f);
generalPath.lineTo(17.5f, 51.600006f);
generalPath.lineTo(17.4f, 51.700005f);
generalPath.lineTo(16.199999f, 51.200005f);
generalPath.closePath();
generalPath.moveTo(25.2f, 52.999996f);
generalPath.curveTo(25.1f, 52.899998f, 25.1f, 52.899998f, 25.2f, 52.799995f);
generalPath.lineTo(26.6f, 50.599995f);
generalPath.curveTo(26.7f, 50.399994f, 26.800001f, 50.199993f, 26.800001f, 50.099995f);
generalPath.curveTo(26.800001f, 49.999996f, 26.7f, 49.899994f, 26.400002f, 49.799995f);
generalPath.lineTo(25.600002f, 49.499996f);
generalPath.lineTo(23.900002f, 52.299995f);
generalPath.lineTo(23.800001f, 52.399994f);
generalPath.lineTo(22.6f, 51.999992f);
generalPath.lineTo(22.5f, 51.899994f);
generalPath.lineTo(22.5f, 51.799995f);
generalPath.lineTo(25.6f, 46.699997f);
generalPath.lineTo(25.7f, 46.6f);
generalPath.lineTo(26.900002f, 47.0f);
generalPath.lineTo(27.000002f, 47.1f);
generalPath.lineTo(27.000002f, 47.199997f);
generalPath.lineTo(26.200003f, 48.399998f);
generalPath.lineTo(27.100002f, 48.699997f);
generalPath.curveTo(27.800003f, 48.999996f, 28.200003f, 49.299995f, 28.400002f, 49.6f);
generalPath.curveTo(28.6f, 49.9f, 28.500002f, 50.399998f, 28.2f, 50.899998f);
generalPath.lineTo(26.800001f, 53.199997f);
generalPath.lineTo(26.7f, 53.299995f);
generalPath.lineTo(25.2f, 52.999996f);
generalPath.closePath();
generalPath.moveTo(30.1f, 53.699997f);
generalPath.curveTo(30.6f, 53.899998f, 30.9f, 53.899998f, 31.2f, 53.899998f);
generalPath.curveTo(31.5f, 53.8f, 31.7f, 53.6f, 32.0f, 53.199997f);
generalPath.curveTo(32.2f, 52.899998f, 32.3f, 52.6f, 32.2f, 52.399998f);
generalPath.curveTo(32.100002f, 52.199997f, 31.900002f, 51.999996f, 31.5f, 51.899998f);
generalPath.lineTo(30.8f, 51.6f);
generalPath.lineTo(29.599998f, 53.5f);
generalPath.lineTo(30.099998f, 53.7f);
generalPath.closePath();
generalPath.moveTo(26.7f, 55.299995f);
generalPath.curveTo(26.7f, 55.299995f, 26.6f, 55.199997f, 26.7f, 55.299995f);
generalPath.curveTo(26.6f, 55.199997f, 26.6f, 55.199997f, 26.6f, 55.099995f);
generalPath.lineTo(29.800001f, 50.099995f);
generalPath.curveTo(29.800001f, 50.099995f, 29.900002f, 49.999996f, 30.000002f, 49.999996f);
generalPath.lineTo(32.300003f, 50.899998f);
generalPath.curveTo(33.000004f, 51.199997f, 33.500004f, 51.6f, 33.700005f, 52.1f);
generalPath.curveTo(33.900005f, 52.6f, 33.800003f, 53.199997f, 33.400005f, 53.8f);
generalPath.curveTo(33.200005f, 54.1f, 33.000004f, 54.3f, 32.800007f, 54.5f);
generalPath.curveTo(32.600006f, 54.7f, 32.300007f, 54.8f, 32.000008f, 54.9f);
generalPath.curveTo(31.700008f, 55.0f, 31.300007f, 55.100002f, 31.000008f, 55.100002f);
generalPath.curveTo(30.700008f, 55.100002f, 30.300007f, 55.000004f, 29.800007f, 54.800003f);
generalPath.lineTo(28.900007f, 54.4f);
generalPath.lineTo(28.100008f, 55.7f);
generalPath.curveTo(28.100008f, 55.7f, 28.000008f, 55.8f, 27.900007f, 55.8f);
generalPath.lineTo(26.700006f, 55.3f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(234, 237, 239, 255)) : new Color(234, 237, 239, 255);
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
// _0_10
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_phar() {
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
       ext_phar base = new ext_phar();
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
       ext_phar base = new ext_phar();
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
        return ext_phar::new;
    }
}

