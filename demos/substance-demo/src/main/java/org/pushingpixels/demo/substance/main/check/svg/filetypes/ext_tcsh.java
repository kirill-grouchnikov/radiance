package org.pushingpixels.demo.substance.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_tcsh implements ResizableIcon {
    private Shape shape = null;
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
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 97.0), new Point2D.Double(36.0, -1.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.2, 40.4);
((GeneralPath)shape).lineTo(43.1, 40.4);
((GeneralPath)shape).lineTo(43.1, 43.600002);
((GeneralPath)shape).lineTo(30.2, 43.600002);
((GeneralPath)shape).lineTo(30.2, 40.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 46.800003);
((GeneralPath)shape).lineTo(43.1, 46.800003);
((GeneralPath)shape).lineTo(43.1, 50.0);
((GeneralPath)shape).lineTo(30.2, 50.0);
((GeneralPath)shape).lineTo(30.2, 46.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 53.300003);
((GeneralPath)shape).lineTo(43.1, 53.300003);
((GeneralPath)shape).lineTo(43.1, 56.500004);
((GeneralPath)shape).lineTo(30.2, 56.500004);
((GeneralPath)shape).lineTo(30.2, 53.300003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.800003, 24.200003);
((GeneralPath)shape).lineTo(26.9, 24.200003);
((GeneralPath)shape).curveTo(23.3, 24.200003, 20.4, 27.100002, 20.4, 30.700003);
((GeneralPath)shape).lineTo(20.4, 59.800003);
((GeneralPath)shape).lineTo(14.0, 59.800003);
((GeneralPath)shape).curveTo(14.0, 63.4, 16.9, 66.3, 20.5, 66.3);
((GeneralPath)shape).lineTo(46.3, 66.3);
((GeneralPath)shape).curveTo(49.899998, 66.3, 52.8, 63.4, 52.8, 59.800003);
((GeneralPath)shape).lineTo(52.8, 33.9);
((GeneralPath)shape).lineTo(59.3, 33.9);
((GeneralPath)shape).lineTo(59.3, 30.7);
((GeneralPath)shape).curveTo(59.2, 27.1, 56.399998, 24.2, 52.8, 24.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.600002, 59.200005);
((GeneralPath)shape).curveTo(49.600002, 61.300003, 47.9, 63.000004, 45.800003, 63.000004);
((GeneralPath)shape).lineTo(22.1, 63.000004);
((GeneralPath)shape).curveTo(23.7, 61.900005, 23.7, 59.800003, 23.7, 59.800003);
((GeneralPath)shape).lineTo(23.7, 30.7);
((GeneralPath)shape).curveTo(23.7, 28.900002, 25.1, 27.5, 26.900002, 27.5);
((GeneralPath)shape).curveTo(28.7, 27.5, 30.100002, 28.9, 30.100002, 30.7);
((GeneralPath)shape).lineTo(30.100002, 33.9);
((GeneralPath)shape).lineTo(49.5, 33.9);
((GeneralPath)shape).lineTo(49.5, 59.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.4, 30.7);
((GeneralPath)shape).lineTo(33.4, 27.5);
((GeneralPath)shape).lineTo(52.800003, 27.5);
((GeneralPath)shape).curveTo(55.700005, 27.5, 56.000004, 29.3, 56.000004, 30.7);
((GeneralPath)shape).lineTo(33.4, 30.7);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 66.23100280761719), new Point2D.Double(36.63199996948242, 24.231000900268555), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.63199996948242, 66.60600280761719), new Point2D.Double(36.63199996948242, 23.856000900268555), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.75f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.2, 40.4);
((GeneralPath)shape).lineTo(43.1, 40.4);
((GeneralPath)shape).lineTo(43.1, 43.600002);
((GeneralPath)shape).lineTo(30.2, 43.600002);
((GeneralPath)shape).lineTo(30.2, 40.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 46.800003);
((GeneralPath)shape).lineTo(43.1, 46.800003);
((GeneralPath)shape).lineTo(43.1, 50.0);
((GeneralPath)shape).lineTo(30.2, 50.0);
((GeneralPath)shape).lineTo(30.2, 46.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.2, 53.300003);
((GeneralPath)shape).lineTo(43.1, 53.300003);
((GeneralPath)shape).lineTo(43.1, 56.500004);
((GeneralPath)shape).lineTo(30.2, 56.500004);
((GeneralPath)shape).lineTo(30.2, 53.300003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.800003, 24.200003);
((GeneralPath)shape).lineTo(26.9, 24.200003);
((GeneralPath)shape).curveTo(23.3, 24.200003, 20.4, 27.100002, 20.4, 30.700003);
((GeneralPath)shape).lineTo(20.4, 59.800003);
((GeneralPath)shape).lineTo(14.0, 59.800003);
((GeneralPath)shape).curveTo(14.0, 63.4, 16.9, 66.3, 20.5, 66.3);
((GeneralPath)shape).lineTo(46.3, 66.3);
((GeneralPath)shape).curveTo(49.899998, 66.3, 52.8, 63.4, 52.8, 59.800003);
((GeneralPath)shape).lineTo(52.8, 33.9);
((GeneralPath)shape).lineTo(59.3, 33.9);
((GeneralPath)shape).lineTo(59.3, 30.7);
((GeneralPath)shape).curveTo(59.2, 27.1, 56.399998, 24.2, 52.8, 24.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.600002, 59.200005);
((GeneralPath)shape).curveTo(49.600002, 61.300003, 47.9, 63.000004, 45.800003, 63.000004);
((GeneralPath)shape).lineTo(22.1, 63.000004);
((GeneralPath)shape).curveTo(23.7, 61.900005, 23.7, 59.800003, 23.7, 59.800003);
((GeneralPath)shape).lineTo(23.7, 30.7);
((GeneralPath)shape).curveTo(23.7, 28.900002, 25.1, 27.5, 26.900002, 27.5);
((GeneralPath)shape).curveTo(28.7, 27.5, 30.100002, 28.9, 30.100002, 30.7);
((GeneralPath)shape).lineTo(30.100002, 33.9);
((GeneralPath)shape).lineTo(49.5, 33.9);
((GeneralPath)shape).lineTo(49.5, 59.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.4, 30.7);
((GeneralPath)shape).lineTo(33.4, 27.5);
((GeneralPath)shape).lineTo(52.800003, 27.5);
((GeneralPath)shape).curveTo(55.700005, 27.5, 56.000004, 29.3, 56.000004, 30.7);
((GeneralPath)shape).lineTo(33.4, 30.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 25.812999725341797), new Point2D.Double(58.5369987487793, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.2, 91.9);
((GeneralPath)shape).lineTo(11.2, 78.8);
((GeneralPath)shape).lineTo(6.5, 78.8);
((GeneralPath)shape).lineTo(6.5, 76.100006);
((GeneralPath)shape).lineTo(19.0, 76.100006);
((GeneralPath)shape).lineTo(19.0, 78.8);
((GeneralPath)shape).lineTo(14.3, 78.8);
((GeneralPath)shape).lineTo(14.3, 91.9);
((GeneralPath)shape).lineTo(11.200001, 91.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(31.2, 86.1);
((GeneralPath)shape).lineTo(34.3, 87.1);
((GeneralPath)shape).curveTo(33.8, 88.799995, 33.0, 90.1, 31.9, 90.9);
((GeneralPath)shape).curveTo(30.8, 91.700005, 29.4, 92.200005, 27.7, 92.200005);
((GeneralPath)shape).curveTo(25.6, 92.200005, 23.900002, 91.50001, 22.5, 90.100006);
((GeneralPath)shape).curveTo(21.2, 88.700005, 20.5, 86.700005, 20.5, 84.200005);
((GeneralPath)shape).curveTo(20.5, 81.600006, 21.2, 79.50001, 22.5, 78.100006);
((GeneralPath)shape).curveTo(23.9, 76.700005, 25.6, 75.90001, 27.8, 75.90001);
((GeneralPath)shape).curveTo(29.699999, 75.90001, 31.3, 76.50001, 32.5, 77.600006);
((GeneralPath)shape).curveTo(33.2, 78.3, 33.8, 79.200005, 34.1, 80.50001);
((GeneralPath)shape).lineTo(30.999998, 81.30001);
((GeneralPath)shape).curveTo(30.799997, 80.50001, 30.399998, 79.80001, 29.799997, 79.40001);
((GeneralPath)shape).curveTo(29.199997, 79.00001, 28.499998, 78.70001, 27.599997, 78.70001);
((GeneralPath)shape).curveTo(26.399996, 78.70001, 25.499996, 79.10001, 24.799997, 80.000015);
((GeneralPath)shape).curveTo(24.099997, 80.80002, 23.699997, 82.20001, 23.699997, 84.10001);
((GeneralPath)shape).curveTo(23.699997, 86.10001, 24.099997, 87.500015, 24.799997, 88.40002);
((GeneralPath)shape).curveTo(25.499998, 89.20002, 26.399998, 89.70002, 27.599997, 89.70002);
((GeneralPath)shape).curveTo(28.399996, 89.70002, 29.199997, 89.40002, 29.799997, 88.90002);
((GeneralPath)shape).curveTo(30.499998, 88.10001, 30.899998, 87.20002, 31.199997, 86.10001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.2, 86.799995);
((GeneralPath)shape).lineTo(39.3, 86.49999);
((GeneralPath)shape).curveTo(39.5, 87.49999, 39.899998, 88.299995, 40.399998, 88.799995);
((GeneralPath)shape).curveTo(40.899998, 89.299995, 41.699997, 89.49999, 42.699997, 89.49999);
((GeneralPath)shape).curveTo(43.699997, 89.49999, 44.499996, 89.299995, 44.999996, 88.799995);
((GeneralPath)shape).curveTo(45.499996, 88.399994, 45.799995, 87.899994, 45.799995, 87.299995);
((GeneralPath)shape).curveTo(45.799995, 86.899994, 45.699997, 86.6, 45.499996, 86.299995);
((GeneralPath)shape).curveTo(45.299995, 85.99999, 44.899998, 85.799995, 44.399998, 85.6);
((GeneralPath)shape).curveTo(43.999996, 85.5, 43.199997, 85.2, 41.899998, 84.9);
((GeneralPath)shape).curveTo(40.199997, 84.5, 38.999996, 84.0, 38.3, 83.3);
((GeneralPath)shape).curveTo(37.3, 82.4, 36.8, 81.4, 36.8, 80.100006);
((GeneralPath)shape).curveTo(36.8, 79.3, 37.0, 78.50001, 37.5, 77.90001);
((GeneralPath)shape).curveTo(38.0, 77.20001, 38.6, 76.70001, 39.5, 76.30001);
((GeneralPath)shape).curveTo(40.4, 75.90001, 41.4, 75.80001, 42.6, 75.80001);
((GeneralPath)shape).curveTo(44.6, 75.80001, 46.1, 76.20001, 47.1, 77.10001);
((GeneralPath)shape).curveTo(48.1, 78.000015, 48.6, 79.10001, 48.699997, 80.60001);
((GeneralPath)shape).lineTo(45.499996, 80.70001);
((GeneralPath)shape).curveTo(45.399998, 79.90001, 45.099995, 79.30001, 44.599995, 79.000015);
((GeneralPath)shape).curveTo(44.199993, 78.60001, 43.499996, 78.500015, 42.599995, 78.500015);
((GeneralPath)shape).curveTo(41.699993, 78.500015, 40.999996, 78.70001, 40.399994, 79.10001);
((GeneralPath)shape).curveTo(40.099995, 79.30001, 39.899994, 79.70001, 39.899994, 80.10001);
((GeneralPath)shape).curveTo(39.899994, 80.500015, 40.099995, 80.80001, 40.399994, 81.10001);
((GeneralPath)shape).curveTo(40.799995, 81.40002, 41.799995, 81.80001, 43.299995, 82.20001);
((GeneralPath)shape).curveTo(44.799995, 82.60001, 45.999996, 82.90001, 46.699997, 83.30001);
((GeneralPath)shape).curveTo(47.399998, 83.70001, 47.999996, 84.20001, 48.399998, 84.90001);
((GeneralPath)shape).curveTo(48.8, 85.600006, 48.999996, 86.40001, 48.999996, 87.40001);
((GeneralPath)shape).curveTo(48.999996, 88.30001, 48.699997, 89.100006, 48.199997, 89.90001);
((GeneralPath)shape).curveTo(47.699997, 90.70001, 46.999996, 91.30001, 46.1, 91.70001);
((GeneralPath)shape).curveTo(45.199997, 92.10001, 44.0, 92.30001, 42.699997, 92.30001);
((GeneralPath)shape).curveTo(40.699997, 92.30001, 39.199997, 91.80001, 38.1, 90.90001);
((GeneralPath)shape).curveTo(37.0, 89.90001, 36.399998, 88.50001, 36.199997, 86.80001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(51.7, 91.899994);
((GeneralPath)shape).lineTo(51.7, 76.1);
((GeneralPath)shape).lineTo(54.9, 76.1);
((GeneralPath)shape).lineTo(54.9, 82.299995);
((GeneralPath)shape).lineTo(61.100002, 82.299995);
((GeneralPath)shape).lineTo(61.100002, 76.1);
((GeneralPath)shape).lineTo(64.3, 76.1);
((GeneralPath)shape).lineTo(64.3, 91.799995);
((GeneralPath)shape).lineTo(61.100002, 91.799995);
((GeneralPath)shape).lineTo(61.100002, 85.0);
((GeneralPath)shape).lineTo(54.9, 85.0);
((GeneralPath)shape).lineTo(54.9, 91.9);
((GeneralPath)shape).lineTo(51.7, 91.9);
((GeneralPath)shape).closePath();
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
	private ext_tcsh() {
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
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
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
       ext_tcsh base = new ext_tcsh();
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
       ext_tcsh base = new ext_tcsh();
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
        return ext_tcsh::new;
    }
}

