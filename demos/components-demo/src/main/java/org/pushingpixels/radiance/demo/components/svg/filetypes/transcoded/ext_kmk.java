package org.pushingpixels.radiance.demo.components.svg.filetypes.transcoded;

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
public class ext_kmk implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 99.0f);
generalPath.lineTo(-0.19999695f, 99.0f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 2.994999885559082), new Point2D.Double(35.75, 101.0009994506836), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 196, 2, 255)) : new Color(239, 196, 2, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 200, 41, 255)) : new Color(241, 200, 41, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 210, 100, 255)) : new Color(244, 210, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(247, 220, 139, 255)) : new Color(247, 220, 139, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 229, 172, 255)) : new Color(249, 229, 172, 255)),((colorFilter != null) ? colorFilter.filter(new Color(251, 236, 199, 255)) : new Color(251, 236, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 243, 221, 255)) : new Color(252, 243, 221, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 249, 238, 255)) : new Color(254, 249, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 253, 249, 255)) : new Color(255, 253, 249, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 99.0f);
generalPath.lineTo(-0.19999695f, 99.0f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 156, 2, 255)) : new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 99.0f);
generalPath.lineTo(-0.19999695f, 99.0f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
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
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(5.8f, 92.1f);
generalPath.lineTo(5.8f, 72.2f);
generalPath.lineTo(9.8f, 72.2f);
generalPath.lineTo(9.8f, 81.0f);
generalPath.lineTo(18.0f, 72.2f);
generalPath.lineTo(23.4f, 72.2f);
generalPath.lineTo(16.0f, 80.0f);
generalPath.lineTo(24.0f, 92.1f);
generalPath.lineTo(18.8f, 92.1f);
generalPath.lineTo(13.299999f, 82.799995f);
generalPath.lineTo(9.999999f, 86.1f);
generalPath.lineTo(9.999999f, 92.1f);
generalPath.lineTo(5.8f, 92.1f);
generalPath.closePath();
generalPath.moveTo(26.0f, 92.1f);
generalPath.lineTo(26.0f, 72.2f);
generalPath.lineTo(32.0f, 72.2f);
generalPath.lineTo(35.6f, 85.7f);
generalPath.lineTo(39.199997f, 72.2f);
generalPath.lineTo(45.299995f, 72.2f);
generalPath.lineTo(45.299995f, 92.0f);
generalPath.lineTo(41.499996f, 92.0f);
generalPath.lineTo(41.499996f, 76.4f);
generalPath.lineTo(37.499996f, 92.0f);
generalPath.lineTo(33.599995f, 92.0f);
generalPath.lineTo(29.599995f, 76.4f);
generalPath.lineTo(29.599995f, 92.0f);
generalPath.lineTo(26.0f, 92.0f);
generalPath.closePath();
generalPath.moveTo(49.4f, 92.1f);
generalPath.lineTo(49.4f, 72.2f);
generalPath.lineTo(53.4f, 72.2f);
generalPath.lineTo(53.4f, 81.0f);
generalPath.lineTo(61.600002f, 72.2f);
generalPath.lineTo(67.0f, 72.2f);
generalPath.lineTo(59.5f, 80.0f);
generalPath.lineTo(67.5f, 92.1f);
generalPath.lineTo(62.3f, 92.1f);
generalPath.lineTo(56.8f, 82.799995f);
generalPath.lineTo(53.5f, 86.1f);
generalPath.lineTo(53.5f, 92.1f);
generalPath.lineTo(49.4f, 92.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.34400177001953, 74.2300033569336), new Point2D.Double(58.84400177001953, 87.7300033569336), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 251, 255)) : new Color(255, 254, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 250, 241, 255)) : new Color(254, 250, 241, 255)),((colorFilter != null) ? colorFilter.filter(new Color(253, 245, 228, 255)) : new Color(253, 245, 228, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 240, 210, 255)) : new Color(252, 240, 210, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 233, 188, 255)) : new Color(250, 233, 188, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 226, 162, 255)) : new Color(249, 226, 162, 255)),((colorFilter != null) ? colorFilter.filter(new Color(247, 218, 131, 255)) : new Color(247, 218, 131, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 209, 93, 255)) : new Color(244, 209, 93, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 200, 39, 255)) : new Color(241, 200, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(239, 196, 2, 255)) : new Color(239, 196, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 156, 2, 255)) : new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
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
generalPath.moveTo(61.2f, 53.4f);
generalPath.curveTo(61.2f, 51.4f, 59.600002f, 49.800003f, 57.600002f, 49.800003f);
generalPath.lineTo(13.8f, 49.800003f);
generalPath.curveTo(11.8f, 49.800003f, 10.200001f, 51.4f, 10.200001f, 53.4f);
generalPath.lineTo(10.200001f, 58.4f);
generalPath.curveTo(10.200001f, 60.4f, 11.800001f, 62.0f, 13.800001f, 62.0f);
generalPath.lineTo(57.6f, 62.0f);
generalPath.curveTo(59.6f, 62.0f, 61.199997f, 60.4f, 61.199997f, 58.4f);
generalPath.lineTo(61.199997f, 53.4f);
generalPath.closePath();
generalPath.moveTo(42.4f, 57.9f);
generalPath.curveTo(41.300003f, 57.9f, 40.4f, 57.0f, 40.4f, 55.9f);
generalPath.curveTo(40.4f, 54.800003f, 41.300003f, 53.9f, 42.4f, 53.9f);
generalPath.curveTo(43.5f, 53.9f, 44.4f, 54.800003f, 44.4f, 55.9f);
generalPath.curveTo(44.4f, 57.0f, 43.5f, 57.9f, 42.4f, 57.9f);
generalPath.closePath();
generalPath.moveTo(48.5f, 57.9f);
generalPath.curveTo(47.4f, 57.9f, 46.5f, 57.0f, 46.5f, 55.9f);
generalPath.curveTo(46.5f, 54.800003f, 47.4f, 53.9f, 48.5f, 53.9f);
generalPath.curveTo(49.6f, 53.9f, 50.5f, 54.800003f, 50.5f, 55.9f);
generalPath.curveTo(50.5f, 57.0f, 49.6f, 57.9f, 48.5f, 57.9f);
generalPath.closePath();
generalPath.moveTo(54.6f, 57.9f);
generalPath.curveTo(53.5f, 57.9f, 52.6f, 57.0f, 52.6f, 55.9f);
generalPath.curveTo(52.6f, 54.800003f, 53.5f, 53.9f, 54.6f, 53.9f);
generalPath.curveTo(55.699997f, 53.9f, 56.6f, 54.800003f, 56.6f, 55.9f);
generalPath.curveTo(56.6f, 57.0f, 55.699997f, 57.9f, 54.6f, 57.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.715999603271484, 62.0), new Point2D.Double(35.715999603271484, 49.770999908447266), new float[] {0.0f,0.164f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(222, 190, 0, 255)) : new Color(222, 190, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 173, 4, 255)) : new Color(207, 173, 4, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(13.8f, 47.7f);
generalPath.lineTo(57.6f, 47.7f);
generalPath.curveTo(58.6f, 47.7f, 59.5f, 48.0f, 60.3f, 48.4f);
generalPath.lineTo(56.1f, 39.5f);
generalPath.curveTo(55.0f, 36.9f, 53.0f, 35.9f, 51.0f, 35.9f);
generalPath.lineTo(46.2f, 35.9f);
generalPath.lineTo(39.3f, 42.9f);
generalPath.curveTo(38.8f, 43.4f, 38.3f, 43.800003f, 37.6f, 44.100002f);
generalPath.curveTo(37.0f, 44.4f, 36.3f, 44.500004f, 35.6f, 44.500004f);
generalPath.curveTo(34.899998f, 44.500004f, 34.199997f, 44.400005f, 33.6f, 44.100002f);
generalPath.lineTo(33.399998f, 44.100002f);
generalPath.curveTo(32.899998f, 43.800003f, 32.399998f, 43.500004f, 31.899998f, 43.100002f);
generalPath.lineTo(24.999998f, 36.100002f);
generalPath.lineTo(20.199997f, 36.100002f);
generalPath.curveTo(18.199997f, 36.100002f, 16.399998f, 37.2f, 15.099997f, 39.7f);
generalPath.lineTo(10.899997f, 48.6f);
generalPath.curveTo(11.899997f, 48.0f, 12.799996f, 47.699997f, 13.799997f, 47.699997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.715999603271484, 48.45600128173828), new Point2D.Double(35.715999603271484, 35.93000030517578), new float[] {0.0f,0.164f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(222, 190, 0, 255)) : new Color(222, 190, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 173, 4, 255)) : new Color(207, 173, 4, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.9f, 32.6f);
generalPath.curveTo(46.100002f, 32.399998f, 46.300003f, 32.1f, 46.5f, 31.699999f);
generalPath.curveTo(46.6f, 31.4f, 46.7f, 30.999998f, 46.7f, 30.699999f);
generalPath.curveTo(46.7f, 30.3f, 46.600002f, 29.999998f, 46.5f, 29.699999f);
generalPath.curveTo(46.4f, 29.4f, 46.2f, 29.099998f, 45.9f, 28.9f);
generalPath.curveTo(45.600002f, 28.6f, 45.4f, 28.4f, 45.0f, 28.3f);
generalPath.curveTo(44.7f, 28.199999f, 44.4f, 28.099998f, 44.0f, 28.099998f);
generalPath.curveTo(43.6f, 28.099998f, 43.3f, 28.199999f, 43.0f, 28.3f);
generalPath.lineTo(42.1f, 28.9f);
generalPath.lineTo(38.199997f, 32.9f);
generalPath.lineTo(38.199997f, 20.5f);
generalPath.curveTo(38.199997f, 20.1f, 38.1f, 19.8f, 37.999996f, 19.5f);
generalPath.curveTo(37.899998f, 19.2f, 37.699997f, 18.9f, 37.399998f, 18.6f);
generalPath.curveTo(37.199997f, 18.300001f, 36.899998f, 18.1f, 36.499996f, 18.0f);
generalPath.curveTo(36.199997f, 17.9f, 35.899998f, 17.8f, 35.499996f, 17.8f);
generalPath.curveTo(35.099995f, 17.8f, 34.799995f, 17.9f, 34.499996f, 18.0f);
generalPath.lineTo(33.599995f, 18.6f);
generalPath.curveTo(33.399994f, 18.9f, 33.199993f, 19.1f, 32.999996f, 19.5f);
generalPath.curveTo(32.899998f, 19.8f, 32.799995f, 20.2f, 32.799995f, 20.5f);
generalPath.lineTo(32.799995f, 32.8f);
generalPath.lineTo(28.899996f, 28.8f);
generalPath.curveTo(28.699995f, 28.599998f, 28.399996f, 28.4f, 27.999996f, 28.199999f);
generalPath.curveTo(27.699997f, 28.099998f, 27.399996f, 27.999998f, 26.999996f, 27.999998f);
generalPath.curveTo(26.599997f, 27.999998f, 26.299995f, 28.099998f, 25.999996f, 28.199999f);
generalPath.curveTo(25.699997f, 28.3f, 25.399996f, 28.499998f, 25.099997f, 28.8f);
generalPath.curveTo(24.899996f, 29.0f, 24.699997f, 29.3f, 24.499996f, 29.599998f);
generalPath.curveTo(24.399996f, 29.899998f, 24.299995f, 30.3f, 24.299995f, 30.599998f);
generalPath.curveTo(24.299995f, 30.999998f, 24.399996f, 31.3f, 24.499996f, 31.599998f);
generalPath.curveTo(24.599997f, 31.899998f, 24.799995f, 32.199997f, 25.099997f, 32.5f);
generalPath.lineTo(33.499996f, 41.1f);
generalPath.curveTo(33.699997f, 41.3f, 33.999996f, 41.5f, 34.399998f, 41.699997f);
generalPath.curveTo(34.699997f, 41.799995f, 34.999996f, 41.899998f, 35.399998f, 41.899998f);
generalPath.curveTo(35.8f, 41.899998f, 36.1f, 41.8f, 36.399998f, 41.699997f);
generalPath.curveTo(36.699997f, 41.6f, 36.999996f, 41.399998f, 37.3f, 41.1f);
generalPath.lineTo(45.9f, 32.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.71500015258789, 41.981998443603516), new Point2D.Double(35.71500015258789, 17.854999542236328), new float[] {0.0f,0.164f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(222, 190, 0, 255)) : new Color(222, 190, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 173, 4, 255)) : new Color(207, 173, 4, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
        return 0.12800002098083496;
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
		return 0.7410314083099365;
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
	private ext_kmk() {
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
       ext_kmk base = new ext_kmk();
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
       ext_kmk base = new ext_kmk();
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
        return ext_kmk::new;
    }
}

