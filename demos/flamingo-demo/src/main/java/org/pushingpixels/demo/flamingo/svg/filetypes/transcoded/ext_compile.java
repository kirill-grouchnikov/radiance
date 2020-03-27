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
public class ext_compile implements ResizableIcon {
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
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, -27.799999237060547), new Point2D.Double(36.0, 70.19999694824219), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 71.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(72.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 98.8);
((GeneralPath)shape).lineTo(0.0, 0.8);
((GeneralPath)shape).lineTo(45.0, 0.8);
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
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.07500076293945, 43.42499923706055), new Point2D.Double(58.57500076293945, 56.92499923706055), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 71.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 0.8);
((GeneralPath)shape).lineTo(72.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 27.5);
((GeneralPath)shape).lineTo(45.0, 0.8);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.4, 86.1);
((GeneralPath)shape).lineTo(13.4, 86.7);
((GeneralPath)shape).curveTo(13.099999, 87.799995, 12.599999, 88.6, 11.9, 89.1);
((GeneralPath)shape).curveTo(11.2, 89.6, 10.299999, 89.9, 9.2, 89.9);
((GeneralPath)shape).curveTo(7.8999996, 89.9, 6.7999997, 89.4, 5.8999996, 88.5);
((GeneralPath)shape).curveTo(4.9999995, 87.6, 4.5999994, 86.3, 4.5999994, 84.8);
((GeneralPath)shape).curveTo(4.5999994, 83.100006, 4.9999995, 81.8, 5.8999996, 80.9);
((GeneralPath)shape).curveTo(6.7999997, 80.0, 7.8999996, 79.5, 9.299999, 79.5);
((GeneralPath)shape).curveTo(10.499999, 79.5, 11.499999, 79.9, 12.299999, 80.6);
((GeneralPath)shape).curveTo(12.799999, 81.0, 13.099999, 81.6, 13.299999, 82.4);
((GeneralPath)shape).lineTo(11.299999, 82.9);
((GeneralPath)shape).curveTo(11.199999, 82.4, 10.9, 82.0, 10.599999, 81.700005);
((GeneralPath)shape).curveTo(10.299999, 81.40001, 9.799999, 81.200005, 9.2, 81.200005);
((GeneralPath)shape).curveTo(8.5, 81.200005, 7.8999996, 81.50001, 7.3999996, 82.00001);
((GeneralPath)shape).curveTo(6.8999996, 82.50001, 6.7, 83.40001, 6.7, 84.600006);
((GeneralPath)shape).curveTo(6.7, 85.90001, 6.8999996, 86.8, 7.3999996, 87.3);
((GeneralPath)shape).curveTo(7.8999996, 87.8, 8.4, 88.100006, 9.2, 88.100006);
((GeneralPath)shape).curveTo(9.7, 88.100006, 10.2, 87.90001, 10.599999, 87.600006);
((GeneralPath)shape).curveTo(10.999999, 87.3, 11.2, 86.8, 11.4, 86.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(14.7, 84.9);
((GeneralPath)shape).curveTo(14.7, 83.9, 14.9, 83.0, 15.2, 82.3);
((GeneralPath)shape).curveTo(15.4, 81.8, 15.7, 81.3, 16.1, 80.9);
((GeneralPath)shape).curveTo(16.5, 80.5, 16.9, 80.200005, 17.4, 80.0);
((GeneralPath)shape).curveTo(18.0, 79.7, 18.699999, 79.6, 19.6, 79.6);
((GeneralPath)shape).curveTo(21.1, 79.6, 22.300001, 80.1, 23.1, 81.0);
((GeneralPath)shape).curveTo(23.9, 81.9, 24.4, 83.2, 24.4, 84.8);
((GeneralPath)shape).curveTo(24.4, 86.4, 24.0, 87.700005, 23.1, 88.600006);
((GeneralPath)shape).curveTo(22.2, 89.50001, 21.0, 90.0, 19.5, 90.0);
((GeneralPath)shape).curveTo(18.0, 90.0, 16.8, 89.5, 15.9, 88.6);
((GeneralPath)shape).curveTo(15.099999, 87.7, 14.7, 86.4, 14.7, 84.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(16.7, 84.8);
((GeneralPath)shape).curveTo(16.7, 85.9, 17.0, 86.8, 17.5, 87.4);
((GeneralPath)shape).curveTo(18.0, 88.0, 18.7, 88.3, 19.5, 88.3);
((GeneralPath)shape).curveTo(20.3, 88.3, 21.0, 88.0, 21.5, 87.4);
((GeneralPath)shape).curveTo(22.0, 86.8, 22.3, 85.9, 22.3, 84.8);
((GeneralPath)shape).curveTo(22.3, 83.700005, 22.0, 82.8, 21.5, 82.200005);
((GeneralPath)shape).curveTo(21.0, 81.600006, 20.3, 81.4, 19.5, 81.4);
((GeneralPath)shape).curveTo(18.7, 81.4, 18.0, 81.700005, 17.5, 82.3);
((GeneralPath)shape).curveTo(17.0, 82.8, 16.7, 83.600006, 16.7, 84.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(25.900002, 89.8);
((GeneralPath)shape).lineTo(25.900002, 79.8);
((GeneralPath)shape).lineTo(28.900002, 79.8);
((GeneralPath)shape).lineTo(30.7, 86.600006);
((GeneralPath)shape).lineTo(32.5, 79.8);
((GeneralPath)shape).lineTo(35.5, 79.8);
((GeneralPath)shape).lineTo(35.5, 89.8);
((GeneralPath)shape).lineTo(33.6, 89.8);
((GeneralPath)shape).lineTo(33.6, 81.9);
((GeneralPath)shape).lineTo(31.599998, 89.8);
((GeneralPath)shape).lineTo(29.699999, 89.8);
((GeneralPath)shape).lineTo(27.699999, 81.9);
((GeneralPath)shape).lineTo(27.699999, 89.8);
((GeneralPath)shape).lineTo(25.9, 89.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.600002, 89.8);
((GeneralPath)shape).lineTo(37.600002, 79.8);
((GeneralPath)shape).lineTo(40.800003, 79.8);
((GeneralPath)shape).curveTo(42.000004, 79.8, 42.800003, 79.8, 43.200005, 80.0);
((GeneralPath)shape).curveTo(43.800003, 80.2, 44.300003, 80.5, 44.600006, 81.0);
((GeneralPath)shape).curveTo(45.000008, 81.5, 45.200005, 82.2, 45.200005, 83.0);
((GeneralPath)shape).curveTo(45.200005, 83.6, 45.100006, 84.1, 44.900005, 84.6);
((GeneralPath)shape).curveTo(44.700005, 85.0, 44.400005, 85.299995, 44.000004, 85.6);
((GeneralPath)shape).curveTo(43.700005, 85.799995, 43.300003, 86.0, 43.000004, 86.1);
((GeneralPath)shape).curveTo(42.600002, 86.0, 41.900005, 86.0, 41.000004, 86.0);
((GeneralPath)shape).lineTo(39.700005, 86.0);
((GeneralPath)shape).lineTo(39.700005, 89.8);
((GeneralPath)shape).lineTo(37.600006, 89.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(39.600002, 81.5);
((GeneralPath)shape).lineTo(39.600002, 84.3);
((GeneralPath)shape).lineTo(40.7, 84.3);
((GeneralPath)shape).curveTo(41.5, 84.3, 42.0, 84.200005, 42.3, 84.100006);
((GeneralPath)shape).curveTo(42.6, 84.00001, 42.8, 83.8, 42.899998, 83.600006);
((GeneralPath)shape).curveTo(43.1, 83.40001, 43.1, 83.100006, 43.1, 82.8);
((GeneralPath)shape).curveTo(43.1, 82.4, 43.0, 82.100006, 42.8, 81.9);
((GeneralPath)shape).curveTo(42.6, 81.700005, 42.3, 81.5, 42.0, 81.5);
((GeneralPath)shape).curveTo(41.8, 81.5, 41.3, 81.4, 40.5, 81.4);
((GeneralPath)shape).lineTo(39.6, 81.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.9, 89.8);
((GeneralPath)shape).lineTo(46.9, 79.8);
((GeneralPath)shape).lineTo(48.9, 79.8);
((GeneralPath)shape).lineTo(48.9, 89.8);
((GeneralPath)shape).lineTo(46.9, 89.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.9, 89.8);
((GeneralPath)shape).lineTo(50.9, 79.9);
((GeneralPath)shape).lineTo(52.9, 79.9);
((GeneralPath)shape).lineTo(52.9, 88.200005);
((GeneralPath)shape).lineTo(57.9, 88.200005);
((GeneralPath)shape).lineTo(57.9, 89.9);
((GeneralPath)shape).lineTo(50.9, 89.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(59.4, 89.8);
((GeneralPath)shape).lineTo(59.4, 79.8);
((GeneralPath)shape).lineTo(66.8, 79.8);
((GeneralPath)shape).lineTo(66.8, 81.5);
((GeneralPath)shape).lineTo(61.4, 81.5);
((GeneralPath)shape).lineTo(61.4, 83.7);
((GeneralPath)shape).lineTo(66.4, 83.7);
((GeneralPath)shape).lineTo(66.4, 85.399994);
((GeneralPath)shape).lineTo(61.4, 85.399994);
((GeneralPath)shape).lineTo(61.4, 88.09999);
((GeneralPath)shape).lineTo(67.0, 88.09999);
((GeneralPath)shape).lineTo(67.0, 89.79999);
((GeneralPath)shape).lineTo(59.4, 89.79999);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(52.5, 64.4);
((GeneralPath)shape).lineTo(52.5, 41.0);
((GeneralPath)shape).lineTo(57.2, 41.0);
((GeneralPath)shape).lineTo(57.2, 69.2);
((GeneralPath)shape).lineTo(14.9, 69.2);
((GeneralPath)shape).lineTo(14.9, 41.0);
((GeneralPath)shape).lineTo(19.599998, 41.0);
((GeneralPath)shape).lineTo(19.599998, 64.4);
((GeneralPath)shape).lineTo(52.5, 64.4);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 69.1259994506836), new Point2D.Double(36.0, 40.96500015258789), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(24.4, 29.1);
((GeneralPath)shape).lineTo(47.4, 29.1);
((GeneralPath)shape).lineTo(35.9, 40.6);
((GeneralPath)shape).lineTo(24.4, 29.1);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.915000915527344, 40.62699890136719), new Point2D.Double(35.915000915527344, 29.125999450683594), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.0, 50.3);
((GeneralPath)shape).lineTo(29.0, 45.6);
((GeneralPath)shape).lineTo(33.7, 45.6);
((GeneralPath)shape).lineTo(33.7, 50.3);
((GeneralPath)shape).lineTo(29.0, 50.3);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(31.30699920654297, 50.268001556396484), new Point2D.Double(31.30699920654297, 45.617000579833984), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
shape = new GeneralPath();
((GeneralPath)shape).moveTo(43.0, 50.3);
((GeneralPath)shape).lineTo(38.3, 50.3);
((GeneralPath)shape).lineTo(38.3, 45.6);
((GeneralPath)shape).lineTo(43.0, 45.6);
((GeneralPath)shape).lineTo(43.0, 50.3);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(40.69300079345703, 50.268001556396484), new Point2D.Double(40.69300079345703, 45.617000579833984), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
shape = new GeneralPath();
((GeneralPath)shape).moveTo(24.2, 55.0);
((GeneralPath)shape).lineTo(28.900002, 55.0);
((GeneralPath)shape).lineTo(28.900002, 59.7);
((GeneralPath)shape).lineTo(24.2, 59.7);
((GeneralPath)shape).lineTo(24.2, 55.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(26.570999145507812, 59.654998779296875), new Point2D.Double(26.570999145507812, 55.00400161743164), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
shape = new GeneralPath();
((GeneralPath)shape).moveTo(43.1, 59.7);
((GeneralPath)shape).lineTo(43.1, 55.0);
((GeneralPath)shape).lineTo(47.8, 55.0);
((GeneralPath)shape).lineTo(47.8, 59.7);
((GeneralPath)shape).lineTo(43.1, 59.7);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.42900085449219, 59.654998779296875), new Point2D.Double(45.42900085449219, 55.00400161743164), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_11
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.3, 55.0);
((GeneralPath)shape).lineTo(38.3, 59.7);
((GeneralPath)shape).lineTo(33.6, 59.7);
((GeneralPath)shape).lineTo(33.6, 55.0);
((GeneralPath)shape).lineTo(38.3, 55.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(35.95800018310547, 59.654998779296875), new Point2D.Double(35.95800018310547, 55.00400161743164), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
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
		return 0.9980000257492065;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_compile() {
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
       ext_compile base = new ext_compile();
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
       ext_compile base = new ext_compile();
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
        return ext_compile::new;
    }
}

