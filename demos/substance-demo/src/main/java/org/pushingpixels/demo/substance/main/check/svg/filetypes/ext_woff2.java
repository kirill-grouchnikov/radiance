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
public class ext_woff2 implements NeonIcon {
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
generalPath.lineTo(71.9f, 27.7f);
generalPath.lineTo(71.9f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(190, 192, 219, 255)) : new Color(190, 192, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(206, 205, 230, 255)) : new Color(206, 205, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(225, 220, 243, 255)) : new Color(225, 220, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(239, 230, 251, 255)) : new Color(239, 230, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(245, 245, 255, 255)) : new Color(245, 245, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.lineTo(71.9f, 27.7f);
generalPath.lineTo(71.9f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 135, 161, 255)) : new Color(113, 135, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(71.9f, 27.7f);
generalPath.lineTo(71.9f, 99.0f);
generalPath.lineTo(0.1f, 99.0f);
generalPath.lineTo(0.1f, 1.0f);
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
generalPath.moveTo(44.7f, 1.0f);
generalPath.lineTo(71.6f, 27.7f);
generalPath.lineTo(44.7f, 27.7f);
generalPath.lineTo(44.7f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.75400161743164, 74.23400115966797), new Point2D.Double(58.198001861572266, 87.677001953125), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 245, 255, 255)) : new Color(255, 245, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 241, 251, 255)) : new Color(250, 241, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 231, 244, 255)) : new Color(237, 231, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 219, 233, 255)) : new Color(221, 219, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 201, 218, 255)) : new Color(199, 201, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 179, 199, 255)) : new Color(173, 179, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 145, 176, 255)) : new Color(146, 145, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.7f, 1.0f);
generalPath.lineTo(71.6f, 27.7f);
generalPath.lineTo(44.7f, 27.7f);
generalPath.lineTo(44.7f, 1.0f);
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
generalPath.moveTo(44.7f, 1.0f);
generalPath.lineTo(71.6f, 27.7f);
generalPath.lineTo(44.7f, 27.7f);
generalPath.lineTo(44.7f, 1.0f);
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
generalPath.moveTo(26.9f, 49.3f);
generalPath.lineTo(16.5f, 49.3f);
generalPath.lineTo(15.3f, 52.1f);
generalPath.curveTo(14.900001f, 53.0f, 14.7f, 53.8f, 14.7f, 54.399998f);
generalPath.curveTo(14.7f, 55.199997f, 15.0f, 55.8f, 15.7f, 56.199997f);
generalPath.curveTo(16.1f, 56.399998f, 17.1f, 56.6f, 18.6f, 56.699997f);
generalPath.lineTo(18.6f, 57.499996f);
generalPath.lineTo(8.7f, 57.499996f);
generalPath.lineTo(8.7f, 56.699997f);
generalPath.curveTo(9.8f, 56.499996f, 10.599999f, 56.1f, 11.299999f, 55.399998f);
generalPath.curveTo(11.999999f, 54.699997f, 12.799999f, 53.3f, 13.799999f, 51.1f);
generalPath.lineTo(24.3f, 28.399998f);
generalPath.lineTo(24.699999f, 28.399998f);
generalPath.lineTo(35.3f, 51.799995f);
generalPath.curveTo(36.3f, 53.999996f, 37.1f, 55.399994f, 37.8f, 55.999996f);
generalPath.curveTo(38.3f, 56.399998f, 39.0f, 56.699997f, 39.899998f, 56.799995f);
generalPath.lineTo(39.899998f, 57.599995f);
generalPath.lineTo(25.7f, 57.599995f);
generalPath.lineTo(25.7f, 56.799995f);
generalPath.lineTo(26.300001f, 56.799995f);
generalPath.curveTo(27.400002f, 56.799995f, 28.2f, 56.599995f, 28.7f, 56.299995f);
generalPath.curveTo(29.0f, 56.099995f, 29.2f, 55.799995f, 29.2f, 55.299995f);
generalPath.curveTo(29.2f, 54.999996f, 29.2f, 54.799995f, 29.1f, 54.499996f);
generalPath.curveTo(29.1f, 54.399998f, 28.9f, 53.799995f, 28.4f, 52.899998f);
generalPath.lineTo(26.9f, 49.3f);
generalPath.closePath();
generalPath.moveTo(26.1f, 47.7f);
generalPath.lineTo(21.7f, 37.9f);
generalPath.lineTo(17.2f, 47.7f);
generalPath.lineTo(26.1f, 47.7f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255);
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
generalPath.moveTo(62.1f, 38.6f);
generalPath.lineTo(57.899998f, 52.6f);
generalPath.lineTo(57.499996f, 54.3f);
generalPath.curveTo(57.499996f, 54.5f, 57.399998f, 54.7f, 57.399998f, 54.8f);
generalPath.curveTo(57.399998f, 55.0f, 57.499996f, 55.1f, 57.6f, 55.2f);
generalPath.curveTo(57.699997f, 55.3f, 57.8f, 55.4f, 58.0f, 55.4f);
generalPath.curveTo(58.3f, 55.4f, 58.7f, 55.2f, 59.3f, 54.7f);
generalPath.curveTo(59.5f, 54.5f, 60.0f, 53.9f, 60.899998f, 52.8f);
generalPath.lineTo(61.699997f, 53.2f);
generalPath.curveTo(60.699997f, 55.0f, 59.6f, 56.3f, 58.399998f, 57.2f);
generalPath.curveTo(57.199997f, 58.0f, 55.999996f, 58.4f, 54.6f, 58.4f);
generalPath.curveTo(53.8f, 58.4f, 53.1f, 58.2f, 52.699997f, 57.800003f);
generalPath.curveTo(52.299995f, 57.4f, 51.999996f, 56.9f, 51.999996f, 56.200005f);
generalPath.curveTo(51.999996f, 55.700005f, 52.199997f, 54.600006f, 52.699997f, 53.200005f);
generalPath.lineTo(53.199997f, 51.500004f);
generalPath.curveTo(51.499996f, 54.300003f, 49.899998f, 56.300003f, 48.399998f, 57.400005f);
generalPath.curveTo(47.499996f, 58.100006f, 46.499996f, 58.400005f, 45.499996f, 58.400005f);
generalPath.curveTo(44.199997f, 58.400005f, 43.199997f, 57.900005f, 42.599995f, 56.800007f);
generalPath.curveTo(41.999996f, 55.70001f, 41.699993f, 54.600006f, 41.699993f, 53.20001f);
generalPath.curveTo(41.699993f, 51.20001f, 42.29999f, 49.000008f, 43.599995f, 46.40001f);
generalPath.curveTo(44.899998f, 43.80001f, 46.499996f, 41.80001f, 48.499996f, 40.20001f);
generalPath.curveTo(50.199997f, 38.90001f, 51.699997f, 38.300007f, 53.199997f, 38.300007f);
generalPath.curveTo(53.999996f, 38.300007f, 54.699997f, 38.500008f, 55.199997f, 39.000008f);
generalPath.curveTo(55.699997f, 39.500008f, 56.1f, 40.300007f, 56.299995f, 41.500008f);
generalPath.lineTo(57.099995f, 38.90001f);
generalPath.lineTo(62.099995f, 38.60001f);
generalPath.closePath();
generalPath.moveTo(55.1f, 42.6f);
generalPath.curveTo(55.1f, 41.5f, 54.899998f, 40.6f, 54.6f, 40.1f);
generalPath.curveTo(54.3f, 39.699997f, 54.0f, 39.6f, 53.5f, 39.6f);
generalPath.curveTo(53.1f, 39.6f, 52.6f, 39.8f, 52.1f, 40.199997f);
generalPath.curveTo(51.1f, 41.1f, 50.1f, 42.799995f, 49.0f, 45.499996f);
generalPath.curveTo(47.9f, 48.199997f, 47.3f, 50.399998f, 47.3f, 52.399998f);
generalPath.curveTo(47.3f, 53.1f, 47.399998f, 53.699997f, 47.7f, 53.999996f);
generalPath.curveTo(48.0f, 54.299995f, 48.2f, 54.499996f, 48.5f, 54.499996f);
generalPath.curveTo(49.2f, 54.499996f, 49.8f, 54.099995f, 50.5f, 53.399998f);
generalPath.curveTo(51.5f, 52.399998f, 52.3f, 51.1f, 53.1f, 49.6f);
generalPath.curveTo(54.399998f, 47.0f, 55.1f, 44.699997f, 55.1f, 42.6f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(54, 69, 77, 255)) : new Color(54, 69, 77, 255);
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
generalPath.moveTo(9.4f, 91.1f);
generalPath.lineTo(6.5f, 78.9f);
generalPath.lineTo(9.0f, 78.9f);
generalPath.lineTo(10.8f, 87.3f);
generalPath.lineTo(13.0f, 78.9f);
generalPath.lineTo(16.0f, 78.9f);
generalPath.lineTo(18.1f, 87.4f);
generalPath.lineTo(20.0f, 78.9f);
generalPath.lineTo(22.5f, 78.9f);
generalPath.lineTo(19.5f, 91.1f);
generalPath.lineTo(16.9f, 91.1f);
generalPath.lineTo(14.5f, 82.0f);
generalPath.lineTo(12.1f, 91.1f);
generalPath.lineTo(9.4f, 91.1f);
generalPath.closePath();
generalPath.moveTo(23.3f, 85.1f);
generalPath.curveTo(23.3f, 83.9f, 23.5f, 82.799995f, 23.9f, 82.0f);
generalPath.curveTo(24.199999f, 81.4f, 24.6f, 80.8f, 25.0f, 80.3f);
generalPath.curveTo(25.5f, 79.8f, 26.0f, 79.4f, 26.6f, 79.200005f);
generalPath.curveTo(27.4f, 78.9f, 28.2f, 78.700005f, 29.2f, 78.700005f);
generalPath.curveTo(31.0f, 78.700005f, 32.4f, 79.3f, 33.5f, 80.4f);
generalPath.curveTo(34.6f, 81.5f, 35.1f, 83.1f, 35.1f, 85.0f);
generalPath.curveTo(35.1f, 87.0f, 34.6f, 88.5f, 33.5f, 89.6f);
generalPath.curveTo(32.4f, 90.7f, 31.0f, 91.299995f, 29.2f, 91.299995f);
generalPath.curveTo(27.400002f, 91.299995f, 25.900002f, 90.7f, 24.900002f, 89.6f);
generalPath.curveTo(23.800001f, 88.5f, 23.300001f, 87.0f, 23.300001f, 85.1f);
generalPath.closePath();
generalPath.moveTo(25.8f, 85.0f);
generalPath.curveTo(25.8f, 86.4f, 26.099998f, 87.4f, 26.8f, 88.1f);
generalPath.curveTo(27.5f, 88.799995f, 28.3f, 89.2f, 29.199999f, 89.2f);
generalPath.curveTo(30.099998f, 89.2f, 30.999998f, 88.799995f, 31.599998f, 88.1f);
generalPath.curveTo(32.199997f, 87.4f, 32.5f, 86.299995f, 32.5f, 84.9f);
generalPath.curveTo(32.5f, 83.5f, 32.2f, 82.5f, 31.6f, 81.8f);
generalPath.curveTo(31.0f, 81.100006f, 30.2f, 80.8f, 29.1f, 80.8f);
generalPath.curveTo(28.1f, 80.8f, 27.300001f, 81.100006f, 26.6f, 81.8f);
generalPath.curveTo(25.9f, 82.5f, 25.800001f, 83.600006f, 25.800001f, 85.0f);
generalPath.closePath();
generalPath.moveTo(37.1f, 91.1f);
generalPath.lineTo(37.1f, 78.9f);
generalPath.lineTo(45.5f, 78.9f);
generalPath.lineTo(45.5f, 81.0f);
generalPath.lineTo(39.6f, 81.0f);
generalPath.lineTo(39.6f, 83.9f);
generalPath.lineTo(44.699997f, 83.9f);
generalPath.lineTo(44.699997f, 86.0f);
generalPath.lineTo(39.6f, 86.0f);
generalPath.lineTo(39.6f, 91.2f);
generalPath.lineTo(37.1f, 91.2f);
generalPath.closePath();
generalPath.moveTo(47.6f, 91.1f);
generalPath.lineTo(47.6f, 78.9f);
generalPath.lineTo(56.0f, 78.9f);
generalPath.lineTo(56.0f, 81.0f);
generalPath.lineTo(50.0f, 81.0f);
generalPath.lineTo(50.0f, 83.9f);
generalPath.lineTo(55.1f, 83.9f);
generalPath.lineTo(55.1f, 86.0f);
generalPath.lineTo(50.0f, 86.0f);
generalPath.lineTo(50.0f, 91.2f);
generalPath.lineTo(47.6f, 91.2f);
generalPath.closePath();
generalPath.moveTo(65.399994f, 88.9f);
generalPath.lineTo(65.399994f, 91.1f);
generalPath.lineTo(57.199993f, 91.1f);
generalPath.curveTo(57.29999f, 90.299995f, 57.599995f, 89.5f, 57.999992f, 88.799995f);
generalPath.curveTo(58.39999f, 88.09999f, 59.29999f, 87.1f, 60.59999f, 85.899994f);
generalPath.curveTo(61.69999f, 84.899994f, 62.29999f, 84.299995f, 62.499992f, 83.899994f);
generalPath.curveTo(62.79999f, 83.399994f, 62.999992f, 82.899994f, 62.999992f, 82.49999f);
generalPath.curveTo(62.999992f, 81.99999f, 62.899994f, 81.59999f, 62.59999f, 81.299995f);
generalPath.curveTo(62.29999f, 80.99999f, 61.89999f, 80.899994f, 61.39999f, 80.899994f);
generalPath.curveTo(60.89999f, 80.899994f, 60.49999f, 80.99999f, 60.19999f, 81.299995f);
generalPath.curveTo(59.89999f, 81.6f, 59.69999f, 82.1f, 59.69999f, 82.799995f);
generalPath.lineTo(57.39999f, 82.6f);
generalPath.curveTo(57.49999f, 81.299995f, 57.99999f, 80.4f, 58.69999f, 79.799995f);
generalPath.curveTo(59.39999f, 79.2f, 60.39999f, 78.99999f, 61.49999f, 78.99999f);
generalPath.curveTo(62.69999f, 78.99999f, 63.69999f, 79.299995f, 64.29999f, 79.99999f);
generalPath.curveTo(64.999985f, 80.59999f, 65.29999f, 81.49999f, 65.29999f, 82.399994f);
generalPath.curveTo(65.29999f, 82.899994f, 65.19999f, 83.49999f, 64.999985f, 83.99999f);
generalPath.curveTo(64.79999f, 84.49999f, 64.499985f, 84.99999f, 64.09998f, 85.59999f);
generalPath.curveTo(63.799984f, 85.99999f, 63.299984f, 86.49999f, 62.599983f, 87.19999f);
generalPath.curveTo(61.899982f, 87.89999f, 61.399982f, 88.29999f, 61.19998f, 88.49999f);
generalPath.curveTo(60.99998f, 88.69999f, 60.79998f, 88.899994f, 60.69998f, 89.09999f);
generalPath.lineTo(65.39998f, 89.09999f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 98, 123, 255)) : new Color(76, 98, 123, 255);
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
		return 0.7380000352859497;
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
	private ext_woff2() {
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
       ext_woff2 base = new ext_woff2();
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
       ext_woff2 base = new ext_woff2();
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
        return ext_woff2::new;
    }
}

