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
public class ext_sol implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.0), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
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
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 74.18699645996094), new Point2D.Double(58.5369987487793, 87.68699645996094), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.9, 85.4);
generalPath.lineTo(12.799999, 85.0);
generalPath.curveTo(12.999999, 86.3, 13.499999, 87.3, 14.199999, 87.9);
generalPath.curveTo(14.899999, 88.5, 15.899999, 88.8, 17.099998, 88.8);
generalPath.curveTo(18.399998, 88.8, 19.399998, 88.5, 19.999998, 88.0);
generalPath.curveTo(20.699999, 87.4, 20.999998, 86.8, 20.999998, 86.1);
generalPath.curveTo(20.999998, 85.6, 20.899998, 85.2, 20.599998, 84.9);
generalPath.curveTo(20.3, 84.6, 19.8, 84.3, 19.099998, 84.0);
generalPath.curveTo(18.599998, 83.8, 17.499998, 83.5, 15.899999, 83.1);
generalPath.curveTo(13.699999, 82.6, 12.199999, 81.9, 11.299999, 81.1);
generalPath.curveTo(10.099999, 80.0, 9.499999, 78.7, 9.499999, 77.1);
generalPath.curveTo(9.499999, 76.1, 9.799999, 75.1, 10.399999, 74.2);
generalPath.curveTo(10.999999, 73.299995, 11.799998, 72.6, 12.899999, 72.2);
generalPath.curveTo(13.999999, 71.7, 15.299999, 71.5, 16.8, 71.5);
generalPath.curveTo(19.3, 71.5, 21.199999, 72.1, 22.5, 73.2);
generalPath.curveTo(23.800001, 74.299995, 24.4, 75.799995, 24.5, 77.6);
generalPath.lineTo(20.5, 77.799995);
generalPath.curveTo(20.3, 76.799995, 20.0, 75.99999, 19.4, 75.6);
generalPath.curveTo(18.8, 75.1, 18.0, 74.9, 16.8, 74.9);
generalPath.curveTo(15.599999, 74.9, 14.699999, 75.1, 13.999999, 75.6);
generalPath.curveTo(13.599999, 75.9, 13.399999, 76.299995, 13.399999, 76.799995);
generalPath.curveTo(13.399999, 77.299995, 13.599998, 77.7, 13.999999, 77.99999);
generalPath.curveTo(14.499999, 78.399994, 15.799999, 78.899994, 17.699999, 79.299995);
generalPath.curveTo(19.599998, 79.7, 21.099998, 80.2, 22.099998, 80.7);
generalPath.curveTo(23.099998, 81.2, 23.8, 81.899994, 24.3, 82.7);
generalPath.curveTo(24.8, 83.5, 25.099998, 84.6, 25.099998, 85.899994);
generalPath.curveTo(25.099998, 86.99999, 24.8, 88.09999, 24.099998, 89.09999);
generalPath.curveTo(23.499998, 90.09999, 22.599998, 90.79999, 21.399998, 91.29999);
generalPath.curveTo(20.199997, 91.79999, 18.799997, 91.999985, 16.999998, 91.999985);
generalPath.curveTo(14.499998, 91.999985, 12.499998, 91.39999, 11.199998, 90.19998);
generalPath.curveTo(9.899998, 89.29998, 9.099998, 87.59998, 8.899998, 85.39998);
generalPath.closePath();
generalPath.moveTo(27.7, 82.0);
generalPath.curveTo(27.7, 80.0, 28.0, 78.2, 28.6, 76.9);
generalPath.curveTo(29.1, 75.9, 29.7, 75.0, 30.5, 74.200005);
generalPath.curveTo(31.3, 73.4, 32.2, 72.8, 33.1, 72.4);
generalPath.curveTo(34.3, 71.9, 35.8, 71.6, 37.399998, 71.6);
generalPath.curveTo(40.399998, 71.6, 42.699997, 72.5, 44.499996, 74.299995);
generalPath.curveTo(46.299995, 76.1, 47.199997, 78.7, 47.199997, 81.899994);
generalPath.curveTo(47.199997, 85.09999, 46.299995, 87.7, 44.6, 89.49999);
generalPath.curveTo(42.8, 91.299995, 40.5, 92.19999, 37.5, 92.19999);
generalPath.curveTo(34.5, 92.19999, 32.1, 91.29999, 30.4, 89.49999);
generalPath.curveTo(28.6, 87.69999, 27.699999, 85.19999, 27.699999, 81.99999);
generalPath.closePath();
generalPath.moveTo(31.900002, 81.8);
generalPath.curveTo(31.900002, 84.100006, 32.4, 85.8, 33.5, 87.0);
generalPath.curveTo(34.5, 88.2, 35.9, 88.8, 37.5, 88.8);
generalPath.curveTo(39.1, 88.8, 40.4, 88.200005, 41.5, 87.100006);
generalPath.curveTo(42.5, 85.90001, 43.1, 84.200005, 43.1, 81.90001);
generalPath.curveTo(43.1, 79.600006, 42.6, 77.90001, 41.6, 76.80001);
generalPath.curveTo(40.6, 75.70001, 39.3, 75.10001, 37.6, 75.10001);
generalPath.curveTo(35.899998, 75.10001, 34.6, 75.70001, 33.6, 76.80001);
generalPath.curveTo(32.399998, 77.80001, 31.899998, 79.50001, 31.899998, 81.80001);
generalPath.closePath();
generalPath.moveTo(50.5, 91.9);
generalPath.lineTo(50.5, 72.0);
generalPath.lineTo(54.5, 72.0);
generalPath.lineTo(54.5, 88.5);
generalPath.lineTo(64.6, 88.5);
generalPath.lineTo(64.6, 91.9);
generalPath.lineTo(50.5, 91.9);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new Ellipse2D.Double(24.799999237060547, 34.79999923706055, 22.399999618530273, 22.399999618530273);
paint = new LinearGradientPaint(new Point2D.Double(24.767000198364258, 54.0), new Point2D.Double(47.233001708984375, 54.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(35.2, 33.4);
generalPath.lineTo(36.8, 33.4);
generalPath.curveTo(37.3, 33.4, 37.7, 33.0, 37.7, 32.5);
generalPath.lineTo(37.7, 26.9);
generalPath.curveTo(37.7, 26.4, 37.3, 26.0, 36.8, 26.0);
generalPath.lineTo(35.2, 26.0);
generalPath.curveTo(34.7, 26.0, 34.3, 26.4, 34.3, 26.9);
generalPath.lineTo(34.3, 32.5);
generalPath.curveTo(34.3, 33.0, 34.7, 33.4, 35.2, 33.4);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.28799819946289, 70.30000305175781), new Point2D.Double(37.71200180053711, 70.30000305175781), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(48.6, 45.2);
generalPath.lineTo(48.6, 46.8);
generalPath.curveTo(48.6, 47.3, 49.0, 47.7, 49.5, 47.7);
generalPath.lineTo(55.1, 47.7);
generalPath.curveTo(55.6, 47.7, 56.0, 47.3, 56.0, 46.8);
generalPath.lineTo(56.0, 45.2);
generalPath.curveTo(56.0, 44.7, 55.6, 44.3, 55.1, 44.3);
generalPath.lineTo(49.5, 44.3);
generalPath.curveTo(49.0, 44.3, 48.6, 44.7, 48.6, 45.2);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(48.55699920654297, 54.0), new Point2D.Double(56.0, 54.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(36.8, 66.0);
generalPath.curveTo(37.3, 66.0, 37.7, 65.6, 37.7, 65.1);
generalPath.lineTo(37.7, 59.5);
generalPath.curveTo(37.7, 59.0, 37.3, 58.6, 36.8, 58.6);
generalPath.lineTo(35.2, 58.6);
generalPath.curveTo(34.7, 58.6, 34.3, 59.0, 34.3, 59.5);
generalPath.lineTo(34.3, 65.1);
generalPath.curveTo(34.3, 65.6, 34.7, 66.0, 35.2, 66.0);
generalPath.lineTo(36.8, 66.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.28799819946289, 37.70000076293945), new Point2D.Double(37.71200180053711, 37.70000076293945), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(16.9, 47.7);
generalPath.lineTo(22.5, 47.7);
generalPath.curveTo(23.0, 47.7, 23.4, 47.3, 23.4, 46.8);
generalPath.lineTo(23.4, 45.2);
generalPath.curveTo(23.4, 44.7, 23.0, 44.3, 22.5, 44.3);
generalPath.lineTo(16.9, 44.3);
generalPath.curveTo(16.4, 44.3, 16.0, 44.7, 16.0, 45.2);
generalPath.lineTo(16.0, 46.8);
generalPath.curveTo(16.0, 47.3, 16.4, 47.7, 16.9, 47.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(16.0, 54.0), new Point2D.Double(23.44300079345703, 54.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(45.4, 37.7);
generalPath.curveTo(45.800003, 38.100002, 46.300003, 38.100002, 46.7, 37.7);
generalPath.lineTo(50.7, 33.7);
generalPath.curveTo(51.100002, 33.3, 51.100002, 32.8, 50.7, 32.4);
generalPath.lineTo(49.600002, 31.300001);
generalPath.curveTo(49.2, 30.900002, 48.7, 30.900002, 48.300003, 31.300001);
generalPath.lineTo(44.300003, 35.300003);
generalPath.curveTo(43.9, 35.700005, 43.9, 36.200005, 44.300003, 36.600002);
generalPath.lineTo(45.4, 37.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.047000885009766, 65.5), new Point2D.Double(50.974998474121094, 65.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.6, 60.7);
generalPath.lineTo(50.699997, 59.600002);
generalPath.curveTo(51.1, 59.2, 51.1, 58.7, 50.699997, 58.300003);
generalPath.lineTo(46.699997, 54.300003);
generalPath.curveTo(46.299995, 53.9, 45.799995, 53.9, 45.399998, 54.300003);
generalPath.lineTo(44.3, 55.4);
generalPath.curveTo(43.899998, 55.800003, 43.899998, 56.300003, 44.3, 56.7);
generalPath.lineTo(48.3, 60.7);
generalPath.curveTo(48.6, 61.100002, 49.2, 61.100002, 49.6, 60.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.047000885009766, 42.5), new Point2D.Double(50.974998474121094, 42.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.7, 60.7);
generalPath.lineTo(27.7, 56.7);
generalPath.curveTo(28.1, 56.3, 28.1, 55.8, 27.7, 55.4);
generalPath.lineTo(26.6, 54.300003);
generalPath.curveTo(26.2, 53.9, 25.7, 53.9, 25.300001, 54.300003);
generalPath.lineTo(21.300001, 58.300003);
generalPath.curveTo(20.900002, 58.700005, 20.900002, 59.200005, 21.300001, 59.600002);
generalPath.lineTo(22.400002, 60.7);
generalPath.curveTo(22.800001, 61.100002, 23.400002, 61.100002, 23.7, 60.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.024999618530273, 42.5), new Point2D.Double(27.952999114990234, 42.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(25.3, 37.7);
generalPath.curveTo(25.699999, 38.100002, 26.199999, 38.100002, 26.599998, 37.7);
generalPath.lineTo(27.699999, 36.600002);
generalPath.curveTo(28.099998, 36.2, 28.099998, 35.7, 27.699999, 35.300003);
generalPath.lineTo(23.699999, 31.300003);
generalPath.curveTo(23.3, 30.900003, 22.8, 30.900003, 22.4, 31.300003);
generalPath.lineTo(21.3, 32.4);
generalPath.curveTo(20.9, 32.800003, 20.9, 33.300003, 21.3, 33.7);
generalPath.lineTo(25.3, 37.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.024999618530273, 65.5), new Point2D.Double(27.952999114990234, 65.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
	private ext_sol() {
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
       ext_sol base = new ext_sol();
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
       ext_sol base = new ext_sol();
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
        return ext_sol::new;
    }
}

