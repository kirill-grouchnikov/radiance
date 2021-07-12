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
public class ext_doc implements NeonIcon {
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
generalPath.moveTo(6.6f, 71.2f);
generalPath.lineTo(14.0f, 71.2f);
generalPath.curveTo(15.7f, 71.2f, 16.9f, 71.299995f, 17.8f, 71.6f);
generalPath.curveTo(19.0f, 71.9f, 20.0f, 72.6f, 20.8f, 73.4f);
generalPath.curveTo(21.599998f, 74.3f, 22.3f, 75.3f, 22.699999f, 76.6f);
generalPath.curveTo(23.099998f, 77.9f, 23.4f, 79.4f, 23.4f, 81.299995f);
generalPath.curveTo(23.4f, 82.899994f, 23.199999f, 84.299995f, 22.8f, 85.49999f);
generalPath.curveTo(22.3f, 86.899994f, 21.599998f, 88.09999f, 20.699999f, 88.99999f);
generalPath.curveTo(19.999998f, 89.69999f, 19.099998f, 90.19999f, 17.9f, 90.59999f);
generalPath.curveTo(17.0f, 90.899994f, 15.799999f, 90.99999f, 14.299999f, 90.99999f);
generalPath.lineTo(6.6f, 90.99999f);
generalPath.lineTo(6.6f, 71.2f);
generalPath.closePath();
generalPath.moveTo(10.6f, 74.6f);
generalPath.lineTo(10.6f, 87.7f);
generalPath.lineTo(13.6f, 87.7f);
generalPath.curveTo(14.700001f, 87.7f, 15.5f, 87.6f, 16.0f, 87.5f);
generalPath.curveTo(16.7f, 87.3f, 17.2f, 87.1f, 17.6f, 86.7f);
generalPath.curveTo(18.0f, 86.299995f, 18.4f, 85.7f, 18.7f, 84.799995f);
generalPath.curveTo(19.000002f, 83.899994f, 19.1f, 82.7f, 19.1f, 81.2f);
generalPath.curveTo(19.1f, 79.7f, 19.0f, 78.5f, 18.7f, 77.7f);
generalPath.curveTo(18.400002f, 76.899994f, 18.0f, 76.2f, 17.6f, 75.799995f);
generalPath.curveTo(17.2f, 75.399994f, 16.5f, 74.99999f, 15.700001f, 74.899994f);
generalPath.curveTo(15.1f, 74.799995f, 14.000001f, 74.7f, 12.400001f, 74.7f);
generalPath.lineTo(10.6f, 74.7f);
generalPath.closePath();
generalPath.moveTo(26.0f, 81.3f);
generalPath.curveTo(26.0f, 79.3f, 26.3f, 77.600006f, 26.9f, 76.200005f);
generalPath.curveTo(27.4f, 75.200005f, 28.0f, 74.3f, 28.8f, 73.50001f);
generalPath.curveTo(29.599998f, 72.700005f, 30.5f, 72.100006f, 31.4f, 71.700005f);
generalPath.curveTo(32.6f, 71.200005f, 34.1f, 70.9f, 35.7f, 70.9f);
generalPath.curveTo(38.7f, 70.9f, 41.0f, 71.8f, 42.8f, 73.6f);
generalPath.curveTo(44.6f, 75.399994f, 45.5f, 77.9f, 45.5f, 81.2f);
generalPath.curveTo(45.5f, 84.399994f, 44.6f, 86.899994f, 42.9f, 88.7f);
generalPath.curveTo(41.200005f, 90.5f, 38.800003f, 91.399994f, 35.800003f, 91.399994f);
generalPath.curveTo(32.800003f, 91.399994f, 30.400003f, 90.49999f, 28.700003f, 88.7f);
generalPath.curveTo(26.900003f, 86.899994f, 26.000002f, 84.399994f, 26.000002f, 81.299995f);
generalPath.closePath();
generalPath.moveTo(30.2f, 81.100006f);
generalPath.curveTo(30.2f, 83.3f, 30.7f, 85.100006f, 31.800001f, 86.200005f);
generalPath.curveTo(32.800003f, 87.4f, 34.2f, 87.9f, 35.800003f, 87.9f);
generalPath.curveTo(37.400005f, 87.9f, 38.700005f, 87.3f, 39.800003f, 86.200005f);
generalPath.curveTo(40.800003f, 85.00001f, 41.4f, 83.3f, 41.4f, 81.00001f);
generalPath.curveTo(41.4f, 78.700005f, 40.9f, 77.00001f, 39.9f, 75.90001f);
generalPath.curveTo(38.9f, 74.80001f, 37.600002f, 74.20001f, 35.9f, 74.20001f);
generalPath.curveTo(34.2f, 74.20001f, 32.9f, 74.80001f, 31.900002f, 75.90001f);
generalPath.curveTo(30.7f, 77.100006f, 30.2f, 78.80001f, 30.2f, 81.100006f);
generalPath.closePath();
generalPath.moveTo(61.4f, 83.8f);
generalPath.lineTo(65.3f, 85.0f);
generalPath.curveTo(64.700005f, 87.2f, 63.700005f, 88.8f, 62.300003f, 89.8f);
generalPath.curveTo(60.9f, 90.8f, 59.100002f, 91.4f, 57.000004f, 91.4f);
generalPath.curveTo(54.300003f, 91.4f, 52.200005f, 90.5f, 50.400005f, 88.700005f);
generalPath.curveTo(48.600006f, 86.90001f, 47.800007f, 84.4f, 47.800007f, 81.3f);
generalPath.curveTo(47.800007f, 78.0f, 48.70001f, 75.4f, 50.400005f, 73.600006f);
generalPath.curveTo(52.100002f, 71.80001f, 54.400005f, 70.90001f, 57.200005f, 70.90001f);
generalPath.curveTo(59.700005f, 70.90001f, 61.600006f, 71.600006f, 63.200005f, 73.100006f);
generalPath.curveTo(64.100006f, 73.90001f, 64.8f, 75.200005f, 65.3f, 76.8f);
generalPath.lineTo(61.300003f, 77.700005f);
generalPath.curveTo(61.100002f, 76.700005f, 60.600002f, 75.9f, 59.800003f, 75.3f);
generalPath.curveTo(59.000004f, 74.700005f, 58.100002f, 74.4f, 57.100002f, 74.4f);
generalPath.curveTo(55.600002f, 74.4f, 54.4f, 74.9f, 53.500004f, 76.0f);
generalPath.curveTo(52.600006f, 77.1f, 52.100002f, 78.8f, 52.100002f, 81.1f);
generalPath.curveTo(52.100002f, 83.6f, 52.600002f, 85.4f, 53.500004f, 86.5f);
generalPath.curveTo(54.400005f, 87.6f, 55.500004f, 88.0f, 57.000004f, 88.0f);
generalPath.curveTo(58.100002f, 88.0f, 59.000004f, 87.7f, 59.800003f, 87.0f);
generalPath.curveTo(60.600002f, 86.3f, 61.100002f, 85.2f, 61.4f, 83.8f);
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_doc() {
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
       ext_doc base = new ext_doc();
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
       ext_doc base = new ext_doc();
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
        return ext_doc::new;
    }
}

