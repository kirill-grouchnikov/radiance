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
public class ext_rub implements RadianceIcon {
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
generalPath.moveTo(8.9f, 90.1f);
generalPath.lineTo(8.9f, 70.2f);
generalPath.lineTo(17.4f, 70.2f);
generalPath.curveTo(19.5f, 70.2f, 21.1f, 70.399994f, 22.099998f, 70.7f);
generalPath.curveTo(23.099997f, 71.0f, 23.899998f, 71.7f, 24.399998f, 72.6f);
generalPath.curveTo(24.999998f, 73.5f, 25.299997f, 74.6f, 25.299997f, 75.7f);
generalPath.curveTo(25.299997f, 77.2f, 24.899998f, 78.399994f, 23.999998f, 79.399994f);
generalPath.curveTo(23.099998f, 80.399994f, 21.799997f, 80.99999f, 19.999998f, 81.2f);
generalPath.curveTo(20.899998f, 81.7f, 21.599998f, 82.299995f, 22.199999f, 82.899994f);
generalPath.curveTo(22.8f, 83.49999f, 23.499998f, 84.59999f, 24.499998f, 86.09999f);
generalPath.lineTo(27.0f, 90.0f);
generalPath.lineTo(22.1f, 90.0f);
generalPath.lineTo(19.2f, 85.7f);
generalPath.curveTo(18.2f, 84.2f, 17.400002f, 83.2f, 17.1f, 82.799995f);
generalPath.curveTo(16.7f, 82.399994f, 16.300001f, 82.1f, 15.900001f, 81.99999f);
generalPath.curveTo(15.500001f, 81.899994f, 14.8f, 81.799995f, 13.900001f, 81.799995f);
generalPath.lineTo(13.0f, 81.799995f);
generalPath.lineTo(13.0f, 90.1f);
generalPath.lineTo(8.9f, 90.1f);
generalPath.closePath();
generalPath.moveTo(13.0f, 78.6f);
generalPath.lineTo(16.0f, 78.6f);
generalPath.curveTo(17.9f, 78.6f, 19.2f, 78.5f, 19.6f, 78.4f);
generalPath.curveTo(20.0f, 78.3f, 20.5f, 78.0f, 20.7f, 77.6f);
generalPath.curveTo(21.0f, 77.2f, 21.1f, 76.7f, 21.1f, 76.1f);
generalPath.curveTo(21.1f, 75.4f, 20.9f, 74.9f, 20.6f, 74.5f);
generalPath.curveTo(20.2f, 74.1f, 19.7f, 73.8f, 19.1f, 73.7f);
generalPath.curveTo(18.800001f, 73.7f, 17.800001f, 73.6f, 16.1f, 73.6f);
generalPath.lineTo(13.0f, 73.6f);
generalPath.lineTo(13.0f, 78.6f);
generalPath.closePath();
generalPath.moveTo(29.1f, 70.2f);
generalPath.lineTo(33.2f, 70.2f);
generalPath.lineTo(33.2f, 81.0f);
generalPath.curveTo(33.2f, 82.7f, 33.3f, 83.8f, 33.4f, 84.3f);
generalPath.curveTo(33.600002f, 85.100006f, 34.0f, 85.8f, 34.600002f, 86.3f);
generalPath.curveTo(35.300003f, 86.8f, 36.100002f, 87.0f, 37.300003f, 87.0f);
generalPath.curveTo(38.500004f, 87.0f, 39.300003f, 86.8f, 39.9f, 86.3f);
generalPath.curveTo(40.5f, 85.8f, 40.800003f, 85.3f, 41.0f, 84.600006f);
generalPath.curveTo(41.199997f, 83.90001f, 41.2f, 82.8f, 41.2f, 81.200005f);
generalPath.lineTo(41.2f, 70.200005f);
generalPath.lineTo(45.3f, 70.200005f);
generalPath.lineTo(45.3f, 80.600006f);
generalPath.curveTo(45.3f, 83.00001f, 45.2f, 84.700005f, 45.0f, 85.600006f);
generalPath.curveTo(44.8f, 86.600006f, 44.4f, 87.40001f, 43.8f, 88.100006f);
generalPath.curveTo(43.199997f, 88.8f, 42.399998f, 89.3f, 41.399998f, 89.700005f);
generalPath.curveTo(40.399998f, 90.100006f, 39.1f, 90.3f, 37.499996f, 90.3f);
generalPath.curveTo(35.599995f, 90.3f, 34.099995f, 90.100006f, 33.099995f, 89.600006f);
generalPath.curveTo(32.099995f, 89.200005f, 31.299995f, 88.600006f, 30.699995f, 87.90001f);
generalPath.curveTo(30.099995f, 87.20001f, 29.699995f, 86.50001f, 29.599995f, 85.70001f);
generalPath.curveTo(29.299995f, 84.60001f, 29.199995f, 82.90001f, 29.199995f, 80.70001f);
generalPath.lineTo(29.199995f, 70.2f);
generalPath.closePath();
generalPath.moveTo(49.5f, 70.2f);
generalPath.lineTo(57.5f, 70.2f);
generalPath.curveTo(59.1f, 70.2f, 60.3f, 70.299995f, 61.1f, 70.399994f);
generalPath.curveTo(61.899998f, 70.49999f, 62.6f, 70.799995f, 63.199997f, 71.2f);
generalPath.curveTo(63.799995f, 71.6f, 64.299995f, 72.2f, 64.7f, 72.899994f);
generalPath.curveTo(65.1f, 73.59999f, 65.299995f, 74.399994f, 65.299995f, 75.2f);
generalPath.curveTo(65.299995f, 76.1f, 64.99999f, 77.0f, 64.49999f, 77.799995f);
generalPath.curveTo(63.999992f, 78.59999f, 63.29999f, 79.2f, 62.399994f, 79.49999f);
generalPath.curveTo(63.599995f, 79.899994f, 64.59999f, 80.49999f, 65.2f, 81.299995f);
generalPath.curveTo(65.899994f, 82.1f, 66.2f, 83.1f, 66.2f, 84.299995f);
generalPath.curveTo(66.2f, 85.2f, 66.0f, 86.1f, 65.6f, 86.899994f);
generalPath.curveTo(65.2f, 87.69999f, 64.6f, 88.399994f, 63.899998f, 88.899994f);
generalPath.curveTo(63.199997f, 89.399994f, 62.3f, 89.7f, 61.199997f, 89.799995f);
generalPath.curveTo(60.499996f, 89.899994f, 58.899998f, 89.899994f, 56.299995f, 89.899994f);
generalPath.lineTo(49.499996f, 89.899994f);
generalPath.lineTo(49.499996f, 70.2f);
generalPath.closePath();
generalPath.moveTo(53.5f, 73.5f);
generalPath.lineTo(53.5f, 78.1f);
generalPath.lineTo(56.2f, 78.1f);
generalPath.curveTo(57.8f, 78.1f, 58.8f, 78.1f, 59.100002f, 78.0f);
generalPath.curveTo(59.800003f, 77.9f, 60.300003f, 77.7f, 60.7f, 77.3f);
generalPath.curveTo(61.1f, 76.90001f, 61.3f, 76.4f, 61.3f, 75.8f);
generalPath.curveTo(61.3f, 75.200005f, 61.1f, 74.700005f, 60.8f, 74.3f);
generalPath.curveTo(60.5f, 73.9f, 59.899998f, 73.700005f, 59.3f, 73.600006f);
generalPath.curveTo(58.899998f, 73.600006f, 57.7f, 73.50001f, 55.8f, 73.50001f);
generalPath.lineTo(53.5f, 73.50001f);
generalPath.closePath();
generalPath.moveTo(53.5f, 81.4f);
generalPath.lineTo(53.5f, 86.700005f);
generalPath.lineTo(57.3f, 86.700005f);
generalPath.curveTo(58.8f, 86.700005f, 59.7f, 86.700005f, 60.1f, 86.600006f);
generalPath.curveTo(60.699997f, 86.50001f, 61.199997f, 86.200005f, 61.6f, 85.8f);
generalPath.curveTo(62.0f, 85.4f, 62.199997f, 84.8f, 62.199997f, 84.100006f);
generalPath.curveTo(62.199997f, 83.50001f, 62.1f, 83.00001f, 61.799995f, 82.600006f);
generalPath.curveTo(61.499996f, 82.200005f, 61.099995f, 81.90001f, 60.499996f, 81.700005f);
generalPath.curveTo(59.899998f, 81.50001f, 58.699997f, 81.4f, 56.899998f, 81.4f);
generalPath.lineTo(53.499996f, 81.4f);
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
	private ext_rub() {
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
       ext_rub base = new ext_rub();
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
       ext_rub base = new ext_rub();
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
        return ext_rub::new;
    }
}

