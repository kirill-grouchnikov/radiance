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
public class ext_scss implements NeonIcon {
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
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
generalPath.moveTo(14.4f, 44.1f);
generalPath.lineTo(14.4f, 39.199997f);
generalPath.curveTo(15.4f, 39.1f, 16.199999f, 38.999996f, 16.699999f, 38.699997f);
generalPath.curveTo(17.199999f, 38.499996f, 17.599998f, 37.999996f, 17.999998f, 37.499996f);
generalPath.curveTo(18.399998f, 36.899998f, 18.599998f, 36.199997f, 18.799997f, 35.299995f);
generalPath.curveTo(18.899998f, 34.599995f, 18.999998f, 33.499996f, 18.999998f, 31.899996f);
generalPath.curveTo(18.999998f, 29.199995f, 19.099998f, 27.399996f, 19.399998f, 26.299995f);
generalPath.curveTo(19.599998f, 25.299995f, 20.099998f, 24.399996f, 20.699997f, 23.799995f);
generalPath.curveTo(21.299995f, 23.199995f, 22.299997f, 22.699995f, 23.499996f, 22.299995f);
generalPath.curveTo(24.299995f, 22.099995f, 25.599997f, 21.899996f, 27.399996f, 21.899996f);
generalPath.lineTo(28.499996f, 21.899996f);
generalPath.lineTo(28.499996f, 26.799995f);
generalPath.curveTo(26.999996f, 26.799995f, 25.999996f, 26.899996f, 25.599997f, 27.099995f);
generalPath.curveTo(25.199997f, 27.299995f, 24.899996f, 27.499994f, 24.599997f, 27.899994f);
generalPath.curveTo(24.399996f, 28.199993f, 24.299997f, 28.799994f, 24.299997f, 29.699993f);
generalPath.curveTo(24.299997f, 30.599993f, 24.199997f, 32.199993f, 24.099997f, 34.599995f);
generalPath.curveTo(23.999996f, 35.999996f, 23.899996f, 37.099995f, 23.599997f, 37.999996f);
generalPath.curveTo(23.299997f, 38.799995f, 22.899996f, 39.499996f, 22.499996f, 40.099995f);
generalPath.curveTo(22.099997f, 40.599995f, 21.399996f, 41.199993f, 20.499996f, 41.799995f);
generalPath.curveTo(21.299995f, 42.299995f, 21.999996f, 42.799995f, 22.499996f, 43.399994f);
generalPath.curveTo(22.999996f, 43.999992f, 23.399996f, 44.799995f, 23.699997f, 45.699993f);
generalPath.curveTo(23.999998f, 46.59999f, 24.199997f, 47.79999f, 24.199997f, 49.29999f);
generalPath.curveTo(24.299997f, 51.59999f, 24.299997f, 52.999992f, 24.299997f, 53.699993f);
generalPath.curveTo(24.299997f, 54.599995f, 24.399998f, 55.199993f, 24.599997f, 55.599995f);
generalPath.curveTo(24.799997f, 55.999996f, 25.199997f, 56.199993f, 25.599997f, 56.399994f);
generalPath.curveTo(25.999996f, 56.599995f, 26.999996f, 56.699993f, 28.499996f, 56.699993f);
generalPath.lineTo(28.499996f, 61.599995f);
generalPath.lineTo(27.399996f, 61.599995f);
generalPath.curveTo(25.599997f, 61.599995f, 24.099997f, 61.499996f, 23.199997f, 61.199993f);
generalPath.curveTo(22.199997f, 60.899994f, 21.399998f, 60.399994f, 20.699997f, 59.699993f);
generalPath.curveTo(19.999996f, 58.999992f, 19.599997f, 58.199993f, 19.299997f, 57.199993f);
generalPath.curveTo(19.099997f, 56.199993f, 18.999998f, 54.599995f, 18.999998f, 52.399994f);
generalPath.curveTo(18.999998f, 49.899994f, 18.899998f, 48.199993f, 18.699999f, 47.499992f);
generalPath.curveTo(18.4f, 46.399994f, 17.9f, 45.59999f, 17.3f, 45.09999f);
generalPath.curveTo(16.599998f, 44.499992f, 15.699999f, 44.09999f, 14.4f, 44.09999f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.450000762939453, 61.54999923706055), new Point2D.Double(21.450000762939453, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(58.7f, 44.1f);
generalPath.curveTo(57.7f, 44.199997f, 56.9f, 44.3f, 56.4f, 44.6f);
generalPath.curveTo(55.9f, 44.8f, 55.5f, 45.3f, 55.100002f, 45.8f);
generalPath.curveTo(54.7f, 46.399998f, 54.500004f, 47.1f, 54.300003f, 48.0f);
generalPath.curveTo(54.200005f, 48.7f, 54.100002f, 49.8f, 54.100002f, 51.4f);
generalPath.curveTo(54.100002f, 54.100002f, 54.000004f, 55.9f, 53.7f, 57.0f);
generalPath.curveTo(53.5f, 58.1f, 53.0f, 58.9f, 52.4f, 59.5f);
generalPath.curveTo(51.800003f, 60.1f, 50.800003f, 60.6f, 49.600002f, 61.0f);
generalPath.curveTo(48.800003f, 61.2f, 47.500004f, 61.4f, 45.7f, 61.4f);
generalPath.lineTo(44.600002f, 61.4f);
generalPath.lineTo(44.600002f, 56.5f);
generalPath.curveTo(46.100002f, 56.5f, 47.000004f, 56.4f, 47.500004f, 56.2f);
generalPath.curveTo(48.000004f, 56.0f, 48.300003f, 55.7f, 48.500004f, 55.4f);
generalPath.curveTo(48.700005f, 55.100002f, 48.800003f, 54.5f, 48.800003f, 53.600002f);
generalPath.curveTo(48.800003f, 52.800003f, 48.9f, 51.2f, 49.000004f, 48.800003f);
generalPath.curveTo(49.100002f, 47.4f, 49.300003f, 46.200005f, 49.600002f, 45.4f);
generalPath.curveTo(49.9f, 44.5f, 50.300003f, 43.800003f, 50.800003f, 43.2f);
generalPath.curveTo(51.300003f, 42.6f, 51.9f, 42.100002f, 52.700005f, 41.600002f);
generalPath.curveTo(51.700005f, 40.9f, 50.900005f, 40.300003f, 50.500004f, 39.7f);
generalPath.curveTo(49.900005f, 38.8f, 49.400005f, 37.600002f, 49.200005f, 36.3f);
generalPath.curveTo(49.000004f, 35.3f, 48.900005f, 33.2f, 48.900005f, 30.0f);
generalPath.curveTo(48.900005f, 29.0f, 48.800007f, 28.3f, 48.600006f, 27.9f);
generalPath.curveTo(48.400005f, 27.6f, 48.100006f, 27.3f, 47.700005f, 27.1f);
generalPath.curveTo(47.300003f, 26.9f, 46.300003f, 26.800001f, 44.700005f, 26.800001f);
generalPath.lineTo(44.700005f, 22.0f);
generalPath.lineTo(45.800003f, 22.0f);
generalPath.curveTo(47.600002f, 22.0f, 49.100002f, 22.1f, 50.000004f, 22.4f);
generalPath.curveTo(51.000004f, 22.699999f, 51.800003f, 23.199999f, 52.500004f, 23.9f);
generalPath.curveTo(53.200005f, 24.6f, 53.600002f, 25.4f, 53.900005f, 26.4f);
generalPath.curveTo(54.100006f, 27.4f, 54.300007f, 29.0f, 54.300007f, 31.2f);
generalPath.curveTo(54.300007f, 33.7f, 54.400005f, 35.3f, 54.600006f, 36.100002f);
generalPath.curveTo(54.900005f, 37.2f, 55.400005f, 38.000004f, 56.000008f, 38.4f);
generalPath.curveTo(56.600006f, 38.9f, 57.600006f, 39.100002f, 58.800007f, 39.2f);
generalPath.lineTo(58.70001f, 44.100002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(51.70000076293945, 61.45000076293945), new Point2D.Double(51.70000076293945, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
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
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.7f, 86.2f);
generalPath.lineTo(8.9f, 85.899994f);
generalPath.curveTo(9.099999f, 86.99999f, 9.5f, 87.799995f, 10.099999f, 88.299995f);
generalPath.curveTo(10.699999f, 88.799995f, 11.499999f, 89.1f, 12.5f, 89.1f);
generalPath.curveTo(13.6f, 89.1f, 14.4f, 88.9f, 14.9f, 88.4f);
generalPath.curveTo(15.4f, 87.9f, 15.7f, 87.4f, 15.7f, 86.8f);
generalPath.curveTo(15.7f, 86.4f, 15.599999f, 86.100006f, 15.4f, 85.8f);
generalPath.curveTo(15.2f, 85.5f, 14.799999f, 85.3f, 14.2f, 85.100006f);
generalPath.curveTo(13.8f, 85.00001f, 12.9f, 84.700005f, 11.5f, 84.40001f);
generalPath.curveTo(9.7f, 84.00001f, 8.5f, 83.40001f, 7.7f, 82.80001f);
generalPath.curveTo(6.7f, 81.90001f, 6.2f, 80.80001f, 6.2f, 79.50001f);
generalPath.curveTo(6.2f, 78.700005f, 6.3999996f, 77.90001f, 6.8999996f, 77.100006f);
generalPath.curveTo(7.3999996f, 76.40001f, 8.099999f, 75.8f, 9.0f, 75.40001f);
generalPath.curveTo(9.9f, 75.00001f, 11.0f, 74.80001f, 12.2f, 74.80001f);
generalPath.curveTo(14.299999f, 74.80001f, 15.799999f, 75.30001f, 16.9f, 76.20001f);
generalPath.curveTo(17.9f, 77.10001f, 18.5f, 78.30001f, 18.5f, 79.80001f);
generalPath.lineTo(15.2f, 79.90001f);
generalPath.curveTo(15.099999f, 79.100006f, 14.8f, 78.40001f, 14.3f, 78.100006f);
generalPath.curveTo(13.8f, 77.700005f, 13.1f, 77.50001f, 12.200001f, 77.50001f);
generalPath.curveTo(11.200001f, 77.50001f, 10.500001f, 77.700005f, 9.900001f, 78.100006f);
generalPath.curveTo(9.500001f, 78.40001f, 9.400001f, 78.700005f, 9.400001f, 79.100006f);
generalPath.curveTo(9.400001f, 79.50001f, 9.6f, 79.8f, 9.900001f, 80.100006f);
generalPath.curveTo(10.3f, 80.50001f, 11.3f, 80.8f, 13.0f, 81.200005f);
generalPath.curveTo(14.6f, 81.600006f, 15.8f, 82.00001f, 16.6f, 82.4f);
generalPath.curveTo(17.4f, 82.8f, 18.0f, 83.4f, 18.4f, 84.1f);
generalPath.curveTo(18.8f, 84.799995f, 19.1f, 85.7f, 19.1f, 86.7f);
generalPath.curveTo(19.1f, 87.6f, 18.800001f, 88.5f, 18.300001f, 89.399994f);
generalPath.curveTo(17.800001f, 90.2f, 17.000002f, 90.799995f, 16.1f, 91.2f);
generalPath.curveTo(15.199999f, 91.6f, 13.900001f, 91.799995f, 12.5f, 91.799995f);
generalPath.curveTo(10.4f, 91.799995f, 8.8f, 91.299995f, 7.7f, 90.399994f);
generalPath.curveTo(6.5999994f, 89.49999f, 5.8999996f, 87.99999f, 5.7f, 86.2f);
generalPath.closePath();
generalPath.moveTo(32.4f, 85.5f);
generalPath.lineTo(35.600002f, 86.5f);
generalPath.curveTo(35.100002f, 88.3f, 34.300003f, 89.6f, 33.100002f, 90.5f);
generalPath.curveTo(32.000004f, 91.4f, 30.500002f, 91.8f, 28.700003f, 91.8f);
generalPath.curveTo(26.500002f, 91.8f, 24.700003f, 91.100006f, 23.300003f, 89.600006f);
generalPath.curveTo(21.900003f, 88.100006f, 21.200003f, 86.100006f, 21.200003f, 83.50001f);
generalPath.curveTo(21.200003f, 80.80001f, 21.900003f, 78.600006f, 23.300003f, 77.100006f);
generalPath.curveTo(24.700003f, 75.600006f, 26.600002f, 74.8f, 28.900003f, 74.8f);
generalPath.curveTo(30.900003f, 74.8f, 32.500004f, 75.4f, 33.800003f, 76.600006f);
generalPath.curveTo(34.500004f, 77.3f, 35.100002f, 78.3f, 35.500004f, 79.600006f);
generalPath.lineTo(32.200005f, 80.40001f);
generalPath.curveTo(32.000004f, 79.50001f, 31.600004f, 78.90001f, 31.000004f, 78.40001f);
generalPath.curveTo(30.400003f, 77.90001f, 29.600004f, 77.70001f, 28.700005f, 77.70001f);
generalPath.curveTo(27.500004f, 77.70001f, 26.500004f, 78.10001f, 25.700005f, 79.000015f);
generalPath.curveTo(24.900005f, 79.90002f, 24.600004f, 81.30002f, 24.600004f, 83.30002f);
generalPath.curveTo(24.600004f, 85.40002f, 25.000004f, 86.90002f, 25.700005f, 87.70002f);
generalPath.curveTo(26.400005f, 88.50002f, 27.400005f, 89.00002f, 28.600004f, 89.00002f);
generalPath.curveTo(29.500004f, 89.00002f, 30.200005f, 88.70002f, 30.900003f, 88.20002f);
generalPath.curveTo(31.600004f, 87.60002f, 32.100002f, 86.70002f, 32.4f, 85.50002f);
generalPath.closePath();
generalPath.moveTo(37.600002f, 86.2f);
generalPath.lineTo(40.800003f, 85.899994f);
generalPath.curveTo(41.000004f, 86.99999f, 41.4f, 87.799995f, 42.000004f, 88.299995f);
generalPath.curveTo(42.600006f, 88.799995f, 43.400005f, 89.1f, 44.400005f, 89.1f);
generalPath.curveTo(45.500004f, 89.1f, 46.300007f, 88.9f, 46.800007f, 88.4f);
generalPath.curveTo(47.300007f, 87.9f, 47.600006f, 87.4f, 47.600006f, 86.8f);
generalPath.curveTo(47.600006f, 86.4f, 47.500008f, 86.100006f, 47.300007f, 85.8f);
generalPath.curveTo(47.100006f, 85.5f, 46.70001f, 85.3f, 46.100006f, 85.100006f);
generalPath.curveTo(45.700005f, 85.00001f, 44.800007f, 84.700005f, 43.400005f, 84.40001f);
generalPath.curveTo(41.600006f, 84.00001f, 40.400005f, 83.40001f, 39.600006f, 82.80001f);
generalPath.curveTo(38.600006f, 81.90001f, 38.100006f, 80.80001f, 38.100006f, 79.50001f);
generalPath.curveTo(38.100006f, 78.700005f, 38.300007f, 77.90001f, 38.800007f, 77.100006f);
generalPath.curveTo(39.300007f, 76.40001f, 40.000008f, 75.8f, 40.900005f, 75.40001f);
generalPath.curveTo(41.800007f, 75.00001f, 42.900005f, 74.80001f, 44.100006f, 74.80001f);
generalPath.curveTo(46.200005f, 74.80001f, 47.700005f, 75.30001f, 48.800007f, 76.20001f);
generalPath.curveTo(49.800007f, 77.10001f, 50.400005f, 78.30001f, 50.400005f, 79.80001f);
generalPath.lineTo(47.100006f, 79.90001f);
generalPath.curveTo(47.000008f, 79.100006f, 46.700005f, 78.40001f, 46.200005f, 78.100006f);
generalPath.curveTo(45.700005f, 77.700005f, 45.000004f, 77.50001f, 44.100006f, 77.50001f);
generalPath.curveTo(43.100006f, 77.50001f, 42.400005f, 77.700005f, 41.800007f, 78.100006f);
generalPath.curveTo(41.400005f, 78.40001f, 41.300007f, 78.700005f, 41.300007f, 79.100006f);
generalPath.curveTo(41.300007f, 79.50001f, 41.500008f, 79.8f, 41.800007f, 80.100006f);
generalPath.curveTo(42.20001f, 80.50001f, 43.20001f, 80.8f, 44.900005f, 81.200005f);
generalPath.curveTo(46.500004f, 81.600006f, 47.700005f, 82.00001f, 48.500004f, 82.4f);
generalPath.curveTo(49.300003f, 82.8f, 49.900005f, 83.4f, 50.300003f, 84.1f);
generalPath.curveTo(50.700005f, 84.799995f, 51.000004f, 85.7f, 51.000004f, 86.7f);
generalPath.curveTo(51.000004f, 87.6f, 50.700005f, 88.5f, 50.200005f, 89.399994f);
generalPath.curveTo(49.700005f, 90.2f, 48.900005f, 90.799995f, 48.000004f, 91.2f);
generalPath.curveTo(47.000004f, 91.6f, 45.800003f, 91.799995f, 44.400005f, 91.799995f);
generalPath.curveTo(42.300007f, 91.799995f, 40.700005f, 91.299995f, 39.600006f, 90.399994f);
generalPath.curveTo(38.500008f, 89.399994f, 37.800007f, 87.99999f, 37.600006f, 86.2f);
generalPath.closePath();
generalPath.moveTo(53.0f, 86.2f);
generalPath.lineTo(56.2f, 85.899994f);
generalPath.curveTo(56.4f, 86.99999f, 56.8f, 87.799995f, 57.4f, 88.299995f);
generalPath.curveTo(58.000004f, 88.799995f, 58.800003f, 89.1f, 59.800003f, 89.1f);
generalPath.curveTo(60.9f, 89.1f, 61.700005f, 88.9f, 62.200005f, 88.4f);
generalPath.curveTo(62.700005f, 87.9f, 63.000004f, 87.4f, 63.000004f, 86.8f);
generalPath.curveTo(63.000004f, 86.4f, 62.900005f, 86.100006f, 62.700005f, 85.8f);
generalPath.curveTo(62.500004f, 85.5f, 62.100006f, 85.3f, 61.500004f, 85.100006f);
generalPath.curveTo(61.100002f, 85.00001f, 60.200005f, 84.700005f, 58.800003f, 84.40001f);
generalPath.curveTo(57.000004f, 84.00001f, 55.800003f, 83.40001f, 55.000004f, 82.80001f);
generalPath.curveTo(54.000004f, 81.90001f, 53.500004f, 80.80001f, 53.500004f, 79.50001f);
generalPath.curveTo(53.500004f, 78.700005f, 53.700005f, 77.90001f, 54.200005f, 77.100006f);
generalPath.curveTo(54.700005f, 76.40001f, 55.400005f, 75.8f, 56.300003f, 75.40001f);
generalPath.curveTo(57.200005f, 75.00001f, 58.300003f, 74.80001f, 59.500004f, 74.80001f);
generalPath.curveTo(61.600002f, 74.80001f, 63.100002f, 75.30001f, 64.200005f, 76.20001f);
generalPath.curveTo(65.200005f, 77.10001f, 65.8f, 78.30001f, 65.8f, 79.80001f);
generalPath.lineTo(62.500004f, 79.90001f);
generalPath.curveTo(62.400005f, 79.100006f, 62.100002f, 78.40001f, 61.600002f, 78.100006f);
generalPath.curveTo(61.100002f, 77.700005f, 60.4f, 77.50001f, 59.500004f, 77.50001f);
generalPath.curveTo(58.500004f, 77.50001f, 57.800003f, 77.700005f, 57.200005f, 78.100006f);
generalPath.curveTo(56.800003f, 78.40001f, 56.700005f, 78.700005f, 56.700005f, 79.100006f);
generalPath.curveTo(56.700005f, 79.50001f, 56.900005f, 79.8f, 57.200005f, 80.100006f);
generalPath.curveTo(57.600006f, 80.50001f, 58.600006f, 80.8f, 60.300003f, 81.200005f);
generalPath.curveTo(61.9f, 81.600006f, 63.100002f, 82.00001f, 63.9f, 82.4f);
generalPath.curveTo(64.700005f, 82.8f, 65.3f, 83.4f, 65.700005f, 84.1f);
generalPath.curveTo(66.100006f, 84.799995f, 66.4f, 85.7f, 66.4f, 86.7f);
generalPath.curveTo(66.4f, 87.6f, 66.1f, 88.5f, 65.6f, 89.399994f);
generalPath.curveTo(65.1f, 90.2f, 64.299995f, 90.799995f, 63.399998f, 91.2f);
generalPath.curveTo(62.399998f, 91.6f, 61.199997f, 91.799995f, 59.8f, 91.799995f);
generalPath.curveTo(57.7f, 91.799995f, 56.1f, 91.299995f, 55.0f, 90.399994f);
generalPath.curveTo(53.8f, 89.399994f, 53.2f, 87.99999f, 53.0f, 86.2f);
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
	private ext_scss() {
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
    public static NeonIcon of(int width, int height) {
       ext_scss base = new ext_scss();
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
       ext_scss base = new ext_scss();
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
        return ext_scss::new;
    }
}

