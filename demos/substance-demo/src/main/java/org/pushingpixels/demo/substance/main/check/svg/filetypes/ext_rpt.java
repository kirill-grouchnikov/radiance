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
public class ext_rpt implements NeonIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
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
generalPath.moveTo(31.9f, 18.0f);
generalPath.curveTo(31.4f, 18.0f, 30.9f, 18.4f, 30.699999f, 18.8f);
generalPath.lineTo(29.499998f, 21.099998f);
generalPath.lineTo(21.0f, 21.099998f);
generalPath.curveTo(20.2f, 21.099998f, 19.4f, 21.8f, 19.4f, 22.599998f);
generalPath.curveTo(19.3f, 35.8f, 19.6f, 49.0f, 19.4f, 62.199997f);
generalPath.curveTo(19.4f, 63.1f, 20.1f, 63.899998f, 21.0f, 63.899998f);
generalPath.lineTo(51.1f, 63.899998f);
generalPath.curveTo(51.899998f, 63.899998f, 52.699997f, 63.1f, 52.699997f, 62.3f);
generalPath.lineTo(52.699997f, 22.7f);
generalPath.curveTo(52.699997f, 21.900002f, 51.899998f, 21.1f, 51.1f, 21.1f);
generalPath.lineTo(42.6f, 21.1f);
generalPath.lineTo(41.399998f, 18.800001f);
generalPath.curveTo(41.1f, 18.300001f, 40.6f, 18.000002f, 39.999996f, 18.000002f);
generalPath.lineTo(31.899996f, 18.000002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 64.0), new Point2D.Double(36.0, 18.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.0, 64.5), new Point2D.Double(36.0, 17.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(31.9f, 18.0f);
generalPath.curveTo(31.4f, 18.0f, 30.9f, 18.4f, 30.699999f, 18.8f);
generalPath.lineTo(29.499998f, 21.099998f);
generalPath.lineTo(21.0f, 21.099998f);
generalPath.curveTo(20.2f, 21.099998f, 19.4f, 21.8f, 19.4f, 22.599998f);
generalPath.curveTo(19.3f, 35.8f, 19.6f, 49.0f, 19.4f, 62.199997f);
generalPath.curveTo(19.4f, 63.1f, 20.1f, 63.899998f, 21.0f, 63.899998f);
generalPath.lineTo(51.1f, 63.899998f);
generalPath.curveTo(51.899998f, 63.899998f, 52.699997f, 63.1f, 52.699997f, 62.3f);
generalPath.lineTo(52.699997f, 22.7f);
generalPath.curveTo(52.699997f, 21.900002f, 51.899998f, 21.1f, 51.1f, 21.1f);
generalPath.lineTo(42.6f, 21.1f);
generalPath.lineTo(41.399998f, 18.800001f);
generalPath.curveTo(41.1f, 18.300001f, 40.6f, 18.000002f, 39.999996f, 18.000002f);
generalPath.lineTo(31.899996f, 18.000002f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(22.5f, 24.4f);
generalPath.lineTo(28.1f, 24.4f);
generalPath.curveTo(28.1f, 26.0f, 28.300001f, 27.5f, 29.7f, 27.5f);
generalPath.lineTo(42.4f, 27.5f);
generalPath.curveTo(44.0f, 27.5f, 44.0f, 25.9f, 44.0f, 24.4f);
generalPath.lineTo(49.6f, 24.4f);
generalPath.lineTo(49.6f, 60.800003f);
generalPath.lineTo(22.599998f, 60.800003f);
generalPath.curveTo(22.599998f, 48.700005f, 22.599998f, 36.500004f, 22.499998f, 24.400002f);
generalPath.closePath();
shape = generalPath;
paint = new Color(247, 248, 250, 255);
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
generalPath.moveTo(26.5f, 33.1f);
generalPath.lineTo(45.5f, 33.1f);
generalPath.lineTo(45.5f, 36.3f);
generalPath.lineTo(26.5f, 36.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.500999450683594, 34.64899826049805), new Point2D.Double(45.525001525878906, 34.64899826049805), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(26.5f, 39.4f);
generalPath.lineTo(45.5f, 39.4f);
generalPath.lineTo(45.5f, 42.600002f);
generalPath.lineTo(26.5f, 42.600002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.500999450683594, 41.0), new Point2D.Double(45.525001525878906, 41.0), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(26.5f, 45.8f);
generalPath.lineTo(45.5f, 45.8f);
generalPath.lineTo(45.5f, 48.899998f);
generalPath.lineTo(26.5f, 48.899998f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.500999450683594, 47.33700180053711), new Point2D.Double(45.525001525878906, 47.33700180053711), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(26.5f, 52.1f);
generalPath.lineTo(39.2f, 52.1f);
generalPath.lineTo(39.2f, 55.3f);
generalPath.lineTo(26.5f, 55.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.500999450683594, 53.67300033569336), new Point2D.Double(39.20199966430664, 53.67300033569336), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
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
// _0_10
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(10.1f, 91.9f);
generalPath.lineTo(10.1f, 71.9f);
generalPath.lineTo(18.6f, 71.9f);
generalPath.curveTo(20.7f, 71.9f, 22.300001f, 72.1f, 23.3f, 72.4f);
generalPath.curveTo(24.299997f, 72.700005f, 25.0f, 73.4f, 25.599998f, 74.3f);
generalPath.curveTo(26.199999f, 75.200005f, 26.499998f, 76.3f, 26.499998f, 77.5f);
generalPath.curveTo(26.499998f, 79.0f, 26.099998f, 80.2f, 25.199999f, 81.2f);
generalPath.curveTo(24.3f, 82.2f, 22.999998f, 82.799995f, 21.199999f, 83.1f);
generalPath.curveTo(22.099998f, 83.6f, 22.8f, 84.2f, 23.4f, 84.799995f);
generalPath.curveTo(24.0f, 85.399994f, 24.699999f, 86.49999f, 25.699999f, 88.1f);
generalPath.lineTo(28.099998f, 92.0f);
generalPath.lineTo(23.3f, 92.0f);
generalPath.lineTo(20.4f, 87.6f);
generalPath.curveTo(19.4f, 86.0f, 18.6f, 85.1f, 18.3f, 84.7f);
generalPath.curveTo(17.999998f, 84.299995f, 17.5f, 84.0f, 17.099998f, 83.899994f);
generalPath.curveTo(16.699999f, 83.7f, 15.999998f, 83.7f, 15.099998f, 83.7f);
generalPath.lineTo(14.299998f, 83.7f);
generalPath.lineTo(14.299998f, 92.1f);
generalPath.lineTo(10.099998f, 92.1f);
generalPath.closePath();
generalPath.moveTo(14.1f, 80.3f);
generalPath.lineTo(17.1f, 80.3f);
generalPath.curveTo(19.0f, 80.3f, 20.300001f, 80.200005f, 20.7f, 80.100006f);
generalPath.curveTo(21.2f, 79.90001f, 21.6f, 79.700005f, 21.800001f, 79.3f);
generalPath.curveTo(22.000002f, 78.9f, 22.2f, 78.4f, 22.2f, 77.8f);
generalPath.curveTo(22.2f, 77.100006f, 22.0f, 76.600006f, 21.7f, 76.200005f);
generalPath.curveTo(21.300001f, 75.8f, 20.800001f, 75.50001f, 20.2f, 75.4f);
generalPath.curveTo(19.900002f, 75.4f, 18.900002f, 75.3f, 17.2f, 75.3f);
generalPath.lineTo(14.0f, 75.3f);
generalPath.lineTo(14.0f, 80.3f);
generalPath.closePath();
generalPath.moveTo(30.300001f, 91.9f);
generalPath.lineTo(30.300001f, 71.9f);
generalPath.lineTo(36.800003f, 71.9f);
generalPath.curveTo(39.300003f, 71.9f, 40.9f, 72.0f, 41.600002f, 72.200005f);
generalPath.curveTo(42.7f, 72.50001f, 43.7f, 73.200005f, 44.500004f, 74.200005f);
generalPath.curveTo(45.300003f, 75.200005f, 45.700005f, 76.50001f, 45.700005f, 78.100006f);
generalPath.curveTo(45.700005f, 79.3f, 45.500004f, 80.40001f, 45.000004f, 81.200005f);
generalPath.curveTo(44.600002f, 82.00001f, 44.000004f, 82.700005f, 43.300003f, 83.200005f);
generalPath.curveTo(42.600002f, 83.700005f, 41.9f, 84.00001f, 41.200005f, 84.200005f);
generalPath.curveTo(40.200005f, 84.4f, 38.800003f, 84.50001f, 37.000004f, 84.50001f);
generalPath.lineTo(34.400005f, 84.50001f);
generalPath.lineTo(34.400005f, 92.100006f);
generalPath.lineTo(30.300005f, 92.100006f);
generalPath.closePath();
generalPath.moveTo(34.300003f, 75.2f);
generalPath.lineTo(34.300003f, 80.899994f);
generalPath.lineTo(36.500004f, 80.899994f);
generalPath.curveTo(38.100002f, 80.899994f, 39.200005f, 80.799995f, 39.700005f, 80.59999f);
generalPath.curveTo(40.200005f, 80.399994f, 40.700005f, 80.09999f, 41.000004f, 79.59999f);
generalPath.curveTo(41.300003f, 79.19999f, 41.500004f, 78.59999f, 41.500004f, 77.99999f);
generalPath.curveTo(41.500004f, 77.299995f, 41.300003f, 76.69999f, 40.900005f, 76.19999f);
generalPath.curveTo(40.500004f, 75.69999f, 39.900005f, 75.39999f, 39.300007f, 75.29999f);
generalPath.curveTo(38.800007f, 75.19999f, 37.800007f, 75.19999f, 36.400005f, 75.19999f);
generalPath.lineTo(34.300007f, 75.19999f);
generalPath.closePath();
generalPath.moveTo(53.4f, 91.899994f);
generalPath.lineTo(53.4f, 75.2f);
generalPath.lineTo(47.5f, 75.2f);
generalPath.lineTo(47.5f, 71.799995f);
generalPath.lineTo(63.4f, 71.799995f);
generalPath.lineTo(63.4f, 75.2f);
generalPath.lineTo(57.5f, 75.2f);
generalPath.lineTo(57.5f, 91.899994f);
generalPath.lineTo(53.4f, 91.899994f);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_rpt() {
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
       ext_rpt base = new ext_rpt();
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
       ext_rpt base = new ext_rpt();
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
        return ext_rpt::new;
    }
}

