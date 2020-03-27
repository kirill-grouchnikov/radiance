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
public class ext_3g2 implements ResizableIcon {
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
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(72.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.20000076293945, 101.0), new Point2D.Double(36.20000076293945, 3.005000114440918), new float[] {0.0f,0.17f,0.313f,0.447f,0.575f,0.698f,0.819f,0.934f,1.0f}, new Color[] {new Color(226, 205, 228, 255),new Color(224, 202, 226, 255),new Color(219, 192, 221, 255),new Color(210, 177, 212, 255),new Color(199, 157, 199, 255),new Color(186, 132, 185, 255),new Color(171, 104, 169, 255),new Color(156, 69, 152, 255),new Color(147, 42, 142, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(72.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.2, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(136, 35, 131, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(72.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
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
((GeneralPath)shape).moveTo(11.3, 85.8);
((GeneralPath)shape).lineTo(15.0, 85.4);
((GeneralPath)shape).curveTo(15.1, 86.3, 15.4, 87.1, 16.0, 87.6);
((GeneralPath)shape).curveTo(16.5, 88.1, 17.1, 88.299995, 17.9, 88.299995);
((GeneralPath)shape).curveTo(18.699999, 88.299995, 19.4, 87.99999, 19.9, 87.399994);
((GeneralPath)shape).curveTo(20.4, 86.799995, 20.699999, 85.99999, 20.699999, 84.99999);
((GeneralPath)shape).curveTo(20.699999, 83.99999, 20.4, 83.299995, 19.9, 82.69999);
((GeneralPath)shape).curveTo(19.4, 82.09998, 18.699999, 81.89999, 18.0, 81.89999);
((GeneralPath)shape).curveTo(17.5, 81.89999, 16.9, 81.999985, 16.2, 82.19999);
((GeneralPath)shape).lineTo(16.6, 79.09999);
((GeneralPath)shape).curveTo(17.6, 79.09999, 18.4, 78.899994, 19.0, 78.399994);
((GeneralPath)shape).curveTo(19.6, 77.899994, 19.8, 77.299995, 19.8, 76.49999);
((GeneralPath)shape).curveTo(19.8, 75.799995, 19.599998, 75.299995, 19.199999, 74.899994);
((GeneralPath)shape).curveTo(18.8, 74.49999, 18.3, 74.299995, 17.599998, 74.299995);
((GeneralPath)shape).curveTo(16.899998, 74.299995, 16.399998, 74.49999, 15.899999, 74.99999);
((GeneralPath)shape).curveTo(15.399999, 75.49999, 15.199999, 76.09999, 15.099998, 76.99999);
((GeneralPath)shape).lineTo(11.599998, 76.399994);
((GeneralPath)shape).curveTo(11.799998, 75.2, 12.199999, 74.2, 12.699999, 73.49999);
((GeneralPath)shape).curveTo(13.199999, 72.799995, 13.899999, 72.19999, 14.799999, 71.799995);
((GeneralPath)shape).curveTo(15.7, 71.4, 16.699999, 71.2, 17.8, 71.2);
((GeneralPath)shape).curveTo(19.699999, 71.2, 21.199999, 71.799995, 22.3, 73.0);
((GeneralPath)shape).curveTo(23.199999, 74.0, 23.699999, 75.1, 23.699999, 76.3);
((GeneralPath)shape).curveTo(23.699999, 78.0, 22.699999, 79.4, 20.8, 80.5);
((GeneralPath)shape).curveTo(21.9, 80.7, 22.9, 81.3, 23.599998, 82.1);
((GeneralPath)shape).curveTo(24.3, 82.9, 24.599998, 84.0, 24.599998, 85.2);
((GeneralPath)shape).curveTo(24.599998, 86.899994, 23.999998, 88.399994, 22.699999, 89.7);
((GeneralPath)shape).curveTo(21.4, 90.899994, 19.8, 91.5, 17.899998, 91.5);
((GeneralPath)shape).curveTo(16.099998, 91.5, 14.5999975, 91.0, 13.399998, 90.0);
((GeneralPath)shape).curveTo(12.0999975, 88.8, 11.399998, 87.5, 11.299997, 85.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.1, 83.8);
((GeneralPath)shape).lineTo(37.1, 80.5);
((GeneralPath)shape).lineTo(45.8, 80.5);
((GeneralPath)shape).lineTo(45.8, 88.4);
((GeneralPath)shape).curveTo(45.0, 89.200005, 43.7, 89.9, 42.1, 90.5);
((GeneralPath)shape).curveTo(40.499996, 91.1, 38.899998, 91.4, 37.199997, 91.4);
((GeneralPath)shape).curveTo(35.1, 91.4, 33.299995, 91.0, 31.699997, 90.1);
((GeneralPath)shape).curveTo(30.099998, 89.2, 29.0, 88.0, 28.2, 86.4);
((GeneralPath)shape).curveTo(27.400002, 84.8, 27.0, 83.0, 27.0, 81.1);
((GeneralPath)shape).curveTo(27.0, 79.0, 27.4, 77.2, 28.3, 75.6);
((GeneralPath)shape).curveTo(29.199999, 74.0, 30.5, 72.799995, 32.1, 71.9);
((GeneralPath)shape).curveTo(33.399998, 71.200005, 35.0, 70.9, 36.899998, 70.9);
((GeneralPath)shape).curveTo(39.399998, 70.9, 41.3, 71.4, 42.699997, 72.4);
((GeneralPath)shape).curveTo(44.099995, 73.4, 44.999996, 74.9, 45.399998, 76.700005);
((GeneralPath)shape).lineTo(41.399998, 77.4);
((GeneralPath)shape).curveTo(41.1, 76.4, 40.6, 75.700005, 39.8, 75.1);
((GeneralPath)shape).curveTo(39.0, 74.5, 38.0, 74.299995, 36.899998, 74.299995);
((GeneralPath)shape).curveTo(35.1, 74.299995, 33.699997, 74.899994, 32.699997, 75.99999);
((GeneralPath)shape).curveTo(31.699997, 77.09999, 31.099997, 78.799995, 31.099997, 80.899994);
((GeneralPath)shape).curveTo(31.099997, 83.299995, 31.599997, 84.99999, 32.699997, 86.2);
((GeneralPath)shape).curveTo(33.799995, 87.399994, 35.1, 88.0, 36.899998, 88.0);
((GeneralPath)shape).curveTo(37.699997, 88.0, 38.6, 87.8, 39.399998, 87.5);
((GeneralPath)shape).curveTo(40.3, 87.2, 40.999996, 86.8, 41.6, 86.3);
((GeneralPath)shape).lineTo(41.6, 83.8);
((GeneralPath)shape).lineTo(37.1, 83.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(61.699997, 87.5);
((GeneralPath)shape).lineTo(61.699997, 91.0);
((GeneralPath)shape).lineTo(48.2, 91.0);
((GeneralPath)shape).curveTo(48.3, 89.7, 48.8, 88.4, 49.5, 87.2);
((GeneralPath)shape).curveTo(50.2, 86.0, 51.7, 84.399994, 53.8, 82.399994);
((GeneralPath)shape).curveTo(55.5, 80.799995, 56.6, 79.7, 57.0, 79.2);
((GeneralPath)shape).curveTo(57.5, 78.399994, 57.8, 77.6, 57.8, 76.899994);
((GeneralPath)shape).curveTo(57.8, 76.09999, 57.6, 75.399994, 57.1, 74.899994);
((GeneralPath)shape).curveTo(56.6, 74.399994, 56.0, 74.2, 55.199997, 74.2);
((GeneralPath)shape).curveTo(54.399998, 74.2, 53.799995, 74.399994, 53.299995, 74.899994);
((GeneralPath)shape).curveTo(52.799995, 75.399994, 52.599995, 76.2, 52.499996, 77.299995);
((GeneralPath)shape).lineTo(48.699997, 76.99999);
((GeneralPath)shape).curveTo(48.899998, 74.899994, 49.6, 73.399994, 50.799995, 72.49999);
((GeneralPath)shape).curveTo(51.999992, 71.59999, 53.499996, 71.09999, 55.299995, 71.09999);
((GeneralPath)shape).curveTo(57.299995, 71.09999, 58.799995, 71.59999, 59.999996, 72.69999);
((GeneralPath)shape).curveTo(61.099995, 73.79999, 61.699997, 75.09999, 61.699997, 76.59999);
((GeneralPath)shape).curveTo(61.699997, 77.49999, 61.499996, 78.29999, 61.199997, 79.19999);
((GeneralPath)shape).curveTo(60.899998, 79.99999, 60.399998, 80.89999, 59.699997, 81.69999);
((GeneralPath)shape).curveTo(59.199997, 82.29999, 58.399998, 83.09999, 57.199997, 84.19999);
((GeneralPath)shape).curveTo(55.999996, 85.29999, 55.199997, 85.99999, 54.899998, 86.39999);
((GeneralPath)shape).curveTo(54.6, 86.79999, 54.3, 87.09998, 54.1, 87.499985);
((GeneralPath)shape).lineTo(61.699997, 87.499985);
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
((GeneralPath)shape).moveTo(64.3, 55.5);
((GeneralPath)shape).curveTo(62.600002, 55.3, 60.9, 55.2, 59.200005, 55.2);
((GeneralPath)shape).curveTo(51.900005, 55.100002, 45.900005, 56.8, 40.400005, 58.9);
((GeneralPath)shape).curveTo(34.900005, 61.000004, 29.6, 63.6, 23.3, 64.0);
((GeneralPath)shape).curveTo(19.9, 64.2, 15.999999, 63.4, 14.799999, 61.6);
((GeneralPath)shape).curveTo(13.999999, 60.3, 13.999999, 58.1, 13.799999, 55.899998);
((GeneralPath)shape).curveTo(13.199999, 50.199997, 12.199999, 44.199997, 11.4, 38.6);
((GeneralPath)shape).curveTo(12.2, 37.699997, 13.5, 37.3, 14.799999, 36.899998);
((GeneralPath)shape).curveTo(15.199999, 37.999996, 14.999999, 39.6, 15.4, 40.699997);
((GeneralPath)shape).curveTo(22.5, 41.399998, 29.0, 40.299995, 35.4, 39.199997);
((GeneralPath)shape).curveTo(41.7, 38.1, 47.800003, 36.999996, 54.800003, 36.6);
((GeneralPath)shape).curveTo(58.200005, 36.399998, 61.700005, 36.399998, 65.100006, 36.6);
((GeneralPath)shape).moveTo(55.200005, 51.899998);
((GeneralPath)shape).curveTo(55.700005, 51.699997, 56.300003, 51.6, 57.100006, 51.699997);
((GeneralPath)shape).curveTo(57.300007, 47.999996, 57.400005, 44.399998, 57.400005, 40.499996);
((GeneralPath)shape).curveTo(51.200005, 40.699997, 45.500008, 41.399998, 40.400005, 42.699997);
((GeneralPath)shape).curveTo(40.600006, 46.699997, 40.800007, 50.499996, 40.700005, 54.699997);
((GeneralPath)shape).curveTo(44.700005, 53.6, 48.400005, 52.199997, 53.300003, 51.999996);
((GeneralPath)shape).moveTo(55.300003, 39.899994);
((GeneralPath)shape).lineTo(56.4, 39.899994);
((GeneralPath)shape).curveTo(56.800003, 39.499992, 56.600002, 38.699993, 56.600002, 37.999992);
((GeneralPath)shape).curveTo(55.100002, 37.399994, 54.800003, 38.999992, 55.300003, 39.899994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(59.200005, 39.699993);
((GeneralPath)shape).lineTo(60.700005, 39.699993);
((GeneralPath)shape).lineTo(60.700005, 38.0);
((GeneralPath)shape).lineTo(59.400005, 38.0);
((GeneralPath)shape).curveTo(59.400005, 38.7, 59.000004, 38.9, 59.200005, 39.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(63.200005, 39.699993);
((GeneralPath)shape).curveTo(63.700005, 39.599995, 64.00001, 39.699993, 64.3, 39.899994);
((GeneralPath)shape).curveTo(64.700005, 39.599995, 64.5, 38.699993, 64.5, 37.999992);
((GeneralPath)shape).lineTo(63.2, 37.999992);
((GeneralPath)shape).lineTo(63.2, 39.699993);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(51.700005, 39.999992);
((GeneralPath)shape).lineTo(52.600006, 39.999992);
((GeneralPath)shape).curveTo(53.000008, 39.699993, 52.800007, 38.79999, 52.800007, 38.09999);
((GeneralPath)shape).curveTo(51.400005, 37.69999, 51.20001, 39.29999, 51.70001, 39.999992);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.700005, 40.399994);
((GeneralPath)shape).curveTo(48.400005, 40.599995, 48.500004, 40.099995, 49.200005, 40.199993);
((GeneralPath)shape).lineTo(49.200005, 38.499992);
((GeneralPath)shape).curveTo(47.700005, 38.09999, 47.500004, 39.09999, 47.700005, 40.399994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(44.100006, 39.299995);
((GeneralPath)shape).curveTo(44.100006, 39.899994, 44.000008, 40.699997, 44.300007, 40.999996);
((GeneralPath)shape).curveTo(44.800007, 41.099995, 44.800007, 40.599995, 45.400005, 40.799995);
((GeneralPath)shape).curveTo(45.200005, 40.199997, 45.900005, 38.799995, 45.000004, 38.899994);
((GeneralPath)shape).curveTo(44.900005, 39.299995, 44.200005, 38.999992, 44.100002, 39.299995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(12.600006, 40.099995);
((GeneralPath)shape).curveTo(13.000006, 39.999996, 13.7000065, 40.699993, 13.900006, 40.099995);
((GeneralPath)shape).curveTo(13.400006, 40.099995, 13.800006, 39.299995, 13.7000065, 38.999996);
((GeneralPath)shape).curveTo(13.000007, 39.199997, 12.400006, 39.299995, 12.600006, 40.099995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(40.900005, 39.699993);
((GeneralPath)shape).curveTo(40.600006, 39.999992, 41.100006, 40.79999, 40.900005, 41.599995);
((GeneralPath)shape).curveTo(41.500004, 41.799995, 41.500004, 41.299995, 42.000004, 41.399994);
((GeneralPath)shape).curveTo(41.800003, 40.799995, 42.500004, 39.399994, 41.600002, 39.499992);
((GeneralPath)shape).curveTo(41.500004, 39.79999, 41.2, 39.699993, 40.9, 39.699993);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.400005, 42.499992);
((GeneralPath)shape).curveTo(37.900005, 42.399994, 38.300007, 42.29999, 38.700005, 42.09999);
((GeneralPath)shape).curveTo(38.900005, 41.29999, 38.300003, 41.19999, 38.500004, 40.39999);
((GeneralPath)shape).lineTo(37.600002, 40.39999);
((GeneralPath)shape).curveTo(37.300003, 40.69999, 37.500004, 41.69999, 37.4, 42.49999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(64.3, 40.699993);
((GeneralPath)shape).curveTo(62.200005, 40.599995, 61.000004, 40.499992, 58.800003, 40.499992);
((GeneralPath)shape).curveTo(58.300003, 43.899994, 58.800003, 48.29999, 58.300003, 51.699993);
((GeneralPath)shape).curveTo(60.700005, 51.699993, 61.9, 51.79999, 64.100006, 51.999992);
((GeneralPath)shape).moveTo(33.4, 41.6);
((GeneralPath)shape).curveTo(33.9, 41.8, 33.5, 42.8, 33.600002, 43.3);
((GeneralPath)shape).curveTo(34.100002, 43.2, 34.7, 43.1, 35.100002, 42.899998);
((GeneralPath)shape).curveTo(35.7, 40.999996, 34.2, 40.499996, 33.4, 41.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.7, 42.199997);
((GeneralPath)shape).lineTo(28.7, 44.1);
((GeneralPath)shape).curveTo(29.6, 44.3, 29.900002, 43.899998, 30.6, 43.899998);
((GeneralPath)shape).curveTo(30.5, 43.199997, 30.800001, 42.199997, 30.4, 41.8);
((GeneralPath)shape).curveTo(29.9, 42.0, 29.1, 41.899998, 28.699999, 42.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(23.400002, 42.799995);
((GeneralPath)shape).curveTo(23.7, 43.299995, 23.400002, 44.399994, 23.800001, 44.899994);
((GeneralPath)shape).curveTo(24.500002, 44.999992, 24.6, 44.499992, 25.300001, 44.699993);
((GeneralPath)shape).curveTo(25.2, 43.999992, 25.000002, 43.499992, 25.1, 42.599995);
((GeneralPath)shape).curveTo(24.300001, 42.399994, 24.2, 42.899994, 23.4, 42.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.900002, 44.799995);
((GeneralPath)shape).lineTo(17.0, 44.799995);
((GeneralPath)shape).curveTo(17.2, 43.899994, 16.6, 43.599995, 16.8, 42.699997);
((GeneralPath)shape).curveTo(16.4, 42.799995, 15.599999, 42.399998, 15.499999, 42.899998);
((GeneralPath)shape).curveTo(16.099998, 43.1, 15.399999, 44.6, 15.899999, 44.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.300001, 45.799995);
((GeneralPath)shape).curveTo(19.400002, 49.899994, 20.2, 55.099995, 20.7, 59.499996);
((GeneralPath)shape).curveTo(28.7, 59.599995, 33.800003, 56.799995, 39.9, 54.999996);
((GeneralPath)shape).curveTo(39.4, 51.099995, 40.0, 46.299995, 39.2, 42.799995);
((GeneralPath)shape).curveTo(33.0, 44.399994, 27.1, 45.999996, 19.300001, 45.799995);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.800001, 44.999996);
((GeneralPath)shape).lineTo(20.900002, 44.999996);
((GeneralPath)shape).curveTo(21.300001, 44.499996, 20.7, 43.799995, 20.900002, 42.899998);
((GeneralPath)shape).lineTo(19.400002, 42.899998);
((GeneralPath)shape).curveTo(19.500002, 43.6, 19.500002, 44.499996, 19.800001, 44.999996);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(14.400002, 52.799995);
((GeneralPath)shape).curveTo(14.600001, 52.799995, 14.700002, 52.999996, 14.800001, 53.199997);
((GeneralPath)shape).curveTo(14.400002, 52.499996, 14.100001, 53.699997, 14.600001, 53.799995);
((GeneralPath)shape).curveTo(14.700002, 53.599995, 14.600001, 53.399994, 14.800001, 53.399994);
((GeneralPath)shape).curveTo(15.100001, 53.899994, 14.000001, 54.099995, 14.600001, 54.199993);
((GeneralPath)shape).curveTo(15.300001, 53.699993, 15.900002, 52.999992, 17.000002, 52.699993);
((GeneralPath)shape).curveTo(16.900002, 54.199993, 17.400002, 55.099995, 17.400002, 56.499992);
((GeneralPath)shape).curveTo(16.7, 56.999992, 15.700002, 57.199993, 15.500002, 58.199993);
((GeneralPath)shape).curveTo(16.700003, 58.899994, 18.000002, 59.399994, 19.7, 59.499992);
((GeneralPath)shape).curveTo(19.0, 54.59999, 18.6, 50.699993, 18.1, 45.79999);
((GeneralPath)shape).curveTo(15.900001, 46.09999, 14.1, 44.999992, 13.0, 44.89999);
((GeneralPath)shape).curveTo(13.9, 45.69999, 13.6, 47.39999, 13.8, 48.49999);
((GeneralPath)shape).curveTo(13.8, 48.299988, 13.8, 48.099987, 14.0, 48.099987);
((GeneralPath)shape).curveTo(13.9, 48.799988, 14.1, 49.799988, 13.8, 50.199986);
((GeneralPath)shape).curveTo(14.5, 50.499985, 14.3, 49.999985, 14.2, 51.099987);
((GeneralPath)shape).moveTo(58.8, 54.299988);
((GeneralPath)shape).lineTo(59.899998, 54.299988);
((GeneralPath)shape).curveTo(60.199997, 53.99999, 60.1, 53.19999, 60.1, 52.599987);
((GeneralPath)shape).lineTo(58.8, 52.599987);
((GeneralPath)shape).lineTo(58.8, 54.299988);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(54.8, 52.899986);
((GeneralPath)shape).lineTo(54.8, 54.199986);
((GeneralPath)shape).curveTo(55.2, 54.599987, 55.5, 53.999985, 56.3, 54.199986);
((GeneralPath)shape).lineTo(56.3, 52.699986);
((GeneralPath)shape).curveTo(55.7, 52.699986, 55.1, 52.699986, 54.8, 52.899986);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(62.399998, 54.299988);
((GeneralPath)shape).lineTo(63.699997, 54.299988);
((GeneralPath)shape).lineTo(63.699997, 52.799988);
((GeneralPath)shape).lineTo(62.399998, 52.799988);
((GeneralPath)shape).curveTo(62.499996, 53.299988, 62.399998, 53.799988, 62.399998, 54.299988);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(51.399998, 53.299988);
((GeneralPath)shape).lineTo(51.399998, 54.599987);
((GeneralPath)shape).lineTo(52.499996, 54.599987);
((GeneralPath)shape).curveTo(52.799995, 54.299988, 52.899998, 52.899986, 52.299995, 52.899986);
((GeneralPath)shape).curveTo(52.199997, 53.299988, 51.499996, 52.999985, 51.399994, 53.299988);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(47.8, 53.69999);
((GeneralPath)shape).curveTo(47.899998, 54.299988, 47.5, 55.39999, 48.2, 55.39999);
((GeneralPath)shape).curveTo(48.2, 55.09999, 48.7, 55.19999, 49.100002, 55.19999);
((GeneralPath)shape).curveTo(48.9, 54.69999, 49.500004, 53.39999, 48.7, 53.49999);
((GeneralPath)shape).curveTo(48.600002, 53.799988, 48.100002, 53.69999, 47.8, 53.69999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(44.399998, 54.69999);
((GeneralPath)shape).lineTo(44.399998, 56.19999);
((GeneralPath)shape).curveTo(45.1, 56.39999, 44.999996, 55.799988, 45.699997, 55.99999);
((GeneralPath)shape).curveTo(45.499996, 55.49999, 46.1, 54.19999, 45.299995, 54.299988);
((GeneralPath)shape).curveTo(45.199997, 54.599987, 44.499996, 54.49999, 44.399994, 54.69999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(15.0, 57.0);
((GeneralPath)shape).curveTo(15.7, 56.5, 16.3, 55.3, 15.2, 54.7);
((GeneralPath)shape).curveTo(14.5, 55.100002, 14.4, 56.3, 15.0, 57.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(41.1, 55.7);
((GeneralPath)shape).curveTo(41.0, 56.4, 41.5, 56.5, 41.3, 57.2);
((GeneralPath)shape).curveTo(42.2, 57.2, 42.5, 56.600002, 42.399998, 55.5);
((GeneralPath)shape).curveTo(41.999996, 55.0, 41.6, 55.6, 41.1, 55.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(38.1, 58.4);
((GeneralPath)shape).curveTo(39.1, 58.4, 39.3, 57.600002, 39.199997, 56.5);
((GeneralPath)shape).lineTo(38.299995, 56.5);
((GeneralPath)shape).curveTo(37.999996, 56.9, 38.199997, 57.8, 38.099995, 58.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(34.5, 58.0);
((GeneralPath)shape).lineTo(34.5, 59.7);
((GeneralPath)shape).curveTo(35.1, 59.600002, 35.8, 59.5, 36.0, 58.9);
((GeneralPath)shape).curveTo(35.4, 58.9, 36.3, 57.300003, 35.4, 57.600002);
((GeneralPath)shape).curveTo(35.4, 58.000004, 34.7, 57.7, 34.5, 58.000004);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(16.0, 60.8);
((GeneralPath)shape).curveTo(15.6, 60.1, 15.8, 58.8, 14.7, 58.899998);
((GeneralPath)shape).curveTo(14.9, 59.6, 14.9, 61.6, 16.0, 60.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.8, 59.899998);
((GeneralPath)shape).curveTo(30.3, 59.899998, 29.9, 60.8, 30.0, 61.199997);
((GeneralPath)shape).curveTo(30.8, 61.299995, 31.2, 60.999996, 31.7, 60.799995);
((GeneralPath)shape).lineTo(31.7, 59.099995);
((GeneralPath)shape).curveTo(30.800001, 58.999996, 30.1, 59.199993, 29.800001, 59.899994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(25.099998, 60.499996);
((GeneralPath)shape).curveTo(25.099998, 61.299995, 24.999998, 62.199997, 25.499998, 62.399998);
((GeneralPath)shape).curveTo(25.499998, 61.899998, 26.299997, 62.3, 26.599998, 62.199997);
((GeneralPath)shape).curveTo(26.899998, 61.899998, 26.399998, 61.1, 26.599998, 60.299995);
((GeneralPath)shape).curveTo(25.899998, 60.099995, 25.599998, 60.399994, 25.099998, 60.499996);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.0, 62.3);
((GeneralPath)shape).lineTo(19.0, 60.6);
((GeneralPath)shape).curveTo(18.5, 60.6, 18.4, 60.199997, 17.7, 60.399998);
((GeneralPath)shape).curveTo(17.6, 61.499996, 17.7, 62.499996, 19.0, 62.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.5, 62.5);
((GeneralPath)shape).lineTo(22.8, 62.5);
((GeneralPath)shape).curveTo(23.0, 61.6, 22.5, 61.4, 22.599998, 60.6);
((GeneralPath)shape).lineTo(21.3, 60.6);
((GeneralPath)shape).curveTo(21.199999, 61.5, 21.5, 61.8, 21.5, 62.5);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(11.51099967956543, 51.715999603271484), new Point2D.Double(65.21099853515625, 51.715999603271484), new float[] {0.005f,1.0f}, new Color[] {new Color(150, 52, 145, 255),new Color(112, 19, 107, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.26900100708008, 74.20600128173828), new Point2D.Double(58.76900100708008, 87.70600128173828), new float[] {0.0f,0.378f,0.515f,0.612f,0.69f,0.757f,0.817f,0.871f,0.921f,0.965f,1.0f}, new Color[] {new Color(249, 239, 246, 255),new Color(248, 237, 245, 255),new Color(243, 230, 241, 255),new Color(236, 219, 235, 255),new Color(227, 204, 226, 255),new Color(215, 184, 215, 255),new Color(202, 161, 201, 255),new Color(188, 136, 187, 255),new Color(174, 108, 171, 255),new Color(159, 77, 155, 255),new Color(147, 42, 142, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(transformsStack.pop());
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(136, 35, 131, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.2, 1.0);
((GeneralPath)shape).lineTo(72.2, 27.7);
((GeneralPath)shape).lineTo(45.199997, 27.7);
((GeneralPath)shape).lineTo(45.199997, 1.0);
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
        return 0.13199996948242188;
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
	private ext_3g2() {
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
       ext_3g2 base = new ext_3g2();
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
       ext_3g2 base = new ext_3g2();
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
        return ext_3g2::new;
    }
}

