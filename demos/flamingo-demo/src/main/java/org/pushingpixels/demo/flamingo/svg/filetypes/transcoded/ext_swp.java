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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_swp implements ResizableIcon {
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(61.5, 53.4);
generalPath.curveTo(61.5, 51.4, 59.9, 49.800003, 57.9, 49.800003);
generalPath.lineTo(14.1, 49.800003);
generalPath.curveTo(12.1, 49.800003, 10.5, 51.4, 10.5, 53.4);
generalPath.lineTo(10.5, 58.4);
generalPath.curveTo(10.5, 60.4, 12.1, 62.0, 14.1, 62.0);
generalPath.lineTo(57.9, 62.0);
generalPath.curveTo(59.9, 62.0, 61.5, 60.4, 61.5, 58.4);
generalPath.lineTo(61.5, 53.4);
generalPath.closePath();
generalPath.moveTo(42.6, 57.9);
generalPath.curveTo(41.5, 57.9, 40.6, 57.0, 40.6, 55.9);
generalPath.curveTo(40.6, 54.800003, 41.5, 53.9, 42.6, 53.9);
generalPath.curveTo(43.699997, 53.9, 44.6, 54.800003, 44.6, 55.9);
generalPath.curveTo(44.699997, 57.0, 43.8, 57.9, 42.6, 57.9);
generalPath.closePath();
generalPath.moveTo(48.8, 57.9);
generalPath.curveTo(47.7, 57.9, 46.8, 57.0, 46.8, 55.9);
generalPath.curveTo(46.8, 54.800003, 47.7, 53.9, 48.8, 53.9);
generalPath.curveTo(49.899998, 53.9, 50.8, 54.800003, 50.8, 55.9);
generalPath.curveTo(50.8, 57.0, 49.899998, 57.9, 48.8, 57.9);
generalPath.closePath();
generalPath.moveTo(54.899998, 57.9);
generalPath.curveTo(53.8, 57.9, 52.899998, 57.0, 52.899998, 55.9);
generalPath.curveTo(52.899998, 54.800003, 53.8, 53.9, 54.899998, 53.9);
generalPath.curveTo(55.999996, 53.9, 56.899998, 54.800003, 56.899998, 55.9);
generalPath.curveTo(56.899998, 57.0, 55.999996, 57.9, 54.899998, 57.9);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(10.494999885559082, 55.8849983215332), new Point2D.Double(61.505001068115234, 55.8849983215332), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.1, 47.7);
generalPath.lineTo(57.9, 47.7);
generalPath.curveTo(58.9, 47.7, 59.800003, 48.0, 60.600002, 48.4);
generalPath.lineTo(56.4, 39.5);
generalPath.curveTo(55.2, 36.9, 53.300003, 35.9, 51.300003, 35.9);
generalPath.lineTo(46.500004, 35.9);
generalPath.lineTo(39.600002, 42.9);
generalPath.curveTo(39.100002, 43.4, 38.600002, 43.800003, 37.9, 44.100002);
generalPath.curveTo(37.300003, 44.4, 36.600002, 44.500004, 35.9, 44.500004);
generalPath.curveTo(35.2, 44.500004, 34.5, 44.400005, 33.9, 44.100002);
generalPath.lineTo(33.7, 44.100002);
generalPath.curveTo(33.2, 43.800003, 32.7, 43.500004, 32.2, 43.100002);
generalPath.lineTo(25.300001, 36.100002);
generalPath.lineTo(20.5, 36.100002);
generalPath.curveTo(18.5, 36.100002, 16.7, 37.2, 15.4, 39.7);
generalPath.lineTo(11.2, 48.6);
generalPath.curveTo(12.2, 48.0, 13.099999, 47.699997, 14.1, 47.699997);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(11.354000091552734, 42.19200134277344), new Point2D.Double(60.645999908447266, 42.19200134277344), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(46.2, 32.6);
generalPath.curveTo(46.4, 32.399998, 46.600002, 32.1, 46.8, 31.699999);
generalPath.curveTo(46.899998, 31.4, 47.0, 30.999998, 47.0, 30.699999);
generalPath.curveTo(47.0, 30.3, 46.9, 29.999998, 46.8, 29.699999);
generalPath.curveTo(46.7, 29.4, 46.5, 29.099998, 46.2, 28.9);
generalPath.curveTo(45.9, 28.6, 45.7, 28.4, 45.3, 28.3);
generalPath.curveTo(45.0, 28.199999, 44.7, 28.099998, 44.3, 28.099998);
generalPath.curveTo(43.899998, 28.099998, 43.6, 28.199999, 43.3, 28.3);
generalPath.lineTo(42.399998, 28.9);
generalPath.lineTo(38.499996, 32.9);
generalPath.lineTo(38.499996, 20.5);
generalPath.curveTo(38.499996, 20.1, 38.399998, 19.8, 38.299995, 19.5);
generalPath.curveTo(38.199997, 19.2, 37.999996, 18.9, 37.699997, 18.6);
generalPath.curveTo(37.499996, 18.300001, 37.199997, 18.1, 36.799995, 18.0);
generalPath.curveTo(36.499996, 17.9, 36.199997, 17.8, 35.799995, 17.8);
generalPath.curveTo(35.399994, 17.8, 35.099995, 17.9, 34.799995, 18.0);
generalPath.lineTo(33.899994, 18.6);
generalPath.curveTo(33.699993, 18.9, 33.499992, 19.1, 33.299995, 19.5);
generalPath.curveTo(33.199997, 19.8, 33.099995, 20.2, 33.099995, 20.5);
generalPath.lineTo(33.099995, 32.8);
generalPath.lineTo(29.199995, 28.8);
generalPath.curveTo(28.999994, 28.599998, 28.699995, 28.4, 28.299995, 28.199999);
generalPath.curveTo(27.999996, 28.099998, 27.699995, 27.999998, 27.299995, 27.999998);
generalPath.curveTo(26.899996, 27.999998, 26.599995, 28.099998, 26.299995, 28.199999);
generalPath.curveTo(25.999996, 28.3, 25.699995, 28.499998, 25.399996, 28.8);
generalPath.curveTo(25.199995, 29.0, 24.999996, 29.3, 24.799995, 29.599998);
generalPath.curveTo(24.699995, 29.899998, 24.599995, 30.3, 24.599995, 30.599998);
generalPath.curveTo(24.599995, 30.999998, 24.699995, 31.3, 24.799995, 31.599998);
generalPath.curveTo(24.899996, 31.899998, 25.099995, 32.199997, 25.399996, 32.5);
generalPath.lineTo(33.799995, 41.1);
generalPath.curveTo(33.999996, 41.3, 34.299995, 41.5, 34.699997, 41.699997);
generalPath.curveTo(34.999996, 41.799995, 35.299995, 41.899998, 35.699997, 41.899998);
generalPath.curveTo(36.1, 41.899998, 36.399998, 41.8, 36.699997, 41.699997);
generalPath.curveTo(36.999996, 41.6, 37.299995, 41.399998, 37.6, 41.1);
generalPath.lineTo(46.199997, 32.6);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(25.006000518798828, 29.917999267578125), new Point2D.Double(46.992000579833984, 29.917999267578125), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
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
generalPath.moveTo(5.6, 85.4);
generalPath.lineTo(9.5, 85.0);
generalPath.curveTo(9.7, 86.3, 10.2, 87.3, 10.9, 87.9);
generalPath.curveTo(11.599999, 88.5, 12.599999, 88.8, 13.799999, 88.8);
generalPath.curveTo(15.099999, 88.8, 16.099998, 88.5, 16.699999, 88.0);
generalPath.curveTo(17.4, 87.4, 17.699999, 86.8, 17.699999, 86.1);
generalPath.curveTo(17.699999, 85.6, 17.599998, 85.2, 17.3, 84.9);
generalPath.curveTo(17.0, 84.6, 16.5, 84.3, 15.799999, 84.0);
generalPath.curveTo(15.299999, 83.8, 14.199999, 83.5, 12.599999, 83.1);
generalPath.curveTo(10.4, 82.6, 8.9, 81.9, 7.9999995, 81.1);
generalPath.curveTo(6.799999, 80.0, 6.2, 78.7, 6.2, 77.1);
generalPath.curveTo(6.2, 76.1, 6.5, 75.1, 7.1, 74.2);
generalPath.curveTo(7.7, 73.299995, 8.5, 72.6, 9.6, 72.2);
generalPath.curveTo(10.700001, 71.7, 12.0, 71.5, 13.5, 71.5);
generalPath.curveTo(16.0, 71.5, 17.9, 72.1, 19.2, 73.2);
generalPath.curveTo(20.500002, 74.299995, 21.1, 75.799995, 21.2, 77.6);
generalPath.lineTo(17.2, 77.799995);
generalPath.curveTo(17.0, 76.799995, 16.7, 75.99999, 16.1, 75.6);
generalPath.curveTo(15.5, 75.1, 14.700001, 74.9, 13.5, 74.9);
generalPath.curveTo(12.3, 74.9, 11.4, 75.1, 10.7, 75.6);
generalPath.curveTo(10.3, 75.9, 10.099999, 76.299995, 10.099999, 76.799995);
generalPath.curveTo(10.099999, 77.299995, 10.299999, 77.7, 10.7, 77.99999);
generalPath.curveTo(11.2, 78.399994, 12.5, 78.899994, 14.4, 79.299995);
generalPath.curveTo(16.3, 79.7, 17.8, 80.2, 18.8, 80.7);
generalPath.curveTo(19.8, 81.2, 20.5, 81.899994, 21.0, 82.7);
generalPath.curveTo(21.5, 83.5, 21.8, 84.6, 21.8, 85.899994);
generalPath.curveTo(21.8, 86.99999, 21.5, 88.09999, 20.8, 89.09999);
generalPath.curveTo(20.199999, 90.09999, 19.3, 90.79999, 18.099998, 91.29999);
generalPath.curveTo(16.899998, 91.79999, 15.499998, 91.999985, 13.699999, 91.999985);
generalPath.curveTo(11.199999, 91.999985, 9.199999, 91.39999, 7.8999987, 90.19998);
generalPath.curveTo(6.5999985, 89.29998, 5.7999988, 87.59998, 5.5999985, 85.39998);
generalPath.closePath();
generalPath.moveTo(28.1, 91.9);
generalPath.lineTo(23.3, 71.9);
generalPath.lineTo(27.4, 71.9);
generalPath.lineTo(30.4, 85.700005);
generalPath.lineTo(34.1, 71.9);
generalPath.lineTo(39.0, 71.9);
generalPath.lineTo(42.5, 85.9);
generalPath.lineTo(45.6, 71.9);
generalPath.lineTo(49.699997, 71.9);
generalPath.lineTo(44.799995, 91.9);
generalPath.lineTo(40.499996, 91.9);
generalPath.lineTo(36.499996, 76.9);
generalPath.lineTo(32.499996, 91.9);
generalPath.lineTo(28.099997, 91.9);
generalPath.closePath();
generalPath.moveTo(51.7, 91.9);
generalPath.lineTo(51.7, 71.9);
generalPath.lineTo(58.2, 71.9);
generalPath.curveTo(60.7, 71.9, 62.3, 72.0, 63.0, 72.200005);
generalPath.curveTo(64.1, 72.50001, 65.1, 73.200005, 65.9, 74.200005);
generalPath.curveTo(66.700005, 75.200005, 67.1, 76.50001, 67.1, 78.100006);
generalPath.curveTo(67.1, 79.3, 66.9, 80.40001, 66.4, 81.200005);
generalPath.curveTo(66.0, 82.00001, 65.4, 82.700005, 64.700005, 83.200005);
generalPath.curveTo(64.00001, 83.700005, 63.300003, 84.00001, 62.600006, 84.200005);
generalPath.curveTo(61.600006, 84.4, 60.200005, 84.50001, 58.400005, 84.50001);
generalPath.lineTo(55.800007, 84.50001);
generalPath.lineTo(55.800007, 92.100006);
generalPath.lineTo(51.70001, 92.100006);
generalPath.closePath();
generalPath.moveTo(55.8, 75.2);
generalPath.lineTo(55.8, 80.899994);
generalPath.lineTo(58.0, 80.899994);
generalPath.curveTo(59.6, 80.899994, 60.7, 80.799995, 61.2, 80.59999);
generalPath.curveTo(61.7, 80.399994, 62.2, 80.09999, 62.5, 79.59999);
generalPath.curveTo(62.8, 79.19999, 63.0, 78.59999, 63.0, 77.99999);
generalPath.curveTo(63.0, 77.299995, 62.8, 76.69999, 62.4, 76.19999);
generalPath.curveTo(62.0, 75.69999, 61.4, 75.39999, 60.800003, 75.29999);
generalPath.curveTo(60.300003, 75.19999, 59.300003, 75.19999, 57.9, 75.19999);
generalPath.lineTo(55.800003, 75.19999);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
	private ext_swp() {
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
    public static ResizableIcon of(int width, int height) {
       ext_swp base = new ext_swp();
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_swp base = new ext_swp();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_swp::new;
    }
}

