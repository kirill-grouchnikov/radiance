package org.pushingpixels.demo.substance.main.check.svg.filetypes;

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
public class ext_odb implements NeonIcon {
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
generalPath.moveTo(6.6f, 80.3f);
generalPath.curveTo(6.6f, 78.3f, 6.9f, 76.600006f, 7.5f, 75.200005f);
generalPath.curveTo(8.0f, 74.200005f, 8.6f, 73.3f, 9.4f, 72.50001f);
generalPath.curveTo(10.2f, 71.700005f, 11.099999f, 71.100006f, 12.0f, 70.700005f);
generalPath.curveTo(13.3f, 70.200005f, 14.7f, 69.9f, 16.3f, 69.9f);
generalPath.curveTo(19.3f, 69.9f, 21.599998f, 70.8f, 23.4f, 72.6f);
generalPath.curveTo(25.199999f, 74.4f, 26.1f, 76.9f, 26.1f, 80.2f);
generalPath.curveTo(26.1f, 83.399994f, 25.2f, 85.899994f, 23.5f, 87.7f);
generalPath.curveTo(21.8f, 89.5f, 19.4f, 90.399994f, 16.4f, 90.399994f);
generalPath.curveTo(13.4f, 90.399994f, 11.0f, 89.49999f, 9.299999f, 87.7f);
generalPath.curveTo(7.5999985f, 85.9f, 6.5999994f, 83.399994f, 6.5999994f, 80.299995f);
generalPath.closePath();
generalPath.moveTo(10.799999f, 80.100006f);
generalPath.curveTo(10.799999f, 82.3f, 11.299999f, 84.00001f, 12.4f, 85.200005f);
generalPath.curveTo(13.5f, 86.4f, 14.799999f, 86.9f, 16.4f, 86.9f);
generalPath.curveTo(18.0f, 86.9f, 19.3f, 86.3f, 20.4f, 85.200005f);
generalPath.curveTo(21.5f, 84.100006f, 22.0f, 82.3f, 22.0f, 80.0f);
generalPath.curveTo(22.0f, 77.7f, 21.5f, 76.0f, 20.5f, 74.9f);
generalPath.curveTo(19.5f, 73.8f, 18.1f, 73.200005f, 16.5f, 73.200005f);
generalPath.curveTo(14.9f, 73.200005f, 13.5f, 73.8f, 12.5f, 74.9f);
generalPath.curveTo(11.3f, 76.1f, 10.8f, 77.9f, 10.8f, 80.1f);
generalPath.closePath();
generalPath.moveTo(29.199999f, 70.200005f);
generalPath.lineTo(36.6f, 70.200005f);
generalPath.curveTo(38.3f, 70.200005f, 39.6f, 70.3f, 40.399998f, 70.600006f);
generalPath.curveTo(41.6f, 70.90001f, 42.6f, 71.600006f, 43.399998f, 72.40001f);
generalPath.curveTo(44.199997f, 73.30001f, 44.899998f, 74.30001f, 45.3f, 75.600006f);
generalPath.curveTo(45.7f, 76.9f, 46.0f, 78.40001f, 46.0f, 80.3f);
generalPath.curveTo(46.0f, 81.9f, 45.8f, 83.3f, 45.4f, 84.5f);
generalPath.curveTo(44.9f, 85.9f, 44.2f, 87.1f, 43.2f, 88.0f);
generalPath.curveTo(42.5f, 88.7f, 41.5f, 89.2f, 40.3f, 89.6f);
generalPath.curveTo(39.399998f, 89.9f, 38.2f, 90.0f, 36.7f, 90.0f);
generalPath.lineTo(29.1f, 90.0f);
generalPath.lineTo(29.1f, 70.2f);
generalPath.closePath();
generalPath.moveTo(33.3f, 73.600006f);
generalPath.lineTo(33.3f, 86.700005f);
generalPath.lineTo(36.3f, 86.700005f);
generalPath.curveTo(37.399998f, 86.700005f, 38.3f, 86.600006f, 38.8f, 86.50001f);
generalPath.curveTo(39.5f, 86.30001f, 40.0f, 86.100006f, 40.399998f, 85.700005f);
generalPath.curveTo(40.8f, 85.3f, 41.199997f, 84.700005f, 41.499996f, 83.8f);
generalPath.curveTo(41.799995f, 82.9f, 41.899998f, 81.700005f, 41.899998f, 80.200005f);
generalPath.curveTo(41.899998f, 78.700005f, 41.8f, 77.50001f, 41.499996f, 76.700005f);
generalPath.curveTo(41.199997f, 75.9f, 40.799995f, 75.200005f, 40.299995f, 74.8f);
generalPath.curveTo(39.799995f, 74.4f, 39.199997f, 74.0f, 38.399994f, 73.9f);
generalPath.curveTo(37.799995f, 73.8f, 36.699993f, 73.700005f, 35.099995f, 73.700005f);
generalPath.lineTo(33.299995f, 73.700005f);
generalPath.closePath();
generalPath.moveTo(49.6f, 70.200005f);
generalPath.lineTo(57.6f, 70.200005f);
generalPath.curveTo(59.199997f, 70.200005f, 60.399998f, 70.3f, 61.199997f, 70.4f);
generalPath.curveTo(61.999996f, 70.5f, 62.699997f, 70.8f, 63.299995f, 71.200005f);
generalPath.curveTo(63.899994f, 71.600006f, 64.399994f, 72.200005f, 64.799995f, 72.9f);
generalPath.curveTo(65.2f, 73.6f, 65.399994f, 74.4f, 65.399994f, 75.200005f);
generalPath.curveTo(65.399994f, 76.100006f, 65.09999f, 77.00001f, 64.59999f, 77.8f);
generalPath.curveTo(64.09999f, 78.6f, 63.39999f, 79.200005f, 62.499992f, 79.5f);
generalPath.curveTo(63.699993f, 79.9f, 64.69999f, 80.5f, 65.299995f, 81.3f);
generalPath.curveTo(65.99999f, 82.100006f, 66.299995f, 83.100006f, 66.299995f, 84.3f);
generalPath.curveTo(66.299995f, 85.200005f, 66.1f, 86.100006f, 65.7f, 86.9f);
generalPath.curveTo(65.299995f, 87.8f, 64.7f, 88.4f, 63.999996f, 88.9f);
generalPath.curveTo(63.299995f, 89.4f, 62.399998f, 89.700005f, 61.299995f, 89.8f);
generalPath.curveTo(60.599995f, 90.0f, 58.999996f, 90.0f, 56.399994f, 90.100006f);
generalPath.lineTo(49.599995f, 90.100006f);
generalPath.lineTo(49.599995f, 70.2f);
generalPath.closePath();
generalPath.moveTo(53.6f, 73.50001f);
generalPath.lineTo(53.6f, 78.100006f);
generalPath.lineTo(56.3f, 78.100006f);
generalPath.curveTo(57.899998f, 78.100006f, 58.899998f, 78.100006f, 59.2f, 78.00001f);
generalPath.curveTo(59.9f, 77.90001f, 60.4f, 77.700005f, 60.8f, 77.30001f);
generalPath.curveTo(61.2f, 76.90001f, 61.399998f, 76.40001f, 61.399998f, 75.80001f);
generalPath.curveTo(61.399998f, 75.20001f, 61.199997f, 74.70001f, 60.899998f, 74.30001f);
generalPath.curveTo(60.6f, 73.90001f, 59.999996f, 73.70001f, 59.399998f, 73.60001f);
generalPath.curveTo(58.999996f, 73.60001f, 57.8f, 73.500015f, 55.899998f, 73.500015f);
generalPath.lineTo(53.6f, 73.500015f);
generalPath.closePath();
generalPath.moveTo(53.6f, 81.40001f);
generalPath.lineTo(53.6f, 86.70001f);
generalPath.lineTo(57.399998f, 86.70001f);
generalPath.curveTo(58.899998f, 86.70001f, 59.8f, 86.70001f, 60.199997f, 86.60001f);
generalPath.curveTo(60.799995f, 86.500015f, 61.299995f, 86.20001f, 61.699997f, 85.80001f);
generalPath.curveTo(62.1f, 85.40001f, 62.299995f, 84.80001f, 62.299995f, 84.10001f);
generalPath.curveTo(62.299995f, 83.500015f, 62.199997f, 83.000015f, 61.899994f, 82.60001f);
generalPath.curveTo(61.599995f, 82.20001f, 61.199993f, 81.90002f, 60.599995f, 81.70001f);
generalPath.curveTo(59.999996f, 81.500015f, 58.799995f, 81.40001f, 56.999996f, 81.40001f);
generalPath.lineTo(53.599995f, 81.40001f);
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
generalPath.moveTo(53.2f, 48.9f);
generalPath.curveTo(53.2f, 51.4f, 45.1f, 53.4f, 35.2f, 53.4f);
generalPath.curveTo(25.300003f, 53.4f, 17.2f, 51.4f, 17.2f, 48.9f);
generalPath.curveTo(17.2f, 46.4f, 25.300001f, 44.4f, 35.2f, 44.4f);
generalPath.curveTo(45.1f, 44.4f, 53.2f, 46.4f, 53.2f, 48.9f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(242, 242, 242, 255)) : new Color(242, 242, 242, 255);
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
generalPath.moveTo(48.7f, 48.6f);
generalPath.curveTo(48.7f, 50.8f, 42.7f, 52.5f, 35.2f, 52.5f);
generalPath.curveTo(27.7f, 52.5f, 21.7f, 50.8f, 21.7f, 48.6f);
generalPath.curveTo(21.7f, 46.399998f, 27.7f, 44.699997f, 35.2f, 44.699997f);
generalPath.curveTo(42.7f, 44.699997f, 48.7f, 46.399998f, 48.7f, 48.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.17099952697754, 46.37200164794922), new Point2D.Double(42.22700119018555, 60.428001403808594), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(180, 204, 216, 255)) : new Color(180, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(125, 160, 177, 255)) : new Color(125, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(79, 122, 141, 255)) : new Color(79, 122, 141, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(17.2f, 49.1f);
generalPath.lineTo(17.2f, 60.3f);
generalPath.curveTo(17.2f, 60.3f, 21.7f, 64.8f, 35.2f, 64.8f);
generalPath.curveTo(48.7f, 64.8f, 53.2f, 60.300003f, 53.2f, 60.300003f);
generalPath.lineTo(53.2f, 49.1f);
generalPath.curveTo(53.2f, 49.1f, 51.0f, 53.0f, 35.2f, 53.3f);
generalPath.curveTo(19.400002f, 53.6f, 17.2f, 49.1f, 17.2f, 49.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(17.198999404907227, 45.04999923706055), new Point2D.Double(53.19900131225586, 45.04999923706055), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(180, 204, 216, 255)) : new Color(180, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(125, 160, 177, 255)) : new Color(125, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(79, 122, 141, 255)) : new Color(79, 122, 141, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(53.2f, 33.1f);
generalPath.curveTo(53.2f, 35.6f, 45.1f, 37.6f, 35.2f, 37.6f);
generalPath.curveTo(25.300003f, 37.6f, 17.2f, 35.6f, 17.2f, 33.1f);
generalPath.curveTo(17.2f, 30.599998f, 25.300001f, 28.599998f, 35.2f, 28.599998f);
generalPath.curveTo(45.1f, 28.599998f, 53.2f, 30.599998f, 53.2f, 33.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(242, 242, 242, 255)) : new Color(242, 242, 242, 255);
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
generalPath.moveTo(48.7f, 32.8f);
generalPath.curveTo(48.7f, 35.0f, 42.7f, 36.7f, 35.2f, 36.7f);
generalPath.curveTo(27.7f, 36.7f, 21.7f, 35.0f, 21.7f, 32.8f);
generalPath.curveTo(21.7f, 30.599998f, 27.7f, 28.9f, 35.2f, 28.9f);
generalPath.curveTo(42.7f, 28.9f, 48.7f, 30.6f, 48.7f, 32.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.152999877929688, 62.15399932861328), new Point2D.Double(42.20899963378906, 76.20999908447266), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(180, 204, 216, 255)) : new Color(180, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(125, 160, 177, 255)) : new Color(125, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(79, 122, 141, 255)) : new Color(79, 122, 141, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(17.2f, 33.4f);
generalPath.lineTo(17.2f, 44.600002f);
generalPath.curveTo(17.2f, 44.600002f, 21.7f, 49.100002f, 35.2f, 49.100002f);
generalPath.curveTo(48.7f, 49.100002f, 53.2f, 44.600002f, 53.2f, 44.600002f);
generalPath.lineTo(53.2f, 33.4f);
generalPath.curveTo(53.2f, 33.4f, 51.0f, 37.300003f, 35.2f, 37.600002f);
generalPath.curveTo(19.400002f, 37.9f, 17.2f, 33.4f, 17.2f, 33.4f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(17.198999404907227, 60.75), new Point2D.Double(53.19900131225586, 60.75), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(180, 204, 216, 255)) : new Color(180, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(125, 160, 177, 255)) : new Color(125, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(79, 122, 141, 255)) : new Color(79, 122, 141, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(53.2f, 17.4f);
generalPath.curveTo(53.2f, 19.9f, 45.1f, 21.9f, 35.2f, 21.9f);
generalPath.curveTo(25.300003f, 21.9f, 17.2f, 19.9f, 17.2f, 17.4f);
generalPath.curveTo(17.2f, 14.9f, 25.300001f, 12.9f, 35.2f, 12.9f);
generalPath.curveTo(45.1f, 12.9f, 53.2f, 14.9f, 53.2f, 17.4f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(48.7f, 17.1f);
generalPath.curveTo(48.7f, 19.300001f, 42.7f, 21.0f, 35.2f, 21.0f);
generalPath.curveTo(27.7f, 21.0f, 21.7f, 19.3f, 21.7f, 17.1f);
generalPath.curveTo(21.7f, 14.900002f, 27.7f, 13.200001f, 35.2f, 13.200001f);
generalPath.curveTo(42.7f, 13.200001f, 48.7f, 14.900001f, 48.7f, 17.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.17099952697754, 77.87200164794922), new Point2D.Double(42.22700119018555, 91.9280014038086), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(17.2f, 17.6f);
generalPath.lineTo(17.2f, 28.8f);
generalPath.curveTo(17.2f, 28.8f, 21.7f, 33.3f, 35.2f, 33.3f);
generalPath.curveTo(48.7f, 33.3f, 53.2f, 28.8f, 53.2f, 28.8f);
generalPath.lineTo(53.2f, 17.6f);
generalPath.curveTo(53.2f, 17.6f, 51.0f, 21.5f, 35.2f, 21.8f);
generalPath.curveTo(19.400002f, 22.099998f, 17.2f, 17.599998f, 17.2f, 17.599998f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(17.198999404907227, 76.55000305175781), new Point2D.Double(53.19900131225586, 76.55000305175781), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(39.8f, 37.6f);
generalPath.lineTo(41.7f, 37.6f);
generalPath.curveTo(44.5f, 37.8f, 46.8f, 38.5f, 49.0f, 39.399998f);
generalPath.curveTo(53.2f, 37.499996f, 59.3f, 38.999996f, 63.0f, 40.399998f);
generalPath.curveTo(58.2f, 39.899998f, 52.5f, 40.399998f, 49.2f, 42.3f);
generalPath.curveTo(45.9f, 39.6f, 39.6f, 38.899998f, 33.7f, 39.6f);
generalPath.curveTo(35.4f, 38.5f, 37.4f, 37.899998f, 39.8f, 37.6f);
generalPath.closePath();
generalPath.moveTo(38.4f, 45.0f);
generalPath.curveTo(35.0f, 45.2f, 32.2f, 46.3f, 30.300001f, 47.9f);
generalPath.curveTo(24.600002f, 45.300003f, 14.800001f, 46.4f, 11.1f, 49.9f);
generalPath.curveTo(10.8f, 50.100002f, 10.400001f, 50.4f, 10.5f, 50.7f);
generalPath.curveTo(13.7f, 49.7f, 17.6f, 48.9f, 21.7f, 49.2f);
generalPath.curveTo(25.7f, 49.5f, 28.7f, 50.9f, 31.0f, 52.7f);
generalPath.curveTo(35.1f, 49.0f, 41.2f, 46.9f, 48.9f, 47.0f);
generalPath.curveTo(46.2f, 45.6f, 42.300003f, 44.6f, 38.4f, 45.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_14
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
// _0_15
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
	private ext_odb() {
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
       ext_odb base = new ext_odb();
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
       ext_odb base = new ext_odb();
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
        return ext_odb::new;
    }
}

