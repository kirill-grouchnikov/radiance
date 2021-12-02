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
public class ext_m3u8 implements RadianceIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
    private RadianceIcon.ColorFilter colorFilter = null;
    private Stack<AffineTransform> transformsStack = new Stack<>();

    

	private void _paint0(Graphics2D g,float origAlpha) {
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(8.2f, 91.2f);
generalPath.lineTo(8.2f, 75.4f);
generalPath.lineTo(13.0f, 75.4f);
generalPath.lineTo(15.9f, 86.1f);
generalPath.lineTo(18.8f, 75.4f);
generalPath.lineTo(23.599998f, 75.4f);
generalPath.lineTo(23.599998f, 91.1f);
generalPath.lineTo(20.599998f, 91.1f);
generalPath.lineTo(20.599998f, 78.8f);
generalPath.lineTo(17.399998f, 91.200005f);
generalPath.lineTo(14.299997f, 91.200005f);
generalPath.lineTo(11.0999975f, 78.8f);
generalPath.lineTo(11.0999975f, 91.200005f);
generalPath.lineTo(8.2f, 91.200005f);
generalPath.closePath();
generalPath.moveTo(26.0f, 87.0f);
generalPath.lineTo(29.0f, 86.6f);
generalPath.curveTo(29.1f, 87.299995f, 29.3f, 87.9f, 29.8f, 88.299995f);
generalPath.curveTo(30.199999f, 88.7f, 30.699999f, 88.899994f, 31.3f, 88.899994f);
generalPath.curveTo(31.9f, 88.899994f, 32.5f, 88.7f, 32.899998f, 88.2f);
generalPath.curveTo(33.299995f, 87.7f, 33.499996f, 87.1f, 33.499996f, 86.299995f);
generalPath.curveTo(33.499996f, 85.49999f, 33.299995f, 84.899994f, 32.899998f, 84.49999f);
generalPath.curveTo(32.499996f, 84.09999f, 31.999998f, 83.799995f, 31.399998f, 83.799995f);
generalPath.curveTo(30.999998f, 83.799995f, 30.499998f, 83.899994f, 29.999998f, 83.99999f);
generalPath.lineTo(30.299997f, 81.49999f);
generalPath.curveTo(31.099997f, 81.49999f, 31.799997f, 81.299995f, 32.199997f, 80.99999f);
generalPath.curveTo(32.6f, 80.59999f, 32.899998f, 80.09999f, 32.899998f, 79.49999f);
generalPath.curveTo(32.899998f, 78.99999f, 32.699997f, 78.49999f, 32.399998f, 78.19999f);
generalPath.curveTo(32.1f, 77.89999f, 31.699997f, 77.69999f, 31.099998f, 77.69999f);
generalPath.curveTo(30.599998f, 77.69999f, 30.099998f, 77.89999f, 29.8f, 78.19999f);
generalPath.curveTo(29.4f, 78.59999f, 29.199999f, 79.09999f, 29.099998f, 79.79999f);
generalPath.lineTo(26.3f, 79.29999f);
generalPath.curveTo(26.5f, 78.29999f, 26.8f, 77.59999f, 27.199999f, 76.999985f);
generalPath.curveTo(27.599998f, 76.39999f, 28.099998f, 75.999985f, 28.9f, 75.69998f);
generalPath.curveTo(29.6f, 75.39998f, 30.4f, 75.19998f, 31.3f, 75.19998f);
generalPath.curveTo(32.8f, 75.19998f, 34.0f, 75.69998f, 34.899998f, 76.59998f);
generalPath.curveTo(35.6f, 77.39999f, 35.999996f, 78.19998f, 35.999996f, 79.19998f);
generalPath.curveTo(35.999996f, 80.59998f, 35.199997f, 81.69998f, 33.699997f, 82.499985f);
generalPath.curveTo(34.6f, 82.69998f, 35.299995f, 83.09998f, 35.899998f, 83.79999f);
generalPath.curveTo(36.5f, 84.49999f, 36.699997f, 85.29999f, 36.699997f, 86.19999f);
generalPath.curveTo(36.699997f, 87.59999f, 36.199997f, 88.79999f, 35.199997f, 89.69999f);
generalPath.curveTo(34.199997f, 90.59999f, 32.899998f, 91.19999f, 31.399998f, 91.19999f);
generalPath.curveTo(29.999998f, 91.19999f, 28.799997f, 90.79999f, 27.799997f, 89.99999f);
generalPath.curveTo(26.699997f, 89.399994f, 26.199997f, 88.299995f, 25.999998f, 86.99999f);
generalPath.closePath();
generalPath.moveTo(39.1f, 75.4f);
generalPath.lineTo(42.3f, 75.4f);
generalPath.lineTo(42.3f, 83.9f);
generalPath.curveTo(42.3f, 85.3f, 42.3f, 86.1f, 42.399998f, 86.5f);
generalPath.curveTo(42.499996f, 87.1f, 42.899998f, 87.7f, 43.399998f, 88.1f);
generalPath.curveTo(43.899998f, 88.5f, 44.6f, 88.7f, 45.499996f, 88.7f);
generalPath.curveTo(46.399998f, 88.7f, 47.099995f, 88.5f, 47.599995f, 88.1f);
generalPath.curveTo(48.099995f, 87.7f, 48.299995f, 87.299995f, 48.399994f, 86.7f);
generalPath.curveTo(48.499992f, 86.2f, 48.499992f, 85.299995f, 48.499992f, 84.0f);
generalPath.lineTo(48.499992f, 75.3f);
generalPath.lineTo(51.699993f, 75.3f);
generalPath.lineTo(51.699993f, 83.600006f);
generalPath.curveTo(51.699993f, 85.50001f, 51.599995f, 86.8f, 51.399994f, 87.600006f);
generalPath.curveTo(51.199993f, 88.40001f, 50.899994f, 89.00001f, 50.399994f, 89.600006f);
generalPath.curveTo(49.899994f, 90.100006f, 49.299995f, 90.600006f, 48.499992f, 90.90001f);
generalPath.curveTo(47.699993f, 91.20001f, 46.699993f, 91.40001f, 45.399994f, 91.40001f);
generalPath.curveTo(43.899994f, 91.40001f, 42.699993f, 91.20001f, 41.899994f, 90.90001f);
generalPath.curveTo(41.099995f, 90.600006f, 40.499992f, 90.100006f, 39.999992f, 89.50001f);
generalPath.curveTo(39.499992f, 88.90001f, 39.199993f, 88.40001f, 39.09999f, 87.80001f);
generalPath.curveTo(38.89999f, 86.90001f, 38.79999f, 85.60001f, 38.79999f, 83.80001f);
generalPath.lineTo(38.79999f, 75.40001f);
generalPath.closePath();
generalPath.moveTo(57.199997f, 82.700005f);
generalPath.curveTo(56.399998f, 82.4f, 55.799995f, 81.9f, 55.499996f, 81.3f);
generalPath.curveTo(55.099995f, 80.700005f, 54.999996f, 80.100006f, 54.999996f, 79.4f);
generalPath.curveTo(54.999996f, 78.200005f, 55.399998f, 77.3f, 56.199997f, 76.5f);
generalPath.curveTo(56.999996f, 75.7f, 58.199997f, 75.4f, 59.699997f, 75.4f);
generalPath.curveTo(61.199997f, 75.4f, 62.399998f, 75.8f, 63.199997f, 76.5f);
generalPath.curveTo(63.999996f, 77.2f, 64.5f, 78.2f, 64.5f, 79.4f);
generalPath.curveTo(64.5f, 80.1f, 64.3f, 80.8f, 63.9f, 81.3f);
generalPath.curveTo(63.5f, 81.9f, 63.0f, 82.3f, 62.300003f, 82.600006f);
generalPath.curveTo(63.200005f, 83.00001f, 63.9f, 83.50001f, 64.3f, 84.100006f);
generalPath.curveTo(64.700005f, 84.700005f, 65.0f, 85.600006f, 65.0f, 86.40001f);
generalPath.curveTo(65.0f, 87.90001f, 64.5f, 89.00001f, 63.6f, 89.90001f);
generalPath.curveTo(62.699997f, 90.80001f, 61.399998f, 91.30001f, 59.899998f, 91.30001f);
generalPath.curveTo(58.499996f, 91.30001f, 57.199997f, 90.90001f, 56.3f, 90.20001f);
generalPath.curveTo(55.2f, 89.30001f, 54.6f, 88.10001f, 54.6f, 86.500015f);
generalPath.curveTo(54.6f, 85.60001f, 54.8f, 84.90002f, 55.199997f, 84.20001f);
generalPath.curveTo(55.6f, 83.60001f, 56.299995f, 83.10001f, 57.199997f, 82.70001f);
generalPath.closePath();
generalPath.moveTo(57.499996f, 86.4f);
generalPath.curveTo(57.499996f, 87.200005f, 57.699997f, 87.9f, 58.099995f, 88.3f);
generalPath.curveTo(58.499996f, 88.8f, 59.099995f, 89.0f, 59.699993f, 89.0f);
generalPath.curveTo(60.29999f, 89.0f, 60.899994f, 88.8f, 61.29999f, 88.3f);
generalPath.curveTo(61.699993f, 87.9f, 61.89999f, 87.200005f, 61.89999f, 86.4f);
generalPath.curveTo(61.89999f, 85.700005f, 61.69999f, 85.1f, 61.29999f, 84.6f);
generalPath.curveTo(60.89999f, 84.2f, 60.29999f, 83.9f, 59.699993f, 83.9f);
generalPath.curveTo(58.999992f, 83.9f, 58.399994f, 84.200005f, 57.999992f, 84.700005f);
generalPath.curveTo(57.59999f, 85.200005f, 57.499992f, 85.8f, 57.499992f, 86.4f);
generalPath.closePath();
generalPath.moveTo(57.799995f, 79.6f);
generalPath.curveTo(57.799995f, 80.2f, 57.999996f, 80.7f, 58.299995f, 81.0f);
generalPath.curveTo(58.599995f, 81.3f, 59.099995f, 81.5f, 59.699997f, 81.5f);
generalPath.curveTo(60.299995f, 81.5f, 60.699997f, 81.3f, 61.1f, 81.0f);
generalPath.curveTo(61.399998f, 80.7f, 61.6f, 80.2f, 61.6f, 79.6f);
generalPath.curveTo(61.6f, 79.0f, 61.399998f, 78.6f, 61.1f, 78.2f);
generalPath.curveTo(60.8f, 77.899994f, 60.3f, 77.7f, 59.699997f, 77.7f);
generalPath.curveTo(59.1f, 77.7f, 58.6f, 77.899994f, 58.299995f, 78.2f);
generalPath.curveTo(57.999992f, 78.5f, 57.799995f, 79.1f, 57.799995f, 79.6f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
// _0_6
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
	private ext_m3u8() {
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
       ext_m3u8 base = new ext_m3u8();
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
       ext_m3u8 base = new ext_m3u8();
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
        return ext_m3u8::new;
    }
}

