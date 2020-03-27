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
public class ext_prop implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(6.3, 90.9);
((GeneralPath)shape).lineTo(6.3, 75.1);
((GeneralPath)shape).lineTo(11.5, 75.1);
((GeneralPath)shape).curveTo(13.5, 75.1, 14.7, 75.2, 15.3, 75.299995);
((GeneralPath)shape).curveTo(16.2, 75.49999, 17.0, 76.1, 17.6, 76.799995);
((GeneralPath)shape).curveTo(18.2, 77.6, 18.5, 78.6, 18.5, 79.899994);
((GeneralPath)shape).curveTo(18.5, 80.899994, 18.3, 81.7, 18.0, 82.299995);
((GeneralPath)shape).curveTo(17.7, 82.899994, 17.2, 83.49999, 16.6, 83.899994);
((GeneralPath)shape).curveTo(16.1, 84.299995, 15.5, 84.49999, 14.900001, 84.59999);
((GeneralPath)shape).curveTo(14.1, 84.79999, 13.000001, 84.79999, 11.6, 84.79999);
((GeneralPath)shape).lineTo(9.5, 84.79999);
((GeneralPath)shape).lineTo(9.5, 90.69999);
((GeneralPath)shape).lineTo(6.3, 90.69999);
((GeneralPath)shape).lineTo(6.3, 90.89999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(9.5, 77.8);
((GeneralPath)shape).lineTo(9.5, 82.3);
((GeneralPath)shape).lineTo(11.3, 82.3);
((GeneralPath)shape).curveTo(12.6, 82.3, 13.4, 82.200005, 13.8, 82.100006);
((GeneralPath)shape).curveTo(14.200001, 82.00001, 14.6, 81.700005, 14.8, 81.3);
((GeneralPath)shape).curveTo(15.0, 80.9, 15.2, 80.5, 15.2, 80.100006);
((GeneralPath)shape).curveTo(15.2, 79.50001, 15.0, 79.100006, 14.7, 78.700005);
((GeneralPath)shape).curveTo(14.4, 78.3, 13.9, 78.100006, 13.4, 78.00001);
((GeneralPath)shape).curveTo(13.0, 77.90001, 12.2, 77.90001, 11.099999, 77.90001);
((GeneralPath)shape).lineTo(9.5, 77.90001);
((GeneralPath)shape).lineTo(9.5, 77.80001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.2, 90.9);
((GeneralPath)shape).lineTo(21.2, 75.1);
((GeneralPath)shape).lineTo(28.0, 75.1);
((GeneralPath)shape).curveTo(29.7, 75.1, 30.9, 75.2, 31.7, 75.5);
((GeneralPath)shape).curveTo(32.5, 75.8, 33.100002, 76.3, 33.600002, 77.0);
((GeneralPath)shape).curveTo(34.100002, 77.7, 34.300003, 78.6, 34.300003, 79.5);
((GeneralPath)shape).curveTo(34.300003, 80.7, 33.9, 81.7, 33.200005, 82.4);
((GeneralPath)shape).curveTo(32.500004, 83.200005, 31.400005, 83.700005, 30.100004, 83.9);
((GeneralPath)shape).curveTo(30.800005, 84.3, 31.400003, 84.700005, 31.800005, 85.200005);
((GeneralPath)shape).curveTo(32.200005, 85.700005, 32.900005, 86.50001, 33.600006, 87.8);
((GeneralPath)shape).lineTo(35.500008, 90.9);
((GeneralPath)shape).lineTo(31.700008, 90.9);
((GeneralPath)shape).lineTo(29.40001, 87.5);
((GeneralPath)shape).curveTo(28.60001, 86.3, 28.00001, 85.5, 27.700008, 85.2);
((GeneralPath)shape).curveTo(27.40001, 84.899994, 27.100008, 84.7, 26.700008, 84.5);
((GeneralPath)shape).curveTo(26.40001, 84.4, 25.800009, 84.3, 25.100008, 84.3);
((GeneralPath)shape).lineTo(24.400007, 84.3);
((GeneralPath)shape).lineTo(24.400007, 90.9);
((GeneralPath)shape).lineTo(21.200006, 90.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(24.400002, 81.8);
((GeneralPath)shape).lineTo(26.800001, 81.8);
((GeneralPath)shape).curveTo(28.300001, 81.8, 29.300001, 81.700005, 29.7, 81.600006);
((GeneralPath)shape).curveTo(30.1, 81.50001, 30.400002, 81.200005, 30.6, 80.90001);
((GeneralPath)shape).curveTo(30.800001, 80.600006, 30.9, 80.20001, 30.9, 79.70001);
((GeneralPath)shape).curveTo(30.9, 79.20001, 30.8, 78.70001, 30.5, 78.40001);
((GeneralPath)shape).curveTo(30.2, 78.100006, 29.8, 77.90001, 29.3, 77.80001);
((GeneralPath)shape).curveTo(29.0, 77.80001, 28.3, 77.70001, 27.0, 77.70001);
((GeneralPath)shape).lineTo(24.5, 77.70001);
((GeneralPath)shape).lineTo(24.4, 81.80001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.5, 83.100006);
((GeneralPath)shape).curveTo(36.5, 81.50001, 36.7, 80.100006, 37.2, 79.100006);
((GeneralPath)shape).curveTo(37.600002, 78.3, 38.100002, 77.600006, 38.7, 76.90001);
((GeneralPath)shape).curveTo(39.3, 76.30001, 40.0, 75.80001, 40.8, 75.50001);
((GeneralPath)shape).curveTo(41.8, 75.100006, 42.899998, 74.90001, 44.2, 74.90001);
((GeneralPath)shape).curveTo(46.5, 74.90001, 48.4, 75.600006, 49.8, 77.100006);
((GeneralPath)shape).curveTo(51.2, 78.50001, 51.899998, 80.50001, 51.899998, 83.100006);
((GeneralPath)shape).curveTo(51.899998, 85.600006, 51.199997, 87.600006, 49.8, 89.100006);
((GeneralPath)shape).curveTo(48.399998, 90.50001, 46.5, 91.3, 44.2, 91.3);
((GeneralPath)shape).curveTo(41.8, 91.3, 40.0, 90.600006, 38.600002, 89.200005);
((GeneralPath)shape).curveTo(37.2, 87.600006, 36.500004, 85.600006, 36.500004, 83.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(39.9, 83.00001);
((GeneralPath)shape).curveTo(39.9, 84.80001, 40.300003, 86.100006, 41.100002, 87.100006);
((GeneralPath)shape).curveTo(41.9, 88.00001, 43.000004, 88.50001, 44.300003, 88.50001);
((GeneralPath)shape).curveTo(45.600002, 88.50001, 46.600002, 88.00001, 47.500004, 87.100006);
((GeneralPath)shape).curveTo(48.300003, 86.200005, 48.700005, 84.8, 48.700005, 83.00001);
((GeneralPath)shape).curveTo(48.700005, 81.200005, 48.300003, 79.80001, 47.500004, 79.00001);
((GeneralPath)shape).curveTo(46.700005, 78.200005, 45.600002, 77.700005, 44.300003, 77.700005);
((GeneralPath)shape).curveTo(43.000004, 77.700005, 41.9, 78.100006, 41.100002, 79.00001);
((GeneralPath)shape).curveTo(40.300003, 79.80001, 39.9, 81.200005, 39.9, 83.00001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.5, 90.90001);
((GeneralPath)shape).lineTo(54.5, 75.1);
((GeneralPath)shape).lineTo(59.7, 75.1);
((GeneralPath)shape).curveTo(61.7, 75.1, 62.9, 75.2, 63.5, 75.299995);
((GeneralPath)shape).curveTo(64.4, 75.49999, 65.2, 76.1, 65.8, 76.799995);
((GeneralPath)shape).curveTo(66.4, 77.6, 66.700005, 78.6, 66.700005, 79.899994);
((GeneralPath)shape).curveTo(66.700005, 80.899994, 66.50001, 81.7, 66.200005, 82.299995);
((GeneralPath)shape).curveTo(65.9, 82.899994, 65.4, 83.49999, 64.8, 83.899994);
((GeneralPath)shape).curveTo(64.3, 84.299995, 63.700005, 84.49999, 63.100002, 84.59999);
((GeneralPath)shape).curveTo(62.300003, 84.79999, 61.2, 84.79999, 59.800003, 84.79999);
((GeneralPath)shape).lineTo(57.700005, 84.79999);
((GeneralPath)shape).lineTo(57.700005, 90.69999);
((GeneralPath)shape).lineTo(54.500004, 90.69999);
((GeneralPath)shape).lineTo(54.500004, 90.89999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(57.7, 77.80001);
((GeneralPath)shape).lineTo(57.7, 82.30001);
((GeneralPath)shape).lineTo(59.5, 82.30001);
((GeneralPath)shape).curveTo(60.8, 82.30001, 61.6, 82.20001, 62.0, 82.10001);
((GeneralPath)shape).curveTo(62.4, 81.90002, 62.8, 81.70001, 63.0, 81.30001);
((GeneralPath)shape).curveTo(63.2, 80.90001, 63.4, 80.50001, 63.4, 80.10001);
((GeneralPath)shape).curveTo(63.4, 79.500015, 63.2, 79.10001, 62.9, 78.70001);
((GeneralPath)shape).curveTo(62.600002, 78.30001, 62.100002, 78.10001, 61.600002, 78.000015);
((GeneralPath)shape).curveTo(61.2, 77.90002, 60.4, 77.90002, 59.300003, 77.90002);
((GeneralPath)shape).lineTo(57.700005, 77.90002);
((GeneralPath)shape).lineTo(57.700005, 77.80002);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.4, 52.7);
((GeneralPath)shape).curveTo(23.4, 53.9, 24.199999, 54.8, 25.5, 54.8);
((GeneralPath)shape).lineTo(27.6, 54.8);
((GeneralPath)shape).lineTo(27.6, 62.0);
((GeneralPath)shape).curveTo(27.6, 63.6, 29.0, 65.1, 30.7, 65.1);
((GeneralPath)shape).curveTo(32.3, 65.1, 33.8, 63.699997, 33.8, 62.0);
((GeneralPath)shape).lineTo(33.8, 54.8);
((GeneralPath)shape).lineTo(37.899998, 54.8);
((GeneralPath)shape).lineTo(37.899998, 62.0);
((GeneralPath)shape).curveTo(37.899998, 63.6, 39.3, 65.1, 40.999996, 65.1);
((GeneralPath)shape).curveTo(42.699993, 65.1, 44.099995, 63.699997, 44.099995, 62.0);
((GeneralPath)shape).lineTo(44.099995, 54.8);
((GeneralPath)shape).lineTo(46.0, 54.8);
((GeneralPath)shape).curveTo(47.2, 54.8, 48.1, 54.0, 48.1, 52.7);
((GeneralPath)shape).lineTo(48.1, 32.1);
((GeneralPath)shape).lineTo(23.4, 32.1);
((GeneralPath)shape).lineTo(23.4, 52.699997);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(18.3, 32.1);
((GeneralPath)shape).curveTo(16.699999, 32.1, 15.199999, 33.5, 15.199999, 35.199997);
((GeneralPath)shape).lineTo(15.199999, 49.6);
((GeneralPath)shape).curveTo(15.199999, 51.199997, 16.599998, 52.699997, 18.3, 52.699997);
((GeneralPath)shape).curveTo(19.9, 52.699997, 21.4, 51.299995, 21.4, 49.6);
((GeneralPath)shape).lineTo(21.4, 35.2);
((GeneralPath)shape).curveTo(21.4, 33.5, 19.9, 32.100002, 18.3, 32.100002);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.2, 32.1);
((GeneralPath)shape).curveTo(51.600002, 32.1, 50.100002, 33.5, 50.100002, 35.199997);
((GeneralPath)shape).lineTo(50.100002, 49.6);
((GeneralPath)shape).curveTo(50.100002, 51.199997, 51.500004, 52.699997, 53.2, 52.699997);
((GeneralPath)shape).curveTo(54.899998, 52.699997, 56.3, 51.299995, 56.3, 49.6);
((GeneralPath)shape).lineTo(56.3, 35.2);
((GeneralPath)shape).curveTo(56.3, 33.5, 54.899998, 32.100002, 53.2, 32.100002);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.9, 20.2);
((GeneralPath)shape).lineTo(45.600002, 17.5);
((GeneralPath)shape).curveTo(46.000004, 17.1, 46.000004, 16.5, 45.600002, 16.1);
((GeneralPath)shape).curveTo(45.2, 15.700001, 44.600002, 15.700001, 44.2, 16.1);
((GeneralPath)shape).lineTo(41.100002, 19.2);
((GeneralPath)shape).curveTo(39.7, 18.2, 37.800003, 17.800001, 35.800003, 17.800001);
((GeneralPath)shape).curveTo(33.800003, 17.800001, 31.900003, 18.2, 30.200003, 19.000002);
((GeneralPath)shape).lineTo(27.300003, 15.900002);
((GeneralPath)shape).curveTo(26.900003, 15.700002, 26.100002, 15.700002, 25.700003, 15.900002);
((GeneralPath)shape).curveTo(25.500002, 16.300001, 25.500002, 17.100002, 25.700003, 17.500002);
((GeneralPath)shape).lineTo(28.400003, 20.200003);
((GeneralPath)shape).curveTo(25.500004, 22.500002, 23.500004, 26.000004, 23.500004, 30.100002);
((GeneralPath)shape).lineTo(48.200005, 30.100002);
((GeneralPath)shape).curveTo(48.100006, 25.900002, 46.000004, 22.200003, 42.900005, 20.200003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(31.600002, 25.900002);
((GeneralPath)shape).lineTo(29.500002, 25.900002);
((GeneralPath)shape).lineTo(29.500002, 23.800001);
((GeneralPath)shape).lineTo(31.600002, 23.800001);
((GeneralPath)shape).lineTo(31.600002, 25.900002);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(41.9, 25.900002);
((GeneralPath)shape).lineTo(39.800003, 25.900002);
((GeneralPath)shape).lineTo(39.800003, 23.800001);
((GeneralPath)shape).lineTo(41.9, 23.800001);
((GeneralPath)shape).lineTo(41.9, 25.900002);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.75, 34.900001525878906), new Point2D.Double(35.75, 84.25), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
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
paint = new LinearGradientPaint(new Point2D.Double(45.0359992980957, 25.81399917602539), new Point2D.Double(58.5359992980957, 12.312999725341797), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
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
	private ext_prop() {
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
       ext_prop base = new ext_prop();
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
       ext_prop base = new ext_prop();
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
        return ext_prop::new;
    }
}

