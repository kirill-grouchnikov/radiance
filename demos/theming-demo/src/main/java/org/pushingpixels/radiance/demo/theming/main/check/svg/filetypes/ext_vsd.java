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
public class ext_vsd implements RadianceIcon {
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
generalPath.moveTo(45.0f, 1.0f);
generalPath.lineTo(72.0f, 27.7f);
generalPath.lineTo(72.0f, 99.0f);
generalPath.lineTo(0.0f, 99.0f);
generalPath.lineTo(0.0f, 1.0f);
generalPath.lineTo(45.0f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.005f,0.188f,0.566f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(55, 83, 157, 255)) : new Color(55, 83, 157, 255)),((colorFilter != null) ? colorFilter.filter(new Color(74, 105, 191, 255)) : new Color(74, 105, 191, 255)),((colorFilter != null) ? colorFilter.filter(new Color(112, 136, 205, 255)) : new Color(112, 136, 205, 255)),((colorFilter != null) ? colorFilter.filter(new Color(168, 183, 225, 255)) : new Color(168, 183, 225, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
paint = new LinearGradientPaint(new Point2D.Double(0.0, 50.0), new Point2D.Double(72.0, 50.0), new float[] {0.0f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 0)) : new Color(255, 255, 255, 0)),((colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(55, 83, 157, 255)) : new Color(55, 83, 157, 255);
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
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 25.774999618530273), new Point2D.Double(58.57500076293945, 12.274999618530273), new float[] {0.005f,0.604f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(223, 241, 250, 255)) : new Color(223, 241, 250, 255)),((colorFilter != null) ? colorFilter.filter(new Color(198, 208, 235, 255)) : new Color(198, 208, 235, 255)),((colorFilter != null) ? colorFilter.filter(new Color(55, 83, 157, 255)) : new Color(55, 83, 157, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(55, 83, 157, 255)) : new Color(55, 83, 157, 255);
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
generalPath.moveTo(14.4f, 91.1f);
generalPath.lineTo(7.2f, 71.2f);
generalPath.lineTo(11.6f, 71.2f);
generalPath.lineTo(16.7f, 85.899994f);
generalPath.lineTo(21.6f, 71.2f);
generalPath.lineTo(25.900002f, 71.2f);
generalPath.lineTo(18.7f, 91.0f);
generalPath.lineTo(14.400001f, 91.0f);
generalPath.closePath();
generalPath.moveTo(26.9f, 84.6f);
generalPath.lineTo(30.8f, 84.2f);
generalPath.curveTo(31.0f, 85.5f, 31.5f, 86.5f, 32.2f, 87.1f);
generalPath.curveTo(33.0f, 87.7f, 34.0f, 88.0f, 35.2f, 88.0f);
generalPath.curveTo(36.5f, 88.0f, 37.5f, 87.7f, 38.100002f, 87.2f);
generalPath.curveTo(38.800003f, 86.7f, 39.100002f, 86.0f, 39.100002f, 85.299995f);
generalPath.curveTo(39.100002f, 84.799995f, 39.000004f, 84.399994f, 38.7f, 84.1f);
generalPath.curveTo(38.4f, 83.799995f, 37.9f, 83.5f, 37.2f, 83.2f);
generalPath.curveTo(36.7f, 83.0f, 35.600002f, 82.7f, 34.0f, 82.299995f);
generalPath.curveTo(31.8f, 81.799995f, 30.3f, 81.1f, 29.4f, 80.299995f);
generalPath.curveTo(28.199999f, 79.2f, 27.6f, 77.899994f, 27.6f, 76.299995f);
generalPath.curveTo(27.6f, 75.299995f, 27.9f, 74.299995f, 28.5f, 73.49999f);
generalPath.curveTo(29.1f, 72.59999f, 29.9f, 71.99999f, 31.0f, 71.49999f);
generalPath.curveTo(32.1f, 70.99999f, 33.4f, 70.799995f, 34.9f, 70.799995f);
generalPath.curveTo(37.4f, 70.799995f, 39.300003f, 71.299995f, 40.600002f, 72.399994f);
generalPath.curveTo(41.9f, 73.49999f, 42.500004f, 74.899994f, 42.600002f, 76.799995f);
generalPath.lineTo(38.600002f, 76.99999f);
generalPath.curveTo(38.4f, 75.99999f, 38.100002f, 75.19999f, 37.500004f, 74.799995f);
generalPath.curveTo(36.900005f, 74.399994f, 36.100002f, 74.1f, 34.900005f, 74.1f);
generalPath.curveTo(33.700005f, 74.1f, 32.800007f, 74.299995f, 32.100006f, 74.799995f);
generalPath.curveTo(31.700006f, 75.1f, 31.500006f, 75.49999f, 31.500006f, 75.99999f);
generalPath.curveTo(31.500006f, 76.49999f, 31.700006f, 76.899994f, 32.100006f, 77.19999f);
generalPath.curveTo(32.600006f, 77.59999f, 33.900005f, 78.09999f, 35.800007f, 78.49999f);
generalPath.curveTo(37.70001f, 78.899994f, 39.20001f, 79.399994f, 40.20001f, 79.899994f);
generalPath.curveTo(41.10001f, 80.399994f, 41.90001f, 81.09999f, 42.40001f, 81.899994f);
generalPath.curveTo(42.90001f, 82.7f, 43.20001f, 83.799995f, 43.20001f, 85.09999f);
generalPath.curveTo(43.20001f, 86.19999f, 42.90001f, 87.29999f, 42.20001f, 88.29999f);
generalPath.curveTo(41.60001f, 89.29999f, 40.70001f, 89.999985f, 39.500008f, 90.499985f);
generalPath.curveTo(38.300007f, 90.999985f, 36.90001f, 91.19998f, 35.100006f, 91.19998f);
generalPath.curveTo(32.600006f, 91.19998f, 30.600006f, 90.59998f, 29.300007f, 89.499985f);
generalPath.curveTo(28.000008f, 88.499985f, 27.200006f, 86.79999f, 26.900007f, 84.59998f);
generalPath.closePath();
generalPath.moveTo(46.6f, 71.2f);
generalPath.lineTo(54.0f, 71.2f);
generalPath.curveTo(55.7f, 71.2f, 56.9f, 71.299995f, 57.8f, 71.6f);
generalPath.curveTo(59.0f, 71.9f, 60.0f, 72.6f, 60.8f, 73.4f);
generalPath.curveTo(61.6f, 74.200005f, 62.3f, 75.3f, 62.7f, 76.6f);
generalPath.curveTo(63.100002f, 77.9f, 63.4f, 79.4f, 63.4f, 81.299995f);
generalPath.curveTo(63.4f, 82.899994f, 63.2f, 84.299995f, 62.800003f, 85.49999f);
generalPath.curveTo(62.300003f, 86.899994f, 61.600002f, 88.09999f, 60.700005f, 88.99999f);
generalPath.curveTo(60.000004f, 89.69999f, 59.100006f, 90.19999f, 57.900005f, 90.59999f);
generalPath.curveTo(57.000004f, 90.899994f, 55.800007f, 90.99999f, 54.300007f, 90.99999f);
generalPath.lineTo(46.70001f, 90.99999f);
generalPath.lineTo(46.70001f, 71.2f);
generalPath.closePath();
generalPath.moveTo(50.6f, 74.6f);
generalPath.lineTo(50.6f, 87.7f);
generalPath.lineTo(53.6f, 87.7f);
generalPath.curveTo(54.699997f, 87.7f, 55.5f, 87.6f, 56.0f, 87.5f);
generalPath.curveTo(56.7f, 87.3f, 57.2f, 87.1f, 57.6f, 86.7f);
generalPath.curveTo(58.0f, 86.299995f, 58.399998f, 85.7f, 58.699997f, 84.799995f);
generalPath.curveTo(58.999996f, 83.899994f, 59.1f, 82.7f, 59.1f, 81.2f);
generalPath.curveTo(59.1f, 79.7f, 59.0f, 78.5f, 58.699997f, 77.7f);
generalPath.curveTo(58.399998f, 76.899994f, 57.999996f, 76.2f, 57.6f, 75.799995f);
generalPath.curveTo(57.2f, 75.399994f, 56.5f, 74.99999f, 55.699997f, 74.899994f);
generalPath.curveTo(55.1f, 74.799995f, 53.999996f, 74.7f, 52.399998f, 74.7f);
generalPath.lineTo(50.6f, 74.7f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
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
generalPath.moveTo(17.1f, 32.3f);
generalPath.lineTo(38.4f, 28.199999f);
generalPath.lineTo(38.4f, 64.0f);
generalPath.lineTo(17.100002f, 60.1f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(55, 83, 157, 255)) : new Color(55, 83, 157, 255);
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
generalPath.moveTo(53.3f, 60.5f);
generalPath.lineTo(35.2f, 60.5f);
generalPath.curveTo(34.3f, 60.5f, 33.600002f, 59.8f, 33.600002f, 58.9f);
generalPath.lineTo(33.600002f, 33.4f);
generalPath.curveTo(33.600002f, 32.5f, 34.300003f, 31.800001f, 35.2f, 31.800001f);
generalPath.lineTo(53.300003f, 31.800001f);
generalPath.curveTo(54.200005f, 31.800001f, 54.9f, 32.5f, 54.9f, 33.4f);
generalPath.lineTo(54.9f, 58.9f);
generalPath.curveTo(54.9f, 59.800003f, 54.2f, 60.5f, 53.300003f, 60.5f);
generalPath.closePath();
generalPath.moveTo(35.2f, 33.3f);
generalPath.curveTo(35.100002f, 33.3f, 35.0f, 33.399998f, 35.0f, 33.5f);
generalPath.lineTo(35.0f, 59.0f);
generalPath.curveTo(35.0f, 59.1f, 35.1f, 59.2f, 35.2f, 59.2f);
generalPath.lineTo(53.300003f, 59.2f);
generalPath.curveTo(53.4f, 59.2f, 53.500004f, 59.100002f, 53.500004f, 59.0f);
generalPath.lineTo(53.500004f, 33.4f);
generalPath.curveTo(53.500004f, 33.300003f, 53.400005f, 33.2f, 53.300003f, 33.2f);
generalPath.lineTo(35.200005f, 33.3f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(55, 83, 157, 255)) : new Color(55, 83, 157, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
paint = (colorFilter != null) ? colorFilter.filter(new Color(55, 83, 157, 255)) : new Color(55, 83, 157, 255);
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(36.0f, 49.0f);
generalPath.lineTo(42.0f, 49.0f);
generalPath.lineTo(42.0f, 55.0f);
generalPath.lineTo(36.0f, 55.0f);
generalPath.closePath();
generalPath.moveTo(43.010002f, 39.65f);
generalPath.lineTo(46.617f, 36.043003f);
generalPath.lineTo(50.223f, 39.65f);
generalPath.lineTo(46.617f, 43.256f);
generalPath.closePath();
generalPath.moveTo(43.000004f, 39.800003f);
generalPath.lineTo(38.000004f, 39.800003f);
generalPath.moveTo(47.000004f, 43.000004f);
generalPath.lineTo(47.000004f, 52.000004f);
generalPath.moveTo(42.000004f, 52.000004f);
generalPath.lineTo(48.000004f, 52.000004f);
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
generalPath.moveTo(23.0f, 41.2f);
generalPath.lineTo(25.1f, 41.2f);
generalPath.lineTo(27.4f, 48.100002f);
generalPath.curveTo(27.6f, 48.7f, 27.8f, 49.7f, 27.8f, 49.7f);
generalPath.curveTo(27.8f, 49.7f, 28.0f, 48.8f, 28.199999f, 48.100002f);
generalPath.lineTo(30.599998f, 41.2f);
generalPath.lineTo(32.699997f, 41.2f);
generalPath.lineTo(28.799997f, 51.800003f);
generalPath.lineTo(26.899998f, 51.800003f);
generalPath.lineTo(23.0f, 41.2f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(168, 183, 225, 255)) : new Color(168, 183, 225, 255);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(168, 183, 225, 255)) : new Color(168, 183, 225, 255);
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(23.0f, 41.2f);
generalPath.lineTo(25.1f, 41.2f);
generalPath.lineTo(27.4f, 48.100002f);
generalPath.curveTo(27.6f, 48.7f, 27.8f, 49.7f, 27.8f, 49.7f);
generalPath.curveTo(27.8f, 49.7f, 28.0f, 48.8f, 28.199999f, 48.100002f);
generalPath.lineTo(30.599998f, 41.2f);
generalPath.lineTo(32.699997f, 41.2f);
generalPath.lineTo(28.799997f, 51.800003f);
generalPath.lineTo(26.899998f, 51.800003f);
generalPath.lineTo(23.0f, 41.2f);
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
	private ext_vsd() {
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
       ext_vsd base = new ext_vsd();
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
       ext_vsd base = new ext_vsd();
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
        return ext_vsd::new;
    }
}

