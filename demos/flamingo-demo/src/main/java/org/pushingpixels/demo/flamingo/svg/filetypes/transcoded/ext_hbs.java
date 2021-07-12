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
public class ext_hbs implements NeonIcon {
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
generalPath.moveTo(8.6f, 90.1f);
generalPath.lineTo(8.6f, 70.2f);
generalPath.lineTo(12.700001f, 70.2f);
generalPath.lineTo(12.700001f, 78.0f);
generalPath.lineTo(20.7f, 78.0f);
generalPath.lineTo(20.7f, 70.2f);
generalPath.lineTo(24.800001f, 70.2f);
generalPath.lineTo(24.800001f, 90.0f);
generalPath.lineTo(20.7f, 90.0f);
generalPath.lineTo(20.7f, 81.3f);
generalPath.lineTo(12.700001f, 81.3f);
generalPath.lineTo(12.700001f, 90.0f);
generalPath.lineTo(8.6f, 90.0f);
generalPath.closePath();
generalPath.moveTo(28.9f, 70.2f);
generalPath.lineTo(36.9f, 70.2f);
generalPath.curveTo(38.5f, 70.2f, 39.7f, 70.299995f, 40.5f, 70.399994f);
generalPath.curveTo(41.3f, 70.49999f, 42.0f, 70.799995f, 42.6f, 71.2f);
generalPath.curveTo(43.199997f, 71.6f, 43.699997f, 72.2f, 44.1f, 72.899994f);
generalPath.curveTo(44.5f, 73.59999f, 44.699997f, 74.399994f, 44.699997f, 75.2f);
generalPath.curveTo(44.699997f, 76.1f, 44.399998f, 77.0f, 43.899998f, 77.799995f);
generalPath.curveTo(43.399998f, 78.59999f, 42.699997f, 79.2f, 41.8f, 79.49999f);
generalPath.curveTo(43.0f, 79.899994f, 44.0f, 80.49999f, 44.6f, 81.299995f);
generalPath.curveTo(45.3f, 82.1f, 45.6f, 83.1f, 45.6f, 84.299995f);
generalPath.curveTo(45.6f, 85.2f, 45.399998f, 86.1f, 45.0f, 86.899994f);
generalPath.curveTo(44.6f, 87.799995f, 44.0f, 88.399994f, 43.3f, 88.899994f);
generalPath.curveTo(42.6f, 89.399994f, 41.7f, 89.7f, 40.6f, 89.799995f);
generalPath.curveTo(40.0f, 89.99999f, 38.399998f, 89.99999f, 35.8f, 90.1f);
generalPath.lineTo(29.0f, 90.1f);
generalPath.lineTo(29.0f, 70.2f);
generalPath.closePath();
generalPath.moveTo(33.0f, 73.5f);
generalPath.lineTo(33.0f, 78.1f);
generalPath.lineTo(35.7f, 78.1f);
generalPath.curveTo(37.3f, 78.1f, 38.3f, 78.1f, 38.7f, 78.0f);
generalPath.curveTo(39.4f, 77.9f, 39.9f, 77.7f, 40.3f, 77.3f);
generalPath.curveTo(40.7f, 76.9f, 40.899998f, 76.4f, 40.899998f, 75.8f);
generalPath.curveTo(40.899998f, 75.200005f, 40.699997f, 74.700005f, 40.399998f, 74.3f);
generalPath.curveTo(40.1f, 73.9f, 39.499996f, 73.700005f, 38.899998f, 73.600006f);
generalPath.curveTo(38.499996f, 73.600006f, 37.3f, 73.50001f, 35.399998f, 73.50001f);
generalPath.lineTo(33.0f, 73.50001f);
generalPath.closePath();
generalPath.moveTo(33.0f, 81.4f);
generalPath.lineTo(33.0f, 86.700005f);
generalPath.lineTo(36.8f, 86.700005f);
generalPath.curveTo(38.3f, 86.700005f, 39.2f, 86.700005f, 39.6f, 86.600006f);
generalPath.curveTo(40.199997f, 86.50001f, 40.699997f, 86.200005f, 41.1f, 85.8f);
generalPath.curveTo(41.5f, 85.4f, 41.699997f, 84.8f, 41.699997f, 84.100006f);
generalPath.curveTo(41.699997f, 83.50001f, 41.6f, 83.00001f, 41.299995f, 82.600006f);
generalPath.curveTo(40.999996f, 82.200005f, 40.599995f, 81.90001f, 39.999996f, 81.700005f);
generalPath.curveTo(39.399998f, 81.5f, 38.199997f, 81.4f, 36.399998f, 81.4f);
generalPath.lineTo(33.0f, 81.4f);
generalPath.closePath();
generalPath.moveTo(48.2f, 83.6f);
generalPath.lineTo(52.2f, 83.2f);
generalPath.curveTo(52.4f, 84.5f, 52.9f, 85.5f, 53.600002f, 86.1f);
generalPath.curveTo(54.300003f, 86.7f, 55.300003f, 87.0f, 56.500004f, 87.0f);
generalPath.curveTo(57.800003f, 87.0f, 58.800003f, 86.7f, 59.500004f, 86.2f);
generalPath.curveTo(60.200005f, 85.7f, 60.500004f, 85.0f, 60.500004f, 84.299995f);
generalPath.curveTo(60.500004f, 83.799995f, 60.400005f, 83.399994f, 60.100002f, 83.1f);
generalPath.curveTo(59.800003f, 82.799995f, 59.300003f, 82.5f, 58.600002f, 82.2f);
generalPath.curveTo(58.100002f, 82.0f, 57.000004f, 81.7f, 55.300003f, 81.299995f);
generalPath.curveTo(53.100002f, 80.799995f, 51.600002f, 80.1f, 50.700005f, 79.299995f);
generalPath.curveTo(49.500004f, 78.2f, 48.800003f, 76.899994f, 48.800003f, 75.299995f);
generalPath.curveTo(48.800003f, 74.299995f, 49.100002f, 73.299995f, 49.700005f, 72.49999f);
generalPath.curveTo(50.300007f, 71.69999f, 51.100006f, 70.99999f, 52.200005f, 70.49999f);
generalPath.curveTo(53.300003f, 69.99999f, 54.600006f, 69.799995f, 56.200005f, 69.799995f);
generalPath.curveTo(58.700005f, 69.799995f, 60.600006f, 70.299995f, 61.900005f, 71.399994f);
generalPath.curveTo(63.200005f, 72.49999f, 63.800007f, 73.899994f, 63.900005f, 75.799995f);
generalPath.lineTo(59.800007f, 75.99999f);
generalPath.curveTo(59.600006f, 74.99999f, 59.300007f, 74.19999f, 58.70001f, 73.799995f);
generalPath.curveTo(58.10001f, 73.399994f, 57.300007f, 73.1f, 56.10001f, 73.1f);
generalPath.curveTo(54.90001f, 73.1f, 54.00001f, 73.299995f, 53.30001f, 73.799995f);
generalPath.curveTo(52.90001f, 74.1f, 52.700012f, 74.49999f, 52.700012f, 74.99999f);
generalPath.curveTo(52.700012f, 75.49999f, 52.900013f, 75.899994f, 53.30001f, 76.19999f);
generalPath.curveTo(53.80001f, 76.59999f, 55.10001f, 77.09999f, 57.00001f, 77.49999f);
generalPath.curveTo(58.900013f, 77.899994f, 60.400013f, 78.399994f, 61.400013f, 78.899994f);
generalPath.curveTo(62.300014f, 79.399994f, 63.100014f, 80.09999f, 63.600014f, 80.899994f);
generalPath.curveTo(64.10001f, 81.7f, 64.40002f, 82.799995f, 64.40002f, 84.09999f);
generalPath.curveTo(64.40002f, 85.19999f, 64.10001f, 86.29999f, 63.400017f, 87.29999f);
generalPath.curveTo(62.80002f, 88.29999f, 61.900017f, 88.999985f, 60.700016f, 89.499985f);
generalPath.curveTo(59.500015f, 89.999985f, 58.100018f, 90.19998f, 56.300014f, 90.19998f);
generalPath.curveTo(53.800014f, 90.19998f, 51.800014f, 89.59998f, 50.400013f, 88.499985f);
generalPath.curveTo(49.300014f, 87.499985f, 48.50001f, 85.79999f, 48.200012f, 83.59998f);
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
g.setComposite(AlphaComposite.getInstance(3, 0.93f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.4f, 48.3f);
generalPath.curveTo(32.1f, 48.2f, 33.9f, 48.8f, 35.3f, 50.0f);
generalPath.curveTo(36.0f, 50.6f, 36.5f, 51.2f, 37.0f, 52.1f);
generalPath.curveTo(37.8f, 50.699997f, 39.1f, 49.5f, 40.6f, 49.0f);
generalPath.curveTo(42.5f, 48.3f, 44.6f, 48.3f, 46.5f, 49.0f);
generalPath.curveTo(48.2f, 49.7f, 49.6f, 50.6f, 50.9f, 51.8f);
generalPath.curveTo(51.9f, 52.7f, 52.9f, 53.7f, 54.0f, 54.5f);
generalPath.curveTo(54.6f, 55.0f, 55.2f, 55.3f, 55.8f, 55.6f);
generalPath.curveTo(56.7f, 55.899998f, 57.8f, 55.6f, 58.399998f, 54.899998f);
generalPath.curveTo(58.999996f, 54.199997f, 58.999996f, 53.199997f, 58.3f, 52.499996f);
generalPath.curveTo(57.899998f, 52.199997f, 57.3f, 52.199997f, 56.899998f, 52.599995f);
generalPath.curveTo(56.899998f, 52.599995f, 56.899998f, 52.699993f, 56.8f, 52.699993f);
generalPath.curveTo(56.6f, 53.099995f, 56.6f, 53.599995f, 56.899998f, 53.899994f);
generalPath.curveTo(56.3f, 53.599995f, 55.899998f, 52.899994f, 55.8f, 52.199993f);
generalPath.curveTo(55.7f, 51.399994f, 56.3f, 50.599995f, 57.0f, 50.399994f);
generalPath.curveTo(58.5f, 49.799995f, 60.2f, 50.299995f, 61.1f, 51.599995f);
generalPath.curveTo(61.8f, 52.799995f, 62.199997f, 54.299995f, 61.899998f, 55.699993f);
generalPath.curveTo(61.699997f, 56.999992f, 60.999996f, 58.29999f, 59.8f, 59.099995f);
generalPath.curveTo(58.2f, 60.199993f, 56.3f, 60.699993f, 54.399998f, 60.499996f);
generalPath.curveTo(52.6f, 60.399998f, 50.8f, 60.099995f, 49.1f, 59.299995f);
generalPath.curveTo(46.3f, 58.099995f, 43.699997f, 56.699997f, 40.8f, 55.699997f);
generalPath.curveTo(39.8f, 55.499996f, 38.7f, 55.199997f, 37.7f, 54.999996f);
generalPath.lineTo(35.4f, 54.999996f);
generalPath.curveTo(34.5f, 55.099995f, 33.5f, 55.299995f, 32.7f, 55.699997f);
generalPath.curveTo(29.7f, 56.6f, 27.1f, 58.199997f, 24.300001f, 59.299995f);
generalPath.curveTo(21.900002f, 60.299995f, 19.300001f, 60.599995f, 16.7f, 60.099995f);
generalPath.curveTo(15.200001f, 59.899994f, 13.900001f, 59.099995f, 12.900001f, 57.999996f);
generalPath.curveTo(12.1f, 56.999996f, 11.700001f, 55.799995f, 11.700001f, 54.499996f);
generalPath.curveTo(11.6f, 53.299995f, 11.900001f, 52.099995f, 12.700001f, 51.099995f);
generalPath.curveTo(13.400001f, 50.199993f, 14.6f, 49.799995f, 15.800001f, 49.899994f);
generalPath.curveTo(16.500002f, 49.899994f, 17.2f, 50.199993f, 17.7f, 50.799995f);
generalPath.curveTo(18.0f, 51.299995f, 18.1f, 51.899994f, 17.900002f, 52.499996f);
generalPath.curveTo(17.7f, 52.999996f, 17.300001f, 53.399998f, 16.900002f, 53.699997f);
generalPath.curveTo(17.100002f, 53.399998f, 17.2f, 52.899998f, 17.000002f, 52.499996f);
generalPath.curveTo(16.700003f, 52.099995f, 16.100002f, 51.899998f, 15.600002f, 52.299995f);
generalPath.curveTo(15.500002f, 52.299995f, 15.500002f, 52.399994f, 15.4000025f, 52.399994f);
generalPath.curveTo(14.9000025f, 52.999992f, 14.800002f, 53.699993f, 15.200003f, 54.399994f);
generalPath.curveTo(15.600002f, 55.099995f, 16.300003f, 55.499992f, 17.000002f, 55.599995f);
generalPath.curveTo(18.100002f, 55.599995f, 19.100002f, 55.099995f, 19.900002f, 54.399994f);
generalPath.curveTo(21.500002f, 52.799995f, 23.2f, 51.399994f, 24.900002f, 50.099995f);
generalPath.curveTo(26.7f, 48.999996f, 28.500002f, 48.399994f, 30.400002f, 48.299995f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 60.48899841308594), new Point2D.Double(37.0, 48.3120002746582), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.4f, 30.3f);
generalPath.curveTo(32.1f, 30.199999f, 33.9f, 30.8f, 35.3f, 32.0f);
generalPath.curveTo(36.0f, 32.6f, 36.5f, 33.2f, 37.0f, 34.1f);
generalPath.curveTo(37.8f, 32.699997f, 39.1f, 31.499998f, 40.6f, 30.999998f);
generalPath.curveTo(42.5f, 30.299997f, 44.6f, 30.299997f, 46.5f, 30.999998f);
generalPath.curveTo(48.2f, 31.699999f, 49.6f, 32.6f, 50.9f, 33.8f);
generalPath.curveTo(51.9f, 34.7f, 52.9f, 35.7f, 54.0f, 36.5f);
generalPath.curveTo(54.6f, 37.0f, 55.2f, 37.3f, 55.8f, 37.6f);
generalPath.curveTo(56.7f, 37.899998f, 57.8f, 37.6f, 58.399998f, 36.899998f);
generalPath.curveTo(58.999996f, 36.199997f, 58.999996f, 35.199997f, 58.3f, 34.499996f);
generalPath.curveTo(57.899998f, 34.199997f, 57.3f, 34.199997f, 56.899998f, 34.599995f);
generalPath.curveTo(56.899998f, 34.599995f, 56.899998f, 34.699993f, 56.8f, 34.699993f);
generalPath.curveTo(56.6f, 35.099995f, 56.6f, 35.599995f, 56.899998f, 35.899994f);
generalPath.curveTo(56.3f, 35.599995f, 55.899998f, 34.899994f, 55.8f, 34.199993f);
generalPath.curveTo(55.7f, 33.399994f, 56.3f, 32.599995f, 57.0f, 32.399994f);
generalPath.curveTo(58.5f, 31.799994f, 60.2f, 32.299995f, 61.1f, 33.599995f);
generalPath.curveTo(61.8f, 34.799995f, 62.199997f, 36.299995f, 61.899998f, 37.699993f);
generalPath.curveTo(61.699997f, 38.999992f, 60.999996f, 40.29999f, 59.8f, 41.099995f);
generalPath.curveTo(58.2f, 42.199993f, 56.3f, 42.699993f, 54.399998f, 42.499996f);
generalPath.curveTo(52.6f, 42.399998f, 50.8f, 42.099995f, 49.1f, 41.299995f);
generalPath.curveTo(46.3f, 40.099995f, 43.699997f, 38.699997f, 40.8f, 37.699997f);
generalPath.curveTo(39.8f, 37.499996f, 38.7f, 37.199997f, 37.7f, 36.999996f);
generalPath.lineTo(35.4f, 36.999996f);
generalPath.curveTo(34.5f, 37.099995f, 33.5f, 37.299995f, 32.7f, 37.699997f);
generalPath.curveTo(29.7f, 38.6f, 27.1f, 40.199997f, 24.300001f, 41.299995f);
generalPath.curveTo(21.900002f, 42.299995f, 19.300001f, 42.599995f, 16.7f, 42.099995f);
generalPath.curveTo(15.200001f, 41.899994f, 13.900001f, 41.099995f, 12.900001f, 39.999996f);
generalPath.curveTo(12.1f, 38.999996f, 11.700001f, 37.799995f, 11.700001f, 36.499996f);
generalPath.curveTo(11.6f, 35.299995f, 11.900001f, 34.099995f, 12.700001f, 33.099995f);
generalPath.curveTo(13.400001f, 32.199993f, 14.6f, 31.799995f, 15.800001f, 31.899994f);
generalPath.curveTo(16.500002f, 31.899994f, 17.2f, 32.199993f, 17.7f, 32.799995f);
generalPath.curveTo(18.0f, 33.299995f, 18.1f, 33.899994f, 17.900002f, 34.499996f);
generalPath.curveTo(17.7f, 34.999996f, 17.300001f, 35.399998f, 16.900002f, 35.699997f);
generalPath.curveTo(17.100002f, 35.399998f, 17.2f, 34.899998f, 17.000002f, 34.499996f);
generalPath.curveTo(16.700003f, 34.099995f, 16.100002f, 33.899998f, 15.600002f, 34.299995f);
generalPath.curveTo(15.500002f, 34.299995f, 15.500002f, 34.399994f, 15.4000025f, 34.399994f);
generalPath.curveTo(14.9000025f, 34.999992f, 14.800002f, 35.699993f, 15.200003f, 36.399994f);
generalPath.curveTo(15.600002f, 37.099995f, 16.300003f, 37.499992f, 17.000002f, 37.599995f);
generalPath.curveTo(18.100002f, 37.599995f, 19.100002f, 37.099995f, 19.900002f, 36.399994f);
generalPath.curveTo(21.500002f, 34.799995f, 23.2f, 33.399994f, 24.900002f, 32.099995f);
generalPath.curveTo(26.7f, 30.999994f, 28.500002f, 30.399994f, 30.400002f, 30.299995f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 42.487998962402344), new Point2D.Double(37.0, 30.31100082397461), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
	private ext_hbs() {
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
       ext_hbs base = new ext_hbs();
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
       ext_hbs base = new ext_hbs();
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
        return ext_hbs::new;
    }
}

