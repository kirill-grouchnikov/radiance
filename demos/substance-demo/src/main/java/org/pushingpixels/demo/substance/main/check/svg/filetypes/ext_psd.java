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
public class ext_psd implements NeonIcon {
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.399994f, 27.9f);
generalPath.lineTo(72.399994f, 99.5f);
generalPath.lineTo(-0.4f, 99.5f);
generalPath.lineTo(-0.4f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 101.0009994506836), new Point2D.Double(36.0, 2.5169999599456787), new float[] {0.0f,0.264f,0.412f,0.53f,0.633f,0.726f,0.812f,0.892f,0.966f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(181, 216, 233, 255)) : new Color(181, 216, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(178, 214, 232, 255)) : new Color(178, 214, 232, 255)),((colorFilter != null) ? colorFilter.filter(new Color(167, 208, 227, 255)) : new Color(167, 208, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(150, 198, 220, 255)) : new Color(150, 198, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(125, 184, 210, 255)) : new Color(125, 184, 210, 255)),((colorFilter != null) ? colorFilter.filter(new Color(93, 167, 197, 255)) : new Color(93, 167, 197, 255)),((colorFilter != null) ? colorFilter.filter(new Color(48, 148, 181, 255)) : new Color(48, 148, 181, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 127, 163, 255)) : new Color(0, 127, 163, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 106, 144, 255)) : new Color(0, 106, 144, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 96, 134, 255)) : new Color(0, 96, 134, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.lineTo(72.399994f, 27.9f);
generalPath.lineTo(72.399994f, 99.5f);
generalPath.lineTo(-0.4f, 99.5f);
generalPath.lineTo(-0.4f, 1.0f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(54, 108, 129, 255)) : new Color(54, 108, 129, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.399994f, 27.9f);
generalPath.lineTo(72.399994f, 99.5f);
generalPath.lineTo(-0.4f, 99.5f);
generalPath.lineTo(-0.4f, 1.0f);
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
generalPath.moveTo(9.0f, 91.5f);
generalPath.lineTo(9.0f, 71.6f);
generalPath.lineTo(15.6f, 71.6f);
generalPath.curveTo(18.1f, 71.6f, 19.7f, 71.7f, 20.5f, 71.9f);
generalPath.curveTo(21.7f, 72.200005f, 22.6f, 72.9f, 23.4f, 73.9f);
generalPath.curveTo(24.199999f, 74.9f, 24.6f, 76.200005f, 24.6f, 77.8f);
generalPath.curveTo(24.6f, 79.0f, 24.4f, 80.100006f, 23.9f, 80.9f);
generalPath.curveTo(23.4f, 81.700005f, 22.9f, 82.4f, 22.199999f, 82.9f);
generalPath.curveTo(21.499998f, 83.4f, 20.8f, 83.700005f, 20.099998f, 83.8f);
generalPath.curveTo(19.099998f, 84.0f, 17.699999f, 84.100006f, 15.899999f, 84.100006f);
generalPath.lineTo(13.199999f, 84.100006f);
generalPath.lineTo(13.199999f, 91.600006f);
generalPath.lineTo(9.0f, 91.600006f);
generalPath.closePath();
generalPath.moveTo(13.1f, 74.9f);
generalPath.lineTo(13.1f, 80.6f);
generalPath.lineTo(15.3f, 80.6f);
generalPath.curveTo(16.9f, 80.6f, 18.0f, 80.5f, 18.5f, 80.299995f);
generalPath.curveTo(19.0f, 80.1f, 19.5f, 79.799995f, 19.8f, 79.299995f);
generalPath.curveTo(20.099998f, 78.799995f, 20.3f, 78.299995f, 20.3f, 77.7f);
generalPath.curveTo(20.3f, 77.0f, 20.099998f, 76.399994f, 19.699999f, 75.899994f);
generalPath.curveTo(19.3f, 75.399994f, 18.699999f, 75.09999f, 18.099998f, 74.99999f);
generalPath.curveTo(17.599998f, 74.899994f, 16.599998f, 74.899994f, 15.199999f, 74.899994f);
generalPath.lineTo(13.099998f, 74.899994f);
generalPath.closePath();
generalPath.moveTo(26.8f, 85.0f);
generalPath.lineTo(30.8f, 84.6f);
generalPath.curveTo(31.0f, 85.9f, 31.5f, 86.9f, 32.3f, 87.5f);
generalPath.curveTo(33.0f, 88.1f, 34.0f, 88.4f, 35.3f, 88.4f);
generalPath.curveTo(36.6f, 88.4f, 37.6f, 88.1f, 38.3f, 87.6f);
generalPath.curveTo(39.0f, 87.1f, 39.3f, 86.4f, 39.3f, 85.7f);
generalPath.curveTo(39.3f, 85.2f, 39.2f, 84.799995f, 38.899998f, 84.5f);
generalPath.curveTo(38.599995f, 84.200005f, 38.1f, 83.9f, 37.399998f, 83.6f);
generalPath.curveTo(36.899998f, 83.4f, 35.8f, 83.1f, 34.1f, 82.7f);
generalPath.curveTo(31.899998f, 82.2f, 30.399998f, 81.5f, 29.499998f, 80.7f);
generalPath.curveTo(28.299997f, 79.6f, 27.599998f, 78.299995f, 27.599998f, 76.7f);
generalPath.curveTo(27.599998f, 75.7f, 27.899998f, 74.7f, 28.499998f, 73.899994f);
generalPath.curveTo(29.099998f, 72.99999f, 29.899998f, 72.299995f, 30.999998f, 71.899994f);
generalPath.curveTo(32.1f, 71.399994f, 33.399998f, 71.2f, 35.0f, 71.2f);
generalPath.curveTo(37.5f, 71.2f, 39.5f, 71.7f, 40.7f, 72.799995f);
generalPath.curveTo(42.0f, 73.899994f, 42.7f, 75.399994f, 42.7f, 77.2f);
generalPath.lineTo(38.600002f, 77.399994f);
generalPath.curveTo(38.4f, 76.399994f, 38.100002f, 75.59999f, 37.500004f, 75.2f);
generalPath.curveTo(36.900005f, 74.799995f, 36.100002f, 74.5f, 34.900005f, 74.5f);
generalPath.curveTo(33.700005f, 74.5f, 32.800007f, 74.7f, 32.100006f, 75.2f);
generalPath.curveTo(31.700006f, 75.5f, 31.500006f, 75.899994f, 31.500006f, 76.399994f);
generalPath.curveTo(31.500006f, 76.899994f, 31.700006f, 77.299995f, 32.100006f, 77.59999f);
generalPath.curveTo(32.600006f, 77.99999f, 33.900005f, 78.49999f, 35.900005f, 78.899994f);
generalPath.curveTo(37.900005f, 79.399994f, 39.400005f, 79.799995f, 40.300007f, 80.299995f);
generalPath.curveTo(41.300007f, 80.799995f, 42.000008f, 81.49999f, 42.500008f, 82.299995f);
generalPath.curveTo(43.000008f, 83.2f, 43.300007f, 84.2f, 43.300007f, 85.49999f);
generalPath.curveTo(43.300007f, 86.59999f, 43.000008f, 87.69999f, 42.300007f, 88.69999f);
generalPath.curveTo(41.600006f, 89.69999f, 40.70001f, 90.39999f, 39.600006f, 90.89999f);
generalPath.curveTo(38.400005f, 91.39999f, 37.000008f, 91.59998f, 35.200005f, 91.59998f);
generalPath.curveTo(32.600006f, 91.59998f, 30.700005f, 90.999985f, 29.300005f, 89.89999f);
generalPath.curveTo(27.900005f, 88.999985f, 27.100004f, 87.29999f, 26.800005f, 84.999985f);
generalPath.closePath();
generalPath.moveTo(46.699997f, 71.6f);
generalPath.lineTo(54.199997f, 71.6f);
generalPath.curveTo(55.899998f, 71.6f, 57.199997f, 71.7f, 58.1f, 72.0f);
generalPath.curveTo(59.3f, 72.3f, 60.3f, 73.0f, 61.199997f, 73.8f);
generalPath.curveTo(61.999996f, 74.700005f, 62.699997f, 75.8f, 63.1f, 77.0f);
generalPath.curveTo(63.5f, 78.3f, 63.8f, 79.8f, 63.8f, 81.7f);
generalPath.curveTo(63.8f, 83.299995f, 63.6f, 84.799995f, 63.2f, 85.899994f);
generalPath.curveTo(62.7f, 87.399994f, 62.0f, 88.49999f, 61.0f, 89.399994f);
generalPath.curveTo(60.3f, 90.09999f, 59.3f, 90.59999f, 58.1f, 90.99999f);
generalPath.curveTo(57.199997f, 91.299995f, 56.0f, 91.399994f, 54.5f, 91.399994f);
generalPath.lineTo(46.8f, 91.399994f);
generalPath.lineTo(46.8f, 71.6f);
generalPath.closePath();
generalPath.moveTo(50.799995f, 74.9f);
generalPath.lineTo(50.799995f, 88.1f);
generalPath.lineTo(53.899994f, 88.1f);
generalPath.curveTo(54.999992f, 88.1f, 55.899994f, 88.0f, 56.399994f, 87.9f);
generalPath.curveTo(57.099995f, 87.700005f, 57.599995f, 87.5f, 58.099995f, 87.1f);
generalPath.curveTo(58.499996f, 86.7f, 58.899994f, 86.1f, 59.199993f, 85.2f);
generalPath.curveTo(59.499992f, 84.299995f, 59.599995f, 83.1f, 59.599995f, 81.5f);
generalPath.curveTo(59.599995f, 80.0f, 59.499996f, 78.8f, 59.199993f, 78.0f);
generalPath.curveTo(58.89999f, 77.2f, 58.499992f, 76.5f, 57.999992f, 76.1f);
generalPath.curveTo(57.499992f, 75.6f, 56.899994f, 75.299995f, 56.09999f, 75.2f);
generalPath.curveTo(55.499992f, 75.1f, 54.39999f, 75.0f, 52.69999f, 75.0f);
generalPath.lineTo(50.799988f, 75.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.399994f, 27.9f);
generalPath.lineTo(45.1f, 27.9f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.19900131225586, 74.03600311279297), new Point2D.Double(58.84000015258789, 87.677001953125), new float[] {0.0f,0.357f,0.494f,0.593f,0.673f,0.743f,0.805f,0.861f,0.913f,0.959f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(235, 243, 248, 255)) : new Color(235, 243, 248, 255)),((colorFilter != null) ? colorFilter.filter(new Color(232, 242, 247, 255)) : new Color(232, 242, 247, 255)),((colorFilter != null) ? colorFilter.filter(new Color(223, 237, 244, 255)) : new Color(223, 237, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(208, 229, 240, 255)) : new Color(208, 229, 240, 255)),((colorFilter != null) ? colorFilter.filter(new Color(187, 218, 233, 255)) : new Color(187, 218, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 204, 225, 255)) : new Color(160, 204, 225, 255)),((colorFilter != null) ? colorFilter.filter(new Color(127, 188, 216, 255)) : new Color(127, 188, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(87, 171, 204, 255)) : new Color(87, 171, 204, 255)),((colorFilter != null) ? colorFilter.filter(new Color(11, 153, 191, 255)) : new Color(11, 153, 191, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 135, 177, 255)) : new Color(0, 135, 177, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 118, 163, 255)) : new Color(0, 118, 163, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.399994f, 27.9f);
generalPath.lineTo(45.1f, 27.9f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(52, 106, 128, 255)) : new Color(52, 106, 128, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.399994f, 27.9f);
generalPath.lineTo(45.1f, 27.9f);
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
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(48.9f, 58.2f);
generalPath.curveTo(49.7f, 58.600002f, 48.300003f, 58.600002f, 48.9f, 58.2f);
generalPath.closePath();
generalPath.moveTo(50.300003f, 61.100002f);
generalPath.curveTo(51.4f, 63.500004f, 52.9f, 65.4f, 54.000004f, 67.8f);
generalPath.curveTo(54.800003f, 66.9f, 52.600002f, 65.8f, 53.300003f, 64.4f);
generalPath.curveTo(52.300003f, 63.600002f, 52.300003f, 60.7f, 50.300003f, 61.100002f);
generalPath.closePath();
generalPath.moveTo(31.7f, 34.5f);
generalPath.curveTo(30.1f, 36.0f, 27.0f, 36.7f, 24.1f, 36.5f);
generalPath.curveTo(24.0f, 37.2f, 24.7f, 37.5f, 25.1f, 38.0f);
generalPath.curveTo(27.800001f, 41.4f, 30.7f, 45.5f, 33.3f, 49.0f);
generalPath.curveTo(37.8f, 48.7f, 40.2f, 50.6f, 43.0f, 51.9f);
generalPath.curveTo(40.7f, 51.300003f, 37.7f, 49.9f, 34.1f, 50.100002f);
generalPath.curveTo(35.6f, 51.7f, 36.3f, 53.800003f, 38.199997f, 55.2f);
generalPath.curveTo(40.399998f, 56.8f, 43.799995f, 55.9f, 46.899998f, 56.8f);
generalPath.curveTo(47.499996f, 56.899998f, 47.499996f, 57.7f, 47.999996f, 57.8f);
generalPath.curveTo(48.499996f, 57.6f, 47.799995f, 56.899998f, 47.499996f, 56.5f);
generalPath.curveTo(38.299995f, 41.9f, 28.899996f, 25.9f, 16.199997f, 14.5f);
generalPath.curveTo(30.899998f, 24.6f, 38.899998f, 41.3f, 48.6f, 56.3f);
generalPath.curveTo(48.699997f, 54.8f, 49.5f, 53.2f, 49.399998f, 51.6f);
generalPath.curveTo(49.3f, 50.1f, 48.499996f, 48.8f, 47.8f, 47.5f);
generalPath.curveTo(47.1f, 46.2f, 46.5f, 44.8f, 45.5f, 44.1f);
generalPath.curveTo(45.4f, 46.5f, 45.7f, 48.5f, 46.2f, 50.3f);
generalPath.curveTo(45.2f, 48.3f, 44.100002f, 45.5f, 44.9f, 42.6f);
generalPath.curveTo(40.2f, 35.6f, 35.4f, 27.599998f, 29.7f, 21.8f);
generalPath.curveTo(29.900002f, 23.3f, 30.300001f, 24.599998f, 30.2f, 26.4f);
generalPath.curveTo(29.5f, 24.8f, 29.5f, 22.6f, 28.900002f, 20.9f);
generalPath.curveTo(26.500002f, 18.5f, 23.800001f, 16.5f, 21.000002f, 14.5f);
generalPath.curveTo(20.600002f, 15.0f, 20.700003f, 15.9f, 20.500002f, 16.6f);
generalPath.curveTo(20.200003f, 15.8f, 20.200003f, 14.700001f, 20.000002f, 13.8f);
generalPath.curveTo(18.400002f, 12.900001f, 16.700003f, 12.0f, 14.700002f, 11.200001f);
generalPath.curveTo(12.900002f, 10.500001f, 10.900002f, 9.200001f, 8.600002f, 10.1f);
generalPath.curveTo(8.500002f, 11.700001f, 9.100002f, 12.6f, 9.300002f, 14.0f);
generalPath.curveTo(10.4000025f, 15.1f, 12.300002f, 15.3f, 14.600002f, 15.1f);
generalPath.curveTo(13.300002f, 15.6f, 11.200003f, 15.5f, 10.000002f, 14.900001f);
generalPath.curveTo(10.200002f, 17.0f, 11.500002f, 18.7f, 12.400002f, 20.400002f);
generalPath.curveTo(15.300001f, 25.500002f, 18.800001f, 30.400002f, 22.600002f, 34.800003f);
generalPath.curveTo(25.500002f, 35.800003f, 29.300003f, 35.600002f, 31.700003f, 34.500004f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(517.302978515625, 63.152000427246094), new Point2D.Double(562.9299926757812, 63.152000427246094), new float[] {0.0f,0.188f,0.377f,0.567f,0.758f,0.947f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(68, 158, 192, 255)) : new Color(68, 158, 192, 255)),((colorFilter != null) ? colorFilter.filter(new Color(62, 156, 189, 255)) : new Color(62, 156, 189, 255)),((colorFilter != null) ? colorFilter.filter(new Color(40, 148, 183, 255)) : new Color(40, 148, 183, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 137, 173, 255)) : new Color(0, 137, 173, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 122, 159, 255)) : new Color(0, 122, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 104, 143, 255)) : new Color(0, 104, 143, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 99, 138, 255)) : new Color(0, 99, 138, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-1.0f, 0.0f, 0.0f, -1.0f, 571.6480102539062f, 102.0f));
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
        return 0.12599998712539673;
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
		return 0.7479999661445618;
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
	private ext_psd() {
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
       ext_psd base = new ext_psd();
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
       ext_psd base = new ext_psd();
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
        return ext_psd::new;
    }
}

