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
public class ext_coffee implements NeonIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.0), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 74.18699645996094), new Point2D.Double(58.5369987487793, 87.68699645996094), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(12.8f, 87.8f);
generalPath.lineTo(15.0f, 88.5f);
generalPath.curveTo(14.7f, 89.7f, 14.1f, 90.6f, 13.3f, 91.2f);
generalPath.curveTo(12.5f, 91.799995f, 11.5f, 92.1f, 10.4f, 92.1f);
generalPath.curveTo(8.9f, 92.1f, 7.7f, 91.6f, 6.7999997f, 90.6f);
generalPath.curveTo(5.8999996f, 89.6f, 5.3999996f, 88.2f, 5.3999996f, 86.5f);
generalPath.curveTo(5.3999996f, 84.7f, 5.8999996f, 83.2f, 6.7999997f, 82.2f);
generalPath.curveTo(7.7f, 81.2f, 9.0f, 80.7f, 10.599999f, 80.7f);
generalPath.curveTo(11.999999f, 80.7f, 13.099999f, 81.1f, 13.9f, 81.899994f);
generalPath.curveTo(14.4f, 82.399994f, 14.799999f, 83.09999f, 15.0f, 83.899994f);
generalPath.lineTo(12.8f, 84.399994f);
generalPath.curveTo(12.7f, 83.799995f, 12.400001f, 83.399994f, 12.0f, 82.99999f);
generalPath.curveTo(11.6f, 82.69999f, 11.1f, 82.49999f, 10.5f, 82.49999f);
generalPath.curveTo(9.7f, 82.49999f, 9.0f, 82.799995f, 8.5f, 83.399994f);
generalPath.curveTo(8.0f, 83.99999f, 7.7f, 84.899994f, 7.7f, 86.299995f);
generalPath.curveTo(7.7f, 87.7f, 8.0f, 88.7f, 8.5f, 89.299995f);
generalPath.curveTo(9.0f, 89.899994f, 9.7f, 90.2f, 10.5f, 90.2f);
generalPath.curveTo(11.1f, 90.2f, 11.6f, 90.0f, 12.0f, 89.6f);
generalPath.curveTo(12.3f, 89.2f, 12.6f, 88.6f, 12.8f, 87.799995f);
generalPath.closePath();
generalPath.moveTo(16.4f, 86.4f);
generalPath.curveTo(16.4f, 85.3f, 16.6f, 84.3f, 16.9f, 83.6f);
generalPath.curveTo(17.199999f, 83.0f, 17.5f, 82.5f, 17.9f, 82.1f);
generalPath.curveTo(18.3f, 81.7f, 18.8f, 81.299995f, 19.3f, 81.1f);
generalPath.curveTo(20.0f, 80.799995f, 20.8f, 80.7f, 21.699999f, 80.7f);
generalPath.curveTo(23.3f, 80.7f, 24.599998f, 81.2f, 25.599998f, 82.2f);
generalPath.curveTo(26.599998f, 83.2f, 27.099998f, 84.6f, 27.099998f, 86.399994f);
generalPath.curveTo(27.099998f, 88.2f, 26.599998f, 89.59999f, 25.599998f, 90.59999f);
generalPath.curveTo(24.599998f, 91.59999f, 23.3f, 92.09999f, 21.699999f, 92.09999f);
generalPath.curveTo(19.999998f, 92.09999f, 18.699999f, 91.59999f, 17.8f, 90.59999f);
generalPath.curveTo(16.9f, 89.59999f, 16.4f, 88.19999f, 16.4f, 86.399994f);
generalPath.closePath();
generalPath.moveTo(18.699999f, 86.3f);
generalPath.curveTo(18.699999f, 87.600006f, 18.999998f, 88.5f, 19.599998f, 89.200005f);
generalPath.curveTo(20.199999f, 89.8f, 20.899998f, 90.200005f, 21.8f, 90.200005f);
generalPath.curveTo(22.699999f, 90.200005f, 23.4f, 89.9f, 24.0f, 89.200005f);
generalPath.curveTo(24.6f, 88.50001f, 24.9f, 87.600006f, 24.9f, 86.3f);
generalPath.curveTo(24.9f, 85.0f, 24.6f, 84.100006f, 24.1f, 83.5f);
generalPath.curveTo(23.5f, 82.9f, 22.800001f, 82.6f, 21.9f, 82.6f);
generalPath.curveTo(21.0f, 82.6f, 20.199999f, 82.9f, 19.699999f, 83.5f);
generalPath.curveTo(18.999998f, 84.1f, 18.699999f, 85.1f, 18.699999f, 86.3f);
generalPath.closePath();
generalPath.moveTo(29.0f, 91.9f);
generalPath.lineTo(29.0f, 80.8f);
generalPath.lineTo(36.6f, 80.8f);
generalPath.lineTo(36.6f, 82.700005f);
generalPath.lineTo(31.199999f, 82.700005f);
generalPath.lineTo(31.199999f, 85.3f);
generalPath.lineTo(35.8f, 85.3f);
generalPath.lineTo(35.8f, 87.200005f);
generalPath.lineTo(31.199999f, 87.200005f);
generalPath.lineTo(31.199999f, 91.9f);
generalPath.lineTo(29.0f, 91.9f);
generalPath.closePath();
generalPath.moveTo(38.4f, 91.9f);
generalPath.lineTo(38.4f, 80.8f);
generalPath.lineTo(46.0f, 80.8f);
generalPath.lineTo(46.0f, 82.700005f);
generalPath.lineTo(40.6f, 82.700005f);
generalPath.lineTo(40.6f, 85.3f);
generalPath.lineTo(45.199997f, 85.3f);
generalPath.lineTo(45.199997f, 87.200005f);
generalPath.lineTo(40.6f, 87.200005f);
generalPath.lineTo(40.6f, 91.9f);
generalPath.lineTo(38.399998f, 91.9f);
generalPath.closePath();
generalPath.moveTo(47.9f, 91.9f);
generalPath.lineTo(47.9f, 80.8f);
generalPath.lineTo(56.100002f, 80.8f);
generalPath.lineTo(56.100002f, 82.700005f);
generalPath.lineTo(50.100002f, 82.700005f);
generalPath.lineTo(50.100002f, 85.200005f);
generalPath.lineTo(55.7f, 85.200005f);
generalPath.lineTo(55.7f, 87.0f);
generalPath.lineTo(50.100002f, 87.0f);
generalPath.lineTo(50.100002f, 90.0f);
generalPath.lineTo(56.300003f, 90.0f);
generalPath.lineTo(56.300003f, 91.9f);
generalPath.lineTo(47.9f, 91.9f);
generalPath.closePath();
generalPath.moveTo(58.2f, 91.9f);
generalPath.lineTo(58.2f, 80.8f);
generalPath.lineTo(66.4f, 80.8f);
generalPath.lineTo(66.4f, 82.700005f);
generalPath.lineTo(60.4f, 82.700005f);
generalPath.lineTo(60.4f, 85.200005f);
generalPath.lineTo(66.0f, 85.200005f);
generalPath.lineTo(66.0f, 87.0f);
generalPath.lineTo(60.4f, 87.0f);
generalPath.lineTo(60.4f, 90.0f);
generalPath.lineTo(66.6f, 90.0f);
generalPath.lineTo(66.6f, 91.9f);
generalPath.lineTo(58.199997f, 91.9f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
generalPath.moveTo(31.0f, 37.6f);
generalPath.curveTo(35.2f, 37.199997f, 36.4f, 34.6f, 41.2f, 34.1f);
generalPath.curveTo(43.600002f, 33.899998f, 45.100002f, 34.399998f, 45.3f, 35.199997f);
generalPath.curveTo(45.399998f, 35.999996f, 44.3f, 36.499996f, 42.8f, 36.6f);
generalPath.curveTo(40.8f, 36.8f, 39.899998f, 36.1f, 39.8f, 35.399998f);
generalPath.curveTo(38.3f, 35.499996f, 38.1f, 36.199997f, 38.2f, 36.6f);
generalPath.curveTo(38.3f, 37.5f, 40.2f, 38.3f, 43.2f, 38.0f);
generalPath.curveTo(46.7f, 37.7f, 47.8f, 36.4f, 47.600002f, 35.0f);
generalPath.curveTo(47.2f, 33.2f, 44.600002f, 31.7f, 39.7f, 32.1f);
generalPath.curveTo(33.5f, 32.699997f, 33.600002f, 35.5f, 29.400002f, 35.8f);
generalPath.curveTo(27.7f, 35.899998f, 26.7f, 35.6f, 26.500002f, 34.899998f);
generalPath.curveTo(26.400002f, 34.199997f, 27.200003f, 33.899998f, 28.200003f, 33.8f);
generalPath.curveTo(29.100002f, 33.7f, 30.200003f, 33.899998f, 30.800003f, 34.2f);
generalPath.curveTo(31.200003f, 34.0f, 31.300003f, 33.8f, 31.300003f, 33.600002f);
generalPath.curveTo(31.200003f, 33.000004f, 29.900003f, 32.7f, 28.300003f, 32.800003f);
generalPath.curveTo(25.200003f, 33.100002f, 25.200003f, 34.500004f, 25.300003f, 35.100002f);
generalPath.curveTo(25.600002f, 36.800003f, 28.000004f, 37.9f, 31.000004f, 37.600002f);
generalPath.closePath();
generalPath.moveTo(51.9f, 44.699997f);
generalPath.curveTo(48.0f, 45.6f, 43.100002f, 46.199997f, 37.2f, 46.199997f);
generalPath.curveTo(31.2f, 46.199997f, 26.2f, 45.6f, 22.400002f, 44.699997f);
generalPath.curveTo(19.000002f, 43.799995f, 17.100002f, 42.799995f, 16.500002f, 41.799995f);
generalPath.curveTo(16.800001f, 43.999996f, 17.400002f, 46.199997f, 18.100002f, 48.299995f);
generalPath.curveTo(17.200003f, 48.799995f, 16.400002f, 49.499996f, 15.700003f, 50.399994f);
generalPath.curveTo(14.300003f, 52.099995f, 13.700003f, 54.099995f, 13.800003f, 56.099995f);
generalPath.curveTo(13.900003f, 58.099995f, 14.900003f, 59.699993f, 16.400003f, 60.899994f);
generalPath.curveTo(18.000004f, 62.099995f, 19.700003f, 62.499992f, 21.700005f, 62.099995f);
generalPath.curveTo(22.400005f, 61.999996f, 23.300005f, 61.599995f, 24.100004f, 61.399994f);
generalPath.curveTo(22.500004f, 61.399994f, 21.100004f, 60.899994f, 19.800003f, 59.799995f);
generalPath.curveTo(18.300003f, 58.699997f, 17.300003f, 57.199997f, 17.100002f, 55.399994f);
generalPath.curveTo(16.700003f, 53.699993f, 17.100002f, 52.099995f, 18.100002f, 50.699993f);
generalPath.curveTo(18.300003f, 50.399994f, 18.500002f, 50.199993f, 18.800003f, 49.999992f);
generalPath.curveTo(19.300003f, 51.399994f, 20.000004f, 52.59999f, 20.700003f, 53.899994f);
generalPath.curveTo(22.200003f, 56.099995f, 23.700003f, 58.099995f, 25.100002f, 60.199993f);
generalPath.curveTo(25.700003f, 61.399994f, 26.200003f, 62.699993f, 26.500002f, 63.899994f);
generalPath.curveTo(27.500002f, 65.299995f, 28.900002f, 66.2f, 30.600002f, 66.7f);
generalPath.curveTo(32.7f, 67.399994f, 34.9f, 67.7f, 37.2f, 67.7f);
generalPath.lineTo(37.4f, 67.7f);
generalPath.curveTo(39.600002f, 67.7f, 42.0f, 67.299995f, 44.2f, 66.6f);
generalPath.curveTo(45.8f, 66.1f, 47.2f, 65.2f, 48.2f, 63.699997f);
generalPath.lineTo(48.3f, 63.699997f);
generalPath.curveTo(48.5f, 62.6f, 48.899998f, 61.299995f, 49.5f, 59.999996f);
generalPath.curveTo(51.0f, 57.899998f, 52.5f, 55.899998f, 53.9f, 53.699997f);
generalPath.curveTo(55.9f, 50.1f, 57.2f, 46.1f, 58.0f, 41.699997f);
generalPath.curveTo(57.1f, 42.899998f, 55.2f, 43.899998f, 51.9f, 44.699997f);
generalPath.closePath();
generalPath.moveTo(22.300001f, 41.6f);
generalPath.curveTo(26.2f, 42.6f, 31.100002f, 43.1f, 37.0f, 43.1f);
generalPath.curveTo(43.0f, 43.1f, 47.9f, 42.6f, 51.7f, 41.6f);
generalPath.curveTo(55.8f, 40.6f, 57.7f, 39.399998f, 57.7f, 38.199997f);
generalPath.curveTo(57.7f, 37.299995f, 56.8f, 36.499996f, 55.2f, 35.799995f);
generalPath.curveTo(55.600002f, 35.999996f, 55.8f, 36.399994f, 55.8f, 36.899994f);
generalPath.curveTo(55.8f, 38.099995f, 53.899998f, 39.099995f, 50.2f, 39.999992f);
generalPath.curveTo(46.8f, 40.699993f, 42.3f, 41.29999f, 37.0f, 41.29999f);
generalPath.curveTo(31.8f, 41.29999f, 27.2f, 40.79999f, 23.9f, 40.09999f);
generalPath.curveTo(20.3f, 39.19999f, 18.4f, 38.19999f, 18.4f, 36.999992f);
generalPath.curveTo(18.4f, 36.499992f, 18.6f, 35.999992f, 19.4f, 35.499992f);
generalPath.curveTo(17.199999f, 36.399994f, 16.0f, 37.09999f, 16.0f, 38.199993f);
generalPath.curveTo(16.2f, 39.399994f, 18.2f, 40.699993f, 22.3f, 41.599995f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.89500045776367, 32.202999114990234), new Point2D.Double(35.89500045776367, 67.86799621582031), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
	private ext_coffee() {
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
       ext_coffee base = new ext_coffee();
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
       ext_coffee base = new ext_coffee();
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
        return ext_coffee::new;
    }
}

