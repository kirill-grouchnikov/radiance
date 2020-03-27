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
public class ext_js implements ResizableIcon {
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
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
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
g.setComposite(AlphaComposite.getInstance(3, 0.95f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(14.4, 44.1);
((GeneralPath)shape).lineTo(14.4, 39.199997);
((GeneralPath)shape).curveTo(15.4, 39.1, 16.199999, 38.999996, 16.699999, 38.699997);
((GeneralPath)shape).curveTo(17.199999, 38.499996, 17.599998, 37.999996, 17.999998, 37.499996);
((GeneralPath)shape).curveTo(18.399998, 36.899998, 18.599998, 36.199997, 18.799997, 35.299995);
((GeneralPath)shape).curveTo(18.899998, 34.599995, 18.999998, 33.499996, 18.999998, 31.899996);
((GeneralPath)shape).curveTo(18.999998, 29.199995, 19.099998, 27.399996, 19.399998, 26.299995);
((GeneralPath)shape).curveTo(19.599998, 25.299995, 20.099998, 24.399996, 20.699997, 23.799995);
((GeneralPath)shape).curveTo(21.299995, 23.199995, 22.299997, 22.699995, 23.499996, 22.299995);
((GeneralPath)shape).curveTo(24.299995, 22.099995, 25.599997, 21.899996, 27.399996, 21.899996);
((GeneralPath)shape).lineTo(28.499996, 21.899996);
((GeneralPath)shape).lineTo(28.499996, 26.799995);
((GeneralPath)shape).curveTo(26.999996, 26.799995, 25.999996, 26.899996, 25.599997, 27.099995);
((GeneralPath)shape).curveTo(25.199997, 27.299995, 24.899996, 27.499994, 24.599997, 27.899994);
((GeneralPath)shape).curveTo(24.399996, 28.199993, 24.299997, 28.799994, 24.299997, 29.699993);
((GeneralPath)shape).curveTo(24.299997, 30.599993, 24.199997, 32.199993, 24.099997, 34.599995);
((GeneralPath)shape).curveTo(23.999996, 35.999996, 23.899996, 37.099995, 23.599997, 37.999996);
((GeneralPath)shape).curveTo(23.299997, 38.799995, 22.899996, 39.499996, 22.499996, 40.099995);
((GeneralPath)shape).curveTo(22.099997, 40.599995, 21.399996, 41.199993, 20.499996, 41.799995);
((GeneralPath)shape).curveTo(21.299995, 42.299995, 21.999996, 42.799995, 22.499996, 43.399994);
((GeneralPath)shape).curveTo(22.999996, 43.999992, 23.399996, 44.799995, 23.699997, 45.699993);
((GeneralPath)shape).curveTo(23.999998, 46.59999, 24.199997, 47.79999, 24.199997, 49.29999);
((GeneralPath)shape).curveTo(24.299997, 51.59999, 24.299997, 52.999992, 24.299997, 53.699993);
((GeneralPath)shape).curveTo(24.299997, 54.599995, 24.399998, 55.199993, 24.599997, 55.599995);
((GeneralPath)shape).curveTo(24.799997, 55.999996, 25.199997, 56.199993, 25.599997, 56.399994);
((GeneralPath)shape).curveTo(25.999996, 56.599995, 26.999996, 56.699993, 28.499996, 56.699993);
((GeneralPath)shape).lineTo(28.499996, 61.599995);
((GeneralPath)shape).lineTo(27.399996, 61.599995);
((GeneralPath)shape).curveTo(25.599997, 61.599995, 24.099997, 61.499996, 23.199997, 61.199993);
((GeneralPath)shape).curveTo(22.199997, 60.899994, 21.399998, 60.399994, 20.699997, 59.699993);
((GeneralPath)shape).curveTo(19.999996, 58.999992, 19.599997, 58.199993, 19.299997, 57.199993);
((GeneralPath)shape).curveTo(19.099997, 56.199993, 18.999998, 54.599995, 18.999998, 52.399994);
((GeneralPath)shape).curveTo(18.999998, 49.899994, 18.899998, 48.199993, 18.699999, 47.499992);
((GeneralPath)shape).curveTo(18.4, 46.399994, 17.9, 45.59999, 17.3, 45.09999);
((GeneralPath)shape).curveTo(16.599998, 44.499992, 15.699999, 44.09999, 14.4, 44.09999);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(21.450000762939453, 61.54999923706055), new Point2D.Double(21.450000762939453, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(58.7, 44.1);
((GeneralPath)shape).curveTo(57.7, 44.199997, 56.9, 44.3, 56.4, 44.6);
((GeneralPath)shape).curveTo(55.9, 44.8, 55.5, 45.3, 55.100002, 45.8);
((GeneralPath)shape).curveTo(54.7, 46.399998, 54.500004, 47.1, 54.300003, 48.0);
((GeneralPath)shape).curveTo(54.200005, 48.7, 54.100002, 49.8, 54.100002, 51.4);
((GeneralPath)shape).curveTo(54.100002, 54.100002, 54.000004, 55.9, 53.7, 57.0);
((GeneralPath)shape).curveTo(53.5, 58.1, 53.0, 58.9, 52.4, 59.5);
((GeneralPath)shape).curveTo(51.800003, 60.1, 50.800003, 60.6, 49.600002, 61.0);
((GeneralPath)shape).curveTo(48.800003, 61.2, 47.500004, 61.4, 45.7, 61.4);
((GeneralPath)shape).lineTo(44.600002, 61.4);
((GeneralPath)shape).lineTo(44.600002, 56.5);
((GeneralPath)shape).curveTo(46.100002, 56.5, 47.000004, 56.4, 47.500004, 56.2);
((GeneralPath)shape).curveTo(48.000004, 56.0, 48.300003, 55.7, 48.500004, 55.4);
((GeneralPath)shape).curveTo(48.700005, 55.100002, 48.800003, 54.5, 48.800003, 53.600002);
((GeneralPath)shape).curveTo(48.800003, 52.800003, 48.9, 51.2, 49.000004, 48.800003);
((GeneralPath)shape).curveTo(49.100002, 47.4, 49.300003, 46.200005, 49.600002, 45.4);
((GeneralPath)shape).curveTo(49.9, 44.5, 50.300003, 43.800003, 50.800003, 43.2);
((GeneralPath)shape).curveTo(51.300003, 42.6, 51.9, 42.100002, 52.700005, 41.600002);
((GeneralPath)shape).curveTo(51.700005, 40.9, 50.900005, 40.300003, 50.500004, 39.7);
((GeneralPath)shape).curveTo(49.900005, 38.8, 49.400005, 37.600002, 49.200005, 36.3);
((GeneralPath)shape).curveTo(49.000004, 35.3, 48.900005, 33.2, 48.900005, 30.0);
((GeneralPath)shape).curveTo(48.900005, 29.0, 48.800007, 28.3, 48.600006, 27.9);
((GeneralPath)shape).curveTo(48.400005, 27.6, 48.100006, 27.3, 47.700005, 27.1);
((GeneralPath)shape).curveTo(47.300003, 26.9, 46.300003, 26.800001, 44.700005, 26.800001);
((GeneralPath)shape).lineTo(44.700005, 22.0);
((GeneralPath)shape).lineTo(45.800003, 22.0);
((GeneralPath)shape).curveTo(47.600002, 22.0, 49.100002, 22.1, 50.000004, 22.4);
((GeneralPath)shape).curveTo(51.000004, 22.699999, 51.800003, 23.199999, 52.500004, 23.9);
((GeneralPath)shape).curveTo(53.200005, 24.6, 53.600002, 25.4, 53.900005, 26.4);
((GeneralPath)shape).curveTo(54.100006, 27.4, 54.300007, 29.0, 54.300007, 31.2);
((GeneralPath)shape).curveTo(54.300007, 33.7, 54.400005, 35.3, 54.600006, 36.100002);
((GeneralPath)shape).curveTo(54.900005, 37.2, 55.400005, 38.000004, 56.000008, 38.4);
((GeneralPath)shape).curveTo(56.600006, 38.9, 57.600006, 39.100002, 58.800007, 39.2);
((GeneralPath)shape).lineTo(58.70001, 44.100002);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(51.70000076293945, 61.45000076293945), new Point2D.Double(51.70000076293945, 21.950000762939453), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
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
((GeneralPath)shape).moveTo(28.1, 71.5);
((GeneralPath)shape).lineTo(32.1, 71.5);
((GeneralPath)shape).lineTo(32.1, 84.2);
((GeneralPath)shape).curveTo(32.1, 85.899994, 31.999998, 87.1, 31.699999, 88.0);
((GeneralPath)shape).curveTo(31.3, 89.2, 30.599998, 90.1, 29.599998, 90.8);
((GeneralPath)shape).curveTo(28.599998, 91.5, 27.199999, 91.9, 25.499998, 91.9);
((GeneralPath)shape).curveTo(23.499998, 91.9, 21.999998, 91.3, 20.899998, 90.200005);
((GeneralPath)shape).curveTo(19.799997, 89.100006, 19.299997, 87.50001, 19.299997, 85.3);
((GeneralPath)shape).lineTo(23.099997, 84.9);
((GeneralPath)shape).curveTo(23.099997, 86.0, 23.299997, 86.9, 23.599997, 87.3);
((GeneralPath)shape).curveTo(23.999996, 88.0, 24.699997, 88.4, 25.599997, 88.4);
((GeneralPath)shape).curveTo(26.499996, 88.4, 27.099997, 88.1, 27.499996, 87.6);
((GeneralPath)shape).curveTo(27.899996, 87.1, 28.099997, 86.0, 28.099997, 84.4);
((GeneralPath)shape).lineTo(28.099997, 71.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.5, 85.0);
((GeneralPath)shape).lineTo(39.4, 84.6);
((GeneralPath)shape).curveTo(39.600002, 85.9, 40.100002, 86.9, 40.800003, 87.5);
((GeneralPath)shape).curveTo(41.500004, 88.1, 42.500004, 88.4, 43.700005, 88.4);
((GeneralPath)shape).curveTo(45.000004, 88.4, 46.000004, 88.1, 46.600006, 87.6);
((GeneralPath)shape).curveTo(47.300007, 87.0, 47.600006, 86.4, 47.600006, 85.7);
((GeneralPath)shape).curveTo(47.600006, 85.2, 47.500008, 84.799995, 47.200005, 84.5);
((GeneralPath)shape).curveTo(46.900005, 84.2, 46.400005, 83.9, 45.700005, 83.6);
((GeneralPath)shape).curveTo(45.200005, 83.4, 44.100006, 83.1, 42.500004, 82.7);
((GeneralPath)shape).curveTo(40.300003, 82.2, 38.800003, 81.5, 37.900005, 80.7);
((GeneralPath)shape).curveTo(36.700005, 79.6, 36.100006, 78.299995, 36.100006, 76.7);
((GeneralPath)shape).curveTo(36.100006, 75.7, 36.400005, 74.7, 37.000008, 73.799995);
((GeneralPath)shape).curveTo(37.600006, 72.899994, 38.40001, 72.2, 39.500008, 71.799995);
((GeneralPath)shape).curveTo(40.600006, 71.299995, 41.90001, 71.1, 43.40001, 71.1);
((GeneralPath)shape).curveTo(45.90001, 71.1, 47.80001, 71.7, 49.10001, 72.799995);
((GeneralPath)shape).curveTo(50.40001, 73.899994, 51.00001, 75.399994, 51.10001, 77.2);
((GeneralPath)shape).lineTo(47.10001, 77.399994);
((GeneralPath)shape).curveTo(46.90001, 76.399994, 46.60001, 75.59999, 46.00001, 75.2);
((GeneralPath)shape).curveTo(45.400013, 74.7, 44.60001, 74.5, 43.400013, 74.5);
((GeneralPath)shape).curveTo(42.200012, 74.5, 41.300014, 74.7, 40.600014, 75.2);
((GeneralPath)shape).curveTo(40.200012, 75.5, 40.000015, 75.899994, 40.000015, 76.399994);
((GeneralPath)shape).curveTo(40.000015, 76.899994, 40.200016, 77.299995, 40.600014, 77.59999);
((GeneralPath)shape).curveTo(41.100014, 77.99999, 42.400013, 78.49999, 44.300014, 78.899994);
((GeneralPath)shape).curveTo(46.200016, 79.299995, 47.700016, 79.799995, 48.700016, 80.299995);
((GeneralPath)shape).curveTo(49.700016, 80.799995, 50.400017, 81.49999, 50.900017, 82.299995);
((GeneralPath)shape).curveTo(51.400017, 83.1, 51.700016, 84.2, 51.700016, 85.49999);
((GeneralPath)shape).curveTo(51.700016, 86.59999, 51.400017, 87.69999, 50.700016, 88.69999);
((GeneralPath)shape).curveTo(50.100018, 89.69999, 49.200016, 90.39999, 48.000015, 90.89999);
((GeneralPath)shape).curveTo(46.800014, 91.39999, 45.400017, 91.59998, 43.600014, 91.59998);
((GeneralPath)shape).curveTo(41.100014, 91.59998, 39.100014, 90.999985, 37.800014, 89.79998);
((GeneralPath)shape).curveTo(36.500015, 88.99998, 35.700016, 87.29998, 35.500015, 84.99998);
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
	private ext_js() {
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
       ext_js base = new ext_js();
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
       ext_js base = new ext_js();
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
        return ext_js::new;
    }
}

