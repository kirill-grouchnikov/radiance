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

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_cdda implements ResizableIcon {
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(72.3, 99.0);
generalPath.lineTo(0.1, 99.0);
generalPath.lineTo(0.1, 1.0);
generalPath.lineTo(45.199997, 1.0);
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
generalPath.moveTo(16.0, 84.3);
generalPath.lineTo(19.1, 85.3);
generalPath.curveTo(18.6, 87.0, 17.800001, 88.3, 16.7, 89.100006);
generalPath.curveTo(15.6, 89.90001, 14.200001, 90.40001, 12.500001, 90.40001);
generalPath.curveTo(10.400002, 90.40001, 8.6, 89.70001, 7.300001, 88.30001);
generalPath.curveTo(5.900001, 86.90001, 5.300001, 84.90001, 5.300001, 82.40001);
generalPath.curveTo(5.300001, 79.80001, 6.000001, 77.70001, 7.400001, 76.30001);
generalPath.curveTo(8.800001, 74.90001, 10.600001, 74.10001, 12.800001, 74.10001);
generalPath.curveTo(14.800001, 74.10001, 16.300001, 74.70001, 17.600002, 75.80001);
generalPath.curveTo(18.300003, 76.50001, 18.900002, 77.40001, 19.200003, 78.70001);
generalPath.lineTo(16.000002, 79.500015);
generalPath.curveTo(15.800002, 78.70001, 15.400002, 78.000015, 14.800002, 77.60001);
generalPath.curveTo(14.200003, 77.20001, 13.500002, 76.90002, 12.600002, 76.90002);
generalPath.curveTo(11.4000025, 76.90002, 10.500002, 77.30002, 9.700003, 78.20002);
generalPath.curveTo(8.900003, 79.10002, 8.600002, 80.40002, 8.600002, 82.30002);
generalPath.curveTo(8.600002, 84.30002, 9.000002, 85.70002, 9.700003, 86.60002);
generalPath.curveTo(10.400003, 87.50002, 11.4000025, 87.900024, 12.500003, 87.900024);
generalPath.curveTo(13.4000025, 87.900024, 14.100003, 87.60002, 14.700003, 87.10002);
generalPath.curveTo(15.300002, 86.60002, 15.800003, 85.400024, 16.000002, 84.30002);
generalPath.closePath();
generalPath.moveTo(21.9, 74.3);
generalPath.lineTo(27.8, 74.3);
generalPath.curveTo(29.099998, 74.3, 30.099998, 74.4, 30.8, 74.600006);
generalPath.curveTo(31.699999, 74.90001, 32.5, 75.40001, 33.2, 76.100006);
generalPath.curveTo(33.9, 76.8, 34.4, 77.600006, 34.7, 78.700005);
generalPath.curveTo(35.0, 79.700005, 35.2, 80.9, 35.2, 82.4);
generalPath.curveTo(35.2, 83.700005, 35.0, 84.8, 34.7, 85.8);
generalPath.curveTo(34.3, 86.9, 33.7, 87.9, 33.0, 88.600006);
generalPath.curveTo(32.4, 89.100006, 31.7, 89.600006, 30.7, 89.90001);
generalPath.curveTo(30.0, 90.100006, 29.0, 90.20001, 27.800001, 90.20001);
generalPath.lineTo(21.7, 90.20001);
generalPath.lineTo(21.7, 74.3);
generalPath.closePath();
generalPath.moveTo(25.1, 77.0);
generalPath.lineTo(25.1, 87.4);
generalPath.lineTo(27.5, 87.4);
generalPath.curveTo(28.4, 87.4, 29.0, 87.4, 29.4, 87.200005);
generalPath.curveTo(29.9, 87.100006, 30.4, 86.9, 30.699999, 86.50001);
generalPath.curveTo(30.999998, 86.200005, 31.3, 85.700005, 31.499998, 85.00001);
generalPath.curveTo(31.699999, 84.30001, 31.799997, 83.30001, 31.799997, 82.100006);
generalPath.curveTo(31.799997, 80.9, 31.699997, 79.90001, 31.499998, 79.3);
generalPath.curveTo(31.3, 78.7, 30.999998, 78.100006, 30.599998, 77.8);
generalPath.curveTo(30.199999, 77.5, 29.699999, 77.200005, 29.099998, 77.100006);
generalPath.curveTo(28.8, 77.00001, 27.899998, 77.00001, 26.599998, 77.00001);
generalPath.lineTo(25.099998, 77.00001);
generalPath.closePath();
generalPath.moveTo(38.0, 74.3);
generalPath.lineTo(43.9, 74.3);
generalPath.curveTo(45.2, 74.3, 46.2, 74.4, 46.9, 74.600006);
generalPath.curveTo(47.800003, 74.90001, 48.600002, 75.40001, 49.300003, 76.100006);
generalPath.curveTo(50.000004, 76.8, 50.500004, 77.600006, 50.800003, 78.700005);
generalPath.curveTo(51.100002, 79.700005, 51.300003, 80.9, 51.300003, 82.4);
generalPath.curveTo(51.300003, 83.700005, 51.100002, 84.8, 50.800003, 85.8);
generalPath.curveTo(50.4, 86.9, 49.800003, 87.9, 49.100002, 88.600006);
generalPath.curveTo(48.500004, 89.100006, 47.800003, 89.600006, 46.800003, 89.90001);
generalPath.curveTo(46.100002, 90.100006, 45.100002, 90.20001, 43.9, 90.20001);
generalPath.lineTo(38.0, 90.20001);
generalPath.lineTo(38.0, 74.3);
generalPath.closePath();
generalPath.moveTo(41.2, 77.0);
generalPath.lineTo(41.2, 87.4);
generalPath.lineTo(43.600002, 87.4);
generalPath.curveTo(44.500004, 87.4, 45.100002, 87.4, 45.500004, 87.200005);
generalPath.curveTo(46.000004, 87.100006, 46.500004, 86.9, 46.800003, 86.50001);
generalPath.curveTo(47.100002, 86.10001, 47.4, 85.700005, 47.600002, 85.00001);
generalPath.curveTo(47.800003, 84.30001, 47.9, 83.30001, 47.9, 82.100006);
generalPath.curveTo(47.9, 80.9, 47.800003, 79.90001, 47.600002, 79.3);
generalPath.curveTo(47.4, 78.7, 47.100002, 78.100006, 46.7, 77.8);
generalPath.curveTo(46.3, 77.4, 45.8, 77.200005, 45.2, 77.100006);
generalPath.curveTo(44.9, 77.00001, 44.0, 77.00001, 42.7, 77.00001);
generalPath.lineTo(41.2, 77.00001);
generalPath.closePath();
generalPath.moveTo(68.5, 90.1);
generalPath.lineTo(65.0, 90.1);
generalPath.lineTo(63.6, 86.5);
generalPath.lineTo(57.199997, 86.5);
generalPath.lineTo(55.899998, 90.1);
generalPath.lineTo(52.499996, 90.1);
generalPath.lineTo(58.699997, 74.4);
generalPath.lineTo(62.1, 74.4);
generalPath.lineTo(68.5, 90.1);
generalPath.closePath();
generalPath.moveTo(62.6, 83.799995);
generalPath.lineTo(60.4, 78.0);
generalPath.lineTo(58.2, 83.8);
generalPath.lineTo(62.600002, 83.8);
generalPath.closePath();
shape = generalPath;
paint = new Color(76, 108, 123, 255);
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
generalPath.moveTo(31.8, 32.0);
generalPath.curveTo(31.699999, 32.1, 31.699999, 32.1, 31.8, 32.0);
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.85f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4_0
if (generalPath == null) {
   generalPath = new GeneralPath();
} else {
   generalPath.reset();
}
generalPath.moveTo(43.1, 58.0);
generalPath.lineTo(43.1, 41.3);
generalPath.lineTo(52.899998, 39.7);
generalPath.curveTo(51.3, 31.400002, 44.1, 25.1, 35.299995, 25.1);
generalPath.curveTo(25.399996, 25.1, 17.399996, 33.1, 17.399996, 43.0);
generalPath.curveTo(17.399996, 52.9, 25.399996, 60.9, 35.299995, 60.9);
generalPath.curveTo(36.299995, 60.9, 37.199997, 60.800003, 38.099995, 60.7);
generalPath.curveTo(38.799995, 59.5, 40.099995, 58.600002, 41.699993, 58.100002);
generalPath.curveTo(42.199993, 58.100002, 42.599995, 58.000004, 43.099995, 58.000004);
generalPath.closePath();
generalPath.moveTo(38.6, 26.7);
generalPath.lineTo(36.699997, 35.1);
generalPath.lineTo(34.799995, 35.1);
generalPath.lineTo(33.399994, 26.699999);
generalPath.curveTo(35.399994, 25.699999, 38.599995, 26.699999, 38.599995, 26.699999);
generalPath.closePath();
generalPath.moveTo(35.3, 49.7);
generalPath.curveTo(31.599998, 49.7, 28.699999, 46.7, 28.699999, 43.100002);
generalPath.curveTo(28.699999, 39.4, 31.699999, 36.500004, 35.3, 36.500004);
generalPath.curveTo(38.9, 36.500004, 41.899998, 39.500004, 41.899998, 43.100002);
generalPath.curveTo(41.899998, 46.800003, 38.999996, 49.7, 35.3, 49.7);
generalPath.closePath();
generalPath.moveTo(35.3, 38.0);
generalPath.curveTo(32.5, 38.0, 30.199999, 40.3, 30.199999, 43.1);
generalPath.curveTo(30.199999, 45.899998, 32.5, 48.199997, 35.3, 48.199997);
generalPath.curveTo(38.1, 48.199997, 40.399998, 45.899998, 40.399998, 43.1);
generalPath.curveTo(40.399998, 40.3, 38.1, 38.0, 35.3, 38.0);
generalPath.closePath();
generalPath.moveTo(35.3, 46.7);
generalPath.curveTo(33.3, 46.7, 31.699999, 45.100002, 31.699999, 43.100002);
generalPath.curveTo(31.699999, 41.100002, 33.3, 39.500004, 35.3, 39.500004);
generalPath.curveTo(37.3, 39.500004, 38.899998, 41.100002, 38.899998, 43.100002);
generalPath.curveTo(38.899998, 45.100002, 37.3, 46.7, 35.3, 46.7);
generalPath.closePath();
generalPath.moveTo(37.6, 63.9);
generalPath.curveTo(37.699997, 64.4, 37.899998, 64.8, 38.199997, 65.200005);
generalPath.curveTo(37.299995, 65.3, 36.299995, 65.4, 35.399998, 65.4);
generalPath.curveTo(23.0, 65.4, 13.0, 55.4, 13.0, 43.1);
generalPath.curveTo(13.0, 30.799995, 23.0, 20.8, 35.3, 20.8);
generalPath.curveTo(46.199997, 20.8, 55.3, 28.699999, 57.199997, 39.0);
generalPath.lineTo(54.999996, 39.4);
generalPath.curveTo(53.3, 30.1, 45.1, 23.0, 35.3, 23.0);
generalPath.curveTo(24.199999, 23.0, 15.199999, 32.0, 15.199999, 43.1);
generalPath.curveTo(15.199999, 54.199997, 24.199999, 63.199997, 35.3, 63.199997);
generalPath.curveTo(36.0, 63.199997, 36.8, 63.199997, 37.5, 63.1);
generalPath.curveTo(37.5, 63.3, 37.5, 63.6, 37.6, 63.899998);
generalPath.closePath();
generalPath.moveTo(59.5, 40.300003);
generalPath.lineTo(59.5, 59.600002);
generalPath.curveTo(59.5, 61.2, 58.3, 62.500004, 56.4, 62.9);
generalPath.curveTo(54.4, 63.4, 52.4, 62.600002, 52.0, 61.0);
generalPath.curveTo(51.6, 59.4, 52.9, 57.8, 55.0, 57.2);
generalPath.curveTo(55.9, 57.0, 56.8, 57.0, 57.6, 57.3);
generalPath.lineTo(57.6, 45.7);
generalPath.lineTo(47.199997, 47.600002);
generalPath.lineTo(47.199997, 62.100002);
generalPath.curveTo(47.199997, 63.500004, 45.999996, 64.8, 44.199997, 65.3);
generalPath.curveTo(42.199997, 65.8, 40.1, 64.8, 39.799995, 63.4);
generalPath.curveTo(39.399994, 61.800003, 40.699997, 60.2, 42.799995, 59.7);
generalPath.curveTo(43.699997, 59.5, 44.599995, 59.5, 45.299995, 59.8);
generalPath.lineTo(45.299995, 42.6);
generalPath.lineTo(59.499996, 40.3);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(36.25, 65.36699676513672), new Point2D.Double(36.25, 20.819000244140625), new float[] {0.0f,0.633f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
generalPath.closePath();
shape = generalPath;
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
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
generalPath.moveTo(45.2, 1.0);
generalPath.lineTo(72.3, 27.7);
generalPath.lineTo(45.2, 27.7);
generalPath.lineTo(45.2, 1.0);
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
        return 0.13099998235702515;
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
		return 0.7420000433921814;
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
	private ext_cdda() {
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
       ext_cdda base = new ext_cdda();
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
       ext_cdda base = new ext_cdda();
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
        return ext_cdda::new;
    }
}

