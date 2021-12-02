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
public class ext_m4 implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.5f, 90.1f);
generalPath.lineTo(18.5f, 70.2f);
generalPath.lineTo(24.6f, 70.2f);
generalPath.lineTo(28.2f, 83.7f);
generalPath.lineTo(31.800001f, 70.2f);
generalPath.lineTo(37.9f, 70.2f);
generalPath.lineTo(37.9f, 90.0f);
generalPath.lineTo(34.100002f, 90.0f);
generalPath.lineTo(34.100002f, 74.5f);
generalPath.lineTo(30.100002f, 90.1f);
generalPath.lineTo(26.200003f, 90.1f);
generalPath.lineTo(22.200003f, 74.5f);
generalPath.lineTo(22.200003f, 90.1f);
generalPath.lineTo(18.500002f, 90.1f);
generalPath.closePath();
generalPath.moveTo(48.6f, 90.1f);
generalPath.lineTo(48.6f, 86.1f);
generalPath.lineTo(40.399998f, 86.1f);
generalPath.lineTo(40.399998f, 82.799995f);
generalPath.lineTo(49.1f, 70.2f);
generalPath.lineTo(52.3f, 70.2f);
generalPath.lineTo(52.3f, 82.799995f);
generalPath.lineTo(54.8f, 82.799995f);
generalPath.lineTo(54.8f, 86.1f);
generalPath.lineTo(52.3f, 86.1f);
generalPath.lineTo(52.3f, 90.1f);
generalPath.lineTo(48.6f, 90.1f);
generalPath.closePath();
generalPath.moveTo(48.6f, 82.7f);
generalPath.lineTo(48.6f, 76.0f);
generalPath.lineTo(44.0f, 82.7f);
generalPath.lineTo(48.6f, 82.7f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(54.4f, 49.8f);
generalPath.lineTo(54.2f, 49.6f);
generalPath.lineTo(54.0f, 49.399998f);
generalPath.curveTo(54.0f, 45.999996f, 52.0f, 43.1f, 49.2f, 41.699997f);
generalPath.curveTo(48.9f, 40.499996f, 49.100002f, 40.1f, 49.100002f, 40.1f);
generalPath.curveTo(49.2f, 40.0f, 49.300003f, 39.8f, 49.300003f, 39.699997f);
generalPath.lineTo(52.200005f, 39.699997f);
generalPath.curveTo(52.800003f, 39.699997f, 53.500004f, 39.399998f, 53.900005f, 38.999996f);
generalPath.curveTo(55.500004f, 37.399998f, 56.300007f, 35.399998f, 56.300007f, 33.199997f);
generalPath.curveTo(56.300007f, 29.099997f, 53.300007f, 25.699997f, 49.300007f, 25.199997f);
generalPath.curveTo(49.300007f, 24.999996f, 49.100006f, 24.999996f, 48.900005f, 24.999996f);
generalPath.lineTo(25.6f, 24.999996f);
generalPath.curveTo(21.1f, 24.999996f, 17.5f, 28.599997f, 17.5f, 33.1f);
generalPath.curveTo(17.5f, 33.399998f, 17.5f, 33.8f, 17.6f, 34.199997f);
generalPath.curveTo(17.800001f, 41.699997f, 23.5f, 47.899998f, 26.5f, 50.6f);
generalPath.lineTo(20.7f, 50.6f);
generalPath.curveTo(19.800001f, 50.6f, 19.0f, 51.1f, 18.6f, 51.8f);
generalPath.curveTo(17.9f, 53.0f, 17.6f, 54.399998f, 17.6f, 55.7f);
generalPath.curveTo(17.6f, 60.2f, 21.2f, 63.800003f, 25.7f, 63.800003f);
generalPath.curveTo(26.6f, 63.800003f, 49.0f, 63.9f, 49.0f, 63.9f);
generalPath.lineTo(49.2f, 63.9f);
generalPath.curveTo(53.3f, 63.5f, 56.600002f, 59.9f, 56.600002f, 55.7f);
generalPath.curveTo(56.500004f, 53.8f, 55.7f, 51.5f, 54.4f, 49.8f);
generalPath.moveTo(48.9f, 27.4f);
generalPath.curveTo(51.800003f, 27.699999f, 54.100002f, 30.1f, 54.100002f, 33.1f);
generalPath.curveTo(54.100002f, 34.699997f, 53.4f, 36.199997f, 52.4f, 37.199997f);
generalPath.lineTo(31.2f, 37.199997f);
generalPath.curveTo(32.0f, 35.999996f, 32.600002f, 34.6f, 32.600002f, 33.1f);
generalPath.curveTo(32.600002f, 30.699999f, 31.400002f, 28.699999f, 29.600002f, 27.399998f);
generalPath.lineTo(48.9f, 27.399998f);
generalPath.closePath();
generalPath.moveTo(19.900002f, 55.8f);
generalPath.curveTo(19.900002f, 54.8f, 20.2f, 53.899998f, 20.600002f, 53.0f);
generalPath.lineTo(30.500002f, 53.0f);
generalPath.curveTo(31.000002f, 53.8f, 31.200003f, 54.8f, 31.200003f, 55.8f);
generalPath.curveTo(31.200003f, 58.899998f, 28.700003f, 61.5f, 25.500004f, 61.5f);
generalPath.curveTo(22.500004f, 61.5f, 19.900003f, 59.0f, 19.900003f, 55.8f);
generalPath.moveTo(48.9f, 61.6f);
generalPath.lineTo(29.5f, 61.6f);
generalPath.curveTo(31.3f, 60.3f, 32.5f, 58.199997f, 32.5f, 55.899998f);
generalPath.curveTo(32.5f, 53.499996f, 31.3f, 51.499996f, 29.5f, 50.199997f);
generalPath.lineTo(29.6f, 50.199997f);
generalPath.curveTo(29.6f, 50.199997f, 20.0f, 43.0f, 19.9f, 34.1f);
generalPath.curveTo(19.9f, 33.8f, 19.8f, 33.5f, 19.8f, 33.199997f);
generalPath.curveTo(19.8f, 30.099997f, 22.3f, 27.499996f, 25.5f, 27.499996f);
generalPath.curveTo(28.7f, 27.499996f, 31.2f, 29.999996f, 31.2f, 33.199997f);
generalPath.lineTo(31.2f, 33.6f);
generalPath.curveTo(31.2f, 34.1f, 31.1f, 34.6f, 30.900002f, 35.1f);
generalPath.curveTo(30.7f, 35.699997f, 30.300001f, 36.3f, 29.900002f, 36.8f);
generalPath.lineTo(28.600002f, 38.5f);
generalPath.lineTo(47.200005f, 38.5f);
generalPath.curveTo(47.100006f, 38.6f, 47.100006f, 38.7f, 47.000004f, 38.9f);
generalPath.curveTo(46.600002f, 39.5f, 46.500004f, 40.2f, 46.600002f, 41.0f);
generalPath.curveTo(46.2f, 41.0f, 45.800003f, 40.9f, 45.500004f, 40.9f);
generalPath.curveTo(40.800003f, 40.9f, 37.000004f, 44.7f, 37.000004f, 49.4f);
generalPath.curveTo(37.000004f, 54.100002f, 40.800003f, 57.9f, 45.500004f, 57.9f);
generalPath.curveTo(49.000004f, 57.9f, 52.000004f, 55.800003f, 53.300003f, 52.800003f);
generalPath.curveTo(53.700005f, 53.800003f, 54.000004f, 54.800003f, 54.000004f, 55.800003f);
generalPath.curveTo(54.100002f, 58.800003f, 51.800003f, 61.300003f, 48.900005f, 61.600002f);
generalPath.moveTo(49.200005f, 49.300003f);
generalPath.lineTo(43.600006f, 53.600002f);
generalPath.lineTo(43.600006f, 45.100002f);
generalPath.lineTo(49.200005f, 49.300003f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(37.0, 64.0), new Point2D.Double(37.0, 25.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(37.0, 64.25), new Point2D.Double(37.0, 24.75), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.5f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(54.4f, 49.8f);
generalPath.lineTo(54.2f, 49.6f);
generalPath.lineTo(54.0f, 49.399998f);
generalPath.curveTo(54.0f, 45.999996f, 52.0f, 43.1f, 49.2f, 41.699997f);
generalPath.curveTo(48.9f, 40.499996f, 49.100002f, 40.1f, 49.100002f, 40.1f);
generalPath.curveTo(49.2f, 40.0f, 49.300003f, 39.8f, 49.300003f, 39.699997f);
generalPath.lineTo(52.200005f, 39.699997f);
generalPath.curveTo(52.800003f, 39.699997f, 53.500004f, 39.399998f, 53.900005f, 38.999996f);
generalPath.curveTo(55.500004f, 37.399998f, 56.300007f, 35.399998f, 56.300007f, 33.199997f);
generalPath.curveTo(56.300007f, 29.099997f, 53.300007f, 25.699997f, 49.300007f, 25.199997f);
generalPath.curveTo(49.300007f, 24.999996f, 49.100006f, 24.999996f, 48.900005f, 24.999996f);
generalPath.lineTo(25.6f, 24.999996f);
generalPath.curveTo(21.1f, 24.999996f, 17.5f, 28.599997f, 17.5f, 33.1f);
generalPath.curveTo(17.5f, 33.399998f, 17.5f, 33.8f, 17.6f, 34.199997f);
generalPath.curveTo(17.800001f, 41.699997f, 23.5f, 47.899998f, 26.5f, 50.6f);
generalPath.lineTo(20.7f, 50.6f);
generalPath.curveTo(19.800001f, 50.6f, 19.0f, 51.1f, 18.6f, 51.8f);
generalPath.curveTo(17.9f, 53.0f, 17.6f, 54.399998f, 17.6f, 55.7f);
generalPath.curveTo(17.6f, 60.2f, 21.2f, 63.800003f, 25.7f, 63.800003f);
generalPath.curveTo(26.6f, 63.800003f, 49.0f, 63.9f, 49.0f, 63.9f);
generalPath.lineTo(49.2f, 63.9f);
generalPath.curveTo(53.3f, 63.5f, 56.600002f, 59.9f, 56.600002f, 55.7f);
generalPath.curveTo(56.500004f, 53.8f, 55.7f, 51.5f, 54.4f, 49.8f);
generalPath.moveTo(48.9f, 27.4f);
generalPath.curveTo(51.800003f, 27.699999f, 54.100002f, 30.1f, 54.100002f, 33.1f);
generalPath.curveTo(54.100002f, 34.699997f, 53.4f, 36.199997f, 52.4f, 37.199997f);
generalPath.lineTo(31.2f, 37.199997f);
generalPath.curveTo(32.0f, 35.999996f, 32.600002f, 34.6f, 32.600002f, 33.1f);
generalPath.curveTo(32.600002f, 30.699999f, 31.400002f, 28.699999f, 29.600002f, 27.399998f);
generalPath.lineTo(48.9f, 27.399998f);
generalPath.closePath();
generalPath.moveTo(19.900002f, 55.8f);
generalPath.curveTo(19.900002f, 54.8f, 20.2f, 53.899998f, 20.600002f, 53.0f);
generalPath.lineTo(30.500002f, 53.0f);
generalPath.curveTo(31.000002f, 53.8f, 31.200003f, 54.8f, 31.200003f, 55.8f);
generalPath.curveTo(31.200003f, 58.899998f, 28.700003f, 61.5f, 25.500004f, 61.5f);
generalPath.curveTo(22.500004f, 61.5f, 19.900003f, 59.0f, 19.900003f, 55.8f);
generalPath.moveTo(48.9f, 61.6f);
generalPath.lineTo(29.5f, 61.6f);
generalPath.curveTo(31.3f, 60.3f, 32.5f, 58.199997f, 32.5f, 55.899998f);
generalPath.curveTo(32.5f, 53.499996f, 31.3f, 51.499996f, 29.5f, 50.199997f);
generalPath.lineTo(29.6f, 50.199997f);
generalPath.curveTo(29.6f, 50.199997f, 20.0f, 43.0f, 19.9f, 34.1f);
generalPath.curveTo(19.9f, 33.8f, 19.8f, 33.5f, 19.8f, 33.199997f);
generalPath.curveTo(19.8f, 30.099997f, 22.3f, 27.499996f, 25.5f, 27.499996f);
generalPath.curveTo(28.7f, 27.499996f, 31.2f, 29.999996f, 31.2f, 33.199997f);
generalPath.lineTo(31.2f, 33.6f);
generalPath.curveTo(31.2f, 34.1f, 31.1f, 34.6f, 30.900002f, 35.1f);
generalPath.curveTo(30.7f, 35.699997f, 30.300001f, 36.3f, 29.900002f, 36.8f);
generalPath.lineTo(28.600002f, 38.5f);
generalPath.lineTo(47.200005f, 38.5f);
generalPath.curveTo(47.100006f, 38.6f, 47.100006f, 38.7f, 47.000004f, 38.9f);
generalPath.curveTo(46.600002f, 39.5f, 46.500004f, 40.2f, 46.600002f, 41.0f);
generalPath.curveTo(46.2f, 41.0f, 45.800003f, 40.9f, 45.500004f, 40.9f);
generalPath.curveTo(40.800003f, 40.9f, 37.000004f, 44.7f, 37.000004f, 49.4f);
generalPath.curveTo(37.000004f, 54.100002f, 40.800003f, 57.9f, 45.500004f, 57.9f);
generalPath.curveTo(49.000004f, 57.9f, 52.000004f, 55.800003f, 53.300003f, 52.800003f);
generalPath.curveTo(53.700005f, 53.800003f, 54.000004f, 54.800003f, 54.000004f, 55.800003f);
generalPath.curveTo(54.100002f, 58.800003f, 51.800003f, 61.300003f, 48.900005f, 61.600002f);
generalPath.moveTo(49.200005f, 49.300003f);
generalPath.lineTo(43.600006f, 53.600002f);
generalPath.lineTo(43.600006f, 45.100002f);
generalPath.lineTo(49.200005f, 49.300003f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
// _0_6
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
	private ext_m4() {
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
       ext_m4 base = new ext_m4();
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
       ext_m4 base = new ext_m4();
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
        return ext_m4::new;
    }
}

