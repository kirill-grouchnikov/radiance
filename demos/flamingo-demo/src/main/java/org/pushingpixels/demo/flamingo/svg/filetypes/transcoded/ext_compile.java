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
public class ext_compile implements NeonIcon {
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, -27.799999237060547), new Point2D.Double(36.0, 70.19999694824219), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 71.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(72.0f, 98.8f);
generalPath.lineTo(0.0f, 98.8f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 43.42499923706055), new Point2D.Double(58.57500076293945, 56.92499923706055), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 71.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.5f);
generalPath.lineTo(45.0f, 27.5f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(11.4f, 86.1f);
generalPath.lineTo(13.4f, 86.7f);
generalPath.curveTo(13.099999f, 87.799995f, 12.599999f, 88.6f, 11.9f, 89.1f);
generalPath.curveTo(11.2f, 89.6f, 10.299999f, 89.9f, 9.2f, 89.9f);
generalPath.curveTo(7.8999996f, 89.9f, 6.7999997f, 89.4f, 5.8999996f, 88.5f);
generalPath.curveTo(4.9999995f, 87.6f, 4.5999994f, 86.3f, 4.5999994f, 84.8f);
generalPath.curveTo(4.5999994f, 83.100006f, 4.9999995f, 81.8f, 5.8999996f, 80.9f);
generalPath.curveTo(6.7999997f, 80.0f, 7.8999996f, 79.5f, 9.299999f, 79.5f);
generalPath.curveTo(10.499999f, 79.5f, 11.499999f, 79.9f, 12.299999f, 80.6f);
generalPath.curveTo(12.799999f, 81.0f, 13.099999f, 81.6f, 13.299999f, 82.4f);
generalPath.lineTo(11.299999f, 82.9f);
generalPath.curveTo(11.199999f, 82.4f, 10.9f, 82.0f, 10.599999f, 81.700005f);
generalPath.curveTo(10.299999f, 81.40001f, 9.799999f, 81.200005f, 9.2f, 81.200005f);
generalPath.curveTo(8.5f, 81.200005f, 7.8999996f, 81.50001f, 7.3999996f, 82.00001f);
generalPath.curveTo(6.8999996f, 82.50001f, 6.7f, 83.40001f, 6.7f, 84.600006f);
generalPath.curveTo(6.7f, 85.90001f, 6.8999996f, 86.8f, 7.3999996f, 87.3f);
generalPath.curveTo(7.8999996f, 87.8f, 8.4f, 88.100006f, 9.2f, 88.100006f);
generalPath.curveTo(9.7f, 88.100006f, 10.2f, 87.90001f, 10.599999f, 87.600006f);
generalPath.curveTo(10.999999f, 87.3f, 11.2f, 86.8f, 11.4f, 86.100006f);
generalPath.closePath();
generalPath.moveTo(14.7f, 84.9f);
generalPath.curveTo(14.7f, 83.9f, 14.9f, 83.0f, 15.2f, 82.3f);
generalPath.curveTo(15.4f, 81.8f, 15.7f, 81.3f, 16.1f, 80.9f);
generalPath.curveTo(16.5f, 80.5f, 16.9f, 80.200005f, 17.4f, 80.0f);
generalPath.curveTo(18.0f, 79.7f, 18.699999f, 79.6f, 19.6f, 79.6f);
generalPath.curveTo(21.1f, 79.6f, 22.300001f, 80.1f, 23.1f, 81.0f);
generalPath.curveTo(23.9f, 81.9f, 24.4f, 83.2f, 24.4f, 84.8f);
generalPath.curveTo(24.4f, 86.4f, 24.0f, 87.700005f, 23.1f, 88.600006f);
generalPath.curveTo(22.2f, 89.50001f, 21.0f, 90.0f, 19.5f, 90.0f);
generalPath.curveTo(18.0f, 90.0f, 16.8f, 89.5f, 15.9f, 88.6f);
generalPath.curveTo(15.099999f, 87.7f, 14.7f, 86.4f, 14.7f, 84.9f);
generalPath.closePath();
generalPath.moveTo(16.7f, 84.8f);
generalPath.curveTo(16.7f, 85.9f, 17.0f, 86.8f, 17.5f, 87.4f);
generalPath.curveTo(18.0f, 88.0f, 18.7f, 88.3f, 19.5f, 88.3f);
generalPath.curveTo(20.3f, 88.3f, 21.0f, 88.0f, 21.5f, 87.4f);
generalPath.curveTo(22.0f, 86.8f, 22.3f, 85.9f, 22.3f, 84.8f);
generalPath.curveTo(22.3f, 83.700005f, 22.0f, 82.8f, 21.5f, 82.200005f);
generalPath.curveTo(21.0f, 81.600006f, 20.3f, 81.4f, 19.5f, 81.4f);
generalPath.curveTo(18.7f, 81.4f, 18.0f, 81.700005f, 17.5f, 82.3f);
generalPath.curveTo(17.0f, 82.8f, 16.7f, 83.600006f, 16.7f, 84.8f);
generalPath.closePath();
generalPath.moveTo(25.900002f, 89.8f);
generalPath.lineTo(25.900002f, 79.8f);
generalPath.lineTo(28.900002f, 79.8f);
generalPath.lineTo(30.7f, 86.600006f);
generalPath.lineTo(32.5f, 79.8f);
generalPath.lineTo(35.5f, 79.8f);
generalPath.lineTo(35.5f, 89.8f);
generalPath.lineTo(33.6f, 89.8f);
generalPath.lineTo(33.6f, 81.9f);
generalPath.lineTo(31.599998f, 89.8f);
generalPath.lineTo(29.699999f, 89.8f);
generalPath.lineTo(27.699999f, 81.9f);
generalPath.lineTo(27.699999f, 89.8f);
generalPath.lineTo(25.9f, 89.8f);
generalPath.closePath();
generalPath.moveTo(37.600002f, 89.8f);
generalPath.lineTo(37.600002f, 79.8f);
generalPath.lineTo(40.800003f, 79.8f);
generalPath.curveTo(42.000004f, 79.8f, 42.800003f, 79.8f, 43.200005f, 80.0f);
generalPath.curveTo(43.800003f, 80.2f, 44.300003f, 80.5f, 44.600006f, 81.0f);
generalPath.curveTo(45.000008f, 81.5f, 45.200005f, 82.2f, 45.200005f, 83.0f);
generalPath.curveTo(45.200005f, 83.6f, 45.100006f, 84.1f, 44.900005f, 84.6f);
generalPath.curveTo(44.700005f, 85.0f, 44.400005f, 85.299995f, 44.000004f, 85.6f);
generalPath.curveTo(43.700005f, 85.799995f, 43.300003f, 86.0f, 43.000004f, 86.1f);
generalPath.curveTo(42.600002f, 86.0f, 41.900005f, 86.0f, 41.000004f, 86.0f);
generalPath.lineTo(39.700005f, 86.0f);
generalPath.lineTo(39.700005f, 89.8f);
generalPath.lineTo(37.600006f, 89.8f);
generalPath.closePath();
generalPath.moveTo(39.600002f, 81.5f);
generalPath.lineTo(39.600002f, 84.3f);
generalPath.lineTo(40.7f, 84.3f);
generalPath.curveTo(41.5f, 84.3f, 42.0f, 84.200005f, 42.3f, 84.100006f);
generalPath.curveTo(42.6f, 84.00001f, 42.8f, 83.8f, 42.899998f, 83.600006f);
generalPath.curveTo(43.1f, 83.40001f, 43.1f, 83.100006f, 43.1f, 82.8f);
generalPath.curveTo(43.1f, 82.4f, 43.0f, 82.100006f, 42.8f, 81.9f);
generalPath.curveTo(42.6f, 81.700005f, 42.3f, 81.5f, 42.0f, 81.5f);
generalPath.curveTo(41.8f, 81.5f, 41.3f, 81.4f, 40.5f, 81.4f);
generalPath.lineTo(39.6f, 81.5f);
generalPath.closePath();
generalPath.moveTo(46.9f, 89.8f);
generalPath.lineTo(46.9f, 79.8f);
generalPath.lineTo(48.9f, 79.8f);
generalPath.lineTo(48.9f, 89.8f);
generalPath.lineTo(46.9f, 89.8f);
generalPath.closePath();
generalPath.moveTo(50.9f, 89.8f);
generalPath.lineTo(50.9f, 79.9f);
generalPath.lineTo(52.9f, 79.9f);
generalPath.lineTo(52.9f, 88.200005f);
generalPath.lineTo(57.9f, 88.200005f);
generalPath.lineTo(57.9f, 89.9f);
generalPath.lineTo(50.9f, 89.8f);
generalPath.closePath();
generalPath.moveTo(59.4f, 89.8f);
generalPath.lineTo(59.4f, 79.8f);
generalPath.lineTo(66.8f, 79.8f);
generalPath.lineTo(66.8f, 81.5f);
generalPath.lineTo(61.4f, 81.5f);
generalPath.lineTo(61.4f, 83.7f);
generalPath.lineTo(66.4f, 83.7f);
generalPath.lineTo(66.4f, 85.399994f);
generalPath.lineTo(61.4f, 85.399994f);
generalPath.lineTo(61.4f, 88.09999f);
generalPath.lineTo(67.0f, 88.09999f);
generalPath.lineTo(67.0f, 89.79999f);
generalPath.lineTo(59.4f, 89.79999f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
generalPath.moveTo(52.5f, 64.4f);
generalPath.lineTo(52.5f, 41.0f);
generalPath.lineTo(57.2f, 41.0f);
generalPath.lineTo(57.2f, 69.2f);
generalPath.lineTo(14.9f, 69.2f);
generalPath.lineTo(14.9f, 41.0f);
generalPath.lineTo(19.599998f, 41.0f);
generalPath.lineTo(19.599998f, 64.4f);
generalPath.lineTo(52.5f, 64.4f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 69.1259994506836), new Point2D.Double(36.0, 40.96500015258789), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(24.4f, 29.1f);
generalPath.lineTo(47.4f, 29.1f);
generalPath.lineTo(35.9f, 40.6f);
generalPath.lineTo(24.4f, 29.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.915000915527344, 40.62699890136719), new Point2D.Double(35.915000915527344, 29.125999450683594), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(29.0f, 50.3f);
generalPath.lineTo(29.0f, 45.6f);
generalPath.lineTo(33.7f, 45.6f);
generalPath.lineTo(33.7f, 50.3f);
generalPath.lineTo(29.0f, 50.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.30699920654297, 50.268001556396484), new Point2D.Double(31.30699920654297, 45.617000579833984), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(43.0f, 50.3f);
generalPath.lineTo(38.3f, 50.3f);
generalPath.lineTo(38.3f, 45.6f);
generalPath.lineTo(43.0f, 45.6f);
generalPath.lineTo(43.0f, 50.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(40.69300079345703, 50.268001556396484), new Point2D.Double(40.69300079345703, 45.617000579833984), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(24.2f, 55.0f);
generalPath.lineTo(28.900002f, 55.0f);
generalPath.lineTo(28.900002f, 59.7f);
generalPath.lineTo(24.2f, 59.7f);
generalPath.lineTo(24.2f, 55.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.570999145507812, 59.654998779296875), new Point2D.Double(26.570999145507812, 55.00400161743164), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(43.1f, 59.7f);
generalPath.lineTo(43.1f, 55.0f);
generalPath.lineTo(47.8f, 55.0f);
generalPath.lineTo(47.8f, 59.7f);
generalPath.lineTo(43.1f, 59.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.42900085449219, 59.654998779296875), new Point2D.Double(45.42900085449219, 55.00400161743164), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(38.3f, 55.0f);
generalPath.lineTo(38.3f, 59.7f);
generalPath.lineTo(33.6f, 59.7f);
generalPath.lineTo(33.6f, 55.0f);
generalPath.lineTo(38.3f, 55.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.95800018310547, 59.654998779296875), new Point2D.Double(35.95800018310547, 55.00400161743164), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
		return 0.9980000257492065;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_compile() {
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
       ext_compile base = new ext_compile();
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
       ext_compile base = new ext_compile();
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
        return ext_compile::new;
    }
}

