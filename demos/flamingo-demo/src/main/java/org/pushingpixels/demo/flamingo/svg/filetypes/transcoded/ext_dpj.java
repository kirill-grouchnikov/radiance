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
public class ext_dpj implements ResizableIcon {
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
generalPath.moveTo(45.0, 1.1);
generalPath.lineTo(72.0, 27.800001);
generalPath.lineTo(72.0, 98.9);
generalPath.lineTo(0.0, 98.9);
generalPath.lineTo(0.0, 1.1);
generalPath.lineTo(45.0, 1.1);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.125), new Point2D.Double(36.0, 100.875), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0, 1.1);
generalPath.lineTo(72.0, 27.800001);
generalPath.lineTo(72.0, 98.9);
generalPath.lineTo(0.0, 98.9);
generalPath.lineTo(0.0, 1.1);
generalPath.lineTo(45.0, 1.1);
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
generalPath.moveTo(45.0, 1.1);
generalPath.lineTo(72.0, 27.800001);
generalPath.lineTo(72.0, 98.9);
generalPath.lineTo(0.0, 98.9);
generalPath.lineTo(0.0, 1.1);
generalPath.lineTo(45.0, 1.1);
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
generalPath.moveTo(36.3, 23.7);
generalPath.curveTo(34.0, 25.300001, 31.3, 27.2, 29.9, 30.300001);
generalPath.curveTo(27.4, 35.600002, 34.9, 41.5, 35.2, 41.7);
generalPath.curveTo(35.3, 41.8, 35.4, 41.8, 35.5, 41.8);
generalPath.curveTo(35.6, 41.8, 35.7, 41.8, 35.8, 41.7);
generalPath.curveTo(35.899998, 41.600002, 36.0, 41.4, 35.899998, 41.2);
generalPath.curveTo(35.899998, 41.100002, 33.199997, 35.9, 33.3, 32.2);
generalPath.curveTo(33.3, 30.900002, 35.2, 29.400002, 37.1, 27.900002);
generalPath.curveTo(38.899998, 26.500002, 40.899998, 24.800001, 42.0, 22.900002);
generalPath.curveTo(44.6, 18.7, 41.7, 14.600001, 41.7, 14.600001);
generalPath.curveTo(41.600002, 14.400002, 41.4, 14.400002, 41.2, 14.500001);
generalPath.curveTo(41.0, 14.6, 40.9, 14.800001, 41.0, 15.000001);
generalPath.curveTo(41.0, 15.000001, 41.6, 17.7, 40.0, 20.5);
generalPath.curveTo(39.3, 21.5, 37.9, 22.5, 36.3, 23.7);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(29.386999130249023, 28.042999267578125), new Point2D.Double(43.01900100708008, 28.042999267578125), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(46.0, 25.5);
generalPath.curveTo(46.2, 25.4, 46.2, 25.2, 46.1, 25.0);
generalPath.curveTo(45.999996, 24.8, 45.8, 24.7, 45.6, 24.8);
generalPath.curveTo(45.199997, 25.0, 35.899998, 28.5, 35.899998, 32.8);
generalPath.curveTo(35.899998, 35.8, 37.199997, 37.399998, 38.1, 38.5);
generalPath.curveTo(38.5, 39.0, 38.8, 39.3, 38.899998, 39.7);
generalPath.curveTo(39.199997, 40.7, 38.499996, 42.4, 38.199997, 43.0);
generalPath.curveTo(38.1, 43.2, 38.199997, 43.4, 38.299995, 43.5);
generalPath.curveTo(38.399994, 43.6, 38.499996, 43.6, 38.599995, 43.6);
generalPath.curveTo(38.699993, 43.6, 38.799995, 43.6, 38.799995, 43.5);
generalPath.curveTo(38.999996, 43.4, 42.699997, 40.7, 41.999996, 37.6);
generalPath.curveTo(41.799995, 36.399998, 41.199997, 35.5, 40.599995, 34.699997);
generalPath.curveTo(39.799995, 33.499996, 39.199993, 32.6, 40.099995, 30.999996);
generalPath.curveTo(41.299995, 29.099997, 45.999996, 25.499996, 45.999996, 25.499996);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.979000091552734, 34.17599868774414), new Point2D.Double(46.207000732421875, 34.17599868774414), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(21.9, 43.6);
generalPath.curveTo(21.699999, 44.1, 21.8, 44.5, 22.1, 45.0);
generalPath.curveTo(23.1, 46.4, 26.7, 47.2, 32.1, 47.2);
generalPath.lineTo(34.399998, 47.2);
generalPath.curveTo(43.1, 46.9, 46.399998, 44.2, 46.5, 44.100002);
generalPath.curveTo(46.6, 44.000004, 46.7, 43.800003, 46.6, 43.600002);
generalPath.curveTo(46.499996, 43.4, 46.3, 43.300003, 46.1, 43.4);
generalPath.curveTo(43.0, 44.2, 37.3, 44.5, 33.3, 44.5);
generalPath.curveTo(28.8, 44.5, 26.599998, 44.2, 26.0, 43.9);
generalPath.curveTo(26.3, 43.5, 28.0, 42.800003, 30.2, 42.4);
generalPath.curveTo(30.400002, 42.4, 30.6, 42.2, 30.5, 42.0);
generalPath.curveTo(30.5, 41.8, 30.3, 41.6, 30.1, 41.6);
generalPath.curveTo(29.0, 41.5, 22.6, 41.6, 21.900002, 43.6);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.820999145507812, 44.35100173950195), new Point2D.Double(46.71500015258789, 44.35100173950195), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.1, 40.8);
generalPath.curveTo(49.3, 40.8, 47.6, 41.7, 47.5, 41.7);
generalPath.curveTo(47.3, 41.8, 47.2, 42.0, 47.3, 42.2);
generalPath.curveTo(47.3, 42.4, 47.5, 42.5, 47.7, 42.5);
generalPath.curveTo(47.7, 42.5, 51.5, 42.5, 51.9, 44.7);
generalPath.curveTo(52.2, 46.600002, 48.300003, 49.600002, 46.800003, 50.600002);
generalPath.curveTo(46.600002, 50.7, 46.600002, 50.9, 46.600002, 51.100002);
generalPath.curveTo(46.7, 51.300003, 46.800003, 51.4, 47.000004, 51.4);
generalPath.lineTo(47.100002, 51.4);
generalPath.curveTo(47.500004, 51.300003, 56.0, 49.4, 55.100002, 44.5);
generalPath.curveTo(54.500004, 41.5, 52.600002, 40.8, 51.100002, 40.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(46.60599899291992, 46.14899826049805), new Point2D.Double(55.1510009765625, 46.14899826049805), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.3, 50.1);
generalPath.curveTo(45.3, 49.899998, 45.3, 49.8, 45.1, 49.699997);
generalPath.lineTo(43.1, 48.299995);
generalPath.curveTo(43.0, 48.199997, 42.899998, 48.199997, 42.8, 48.199997);
generalPath.curveTo(42.8, 48.199997, 40.6, 48.799995, 37.5, 49.1);
generalPath.curveTo(36.3, 49.199997, 34.9, 49.3, 33.5, 49.3);
generalPath.curveTo(30.4, 49.3, 28.4, 48.899998, 28.1, 48.7);
generalPath.lineTo(28.1, 48.600002);
generalPath.curveTo(28.2, 48.500004, 28.4, 48.300003, 28.6, 48.2);
generalPath.curveTo(28.800001, 48.100002, 28.9, 47.9, 28.9, 47.7);
generalPath.curveTo(28.8, 47.5, 28.6, 47.4, 28.4, 47.4);
generalPath.curveTo(26.4, 47.9, 25.3, 48.600002, 25.4, 49.5);
generalPath.curveTo(25.5, 51.0, 29.1, 51.8, 32.1, 52.0);
generalPath.lineTo(33.5, 52.0);
generalPath.curveTo(38.5, 52.0, 45.0, 50.4, 45.0, 50.4);
generalPath.curveTo(45.1, 50.4, 45.2, 50.2, 45.3, 50.100002);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(25.340999603271484, 49.67499923706055), new Point2D.Double(45.284000396728516, 49.67499923706055), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(29.9, 53.4);
generalPath.curveTo(30.1, 53.300003, 30.1, 53.100002, 30.1, 52.9);
generalPath.curveTo(30.0, 52.7, 29.9, 52.600002, 29.7, 52.600002);
generalPath.curveTo(29.400002, 52.600002, 27.0, 52.7, 26.800001, 54.300003);
generalPath.curveTo(26.7, 54.800003, 26.900002, 55.200005, 27.2, 55.500004);
generalPath.curveTo(28.1, 56.500004, 30.400002, 57.100002, 34.3, 57.400005);
generalPath.lineTo(35.7, 57.400005);
generalPath.curveTo(40.7, 57.400005, 44.1, 55.800007, 44.2, 55.800007);
generalPath.curveTo(44.3, 55.70001, 44.4, 55.600006, 44.4, 55.400005);
generalPath.curveTo(44.4, 55.200005, 44.300003, 55.100006, 44.2, 55.000004);
generalPath.lineTo(41.600002, 53.400005);
generalPath.curveTo(41.500004, 53.300007, 41.4, 53.300007, 41.300003, 53.300007);
generalPath.curveTo(41.300003, 53.300007, 39.600002, 53.600006, 37.200005, 54.000008);
generalPath.curveTo(36.700005, 54.100006, 36.100006, 54.100006, 35.500004, 54.100006);
generalPath.curveTo(33.000004, 54.100006, 30.300003, 53.700005, 29.800003, 53.400005);
generalPath.curveTo(29.800003, 53.500004, 29.800003, 53.400005, 29.900003, 53.400005);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.775999069213867, 55.03900146484375), new Point2D.Double(44.49599838256836, 55.03900146484375), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(33.4, 62.2);
generalPath.curveTo(44.9, 62.2, 51.0, 60.100002, 52.2, 58.9);
generalPath.curveTo(52.600002, 58.4, 52.7, 58.0, 52.600002, 57.7);
generalPath.curveTo(52.500004, 57.0, 51.9, 56.600002, 51.800003, 56.5);
generalPath.curveTo(51.600002, 56.4, 51.4, 56.4, 51.300003, 56.6);
generalPath.curveTo(51.200005, 56.8, 51.200005, 57.0, 51.300003, 57.1);
generalPath.curveTo(51.4, 57.199997, 51.4, 57.3, 51.200005, 57.6);
generalPath.curveTo(50.800003, 58.0, 46.000004, 59.399998, 38.000004, 59.8);
generalPath.curveTo(36.900005, 59.899998, 35.800003, 59.899998, 34.600002, 59.899998);
generalPath.curveTo(27.500002, 59.899998, 22.200003, 58.899998, 21.600002, 58.399998);
generalPath.curveTo(21.900002, 57.999996, 23.700003, 57.399998, 25.700003, 57.1);
generalPath.curveTo(25.900003, 57.1, 26.100002, 56.899998, 26.000002, 56.6);
generalPath.curveTo(26.000002, 56.399998, 25.800001, 56.199997, 25.500002, 56.3);
generalPath.lineTo(25.0, 56.3);
generalPath.curveTo(21.8, 56.5, 18.0, 56.899998, 17.8, 58.6);
generalPath.curveTo(17.699999, 59.1, 17.9, 59.6, 18.199999, 60.0);
generalPath.curveTo(19.199999, 60.9, 21.699999, 62.2, 33.399998, 62.2);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(17.847000122070312, 59.17499923706055), new Point2D.Double(52.66400146484375, 59.17499923706055), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(54.5, 59.2);
generalPath.curveTo(54.3, 59.100002, 54.1, 59.2, 54.0, 59.3);
generalPath.curveTo(54.0, 59.3, 52.3, 61.1, 47.1, 62.2);
generalPath.curveTo(45.1, 62.600002, 41.399998, 62.8, 36.0, 62.8);
generalPath.curveTo(30.6, 62.8, 25.5, 62.6, 25.5, 62.6);
generalPath.curveTo(25.3, 62.6, 25.1, 62.699997, 25.1, 63.0);
generalPath.curveTo(25.1, 63.2, 25.2, 63.4, 25.4, 63.5);
generalPath.curveTo(25.5, 63.5, 30.8, 64.8, 38.1, 64.8);
generalPath.curveTo(41.6, 64.8, 45.0, 64.5, 48.3, 64.0);
generalPath.curveTo(54.3, 62.9, 54.8, 60.0, 54.8, 59.8);
generalPath.curveTo(54.7, 59.5, 54.6, 59.3, 54.5, 59.2);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(25.01099967956543, 61.909000396728516), new Point2D.Double(54.71799850463867, 61.909000396728516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(10.7, 71.1);
generalPath.lineTo(18.1, 71.1);
generalPath.curveTo(19.800001, 71.1, 21.0, 71.2, 21.9, 71.5);
generalPath.curveTo(23.1, 71.8, 24.1, 72.5, 24.9, 73.3);
generalPath.curveTo(25.699999, 74.200005, 26.4, 75.200005, 26.8, 76.5);
generalPath.curveTo(27.199999, 77.799995, 27.5, 79.3, 27.5, 81.2);
generalPath.curveTo(27.5, 82.799995, 27.3, 84.2, 26.9, 85.399994);
generalPath.curveTo(26.4, 86.799995, 25.699999, 87.99999, 24.699999, 88.899994);
generalPath.curveTo(23.999998, 89.59999, 22.999998, 90.09999, 21.8, 90.49999);
generalPath.curveTo(20.9, 90.799995, 19.699999, 90.899994, 18.199999, 90.899994);
generalPath.lineTo(10.599998, 90.899994);
generalPath.lineTo(10.599998, 71.1);
generalPath.closePath();
generalPath.moveTo(14.799999, 74.5);
generalPath.lineTo(14.799999, 87.6);
generalPath.lineTo(17.8, 87.6);
generalPath.curveTo(18.9, 87.6, 19.8, 87.5, 20.3, 87.4);
generalPath.curveTo(21.0, 87.200005, 21.5, 87.0, 21.9, 86.6);
generalPath.curveTo(22.3, 86.2, 22.699999, 85.6, 23.0, 84.7);
generalPath.curveTo(23.3, 83.799995, 23.4, 82.6, 23.4, 81.1);
generalPath.curveTo(23.4, 79.6, 23.3, 78.4, 23.0, 77.6);
generalPath.curveTo(22.7, 76.799995, 22.3, 76.1, 21.8, 75.7);
generalPath.curveTo(21.3, 75.2, 20.699999, 74.899994, 19.9, 74.799995);
generalPath.curveTo(19.3, 74.7, 18.199999, 74.6, 16.6, 74.6);
generalPath.lineTo(14.8, 74.6);
generalPath.closePath();
generalPath.moveTo(31.0, 91.0);
generalPath.lineTo(31.0, 71.1);
generalPath.lineTo(37.5, 71.1);
generalPath.curveTo(40.0, 71.1, 41.6, 71.2, 42.3, 71.4);
generalPath.curveTo(43.5, 71.700005, 44.399998, 72.3, 45.2, 73.3);
generalPath.curveTo(46.0, 74.3, 46.4, 75.600006, 46.4, 77.200005);
generalPath.curveTo(46.4, 78.4, 46.2, 79.4, 45.7, 80.3);
generalPath.curveTo(45.3, 81.100006, 44.7, 81.8, 44.0, 82.3);
generalPath.curveTo(43.3, 82.8, 42.6, 83.100006, 41.9, 83.200005);
generalPath.curveTo(40.9, 83.4, 39.5, 83.50001, 37.7, 83.50001);
generalPath.lineTo(35.100002, 83.50001);
generalPath.lineTo(35.100002, 91.0);
generalPath.lineTo(31.0, 91.0);
generalPath.closePath();
generalPath.moveTo(35.1, 74.5);
generalPath.lineTo(35.1, 80.1);
generalPath.lineTo(37.3, 80.1);
generalPath.curveTo(38.899998, 80.1, 40.0, 80.0, 40.5, 79.799995);
generalPath.curveTo(41.0, 79.6, 41.5, 79.299995, 41.8, 78.799995);
generalPath.curveTo(42.1, 78.399994, 42.3, 77.799995, 42.3, 77.299995);
generalPath.curveTo(42.3, 76.6, 42.1, 75.99999, 41.7, 75.49999);
generalPath.curveTo(41.3, 74.99999, 40.7, 74.69999, 40.100002, 74.59999);
generalPath.curveTo(39.600002, 74.49999, 38.600002, 74.49999, 37.2, 74.49999);
generalPath.lineTo(35.100002, 74.49999);
generalPath.closePath();
generalPath.moveTo(57.0, 71.1);
generalPath.lineTo(61.0, 71.1);
generalPath.lineTo(61.0, 83.7);
generalPath.curveTo(61.0, 85.299995, 60.9, 86.6, 60.6, 87.5);
generalPath.curveTo(60.199997, 88.7, 59.5, 89.6, 58.5, 90.3);
generalPath.curveTo(57.5, 91.0, 56.1, 91.3, 54.4, 91.3);
generalPath.curveTo(52.4, 91.3, 50.9, 90.8, 49.800003, 89.700005);
generalPath.curveTo(48.700005, 88.600006, 48.200005, 87.00001, 48.200005, 84.9);
generalPath.lineTo(52.000004, 84.5);
generalPath.curveTo(52.000004, 85.6, 52.200005, 86.4, 52.500004, 86.9);
generalPath.curveTo(52.900005, 87.6, 53.600002, 88.0, 54.500004, 88.0);
generalPath.curveTo(55.400005, 88.0, 56.000004, 87.7, 56.400005, 87.2);
generalPath.curveTo(56.800007, 86.7, 57.000004, 85.6, 57.000004, 84.0);
generalPath.lineTo(57.000004, 71.1);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
generalPath.moveTo(45.0, 1.1);
generalPath.lineTo(72.0, 27.800001);
generalPath.lineTo(45.0, 27.800001);
generalPath.lineTo(45.0, 1.1);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.084999084472656, 74.13099670410156), new Point2D.Double(58.584999084472656, 87.63099670410156), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0, 1.1);
generalPath.lineTo(72.0, 27.800001);
generalPath.lineTo(45.0, 27.800001);
generalPath.lineTo(45.0, 1.1);
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
generalPath.moveTo(45.0, 1.1);
generalPath.lineTo(72.0, 27.800001);
generalPath.lineTo(45.0, 27.800001);
generalPath.lineTo(45.0, 1.1);
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
        return 0.12999992072582245;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 9.999846806749701E-4;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 0.7400000691413879;
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
	private ext_dpj() {
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
       ext_dpj base = new ext_dpj();
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
       ext_dpj base = new ext_dpj();
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
        return ext_dpj::new;
    }
}

