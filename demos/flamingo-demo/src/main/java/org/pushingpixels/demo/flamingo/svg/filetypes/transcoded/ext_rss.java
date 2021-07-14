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
public class ext_rss implements NeonIcon {
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
// _0_3
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
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(10.2f, 91.5f);
generalPath.lineTo(10.2f, 72.2f);
generalPath.lineTo(18.5f, 72.2f);
generalPath.curveTo(20.6f, 72.2f, 22.1f, 72.399994f, 23.0f, 72.7f);
generalPath.curveTo(23.9f, 73.0f, 24.7f, 73.7f, 25.3f, 74.6f);
generalPath.curveTo(25.899998f, 75.5f, 26.199999f, 76.5f, 26.199999f, 77.6f);
generalPath.curveTo(26.199999f, 79.0f, 25.8f, 80.2f, 24.9f, 81.2f);
generalPath.curveTo(24.0f, 82.2f, 22.7f, 82.8f, 21.0f, 83.0f);
generalPath.curveTo(21.9f, 83.5f, 22.6f, 84.0f, 23.1f, 84.6f);
generalPath.curveTo(23.7f, 85.2f, 24.4f, 86.2f, 25.300001f, 87.7f);
generalPath.lineTo(27.7f, 91.5f);
generalPath.lineTo(23.0f, 91.5f);
generalPath.lineTo(20.1f, 87.3f);
generalPath.curveTo(19.1f, 85.8f, 18.4f, 84.8f, 18.0f, 84.5f);
generalPath.curveTo(17.6f, 84.1f, 17.2f, 83.8f, 16.8f, 83.7f);
generalPath.curveTo(16.4f, 83.6f, 15.699999f, 83.5f, 14.799999f, 83.5f);
generalPath.lineTo(14.0f, 83.5f);
generalPath.lineTo(14.0f, 91.6f);
generalPath.lineTo(10.2f, 91.6f);
generalPath.closePath();
generalPath.moveTo(14.1f, 80.4f);
generalPath.lineTo(17.0f, 80.4f);
generalPath.curveTo(18.9f, 80.4f, 20.1f, 80.3f, 20.5f, 80.200005f);
generalPath.curveTo(20.9f, 80.100006f, 21.3f, 79.8f, 21.6f, 79.4f);
generalPath.curveTo(21.9f, 79.0f, 22.0f, 78.5f, 22.0f, 77.9f);
generalPath.curveTo(22.0f, 77.200005f, 21.8f, 76.700005f, 21.5f, 76.3f);
generalPath.curveTo(21.1f, 75.9f, 20.7f, 75.600006f, 20.0f, 75.5f);
generalPath.curveTo(19.7f, 75.5f, 18.7f, 75.4f, 17.1f, 75.4f);
generalPath.lineTo(14.0f, 75.4f);
generalPath.lineTo(14.0f, 80.4f);
generalPath.closePath();
generalPath.moveTo(28.900002f, 85.3f);
generalPath.lineTo(32.7f, 84.9f);
generalPath.curveTo(32.9f, 86.200005f, 33.4f, 87.1f, 34.100002f, 87.700005f);
generalPath.curveTo(34.800003f, 88.3f, 35.800003f, 88.600006f, 37.000004f, 88.600006f);
generalPath.curveTo(38.300003f, 88.600006f, 39.200005f, 88.3f, 39.900005f, 87.8f);
generalPath.curveTo(40.500004f, 87.3f, 40.900005f, 86.600006f, 40.900005f, 85.9f);
generalPath.curveTo(40.900005f, 85.4f, 40.800007f, 85.1f, 40.500004f, 84.700005f);
generalPath.curveTo(40.200005f, 84.4f, 39.800003f, 84.100006f, 39.100002f, 83.9f);
generalPath.curveTo(38.600002f, 83.700005f, 37.600002f, 83.5f, 35.9f, 83.1f);
generalPath.curveTo(33.800003f, 82.6f, 32.300003f, 81.9f, 31.500002f, 81.2f);
generalPath.curveTo(30.300001f, 80.1f, 29.700003f, 78.799995f, 29.700003f, 77.299995f);
generalPath.curveTo(29.700003f, 76.299995f, 30.000002f, 75.399994f, 30.500002f, 74.49999f);
generalPath.curveTo(31.100002f, 73.59999f, 31.900002f, 72.99999f, 32.9f, 72.49999f);
generalPath.curveTo(33.9f, 71.99999f, 35.2f, 71.799995f, 36.7f, 71.799995f);
generalPath.curveTo(39.2f, 71.799995f, 41.0f, 72.299995f, 42.2f, 73.399994f);
generalPath.curveTo(43.4f, 74.49999f, 44.100002f, 75.899994f, 44.2f, 77.7f);
generalPath.lineTo(40.3f, 77.899994f);
generalPath.curveTo(40.1f, 76.899994f, 39.8f, 76.2f, 39.2f, 75.799995f);
generalPath.curveTo(38.600002f, 75.399994f, 37.8f, 75.1f, 36.7f, 75.1f);
generalPath.curveTo(35.600002f, 75.1f, 34.7f, 75.299995f, 34.0f, 75.799995f);
generalPath.curveTo(33.6f, 76.1f, 33.4f, 76.49999f, 33.4f, 76.99999f);
generalPath.curveTo(33.4f, 77.49999f, 33.600002f, 77.799995f, 34.0f, 78.19999f);
generalPath.curveTo(34.5f, 78.59999f, 35.7f, 78.99999f, 37.6f, 79.49999f);
generalPath.curveTo(39.5f, 79.899994f, 40.899998f, 80.399994f, 41.899998f, 80.899994f);
generalPath.curveTo(42.8f, 81.399994f, 43.499996f, 81.99999f, 44.1f, 82.899994f);
generalPath.curveTo(44.6f, 83.7f, 44.899998f, 84.799995f, 44.899998f, 85.99999f);
generalPath.curveTo(44.899998f, 87.09999f, 44.6f, 88.09999f, 43.999996f, 89.09999f);
generalPath.curveTo(43.399998f, 90.09999f, 42.499996f, 90.79999f, 41.399998f, 91.29999f);
generalPath.curveTo(40.3f, 91.79999f, 38.8f, 91.999985f, 37.199997f, 91.999985f);
generalPath.curveTo(34.699997f, 91.999985f, 32.799995f, 91.39999f, 31.499996f, 90.29999f);
generalPath.curveTo(29.899996f, 89.09999f, 29.099997f, 87.39999f, 28.899996f, 85.29999f);
generalPath.closePath();
generalPath.moveTo(47.100002f, 85.3f);
generalPath.lineTo(50.9f, 84.9f);
generalPath.curveTo(51.100002f, 86.200005f, 51.600002f, 87.1f, 52.300003f, 87.700005f);
generalPath.curveTo(53.000004f, 88.30001f, 54.000004f, 88.600006f, 55.200005f, 88.600006f);
generalPath.curveTo(56.500004f, 88.600006f, 57.400005f, 88.3f, 58.100006f, 87.8f);
generalPath.curveTo(58.700005f, 87.3f, 59.100006f, 86.600006f, 59.100006f, 85.9f);
generalPath.curveTo(59.100006f, 85.4f, 59.000008f, 85.1f, 58.700005f, 84.700005f);
generalPath.curveTo(58.400005f, 84.4f, 58.000004f, 84.100006f, 57.300003f, 83.9f);
generalPath.curveTo(56.800003f, 83.700005f, 55.800003f, 83.5f, 54.100002f, 83.1f);
generalPath.curveTo(52.000004f, 82.6f, 50.500004f, 81.9f, 49.7f, 81.2f);
generalPath.curveTo(48.5f, 80.1f, 47.9f, 78.799995f, 47.9f, 77.299995f);
generalPath.curveTo(47.9f, 76.299995f, 48.2f, 75.399994f, 48.7f, 74.49999f);
generalPath.curveTo(49.3f, 73.59999f, 50.100002f, 72.99999f, 51.100002f, 72.49999f);
generalPath.curveTo(52.2f, 72.09999f, 53.4f, 71.799995f, 54.9f, 71.799995f);
generalPath.curveTo(57.4f, 71.799995f, 59.2f, 72.299995f, 60.4f, 73.399994f);
generalPath.curveTo(61.600002f, 74.49999f, 62.300003f, 75.899994f, 62.4f, 77.7f);
generalPath.lineTo(58.5f, 77.899994f);
generalPath.curveTo(58.3f, 76.899994f, 58.0f, 76.2f, 57.4f, 75.799995f);
generalPath.curveTo(56.800003f, 75.399994f, 56.0f, 75.1f, 54.9f, 75.1f);
generalPath.curveTo(53.800003f, 75.1f, 52.9f, 75.299995f, 52.2f, 75.799995f);
generalPath.curveTo(51.8f, 76.1f, 51.600002f, 76.49999f, 51.600002f, 76.99999f);
generalPath.curveTo(51.600002f, 77.49999f, 51.800003f, 77.799995f, 52.2f, 78.19999f);
generalPath.curveTo(52.7f, 78.59999f, 53.9f, 78.99999f, 55.8f, 79.49999f);
generalPath.curveTo(57.7f, 79.899994f, 59.1f, 80.399994f, 60.1f, 80.899994f);
generalPath.curveTo(61.0f, 81.399994f, 61.699997f, 81.99999f, 62.3f, 82.899994f);
generalPath.curveTo(62.8f, 83.7f, 63.1f, 84.799995f, 63.1f, 85.99999f);
generalPath.curveTo(63.1f, 87.09999f, 62.8f, 88.09999f, 62.199997f, 89.09999f);
generalPath.curveTo(61.6f, 90.09999f, 60.699997f, 90.79999f, 59.6f, 91.29999f);
generalPath.curveTo(58.5f, 91.79999f, 57.0f, 91.999985f, 55.399998f, 91.999985f);
generalPath.curveTo(52.899998f, 91.999985f, 50.999996f, 91.39999f, 49.699997f, 90.29999f);
generalPath.curveTo(48.1f, 89.09999f, 47.299995f, 87.39999f, 47.1f, 85.29999f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.2f, 25.5f);
generalPath.curveTo(24.400002f, 25.5f, 27.6f, 25.9f, 30.6f, 26.8f);
generalPath.curveTo(33.6f, 27.699999f, 36.4f, 28.8f, 39.0f, 30.4f);
generalPath.curveTo(41.6f, 31.9f, 44.0f, 33.8f, 46.1f, 35.9f);
generalPath.curveTo(48.199997f, 38.0f, 50.1f, 40.4f, 51.6f, 43.0f);
generalPath.curveTo(53.1f, 45.6f, 54.3f, 48.4f, 55.199997f, 51.4f);
generalPath.curveTo(55.999996f, 54.4f, 56.499996f, 57.5f, 56.499996f, 60.800003f);
generalPath.curveTo(56.499996f, 61.800003f, 56.099995f, 62.700005f, 55.399998f, 63.4f);
generalPath.curveTo(54.699997f, 64.1f, 53.8f, 64.5f, 52.8f, 64.5f);
generalPath.curveTo(51.8f, 64.5f, 50.899998f, 64.1f, 50.2f, 63.4f);
generalPath.curveTo(49.5f, 62.7f, 49.100002f, 61.800003f, 49.100002f, 60.800003f);
generalPath.curveTo(49.100002f, 58.200005f, 48.800003f, 55.800003f, 48.100002f, 53.4f);
generalPath.curveTo(47.4f, 51.0f, 46.500004f, 48.800003f, 45.300003f, 46.7f);
generalPath.curveTo(44.100002f, 44.600002f, 42.600002f, 42.8f, 40.9f, 41.100002f);
generalPath.curveTo(39.2f, 39.4f, 37.300003f, 38.000004f, 35.300003f, 36.7f);
generalPath.curveTo(33.200005f, 35.5f, 31.000004f, 34.600002f, 28.600002f, 33.9f);
generalPath.curveTo(26.200003f, 33.2f, 23.800003f, 32.9f, 21.200003f, 32.9f);
generalPath.curveTo(20.200003f, 32.9f, 19.300003f, 32.5f, 18.600002f, 31.800001f);
generalPath.curveTo(17.900002f, 31.1f, 17.500002f, 30.2f, 17.500002f, 29.2f);
generalPath.curveTo(17.500002f, 28.2f, 17.900002f, 27.300001f, 18.600002f, 26.6f);
generalPath.curveTo(19.300003f, 25.9f, 20.200003f, 25.5f, 21.200003f, 25.5f);
generalPath.closePath();
generalPath.moveTo(21.2f, 39.5f);
generalPath.curveTo(24.1f, 39.5f, 26.900002f, 40.1f, 29.5f, 41.2f);
generalPath.curveTo(32.1f, 42.3f, 34.3f, 43.8f, 36.2f, 45.8f);
generalPath.curveTo(38.100002f, 47.7f, 39.600002f, 50.0f, 40.8f, 52.5f);
generalPath.curveTo(41.899998f, 55.1f, 42.5f, 57.8f, 42.5f, 60.8f);
generalPath.curveTo(42.5f, 61.8f, 42.1f, 62.7f, 41.4f, 63.399998f);
generalPath.curveTo(40.7f, 64.1f, 39.800003f, 64.5f, 38.800003f, 64.5f);
generalPath.curveTo(37.800003f, 64.5f, 36.9f, 64.1f, 36.200005f, 63.4f);
generalPath.curveTo(35.500004f, 62.7f, 35.100006f, 61.800003f, 35.100006f, 60.800003f);
generalPath.curveTo(35.100006f, 58.9f, 34.700005f, 57.100002f, 34.000008f, 55.4f);
generalPath.curveTo(33.300007f, 53.7f, 32.300007f, 52.300003f, 31.000008f, 51.0f);
generalPath.curveTo(29.700008f, 49.7f, 28.300007f, 48.8f, 26.600008f, 48.0f);
generalPath.curveTo(24.900007f, 47.3f, 23.100008f, 46.9f, 21.200008f, 46.9f);
generalPath.curveTo(20.200008f, 46.9f, 19.300009f, 46.5f, 18.600008f, 45.800003f);
generalPath.curveTo(17.900007f, 45.100002f, 17.500008f, 44.200005f, 17.500008f, 43.200005f);
generalPath.curveTo(17.500008f, 42.200005f, 17.900007f, 41.300003f, 18.600008f, 40.600006f);
generalPath.curveTo(19.300009f, 39.900005f, 20.200008f, 39.500008f, 21.200008f, 39.500008f);
generalPath.closePath();
generalPath.moveTo(28.0f, 59.0f);
generalPath.curveTo(28.0f, 59.7f, 27.9f, 60.4f, 27.6f, 61.0f);
generalPath.curveTo(27.300001f, 61.6f, 27.0f, 62.2f, 26.5f, 62.6f);
generalPath.curveTo(26.0f, 63.1f, 25.5f, 63.399998f, 24.8f, 63.699997f);
generalPath.curveTo(24.199999f, 63.999996f, 23.5f, 64.1f, 22.8f, 64.1f);
generalPath.curveTo(22.099998f, 64.1f, 21.4f, 64.0f, 20.8f, 63.699997f);
generalPath.curveTo(20.199999f, 63.399998f, 19.599998f, 63.1f, 19.199999f, 62.6f);
generalPath.curveTo(18.699999f, 62.1f, 18.4f, 61.6f, 18.099998f, 61.0f);
generalPath.curveTo(17.799997f, 60.4f, 17.699999f, 59.7f, 17.699999f, 59.0f);
generalPath.curveTo(17.699999f, 58.3f, 17.8f, 57.6f, 18.099998f, 57.0f);
generalPath.curveTo(18.399998f, 56.4f, 18.699999f, 55.8f, 19.199999f, 55.3f);
generalPath.curveTo(19.699999f, 54.8f, 20.199999f, 54.5f, 20.8f, 54.2f);
generalPath.curveTo(21.4f, 53.9f, 22.099998f, 53.8f, 22.8f, 53.8f);
generalPath.curveTo(23.5f, 53.8f, 24.199999f, 53.899998f, 24.8f, 54.2f);
generalPath.curveTo(25.4f, 54.5f, 26.0f, 54.8f, 26.5f, 55.3f);
generalPath.curveTo(27.0f, 55.8f, 27.3f, 56.3f, 27.6f, 57.0f);
generalPath.curveTo(27.9f, 57.7f, 28.0f, 58.3f, 28.0f, 59.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 64.5), new Point2D.Double(37.0, 25.5), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 185, 201, 255)) : new Color(154, 185, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(112, 143, 159, 255)) : new Color(112, 143, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(86, 118, 133, 255)) : new Color(86, 118, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_rss() {
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
       ext_rss base = new ext_rss();
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
       ext_rss base = new ext_rss();
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
        return ext_rss::new;
    }
}

