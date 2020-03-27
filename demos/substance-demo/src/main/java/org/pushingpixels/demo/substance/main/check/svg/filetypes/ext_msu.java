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
public class ext_msu implements ResizableIcon {
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
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -952.3619995117188f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
transformsStack.push(g.getTransform());
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.0, 973.4);
((GeneralPath)shape).curveTo(29.9, 973.4, 29.8, 973.4, 29.7, 973.5);
((GeneralPath)shape).lineTo(13.0, 981.1);
((GeneralPath)shape).curveTo(12.5, 981.3, 12.3, 982.1, 12.7, 982.6);
((GeneralPath)shape).lineTo(17.9, 988.69995);
((GeneralPath)shape).lineTo(12.7, 994.69995);
((GeneralPath)shape).curveTo(12.4, 995.1, 12.5, 995.89996, 13.0, 996.19995);
((GeneralPath)shape).lineTo(18.2, 998.6);
((GeneralPath)shape).lineTo(18.2, 1008.69995);
((GeneralPath)shape).curveTo(18.2, 1009.1, 18.400002, 1009.39996, 18.800001, 1009.6);
((GeneralPath)shape).lineTo(35.9, 1017.19995);
((GeneralPath)shape).curveTo(36.100002, 1017.2999, 36.4, 1017.2999, 36.7, 1017.19995);
((GeneralPath)shape).lineTo(53.9, 1009.6);
((GeneralPath)shape).curveTo(54.2, 1009.5, 54.5, 1009.1, 54.5, 1008.69995);
((GeneralPath)shape).lineTo(54.5, 998.6);
((GeneralPath)shape).lineTo(59.7, 996.19995);
((GeneralPath)shape).curveTo(60.2, 995.99994, 60.4, 995.19995, 60.0, 994.69995);
((GeneralPath)shape).lineTo(54.8, 988.69995);
((GeneralPath)shape).lineTo(60.0, 982.6);
((GeneralPath)shape).curveTo(60.4, 982.19995, 60.2, 981.39996, 59.7, 981.1);
((GeneralPath)shape).lineTo(43.0, 973.5);
((GeneralPath)shape).curveTo(42.9, 973.4, 42.7, 973.4, 42.5, 973.4);
((GeneralPath)shape).curveTo(42.3, 973.4, 42.0, 973.5, 41.9, 973.7);
((GeneralPath)shape).lineTo(36.4, 979.60004);
((GeneralPath)shape).lineTo(30.900002, 973.7);
((GeneralPath)shape).curveTo(30.600002, 973.5, 30.300001, 973.3, 30.000002, 973.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.8, 975.5);
((GeneralPath)shape).lineTo(34.6, 980.7);
((GeneralPath)shape).lineTo(19.3, 987.5);
((GeneralPath)shape).lineTo(14.9, 982.3);
((GeneralPath)shape).lineTo(29.8, 975.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.699997, 975.5);
((GeneralPath)shape).lineTo(57.6, 982.3);
((GeneralPath)shape).lineTo(53.199997, 987.5);
((GeneralPath)shape).lineTo(37.899998, 980.7);
((GeneralPath)shape).lineTo(42.699997, 975.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.299995, 982.0);
((GeneralPath)shape).lineTo(51.099995, 988.6);
((GeneralPath)shape).lineTo(36.299995, 995.19995);
((GeneralPath)shape).lineTo(21.499996, 988.6);
((GeneralPath)shape).lineTo(36.299995, 982.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.399996, 989.8);
((GeneralPath)shape).lineTo(34.699997, 996.6);
((GeneralPath)shape).lineTo(29.899998, 1001.8);
((GeneralPath)shape).lineTo(15.0, 995.0);
((GeneralPath)shape).lineTo(19.4, 989.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.199997, 989.8);
((GeneralPath)shape).lineTo(57.6, 995.0);
((GeneralPath)shape).lineTo(42.699997, 1001.8);
((GeneralPath)shape).lineTo(37.899998, 996.6);
((GeneralPath)shape).lineTo(53.199997, 989.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.299995, 998.7);
((GeneralPath)shape).lineTo(35.299995, 1014.8);
((GeneralPath)shape).lineTo(20.0, 1008.0);
((GeneralPath)shape).lineTo(20.0, 999.4);
((GeneralPath)shape).lineTo(29.6, 1003.80005);
((GeneralPath)shape).curveTo(30.0, 1004.00006, 30.4, 1003.9, 30.7, 1003.60004);
((GeneralPath)shape).lineTo(35.3, 998.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.199997, 998.7);
((GeneralPath)shape).lineTo(41.699997, 1003.60004);
((GeneralPath)shape).curveTo(41.999996, 1003.9, 42.399998, 1004.00006, 42.799995, 1003.80005);
((GeneralPath)shape).lineTo(52.399994, 999.4);
((GeneralPath)shape).lineTo(52.399994, 1008.0);
((GeneralPath)shape).lineTo(37.099995, 1014.8);
((GeneralPath)shape).lineTo(37.099995, 998.7);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.275001525878906, 1017.1959838867188), new Point2D.Double(36.275001525878906, 973.3590087890625), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(36.275001525878906, 1017.9459838867188), new Point2D.Double(36.275001525878906, 972.6090087890625), new float[] {0.0f,1.0f}, new Color[] {new Color(173, 204, 220, 255),new Color(76, 108, 123, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(30.0, 973.4);
((GeneralPath)shape).curveTo(29.9, 973.4, 29.8, 973.4, 29.7, 973.5);
((GeneralPath)shape).lineTo(13.0, 981.1);
((GeneralPath)shape).curveTo(12.5, 981.3, 12.3, 982.1, 12.7, 982.6);
((GeneralPath)shape).lineTo(17.9, 988.69995);
((GeneralPath)shape).lineTo(12.7, 994.69995);
((GeneralPath)shape).curveTo(12.4, 995.1, 12.5, 995.89996, 13.0, 996.19995);
((GeneralPath)shape).lineTo(18.2, 998.6);
((GeneralPath)shape).lineTo(18.2, 1008.69995);
((GeneralPath)shape).curveTo(18.2, 1009.1, 18.400002, 1009.39996, 18.800001, 1009.6);
((GeneralPath)shape).lineTo(35.9, 1017.19995);
((GeneralPath)shape).curveTo(36.100002, 1017.2999, 36.4, 1017.2999, 36.7, 1017.19995);
((GeneralPath)shape).lineTo(53.9, 1009.6);
((GeneralPath)shape).curveTo(54.2, 1009.5, 54.5, 1009.1, 54.5, 1008.69995);
((GeneralPath)shape).lineTo(54.5, 998.6);
((GeneralPath)shape).lineTo(59.7, 996.19995);
((GeneralPath)shape).curveTo(60.2, 995.99994, 60.4, 995.19995, 60.0, 994.69995);
((GeneralPath)shape).lineTo(54.8, 988.69995);
((GeneralPath)shape).lineTo(60.0, 982.6);
((GeneralPath)shape).curveTo(60.4, 982.19995, 60.2, 981.39996, 59.7, 981.1);
((GeneralPath)shape).lineTo(43.0, 973.5);
((GeneralPath)shape).curveTo(42.9, 973.4, 42.7, 973.4, 42.5, 973.4);
((GeneralPath)shape).curveTo(42.3, 973.4, 42.0, 973.5, 41.9, 973.7);
((GeneralPath)shape).lineTo(36.4, 979.60004);
((GeneralPath)shape).lineTo(30.900002, 973.7);
((GeneralPath)shape).curveTo(30.600002, 973.5, 30.300001, 973.3, 30.000002, 973.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.8, 975.5);
((GeneralPath)shape).lineTo(34.6, 980.7);
((GeneralPath)shape).lineTo(19.3, 987.5);
((GeneralPath)shape).lineTo(14.9, 982.3);
((GeneralPath)shape).lineTo(29.8, 975.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(42.699997, 975.5);
((GeneralPath)shape).lineTo(57.6, 982.3);
((GeneralPath)shape).lineTo(53.199997, 987.5);
((GeneralPath)shape).lineTo(37.899998, 980.7);
((GeneralPath)shape).lineTo(42.699997, 975.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.299995, 982.0);
((GeneralPath)shape).lineTo(51.099995, 988.6);
((GeneralPath)shape).lineTo(36.299995, 995.19995);
((GeneralPath)shape).lineTo(21.499996, 988.6);
((GeneralPath)shape).lineTo(36.299995, 982.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.399996, 989.8);
((GeneralPath)shape).lineTo(34.699997, 996.6);
((GeneralPath)shape).lineTo(29.899998, 1001.8);
((GeneralPath)shape).lineTo(15.0, 995.0);
((GeneralPath)shape).lineTo(19.4, 989.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.199997, 989.8);
((GeneralPath)shape).lineTo(57.6, 995.0);
((GeneralPath)shape).lineTo(42.699997, 1001.8);
((GeneralPath)shape).lineTo(37.899998, 996.6);
((GeneralPath)shape).lineTo(53.199997, 989.8);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(35.299995, 998.7);
((GeneralPath)shape).lineTo(35.299995, 1014.8);
((GeneralPath)shape).lineTo(20.0, 1008.0);
((GeneralPath)shape).lineTo(20.0, 999.4);
((GeneralPath)shape).lineTo(29.6, 1003.80005);
((GeneralPath)shape).curveTo(30.0, 1004.00006, 30.4, 1003.9, 30.7, 1003.60004);
((GeneralPath)shape).lineTo(35.3, 998.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.199997, 998.7);
((GeneralPath)shape).lineTo(41.699997, 1003.60004);
((GeneralPath)shape).curveTo(41.999996, 1003.9, 42.399998, 1004.00006, 42.799995, 1003.80005);
((GeneralPath)shape).lineTo(52.399994, 999.4);
((GeneralPath)shape).lineTo(52.399994, 1008.0);
((GeneralPath)shape).lineTo(37.099995, 1014.8);
((GeneralPath)shape).lineTo(37.099995, 998.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
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
((GeneralPath)shape).moveTo(8.0, 91.5);
((GeneralPath)shape).lineTo(8.0, 72.2);
((GeneralPath)shape).lineTo(13.9, 72.2);
((GeneralPath)shape).lineTo(17.4, 85.399994);
((GeneralPath)shape).lineTo(20.9, 72.2);
((GeneralPath)shape).lineTo(26.8, 72.2);
((GeneralPath)shape).lineTo(26.8, 91.5);
((GeneralPath)shape).lineTo(23.099998, 91.5);
((GeneralPath)shape).lineTo(23.099998, 76.3);
((GeneralPath)shape).lineTo(19.199999, 91.5);
((GeneralPath)shape).lineTo(15.399999, 91.5);
((GeneralPath)shape).lineTo(11.499998, 76.3);
((GeneralPath)shape).lineTo(11.499998, 91.5);
((GeneralPath)shape).lineTo(8.0, 91.5);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.8, 85.3);
((GeneralPath)shape).lineTo(33.6, 84.9);
((GeneralPath)shape).curveTo(33.8, 86.200005, 34.3, 87.1, 35.0, 87.700005);
((GeneralPath)shape).curveTo(35.7, 88.3, 36.7, 88.600006, 37.9, 88.600006);
((GeneralPath)shape).curveTo(39.2, 88.600006, 40.100002, 88.3, 40.800003, 87.8);
((GeneralPath)shape).curveTo(41.4, 87.3, 41.800003, 86.600006, 41.800003, 85.9);
((GeneralPath)shape).curveTo(41.800003, 85.4, 41.700005, 85.1, 41.4, 84.700005);
((GeneralPath)shape).curveTo(41.100002, 84.4, 40.7, 84.100006, 40.0, 83.9);
((GeneralPath)shape).curveTo(39.5, 83.700005, 38.5, 83.5, 36.8, 83.1);
((GeneralPath)shape).curveTo(34.7, 82.6, 33.2, 81.9, 32.399998, 81.2);
((GeneralPath)shape).curveTo(31.199997, 80.1, 30.599998, 78.799995, 30.599998, 77.299995);
((GeneralPath)shape).curveTo(30.599998, 76.299995, 30.899998, 75.399994, 31.399998, 74.49999);
((GeneralPath)shape).curveTo(31.999998, 73.59999, 32.8, 72.99999, 33.8, 72.49999);
((GeneralPath)shape).curveTo(34.8, 71.99999, 36.1, 71.799995, 37.6, 71.799995);
((GeneralPath)shape).curveTo(40.1, 71.799995, 41.899998, 72.299995, 43.1, 73.399994);
((GeneralPath)shape).curveTo(44.3, 74.49999, 45.0, 75.899994, 45.1, 77.7);
((GeneralPath)shape).lineTo(41.199997, 77.899994);
((GeneralPath)shape).curveTo(40.999996, 76.899994, 40.699997, 76.2, 40.1, 75.799995);
((GeneralPath)shape).curveTo(39.5, 75.399994, 38.699997, 75.1, 37.6, 75.1);
((GeneralPath)shape).curveTo(36.5, 75.1, 35.6, 75.299995, 34.899998, 75.799995);
((GeneralPath)shape).curveTo(34.499996, 76.1, 34.3, 76.49999, 34.3, 76.99999);
((GeneralPath)shape).curveTo(34.3, 77.49999, 34.5, 77.799995, 34.899998, 78.19999);
((GeneralPath)shape).curveTo(35.399998, 78.59999, 36.6, 78.99999, 38.499996, 79.49999);
((GeneralPath)shape).curveTo(40.399998, 79.899994, 41.799995, 80.399994, 42.799995, 80.899994);
((GeneralPath)shape).curveTo(43.699997, 81.399994, 44.399994, 81.99999, 44.999996, 82.899994);
((GeneralPath)shape).curveTo(45.499996, 83.7, 45.799995, 84.799995, 45.799995, 85.99999);
((GeneralPath)shape).curveTo(45.799995, 87.09999, 45.499996, 88.09999, 44.899994, 89.09999);
((GeneralPath)shape).curveTo(44.299995, 90.09999, 43.399994, 90.79999, 42.299995, 91.29999);
((GeneralPath)shape).curveTo(41.199997, 91.79999, 39.699997, 91.999985, 38.099995, 91.999985);
((GeneralPath)shape).curveTo(35.599995, 91.999985, 33.699993, 91.39999, 32.399994, 90.29999);
((GeneralPath)shape).curveTo(30.799994, 89.09999, 29.999994, 87.39999, 29.799994, 85.29999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.9, 72.200005);
((GeneralPath)shape).lineTo(52.800003, 72.200005);
((GeneralPath)shape).lineTo(52.800003, 82.700005);
((GeneralPath)shape).curveTo(52.800003, 84.4, 52.800003, 85.4, 52.9, 85.9);
((GeneralPath)shape).curveTo(53.100002, 86.700005, 53.5, 87.3, 54.100002, 87.8);
((GeneralPath)shape).curveTo(54.700005, 88.3, 55.600002, 88.5, 56.7, 88.5);
((GeneralPath)shape).curveTo(57.8, 88.5, 58.7, 88.3, 59.2, 87.8);
((GeneralPath)shape).curveTo(59.8, 87.3, 60.100002, 86.8, 60.2, 86.100006);
((GeneralPath)shape).curveTo(60.3, 85.40001, 60.4, 84.3, 60.4, 82.8);
((GeneralPath)shape).lineTo(60.4, 72.2);
((GeneralPath)shape).lineTo(64.3, 72.2);
((GeneralPath)shape).lineTo(64.3, 82.399994);
((GeneralPath)shape).curveTo(64.3, 84.7, 64.200005, 86.399994, 64.0, 87.299995);
((GeneralPath)shape).curveTo(63.8, 88.299995, 63.4, 89.1, 62.8, 89.7);
((GeneralPath)shape).curveTo(62.2, 90.399994, 61.5, 90.899994, 60.5, 91.299995);
((GeneralPath)shape).curveTo(59.5, 91.7, 58.3, 91.899994, 56.7, 91.899994);
((GeneralPath)shape).curveTo(54.8, 91.899994, 53.4, 91.7, 52.5, 91.299995);
((GeneralPath)shape).curveTo(51.5, 90.899994, 50.8, 90.299995, 50.2, 89.6);
((GeneralPath)shape).curveTo(49.600002, 88.9, 49.3, 88.2, 49.100002, 87.5);
((GeneralPath)shape).curveTo(48.800003, 86.4, 48.7, 84.8, 48.7, 82.6);
((GeneralPath)shape).lineTo(48.7, 72.2);
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
	private ext_msu() {
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
       ext_msu base = new ext_msu();
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
       ext_msu base = new ext_msu();
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
        return ext_msu::new;
    }
}

