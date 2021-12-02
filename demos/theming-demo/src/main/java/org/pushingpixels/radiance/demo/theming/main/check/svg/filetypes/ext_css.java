package org.pushingpixels.radiance.demo.theming.main.check.svg.filetypes;

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
public class ext_css implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_1
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(14.4f, 44.1f);
generalPath.lineTo(14.4f, 39.199997f);
generalPath.curveTo(15.4f, 39.1f, 16.199999f, 38.999996f, 16.699999f, 38.699997f);
generalPath.curveTo(17.199999f, 38.499996f, 17.599998f, 37.999996f, 17.999998f, 37.499996f);
generalPath.curveTo(18.399998f, 36.899998f, 18.599998f, 36.199997f, 18.799997f, 35.299995f);
generalPath.curveTo(18.899998f, 34.599995f, 18.999998f, 33.499996f, 18.999998f, 31.899996f);
generalPath.curveTo(18.999998f, 29.199995f, 19.099998f, 27.399996f, 19.399998f, 26.299995f);
generalPath.curveTo(19.599998f, 25.299995f, 20.099998f, 24.399996f, 20.699997f, 23.799995f);
generalPath.curveTo(21.299995f, 23.199995f, 22.299997f, 22.699995f, 23.499996f, 22.299995f);
generalPath.curveTo(24.299995f, 22.099995f, 25.599997f, 21.899996f, 27.399996f, 21.899996f);
generalPath.lineTo(28.499996f, 21.899996f);
generalPath.lineTo(28.499996f, 26.799995f);
generalPath.curveTo(26.999996f, 26.799995f, 25.999996f, 26.899996f, 25.599997f, 27.099995f);
generalPath.curveTo(25.199997f, 27.299995f, 24.899996f, 27.499994f, 24.599997f, 27.899994f);
generalPath.curveTo(24.399996f, 28.199993f, 24.299997f, 28.799994f, 24.299997f, 29.699993f);
generalPath.curveTo(24.299997f, 30.599993f, 24.199997f, 32.199993f, 24.099997f, 34.599995f);
generalPath.curveTo(23.999996f, 35.999996f, 23.899996f, 37.099995f, 23.599997f, 37.999996f);
generalPath.curveTo(23.299997f, 38.799995f, 22.899996f, 39.499996f, 22.499996f, 40.099995f);
generalPath.curveTo(22.099997f, 40.599995f, 21.399996f, 41.199993f, 20.499996f, 41.799995f);
generalPath.curveTo(21.299995f, 42.299995f, 21.999996f, 42.799995f, 22.499996f, 43.399994f);
generalPath.curveTo(22.999996f, 43.999992f, 23.399996f, 44.799995f, 23.699997f, 45.699993f);
generalPath.curveTo(23.999998f, 46.59999f, 24.199997f, 47.79999f, 24.199997f, 49.29999f);
generalPath.curveTo(24.299997f, 51.59999f, 24.299997f, 52.999992f, 24.299997f, 53.699993f);
generalPath.curveTo(24.299997f, 54.599995f, 24.399998f, 55.199993f, 24.599997f, 55.599995f);
generalPath.curveTo(24.799997f, 55.999996f, 25.199997f, 56.199993f, 25.599997f, 56.399994f);
generalPath.curveTo(25.999996f, 56.599995f, 26.999996f, 56.699993f, 28.499996f, 56.699993f);
generalPath.lineTo(28.499996f, 61.599995f);
generalPath.lineTo(27.399996f, 61.599995f);
generalPath.curveTo(25.599997f, 61.599995f, 24.099997f, 61.499996f, 23.199997f, 61.199993f);
generalPath.curveTo(22.199997f, 60.899994f, 21.399998f, 60.399994f, 20.699997f, 59.699993f);
generalPath.curveTo(19.999996f, 58.999992f, 19.599997f, 58.199993f, 19.299997f, 57.199993f);
generalPath.curveTo(19.099997f, 56.199993f, 18.999998f, 54.599995f, 18.999998f, 52.399994f);
generalPath.curveTo(18.999998f, 49.899994f, 18.899998f, 48.199993f, 18.699999f, 47.499992f);
generalPath.curveTo(18.4f, 46.399994f, 17.9f, 45.59999f, 17.3f, 45.09999f);
generalPath.curveTo(16.599998f, 44.499992f, 15.699999f, 44.09999f, 14.4f, 44.09999f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.450000762939453, 61.54999923706055), new Point2D.Double(21.450000762939453, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(58.7f, 44.1f);
generalPath.curveTo(57.7f, 44.199997f, 56.9f, 44.3f, 56.4f, 44.6f);
generalPath.curveTo(55.9f, 44.8f, 55.5f, 45.3f, 55.100002f, 45.8f);
generalPath.curveTo(54.7f, 46.399998f, 54.500004f, 47.1f, 54.300003f, 48.0f);
generalPath.curveTo(54.200005f, 48.7f, 54.100002f, 49.8f, 54.100002f, 51.4f);
generalPath.curveTo(54.100002f, 54.100002f, 54.000004f, 55.9f, 53.7f, 57.0f);
generalPath.curveTo(53.5f, 58.1f, 53.0f, 58.9f, 52.4f, 59.5f);
generalPath.curveTo(51.800003f, 60.1f, 50.800003f, 60.6f, 49.600002f, 61.0f);
generalPath.curveTo(48.800003f, 61.2f, 47.500004f, 61.4f, 45.7f, 61.4f);
generalPath.lineTo(44.600002f, 61.4f);
generalPath.lineTo(44.600002f, 56.5f);
generalPath.curveTo(46.100002f, 56.5f, 47.000004f, 56.4f, 47.500004f, 56.2f);
generalPath.curveTo(48.000004f, 56.0f, 48.300003f, 55.7f, 48.500004f, 55.4f);
generalPath.curveTo(48.700005f, 55.100002f, 48.800003f, 54.5f, 48.800003f, 53.600002f);
generalPath.curveTo(48.800003f, 52.800003f, 48.9f, 51.2f, 49.000004f, 48.800003f);
generalPath.curveTo(49.100002f, 47.4f, 49.300003f, 46.200005f, 49.600002f, 45.4f);
generalPath.curveTo(49.9f, 44.5f, 50.300003f, 43.800003f, 50.800003f, 43.2f);
generalPath.curveTo(51.300003f, 42.6f, 51.9f, 42.100002f, 52.700005f, 41.600002f);
generalPath.curveTo(51.700005f, 40.9f, 50.900005f, 40.300003f, 50.500004f, 39.7f);
generalPath.curveTo(49.900005f, 38.8f, 49.400005f, 37.600002f, 49.200005f, 36.3f);
generalPath.curveTo(49.000004f, 35.3f, 48.900005f, 33.2f, 48.900005f, 30.0f);
generalPath.curveTo(48.900005f, 29.0f, 48.800007f, 28.3f, 48.600006f, 27.9f);
generalPath.curveTo(48.400005f, 27.6f, 48.100006f, 27.3f, 47.700005f, 27.1f);
generalPath.curveTo(47.300003f, 26.9f, 46.300003f, 26.800001f, 44.700005f, 26.800001f);
generalPath.lineTo(44.700005f, 22.0f);
generalPath.lineTo(45.800003f, 22.0f);
generalPath.curveTo(47.600002f, 22.0f, 49.100002f, 22.1f, 50.000004f, 22.4f);
generalPath.curveTo(51.000004f, 22.699999f, 51.800003f, 23.199999f, 52.500004f, 23.9f);
generalPath.curveTo(53.200005f, 24.6f, 53.600002f, 25.4f, 53.900005f, 26.4f);
generalPath.curveTo(54.100006f, 27.4f, 54.300007f, 29.0f, 54.300007f, 31.2f);
generalPath.curveTo(54.300007f, 33.7f, 54.400005f, 35.3f, 54.600006f, 36.100002f);
generalPath.curveTo(54.900005f, 37.2f, 55.400005f, 38.000004f, 56.000008f, 38.4f);
generalPath.curveTo(56.600006f, 38.9f, 57.600006f, 39.100002f, 58.800007f, 39.2f);
generalPath.lineTo(58.70001f, 44.100002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(51.70000076293945, 61.45000076293945), new Point2D.Double(51.70000076293945, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_4
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.1f, 84.2f);
generalPath.lineTo(26.0f, 85.399994f);
generalPath.curveTo(25.4f, 87.59999f, 24.4f, 89.2f, 23.0f, 90.299995f);
generalPath.curveTo(21.6f, 91.399994f, 19.8f, 91.899994f, 17.7f, 91.899994f);
generalPath.curveTo(15.000001f, 91.899994f, 12.900001f, 90.99999f, 11.1f, 89.2f);
generalPath.curveTo(9.400001f, 87.399994f, 8.5f, 84.899994f, 8.5f, 81.7f);
generalPath.curveTo(8.5f, 78.399994f, 9.4f, 75.799995f, 11.1f, 73.899994f);
generalPath.curveTo(12.800001f, 71.99999f, 15.1f, 71.09999f, 17.900002f, 71.09999f);
generalPath.curveTo(20.400002f, 71.09999f, 22.300001f, 71.79999f, 23.900002f, 73.29999f);
generalPath.curveTo(24.800001f, 74.19999f, 25.500002f, 75.39999f, 26.000002f, 76.999985f);
generalPath.lineTo(22.000002f, 77.999985f);
generalPath.curveTo(21.800001f, 76.999985f, 21.300001f, 76.09998f, 20.500002f, 75.499985f);
generalPath.curveTo(19.700003f, 74.89999f, 18.800001f, 74.59998f, 17.800001f, 74.59998f);
generalPath.curveTo(16.300001f, 74.59998f, 15.100001f, 75.09998f, 14.200001f, 76.19998f);
generalPath.curveTo(13.300001f, 77.29998f, 12.800001f, 78.999985f, 12.800001f, 81.39998f);
generalPath.curveTo(12.800001f, 83.89998f, 13.300001f, 85.69998f, 14.200001f, 86.79998f);
generalPath.curveTo(15.1f, 87.89998f, 16.300001f, 88.39998f, 17.800001f, 88.39998f);
generalPath.curveTo(18.900002f, 88.39998f, 19.800001f, 88.099976f, 20.6f, 87.39998f);
generalPath.curveTo(21.2f, 86.69998f, 21.7f, 85.599976f, 22.1f, 84.19998f);
generalPath.closePath();
generalPath.moveTo(28.400002f, 85.0f);
generalPath.lineTo(32.300003f, 84.6f);
generalPath.curveTo(32.500004f, 85.9f, 33.000004f, 86.9f, 33.700005f, 87.5f);
generalPath.curveTo(34.400005f, 88.1f, 35.400005f, 88.4f, 36.600006f, 88.4f);
generalPath.curveTo(37.900005f, 88.4f, 38.900005f, 88.1f, 39.500008f, 87.6f);
generalPath.curveTo(40.20001f, 87.0f, 40.500008f, 86.4f, 40.500008f, 85.7f);
generalPath.curveTo(40.500008f, 85.2f, 40.40001f, 84.799995f, 40.100006f, 84.5f);
generalPath.curveTo(39.800007f, 84.2f, 39.300007f, 83.9f, 38.600006f, 83.6f);
generalPath.curveTo(38.100006f, 83.4f, 37.000008f, 83.1f, 35.400005f, 82.7f);
generalPath.curveTo(33.200005f, 82.2f, 31.700005f, 81.5f, 30.800005f, 80.7f);
generalPath.curveTo(29.600004f, 79.6f, 29.000006f, 78.299995f, 29.000006f, 76.7f);
generalPath.curveTo(29.000006f, 75.7f, 29.300005f, 74.7f, 29.900005f, 73.799995f);
generalPath.curveTo(30.500006f, 72.899994f, 31.300005f, 72.2f, 32.400005f, 71.799995f);
generalPath.curveTo(33.500004f, 71.299995f, 34.800007f, 71.1f, 36.300007f, 71.1f);
generalPath.curveTo(38.800007f, 71.1f, 40.70001f, 71.7f, 42.000008f, 72.799995f);
generalPath.curveTo(43.300007f, 73.899994f, 43.90001f, 75.399994f, 44.000008f, 77.2f);
generalPath.lineTo(40.000008f, 77.399994f);
generalPath.curveTo(39.800007f, 76.399994f, 39.500008f, 75.59999f, 38.90001f, 75.2f);
generalPath.curveTo(38.30001f, 74.7f, 37.500008f, 74.5f, 36.30001f, 74.5f);
generalPath.curveTo(35.10001f, 74.5f, 34.200012f, 74.7f, 33.50001f, 75.2f);
generalPath.curveTo(33.30001f, 75.5f, 33.00001f, 76.0f, 33.00001f, 76.5f);
generalPath.curveTo(33.00001f, 77.0f, 33.200012f, 77.4f, 33.60001f, 77.7f);
generalPath.curveTo(34.10001f, 78.1f, 35.40001f, 78.6f, 37.30001f, 79.0f);
generalPath.curveTo(39.200012f, 79.4f, 40.700012f, 79.9f, 41.700012f, 80.4f);
generalPath.curveTo(42.700012f, 80.9f, 43.400013f, 81.6f, 43.900013f, 82.4f);
generalPath.curveTo(44.400013f, 83.200005f, 44.700012f, 84.3f, 44.700012f, 85.6f);
generalPath.curveTo(44.700012f, 86.7f, 44.400013f, 87.799995f, 43.700012f, 88.799995f);
generalPath.curveTo(43.100014f, 89.799995f, 42.200012f, 90.49999f, 41.00001f, 90.99999f);
generalPath.curveTo(39.80001f, 91.49999f, 38.400013f, 91.69999f, 36.60001f, 91.69999f);
generalPath.curveTo(34.10001f, 91.69999f, 32.10001f, 91.09999f, 30.80001f, 89.89999f);
generalPath.curveTo(29.500011f, 88.999985f, 28.70001f, 87.29999f, 28.400011f, 84.999985f);
generalPath.closePath();
generalPath.moveTo(47.100002f, 85.0f);
generalPath.lineTo(51.000004f, 84.6f);
generalPath.curveTo(51.200005f, 85.9f, 51.700005f, 86.9f, 52.400005f, 87.5f);
generalPath.curveTo(53.100006f, 88.1f, 54.100006f, 88.4f, 55.300007f, 88.4f);
generalPath.curveTo(56.600006f, 88.4f, 57.600006f, 88.1f, 58.20001f, 87.6f);
generalPath.curveTo(58.90001f, 87.0f, 59.20001f, 86.4f, 59.20001f, 85.7f);
generalPath.curveTo(59.20001f, 85.2f, 59.10001f, 84.799995f, 58.800007f, 84.5f);
generalPath.curveTo(58.500008f, 84.2f, 58.000008f, 83.9f, 57.300007f, 83.6f);
generalPath.curveTo(56.800007f, 83.4f, 55.70001f, 83.1f, 54.100006f, 82.7f);
generalPath.curveTo(51.900005f, 82.2f, 50.400005f, 81.5f, 49.500008f, 80.7f);
generalPath.curveTo(48.300007f, 79.6f, 47.70001f, 78.299995f, 47.70001f, 76.7f);
generalPath.curveTo(47.70001f, 75.7f, 48.000008f, 74.7f, 48.60001f, 73.799995f);
generalPath.curveTo(49.20001f, 72.899994f, 50.00001f, 72.2f, 51.10001f, 71.799995f);
generalPath.curveTo(52.20001f, 71.299995f, 53.50001f, 71.1f, 55.00001f, 71.1f);
generalPath.curveTo(57.50001f, 71.1f, 59.400013f, 71.7f, 60.700012f, 72.799995f);
generalPath.curveTo(62.00001f, 73.899994f, 62.600014f, 75.399994f, 62.700012f, 77.2f);
generalPath.lineTo(58.700012f, 77.399994f);
generalPath.curveTo(58.50001f, 76.399994f, 58.200012f, 75.59999f, 57.600014f, 75.2f);
generalPath.curveTo(57.000015f, 74.7f, 56.200012f, 74.5f, 55.000015f, 74.5f);
generalPath.curveTo(53.800014f, 74.5f, 52.900017f, 74.7f, 52.200016f, 75.2f);
generalPath.curveTo(51.800014f, 75.5f, 51.600018f, 75.899994f, 51.600018f, 76.399994f);
generalPath.curveTo(51.600018f, 76.899994f, 51.80002f, 77.299995f, 52.200016f, 77.59999f);
generalPath.curveTo(52.700016f, 77.99999f, 54.000015f, 78.49999f, 55.900017f, 78.899994f);
generalPath.curveTo(57.80002f, 79.299995f, 59.30002f, 79.799995f, 60.30002f, 80.299995f);
generalPath.curveTo(61.30002f, 80.799995f, 62.00002f, 81.49999f, 62.50002f, 82.299995f);
generalPath.curveTo(63.00002f, 83.1f, 63.30002f, 84.2f, 63.30002f, 85.49999f);
generalPath.curveTo(63.30002f, 86.59999f, 63.00002f, 87.69999f, 62.30002f, 88.69999f);
generalPath.curveTo(61.70002f, 89.69999f, 60.80002f, 90.39999f, 59.600018f, 90.89999f);
generalPath.curveTo(58.400017f, 91.39999f, 57.00002f, 91.59998f, 55.200016f, 91.59998f);
generalPath.curveTo(52.700016f, 91.59998f, 50.700016f, 90.999985f, 49.400017f, 89.79998f);
generalPath.curveTo(48.200016f, 88.99998f, 47.400017f, 87.29998f, 47.100018f, 84.99998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
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
	private ext_css() {
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
       ext_css base = new ext_css();
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
       ext_css base = new ext_css();
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
        return ext_css::new;
    }
}

