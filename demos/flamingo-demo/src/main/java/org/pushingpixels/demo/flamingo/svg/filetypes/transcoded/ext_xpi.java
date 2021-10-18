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
public class ext_xpi implements RadianceIcon {
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.4f, 99.0f);
generalPath.lineTo(0.4f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.003999948501587), new Point2D.Double(36.20000076293945, 100.9990005493164), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.4f, 99.0f);
generalPath.lineTo(0.4f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.4f, 99.0f);
generalPath.lineTo(0.4f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
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
generalPath.moveTo(13.8f, 91.1f);
generalPath.lineTo(20.6f, 80.7f);
generalPath.lineTo(14.400001f, 71.2f);
generalPath.lineTo(19.1f, 71.2f);
generalPath.lineTo(23.1f, 77.6f);
generalPath.lineTo(27.0f, 71.2f);
generalPath.lineTo(31.7f, 71.2f);
generalPath.lineTo(25.5f, 80.799995f);
generalPath.lineTo(32.3f, 91.0f);
generalPath.lineTo(27.4f, 91.0f);
generalPath.lineTo(23.0f, 84.2f);
generalPath.lineTo(18.6f, 91.1f);
generalPath.lineTo(13.8f, 91.1f);
generalPath.closePath();
generalPath.moveTo(34.4f, 91.1f);
generalPath.lineTo(34.4f, 71.2f);
generalPath.lineTo(40.9f, 71.2f);
generalPath.curveTo(43.300003f, 71.2f, 44.9f, 71.299995f, 45.7f, 71.5f);
generalPath.curveTo(46.8f, 71.8f, 47.8f, 72.4f, 48.600002f, 73.4f);
generalPath.curveTo(49.4f, 74.4f, 49.800003f, 75.700005f, 49.800003f, 77.3f);
generalPath.curveTo(49.800003f, 78.5f, 49.600002f, 79.5f, 49.100002f, 80.4f);
generalPath.curveTo(48.600002f, 81.3f, 48.100002f, 81.9f, 47.4f, 82.4f);
generalPath.curveTo(46.7f, 82.9f, 46.0f, 83.200005f, 45.300003f, 83.3f);
generalPath.curveTo(44.300003f, 83.5f, 42.9f, 83.600006f, 41.100002f, 83.600006f);
generalPath.lineTo(38.500004f, 83.600006f);
generalPath.lineTo(38.500004f, 91.100006f);
generalPath.lineTo(34.400005f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(38.4f, 74.6f);
generalPath.lineTo(38.4f, 80.2f);
generalPath.lineTo(40.600002f, 80.2f);
generalPath.curveTo(42.2f, 80.2f, 43.2f, 80.1f, 43.800003f, 79.899994f);
generalPath.curveTo(44.300003f, 79.7f, 44.800003f, 79.399994f, 45.100002f, 78.899994f);
generalPath.curveTo(45.4f, 78.49999f, 45.600002f, 77.899994f, 45.600002f, 77.399994f);
generalPath.curveTo(45.600002f, 76.7f, 45.4f, 76.09999f, 45.000004f, 75.59999f);
generalPath.curveTo(44.600002f, 75.09999f, 44.000004f, 74.79999f, 43.400005f, 74.69999f);
generalPath.curveTo(42.900005f, 74.59999f, 42.000004f, 74.59999f, 40.500004f, 74.59999f);
generalPath.lineTo(38.400005f, 74.59999f);
generalPath.closePath();
generalPath.moveTo(52.800003f, 91.1f);
generalPath.lineTo(52.800003f, 71.2f);
generalPath.lineTo(56.800003f, 71.2f);
generalPath.lineTo(56.800003f, 91.0f);
generalPath.lineTo(52.800003f, 91.0f);
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
generalPath.moveTo(30.6f, 19.9f);
generalPath.lineTo(28.300001f, 21.699999f);
generalPath.lineTo(28.500002f, 25.3f);
generalPath.lineTo(31.200003f, 27.699999f);
generalPath.lineTo(31.200003f, 29.599998f);
generalPath.lineTo(30.600002f, 30.399998f);
generalPath.lineTo(22.600002f, 30.699997f);
generalPath.lineTo(20.800003f, 32.6f);
generalPath.lineTo(20.800003f, 40.199997f);
generalPath.lineTo(20.100002f, 41.899998f);
generalPath.lineTo(18.100002f, 41.899998f);
generalPath.lineTo(16.600002f, 40.699997f);
generalPath.lineTo(16.200003f, 38.299995f);
generalPath.lineTo(11.9000025f, 38.199997f);
generalPath.lineTo(9.800003f, 39.699997f);
generalPath.lineTo(9.800003f, 50.899998f);
generalPath.lineTo(11.200003f, 53.399998f);
generalPath.lineTo(15.700003f, 53.399998f);
generalPath.lineTo(17.700003f, 51.1f);
generalPath.lineTo(18.500002f, 48.699997f);
generalPath.lineTo(20.200003f, 48.6f);
generalPath.lineTo(20.900003f, 50.3f);
generalPath.lineTo(20.900003f, 62.3f);
generalPath.lineTo(22.700003f, 64.4f);
generalPath.lineTo(29.500004f, 64.4f);
generalPath.lineTo(30.800003f, 62.300003f);
generalPath.lineTo(30.000004f, 60.9f);
generalPath.lineTo(28.600004f, 60.100002f);
generalPath.lineTo(28.600004f, 57.300003f);
generalPath.lineTo(30.800005f, 55.4f);
generalPath.lineTo(41.500004f, 55.4f);
generalPath.lineTo(43.800003f, 57.300003f);
generalPath.lineTo(43.800003f, 59.9f);
generalPath.lineTo(42.5f, 61.0f);
generalPath.lineTo(41.5f, 62.3f);
generalPath.lineTo(42.7f, 64.4f);
generalPath.lineTo(52.9f, 64.3f);
generalPath.lineTo(54.9f, 62.300003f);
generalPath.lineTo(54.9f, 52.700005f);
generalPath.lineTo(54.4f, 51.000004f);
generalPath.lineTo(52.9f, 50.900005f);
generalPath.lineTo(51.5f, 52.000004f);
generalPath.lineTo(50.5f, 53.200005f);
generalPath.lineTo(48.0f, 53.100006f);
generalPath.lineTo(45.9f, 51.300007f);
generalPath.lineTo(45.9f, 40.9f);
generalPath.lineTo(47.600002f, 38.100002f);
generalPath.lineTo(52.0f, 38.100002f);
generalPath.lineTo(53.0f, 39.9f);
generalPath.lineTo(55.0f, 39.600002f);
generalPath.lineTo(55.0f, 32.9f);
generalPath.lineTo(53.0f, 30.800001f);
generalPath.lineTo(41.2f, 30.500002f);
generalPath.lineTo(39.9f, 29.400002f);
generalPath.lineTo(40.100002f, 27.400002f);
generalPath.lineTo(43.4f, 25.7f);
generalPath.lineTo(43.800003f, 22.0f);
generalPath.lineTo(41.500004f, 19.9f);
generalPath.lineTo(30.6f, 19.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(32.20500183105469, 37.54899978637695), new Point2D.Double(32.20500183105469, 82.09500122070312), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(76, 236, 0, 255)) : new Color(76, 236, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(36, 127, 0, 255)) : new Color(36, 127, 0, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(30.6f, 19.9f);
generalPath.lineTo(28.300001f, 21.699999f);
generalPath.lineTo(28.500002f, 25.3f);
generalPath.lineTo(31.200003f, 27.699999f);
generalPath.lineTo(31.200003f, 29.599998f);
generalPath.lineTo(30.600002f, 30.399998f);
generalPath.lineTo(22.600002f, 30.699997f);
generalPath.lineTo(20.800003f, 32.6f);
generalPath.lineTo(20.800003f, 40.199997f);
generalPath.lineTo(20.100002f, 41.899998f);
generalPath.lineTo(18.100002f, 41.899998f);
generalPath.lineTo(16.600002f, 40.699997f);
generalPath.lineTo(16.200003f, 38.299995f);
generalPath.lineTo(11.9000025f, 38.199997f);
generalPath.lineTo(9.800003f, 39.699997f);
generalPath.lineTo(9.800003f, 50.899998f);
generalPath.lineTo(11.200003f, 53.399998f);
generalPath.lineTo(15.700003f, 53.399998f);
generalPath.lineTo(17.700003f, 51.1f);
generalPath.lineTo(18.500002f, 48.699997f);
generalPath.lineTo(20.200003f, 48.6f);
generalPath.lineTo(20.900003f, 50.3f);
generalPath.lineTo(20.900003f, 62.3f);
generalPath.lineTo(22.700003f, 64.4f);
generalPath.lineTo(29.500004f, 64.4f);
generalPath.lineTo(30.800003f, 62.300003f);
generalPath.lineTo(30.000004f, 60.9f);
generalPath.lineTo(28.600004f, 60.100002f);
generalPath.lineTo(28.600004f, 57.300003f);
generalPath.lineTo(30.800005f, 55.4f);
generalPath.lineTo(41.500004f, 55.4f);
generalPath.lineTo(43.800003f, 57.300003f);
generalPath.lineTo(43.800003f, 59.9f);
generalPath.lineTo(42.5f, 61.0f);
generalPath.lineTo(41.5f, 62.3f);
generalPath.lineTo(42.7f, 64.4f);
generalPath.lineTo(52.9f, 64.3f);
generalPath.lineTo(54.9f, 62.300003f);
generalPath.lineTo(54.9f, 52.700005f);
generalPath.lineTo(54.4f, 51.000004f);
generalPath.lineTo(52.9f, 50.900005f);
generalPath.lineTo(51.5f, 52.000004f);
generalPath.lineTo(50.5f, 53.200005f);
generalPath.lineTo(48.0f, 53.100006f);
generalPath.lineTo(45.9f, 51.300007f);
generalPath.lineTo(45.9f, 40.9f);
generalPath.lineTo(47.600002f, 38.100002f);
generalPath.lineTo(52.0f, 38.100002f);
generalPath.lineTo(53.0f, 39.9f);
generalPath.lineTo(55.0f, 39.600002f);
generalPath.lineTo(55.0f, 32.9f);
generalPath.lineTo(53.0f, 30.800001f);
generalPath.lineTo(41.2f, 30.500002f);
generalPath.lineTo(39.9f, 29.400002f);
generalPath.lineTo(40.100002f, 27.400002f);
generalPath.lineTo(43.4f, 25.7f);
generalPath.lineTo(43.800003f, 22.0f);
generalPath.lineTo(41.500004f, 19.9f);
generalPath.lineTo(30.6f, 19.9f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(36, 127, 0, 255)) : new Color(36, 127, 0, 255);
stroke = new BasicStroke(2.0f,1,1,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(30.6f, 19.9f);
generalPath.lineTo(28.300001f, 21.699999f);
generalPath.lineTo(28.500002f, 25.3f);
generalPath.lineTo(31.200003f, 27.699999f);
generalPath.lineTo(31.200003f, 29.599998f);
generalPath.lineTo(30.600002f, 30.399998f);
generalPath.lineTo(22.600002f, 30.699997f);
generalPath.lineTo(20.800003f, 32.6f);
generalPath.lineTo(20.800003f, 40.199997f);
generalPath.lineTo(20.100002f, 41.899998f);
generalPath.lineTo(18.100002f, 41.899998f);
generalPath.lineTo(16.600002f, 40.699997f);
generalPath.lineTo(16.200003f, 38.299995f);
generalPath.lineTo(11.9000025f, 38.199997f);
generalPath.lineTo(9.800003f, 39.699997f);
generalPath.lineTo(9.800003f, 50.899998f);
generalPath.lineTo(11.200003f, 53.399998f);
generalPath.lineTo(15.700003f, 53.399998f);
generalPath.lineTo(17.700003f, 51.1f);
generalPath.lineTo(18.500002f, 48.699997f);
generalPath.lineTo(20.200003f, 48.6f);
generalPath.lineTo(20.900003f, 50.3f);
generalPath.lineTo(20.900003f, 62.3f);
generalPath.lineTo(22.700003f, 64.4f);
generalPath.lineTo(29.500004f, 64.4f);
generalPath.lineTo(30.800003f, 62.300003f);
generalPath.lineTo(30.000004f, 60.9f);
generalPath.lineTo(28.600004f, 60.100002f);
generalPath.lineTo(28.600004f, 57.300003f);
generalPath.lineTo(30.800005f, 55.4f);
generalPath.lineTo(41.500004f, 55.4f);
generalPath.lineTo(43.800003f, 57.300003f);
generalPath.lineTo(43.800003f, 59.9f);
generalPath.lineTo(42.5f, 61.0f);
generalPath.lineTo(41.5f, 62.3f);
generalPath.lineTo(42.7f, 64.4f);
generalPath.lineTo(52.9f, 64.3f);
generalPath.lineTo(54.9f, 62.300003f);
generalPath.lineTo(54.9f, 52.700005f);
generalPath.lineTo(54.4f, 51.000004f);
generalPath.lineTo(52.9f, 50.900005f);
generalPath.lineTo(51.5f, 52.000004f);
generalPath.lineTo(50.5f, 53.200005f);
generalPath.lineTo(48.0f, 53.100006f);
generalPath.lineTo(45.9f, 51.300007f);
generalPath.lineTo(45.9f, 40.9f);
generalPath.lineTo(47.600002f, 38.100002f);
generalPath.lineTo(52.0f, 38.100002f);
generalPath.lineTo(53.0f, 39.9f);
generalPath.lineTo(55.0f, 39.600002f);
generalPath.lineTo(55.0f, 32.9f);
generalPath.lineTo(53.0f, 30.800001f);
generalPath.lineTo(41.2f, 30.500002f);
generalPath.lineTo(39.9f, 29.400002f);
generalPath.lineTo(40.100002f, 27.400002f);
generalPath.lineTo(43.4f, 25.7f);
generalPath.lineTo(43.800003f, 22.0f);
generalPath.lineTo(41.500004f, 19.9f);
generalPath.lineTo(30.6f, 19.9f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.180999755859375, 74.24199676513672), new Point2D.Double(58.60599899291992, 87.66699981689453), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
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
        return 0.1340000033378601;
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
		return 0.7359999418258667;
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
	private ext_xpi() {
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
       ext_xpi base = new ext_xpi();
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
       ext_xpi base = new ext_xpi();
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
        return ext_xpi::new;
    }
}

