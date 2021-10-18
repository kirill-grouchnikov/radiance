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
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_conf implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(42.0f, 38.4f);
generalPath.curveTo(42.0f, 35.9f, 40.5f, 33.9f, 38.3f, 33.0f);
generalPath.lineTo(38.3f, 25.7f);
generalPath.curveTo(38.3f, 24.5f, 37.399998f, 23.6f, 36.2f, 23.6f);
generalPath.curveTo(35.000004f, 23.6f, 34.100002f, 24.5f, 34.100002f, 25.7f);
generalPath.lineTo(34.100002f, 33.0f);
generalPath.curveTo(31.900002f, 33.8f, 30.400002f, 35.9f, 30.400002f, 38.4f);
generalPath.curveTo(30.400002f, 40.9f, 31.900002f, 43.0f, 34.100002f, 43.800003f);
generalPath.curveTo(34.100002f, 43.9f, 34.000004f, 44.100002f, 34.000004f, 44.200005f);
generalPath.lineTo(34.000004f, 62.600006f);
generalPath.curveTo(34.000004f, 63.800007f, 34.900005f, 64.700005f, 36.100002f, 64.700005f);
generalPath.curveTo(37.3f, 64.700005f, 38.2f, 63.800003f, 38.2f, 62.600006f);
generalPath.lineTo(38.2f, 44.2f);
generalPath.curveTo(38.2f, 44.0f, 38.2f, 43.9f, 38.100002f, 43.8f);
generalPath.curveTo(40.500004f, 43.0f, 42.000004f, 40.899998f, 42.000004f, 38.399998f);
generalPath.closePath();
generalPath.moveTo(36.2f, 40.0f);
generalPath.curveTo(35.3f, 40.0f, 34.600002f, 39.3f, 34.600002f, 38.4f);
generalPath.curveTo(34.600002f, 37.500004f, 35.300003f, 36.800003f, 36.2f, 36.800003f);
generalPath.curveTo(37.1f, 36.800003f, 37.8f, 37.500004f, 37.8f, 38.4f);
generalPath.curveTo(37.8f, 39.3f, 37.1f, 40.0f, 36.2f, 40.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 64.71700286865234), new Point2D.Double(36.20000076293945, 23.716999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 65.21700286865234), new Point2D.Double(36.20000076293945, 23.216999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(42.0f, 38.4f);
generalPath.curveTo(42.0f, 35.9f, 40.5f, 33.9f, 38.3f, 33.0f);
generalPath.lineTo(38.3f, 25.7f);
generalPath.curveTo(38.3f, 24.5f, 37.399998f, 23.6f, 36.2f, 23.6f);
generalPath.curveTo(35.000004f, 23.6f, 34.100002f, 24.5f, 34.100002f, 25.7f);
generalPath.lineTo(34.100002f, 33.0f);
generalPath.curveTo(31.900002f, 33.8f, 30.400002f, 35.9f, 30.400002f, 38.4f);
generalPath.curveTo(30.400002f, 40.9f, 31.900002f, 43.0f, 34.100002f, 43.800003f);
generalPath.curveTo(34.100002f, 43.9f, 34.000004f, 44.100002f, 34.000004f, 44.200005f);
generalPath.lineTo(34.000004f, 62.600006f);
generalPath.curveTo(34.000004f, 63.800007f, 34.900005f, 64.700005f, 36.100002f, 64.700005f);
generalPath.curveTo(37.3f, 64.700005f, 38.2f, 63.800003f, 38.2f, 62.600006f);
generalPath.lineTo(38.2f, 44.2f);
generalPath.curveTo(38.2f, 44.0f, 38.2f, 43.9f, 38.100002f, 43.8f);
generalPath.curveTo(40.500004f, 43.0f, 42.000004f, 40.899998f, 42.000004f, 38.399998f);
generalPath.closePath();
generalPath.moveTo(36.2f, 40.0f);
generalPath.curveTo(35.3f, 40.0f, 34.600002f, 39.3f, 34.600002f, 38.4f);
generalPath.curveTo(34.600002f, 37.500004f, 35.300003f, 36.800003f, 36.2f, 36.800003f);
generalPath.curveTo(37.1f, 36.800003f, 37.8f, 37.500004f, 37.8f, 38.4f);
generalPath.curveTo(37.8f, 39.3f, 37.1f, 40.0f, 36.2f, 40.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.0f, 25.8f);
generalPath.curveTo(53.0f, 24.599998f, 52.1f, 23.699999f, 50.9f, 23.699999f);
generalPath.curveTo(49.7f, 23.699999f, 48.800003f, 24.599998f, 48.800003f, 25.8f);
generalPath.lineTo(48.800003f, 43.0f);
generalPath.curveTo(46.600002f, 43.8f, 45.100002f, 45.9f, 45.100002f, 48.4f);
generalPath.curveTo(45.100002f, 50.9f, 46.600002f, 53.0f, 48.800003f, 53.800003f);
generalPath.curveTo(48.800003f, 53.9f, 48.700005f, 54.100002f, 48.700005f, 54.200005f);
generalPath.lineTo(48.700005f, 62.600006f);
generalPath.curveTo(48.700005f, 63.800007f, 49.600006f, 64.700005f, 50.800003f, 64.700005f);
generalPath.curveTo(52.000004f, 64.700005f, 52.9f, 63.800003f, 52.9f, 62.600006f);
generalPath.lineTo(52.9f, 54.200005f);
generalPath.curveTo(52.9f, 54.000004f, 52.9f, 53.900005f, 52.800003f, 53.800003f);
generalPath.curveTo(55.000004f, 53.000004f, 56.500004f, 50.9f, 56.500004f, 48.4f);
generalPath.curveTo(56.500004f, 45.9f, 55.000004f, 43.9f, 52.800003f, 43.0f);
generalPath.lineTo(52.800003f, 25.8f);
generalPath.closePath();
generalPath.moveTo(50.9f, 50.0f);
generalPath.curveTo(50.0f, 50.0f, 49.300003f, 49.3f, 49.300003f, 48.4f);
generalPath.curveTo(49.300003f, 47.5f, 50.000004f, 46.800003f, 50.9f, 46.800003f);
generalPath.curveTo(51.8f, 46.800003f, 52.5f, 47.500004f, 52.5f, 48.4f);
generalPath.curveTo(52.5f, 49.300003f, 51.8f, 50.0f, 50.9f, 50.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(50.917999267578125, 64.71700286865234), new Point2D.Double(50.917999267578125, 23.716999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(50.917999267578125, 65.21700286865234), new Point2D.Double(50.917999267578125, 23.216999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.0f, 25.8f);
generalPath.curveTo(53.0f, 24.599998f, 52.1f, 23.699999f, 50.9f, 23.699999f);
generalPath.curveTo(49.7f, 23.699999f, 48.800003f, 24.599998f, 48.800003f, 25.8f);
generalPath.lineTo(48.800003f, 43.0f);
generalPath.curveTo(46.600002f, 43.8f, 45.100002f, 45.9f, 45.100002f, 48.4f);
generalPath.curveTo(45.100002f, 50.9f, 46.600002f, 53.0f, 48.800003f, 53.800003f);
generalPath.curveTo(48.800003f, 53.9f, 48.700005f, 54.100002f, 48.700005f, 54.200005f);
generalPath.lineTo(48.700005f, 62.600006f);
generalPath.curveTo(48.700005f, 63.800007f, 49.600006f, 64.700005f, 50.800003f, 64.700005f);
generalPath.curveTo(52.000004f, 64.700005f, 52.9f, 63.800003f, 52.9f, 62.600006f);
generalPath.lineTo(52.9f, 54.200005f);
generalPath.curveTo(52.9f, 54.000004f, 52.9f, 53.900005f, 52.800003f, 53.800003f);
generalPath.curveTo(55.000004f, 53.000004f, 56.500004f, 50.9f, 56.500004f, 48.4f);
generalPath.curveTo(56.500004f, 45.9f, 55.000004f, 43.9f, 52.800003f, 43.0f);
generalPath.lineTo(52.800003f, 25.8f);
generalPath.closePath();
generalPath.moveTo(50.9f, 50.0f);
generalPath.curveTo(50.0f, 50.0f, 49.300003f, 49.3f, 49.300003f, 48.4f);
generalPath.curveTo(49.300003f, 47.5f, 50.000004f, 46.800003f, 50.9f, 46.800003f);
generalPath.curveTo(51.8f, 46.800003f, 52.5f, 47.500004f, 52.5f, 48.4f);
generalPath.curveTo(52.5f, 49.300003f, 51.8f, 50.0f, 50.9f, 50.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.4f, 62.6f);
generalPath.curveTo(19.4f, 63.8f, 20.3f, 64.7f, 21.5f, 64.7f);
generalPath.curveTo(22.7f, 64.7f, 23.6f, 63.799995f, 23.6f, 62.6f);
generalPath.lineTo(23.6f, 54.199997f);
generalPath.curveTo(23.6f, 53.999996f, 23.6f, 53.899998f, 23.5f, 53.799995f);
generalPath.curveTo(25.7f, 52.999996f, 27.2f, 50.899994f, 27.2f, 48.399994f);
generalPath.curveTo(27.2f, 45.899994f, 25.7f, 43.899994f, 23.5f, 42.999992f);
generalPath.lineTo(23.5f, 25.8f);
generalPath.curveTo(23.5f, 24.599998f, 22.6f, 23.699999f, 21.4f, 23.699999f);
generalPath.curveTo(20.199999f, 23.699999f, 19.3f, 24.599998f, 19.3f, 25.8f);
generalPath.lineTo(19.3f, 43.0f);
generalPath.curveTo(17.099998f, 43.8f, 15.599999f, 45.9f, 15.599999f, 48.4f);
generalPath.curveTo(15.599999f, 50.9f, 17.099998f, 53.0f, 19.3f, 53.800003f);
generalPath.curveTo(19.3f, 53.9f, 19.199999f, 54.100002f, 19.199999f, 54.200005f);
generalPath.lineTo(19.199999f, 62.600006f);
generalPath.closePath();
generalPath.moveTo(21.5f, 46.8f);
generalPath.curveTo(22.4f, 46.8f, 23.1f, 47.5f, 23.1f, 48.399998f);
generalPath.curveTo(23.1f, 49.3f, 22.4f, 49.999996f, 21.5f, 49.999996f);
generalPath.curveTo(20.6f, 49.999996f, 19.9f, 49.299995f, 19.9f, 48.399998f);
generalPath.curveTo(19.9f, 47.499996f, 20.6f, 46.8f, 21.5f, 46.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.48200035095215, 64.71700286865234), new Point2D.Double(21.48200035095215, 23.716999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(21.48200035095215, 65.21700286865234), new Point2D.Double(21.48200035095215, 23.216999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.4f, 62.6f);
generalPath.curveTo(19.4f, 63.8f, 20.3f, 64.7f, 21.5f, 64.7f);
generalPath.curveTo(22.7f, 64.7f, 23.6f, 63.799995f, 23.6f, 62.6f);
generalPath.lineTo(23.6f, 54.199997f);
generalPath.curveTo(23.6f, 53.999996f, 23.6f, 53.899998f, 23.5f, 53.799995f);
generalPath.curveTo(25.7f, 52.999996f, 27.2f, 50.899994f, 27.2f, 48.399994f);
generalPath.curveTo(27.2f, 45.899994f, 25.7f, 43.899994f, 23.5f, 42.999992f);
generalPath.lineTo(23.5f, 25.8f);
generalPath.curveTo(23.5f, 24.599998f, 22.6f, 23.699999f, 21.4f, 23.699999f);
generalPath.curveTo(20.199999f, 23.699999f, 19.3f, 24.599998f, 19.3f, 25.8f);
generalPath.lineTo(19.3f, 43.0f);
generalPath.curveTo(17.099998f, 43.8f, 15.599999f, 45.9f, 15.599999f, 48.4f);
generalPath.curveTo(15.599999f, 50.9f, 17.099998f, 53.0f, 19.3f, 53.800003f);
generalPath.curveTo(19.3f, 53.9f, 19.199999f, 54.100002f, 19.199999f, 54.200005f);
generalPath.lineTo(19.199999f, 62.600006f);
generalPath.closePath();
generalPath.moveTo(21.5f, 46.8f);
generalPath.curveTo(22.4f, 46.8f, 23.1f, 47.5f, 23.1f, 48.399998f);
generalPath.curveTo(23.1f, 49.3f, 22.4f, 49.999996f, 21.5f, 49.999996f);
generalPath.curveTo(20.6f, 49.999996f, 19.9f, 49.299995f, 19.9f, 48.399998f);
generalPath.curveTo(19.9f, 47.499996f, 20.6f, 46.8f, 21.5f, 46.8f);
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
generalPath.moveTo(16.5f, 86.1f);
generalPath.lineTo(19.6f, 87.1f);
generalPath.curveTo(19.1f, 88.799995f, 18.300001f, 90.1f, 17.2f, 90.9f);
generalPath.curveTo(16.1f, 91.700005f, 14.700001f, 92.200005f, 13.000001f, 92.200005f);
generalPath.curveTo(10.900002f, 92.200005f, 9.200001f, 91.50001f, 7.800001f, 90.100006f);
generalPath.curveTo(6.500001f, 88.700005f, 5.800001f, 86.700005f, 5.800001f, 84.200005f);
generalPath.curveTo(5.800001f, 81.600006f, 6.500001f, 79.50001f, 7.800001f, 78.100006f);
generalPath.curveTo(9.200001f, 76.700005f, 10.900002f, 75.90001f, 13.100001f, 75.90001f);
generalPath.curveTo(15.000001f, 75.90001f, 16.600002f, 76.50001f, 17.800001f, 77.600006f);
generalPath.curveTo(18.500002f, 78.3f, 19.1f, 79.200005f, 19.400002f, 80.50001f);
generalPath.lineTo(16.300001f, 81.30001f);
generalPath.curveTo(16.1f, 80.50001f, 15.700001f, 79.80001f, 15.100001f, 79.40001f);
generalPath.curveTo(14.500002f, 79.00001f, 13.800001f, 78.70001f, 12.900002f, 78.70001f);
generalPath.curveTo(11.700002f, 78.70001f, 10.800001f, 79.10001f, 10.100001f, 80.000015f);
generalPath.curveTo(9.400002f, 80.80002f, 9.000001f, 82.20001f, 9.000001f, 84.10001f);
generalPath.curveTo(9.000001f, 86.10001f, 9.400001f, 87.500015f, 10.100001f, 88.40002f);
generalPath.curveTo(10.800001f, 89.20002f, 11.700002f, 89.70002f, 12.900002f, 89.70002f);
generalPath.curveTo(13.700002f, 89.70002f, 14.500002f, 89.40002f, 15.100001f, 88.90002f);
generalPath.curveTo(15.800001f, 88.10001f, 16.2f, 87.20002f, 16.500002f, 86.10001f);
generalPath.closePath();
generalPath.moveTo(21.7f, 84.1f);
generalPath.curveTo(21.7f, 82.5f, 21.900002f, 81.1f, 22.400002f, 80.1f);
generalPath.curveTo(22.800001f, 79.299995f, 23.2f, 78.6f, 23.900002f, 77.9f);
generalPath.curveTo(24.500002f, 77.3f, 25.2f, 76.8f, 25.900002f, 76.5f);
generalPath.curveTo(26.900002f, 76.1f, 28.000002f, 75.9f, 29.300001f, 75.9f);
generalPath.curveTo(31.6f, 75.9f, 33.5f, 76.6f, 34.9f, 78.1f);
generalPath.curveTo(36.300003f, 79.5f, 37.0f, 81.5f, 37.0f, 84.1f);
generalPath.curveTo(37.0f, 86.6f, 36.3f, 88.6f, 34.9f, 90.1f);
generalPath.curveTo(33.5f, 91.5f, 31.7f, 92.299995f, 29.400002f, 92.299995f);
generalPath.curveTo(27.100002f, 92.299995f, 25.2f, 91.6f, 23.800001f, 90.2f);
generalPath.curveTo(22.400002f, 88.6f, 21.7f, 86.6f, 21.7f, 84.1f);
generalPath.closePath();
generalPath.moveTo(25.0f, 84.0f);
generalPath.curveTo(25.0f, 85.8f, 25.4f, 87.1f, 26.2f, 88.1f);
generalPath.curveTo(27.0f, 89.0f, 28.1f, 89.5f, 29.300001f, 89.5f);
generalPath.curveTo(30.500002f, 89.5f, 31.6f, 89.0f, 32.4f, 88.1f);
generalPath.curveTo(33.2f, 87.2f, 33.600002f, 85.799995f, 33.600002f, 84.0f);
generalPath.curveTo(33.600002f, 82.2f, 33.2f, 80.8f, 32.4f, 80.0f);
generalPath.curveTo(31.600002f, 79.1f, 30.600002f, 78.7f, 29.2f, 78.7f);
generalPath.curveTo(27.8f, 78.7f, 27.0f, 79.0f, 26.2f, 79.899994f);
generalPath.curveTo(25.400002f, 80.799995f, 25.0f, 82.2f, 25.0f, 83.99999f);
generalPath.closePath();
generalPath.moveTo(39.5f, 91.9f);
generalPath.lineTo(39.5f, 76.1f);
generalPath.lineTo(42.6f, 76.1f);
generalPath.lineTo(49.0f, 86.7f);
generalPath.lineTo(49.0f, 76.1f);
generalPath.lineTo(52.0f, 76.1f);
generalPath.lineTo(52.0f, 91.799995f);
generalPath.lineTo(48.8f, 91.799995f);
generalPath.lineTo(42.5f, 81.49999f);
generalPath.lineTo(42.5f, 91.799995f);
generalPath.lineTo(39.5f, 91.799995f);
generalPath.closePath();
generalPath.moveTo(55.3f, 91.9f);
generalPath.lineTo(55.3f, 76.1f);
generalPath.lineTo(66.1f, 76.1f);
generalPath.lineTo(66.1f, 78.799995f);
generalPath.lineTo(58.5f, 78.799995f);
generalPath.lineTo(58.5f, 82.49999f);
generalPath.lineTo(65.1f, 82.49999f);
generalPath.lineTo(65.1f, 85.19999f);
generalPath.lineTo(58.5f, 85.19999f);
generalPath.lineTo(58.5f, 91.89999f);
generalPath.lineTo(55.3f, 91.89999f);
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
	private ext_conf() {
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
       ext_conf base = new ext_conf();
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
       ext_conf base = new ext_conf();
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
        return ext_conf::new;
    }
}

