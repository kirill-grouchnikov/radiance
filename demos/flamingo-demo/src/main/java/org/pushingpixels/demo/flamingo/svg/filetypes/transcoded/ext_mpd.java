package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_mpd implements ResizableIcon {
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
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 3.005000114440918), new Point2D.Double(36.20000076293945, 101.0), new float[] {0.029f,0.462f,0.998f}, new Color[] {new Color(35, 84, 39, 255),new Color(78, 176, 86, 255),new Color(100, 214, 109, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(0.32499998807907104, 49.99700164794922), new Point2D.Double(72.07499694824219, 49.99700164794922), new float[] {0.005f,0.343f,1.0f}, new Color[] {new Color(7, 114, 101, 0),new Color(0, 106, 105, 0),new Color(0, 56, 54, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(35, 84, 39, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(72.1, 99.0);
((GeneralPath)shape).lineTo(0.3, 99.0);
((GeneralPath)shape).lineTo(0.3, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
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
((GeneralPath)shape).moveTo(7.2, 91.1);
((GeneralPath)shape).lineTo(7.2, 71.2);
((GeneralPath)shape).lineTo(13.2, 71.2);
((GeneralPath)shape).lineTo(16.8, 84.7);
((GeneralPath)shape).lineTo(20.4, 71.2);
((GeneralPath)shape).lineTo(26.4, 71.2);
((GeneralPath)shape).lineTo(26.4, 91.0);
((GeneralPath)shape).lineTo(22.699999, 91.0);
((GeneralPath)shape).lineTo(22.699999, 75.4);
((GeneralPath)shape).lineTo(18.699999, 91.0);
((GeneralPath)shape).lineTo(14.799999, 91.0);
((GeneralPath)shape).lineTo(10.799999, 75.4);
((GeneralPath)shape).lineTo(10.799999, 91.0);
((GeneralPath)shape).lineTo(7.2, 91.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(30.5, 91.1);
((GeneralPath)shape).lineTo(30.5, 71.2);
((GeneralPath)shape).lineTo(37.0, 71.2);
((GeneralPath)shape).curveTo(39.5, 71.2, 41.1, 71.299995, 41.8, 71.5);
((GeneralPath)shape).curveTo(42.899998, 71.8, 43.899998, 72.4, 44.7, 73.4);
((GeneralPath)shape).curveTo(45.5, 74.4, 45.9, 75.700005, 45.9, 77.3);
((GeneralPath)shape).curveTo(45.9, 78.5, 45.7, 79.5, 45.2, 80.4);
((GeneralPath)shape).curveTo(44.8, 81.200005, 44.2, 81.9, 43.5, 82.4);
((GeneralPath)shape).curveTo(42.8, 82.9, 42.1, 83.200005, 41.4, 83.3);
((GeneralPath)shape).curveTo(40.4, 83.5, 39.0, 83.600006, 37.2, 83.600006);
((GeneralPath)shape).lineTo(34.600002, 83.600006);
((GeneralPath)shape).lineTo(34.600002, 91.100006);
((GeneralPath)shape).lineTo(30.500002, 91.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(34.5, 74.6);
((GeneralPath)shape).lineTo(34.5, 80.2);
((GeneralPath)shape).lineTo(36.7, 80.2);
((GeneralPath)shape).curveTo(38.3, 80.2, 39.4, 80.1, 39.9, 79.899994);
((GeneralPath)shape).curveTo(40.4, 79.7, 40.9, 79.399994, 41.2, 78.899994);
((GeneralPath)shape).curveTo(41.5, 78.49999, 41.7, 77.899994, 41.7, 77.399994);
((GeneralPath)shape).curveTo(41.7, 76.7, 41.5, 76.09999, 41.100002, 75.59999);
((GeneralPath)shape).curveTo(40.7, 75.09999, 40.100002, 74.79999, 39.500004, 74.69999);
((GeneralPath)shape).curveTo(39.000004, 74.59999, 38.100002, 74.59999, 36.600002, 74.59999);
((GeneralPath)shape).lineTo(34.500004, 74.59999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(49.1, 71.2);
((GeneralPath)shape).lineTo(56.5, 71.2);
((GeneralPath)shape).curveTo(58.2, 71.2, 59.4, 71.299995, 60.3, 71.6);
((GeneralPath)shape).curveTo(61.5, 71.9, 62.5, 72.6, 63.3, 73.4);
((GeneralPath)shape).curveTo(64.1, 74.200005, 64.8, 75.3, 65.2, 76.6);
((GeneralPath)shape).curveTo(65.6, 77.9, 65.899994, 79.4, 65.899994, 81.299995);
((GeneralPath)shape).curveTo(65.899994, 82.899994, 65.7, 84.299995, 65.299995, 85.49999);
((GeneralPath)shape).curveTo(64.799995, 86.899994, 64.1, 88.09999, 63.199997, 88.99999);
((GeneralPath)shape).curveTo(62.499996, 89.69999, 61.6, 90.19999, 60.399998, 90.59999);
((GeneralPath)shape).curveTo(59.499996, 90.899994, 58.3, 90.99999, 56.8, 90.99999);
((GeneralPath)shape).lineTo(49.2, 90.99999);
((GeneralPath)shape).lineTo(49.2, 71.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.1, 74.6);
((GeneralPath)shape).lineTo(53.1, 87.7);
((GeneralPath)shape).lineTo(56.1, 87.7);
((GeneralPath)shape).curveTo(57.199997, 87.7, 58.0, 87.6, 58.5, 87.5);
((GeneralPath)shape).curveTo(59.2, 87.3, 59.7, 87.1, 60.1, 86.7);
((GeneralPath)shape).curveTo(60.5, 86.299995, 60.899998, 85.7, 61.199997, 84.799995);
((GeneralPath)shape).curveTo(61.499996, 83.899994, 61.6, 82.7, 61.6, 81.2);
((GeneralPath)shape).curveTo(61.6, 79.7, 61.5, 78.5, 61.199997, 77.7);
((GeneralPath)shape).curveTo(60.899998, 76.899994, 60.499996, 76.2, 60.1, 75.799995);
((GeneralPath)shape).curveTo(59.6, 75.299995, 59.0, 74.99999, 58.199997, 74.899994);
((GeneralPath)shape).curveTo(57.6, 74.799995, 56.499996, 74.7, 54.899998, 74.7);
((GeneralPath)shape).lineTo(53.1, 74.7);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.1, 24.0);
((GeneralPath)shape).lineTo(40.6, 19.2);
((GeneralPath)shape).lineTo(40.6, 62.0);
((GeneralPath)shape).lineTo(15.099998, 57.3);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(27.84600067138672, 19.200000762939453), new Point2D.Double(27.84600067138672, 62.0), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(58.4, 57.8);
((GeneralPath)shape).lineTo(36.8, 57.8);
((GeneralPath)shape).curveTo(35.7, 57.8, 34.899998, 56.899998, 34.899998, 55.899998);
((GeneralPath)shape).lineTo(34.899998, 25.4);
((GeneralPath)shape).curveTo(34.899998, 24.3, 35.8, 23.5, 36.8, 23.5);
((GeneralPath)shape).lineTo(58.5, 23.5);
((GeneralPath)shape).curveTo(59.6, 23.5, 60.4, 24.4, 60.4, 25.4);
((GeneralPath)shape).lineTo(60.4, 56.0);
((GeneralPath)shape).curveTo(60.300003, 57.0, 59.5, 57.8, 58.4, 57.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.8, 25.2);
((GeneralPath)shape).curveTo(36.7, 25.2, 36.6, 25.300001, 36.6, 25.400002);
((GeneralPath)shape).lineTo(36.6, 56.0);
((GeneralPath)shape).curveTo(36.6, 56.1, 36.699997, 56.2, 36.8, 56.2);
((GeneralPath)shape).lineTo(58.5, 56.2);
((GeneralPath)shape).curveTo(58.6, 56.2, 58.7, 56.100002, 58.7, 56.0);
((GeneralPath)shape).lineTo(58.7, 25.4);
((GeneralPath)shape).curveTo(58.7, 25.3, 58.600002, 25.199999, 58.5, 25.199999);
((GeneralPath)shape).lineTo(36.8, 25.199999);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(47.577999114990234, 23.542999267578125), new Point2D.Double(47.577999114990234, 57.84600067138672), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(55.3, 42.2);
((GeneralPath)shape).lineTo(52.399998, 42.2);
((GeneralPath)shape).lineTo(52.399998, 32.2);
((GeneralPath)shape).lineTo(39.1, 32.2);
((GeneralPath)shape).lineTo(39.1, 29.300001);
((GeneralPath)shape).lineTo(55.3, 29.300001);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(47.16899871826172, 29.270999908447266), new Point2D.Double(47.16899871826172, 42.17300033569336), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(53.7, 44.7);
((GeneralPath)shape).lineTo(48.6, 39.0);
((GeneralPath)shape).lineTo(58.699997, 39.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(53.6510009765625, 39.0260009765625), new Point2D.Double(53.6510009765625, 44.691001892089844), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
shape = new GeneralPath();
((GeneralPath)shape).moveTo(40.5, 47.7);
((GeneralPath)shape).lineTo(46.0, 42.2);
((GeneralPath)shape).lineTo(51.4, 47.7);
((GeneralPath)shape).lineTo(46.0, 53.100002);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.974998474121094, 42.18199920654297), new Point2D.Double(45.974998474121094, 53.13100051879883), new float[] {0.0f,1.0f}, new Color[] {new Color(35, 84, 39, 255),new Color(68, 152, 75, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
shape = new GeneralPath();
((GeneralPath)shape).moveTo(31.0, 34.1);
((GeneralPath)shape).curveTo(30.6, 33.699997, 30.0, 33.3, 29.3, 33.199997);
((GeneralPath)shape).curveTo(28.699999, 32.999996, 27.9, 32.999996, 27.199999, 32.999996);
((GeneralPath)shape).curveTo(25.8, 33.099995, 23.199999, 33.299995, 23.199999, 33.299995);
((GeneralPath)shape).lineTo(23.099998, 47.199997);
((GeneralPath)shape).lineTo(25.699999, 47.399998);
((GeneralPath)shape).lineTo(25.699999, 42.499996);
((GeneralPath)shape).curveTo(25.699999, 42.499996, 27.199999, 42.699997, 28.599998, 42.399998);
((GeneralPath)shape).curveTo(29.399998, 42.199997, 29.999998, 41.8, 30.399998, 41.499996);
((GeneralPath)shape).curveTo(30.799997, 41.099995, 31.199997, 40.499996, 31.499998, 40.099995);
((GeneralPath)shape).curveTo(31.899998, 39.399994, 31.999998, 38.699993, 31.999998, 37.599995);
((GeneralPath)shape).curveTo(32.199997, 36.099995, 31.799997, 34.899994, 30.999998, 34.099995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.9, 39.0);
((GeneralPath)shape).curveTo(28.4, 40.1, 27.1, 40.1, 27.1, 40.1);
((GeneralPath)shape).lineTo(25.800001, 40.1);
((GeneralPath)shape).lineTo(25.800001, 35.699997);
((GeneralPath)shape).curveTo(25.800001, 35.699997, 26.7, 35.6, 27.500002, 35.699997);
((GeneralPath)shape).curveTo(27.900002, 35.799995, 28.300001, 35.899998, 28.400002, 35.999996);
((GeneralPath)shape).curveTo(29.100002, 36.499996, 29.400002, 37.999996, 28.900002, 38.999996);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.2140007019043, 74.22899627685547), new Point2D.Double(58.66699981689453, 87.68199920654297), new float[] {0.484f,0.931f,0.998f}, new Color[] {new Color(204, 248, 210, 255),new Color(66, 155, 78, 255),new Color(45, 113, 54, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
((GeneralPath)shape).lineTo(45.2, 27.7);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(35, 84, 39, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.1, 27.7);
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
	private ext_mpd() {
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
       ext_mpd base = new ext_mpd();
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
       ext_mpd base = new ext_mpd();
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
        return ext_mpd::new;
    }
}

