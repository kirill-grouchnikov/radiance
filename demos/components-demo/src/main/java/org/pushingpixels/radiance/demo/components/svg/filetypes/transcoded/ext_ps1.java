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
public class ext_ps1 implements RadianceIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.099998474121094, 97.0), new Point2D.Double(36.099998474121094, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(200, 212, 219, 255)) : new Color(200, 212, 219, 255)),((colorFilter != null) ? colorFilter.filter(new Color(216, 225, 230, 255)) : new Color(216, 225, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(235, 240, 243, 255)) : new Color(235, 240, 243, 255)),((colorFilter != null) ? colorFilter.filter(new Color(249, 250, 251, 255)) : new Color(249, 250, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.lineTo(0.2f, 99.0f);
generalPath.lineTo(0.2f, 1.0f);
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
generalPath.lineTo(13.1f, 71.2f);
generalPath.lineTo(19.6f, 71.2f);
generalPath.curveTo(22.1f, 71.2f, 23.7f, 71.299995f, 24.400002f, 71.5f);
generalPath.curveTo(25.500002f, 71.8f, 26.500002f, 72.4f, 27.300001f, 73.4f);
generalPath.curveTo(28.1f, 74.4f, 28.500002f, 75.700005f, 28.500002f, 77.3f);
generalPath.curveTo(28.500002f, 78.5f, 28.300001f, 79.5f, 27.800001f, 80.4f);
generalPath.curveTo(27.400002f, 81.200005f, 26.800001f, 81.9f, 26.1f, 82.4f);
generalPath.curveTo(25.4f, 82.9f, 24.7f, 83.200005f, 24.0f, 83.3f);
generalPath.curveTo(23.0f, 83.5f, 21.6f, 83.600006f, 19.8f, 83.600006f);
generalPath.lineTo(17.199999f, 83.600006f);
generalPath.lineTo(17.199999f, 91.100006f);
generalPath.lineTo(13.099998f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(17.1f, 74.6f);
generalPath.lineTo(17.1f, 80.2f);
generalPath.lineTo(19.300001f, 80.2f);
generalPath.curveTo(20.900002f, 80.2f, 22.000002f, 80.1f, 22.500002f, 79.899994f);
generalPath.curveTo(23.000002f, 79.7f, 23.500002f, 79.399994f, 23.800001f, 78.899994f);
generalPath.curveTo(24.1f, 78.49999f, 24.300001f, 77.899994f, 24.300001f, 77.399994f);
generalPath.curveTo(24.300001f, 76.7f, 24.1f, 76.09999f, 23.7f, 75.59999f);
generalPath.curveTo(23.300001f, 75.09999f, 22.7f, 74.79999f, 22.1f, 74.69999f);
generalPath.curveTo(21.6f, 74.59999f, 20.7f, 74.59999f, 19.2f, 74.59999f);
generalPath.lineTo(17.1f, 74.59999f);
generalPath.closePath();
generalPath.moveTo(30.7f, 84.6f);
generalPath.lineTo(34.600002f, 84.2f);
generalPath.curveTo(34.800003f, 85.5f, 35.300003f, 86.5f, 36.000004f, 87.1f);
generalPath.curveTo(36.700005f, 87.7f, 37.700005f, 88.0f, 38.900005f, 88.0f);
generalPath.curveTo(40.200005f, 88.0f, 41.200005f, 87.7f, 41.800007f, 87.2f);
generalPath.curveTo(42.500008f, 86.7f, 42.800007f, 86.0f, 42.800007f, 85.299995f);
generalPath.curveTo(42.800007f, 84.799995f, 42.70001f, 84.399994f, 42.400005f, 84.1f);
generalPath.curveTo(42.100006f, 83.799995f, 41.600006f, 83.5f, 40.900005f, 83.2f);
generalPath.curveTo(40.400005f, 83.0f, 39.400005f, 82.7f, 37.700005f, 82.299995f);
generalPath.curveTo(35.500004f, 81.799995f, 34.000004f, 81.1f, 33.100006f, 80.299995f);
generalPath.curveTo(31.900005f, 79.2f, 31.300007f, 77.899994f, 31.300007f, 76.299995f);
generalPath.curveTo(31.300007f, 75.299995f, 31.600006f, 74.299995f, 32.20001f, 73.49999f);
generalPath.curveTo(32.800007f, 72.59999f, 33.60001f, 71.99999f, 34.70001f, 71.49999f);
generalPath.curveTo(35.800007f, 70.99999f, 37.10001f, 70.799995f, 38.60001f, 70.799995f);
generalPath.curveTo(41.10001f, 70.799995f, 43.00001f, 71.299995f, 44.30001f, 72.399994f);
generalPath.curveTo(45.60001f, 73.49999f, 46.200012f, 74.899994f, 46.30001f, 76.799995f);
generalPath.lineTo(42.30001f, 76.99999f);
generalPath.curveTo(42.10001f, 75.99999f, 41.80001f, 75.19999f, 41.200012f, 74.799995f);
generalPath.curveTo(40.600014f, 74.399994f, 39.80001f, 74.1f, 38.600014f, 74.1f);
generalPath.curveTo(37.400013f, 74.1f, 36.500015f, 74.299995f, 35.800014f, 74.799995f);
generalPath.curveTo(35.400013f, 75.1f, 35.200016f, 75.49999f, 35.200016f, 75.99999f);
generalPath.curveTo(35.200016f, 76.49999f, 35.400017f, 76.899994f, 35.800014f, 77.19999f);
generalPath.curveTo(36.300014f, 77.59999f, 37.500015f, 78.09999f, 39.500015f, 78.49999f);
generalPath.curveTo(41.500015f, 78.99999f, 42.900017f, 79.399994f, 43.900017f, 79.899994f);
generalPath.curveTo(44.80002f, 80.399994f, 45.600018f, 81.09999f, 46.100018f, 81.899994f);
generalPath.curveTo(46.600018f, 82.7f, 46.900017f, 83.799995f, 46.900017f, 85.09999f);
generalPath.curveTo(46.900017f, 86.19999f, 46.600018f, 87.29999f, 45.900017f, 88.29999f);
generalPath.curveTo(45.30002f, 89.29999f, 44.400017f, 89.999985f, 43.200016f, 90.499985f);
generalPath.curveTo(42.000015f, 90.999985f, 40.600018f, 91.19998f, 38.900017f, 91.19998f);
generalPath.curveTo(36.400017f, 91.19998f, 34.400017f, 90.59998f, 33.100018f, 89.499985f);
generalPath.curveTo(31.800018f, 88.499985f, 31.000017f, 86.79999f, 30.700018f, 84.59998f);
generalPath.closePath();
generalPath.moveTo(59.300003f, 91.1f);
generalPath.lineTo(55.500004f, 91.1f);
generalPath.lineTo(55.500004f, 76.7f);
generalPath.curveTo(54.100002f, 78.0f, 52.500004f, 79.0f, 50.600002f, 79.6f);
generalPath.lineTo(50.600002f, 76.1f);
generalPath.curveTo(51.600002f, 75.799995f, 52.7f, 75.2f, 53.9f, 74.299995f);
generalPath.curveTo(55.100002f, 73.399994f, 55.9f, 72.299995f, 56.300003f, 71.1f);
generalPath.lineTo(59.4f, 71.1f);
generalPath.lineTo(59.300003f, 91.1f);
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
paint = new LinearGradientPaint(new Point2D.Double(10.211000442504883, 59.04999923706055), new Point2D.Double(63.21099853515625, 59.04999923706055), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
stroke = new BasicStroke(5.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(40.9f, 23.1f);
generalPath.lineTo(57.0f, 23.1f);
generalPath.curveTo(60.3f, 23.1f, 61.1f, 24.2f, 60.5f, 27.3f);
generalPath.curveTo(58.5f, 36.4f, 56.4f, 45.699997f, 54.3f, 54.8f);
generalPath.curveTo(53.6f, 57.7f, 52.2f, 58.899998f, 49.0f, 58.899998f);
generalPath.lineTo(16.7f, 58.899998f);
generalPath.curveTo(13.200001f, 58.899998f, 12.200001f, 57.699997f, 13.1f, 54.399998f);
generalPath.curveTo(15.200001f, 45.399998f, 17.2f, 36.5f, 19.3f, 27.299997f);
generalPath.curveTo(20.099998f, 23.799997f, 21.3f, 22.899998f, 24.8f, 22.899998f);
generalPath.curveTo(30.199999f, 23.099998f, 35.5f, 23.099998f, 40.9f, 23.099998f);
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
generalPath.moveTo(34.9f, 40.9f);
generalPath.curveTo(34.300003f, 40.300003f, 34.0f, 39.800003f, 33.7f, 39.5f);
generalPath.curveTo(31.6f, 37.3f, 29.900002f, 35.1f, 27.800001f, 33.0f);
generalPath.curveTo(26.900002f, 32.0f, 26.6f, 31.0f, 27.7f, 30.0f);
generalPath.curveTo(28.800001f, 29.0f, 29.800001f, 29.1f, 30.900002f, 30.3f);
generalPath.curveTo(33.7f, 33.5f, 36.5f, 36.5f, 39.300003f, 39.5f);
generalPath.curveTo(40.4f, 40.7f, 40.100002f, 41.4f, 38.9f, 42.3f);
generalPath.curveTo(34.4f, 45.6f, 30.000002f, 48.8f, 25.600002f, 52.1f);
generalPath.curveTo(24.600002f, 52.8f, 23.600002f, 53.0f, 22.800003f, 51.899998f);
generalPath.curveTo(21.900003f, 50.699997f, 22.700003f, 49.999996f, 23.700003f, 49.3f);
generalPath.curveTo(27.100002f, 46.899998f, 30.200003f, 44.399998f, 33.600002f, 42.0f);
generalPath.curveTo(33.9f, 41.7f, 34.600002f, 41.2f, 34.9f, 40.9f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(22.31399917602539, 59.053001403808594), new Point2D.Double(39.89699935913086, 59.053001403808594), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
generalPath.moveTo(38.1f, 51.8f);
generalPath.curveTo(37.199997f, 51.8f, 36.699997f, 51.0f, 36.699997f, 50.1f);
generalPath.curveTo(36.699997f, 49.3f, 37.299995f, 48.399998f, 38.1f, 48.399998f);
generalPath.lineTo(46.0f, 48.399998f);
generalPath.curveTo(46.9f, 48.399998f, 47.4f, 49.199997f, 47.4f, 50.1f);
generalPath.curveTo(47.4f, 50.899998f, 46.800003f, 51.8f, 46.0f, 51.8f);
generalPath.lineTo(38.1f, 51.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.720001220703125, 49.88600158691406), new Point2D.Double(47.492000579833984, 49.88600158691406), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(173, 204, 220, 255)) : new Color(173, 204, 220, 255)),((colorFilter != null) ? colorFilter.filter(new Color(76, 108, 123, 255)) : new Color(76, 108, 123, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(45.125999450683594, 25.77400016784668), new Point2D.Double(58.57500076293945, 12.324999809265137), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255)),((colorFilter != null) ? colorFilter.filter(new Color(250, 251, 251, 255)) : new Color(250, 251, 251, 255)),((colorFilter != null) ? colorFilter.filter(new Color(237, 241, 244, 255)) : new Color(237, 241, 244, 255)),((colorFilter != null) ? colorFilter.filter(new Color(221, 229, 233, 255)) : new Color(221, 229, 233, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 211, 218, 255)) : new Color(199, 211, 218, 255)),((colorFilter != null) ? colorFilter.filter(new Color(173, 189, 199, 255)) : new Color(173, 189, 199, 255)),((colorFilter != null) ? colorFilter.filter(new Color(146, 165, 176, 255)) : new Color(146, 165, 176, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
	private ext_ps1() {
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
       ext_ps1 base = new ext_ps1();
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
       ext_ps1 base = new ext_ps1();
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
        return ext_ps1::new;
    }
}

