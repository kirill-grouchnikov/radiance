package org.pushingpixels.radiance.demo.theming.main.check.svg.filetypes;

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
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class ext_sys implements RadianceIcon {
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
generalPath.moveTo(9.0f, 85.4f);
generalPath.lineTo(12.9f, 85.0f);
generalPath.curveTo(13.099999f, 86.3f, 13.599999f, 87.3f, 14.299999f, 87.9f);
generalPath.curveTo(14.999999f, 88.5f, 15.999999f, 88.8f, 17.199999f, 88.8f);
generalPath.curveTo(18.499998f, 88.8f, 19.499998f, 88.5f, 20.099998f, 88.0f);
generalPath.curveTo(20.8f, 87.4f, 21.099998f, 86.8f, 21.099998f, 86.1f);
generalPath.curveTo(21.099998f, 85.6f, 20.999998f, 85.2f, 20.699999f, 84.9f);
generalPath.curveTo(20.4f, 84.6f, 19.9f, 84.3f, 19.199999f, 84.0f);
generalPath.curveTo(18.699999f, 83.8f, 17.599998f, 83.5f, 15.999999f, 83.1f);
generalPath.curveTo(13.799999f, 82.6f, 12.299999f, 81.9f, 11.4f, 81.1f);
generalPath.curveTo(10.2f, 80.0f, 9.599999f, 78.7f, 9.599999f, 77.1f);
generalPath.curveTo(9.599999f, 76.1f, 9.9f, 75.1f, 10.499999f, 74.2f);
generalPath.curveTo(11.099999f, 73.299995f, 11.899999f, 72.6f, 12.999999f, 72.2f);
generalPath.curveTo(14.099999f, 71.7f, 15.4f, 71.5f, 16.9f, 71.5f);
generalPath.curveTo(19.4f, 71.5f, 21.3f, 72.1f, 22.599998f, 73.2f);
generalPath.curveTo(23.899998f, 74.299995f, 24.499998f, 75.799995f, 24.599998f, 77.6f);
generalPath.lineTo(20.599998f, 77.799995f);
generalPath.curveTo(20.399998f, 76.799995f, 20.099998f, 75.99999f, 19.499998f, 75.6f);
generalPath.curveTo(18.899998f, 75.1f, 18.099998f, 74.9f, 16.899998f, 74.9f);
generalPath.curveTo(15.699998f, 74.9f, 14.799997f, 75.1f, 14.0999975f, 75.6f);
generalPath.curveTo(13.699998f, 75.9f, 13.499997f, 76.299995f, 13.499997f, 76.799995f);
generalPath.curveTo(13.499997f, 77.299995f, 13.699997f, 77.7f, 14.0999975f, 77.99999f);
generalPath.curveTo(14.5999975f, 78.399994f, 15.899998f, 78.899994f, 17.799997f, 79.299995f);
generalPath.curveTo(19.699997f, 79.7f, 21.199997f, 80.2f, 22.199997f, 80.7f);
generalPath.curveTo(23.199997f, 81.2f, 23.899998f, 81.899994f, 24.399998f, 82.7f);
generalPath.curveTo(24.899998f, 83.5f, 25.199997f, 84.6f, 25.199997f, 85.899994f);
generalPath.curveTo(25.199997f, 86.99999f, 24.899998f, 88.09999f, 24.199997f, 89.09999f);
generalPath.curveTo(23.599997f, 90.09999f, 22.699997f, 90.79999f, 21.499996f, 91.29999f);
generalPath.curveTo(20.299995f, 91.79999f, 18.899996f, 91.999985f, 17.099997f, 91.999985f);
generalPath.curveTo(14.599997f, 91.999985f, 12.599997f, 91.39999f, 11.299996f, 90.19998f);
generalPath.curveTo(10.099997f, 89.29998f, 9.299996f, 87.59998f, 8.999996f, 85.39998f);
generalPath.closePath();
generalPath.moveTo(34.0f, 91.9f);
generalPath.lineTo(34.0f, 83.5f);
generalPath.lineTo(26.7f, 71.9f);
generalPath.lineTo(31.400002f, 71.9f);
generalPath.lineTo(36.100002f, 79.8f);
generalPath.lineTo(40.7f, 71.9f);
generalPath.lineTo(45.4f, 71.9f);
generalPath.lineTo(38.0f, 83.5f);
generalPath.lineTo(38.0f, 91.9f);
generalPath.lineTo(34.0f, 91.9f);
generalPath.closePath();
generalPath.moveTo(46.3f, 85.4f);
generalPath.lineTo(50.2f, 85.0f);
generalPath.curveTo(50.4f, 86.3f, 50.9f, 87.3f, 51.600002f, 87.9f);
generalPath.curveTo(52.300003f, 88.5f, 53.300003f, 88.8f, 54.500004f, 88.8f);
generalPath.curveTo(55.800003f, 88.8f, 56.800003f, 88.5f, 57.400005f, 88.0f);
generalPath.curveTo(58.100006f, 87.4f, 58.400005f, 86.8f, 58.400005f, 86.1f);
generalPath.curveTo(58.400005f, 85.6f, 58.300007f, 85.2f, 58.000004f, 84.9f);
generalPath.curveTo(57.700005f, 84.6f, 57.200005f, 84.3f, 56.500004f, 84.0f);
generalPath.curveTo(56.000004f, 83.8f, 54.900005f, 83.5f, 53.300003f, 83.1f);
generalPath.curveTo(51.100002f, 82.6f, 49.600002f, 81.9f, 48.700005f, 81.1f);
generalPath.curveTo(47.500004f, 80.0f, 46.900005f, 78.7f, 46.900005f, 77.1f);
generalPath.curveTo(46.900005f, 76.1f, 47.200005f, 75.1f, 47.800007f, 74.2f);
generalPath.curveTo(48.400005f, 73.299995f, 49.20001f, 72.6f, 50.300007f, 72.2f);
generalPath.curveTo(51.400005f, 71.7f, 52.70001f, 71.5f, 54.20001f, 71.5f);
generalPath.curveTo(56.70001f, 71.5f, 58.60001f, 72.1f, 59.90001f, 73.2f);
generalPath.curveTo(61.20001f, 74.299995f, 61.80001f, 75.799995f, 61.90001f, 77.6f);
generalPath.lineTo(57.90001f, 77.799995f);
generalPath.curveTo(57.70001f, 76.799995f, 57.40001f, 75.99999f, 56.80001f, 75.6f);
generalPath.curveTo(56.200012f, 75.1f, 55.40001f, 74.9f, 54.200012f, 74.9f);
generalPath.curveTo(53.00001f, 74.9f, 52.100014f, 75.1f, 51.400013f, 75.6f);
generalPath.curveTo(51.00001f, 75.9f, 50.800014f, 76.299995f, 50.800014f, 76.799995f);
generalPath.curveTo(50.800014f, 77.299995f, 51.000015f, 77.7f, 51.400013f, 77.99999f);
generalPath.curveTo(51.900013f, 78.399994f, 53.200012f, 78.899994f, 55.100014f, 79.299995f);
generalPath.curveTo(57.000015f, 79.7f, 58.500015f, 80.2f, 59.500015f, 80.7f);
generalPath.curveTo(60.500015f, 81.2f, 61.200016f, 81.899994f, 61.700016f, 82.7f);
generalPath.curveTo(62.200016f, 83.5f, 62.500015f, 84.6f, 62.500015f, 85.899994f);
generalPath.curveTo(62.500015f, 86.99999f, 62.200016f, 88.09999f, 61.500015f, 89.09999f);
generalPath.curveTo(60.900017f, 90.09999f, 60.000015f, 90.79999f, 58.800014f, 91.29999f);
generalPath.curveTo(57.600014f, 91.79999f, 56.200016f, 91.999985f, 54.400013f, 91.999985f);
generalPath.curveTo(51.900013f, 91.999985f, 49.900013f, 91.39999f, 48.600014f, 90.19998f);
generalPath.curveTo(47.400013f, 89.29998f, 46.600014f, 87.59998f, 46.300014f, 85.39998f);
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
generalPath.moveTo(52.3f, 60.0f);
generalPath.lineTo(40.4f, 48.0f);
generalPath.curveTo(40.300003f, 47.9f, 40.2f, 47.8f, 40.0f, 47.7f);
generalPath.lineTo(42.1f, 45.5f);
generalPath.lineTo(42.399998f, 45.2f);
generalPath.curveTo(45.199997f, 46.3f, 48.499996f, 45.7f, 50.699997f, 43.4f);
generalPath.curveTo(52.299995f, 41.800003f, 53.199997f, 39.5f, 52.999996f, 37.2f);
generalPath.curveTo(52.999996f, 36.9f, 52.799995f, 36.7f, 52.599995f, 36.600002f);
generalPath.curveTo(52.399994f, 36.500004f, 52.099995f, 36.600002f, 51.899994f, 36.800003f);
generalPath.lineTo(48.099995f, 40.600002f);
generalPath.lineTo(44.199993f, 39.600002f);
generalPath.lineTo(43.099995f, 35.600002f);
generalPath.lineTo(46.899994f, 31.800003f);
generalPath.curveTo(47.099995f, 31.600002f, 47.099995f, 31.300003f, 47.099995f, 31.100002f);
generalPath.curveTo(46.999996f, 30.900002f, 46.799995f, 30.700003f, 46.499996f, 30.700003f);
generalPath.curveTo(44.199997f, 30.500002f, 41.899998f, 31.300003f, 40.299995f, 33.000004f);
generalPath.curveTo(37.999996f, 35.300003f, 37.499996f, 38.500004f, 38.499996f, 41.300003f);
generalPath.lineTo(38.199997f, 41.600002f);
generalPath.lineTo(35.1f, 44.600002f);
generalPath.lineTo(29.399998f, 38.9f);
generalPath.lineTo(29.199997f, 38.7f);
generalPath.curveTo(29.299997f, 38.600002f, 29.299997f, 38.5f, 29.399998f, 38.3f);
generalPath.curveTo(30.599998f, 38.5f, 32.8f, 36.2f, 34.699997f, 34.3f);
generalPath.lineTo(29.199997f, 28.8f);
generalPath.curveTo(26.799997f, 31.199999f, 24.999996f, 32.899998f, 25.199997f, 34.1f);
generalPath.curveTo(24.599997f, 34.399998f, 24.099997f, 34.699997f, 23.799997f, 35.1f);
generalPath.lineTo(22.999998f, 35.8f);
generalPath.curveTo(22.499998f, 36.3f, 22.199999f, 36.899998f, 22.099998f, 37.6f);
generalPath.curveTo(21.999998f, 37.699997f, 21.899998f, 37.8f, 21.899998f, 37.899998f);
generalPath.lineTo(21.599998f, 38.3f);
generalPath.lineTo(21.599998f, 38.399998f);
generalPath.lineTo(21.3f, 38.8f);
generalPath.curveTo(21.099998f, 39.0f, 21.0f, 39.3f, 20.9f, 39.5f);
generalPath.curveTo(20.8f, 39.6f, 20.8f, 39.7f, 20.699999f, 39.8f);
generalPath.lineTo(20.599998f, 40.0f);
generalPath.curveTo(20.499998f, 40.3f, 20.3f, 40.5f, 20.199999f, 40.8f);
generalPath.curveTo(20.099998f, 41.1f, 19.9f, 41.5f, 19.8f, 41.899998f);
generalPath.lineTo(19.699999f, 42.1f);
generalPath.curveTo(19.699999f, 42.199997f, 19.599998f, 42.399998f, 19.599998f, 42.5f);
generalPath.lineTo(19.499998f, 43.0f);
generalPath.curveTo(19.399998f, 43.3f, 19.399998f, 43.7f, 19.399998f, 43.9f);
generalPath.lineTo(19.399998f, 45.7f);
generalPath.lineTo(19.499998f, 46.100002f);
generalPath.lineTo(19.499998f, 46.300003f);
generalPath.curveTo(19.499998f, 46.500004f, 19.599998f, 46.700005f, 19.599998f, 46.800003f);
generalPath.lineTo(19.899998f, 47.800003f);
generalPath.curveTo(19.999998f, 48.100002f, 20.299997f, 48.300003f, 20.599998f, 48.300003f);
generalPath.curveTo(20.8f, 48.300003f, 20.899998f, 48.200005f, 20.999998f, 48.100002f);
generalPath.curveTo(21.099998f, 48.000004f, 21.199999f, 47.9f, 21.199999f, 47.7f);
generalPath.lineTo(21.3f, 46.7f);
generalPath.curveTo(21.3f, 46.600002f, 21.3f, 46.5f, 21.4f, 46.4f);
generalPath.curveTo(21.4f, 46.300003f, 21.4f, 46.2f, 21.5f, 46.2f);
generalPath.lineTo(21.6f, 45.8f);
generalPath.curveTo(21.6f, 45.8f, 21.6f, 45.7f, 21.7f, 45.7f);
generalPath.curveTo(21.7f, 45.7f, 21.7f, 45.600002f, 21.800001f, 45.600002f);
generalPath.curveTo(21.800001f, 45.500004f, 21.900002f, 45.4f, 21.900002f, 45.4f);
generalPath.curveTo(22.000002f, 45.2f, 22.000002f, 45.100002f, 22.100002f, 45.0f);
generalPath.curveTo(22.100002f, 44.9f, 22.200003f, 44.9f, 22.200003f, 44.8f);
generalPath.curveTo(22.300003f, 44.6f, 22.400003f, 44.5f, 22.500002f, 44.3f);
generalPath.lineTo(22.700003f, 44.0f);
generalPath.curveTo(22.700003f, 43.9f, 22.800003f, 43.9f, 22.900003f, 43.8f);
generalPath.lineTo(23.000004f, 43.7f);
generalPath.curveTo(23.100004f, 43.5f, 23.300003f, 43.4f, 23.500004f, 43.2f);
generalPath.lineTo(23.600004f, 43.100002f);
generalPath.curveTo(23.700005f, 43.000004f, 23.900003f, 42.9f, 24.000004f, 42.800003f);
generalPath.curveTo(24.100004f, 42.800003f, 24.100004f, 42.700005f, 24.200005f, 42.700005f);
generalPath.curveTo(24.300005f, 42.700005f, 24.300005f, 42.600006f, 24.400005f, 42.600006f);
generalPath.curveTo(24.500006f, 42.500008f, 24.600006f, 42.400005f, 24.800005f, 42.400005f);
generalPath.lineTo(25.100004f, 42.200005f);
generalPath.lineTo(25.400003f, 42.100006f);
generalPath.curveTo(25.500004f, 42.000008f, 25.600004f, 42.000008f, 25.700003f, 42.000008f);
generalPath.curveTo(25.800003f, 42.000008f, 25.800003f, 42.000008f, 25.900003f, 41.90001f);
generalPath.curveTo(26.000004f, 41.90001f, 26.000004f, 41.90001f, 26.000004f, 41.80001f);
generalPath.curveTo(26.100004f, 41.80001f, 26.100004f, 41.80001f, 26.200005f, 41.700012f);
generalPath.lineTo(26.300005f, 41.700012f);
generalPath.curveTo(26.400005f, 41.80001f, 26.500006f, 42.00001f, 26.600004f, 42.100014f);
generalPath.lineTo(32.200005f, 47.700012f);
generalPath.lineTo(19.900005f, 59.100014f);
generalPath.curveTo(18.400005f, 60.600014f, 18.200005f, 62.800014f, 19.700005f, 64.30001f);
generalPath.curveTo(21.200005f, 65.8f, 23.300005f, 65.40001f, 24.800005f, 63.90001f);
generalPath.lineTo(35.400005f, 52.70001f);
generalPath.lineTo(35.600006f, 52.90001f);
generalPath.lineTo(47.500008f, 64.80001f);
generalPath.curveTo(48.800007f, 66.10001f, 51.000008f, 66.10001f, 52.300007f, 64.80001f);
generalPath.curveTo(53.70001f, 63.50001f, 53.70001f, 61.30001f, 52.300007f, 60.00001f);
generalPath.closePath();
generalPath.moveTo(23.199999f, 62.6f);
generalPath.curveTo(22.599998f, 63.199997f, 21.8f, 63.199997f, 21.199999f, 62.6f);
generalPath.curveTo(20.599998f, 62.0f, 20.599998f, 61.199997f, 21.199999f, 60.6f);
generalPath.curveTo(21.8f, 60.0f, 22.599998f, 60.0f, 23.199999f, 60.6f);
generalPath.curveTo(23.699999f, 61.199997f, 23.699999f, 62.1f, 23.199999f, 62.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 65.80799865722656), new Point2D.Double(36.0, 28.808000564575195), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_sys() {
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
       ext_sys base = new ext_sys();
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
       ext_sys base = new ext_sys();
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
        return ext_sys::new;
    }
}

