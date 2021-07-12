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
public class ext_bpg implements NeonIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.0f,0.124f,0.262f,0.41f,0.571f,0.752f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 107, 105, 255)) : new Color(0, 107, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 128, 127, 255)) : new Color(0, 128, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 147, 147, 255)) : new Color(0, 147, 147, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 163, 163, 255)) : new Color(0, 163, 163, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 176, 175, 255)) : new Color(0, 176, 175, 255)),((colorFilter != null) ? colorFilter.filter(new Color(8, 184, 183, 255)) : new Color(8, 184, 183, 255)),((colorFilter != null) ? colorFilter.filter(new Color(20, 187, 187, 255)) : new Color(20, 187, 187, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 110, 108, 255)) : new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(72.1f, 99.0f);
generalPath.lineTo(0.3f, 99.0f);
generalPath.lineTo(0.3f, 1.0f);
generalPath.lineTo(45.2f, 1.0f);
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
generalPath.moveTo(8.0f, 71.2f);
generalPath.lineTo(16.0f, 71.2f);
generalPath.curveTo(17.6f, 71.2f, 18.8f, 71.299995f, 19.5f, 71.399994f);
generalPath.curveTo(20.3f, 71.49999f, 21.0f, 71.799995f, 21.6f, 72.2f);
generalPath.curveTo(22.2f, 72.6f, 22.7f, 73.2f, 23.1f, 73.899994f);
generalPath.curveTo(23.5f, 74.59999f, 23.7f, 75.399994f, 23.7f, 76.2f);
generalPath.curveTo(23.7f, 77.1f, 23.400002f, 78.0f, 22.900002f, 78.799995f);
generalPath.curveTo(22.400002f, 79.59999f, 21.7f, 80.2f, 20.800001f, 80.49999f);
generalPath.curveTo(22.000002f, 80.899994f, 23.000002f, 81.49999f, 23.6f, 82.299995f);
generalPath.curveTo(24.199999f, 83.1f, 24.6f, 84.1f, 24.6f, 85.299995f);
generalPath.curveTo(24.6f, 86.2f, 24.4f, 87.1f, 24.0f, 87.899994f);
generalPath.curveTo(23.6f, 88.69999f, 23.0f, 89.399994f, 22.3f, 89.899994f);
generalPath.curveTo(21.599998f, 90.399994f, 20.699999f, 90.7f, 19.599998f, 90.799995f);
generalPath.curveTo(18.999998f, 90.99999f, 17.399998f, 90.99999f, 14.799998f, 91.1f);
generalPath.lineTo(8.0f, 91.1f);
generalPath.lineTo(8.0f, 71.2f);
generalPath.closePath();
generalPath.moveTo(12.0f, 74.5f);
generalPath.lineTo(12.0f, 79.1f);
generalPath.lineTo(14.6f, 79.1f);
generalPath.curveTo(16.2f, 79.1f, 17.1f, 79.1f, 17.5f, 79.0f);
generalPath.curveTo(18.2f, 78.9f, 18.7f, 78.7f, 19.1f, 78.3f);
generalPath.curveTo(19.5f, 77.90001f, 19.7f, 77.4f, 19.7f, 76.8f);
generalPath.curveTo(19.7f, 76.200005f, 19.5f, 75.700005f, 19.2f, 75.3f);
generalPath.curveTo(18.900002f, 74.9f, 18.400002f, 74.700005f, 17.7f, 74.600006f);
generalPath.curveTo(17.300001f, 74.600006f, 16.2f, 74.50001f, 14.300001f, 74.50001f);
generalPath.lineTo(12.0f, 74.50001f);
generalPath.closePath();
generalPath.moveTo(12.0f, 82.4f);
generalPath.lineTo(12.0f, 87.700005f);
generalPath.lineTo(15.7f, 87.700005f);
generalPath.curveTo(17.2f, 87.700005f, 18.1f, 87.700005f, 18.5f, 87.600006f);
generalPath.curveTo(19.1f, 87.50001f, 19.6f, 87.200005f, 20.0f, 86.8f);
generalPath.curveTo(20.4f, 86.4f, 20.6f, 85.8f, 20.6f, 85.100006f);
generalPath.curveTo(20.6f, 84.50001f, 20.5f, 84.00001f, 20.2f, 83.600006f);
generalPath.curveTo(19.900002f, 83.200005f, 19.5f, 82.90001f, 18.900002f, 82.700005f);
generalPath.curveTo(18.400002f, 82.50001f, 17.2f, 82.4f, 15.300001f, 82.4f);
generalPath.lineTo(12.0f, 82.4f);
generalPath.closePath();
generalPath.moveTo(28.1f, 91.1f);
generalPath.lineTo(28.1f, 71.2f);
generalPath.lineTo(34.6f, 71.2f);
generalPath.curveTo(37.1f, 71.2f, 38.699997f, 71.299995f, 39.399998f, 71.5f);
generalPath.curveTo(40.499996f, 71.8f, 41.499996f, 72.4f, 42.3f, 73.4f);
generalPath.curveTo(43.1f, 74.4f, 43.5f, 75.700005f, 43.5f, 77.3f);
generalPath.curveTo(43.5f, 78.5f, 43.3f, 79.5f, 42.8f, 80.4f);
generalPath.curveTo(42.399998f, 81.200005f, 41.8f, 81.9f, 41.1f, 82.4f);
generalPath.curveTo(40.399998f, 82.9f, 39.699997f, 83.200005f, 39.0f, 83.3f);
generalPath.curveTo(38.0f, 83.5f, 36.6f, 83.600006f, 34.8f, 83.600006f);
generalPath.lineTo(32.2f, 83.600006f);
generalPath.lineTo(32.2f, 91.100006f);
generalPath.lineTo(28.1f, 91.100006f);
generalPath.closePath();
generalPath.moveTo(32.2f, 74.6f);
generalPath.lineTo(32.2f, 80.2f);
generalPath.lineTo(34.4f, 80.2f);
generalPath.curveTo(36.0f, 80.2f, 37.100002f, 80.1f, 37.600002f, 79.899994f);
generalPath.curveTo(38.100002f, 79.7f, 38.600002f, 79.399994f, 38.9f, 78.899994f);
generalPath.curveTo(39.2f, 78.49999f, 39.4f, 77.899994f, 39.4f, 77.399994f);
generalPath.curveTo(39.4f, 76.7f, 39.2f, 76.09999f, 38.800003f, 75.59999f);
generalPath.curveTo(38.4f, 75.09999f, 37.800003f, 74.79999f, 37.200005f, 74.69999f);
generalPath.curveTo(36.700005f, 74.59999f, 35.800003f, 74.59999f, 34.300003f, 74.59999f);
generalPath.lineTo(32.200005f, 74.59999f);
generalPath.closePath();
generalPath.moveTo(56.1f, 83.799995f);
generalPath.lineTo(56.1f, 80.49999f);
generalPath.lineTo(64.799995f, 80.49999f);
generalPath.lineTo(64.799995f, 88.399994f);
generalPath.curveTo(63.999996f, 89.2f, 62.699997f, 89.899994f, 61.099995f, 90.49999f);
generalPath.curveTo(59.499996f, 91.09999f, 57.899994f, 91.399994f, 56.199993f, 91.399994f);
generalPath.curveTo(54.099995f, 91.399994f, 52.29999f, 90.99999f, 50.699993f, 90.09999f);
generalPath.curveTo(49.099995f, 89.19999f, 48.0f, 88.0f, 47.2f, 86.4f);
generalPath.curveTo(46.4f, 84.8f, 46.0f, 83.0f, 46.0f, 81.1f);
generalPath.curveTo(46.0f, 79.0f, 46.4f, 77.2f, 47.3f, 75.6f);
generalPath.curveTo(48.199997f, 74.0f, 49.399998f, 72.799995f, 51.1f, 71.9f);
generalPath.curveTo(52.399998f, 71.200005f, 54.0f, 70.9f, 55.899998f, 70.9f);
generalPath.curveTo(58.399998f, 70.9f, 60.3f, 71.4f, 61.699997f, 72.4f);
generalPath.curveTo(63.099995f, 73.4f, 63.999996f, 74.9f, 64.399994f, 76.700005f);
generalPath.lineTo(60.399994f, 77.4f);
generalPath.curveTo(60.099995f, 76.4f, 59.599995f, 75.700005f, 58.799995f, 75.1f);
generalPath.curveTo(57.999996f, 74.5f, 57.099995f, 74.299995f, 55.899994f, 74.299995f);
generalPath.curveTo(54.099995f, 74.299995f, 52.699993f, 74.899994f, 51.699993f, 75.99999f);
generalPath.curveTo(50.699993f, 77.09999f, 50.099995f, 78.799995f, 50.099995f, 80.899994f);
generalPath.curveTo(50.099995f, 83.299995f, 50.599995f, 84.99999f, 51.699993f, 86.2f);
generalPath.curveTo(52.79999f, 87.4f, 54.099995f, 88.0f, 55.79999f, 88.0f);
generalPath.curveTo(56.59999f, 88.0f, 57.499992f, 87.8f, 58.29999f, 87.5f);
generalPath.curveTo(59.09999f, 87.2f, 59.89999f, 86.8f, 60.499992f, 86.3f);
generalPath.lineTo(60.499992f, 83.8f);
generalPath.lineTo(56.09999f, 83.8f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(255, 255, 255, 255)) : new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.0f,0.297f,0.44f,0.551f,0.645f,0.729f,0.804f,0.874f,0.938f,0.998f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(214, 237, 232, 255)) : new Color(214, 237, 232, 255)),((colorFilter != null) ? colorFilter.filter(new Color(211, 235, 230, 255)) : new Color(211, 235, 230, 255)),((colorFilter != null) ? colorFilter.filter(new Color(199, 227, 223, 255)) : new Color(199, 227, 223, 255)),((colorFilter != null) ? colorFilter.filter(new Color(183, 216, 213, 255)) : new Color(183, 216, 213, 255)),((colorFilter != null) ? colorFilter.filter(new Color(160, 203, 201, 255)) : new Color(160, 203, 201, 255)),((colorFilter != null) ? colorFilter.filter(new Color(132, 186, 185, 255)) : new Color(132, 186, 185, 255)),((colorFilter != null) ? colorFilter.filter(new Color(98, 167, 167, 255)) : new Color(98, 167, 167, 255)),((colorFilter != null) ? colorFilter.filter(new Color(52, 147, 148, 255)) : new Color(52, 147, 148, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 127, 127, 255)) : new Color(0, 127, 127, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 107, 106, 255)) : new Color(0, 107, 106, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 107, 105, 255)) : new Color(0, 107, 105, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
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
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 0, 0, 0)) : new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = (colorFilter != null) ? colorFilter.filter(new Color(0, 110, 108, 255)) : new Color(0, 110, 108, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.2f, 1.0f);
generalPath.lineTo(72.1f, 27.7f);
generalPath.lineTo(45.2f, 27.7f);
generalPath.lineTo(45.2f, 1.0f);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.99f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(62.7f, 56.8f);
generalPath.curveTo(61.100002f, 56.0f, 58.100002f, 50.2f, 53.5f, 49.8f);
generalPath.curveTo(49.5f, 49.5f, 44.4f, 48.0f, 41.6f, 47.8f);
generalPath.curveTo(38.1f, 42.0f, 32.1f, 32.8f, 27.099998f, 27.9f);
generalPath.lineTo(40.899998f, 28.6f);
generalPath.curveTo(37.2f, 19.8f, 27.7f, 23.0f, 27.7f, 23.0f);
generalPath.lineTo(34.100002f, 17.7f);
generalPath.curveTo(25.900002f, 14.400001f, 22.500002f, 22.400002f, 22.500002f, 22.400002f);
generalPath.curveTo(14.000002f, 17.7f, 9.600002f, 25.7f, 9.600002f, 25.7f);
generalPath.lineTo(18.400002f, 26.300001f);
generalPath.curveTo(8.4f, 29.1f, 11.2f, 39.0f, 11.2f, 39.0f);
generalPath.lineTo(20.099998f, 31.0f);
generalPath.curveTo(18.199999f, 35.4f, 22.399998f, 38.5f, 22.399998f, 38.5f);
generalPath.lineTo(25.0f, 27.7f);
generalPath.curveTo(25.0f, 27.7f, 34.3f, 38.300003f, 37.2f, 49.1f);
generalPath.curveTo(33.5f, 51.0f, 27.7f, 54.1f, 23.2f, 54.699997f);
generalPath.curveTo(17.0f, 55.499996f, 9.700001f, 59.699997f, 9.700001f, 59.699997f);
generalPath.lineTo(9.700001f, 64.6f);
generalPath.lineTo(62.8f, 64.6f);
generalPath.lineTo(62.7f, 56.8f);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.25, 37.35300064086914), new Point2D.Double(36.25, 85.16100311279297), new float[] {0.005f,0.343f,1.0f}, new Color[] {((colorFilter != null) ? colorFilter.filter(new Color(0, 130, 129, 255)) : new Color(0, 130, 129, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 106, 105, 255)) : new Color(0, 106, 105, 255)),((colorFilter != null) ? colorFilter.filter(new Color(0, 56, 54, 255)) : new Color(0, 56, 54, 255))}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
        return 0.13300000131130219;
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
		return 0.7379999160766602;
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
	private ext_bpg() {
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
       ext_bpg base = new ext_bpg();
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
       ext_bpg base = new ext_bpg();
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
        return ext_bpg::new;
    }
}

