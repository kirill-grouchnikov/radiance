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
public class ext_sqlite implements ResizableIcon {
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
generalPath.moveTo(5.6f, 87.2f);
generalPath.lineTo(8.0f, 86.899994f);
generalPath.curveTo(8.1f, 87.7f, 8.4f, 88.299995f, 8.9f, 88.7f);
generalPath.curveTo(9.4f, 89.1f, 9.9f, 89.299995f, 10.7f, 89.299995f);
generalPath.curveTo(11.5f, 89.299995f, 12.099999f, 89.1f, 12.5f, 88.799995f);
generalPath.curveTo(12.900001f, 88.49999f, 13.1f, 88.1f, 13.1f, 87.6f);
generalPath.curveTo(13.1f, 87.299995f, 13.0f, 87.1f, 12.8f, 86.9f);
generalPath.curveTo(12.6f, 86.700005f, 12.3f, 86.5f, 11.900001f, 86.4f);
generalPath.curveTo(11.6f, 86.3f, 10.900001f, 86.1f, 9.900001f, 85.9f);
generalPath.curveTo(8.6f, 85.6f, 7.6000004f, 85.200005f, 7.1000004f, 84.700005f);
generalPath.curveTo(6.3f, 84.0f, 6.0f, 83.2f, 6.0f, 82.3f);
generalPath.curveTo(6.0f, 81.700005f, 6.2f, 81.100006f, 6.5f, 80.600006f);
generalPath.curveTo(6.9f, 80.100006f, 7.4f, 79.600006f, 8.0f, 79.40001f);
generalPath.curveTo(8.7f, 79.100006f, 9.5f, 79.00001f, 10.4f, 79.00001f);
generalPath.curveTo(11.9f, 79.00001f, 13.099999f, 79.30001f, 13.9f, 80.00001f);
generalPath.curveTo(14.7f, 80.700005f, 15.099999f, 81.600006f, 15.099999f, 82.700005f);
generalPath.lineTo(12.599999f, 82.8f);
generalPath.curveTo(12.499999f, 82.200005f, 12.299999f, 81.700005f, 11.9f, 81.5f);
generalPath.curveTo(11.599999f, 81.2f, 11.0f, 81.1f, 10.299999f, 81.1f);
generalPath.curveTo(9.599999f, 81.1f, 8.999999f, 81.2f, 8.599999f, 81.5f);
generalPath.curveTo(8.299999f, 81.7f, 8.2f, 81.9f, 8.2f, 82.3f);
generalPath.curveTo(8.2f, 82.600006f, 8.3f, 82.8f, 8.599999f, 83.0f);
generalPath.curveTo(8.9f, 83.3f, 9.7f, 83.5f, 10.9f, 83.8f);
generalPath.curveTo(12.099999f, 84.100006f, 13.0f, 84.4f, 13.599999f, 84.700005f);
generalPath.curveTo(14.199999f, 85.00001f, 14.599999f, 85.4f, 14.999999f, 85.9f);
generalPath.curveTo(15.299999f, 86.4f, 15.499999f, 87.1f, 15.499999f, 87.8f);
generalPath.curveTo(15.499999f, 88.50001f, 15.299999f, 89.200005f, 14.899999f, 89.8f);
generalPath.curveTo(14.499999f, 90.4f, 13.999999f, 90.9f, 13.199999f, 91.200005f);
generalPath.curveTo(12.399999f, 91.50001f, 11.599998f, 91.600006f, 10.499999f, 91.600006f);
generalPath.curveTo(8.899999f, 91.600006f, 7.799999f, 91.200005f, 6.899999f, 90.50001f);
generalPath.curveTo(5.999999f, 89.80001f, 5.799999f, 88.50001f, 5.5999994f, 87.200005f);
generalPath.closePath();
generalPath.moveTo(27.6f, 89.6f);
generalPath.curveTo(28.2f, 90.0f, 28.9f, 90.4f, 29.6f, 90.6f);
generalPath.lineTo(28.7f, 92.299995f);
generalPath.curveTo(28.300001f, 92.2f, 28.0f, 91.99999f, 27.6f, 91.799995f);
generalPath.curveTo(27.5f, 91.799995f, 27.0f, 91.399994f, 25.9f, 90.7f);
generalPath.curveTo(25.1f, 91.0f, 24.199999f, 91.2f, 23.199999f, 91.2f);
generalPath.curveTo(21.3f, 91.2f, 19.8f, 90.7f, 18.8f, 89.5f);
generalPath.curveTo(17.8f, 88.3f, 17.2f, 87.0f, 17.2f, 85.0f);
generalPath.curveTo(17.2f, 83.0f, 17.7f, 81.5f, 18.800001f, 80.4f);
generalPath.curveTo(19.900002f, 79.3f, 21.300001f, 78.700005f, 23.2f, 78.700005f);
generalPath.curveTo(25.0f, 78.700005f, 26.5f, 79.3f, 27.5f, 80.4f);
generalPath.curveTo(28.6f, 81.5f, 29.1f, 83.0f, 29.1f, 85.0f);
generalPath.curveTo(29.1f, 86.1f, 29.0f, 87.0f, 28.7f, 87.8f);
generalPath.curveTo(28.400002f, 88.4f, 28.1f, 89.0f, 27.6f, 89.600006f);
generalPath.closePath();
generalPath.moveTo(25.6f, 88.2f);
generalPath.curveTo(25.9f, 87.799995f, 26.2f, 87.399994f, 26.300001f, 86.899994f);
generalPath.curveTo(26.500002f, 86.399994f, 26.500002f, 85.799995f, 26.500002f, 85.09999f);
generalPath.curveTo(26.500002f, 83.69999f, 26.200003f, 82.59999f, 25.600002f, 81.899994f);
generalPath.curveTo(25.000002f, 81.2f, 24.200003f, 80.899994f, 23.100002f, 80.899994f);
generalPath.curveTo(22.000002f, 80.899994f, 21.300003f, 81.2f, 20.600002f, 81.899994f);
generalPath.curveTo(19.900002f, 82.59999f, 19.700003f, 83.59999f, 19.700003f, 84.99999f);
generalPath.curveTo(19.700003f, 86.399994f, 20.000002f, 87.49999f, 20.600002f, 88.19999f);
generalPath.curveTo(21.200003f, 88.89999f, 22.000002f, 89.29999f, 23.000002f, 89.29999f);
generalPath.curveTo(23.400002f, 89.29999f, 23.700003f, 89.19999f, 24.000002f, 89.09999f);
generalPath.curveTo(23.500002f, 88.79999f, 23.000002f, 88.49999f, 22.500002f, 88.29999f);
generalPath.lineTo(23.200003f, 86.89999f);
generalPath.curveTo(24.100002f, 87.19999f, 24.800003f, 87.59998f, 25.600002f, 88.19999f);
generalPath.closePath();
generalPath.moveTo(31.1f, 91.1f);
generalPath.lineTo(31.1f, 79.0f);
generalPath.lineTo(33.6f, 79.0f);
generalPath.lineTo(33.6f, 89.0f);
generalPath.lineTo(39.8f, 89.0f);
generalPath.lineTo(39.8f, 91.1f);
generalPath.lineTo(31.099998f, 91.1f);
generalPath.closePath();
generalPath.moveTo(41.5f, 91.1f);
generalPath.lineTo(41.5f, 78.9f);
generalPath.lineTo(44.0f, 78.9f);
generalPath.lineTo(44.0f, 91.1f);
generalPath.lineTo(41.5f, 91.1f);
generalPath.closePath();
generalPath.moveTo(49.1f, 91.1f);
generalPath.lineTo(49.1f, 81.0f);
generalPath.lineTo(45.5f, 81.0f);
generalPath.lineTo(45.5f, 78.9f);
generalPath.lineTo(55.3f, 78.9f);
generalPath.lineTo(55.3f, 81.0f);
generalPath.lineTo(51.7f, 81.0f);
generalPath.lineTo(51.7f, 91.1f);
generalPath.lineTo(49.100002f, 91.1f);
generalPath.closePath();
generalPath.moveTo(56.8f, 91.1f);
generalPath.lineTo(56.8f, 78.9f);
generalPath.lineTo(65.9f, 78.9f);
generalPath.lineTo(65.9f, 81.0f);
generalPath.lineTo(59.300003f, 81.0f);
generalPath.lineTo(59.300003f, 83.7f);
generalPath.lineTo(65.5f, 83.7f);
generalPath.lineTo(65.5f, 85.7f);
generalPath.lineTo(59.3f, 85.7f);
generalPath.lineTo(59.3f, 89.0f);
generalPath.lineTo(66.2f, 89.0f);
generalPath.lineTo(66.2f, 91.1f);
generalPath.lineTo(56.799995f, 91.1f);
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
generalPath.moveTo(54.0f, 53.1f);
generalPath.curveTo(54.0f, 55.6f, 45.9f, 57.6f, 36.0f, 57.6f);
generalPath.curveTo(26.099998f, 57.6f, 18.0f, 55.6f, 18.0f, 53.1f);
generalPath.curveTo(18.0f, 50.6f, 26.1f, 48.6f, 36.0f, 48.6f);
generalPath.curveTo(45.9f, 48.6f, 54.0f, 50.6f, 54.0f, 53.1f);
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
generalPath.moveTo(49.5f, 52.8f);
generalPath.curveTo(49.5f, 55.0f, 43.5f, 56.7f, 36.0f, 56.7f);
generalPath.curveTo(28.5f, 56.7f, 22.5f, 55.0f, 22.5f, 52.8f);
generalPath.curveTo(22.5f, 50.6f, 28.5f, 48.899998f, 36.0f, 48.899998f);
generalPath.curveTo(43.5f, 48.899998f, 49.5f, 50.6f, 49.5f, 52.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 42.22200012207031), new Point2D.Double(43.02799987792969, 56.27799987792969), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(18.0f, 53.3f);
generalPath.lineTo(18.0f, 64.5f);
generalPath.curveTo(18.0f, 64.5f, 22.5f, 69.0f, 36.0f, 69.0f);
generalPath.curveTo(49.5f, 69.0f, 54.0f, 64.5f, 54.0f, 64.5f);
generalPath.lineTo(54.0f, 53.3f);
generalPath.curveTo(54.0f, 53.3f, 51.8f, 57.2f, 36.0f, 57.5f);
generalPath.curveTo(20.2f, 57.8f, 18.0f, 53.3f, 18.0f, 53.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0, 40.900001525878906), new Point2D.Double(54.0, 40.900001525878906), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(54.0f, 37.3f);
generalPath.curveTo(54.0f, 39.8f, 45.9f, 41.8f, 36.0f, 41.8f);
generalPath.curveTo(26.099998f, 41.8f, 18.0f, 39.8f, 18.0f, 37.3f);
generalPath.curveTo(18.0f, 34.8f, 26.1f, 32.8f, 36.0f, 32.8f);
generalPath.curveTo(45.9f, 32.8f, 54.0f, 34.8f, 54.0f, 37.3f);
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
generalPath.moveTo(49.5f, 36.9f);
generalPath.curveTo(49.5f, 39.100002f, 43.5f, 40.800003f, 36.0f, 40.800003f);
generalPath.curveTo(28.5f, 40.800003f, 22.5f, 39.100002f, 22.5f, 36.9f);
generalPath.curveTo(22.5f, 34.7f, 28.5f, 33.0f, 36.0f, 33.0f);
generalPath.curveTo(43.5f, 33.1f, 49.5f, 34.8f, 49.5f, 36.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.95400047302246, 58.00400161743164), new Point2D.Double(43.0099983215332, 72.05999755859375), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(18.0f, 37.6f);
generalPath.lineTo(18.0f, 48.8f);
generalPath.curveTo(18.0f, 48.8f, 22.5f, 53.3f, 36.0f, 53.3f);
generalPath.curveTo(49.5f, 53.3f, 54.0f, 48.8f, 54.0f, 48.8f);
generalPath.lineTo(54.0f, 37.6f);
generalPath.curveTo(54.0f, 37.6f, 51.8f, 41.5f, 36.0f, 41.8f);
generalPath.curveTo(20.2f, 42.1f, 18.0f, 37.6f, 18.0f, 37.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0, 56.599998474121094), new Point2D.Double(54.0, 56.599998474121094), new float[] {0.0f,0.212f,0.639f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(180, 204, 216, 255),new Color(125, 160, 177, 255),new Color(79, 122, 141, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(54.0f, 21.6f);
generalPath.curveTo(54.0f, 24.1f, 45.9f, 26.1f, 36.0f, 26.1f);
generalPath.curveTo(26.099998f, 26.1f, 18.0f, 24.1f, 18.0f, 21.6f);
generalPath.curveTo(18.0f, 19.1f, 26.1f, 17.1f, 36.0f, 17.1f);
generalPath.curveTo(45.9f, 17.1f, 54.0f, 19.1f, 54.0f, 21.6f);
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
generalPath.moveTo(49.5f, 21.3f);
generalPath.curveTo(49.5f, 23.5f, 43.5f, 25.199999f, 36.0f, 25.199999f);
generalPath.curveTo(28.5f, 25.199999f, 22.5f, 23.499998f, 22.5f, 21.3f);
generalPath.curveTo(22.5f, 19.1f, 28.5f, 17.4f, 36.0f, 17.4f);
generalPath.curveTo(43.5f, 17.4f, 49.5f, 19.1f, 49.5f, 21.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(28.972000122070312, 73.72200012207031), new Point2D.Double(43.02799987792969, 87.77799987792969), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(18.0f, 21.8f);
generalPath.lineTo(18.0f, 33.0f);
generalPath.curveTo(18.0f, 33.0f, 22.5f, 37.5f, 36.0f, 37.5f);
generalPath.curveTo(49.5f, 37.5f, 54.0f, 33.0f, 54.0f, 33.0f);
generalPath.lineTo(54.0f, 21.8f);
generalPath.curveTo(54.0f, 21.8f, 51.8f, 25.699999f, 36.0f, 26.0f);
generalPath.curveTo(20.2f, 26.3f, 18.0f, 21.8f, 18.0f, 21.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0, 72.4000015258789), new Point2D.Double(54.0, 72.4000015258789), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
	private ext_sqlite() {
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
       ext_sqlite base = new ext_sqlite();
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
       ext_sqlite base = new ext_sqlite();
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
        return ext_sqlite::new;
    }
}

