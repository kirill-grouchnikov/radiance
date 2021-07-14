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

import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.neon.api.icon.NeonIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_pdb implements NeonIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.953000068664551), new Point2D.Double(36.0, 100.94999694824219), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(9.4f, 91.1f);
generalPath.lineTo(9.4f, 71.8f);
generalPath.lineTo(15.7f, 71.8f);
generalPath.curveTo(18.1f, 71.8f, 19.7f, 71.9f, 20.4f, 72.100006f);
generalPath.curveTo(21.5f, 72.40001f, 22.5f, 73.00001f, 23.199999f, 74.00001f);
generalPath.curveTo(23.999998f, 75.00001f, 24.3f, 76.200005f, 24.3f, 77.80001f);
generalPath.curveTo(24.3f, 79.00001f, 24.099998f, 80.00001f, 23.599998f, 80.80001f);
generalPath.curveTo(23.099998f, 81.60001f, 22.599998f, 82.20001f, 21.899998f, 82.70001f);
generalPath.curveTo(21.199997f, 83.20001f, 20.499998f, 83.500015f, 19.899998f, 83.60001f);
generalPath.curveTo(18.999998f, 83.80001f, 17.599998f, 83.90002f, 15.799997f, 83.90002f);
generalPath.lineTo(13.199997f, 83.90002f);
generalPath.lineTo(13.199997f, 91.20002f);
generalPath.lineTo(9.4f, 91.20002f);
generalPath.closePath();
generalPath.moveTo(13.299999f, 75.1f);
generalPath.lineTo(13.299999f, 80.6f);
generalPath.lineTo(15.499999f, 80.6f);
generalPath.curveTo(17.099998f, 80.6f, 18.099998f, 80.5f, 18.599998f, 80.299995f);
generalPath.curveTo(19.099998f, 80.1f, 19.499998f, 79.799995f, 19.8f, 79.399994f);
generalPath.curveTo(20.099998f, 78.99999f, 20.199999f, 78.49999f, 20.199999f, 77.899994f);
generalPath.curveTo(20.199999f, 77.2f, 19.999998f, 76.59999f, 19.599998f, 76.2f);
generalPath.curveTo(19.199999f, 75.8f, 18.699999f, 75.5f, 17.999998f, 75.299995f);
generalPath.curveTo(17.499998f, 75.2f, 16.599998f, 75.2f, 15.199998f, 75.2f);
generalPath.lineTo(13.299998f, 75.2f);
generalPath.closePath();
generalPath.moveTo(27.599998f, 71.799995f);
generalPath.lineTo(34.8f, 71.799995f);
generalPath.curveTo(36.399998f, 71.799995f, 37.7f, 71.899994f, 38.5f, 72.2f);
generalPath.curveTo(39.6f, 72.5f, 40.6f, 73.1f, 41.4f, 74.0f);
generalPath.curveTo(42.2f, 74.9f, 42.800003f, 75.9f, 43.300003f, 77.1f);
generalPath.curveTo(43.700005f, 78.299995f, 43.9f, 79.9f, 43.9f, 81.7f);
generalPath.curveTo(43.9f, 83.299995f, 43.7f, 84.7f, 43.300003f, 85.799995f);
generalPath.curveTo(42.800003f, 87.2f, 42.100002f, 88.299995f, 41.200005f, 89.2f);
generalPath.curveTo(40.500004f, 89.899994f, 39.600006f, 90.399994f, 38.400005f, 90.7f);
generalPath.curveTo(37.500004f, 91.0f, 36.400005f, 91.1f, 34.900005f, 91.1f);
generalPath.lineTo(27.500006f, 91.1f);
generalPath.lineTo(27.500006f, 71.8f);
generalPath.closePath();
generalPath.moveTo(31.499998f, 75.1f);
generalPath.lineTo(31.499998f, 87.9f);
generalPath.lineTo(34.399998f, 87.9f);
generalPath.curveTo(35.499996f, 87.9f, 36.3f, 87.8f, 36.8f, 87.700005f);
generalPath.curveTo(37.399998f, 87.50001f, 38.0f, 87.3f, 38.399998f, 86.9f);
generalPath.curveTo(38.799995f, 86.5f, 39.199997f, 85.9f, 39.399998f, 85.0f);
generalPath.curveTo(39.699997f, 84.1f, 39.8f, 83.0f, 39.8f, 81.5f);
generalPath.curveTo(39.8f, 80.0f, 39.7f, 78.9f, 39.399998f, 78.1f);
generalPath.curveTo(39.1f, 77.299995f, 38.8f, 76.7f, 38.3f, 76.2f);
generalPath.curveTo(37.8f, 75.799995f, 37.2f, 75.399994f, 36.5f, 75.299995f);
generalPath.curveTo(35.9f, 75.2f, 34.9f, 75.1f, 33.3f, 75.1f);
generalPath.lineTo(31.5f, 75.1f);
generalPath.closePath();
generalPath.moveTo(47.3f, 71.799995f);
generalPath.lineTo(55.1f, 71.799995f);
generalPath.curveTo(56.6f, 71.799995f, 57.8f, 71.899994f, 58.6f, 71.99999f);
generalPath.curveTo(59.399998f, 72.09999f, 60.0f, 72.399994f, 60.6f, 72.799995f);
generalPath.curveTo(61.199997f, 73.2f, 61.699997f, 73.7f, 62.1f, 74.399994f);
generalPath.curveTo(62.5f, 75.09999f, 62.699997f, 75.799995f, 62.699997f, 76.7f);
generalPath.curveTo(62.699997f, 77.6f, 62.499996f, 78.399994f, 61.999996f, 79.2f);
generalPath.curveTo(61.499996f, 80.0f, 60.799995f, 80.5f, 59.999996f, 80.899994f);
generalPath.curveTo(61.199997f, 81.2f, 62.099995f, 81.799995f, 62.699997f, 82.7f);
generalPath.curveTo(63.3f, 83.6f, 63.699997f, 84.5f, 63.699997f, 85.6f);
generalPath.curveTo(63.699997f, 86.5f, 63.499996f, 87.299995f, 63.1f, 88.2f);
generalPath.curveTo(62.699997f, 89.0f, 62.1f, 89.7f, 61.399998f, 90.2f);
generalPath.curveTo(60.699997f, 90.7f, 59.8f, 91.0f, 58.8f, 91.1f);
generalPath.curveTo(58.1f, 91.2f, 56.6f, 91.2f, 54.0f, 91.2f);
generalPath.lineTo(47.4f, 91.2f);
generalPath.lineTo(47.4f, 71.8f);
generalPath.closePath();
generalPath.moveTo(51.2f, 74.99999f);
generalPath.lineTo(51.2f, 79.49999f);
generalPath.lineTo(53.8f, 79.49999f);
generalPath.curveTo(55.3f, 79.49999f, 56.3f, 79.49999f, 56.7f, 79.399994f);
generalPath.curveTo(57.4f, 79.299995f, 57.9f, 79.09999f, 58.3f, 78.7f);
generalPath.curveTo(58.7f, 78.299995f, 58.899998f, 77.799995f, 58.899998f, 77.2f);
generalPath.curveTo(58.899998f, 76.6f, 58.699997f, 76.1f, 58.399998f, 75.7f);
generalPath.curveTo(58.1f, 75.299995f, 57.6f, 75.1f, 56.899998f, 75.0f);
generalPath.curveTo(56.499996f, 75.0f, 55.399998f, 74.9f, 53.499996f, 74.9f);
generalPath.lineTo(51.199997f, 74.9f);
generalPath.closePath();
generalPath.moveTo(51.2f, 82.69999f);
generalPath.lineTo(51.2f, 87.89999f);
generalPath.lineTo(54.8f, 87.89999f);
generalPath.curveTo(56.2f, 87.89999f, 57.1f, 87.89999f, 57.5f, 87.79999f);
generalPath.curveTo(58.1f, 87.69999f, 58.6f, 87.39999f, 58.9f, 86.999985f);
generalPath.curveTo(59.300003f, 86.59998f, 59.5f, 85.999985f, 59.5f, 85.39999f);
generalPath.curveTo(59.5f, 84.79999f, 59.4f, 84.29999f, 59.1f, 83.89999f);
generalPath.curveTo(58.799995f, 83.499985f, 58.399998f, 83.19999f, 57.899998f, 82.999985f);
generalPath.curveTo(57.399998f, 82.79998f, 56.199997f, 82.69998f, 54.399998f, 82.69998f);
generalPath.lineTo(51.199997f, 82.69998f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 47.22200012207031), new Point2D.Double(43.02799987792969, 61.27799987792969), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(180, 204, 216, 255)) : new Color(180, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(125, 160, 177, 255)) : new Color(125, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(79, 122, 141, 255)) : new Color(79, 122, 141, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(18.0, 45.900001525878906), new Point2D.Double(54.0, 45.900001525878906), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(180, 204, 216, 255)) : new Color(180, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(125, 160, 177, 255)) : new Color(125, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(79, 122, 141, 255)) : new Color(79, 122, 141, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(28.95400047302246, 63.00400161743164), new Point2D.Double(43.0099983215332, 77.05999755859375), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(180, 204, 216, 255)) : new Color(180, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(125, 160, 177, 255)) : new Color(125, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(79, 122, 141, 255)) : new Color(79, 122, 141, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(18.0, 61.599998474121094), new Point2D.Double(54.0, 61.599998474121094), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(180, 204, 216, 255)) : new Color(180, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(125, 160, 177, 255)) : new Color(125, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(79, 122, 141, 255)) : new Color(79, 122, 141, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 78.72200012207031), new Point2D.Double(43.02799987792969, 92.77799987792969), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(18.0, 77.4000015258789), new Point2D.Double(54.0, 77.4000015258789), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(204, 221, 231, 255)) : new Color(204, 221, 231, 255)),((colorFilter != null) ? colorFilter.filter(new Color(181, 204, 216, 255)) : new Color(181, 204, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 160, 177, 255)) : new Color(127, 160, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(106, 143, 161, 255)) : new Color(106, 143, 161, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.06800079345703, 74.15499877929688), new Point2D.Double(58.56800079345703, 87.65499877929688), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
	private ext_pdb() {
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
       ext_pdb base = new ext_pdb();
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
       ext_pdb base = new ext_pdb();
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
        return ext_pdb::new;
    }
}

