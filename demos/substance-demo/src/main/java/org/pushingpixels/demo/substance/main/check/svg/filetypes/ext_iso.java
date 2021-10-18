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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.common.api.icon.RadianceIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_iso implements RadianceIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 99.0f);
generalPath.lineTo(-0.19999695f, 99.0f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 2.994999885559082), new Point2D.Double(35.75, 101.0009994506836), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 196, 2, 255)) : new Color(239, 196, 2, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 200, 41, 255)) : new Color(241, 200, 41, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 210, 100, 255)) : new Color(244, 210, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(247, 220, 139, 255)) : new Color(247, 220, 139, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 229, 172, 255)) : new Color(249, 229, 172, 255)),((colorFilter != null) ? colorFilter.filter(new Color(251, 236, 199, 255)) : new Color(251, 236, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 243, 221, 255)) : new Color(252, 243, 221, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 249, 238, 255)) : new Color(254, 249, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 253, 249, 255)) : new Color(255, 253, 249, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 99.0f);
generalPath.lineTo(-0.19999695f, 99.0f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 156, 2, 255)) : new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 99.0f);
generalPath.lineTo(-0.19999695f, 99.0f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(13.5f, 92.1f);
generalPath.lineTo(13.5f, 72.2f);
generalPath.lineTo(17.5f, 72.2f);
generalPath.lineTo(17.5f, 92.0f);
generalPath.lineTo(13.5f, 92.0f);
generalPath.closePath();
generalPath.moveTo(20.4f, 85.6f);
generalPath.lineTo(24.3f, 85.2f);
generalPath.curveTo(24.5f, 86.5f, 25.0f, 87.5f, 25.699999f, 88.1f);
generalPath.curveTo(26.399998f, 88.7f, 27.4f, 89.0f, 28.599998f, 89.0f);
generalPath.curveTo(29.899998f, 89.0f, 30.899998f, 88.7f, 31.499998f, 88.2f);
generalPath.curveTo(32.199997f, 87.7f, 32.5f, 87.0f, 32.5f, 86.299995f);
generalPath.curveTo(32.5f, 85.799995f, 32.4f, 85.399994f, 32.1f, 85.1f);
generalPath.curveTo(31.8f, 84.799995f, 31.3f, 84.5f, 30.599998f, 84.2f);
generalPath.curveTo(30.099998f, 84.0f, 28.999998f, 83.7f, 27.399998f, 83.299995f);
generalPath.curveTo(25.199997f, 82.799995f, 23.699997f, 82.1f, 22.799997f, 81.299995f);
generalPath.curveTo(21.599997f, 80.2f, 20.999998f, 78.899994f, 20.999998f, 77.299995f);
generalPath.curveTo(20.999998f, 76.299995f, 21.299997f, 75.299995f, 21.899998f, 74.49999f);
generalPath.curveTo(22.499998f, 73.59999f, 23.299997f, 72.99999f, 24.399998f, 72.49999f);
generalPath.curveTo(25.499998f, 71.99999f, 26.799997f, 71.799995f, 28.299997f, 71.799995f);
generalPath.curveTo(30.799997f, 71.799995f, 32.699997f, 72.299995f, 33.999996f, 73.399994f);
generalPath.curveTo(35.299995f, 74.49999f, 35.899998f, 75.899994f, 35.999996f, 77.799995f);
generalPath.lineTo(31.999996f, 77.99999f);
generalPath.curveTo(31.799995f, 76.99999f, 31.499996f, 76.19999f, 30.899996f, 75.799995f);
generalPath.curveTo(30.299995f, 75.399994f, 29.499996f, 75.1f, 28.299995f, 75.1f);
generalPath.curveTo(27.099995f, 75.1f, 26.199995f, 75.299995f, 25.499996f, 75.799995f);
generalPath.curveTo(25.099997f, 76.1f, 24.899996f, 76.49999f, 24.899996f, 76.99999f);
generalPath.curveTo(24.899996f, 77.49999f, 25.099997f, 77.899994f, 25.499996f, 78.19999f);
generalPath.curveTo(25.999996f, 78.59999f, 27.299995f, 79.09999f, 29.199997f, 79.49999f);
generalPath.curveTo(31.199997f, 79.99999f, 32.6f, 80.399994f, 33.6f, 80.899994f);
generalPath.curveTo(34.6f, 81.399994f, 35.3f, 82.09999f, 35.8f, 82.899994f);
generalPath.curveTo(36.3f, 83.7f, 36.6f, 84.799995f, 36.6f, 86.09999f);
generalPath.curveTo(36.6f, 87.19999f, 36.3f, 88.29999f, 35.6f, 89.29999f);
generalPath.curveTo(35.0f, 90.29999f, 34.1f, 90.999985f, 32.899998f, 91.499985f);
generalPath.curveTo(31.699997f, 91.999985f, 30.299997f, 92.19998f, 28.499998f, 92.19998f);
generalPath.curveTo(25.999998f, 92.19998f, 23.999998f, 91.59998f, 22.699997f, 90.499985f);
generalPath.curveTo(21.499996f, 89.499985f, 20.699997f, 87.79999f, 20.399998f, 85.59998f);
generalPath.closePath();
generalPath.moveTo(39.3f, 82.299995f);
generalPath.curveTo(39.3f, 80.299995f, 39.6f, 78.6f, 40.2f, 77.2f);
generalPath.curveTo(40.7f, 76.2f, 41.3f, 75.299995f, 42.100002f, 74.5f);
generalPath.curveTo(42.900005f, 73.700005f, 43.800003f, 73.1f, 44.7f, 72.7f);
generalPath.curveTo(45.9f, 72.2f, 47.4f, 71.899994f, 49.0f, 71.899994f);
generalPath.curveTo(52.0f, 71.899994f, 54.3f, 72.799995f, 56.1f, 74.59999f);
generalPath.curveTo(57.899998f, 76.399994f, 58.8f, 78.899994f, 58.8f, 82.19999f);
generalPath.curveTo(58.8f, 85.39999f, 57.899998f, 87.89999f, 56.2f, 89.69999f);
generalPath.curveTo(54.4f, 91.49999f, 52.100002f, 92.39999f, 49.100002f, 92.39999f);
generalPath.curveTo(46.100002f, 92.39999f, 43.7f, 91.499985f, 42.000004f, 89.69999f);
generalPath.curveTo(40.200005f, 87.89999f, 39.300003f, 85.39999f, 39.300003f, 82.29999f);
generalPath.closePath();
generalPath.moveTo(43.5f, 82.1f);
generalPath.curveTo(43.5f, 84.299995f, 44.0f, 86.1f, 45.1f, 87.2f);
generalPath.curveTo(46.199997f, 88.299995f, 47.5f, 88.899994f, 49.1f, 88.899994f);
generalPath.curveTo(50.699997f, 88.899994f, 52.0f, 88.299995f, 53.1f, 87.2f);
generalPath.curveTo(54.199997f, 86.1f, 54.699997f, 84.299995f, 54.699997f, 82.0f);
generalPath.curveTo(54.699997f, 79.7f, 54.199997f, 78.0f, 53.199997f, 76.9f);
generalPath.curveTo(52.199997f, 75.8f, 50.899998f, 75.200005f, 49.199997f, 75.200005f);
generalPath.curveTo(47.499996f, 75.200005f, 46.199997f, 75.8f, 45.199997f, 76.9f);
generalPath.curveTo(43.999996f, 78.1f, 43.499996f, 79.8f, 43.499996f, 82.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.8f, 18.8f);
generalPath.curveTo(23.4f, 18.8f, 13.299999f, 28.8f, 13.299999f, 41.1f);
generalPath.curveTo(13.299999f, 53.399998f, 23.4f, 63.399998f, 35.8f, 63.399998f);
generalPath.curveTo(48.199997f, 63.399998f, 58.3f, 53.399998f, 58.3f, 41.1f);
generalPath.curveTo(58.3f, 28.8f, 48.199997f, 18.8f, 35.8f, 18.8f);
generalPath.closePath();
generalPath.moveTo(35.8f, 48.699997f);
generalPath.curveTo(31.5f, 48.699997f, 28.099998f, 45.199997f, 28.099998f, 41.1f);
generalPath.curveTo(28.099998f, 36.8f, 31.599998f, 33.5f, 35.8f, 33.5f);
generalPath.curveTo(40.1f, 33.5f, 43.5f, 37.0f, 43.5f, 41.1f);
generalPath.curveTo(43.5f, 45.3f, 40.0f, 48.699997f, 35.8f, 48.699997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 38.632999420166016), new Point2D.Double(35.75, 83.18099975585938), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(164, 125, 3, 255)) : new Color(164, 125, 3, 255)),((colorFilter != null) ? colorFilter.filter(new Color(222, 190, 0, 255)) : new Color(222, 190, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 173, 4, 255)) : new Color(207, 173, 4, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.8f, 38.3f);
generalPath.curveTo(34.2f, 38.3f, 33.0f, 39.6f, 33.0f, 41.1f);
generalPath.curveTo(33.0f, 42.699997f, 34.3f, 43.899998f, 35.8f, 43.899998f);
generalPath.curveTo(37.399998f, 43.899998f, 38.6f, 42.6f, 38.6f, 41.1f);
generalPath.curveTo(38.5f, 39.5f, 37.399998f, 38.3f, 35.8f, 38.3f);
generalPath.closePath();
generalPath.moveTo(35.8f, 42.1f);
generalPath.curveTo(35.3f, 42.1f, 34.8f, 41.699997f, 34.8f, 41.1f);
generalPath.curveTo(34.8f, 40.6f, 35.2f, 40.1f, 35.8f, 40.1f);
generalPath.curveTo(36.3f, 40.1f, 36.8f, 40.5f, 36.8f, 41.1f);
generalPath.curveTo(36.8f, 41.6f, 36.2f, 42.1f, 35.8f, 42.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(35.8f, 32.8f);
generalPath.curveTo(31.099998f, 32.8f, 27.4f, 36.6f, 27.4f, 41.1f);
generalPath.curveTo(27.4f, 45.8f, 31.199999f, 49.399998f, 35.8f, 49.399998f);
generalPath.curveTo(40.5f, 49.399998f, 44.199997f, 45.6f, 44.199997f, 41.1f);
generalPath.curveTo(44.199997f, 36.399998f, 40.499996f, 32.8f, 35.799995f, 32.8f);
generalPath.closePath();
generalPath.moveTo(35.8f, 48.0f);
generalPath.curveTo(31.9f, 48.0f, 28.8f, 44.9f, 28.8f, 41.1f);
generalPath.curveTo(28.8f, 37.299995f, 31.9f, 34.199997f, 35.8f, 34.199997f);
generalPath.curveTo(39.699997f, 34.199997f, 42.8f, 37.299995f, 42.8f, 41.1f);
generalPath.curveTo(42.8f, 44.9f, 39.7f, 48.0f, 35.8f, 48.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.34400177001953, 74.2300033569336), new Point2D.Double(58.84400177001953, 87.7300033569336), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 251, 255)) : new Color(255, 254, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 250, 241, 255)) : new Color(254, 250, 241, 255)),((colorFilter != null) ? colorFilter.filter(new Color(253, 245, 228, 255)) : new Color(253, 245, 228, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 240, 210, 255)) : new Color(252, 240, 210, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 233, 188, 255)) : new Color(250, 233, 188, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 226, 162, 255)) : new Color(249, 226, 162, 255)),((colorFilter != null) ? colorFilter.filter(new Color(247, 218, 131, 255)) : new Color(247, 218, 131, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 209, 93, 255)) : new Color(244, 209, 93, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 200, 39, 255)) : new Color(241, 200, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(239, 196, 2, 255)) : new Color(239, 196, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(186, 156, 2, 255)) : new Color(186, 156, 2, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.2f, 27.7f);
generalPath.lineTo(45.199997f, 27.7f);
generalPath.lineTo(45.199997f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
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
        return 0.12800002098083496;
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
		return 0.7410314083099365;
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
	private ext_iso() {
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
       ext_iso base = new ext_iso();
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
       ext_iso base = new ext_iso();
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
        return ext_iso::new;
    }
}

