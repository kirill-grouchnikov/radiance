package org.pushingpixels.radiance.demo.laf.main.check.svg.filetypes;

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
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_sol implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.0), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 74.18699645996094), new Point2D.Double(58.5369987487793, 87.68699645996094), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(8.9f, 85.4f);
generalPath.lineTo(12.799999f, 85.0f);
generalPath.curveTo(12.999999f, 86.3f, 13.499999f, 87.3f, 14.199999f, 87.9f);
generalPath.curveTo(14.899999f, 88.5f, 15.899999f, 88.8f, 17.099998f, 88.8f);
generalPath.curveTo(18.399998f, 88.8f, 19.399998f, 88.5f, 19.999998f, 88.0f);
generalPath.curveTo(20.699999f, 87.4f, 20.999998f, 86.8f, 20.999998f, 86.1f);
generalPath.curveTo(20.999998f, 85.6f, 20.899998f, 85.2f, 20.599998f, 84.9f);
generalPath.curveTo(20.3f, 84.6f, 19.8f, 84.3f, 19.099998f, 84.0f);
generalPath.curveTo(18.599998f, 83.8f, 17.499998f, 83.5f, 15.899999f, 83.1f);
generalPath.curveTo(13.699999f, 82.6f, 12.199999f, 81.9f, 11.299999f, 81.1f);
generalPath.curveTo(10.099999f, 80.0f, 9.499999f, 78.7f, 9.499999f, 77.1f);
generalPath.curveTo(9.499999f, 76.1f, 9.799999f, 75.1f, 10.399999f, 74.2f);
generalPath.curveTo(10.999999f, 73.299995f, 11.799998f, 72.6f, 12.899999f, 72.2f);
generalPath.curveTo(13.999999f, 71.7f, 15.299999f, 71.5f, 16.8f, 71.5f);
generalPath.curveTo(19.3f, 71.5f, 21.199999f, 72.1f, 22.5f, 73.2f);
generalPath.curveTo(23.800001f, 74.299995f, 24.4f, 75.799995f, 24.5f, 77.6f);
generalPath.lineTo(20.5f, 77.799995f);
generalPath.curveTo(20.3f, 76.799995f, 20.0f, 75.99999f, 19.4f, 75.6f);
generalPath.curveTo(18.8f, 75.1f, 18.0f, 74.9f, 16.8f, 74.9f);
generalPath.curveTo(15.599999f, 74.9f, 14.699999f, 75.1f, 13.999999f, 75.6f);
generalPath.curveTo(13.599999f, 75.9f, 13.399999f, 76.299995f, 13.399999f, 76.799995f);
generalPath.curveTo(13.399999f, 77.299995f, 13.599998f, 77.7f, 13.999999f, 77.99999f);
generalPath.curveTo(14.499999f, 78.399994f, 15.799999f, 78.899994f, 17.699999f, 79.299995f);
generalPath.curveTo(19.599998f, 79.7f, 21.099998f, 80.2f, 22.099998f, 80.7f);
generalPath.curveTo(23.099998f, 81.2f, 23.8f, 81.899994f, 24.3f, 82.7f);
generalPath.curveTo(24.8f, 83.5f, 25.099998f, 84.6f, 25.099998f, 85.899994f);
generalPath.curveTo(25.099998f, 86.99999f, 24.8f, 88.09999f, 24.099998f, 89.09999f);
generalPath.curveTo(23.499998f, 90.09999f, 22.599998f, 90.79999f, 21.399998f, 91.29999f);
generalPath.curveTo(20.199997f, 91.79999f, 18.799997f, 91.999985f, 16.999998f, 91.999985f);
generalPath.curveTo(14.499998f, 91.999985f, 12.499998f, 91.39999f, 11.199998f, 90.19998f);
generalPath.curveTo(9.899998f, 89.29998f, 9.099998f, 87.59998f, 8.899998f, 85.39998f);
generalPath.closePath();
generalPath.moveTo(27.7f, 82.0f);
generalPath.curveTo(27.7f, 80.0f, 28.0f, 78.2f, 28.6f, 76.9f);
generalPath.curveTo(29.1f, 75.9f, 29.7f, 75.0f, 30.5f, 74.200005f);
generalPath.curveTo(31.3f, 73.4f, 32.2f, 72.8f, 33.1f, 72.4f);
generalPath.curveTo(34.3f, 71.9f, 35.8f, 71.6f, 37.399998f, 71.6f);
generalPath.curveTo(40.399998f, 71.6f, 42.699997f, 72.5f, 44.499996f, 74.299995f);
generalPath.curveTo(46.299995f, 76.1f, 47.199997f, 78.7f, 47.199997f, 81.899994f);
generalPath.curveTo(47.199997f, 85.09999f, 46.299995f, 87.7f, 44.6f, 89.49999f);
generalPath.curveTo(42.8f, 91.299995f, 40.5f, 92.19999f, 37.5f, 92.19999f);
generalPath.curveTo(34.5f, 92.19999f, 32.1f, 91.29999f, 30.4f, 89.49999f);
generalPath.curveTo(28.6f, 87.69999f, 27.699999f, 85.19999f, 27.699999f, 81.99999f);
generalPath.closePath();
generalPath.moveTo(31.900002f, 81.8f);
generalPath.curveTo(31.900002f, 84.100006f, 32.4f, 85.8f, 33.5f, 87.0f);
generalPath.curveTo(34.5f, 88.2f, 35.9f, 88.8f, 37.5f, 88.8f);
generalPath.curveTo(39.1f, 88.8f, 40.4f, 88.200005f, 41.5f, 87.100006f);
generalPath.curveTo(42.5f, 85.90001f, 43.1f, 84.200005f, 43.1f, 81.90001f);
generalPath.curveTo(43.1f, 79.600006f, 42.6f, 77.90001f, 41.6f, 76.80001f);
generalPath.curveTo(40.6f, 75.70001f, 39.3f, 75.10001f, 37.6f, 75.10001f);
generalPath.curveTo(35.899998f, 75.10001f, 34.6f, 75.70001f, 33.6f, 76.80001f);
generalPath.curveTo(32.399998f, 77.80001f, 31.899998f, 79.50001f, 31.899998f, 81.80001f);
generalPath.closePath();
generalPath.moveTo(50.5f, 91.9f);
generalPath.lineTo(50.5f, 72.0f);
generalPath.lineTo(54.5f, 72.0f);
generalPath.lineTo(54.5f, 88.5f);
generalPath.lineTo(64.6f, 88.5f);
generalPath.lineTo(64.6f, 91.9f);
generalPath.lineTo(50.5f, 91.9f);
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
shape = new Ellipse2D.Double(24.799999237060547, 34.79999923706055, 22.399999618530273, 22.399999618530273);
paint = new LinearGradientPaint(new Point2D.Double(24.767000198364258, 54.0), new Point2D.Double(47.233001708984375, 54.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(35.2f, 33.4f);
generalPath.lineTo(36.8f, 33.4f);
generalPath.curveTo(37.3f, 33.4f, 37.7f, 33.0f, 37.7f, 32.5f);
generalPath.lineTo(37.7f, 26.9f);
generalPath.curveTo(37.7f, 26.4f, 37.3f, 26.0f, 36.8f, 26.0f);
generalPath.lineTo(35.2f, 26.0f);
generalPath.curveTo(34.7f, 26.0f, 34.3f, 26.4f, 34.3f, 26.9f);
generalPath.lineTo(34.3f, 32.5f);
generalPath.curveTo(34.3f, 33.0f, 34.7f, 33.4f, 35.2f, 33.4f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.28799819946289, 70.30000305175781), new Point2D.Double(37.71200180053711, 70.30000305175781), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(48.6f, 45.2f);
generalPath.lineTo(48.6f, 46.8f);
generalPath.curveTo(48.6f, 47.3f, 49.0f, 47.7f, 49.5f, 47.7f);
generalPath.lineTo(55.1f, 47.7f);
generalPath.curveTo(55.6f, 47.7f, 56.0f, 47.3f, 56.0f, 46.8f);
generalPath.lineTo(56.0f, 45.2f);
generalPath.curveTo(56.0f, 44.7f, 55.6f, 44.3f, 55.1f, 44.3f);
generalPath.lineTo(49.5f, 44.3f);
generalPath.curveTo(49.0f, 44.3f, 48.6f, 44.7f, 48.6f, 45.2f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(48.55699920654297, 54.0), new Point2D.Double(56.0, 54.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(36.8f, 66.0f);
generalPath.curveTo(37.3f, 66.0f, 37.7f, 65.6f, 37.7f, 65.1f);
generalPath.lineTo(37.7f, 59.5f);
generalPath.curveTo(37.7f, 59.0f, 37.3f, 58.6f, 36.8f, 58.6f);
generalPath.lineTo(35.2f, 58.6f);
generalPath.curveTo(34.7f, 58.6f, 34.3f, 59.0f, 34.3f, 59.5f);
generalPath.lineTo(34.3f, 65.1f);
generalPath.curveTo(34.3f, 65.6f, 34.7f, 66.0f, 35.2f, 66.0f);
generalPath.lineTo(36.8f, 66.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(34.28799819946289, 37.70000076293945), new Point2D.Double(37.71200180053711, 37.70000076293945), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(16.9f, 47.7f);
generalPath.lineTo(22.5f, 47.7f);
generalPath.curveTo(23.0f, 47.7f, 23.4f, 47.3f, 23.4f, 46.8f);
generalPath.lineTo(23.4f, 45.2f);
generalPath.curveTo(23.4f, 44.7f, 23.0f, 44.3f, 22.5f, 44.3f);
generalPath.lineTo(16.9f, 44.3f);
generalPath.curveTo(16.4f, 44.3f, 16.0f, 44.7f, 16.0f, 45.2f);
generalPath.lineTo(16.0f, 46.8f);
generalPath.curveTo(16.0f, 47.3f, 16.4f, 47.7f, 16.9f, 47.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(16.0, 54.0), new Point2D.Double(23.44300079345703, 54.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(45.4f, 37.7f);
generalPath.curveTo(45.800003f, 38.100002f, 46.300003f, 38.100002f, 46.7f, 37.7f);
generalPath.lineTo(50.7f, 33.7f);
generalPath.curveTo(51.100002f, 33.3f, 51.100002f, 32.8f, 50.7f, 32.4f);
generalPath.lineTo(49.600002f, 31.300001f);
generalPath.curveTo(49.2f, 30.900002f, 48.7f, 30.900002f, 48.300003f, 31.300001f);
generalPath.lineTo(44.300003f, 35.300003f);
generalPath.curveTo(43.9f, 35.700005f, 43.9f, 36.200005f, 44.300003f, 36.600002f);
generalPath.lineTo(45.4f, 37.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.047000885009766, 65.5), new Point2D.Double(50.974998474121094, 65.5), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(49.6f, 60.7f);
generalPath.lineTo(50.699997f, 59.600002f);
generalPath.curveTo(51.1f, 59.2f, 51.1f, 58.7f, 50.699997f, 58.300003f);
generalPath.lineTo(46.699997f, 54.300003f);
generalPath.curveTo(46.299995f, 53.9f, 45.799995f, 53.9f, 45.399998f, 54.300003f);
generalPath.lineTo(44.3f, 55.4f);
generalPath.curveTo(43.899998f, 55.800003f, 43.899998f, 56.300003f, 44.3f, 56.7f);
generalPath.lineTo(48.3f, 60.7f);
generalPath.curveTo(48.6f, 61.100002f, 49.2f, 61.100002f, 49.6f, 60.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.047000885009766, 42.5), new Point2D.Double(50.974998474121094, 42.5), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(23.7f, 60.7f);
generalPath.lineTo(27.7f, 56.7f);
generalPath.curveTo(28.1f, 56.3f, 28.1f, 55.8f, 27.7f, 55.4f);
generalPath.lineTo(26.6f, 54.300003f);
generalPath.curveTo(26.2f, 53.9f, 25.7f, 53.9f, 25.300001f, 54.300003f);
generalPath.lineTo(21.300001f, 58.300003f);
generalPath.curveTo(20.900002f, 58.700005f, 20.900002f, 59.200005f, 21.300001f, 59.600002f);
generalPath.lineTo(22.400002f, 60.7f);
generalPath.curveTo(22.800001f, 61.100002f, 23.400002f, 61.100002f, 23.7f, 60.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.024999618530273, 42.5), new Point2D.Double(27.952999114990234, 42.5), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(25.3f, 37.7f);
generalPath.curveTo(25.699999f, 38.100002f, 26.199999f, 38.100002f, 26.599998f, 37.7f);
generalPath.lineTo(27.699999f, 36.600002f);
generalPath.curveTo(28.099998f, 36.2f, 28.099998f, 35.7f, 27.699999f, 35.300003f);
generalPath.lineTo(23.699999f, 31.300003f);
generalPath.curveTo(23.3f, 30.900003f, 22.8f, 30.900003f, 22.4f, 31.300003f);
generalPath.lineTo(21.3f, 32.4f);
generalPath.curveTo(20.9f, 32.800003f, 20.9f, 33.300003f, 21.3f, 33.7f);
generalPath.lineTo(25.3f, 37.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.024999618530273, 65.5), new Point2D.Double(27.952999114990234, 65.5), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
    public static RadianceIconUIResource uiResourceOf(int width, int height) {
       ext_sol base = new ext_sol();
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
        return ext_sol::new;
    }
}

