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
public class ext_mdb implements RadianceIcon {
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0), new Point2D.Double(36.0, 3.003999948501587), new float[] {0.0f,0.637f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 238, 255)) : new Color(255, 254, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 159, 160, 255)) : new Color(207, 159, 160, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 53, 55, 255)) : new Color(160, 53, 55, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 53, 55, 255)) : new Color(160, 53, 55, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
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
generalPath.moveTo(6.3f, 91.1f);
generalPath.lineTo(6.3f, 71.2f);
generalPath.lineTo(12.4f, 71.2f);
generalPath.lineTo(16.0f, 84.8f);
generalPath.lineTo(19.6f, 71.3f);
generalPath.lineTo(25.7f, 71.3f);
generalPath.lineTo(25.7f, 91.100006f);
generalPath.lineTo(22.0f, 91.100006f);
generalPath.lineTo(22.0f, 75.4f);
generalPath.lineTo(18.0f, 91.0f);
generalPath.lineTo(14.0f, 91.0f);
generalPath.lineTo(10.0f, 75.4f);
generalPath.lineTo(10.0f, 91.0f);
generalPath.lineTo(6.3f, 91.0f);
generalPath.closePath();
generalPath.moveTo(29.8f, 71.2f);
generalPath.lineTo(37.2f, 71.2f);
generalPath.curveTo(38.9f, 71.2f, 40.2f, 71.299995f, 41.0f, 71.6f);
generalPath.curveTo(42.2f, 71.9f, 43.2f, 72.6f, 44.0f, 73.4f);
generalPath.curveTo(44.8f, 74.200005f, 45.5f, 75.3f, 45.9f, 76.6f);
generalPath.curveTo(46.300003f, 77.9f, 46.600002f, 79.4f, 46.600002f, 81.299995f);
generalPath.curveTo(46.600002f, 82.899994f, 46.4f, 84.299995f, 46.000004f, 85.49999f);
generalPath.curveTo(45.500004f, 86.899994f, 44.800003f, 88.09999f, 43.800003f, 88.99999f);
generalPath.curveTo(43.100002f, 89.69999f, 42.100002f, 90.19999f, 40.9f, 90.59999f);
generalPath.curveTo(40.0f, 90.899994f, 38.800003f, 90.99999f, 37.300003f, 90.99999f);
generalPath.lineTo(29.600002f, 90.99999f);
generalPath.lineTo(29.600002f, 71.2f);
generalPath.closePath();
generalPath.moveTo(33.899998f, 74.6f);
generalPath.lineTo(33.899998f, 87.7f);
generalPath.lineTo(36.899998f, 87.7f);
generalPath.curveTo(37.999996f, 87.7f, 38.899998f, 87.6f, 39.399998f, 87.5f);
generalPath.curveTo(40.1f, 87.3f, 40.6f, 87.1f, 40.999996f, 86.7f);
generalPath.curveTo(41.399994f, 86.299995f, 41.799995f, 85.7f, 42.099995f, 84.799995f);
generalPath.curveTo(42.399994f, 83.899994f, 42.499996f, 82.7f, 42.499996f, 81.2f);
generalPath.curveTo(42.499996f, 79.7f, 42.399998f, 78.5f, 42.099995f, 77.7f);
generalPath.curveTo(41.79999f, 76.899994f, 41.399994f, 76.2f, 40.899994f, 75.799995f);
generalPath.curveTo(40.399994f, 75.299995f, 39.799995f, 74.99999f, 38.999992f, 74.899994f);
generalPath.curveTo(38.399994f, 74.799995f, 37.29999f, 74.7f, 35.699993f, 74.7f);
generalPath.lineTo(33.899994f, 74.7f);
generalPath.closePath();
generalPath.moveTo(50.199997f, 71.2f);
generalPath.lineTo(58.299995f, 71.2f);
generalPath.curveTo(59.899994f, 71.2f, 61.099995f, 71.299995f, 61.899994f, 71.399994f);
generalPath.curveTo(62.699993f, 71.49999f, 63.399994f, 71.799995f, 63.999992f, 72.2f);
generalPath.curveTo(64.59999f, 72.6f, 65.09999f, 73.2f, 65.49999f, 73.899994f);
generalPath.curveTo(65.899994f, 74.59999f, 66.09999f, 75.399994f, 66.09999f, 76.2f);
generalPath.curveTo(66.09999f, 77.1f, 65.79999f, 78.0f, 65.29999f, 78.799995f);
generalPath.curveTo(64.79999f, 79.59999f, 64.09999f, 80.2f, 63.19999f, 80.49999f);
generalPath.curveTo(64.39999f, 80.899994f, 65.39999f, 81.49999f, 65.99999f, 82.299995f);
generalPath.curveTo(66.69999f, 83.1f, 66.99999f, 84.1f, 66.99999f, 85.299995f);
generalPath.curveTo(66.99999f, 86.2f, 66.799995f, 87.1f, 66.399994f, 87.899994f);
generalPath.curveTo(65.99999f, 88.69999f, 65.399994f, 89.399994f, 64.7f, 89.899994f);
generalPath.curveTo(64.0f, 90.399994f, 62.999996f, 90.799995f, 61.999996f, 90.899994f);
generalPath.curveTo(61.299995f, 90.99999f, 59.599995f, 90.99999f, 56.999996f, 91.09999f);
generalPath.lineTo(50.099995f, 91.09999f);
generalPath.lineTo(50.099995f, 71.2f);
generalPath.closePath();
generalPath.moveTo(54.299995f, 74.5f);
generalPath.lineTo(54.299995f, 79.1f);
generalPath.lineTo(57.0f, 79.1f);
generalPath.curveTo(58.6f, 79.1f, 59.6f, 79.1f, 60.0f, 79.0f);
generalPath.curveTo(60.7f, 78.9f, 61.2f, 78.7f, 61.6f, 78.3f);
generalPath.curveTo(62.0f, 77.9f, 62.199997f, 77.4f, 62.199997f, 76.8f);
generalPath.curveTo(62.199997f, 76.200005f, 61.999996f, 75.700005f, 61.699997f, 75.3f);
generalPath.curveTo(61.399998f, 74.9f, 60.799995f, 74.700005f, 60.199997f, 74.600006f);
generalPath.curveTo(59.799995f, 74.600006f, 58.6f, 74.50001f, 56.699997f, 74.50001f);
generalPath.lineTo(54.299995f, 74.50001f);
generalPath.closePath();
generalPath.moveTo(54.299995f, 82.4f);
generalPath.lineTo(54.299995f, 87.700005f);
generalPath.lineTo(58.0f, 87.700005f);
generalPath.curveTo(59.5f, 87.700005f, 60.4f, 87.700005f, 60.8f, 87.600006f);
generalPath.curveTo(61.399998f, 87.50001f, 61.899998f, 87.200005f, 62.3f, 86.8f);
generalPath.curveTo(62.7f, 86.4f, 62.899998f, 85.8f, 62.899998f, 85.100006f);
generalPath.curveTo(62.899998f, 84.50001f, 62.8f, 84.00001f, 62.499996f, 83.600006f);
generalPath.curveTo(62.199993f, 83.200005f, 61.799995f, 82.90001f, 61.199997f, 82.700005f);
generalPath.curveTo(60.6f, 82.5f, 59.399998f, 82.4f, 57.6f, 82.4f);
generalPath.lineTo(54.3f, 82.4f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(54.0f, 48.1f);
generalPath.curveTo(54.0f, 50.6f, 45.9f, 52.6f, 36.0f, 52.6f);
generalPath.curveTo(26.099998f, 52.6f, 18.0f, 50.6f, 18.0f, 48.1f);
generalPath.curveTo(18.0f, 45.6f, 26.1f, 43.6f, 36.0f, 43.6f);
generalPath.curveTo(45.9f, 43.6f, 54.0f, 45.6f, 54.0f, 48.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(242, 242, 242, 255)) : new Color(242, 242, 242, 255);
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
generalPath.moveTo(49.5f, 47.8f);
generalPath.curveTo(49.5f, 50.0f, 43.5f, 51.7f, 36.0f, 51.7f);
generalPath.curveTo(28.5f, 51.7f, 22.5f, 50.0f, 22.5f, 47.8f);
generalPath.curveTo(22.5f, 45.6f, 28.5f, 43.899998f, 36.0f, 43.899998f);
generalPath.curveTo(43.5f, 43.899998f, 49.5f, 45.6f, 49.5f, 47.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 47.22200012207031), new Point2D.Double(43.02799987792969, 61.27799987792969), new float[] {0.0f,0.637f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 238, 255)) : new Color(255, 254, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 159, 160, 255)) : new Color(207, 159, 160, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 53, 55, 255)) : new Color(160, 53, 55, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(18.0f, 48.3f);
generalPath.lineTo(18.0f, 59.5f);
generalPath.curveTo(18.0f, 59.5f, 22.5f, 64.0f, 36.0f, 64.0f);
generalPath.curveTo(49.5f, 64.0f, 54.0f, 59.5f, 54.0f, 59.5f);
generalPath.lineTo(54.0f, 48.3f);
generalPath.curveTo(54.0f, 48.3f, 51.8f, 52.2f, 36.0f, 52.5f);
generalPath.curveTo(20.2f, 52.8f, 18.0f, 48.3f, 18.0f, 48.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0, 45.900001525878906), new Point2D.Double(54.0, 45.900001525878906), new float[] {0.0f,0.637f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 238, 255)) : new Color(255, 254, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 159, 160, 255)) : new Color(207, 159, 160, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 53, 55, 255)) : new Color(160, 53, 55, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(54.0f, 32.3f);
generalPath.curveTo(54.0f, 34.8f, 45.9f, 36.8f, 36.0f, 36.8f);
generalPath.curveTo(26.099998f, 36.8f, 18.0f, 34.8f, 18.0f, 32.3f);
generalPath.curveTo(18.0f, 29.8f, 26.1f, 27.8f, 36.0f, 27.8f);
generalPath.curveTo(45.9f, 27.8f, 54.0f, 29.8f, 54.0f, 32.3f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(242, 242, 242, 255)) : new Color(242, 242, 242, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.5f, 31.9f);
generalPath.curveTo(49.5f, 34.1f, 43.5f, 35.8f, 36.0f, 35.8f);
generalPath.curveTo(28.5f, 35.8f, 22.5f, 34.1f, 22.5f, 31.9f);
generalPath.curveTo(22.5f, 29.7f, 28.5f, 28.0f, 36.0f, 28.0f);
generalPath.curveTo(43.5f, 28.1f, 49.5f, 29.8f, 49.5f, 31.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.95400047302246, 63.00400161743164), new Point2D.Double(43.0099983215332, 77.05999755859375), new float[] {0.0f,0.637f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 238, 255)) : new Color(255, 254, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 159, 160, 255)) : new Color(207, 159, 160, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 53, 55, 255)) : new Color(160, 53, 55, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.0f, 32.6f);
generalPath.lineTo(18.0f, 43.8f);
generalPath.curveTo(18.0f, 43.8f, 22.5f, 48.3f, 36.0f, 48.3f);
generalPath.curveTo(49.5f, 48.3f, 54.0f, 43.8f, 54.0f, 43.8f);
generalPath.lineTo(54.0f, 32.6f);
generalPath.curveTo(54.0f, 32.6f, 51.8f, 36.5f, 36.0f, 36.8f);
generalPath.curveTo(20.2f, 37.1f, 18.0f, 32.6f, 18.0f, 32.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0, 61.599998474121094), new Point2D.Double(54.0, 61.599998474121094), new float[] {0.0f,0.637f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 238, 255)) : new Color(255, 254, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 159, 160, 255)) : new Color(207, 159, 160, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 53, 55, 255)) : new Color(160, 53, 55, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(54.0f, 16.6f);
generalPath.curveTo(54.0f, 19.1f, 45.9f, 21.1f, 36.0f, 21.1f);
generalPath.curveTo(26.099998f, 21.1f, 18.0f, 19.1f, 18.0f, 16.6f);
generalPath.curveTo(18.0f, 14.1f, 26.1f, 12.1f, 36.0f, 12.1f);
generalPath.curveTo(45.9f, 12.1f, 54.0f, 14.1f, 54.0f, 16.6f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.5f, 16.3f);
generalPath.curveTo(49.5f, 18.5f, 43.5f, 20.199999f, 36.0f, 20.199999f);
generalPath.curveTo(28.5f, 20.199999f, 22.5f, 18.499998f, 22.5f, 16.3f);
generalPath.curveTo(22.5f, 14.1f, 28.5f, 12.4f, 36.0f, 12.4f);
generalPath.curveTo(43.5f, 12.4f, 49.5f, 14.099999f, 49.5f, 16.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 78.72200012207031), new Point2D.Double(43.02799987792969, 92.77799987792969), new float[] {0.0f,0.637f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 238, 255)) : new Color(255, 254, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 159, 160, 255)) : new Color(207, 159, 160, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 53, 55, 255)) : new Color(160, 53, 55, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_11
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.0f, 16.8f);
generalPath.lineTo(18.0f, 28.0f);
generalPath.curveTo(18.0f, 28.0f, 22.5f, 32.5f, 36.0f, 32.5f);
generalPath.curveTo(49.5f, 32.5f, 54.0f, 28.0f, 54.0f, 28.0f);
generalPath.lineTo(54.0f, 16.8f);
generalPath.curveTo(54.0f, 16.8f, 51.8f, 20.699999f, 36.0f, 21.0f);
generalPath.curveTo(20.2f, 21.3f, 18.0f, 16.8f, 18.0f, 16.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0, 77.4000015258789), new Point2D.Double(54.0, 77.4000015258789), new float[] {0.0f,0.637f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 238, 255)) : new Color(255, 254, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 159, 160, 255)) : new Color(207, 159, 160, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 53, 55, 255)) : new Color(160, 53, 55, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.178001403808594, 74.15899658203125), new Point2D.Double(58.77199935913086, 87.75299835205078), new float[] {0.0f,0.637f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 238, 255)) : new Color(255, 254, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 159, 160, 255)) : new Color(207, 159, 160, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 53, 55, 255)) : new Color(160, 53, 55, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_13
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.1f, 1.0f);
generalPath.lineTo(71.3f, 27.7f);
generalPath.lineTo(44.1f, 27.7f);
generalPath.lineTo(44.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 53, 55, 255)) : new Color(160, 53, 55, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.1f, 1.0f);
generalPath.lineTo(71.3f, 27.7f);
generalPath.lineTo(44.1f, 27.7f);
generalPath.lineTo(44.1f, 1.0f);
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
        return 0.12799999117851257;
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
		return 0.7450000047683716;
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
	private ext_mdb() {
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
       ext_mdb base = new ext_mdb();
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
       ext_mdb base = new ext_mdb();
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
        return ext_mdb::new;
    }
}

