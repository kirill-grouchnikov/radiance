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
public class ext_rdf implements NeonIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
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
generalPath.moveTo(12.0f, 44.7f);
generalPath.lineTo(26.0f, 32.6f);
generalPath.lineTo(26.0f, 38.699997f);
generalPath.lineTo(16.5f, 46.6f);
generalPath.lineTo(16.5f, 46.699997f);
generalPath.lineTo(26.0f, 54.6f);
generalPath.lineTo(26.0f, 60.699997f);
generalPath.lineTo(12.0f, 48.699997f);
generalPath.lineTo(12.0f, 44.699997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(19.013999938964844, 60.792999267578125), new Point2D.Double(19.013999938964844, 32.60300064086914), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 185, 201, 255)) : new Color(154, 185, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(112, 143, 159, 255)) : new Color(112, 143, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(86, 118, 133, 255)) : new Color(86, 118, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(19.013999938964844, 62.979000091552734), new Point2D.Double(19.013999938964844, 30.417999267578125), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 185, 201, 255)) : new Color(154, 185, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(112, 143, 159, 255)) : new Color(112, 143, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(86, 118, 133, 255)) : new Color(86, 118, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(12.0f, 44.7f);
generalPath.lineTo(26.0f, 32.6f);
generalPath.lineTo(26.0f, 38.699997f);
generalPath.lineTo(16.5f, 46.6f);
generalPath.lineTo(16.5f, 46.699997f);
generalPath.lineTo(26.0f, 54.6f);
generalPath.lineTo(26.0f, 60.699997f);
generalPath.lineTo(12.0f, 48.699997f);
generalPath.lineTo(12.0f, 44.699997f);
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
generalPath.moveTo(38.4f, 29.5f);
generalPath.lineTo(42.100002f, 29.5f);
generalPath.lineTo(34.9f, 64.5f);
generalPath.lineTo(31.300001f, 64.5f);
generalPath.lineTo(38.4f, 29.5f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.68600082397461, 64.5), new Point2D.Double(36.68600082397461, 29.5), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 185, 201, 255)) : new Color(154, 185, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(112, 143, 159, 255)) : new Color(112, 143, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(86, 118, 133, 255)) : new Color(86, 118, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.6879997253418, 65.5), new Point2D.Double(36.6879997253418, 28.5), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 185, 201, 255)) : new Color(154, 185, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(112, 143, 159, 255)) : new Color(112, 143, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(86, 118, 133, 255)) : new Color(86, 118, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.4f, 29.5f);
generalPath.lineTo(42.100002f, 29.5f);
generalPath.lineTo(34.9f, 64.5f);
generalPath.lineTo(31.300001f, 64.5f);
generalPath.lineTo(38.4f, 29.5f);
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
generalPath.moveTo(47.2f, 54.8f);
generalPath.lineTo(56.7f, 46.899998f);
generalPath.lineTo(56.7f, 46.8f);
generalPath.lineTo(47.2f, 38.899998f);
generalPath.lineTo(47.2f, 32.8f);
generalPath.lineTo(61.2f, 44.9f);
generalPath.lineTo(61.2f, 49.0f);
generalPath.lineTo(47.2f, 61.1f);
generalPath.lineTo(47.2f, 54.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(54.18600082397461, 61.051998138427734), new Point2D.Double(54.18600082397461, 32.689998626708984), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 185, 201, 255)) : new Color(154, 185, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(112, 143, 159, 255)) : new Color(112, 143, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(86, 118, 133, 255)) : new Color(86, 118, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(54.18600082397461, 63.237998962402344), new Point2D.Double(54.18600082397461, 30.503999710083008), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 185, 201, 255)) : new Color(154, 185, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(112, 143, 159, 255)) : new Color(112, 143, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(86, 118, 133, 255)) : new Color(86, 118, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(47.2f, 54.8f);
generalPath.lineTo(56.7f, 46.899998f);
generalPath.lineTo(56.7f, 46.8f);
generalPath.lineTo(47.2f, 38.899998f);
generalPath.lineTo(47.2f, 32.8f);
generalPath.lineTo(61.2f, 44.9f);
generalPath.lineTo(61.2f, 49.0f);
generalPath.lineTo(47.2f, 61.1f);
generalPath.lineTo(47.2f, 54.8f);
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
generalPath.moveTo(10.2f, 91.5f);
generalPath.lineTo(10.2f, 72.2f);
generalPath.lineTo(18.5f, 72.2f);
generalPath.curveTo(20.6f, 72.2f, 22.1f, 72.399994f, 23.0f, 72.7f);
generalPath.curveTo(23.9f, 73.0f, 24.7f, 73.7f, 25.3f, 74.6f);
generalPath.curveTo(25.899998f, 75.5f, 26.199999f, 76.5f, 26.199999f, 77.6f);
generalPath.curveTo(26.199999f, 79.0f, 25.8f, 80.2f, 24.9f, 81.2f);
generalPath.curveTo(24.0f, 82.2f, 22.7f, 82.8f, 21.0f, 83.0f);
generalPath.curveTo(21.9f, 83.5f, 22.6f, 84.0f, 23.1f, 84.6f);
generalPath.curveTo(23.7f, 85.2f, 24.4f, 86.2f, 25.300001f, 87.7f);
generalPath.lineTo(27.7f, 91.5f);
generalPath.lineTo(23.0f, 91.5f);
generalPath.lineTo(20.1f, 87.3f);
generalPath.curveTo(19.1f, 85.8f, 18.4f, 84.8f, 18.0f, 84.5f);
generalPath.curveTo(17.6f, 84.1f, 17.2f, 83.8f, 16.8f, 83.7f);
generalPath.curveTo(16.4f, 83.6f, 15.699999f, 83.5f, 14.799999f, 83.5f);
generalPath.lineTo(14.0f, 83.5f);
generalPath.lineTo(14.0f, 91.6f);
generalPath.lineTo(10.2f, 91.6f);
generalPath.closePath();
generalPath.moveTo(14.1f, 80.4f);
generalPath.lineTo(17.0f, 80.4f);
generalPath.curveTo(18.9f, 80.4f, 20.1f, 80.3f, 20.5f, 80.200005f);
generalPath.curveTo(20.9f, 80.100006f, 21.3f, 79.8f, 21.6f, 79.4f);
generalPath.curveTo(21.9f, 79.0f, 22.0f, 78.5f, 22.0f, 77.9f);
generalPath.curveTo(22.0f, 77.200005f, 21.8f, 76.700005f, 21.5f, 76.3f);
generalPath.curveTo(21.1f, 75.9f, 20.7f, 75.600006f, 20.0f, 75.5f);
generalPath.curveTo(19.7f, 75.5f, 18.7f, 75.4f, 17.1f, 75.4f);
generalPath.lineTo(14.0f, 75.4f);
generalPath.lineTo(14.0f, 80.4f);
generalPath.closePath();
generalPath.moveTo(29.900002f, 72.200005f);
generalPath.lineTo(37.100002f, 72.200005f);
generalPath.curveTo(38.7f, 72.200005f, 40.000004f, 72.3f, 40.800003f, 72.600006f);
generalPath.curveTo(41.9f, 72.90001f, 42.9f, 73.50001f, 43.700005f, 74.40001f);
generalPath.curveTo(44.500008f, 75.30001f, 45.100006f, 76.30001f, 45.600006f, 77.50001f);
generalPath.curveTo(46.000008f, 78.700005f, 46.200005f, 80.30001f, 46.200005f, 82.100006f);
generalPath.curveTo(46.200005f, 83.700005f, 46.000004f, 85.100006f, 45.600006f, 86.200005f);
generalPath.curveTo(45.100006f, 87.600006f, 44.400005f, 88.700005f, 43.500008f, 89.600006f);
generalPath.curveTo(42.800007f, 90.3f, 41.90001f, 90.8f, 40.70001f, 91.100006f);
generalPath.curveTo(39.800007f, 91.40001f, 38.70001f, 91.50001f, 37.20001f, 91.50001f);
generalPath.lineTo(29.800009f, 91.50001f);
generalPath.lineTo(29.800009f, 72.2f);
generalPath.closePath();
generalPath.moveTo(33.800003f, 75.50001f);
generalPath.lineTo(33.800003f, 88.30001f);
generalPath.lineTo(36.700005f, 88.30001f);
generalPath.curveTo(37.800003f, 88.30001f, 38.600006f, 88.20001f, 39.100006f, 88.10001f);
generalPath.curveTo(39.700005f, 87.90002f, 40.300007f, 87.70001f, 40.700005f, 87.30001f);
generalPath.curveTo(41.100006f, 86.90001f, 41.500004f, 86.30001f, 41.700005f, 85.40001f);
generalPath.curveTo(42.000004f, 84.50001f, 42.100006f, 83.40001f, 42.100006f, 81.90001f);
generalPath.curveTo(42.100006f, 80.40001f, 42.000008f, 79.30001f, 41.700005f, 78.50001f);
generalPath.curveTo(41.400005f, 77.700005f, 41.100006f, 77.100006f, 40.600006f, 76.600006f);
generalPath.curveTo(40.100006f, 76.200005f, 39.500008f, 75.8f, 38.800007f, 75.700005f);
generalPath.curveTo(38.20001f, 75.600006f, 37.20001f, 75.50001f, 35.600006f, 75.50001f);
generalPath.lineTo(33.800007f, 75.50001f);
generalPath.closePath();
generalPath.moveTo(49.600002f, 91.50001f);
generalPath.lineTo(49.600002f, 72.2f);
generalPath.lineTo(63.0f, 72.2f);
generalPath.lineTo(63.0f, 75.5f);
generalPath.lineTo(53.6f, 75.5f);
generalPath.lineTo(53.6f, 80.1f);
generalPath.lineTo(61.8f, 80.1f);
generalPath.lineTo(61.8f, 83.4f);
generalPath.lineTo(53.6f, 83.4f);
generalPath.lineTo(53.6f, 91.6f);
generalPath.lineTo(49.6f, 91.6f);
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
	private ext_rdf() {
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
       ext_rdf base = new ext_rdf();
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
       ext_rdf base = new ext_rdf();
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
        return ext_rdf::new;
    }
}

