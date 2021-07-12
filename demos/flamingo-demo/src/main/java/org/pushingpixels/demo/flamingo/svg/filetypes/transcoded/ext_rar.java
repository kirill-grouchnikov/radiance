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
public class ext_rar implements NeonIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
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
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(71.7f, 99.2f);
generalPath.lineTo(0.2f, 99.2f);
generalPath.lineTo(0.2f, 0.9f);
generalPath.lineTo(44.9f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 2.880000114440918), new Point2D.Double(36.0, 101.125), new float[] {0.0f,0.038f,0.147f,0.258f,0.372f,0.488f,0.606f,0.728f,0.856f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(239, 196, 2, 255)) : new Color(239, 196, 2, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 200, 41, 255)) : new Color(241, 200, 41, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 210, 100, 255)) : new Color(244, 210, 100, 255)),((colorFilter != null) ? colorFilter.filter(new Color(247, 220, 139, 255)) : new Color(247, 220, 139, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 229, 172, 255)) : new Color(249, 229, 172, 255)),((colorFilter != null) ? colorFilter.filter(new Color(251, 236, 199, 255)) : new Color(251, 236, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 243, 221, 255)) : new Color(252, 243, 221, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 249, 238, 255)) : new Color(254, 249, 238, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 253, 249, 255)) : new Color(255, 253, 249, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(71.7f, 99.2f);
generalPath.lineTo(0.2f, 99.2f);
generalPath.lineTo(0.2f, 0.9f);
generalPath.lineTo(44.9f, 0.9f);
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
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(71.7f, 99.2f);
generalPath.lineTo(0.2f, 99.2f);
generalPath.lineTo(0.2f, 0.9f);
generalPath.lineTo(44.9f, 0.9f);
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
generalPath.moveTo(8.1f, 92.2f);
generalPath.lineTo(8.1f, 72.3f);
generalPath.lineTo(16.6f, 72.3f);
generalPath.curveTo(18.7f, 72.3f, 20.300001f, 72.5f, 21.2f, 72.8f);
generalPath.curveTo(22.1f, 73.100006f, 22.900002f, 73.8f, 23.5f, 74.700005f);
generalPath.curveTo(24.1f, 75.600006f, 24.4f, 76.700005f, 24.4f, 77.8f);
generalPath.curveTo(24.4f, 79.3f, 24.0f, 80.5f, 23.1f, 81.5f);
generalPath.curveTo(22.2f, 82.5f, 20.9f, 83.1f, 19.2f, 83.3f);
generalPath.curveTo(20.1f, 83.8f, 20.800001f, 84.4f, 21.400002f, 85.0f);
generalPath.curveTo(22.000002f, 85.6f, 22.7f, 86.7f, 23.7f, 88.2f);
generalPath.lineTo(26.1f, 92.1f);
generalPath.lineTo(21.3f, 92.1f);
generalPath.lineTo(18.4f, 87.799995f);
generalPath.curveTo(17.4f, 86.299995f, 16.699999f, 85.299995f, 16.3f, 84.899994f);
generalPath.curveTo(15.9f, 84.49999f, 15.499999f, 84.2f, 15.099999f, 84.09999f);
generalPath.curveTo(14.7f, 83.99999f, 13.999999f, 83.899994f, 13.099999f, 83.899994f);
generalPath.lineTo(12.299999f, 83.899994f);
generalPath.lineTo(12.299999f, 92.2f);
generalPath.lineTo(8.1f, 92.2f);
generalPath.closePath();
generalPath.moveTo(12.1f, 80.7f);
generalPath.lineTo(15.1f, 80.7f);
generalPath.curveTo(17.0f, 80.7f, 18.2f, 80.6f, 18.7f, 80.5f);
generalPath.curveTo(19.2f, 80.3f, 19.6f, 80.1f, 19.800001f, 79.7f);
generalPath.curveTo(20.1f, 79.299995f, 20.2f, 78.799995f, 20.2f, 78.2f);
generalPath.curveTo(20.2f, 77.5f, 20.0f, 77.0f, 19.7f, 76.6f);
generalPath.curveTo(19.300001f, 76.2f, 18.800001f, 75.9f, 18.2f, 75.799995f);
generalPath.curveTo(17.900002f, 75.799995f, 16.900002f, 75.7f, 15.300001f, 75.7f);
generalPath.lineTo(12.200001f, 75.7f);
generalPath.lineTo(12.200001f, 80.7f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(46.1f, 92.2f);
generalPath.lineTo(41.699997f, 92.2f);
generalPath.lineTo(40.0f, 87.6f);
generalPath.lineTo(32.0f, 87.6f);
generalPath.lineTo(30.4f, 92.1f);
generalPath.lineTo(26.099998f, 92.1f);
generalPath.lineTo(33.899998f, 72.2f);
generalPath.lineTo(38.1f, 72.2f);
generalPath.lineTo(46.1f, 92.2f);
generalPath.closePath();
generalPath.moveTo(38.699997f, 84.299995f);
generalPath.lineTo(36.0f, 76.9f);
generalPath.lineTo(33.3f, 84.3f);
generalPath.lineTo(38.7f, 84.3f);
generalPath.closePath();
generalPath.moveTo(48.299995f, 92.2f);
generalPath.lineTo(48.299995f, 72.3f);
generalPath.lineTo(56.799995f, 72.3f);
generalPath.curveTo(58.899994f, 72.3f, 60.499996f, 72.5f, 61.399994f, 72.8f);
generalPath.curveTo(62.29999f, 73.100006f, 63.099995f, 73.8f, 63.699993f, 74.700005f);
generalPath.curveTo(64.299995f, 75.600006f, 64.59999f, 76.700005f, 64.59999f, 77.8f);
generalPath.curveTo(64.59999f, 79.3f, 64.19999f, 80.5f, 63.29999f, 81.5f);
generalPath.curveTo(62.399994f, 82.5f, 61.09999f, 83.1f, 59.39999f, 83.3f);
generalPath.curveTo(60.29999f, 83.8f, 60.99999f, 84.4f, 61.59999f, 85.0f);
generalPath.curveTo(62.199993f, 85.6f, 62.89999f, 86.7f, 63.89999f, 88.2f);
generalPath.lineTo(66.29999f, 92.1f);
generalPath.lineTo(61.49999f, 92.1f);
generalPath.lineTo(58.599987f, 87.799995f);
generalPath.curveTo(57.599987f, 86.299995f, 56.899986f, 85.299995f, 56.49999f, 84.899994f);
generalPath.curveTo(56.099987f, 84.49999f, 55.69999f, 84.2f, 55.299988f, 84.09999f);
generalPath.curveTo(54.899986f, 83.99999f, 54.19999f, 83.899994f, 53.299988f, 83.899994f);
generalPath.lineTo(52.49999f, 83.899994f);
generalPath.lineTo(52.49999f, 92.2f);
generalPath.lineTo(48.299988f, 92.2f);
generalPath.closePath();
generalPath.moveTo(52.299995f, 80.7f);
generalPath.lineTo(55.299995f, 80.7f);
generalPath.curveTo(57.199997f, 80.7f, 58.399994f, 80.6f, 58.899994f, 80.5f);
generalPath.curveTo(59.399994f, 80.3f, 59.799995f, 80.1f, 59.999992f, 79.7f);
generalPath.curveTo(60.29999f, 79.299995f, 60.399994f, 78.799995f, 60.399994f, 78.2f);
generalPath.curveTo(60.399994f, 77.5f, 60.199993f, 77.0f, 59.899994f, 76.6f);
generalPath.curveTo(59.499992f, 76.2f, 58.999992f, 75.9f, 58.399994f, 75.799995f);
generalPath.curveTo(58.099995f, 75.799995f, 57.099995f, 75.7f, 55.499992f, 75.7f);
generalPath.lineTo(52.399994f, 75.7f);
generalPath.lineTo(52.399994f, 80.7f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(44.9f, 27.699999f);
generalPath.lineTo(44.9f, 0.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.94200134277344, 74.32599639892578), new Point2D.Double(58.347999572753906, 87.73300170898438), new float[] {0.005f,0.234f,0.369f,0.481f,0.579f,0.669f,0.752f,0.831f,0.905f,0.975f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 254, 251, 255)) : new Color(255, 254, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(254, 250, 241, 255)) : new Color(254, 250, 241, 255)),((colorFilter != null) ? colorFilter.filter(new Color(253, 245, 228, 255)) : new Color(253, 245, 228, 255)),((colorFilter != null) ? colorFilter.filter(new Color(252, 240, 210, 255)) : new Color(252, 240, 210, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 233, 188, 255)) : new Color(250, 233, 188, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 226, 162, 255)) : new Color(249, 226, 162, 255)),((colorFilter != null) ? colorFilter.filter(new Color(247, 218, 131, 255)) : new Color(247, 218, 131, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 209, 93, 255)) : new Color(244, 209, 93, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 200, 39, 255)) : new Color(241, 200, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(239, 196, 2, 255)) : new Color(239, 196, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_1
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(44.9f, 27.699999f);
generalPath.lineTo(44.9f, 0.9f);
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
generalPath.moveTo(44.9f, 0.9f);
generalPath.lineTo(71.7f, 27.699999f);
generalPath.lineTo(44.9f, 27.699999f);
generalPath.lineTo(44.9f, 0.9f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.0f, 15.8f);
generalPath.lineTo(29.6f, 15.8f);
generalPath.lineTo(29.6f, 10.8f);
generalPath.lineTo(38.0f, 10.8f);
generalPath.lineTo(38.0f, 15.8f);
generalPath.closePath();
generalPath.moveTo(38.0f, 24.7f);
generalPath.lineTo(29.6f, 24.7f);
generalPath.lineTo(29.6f, 29.7f);
generalPath.lineTo(38.0f, 29.7f);
generalPath.lineTo(38.0f, 24.7f);
generalPath.closePath();
generalPath.moveTo(38.0f, 3.9000015f);
generalPath.lineTo(29.6f, 3.9000015f);
generalPath.lineTo(29.6f, 8.900002f);
generalPath.lineTo(38.0f, 8.900002f);
generalPath.lineTo(38.0f, 3.9000015f);
generalPath.closePath();
generalPath.moveTo(38.0f, 17.7f);
generalPath.lineTo(29.6f, 17.7f);
generalPath.lineTo(29.6f, 22.7f);
generalPath.lineTo(38.0f, 22.7f);
generalPath.lineTo(38.0f, 17.7f);
generalPath.closePath();
generalPath.moveTo(38.0f, 31.6f);
generalPath.lineTo(29.6f, 31.6f);
generalPath.lineTo(29.6f, 36.6f);
generalPath.lineTo(38.0f, 36.6f);
generalPath.lineTo(38.0f, 31.599998f);
generalPath.closePath();
generalPath.moveTo(38.7f, 56.2f);
generalPath.curveTo(38.7f, 59.0f, 36.4f, 61.3f, 33.600002f, 61.3f);
generalPath.curveTo(30.800003f, 61.3f, 28.500002f, 59.0f, 28.500002f, 56.2f);
generalPath.lineTo(28.500002f, 55.7f);
generalPath.lineTo(30.200003f, 41.1f);
generalPath.curveTo(30.200003f, 39.199997f, 31.700003f, 37.699997f, 33.600002f, 37.699997f);
generalPath.curveTo(35.4f, 37.699997f, 36.9f, 39.199997f, 37.000004f, 40.999996f);
generalPath.lineTo(38.600002f, 55.399994f);
generalPath.curveTo(38.7f, 55.799995f, 38.7f, 55.999992f, 38.7f, 56.199993f);
generalPath.closePath();
generalPath.moveTo(37.100002f, 56.100002f);
generalPath.curveTo(37.100002f, 54.2f, 35.500004f, 52.600002f, 33.600002f, 52.600002f);
generalPath.curveTo(31.7f, 52.600002f, 30.100002f, 54.2f, 30.100002f, 56.100002f);
generalPath.curveTo(30.100002f, 58.000004f, 31.700003f, 59.600002f, 33.600002f, 59.600002f);
generalPath.curveTo(35.600002f, 59.500004f, 37.100002f, 57.9f, 37.100002f, 56.100002f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(33.617000579833984, 40.68899917602539), new Point2D.Double(33.617000579833984, 98.14800262451172), new float[] {0.005f,0.533f,0.639f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(164, 125, 3, 255)) : new Color(164, 125, 3, 255)),((colorFilter != null) ? colorFilter.filter(new Color(222, 190, 0, 255)) : new Color(222, 190, 0, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 173, 4, 255)) : new Color(207, 173, 4, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 120, 2, 255)) : new Color(160, 120, 2, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.98f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(32.5f, 41.6f);
generalPath.lineTo(30.2f, 37.1f);
generalPath.lineTo(30.2f, 34.8f);
generalPath.lineTo(32.5f, 32.6f);
generalPath.lineTo(34.7f, 32.6f);
generalPath.lineTo(37.0f, 34.8f);
generalPath.lineTo(37.0f, 37.1f);
generalPath.lineTo(34.7f, 41.6f);
generalPath.lineTo(32.5f, 41.6f);
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
        return 0.13199996948242188;
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
		return 0.73499995470047;
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
	private ext_rar() {
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
       ext_rar base = new ext_rar();
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
       ext_rar base = new ext_rar();
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
        return ext_rar::new;
    }
}

