package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_pub implements NeonIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private NeonIcon.ColorFilter colorFilter = null;
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
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.0f,0.124f,0.262f,0.41f,0.571f,0.752f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 107, 105, 255)) : new Color(0, 107, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 128, 127, 255)) : new Color(0, 128, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 147, 147, 255)) : new Color(0, 147, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 163, 163, 255)) : new Color(0, 163, 163, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 176, 175, 255)) : new Color(0, 176, 175, 255)),((colorFilter != null) ? colorFilter.filter(new Color(8, 184, 183, 255)) : new Color(8, 184, 183, 255)),((colorFilter != null) ? colorFilter.filter(new Color(20, 187, 187, 255)) : new Color(20, 187, 187, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(0.32499998807907104, 49.99700164794922), new Point2D.Double(72.07499694824219, 49.99700164794922), new float[] {0.005f,0.343f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(7, 114, 101, 0)) : new Color(7, 114, 101, 0)),((colorFilter != null) ? colorFilter.filter(new Color(0, 106, 105, 0)) : new Color(0, 106, 105, 0)),((colorFilter != null) ? colorFilter.filter(new Color(0, 56, 54, 0)) : new Color(0, 56, 54, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 110, 108, 255)) : new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(8.8f, 91.1f);
generalPath.lineTo(8.8f, 71.2f);
generalPath.lineTo(15.3f, 71.2f);
generalPath.curveTo(17.8f, 71.2f, 19.4f, 71.299995f, 20.1f, 71.5f);
generalPath.curveTo(21.2f, 71.8f, 22.2f, 72.4f, 23.0f, 73.4f);
generalPath.curveTo(23.8f, 74.4f, 24.2f, 75.700005f, 24.2f, 77.3f);
generalPath.curveTo(24.2f, 78.5f, 24.0f, 79.5f, 23.5f, 80.4f);
generalPath.curveTo(23.1f, 81.200005f, 22.5f, 81.9f, 21.8f, 82.4f);
generalPath.curveTo(21.099998f, 82.9f, 20.4f, 83.200005f, 19.699999f, 83.3f);
generalPath.curveTo(18.699999f, 83.5f, 17.3f, 83.600006f, 15.499999f, 83.600006f);
generalPath.lineTo(12.9f, 83.600006f);
generalPath.lineTo(12.9f, 91.100006f);
generalPath.lineTo(8.8f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(12.8f, 74.6f);
generalPath.lineTo(12.8f, 80.2f);
generalPath.lineTo(15.0f, 80.2f);
generalPath.curveTo(16.6f, 80.2f, 17.7f, 80.1f, 18.2f, 79.899994f);
generalPath.curveTo(18.7f, 79.7f, 19.2f, 79.399994f, 19.5f, 78.899994f);
generalPath.curveTo(19.8f, 78.49999f, 20.0f, 77.899994f, 20.0f, 77.399994f);
generalPath.curveTo(20.0f, 76.7f, 19.8f, 76.09999f, 19.4f, 75.59999f);
generalPath.curveTo(19.0f, 75.09999f, 18.4f, 74.79999f, 17.8f, 74.69999f);
generalPath.curveTo(17.3f, 74.59999f, 16.4f, 74.59999f, 14.9f, 74.59999f);
generalPath.lineTo(12.799999f, 74.59999f);
generalPath.closePath();
generalPath.moveTo(27.400002f, 71.2f);
generalPath.lineTo(31.400002f, 71.2f);
generalPath.lineTo(31.400002f, 82.0f);
generalPath.curveTo(31.400002f, 83.7f, 31.400002f, 84.8f, 31.500002f, 85.3f);
generalPath.curveTo(31.700003f, 86.100006f, 32.100002f, 86.8f, 32.7f, 87.3f);
generalPath.curveTo(33.3f, 87.8f, 34.2f, 88.0f, 35.4f, 88.0f);
generalPath.curveTo(36.5f, 88.0f, 37.4f, 87.8f, 38.0f, 87.3f);
generalPath.curveTo(38.6f, 86.8f, 38.9f, 86.3f, 39.0f, 85.600006f);
generalPath.curveTo(39.1f, 84.90001f, 39.2f, 83.8f, 39.2f, 82.200005f);
generalPath.lineTo(39.2f, 71.200005f);
generalPath.lineTo(43.2f, 71.200005f);
generalPath.lineTo(43.2f, 81.600006f);
generalPath.curveTo(43.2f, 84.00001f, 43.100002f, 85.700005f, 42.9f, 86.600006f);
generalPath.curveTo(42.7f, 87.600006f, 42.300003f, 88.40001f, 41.7f, 89.100006f);
generalPath.curveTo(41.1f, 89.8f, 40.3f, 90.3f, 39.3f, 90.700005f);
generalPath.curveTo(38.3f, 91.100006f, 37.0f, 91.3f, 35.5f, 91.3f);
generalPath.curveTo(33.6f, 91.3f, 32.1f, 91.100006f, 31.2f, 90.600006f);
generalPath.curveTo(30.300003f, 90.100006f, 29.400002f, 89.600006f, 28.900002f, 88.90001f);
generalPath.curveTo(28.400002f, 88.20001f, 28.000002f, 87.50001f, 27.800001f, 86.70001f);
generalPath.curveTo(27.500002f, 85.60001f, 27.400002f, 83.90001f, 27.400002f, 81.70001f);
generalPath.lineTo(27.400002f, 71.2f);
generalPath.closePath();
generalPath.moveTo(47.5f, 71.2f);
generalPath.lineTo(55.5f, 71.2f);
generalPath.curveTo(57.1f, 71.2f, 58.3f, 71.299995f, 59.0f, 71.399994f);
generalPath.curveTo(59.8f, 71.49999f, 60.5f, 71.799995f, 61.1f, 72.2f);
generalPath.curveTo(61.699997f, 72.6f, 62.199997f, 73.2f, 62.6f, 73.899994f);
generalPath.curveTo(63.0f, 74.59999f, 63.199997f, 75.399994f, 63.199997f, 76.2f);
generalPath.curveTo(63.199997f, 77.1f, 62.899998f, 78.0f, 62.399998f, 78.799995f);
generalPath.curveTo(61.899998f, 79.59999f, 61.199997f, 80.2f, 60.399998f, 80.49999f);
generalPath.curveTo(61.6f, 80.899994f, 62.6f, 81.49999f, 63.199997f, 82.299995f);
generalPath.curveTo(63.899998f, 83.1f, 64.2f, 84.1f, 64.2f, 85.299995f);
generalPath.curveTo(64.2f, 86.2f, 63.999996f, 87.1f, 63.6f, 87.899994f);
generalPath.curveTo(63.199997f, 88.799995f, 62.6f, 89.399994f, 61.899998f, 89.899994f);
generalPath.curveTo(61.199997f, 90.399994f, 60.3f, 90.7f, 59.199997f, 90.799995f);
generalPath.curveTo(58.499996f, 90.899994f, 56.899998f, 90.899994f, 54.299995f, 90.899994f);
generalPath.lineTo(47.499996f, 90.899994f);
generalPath.lineTo(47.499996f, 71.2f);
generalPath.closePath();
generalPath.moveTo(51.6f, 74.5f);
generalPath.lineTo(51.6f, 79.1f);
generalPath.lineTo(54.199997f, 79.1f);
generalPath.curveTo(55.799995f, 79.1f, 56.699997f, 79.1f, 57.1f, 79.0f);
generalPath.curveTo(57.8f, 78.9f, 58.3f, 78.7f, 58.699997f, 78.3f);
generalPath.curveTo(59.1f, 77.9f, 59.299995f, 77.4f, 59.299995f, 76.8f);
generalPath.curveTo(59.299995f, 76.200005f, 59.099995f, 75.700005f, 58.799995f, 75.3f);
generalPath.curveTo(58.499996f, 74.9f, 57.999996f, 74.700005f, 57.299995f, 74.600006f);
generalPath.curveTo(56.899994f, 74.600006f, 55.799995f, 74.50001f, 53.899994f, 74.50001f);
generalPath.lineTo(51.599995f, 74.50001f);
generalPath.closePath();
generalPath.moveTo(51.6f, 82.4f);
generalPath.lineTo(51.6f, 87.700005f);
generalPath.lineTo(55.3f, 87.700005f);
generalPath.curveTo(56.8f, 87.700005f, 57.7f, 87.700005f, 58.1f, 87.600006f);
generalPath.curveTo(58.699997f, 87.50001f, 59.199997f, 87.200005f, 59.6f, 86.8f);
generalPath.curveTo(60.0f, 86.4f, 60.199997f, 85.8f, 60.199997f, 85.100006f);
generalPath.curveTo(60.199997f, 84.50001f, 60.1f, 84.00001f, 59.799995f, 83.600006f);
generalPath.curveTo(59.499996f, 83.200005f, 59.099995f, 82.90001f, 58.499996f, 82.700005f);
generalPath.curveTo(57.999996f, 82.50001f, 56.799995f, 82.4f, 54.899998f, 82.4f);
generalPath.lineTo(51.6f, 82.4f);
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
generalPath.moveTo(31.1f, 36.2f);
generalPath.curveTo(31.1f, 33.0f, 29.5f, 31.400002f, 27.1f, 31.400002f);
generalPath.curveTo(26.1f, 31.400002f, 25.4f, 31.500002f, 25.0f, 31.7f);
generalPath.lineTo(25.0f, 41.2f);
generalPath.curveTo(25.5f, 41.4f, 26.1f, 41.5f, 26.8f, 41.5f);
generalPath.curveTo(29.5f, 41.4f, 31.099998f, 39.6f, 31.099998f, 36.2f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.031999588012695, 41.41299819946289), new Point2D.Double(28.031999588012695, 31.378000259399414), new float[] {0.005f,0.343f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 130, 129, 255)) : new Color(0, 130, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 106, 105, 255)) : new Color(0, 106, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 56, 54, 255)) : new Color(0, 56, 54, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(15.0f, 55.3f);
generalPath.lineTo(41.1f, 62.0f);
generalPath.lineTo(41.1f, 19.3f);
generalPath.lineTo(15.0f, 26.0f);
generalPath.lineTo(15.0f, 55.3f);
generalPath.closePath();
generalPath.moveTo(22.8f, 29.3f);
generalPath.curveTo(23.9f, 29.0f, 25.3f, 28.8f, 27.0f, 28.8f);
generalPath.curveTo(29.2f, 28.8f, 30.8f, 29.5f, 31.8f, 30.8f);
generalPath.curveTo(32.7f, 32.0f, 33.3f, 33.7f, 33.3f, 35.899998f);
generalPath.curveTo(33.3f, 38.1f, 32.8f, 39.899998f, 32.0f, 41.1f);
generalPath.curveTo(30.8f, 42.899998f, 28.9f, 43.8f, 26.8f, 43.8f);
generalPath.curveTo(26.099998f, 43.8f, 25.5f, 43.8f, 25.0f, 43.6f);
generalPath.lineTo(25.0f, 53.399998f);
generalPath.lineTo(22.8f, 53.399998f);
generalPath.lineTo(22.8f, 29.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.030000686645508, 62.0), new Point2D.Double(28.030000686645508, 19.29199981689453), new float[] {0.005f,0.343f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 130, 129, 255)) : new Color(0, 130, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 106, 105, 255)) : new Color(0, 106, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 56, 54, 255)) : new Color(0, 56, 54, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(43.3f, 24.7f);
generalPath.lineTo(43.3f, 27.300001f);
generalPath.lineTo(52.1f, 27.300001f);
generalPath.lineTo(52.1f, 34.600002f);
generalPath.lineTo(43.3f, 34.600002f);
generalPath.lineTo(43.3f, 37.4f);
generalPath.lineTo(52.1f, 37.4f);
generalPath.lineTo(52.1f, 40.600002f);
generalPath.lineTo(43.3f, 40.600002f);
generalPath.lineTo(43.3f, 43.2f);
generalPath.lineTo(52.1f, 43.2f);
generalPath.lineTo(52.1f, 46.5f);
generalPath.lineTo(43.3f, 46.5f);
generalPath.lineTo(43.3f, 49.4f);
generalPath.lineTo(52.1f, 49.4f);
generalPath.lineTo(52.1f, 52.7f);
generalPath.lineTo(43.3f, 52.7f);
generalPath.lineTo(43.3f, 58.2f);
generalPath.lineTo(58.199997f, 58.2f);
generalPath.lineTo(58.199997f, 24.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(50.73899841308594, 58.152000427246094), new Point2D.Double(50.73899841308594, 24.680999755859375), new float[] {0.005f,0.343f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 130, 129, 255)) : new Color(0, 130, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 106, 105, 255)) : new Color(0, 106, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 56, 54, 255)) : new Color(0, 56, 54, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(214, 237, 232, 255)) : new Color(214, 237, 232, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 235, 230, 255)) : new Color(211, 235, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 227, 223, 255)) : new Color(199, 227, 223, 255)),((colorFilter != null) ? colorFilter.filter(new Color(183, 216, 213, 255)) : new Color(183, 216, 213, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 203, 201, 255)) : new Color(160, 203, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(132, 186, 185, 255)) : new Color(132, 186, 185, 255)),((colorFilter != null) ? colorFilter.filter(new Color(98, 167, 167, 255)) : new Color(98, 167, 167, 255)),((colorFilter != null) ? colorFilter.filter(new Color(52, 147, 148, 255)) : new Color(52, 147, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 127, 127, 255)) : new Color(0, 127, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 107, 106, 255)) : new Color(0, 107, 106, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 107, 105, 255)) : new Color(0, 107, 105, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 110, 108, 255)) : new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
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
        return 0.13300000131130219;
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
		return 0.7379999160766602;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_pub() {
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
    public static NeonIcon of(int width, int height) {
       ext_pub base = new ext_pub();
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
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_pub base = new ext_pub();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_pub::new;
    }
}

