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
public class ext_accdb implements ResizableIcon {
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(-0.2f, 99.0f);
generalPath.lineTo(-0.2f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0), new Point2D.Double(36.0, 3.003999948501587), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(160, 53, 55, 255);
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
generalPath.moveTo(16.5f, 91.1f);
generalPath.lineTo(13.6f, 91.1f);
generalPath.lineTo(12.5f, 88.2f);
generalPath.lineTo(7.2f, 88.2f);
generalPath.lineTo(6.1f, 91.1f);
generalPath.lineTo(3.3f, 91.1f);
generalPath.lineTo(8.4f, 78.2f);
generalPath.lineTo(11.2f, 78.2f);
generalPath.lineTo(16.5f, 91.1f);
generalPath.closePath();
generalPath.moveTo(11.6f, 86.0f);
generalPath.lineTo(9.8f, 81.2f);
generalPath.lineTo(8.0f, 86.0f);
generalPath.lineTo(11.6f, 86.0f);
generalPath.closePath();
generalPath.moveTo(26.3f, 86.3f);
generalPath.lineTo(28.9f, 87.100006f);
generalPath.curveTo(28.5f, 88.50001f, 27.9f, 89.600006f, 26.9f, 90.200005f);
generalPath.curveTo(26.0f, 90.9f, 24.8f, 91.200005f, 23.4f, 91.200005f);
generalPath.curveTo(21.699999f, 91.200005f, 20.199999f, 90.600006f, 19.099998f, 89.4f);
generalPath.curveTo(17.999998f, 88.200005f, 17.399998f, 86.6f, 17.399998f, 84.6f);
generalPath.curveTo(17.399998f, 82.5f, 17.999998f, 80.799995f, 19.099998f, 79.6f);
generalPath.curveTo(20.199999f, 78.4f, 21.699999f, 77.799995f, 23.499998f, 77.799995f);
generalPath.curveTo(25.099998f, 77.799995f, 26.399998f, 78.299995f, 27.399998f, 79.2f);
generalPath.curveTo(27.999998f, 79.799995f, 28.399998f, 80.5f, 28.699997f, 81.6f);
generalPath.lineTo(26.099997f, 82.2f);
generalPath.curveTo(25.899996f, 81.5f, 25.599997f, 81.0f, 25.099997f, 80.6f);
generalPath.curveTo(24.599997f, 80.2f, 24.0f, 80.0f, 23.3f, 80.0f);
generalPath.curveTo(22.3f, 80.0f, 21.5f, 80.3f, 20.9f, 81.0f);
generalPath.curveTo(20.3f, 81.7f, 20.0f, 82.8f, 20.0f, 84.3f);
generalPath.curveTo(20.0f, 85.9f, 20.3f, 87.100006f, 20.9f, 87.8f);
generalPath.curveTo(21.5f, 88.5f, 22.3f, 88.8f, 23.199999f, 88.8f);
generalPath.curveTo(23.9f, 88.8f, 24.499998f, 88.600006f, 24.999998f, 88.100006f);
generalPath.curveTo(25.699999f, 88.00001f, 25.999998f, 87.3f, 26.299997f, 86.3f);
generalPath.closePath();
generalPath.moveTo(39.5f, 86.3f);
generalPath.lineTo(42.1f, 87.100006f);
generalPath.curveTo(41.699997f, 88.50001f, 41.1f, 89.600006f, 40.1f, 90.200005f);
generalPath.curveTo(39.199997f, 90.9f, 38.0f, 91.200005f, 36.6f, 91.200005f);
generalPath.curveTo(34.899998f, 91.200005f, 33.399998f, 90.600006f, 32.3f, 89.4f);
generalPath.curveTo(31.199999f, 88.200005f, 30.599998f, 86.6f, 30.599998f, 84.6f);
generalPath.curveTo(30.599998f, 82.5f, 31.199999f, 80.799995f, 32.3f, 79.6f);
generalPath.curveTo(33.399998f, 78.4f, 34.899998f, 77.799995f, 36.7f, 77.799995f);
generalPath.curveTo(38.3f, 77.799995f, 39.600002f, 78.299995f, 40.600002f, 79.2f);
generalPath.curveTo(41.2f, 79.799995f, 41.600002f, 80.5f, 41.9f, 81.6f);
generalPath.lineTo(39.300003f, 82.2f);
generalPath.curveTo(39.100002f, 81.5f, 38.800003f, 81.0f, 38.300003f, 80.6f);
generalPath.curveTo(37.800003f, 80.2f, 37.200005f, 80.0f, 36.500004f, 80.0f);
generalPath.curveTo(35.500004f, 80.0f, 34.700005f, 80.3f, 34.100002f, 81.0f);
generalPath.curveTo(33.5f, 81.7f, 33.2f, 82.8f, 33.2f, 84.3f);
generalPath.curveTo(33.2f, 85.9f, 33.5f, 87.100006f, 34.100002f, 87.8f);
generalPath.curveTo(34.7f, 88.5f, 35.500004f, 88.8f, 36.4f, 88.8f);
generalPath.curveTo(37.100002f, 88.8f, 37.7f, 88.600006f, 38.2f, 88.100006f);
generalPath.curveTo(38.9f, 88.00001f, 39.3f, 87.3f, 39.5f, 86.3f);
generalPath.closePath();
generalPath.moveTo(44.3f, 78.200005f);
generalPath.lineTo(49.1f, 78.200005f);
generalPath.curveTo(50.199997f, 78.200005f, 51.0f, 78.3f, 51.6f, 78.4f);
generalPath.curveTo(52.399998f, 78.6f, 53.0f, 79.0f, 53.6f, 79.6f);
generalPath.curveTo(54.1f, 80.2f, 54.6f, 80.9f, 54.899998f, 81.7f);
generalPath.curveTo(55.199997f, 82.5f, 55.3f, 83.5f, 55.3f, 84.7f);
generalPath.curveTo(55.3f, 85.799995f, 55.2f, 86.7f, 54.899998f, 87.399994f);
generalPath.curveTo(54.6f, 88.299995f, 54.1f, 89.09999f, 53.499996f, 89.7f);
generalPath.curveTo(52.999996f, 90.1f, 52.399998f, 90.5f, 51.599995f, 90.7f);
generalPath.curveTo(50.999996f, 90.899994f, 50.199993f, 91.0f, 49.299995f, 91.0f);
generalPath.lineTo(44.299995f, 91.0f);
generalPath.lineTo(44.299995f, 78.2f);
generalPath.closePath();
generalPath.moveTo(47.0f, 80.4f);
generalPath.lineTo(47.0f, 88.9f);
generalPath.lineTo(49.0f, 88.9f);
generalPath.curveTo(49.7f, 88.9f, 50.3f, 88.9f, 50.6f, 88.8f);
generalPath.curveTo(51.0f, 88.700005f, 51.399998f, 88.5f, 51.699997f, 88.3f);
generalPath.curveTo(51.999996f, 88.100006f, 52.199997f, 87.600006f, 52.399998f, 87.100006f);
generalPath.curveTo(52.6f, 86.50001f, 52.699997f, 85.700005f, 52.699997f, 84.700005f);
generalPath.curveTo(52.699997f, 83.700005f, 52.6f, 82.9f, 52.399998f, 82.4f);
generalPath.curveTo(52.199997f, 81.9f, 51.999996f, 81.5f, 51.6f, 81.200005f);
generalPath.curveTo(51.3f, 80.9f, 50.899998f, 80.700005f, 50.399998f, 80.600006f);
generalPath.curveTo(49.999996f, 80.50001f, 49.3f, 80.50001f, 48.199997f, 80.50001f);
generalPath.lineTo(47.0f, 80.50001f);
generalPath.closePath();
generalPath.moveTo(57.5f, 78.200005f);
generalPath.lineTo(62.7f, 78.200005f);
generalPath.curveTo(63.7f, 78.200005f, 64.5f, 78.200005f, 65.0f, 78.3f);
generalPath.curveTo(65.5f, 78.4f, 66.0f, 78.600006f, 66.4f, 78.8f);
generalPath.curveTo(66.8f, 79.0f, 67.1f, 79.4f, 67.4f, 79.9f);
generalPath.curveTo(67.700005f, 80.3f, 67.8f, 80.9f, 67.8f, 81.4f);
generalPath.curveTo(67.8f, 82.0f, 67.600006f, 82.6f, 67.3f, 83.1f);
generalPath.curveTo(67.0f, 83.6f, 66.5f, 84.0f, 66.0f, 84.2f);
generalPath.curveTo(66.8f, 84.399994f, 67.4f, 84.799995f, 67.8f, 85.399994f);
generalPath.curveTo(68.200005f, 85.99999f, 68.4f, 86.59999f, 68.4f, 87.299995f);
generalPath.curveTo(68.4f, 87.899994f, 68.3f, 88.49999f, 68.0f, 88.99999f);
generalPath.curveTo(67.7f, 89.59999f, 67.3f, 89.99999f, 66.9f, 90.299995f);
generalPath.curveTo(66.4f, 90.6f, 65.8f, 90.799995f, 65.1f, 90.899994f);
generalPath.curveTo(64.7f, 90.899994f, 63.6f, 90.99999f, 61.899998f, 90.99999f);
generalPath.lineTo(57.399998f, 90.99999f);
generalPath.lineTo(57.399998f, 78.2f);
generalPath.closePath();
generalPath.moveTo(60.2f, 80.3f);
generalPath.lineTo(60.2f, 83.3f);
generalPath.lineTo(63.8f, 83.3f);
generalPath.curveTo(64.3f, 83.200005f, 64.6f, 83.100006f, 64.9f, 82.8f);
generalPath.curveTo(65.200005f, 82.5f, 65.3f, 82.200005f, 65.3f, 81.8f);
generalPath.curveTo(65.3f, 81.4f, 65.200005f, 81.100006f, 65.0f, 80.8f);
generalPath.curveTo(64.8f, 80.600006f, 64.4f, 80.4f, 64.0f, 80.3f);
generalPath.lineTo(60.2f, 80.3f);
generalPath.closePath();
generalPath.moveTo(60.2f, 85.5f);
generalPath.lineTo(60.2f, 88.9f);
generalPath.lineTo(62.600002f, 88.9f);
generalPath.curveTo(63.600002f, 88.9f, 64.200005f, 88.9f, 64.4f, 88.8f);
generalPath.curveTo(64.8f, 88.700005f, 65.1f, 88.600006f, 65.4f, 88.3f);
generalPath.curveTo(65.6f, 88.0f, 65.8f, 87.700005f, 65.8f, 87.200005f);
generalPath.curveTo(65.8f, 86.8f, 65.700005f, 86.50001f, 65.5f, 86.200005f);
generalPath.curveTo(65.3f, 85.9f, 65.0f, 85.700005f, 64.7f, 85.600006f);
generalPath.curveTo(64.299995f, 85.50001f, 63.6f, 85.40001f, 62.399998f, 85.40001f);
generalPath.lineTo(60.199997f, 85.40001f);
generalPath.closePath();
shape = generalPath;
paint = new Color(255, 255, 255, 255);
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
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 47.22200012207031), new Point2D.Double(43.02799987792969, 61.27799987792969), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(18.0, 45.900001525878906), new Point2D.Double(54.0, 45.900001525878906), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(28.95400047302246, 63.00400161743164), new Point2D.Double(43.0099983215332, 77.05999755859375), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(18.0, 61.599998474121094), new Point2D.Double(54.0, 61.599998474121094), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 78.72200012207031), new Point2D.Double(43.02799987792969, 92.77799987792969), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(18.0, 77.4000015258789), new Point2D.Double(54.0, 77.4000015258789), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.178001403808594, 74.15899658203125), new Point2D.Double(58.77199935913086, 87.75299835205078), new float[] {0.0f,0.637f,1.0f}, new Color[] {new Color(255, 254, 238, 255),new Color(207, 159, 160, 255),new Color(160, 53, 55, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(160, 53, 55, 255);
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_accdb() {
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
       ext_accdb base = new ext_accdb();
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
       ext_accdb base = new ext_accdb();
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
        return ext_accdb::new;
    }
}

