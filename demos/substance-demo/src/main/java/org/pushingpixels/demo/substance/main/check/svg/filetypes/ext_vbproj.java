package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_vbproj implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.265000104904175), new Point2D.Double(36.0, 100.25), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(72.0, 98.8);
generalPath.lineTo(0.0, 98.8);
generalPath.lineTo(0.0, 0.8);
generalPath.lineTo(45.0, 0.8);
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
generalPath.moveTo(8.8, 89.8);
generalPath.lineTo(4.9, 79.1);
generalPath.lineTo(7.3, 79.1);
generalPath.lineTo(10.0, 87.0);
generalPath.lineTo(12.7, 79.1);
generalPath.lineTo(15.0, 79.1);
generalPath.lineTo(11.1, 89.799995);
generalPath.lineTo(8.8, 89.799995);
generalPath.closePath();
generalPath.moveTo(16.1, 79.100006);
generalPath.lineTo(20.400002, 79.100006);
generalPath.curveTo(21.300001, 79.100006, 21.900002, 79.100006, 22.300001, 79.200005);
generalPath.curveTo(22.7, 79.3, 23.1, 79.4, 23.400002, 79.600006);
generalPath.curveTo(23.700003, 79.80001, 24.000002, 80.100006, 24.2, 80.50001);
generalPath.curveTo(24.400002, 80.90001, 24.5, 81.30001, 24.5, 81.80001);
generalPath.curveTo(24.5, 82.30001, 24.4, 82.80001, 24.1, 83.20001);
generalPath.curveTo(23.800001, 83.60001, 23.5, 83.90001, 23.0, 84.10001);
generalPath.curveTo(23.7, 84.30001, 24.2, 84.60001, 24.5, 85.10001);
generalPath.curveTo(24.9, 85.60001, 25.0, 86.10001, 25.0, 86.70001);
generalPath.curveTo(25.0, 87.20001, 24.9, 87.70001, 24.7, 88.10001);
generalPath.curveTo(24.5, 88.60001, 24.2, 88.90002, 23.800001, 89.20001);
generalPath.curveTo(23.400002, 89.500015, 22.900002, 89.60001, 22.300001, 89.70001);
generalPath.curveTo(21.900002, 89.70001, 21.1, 89.80001, 19.7, 89.80001);
generalPath.lineTo(16.0, 89.80001);
generalPath.lineTo(16.0, 79.1);
generalPath.closePath();
generalPath.moveTo(18.300001, 80.90001);
generalPath.lineTo(18.300001, 83.40001);
generalPath.lineTo(21.300001, 83.40001);
generalPath.curveTo(21.7, 83.40001, 22.000002, 83.20001, 22.2, 83.00001);
generalPath.curveTo(22.400002, 82.80001, 22.5, 82.50001, 22.5, 82.200005);
generalPath.curveTo(22.5, 81.9, 22.4, 81.600006, 22.2, 81.4);
generalPath.curveTo(22.0, 81.200005, 21.7, 81.1, 21.400002, 81.0);
generalPath.lineTo(18.300001, 81.0);
generalPath.closePath();
generalPath.moveTo(18.300001, 85.100006);
generalPath.lineTo(18.300001, 88.0);
generalPath.lineTo(20.300001, 88.0);
generalPath.curveTo(21.1, 88.0, 21.6, 88.0, 21.800001, 87.9);
generalPath.curveTo(22.1, 87.8, 22.400002, 87.700005, 22.6, 87.5);
generalPath.curveTo(22.800001, 87.3, 22.9, 87.0, 22.9, 86.6);
generalPath.curveTo(22.9, 86.299995, 22.8, 86.0, 22.699999, 85.799995);
generalPath.curveTo(22.499998, 85.6, 22.3, 85.399994, 21.999998, 85.299995);
generalPath.curveTo(21.699999, 85.2, 21.099998, 85.1, 20.099998, 85.1);
generalPath.lineTo(18.3, 85.1);
generalPath.closePath();
generalPath.moveTo(27.100002, 89.8);
generalPath.lineTo(27.100002, 79.1);
generalPath.lineTo(30.600002, 79.1);
generalPath.curveTo(31.900002, 79.1, 32.800003, 79.2, 33.2, 79.299995);
generalPath.curveTo(33.8, 79.49999, 34.3, 79.799995, 34.8, 80.399994);
generalPath.curveTo(35.2, 80.899994, 35.399998, 81.59999, 35.399998, 82.49999);
generalPath.curveTo(35.399998, 83.19999, 35.3, 83.69999, 34.999996, 84.19999);
generalPath.curveTo(34.799995, 84.59999, 34.499996, 84.99999, 34.099995, 85.29999);
generalPath.curveTo(33.699993, 85.59999, 33.299995, 85.69999, 32.999996, 85.79999);
generalPath.curveTo(32.499996, 85.89999, 31.699997, 85.999985, 30.699997, 85.999985);
generalPath.lineTo(29.299997, 85.999985);
generalPath.lineTo(29.299997, 90.09998);
generalPath.lineTo(27.099997, 90.09998);
generalPath.closePath();
generalPath.moveTo(29.300003, 80.9);
generalPath.lineTo(29.300003, 83.9);
generalPath.lineTo(30.500004, 83.9);
generalPath.curveTo(31.400003, 83.9, 31.900003, 83.8, 32.200005, 83.700005);
generalPath.curveTo(32.500004, 83.600006, 32.700005, 83.4, 32.900005, 83.200005);
generalPath.curveTo(33.100006, 83.00001, 33.100006, 82.700005, 33.100006, 82.4);
generalPath.curveTo(33.100006, 82.0, 33.000008, 81.700005, 32.800007, 81.4);
generalPath.curveTo(32.600006, 81.1, 32.300007, 81.0, 31.900007, 81.0);
generalPath.curveTo(31.600008, 81.0, 31.100008, 80.9, 30.300007, 80.9);
generalPath.lineTo(29.300007, 80.9);
generalPath.closePath();
generalPath.moveTo(37.200005, 89.8);
generalPath.lineTo(37.200005, 79.1);
generalPath.lineTo(41.800003, 79.1);
generalPath.curveTo(43.000004, 79.1, 43.800003, 79.2, 44.300003, 79.4);
generalPath.curveTo(44.800003, 79.6, 45.200005, 79.9, 45.600002, 80.4);
generalPath.curveTo(45.9, 80.9, 46.100002, 81.5, 46.100002, 82.1);
generalPath.curveTo(46.100002, 82.9, 45.9, 83.6, 45.4, 84.1);
generalPath.curveTo(44.9, 84.6, 44.2, 85.0, 43.300003, 85.1);
generalPath.curveTo(43.800003, 85.4, 44.200005, 85.7, 44.500004, 86.0);
generalPath.curveTo(44.800003, 86.3, 45.200005, 86.9, 45.700005, 87.7);
generalPath.lineTo(47.000004, 89.799995);
generalPath.lineTo(44.400005, 89.799995);
generalPath.lineTo(42.800007, 87.49999);
generalPath.curveTo(42.20001, 86.69999, 41.900005, 86.09999, 41.600006, 85.899994);
generalPath.curveTo(41.400005, 85.7, 41.200005, 85.49999, 40.900005, 85.49999);
generalPath.curveTo(40.700005, 85.399994, 40.300007, 85.399994, 39.800007, 85.399994);
generalPath.lineTo(39.400005, 85.399994);
generalPath.lineTo(39.400005, 89.899994);
generalPath.lineTo(37.200005, 89.899994);
generalPath.closePath();
generalPath.moveTo(39.400005, 83.600006);
generalPath.lineTo(41.0, 83.600006);
generalPath.curveTo(42.1, 83.600006, 42.7, 83.600006, 43.0, 83.50001);
generalPath.curveTo(43.3, 83.40001, 43.5, 83.30001, 43.6, 83.00001);
generalPath.curveTo(43.699997, 82.80001, 43.8, 82.50001, 43.8, 82.200005);
generalPath.curveTo(43.8, 81.8, 43.7, 81.50001, 43.5, 81.3);
generalPath.curveTo(43.3, 81.100006, 43.0, 80.9, 42.7, 80.9);
generalPath.lineTo(39.4, 80.9);
generalPath.lineTo(39.4, 83.6);
generalPath.closePath();
generalPath.moveTo(47.700005, 84.50001);
generalPath.curveTo(47.700005, 83.40001, 47.900005, 82.50001, 48.200005, 81.700005);
generalPath.curveTo(48.400005, 81.200005, 48.800003, 80.700005, 49.200005, 80.200005);
generalPath.curveTo(49.600006, 79.8, 50.100006, 79.4, 50.600006, 79.200005);
generalPath.curveTo(51.300007, 78.9, 52.100006, 78.8, 52.900005, 78.8);
generalPath.curveTo(54.500004, 78.8, 55.800007, 79.3, 56.700005, 80.3);
generalPath.curveTo(57.700005, 81.3, 58.100006, 82.600006, 58.100006, 84.4);
generalPath.curveTo(58.100006, 86.1, 57.600006, 87.5, 56.700005, 88.5);
generalPath.curveTo(55.700005, 89.5, 54.500004, 90.0, 52.900005, 90.0);
generalPath.curveTo(51.300007, 90.0, 50.000004, 89.5, 49.100006, 88.5);
generalPath.curveTo(48.200005, 87.6, 47.700005, 86.2, 47.700005, 84.5);
generalPath.closePath();
generalPath.moveTo(49.900005, 84.40001);
generalPath.curveTo(49.900005, 85.600006, 50.200005, 86.50001, 50.800007, 87.20001);
generalPath.curveTo(51.400005, 87.80001, 52.100006, 88.10001, 53.000008, 88.10001);
generalPath.curveTo(53.90001, 88.10001, 54.600006, 87.80001, 55.100006, 87.20001);
generalPath.curveTo(55.700005, 86.60001, 55.900005, 85.60001, 55.900005, 84.40001);
generalPath.curveTo(55.900005, 83.20001, 55.600006, 82.30001, 55.100006, 81.600006);
generalPath.curveTo(54.600006, 81.00001, 53.800007, 80.700005, 52.900005, 80.700005);
generalPath.curveTo(52.000004, 80.700005, 51.300007, 81.00001, 50.700005, 81.600006);
generalPath.curveTo(50.200005, 82.3, 49.900005, 83.200005, 49.900005, 84.40001);
generalPath.closePath();
generalPath.moveTo(63.800003, 79.100006);
generalPath.lineTo(66.0, 79.100006);
generalPath.lineTo(66.0, 85.90001);
generalPath.curveTo(66.0, 86.80001, 65.9, 87.50001, 65.8, 88.00001);
generalPath.curveTo(65.600006, 88.600006, 65.200005, 89.100006, 64.600006, 89.50001);
generalPath.curveTo(64.00001, 89.90001, 63.300007, 90.100006, 62.400005, 90.100006);
generalPath.curveTo(61.300007, 90.100006, 60.500004, 89.8, 59.900005, 89.200005);
generalPath.curveTo(59.300007, 88.600006, 59.000004, 87.700005, 59.000004, 86.600006);
generalPath.lineTo(61.100002, 86.40001);
generalPath.curveTo(61.100002, 87.00001, 61.2, 87.50001, 61.4, 87.70001);
generalPath.curveTo(61.600002, 88.10001, 62.0, 88.30001, 62.5, 88.30001);
generalPath.curveTo(63.0, 88.30001, 63.3, 88.20001, 63.5, 87.90001);
generalPath.curveTo(63.7, 87.600006, 63.8, 87.100006, 63.8, 86.20001);
generalPath.lineTo(63.8, 79.10001);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
generalPath.moveTo(28.2, 44.6);
generalPath.curveTo(26.800001, 45.6, 25.5, 46.699997, 24.2, 47.699997);
generalPath.curveTo(21.5, 49.699997, 18.900002, 51.799995, 16.2, 53.799995);
generalPath.curveTo(15.800001, 54.099995, 15.6, 54.099995, 15.200001, 53.899994);
generalPath.curveTo(14.700001, 53.599995, 14.1, 53.299995, 13.500001, 52.999992);
generalPath.curveTo(13.200001, 52.79999, 13.100001, 52.59999, 13.100001, 52.29999);
generalPath.lineTo(13.100001, 31.1);
generalPath.curveTo(13.100001, 30.9, 13.300001, 30.5, 13.500001, 30.4);
generalPath.curveTo(14.100001, 30.0, 14.800001, 29.699999, 15.400001, 29.4);
generalPath.curveTo(15.700001, 29.199999, 16.0, 29.4, 16.300001, 29.6);
generalPath.curveTo(18.500002, 31.300001, 20.7, 33.0, 22.900002, 34.6);
generalPath.curveTo(24.7, 36.0, 26.500002, 37.399998, 28.300001, 38.699997);
generalPath.curveTo(28.400002, 38.6, 28.6, 38.499996, 28.7, 38.399998);
generalPath.curveTo(35.3, 31.999998, 41.9, 25.599998, 48.4, 19.199997);
generalPath.curveTo(48.7, 18.899998, 49.0, 18.799997, 49.4, 18.999996);
generalPath.curveTo(52.2, 20.099997, 55.0, 21.199997, 57.800003, 22.399996);
generalPath.curveTo(58.000004, 22.499996, 58.200005, 22.799995, 58.300003, 22.999996);
generalPath.curveTo(58.4, 23.099997, 58.300003, 23.299995, 58.300003, 23.499996);
generalPath.lineTo(58.300003, 60.0);
generalPath.curveTo(58.300003, 60.9, 58.300003, 60.9, 57.4, 61.2);
generalPath.curveTo(54.7, 62.3, 52.100002, 63.3, 49.5, 64.4);
generalPath.curveTo(49.0, 64.6, 48.7, 64.5, 48.4, 64.200005);
generalPath.curveTo(41.9, 57.800003, 35.4, 51.500004, 28.800001, 45.200005);
generalPath.lineTo(28.2, 44.600006);
generalPath.closePath();
generalPath.moveTo(47.2, 50.399998);
generalPath.lineTo(47.2, 33.0);
generalPath.curveTo(43.3, 35.9, 39.5, 38.8, 35.6, 41.7);
generalPath.curveTo(39.5, 44.600002, 43.3, 47.5, 47.199997, 50.4);
generalPath.closePath();
generalPath.moveTo(22.900002, 41.699997);
generalPath.curveTo(21.000002, 39.999996, 19.100002, 38.299995, 17.100002, 36.499996);
generalPath.lineTo(17.100002, 46.899994);
generalPath.curveTo(19.000002, 45.199993, 20.900002, 43.399994, 22.900002, 41.699993);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.61899948120117, 64.5), new Point2D.Double(35.61899948120117, 18.9060001373291), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(45.0, 27.5);
generalPath.lineTo(45.0, 0.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 73.45700073242188), new Point2D.Double(58.569000244140625, 86.95700073242188), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 101.0f));
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
generalPath.moveTo(45.0, 0.8);
generalPath.lineTo(72.0, 27.5);
generalPath.lineTo(45.0, 27.5);
generalPath.lineTo(45.0, 0.8);
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
	private ext_vbproj() {
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
       ext_vbproj base = new ext_vbproj();
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
       ext_vbproj base = new ext_vbproj();
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
        return ext_vbproj::new;
    }
}

