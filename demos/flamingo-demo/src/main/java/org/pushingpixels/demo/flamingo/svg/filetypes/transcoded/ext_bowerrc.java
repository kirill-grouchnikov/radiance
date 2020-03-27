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
public class ext_bowerrc implements ResizableIcon {
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(72.0, 98.8);
generalPath.lineTo(0.0, 98.8);
generalPath.lineTo(0.0, 0.8);
generalPath.lineTo(45.0, 0.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.200000047683716), new Point2D.Double(36.0, 100.19999694824219), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(72.0, 98.8);
generalPath.lineTo(0.0, 98.8);
generalPath.lineTo(0.0, 0.8);
generalPath.lineTo(45.0, 0.8);
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(45.0, 27.5);
generalPath.lineTo(45.0, 0.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 73.42500305175781), new Point2D.Double(58.57500076293945, 86.92500305175781), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(45.0, 27.5);
generalPath.lineTo(45.0, 0.8);
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
generalPath.moveTo(59.8, 53.1);
generalPath.curveTo(59.3, 52.899998, 58.7, 52.6, 58.2, 52.5);
generalPath.curveTo(55.0, 51.8, 51.9, 51.1, 48.7, 50.5);
generalPath.curveTo(46.4, 50.1, 44.0, 49.8, 41.7, 49.5);
generalPath.curveTo(41.9, 47.9, 42.2, 47.7, 43.9, 47.4);
generalPath.curveTo(44.800003, 48.9, 44.800003, 48.9, 46.600002, 48.7);
generalPath.curveTo(50.4, 48.3, 52.800003, 46.100002, 53.500004, 42.2);
generalPath.curveTo(54.000004, 39.3, 54.600002, 36.5, 56.800003, 34.4);
generalPath.lineTo(56.800003, 34.2);
generalPath.curveTo(52.800003, 33.0, 47.600002, 35.7, 44.4, 40.9);
generalPath.curveTo(42.9, 40.7, 42.0, 40.2, 41.300003, 38.7);
generalPath.curveTo(39.600002, 34.600002, 36.300003, 32.100002, 31.700003, 31.900002);
generalPath.curveTo(23.400002, 31.600002, 15.9000025, 36.4, 12.600002, 44.100002);
generalPath.curveTo(9.4000025, 51.7, 10.4000025, 59.100002, 14.100002, 66.3);
generalPath.curveTo(15.600002, 69.200005, 17.500002, 71.8, 20.300003, 73.600006);
generalPath.curveTo(22.700003, 75.100006, 24.900003, 74.700005, 26.500004, 72.3);
generalPath.lineTo(26.800003, 72.0);
generalPath.lineTo(27.500004, 73.9);
generalPath.curveTo(27.700005, 74.5, 28.000004, 75.200005, 28.200005, 75.8);
generalPath.curveTo(28.800005, 77.100006, 30.200005, 77.700005, 31.500004, 77.200005);
generalPath.curveTo(31.800003, 77.100006, 32.300003, 77.100006, 32.600002, 77.200005);
generalPath.curveTo(34.000004, 77.700005, 35.4, 77.700005, 36.500004, 76.50001);
generalPath.curveTo(36.700005, 76.30001, 37.100002, 76.30001, 37.400005, 76.30001);
generalPath.curveTo(39.400005, 76.40001, 40.500004, 75.70001, 41.300007, 73.90001);
generalPath.curveTo(41.400005, 73.70001, 41.500008, 73.600006, 41.600006, 73.50001);
generalPath.curveTo(42.900005, 72.50001, 43.200005, 71.40001, 42.600006, 69.80001);
generalPath.curveTo(42.200005, 68.90001, 41.700005, 68.00001, 41.200005, 67.10001);
generalPath.curveTo(40.900005, 66.500015, 40.500004, 65.80001, 40.000004, 65.000015);
generalPath.curveTo(42.200005, 65.70001, 44.100002, 66.500015, 45.900005, 64.80002);
generalPath.curveTo(46.300007, 65.000015, 46.600006, 65.20002, 46.900005, 65.30002);
generalPath.curveTo(48.700005, 66.10002, 51.100006, 65.80002, 52.200005, 64.60002);
generalPath.curveTo(52.600006, 64.10002, 53.000004, 64.10002, 53.600006, 64.10002);
generalPath.curveTo(55.900005, 64.30002, 58.500008, 63.60002, 58.900005, 60.90002);
generalPath.curveTo(61.300007, 60.40002, 62.400005, 59.40002, 62.600006, 57.300022);
generalPath.curveTo(62.900005, 55.300022, 62.000008, 54.000023, 59.800007, 53.10002);
generalPath.closePath();
generalPath.moveTo(45.8, 47.399998);
generalPath.curveTo(45.6, 47.399998, 45.2, 46.999996, 45.1, 46.699997);
generalPath.curveTo(44.899998, 46.299995, 44.899998, 45.799995, 44.699997, 44.999996);
generalPath.lineTo(46.6, 45.699997);
generalPath.curveTo(47.5, 45.1, 48.3, 45.999996, 49.6, 46.199997);
generalPath.curveTo(48.3, 47.1, 47.1, 47.399998, 45.8, 47.399998);
generalPath.closePath();
generalPath.moveTo(53.9, 35.5);
generalPath.curveTo(53.0, 38.7, 52.0, 41.9, 51.0, 45.3);
generalPath.curveTo(49.8, 44.3, 49.0, 43.6, 47.9, 42.7);
generalPath.lineTo(51.4, 37.3);
generalPath.curveTo(49.5, 38.5, 48.300003, 40.3, 47.300003, 42.3);
generalPath.lineTo(45.700005, 41.399998);
generalPath.curveTo(46.900005, 38.399998, 50.900005, 35.6, 53.900005, 35.499996);
generalPath.closePath();
generalPath.moveTo(40.7, 41.5);
generalPath.curveTo(43.3, 41.6, 45.600002, 42.8, 47.7, 44.4);
generalPath.curveTo(47.8, 44.5, 47.9, 44.800003, 48.0, 45.2);
generalPath.curveTo(45.6, 44.4, 43.6, 44.7, 41.5, 45.4);
generalPath.curveTo(40.9, 45.600002, 40.2, 45.5, 39.5, 45.5);
generalPath.lineTo(39.5, 45.8);
generalPath.lineTo(43.3, 45.6);
generalPath.lineTo(43.3, 45.899998);
generalPath.lineTo(39.399998, 47.699997);
generalPath.curveTo(38.399998, 46.299995, 38.8, 42.999996, 39.899998, 41.799995);
generalPath.curveTo(40.1, 41.699997, 40.399998, 41.499996, 40.699997, 41.499996);
generalPath.closePath();
generalPath.moveTo(46.600002, 55.1);
generalPath.lineTo(46.600002, 55.399998);
generalPath.curveTo(50.7, 56.199997, 54.700005, 56.999996, 58.800003, 57.8);
generalPath.curveTo(58.300003, 59.1, 57.300003, 59.5, 55.000004, 59.5);
generalPath.curveTo(54.900005, 61.7, 53.900005, 62.3, 50.500004, 62.1);
generalPath.curveTo(49.800003, 64.1, 48.000004, 64.6, 44.900005, 63.399998);
generalPath.curveTo(43.200005, 65.2, 41.400005, 64.6, 39.400005, 63.8);
generalPath.curveTo(39.000004, 66.8, 37.600006, 69.1, 35.000004, 70.6);
generalPath.curveTo(32.600002, 72.0, 29.900003, 71.799995, 27.300003, 71.299995);
generalPath.curveTo(16.8, 69.0, 10.7, 58.8, 13.5, 48.0);
generalPath.curveTo(15.6, 40.0, 22.1, 34.5, 30.2, 34.1);
generalPath.curveTo(34.100002, 33.899998, 37.600002, 35.899998, 39.2, 39.399998);
generalPath.curveTo(39.4, 39.699997, 39.4, 40.399998, 39.2, 40.6);
generalPath.curveTo(37.0, 43.3, 37.0, 46.199997, 38.4, 49.199997);
generalPath.curveTo(38.7, 49.899998, 38.600002, 50.299995, 38.2, 50.799995);
generalPath.curveTo(36.3, 53.099995, 33.8, 54.499996, 31.1, 55.399994);
generalPath.lineTo(30.7, 55.499992);
generalPath.curveTo(33.9, 55.399994, 37.0, 54.899994, 39.300003, 52.29999);
generalPath.curveTo(39.9, 51.59999, 40.500004, 51.39999, 41.300003, 51.59999);
generalPath.curveTo(45.700005, 52.29999, 50.000004, 52.999992, 54.4, 53.69999);
generalPath.curveTo(55.5, 53.89999, 56.600002, 54.19999, 57.7, 54.49999);
generalPath.curveTo(58.5, 54.69999, 59.100002, 55.299988, 59.3, 56.299988);
generalPath.curveTo(55.0, 55.899986, 50.8, 55.49999, 46.6, 55.099987);
generalPath.closePath();
generalPath.moveTo(33.5, 43.5);
generalPath.curveTo(33.5, 42.0, 32.3, 40.8, 30.8, 40.9);
generalPath.curveTo(29.4, 40.9, 28.199999, 42.300003, 28.199999, 43.600002);
generalPath.curveTo(28.3, 45.000004, 29.499998, 46.2, 30.9, 46.2);
generalPath.curveTo(32.3, 46.2, 33.5, 45.0, 33.5, 43.5);
generalPath.closePath();
generalPath.moveTo(29.3, 42.3);
generalPath.curveTo(29.3, 41.399998, 30.199999, 41.2, 31.0, 41.3);
generalPath.curveTo(31.7, 41.3, 32.5, 41.5, 32.5, 42.3);
generalPath.curveTo(32.5, 43.2, 31.5, 43.3, 30.6, 43.6);
generalPath.curveTo(30.1, 43.199997, 29.300001, 42.8, 29.300001, 42.3);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.66699981689453, 22.485000610351562), new Point2D.Double(36.66699981689453, 68.11299896240234), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.66699981689453, 77.76499938964844), new Point2D.Double(36.66699981689453, 31.636999130249023), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(59.8, 53.1);
generalPath.curveTo(59.3, 52.899998, 58.7, 52.6, 58.2, 52.5);
generalPath.curveTo(55.0, 51.8, 51.9, 51.1, 48.7, 50.5);
generalPath.curveTo(46.4, 50.1, 44.0, 49.8, 41.7, 49.5);
generalPath.curveTo(41.9, 47.9, 42.2, 47.7, 43.9, 47.4);
generalPath.curveTo(44.800003, 48.9, 44.800003, 48.9, 46.600002, 48.7);
generalPath.curveTo(50.4, 48.3, 52.800003, 46.100002, 53.500004, 42.2);
generalPath.curveTo(54.000004, 39.3, 54.600002, 36.5, 56.800003, 34.4);
generalPath.lineTo(56.800003, 34.2);
generalPath.curveTo(52.800003, 33.0, 47.600002, 35.7, 44.4, 40.9);
generalPath.curveTo(42.9, 40.7, 42.0, 40.2, 41.300003, 38.7);
generalPath.curveTo(39.600002, 34.600002, 36.300003, 32.100002, 31.700003, 31.900002);
generalPath.curveTo(23.400002, 31.600002, 15.9000025, 36.4, 12.600002, 44.100002);
generalPath.curveTo(9.4000025, 51.7, 10.4000025, 59.100002, 14.100002, 66.3);
generalPath.curveTo(15.600002, 69.200005, 17.500002, 71.8, 20.300003, 73.600006);
generalPath.curveTo(22.700003, 75.100006, 24.900003, 74.700005, 26.500004, 72.3);
generalPath.lineTo(26.800003, 72.0);
generalPath.lineTo(27.500004, 73.9);
generalPath.curveTo(27.700005, 74.5, 28.000004, 75.200005, 28.200005, 75.8);
generalPath.curveTo(28.800005, 77.100006, 30.200005, 77.700005, 31.500004, 77.200005);
generalPath.curveTo(31.800003, 77.100006, 32.300003, 77.100006, 32.600002, 77.200005);
generalPath.curveTo(34.000004, 77.700005, 35.4, 77.700005, 36.500004, 76.50001);
generalPath.curveTo(36.700005, 76.30001, 37.100002, 76.30001, 37.400005, 76.30001);
generalPath.curveTo(39.400005, 76.40001, 40.500004, 75.70001, 41.300007, 73.90001);
generalPath.curveTo(41.400005, 73.70001, 41.500008, 73.600006, 41.600006, 73.50001);
generalPath.curveTo(42.900005, 72.50001, 43.200005, 71.40001, 42.600006, 69.80001);
generalPath.curveTo(42.200005, 68.90001, 41.700005, 68.00001, 41.200005, 67.10001);
generalPath.curveTo(40.900005, 66.500015, 40.500004, 65.80001, 40.000004, 65.000015);
generalPath.curveTo(42.200005, 65.70001, 44.100002, 66.500015, 45.900005, 64.80002);
generalPath.curveTo(46.300007, 65.000015, 46.600006, 65.20002, 46.900005, 65.30002);
generalPath.curveTo(48.700005, 66.10002, 51.100006, 65.80002, 52.200005, 64.60002);
generalPath.curveTo(52.600006, 64.10002, 53.000004, 64.10002, 53.600006, 64.10002);
generalPath.curveTo(55.900005, 64.30002, 58.500008, 63.60002, 58.900005, 60.90002);
generalPath.curveTo(61.300007, 60.40002, 62.400005, 59.40002, 62.600006, 57.300022);
generalPath.curveTo(62.900005, 55.300022, 62.000008, 54.000023, 59.800007, 53.10002);
generalPath.closePath();
generalPath.moveTo(45.8, 47.399998);
generalPath.curveTo(45.6, 47.399998, 45.2, 46.999996, 45.1, 46.699997);
generalPath.curveTo(44.899998, 46.299995, 44.899998, 45.799995, 44.699997, 44.999996);
generalPath.lineTo(46.6, 45.699997);
generalPath.curveTo(47.5, 45.1, 48.3, 45.999996, 49.6, 46.199997);
generalPath.curveTo(48.3, 47.1, 47.1, 47.399998, 45.8, 47.399998);
generalPath.closePath();
generalPath.moveTo(53.9, 35.5);
generalPath.curveTo(53.0, 38.7, 52.0, 41.9, 51.0, 45.3);
generalPath.curveTo(49.8, 44.3, 49.0, 43.6, 47.9, 42.7);
generalPath.lineTo(51.4, 37.3);
generalPath.curveTo(49.5, 38.5, 48.300003, 40.3, 47.300003, 42.3);
generalPath.lineTo(45.700005, 41.399998);
generalPath.curveTo(46.900005, 38.399998, 50.900005, 35.6, 53.900005, 35.499996);
generalPath.closePath();
generalPath.moveTo(40.7, 41.5);
generalPath.curveTo(43.3, 41.6, 45.600002, 42.8, 47.7, 44.4);
generalPath.curveTo(47.8, 44.5, 47.9, 44.800003, 48.0, 45.2);
generalPath.curveTo(45.6, 44.4, 43.6, 44.7, 41.5, 45.4);
generalPath.curveTo(40.9, 45.600002, 40.2, 45.5, 39.5, 45.5);
generalPath.lineTo(39.5, 45.8);
generalPath.lineTo(43.3, 45.6);
generalPath.lineTo(43.3, 45.899998);
generalPath.lineTo(39.399998, 47.699997);
generalPath.curveTo(38.399998, 46.299995, 38.8, 42.999996, 39.899998, 41.799995);
generalPath.curveTo(40.1, 41.699997, 40.399998, 41.499996, 40.699997, 41.499996);
generalPath.closePath();
generalPath.moveTo(46.600002, 55.1);
generalPath.lineTo(46.600002, 55.399998);
generalPath.curveTo(50.7, 56.199997, 54.700005, 56.999996, 58.800003, 57.8);
generalPath.curveTo(58.300003, 59.1, 57.300003, 59.5, 55.000004, 59.5);
generalPath.curveTo(54.900005, 61.7, 53.900005, 62.3, 50.500004, 62.1);
generalPath.curveTo(49.800003, 64.1, 48.000004, 64.6, 44.900005, 63.399998);
generalPath.curveTo(43.200005, 65.2, 41.400005, 64.6, 39.400005, 63.8);
generalPath.curveTo(39.000004, 66.8, 37.600006, 69.1, 35.000004, 70.6);
generalPath.curveTo(32.600002, 72.0, 29.900003, 71.799995, 27.300003, 71.299995);
generalPath.curveTo(16.8, 69.0, 10.7, 58.8, 13.5, 48.0);
generalPath.curveTo(15.6, 40.0, 22.1, 34.5, 30.2, 34.1);
generalPath.curveTo(34.100002, 33.899998, 37.600002, 35.899998, 39.2, 39.399998);
generalPath.curveTo(39.4, 39.699997, 39.4, 40.399998, 39.2, 40.6);
generalPath.curveTo(37.0, 43.3, 37.0, 46.199997, 38.4, 49.199997);
generalPath.curveTo(38.7, 49.899998, 38.600002, 50.299995, 38.2, 50.799995);
generalPath.curveTo(36.3, 53.099995, 33.8, 54.499996, 31.1, 55.399994);
generalPath.lineTo(30.7, 55.499992);
generalPath.curveTo(33.9, 55.399994, 37.0, 54.899994, 39.300003, 52.29999);
generalPath.curveTo(39.9, 51.59999, 40.500004, 51.39999, 41.300003, 51.59999);
generalPath.curveTo(45.700005, 52.29999, 50.000004, 52.999992, 54.4, 53.69999);
generalPath.curveTo(55.5, 53.89999, 56.600002, 54.19999, 57.7, 54.49999);
generalPath.curveTo(58.5, 54.69999, 59.100002, 55.299988, 59.3, 56.299988);
generalPath.curveTo(55.0, 55.899986, 50.8, 55.49999, 46.6, 55.099987);
generalPath.closePath();
generalPath.moveTo(33.5, 43.5);
generalPath.curveTo(33.5, 42.0, 32.3, 40.8, 30.8, 40.9);
generalPath.curveTo(29.4, 40.9, 28.199999, 42.300003, 28.199999, 43.600002);
generalPath.curveTo(28.3, 45.000004, 29.499998, 46.2, 30.9, 46.2);
generalPath.curveTo(32.3, 46.2, 33.5, 45.0, 33.5, 43.5);
generalPath.closePath();
generalPath.moveTo(29.3, 42.3);
generalPath.curveTo(29.3, 41.399998, 30.199999, 41.2, 31.0, 41.3);
generalPath.curveTo(31.7, 41.3, 32.5, 41.5, 32.5, 42.3);
generalPath.curveTo(32.5, 43.2, 31.5, 43.3, 30.6, 43.6);
generalPath.curveTo(30.1, 43.199997, 29.300001, 42.8, 29.300001, 42.3);
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_bowerrc base = new ext_bowerrc();
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
        return ext_bowerrc::new;
    }
}

