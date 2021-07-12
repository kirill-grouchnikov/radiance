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
public class ext_vbs implements NeonIcon {
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
// _0_3
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
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(18.0f, 91.9f);
generalPath.lineTo(11.9f, 74.7f);
generalPath.lineTo(15.7f, 74.7f);
generalPath.lineTo(20.0f, 87.4f);
generalPath.lineTo(24.2f, 74.700005f);
generalPath.lineTo(27.900002f, 74.700005f);
generalPath.lineTo(21.7f, 91.90001f);
generalPath.lineTo(18.0f, 91.90001f);
generalPath.closePath();
generalPath.moveTo(29.7f, 74.7f);
generalPath.lineTo(36.600002f, 74.7f);
generalPath.curveTo(38.000004f, 74.7f, 39.000004f, 74.799995f, 39.600002f, 74.899994f);
generalPath.curveTo(40.2f, 74.99999f, 40.9f, 75.2f, 41.4f, 75.59999f);
generalPath.curveTo(41.9f, 75.999985f, 42.4f, 76.399994f, 42.7f, 76.99999f);
generalPath.curveTo(43.0f, 77.59999f, 43.2f, 78.299995f, 43.2f, 78.99999f);
generalPath.curveTo(43.2f, 79.799995f, 43.0f, 80.49999f, 42.5f, 81.19999f);
generalPath.curveTo(42.0f, 81.89999f, 41.5f, 82.39999f, 40.7f, 82.69999f);
generalPath.curveTo(41.7f, 82.99999f, 42.600002f, 83.49999f, 43.100002f, 84.29999f);
generalPath.curveTo(43.600002f, 85.09998f, 43.9f, 85.89999f, 43.9f, 86.89999f);
generalPath.curveTo(43.9f, 87.69999f, 43.7f, 88.39999f, 43.4f, 89.19999f);
generalPath.curveTo(43.100002f, 89.99999f, 42.7f, 90.49999f, 42.0f, 90.99999f);
generalPath.curveTo(41.3f, 91.49999f, 40.6f, 91.69999f, 39.7f, 91.799995f);
generalPath.curveTo(39.100002f, 91.899994f, 37.7f, 91.899994f, 35.5f, 91.899994f);
generalPath.lineTo(29.7f, 91.899994f);
generalPath.lineTo(29.7f, 74.7f);
generalPath.closePath();
generalPath.moveTo(33.2f, 77.6f);
generalPath.lineTo(33.2f, 81.6f);
generalPath.lineTo(35.5f, 81.6f);
generalPath.curveTo(36.9f, 81.6f, 37.7f, 81.6f, 38.0f, 81.5f);
generalPath.curveTo(38.6f, 81.4f, 39.1f, 81.2f, 39.4f, 80.9f);
generalPath.curveTo(39.700005f, 80.600006f, 39.9f, 80.1f, 39.9f, 79.6f);
generalPath.curveTo(39.9f, 79.1f, 39.800003f, 78.6f, 39.5f, 78.299995f);
generalPath.curveTo(39.199997f, 77.99999f, 38.8f, 77.799995f, 38.2f, 77.7f);
generalPath.curveTo(37.9f, 77.7f, 36.9f, 77.6f, 35.2f, 77.6f);
generalPath.lineTo(33.2f, 77.6f);
generalPath.closePath();
generalPath.moveTo(33.2f, 84.4f);
generalPath.lineTo(33.2f, 89.0f);
generalPath.lineTo(36.4f, 89.0f);
generalPath.curveTo(37.600002f, 89.0f, 38.4f, 89.0f, 38.800003f, 88.9f);
generalPath.curveTo(39.300003f, 88.8f, 39.700005f, 88.6f, 40.100002f, 88.200005f);
generalPath.curveTo(40.5f, 87.80001f, 40.600002f, 87.4f, 40.600002f, 86.700005f);
generalPath.curveTo(40.600002f, 86.200005f, 40.500004f, 85.700005f, 40.2f, 85.4f);
generalPath.curveTo(39.899998f, 85.1f, 39.600002f, 84.8f, 39.100002f, 84.6f);
generalPath.curveTo(38.600002f, 84.399994f, 37.600002f, 84.4f, 36.000004f, 84.4f);
generalPath.lineTo(33.200005f, 84.4f);
generalPath.closePath();
generalPath.moveTo(46.1f, 86.3f);
generalPath.lineTo(49.5f, 86.0f);
generalPath.curveTo(49.7f, 87.1f, 50.1f, 88.0f, 50.7f, 88.5f);
generalPath.curveTo(51.300003f, 89.0f, 52.2f, 89.3f, 53.2f, 89.3f);
generalPath.curveTo(54.3f, 89.3f, 55.2f, 89.100006f, 55.7f, 88.600006f);
generalPath.curveTo(56.2f, 88.100006f, 56.5f, 87.600006f, 56.5f, 86.90001f);
generalPath.curveTo(56.5f, 86.50001f, 56.4f, 86.100006f, 56.1f, 85.90001f);
generalPath.curveTo(55.799995f, 85.70001f, 55.399998f, 85.40001f, 54.899998f, 85.20001f);
generalPath.curveTo(54.499996f, 85.10001f, 53.6f, 84.80001f, 52.1f, 84.40001f);
generalPath.curveTo(50.199997f, 83.90001f, 48.899998f, 83.40001f, 48.199997f, 82.70001f);
generalPath.curveTo(47.1f, 81.80001f, 46.6f, 80.60001f, 46.6f, 79.20001f);
generalPath.curveTo(46.6f, 78.30001f, 46.8f, 77.500015f, 47.3f, 76.70001f);
generalPath.curveTo(47.8f, 75.90001f, 48.5f, 75.40001f, 49.399998f, 75.000015f);
generalPath.curveTo(50.299995f, 74.60002f, 51.499996f, 74.40002f, 52.8f, 74.40002f);
generalPath.curveTo(55.0f, 74.40002f, 56.6f, 74.90002f, 57.7f, 75.80002f);
generalPath.curveTo(58.800003f, 76.70002f, 59.4f, 78.000015f, 59.4f, 79.60002f);
generalPath.lineTo(55.9f, 79.80002f);
generalPath.curveTo(55.800003f, 78.90002f, 55.4f, 78.30002f, 54.9f, 77.90002f);
generalPath.curveTo(54.4f, 77.500015f, 54.0f, 77.30002f, 53.0f, 77.30002f);
generalPath.curveTo(52.0f, 77.30002f, 51.2f, 77.500015f, 50.6f, 77.90002f);
generalPath.curveTo(50.199997f, 78.20002f, 50.0f, 78.500015f, 50.0f, 79.000015f);
generalPath.curveTo(50.0f, 79.40002f, 50.2f, 79.80002f, 50.5f, 80.000015f);
generalPath.curveTo(50.9f, 80.40002f, 52.0f, 80.80002f, 53.7f, 81.10001f);
generalPath.curveTo(55.4f, 81.40001f, 56.600002f, 81.90002f, 57.4f, 82.30001f);
generalPath.curveTo(58.2f, 82.700005f, 58.800003f, 83.30001f, 59.300003f, 84.00001f);
generalPath.curveTo(59.800003f, 84.700005f, 60.000004f, 85.700005f, 60.000004f, 86.700005f);
generalPath.curveTo(60.000004f, 87.700005f, 59.700005f, 88.600006f, 59.200005f, 89.50001f);
generalPath.curveTo(58.700005f, 90.40001f, 58.000004f, 91.100006f, 57.000004f, 91.600006f);
generalPath.curveTo(56.000004f, 92.100006f, 54.800003f, 92.200005f, 53.300003f, 92.200005f);
generalPath.curveTo(51.100002f, 92.200005f, 49.500004f, 91.700005f, 48.300003f, 90.700005f);
generalPath.curveTo(47.100002f, 89.700005f, 46.4f, 88.200005f, 46.100002f, 86.3f);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(15.1f, 33.6f);
generalPath.lineTo(15.1f, 35.0f);
generalPath.lineTo(13.5f, 35.6f);
generalPath.lineTo(13.5f, 34.199997f);
generalPath.lineTo(15.1f, 33.6f);
generalPath.closePath();
generalPath.moveTo(15.1f, 46.8f);
generalPath.lineTo(15.1f, 48.2f);
generalPath.lineTo(13.5f, 48.8f);
generalPath.lineTo(13.5f, 47.399998f);
generalPath.lineTo(15.1f, 46.8f);
generalPath.closePath();
generalPath.moveTo(15.1f, 60.3f);
generalPath.lineTo(15.1f, 61.7f);
generalPath.lineTo(13.5f, 62.3f);
generalPath.lineTo(13.5f, 60.899998f);
generalPath.lineTo(15.1f, 60.3f);
generalPath.closePath();
generalPath.moveTo(15.0f, 38.0f);
generalPath.lineTo(15.0f, 39.3f);
generalPath.lineTo(13.7f, 39.899998f);
generalPath.lineTo(13.7f, 38.6f);
generalPath.lineTo(15.0f, 38.0f);
generalPath.closePath();
generalPath.moveTo(15.0f, 42.4f);
generalPath.lineTo(15.0f, 43.7f);
generalPath.lineTo(13.7f, 44.3f);
generalPath.lineTo(13.7f, 43.0f);
generalPath.lineTo(15.0f, 42.4f);
generalPath.closePath();
generalPath.moveTo(15.0f, 51.4f);
generalPath.lineTo(15.0f, 52.5f);
generalPath.lineTo(13.6f, 53.1f);
generalPath.lineTo(13.6f, 51.8f);
generalPath.curveTo(13.700001f, 51.899998f, 15.0f, 51.399998f, 15.0f, 51.399998f);
generalPath.closePath();
generalPath.moveTo(15.0f, 55.9f);
generalPath.lineTo(15.0f, 57.2f);
generalPath.lineTo(13.7f, 57.8f);
generalPath.lineTo(13.7f, 56.7f);
generalPath.lineTo(15.0f, 55.9f);
generalPath.closePath();
generalPath.moveTo(19.2f, 34.300003f);
generalPath.lineTo(19.2f, 35.9f);
generalPath.lineTo(17.0f, 36.7f);
generalPath.lineTo(17.0f, 35.100002f);
generalPath.lineTo(19.2f, 34.300003f);
generalPath.closePath();
generalPath.moveTo(19.2f, 47.800003f);
generalPath.lineTo(19.2f, 49.4f);
generalPath.lineTo(17.0f, 50.2f);
generalPath.lineTo(17.0f, 48.600002f);
generalPath.lineTo(19.2f, 47.800003f);
generalPath.closePath();
generalPath.moveTo(19.2f, 61.200005f);
generalPath.lineTo(19.2f, 62.800003f);
generalPath.lineTo(17.0f, 63.600002f);
generalPath.lineTo(17.0f, 62.0f);
generalPath.lineTo(19.2f, 61.2f);
generalPath.closePath();
generalPath.moveTo(19.1f, 38.900005f);
generalPath.lineTo(19.1f, 40.400005f);
generalPath.lineTo(17.300001f, 41.000004f);
generalPath.lineTo(17.300001f, 39.600002f);
generalPath.lineTo(19.1f, 38.9f);
generalPath.closePath();
generalPath.moveTo(19.1f, 43.400005f);
generalPath.lineTo(19.1f, 44.900005f);
generalPath.lineTo(17.300001f, 45.500004f);
generalPath.lineTo(17.300001f, 44.0f);
generalPath.lineTo(19.1f, 43.4f);
generalPath.closePath();
generalPath.moveTo(19.1f, 52.400005f);
generalPath.lineTo(19.1f, 53.900005f);
generalPath.lineTo(17.300001f, 54.600006f);
generalPath.lineTo(17.300001f, 53.100006f);
generalPath.lineTo(19.1f, 52.400005f);
generalPath.closePath();
generalPath.moveTo(19.1f, 57.000004f);
generalPath.lineTo(19.1f, 58.500004f);
generalPath.lineTo(17.300001f, 59.200005f);
generalPath.lineTo(17.300001f, 57.700005f);
generalPath.lineTo(19.1f, 57.000004f);
generalPath.closePath();
generalPath.moveTo(23.3f, 35.300003f);
generalPath.lineTo(23.3f, 37.200005f);
generalPath.lineTo(20.5f, 38.200005f);
generalPath.lineTo(20.5f, 36.300003f);
generalPath.lineTo(23.3f, 35.300003f);
generalPath.closePath();
generalPath.moveTo(23.3f, 48.700005f);
generalPath.lineTo(23.3f, 50.600006f);
generalPath.lineTo(20.5f, 51.600006f);
generalPath.lineTo(20.5f, 49.700005f);
generalPath.lineTo(23.3f, 48.700005f);
generalPath.closePath();
generalPath.moveTo(23.3f, 62.100006f);
generalPath.lineTo(23.3f, 64.0f);
generalPath.lineTo(20.5f, 65.1f);
generalPath.lineTo(20.5f, 63.199997f);
generalPath.lineTo(23.3f, 62.1f);
generalPath.closePath();
generalPath.moveTo(23.199999f, 39.900005f);
generalPath.lineTo(23.199999f, 41.600006f);
generalPath.lineTo(20.8f, 42.500008f);
generalPath.lineTo(20.8f, 40.800007f);
generalPath.lineTo(23.199999f, 39.900005f);
generalPath.closePath();
generalPath.moveTo(23.199999f, 44.400005f);
generalPath.lineTo(23.199999f, 46.100006f);
generalPath.lineTo(20.8f, 47.000008f);
generalPath.lineTo(20.8f, 45.300007f);
generalPath.lineTo(23.199999f, 44.400005f);
generalPath.closePath();
generalPath.moveTo(23.199999f, 53.400005f);
generalPath.lineTo(23.199999f, 55.100006f);
generalPath.lineTo(20.8f, 56.000008f);
generalPath.lineTo(20.8f, 54.300007f);
generalPath.lineTo(23.199999f, 53.400005f);
generalPath.closePath();
generalPath.moveTo(23.199999f, 57.800007f);
generalPath.lineTo(23.199999f, 59.500008f);
generalPath.lineTo(20.8f, 60.40001f);
generalPath.lineTo(20.8f, 58.70001f);
generalPath.lineTo(23.199999f, 57.800007f);
generalPath.closePath();
generalPath.moveTo(27.599998f, 35.100006f);
generalPath.lineTo(27.599998f, 37.600006f);
generalPath.lineTo(24.2f, 39.0f);
generalPath.lineTo(24.2f, 36.5f);
generalPath.lineTo(27.6f, 35.1f);
generalPath.closePath();
generalPath.moveTo(27.599998f, 48.600006f);
generalPath.lineTo(27.599998f, 51.100006f);
generalPath.lineTo(24.199999f, 52.500008f);
generalPath.lineTo(24.199999f, 50.100006f);
generalPath.lineTo(27.599998f, 48.600006f);
generalPath.closePath();
generalPath.moveTo(27.599998f, 62.000008f);
generalPath.lineTo(27.599998f, 64.50001f);
generalPath.lineTo(24.199999f, 65.90001f);
generalPath.lineTo(24.199999f, 63.40001f);
generalPath.lineTo(27.599998f, 62.000008f);
generalPath.closePath();
generalPath.moveTo(27.499998f, 39.800007f);
generalPath.lineTo(27.499998f, 42.100006f);
generalPath.lineTo(24.599998f, 43.200005f);
generalPath.lineTo(24.599998f, 41.0f);
generalPath.lineTo(27.499998f, 39.8f);
generalPath.closePath();
generalPath.moveTo(27.499998f, 44.300007f);
generalPath.lineTo(27.499998f, 46.600006f);
generalPath.lineTo(24.599998f, 47.700005f);
generalPath.lineTo(24.599998f, 45.400005f);
generalPath.lineTo(27.499998f, 44.300007f);
generalPath.closePath();
generalPath.moveTo(27.499998f, 53.300007f);
generalPath.lineTo(27.499998f, 55.600006f);
generalPath.lineTo(24.599998f, 56.700005f);
generalPath.lineTo(24.599998f, 54.400005f);
generalPath.lineTo(27.499998f, 53.300007f);
generalPath.closePath();
generalPath.moveTo(27.499998f, 57.70001f);
generalPath.lineTo(27.499998f, 60.0f);
generalPath.lineTo(24.599998f, 61.1f);
generalPath.lineTo(24.599998f, 58.8f);
generalPath.lineTo(27.499998f, 57.7f);
generalPath.closePath();
generalPath.moveTo(32.199997f, 34.70001f);
generalPath.lineTo(32.199997f, 38.0f);
generalPath.lineTo(28.299997f, 39.7f);
generalPath.lineTo(28.299997f, 36.5f);
generalPath.curveTo(28.399998f, 36.4f, 32.199997f, 34.7f, 32.199997f, 34.7f);
generalPath.closePath();
generalPath.moveTo(32.199997f, 48.20001f);
generalPath.lineTo(32.199997f, 51.40001f);
generalPath.lineTo(28.4f, 53.0f);
generalPath.lineTo(28.4f, 49.8f);
generalPath.lineTo(32.2f, 48.2f);
generalPath.closePath();
generalPath.moveTo(32.199997f, 61.600006f);
generalPath.lineTo(32.199997f, 64.8f);
generalPath.lineTo(28.299997f, 66.4f);
generalPath.lineTo(28.299997f, 63.2f);
generalPath.curveTo(28.399998f, 63.100002f, 32.199997f, 61.600002f, 32.199997f, 61.600002f);
generalPath.closePath();
generalPath.moveTo(32.1f, 39.700005f);
generalPath.lineTo(32.1f, 42.400005f);
generalPath.lineTo(28.8f, 43.800007f);
generalPath.lineTo(28.8f, 41.100006f);
generalPath.lineTo(32.1f, 39.700005f);
generalPath.closePath();
generalPath.moveTo(32.1f, 44.000004f);
generalPath.lineTo(32.1f, 46.700005f);
generalPath.lineTo(28.8f, 48.0f);
generalPath.lineTo(28.8f, 45.3f);
generalPath.lineTo(32.1f, 44.0f);
generalPath.closePath();
generalPath.moveTo(32.1f, 53.100006f);
generalPath.lineTo(32.1f, 55.900005f);
generalPath.lineTo(28.8f, 57.200005f);
generalPath.lineTo(28.8f, 54.500004f);
generalPath.lineTo(32.1f, 53.100002f);
generalPath.closePath();
generalPath.moveTo(32.1f, 57.500008f);
generalPath.lineTo(32.1f, 60.20001f);
generalPath.lineTo(28.8f, 61.60001f);
generalPath.lineTo(28.8f, 58.90001f);
generalPath.curveTo(28.8f, 58.80001f, 32.1f, 57.500008f, 32.1f, 57.500008f);
generalPath.closePath();
generalPath.moveTo(37.0f, 33.2f);
generalPath.lineTo(37.0f, 37.7f);
generalPath.lineTo(32.8f, 39.4f);
generalPath.lineTo(32.8f, 35.2f);
generalPath.curveTo(34.3f, 34.3f, 35.7f, 33.7f, 37.0f, 33.2f);
generalPath.closePath();
generalPath.moveTo(37.0f, 38.100002f);
generalPath.lineTo(37.0f, 42.0f);
generalPath.lineTo(32.8f, 43.8f);
generalPath.lineTo(32.8f, 39.899998f);
generalPath.lineTo(37.0f, 38.1f);
generalPath.closePath();
generalPath.moveTo(37.0f, 42.4f);
generalPath.lineTo(37.0f, 46.4f);
generalPath.lineTo(32.8f, 48.2f);
generalPath.lineTo(32.8f, 44.2f);
generalPath.lineTo(37.0f, 42.4f);
generalPath.closePath();
generalPath.moveTo(37.0f, 46.800003f);
generalPath.lineTo(37.0f, 50.700005f);
generalPath.lineTo(32.8f, 52.500004f);
generalPath.lineTo(32.8f, 48.600002f);
generalPath.lineTo(37.0f, 46.800003f);
generalPath.closePath();
generalPath.moveTo(37.0f, 51.200005f);
generalPath.lineTo(37.0f, 55.200005f);
generalPath.lineTo(32.9f, 57.0f);
generalPath.lineTo(32.9f, 53.0f);
generalPath.lineTo(37.0f, 51.2f);
generalPath.closePath();
generalPath.moveTo(37.0f, 55.700005f);
generalPath.lineTo(37.0f, 59.600006f);
generalPath.lineTo(32.8f, 61.400005f);
generalPath.lineTo(32.8f, 57.400005f);
generalPath.lineTo(37.0f, 55.700005f);
generalPath.closePath();
generalPath.moveTo(37.0f, 60.100006f);
generalPath.lineTo(37.0f, 64.3f);
generalPath.curveTo(35.3f, 64.9f, 34.0f, 65.600006f, 32.8f, 66.100006f);
generalPath.lineTo(32.8f, 61.900005f);
generalPath.lineTo(37.0f, 60.100006f);
generalPath.closePath();
generalPath.moveTo(58.4f, 33.300007f);
generalPath.lineTo(58.4f, 64.700005f);
generalPath.curveTo(55.800003f, 62.900005f, 52.4f, 62.100006f, 48.5f, 62.100006f);
generalPath.curveTo(45.2f, 62.100006f, 41.5f, 62.700005f, 37.4f, 64.100006f);
generalPath.lineTo(37.4f, 59.800007f);
generalPath.curveTo(39.600002f, 59.000008f, 41.9f, 58.300007f, 44.5f, 58.000008f);
generalPath.lineTo(44.5f, 47.8f);
generalPath.curveTo(42.3f, 48.1f, 39.9f, 48.8f, 37.4f, 50.1f);
generalPath.lineTo(37.4f, 47.199997f);
generalPath.curveTo(39.600002f, 46.199997f, 42.0f, 45.399998f, 44.5f, 45.1f);
generalPath.lineTo(44.5f, 35.0f);
generalPath.curveTo(42.2f, 35.4f, 39.8f, 36.3f, 37.4f, 37.3f);
generalPath.lineTo(37.4f, 32.899998f);
generalPath.curveTo(41.100002f, 31.299997f, 44.600002f, 30.599998f, 48.0f, 30.599998f);
generalPath.curveTo(51.9f, 30.599998f, 55.3f, 31.499998f, 58.4f, 33.3f);
generalPath.closePath();
generalPath.moveTo(54.3f, 36.0f);
generalPath.curveTo(52.6f, 35.2f, 50.5f, 34.7f, 48.1f, 34.7f);
generalPath.lineTo(47.3f, 34.7f);
generalPath.lineTo(47.3f, 44.800003f);
generalPath.lineTo(48.2f, 44.800003f);
generalPath.curveTo(50.3f, 44.800003f, 52.3f, 45.100002f, 54.3f, 45.700005f);
generalPath.lineTo(54.3f, 36.0f);
generalPath.closePath();
generalPath.moveTo(54.3f, 48.7f);
generalPath.curveTo(52.5f, 47.9f, 50.399998f, 47.4f, 48.2f, 47.4f);
generalPath.lineTo(47.4f, 47.4f);
generalPath.lineTo(47.4f, 57.600002f);
generalPath.lineTo(48.300003f, 57.600002f);
generalPath.curveTo(50.500004f, 57.600002f, 52.600002f, 57.9f, 54.4f, 58.4f);
generalPath.lineTo(54.4f, 48.600002f);
generalPath.lineTo(54.300003f, 48.7f);
generalPath.closePath();
generalPath.moveTo(57.0f, 65.9f);
generalPath.lineTo(57.0f, 65.3f);
generalPath.lineTo(56.7f, 65.3f);
generalPath.lineTo(56.7f, 65.200005f);
generalPath.lineTo(57.3f, 65.200005f);
generalPath.lineTo(57.3f, 65.3f);
generalPath.lineTo(57.0f, 65.3f);
generalPath.lineTo(57.0f, 65.9f);
generalPath.closePath();
generalPath.moveTo(57.5f, 65.9f);
generalPath.lineTo(57.5f, 65.1f);
generalPath.lineTo(57.7f, 65.1f);
generalPath.lineTo(58.0f, 65.7f);
generalPath.lineTo(58.3f, 65.1f);
generalPath.lineTo(58.5f, 65.1f);
generalPath.lineTo(58.5f, 65.9f);
generalPath.lineTo(58.4f, 65.9f);
generalPath.lineTo(58.4f, 65.3f);
generalPath.lineTo(58.100002f, 65.9f);
generalPath.lineTo(57.9f, 65.9f);
generalPath.lineTo(57.600002f, 65.3f);
generalPath.lineTo(57.600002f, 65.9f);
generalPath.lineTo(57.500004f, 65.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.04999923706055, 33.59600067138672), new Point2D.Double(36.04999923706055, 69.37899780273438), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
	private ext_vbs() {
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
    public static NeonIcon of(int width, int height) {
       ext_vbs base = new ext_vbs();
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
       ext_vbs base = new ext_vbs();
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
        return ext_vbs::new;
    }
}

