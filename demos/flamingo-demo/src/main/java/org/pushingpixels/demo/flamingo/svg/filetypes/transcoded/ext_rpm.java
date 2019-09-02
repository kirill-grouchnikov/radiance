package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_rpm implements ResizableIcon {
    

    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Shape clip = null;

        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
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
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
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
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.9f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -952.3619995117188f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
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
g.setTransform(defaultTransform__0_2_0);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
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
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
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
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(7.9, 91.5);
((GeneralPath)shape).lineTo(7.9, 72.2);
((GeneralPath)shape).lineTo(16.2, 72.2);
((GeneralPath)shape).curveTo(18.300001, 72.2, 19.800001, 72.399994, 20.7, 72.7);
((GeneralPath)shape).curveTo(21.6, 73.0, 22.400002, 73.7, 23.0, 74.6);
((GeneralPath)shape).curveTo(23.599998, 75.5, 23.9, 76.5, 23.9, 77.6);
((GeneralPath)shape).curveTo(23.9, 79.0, 23.5, 80.2, 22.6, 81.2);
((GeneralPath)shape).curveTo(21.7, 82.1, 20.5, 82.7, 18.7, 83.0);
((GeneralPath)shape).curveTo(19.6, 83.5, 20.300001, 84.0, 20.800001, 84.6);
((GeneralPath)shape).curveTo(21.400002, 85.2, 22.1, 86.2, 23.000002, 87.7);
((GeneralPath)shape).lineTo(25.400002, 91.5);
((GeneralPath)shape).lineTo(20.7, 91.5);
((GeneralPath)shape).lineTo(17.800001, 87.3);
((GeneralPath)shape).curveTo(16.800001, 85.8, 16.1, 84.8, 15.700001, 84.5);
((GeneralPath)shape).curveTo(15.300001, 84.1, 14.900001, 83.8, 14.500001, 83.7);
((GeneralPath)shape).curveTo(14.100001, 83.6, 13.400001, 83.5, 12.500001, 83.5);
((GeneralPath)shape).lineTo(11.700001, 83.5);
((GeneralPath)shape).lineTo(11.700001, 91.6);
((GeneralPath)shape).lineTo(7.9, 91.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(11.9, 80.4);
((GeneralPath)shape).lineTo(14.799999, 80.4);
((GeneralPath)shape).curveTo(16.699999, 80.4, 17.9, 80.3, 18.3, 80.200005);
((GeneralPath)shape).curveTo(18.699999, 80.100006, 19.099998, 79.8, 19.4, 79.4);
((GeneralPath)shape).curveTo(19.699999, 79.0, 19.8, 78.5, 19.8, 77.9);
((GeneralPath)shape).curveTo(19.8, 77.200005, 19.599998, 76.700005, 19.3, 76.3);
((GeneralPath)shape).curveTo(18.9, 75.9, 18.5, 75.600006, 17.8, 75.5);
((GeneralPath)shape).curveTo(17.5, 75.5, 16.5, 75.4, 14.9, 75.4);
((GeneralPath)shape).lineTo(11.799999, 75.4);
((GeneralPath)shape).lineTo(11.799999, 80.4);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(27.599998, 91.5);
((GeneralPath)shape).lineTo(27.599998, 72.2);
((GeneralPath)shape).lineTo(33.899998, 72.2);
((GeneralPath)shape).curveTo(36.3, 72.2, 37.899998, 72.299995, 38.6, 72.5);
((GeneralPath)shape).curveTo(39.699997, 72.8, 40.699997, 73.4, 41.399998, 74.4);
((GeneralPath)shape).curveTo(42.199997, 75.4, 42.499996, 76.6, 42.499996, 78.200005);
((GeneralPath)shape).curveTo(42.499996, 79.4, 42.299995, 80.4, 41.799995, 81.200005);
((GeneralPath)shape).curveTo(41.399994, 82.00001, 40.799995, 82.600006, 40.099995, 83.100006);
((GeneralPath)shape).curveTo(39.399994, 83.600006, 38.699993, 83.90001, 38.099995, 84.00001);
((GeneralPath)shape).curveTo(37.199993, 84.200005, 35.799995, 84.30001, 33.999996, 84.30001);
((GeneralPath)shape).lineTo(31.399996, 84.30001);
((GeneralPath)shape).lineTo(31.399996, 91.60001);
((GeneralPath)shape).lineTo(27.599997, 91.60001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(31.499998, 75.5);
((GeneralPath)shape).lineTo(31.499998, 81.0);
((GeneralPath)shape).lineTo(33.699997, 81.0);
((GeneralPath)shape).curveTo(35.299995, 81.0, 36.299995, 80.9, 36.799995, 80.7);
((GeneralPath)shape).curveTo(37.299995, 80.5, 37.699997, 80.2, 37.999996, 79.799995);
((GeneralPath)shape).curveTo(38.299995, 79.399994, 38.399998, 78.899994, 38.399998, 78.299995);
((GeneralPath)shape).curveTo(38.399998, 77.6, 38.199997, 76.99999, 37.8, 76.6);
((GeneralPath)shape).curveTo(37.399998, 76.1, 36.899998, 75.9, 36.2, 75.7);
((GeneralPath)shape).curveTo(35.7, 75.6, 34.8, 75.6, 33.4, 75.6);
((GeneralPath)shape).lineTo(31.500002, 75.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(45.699997, 91.5);
((GeneralPath)shape).lineTo(45.699997, 72.2);
((GeneralPath)shape).lineTo(51.6, 72.2);
((GeneralPath)shape).lineTo(55.1, 85.399994);
((GeneralPath)shape).lineTo(58.6, 72.2);
((GeneralPath)shape).lineTo(64.5, 72.2);
((GeneralPath)shape).lineTo(64.5, 91.5);
((GeneralPath)shape).lineTo(60.8, 91.5);
((GeneralPath)shape).lineTo(60.8, 76.3);
((GeneralPath)shape).lineTo(56.899998, 91.5);
((GeneralPath)shape).lineTo(53.1, 91.5);
((GeneralPath)shape).lineTo(49.199997, 76.3);
((GeneralPath)shape).lineTo(49.199997, 91.5);
((GeneralPath)shape).lineTo(45.699997, 91.5);
((GeneralPath)shape).closePath();
paint = new Color(76, 108, 123, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_5);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

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
	private ext_rpm() {
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
       ext_rpm base = new ext_rpm();
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
       ext_rpm base = new ext_rpm();
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
        return ext_rpm::new;
    }
}

