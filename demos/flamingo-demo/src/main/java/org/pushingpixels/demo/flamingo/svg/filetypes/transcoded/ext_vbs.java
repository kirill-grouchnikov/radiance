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
public class ext_vbs implements ResizableIcon {
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
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.0), new Point2D.Double(36.0, 101.0), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
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
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.0369987487793, 74.18699645996094), new Point2D.Double(58.5369987487793, 87.68699645996094), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
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
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(18.0, 91.9);
((GeneralPath)shape).lineTo(11.9, 74.7);
((GeneralPath)shape).lineTo(15.7, 74.7);
((GeneralPath)shape).lineTo(20.0, 87.4);
((GeneralPath)shape).lineTo(24.2, 74.700005);
((GeneralPath)shape).lineTo(27.900002, 74.700005);
((GeneralPath)shape).lineTo(21.7, 91.90001);
((GeneralPath)shape).lineTo(18.0, 91.90001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.7, 74.7);
((GeneralPath)shape).lineTo(36.600002, 74.7);
((GeneralPath)shape).curveTo(38.000004, 74.7, 39.000004, 74.799995, 39.600002, 74.899994);
((GeneralPath)shape).curveTo(40.2, 74.99999, 40.9, 75.2, 41.4, 75.59999);
((GeneralPath)shape).curveTo(41.9, 75.999985, 42.4, 76.399994, 42.7, 76.99999);
((GeneralPath)shape).curveTo(43.0, 77.59999, 43.2, 78.299995, 43.2, 78.99999);
((GeneralPath)shape).curveTo(43.2, 79.799995, 43.0, 80.49999, 42.5, 81.19999);
((GeneralPath)shape).curveTo(42.0, 81.89999, 41.5, 82.39999, 40.7, 82.69999);
((GeneralPath)shape).curveTo(41.7, 82.99999, 42.600002, 83.49999, 43.100002, 84.29999);
((GeneralPath)shape).curveTo(43.600002, 85.09998, 43.9, 85.89999, 43.9, 86.89999);
((GeneralPath)shape).curveTo(43.9, 87.69999, 43.7, 88.39999, 43.4, 89.19999);
((GeneralPath)shape).curveTo(43.100002, 89.99999, 42.7, 90.49999, 42.0, 90.99999);
((GeneralPath)shape).curveTo(41.3, 91.49999, 40.6, 91.69999, 39.7, 91.799995);
((GeneralPath)shape).curveTo(39.100002, 91.899994, 37.7, 91.899994, 35.5, 91.899994);
((GeneralPath)shape).lineTo(29.7, 91.899994);
((GeneralPath)shape).lineTo(29.7, 74.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.2, 77.6);
((GeneralPath)shape).lineTo(33.2, 81.6);
((GeneralPath)shape).lineTo(35.5, 81.6);
((GeneralPath)shape).curveTo(36.9, 81.6, 37.7, 81.6, 38.0, 81.5);
((GeneralPath)shape).curveTo(38.6, 81.4, 39.1, 81.2, 39.4, 80.9);
((GeneralPath)shape).curveTo(39.700005, 80.600006, 39.9, 80.1, 39.9, 79.6);
((GeneralPath)shape).curveTo(39.9, 79.1, 39.800003, 78.6, 39.5, 78.299995);
((GeneralPath)shape).curveTo(39.199997, 77.99999, 38.8, 77.799995, 38.2, 77.7);
((GeneralPath)shape).curveTo(37.9, 77.7, 36.9, 77.6, 35.2, 77.6);
((GeneralPath)shape).lineTo(33.2, 77.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(33.2, 84.4);
((GeneralPath)shape).lineTo(33.2, 89.0);
((GeneralPath)shape).lineTo(36.4, 89.0);
((GeneralPath)shape).curveTo(37.600002, 89.0, 38.4, 89.0, 38.800003, 88.9);
((GeneralPath)shape).curveTo(39.300003, 88.8, 39.700005, 88.6, 40.100002, 88.200005);
((GeneralPath)shape).curveTo(40.5, 87.80001, 40.600002, 87.4, 40.600002, 86.700005);
((GeneralPath)shape).curveTo(40.600002, 86.200005, 40.500004, 85.700005, 40.2, 85.4);
((GeneralPath)shape).curveTo(39.899998, 85.1, 39.600002, 84.8, 39.100002, 84.6);
((GeneralPath)shape).curveTo(38.600002, 84.399994, 37.600002, 84.4, 36.000004, 84.4);
((GeneralPath)shape).lineTo(33.200005, 84.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.1, 86.3);
((GeneralPath)shape).lineTo(49.5, 86.0);
((GeneralPath)shape).curveTo(49.7, 87.1, 50.1, 88.0, 50.7, 88.5);
((GeneralPath)shape).curveTo(51.300003, 89.0, 52.2, 89.3, 53.2, 89.3);
((GeneralPath)shape).curveTo(54.3, 89.3, 55.2, 89.100006, 55.7, 88.600006);
((GeneralPath)shape).curveTo(56.2, 88.100006, 56.5, 87.600006, 56.5, 86.90001);
((GeneralPath)shape).curveTo(56.5, 86.50001, 56.4, 86.100006, 56.1, 85.90001);
((GeneralPath)shape).curveTo(55.799995, 85.70001, 55.399998, 85.40001, 54.899998, 85.20001);
((GeneralPath)shape).curveTo(54.499996, 85.10001, 53.6, 84.80001, 52.1, 84.40001);
((GeneralPath)shape).curveTo(50.199997, 83.90001, 48.899998, 83.40001, 48.199997, 82.70001);
((GeneralPath)shape).curveTo(47.1, 81.80001, 46.6, 80.60001, 46.6, 79.20001);
((GeneralPath)shape).curveTo(46.6, 78.30001, 46.8, 77.500015, 47.3, 76.70001);
((GeneralPath)shape).curveTo(47.8, 75.90001, 48.5, 75.40001, 49.399998, 75.000015);
((GeneralPath)shape).curveTo(50.299995, 74.60002, 51.499996, 74.40002, 52.8, 74.40002);
((GeneralPath)shape).curveTo(55.0, 74.40002, 56.6, 74.90002, 57.7, 75.80002);
((GeneralPath)shape).curveTo(58.800003, 76.70002, 59.4, 78.000015, 59.4, 79.60002);
((GeneralPath)shape).lineTo(55.9, 79.80002);
((GeneralPath)shape).curveTo(55.800003, 78.90002, 55.4, 78.30002, 54.9, 77.90002);
((GeneralPath)shape).curveTo(54.4, 77.500015, 54.0, 77.30002, 53.0, 77.30002);
((GeneralPath)shape).curveTo(52.0, 77.30002, 51.2, 77.500015, 50.6, 77.90002);
((GeneralPath)shape).curveTo(50.199997, 78.20002, 50.0, 78.500015, 50.0, 79.000015);
((GeneralPath)shape).curveTo(50.0, 79.40002, 50.2, 79.80002, 50.5, 80.000015);
((GeneralPath)shape).curveTo(50.9, 80.40002, 52.0, 80.80002, 53.7, 81.10001);
((GeneralPath)shape).curveTo(55.4, 81.40001, 56.600002, 81.90002, 57.4, 82.30001);
((GeneralPath)shape).curveTo(58.2, 82.700005, 58.800003, 83.30001, 59.300003, 84.00001);
((GeneralPath)shape).curveTo(59.800003, 84.700005, 60.000004, 85.700005, 60.000004, 86.700005);
((GeneralPath)shape).curveTo(60.000004, 87.700005, 59.700005, 88.600006, 59.200005, 89.50001);
((GeneralPath)shape).curveTo(58.700005, 90.40001, 58.000004, 91.100006, 57.000004, 91.600006);
((GeneralPath)shape).curveTo(56.000004, 92.100006, 54.800003, 92.200005, 53.300003, 92.200005);
((GeneralPath)shape).curveTo(51.100002, 92.200005, 49.500004, 91.700005, 48.300003, 90.700005);
((GeneralPath)shape).curveTo(47.100002, 89.700005, 46.4, 88.200005, 46.100002, 86.3);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.1, 33.6);
((GeneralPath)shape).lineTo(15.1, 35.0);
((GeneralPath)shape).lineTo(13.5, 35.6);
((GeneralPath)shape).lineTo(13.5, 34.199997);
((GeneralPath)shape).lineTo(15.1, 33.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.1, 46.8);
((GeneralPath)shape).lineTo(15.1, 48.2);
((GeneralPath)shape).lineTo(13.5, 48.8);
((GeneralPath)shape).lineTo(13.5, 47.399998);
((GeneralPath)shape).lineTo(15.1, 46.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.1, 60.3);
((GeneralPath)shape).lineTo(15.1, 61.7);
((GeneralPath)shape).lineTo(13.5, 62.3);
((GeneralPath)shape).lineTo(13.5, 60.899998);
((GeneralPath)shape).lineTo(15.1, 60.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.0, 38.0);
((GeneralPath)shape).lineTo(15.0, 39.3);
((GeneralPath)shape).lineTo(13.7, 39.899998);
((GeneralPath)shape).lineTo(13.7, 38.6);
((GeneralPath)shape).lineTo(15.0, 38.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.0, 42.4);
((GeneralPath)shape).lineTo(15.0, 43.7);
((GeneralPath)shape).lineTo(13.7, 44.3);
((GeneralPath)shape).lineTo(13.7, 43.0);
((GeneralPath)shape).lineTo(15.0, 42.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.0, 51.4);
((GeneralPath)shape).lineTo(15.0, 52.5);
((GeneralPath)shape).lineTo(13.6, 53.1);
((GeneralPath)shape).lineTo(13.6, 51.8);
((GeneralPath)shape).curveTo(13.700001, 51.899998, 15.0, 51.399998, 15.0, 51.399998);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.0, 55.9);
((GeneralPath)shape).lineTo(15.0, 57.2);
((GeneralPath)shape).lineTo(13.7, 57.8);
((GeneralPath)shape).lineTo(13.7, 56.7);
((GeneralPath)shape).lineTo(15.0, 55.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.2, 34.300003);
((GeneralPath)shape).lineTo(19.2, 35.9);
((GeneralPath)shape).lineTo(17.0, 36.7);
((GeneralPath)shape).lineTo(17.0, 35.100002);
((GeneralPath)shape).lineTo(19.2, 34.300003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.2, 47.800003);
((GeneralPath)shape).lineTo(19.2, 49.4);
((GeneralPath)shape).lineTo(17.0, 50.2);
((GeneralPath)shape).lineTo(17.0, 48.600002);
((GeneralPath)shape).lineTo(19.2, 47.800003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.2, 61.200005);
((GeneralPath)shape).lineTo(19.2, 62.800003);
((GeneralPath)shape).lineTo(17.0, 63.600002);
((GeneralPath)shape).lineTo(17.0, 62.0);
((GeneralPath)shape).lineTo(19.2, 61.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.1, 38.900005);
((GeneralPath)shape).lineTo(19.1, 40.400005);
((GeneralPath)shape).lineTo(17.300001, 41.000004);
((GeneralPath)shape).lineTo(17.300001, 39.600002);
((GeneralPath)shape).lineTo(19.1, 38.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.1, 43.400005);
((GeneralPath)shape).lineTo(19.1, 44.900005);
((GeneralPath)shape).lineTo(17.300001, 45.500004);
((GeneralPath)shape).lineTo(17.300001, 44.0);
((GeneralPath)shape).lineTo(19.1, 43.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.1, 52.400005);
((GeneralPath)shape).lineTo(19.1, 53.900005);
((GeneralPath)shape).lineTo(17.300001, 54.600006);
((GeneralPath)shape).lineTo(17.300001, 53.100006);
((GeneralPath)shape).lineTo(19.1, 52.400005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.1, 57.000004);
((GeneralPath)shape).lineTo(19.1, 58.500004);
((GeneralPath)shape).lineTo(17.300001, 59.200005);
((GeneralPath)shape).lineTo(17.300001, 57.700005);
((GeneralPath)shape).lineTo(19.1, 57.000004);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.3, 35.300003);
((GeneralPath)shape).lineTo(23.3, 37.200005);
((GeneralPath)shape).lineTo(20.5, 38.200005);
((GeneralPath)shape).lineTo(20.5, 36.300003);
((GeneralPath)shape).lineTo(23.3, 35.300003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.3, 48.700005);
((GeneralPath)shape).lineTo(23.3, 50.600006);
((GeneralPath)shape).lineTo(20.5, 51.600006);
((GeneralPath)shape).lineTo(20.5, 49.700005);
((GeneralPath)shape).lineTo(23.3, 48.700005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.3, 62.100006);
((GeneralPath)shape).lineTo(23.3, 64.0);
((GeneralPath)shape).lineTo(20.5, 65.1);
((GeneralPath)shape).lineTo(20.5, 63.199997);
((GeneralPath)shape).lineTo(23.3, 62.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.199999, 39.900005);
((GeneralPath)shape).lineTo(23.199999, 41.600006);
((GeneralPath)shape).lineTo(20.8, 42.500008);
((GeneralPath)shape).lineTo(20.8, 40.800007);
((GeneralPath)shape).lineTo(23.199999, 39.900005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.199999, 44.400005);
((GeneralPath)shape).lineTo(23.199999, 46.100006);
((GeneralPath)shape).lineTo(20.8, 47.000008);
((GeneralPath)shape).lineTo(20.8, 45.300007);
((GeneralPath)shape).lineTo(23.199999, 44.400005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.199999, 53.400005);
((GeneralPath)shape).lineTo(23.199999, 55.100006);
((GeneralPath)shape).lineTo(20.8, 56.000008);
((GeneralPath)shape).lineTo(20.8, 54.300007);
((GeneralPath)shape).lineTo(23.199999, 53.400005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.199999, 57.800007);
((GeneralPath)shape).lineTo(23.199999, 59.500008);
((GeneralPath)shape).lineTo(20.8, 60.40001);
((GeneralPath)shape).lineTo(20.8, 58.70001);
((GeneralPath)shape).lineTo(23.199999, 57.800007);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.599998, 35.100006);
((GeneralPath)shape).lineTo(27.599998, 37.600006);
((GeneralPath)shape).lineTo(24.2, 39.0);
((GeneralPath)shape).lineTo(24.2, 36.5);
((GeneralPath)shape).lineTo(27.6, 35.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.599998, 48.600006);
((GeneralPath)shape).lineTo(27.599998, 51.100006);
((GeneralPath)shape).lineTo(24.199999, 52.500008);
((GeneralPath)shape).lineTo(24.199999, 50.100006);
((GeneralPath)shape).lineTo(27.599998, 48.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.599998, 62.000008);
((GeneralPath)shape).lineTo(27.599998, 64.50001);
((GeneralPath)shape).lineTo(24.199999, 65.90001);
((GeneralPath)shape).lineTo(24.199999, 63.40001);
((GeneralPath)shape).lineTo(27.599998, 62.000008);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.499998, 39.800007);
((GeneralPath)shape).lineTo(27.499998, 42.100006);
((GeneralPath)shape).lineTo(24.599998, 43.200005);
((GeneralPath)shape).lineTo(24.599998, 41.0);
((GeneralPath)shape).lineTo(27.499998, 39.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.499998, 44.300007);
((GeneralPath)shape).lineTo(27.499998, 46.600006);
((GeneralPath)shape).lineTo(24.599998, 47.700005);
((GeneralPath)shape).lineTo(24.599998, 45.400005);
((GeneralPath)shape).lineTo(27.499998, 44.300007);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.499998, 53.300007);
((GeneralPath)shape).lineTo(27.499998, 55.600006);
((GeneralPath)shape).lineTo(24.599998, 56.700005);
((GeneralPath)shape).lineTo(24.599998, 54.400005);
((GeneralPath)shape).lineTo(27.499998, 53.300007);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.499998, 57.70001);
((GeneralPath)shape).lineTo(27.499998, 60.0);
((GeneralPath)shape).lineTo(24.599998, 61.1);
((GeneralPath)shape).lineTo(24.599998, 58.8);
((GeneralPath)shape).lineTo(27.499998, 57.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.199997, 34.70001);
((GeneralPath)shape).lineTo(32.199997, 38.0);
((GeneralPath)shape).lineTo(28.299997, 39.7);
((GeneralPath)shape).lineTo(28.299997, 36.5);
((GeneralPath)shape).curveTo(28.399998, 36.4, 32.199997, 34.7, 32.199997, 34.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.199997, 48.20001);
((GeneralPath)shape).lineTo(32.199997, 51.40001);
((GeneralPath)shape).lineTo(28.4, 53.0);
((GeneralPath)shape).lineTo(28.4, 49.8);
((GeneralPath)shape).lineTo(32.2, 48.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.199997, 61.600006);
((GeneralPath)shape).lineTo(32.199997, 64.8);
((GeneralPath)shape).lineTo(28.299997, 66.4);
((GeneralPath)shape).lineTo(28.299997, 63.2);
((GeneralPath)shape).curveTo(28.399998, 63.100002, 32.199997, 61.600002, 32.199997, 61.600002);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.1, 39.700005);
((GeneralPath)shape).lineTo(32.1, 42.400005);
((GeneralPath)shape).lineTo(28.8, 43.800007);
((GeneralPath)shape).lineTo(28.8, 41.100006);
((GeneralPath)shape).lineTo(32.1, 39.700005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.1, 44.000004);
((GeneralPath)shape).lineTo(32.1, 46.700005);
((GeneralPath)shape).lineTo(28.8, 48.0);
((GeneralPath)shape).lineTo(28.8, 45.3);
((GeneralPath)shape).lineTo(32.1, 44.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.1, 53.100006);
((GeneralPath)shape).lineTo(32.1, 55.900005);
((GeneralPath)shape).lineTo(28.8, 57.200005);
((GeneralPath)shape).lineTo(28.8, 54.500004);
((GeneralPath)shape).lineTo(32.1, 53.100002);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.1, 57.500008);
((GeneralPath)shape).lineTo(32.1, 60.20001);
((GeneralPath)shape).lineTo(28.8, 61.60001);
((GeneralPath)shape).lineTo(28.8, 58.90001);
((GeneralPath)shape).curveTo(28.8, 58.80001, 32.1, 57.500008, 32.1, 57.500008);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.0, 33.2);
((GeneralPath)shape).lineTo(37.0, 37.7);
((GeneralPath)shape).lineTo(32.8, 39.4);
((GeneralPath)shape).lineTo(32.8, 35.2);
((GeneralPath)shape).curveTo(34.3, 34.3, 35.7, 33.7, 37.0, 33.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.0, 38.100002);
((GeneralPath)shape).lineTo(37.0, 42.0);
((GeneralPath)shape).lineTo(32.8, 43.8);
((GeneralPath)shape).lineTo(32.8, 39.899998);
((GeneralPath)shape).lineTo(37.0, 38.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.0, 42.4);
((GeneralPath)shape).lineTo(37.0, 46.4);
((GeneralPath)shape).lineTo(32.8, 48.2);
((GeneralPath)shape).lineTo(32.8, 44.2);
((GeneralPath)shape).lineTo(37.0, 42.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.0, 46.800003);
((GeneralPath)shape).lineTo(37.0, 50.700005);
((GeneralPath)shape).lineTo(32.8, 52.500004);
((GeneralPath)shape).lineTo(32.8, 48.600002);
((GeneralPath)shape).lineTo(37.0, 46.800003);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.0, 51.200005);
((GeneralPath)shape).lineTo(37.0, 55.200005);
((GeneralPath)shape).lineTo(32.9, 57.0);
((GeneralPath)shape).lineTo(32.9, 53.0);
((GeneralPath)shape).lineTo(37.0, 51.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.0, 55.700005);
((GeneralPath)shape).lineTo(37.0, 59.600006);
((GeneralPath)shape).lineTo(32.8, 61.400005);
((GeneralPath)shape).lineTo(32.8, 57.400005);
((GeneralPath)shape).lineTo(37.0, 55.700005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.0, 60.100006);
((GeneralPath)shape).lineTo(37.0, 64.3);
((GeneralPath)shape).curveTo(35.3, 64.9, 34.0, 65.600006, 32.8, 66.100006);
((GeneralPath)shape).lineTo(32.8, 61.900005);
((GeneralPath)shape).lineTo(37.0, 60.100006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(58.4, 33.300007);
((GeneralPath)shape).lineTo(58.4, 64.700005);
((GeneralPath)shape).curveTo(55.800003, 62.900005, 52.4, 62.100006, 48.5, 62.100006);
((GeneralPath)shape).curveTo(45.2, 62.100006, 41.5, 62.700005, 37.4, 64.100006);
((GeneralPath)shape).lineTo(37.4, 59.800007);
((GeneralPath)shape).curveTo(39.600002, 59.000008, 41.9, 58.300007, 44.5, 58.000008);
((GeneralPath)shape).lineTo(44.5, 47.8);
((GeneralPath)shape).curveTo(42.3, 48.1, 39.9, 48.8, 37.4, 50.1);
((GeneralPath)shape).lineTo(37.4, 47.199997);
((GeneralPath)shape).curveTo(39.600002, 46.199997, 42.0, 45.399998, 44.5, 45.1);
((GeneralPath)shape).lineTo(44.5, 35.0);
((GeneralPath)shape).curveTo(42.2, 35.4, 39.8, 36.3, 37.4, 37.3);
((GeneralPath)shape).lineTo(37.4, 32.899998);
((GeneralPath)shape).curveTo(41.100002, 31.299997, 44.600002, 30.599998, 48.0, 30.599998);
((GeneralPath)shape).curveTo(51.9, 30.599998, 55.3, 31.499998, 58.4, 33.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.3, 36.0);
((GeneralPath)shape).curveTo(52.6, 35.2, 50.5, 34.7, 48.1, 34.7);
((GeneralPath)shape).lineTo(47.3, 34.7);
((GeneralPath)shape).lineTo(47.3, 44.800003);
((GeneralPath)shape).lineTo(48.2, 44.800003);
((GeneralPath)shape).curveTo(50.3, 44.800003, 52.3, 45.100002, 54.3, 45.700005);
((GeneralPath)shape).lineTo(54.3, 36.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.3, 48.7);
((GeneralPath)shape).curveTo(52.5, 47.9, 50.399998, 47.4, 48.2, 47.4);
((GeneralPath)shape).lineTo(47.4, 47.4);
((GeneralPath)shape).lineTo(47.4, 57.600002);
((GeneralPath)shape).lineTo(48.300003, 57.600002);
((GeneralPath)shape).curveTo(50.500004, 57.600002, 52.600002, 57.9, 54.4, 58.4);
((GeneralPath)shape).lineTo(54.4, 48.600002);
((GeneralPath)shape).lineTo(54.300003, 48.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(57.0, 65.9);
((GeneralPath)shape).lineTo(57.0, 65.3);
((GeneralPath)shape).lineTo(56.7, 65.3);
((GeneralPath)shape).lineTo(56.7, 65.200005);
((GeneralPath)shape).lineTo(57.3, 65.200005);
((GeneralPath)shape).lineTo(57.3, 65.3);
((GeneralPath)shape).lineTo(57.0, 65.3);
((GeneralPath)shape).lineTo(57.0, 65.9);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(57.5, 65.9);
((GeneralPath)shape).lineTo(57.5, 65.1);
((GeneralPath)shape).lineTo(57.7, 65.1);
((GeneralPath)shape).lineTo(58.0, 65.7);
((GeneralPath)shape).lineTo(58.3, 65.1);
((GeneralPath)shape).lineTo(58.5, 65.1);
((GeneralPath)shape).lineTo(58.5, 65.9);
((GeneralPath)shape).lineTo(58.4, 65.9);
((GeneralPath)shape).lineTo(58.4, 65.3);
((GeneralPath)shape).lineTo(58.100002, 65.9);
((GeneralPath)shape).lineTo(57.9, 65.9);
((GeneralPath)shape).lineTo(57.600002, 65.3);
((GeneralPath)shape).lineTo(57.600002, 65.9);
((GeneralPath)shape).lineTo(57.500004, 65.9);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.04999923706055, 33.59600067138672), new Point2D.Double(36.04999923706055, 69.37899780273438), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 100.0f));
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
	private ext_vbs() {
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
       ext_vbs base = new ext_vbs();
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
       ext_vbs base = new ext_vbs();
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
        return ext_vbs::new;
    }
}

