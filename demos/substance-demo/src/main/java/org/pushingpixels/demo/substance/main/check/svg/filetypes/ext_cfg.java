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
public class ext_cfg implements NeonIcon {
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
generalPath.moveTo(42.0f, 35.4f);
generalPath.curveTo(42.0f, 32.9f, 40.5f, 30.900002f, 38.3f, 30.000002f);
generalPath.lineTo(38.3f, 22.7f);
generalPath.curveTo(38.3f, 21.5f, 37.399998f, 20.6f, 36.2f, 20.6f);
generalPath.curveTo(35.000004f, 20.6f, 34.100002f, 21.5f, 34.100002f, 22.7f);
generalPath.lineTo(34.100002f, 30.0f);
generalPath.curveTo(31.900002f, 30.8f, 30.400002f, 32.9f, 30.400002f, 35.4f);
generalPath.curveTo(30.400002f, 37.9f, 31.900002f, 40.0f, 34.100002f, 40.800003f);
generalPath.curveTo(34.100002f, 40.9f, 34.000004f, 41.100002f, 34.000004f, 41.200005f);
generalPath.lineTo(34.000004f, 59.600006f);
generalPath.curveTo(34.000004f, 60.800007f, 34.900005f, 61.700005f, 36.100002f, 61.700005f);
generalPath.curveTo(37.3f, 61.700005f, 38.2f, 60.800003f, 38.2f, 59.600006f);
generalPath.lineTo(38.2f, 41.2f);
generalPath.curveTo(38.2f, 41.0f, 38.2f, 40.9f, 38.100002f, 40.8f);
generalPath.curveTo(40.500004f, 40.0f, 42.000004f, 37.899998f, 42.000004f, 35.399998f);
generalPath.closePath();
generalPath.moveTo(36.2f, 37.0f);
generalPath.curveTo(35.3f, 37.0f, 34.600002f, 36.3f, 34.600002f, 35.4f);
generalPath.curveTo(34.600002f, 34.500004f, 35.300003f, 33.800003f, 36.2f, 33.800003f);
generalPath.curveTo(37.1f, 33.800003f, 37.8f, 34.500004f, 37.8f, 35.4f);
generalPath.curveTo(37.8f, 36.3f, 37.1f, 37.0f, 36.2f, 37.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 61.71699905395508), new Point2D.Double(36.20000076293945, 20.716999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 62.21699905395508), new Point2D.Double(36.20000076293945, 20.216999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(42.0f, 35.4f);
generalPath.curveTo(42.0f, 32.9f, 40.5f, 30.900002f, 38.3f, 30.000002f);
generalPath.lineTo(38.3f, 22.7f);
generalPath.curveTo(38.3f, 21.5f, 37.399998f, 20.6f, 36.2f, 20.6f);
generalPath.curveTo(35.000004f, 20.6f, 34.100002f, 21.5f, 34.100002f, 22.7f);
generalPath.lineTo(34.100002f, 30.0f);
generalPath.curveTo(31.900002f, 30.8f, 30.400002f, 32.9f, 30.400002f, 35.4f);
generalPath.curveTo(30.400002f, 37.9f, 31.900002f, 40.0f, 34.100002f, 40.800003f);
generalPath.curveTo(34.100002f, 40.9f, 34.000004f, 41.100002f, 34.000004f, 41.200005f);
generalPath.lineTo(34.000004f, 59.600006f);
generalPath.curveTo(34.000004f, 60.800007f, 34.900005f, 61.700005f, 36.100002f, 61.700005f);
generalPath.curveTo(37.3f, 61.700005f, 38.2f, 60.800003f, 38.2f, 59.600006f);
generalPath.lineTo(38.2f, 41.2f);
generalPath.curveTo(38.2f, 41.0f, 38.2f, 40.9f, 38.100002f, 40.8f);
generalPath.curveTo(40.500004f, 40.0f, 42.000004f, 37.899998f, 42.000004f, 35.399998f);
generalPath.closePath();
generalPath.moveTo(36.2f, 37.0f);
generalPath.curveTo(35.3f, 37.0f, 34.600002f, 36.3f, 34.600002f, 35.4f);
generalPath.curveTo(34.600002f, 34.500004f, 35.300003f, 33.800003f, 36.2f, 33.800003f);
generalPath.curveTo(37.1f, 33.800003f, 37.8f, 34.500004f, 37.8f, 35.4f);
generalPath.curveTo(37.8f, 36.3f, 37.1f, 37.0f, 36.2f, 37.0f);
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
generalPath.moveTo(53.0f, 22.8f);
generalPath.curveTo(53.0f, 21.599998f, 52.1f, 20.699999f, 50.9f, 20.699999f);
generalPath.curveTo(49.7f, 20.699999f, 48.800003f, 21.599998f, 48.800003f, 22.8f);
generalPath.lineTo(48.800003f, 40.0f);
generalPath.curveTo(46.600002f, 40.8f, 45.100002f, 42.9f, 45.100002f, 45.4f);
generalPath.curveTo(45.100002f, 47.9f, 46.600002f, 50.0f, 48.800003f, 50.800003f);
generalPath.curveTo(48.800003f, 50.9f, 48.700005f, 51.100002f, 48.700005f, 51.200005f);
generalPath.lineTo(48.700005f, 59.600006f);
generalPath.curveTo(48.700005f, 60.800007f, 49.600006f, 61.700005f, 50.800003f, 61.700005f);
generalPath.curveTo(52.000004f, 61.700005f, 52.9f, 60.800003f, 52.9f, 59.600006f);
generalPath.lineTo(52.9f, 51.200005f);
generalPath.curveTo(52.9f, 51.000004f, 52.9f, 50.900005f, 52.800003f, 50.800003f);
generalPath.curveTo(55.000004f, 50.000004f, 56.500004f, 47.9f, 56.500004f, 45.4f);
generalPath.curveTo(56.500004f, 42.9f, 55.000004f, 40.9f, 52.800003f, 40.0f);
generalPath.lineTo(52.800003f, 22.8f);
generalPath.closePath();
generalPath.moveTo(50.9f, 47.0f);
generalPath.curveTo(50.0f, 47.0f, 49.300003f, 46.3f, 49.300003f, 45.4f);
generalPath.curveTo(49.300003f, 44.5f, 50.000004f, 43.800003f, 50.9f, 43.800003f);
generalPath.curveTo(51.8f, 43.800003f, 52.5f, 44.500004f, 52.5f, 45.4f);
generalPath.curveTo(52.5f, 46.300003f, 51.8f, 47.0f, 50.9f, 47.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(50.917999267578125, 61.71699905395508), new Point2D.Double(50.917999267578125, 20.716999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(50.917999267578125, 62.21699905395508), new Point2D.Double(50.917999267578125, 20.216999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.0f, 22.8f);
generalPath.curveTo(53.0f, 21.599998f, 52.1f, 20.699999f, 50.9f, 20.699999f);
generalPath.curveTo(49.7f, 20.699999f, 48.800003f, 21.599998f, 48.800003f, 22.8f);
generalPath.lineTo(48.800003f, 40.0f);
generalPath.curveTo(46.600002f, 40.8f, 45.100002f, 42.9f, 45.100002f, 45.4f);
generalPath.curveTo(45.100002f, 47.9f, 46.600002f, 50.0f, 48.800003f, 50.800003f);
generalPath.curveTo(48.800003f, 50.9f, 48.700005f, 51.100002f, 48.700005f, 51.200005f);
generalPath.lineTo(48.700005f, 59.600006f);
generalPath.curveTo(48.700005f, 60.800007f, 49.600006f, 61.700005f, 50.800003f, 61.700005f);
generalPath.curveTo(52.000004f, 61.700005f, 52.9f, 60.800003f, 52.9f, 59.600006f);
generalPath.lineTo(52.9f, 51.200005f);
generalPath.curveTo(52.9f, 51.000004f, 52.9f, 50.900005f, 52.800003f, 50.800003f);
generalPath.curveTo(55.000004f, 50.000004f, 56.500004f, 47.9f, 56.500004f, 45.4f);
generalPath.curveTo(56.500004f, 42.9f, 55.000004f, 40.9f, 52.800003f, 40.0f);
generalPath.lineTo(52.800003f, 22.8f);
generalPath.closePath();
generalPath.moveTo(50.9f, 47.0f);
generalPath.curveTo(50.0f, 47.0f, 49.300003f, 46.3f, 49.300003f, 45.4f);
generalPath.curveTo(49.300003f, 44.5f, 50.000004f, 43.800003f, 50.9f, 43.800003f);
generalPath.curveTo(51.8f, 43.800003f, 52.5f, 44.500004f, 52.5f, 45.4f);
generalPath.curveTo(52.5f, 46.300003f, 51.8f, 47.0f, 50.9f, 47.0f);
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
generalPath.moveTo(19.4f, 59.6f);
generalPath.curveTo(19.4f, 60.8f, 20.3f, 61.699997f, 21.5f, 61.699997f);
generalPath.curveTo(22.7f, 61.699997f, 23.6f, 60.799995f, 23.6f, 59.6f);
generalPath.lineTo(23.6f, 51.199997f);
generalPath.curveTo(23.6f, 50.999996f, 23.6f, 50.899998f, 23.5f, 50.799995f);
generalPath.curveTo(25.7f, 49.999996f, 27.2f, 47.899994f, 27.2f, 45.399994f);
generalPath.curveTo(27.2f, 42.899994f, 25.7f, 40.899994f, 23.5f, 39.999992f);
generalPath.lineTo(23.5f, 22.8f);
generalPath.curveTo(23.5f, 21.599998f, 22.6f, 20.699999f, 21.4f, 20.699999f);
generalPath.curveTo(20.199999f, 20.699999f, 19.3f, 21.599998f, 19.3f, 22.8f);
generalPath.lineTo(19.3f, 40.0f);
generalPath.curveTo(17.099998f, 40.8f, 15.599999f, 42.9f, 15.599999f, 45.4f);
generalPath.curveTo(15.599999f, 47.9f, 17.099998f, 50.0f, 19.3f, 50.800003f);
generalPath.curveTo(19.3f, 50.9f, 19.199999f, 51.100002f, 19.199999f, 51.200005f);
generalPath.lineTo(19.199999f, 59.600006f);
generalPath.closePath();
generalPath.moveTo(21.5f, 43.8f);
generalPath.curveTo(22.4f, 43.8f, 23.1f, 44.5f, 23.1f, 45.399998f);
generalPath.curveTo(23.1f, 46.3f, 22.4f, 46.999996f, 21.5f, 46.999996f);
generalPath.curveTo(20.6f, 46.999996f, 19.9f, 46.299995f, 19.9f, 45.399998f);
generalPath.curveTo(19.9f, 44.499996f, 20.6f, 43.8f, 21.5f, 43.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(21.48200035095215, 61.71699905395508), new Point2D.Double(21.48200035095215, 20.716999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(21.48200035095215, 62.21699905395508), new Point2D.Double(21.48200035095215, 20.216999053955078), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(19.4f, 59.6f);
generalPath.curveTo(19.4f, 60.8f, 20.3f, 61.699997f, 21.5f, 61.699997f);
generalPath.curveTo(22.7f, 61.699997f, 23.6f, 60.799995f, 23.6f, 59.6f);
generalPath.lineTo(23.6f, 51.199997f);
generalPath.curveTo(23.6f, 50.999996f, 23.6f, 50.899998f, 23.5f, 50.799995f);
generalPath.curveTo(25.7f, 49.999996f, 27.2f, 47.899994f, 27.2f, 45.399994f);
generalPath.curveTo(27.2f, 42.899994f, 25.7f, 40.899994f, 23.5f, 39.999992f);
generalPath.lineTo(23.5f, 22.8f);
generalPath.curveTo(23.5f, 21.599998f, 22.6f, 20.699999f, 21.4f, 20.699999f);
generalPath.curveTo(20.199999f, 20.699999f, 19.3f, 21.599998f, 19.3f, 22.8f);
generalPath.lineTo(19.3f, 40.0f);
generalPath.curveTo(17.099998f, 40.8f, 15.599999f, 42.9f, 15.599999f, 45.4f);
generalPath.curveTo(15.599999f, 47.9f, 17.099998f, 50.0f, 19.3f, 50.800003f);
generalPath.curveTo(19.3f, 50.9f, 19.199999f, 51.100002f, 19.199999f, 51.200005f);
generalPath.lineTo(19.199999f, 59.600006f);
generalPath.closePath();
generalPath.moveTo(21.5f, 43.8f);
generalPath.curveTo(22.4f, 43.8f, 23.1f, 44.5f, 23.1f, 45.399998f);
generalPath.curveTo(23.1f, 46.3f, 22.4f, 46.999996f, 21.5f, 46.999996f);
generalPath.curveTo(20.6f, 46.999996f, 19.9f, 46.299995f, 19.9f, 45.399998f);
generalPath.curveTo(19.9f, 44.499996f, 20.6f, 43.8f, 21.5f, 43.8f);
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
generalPath.moveTo(21.3f, 84.5f);
generalPath.lineTo(25.199999f, 85.7f);
generalPath.curveTo(24.599998f, 87.899994f, 23.599998f, 89.5f, 22.199999f, 90.6f);
generalPath.curveTo(20.8f, 91.7f, 18.999998f, 92.2f, 16.899998f, 92.2f);
generalPath.curveTo(14.199998f, 92.2f, 12.0999975f, 91.299995f, 10.299997f, 89.5f);
generalPath.curveTo(8.5999975f, 87.7f, 7.6999974f, 85.2f, 7.6999974f, 82.0f);
generalPath.curveTo(7.6999974f, 78.7f, 8.5999975f, 76.1f, 10.299997f, 74.2f);
generalPath.curveTo(11.999997f, 72.299995f, 14.299997f, 71.399994f, 17.099998f, 71.399994f);
generalPath.curveTo(19.599998f, 71.399994f, 21.499998f, 72.09999f, 23.099998f, 73.59999f);
generalPath.curveTo(23.999998f, 74.49999f, 24.699999f, 75.69999f, 25.199999f, 77.29999f);
generalPath.lineTo(21.199999f, 78.29999f);
generalPath.curveTo(20.999998f, 77.29999f, 20.499998f, 76.39999f, 19.699999f, 75.79999f);
generalPath.curveTo(18.9f, 75.19999f, 18.0f, 75.0f, 16.9f, 75.0f);
generalPath.curveTo(15.4f, 75.0f, 14.2f, 75.5f, 13.299999f, 76.6f);
generalPath.curveTo(12.4f, 77.7f, 11.9f, 79.4f, 11.9f, 81.799995f);
generalPath.curveTo(11.9f, 84.299995f, 12.4f, 86.1f, 13.299999f, 87.2f);
generalPath.curveTo(14.199999f, 88.299995f, 15.4f, 88.799995f, 16.9f, 88.799995f);
generalPath.curveTo(18.0f, 88.799995f, 18.9f, 88.49999f, 19.699999f, 87.799995f);
generalPath.curveTo(20.4f, 87.1f, 20.999998f, 85.99999f, 21.3f, 84.49999f);
generalPath.closePath();
generalPath.moveTo(28.699999f, 91.9f);
generalPath.lineTo(28.699999f, 71.9f);
generalPath.lineTo(42.399998f, 71.9f);
generalPath.lineTo(42.399998f, 75.3f);
generalPath.lineTo(32.699997f, 75.3f);
generalPath.lineTo(32.699997f, 80.0f);
generalPath.lineTo(41.1f, 80.0f);
generalPath.lineTo(41.1f, 83.4f);
generalPath.lineTo(32.699997f, 83.4f);
generalPath.lineTo(32.699997f, 91.9f);
generalPath.lineTo(28.699997f, 91.9f);
generalPath.closePath();
generalPath.moveTo(55.1f, 84.5f);
generalPath.lineTo(55.1f, 81.1f);
generalPath.lineTo(63.8f, 81.1f);
generalPath.lineTo(63.8f, 89.1f);
generalPath.curveTo(63.0f, 89.9f, 61.7f, 90.6f, 60.1f, 91.299995f);
generalPath.curveTo(58.5f, 91.899994f, 56.899998f, 92.2f, 55.199997f, 92.2f);
generalPath.curveTo(53.1f, 92.2f, 51.299995f, 91.799995f, 49.699997f, 90.899994f);
generalPath.curveTo(48.1f, 89.99999f, 46.999996f, 88.799995f, 46.199997f, 87.09999f);
generalPath.curveTo(45.399998f, 85.49999f, 44.999996f, 83.69999f, 44.999996f, 81.79999f);
generalPath.curveTo(44.999996f, 79.69999f, 45.399998f, 77.89999f, 46.299995f, 76.19999f);
generalPath.curveTo(47.199993f, 74.49999f, 48.499996f, 73.29999f, 50.099995f, 72.49999f);
generalPath.curveTo(51.399994f, 71.799995f, 52.999996f, 71.49999f, 54.899994f, 71.49999f);
generalPath.curveTo(57.399994f, 71.49999f, 59.299995f, 71.99999f, 60.699993f, 73.09999f);
generalPath.curveTo(62.099995f, 74.09999f, 62.999992f, 75.59999f, 63.399994f, 77.399994f);
generalPath.lineTo(59.399994f, 78.2f);
generalPath.curveTo(59.099995f, 77.2f, 58.599995f, 76.399994f, 57.799995f, 75.899994f);
generalPath.curveTo(56.999996f, 75.399994f, 56.199997f, 74.99999f, 55.099995f, 74.99999f);
generalPath.curveTo(53.299995f, 74.99999f, 51.899994f, 75.59999f, 50.899994f, 76.69999f);
generalPath.curveTo(49.899994f, 77.79999f, 49.299995f, 79.49999f, 49.299995f, 81.69999f);
generalPath.curveTo(49.299995f, 84.09999f, 49.799995f, 85.89999f, 50.899994f, 87.09999f);
generalPath.curveTo(51.999992f, 88.29999f, 53.299995f, 88.899994f, 55.099995f, 88.899994f);
generalPath.curveTo(55.899994f, 88.899994f, 56.799995f, 88.7f, 57.599995f, 88.399994f);
generalPath.curveTo(58.499996f, 88.09999f, 59.199993f, 87.7f, 59.799995f, 87.2f);
generalPath.lineTo(59.799995f, 84.7f);
generalPath.lineTo(55.099995f, 84.7f);
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
	private ext_cfg() {
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
    public static NeonIcon of(int width, int height) {
       ext_cfg base = new ext_cfg();
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
       ext_cfg base = new ext_cfg();
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
        return ext_cfg::new;
    }
}

