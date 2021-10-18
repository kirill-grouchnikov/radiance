package org.pushingpixels.radiance.demo.laf.main.check.svg.filetypes;

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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_vcs implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 98.899994f);
generalPath.lineTo(-0.19999695f, 98.899994f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 3.0959999561309814), new Point2D.Double(35.75, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 98.899994f);
generalPath.lineTo(-0.19999695f, 98.899994f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 98.899994f);
generalPath.lineTo(-0.19999695f, 98.899994f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
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
generalPath.moveTo(0.7f, 63.6f);
generalPath.lineTo(70.899994f, 63.6f);
generalPath.lineTo(70.899994f, 97.899994f);
generalPath.lineTo(0.7f, 97.899994f);
generalPath.lineTo(0.7f, 63.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.849998474121094, 4.085000038146973), new Point2D.Double(35.849998474121094, 38.441001892089844), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 65, 54, 255)) : new Color(239, 65, 54, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 30, 45, 255)) : new Color(190, 30, 45, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(14.6f, 90.1f);
generalPath.lineTo(7.4f, 70.3f);
generalPath.lineTo(11.8f, 70.3f);
generalPath.lineTo(16.9f, 85.0f);
generalPath.lineTo(21.8f, 70.3f);
generalPath.lineTo(26.099998f, 70.3f);
generalPath.lineTo(18.899998f, 90.100006f);
generalPath.lineTo(14.5999975f, 90.100006f);
generalPath.closePath();
generalPath.moveTo(40.9f, 82.799995f);
generalPath.lineTo(44.800003f, 83.99999f);
generalPath.curveTo(44.200005f, 86.19999f, 43.200005f, 87.799995f, 41.800003f, 88.799995f);
generalPath.curveTo(40.4f, 89.899994f, 38.600002f, 90.399994f, 36.500004f, 90.399994f);
generalPath.curveTo(33.800003f, 90.399994f, 31.700005f, 89.49999f, 29.900003f, 87.7f);
generalPath.curveTo(28.200003f, 85.899994f, 27.300003f, 83.399994f, 27.300003f, 80.299995f);
generalPath.curveTo(27.300003f, 76.99999f, 28.200003f, 74.399994f, 29.900003f, 72.6f);
generalPath.curveTo(31.600004f, 70.8f, 33.9f, 69.9f, 36.700005f, 69.9f);
generalPath.curveTo(39.200005f, 69.9f, 41.100006f, 70.6f, 42.700005f, 72.0f);
generalPath.curveTo(43.600006f, 72.8f, 44.300003f, 74.1f, 44.800003f, 75.7f);
generalPath.lineTo(40.800003f, 76.6f);
generalPath.curveTo(40.600002f, 75.6f, 40.100002f, 74.799995f, 39.300003f, 74.2f);
generalPath.curveTo(38.500004f, 73.6f, 37.600002f, 73.299995f, 36.600002f, 73.299995f);
generalPath.curveTo(35.100002f, 73.299995f, 33.9f, 73.799995f, 33.000004f, 74.899994f);
generalPath.curveTo(32.000004f, 75.99999f, 31.600004f, 77.7f, 31.600004f, 79.99999f);
generalPath.curveTo(31.600004f, 82.49999f, 32.100006f, 84.299995f, 33.000004f, 85.399994f);
generalPath.curveTo(33.900005f, 86.49999f, 35.100002f, 86.99999f, 36.600002f, 86.99999f);
generalPath.curveTo(37.7f, 86.99999f, 38.600002f, 86.69999f, 39.4f, 85.99999f);
generalPath.curveTo(40.0f, 85.299995f, 40.600002f, 84.19999f, 40.9f, 82.799995f);
generalPath.closePath();
generalPath.moveTo(47.300003f, 83.6f);
generalPath.lineTo(51.200005f, 83.2f);
generalPath.curveTo(51.400005f, 84.5f, 51.900005f, 85.5f, 52.600006f, 86.1f);
generalPath.curveTo(53.300007f, 86.7f, 54.300007f, 87.0f, 55.500008f, 87.0f);
generalPath.curveTo(56.800007f, 87.0f, 57.800007f, 86.7f, 58.40001f, 86.2f);
generalPath.curveTo(59.10001f, 85.7f, 59.40001f, 85.0f, 59.40001f, 84.299995f);
generalPath.curveTo(59.40001f, 83.799995f, 59.30001f, 83.399994f, 59.000008f, 83.1f);
generalPath.curveTo(58.70001f, 82.799995f, 58.20001f, 82.5f, 57.500008f, 82.2f);
generalPath.curveTo(57.000008f, 82.0f, 55.90001f, 81.7f, 54.300007f, 81.299995f);
generalPath.curveTo(52.100006f, 80.799995f, 50.600006f, 80.1f, 49.70001f, 79.299995f);
generalPath.curveTo(48.500008f, 78.2f, 47.90001f, 76.899994f, 47.90001f, 75.299995f);
generalPath.curveTo(47.90001f, 74.299995f, 48.20001f, 73.299995f, 48.80001f, 72.49999f);
generalPath.curveTo(49.40001f, 71.59999f, 50.200012f, 70.99999f, 51.30001f, 70.49999f);
generalPath.curveTo(52.40001f, 69.99999f, 53.700012f, 69.799995f, 55.200012f, 69.799995f);
generalPath.curveTo(57.700012f, 69.799995f, 59.600014f, 70.299995f, 60.900013f, 71.399994f);
generalPath.curveTo(62.200012f, 72.49999f, 62.800014f, 73.899994f, 62.900013f, 75.799995f);
generalPath.lineTo(58.900013f, 75.99999f);
generalPath.curveTo(58.700012f, 74.99999f, 58.400013f, 74.19999f, 57.800014f, 73.799995f);
generalPath.curveTo(57.200016f, 73.399994f, 56.400013f, 73.1f, 55.200016f, 73.1f);
generalPath.curveTo(54.000015f, 73.1f, 53.100018f, 73.299995f, 52.400017f, 73.799995f);
generalPath.curveTo(52.000015f, 74.1f, 51.80002f, 74.49999f, 51.80002f, 74.99999f);
generalPath.curveTo(51.80002f, 75.49999f, 52.00002f, 75.899994f, 52.400017f, 76.19999f);
generalPath.curveTo(52.900017f, 76.59999f, 54.200016f, 77.09999f, 56.100018f, 77.49999f);
generalPath.curveTo(58.00002f, 77.899994f, 59.50002f, 78.399994f, 60.50002f, 78.899994f);
generalPath.curveTo(61.40002f, 79.399994f, 62.20002f, 80.09999f, 62.70002f, 80.899994f);
generalPath.curveTo(63.20002f, 81.799995f, 63.50002f, 82.799995f, 63.50002f, 84.09999f);
generalPath.curveTo(63.50002f, 85.19999f, 63.20002f, 86.29999f, 62.50002f, 87.29999f);
generalPath.curveTo(61.90002f, 88.29999f, 61.00002f, 88.999985f, 59.80002f, 89.499985f);
generalPath.curveTo(58.600018f, 89.999985f, 57.20002f, 90.19998f, 55.400017f, 90.19998f);
generalPath.curveTo(52.900017f, 90.19998f, 50.900017f, 89.59998f, 49.600018f, 88.499985f);
generalPath.curveTo(48.400017f, 87.499985f, 47.600018f, 85.79999f, 47.30002f, 83.59998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(18.2f, 54.4f);
generalPath.lineTo(18.2f, 48.2f);
generalPath.lineTo(25.400002f, 48.2f);
generalPath.lineTo(25.400002f, 54.4f);
generalPath.lineTo(18.2f, 54.4f);
generalPath.closePath();
generalPath.moveTo(27.0f, 54.4f);
generalPath.lineTo(27.0f, 48.2f);
generalPath.lineTo(35.0f, 48.2f);
generalPath.lineTo(35.0f, 54.4f);
generalPath.lineTo(27.0f, 54.4f);
generalPath.closePath();
generalPath.moveTo(18.2f, 46.800003f);
generalPath.lineTo(18.2f, 39.9f);
generalPath.lineTo(25.400002f, 39.9f);
generalPath.lineTo(25.400002f, 46.800003f);
generalPath.lineTo(18.2f, 46.800003f);
generalPath.closePath();
generalPath.moveTo(27.0f, 46.800003f);
generalPath.lineTo(27.0f, 39.9f);
generalPath.lineTo(35.0f, 39.9f);
generalPath.lineTo(35.0f, 46.800003f);
generalPath.lineTo(27.0f, 46.800003f);
generalPath.closePath();
generalPath.moveTo(18.2f, 38.500004f);
generalPath.lineTo(18.2f, 32.300003f);
generalPath.lineTo(25.400002f, 32.300003f);
generalPath.lineTo(25.400002f, 38.500004f);
generalPath.lineTo(18.2f, 38.500004f);
generalPath.closePath();
generalPath.moveTo(36.6f, 54.4f);
generalPath.lineTo(36.6f, 48.2f);
generalPath.lineTo(44.6f, 48.2f);
generalPath.lineTo(44.6f, 54.4f);
generalPath.lineTo(36.6f, 54.4f);
generalPath.closePath();
generalPath.moveTo(27.0f, 38.5f);
generalPath.lineTo(27.0f, 32.3f);
generalPath.lineTo(35.0f, 32.3f);
generalPath.lineTo(35.0f, 38.5f);
generalPath.lineTo(27.0f, 38.5f);
generalPath.closePath();
generalPath.moveTo(46.2f, 54.4f);
generalPath.lineTo(46.2f, 48.2f);
generalPath.lineTo(53.4f, 48.2f);
generalPath.lineTo(53.4f, 54.4f);
generalPath.lineTo(46.2f, 54.4f);
generalPath.closePath();
generalPath.moveTo(36.6f, 46.800003f);
generalPath.lineTo(36.6f, 39.9f);
generalPath.lineTo(44.6f, 39.9f);
generalPath.lineTo(44.6f, 46.800003f);
generalPath.lineTo(36.6f, 46.800003f);
generalPath.closePath();
generalPath.moveTo(27.8f, 28.100002f);
generalPath.curveTo(27.8f, 28.500002f, 27.4f, 28.800003f, 27.0f, 28.800003f);
generalPath.lineTo(25.4f, 28.800003f);
generalPath.curveTo(25.0f, 28.800003f, 24.6f, 28.500004f, 24.6f, 28.100002f);
generalPath.lineTo(24.6f, 21.900002f);
generalPath.curveTo(24.6f, 21.500002f, 25.0f, 21.2f, 25.4f, 21.2f);
generalPath.lineTo(27.0f, 21.2f);
generalPath.curveTo(27.4f, 21.2f, 27.8f, 21.5f, 27.8f, 21.900002f);
generalPath.lineTo(27.8f, 28.100002f);
generalPath.closePath();
generalPath.moveTo(46.199997f, 46.800003f);
generalPath.lineTo(46.199997f, 39.9f);
generalPath.lineTo(53.399998f, 39.9f);
generalPath.lineTo(53.399998f, 46.800003f);
generalPath.lineTo(46.199997f, 46.800003f);
generalPath.closePath();
generalPath.moveTo(36.6f, 38.500004f);
generalPath.lineTo(36.6f, 32.300003f);
generalPath.lineTo(44.6f, 32.300003f);
generalPath.lineTo(44.6f, 38.500004f);
generalPath.lineTo(36.6f, 38.500004f);
generalPath.closePath();
generalPath.moveTo(46.199997f, 38.500004f);
generalPath.lineTo(46.199997f, 32.300003f);
generalPath.lineTo(53.399998f, 32.300003f);
generalPath.lineTo(53.399998f, 38.500004f);
generalPath.lineTo(46.199997f, 38.500004f);
generalPath.closePath();
generalPath.moveTo(46.999996f, 28.100004f);
generalPath.curveTo(46.999996f, 28.500004f, 46.599995f, 28.800005f, 46.199997f, 28.800005f);
generalPath.lineTo(44.6f, 28.800005f);
generalPath.curveTo(44.199997f, 28.800005f, 43.8f, 28.500006f, 43.8f, 28.100004f);
generalPath.lineTo(43.8f, 21.900005f);
generalPath.curveTo(43.8f, 21.500006f, 44.2f, 21.200005f, 44.6f, 21.200005f);
generalPath.lineTo(46.199997f, 21.200005f);
generalPath.curveTo(46.6f, 21.200005f, 46.999996f, 21.500004f, 46.999996f, 21.900005f);
generalPath.lineTo(46.999996f, 28.100006f);
generalPath.closePath();
generalPath.moveTo(56.6f, 26.700005f);
generalPath.curveTo(56.6f, 25.200005f, 55.199997f, 23.900005f, 53.399998f, 23.900005f);
generalPath.lineTo(50.199997f, 23.900005f);
generalPath.lineTo(50.199997f, 21.800005f);
generalPath.curveTo(50.199997f, 19.900005f, 48.399998f, 18.300005f, 46.199997f, 18.300005f);
generalPath.lineTo(44.6f, 18.300005f);
generalPath.curveTo(42.399998f, 18.300005f, 40.6f, 19.900005f, 40.6f, 21.800005f);
generalPath.lineTo(40.6f, 23.900005f);
generalPath.lineTo(31.0f, 23.900005f);
generalPath.lineTo(31.0f, 21.800005f);
generalPath.curveTo(31.0f, 19.900005f, 29.2f, 18.300005f, 27.0f, 18.300005f);
generalPath.lineTo(25.4f, 18.300005f);
generalPath.curveTo(23.199999f, 18.300005f, 21.4f, 19.900005f, 21.4f, 21.800005f);
generalPath.lineTo(21.4f, 23.900005f);
generalPath.lineTo(18.199999f, 23.900005f);
generalPath.curveTo(16.499998f, 23.900005f, 14.999999f, 25.200005f, 14.999999f, 26.700005f);
generalPath.lineTo(14.999999f, 54.400005f);
generalPath.curveTo(14.999999f, 55.900005f, 16.4f, 57.200005f, 18.199999f, 57.200005f);
generalPath.lineTo(53.299995f, 57.200005f);
generalPath.curveTo(54.999996f, 57.200005f, 56.499996f, 55.900005f, 56.499996f, 54.400005f);
generalPath.lineTo(56.499996f, 26.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(1025.800048828125, 947.9450073242188), new Point2D.Double(1025.800048828125, 986.7000122070312), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(135, 156, 168, 255)) : new Color(135, 156, 168, 255)),((colorFilter != null) ? colorFilter.filter(new Color(77, 106, 120, 255)) : new Color(77, 106, 120, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -990.0f, 1005.1110229492188f));
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(44.800003f, 27.7f);
generalPath.lineTo(44.800003f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.82500076293945, 74.2239990234375), new Point2D.Double(58.32500076293945, 87.7239990234375), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(44.800003f, 27.7f);
generalPath.lineTo(44.800003f, 1.0f);
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(44.800003f, 27.7f);
generalPath.lineTo(44.800003f, 1.0f);
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
        return 0.12800002098083496;
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
		return 0.9990000128746033;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_vcs() {
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
    public static RadianceIcon of(int width, int height) {
       ext_vcs base = new ext_vcs();
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
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       ext_vcs base = new ext_vcs();
       base.width = width;
       base.height = height;
       return new RadianceIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_vcs::new;
    }
}

