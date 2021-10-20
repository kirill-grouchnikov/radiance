package org.pushingpixels.radiance.demo.component.svg.filetypes.transcoded;

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
public class ext_xspf implements RadianceIcon {
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
generalPath.moveTo(7.7f, 91.2f);
generalPath.lineTo(13.1f, 83.0f);
generalPath.lineTo(8.200001f, 75.5f);
generalPath.lineTo(12.0f, 75.5f);
generalPath.lineTo(15.2f, 80.6f);
generalPath.lineTo(18.3f, 75.5f);
generalPath.lineTo(22.0f, 75.5f);
generalPath.lineTo(17.0f, 83.1f);
generalPath.lineTo(22.4f, 91.2f);
generalPath.lineTo(18.5f, 91.2f);
generalPath.lineTo(15.0f, 85.8f);
generalPath.lineTo(11.5f, 91.200005f);
generalPath.lineTo(7.7f, 91.200005f);
generalPath.closePath();
generalPath.moveTo(23.3f, 86.0f);
generalPath.lineTo(26.4f, 85.7f);
generalPath.curveTo(26.6f, 86.7f, 27.0f, 87.5f, 27.5f, 88.0f);
generalPath.curveTo(28.0f, 88.5f, 28.9f, 88.7f, 29.8f, 88.7f);
generalPath.curveTo(30.8f, 88.7f, 31.599998f, 88.5f, 32.1f, 88.0f);
generalPath.curveTo(32.6f, 87.6f, 32.899998f, 87.1f, 32.899998f, 86.5f);
generalPath.curveTo(32.899998f, 86.1f, 32.8f, 85.8f, 32.6f, 85.5f);
generalPath.curveTo(32.399998f, 85.2f, 31.999998f, 85.0f, 31.399998f, 84.8f);
generalPath.curveTo(30.999998f, 84.700005f, 30.199997f, 84.4f, 28.799997f, 84.100006f);
generalPath.curveTo(27.099997f, 83.700005f, 25.899998f, 83.200005f, 25.199997f, 82.50001f);
generalPath.curveTo(24.199997f, 81.600006f, 23.699997f, 80.600006f, 23.699997f, 79.30001f);
generalPath.curveTo(23.699997f, 78.50001f, 23.899998f, 77.70001f, 24.399998f, 77.10001f);
generalPath.curveTo(24.899998f, 76.40002f, 25.499998f, 75.90002f, 26.399998f, 75.500015f);
generalPath.curveTo(27.299997f, 75.10001f, 28.299997f, 75.000015f, 29.499998f, 75.000015f);
generalPath.curveTo(31.499998f, 75.000015f, 33.0f, 75.40002f, 34.0f, 76.30002f);
generalPath.curveTo(35.0f, 77.20002f, 35.5f, 78.30002f, 35.6f, 79.80002f);
generalPath.lineTo(32.399998f, 79.90002f);
generalPath.curveTo(32.3f, 79.10001f, 31.999998f, 78.500015f, 31.499998f, 78.20002f);
generalPath.curveTo(30.999998f, 77.80002f, 30.399998f, 77.70002f, 29.499998f, 77.70002f);
generalPath.curveTo(28.599998f, 77.70002f, 27.799997f, 77.90002f, 27.299997f, 78.30002f);
generalPath.curveTo(26.999998f, 78.500015f, 26.799997f, 78.90002f, 26.799997f, 79.30002f);
generalPath.curveTo(26.799997f, 79.70002f, 26.999998f, 80.000015f, 27.299997f, 80.30002f);
generalPath.curveTo(27.699997f, 80.60002f, 28.699997f, 81.000015f, 30.299997f, 81.40002f);
generalPath.curveTo(31.899998f, 81.80002f, 32.999996f, 82.10001f, 33.799995f, 82.500015f);
generalPath.curveTo(34.499996f, 82.90002f, 35.099995f, 83.40002f, 35.599995f, 84.10001f);
generalPath.curveTo(35.999996f, 84.80001f, 36.199993f, 85.60001f, 36.199993f, 86.60001f);
generalPath.curveTo(36.199993f, 87.500015f, 35.899994f, 88.30001f, 35.399994f, 89.10001f);
generalPath.curveTo(34.899994f, 89.90002f, 34.199993f, 90.500015f, 33.199993f, 90.90002f);
generalPath.curveTo(32.29999f, 91.30002f, 31.099993f, 91.500015f, 29.699993f, 91.500015f);
generalPath.curveTo(27.699993f, 91.500015f, 26.099993f, 91.000015f, 25.099993f, 90.10001f);
generalPath.curveTo(24.199993f, 89.10001f, 23.499992f, 87.80001f, 23.299994f, 86.000015f);
generalPath.closePath();
generalPath.moveTo(39.0f, 91.2f);
generalPath.lineTo(39.0f, 75.4f);
generalPath.lineTo(44.2f, 75.4f);
generalPath.curveTo(46.2f, 75.4f, 47.4f, 75.5f, 48.0f, 75.6f);
generalPath.curveTo(48.9f, 75.799995f, 49.7f, 76.4f, 50.3f, 77.1f);
generalPath.curveTo(50.899998f, 77.9f, 51.2f, 78.9f, 51.2f, 80.2f);
generalPath.curveTo(51.2f, 81.2f, 51.0f, 82.0f, 50.7f, 82.6f);
generalPath.curveTo(50.3f, 83.299995f, 49.9f, 83.799995f, 49.3f, 84.2f);
generalPath.curveTo(48.8f, 84.6f, 48.2f, 84.799995f, 47.6f, 84.899994f);
generalPath.curveTo(46.8f, 85.09999f, 45.699997f, 85.09999f, 44.3f, 85.09999f);
generalPath.lineTo(42.2f, 85.09999f);
generalPath.lineTo(42.2f, 91.0f);
generalPath.lineTo(39.0f, 91.0f);
generalPath.closePath();
generalPath.moveTo(42.2f, 78.1f);
generalPath.lineTo(42.2f, 82.6f);
generalPath.lineTo(44.0f, 82.6f);
generalPath.curveTo(45.3f, 82.6f, 46.1f, 82.5f, 46.5f, 82.4f);
generalPath.curveTo(46.9f, 82.3f, 47.3f, 82.0f, 47.5f, 81.6f);
generalPath.curveTo(47.7f, 81.2f, 47.9f, 80.799995f, 47.9f, 80.4f);
generalPath.curveTo(47.9f, 79.8f, 47.7f, 79.4f, 47.4f, 79.0f);
generalPath.curveTo(47.100002f, 78.6f, 46.600002f, 78.4f, 46.100002f, 78.3f);
generalPath.curveTo(45.7f, 78.200005f, 44.9f, 78.200005f, 43.800003f, 78.200005f);
generalPath.lineTo(42.200005f, 78.200005f);
generalPath.closePath();
generalPath.moveTo(53.800003f, 91.2f);
generalPath.lineTo(53.800003f, 75.4f);
generalPath.lineTo(64.700005f, 75.4f);
generalPath.lineTo(64.700005f, 78.1f);
generalPath.lineTo(57.0f, 78.1f);
generalPath.lineTo(57.0f, 81.799995f);
generalPath.lineTo(63.6f, 81.799995f);
generalPath.lineTo(63.6f, 84.49999f);
generalPath.lineTo(57.0f, 84.49999f);
generalPath.lineTo(57.0f, 91.19999f);
generalPath.lineTo(53.8f, 91.19999f);
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
generalPath.moveTo(15.2f, 33.1f);
generalPath.lineTo(38.6f, 33.1f);
generalPath.curveTo(39.8f, 33.1f, 40.8f, 32.1f, 40.8f, 30.899998f);
generalPath.curveTo(40.8f, 29.699997f, 39.8f, 28.699997f, 38.6f, 28.699997f);
generalPath.lineTo(15.2f, 28.699997f);
generalPath.curveTo(14.0f, 28.699997f, 13.0f, 29.699997f, 13.0f, 30.899998f);
generalPath.curveTo(13.0f, 32.1f, 14.0f, 33.1f, 15.2f, 33.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.0, 30.927000045776367), new Point2D.Double(40.702999114990234, 30.927000045776367), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(53, 44, 127, 255)) : new Color(53, 44, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(62, 55, 134, 255)) : new Color(62, 55, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(84, 79, 150, 255)) : new Color(84, 79, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(103, 99, 165, 255)) : new Color(103, 99, 165, 255)),((colorFilter != null) ? colorFilter.filter(new Color(117, 114, 177, 255)) : new Color(117, 114, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(126, 124, 186, 255)) : new Color(126, 124, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 128, 189, 255)) : new Color(129, 128, 189, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(15.2f, 44.3f);
generalPath.lineTo(38.6f, 44.3f);
generalPath.curveTo(39.8f, 44.3f, 40.8f, 43.3f, 40.8f, 42.1f);
generalPath.curveTo(40.8f, 40.899998f, 39.8f, 39.899998f, 38.6f, 39.899998f);
generalPath.lineTo(15.2f, 39.899998f);
generalPath.curveTo(14.0f, 40.0f, 13.0f, 41.0f, 13.0f, 42.2f);
generalPath.curveTo(13.0f, 43.4f, 14.0f, 44.3f, 15.2f, 44.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.0, 42.18199920654297), new Point2D.Double(40.702999114990234, 42.18199920654297), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(53, 44, 127, 255)) : new Color(53, 44, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(62, 55, 134, 255)) : new Color(62, 55, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(84, 79, 150, 255)) : new Color(84, 79, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(103, 99, 165, 255)) : new Color(103, 99, 165, 255)),((colorFilter != null) ? colorFilter.filter(new Color(117, 114, 177, 255)) : new Color(117, 114, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(126, 124, 186, 255)) : new Color(126, 124, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 128, 189, 255)) : new Color(129, 128, 189, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(26.4f, 50.4f);
generalPath.lineTo(15.2f, 50.4f);
generalPath.curveTo(14.0f, 50.4f, 13.0f, 51.4f, 13.0f, 52.600002f);
generalPath.curveTo(13.0f, 53.800003f, 14.0f, 54.800003f, 15.2f, 54.800003f);
generalPath.lineTo(26.5f, 54.800003f);
generalPath.curveTo(27.7f, 54.800003f, 28.7f, 53.800003f, 28.7f, 52.600002f);
generalPath.curveTo(28.7f, 51.4f, 27.6f, 50.4f, 26.400002f, 50.4f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(13.0, 52.57099914550781), new Point2D.Double(28.58300018310547, 52.57099914550781), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(53, 44, 127, 255)) : new Color(53, 44, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(62, 55, 134, 255)) : new Color(62, 55, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(84, 79, 150, 255)) : new Color(84, 79, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(103, 99, 165, 255)) : new Color(103, 99, 165, 255)),((colorFilter != null) ? colorFilter.filter(new Color(117, 114, 177, 255)) : new Color(117, 114, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(126, 124, 186, 255)) : new Color(126, 124, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 128, 189, 255)) : new Color(129, 128, 189, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(53.8f, 32.6f);
generalPath.curveTo(52.2f, 31.8f, 50.0f, 30.499998f, 49.2f, 28.8f);
generalPath.curveTo(49.2f, 27.9f, 48.4f, 27.099998f, 47.5f, 27.099998f);
generalPath.curveTo(46.6f, 27.099998f, 45.8f, 27.899998f, 45.8f, 28.8f);
generalPath.lineTo(45.8f, 50.699997f);
generalPath.curveTo(44.1f, 49.799995f, 40.8f, 50.1f, 38.3f, 51.499996f);
generalPath.curveTo(34.399998f, 53.599995f, 32.8f, 57.699997f, 34.5f, 60.499996f);
generalPath.curveTo(36.2f, 63.299995f, 40.7f, 63.899998f, 44.6f, 61.699997f);
generalPath.curveTo(47.3f, 60.199997f, 49.1f, 57.699997f, 49.199997f, 55.299995f);
generalPath.lineTo(49.199997f, 36.4f);
generalPath.curveTo(54.799995f, 36.4f, 58.1f, 38.600002f, 56.799995f, 44.100002f);
generalPath.curveTo(56.599995f, 45.100002f, 56.199997f, 46.100002f, 55.799995f, 47.000004f);
generalPath.curveTo(55.599995f, 47.300003f, 55.599995f, 47.700005f, 55.899994f, 48.000004f);
generalPath.curveTo(56.199993f, 48.300003f, 56.699993f, 48.200005f, 57.099995f, 47.800003f);
generalPath.curveTo(59.199993f, 45.800003f, 60.399994f, 43.100002f, 60.599995f, 40.200005f);
generalPath.curveTo(60.699993f, 36.300003f, 56.999996f, 34.100006f, 53.799995f, 32.600006f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.935001373291016, 45.04399871826172), new Point2D.Double(60.632999420166016, 45.04399871826172), new float[] {0.0f,0.074f,0.266f,0.457f,0.645f,0.827f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(53, 44, 127, 255)) : new Color(53, 44, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(62, 55, 134, 255)) : new Color(62, 55, 134, 255)),((colorFilter != null) ? colorFilter.filter(new Color(84, 79, 150, 255)) : new Color(84, 79, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(103, 99, 165, 255)) : new Color(103, 99, 165, 255)),((colorFilter != null) ? colorFilter.filter(new Color(117, 114, 177, 255)) : new Color(117, 114, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(126, 124, 186, 255)) : new Color(126, 124, 186, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 128, 189, 255)) : new Color(129, 128, 189, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
// _0_6_1
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
	private ext_xspf() {
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
       ext_xspf base = new ext_xspf();
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
       ext_xspf base = new ext_xspf();
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
        return ext_xspf::new;
    }
}

