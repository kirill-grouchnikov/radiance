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
public class ext_pages implements NeonIcon {
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
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.056f,0.16f,0.274f,0.398f,0.539f,0.711f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 45, 68, 255)) : new Color(0, 45, 68, 255)),((colorFilter != null) ? colorFilter.filter(new Color(1, 56, 82, 255)) : new Color(1, 56, 82, 255)),((colorFilter != null) ? colorFilter.filter(new Color(10, 77, 107, 255)) : new Color(10, 77, 107, 255)),((colorFilter != null) ? colorFilter.filter(new Color(15, 94, 130, 255)) : new Color(15, 94, 130, 255)),((colorFilter != null) ? colorFilter.filter(new Color(15, 109, 150, 255)) : new Color(15, 109, 150, 255)),((colorFilter != null) ? colorFilter.filter(new Color(13, 119, 164, 255)) : new Color(13, 119, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(10, 126, 174, 255)) : new Color(10, 126, 174, 255)),((colorFilter != null) ? colorFilter.filter(new Color(8, 129, 178, 255)) : new Color(8, 129, 178, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(1, 65, 94, 255)) : new Color(1, 65, 94, 255);
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
generalPath.moveTo(63.6f, 67.0f);
generalPath.lineTo(63.5f, 67.8f);
generalPath.lineTo(63.4f, 68.9f);
generalPath.lineTo(8.200001f, 68.8f);
generalPath.lineTo(7.500001f, 68.700005f);
generalPath.lineTo(7.200001f, 68.3f);
generalPath.lineTo(7.100001f, 67.8f);
generalPath.lineTo(7.200001f, 67.4f);
generalPath.lineTo(7.700001f, 67.0f);
generalPath.lineTo(63.600002f, 67.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(11, 68, 102, 255)) : new Color(11, 68, 102, 255);
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
generalPath.moveTo(63.6f, 67.0f);
generalPath.lineTo(63.5f, 67.8f);
generalPath.lineTo(63.4f, 68.9f);
generalPath.lineTo(8.200001f, 68.8f);
generalPath.lineTo(7.500001f, 68.700005f);
generalPath.lineTo(7.200001f, 68.3f);
generalPath.lineTo(7.100001f, 67.8f);
generalPath.lineTo(7.200001f, 67.4f);
generalPath.lineTo(7.700001f, 67.0f);
generalPath.lineTo(63.600002f, 67.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(14, 85, 128, 255)) : new Color(14, 85, 128, 255);
stroke = new BasicStroke(0.6f,0,1,1.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(63.6f, 67.0f);
generalPath.lineTo(63.5f, 67.8f);
generalPath.lineTo(63.4f, 68.9f);
generalPath.lineTo(8.200001f, 68.8f);
generalPath.lineTo(7.500001f, 68.700005f);
generalPath.lineTo(7.200001f, 68.3f);
generalPath.lineTo(7.100001f, 67.8f);
generalPath.lineTo(7.200001f, 67.4f);
generalPath.lineTo(7.700001f, 67.0f);
generalPath.lineTo(63.600002f, 67.0f);
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
generalPath.moveTo(11.1f, 60.9f);
generalPath.lineTo(13.1f, 63.0f);
generalPath.lineTo(10.400001f, 64.9f);
generalPath.lineTo(9.000001f, 65.700005f);
generalPath.lineTo(8.500001f, 65.700005f);
generalPath.lineTo(8.300001f, 65.100006f);
generalPath.lineTo(9.200001f, 63.700005f);
generalPath.lineTo(11.1f, 60.900005f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(11, 68, 102, 255)) : new Color(11, 68, 102, 255);
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
generalPath.moveTo(11.1f, 60.9f);
generalPath.lineTo(13.1f, 63.0f);
generalPath.lineTo(10.400001f, 64.9f);
generalPath.lineTo(9.000001f, 65.700005f);
generalPath.lineTo(8.500001f, 65.700005f);
generalPath.lineTo(8.300001f, 65.100006f);
generalPath.lineTo(9.200001f, 63.700005f);
generalPath.lineTo(11.1f, 60.900005f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(14, 85, 128, 255)) : new Color(14, 85, 128, 255);
stroke = new BasicStroke(0.6f,0,1,1.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(11.1f, 60.9f);
generalPath.lineTo(13.1f, 63.0f);
generalPath.lineTo(10.400001f, 64.9f);
generalPath.lineTo(9.000001f, 65.700005f);
generalPath.lineTo(8.500001f, 65.700005f);
generalPath.lineTo(8.300001f, 65.100006f);
generalPath.lineTo(9.200001f, 63.700005f);
generalPath.lineTo(11.1f, 60.900005f);
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
generalPath.moveTo(28.9f, 40.6f);
generalPath.lineTo(33.3f, 45.1f);
generalPath.lineTo(29.4f, 49.0f);
generalPath.lineTo(25.099998f, 52.9f);
generalPath.lineTo(20.8f, 56.7f);
generalPath.lineTo(17.4f, 59.600002f);
generalPath.lineTo(13.799999f, 62.2f);
generalPath.lineTo(11.699999f, 60.100002f);
generalPath.lineTo(13.699999f, 57.2f);
generalPath.lineTo(16.499998f, 53.9f);
generalPath.lineTo(18.699999f, 51.300003f);
generalPath.lineTo(21.499998f, 48.300003f);
generalPath.lineTo(24.999998f, 44.600002f);
generalPath.lineTo(28.899998f, 40.600002f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(11, 68, 102, 255)) : new Color(11, 68, 102, 255);
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
generalPath.moveTo(28.9f, 40.6f);
generalPath.lineTo(33.3f, 45.1f);
generalPath.lineTo(29.4f, 49.0f);
generalPath.lineTo(25.099998f, 52.9f);
generalPath.lineTo(20.8f, 56.7f);
generalPath.lineTo(17.4f, 59.600002f);
generalPath.lineTo(13.799999f, 62.2f);
generalPath.lineTo(11.699999f, 60.100002f);
generalPath.lineTo(13.699999f, 57.2f);
generalPath.lineTo(16.499998f, 53.9f);
generalPath.lineTo(18.699999f, 51.300003f);
generalPath.lineTo(21.499998f, 48.300003f);
generalPath.lineTo(24.999998f, 44.600002f);
generalPath.lineTo(28.899998f, 40.600002f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(14, 85, 128, 255)) : new Color(14, 85, 128, 255);
stroke = new BasicStroke(0.6f,0,1,1.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(28.9f, 40.6f);
generalPath.lineTo(33.3f, 45.1f);
generalPath.lineTo(29.4f, 49.0f);
generalPath.lineTo(25.099998f, 52.9f);
generalPath.lineTo(20.8f, 56.7f);
generalPath.lineTo(17.4f, 59.600002f);
generalPath.lineTo(13.799999f, 62.2f);
generalPath.lineTo(11.699999f, 60.100002f);
generalPath.lineTo(13.699999f, 57.2f);
generalPath.lineTo(16.499998f, 53.9f);
generalPath.lineTo(18.699999f, 51.300003f);
generalPath.lineTo(21.499998f, 48.300003f);
generalPath.lineTo(24.999998f, 44.600002f);
generalPath.lineTo(28.899998f, 40.600002f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(49.2f, 22.3f);
generalPath.lineTo(50.3f, 22.4f);
generalPath.lineTo(51.0f, 23.0f);
generalPath.curveTo(51.0f, 23.0f, 51.5f, 24.0f, 51.5f, 23.9f);
generalPath.lineTo(51.5f, 25.1f);
generalPath.lineTo(51.1f, 26.2f);
generalPath.lineTo(50.6f, 27.0f);
generalPath.lineTo(50.6f, 27.9f);
generalPath.lineTo(51.0f, 28.4f);
generalPath.lineTo(51.1f, 29.1f);
generalPath.lineTo(50.899998f, 30.0f);
generalPath.lineTo(41.899998f, 39.6f);
generalPath.lineTo(39.399998f, 42.3f);
generalPath.lineTo(38.399998f, 43.5f);
generalPath.lineTo(38.3f, 44.1f);
generalPath.lineTo(38.399998f, 44.8f);
generalPath.lineTo(37.8f, 45.5f);
generalPath.lineTo(37.0f, 45.0f);
generalPath.lineTo(36.7f, 44.0f);
generalPath.lineTo(36.9f, 43.0f);
generalPath.lineTo(37.5f, 42.2f);
generalPath.lineTo(43.8f, 35.5f);
generalPath.lineTo(49.1f, 29.6f);
generalPath.lineTo(49.199997f, 28.9f);
generalPath.lineTo(48.499996f, 29.0f);
generalPath.lineTo(44.699997f, 33.1f);
generalPath.lineTo(38.499996f, 39.5f);
generalPath.lineTo(34.099995f, 44.0f);
generalPath.lineTo(29.599995f, 39.8f);
generalPath.lineTo(34.699993f, 34.399998f);
generalPath.lineTo(40.499992f, 28.799997f);
generalPath.lineTo(45.79999f, 23.899998f);
generalPath.lineTo(47.199993f, 22.899998f);
generalPath.lineTo(48.199993f, 22.299997f);
generalPath.lineTo(49.199993f, 22.299997f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(11, 68, 102, 255)) : new Color(11, 68, 102, 255);
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
generalPath.moveTo(49.2f, 22.3f);
generalPath.lineTo(50.3f, 22.4f);
generalPath.lineTo(51.0f, 23.0f);
generalPath.curveTo(51.0f, 23.0f, 51.5f, 24.0f, 51.5f, 23.9f);
generalPath.lineTo(51.5f, 25.1f);
generalPath.lineTo(51.1f, 26.2f);
generalPath.lineTo(50.6f, 27.0f);
generalPath.lineTo(50.6f, 27.9f);
generalPath.lineTo(51.0f, 28.4f);
generalPath.lineTo(51.1f, 29.1f);
generalPath.lineTo(50.899998f, 30.0f);
generalPath.lineTo(41.899998f, 39.6f);
generalPath.lineTo(39.399998f, 42.3f);
generalPath.lineTo(38.399998f, 43.5f);
generalPath.lineTo(38.3f, 44.1f);
generalPath.lineTo(38.399998f, 44.8f);
generalPath.lineTo(37.8f, 45.5f);
generalPath.lineTo(37.0f, 45.0f);
generalPath.lineTo(36.7f, 44.0f);
generalPath.lineTo(36.9f, 43.0f);
generalPath.lineTo(37.5f, 42.2f);
generalPath.lineTo(43.8f, 35.5f);
generalPath.lineTo(49.1f, 29.6f);
generalPath.lineTo(49.199997f, 28.9f);
generalPath.lineTo(48.499996f, 29.0f);
generalPath.lineTo(44.699997f, 33.1f);
generalPath.lineTo(38.499996f, 39.5f);
generalPath.lineTo(34.099995f, 44.0f);
generalPath.lineTo(29.599995f, 39.8f);
generalPath.lineTo(34.699993f, 34.399998f);
generalPath.lineTo(40.499992f, 28.799997f);
generalPath.lineTo(45.79999f, 23.899998f);
generalPath.lineTo(47.199993f, 22.899998f);
generalPath.lineTo(48.199993f, 22.299997f);
generalPath.lineTo(49.199993f, 22.299997f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(14, 85, 128, 255)) : new Color(14, 85, 128, 255);
stroke = new BasicStroke(0.6f,0,1,1.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(49.2f, 22.3f);
generalPath.lineTo(50.3f, 22.4f);
generalPath.lineTo(51.0f, 23.0f);
generalPath.curveTo(51.0f, 23.0f, 51.5f, 24.0f, 51.5f, 23.9f);
generalPath.lineTo(51.5f, 25.1f);
generalPath.lineTo(51.1f, 26.2f);
generalPath.lineTo(50.6f, 27.0f);
generalPath.lineTo(50.6f, 27.9f);
generalPath.lineTo(51.0f, 28.4f);
generalPath.lineTo(51.1f, 29.1f);
generalPath.lineTo(50.899998f, 30.0f);
generalPath.lineTo(41.899998f, 39.6f);
generalPath.lineTo(39.399998f, 42.3f);
generalPath.lineTo(38.399998f, 43.5f);
generalPath.lineTo(38.3f, 44.1f);
generalPath.lineTo(38.399998f, 44.8f);
generalPath.lineTo(37.8f, 45.5f);
generalPath.lineTo(37.0f, 45.0f);
generalPath.lineTo(36.7f, 44.0f);
generalPath.lineTo(36.9f, 43.0f);
generalPath.lineTo(37.5f, 42.2f);
generalPath.lineTo(43.8f, 35.5f);
generalPath.lineTo(49.1f, 29.6f);
generalPath.lineTo(49.199997f, 28.9f);
generalPath.lineTo(48.499996f, 29.0f);
generalPath.lineTo(44.699997f, 33.1f);
generalPath.lineTo(38.499996f, 39.5f);
generalPath.lineTo(34.099995f, 44.0f);
generalPath.lineTo(29.599995f, 39.8f);
generalPath.lineTo(34.699993f, 34.399998f);
generalPath.lineTo(40.499992f, 28.799997f);
generalPath.lineTo(45.79999f, 23.899998f);
generalPath.lineTo(47.199993f, 22.899998f);
generalPath.lineTo(48.199993f, 22.299997f);
generalPath.lineTo(49.199993f, 22.299997f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 74.20500183105469), new Point2D.Double(58.569000244140625, 87.70500183105469), new float[] {0.005f,0.3f,0.443f,0.553f,0.647f,0.73f,0.805f,0.875f,0.938f,0.998f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(223, 241, 250, 255)) : new Color(223, 241, 250, 255)),((colorFilter != null) ? colorFilter.filter(new Color(220, 238, 247, 255)) : new Color(220, 238, 247, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 228, 239, 255)) : new Color(211, 228, 239, 255)),((colorFilter != null) ? colorFilter.filter(new Color(196, 214, 227, 255)) : new Color(196, 214, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(177, 197, 213, 255)) : new Color(177, 197, 213, 255)),((colorFilter != null) ? colorFilter.filter(new Color(154, 176, 197, 255)) : new Color(154, 176, 197, 255)),((colorFilter != null) ? colorFilter.filter(new Color(129, 154, 179, 255)) : new Color(129, 154, 179, 255)),((colorFilter != null) ? colorFilter.filter(new Color(100, 130, 159, 255)) : new Color(100, 130, 159, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 108, 140, 255)) : new Color(66, 108, 140, 255)),((colorFilter != null) ? colorFilter.filter(new Color(6, 87, 122, 255)) : new Color(6, 87, 122, 255)),((colorFilter != null) ? colorFilter.filter(new Color(1, 86, 121, 255)) : new Color(1, 86, 121, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.0f, 27.7f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(1, 65, 94, 255)) : new Color(1, 65, 94, 255);
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
// _0_12
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(4.9f, 93.0f);
generalPath.lineTo(4.9f, 79.4f);
generalPath.lineTo(9.3f, 79.4f);
generalPath.curveTo(11.0f, 79.4f, 12.1f, 79.5f, 12.6f, 79.6f);
generalPath.curveTo(13.400001f, 79.799995f, 14.0f, 80.2f, 14.6f, 80.9f);
generalPath.curveTo(15.1f, 81.6f, 15.400001f, 82.5f, 15.400001f, 83.5f);
generalPath.curveTo(15.400001f, 84.3f, 15.200001f, 85.0f, 14.900001f, 85.6f);
generalPath.curveTo(14.6f, 86.2f, 14.200001f, 86.6f, 13.700001f, 86.9f);
generalPath.curveTo(13.200001f, 87.200005f, 12.800001f, 87.4f, 12.300001f, 87.5f);
generalPath.curveTo(11.600001f, 87.6f, 10.700001f, 87.7f, 9.500001f, 87.7f);
generalPath.lineTo(7.6f, 87.7f);
generalPath.lineTo(7.6f, 93.0f);
generalPath.lineTo(4.9f, 93.0f);
generalPath.closePath();
generalPath.moveTo(7.6000004f, 81.7f);
generalPath.lineTo(7.6000004f, 85.6f);
generalPath.lineTo(9.1f, 85.6f);
generalPath.curveTo(10.200001f, 85.6f, 10.900001f, 85.5f, 11.3f, 85.4f);
generalPath.curveTo(11.7f, 85.3f, 12.0f, 85.0f, 12.2f, 84.700005f);
generalPath.curveTo(12.4f, 84.4f, 12.5f, 84.00001f, 12.5f, 83.600006f);
generalPath.curveTo(12.5f, 83.100006f, 12.4f, 82.700005f, 12.1f, 82.40001f);
generalPath.curveTo(11.8f, 82.100006f, 11.400001f, 81.90001f, 11.0f, 81.80001f);
generalPath.curveTo(10.7f, 81.70001f, 10.0f, 81.70001f, 9.0f, 81.70001f);
generalPath.lineTo(7.6f, 81.70001f);
generalPath.closePath();
generalPath.moveTo(28.4f, 93.0f);
generalPath.lineTo(25.4f, 93.0f);
generalPath.lineTo(24.199999f, 89.9f);
generalPath.lineTo(18.8f, 89.9f);
generalPath.lineTo(17.7f, 93.0f);
generalPath.lineTo(14.800001f, 93.0f);
generalPath.lineTo(20.100002f, 79.4f);
generalPath.lineTo(23.0f, 79.4f);
generalPath.lineTo(28.4f, 93.0f);
generalPath.closePath();
generalPath.moveTo(23.4f, 87.6f);
generalPath.lineTo(21.5f, 82.6f);
generalPath.lineTo(19.7f, 87.6f);
generalPath.lineTo(23.400002f, 87.6f);
generalPath.closePath();
generalPath.moveTo(36.2f, 88.0f);
generalPath.lineTo(36.2f, 85.7f);
generalPath.lineTo(42.100002f, 85.7f);
generalPath.lineTo(42.100002f, 91.1f);
generalPath.curveTo(41.500004f, 91.7f, 40.7f, 92.1f, 39.600002f, 92.6f);
generalPath.curveTo(38.500004f, 93.0f, 37.4f, 93.2f, 36.300003f, 93.2f);
generalPath.curveTo(34.9f, 93.2f, 33.600002f, 92.899994f, 32.600002f, 92.299995f);
generalPath.curveTo(31.600002f, 91.7f, 30.700003f, 90.799995f, 30.200003f, 89.7f);
generalPath.curveTo(29.700003f, 88.6f, 29.400003f, 87.399994f, 29.400003f, 86.1f);
generalPath.curveTo(29.400003f, 84.7f, 29.700003f, 83.4f, 30.300003f, 82.299995f);
generalPath.curveTo(30.900003f, 81.2f, 31.800003f, 80.399994f, 32.9f, 79.799995f);
generalPath.curveTo(33.800003f, 79.299995f, 34.9f, 79.1f, 36.2f, 79.1f);
generalPath.curveTo(37.9f, 79.1f, 39.2f, 79.5f, 40.2f, 80.2f);
generalPath.curveTo(41.100002f, 80.899994f, 41.8f, 81.899994f, 42.0f, 83.1f);
generalPath.lineTo(39.3f, 83.6f);
generalPath.curveTo(39.1f, 82.9f, 38.7f, 82.4f, 38.2f, 82.0f);
generalPath.curveTo(37.7f, 81.6f, 37.0f, 81.4f, 36.2f, 81.4f);
generalPath.curveTo(35.0f, 81.4f, 34.0f, 81.8f, 33.3f, 82.5f);
generalPath.curveTo(32.6f, 83.3f, 32.2f, 84.4f, 32.2f, 85.9f);
generalPath.curveTo(32.2f, 87.5f, 32.600002f, 88.700005f, 33.3f, 89.5f);
generalPath.curveTo(34.0f, 90.3f, 35.0f, 90.7f, 36.1f, 90.7f);
generalPath.curveTo(36.699997f, 90.7f, 37.3f, 90.6f, 37.8f, 90.399994f);
generalPath.curveTo(38.399998f, 90.2f, 38.899998f, 89.899994f, 39.3f, 89.59999f);
generalPath.lineTo(39.3f, 88.0f);
generalPath.lineTo(36.2f, 88.0f);
generalPath.closePath();
generalPath.moveTo(44.7f, 93.0f);
generalPath.lineTo(44.7f, 79.4f);
generalPath.lineTo(54.800003f, 79.4f);
generalPath.lineTo(54.800003f, 81.700005f);
generalPath.lineTo(47.500004f, 81.700005f);
generalPath.lineTo(47.500004f, 84.700005f);
generalPath.lineTo(54.300003f, 84.700005f);
generalPath.lineTo(54.300003f, 87.0f);
generalPath.lineTo(47.500004f, 87.0f);
generalPath.lineTo(47.500004f, 90.7f);
generalPath.lineTo(55.0f, 90.7f);
generalPath.lineTo(55.0f, 93.0f);
generalPath.lineTo(44.7f, 93.0f);
generalPath.closePath();
generalPath.moveTo(56.6f, 88.6f);
generalPath.lineTo(59.3f, 88.299995f);
generalPath.curveTo(59.5f, 89.2f, 59.8f, 89.899994f, 60.3f, 90.299995f);
generalPath.curveTo(60.8f, 90.7f, 61.5f, 90.899994f, 62.3f, 90.899994f);
generalPath.curveTo(63.2f, 90.899994f, 63.899998f, 90.7f, 64.3f, 90.299995f);
generalPath.curveTo(64.700005f, 89.99999f, 65.0f, 89.49999f, 65.0f, 88.99999f);
generalPath.curveTo(65.0f, 88.69999f, 64.9f, 88.399994f, 64.7f, 88.19999f);
generalPath.curveTo(64.5f, 87.99999f, 64.2f, 87.79999f, 63.699997f, 87.59999f);
generalPath.curveTo(63.399998f, 87.49999f, 62.6f, 87.29999f, 61.499996f, 86.99999f);
generalPath.curveTo(59.999996f, 86.59999f, 58.999996f, 86.19999f, 58.399998f, 85.69999f);
generalPath.curveTo(57.6f, 84.99999f, 57.1f, 83.99999f, 57.1f, 82.99999f);
generalPath.curveTo(57.1f, 82.299995f, 57.3f, 81.69999f, 57.699997f, 81.09999f);
generalPath.curveTo(58.1f, 80.49999f, 58.699997f, 79.99999f, 59.399998f, 79.69999f);
generalPath.curveTo(60.1f, 79.39999f, 60.999996f, 79.19999f, 62.1f, 79.19999f);
generalPath.curveTo(63.8f, 79.19999f, 65.1f, 79.59999f, 66.0f, 80.29999f);
generalPath.curveTo(66.9f, 80.999985f, 67.3f, 81.999985f, 67.4f, 83.29999f);
generalPath.lineTo(64.700005f, 83.39999f);
generalPath.curveTo(64.600006f, 82.69999f, 64.3f, 82.19999f, 63.900005f, 81.89999f);
generalPath.curveTo(63.500004f, 81.59998f, 62.900005f, 81.39999f, 62.200005f, 81.39999f);
generalPath.curveTo(61.400005f, 81.39999f, 60.800003f, 81.59998f, 60.300003f, 81.89999f);
generalPath.curveTo(60.000004f, 82.09998f, 59.9f, 82.39999f, 59.9f, 82.69999f);
generalPath.curveTo(59.9f, 82.99999f, 60.0f, 83.29999f, 60.300003f, 83.49999f);
generalPath.curveTo(60.600002f, 83.799995f, 61.500004f, 84.09999f, 62.800003f, 84.399994f);
generalPath.curveTo(64.100006f, 84.7f, 65.100006f, 84.99999f, 65.8f, 85.399994f);
generalPath.curveTo(66.4f, 85.7f, 66.9f, 86.2f, 67.3f, 86.799995f);
generalPath.curveTo(67.700005f, 87.399994f, 67.8f, 88.1f, 67.8f, 88.99999f);
generalPath.curveTo(67.8f, 89.799995f, 67.600006f, 90.49999f, 67.200005f, 91.19999f);
generalPath.curveTo(66.8f, 91.89999f, 66.200005f, 92.39999f, 65.4f, 92.69999f);
generalPath.curveTo(64.6f, 92.99999f, 63.600002f, 93.19999f, 62.4f, 93.19999f);
generalPath.curveTo(60.7f, 93.19999f, 59.4f, 92.79999f, 58.4f, 91.99999f);
generalPath.curveTo(57.4f, 91.19999f, 56.800003f, 90.09999f, 56.600002f, 88.59999f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_pages() {
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
       ext_pages base = new ext_pages();
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
       ext_pages base = new ext_pages();
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
        return ext_pages::new;
    }
}

