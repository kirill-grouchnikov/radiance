package org.pushingpixels.radiance.demo.component.svg.filetypes.transcoded;

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
public class ext_data implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
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
generalPath.moveTo(35.8f, 22.8f);
generalPath.curveTo(32.0f, 22.8f, 28.9f, 26.4f, 28.9f, 30.9f);
generalPath.curveTo(28.9f, 35.4f, 32.0f, 39.0f, 35.8f, 39.0f);
generalPath.curveTo(39.6f, 39.0f, 42.7f, 35.4f, 42.7f, 30.9f);
generalPath.curveTo(42.7f, 26.399998f, 39.600002f, 22.8f, 35.8f, 22.8f);
generalPath.closePath();
generalPath.moveTo(35.8f, 35.9f);
generalPath.curveTo(33.7f, 35.9f, 31.9f, 33.7f, 31.9f, 30.900002f);
generalPath.curveTo(31.9f, 28.100002f, 33.6f, 25.900002f, 35.8f, 25.900002f);
generalPath.curveTo(37.899998f, 25.900002f, 39.7f, 28.100002f, 39.7f, 30.900002f);
generalPath.curveTo(39.600002f, 33.600002f, 37.9f, 35.9f, 35.8f, 35.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.79399871826172, 38.97600173950195), new Point2D.Double(35.79399871826172, 22.783000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(35.79399871826172, 39.47600173950195), new Point2D.Double(35.79399871826172, 22.283000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.8f, 22.8f);
generalPath.curveTo(32.0f, 22.8f, 28.9f, 26.4f, 28.9f, 30.9f);
generalPath.curveTo(28.9f, 35.4f, 32.0f, 39.0f, 35.8f, 39.0f);
generalPath.curveTo(39.6f, 39.0f, 42.7f, 35.4f, 42.7f, 30.9f);
generalPath.curveTo(42.7f, 26.399998f, 39.600002f, 22.8f, 35.8f, 22.8f);
generalPath.closePath();
generalPath.moveTo(35.8f, 35.9f);
generalPath.curveTo(33.7f, 35.9f, 31.9f, 33.7f, 31.9f, 30.900002f);
generalPath.curveTo(31.9f, 28.100002f, 33.6f, 25.900002f, 35.8f, 25.900002f);
generalPath.curveTo(37.899998f, 25.900002f, 39.7f, 28.100002f, 39.7f, 30.900002f);
generalPath.curveTo(39.600002f, 33.600002f, 37.9f, 35.9f, 35.8f, 35.9f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(21.8f, 37.4f);
generalPath.lineTo(21.8f, 24.3f);
generalPath.curveTo(21.8f, 23.4f, 21.099998f, 22.8f, 20.3f, 22.8f);
generalPath.curveTo(19.4f, 22.8f, 18.8f, 23.5f, 18.8f, 24.3f);
generalPath.lineTo(18.8f, 37.4f);
generalPath.curveTo(18.8f, 38.300003f, 19.5f, 38.9f, 20.3f, 38.9f);
generalPath.curveTo(21.099998f, 39.0f, 21.8f, 38.300003f, 21.8f, 37.4f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(20.25, 38.97600173950195), new Point2D.Double(20.25, 22.783000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(20.25, 39.47600173950195), new Point2D.Double(20.25, 22.283000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(21.8f, 37.4f);
generalPath.lineTo(21.8f, 24.3f);
generalPath.curveTo(21.8f, 23.4f, 21.099998f, 22.8f, 20.3f, 22.8f);
generalPath.curveTo(19.4f, 22.8f, 18.8f, 23.5f, 18.8f, 24.3f);
generalPath.lineTo(18.8f, 37.4f);
generalPath.curveTo(18.8f, 38.300003f, 19.5f, 38.9f, 20.3f, 38.9f);
generalPath.curveTo(21.099998f, 39.0f, 21.8f, 38.300003f, 21.8f, 37.4f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(20.2f, 46.5f);
generalPath.curveTo(16.400002f, 46.5f, 13.300001f, 50.1f, 13.300001f, 54.6f);
generalPath.curveTo(13.300001f, 59.1f, 16.400002f, 62.699997f, 20.2f, 62.699997f);
generalPath.curveTo(24.0f, 62.699997f, 27.1f, 59.1f, 27.1f, 54.6f);
generalPath.curveTo(27.2f, 50.1f, 24.1f, 46.5f, 20.2f, 46.5f);
generalPath.closePath();
generalPath.moveTo(20.2f, 59.6f);
generalPath.curveTo(18.1f, 59.6f, 16.300001f, 57.399998f, 16.300001f, 54.6f);
generalPath.curveTo(16.300001f, 51.8f, 18.000002f, 49.6f, 20.2f, 49.6f);
generalPath.curveTo(22.4f, 49.6f, 24.1f, 51.8f, 24.1f, 54.6f);
generalPath.curveTo(24.1f, 57.3f, 22.4f, 59.6f, 20.2f, 59.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(20.25, 62.64899826049805), new Point2D.Double(20.25, 46.457000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(20.25, 63.14899826049805), new Point2D.Double(20.25, 45.957000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.2f, 46.5f);
generalPath.curveTo(16.400002f, 46.5f, 13.300001f, 50.1f, 13.300001f, 54.6f);
generalPath.curveTo(13.300001f, 59.1f, 16.400002f, 62.699997f, 20.2f, 62.699997f);
generalPath.curveTo(24.0f, 62.699997f, 27.1f, 59.1f, 27.1f, 54.6f);
generalPath.curveTo(27.2f, 50.1f, 24.1f, 46.5f, 20.2f, 46.5f);
generalPath.closePath();
generalPath.moveTo(20.2f, 59.6f);
generalPath.curveTo(18.1f, 59.6f, 16.300001f, 57.399998f, 16.300001f, 54.6f);
generalPath.curveTo(16.300001f, 51.8f, 18.000002f, 49.6f, 20.2f, 49.6f);
generalPath.curveTo(22.4f, 49.6f, 24.1f, 51.8f, 24.1f, 54.6f);
generalPath.curveTo(24.1f, 57.3f, 22.4f, 59.6f, 20.2f, 59.6f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(37.3f, 61.1f);
generalPath.lineTo(37.3f, 48.0f);
generalPath.curveTo(37.3f, 47.1f, 36.6f, 46.5f, 35.8f, 46.5f);
generalPath.curveTo(34.899998f, 46.5f, 34.3f, 47.2f, 34.3f, 48.0f);
generalPath.lineTo(34.3f, 61.1f);
generalPath.curveTo(34.3f, 62.0f, 35.0f, 62.6f, 35.8f, 62.6f);
generalPath.curveTo(36.6f, 62.6f, 37.3f, 62.0f, 37.3f, 61.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.79399871826172, 62.64899826049805), new Point2D.Double(35.79399871826172, 46.457000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(35.79399871826172, 63.14899826049805), new Point2D.Double(35.79399871826172, 45.957000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(37.3f, 61.1f);
generalPath.lineTo(37.3f, 48.0f);
generalPath.curveTo(37.3f, 47.1f, 36.6f, 46.5f, 35.8f, 46.5f);
generalPath.curveTo(34.899998f, 46.5f, 34.3f, 47.2f, 34.3f, 48.0f);
generalPath.lineTo(34.3f, 61.1f);
generalPath.curveTo(34.3f, 62.0f, 35.0f, 62.6f, 35.8f, 62.6f);
generalPath.curveTo(36.6f, 62.6f, 37.3f, 62.0f, 37.3f, 61.1f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(53.3f, 38.6f);
generalPath.lineTo(53.3f, 25.5f);
generalPath.curveTo(53.3f, 24.6f, 52.6f, 24.0f, 51.8f, 24.0f);
generalPath.curveTo(50.899998f, 24.0f, 50.3f, 24.7f, 50.3f, 25.5f);
generalPath.lineTo(50.3f, 38.6f);
generalPath.curveTo(50.3f, 39.5f, 51.0f, 40.1f, 51.8f, 40.1f);
generalPath.curveTo(52.6f, 40.1f, 53.3f, 39.399998f, 53.3f, 38.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(51.750999450683594, 40.11000061035156), new Point2D.Double(51.750999450683594, 23.917999267578125), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(51.750999450683594, 40.61000061035156), new Point2D.Double(51.750999450683594, 23.417999267578125), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.3f, 38.6f);
generalPath.lineTo(53.3f, 25.5f);
generalPath.curveTo(53.3f, 24.6f, 52.6f, 24.0f, 51.8f, 24.0f);
generalPath.curveTo(50.899998f, 24.0f, 50.3f, 24.7f, 50.3f, 25.5f);
generalPath.lineTo(50.3f, 38.6f);
generalPath.curveTo(50.3f, 39.5f, 51.0f, 40.1f, 51.8f, 40.1f);
generalPath.curveTo(52.6f, 40.1f, 53.3f, 39.399998f, 53.3f, 38.6f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(51.8f, 47.6f);
generalPath.curveTo(48.0f, 47.6f, 44.899998f, 51.199997f, 44.899998f, 55.699997f);
generalPath.curveTo(44.899998f, 60.199997f, 47.999996f, 63.799995f, 51.8f, 63.799995f);
generalPath.curveTo(55.600002f, 63.799995f, 58.7f, 60.199997f, 58.7f, 55.699997f);
generalPath.curveTo(58.7f, 51.199997f, 55.600002f, 47.6f, 51.8f, 47.6f);
generalPath.closePath();
generalPath.moveTo(51.8f, 60.699997f);
generalPath.curveTo(49.7f, 60.699997f, 47.899998f, 58.499996f, 47.899998f, 55.699997f);
generalPath.curveTo(47.899998f, 52.899998f, 49.6f, 50.699997f, 51.8f, 50.699997f);
generalPath.curveTo(54.0f, 50.699997f, 55.7f, 52.899998f, 55.7f, 55.699997f);
generalPath.curveTo(55.600002f, 58.499996f, 53.9f, 60.699997f, 51.8f, 60.699997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(51.750999450683594, 63.78300094604492), new Point2D.Double(51.750999450683594, 47.590999603271484), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(51.750999450683594, 64.28299713134766), new Point2D.Double(51.750999450683594, 47.090999603271484), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.8f, 47.6f);
generalPath.curveTo(48.0f, 47.6f, 44.899998f, 51.199997f, 44.899998f, 55.699997f);
generalPath.curveTo(44.899998f, 60.199997f, 47.999996f, 63.799995f, 51.8f, 63.799995f);
generalPath.curveTo(55.600002f, 63.799995f, 58.7f, 60.199997f, 58.7f, 55.699997f);
generalPath.curveTo(58.7f, 51.199997f, 55.600002f, 47.6f, 51.8f, 47.6f);
generalPath.closePath();
generalPath.moveTo(51.8f, 60.699997f);
generalPath.curveTo(49.7f, 60.699997f, 47.899998f, 58.499996f, 47.899998f, 55.699997f);
generalPath.curveTo(47.899998f, 52.899998f, 49.6f, 50.699997f, 51.8f, 50.699997f);
generalPath.curveTo(54.0f, 50.699997f, 55.7f, 52.899998f, 55.7f, 55.699997f);
generalPath.curveTo(55.600002f, 58.499996f, 53.9f, 60.699997f, 51.8f, 60.699997f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(6.6f, 74.4f);
generalPath.lineTo(13.0f, 74.4f);
generalPath.curveTo(14.4f, 74.4f, 15.5f, 74.5f, 16.3f, 74.700005f);
generalPath.curveTo(17.3f, 75.00001f, 18.199999f, 75.50001f, 18.9f, 76.3f);
generalPath.curveTo(19.6f, 77.1f, 20.199999f, 78.0f, 20.5f, 79.100006f);
generalPath.curveTo(20.800001f, 80.20001f, 21.1f, 81.600006f, 21.1f, 83.200005f);
generalPath.curveTo(21.1f, 84.600006f, 20.9f, 85.8f, 20.6f, 86.9f);
generalPath.curveTo(20.2f, 88.1f, 19.6f, 89.200005f, 18.800001f, 89.9f);
generalPath.curveTo(18.2f, 90.5f, 17.400002f, 90.9f, 16.400002f, 91.3f);
generalPath.curveTo(15.600001f, 91.5f, 14.600001f, 91.700005f, 13.300001f, 91.700005f);
generalPath.lineTo(6.6f, 91.700005f);
generalPath.lineTo(6.6f, 74.4f);
generalPath.closePath();
generalPath.moveTo(10.1f, 77.3f);
generalPath.lineTo(10.1f, 88.700005f);
generalPath.lineTo(12.700001f, 88.700005f);
generalPath.curveTo(13.700001f, 88.700005f, 14.400001f, 88.600006f, 14.800001f, 88.50001f);
generalPath.curveTo(15.400002f, 88.40001f, 15.800001f, 88.100006f, 16.2f, 87.80001f);
generalPath.curveTo(16.6f, 87.500015f, 16.900002f, 86.90001f, 17.1f, 86.10001f);
generalPath.curveTo(17.3f, 85.30002f, 17.5f, 84.30001f, 17.5f, 83.000015f);
generalPath.curveTo(17.5f, 81.70002f, 17.4f, 80.70001f, 17.1f, 79.90002f);
generalPath.curveTo(16.800001f, 79.10002f, 16.5f, 78.60001f, 16.1f, 78.20002f);
generalPath.curveTo(15.700001f, 77.800026f, 15.1f, 77.50002f, 14.5f, 77.40002f);
generalPath.curveTo(14.0f, 77.30002f, 13.1f, 77.20002f, 11.7f, 77.20002f);
generalPath.lineTo(10.099999f, 77.20002f);
generalPath.closePath();
generalPath.moveTo(39.5f, 91.5f);
generalPath.lineTo(35.7f, 91.5f);
generalPath.lineTo(34.2f, 87.6f);
generalPath.lineTo(27.300001f, 87.6f);
generalPath.lineTo(25.900002f, 91.5f);
generalPath.lineTo(22.2f, 91.5f);
generalPath.lineTo(28.900002f, 74.3f);
generalPath.lineTo(32.600002f, 74.3f);
generalPath.lineTo(39.500004f, 91.5f);
generalPath.closePath();
generalPath.moveTo(33.1f, 84.7f);
generalPath.lineTo(30.699999f, 78.299995f);
generalPath.lineTo(28.4f, 84.7f);
generalPath.lineTo(33.1f, 84.7f);
generalPath.closePath();
generalPath.moveTo(43.399998f, 91.5f);
generalPath.lineTo(43.399998f, 77.3f);
generalPath.lineTo(38.3f, 77.3f);
generalPath.lineTo(38.3f, 74.4f);
generalPath.lineTo(52.0f, 74.4f);
generalPath.lineTo(52.0f, 77.3f);
generalPath.lineTo(46.9f, 77.3f);
generalPath.lineTo(46.9f, 91.600006f);
generalPath.lineTo(43.4f, 91.600006f);
generalPath.closePath();
generalPath.moveTo(67.899994f, 91.5f);
generalPath.lineTo(64.09999f, 91.5f);
generalPath.lineTo(62.59999f, 87.6f);
generalPath.lineTo(55.69999f, 87.6f);
generalPath.lineTo(54.299988f, 91.5f);
generalPath.lineTo(50.599987f, 91.5f);
generalPath.lineTo(57.299988f, 74.3f);
generalPath.lineTo(61.0f, 74.3f);
generalPath.lineTo(67.9f, 91.5f);
generalPath.closePath();
generalPath.moveTo(61.499992f, 84.7f);
generalPath.lineTo(59.09999f, 78.299995f);
generalPath.lineTo(56.79999f, 84.7f);
generalPath.lineTo(61.499992f, 84.7f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
	private ext_data() {
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
       ext_data base = new ext_data();
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
       ext_data base = new ext_data();
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
        return ext_data::new;
    }
}

