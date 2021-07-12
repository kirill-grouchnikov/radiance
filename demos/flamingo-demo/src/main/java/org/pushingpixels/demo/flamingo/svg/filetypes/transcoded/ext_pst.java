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
public class ext_pst implements NeonIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.16f,0.36f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255)),((colorFilter != null) ? colorFilter.filter(new Color(25, 79, 126, 255)) : new Color(25, 79, 126, 255)),((colorFilter != null) ? colorFilter.filter(new Color(28, 95, 151, 255)) : new Color(28, 95, 151, 255)),((colorFilter != null) ? colorFilter.filter(new Color(29, 111, 181, 255)) : new Color(29, 111, 181, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255);
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
generalPath.moveTo(10.4f, 91.1f);
generalPath.lineTo(10.4f, 71.2f);
generalPath.lineTo(16.9f, 71.2f);
generalPath.curveTo(19.4f, 71.2f, 21.0f, 71.299995f, 21.7f, 71.5f);
generalPath.curveTo(22.800001f, 71.8f, 23.800001f, 72.4f, 24.6f, 73.4f);
generalPath.curveTo(25.4f, 74.4f, 25.800001f, 75.700005f, 25.800001f, 77.3f);
generalPath.curveTo(25.800001f, 78.5f, 25.6f, 79.5f, 25.1f, 80.4f);
generalPath.curveTo(24.7f, 81.200005f, 24.1f, 81.9f, 23.4f, 82.4f);
generalPath.curveTo(22.699999f, 82.9f, 22.0f, 83.200005f, 21.3f, 83.3f);
generalPath.curveTo(20.3f, 83.5f, 18.9f, 83.600006f, 17.099998f, 83.600006f);
generalPath.lineTo(14.499998f, 83.600006f);
generalPath.lineTo(14.499998f, 91.100006f);
generalPath.lineTo(10.399998f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(14.4f, 74.6f);
generalPath.lineTo(14.4f, 80.2f);
generalPath.lineTo(16.6f, 80.2f);
generalPath.curveTo(18.2f, 80.2f, 19.300001f, 80.1f, 19.800001f, 79.899994f);
generalPath.curveTo(20.300001f, 79.7f, 20.800001f, 79.399994f, 21.1f, 78.899994f);
generalPath.curveTo(21.4f, 78.49999f, 21.6f, 77.899994f, 21.6f, 77.399994f);
generalPath.curveTo(21.6f, 76.7f, 21.4f, 76.09999f, 21.0f, 75.59999f);
generalPath.curveTo(20.6f, 75.09999f, 20.0f, 74.79999f, 19.4f, 74.69999f);
generalPath.curveTo(18.9f, 74.59999f, 17.9f, 74.59999f, 16.5f, 74.59999f);
generalPath.lineTo(14.4f, 74.59999f);
generalPath.closePath();
generalPath.moveTo(28.0f, 84.6f);
generalPath.lineTo(31.9f, 84.2f);
generalPath.curveTo(32.1f, 85.5f, 32.6f, 86.5f, 33.3f, 87.1f);
generalPath.curveTo(34.0f, 87.7f, 35.0f, 88.0f, 36.2f, 88.0f);
generalPath.curveTo(37.5f, 88.0f, 38.5f, 87.7f, 39.100002f, 87.2f);
generalPath.curveTo(39.800003f, 86.7f, 40.100002f, 86.0f, 40.100002f, 85.299995f);
generalPath.curveTo(40.100002f, 84.799995f, 40.000004f, 84.399994f, 39.7f, 84.1f);
generalPath.curveTo(39.4f, 83.799995f, 38.9f, 83.5f, 38.2f, 83.2f);
generalPath.curveTo(37.7f, 83.0f, 36.600002f, 82.7f, 35.0f, 82.299995f);
generalPath.curveTo(32.8f, 81.799995f, 31.3f, 81.1f, 30.4f, 80.299995f);
generalPath.curveTo(29.199999f, 79.2f, 28.6f, 77.899994f, 28.6f, 76.299995f);
generalPath.curveTo(28.6f, 75.299995f, 28.9f, 74.299995f, 29.5f, 73.49999f);
generalPath.curveTo(30.1f, 72.59999f, 30.9f, 71.99999f, 32.0f, 71.49999f);
generalPath.curveTo(33.1f, 70.99999f, 34.4f, 70.799995f, 35.9f, 70.799995f);
generalPath.curveTo(38.4f, 70.799995f, 40.300003f, 71.299995f, 41.600002f, 72.399994f);
generalPath.curveTo(42.9f, 73.49999f, 43.500004f, 74.899994f, 43.600002f, 76.799995f);
generalPath.lineTo(39.600002f, 76.99999f);
generalPath.curveTo(39.4f, 75.99999f, 39.100002f, 75.19999f, 38.500004f, 74.799995f);
generalPath.curveTo(37.900005f, 74.399994f, 37.100002f, 74.1f, 35.900005f, 74.1f);
generalPath.curveTo(34.700005f, 74.1f, 33.800007f, 74.299995f, 33.100006f, 74.799995f);
generalPath.curveTo(32.700005f, 75.1f, 32.500008f, 75.49999f, 32.500008f, 75.99999f);
generalPath.curveTo(32.500008f, 76.49999f, 32.70001f, 76.899994f, 33.100006f, 77.19999f);
generalPath.curveTo(33.600006f, 77.59999f, 34.900005f, 78.09999f, 36.800007f, 78.49999f);
generalPath.curveTo(38.70001f, 78.899994f, 40.20001f, 79.399994f, 41.20001f, 79.899994f);
generalPath.curveTo(42.10001f, 80.399994f, 42.90001f, 81.09999f, 43.40001f, 81.899994f);
generalPath.curveTo(43.90001f, 82.7f, 44.20001f, 83.799995f, 44.20001f, 85.09999f);
generalPath.curveTo(44.20001f, 86.19999f, 43.90001f, 87.29999f, 43.20001f, 88.29999f);
generalPath.curveTo(42.60001f, 89.29999f, 41.70001f, 89.999985f, 40.500008f, 90.499985f);
generalPath.curveTo(39.300007f, 90.999985f, 37.90001f, 91.19998f, 36.100006f, 91.19998f);
generalPath.curveTo(33.600006f, 91.19998f, 31.600006f, 90.59998f, 30.300007f, 89.499985f);
generalPath.curveTo(29.100006f, 88.499985f, 28.300007f, 86.79999f, 28.000008f, 84.59998f);
generalPath.closePath();
generalPath.moveTo(52.2f, 91.1f);
generalPath.lineTo(52.2f, 74.6f);
generalPath.lineTo(46.3f, 74.6f);
generalPath.lineTo(46.3f, 71.2f);
generalPath.lineTo(62.199997f, 71.2f);
generalPath.lineTo(62.199997f, 74.6f);
generalPath.lineTo(56.299995f, 74.6f);
generalPath.lineTo(56.299995f, 91.1f);
generalPath.lineTo(52.199997f, 91.1f);
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255);
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
generalPath.moveTo(26.4f, 38.1f);
generalPath.curveTo(24.9f, 38.3f, 23.699999f, 39.899998f, 23.699999f, 41.6f);
generalPath.curveTo(23.699999f, 43.399998f, 24.9f, 45.0f, 26.4f, 45.1f);
generalPath.curveTo(27.9f, 45.3f, 29.1f, 43.699997f, 29.1f, 41.6f);
generalPath.curveTo(29.1f, 39.5f, 27.9f, 37.899998f, 26.4f, 38.1f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.413000106811523, 38.04399871826172), new Point2D.Double(26.413000106811523, 45.15599822998047), new float[] {0.005f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255)),((colorFilter != null) ? colorFilter.filter(new Color(25, 79, 126, 255)) : new Color(25, 79, 126, 255)),((colorFilter != null) ? colorFilter.filter(new Color(28, 95, 151, 255)) : new Color(28, 95, 151, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(15.9f, 27.9f);
generalPath.lineTo(15.9f, 55.6f);
generalPath.lineTo(37.6f, 59.5f);
generalPath.lineTo(37.6f, 23.7f);
generalPath.lineTo(15.899998f, 27.900002f);
generalPath.closePath();
generalPath.moveTo(26.4f, 47.3f);
generalPath.curveTo(24.0f, 47.0f, 22.099998f, 44.399998f, 22.099998f, 41.6f);
generalPath.curveTo(22.099998f, 38.8f, 23.999998f, 36.199997f, 26.399998f, 35.899998f);
generalPath.curveTo(28.799997f, 35.6f, 30.699997f, 38.199997f, 30.699997f, 41.6f);
generalPath.curveTo(30.699997f, 45.1f, 28.799997f, 47.6f, 26.399998f, 47.3f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(26.71299934387207, 23.71299934387207), new Point2D.Double(26.71299934387207, 59.48699951171875), new float[] {0.005f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255)),((colorFilter != null) ? colorFilter.filter(new Color(25, 79, 126, 255)) : new Color(25, 79, 126, 255)),((colorFilter != null) ? colorFilter.filter(new Color(28, 95, 151, 255)) : new Color(28, 95, 151, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(54.6f, 32.1f);
generalPath.lineTo(42.7f, 42.0f);
generalPath.lineTo(39.5f, 39.4f);
generalPath.lineTo(39.5f, 31.2f);
generalPath.lineTo(54.6f, 31.2f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(47.03900146484375, 31.20199966430664), new Point2D.Double(47.03900146484375, 41.99700164794922), new float[] {0.005f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255)),((colorFilter != null) ? colorFilter.filter(new Color(25, 79, 126, 255)) : new Color(25, 79, 126, 255)),((colorFilter != null) ? colorFilter.filter(new Color(28, 95, 151, 255)) : new Color(28, 95, 151, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(54.6f, 34.0f);
generalPath.lineTo(42.699997f, 43.9f);
generalPath.lineTo(39.499996f, 41.300003f);
generalPath.lineTo(39.499996f, 52.4f);
generalPath.lineTo(54.6f, 52.4f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(47.03900146484375, 34.02299880981445), new Point2D.Double(47.03900146484375, 52.426998138427734), new float[] {0.005f,0.824f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(17, 60, 96, 255)) : new Color(17, 60, 96, 255)),((colorFilter != null) ? colorFilter.filter(new Color(25, 79, 126, 255)) : new Color(25, 79, 126, 255)),((colorFilter != null) ? colorFilter.filter(new Color(28, 95, 151, 255)) : new Color(28, 95, 151, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
	private ext_pst() {
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
       ext_pst base = new ext_pst();
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
       ext_pst base = new ext_pst();
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
        return ext_pst::new;
    }
}

