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
public class ext_ost implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.16f,0.36f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255)),((colorFilter != null) ? colorFilter.filter(new Color(25, 79, 126, 255)) : new Color(25, 79, 126, 255)),((colorFilter != null) ? colorFilter.filter(new Color(28, 95, 151, 255)) : new Color(28, 95, 151, 255)),((colorFilter != null) ? colorFilter.filter(new Color(29, 111, 181, 255)) : new Color(29, 111, 181, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255);
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
generalPath.moveTo(8.0f, 81.3f);
generalPath.curveTo(8.0f, 79.3f, 8.3f, 77.600006f, 8.9f, 76.200005f);
generalPath.curveTo(9.4f, 75.200005f, 10.0f, 74.3f, 10.799999f, 73.50001f);
generalPath.curveTo(11.599999f, 72.700005f, 12.499999f, 72.100006f, 13.4f, 71.700005f);
generalPath.curveTo(14.599999f, 71.200005f, 16.1f, 70.9f, 17.7f, 70.9f);
generalPath.curveTo(20.7f, 70.9f, 23.0f, 71.8f, 24.800001f, 73.6f);
generalPath.curveTo(26.6f, 75.4f, 27.500002f, 77.9f, 27.500002f, 81.2f);
generalPath.curveTo(27.500002f, 84.399994f, 26.600002f, 86.899994f, 24.900002f, 88.7f);
generalPath.curveTo(23.100002f, 90.5f, 20.800001f, 91.399994f, 17.800001f, 91.399994f);
generalPath.curveTo(14.800001f, 91.399994f, 12.400002f, 90.49999f, 10.700001f, 88.7f);
generalPath.curveTo(8.9f, 86.9f, 8.0f, 84.4f, 8.0f, 81.3f);
generalPath.closePath();
generalPath.moveTo(12.2f, 81.100006f);
generalPath.curveTo(12.2f, 83.3f, 12.7f, 85.100006f, 13.8f, 86.200005f);
generalPath.curveTo(14.8f, 87.4f, 16.2f, 87.9f, 17.8f, 87.9f);
generalPath.curveTo(19.399998f, 87.9f, 20.699999f, 87.3f, 21.8f, 86.200005f);
generalPath.curveTo(22.8f, 85.00001f, 23.4f, 83.3f, 23.4f, 81.00001f);
generalPath.curveTo(23.4f, 78.700005f, 22.9f, 77.00001f, 21.9f, 75.90001f);
generalPath.curveTo(20.9f, 74.80001f, 19.6f, 74.20001f, 17.9f, 74.20001f);
generalPath.curveTo(16.199999f, 74.20001f, 14.9f, 74.80001f, 13.9f, 75.90001f);
generalPath.curveTo(12.7f, 77.100006f, 12.2f, 78.80001f, 12.2f, 81.100006f);
generalPath.closePath();
generalPath.moveTo(29.599998f, 84.600006f);
generalPath.lineTo(33.5f, 84.200005f);
generalPath.curveTo(33.7f, 85.50001f, 34.2f, 86.50001f, 34.9f, 87.100006f);
generalPath.curveTo(35.600002f, 87.700005f, 36.600002f, 88.00001f, 37.800003f, 88.00001f);
generalPath.curveTo(39.100002f, 88.00001f, 40.100002f, 87.700005f, 40.700005f, 87.200005f);
generalPath.curveTo(41.400005f, 86.700005f, 41.700005f, 86.00001f, 41.700005f, 85.3f);
generalPath.curveTo(41.700005f, 84.8f, 41.600006f, 84.4f, 41.300003f, 84.100006f);
generalPath.curveTo(41.0f, 83.80001f, 40.500004f, 83.50001f, 39.800003f, 83.200005f);
generalPath.curveTo(39.300003f, 83.00001f, 38.200005f, 82.700005f, 36.600002f, 82.3f);
generalPath.curveTo(34.4f, 81.8f, 32.9f, 81.100006f, 32.000004f, 80.3f);
generalPath.curveTo(30.800003f, 79.200005f, 30.200005f, 77.9f, 30.200005f, 76.3f);
generalPath.curveTo(30.200005f, 75.3f, 30.500004f, 74.3f, 31.100004f, 73.5f);
generalPath.curveTo(31.700005f, 72.6f, 32.500004f, 72.0f, 33.600006f, 71.5f);
generalPath.curveTo(34.70001f, 71.0f, 36.000008f, 70.8f, 37.500008f, 70.8f);
generalPath.curveTo(40.000008f, 70.8f, 41.90001f, 71.3f, 43.20001f, 72.4f);
generalPath.curveTo(44.500008f, 73.5f, 45.10001f, 74.9f, 45.20001f, 76.8f);
generalPath.lineTo(41.20001f, 77.0f);
generalPath.curveTo(41.000008f, 76.0f, 40.70001f, 75.2f, 40.10001f, 74.8f);
generalPath.curveTo(39.50001f, 74.40001f, 38.70001f, 74.100006f, 37.50001f, 74.100006f);
generalPath.curveTo(36.30001f, 74.100006f, 35.400013f, 74.3f, 34.700012f, 74.8f);
generalPath.curveTo(34.30001f, 75.100006f, 34.100014f, 75.5f, 34.100014f, 76.0f);
generalPath.curveTo(34.100014f, 76.5f, 34.300014f, 76.9f, 34.700012f, 77.2f);
generalPath.curveTo(35.200012f, 77.6f, 36.50001f, 78.1f, 38.400013f, 78.5f);
generalPath.curveTo(40.300014f, 78.9f, 41.800014f, 79.4f, 42.800014f, 79.9f);
generalPath.curveTo(43.700016f, 80.4f, 44.500015f, 81.1f, 45.000015f, 81.9f);
generalPath.curveTo(45.500015f, 82.700005f, 45.800014f, 83.8f, 45.800014f, 85.1f);
generalPath.curveTo(45.800014f, 86.2f, 45.500015f, 87.299995f, 44.800014f, 88.299995f);
generalPath.curveTo(44.200016f, 89.299995f, 43.300014f, 89.99999f, 42.100014f, 90.49999f);
generalPath.curveTo(40.900013f, 90.99999f, 39.500015f, 91.19999f, 37.700012f, 91.19999f);
generalPath.curveTo(35.200012f, 91.19999f, 33.200012f, 90.59999f, 31.900013f, 89.49999f);
generalPath.curveTo(30.700012f, 88.49999f, 29.800013f, 86.799995f, 29.600014f, 84.59999f);
generalPath.closePath();
generalPath.moveTo(53.8f, 91.100006f);
generalPath.lineTo(53.8f, 74.6f);
generalPath.lineTo(47.899998f, 74.6f);
generalPath.lineTo(47.899998f, 71.2f);
generalPath.lineTo(63.799995f, 71.2f);
generalPath.lineTo(63.799995f, 74.6f);
generalPath.lineTo(57.899994f, 74.6f);
generalPath.lineTo(57.899994f, 91.1f);
generalPath.lineTo(53.799995f, 91.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 74.20500183105469), new Point2D.Double(58.569000244140625, 87.70500183105469), new float[] {0.005f,0.3f,0.443f,0.553f,0.647f,0.73f,0.805f,0.875f,0.938f,0.998f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(223, 241, 250, 255)) : new Color(223, 241, 250, 255)),((colorFilter != null) ? colorFilter.filter(new Color(220, 238, 247, 255)) : new Color(220, 238, 247, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 228, 239, 255)) : new Color(211, 228, 239, 255)),((colorFilter != null) ? colorFilter.filter(new Color(196, 214, 227, 255)) : new Color(196, 214, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(177, 197, 213, 255)) : new Color(177, 197, 213, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 176, 197, 255)) : new Color(154, 176, 197, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 154, 179, 255)) : new Color(129, 154, 179, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 130, 159, 255)) : new Color(100, 130, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 108, 140, 255)) : new Color(66, 108, 140, 255)),((colorFilter != null) ? colorFilter.filter(new Color(6, 87, 122, 255)) : new Color(6, 87, 122, 255)),((colorFilter != null) ? colorFilter.filter(new Color(1, 86, 121, 255)) : new Color(1, 86, 121, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255);
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
generalPath.moveTo(26.4f, 38.1f);
generalPath.curveTo(24.9f, 38.3f, 23.699999f, 39.899998f, 23.699999f, 41.6f);
generalPath.curveTo(23.699999f, 43.399998f, 24.9f, 45.0f, 26.4f, 45.1f);
generalPath.curveTo(27.9f, 45.3f, 29.1f, 43.699997f, 29.1f, 41.6f);
generalPath.curveTo(29.1f, 39.5f, 27.9f, 37.899998f, 26.4f, 38.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.413000106811523, 38.04399871826172), new Point2D.Double(26.413000106811523, 45.15599822998047), new float[] {0.005f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255)),((colorFilter != null) ? colorFilter.filter(new Color(25, 79, 126, 255)) : new Color(25, 79, 126, 255)),((colorFilter != null) ? colorFilter.filter(new Color(28, 95, 151, 255)) : new Color(28, 95, 151, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(15.9f, 27.9f);
generalPath.lineTo(15.9f, 55.6f);
generalPath.lineTo(37.6f, 59.5f);
generalPath.lineTo(37.6f, 23.7f);
generalPath.lineTo(15.899998f, 27.900002f);
generalPath.closePath();
generalPath.moveTo(26.4f, 47.3f);
generalPath.curveTo(24.0f, 47.0f, 22.099998f, 44.399998f, 22.099998f, 41.6f);
generalPath.curveTo(22.099998f, 38.8f, 23.999998f, 36.199997f, 26.399998f, 35.899998f);
generalPath.curveTo(28.799997f, 35.6f, 30.699997f, 38.199997f, 30.699997f, 41.6f);
generalPath.curveTo(30.699997f, 45.1f, 28.799997f, 47.6f, 26.399998f, 47.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.71299934387207, 23.71299934387207), new Point2D.Double(26.71299934387207, 59.48699951171875), new float[] {0.005f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255)),((colorFilter != null) ? colorFilter.filter(new Color(25, 79, 126, 255)) : new Color(25, 79, 126, 255)),((colorFilter != null) ? colorFilter.filter(new Color(28, 95, 151, 255)) : new Color(28, 95, 151, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(54.6f, 32.1f);
generalPath.lineTo(42.7f, 42.0f);
generalPath.lineTo(39.5f, 39.4f);
generalPath.lineTo(39.5f, 31.2f);
generalPath.lineTo(54.6f, 31.2f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(47.03900146484375, 31.20199966430664), new Point2D.Double(47.03900146484375, 41.99700164794922), new float[] {0.005f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255)),((colorFilter != null) ? colorFilter.filter(new Color(25, 79, 126, 255)) : new Color(25, 79, 126, 255)),((colorFilter != null) ? colorFilter.filter(new Color(28, 95, 151, 255)) : new Color(28, 95, 151, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(54.6f, 34.0f);
generalPath.lineTo(42.699997f, 43.9f);
generalPath.lineTo(39.499996f, 41.300003f);
generalPath.lineTo(39.499996f, 52.4f);
generalPath.lineTo(54.6f, 52.4f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(47.03900146484375, 34.02299880981445), new Point2D.Double(47.03900146484375, 52.426998138427734), new float[] {0.005f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255)),((colorFilter != null) ? colorFilter.filter(new Color(25, 79, 126, 255)) : new Color(25, 79, 126, 255)),((colorFilter != null) ? colorFilter.filter(new Color(28, 95, 151, 255)) : new Color(28, 95, 151, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_ost() {
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
       ext_ost base = new ext_ost();
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
       ext_ost base = new ext_ost();
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
        return ext_ost::new;
    }
}

