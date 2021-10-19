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
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class ext_docx implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.056f,0.16f,0.274f,0.398f,0.539f,0.711f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 45, 68, 255)) : new Color(0, 45, 68, 255)),((colorFilter != null) ? colorFilter.filter(new Color(1, 56, 82, 255)) : new Color(1, 56, 82, 255)),((colorFilter != null) ? colorFilter.filter(new Color(10, 77, 107, 255)) : new Color(10, 77, 107, 255)),((colorFilter != null) ? colorFilter.filter(new Color(15, 94, 130, 255)) : new Color(15, 94, 130, 255)),((colorFilter != null) ? colorFilter.filter(new Color(15, 109, 150, 255)) : new Color(15, 109, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(13, 119, 164, 255)) : new Color(13, 119, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(10, 126, 174, 255)) : new Color(10, 126, 174, 255)),((colorFilter != null) ? colorFilter.filter(new Color(8, 129, 178, 255)) : new Color(8, 129, 178, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(1, 65, 94, 255)) : new Color(1, 65, 94, 255);
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
generalPath.moveTo(5.4f, 75.3f);
generalPath.lineTo(11.3f, 75.3f);
generalPath.curveTo(12.6f, 75.3f, 13.6f, 75.4f, 14.3f, 75.600006f);
generalPath.curveTo(15.2f, 75.90001f, 16.0f, 76.40001f, 16.7f, 77.100006f);
generalPath.curveTo(17.400002f, 77.8f, 17.900002f, 78.600006f, 18.2f, 79.700005f);
generalPath.curveTo(18.5f, 80.700005f, 18.7f, 81.9f, 18.7f, 83.4f);
generalPath.curveTo(18.7f, 84.700005f, 18.5f, 85.8f, 18.2f, 86.8f);
generalPath.curveTo(17.800001f, 87.9f, 17.2f, 88.9f, 16.5f, 89.600006f);
generalPath.curveTo(15.9f, 90.100006f, 15.2f, 90.600006f, 14.2f, 90.90001f);
generalPath.curveTo(13.5f, 91.100006f, 12.5f, 91.20001f, 11.4f, 91.20001f);
generalPath.lineTo(5.3999996f, 91.20001f);
generalPath.lineTo(5.3999996f, 75.3f);
generalPath.closePath();
generalPath.moveTo(8.6f, 78.0f);
generalPath.lineTo(8.6f, 88.4f);
generalPath.lineTo(11.0f, 88.4f);
generalPath.curveTo(11.9f, 88.4f, 12.5f, 88.4f, 12.9f, 88.200005f);
generalPath.curveTo(13.4f, 88.100006f, 13.9f, 87.9f, 14.2f, 87.50001f);
generalPath.curveTo(14.5f, 87.10001f, 14.8f, 86.700005f, 15.0f, 86.00001f);
generalPath.curveTo(15.2f, 85.30001f, 15.3f, 84.30001f, 15.3f, 83.100006f);
generalPath.curveTo(15.3f, 81.9f, 15.2f, 80.90001f, 15.0f, 80.3f);
generalPath.curveTo(14.8f, 79.600006f, 14.5f, 79.100006f, 14.1f, 78.8f);
generalPath.curveTo(13.700001f, 78.5f, 13.200001f, 78.200005f, 12.6f, 78.100006f);
generalPath.curveTo(12.3f, 78.00001f, 11.400001f, 78.00001f, 10.1f, 78.00001f);
generalPath.lineTo(8.6f, 78.00001f);
generalPath.closePath();
generalPath.moveTo(20.8f, 83.3f);
generalPath.curveTo(20.8f, 81.700005f, 21.0f, 80.3f, 21.5f, 79.3f);
generalPath.curveTo(21.9f, 78.5f, 22.4f, 77.8f, 23.0f, 77.100006f);
generalPath.curveTo(23.6f, 76.50001f, 24.3f, 76.00001f, 25.1f, 75.700005f);
generalPath.curveTo(26.1f, 75.3f, 27.2f, 75.100006f, 28.5f, 75.100006f);
generalPath.curveTo(30.8f, 75.100006f, 32.7f, 75.8f, 34.1f, 77.3f);
generalPath.curveTo(35.499996f, 78.8f, 36.199997f, 80.700005f, 36.199997f, 83.3f);
generalPath.curveTo(36.199997f, 85.8f, 35.499996f, 87.8f, 34.1f, 89.3f);
generalPath.curveTo(32.699997f, 90.700005f, 30.8f, 91.5f, 28.499998f, 91.5f);
generalPath.curveTo(26.099998f, 91.5f, 24.3f, 90.8f, 22.899998f, 89.4f);
generalPath.curveTo(21.499998f, 87.8f, 20.799997f, 85.8f, 20.799997f, 83.3f);
generalPath.closePath();
generalPath.moveTo(24.099998f, 83.200005f);
generalPath.curveTo(24.099998f, 85.00001f, 24.499998f, 86.3f, 25.3f, 87.3f);
generalPath.curveTo(26.099998f, 88.200005f, 27.199999f, 88.700005f, 28.5f, 88.700005f);
generalPath.curveTo(29.8f, 88.700005f, 30.8f, 88.200005f, 31.7f, 87.3f);
generalPath.curveTo(32.5f, 86.4f, 32.9f, 85.0f, 32.9f, 83.200005f);
generalPath.curveTo(32.9f, 81.4f, 32.5f, 80.00001f, 31.7f, 79.200005f);
generalPath.curveTo(30.900002f, 78.4f, 29.800001f, 77.9f, 28.5f, 77.9f);
generalPath.curveTo(27.2f, 77.9f, 26.1f, 78.3f, 25.3f, 79.200005f);
generalPath.curveTo(24.5f, 80.00001f, 24.099998f, 81.4f, 24.099998f, 83.200005f);
generalPath.closePath();
generalPath.moveTo(48.899998f, 85.3f);
generalPath.lineTo(51.999996f, 86.3f);
generalPath.curveTo(51.499996f, 88.0f, 50.699997f, 89.3f, 49.599995f, 90.100006f);
generalPath.curveTo(48.499996f, 90.90001f, 47.099995f, 91.40001f, 45.399994f, 91.40001f);
generalPath.curveTo(43.299995f, 91.40001f, 41.599995f, 90.70001f, 40.199993f, 89.30001f);
generalPath.curveTo(38.79999f, 87.90001f, 38.199993f, 85.90001f, 38.199993f, 83.40001f);
generalPath.curveTo(38.199993f, 80.80001f, 38.899994f, 78.70001f, 40.29999f, 77.30001f);
generalPath.curveTo(41.699993f, 75.90001f, 43.499992f, 75.10001f, 45.699993f, 75.10001f);
generalPath.curveTo(47.599995f, 75.10001f, 49.199993f, 75.70001f, 50.399994f, 76.80001f);
generalPath.curveTo(51.099995f, 77.50001f, 51.699993f, 78.40001f, 51.999992f, 79.70001f);
generalPath.lineTo(48.79999f, 80.500015f);
generalPath.curveTo(48.59999f, 79.70001f, 48.199993f, 79.000015f, 47.59999f, 78.60001f);
generalPath.curveTo(46.999992f, 78.10001f, 46.29999f, 77.90002f, 45.39999f, 77.90002f);
generalPath.curveTo(44.19999f, 77.90002f, 43.29999f, 78.30002f, 42.49999f, 79.20002f);
generalPath.curveTo(41.799988f, 80.00002f, 41.39999f, 81.40002f, 41.39999f, 83.30002f);
generalPath.curveTo(41.39999f, 85.30002f, 41.79999f, 86.70002f, 42.49999f, 87.60002f);
generalPath.curveTo(43.199986f, 88.50002f, 44.19999f, 88.900024f, 45.299988f, 88.900024f);
generalPath.curveTo(46.19999f, 88.900024f, 46.899986f, 88.60002f, 47.49999f, 88.10002f);
generalPath.curveTo(48.19999f, 87.30002f, 48.69999f, 86.400024f, 48.89999f, 85.30002f);
generalPath.closePath();
generalPath.moveTo(53.199997f, 91.100006f);
generalPath.lineTo(58.6f, 82.90001f);
generalPath.lineTo(53.699997f, 75.40001f);
generalPath.lineTo(57.499996f, 75.40001f);
generalPath.lineTo(60.699997f, 80.50001f);
generalPath.lineTo(63.799995f, 75.40001f);
generalPath.lineTo(67.49999f, 75.40001f);
generalPath.lineTo(62.499992f, 83.00001f);
generalPath.lineTo(67.899994f, 91.100006f);
generalPath.lineTo(64.0f, 91.100006f);
generalPath.lineTo(60.5f, 85.700005f);
generalPath.lineTo(57.0f, 91.100006f);
generalPath.lineTo(53.2f, 91.100006f);
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
generalPath.moveTo(64.4f, 25.7f);
generalPath.curveTo(63.9f, 25.7f, 63.4f, 25.900002f, 63.0f, 26.0f);
generalPath.curveTo(62.5f, 26.2f, 62.0f, 26.4f, 61.6f, 26.6f);
generalPath.curveTo(60.899998f, 27.0f, 60.399998f, 27.4f, 60.1f, 27.9f);
generalPath.curveTo(59.8f, 28.4f, 59.5f, 29.0f, 59.3f, 29.6f);
generalPath.curveTo(58.399998f, 32.0f, 57.1f, 35.6f, 55.3f, 40.9f);
generalPath.curveTo(53.5f, 46.0f, 51.7f, 51.4f, 49.7f, 56.9f);
generalPath.lineTo(45.0f, 56.9f);
generalPath.lineTo(36.3f, 32.5f);
generalPath.lineTo(28.4f, 56.9f);
generalPath.lineTo(23.7f, 56.9f);
generalPath.curveTo(21.1f, 49.4f, 19.1f, 43.600002f, 17.7f, 39.7f);
generalPath.curveTo(16.300001f, 35.600002f, 15.200001f, 32.3f, 14.200001f, 29.5f);
generalPath.curveTo(13.900001f, 28.7f, 13.6f, 28.1f, 13.200001f, 27.7f);
generalPath.curveTo(12.800001f, 27.300001f, 12.300001f, 26.900002f, 11.800001f, 26.5f);
generalPath.curveTo(11.400002f, 26.2f, 10.900002f, 26.0f, 10.500001f, 25.9f);
generalPath.curveTo(10.000001f, 25.8f, 9.500001f, 25.699999f, 8.900001f, 25.6f);
generalPath.lineTo(8.900001f, 23.800001f);
generalPath.lineTo(26.5f, 23.800001f);
generalPath.lineTo(26.5f, 25.6f);
generalPath.curveTo(25.5f, 25.7f, 24.7f, 25.800001f, 24.2f, 26.0f);
generalPath.curveTo(23.7f, 26.1f, 23.300001f, 26.2f, 23.0f, 26.4f);
generalPath.curveTo(22.7f, 26.5f, 22.5f, 26.699999f, 22.5f, 26.8f);
generalPath.curveTo(22.4f, 26.9f, 22.4f, 27.099998f, 22.4f, 27.199999f);
generalPath.curveTo(22.4f, 27.4f, 22.4f, 27.599998f, 22.5f, 27.8f);
generalPath.curveTo(22.6f, 28.0f, 22.6f, 28.199999f, 22.7f, 28.5f);
generalPath.curveTo(23.1f, 29.7f, 23.800001f, 32.0f, 25.0f, 35.3f);
generalPath.curveTo(26.1f, 38.7f, 27.5f, 42.8f, 29.2f, 47.8f);
generalPath.lineTo(36.7f, 24.0f);
generalPath.lineTo(41.600002f, 24.0f);
generalPath.lineTo(50.300003f, 48.5f);
generalPath.curveTo(51.600002f, 44.5f, 52.600002f, 41.3f, 53.4f, 38.8f);
generalPath.curveTo(54.2f, 36.3f, 54.800003f, 34.1f, 55.300003f, 32.399998f);
generalPath.curveTo(55.600002f, 31.299997f, 55.9f, 30.399998f, 56.000004f, 29.599998f);
generalPath.curveTo(56.200005f, 28.899998f, 56.300003f, 28.199999f, 56.300003f, 27.699999f);
generalPath.curveTo(56.300003f, 27.4f, 56.100002f, 27.099998f, 55.800003f, 26.9f);
generalPath.curveTo(55.500004f, 26.699999f, 55.100002f, 26.5f, 54.600002f, 26.3f);
generalPath.curveTo(54.2f, 26.199999f, 53.600002f, 26.0f, 52.9f, 26.0f);
generalPath.curveTo(52.2f, 25.9f, 51.600002f, 25.8f, 51.100002f, 25.8f);
generalPath.lineTo(51.100002f, 23.8f);
generalPath.lineTo(64.4f, 23.8f);
generalPath.lineTo(64.4f, 25.699999f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.121000289916992, 50.46799850463867), new Point2D.Double(55.04100036621094, 87.38899993896484), new float[] {0.005f,0.116f,0.239f,0.369f,0.502f,0.639f,0.779f,0.918f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 97, 134, 255)) : new Color(0, 97, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 95, 131, 255)) : new Color(0, 95, 131, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 90, 125, 255)) : new Color(0, 90, 125, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 83, 115, 255)) : new Color(0, 83, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 72, 101, 255)) : new Color(0, 72, 101, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 57, 83, 255)) : new Color(0, 57, 83, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 37, 60, 255)) : new Color(0, 37, 60, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 3, 29, 255)) : new Color(0, 3, 29, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 255)) : new Color(0, 0, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 74.20500183105469), new Point2D.Double(58.569000244140625, 87.70500183105469), new float[] {0.005f,0.3f,0.443f,0.553f,0.647f,0.73f,0.805f,0.875f,0.938f,0.998f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(223, 241, 250, 255)) : new Color(223, 241, 250, 255)),((colorFilter != null) ? colorFilter.filter(new Color(220, 238, 247, 255)) : new Color(220, 238, 247, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 228, 239, 255)) : new Color(211, 228, 239, 255)),((colorFilter != null) ? colorFilter.filter(new Color(196, 214, 227, 255)) : new Color(196, 214, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(177, 197, 213, 255)) : new Color(177, 197, 213, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 176, 197, 255)) : new Color(154, 176, 197, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 154, 179, 255)) : new Color(129, 154, 179, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 130, 159, 255)) : new Color(100, 130, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 108, 140, 255)) : new Color(66, 108, 140, 255)),((colorFilter != null) ? colorFilter.filter(new Color(6, 87, 122, 255)) : new Color(6, 87, 122, 255)),((colorFilter != null) ? colorFilter.filter(new Color(1, 86, 121, 255)) : new Color(1, 86, 121, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(1, 65, 94, 255)) : new Color(1, 65, 94, 255);
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
	private ext_docx() {
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
       ext_docx base = new ext_docx();
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
       ext_docx base = new ext_docx();
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
        return ext_docx::new;
    }
}

