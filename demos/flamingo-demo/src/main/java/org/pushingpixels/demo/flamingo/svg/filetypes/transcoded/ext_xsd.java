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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_xsd implements ResizableIcon {
    private Shape shape = null;
    private GeneralPath generalPath = null;
    private Paint paint = null;
    private Stroke stroke = null;
    private Shape clip = null;
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(72.0, 99.0);
generalPath.lineTo(0.0, 99.0);
generalPath.lineTo(0.0, 1.0);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
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
generalPath.moveTo(12.0, 44.7);
generalPath.lineTo(26.0, 32.6);
generalPath.lineTo(26.0, 38.699997);
generalPath.lineTo(16.5, 46.6);
generalPath.lineTo(16.5, 46.699997);
generalPath.lineTo(26.0, 54.6);
generalPath.lineTo(26.0, 60.699997);
generalPath.lineTo(12.0, 48.699997);
generalPath.lineTo(12.0, 44.699997);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(19.013999938964844, 60.792999267578125), new Point2D.Double(19.013999938964844, 32.60300064086914), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(19.013999938964844, 62.979000091552734), new Point2D.Double(19.013999938964844, 30.417999267578125), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(12.0, 44.7);
generalPath.lineTo(26.0, 32.6);
generalPath.lineTo(26.0, 38.699997);
generalPath.lineTo(16.5, 46.6);
generalPath.lineTo(16.5, 46.699997);
generalPath.lineTo(26.0, 54.6);
generalPath.lineTo(26.0, 60.699997);
generalPath.lineTo(12.0, 48.699997);
generalPath.lineTo(12.0, 44.699997);
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
generalPath.moveTo(38.4, 29.5);
generalPath.lineTo(42.100002, 29.5);
generalPath.lineTo(34.9, 64.5);
generalPath.lineTo(31.300001, 64.5);
generalPath.lineTo(38.4, 29.5);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.68600082397461, 64.5), new Point2D.Double(36.68600082397461, 29.5), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.6879997253418, 65.5), new Point2D.Double(36.6879997253418, 28.5), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(38.4, 29.5);
generalPath.lineTo(42.100002, 29.5);
generalPath.lineTo(34.9, 64.5);
generalPath.lineTo(31.300001, 64.5);
generalPath.lineTo(38.4, 29.5);
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
generalPath.moveTo(47.2, 54.8);
generalPath.lineTo(56.7, 46.899998);
generalPath.lineTo(56.7, 46.8);
generalPath.lineTo(47.2, 38.899998);
generalPath.lineTo(47.2, 32.8);
generalPath.lineTo(61.2, 44.9);
generalPath.lineTo(61.2, 49.0);
generalPath.lineTo(47.2, 61.1);
generalPath.lineTo(47.2, 54.8);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(54.18600082397461, 61.051998138427734), new Point2D.Double(54.18600082397461, 32.689998626708984), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(54.18600082397461, 63.237998962402344), new Point2D.Double(54.18600082397461, 30.503999710083008), new float[] {0.0f,0.153f,0.529f,0.824f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(154, 185, 201, 255),new Color(112, 143, 159, 255),new Color(86, 118, 133, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(2.0f,0,0,10.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(47.2, 54.8);
generalPath.lineTo(56.7, 46.899998);
generalPath.lineTo(56.7, 46.8);
generalPath.lineTo(47.2, 38.899998);
generalPath.lineTo(47.2, 32.8);
generalPath.lineTo(61.2, 44.9);
generalPath.lineTo(61.2, 49.0);
generalPath.lineTo(47.2, 61.1);
generalPath.lineTo(47.2, 54.8);
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
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
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(45.0, 1.0);
generalPath.lineTo(72.0, 27.7);
generalPath.lineTo(45.0, 27.7);
generalPath.lineTo(45.0, 1.0);
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
generalPath.moveTo(8.6, 91.5);
generalPath.lineTo(15.3, 81.4);
generalPath.lineTo(9.3, 72.200005);
generalPath.lineTo(13.9, 72.200005);
generalPath.lineTo(17.8, 78.4);
generalPath.lineTo(21.599998, 72.200005);
generalPath.lineTo(26.199999, 72.200005);
generalPath.lineTo(20.0, 81.6);
generalPath.lineTo(26.7, 91.5);
generalPath.lineTo(22.0, 91.5);
generalPath.lineTo(17.7, 84.8);
generalPath.lineTo(13.400001, 91.5);
generalPath.lineTo(8.6, 91.5);
generalPath.closePath();
generalPath.moveTo(27.7, 85.3);
generalPath.lineTo(31.5, 84.9);
generalPath.curveTo(31.7, 86.200005, 32.2, 87.1, 32.9, 87.700005);
generalPath.curveTo(33.600002, 88.3, 34.600002, 88.600006, 35.800003, 88.600006);
generalPath.curveTo(37.100002, 88.600006, 38.000004, 88.3, 38.700005, 87.8);
generalPath.curveTo(39.300003, 87.3, 39.700005, 86.600006, 39.700005, 85.9);
generalPath.curveTo(39.700005, 85.4, 39.600006, 85.1, 39.300003, 84.700005);
generalPath.curveTo(39.000004, 84.4, 38.600002, 84.100006, 37.9, 83.9);
generalPath.curveTo(37.4, 83.700005, 36.4, 83.5, 34.7, 83.1);
generalPath.curveTo(32.600002, 82.6, 31.1, 81.9, 30.300001, 81.2);
generalPath.curveTo(29.1, 80.1, 28.500002, 78.799995, 28.500002, 77.299995);
generalPath.curveTo(28.500002, 76.299995, 28.800001, 75.399994, 29.300001, 74.49999);
generalPath.curveTo(29.900002, 73.59999, 30.7, 72.99999, 31.7, 72.49999);
generalPath.curveTo(32.7, 71.99999, 34.0, 71.799995, 35.5, 71.799995);
generalPath.curveTo(38.0, 71.799995, 39.8, 72.299995, 41.0, 73.399994);
generalPath.curveTo(42.2, 74.49999, 42.9, 75.899994, 43.0, 77.7);
generalPath.lineTo(39.1, 77.899994);
generalPath.curveTo(38.899998, 76.899994, 38.6, 76.2, 38.0, 75.799995);
generalPath.curveTo(37.4, 75.399994, 36.6, 75.1, 35.5, 75.1);
generalPath.curveTo(34.4, 75.1, 33.5, 75.299995, 32.8, 75.799995);
generalPath.curveTo(32.399998, 76.1, 32.2, 76.49999, 32.2, 76.99999);
generalPath.curveTo(32.2, 77.49999, 32.4, 77.799995, 32.8, 78.19999);
generalPath.curveTo(33.3, 78.59999, 34.5, 78.99999, 36.399998, 79.49999);
generalPath.curveTo(38.3, 79.899994, 39.699997, 80.399994, 40.699997, 80.899994);
generalPath.curveTo(41.6, 81.399994, 42.299995, 81.99999, 42.899998, 82.899994);
generalPath.curveTo(43.399998, 83.7, 43.699997, 84.799995, 43.699997, 85.99999);
generalPath.curveTo(43.699997, 87.09999, 43.399998, 88.09999, 42.799995, 89.09999);
generalPath.curveTo(42.199997, 90.09999, 41.299995, 90.79999, 40.199997, 91.29999);
generalPath.curveTo(39.1, 91.79999, 37.6, 91.999985, 35.999996, 91.999985);
generalPath.curveTo(33.499996, 91.999985, 31.599997, 91.39999, 30.299995, 90.29999);
generalPath.curveTo(28.799995, 89.09999, 27.999996, 87.39999, 27.699995, 85.29999);
generalPath.closePath();
generalPath.moveTo(46.9, 72.200005);
generalPath.lineTo(54.100002, 72.200005);
generalPath.curveTo(55.7, 72.200005, 57.000004, 72.3, 57.800003, 72.600006);
generalPath.curveTo(58.9, 72.90001, 59.9, 73.50001, 60.700005, 74.40001);
generalPath.curveTo(61.500004, 75.30001, 62.100006, 76.30001, 62.600006, 77.50001);
generalPath.curveTo(63.000008, 78.700005, 63.200005, 80.30001, 63.200005, 82.100006);
generalPath.curveTo(63.200005, 83.700005, 63.000004, 85.100006, 62.600006, 86.200005);
generalPath.curveTo(62.100006, 87.600006, 61.400005, 88.700005, 60.500008, 89.600006);
generalPath.curveTo(59.800007, 90.3, 58.90001, 90.8, 57.70001, 91.100006);
generalPath.curveTo(56.800007, 91.40001, 55.70001, 91.50001, 54.20001, 91.50001);
generalPath.lineTo(46.800007, 91.50001);
generalPath.lineTo(46.800007, 72.2);
generalPath.closePath();
generalPath.moveTo(50.9, 75.50001);
generalPath.lineTo(50.9, 88.30001);
generalPath.lineTo(53.800003, 88.30001);
generalPath.curveTo(54.9, 88.30001, 55.700005, 88.20001, 56.200005, 88.10001);
generalPath.curveTo(56.800003, 87.90002, 57.400005, 87.70001, 57.800003, 87.30001);
generalPath.curveTo(58.2, 86.90001, 58.600002, 86.30001, 58.800003, 85.40001);
generalPath.curveTo(59.100002, 84.50001, 59.200005, 83.40001, 59.200005, 81.90001);
generalPath.curveTo(59.200005, 80.40001, 59.100006, 79.30001, 58.800003, 78.50001);
generalPath.curveTo(58.500004, 77.700005, 58.200005, 77.100006, 57.700005, 76.600006);
generalPath.curveTo(57.200005, 76.200005, 56.600006, 75.8, 55.900005, 75.700005);
generalPath.curveTo(55.300007, 75.600006, 54.300007, 75.50001, 52.700005, 75.50001);
generalPath.lineTo(50.900005, 75.50001);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
	private ext_xsd() {
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
    public static ResizableIcon of(int width, int height) {
       ext_xsd base = new ext_xsd();
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
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_xsd base = new ext_xsd();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_xsd::new;
    }
}

