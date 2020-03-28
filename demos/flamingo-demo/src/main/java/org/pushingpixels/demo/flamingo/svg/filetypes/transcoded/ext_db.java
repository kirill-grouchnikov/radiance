package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_db implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.953000068664551), new Point2D.Double(36.0, 100.94999694824219), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(18.0f, 71.3f);
generalPath.lineTo(25.4f, 71.3f);
generalPath.curveTo(27.1f, 71.3f, 28.3f, 71.4f, 29.199999f, 71.700005f);
generalPath.curveTo(30.4f, 72.00001f, 31.4f, 72.700005f, 32.199997f, 73.50001f);
generalPath.curveTo(32.999996f, 74.40001f, 33.699997f, 75.40001f, 34.1f, 76.700005f);
generalPath.curveTo(34.5f, 78.0f, 34.8f, 79.50001f, 34.8f, 81.4f);
generalPath.curveTo(34.8f, 83.0f, 34.6f, 84.4f, 34.2f, 85.6f);
generalPath.curveTo(33.7f, 87.0f, 33.0f, 88.2f, 32.100002f, 89.1f);
generalPath.curveTo(31.400002f, 89.799995f, 30.500002f, 90.299995f, 29.300003f, 90.7f);
generalPath.curveTo(28.400003f, 91.0f, 27.200003f, 91.1f, 25.700003f, 91.1f);
generalPath.lineTo(18.0f, 91.1f);
generalPath.lineTo(18.0f, 71.3f);
generalPath.closePath();
generalPath.moveTo(22.0f, 74.600006f);
generalPath.lineTo(22.0f, 87.700005f);
generalPath.lineTo(25.0f, 87.700005f);
generalPath.curveTo(26.1f, 87.700005f, 26.9f, 87.600006f, 27.4f, 87.50001f);
generalPath.curveTo(28.1f, 87.30001f, 28.6f, 87.100006f, 29.0f, 86.700005f);
generalPath.curveTo(29.4f, 86.3f, 29.8f, 85.700005f, 30.1f, 84.8f);
generalPath.curveTo(30.400002f, 83.9f, 30.5f, 82.700005f, 30.5f, 81.200005f);
generalPath.curveTo(30.5f, 79.700005f, 30.4f, 78.50001f, 30.1f, 77.700005f);
generalPath.curveTo(29.800001f, 76.9f, 29.4f, 76.200005f, 29.0f, 75.8f);
generalPath.curveTo(28.6f, 75.4f, 27.9f, 75.0f, 27.1f, 74.9f);
generalPath.curveTo(26.5f, 74.8f, 25.4f, 74.700005f, 23.800001f, 74.700005f);
generalPath.lineTo(22.0f, 74.700005f);
generalPath.closePath();
generalPath.moveTo(38.2f, 71.3f);
generalPath.lineTo(46.2f, 71.3f);
generalPath.curveTo(47.8f, 71.3f, 49.0f, 71.4f, 49.7f, 71.5f);
generalPath.curveTo(50.4f, 71.6f, 51.2f, 71.9f, 51.8f, 72.3f);
generalPath.curveTo(52.399998f, 72.700005f, 52.899998f, 73.3f, 53.3f, 74.0f);
generalPath.curveTo(53.7f, 74.7f, 53.899998f, 75.5f, 53.899998f, 76.3f);
generalPath.curveTo(53.899998f, 77.200005f, 53.6f, 78.100006f, 53.1f, 78.9f);
generalPath.curveTo(52.6f, 79.7f, 51.899998f, 80.3f, 51.0f, 80.6f);
generalPath.curveTo(52.2f, 81.0f, 53.2f, 81.6f, 53.8f, 82.4f);
generalPath.curveTo(54.5f, 83.200005f, 54.8f, 84.200005f, 54.8f, 85.4f);
generalPath.curveTo(54.8f, 86.3f, 54.6f, 87.200005f, 54.2f, 88.0f);
generalPath.curveTo(53.800003f, 88.799995f, 53.2f, 89.5f, 52.5f, 90.0f);
generalPath.curveTo(51.8f, 90.5f, 50.9f, 90.8f, 49.8f, 90.9f);
generalPath.curveTo(49.1f, 91.0f, 47.5f, 91.0f, 44.899998f, 91.0f);
generalPath.lineTo(38.1f, 91.0f);
generalPath.lineTo(38.1f, 71.3f);
generalPath.closePath();
generalPath.moveTo(42.3f, 74.600006f);
generalPath.lineTo(42.3f, 79.200005f);
generalPath.lineTo(45.0f, 79.200005f);
generalPath.curveTo(46.6f, 79.200005f, 47.6f, 79.200005f, 47.9f, 79.100006f);
generalPath.curveTo(48.600002f, 79.00001f, 49.100002f, 78.8f, 49.5f, 78.40001f);
generalPath.curveTo(49.9f, 78.00001f, 50.1f, 77.50001f, 50.1f, 76.90001f);
generalPath.curveTo(50.1f, 76.30001f, 49.899998f, 75.80001f, 49.6f, 75.40001f);
generalPath.curveTo(49.3f, 75.00001f, 48.8f, 74.80001f, 48.1f, 74.70001f);
generalPath.curveTo(47.699997f, 74.70001f, 46.5f, 74.60001f, 44.6f, 74.60001f);
generalPath.lineTo(42.3f, 74.60001f);
generalPath.closePath();
generalPath.moveTo(42.3f, 82.50001f);
generalPath.lineTo(42.3f, 87.80001f);
generalPath.lineTo(46.0f, 87.80001f);
generalPath.curveTo(47.5f, 87.80001f, 48.4f, 87.80001f, 48.8f, 87.70001f);
generalPath.curveTo(49.399998f, 87.60001f, 49.899998f, 87.30001f, 50.3f, 86.90001f);
generalPath.curveTo(50.7f, 86.50001f, 50.899998f, 85.90001f, 50.899998f, 85.20001f);
generalPath.curveTo(50.899998f, 84.60001f, 50.8f, 84.10001f, 50.499996f, 83.70001f);
generalPath.curveTo(50.199997f, 83.30001f, 49.799995f, 83.000015f, 49.199997f, 82.80001f);
generalPath.curveTo(48.6f, 82.60001f, 47.499996f, 82.50001f, 45.6f, 82.50001f);
generalPath.lineTo(42.3f, 82.50001f);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
paint = new Color(242, 242, 242, 255);
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
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 47.22200012207031), new Point2D.Double(43.02799987792969, 61.27799987792969), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(18.0, 45.900001525878906), new Point2D.Double(54.0, 45.900001525878906), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new Color(242, 242, 242, 255);
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
paint = new LinearGradientPaint(new Point2D.Double(28.95400047302246, 63.00400161743164), new Point2D.Double(43.0099983215332, 77.05999755859375), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(18.0, 61.599998474121094), new Point2D.Double(54.0, 61.599998474121094), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new Color(255, 255, 255, 255);
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
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 78.72200012207031), new Point2D.Double(43.02799987792969, 92.77799987792969), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(18.0, 77.4000015258789), new Point2D.Double(54.0, 77.4000015258789), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.06800079345703, 74.15499877929688), new Point2D.Double(58.56800079345703, 87.65499877929688), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
	private ext_db() {
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
    public static ResizableIcon of(int width, int height) {
       ext_db base = new ext_db();
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_db base = new ext_db();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_db::new;
    }
}

