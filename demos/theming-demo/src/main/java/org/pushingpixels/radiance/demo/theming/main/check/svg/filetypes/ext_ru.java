package org.pushingpixels.radiance.demo.theming.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import java.util.Stack;
import javax.swing.plaf.UIResource;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class ext_ru implements RadianceIcon {
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
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
generalPath.moveTo(18.9f, 90.1f);
generalPath.lineTo(18.9f, 70.2f);
generalPath.lineTo(27.4f, 70.2f);
generalPath.curveTo(29.5f, 70.2f, 31.1f, 70.399994f, 32.1f, 70.7f);
generalPath.curveTo(33.1f, 71.0f, 33.899998f, 71.7f, 34.399998f, 72.6f);
generalPath.curveTo(34.999996f, 73.5f, 35.3f, 74.6f, 35.3f, 75.7f);
generalPath.curveTo(35.3f, 77.2f, 34.899998f, 78.399994f, 34.0f, 79.399994f);
generalPath.curveTo(33.100002f, 80.399994f, 31.8f, 80.99999f, 30.0f, 81.2f);
generalPath.curveTo(30.9f, 81.7f, 31.6f, 82.299995f, 32.2f, 82.899994f);
generalPath.curveTo(32.8f, 83.49999f, 33.5f, 84.59999f, 34.5f, 86.09999f);
generalPath.lineTo(37.0f, 90.0f);
generalPath.lineTo(32.1f, 90.0f);
generalPath.lineTo(29.199999f, 85.7f);
generalPath.curveTo(28.199999f, 84.2f, 27.4f, 83.2f, 27.099998f, 82.799995f);
generalPath.curveTo(26.699999f, 82.399994f, 26.3f, 82.1f, 25.899998f, 81.99999f);
generalPath.curveTo(25.499998f, 81.899994f, 24.799997f, 81.799995f, 23.899998f, 81.799995f);
generalPath.lineTo(23.099998f, 81.799995f);
generalPath.lineTo(23.099998f, 90.1f);
generalPath.lineTo(18.899998f, 90.1f);
generalPath.closePath();
generalPath.moveTo(22.9f, 78.6f);
generalPath.lineTo(25.9f, 78.6f);
generalPath.curveTo(27.8f, 78.6f, 29.1f, 78.5f, 29.5f, 78.4f);
generalPath.curveTo(29.9f, 78.3f, 30.4f, 78.0f, 30.6f, 77.6f);
generalPath.curveTo(30.9f, 77.2f, 31.0f, 76.7f, 31.0f, 76.1f);
generalPath.curveTo(31.0f, 75.4f, 30.8f, 74.9f, 30.5f, 74.5f);
generalPath.curveTo(30.1f, 74.1f, 29.6f, 73.8f, 29.0f, 73.7f);
generalPath.curveTo(28.7f, 73.7f, 27.7f, 73.6f, 26.0f, 73.6f);
generalPath.lineTo(22.8f, 73.6f);
generalPath.lineTo(22.8f, 78.6f);
generalPath.closePath();
generalPath.moveTo(39.1f, 70.2f);
generalPath.lineTo(43.199997f, 70.2f);
generalPath.lineTo(43.199997f, 81.0f);
generalPath.curveTo(43.199997f, 82.7f, 43.199997f, 83.8f, 43.399998f, 84.3f);
generalPath.curveTo(43.6f, 85.100006f, 43.999996f, 85.8f, 44.6f, 86.3f);
generalPath.curveTo(45.3f, 86.8f, 46.1f, 87.0f, 47.3f, 87.0f);
generalPath.curveTo(48.5f, 87.0f, 49.3f, 86.8f, 49.899998f, 86.3f);
generalPath.curveTo(50.499996f, 85.8f, 50.8f, 85.3f, 50.999996f, 84.600006f);
generalPath.curveTo(51.199993f, 83.90001f, 51.199997f, 82.8f, 51.199997f, 81.200005f);
generalPath.lineTo(51.199997f, 70.200005f);
generalPath.lineTo(55.299995f, 70.200005f);
generalPath.lineTo(55.299995f, 80.600006f);
generalPath.curveTo(55.299995f, 83.00001f, 55.199997f, 84.700005f, 54.999996f, 85.600006f);
generalPath.curveTo(54.799995f, 86.600006f, 54.399998f, 87.40001f, 53.799995f, 88.100006f);
generalPath.curveTo(53.199993f, 88.8f, 52.399994f, 89.3f, 51.399994f, 89.700005f);
generalPath.curveTo(50.399994f, 90.100006f, 49.099995f, 90.3f, 47.499992f, 90.3f);
generalPath.curveTo(45.59999f, 90.3f, 44.09999f, 90.100006f, 43.09999f, 89.600006f);
generalPath.curveTo(42.09999f, 89.200005f, 41.29999f, 88.600006f, 40.69999f, 87.90001f);
generalPath.curveTo(40.09999f, 87.20001f, 39.69999f, 86.50001f, 39.59999f, 85.70001f);
generalPath.curveTo(39.29999f, 84.60001f, 39.19999f, 82.90001f, 39.19999f, 80.70001f);
generalPath.lineTo(39.19999f, 70.2f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
generalPath.moveTo(31.8f, 32.0f);
generalPath.curveTo(31.699999f, 32.1f, 31.699999f, 32.1f, 31.8f, 32.0f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(54.0f, 23.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(54.0f, 23.5f);
generalPath.closePath();
generalPath.moveTo(18.0f, 59.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(18.0f, 59.5f);
generalPath.closePath();
generalPath.moveTo(27.0f, 50.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 41.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(18.0f, 50.5f);
generalPath.lineTo(18.0f, 59.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(18.0f, 50.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 41.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(45.0f, 32.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.closePath();
generalPath.moveTo(54.0f, 23.5f);
generalPath.lineTo(45.0f, 23.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(54.0f, 23.5f);
generalPath.closePath();
generalPath.moveTo(27.0f, 41.5f);
generalPath.lineTo(18.0f, 50.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 32.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.closePath();
generalPath.moveTo(45.0f, 23.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(45.0f, 23.5f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0, 60.5), new Point2D.Double(54.0, 60.5), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(54.0f, 23.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(54.0f, 23.5f);
generalPath.closePath();
generalPath.moveTo(18.0f, 59.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(18.0f, 59.5f);
generalPath.closePath();
generalPath.moveTo(27.0f, 50.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 41.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(18.0f, 50.5f);
generalPath.lineTo(18.0f, 59.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(18.0f, 50.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 41.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(45.0f, 32.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.closePath();
generalPath.moveTo(54.0f, 23.5f);
generalPath.lineTo(45.0f, 23.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(54.0f, 23.5f);
generalPath.closePath();
generalPath.moveTo(27.0f, 41.5f);
generalPath.lineTo(18.0f, 50.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 32.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.closePath();
generalPath.moveTo(45.0f, 23.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(45.0f, 23.5f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(54.0f, 23.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(54.0f, 23.5f);
generalPath.closePath();
generalPath.moveTo(18.0f, 59.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(18.0f, 59.5f);
generalPath.closePath();
generalPath.moveTo(27.0f, 50.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 41.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(18.0f, 50.5f);
generalPath.lineTo(18.0f, 59.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(18.0f, 50.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 41.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(45.0f, 32.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.closePath();
generalPath.moveTo(54.0f, 23.5f);
generalPath.lineTo(45.0f, 23.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(54.0f, 23.5f);
generalPath.closePath();
generalPath.moveTo(27.0f, 41.5f);
generalPath.lineTo(18.0f, 50.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 32.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.closePath();
generalPath.moveTo(45.0f, 23.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(45.0f, 23.5f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
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
        return 0.13099998235702515;
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
		return 0.7420000433921814;
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
	private ext_ru() {
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
       ext_ru base = new ext_ru();
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
       ext_ru base = new ext_ru();
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
        return ext_ru::new;
    }
}

