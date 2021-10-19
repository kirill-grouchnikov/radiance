package org.pushingpixels.radiance.demo.components.svg.filetypes.transcoded;

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
public class ext_json implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(21.450000762939453, 61.54999923706055), new Point2D.Double(21.450000762939453, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(51.70000076293945, 61.45000076293945), new Point2D.Double(51.70000076293945, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(13.3f, 75.8f);
generalPath.lineTo(16.5f, 75.8f);
generalPath.lineTo(16.5f, 85.8f);
generalPath.curveTo(16.5f, 87.100006f, 16.4f, 88.100006f, 16.2f, 88.8f);
generalPath.curveTo(15.900001f, 89.700005f, 15.300001f, 90.5f, 14.500001f, 91.0f);
generalPath.curveTo(13.700001f, 91.6f, 12.600001f, 91.8f, 11.300001f, 91.8f);
generalPath.curveTo(9.700001f, 91.8f, 8.500001f, 91.4f, 7.7000012f, 90.5f);
generalPath.curveTo(6.900001f, 89.6f, 6.4000015f, 88.4f, 6.4000015f, 86.7f);
generalPath.lineTo(9.400002f, 86.399994f);
generalPath.curveTo(9.400002f, 87.299995f, 9.600001f, 87.899994f, 9.800001f, 88.299995f);
generalPath.curveTo(10.100001f, 88.899994f, 10.700001f, 89.1f, 11.400002f, 89.1f);
generalPath.curveTo(12.100001f, 89.1f, 12.600001f, 88.9f, 12.900002f, 88.5f);
generalPath.curveTo(13.200002f, 88.1f, 13.300001f, 87.3f, 13.300001f, 86.0f);
generalPath.lineTo(13.300001f, 75.8f);
generalPath.closePath();
generalPath.moveTo(19.1f, 86.4f);
generalPath.lineTo(22.2f, 86.1f);
generalPath.curveTo(22.400002f, 87.1f, 22.800001f, 87.9f, 23.300001f, 88.4f);
generalPath.curveTo(23.800001f, 88.9f, 24.6f, 89.1f, 25.6f, 89.1f);
generalPath.curveTo(26.6f, 89.1f, 27.4f, 88.9f, 27.9f, 88.4f);
generalPath.curveTo(28.4f, 88.0f, 28.699999f, 87.5f, 28.699999f, 86.9f);
generalPath.curveTo(28.699999f, 86.5f, 28.599998f, 86.200005f, 28.4f, 85.9f);
generalPath.curveTo(28.199999f, 85.6f, 27.8f, 85.4f, 27.3f, 85.200005f);
generalPath.curveTo(26.9f, 85.100006f, 26.099998f, 84.8f, 24.8f, 84.50001f);
generalPath.curveTo(23.099998f, 84.100006f, 21.9f, 83.600006f, 21.199999f, 82.90001f);
generalPath.curveTo(20.199999f, 82.00001f, 19.699999f, 81.00001f, 19.699999f, 79.70001f);
generalPath.curveTo(19.699999f, 78.90001f, 19.9f, 78.10001f, 20.4f, 77.500015f);
generalPath.curveTo(20.9f, 76.80002f, 21.5f, 76.30002f, 22.4f, 75.90002f);
generalPath.curveTo(23.3f, 75.500015f, 24.3f, 75.40002f, 25.5f, 75.40002f);
generalPath.curveTo(27.5f, 75.40002f, 29.0f, 75.80002f, 30.0f, 76.70002f);
generalPath.curveTo(31.0f, 77.60002f, 31.5f, 78.70002f, 31.6f, 80.20002f);
generalPath.lineTo(28.4f, 80.30002f);
generalPath.curveTo(28.3f, 79.500015f, 28.0f, 78.90002f, 27.5f, 78.60002f);
generalPath.curveTo(27.1f, 78.20002f, 26.4f, 78.10002f, 25.5f, 78.10002f);
generalPath.curveTo(24.6f, 78.10002f, 23.9f, 78.30002f, 23.3f, 78.70002f);
generalPath.curveTo(23.0f, 78.90002f, 22.8f, 79.30002f, 22.8f, 79.70002f);
generalPath.curveTo(22.8f, 80.10002f, 23.0f, 80.40002f, 23.3f, 80.70002f);
generalPath.curveTo(23.699999f, 81.00002f, 24.699999f, 81.40002f, 26.199999f, 81.80002f);
generalPath.curveTo(27.699999f, 82.20002f, 28.9f, 82.500015f, 29.599998f, 82.90002f);
generalPath.curveTo(30.3f, 83.30002f, 30.899998f, 83.80002f, 31.3f, 84.500015f);
generalPath.curveTo(31.699999f, 85.20001f, 31.9f, 86.000015f, 31.9f, 87.000015f);
generalPath.curveTo(31.9f, 87.90002f, 31.6f, 88.70001f, 31.1f, 89.500015f);
generalPath.curveTo(30.6f, 90.30002f, 29.9f, 90.90002f, 29.0f, 91.30002f);
generalPath.curveTo(28.1f, 91.70002f, 26.9f, 91.90002f, 25.6f, 91.90002f);
generalPath.curveTo(23.6f, 91.90002f, 22.1f, 91.40002f, 21.0f, 90.500015f);
generalPath.curveTo(19.9f, 89.500015f, 19.3f, 88.20001f, 19.1f, 86.40002f);
generalPath.closePath();
generalPath.moveTo(33.9f, 83.8f);
generalPath.curveTo(33.9f, 82.200005f, 34.100002f, 80.8f, 34.600002f, 79.8f);
generalPath.curveTo(35.000004f, 79.0f, 35.4f, 78.3f, 36.100002f, 77.600006f);
generalPath.curveTo(36.7f, 77.00001f, 37.4f, 76.50001f, 38.100002f, 76.200005f);
generalPath.curveTo(39.100002f, 75.8f, 40.2f, 75.600006f, 41.500004f, 75.600006f);
generalPath.curveTo(43.800003f, 75.600006f, 45.700005f, 76.3f, 47.100002f, 77.8f);
generalPath.curveTo(48.500004f, 79.200005f, 49.2f, 81.200005f, 49.2f, 83.8f);
generalPath.curveTo(49.2f, 86.3f, 48.5f, 88.3f, 47.100002f, 89.8f);
generalPath.curveTo(45.7f, 91.200005f, 43.9f, 92.0f, 41.600002f, 92.0f);
generalPath.curveTo(39.300003f, 92.0f, 37.4f, 91.3f, 36.000004f, 89.9f);
generalPath.curveTo(34.600002f, 88.200005f, 33.900005f, 86.3f, 33.900005f, 83.8f);
generalPath.closePath();
generalPath.moveTo(37.2f, 83.700005f);
generalPath.curveTo(37.2f, 85.50001f, 37.600002f, 86.8f, 38.4f, 87.8f);
generalPath.curveTo(39.2f, 88.700005f, 40.300003f, 89.200005f, 41.5f, 89.200005f);
generalPath.curveTo(42.699997f, 89.200005f, 43.8f, 88.700005f, 44.6f, 87.8f);
generalPath.curveTo(45.399998f, 86.9f, 45.8f, 85.5f, 45.8f, 83.700005f);
generalPath.curveTo(45.8f, 81.9f, 45.399998f, 80.50001f, 44.6f, 79.700005f);
generalPath.curveTo(43.8f, 78.8f, 42.8f, 78.4f, 41.399998f, 78.4f);
generalPath.curveTo(39.999996f, 78.4f, 38.999996f, 78.8f, 38.199997f, 79.700005f);
generalPath.curveTo(37.6f, 80.50001f, 37.199997f, 81.8f, 37.199997f, 83.700005f);
generalPath.closePath();
generalPath.moveTo(51.7f, 91.50001f);
generalPath.lineTo(51.7f, 75.8f);
generalPath.lineTo(54.8f, 75.8f);
generalPath.lineTo(61.2f, 86.3f);
generalPath.lineTo(61.2f, 75.8f);
generalPath.lineTo(64.2f, 75.8f);
generalPath.lineTo(64.2f, 91.5f);
generalPath.lineTo(61.0f, 91.5f);
generalPath.lineTo(54.7f, 81.2f);
generalPath.lineTo(54.7f, 91.5f);
generalPath.lineTo(51.7f, 91.5f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
generalPath.moveTo(45.2f, 43.7f);
generalPath.curveTo(44.4f, 43.4f, 44.0f, 42.7f, 44.0f, 42.0f);
generalPath.curveTo(44.0f, 41.2f, 44.6f, 40.5f, 45.2f, 40.3f);
generalPath.curveTo(45.5f, 40.2f, 45.600002f, 40.0f, 45.5f, 39.7f);
generalPath.curveTo(45.2f, 38.8f, 44.9f, 38.0f, 44.5f, 37.3f);
generalPath.curveTo(44.4f, 37.0f, 44.1f, 37.0f, 43.8f, 37.1f);
generalPath.curveTo(43.5f, 37.199997f, 43.2f, 37.399998f, 42.899998f, 37.399998f);
generalPath.curveTo(41.899998f, 37.399998f, 41.1f, 36.499996f, 41.1f, 35.6f);
generalPath.curveTo(41.1f, 35.3f, 41.199997f, 34.899998f, 41.399998f, 34.699997f);
generalPath.curveTo(41.499996f, 34.399998f, 41.399998f, 34.199997f, 41.199997f, 33.999996f);
generalPath.curveTo(40.399998f, 33.499996f, 39.6f, 33.199997f, 38.799995f, 32.999996f);
generalPath.curveTo(38.499996f, 32.899998f, 38.299995f, 33.099995f, 38.199997f, 33.299995f);
generalPath.curveTo(37.899998f, 34.099995f, 37.199997f, 34.499996f, 36.499996f, 34.499996f);
generalPath.curveTo(35.699997f, 34.499996f, 34.999996f, 33.899998f, 34.799995f, 33.299995f);
generalPath.curveTo(34.699997f, 32.999996f, 34.499996f, 32.899994f, 34.199997f, 32.999996f);
generalPath.curveTo(33.299995f, 33.299995f, 32.499996f, 33.599995f, 31.799997f, 33.999996f);
generalPath.curveTo(31.499998f, 34.099995f, 31.499998f, 34.399998f, 31.599997f, 34.699997f);
generalPath.curveTo(31.799997f, 34.999996f, 31.899996f, 35.299995f, 31.899996f, 35.6f);
generalPath.curveTo(31.899996f, 36.6f, 30.999996f, 37.399998f, 30.099997f, 37.399998f);
generalPath.curveTo(29.799997f, 37.399998f, 29.399996f, 37.3f, 29.199997f, 37.1f);
generalPath.curveTo(28.899998f, 37.0f, 28.699997f, 37.1f, 28.499996f, 37.3f);
generalPath.curveTo(27.999996f, 38.1f, 27.699997f, 38.899998f, 27.499996f, 39.7f);
generalPath.curveTo(27.399996f, 40.0f, 27.599997f, 40.2f, 27.799995f, 40.3f);
generalPath.curveTo(28.599995f, 40.6f, 28.999996f, 41.3f, 28.999996f, 42.0f);
generalPath.curveTo(28.999996f, 42.8f, 28.399996f, 43.5f, 27.799995f, 43.7f);
generalPath.curveTo(27.499996f, 43.8f, 27.399996f, 44.0f, 27.499996f, 44.3f);
generalPath.curveTo(27.799995f, 45.2f, 28.099997f, 46.0f, 28.499996f, 46.7f);
generalPath.curveTo(28.599997f, 47.0f, 28.899996f, 47.0f, 29.199997f, 46.9f);
generalPath.curveTo(29.499996f, 46.7f, 29.799997f, 46.600002f, 30.099997f, 46.600002f);
generalPath.curveTo(31.099997f, 46.600002f, 31.899996f, 47.500004f, 31.899996f, 48.4f);
generalPath.curveTo(31.899996f, 48.7f, 31.799995f, 49.100002f, 31.599997f, 49.300003f);
generalPath.curveTo(31.499996f, 49.600002f, 31.599997f, 49.800003f, 31.799997f, 50.000004f);
generalPath.curveTo(32.6f, 50.500004f, 33.399998f, 50.800003f, 34.199997f, 51.000004f);
generalPath.lineTo(34.299995f, 51.000004f);
generalPath.curveTo(34.499996f, 51.000004f, 34.699997f, 50.900005f, 34.799995f, 50.700005f);
generalPath.curveTo(35.099995f, 49.900005f, 35.799995f, 49.500004f, 36.499996f, 49.500004f);
generalPath.curveTo(37.299995f, 49.500004f, 37.999996f, 50.100002f, 38.199997f, 50.700005f);
generalPath.curveTo(38.299995f, 51.000004f, 38.499996f, 51.100006f, 38.799995f, 51.000004f);
generalPath.curveTo(39.699997f, 50.700005f, 40.499996f, 50.400005f, 41.199997f, 50.000004f);
generalPath.curveTo(41.499996f, 49.900005f, 41.499996f, 49.600002f, 41.399998f, 49.300003f);
generalPath.curveTo(41.3f, 49.000004f, 41.1f, 48.700005f, 41.1f, 48.4f);
generalPath.curveTo(41.1f, 47.4f, 42.0f, 46.600002f, 42.899998f, 46.600002f);
generalPath.curveTo(43.199997f, 46.600002f, 43.6f, 46.7f, 43.8f, 46.9f);
generalPath.curveTo(44.1f, 47.0f, 44.3f, 46.9f, 44.5f, 46.7f);
generalPath.curveTo(45.0f, 45.9f, 45.3f, 45.100002f, 45.5f, 44.3f);
generalPath.curveTo(45.7f, 44.1f, 45.5f, 43.8f, 45.2f, 43.7f);
generalPath.closePath();
generalPath.moveTo(36.4f, 44.8f);
generalPath.curveTo(34.800003f, 44.8f, 33.5f, 43.6f, 33.5f, 41.899998f);
generalPath.curveTo(33.5f, 40.199997f, 34.7f, 38.999996f, 36.4f, 38.999996f);
generalPath.curveTo(38.100002f, 38.999996f, 39.300003f, 40.199997f, 39.300003f, 41.899998f);
generalPath.curveTo(39.300003f, 43.499996f, 38.000004f, 44.8f, 36.4f, 44.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.599998474121094, 50.97999954223633), new Point2D.Double(36.599998474121094, 33.02000045776367), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_json() {
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
       ext_json base = new ext_json();
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
       ext_json base = new ext_json();
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
        return ext_json::new;
    }
}

