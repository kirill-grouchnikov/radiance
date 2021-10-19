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
public class ext_rb implements RadianceIcon {
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
generalPath.moveTo(19.0f, 90.1f);
generalPath.lineTo(19.0f, 70.2f);
generalPath.lineTo(27.5f, 70.2f);
generalPath.curveTo(29.6f, 70.2f, 31.2f, 70.399994f, 32.2f, 70.7f);
generalPath.curveTo(33.2f, 71.0f, 34.0f, 71.7f, 34.5f, 72.6f);
generalPath.curveTo(35.1f, 73.5f, 35.4f, 74.6f, 35.4f, 75.7f);
generalPath.curveTo(35.4f, 77.2f, 35.0f, 78.399994f, 34.100002f, 79.399994f);
generalPath.curveTo(33.200005f, 80.399994f, 31.900002f, 80.99999f, 30.100002f, 81.2f);
generalPath.curveTo(31.000002f, 81.7f, 31.700003f, 82.299995f, 32.300003f, 82.899994f);
generalPath.curveTo(32.9f, 83.49999f, 33.600002f, 84.59999f, 34.600002f, 86.09999f);
generalPath.lineTo(37.100002f, 89.99999f);
generalPath.lineTo(32.2f, 89.99999f);
generalPath.lineTo(29.300001f, 85.69999f);
generalPath.curveTo(28.300001f, 84.19999f, 27.500002f, 83.19999f, 27.2f, 82.79999f);
generalPath.curveTo(26.800001f, 82.39999f, 26.400002f, 82.09999f, 26.0f, 81.999985f);
generalPath.curveTo(25.6f, 81.89999f, 24.9f, 81.79999f, 24.0f, 81.79999f);
generalPath.lineTo(23.2f, 81.79999f);
generalPath.lineTo(23.2f, 90.09999f);
generalPath.lineTo(19.0f, 90.09999f);
generalPath.closePath();
generalPath.moveTo(23.1f, 78.6f);
generalPath.lineTo(26.1f, 78.6f);
generalPath.curveTo(28.0f, 78.6f, 29.300001f, 78.5f, 29.7f, 78.4f);
generalPath.curveTo(30.1f, 78.3f, 30.6f, 78.0f, 30.800001f, 77.6f);
generalPath.curveTo(31.1f, 77.2f, 31.2f, 76.7f, 31.2f, 76.1f);
generalPath.curveTo(31.2f, 75.4f, 31.0f, 74.9f, 30.7f, 74.5f);
generalPath.curveTo(30.300001f, 74.1f, 29.800001f, 73.8f, 29.2f, 73.7f);
generalPath.curveTo(28.900002f, 73.7f, 27.900002f, 73.6f, 26.2f, 73.6f);
generalPath.lineTo(23.0f, 73.6f);
generalPath.lineTo(23.0f, 78.6f);
generalPath.closePath();
generalPath.moveTo(39.300003f, 70.2f);
generalPath.lineTo(47.300003f, 70.2f);
generalPath.curveTo(48.9f, 70.2f, 50.100002f, 70.299995f, 50.9f, 70.399994f);
generalPath.curveTo(51.7f, 70.49999f, 52.4f, 70.799995f, 53.0f, 71.2f);
generalPath.curveTo(53.6f, 71.6f, 54.1f, 72.2f, 54.5f, 72.899994f);
generalPath.curveTo(54.9f, 73.59999f, 55.1f, 74.399994f, 55.1f, 75.2f);
generalPath.curveTo(55.1f, 76.1f, 54.8f, 77.0f, 54.3f, 77.799995f);
generalPath.curveTo(53.8f, 78.59999f, 53.1f, 79.2f, 52.2f, 79.49999f);
generalPath.curveTo(53.4f, 79.899994f, 54.4f, 80.49999f, 55.0f, 81.299995f);
generalPath.curveTo(55.7f, 82.1f, 56.0f, 83.1f, 56.0f, 84.299995f);
generalPath.curveTo(56.0f, 85.2f, 55.8f, 86.1f, 55.4f, 86.899994f);
generalPath.curveTo(55.000004f, 87.69999f, 54.4f, 88.399994f, 53.7f, 88.899994f);
generalPath.curveTo(53.0f, 89.399994f, 52.100002f, 89.7f, 51.0f, 89.799995f);
generalPath.curveTo(50.3f, 89.899994f, 48.7f, 89.899994f, 46.1f, 89.899994f);
generalPath.lineTo(39.3f, 89.899994f);
generalPath.lineTo(39.3f, 70.2f);
generalPath.closePath();
generalPath.moveTo(43.4f, 73.5f);
generalPath.lineTo(43.4f, 78.1f);
generalPath.lineTo(46.100002f, 78.1f);
generalPath.curveTo(47.7f, 78.1f, 48.7f, 78.1f, 49.100002f, 78.0f);
generalPath.curveTo(49.800003f, 77.9f, 50.300003f, 77.7f, 50.7f, 77.3f);
generalPath.curveTo(51.100002f, 76.9f, 51.3f, 76.4f, 51.3f, 75.8f);
generalPath.curveTo(51.3f, 75.200005f, 51.1f, 74.700005f, 50.8f, 74.3f);
generalPath.curveTo(50.5f, 73.9f, 49.899998f, 73.700005f, 49.3f, 73.600006f);
generalPath.curveTo(48.899998f, 73.600006f, 47.7f, 73.50001f, 45.8f, 73.50001f);
generalPath.lineTo(43.399998f, 73.50001f);
generalPath.closePath();
generalPath.moveTo(43.4f, 81.4f);
generalPath.lineTo(43.4f, 86.700005f);
generalPath.lineTo(47.2f, 86.700005f);
generalPath.curveTo(48.7f, 86.700005f, 49.600002f, 86.700005f, 50.0f, 86.600006f);
generalPath.curveTo(50.6f, 86.50001f, 51.1f, 86.200005f, 51.5f, 85.8f);
generalPath.curveTo(51.9f, 85.4f, 52.1f, 84.8f, 52.1f, 84.100006f);
generalPath.curveTo(52.1f, 83.50001f, 52.0f, 83.00001f, 51.699997f, 82.600006f);
generalPath.curveTo(51.399994f, 82.200005f, 50.999996f, 81.90001f, 50.399998f, 81.700005f);
generalPath.curveTo(49.8f, 81.50001f, 48.6f, 81.4f, 46.8f, 81.4f);
generalPath.lineTo(43.399998f, 81.4f);
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
	private ext_rb() {
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
       ext_rb base = new ext_rb();
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
       ext_rb base = new ext_rb();
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
        return ext_rb::new;
    }
}

