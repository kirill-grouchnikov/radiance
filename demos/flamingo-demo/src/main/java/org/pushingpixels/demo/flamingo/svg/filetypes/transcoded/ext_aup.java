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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_aup implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
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
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.699999f);
generalPath.lineTo(72.3f, 99.1f);
generalPath.lineTo(0.0f, 99.1f);
generalPath.lineTo(0.0f, 0.9f);
generalPath.lineTo(45.2f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.150001525878906, 2.88700008392334), new Point2D.Double(36.150001525878906, 101.1259994506836), new float[] {0.0f,0.012f,0.182f,0.352f,0.521f,0.687f,0.848f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(89, 85, 147, 255)) : new Color(89, 85, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(91, 87, 148, 255)) : new Color(91, 87, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 119, 170, 255)) : new Color(123, 119, 170, 255)),((colorFilter != null) ? colorFilter.filter(new Color(152, 150, 191, 255)) : new Color(152, 150, 191, 255)),((colorFilter != null) ? colorFilter.filter(new Color(178, 178, 210, 255)) : new Color(178, 178, 210, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 201, 226, 255)) : new Color(199, 201, 226, 255)),((colorFilter != null) ? colorFilter.filter(new Color(214, 217, 236, 255)) : new Color(214, 217, 236, 255)),((colorFilter != null) ? colorFilter.filter(new Color(219, 223, 240, 255)) : new Color(219, 223, 240, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.699999f);
generalPath.lineTo(72.3f, 99.1f);
generalPath.lineTo(0.0f, 99.1f);
generalPath.lineTo(0.0f, 0.9f);
generalPath.lineTo(45.2f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(45, 50, 147, 255)) : new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.699999f);
generalPath.lineTo(72.3f, 99.1f);
generalPath.lineTo(0.0f, 99.1f);
generalPath.lineTo(0.0f, 0.9f);
generalPath.lineTo(45.2f, 0.9f);
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
generalPath.moveTo(27.1f, 91.2f);
generalPath.lineTo(22.7f, 91.2f);
generalPath.lineTo(20.900002f, 86.7f);
generalPath.lineTo(12.900002f, 86.7f);
generalPath.lineTo(11.200002f, 91.2f);
generalPath.lineTo(6.9f, 91.2f);
generalPath.lineTo(14.700001f, 71.299995f);
generalPath.lineTo(19.0f, 71.299995f);
generalPath.lineTo(27.1f, 91.2f);
generalPath.closePath();
generalPath.moveTo(19.6f, 83.299995f);
generalPath.lineTo(16.800001f, 75.899994f);
generalPath.lineTo(14.100001f, 83.299995f);
generalPath.lineTo(19.600002f, 83.299995f);
generalPath.closePath();
generalPath.moveTo(29.2f, 71.299995f);
generalPath.lineTo(33.3f, 71.299995f);
generalPath.lineTo(33.3f, 82.0f);
generalPath.curveTo(33.3f, 83.7f, 33.399998f, 84.8f, 33.5f, 85.3f);
generalPath.curveTo(33.7f, 86.100006f, 34.1f, 86.8f, 34.7f, 87.3f);
generalPath.curveTo(35.4f, 87.8f, 36.2f, 88.0f, 37.4f, 88.0f);
generalPath.curveTo(38.600002f, 88.0f, 39.4f, 87.8f, 40.0f, 87.3f);
generalPath.curveTo(40.6f, 86.8f, 40.9f, 86.3f, 41.1f, 85.600006f);
generalPath.curveTo(41.199997f, 84.90001f, 41.3f, 83.8f, 41.3f, 82.200005f);
generalPath.lineTo(41.3f, 71.200005f);
generalPath.lineTo(45.399998f, 71.200005f);
generalPath.lineTo(45.399998f, 81.600006f);
generalPath.curveTo(45.399998f, 84.00001f, 45.3f, 85.700005f, 45.1f, 86.700005f);
generalPath.curveTo(44.899998f, 87.700005f, 44.5f, 88.50001f, 43.899998f, 89.200005f);
generalPath.curveTo(43.299995f, 89.9f, 42.499996f, 90.4f, 41.499996f, 90.8f);
generalPath.curveTo(40.499996f, 91.200005f, 39.199997f, 91.4f, 37.599995f, 91.4f);
generalPath.curveTo(35.699993f, 91.4f, 34.199993f, 91.200005f, 33.199993f, 90.700005f);
generalPath.curveTo(32.199993f, 90.3f, 31.399994f, 89.700005f, 30.799994f, 89.00001f);
generalPath.curveTo(30.199993f, 88.30001f, 29.799994f, 87.600006f, 29.699993f, 86.80001f);
generalPath.curveTo(29.399994f, 85.70001f, 29.299994f, 84.00001f, 29.299994f, 81.80001f);
generalPath.lineTo(29.299994f, 71.3f);
generalPath.closePath();
generalPath.moveTo(49.5f, 91.2f);
generalPath.lineTo(49.5f, 71.3f);
generalPath.lineTo(56.0f, 71.3f);
generalPath.curveTo(58.5f, 71.3f, 60.1f, 71.4f, 60.8f, 71.600006f);
generalPath.curveTo(62.0f, 71.90001f, 62.899998f, 72.50001f, 63.7f, 73.50001f);
generalPath.curveTo(64.5f, 74.50001f, 64.9f, 75.80001f, 64.9f, 77.40001f);
generalPath.curveTo(64.9f, 78.600006f, 64.700005f, 79.600006f, 64.200005f, 80.50001f);
generalPath.curveTo(63.800003f, 81.30001f, 63.200005f, 82.00001f, 62.500004f, 82.50001f);
generalPath.curveTo(61.800003f, 83.00001f, 61.100002f, 83.30001f, 60.400005f, 83.40001f);
generalPath.curveTo(59.400005f, 83.600006f, 58.000004f, 83.70001f, 56.200005f, 83.70001f);
generalPath.lineTo(53.600006f, 83.70001f);
generalPath.lineTo(53.600006f, 91.20001f);
generalPath.lineTo(49.500008f, 91.20001f);
generalPath.closePath();
generalPath.moveTo(53.6f, 74.6f);
generalPath.lineTo(53.6f, 80.2f);
generalPath.lineTo(55.8f, 80.2f);
generalPath.curveTo(57.399998f, 80.2f, 58.5f, 80.1f, 59.0f, 79.899994f);
generalPath.curveTo(59.5f, 79.69999f, 60.0f, 79.399994f, 60.3f, 78.899994f);
generalPath.curveTo(60.6f, 78.49999f, 60.8f, 77.899994f, 60.8f, 77.399994f);
generalPath.curveTo(60.8f, 76.7f, 60.6f, 76.09999f, 60.2f, 75.59999f);
generalPath.curveTo(59.8f, 75.09999f, 59.2f, 74.79999f, 58.600002f, 74.69999f);
generalPath.curveTo(58.100002f, 74.59999f, 57.100002f, 74.59999f, 55.7f, 74.59999f);
generalPath.lineTo(53.600002f, 74.59999f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(22.3f, 54.7f);
generalPath.lineTo(13.599999f, 45.1f);
generalPath.lineTo(13.599999f, 45.0f);
generalPath.lineTo(22.3f, 35.4f);
generalPath.lineTo(22.3f, 29.0f);
generalPath.lineTo(10.8f, 42.5f);
generalPath.lineTo(10.8f, 47.6f);
generalPath.lineTo(22.3f, 61.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(10.784000396728516, 45.05400085449219), new Point2D.Double(22.30699920654297, 45.05400085449219), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(53, 44, 127, 255)) : new Color(53, 44, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(62, 55, 134, 255)) : new Color(62, 55, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(84, 79, 150, 255)) : new Color(84, 79, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(103, 99, 165, 255)) : new Color(103, 99, 165, 255)),((colorFilter != null) ? colorFilter.filter(new Color(117, 114, 177, 255)) : new Color(117, 114, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(126, 124, 186, 255)) : new Color(126, 124, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 128, 189, 255)) : new Color(129, 128, 189, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(10.034000396728516, 45.05400085449219), new Point2D.Double(23.05699920654297, 45.05400085449219), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(53, 44, 127, 255)) : new Color(53, 44, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(62, 55, 134, 255)) : new Color(62, 55, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(84, 79, 150, 255)) : new Color(84, 79, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(103, 99, 165, 255)) : new Color(103, 99, 165, 255)),((colorFilter != null) ? colorFilter.filter(new Color(117, 114, 177, 255)) : new Color(117, 114, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(126, 124, 186, 255)) : new Color(126, 124, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 128, 189, 255)) : new Color(129, 128, 189, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.3f, 54.7f);
generalPath.lineTo(13.599999f, 45.1f);
generalPath.lineTo(13.599999f, 45.0f);
generalPath.lineTo(22.3f, 35.4f);
generalPath.lineTo(22.3f, 29.0f);
generalPath.lineTo(10.8f, 42.5f);
generalPath.lineTo(10.8f, 47.6f);
generalPath.lineTo(22.3f, 61.1f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(51.5f, 29.0f);
generalPath.lineTo(51.5f, 35.4f);
generalPath.lineTo(60.4f, 45.0f);
generalPath.lineTo(60.4f, 45.1f);
generalPath.lineTo(51.5f, 54.699997f);
generalPath.lineTo(51.5f, 61.1f);
generalPath.lineTo(63.0f, 47.8f);
generalPath.lineTo(63.0f, 42.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(51.47600173950195, 45.05400085449219), new Point2D.Double(63.0, 45.05400085449219), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(53, 44, 127, 255)) : new Color(53, 44, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(62, 55, 134, 255)) : new Color(62, 55, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(84, 79, 150, 255)) : new Color(84, 79, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(103, 99, 165, 255)) : new Color(103, 99, 165, 255)),((colorFilter != null) ? colorFilter.filter(new Color(117, 114, 177, 255)) : new Color(117, 114, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(126, 124, 186, 255)) : new Color(126, 124, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 128, 189, 255)) : new Color(129, 128, 189, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(50.72600173950195, 45.05400085449219), new Point2D.Double(63.75, 45.05400085449219), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(53, 44, 127, 255)) : new Color(53, 44, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(62, 55, 134, 255)) : new Color(62, 55, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(84, 79, 150, 255)) : new Color(84, 79, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(103, 99, 165, 255)) : new Color(103, 99, 165, 255)),((colorFilter != null) ? colorFilter.filter(new Color(117, 114, 177, 255)) : new Color(117, 114, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(126, 124, 186, 255)) : new Color(126, 124, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 128, 189, 255)) : new Color(129, 128, 189, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(51.5f, 29.0f);
generalPath.lineTo(51.5f, 35.4f);
generalPath.lineTo(60.4f, 45.0f);
generalPath.lineTo(60.4f, 45.1f);
generalPath.lineTo(51.5f, 54.699997f);
generalPath.lineTo(51.5f, 61.1f);
generalPath.lineTo(63.0f, 47.8f);
generalPath.lineTo(63.0f, 42.3f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(42.8f, 33.9f);
generalPath.curveTo(41.3f, 33.2f, 39.399998f, 32.100002f, 38.7f, 30.500002f);
generalPath.curveTo(38.7f, 29.700003f, 38.0f, 29.000002f, 37.2f, 29.000002f);
generalPath.curveTo(36.4f, 29.000002f, 35.7f, 29.700003f, 35.7f, 30.500002f);
generalPath.lineTo(35.7f, 50.100002f);
generalPath.curveTo(34.2f, 49.300003f, 31.300001f, 49.500004f, 29.0f, 50.800003f);
generalPath.curveTo(25.6f, 52.700005f, 24.1f, 56.300003f, 25.6f, 58.9f);
generalPath.curveTo(27.1f, 61.4f, 31.2f, 61.9f, 34.6f, 60.0f);
generalPath.curveTo(37.0f, 58.7f, 38.6f, 56.4f, 38.699997f, 54.2f);
generalPath.lineTo(38.699997f, 37.3f);
generalPath.curveTo(43.699997f, 37.3f, 46.6f, 39.3f, 45.499996f, 44.1f);
generalPath.curveTo(45.299995f, 45.0f, 44.999996f, 45.899998f, 44.599995f, 46.699997f);
generalPath.curveTo(44.399994f, 46.999996f, 44.399994f, 47.299995f, 44.699993f, 47.6f);
generalPath.curveTo(44.899994f, 47.8f, 45.399994f, 47.8f, 45.79999f, 47.399998f);
generalPath.curveTo(47.699993f, 45.6f, 48.79999f, 43.199997f, 48.89999f, 40.6f);
generalPath.curveTo(48.99999f, 37.3f, 45.69999f, 35.199997f, 42.79999f, 33.899998f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(25.065000534057617, 45.04399871826172), new Point2D.Double(48.935001373291016, 45.04399871826172), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(53, 44, 127, 255)) : new Color(53, 44, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(62, 55, 134, 255)) : new Color(62, 55, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(84, 79, 150, 255)) : new Color(84, 79, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(103, 99, 165, 255)) : new Color(103, 99, 165, 255)),((colorFilter != null) ? colorFilter.filter(new Color(117, 114, 177, 255)) : new Color(117, 114, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(126, 124, 186, 255)) : new Color(126, 124, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 128, 189, 255)) : new Color(129, 128, 189, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(24.565000534057617, 45.04399871826172), new Point2D.Double(49.435001373291016, 45.04399871826172), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(53, 44, 127, 255)) : new Color(53, 44, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(62, 55, 134, 255)) : new Color(62, 55, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(84, 79, 150, 255)) : new Color(84, 79, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(103, 99, 165, 255)) : new Color(103, 99, 165, 255)),((colorFilter != null) ? colorFilter.filter(new Color(117, 114, 177, 255)) : new Color(117, 114, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(126, 124, 186, 255)) : new Color(126, 124, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 128, 189, 255)) : new Color(129, 128, 189, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(42.8f, 33.9f);
generalPath.curveTo(41.3f, 33.2f, 39.399998f, 32.100002f, 38.7f, 30.500002f);
generalPath.curveTo(38.7f, 29.700003f, 38.0f, 29.000002f, 37.2f, 29.000002f);
generalPath.curveTo(36.4f, 29.000002f, 35.7f, 29.700003f, 35.7f, 30.500002f);
generalPath.lineTo(35.7f, 50.100002f);
generalPath.curveTo(34.2f, 49.300003f, 31.300001f, 49.500004f, 29.0f, 50.800003f);
generalPath.curveTo(25.6f, 52.700005f, 24.1f, 56.300003f, 25.6f, 58.9f);
generalPath.curveTo(27.1f, 61.4f, 31.2f, 61.9f, 34.6f, 60.0f);
generalPath.curveTo(37.0f, 58.7f, 38.6f, 56.4f, 38.699997f, 54.2f);
generalPath.lineTo(38.699997f, 37.3f);
generalPath.curveTo(43.699997f, 37.3f, 46.6f, 39.3f, 45.499996f, 44.1f);
generalPath.curveTo(45.299995f, 45.0f, 44.999996f, 45.899998f, 44.599995f, 46.699997f);
generalPath.curveTo(44.399994f, 46.999996f, 44.399994f, 47.299995f, 44.699993f, 47.6f);
generalPath.curveTo(44.899994f, 47.8f, 45.399994f, 47.8f, 45.79999f, 47.399998f);
generalPath.curveTo(47.699993f, 45.6f, 48.79999f, 43.199997f, 48.89999f, 40.6f);
generalPath.curveTo(48.99999f, 37.3f, 45.69999f, 35.199997f, 42.79999f, 33.899998f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.699999f);
generalPath.lineTo(45.2f, 27.699999f);
generalPath.lineTo(45.2f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(58.32099914550781, 87.27300262451172), new Point2D.Double(50.78300094604492, 78.83899688720703), new float[] {0.0f,0.07f,0.159f,0.255f,0.359f,0.471f,0.598f,0.751f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(89, 85, 147, 255)) : new Color(89, 85, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(112, 108, 162, 255)) : new Color(112, 108, 162, 255)),((colorFilter != null) ? colorFilter.filter(new Color(137, 136, 181, 255)) : new Color(137, 136, 181, 255)),((colorFilter != null) ? colorFilter.filter(new Color(163, 165, 200, 255)) : new Color(163, 165, 200, 255)),((colorFilter != null) ? colorFilter.filter(new Color(186, 191, 217, 255)) : new Color(186, 191, 217, 255)),((colorFilter != null) ? colorFilter.filter(new Color(206, 213, 231, 255)) : new Color(206, 213, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(222, 230, 242, 255)) : new Color(222, 230, 242, 255)),((colorFilter != null) ? colorFilter.filter(new Color(233, 243, 250, 255)) : new Color(233, 243, 250, 255)),((colorFilter != null) ? colorFilter.filter(new Color(236, 248, 254, 255)) : new Color(236, 248, 254, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.699999f);
generalPath.lineTo(45.2f, 27.699999f);
generalPath.lineTo(45.2f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(45, 50, 147, 255)) : new Color(45, 50, 147, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 0.9f);
generalPath.lineTo(72.3f, 27.699999f);
generalPath.lineTo(45.2f, 27.699999f);
generalPath.lineTo(45.2f, 0.9f);
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
		return 0.7430000305175781;
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
	private ext_aup() {
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
       ext_aup base = new ext_aup();
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
       ext_aup base = new ext_aup();
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
        return ext_aup::new;
    }
}

