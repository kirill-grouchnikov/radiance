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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_accdt implements ResizableIcon {
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(-0.2, 99.0);
generalPath.lineTo(-0.2, 1.0);
generalPath.lineTo(45.1, 1.0);
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(-0.2, 99.0);
generalPath.lineTo(-0.2, 1.0);
generalPath.lineTo(45.1, 1.0);
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(-0.2, 99.0);
generalPath.lineTo(-0.2, 1.0);
generalPath.lineTo(45.1, 1.0);
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
generalPath.moveTo(17.5, 91.1);
generalPath.lineTo(14.6, 91.1);
generalPath.lineTo(13.5, 88.2);
generalPath.lineTo(8.2, 88.2);
generalPath.lineTo(7.1, 91.1);
generalPath.lineTo(4.3, 91.1);
generalPath.lineTo(9.4, 78.2);
generalPath.lineTo(12.2, 78.2);
generalPath.lineTo(17.5, 91.1);
generalPath.closePath();
generalPath.moveTo(12.6, 86.0);
generalPath.lineTo(10.8, 81.2);
generalPath.lineTo(9.0, 86.0);
generalPath.lineTo(12.6, 86.0);
generalPath.closePath();
generalPath.moveTo(27.3, 86.3);
generalPath.lineTo(29.9, 87.100006);
generalPath.curveTo(29.5, 88.50001, 28.9, 89.600006, 27.9, 90.200005);
generalPath.curveTo(27.0, 90.9, 25.8, 91.200005, 24.4, 91.200005);
generalPath.curveTo(22.699999, 91.200005, 21.199999, 90.600006, 20.099998, 89.4);
generalPath.curveTo(18.999998, 88.200005, 18.399998, 86.6, 18.399998, 84.6);
generalPath.curveTo(18.399998, 82.5, 18.999998, 80.799995, 20.099998, 79.6);
generalPath.curveTo(21.199999, 78.4, 22.699999, 77.799995, 24.499998, 77.799995);
generalPath.curveTo(26.099998, 77.799995, 27.399998, 78.299995, 28.399998, 79.2);
generalPath.curveTo(28.999998, 79.799995, 29.399998, 80.5, 29.699997, 81.6);
generalPath.lineTo(27.099997, 82.2);
generalPath.curveTo(26.899996, 81.5, 26.599997, 81.0, 26.099997, 80.6);
generalPath.curveTo(25.599997, 80.2, 25.0, 80.0, 24.3, 80.0);
generalPath.curveTo(23.3, 80.0, 22.5, 80.3, 21.9, 81.0);
generalPath.curveTo(21.3, 81.7, 21.0, 82.8, 21.0, 84.3);
generalPath.curveTo(21.0, 85.9, 21.3, 87.100006, 21.9, 87.8);
generalPath.curveTo(22.5, 88.5, 23.3, 88.8, 24.199999, 88.8);
generalPath.curveTo(24.9, 88.8, 25.499998, 88.600006, 25.999998, 88.100006);
generalPath.curveTo(26.699999, 88.00001, 27.099998, 87.3, 27.299997, 86.3);
generalPath.closePath();
generalPath.moveTo(40.5, 86.3);
generalPath.lineTo(43.1, 87.100006);
generalPath.curveTo(42.699997, 88.50001, 42.1, 89.600006, 41.1, 90.200005);
generalPath.curveTo(40.199997, 90.9, 39.0, 91.200005, 37.6, 91.200005);
generalPath.curveTo(35.899998, 91.200005, 34.399998, 90.600006, 33.3, 89.4);
generalPath.curveTo(32.2, 88.200005, 31.599998, 86.6, 31.599998, 84.6);
generalPath.curveTo(31.599998, 82.5, 32.199997, 80.799995, 33.3, 79.6);
generalPath.curveTo(34.399998, 78.4, 35.899998, 77.799995, 37.7, 77.799995);
generalPath.curveTo(39.3, 77.799995, 40.600002, 78.299995, 41.600002, 79.2);
generalPath.curveTo(42.2, 79.799995, 42.600002, 80.5, 42.9, 81.6);
generalPath.lineTo(40.300003, 82.2);
generalPath.curveTo(40.100002, 81.5, 39.800003, 81.0, 39.300003, 80.6);
generalPath.curveTo(38.800003, 80.2, 38.200005, 80.0, 37.500004, 80.0);
generalPath.curveTo(36.500004, 80.0, 35.700005, 80.3, 35.100002, 81.0);
generalPath.curveTo(34.5, 81.7, 34.2, 82.8, 34.2, 84.3);
generalPath.curveTo(34.2, 85.9, 34.5, 87.100006, 35.100002, 87.8);
generalPath.curveTo(35.7, 88.5, 36.500004, 88.8, 37.4, 88.8);
generalPath.curveTo(38.100002, 88.8, 38.7, 88.600006, 39.2, 88.100006);
generalPath.curveTo(39.9, 88.00001, 40.3, 87.3, 40.5, 86.3);
generalPath.closePath();
generalPath.moveTo(45.3, 78.200005);
generalPath.lineTo(50.1, 78.200005);
generalPath.curveTo(51.199997, 78.200005, 52.0, 78.3, 52.6, 78.4);
generalPath.curveTo(53.399998, 78.6, 54.0, 79.0, 54.6, 79.6);
generalPath.curveTo(55.1, 80.2, 55.6, 80.9, 55.899998, 81.7);
generalPath.curveTo(56.199997, 82.5, 56.3, 83.5, 56.3, 84.7);
generalPath.curveTo(56.3, 85.799995, 56.2, 86.7, 55.899998, 87.399994);
generalPath.curveTo(55.6, 88.299995, 55.1, 89.09999, 54.499996, 89.7);
generalPath.curveTo(53.999996, 90.1, 53.399998, 90.5, 52.599995, 90.7);
generalPath.curveTo(51.999996, 90.899994, 51.199993, 91.0, 50.299995, 91.0);
generalPath.lineTo(45.299995, 91.0);
generalPath.lineTo(45.299995, 78.2);
generalPath.closePath();
generalPath.moveTo(48.0, 80.4);
generalPath.lineTo(48.0, 88.9);
generalPath.lineTo(50.0, 88.9);
generalPath.curveTo(50.7, 88.9, 51.3, 88.9, 51.6, 88.8);
generalPath.curveTo(52.0, 88.700005, 52.399998, 88.5, 52.699997, 88.3);
generalPath.curveTo(52.999996, 88.100006, 53.199997, 87.600006, 53.399998, 87.100006);
generalPath.curveTo(53.6, 86.50001, 53.699997, 85.700005, 53.699997, 84.700005);
generalPath.curveTo(53.699997, 83.700005, 53.6, 82.9, 53.399998, 82.4);
generalPath.curveTo(53.199997, 81.9, 52.999996, 81.5, 52.6, 81.200005);
generalPath.curveTo(52.3, 80.9, 51.899998, 80.700005, 51.399998, 80.600006);
generalPath.curveTo(50.999996, 80.50001, 50.3, 80.50001, 49.199997, 80.50001);
generalPath.lineTo(48.0, 80.50001);
generalPath.closePath();
generalPath.moveTo(61.5, 91.1);
generalPath.lineTo(61.5, 80.4);
generalPath.lineTo(57.6, 80.4);
generalPath.lineTo(57.6, 78.200005);
generalPath.lineTo(68.0, 78.200005);
generalPath.lineTo(68.0, 80.4);
generalPath.lineTo(64.1, 80.4);
generalPath.lineTo(64.1, 91.1);
generalPath.lineTo(61.5, 91.1);
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
generalPath.moveTo(54.0, 48.1);
generalPath.curveTo(54.0, 50.6, 45.9, 52.6, 36.0, 52.6);
generalPath.curveTo(26.099998, 52.6, 18.0, 50.6, 18.0, 48.1);
generalPath.curveTo(18.0, 45.6, 26.1, 43.6, 36.0, 43.6);
generalPath.curveTo(45.9, 43.6, 54.0, 45.6, 54.0, 48.1);
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
generalPath.moveTo(49.5, 47.8);
generalPath.curveTo(49.5, 50.0, 43.5, 51.7, 36.0, 51.7);
generalPath.curveTo(28.5, 51.7, 22.5, 50.0, 22.5, 47.8);
generalPath.curveTo(22.5, 45.6, 28.5, 43.899998, 36.0, 43.899998);
generalPath.curveTo(43.5, 43.899998, 49.5, 45.6, 49.5, 47.8);
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
generalPath.moveTo(18.0, 48.3);
generalPath.lineTo(18.0, 59.5);
generalPath.curveTo(18.0, 59.5, 22.5, 64.0, 36.0, 64.0);
generalPath.curveTo(49.5, 64.0, 54.0, 59.5, 54.0, 59.5);
generalPath.lineTo(54.0, 48.3);
generalPath.curveTo(54.0, 48.3, 51.8, 52.2, 36.0, 52.5);
generalPath.curveTo(20.2, 52.8, 18.0, 48.3, 18.0, 48.3);
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
generalPath.moveTo(54.0, 32.3);
generalPath.curveTo(54.0, 34.8, 45.9, 36.8, 36.0, 36.8);
generalPath.curveTo(26.099998, 36.8, 18.0, 34.8, 18.0, 32.3);
generalPath.curveTo(18.0, 29.8, 26.1, 27.8, 36.0, 27.8);
generalPath.curveTo(45.9, 27.8, 54.0, 29.8, 54.0, 32.3);
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
generalPath.moveTo(49.5, 31.9);
generalPath.curveTo(49.5, 34.1, 43.5, 35.8, 36.0, 35.8);
generalPath.curveTo(28.5, 35.8, 22.5, 34.1, 22.5, 31.9);
generalPath.curveTo(22.5, 29.7, 28.5, 28.0, 36.0, 28.0);
generalPath.curveTo(43.5, 28.1, 49.5, 29.8, 49.5, 31.9);
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
generalPath.moveTo(18.0, 32.6);
generalPath.lineTo(18.0, 43.8);
generalPath.curveTo(18.0, 43.8, 22.5, 48.3, 36.0, 48.3);
generalPath.curveTo(49.5, 48.3, 54.0, 43.8, 54.0, 43.8);
generalPath.lineTo(54.0, 32.6);
generalPath.curveTo(54.0, 32.6, 51.8, 36.5, 36.0, 36.8);
generalPath.curveTo(20.2, 37.1, 18.0, 32.6, 18.0, 32.6);
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
generalPath.moveTo(54.0, 16.6);
generalPath.curveTo(54.0, 19.1, 45.9, 21.1, 36.0, 21.1);
generalPath.curveTo(26.099998, 21.1, 18.0, 19.1, 18.0, 16.6);
generalPath.curveTo(18.0, 14.1, 26.1, 12.1, 36.0, 12.1);
generalPath.curveTo(45.9, 12.1, 54.0, 14.1, 54.0, 16.6);
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
generalPath.moveTo(49.5, 16.3);
generalPath.curveTo(49.5, 18.5, 43.5, 20.199999, 36.0, 20.199999);
generalPath.curveTo(28.5, 20.199999, 22.5, 18.499998, 22.5, 16.3);
generalPath.curveTo(22.5, 14.1, 28.5, 12.4, 36.0, 12.4);
generalPath.curveTo(43.5, 12.4, 49.5, 14.099999, 49.5, 16.3);
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
generalPath.moveTo(18.0, 16.8);
generalPath.lineTo(18.0, 28.0);
generalPath.curveTo(18.0, 28.0, 22.5, 32.5, 36.0, 32.5);
generalPath.curveTo(49.5, 32.5, 54.0, 28.0, 54.0, 28.0);
generalPath.lineTo(54.0, 16.8);
generalPath.curveTo(54.0, 16.8, 51.8, 20.699999, 36.0, 21.0);
generalPath.curveTo(20.2, 21.3, 18.0, 16.8, 18.0, 16.8);
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
generalPath.moveTo(45.1, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(45.1, 27.7);
generalPath.lineTo(45.1, 1.0);
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
generalPath.moveTo(44.1, 1.0);
generalPath.lineTo(71.3, 27.7);
generalPath.lineTo(44.1, 27.7);
generalPath.lineTo(44.1, 1.0);
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
generalPath.moveTo(44.1, 1.0);
generalPath.lineTo(71.3, 27.7);
generalPath.lineTo(44.1, 27.7);
generalPath.lineTo(44.1, 1.0);
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
	private ext_accdt() {
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
       ext_accdt base = new ext_accdt();
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
       ext_accdt base = new ext_accdt();
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
        return ext_accdt::new;
    }
}

