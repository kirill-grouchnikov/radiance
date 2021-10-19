package org.pushingpixels.radiance.demo.components.svg.filetypes.transcoded;

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
public class ext_tmp implements RadianceIcon {
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
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
generalPath.lineTo(45.100002f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.108001708984375, 3.003000020980835), new Point2D.Double(36.108001708984375, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
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
generalPath.moveTo(13.1f, 91.1f);
generalPath.lineTo(13.1f, 74.6f);
generalPath.lineTo(7.1000004f, 74.6f);
generalPath.lineTo(7.1000004f, 71.2f);
generalPath.lineTo(23.0f, 71.2f);
generalPath.lineTo(23.0f, 74.6f);
generalPath.lineTo(17.1f, 74.6f);
generalPath.lineTo(17.1f, 91.1f);
generalPath.lineTo(13.1f, 91.1f);
generalPath.closePath();
generalPath.moveTo(25.6f, 91.1f);
generalPath.lineTo(25.6f, 71.2f);
generalPath.lineTo(31.6f, 71.2f);
generalPath.lineTo(35.2f, 84.7f);
generalPath.lineTo(38.8f, 71.2f);
generalPath.lineTo(44.8f, 71.2f);
generalPath.lineTo(44.8f, 91.0f);
generalPath.lineTo(41.1f, 91.0f);
generalPath.lineTo(41.1f, 75.4f);
generalPath.lineTo(37.1f, 91.0f);
generalPath.lineTo(33.199997f, 91.0f);
generalPath.lineTo(29.199997f, 75.4f);
generalPath.lineTo(29.199997f, 91.0f);
generalPath.lineTo(25.599997f, 91.0f);
generalPath.closePath();
generalPath.moveTo(48.800003f, 91.1f);
generalPath.lineTo(48.800003f, 71.2f);
generalPath.lineTo(55.300003f, 71.2f);
generalPath.curveTo(57.800003f, 71.2f, 59.4f, 71.299995f, 60.100002f, 71.5f);
generalPath.curveTo(61.2f, 71.8f, 62.2f, 72.4f, 63.000004f, 73.4f);
generalPath.curveTo(63.800003f, 74.4f, 64.200005f, 75.700005f, 64.200005f, 77.3f);
generalPath.curveTo(64.200005f, 78.5f, 64.00001f, 79.5f, 63.500004f, 80.4f);
generalPath.curveTo(63.0f, 81.3f, 62.500004f, 81.9f, 61.800003f, 82.4f);
generalPath.curveTo(61.100002f, 82.9f, 60.4f, 83.200005f, 59.700005f, 83.3f);
generalPath.curveTo(58.700005f, 83.5f, 57.300003f, 83.600006f, 55.500004f, 83.600006f);
generalPath.lineTo(52.900005f, 83.600006f);
generalPath.lineTo(52.900005f, 91.100006f);
generalPath.lineTo(48.800007f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(52.9f, 74.6f);
generalPath.lineTo(52.9f, 80.2f);
generalPath.lineTo(55.100002f, 80.2f);
generalPath.curveTo(56.7f, 80.2f, 57.800003f, 80.1f, 58.300003f, 79.899994f);
generalPath.curveTo(58.800003f, 79.7f, 59.300003f, 79.399994f, 59.600002f, 78.899994f);
generalPath.curveTo(59.9f, 78.49999f, 60.100002f, 77.899994f, 60.100002f, 77.399994f);
generalPath.curveTo(60.100002f, 76.7f, 59.9f, 76.09999f, 59.500004f, 75.59999f);
generalPath.curveTo(59.100002f, 75.09999f, 58.500004f, 74.79999f, 57.900005f, 74.69999f);
generalPath.curveTo(57.400005f, 74.59999f, 56.500004f, 74.59999f, 55.000004f, 74.59999f);
generalPath.lineTo(52.900005f, 74.59999f);
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
generalPath.moveTo(45.1f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(45.1f, 27.7f);
generalPath.lineTo(45.1f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(24.2f, 41.8f);
generalPath.lineTo(28.800001f, 38.0f);
generalPath.curveTo(28.900002f, 37.9f, 29.000002f, 37.9f, 29.000002f, 37.8f);
generalPath.curveTo(29.400002f, 37.399998f, 29.600002f, 36.899998f, 29.600002f, 36.399998f);
generalPath.lineTo(29.600002f, 36.199997f);
generalPath.lineTo(29.000002f, 28.099997f);
generalPath.lineTo(29.000002f, 28.0f);
generalPath.curveTo(28.900002f, 27.3f, 28.400002f, 26.8f, 27.700003f, 26.8f);
generalPath.curveTo(27.000002f, 26.8f, 26.400003f, 27.3f, 26.400003f, 28.0f);
generalPath.lineTo(25.900003f, 35.4f);
generalPath.curveTo(25.900003f, 35.600002f, 25.800003f, 35.800003f, 25.700003f, 36.0f);
generalPath.lineTo(22.300003f, 40.0f);
generalPath.curveTo(21.900003f, 40.5f, 21.900003f, 41.3f, 22.400003f, 41.7f);
generalPath.curveTo(22.900003f, 42.3f, 23.700003f, 42.3f, 24.200003f, 41.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(25.756000518798828, 26.80699920654297), new Point2D.Double(25.756000518798828, 42.16400146484375), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 213, 219, 255)) : new Color(202, 213, 219, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(12.0f, 36.2f);
generalPath.curveTo(12.0f, 44.100002f, 18.0f, 50.7f, 25.7f, 51.6f);
generalPath.curveTo(25.7f, 51.0f, 25.6f, 50.399998f, 25.6f, 49.899998f);
generalPath.curveTo(25.6f, 49.1f, 25.6f, 48.399998f, 25.7f, 47.6f);
generalPath.curveTo(20.2f, 46.699997f, 15.900001f, 42.0f, 15.900001f, 36.199997f);
generalPath.curveTo(15.900001f, 29.799997f, 21.1f, 24.699997f, 27.400002f, 24.699997f);
generalPath.curveTo(32.300003f, 24.699997f, 36.5f, 27.799997f, 38.2f, 32.1f);
generalPath.curveTo(39.5f, 31.699999f, 40.8f, 31.399998f, 42.100002f, 31.199999f);
generalPath.curveTo(40.000004f, 25.099998f, 34.2f, 20.699999f, 27.400002f, 20.699999f);
generalPath.curveTo(19.0f, 20.6f, 12.0f, 27.6f, 12.0f, 36.2f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(27.12700080871582, 20.615999221801758), new Point2D.Double(27.12700080871582, 51.577999114990234), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 213, 219, 255)) : new Color(202, 213, 219, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
generalPath.moveTo(28.9f, 48.9f);
generalPath.lineTo(28.9f, 50.9f);
generalPath.curveTo(28.9f, 51.600002f, 29.5f, 52.2f, 30.199999f, 52.2f);
generalPath.lineTo(32.199997f, 52.2f);
generalPath.curveTo(32.499996f, 53.9f, 33.199997f, 55.5f, 34.1f, 56.9f);
generalPath.lineTo(32.699997f, 58.300003f);
generalPath.curveTo(32.199997f, 58.800003f, 32.199997f, 59.600002f, 32.699997f, 60.200005f);
generalPath.lineTo(34.1f, 61.600006f);
generalPath.curveTo(34.6f, 62.100006f, 35.399998f, 62.100006f, 36.0f, 61.600006f);
generalPath.lineTo(37.4f, 60.200005f);
generalPath.curveTo(38.800003f, 61.200005f, 40.4f, 61.800003f, 42.100002f, 62.200005f);
generalPath.lineTo(42.100002f, 64.100006f);
generalPath.curveTo(42.100002f, 64.8f, 42.7f, 65.40001f, 43.4f, 65.40001f);
generalPath.lineTo(45.4f, 65.40001f);
generalPath.curveTo(46.100002f, 65.40001f, 46.7f, 64.80001f, 46.7f, 64.100006f);
generalPath.lineTo(46.7f, 62.200005f);
generalPath.curveTo(48.4f, 61.900005f, 50.0f, 61.200005f, 51.4f, 60.200005f);
generalPath.lineTo(52.800003f, 61.500004f);
generalPath.curveTo(53.300003f, 62.000004f, 54.100002f, 62.000004f, 54.700005f, 61.500004f);
generalPath.lineTo(56.100006f, 60.100002f);
generalPath.curveTo(56.600006f, 59.600002f, 56.600006f, 58.800003f, 56.100006f, 58.2f);
generalPath.lineTo(54.700005f, 56.8f);
generalPath.curveTo(55.700005f, 55.399998f, 56.300003f, 53.7f, 56.600006f, 52.1f);
generalPath.lineTo(58.500008f, 52.1f);
generalPath.curveTo(59.20001f, 52.1f, 59.800007f, 51.5f, 59.800007f, 50.8f);
generalPath.lineTo(59.800007f, 48.8f);
generalPath.curveTo(59.800007f, 48.1f, 59.20001f, 47.5f, 58.500008f, 47.5f);
generalPath.lineTo(56.600006f, 47.5f);
generalPath.curveTo(56.300007f, 45.8f, 55.600006f, 44.2f, 54.600006f, 42.8f);
generalPath.lineTo(56.000008f, 41.399998f);
generalPath.curveTo(56.500008f, 40.899998f, 56.500008f, 40.1f, 56.000008f, 39.499996f);
generalPath.lineTo(54.600006f, 38.099995f);
generalPath.curveTo(54.100006f, 37.599995f, 53.300007f, 37.599995f, 52.700005f, 38.099995f);
generalPath.lineTo(51.300003f, 39.499996f);
generalPath.curveTo(49.9f, 38.499996f, 48.300003f, 37.899998f, 46.600002f, 37.599995f);
generalPath.lineTo(46.600002f, 35.599995f);
generalPath.curveTo(46.600002f, 34.899994f, 46.000004f, 34.299995f, 45.300003f, 34.299995f);
generalPath.lineTo(43.300003f, 34.299995f);
generalPath.curveTo(42.600002f, 34.299995f, 42.000004f, 34.899994f, 42.000004f, 35.599995f);
generalPath.lineTo(42.000004f, 37.599995f);
generalPath.curveTo(40.400005f, 37.899994f, 38.800003f, 38.599995f, 37.300003f, 39.599995f);
generalPath.lineTo(36.0f, 38.1f);
generalPath.curveTo(35.5f, 37.6f, 34.7f, 37.6f, 34.1f, 38.1f);
generalPath.lineTo(32.699997f, 39.5f);
generalPath.curveTo(32.199997f, 40.0f, 32.199997f, 40.8f, 32.699997f, 41.4f);
generalPath.lineTo(34.1f, 42.800003f);
generalPath.curveTo(33.1f, 44.200005f, 32.5f, 45.800003f, 32.199997f, 47.500004f);
generalPath.lineTo(30.199997f, 47.500004f);
generalPath.curveTo(29.499996f, 47.500004f, 28.899998f, 48.100002f, 28.899998f, 48.900005f);
generalPath.closePath();
generalPath.moveTo(39.6f, 45.100002f);
generalPath.curveTo(42.199997f, 42.4f, 46.5f, 42.4f, 49.199997f, 45.100002f);
generalPath.curveTo(51.899998f, 47.7f, 51.899998f, 52.000004f, 49.199997f, 54.700005f);
generalPath.curveTo(46.6f, 57.400005f, 42.299995f, 57.400005f, 39.6f, 54.700005f);
generalPath.curveTo(37.0f, 52.000004f, 37.0f, 47.700005f, 39.6f, 45.100006f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(44.45500183105469, 34.275001525878906), new Point2D.Double(44.45500183105469, 65.38400268554688), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(114, 145, 161, 255)) : new Color(114, 145, 161, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 213, 219, 255)) : new Color(202, 213, 219, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
		return 0.7380000352859497;
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
	private ext_tmp() {
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
       ext_tmp base = new ext_tmp();
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
       ext_tmp base = new ext_tmp();
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
        return ext_tmp::new;
    }
}

