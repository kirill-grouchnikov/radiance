package org.pushingpixels.radiance.demo.theming.main.check.svg.filetypes;

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
 * href="https://github.com/kirill-grouchnikov/radiance">Radiance SVG transcoder</a>.
 */
public class ext_vcf implements RadianceIcon {
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 98.899994f);
generalPath.lineTo(-0.19999695f, 98.899994f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.75, 3.0959999561309814), new Point2D.Double(35.75, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 98.899994f);
generalPath.lineTo(-0.19999695f, 98.899994f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(71.8f, 98.899994f);
generalPath.lineTo(-0.19999695f, 98.899994f);
generalPath.lineTo(-0.19999695f, 1.0f);
generalPath.lineTo(44.800003f, 1.0f);
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
generalPath.moveTo(0.7f, 63.6f);
generalPath.lineTo(70.899994f, 63.6f);
generalPath.lineTo(70.899994f, 97.899994f);
generalPath.lineTo(0.7f, 97.899994f);
generalPath.lineTo(0.7f, 63.6f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.849998474121094, 4.085000038146973), new Point2D.Double(35.849998474121094, 38.441001892089844), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 65, 54, 255)) : new Color(239, 65, 54, 255)),((colorFilter != null) ? colorFilter.filter(new Color(190, 30, 45, 255)) : new Color(190, 30, 45, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(15.1f, 90.1f);
generalPath.lineTo(7.9f, 70.3f);
generalPath.lineTo(12.3f, 70.3f);
generalPath.lineTo(17.4f, 85.0f);
generalPath.lineTo(22.3f, 70.3f);
generalPath.lineTo(26.599998f, 70.3f);
generalPath.lineTo(19.399998f, 90.100006f);
generalPath.lineTo(15.0999975f, 90.100006f);
generalPath.closePath();
generalPath.moveTo(41.4f, 82.799995f);
generalPath.lineTo(45.300003f, 83.99999f);
generalPath.curveTo(44.700005f, 86.19999f, 43.700005f, 87.799995f, 42.300003f, 88.799995f);
generalPath.curveTo(40.9f, 89.899994f, 39.100002f, 90.399994f, 37.000004f, 90.399994f);
generalPath.curveTo(34.300003f, 90.399994f, 32.200005f, 89.49999f, 30.400003f, 87.7f);
generalPath.curveTo(28.700003f, 85.899994f, 27.800003f, 83.399994f, 27.800003f, 80.299995f);
generalPath.curveTo(27.800003f, 76.99999f, 28.700003f, 74.399994f, 30.400003f, 72.6f);
generalPath.curveTo(32.100006f, 70.8f, 34.4f, 69.9f, 37.200005f, 69.9f);
generalPath.curveTo(39.700005f, 69.9f, 41.600006f, 70.6f, 43.200005f, 72.0f);
generalPath.curveTo(44.100006f, 72.8f, 44.800003f, 74.1f, 45.300003f, 75.7f);
generalPath.lineTo(41.300003f, 76.6f);
generalPath.curveTo(41.100002f, 75.6f, 40.600002f, 74.799995f, 39.800003f, 74.2f);
generalPath.curveTo(39.000004f, 73.6f, 38.100002f, 73.299995f, 37.100002f, 73.299995f);
generalPath.curveTo(35.600002f, 73.299995f, 34.4f, 73.799995f, 33.500004f, 74.899994f);
generalPath.curveTo(32.600002f, 75.99999f, 32.100002f, 77.7f, 32.100002f, 79.99999f);
generalPath.curveTo(32.100002f, 82.49999f, 32.600002f, 84.299995f, 33.500004f, 85.399994f);
generalPath.curveTo(34.400005f, 86.49999f, 35.600002f, 86.99999f, 37.100002f, 86.99999f);
generalPath.curveTo(38.2f, 86.99999f, 39.100002f, 86.69999f, 39.9f, 85.99999f);
generalPath.curveTo(40.5f, 85.299995f, 41.100002f, 84.19999f, 41.4f, 82.799995f);
generalPath.closePath();
generalPath.moveTo(48.9f, 90.1f);
generalPath.lineTo(48.9f, 70.3f);
generalPath.lineTo(62.600002f, 70.3f);
generalPath.lineTo(62.600002f, 73.700005f);
generalPath.lineTo(52.9f, 73.700005f);
generalPath.lineTo(52.9f, 78.4f);
generalPath.lineTo(61.300003f, 78.4f);
generalPath.lineTo(61.300003f, 81.8f);
generalPath.lineTo(52.9f, 81.8f);
generalPath.lineTo(52.9f, 90.200005f);
generalPath.lineTo(48.9f, 90.200005f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(51.9f, 53.3f);
generalPath.lineTo(19.1f, 53.3f);
generalPath.curveTo(15.700001f, 53.3f, 13.0f, 50.5f, 13.0f, 47.2f);
generalPath.lineTo(13.0f, 26.7f);
generalPath.curveTo(13.0f, 23.300001f, 15.8f, 20.6f, 19.1f, 20.6f);
generalPath.lineTo(51.800003f, 20.6f);
generalPath.curveTo(55.200005f, 20.6f, 57.9f, 23.4f, 57.9f, 26.7f);
generalPath.lineTo(57.9f, 47.2f);
generalPath.curveTo(58.0f, 50.5f, 55.2f, 53.3f, 51.9f, 53.3f);
generalPath.closePath();
generalPath.moveTo(19.1f, 24.6f);
generalPath.curveTo(18.0f, 24.6f, 17.1f, 25.5f, 17.1f, 26.6f);
generalPath.lineTo(17.1f, 47.1f);
generalPath.curveTo(17.1f, 48.199997f, 18.0f, 49.1f, 19.1f, 49.1f);
generalPath.lineTo(51.800003f, 49.1f);
generalPath.curveTo(52.9f, 49.1f, 53.800003f, 48.199997f, 53.800003f, 47.1f);
generalPath.lineTo(53.800003f, 26.7f);
generalPath.curveTo(53.800003f, 25.6f, 52.9f, 24.7f, 51.800003f, 24.7f);
generalPath.lineTo(19.1f, 24.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(35.5, 53.27299880981445), new Point2D.Double(35.5, 20.54599952697754), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(135, 156, 168, 255)) : new Color(135, 156, 168, 255)),((colorFilter != null) ? colorFilter.filter(new Color(77, 106, 120, 255)) : new Color(77, 106, 120, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(31.4f, 43.0f);
generalPath.lineTo(23.2f, 43.0f);
generalPath.curveTo(22.1f, 43.0f, 21.2f, 42.1f, 21.2f, 41.0f);
generalPath.curveTo(21.2f, 39.9f, 22.1f, 39.0f, 23.2f, 39.0f);
generalPath.lineTo(31.400002f, 39.0f);
generalPath.curveTo(32.5f, 39.0f, 33.4f, 39.9f, 33.4f, 41.0f);
generalPath.curveTo(33.4f, 42.1f, 32.5f, 43.0f, 31.400002f, 43.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(27.31800079345703, 43.04499816894531), new Point2D.Double(27.31800079345703, 38.95500183105469), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(135, 156, 168, 255)) : new Color(135, 156, 168, 255)),((colorFilter != null) ? colorFilter.filter(new Color(77, 106, 120, 255)) : new Color(77, 106, 120, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(31.4f, 34.9f);
generalPath.lineTo(23.2f, 34.9f);
generalPath.curveTo(22.1f, 34.9f, 21.2f, 34.0f, 21.2f, 32.9f);
generalPath.curveTo(21.2f, 31.800003f, 22.1f, 30.900002f, 23.2f, 30.900002f);
generalPath.lineTo(31.400002f, 30.900002f);
generalPath.curveTo(32.5f, 30.900002f, 33.4f, 31.800001f, 33.4f, 32.9f);
generalPath.curveTo(33.5f, 33.9f, 32.5f, 34.9f, 31.400002f, 34.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(27.31800079345703, 34.86399841308594), new Point2D.Double(27.31800079345703, 30.773000717163086), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(135, 156, 168, 255)) : new Color(135, 156, 168, 255)),((colorFilter != null) ? colorFilter.filter(new Color(77, 106, 120, 255)) : new Color(77, 106, 120, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
shape = new Ellipse2D.Double(39.60000228881836, 29.69999885559082, 8.199999809265137, 8.199999809265137);
paint = new LinearGradientPaint(new Point2D.Double(43.68199920654297, 37.93199920654297), new Point2D.Double(43.68199920654297, 29.75), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(135, 156, 168, 255)) : new Color(135, 156, 168, 255)),((colorFilter != null) ? colorFilter.filter(new Color(77, 106, 120, 255)) : new Color(77, 106, 120, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(43.7f, 39.7f);
generalPath.curveTo(40.5f, 39.7f, 38.600002f, 41.2f, 38.600002f, 42.600002f);
generalPath.curveTo(38.600002f, 43.300003f, 40.500004f, 44.100002f, 43.7f, 44.100002f);
generalPath.curveTo(46.7f, 44.100002f, 48.8f, 43.4f, 48.8f, 42.600002f);
generalPath.curveTo(48.8f, 41.100002f, 46.8f, 39.7f, 43.7f, 39.7f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(43.68199920654297, 44.06800079345703), new Point2D.Double(43.68199920654297, 39.68299865722656), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(135, 156, 168, 255)) : new Color(135, 156, 168, 255)),((colorFilter != null) ? colorFilter.filter(new Color(77, 106, 120, 255)) : new Color(77, 106, 120, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(44.800003f, 27.7f);
generalPath.lineTo(44.800003f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.82500076293945, 74.2239990234375), new Point2D.Double(58.32500076293945, 87.7239990234375), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(44.800003f, 27.7f);
generalPath.lineTo(44.800003f, 1.0f);
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
generalPath.moveTo(44.8f, 1.0f);
generalPath.lineTo(71.8f, 27.7f);
generalPath.lineTo(44.800003f, 27.7f);
generalPath.lineTo(44.800003f, 1.0f);
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
		return 0.7400000095367432;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 0.9990000128746033;
	}

	/** The current width of this icon. */
	private int width;

    /** The current height of this icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_vcf() {
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
       ext_vcf base = new ext_vcf();
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
       ext_vcf base = new ext_vcf();
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
        return ext_vcf::new;
    }
}

