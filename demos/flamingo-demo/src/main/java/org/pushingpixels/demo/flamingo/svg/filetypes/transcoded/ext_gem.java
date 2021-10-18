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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_gem implements RadianceIcon {
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(72.3f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.199997f, 1.0f);
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
generalPath.moveTo(15.7f, 82.8f);
generalPath.lineTo(15.7f, 79.5f);
generalPath.lineTo(24.5f, 79.5f);
generalPath.lineTo(24.5f, 87.4f);
generalPath.curveTo(23.6f, 88.200005f, 22.4f, 88.9f, 20.8f, 89.5f);
generalPath.curveTo(19.199999f, 90.1f, 17.599998f, 90.4f, 15.9f, 90.4f);
generalPath.curveTo(13.799999f, 90.4f, 12.0f, 90.0f, 10.4f, 89.1f);
generalPath.curveTo(8.799999f, 88.2f, 7.7f, 87.0f, 6.9f, 85.4f);
generalPath.curveTo(6.1000004f, 83.8f, 5.7f, 82.0f, 5.7f, 80.1f);
generalPath.curveTo(5.7f, 78.0f, 6.1f, 76.2f, 7.0f, 74.6f);
generalPath.curveTo(7.9f, 73.0f, 9.2f, 71.799995f, 10.9f, 70.9f);
generalPath.curveTo(12.2f, 70.200005f, 13.799999f, 69.9f, 15.7f, 69.9f);
generalPath.curveTo(18.2f, 69.9f, 20.1f, 70.4f, 21.6f, 71.4f);
generalPath.curveTo(23.0f, 72.4f, 23.9f, 73.9f, 24.300001f, 75.700005f);
generalPath.lineTo(20.300001f, 76.4f);
generalPath.curveTo(20.000002f, 75.4f, 19.500002f, 74.700005f, 18.7f, 74.1f);
generalPath.curveTo(17.900002f, 73.5f, 16.900002f, 73.299995f, 15.800001f, 73.299995f);
generalPath.curveTo(14.000001f, 73.299995f, 12.600001f, 73.899994f, 11.600001f, 74.99999f);
generalPath.curveTo(10.600001f, 76.09999f, 10.0f, 77.8f, 10.0f, 79.9f);
generalPath.curveTo(10.0f, 82.3f, 10.5f, 84.0f, 11.6f, 85.200005f);
generalPath.curveTo(12.700001f, 86.4f, 14.1f, 87.00001f, 15.8f, 87.00001f);
generalPath.curveTo(16.7f, 87.00001f, 17.5f, 86.80001f, 18.4f, 86.50001f);
generalPath.curveTo(19.3f, 86.200005f, 20.0f, 85.80001f, 20.6f, 85.30001f);
generalPath.lineTo(20.6f, 82.80001f);
generalPath.lineTo(15.700001f, 82.80001f);
generalPath.closePath();
generalPath.moveTo(28.2f, 90.100006f);
generalPath.lineTo(28.2f, 70.2f);
generalPath.lineTo(43.1f, 70.2f);
generalPath.lineTo(43.1f, 73.6f);
generalPath.lineTo(32.3f, 73.6f);
generalPath.lineTo(32.3f, 78.0f);
generalPath.lineTo(42.4f, 78.0f);
generalPath.lineTo(42.4f, 81.3f);
generalPath.lineTo(32.3f, 81.3f);
generalPath.lineTo(32.3f, 86.700005f);
generalPath.lineTo(43.5f, 86.700005f);
generalPath.lineTo(43.5f, 90.0f);
generalPath.lineTo(28.2f, 90.0f);
generalPath.closePath();
generalPath.moveTo(46.9f, 90.100006f);
generalPath.lineTo(46.9f, 70.2f);
generalPath.lineTo(53.0f, 70.2f);
generalPath.lineTo(56.6f, 83.7f);
generalPath.lineTo(60.199997f, 70.2f);
generalPath.lineTo(66.299995f, 70.2f);
generalPath.lineTo(66.299995f, 90.0f);
generalPath.lineTo(62.499996f, 90.0f);
generalPath.lineTo(62.499996f, 74.5f);
generalPath.lineTo(58.499996f, 90.1f);
generalPath.lineTo(54.599995f, 90.1f);
generalPath.lineTo(50.599995f, 74.5f);
generalPath.lineTo(50.599995f, 90.1f);
generalPath.lineTo(46.899994f, 90.1f);
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
generalPath.moveTo(31.8f, 32.0f);
generalPath.curveTo(31.699999f, 32.1f, 31.699999f, 32.1f, 31.8f, 32.0f);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(54.0f, 23.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(54.0f, 23.5f);
generalPath.closePath();
generalPath.moveTo(18.0f, 59.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(18.0f, 59.5f);
generalPath.closePath();
generalPath.moveTo(27.0f, 50.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 41.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(18.0f, 50.5f);
generalPath.lineTo(18.0f, 59.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(18.0f, 50.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 41.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(45.0f, 32.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.closePath();
generalPath.moveTo(54.0f, 23.5f);
generalPath.lineTo(45.0f, 23.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(54.0f, 23.5f);
generalPath.closePath();
generalPath.moveTo(27.0f, 41.5f);
generalPath.lineTo(18.0f, 50.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 32.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.closePath();
generalPath.moveTo(45.0f, 23.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(45.0f, 23.5f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(18.0, 60.5), new Point2D.Double(54.0, 60.5), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(54.0f, 23.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(54.0f, 23.5f);
generalPath.closePath();
generalPath.moveTo(18.0f, 59.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(18.0f, 59.5f);
generalPath.closePath();
generalPath.moveTo(27.0f, 50.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 41.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(18.0f, 50.5f);
generalPath.lineTo(18.0f, 59.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(18.0f, 50.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 41.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(45.0f, 32.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.closePath();
generalPath.moveTo(54.0f, 23.5f);
generalPath.lineTo(45.0f, 23.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(54.0f, 23.5f);
generalPath.closePath();
generalPath.moveTo(27.0f, 41.5f);
generalPath.lineTo(18.0f, 50.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 32.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.closePath();
generalPath.moveTo(45.0f, 23.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(45.0f, 23.5f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(54.0f, 23.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(54.0f, 23.5f);
generalPath.closePath();
generalPath.moveTo(18.0f, 59.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(18.0f, 59.5f);
generalPath.closePath();
generalPath.moveTo(27.0f, 50.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 41.5f);
generalPath.lineTo(54.0f, 59.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(18.0f, 50.5f);
generalPath.lineTo(18.0f, 59.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(18.0f, 50.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 41.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(45.0f, 32.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.closePath();
generalPath.moveTo(54.0f, 23.5f);
generalPath.lineTo(45.0f, 23.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(54.0f, 23.5f);
generalPath.closePath();
generalPath.moveTo(27.0f, 41.5f);
generalPath.lineTo(18.0f, 50.5f);
generalPath.lineTo(27.0f, 50.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.closePath();
generalPath.moveTo(36.0f, 32.5f);
generalPath.lineTo(27.0f, 41.5f);
generalPath.lineTo(36.0f, 41.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.closePath();
generalPath.moveTo(45.0f, 23.5f);
generalPath.lineTo(36.0f, 32.5f);
generalPath.lineTo(45.0f, 32.5f);
generalPath.lineTo(45.0f, 23.5f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.3f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
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
        return 0.13099998235702515;
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
		return 0.7420000433921814;
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
	private ext_gem() {
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
       ext_gem base = new ext_gem();
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
       ext_gem base = new ext_gem();
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
        return ext_gem::new;
    }
}

