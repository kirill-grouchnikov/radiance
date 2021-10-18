package org.pushingpixels.radiance.demo.laf.main.check.svg.filetypes;

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
public class ext_sldm implements RadianceIcon {
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(72.0f, 99.299995f);
generalPath.lineTo(0.0f, 99.299995f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 95.30000305175781), new Point2D.Double(36.0, -3.200000047683716), new float[] {0.0f,0.032f,0.162f,0.305f,0.468f,0.666f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(203, 85, 40, 255)) : new Color(203, 85, 40, 255)),((colorFilter != null) ? colorFilter.filter(new Color(207, 91, 39, 255)) : new Color(207, 91, 39, 255)),((colorFilter != null) ? colorFilter.filter(new Color(219, 112, 38, 255)) : new Color(219, 112, 38, 255)),((colorFilter != null) ? colorFilter.filter(new Color(230, 128, 37, 255)) : new Color(230, 128, 37, 255)),((colorFilter != null) ? colorFilter.filter(new Color(238, 140, 35, 255)) : new Color(238, 140, 35, 255)),((colorFilter != null) ? colorFilter.filter(new Color(244, 147, 34, 255)) : new Color(244, 147, 34, 255)),((colorFilter != null) ? colorFilter.filter(new Color(246, 150, 34, 255)) : new Color(246, 150, 34, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(72.0f, 99.299995f);
generalPath.lineTo(0.0f, 99.299995f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(193, 81, 39, 255)) : new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(72.0f, 99.299995f);
generalPath.lineTo(0.0f, 99.299995f);
generalPath.lineTo(0.0f, 0.8f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(56.5f, 32.0f);
generalPath.curveTo(56.5f, 34.3f, 56.0f, 36.4f, 55.1f, 38.0f);
generalPath.curveTo(54.1f, 39.7f, 52.8f, 41.1f, 51.1f, 42.1f);
generalPath.curveTo(49.3f, 43.199997f, 47.3f, 44.0f, 45.1f, 44.5f);
generalPath.curveTo(42.8f, 45.0f, 40.3f, 45.2f, 37.5f, 45.2f);
generalPath.lineTo(34.0f, 45.2f);
generalPath.lineTo(34.0f, 56.800003f);
generalPath.curveTo(34.0f, 57.500004f, 34.1f, 58.100002f, 34.4f, 58.600002f);
generalPath.curveTo(34.700005f, 59.100002f, 35.2f, 59.500004f, 35.9f, 59.800003f);
generalPath.curveTo(36.300003f, 60.000004f, 36.9f, 60.100002f, 37.800003f, 60.300003f);
generalPath.curveTo(38.700005f, 60.500004f, 39.4f, 60.600002f, 40.000004f, 60.700005f);
generalPath.lineTo(40.000004f, 63.0f);
generalPath.lineTo(17.5f, 63.0f);
generalPath.lineTo(17.5f, 60.7f);
generalPath.curveTo(18.1f, 60.600002f, 18.8f, 60.600002f, 19.8f, 60.5f);
generalPath.curveTo(20.699999f, 60.4f, 21.4f, 60.3f, 21.8f, 60.1f);
generalPath.curveTo(22.599998f, 59.8f, 23.099998f, 59.399998f, 23.3f, 59.0f);
generalPath.curveTo(23.5f, 58.600002f, 23.699999f, 57.9f, 23.699999f, 57.1f);
generalPath.lineTo(23.699999f, 27.9f);
generalPath.curveTo(23.699999f, 27.199999f, 23.599998f, 26.6f, 23.3f, 26.1f);
generalPath.curveTo(23.099998f, 25.6f, 22.599998f, 25.2f, 21.8f, 24.9f);
generalPath.curveTo(21.3f, 24.699999f, 20.5f, 24.5f, 19.599998f, 24.3f);
generalPath.curveTo(18.699999f, 24.099998f, 17.999998f, 24.0f, 17.599998f, 23.9f);
generalPath.lineTo(17.599998f, 21.6f);
generalPath.lineTo(40.5f, 21.6f);
generalPath.curveTo(45.9f, 21.6f, 49.9f, 22.5f, 52.5f, 24.2f);
generalPath.curveTo(55.1f, 25.900002f, 56.5f, 28.5f, 56.5f, 32.0f);
generalPath.closePath();
generalPath.moveTo(45.0f, 33.5f);
generalPath.curveTo(45.0f, 30.4f, 44.4f, 28.1f, 43.1f, 26.5f);
generalPath.curveTo(41.8f, 25.0f, 39.6f, 24.2f, 36.399998f, 24.2f);
generalPath.lineTo(34.0f, 24.2f);
generalPath.lineTo(34.0f, 42.300003f);
generalPath.lineTo(35.2f, 42.300003f);
generalPath.curveTo(38.4f, 42.300003f, 40.8f, 41.600002f, 42.5f, 40.100002f);
generalPath.curveTo(44.2f, 38.800003f, 45.0f, 36.600002f, 45.0f, 33.500004f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(12.838000297546387, 54.262001037597656), new Point2D.Double(49.83300018310547, 17.267000198364258), new float[] {0.005f,0.418f,0.679f,0.897f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(214, 91, 37, 255)) : new Color(214, 91, 37, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 90, 37, 255)) : new Color(211, 90, 37, 255)),((colorFilter != null) ? colorFilter.filter(new Color(202, 86, 36, 255)) : new Color(202, 86, 36, 255)),((colorFilter != null) ? colorFilter.filter(new Color(188, 79, 34, 255)) : new Color(188, 79, 34, 255)),((colorFilter != null) ? colorFilter.filter(new Color(179, 75, 33, 255)) : new Color(179, 75, 33, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.06999969482422, 23.68000030517578), new Point2D.Double(58.56999969482422, 10.180000305175781), new float[] {0.0f,0.383f,0.521f,0.62f,0.699f,0.767f,0.828f,0.882f,0.933f,0.977f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(255, 252, 227, 255)) : new Color(255, 252, 227, 255)),((colorFilter != null) ? colorFilter.filter(new Color(255, 250, 224, 255)) : new Color(255, 250, 224, 255)),((colorFilter != null) ? colorFilter.filter(new Color(253, 243, 216, 255)) : new Color(253, 243, 216, 255)),((colorFilter != null) ? colorFilter.filter(new Color(251, 235, 204, 255)) : new Color(251, 235, 204, 255)),((colorFilter != null) ? colorFilter.filter(new Color(248, 223, 187, 255)) : new Color(248, 223, 187, 255)),((colorFilter != null) ? colorFilter.filter(new Color(245, 208, 166, 255)) : new Color(245, 208, 166, 255)),((colorFilter != null) ? colorFilter.filter(new Color(241, 191, 141, 255)) : new Color(241, 191, 141, 255)),((colorFilter != null) ? colorFilter.filter(new Color(236, 170, 114, 255)) : new Color(236, 170, 114, 255)),((colorFilter != null) ? colorFilter.filter(new Color(231, 147, 84, 255)) : new Color(231, 147, 84, 255)),((colorFilter != null) ? colorFilter.filter(new Color(226, 124, 52, 255)) : new Color(226, 124, 52, 255)),((colorFilter != null) ? colorFilter.filter(new Color(223, 111, 38, 255)) : new Color(223, 111, 38, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f));
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
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(193, 81, 39, 255)) : new Color(193, 81, 39, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0f, 0.8f);
generalPath.lineTo(72.0f, 27.699999f);
generalPath.lineTo(45.0f, 27.699999f);
generalPath.lineTo(45.0f, 0.8f);
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
generalPath.moveTo(5.0f, 86.2f);
generalPath.lineTo(8.1f, 85.899994f);
generalPath.curveTo(8.3f, 86.899994f, 8.700001f, 87.7f, 9.200001f, 88.2f);
generalPath.curveTo(9.800001f, 88.7f, 10.500001f, 88.899994f, 11.500001f, 88.899994f);
generalPath.curveTo(12.500001f, 88.899994f, 13.300001f, 88.7f, 13.800001f, 88.2f);
generalPath.curveTo(14.300001f, 87.799995f, 14.600001f, 87.299995f, 14.600001f, 86.7f);
generalPath.curveTo(14.600001f, 86.299995f, 14.500001f, 86.0f, 14.300001f, 85.7f);
generalPath.curveTo(14.100001f, 85.399994f, 13.700001f, 85.2f, 13.100001f, 85.0f);
generalPath.curveTo(12.700002f, 84.9f, 11.900002f, 84.6f, 10.500002f, 84.3f);
generalPath.curveTo(8.900002f, 84.0f, 7.7000017f, 83.5f, 7.000002f, 82.8f);
generalPath.curveTo(6.000002f, 81.9f, 5.500002f, 80.9f, 5.500002f, 79.600006f);
generalPath.curveTo(5.500002f, 78.8f, 5.7000017f, 78.00001f, 6.2000017f, 77.40001f);
generalPath.curveTo(6.7000017f, 76.70001f, 7.3000016f, 76.20001f, 8.200002f, 75.80001f);
generalPath.curveTo(9.100001f, 75.40001f, 10.100001f, 75.30001f, 11.300001f, 75.30001f);
generalPath.curveTo(13.300001f, 75.30001f, 14.800001f, 75.70001f, 15.800001f, 76.60001f);
generalPath.curveTo(16.800001f, 77.500015f, 17.300001f, 78.60001f, 17.400002f, 80.10001f);
generalPath.lineTo(14.200002f, 80.20001f);
generalPath.curveTo(14.100001f, 79.40001f, 13.800002f, 78.80001f, 13.300002f, 78.500015f);
generalPath.curveTo(12.800002f, 78.10001f, 12.200002f, 78.000015f, 11.300002f, 78.000015f);
generalPath.curveTo(10.4000025f, 78.000015f, 9.600002f, 78.20001f, 9.100002f, 78.60001f);
generalPath.curveTo(8.800002f, 78.80001f, 8.600002f, 79.20001f, 8.600002f, 79.60001f);
generalPath.curveTo(8.600002f, 80.000015f, 8.800002f, 80.30001f, 9.100002f, 80.60001f);
generalPath.curveTo(9.500002f, 80.90002f, 10.500002f, 81.30001f, 12.000002f, 81.70001f);
generalPath.curveTo(13.600002f, 82.10001f, 14.700002f, 82.40001f, 15.500002f, 82.80001f);
generalPath.curveTo(16.200003f, 83.20001f, 16.800001f, 83.70001f, 17.300001f, 84.40001f);
generalPath.curveTo(17.7f, 85.100006f, 17.900002f, 85.90001f, 17.900002f, 86.90001f);
generalPath.curveTo(17.900002f, 87.80001f, 17.600002f, 88.600006f, 17.100002f, 89.40001f);
generalPath.curveTo(16.600002f, 90.00001f, 15.9000025f, 90.600006f, 15.000002f, 91.00001f);
generalPath.curveTo(14.100002f, 91.40001f, 12.900002f, 91.600006f, 11.600002f, 91.600006f);
generalPath.curveTo(9.600002f, 91.600006f, 8.100002f, 91.100006f, 7.0000024f, 90.200005f);
generalPath.curveTo(5.9000025f, 89.3f, 5.2000027f, 87.9f, 5.0000024f, 86.200005f);
generalPath.closePath();
generalPath.moveTo(20.7f, 91.299995f);
generalPath.lineTo(20.7f, 75.7f);
generalPath.lineTo(23.900002f, 75.7f);
generalPath.lineTo(23.900002f, 88.7f);
generalPath.lineTo(31.900002f, 88.7f);
generalPath.lineTo(31.900002f, 91.399994f);
generalPath.lineTo(20.7f, 91.399994f);
generalPath.closePath();
generalPath.moveTo(34.1f, 75.6f);
generalPath.lineTo(40.0f, 75.6f);
generalPath.curveTo(41.3f, 75.6f, 42.3f, 75.7f, 43.0f, 75.9f);
generalPath.curveTo(43.9f, 76.200005f, 44.7f, 76.700005f, 45.4f, 77.4f);
generalPath.curveTo(46.100002f, 78.1f, 46.600002f, 78.9f, 46.9f, 80.0f);
generalPath.curveTo(47.2f, 81.0f, 47.4f, 82.2f, 47.4f, 83.7f);
generalPath.curveTo(47.4f, 85.0f, 47.2f, 86.1f, 46.9f, 87.1f);
generalPath.curveTo(46.5f, 88.2f, 45.9f, 89.2f, 45.2f, 89.9f);
generalPath.curveTo(44.600002f, 90.4f, 43.9f, 90.9f, 43.0f, 91.200005f);
generalPath.curveTo(42.3f, 91.4f, 41.3f, 91.50001f, 40.2f, 91.50001f);
generalPath.lineTo(34.2f, 91.50001f);
generalPath.lineTo(34.2f, 75.6f);
generalPath.closePath();
generalPath.moveTo(37.3f, 78.2f);
generalPath.lineTo(37.3f, 88.6f);
generalPath.lineTo(39.7f, 88.6f);
generalPath.curveTo(40.600002f, 88.6f, 41.2f, 88.6f, 41.600002f, 88.4f);
generalPath.curveTo(42.100002f, 88.3f, 42.600002f, 88.1f, 42.9f, 87.700005f);
generalPath.curveTo(43.2f, 87.4f, 43.5f, 86.9f, 43.7f, 86.200005f);
generalPath.curveTo(43.9f, 85.50001f, 44.0f, 84.50001f, 44.0f, 83.3f);
generalPath.curveTo(44.0f, 82.1f, 43.9f, 81.100006f, 43.7f, 80.5f);
generalPath.curveTo(43.5f, 79.899994f, 43.2f, 79.3f, 42.8f, 79.0f);
generalPath.curveTo(42.399998f, 78.6f, 41.899998f, 78.4f, 41.3f, 78.3f);
generalPath.curveTo(40.899998f, 78.200005f, 40.0f, 78.100006f, 38.7f, 78.100006f);
generalPath.lineTo(37.3f, 78.100006f);
generalPath.closePath();
generalPath.moveTo(50.1f, 91.299995f);
generalPath.lineTo(50.1f, 75.6f);
generalPath.lineTo(54.899998f, 75.6f);
generalPath.lineTo(57.8f, 86.299995f);
generalPath.lineTo(60.6f, 75.6f);
generalPath.lineTo(65.4f, 75.6f);
generalPath.lineTo(65.4f, 91.299995f);
generalPath.lineTo(62.4f, 91.299995f);
generalPath.lineTo(62.4f, 78.9f);
generalPath.lineTo(59.300003f, 91.3f);
generalPath.lineTo(56.200005f, 91.3f);
generalPath.lineTo(53.0f, 78.9f);
generalPath.lineTo(53.0f, 91.3f);
generalPath.lineTo(50.1f, 91.3f);
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
	private ext_sldm() {
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
       ext_sldm base = new ext_sldm();
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
       ext_sldm base = new ext_sldm();
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
        return ext_sldm::new;
    }
}

