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
public class ext_jsx implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(58.7f, 43.5f);
generalPath.curveTo(58.7f, 40.6f, 55.0f, 37.8f, 49.4f, 36.1f);
generalPath.curveTo(50.7f, 30.399998f, 50.100002f, 25.8f, 47.600002f, 24.3f);
generalPath.curveTo(47.000004f, 24.0f, 46.300003f, 23.8f, 45.500004f, 23.8f);
generalPath.lineTo(45.500004f, 25.9f);
generalPath.curveTo(45.900005f, 25.9f, 46.300003f, 26.0f, 46.500004f, 26.199999f);
generalPath.curveTo(47.700005f, 26.9f, 48.300003f, 29.599998f, 47.900005f, 33.0f);
generalPath.curveTo(47.800007f, 33.9f, 47.600006f, 34.7f, 47.500004f, 35.7f);
generalPath.curveTo(45.700005f, 35.3f, 43.800003f, 34.9f, 41.800003f, 34.7f);
generalPath.curveTo(40.600002f, 33.0f, 39.300003f, 31.5f, 38.000004f, 30.2f);
generalPath.curveTo(41.000004f, 27.5f, 43.700005f, 25.900002f, 45.600002f, 25.900002f);
generalPath.lineTo(45.600002f, 23.800001f);
generalPath.curveTo(43.100002f, 23.800001f, 39.9f, 25.6f, 36.5f, 28.7f);
generalPath.curveTo(33.2f, 25.6f, 29.9f, 23.900002f, 27.4f, 23.900002f);
generalPath.lineTo(27.4f, 26.0f);
generalPath.curveTo(29.3f, 26.0f, 32.0f, 27.5f, 35.0f, 30.2f);
generalPath.curveTo(33.7f, 31.6f, 32.4f, 33.0f, 31.2f, 34.7f);
generalPath.curveTo(29.1f, 35.0f, 27.2f, 35.2f, 25.5f, 35.7f);
generalPath.curveTo(25.3f, 34.8f, 25.2f, 33.9f, 25.0f, 33.0f);
generalPath.curveTo(24.6f, 29.6f, 25.1f, 26.8f, 26.3f, 26.2f);
generalPath.curveTo(26.599998f, 26.0f, 27.5f, 25.900002f, 27.5f, 25.900002f);
generalPath.lineTo(27.5f, 23.800001f);
generalPath.lineTo(27.3f, 23.800001f);
generalPath.curveTo(26.5f, 23.800001f, 25.8f, 24.000002f, 25.199999f, 24.300001f);
generalPath.curveTo(22.599998f, 25.800001f, 22.099998f, 30.400002f, 23.4f, 36.100002f);
generalPath.curveTo(17.8f, 37.800003f, 14.099999f, 40.600002f, 14.099999f, 43.500004f);
generalPath.curveTo(14.099999f, 46.400005f, 17.8f, 49.200005f, 23.4f, 50.900005f);
generalPath.curveTo(22.1f, 56.600006f, 22.699999f, 61.200005f, 25.199999f, 62.700005f);
generalPath.curveTo(25.8f, 63.000004f, 26.499998f, 63.200005f, 27.3f, 63.200005f);
generalPath.curveTo(29.8f, 63.200005f, 33.0f, 61.400005f, 36.4f, 58.300003f);
generalPath.curveTo(39.7f, 61.4f, 43.0f, 63.100002f, 45.5f, 63.100002f);
generalPath.curveTo(46.3f, 63.100002f, 47.0f, 62.9f, 47.6f, 62.600002f);
generalPath.curveTo(50.199997f, 61.100002f, 50.699997f, 56.500004f, 49.399998f, 50.800003f);
generalPath.curveTo(55.1f, 49.200005f, 58.699997f, 46.4f, 58.699997f, 43.500004f);
generalPath.closePath();
generalPath.moveTo(46.9f, 37.4f);
generalPath.curveTo(46.600002f, 38.600002f, 46.100002f, 39.800003f, 45.7f, 41.0f);
generalPath.curveTo(45.4f, 40.3f, 44.9f, 39.5f, 44.5f, 38.9f);
generalPath.curveTo(44.1f, 38.2f, 43.6f, 37.4f, 43.2f, 36.800003f);
generalPath.curveTo(44.5f, 36.9f, 45.7f, 37.200005f, 46.9f, 37.4f);
generalPath.closePath();
generalPath.moveTo(42.7f, 47.100002f);
generalPath.curveTo(42.0f, 48.300003f, 41.2f, 49.500004f, 40.5f, 50.500004f);
generalPath.curveTo(39.2f, 50.700005f, 37.8f, 50.800003f, 36.5f, 50.800003f);
generalPath.curveTo(35.2f, 50.800003f, 33.8f, 50.700005f, 32.4f, 50.600002f);
generalPath.curveTo(31.600002f, 49.500004f, 30.900002f, 48.4f, 30.2f, 47.2f);
generalPath.curveTo(29.5f, 46.0f, 28.900002f, 44.8f, 28.300001f, 43.600002f);
generalPath.curveTo(28.900002f, 42.4f, 29.500002f, 41.2f, 30.2f, 40.000004f);
generalPath.curveTo(30.900002f, 38.800003f, 31.7f, 37.600002f, 32.4f, 36.600002f);
generalPath.curveTo(33.800003f, 36.500004f, 35.100002f, 36.4f, 36.5f, 36.4f);
generalPath.curveTo(37.899998f, 36.4f, 39.2f, 36.5f, 40.6f, 36.600002f);
generalPath.curveTo(41.399998f, 37.7f, 42.1f, 38.800003f, 42.8f, 40.000004f);
generalPath.curveTo(43.5f, 41.200005f, 44.1f, 42.400005f, 44.7f, 43.600002f);
generalPath.curveTo(44.100002f, 44.7f, 43.4f, 45.9f, 42.7f, 47.100002f);
generalPath.closePath();
generalPath.moveTo(45.7f, 45.9f);
generalPath.curveTo(46.2f, 47.100002f, 46.600002f, 48.300003f, 47.0f, 49.5f);
generalPath.curveTo(45.8f, 49.8f, 44.5f, 50.0f, 43.2f, 50.2f);
generalPath.curveTo(43.600002f, 49.5f, 44.100002f, 48.7f, 44.5f, 48.100002f);
generalPath.curveTo(45.0f, 47.4f, 45.3f, 46.7f, 45.7f, 45.9f);
generalPath.closePath();
generalPath.moveTo(36.5f, 55.600002f);
generalPath.curveTo(35.6f, 54.7f, 34.8f, 53.7f, 34.0f, 52.7f);
generalPath.curveTo(34.9f, 52.7f, 35.6f, 52.8f, 36.5f, 52.8f);
generalPath.curveTo(37.4f, 52.8f, 38.2f, 52.8f, 39.0f, 52.7f);
generalPath.curveTo(38.2f, 53.8f, 37.4f, 54.7f, 36.5f, 55.600002f);
generalPath.closePath();
generalPath.moveTo(29.7f, 50.2f);
generalPath.curveTo(28.400002f, 50.0f, 27.1f, 49.8f, 26.0f, 49.5f);
generalPath.curveTo(26.3f, 48.3f, 26.8f, 47.1f, 27.2f, 45.9f);
generalPath.curveTo(27.5f, 46.600002f, 28.0f, 47.4f, 28.400002f, 48.0f);
generalPath.curveTo(28.900002f, 48.9f, 29.300001f, 49.6f, 29.7f, 50.2f);
generalPath.closePath();
generalPath.moveTo(36.5f, 31.400002f);
generalPath.curveTo(37.4f, 32.300003f, 38.2f, 33.300003f, 39.0f, 34.300003f);
generalPath.curveTo(38.1f, 34.300003f, 37.4f, 34.200005f, 36.5f, 34.200005f);
generalPath.curveTo(35.6f, 34.200005f, 34.8f, 34.200005f, 34.0f, 34.300003f);
generalPath.curveTo(34.8f, 33.200005f, 35.6f, 32.300003f, 36.5f, 31.400003f);
generalPath.closePath();
generalPath.moveTo(29.7f, 36.7f);
generalPath.curveTo(29.300001f, 37.4f, 28.800001f, 38.2f, 28.400002f, 38.8f);
generalPath.curveTo(28.000002f, 39.5f, 27.600002f, 40.3f, 27.2f, 40.899998f);
generalPath.curveTo(26.7f, 39.699997f, 26.300001f, 38.499996f, 25.900002f, 37.3f);
generalPath.curveTo(27.2f, 37.2f, 28.500002f, 36.899998f, 29.7f, 36.7f);
generalPath.closePath();
generalPath.moveTo(21.5f, 48.1f);
generalPath.curveTo(18.2f, 46.699997f, 16.2f, 44.899998f, 16.2f, 43.5f);
generalPath.curveTo(16.2f, 42.0f, 18.300001f, 40.2f, 21.5f, 38.9f);
generalPath.curveTo(22.3f, 38.600002f, 23.1f, 38.300003f, 24.0f, 38.0f);
generalPath.curveTo(24.5f, 39.8f, 25.2f, 41.6f, 26.1f, 43.6f);
generalPath.curveTo(25.2f, 45.5f, 24.6f, 47.399998f, 24.0f, 49.1f);
generalPath.curveTo(23.2f, 48.699997f, 22.4f, 48.5f, 21.5f, 48.1f);
generalPath.closePath();
generalPath.moveTo(26.4f, 61.0f);
generalPath.curveTo(25.199999f, 60.3f, 24.6f, 57.6f, 25.0f, 54.2f);
generalPath.curveTo(25.1f, 53.3f, 25.3f, 52.5f, 25.4f, 51.5f);
generalPath.curveTo(27.199999f, 51.9f, 29.1f, 52.3f, 31.099998f, 52.5f);
generalPath.curveTo(32.3f, 54.2f, 33.6f, 55.7f, 34.899998f, 57.0f);
generalPath.curveTo(31.899998f, 59.7f, 29.199997f, 61.3f, 27.299997f, 61.3f);
generalPath.curveTo(27.099997f, 61.3f, 26.699997f, 61.2f, 26.399998f, 61.0f);
generalPath.closePath();
generalPath.moveTo(48.0f, 54.1f);
generalPath.curveTo(48.4f, 57.5f, 47.9f, 60.3f, 46.7f, 60.899998f);
generalPath.curveTo(46.4f, 61.1f, 46.100002f, 61.199997f, 45.7f, 61.199997f);
generalPath.curveTo(43.8f, 61.199997f, 41.100002f, 59.699997f, 38.100002f, 56.999996f);
generalPath.curveTo(39.4f, 55.599995f, 40.7f, 54.199997f, 41.9f, 52.499996f);
generalPath.curveTo(44.0f, 52.199997f, 45.9f, 51.999996f, 47.600002f, 51.499996f);
generalPath.curveTo(47.7f, 52.399998f, 47.9f, 53.299995f, 48.000004f, 54.099995f);
generalPath.closePath();
generalPath.moveTo(51.5f, 48.1f);
generalPath.curveTo(50.7f, 48.399998f, 49.9f, 48.699997f, 49.0f, 49.0f);
generalPath.curveTo(48.5f, 47.2f, 47.8f, 45.4f, 46.9f, 43.4f);
generalPath.curveTo(47.800003f, 41.5f, 48.4f, 39.600002f, 49.0f, 37.9f);
generalPath.curveTo(49.9f, 38.2f, 50.7f, 38.5f, 51.6f, 38.800003f);
generalPath.curveTo(54.899998f, 40.200005f, 56.899998f, 42.000004f, 56.899998f, 43.4f);
generalPath.curveTo(56.699997f, 44.9f, 54.6f, 46.7f, 51.499996f, 48.100002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.5, 63.25), new Point2D.Double(36.5, 23.649999618530273), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_3
shape = new Ellipse2D.Double(32.400001525878906, 39.400001525878906, 8.199999809265137, 8.199999809265137);
paint = new LinearGradientPaint(new Point2D.Double(36.5, 47.597999572753906), new Point2D.Double(36.5, 39.387001037597656), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.6f, 71.8f);
generalPath.lineTo(23.6f, 71.8f);
generalPath.lineTo(23.6f, 84.5f);
generalPath.curveTo(23.6f, 86.2f, 23.5f, 87.4f, 23.2f, 88.3f);
generalPath.curveTo(22.800001f, 89.5f, 22.1f, 90.4f, 21.1f, 91.100006f);
generalPath.curveTo(20.1f, 91.8f, 18.7f, 92.200005f, 17.0f, 92.200005f);
generalPath.curveTo(15.0f, 92.200005f, 13.5f, 91.600006f, 12.4f, 90.50001f);
generalPath.curveTo(11.299999f, 89.40001f, 10.799999f, 87.80001f, 10.799999f, 85.600006f);
generalPath.lineTo(14.599999f, 85.200005f);
generalPath.curveTo(14.599999f, 86.3f, 14.799999f, 87.200005f, 15.099999f, 87.600006f);
generalPath.curveTo(15.499999f, 88.3f, 16.199999f, 88.700005f, 17.099998f, 88.700005f);
generalPath.curveTo(17.999998f, 88.700005f, 18.599998f, 88.4f, 18.999998f, 87.9f);
generalPath.curveTo(19.399998f, 87.4f, 19.599998f, 86.3f, 19.599998f, 84.700005f);
generalPath.lineTo(19.599998f, 71.8f);
generalPath.closePath();
generalPath.moveTo(26.900002f, 85.3f);
generalPath.lineTo(30.800001f, 84.9f);
generalPath.curveTo(31.000002f, 86.200005f, 31.500002f, 87.200005f, 32.2f, 87.8f);
generalPath.curveTo(32.9f, 88.4f, 33.9f, 88.700005f, 35.100002f, 88.700005f);
generalPath.curveTo(36.4f, 88.700005f, 37.4f, 88.4f, 38.000004f, 87.9f);
generalPath.curveTo(38.600006f, 87.4f, 39.000004f, 86.700005f, 39.000004f, 86.0f);
generalPath.curveTo(39.000004f, 85.5f, 38.900005f, 85.1f, 38.600002f, 84.8f);
generalPath.curveTo(38.3f, 84.50001f, 37.800003f, 84.200005f, 37.100002f, 83.9f);
generalPath.curveTo(36.600002f, 83.700005f, 35.500004f, 83.4f, 33.9f, 83.0f);
generalPath.curveTo(31.7f, 82.5f, 30.2f, 81.8f, 29.300001f, 81.0f);
generalPath.curveTo(28.1f, 79.9f, 27.500002f, 78.6f, 27.500002f, 77.0f);
generalPath.curveTo(27.500002f, 76.0f, 27.800001f, 75.0f, 28.400002f, 74.1f);
generalPath.curveTo(29.000002f, 73.2f, 29.800001f, 72.5f, 30.900002f, 72.1f);
generalPath.curveTo(32.0f, 71.6f, 33.300003f, 71.4f, 34.800003f, 71.4f);
generalPath.curveTo(37.300003f, 71.4f, 39.200005f, 72.0f, 40.500004f, 73.1f);
generalPath.curveTo(41.800003f, 74.2f, 42.400005f, 75.7f, 42.500004f, 77.5f);
generalPath.lineTo(38.500004f, 77.7f);
generalPath.curveTo(38.300003f, 76.7f, 38.000004f, 75.899994f, 37.400005f, 75.5f);
generalPath.curveTo(36.800007f, 75.100006f, 36.000004f, 74.8f, 34.800007f, 74.8f);
generalPath.curveTo(33.600006f, 74.8f, 32.70001f, 75.0f, 32.000008f, 75.5f);
generalPath.curveTo(31.600008f, 75.8f, 31.400007f, 76.2f, 31.400007f, 76.7f);
generalPath.curveTo(31.400007f, 77.2f, 31.600008f, 77.6f, 32.000008f, 77.899994f);
generalPath.curveTo(32.500008f, 78.299995f, 33.800007f, 78.799995f, 35.70001f, 79.2f);
generalPath.curveTo(37.70001f, 79.7f, 39.10001f, 80.1f, 40.10001f, 80.6f);
generalPath.curveTo(41.10001f, 81.1f, 41.80001f, 81.799995f, 42.30001f, 82.6f);
generalPath.curveTo(42.80001f, 83.4f, 43.10001f, 84.5f, 43.10001f, 85.799995f);
generalPath.curveTo(43.10001f, 86.899994f, 42.80001f, 87.99999f, 42.10001f, 88.99999f);
generalPath.curveTo(41.40001f, 89.99999f, 40.60001f, 90.69999f, 39.40001f, 91.19999f);
generalPath.curveTo(38.20001f, 91.69999f, 36.80001f, 91.89999f, 35.000008f, 91.89999f);
generalPath.curveTo(32.500008f, 91.89999f, 30.500008f, 91.29999f, 29.200008f, 90.09998f);
generalPath.curveTo(28.000008f, 89.19998f, 27.200008f, 87.499985f, 26.90001f, 85.29998f);
generalPath.closePath();
generalPath.moveTo(44.600002f, 91.8f);
generalPath.lineTo(51.4f, 81.3f);
generalPath.lineTo(45.2f, 71.700005f);
generalPath.lineTo(50.0f, 71.700005f);
generalPath.lineTo(54.0f, 78.100006f);
generalPath.lineTo(57.9f, 71.700005f);
generalPath.lineTo(62.600002f, 71.700005f);
generalPath.lineTo(56.4f, 81.4f);
generalPath.lineTo(63.2f, 91.700005f);
generalPath.lineTo(58.3f, 91.700005f);
generalPath.lineTo(53.899998f, 84.8f);
generalPath.lineTo(49.399998f, 91.700005f);
generalPath.lineTo(44.6f, 91.700005f);
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
	private ext_jsx() {
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
       ext_jsx base = new ext_jsx();
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
       ext_jsx base = new ext_jsx();
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
        return ext_jsx::new;
    }
}

