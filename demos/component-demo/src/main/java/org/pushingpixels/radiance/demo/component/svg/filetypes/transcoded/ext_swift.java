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
public class ext_swift implements RadianceIcon {
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(72.0f, 99.299995f);
generalPath.lineTo(0.0f, 99.299995f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, -3.200000047683716), new Point2D.Double(36.0, 95.30000305175781), new float[] {0.005f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(252, 174, 63, 255)) : new Color(252, 174, 63, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 82, 46, 255)) : new Color(254, 82, 46, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(72.0f, 99.299995f);
generalPath.lineTo(0.0f, 99.299995f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(0.0, 50.0), new Point2D.Double(72.0, 50.0), new float[] {0.005f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(252, 174, 63, 0)) : new Color(252, 174, 63, 0)),((colorFilter != null) ? colorFilter.filter(new Color(252, 112, 50, 0)) : new Color(252, 112, 50, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(193, 81, 39, 255)) : new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(72.0f, 99.299995f);
generalPath.lineTo(0.0f, 99.299995f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(15.4f, 24.5f);
generalPath.curveTo(15.599999f, 24.4f, 16.199999f, 24.3f, 16.9f, 24.3f);
generalPath.lineTo(17.8f, 24.3f);
generalPath.curveTo(19.0f, 24.4f, 20.099998f, 24.599998f, 21.4f, 25.599998f);
generalPath.curveTo(21.699999f, 25.8f, 22.1f, 26.199999f, 22.4f, 26.499998f);
generalPath.curveTo(22.5f, 26.599998f, 22.6f, 26.799997f, 22.8f, 26.599998f);
generalPath.curveTo(23.099998f, 26.199999f, 23.599998f, 25.199999f, 24.4f, 24.499998f);
generalPath.curveTo(24.9f, 23.999998f, 26.199999f, 23.299997f, 28.3f, 23.299997f);
generalPath.lineTo(29.3f, 23.299997f);
generalPath.curveTo(32.0f, 23.599997f, 36.2f, 24.699997f, 39.3f, 25.599997f);
generalPath.curveTo(42.0f, 26.399996f, 53.5f, 30.199997f, 53.6f, 30.299995f);
generalPath.curveTo(53.6f, 30.299995f, 54.6f, 30.599995f, 54.399998f, 31.099995f);
generalPath.curveTo(54.3f, 31.399994f, 53.6f, 31.399994f, 53.399998f, 31.299995f);
generalPath.curveTo(52.0f, 31.0f, 39.8f, 29.7f, 37.0f, 29.6f);
generalPath.curveTo(35.1f, 29.5f, 34.2f, 30.1f, 34.0f, 31.1f);
generalPath.curveTo(33.9f, 31.800001f, 34.9f, 35.6f, 36.0f, 37.0f);
generalPath.curveTo(36.6f, 37.3f, 41.2f, 39.6f, 43.2f, 40.5f);
generalPath.curveTo(43.600002f, 40.7f, 44.4f, 41.0f, 45.600002f, 41.5f);
generalPath.curveTo(50.7f, 43.6f, 60.9f, 48.1f, 62.0f, 48.6f);
generalPath.curveTo(62.7f, 49.0f, 62.8f, 50.0f, 62.5f, 49.899998f);
generalPath.curveTo(61.9f, 49.699997f, 61.2f, 49.399998f, 61.0f, 49.3f);
generalPath.curveTo(60.0f, 48.8f, 48.9f, 44.5f, 46.0f, 43.8f);
generalPath.curveTo(44.1f, 43.3f, 42.7f, 43.0f, 41.8f, 43.0f);
generalPath.curveTo(41.6f, 43.0f, 41.1f, 43.0f, 41.0f, 43.4f);
generalPath.curveTo(40.8f, 44.100002f, 41.6f, 45.2f, 42.3f, 46.2f);
generalPath.curveTo(42.399998f, 46.3f, 42.5f, 46.4f, 42.5f, 46.600002f);
generalPath.curveTo(43.3f, 47.800003f, 45.6f, 51.100002f, 46.7f, 52.4f);
generalPath.curveTo(47.8f, 53.7f, 55.2f, 62.300003f, 55.300003f, 62.5f);
generalPath.curveTo(55.4f, 62.8f, 54.600002f, 62.6f, 54.600002f, 62.6f);
generalPath.curveTo(54.4f, 62.5f, 53.600002f, 62.3f, 53.100002f, 61.699997f);
generalPath.curveTo(52.500004f, 60.999996f, 36.300003f, 44.299995f, 34.9f, 43.1f);
generalPath.curveTo(34.300003f, 42.6f, 32.800003f, 41.6f, 31.400002f, 41.8f);
generalPath.curveTo(29.800001f, 42.0f, 28.300001f, 43.5f, 28.300001f, 45.3f);
generalPath.curveTo(28.300001f, 46.3f, 28.500002f, 47.8f, 28.800001f, 49.7f);
generalPath.curveTo(29.2f, 52.100002f, 29.400002f, 53.0f, 30.1f, 55.600002f);
generalPath.curveTo(30.2f, 56.100002f, 30.4f, 56.7f, 30.5f, 57.300003f);
generalPath.curveTo(30.7f, 58.000004f, 30.9f, 58.800003f, 31.1f, 59.600002f);
generalPath.curveTo(32.3f, 64.200005f, 32.3f, 64.700005f, 32.0f, 64.9f);
generalPath.curveTo(31.8f, 65.0f, 31.6f, 64.9f, 30.8f, 64.0f);
generalPath.curveTo(30.4f, 63.5f, 29.8f, 62.8f, 29.0f, 61.8f);
generalPath.curveTo(27.7f, 60.1f, 25.7f, 57.5f, 23.8f, 54.8f);
generalPath.curveTo(21.5f, 51.399998f, 17.4f, 42.5f, 16.9f, 40.699997f);
generalPath.curveTo(16.8f, 40.199997f, 15.799999f, 37.299995f, 16.6f, 36.199997f);
generalPath.curveTo(16.7f, 36.1f, 17.7f, 34.899998f, 17.7f, 34.299995f);
generalPath.curveTo(17.6f, 33.699997f, 17.2f, 32.899994f, 16.7f, 32.099995f);
generalPath.curveTo(16.2f, 31.299995f, 15.700001f, 30.499994f, 15.300001f, 29.499994f);
generalPath.curveTo(14.600001f, 27.899994f, 14.600001f, 26.599995f, 14.500001f, 26.099995f);
generalPath.lineTo(14.000001f, 24.199995f);
generalPath.lineTo(15.400001f, 24.499994f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(250, 42, 34, 255)) : new Color(250, 42, 34, 255);
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
generalPath.moveTo(15.3f, 26.0f);
generalPath.curveTo(15.3f, 26.0f, 16.0f, 28.7f, 17.1f, 30.1f);
generalPath.curveTo(18.2f, 31.5f, 21.7f, 34.9f, 19.9f, 36.1f);
generalPath.curveTo(18.1f, 37.3f, 17.199999f, 37.1f, 18.3f, 41.0f);
generalPath.curveTo(19.4f, 44.9f, 23.199999f, 51.8f, 23.9f, 52.9f);
generalPath.curveTo(25.6f, 55.600002f, 29.099998f, 58.0f, 28.9f, 54.600002f);
generalPath.curveTo(28.8f, 52.800003f, 28.5f, 51.800003f, 28.1f, 49.9f);
generalPath.curveTo(27.7f, 47.9f, 27.6f, 46.4f, 27.6f, 45.4f);
generalPath.curveTo(27.6f, 43.800003f, 29.4f, 41.0f, 29.6f, 40.7f);
generalPath.curveTo(29.800001f, 40.4f, 30.1f, 40.0f, 30.7f, 40.0f);
generalPath.curveTo(32.3f, 39.9f, 34.8f, 42.2f, 35.4f, 42.7f);
generalPath.curveTo(35.7f, 43.0f, 36.800003f, 44.0f, 38.2f, 45.4f);
generalPath.curveTo(39.600002f, 46.600002f, 41.7f, 48.300003f, 42.2f, 48.7f);
generalPath.curveTo(43.0f, 49.3f, 43.7f, 50.3f, 42.4f, 47.8f);
generalPath.curveTo(42.300003f, 47.6f, 41.800003f, 46.8f, 41.7f, 46.7f);
generalPath.curveTo(40.9f, 45.5f, 40.100002f, 44.2f, 40.4f, 43.100002f);
generalPath.curveTo(40.600002f, 42.600002f, 41.100002f, 42.300003f, 41.9f, 42.300003f);
generalPath.curveTo(42.9f, 42.300003f, 44.4f, 42.600002f, 46.300003f, 43.100002f);
generalPath.curveTo(47.200005f, 43.300003f, 51.100002f, 44.7f, 51.100002f, 44.500004f);
generalPath.curveTo(51.100002f, 44.200005f, 46.800003f, 42.600002f, 45.500004f, 42.000004f);
generalPath.curveTo(44.400005f, 41.500004f, 43.500004f, 41.200005f, 43.100002f, 41.000004f);
generalPath.curveTo(41.000004f, 40.100002f, 35.9f, 37.500004f, 35.800003f, 37.500004f);
generalPath.lineTo(35.700005f, 37.500004f);
generalPath.lineTo(35.600006f, 37.400005f);
generalPath.curveTo(34.100006f, 35.500004f, 33.200005f, 31.500006f, 33.400005f, 30.900005f);
generalPath.curveTo(33.600006f, 30.000006f, 34.300007f, 28.800005f, 36.700005f, 28.800005f);
generalPath.lineTo(37.100006f, 28.800005f);
generalPath.curveTo(37.900005f, 28.800005f, 39.400005f, 28.900005f, 41.200005f, 29.100004f);
generalPath.curveTo(43.800003f, 29.200005f, 47.000004f, 29.300005f, 47.300003f, 28.900003f);
generalPath.curveTo(47.300003f, 28.900003f, 47.300003f, 28.700003f, 47.100002f, 28.700003f);
generalPath.curveTo(43.9f, 27.700003f, 40.500004f, 26.500002f, 39.100002f, 26.100002f);
generalPath.curveTo(37.300003f, 25.600002f, 35.100002f, 25.000002f, 33.100002f, 24.500002f);
generalPath.curveTo(29.800003f, 23.800001f, 27.800003f, 23.900002f, 26.800003f, 24.200003f);
generalPath.curveTo(24.200003f, 25.000002f, 24.400003f, 27.300003f, 23.900003f, 27.900003f);
generalPath.curveTo(23.200003f, 28.700003f, 22.300003f, 27.300003f, 21.700003f, 26.800003f);
generalPath.curveTo(21.200003f, 26.300003f, 20.700003f, 25.900003f, 20.400003f, 25.700003f);
generalPath.curveTo(19.200003f, 24.900003f, 17.300003f, 24.900003f, 17.100004f, 24.900003f);
generalPath.curveTo(16.300005f, 24.900003f, 15.700005f, 25.100004f, 15.700005f, 25.100004f);
generalPath.lineTo(15.600004f, 25.100004f);
generalPath.lineTo(15.100004f, 25.000004f);
generalPath.lineTo(15.300004f, 26.000004f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(250, 42, 34, 255)) : new Color(250, 42, 34, 255);
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.06999969482422, 23.68000030517578), new Point2D.Double(58.56999969482422, 10.180000305175781), new float[] {0.0f,0.383f,0.521f,0.62f,0.699f,0.767f,0.828f,0.882f,0.933f,0.977f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 252, 227, 255)) : new Color(255, 252, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 250, 224, 255)) : new Color(255, 250, 224, 255)),((colorFilter != null) ? colorFilter.filter(new Color(253, 243, 216, 255)) : new Color(253, 243, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(251, 235, 204, 255)) : new Color(251, 235, 204, 255)),((colorFilter != null) ? colorFilter.filter(new Color(248, 223, 187, 255)) : new Color(248, 223, 187, 255)),((colorFilter != null) ? colorFilter.filter(new Color(245, 208, 166, 255)) : new Color(245, 208, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 191, 141, 255)) : new Color(241, 191, 141, 255)),((colorFilter != null) ? colorFilter.filter(new Color(236, 170, 114, 255)) : new Color(236, 170, 114, 255)),((colorFilter != null) ? colorFilter.filter(new Color(231, 147, 84, 255)) : new Color(231, 147, 84, 255)),((colorFilter != null) ? colorFilter.filter(new Color(226, 124, 52, 255)) : new Color(226, 124, 52, 255)),((colorFilter != null) ? colorFilter.filter(new Color(223, 111, 38, 255)) : new Color(223, 111, 38, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(193, 81, 39, 255)) : new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(5.0f, 86.6f);
generalPath.lineTo(7.8f, 86.299995f);
generalPath.curveTo(8.0f, 87.2f, 8.3f, 87.899994f, 8.8f, 88.399994f);
generalPath.curveTo(9.3f, 88.899994f, 10.0f, 89.09999f, 10.9f, 89.09999f);
generalPath.curveTo(11.799999f, 89.09999f, 12.5f, 88.899994f, 13.0f, 88.49999f);
generalPath.curveTo(13.5f, 88.09999f, 13.7f, 87.59999f, 13.7f, 87.09999f);
generalPath.curveTo(13.7f, 86.79999f, 13.599999f, 86.49999f, 13.4f, 86.19999f);
generalPath.curveTo(13.2f, 85.99999f, 12.9f, 85.79999f, 12.4f, 85.59999f);
generalPath.curveTo(12.099999f, 85.49999f, 11.299999f, 85.29999f, 10.099999f, 84.99999f);
generalPath.curveTo(8.499999f, 84.59999f, 7.3999996f, 84.09999f, 6.799999f, 83.59999f);
generalPath.curveTo(5.899999f, 82.79999f, 5.499999f, 81.899994f, 5.499999f, 80.69999f);
generalPath.curveTo(5.499999f, 79.99999f, 5.699999f, 79.29999f, 6.099999f, 78.69999f);
generalPath.curveTo(6.499999f, 78.09999f, 7.099999f, 77.59999f, 7.8999987f, 77.19999f);
generalPath.curveTo(8.699999f, 76.79999f, 9.599998f, 76.69999f, 10.699999f, 76.69999f);
generalPath.curveTo(12.499999f, 76.69999f, 13.899999f, 77.09999f, 14.799999f, 77.89999f);
generalPath.curveTo(15.699999f, 78.69999f, 16.199999f, 79.69999f, 16.199999f, 81.09998f);
generalPath.lineTo(13.299999f, 81.19998f);
generalPath.curveTo(13.199999f, 80.499985f, 12.9f, 79.89998f, 12.499999f, 79.59998f);
generalPath.curveTo(12.099998f, 79.29999f, 11.499999f, 79.09998f, 10.699999f, 79.09998f);
generalPath.curveTo(9.899999f, 79.09998f, 9.199999f, 79.29998f, 8.699999f, 79.59998f);
generalPath.curveTo(8.399999f, 79.79998f, 8.199999f, 80.09998f, 8.199999f, 80.499985f);
generalPath.curveTo(8.199999f, 80.79999f, 8.299999f, 81.09998f, 8.599998f, 81.39999f);
generalPath.curveTo(8.999998f, 81.69999f, 9.899999f, 81.999985f, 11.299998f, 82.39999f);
generalPath.curveTo(12.699998f, 82.79999f, 13.799998f, 83.09998f, 14.399998f, 83.39999f);
generalPath.curveTo(14.999997f, 83.69999f, 15.5999975f, 84.19999f, 15.999998f, 84.89999f);
generalPath.curveTo(16.399998f, 85.59998f, 16.599998f, 86.29999f, 16.599998f, 87.19999f);
generalPath.curveTo(16.599998f, 87.99999f, 16.399998f, 88.79999f, 15.899999f, 89.49999f);
generalPath.curveTo(15.399999f, 90.19999f, 14.799998f, 90.69999f, 13.999999f, 91.09999f);
generalPath.curveTo(13.199999f, 91.399994f, 12.099999f, 91.59999f, 10.9f, 91.59999f);
generalPath.curveTo(9.099999f, 91.59999f, 7.7f, 91.19999f, 6.7f, 90.29999f);
generalPath.curveTo(5.7f, 89.39999f, 5.2f, 88.2f, 5.0f, 86.6f);
generalPath.closePath();
generalPath.moveTo(21.2f, 91.299995f);
generalPath.lineTo(17.8f, 77.0f);
generalPath.lineTo(20.8f, 77.0f);
generalPath.lineTo(23.0f, 86.8f);
generalPath.lineTo(25.6f, 77.0f);
generalPath.lineTo(29.0f, 77.0f);
generalPath.lineTo(31.5f, 87.0f);
generalPath.lineTo(33.7f, 77.0f);
generalPath.lineTo(36.600002f, 77.0f);
generalPath.lineTo(33.100002f, 91.3f);
generalPath.lineTo(30.0f, 91.3f);
generalPath.lineTo(27.1f, 80.600006f);
generalPath.lineTo(24.2f, 91.3f);
generalPath.lineTo(21.2f, 91.3f);
generalPath.closePath();
generalPath.moveTo(38.1f, 91.299995f);
generalPath.lineTo(38.1f, 77.0f);
generalPath.lineTo(41.0f, 77.0f);
generalPath.lineTo(41.0f, 91.3f);
generalPath.lineTo(38.1f, 91.3f);
generalPath.closePath();
generalPath.moveTo(43.8f, 91.299995f);
generalPath.lineTo(43.8f, 77.0f);
generalPath.lineTo(53.699997f, 77.0f);
generalPath.lineTo(53.699997f, 79.4f);
generalPath.lineTo(46.699997f, 79.4f);
generalPath.lineTo(46.699997f, 82.8f);
generalPath.lineTo(52.699997f, 82.8f);
generalPath.lineTo(52.699997f, 85.200005f);
generalPath.lineTo(46.699997f, 85.200005f);
generalPath.lineTo(46.699997f, 91.3f);
generalPath.lineTo(43.799995f, 91.3f);
generalPath.closePath();
generalPath.moveTo(59.3f, 91.299995f);
generalPath.lineTo(59.3f, 79.4f);
generalPath.lineTo(55.0f, 79.4f);
generalPath.lineTo(55.0f, 77.0f);
generalPath.lineTo(66.5f, 77.0f);
generalPath.lineTo(66.5f, 79.4f);
generalPath.lineTo(62.2f, 79.4f);
generalPath.lineTo(62.2f, 91.3f);
generalPath.lineTo(59.3f, 91.3f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
	private ext_swift() {
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
       ext_swift base = new ext_swift();
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
       ext_swift base = new ext_swift();
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
        return ext_swift::new;
    }
}

