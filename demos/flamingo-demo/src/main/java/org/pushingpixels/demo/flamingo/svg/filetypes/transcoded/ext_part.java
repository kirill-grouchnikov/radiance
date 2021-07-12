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
public class ext_part implements NeonIcon {
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
generalPath.moveTo(8.1f, 90.1f);
generalPath.lineTo(8.1f, 74.3f);
generalPath.lineTo(13.3f, 74.3f);
generalPath.curveTo(15.3f, 74.3f, 16.5f, 74.4f, 17.1f, 74.5f);
generalPath.curveTo(18.0f, 74.7f, 18.800001f, 75.3f, 19.4f, 76.0f);
generalPath.curveTo(20.0f, 76.8f, 20.3f, 77.8f, 20.3f, 79.1f);
generalPath.curveTo(20.3f, 80.1f, 20.099998f, 80.9f, 19.8f, 81.5f);
generalPath.curveTo(19.4f, 82.2f, 19.0f, 82.7f, 18.4f, 83.1f);
generalPath.curveTo(17.9f, 83.5f, 17.3f, 83.7f, 16.699999f, 83.799995f);
generalPath.curveTo(15.899999f, 83.99999f, 14.799999f, 83.99999f, 13.399999f, 83.99999f);
generalPath.lineTo(11.299999f, 83.99999f);
generalPath.lineTo(11.299999f, 89.899994f);
generalPath.lineTo(8.1f, 89.899994f);
generalPath.closePath();
generalPath.moveTo(11.3f, 77.0f);
generalPath.lineTo(11.3f, 81.5f);
generalPath.lineTo(13.1f, 81.5f);
generalPath.curveTo(14.400001f, 81.5f, 15.200001f, 81.4f, 15.6f, 81.3f);
generalPath.curveTo(16.0f, 81.200005f, 16.4f, 80.9f, 16.6f, 80.5f);
generalPath.curveTo(16.800001f, 80.1f, 17.0f, 79.7f, 17.0f, 79.3f);
generalPath.curveTo(17.0f, 78.700005f, 16.8f, 78.3f, 16.5f, 77.9f);
generalPath.curveTo(16.2f, 77.5f, 15.7f, 77.3f, 15.2f, 77.200005f);
generalPath.curveTo(14.8f, 77.00001f, 14.0f, 77.00001f, 12.9f, 77.00001f);
generalPath.lineTo(11.299999f, 77.00001f);
generalPath.closePath();
generalPath.moveTo(35.7f, 90.1f);
generalPath.lineTo(32.2f, 90.1f);
generalPath.lineTo(30.800001f, 86.5f);
generalPath.lineTo(24.400002f, 86.5f);
generalPath.lineTo(23.100002f, 90.1f);
generalPath.lineTo(19.700003f, 90.1f);
generalPath.lineTo(25.900002f, 74.4f);
generalPath.lineTo(29.300001f, 74.4f);
generalPath.lineTo(35.7f, 90.1f);
generalPath.closePath();
generalPath.moveTo(29.800001f, 83.799995f);
generalPath.lineTo(27.6f, 78.0f);
generalPath.lineTo(25.4f, 83.8f);
generalPath.lineTo(29.8f, 83.8f);
generalPath.closePath();
generalPath.moveTo(37.4f, 90.1f);
generalPath.lineTo(37.4f, 74.3f);
generalPath.lineTo(44.2f, 74.3f);
generalPath.curveTo(45.9f, 74.3f, 47.100002f, 74.4f, 47.9f, 74.700005f);
generalPath.curveTo(48.7f, 75.00001f, 49.300003f, 75.50001f, 49.800003f, 76.200005f);
generalPath.curveTo(50.300003f, 76.9f, 50.500004f, 77.8f, 50.500004f, 78.700005f);
generalPath.curveTo(50.500004f, 79.9f, 50.100002f, 80.9f, 49.400005f, 81.600006f);
generalPath.curveTo(48.700005f, 82.40001f, 47.600006f, 82.90001f, 46.200005f, 83.100006f);
generalPath.curveTo(46.900005f, 83.50001f, 47.500004f, 83.90001f, 47.900005f, 84.40001f);
generalPath.curveTo(48.400005f, 84.90001f, 49.000004f, 85.70001f, 49.700005f, 87.00001f);
generalPath.lineTo(51.600006f, 90.100006f);
generalPath.lineTo(47.700005f, 90.100006f);
generalPath.lineTo(45.400005f, 86.700005f);
generalPath.curveTo(44.600006f, 85.50001f, 44.000004f, 84.700005f, 43.700005f, 84.4f);
generalPath.curveTo(43.400005f, 84.1f, 43.100006f, 83.9f, 42.700005f, 83.700005f);
generalPath.curveTo(42.400005f, 83.600006f, 41.800003f, 83.50001f, 41.100006f, 83.50001f);
generalPath.lineTo(40.400005f, 83.50001f);
generalPath.lineTo(40.400005f, 90.100006f);
generalPath.lineTo(37.400005f, 90.100006f);
generalPath.closePath();
generalPath.moveTo(40.7f, 81.0f);
generalPath.lineTo(43.0f, 81.0f);
generalPath.curveTo(44.5f, 81.0f, 45.5f, 80.9f, 45.9f, 80.8f);
generalPath.curveTo(46.300003f, 80.700005f, 46.600002f, 80.4f, 46.800003f, 80.100006f);
generalPath.curveTo(47.000004f, 79.80001f, 47.100002f, 79.40001f, 47.100002f, 78.90001f);
generalPath.curveTo(47.100002f, 78.40001f, 47.000004f, 77.90001f, 46.7f, 77.600006f);
generalPath.curveTo(46.4f, 77.3f, 46.0f, 77.100006f, 45.5f, 77.00001f);
generalPath.curveTo(45.2f, 77.00001f, 44.5f, 76.90001f, 43.1f, 76.90001f);
generalPath.lineTo(40.6f, 76.90001f);
generalPath.lineTo(40.6f, 81.0f);
generalPath.closePath();
generalPath.moveTo(57.1f, 90.1f);
generalPath.lineTo(57.1f, 77.0f);
generalPath.lineTo(52.399998f, 77.0f);
generalPath.lineTo(52.399998f, 74.3f);
generalPath.lineTo(65.1f, 74.3f);
generalPath.lineTo(65.1f, 77.0f);
generalPath.lineTo(60.399998f, 77.0f);
generalPath.lineTo(60.399998f, 90.1f);
generalPath.lineTo(57.1f, 90.1f);
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
// _0_5
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
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(56.2f, 43.4f);
generalPath.curveTo(55.7f, 43.2f, 55.3f, 43.2f, 54.8f, 43.2f);
generalPath.curveTo(53.6f, 43.3f, 52.5f, 43.9f, 51.3f, 44.0f);
generalPath.curveTo(50.5f, 44.1f, 49.8f, 43.5f, 49.7f, 42.6f);
generalPath.curveTo(49.5f, 39.899998f, 49.600002f, 37.199997f, 49.8f, 34.5f);
generalPath.curveTo(49.8f, 34.1f, 49.5f, 33.8f, 49.2f, 33.8f);
generalPath.curveTo(46.2f, 33.7f, 43.2f, 33.899998f, 40.1f, 34.6f);
generalPath.curveTo(39.3f, 34.8f, 38.6f, 35.399998f, 38.699997f, 36.199997f);
generalPath.curveTo(38.799995f, 37.899998f, 39.899998f, 39.6f, 39.299995f, 41.399998f);
generalPath.curveTo(38.799995f, 42.899998f, 37.599995f, 43.999996f, 36.099995f, 44.199997f);
generalPath.curveTo(34.599995f, 44.499996f, 32.999996f, 43.699997f, 32.099995f, 42.499996f);
generalPath.curveTo(31.099995f, 40.999996f, 31.699995f, 38.999996f, 31.199995f, 37.299995f);
generalPath.curveTo(30.999994f, 36.499996f, 30.199995f, 35.999996f, 29.399996f, 36.099995f);
generalPath.curveTo(26.299995f, 36.299995f, 23.399996f, 36.999996f, 20.499996f, 38.099995f);
generalPath.curveTo(20.099997f, 38.199993f, 19.899996f, 38.599995f, 20.099997f, 38.899994f);
generalPath.curveTo(21.099997f, 41.399994f, 21.999996f, 43.899994f, 22.599997f, 46.599995f);
generalPath.curveTo(22.799997f, 47.399994f, 22.299997f, 48.199993f, 21.499996f, 48.399994f);
generalPath.curveTo(20.299995f, 48.699993f, 18.999996f, 48.399994f, 17.899996f, 48.699993f);
generalPath.curveTo(17.399996f, 48.79999f, 16.999996f, 48.999992f, 16.599997f, 49.29999f);
generalPath.curveTo(15.199997f, 50.09999f, 14.499996f, 51.699993f, 14.699997f, 53.199993f);
generalPath.curveTo(14.899997f, 54.699993f, 15.999997f, 55.899994f, 17.299997f, 56.399994f);
generalPath.curveTo(18.999998f, 56.999992f, 20.599997f, 55.899994f, 22.299997f, 55.799995f);
generalPath.curveTo(23.099997f, 55.699997f, 23.799997f, 56.299995f, 23.899998f, 57.199997f);
generalPath.curveTo(24.099998f, 59.899998f, 23.999998f, 62.6f, 23.799997f, 65.299995f);
generalPath.curveTo(23.799997f, 65.7f, 24.099997f, 65.99999f, 24.399998f, 65.99999f);
generalPath.curveTo(27.399998f, 66.299995f, 30.499998f, 65.899994f, 33.5f, 65.19999f);
generalPath.curveTo(34.3f, 64.99999f, 35.0f, 64.39999f, 34.9f, 63.59999f);
generalPath.curveTo(34.800003f, 61.89999f, 33.7f, 60.09999f, 34.2f, 58.39999f);
generalPath.curveTo(34.7f, 56.99999f, 36.100002f, 55.79999f, 37.5f, 55.59999f);
generalPath.curveTo(39.0f, 55.39999f, 40.6f, 56.09999f, 41.5f, 57.29999f);
generalPath.curveTo(42.6f, 58.79999f, 41.9f, 60.89999f, 42.4f, 62.499992f);
generalPath.curveTo(42.600002f, 63.29999f, 43.4f, 63.79999f, 44.2f, 63.699993f);
generalPath.curveTo(47.3f, 63.499992f, 50.3f, 62.899994f, 53.1f, 61.699993f);
generalPath.curveTo(53.5f, 61.599995f, 53.699997f, 61.199993f, 53.5f, 60.899994f);
generalPath.curveTo(52.5f, 58.399994f, 51.6f, 55.899994f, 51.0f, 53.199993f);
generalPath.curveTo(50.8f, 52.399994f, 51.3f, 51.599995f, 52.1f, 51.399994f);
generalPath.curveTo(53.8f, 51.099995f, 55.5f, 51.599995f, 57.1f, 50.499992f);
generalPath.curveTo(58.3f, 49.59999f, 59.0f, 48.09999f, 58.699997f, 46.699993f);
generalPath.curveTo(58.699997f, 45.199993f, 57.6f, 43.899994f, 56.199997f, 43.399994f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.75, 66.12200164794922), new Point2D.Double(36.75, 33.891998291015625), new float[] {0.0f,0.024f,0.323f,0.595f,0.83f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(169, 200, 216, 255)) : new Color(169, 200, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 161, 176, 255)) : new Color(129, 161, 176, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 132, 147, 255)) : new Color(100, 132, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(82, 114, 129, 255)) : new Color(82, 114, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_part() {
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
       ext_part base = new ext_part();
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
       ext_part base = new ext_part();
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
        return ext_part::new;
    }
}

