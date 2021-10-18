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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_config implements RadianceIcon {
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
generalPath.moveTo(42.0f, 46.4f);
generalPath.curveTo(42.0f, 43.9f, 40.5f, 41.9f, 38.3f, 41.0f);
generalPath.lineTo(38.3f, 33.7f);
generalPath.curveTo(38.3f, 32.5f, 37.399998f, 31.6f, 36.2f, 31.6f);
generalPath.curveTo(35.000004f, 31.6f, 34.100002f, 32.5f, 34.100002f, 33.7f);
generalPath.lineTo(34.100002f, 41.0f);
generalPath.curveTo(31.900002f, 41.8f, 30.400002f, 43.9f, 30.400002f, 46.4f);
generalPath.curveTo(30.400002f, 48.9f, 31.900002f, 51.0f, 34.100002f, 51.800003f);
generalPath.curveTo(34.100002f, 51.9f, 34.000004f, 52.100002f, 34.000004f, 52.200005f);
generalPath.lineTo(34.000004f, 70.600006f);
generalPath.curveTo(34.000004f, 71.8f, 34.900005f, 72.700005f, 36.100002f, 72.700005f);
generalPath.curveTo(37.3f, 72.700005f, 38.2f, 71.8f, 38.2f, 70.600006f);
generalPath.lineTo(38.2f, 52.2f);
generalPath.curveTo(38.2f, 52.0f, 38.2f, 51.9f, 38.100002f, 51.8f);
generalPath.curveTo(40.500004f, 51.0f, 42.000004f, 48.899998f, 42.000004f, 46.399998f);
generalPath.closePath();
generalPath.moveTo(36.2f, 48.0f);
generalPath.curveTo(35.3f, 48.0f, 34.600002f, 47.3f, 34.600002f, 46.4f);
generalPath.curveTo(34.600002f, 45.500004f, 35.300003f, 44.800003f, 36.2f, 44.800003f);
generalPath.curveTo(37.1f, 44.800003f, 37.8f, 45.500004f, 37.8f, 46.4f);
generalPath.curveTo(37.8f, 47.3f, 37.1f, 48.0f, 36.2f, 48.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 72.71700286865234), new Point2D.Double(36.20000076293945, 31.716999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 73.21700286865234), new Point2D.Double(36.20000076293945, 31.216999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(42.0f, 46.4f);
generalPath.curveTo(42.0f, 43.9f, 40.5f, 41.9f, 38.3f, 41.0f);
generalPath.lineTo(38.3f, 33.7f);
generalPath.curveTo(38.3f, 32.5f, 37.399998f, 31.6f, 36.2f, 31.6f);
generalPath.curveTo(35.000004f, 31.6f, 34.100002f, 32.5f, 34.100002f, 33.7f);
generalPath.lineTo(34.100002f, 41.0f);
generalPath.curveTo(31.900002f, 41.8f, 30.400002f, 43.9f, 30.400002f, 46.4f);
generalPath.curveTo(30.400002f, 48.9f, 31.900002f, 51.0f, 34.100002f, 51.800003f);
generalPath.curveTo(34.100002f, 51.9f, 34.000004f, 52.100002f, 34.000004f, 52.200005f);
generalPath.lineTo(34.000004f, 70.600006f);
generalPath.curveTo(34.000004f, 71.8f, 34.900005f, 72.700005f, 36.100002f, 72.700005f);
generalPath.curveTo(37.3f, 72.700005f, 38.2f, 71.8f, 38.2f, 70.600006f);
generalPath.lineTo(38.2f, 52.2f);
generalPath.curveTo(38.2f, 52.0f, 38.2f, 51.9f, 38.100002f, 51.8f);
generalPath.curveTo(40.500004f, 51.0f, 42.000004f, 48.899998f, 42.000004f, 46.399998f);
generalPath.closePath();
generalPath.moveTo(36.2f, 48.0f);
generalPath.curveTo(35.3f, 48.0f, 34.600002f, 47.3f, 34.600002f, 46.4f);
generalPath.curveTo(34.600002f, 45.500004f, 35.300003f, 44.800003f, 36.2f, 44.800003f);
generalPath.curveTo(37.1f, 44.800003f, 37.8f, 45.500004f, 37.8f, 46.4f);
generalPath.curveTo(37.8f, 47.3f, 37.1f, 48.0f, 36.2f, 48.0f);
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
generalPath.moveTo(53.0f, 33.8f);
generalPath.curveTo(53.0f, 32.6f, 52.1f, 31.699999f, 50.9f, 31.699999f);
generalPath.curveTo(49.7f, 31.699999f, 48.800003f, 32.6f, 48.800003f, 33.8f);
generalPath.lineTo(48.800003f, 51.0f);
generalPath.curveTo(46.600002f, 51.8f, 45.100002f, 53.9f, 45.100002f, 56.4f);
generalPath.curveTo(45.100002f, 58.9f, 46.600002f, 61.0f, 48.800003f, 61.800003f);
generalPath.curveTo(48.800003f, 61.9f, 48.700005f, 62.100002f, 48.700005f, 62.200005f);
generalPath.lineTo(48.700005f, 70.600006f);
generalPath.curveTo(48.700005f, 71.8f, 49.600006f, 72.700005f, 50.800003f, 72.700005f);
generalPath.curveTo(52.000004f, 72.700005f, 52.9f, 71.8f, 52.9f, 70.600006f);
generalPath.lineTo(52.9f, 62.200005f);
generalPath.curveTo(52.9f, 62.000004f, 52.9f, 61.900005f, 52.800003f, 61.800003f);
generalPath.curveTo(55.000004f, 61.000004f, 56.500004f, 58.9f, 56.500004f, 56.4f);
generalPath.curveTo(56.500004f, 53.9f, 55.000004f, 51.9f, 52.800003f, 51.0f);
generalPath.lineTo(52.800003f, 33.8f);
generalPath.closePath();
generalPath.moveTo(50.9f, 58.0f);
generalPath.curveTo(50.0f, 58.0f, 49.300003f, 57.3f, 49.300003f, 56.4f);
generalPath.curveTo(49.300003f, 55.5f, 50.000004f, 54.800003f, 50.9f, 54.800003f);
generalPath.curveTo(51.8f, 54.800003f, 52.5f, 55.500004f, 52.5f, 56.4f);
generalPath.curveTo(52.5f, 57.300003f, 51.8f, 58.0f, 50.9f, 58.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(50.917999267578125, 72.71700286865234), new Point2D.Double(50.917999267578125, 31.716999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(50.917999267578125, 73.21700286865234), new Point2D.Double(50.917999267578125, 31.216999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.0f, 33.8f);
generalPath.curveTo(53.0f, 32.6f, 52.1f, 31.699999f, 50.9f, 31.699999f);
generalPath.curveTo(49.7f, 31.699999f, 48.800003f, 32.6f, 48.800003f, 33.8f);
generalPath.lineTo(48.800003f, 51.0f);
generalPath.curveTo(46.600002f, 51.8f, 45.100002f, 53.9f, 45.100002f, 56.4f);
generalPath.curveTo(45.100002f, 58.9f, 46.600002f, 61.0f, 48.800003f, 61.800003f);
generalPath.curveTo(48.800003f, 61.9f, 48.700005f, 62.100002f, 48.700005f, 62.200005f);
generalPath.lineTo(48.700005f, 70.600006f);
generalPath.curveTo(48.700005f, 71.8f, 49.600006f, 72.700005f, 50.800003f, 72.700005f);
generalPath.curveTo(52.000004f, 72.700005f, 52.9f, 71.8f, 52.9f, 70.600006f);
generalPath.lineTo(52.9f, 62.200005f);
generalPath.curveTo(52.9f, 62.000004f, 52.9f, 61.900005f, 52.800003f, 61.800003f);
generalPath.curveTo(55.000004f, 61.000004f, 56.500004f, 58.9f, 56.500004f, 56.4f);
generalPath.curveTo(56.500004f, 53.9f, 55.000004f, 51.9f, 52.800003f, 51.0f);
generalPath.lineTo(52.800003f, 33.8f);
generalPath.closePath();
generalPath.moveTo(50.9f, 58.0f);
generalPath.curveTo(50.0f, 58.0f, 49.300003f, 57.3f, 49.300003f, 56.4f);
generalPath.curveTo(49.300003f, 55.5f, 50.000004f, 54.800003f, 50.9f, 54.800003f);
generalPath.curveTo(51.8f, 54.800003f, 52.5f, 55.500004f, 52.5f, 56.4f);
generalPath.curveTo(52.5f, 57.300003f, 51.8f, 58.0f, 50.9f, 58.0f);
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
generalPath.moveTo(19.4f, 70.6f);
generalPath.curveTo(19.4f, 71.799995f, 20.3f, 72.7f, 21.5f, 72.7f);
generalPath.curveTo(22.7f, 72.7f, 23.6f, 71.799995f, 23.6f, 70.6f);
generalPath.lineTo(23.6f, 62.199997f);
generalPath.curveTo(23.6f, 61.999996f, 23.6f, 61.899998f, 23.5f, 61.799995f);
generalPath.curveTo(25.7f, 60.999996f, 27.2f, 58.899994f, 27.2f, 56.399994f);
generalPath.curveTo(27.2f, 53.899994f, 25.7f, 51.899994f, 23.5f, 50.999992f);
generalPath.lineTo(23.5f, 33.8f);
generalPath.curveTo(23.5f, 32.6f, 22.6f, 31.699999f, 21.4f, 31.699999f);
generalPath.curveTo(20.199999f, 31.699999f, 19.3f, 32.6f, 19.3f, 33.8f);
generalPath.lineTo(19.3f, 51.0f);
generalPath.curveTo(17.099998f, 51.8f, 15.599999f, 53.9f, 15.599999f, 56.4f);
generalPath.curveTo(15.599999f, 58.9f, 17.099998f, 61.0f, 19.3f, 61.800003f);
generalPath.curveTo(19.3f, 61.9f, 19.199999f, 62.100002f, 19.199999f, 62.200005f);
generalPath.lineTo(19.199999f, 70.600006f);
generalPath.closePath();
generalPath.moveTo(21.5f, 54.8f);
generalPath.curveTo(22.4f, 54.8f, 23.1f, 55.5f, 23.1f, 56.399998f);
generalPath.curveTo(23.1f, 57.3f, 22.4f, 57.999996f, 21.5f, 57.999996f);
generalPath.curveTo(20.6f, 57.999996f, 19.9f, 57.299995f, 19.9f, 56.399998f);
generalPath.curveTo(19.9f, 55.499996f, 20.6f, 54.8f, 21.5f, 54.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.48200035095215, 72.71700286865234), new Point2D.Double(21.48200035095215, 31.716999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(21.48200035095215, 73.21700286865234), new Point2D.Double(21.48200035095215, 31.216999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.4f, 70.6f);
generalPath.curveTo(19.4f, 71.799995f, 20.3f, 72.7f, 21.5f, 72.7f);
generalPath.curveTo(22.7f, 72.7f, 23.6f, 71.799995f, 23.6f, 70.6f);
generalPath.lineTo(23.6f, 62.199997f);
generalPath.curveTo(23.6f, 61.999996f, 23.6f, 61.899998f, 23.5f, 61.799995f);
generalPath.curveTo(25.7f, 60.999996f, 27.2f, 58.899994f, 27.2f, 56.399994f);
generalPath.curveTo(27.2f, 53.899994f, 25.7f, 51.899994f, 23.5f, 50.999992f);
generalPath.lineTo(23.5f, 33.8f);
generalPath.curveTo(23.5f, 32.6f, 22.6f, 31.699999f, 21.4f, 31.699999f);
generalPath.curveTo(20.199999f, 31.699999f, 19.3f, 32.6f, 19.3f, 33.8f);
generalPath.lineTo(19.3f, 51.0f);
generalPath.curveTo(17.099998f, 51.8f, 15.599999f, 53.9f, 15.599999f, 56.4f);
generalPath.curveTo(15.599999f, 58.9f, 17.099998f, 61.0f, 19.3f, 61.800003f);
generalPath.curveTo(19.3f, 61.9f, 19.199999f, 62.100002f, 19.199999f, 62.200005f);
generalPath.lineTo(19.199999f, 70.600006f);
generalPath.closePath();
generalPath.moveTo(21.5f, 54.8f);
generalPath.curveTo(22.4f, 54.8f, 23.1f, 55.5f, 23.1f, 56.399998f);
generalPath.curveTo(23.1f, 57.3f, 22.4f, 57.999996f, 21.5f, 57.999996f);
generalPath.curveTo(20.6f, 57.999996f, 19.9f, 57.299995f, 19.9f, 56.399998f);
generalPath.curveTo(19.9f, 55.499996f, 20.6f, 54.8f, 21.5f, 54.8f);
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
	private ext_config() {
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
       ext_config base = new ext_config();
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
       ext_config base = new ext_config();
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
        return ext_config::new;
    }
}

