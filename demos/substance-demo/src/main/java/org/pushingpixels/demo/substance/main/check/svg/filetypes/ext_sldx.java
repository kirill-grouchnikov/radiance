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
public class ext_sldx implements NeonIcon {
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
generalPath.moveTo(6.8f, 86.2f);
generalPath.lineTo(9.9f, 85.899994f);
generalPath.curveTo(10.099999f, 86.899994f, 10.5f, 87.7f, 11.0f, 88.2f);
generalPath.curveTo(11.6f, 88.7f, 12.3f, 88.899994f, 13.3f, 88.899994f);
generalPath.curveTo(14.3f, 88.899994f, 15.1f, 88.7f, 15.6f, 88.2f);
generalPath.curveTo(16.1f, 87.799995f, 16.4f, 87.299995f, 16.4f, 86.7f);
generalPath.curveTo(16.4f, 86.299995f, 16.3f, 86.0f, 16.1f, 85.7f);
generalPath.curveTo(15.900001f, 85.399994f, 15.5f, 85.2f, 14.900001f, 85.0f);
generalPath.curveTo(14.500001f, 84.9f, 13.700001f, 84.6f, 12.300001f, 84.3f);
generalPath.curveTo(10.600001f, 83.9f, 9.400002f, 83.4f, 8.700001f, 82.700005f);
generalPath.curveTo(7.700001f, 81.8f, 7.200001f, 80.8f, 7.200001f, 79.50001f);
generalPath.curveTo(7.200001f, 78.700005f, 7.4000006f, 77.90001f, 7.9000006f, 77.30001f);
generalPath.curveTo(8.400001f, 76.60001f, 9.000001f, 76.10001f, 9.900001f, 75.70001f);
generalPath.curveTo(10.8f, 75.30001f, 11.8f, 75.20001f, 13.0f, 75.20001f);
generalPath.curveTo(15.0f, 75.20001f, 16.5f, 75.60001f, 17.5f, 76.500015f);
generalPath.curveTo(18.5f, 77.40002f, 19.0f, 78.500015f, 19.1f, 80.000015f);
generalPath.lineTo(15.900001f, 80.10001f);
generalPath.curveTo(15.8f, 79.30001f, 15.500001f, 78.70001f, 15.000001f, 78.40002f);
generalPath.curveTo(14.500001f, 78.000015f, 13.900001f, 77.90002f, 13.000001f, 77.90002f);
generalPath.curveTo(12.100001f, 77.90002f, 11.300001f, 78.10001f, 10.800001f, 78.500015f);
generalPath.curveTo(10.500001f, 78.70001f, 10.300001f, 79.10001f, 10.300001f, 79.500015f);
generalPath.curveTo(10.300001f, 79.90002f, 10.500001f, 80.20001f, 10.800001f, 80.500015f);
generalPath.curveTo(11.200001f, 80.80002f, 12.200001f, 81.20001f, 13.700001f, 81.60001f);
generalPath.curveTo(15.300001f, 82.000015f, 16.400002f, 82.30001f, 17.2f, 82.70001f);
generalPath.curveTo(17.900002f, 83.10001f, 18.5f, 83.60001f, 19.0f, 84.30001f);
generalPath.curveTo(19.4f, 85.00001f, 19.6f, 85.80001f, 19.6f, 86.80001f);
generalPath.curveTo(19.6f, 87.70001f, 19.300001f, 88.50001f, 18.800001f, 89.30001f);
generalPath.curveTo(18.300001f, 90.10001f, 17.6f, 90.70001f, 16.7f, 91.10001f);
generalPath.curveTo(15.800001f, 91.500015f, 14.6f, 91.70001f, 13.300001f, 91.70001f);
generalPath.curveTo(11.300001f, 91.70001f, 9.800001f, 91.20001f, 8.700001f, 90.30001f);
generalPath.curveTo(7.700001f, 89.30001f, 7.000001f, 87.90001f, 6.8000007f, 86.20001f);
generalPath.closePath();
generalPath.moveTo(22.5f, 91.299995f);
generalPath.lineTo(22.5f, 75.7f);
generalPath.lineTo(25.7f, 75.7f);
generalPath.lineTo(25.7f, 88.7f);
generalPath.lineTo(33.7f, 88.7f);
generalPath.lineTo(33.7f, 91.399994f);
generalPath.lineTo(22.5f, 91.399994f);
generalPath.closePath();
generalPath.moveTo(35.9f, 75.6f);
generalPath.lineTo(41.800003f, 75.6f);
generalPath.curveTo(43.100002f, 75.6f, 44.100002f, 75.7f, 44.800003f, 75.9f);
generalPath.curveTo(45.700005f, 76.200005f, 46.500004f, 76.700005f, 47.200005f, 77.4f);
generalPath.curveTo(47.900005f, 78.1f, 48.400005f, 78.9f, 48.700005f, 80.0f);
generalPath.curveTo(49.000004f, 81.0f, 49.200005f, 82.2f, 49.200005f, 83.7f);
generalPath.curveTo(49.200005f, 85.0f, 49.000004f, 86.1f, 48.700005f, 87.1f);
generalPath.curveTo(48.300003f, 88.2f, 47.700005f, 89.2f, 47.000004f, 89.9f);
generalPath.curveTo(46.400005f, 90.4f, 45.700005f, 90.9f, 44.800003f, 91.200005f);
generalPath.curveTo(44.100002f, 91.4f, 43.100002f, 91.50001f, 42.000004f, 91.50001f);
generalPath.lineTo(36.000004f, 91.50001f);
generalPath.lineTo(36.000004f, 75.6f);
generalPath.closePath();
generalPath.moveTo(39.100002f, 78.2f);
generalPath.lineTo(39.100002f, 88.6f);
generalPath.lineTo(41.500004f, 88.6f);
generalPath.curveTo(42.400005f, 88.6f, 43.000004f, 88.6f, 43.400005f, 88.4f);
generalPath.curveTo(43.900005f, 88.3f, 44.400005f, 88.1f, 44.700005f, 87.700005f);
generalPath.curveTo(45.000004f, 87.30001f, 45.300003f, 86.9f, 45.500004f, 86.200005f);
generalPath.curveTo(45.700005f, 85.50001f, 45.800003f, 84.50001f, 45.800003f, 83.3f);
generalPath.curveTo(45.800003f, 82.1f, 45.700005f, 81.100006f, 45.500004f, 80.5f);
generalPath.curveTo(45.300003f, 79.8f, 45.000004f, 79.3f, 44.600002f, 79.0f);
generalPath.curveTo(44.2f, 78.7f, 43.7f, 78.4f, 43.100002f, 78.3f);
generalPath.curveTo(42.7f, 78.200005f, 41.800003f, 78.100006f, 40.500004f, 78.100006f);
generalPath.lineTo(39.100002f, 78.100006f);
generalPath.closePath();
generalPath.moveTo(50.300003f, 91.299995f);
generalPath.lineTo(55.700005f, 83.1f);
generalPath.lineTo(50.800003f, 75.6f);
generalPath.lineTo(54.500004f, 75.6f);
generalPath.lineTo(57.700005f, 80.7f);
generalPath.lineTo(60.800003f, 75.6f);
generalPath.lineTo(64.5f, 75.6f);
generalPath.lineTo(59.6f, 83.2f);
generalPath.lineTo(65.0f, 91.299995f);
generalPath.lineTo(61.1f, 91.299995f);
generalPath.lineTo(57.6f, 85.899994f);
generalPath.lineTo(54.1f, 91.299995f);
generalPath.lineTo(50.3f, 91.299995f);
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
	private ext_sldx() {
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
       ext_sldx base = new ext_sldx();
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
       ext_sldx base = new ext_sldx();
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
        return ext_sldx::new;
    }
}

