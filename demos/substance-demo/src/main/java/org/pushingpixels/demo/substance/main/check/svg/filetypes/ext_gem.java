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
public class ext_gem implements ResizableIcon {
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
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.0139999389648438), new Point2D.Double(36.20000076293945, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(72.3, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.199997, 1.0);
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
((GeneralPath)shape).moveTo(15.7, 82.8);
((GeneralPath)shape).lineTo(15.7, 79.5);
((GeneralPath)shape).lineTo(24.5, 79.5);
((GeneralPath)shape).lineTo(24.5, 87.4);
((GeneralPath)shape).curveTo(23.6, 88.200005, 22.4, 88.9, 20.8, 89.5);
((GeneralPath)shape).curveTo(19.199999, 90.1, 17.599998, 90.4, 15.9, 90.4);
((GeneralPath)shape).curveTo(13.799999, 90.4, 12.0, 90.0, 10.4, 89.1);
((GeneralPath)shape).curveTo(8.799999, 88.2, 7.7, 87.0, 6.9, 85.4);
((GeneralPath)shape).curveTo(6.1000004, 83.8, 5.7, 82.0, 5.7, 80.1);
((GeneralPath)shape).curveTo(5.7, 78.0, 6.1, 76.2, 7.0, 74.6);
((GeneralPath)shape).curveTo(7.9, 73.0, 9.2, 71.799995, 10.9, 70.9);
((GeneralPath)shape).curveTo(12.2, 70.200005, 13.799999, 69.9, 15.7, 69.9);
((GeneralPath)shape).curveTo(18.2, 69.9, 20.1, 70.4, 21.6, 71.4);
((GeneralPath)shape).curveTo(23.0, 72.4, 23.9, 73.9, 24.300001, 75.700005);
((GeneralPath)shape).lineTo(20.300001, 76.4);
((GeneralPath)shape).curveTo(20.000002, 75.4, 19.500002, 74.700005, 18.7, 74.1);
((GeneralPath)shape).curveTo(17.900002, 73.5, 16.900002, 73.299995, 15.800001, 73.299995);
((GeneralPath)shape).curveTo(14.000001, 73.299995, 12.600001, 73.899994, 11.600001, 74.99999);
((GeneralPath)shape).curveTo(10.600001, 76.09999, 10.0, 77.8, 10.0, 79.9);
((GeneralPath)shape).curveTo(10.0, 82.3, 10.5, 84.0, 11.6, 85.200005);
((GeneralPath)shape).curveTo(12.700001, 86.4, 14.1, 87.00001, 15.8, 87.00001);
((GeneralPath)shape).curveTo(16.7, 87.00001, 17.5, 86.80001, 18.4, 86.50001);
((GeneralPath)shape).curveTo(19.3, 86.200005, 20.0, 85.80001, 20.6, 85.30001);
((GeneralPath)shape).lineTo(20.6, 82.80001);
((GeneralPath)shape).lineTo(15.700001, 82.80001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.2, 90.100006);
((GeneralPath)shape).lineTo(28.2, 70.2);
((GeneralPath)shape).lineTo(43.1, 70.2);
((GeneralPath)shape).lineTo(43.1, 73.6);
((GeneralPath)shape).lineTo(32.3, 73.6);
((GeneralPath)shape).lineTo(32.3, 78.0);
((GeneralPath)shape).lineTo(42.4, 78.0);
((GeneralPath)shape).lineTo(42.4, 81.3);
((GeneralPath)shape).lineTo(32.3, 81.3);
((GeneralPath)shape).lineTo(32.3, 86.700005);
((GeneralPath)shape).lineTo(43.5, 86.700005);
((GeneralPath)shape).lineTo(43.5, 90.0);
((GeneralPath)shape).lineTo(28.2, 90.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.9, 90.100006);
((GeneralPath)shape).lineTo(46.9, 70.2);
((GeneralPath)shape).lineTo(53.0, 70.2);
((GeneralPath)shape).lineTo(56.6, 83.7);
((GeneralPath)shape).lineTo(60.199997, 70.2);
((GeneralPath)shape).lineTo(66.299995, 70.2);
((GeneralPath)shape).lineTo(66.299995, 90.0);
((GeneralPath)shape).lineTo(62.499996, 90.0);
((GeneralPath)shape).lineTo(62.499996, 74.5);
((GeneralPath)shape).lineTo(58.499996, 90.1);
((GeneralPath)shape).lineTo(54.599995, 90.1);
((GeneralPath)shape).lineTo(50.599995, 74.5);
((GeneralPath)shape).lineTo(50.599995, 90.1);
((GeneralPath)shape).lineTo(46.899994, 90.1);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.8, 32.0);
((GeneralPath)shape).curveTo(31.699999, 32.1, 31.699999, 32.1, 31.8, 32.0);
paint = new LinearGradientPaint(new Point2D.Double(31.746999740600586, 69.93499755859375), new Point2D.Double(31.746999740600586, 69.98600006103516), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 23.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(54.0, 23.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 59.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 50.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 41.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 50.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.0, 23.5);
((GeneralPath)shape).lineTo(45.0, 23.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(54.0, 23.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 41.5);
((GeneralPath)shape).lineTo(18.0, 50.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 32.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.0, 23.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(45.0, 23.5);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(18.0, 60.5), new Point2D.Double(54.0, 60.5), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 23.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(54.0, 23.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 59.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 50.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 41.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 50.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.0, 23.5);
((GeneralPath)shape).lineTo(45.0, 23.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(54.0, 23.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 41.5);
((GeneralPath)shape).lineTo(18.0, 50.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 32.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.0, 23.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(45.0, 23.5);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(255, 255, 255, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(54.0, 23.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(54.0, 23.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 59.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 50.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 41.5);
((GeneralPath)shape).lineTo(54.0, 59.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 59.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(18.0, 50.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.0, 23.5);
((GeneralPath)shape).lineTo(45.0, 23.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(54.0, 23.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.0, 41.5);
((GeneralPath)shape).lineTo(18.0, 50.5);
((GeneralPath)shape).lineTo(27.0, 50.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.0, 32.5);
((GeneralPath)shape).lineTo(27.0, 41.5);
((GeneralPath)shape).lineTo(36.0, 41.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.0, 23.5);
((GeneralPath)shape).lineTo(36.0, 32.5);
((GeneralPath)shape).lineTo(45.0, 32.5);
((GeneralPath)shape).lineTo(45.0, 23.5);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.32400131225586, 74.18399810791016), new Point2D.Double(58.87099838256836, 87.73100280761719), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.3, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
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
	private ext_gem() {
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
       ext_gem base = new ext_gem();
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
       ext_gem base = new ext_gem();
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
        return ext_gem::new;
    }
}

