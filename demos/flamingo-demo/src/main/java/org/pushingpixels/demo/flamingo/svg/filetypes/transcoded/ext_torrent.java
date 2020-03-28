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
public class ext_torrent implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.0), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(58.8f, 58.5f);
generalPath.curveTo(58.5f, 59.6f, 57.8f, 60.4f, 57.0f, 61.2f);
generalPath.curveTo(45.6f, 73.1f, 26.0f, 70.8f, 17.7f, 56.600002f);
generalPath.curveTo(15.500001f, 52.800003f, 14.200001f, 48.800003f, 14.400001f, 44.4f);
generalPath.curveTo(14.6f, 38.9f, 16.5f, 34.0f, 19.900002f, 29.7f);
generalPath.curveTo(24.000002f, 24.5f, 29.2f, 21.1f, 35.800003f, 19.900002f);
generalPath.curveTo(37.4f, 19.600002f, 39.000004f, 19.500002f, 40.600002f, 19.300001f);
generalPath.lineTo(40.600002f, 23.900002f);
generalPath.curveTo(39.500004f, 24.000002f, 38.4f, 24.100002f, 37.300003f, 24.300001f);
generalPath.curveTo(28.000004f, 25.6f, 20.100002f, 33.5f, 19.400003f, 42.6f);
generalPath.curveTo(19.000004f, 48.3f, 20.500004f, 53.399998f, 24.300003f, 57.8f);
generalPath.curveTo(25.800003f, 59.6f, 27.500004f, 61.2f, 29.600002f, 62.3f);
generalPath.curveTo(30.200003f, 62.6f, 30.900002f, 62.7f, 31.600002f, 62.8f);
generalPath.curveTo(25.700003f, 59.3f, 22.200003f, 54.199997f, 21.100002f, 47.5f);
generalPath.curveTo(20.300003f, 43.0f, 21.200003f, 38.8f, 23.700003f, 34.9f);
generalPath.curveTo(30.0f, 25.1f, 41.0f, 23.6f, 48.5f, 26.8f);
generalPath.curveTo(47.9f, 28.099998f, 47.3f, 29.5f, 46.7f, 30.699999f);
generalPath.curveTo(45.2f, 30.4f, 43.7f, 29.999998f, 42.2f, 29.9f);
generalPath.curveTo(37.9f, 29.6f, 34.0f, 30.699999f, 30.800001f, 33.7f);
generalPath.curveTo(22.600002f, 41.2f, 24.800001f, 52.800003f, 32.600002f, 58.0f);
generalPath.curveTo(35.100002f, 59.7f, 37.800003f, 60.9f, 40.800003f, 61.6f);
generalPath.curveTo(41.500004f, 61.8f, 42.300003f, 61.6f, 43.100002f, 61.5f);
generalPath.curveTo(43.000004f, 61.4f, 42.800003f, 61.4f, 42.7f, 61.4f);
generalPath.curveTo(39.0f, 60.7f, 35.5f, 59.4f, 32.6f, 56.800003f);
generalPath.curveTo(29.599998f, 54.200005f, 27.399998f, 51.000004f, 27.099998f, 46.9f);
generalPath.curveTo(26.699999f, 41.100002f, 28.899998f, 36.4f, 33.899998f, 33.4f);
generalPath.curveTo(38.199997f, 30.7f, 42.799995f, 30.7f, 47.399998f, 32.9f);
generalPath.curveTo(49.999996f, 34.100002f, 51.899998f, 36.100002f, 53.3f, 38.600002f);
generalPath.curveTo(52.0f, 39.300003f, 50.7f, 40.000004f, 49.5f, 40.600002f);
generalPath.curveTo(48.4f, 39.500004f, 47.4f, 38.300003f, 46.2f, 37.500004f);
generalPath.curveTo(40.4f, 33.600002f, 32.300003f, 37.300003f, 31.7f, 44.500004f);
generalPath.curveTo(31.400002f, 48.100002f, 32.9f, 50.800003f, 35.4f, 53.200005f);
generalPath.curveTo(38.4f, 55.900005f, 42.0f, 56.900005f, 45.9f, 57.400005f);
generalPath.curveTo(49.7f, 57.900005f, 53.600002f, 57.800007f, 57.4f, 57.300007f);
generalPath.curveTo(58.2f, 57.20001f, 58.5f, 57.70001f, 58.800003f, 58.300007f);
generalPath.lineTo(58.800003f, 58.500008f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(14.380000114440918, 44.07899856567383), new Point2D.Double(58.79999923706055, 44.07899856567383), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 74.18699645996094), new Point2D.Double(58.5369987487793, 87.68699645996094), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(7.4f, 91.5f);
generalPath.lineTo(7.4f, 83.8f);
generalPath.lineTo(4.7f, 83.8f);
generalPath.lineTo(4.7f, 82.200005f);
generalPath.lineTo(12.2f, 82.200005f);
generalPath.lineTo(12.2f, 83.8f);
generalPath.lineTo(9.3f, 83.8f);
generalPath.lineTo(9.3f, 91.5f);
generalPath.lineTo(7.4f, 91.5f);
generalPath.closePath();
generalPath.moveTo(12.700001f, 86.9f);
generalPath.curveTo(12.700001f, 86.0f, 12.800001f, 85.200005f, 13.1f, 84.5f);
generalPath.curveTo(13.3f, 84.0f, 13.6f, 83.6f, 14.0f, 83.2f);
generalPath.curveTo(14.4f, 82.799995f, 14.8f, 82.5f, 15.2f, 82.399994f);
generalPath.curveTo(15.8f, 82.2f, 16.5f, 81.99999f, 17.2f, 81.99999f);
generalPath.curveTo(18.6f, 81.99999f, 19.7f, 82.399994f, 20.5f, 83.299995f);
generalPath.curveTo(21.3f, 84.2f, 21.7f, 85.299995f, 21.7f, 86.799995f);
generalPath.curveTo(21.7f, 88.299995f, 21.300001f, 89.49999f, 20.5f, 90.299995f);
generalPath.curveTo(19.7f, 91.1f, 18.6f, 91.6f, 17.2f, 91.6f);
generalPath.curveTo(15.800001f, 91.6f, 14.700001f, 91.2f, 13.900001f, 90.299995f);
generalPath.curveTo(13.1f, 89.6f, 12.700001f, 88.399994f, 12.700001f, 86.899994f);
generalPath.closePath();
generalPath.moveTo(14.700001f, 86.9f);
generalPath.curveTo(14.700001f, 88.0f, 14.900001f, 88.8f, 15.400001f, 89.3f);
generalPath.curveTo(15.900001f, 89.8f, 16.5f, 90.100006f, 17.300001f, 90.100006f);
generalPath.curveTo(18.1f, 90.100006f, 18.7f, 89.8f, 19.2f, 89.3f);
generalPath.curveTo(19.7f, 88.8f, 19.900002f, 88.0f, 19.900002f, 86.9f);
generalPath.curveTo(19.900002f, 85.8f, 19.7f, 85.0f, 19.2f, 84.5f);
generalPath.curveTo(18.7f, 84.0f, 18.1f, 83.7f, 17.300001f, 83.7f);
generalPath.curveTo(16.500002f, 83.7f, 15.900002f, 84.0f, 15.400002f, 84.5f);
generalPath.curveTo(14.900002f, 85.0f, 14.700002f, 85.8f, 14.700002f, 86.9f);
generalPath.closePath();
generalPath.moveTo(23.300001f, 91.5f);
generalPath.lineTo(23.300001f, 82.2f);
generalPath.lineTo(27.300001f, 82.2f);
generalPath.curveTo(28.300001f, 82.2f, 29.000002f, 82.299995f, 29.500002f, 82.5f);
generalPath.curveTo(30.000002f, 82.7f, 30.300001f, 83.0f, 30.600002f, 83.4f);
generalPath.curveTo(30.900003f, 83.8f, 31.000002f, 84.3f, 31.000002f, 84.9f);
generalPath.curveTo(31.000002f, 85.6f, 30.800001f, 86.200005f, 30.400002f, 86.6f);
generalPath.curveTo(30.000002f, 87.1f, 29.400002f, 87.299995f, 28.500002f, 87.5f);
generalPath.curveTo(28.900002f, 87.7f, 29.200003f, 88.0f, 29.500002f, 88.3f);
generalPath.curveTo(29.800001f, 88.600006f, 30.100002f, 89.100006f, 30.600002f, 89.8f);
generalPath.lineTo(31.700003f, 91.600006f);
generalPath.lineTo(29.400003f, 91.600006f);
generalPath.lineTo(28.000004f, 89.600006f);
generalPath.curveTo(27.500004f, 88.90001f, 27.200005f, 88.40001f, 27.000004f, 88.200005f);
generalPath.curveTo(26.800003f, 88.0f, 26.600004f, 87.9f, 26.400003f, 87.8f);
generalPath.curveTo(26.200003f, 87.700005f, 25.900003f, 87.700005f, 25.400003f, 87.700005f);
generalPath.lineTo(25.0f, 87.700005f);
generalPath.lineTo(25.0f, 91.600006f);
generalPath.lineTo(23.3f, 91.600006f);
generalPath.lineTo(23.3f, 91.50001f);
generalPath.closePath();
generalPath.moveTo(25.2f, 86.2f);
generalPath.lineTo(26.6f, 86.2f);
generalPath.curveTo(27.5f, 86.2f, 28.1f, 86.2f, 28.300001f, 86.1f);
generalPath.curveTo(28.500002f, 86.0f, 28.7f, 85.9f, 28.800001f, 85.7f);
generalPath.curveTo(28.900002f, 85.49999f, 29.000002f, 85.299995f, 29.000002f, 85.0f);
generalPath.curveTo(29.000002f, 84.7f, 28.900002f, 84.4f, 28.700003f, 84.2f);
generalPath.curveTo(28.500004f, 83.99999f, 28.300003f, 83.899994f, 28.000002f, 83.799995f);
generalPath.lineTo(25.100002f, 83.799995f);
generalPath.lineTo(25.200003f, 86.2f);
generalPath.closePath();
generalPath.moveTo(32.8f, 91.5f);
generalPath.lineTo(32.8f, 82.2f);
generalPath.lineTo(36.8f, 82.2f);
generalPath.curveTo(37.8f, 82.2f, 38.5f, 82.299995f, 39.0f, 82.5f);
generalPath.curveTo(39.5f, 82.700005f, 39.8f, 83.0f, 40.1f, 83.4f);
generalPath.curveTo(40.399998f, 83.8f, 40.5f, 84.3f, 40.5f, 84.9f);
generalPath.curveTo(40.5f, 85.6f, 40.3f, 86.200005f, 39.9f, 86.6f);
generalPath.curveTo(39.500004f, 86.99999f, 38.9f, 87.299995f, 38.0f, 87.5f);
generalPath.curveTo(38.4f, 87.7f, 38.7f, 88.0f, 39.0f, 88.3f);
generalPath.curveTo(39.3f, 88.600006f, 39.6f, 89.100006f, 40.1f, 89.8f);
generalPath.lineTo(41.199997f, 91.600006f);
generalPath.lineTo(39.0f, 91.600006f);
generalPath.lineTo(37.6f, 89.600006f);
generalPath.curveTo(37.1f, 88.90001f, 36.8f, 88.40001f, 36.6f, 88.200005f);
generalPath.curveTo(36.399998f, 88.0f, 36.199997f, 87.9f, 36.0f, 87.8f);
generalPath.curveTo(35.8f, 87.700005f, 35.5f, 87.700005f, 35.0f, 87.700005f);
generalPath.lineTo(34.6f, 87.700005f);
generalPath.lineTo(34.6f, 91.600006f);
generalPath.lineTo(32.8f, 91.600006f);
generalPath.lineTo(32.8f, 91.50001f);
generalPath.closePath();
generalPath.moveTo(34.7f, 86.2f);
generalPath.lineTo(36.100002f, 86.2f);
generalPath.curveTo(37.000004f, 86.2f, 37.600002f, 86.2f, 37.800003f, 86.1f);
generalPath.curveTo(38.000004f, 86.0f, 38.200005f, 85.9f, 38.300003f, 85.7f);
generalPath.curveTo(38.4f, 85.5f, 38.500004f, 85.299995f, 38.500004f, 85.0f);
generalPath.curveTo(38.500004f, 84.7f, 38.400005f, 84.4f, 38.200005f, 84.2f);
generalPath.curveTo(38.000004f, 83.99999f, 37.800003f, 83.899994f, 37.500004f, 83.799995f);
generalPath.lineTo(34.600002f, 83.799995f);
generalPath.lineTo(34.7f, 86.2f);
generalPath.closePath();
generalPath.moveTo(42.3f, 91.5f);
generalPath.lineTo(42.3f, 82.2f);
generalPath.lineTo(49.3f, 82.2f);
generalPath.lineTo(49.3f, 83.799995f);
generalPath.lineTo(44.2f, 83.799995f);
generalPath.lineTo(44.2f, 85.899994f);
generalPath.lineTo(48.9f, 85.899994f);
generalPath.lineTo(48.9f, 87.49999f);
generalPath.lineTo(44.2f, 87.49999f);
generalPath.lineTo(44.2f, 90.0f);
generalPath.lineTo(49.5f, 90.0f);
generalPath.lineTo(49.5f, 91.6f);
generalPath.lineTo(42.3f, 91.5f);
generalPath.closePath();
generalPath.moveTo(51.1f, 91.5f);
generalPath.lineTo(51.1f, 82.2f);
generalPath.lineTo(52.899998f, 82.2f);
generalPath.lineTo(56.699997f, 88.399994f);
generalPath.lineTo(56.699997f, 82.2f);
generalPath.lineTo(58.499996f, 82.2f);
generalPath.lineTo(58.499996f, 91.5f);
generalPath.lineTo(56.599995f, 91.5f);
generalPath.lineTo(52.799995f, 85.4f);
generalPath.lineTo(52.799995f, 91.5f);
generalPath.lineTo(51.099995f, 91.5f);
generalPath.closePath();
generalPath.moveTo(62.699997f, 91.5f);
generalPath.lineTo(62.699997f, 83.8f);
generalPath.lineTo(59.899998f, 83.8f);
generalPath.lineTo(59.899998f, 82.200005f);
generalPath.lineTo(67.399994f, 82.200005f);
generalPath.lineTo(67.399994f, 83.8f);
generalPath.lineTo(64.59999f, 83.8f);
generalPath.lineTo(64.59999f, 91.5f);
generalPath.lineTo(62.69999f, 91.5f);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
	private ext_torrent() {
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
       ext_torrent base = new ext_torrent();
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
       ext_torrent base = new ext_torrent();
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
        return ext_torrent::new;
    }
}

