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
public class ext_j2 implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(59.4f, 24.0f);
generalPath.curveTo(59.4f, 24.0f, 51.0f, 28.0f, 44.2f, 28.9f);
generalPath.curveTo(37.4f, 29.8f, 24.400002f, 30.699999f, 21.800001f, 30.0f);
generalPath.curveTo(19.2f, 29.4f, 17.400002f, 28.6f, 17.400002f, 28.6f);
generalPath.lineTo(17.900002f, 30.4f);
generalPath.lineTo(16.2f, 31.9f);
generalPath.lineTo(16.5f, 32.4f);
generalPath.lineTo(17.2f, 32.5f);
generalPath.lineTo(19.300001f, 32.8f);
generalPath.lineTo(19.6f, 33.7f);
generalPath.lineTo(20.800001f, 33.8f);
generalPath.lineTo(21.400002f, 35.8f);
generalPath.curveTo(21.400002f, 35.8f, 23.900002f, 36.0f, 24.600002f, 36.0f);
generalPath.curveTo(25.300003f, 36.0f, 26.800003f, 35.9f, 26.800003f, 35.9f);
generalPath.lineTo(26.800003f, 36.7f);
generalPath.lineTo(27.300003f, 36.8f);
generalPath.lineTo(27.300003f, 37.7f);
generalPath.lineTo(26.100002f, 38.7f);
generalPath.lineTo(26.400002f, 38.8f);
generalPath.lineTo(26.400002f, 39.2f);
generalPath.curveTo(26.400002f, 39.2f, 23.800001f, 39.4f, 22.7f, 39.3f);
generalPath.curveTo(21.800001f, 39.0f, 21.6f, 39.0f, 21.6f, 39.0f);
generalPath.lineTo(21.5f, 39.1f);
generalPath.lineTo(21.5f, 39.6f);
generalPath.lineTo(21.7f, 39.6f);
generalPath.lineTo(21.800001f, 41.6f);
generalPath.lineTo(27.2f, 41.399998f);
generalPath.lineTo(26.800001f, 48.399998f);
generalPath.lineTo(26.800001f, 49.3f);
generalPath.lineTo(22.2f, 49.0f);
generalPath.lineTo(22.2f, 47.1f);
generalPath.lineTo(23.2f, 47.1f);
generalPath.lineTo(23.300001f, 46.399998f);
generalPath.lineTo(24.2f, 46.199997f);
generalPath.lineTo(24.300001f, 45.999996f);
generalPath.lineTo(20.800001f, 45.199997f);
generalPath.lineTo(18.2f, 45.999996f);
generalPath.lineTo(18.6f, 46.399998f);
generalPath.lineTo(19.0f, 46.399998f);
generalPath.lineTo(19.0f, 46.999996f);
generalPath.lineTo(19.9f, 47.099995f);
generalPath.lineTo(19.9f, 48.899994f);
generalPath.lineTo(18.9f, 49.199993f);
generalPath.lineTo(19.1f, 49.599995f);
generalPath.lineTo(19.300001f, 49.799995f);
generalPath.lineTo(19.300001f, 51.199997f);
generalPath.lineTo(19.900002f, 51.199997f);
generalPath.lineTo(19.900002f, 57.699997f);
generalPath.lineTo(18.900002f, 57.899998f);
generalPath.lineTo(19.000002f, 59.8f);
generalPath.lineTo(19.600002f, 59.899998f);
generalPath.lineTo(19.500002f, 64.2f);
generalPath.lineTo(22.300001f, 64.299995f);
generalPath.lineTo(22.000002f, 59.799995f);
generalPath.lineTo(26.2f, 59.699997f);
generalPath.lineTo(25.900002f, 61.999996f);
generalPath.lineTo(25.500002f, 63.599995f);
generalPath.lineTo(29.7f, 63.699993f);
generalPath.lineTo(29.7f, 59.499992f);
generalPath.lineTo(32.600002f, 59.199993f);
generalPath.lineTo(32.500004f, 61.79999f);
generalPath.lineTo(32.400005f, 63.39999f);
generalPath.lineTo(34.900005f, 63.39999f);
generalPath.lineTo(34.800007f, 59.09999f);
generalPath.lineTo(35.100006f, 59.19999f);
generalPath.lineTo(35.200005f, 57.19999f);
generalPath.lineTo(34.800003f, 57.19999f);
generalPath.lineTo(34.700005f, 56.39999f);
generalPath.lineTo(34.500004f, 53.99999f);
generalPath.lineTo(34.600002f, 51.19999f);
generalPath.lineTo(35.100002f, 51.19999f);
generalPath.lineTo(35.100002f, 49.49999f);
generalPath.lineTo(34.4f, 49.599987f);
generalPath.lineTo(34.5f, 47.599987f);
generalPath.lineTo(35.3f, 47.49999f);
generalPath.lineTo(35.3f, 46.89999f);
generalPath.lineTo(35.7f, 46.79999f);
generalPath.lineTo(36.2f, 46.39999f);
generalPath.lineTo(33.4f, 45.79999f);
generalPath.lineTo(30.600002f, 46.39999f);
generalPath.lineTo(31.000002f, 46.99999f);
generalPath.lineTo(31.600002f, 46.99999f);
generalPath.lineTo(31.700003f, 47.799988f);
generalPath.lineTo(32.500004f, 47.799988f);
generalPath.lineTo(32.500004f, 49.49999f);
generalPath.lineTo(29.200005f, 49.39999f);
generalPath.lineTo(29.300005f, 47.49999f);
generalPath.lineTo(29.400005f, 45.799988f);
generalPath.lineTo(29.400005f, 43.599987f);
generalPath.lineTo(29.500006f, 41.299988f);
generalPath.lineTo(36.100006f, 40.99999f);
generalPath.lineTo(44.000008f, 40.49999f);
generalPath.lineTo(44.000008f, 42.0f);
generalPath.lineTo(43.70001f, 45.6f);
generalPath.lineTo(43.60001f, 48.899998f);
generalPath.lineTo(40.70001f, 48.8f);
generalPath.lineTo(40.70001f, 46.5f);
generalPath.lineTo(41.800007f, 46.5f);
generalPath.lineTo(41.800007f, 45.8f);
generalPath.lineTo(42.20001f, 45.7f);
generalPath.lineTo(42.20001f, 45.600002f);
generalPath.lineTo(42.60001f, 45.600002f);
generalPath.lineTo(42.80001f, 45.300003f);
generalPath.lineTo(39.50001f, 44.500004f);
generalPath.lineTo(36.200012f, 45.200005f);
generalPath.lineTo(36.400013f, 45.600006f);
generalPath.lineTo(36.800014f, 45.600006f);
generalPath.lineTo(36.800014f, 45.800007f);
generalPath.lineTo(37.200016f, 45.800007f);
generalPath.lineTo(37.200016f, 46.500008f);
generalPath.lineTo(38.200016f, 46.500008f);
generalPath.lineTo(38.200016f, 48.600006f);
generalPath.lineTo(37.200016f, 48.600006f);
generalPath.lineTo(37.200016f, 49.100006f);
generalPath.lineTo(37.500015f, 49.100006f);
generalPath.lineTo(37.500015f, 50.900005f);
generalPath.lineTo(38.200016f, 50.900005f);
generalPath.lineTo(38.100018f, 58.000004f);
generalPath.lineTo(37.200016f, 58.200005f);
generalPath.lineTo(37.200016f, 58.500004f);
generalPath.lineTo(37.500015f, 58.500004f);
generalPath.lineTo(37.500015f, 60.300003f);
generalPath.lineTo(38.000015f, 60.300003f);
generalPath.lineTo(37.900017f, 62.800003f);
generalPath.lineTo(38.000015f, 64.9f);
generalPath.lineTo(41.500015f, 65.0f);
generalPath.lineTo(41.400017f, 63.1f);
generalPath.lineTo(41.000015f, 61.6f);
generalPath.lineTo(41.000015f, 60.199997f);
generalPath.lineTo(43.900017f, 60.1f);
generalPath.lineTo(43.80002f, 62.199997f);
generalPath.lineTo(43.80002f, 64.399994f);
generalPath.lineTo(45.50002f, 64.49999f);
generalPath.lineTo(47.80002f, 64.399994f);
generalPath.lineTo(48.50002f, 64.2f);
generalPath.lineTo(48.100018f, 62.999996f);
generalPath.lineTo(48.00002f, 61.299995f);
generalPath.lineTo(47.80002f, 59.999996f);
generalPath.lineTo(50.600018f, 59.899998f);
generalPath.lineTo(50.50002f, 61.499996f);
generalPath.lineTo(50.50002f, 64.0f);
generalPath.lineTo(51.600018f, 64.1f);
generalPath.lineTo(52.700016f, 64.1f);
generalPath.lineTo(53.200016f, 63.899998f);
generalPath.lineTo(52.900017f, 61.499996f);
generalPath.lineTo(52.80002f, 59.699997f);
generalPath.lineTo(53.30002f, 59.6f);
generalPath.lineTo(53.30002f, 58.0f);
generalPath.lineTo(53.400017f, 58.0f);
generalPath.lineTo(53.400017f, 57.6f);
generalPath.lineTo(52.900017f, 57.6f);
generalPath.lineTo(52.80002f, 56.399998f);
generalPath.lineTo(52.80002f, 51.199997f);
generalPath.lineTo(53.20002f, 51.199997f);
generalPath.lineTo(53.20002f, 49.499996f);
generalPath.lineTo(53.40002f, 49.499996f);
generalPath.lineTo(53.40002f, 49.199997f);
generalPath.lineTo(52.800022f, 49.1f);
generalPath.lineTo(52.800022f, 47.1f);
generalPath.lineTo(53.800022f, 47.0f);
generalPath.lineTo(53.700024f, 46.3f);
generalPath.lineTo(54.100025f, 46.3f);
generalPath.lineTo(54.100025f, 46.2f);
generalPath.lineTo(54.700024f, 45.9f);
generalPath.lineTo(51.700024f, 45.300003f);
generalPath.lineTo(48.500023f, 46.000004f);
generalPath.lineTo(48.700024f, 46.400005f);
generalPath.lineTo(49.200024f, 46.400005f);
generalPath.lineTo(49.200024f, 46.600006f);
generalPath.lineTo(49.600025f, 46.600006f);
generalPath.lineTo(49.600025f, 47.400005f);
generalPath.lineTo(50.600025f, 47.400005f);
generalPath.lineTo(50.700024f, 49.300007f);
generalPath.lineTo(47.200024f, 49.300007f);
generalPath.lineTo(46.800022f, 46.400005f);
generalPath.lineTo(46.500023f, 44.900005f);
generalPath.lineTo(46.200024f, 42.000004f);
generalPath.lineTo(46.400024f, 40.400005f);
generalPath.lineTo(53.400024f, 39.900005f);
generalPath.lineTo(53.400024f, 37.500004f);
generalPath.lineTo(53.800026f, 37.400005f);
generalPath.lineTo(53.800026f, 37.0f);
generalPath.lineTo(53.500027f, 36.8f);
generalPath.curveTo(53.500027f, 36.8f, 49.700027f, 37.399998f, 48.40003f, 37.5f);
generalPath.curveTo(48.10003f, 37.5f, 48.10003f, 37.5f, 47.80003f, 37.6f);
generalPath.lineTo(47.80003f, 37.199997f);
generalPath.lineTo(46.30003f, 36.399998f);
generalPath.lineTo(46.30003f, 35.499996f);
generalPath.lineTo(46.80003f, 35.499996f);
generalPath.lineTo(46.80003f, 34.299995f);
generalPath.curveTo(46.80003f, 34.299995f, 49.80003f, 34.099995f, 50.90003f, 33.799995f);
generalPath.curveTo(52.000027f, 33.499996f, 53.60003f, 33.299995f, 53.60003f, 33.299995f);
generalPath.lineTo(54.30003f, 31.299995f);
generalPath.lineTo(55.80003f, 30.899996f);
generalPath.lineTo(55.90003f, 30.599997f);
generalPath.lineTo(59.200027f, 29.699997f);
generalPath.lineTo(59.60003f, 29.399998f);
generalPath.lineTo(58.30003f, 26.599998f);
generalPath.lineTo(58.40003f, 25.999998f);
generalPath.lineTo(59.000027f, 25.699999f);
generalPath.lineTo(59.500027f, 24.3f);
generalPath.lineTo(59.40003f, 24.0f);
generalPath.closePath();
generalPath.moveTo(43.4f, 34.5f);
generalPath.lineTo(43.4f, 35.5f);
generalPath.lineTo(44.2f, 35.5f);
generalPath.lineTo(44.2f, 36.5f);
generalPath.lineTo(42.7f, 37.5f);
generalPath.lineTo(42.600002f, 37.8f);
generalPath.lineTo(43.2f, 37.8f);
generalPath.lineTo(43.2f, 38.0f);
generalPath.lineTo(38.7f, 38.2f);
generalPath.lineTo(38.7f, 37.5f);
generalPath.lineTo(38.9f, 37.2f);
generalPath.lineTo(38.9f, 36.5f);
generalPath.lineTo(39.0f, 36.2f);
generalPath.lineTo(39.0f, 35.8f);
generalPath.lineTo(39.2f, 35.0f);
generalPath.lineTo(43.4f, 34.5f);
generalPath.closePath();
generalPath.moveTo(34.0f, 35.4f);
generalPath.lineTo(33.9f, 36.100002f);
generalPath.lineTo(34.300003f, 36.500004f);
generalPath.lineTo(34.300003f, 37.200005f);
generalPath.lineTo(34.600002f, 37.700005f);
generalPath.lineTo(34.500004f, 38.300003f);
generalPath.lineTo(34.700005f, 38.700005f);
generalPath.lineTo(30.100004f, 38.900005f);
generalPath.lineTo(30.100004f, 38.700005f);
generalPath.lineTo(30.600004f, 38.600006f);
generalPath.lineTo(30.600004f, 38.400005f);
generalPath.lineTo(29.400003f, 37.800007f);
generalPath.lineTo(29.300003f, 36.800007f);
generalPath.lineTo(29.900003f, 36.800007f);
generalPath.lineTo(29.900003f, 35.70001f);
generalPath.lineTo(34.000004f, 35.40001f);
generalPath.closePath();
generalPath.moveTo(40.8f, 51.0f);
generalPath.lineTo(43.6f, 51.2f);
generalPath.lineTo(43.5f, 55.0f);
generalPath.lineTo(43.9f, 58.1f);
generalPath.lineTo(40.9f, 58.0f);
generalPath.lineTo(40.800003f, 51.0f);
generalPath.closePath();
generalPath.moveTo(22.099998f, 51.1f);
generalPath.lineTo(26.599998f, 51.3f);
generalPath.lineTo(26.099998f, 54.0f);
generalPath.lineTo(26.099998f, 56.2f);
generalPath.lineTo(26.399998f, 57.4f);
generalPath.lineTo(21.999998f, 57.600002f);
generalPath.lineTo(22.099998f, 51.100002f);
generalPath.closePath();
generalPath.moveTo(50.699997f, 51.199997f);
generalPath.lineTo(50.699997f, 57.6f);
generalPath.lineTo(47.899998f, 57.8f);
generalPath.lineTo(47.8f, 54.399998f);
generalPath.lineTo(47.5f, 51.199997f);
generalPath.lineTo(50.7f, 51.199997f);
generalPath.closePath();
generalPath.moveTo(29.199997f, 51.299995f);
generalPath.lineTo(32.499996f, 51.299995f);
generalPath.lineTo(32.499996f, 57.299995f);
generalPath.lineTo(29.399996f, 57.399994f);
generalPath.lineTo(29.199995f, 55.499992f);
generalPath.lineTo(29.199995f, 51.29999f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(38.0, 65.0), new Point2D.Double(38.0, 24.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(29.2f, 71.8f);
generalPath.lineTo(33.2f, 71.8f);
generalPath.lineTo(33.2f, 84.5f);
generalPath.curveTo(33.2f, 86.2f, 33.100002f, 87.4f, 32.8f, 88.3f);
generalPath.curveTo(32.399998f, 89.5f, 31.699999f, 90.4f, 30.699999f, 91.100006f);
generalPath.curveTo(29.699999f, 91.8f, 28.3f, 92.200005f, 26.599998f, 92.200005f);
generalPath.curveTo(24.599998f, 92.200005f, 23.099998f, 91.600006f, 21.999998f, 90.50001f);
generalPath.curveTo(20.899998f, 89.40001f, 20.399998f, 87.80001f, 20.399998f, 85.600006f);
generalPath.lineTo(24.199997f, 85.200005f);
generalPath.curveTo(24.199997f, 86.3f, 24.399998f, 87.200005f, 24.699997f, 87.600006f);
generalPath.curveTo(25.099997f, 88.3f, 25.799997f, 88.700005f, 26.699997f, 88.700005f);
generalPath.curveTo(27.599997f, 88.700005f, 28.199997f, 88.4f, 28.599997f, 87.9f);
generalPath.curveTo(28.999996f, 87.4f, 29.199997f, 86.3f, 29.199997f, 84.700005f);
generalPath.lineTo(29.199997f, 71.8f);
generalPath.closePath();
generalPath.moveTo(49.6f, 88.3f);
generalPath.lineTo(49.6f, 91.9f);
generalPath.lineTo(36.2f, 91.9f);
generalPath.curveTo(36.3f, 90.6f, 36.8f, 89.3f, 37.5f, 88.1f);
generalPath.curveTo(38.2f, 86.9f, 39.7f, 85.299995f, 41.8f, 83.299995f);
generalPath.curveTo(43.5f, 81.7f, 44.6f, 80.6f, 45.0f, 79.99999f);
generalPath.curveTo(45.5f, 79.19999f, 45.8f, 78.399994f, 45.8f, 77.59999f);
generalPath.curveTo(45.8f, 76.69999f, 45.6f, 76.09999f, 45.1f, 75.59999f);
generalPath.curveTo(44.6f, 75.09999f, 44.0f, 74.899994f, 43.199997f, 74.899994f);
generalPath.curveTo(42.399998f, 74.899994f, 41.799995f, 75.09999f, 41.299995f, 75.59999f);
generalPath.curveTo(40.799995f, 76.09999f, 40.599995f, 76.899994f, 40.499996f, 77.99999f);
generalPath.lineTo(36.699997f, 77.59999f);
generalPath.curveTo(36.899998f, 75.49999f, 37.6f, 73.99999f, 38.799995f, 72.99999f);
generalPath.curveTo(39.999992f, 71.99999f, 41.499996f, 71.59999f, 43.299995f, 71.59999f);
generalPath.curveTo(45.299995f, 71.59999f, 46.799995f, 72.09999f, 47.999996f, 73.19999f);
generalPath.curveTo(49.099995f, 74.29999f, 49.699997f, 75.59999f, 49.699997f, 77.19999f);
generalPath.curveTo(49.699997f, 78.09999f, 49.499996f, 78.99999f, 49.199997f, 79.79999f);
generalPath.curveTo(48.899998f, 80.59998f, 48.399998f, 81.499985f, 47.699997f, 82.39999f);
generalPath.curveTo(47.199997f, 82.999985f, 46.399998f, 83.79999f, 45.199997f, 84.999985f);
generalPath.curveTo(43.999996f, 86.09998f, 43.199997f, 86.89999f, 42.899998f, 87.19998f);
generalPath.curveTo(42.6f, 87.59998f, 42.3f, 87.89998f, 42.1f, 88.29998f);
generalPath.lineTo(49.6f, 88.29998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
	private ext_j2() {
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
       ext_j2 base = new ext_j2();
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
       ext_j2 base = new ext_j2();
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
        return ext_j2::new;
    }
}

