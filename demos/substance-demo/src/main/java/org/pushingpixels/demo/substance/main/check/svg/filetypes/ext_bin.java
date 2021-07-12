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
public class ext_bin implements NeonIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
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
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.3f, 22.8f);
generalPath.curveTo(32.5f, 22.8f, 29.4f, 26.4f, 29.4f, 30.9f);
generalPath.curveTo(29.4f, 35.4f, 32.5f, 39.0f, 36.3f, 39.0f);
generalPath.curveTo(40.1f, 39.0f, 43.2f, 35.4f, 43.2f, 30.9f);
generalPath.curveTo(43.2f, 26.399998f, 40.100002f, 22.8f, 36.3f, 22.8f);
generalPath.closePath();
generalPath.moveTo(36.3f, 35.9f);
generalPath.curveTo(34.2f, 35.9f, 32.399998f, 33.7f, 32.399998f, 30.900002f);
generalPath.curveTo(32.399998f, 28.100002f, 34.1f, 25.900002f, 36.3f, 25.900002f);
generalPath.curveTo(38.399998f, 25.900002f, 40.2f, 28.100002f, 40.2f, 30.900002f);
generalPath.curveTo(40.100002f, 33.600002f, 38.4f, 35.9f, 36.3f, 35.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.29399871826172, 38.97600173950195), new Point2D.Double(36.29399871826172, 22.783000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.29399871826172, 39.47600173950195), new Point2D.Double(36.29399871826172, 22.283000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.3f, 22.8f);
generalPath.curveTo(32.5f, 22.8f, 29.4f, 26.4f, 29.4f, 30.9f);
generalPath.curveTo(29.4f, 35.4f, 32.5f, 39.0f, 36.3f, 39.0f);
generalPath.curveTo(40.1f, 39.0f, 43.2f, 35.4f, 43.2f, 30.9f);
generalPath.curveTo(43.2f, 26.399998f, 40.100002f, 22.8f, 36.3f, 22.8f);
generalPath.closePath();
generalPath.moveTo(36.3f, 35.9f);
generalPath.curveTo(34.2f, 35.9f, 32.399998f, 33.7f, 32.399998f, 30.900002f);
generalPath.curveTo(32.399998f, 28.100002f, 34.1f, 25.900002f, 36.3f, 25.900002f);
generalPath.curveTo(38.399998f, 25.900002f, 40.2f, 28.100002f, 40.2f, 30.900002f);
generalPath.curveTo(40.100002f, 33.600002f, 38.4f, 35.9f, 36.3f, 35.9f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.3f, 37.4f);
generalPath.lineTo(22.3f, 24.3f);
generalPath.curveTo(22.3f, 23.4f, 21.599998f, 22.8f, 20.8f, 22.8f);
generalPath.curveTo(19.9f, 22.8f, 19.3f, 23.5f, 19.3f, 24.3f);
generalPath.lineTo(19.3f, 37.4f);
generalPath.curveTo(19.3f, 38.300003f, 20.0f, 38.9f, 20.8f, 38.9f);
generalPath.curveTo(21.599998f, 39.0f, 22.3f, 38.300003f, 22.3f, 37.4f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(20.75, 38.97600173950195), new Point2D.Double(20.75, 22.783000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(20.75, 39.47600173950195), new Point2D.Double(20.75, 22.283000946044922), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(22.3f, 37.4f);
generalPath.lineTo(22.3f, 24.3f);
generalPath.curveTo(22.3f, 23.4f, 21.599998f, 22.8f, 20.8f, 22.8f);
generalPath.curveTo(19.9f, 22.8f, 19.3f, 23.5f, 19.3f, 24.3f);
generalPath.lineTo(19.3f, 37.4f);
generalPath.curveTo(19.3f, 38.300003f, 20.0f, 38.9f, 20.8f, 38.9f);
generalPath.curveTo(21.599998f, 39.0f, 22.3f, 38.300003f, 22.3f, 37.4f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_2
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.7f, 46.5f);
generalPath.curveTo(16.900002f, 46.5f, 13.800001f, 50.1f, 13.800001f, 54.6f);
generalPath.curveTo(13.800001f, 59.1f, 16.900002f, 62.699997f, 20.7f, 62.699997f);
generalPath.curveTo(24.5f, 62.699997f, 27.6f, 59.1f, 27.6f, 54.6f);
generalPath.curveTo(27.7f, 50.1f, 24.6f, 46.5f, 20.7f, 46.5f);
generalPath.closePath();
generalPath.moveTo(20.7f, 59.6f);
generalPath.curveTo(18.6f, 59.6f, 16.800001f, 57.399998f, 16.800001f, 54.6f);
generalPath.curveTo(16.800001f, 51.8f, 18.500002f, 49.6f, 20.7f, 49.6f);
generalPath.curveTo(22.9f, 49.6f, 24.6f, 51.8f, 24.6f, 54.6f);
generalPath.curveTo(24.6f, 57.3f, 22.9f, 59.6f, 20.7f, 59.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(20.75, 62.64899826049805), new Point2D.Double(20.75, 46.457000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(20.75, 63.14899826049805), new Point2D.Double(20.75, 45.957000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(20.7f, 46.5f);
generalPath.curveTo(16.900002f, 46.5f, 13.800001f, 50.1f, 13.800001f, 54.6f);
generalPath.curveTo(13.800001f, 59.1f, 16.900002f, 62.699997f, 20.7f, 62.699997f);
generalPath.curveTo(24.5f, 62.699997f, 27.6f, 59.1f, 27.6f, 54.6f);
generalPath.curveTo(27.7f, 50.1f, 24.6f, 46.5f, 20.7f, 46.5f);
generalPath.closePath();
generalPath.moveTo(20.7f, 59.6f);
generalPath.curveTo(18.6f, 59.6f, 16.800001f, 57.399998f, 16.800001f, 54.6f);
generalPath.curveTo(16.800001f, 51.8f, 18.500002f, 49.6f, 20.7f, 49.6f);
generalPath.curveTo(22.9f, 49.6f, 24.6f, 51.8f, 24.6f, 54.6f);
generalPath.curveTo(24.6f, 57.3f, 22.9f, 59.6f, 20.7f, 59.6f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(37.8f, 61.1f);
generalPath.lineTo(37.8f, 48.0f);
generalPath.curveTo(37.8f, 47.1f, 37.1f, 46.5f, 36.3f, 46.5f);
generalPath.curveTo(35.399998f, 46.5f, 34.8f, 47.2f, 34.8f, 48.0f);
generalPath.lineTo(34.8f, 61.1f);
generalPath.curveTo(34.8f, 62.0f, 35.5f, 62.6f, 36.3f, 62.6f);
generalPath.curveTo(37.1f, 62.6f, 37.8f, 62.0f, 37.8f, 61.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.29399871826172, 62.64899826049805), new Point2D.Double(36.29399871826172, 46.457000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.29399871826172, 63.14899826049805), new Point2D.Double(36.29399871826172, 45.957000732421875), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(37.8f, 61.1f);
generalPath.lineTo(37.8f, 48.0f);
generalPath.curveTo(37.8f, 47.1f, 37.1f, 46.5f, 36.3f, 46.5f);
generalPath.curveTo(35.399998f, 46.5f, 34.8f, 47.2f, 34.8f, 48.0f);
generalPath.lineTo(34.8f, 61.1f);
generalPath.curveTo(34.8f, 62.0f, 35.5f, 62.6f, 36.3f, 62.6f);
generalPath.curveTo(37.1f, 62.6f, 37.8f, 62.0f, 37.8f, 61.1f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.8f, 38.6f);
generalPath.lineTo(53.8f, 25.5f);
generalPath.curveTo(53.8f, 24.6f, 53.1f, 24.0f, 52.3f, 24.0f);
generalPath.curveTo(51.399998f, 24.0f, 50.8f, 24.7f, 50.8f, 25.5f);
generalPath.lineTo(50.8f, 38.6f);
generalPath.curveTo(50.8f, 39.5f, 51.5f, 40.1f, 52.3f, 40.1f);
generalPath.curveTo(53.1f, 40.1f, 53.8f, 39.399998f, 53.8f, 38.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(52.250999450683594, 40.11000061035156), new Point2D.Double(52.250999450683594, 23.917999267578125), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(52.250999450683594, 40.61000061035156), new Point2D.Double(52.250999450683594, 23.417999267578125), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(53.8f, 38.6f);
generalPath.lineTo(53.8f, 25.5f);
generalPath.curveTo(53.8f, 24.6f, 53.1f, 24.0f, 52.3f, 24.0f);
generalPath.curveTo(51.399998f, 24.0f, 50.8f, 24.7f, 50.8f, 25.5f);
generalPath.lineTo(50.8f, 38.6f);
generalPath.curveTo(50.8f, 39.5f, 51.5f, 40.1f, 52.3f, 40.1f);
generalPath.curveTo(53.1f, 40.1f, 53.8f, 39.399998f, 53.8f, 38.6f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(52.3f, 47.6f);
generalPath.curveTo(48.5f, 47.6f, 45.399998f, 51.199997f, 45.399998f, 55.699997f);
generalPath.curveTo(45.399998f, 60.199997f, 48.499996f, 63.799995f, 52.3f, 63.799995f);
generalPath.curveTo(56.100002f, 63.799995f, 59.2f, 60.199997f, 59.2f, 55.699997f);
generalPath.curveTo(59.2f, 51.199997f, 56.100002f, 47.6f, 52.3f, 47.6f);
generalPath.closePath();
generalPath.moveTo(52.3f, 60.699997f);
generalPath.curveTo(50.2f, 60.699997f, 48.399998f, 58.499996f, 48.399998f, 55.699997f);
generalPath.curveTo(48.399998f, 52.899998f, 50.1f, 50.699997f, 52.3f, 50.699997f);
generalPath.curveTo(54.5f, 50.699997f, 56.2f, 52.899998f, 56.2f, 55.699997f);
generalPath.curveTo(56.100002f, 58.499996f, 54.4f, 60.699997f, 52.3f, 60.699997f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(52.250999450683594, 63.78300094604492), new Point2D.Double(52.250999450683594, 47.590999603271484), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(52.250999450683594, 64.28299713134766), new Point2D.Double(52.250999450683594, 47.090999603271484), new float[] {0.0f,0.379f,0.576f,0.731f,0.863f,0.981f,0.99f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(134, 155, 166, 255)) : new Color(134, 155, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(131, 153, 164, 255)) : new Color(131, 153, 164, 255)),((colorFilter != null) ? colorFilter.filter(new Color(123, 146, 158, 255)) : new Color(123, 146, 158, 255)),((colorFilter != null) ? colorFilter.filter(new Color(109, 134, 148, 255)) : new Color(109, 134, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(90, 119, 133, 255)) : new Color(90, 119, 133, 255)),((colorFilter != null) ? colorFilter.filter(new Color(66, 99, 115, 255)) : new Color(66, 99, 115, 255)),((colorFilter != null) ? colorFilter.filter(new Color(65, 98, 113, 255)) : new Color(65, 98, 113, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(52.3f, 47.6f);
generalPath.curveTo(48.5f, 47.6f, 45.399998f, 51.199997f, 45.399998f, 55.699997f);
generalPath.curveTo(45.399998f, 60.199997f, 48.499996f, 63.799995f, 52.3f, 63.799995f);
generalPath.curveTo(56.100002f, 63.799995f, 59.2f, 60.199997f, 59.2f, 55.699997f);
generalPath.curveTo(59.2f, 51.199997f, 56.100002f, 47.6f, 52.3f, 47.6f);
generalPath.closePath();
generalPath.moveTo(52.3f, 60.699997f);
generalPath.curveTo(50.2f, 60.699997f, 48.399998f, 58.499996f, 48.399998f, 55.699997f);
generalPath.curveTo(48.399998f, 52.899998f, 50.1f, 50.699997f, 52.3f, 50.699997f);
generalPath.curveTo(54.5f, 50.699997f, 56.2f, 52.899998f, 56.2f, 55.699997f);
generalPath.curveTo(56.100002f, 58.499996f, 54.4f, 60.699997f, 52.3f, 60.699997f);
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
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = (colorFilter != null) ? colorFilter.filter(new Color(113, 145, 161, 255)) : new Color(113, 145, 161, 255);
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
generalPath.moveTo(14.0f, 71.5f);
generalPath.lineTo(22.0f, 71.5f);
generalPath.curveTo(23.6f, 71.5f, 24.8f, 71.6f, 25.5f, 71.7f);
generalPath.curveTo(26.2f, 71.799995f, 27.0f, 72.1f, 27.6f, 72.5f);
generalPath.curveTo(28.2f, 72.9f, 28.7f, 73.5f, 29.1f, 74.2f);
generalPath.curveTo(29.5f, 74.899994f, 29.7f, 75.7f, 29.7f, 76.5f);
generalPath.curveTo(29.7f, 77.4f, 29.400002f, 78.3f, 28.900002f, 79.1f);
generalPath.curveTo(28.400002f, 79.899994f, 27.7f, 80.5f, 26.800001f, 80.9f);
generalPath.curveTo(28.000002f, 81.3f, 29.000002f, 81.9f, 29.6f, 82.700005f);
generalPath.curveTo(30.199999f, 83.50001f, 30.6f, 84.600006f, 30.6f, 85.700005f);
generalPath.curveTo(30.6f, 86.600006f, 30.4f, 87.50001f, 30.0f, 88.4f);
generalPath.curveTo(29.6f, 89.299995f, 29.0f, 89.9f, 28.3f, 90.5f);
generalPath.curveTo(27.599998f, 91.0f, 26.699999f, 91.3f, 25.599998f, 91.5f);
generalPath.curveTo(24.899998f, 91.6f, 23.3f, 91.6f, 20.699999f, 91.6f);
generalPath.lineTo(14.0f, 91.6f);
generalPath.lineTo(14.0f, 71.5f);
generalPath.closePath();
generalPath.moveTo(18.1f, 74.8f);
generalPath.lineTo(18.1f, 79.4f);
generalPath.lineTo(20.800001f, 79.4f);
generalPath.curveTo(22.400002f, 79.4f, 23.400002f, 79.4f, 23.7f, 79.3f);
generalPath.curveTo(24.400002f, 79.200005f, 24.900002f, 79.0f, 25.300001f, 78.600006f);
generalPath.curveTo(25.7f, 78.20001f, 25.900002f, 77.700005f, 25.900002f, 77.00001f);
generalPath.curveTo(25.900002f, 76.40001f, 25.7f, 75.90001f, 25.400002f, 75.50001f);
generalPath.curveTo(25.100002f, 75.100006f, 24.500002f, 74.90001f, 23.900002f, 74.80001f);
generalPath.curveTo(23.500002f, 74.80001f, 22.300001f, 74.70001f, 20.400002f, 74.70001f);
generalPath.lineTo(18.100002f, 74.70001f);
generalPath.closePath();
generalPath.moveTo(18.1f, 82.8f);
generalPath.lineTo(18.1f, 88.200005f);
generalPath.lineTo(21.800001f, 88.200005f);
generalPath.curveTo(23.300001f, 88.200005f, 24.2f, 88.200005f, 24.6f, 88.100006f);
generalPath.curveTo(25.2f, 88.00001f, 25.7f, 87.700005f, 26.1f, 87.3f);
generalPath.curveTo(26.5f, 86.9f, 26.7f, 86.3f, 26.7f, 85.600006f);
generalPath.curveTo(26.7f, 85.00001f, 26.6f, 84.50001f, 26.300001f, 84.100006f);
generalPath.curveTo(26.000002f, 83.700005f, 25.6f, 83.40001f, 25.000002f, 83.200005f);
generalPath.curveTo(24.400002f, 83.00001f, 23.300001f, 82.9f, 21.400002f, 82.9f);
generalPath.lineTo(18.100002f, 82.9f);
generalPath.closePath();
generalPath.moveTo(34.1f, 91.5f);
generalPath.lineTo(34.1f, 71.5f);
generalPath.lineTo(38.1f, 71.5f);
generalPath.lineTo(38.1f, 91.5f);
generalPath.lineTo(34.1f, 91.5f);
generalPath.closePath();
generalPath.moveTo(42.1f, 91.5f);
generalPath.lineTo(42.1f, 71.5f);
generalPath.lineTo(46.0f, 71.5f);
generalPath.lineTo(54.2f, 84.9f);
generalPath.lineTo(54.2f, 71.5f);
generalPath.lineTo(58.0f, 71.5f);
generalPath.lineTo(58.0f, 91.5f);
generalPath.lineTo(53.9f, 91.5f);
generalPath.lineTo(45.800003f, 78.4f);
generalPath.lineTo(45.800003f, 91.5f);
generalPath.lineTo(42.100002f, 91.5f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255);
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
	private ext_bin() {
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
       ext_bin base = new ext_bin();
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
       ext_bin base = new ext_bin();
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
        return ext_bin::new;
    }
}

